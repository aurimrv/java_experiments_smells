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
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (short) 10);
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMax1.aumentaChave((int) (byte) 100, (java.lang.Object) 1.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 100");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test002");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (short) 10);
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
    public void test003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test003");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (short) 10);
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
    public void test004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test004");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (short) 10);
        fPHeapMax1.refaz((int) (short) 1, 0);
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMax1.aumentaChave((int) 'a', (java.lang.Object) 100.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 97");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test005");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (short) 10);
        fPHeapMax1.refaz((int) (short) 1, 0);
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMax1.refaz((int) (byte) -1, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test006");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (short) 10);
        // The following exception was thrown during execution in test generation
        try {
            ds.Item item2 = fPHeapMax1.retiraMax();
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: heap vazio");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
    }

    @Test
    public void test007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test007");
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
    public void test008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test008");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (short) 10);
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
    public void test009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test009");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (short) 10);
        java.lang.Class<?> wildcardClass2 = fPHeapMax1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test010");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) '#');
        fPHeapMax1.imprime();
        fPHeapMax1.constroi();
        // The following exception was thrown during execution in test generation
        try {
            ds.Item item4 = fPHeapMax1.retiraMax();
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: heap vazio");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
    }

    @Test
    public void test011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test011");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) '#');
        fPHeapMax1.imprime();
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMax1.aumentaChave((int) (byte) -1, (java.lang.Object) 100.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test012");
        java.lang.Object obj0 = new java.lang.Object();
        java.lang.Class<?> wildcardClass1 = obj0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test013");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (short) 10);
        fPHeapMax1.refaz((int) (short) 1, 0);
        java.lang.Class<?> wildcardClass5 = fPHeapMax1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test014");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (short) 10);
        ds.Item item2 = fPHeapMax1.max();
        fPHeapMax1.constroi();
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMax1.aumentaChave((-1), (java.lang.Object) 0.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(item2);
    }

    @Test
    public void test015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test015");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (short) 10);
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
    public void test016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test016");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (short) 10);
        fPHeapMax1.refaz((int) (short) 1, 0);
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMax1.aumentaChave((int) ' ', (java.lang.Object) "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 32");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test017");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (short) 10);
        fPHeapMax1.refaz((int) (short) 1, 0);
        ds.Item item5 = fPHeapMax1.max();
        ds.Item item6 = null;
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMax1.insere(item6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(item5);
    }

    @Test
    public void test018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test018");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (short) 10);
        fPHeapMax1.constroi();
        ds.Item item3 = fPHeapMax1.max();
        fPHeapMax1.constroi();
        ds.Item item5 = fPHeapMax1.max();
        // The following exception was thrown during execution in test generation
        try {
            ds.Item item6 = fPHeapMax1.retiraMax();
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: heap vazio");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(item3);
        org.junit.Assert.assertNull(item5);
    }

    @Test
    public void test019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test019");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (short) 0);
        ds.FPHeapMax fPHeapMax3 = new ds.FPHeapMax((int) '#');
        fPHeapMax3.imprime();
        ds.Item item5 = fPHeapMax3.max();
        ds.Item item6 = null;
        ds.Item[] itemArray7 = new ds.Item[] { item6 };
        fPHeapMax3.copia(itemArray7);
        fPHeapMax1.copia(itemArray7);
        java.lang.Class<?> wildcardClass10 = fPHeapMax1.getClass();
        org.junit.Assert.assertNull(item5);
        org.junit.Assert.assertNotNull(itemArray7);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test020");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (short) 10);
        ds.Item item2 = fPHeapMax1.max();
        fPHeapMax1.constroi();
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMax1.aumentaChave((int) (short) -1, (java.lang.Object) (-1.0d));
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(item2);
    }

    @Test
    public void test021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test021");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (short) 10);
        fPHeapMax1.constroi();
        ds.Item item3 = fPHeapMax1.max();
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMax1.refaz((int) 'a', (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 97");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(item3);
    }

    @Test
    public void test022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test022");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMax1.refaz((int) (short) 10, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 10");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test023");
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
    public void test024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test024");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) '#');
        fPHeapMax1.imprime();
        fPHeapMax1.constroi();
        fPHeapMax1.constroi();
        fPHeapMax1.imprime();
        fPHeapMax1.refaz((int) (byte) 1, 1);
        java.lang.Class<?> wildcardClass9 = fPHeapMax1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test025");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (short) 10);
        fPHeapMax1.constroi();
        ds.Item item3 = fPHeapMax1.max();
        fPHeapMax1.constroi();
        ds.Item item5 = fPHeapMax1.max();
        fPHeapMax1.imprime();
        ds.Item item7 = null;
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMax1.insere(item7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(item3);
        org.junit.Assert.assertNull(item5);
    }

    @Test
    public void test026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test026");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (short) 10);
        ds.Item item2 = fPHeapMax1.max();
        fPHeapMax1.constroi();
        fPHeapMax1.constroi();
        java.lang.Class<?> wildcardClass5 = fPHeapMax1.getClass();
        org.junit.Assert.assertNull(item2);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test027");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (short) 0);
        ds.FPHeapMax fPHeapMax3 = new ds.FPHeapMax((int) '#');
        fPHeapMax3.imprime();
        ds.Item item5 = fPHeapMax3.max();
        ds.Item item6 = null;
        ds.Item[] itemArray7 = new ds.Item[] { item6 };
        fPHeapMax3.copia(itemArray7);
        fPHeapMax1.copia(itemArray7);
        ds.Item item10 = null;
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMax1.insere(item10);
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: heap cheio");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(item5);
        org.junit.Assert.assertNotNull(itemArray7);
    }

    @Test
    public void test028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test028");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (short) 10);
        fPHeapMax1.constroi();
        ds.Item item3 = fPHeapMax1.max();
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
        org.junit.Assert.assertNull(item3);
        org.junit.Assert.assertNull(item5);
    }

    @Test
    public void test029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test029");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (short) 10);
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
    public void test030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test030");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax(1);
        ds.FPHeapMax fPHeapMax3 = new ds.FPHeapMax((int) (short) 10);
        fPHeapMax3.constroi();
        ds.Item item5 = fPHeapMax3.max();
        fPHeapMax3.constroi();
        ds.Item item7 = fPHeapMax3.max();
        fPHeapMax3.imprime();
        ds.Item[] itemArray9 = new ds.Item[] {};
        fPHeapMax3.copia(itemArray9);
        fPHeapMax1.copia(itemArray9);
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMax1.aumentaChave((-1), (java.lang.Object) "");
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(item5);
        org.junit.Assert.assertNull(item7);
        org.junit.Assert.assertNotNull(itemArray9);
    }

    @Test
    public void test031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test031");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax(1);
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
    public void test032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test032");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (short) 10);
        fPHeapMax1.constroi();
        ds.Item item3 = fPHeapMax1.max();
        fPHeapMax1.constroi();
        ds.Item item5 = fPHeapMax1.max();
        fPHeapMax1.imprime();
        // The following exception was thrown during execution in test generation
        try {
            ds.Item item7 = fPHeapMax1.retiraMax();
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: heap vazio");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(item3);
        org.junit.Assert.assertNull(item5);
    }

    @Test
    public void test033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test033");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (short) 0);
        ds.FPHeapMax fPHeapMax3 = new ds.FPHeapMax((int) '#');
        fPHeapMax3.imprime();
        ds.Item item5 = fPHeapMax3.max();
        ds.Item item6 = null;
        ds.Item[] itemArray7 = new ds.Item[] { item6 };
        fPHeapMax3.copia(itemArray7);
        fPHeapMax1.copia(itemArray7);
        // The following exception was thrown during execution in test generation
        try {
            ds.Item item10 = fPHeapMax1.max();
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(item5);
        org.junit.Assert.assertNotNull(itemArray7);
    }

    @Test
    public void test034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test034");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (short) 10);
        fPHeapMax1.constroi();
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
        org.junit.Assert.assertNull(item3);
    }

    @Test
    public void test035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test035");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (short) 10);
        ds.Item item2 = fPHeapMax1.max();
        ds.FPHeapMax fPHeapMax5 = new ds.FPHeapMax((int) (short) 10);
        fPHeapMax5.constroi();
        ds.FPHeapMax fPHeapMax8 = new ds.FPHeapMax((int) (short) 10);
        fPHeapMax8.constroi();
        ds.Item item10 = fPHeapMax8.max();
        fPHeapMax8.constroi();
        ds.Item item12 = fPHeapMax8.max();
        fPHeapMax8.imprime();
        ds.Item[] itemArray14 = new ds.Item[] {};
        fPHeapMax8.copia(itemArray14);
        fPHeapMax5.copia(itemArray14);
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMax1.aumentaChave((int) (short) -1, (java.lang.Object) itemArray14);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(item2);
        org.junit.Assert.assertNull(item10);
        org.junit.Assert.assertNull(item12);
        org.junit.Assert.assertNotNull(itemArray14);
    }

    @Test
    public void test036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test036");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (short) 10);
        fPHeapMax1.constroi();
        ds.Item item3 = fPHeapMax1.max();
        fPHeapMax1.constroi();
        ds.Item item5 = fPHeapMax1.max();
        ds.FPHeapMax fPHeapMax7 = new ds.FPHeapMax((int) '#');
        fPHeapMax7.imprime();
        ds.Item item9 = fPHeapMax7.max();
        ds.Item item10 = null;
        ds.Item[] itemArray11 = new ds.Item[] { item10 };
        fPHeapMax7.copia(itemArray11);
        fPHeapMax1.copia(itemArray11);
        // The following exception was thrown during execution in test generation
        try {
            ds.Item item14 = fPHeapMax1.retiraMax();
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: heap vazio");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(item3);
        org.junit.Assert.assertNull(item5);
        org.junit.Assert.assertNull(item9);
        org.junit.Assert.assertNotNull(itemArray11);
    }

    @Test
    public void test037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test037");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (short) 0);
        ds.FPHeapMax fPHeapMax3 = new ds.FPHeapMax((int) '#');
        fPHeapMax3.imprime();
        ds.Item item5 = fPHeapMax3.max();
        ds.Item item6 = null;
        ds.Item[] itemArray7 = new ds.Item[] { item6 };
        fPHeapMax3.copia(itemArray7);
        fPHeapMax1.copia(itemArray7);
        fPHeapMax1.constroi();
        ds.Item item11 = null;
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMax1.insere(item11);
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: heap cheio");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(item5);
        org.junit.Assert.assertNotNull(itemArray7);
    }

    @Test
    public void test038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test038");
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
    public void test039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test039");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax(100);
        ds.Item[] itemArray2 = new ds.Item[] {};
        fPHeapMax1.copia(itemArray2);
        fPHeapMax1.imprime();
        // The following exception was thrown during execution in test generation
        try {
            ds.Item item5 = fPHeapMax1.retiraMax();
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: heap vazio");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray2);
    }

    @Test
    public void test040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test040");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (byte) 0);
        fPHeapMax1.constroi();
        ds.Item item3 = null;
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMax1.insere(item3);
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: heap cheio");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
    }

    @Test
    public void test041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test041");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (short) 10);
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
    public void test042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test042");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (short) 10);
        fPHeapMax1.constroi();
        ds.Item item3 = fPHeapMax1.max();
        fPHeapMax1.imprime();
        fPHeapMax1.refaz(10, (int) (byte) 1);
        ds.Item item8 = null;
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMax1.insere(item8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(item3);
    }

    @Test
    public void test043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test043");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) '#');
        fPHeapMax1.imprime();
        fPHeapMax1.constroi();
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
    public void test044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test044");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (short) 10);
        fPHeapMax1.constroi();
        ds.Item item3 = fPHeapMax1.max();
        fPHeapMax1.imprime();
        ds.Item[] itemArray5 = new ds.Item[] {};
        fPHeapMax1.copia(itemArray5);
        ds.Item item7 = null;
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMax1.insere(item7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(item3);
        org.junit.Assert.assertNotNull(itemArray5);
    }

    @Test
    public void test045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test045");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax(100);
        ds.Item[] itemArray2 = new ds.Item[] {};
        fPHeapMax1.copia(itemArray2);
        java.lang.Class<?> wildcardClass4 = itemArray2.getClass();
        org.junit.Assert.assertNotNull(itemArray2);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test046");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) '#');
        fPHeapMax1.imprime();
        ds.Item item3 = fPHeapMax1.max();
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMax1.aumentaChave(100, (java.lang.Object) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 100");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(item3);
    }

    @Test
    public void test047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test047");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (short) 0);
        ds.FPHeapMax fPHeapMax3 = new ds.FPHeapMax((int) '#');
        fPHeapMax3.imprime();
        ds.Item item5 = fPHeapMax3.max();
        ds.Item item6 = null;
        ds.Item[] itemArray7 = new ds.Item[] { item6 };
        fPHeapMax3.copia(itemArray7);
        fPHeapMax1.copia(itemArray7);
        fPHeapMax1.constroi();
        fPHeapMax1.constroi();
        ds.FPHeapMax fPHeapMax13 = new ds.FPHeapMax((int) (short) 10);
        fPHeapMax13.constroi();
        ds.Item item15 = fPHeapMax13.max();
        fPHeapMax13.constroi();
        ds.Item item17 = fPHeapMax13.max();
        fPHeapMax13.imprime();
        ds.FPHeapMax fPHeapMax20 = new ds.FPHeapMax((int) '#');
        fPHeapMax20.imprime();
        ds.Item item22 = fPHeapMax20.max();
        ds.Item item23 = null;
        ds.Item[] itemArray24 = new ds.Item[] { item23 };
        fPHeapMax20.copia(itemArray24);
        fPHeapMax13.copia(itemArray24);
        fPHeapMax1.copia(itemArray24);
        // The following exception was thrown during execution in test generation
        try {
            ds.Item item28 = fPHeapMax1.max();
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(item5);
        org.junit.Assert.assertNotNull(itemArray7);
        org.junit.Assert.assertNull(item15);
        org.junit.Assert.assertNull(item17);
        org.junit.Assert.assertNull(item22);
        org.junit.Assert.assertNotNull(itemArray24);
    }

    @Test
    public void test048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test048");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (short) 10);
        fPHeapMax1.constroi();
        ds.FPHeapMax fPHeapMax4 = new ds.FPHeapMax((int) (short) 10);
        fPHeapMax4.constroi();
        ds.Item item6 = fPHeapMax4.max();
        fPHeapMax4.constroi();
        ds.Item item8 = fPHeapMax4.max();
        fPHeapMax4.imprime();
        ds.Item[] itemArray10 = new ds.Item[] {};
        fPHeapMax4.copia(itemArray10);
        fPHeapMax1.copia(itemArray10);
        ds.FPHeapMax fPHeapMax15 = new ds.FPHeapMax((int) (short) 0);
        ds.FPHeapMax fPHeapMax17 = new ds.FPHeapMax((int) '#');
        fPHeapMax17.imprime();
        ds.Item item19 = fPHeapMax17.max();
        ds.Item item20 = null;
        ds.Item[] itemArray21 = new ds.Item[] { item20 };
        fPHeapMax17.copia(itemArray21);
        fPHeapMax15.copia(itemArray21);
        fPHeapMax15.constroi();
        fPHeapMax15.constroi();
        ds.FPHeapMax fPHeapMax27 = new ds.FPHeapMax((int) (short) 10);
        fPHeapMax27.constroi();
        ds.Item item29 = fPHeapMax27.max();
        fPHeapMax27.constroi();
        ds.Item item31 = fPHeapMax27.max();
        fPHeapMax27.imprime();
        ds.FPHeapMax fPHeapMax34 = new ds.FPHeapMax((int) '#');
        fPHeapMax34.imprime();
        ds.Item item36 = fPHeapMax34.max();
        ds.Item item37 = null;
        ds.Item[] itemArray38 = new ds.Item[] { item37 };
        fPHeapMax34.copia(itemArray38);
        fPHeapMax27.copia(itemArray38);
        fPHeapMax15.copia(itemArray38);
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMax1.aumentaChave((int) ' ', (java.lang.Object) itemArray38);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 32");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(item6);
        org.junit.Assert.assertNull(item8);
        org.junit.Assert.assertNotNull(itemArray10);
        org.junit.Assert.assertNull(item19);
        org.junit.Assert.assertNotNull(itemArray21);
        org.junit.Assert.assertNull(item29);
        org.junit.Assert.assertNull(item31);
        org.junit.Assert.assertNull(item36);
        org.junit.Assert.assertNotNull(itemArray38);
    }

    @Test
    public void test049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test049");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            ds.Item item2 = fPHeapMax1.max();
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test050");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax(100);
        ds.Item[] itemArray2 = new ds.Item[] {};
        fPHeapMax1.copia(itemArray2);
        fPHeapMax1.imprime();
        ds.Item item5 = null;
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMax1.insere(item5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray2);
    }

    @Test
    public void test051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test051");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (short) 0);
        ds.FPHeapMax fPHeapMax3 = new ds.FPHeapMax((int) '#');
        fPHeapMax3.imprime();
        ds.Item item5 = fPHeapMax3.max();
        ds.Item item6 = null;
        ds.Item[] itemArray7 = new ds.Item[] { item6 };
        fPHeapMax3.copia(itemArray7);
        fPHeapMax1.copia(itemArray7);
        ds.FPHeapMax fPHeapMax12 = new ds.FPHeapMax((int) '#');
        fPHeapMax12.imprime();
        fPHeapMax12.constroi();
        fPHeapMax12.constroi();
        fPHeapMax12.imprime();
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMax1.aumentaChave((int) (byte) 10, (java.lang.Object) fPHeapMax12);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 10");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(item5);
        org.junit.Assert.assertNotNull(itemArray7);
    }

    @Test
    public void test052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test052");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (short) 10);
        ds.Item item2 = fPHeapMax1.max();
        java.lang.Object obj4 = null;
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMax1.aumentaChave((int) (short) 10, obj4);
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: chaveNova com valor null");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(item2);
    }

    @Test
    public void test053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test053");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) '#');
        fPHeapMax1.imprime();
        ds.Item item3 = fPHeapMax1.max();
        ds.Item item4 = null;
        ds.Item[] itemArray5 = new ds.Item[] { item4 };
        fPHeapMax1.copia(itemArray5);
        java.lang.Class<?> wildcardClass7 = fPHeapMax1.getClass();
        org.junit.Assert.assertNull(item3);
        org.junit.Assert.assertNotNull(itemArray5);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test054");
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
    public void test055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test055");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (byte) 100);
        // The following exception was thrown during execution in test generation
        try {
            ds.Item item2 = fPHeapMax1.retiraMax();
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: heap vazio");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
    }

    @Test
    public void test056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test056");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (short) 10);
        fPHeapMax1.constroi();
        ds.Item item3 = fPHeapMax1.max();
        // The following exception was thrown during execution in test generation
        try {
            ds.Item item4 = fPHeapMax1.retiraMax();
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: heap vazio");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(item3);
    }

    @Test
    public void test057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test057");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (short) 0);
        java.lang.Class<?> wildcardClass2 = fPHeapMax1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test058");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (short) 10);
        fPHeapMax1.refaz((int) (short) 1, 0);
        ds.Item item5 = fPHeapMax1.max();
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMax1.refaz((int) (short) 100, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 100");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(item5);
    }

    @Test
    public void test059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test059");
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
    public void test060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test060");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (byte) 100);
        fPHeapMax1.imprime();
        java.lang.Class<?> wildcardClass3 = fPHeapMax1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test061");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (short) 0);
        ds.FPHeapMax fPHeapMax3 = new ds.FPHeapMax((int) '#');
        fPHeapMax3.imprime();
        ds.Item item5 = fPHeapMax3.max();
        ds.Item item6 = null;
        ds.Item[] itemArray7 = new ds.Item[] { item6 };
        fPHeapMax3.copia(itemArray7);
        fPHeapMax1.copia(itemArray7);
        fPHeapMax1.constroi();
        ds.Item[] itemArray11 = null;
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMax1.copia(itemArray11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(item5);
        org.junit.Assert.assertNotNull(itemArray7);
    }

    @Test
    public void test062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test062");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) '#');
        fPHeapMax1.constroi();
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMax1.refaz((int) (byte) 100, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 100");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test063");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (short) 0);
        ds.FPHeapMax fPHeapMax3 = new ds.FPHeapMax((int) '#');
        fPHeapMax3.imprime();
        ds.Item item5 = fPHeapMax3.max();
        ds.Item item6 = null;
        ds.Item[] itemArray7 = new ds.Item[] { item6 };
        fPHeapMax3.copia(itemArray7);
        fPHeapMax1.copia(itemArray7);
        fPHeapMax1.imprime();
        // The following exception was thrown during execution in test generation
        try {
            ds.Item item11 = fPHeapMax1.max();
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(item5);
        org.junit.Assert.assertNotNull(itemArray7);
    }

    @Test
    public void test064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test064");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (short) 0);
        ds.FPHeapMax fPHeapMax3 = new ds.FPHeapMax((int) '#');
        fPHeapMax3.imprime();
        ds.Item item5 = fPHeapMax3.max();
        ds.Item item6 = null;
        ds.Item[] itemArray7 = new ds.Item[] { item6 };
        fPHeapMax3.copia(itemArray7);
        fPHeapMax1.copia(itemArray7);
        fPHeapMax1.constroi();
        fPHeapMax1.constroi();
        ds.FPHeapMax fPHeapMax13 = new ds.FPHeapMax((int) (short) 10);
        fPHeapMax13.constroi();
        ds.Item item15 = fPHeapMax13.max();
        fPHeapMax13.constroi();
        ds.Item item17 = fPHeapMax13.max();
        fPHeapMax13.imprime();
        ds.FPHeapMax fPHeapMax20 = new ds.FPHeapMax((int) '#');
        fPHeapMax20.imprime();
        ds.Item item22 = fPHeapMax20.max();
        ds.Item item23 = null;
        ds.Item[] itemArray24 = new ds.Item[] { item23 };
        fPHeapMax20.copia(itemArray24);
        fPHeapMax13.copia(itemArray24);
        fPHeapMax1.copia(itemArray24);
        java.lang.Class<?> wildcardClass28 = fPHeapMax1.getClass();
        org.junit.Assert.assertNull(item5);
        org.junit.Assert.assertNotNull(itemArray7);
        org.junit.Assert.assertNull(item15);
        org.junit.Assert.assertNull(item17);
        org.junit.Assert.assertNull(item22);
        org.junit.Assert.assertNotNull(itemArray24);
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test065");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (short) 0);
        ds.FPHeapMax fPHeapMax3 = new ds.FPHeapMax((int) '#');
        fPHeapMax3.imprime();
        ds.Item item5 = fPHeapMax3.max();
        ds.Item item6 = null;
        ds.Item[] itemArray7 = new ds.Item[] { item6 };
        fPHeapMax3.copia(itemArray7);
        fPHeapMax1.copia(itemArray7);
        fPHeapMax1.constroi();
        fPHeapMax1.constroi();
        ds.FPHeapMax fPHeapMax13 = new ds.FPHeapMax((int) (short) 10);
        fPHeapMax13.constroi();
        ds.Item item15 = fPHeapMax13.max();
        fPHeapMax13.constroi();
        ds.Item item17 = fPHeapMax13.max();
        fPHeapMax13.imprime();
        ds.FPHeapMax fPHeapMax20 = new ds.FPHeapMax((int) '#');
        fPHeapMax20.imprime();
        ds.Item item22 = fPHeapMax20.max();
        ds.Item item23 = null;
        ds.Item[] itemArray24 = new ds.Item[] { item23 };
        fPHeapMax20.copia(itemArray24);
        fPHeapMax13.copia(itemArray24);
        fPHeapMax1.copia(itemArray24);
        // The following exception was thrown during execution in test generation
        try {
            ds.Item item28 = fPHeapMax1.retiraMax();
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: heap vazio");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(item5);
        org.junit.Assert.assertNotNull(itemArray7);
        org.junit.Assert.assertNull(item15);
        org.junit.Assert.assertNull(item17);
        org.junit.Assert.assertNull(item22);
        org.junit.Assert.assertNotNull(itemArray24);
    }

    @Test
    public void test066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test066");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (short) 10);
        fPHeapMax1.refaz((int) (short) 1, 0);
        fPHeapMax1.imprime();
        ds.FPHeapMax fPHeapMax8 = new ds.FPHeapMax((int) (short) 10);
        fPHeapMax8.constroi();
        ds.Item item10 = fPHeapMax8.max();
        fPHeapMax8.constroi();
        ds.Item item12 = fPHeapMax8.max();
        fPHeapMax8.imprime();
        ds.FPHeapMax fPHeapMax15 = new ds.FPHeapMax((int) '#');
        fPHeapMax15.imprime();
        ds.Item item17 = fPHeapMax15.max();
        ds.Item item18 = null;
        ds.Item[] itemArray19 = new ds.Item[] { item18 };
        fPHeapMax15.copia(itemArray19);
        fPHeapMax8.copia(itemArray19);
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMax1.aumentaChave((int) (short) -1, (java.lang.Object) fPHeapMax8);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(item10);
        org.junit.Assert.assertNull(item12);
        org.junit.Assert.assertNull(item17);
        org.junit.Assert.assertNotNull(itemArray19);
    }

    @Test
    public void test067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test067");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) '#');
        fPHeapMax1.imprime();
        fPHeapMax1.constroi();
        fPHeapMax1.constroi();
        fPHeapMax1.imprime();
        java.lang.Class<?> wildcardClass6 = fPHeapMax1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test068");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (short) 10);
        fPHeapMax1.constroi();
        ds.Item item3 = fPHeapMax1.max();
        fPHeapMax1.imprime();
        // The following exception was thrown during execution in test generation
        try {
            ds.Item item5 = fPHeapMax1.retiraMax();
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: heap vazio");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(item3);
    }

    @Test
    public void test069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test069");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) '#');
        fPHeapMax1.imprime();
        fPHeapMax1.constroi();
        fPHeapMax1.constroi();
        ds.FPHeapMax fPHeapMax6 = new ds.FPHeapMax((int) '#');
        fPHeapMax6.imprime();
        ds.Item item8 = fPHeapMax6.max();
        ds.Item item9 = null;
        ds.Item[] itemArray10 = new ds.Item[] { item9 };
        fPHeapMax6.copia(itemArray10);
        fPHeapMax1.copia(itemArray10);
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMax1.refaz((int) (byte) 1, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(item8);
        org.junit.Assert.assertNotNull(itemArray10);
    }

    @Test
    public void test070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test070");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax(1);
        ds.FPHeapMax fPHeapMax3 = new ds.FPHeapMax((int) (short) 10);
        fPHeapMax3.constroi();
        ds.Item item5 = fPHeapMax3.max();
        fPHeapMax3.constroi();
        ds.Item item7 = fPHeapMax3.max();
        fPHeapMax3.imprime();
        ds.Item[] itemArray9 = new ds.Item[] {};
        fPHeapMax3.copia(itemArray9);
        fPHeapMax1.copia(itemArray9);
        ds.FPHeapMax fPHeapMax14 = new ds.FPHeapMax((int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMax1.aumentaChave(100, (java.lang.Object) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 100");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(item5);
        org.junit.Assert.assertNull(item7);
        org.junit.Assert.assertNotNull(itemArray9);
    }

    @Test
    public void test071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test071");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) '#');
        fPHeapMax1.imprime();
        fPHeapMax1.constroi();
        fPHeapMax1.constroi();
        fPHeapMax1.imprime();
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMax1.refaz((int) 'a', (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 97");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test072");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) '#');
        fPHeapMax1.imprime();
        fPHeapMax1.constroi();
        fPHeapMax1.constroi();
        fPHeapMax1.imprime();
        fPHeapMax1.constroi();
        fPHeapMax1.constroi();
        ds.FPHeapMax fPHeapMax9 = new ds.FPHeapMax((int) (short) 10);
        fPHeapMax9.constroi();
        ds.Item item11 = fPHeapMax9.max();
        fPHeapMax9.constroi();
        ds.Item item13 = fPHeapMax9.max();
        fPHeapMax9.imprime();
        fPHeapMax9.constroi();
        fPHeapMax9.constroi();
        ds.FPHeapMax fPHeapMax18 = new ds.FPHeapMax((int) (short) 10);
        fPHeapMax18.constroi();
        ds.Item item20 = fPHeapMax18.max();
        fPHeapMax18.imprime();
        fPHeapMax18.refaz(10, (int) (byte) 1);
        ds.FPHeapMax fPHeapMax26 = new ds.FPHeapMax(100);
        ds.Item[] itemArray27 = new ds.Item[] {};
        fPHeapMax26.copia(itemArray27);
        fPHeapMax18.copia(itemArray27);
        fPHeapMax9.copia(itemArray27);
        fPHeapMax1.copia(itemArray27);
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMax1.refaz((int) (byte) -1, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(item11);
        org.junit.Assert.assertNull(item13);
        org.junit.Assert.assertNull(item20);
        org.junit.Assert.assertNotNull(itemArray27);
    }

    @Test
    public void test073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test073");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (short) 10);
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMax1.refaz((int) 'a', (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 97");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test074");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) '#');
        fPHeapMax1.imprime();
        fPHeapMax1.constroi();
        fPHeapMax1.constroi();
        fPHeapMax1.imprime();
        fPHeapMax1.refaz((int) (byte) 1, 1);
        ds.FPHeapMax fPHeapMax10 = new ds.FPHeapMax((int) (short) 10);
        fPHeapMax10.constroi();
        ds.Item item12 = fPHeapMax10.max();
        fPHeapMax10.constroi();
        ds.Item item14 = fPHeapMax10.max();
        ds.FPHeapMax fPHeapMax16 = new ds.FPHeapMax((int) '#');
        fPHeapMax16.imprime();
        ds.Item item18 = fPHeapMax16.max();
        ds.Item item19 = null;
        ds.Item[] itemArray20 = new ds.Item[] { item19 };
        fPHeapMax16.copia(itemArray20);
        fPHeapMax10.copia(itemArray20);
        fPHeapMax1.copia(itemArray20);
        ds.Item item24 = fPHeapMax1.max();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass25 = item24.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(item12);
        org.junit.Assert.assertNull(item14);
        org.junit.Assert.assertNull(item18);
        org.junit.Assert.assertNotNull(itemArray20);
        org.junit.Assert.assertNull(item24);
    }

    @Test
    public void test075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test075");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (byte) 100);
        ds.FPHeapMax fPHeapMax3 = new ds.FPHeapMax(1);
        ds.FPHeapMax fPHeapMax5 = new ds.FPHeapMax((int) (short) 10);
        fPHeapMax5.constroi();
        ds.Item item7 = fPHeapMax5.max();
        fPHeapMax5.constroi();
        ds.Item item9 = fPHeapMax5.max();
        fPHeapMax5.imprime();
        ds.Item[] itemArray11 = new ds.Item[] {};
        fPHeapMax5.copia(itemArray11);
        fPHeapMax3.copia(itemArray11);
        fPHeapMax1.copia(itemArray11);
        ds.Item item15 = null;
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMax1.insere(item15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(item7);
        org.junit.Assert.assertNull(item9);
        org.junit.Assert.assertNotNull(itemArray11);
    }

    @Test
    public void test076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test076");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (short) 10);
        fPHeapMax1.constroi();
        ds.Item item3 = fPHeapMax1.max();
        fPHeapMax1.constroi();
        ds.Item item5 = fPHeapMax1.max();
        fPHeapMax1.imprime();
        fPHeapMax1.constroi();
        fPHeapMax1.constroi();
        ds.FPHeapMax fPHeapMax10 = new ds.FPHeapMax((int) (short) 10);
        fPHeapMax10.constroi();
        ds.Item item12 = fPHeapMax10.max();
        fPHeapMax10.imprime();
        fPHeapMax10.refaz(10, (int) (byte) 1);
        ds.FPHeapMax fPHeapMax18 = new ds.FPHeapMax(100);
        ds.Item[] itemArray19 = new ds.Item[] {};
        fPHeapMax18.copia(itemArray19);
        fPHeapMax10.copia(itemArray19);
        fPHeapMax1.copia(itemArray19);
        java.lang.Class<?> wildcardClass23 = fPHeapMax1.getClass();
        org.junit.Assert.assertNull(item3);
        org.junit.Assert.assertNull(item5);
        org.junit.Assert.assertNull(item12);
        org.junit.Assert.assertNotNull(itemArray19);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test077");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (short) 10);
        fPHeapMax1.constroi();
        ds.Item item3 = fPHeapMax1.max();
        fPHeapMax1.constroi();
        ds.Item item5 = fPHeapMax1.max();
        fPHeapMax1.imprime();
        ds.Item[] itemArray7 = new ds.Item[] {};
        fPHeapMax1.copia(itemArray7);
        fPHeapMax1.constroi();
        ds.FPHeapMax fPHeapMax11 = new ds.FPHeapMax(100);
        ds.Item[] itemArray12 = new ds.Item[] {};
        fPHeapMax11.copia(itemArray12);
        fPHeapMax1.copia(itemArray12);
        fPHeapMax1.imprime();
        ds.Item item16 = null;
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMax1.insere(item16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(item3);
        org.junit.Assert.assertNull(item5);
        org.junit.Assert.assertNotNull(itemArray7);
        org.junit.Assert.assertNotNull(itemArray12);
    }

    @Test
    public void test078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test078");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) '#');
        fPHeapMax1.imprime();
        fPHeapMax1.constroi();
        fPHeapMax1.constroi();
        fPHeapMax1.imprime();
        fPHeapMax1.refaz((int) (byte) 1, 1);
        ds.FPHeapMax fPHeapMax10 = new ds.FPHeapMax((int) (short) 10);
        fPHeapMax10.constroi();
        ds.Item item12 = fPHeapMax10.max();
        fPHeapMax10.constroi();
        ds.Item item14 = fPHeapMax10.max();
        ds.FPHeapMax fPHeapMax16 = new ds.FPHeapMax((int) '#');
        fPHeapMax16.imprime();
        ds.Item item18 = fPHeapMax16.max();
        ds.Item item19 = null;
        ds.Item[] itemArray20 = new ds.Item[] { item19 };
        fPHeapMax16.copia(itemArray20);
        fPHeapMax10.copia(itemArray20);
        fPHeapMax1.copia(itemArray20);
        ds.FPHeapMax fPHeapMax25 = new ds.FPHeapMax((int) (short) 10);
        fPHeapMax25.constroi();
        ds.Item item27 = fPHeapMax25.max();
        fPHeapMax25.constroi();
        ds.Item item29 = fPHeapMax25.max();
        fPHeapMax25.imprime();
        ds.FPHeapMax fPHeapMax32 = new ds.FPHeapMax((int) '#');
        fPHeapMax32.imprime();
        ds.Item item34 = fPHeapMax32.max();
        ds.Item item35 = null;
        ds.Item[] itemArray36 = new ds.Item[] { item35 };
        fPHeapMax32.copia(itemArray36);
        fPHeapMax25.copia(itemArray36);
        fPHeapMax1.copia(itemArray36);
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMax1.aumentaChave(100, (java.lang.Object) 0.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 100");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(item12);
        org.junit.Assert.assertNull(item14);
        org.junit.Assert.assertNull(item18);
        org.junit.Assert.assertNotNull(itemArray20);
        org.junit.Assert.assertNull(item27);
        org.junit.Assert.assertNull(item29);
        org.junit.Assert.assertNull(item34);
        org.junit.Assert.assertNotNull(itemArray36);
    }

    @Test
    public void test079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test079");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (short) 10);
        fPHeapMax1.constroi();
        ds.Item item3 = fPHeapMax1.max();
        fPHeapMax1.constroi();
        ds.Item item5 = fPHeapMax1.max();
        fPHeapMax1.imprime();
        ds.Item[] itemArray7 = new ds.Item[] {};
        fPHeapMax1.copia(itemArray7);
        fPHeapMax1.imprime();
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMax1.aumentaChave((int) ' ', (java.lang.Object) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 32");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(item3);
        org.junit.Assert.assertNull(item5);
        org.junit.Assert.assertNotNull(itemArray7);
    }

    @Test
    public void test080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test080");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax(1);
        java.lang.Class<?> wildcardClass2 = fPHeapMax1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test081");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (short) 10);
        fPHeapMax1.constroi();
        ds.Item item3 = fPHeapMax1.max();
        ds.FPHeapMax fPHeapMax6 = new ds.FPHeapMax((int) (short) 10);
        ds.Item item7 = fPHeapMax6.max();
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMax1.aumentaChave((int) (byte) -1, (java.lang.Object) item7);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(item3);
        org.junit.Assert.assertNull(item7);
    }

    @Test
    public void test082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test082");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (short) 10);
        fPHeapMax1.constroi();
        ds.Item item3 = fPHeapMax1.max();
        fPHeapMax1.constroi();
        fPHeapMax1.imprime();
        ds.FPHeapMax fPHeapMax8 = new ds.FPHeapMax((int) (short) 10);
        fPHeapMax8.constroi();
        ds.Item item10 = fPHeapMax8.max();
        fPHeapMax8.constroi();
        java.lang.Class<?> wildcardClass12 = fPHeapMax8.getClass();
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMax1.aumentaChave((-1), (java.lang.Object) wildcardClass12);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(item3);
        org.junit.Assert.assertNull(item10);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test083");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) '#');
        fPHeapMax1.refaz((int) (short) 0, (-1));
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMax1.refaz((int) (byte) -1, (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test084");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (byte) 100);
        fPHeapMax1.imprime();
        fPHeapMax1.imprime();
        java.lang.Class<?> wildcardClass4 = fPHeapMax1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test085");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (short) 10);
        fPHeapMax1.constroi();
        ds.Item item3 = fPHeapMax1.max();
        fPHeapMax1.imprime();
        fPHeapMax1.refaz(10, (int) (byte) 1);
        ds.Item item8 = fPHeapMax1.max();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass9 = item8.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(item3);
        org.junit.Assert.assertNull(item8);
    }

    @Test
    public void test086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test086");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (short) 10);
        fPHeapMax1.constroi();
        ds.Item item3 = fPHeapMax1.max();
        fPHeapMax1.constroi();
        ds.Item item5 = fPHeapMax1.max();
        fPHeapMax1.imprime();
        ds.Item[] itemArray7 = new ds.Item[] {};
        fPHeapMax1.copia(itemArray7);
        fPHeapMax1.constroi();
        ds.FPHeapMax fPHeapMax11 = new ds.FPHeapMax(100);
        ds.Item[] itemArray12 = new ds.Item[] {};
        fPHeapMax11.copia(itemArray12);
        fPHeapMax1.copia(itemArray12);
        fPHeapMax1.imprime();
        java.lang.Class<?> wildcardClass16 = fPHeapMax1.getClass();
        org.junit.Assert.assertNull(item3);
        org.junit.Assert.assertNull(item5);
        org.junit.Assert.assertNotNull(itemArray7);
        org.junit.Assert.assertNotNull(itemArray12);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test087");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (short) 10);
        fPHeapMax1.constroi();
        ds.Item item3 = fPHeapMax1.max();
        fPHeapMax1.imprime();
        java.lang.Class<?> wildcardClass5 = fPHeapMax1.getClass();
        org.junit.Assert.assertNull(item3);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test088");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (short) 10);
        ds.FPHeapMax fPHeapMax3 = new ds.FPHeapMax((int) (short) 0);
        ds.FPHeapMax fPHeapMax5 = new ds.FPHeapMax((int) '#');
        fPHeapMax5.imprime();
        ds.Item item7 = fPHeapMax5.max();
        ds.Item item8 = null;
        ds.Item[] itemArray9 = new ds.Item[] { item8 };
        fPHeapMax5.copia(itemArray9);
        fPHeapMax3.copia(itemArray9);
        fPHeapMax3.constroi();
        fPHeapMax3.constroi();
        ds.FPHeapMax fPHeapMax15 = new ds.FPHeapMax((int) (short) 10);
        fPHeapMax15.constroi();
        ds.Item item17 = fPHeapMax15.max();
        fPHeapMax15.constroi();
        ds.Item item19 = fPHeapMax15.max();
        fPHeapMax15.imprime();
        ds.FPHeapMax fPHeapMax22 = new ds.FPHeapMax((int) '#');
        fPHeapMax22.imprime();
        ds.Item item24 = fPHeapMax22.max();
        ds.Item item25 = null;
        ds.Item[] itemArray26 = new ds.Item[] { item25 };
        fPHeapMax22.copia(itemArray26);
        fPHeapMax15.copia(itemArray26);
        fPHeapMax3.copia(itemArray26);
        fPHeapMax1.copia(itemArray26);
        ds.FPHeapMax fPHeapMax33 = new ds.FPHeapMax((int) '#');
        fPHeapMax33.imprime();
        ds.Item item35 = fPHeapMax33.max();
        fPHeapMax33.constroi();
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMax1.aumentaChave(1, (java.lang.Object) fPHeapMax33);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(item7);
        org.junit.Assert.assertNotNull(itemArray9);
        org.junit.Assert.assertNull(item17);
        org.junit.Assert.assertNull(item19);
        org.junit.Assert.assertNull(item24);
        org.junit.Assert.assertNotNull(itemArray26);
        org.junit.Assert.assertNull(item35);
    }

    @Test
    public void test089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test089");
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
    public void test090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test090");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (short) 10);
        fPHeapMax1.constroi();
        ds.Item item3 = fPHeapMax1.max();
        fPHeapMax1.constroi();
        fPHeapMax1.imprime();
        ds.FPHeapMax fPHeapMax8 = new ds.FPHeapMax((int) '#');
        fPHeapMax8.imprime();
        fPHeapMax8.constroi();
        fPHeapMax8.constroi();
        fPHeapMax8.imprime();
        fPHeapMax8.refaz((int) (byte) 1, 1);
        ds.FPHeapMax fPHeapMax17 = new ds.FPHeapMax((int) (short) 10);
        fPHeapMax17.constroi();
        ds.Item item19 = fPHeapMax17.max();
        fPHeapMax17.constroi();
        ds.Item item21 = fPHeapMax17.max();
        ds.FPHeapMax fPHeapMax23 = new ds.FPHeapMax((int) '#');
        fPHeapMax23.imprime();
        ds.Item item25 = fPHeapMax23.max();
        ds.Item item26 = null;
        ds.Item[] itemArray27 = new ds.Item[] { item26 };
        fPHeapMax23.copia(itemArray27);
        fPHeapMax17.copia(itemArray27);
        fPHeapMax8.copia(itemArray27);
        ds.FPHeapMax fPHeapMax32 = new ds.FPHeapMax((int) (short) 10);
        fPHeapMax32.constroi();
        ds.Item item34 = fPHeapMax32.max();
        fPHeapMax32.constroi();
        ds.Item item36 = fPHeapMax32.max();
        fPHeapMax32.imprime();
        ds.FPHeapMax fPHeapMax39 = new ds.FPHeapMax((int) '#');
        fPHeapMax39.imprime();
        ds.Item item41 = fPHeapMax39.max();
        ds.Item item42 = null;
        ds.Item[] itemArray43 = new ds.Item[] { item42 };
        fPHeapMax39.copia(itemArray43);
        fPHeapMax32.copia(itemArray43);
        fPHeapMax8.copia(itemArray43);
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMax1.aumentaChave((int) '4', (java.lang.Object) itemArray43);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 52");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(item3);
        org.junit.Assert.assertNull(item19);
        org.junit.Assert.assertNull(item21);
        org.junit.Assert.assertNull(item25);
        org.junit.Assert.assertNotNull(itemArray27);
        org.junit.Assert.assertNull(item34);
        org.junit.Assert.assertNull(item36);
        org.junit.Assert.assertNull(item41);
        org.junit.Assert.assertNotNull(itemArray43);
    }

    @Test
    public void test091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test091");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (short) 10);
        fPHeapMax1.refaz((int) (short) 1, 0);
        ds.Item item5 = null;
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMax1.insere(item5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test092");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) '#');
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
    public void test093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test093");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (short) 10);
        fPHeapMax1.constroi();
        ds.Item item3 = fPHeapMax1.max();
        fPHeapMax1.imprime();
        ds.Item[] itemArray5 = new ds.Item[] {};
        fPHeapMax1.copia(itemArray5);
        // The following exception was thrown during execution in test generation
        try {
            ds.Item item7 = fPHeapMax1.retiraMax();
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: heap vazio");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(item3);
        org.junit.Assert.assertNotNull(itemArray5);
    }

    @Test
    public void test094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test094");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (byte) 100);
        fPHeapMax1.imprime();
        ds.FPHeapMax fPHeapMax5 = new ds.FPHeapMax((int) '#');
        fPHeapMax5.imprime();
        fPHeapMax5.constroi();
        fPHeapMax5.constroi();
        fPHeapMax5.imprime();
        fPHeapMax5.constroi();
        fPHeapMax5.constroi();
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMax1.aumentaChave((int) (byte) -1, (java.lang.Object) fPHeapMax5);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test095");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax(100);
        ds.Item[] itemArray2 = new ds.Item[] {};
        fPHeapMax1.copia(itemArray2);
        fPHeapMax1.imprime();
        ds.Item item5 = fPHeapMax1.max();
        // The following exception was thrown during execution in test generation
        try {
            ds.Item item6 = fPHeapMax1.retiraMax();
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: heap vazio");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray2);
        org.junit.Assert.assertNull(item5);
    }

    @Test
    public void test096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test096");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (short) 10);
        fPHeapMax1.constroi();
        ds.Item item3 = fPHeapMax1.max();
        fPHeapMax1.imprime();
        fPHeapMax1.refaz(10, (int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            ds.Item item8 = fPHeapMax1.retiraMax();
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: heap vazio");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(item3);
    }

    @Test
    public void test097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test097");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) '#');
        fPHeapMax1.imprime();
        ds.Item item3 = fPHeapMax1.max();
        ds.Item item4 = null;
        ds.Item[] itemArray5 = new ds.Item[] { item4 };
        fPHeapMax1.copia(itemArray5);
        ds.Item item7 = fPHeapMax1.max();
        java.lang.Object obj9 = null;
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMax1.aumentaChave((int) (byte) 1, obj9);
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: chaveNova com valor null");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(item3);
        org.junit.Assert.assertNotNull(itemArray5);
        org.junit.Assert.assertNull(item7);
    }

    @Test
    public void test098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test098");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (short) 10);
        fPHeapMax1.constroi();
        ds.Item item3 = fPHeapMax1.max();
        fPHeapMax1.constroi();
        ds.Item item5 = fPHeapMax1.max();
        fPHeapMax1.imprime();
        fPHeapMax1.constroi();
        fPHeapMax1.constroi();
        ds.Item item9 = null;
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMax1.insere(item9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(item3);
        org.junit.Assert.assertNull(item5);
    }

    @Test
    public void test099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test099");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (byte) 10);
        fPHeapMax1.imprime();
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMax1.aumentaChave(100, (java.lang.Object) "");
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 100");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test100");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) '#');
        fPHeapMax1.imprime();
        fPHeapMax1.constroi();
        fPHeapMax1.constroi();
        fPHeapMax1.imprime();
        fPHeapMax1.constroi();
        fPHeapMax1.constroi();
        java.lang.Class<?> wildcardClass8 = fPHeapMax1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test101");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (short) 10);
        fPHeapMax1.constroi();
        ds.Item item3 = fPHeapMax1.max();
        fPHeapMax1.constroi();
        fPHeapMax1.imprime();
        fPHeapMax1.constroi();
        // The following exception was thrown during execution in test generation
        try {
            ds.Item item7 = fPHeapMax1.retiraMax();
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: heap vazio");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(item3);
    }

    @Test
    public void test102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test102");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (short) 0);
        ds.FPHeapMax fPHeapMax3 = new ds.FPHeapMax((int) '#');
        fPHeapMax3.imprime();
        ds.Item item5 = fPHeapMax3.max();
        ds.Item item6 = null;
        ds.Item[] itemArray7 = new ds.Item[] { item6 };
        fPHeapMax3.copia(itemArray7);
        fPHeapMax1.copia(itemArray7);
        // The following exception was thrown during execution in test generation
        try {
            ds.Item item10 = fPHeapMax1.retiraMax();
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: heap vazio");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(item5);
        org.junit.Assert.assertNotNull(itemArray7);
    }

    @Test
    public void test103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test103");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax(100);
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
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax(100);
        ds.Item[] itemArray2 = new ds.Item[] {};
        fPHeapMax1.copia(itemArray2);
        fPHeapMax1.imprime();
        fPHeapMax1.refaz((int) (byte) 100, (int) '#');
        ds.Item item8 = fPHeapMax1.max();
        // The following exception was thrown during execution in test generation
        try {
            ds.Item item9 = fPHeapMax1.retiraMax();
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: heap vazio");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray2);
        org.junit.Assert.assertNull(item8);
    }

    @Test
    public void test105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test105");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (short) 10);
        fPHeapMax1.constroi();
        ds.Item item3 = fPHeapMax1.max();
        fPHeapMax1.constroi();
        // The following exception was thrown during execution in test generation
        try {
            ds.Item item5 = fPHeapMax1.retiraMax();
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: heap vazio");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(item3);
    }

    @Test
    public void test106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test106");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax(100);
        ds.Item[] itemArray2 = new ds.Item[] {};
        fPHeapMax1.copia(itemArray2);
        fPHeapMax1.imprime();
        ds.Item item5 = fPHeapMax1.max();
        ds.FPHeapMax fPHeapMax8 = new ds.FPHeapMax((int) '#');
        fPHeapMax8.imprime();
        fPHeapMax8.constroi();
        fPHeapMax8.constroi();
        fPHeapMax8.imprime();
        fPHeapMax8.refaz((int) (byte) 1, 1);
        ds.FPHeapMax fPHeapMax17 = new ds.FPHeapMax((int) (short) 10);
        fPHeapMax17.constroi();
        ds.Item item19 = fPHeapMax17.max();
        fPHeapMax17.constroi();
        ds.Item item21 = fPHeapMax17.max();
        ds.FPHeapMax fPHeapMax23 = new ds.FPHeapMax((int) '#');
        fPHeapMax23.imprime();
        ds.Item item25 = fPHeapMax23.max();
        ds.Item item26 = null;
        ds.Item[] itemArray27 = new ds.Item[] { item26 };
        fPHeapMax23.copia(itemArray27);
        fPHeapMax17.copia(itemArray27);
        fPHeapMax8.copia(itemArray27);
        ds.FPHeapMax fPHeapMax32 = new ds.FPHeapMax((int) (short) 10);
        fPHeapMax32.constroi();
        ds.Item item34 = fPHeapMax32.max();
        fPHeapMax32.constroi();
        ds.Item item36 = fPHeapMax32.max();
        fPHeapMax32.imprime();
        ds.FPHeapMax fPHeapMax39 = new ds.FPHeapMax((int) '#');
        fPHeapMax39.imprime();
        ds.Item item41 = fPHeapMax39.max();
        ds.Item item42 = null;
        ds.Item[] itemArray43 = new ds.Item[] { item42 };
        fPHeapMax39.copia(itemArray43);
        fPHeapMax32.copia(itemArray43);
        fPHeapMax8.copia(itemArray43);
        ds.Item item47 = fPHeapMax8.max();
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMax1.aumentaChave((int) (short) -1, (java.lang.Object) fPHeapMax8);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray2);
        org.junit.Assert.assertNull(item5);
        org.junit.Assert.assertNull(item19);
        org.junit.Assert.assertNull(item21);
        org.junit.Assert.assertNull(item25);
        org.junit.Assert.assertNotNull(itemArray27);
        org.junit.Assert.assertNull(item34);
        org.junit.Assert.assertNull(item36);
        org.junit.Assert.assertNull(item41);
        org.junit.Assert.assertNotNull(itemArray43);
        org.junit.Assert.assertNull(item47);
    }

    @Test
    public void test107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test107");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (short) 0);
        ds.FPHeapMax fPHeapMax3 = new ds.FPHeapMax((int) '#');
        fPHeapMax3.imprime();
        ds.Item item5 = fPHeapMax3.max();
        ds.Item item6 = null;
        ds.Item[] itemArray7 = new ds.Item[] { item6 };
        fPHeapMax3.copia(itemArray7);
        fPHeapMax1.copia(itemArray7);
        fPHeapMax1.constroi();
        fPHeapMax1.constroi();
        ds.FPHeapMax fPHeapMax13 = new ds.FPHeapMax((int) (short) 10);
        fPHeapMax13.constroi();
        ds.Item item15 = fPHeapMax13.max();
        fPHeapMax13.constroi();
        ds.Item item17 = fPHeapMax13.max();
        fPHeapMax13.imprime();
        ds.FPHeapMax fPHeapMax20 = new ds.FPHeapMax((int) '#');
        fPHeapMax20.imprime();
        ds.Item item22 = fPHeapMax20.max();
        ds.Item item23 = null;
        ds.Item[] itemArray24 = new ds.Item[] { item23 };
        fPHeapMax20.copia(itemArray24);
        fPHeapMax13.copia(itemArray24);
        fPHeapMax1.copia(itemArray24);
        ds.FPHeapMax fPHeapMax30 = new ds.FPHeapMax((int) (short) 10);
        fPHeapMax30.constroi();
        ds.Item item32 = fPHeapMax30.max();
        fPHeapMax30.constroi();
        ds.Item item34 = fPHeapMax30.max();
        fPHeapMax30.imprime();
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMax1.aumentaChave((int) (byte) 100, (java.lang.Object) fPHeapMax30);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 100");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(item5);
        org.junit.Assert.assertNotNull(itemArray7);
        org.junit.Assert.assertNull(item15);
        org.junit.Assert.assertNull(item17);
        org.junit.Assert.assertNull(item22);
        org.junit.Assert.assertNotNull(itemArray24);
        org.junit.Assert.assertNull(item32);
        org.junit.Assert.assertNull(item34);
    }

    @Test
    public void test108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test108");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (short) 10);
        fPHeapMax1.constroi();
        ds.FPHeapMax fPHeapMax4 = new ds.FPHeapMax((int) (short) 10);
        fPHeapMax4.constroi();
        ds.Item item6 = fPHeapMax4.max();
        fPHeapMax4.constroi();
        ds.Item item8 = fPHeapMax4.max();
        fPHeapMax4.imprime();
        ds.Item[] itemArray10 = new ds.Item[] {};
        fPHeapMax4.copia(itemArray10);
        fPHeapMax1.copia(itemArray10);
        java.lang.Class<?> wildcardClass13 = itemArray10.getClass();
        org.junit.Assert.assertNull(item6);
        org.junit.Assert.assertNull(item8);
        org.junit.Assert.assertNotNull(itemArray10);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test109");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (short) 10);
        fPHeapMax1.constroi();
        ds.Item item3 = fPHeapMax1.max();
        fPHeapMax1.constroi();
        ds.Item item5 = fPHeapMax1.max();
        fPHeapMax1.imprime();
        ds.Item[] itemArray7 = new ds.Item[] {};
        fPHeapMax1.copia(itemArray7);
        java.lang.Class<?> wildcardClass9 = itemArray7.getClass();
        org.junit.Assert.assertNull(item3);
        org.junit.Assert.assertNull(item5);
        org.junit.Assert.assertNotNull(itemArray7);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test110");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (short) 10);
        fPHeapMax1.constroi();
        ds.Item item3 = fPHeapMax1.max();
        fPHeapMax1.constroi();
        ds.Item item5 = fPHeapMax1.max();
        fPHeapMax1.imprime();
        ds.Item[] itemArray7 = new ds.Item[] {};
        fPHeapMax1.copia(itemArray7);
        fPHeapMax1.refaz((int) (byte) 10, 0);
        java.lang.Class<?> wildcardClass12 = fPHeapMax1.getClass();
        org.junit.Assert.assertNull(item3);
        org.junit.Assert.assertNull(item5);
        org.junit.Assert.assertNotNull(itemArray7);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test111");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) 'a');
        fPHeapMax1.imprime();
        java.lang.Class<?> wildcardClass3 = fPHeapMax1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test112");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) '#');
        fPHeapMax1.imprime();
        fPHeapMax1.constroi();
        fPHeapMax1.constroi();
        fPHeapMax1.imprime();
        fPHeapMax1.constroi();
        fPHeapMax1.constroi();
        ds.FPHeapMax fPHeapMax9 = new ds.FPHeapMax((int) (short) 10);
        fPHeapMax9.constroi();
        ds.Item item11 = fPHeapMax9.max();
        fPHeapMax9.constroi();
        ds.Item item13 = fPHeapMax9.max();
        fPHeapMax9.imprime();
        fPHeapMax9.constroi();
        fPHeapMax9.constroi();
        ds.FPHeapMax fPHeapMax18 = new ds.FPHeapMax((int) (short) 10);
        fPHeapMax18.constroi();
        ds.Item item20 = fPHeapMax18.max();
        fPHeapMax18.imprime();
        fPHeapMax18.refaz(10, (int) (byte) 1);
        ds.FPHeapMax fPHeapMax26 = new ds.FPHeapMax(100);
        ds.Item[] itemArray27 = new ds.Item[] {};
        fPHeapMax26.copia(itemArray27);
        fPHeapMax18.copia(itemArray27);
        fPHeapMax9.copia(itemArray27);
        fPHeapMax1.copia(itemArray27);
        fPHeapMax1.imprime();
        fPHeapMax1.imprime();
        ds.Item item34 = null;
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMax1.insere(item34);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(item11);
        org.junit.Assert.assertNull(item13);
        org.junit.Assert.assertNull(item20);
        org.junit.Assert.assertNotNull(itemArray27);
    }

    @Test
    public void test113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test113");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) '#');
        fPHeapMax1.imprime();
        fPHeapMax1.constroi();
        fPHeapMax1.constroi();
        fPHeapMax1.imprime();
        fPHeapMax1.refaz((int) (byte) 1, 1);
        ds.FPHeapMax fPHeapMax10 = new ds.FPHeapMax((int) (short) 10);
        fPHeapMax10.constroi();
        ds.Item item12 = fPHeapMax10.max();
        fPHeapMax10.constroi();
        ds.Item item14 = fPHeapMax10.max();
        ds.FPHeapMax fPHeapMax16 = new ds.FPHeapMax((int) '#');
        fPHeapMax16.imprime();
        ds.Item item18 = fPHeapMax16.max();
        ds.Item item19 = null;
        ds.Item[] itemArray20 = new ds.Item[] { item19 };
        fPHeapMax16.copia(itemArray20);
        fPHeapMax10.copia(itemArray20);
        fPHeapMax1.copia(itemArray20);
        // The following exception was thrown during execution in test generation
        try {
            ds.Item item24 = fPHeapMax1.retiraMax();
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: heap vazio");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(item12);
        org.junit.Assert.assertNull(item14);
        org.junit.Assert.assertNull(item18);
        org.junit.Assert.assertNotNull(itemArray20);
    }

    @Test
    public void test114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test114");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) '#');
        fPHeapMax1.imprime();
        fPHeapMax1.constroi();
        fPHeapMax1.constroi();
        fPHeapMax1.imprime();
        fPHeapMax1.refaz((int) (byte) 1, 1);
        ds.FPHeapMax fPHeapMax10 = new ds.FPHeapMax((int) (short) 10);
        fPHeapMax10.constroi();
        ds.Item item12 = fPHeapMax10.max();
        fPHeapMax10.constroi();
        ds.Item item14 = fPHeapMax10.max();
        ds.FPHeapMax fPHeapMax16 = new ds.FPHeapMax((int) '#');
        fPHeapMax16.imprime();
        ds.Item item18 = fPHeapMax16.max();
        ds.Item item19 = null;
        ds.Item[] itemArray20 = new ds.Item[] { item19 };
        fPHeapMax16.copia(itemArray20);
        fPHeapMax10.copia(itemArray20);
        fPHeapMax1.copia(itemArray20);
        ds.FPHeapMax fPHeapMax26 = new ds.FPHeapMax((int) '#');
        fPHeapMax26.imprime();
        ds.Item item28 = fPHeapMax26.max();
        fPHeapMax26.constroi();
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMax1.aumentaChave((int) (byte) 10, (java.lang.Object) fPHeapMax26);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(item12);
        org.junit.Assert.assertNull(item14);
        org.junit.Assert.assertNull(item18);
        org.junit.Assert.assertNotNull(itemArray20);
        org.junit.Assert.assertNull(item28);
    }

    @Test
    public void test115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test115");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (byte) 0);
        fPHeapMax1.constroi();
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMax1.refaz(0, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test116");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (short) 10);
        fPHeapMax1.refaz((int) (short) 1, 0);
        fPHeapMax1.imprime();
        fPHeapMax1.imprime();
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMax1.refaz(100, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 100");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test117");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) 'a');
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
    public void test118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test118");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (short) 10);
        ds.FPHeapMax fPHeapMax3 = new ds.FPHeapMax((int) (short) 0);
        ds.FPHeapMax fPHeapMax5 = new ds.FPHeapMax((int) '#');
        fPHeapMax5.imprime();
        ds.Item item7 = fPHeapMax5.max();
        ds.Item item8 = null;
        ds.Item[] itemArray9 = new ds.Item[] { item8 };
        fPHeapMax5.copia(itemArray9);
        fPHeapMax3.copia(itemArray9);
        fPHeapMax3.constroi();
        fPHeapMax3.constroi();
        ds.FPHeapMax fPHeapMax15 = new ds.FPHeapMax((int) (short) 10);
        fPHeapMax15.constroi();
        ds.Item item17 = fPHeapMax15.max();
        fPHeapMax15.constroi();
        ds.Item item19 = fPHeapMax15.max();
        fPHeapMax15.imprime();
        ds.FPHeapMax fPHeapMax22 = new ds.FPHeapMax((int) '#');
        fPHeapMax22.imprime();
        ds.Item item24 = fPHeapMax22.max();
        ds.Item item25 = null;
        ds.Item[] itemArray26 = new ds.Item[] { item25 };
        fPHeapMax22.copia(itemArray26);
        fPHeapMax15.copia(itemArray26);
        fPHeapMax3.copia(itemArray26);
        fPHeapMax1.copia(itemArray26);
        java.lang.Class<?> wildcardClass31 = itemArray26.getClass();
        org.junit.Assert.assertNull(item7);
        org.junit.Assert.assertNotNull(itemArray9);
        org.junit.Assert.assertNull(item17);
        org.junit.Assert.assertNull(item19);
        org.junit.Assert.assertNull(item24);
        org.junit.Assert.assertNotNull(itemArray26);
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test119");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (short) 10);
        fPHeapMax1.constroi();
        ds.Item item3 = fPHeapMax1.max();
        fPHeapMax1.constroi();
        fPHeapMax1.constroi();
        ds.FPHeapMax fPHeapMax7 = new ds.FPHeapMax((int) (short) 10);
        fPHeapMax7.constroi();
        ds.Item item9 = fPHeapMax7.max();
        fPHeapMax7.imprime();
        fPHeapMax7.refaz(10, (int) (byte) 1);
        ds.FPHeapMax fPHeapMax15 = new ds.FPHeapMax(100);
        ds.Item[] itemArray16 = new ds.Item[] {};
        fPHeapMax15.copia(itemArray16);
        fPHeapMax7.copia(itemArray16);
        fPHeapMax1.copia(itemArray16);
        java.lang.Class<?> wildcardClass20 = fPHeapMax1.getClass();
        org.junit.Assert.assertNull(item3);
        org.junit.Assert.assertNull(item9);
        org.junit.Assert.assertNotNull(itemArray16);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test120");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (short) 10);
        fPHeapMax1.constroi();
        ds.Item item3 = fPHeapMax1.max();
        fPHeapMax1.constroi();
        ds.Item item5 = fPHeapMax1.max();
        fPHeapMax1.imprime();
        fPHeapMax1.constroi();
        ds.FPHeapMax fPHeapMax9 = new ds.FPHeapMax((int) '#');
        fPHeapMax9.imprime();
        ds.Item item11 = fPHeapMax9.max();
        ds.Item item12 = null;
        ds.Item[] itemArray13 = new ds.Item[] { item12 };
        fPHeapMax9.copia(itemArray13);
        fPHeapMax1.copia(itemArray13);
        ds.Item item16 = null;
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMax1.insere(item16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(item3);
        org.junit.Assert.assertNull(item5);
        org.junit.Assert.assertNull(item11);
        org.junit.Assert.assertNotNull(itemArray13);
    }

    @Test
    public void test121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test121");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax(100);
        ds.Item[] itemArray2 = new ds.Item[] {};
        fPHeapMax1.copia(itemArray2);
        java.lang.Class<?> wildcardClass4 = fPHeapMax1.getClass();
        org.junit.Assert.assertNotNull(itemArray2);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test122");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (short) 10);
        fPHeapMax1.constroi();
        ds.Item item3 = fPHeapMax1.max();
        fPHeapMax1.constroi();
        ds.Item item5 = fPHeapMax1.max();
        fPHeapMax1.imprime();
        ds.Item[] itemArray7 = new ds.Item[] {};
        fPHeapMax1.copia(itemArray7);
        java.lang.Class<?> wildcardClass9 = fPHeapMax1.getClass();
        org.junit.Assert.assertNull(item3);
        org.junit.Assert.assertNull(item5);
        org.junit.Assert.assertNotNull(itemArray7);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test123");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) '#');
        fPHeapMax1.constroi();
        ds.FPHeapMax fPHeapMax5 = new ds.FPHeapMax((int) '#');
        fPHeapMax5.constroi();
        ds.Item item7 = fPHeapMax5.max();
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMax1.aumentaChave((-1), (java.lang.Object) item7);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(item7);
    }

    @Test
    public void test124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test124");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((-1));
        ds.FPHeapMax fPHeapMax4 = new ds.FPHeapMax((int) (short) 10);
        fPHeapMax4.constroi();
        ds.Item item6 = fPHeapMax4.max();
        fPHeapMax4.constroi();
        ds.Item item8 = fPHeapMax4.max();
        fPHeapMax4.imprime();
        ds.Item[] itemArray10 = new ds.Item[] {};
        fPHeapMax4.copia(itemArray10);
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMax1.aumentaChave(1, (java.lang.Object) itemArray10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(item6);
        org.junit.Assert.assertNull(item8);
        org.junit.Assert.assertNotNull(itemArray10);
    }

    @Test
    public void test125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test125");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (short) 10);
        fPHeapMax1.constroi();
        ds.Item item3 = fPHeapMax1.max();
        fPHeapMax1.constroi();
        fPHeapMax1.refaz((int) (byte) 10, 0);
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMax1.refaz((int) (byte) 100, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 100");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(item3);
    }

    @Test
    public void test126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test126");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (short) 10);
        fPHeapMax1.constroi();
        ds.Item item3 = fPHeapMax1.max();
        fPHeapMax1.constroi();
        ds.Item item5 = fPHeapMax1.max();
        ds.FPHeapMax fPHeapMax7 = new ds.FPHeapMax((int) '#');
        fPHeapMax7.imprime();
        ds.Item item9 = fPHeapMax7.max();
        ds.Item item10 = null;
        ds.Item[] itemArray11 = new ds.Item[] { item10 };
        fPHeapMax7.copia(itemArray11);
        fPHeapMax1.copia(itemArray11);
        fPHeapMax1.imprime();
        ds.Item item15 = null;
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMax1.insere(item15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(item3);
        org.junit.Assert.assertNull(item5);
        org.junit.Assert.assertNull(item9);
        org.junit.Assert.assertNotNull(itemArray11);
    }

    @Test
    public void test127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test127");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) '#');
        fPHeapMax1.imprime();
        fPHeapMax1.constroi();
        fPHeapMax1.constroi();
        fPHeapMax1.imprime();
        fPHeapMax1.constroi();
        fPHeapMax1.constroi();
        ds.Item item8 = fPHeapMax1.max();
        ds.FPHeapMax fPHeapMax10 = new ds.FPHeapMax((int) (byte) 10);
        fPHeapMax10.imprime();
        ds.FPHeapMax fPHeapMax13 = new ds.FPHeapMax(100);
        ds.Item[] itemArray14 = new ds.Item[] {};
        fPHeapMax13.copia(itemArray14);
        fPHeapMax10.copia(itemArray14);
        fPHeapMax1.copia(itemArray14);
        java.lang.Class<?> wildcardClass18 = fPHeapMax1.getClass();
        org.junit.Assert.assertNull(item8);
        org.junit.Assert.assertNotNull(itemArray14);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test128");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (short) 10);
        fPHeapMax1.constroi();
        ds.Item item3 = fPHeapMax1.max();
        fPHeapMax1.imprime();
        fPHeapMax1.constroi();
        ds.FPHeapMax fPHeapMax8 = new ds.FPHeapMax((int) (short) 10);
        fPHeapMax8.constroi();
        ds.Item item10 = fPHeapMax8.max();
        fPHeapMax8.constroi();
        ds.Item item12 = fPHeapMax8.max();
        ds.FPHeapMax fPHeapMax14 = new ds.FPHeapMax((int) '#');
        fPHeapMax14.imprime();
        ds.Item item16 = fPHeapMax14.max();
        ds.Item item17 = null;
        ds.Item[] itemArray18 = new ds.Item[] { item17 };
        fPHeapMax14.copia(itemArray18);
        fPHeapMax8.copia(itemArray18);
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMax1.aumentaChave(10, (java.lang.Object) fPHeapMax8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(item3);
        org.junit.Assert.assertNull(item10);
        org.junit.Assert.assertNull(item12);
        org.junit.Assert.assertNull(item16);
        org.junit.Assert.assertNotNull(itemArray18);
    }

    @Test
    public void test129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test129");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax(100);
        ds.Item[] itemArray2 = new ds.Item[] {};
        fPHeapMax1.copia(itemArray2);
        ds.FPHeapMax fPHeapMax6 = new ds.FPHeapMax((int) (short) 0);
        ds.FPHeapMax fPHeapMax8 = new ds.FPHeapMax((int) '#');
        fPHeapMax8.imprime();
        ds.Item item10 = fPHeapMax8.max();
        ds.Item item11 = null;
        ds.Item[] itemArray12 = new ds.Item[] { item11 };
        fPHeapMax8.copia(itemArray12);
        fPHeapMax6.copia(itemArray12);
        fPHeapMax6.imprime();
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMax1.aumentaChave((int) (short) 1, (java.lang.Object) fPHeapMax6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray2);
        org.junit.Assert.assertNull(item10);
        org.junit.Assert.assertNotNull(itemArray12);
    }

    @Test
    public void test130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test130");
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
    public void test131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test131");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (short) 0);
        fPHeapMax1.imprime();
        ds.Item item3 = null;
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMax1.insere(item3);
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: heap cheio");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
    }

    @Test
    public void test132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test132");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (short) 10);
        fPHeapMax1.constroi();
        ds.Item item3 = fPHeapMax1.max();
        fPHeapMax1.constroi();
        ds.Item item5 = fPHeapMax1.max();
        fPHeapMax1.imprime();
        ds.Item[] itemArray7 = new ds.Item[] {};
        fPHeapMax1.copia(itemArray7);
        fPHeapMax1.constroi();
        ds.FPHeapMax fPHeapMax11 = new ds.FPHeapMax(100);
        ds.Item[] itemArray12 = new ds.Item[] {};
        fPHeapMax11.copia(itemArray12);
        fPHeapMax1.copia(itemArray12);
        // The following exception was thrown during execution in test generation
        try {
            ds.Item item15 = fPHeapMax1.retiraMax();
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: heap vazio");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(item3);
        org.junit.Assert.assertNull(item5);
        org.junit.Assert.assertNotNull(itemArray7);
        org.junit.Assert.assertNotNull(itemArray12);
    }

    @Test
    public void test133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test133");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMax1.refaz((int) 'a', (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 97");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test134");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (short) 10);
        fPHeapMax1.constroi();
        ds.Item item3 = fPHeapMax1.max();
        fPHeapMax1.constroi();
        ds.Item item5 = fPHeapMax1.max();
        fPHeapMax1.imprime();
        ds.Item[] itemArray7 = new ds.Item[] {};
        fPHeapMax1.copia(itemArray7);
        ds.FPHeapMax fPHeapMax11 = new ds.FPHeapMax((int) '#');
        fPHeapMax11.imprime();
        fPHeapMax11.constroi();
        fPHeapMax11.constroi();
        ds.FPHeapMax fPHeapMax16 = new ds.FPHeapMax((int) '#');
        fPHeapMax16.imprime();
        ds.Item item18 = fPHeapMax16.max();
        ds.Item item19 = null;
        ds.Item[] itemArray20 = new ds.Item[] { item19 };
        fPHeapMax16.copia(itemArray20);
        fPHeapMax11.copia(itemArray20);
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMax1.aumentaChave((int) (short) 100, (java.lang.Object) itemArray20);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 100");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(item3);
        org.junit.Assert.assertNull(item5);
        org.junit.Assert.assertNotNull(itemArray7);
        org.junit.Assert.assertNull(item18);
        org.junit.Assert.assertNotNull(itemArray20);
    }

    @Test
    public void test135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test135");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (short) 0);
        ds.FPHeapMax fPHeapMax3 = new ds.FPHeapMax((int) '#');
        fPHeapMax3.imprime();
        ds.Item item5 = fPHeapMax3.max();
        ds.Item item6 = null;
        ds.Item[] itemArray7 = new ds.Item[] { item6 };
        fPHeapMax3.copia(itemArray7);
        fPHeapMax1.copia(itemArray7);
        fPHeapMax1.imprime();
        ds.Item[] itemArray11 = null;
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMax1.copia(itemArray11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(item5);
        org.junit.Assert.assertNotNull(itemArray7);
    }

    @Test
    public void test136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test136");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (short) 10);
        fPHeapMax1.constroi();
        ds.Item item3 = fPHeapMax1.max();
        fPHeapMax1.constroi();
        ds.Item item5 = fPHeapMax1.max();
        fPHeapMax1.imprime();
        ds.Item[] itemArray7 = new ds.Item[] {};
        fPHeapMax1.copia(itemArray7);
        ds.FPHeapMax fPHeapMax11 = new ds.FPHeapMax((int) '#');
        fPHeapMax11.imprime();
        ds.Item item13 = fPHeapMax11.max();
        ds.Item item14 = null;
        ds.Item[] itemArray15 = new ds.Item[] { item14 };
        fPHeapMax11.copia(itemArray15);
        ds.Item item17 = fPHeapMax11.max();
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMax1.aumentaChave(1, (java.lang.Object) fPHeapMax11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(item3);
        org.junit.Assert.assertNull(item5);
        org.junit.Assert.assertNotNull(itemArray7);
        org.junit.Assert.assertNull(item13);
        org.junit.Assert.assertNotNull(itemArray15);
        org.junit.Assert.assertNull(item17);
    }

    @Test
    public void test137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test137");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (short) 10);
        fPHeapMax1.constroi();
        ds.Item item3 = fPHeapMax1.max();
        fPHeapMax1.constroi();
        fPHeapMax1.imprime();
        ds.FPHeapMax fPHeapMax7 = new ds.FPHeapMax((int) '#');
        fPHeapMax7.imprime();
        ds.Item item9 = fPHeapMax7.max();
        ds.Item item10 = null;
        ds.Item[] itemArray11 = new ds.Item[] { item10 };
        fPHeapMax7.copia(itemArray11);
        fPHeapMax1.copia(itemArray11);
        ds.Item item14 = null;
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMax1.insere(item14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(item3);
        org.junit.Assert.assertNull(item9);
        org.junit.Assert.assertNotNull(itemArray11);
    }

    @Test
    public void test138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test138");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (short) 10);
        ds.Item item2 = fPHeapMax1.max();
        fPHeapMax1.constroi();
        fPHeapMax1.constroi();
        ds.FPHeapMax fPHeapMax7 = new ds.FPHeapMax((int) (byte) 100);
        fPHeapMax7.imprime();
        fPHeapMax7.imprime();
        fPHeapMax7.constroi();
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMax1.aumentaChave((int) (byte) -1, (java.lang.Object) fPHeapMax7);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(item2);
    }

    @Test
    public void test139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test139");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (byte) 100);
        fPHeapMax1.imprime();
        ds.FPHeapMax fPHeapMax4 = new ds.FPHeapMax(1);
        ds.FPHeapMax fPHeapMax6 = new ds.FPHeapMax((int) (short) 10);
        fPHeapMax6.constroi();
        ds.Item item8 = fPHeapMax6.max();
        fPHeapMax6.constroi();
        ds.Item item10 = fPHeapMax6.max();
        fPHeapMax6.imprime();
        ds.Item[] itemArray12 = new ds.Item[] {};
        fPHeapMax6.copia(itemArray12);
        fPHeapMax4.copia(itemArray12);
        fPHeapMax1.copia(itemArray12);
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMax1.refaz((int) (short) -1, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(item8);
        org.junit.Assert.assertNull(item10);
        org.junit.Assert.assertNotNull(itemArray12);
    }

    @Test
    public void test140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test140");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (short) 10);
        fPHeapMax1.constroi();
        ds.Item item3 = fPHeapMax1.max();
        fPHeapMax1.imprime();
        fPHeapMax1.constroi();
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMax1.aumentaChave((int) 'a', (java.lang.Object) true);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 97");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(item3);
    }

    @Test
    public void test141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test141");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (short) 10);
        fPHeapMax1.constroi();
        ds.FPHeapMax fPHeapMax4 = new ds.FPHeapMax((int) (short) 10);
        fPHeapMax4.constroi();
        ds.Item item6 = fPHeapMax4.max();
        fPHeapMax4.constroi();
        ds.Item item8 = fPHeapMax4.max();
        fPHeapMax4.imprime();
        ds.Item[] itemArray10 = new ds.Item[] {};
        fPHeapMax4.copia(itemArray10);
        fPHeapMax1.copia(itemArray10);
        ds.Item item13 = null;
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMax1.insere(item13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(item6);
        org.junit.Assert.assertNull(item8);
        org.junit.Assert.assertNotNull(itemArray10);
    }

    @Test
    public void test142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test142");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (short) 10);
        fPHeapMax1.refaz((int) (short) 1, 0);
        ds.Item item5 = fPHeapMax1.max();
        // The following exception was thrown during execution in test generation
        try {
            ds.Item item6 = fPHeapMax1.retiraMax();
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: heap vazio");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(item5);
    }

    @Test
    public void test143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test143");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (byte) 100);
        fPHeapMax1.imprime();
        fPHeapMax1.imprime();
        ds.Item item4 = fPHeapMax1.max();
        ds.Item item5 = null;
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMax1.insere(item5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(item4);
    }

    @Test
    public void test144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test144");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) 'a');
        fPHeapMax1.imprime();
        fPHeapMax1.constroi();
        // The following exception was thrown during execution in test generation
        try {
            ds.Item item4 = fPHeapMax1.retiraMax();
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: heap vazio");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
    }

    @Test
    public void test145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test145");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (short) 10);
        fPHeapMax1.constroi();
        ds.Item item3 = fPHeapMax1.max();
        fPHeapMax1.constroi();
        ds.Item item5 = fPHeapMax1.max();
        fPHeapMax1.imprime();
        fPHeapMax1.constroi();
        fPHeapMax1.constroi();
        ds.FPHeapMax fPHeapMax10 = new ds.FPHeapMax((int) (short) 10);
        fPHeapMax10.constroi();
        ds.Item item12 = fPHeapMax10.max();
        fPHeapMax10.imprime();
        fPHeapMax10.refaz(10, (int) (byte) 1);
        ds.FPHeapMax fPHeapMax18 = new ds.FPHeapMax(100);
        ds.Item[] itemArray19 = new ds.Item[] {};
        fPHeapMax18.copia(itemArray19);
        fPHeapMax10.copia(itemArray19);
        fPHeapMax1.copia(itemArray19);
        ds.Item item23 = null;
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMax1.insere(item23);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(item3);
        org.junit.Assert.assertNull(item5);
        org.junit.Assert.assertNull(item12);
        org.junit.Assert.assertNotNull(itemArray19);
    }

    @Test
    public void test146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test146");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) '#');
        fPHeapMax1.imprime();
        fPHeapMax1.constroi();
        fPHeapMax1.constroi();
        fPHeapMax1.imprime();
        fPHeapMax1.constroi();
        fPHeapMax1.constroi();
        ds.FPHeapMax fPHeapMax9 = new ds.FPHeapMax((int) (short) 10);
        fPHeapMax9.constroi();
        ds.Item item11 = fPHeapMax9.max();
        fPHeapMax9.constroi();
        ds.Item item13 = fPHeapMax9.max();
        fPHeapMax9.imprime();
        fPHeapMax9.constroi();
        fPHeapMax9.constroi();
        ds.FPHeapMax fPHeapMax18 = new ds.FPHeapMax((int) (short) 10);
        fPHeapMax18.constroi();
        ds.Item item20 = fPHeapMax18.max();
        fPHeapMax18.imprime();
        fPHeapMax18.refaz(10, (int) (byte) 1);
        ds.FPHeapMax fPHeapMax26 = new ds.FPHeapMax(100);
        ds.Item[] itemArray27 = new ds.Item[] {};
        fPHeapMax26.copia(itemArray27);
        fPHeapMax18.copia(itemArray27);
        fPHeapMax9.copia(itemArray27);
        fPHeapMax1.copia(itemArray27);
        fPHeapMax1.imprime();
        fPHeapMax1.imprime();
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMax1.refaz((int) (short) -1, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(item11);
        org.junit.Assert.assertNull(item13);
        org.junit.Assert.assertNull(item20);
        org.junit.Assert.assertNotNull(itemArray27);
    }

    @Test
    public void test147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test147");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (short) 10);
        fPHeapMax1.constroi();
        ds.Item item3 = fPHeapMax1.max();
        fPHeapMax1.imprime();
        ds.Item[] itemArray5 = new ds.Item[] {};
        fPHeapMax1.copia(itemArray5);
        ds.Item item7 = fPHeapMax1.max();
        // The following exception was thrown during execution in test generation
        try {
            ds.Item item8 = fPHeapMax1.retiraMax();
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: heap vazio");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(item3);
        org.junit.Assert.assertNotNull(itemArray5);
        org.junit.Assert.assertNull(item7);
    }

    @Test
    public void test148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test148");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (short) 10);
        ds.Item item2 = fPHeapMax1.max();
        fPHeapMax1.constroi();
        fPHeapMax1.constroi();
        fPHeapMax1.constroi();
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMax1.refaz((int) ' ', (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 32");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(item2);
    }

    @Test
    public void test149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test149");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) '#');
        fPHeapMax1.imprime();
        ds.Item item3 = fPHeapMax1.max();
        ds.Item item4 = null;
        ds.Item[] itemArray5 = new ds.Item[] { item4 };
        fPHeapMax1.copia(itemArray5);
        ds.Item item7 = fPHeapMax1.max();
        ds.Item item8 = null;
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMax1.insere(item8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(item3);
        org.junit.Assert.assertNotNull(itemArray5);
        org.junit.Assert.assertNull(item7);
    }

    @Test
    public void test150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test150");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax(10);
        java.lang.Class<?> wildcardClass2 = fPHeapMax1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test151");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) '#');
        fPHeapMax1.imprime();
        fPHeapMax1.constroi();
        fPHeapMax1.constroi();
        fPHeapMax1.imprime();
        fPHeapMax1.constroi();
        fPHeapMax1.constroi();
        // The following exception was thrown during execution in test generation
        try {
            ds.Item item8 = fPHeapMax1.retiraMax();
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: heap vazio");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
    }

    @Test
    public void test152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test152");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) '4');
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMax1.aumentaChave((int) (byte) -1, (java.lang.Object) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test153");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (short) 10);
        fPHeapMax1.constroi();
        ds.Item item3 = fPHeapMax1.max();
        fPHeapMax1.constroi();
        fPHeapMax1.constroi();
        fPHeapMax1.refaz((int) (short) 1, 1);
        // The following exception was thrown during execution in test generation
        try {
            ds.Item item9 = fPHeapMax1.retiraMax();
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: heap vazio");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(item3);
    }

    @Test
    public void test154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test154");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (byte) 10);
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
    public void test155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test155");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax(1);
        ds.FPHeapMax fPHeapMax3 = new ds.FPHeapMax((int) (short) 10);
        fPHeapMax3.constroi();
        ds.Item item5 = fPHeapMax3.max();
        fPHeapMax3.constroi();
        ds.Item item7 = fPHeapMax3.max();
        fPHeapMax3.imprime();
        ds.Item[] itemArray9 = new ds.Item[] {};
        fPHeapMax3.copia(itemArray9);
        fPHeapMax1.copia(itemArray9);
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMax1.refaz((int) (byte) 10, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 10");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(item5);
        org.junit.Assert.assertNull(item7);
        org.junit.Assert.assertNotNull(itemArray9);
    }

    @Test
    public void test156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test156");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) '#');
        fPHeapMax1.imprime();
        ds.Item item3 = fPHeapMax1.max();
        ds.Item item4 = null;
        ds.Item[] itemArray5 = new ds.Item[] { item4 };
        fPHeapMax1.copia(itemArray5);
        ds.Item item7 = fPHeapMax1.max();
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMax1.refaz((-1), (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(item3);
        org.junit.Assert.assertNotNull(itemArray5);
        org.junit.Assert.assertNull(item7);
    }

    @Test
    public void test157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test157");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (short) 10);
        fPHeapMax1.constroi();
        ds.Item item3 = fPHeapMax1.max();
        fPHeapMax1.imprime();
        fPHeapMax1.refaz(10, (int) (byte) 1);
        ds.Item item8 = fPHeapMax1.max();
        ds.Item item9 = null;
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMax1.insere(item9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(item3);
        org.junit.Assert.assertNull(item8);
    }

    @Test
    public void test158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test158");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (short) 10);
        fPHeapMax1.constroi();
        ds.Item item3 = fPHeapMax1.max();
        fPHeapMax1.constroi();
        ds.Item item5 = fPHeapMax1.max();
        ds.FPHeapMax fPHeapMax7 = new ds.FPHeapMax((int) (short) 10);
        fPHeapMax7.constroi();
        ds.FPHeapMax fPHeapMax10 = new ds.FPHeapMax((int) (short) 10);
        fPHeapMax10.constroi();
        ds.Item item12 = fPHeapMax10.max();
        fPHeapMax10.constroi();
        ds.Item item14 = fPHeapMax10.max();
        fPHeapMax10.imprime();
        ds.Item[] itemArray16 = new ds.Item[] {};
        fPHeapMax10.copia(itemArray16);
        fPHeapMax7.copia(itemArray16);
        fPHeapMax1.copia(itemArray16);
        ds.Item item20 = fPHeapMax1.max();
        fPHeapMax1.constroi();
        ds.Item item22 = null;
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMax1.insere(item22);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(item3);
        org.junit.Assert.assertNull(item5);
        org.junit.Assert.assertNull(item12);
        org.junit.Assert.assertNull(item14);
        org.junit.Assert.assertNotNull(itemArray16);
        org.junit.Assert.assertNull(item20);
    }

    @Test
    public void test159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test159");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (short) 10);
        fPHeapMax1.constroi();
        ds.Item item3 = fPHeapMax1.max();
        fPHeapMax1.constroi();
        ds.Item item5 = fPHeapMax1.max();
        ds.FPHeapMax fPHeapMax7 = new ds.FPHeapMax((int) '#');
        fPHeapMax7.imprime();
        ds.Item item9 = fPHeapMax7.max();
        ds.Item item10 = null;
        ds.Item[] itemArray11 = new ds.Item[] { item10 };
        fPHeapMax7.copia(itemArray11);
        fPHeapMax1.copia(itemArray11);
        ds.Item item14 = fPHeapMax1.max();
        ds.Item item15 = null;
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMax1.insere(item15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(item3);
        org.junit.Assert.assertNull(item5);
        org.junit.Assert.assertNull(item9);
        org.junit.Assert.assertNotNull(itemArray11);
        org.junit.Assert.assertNull(item14);
    }

    @Test
    public void test160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test160");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (short) 10);
        ds.Item item2 = fPHeapMax1.max();
        fPHeapMax1.constroi();
        fPHeapMax1.constroi();
        fPHeapMax1.constroi();
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
    public void test161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test161");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (short) -1);
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMax1.refaz((-1), (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test162");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax(10);
        ds.FPHeapMax fPHeapMax3 = new ds.FPHeapMax(1);
        ds.FPHeapMax fPHeapMax5 = new ds.FPHeapMax((int) (short) 10);
        fPHeapMax5.constroi();
        ds.Item item7 = fPHeapMax5.max();
        fPHeapMax5.constroi();
        ds.Item item9 = fPHeapMax5.max();
        fPHeapMax5.imprime();
        ds.Item[] itemArray11 = new ds.Item[] {};
        fPHeapMax5.copia(itemArray11);
        fPHeapMax3.copia(itemArray11);
        fPHeapMax1.copia(itemArray11);
        ds.FPHeapMax fPHeapMax17 = new ds.FPHeapMax(100);
        java.lang.Class<?> wildcardClass18 = fPHeapMax17.getClass();
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMax1.aumentaChave((int) (byte) 100, (java.lang.Object) wildcardClass18);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 100");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(item7);
        org.junit.Assert.assertNull(item9);
        org.junit.Assert.assertNotNull(itemArray11);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test163");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) '4');
        fPHeapMax1.refaz((int) '4', (int) '#');
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMax1.refaz((int) (byte) -1, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test164");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (short) 0);
        ds.FPHeapMax fPHeapMax4 = new ds.FPHeapMax((int) '#');
        fPHeapMax4.imprime();
        fPHeapMax4.constroi();
        fPHeapMax4.constroi();
        fPHeapMax4.imprime();
        fPHeapMax4.refaz((int) (byte) 1, 1);
        ds.FPHeapMax fPHeapMax13 = new ds.FPHeapMax((int) (short) 10);
        fPHeapMax13.constroi();
        ds.Item item15 = fPHeapMax13.max();
        fPHeapMax13.constroi();
        ds.Item item17 = fPHeapMax13.max();
        ds.FPHeapMax fPHeapMax19 = new ds.FPHeapMax((int) '#');
        fPHeapMax19.imprime();
        ds.Item item21 = fPHeapMax19.max();
        ds.Item item22 = null;
        ds.Item[] itemArray23 = new ds.Item[] { item22 };
        fPHeapMax19.copia(itemArray23);
        fPHeapMax13.copia(itemArray23);
        fPHeapMax4.copia(itemArray23);
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMax1.aumentaChave((-1), (java.lang.Object) itemArray23);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(item15);
        org.junit.Assert.assertNull(item17);
        org.junit.Assert.assertNull(item21);
        org.junit.Assert.assertNotNull(itemArray23);
    }

    @Test
    public void test165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test165");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (short) 0);
        fPHeapMax1.imprime();
        java.lang.Class<?> wildcardClass3 = fPHeapMax1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test166");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (short) -1);
        ds.FPHeapMax fPHeapMax4 = new ds.FPHeapMax((int) '#');
        fPHeapMax4.imprime();
        fPHeapMax4.constroi();
        fPHeapMax4.constroi();
        fPHeapMax4.imprime();
        fPHeapMax4.refaz((int) (byte) 1, 1);
        ds.FPHeapMax fPHeapMax13 = new ds.FPHeapMax((int) (short) 10);
        fPHeapMax13.constroi();
        ds.Item item15 = fPHeapMax13.max();
        fPHeapMax13.constroi();
        ds.Item item17 = fPHeapMax13.max();
        ds.FPHeapMax fPHeapMax19 = new ds.FPHeapMax((int) '#');
        fPHeapMax19.imprime();
        ds.Item item21 = fPHeapMax19.max();
        ds.Item item22 = null;
        ds.Item[] itemArray23 = new ds.Item[] { item22 };
        fPHeapMax19.copia(itemArray23);
        fPHeapMax13.copia(itemArray23);
        fPHeapMax4.copia(itemArray23);
        ds.FPHeapMax fPHeapMax28 = new ds.FPHeapMax((int) (short) 10);
        fPHeapMax28.constroi();
        ds.Item item30 = fPHeapMax28.max();
        fPHeapMax28.constroi();
        ds.Item item32 = fPHeapMax28.max();
        fPHeapMax28.imprime();
        ds.FPHeapMax fPHeapMax35 = new ds.FPHeapMax((int) '#');
        fPHeapMax35.imprime();
        ds.Item item37 = fPHeapMax35.max();
        ds.Item item38 = null;
        ds.Item[] itemArray39 = new ds.Item[] { item38 };
        fPHeapMax35.copia(itemArray39);
        fPHeapMax28.copia(itemArray39);
        fPHeapMax4.copia(itemArray39);
        ds.Item item43 = fPHeapMax4.max();
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMax1.aumentaChave(0, (java.lang.Object) fPHeapMax4);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 0");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(item15);
        org.junit.Assert.assertNull(item17);
        org.junit.Assert.assertNull(item21);
        org.junit.Assert.assertNotNull(itemArray23);
        org.junit.Assert.assertNull(item30);
        org.junit.Assert.assertNull(item32);
        org.junit.Assert.assertNull(item37);
        org.junit.Assert.assertNotNull(itemArray39);
        org.junit.Assert.assertNull(item43);
    }

    @Test
    public void test167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test167");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (short) 10);
        fPHeapMax1.constroi();
        ds.Item item3 = fPHeapMax1.max();
        fPHeapMax1.constroi();
        ds.Item item5 = fPHeapMax1.max();
        ds.FPHeapMax fPHeapMax7 = new ds.FPHeapMax((int) (short) 10);
        fPHeapMax7.constroi();
        ds.FPHeapMax fPHeapMax10 = new ds.FPHeapMax((int) (short) 10);
        fPHeapMax10.constroi();
        ds.Item item12 = fPHeapMax10.max();
        fPHeapMax10.constroi();
        ds.Item item14 = fPHeapMax10.max();
        fPHeapMax10.imprime();
        ds.Item[] itemArray16 = new ds.Item[] {};
        fPHeapMax10.copia(itemArray16);
        fPHeapMax7.copia(itemArray16);
        fPHeapMax1.copia(itemArray16);
        ds.FPHeapMax fPHeapMax22 = new ds.FPHeapMax((int) (byte) 10);
        fPHeapMax22.imprime();
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMax1.aumentaChave((int) 'a', (java.lang.Object) fPHeapMax22);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 97");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(item3);
        org.junit.Assert.assertNull(item5);
        org.junit.Assert.assertNull(item12);
        org.junit.Assert.assertNull(item14);
        org.junit.Assert.assertNotNull(itemArray16);
    }

    @Test
    public void test168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test168");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (short) 10);
        fPHeapMax1.constroi();
        ds.Item item3 = fPHeapMax1.max();
        ds.FPHeapMax fPHeapMax6 = new ds.FPHeapMax((int) (short) 10);
        fPHeapMax6.constroi();
        ds.Item item8 = fPHeapMax6.max();
        fPHeapMax6.constroi();
        fPHeapMax6.refaz((int) (byte) 10, 0);
        fPHeapMax6.imprime();
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMax1.aumentaChave((int) ' ', (java.lang.Object) fPHeapMax6);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 32");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(item3);
        org.junit.Assert.assertNull(item8);
    }

    @Test
    public void test169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test169");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (short) 10);
        fPHeapMax1.constroi();
        ds.Item item3 = fPHeapMax1.max();
        fPHeapMax1.constroi();
        ds.Item item5 = fPHeapMax1.max();
        fPHeapMax1.imprime();
        ds.Item[] itemArray7 = new ds.Item[] {};
        fPHeapMax1.copia(itemArray7);
        fPHeapMax1.constroi();
        ds.FPHeapMax fPHeapMax11 = new ds.FPHeapMax(100);
        ds.Item[] itemArray12 = new ds.Item[] {};
        fPHeapMax11.copia(itemArray12);
        fPHeapMax1.copia(itemArray12);
        fPHeapMax1.imprime();
        ds.Item item16 = fPHeapMax1.max();
        // The following exception was thrown during execution in test generation
        try {
            ds.Item item17 = fPHeapMax1.retiraMax();
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: heap vazio");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(item3);
        org.junit.Assert.assertNull(item5);
        org.junit.Assert.assertNotNull(itemArray7);
        org.junit.Assert.assertNotNull(itemArray12);
        org.junit.Assert.assertNull(item16);
    }

    @Test
    public void test170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test170");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (short) 10);
        ds.Item item2 = fPHeapMax1.max();
        fPHeapMax1.constroi();
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
    }

    @Test
    public void test171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test171");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (short) 10);
        fPHeapMax1.constroi();
        ds.Item item3 = fPHeapMax1.max();
        fPHeapMax1.constroi();
        ds.Item item5 = fPHeapMax1.max();
        fPHeapMax1.imprime();
        ds.Item[] itemArray7 = new ds.Item[] {};
        fPHeapMax1.copia(itemArray7);
        fPHeapMax1.refaz((int) (byte) 10, 0);
        ds.FPHeapMax fPHeapMax14 = new ds.FPHeapMax((int) (short) 10);
        fPHeapMax14.constroi();
        ds.Item item16 = fPHeapMax14.max();
        fPHeapMax14.constroi();
        fPHeapMax14.imprime();
        ds.FPHeapMax fPHeapMax20 = new ds.FPHeapMax((int) '#');
        fPHeapMax20.imprime();
        ds.Item item22 = fPHeapMax20.max();
        ds.Item item23 = null;
        ds.Item[] itemArray24 = new ds.Item[] { item23 };
        fPHeapMax20.copia(itemArray24);
        fPHeapMax14.copia(itemArray24);
        ds.FPHeapMax fPHeapMax28 = new ds.FPHeapMax((int) (short) 10);
        fPHeapMax28.constroi();
        ds.Item item30 = fPHeapMax28.max();
        fPHeapMax28.constroi();
        fPHeapMax28.imprime();
        ds.FPHeapMax fPHeapMax34 = new ds.FPHeapMax((int) '#');
        fPHeapMax34.imprime();
        ds.Item item36 = fPHeapMax34.max();
        ds.Item item37 = null;
        ds.Item[] itemArray38 = new ds.Item[] { item37 };
        fPHeapMax34.copia(itemArray38);
        fPHeapMax28.copia(itemArray38);
        fPHeapMax14.copia(itemArray38);
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMax1.aumentaChave((int) (short) 100, (java.lang.Object) itemArray38);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 100");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(item3);
        org.junit.Assert.assertNull(item5);
        org.junit.Assert.assertNotNull(itemArray7);
        org.junit.Assert.assertNull(item16);
        org.junit.Assert.assertNull(item22);
        org.junit.Assert.assertNotNull(itemArray24);
        org.junit.Assert.assertNull(item30);
        org.junit.Assert.assertNull(item36);
        org.junit.Assert.assertNotNull(itemArray38);
    }

    @Test
    public void test172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test172");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (short) 10);
        fPHeapMax1.constroi();
        ds.Item item3 = fPHeapMax1.max();
        fPHeapMax1.constroi();
        ds.Item item5 = fPHeapMax1.max();
        ds.FPHeapMax fPHeapMax7 = new ds.FPHeapMax((int) '#');
        fPHeapMax7.imprime();
        ds.Item item9 = fPHeapMax7.max();
        ds.Item item10 = null;
        ds.Item[] itemArray11 = new ds.Item[] { item10 };
        fPHeapMax7.copia(itemArray11);
        fPHeapMax1.copia(itemArray11);
        ds.Item item14 = fPHeapMax1.max();
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMax1.refaz(1, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(item3);
        org.junit.Assert.assertNull(item5);
        org.junit.Assert.assertNull(item9);
        org.junit.Assert.assertNotNull(itemArray11);
        org.junit.Assert.assertNull(item14);
    }

    @Test
    public void test173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test173");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (byte) 100);
        fPHeapMax1.imprime();
        fPHeapMax1.imprime();
        ds.Item item4 = fPHeapMax1.max();
        // The following exception was thrown during execution in test generation
        try {
            ds.Item item5 = fPHeapMax1.retiraMax();
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: heap vazio");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(item4);
    }

    @Test
    public void test174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test174");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (short) 10);
        fPHeapMax1.constroi();
        ds.Item item3 = fPHeapMax1.max();
        fPHeapMax1.constroi();
        fPHeapMax1.constroi();
        fPHeapMax1.refaz((int) (short) 1, 1);
        java.lang.Object obj10 = null;
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMax1.aumentaChave((int) (short) 10, obj10);
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: chaveNova com valor null");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(item3);
    }

    @Test
    public void test175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test175");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (short) 10);
        fPHeapMax1.constroi();
        ds.Item item3 = fPHeapMax1.max();
        fPHeapMax1.imprime();
        fPHeapMax1.refaz(10, (int) (byte) 1);
        fPHeapMax1.imprime();
        // The following exception was thrown during execution in test generation
        try {
            ds.Item item9 = fPHeapMax1.retiraMax();
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: heap vazio");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(item3);
    }

    @Test
    public void test176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test176");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (short) 10);
        fPHeapMax1.constroi();
        ds.Item item3 = fPHeapMax1.max();
        fPHeapMax1.imprime();
        fPHeapMax1.refaz(10, (int) (byte) 1);
        ds.FPHeapMax fPHeapMax9 = new ds.FPHeapMax(100);
        ds.Item[] itemArray10 = new ds.Item[] {};
        fPHeapMax9.copia(itemArray10);
        fPHeapMax1.copia(itemArray10);
        ds.Item item13 = fPHeapMax1.max();
        ds.Item item14 = null;
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMax1.insere(item14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(item3);
        org.junit.Assert.assertNotNull(itemArray10);
        org.junit.Assert.assertNull(item13);
    }

    @Test
    public void test177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test177");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) '#');
        fPHeapMax1.imprime();
        fPHeapMax1.constroi();
        fPHeapMax1.constroi();
        fPHeapMax1.imprime();
        fPHeapMax1.constroi();
        fPHeapMax1.constroi();
        ds.FPHeapMax fPHeapMax9 = new ds.FPHeapMax((int) (short) 10);
        fPHeapMax9.constroi();
        ds.Item item11 = fPHeapMax9.max();
        fPHeapMax9.constroi();
        ds.Item item13 = fPHeapMax9.max();
        fPHeapMax9.imprime();
        fPHeapMax9.constroi();
        fPHeapMax9.constroi();
        ds.FPHeapMax fPHeapMax18 = new ds.FPHeapMax((int) (short) 10);
        fPHeapMax18.constroi();
        ds.Item item20 = fPHeapMax18.max();
        fPHeapMax18.imprime();
        fPHeapMax18.refaz(10, (int) (byte) 1);
        ds.FPHeapMax fPHeapMax26 = new ds.FPHeapMax(100);
        ds.Item[] itemArray27 = new ds.Item[] {};
        fPHeapMax26.copia(itemArray27);
        fPHeapMax18.copia(itemArray27);
        fPHeapMax9.copia(itemArray27);
        fPHeapMax1.copia(itemArray27);
        fPHeapMax1.imprime();
        fPHeapMax1.constroi();
        fPHeapMax1.refaz((int) (byte) 1, 0);
        org.junit.Assert.assertNull(item11);
        org.junit.Assert.assertNull(item13);
        org.junit.Assert.assertNull(item20);
        org.junit.Assert.assertNotNull(itemArray27);
    }

    @Test
    public void test178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test178");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) '#');
        fPHeapMax1.imprime();
        fPHeapMax1.constroi();
        fPHeapMax1.constroi();
        fPHeapMax1.imprime();
        ds.FPHeapMax fPHeapMax7 = new ds.FPHeapMax((int) (byte) 100);
        ds.FPHeapMax fPHeapMax9 = new ds.FPHeapMax(1);
        ds.FPHeapMax fPHeapMax11 = new ds.FPHeapMax((int) (short) 10);
        fPHeapMax11.constroi();
        ds.Item item13 = fPHeapMax11.max();
        fPHeapMax11.constroi();
        ds.Item item15 = fPHeapMax11.max();
        fPHeapMax11.imprime();
        ds.Item[] itemArray17 = new ds.Item[] {};
        fPHeapMax11.copia(itemArray17);
        fPHeapMax9.copia(itemArray17);
        fPHeapMax7.copia(itemArray17);
        fPHeapMax1.copia(itemArray17);
        fPHeapMax1.constroi();
        ds.FPHeapMax fPHeapMax25 = new ds.FPHeapMax((int) (short) 10);
        fPHeapMax25.constroi();
        ds.Item item27 = fPHeapMax25.max();
        fPHeapMax25.constroi();
        ds.Item item29 = fPHeapMax25.max();
        ds.FPHeapMax fPHeapMax31 = new ds.FPHeapMax((int) '#');
        fPHeapMax31.imprime();
        ds.Item item33 = fPHeapMax31.max();
        ds.Item item34 = null;
        ds.Item[] itemArray35 = new ds.Item[] { item34 };
        fPHeapMax31.copia(itemArray35);
        fPHeapMax25.copia(itemArray35);
        ds.Item item38 = fPHeapMax25.max();
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMax1.aumentaChave((int) 'a', (java.lang.Object) fPHeapMax25);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 97");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(item13);
        org.junit.Assert.assertNull(item15);
        org.junit.Assert.assertNotNull(itemArray17);
        org.junit.Assert.assertNull(item27);
        org.junit.Assert.assertNull(item29);
        org.junit.Assert.assertNull(item33);
        org.junit.Assert.assertNotNull(itemArray35);
        org.junit.Assert.assertNull(item38);
    }

    @Test
    public void test179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test179");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (short) 10);
        fPHeapMax1.refaz((int) (short) 1, 0);
        fPHeapMax1.imprime();
        // The following exception was thrown during execution in test generation
        try {
            ds.Item item6 = fPHeapMax1.retiraMax();
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: heap vazio");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
    }

    @Test
    public void test180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test180");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (byte) 10);
        fPHeapMax1.imprime();
        ds.FPHeapMax fPHeapMax4 = new ds.FPHeapMax(100);
        ds.Item[] itemArray5 = new ds.Item[] {};
        fPHeapMax4.copia(itemArray5);
        fPHeapMax1.copia(itemArray5);
        ds.FPHeapMax fPHeapMax9 = new ds.FPHeapMax(100);
        ds.Item[] itemArray10 = new ds.Item[] {};
        fPHeapMax9.copia(itemArray10);
        ds.FPHeapMax fPHeapMax13 = new ds.FPHeapMax((int) (short) 10);
        fPHeapMax13.constroi();
        ds.Item item15 = fPHeapMax13.max();
        fPHeapMax13.constroi();
        ds.Item item17 = fPHeapMax13.max();
        fPHeapMax13.imprime();
        ds.Item[] itemArray19 = new ds.Item[] {};
        fPHeapMax13.copia(itemArray19);
        fPHeapMax13.constroi();
        ds.FPHeapMax fPHeapMax23 = new ds.FPHeapMax(100);
        ds.Item[] itemArray24 = new ds.Item[] {};
        fPHeapMax23.copia(itemArray24);
        fPHeapMax13.copia(itemArray24);
        fPHeapMax9.copia(itemArray24);
        fPHeapMax1.copia(itemArray24);
        ds.FPHeapMax fPHeapMax31 = new ds.FPHeapMax((int) '#');
        fPHeapMax31.imprime();
        fPHeapMax31.constroi();
        fPHeapMax31.constroi();
        fPHeapMax31.imprime();
        fPHeapMax31.refaz((int) (byte) 1, 1);
        ds.FPHeapMax fPHeapMax40 = new ds.FPHeapMax((int) '#');
        fPHeapMax40.imprime();
        fPHeapMax40.constroi();
        fPHeapMax40.constroi();
        ds.FPHeapMax fPHeapMax45 = new ds.FPHeapMax((int) '#');
        fPHeapMax45.imprime();
        ds.Item item47 = fPHeapMax45.max();
        ds.Item item48 = null;
        ds.Item[] itemArray49 = new ds.Item[] { item48 };
        fPHeapMax45.copia(itemArray49);
        fPHeapMax40.copia(itemArray49);
        fPHeapMax31.copia(itemArray49);
        java.lang.Class<?> wildcardClass53 = fPHeapMax31.getClass();
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMax1.aumentaChave((int) (short) 1, (java.lang.Object) fPHeapMax31);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray5);
        org.junit.Assert.assertNotNull(itemArray10);
        org.junit.Assert.assertNull(item15);
        org.junit.Assert.assertNull(item17);
        org.junit.Assert.assertNotNull(itemArray19);
        org.junit.Assert.assertNotNull(itemArray24);
        org.junit.Assert.assertNull(item47);
        org.junit.Assert.assertNotNull(itemArray49);
        org.junit.Assert.assertNotNull(wildcardClass53);
    }

    @Test
    public void test181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test181");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (byte) 100);
        ds.FPHeapMax fPHeapMax3 = new ds.FPHeapMax(1);
        ds.FPHeapMax fPHeapMax5 = new ds.FPHeapMax((int) (short) 10);
        fPHeapMax5.constroi();
        ds.Item item7 = fPHeapMax5.max();
        fPHeapMax5.constroi();
        ds.Item item9 = fPHeapMax5.max();
        fPHeapMax5.imprime();
        ds.Item[] itemArray11 = new ds.Item[] {};
        fPHeapMax5.copia(itemArray11);
        fPHeapMax3.copia(itemArray11);
        fPHeapMax1.copia(itemArray11);
        ds.Item item15 = fPHeapMax1.max();
        fPHeapMax1.imprime();
        fPHeapMax1.imprime();
        java.lang.Class<?> wildcardClass18 = fPHeapMax1.getClass();
        org.junit.Assert.assertNull(item7);
        org.junit.Assert.assertNull(item9);
        org.junit.Assert.assertNotNull(itemArray11);
        org.junit.Assert.assertNull(item15);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test182");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            ds.Item item2 = fPHeapMax1.retiraMax();
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: heap vazio");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
    }

    @Test
    public void test183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test183");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (short) -1);
        // The following exception was thrown during execution in test generation
        try {
            ds.Item item2 = fPHeapMax1.retiraMax();
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: heap vazio");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
    }

    @Test
    public void test184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test184");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (short) 10);
        fPHeapMax1.constroi();
        ds.Item item3 = fPHeapMax1.max();
        fPHeapMax1.constroi();
        ds.Item item5 = fPHeapMax1.max();
        fPHeapMax1.imprime();
        fPHeapMax1.constroi();
        fPHeapMax1.constroi();
        fPHeapMax1.refaz((int) (short) 10, (-1));
        fPHeapMax1.imprime();
        java.lang.Class<?> wildcardClass13 = fPHeapMax1.getClass();
        org.junit.Assert.assertNull(item3);
        org.junit.Assert.assertNull(item5);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test185");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) '#');
        fPHeapMax1.imprime();
        fPHeapMax1.constroi();
        fPHeapMax1.constroi();
        fPHeapMax1.imprime();
        fPHeapMax1.refaz((int) (byte) 1, 1);
        ds.FPHeapMax fPHeapMax11 = new ds.FPHeapMax(100);
        ds.Item[] itemArray12 = new ds.Item[] {};
        fPHeapMax11.copia(itemArray12);
        fPHeapMax11.imprime();
        ds.Item item15 = fPHeapMax11.max();
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMax1.aumentaChave((int) 'a', (java.lang.Object) fPHeapMax11);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 97");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray12);
        org.junit.Assert.assertNull(item15);
    }

    @Test
    public void test186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test186");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (byte) 100);
        ds.FPHeapMax fPHeapMax3 = new ds.FPHeapMax(1);
        ds.FPHeapMax fPHeapMax5 = new ds.FPHeapMax((int) (short) 10);
        fPHeapMax5.constroi();
        ds.Item item7 = fPHeapMax5.max();
        fPHeapMax5.constroi();
        ds.Item item9 = fPHeapMax5.max();
        fPHeapMax5.imprime();
        ds.Item[] itemArray11 = new ds.Item[] {};
        fPHeapMax5.copia(itemArray11);
        fPHeapMax3.copia(itemArray11);
        fPHeapMax1.copia(itemArray11);
        ds.Item item15 = fPHeapMax1.max();
        fPHeapMax1.imprime();
        ds.Item item17 = null;
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMax1.insere(item17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(item7);
        org.junit.Assert.assertNull(item9);
        org.junit.Assert.assertNotNull(itemArray11);
        org.junit.Assert.assertNull(item15);
    }

    @Test
    public void test187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test187");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (short) 10);
        fPHeapMax1.constroi();
        ds.Item item3 = fPHeapMax1.max();
        fPHeapMax1.constroi();
        ds.Item item5 = fPHeapMax1.max();
        fPHeapMax1.imprime();
        ds.Item item7 = fPHeapMax1.max();
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMax1.aumentaChave((-1), (java.lang.Object) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(item3);
        org.junit.Assert.assertNull(item5);
        org.junit.Assert.assertNull(item7);
    }

    @Test
    public void test188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test188");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (short) 10);
        fPHeapMax1.constroi();
        ds.Item item3 = fPHeapMax1.max();
        fPHeapMax1.constroi();
        fPHeapMax1.constroi();
        ds.Item item6 = fPHeapMax1.max();
        java.lang.Class<?> wildcardClass7 = fPHeapMax1.getClass();
        org.junit.Assert.assertNull(item3);
        org.junit.Assert.assertNull(item6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test189");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (short) 10);
        fPHeapMax1.constroi();
        ds.Item item3 = fPHeapMax1.max();
        fPHeapMax1.constroi();
        ds.Item item5 = fPHeapMax1.max();
        fPHeapMax1.imprime();
        fPHeapMax1.constroi();
        // The following exception was thrown during execution in test generation
        try {
            ds.Item item8 = fPHeapMax1.retiraMax();
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: heap vazio");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(item3);
        org.junit.Assert.assertNull(item5);
    }

    @Test
    public void test190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test190");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax(1);
        ds.FPHeapMax fPHeapMax3 = new ds.FPHeapMax((int) (short) 10);
        fPHeapMax3.constroi();
        ds.Item item5 = fPHeapMax3.max();
        fPHeapMax3.constroi();
        ds.Item item7 = fPHeapMax3.max();
        fPHeapMax3.imprime();
        ds.Item[] itemArray9 = new ds.Item[] {};
        fPHeapMax3.copia(itemArray9);
        fPHeapMax1.copia(itemArray9);
        ds.Item item12 = null;
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMax1.insere(item12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(item5);
        org.junit.Assert.assertNull(item7);
        org.junit.Assert.assertNotNull(itemArray9);
    }

    @Test
    public void test191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test191");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) '#');
        fPHeapMax1.refaz((int) (short) 0, (-1));
        ds.Item item5 = null;
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMax1.insere(item5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test192");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (byte) 10);
        ds.FPHeapMax fPHeapMax4 = new ds.FPHeapMax((int) (short) 0);
        ds.FPHeapMax fPHeapMax6 = new ds.FPHeapMax((int) '#');
        fPHeapMax6.imprime();
        ds.Item item8 = fPHeapMax6.max();
        ds.Item item9 = null;
        ds.Item[] itemArray10 = new ds.Item[] { item9 };
        fPHeapMax6.copia(itemArray10);
        fPHeapMax4.copia(itemArray10);
        fPHeapMax4.constroi();
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMax1.aumentaChave((int) (short) 100, (java.lang.Object) fPHeapMax4);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 100");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(item8);
        org.junit.Assert.assertNotNull(itemArray10);
    }

    @Test
    public void test193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test193");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) '#');
        fPHeapMax1.constroi();
        ds.Item item3 = fPHeapMax1.max();
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMax1.refaz((-1), (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(item3);
    }

    @Test
    public void test194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test194");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (short) 10);
        fPHeapMax1.constroi();
        ds.Item item3 = fPHeapMax1.max();
        fPHeapMax1.constroi();
        ds.Item item5 = fPHeapMax1.max();
        fPHeapMax1.imprime();
        ds.Item[] itemArray7 = new ds.Item[] {};
        fPHeapMax1.copia(itemArray7);
        fPHeapMax1.constroi();
        ds.FPHeapMax fPHeapMax12 = new ds.FPHeapMax((int) (short) 10);
        fPHeapMax12.constroi();
        ds.Item item14 = fPHeapMax12.max();
        fPHeapMax12.constroi();
        fPHeapMax12.imprime();
        ds.FPHeapMax fPHeapMax18 = new ds.FPHeapMax((int) '#');
        fPHeapMax18.imprime();
        ds.Item item20 = fPHeapMax18.max();
        ds.Item item21 = null;
        ds.Item[] itemArray22 = new ds.Item[] { item21 };
        fPHeapMax18.copia(itemArray22);
        fPHeapMax12.copia(itemArray22);
        ds.FPHeapMax fPHeapMax26 = new ds.FPHeapMax((int) (short) 10);
        fPHeapMax26.constroi();
        ds.Item item28 = fPHeapMax26.max();
        fPHeapMax26.constroi();
        fPHeapMax26.imprime();
        ds.FPHeapMax fPHeapMax32 = new ds.FPHeapMax((int) '#');
        fPHeapMax32.imprime();
        ds.Item item34 = fPHeapMax32.max();
        ds.Item item35 = null;
        ds.Item[] itemArray36 = new ds.Item[] { item35 };
        fPHeapMax32.copia(itemArray36);
        fPHeapMax26.copia(itemArray36);
        fPHeapMax12.copia(itemArray36);
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMax1.aumentaChave((int) '4', (java.lang.Object) fPHeapMax12);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 52");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(item3);
        org.junit.Assert.assertNull(item5);
        org.junit.Assert.assertNotNull(itemArray7);
        org.junit.Assert.assertNull(item14);
        org.junit.Assert.assertNull(item20);
        org.junit.Assert.assertNotNull(itemArray22);
        org.junit.Assert.assertNull(item28);
        org.junit.Assert.assertNull(item34);
        org.junit.Assert.assertNotNull(itemArray36);
    }

    @Test
    public void test195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test195");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) '#');
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMax1.refaz((int) 'a', 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 97");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test196");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (short) 10);
        fPHeapMax1.constroi();
        ds.Item item3 = fPHeapMax1.max();
        fPHeapMax1.constroi();
        ds.Item item5 = fPHeapMax1.max();
        fPHeapMax1.imprime();
        fPHeapMax1.constroi();
        fPHeapMax1.constroi();
        ds.FPHeapMax fPHeapMax10 = new ds.FPHeapMax((int) (short) 10);
        fPHeapMax10.constroi();
        ds.Item item12 = fPHeapMax10.max();
        fPHeapMax10.imprime();
        fPHeapMax10.refaz(10, (int) (byte) 1);
        ds.FPHeapMax fPHeapMax18 = new ds.FPHeapMax(100);
        ds.Item[] itemArray19 = new ds.Item[] {};
        fPHeapMax18.copia(itemArray19);
        fPHeapMax10.copia(itemArray19);
        fPHeapMax1.copia(itemArray19);
        ds.FPHeapMax fPHeapMax24 = new ds.FPHeapMax((int) (short) 10);
        fPHeapMax24.constroi();
        ds.Item item26 = fPHeapMax24.max();
        fPHeapMax24.imprime();
        fPHeapMax24.refaz(10, (int) (byte) 1);
        ds.FPHeapMax fPHeapMax32 = new ds.FPHeapMax(100);
        ds.Item[] itemArray33 = new ds.Item[] {};
        fPHeapMax32.copia(itemArray33);
        fPHeapMax24.copia(itemArray33);
        fPHeapMax1.copia(itemArray33);
        java.lang.Class<?> wildcardClass37 = fPHeapMax1.getClass();
        org.junit.Assert.assertNull(item3);
        org.junit.Assert.assertNull(item5);
        org.junit.Assert.assertNull(item12);
        org.junit.Assert.assertNotNull(itemArray19);
        org.junit.Assert.assertNull(item26);
        org.junit.Assert.assertNotNull(itemArray33);
        org.junit.Assert.assertNotNull(wildcardClass37);
    }

    @Test
    public void test197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test197");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (short) 10);
        fPHeapMax1.constroi();
        ds.Item item3 = fPHeapMax1.max();
        fPHeapMax1.constroi();
        ds.Item item5 = fPHeapMax1.max();
        fPHeapMax1.imprime();
        ds.Item[] itemArray7 = new ds.Item[] {};
        fPHeapMax1.copia(itemArray7);
        fPHeapMax1.refaz((int) (byte) 10, 0);
        ds.Item item12 = null;
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMax1.insere(item12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(item3);
        org.junit.Assert.assertNull(item5);
        org.junit.Assert.assertNotNull(itemArray7);
    }

    @Test
    public void test198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test198");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (short) 10);
        fPHeapMax1.constroi();
        ds.Item item3 = fPHeapMax1.max();
        fPHeapMax1.constroi();
        ds.Item item5 = fPHeapMax1.max();
        fPHeapMax1.imprime();
        ds.Item item7 = fPHeapMax1.max();
        ds.FPHeapMax fPHeapMax9 = new ds.FPHeapMax((int) (short) 1);
        ds.FPHeapMax fPHeapMax11 = new ds.FPHeapMax((int) (short) 0);
        ds.FPHeapMax fPHeapMax13 = new ds.FPHeapMax((int) '#');
        fPHeapMax13.imprime();
        ds.Item item15 = fPHeapMax13.max();
        ds.Item item16 = null;
        ds.Item[] itemArray17 = new ds.Item[] { item16 };
        fPHeapMax13.copia(itemArray17);
        fPHeapMax11.copia(itemArray17);
        fPHeapMax11.constroi();
        fPHeapMax11.constroi();
        ds.FPHeapMax fPHeapMax23 = new ds.FPHeapMax((int) (short) 10);
        fPHeapMax23.constroi();
        ds.Item item25 = fPHeapMax23.max();
        fPHeapMax23.constroi();
        ds.Item item27 = fPHeapMax23.max();
        fPHeapMax23.imprime();
        ds.FPHeapMax fPHeapMax30 = new ds.FPHeapMax((int) '#');
        fPHeapMax30.imprime();
        ds.Item item32 = fPHeapMax30.max();
        ds.Item item33 = null;
        ds.Item[] itemArray34 = new ds.Item[] { item33 };
        fPHeapMax30.copia(itemArray34);
        fPHeapMax23.copia(itemArray34);
        fPHeapMax11.copia(itemArray34);
        fPHeapMax9.copia(itemArray34);
        fPHeapMax1.copia(itemArray34);
        ds.FPHeapMax fPHeapMax42 = new ds.FPHeapMax((int) (short) 1);
        ds.FPHeapMax fPHeapMax44 = new ds.FPHeapMax((int) (short) 0);
        ds.FPHeapMax fPHeapMax46 = new ds.FPHeapMax((int) '#');
        fPHeapMax46.imprime();
        ds.Item item48 = fPHeapMax46.max();
        ds.Item item49 = null;
        ds.Item[] itemArray50 = new ds.Item[] { item49 };
        fPHeapMax46.copia(itemArray50);
        fPHeapMax44.copia(itemArray50);
        fPHeapMax44.constroi();
        fPHeapMax44.constroi();
        ds.FPHeapMax fPHeapMax56 = new ds.FPHeapMax((int) (short) 10);
        fPHeapMax56.constroi();
        ds.Item item58 = fPHeapMax56.max();
        fPHeapMax56.constroi();
        ds.Item item60 = fPHeapMax56.max();
        fPHeapMax56.imprime();
        ds.FPHeapMax fPHeapMax63 = new ds.FPHeapMax((int) '#');
        fPHeapMax63.imprime();
        ds.Item item65 = fPHeapMax63.max();
        ds.Item item66 = null;
        ds.Item[] itemArray67 = new ds.Item[] { item66 };
        fPHeapMax63.copia(itemArray67);
        fPHeapMax56.copia(itemArray67);
        fPHeapMax44.copia(itemArray67);
        fPHeapMax42.copia(itemArray67);
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMax1.aumentaChave((int) (short) 10, (java.lang.Object) fPHeapMax42);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(item3);
        org.junit.Assert.assertNull(item5);
        org.junit.Assert.assertNull(item7);
        org.junit.Assert.assertNull(item15);
        org.junit.Assert.assertNotNull(itemArray17);
        org.junit.Assert.assertNull(item25);
        org.junit.Assert.assertNull(item27);
        org.junit.Assert.assertNull(item32);
        org.junit.Assert.assertNotNull(itemArray34);
        org.junit.Assert.assertNull(item48);
        org.junit.Assert.assertNotNull(itemArray50);
        org.junit.Assert.assertNull(item58);
        org.junit.Assert.assertNull(item60);
        org.junit.Assert.assertNull(item65);
        org.junit.Assert.assertNotNull(itemArray67);
    }

    @Test
    public void test199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test199");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (short) 10);
        fPHeapMax1.constroi();
        ds.Item item3 = fPHeapMax1.max();
        fPHeapMax1.constroi();
        ds.Item item5 = fPHeapMax1.max();
        fPHeapMax1.imprime();
        ds.Item[] itemArray7 = new ds.Item[] {};
        fPHeapMax1.copia(itemArray7);
        fPHeapMax1.constroi();
        // The following exception was thrown during execution in test generation
        try {
            ds.Item item10 = fPHeapMax1.retiraMax();
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: heap vazio");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(item3);
        org.junit.Assert.assertNull(item5);
        org.junit.Assert.assertNotNull(itemArray7);
    }

    @Test
    public void test200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test200");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (short) 10);
        fPHeapMax1.constroi();
        ds.Item item3 = fPHeapMax1.max();
        fPHeapMax1.constroi();
        ds.Item item5 = fPHeapMax1.max();
        fPHeapMax1.imprime();
        fPHeapMax1.constroi();
        fPHeapMax1.constroi();
        fPHeapMax1.refaz((int) (short) 10, (-1));
        fPHeapMax1.imprime();
        ds.Item item13 = null;
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMax1.insere(item13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(item3);
        org.junit.Assert.assertNull(item5);
    }

    @Test
    public void test201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test201");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (short) 100);
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
    public void test202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test202");
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
    public void test203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test203");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (byte) 100);
        fPHeapMax1.imprime();
        ds.FPHeapMax fPHeapMax4 = new ds.FPHeapMax(1);
        ds.FPHeapMax fPHeapMax6 = new ds.FPHeapMax((int) (short) 10);
        fPHeapMax6.constroi();
        ds.Item item8 = fPHeapMax6.max();
        fPHeapMax6.constroi();
        ds.Item item10 = fPHeapMax6.max();
        fPHeapMax6.imprime();
        ds.Item[] itemArray12 = new ds.Item[] {};
        fPHeapMax6.copia(itemArray12);
        fPHeapMax4.copia(itemArray12);
        fPHeapMax1.copia(itemArray12);
        ds.Item item16 = null;
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMax1.insere(item16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(item8);
        org.junit.Assert.assertNull(item10);
        org.junit.Assert.assertNotNull(itemArray12);
    }

    @Test
    public void test204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test204");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (short) 0);
        ds.FPHeapMax fPHeapMax3 = new ds.FPHeapMax((int) '#');
        fPHeapMax3.imprime();
        ds.Item item5 = fPHeapMax3.max();
        ds.Item item6 = null;
        ds.Item[] itemArray7 = new ds.Item[] { item6 };
        fPHeapMax3.copia(itemArray7);
        fPHeapMax1.copia(itemArray7);
        fPHeapMax1.constroi();
        fPHeapMax1.constroi();
        ds.FPHeapMax fPHeapMax14 = new ds.FPHeapMax((int) '#');
        fPHeapMax14.imprime();
        fPHeapMax14.constroi();
        fPHeapMax14.constroi();
        fPHeapMax14.imprime();
        fPHeapMax14.refaz((int) (byte) 1, 1);
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMax1.aumentaChave((int) (byte) 1, (java.lang.Object) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(item5);
        org.junit.Assert.assertNotNull(itemArray7);
    }

    @Test
    public void test205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test205");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (short) 10);
        fPHeapMax1.constroi();
        ds.Item item3 = fPHeapMax1.max();
        fPHeapMax1.constroi();
        ds.Item item5 = fPHeapMax1.max();
        fPHeapMax1.imprime();
        ds.FPHeapMax fPHeapMax8 = new ds.FPHeapMax((int) (byte) 100);
        ds.FPHeapMax fPHeapMax10 = new ds.FPHeapMax(1);
        ds.FPHeapMax fPHeapMax12 = new ds.FPHeapMax((int) (short) 10);
        fPHeapMax12.constroi();
        ds.Item item14 = fPHeapMax12.max();
        fPHeapMax12.constroi();
        ds.Item item16 = fPHeapMax12.max();
        fPHeapMax12.imprime();
        ds.Item[] itemArray18 = new ds.Item[] {};
        fPHeapMax12.copia(itemArray18);
        fPHeapMax10.copia(itemArray18);
        fPHeapMax8.copia(itemArray18);
        ds.FPHeapMax fPHeapMax23 = new ds.FPHeapMax((int) '#');
        fPHeapMax23.imprime();
        fPHeapMax23.constroi();
        fPHeapMax23.constroi();
        fPHeapMax23.imprime();
        ds.FPHeapMax fPHeapMax29 = new ds.FPHeapMax((int) (byte) 100);
        ds.FPHeapMax fPHeapMax31 = new ds.FPHeapMax(1);
        ds.FPHeapMax fPHeapMax33 = new ds.FPHeapMax((int) (short) 10);
        fPHeapMax33.constroi();
        ds.Item item35 = fPHeapMax33.max();
        fPHeapMax33.constroi();
        ds.Item item37 = fPHeapMax33.max();
        fPHeapMax33.imprime();
        ds.Item[] itemArray39 = new ds.Item[] {};
        fPHeapMax33.copia(itemArray39);
        fPHeapMax31.copia(itemArray39);
        fPHeapMax29.copia(itemArray39);
        fPHeapMax23.copia(itemArray39);
        fPHeapMax8.copia(itemArray39);
        fPHeapMax1.copia(itemArray39);
        ds.FPHeapMax fPHeapMax47 = new ds.FPHeapMax((int) (short) 10);
        fPHeapMax47.constroi();
        ds.Item item49 = fPHeapMax47.max();
        fPHeapMax47.constroi();
        ds.Item item51 = fPHeapMax47.max();
        fPHeapMax47.imprime();
        ds.Item[] itemArray53 = new ds.Item[] {};
        fPHeapMax47.copia(itemArray53);
        fPHeapMax47.constroi();
        ds.FPHeapMax fPHeapMax57 = new ds.FPHeapMax(100);
        ds.Item[] itemArray58 = new ds.Item[] {};
        fPHeapMax57.copia(itemArray58);
        fPHeapMax47.copia(itemArray58);
        fPHeapMax1.copia(itemArray58);
        java.lang.Class<?> wildcardClass62 = fPHeapMax1.getClass();
        org.junit.Assert.assertNull(item3);
        org.junit.Assert.assertNull(item5);
        org.junit.Assert.assertNull(item14);
        org.junit.Assert.assertNull(item16);
        org.junit.Assert.assertNotNull(itemArray18);
        org.junit.Assert.assertNull(item35);
        org.junit.Assert.assertNull(item37);
        org.junit.Assert.assertNotNull(itemArray39);
        org.junit.Assert.assertNull(item49);
        org.junit.Assert.assertNull(item51);
        org.junit.Assert.assertNotNull(itemArray53);
        org.junit.Assert.assertNotNull(itemArray58);
        org.junit.Assert.assertNotNull(wildcardClass62);
    }

    @Test
    public void test206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test206");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) '#');
        fPHeapMax1.imprime();
        fPHeapMax1.constroi();
        fPHeapMax1.constroi();
        ds.FPHeapMax fPHeapMax6 = new ds.FPHeapMax((int) '#');
        fPHeapMax6.imprime();
        ds.Item item8 = fPHeapMax6.max();
        ds.Item item9 = null;
        ds.Item[] itemArray10 = new ds.Item[] { item9 };
        fPHeapMax6.copia(itemArray10);
        fPHeapMax1.copia(itemArray10);
        java.lang.Class<?> wildcardClass13 = itemArray10.getClass();
        org.junit.Assert.assertNull(item8);
        org.junit.Assert.assertNotNull(itemArray10);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test207");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (short) 10);
        fPHeapMax1.constroi();
        ds.Item item3 = fPHeapMax1.max();
        fPHeapMax1.constroi();
        ds.Item item5 = fPHeapMax1.max();
        fPHeapMax1.imprime();
        fPHeapMax1.constroi();
        ds.FPHeapMax fPHeapMax9 = new ds.FPHeapMax((int) '#');
        fPHeapMax9.imprime();
        ds.Item item11 = fPHeapMax9.max();
        ds.Item item12 = null;
        ds.Item[] itemArray13 = new ds.Item[] { item12 };
        fPHeapMax9.copia(itemArray13);
        fPHeapMax1.copia(itemArray13);
        fPHeapMax1.refaz((int) (byte) 10, (int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMax1.refaz((int) '#', 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 35");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(item3);
        org.junit.Assert.assertNull(item5);
        org.junit.Assert.assertNull(item11);
        org.junit.Assert.assertNotNull(itemArray13);
    }

    @Test
    public void test208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test208");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) '#');
        fPHeapMax1.imprime();
        fPHeapMax1.constroi();
        fPHeapMax1.constroi();
        ds.FPHeapMax fPHeapMax7 = new ds.FPHeapMax((int) (byte) 0);
        ds.FPHeapMax fPHeapMax9 = new ds.FPHeapMax((int) (short) 10);
        fPHeapMax9.constroi();
        ds.Item item11 = fPHeapMax9.max();
        fPHeapMax9.constroi();
        ds.Item item13 = fPHeapMax9.max();
        fPHeapMax9.imprime();
        ds.Item[] itemArray15 = new ds.Item[] {};
        fPHeapMax9.copia(itemArray15);
        fPHeapMax9.constroi();
        ds.Item item18 = fPHeapMax9.max();
        ds.Item[] itemArray19 = new ds.Item[] {};
        fPHeapMax9.copia(itemArray19);
        fPHeapMax7.copia(itemArray19);
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMax1.aumentaChave((int) 'a', (java.lang.Object) fPHeapMax7);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 97");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(item11);
        org.junit.Assert.assertNull(item13);
        org.junit.Assert.assertNotNull(itemArray15);
        org.junit.Assert.assertNull(item18);
        org.junit.Assert.assertNotNull(itemArray19);
    }

    @Test
    public void test209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test209");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (byte) 10);
        fPHeapMax1.constroi();
        ds.FPHeapMax fPHeapMax5 = new ds.FPHeapMax((int) (short) 10);
        fPHeapMax5.constroi();
        ds.Item item7 = fPHeapMax5.max();
        fPHeapMax5.imprime();
        fPHeapMax5.refaz(10, (int) (byte) 1);
        ds.FPHeapMax fPHeapMax13 = new ds.FPHeapMax(100);
        ds.Item[] itemArray14 = new ds.Item[] {};
        fPHeapMax13.copia(itemArray14);
        fPHeapMax5.copia(itemArray14);
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMax1.aumentaChave((int) ' ', (java.lang.Object) itemArray14);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 32");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(item7);
        org.junit.Assert.assertNotNull(itemArray14);
    }

    @Test
    public void test210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test210");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) '4');
        fPHeapMax1.refaz((int) '4', (int) '#');
        // The following exception was thrown during execution in test generation
        try {
            ds.Item item5 = fPHeapMax1.retiraMax();
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: heap vazio");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
    }

    @Test
    public void test211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test211");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (short) 10);
        fPHeapMax1.constroi();
        ds.Item item3 = fPHeapMax1.max();
        fPHeapMax1.constroi();
        ds.Item item5 = fPHeapMax1.max();
        fPHeapMax1.imprime();
        ds.FPHeapMax fPHeapMax8 = new ds.FPHeapMax((int) (byte) 100);
        ds.FPHeapMax fPHeapMax10 = new ds.FPHeapMax(1);
        ds.FPHeapMax fPHeapMax12 = new ds.FPHeapMax((int) (short) 10);
        fPHeapMax12.constroi();
        ds.Item item14 = fPHeapMax12.max();
        fPHeapMax12.constroi();
        ds.Item item16 = fPHeapMax12.max();
        fPHeapMax12.imprime();
        ds.Item[] itemArray18 = new ds.Item[] {};
        fPHeapMax12.copia(itemArray18);
        fPHeapMax10.copia(itemArray18);
        fPHeapMax8.copia(itemArray18);
        ds.FPHeapMax fPHeapMax23 = new ds.FPHeapMax((int) '#');
        fPHeapMax23.imprime();
        fPHeapMax23.constroi();
        fPHeapMax23.constroi();
        fPHeapMax23.imprime();
        ds.FPHeapMax fPHeapMax29 = new ds.FPHeapMax((int) (byte) 100);
        ds.FPHeapMax fPHeapMax31 = new ds.FPHeapMax(1);
        ds.FPHeapMax fPHeapMax33 = new ds.FPHeapMax((int) (short) 10);
        fPHeapMax33.constroi();
        ds.Item item35 = fPHeapMax33.max();
        fPHeapMax33.constroi();
        ds.Item item37 = fPHeapMax33.max();
        fPHeapMax33.imprime();
        ds.Item[] itemArray39 = new ds.Item[] {};
        fPHeapMax33.copia(itemArray39);
        fPHeapMax31.copia(itemArray39);
        fPHeapMax29.copia(itemArray39);
        fPHeapMax23.copia(itemArray39);
        fPHeapMax8.copia(itemArray39);
        fPHeapMax1.copia(itemArray39);
        java.lang.Class<?> wildcardClass46 = itemArray39.getClass();
        org.junit.Assert.assertNull(item3);
        org.junit.Assert.assertNull(item5);
        org.junit.Assert.assertNull(item14);
        org.junit.Assert.assertNull(item16);
        org.junit.Assert.assertNotNull(itemArray18);
        org.junit.Assert.assertNull(item35);
        org.junit.Assert.assertNull(item37);
        org.junit.Assert.assertNotNull(itemArray39);
        org.junit.Assert.assertNotNull(wildcardClass46);
    }

    @Test
    public void test212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test212");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (byte) 100);
        ds.FPHeapMax fPHeapMax3 = new ds.FPHeapMax(1);
        ds.FPHeapMax fPHeapMax5 = new ds.FPHeapMax((int) (short) 10);
        fPHeapMax5.constroi();
        ds.Item item7 = fPHeapMax5.max();
        fPHeapMax5.constroi();
        ds.Item item9 = fPHeapMax5.max();
        fPHeapMax5.imprime();
        ds.Item[] itemArray11 = new ds.Item[] {};
        fPHeapMax5.copia(itemArray11);
        fPHeapMax3.copia(itemArray11);
        fPHeapMax1.copia(itemArray11);
        fPHeapMax1.refaz((int) (byte) 10, (int) (short) -1);
        org.junit.Assert.assertNull(item7);
        org.junit.Assert.assertNull(item9);
        org.junit.Assert.assertNotNull(itemArray11);
    }

    @Test
    public void test213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test213");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (short) 10);
        fPHeapMax1.constroi();
        ds.Item item3 = fPHeapMax1.max();
        fPHeapMax1.constroi();
        ds.Item item5 = fPHeapMax1.max();
        fPHeapMax1.imprime();
        fPHeapMax1.constroi();
        fPHeapMax1.constroi();
        ds.FPHeapMax fPHeapMax10 = new ds.FPHeapMax((int) (short) 10);
        fPHeapMax10.constroi();
        ds.Item item12 = fPHeapMax10.max();
        fPHeapMax10.imprime();
        fPHeapMax10.refaz(10, (int) (byte) 1);
        ds.FPHeapMax fPHeapMax18 = new ds.FPHeapMax(100);
        ds.Item[] itemArray19 = new ds.Item[] {};
        fPHeapMax18.copia(itemArray19);
        fPHeapMax10.copia(itemArray19);
        fPHeapMax1.copia(itemArray19);
        ds.FPHeapMax fPHeapMax24 = new ds.FPHeapMax((int) (short) 10);
        fPHeapMax24.constroi();
        ds.Item item26 = fPHeapMax24.max();
        fPHeapMax24.imprime();
        fPHeapMax24.refaz(10, (int) (byte) 1);
        ds.FPHeapMax fPHeapMax32 = new ds.FPHeapMax(100);
        ds.Item[] itemArray33 = new ds.Item[] {};
        fPHeapMax32.copia(itemArray33);
        fPHeapMax24.copia(itemArray33);
        fPHeapMax1.copia(itemArray33);
        java.lang.Class<?> wildcardClass37 = itemArray33.getClass();
        org.junit.Assert.assertNull(item3);
        org.junit.Assert.assertNull(item5);
        org.junit.Assert.assertNull(item12);
        org.junit.Assert.assertNotNull(itemArray19);
        org.junit.Assert.assertNull(item26);
        org.junit.Assert.assertNotNull(itemArray33);
        org.junit.Assert.assertNotNull(wildcardClass37);
    }

    @Test
    public void test214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test214");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (short) 10);
        fPHeapMax1.constroi();
        ds.Item item3 = fPHeapMax1.max();
        fPHeapMax1.imprime();
        fPHeapMax1.refaz(10, (int) (byte) 1);
        fPHeapMax1.imprime();
        java.lang.Class<?> wildcardClass9 = fPHeapMax1.getClass();
        org.junit.Assert.assertNull(item3);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test215");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (short) 10);
        fPHeapMax1.constroi();
        ds.Item item3 = fPHeapMax1.max();
        fPHeapMax1.constroi();
        ds.Item item5 = fPHeapMax1.max();
        fPHeapMax1.imprime();
        fPHeapMax1.constroi();
        fPHeapMax1.constroi();
        java.lang.Class<?> wildcardClass9 = fPHeapMax1.getClass();
        org.junit.Assert.assertNull(item3);
        org.junit.Assert.assertNull(item5);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test216");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax(100);
        ds.Item[] itemArray2 = new ds.Item[] {};
        fPHeapMax1.copia(itemArray2);
        fPHeapMax1.imprime();
        ds.Item item5 = fPHeapMax1.max();
        fPHeapMax1.imprime();
        java.lang.Class<?> wildcardClass7 = fPHeapMax1.getClass();
        org.junit.Assert.assertNotNull(itemArray2);
        org.junit.Assert.assertNull(item5);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test217");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) '#');
        fPHeapMax1.imprime();
        fPHeapMax1.constroi();
        fPHeapMax1.constroi();
        fPHeapMax1.imprime();
        fPHeapMax1.refaz((int) (byte) 1, 1);
        ds.FPHeapMax fPHeapMax10 = new ds.FPHeapMax((int) (short) 10);
        fPHeapMax10.constroi();
        ds.Item item12 = fPHeapMax10.max();
        fPHeapMax10.constroi();
        ds.Item item14 = fPHeapMax10.max();
        ds.FPHeapMax fPHeapMax16 = new ds.FPHeapMax((int) '#');
        fPHeapMax16.imprime();
        ds.Item item18 = fPHeapMax16.max();
        ds.Item item19 = null;
        ds.Item[] itemArray20 = new ds.Item[] { item19 };
        fPHeapMax16.copia(itemArray20);
        fPHeapMax10.copia(itemArray20);
        fPHeapMax1.copia(itemArray20);
        ds.Item item24 = fPHeapMax1.max();
        ds.FPHeapMax fPHeapMax26 = new ds.FPHeapMax((int) '#');
        fPHeapMax26.imprime();
        fPHeapMax26.constroi();
        fPHeapMax26.constroi();
        fPHeapMax26.imprime();
        fPHeapMax26.refaz((int) (byte) 1, 1);
        ds.FPHeapMax fPHeapMax35 = new ds.FPHeapMax((int) (short) 10);
        fPHeapMax35.constroi();
        ds.Item item37 = fPHeapMax35.max();
        fPHeapMax35.constroi();
        ds.Item item39 = fPHeapMax35.max();
        ds.FPHeapMax fPHeapMax41 = new ds.FPHeapMax((int) '#');
        fPHeapMax41.imprime();
        ds.Item item43 = fPHeapMax41.max();
        ds.Item item44 = null;
        ds.Item[] itemArray45 = new ds.Item[] { item44 };
        fPHeapMax41.copia(itemArray45);
        fPHeapMax35.copia(itemArray45);
        fPHeapMax26.copia(itemArray45);
        fPHeapMax1.copia(itemArray45);
        ds.Item item50 = null;
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMax1.insere(item50);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(item12);
        org.junit.Assert.assertNull(item14);
        org.junit.Assert.assertNull(item18);
        org.junit.Assert.assertNotNull(itemArray20);
        org.junit.Assert.assertNull(item24);
        org.junit.Assert.assertNull(item37);
        org.junit.Assert.assertNull(item39);
        org.junit.Assert.assertNull(item43);
        org.junit.Assert.assertNotNull(itemArray45);
    }

    @Test
    public void test218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test218");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (short) 0);
        ds.FPHeapMax fPHeapMax3 = new ds.FPHeapMax((int) '#');
        fPHeapMax3.imprime();
        ds.Item item5 = fPHeapMax3.max();
        ds.Item item6 = null;
        ds.Item[] itemArray7 = new ds.Item[] { item6 };
        fPHeapMax3.copia(itemArray7);
        fPHeapMax1.copia(itemArray7);
        fPHeapMax1.constroi();
        fPHeapMax1.constroi();
        ds.FPHeapMax fPHeapMax13 = new ds.FPHeapMax((int) (short) 10);
        fPHeapMax13.constroi();
        ds.Item item15 = fPHeapMax13.max();
        fPHeapMax13.constroi();
        ds.Item item17 = fPHeapMax13.max();
        fPHeapMax13.imprime();
        ds.FPHeapMax fPHeapMax20 = new ds.FPHeapMax((int) '#');
        fPHeapMax20.imprime();
        ds.Item item22 = fPHeapMax20.max();
        ds.Item item23 = null;
        ds.Item[] itemArray24 = new ds.Item[] { item23 };
        fPHeapMax20.copia(itemArray24);
        fPHeapMax13.copia(itemArray24);
        fPHeapMax1.copia(itemArray24);
        fPHeapMax1.imprime();
        java.lang.Class<?> wildcardClass29 = fPHeapMax1.getClass();
        org.junit.Assert.assertNull(item5);
        org.junit.Assert.assertNotNull(itemArray7);
        org.junit.Assert.assertNull(item15);
        org.junit.Assert.assertNull(item17);
        org.junit.Assert.assertNull(item22);
        org.junit.Assert.assertNotNull(itemArray24);
        org.junit.Assert.assertNotNull(wildcardClass29);
    }

    @Test
    public void test219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test219");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (short) 10);
        fPHeapMax1.constroi();
        ds.Item item3 = fPHeapMax1.max();
        fPHeapMax1.constroi();
        ds.Item item5 = fPHeapMax1.max();
        fPHeapMax1.imprime();
        ds.Item item7 = fPHeapMax1.max();
        ds.FPHeapMax fPHeapMax9 = new ds.FPHeapMax((int) (short) 1);
        ds.FPHeapMax fPHeapMax11 = new ds.FPHeapMax((int) (short) 0);
        ds.FPHeapMax fPHeapMax13 = new ds.FPHeapMax((int) '#');
        fPHeapMax13.imprime();
        ds.Item item15 = fPHeapMax13.max();
        ds.Item item16 = null;
        ds.Item[] itemArray17 = new ds.Item[] { item16 };
        fPHeapMax13.copia(itemArray17);
        fPHeapMax11.copia(itemArray17);
        fPHeapMax11.constroi();
        fPHeapMax11.constroi();
        ds.FPHeapMax fPHeapMax23 = new ds.FPHeapMax((int) (short) 10);
        fPHeapMax23.constroi();
        ds.Item item25 = fPHeapMax23.max();
        fPHeapMax23.constroi();
        ds.Item item27 = fPHeapMax23.max();
        fPHeapMax23.imprime();
        ds.FPHeapMax fPHeapMax30 = new ds.FPHeapMax((int) '#');
        fPHeapMax30.imprime();
        ds.Item item32 = fPHeapMax30.max();
        ds.Item item33 = null;
        ds.Item[] itemArray34 = new ds.Item[] { item33 };
        fPHeapMax30.copia(itemArray34);
        fPHeapMax23.copia(itemArray34);
        fPHeapMax11.copia(itemArray34);
        fPHeapMax9.copia(itemArray34);
        fPHeapMax1.copia(itemArray34);
        java.lang.Class<?> wildcardClass40 = fPHeapMax1.getClass();
        org.junit.Assert.assertNull(item3);
        org.junit.Assert.assertNull(item5);
        org.junit.Assert.assertNull(item7);
        org.junit.Assert.assertNull(item15);
        org.junit.Assert.assertNotNull(itemArray17);
        org.junit.Assert.assertNull(item25);
        org.junit.Assert.assertNull(item27);
        org.junit.Assert.assertNull(item32);
        org.junit.Assert.assertNotNull(itemArray34);
        org.junit.Assert.assertNotNull(wildcardClass40);
    }

    @Test
    public void test220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test220");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (short) 10);
        fPHeapMax1.constroi();
        ds.Item item3 = fPHeapMax1.max();
        fPHeapMax1.constroi();
        ds.Item item5 = fPHeapMax1.max();
        fPHeapMax1.imprime();
        ds.Item[] itemArray7 = new ds.Item[] {};
        fPHeapMax1.copia(itemArray7);
        fPHeapMax1.imprime();
        fPHeapMax1.imprime();
        ds.FPHeapMax fPHeapMax13 = new ds.FPHeapMax((int) (short) 10);
        fPHeapMax13.constroi();
        ds.Item item15 = fPHeapMax13.max();
        fPHeapMax13.constroi();
        ds.Item item17 = fPHeapMax13.max();
        fPHeapMax13.imprime();
        ds.Item[] itemArray19 = new ds.Item[] {};
        fPHeapMax13.copia(itemArray19);
        fPHeapMax13.constroi();
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMax1.aumentaChave((int) '4', (java.lang.Object) fPHeapMax13);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 52");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(item3);
        org.junit.Assert.assertNull(item5);
        org.junit.Assert.assertNotNull(itemArray7);
        org.junit.Assert.assertNull(item15);
        org.junit.Assert.assertNull(item17);
        org.junit.Assert.assertNotNull(itemArray19);
    }

    @Test
    public void test221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test221");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) 'a');
        fPHeapMax1.imprime();
        fPHeapMax1.constroi();
        ds.FPHeapMax fPHeapMax5 = new ds.FPHeapMax((int) (short) 10);
        fPHeapMax5.constroi();
        ds.Item item7 = fPHeapMax5.max();
        fPHeapMax5.constroi();
        fPHeapMax5.imprime();
        ds.FPHeapMax fPHeapMax11 = new ds.FPHeapMax((int) '#');
        fPHeapMax11.imprime();
        ds.Item item13 = fPHeapMax11.max();
        ds.Item item14 = null;
        ds.Item[] itemArray15 = new ds.Item[] { item14 };
        fPHeapMax11.copia(itemArray15);
        fPHeapMax5.copia(itemArray15);
        ds.FPHeapMax fPHeapMax19 = new ds.FPHeapMax((int) (short) 10);
        fPHeapMax19.constroi();
        ds.Item item21 = fPHeapMax19.max();
        fPHeapMax19.constroi();
        fPHeapMax19.imprime();
        ds.FPHeapMax fPHeapMax25 = new ds.FPHeapMax((int) '#');
        fPHeapMax25.imprime();
        ds.Item item27 = fPHeapMax25.max();
        ds.Item item28 = null;
        ds.Item[] itemArray29 = new ds.Item[] { item28 };
        fPHeapMax25.copia(itemArray29);
        fPHeapMax19.copia(itemArray29);
        fPHeapMax5.copia(itemArray29);
        fPHeapMax1.copia(itemArray29);
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMax1.refaz(0, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(item7);
        org.junit.Assert.assertNull(item13);
        org.junit.Assert.assertNotNull(itemArray15);
        org.junit.Assert.assertNull(item21);
        org.junit.Assert.assertNull(item27);
        org.junit.Assert.assertNotNull(itemArray29);
    }

    @Test
    public void test222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test222");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax(1);
        ds.FPHeapMax fPHeapMax3 = new ds.FPHeapMax((int) (short) 10);
        fPHeapMax3.constroi();
        ds.Item item5 = fPHeapMax3.max();
        fPHeapMax3.constroi();
        ds.Item item7 = fPHeapMax3.max();
        fPHeapMax3.imprime();
        ds.FPHeapMax fPHeapMax10 = new ds.FPHeapMax((int) (byte) 100);
        ds.FPHeapMax fPHeapMax12 = new ds.FPHeapMax(1);
        ds.FPHeapMax fPHeapMax14 = new ds.FPHeapMax((int) (short) 10);
        fPHeapMax14.constroi();
        ds.Item item16 = fPHeapMax14.max();
        fPHeapMax14.constroi();
        ds.Item item18 = fPHeapMax14.max();
        fPHeapMax14.imprime();
        ds.Item[] itemArray20 = new ds.Item[] {};
        fPHeapMax14.copia(itemArray20);
        fPHeapMax12.copia(itemArray20);
        fPHeapMax10.copia(itemArray20);
        ds.FPHeapMax fPHeapMax25 = new ds.FPHeapMax((int) '#');
        fPHeapMax25.imprime();
        fPHeapMax25.constroi();
        fPHeapMax25.constroi();
        fPHeapMax25.imprime();
        ds.FPHeapMax fPHeapMax31 = new ds.FPHeapMax((int) (byte) 100);
        ds.FPHeapMax fPHeapMax33 = new ds.FPHeapMax(1);
        ds.FPHeapMax fPHeapMax35 = new ds.FPHeapMax((int) (short) 10);
        fPHeapMax35.constroi();
        ds.Item item37 = fPHeapMax35.max();
        fPHeapMax35.constroi();
        ds.Item item39 = fPHeapMax35.max();
        fPHeapMax35.imprime();
        ds.Item[] itemArray41 = new ds.Item[] {};
        fPHeapMax35.copia(itemArray41);
        fPHeapMax33.copia(itemArray41);
        fPHeapMax31.copia(itemArray41);
        fPHeapMax25.copia(itemArray41);
        fPHeapMax10.copia(itemArray41);
        fPHeapMax3.copia(itemArray41);
        fPHeapMax1.copia(itemArray41);
        org.junit.Assert.assertNull(item5);
        org.junit.Assert.assertNull(item7);
        org.junit.Assert.assertNull(item16);
        org.junit.Assert.assertNull(item18);
        org.junit.Assert.assertNotNull(itemArray20);
        org.junit.Assert.assertNull(item37);
        org.junit.Assert.assertNull(item39);
        org.junit.Assert.assertNotNull(itemArray41);
    }

    @Test
    public void test223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test223");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (short) 10);
        fPHeapMax1.constroi();
        ds.Item item3 = fPHeapMax1.max();
        fPHeapMax1.constroi();
        ds.Item item5 = fPHeapMax1.max();
        ds.FPHeapMax fPHeapMax7 = new ds.FPHeapMax((int) (short) 10);
        fPHeapMax7.constroi();
        ds.FPHeapMax fPHeapMax10 = new ds.FPHeapMax((int) (short) 10);
        fPHeapMax10.constroi();
        ds.Item item12 = fPHeapMax10.max();
        fPHeapMax10.constroi();
        ds.Item item14 = fPHeapMax10.max();
        fPHeapMax10.imprime();
        ds.Item[] itemArray16 = new ds.Item[] {};
        fPHeapMax10.copia(itemArray16);
        fPHeapMax7.copia(itemArray16);
        fPHeapMax1.copia(itemArray16);
        ds.Item item20 = fPHeapMax1.max();
        ds.Item item21 = null;
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMax1.insere(item21);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(item3);
        org.junit.Assert.assertNull(item5);
        org.junit.Assert.assertNull(item12);
        org.junit.Assert.assertNull(item14);
        org.junit.Assert.assertNotNull(itemArray16);
        org.junit.Assert.assertNull(item20);
    }

    @Test
    public void test224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test224");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) '#');
        fPHeapMax1.imprime();
        fPHeapMax1.constroi();
        fPHeapMax1.constroi();
        fPHeapMax1.imprime();
        fPHeapMax1.constroi();
        fPHeapMax1.constroi();
        ds.Item item8 = fPHeapMax1.max();
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMax1.refaz((int) (short) -1, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(item8);
    }

    @Test
    public void test225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test225");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (byte) 100);
        fPHeapMax1.imprime();
        fPHeapMax1.imprime();
        ds.Item item4 = fPHeapMax1.max();
        java.lang.Class<?> wildcardClass5 = fPHeapMax1.getClass();
        org.junit.Assert.assertNull(item4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test226");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (short) 10);
        fPHeapMax1.constroi();
        ds.Item item3 = fPHeapMax1.max();
        fPHeapMax1.constroi();
        fPHeapMax1.imprime();
        fPHeapMax1.constroi();
        java.lang.Class<?> wildcardClass7 = fPHeapMax1.getClass();
        org.junit.Assert.assertNull(item3);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test227");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (byte) 100);
        fPHeapMax1.imprime();
        fPHeapMax1.imprime();
        ds.Item item4 = fPHeapMax1.max();
        fPHeapMax1.constroi();
        ds.Item item6 = fPHeapMax1.max();
        ds.Item item7 = fPHeapMax1.max();
        org.junit.Assert.assertNull(item4);
        org.junit.Assert.assertNull(item6);
        org.junit.Assert.assertNull(item7);
    }

    @Test
    public void test228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test228");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (short) 10);
        fPHeapMax1.constroi();
        ds.Item item3 = fPHeapMax1.max();
        fPHeapMax1.constroi();
        ds.Item item5 = fPHeapMax1.max();
        ds.FPHeapMax fPHeapMax7 = new ds.FPHeapMax((int) '#');
        fPHeapMax7.imprime();
        ds.Item item9 = fPHeapMax7.max();
        ds.Item item10 = null;
        ds.Item[] itemArray11 = new ds.Item[] { item10 };
        fPHeapMax7.copia(itemArray11);
        fPHeapMax1.copia(itemArray11);
        fPHeapMax1.constroi();
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMax1.refaz((-1), (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(item3);
        org.junit.Assert.assertNull(item5);
        org.junit.Assert.assertNull(item9);
        org.junit.Assert.assertNotNull(itemArray11);
    }

    @Test
    public void test229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test229");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (short) 10);
        fPHeapMax1.constroi();
        ds.Item item3 = fPHeapMax1.max();
        fPHeapMax1.constroi();
        fPHeapMax1.imprime();
        ds.FPHeapMax fPHeapMax7 = new ds.FPHeapMax((int) '#');
        fPHeapMax7.imprime();
        ds.Item item9 = fPHeapMax7.max();
        ds.Item item10 = null;
        ds.Item[] itemArray11 = new ds.Item[] { item10 };
        fPHeapMax7.copia(itemArray11);
        fPHeapMax1.copia(itemArray11);
        ds.FPHeapMax fPHeapMax15 = new ds.FPHeapMax((int) (short) 10);
        fPHeapMax15.constroi();
        ds.Item item17 = fPHeapMax15.max();
        fPHeapMax15.constroi();
        fPHeapMax15.imprime();
        ds.FPHeapMax fPHeapMax21 = new ds.FPHeapMax((int) '#');
        fPHeapMax21.imprime();
        ds.Item item23 = fPHeapMax21.max();
        ds.Item item24 = null;
        ds.Item[] itemArray25 = new ds.Item[] { item24 };
        fPHeapMax21.copia(itemArray25);
        fPHeapMax15.copia(itemArray25);
        fPHeapMax1.copia(itemArray25);
        java.lang.Class<?> wildcardClass29 = itemArray25.getClass();
        org.junit.Assert.assertNull(item3);
        org.junit.Assert.assertNull(item9);
        org.junit.Assert.assertNotNull(itemArray11);
        org.junit.Assert.assertNull(item17);
        org.junit.Assert.assertNull(item23);
        org.junit.Assert.assertNotNull(itemArray25);
        org.junit.Assert.assertNotNull(wildcardClass29);
    }

    @Test
    public void test230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test230");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) '#');
        fPHeapMax1.imprime();
        ds.Item item3 = fPHeapMax1.max();
        ds.Item item4 = null;
        ds.Item[] itemArray5 = new ds.Item[] { item4 };
        fPHeapMax1.copia(itemArray5);
        ds.Item item7 = fPHeapMax1.max();
        fPHeapMax1.constroi();
        ds.Item item9 = fPHeapMax1.max();
        // The following exception was thrown during execution in test generation
        try {
            ds.Item item10 = fPHeapMax1.retiraMax();
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: heap vazio");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(item3);
        org.junit.Assert.assertNotNull(itemArray5);
        org.junit.Assert.assertNull(item7);
        org.junit.Assert.assertNull(item9);
    }

    @Test
    public void test231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test231");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (short) 10);
        fPHeapMax1.constroi();
        ds.Item item3 = fPHeapMax1.max();
        fPHeapMax1.constroi();
        fPHeapMax1.refaz((int) (byte) 10, 0);
        fPHeapMax1.constroi();
        java.lang.Class<?> wildcardClass9 = fPHeapMax1.getClass();
        org.junit.Assert.assertNull(item3);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test232");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (byte) -1);
        java.lang.Class<?> wildcardClass2 = fPHeapMax1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test233");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) '#');
        fPHeapMax1.imprime();
        fPHeapMax1.constroi();
        fPHeapMax1.constroi();
        fPHeapMax1.imprime();
        fPHeapMax1.constroi();
        fPHeapMax1.constroi();
        ds.Item item8 = fPHeapMax1.max();
        ds.FPHeapMax fPHeapMax10 = new ds.FPHeapMax((int) (byte) 10);
        fPHeapMax10.imprime();
        ds.FPHeapMax fPHeapMax13 = new ds.FPHeapMax(100);
        ds.Item[] itemArray14 = new ds.Item[] {};
        fPHeapMax13.copia(itemArray14);
        fPHeapMax10.copia(itemArray14);
        fPHeapMax1.copia(itemArray14);
        // The following exception was thrown during execution in test generation
        try {
            ds.Item item18 = fPHeapMax1.retiraMax();
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: heap vazio");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(item8);
        org.junit.Assert.assertNotNull(itemArray14);
    }

    @Test
    public void test234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test234");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (short) 10);
        fPHeapMax1.constroi();
        ds.Item item3 = fPHeapMax1.max();
        fPHeapMax1.imprime();
        ds.Item[] itemArray5 = new ds.Item[] {};
        fPHeapMax1.copia(itemArray5);
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMax1.refaz((int) 'a', 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 97");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(item3);
        org.junit.Assert.assertNotNull(itemArray5);
    }

    @Test
    public void test235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test235");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (short) 10);
        fPHeapMax1.constroi();
        ds.Item item3 = fPHeapMax1.max();
        fPHeapMax1.constroi();
        ds.Item item5 = fPHeapMax1.max();
        ds.FPHeapMax fPHeapMax7 = new ds.FPHeapMax((int) '#');
        fPHeapMax7.imprime();
        ds.Item item9 = fPHeapMax7.max();
        ds.Item item10 = null;
        ds.Item[] itemArray11 = new ds.Item[] { item10 };
        fPHeapMax7.copia(itemArray11);
        fPHeapMax1.copia(itemArray11);
        ds.Item item14 = fPHeapMax1.max();
        // The following exception was thrown during execution in test generation
        try {
            ds.Item item15 = fPHeapMax1.retiraMax();
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: heap vazio");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(item3);
        org.junit.Assert.assertNull(item5);
        org.junit.Assert.assertNull(item9);
        org.junit.Assert.assertNotNull(itemArray11);
        org.junit.Assert.assertNull(item14);
    }

    @Test
    public void test236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test236");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (short) 0);
        ds.FPHeapMax fPHeapMax3 = new ds.FPHeapMax((int) '#');
        fPHeapMax3.imprime();
        ds.Item item5 = fPHeapMax3.max();
        ds.Item item6 = null;
        ds.Item[] itemArray7 = new ds.Item[] { item6 };
        fPHeapMax3.copia(itemArray7);
        fPHeapMax1.copia(itemArray7);
        fPHeapMax1.constroi();
        fPHeapMax1.constroi();
        // The following exception was thrown during execution in test generation
        try {
            ds.Item item12 = fPHeapMax1.max();
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(item5);
        org.junit.Assert.assertNotNull(itemArray7);
    }

    @Test
    public void test237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test237");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (byte) 100);
        ds.FPHeapMax fPHeapMax3 = new ds.FPHeapMax(1);
        ds.FPHeapMax fPHeapMax5 = new ds.FPHeapMax((int) (short) 10);
        fPHeapMax5.constroi();
        ds.Item item7 = fPHeapMax5.max();
        fPHeapMax5.constroi();
        ds.Item item9 = fPHeapMax5.max();
        fPHeapMax5.imprime();
        ds.Item[] itemArray11 = new ds.Item[] {};
        fPHeapMax5.copia(itemArray11);
        fPHeapMax3.copia(itemArray11);
        fPHeapMax1.copia(itemArray11);
        ds.Item item15 = fPHeapMax1.max();
        fPHeapMax1.imprime();
        fPHeapMax1.imprime();
        ds.FPHeapMax fPHeapMax20 = new ds.FPHeapMax((int) (short) 10);
        fPHeapMax20.constroi();
        ds.Item item22 = fPHeapMax20.max();
        fPHeapMax20.constroi();
        ds.Item item24 = fPHeapMax20.max();
        fPHeapMax20.imprime();
        fPHeapMax20.constroi();
        ds.FPHeapMax fPHeapMax28 = new ds.FPHeapMax((int) '#');
        fPHeapMax28.imprime();
        ds.Item item30 = fPHeapMax28.max();
        ds.Item item31 = null;
        ds.Item[] itemArray32 = new ds.Item[] { item31 };
        fPHeapMax28.copia(itemArray32);
        fPHeapMax20.copia(itemArray32);
        java.lang.Class<?> wildcardClass35 = itemArray32.getClass();
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMax1.aumentaChave((int) '4', (java.lang.Object) wildcardClass35);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(item7);
        org.junit.Assert.assertNull(item9);
        org.junit.Assert.assertNotNull(itemArray11);
        org.junit.Assert.assertNull(item15);
        org.junit.Assert.assertNull(item22);
        org.junit.Assert.assertNull(item24);
        org.junit.Assert.assertNull(item30);
        org.junit.Assert.assertNotNull(itemArray32);
        org.junit.Assert.assertNotNull(wildcardClass35);
    }

    @Test
    public void test238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test238");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (short) 10);
        fPHeapMax1.constroi();
        ds.Item item3 = fPHeapMax1.max();
        fPHeapMax1.constroi();
        ds.Item item5 = fPHeapMax1.max();
        fPHeapMax1.imprime();
        fPHeapMax1.constroi();
        ds.FPHeapMax fPHeapMax9 = new ds.FPHeapMax((int) '#');
        fPHeapMax9.imprime();
        ds.Item item11 = fPHeapMax9.max();
        ds.Item item12 = null;
        ds.Item[] itemArray13 = new ds.Item[] { item12 };
        fPHeapMax9.copia(itemArray13);
        fPHeapMax1.copia(itemArray13);
        fPHeapMax1.constroi();
        ds.Item item17 = null;
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMax1.insere(item17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(item3);
        org.junit.Assert.assertNull(item5);
        org.junit.Assert.assertNull(item11);
        org.junit.Assert.assertNotNull(itemArray13);
    }

    @Test
    public void test239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test239");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) '#');
        fPHeapMax1.imprime();
        fPHeapMax1.constroi();
        fPHeapMax1.constroi();
        fPHeapMax1.imprime();
        fPHeapMax1.constroi();
        fPHeapMax1.constroi();
        ds.Item item8 = fPHeapMax1.max();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass9 = item8.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(item8);
    }

    @Test
    public void test240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test240");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) '#');
        fPHeapMax1.imprime();
        ds.Item item3 = fPHeapMax1.max();
        ds.Item item4 = null;
        ds.Item[] itemArray5 = new ds.Item[] { item4 };
        fPHeapMax1.copia(itemArray5);
        ds.Item item7 = fPHeapMax1.max();
        fPHeapMax1.constroi();
        ds.Item item9 = fPHeapMax1.max();
        ds.FPHeapMax fPHeapMax12 = new ds.FPHeapMax((int) (short) 10);
        fPHeapMax12.constroi();
        ds.Item item14 = fPHeapMax12.max();
        fPHeapMax12.constroi();
        fPHeapMax12.constroi();
        ds.Item item17 = fPHeapMax12.max();
        fPHeapMax12.constroi();
        ds.Item item19 = fPHeapMax12.max();
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMax1.aumentaChave((int) (byte) 1, (java.lang.Object) fPHeapMax12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(item3);
        org.junit.Assert.assertNotNull(itemArray5);
        org.junit.Assert.assertNull(item7);
        org.junit.Assert.assertNull(item9);
        org.junit.Assert.assertNull(item14);
        org.junit.Assert.assertNull(item17);
        org.junit.Assert.assertNull(item19);
    }

    @Test
    public void test241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test241");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) 'a');
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
    public void test242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test242");
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
    public void test243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test243");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (short) 10);
        fPHeapMax1.constroi();
        ds.Item item3 = fPHeapMax1.max();
        fPHeapMax1.constroi();
        fPHeapMax1.constroi();
        ds.Item item6 = fPHeapMax1.max();
        fPHeapMax1.constroi();
        ds.Item item8 = fPHeapMax1.max();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass9 = item8.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(item3);
        org.junit.Assert.assertNull(item6);
        org.junit.Assert.assertNull(item8);
    }

    @Test
    public void test244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test244");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) '#');
        fPHeapMax1.imprime();
        fPHeapMax1.constroi();
        fPHeapMax1.constroi();
        fPHeapMax1.imprime();
        fPHeapMax1.refaz((int) (byte) 1, 1);
        ds.FPHeapMax fPHeapMax10 = new ds.FPHeapMax((int) (short) 10);
        fPHeapMax10.constroi();
        ds.Item item12 = fPHeapMax10.max();
        fPHeapMax10.constroi();
        ds.Item item14 = fPHeapMax10.max();
        ds.FPHeapMax fPHeapMax16 = new ds.FPHeapMax((int) '#');
        fPHeapMax16.imprime();
        ds.Item item18 = fPHeapMax16.max();
        ds.Item item19 = null;
        ds.Item[] itemArray20 = new ds.Item[] { item19 };
        fPHeapMax16.copia(itemArray20);
        fPHeapMax10.copia(itemArray20);
        fPHeapMax1.copia(itemArray20);
        ds.Item item24 = fPHeapMax1.max();
        ds.FPHeapMax fPHeapMax26 = new ds.FPHeapMax((int) (short) 10);
        fPHeapMax26.constroi();
        ds.Item item28 = fPHeapMax26.max();
        fPHeapMax26.constroi();
        ds.Item item30 = fPHeapMax26.max();
        fPHeapMax26.imprime();
        ds.Item[] itemArray32 = new ds.Item[] {};
        fPHeapMax26.copia(itemArray32);
        fPHeapMax26.constroi();
        ds.FPHeapMax fPHeapMax36 = new ds.FPHeapMax(100);
        ds.Item[] itemArray37 = new ds.Item[] {};
        fPHeapMax36.copia(itemArray37);
        fPHeapMax26.copia(itemArray37);
        fPHeapMax1.copia(itemArray37);
        fPHeapMax1.imprime();
        java.lang.Class<?> wildcardClass42 = fPHeapMax1.getClass();
        org.junit.Assert.assertNull(item12);
        org.junit.Assert.assertNull(item14);
        org.junit.Assert.assertNull(item18);
        org.junit.Assert.assertNotNull(itemArray20);
        org.junit.Assert.assertNull(item24);
        org.junit.Assert.assertNull(item28);
        org.junit.Assert.assertNull(item30);
        org.junit.Assert.assertNotNull(itemArray32);
        org.junit.Assert.assertNotNull(itemArray37);
        org.junit.Assert.assertNotNull(wildcardClass42);
    }

    @Test
    public void test245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test245");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (short) 10);
        fPHeapMax1.constroi();
        ds.Item item3 = fPHeapMax1.max();
        fPHeapMax1.constroi();
        ds.Item item5 = fPHeapMax1.max();
        fPHeapMax1.imprime();
        ds.Item[] itemArray7 = new ds.Item[] {};
        fPHeapMax1.copia(itemArray7);
        fPHeapMax1.imprime();
        fPHeapMax1.imprime();
        // The following exception was thrown during execution in test generation
        try {
            ds.Item item11 = fPHeapMax1.retiraMax();
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: heap vazio");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(item3);
        org.junit.Assert.assertNull(item5);
        org.junit.Assert.assertNotNull(itemArray7);
    }

    @Test
    public void test246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test246");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (short) 10);
        ds.Item item2 = fPHeapMax1.max();
        fPHeapMax1.constroi();
        java.lang.Class<?> wildcardClass4 = fPHeapMax1.getClass();
        org.junit.Assert.assertNull(item2);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test247");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (short) 10);
        ds.Item item2 = fPHeapMax1.max();
        fPHeapMax1.constroi();
        ds.FPHeapMax fPHeapMax6 = new ds.FPHeapMax((int) (short) 100);
        fPHeapMax6.constroi();
        ds.FPHeapMax fPHeapMax9 = new ds.FPHeapMax((int) (short) 10);
        fPHeapMax9.constroi();
        ds.Item item11 = fPHeapMax9.max();
        fPHeapMax9.constroi();
        ds.Item item13 = fPHeapMax9.max();
        fPHeapMax9.imprime();
        ds.Item[] itemArray15 = new ds.Item[] {};
        fPHeapMax9.copia(itemArray15);
        fPHeapMax9.constroi();
        ds.FPHeapMax fPHeapMax19 = new ds.FPHeapMax(100);
        ds.Item[] itemArray20 = new ds.Item[] {};
        fPHeapMax19.copia(itemArray20);
        fPHeapMax9.copia(itemArray20);
        fPHeapMax6.copia(itemArray20);
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMax1.aumentaChave((int) 'a', (java.lang.Object) itemArray20);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 97");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(item2);
        org.junit.Assert.assertNull(item11);
        org.junit.Assert.assertNull(item13);
        org.junit.Assert.assertNotNull(itemArray15);
        org.junit.Assert.assertNotNull(itemArray20);
    }

    @Test
    public void test248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test248");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) '#');
        fPHeapMax1.imprime();
        ds.Item item3 = fPHeapMax1.max();
        ds.Item item4 = null;
        ds.Item[] itemArray5 = new ds.Item[] { item4 };
        fPHeapMax1.copia(itemArray5);
        ds.Item item7 = fPHeapMax1.max();
        fPHeapMax1.constroi();
        // The following exception was thrown during execution in test generation
        try {
            ds.Item item9 = fPHeapMax1.retiraMax();
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: heap vazio");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(item3);
        org.junit.Assert.assertNotNull(itemArray5);
        org.junit.Assert.assertNull(item7);
    }

    @Test
    public void test249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test249");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (short) 10);
        fPHeapMax1.constroi();
        ds.Item item3 = fPHeapMax1.max();
        fPHeapMax1.constroi();
        fPHeapMax1.constroi();
        ds.FPHeapMax fPHeapMax7 = new ds.FPHeapMax((int) (short) 10);
        fPHeapMax7.constroi();
        ds.Item item9 = fPHeapMax7.max();
        fPHeapMax7.imprime();
        fPHeapMax7.refaz(10, (int) (byte) 1);
        ds.FPHeapMax fPHeapMax15 = new ds.FPHeapMax(100);
        ds.Item[] itemArray16 = new ds.Item[] {};
        fPHeapMax15.copia(itemArray16);
        fPHeapMax7.copia(itemArray16);
        fPHeapMax1.copia(itemArray16);
        ds.Item item20 = null;
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMax1.insere(item20);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(item3);
        org.junit.Assert.assertNull(item9);
        org.junit.Assert.assertNotNull(itemArray16);
    }

    @Test
    public void test250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test250");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (short) 10);
        fPHeapMax1.constroi();
        ds.Item item3 = fPHeapMax1.max();
        fPHeapMax1.constroi();
        fPHeapMax1.imprime();
        fPHeapMax1.constroi();
        ds.Item item7 = null;
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMax1.insere(item7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(item3);
    }

    @Test
    public void test251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test251");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (short) 0);
        ds.FPHeapMax fPHeapMax3 = new ds.FPHeapMax((int) '#');
        fPHeapMax3.imprime();
        ds.Item item5 = fPHeapMax3.max();
        ds.Item item6 = null;
        ds.Item[] itemArray7 = new ds.Item[] { item6 };
        fPHeapMax3.copia(itemArray7);
        fPHeapMax1.copia(itemArray7);
        fPHeapMax1.constroi();
        fPHeapMax1.constroi();
        ds.FPHeapMax fPHeapMax13 = new ds.FPHeapMax((int) (short) 10);
        fPHeapMax13.constroi();
        ds.Item item15 = fPHeapMax13.max();
        fPHeapMax13.constroi();
        ds.Item item17 = fPHeapMax13.max();
        fPHeapMax13.imprime();
        ds.FPHeapMax fPHeapMax20 = new ds.FPHeapMax((int) '#');
        fPHeapMax20.imprime();
        ds.Item item22 = fPHeapMax20.max();
        ds.Item item23 = null;
        ds.Item[] itemArray24 = new ds.Item[] { item23 };
        fPHeapMax20.copia(itemArray24);
        fPHeapMax13.copia(itemArray24);
        fPHeapMax1.copia(itemArray24);
        fPHeapMax1.imprime();
        ds.Item item29 = null;
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMax1.insere(item29);
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: heap cheio");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(item5);
        org.junit.Assert.assertNotNull(itemArray7);
        org.junit.Assert.assertNull(item15);
        org.junit.Assert.assertNull(item17);
        org.junit.Assert.assertNull(item22);
        org.junit.Assert.assertNotNull(itemArray24);
    }

    @Test
    public void test252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test252");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (short) 10);
        fPHeapMax1.constroi();
        ds.Item item3 = fPHeapMax1.max();
        fPHeapMax1.constroi();
        ds.Item item5 = fPHeapMax1.max();
        fPHeapMax1.imprime();
        fPHeapMax1.imprime();
        java.lang.Class<?> wildcardClass8 = fPHeapMax1.getClass();
        org.junit.Assert.assertNull(item3);
        org.junit.Assert.assertNull(item5);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test253");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) '#');
        fPHeapMax1.constroi();
        ds.Item item3 = fPHeapMax1.max();
        // The following exception was thrown during execution in test generation
        try {
            ds.Item item4 = fPHeapMax1.retiraMax();
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: heap vazio");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(item3);
    }

    @Test
    public void test254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test254");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (short) 10);
        fPHeapMax1.constroi();
        ds.Item item3 = fPHeapMax1.max();
        fPHeapMax1.constroi();
        fPHeapMax1.constroi();
        ds.Item item6 = fPHeapMax1.max();
        fPHeapMax1.constroi();
        ds.Item item8 = fPHeapMax1.max();
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMax1.refaz((-1), (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(item3);
        org.junit.Assert.assertNull(item6);
        org.junit.Assert.assertNull(item8);
    }

    @Test
    public void test255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test255");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMax1.refaz((int) ' ', (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 32");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test256");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) '#');
        fPHeapMax1.imprime();
        fPHeapMax1.constroi();
        fPHeapMax1.constroi();
        fPHeapMax1.imprime();
        fPHeapMax1.constroi();
        fPHeapMax1.constroi();
        ds.FPHeapMax fPHeapMax9 = new ds.FPHeapMax((int) (short) 10);
        fPHeapMax9.constroi();
        ds.Item item11 = fPHeapMax9.max();
        fPHeapMax9.constroi();
        ds.Item item13 = fPHeapMax9.max();
        fPHeapMax9.imprime();
        fPHeapMax9.constroi();
        fPHeapMax9.constroi();
        ds.FPHeapMax fPHeapMax18 = new ds.FPHeapMax((int) (short) 10);
        fPHeapMax18.constroi();
        ds.Item item20 = fPHeapMax18.max();
        fPHeapMax18.imprime();
        fPHeapMax18.refaz(10, (int) (byte) 1);
        ds.FPHeapMax fPHeapMax26 = new ds.FPHeapMax(100);
        ds.Item[] itemArray27 = new ds.Item[] {};
        fPHeapMax26.copia(itemArray27);
        fPHeapMax18.copia(itemArray27);
        fPHeapMax9.copia(itemArray27);
        fPHeapMax1.copia(itemArray27);
        fPHeapMax1.imprime();
        fPHeapMax1.constroi();
        // The following exception was thrown during execution in test generation
        try {
            ds.Item item34 = fPHeapMax1.retiraMax();
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: heap vazio");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(item11);
        org.junit.Assert.assertNull(item13);
        org.junit.Assert.assertNull(item20);
        org.junit.Assert.assertNotNull(itemArray27);
    }

    @Test
    public void test257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test257");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (short) 10);
        fPHeapMax1.constroi();
        ds.Item item3 = fPHeapMax1.max();
        fPHeapMax1.imprime();
        fPHeapMax1.constroi();
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMax1.refaz((int) ' ', (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 32");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(item3);
    }

    @Test
    public void test258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test258");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (short) 10);
        fPHeapMax1.constroi();
        ds.Item item3 = fPHeapMax1.max();
        fPHeapMax1.constroi();
        fPHeapMax1.imprime();
        ds.FPHeapMax fPHeapMax7 = new ds.FPHeapMax((int) '#');
        fPHeapMax7.imprime();
        ds.Item item9 = fPHeapMax7.max();
        ds.Item item10 = null;
        ds.Item[] itemArray11 = new ds.Item[] { item10 };
        fPHeapMax7.copia(itemArray11);
        fPHeapMax1.copia(itemArray11);
        // The following exception was thrown during execution in test generation
        try {
            ds.Item item14 = fPHeapMax1.retiraMax();
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: heap vazio");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(item3);
        org.junit.Assert.assertNull(item9);
        org.junit.Assert.assertNotNull(itemArray11);
    }

    @Test
    public void test259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test259");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (short) 0);
        ds.FPHeapMax fPHeapMax3 = new ds.FPHeapMax((int) '#');
        fPHeapMax3.imprime();
        ds.Item item5 = fPHeapMax3.max();
        ds.Item item6 = null;
        ds.Item[] itemArray7 = new ds.Item[] { item6 };
        fPHeapMax3.copia(itemArray7);
        fPHeapMax1.copia(itemArray7);
        fPHeapMax1.constroi();
        // The following exception was thrown during execution in test generation
        try {
            ds.Item item11 = fPHeapMax1.max();
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(item5);
        org.junit.Assert.assertNotNull(itemArray7);
    }

    @Test
    public void test260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test260");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (short) 1);
        java.lang.Class<?> wildcardClass2 = fPHeapMax1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test261");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (short) 10);
        fPHeapMax1.constroi();
        ds.Item item3 = fPHeapMax1.max();
        fPHeapMax1.constroi();
        ds.Item item5 = fPHeapMax1.max();
        fPHeapMax1.imprime();
        ds.FPHeapMax fPHeapMax9 = new ds.FPHeapMax((int) '#');
        fPHeapMax9.imprime();
        fPHeapMax9.constroi();
        fPHeapMax9.constroi();
        fPHeapMax9.imprime();
        ds.FPHeapMax fPHeapMax15 = new ds.FPHeapMax((int) (byte) 100);
        ds.FPHeapMax fPHeapMax17 = new ds.FPHeapMax(1);
        ds.FPHeapMax fPHeapMax19 = new ds.FPHeapMax((int) (short) 10);
        fPHeapMax19.constroi();
        ds.Item item21 = fPHeapMax19.max();
        fPHeapMax19.constroi();
        ds.Item item23 = fPHeapMax19.max();
        fPHeapMax19.imprime();
        ds.Item[] itemArray25 = new ds.Item[] {};
        fPHeapMax19.copia(itemArray25);
        fPHeapMax17.copia(itemArray25);
        fPHeapMax15.copia(itemArray25);
        fPHeapMax9.copia(itemArray25);
        fPHeapMax9.imprime();
        java.lang.Class<?> wildcardClass31 = fPHeapMax9.getClass();
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMax1.aumentaChave((int) (short) -1, (java.lang.Object) wildcardClass31);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(item3);
        org.junit.Assert.assertNull(item5);
        org.junit.Assert.assertNull(item21);
        org.junit.Assert.assertNull(item23);
        org.junit.Assert.assertNotNull(itemArray25);
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test262");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (short) 10);
        fPHeapMax1.constroi();
        ds.Item item3 = fPHeapMax1.max();
        fPHeapMax1.constroi();
        ds.Item item5 = fPHeapMax1.max();
        fPHeapMax1.imprime();
        ds.Item[] itemArray7 = new ds.Item[] {};
        fPHeapMax1.copia(itemArray7);
        fPHeapMax1.constroi();
        ds.Item item10 = fPHeapMax1.max();
        ds.Item[] itemArray11 = new ds.Item[] {};
        fPHeapMax1.copia(itemArray11);
        ds.FPHeapMax fPHeapMax15 = new ds.FPHeapMax((int) '#');
        fPHeapMax15.imprime();
        ds.Item item17 = fPHeapMax15.max();
        ds.Item item18 = null;
        ds.Item[] itemArray19 = new ds.Item[] { item18 };
        fPHeapMax15.copia(itemArray19);
        ds.Item item21 = fPHeapMax15.max();
        ds.FPHeapMax fPHeapMax23 = new ds.FPHeapMax((int) (byte) 10);
        fPHeapMax23.imprime();
        ds.FPHeapMax fPHeapMax26 = new ds.FPHeapMax(100);
        ds.Item[] itemArray27 = new ds.Item[] {};
        fPHeapMax26.copia(itemArray27);
        fPHeapMax23.copia(itemArray27);
        ds.FPHeapMax fPHeapMax31 = new ds.FPHeapMax(100);
        ds.Item[] itemArray32 = new ds.Item[] {};
        fPHeapMax31.copia(itemArray32);
        ds.FPHeapMax fPHeapMax35 = new ds.FPHeapMax((int) (short) 10);
        fPHeapMax35.constroi();
        ds.Item item37 = fPHeapMax35.max();
        fPHeapMax35.constroi();
        ds.Item item39 = fPHeapMax35.max();
        fPHeapMax35.imprime();
        ds.Item[] itemArray41 = new ds.Item[] {};
        fPHeapMax35.copia(itemArray41);
        fPHeapMax35.constroi();
        ds.FPHeapMax fPHeapMax45 = new ds.FPHeapMax(100);
        ds.Item[] itemArray46 = new ds.Item[] {};
        fPHeapMax45.copia(itemArray46);
        fPHeapMax35.copia(itemArray46);
        fPHeapMax31.copia(itemArray46);
        fPHeapMax23.copia(itemArray46);
        fPHeapMax15.copia(itemArray46);
        fPHeapMax15.constroi();
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMax1.aumentaChave((int) 'a', (java.lang.Object) fPHeapMax15);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 97");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(item3);
        org.junit.Assert.assertNull(item5);
        org.junit.Assert.assertNotNull(itemArray7);
        org.junit.Assert.assertNull(item10);
        org.junit.Assert.assertNotNull(itemArray11);
        org.junit.Assert.assertNull(item17);
        org.junit.Assert.assertNotNull(itemArray19);
        org.junit.Assert.assertNull(item21);
        org.junit.Assert.assertNotNull(itemArray27);
        org.junit.Assert.assertNotNull(itemArray32);
        org.junit.Assert.assertNull(item37);
        org.junit.Assert.assertNull(item39);
        org.junit.Assert.assertNotNull(itemArray41);
        org.junit.Assert.assertNotNull(itemArray46);
    }

    @Test
    public void test263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test263");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (short) 10);
        fPHeapMax1.constroi();
        ds.Item item3 = fPHeapMax1.max();
        fPHeapMax1.constroi();
        fPHeapMax1.imprime();
        java.lang.Class<?> wildcardClass6 = fPHeapMax1.getClass();
        org.junit.Assert.assertNull(item3);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test264");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (short) 10);
        fPHeapMax1.constroi();
        ds.Item item3 = fPHeapMax1.max();
        fPHeapMax1.constroi();
        ds.Item item5 = fPHeapMax1.max();
        fPHeapMax1.imprime();
        fPHeapMax1.constroi();
        fPHeapMax1.constroi();
        ds.FPHeapMax fPHeapMax10 = new ds.FPHeapMax((int) (short) 10);
        fPHeapMax10.constroi();
        ds.Item item12 = fPHeapMax10.max();
        fPHeapMax10.imprime();
        fPHeapMax10.refaz(10, (int) (byte) 1);
        ds.FPHeapMax fPHeapMax18 = new ds.FPHeapMax(100);
        ds.Item[] itemArray19 = new ds.Item[] {};
        fPHeapMax18.copia(itemArray19);
        fPHeapMax10.copia(itemArray19);
        fPHeapMax1.copia(itemArray19);
        ds.FPHeapMax fPHeapMax24 = new ds.FPHeapMax((int) (byte) 10);
        fPHeapMax24.imprime();
        ds.FPHeapMax fPHeapMax27 = new ds.FPHeapMax(100);
        ds.Item[] itemArray28 = new ds.Item[] {};
        fPHeapMax27.copia(itemArray28);
        fPHeapMax24.copia(itemArray28);
        fPHeapMax1.copia(itemArray28);
        // The following exception was thrown during execution in test generation
        try {
            ds.Item item32 = fPHeapMax1.retiraMax();
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: heap vazio");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(item3);
        org.junit.Assert.assertNull(item5);
        org.junit.Assert.assertNull(item12);
        org.junit.Assert.assertNotNull(itemArray19);
        org.junit.Assert.assertNotNull(itemArray28);
    }

    @Test
    public void test265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test265");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (short) 10);
        fPHeapMax1.constroi();
        ds.Item item3 = fPHeapMax1.max();
        fPHeapMax1.constroi();
        fPHeapMax1.constroi();
        ds.Item item6 = null;
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMax1.insere(item6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(item3);
    }

    @Test
    public void test266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test266");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (short) 10);
        ds.Item item2 = fPHeapMax1.max();
        fPHeapMax1.constroi();
        fPHeapMax1.constroi();
        fPHeapMax1.constroi();
        fPHeapMax1.refaz(0, (int) (short) -1);
        ds.Item item9 = null;
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMax1.insere(item9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(item2);
    }

    @Test
    public void test267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test267");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (short) 0);
        ds.FPHeapMax fPHeapMax3 = new ds.FPHeapMax((int) '#');
        fPHeapMax3.imprime();
        ds.Item item5 = fPHeapMax3.max();
        ds.Item item6 = null;
        ds.Item[] itemArray7 = new ds.Item[] { item6 };
        fPHeapMax3.copia(itemArray7);
        fPHeapMax1.copia(itemArray7);
        fPHeapMax1.constroi();
        fPHeapMax1.constroi();
        ds.FPHeapMax fPHeapMax13 = new ds.FPHeapMax((int) (short) 10);
        fPHeapMax13.constroi();
        ds.Item item15 = fPHeapMax13.max();
        fPHeapMax13.constroi();
        ds.Item item17 = fPHeapMax13.max();
        fPHeapMax13.imprime();
        ds.FPHeapMax fPHeapMax20 = new ds.FPHeapMax((int) '#');
        fPHeapMax20.imprime();
        ds.Item item22 = fPHeapMax20.max();
        ds.Item item23 = null;
        ds.Item[] itemArray24 = new ds.Item[] { item23 };
        fPHeapMax20.copia(itemArray24);
        fPHeapMax13.copia(itemArray24);
        fPHeapMax1.copia(itemArray24);
        fPHeapMax1.constroi();
        ds.Item item29 = null;
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMax1.insere(item29);
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: heap cheio");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(item5);
        org.junit.Assert.assertNotNull(itemArray7);
        org.junit.Assert.assertNull(item15);
        org.junit.Assert.assertNull(item17);
        org.junit.Assert.assertNull(item22);
        org.junit.Assert.assertNotNull(itemArray24);
    }

    @Test
    public void test268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test268");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) '#');
        fPHeapMax1.imprime();
        fPHeapMax1.constroi();
        fPHeapMax1.constroi();
        fPHeapMax1.imprime();
        fPHeapMax1.constroi();
        fPHeapMax1.constroi();
        ds.FPHeapMax fPHeapMax9 = new ds.FPHeapMax((int) (short) 10);
        fPHeapMax9.constroi();
        ds.Item item11 = fPHeapMax9.max();
        fPHeapMax9.constroi();
        ds.Item item13 = fPHeapMax9.max();
        fPHeapMax9.imprime();
        fPHeapMax9.constroi();
        fPHeapMax9.constroi();
        ds.FPHeapMax fPHeapMax18 = new ds.FPHeapMax((int) (short) 10);
        fPHeapMax18.constroi();
        ds.Item item20 = fPHeapMax18.max();
        fPHeapMax18.imprime();
        fPHeapMax18.refaz(10, (int) (byte) 1);
        ds.FPHeapMax fPHeapMax26 = new ds.FPHeapMax(100);
        ds.Item[] itemArray27 = new ds.Item[] {};
        fPHeapMax26.copia(itemArray27);
        fPHeapMax18.copia(itemArray27);
        fPHeapMax9.copia(itemArray27);
        fPHeapMax1.copia(itemArray27);
        fPHeapMax1.imprime();
        fPHeapMax1.imprime();
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMax1.refaz((int) (byte) 100, 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 100");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(item11);
        org.junit.Assert.assertNull(item13);
        org.junit.Assert.assertNull(item20);
        org.junit.Assert.assertNotNull(itemArray27);
    }

    @Test
    public void test269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test269");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (short) 10);
        fPHeapMax1.constroi();
        ds.Item item3 = fPHeapMax1.max();
        fPHeapMax1.imprime();
        fPHeapMax1.refaz(10, (int) (byte) 1);
        fPHeapMax1.imprime();
        fPHeapMax1.imprime();
        ds.Item item10 = null;
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMax1.insere(item10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(item3);
    }

    @Test
    public void test270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test270");
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
    public void test271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test271");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) '#');
        fPHeapMax1.imprime();
        fPHeapMax1.constroi();
        fPHeapMax1.constroi();
        fPHeapMax1.imprime();
        fPHeapMax1.refaz((int) (byte) 1, 1);
        ds.FPHeapMax fPHeapMax10 = new ds.FPHeapMax((int) (short) 10);
        fPHeapMax10.constroi();
        ds.Item item12 = fPHeapMax10.max();
        fPHeapMax10.constroi();
        ds.Item item14 = fPHeapMax10.max();
        ds.FPHeapMax fPHeapMax16 = new ds.FPHeapMax((int) '#');
        fPHeapMax16.imprime();
        ds.Item item18 = fPHeapMax16.max();
        ds.Item item19 = null;
        ds.Item[] itemArray20 = new ds.Item[] { item19 };
        fPHeapMax16.copia(itemArray20);
        fPHeapMax10.copia(itemArray20);
        fPHeapMax1.copia(itemArray20);
        ds.Item item24 = fPHeapMax1.max();
        ds.FPHeapMax fPHeapMax26 = new ds.FPHeapMax((int) (short) 10);
        fPHeapMax26.constroi();
        ds.Item item28 = fPHeapMax26.max();
        fPHeapMax26.constroi();
        ds.Item item30 = fPHeapMax26.max();
        fPHeapMax26.imprime();
        ds.Item[] itemArray32 = new ds.Item[] {};
        fPHeapMax26.copia(itemArray32);
        fPHeapMax26.constroi();
        ds.FPHeapMax fPHeapMax36 = new ds.FPHeapMax(100);
        ds.Item[] itemArray37 = new ds.Item[] {};
        fPHeapMax36.copia(itemArray37);
        fPHeapMax26.copia(itemArray37);
        fPHeapMax1.copia(itemArray37);
        ds.Item item41 = null;
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMax1.insere(item41);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(item12);
        org.junit.Assert.assertNull(item14);
        org.junit.Assert.assertNull(item18);
        org.junit.Assert.assertNotNull(itemArray20);
        org.junit.Assert.assertNull(item24);
        org.junit.Assert.assertNull(item28);
        org.junit.Assert.assertNull(item30);
        org.junit.Assert.assertNotNull(itemArray32);
        org.junit.Assert.assertNotNull(itemArray37);
    }

    @Test
    public void test272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test272");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) '#');
        fPHeapMax1.constroi();
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMax1.refaz((-1), (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test273");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) 'a');
        fPHeapMax1.imprime();
        fPHeapMax1.constroi();
        ds.FPHeapMax fPHeapMax5 = new ds.FPHeapMax((int) (short) 10);
        fPHeapMax5.constroi();
        ds.Item item7 = fPHeapMax5.max();
        fPHeapMax5.constroi();
        fPHeapMax5.imprime();
        ds.FPHeapMax fPHeapMax11 = new ds.FPHeapMax((int) '#');
        fPHeapMax11.imprime();
        ds.Item item13 = fPHeapMax11.max();
        ds.Item item14 = null;
        ds.Item[] itemArray15 = new ds.Item[] { item14 };
        fPHeapMax11.copia(itemArray15);
        fPHeapMax5.copia(itemArray15);
        ds.FPHeapMax fPHeapMax19 = new ds.FPHeapMax((int) (short) 10);
        fPHeapMax19.constroi();
        ds.Item item21 = fPHeapMax19.max();
        fPHeapMax19.constroi();
        fPHeapMax19.imprime();
        ds.FPHeapMax fPHeapMax25 = new ds.FPHeapMax((int) '#');
        fPHeapMax25.imprime();
        ds.Item item27 = fPHeapMax25.max();
        ds.Item item28 = null;
        ds.Item[] itemArray29 = new ds.Item[] { item28 };
        fPHeapMax25.copia(itemArray29);
        fPHeapMax19.copia(itemArray29);
        fPHeapMax5.copia(itemArray29);
        fPHeapMax1.copia(itemArray29);
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMax1.aumentaChave((int) (byte) 0, (java.lang.Object) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(item7);
        org.junit.Assert.assertNull(item13);
        org.junit.Assert.assertNotNull(itemArray15);
        org.junit.Assert.assertNull(item21);
        org.junit.Assert.assertNull(item27);
        org.junit.Assert.assertNotNull(itemArray29);
    }

    @Test
    public void test274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test274");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((-1));
        fPHeapMax1.imprime();
        // The following exception was thrown during execution in test generation
        try {
            ds.Item item3 = fPHeapMax1.max();
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test275");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (byte) 100);
        fPHeapMax1.imprime();
        ds.FPHeapMax fPHeapMax4 = new ds.FPHeapMax(1);
        ds.FPHeapMax fPHeapMax6 = new ds.FPHeapMax((int) (short) 10);
        fPHeapMax6.constroi();
        ds.Item item8 = fPHeapMax6.max();
        fPHeapMax6.constroi();
        ds.Item item10 = fPHeapMax6.max();
        fPHeapMax6.imprime();
        ds.Item[] itemArray12 = new ds.Item[] {};
        fPHeapMax6.copia(itemArray12);
        fPHeapMax4.copia(itemArray12);
        fPHeapMax1.copia(itemArray12);
        fPHeapMax1.constroi();
        ds.FPHeapMax fPHeapMax19 = new ds.FPHeapMax((int) (short) 0);
        ds.FPHeapMax fPHeapMax21 = new ds.FPHeapMax((int) '#');
        fPHeapMax21.imprime();
        ds.Item item23 = fPHeapMax21.max();
        ds.Item item24 = null;
        ds.Item[] itemArray25 = new ds.Item[] { item24 };
        fPHeapMax21.copia(itemArray25);
        fPHeapMax19.copia(itemArray25);
        fPHeapMax19.constroi();
        java.lang.Class<?> wildcardClass29 = fPHeapMax19.getClass();
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMax1.aumentaChave((int) 'a', (java.lang.Object) fPHeapMax19);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(item8);
        org.junit.Assert.assertNull(item10);
        org.junit.Assert.assertNotNull(itemArray12);
        org.junit.Assert.assertNull(item23);
        org.junit.Assert.assertNotNull(itemArray25);
        org.junit.Assert.assertNotNull(wildcardClass29);
    }

    @Test
    public void test276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test276");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) '#');
        fPHeapMax1.imprime();
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
        org.junit.Assert.assertNull(item3);
    }

    @Test
    public void test277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test277");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (short) 10);
        fPHeapMax1.constroi();
        ds.Item item3 = fPHeapMax1.max();
        fPHeapMax1.constroi();
        ds.Item item5 = fPHeapMax1.max();
        fPHeapMax1.imprime();
        ds.Item[] itemArray7 = new ds.Item[] {};
        fPHeapMax1.copia(itemArray7);
        fPHeapMax1.constroi();
        ds.Item item10 = fPHeapMax1.max();
        // The following exception was thrown during execution in test generation
        try {
            ds.Item item11 = fPHeapMax1.retiraMax();
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: heap vazio");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(item3);
        org.junit.Assert.assertNull(item5);
        org.junit.Assert.assertNotNull(itemArray7);
        org.junit.Assert.assertNull(item10);
    }

    @Test
    public void test278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test278");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (short) 10);
        fPHeapMax1.constroi();
        ds.Item item3 = fPHeapMax1.max();
        fPHeapMax1.constroi();
        ds.Item item5 = fPHeapMax1.max();
        fPHeapMax1.imprime();
        ds.Item item7 = fPHeapMax1.max();
        // The following exception was thrown during execution in test generation
        try {
            ds.Item item8 = fPHeapMax1.retiraMax();
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: heap vazio");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(item3);
        org.junit.Assert.assertNull(item5);
        org.junit.Assert.assertNull(item7);
    }

    @Test
    public void test279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test279");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (byte) 100);
        fPHeapMax1.imprime();
        fPHeapMax1.imprime();
        fPHeapMax1.constroi();
        ds.Item item5 = fPHeapMax1.max();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass6 = item5.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(item5);
    }

    @Test
    public void test280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test280");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) 'a');
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMax1.refaz((-1), (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test281");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) '#');
        ds.Item item2 = fPHeapMax1.max();
        fPHeapMax1.constroi();
        org.junit.Assert.assertNull(item2);
    }

    @Test
    public void test282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test282");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) '#');
        fPHeapMax1.refaz((int) (short) 0, (-1));
        fPHeapMax1.constroi();
        // The following exception was thrown during execution in test generation
        try {
            ds.Item item6 = fPHeapMax1.retiraMax();
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: heap vazio");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
    }

    @Test
    public void test283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test283");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (short) 10);
        fPHeapMax1.constroi();
        ds.Item item3 = fPHeapMax1.max();
        fPHeapMax1.constroi();
        ds.Item item5 = fPHeapMax1.max();
        fPHeapMax1.imprime();
        fPHeapMax1.constroi();
        fPHeapMax1.constroi();
        fPHeapMax1.imprime();
        // The following exception was thrown during execution in test generation
        try {
            ds.Item item10 = fPHeapMax1.retiraMax();
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: heap vazio");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(item3);
        org.junit.Assert.assertNull(item5);
    }

    @Test
    public void test284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test284");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (short) 10);
        fPHeapMax1.constroi();
        ds.Item item3 = fPHeapMax1.max();
        fPHeapMax1.imprime();
        fPHeapMax1.refaz(10, (int) (byte) 1);
        ds.Item item8 = fPHeapMax1.max();
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMax1.refaz((int) ' ', (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 32");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(item3);
        org.junit.Assert.assertNull(item8);
    }

    @Test
    public void test285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test285");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (short) 10);
        fPHeapMax1.constroi();
        ds.Item item3 = fPHeapMax1.max();
        fPHeapMax1.constroi();
        ds.Item item5 = fPHeapMax1.max();
        ds.FPHeapMax fPHeapMax7 = new ds.FPHeapMax((int) (short) 10);
        fPHeapMax7.constroi();
        ds.FPHeapMax fPHeapMax10 = new ds.FPHeapMax((int) (short) 10);
        fPHeapMax10.constroi();
        ds.Item item12 = fPHeapMax10.max();
        fPHeapMax10.constroi();
        ds.Item item14 = fPHeapMax10.max();
        fPHeapMax10.imprime();
        ds.Item[] itemArray16 = new ds.Item[] {};
        fPHeapMax10.copia(itemArray16);
        fPHeapMax7.copia(itemArray16);
        fPHeapMax1.copia(itemArray16);
        fPHeapMax1.constroi();
        ds.Item item21 = null;
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMax1.insere(item21);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(item3);
        org.junit.Assert.assertNull(item5);
        org.junit.Assert.assertNull(item12);
        org.junit.Assert.assertNull(item14);
        org.junit.Assert.assertNotNull(itemArray16);
    }

    @Test
    public void test286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test286");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (short) 10);
        fPHeapMax1.constroi();
        ds.Item item3 = fPHeapMax1.max();
        fPHeapMax1.constroi();
        fPHeapMax1.constroi();
        ds.Item item6 = fPHeapMax1.max();
        ds.FPHeapMax fPHeapMax8 = new ds.FPHeapMax((int) '#');
        fPHeapMax8.imprime();
        fPHeapMax8.constroi();
        fPHeapMax8.constroi();
        ds.FPHeapMax fPHeapMax13 = new ds.FPHeapMax((int) '#');
        fPHeapMax13.imprime();
        ds.Item item15 = fPHeapMax13.max();
        ds.Item item16 = null;
        ds.Item[] itemArray17 = new ds.Item[] { item16 };
        fPHeapMax13.copia(itemArray17);
        fPHeapMax8.copia(itemArray17);
        fPHeapMax1.copia(itemArray17);
        // The following exception was thrown during execution in test generation
        try {
            ds.Item item21 = fPHeapMax1.retiraMax();
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: heap vazio");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(item3);
        org.junit.Assert.assertNull(item6);
        org.junit.Assert.assertNull(item15);
        org.junit.Assert.assertNotNull(itemArray17);
    }

    @Test
    public void test287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test287");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (byte) 100);
        fPHeapMax1.imprime();
        fPHeapMax1.imprime();
        fPHeapMax1.constroi();
        ds.Item item5 = fPHeapMax1.max();
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMax1.refaz((-1), (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(item5);
    }

    @Test
    public void test288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test288");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (short) 10);
        fPHeapMax1.constroi();
        ds.Item item3 = fPHeapMax1.max();
        fPHeapMax1.constroi();
        fPHeapMax1.refaz((int) (byte) 10, 0);
        fPHeapMax1.constroi();
        ds.FPHeapMax fPHeapMax11 = new ds.FPHeapMax((int) (byte) 100);
        fPHeapMax11.imprime();
        fPHeapMax11.imprime();
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMax1.aumentaChave(100, (java.lang.Object) fPHeapMax11);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 100");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(item3);
    }

    @Test
    public void test289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test289");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (short) 10);
        fPHeapMax1.constroi();
        ds.Item item3 = fPHeapMax1.max();
        fPHeapMax1.constroi();
        fPHeapMax1.constroi();
        ds.Item item6 = fPHeapMax1.max();
        fPHeapMax1.constroi();
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMax1.refaz((int) (byte) -1, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(item3);
        org.junit.Assert.assertNull(item6);
    }

    @Test
    public void test290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test290");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (short) 10);
        fPHeapMax1.constroi();
        ds.Item item3 = fPHeapMax1.max();
        fPHeapMax1.constroi();
        ds.Item item5 = fPHeapMax1.max();
        fPHeapMax1.imprime();
        fPHeapMax1.constroi();
        fPHeapMax1.constroi();
        ds.FPHeapMax fPHeapMax10 = new ds.FPHeapMax((int) (short) 10);
        fPHeapMax10.constroi();
        ds.Item item12 = fPHeapMax10.max();
        fPHeapMax10.imprime();
        fPHeapMax10.refaz(10, (int) (byte) 1);
        ds.FPHeapMax fPHeapMax18 = new ds.FPHeapMax(100);
        ds.Item[] itemArray19 = new ds.Item[] {};
        fPHeapMax18.copia(itemArray19);
        fPHeapMax10.copia(itemArray19);
        fPHeapMax1.copia(itemArray19);
        fPHeapMax1.constroi();
        // The following exception was thrown during execution in test generation
        try {
            ds.Item item24 = fPHeapMax1.retiraMax();
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: heap vazio");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(item3);
        org.junit.Assert.assertNull(item5);
        org.junit.Assert.assertNull(item12);
        org.junit.Assert.assertNotNull(itemArray19);
    }

    @Test
    public void test291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test291");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (short) 10);
        fPHeapMax1.constroi();
        ds.Item item3 = fPHeapMax1.max();
        fPHeapMax1.constroi();
        ds.Item item5 = fPHeapMax1.max();
        ds.FPHeapMax fPHeapMax7 = new ds.FPHeapMax((int) '#');
        fPHeapMax7.imprime();
        ds.Item item9 = fPHeapMax7.max();
        ds.Item item10 = null;
        ds.Item[] itemArray11 = new ds.Item[] { item10 };
        fPHeapMax7.copia(itemArray11);
        fPHeapMax1.copia(itemArray11);
        fPHeapMax1.imprime();
        ds.FPHeapMax fPHeapMax17 = new ds.FPHeapMax((int) '#');
        fPHeapMax17.imprime();
        fPHeapMax17.constroi();
        fPHeapMax17.constroi();
        fPHeapMax17.imprime();
        ds.FPHeapMax fPHeapMax23 = new ds.FPHeapMax((int) (byte) 100);
        ds.FPHeapMax fPHeapMax25 = new ds.FPHeapMax(1);
        ds.FPHeapMax fPHeapMax27 = new ds.FPHeapMax((int) (short) 10);
        fPHeapMax27.constroi();
        ds.Item item29 = fPHeapMax27.max();
        fPHeapMax27.constroi();
        ds.Item item31 = fPHeapMax27.max();
        fPHeapMax27.imprime();
        ds.Item[] itemArray33 = new ds.Item[] {};
        fPHeapMax27.copia(itemArray33);
        fPHeapMax25.copia(itemArray33);
        fPHeapMax23.copia(itemArray33);
        fPHeapMax17.copia(itemArray33);
        fPHeapMax17.imprime();
        fPHeapMax17.constroi();
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMax1.aumentaChave((int) '#', (java.lang.Object) fPHeapMax17);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 35");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(item3);
        org.junit.Assert.assertNull(item5);
        org.junit.Assert.assertNull(item9);
        org.junit.Assert.assertNotNull(itemArray11);
        org.junit.Assert.assertNull(item29);
        org.junit.Assert.assertNull(item31);
        org.junit.Assert.assertNotNull(itemArray33);
    }

    @Test
    public void test292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test292");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (short) 10);
        fPHeapMax1.constroi();
        ds.Item item3 = fPHeapMax1.max();
        fPHeapMax1.imprime();
        fPHeapMax1.constroi();
        // The following exception was thrown during execution in test generation
        try {
            ds.Item item6 = fPHeapMax1.retiraMax();
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: heap vazio");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(item3);
    }

    @Test
    public void test293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test293");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) '#');
        fPHeapMax1.imprime();
        fPHeapMax1.constroi();
        fPHeapMax1.constroi();
        fPHeapMax1.imprime();
        fPHeapMax1.refaz((int) (byte) 1, 1);
        ds.FPHeapMax fPHeapMax10 = new ds.FPHeapMax((int) (short) 10);
        fPHeapMax10.constroi();
        ds.Item item12 = fPHeapMax10.max();
        fPHeapMax10.constroi();
        ds.Item item14 = fPHeapMax10.max();
        ds.FPHeapMax fPHeapMax16 = new ds.FPHeapMax((int) '#');
        fPHeapMax16.imprime();
        ds.Item item18 = fPHeapMax16.max();
        ds.Item item19 = null;
        ds.Item[] itemArray20 = new ds.Item[] { item19 };
        fPHeapMax16.copia(itemArray20);
        fPHeapMax10.copia(itemArray20);
        fPHeapMax1.copia(itemArray20);
        ds.Item item24 = fPHeapMax1.max();
        ds.FPHeapMax fPHeapMax26 = new ds.FPHeapMax((int) '#');
        fPHeapMax26.imprime();
        fPHeapMax26.constroi();
        fPHeapMax26.constroi();
        fPHeapMax26.imprime();
        fPHeapMax26.refaz((int) (byte) 1, 1);
        ds.FPHeapMax fPHeapMax35 = new ds.FPHeapMax((int) (short) 10);
        fPHeapMax35.constroi();
        ds.Item item37 = fPHeapMax35.max();
        fPHeapMax35.constroi();
        ds.Item item39 = fPHeapMax35.max();
        ds.FPHeapMax fPHeapMax41 = new ds.FPHeapMax((int) '#');
        fPHeapMax41.imprime();
        ds.Item item43 = fPHeapMax41.max();
        ds.Item item44 = null;
        ds.Item[] itemArray45 = new ds.Item[] { item44 };
        fPHeapMax41.copia(itemArray45);
        fPHeapMax35.copia(itemArray45);
        fPHeapMax26.copia(itemArray45);
        fPHeapMax1.copia(itemArray45);
        fPHeapMax1.constroi();
        java.lang.Class<?> wildcardClass51 = fPHeapMax1.getClass();
        org.junit.Assert.assertNull(item12);
        org.junit.Assert.assertNull(item14);
        org.junit.Assert.assertNull(item18);
        org.junit.Assert.assertNotNull(itemArray20);
        org.junit.Assert.assertNull(item24);
        org.junit.Assert.assertNull(item37);
        org.junit.Assert.assertNull(item39);
        org.junit.Assert.assertNull(item43);
        org.junit.Assert.assertNotNull(itemArray45);
        org.junit.Assert.assertNotNull(wildcardClass51);
    }

    @Test
    public void test294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test294");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (short) 10);
        fPHeapMax1.constroi();
        ds.Item item3 = fPHeapMax1.max();
        fPHeapMax1.constroi();
        ds.Item item5 = fPHeapMax1.max();
        fPHeapMax1.imprime();
        fPHeapMax1.constroi();
        fPHeapMax1.constroi();
        fPHeapMax1.refaz((int) (short) 10, (-1));
        ds.Item item12 = fPHeapMax1.max();
        org.junit.Assert.assertNull(item3);
        org.junit.Assert.assertNull(item5);
        org.junit.Assert.assertNull(item12);
    }

    @Test
    public void test295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test295");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (short) 10);
        fPHeapMax1.refaz((int) (short) 1, 0);
        ds.Item item5 = fPHeapMax1.max();
        fPHeapMax1.imprime();
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMax1.refaz(10, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 20");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(item5);
    }

    @Test
    public void test296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test296");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((-1));
        ds.FPHeapMax fPHeapMax3 = new ds.FPHeapMax((int) '#');
        fPHeapMax3.refaz((int) (short) 0, (-1));
        fPHeapMax3.constroi();
        ds.FPHeapMax fPHeapMax9 = new ds.FPHeapMax((int) '#');
        fPHeapMax9.imprime();
        ds.Item item11 = fPHeapMax9.max();
        ds.Item item12 = null;
        ds.Item[] itemArray13 = new ds.Item[] { item12 };
        fPHeapMax9.copia(itemArray13);
        ds.Item item15 = fPHeapMax9.max();
        ds.FPHeapMax fPHeapMax17 = new ds.FPHeapMax((int) (byte) 10);
        fPHeapMax17.imprime();
        ds.FPHeapMax fPHeapMax20 = new ds.FPHeapMax(100);
        ds.Item[] itemArray21 = new ds.Item[] {};
        fPHeapMax20.copia(itemArray21);
        fPHeapMax17.copia(itemArray21);
        ds.FPHeapMax fPHeapMax25 = new ds.FPHeapMax(100);
        ds.Item[] itemArray26 = new ds.Item[] {};
        fPHeapMax25.copia(itemArray26);
        ds.FPHeapMax fPHeapMax29 = new ds.FPHeapMax((int) (short) 10);
        fPHeapMax29.constroi();
        ds.Item item31 = fPHeapMax29.max();
        fPHeapMax29.constroi();
        ds.Item item33 = fPHeapMax29.max();
        fPHeapMax29.imprime();
        ds.Item[] itemArray35 = new ds.Item[] {};
        fPHeapMax29.copia(itemArray35);
        fPHeapMax29.constroi();
        ds.FPHeapMax fPHeapMax39 = new ds.FPHeapMax(100);
        ds.Item[] itemArray40 = new ds.Item[] {};
        fPHeapMax39.copia(itemArray40);
        fPHeapMax29.copia(itemArray40);
        fPHeapMax25.copia(itemArray40);
        fPHeapMax17.copia(itemArray40);
        fPHeapMax9.copia(itemArray40);
        fPHeapMax3.copia(itemArray40);
        fPHeapMax1.copia(itemArray40);
        // The following exception was thrown during execution in test generation
        try {
            ds.Item item48 = fPHeapMax1.retiraMax();
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: heap vazio");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(item11);
        org.junit.Assert.assertNotNull(itemArray13);
        org.junit.Assert.assertNull(item15);
        org.junit.Assert.assertNotNull(itemArray21);
        org.junit.Assert.assertNotNull(itemArray26);
        org.junit.Assert.assertNull(item31);
        org.junit.Assert.assertNull(item33);
        org.junit.Assert.assertNotNull(itemArray35);
        org.junit.Assert.assertNotNull(itemArray40);
    }

    @Test
    public void test297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test297");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (short) 10);
        fPHeapMax1.constroi();
        ds.Item item3 = fPHeapMax1.max();
        fPHeapMax1.constroi();
        ds.Item item5 = fPHeapMax1.max();
        ds.FPHeapMax fPHeapMax7 = new ds.FPHeapMax((int) '#');
        fPHeapMax7.imprime();
        ds.Item item9 = fPHeapMax7.max();
        ds.Item item10 = null;
        ds.Item[] itemArray11 = new ds.Item[] { item10 };
        fPHeapMax7.copia(itemArray11);
        fPHeapMax1.copia(itemArray11);
        ds.Item item14 = fPHeapMax1.max();
        fPHeapMax1.constroi();
        fPHeapMax1.constroi();
        ds.FPHeapMax fPHeapMax19 = new ds.FPHeapMax((int) (byte) 100);
        fPHeapMax19.imprime();
        fPHeapMax19.imprime();
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMax1.aumentaChave(0, (java.lang.Object) fPHeapMax19);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(item3);
        org.junit.Assert.assertNull(item5);
        org.junit.Assert.assertNull(item9);
        org.junit.Assert.assertNotNull(itemArray11);
        org.junit.Assert.assertNull(item14);
    }

    @Test
    public void test298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test298");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (byte) 10);
        fPHeapMax1.constroi();
        ds.Item item3 = fPHeapMax1.max();
        ds.Item item4 = fPHeapMax1.max();
        org.junit.Assert.assertNull(item3);
        org.junit.Assert.assertNull(item4);
    }

    @Test
    public void test299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test299");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (byte) 100);
        fPHeapMax1.imprime();
        fPHeapMax1.imprime();
        ds.Item item4 = fPHeapMax1.max();
        fPHeapMax1.constroi();
        ds.Item item6 = fPHeapMax1.max();
        fPHeapMax1.imprime();
        java.lang.Class<?> wildcardClass8 = fPHeapMax1.getClass();
        org.junit.Assert.assertNull(item4);
        org.junit.Assert.assertNull(item6);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test300");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) '#');
        fPHeapMax1.imprime();
        fPHeapMax1.constroi();
        fPHeapMax1.constroi();
        fPHeapMax1.imprime();
        ds.Item item6 = fPHeapMax1.max();
        org.junit.Assert.assertNull(item6);
    }

    @Test
    public void test301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test301");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (short) 10);
        ds.Item item2 = fPHeapMax1.max();
        fPHeapMax1.imprime();
        ds.FPHeapMax fPHeapMax5 = new ds.FPHeapMax(100);
        ds.Item[] itemArray6 = new ds.Item[] {};
        fPHeapMax5.copia(itemArray6);
        fPHeapMax1.copia(itemArray6);
        ds.Item item9 = null;
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMax1.insere(item9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(item2);
        org.junit.Assert.assertNotNull(itemArray6);
    }

    @Test
    public void test302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test302");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) '#');
        fPHeapMax1.refaz((int) (short) 0, (-1));
        ds.FPHeapMax fPHeapMax6 = new ds.FPHeapMax((int) (byte) 100);
        fPHeapMax6.imprime();
        ds.FPHeapMax fPHeapMax9 = new ds.FPHeapMax(1);
        ds.FPHeapMax fPHeapMax11 = new ds.FPHeapMax((int) (short) 10);
        fPHeapMax11.constroi();
        ds.Item item13 = fPHeapMax11.max();
        fPHeapMax11.constroi();
        ds.Item item15 = fPHeapMax11.max();
        fPHeapMax11.imprime();
        ds.Item[] itemArray17 = new ds.Item[] {};
        fPHeapMax11.copia(itemArray17);
        fPHeapMax9.copia(itemArray17);
        fPHeapMax6.copia(itemArray17);
        fPHeapMax1.copia(itemArray17);
        java.lang.Class<?> wildcardClass22 = fPHeapMax1.getClass();
        org.junit.Assert.assertNull(item13);
        org.junit.Assert.assertNull(item15);
        org.junit.Assert.assertNotNull(itemArray17);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test303");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (short) 10);
        fPHeapMax1.constroi();
        ds.Item item3 = fPHeapMax1.max();
        fPHeapMax1.constroi();
        ds.Item item5 = fPHeapMax1.max();
        fPHeapMax1.imprime();
        ds.FPHeapMax fPHeapMax8 = new ds.FPHeapMax((int) (byte) 100);
        ds.FPHeapMax fPHeapMax10 = new ds.FPHeapMax(1);
        ds.FPHeapMax fPHeapMax12 = new ds.FPHeapMax((int) (short) 10);
        fPHeapMax12.constroi();
        ds.Item item14 = fPHeapMax12.max();
        fPHeapMax12.constroi();
        ds.Item item16 = fPHeapMax12.max();
        fPHeapMax12.imprime();
        ds.Item[] itemArray18 = new ds.Item[] {};
        fPHeapMax12.copia(itemArray18);
        fPHeapMax10.copia(itemArray18);
        fPHeapMax8.copia(itemArray18);
        ds.FPHeapMax fPHeapMax23 = new ds.FPHeapMax((int) '#');
        fPHeapMax23.imprime();
        fPHeapMax23.constroi();
        fPHeapMax23.constroi();
        fPHeapMax23.imprime();
        ds.FPHeapMax fPHeapMax29 = new ds.FPHeapMax((int) (byte) 100);
        ds.FPHeapMax fPHeapMax31 = new ds.FPHeapMax(1);
        ds.FPHeapMax fPHeapMax33 = new ds.FPHeapMax((int) (short) 10);
        fPHeapMax33.constroi();
        ds.Item item35 = fPHeapMax33.max();
        fPHeapMax33.constroi();
        ds.Item item37 = fPHeapMax33.max();
        fPHeapMax33.imprime();
        ds.Item[] itemArray39 = new ds.Item[] {};
        fPHeapMax33.copia(itemArray39);
        fPHeapMax31.copia(itemArray39);
        fPHeapMax29.copia(itemArray39);
        fPHeapMax23.copia(itemArray39);
        fPHeapMax8.copia(itemArray39);
        fPHeapMax1.copia(itemArray39);
        // The following exception was thrown during execution in test generation
        try {
            ds.Item item46 = fPHeapMax1.retiraMax();
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: heap vazio");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(item3);
        org.junit.Assert.assertNull(item5);
        org.junit.Assert.assertNull(item14);
        org.junit.Assert.assertNull(item16);
        org.junit.Assert.assertNotNull(itemArray18);
        org.junit.Assert.assertNull(item35);
        org.junit.Assert.assertNull(item37);
        org.junit.Assert.assertNotNull(itemArray39);
    }

    @Test
    public void test304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test304");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (short) 10);
        fPHeapMax1.constroi();
        ds.Item item3 = fPHeapMax1.max();
        fPHeapMax1.constroi();
        ds.Item item5 = fPHeapMax1.max();
        ds.FPHeapMax fPHeapMax7 = new ds.FPHeapMax((int) '#');
        fPHeapMax7.imprime();
        ds.Item item9 = fPHeapMax7.max();
        ds.Item item10 = null;
        ds.Item[] itemArray11 = new ds.Item[] { item10 };
        fPHeapMax7.copia(itemArray11);
        fPHeapMax1.copia(itemArray11);
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
        org.junit.Assert.assertNull(item3);
        org.junit.Assert.assertNull(item5);
        org.junit.Assert.assertNull(item9);
        org.junit.Assert.assertNotNull(itemArray11);
        org.junit.Assert.assertNull(item14);
    }

    @Test
    public void test305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test305");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (short) 10);
        fPHeapMax1.refaz((int) (short) 1, 0);
        fPHeapMax1.imprime();
        ds.FPHeapMax fPHeapMax8 = new ds.FPHeapMax((int) (short) 10);
        fPHeapMax8.constroi();
        ds.Item item10 = fPHeapMax8.max();
        fPHeapMax8.constroi();
        ds.Item item12 = fPHeapMax8.max();
        fPHeapMax8.imprime();
        ds.Item item14 = fPHeapMax8.max();
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMax1.aumentaChave((int) ' ', (java.lang.Object) item14);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 32");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(item10);
        org.junit.Assert.assertNull(item12);
        org.junit.Assert.assertNull(item14);
    }

    @Test
    public void test306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test306");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (short) 10);
        fPHeapMax1.constroi();
        ds.FPHeapMax fPHeapMax5 = new ds.FPHeapMax((int) '#');
        fPHeapMax5.imprime();
        fPHeapMax5.constroi();
        fPHeapMax5.constroi();
        fPHeapMax5.imprime();
        fPHeapMax5.refaz((int) (byte) 1, 1);
        ds.FPHeapMax fPHeapMax14 = new ds.FPHeapMax((int) (short) 10);
        fPHeapMax14.constroi();
        ds.Item item16 = fPHeapMax14.max();
        fPHeapMax14.constroi();
        ds.Item item18 = fPHeapMax14.max();
        ds.FPHeapMax fPHeapMax20 = new ds.FPHeapMax((int) '#');
        fPHeapMax20.imprime();
        ds.Item item22 = fPHeapMax20.max();
        ds.Item item23 = null;
        ds.Item[] itemArray24 = new ds.Item[] { item23 };
        fPHeapMax20.copia(itemArray24);
        fPHeapMax14.copia(itemArray24);
        fPHeapMax5.copia(itemArray24);
        ds.Item item28 = fPHeapMax5.max();
        ds.FPHeapMax fPHeapMax30 = new ds.FPHeapMax((int) '#');
        fPHeapMax30.imprime();
        fPHeapMax30.constroi();
        fPHeapMax30.constroi();
        fPHeapMax30.imprime();
        fPHeapMax30.refaz((int) (byte) 1, 1);
        ds.FPHeapMax fPHeapMax39 = new ds.FPHeapMax((int) (short) 10);
        fPHeapMax39.constroi();
        ds.Item item41 = fPHeapMax39.max();
        fPHeapMax39.constroi();
        ds.Item item43 = fPHeapMax39.max();
        ds.FPHeapMax fPHeapMax45 = new ds.FPHeapMax((int) '#');
        fPHeapMax45.imprime();
        ds.Item item47 = fPHeapMax45.max();
        ds.Item item48 = null;
        ds.Item[] itemArray49 = new ds.Item[] { item48 };
        fPHeapMax45.copia(itemArray49);
        fPHeapMax39.copia(itemArray49);
        fPHeapMax30.copia(itemArray49);
        fPHeapMax5.copia(itemArray49);
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMax1.aumentaChave((int) 'a', (java.lang.Object) fPHeapMax5);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 97");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(item16);
        org.junit.Assert.assertNull(item18);
        org.junit.Assert.assertNull(item22);
        org.junit.Assert.assertNotNull(itemArray24);
        org.junit.Assert.assertNull(item28);
        org.junit.Assert.assertNull(item41);
        org.junit.Assert.assertNull(item43);
        org.junit.Assert.assertNull(item47);
        org.junit.Assert.assertNotNull(itemArray49);
    }

    @Test
    public void test307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test307");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) '#');
        fPHeapMax1.imprime();
        fPHeapMax1.constroi();
        fPHeapMax1.constroi();
        fPHeapMax1.imprime();
        fPHeapMax1.constroi();
        fPHeapMax1.constroi();
        ds.FPHeapMax fPHeapMax9 = new ds.FPHeapMax((int) (short) 10);
        fPHeapMax9.constroi();
        ds.Item item11 = fPHeapMax9.max();
        fPHeapMax9.constroi();
        ds.Item item13 = fPHeapMax9.max();
        fPHeapMax9.imprime();
        fPHeapMax9.constroi();
        fPHeapMax9.constroi();
        ds.FPHeapMax fPHeapMax18 = new ds.FPHeapMax((int) (short) 10);
        fPHeapMax18.constroi();
        ds.Item item20 = fPHeapMax18.max();
        fPHeapMax18.imprime();
        fPHeapMax18.refaz(10, (int) (byte) 1);
        ds.FPHeapMax fPHeapMax26 = new ds.FPHeapMax(100);
        ds.Item[] itemArray27 = new ds.Item[] {};
        fPHeapMax26.copia(itemArray27);
        fPHeapMax18.copia(itemArray27);
        fPHeapMax9.copia(itemArray27);
        fPHeapMax1.copia(itemArray27);
        fPHeapMax1.imprime();
        // The following exception was thrown during execution in test generation
        try {
            ds.Item item33 = fPHeapMax1.retiraMax();
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: heap vazio");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(item11);
        org.junit.Assert.assertNull(item13);
        org.junit.Assert.assertNull(item20);
        org.junit.Assert.assertNotNull(itemArray27);
    }

    @Test
    public void test308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test308");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (short) 10);
        fPHeapMax1.constroi();
        ds.Item item3 = fPHeapMax1.max();
        fPHeapMax1.constroi();
        ds.Item item5 = fPHeapMax1.max();
        fPHeapMax1.imprime();
        ds.Item[] itemArray7 = new ds.Item[] {};
        fPHeapMax1.copia(itemArray7);
        fPHeapMax1.constroi();
        fPHeapMax1.constroi();
        // The following exception was thrown during execution in test generation
        try {
            ds.Item item11 = fPHeapMax1.retiraMax();
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: heap vazio");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(item3);
        org.junit.Assert.assertNull(item5);
        org.junit.Assert.assertNotNull(itemArray7);
    }

    @Test
    public void test309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test309");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (short) 10);
        fPHeapMax1.constroi();
        ds.Item item3 = fPHeapMax1.max();
        fPHeapMax1.constroi();
        ds.Item item5 = fPHeapMax1.max();
        ds.FPHeapMax fPHeapMax7 = new ds.FPHeapMax((int) (short) 10);
        fPHeapMax7.constroi();
        ds.FPHeapMax fPHeapMax10 = new ds.FPHeapMax((int) (short) 10);
        fPHeapMax10.constroi();
        ds.Item item12 = fPHeapMax10.max();
        fPHeapMax10.constroi();
        ds.Item item14 = fPHeapMax10.max();
        fPHeapMax10.imprime();
        ds.Item[] itemArray16 = new ds.Item[] {};
        fPHeapMax10.copia(itemArray16);
        fPHeapMax7.copia(itemArray16);
        fPHeapMax1.copia(itemArray16);
        fPHeapMax1.imprime();
        org.junit.Assert.assertNull(item3);
        org.junit.Assert.assertNull(item5);
        org.junit.Assert.assertNull(item12);
        org.junit.Assert.assertNull(item14);
        org.junit.Assert.assertNotNull(itemArray16);
    }

    @Test
    public void test310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test310");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (short) 0);
        ds.FPHeapMax fPHeapMax3 = new ds.FPHeapMax((int) '#');
        fPHeapMax3.imprime();
        ds.Item item5 = fPHeapMax3.max();
        ds.Item item6 = null;
        ds.Item[] itemArray7 = new ds.Item[] { item6 };
        fPHeapMax3.copia(itemArray7);
        fPHeapMax1.copia(itemArray7);
        fPHeapMax1.constroi();
        fPHeapMax1.constroi();
        ds.FPHeapMax fPHeapMax13 = new ds.FPHeapMax((int) (short) 10);
        fPHeapMax13.constroi();
        ds.Item item15 = fPHeapMax13.max();
        fPHeapMax13.constroi();
        ds.Item item17 = fPHeapMax13.max();
        fPHeapMax13.imprime();
        ds.FPHeapMax fPHeapMax20 = new ds.FPHeapMax((int) '#');
        fPHeapMax20.imprime();
        ds.Item item22 = fPHeapMax20.max();
        ds.Item item23 = null;
        ds.Item[] itemArray24 = new ds.Item[] { item23 };
        fPHeapMax20.copia(itemArray24);
        fPHeapMax13.copia(itemArray24);
        fPHeapMax1.copia(itemArray24);
        fPHeapMax1.constroi();
        fPHeapMax1.constroi();
        org.junit.Assert.assertNull(item5);
        org.junit.Assert.assertNotNull(itemArray7);
        org.junit.Assert.assertNull(item15);
        org.junit.Assert.assertNull(item17);
        org.junit.Assert.assertNull(item22);
        org.junit.Assert.assertNotNull(itemArray24);
    }

    @Test
    public void test311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test311");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) '#');
        fPHeapMax1.imprime();
        fPHeapMax1.constroi();
        fPHeapMax1.constroi();
        fPHeapMax1.imprime();
        fPHeapMax1.refaz((int) (byte) 1, 1);
        ds.FPHeapMax fPHeapMax10 = new ds.FPHeapMax((int) (short) 10);
        fPHeapMax10.constroi();
        ds.Item item12 = fPHeapMax10.max();
        fPHeapMax10.constroi();
        ds.Item item14 = fPHeapMax10.max();
        ds.FPHeapMax fPHeapMax16 = new ds.FPHeapMax((int) '#');
        fPHeapMax16.imprime();
        ds.Item item18 = fPHeapMax16.max();
        ds.Item item19 = null;
        ds.Item[] itemArray20 = new ds.Item[] { item19 };
        fPHeapMax16.copia(itemArray20);
        fPHeapMax10.copia(itemArray20);
        fPHeapMax1.copia(itemArray20);
        ds.Item item24 = fPHeapMax1.max();
        ds.FPHeapMax fPHeapMax26 = new ds.FPHeapMax((int) (short) 10);
        fPHeapMax26.constroi();
        ds.Item item28 = fPHeapMax26.max();
        fPHeapMax26.constroi();
        ds.Item item30 = fPHeapMax26.max();
        fPHeapMax26.imprime();
        ds.Item[] itemArray32 = new ds.Item[] {};
        fPHeapMax26.copia(itemArray32);
        fPHeapMax26.constroi();
        ds.FPHeapMax fPHeapMax36 = new ds.FPHeapMax(100);
        ds.Item[] itemArray37 = new ds.Item[] {};
        fPHeapMax36.copia(itemArray37);
        fPHeapMax26.copia(itemArray37);
        fPHeapMax1.copia(itemArray37);
        // The following exception was thrown during execution in test generation
        try {
            ds.Item item41 = fPHeapMax1.retiraMax();
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: heap vazio");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(item12);
        org.junit.Assert.assertNull(item14);
        org.junit.Assert.assertNull(item18);
        org.junit.Assert.assertNotNull(itemArray20);
        org.junit.Assert.assertNull(item24);
        org.junit.Assert.assertNull(item28);
        org.junit.Assert.assertNull(item30);
        org.junit.Assert.assertNotNull(itemArray32);
        org.junit.Assert.assertNotNull(itemArray37);
    }

    @Test
    public void test312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test312");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (byte) 0);
        ds.FPHeapMax fPHeapMax3 = new ds.FPHeapMax((int) (short) 10);
        fPHeapMax3.constroi();
        ds.Item item5 = fPHeapMax3.max();
        fPHeapMax3.constroi();
        ds.Item item7 = fPHeapMax3.max();
        fPHeapMax3.imprime();
        ds.Item[] itemArray9 = new ds.Item[] {};
        fPHeapMax3.copia(itemArray9);
        fPHeapMax3.constroi();
        ds.Item item12 = fPHeapMax3.max();
        ds.Item[] itemArray13 = new ds.Item[] {};
        fPHeapMax3.copia(itemArray13);
        fPHeapMax1.copia(itemArray13);
        ds.FPHeapMax fPHeapMax17 = new ds.FPHeapMax((int) '#');
        fPHeapMax17.refaz((int) (short) 0, (-1));
        ds.FPHeapMax fPHeapMax22 = new ds.FPHeapMax((int) (byte) 100);
        fPHeapMax22.imprime();
        ds.FPHeapMax fPHeapMax25 = new ds.FPHeapMax(1);
        ds.FPHeapMax fPHeapMax27 = new ds.FPHeapMax((int) (short) 10);
        fPHeapMax27.constroi();
        ds.Item item29 = fPHeapMax27.max();
        fPHeapMax27.constroi();
        ds.Item item31 = fPHeapMax27.max();
        fPHeapMax27.imprime();
        ds.Item[] itemArray33 = new ds.Item[] {};
        fPHeapMax27.copia(itemArray33);
        fPHeapMax25.copia(itemArray33);
        fPHeapMax22.copia(itemArray33);
        fPHeapMax17.copia(itemArray33);
        fPHeapMax1.copia(itemArray33);
        java.lang.Class<?> wildcardClass39 = fPHeapMax1.getClass();
        org.junit.Assert.assertNull(item5);
        org.junit.Assert.assertNull(item7);
        org.junit.Assert.assertNotNull(itemArray9);
        org.junit.Assert.assertNull(item12);
        org.junit.Assert.assertNotNull(itemArray13);
        org.junit.Assert.assertNull(item29);
        org.junit.Assert.assertNull(item31);
        org.junit.Assert.assertNotNull(itemArray33);
        org.junit.Assert.assertNotNull(wildcardClass39);
    }

    @Test
    public void test313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test313");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (byte) 100);
        fPHeapMax1.imprime();
        fPHeapMax1.imprime();
        ds.Item item4 = fPHeapMax1.max();
        fPHeapMax1.constroi();
        fPHeapMax1.imprime();
        ds.FPHeapMax fPHeapMax8 = new ds.FPHeapMax(10);
        ds.FPHeapMax fPHeapMax10 = new ds.FPHeapMax((int) '#');
        fPHeapMax10.imprime();
        ds.Item item12 = fPHeapMax10.max();
        ds.Item item13 = null;
        ds.Item[] itemArray14 = new ds.Item[] { item13 };
        fPHeapMax10.copia(itemArray14);
        ds.Item item16 = fPHeapMax10.max();
        ds.FPHeapMax fPHeapMax18 = new ds.FPHeapMax((int) (byte) 10);
        fPHeapMax18.imprime();
        ds.FPHeapMax fPHeapMax21 = new ds.FPHeapMax(100);
        ds.Item[] itemArray22 = new ds.Item[] {};
        fPHeapMax21.copia(itemArray22);
        fPHeapMax18.copia(itemArray22);
        ds.FPHeapMax fPHeapMax26 = new ds.FPHeapMax(100);
        ds.Item[] itemArray27 = new ds.Item[] {};
        fPHeapMax26.copia(itemArray27);
        ds.FPHeapMax fPHeapMax30 = new ds.FPHeapMax((int) (short) 10);
        fPHeapMax30.constroi();
        ds.Item item32 = fPHeapMax30.max();
        fPHeapMax30.constroi();
        ds.Item item34 = fPHeapMax30.max();
        fPHeapMax30.imprime();
        ds.Item[] itemArray36 = new ds.Item[] {};
        fPHeapMax30.copia(itemArray36);
        fPHeapMax30.constroi();
        ds.FPHeapMax fPHeapMax40 = new ds.FPHeapMax(100);
        ds.Item[] itemArray41 = new ds.Item[] {};
        fPHeapMax40.copia(itemArray41);
        fPHeapMax30.copia(itemArray41);
        fPHeapMax26.copia(itemArray41);
        fPHeapMax18.copia(itemArray41);
        fPHeapMax10.copia(itemArray41);
        fPHeapMax8.copia(itemArray41);
        ds.FPHeapMax fPHeapMax49 = new ds.FPHeapMax((int) (short) 10);
        fPHeapMax49.constroi();
        ds.Item item51 = fPHeapMax49.max();
        fPHeapMax49.constroi();
        ds.Item item53 = fPHeapMax49.max();
        fPHeapMax49.imprime();
        fPHeapMax49.constroi();
        ds.FPHeapMax fPHeapMax57 = new ds.FPHeapMax((int) '#');
        fPHeapMax57.imprime();
        ds.Item item59 = fPHeapMax57.max();
        ds.Item item60 = null;
        ds.Item[] itemArray61 = new ds.Item[] { item60 };
        fPHeapMax57.copia(itemArray61);
        fPHeapMax49.copia(itemArray61);
        fPHeapMax8.copia(itemArray61);
        fPHeapMax1.copia(itemArray61);
        org.junit.Assert.assertNull(item4);
        org.junit.Assert.assertNull(item12);
        org.junit.Assert.assertNotNull(itemArray14);
        org.junit.Assert.assertNull(item16);
        org.junit.Assert.assertNotNull(itemArray22);
        org.junit.Assert.assertNotNull(itemArray27);
        org.junit.Assert.assertNull(item32);
        org.junit.Assert.assertNull(item34);
        org.junit.Assert.assertNotNull(itemArray36);
        org.junit.Assert.assertNotNull(itemArray41);
        org.junit.Assert.assertNull(item51);
        org.junit.Assert.assertNull(item53);
        org.junit.Assert.assertNull(item59);
        org.junit.Assert.assertNotNull(itemArray61);
    }

    @Test
    public void test314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test314");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) '#');
        fPHeapMax1.imprime();
        fPHeapMax1.constroi();
        fPHeapMax1.constroi();
        fPHeapMax1.imprime();
        fPHeapMax1.constroi();
        fPHeapMax1.constroi();
        ds.FPHeapMax fPHeapMax9 = new ds.FPHeapMax((int) (short) 10);
        fPHeapMax9.constroi();
        ds.Item item11 = fPHeapMax9.max();
        fPHeapMax9.constroi();
        ds.Item item13 = fPHeapMax9.max();
        fPHeapMax9.imprime();
        fPHeapMax9.constroi();
        fPHeapMax9.constroi();
        ds.FPHeapMax fPHeapMax18 = new ds.FPHeapMax((int) (short) 10);
        fPHeapMax18.constroi();
        ds.Item item20 = fPHeapMax18.max();
        fPHeapMax18.imprime();
        fPHeapMax18.refaz(10, (int) (byte) 1);
        ds.FPHeapMax fPHeapMax26 = new ds.FPHeapMax(100);
        ds.Item[] itemArray27 = new ds.Item[] {};
        fPHeapMax26.copia(itemArray27);
        fPHeapMax18.copia(itemArray27);
        fPHeapMax9.copia(itemArray27);
        fPHeapMax1.copia(itemArray27);
        java.lang.Class<?> wildcardClass32 = fPHeapMax1.getClass();
        org.junit.Assert.assertNull(item11);
        org.junit.Assert.assertNull(item13);
        org.junit.Assert.assertNull(item20);
        org.junit.Assert.assertNotNull(itemArray27);
        org.junit.Assert.assertNotNull(wildcardClass32);
    }

    @Test
    public void test315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test315");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (byte) 100);
        fPHeapMax1.imprime();
        ds.Item item3 = fPHeapMax1.max();
        org.junit.Assert.assertNull(item3);
    }

    @Test
    public void test316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test316");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (short) 10);
        ds.Item item2 = fPHeapMax1.max();
        ds.Item item3 = fPHeapMax1.max();
        ds.FPHeapMax fPHeapMax5 = new ds.FPHeapMax((int) (short) 10);
        fPHeapMax5.constroi();
        ds.Item item7 = fPHeapMax5.max();
        fPHeapMax5.constroi();
        ds.Item item9 = fPHeapMax5.max();
        fPHeapMax5.imprime();
        ds.Item[] itemArray11 = new ds.Item[] {};
        fPHeapMax5.copia(itemArray11);
        fPHeapMax5.constroi();
        ds.Item item14 = fPHeapMax5.max();
        ds.Item[] itemArray15 = new ds.Item[] {};
        fPHeapMax5.copia(itemArray15);
        fPHeapMax1.copia(itemArray15);
        // The following exception was thrown during execution in test generation
        try {
            ds.Item item18 = fPHeapMax1.retiraMax();
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: heap vazio");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(item2);
        org.junit.Assert.assertNull(item3);
        org.junit.Assert.assertNull(item7);
        org.junit.Assert.assertNull(item9);
        org.junit.Assert.assertNotNull(itemArray11);
        org.junit.Assert.assertNull(item14);
        org.junit.Assert.assertNotNull(itemArray15);
    }

    @Test
    public void test317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test317");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (short) 0);
        ds.FPHeapMax fPHeapMax3 = new ds.FPHeapMax((int) '#');
        fPHeapMax3.imprime();
        ds.Item item5 = fPHeapMax3.max();
        ds.Item item6 = null;
        ds.Item[] itemArray7 = new ds.Item[] { item6 };
        fPHeapMax3.copia(itemArray7);
        fPHeapMax1.copia(itemArray7);
        fPHeapMax1.constroi();
        fPHeapMax1.constroi();
        ds.FPHeapMax fPHeapMax13 = new ds.FPHeapMax((int) (short) 10);
        fPHeapMax13.constroi();
        ds.Item item15 = fPHeapMax13.max();
        fPHeapMax13.constroi();
        ds.Item item17 = fPHeapMax13.max();
        fPHeapMax13.imprime();
        ds.FPHeapMax fPHeapMax20 = new ds.FPHeapMax((int) '#');
        fPHeapMax20.imprime();
        ds.Item item22 = fPHeapMax20.max();
        ds.Item item23 = null;
        ds.Item[] itemArray24 = new ds.Item[] { item23 };
        fPHeapMax20.copia(itemArray24);
        fPHeapMax13.copia(itemArray24);
        fPHeapMax1.copia(itemArray24);
        fPHeapMax1.constroi();
        // The following exception was thrown during execution in test generation
        try {
            ds.Item item29 = fPHeapMax1.retiraMax();
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: heap vazio");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(item5);
        org.junit.Assert.assertNotNull(itemArray7);
        org.junit.Assert.assertNull(item15);
        org.junit.Assert.assertNull(item17);
        org.junit.Assert.assertNull(item22);
        org.junit.Assert.assertNotNull(itemArray24);
    }

    @Test
    public void test318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test318");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (short) 10);
        fPHeapMax1.constroi();
        ds.Item item3 = fPHeapMax1.max();
        fPHeapMax1.constroi();
        ds.Item item5 = fPHeapMax1.max();
        ds.FPHeapMax fPHeapMax7 = new ds.FPHeapMax((int) '#');
        fPHeapMax7.imprime();
        ds.Item item9 = fPHeapMax7.max();
        ds.Item item10 = null;
        ds.Item[] itemArray11 = new ds.Item[] { item10 };
        fPHeapMax7.copia(itemArray11);
        fPHeapMax1.copia(itemArray11);
        fPHeapMax1.constroi();
        ds.FPHeapMax fPHeapMax17 = new ds.FPHeapMax((int) '#');
        fPHeapMax17.constroi();
        ds.Item item19 = fPHeapMax17.max();
        ds.FPHeapMax fPHeapMax21 = new ds.FPHeapMax((int) (short) 1);
        ds.FPHeapMax fPHeapMax23 = new ds.FPHeapMax((int) (short) 0);
        ds.FPHeapMax fPHeapMax25 = new ds.FPHeapMax((int) '#');
        fPHeapMax25.imprime();
        ds.Item item27 = fPHeapMax25.max();
        ds.Item item28 = null;
        ds.Item[] itemArray29 = new ds.Item[] { item28 };
        fPHeapMax25.copia(itemArray29);
        fPHeapMax23.copia(itemArray29);
        fPHeapMax23.constroi();
        fPHeapMax23.constroi();
        ds.FPHeapMax fPHeapMax35 = new ds.FPHeapMax((int) (short) 10);
        fPHeapMax35.constroi();
        ds.Item item37 = fPHeapMax35.max();
        fPHeapMax35.constroi();
        ds.Item item39 = fPHeapMax35.max();
        fPHeapMax35.imprime();
        ds.FPHeapMax fPHeapMax42 = new ds.FPHeapMax((int) '#');
        fPHeapMax42.imprime();
        ds.Item item44 = fPHeapMax42.max();
        ds.Item item45 = null;
        ds.Item[] itemArray46 = new ds.Item[] { item45 };
        fPHeapMax42.copia(itemArray46);
        fPHeapMax35.copia(itemArray46);
        fPHeapMax23.copia(itemArray46);
        fPHeapMax21.copia(itemArray46);
        fPHeapMax17.copia(itemArray46);
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMax1.aumentaChave((int) (byte) 0, (java.lang.Object) itemArray46);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(item3);
        org.junit.Assert.assertNull(item5);
        org.junit.Assert.assertNull(item9);
        org.junit.Assert.assertNotNull(itemArray11);
        org.junit.Assert.assertNull(item19);
        org.junit.Assert.assertNull(item27);
        org.junit.Assert.assertNotNull(itemArray29);
        org.junit.Assert.assertNull(item37);
        org.junit.Assert.assertNull(item39);
        org.junit.Assert.assertNull(item44);
        org.junit.Assert.assertNotNull(itemArray46);
    }

    @Test
    public void test319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test319");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (byte) 100);
        fPHeapMax1.imprime();
        fPHeapMax1.imprime();
        ds.Item item4 = fPHeapMax1.max();
        fPHeapMax1.constroi();
        ds.Item item6 = fPHeapMax1.max();
        fPHeapMax1.imprime();
        // The following exception was thrown during execution in test generation
        try {
            ds.Item item8 = fPHeapMax1.retiraMax();
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: heap vazio");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(item4);
        org.junit.Assert.assertNull(item6);
    }

    @Test
    public void test320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test320");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax(100);
        ds.Item[] itemArray2 = new ds.Item[] {};
        fPHeapMax1.copia(itemArray2);
        fPHeapMax1.imprime();
        ds.Item item5 = fPHeapMax1.max();
        java.lang.Object obj7 = null;
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMax1.aumentaChave((int) (short) 0, obj7);
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: chaveNova com valor null");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray2);
        org.junit.Assert.assertNull(item5);
    }

    @Test
    public void test321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test321");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (short) 10);
        fPHeapMax1.constroi();
        ds.Item item3 = fPHeapMax1.max();
        fPHeapMax1.constroi();
        ds.Item item5 = fPHeapMax1.max();
        fPHeapMax1.imprime();
        fPHeapMax1.constroi();
        fPHeapMax1.constroi();
        ds.FPHeapMax fPHeapMax10 = new ds.FPHeapMax((int) (short) 10);
        fPHeapMax10.constroi();
        ds.Item item12 = fPHeapMax10.max();
        fPHeapMax10.imprime();
        fPHeapMax10.refaz(10, (int) (byte) 1);
        ds.FPHeapMax fPHeapMax18 = new ds.FPHeapMax(100);
        ds.Item[] itemArray19 = new ds.Item[] {};
        fPHeapMax18.copia(itemArray19);
        fPHeapMax10.copia(itemArray19);
        fPHeapMax1.copia(itemArray19);
        fPHeapMax1.imprime();
        ds.Item[] itemArray24 = null;
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMax1.copia(itemArray24);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(item3);
        org.junit.Assert.assertNull(item5);
        org.junit.Assert.assertNull(item12);
        org.junit.Assert.assertNotNull(itemArray19);
    }

    @Test
    public void test322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test322");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (short) 10);
        fPHeapMax1.constroi();
        ds.Item item3 = fPHeapMax1.max();
        fPHeapMax1.constroi();
        ds.Item item5 = fPHeapMax1.max();
        fPHeapMax1.imprime();
        ds.Item[] itemArray7 = new ds.Item[] {};
        fPHeapMax1.copia(itemArray7);
        ds.Item item9 = fPHeapMax1.max();
        ds.Item item10 = fPHeapMax1.max();
        fPHeapMax1.constroi();
        org.junit.Assert.assertNull(item3);
        org.junit.Assert.assertNull(item5);
        org.junit.Assert.assertNotNull(itemArray7);
        org.junit.Assert.assertNull(item9);
        org.junit.Assert.assertNull(item10);
    }

    @Test
    public void test323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test323");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) '#');
        fPHeapMax1.imprime();
        fPHeapMax1.constroi();
        fPHeapMax1.constroi();
        fPHeapMax1.imprime();
        fPHeapMax1.constroi();
        fPHeapMax1.constroi();
        ds.Item item8 = fPHeapMax1.max();
        ds.FPHeapMax fPHeapMax10 = new ds.FPHeapMax((int) (byte) 10);
        fPHeapMax10.imprime();
        ds.FPHeapMax fPHeapMax13 = new ds.FPHeapMax(100);
        ds.Item[] itemArray14 = new ds.Item[] {};
        fPHeapMax13.copia(itemArray14);
        fPHeapMax10.copia(itemArray14);
        fPHeapMax1.copia(itemArray14);
        ds.Item item18 = null;
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMax1.insere(item18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(item8);
        org.junit.Assert.assertNotNull(itemArray14);
    }

    @Test
    public void test324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test324");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (byte) 100);
        ds.FPHeapMax fPHeapMax3 = new ds.FPHeapMax(1);
        ds.FPHeapMax fPHeapMax5 = new ds.FPHeapMax((int) (short) 10);
        fPHeapMax5.constroi();
        ds.Item item7 = fPHeapMax5.max();
        fPHeapMax5.constroi();
        ds.Item item9 = fPHeapMax5.max();
        fPHeapMax5.imprime();
        ds.Item[] itemArray11 = new ds.Item[] {};
        fPHeapMax5.copia(itemArray11);
        fPHeapMax3.copia(itemArray11);
        fPHeapMax1.copia(itemArray11);
        ds.Item item15 = fPHeapMax1.max();
        fPHeapMax1.imprime();
        fPHeapMax1.imprime();
        ds.FPHeapMax fPHeapMax20 = new ds.FPHeapMax((int) '#');
        fPHeapMax20.imprime();
        ds.Item item22 = fPHeapMax20.max();
        ds.Item item23 = null;
        ds.Item[] itemArray24 = new ds.Item[] { item23 };
        fPHeapMax20.copia(itemArray24);
        ds.Item item26 = fPHeapMax20.max();
        fPHeapMax20.constroi();
        ds.Item item28 = fPHeapMax20.max();
        fPHeapMax20.constroi();
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMax1.aumentaChave((int) (short) 100, (java.lang.Object) fPHeapMax20);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(item7);
        org.junit.Assert.assertNull(item9);
        org.junit.Assert.assertNotNull(itemArray11);
        org.junit.Assert.assertNull(item15);
        org.junit.Assert.assertNull(item22);
        org.junit.Assert.assertNotNull(itemArray24);
        org.junit.Assert.assertNull(item26);
        org.junit.Assert.assertNull(item28);
    }

    @Test
    public void test325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test325");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (short) 10);
        fPHeapMax1.constroi();
        ds.Item item3 = fPHeapMax1.max();
        fPHeapMax1.constroi();
        ds.Item item5 = fPHeapMax1.max();
        fPHeapMax1.imprime();
        ds.FPHeapMax fPHeapMax8 = new ds.FPHeapMax((int) '#');
        fPHeapMax8.imprime();
        ds.Item item10 = fPHeapMax8.max();
        ds.Item item11 = null;
        ds.Item[] itemArray12 = new ds.Item[] { item11 };
        fPHeapMax8.copia(itemArray12);
        fPHeapMax1.copia(itemArray12);
        fPHeapMax1.constroi();
        ds.FPHeapMax fPHeapMax17 = new ds.FPHeapMax(100);
        ds.Item[] itemArray18 = new ds.Item[] {};
        fPHeapMax17.copia(itemArray18);
        fPHeapMax1.copia(itemArray18);
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMax1.refaz((int) (short) 10, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 20");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(item3);
        org.junit.Assert.assertNull(item5);
        org.junit.Assert.assertNull(item10);
        org.junit.Assert.assertNotNull(itemArray12);
        org.junit.Assert.assertNotNull(itemArray18);
    }

    @Test
    public void test326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test326");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (short) 10);
        fPHeapMax1.constroi();
        ds.Item item3 = fPHeapMax1.max();
        fPHeapMax1.constroi();
        ds.Item item5 = fPHeapMax1.max();
        fPHeapMax1.imprime();
        ds.Item[] itemArray7 = new ds.Item[] {};
        fPHeapMax1.copia(itemArray7);
        fPHeapMax1.constroi();
        java.lang.Class<?> wildcardClass10 = fPHeapMax1.getClass();
        org.junit.Assert.assertNull(item3);
        org.junit.Assert.assertNull(item5);
        org.junit.Assert.assertNotNull(itemArray7);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test327");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (short) 1);
        fPHeapMax1.imprime();
        ds.Item[] itemArray3 = null;
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMax1.copia(itemArray3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test328");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (short) 10);
        fPHeapMax1.constroi();
        ds.Item item3 = fPHeapMax1.max();
        fPHeapMax1.constroi();
        ds.Item item5 = fPHeapMax1.max();
        fPHeapMax1.imprime();
        ds.Item[] itemArray7 = new ds.Item[] {};
        fPHeapMax1.copia(itemArray7);
        fPHeapMax1.constroi();
        fPHeapMax1.constroi();
        ds.FPHeapMax fPHeapMax12 = new ds.FPHeapMax((int) (short) 100);
        fPHeapMax12.constroi();
        ds.FPHeapMax fPHeapMax15 = new ds.FPHeapMax((int) (short) 10);
        fPHeapMax15.constroi();
        ds.Item item17 = fPHeapMax15.max();
        fPHeapMax15.constroi();
        ds.Item item19 = fPHeapMax15.max();
        fPHeapMax15.imprime();
        ds.Item[] itemArray21 = new ds.Item[] {};
        fPHeapMax15.copia(itemArray21);
        fPHeapMax15.constroi();
        ds.FPHeapMax fPHeapMax25 = new ds.FPHeapMax(100);
        ds.Item[] itemArray26 = new ds.Item[] {};
        fPHeapMax25.copia(itemArray26);
        fPHeapMax15.copia(itemArray26);
        fPHeapMax12.copia(itemArray26);
        fPHeapMax1.copia(itemArray26);
        fPHeapMax1.constroi();
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMax1.refaz((int) (byte) 100, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 100");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(item3);
        org.junit.Assert.assertNull(item5);
        org.junit.Assert.assertNotNull(itemArray7);
        org.junit.Assert.assertNull(item17);
        org.junit.Assert.assertNull(item19);
        org.junit.Assert.assertNotNull(itemArray21);
        org.junit.Assert.assertNotNull(itemArray26);
    }

    @Test
    public void test329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test329");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (short) 10);
        ds.FPHeapMax fPHeapMax3 = new ds.FPHeapMax((int) (short) 0);
        ds.FPHeapMax fPHeapMax5 = new ds.FPHeapMax((int) '#');
        fPHeapMax5.imprime();
        ds.Item item7 = fPHeapMax5.max();
        ds.Item item8 = null;
        ds.Item[] itemArray9 = new ds.Item[] { item8 };
        fPHeapMax5.copia(itemArray9);
        fPHeapMax3.copia(itemArray9);
        fPHeapMax3.constroi();
        fPHeapMax3.constroi();
        ds.FPHeapMax fPHeapMax15 = new ds.FPHeapMax((int) (short) 10);
        fPHeapMax15.constroi();
        ds.Item item17 = fPHeapMax15.max();
        fPHeapMax15.constroi();
        ds.Item item19 = fPHeapMax15.max();
        fPHeapMax15.imprime();
        ds.FPHeapMax fPHeapMax22 = new ds.FPHeapMax((int) '#');
        fPHeapMax22.imprime();
        ds.Item item24 = fPHeapMax22.max();
        ds.Item item25 = null;
        ds.Item[] itemArray26 = new ds.Item[] { item25 };
        fPHeapMax22.copia(itemArray26);
        fPHeapMax15.copia(itemArray26);
        fPHeapMax3.copia(itemArray26);
        fPHeapMax1.copia(itemArray26);
        ds.Item item31 = null;
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMax1.insere(item31);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(item7);
        org.junit.Assert.assertNotNull(itemArray9);
        org.junit.Assert.assertNull(item17);
        org.junit.Assert.assertNull(item19);
        org.junit.Assert.assertNull(item24);
        org.junit.Assert.assertNotNull(itemArray26);
    }

    @Test
    public void test330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test330");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) '#');
        fPHeapMax1.imprime();
        fPHeapMax1.constroi();
        fPHeapMax1.constroi();
        fPHeapMax1.imprime();
        fPHeapMax1.constroi();
        fPHeapMax1.constroi();
        ds.FPHeapMax fPHeapMax9 = new ds.FPHeapMax((int) (short) 10);
        fPHeapMax9.constroi();
        ds.Item item11 = fPHeapMax9.max();
        fPHeapMax9.imprime();
        fPHeapMax9.refaz(10, (int) (byte) 1);
        ds.FPHeapMax fPHeapMax17 = new ds.FPHeapMax(100);
        ds.Item[] itemArray18 = new ds.Item[] {};
        fPHeapMax17.copia(itemArray18);
        fPHeapMax9.copia(itemArray18);
        fPHeapMax1.copia(itemArray18);
        org.junit.Assert.assertNull(item11);
        org.junit.Assert.assertNotNull(itemArray18);
    }

    @Test
    public void test331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test331");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (short) 10);
        fPHeapMax1.constroi();
        ds.Item item3 = fPHeapMax1.max();
        fPHeapMax1.constroi();
        fPHeapMax1.constroi();
        ds.Item item6 = fPHeapMax1.max();
        fPHeapMax1.constroi();
        // The following exception was thrown during execution in test generation
        try {
            ds.Item item8 = fPHeapMax1.retiraMax();
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: heap vazio");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(item3);
        org.junit.Assert.assertNull(item6);
    }

    @Test
    public void test332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test332");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (short) 10);
        fPHeapMax1.constroi();
        ds.Item item3 = fPHeapMax1.max();
        fPHeapMax1.constroi();
        ds.Item item5 = fPHeapMax1.max();
        fPHeapMax1.imprime();
        ds.FPHeapMax fPHeapMax8 = new ds.FPHeapMax((int) '#');
        fPHeapMax8.imprime();
        ds.Item item10 = fPHeapMax8.max();
        ds.Item item11 = null;
        ds.Item[] itemArray12 = new ds.Item[] { item11 };
        fPHeapMax8.copia(itemArray12);
        fPHeapMax1.copia(itemArray12);
        fPHeapMax1.constroi();
        ds.FPHeapMax fPHeapMax17 = new ds.FPHeapMax(100);
        ds.Item[] itemArray18 = new ds.Item[] {};
        fPHeapMax17.copia(itemArray18);
        fPHeapMax1.copia(itemArray18);
        // The following exception was thrown during execution in test generation
        try {
            ds.Item item21 = fPHeapMax1.retiraMax();
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: heap vazio");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(item3);
        org.junit.Assert.assertNull(item5);
        org.junit.Assert.assertNull(item10);
        org.junit.Assert.assertNotNull(itemArray12);
        org.junit.Assert.assertNotNull(itemArray18);
    }

    @Test
    public void test333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test333");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (byte) 10);
        fPHeapMax1.imprime();
        ds.FPHeapMax fPHeapMax4 = new ds.FPHeapMax(100);
        ds.Item[] itemArray5 = new ds.Item[] {};
        fPHeapMax4.copia(itemArray5);
        fPHeapMax1.copia(itemArray5);
        java.lang.Class<?> wildcardClass8 = fPHeapMax1.getClass();
        org.junit.Assert.assertNotNull(itemArray5);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test334");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (short) 10);
        fPHeapMax1.constroi();
        ds.Item item3 = fPHeapMax1.max();
        fPHeapMax1.imprime();
        ds.Item[] itemArray5 = new ds.Item[] {};
        fPHeapMax1.copia(itemArray5);
        ds.Item item7 = fPHeapMax1.max();
        ds.Item item8 = null;
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMax1.insere(item8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(item3);
        org.junit.Assert.assertNotNull(itemArray5);
        org.junit.Assert.assertNull(item7);
    }

    @Test
    public void test335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test335");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) '#');
        fPHeapMax1.imprime();
        fPHeapMax1.constroi();
        fPHeapMax1.constroi();
        fPHeapMax1.imprime();
        fPHeapMax1.constroi();
        fPHeapMax1.constroi();
        ds.FPHeapMax fPHeapMax9 = new ds.FPHeapMax((int) (short) 10);
        fPHeapMax9.constroi();
        ds.Item item11 = fPHeapMax9.max();
        fPHeapMax9.constroi();
        ds.Item item13 = fPHeapMax9.max();
        fPHeapMax9.imprime();
        fPHeapMax9.constroi();
        fPHeapMax9.constroi();
        ds.FPHeapMax fPHeapMax18 = new ds.FPHeapMax((int) (short) 10);
        fPHeapMax18.constroi();
        ds.Item item20 = fPHeapMax18.max();
        fPHeapMax18.imprime();
        fPHeapMax18.refaz(10, (int) (byte) 1);
        ds.FPHeapMax fPHeapMax26 = new ds.FPHeapMax(100);
        ds.Item[] itemArray27 = new ds.Item[] {};
        fPHeapMax26.copia(itemArray27);
        fPHeapMax18.copia(itemArray27);
        fPHeapMax9.copia(itemArray27);
        fPHeapMax1.copia(itemArray27);
        fPHeapMax1.imprime();
        fPHeapMax1.imprime();
        ds.Item item34 = fPHeapMax1.max();
        ds.FPHeapMax fPHeapMax36 = new ds.FPHeapMax((int) '#');
        fPHeapMax36.imprime();
        fPHeapMax36.constroi();
        fPHeapMax36.constroi();
        fPHeapMax36.imprime();
        fPHeapMax36.refaz((int) (byte) 1, 1);
        ds.FPHeapMax fPHeapMax45 = new ds.FPHeapMax((int) (short) 10);
        fPHeapMax45.constroi();
        ds.Item item47 = fPHeapMax45.max();
        fPHeapMax45.constroi();
        ds.Item item49 = fPHeapMax45.max();
        ds.FPHeapMax fPHeapMax51 = new ds.FPHeapMax((int) '#');
        fPHeapMax51.imprime();
        ds.Item item53 = fPHeapMax51.max();
        ds.Item item54 = null;
        ds.Item[] itemArray55 = new ds.Item[] { item54 };
        fPHeapMax51.copia(itemArray55);
        fPHeapMax45.copia(itemArray55);
        fPHeapMax36.copia(itemArray55);
        ds.Item item59 = fPHeapMax36.max();
        ds.FPHeapMax fPHeapMax61 = new ds.FPHeapMax((int) '#');
        fPHeapMax61.imprime();
        fPHeapMax61.constroi();
        fPHeapMax61.constroi();
        fPHeapMax61.imprime();
        fPHeapMax61.refaz((int) (byte) 1, 1);
        ds.FPHeapMax fPHeapMax70 = new ds.FPHeapMax((int) (short) 10);
        fPHeapMax70.constroi();
        ds.Item item72 = fPHeapMax70.max();
        fPHeapMax70.constroi();
        ds.Item item74 = fPHeapMax70.max();
        ds.FPHeapMax fPHeapMax76 = new ds.FPHeapMax((int) '#');
        fPHeapMax76.imprime();
        ds.Item item78 = fPHeapMax76.max();
        ds.Item item79 = null;
        ds.Item[] itemArray80 = new ds.Item[] { item79 };
        fPHeapMax76.copia(itemArray80);
        fPHeapMax70.copia(itemArray80);
        fPHeapMax61.copia(itemArray80);
        fPHeapMax36.copia(itemArray80);
        fPHeapMax1.copia(itemArray80);
        java.lang.Class<?> wildcardClass86 = itemArray80.getClass();
        org.junit.Assert.assertNull(item11);
        org.junit.Assert.assertNull(item13);
        org.junit.Assert.assertNull(item20);
        org.junit.Assert.assertNotNull(itemArray27);
        org.junit.Assert.assertNull(item34);
        org.junit.Assert.assertNull(item47);
        org.junit.Assert.assertNull(item49);
        org.junit.Assert.assertNull(item53);
        org.junit.Assert.assertNotNull(itemArray55);
        org.junit.Assert.assertNull(item59);
        org.junit.Assert.assertNull(item72);
        org.junit.Assert.assertNull(item74);
        org.junit.Assert.assertNull(item78);
        org.junit.Assert.assertNotNull(itemArray80);
        org.junit.Assert.assertNotNull(wildcardClass86);
    }

    @Test
    public void test336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test336");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (short) 10);
        fPHeapMax1.refaz((int) (short) 1, 0);
        ds.Item item5 = fPHeapMax1.max();
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMax1.refaz((int) (byte) 10, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 20");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(item5);
    }

    @Test
    public void test337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test337");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (short) 100);
        fPHeapMax1.constroi();
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
    public void test338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test338");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (short) 10);
        ds.FPHeapMax fPHeapMax3 = new ds.FPHeapMax((int) (short) 0);
        ds.FPHeapMax fPHeapMax5 = new ds.FPHeapMax((int) '#');
        fPHeapMax5.imprime();
        ds.Item item7 = fPHeapMax5.max();
        ds.Item item8 = null;
        ds.Item[] itemArray9 = new ds.Item[] { item8 };
        fPHeapMax5.copia(itemArray9);
        fPHeapMax3.copia(itemArray9);
        fPHeapMax3.constroi();
        fPHeapMax3.constroi();
        ds.FPHeapMax fPHeapMax15 = new ds.FPHeapMax((int) (short) 10);
        fPHeapMax15.constroi();
        ds.Item item17 = fPHeapMax15.max();
        fPHeapMax15.constroi();
        ds.Item item19 = fPHeapMax15.max();
        fPHeapMax15.imprime();
        ds.FPHeapMax fPHeapMax22 = new ds.FPHeapMax((int) '#');
        fPHeapMax22.imprime();
        ds.Item item24 = fPHeapMax22.max();
        ds.Item item25 = null;
        ds.Item[] itemArray26 = new ds.Item[] { item25 };
        fPHeapMax22.copia(itemArray26);
        fPHeapMax15.copia(itemArray26);
        fPHeapMax3.copia(itemArray26);
        fPHeapMax1.copia(itemArray26);
        fPHeapMax1.imprime();
        org.junit.Assert.assertNull(item7);
        org.junit.Assert.assertNotNull(itemArray9);
        org.junit.Assert.assertNull(item17);
        org.junit.Assert.assertNull(item19);
        org.junit.Assert.assertNull(item24);
        org.junit.Assert.assertNotNull(itemArray26);
    }

    @Test
    public void test339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test339");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (short) 10);
        fPHeapMax1.constroi();
        ds.Item item3 = fPHeapMax1.max();
        fPHeapMax1.imprime();
        fPHeapMax1.refaz(10, (int) (byte) 1);
        fPHeapMax1.imprime();
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMax1.refaz((int) ' ', 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 32");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(item3);
    }

    @Test
    public void test340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test340");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (short) 10);
        fPHeapMax1.constroi();
        ds.Item item3 = fPHeapMax1.max();
        fPHeapMax1.constroi();
        fPHeapMax1.constroi();
        ds.Item item6 = fPHeapMax1.max();
        fPHeapMax1.constroi();
        ds.Item item8 = fPHeapMax1.max();
        fPHeapMax1.imprime();
        ds.Item item10 = null;
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMax1.insere(item10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(item3);
        org.junit.Assert.assertNull(item6);
        org.junit.Assert.assertNull(item8);
    }

    @Test
    public void test341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test341");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (short) 10);
        fPHeapMax1.constroi();
        ds.Item item3 = fPHeapMax1.max();
        fPHeapMax1.constroi();
        ds.Item item5 = fPHeapMax1.max();
        ds.FPHeapMax fPHeapMax7 = new ds.FPHeapMax((int) (short) 10);
        fPHeapMax7.constroi();
        ds.FPHeapMax fPHeapMax10 = new ds.FPHeapMax((int) (short) 10);
        fPHeapMax10.constroi();
        ds.Item item12 = fPHeapMax10.max();
        fPHeapMax10.constroi();
        ds.Item item14 = fPHeapMax10.max();
        fPHeapMax10.imprime();
        ds.Item[] itemArray16 = new ds.Item[] {};
        fPHeapMax10.copia(itemArray16);
        fPHeapMax7.copia(itemArray16);
        fPHeapMax1.copia(itemArray16);
        ds.Item item20 = null;
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMax1.insere(item20);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(item3);
        org.junit.Assert.assertNull(item5);
        org.junit.Assert.assertNull(item12);
        org.junit.Assert.assertNull(item14);
        org.junit.Assert.assertNotNull(itemArray16);
    }

    @Test
    public void test342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test342");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (short) 1);
        ds.FPHeapMax fPHeapMax3 = new ds.FPHeapMax((int) (short) 0);
        ds.FPHeapMax fPHeapMax5 = new ds.FPHeapMax((int) '#');
        fPHeapMax5.imprime();
        ds.Item item7 = fPHeapMax5.max();
        ds.Item item8 = null;
        ds.Item[] itemArray9 = new ds.Item[] { item8 };
        fPHeapMax5.copia(itemArray9);
        fPHeapMax3.copia(itemArray9);
        fPHeapMax3.constroi();
        fPHeapMax3.constroi();
        ds.FPHeapMax fPHeapMax15 = new ds.FPHeapMax((int) (short) 10);
        fPHeapMax15.constroi();
        ds.Item item17 = fPHeapMax15.max();
        fPHeapMax15.constroi();
        ds.Item item19 = fPHeapMax15.max();
        fPHeapMax15.imprime();
        ds.FPHeapMax fPHeapMax22 = new ds.FPHeapMax((int) '#');
        fPHeapMax22.imprime();
        ds.Item item24 = fPHeapMax22.max();
        ds.Item item25 = null;
        ds.Item[] itemArray26 = new ds.Item[] { item25 };
        fPHeapMax22.copia(itemArray26);
        fPHeapMax15.copia(itemArray26);
        fPHeapMax3.copia(itemArray26);
        fPHeapMax1.copia(itemArray26);
        // The following exception was thrown during execution in test generation
        try {
            ds.Item item31 = fPHeapMax1.retiraMax();
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: heap vazio");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(item7);
        org.junit.Assert.assertNotNull(itemArray9);
        org.junit.Assert.assertNull(item17);
        org.junit.Assert.assertNull(item19);
        org.junit.Assert.assertNull(item24);
        org.junit.Assert.assertNotNull(itemArray26);
    }

    @Test
    public void test343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test343");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (short) 10);
        fPHeapMax1.constroi();
        ds.Item item3 = fPHeapMax1.max();
        ds.Item item4 = fPHeapMax1.max();
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMax1.refaz((int) ' ', (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 32");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(item3);
        org.junit.Assert.assertNull(item4);
    }

    @Test
    public void test344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test344");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) '#');
        fPHeapMax1.imprime();
        fPHeapMax1.constroi();
        fPHeapMax1.constroi();
        ds.Item item5 = fPHeapMax1.max();
        ds.Item item6 = fPHeapMax1.max();
        ds.Item item7 = null;
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMax1.insere(item7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(item5);
        org.junit.Assert.assertNull(item6);
    }

    @Test
    public void test345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test345");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (short) 10);
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
    public void test346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test346");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) '#');
        fPHeapMax1.imprime();
        fPHeapMax1.constroi();
        fPHeapMax1.constroi();
        ds.FPHeapMax fPHeapMax6 = new ds.FPHeapMax((int) '#');
        fPHeapMax6.imprime();
        ds.Item item8 = fPHeapMax6.max();
        ds.Item item9 = null;
        ds.Item[] itemArray10 = new ds.Item[] { item9 };
        fPHeapMax6.copia(itemArray10);
        fPHeapMax1.copia(itemArray10);
        fPHeapMax1.imprime();
        fPHeapMax1.imprime();
        java.lang.Class<?> wildcardClass15 = fPHeapMax1.getClass();
        org.junit.Assert.assertNull(item8);
        org.junit.Assert.assertNotNull(itemArray10);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test347");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (short) 10);
        fPHeapMax1.constroi();
        ds.Item item3 = fPHeapMax1.max();
        fPHeapMax1.constroi();
        fPHeapMax1.imprime();
        ds.FPHeapMax fPHeapMax7 = new ds.FPHeapMax((int) '#');
        fPHeapMax7.imprime();
        ds.Item item9 = fPHeapMax7.max();
        ds.Item item10 = null;
        ds.Item[] itemArray11 = new ds.Item[] { item10 };
        fPHeapMax7.copia(itemArray11);
        fPHeapMax1.copia(itemArray11);
        fPHeapMax1.imprime();
        fPHeapMax1.constroi();
        org.junit.Assert.assertNull(item3);
        org.junit.Assert.assertNull(item9);
        org.junit.Assert.assertNotNull(itemArray11);
    }

    @Test
    public void test348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test348");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (short) 10);
        fPHeapMax1.refaz((int) (short) 1, 0);
        ds.Item item5 = fPHeapMax1.max();
        ds.FPHeapMax fPHeapMax7 = new ds.FPHeapMax((int) (byte) 100);
        ds.FPHeapMax fPHeapMax9 = new ds.FPHeapMax(1);
        ds.FPHeapMax fPHeapMax11 = new ds.FPHeapMax((int) (short) 10);
        fPHeapMax11.constroi();
        ds.Item item13 = fPHeapMax11.max();
        fPHeapMax11.constroi();
        ds.Item item15 = fPHeapMax11.max();
        fPHeapMax11.imprime();
        ds.Item[] itemArray17 = new ds.Item[] {};
        fPHeapMax11.copia(itemArray17);
        fPHeapMax9.copia(itemArray17);
        fPHeapMax7.copia(itemArray17);
        fPHeapMax1.copia(itemArray17);
        ds.FPHeapMax fPHeapMax24 = new ds.FPHeapMax((-1));
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMax1.aumentaChave((int) '#', (java.lang.Object) fPHeapMax24);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 35");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(item5);
        org.junit.Assert.assertNull(item13);
        org.junit.Assert.assertNull(item15);
        org.junit.Assert.assertNotNull(itemArray17);
    }

    @Test
    public void test349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test349");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (short) 10);
        ds.Item item2 = fPHeapMax1.max();
        ds.Item item3 = fPHeapMax1.max();
        ds.FPHeapMax fPHeapMax5 = new ds.FPHeapMax((int) (short) 10);
        fPHeapMax5.constroi();
        ds.Item item7 = fPHeapMax5.max();
        fPHeapMax5.constroi();
        ds.Item item9 = fPHeapMax5.max();
        fPHeapMax5.imprime();
        ds.Item[] itemArray11 = new ds.Item[] {};
        fPHeapMax5.copia(itemArray11);
        fPHeapMax5.constroi();
        ds.Item item14 = fPHeapMax5.max();
        ds.Item[] itemArray15 = new ds.Item[] {};
        fPHeapMax5.copia(itemArray15);
        fPHeapMax1.copia(itemArray15);
        ds.FPHeapMax fPHeapMax20 = new ds.FPHeapMax((int) (short) 0);
        ds.FPHeapMax fPHeapMax22 = new ds.FPHeapMax((int) '#');
        fPHeapMax22.imprime();
        ds.Item item24 = fPHeapMax22.max();
        ds.Item item25 = null;
        ds.Item[] itemArray26 = new ds.Item[] { item25 };
        fPHeapMax22.copia(itemArray26);
        fPHeapMax20.copia(itemArray26);
        fPHeapMax20.constroi();
        fPHeapMax20.constroi();
        ds.FPHeapMax fPHeapMax32 = new ds.FPHeapMax((int) (short) 10);
        fPHeapMax32.constroi();
        ds.Item item34 = fPHeapMax32.max();
        fPHeapMax32.constroi();
        ds.Item item36 = fPHeapMax32.max();
        fPHeapMax32.imprime();
        ds.FPHeapMax fPHeapMax39 = new ds.FPHeapMax((int) '#');
        fPHeapMax39.imprime();
        ds.Item item41 = fPHeapMax39.max();
        ds.Item item42 = null;
        ds.Item[] itemArray43 = new ds.Item[] { item42 };
        fPHeapMax39.copia(itemArray43);
        fPHeapMax32.copia(itemArray43);
        fPHeapMax20.copia(itemArray43);
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMax1.aumentaChave((int) ' ', (java.lang.Object) itemArray43);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 32");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(item2);
        org.junit.Assert.assertNull(item3);
        org.junit.Assert.assertNull(item7);
        org.junit.Assert.assertNull(item9);
        org.junit.Assert.assertNotNull(itemArray11);
        org.junit.Assert.assertNull(item14);
        org.junit.Assert.assertNotNull(itemArray15);
        org.junit.Assert.assertNull(item24);
        org.junit.Assert.assertNotNull(itemArray26);
        org.junit.Assert.assertNull(item34);
        org.junit.Assert.assertNull(item36);
        org.junit.Assert.assertNull(item41);
        org.junit.Assert.assertNotNull(itemArray43);
    }

    @Test
    public void test350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test350");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (short) 10);
        fPHeapMax1.constroi();
        ds.Item item3 = fPHeapMax1.max();
        fPHeapMax1.constroi();
        fPHeapMax1.constroi();
        fPHeapMax1.refaz((int) (short) 1, 1);
        ds.Item item9 = fPHeapMax1.max();
        ds.FPHeapMax fPHeapMax12 = new ds.FPHeapMax((int) (short) 10);
        fPHeapMax12.constroi();
        ds.Item item14 = fPHeapMax12.max();
        fPHeapMax12.constroi();
        fPHeapMax12.imprime();
        fPHeapMax12.constroi();
        ds.Item item18 = fPHeapMax12.max();
        fPHeapMax12.constroi();
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMax1.aumentaChave((int) (byte) -1, (java.lang.Object) fPHeapMax12);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(item3);
        org.junit.Assert.assertNull(item9);
        org.junit.Assert.assertNull(item14);
        org.junit.Assert.assertNull(item18);
    }

    @Test
    public void test351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test351");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (byte) 10);
        fPHeapMax1.imprime();
        ds.FPHeapMax fPHeapMax4 = new ds.FPHeapMax(100);
        ds.Item[] itemArray5 = new ds.Item[] {};
        fPHeapMax4.copia(itemArray5);
        fPHeapMax1.copia(itemArray5);
        ds.FPHeapMax fPHeapMax9 = new ds.FPHeapMax(100);
        ds.Item[] itemArray10 = new ds.Item[] {};
        fPHeapMax9.copia(itemArray10);
        ds.FPHeapMax fPHeapMax13 = new ds.FPHeapMax((int) (short) 10);
        fPHeapMax13.constroi();
        ds.Item item15 = fPHeapMax13.max();
        fPHeapMax13.constroi();
        ds.Item item17 = fPHeapMax13.max();
        fPHeapMax13.imprime();
        ds.Item[] itemArray19 = new ds.Item[] {};
        fPHeapMax13.copia(itemArray19);
        fPHeapMax13.constroi();
        ds.FPHeapMax fPHeapMax23 = new ds.FPHeapMax(100);
        ds.Item[] itemArray24 = new ds.Item[] {};
        fPHeapMax23.copia(itemArray24);
        fPHeapMax13.copia(itemArray24);
        fPHeapMax9.copia(itemArray24);
        fPHeapMax1.copia(itemArray24);
        ds.FPHeapMax fPHeapMax30 = new ds.FPHeapMax((int) (byte) 100);
        fPHeapMax30.imprime();
        ds.FPHeapMax fPHeapMax33 = new ds.FPHeapMax(1);
        ds.FPHeapMax fPHeapMax35 = new ds.FPHeapMax((int) (short) 10);
        fPHeapMax35.constroi();
        ds.Item item37 = fPHeapMax35.max();
        fPHeapMax35.constroi();
        ds.Item item39 = fPHeapMax35.max();
        fPHeapMax35.imprime();
        ds.Item[] itemArray41 = new ds.Item[] {};
        fPHeapMax35.copia(itemArray41);
        fPHeapMax33.copia(itemArray41);
        fPHeapMax30.copia(itemArray41);
        ds.FPHeapMax fPHeapMax46 = new ds.FPHeapMax(100);
        ds.Item[] itemArray47 = new ds.Item[] {};
        fPHeapMax46.copia(itemArray47);
        fPHeapMax30.copia(itemArray47);
        fPHeapMax1.copia(itemArray47);
        ds.Item item51 = null;
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMax1.insere(item51);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray5);
        org.junit.Assert.assertNotNull(itemArray10);
        org.junit.Assert.assertNull(item15);
        org.junit.Assert.assertNull(item17);
        org.junit.Assert.assertNotNull(itemArray19);
        org.junit.Assert.assertNotNull(itemArray24);
        org.junit.Assert.assertNull(item37);
        org.junit.Assert.assertNull(item39);
        org.junit.Assert.assertNotNull(itemArray41);
        org.junit.Assert.assertNotNull(itemArray47);
    }

    @Test
    public void test352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test352");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax(100);
        fPHeapMax1.imprime();
    }

    @Test
    public void test353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test353");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (short) 10);
        fPHeapMax1.constroi();
        ds.Item item3 = fPHeapMax1.max();
        fPHeapMax1.constroi();
        ds.Item item5 = fPHeapMax1.max();
        ds.FPHeapMax fPHeapMax7 = new ds.FPHeapMax((int) '#');
        fPHeapMax7.imprime();
        ds.Item item9 = fPHeapMax7.max();
        ds.Item item10 = null;
        ds.Item[] itemArray11 = new ds.Item[] { item10 };
        fPHeapMax7.copia(itemArray11);
        fPHeapMax1.copia(itemArray11);
        ds.Item item14 = fPHeapMax1.max();
        fPHeapMax1.constroi();
        fPHeapMax1.constroi();
        ds.FPHeapMax fPHeapMax18 = new ds.FPHeapMax((int) '#');
        fPHeapMax18.imprime();
        ds.FPHeapMax fPHeapMax21 = new ds.FPHeapMax((int) (short) 10);
        fPHeapMax21.refaz((int) (short) 1, 0);
        fPHeapMax21.constroi();
        ds.FPHeapMax fPHeapMax27 = new ds.FPHeapMax((int) (byte) 0);
        ds.FPHeapMax fPHeapMax29 = new ds.FPHeapMax((int) (short) 10);
        fPHeapMax29.constroi();
        ds.Item item31 = fPHeapMax29.max();
        fPHeapMax29.constroi();
        ds.Item item33 = fPHeapMax29.max();
        fPHeapMax29.imprime();
        ds.Item[] itemArray35 = new ds.Item[] {};
        fPHeapMax29.copia(itemArray35);
        fPHeapMax29.constroi();
        ds.Item item38 = fPHeapMax29.max();
        ds.Item[] itemArray39 = new ds.Item[] {};
        fPHeapMax29.copia(itemArray39);
        fPHeapMax27.copia(itemArray39);
        fPHeapMax21.copia(itemArray39);
        fPHeapMax18.copia(itemArray39);
        fPHeapMax1.copia(itemArray39);
        ds.FPHeapMax fPHeapMax47 = new ds.FPHeapMax((int) (byte) 10);
        fPHeapMax47.imprime();
        ds.FPHeapMax fPHeapMax50 = new ds.FPHeapMax(100);
        ds.Item[] itemArray51 = new ds.Item[] {};
        fPHeapMax50.copia(itemArray51);
        fPHeapMax47.copia(itemArray51);
        ds.FPHeapMax fPHeapMax55 = new ds.FPHeapMax(100);
        ds.Item[] itemArray56 = new ds.Item[] {};
        fPHeapMax55.copia(itemArray56);
        ds.FPHeapMax fPHeapMax59 = new ds.FPHeapMax((int) (short) 10);
        fPHeapMax59.constroi();
        ds.Item item61 = fPHeapMax59.max();
        fPHeapMax59.constroi();
        ds.Item item63 = fPHeapMax59.max();
        fPHeapMax59.imprime();
        ds.Item[] itemArray65 = new ds.Item[] {};
        fPHeapMax59.copia(itemArray65);
        fPHeapMax59.constroi();
        ds.FPHeapMax fPHeapMax69 = new ds.FPHeapMax(100);
        ds.Item[] itemArray70 = new ds.Item[] {};
        fPHeapMax69.copia(itemArray70);
        fPHeapMax59.copia(itemArray70);
        fPHeapMax55.copia(itemArray70);
        fPHeapMax47.copia(itemArray70);
        java.lang.Class<?> wildcardClass75 = fPHeapMax47.getClass();
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMax1.aumentaChave((int) (short) 1, (java.lang.Object) fPHeapMax47);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(item3);
        org.junit.Assert.assertNull(item5);
        org.junit.Assert.assertNull(item9);
        org.junit.Assert.assertNotNull(itemArray11);
        org.junit.Assert.assertNull(item14);
        org.junit.Assert.assertNull(item31);
        org.junit.Assert.assertNull(item33);
        org.junit.Assert.assertNotNull(itemArray35);
        org.junit.Assert.assertNull(item38);
        org.junit.Assert.assertNotNull(itemArray39);
        org.junit.Assert.assertNotNull(itemArray51);
        org.junit.Assert.assertNotNull(itemArray56);
        org.junit.Assert.assertNull(item61);
        org.junit.Assert.assertNull(item63);
        org.junit.Assert.assertNotNull(itemArray65);
        org.junit.Assert.assertNotNull(itemArray70);
        org.junit.Assert.assertNotNull(wildcardClass75);
    }

    @Test
    public void test354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test354");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (short) 10);
        fPHeapMax1.constroi();
        ds.Item item3 = fPHeapMax1.max();
        fPHeapMax1.constroi();
        fPHeapMax1.imprime();
        ds.FPHeapMax fPHeapMax7 = new ds.FPHeapMax((int) '#');
        fPHeapMax7.imprime();
        ds.Item item9 = fPHeapMax7.max();
        ds.Item item10 = null;
        ds.Item[] itemArray11 = new ds.Item[] { item10 };
        fPHeapMax7.copia(itemArray11);
        fPHeapMax1.copia(itemArray11);
        ds.FPHeapMax fPHeapMax15 = new ds.FPHeapMax((int) (short) 10);
        fPHeapMax15.constroi();
        ds.Item item17 = fPHeapMax15.max();
        fPHeapMax15.imprime();
        fPHeapMax15.refaz(10, (int) (byte) 1);
        ds.FPHeapMax fPHeapMax23 = new ds.FPHeapMax(100);
        ds.Item[] itemArray24 = new ds.Item[] {};
        fPHeapMax23.copia(itemArray24);
        fPHeapMax15.copia(itemArray24);
        fPHeapMax1.copia(itemArray24);
        org.junit.Assert.assertNull(item3);
        org.junit.Assert.assertNull(item9);
        org.junit.Assert.assertNotNull(itemArray11);
        org.junit.Assert.assertNull(item17);
        org.junit.Assert.assertNotNull(itemArray24);
    }

    @Test
    public void test355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test355");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (short) 0);
        ds.FPHeapMax fPHeapMax3 = new ds.FPHeapMax((int) '#');
        fPHeapMax3.imprime();
        ds.Item item5 = fPHeapMax3.max();
        ds.Item item6 = null;
        ds.Item[] itemArray7 = new ds.Item[] { item6 };
        fPHeapMax3.copia(itemArray7);
        fPHeapMax1.copia(itemArray7);
        fPHeapMax1.constroi();
        fPHeapMax1.constroi();
        ds.FPHeapMax fPHeapMax13 = new ds.FPHeapMax((int) (short) 10);
        fPHeapMax13.constroi();
        ds.Item item15 = fPHeapMax13.max();
        fPHeapMax13.constroi();
        ds.Item item17 = fPHeapMax13.max();
        fPHeapMax13.imprime();
        ds.FPHeapMax fPHeapMax20 = new ds.FPHeapMax((int) '#');
        fPHeapMax20.imprime();
        ds.Item item22 = fPHeapMax20.max();
        ds.Item item23 = null;
        ds.Item[] itemArray24 = new ds.Item[] { item23 };
        fPHeapMax20.copia(itemArray24);
        fPHeapMax13.copia(itemArray24);
        fPHeapMax1.copia(itemArray24);
        fPHeapMax1.imprime();
        fPHeapMax1.constroi();
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMax1.refaz((int) (short) 0, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(item5);
        org.junit.Assert.assertNotNull(itemArray7);
        org.junit.Assert.assertNull(item15);
        org.junit.Assert.assertNull(item17);
        org.junit.Assert.assertNull(item22);
        org.junit.Assert.assertNotNull(itemArray24);
    }

    @Test
    public void test356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test356");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (short) 10);
        fPHeapMax1.constroi();
        ds.Item item3 = fPHeapMax1.max();
        fPHeapMax1.constroi();
        ds.Item item5 = fPHeapMax1.max();
        ds.FPHeapMax fPHeapMax7 = new ds.FPHeapMax((int) '#');
        fPHeapMax7.imprime();
        ds.Item item9 = fPHeapMax7.max();
        ds.Item item10 = null;
        ds.Item[] itemArray11 = new ds.Item[] { item10 };
        fPHeapMax7.copia(itemArray11);
        fPHeapMax1.copia(itemArray11);
        ds.Item item14 = fPHeapMax1.max();
        fPHeapMax1.constroi();
        fPHeapMax1.constroi();
        // The following exception was thrown during execution in test generation
        try {
            ds.Item item17 = fPHeapMax1.retiraMax();
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: heap vazio");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(item3);
        org.junit.Assert.assertNull(item5);
        org.junit.Assert.assertNull(item9);
        org.junit.Assert.assertNotNull(itemArray11);
        org.junit.Assert.assertNull(item14);
    }

    @Test
    public void test357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test357");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) 'a');
        ds.FPHeapMax fPHeapMax4 = new ds.FPHeapMax((int) (short) 10);
        ds.Item item5 = fPHeapMax4.max();
        fPHeapMax4.imprime();
        fPHeapMax4.constroi();
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMax1.aumentaChave((int) (byte) -1, (java.lang.Object) fPHeapMax4);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(item5);
    }

    @Test
    public void test358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test358");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax(100);
        ds.Item[] itemArray2 = new ds.Item[] {};
        fPHeapMax1.copia(itemArray2);
        fPHeapMax1.imprime();
        fPHeapMax1.refaz((int) (byte) 100, (int) '#');
        ds.Item item8 = null;
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMax1.insere(item8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray2);
    }

    @Test
    public void test359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test359");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) '#');
        fPHeapMax1.refaz((int) (short) 0, (-1));
        fPHeapMax1.constroi();
        ds.FPHeapMax fPHeapMax7 = new ds.FPHeapMax((int) '#');
        fPHeapMax7.imprime();
        ds.Item item9 = fPHeapMax7.max();
        ds.Item item10 = null;
        ds.Item[] itemArray11 = new ds.Item[] { item10 };
        fPHeapMax7.copia(itemArray11);
        ds.Item item13 = fPHeapMax7.max();
        ds.FPHeapMax fPHeapMax15 = new ds.FPHeapMax((int) (byte) 10);
        fPHeapMax15.imprime();
        ds.FPHeapMax fPHeapMax18 = new ds.FPHeapMax(100);
        ds.Item[] itemArray19 = new ds.Item[] {};
        fPHeapMax18.copia(itemArray19);
        fPHeapMax15.copia(itemArray19);
        ds.FPHeapMax fPHeapMax23 = new ds.FPHeapMax(100);
        ds.Item[] itemArray24 = new ds.Item[] {};
        fPHeapMax23.copia(itemArray24);
        ds.FPHeapMax fPHeapMax27 = new ds.FPHeapMax((int) (short) 10);
        fPHeapMax27.constroi();
        ds.Item item29 = fPHeapMax27.max();
        fPHeapMax27.constroi();
        ds.Item item31 = fPHeapMax27.max();
        fPHeapMax27.imprime();
        ds.Item[] itemArray33 = new ds.Item[] {};
        fPHeapMax27.copia(itemArray33);
        fPHeapMax27.constroi();
        ds.FPHeapMax fPHeapMax37 = new ds.FPHeapMax(100);
        ds.Item[] itemArray38 = new ds.Item[] {};
        fPHeapMax37.copia(itemArray38);
        fPHeapMax27.copia(itemArray38);
        fPHeapMax23.copia(itemArray38);
        fPHeapMax15.copia(itemArray38);
        fPHeapMax7.copia(itemArray38);
        fPHeapMax1.copia(itemArray38);
        java.lang.Class<?> wildcardClass45 = fPHeapMax1.getClass();
        org.junit.Assert.assertNull(item9);
        org.junit.Assert.assertNotNull(itemArray11);
        org.junit.Assert.assertNull(item13);
        org.junit.Assert.assertNotNull(itemArray19);
        org.junit.Assert.assertNotNull(itemArray24);
        org.junit.Assert.assertNull(item29);
        org.junit.Assert.assertNull(item31);
        org.junit.Assert.assertNotNull(itemArray33);
        org.junit.Assert.assertNotNull(itemArray38);
        org.junit.Assert.assertNotNull(wildcardClass45);
    }

    @Test
    public void test360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test360");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (short) 10);
        fPHeapMax1.constroi();
        ds.Item item3 = fPHeapMax1.max();
        fPHeapMax1.constroi();
        fPHeapMax1.constroi();
        ds.Item item6 = fPHeapMax1.max();
        ds.FPHeapMax fPHeapMax8 = new ds.FPHeapMax((int) '#');
        fPHeapMax8.imprime();
        fPHeapMax8.constroi();
        fPHeapMax8.constroi();
        ds.FPHeapMax fPHeapMax13 = new ds.FPHeapMax((int) '#');
        fPHeapMax13.imprime();
        ds.Item item15 = fPHeapMax13.max();
        ds.Item item16 = null;
        ds.Item[] itemArray17 = new ds.Item[] { item16 };
        fPHeapMax13.copia(itemArray17);
        fPHeapMax8.copia(itemArray17);
        fPHeapMax1.copia(itemArray17);
        ds.Item item21 = null;
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMax1.insere(item21);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(item3);
        org.junit.Assert.assertNull(item6);
        org.junit.Assert.assertNull(item15);
        org.junit.Assert.assertNotNull(itemArray17);
    }

    @Test
    public void test361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test361");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (short) 10);
        fPHeapMax1.refaz((int) (short) 1, 0);
        fPHeapMax1.imprime();
        fPHeapMax1.imprime();
        // The following exception was thrown during execution in test generation
        try {
            ds.Item item7 = fPHeapMax1.retiraMax();
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: heap vazio");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
    }

    @Test
    public void test362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test362");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (short) 10);
        fPHeapMax1.constroi();
        ds.Item item3 = fPHeapMax1.max();
        fPHeapMax1.constroi();
        fPHeapMax1.imprime();
        ds.FPHeapMax fPHeapMax8 = new ds.FPHeapMax((int) '#');
        fPHeapMax8.imprime();
        ds.Item item10 = fPHeapMax8.max();
        ds.Item item11 = fPHeapMax8.max();
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMax1.aumentaChave((int) (short) 10, (java.lang.Object) item11);
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: chaveNova com valor null");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(item3);
        org.junit.Assert.assertNull(item10);
        org.junit.Assert.assertNull(item11);
    }

    @Test
    public void test363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test363");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (short) 0);
        ds.FPHeapMax fPHeapMax3 = new ds.FPHeapMax((int) '#');
        fPHeapMax3.imprime();
        ds.Item item5 = fPHeapMax3.max();
        ds.Item item6 = null;
        ds.Item[] itemArray7 = new ds.Item[] { item6 };
        fPHeapMax3.copia(itemArray7);
        fPHeapMax1.copia(itemArray7);
        fPHeapMax1.imprime();
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMax1.refaz((int) (short) 1, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(item5);
        org.junit.Assert.assertNotNull(itemArray7);
    }

    @Test
    public void test364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test364");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (short) 10);
        ds.Item item2 = fPHeapMax1.max();
        ds.Item item3 = fPHeapMax1.max();
        ds.FPHeapMax fPHeapMax5 = new ds.FPHeapMax((int) (short) 10);
        fPHeapMax5.constroi();
        ds.Item item7 = fPHeapMax5.max();
        fPHeapMax5.constroi();
        ds.Item item9 = fPHeapMax5.max();
        fPHeapMax5.imprime();
        ds.Item[] itemArray11 = new ds.Item[] {};
        fPHeapMax5.copia(itemArray11);
        fPHeapMax5.constroi();
        ds.Item item14 = fPHeapMax5.max();
        ds.Item[] itemArray15 = new ds.Item[] {};
        fPHeapMax5.copia(itemArray15);
        fPHeapMax1.copia(itemArray15);
        java.lang.Class<?> wildcardClass18 = itemArray15.getClass();
        org.junit.Assert.assertNull(item2);
        org.junit.Assert.assertNull(item3);
        org.junit.Assert.assertNull(item7);
        org.junit.Assert.assertNull(item9);
        org.junit.Assert.assertNotNull(itemArray11);
        org.junit.Assert.assertNull(item14);
        org.junit.Assert.assertNotNull(itemArray15);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test365");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (short) 10);
        fPHeapMax1.constroi();
        ds.Item item3 = fPHeapMax1.max();
        fPHeapMax1.constroi();
        ds.Item item5 = fPHeapMax1.max();
        fPHeapMax1.imprime();
        ds.Item[] itemArray7 = new ds.Item[] {};
        fPHeapMax1.copia(itemArray7);
        fPHeapMax1.constroi();
        fPHeapMax1.constroi();
        ds.FPHeapMax fPHeapMax12 = new ds.FPHeapMax((int) (short) 100);
        fPHeapMax12.constroi();
        ds.FPHeapMax fPHeapMax15 = new ds.FPHeapMax((int) (short) 10);
        fPHeapMax15.constroi();
        ds.Item item17 = fPHeapMax15.max();
        fPHeapMax15.constroi();
        ds.Item item19 = fPHeapMax15.max();
        fPHeapMax15.imprime();
        ds.Item[] itemArray21 = new ds.Item[] {};
        fPHeapMax15.copia(itemArray21);
        fPHeapMax15.constroi();
        ds.FPHeapMax fPHeapMax25 = new ds.FPHeapMax(100);
        ds.Item[] itemArray26 = new ds.Item[] {};
        fPHeapMax25.copia(itemArray26);
        fPHeapMax15.copia(itemArray26);
        fPHeapMax12.copia(itemArray26);
        fPHeapMax1.copia(itemArray26);
        fPHeapMax1.constroi();
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMax1.refaz((-1), (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(item3);
        org.junit.Assert.assertNull(item5);
        org.junit.Assert.assertNotNull(itemArray7);
        org.junit.Assert.assertNull(item17);
        org.junit.Assert.assertNull(item19);
        org.junit.Assert.assertNotNull(itemArray21);
        org.junit.Assert.assertNotNull(itemArray26);
    }

    @Test
    public void test366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test366");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax(10);
        ds.FPHeapMax fPHeapMax3 = new ds.FPHeapMax(1);
        ds.FPHeapMax fPHeapMax5 = new ds.FPHeapMax((int) (short) 10);
        fPHeapMax5.constroi();
        ds.Item item7 = fPHeapMax5.max();
        fPHeapMax5.constroi();
        ds.Item item9 = fPHeapMax5.max();
        fPHeapMax5.imprime();
        ds.Item[] itemArray11 = new ds.Item[] {};
        fPHeapMax5.copia(itemArray11);
        fPHeapMax3.copia(itemArray11);
        fPHeapMax1.copia(itemArray11);
        fPHeapMax1.constroi();
        org.junit.Assert.assertNull(item7);
        org.junit.Assert.assertNull(item9);
        org.junit.Assert.assertNotNull(itemArray11);
    }

    @Test
    public void test367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test367");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (short) 10);
        fPHeapMax1.constroi();
        ds.Item item3 = fPHeapMax1.max();
        fPHeapMax1.constroi();
        fPHeapMax1.constroi();
        fPHeapMax1.refaz((int) (short) 1, 1);
        ds.Item item9 = null;
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMax1.insere(item9);
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
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (short) 10);
        fPHeapMax1.constroi();
        ds.Item item3 = fPHeapMax1.max();
        fPHeapMax1.constroi();
        ds.Item item5 = fPHeapMax1.max();
        fPHeapMax1.imprime();
        ds.FPHeapMax fPHeapMax8 = new ds.FPHeapMax((int) '#');
        fPHeapMax8.imprime();
        ds.Item item10 = fPHeapMax8.max();
        ds.Item item11 = null;
        ds.Item[] itemArray12 = new ds.Item[] { item11 };
        fPHeapMax8.copia(itemArray12);
        fPHeapMax1.copia(itemArray12);
        fPHeapMax1.constroi();
        fPHeapMax1.imprime();
        fPHeapMax1.constroi();
        // The following exception was thrown during execution in test generation
        try {
            ds.Item item18 = fPHeapMax1.retiraMax();
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: heap vazio");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(item3);
        org.junit.Assert.assertNull(item5);
        org.junit.Assert.assertNull(item10);
        org.junit.Assert.assertNotNull(itemArray12);
    }

    @Test
    public void test369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test369");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) '#');
        fPHeapMax1.imprime();
        fPHeapMax1.constroi();
        fPHeapMax1.constroi();
        fPHeapMax1.imprime();
        fPHeapMax1.refaz((int) (byte) 1, 1);
        ds.FPHeapMax fPHeapMax10 = new ds.FPHeapMax((int) (short) 10);
        fPHeapMax10.constroi();
        ds.Item item12 = fPHeapMax10.max();
        fPHeapMax10.constroi();
        ds.Item item14 = fPHeapMax10.max();
        ds.FPHeapMax fPHeapMax16 = new ds.FPHeapMax((int) '#');
        fPHeapMax16.imprime();
        ds.Item item18 = fPHeapMax16.max();
        ds.Item item19 = null;
        ds.Item[] itemArray20 = new ds.Item[] { item19 };
        fPHeapMax16.copia(itemArray20);
        fPHeapMax10.copia(itemArray20);
        fPHeapMax1.copia(itemArray20);
        ds.Item item24 = fPHeapMax1.max();
        fPHeapMax1.constroi();
        org.junit.Assert.assertNull(item12);
        org.junit.Assert.assertNull(item14);
        org.junit.Assert.assertNull(item18);
        org.junit.Assert.assertNotNull(itemArray20);
        org.junit.Assert.assertNull(item24);
    }

    @Test
    public void test370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test370");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (short) 10);
        fPHeapMax1.constroi();
        ds.Item item3 = fPHeapMax1.max();
        fPHeapMax1.constroi();
        ds.Item item5 = fPHeapMax1.max();
        ds.FPHeapMax fPHeapMax7 = new ds.FPHeapMax((int) '#');
        fPHeapMax7.imprime();
        ds.Item item9 = fPHeapMax7.max();
        ds.Item item10 = null;
        ds.Item[] itemArray11 = new ds.Item[] { item10 };
        fPHeapMax7.copia(itemArray11);
        fPHeapMax1.copia(itemArray11);
        fPHeapMax1.imprime();
        ds.FPHeapMax fPHeapMax17 = new ds.FPHeapMax((int) (short) 100);
        fPHeapMax17.constroi();
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMax1.aumentaChave((int) (short) 100, (java.lang.Object) fPHeapMax17);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 100");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(item3);
        org.junit.Assert.assertNull(item5);
        org.junit.Assert.assertNull(item9);
        org.junit.Assert.assertNotNull(itemArray11);
    }

    @Test
    public void test371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test371");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) '#');
        fPHeapMax1.imprime();
        ds.Item item3 = fPHeapMax1.max();
        fPHeapMax1.constroi();
        ds.Item[] itemArray5 = null;
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMax1.copia(itemArray5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(item3);
    }

    @Test
    public void test372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test372");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (short) 1);
        ds.FPHeapMax fPHeapMax3 = new ds.FPHeapMax((int) (short) 0);
        ds.FPHeapMax fPHeapMax5 = new ds.FPHeapMax((int) '#');
        fPHeapMax5.imprime();
        ds.Item item7 = fPHeapMax5.max();
        ds.Item item8 = null;
        ds.Item[] itemArray9 = new ds.Item[] { item8 };
        fPHeapMax5.copia(itemArray9);
        fPHeapMax3.copia(itemArray9);
        fPHeapMax3.constroi();
        fPHeapMax3.constroi();
        ds.FPHeapMax fPHeapMax15 = new ds.FPHeapMax((int) (short) 10);
        fPHeapMax15.constroi();
        ds.Item item17 = fPHeapMax15.max();
        fPHeapMax15.constroi();
        ds.Item item19 = fPHeapMax15.max();
        fPHeapMax15.imprime();
        ds.FPHeapMax fPHeapMax22 = new ds.FPHeapMax((int) '#');
        fPHeapMax22.imprime();
        ds.Item item24 = fPHeapMax22.max();
        ds.Item item25 = null;
        ds.Item[] itemArray26 = new ds.Item[] { item25 };
        fPHeapMax22.copia(itemArray26);
        fPHeapMax15.copia(itemArray26);
        fPHeapMax3.copia(itemArray26);
        fPHeapMax1.copia(itemArray26);
        ds.FPHeapMax fPHeapMax33 = new ds.FPHeapMax((int) (short) 10);
        fPHeapMax33.constroi();
        ds.Item item35 = fPHeapMax33.max();
        fPHeapMax33.constroi();
        ds.Item item37 = fPHeapMax33.max();
        fPHeapMax33.imprime();
        ds.Item[] itemArray39 = new ds.Item[] {};
        fPHeapMax33.copia(itemArray39);
        fPHeapMax33.imprime();
        fPHeapMax33.imprime();
        java.lang.Class<?> wildcardClass43 = fPHeapMax33.getClass();
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMax1.aumentaChave((int) (short) 0, (java.lang.Object) fPHeapMax33);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(item7);
        org.junit.Assert.assertNotNull(itemArray9);
        org.junit.Assert.assertNull(item17);
        org.junit.Assert.assertNull(item19);
        org.junit.Assert.assertNull(item24);
        org.junit.Assert.assertNotNull(itemArray26);
        org.junit.Assert.assertNull(item35);
        org.junit.Assert.assertNull(item37);
        org.junit.Assert.assertNotNull(itemArray39);
        org.junit.Assert.assertNotNull(wildcardClass43);
    }

    @Test
    public void test373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test373");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (short) 10);
        fPHeapMax1.refaz((int) (short) 1, 0);
        fPHeapMax1.imprime();
        fPHeapMax1.imprime();
        ds.FPHeapMax fPHeapMax8 = new ds.FPHeapMax((int) '#');
        fPHeapMax8.imprime();
        fPHeapMax8.constroi();
        fPHeapMax8.constroi();
        fPHeapMax8.imprime();
        fPHeapMax8.refaz((int) (byte) 1, 1);
        ds.FPHeapMax fPHeapMax17 = new ds.FPHeapMax((int) (short) 10);
        fPHeapMax17.constroi();
        ds.Item item19 = fPHeapMax17.max();
        fPHeapMax17.constroi();
        ds.Item item21 = fPHeapMax17.max();
        ds.FPHeapMax fPHeapMax23 = new ds.FPHeapMax((int) '#');
        fPHeapMax23.imprime();
        ds.Item item25 = fPHeapMax23.max();
        ds.Item item26 = null;
        ds.Item[] itemArray27 = new ds.Item[] { item26 };
        fPHeapMax23.copia(itemArray27);
        fPHeapMax17.copia(itemArray27);
        fPHeapMax8.copia(itemArray27);
        fPHeapMax1.copia(itemArray27);
        // The following exception was thrown during execution in test generation
        try {
            ds.Item item32 = fPHeapMax1.retiraMax();
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: heap vazio");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(item19);
        org.junit.Assert.assertNull(item21);
        org.junit.Assert.assertNull(item25);
        org.junit.Assert.assertNotNull(itemArray27);
    }

    @Test
    public void test374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test374");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (short) 10);
        fPHeapMax1.constroi();
        ds.Item item3 = fPHeapMax1.max();
        ds.Item item4 = fPHeapMax1.max();
        // The following exception was thrown during execution in test generation
        try {
            ds.Item item5 = fPHeapMax1.retiraMax();
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: heap vazio");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(item3);
        org.junit.Assert.assertNull(item4);
    }

    @Test
    public void test375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test375");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (short) 10);
        fPHeapMax1.constroi();
        ds.Item item3 = fPHeapMax1.max();
        fPHeapMax1.constroi();
        ds.Item item5 = fPHeapMax1.max();
        ds.FPHeapMax fPHeapMax7 = new ds.FPHeapMax((int) '#');
        fPHeapMax7.imprime();
        ds.Item item9 = fPHeapMax7.max();
        ds.Item item10 = null;
        ds.Item[] itemArray11 = new ds.Item[] { item10 };
        fPHeapMax7.copia(itemArray11);
        fPHeapMax1.copia(itemArray11);
        fPHeapMax1.imprime();
        ds.Item item15 = fPHeapMax1.max();
        ds.FPHeapMax fPHeapMax17 = new ds.FPHeapMax((int) (byte) 10);
        fPHeapMax17.imprime();
        ds.FPHeapMax fPHeapMax20 = new ds.FPHeapMax(100);
        ds.Item[] itemArray21 = new ds.Item[] {};
        fPHeapMax20.copia(itemArray21);
        fPHeapMax17.copia(itemArray21);
        ds.FPHeapMax fPHeapMax25 = new ds.FPHeapMax(100);
        ds.Item[] itemArray26 = new ds.Item[] {};
        fPHeapMax25.copia(itemArray26);
        ds.FPHeapMax fPHeapMax29 = new ds.FPHeapMax((int) (short) 10);
        fPHeapMax29.constroi();
        ds.Item item31 = fPHeapMax29.max();
        fPHeapMax29.constroi();
        ds.Item item33 = fPHeapMax29.max();
        fPHeapMax29.imprime();
        ds.Item[] itemArray35 = new ds.Item[] {};
        fPHeapMax29.copia(itemArray35);
        fPHeapMax29.constroi();
        ds.FPHeapMax fPHeapMax39 = new ds.FPHeapMax(100);
        ds.Item[] itemArray40 = new ds.Item[] {};
        fPHeapMax39.copia(itemArray40);
        fPHeapMax29.copia(itemArray40);
        fPHeapMax25.copia(itemArray40);
        fPHeapMax17.copia(itemArray40);
        fPHeapMax1.copia(itemArray40);
        org.junit.Assert.assertNull(item3);
        org.junit.Assert.assertNull(item5);
        org.junit.Assert.assertNull(item9);
        org.junit.Assert.assertNotNull(itemArray11);
        org.junit.Assert.assertNull(item15);
        org.junit.Assert.assertNotNull(itemArray21);
        org.junit.Assert.assertNotNull(itemArray26);
        org.junit.Assert.assertNull(item31);
        org.junit.Assert.assertNull(item33);
        org.junit.Assert.assertNotNull(itemArray35);
        org.junit.Assert.assertNotNull(itemArray40);
    }

    @Test
    public void test376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test376");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (short) 10);
        fPHeapMax1.constroi();
        ds.Item item3 = fPHeapMax1.max();
        fPHeapMax1.constroi();
        fPHeapMax1.imprime();
        ds.FPHeapMax fPHeapMax7 = new ds.FPHeapMax((int) (short) 10);
        fPHeapMax7.constroi();
        ds.Item item9 = fPHeapMax7.max();
        fPHeapMax7.constroi();
        ds.Item item11 = fPHeapMax7.max();
        fPHeapMax7.imprime();
        fPHeapMax7.constroi();
        fPHeapMax7.constroi();
        ds.FPHeapMax fPHeapMax16 = new ds.FPHeapMax((int) (short) 10);
        fPHeapMax16.constroi();
        ds.Item item18 = fPHeapMax16.max();
        fPHeapMax16.imprime();
        fPHeapMax16.refaz(10, (int) (byte) 1);
        ds.FPHeapMax fPHeapMax24 = new ds.FPHeapMax(100);
        ds.Item[] itemArray25 = new ds.Item[] {};
        fPHeapMax24.copia(itemArray25);
        fPHeapMax16.copia(itemArray25);
        fPHeapMax7.copia(itemArray25);
        ds.FPHeapMax fPHeapMax30 = new ds.FPHeapMax((int) (byte) 10);
        fPHeapMax30.imprime();
        ds.FPHeapMax fPHeapMax33 = new ds.FPHeapMax(100);
        ds.Item[] itemArray34 = new ds.Item[] {};
        fPHeapMax33.copia(itemArray34);
        fPHeapMax30.copia(itemArray34);
        fPHeapMax7.copia(itemArray34);
        fPHeapMax1.copia(itemArray34);
        fPHeapMax1.imprime();
        org.junit.Assert.assertNull(item3);
        org.junit.Assert.assertNull(item9);
        org.junit.Assert.assertNull(item11);
        org.junit.Assert.assertNull(item18);
        org.junit.Assert.assertNotNull(itemArray25);
        org.junit.Assert.assertNotNull(itemArray34);
    }

    @Test
    public void test377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test377");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) '#');
        fPHeapMax1.imprime();
        fPHeapMax1.constroi();
        fPHeapMax1.constroi();
        fPHeapMax1.imprime();
        fPHeapMax1.refaz((int) (byte) 1, 1);
        ds.FPHeapMax fPHeapMax10 = new ds.FPHeapMax((int) (short) 10);
        fPHeapMax10.constroi();
        ds.Item item12 = fPHeapMax10.max();
        fPHeapMax10.constroi();
        ds.Item item14 = fPHeapMax10.max();
        ds.FPHeapMax fPHeapMax16 = new ds.FPHeapMax((int) '#');
        fPHeapMax16.imprime();
        ds.Item item18 = fPHeapMax16.max();
        ds.Item item19 = null;
        ds.Item[] itemArray20 = new ds.Item[] { item19 };
        fPHeapMax16.copia(itemArray20);
        fPHeapMax10.copia(itemArray20);
        fPHeapMax1.copia(itemArray20);
        ds.FPHeapMax fPHeapMax25 = new ds.FPHeapMax((int) (short) 10);
        fPHeapMax25.constroi();
        ds.Item item27 = fPHeapMax25.max();
        fPHeapMax25.constroi();
        ds.Item item29 = fPHeapMax25.max();
        fPHeapMax25.imprime();
        ds.FPHeapMax fPHeapMax32 = new ds.FPHeapMax((int) '#');
        fPHeapMax32.imprime();
        ds.Item item34 = fPHeapMax32.max();
        ds.Item item35 = null;
        ds.Item[] itemArray36 = new ds.Item[] { item35 };
        fPHeapMax32.copia(itemArray36);
        fPHeapMax25.copia(itemArray36);
        fPHeapMax1.copia(itemArray36);
        ds.Item item40 = fPHeapMax1.max();
        fPHeapMax1.constroi();
        org.junit.Assert.assertNull(item12);
        org.junit.Assert.assertNull(item14);
        org.junit.Assert.assertNull(item18);
        org.junit.Assert.assertNotNull(itemArray20);
        org.junit.Assert.assertNull(item27);
        org.junit.Assert.assertNull(item29);
        org.junit.Assert.assertNull(item34);
        org.junit.Assert.assertNotNull(itemArray36);
        org.junit.Assert.assertNull(item40);
    }

    @Test
    public void test378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test378");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (short) 10);
        fPHeapMax1.constroi();
        ds.Item item3 = fPHeapMax1.max();
        fPHeapMax1.constroi();
        ds.Item item5 = fPHeapMax1.max();
        fPHeapMax1.imprime();
        ds.FPHeapMax fPHeapMax8 = new ds.FPHeapMax((int) '#');
        fPHeapMax8.imprime();
        ds.Item item10 = fPHeapMax8.max();
        ds.Item item11 = null;
        ds.Item[] itemArray12 = new ds.Item[] { item11 };
        fPHeapMax8.copia(itemArray12);
        fPHeapMax1.copia(itemArray12);
        fPHeapMax1.constroi();
        ds.FPHeapMax fPHeapMax17 = new ds.FPHeapMax(100);
        ds.Item[] itemArray18 = new ds.Item[] {};
        fPHeapMax17.copia(itemArray18);
        fPHeapMax1.copia(itemArray18);
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMax1.refaz((int) '#', (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 35");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(item3);
        org.junit.Assert.assertNull(item5);
        org.junit.Assert.assertNull(item10);
        org.junit.Assert.assertNotNull(itemArray12);
        org.junit.Assert.assertNotNull(itemArray18);
    }

    @Test
    public void test379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test379");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (short) 10);
        fPHeapMax1.constroi();
        ds.Item item3 = fPHeapMax1.max();
        fPHeapMax1.constroi();
        ds.Item item5 = fPHeapMax1.max();
        ds.FPHeapMax fPHeapMax7 = new ds.FPHeapMax((int) (short) 10);
        fPHeapMax7.constroi();
        ds.FPHeapMax fPHeapMax10 = new ds.FPHeapMax((int) (short) 10);
        fPHeapMax10.constroi();
        ds.Item item12 = fPHeapMax10.max();
        fPHeapMax10.constroi();
        ds.Item item14 = fPHeapMax10.max();
        fPHeapMax10.imprime();
        ds.Item[] itemArray16 = new ds.Item[] {};
        fPHeapMax10.copia(itemArray16);
        fPHeapMax7.copia(itemArray16);
        fPHeapMax1.copia(itemArray16);
        ds.Item item20 = fPHeapMax1.max();
        fPHeapMax1.constroi();
        ds.Item item22 = fPHeapMax1.max();
        fPHeapMax1.constroi();
        org.junit.Assert.assertNull(item3);
        org.junit.Assert.assertNull(item5);
        org.junit.Assert.assertNull(item12);
        org.junit.Assert.assertNull(item14);
        org.junit.Assert.assertNotNull(itemArray16);
        org.junit.Assert.assertNull(item20);
        org.junit.Assert.assertNull(item22);
    }

    @Test
    public void test380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test380");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (byte) 10);
        fPHeapMax1.constroi();
        ds.Item item3 = fPHeapMax1.max();
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMax1.refaz(100, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 100");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(item3);
    }

    @Test
    public void test381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test381");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (short) 10);
        fPHeapMax1.constroi();
        ds.Item item3 = fPHeapMax1.max();
        fPHeapMax1.imprime();
        ds.FPHeapMax fPHeapMax6 = new ds.FPHeapMax((int) (short) 10);
        fPHeapMax6.constroi();
        ds.Item item8 = fPHeapMax6.max();
        fPHeapMax6.imprime();
        fPHeapMax6.refaz(10, (int) (byte) 1);
        ds.Item item13 = fPHeapMax6.max();
        fPHeapMax6.imprime();
        ds.FPHeapMax fPHeapMax16 = new ds.FPHeapMax((int) '#');
        fPHeapMax16.imprime();
        fPHeapMax16.constroi();
        fPHeapMax16.constroi();
        fPHeapMax16.imprime();
        fPHeapMax16.constroi();
        fPHeapMax16.constroi();
        ds.FPHeapMax fPHeapMax24 = new ds.FPHeapMax((int) (short) 10);
        fPHeapMax24.constroi();
        ds.Item item26 = fPHeapMax24.max();
        fPHeapMax24.constroi();
        ds.Item item28 = fPHeapMax24.max();
        fPHeapMax24.imprime();
        fPHeapMax24.constroi();
        fPHeapMax24.constroi();
        ds.FPHeapMax fPHeapMax33 = new ds.FPHeapMax((int) (short) 10);
        fPHeapMax33.constroi();
        ds.Item item35 = fPHeapMax33.max();
        fPHeapMax33.imprime();
        fPHeapMax33.refaz(10, (int) (byte) 1);
        ds.FPHeapMax fPHeapMax41 = new ds.FPHeapMax(100);
        ds.Item[] itemArray42 = new ds.Item[] {};
        fPHeapMax41.copia(itemArray42);
        fPHeapMax33.copia(itemArray42);
        fPHeapMax24.copia(itemArray42);
        fPHeapMax16.copia(itemArray42);
        fPHeapMax16.imprime();
        fPHeapMax16.imprime();
        ds.Item item49 = fPHeapMax16.max();
        ds.FPHeapMax fPHeapMax51 = new ds.FPHeapMax((int) (byte) 100);
        fPHeapMax51.imprime();
        fPHeapMax51.imprime();
        ds.Item item54 = fPHeapMax51.max();
        fPHeapMax51.constroi();
        ds.Item item56 = fPHeapMax51.max();
        fPHeapMax51.imprime();
        ds.FPHeapMax fPHeapMax59 = new ds.FPHeapMax((int) '#');
        fPHeapMax59.imprime();
        ds.Item item61 = fPHeapMax59.max();
        ds.Item item62 = null;
        ds.Item[] itemArray63 = new ds.Item[] { item62 };
        fPHeapMax59.copia(itemArray63);
        ds.Item item65 = fPHeapMax59.max();
        ds.FPHeapMax fPHeapMax67 = new ds.FPHeapMax((int) (byte) 10);
        fPHeapMax67.imprime();
        ds.FPHeapMax fPHeapMax70 = new ds.FPHeapMax(100);
        ds.Item[] itemArray71 = new ds.Item[] {};
        fPHeapMax70.copia(itemArray71);
        fPHeapMax67.copia(itemArray71);
        ds.FPHeapMax fPHeapMax75 = new ds.FPHeapMax(100);
        ds.Item[] itemArray76 = new ds.Item[] {};
        fPHeapMax75.copia(itemArray76);
        ds.FPHeapMax fPHeapMax79 = new ds.FPHeapMax((int) (short) 10);
        fPHeapMax79.constroi();
        ds.Item item81 = fPHeapMax79.max();
        fPHeapMax79.constroi();
        ds.Item item83 = fPHeapMax79.max();
        fPHeapMax79.imprime();
        ds.Item[] itemArray85 = new ds.Item[] {};
        fPHeapMax79.copia(itemArray85);
        fPHeapMax79.constroi();
        ds.FPHeapMax fPHeapMax89 = new ds.FPHeapMax(100);
        ds.Item[] itemArray90 = new ds.Item[] {};
        fPHeapMax89.copia(itemArray90);
        fPHeapMax79.copia(itemArray90);
        fPHeapMax75.copia(itemArray90);
        fPHeapMax67.copia(itemArray90);
        fPHeapMax59.copia(itemArray90);
        fPHeapMax51.copia(itemArray90);
        fPHeapMax16.copia(itemArray90);
        fPHeapMax6.copia(itemArray90);
        fPHeapMax1.copia(itemArray90);
        org.junit.Assert.assertNull(item3);
        org.junit.Assert.assertNull(item8);
        org.junit.Assert.assertNull(item13);
        org.junit.Assert.assertNull(item26);
        org.junit.Assert.assertNull(item28);
        org.junit.Assert.assertNull(item35);
        org.junit.Assert.assertNotNull(itemArray42);
        org.junit.Assert.assertNull(item49);
        org.junit.Assert.assertNull(item54);
        org.junit.Assert.assertNull(item56);
        org.junit.Assert.assertNull(item61);
        org.junit.Assert.assertNotNull(itemArray63);
        org.junit.Assert.assertNull(item65);
        org.junit.Assert.assertNotNull(itemArray71);
        org.junit.Assert.assertNotNull(itemArray76);
        org.junit.Assert.assertNull(item81);
        org.junit.Assert.assertNull(item83);
        org.junit.Assert.assertNotNull(itemArray85);
        org.junit.Assert.assertNotNull(itemArray90);
    }

    @Test
    public void test382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test382");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (byte) -1);
        java.lang.Object obj3 = null;
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMax1.aumentaChave((int) (byte) 0, obj3);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 0");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test383");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (short) 10);
        fPHeapMax1.constroi();
        ds.Item item3 = fPHeapMax1.max();
        fPHeapMax1.constroi();
        fPHeapMax1.constroi();
        ds.Item item6 = fPHeapMax1.max();
        ds.FPHeapMax fPHeapMax8 = new ds.FPHeapMax((int) '#');
        fPHeapMax8.imprime();
        fPHeapMax8.constroi();
        fPHeapMax8.constroi();
        ds.FPHeapMax fPHeapMax13 = new ds.FPHeapMax((int) '#');
        fPHeapMax13.imprime();
        ds.Item item15 = fPHeapMax13.max();
        ds.Item item16 = null;
        ds.Item[] itemArray17 = new ds.Item[] { item16 };
        fPHeapMax13.copia(itemArray17);
        fPHeapMax8.copia(itemArray17);
        fPHeapMax1.copia(itemArray17);
        ds.FPHeapMax fPHeapMax23 = new ds.FPHeapMax((int) (short) 10);
        ds.Item item24 = fPHeapMax23.max();
        fPHeapMax23.imprime();
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMax1.aumentaChave((int) (byte) 10, (java.lang.Object) fPHeapMax23);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(item3);
        org.junit.Assert.assertNull(item6);
        org.junit.Assert.assertNull(item15);
        org.junit.Assert.assertNotNull(itemArray17);
        org.junit.Assert.assertNull(item24);
    }

    @Test
    public void test384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test384");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax(100);
        ds.Item[] itemArray2 = new ds.Item[] {};
        fPHeapMax1.copia(itemArray2);
        fPHeapMax1.imprime();
        fPHeapMax1.refaz((int) (byte) 100, (int) '#');
        ds.Item item8 = fPHeapMax1.max();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass9 = item8.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray2);
        org.junit.Assert.assertNull(item8);
    }

    @Test
    public void test385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test385");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (short) 10);
        fPHeapMax1.constroi();
        ds.Item item3 = fPHeapMax1.max();
        fPHeapMax1.constroi();
        ds.Item item5 = fPHeapMax1.max();
        fPHeapMax1.imprime();
        ds.Item[] itemArray7 = new ds.Item[] {};
        fPHeapMax1.copia(itemArray7);
        ds.FPHeapMax fPHeapMax10 = new ds.FPHeapMax(10);
        ds.FPHeapMax fPHeapMax12 = new ds.FPHeapMax((int) '#');
        fPHeapMax12.imprime();
        ds.Item item14 = fPHeapMax12.max();
        ds.Item item15 = null;
        ds.Item[] itemArray16 = new ds.Item[] { item15 };
        fPHeapMax12.copia(itemArray16);
        ds.Item item18 = fPHeapMax12.max();
        ds.FPHeapMax fPHeapMax20 = new ds.FPHeapMax((int) (byte) 10);
        fPHeapMax20.imprime();
        ds.FPHeapMax fPHeapMax23 = new ds.FPHeapMax(100);
        ds.Item[] itemArray24 = new ds.Item[] {};
        fPHeapMax23.copia(itemArray24);
        fPHeapMax20.copia(itemArray24);
        ds.FPHeapMax fPHeapMax28 = new ds.FPHeapMax(100);
        ds.Item[] itemArray29 = new ds.Item[] {};
        fPHeapMax28.copia(itemArray29);
        ds.FPHeapMax fPHeapMax32 = new ds.FPHeapMax((int) (short) 10);
        fPHeapMax32.constroi();
        ds.Item item34 = fPHeapMax32.max();
        fPHeapMax32.constroi();
        ds.Item item36 = fPHeapMax32.max();
        fPHeapMax32.imprime();
        ds.Item[] itemArray38 = new ds.Item[] {};
        fPHeapMax32.copia(itemArray38);
        fPHeapMax32.constroi();
        ds.FPHeapMax fPHeapMax42 = new ds.FPHeapMax(100);
        ds.Item[] itemArray43 = new ds.Item[] {};
        fPHeapMax42.copia(itemArray43);
        fPHeapMax32.copia(itemArray43);
        fPHeapMax28.copia(itemArray43);
        fPHeapMax20.copia(itemArray43);
        fPHeapMax12.copia(itemArray43);
        fPHeapMax10.copia(itemArray43);
        fPHeapMax1.copia(itemArray43);
        ds.Item item51 = null;
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMax1.insere(item51);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(item3);
        org.junit.Assert.assertNull(item5);
        org.junit.Assert.assertNotNull(itemArray7);
        org.junit.Assert.assertNull(item14);
        org.junit.Assert.assertNotNull(itemArray16);
        org.junit.Assert.assertNull(item18);
        org.junit.Assert.assertNotNull(itemArray24);
        org.junit.Assert.assertNotNull(itemArray29);
        org.junit.Assert.assertNull(item34);
        org.junit.Assert.assertNull(item36);
        org.junit.Assert.assertNotNull(itemArray38);
        org.junit.Assert.assertNotNull(itemArray43);
    }

    @Test
    public void test386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test386");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (byte) 100);
        fPHeapMax1.imprime();
        ds.FPHeapMax fPHeapMax4 = new ds.FPHeapMax(1);
        ds.FPHeapMax fPHeapMax6 = new ds.FPHeapMax((int) (short) 10);
        fPHeapMax6.constroi();
        ds.Item item8 = fPHeapMax6.max();
        fPHeapMax6.constroi();
        ds.Item item10 = fPHeapMax6.max();
        fPHeapMax6.imprime();
        ds.Item[] itemArray12 = new ds.Item[] {};
        fPHeapMax6.copia(itemArray12);
        fPHeapMax4.copia(itemArray12);
        fPHeapMax1.copia(itemArray12);
        ds.FPHeapMax fPHeapMax17 = new ds.FPHeapMax(100);
        ds.Item[] itemArray18 = new ds.Item[] {};
        fPHeapMax17.copia(itemArray18);
        fPHeapMax1.copia(itemArray18);
        ds.Item item21 = null;
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMax1.insere(item21);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(item8);
        org.junit.Assert.assertNull(item10);
        org.junit.Assert.assertNotNull(itemArray12);
        org.junit.Assert.assertNotNull(itemArray18);
    }

    @Test
    public void test387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test387");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (short) 10);
        fPHeapMax1.constroi();
        ds.Item item3 = fPHeapMax1.max();
        fPHeapMax1.constroi();
        ds.Item item5 = fPHeapMax1.max();
        ds.FPHeapMax fPHeapMax7 = new ds.FPHeapMax((int) (short) 10);
        fPHeapMax7.constroi();
        ds.FPHeapMax fPHeapMax10 = new ds.FPHeapMax((int) (short) 10);
        fPHeapMax10.constroi();
        ds.Item item12 = fPHeapMax10.max();
        fPHeapMax10.constroi();
        ds.Item item14 = fPHeapMax10.max();
        fPHeapMax10.imprime();
        ds.Item[] itemArray16 = new ds.Item[] {};
        fPHeapMax10.copia(itemArray16);
        fPHeapMax7.copia(itemArray16);
        fPHeapMax1.copia(itemArray16);
        ds.Item item20 = fPHeapMax1.max();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass21 = item20.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(item3);
        org.junit.Assert.assertNull(item5);
        org.junit.Assert.assertNull(item12);
        org.junit.Assert.assertNull(item14);
        org.junit.Assert.assertNotNull(itemArray16);
        org.junit.Assert.assertNull(item20);
    }

    @Test
    public void test388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test388");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) '#');
        fPHeapMax1.imprime();
        fPHeapMax1.constroi();
        fPHeapMax1.constroi();
        fPHeapMax1.imprime();
        ds.FPHeapMax fPHeapMax7 = new ds.FPHeapMax((int) (byte) 100);
        ds.FPHeapMax fPHeapMax9 = new ds.FPHeapMax(1);
        ds.FPHeapMax fPHeapMax11 = new ds.FPHeapMax((int) (short) 10);
        fPHeapMax11.constroi();
        ds.Item item13 = fPHeapMax11.max();
        fPHeapMax11.constroi();
        ds.Item item15 = fPHeapMax11.max();
        fPHeapMax11.imprime();
        ds.Item[] itemArray17 = new ds.Item[] {};
        fPHeapMax11.copia(itemArray17);
        fPHeapMax9.copia(itemArray17);
        fPHeapMax7.copia(itemArray17);
        fPHeapMax1.copia(itemArray17);
        fPHeapMax1.constroi();
        ds.Item item23 = fPHeapMax1.max();
        // The following exception was thrown during execution in test generation
        try {
            ds.Item item24 = fPHeapMax1.retiraMax();
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: heap vazio");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(item13);
        org.junit.Assert.assertNull(item15);
        org.junit.Assert.assertNotNull(itemArray17);
        org.junit.Assert.assertNull(item23);
    }

    @Test
    public void test389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test389");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) '#');
        fPHeapMax1.imprime();
        ds.Item item3 = fPHeapMax1.max();
        ds.Item item4 = null;
        ds.Item[] itemArray5 = new ds.Item[] { item4 };
        fPHeapMax1.copia(itemArray5);
        ds.Item item7 = fPHeapMax1.max();
        ds.FPHeapMax fPHeapMax9 = new ds.FPHeapMax((int) (byte) 10);
        fPHeapMax9.imprime();
        ds.FPHeapMax fPHeapMax12 = new ds.FPHeapMax(100);
        ds.Item[] itemArray13 = new ds.Item[] {};
        fPHeapMax12.copia(itemArray13);
        fPHeapMax9.copia(itemArray13);
        ds.FPHeapMax fPHeapMax17 = new ds.FPHeapMax(100);
        ds.Item[] itemArray18 = new ds.Item[] {};
        fPHeapMax17.copia(itemArray18);
        ds.FPHeapMax fPHeapMax21 = new ds.FPHeapMax((int) (short) 10);
        fPHeapMax21.constroi();
        ds.Item item23 = fPHeapMax21.max();
        fPHeapMax21.constroi();
        ds.Item item25 = fPHeapMax21.max();
        fPHeapMax21.imprime();
        ds.Item[] itemArray27 = new ds.Item[] {};
        fPHeapMax21.copia(itemArray27);
        fPHeapMax21.constroi();
        ds.FPHeapMax fPHeapMax31 = new ds.FPHeapMax(100);
        ds.Item[] itemArray32 = new ds.Item[] {};
        fPHeapMax31.copia(itemArray32);
        fPHeapMax21.copia(itemArray32);
        fPHeapMax17.copia(itemArray32);
        fPHeapMax9.copia(itemArray32);
        fPHeapMax1.copia(itemArray32);
        fPHeapMax1.constroi();
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMax1.refaz((int) 'a', 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 97");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(item3);
        org.junit.Assert.assertNotNull(itemArray5);
        org.junit.Assert.assertNull(item7);
        org.junit.Assert.assertNotNull(itemArray13);
        org.junit.Assert.assertNotNull(itemArray18);
        org.junit.Assert.assertNull(item23);
        org.junit.Assert.assertNull(item25);
        org.junit.Assert.assertNotNull(itemArray27);
        org.junit.Assert.assertNotNull(itemArray32);
    }

    @Test
    public void test390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test390");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (short) 0);
        ds.FPHeapMax fPHeapMax3 = new ds.FPHeapMax((int) '#');
        fPHeapMax3.imprime();
        ds.Item item5 = fPHeapMax3.max();
        ds.Item item6 = null;
        ds.Item[] itemArray7 = new ds.Item[] { item6 };
        fPHeapMax3.copia(itemArray7);
        fPHeapMax1.copia(itemArray7);
        fPHeapMax1.constroi();
        fPHeapMax1.constroi();
        ds.FPHeapMax fPHeapMax13 = new ds.FPHeapMax((int) (short) 10);
        fPHeapMax13.constroi();
        ds.Item item15 = fPHeapMax13.max();
        fPHeapMax13.constroi();
        ds.Item item17 = fPHeapMax13.max();
        fPHeapMax13.imprime();
        ds.FPHeapMax fPHeapMax20 = new ds.FPHeapMax((int) '#');
        fPHeapMax20.imprime();
        ds.Item item22 = fPHeapMax20.max();
        ds.Item item23 = null;
        ds.Item[] itemArray24 = new ds.Item[] { item23 };
        fPHeapMax20.copia(itemArray24);
        fPHeapMax13.copia(itemArray24);
        fPHeapMax1.copia(itemArray24);
        fPHeapMax1.imprime();
        ds.FPHeapMax fPHeapMax31 = new ds.FPHeapMax((int) (short) 10);
        fPHeapMax31.constroi();
        ds.FPHeapMax fPHeapMax34 = new ds.FPHeapMax((int) (short) 10);
        fPHeapMax34.constroi();
        ds.Item item36 = fPHeapMax34.max();
        fPHeapMax34.constroi();
        ds.Item item38 = fPHeapMax34.max();
        fPHeapMax34.imprime();
        ds.Item[] itemArray40 = new ds.Item[] {};
        fPHeapMax34.copia(itemArray40);
        fPHeapMax31.copia(itemArray40);
        fPHeapMax31.imprime();
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMax1.aumentaChave((int) '4', (java.lang.Object) fPHeapMax31);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 52");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(item5);
        org.junit.Assert.assertNotNull(itemArray7);
        org.junit.Assert.assertNull(item15);
        org.junit.Assert.assertNull(item17);
        org.junit.Assert.assertNull(item22);
        org.junit.Assert.assertNotNull(itemArray24);
        org.junit.Assert.assertNull(item36);
        org.junit.Assert.assertNull(item38);
        org.junit.Assert.assertNotNull(itemArray40);
    }

    @Test
    public void test391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test391");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (short) 10);
        fPHeapMax1.constroi();
        ds.Item item3 = fPHeapMax1.max();
        fPHeapMax1.constroi();
        fPHeapMax1.imprime();
        ds.FPHeapMax fPHeapMax7 = new ds.FPHeapMax((int) (short) 10);
        fPHeapMax7.constroi();
        ds.Item item9 = fPHeapMax7.max();
        fPHeapMax7.constroi();
        ds.Item item11 = fPHeapMax7.max();
        fPHeapMax7.imprime();
        fPHeapMax7.constroi();
        fPHeapMax7.constroi();
        ds.FPHeapMax fPHeapMax16 = new ds.FPHeapMax((int) (short) 10);
        fPHeapMax16.constroi();
        ds.Item item18 = fPHeapMax16.max();
        fPHeapMax16.imprime();
        fPHeapMax16.refaz(10, (int) (byte) 1);
        ds.FPHeapMax fPHeapMax24 = new ds.FPHeapMax(100);
        ds.Item[] itemArray25 = new ds.Item[] {};
        fPHeapMax24.copia(itemArray25);
        fPHeapMax16.copia(itemArray25);
        fPHeapMax7.copia(itemArray25);
        ds.FPHeapMax fPHeapMax30 = new ds.FPHeapMax((int) (byte) 10);
        fPHeapMax30.imprime();
        ds.FPHeapMax fPHeapMax33 = new ds.FPHeapMax(100);
        ds.Item[] itemArray34 = new ds.Item[] {};
        fPHeapMax33.copia(itemArray34);
        fPHeapMax30.copia(itemArray34);
        fPHeapMax7.copia(itemArray34);
        fPHeapMax1.copia(itemArray34);
        ds.Item item39 = null;
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMax1.insere(item39);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(item3);
        org.junit.Assert.assertNull(item9);
        org.junit.Assert.assertNull(item11);
        org.junit.Assert.assertNull(item18);
        org.junit.Assert.assertNotNull(itemArray25);
        org.junit.Assert.assertNotNull(itemArray34);
    }

    @Test
    public void test392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test392");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (short) 10);
        fPHeapMax1.constroi();
        ds.Item item3 = fPHeapMax1.max();
        fPHeapMax1.imprime();
        fPHeapMax1.refaz(10, (int) (byte) 1);
        fPHeapMax1.imprime();
        fPHeapMax1.imprime();
        fPHeapMax1.imprime();
        org.junit.Assert.assertNull(item3);
    }

    @Test
    public void test393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test393");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (short) 0);
        ds.FPHeapMax fPHeapMax3 = new ds.FPHeapMax((int) '#');
        fPHeapMax3.imprime();
        ds.Item item5 = fPHeapMax3.max();
        ds.Item item6 = null;
        ds.Item[] itemArray7 = new ds.Item[] { item6 };
        fPHeapMax3.copia(itemArray7);
        fPHeapMax1.copia(itemArray7);
        fPHeapMax1.imprime();
        fPHeapMax1.constroi();
        // The following exception was thrown during execution in test generation
        try {
            ds.Item item12 = fPHeapMax1.retiraMax();
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: heap vazio");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(item5);
        org.junit.Assert.assertNotNull(itemArray7);
    }

    @Test
    public void test394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test394");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (short) 10);
        ds.Item item2 = fPHeapMax1.max();
        ds.Item item3 = fPHeapMax1.max();
        fPHeapMax1.imprime();
        // The following exception was thrown during execution in test generation
        try {
            ds.Item item5 = fPHeapMax1.retiraMax();
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: heap vazio");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(item2);
        org.junit.Assert.assertNull(item3);
    }

    @Test
    public void test395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test395");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) '#');
        fPHeapMax1.refaz((int) (short) 0, (-1));
        fPHeapMax1.imprime();
        fPHeapMax1.constroi();
        ds.FPHeapMax fPHeapMax8 = new ds.FPHeapMax((int) (short) 10);
        fPHeapMax8.constroi();
        ds.Item item10 = fPHeapMax8.max();
        fPHeapMax8.constroi();
        ds.Item item12 = fPHeapMax8.max();
        fPHeapMax8.imprime();
        ds.FPHeapMax fPHeapMax15 = new ds.FPHeapMax((int) '#');
        fPHeapMax15.imprime();
        ds.Item item17 = fPHeapMax15.max();
        ds.Item item18 = null;
        ds.Item[] itemArray19 = new ds.Item[] { item18 };
        fPHeapMax15.copia(itemArray19);
        fPHeapMax8.copia(itemArray19);
        fPHeapMax1.copia(itemArray19);
        java.lang.Class<?> wildcardClass23 = itemArray19.getClass();
        org.junit.Assert.assertNull(item10);
        org.junit.Assert.assertNull(item12);
        org.junit.Assert.assertNull(item17);
        org.junit.Assert.assertNotNull(itemArray19);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test396");
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
    public void test397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test397");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) '#');
        fPHeapMax1.imprime();
        ds.Item item3 = fPHeapMax1.max();
        // The following exception was thrown during execution in test generation
        try {
            ds.Item item4 = fPHeapMax1.retiraMax();
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: heap vazio");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(item3);
    }

    @Test
    public void test398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test398");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) '#');
        fPHeapMax1.imprime();
        fPHeapMax1.constroi();
        fPHeapMax1.constroi();
        fPHeapMax1.imprime();
        ds.FPHeapMax fPHeapMax7 = new ds.FPHeapMax((int) (byte) 100);
        ds.FPHeapMax fPHeapMax9 = new ds.FPHeapMax(1);
        ds.FPHeapMax fPHeapMax11 = new ds.FPHeapMax((int) (short) 10);
        fPHeapMax11.constroi();
        ds.Item item13 = fPHeapMax11.max();
        fPHeapMax11.constroi();
        ds.Item item15 = fPHeapMax11.max();
        fPHeapMax11.imprime();
        ds.Item[] itemArray17 = new ds.Item[] {};
        fPHeapMax11.copia(itemArray17);
        fPHeapMax9.copia(itemArray17);
        fPHeapMax7.copia(itemArray17);
        fPHeapMax1.copia(itemArray17);
        // The following exception was thrown during execution in test generation
        try {
            ds.Item item22 = fPHeapMax1.retiraMax();
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: heap vazio");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(item13);
        org.junit.Assert.assertNull(item15);
        org.junit.Assert.assertNotNull(itemArray17);
    }

    @Test
    public void test399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test399");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (short) 10);
        fPHeapMax1.constroi();
        ds.Item item3 = fPHeapMax1.max();
        fPHeapMax1.constroi();
        ds.Item item5 = fPHeapMax1.max();
        fPHeapMax1.imprime();
        ds.FPHeapMax fPHeapMax8 = new ds.FPHeapMax((int) '#');
        fPHeapMax8.imprime();
        ds.Item item10 = fPHeapMax8.max();
        ds.Item item11 = null;
        ds.Item[] itemArray12 = new ds.Item[] { item11 };
        fPHeapMax8.copia(itemArray12);
        fPHeapMax1.copia(itemArray12);
        fPHeapMax1.constroi();
        fPHeapMax1.imprime();
        fPHeapMax1.imprime();
        org.junit.Assert.assertNull(item3);
        org.junit.Assert.assertNull(item5);
        org.junit.Assert.assertNull(item10);
        org.junit.Assert.assertNotNull(itemArray12);
    }

    @Test
    public void test400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test400");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax(10);
        ds.Item item2 = fPHeapMax1.max();
        ds.FPHeapMax fPHeapMax4 = new ds.FPHeapMax((int) (short) 1);
        ds.FPHeapMax fPHeapMax6 = new ds.FPHeapMax((int) (short) 0);
        ds.FPHeapMax fPHeapMax8 = new ds.FPHeapMax((int) '#');
        fPHeapMax8.imprime();
        ds.Item item10 = fPHeapMax8.max();
        ds.Item item11 = null;
        ds.Item[] itemArray12 = new ds.Item[] { item11 };
        fPHeapMax8.copia(itemArray12);
        fPHeapMax6.copia(itemArray12);
        fPHeapMax6.constroi();
        fPHeapMax6.constroi();
        ds.FPHeapMax fPHeapMax18 = new ds.FPHeapMax((int) (short) 10);
        fPHeapMax18.constroi();
        ds.Item item20 = fPHeapMax18.max();
        fPHeapMax18.constroi();
        ds.Item item22 = fPHeapMax18.max();
        fPHeapMax18.imprime();
        ds.FPHeapMax fPHeapMax25 = new ds.FPHeapMax((int) '#');
        fPHeapMax25.imprime();
        ds.Item item27 = fPHeapMax25.max();
        ds.Item item28 = null;
        ds.Item[] itemArray29 = new ds.Item[] { item28 };
        fPHeapMax25.copia(itemArray29);
        fPHeapMax18.copia(itemArray29);
        fPHeapMax6.copia(itemArray29);
        fPHeapMax4.copia(itemArray29);
        fPHeapMax1.copia(itemArray29);
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMax1.refaz((int) (byte) 10, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 20");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(item2);
        org.junit.Assert.assertNull(item10);
        org.junit.Assert.assertNotNull(itemArray12);
        org.junit.Assert.assertNull(item20);
        org.junit.Assert.assertNull(item22);
        org.junit.Assert.assertNull(item27);
        org.junit.Assert.assertNotNull(itemArray29);
    }

    @Test
    public void test401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test401");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (short) 10);
        fPHeapMax1.constroi();
        ds.Item item3 = fPHeapMax1.max();
        fPHeapMax1.constroi();
        ds.Item item5 = fPHeapMax1.max();
        ds.FPHeapMax fPHeapMax7 = new ds.FPHeapMax((int) (short) 10);
        fPHeapMax7.constroi();
        ds.FPHeapMax fPHeapMax10 = new ds.FPHeapMax((int) (short) 10);
        fPHeapMax10.constroi();
        ds.Item item12 = fPHeapMax10.max();
        fPHeapMax10.constroi();
        ds.Item item14 = fPHeapMax10.max();
        fPHeapMax10.imprime();
        ds.Item[] itemArray16 = new ds.Item[] {};
        fPHeapMax10.copia(itemArray16);
        fPHeapMax7.copia(itemArray16);
        fPHeapMax1.copia(itemArray16);
        fPHeapMax1.constroi();
        fPHeapMax1.constroi();
        fPHeapMax1.imprime();
        ds.Item item23 = fPHeapMax1.max();
        fPHeapMax1.imprime();
        org.junit.Assert.assertNull(item3);
        org.junit.Assert.assertNull(item5);
        org.junit.Assert.assertNull(item12);
        org.junit.Assert.assertNull(item14);
        org.junit.Assert.assertNotNull(itemArray16);
        org.junit.Assert.assertNull(item23);
    }

    @Test
    public void test402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test402");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (short) 10);
        fPHeapMax1.constroi();
        ds.Item item3 = fPHeapMax1.max();
        fPHeapMax1.constroi();
        ds.Item item5 = fPHeapMax1.max();
        fPHeapMax1.imprime();
        fPHeapMax1.constroi();
        fPHeapMax1.constroi();
        fPHeapMax1.refaz((int) (short) 10, (-1));
        fPHeapMax1.imprime();
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMax1.refaz((int) (byte) 100, 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 100");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(item3);
        org.junit.Assert.assertNull(item5);
    }

    @Test
    public void test403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test403");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (byte) 100);
        fPHeapMax1.imprime();
        fPHeapMax1.imprime();
        ds.Item item4 = fPHeapMax1.max();
        fPHeapMax1.constroi();
        ds.Item item6 = fPHeapMax1.max();
        fPHeapMax1.imprime();
        ds.FPHeapMax fPHeapMax9 = new ds.FPHeapMax((int) '#');
        fPHeapMax9.imprime();
        ds.Item item11 = fPHeapMax9.max();
        ds.Item item12 = null;
        ds.Item[] itemArray13 = new ds.Item[] { item12 };
        fPHeapMax9.copia(itemArray13);
        ds.Item item15 = fPHeapMax9.max();
        ds.FPHeapMax fPHeapMax17 = new ds.FPHeapMax((int) (byte) 10);
        fPHeapMax17.imprime();
        ds.FPHeapMax fPHeapMax20 = new ds.FPHeapMax(100);
        ds.Item[] itemArray21 = new ds.Item[] {};
        fPHeapMax20.copia(itemArray21);
        fPHeapMax17.copia(itemArray21);
        ds.FPHeapMax fPHeapMax25 = new ds.FPHeapMax(100);
        ds.Item[] itemArray26 = new ds.Item[] {};
        fPHeapMax25.copia(itemArray26);
        ds.FPHeapMax fPHeapMax29 = new ds.FPHeapMax((int) (short) 10);
        fPHeapMax29.constroi();
        ds.Item item31 = fPHeapMax29.max();
        fPHeapMax29.constroi();
        ds.Item item33 = fPHeapMax29.max();
        fPHeapMax29.imprime();
        ds.Item[] itemArray35 = new ds.Item[] {};
        fPHeapMax29.copia(itemArray35);
        fPHeapMax29.constroi();
        ds.FPHeapMax fPHeapMax39 = new ds.FPHeapMax(100);
        ds.Item[] itemArray40 = new ds.Item[] {};
        fPHeapMax39.copia(itemArray40);
        fPHeapMax29.copia(itemArray40);
        fPHeapMax25.copia(itemArray40);
        fPHeapMax17.copia(itemArray40);
        fPHeapMax9.copia(itemArray40);
        fPHeapMax1.copia(itemArray40);
        ds.FPHeapMax fPHeapMax48 = new ds.FPHeapMax((int) (byte) 10);
        fPHeapMax48.imprime();
        ds.FPHeapMax fPHeapMax51 = new ds.FPHeapMax(100);
        ds.Item[] itemArray52 = new ds.Item[] {};
        fPHeapMax51.copia(itemArray52);
        fPHeapMax48.copia(itemArray52);
        ds.FPHeapMax fPHeapMax56 = new ds.FPHeapMax(100);
        ds.Item[] itemArray57 = new ds.Item[] {};
        fPHeapMax56.copia(itemArray57);
        ds.FPHeapMax fPHeapMax60 = new ds.FPHeapMax((int) (short) 10);
        fPHeapMax60.constroi();
        ds.Item item62 = fPHeapMax60.max();
        fPHeapMax60.constroi();
        ds.Item item64 = fPHeapMax60.max();
        fPHeapMax60.imprime();
        ds.Item[] itemArray66 = new ds.Item[] {};
        fPHeapMax60.copia(itemArray66);
        fPHeapMax60.constroi();
        ds.FPHeapMax fPHeapMax70 = new ds.FPHeapMax(100);
        ds.Item[] itemArray71 = new ds.Item[] {};
        fPHeapMax70.copia(itemArray71);
        fPHeapMax60.copia(itemArray71);
        fPHeapMax56.copia(itemArray71);
        fPHeapMax48.copia(itemArray71);
        ds.FPHeapMax fPHeapMax77 = new ds.FPHeapMax((int) (byte) 100);
        fPHeapMax77.imprime();
        ds.FPHeapMax fPHeapMax80 = new ds.FPHeapMax(1);
        ds.FPHeapMax fPHeapMax82 = new ds.FPHeapMax((int) (short) 10);
        fPHeapMax82.constroi();
        ds.Item item84 = fPHeapMax82.max();
        fPHeapMax82.constroi();
        ds.Item item86 = fPHeapMax82.max();
        fPHeapMax82.imprime();
        ds.Item[] itemArray88 = new ds.Item[] {};
        fPHeapMax82.copia(itemArray88);
        fPHeapMax80.copia(itemArray88);
        fPHeapMax77.copia(itemArray88);
        ds.FPHeapMax fPHeapMax93 = new ds.FPHeapMax(100);
        ds.Item[] itemArray94 = new ds.Item[] {};
        fPHeapMax93.copia(itemArray94);
        fPHeapMax77.copia(itemArray94);
        fPHeapMax48.copia(itemArray94);
        fPHeapMax1.copia(itemArray94);
        // The following exception was thrown during execution in test generation
        try {
            ds.Item item99 = fPHeapMax1.retiraMax();
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: heap vazio");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(item4);
        org.junit.Assert.assertNull(item6);
        org.junit.Assert.assertNull(item11);
        org.junit.Assert.assertNotNull(itemArray13);
        org.junit.Assert.assertNull(item15);
        org.junit.Assert.assertNotNull(itemArray21);
        org.junit.Assert.assertNotNull(itemArray26);
        org.junit.Assert.assertNull(item31);
        org.junit.Assert.assertNull(item33);
        org.junit.Assert.assertNotNull(itemArray35);
        org.junit.Assert.assertNotNull(itemArray40);
        org.junit.Assert.assertNotNull(itemArray52);
        org.junit.Assert.assertNotNull(itemArray57);
        org.junit.Assert.assertNull(item62);
        org.junit.Assert.assertNull(item64);
        org.junit.Assert.assertNotNull(itemArray66);
        org.junit.Assert.assertNotNull(itemArray71);
        org.junit.Assert.assertNull(item84);
        org.junit.Assert.assertNull(item86);
        org.junit.Assert.assertNotNull(itemArray88);
        org.junit.Assert.assertNotNull(itemArray94);
    }

    @Test
    public void test404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test404");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) '#');
        fPHeapMax1.imprime();
        fPHeapMax1.constroi();
        fPHeapMax1.constroi();
        fPHeapMax1.imprime();
        fPHeapMax1.constroi();
        fPHeapMax1.constroi();
        ds.FPHeapMax fPHeapMax9 = new ds.FPHeapMax((int) (short) 10);
        fPHeapMax9.constroi();
        ds.Item item11 = fPHeapMax9.max();
        fPHeapMax9.constroi();
        ds.Item item13 = fPHeapMax9.max();
        fPHeapMax9.imprime();
        fPHeapMax9.constroi();
        fPHeapMax9.constroi();
        ds.FPHeapMax fPHeapMax18 = new ds.FPHeapMax((int) (short) 10);
        fPHeapMax18.constroi();
        ds.Item item20 = fPHeapMax18.max();
        fPHeapMax18.imprime();
        fPHeapMax18.refaz(10, (int) (byte) 1);
        ds.FPHeapMax fPHeapMax26 = new ds.FPHeapMax(100);
        ds.Item[] itemArray27 = new ds.Item[] {};
        fPHeapMax26.copia(itemArray27);
        fPHeapMax18.copia(itemArray27);
        fPHeapMax9.copia(itemArray27);
        fPHeapMax1.copia(itemArray27);
        fPHeapMax1.imprime();
        fPHeapMax1.imprime();
        ds.Item item34 = fPHeapMax1.max();
        fPHeapMax1.constroi();
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMax1.refaz((int) '4', 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 52");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(item11);
        org.junit.Assert.assertNull(item13);
        org.junit.Assert.assertNull(item20);
        org.junit.Assert.assertNotNull(itemArray27);
        org.junit.Assert.assertNull(item34);
    }

    @Test
    public void test405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test405");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (byte) 100);
        ds.FPHeapMax fPHeapMax3 = new ds.FPHeapMax(1);
        ds.FPHeapMax fPHeapMax5 = new ds.FPHeapMax((int) (short) 10);
        fPHeapMax5.constroi();
        ds.Item item7 = fPHeapMax5.max();
        fPHeapMax5.constroi();
        ds.Item item9 = fPHeapMax5.max();
        fPHeapMax5.imprime();
        ds.Item[] itemArray11 = new ds.Item[] {};
        fPHeapMax5.copia(itemArray11);
        fPHeapMax3.copia(itemArray11);
        fPHeapMax1.copia(itemArray11);
        ds.Item item15 = fPHeapMax1.max();
        fPHeapMax1.imprime();
        fPHeapMax1.refaz((int) (short) 100, (int) (byte) 1);
        ds.FPHeapMax fPHeapMax21 = new ds.FPHeapMax((int) (short) 10);
        fPHeapMax21.constroi();
        ds.Item item23 = fPHeapMax21.max();
        fPHeapMax21.imprime();
        fPHeapMax21.refaz(10, (int) (byte) 1);
        ds.FPHeapMax fPHeapMax29 = new ds.FPHeapMax(100);
        ds.Item[] itemArray30 = new ds.Item[] {};
        fPHeapMax29.copia(itemArray30);
        fPHeapMax21.copia(itemArray30);
        fPHeapMax1.copia(itemArray30);
        java.lang.Class<?> wildcardClass34 = itemArray30.getClass();
        org.junit.Assert.assertNull(item7);
        org.junit.Assert.assertNull(item9);
        org.junit.Assert.assertNotNull(itemArray11);
        org.junit.Assert.assertNull(item15);
        org.junit.Assert.assertNull(item23);
        org.junit.Assert.assertNotNull(itemArray30);
        org.junit.Assert.assertNotNull(wildcardClass34);
    }

    @Test
    public void test406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test406");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) '#');
        fPHeapMax1.imprime();
        fPHeapMax1.constroi();
        fPHeapMax1.constroi();
        fPHeapMax1.imprime();
        fPHeapMax1.constroi();
        java.lang.Class<?> wildcardClass7 = fPHeapMax1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test407");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (short) 10);
        ds.Item item2 = fPHeapMax1.max();
        fPHeapMax1.imprime();
        ds.FPHeapMax fPHeapMax5 = new ds.FPHeapMax(100);
        ds.Item[] itemArray6 = new ds.Item[] {};
        fPHeapMax5.copia(itemArray6);
        fPHeapMax1.copia(itemArray6);
        ds.FPHeapMax fPHeapMax11 = new ds.FPHeapMax((int) (short) 10);
        fPHeapMax11.constroi();
        ds.Item item13 = fPHeapMax11.max();
        fPHeapMax11.constroi();
        ds.Item item15 = fPHeapMax11.max();
        fPHeapMax11.imprime();
        ds.FPHeapMax fPHeapMax18 = new ds.FPHeapMax((int) '#');
        fPHeapMax18.imprime();
        ds.Item item20 = fPHeapMax18.max();
        ds.Item item21 = null;
        ds.Item[] itemArray22 = new ds.Item[] { item21 };
        fPHeapMax18.copia(itemArray22);
        fPHeapMax11.copia(itemArray22);
        fPHeapMax11.constroi();
        ds.FPHeapMax fPHeapMax27 = new ds.FPHeapMax(100);
        ds.Item[] itemArray28 = new ds.Item[] {};
        fPHeapMax27.copia(itemArray28);
        fPHeapMax11.copia(itemArray28);
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMax1.aumentaChave(1, (java.lang.Object) itemArray28);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(item2);
        org.junit.Assert.assertNotNull(itemArray6);
        org.junit.Assert.assertNull(item13);
        org.junit.Assert.assertNull(item15);
        org.junit.Assert.assertNull(item20);
        org.junit.Assert.assertNotNull(itemArray22);
        org.junit.Assert.assertNotNull(itemArray28);
    }

    @Test
    public void test408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test408");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) '#');
        fPHeapMax1.imprime();
        ds.Item item3 = fPHeapMax1.max();
        ds.Item item4 = null;
        ds.Item[] itemArray5 = new ds.Item[] { item4 };
        fPHeapMax1.copia(itemArray5);
        ds.Item item7 = fPHeapMax1.max();
        fPHeapMax1.constroi();
        fPHeapMax1.imprime();
        // The following exception was thrown during execution in test generation
        try {
            ds.Item item10 = fPHeapMax1.retiraMax();
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: heap vazio");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(item3);
        org.junit.Assert.assertNotNull(itemArray5);
        org.junit.Assert.assertNull(item7);
    }

    @Test
    public void test409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test409");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (short) 10);
        fPHeapMax1.constroi();
        ds.Item item3 = fPHeapMax1.max();
        fPHeapMax1.constroi();
        ds.Item item5 = fPHeapMax1.max();
        fPHeapMax1.imprime();
        ds.Item[] itemArray7 = new ds.Item[] {};
        fPHeapMax1.copia(itemArray7);
        fPHeapMax1.refaz((int) (byte) 10, 0);
        ds.FPHeapMax fPHeapMax13 = new ds.FPHeapMax((int) (short) 0);
        ds.FPHeapMax fPHeapMax15 = new ds.FPHeapMax((int) '#');
        fPHeapMax15.imprime();
        ds.Item item17 = fPHeapMax15.max();
        ds.Item item18 = null;
        ds.Item[] itemArray19 = new ds.Item[] { item18 };
        fPHeapMax15.copia(itemArray19);
        fPHeapMax13.copia(itemArray19);
        fPHeapMax1.copia(itemArray19);
        ds.Item item23 = null;
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMax1.insere(item23);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(item3);
        org.junit.Assert.assertNull(item5);
        org.junit.Assert.assertNotNull(itemArray7);
        org.junit.Assert.assertNull(item17);
        org.junit.Assert.assertNotNull(itemArray19);
    }

    @Test
    public void test410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test410");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (short) 100);
        fPHeapMax1.constroi();
        fPHeapMax1.refaz((int) 'a', 0);
    }

    @Test
    public void test411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test411");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (short) 10);
        fPHeapMax1.refaz((int) (short) 1, 0);
        fPHeapMax1.constroi();
        ds.FPHeapMax fPHeapMax7 = new ds.FPHeapMax((int) (byte) 0);
        ds.FPHeapMax fPHeapMax9 = new ds.FPHeapMax((int) (short) 10);
        fPHeapMax9.constroi();
        ds.Item item11 = fPHeapMax9.max();
        fPHeapMax9.constroi();
        ds.Item item13 = fPHeapMax9.max();
        fPHeapMax9.imprime();
        ds.Item[] itemArray15 = new ds.Item[] {};
        fPHeapMax9.copia(itemArray15);
        fPHeapMax9.constroi();
        ds.Item item18 = fPHeapMax9.max();
        ds.Item[] itemArray19 = new ds.Item[] {};
        fPHeapMax9.copia(itemArray19);
        fPHeapMax7.copia(itemArray19);
        fPHeapMax1.copia(itemArray19);
        ds.Item item23 = fPHeapMax1.max();
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMax1.refaz((int) (byte) 100, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 100");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(item11);
        org.junit.Assert.assertNull(item13);
        org.junit.Assert.assertNotNull(itemArray15);
        org.junit.Assert.assertNull(item18);
        org.junit.Assert.assertNotNull(itemArray19);
        org.junit.Assert.assertNull(item23);
    }

    @Test
    public void test412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test412");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) '#');
        fPHeapMax1.imprime();
        fPHeapMax1.constroi();
        fPHeapMax1.constroi();
        fPHeapMax1.imprime();
        ds.FPHeapMax fPHeapMax7 = new ds.FPHeapMax((int) (byte) 100);
        ds.FPHeapMax fPHeapMax9 = new ds.FPHeapMax(1);
        ds.FPHeapMax fPHeapMax11 = new ds.FPHeapMax((int) (short) 10);
        fPHeapMax11.constroi();
        ds.Item item13 = fPHeapMax11.max();
        fPHeapMax11.constroi();
        ds.Item item15 = fPHeapMax11.max();
        fPHeapMax11.imprime();
        ds.Item[] itemArray17 = new ds.Item[] {};
        fPHeapMax11.copia(itemArray17);
        fPHeapMax9.copia(itemArray17);
        fPHeapMax7.copia(itemArray17);
        fPHeapMax1.copia(itemArray17);
        fPHeapMax1.constroi();
        ds.Item item23 = fPHeapMax1.max();
        ds.Item item24 = null;
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMax1.insere(item24);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(item13);
        org.junit.Assert.assertNull(item15);
        org.junit.Assert.assertNotNull(itemArray17);
        org.junit.Assert.assertNull(item23);
    }

    @Test
    public void test413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test413");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) '4');
        fPHeapMax1.refaz((int) '4', (int) '#');
        ds.FPHeapMax fPHeapMax6 = new ds.FPHeapMax((int) '#');
        fPHeapMax6.imprime();
        fPHeapMax6.constroi();
        fPHeapMax6.constroi();
        fPHeapMax6.imprime();
        fPHeapMax6.constroi();
        fPHeapMax6.constroi();
        ds.Item item13 = fPHeapMax6.max();
        ds.FPHeapMax fPHeapMax15 = new ds.FPHeapMax((int) (short) 10);
        fPHeapMax15.constroi();
        ds.Item item17 = fPHeapMax15.max();
        fPHeapMax15.constroi();
        ds.Item item19 = fPHeapMax15.max();
        ds.FPHeapMax fPHeapMax21 = new ds.FPHeapMax((int) (short) 10);
        fPHeapMax21.constroi();
        ds.FPHeapMax fPHeapMax24 = new ds.FPHeapMax((int) (short) 10);
        fPHeapMax24.constroi();
        ds.Item item26 = fPHeapMax24.max();
        fPHeapMax24.constroi();
        ds.Item item28 = fPHeapMax24.max();
        fPHeapMax24.imprime();
        ds.Item[] itemArray30 = new ds.Item[] {};
        fPHeapMax24.copia(itemArray30);
        fPHeapMax21.copia(itemArray30);
        fPHeapMax15.copia(itemArray30);
        fPHeapMax6.copia(itemArray30);
        fPHeapMax1.copia(itemArray30);
        java.lang.Class<?> wildcardClass36 = fPHeapMax1.getClass();
        org.junit.Assert.assertNull(item13);
        org.junit.Assert.assertNull(item17);
        org.junit.Assert.assertNull(item19);
        org.junit.Assert.assertNull(item26);
        org.junit.Assert.assertNull(item28);
        org.junit.Assert.assertNotNull(itemArray30);
        org.junit.Assert.assertNotNull(wildcardClass36);
    }

    @Test
    public void test414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test414");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax(10);
        ds.Item item2 = fPHeapMax1.max();
        ds.FPHeapMax fPHeapMax4 = new ds.FPHeapMax((int) (short) 1);
        ds.FPHeapMax fPHeapMax6 = new ds.FPHeapMax((int) (short) 0);
        ds.FPHeapMax fPHeapMax8 = new ds.FPHeapMax((int) '#');
        fPHeapMax8.imprime();
        ds.Item item10 = fPHeapMax8.max();
        ds.Item item11 = null;
        ds.Item[] itemArray12 = new ds.Item[] { item11 };
        fPHeapMax8.copia(itemArray12);
        fPHeapMax6.copia(itemArray12);
        fPHeapMax6.constroi();
        fPHeapMax6.constroi();
        ds.FPHeapMax fPHeapMax18 = new ds.FPHeapMax((int) (short) 10);
        fPHeapMax18.constroi();
        ds.Item item20 = fPHeapMax18.max();
        fPHeapMax18.constroi();
        ds.Item item22 = fPHeapMax18.max();
        fPHeapMax18.imprime();
        ds.FPHeapMax fPHeapMax25 = new ds.FPHeapMax((int) '#');
        fPHeapMax25.imprime();
        ds.Item item27 = fPHeapMax25.max();
        ds.Item item28 = null;
        ds.Item[] itemArray29 = new ds.Item[] { item28 };
        fPHeapMax25.copia(itemArray29);
        fPHeapMax18.copia(itemArray29);
        fPHeapMax6.copia(itemArray29);
        fPHeapMax4.copia(itemArray29);
        fPHeapMax1.copia(itemArray29);
        java.lang.Class<?> wildcardClass35 = fPHeapMax1.getClass();
        org.junit.Assert.assertNull(item2);
        org.junit.Assert.assertNull(item10);
        org.junit.Assert.assertNotNull(itemArray12);
        org.junit.Assert.assertNull(item20);
        org.junit.Assert.assertNull(item22);
        org.junit.Assert.assertNull(item27);
        org.junit.Assert.assertNotNull(itemArray29);
        org.junit.Assert.assertNotNull(wildcardClass35);
    }

    @Test
    public void test415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test415");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (short) 10);
        fPHeapMax1.constroi();
        ds.FPHeapMax fPHeapMax4 = new ds.FPHeapMax((int) (short) 10);
        fPHeapMax4.constroi();
        ds.Item item6 = fPHeapMax4.max();
        fPHeapMax4.constroi();
        ds.Item item8 = fPHeapMax4.max();
        fPHeapMax4.imprime();
        ds.Item[] itemArray10 = new ds.Item[] {};
        fPHeapMax4.copia(itemArray10);
        fPHeapMax1.copia(itemArray10);
        ds.Item item13 = fPHeapMax1.max();
        ds.FPHeapMax fPHeapMax16 = new ds.FPHeapMax((int) (short) 10);
        fPHeapMax16.constroi();
        ds.Item item18 = fPHeapMax16.max();
        fPHeapMax16.constroi();
        ds.Item item20 = fPHeapMax16.max();
        fPHeapMax16.imprime();
        ds.Item[] itemArray22 = new ds.Item[] {};
        fPHeapMax16.copia(itemArray22);
        fPHeapMax16.constroi();
        ds.FPHeapMax fPHeapMax26 = new ds.FPHeapMax(100);
        ds.Item[] itemArray27 = new ds.Item[] {};
        fPHeapMax26.copia(itemArray27);
        fPHeapMax16.copia(itemArray27);
        ds.FPHeapMax fPHeapMax31 = new ds.FPHeapMax((int) (byte) 10);
        fPHeapMax31.imprime();
        ds.FPHeapMax fPHeapMax34 = new ds.FPHeapMax(100);
        ds.Item[] itemArray35 = new ds.Item[] {};
        fPHeapMax34.copia(itemArray35);
        fPHeapMax31.copia(itemArray35);
        ds.FPHeapMax fPHeapMax39 = new ds.FPHeapMax(100);
        ds.Item[] itemArray40 = new ds.Item[] {};
        fPHeapMax39.copia(itemArray40);
        ds.FPHeapMax fPHeapMax43 = new ds.FPHeapMax((int) (short) 10);
        fPHeapMax43.constroi();
        ds.Item item45 = fPHeapMax43.max();
        fPHeapMax43.constroi();
        ds.Item item47 = fPHeapMax43.max();
        fPHeapMax43.imprime();
        ds.Item[] itemArray49 = new ds.Item[] {};
        fPHeapMax43.copia(itemArray49);
        fPHeapMax43.constroi();
        ds.FPHeapMax fPHeapMax53 = new ds.FPHeapMax(100);
        ds.Item[] itemArray54 = new ds.Item[] {};
        fPHeapMax53.copia(itemArray54);
        fPHeapMax43.copia(itemArray54);
        fPHeapMax39.copia(itemArray54);
        fPHeapMax31.copia(itemArray54);
        fPHeapMax16.copia(itemArray54);
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMax1.aumentaChave((int) 'a', (java.lang.Object) fPHeapMax16);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 97");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(item6);
        org.junit.Assert.assertNull(item8);
        org.junit.Assert.assertNotNull(itemArray10);
        org.junit.Assert.assertNull(item13);
        org.junit.Assert.assertNull(item18);
        org.junit.Assert.assertNull(item20);
        org.junit.Assert.assertNotNull(itemArray22);
        org.junit.Assert.assertNotNull(itemArray27);
        org.junit.Assert.assertNotNull(itemArray35);
        org.junit.Assert.assertNotNull(itemArray40);
        org.junit.Assert.assertNull(item45);
        org.junit.Assert.assertNull(item47);
        org.junit.Assert.assertNotNull(itemArray49);
        org.junit.Assert.assertNotNull(itemArray54);
    }

    @Test
    public void test416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test416");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (byte) 100);
        ds.FPHeapMax fPHeapMax3 = new ds.FPHeapMax(1);
        ds.FPHeapMax fPHeapMax5 = new ds.FPHeapMax((int) (short) 10);
        fPHeapMax5.constroi();
        ds.Item item7 = fPHeapMax5.max();
        fPHeapMax5.constroi();
        ds.Item item9 = fPHeapMax5.max();
        fPHeapMax5.imprime();
        ds.Item[] itemArray11 = new ds.Item[] {};
        fPHeapMax5.copia(itemArray11);
        fPHeapMax3.copia(itemArray11);
        fPHeapMax1.copia(itemArray11);
        ds.FPHeapMax fPHeapMax16 = new ds.FPHeapMax((int) '#');
        fPHeapMax16.imprime();
        fPHeapMax16.constroi();
        fPHeapMax16.constroi();
        fPHeapMax16.imprime();
        ds.FPHeapMax fPHeapMax22 = new ds.FPHeapMax((int) (byte) 100);
        ds.FPHeapMax fPHeapMax24 = new ds.FPHeapMax(1);
        ds.FPHeapMax fPHeapMax26 = new ds.FPHeapMax((int) (short) 10);
        fPHeapMax26.constroi();
        ds.Item item28 = fPHeapMax26.max();
        fPHeapMax26.constroi();
        ds.Item item30 = fPHeapMax26.max();
        fPHeapMax26.imprime();
        ds.Item[] itemArray32 = new ds.Item[] {};
        fPHeapMax26.copia(itemArray32);
        fPHeapMax24.copia(itemArray32);
        fPHeapMax22.copia(itemArray32);
        fPHeapMax16.copia(itemArray32);
        fPHeapMax1.copia(itemArray32);
        ds.Item item38 = fPHeapMax1.max();
        ds.Item item39 = fPHeapMax1.max();
        ds.Item[] itemArray40 = new ds.Item[] {};
        fPHeapMax1.copia(itemArray40);
        org.junit.Assert.assertNull(item7);
        org.junit.Assert.assertNull(item9);
        org.junit.Assert.assertNotNull(itemArray11);
        org.junit.Assert.assertNull(item28);
        org.junit.Assert.assertNull(item30);
        org.junit.Assert.assertNotNull(itemArray32);
        org.junit.Assert.assertNull(item38);
        org.junit.Assert.assertNull(item39);
        org.junit.Assert.assertNotNull(itemArray40);
    }

    @Test
    public void test417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test417");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax(10);
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
    public void test418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test418");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (short) 10);
        ds.Item item2 = fPHeapMax1.max();
        fPHeapMax1.constroi();
        fPHeapMax1.constroi();
        ds.Item item5 = fPHeapMax1.max();
        org.junit.Assert.assertNull(item2);
        org.junit.Assert.assertNull(item5);
    }

    @Test
    public void test419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test419");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (short) 10);
        fPHeapMax1.constroi();
        ds.Item item3 = fPHeapMax1.max();
        fPHeapMax1.constroi();
        fPHeapMax1.refaz((int) (byte) 10, 0);
        fPHeapMax1.constroi();
        ds.Item item9 = null;
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMax1.insere(item9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(item3);
    }

    @Test
    public void test420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test420");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (short) 10);
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
    public void test421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test421");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) '#');
        fPHeapMax1.imprime();
        fPHeapMax1.constroi();
        fPHeapMax1.constroi();
        fPHeapMax1.imprime();
        fPHeapMax1.constroi();
        fPHeapMax1.constroi();
        ds.FPHeapMax fPHeapMax9 = new ds.FPHeapMax((int) (short) 10);
        fPHeapMax9.constroi();
        ds.Item item11 = fPHeapMax9.max();
        fPHeapMax9.constroi();
        ds.Item item13 = fPHeapMax9.max();
        fPHeapMax9.imprime();
        fPHeapMax9.constroi();
        fPHeapMax9.constroi();
        ds.FPHeapMax fPHeapMax18 = new ds.FPHeapMax((int) (short) 10);
        fPHeapMax18.constroi();
        ds.Item item20 = fPHeapMax18.max();
        fPHeapMax18.imprime();
        fPHeapMax18.refaz(10, (int) (byte) 1);
        ds.FPHeapMax fPHeapMax26 = new ds.FPHeapMax(100);
        ds.Item[] itemArray27 = new ds.Item[] {};
        fPHeapMax26.copia(itemArray27);
        fPHeapMax18.copia(itemArray27);
        fPHeapMax9.copia(itemArray27);
        fPHeapMax1.copia(itemArray27);
        fPHeapMax1.imprime();
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMax1.refaz((int) (short) 100, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 100");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(item11);
        org.junit.Assert.assertNull(item13);
        org.junit.Assert.assertNull(item20);
        org.junit.Assert.assertNotNull(itemArray27);
    }

    @Test
    public void test422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test422");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (short) 10);
        fPHeapMax1.constroi();
        ds.Item item3 = fPHeapMax1.max();
        fPHeapMax1.constroi();
        fPHeapMax1.constroi();
        ds.FPHeapMax fPHeapMax7 = new ds.FPHeapMax((int) (short) 10);
        fPHeapMax7.constroi();
        ds.Item item9 = fPHeapMax7.max();
        fPHeapMax7.imprime();
        fPHeapMax7.refaz(10, (int) (byte) 1);
        ds.FPHeapMax fPHeapMax15 = new ds.FPHeapMax(100);
        ds.Item[] itemArray16 = new ds.Item[] {};
        fPHeapMax15.copia(itemArray16);
        fPHeapMax7.copia(itemArray16);
        fPHeapMax1.copia(itemArray16);
        ds.Item item20 = fPHeapMax1.max();
        ds.Item item21 = fPHeapMax1.max();
        fPHeapMax1.imprime();
        // The following exception was thrown during execution in test generation
        try {
            ds.Item item23 = fPHeapMax1.retiraMax();
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: heap vazio");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(item3);
        org.junit.Assert.assertNull(item9);
        org.junit.Assert.assertNotNull(itemArray16);
        org.junit.Assert.assertNull(item20);
        org.junit.Assert.assertNull(item21);
    }

    @Test
    public void test423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test423");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (short) 10);
        fPHeapMax1.constroi();
        ds.Item item3 = fPHeapMax1.max();
        fPHeapMax1.imprime();
        fPHeapMax1.refaz(10, (int) (byte) 1);
        fPHeapMax1.imprime();
        fPHeapMax1.constroi();
        ds.Item item10 = fPHeapMax1.max();
        org.junit.Assert.assertNull(item3);
        org.junit.Assert.assertNull(item10);
    }

    @Test
    public void test424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test424");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax(100);
        ds.Item[] itemArray2 = new ds.Item[] {};
        fPHeapMax1.copia(itemArray2);
        fPHeapMax1.imprime();
        fPHeapMax1.refaz((int) (byte) 100, (int) '#');
        ds.FPHeapMax fPHeapMax9 = new ds.FPHeapMax((int) (short) 10);
        fPHeapMax9.constroi();
        ds.Item item11 = fPHeapMax9.max();
        fPHeapMax9.constroi();
        ds.Item item13 = fPHeapMax9.max();
        ds.FPHeapMax fPHeapMax15 = new ds.FPHeapMax((int) '#');
        fPHeapMax15.imprime();
        ds.Item item17 = fPHeapMax15.max();
        ds.Item item18 = null;
        ds.Item[] itemArray19 = new ds.Item[] { item18 };
        fPHeapMax15.copia(itemArray19);
        fPHeapMax9.copia(itemArray19);
        ds.FPHeapMax fPHeapMax23 = new ds.FPHeapMax((int) (byte) 100);
        fPHeapMax23.imprime();
        ds.FPHeapMax fPHeapMax26 = new ds.FPHeapMax(1);
        ds.FPHeapMax fPHeapMax28 = new ds.FPHeapMax((int) (short) 10);
        fPHeapMax28.constroi();
        ds.Item item30 = fPHeapMax28.max();
        fPHeapMax28.constroi();
        ds.Item item32 = fPHeapMax28.max();
        fPHeapMax28.imprime();
        ds.Item[] itemArray34 = new ds.Item[] {};
        fPHeapMax28.copia(itemArray34);
        fPHeapMax26.copia(itemArray34);
        fPHeapMax23.copia(itemArray34);
        ds.FPHeapMax fPHeapMax39 = new ds.FPHeapMax(100);
        ds.Item[] itemArray40 = new ds.Item[] {};
        fPHeapMax39.copia(itemArray40);
        fPHeapMax23.copia(itemArray40);
        fPHeapMax9.copia(itemArray40);
        fPHeapMax1.copia(itemArray40);
        ds.FPHeapMax fPHeapMax46 = new ds.FPHeapMax(10);
        ds.FPHeapMax fPHeapMax48 = new ds.FPHeapMax(1);
        ds.FPHeapMax fPHeapMax50 = new ds.FPHeapMax((int) (short) 10);
        fPHeapMax50.constroi();
        ds.Item item52 = fPHeapMax50.max();
        fPHeapMax50.constroi();
        ds.Item item54 = fPHeapMax50.max();
        fPHeapMax50.imprime();
        ds.Item[] itemArray56 = new ds.Item[] {};
        fPHeapMax50.copia(itemArray56);
        fPHeapMax48.copia(itemArray56);
        fPHeapMax46.copia(itemArray56);
        fPHeapMax1.copia(itemArray56);
        org.junit.Assert.assertNotNull(itemArray2);
        org.junit.Assert.assertNull(item11);
        org.junit.Assert.assertNull(item13);
        org.junit.Assert.assertNull(item17);
        org.junit.Assert.assertNotNull(itemArray19);
        org.junit.Assert.assertNull(item30);
        org.junit.Assert.assertNull(item32);
        org.junit.Assert.assertNotNull(itemArray34);
        org.junit.Assert.assertNotNull(itemArray40);
        org.junit.Assert.assertNull(item52);
        org.junit.Assert.assertNull(item54);
        org.junit.Assert.assertNotNull(itemArray56);
    }

    @Test
    public void test425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test425");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (short) 10);
        fPHeapMax1.constroi();
        ds.Item item3 = fPHeapMax1.max();
        fPHeapMax1.constroi();
        ds.Item item5 = fPHeapMax1.max();
        ds.FPHeapMax fPHeapMax7 = new ds.FPHeapMax((int) (short) 10);
        fPHeapMax7.constroi();
        ds.FPHeapMax fPHeapMax10 = new ds.FPHeapMax((int) (short) 10);
        fPHeapMax10.constroi();
        ds.Item item12 = fPHeapMax10.max();
        fPHeapMax10.constroi();
        ds.Item item14 = fPHeapMax10.max();
        fPHeapMax10.imprime();
        ds.Item[] itemArray16 = new ds.Item[] {};
        fPHeapMax10.copia(itemArray16);
        fPHeapMax7.copia(itemArray16);
        fPHeapMax1.copia(itemArray16);
        ds.Item item20 = fPHeapMax1.max();
        fPHeapMax1.constroi();
        ds.Item[] itemArray22 = null;
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMax1.copia(itemArray22);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(item3);
        org.junit.Assert.assertNull(item5);
        org.junit.Assert.assertNull(item12);
        org.junit.Assert.assertNull(item14);
        org.junit.Assert.assertNotNull(itemArray16);
        org.junit.Assert.assertNull(item20);
    }

    @Test
    public void test426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test426");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (byte) 0);
        ds.FPHeapMax fPHeapMax3 = new ds.FPHeapMax((int) (short) 10);
        fPHeapMax3.constroi();
        ds.Item item5 = fPHeapMax3.max();
        fPHeapMax3.constroi();
        ds.Item item7 = fPHeapMax3.max();
        fPHeapMax3.imprime();
        ds.Item[] itemArray9 = new ds.Item[] {};
        fPHeapMax3.copia(itemArray9);
        fPHeapMax3.constroi();
        ds.Item item12 = fPHeapMax3.max();
        ds.Item[] itemArray13 = new ds.Item[] {};
        fPHeapMax3.copia(itemArray13);
        fPHeapMax1.copia(itemArray13);
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMax1.refaz(0, (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(item5);
        org.junit.Assert.assertNull(item7);
        org.junit.Assert.assertNotNull(itemArray9);
        org.junit.Assert.assertNull(item12);
        org.junit.Assert.assertNotNull(itemArray13);
    }

    @Test
    public void test427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test427");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (short) 10);
        fPHeapMax1.constroi();
        ds.Item item3 = fPHeapMax1.max();
        fPHeapMax1.constroi();
        ds.Item item5 = fPHeapMax1.max();
        fPHeapMax1.imprime();
        ds.Item[] itemArray7 = new ds.Item[] {};
        fPHeapMax1.copia(itemArray7);
        fPHeapMax1.constroi();
        ds.FPHeapMax fPHeapMax11 = new ds.FPHeapMax(100);
        ds.Item[] itemArray12 = new ds.Item[] {};
        fPHeapMax11.copia(itemArray12);
        fPHeapMax1.copia(itemArray12);
        fPHeapMax1.imprime();
        ds.Item item16 = fPHeapMax1.max();
        fPHeapMax1.constroi();
        org.junit.Assert.assertNull(item3);
        org.junit.Assert.assertNull(item5);
        org.junit.Assert.assertNotNull(itemArray7);
        org.junit.Assert.assertNotNull(itemArray12);
        org.junit.Assert.assertNull(item16);
    }

    @Test
    public void test428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test428");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (short) 10);
        fPHeapMax1.constroi();
        ds.Item item3 = fPHeapMax1.max();
        fPHeapMax1.constroi();
        ds.Item item5 = fPHeapMax1.max();
        fPHeapMax1.imprime();
        ds.Item item7 = fPHeapMax1.max();
        ds.FPHeapMax fPHeapMax9 = new ds.FPHeapMax((int) (short) 1);
        ds.FPHeapMax fPHeapMax11 = new ds.FPHeapMax((int) (short) 0);
        ds.FPHeapMax fPHeapMax13 = new ds.FPHeapMax((int) '#');
        fPHeapMax13.imprime();
        ds.Item item15 = fPHeapMax13.max();
        ds.Item item16 = null;
        ds.Item[] itemArray17 = new ds.Item[] { item16 };
        fPHeapMax13.copia(itemArray17);
        fPHeapMax11.copia(itemArray17);
        fPHeapMax11.constroi();
        fPHeapMax11.constroi();
        ds.FPHeapMax fPHeapMax23 = new ds.FPHeapMax((int) (short) 10);
        fPHeapMax23.constroi();
        ds.Item item25 = fPHeapMax23.max();
        fPHeapMax23.constroi();
        ds.Item item27 = fPHeapMax23.max();
        fPHeapMax23.imprime();
        ds.FPHeapMax fPHeapMax30 = new ds.FPHeapMax((int) '#');
        fPHeapMax30.imprime();
        ds.Item item32 = fPHeapMax30.max();
        ds.Item item33 = null;
        ds.Item[] itemArray34 = new ds.Item[] { item33 };
        fPHeapMax30.copia(itemArray34);
        fPHeapMax23.copia(itemArray34);
        fPHeapMax11.copia(itemArray34);
        fPHeapMax9.copia(itemArray34);
        fPHeapMax1.copia(itemArray34);
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMax1.refaz((int) (byte) -1, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(item3);
        org.junit.Assert.assertNull(item5);
        org.junit.Assert.assertNull(item7);
        org.junit.Assert.assertNull(item15);
        org.junit.Assert.assertNotNull(itemArray17);
        org.junit.Assert.assertNull(item25);
        org.junit.Assert.assertNull(item27);
        org.junit.Assert.assertNull(item32);
        org.junit.Assert.assertNotNull(itemArray34);
    }

    @Test
    public void test429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test429");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) '#');
        fPHeapMax1.imprime();
        fPHeapMax1.constroi();
        fPHeapMax1.constroi();
        fPHeapMax1.imprime();
        fPHeapMax1.refaz((int) (byte) 1, 1);
        ds.FPHeapMax fPHeapMax10 = new ds.FPHeapMax((int) (short) 10);
        fPHeapMax10.constroi();
        ds.Item item12 = fPHeapMax10.max();
        fPHeapMax10.constroi();
        ds.Item item14 = fPHeapMax10.max();
        ds.FPHeapMax fPHeapMax16 = new ds.FPHeapMax((int) '#');
        fPHeapMax16.imprime();
        ds.Item item18 = fPHeapMax16.max();
        ds.Item item19 = null;
        ds.Item[] itemArray20 = new ds.Item[] { item19 };
        fPHeapMax16.copia(itemArray20);
        fPHeapMax10.copia(itemArray20);
        fPHeapMax1.copia(itemArray20);
        ds.Item item24 = fPHeapMax1.max();
        ds.Item item25 = fPHeapMax1.max();
        fPHeapMax1.constroi();
        org.junit.Assert.assertNull(item12);
        org.junit.Assert.assertNull(item14);
        org.junit.Assert.assertNull(item18);
        org.junit.Assert.assertNotNull(itemArray20);
        org.junit.Assert.assertNull(item24);
        org.junit.Assert.assertNull(item25);
    }

    @Test
    public void test430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test430");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) 'a');
        fPHeapMax1.imprime();
        fPHeapMax1.constroi();
        ds.FPHeapMax fPHeapMax5 = new ds.FPHeapMax((int) (short) 10);
        fPHeapMax5.constroi();
        ds.Item item7 = fPHeapMax5.max();
        fPHeapMax5.constroi();
        fPHeapMax5.imprime();
        ds.FPHeapMax fPHeapMax11 = new ds.FPHeapMax((int) '#');
        fPHeapMax11.imprime();
        ds.Item item13 = fPHeapMax11.max();
        ds.Item item14 = null;
        ds.Item[] itemArray15 = new ds.Item[] { item14 };
        fPHeapMax11.copia(itemArray15);
        fPHeapMax5.copia(itemArray15);
        ds.FPHeapMax fPHeapMax19 = new ds.FPHeapMax((int) (short) 10);
        fPHeapMax19.constroi();
        ds.Item item21 = fPHeapMax19.max();
        fPHeapMax19.constroi();
        fPHeapMax19.imprime();
        ds.FPHeapMax fPHeapMax25 = new ds.FPHeapMax((int) '#');
        fPHeapMax25.imprime();
        ds.Item item27 = fPHeapMax25.max();
        ds.Item item28 = null;
        ds.Item[] itemArray29 = new ds.Item[] { item28 };
        fPHeapMax25.copia(itemArray29);
        fPHeapMax19.copia(itemArray29);
        fPHeapMax5.copia(itemArray29);
        fPHeapMax1.copia(itemArray29);
        ds.FPHeapMax fPHeapMax36 = new ds.FPHeapMax((int) (byte) 100);
        fPHeapMax36.imprime();
        fPHeapMax36.imprime();
        ds.Item item39 = fPHeapMax36.max();
        fPHeapMax36.constroi();
        ds.Item item41 = fPHeapMax36.max();
        fPHeapMax36.imprime();
        fPHeapMax36.imprime();
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMax1.aumentaChave(1, (java.lang.Object) fPHeapMax36);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(item7);
        org.junit.Assert.assertNull(item13);
        org.junit.Assert.assertNotNull(itemArray15);
        org.junit.Assert.assertNull(item21);
        org.junit.Assert.assertNull(item27);
        org.junit.Assert.assertNotNull(itemArray29);
        org.junit.Assert.assertNull(item39);
        org.junit.Assert.assertNull(item41);
    }

    @Test
    public void test431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test431");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (short) 10);
        fPHeapMax1.constroi();
        ds.FPHeapMax fPHeapMax4 = new ds.FPHeapMax((int) (short) 10);
        fPHeapMax4.constroi();
        ds.Item item6 = fPHeapMax4.max();
        fPHeapMax4.constroi();
        ds.Item item8 = fPHeapMax4.max();
        fPHeapMax4.imprime();
        ds.Item[] itemArray10 = new ds.Item[] {};
        fPHeapMax4.copia(itemArray10);
        fPHeapMax1.copia(itemArray10);
        ds.Item item13 = fPHeapMax1.max();
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMax1.refaz((int) (short) -1, (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(item6);
        org.junit.Assert.assertNull(item8);
        org.junit.Assert.assertNotNull(itemArray10);
        org.junit.Assert.assertNull(item13);
    }

    @Test
    public void test432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test432");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (short) 10);
        fPHeapMax1.constroi();
        ds.Item item3 = fPHeapMax1.max();
        fPHeapMax1.constroi();
        fPHeapMax1.imprime();
        fPHeapMax1.constroi();
        ds.FPHeapMax fPHeapMax8 = new ds.FPHeapMax(10);
        ds.FPHeapMax fPHeapMax10 = new ds.FPHeapMax((int) '#');
        fPHeapMax10.imprime();
        ds.Item item12 = fPHeapMax10.max();
        ds.Item item13 = null;
        ds.Item[] itemArray14 = new ds.Item[] { item13 };
        fPHeapMax10.copia(itemArray14);
        ds.Item item16 = fPHeapMax10.max();
        ds.FPHeapMax fPHeapMax18 = new ds.FPHeapMax((int) (byte) 10);
        fPHeapMax18.imprime();
        ds.FPHeapMax fPHeapMax21 = new ds.FPHeapMax(100);
        ds.Item[] itemArray22 = new ds.Item[] {};
        fPHeapMax21.copia(itemArray22);
        fPHeapMax18.copia(itemArray22);
        ds.FPHeapMax fPHeapMax26 = new ds.FPHeapMax(100);
        ds.Item[] itemArray27 = new ds.Item[] {};
        fPHeapMax26.copia(itemArray27);
        ds.FPHeapMax fPHeapMax30 = new ds.FPHeapMax((int) (short) 10);
        fPHeapMax30.constroi();
        ds.Item item32 = fPHeapMax30.max();
        fPHeapMax30.constroi();
        ds.Item item34 = fPHeapMax30.max();
        fPHeapMax30.imprime();
        ds.Item[] itemArray36 = new ds.Item[] {};
        fPHeapMax30.copia(itemArray36);
        fPHeapMax30.constroi();
        ds.FPHeapMax fPHeapMax40 = new ds.FPHeapMax(100);
        ds.Item[] itemArray41 = new ds.Item[] {};
        fPHeapMax40.copia(itemArray41);
        fPHeapMax30.copia(itemArray41);
        fPHeapMax26.copia(itemArray41);
        fPHeapMax18.copia(itemArray41);
        fPHeapMax10.copia(itemArray41);
        fPHeapMax8.copia(itemArray41);
        fPHeapMax1.copia(itemArray41);
        org.junit.Assert.assertNull(item3);
        org.junit.Assert.assertNull(item12);
        org.junit.Assert.assertNotNull(itemArray14);
        org.junit.Assert.assertNull(item16);
        org.junit.Assert.assertNotNull(itemArray22);
        org.junit.Assert.assertNotNull(itemArray27);
        org.junit.Assert.assertNull(item32);
        org.junit.Assert.assertNull(item34);
        org.junit.Assert.assertNotNull(itemArray36);
        org.junit.Assert.assertNotNull(itemArray41);
    }

    @Test
    public void test433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test433");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (short) 10);
        fPHeapMax1.constroi();
        ds.Item item3 = fPHeapMax1.max();
        fPHeapMax1.constroi();
        fPHeapMax1.constroi();
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMax1.refaz((int) (short) 100, (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 100");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(item3);
    }

    @Test
    public void test434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test434");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) '#');
        fPHeapMax1.imprime();
        ds.Item item3 = fPHeapMax1.max();
        java.lang.Class<?> wildcardClass4 = fPHeapMax1.getClass();
        org.junit.Assert.assertNull(item3);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test435");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) 'a');
        ds.Item item2 = fPHeapMax1.max();
        org.junit.Assert.assertNull(item2);
    }

    @Test
    public void test436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test436");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (short) 10);
        fPHeapMax1.constroi();
        ds.Item item3 = fPHeapMax1.max();
        fPHeapMax1.constroi();
        ds.Item item5 = fPHeapMax1.max();
        fPHeapMax1.imprime();
        fPHeapMax1.constroi();
        ds.FPHeapMax fPHeapMax9 = new ds.FPHeapMax((int) '#');
        fPHeapMax9.imprime();
        ds.Item item11 = fPHeapMax9.max();
        ds.Item item12 = null;
        ds.Item[] itemArray13 = new ds.Item[] { item12 };
        fPHeapMax9.copia(itemArray13);
        fPHeapMax1.copia(itemArray13);
        fPHeapMax1.refaz((int) (byte) 10, (int) (short) 1);
        ds.Item item19 = null;
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMax1.insere(item19);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(item3);
        org.junit.Assert.assertNull(item5);
        org.junit.Assert.assertNull(item11);
        org.junit.Assert.assertNotNull(itemArray13);
    }

    @Test
    public void test437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test437");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (short) 10);
        fPHeapMax1.constroi();
        ds.Item item3 = fPHeapMax1.max();
        fPHeapMax1.constroi();
        ds.Item item5 = fPHeapMax1.max();
        fPHeapMax1.imprime();
        ds.Item[] itemArray7 = new ds.Item[] {};
        fPHeapMax1.copia(itemArray7);
        fPHeapMax1.refaz((int) (byte) 10, 0);
        ds.FPHeapMax fPHeapMax13 = new ds.FPHeapMax((int) (short) 0);
        ds.FPHeapMax fPHeapMax15 = new ds.FPHeapMax((int) '#');
        fPHeapMax15.imprime();
        ds.Item item17 = fPHeapMax15.max();
        ds.Item item18 = null;
        ds.Item[] itemArray19 = new ds.Item[] { item18 };
        fPHeapMax15.copia(itemArray19);
        fPHeapMax13.copia(itemArray19);
        fPHeapMax1.copia(itemArray19);
        // The following exception was thrown during execution in test generation
        try {
            ds.Item item23 = fPHeapMax1.retiraMax();
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: heap vazio");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(item3);
        org.junit.Assert.assertNull(item5);
        org.junit.Assert.assertNotNull(itemArray7);
        org.junit.Assert.assertNull(item17);
        org.junit.Assert.assertNotNull(itemArray19);
    }

    @Test
    public void test438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test438");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (byte) 1);
        ds.Item item2 = null;
        ds.Item[] itemArray3 = new ds.Item[] { item2 };
        fPHeapMax1.copia(itemArray3);
        ds.FPHeapMax fPHeapMax7 = new ds.FPHeapMax((int) (short) 10);
        fPHeapMax7.constroi();
        ds.Item item9 = fPHeapMax7.max();
        fPHeapMax7.constroi();
        fPHeapMax7.constroi();
        ds.FPHeapMax fPHeapMax13 = new ds.FPHeapMax((int) (short) 10);
        fPHeapMax13.constroi();
        ds.Item item15 = fPHeapMax13.max();
        fPHeapMax13.imprime();
        fPHeapMax13.refaz(10, (int) (byte) 1);
        ds.FPHeapMax fPHeapMax21 = new ds.FPHeapMax(100);
        ds.Item[] itemArray22 = new ds.Item[] {};
        fPHeapMax21.copia(itemArray22);
        fPHeapMax13.copia(itemArray22);
        fPHeapMax7.copia(itemArray22);
        ds.Item item26 = fPHeapMax7.max();
        ds.Item item27 = fPHeapMax7.max();
        fPHeapMax7.imprime();
        ds.Item item29 = fPHeapMax7.max();
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMax1.aumentaChave((int) (byte) 100, (java.lang.Object) item29);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 100");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertNull(item9);
        org.junit.Assert.assertNull(item15);
        org.junit.Assert.assertNotNull(itemArray22);
        org.junit.Assert.assertNull(item26);
        org.junit.Assert.assertNull(item27);
        org.junit.Assert.assertNull(item29);
    }

    @Test
    public void test439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test439");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (short) 10);
        fPHeapMax1.constroi();
        ds.FPHeapMax fPHeapMax4 = new ds.FPHeapMax((int) (short) 10);
        fPHeapMax4.constroi();
        ds.Item item6 = fPHeapMax4.max();
        fPHeapMax4.constroi();
        ds.Item item8 = fPHeapMax4.max();
        fPHeapMax4.imprime();
        ds.Item[] itemArray10 = new ds.Item[] {};
        fPHeapMax4.copia(itemArray10);
        fPHeapMax1.copia(itemArray10);
        fPHeapMax1.refaz((int) (byte) 10, 0);
        // The following exception was thrown during execution in test generation
        try {
            ds.Item item16 = fPHeapMax1.retiraMax();
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: heap vazio");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(item6);
        org.junit.Assert.assertNull(item8);
        org.junit.Assert.assertNotNull(itemArray10);
    }

    @Test
    public void test440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test440");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (short) 10);
        fPHeapMax1.constroi();
        ds.Item item3 = fPHeapMax1.max();
        fPHeapMax1.constroi();
        ds.Item item5 = fPHeapMax1.max();
        ds.FPHeapMax fPHeapMax7 = new ds.FPHeapMax((int) '#');
        fPHeapMax7.imprime();
        ds.Item item9 = fPHeapMax7.max();
        ds.Item item10 = null;
        ds.Item[] itemArray11 = new ds.Item[] { item10 };
        fPHeapMax7.copia(itemArray11);
        fPHeapMax1.copia(itemArray11);
        fPHeapMax1.imprime();
        ds.Item item15 = fPHeapMax1.max();
        ds.FPHeapMax fPHeapMax18 = new ds.FPHeapMax((int) (short) 10);
        fPHeapMax18.refaz((int) (short) 1, 0);
        fPHeapMax18.imprime();
        fPHeapMax18.imprime();
        ds.FPHeapMax fPHeapMax25 = new ds.FPHeapMax((int) '#');
        fPHeapMax25.imprime();
        fPHeapMax25.constroi();
        fPHeapMax25.constroi();
        fPHeapMax25.imprime();
        fPHeapMax25.refaz((int) (byte) 1, 1);
        ds.FPHeapMax fPHeapMax34 = new ds.FPHeapMax((int) (short) 10);
        fPHeapMax34.constroi();
        ds.Item item36 = fPHeapMax34.max();
        fPHeapMax34.constroi();
        ds.Item item38 = fPHeapMax34.max();
        ds.FPHeapMax fPHeapMax40 = new ds.FPHeapMax((int) '#');
        fPHeapMax40.imprime();
        ds.Item item42 = fPHeapMax40.max();
        ds.Item item43 = null;
        ds.Item[] itemArray44 = new ds.Item[] { item43 };
        fPHeapMax40.copia(itemArray44);
        fPHeapMax34.copia(itemArray44);
        fPHeapMax25.copia(itemArray44);
        fPHeapMax18.copia(itemArray44);
        ds.Item item49 = fPHeapMax18.max();
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMax1.aumentaChave((int) (short) 10, (java.lang.Object) item49);
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: chaveNova com valor null");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(item3);
        org.junit.Assert.assertNull(item5);
        org.junit.Assert.assertNull(item9);
        org.junit.Assert.assertNotNull(itemArray11);
        org.junit.Assert.assertNull(item15);
        org.junit.Assert.assertNull(item36);
        org.junit.Assert.assertNull(item38);
        org.junit.Assert.assertNull(item42);
        org.junit.Assert.assertNotNull(itemArray44);
        org.junit.Assert.assertNull(item49);
    }

    @Test
    public void test441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test441");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) '#');
        fPHeapMax1.imprime();
        fPHeapMax1.constroi();
        fPHeapMax1.constroi();
        fPHeapMax1.imprime();
        fPHeapMax1.constroi();
        fPHeapMax1.constroi();
        ds.Item item8 = fPHeapMax1.max();
        // The following exception was thrown during execution in test generation
        try {
            ds.Item item9 = fPHeapMax1.retiraMax();
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: heap vazio");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(item8);
    }

    @Test
    public void test442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test442");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) '#');
        fPHeapMax1.imprime();
        fPHeapMax1.constroi();
        fPHeapMax1.constroi();
        fPHeapMax1.imprime();
        fPHeapMax1.refaz((int) (byte) 1, 1);
        ds.FPHeapMax fPHeapMax10 = new ds.FPHeapMax((int) (short) 10);
        fPHeapMax10.constroi();
        ds.Item item12 = fPHeapMax10.max();
        fPHeapMax10.constroi();
        ds.Item item14 = fPHeapMax10.max();
        ds.FPHeapMax fPHeapMax16 = new ds.FPHeapMax((int) '#');
        fPHeapMax16.imprime();
        ds.Item item18 = fPHeapMax16.max();
        ds.Item item19 = null;
        ds.Item[] itemArray20 = new ds.Item[] { item19 };
        fPHeapMax16.copia(itemArray20);
        fPHeapMax10.copia(itemArray20);
        fPHeapMax1.copia(itemArray20);
        ds.Item item24 = fPHeapMax1.max();
        ds.Item item25 = fPHeapMax1.max();
        java.lang.Class<?> wildcardClass26 = fPHeapMax1.getClass();
        org.junit.Assert.assertNull(item12);
        org.junit.Assert.assertNull(item14);
        org.junit.Assert.assertNull(item18);
        org.junit.Assert.assertNotNull(itemArray20);
        org.junit.Assert.assertNull(item24);
        org.junit.Assert.assertNull(item25);
        org.junit.Assert.assertNotNull(wildcardClass26);
    }

    @Test
    public void test443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test443");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (short) 10);
        fPHeapMax1.constroi();
        ds.Item item3 = fPHeapMax1.max();
        fPHeapMax1.constroi();
        ds.Item item5 = fPHeapMax1.max();
        fPHeapMax1.imprime();
        ds.Item[] itemArray7 = new ds.Item[] {};
        fPHeapMax1.copia(itemArray7);
        fPHeapMax1.constroi();
        ds.Item item10 = null;
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMax1.insere(item10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(item3);
        org.junit.Assert.assertNull(item5);
        org.junit.Assert.assertNotNull(itemArray7);
    }

    @Test
    public void test444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test444");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (short) 10);
        fPHeapMax1.constroi();
        ds.Item item3 = fPHeapMax1.max();
        fPHeapMax1.constroi();
        ds.Item item5 = fPHeapMax1.max();
        ds.FPHeapMax fPHeapMax7 = new ds.FPHeapMax((int) (short) 10);
        fPHeapMax7.constroi();
        ds.FPHeapMax fPHeapMax10 = new ds.FPHeapMax((int) (short) 10);
        fPHeapMax10.constroi();
        ds.Item item12 = fPHeapMax10.max();
        fPHeapMax10.constroi();
        ds.Item item14 = fPHeapMax10.max();
        fPHeapMax10.imprime();
        ds.Item[] itemArray16 = new ds.Item[] {};
        fPHeapMax10.copia(itemArray16);
        fPHeapMax7.copia(itemArray16);
        fPHeapMax1.copia(itemArray16);
        fPHeapMax1.constroi();
        fPHeapMax1.constroi();
        fPHeapMax1.imprime();
        // The following exception was thrown during execution in test generation
        try {
            ds.Item item23 = fPHeapMax1.retiraMax();
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: heap vazio");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(item3);
        org.junit.Assert.assertNull(item5);
        org.junit.Assert.assertNull(item12);
        org.junit.Assert.assertNull(item14);
        org.junit.Assert.assertNotNull(itemArray16);
    }

    @Test
    public void test445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test445");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) '#');
        fPHeapMax1.imprime();
        ds.Item item3 = fPHeapMax1.max();
        ds.Item item4 = null;
        ds.Item[] itemArray5 = new ds.Item[] { item4 };
        fPHeapMax1.copia(itemArray5);
        ds.Item item7 = fPHeapMax1.max();
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMax1.refaz((int) (short) 0, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(item3);
        org.junit.Assert.assertNotNull(itemArray5);
        org.junit.Assert.assertNull(item7);
    }

    @Test
    public void test446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test446");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (short) 10);
        ds.Item item2 = fPHeapMax1.max();
        fPHeapMax1.imprime();
        ds.FPHeapMax fPHeapMax5 = new ds.FPHeapMax((int) (short) 0);
        ds.FPHeapMax fPHeapMax7 = new ds.FPHeapMax((int) '#');
        fPHeapMax7.imprime();
        ds.Item item9 = fPHeapMax7.max();
        ds.Item item10 = null;
        ds.Item[] itemArray11 = new ds.Item[] { item10 };
        fPHeapMax7.copia(itemArray11);
        fPHeapMax5.copia(itemArray11);
        fPHeapMax5.constroi();
        fPHeapMax5.constroi();
        ds.FPHeapMax fPHeapMax17 = new ds.FPHeapMax((int) (short) 10);
        fPHeapMax17.constroi();
        ds.Item item19 = fPHeapMax17.max();
        fPHeapMax17.constroi();
        ds.Item item21 = fPHeapMax17.max();
        fPHeapMax17.imprime();
        ds.FPHeapMax fPHeapMax24 = new ds.FPHeapMax((int) '#');
        fPHeapMax24.imprime();
        ds.Item item26 = fPHeapMax24.max();
        ds.Item item27 = null;
        ds.Item[] itemArray28 = new ds.Item[] { item27 };
        fPHeapMax24.copia(itemArray28);
        fPHeapMax17.copia(itemArray28);
        fPHeapMax5.copia(itemArray28);
        fPHeapMax1.copia(itemArray28);
        org.junit.Assert.assertNull(item2);
        org.junit.Assert.assertNull(item9);
        org.junit.Assert.assertNotNull(itemArray11);
        org.junit.Assert.assertNull(item19);
        org.junit.Assert.assertNull(item21);
        org.junit.Assert.assertNull(item26);
        org.junit.Assert.assertNotNull(itemArray28);
    }

    @Test
    public void test447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test447");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (short) 10);
        fPHeapMax1.constroi();
        ds.Item item3 = fPHeapMax1.max();
        fPHeapMax1.constroi();
        ds.Item item5 = fPHeapMax1.max();
        ds.FPHeapMax fPHeapMax7 = new ds.FPHeapMax((int) '#');
        fPHeapMax7.imprime();
        ds.Item item9 = fPHeapMax7.max();
        ds.Item item10 = null;
        ds.Item[] itemArray11 = new ds.Item[] { item10 };
        fPHeapMax7.copia(itemArray11);
        fPHeapMax1.copia(itemArray11);
        ds.Item item14 = fPHeapMax1.max();
        fPHeapMax1.constroi();
        // The following exception was thrown during execution in test generation
        try {
            ds.Item item16 = fPHeapMax1.retiraMax();
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: heap vazio");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(item3);
        org.junit.Assert.assertNull(item5);
        org.junit.Assert.assertNull(item9);
        org.junit.Assert.assertNotNull(itemArray11);
        org.junit.Assert.assertNull(item14);
    }

    @Test
    public void test448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test448");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (short) 10);
        fPHeapMax1.constroi();
        ds.Item item3 = fPHeapMax1.max();
        fPHeapMax1.constroi();
        fPHeapMax1.imprime();
        fPHeapMax1.constroi();
        ds.Item item7 = fPHeapMax1.max();
        fPHeapMax1.constroi();
        fPHeapMax1.constroi();
        ds.Item item10 = null;
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMax1.insere(item10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(item3);
        org.junit.Assert.assertNull(item7);
    }

    @Test
    public void test449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test449");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax(100);
        ds.Item[] itemArray2 = new ds.Item[] {};
        fPHeapMax1.copia(itemArray2);
        fPHeapMax1.refaz((int) 'a', 0);
        org.junit.Assert.assertNotNull(itemArray2);
    }

    @Test
    public void test450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test450");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) '#');
        fPHeapMax1.imprime();
        ds.Item item3 = fPHeapMax1.max();
        ds.Item item4 = null;
        ds.Item[] itemArray5 = new ds.Item[] { item4 };
        fPHeapMax1.copia(itemArray5);
        ds.Item item7 = fPHeapMax1.max();
        fPHeapMax1.constroi();
        fPHeapMax1.imprime();
        fPHeapMax1.constroi();
        org.junit.Assert.assertNull(item3);
        org.junit.Assert.assertNotNull(itemArray5);
        org.junit.Assert.assertNull(item7);
    }

    @Test
    public void test451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test451");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (short) 10);
        fPHeapMax1.constroi();
        ds.FPHeapMax fPHeapMax4 = new ds.FPHeapMax((int) (short) 10);
        fPHeapMax4.constroi();
        ds.Item item6 = fPHeapMax4.max();
        fPHeapMax4.constroi();
        ds.Item item8 = fPHeapMax4.max();
        fPHeapMax4.imprime();
        ds.Item[] itemArray10 = new ds.Item[] {};
        fPHeapMax4.copia(itemArray10);
        fPHeapMax1.copia(itemArray10);
        fPHeapMax1.imprime();
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMax1.refaz((int) '4', (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 52");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(item6);
        org.junit.Assert.assertNull(item8);
        org.junit.Assert.assertNotNull(itemArray10);
    }

    @Test
    public void test452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test452");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (short) 10);
        fPHeapMax1.constroi();
        ds.Item item3 = fPHeapMax1.max();
        fPHeapMax1.constroi();
        ds.Item item5 = fPHeapMax1.max();
        fPHeapMax1.imprime();
        fPHeapMax1.constroi();
        fPHeapMax1.constroi();
        ds.Item item9 = fPHeapMax1.max();
        fPHeapMax1.imprime();
        fPHeapMax1.constroi();
        ds.Item item12 = null;
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMax1.insere(item12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(item3);
        org.junit.Assert.assertNull(item5);
        org.junit.Assert.assertNull(item9);
    }

    @Test
    public void test453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test453");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (short) 10);
        fPHeapMax1.refaz((int) (short) 1, 0);
        fPHeapMax1.imprime();
        fPHeapMax1.imprime();
        ds.FPHeapMax fPHeapMax8 = new ds.FPHeapMax((int) '#');
        fPHeapMax8.imprime();
        fPHeapMax8.constroi();
        fPHeapMax8.constroi();
        fPHeapMax8.imprime();
        fPHeapMax8.refaz((int) (byte) 1, 1);
        ds.FPHeapMax fPHeapMax17 = new ds.FPHeapMax((int) (short) 10);
        fPHeapMax17.constroi();
        ds.Item item19 = fPHeapMax17.max();
        fPHeapMax17.constroi();
        ds.Item item21 = fPHeapMax17.max();
        ds.FPHeapMax fPHeapMax23 = new ds.FPHeapMax((int) '#');
        fPHeapMax23.imprime();
        ds.Item item25 = fPHeapMax23.max();
        ds.Item item26 = null;
        ds.Item[] itemArray27 = new ds.Item[] { item26 };
        fPHeapMax23.copia(itemArray27);
        fPHeapMax17.copia(itemArray27);
        fPHeapMax8.copia(itemArray27);
        fPHeapMax1.copia(itemArray27);
        fPHeapMax1.constroi();
        fPHeapMax1.constroi();
        org.junit.Assert.assertNull(item19);
        org.junit.Assert.assertNull(item21);
        org.junit.Assert.assertNull(item25);
        org.junit.Assert.assertNotNull(itemArray27);
    }

    @Test
    public void test454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test454");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (short) 10);
        fPHeapMax1.constroi();
        ds.Item item3 = fPHeapMax1.max();
        fPHeapMax1.constroi();
        ds.Item item5 = fPHeapMax1.max();
        fPHeapMax1.imprime();
        ds.Item[] itemArray7 = new ds.Item[] {};
        fPHeapMax1.copia(itemArray7);
        fPHeapMax1.constroi();
        ds.FPHeapMax fPHeapMax11 = new ds.FPHeapMax(100);
        ds.Item[] itemArray12 = new ds.Item[] {};
        fPHeapMax11.copia(itemArray12);
        fPHeapMax1.copia(itemArray12);
        fPHeapMax1.imprime();
        ds.Item item16 = fPHeapMax1.max();
        ds.FPHeapMax fPHeapMax19 = new ds.FPHeapMax((int) (short) 10);
        fPHeapMax19.constroi();
        ds.Item item21 = fPHeapMax19.max();
        fPHeapMax19.constroi();
        ds.Item item23 = fPHeapMax19.max();
        fPHeapMax19.imprime();
        fPHeapMax19.constroi();
        ds.FPHeapMax fPHeapMax27 = new ds.FPHeapMax((int) '#');
        fPHeapMax27.imprime();
        ds.Item item29 = fPHeapMax27.max();
        ds.Item item30 = null;
        ds.Item[] itemArray31 = new ds.Item[] { item30 };
        fPHeapMax27.copia(itemArray31);
        fPHeapMax19.copia(itemArray31);
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMax1.aumentaChave((int) ' ', (java.lang.Object) itemArray31);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 32");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(item3);
        org.junit.Assert.assertNull(item5);
        org.junit.Assert.assertNotNull(itemArray7);
        org.junit.Assert.assertNotNull(itemArray12);
        org.junit.Assert.assertNull(item16);
        org.junit.Assert.assertNull(item21);
        org.junit.Assert.assertNull(item23);
        org.junit.Assert.assertNull(item29);
        org.junit.Assert.assertNotNull(itemArray31);
    }

    @Test
    public void test455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test455");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) '#');
        fPHeapMax1.imprime();
        fPHeapMax1.constroi();
        fPHeapMax1.constroi();
        ds.FPHeapMax fPHeapMax6 = new ds.FPHeapMax((int) '#');
        fPHeapMax6.imprime();
        ds.Item item8 = fPHeapMax6.max();
        ds.Item item9 = null;
        ds.Item[] itemArray10 = new ds.Item[] { item9 };
        fPHeapMax6.copia(itemArray10);
        fPHeapMax1.copia(itemArray10);
        java.lang.Class<?> wildcardClass13 = fPHeapMax1.getClass();
        org.junit.Assert.assertNull(item8);
        org.junit.Assert.assertNotNull(itemArray10);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test456");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (byte) 10);
        fPHeapMax1.imprime();
        ds.FPHeapMax fPHeapMax4 = new ds.FPHeapMax(100);
        ds.Item[] itemArray5 = new ds.Item[] {};
        fPHeapMax4.copia(itemArray5);
        fPHeapMax1.copia(itemArray5);
        ds.FPHeapMax fPHeapMax9 = new ds.FPHeapMax((int) (short) 10);
        fPHeapMax9.constroi();
        ds.Item item11 = fPHeapMax9.max();
        fPHeapMax9.constroi();
        fPHeapMax9.imprime();
        ds.FPHeapMax fPHeapMax15 = new ds.FPHeapMax((int) '#');
        fPHeapMax15.imprime();
        ds.Item item17 = fPHeapMax15.max();
        ds.Item item18 = null;
        ds.Item[] itemArray19 = new ds.Item[] { item18 };
        fPHeapMax15.copia(itemArray19);
        fPHeapMax9.copia(itemArray19);
        ds.FPHeapMax fPHeapMax23 = new ds.FPHeapMax((int) (short) 10);
        fPHeapMax23.constroi();
        ds.Item item25 = fPHeapMax23.max();
        fPHeapMax23.constroi();
        fPHeapMax23.imprime();
        ds.FPHeapMax fPHeapMax29 = new ds.FPHeapMax((int) '#');
        fPHeapMax29.imprime();
        ds.Item item31 = fPHeapMax29.max();
        ds.Item item32 = null;
        ds.Item[] itemArray33 = new ds.Item[] { item32 };
        fPHeapMax29.copia(itemArray33);
        fPHeapMax23.copia(itemArray33);
        fPHeapMax9.copia(itemArray33);
        fPHeapMax1.copia(itemArray33);
        ds.Item item38 = fPHeapMax1.max();
        ds.FPHeapMax fPHeapMax41 = new ds.FPHeapMax((-1));
        fPHeapMax41.imprime();
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMax1.aumentaChave((int) '4', (java.lang.Object) fPHeapMax41);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 52");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray5);
        org.junit.Assert.assertNull(item11);
        org.junit.Assert.assertNull(item17);
        org.junit.Assert.assertNotNull(itemArray19);
        org.junit.Assert.assertNull(item25);
        org.junit.Assert.assertNull(item31);
        org.junit.Assert.assertNotNull(itemArray33);
        org.junit.Assert.assertNull(item38);
    }

    @Test
    public void test457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test457");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (short) 10);
        fPHeapMax1.constroi();
        ds.Item item3 = fPHeapMax1.max();
        fPHeapMax1.imprime();
        fPHeapMax1.refaz(10, (int) (byte) 1);
        fPHeapMax1.imprime();
        ds.Item item9 = fPHeapMax1.max();
        fPHeapMax1.constroi();
        ds.FPHeapMax fPHeapMax13 = new ds.FPHeapMax(100);
        ds.FPHeapMax fPHeapMax15 = new ds.FPHeapMax((int) '#');
        fPHeapMax15.imprime();
        fPHeapMax15.constroi();
        fPHeapMax15.constroi();
        ds.FPHeapMax fPHeapMax20 = new ds.FPHeapMax((int) '#');
        fPHeapMax20.imprime();
        ds.Item item22 = fPHeapMax20.max();
        ds.Item item23 = null;
        ds.Item[] itemArray24 = new ds.Item[] { item23 };
        fPHeapMax20.copia(itemArray24);
        fPHeapMax15.copia(itemArray24);
        fPHeapMax13.copia(itemArray24);
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMax1.aumentaChave((int) (short) 1, (java.lang.Object) fPHeapMax13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(item3);
        org.junit.Assert.assertNull(item9);
        org.junit.Assert.assertNull(item22);
        org.junit.Assert.assertNotNull(itemArray24);
    }

    @Test
    public void test458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test458");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (short) 10);
        fPHeapMax1.constroi();
        ds.Item item3 = fPHeapMax1.max();
        fPHeapMax1.constroi();
        fPHeapMax1.refaz((int) (byte) 10, 0);
        fPHeapMax1.imprime();
        ds.Item item9 = fPHeapMax1.max();
        fPHeapMax1.refaz((int) (short) 1, (int) (byte) 1);
        org.junit.Assert.assertNull(item3);
        org.junit.Assert.assertNull(item9);
    }

    @Test
    public void test459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test459");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (short) 10);
        fPHeapMax1.constroi();
        ds.Item item3 = fPHeapMax1.max();
        fPHeapMax1.constroi();
        ds.Item item5 = fPHeapMax1.max();
        fPHeapMax1.imprime();
        ds.Item[] itemArray7 = new ds.Item[] {};
        fPHeapMax1.copia(itemArray7);
        fPHeapMax1.constroi();
        ds.FPHeapMax fPHeapMax11 = new ds.FPHeapMax(100);
        ds.Item[] itemArray12 = new ds.Item[] {};
        fPHeapMax11.copia(itemArray12);
        fPHeapMax1.copia(itemArray12);
        fPHeapMax1.imprime();
        ds.Item item16 = fPHeapMax1.max();
        ds.Item item17 = null;
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMax1.insere(item17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(item3);
        org.junit.Assert.assertNull(item5);
        org.junit.Assert.assertNotNull(itemArray7);
        org.junit.Assert.assertNotNull(itemArray12);
        org.junit.Assert.assertNull(item16);
    }

    @Test
    public void test460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test460");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax(1);
        fPHeapMax1.imprime();
        java.lang.Class<?> wildcardClass3 = fPHeapMax1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test461");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) '#');
        fPHeapMax1.imprime();
        ds.Item item3 = fPHeapMax1.max();
        ds.Item item4 = null;
        ds.Item[] itemArray5 = new ds.Item[] { item4 };
        fPHeapMax1.copia(itemArray5);
        ds.Item item7 = fPHeapMax1.max();
        fPHeapMax1.constroi();
        ds.Item item9 = fPHeapMax1.max();
        ds.Item item10 = fPHeapMax1.max();
        // The following exception was thrown during execution in test generation
        try {
            ds.Item item11 = fPHeapMax1.retiraMax();
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: heap vazio");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(item3);
        org.junit.Assert.assertNotNull(itemArray5);
        org.junit.Assert.assertNull(item7);
        org.junit.Assert.assertNull(item9);
        org.junit.Assert.assertNull(item10);
    }

    @Test
    public void test462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test462");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax(100);
        ds.Item[] itemArray2 = new ds.Item[] {};
        fPHeapMax1.copia(itemArray2);
        ds.FPHeapMax fPHeapMax5 = new ds.FPHeapMax((int) (short) 10);
        fPHeapMax5.constroi();
        ds.Item item7 = fPHeapMax5.max();
        fPHeapMax5.constroi();
        ds.Item item9 = fPHeapMax5.max();
        ds.FPHeapMax fPHeapMax11 = new ds.FPHeapMax((int) '#');
        fPHeapMax11.imprime();
        ds.Item item13 = fPHeapMax11.max();
        ds.Item item14 = null;
        ds.Item[] itemArray15 = new ds.Item[] { item14 };
        fPHeapMax11.copia(itemArray15);
        fPHeapMax5.copia(itemArray15);
        ds.FPHeapMax fPHeapMax19 = new ds.FPHeapMax((int) (byte) 100);
        fPHeapMax19.imprime();
        ds.FPHeapMax fPHeapMax22 = new ds.FPHeapMax(1);
        ds.FPHeapMax fPHeapMax24 = new ds.FPHeapMax((int) (short) 10);
        fPHeapMax24.constroi();
        ds.Item item26 = fPHeapMax24.max();
        fPHeapMax24.constroi();
        ds.Item item28 = fPHeapMax24.max();
        fPHeapMax24.imprime();
        ds.Item[] itemArray30 = new ds.Item[] {};
        fPHeapMax24.copia(itemArray30);
        fPHeapMax22.copia(itemArray30);
        fPHeapMax19.copia(itemArray30);
        ds.FPHeapMax fPHeapMax35 = new ds.FPHeapMax(100);
        ds.Item[] itemArray36 = new ds.Item[] {};
        fPHeapMax35.copia(itemArray36);
        fPHeapMax19.copia(itemArray36);
        fPHeapMax5.copia(itemArray36);
        fPHeapMax1.copia(itemArray36);
        ds.FPHeapMax fPHeapMax42 = new ds.FPHeapMax((int) '#');
        fPHeapMax42.imprime();
        ds.Item item44 = fPHeapMax42.max();
        ds.Item item45 = null;
        ds.Item[] itemArray46 = new ds.Item[] { item45 };
        fPHeapMax42.copia(itemArray46);
        fPHeapMax1.copia(itemArray46);
        org.junit.Assert.assertNotNull(itemArray2);
        org.junit.Assert.assertNull(item7);
        org.junit.Assert.assertNull(item9);
        org.junit.Assert.assertNull(item13);
        org.junit.Assert.assertNotNull(itemArray15);
        org.junit.Assert.assertNull(item26);
        org.junit.Assert.assertNull(item28);
        org.junit.Assert.assertNotNull(itemArray30);
        org.junit.Assert.assertNotNull(itemArray36);
        org.junit.Assert.assertNull(item44);
        org.junit.Assert.assertNotNull(itemArray46);
    }

    @Test
    public void test463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test463");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (short) 10);
        fPHeapMax1.constroi();
        ds.Item item3 = fPHeapMax1.max();
        fPHeapMax1.constroi();
        ds.Item item5 = fPHeapMax1.max();
        ds.FPHeapMax fPHeapMax7 = new ds.FPHeapMax((int) '#');
        fPHeapMax7.imprime();
        ds.Item item9 = fPHeapMax7.max();
        ds.Item item10 = null;
        ds.Item[] itemArray11 = new ds.Item[] { item10 };
        fPHeapMax7.copia(itemArray11);
        fPHeapMax1.copia(itemArray11);
        fPHeapMax1.constroi();
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMax1.refaz((int) (byte) 1, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(item3);
        org.junit.Assert.assertNull(item5);
        org.junit.Assert.assertNull(item9);
        org.junit.Assert.assertNotNull(itemArray11);
    }

    @Test
    public void test464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test464");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (short) 10);
        fPHeapMax1.constroi();
        ds.Item item3 = fPHeapMax1.max();
        fPHeapMax1.constroi();
        fPHeapMax1.constroi();
        ds.FPHeapMax fPHeapMax7 = new ds.FPHeapMax((int) (short) 10);
        fPHeapMax7.constroi();
        ds.Item item9 = fPHeapMax7.max();
        fPHeapMax7.imprime();
        fPHeapMax7.refaz(10, (int) (byte) 1);
        ds.FPHeapMax fPHeapMax15 = new ds.FPHeapMax(100);
        ds.Item[] itemArray16 = new ds.Item[] {};
        fPHeapMax15.copia(itemArray16);
        fPHeapMax7.copia(itemArray16);
        fPHeapMax1.copia(itemArray16);
        ds.Item item20 = fPHeapMax1.max();
        ds.Item item21 = fPHeapMax1.max();
        fPHeapMax1.imprime();
        ds.Item item23 = fPHeapMax1.max();
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMax1.refaz((int) (short) 100, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 100");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(item3);
        org.junit.Assert.assertNull(item9);
        org.junit.Assert.assertNotNull(itemArray16);
        org.junit.Assert.assertNull(item20);
        org.junit.Assert.assertNull(item21);
        org.junit.Assert.assertNull(item23);
    }

    @Test
    public void test465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test465");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax(10);
        ds.FPHeapMax fPHeapMax3 = new ds.FPHeapMax((int) '#');
        fPHeapMax3.imprime();
        ds.Item item5 = fPHeapMax3.max();
        ds.Item item6 = null;
        ds.Item[] itemArray7 = new ds.Item[] { item6 };
        fPHeapMax3.copia(itemArray7);
        ds.Item item9 = fPHeapMax3.max();
        ds.FPHeapMax fPHeapMax11 = new ds.FPHeapMax((int) (byte) 10);
        fPHeapMax11.imprime();
        ds.FPHeapMax fPHeapMax14 = new ds.FPHeapMax(100);
        ds.Item[] itemArray15 = new ds.Item[] {};
        fPHeapMax14.copia(itemArray15);
        fPHeapMax11.copia(itemArray15);
        ds.FPHeapMax fPHeapMax19 = new ds.FPHeapMax(100);
        ds.Item[] itemArray20 = new ds.Item[] {};
        fPHeapMax19.copia(itemArray20);
        ds.FPHeapMax fPHeapMax23 = new ds.FPHeapMax((int) (short) 10);
        fPHeapMax23.constroi();
        ds.Item item25 = fPHeapMax23.max();
        fPHeapMax23.constroi();
        ds.Item item27 = fPHeapMax23.max();
        fPHeapMax23.imprime();
        ds.Item[] itemArray29 = new ds.Item[] {};
        fPHeapMax23.copia(itemArray29);
        fPHeapMax23.constroi();
        ds.FPHeapMax fPHeapMax33 = new ds.FPHeapMax(100);
        ds.Item[] itemArray34 = new ds.Item[] {};
        fPHeapMax33.copia(itemArray34);
        fPHeapMax23.copia(itemArray34);
        fPHeapMax19.copia(itemArray34);
        fPHeapMax11.copia(itemArray34);
        fPHeapMax3.copia(itemArray34);
        fPHeapMax1.copia(itemArray34);
        fPHeapMax1.imprime();
        ds.FPHeapMax fPHeapMax44 = new ds.FPHeapMax((int) (short) 10);
        fPHeapMax44.refaz((int) (short) 1, 0);
        fPHeapMax44.imprime();
        fPHeapMax44.imprime();
        ds.FPHeapMax fPHeapMax51 = new ds.FPHeapMax((int) '#');
        fPHeapMax51.imprime();
        fPHeapMax51.constroi();
        fPHeapMax51.constroi();
        fPHeapMax51.imprime();
        fPHeapMax51.refaz((int) (byte) 1, 1);
        ds.FPHeapMax fPHeapMax60 = new ds.FPHeapMax((int) (short) 10);
        fPHeapMax60.constroi();
        ds.Item item62 = fPHeapMax60.max();
        fPHeapMax60.constroi();
        ds.Item item64 = fPHeapMax60.max();
        ds.FPHeapMax fPHeapMax66 = new ds.FPHeapMax((int) '#');
        fPHeapMax66.imprime();
        ds.Item item68 = fPHeapMax66.max();
        ds.Item item69 = null;
        ds.Item[] itemArray70 = new ds.Item[] { item69 };
        fPHeapMax66.copia(itemArray70);
        fPHeapMax60.copia(itemArray70);
        fPHeapMax51.copia(itemArray70);
        fPHeapMax44.copia(itemArray70);
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMax1.aumentaChave(100, (java.lang.Object) fPHeapMax44);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 100");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(item5);
        org.junit.Assert.assertNotNull(itemArray7);
        org.junit.Assert.assertNull(item9);
        org.junit.Assert.assertNotNull(itemArray15);
        org.junit.Assert.assertNotNull(itemArray20);
        org.junit.Assert.assertNull(item25);
        org.junit.Assert.assertNull(item27);
        org.junit.Assert.assertNotNull(itemArray29);
        org.junit.Assert.assertNotNull(itemArray34);
        org.junit.Assert.assertNull(item62);
        org.junit.Assert.assertNull(item64);
        org.junit.Assert.assertNull(item68);
        org.junit.Assert.assertNotNull(itemArray70);
    }

    @Test
    public void test466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test466");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (short) 10);
        fPHeapMax1.constroi();
        ds.FPHeapMax fPHeapMax4 = new ds.FPHeapMax((int) (short) 10);
        fPHeapMax4.constroi();
        ds.Item item6 = fPHeapMax4.max();
        fPHeapMax4.constroi();
        ds.Item item8 = fPHeapMax4.max();
        fPHeapMax4.imprime();
        ds.Item[] itemArray10 = new ds.Item[] {};
        fPHeapMax4.copia(itemArray10);
        fPHeapMax1.copia(itemArray10);
        java.lang.Class<?> wildcardClass13 = fPHeapMax1.getClass();
        org.junit.Assert.assertNull(item6);
        org.junit.Assert.assertNull(item8);
        org.junit.Assert.assertNotNull(itemArray10);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test467");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (short) 10);
        fPHeapMax1.constroi();
        ds.Item item3 = fPHeapMax1.max();
        fPHeapMax1.constroi();
        ds.Item item5 = fPHeapMax1.max();
        fPHeapMax1.imprime();
        fPHeapMax1.constroi();
        fPHeapMax1.constroi();
        ds.Item item9 = fPHeapMax1.max();
        fPHeapMax1.imprime();
        fPHeapMax1.constroi();
        java.lang.Class<?> wildcardClass12 = fPHeapMax1.getClass();
        org.junit.Assert.assertNull(item3);
        org.junit.Assert.assertNull(item5);
        org.junit.Assert.assertNull(item9);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test468");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (short) 10);
        fPHeapMax1.constroi();
        ds.FPHeapMax fPHeapMax4 = new ds.FPHeapMax((int) (short) 10);
        fPHeapMax4.constroi();
        ds.Item item6 = fPHeapMax4.max();
        fPHeapMax4.constroi();
        ds.Item item8 = fPHeapMax4.max();
        fPHeapMax4.imprime();
        ds.Item[] itemArray10 = new ds.Item[] {};
        fPHeapMax4.copia(itemArray10);
        fPHeapMax1.copia(itemArray10);
        fPHeapMax1.refaz((int) (byte) 10, 0);
        ds.Item item16 = fPHeapMax1.max();
        ds.FPHeapMax fPHeapMax18 = new ds.FPHeapMax((int) '#');
        fPHeapMax18.imprime();
        fPHeapMax18.constroi();
        fPHeapMax18.constroi();
        fPHeapMax18.imprime();
        fPHeapMax18.constroi();
        fPHeapMax18.constroi();
        ds.FPHeapMax fPHeapMax26 = new ds.FPHeapMax((int) (short) 10);
        fPHeapMax26.constroi();
        ds.Item item28 = fPHeapMax26.max();
        fPHeapMax26.constroi();
        ds.Item item30 = fPHeapMax26.max();
        fPHeapMax26.imprime();
        fPHeapMax26.constroi();
        fPHeapMax26.constroi();
        ds.FPHeapMax fPHeapMax35 = new ds.FPHeapMax((int) (short) 10);
        fPHeapMax35.constroi();
        ds.Item item37 = fPHeapMax35.max();
        fPHeapMax35.imprime();
        fPHeapMax35.refaz(10, (int) (byte) 1);
        ds.FPHeapMax fPHeapMax43 = new ds.FPHeapMax(100);
        ds.Item[] itemArray44 = new ds.Item[] {};
        fPHeapMax43.copia(itemArray44);
        fPHeapMax35.copia(itemArray44);
        fPHeapMax26.copia(itemArray44);
        fPHeapMax18.copia(itemArray44);
        fPHeapMax1.copia(itemArray44);
        java.lang.Class<?> wildcardClass50 = fPHeapMax1.getClass();
        org.junit.Assert.assertNull(item6);
        org.junit.Assert.assertNull(item8);
        org.junit.Assert.assertNotNull(itemArray10);
        org.junit.Assert.assertNull(item16);
        org.junit.Assert.assertNull(item28);
        org.junit.Assert.assertNull(item30);
        org.junit.Assert.assertNull(item37);
        org.junit.Assert.assertNotNull(itemArray44);
        org.junit.Assert.assertNotNull(wildcardClass50);
    }

    @Test
    public void test469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test469");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (short) 10);
        fPHeapMax1.constroi();
        ds.FPHeapMax fPHeapMax4 = new ds.FPHeapMax((int) (short) 10);
        fPHeapMax4.constroi();
        ds.Item item6 = fPHeapMax4.max();
        fPHeapMax4.constroi();
        fPHeapMax4.imprime();
        ds.FPHeapMax fPHeapMax10 = new ds.FPHeapMax((int) (short) 10);
        fPHeapMax10.constroi();
        ds.Item item12 = fPHeapMax10.max();
        fPHeapMax10.constroi();
        ds.Item item14 = fPHeapMax10.max();
        fPHeapMax10.imprime();
        fPHeapMax10.constroi();
        fPHeapMax10.constroi();
        ds.FPHeapMax fPHeapMax19 = new ds.FPHeapMax((int) (short) 10);
        fPHeapMax19.constroi();
        ds.Item item21 = fPHeapMax19.max();
        fPHeapMax19.imprime();
        fPHeapMax19.refaz(10, (int) (byte) 1);
        ds.FPHeapMax fPHeapMax27 = new ds.FPHeapMax(100);
        ds.Item[] itemArray28 = new ds.Item[] {};
        fPHeapMax27.copia(itemArray28);
        fPHeapMax19.copia(itemArray28);
        fPHeapMax10.copia(itemArray28);
        ds.FPHeapMax fPHeapMax33 = new ds.FPHeapMax((int) (byte) 10);
        fPHeapMax33.imprime();
        ds.FPHeapMax fPHeapMax36 = new ds.FPHeapMax(100);
        ds.Item[] itemArray37 = new ds.Item[] {};
        fPHeapMax36.copia(itemArray37);
        fPHeapMax33.copia(itemArray37);
        fPHeapMax10.copia(itemArray37);
        fPHeapMax4.copia(itemArray37);
        fPHeapMax1.copia(itemArray37);
        org.junit.Assert.assertNull(item6);
        org.junit.Assert.assertNull(item12);
        org.junit.Assert.assertNull(item14);
        org.junit.Assert.assertNull(item21);
        org.junit.Assert.assertNotNull(itemArray28);
        org.junit.Assert.assertNotNull(itemArray37);
    }

    @Test
    public void test470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test470");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (short) 0);
        ds.FPHeapMax fPHeapMax3 = new ds.FPHeapMax((int) '#');
        fPHeapMax3.imprime();
        ds.Item item5 = fPHeapMax3.max();
        ds.Item item6 = null;
        ds.Item[] itemArray7 = new ds.Item[] { item6 };
        fPHeapMax3.copia(itemArray7);
        fPHeapMax1.copia(itemArray7);
        fPHeapMax1.constroi();
        fPHeapMax1.constroi();
        ds.FPHeapMax fPHeapMax13 = new ds.FPHeapMax((int) (short) 10);
        fPHeapMax13.constroi();
        ds.Item item15 = fPHeapMax13.max();
        fPHeapMax13.constroi();
        ds.Item item17 = fPHeapMax13.max();
        fPHeapMax13.imprime();
        ds.FPHeapMax fPHeapMax20 = new ds.FPHeapMax((int) '#');
        fPHeapMax20.imprime();
        ds.Item item22 = fPHeapMax20.max();
        ds.Item item23 = null;
        ds.Item[] itemArray24 = new ds.Item[] { item23 };
        fPHeapMax20.copia(itemArray24);
        fPHeapMax13.copia(itemArray24);
        fPHeapMax1.copia(itemArray24);
        fPHeapMax1.imprime();
        fPHeapMax1.constroi();
        ds.Item[] itemArray30 = null;
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMax1.copia(itemArray30);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(item5);
        org.junit.Assert.assertNotNull(itemArray7);
        org.junit.Assert.assertNull(item15);
        org.junit.Assert.assertNull(item17);
        org.junit.Assert.assertNull(item22);
        org.junit.Assert.assertNotNull(itemArray24);
    }

    @Test
    public void test471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test471");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (short) 0);
        ds.FPHeapMax fPHeapMax3 = new ds.FPHeapMax((int) '#');
        fPHeapMax3.imprime();
        ds.Item item5 = fPHeapMax3.max();
        ds.Item item6 = null;
        ds.Item[] itemArray7 = new ds.Item[] { item6 };
        fPHeapMax3.copia(itemArray7);
        fPHeapMax1.copia(itemArray7);
        fPHeapMax1.constroi();
        fPHeapMax1.constroi();
        ds.FPHeapMax fPHeapMax13 = new ds.FPHeapMax((int) (short) 10);
        fPHeapMax13.constroi();
        ds.Item item15 = fPHeapMax13.max();
        fPHeapMax13.constroi();
        ds.Item item17 = fPHeapMax13.max();
        fPHeapMax13.imprime();
        ds.FPHeapMax fPHeapMax20 = new ds.FPHeapMax((int) '#');
        fPHeapMax20.imprime();
        ds.Item item22 = fPHeapMax20.max();
        ds.Item item23 = null;
        ds.Item[] itemArray24 = new ds.Item[] { item23 };
        fPHeapMax20.copia(itemArray24);
        fPHeapMax13.copia(itemArray24);
        fPHeapMax1.copia(itemArray24);
        java.lang.Object obj29 = null;
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMax1.aumentaChave((int) (short) 1, obj29);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(item5);
        org.junit.Assert.assertNotNull(itemArray7);
        org.junit.Assert.assertNull(item15);
        org.junit.Assert.assertNull(item17);
        org.junit.Assert.assertNull(item22);
        org.junit.Assert.assertNotNull(itemArray24);
    }

    @Test
    public void test472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test472");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (short) 10);
        fPHeapMax1.constroi();
        ds.Item item3 = fPHeapMax1.max();
        fPHeapMax1.constroi();
        ds.Item item5 = fPHeapMax1.max();
        fPHeapMax1.imprime();
        ds.Item[] itemArray7 = new ds.Item[] {};
        fPHeapMax1.copia(itemArray7);
        fPHeapMax1.constroi();
        fPHeapMax1.constroi();
        fPHeapMax1.imprime();
        org.junit.Assert.assertNull(item3);
        org.junit.Assert.assertNull(item5);
        org.junit.Assert.assertNotNull(itemArray7);
    }

    @Test
    public void test473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test473");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) '#');
        fPHeapMax1.imprime();
        fPHeapMax1.constroi();
        fPHeapMax1.constroi();
        fPHeapMax1.imprime();
        fPHeapMax1.constroi();
        ds.FPHeapMax fPHeapMax9 = new ds.FPHeapMax((int) (short) 10);
        ds.Item item10 = fPHeapMax9.max();
        fPHeapMax9.imprime();
        ds.FPHeapMax fPHeapMax13 = new ds.FPHeapMax(100);
        ds.Item[] itemArray14 = new ds.Item[] {};
        fPHeapMax13.copia(itemArray14);
        fPHeapMax9.copia(itemArray14);
        fPHeapMax9.constroi();
        java.lang.Class<?> wildcardClass18 = fPHeapMax9.getClass();
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMax1.aumentaChave((-1), (java.lang.Object) wildcardClass18);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(item10);
        org.junit.Assert.assertNotNull(itemArray14);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test474");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (short) 1);
        fPHeapMax1.imprime();
        java.lang.Class<?> wildcardClass3 = fPHeapMax1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test475");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (short) 10);
        fPHeapMax1.constroi();
        ds.Item item3 = fPHeapMax1.max();
        fPHeapMax1.constroi();
        ds.Item item5 = fPHeapMax1.max();
        fPHeapMax1.imprime();
        fPHeapMax1.constroi();
        ds.FPHeapMax fPHeapMax9 = new ds.FPHeapMax((int) '#');
        fPHeapMax9.imprime();
        ds.Item item11 = fPHeapMax9.max();
        ds.Item item12 = null;
        ds.Item[] itemArray13 = new ds.Item[] { item12 };
        fPHeapMax9.copia(itemArray13);
        fPHeapMax1.copia(itemArray13);
        fPHeapMax1.constroi();
        // The following exception was thrown during execution in test generation
        try {
            ds.Item item17 = fPHeapMax1.retiraMax();
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: heap vazio");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(item3);
        org.junit.Assert.assertNull(item5);
        org.junit.Assert.assertNull(item11);
        org.junit.Assert.assertNotNull(itemArray13);
    }

    @Test
    public void test476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test476");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) '#');
        fPHeapMax1.imprime();
        fPHeapMax1.constroi();
        fPHeapMax1.constroi();
        fPHeapMax1.imprime();
        ds.Item item6 = null;
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMax1.insere(item6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test477");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((-1));
        java.lang.Class<?> wildcardClass2 = fPHeapMax1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test478");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) '#');
        fPHeapMax1.imprime();
        fPHeapMax1.constroi();
        fPHeapMax1.constroi();
        fPHeapMax1.imprime();
        fPHeapMax1.refaz((int) (byte) 1, 1);
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMax1.refaz((-1), (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test479");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) '#');
        fPHeapMax1.imprime();
        fPHeapMax1.constroi();
        fPHeapMax1.constroi();
        fPHeapMax1.imprime();
        fPHeapMax1.refaz((int) (byte) 1, 1);
        ds.FPHeapMax fPHeapMax10 = new ds.FPHeapMax((int) (short) 10);
        fPHeapMax10.constroi();
        ds.Item item12 = fPHeapMax10.max();
        fPHeapMax10.constroi();
        ds.Item item14 = fPHeapMax10.max();
        ds.FPHeapMax fPHeapMax16 = new ds.FPHeapMax((int) '#');
        fPHeapMax16.imprime();
        ds.Item item18 = fPHeapMax16.max();
        ds.Item item19 = null;
        ds.Item[] itemArray20 = new ds.Item[] { item19 };
        fPHeapMax16.copia(itemArray20);
        fPHeapMax10.copia(itemArray20);
        fPHeapMax1.copia(itemArray20);
        ds.Item item24 = fPHeapMax1.max();
        ds.FPHeapMax fPHeapMax26 = new ds.FPHeapMax((int) '#');
        fPHeapMax26.imprime();
        fPHeapMax26.constroi();
        fPHeapMax26.constroi();
        fPHeapMax26.imprime();
        fPHeapMax26.refaz((int) (byte) 1, 1);
        ds.FPHeapMax fPHeapMax35 = new ds.FPHeapMax((int) (short) 10);
        fPHeapMax35.constroi();
        ds.Item item37 = fPHeapMax35.max();
        fPHeapMax35.constroi();
        ds.Item item39 = fPHeapMax35.max();
        ds.FPHeapMax fPHeapMax41 = new ds.FPHeapMax((int) '#');
        fPHeapMax41.imprime();
        ds.Item item43 = fPHeapMax41.max();
        ds.Item item44 = null;
        ds.Item[] itemArray45 = new ds.Item[] { item44 };
        fPHeapMax41.copia(itemArray45);
        fPHeapMax35.copia(itemArray45);
        fPHeapMax26.copia(itemArray45);
        fPHeapMax1.copia(itemArray45);
        fPHeapMax1.imprime();
        ds.FPHeapMax fPHeapMax53 = new ds.FPHeapMax(100);
        ds.Item[] itemArray54 = new ds.Item[] {};
        fPHeapMax53.copia(itemArray54);
        ds.FPHeapMax fPHeapMax57 = new ds.FPHeapMax((int) (short) 10);
        fPHeapMax57.constroi();
        ds.Item item59 = fPHeapMax57.max();
        fPHeapMax57.constroi();
        ds.Item item61 = fPHeapMax57.max();
        fPHeapMax57.imprime();
        ds.Item[] itemArray63 = new ds.Item[] {};
        fPHeapMax57.copia(itemArray63);
        fPHeapMax57.constroi();
        ds.FPHeapMax fPHeapMax67 = new ds.FPHeapMax(100);
        ds.Item[] itemArray68 = new ds.Item[] {};
        fPHeapMax67.copia(itemArray68);
        fPHeapMax57.copia(itemArray68);
        fPHeapMax53.copia(itemArray68);
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMax1.aumentaChave((int) (short) 10, (java.lang.Object) itemArray68);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(item12);
        org.junit.Assert.assertNull(item14);
        org.junit.Assert.assertNull(item18);
        org.junit.Assert.assertNotNull(itemArray20);
        org.junit.Assert.assertNull(item24);
        org.junit.Assert.assertNull(item37);
        org.junit.Assert.assertNull(item39);
        org.junit.Assert.assertNull(item43);
        org.junit.Assert.assertNotNull(itemArray45);
        org.junit.Assert.assertNotNull(itemArray54);
        org.junit.Assert.assertNull(item59);
        org.junit.Assert.assertNull(item61);
        org.junit.Assert.assertNotNull(itemArray63);
        org.junit.Assert.assertNotNull(itemArray68);
    }

    @Test
    public void test480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test480");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (short) 10);
        fPHeapMax1.constroi();
        ds.Item item3 = fPHeapMax1.max();
        fPHeapMax1.constroi();
        ds.Item item5 = fPHeapMax1.max();
        fPHeapMax1.imprime();
        fPHeapMax1.constroi();
        fPHeapMax1.constroi();
        ds.FPHeapMax fPHeapMax10 = new ds.FPHeapMax((int) (short) 10);
        fPHeapMax10.constroi();
        ds.Item item12 = fPHeapMax10.max();
        fPHeapMax10.imprime();
        fPHeapMax10.refaz(10, (int) (byte) 1);
        ds.FPHeapMax fPHeapMax18 = new ds.FPHeapMax(100);
        ds.Item[] itemArray19 = new ds.Item[] {};
        fPHeapMax18.copia(itemArray19);
        fPHeapMax10.copia(itemArray19);
        fPHeapMax1.copia(itemArray19);
        ds.FPHeapMax fPHeapMax25 = new ds.FPHeapMax((int) (short) 10);
        fPHeapMax25.constroi();
        ds.Item item27 = fPHeapMax25.max();
        fPHeapMax25.constroi();
        ds.Item item29 = fPHeapMax25.max();
        ds.FPHeapMax fPHeapMax31 = new ds.FPHeapMax((int) (short) 10);
        fPHeapMax31.constroi();
        ds.FPHeapMax fPHeapMax34 = new ds.FPHeapMax((int) (short) 10);
        fPHeapMax34.constroi();
        ds.Item item36 = fPHeapMax34.max();
        fPHeapMax34.constroi();
        ds.Item item38 = fPHeapMax34.max();
        fPHeapMax34.imprime();
        ds.Item[] itemArray40 = new ds.Item[] {};
        fPHeapMax34.copia(itemArray40);
        fPHeapMax31.copia(itemArray40);
        fPHeapMax25.copia(itemArray40);
        fPHeapMax25.constroi();
        fPHeapMax25.constroi();
        fPHeapMax25.imprime();
        ds.Item item47 = fPHeapMax25.max();
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMax1.aumentaChave((int) (byte) 1, (java.lang.Object) item47);
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: chaveNova com valor null");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(item3);
        org.junit.Assert.assertNull(item5);
        org.junit.Assert.assertNull(item12);
        org.junit.Assert.assertNotNull(itemArray19);
        org.junit.Assert.assertNull(item27);
        org.junit.Assert.assertNull(item29);
        org.junit.Assert.assertNull(item36);
        org.junit.Assert.assertNull(item38);
        org.junit.Assert.assertNotNull(itemArray40);
        org.junit.Assert.assertNull(item47);
    }

    @Test
    public void test481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test481");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) '#');
        fPHeapMax1.constroi();
        ds.Item item3 = fPHeapMax1.max();
        ds.FPHeapMax fPHeapMax5 = new ds.FPHeapMax((int) (short) 10);
        fPHeapMax5.refaz((int) (short) 1, 0);
        fPHeapMax5.imprime();
        fPHeapMax5.imprime();
        ds.FPHeapMax fPHeapMax12 = new ds.FPHeapMax((int) '#');
        fPHeapMax12.imprime();
        fPHeapMax12.constroi();
        fPHeapMax12.constroi();
        fPHeapMax12.imprime();
        fPHeapMax12.refaz((int) (byte) 1, 1);
        ds.FPHeapMax fPHeapMax21 = new ds.FPHeapMax((int) (short) 10);
        fPHeapMax21.constroi();
        ds.Item item23 = fPHeapMax21.max();
        fPHeapMax21.constroi();
        ds.Item item25 = fPHeapMax21.max();
        ds.FPHeapMax fPHeapMax27 = new ds.FPHeapMax((int) '#');
        fPHeapMax27.imprime();
        ds.Item item29 = fPHeapMax27.max();
        ds.Item item30 = null;
        ds.Item[] itemArray31 = new ds.Item[] { item30 };
        fPHeapMax27.copia(itemArray31);
        fPHeapMax21.copia(itemArray31);
        fPHeapMax12.copia(itemArray31);
        fPHeapMax5.copia(itemArray31);
        fPHeapMax5.constroi();
        ds.FPHeapMax fPHeapMax38 = new ds.FPHeapMax((int) (short) 10);
        fPHeapMax38.constroi();
        ds.Item item40 = fPHeapMax38.max();
        fPHeapMax38.constroi();
        fPHeapMax38.constroi();
        fPHeapMax38.refaz((int) (short) 1, 1);
        ds.FPHeapMax fPHeapMax47 = new ds.FPHeapMax((int) '#');
        fPHeapMax47.constroi();
        ds.FPHeapMax fPHeapMax50 = new ds.FPHeapMax((int) (short) 10);
        fPHeapMax50.constroi();
        ds.Item item52 = fPHeapMax50.max();
        fPHeapMax50.constroi();
        fPHeapMax50.constroi();
        ds.Item item55 = fPHeapMax50.max();
        ds.FPHeapMax fPHeapMax57 = new ds.FPHeapMax((int) '#');
        fPHeapMax57.imprime();
        fPHeapMax57.constroi();
        fPHeapMax57.constroi();
        ds.FPHeapMax fPHeapMax62 = new ds.FPHeapMax((int) '#');
        fPHeapMax62.imprime();
        ds.Item item64 = fPHeapMax62.max();
        ds.Item item65 = null;
        ds.Item[] itemArray66 = new ds.Item[] { item65 };
        fPHeapMax62.copia(itemArray66);
        fPHeapMax57.copia(itemArray66);
        fPHeapMax50.copia(itemArray66);
        fPHeapMax47.copia(itemArray66);
        fPHeapMax38.copia(itemArray66);
        fPHeapMax5.copia(itemArray66);
        fPHeapMax1.copia(itemArray66);
        org.junit.Assert.assertNull(item3);
        org.junit.Assert.assertNull(item23);
        org.junit.Assert.assertNull(item25);
        org.junit.Assert.assertNull(item29);
        org.junit.Assert.assertNotNull(itemArray31);
        org.junit.Assert.assertNull(item40);
        org.junit.Assert.assertNull(item52);
        org.junit.Assert.assertNull(item55);
        org.junit.Assert.assertNull(item64);
        org.junit.Assert.assertNotNull(itemArray66);
    }

    @Test
    public void test482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test482");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (short) 10);
        fPHeapMax1.constroi();
        ds.Item item3 = fPHeapMax1.max();
        fPHeapMax1.constroi();
        ds.Item item5 = fPHeapMax1.max();
        fPHeapMax1.imprime();
        ds.Item[] itemArray7 = new ds.Item[] {};
        fPHeapMax1.copia(itemArray7);
        fPHeapMax1.constroi();
        ds.Item item10 = fPHeapMax1.max();
        fPHeapMax1.refaz(0, (int) (byte) -1);
        // The following exception was thrown during execution in test generation
        try {
            ds.Item item14 = fPHeapMax1.retiraMax();
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: heap vazio");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(item3);
        org.junit.Assert.assertNull(item5);
        org.junit.Assert.assertNotNull(itemArray7);
        org.junit.Assert.assertNull(item10);
    }

    @Test
    public void test483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test483");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (byte) 100);
        ds.FPHeapMax fPHeapMax3 = new ds.FPHeapMax(1);
        ds.FPHeapMax fPHeapMax5 = new ds.FPHeapMax((int) (short) 10);
        fPHeapMax5.constroi();
        ds.Item item7 = fPHeapMax5.max();
        fPHeapMax5.constroi();
        ds.Item item9 = fPHeapMax5.max();
        fPHeapMax5.imprime();
        ds.Item[] itemArray11 = new ds.Item[] {};
        fPHeapMax5.copia(itemArray11);
        fPHeapMax3.copia(itemArray11);
        fPHeapMax1.copia(itemArray11);
        ds.FPHeapMax fPHeapMax16 = new ds.FPHeapMax((int) '#');
        fPHeapMax16.imprime();
        fPHeapMax16.constroi();
        fPHeapMax16.constroi();
        fPHeapMax16.imprime();
        ds.FPHeapMax fPHeapMax22 = new ds.FPHeapMax((int) (byte) 100);
        ds.FPHeapMax fPHeapMax24 = new ds.FPHeapMax(1);
        ds.FPHeapMax fPHeapMax26 = new ds.FPHeapMax((int) (short) 10);
        fPHeapMax26.constroi();
        ds.Item item28 = fPHeapMax26.max();
        fPHeapMax26.constroi();
        ds.Item item30 = fPHeapMax26.max();
        fPHeapMax26.imprime();
        ds.Item[] itemArray32 = new ds.Item[] {};
        fPHeapMax26.copia(itemArray32);
        fPHeapMax24.copia(itemArray32);
        fPHeapMax22.copia(itemArray32);
        fPHeapMax16.copia(itemArray32);
        fPHeapMax1.copia(itemArray32);
        ds.Item item38 = fPHeapMax1.max();
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMax1.refaz((int) (byte) -1, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(item7);
        org.junit.Assert.assertNull(item9);
        org.junit.Assert.assertNotNull(itemArray11);
        org.junit.Assert.assertNull(item28);
        org.junit.Assert.assertNull(item30);
        org.junit.Assert.assertNotNull(itemArray32);
        org.junit.Assert.assertNull(item38);
    }

    @Test
    public void test484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test484");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (short) 10);
        fPHeapMax1.constroi();
        ds.Item item3 = fPHeapMax1.max();
        fPHeapMax1.constroi();
        ds.Item item5 = fPHeapMax1.max();
        fPHeapMax1.imprime();
        fPHeapMax1.constroi();
        fPHeapMax1.constroi();
        fPHeapMax1.refaz((int) (short) 10, (-1));
        fPHeapMax1.imprime();
        ds.Item item13 = fPHeapMax1.max();
        ds.FPHeapMax fPHeapMax16 = new ds.FPHeapMax((int) (short) 10);
        fPHeapMax16.refaz((int) (short) 1, 0);
        fPHeapMax16.constroi();
        ds.Item item21 = fPHeapMax16.max();
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMax1.aumentaChave(10, (java.lang.Object) item21);
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: chaveNova com valor null");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(item3);
        org.junit.Assert.assertNull(item5);
        org.junit.Assert.assertNull(item13);
        org.junit.Assert.assertNull(item21);
    }

    @Test
    public void test485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test485");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) ' ');
        fPHeapMax1.imprime();
    }

    @Test
    public void test486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test486");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (short) 10);
        fPHeapMax1.constroi();
        ds.FPHeapMax fPHeapMax4 = new ds.FPHeapMax((int) (short) 10);
        fPHeapMax4.constroi();
        ds.Item item6 = fPHeapMax4.max();
        fPHeapMax4.constroi();
        ds.Item item8 = fPHeapMax4.max();
        fPHeapMax4.imprime();
        ds.Item[] itemArray10 = new ds.Item[] {};
        fPHeapMax4.copia(itemArray10);
        fPHeapMax1.copia(itemArray10);
        fPHeapMax1.imprime();
        fPHeapMax1.constroi();
        ds.Item item15 = null;
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMax1.insere(item15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(item6);
        org.junit.Assert.assertNull(item8);
        org.junit.Assert.assertNotNull(itemArray10);
    }

    @Test
    public void test487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test487");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (short) 10);
        fPHeapMax1.constroi();
        ds.Item item3 = fPHeapMax1.max();
        fPHeapMax1.imprime();
        fPHeapMax1.refaz(10, (int) (byte) 1);
        ds.FPHeapMax fPHeapMax9 = new ds.FPHeapMax(100);
        ds.Item[] itemArray10 = new ds.Item[] {};
        fPHeapMax9.copia(itemArray10);
        fPHeapMax1.copia(itemArray10);
        ds.Item item13 = fPHeapMax1.max();
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMax1.refaz((-1), (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(item3);
        org.junit.Assert.assertNotNull(itemArray10);
        org.junit.Assert.assertNull(item13);
    }

    @Test
    public void test488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test488");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax(0);
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMax1.refaz((int) ' ', (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 32");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test489");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax(0);
        ds.FPHeapMax fPHeapMax4 = new ds.FPHeapMax((int) (short) 10);
        fPHeapMax4.refaz((int) (short) 1, 0);
        fPHeapMax4.imprime();
        fPHeapMax4.imprime();
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMax1.aumentaChave((int) (byte) -1, (java.lang.Object) fPHeapMax4);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test490");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (short) 10);
        fPHeapMax1.constroi();
        ds.Item item3 = fPHeapMax1.max();
        fPHeapMax1.constroi();
        fPHeapMax1.imprime();
        fPHeapMax1.constroi();
        ds.Item item7 = fPHeapMax1.max();
        ds.Item item8 = null;
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMax1.insere(item8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(item3);
        org.junit.Assert.assertNull(item7);
    }

    @Test
    public void test491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test491");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (byte) 100);
        fPHeapMax1.imprime();
        fPHeapMax1.imprime();
        fPHeapMax1.constroi();
        ds.Item item5 = fPHeapMax1.max();
        ds.FPHeapMax fPHeapMax7 = new ds.FPHeapMax(100);
        ds.Item[] itemArray8 = new ds.Item[] {};
        fPHeapMax7.copia(itemArray8);
        ds.FPHeapMax fPHeapMax11 = new ds.FPHeapMax((int) (short) 10);
        fPHeapMax11.constroi();
        ds.Item item13 = fPHeapMax11.max();
        fPHeapMax11.constroi();
        ds.Item item15 = fPHeapMax11.max();
        fPHeapMax11.imprime();
        ds.Item[] itemArray17 = new ds.Item[] {};
        fPHeapMax11.copia(itemArray17);
        fPHeapMax11.constroi();
        ds.FPHeapMax fPHeapMax21 = new ds.FPHeapMax(100);
        ds.Item[] itemArray22 = new ds.Item[] {};
        fPHeapMax21.copia(itemArray22);
        fPHeapMax11.copia(itemArray22);
        fPHeapMax7.copia(itemArray22);
        fPHeapMax1.copia(itemArray22);
        java.lang.Class<?> wildcardClass27 = itemArray22.getClass();
        org.junit.Assert.assertNull(item5);
        org.junit.Assert.assertNotNull(itemArray8);
        org.junit.Assert.assertNull(item13);
        org.junit.Assert.assertNull(item15);
        org.junit.Assert.assertNotNull(itemArray17);
        org.junit.Assert.assertNotNull(itemArray22);
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test492");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) '#');
        fPHeapMax1.imprime();
        fPHeapMax1.constroi();
        fPHeapMax1.constroi();
        fPHeapMax1.imprime();
        fPHeapMax1.constroi();
        fPHeapMax1.constroi();
        ds.FPHeapMax fPHeapMax9 = new ds.FPHeapMax((int) (short) 10);
        fPHeapMax9.constroi();
        ds.Item item11 = fPHeapMax9.max();
        fPHeapMax9.constroi();
        ds.Item item13 = fPHeapMax9.max();
        fPHeapMax9.imprime();
        fPHeapMax9.constroi();
        fPHeapMax9.constroi();
        ds.FPHeapMax fPHeapMax18 = new ds.FPHeapMax((int) (short) 10);
        fPHeapMax18.constroi();
        ds.Item item20 = fPHeapMax18.max();
        fPHeapMax18.imprime();
        fPHeapMax18.refaz(10, (int) (byte) 1);
        ds.FPHeapMax fPHeapMax26 = new ds.FPHeapMax(100);
        ds.Item[] itemArray27 = new ds.Item[] {};
        fPHeapMax26.copia(itemArray27);
        fPHeapMax18.copia(itemArray27);
        fPHeapMax9.copia(itemArray27);
        fPHeapMax1.copia(itemArray27);
        fPHeapMax1.imprime();
        fPHeapMax1.imprime();
        ds.Item item34 = fPHeapMax1.max();
        fPHeapMax1.constroi();
        fPHeapMax1.imprime();
        java.lang.Class<?> wildcardClass37 = fPHeapMax1.getClass();
        org.junit.Assert.assertNull(item11);
        org.junit.Assert.assertNull(item13);
        org.junit.Assert.assertNull(item20);
        org.junit.Assert.assertNotNull(itemArray27);
        org.junit.Assert.assertNull(item34);
        org.junit.Assert.assertNotNull(wildcardClass37);
    }

    @Test
    public void test493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test493");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (short) 10);
        fPHeapMax1.constroi();
        ds.Item item3 = fPHeapMax1.max();
        fPHeapMax1.constroi();
        fPHeapMax1.constroi();
        ds.FPHeapMax fPHeapMax7 = new ds.FPHeapMax((int) (short) 10);
        fPHeapMax7.constroi();
        ds.Item item9 = fPHeapMax7.max();
        fPHeapMax7.imprime();
        fPHeapMax7.refaz(10, (int) (byte) 1);
        ds.FPHeapMax fPHeapMax15 = new ds.FPHeapMax(100);
        ds.Item[] itemArray16 = new ds.Item[] {};
        fPHeapMax15.copia(itemArray16);
        fPHeapMax7.copia(itemArray16);
        fPHeapMax1.copia(itemArray16);
        ds.Item item20 = fPHeapMax1.max();
        java.lang.Class<?> wildcardClass21 = fPHeapMax1.getClass();
        org.junit.Assert.assertNull(item3);
        org.junit.Assert.assertNull(item9);
        org.junit.Assert.assertNotNull(itemArray16);
        org.junit.Assert.assertNull(item20);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test494");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (short) 10);
        fPHeapMax1.refaz((int) (short) 1, 0);
        ds.Item item5 = fPHeapMax1.max();
        ds.FPHeapMax fPHeapMax7 = new ds.FPHeapMax((int) (byte) 100);
        ds.FPHeapMax fPHeapMax9 = new ds.FPHeapMax(1);
        ds.FPHeapMax fPHeapMax11 = new ds.FPHeapMax((int) (short) 10);
        fPHeapMax11.constroi();
        ds.Item item13 = fPHeapMax11.max();
        fPHeapMax11.constroi();
        ds.Item item15 = fPHeapMax11.max();
        fPHeapMax11.imprime();
        ds.Item[] itemArray17 = new ds.Item[] {};
        fPHeapMax11.copia(itemArray17);
        fPHeapMax9.copia(itemArray17);
        fPHeapMax7.copia(itemArray17);
        fPHeapMax1.copia(itemArray17);
        // The following exception was thrown during execution in test generation
        try {
            ds.Item item22 = fPHeapMax1.retiraMax();
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: heap vazio");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(item5);
        org.junit.Assert.assertNull(item13);
        org.junit.Assert.assertNull(item15);
        org.junit.Assert.assertNotNull(itemArray17);
    }

    @Test
    public void test495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test495");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (short) 10);
        fPHeapMax1.refaz((int) (short) 1, 0);
        fPHeapMax1.imprime();
        fPHeapMax1.imprime();
        ds.FPHeapMax fPHeapMax8 = new ds.FPHeapMax((int) (short) 10);
        fPHeapMax8.constroi();
        ds.Item item10 = fPHeapMax8.max();
        fPHeapMax8.constroi();
        ds.Item item12 = fPHeapMax8.max();
        fPHeapMax8.imprime();
        ds.Item item14 = fPHeapMax8.max();
        ds.FPHeapMax fPHeapMax16 = new ds.FPHeapMax(10);
        ds.FPHeapMax fPHeapMax18 = new ds.FPHeapMax((int) '#');
        fPHeapMax18.imprime();
        ds.Item item20 = fPHeapMax18.max();
        ds.Item item21 = null;
        ds.Item[] itemArray22 = new ds.Item[] { item21 };
        fPHeapMax18.copia(itemArray22);
        ds.Item item24 = fPHeapMax18.max();
        ds.FPHeapMax fPHeapMax26 = new ds.FPHeapMax((int) (byte) 10);
        fPHeapMax26.imprime();
        ds.FPHeapMax fPHeapMax29 = new ds.FPHeapMax(100);
        ds.Item[] itemArray30 = new ds.Item[] {};
        fPHeapMax29.copia(itemArray30);
        fPHeapMax26.copia(itemArray30);
        ds.FPHeapMax fPHeapMax34 = new ds.FPHeapMax(100);
        ds.Item[] itemArray35 = new ds.Item[] {};
        fPHeapMax34.copia(itemArray35);
        ds.FPHeapMax fPHeapMax38 = new ds.FPHeapMax((int) (short) 10);
        fPHeapMax38.constroi();
        ds.Item item40 = fPHeapMax38.max();
        fPHeapMax38.constroi();
        ds.Item item42 = fPHeapMax38.max();
        fPHeapMax38.imprime();
        ds.Item[] itemArray44 = new ds.Item[] {};
        fPHeapMax38.copia(itemArray44);
        fPHeapMax38.constroi();
        ds.FPHeapMax fPHeapMax48 = new ds.FPHeapMax(100);
        ds.Item[] itemArray49 = new ds.Item[] {};
        fPHeapMax48.copia(itemArray49);
        fPHeapMax38.copia(itemArray49);
        fPHeapMax34.copia(itemArray49);
        fPHeapMax26.copia(itemArray49);
        fPHeapMax18.copia(itemArray49);
        fPHeapMax16.copia(itemArray49);
        ds.FPHeapMax fPHeapMax57 = new ds.FPHeapMax((int) (short) 10);
        fPHeapMax57.constroi();
        ds.Item item59 = fPHeapMax57.max();
        fPHeapMax57.constroi();
        ds.Item item61 = fPHeapMax57.max();
        fPHeapMax57.imprime();
        fPHeapMax57.constroi();
        ds.FPHeapMax fPHeapMax65 = new ds.FPHeapMax((int) '#');
        fPHeapMax65.imprime();
        ds.Item item67 = fPHeapMax65.max();
        ds.Item item68 = null;
        ds.Item[] itemArray69 = new ds.Item[] { item68 };
        fPHeapMax65.copia(itemArray69);
        fPHeapMax57.copia(itemArray69);
        fPHeapMax16.copia(itemArray69);
        fPHeapMax8.copia(itemArray69);
        fPHeapMax1.copia(itemArray69);
        org.junit.Assert.assertNull(item10);
        org.junit.Assert.assertNull(item12);
        org.junit.Assert.assertNull(item14);
        org.junit.Assert.assertNull(item20);
        org.junit.Assert.assertNotNull(itemArray22);
        org.junit.Assert.assertNull(item24);
        org.junit.Assert.assertNotNull(itemArray30);
        org.junit.Assert.assertNotNull(itemArray35);
        org.junit.Assert.assertNull(item40);
        org.junit.Assert.assertNull(item42);
        org.junit.Assert.assertNotNull(itemArray44);
        org.junit.Assert.assertNotNull(itemArray49);
        org.junit.Assert.assertNull(item59);
        org.junit.Assert.assertNull(item61);
        org.junit.Assert.assertNull(item67);
        org.junit.Assert.assertNotNull(itemArray69);
    }

    @Test
    public void test496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test496");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (short) 10);
        fPHeapMax1.constroi();
        ds.Item item3 = fPHeapMax1.max();
        fPHeapMax1.constroi();
        ds.Item item5 = fPHeapMax1.max();
        fPHeapMax1.imprime();
        ds.FPHeapMax fPHeapMax8 = new ds.FPHeapMax((int) '#');
        fPHeapMax8.imprime();
        ds.Item item10 = fPHeapMax8.max();
        ds.Item item11 = null;
        ds.Item[] itemArray12 = new ds.Item[] { item11 };
        fPHeapMax8.copia(itemArray12);
        fPHeapMax1.copia(itemArray12);
        ds.Item item15 = fPHeapMax1.max();
        fPHeapMax1.constroi();
        // The following exception was thrown during execution in test generation
        try {
            ds.Item item17 = fPHeapMax1.retiraMax();
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: heap vazio");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(item3);
        org.junit.Assert.assertNull(item5);
        org.junit.Assert.assertNull(item10);
        org.junit.Assert.assertNotNull(itemArray12);
        org.junit.Assert.assertNull(item15);
    }

    @Test
    public void test497() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test497");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (short) 10);
        fPHeapMax1.constroi();
        ds.Item item3 = fPHeapMax1.max();
        fPHeapMax1.constroi();
        ds.Item item5 = fPHeapMax1.max();
        fPHeapMax1.imprime();
        ds.FPHeapMax fPHeapMax8 = new ds.FPHeapMax((int) (byte) 100);
        ds.FPHeapMax fPHeapMax10 = new ds.FPHeapMax(1);
        ds.FPHeapMax fPHeapMax12 = new ds.FPHeapMax((int) (short) 10);
        fPHeapMax12.constroi();
        ds.Item item14 = fPHeapMax12.max();
        fPHeapMax12.constroi();
        ds.Item item16 = fPHeapMax12.max();
        fPHeapMax12.imprime();
        ds.Item[] itemArray18 = new ds.Item[] {};
        fPHeapMax12.copia(itemArray18);
        fPHeapMax10.copia(itemArray18);
        fPHeapMax8.copia(itemArray18);
        ds.FPHeapMax fPHeapMax23 = new ds.FPHeapMax((int) '#');
        fPHeapMax23.imprime();
        fPHeapMax23.constroi();
        fPHeapMax23.constroi();
        fPHeapMax23.imprime();
        ds.FPHeapMax fPHeapMax29 = new ds.FPHeapMax((int) (byte) 100);
        ds.FPHeapMax fPHeapMax31 = new ds.FPHeapMax(1);
        ds.FPHeapMax fPHeapMax33 = new ds.FPHeapMax((int) (short) 10);
        fPHeapMax33.constroi();
        ds.Item item35 = fPHeapMax33.max();
        fPHeapMax33.constroi();
        ds.Item item37 = fPHeapMax33.max();
        fPHeapMax33.imprime();
        ds.Item[] itemArray39 = new ds.Item[] {};
        fPHeapMax33.copia(itemArray39);
        fPHeapMax31.copia(itemArray39);
        fPHeapMax29.copia(itemArray39);
        fPHeapMax23.copia(itemArray39);
        fPHeapMax8.copia(itemArray39);
        fPHeapMax1.copia(itemArray39);
        ds.FPHeapMax fPHeapMax47 = new ds.FPHeapMax((int) (short) 10);
        fPHeapMax47.constroi();
        ds.Item item49 = fPHeapMax47.max();
        fPHeapMax47.constroi();
        ds.Item item51 = fPHeapMax47.max();
        fPHeapMax47.imprime();
        ds.Item[] itemArray53 = new ds.Item[] {};
        fPHeapMax47.copia(itemArray53);
        fPHeapMax47.constroi();
        ds.FPHeapMax fPHeapMax57 = new ds.FPHeapMax(100);
        ds.Item[] itemArray58 = new ds.Item[] {};
        fPHeapMax57.copia(itemArray58);
        fPHeapMax47.copia(itemArray58);
        fPHeapMax1.copia(itemArray58);
        // The following exception was thrown during execution in test generation
        try {
            ds.Item item62 = fPHeapMax1.retiraMax();
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: heap vazio");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(item3);
        org.junit.Assert.assertNull(item5);
        org.junit.Assert.assertNull(item14);
        org.junit.Assert.assertNull(item16);
        org.junit.Assert.assertNotNull(itemArray18);
        org.junit.Assert.assertNull(item35);
        org.junit.Assert.assertNull(item37);
        org.junit.Assert.assertNotNull(itemArray39);
        org.junit.Assert.assertNull(item49);
        org.junit.Assert.assertNull(item51);
        org.junit.Assert.assertNotNull(itemArray53);
        org.junit.Assert.assertNotNull(itemArray58);
    }

    @Test
    public void test498() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test498");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax(1);
        fPHeapMax1.imprime();
        ds.FPHeapMax fPHeapMax5 = new ds.FPHeapMax((int) '#');
        fPHeapMax5.imprime();
        fPHeapMax5.constroi();
        fPHeapMax5.constroi();
        fPHeapMax5.imprime();
        fPHeapMax5.refaz((int) (byte) 1, 1);
        ds.FPHeapMax fPHeapMax14 = new ds.FPHeapMax((int) (short) 10);
        fPHeapMax14.constroi();
        ds.Item item16 = fPHeapMax14.max();
        fPHeapMax14.constroi();
        ds.Item item18 = fPHeapMax14.max();
        ds.FPHeapMax fPHeapMax20 = new ds.FPHeapMax((int) '#');
        fPHeapMax20.imprime();
        ds.Item item22 = fPHeapMax20.max();
        ds.Item item23 = null;
        ds.Item[] itemArray24 = new ds.Item[] { item23 };
        fPHeapMax20.copia(itemArray24);
        fPHeapMax14.copia(itemArray24);
        fPHeapMax5.copia(itemArray24);
        ds.FPHeapMax fPHeapMax29 = new ds.FPHeapMax((int) (short) 10);
        fPHeapMax29.constroi();
        ds.Item item31 = fPHeapMax29.max();
        fPHeapMax29.constroi();
        ds.Item item33 = fPHeapMax29.max();
        fPHeapMax29.imprime();
        ds.FPHeapMax fPHeapMax36 = new ds.FPHeapMax((int) '#');
        fPHeapMax36.imprime();
        ds.Item item38 = fPHeapMax36.max();
        ds.Item item39 = null;
        ds.Item[] itemArray40 = new ds.Item[] { item39 };
        fPHeapMax36.copia(itemArray40);
        fPHeapMax29.copia(itemArray40);
        fPHeapMax5.copia(itemArray40);
        ds.Item item44 = fPHeapMax5.max();
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMax1.aumentaChave((int) '4', (java.lang.Object) item44);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 52");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(item16);
        org.junit.Assert.assertNull(item18);
        org.junit.Assert.assertNull(item22);
        org.junit.Assert.assertNotNull(itemArray24);
        org.junit.Assert.assertNull(item31);
        org.junit.Assert.assertNull(item33);
        org.junit.Assert.assertNull(item38);
        org.junit.Assert.assertNotNull(itemArray40);
        org.junit.Assert.assertNull(item44);
    }

    @Test
    public void test499() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test499");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (short) 10);
        fPHeapMax1.constroi();
        ds.Item item3 = fPHeapMax1.max();
        fPHeapMax1.constroi();
        ds.Item item5 = fPHeapMax1.max();
        ds.FPHeapMax fPHeapMax7 = new ds.FPHeapMax((int) '#');
        fPHeapMax7.imprime();
        ds.Item item9 = fPHeapMax7.max();
        ds.Item item10 = null;
        ds.Item[] itemArray11 = new ds.Item[] { item10 };
        fPHeapMax7.copia(itemArray11);
        fPHeapMax1.copia(itemArray11);
        ds.FPHeapMax fPHeapMax15 = new ds.FPHeapMax((int) (byte) 100);
        fPHeapMax15.imprime();
        ds.FPHeapMax fPHeapMax18 = new ds.FPHeapMax(1);
        ds.FPHeapMax fPHeapMax20 = new ds.FPHeapMax((int) (short) 10);
        fPHeapMax20.constroi();
        ds.Item item22 = fPHeapMax20.max();
        fPHeapMax20.constroi();
        ds.Item item24 = fPHeapMax20.max();
        fPHeapMax20.imprime();
        ds.Item[] itemArray26 = new ds.Item[] {};
        fPHeapMax20.copia(itemArray26);
        fPHeapMax18.copia(itemArray26);
        fPHeapMax15.copia(itemArray26);
        ds.FPHeapMax fPHeapMax31 = new ds.FPHeapMax(100);
        ds.Item[] itemArray32 = new ds.Item[] {};
        fPHeapMax31.copia(itemArray32);
        fPHeapMax15.copia(itemArray32);
        fPHeapMax1.copia(itemArray32);
        ds.Item item36 = fPHeapMax1.max();
        org.junit.Assert.assertNull(item3);
        org.junit.Assert.assertNull(item5);
        org.junit.Assert.assertNull(item9);
        org.junit.Assert.assertNotNull(itemArray11);
        org.junit.Assert.assertNull(item22);
        org.junit.Assert.assertNull(item24);
        org.junit.Assert.assertNotNull(itemArray26);
        org.junit.Assert.assertNotNull(itemArray32);
        org.junit.Assert.assertNull(item36);
    }

    @Test
    public void test500() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test500");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) '#');
        fPHeapMax1.imprime();
        fPHeapMax1.constroi();
        fPHeapMax1.constroi();
        fPHeapMax1.imprime();
        fPHeapMax1.refaz((int) (byte) 1, 1);
        ds.FPHeapMax fPHeapMax10 = new ds.FPHeapMax((int) (short) 10);
        fPHeapMax10.constroi();
        ds.Item item12 = fPHeapMax10.max();
        fPHeapMax10.constroi();
        ds.Item item14 = fPHeapMax10.max();
        ds.FPHeapMax fPHeapMax16 = new ds.FPHeapMax((int) '#');
        fPHeapMax16.imprime();
        ds.Item item18 = fPHeapMax16.max();
        ds.Item item19 = null;
        ds.Item[] itemArray20 = new ds.Item[] { item19 };
        fPHeapMax16.copia(itemArray20);
        fPHeapMax10.copia(itemArray20);
        fPHeapMax1.copia(itemArray20);
        ds.Item item24 = fPHeapMax1.max();
        ds.FPHeapMax fPHeapMax26 = new ds.FPHeapMax((int) '#');
        fPHeapMax26.imprime();
        fPHeapMax26.constroi();
        fPHeapMax26.constroi();
        fPHeapMax26.imprime();
        fPHeapMax26.refaz((int) (byte) 1, 1);
        ds.FPHeapMax fPHeapMax35 = new ds.FPHeapMax((int) (short) 10);
        fPHeapMax35.constroi();
        ds.Item item37 = fPHeapMax35.max();
        fPHeapMax35.constroi();
        ds.Item item39 = fPHeapMax35.max();
        ds.FPHeapMax fPHeapMax41 = new ds.FPHeapMax((int) '#');
        fPHeapMax41.imprime();
        ds.Item item43 = fPHeapMax41.max();
        ds.Item item44 = null;
        ds.Item[] itemArray45 = new ds.Item[] { item44 };
        fPHeapMax41.copia(itemArray45);
        fPHeapMax35.copia(itemArray45);
        fPHeapMax26.copia(itemArray45);
        fPHeapMax1.copia(itemArray45);
        fPHeapMax1.constroi();
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMax1.aumentaChave((int) '#', (java.lang.Object) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(item12);
        org.junit.Assert.assertNull(item14);
        org.junit.Assert.assertNull(item18);
        org.junit.Assert.assertNotNull(itemArray20);
        org.junit.Assert.assertNull(item24);
        org.junit.Assert.assertNull(item37);
        org.junit.Assert.assertNull(item39);
        org.junit.Assert.assertNull(item43);
        org.junit.Assert.assertNotNull(itemArray45);
    }
}

