package ds.seed5311;

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
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax(0);
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMax1.aumentaChave((int) '#', (java.lang.Object) 100.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 35");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test002");
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
    public void test003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test003");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax(0);
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMax1.refaz(10, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 10");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test004");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax(0);
        fPHeapMax1.imprime();
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMax1.refaz((int) (byte) -1, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test005");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax(0);
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
    public void test006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test006");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax(0);
        fPHeapMax1.imprime();
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMax1.refaz((-1), 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test007");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax(0);
        fPHeapMax1.imprime();
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMax1.refaz((int) '4', (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 52");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test008");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax(0);
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMax1.aumentaChave((int) (short) -1, (java.lang.Object) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test009");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax(0);
        fPHeapMax1.imprime();
        java.lang.Class<?> wildcardClass3 = fPHeapMax1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test010");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax(0);
        java.lang.Object obj3 = null;
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMax1.aumentaChave(1, obj3);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test011");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax(0);
        // The following exception was thrown during execution in test generation
        try {
            ds.Item item2 = fPHeapMax1.max();
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test012");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax(0);
        fPHeapMax1.imprime();
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMax1.aumentaChave((int) '4', (java.lang.Object) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 52");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test013");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax(0);
        fPHeapMax1.imprime();
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMax1.refaz((int) (byte) 1, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test014");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax(0);
        fPHeapMax1.imprime();
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMax1.refaz((int) (byte) 10, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 10");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test015");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax(0);
        fPHeapMax1.imprime();
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMax1.aumentaChave((int) (byte) 100, (java.lang.Object) 10L);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 100");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test016");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax(0);
        fPHeapMax1.imprime();
        fPHeapMax1.constroi();
        // The following exception was thrown during execution in test generation
        try {
            ds.Item item4 = fPHeapMax1.max();
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test017");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax(0);
        fPHeapMax1.imprime();
        ds.Item[] itemArray3 = new ds.Item[] {};
        fPHeapMax1.copia(itemArray3);
        ds.Item item5 = null;
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMax1.insere(item5);
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: heap cheio");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray3);
    }

    @Test
    public void test018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test018");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax(0);
        fPHeapMax1.imprime();
        fPHeapMax1.constroi();
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMax1.aumentaChave(1, (java.lang.Object) "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test019");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (byte) -1);
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMax1.refaz((int) (byte) 0, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 0");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test020");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax(0);
        fPHeapMax1.imprime();
        fPHeapMax1.constroi();
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMax1.refaz((int) (short) 1, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test021");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax(0);
        fPHeapMax1.imprime();
        fPHeapMax1.constroi();
        ds.Item[] itemArray4 = null;
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMax1.copia(itemArray4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test022");
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
    public void test023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test023");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax(0);
        fPHeapMax1.imprime();
        fPHeapMax1.constroi();
        ds.Item item4 = null;
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMax1.insere(item4);
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: heap cheio");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
    }

    @Test
    public void test024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test024");
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
    public void test025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test025");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax(0);
        fPHeapMax1.imprime();
        fPHeapMax1.constroi();
        ds.FPHeapMax fPHeapMax6 = new ds.FPHeapMax(0);
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMax1.aumentaChave((int) (short) 1, (java.lang.Object) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test026");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax(0);
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
    public void test027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test027");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax(0);
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
    public void test028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test028");
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
    public void test029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test029");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax(0);
        fPHeapMax1.imprime();
        fPHeapMax1.constroi();
        fPHeapMax1.imprime();
        ds.FPHeapMax fPHeapMax7 = new ds.FPHeapMax(0);
        ds.Item item8 = null;
        ds.Item[] itemArray9 = new ds.Item[] { item8 };
        fPHeapMax7.copia(itemArray9);
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMax1.aumentaChave((int) '#', (java.lang.Object) itemArray9);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 35");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray9);
    }

    @Test
    public void test030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test030");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) 'a');
        // The following exception was thrown during execution in test generation
        try {
            ds.Item item2 = fPHeapMax1.retiraMax();
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: heap vazio");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
    }

    @Test
    public void test031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test031");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax(0);
        fPHeapMax1.imprime();
        fPHeapMax1.constroi();
        fPHeapMax1.imprime();
        fPHeapMax1.constroi();
        // The following exception was thrown during execution in test generation
        try {
            ds.Item item6 = fPHeapMax1.max();
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test032");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax(0);
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
    public void test033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test033");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax(1);
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMax1.aumentaChave((-1), (java.lang.Object) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test034");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (byte) -1);
        fPHeapMax1.constroi();
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMax1.refaz(100, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 100");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test035");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax(0);
        fPHeapMax1.imprime();
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMax1.aumentaChave((int) (short) -1, (java.lang.Object) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test036");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax(0);
        fPHeapMax1.imprime();
        fPHeapMax1.constroi();
        fPHeapMax1.imprime();
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
    public void test037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test037");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax(0);
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
    public void test038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test038");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (byte) -1);
        fPHeapMax1.constroi();
        fPHeapMax1.imprime();
        ds.Item[] itemArray4 = new ds.Item[] {};
        fPHeapMax1.copia(itemArray4);
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMax1.refaz((int) 'a', 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 97");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray4);
    }

    @Test
    public void test039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test039");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax(0);
        ds.Item item2 = null;
        ds.Item[] itemArray3 = new ds.Item[] { item2 };
        fPHeapMax1.copia(itemArray3);
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMax1.refaz((int) 'a', (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 97");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray3);
    }

    @Test
    public void test040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test040");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax(1);
        java.lang.Class<?> wildcardClass2 = fPHeapMax1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test041");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax(0);
        fPHeapMax1.imprime();
        fPHeapMax1.constroi();
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
    public void test042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test042");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax(0);
        fPHeapMax1.imprime();
        ds.Item[] itemArray3 = new ds.Item[] {};
        fPHeapMax1.copia(itemArray3);
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMax1.refaz((int) (byte) -1, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray3);
    }

    @Test
    public void test043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test043");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax(0);
        fPHeapMax1.imprime();
        ds.Item[] itemArray3 = new ds.Item[] {};
        fPHeapMax1.copia(itemArray3);
        fPHeapMax1.constroi();
        fPHeapMax1.imprime();
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
    public void test044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test044");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (byte) -1);
        fPHeapMax1.constroi();
        fPHeapMax1.constroi();
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMax1.aumentaChave((int) '4', (java.lang.Object) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 52");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test045");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax(0);
        fPHeapMax1.imprime();
        fPHeapMax1.constroi();
        fPHeapMax1.imprime();
        ds.Item item5 = null;
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMax1.insere(item5);
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: heap cheio");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
    }

    @Test
    public void test046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test046");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (byte) -1);
        fPHeapMax1.constroi();
        fPHeapMax1.constroi();
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMax1.refaz((int) '4', (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 52");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test047");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (byte) -1);
        fPHeapMax1.constroi();
        ds.FPHeapMax fPHeapMax4 = new ds.FPHeapMax((int) ' ');
        ds.FPHeapMax fPHeapMax6 = new ds.FPHeapMax(0);
        ds.Item item7 = null;
        ds.Item[] itemArray8 = new ds.Item[] { item7 };
        fPHeapMax6.copia(itemArray8);
        fPHeapMax4.copia(itemArray8);
        fPHeapMax1.copia(itemArray8);
        ds.FPHeapMax fPHeapMax14 = new ds.FPHeapMax((int) 'a');
        java.lang.Class<?> wildcardClass15 = fPHeapMax14.getClass();
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMax1.aumentaChave((int) (byte) 1, (java.lang.Object) wildcardClass15);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray8);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test048");
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
    public void test049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test049");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax(0);
        ds.Item item2 = null;
        ds.Item[] itemArray3 = new ds.Item[] { item2 };
        fPHeapMax1.copia(itemArray3);
        fPHeapMax1.imprime();
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMax1.refaz((-1), (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray3);
    }

    @Test
    public void test050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test050");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax(0);
        ds.Item item2 = null;
        ds.Item[] itemArray3 = new ds.Item[] { item2 };
        fPHeapMax1.copia(itemArray3);
        java.lang.Object obj6 = null;
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMax1.aumentaChave((int) (short) 0, obj6);
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: chaveNova com valor null");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray3);
    }

    @Test
    public void test051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test051");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (byte) 0);
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
    public void test052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test052");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (byte) -1);
        fPHeapMax1.constroi();
        fPHeapMax1.imprime();
        // The following exception was thrown during execution in test generation
        try {
            ds.Item item4 = fPHeapMax1.max();
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test053");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax(0);
        fPHeapMax1.imprime();
        ds.Item[] itemArray3 = new ds.Item[] {};
        fPHeapMax1.copia(itemArray3);
        fPHeapMax1.constroi();
        fPHeapMax1.imprime();
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
    public void test054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test054");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (byte) -1);
        fPHeapMax1.constroi();
        fPHeapMax1.imprime();
        java.lang.Class<?> wildcardClass4 = fPHeapMax1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test055");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax(0);
        ds.Item item2 = null;
        ds.Item[] itemArray3 = new ds.Item[] { item2 };
        fPHeapMax1.copia(itemArray3);
        fPHeapMax1.imprime();
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMax1.refaz(10, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 10");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray3);
    }

    @Test
    public void test056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test056");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax(0);
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMax1.refaz((int) '4', 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 52");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test057");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (byte) -1);
        fPHeapMax1.constroi();
        ds.FPHeapMax fPHeapMax4 = new ds.FPHeapMax((int) ' ');
        ds.FPHeapMax fPHeapMax6 = new ds.FPHeapMax(0);
        ds.Item item7 = null;
        ds.Item[] itemArray8 = new ds.Item[] { item7 };
        fPHeapMax6.copia(itemArray8);
        fPHeapMax4.copia(itemArray8);
        fPHeapMax1.copia(itemArray8);
        // The following exception was thrown during execution in test generation
        try {
            ds.Item item12 = fPHeapMax1.max();
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray8);
    }

    @Test
    public void test058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test058");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax(1);
        ds.FPHeapMax fPHeapMax4 = new ds.FPHeapMax((int) (byte) -1);
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMax1.aumentaChave(100, (java.lang.Object) fPHeapMax4);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 100");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test059");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax(0);
        fPHeapMax1.imprime();
        fPHeapMax1.constroi();
        fPHeapMax1.imprime();
        // The following exception was thrown during execution in test generation
        try {
            ds.Item item5 = fPHeapMax1.retiraMax();
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: heap vazio");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
    }

    @Test
    public void test060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test060");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax(0);
        java.lang.Class<?> wildcardClass2 = fPHeapMax1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test061");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax(0);
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
    public void test062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test062");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (byte) -1);
        fPHeapMax1.constroi();
        fPHeapMax1.constroi();
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMax1.aumentaChave(100, (java.lang.Object) (-1L));
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 100");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test063");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (byte) -1);
        fPHeapMax1.constroi();
        ds.FPHeapMax fPHeapMax4 = new ds.FPHeapMax((int) ' ');
        ds.FPHeapMax fPHeapMax6 = new ds.FPHeapMax(0);
        ds.Item item7 = null;
        ds.Item[] itemArray8 = new ds.Item[] { item7 };
        fPHeapMax6.copia(itemArray8);
        fPHeapMax4.copia(itemArray8);
        fPHeapMax1.copia(itemArray8);
        java.lang.Class<?> wildcardClass12 = itemArray8.getClass();
        org.junit.Assert.assertNotNull(itemArray8);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test064");
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
    public void test065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test065");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (short) 0);
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
    public void test066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test066");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (byte) -1);
        fPHeapMax1.constroi();
        fPHeapMax1.imprime();
        ds.FPHeapMax fPHeapMax5 = new ds.FPHeapMax(0);
        ds.Item item6 = null;
        ds.Item[] itemArray7 = new ds.Item[] { item6 };
        fPHeapMax5.copia(itemArray7);
        fPHeapMax1.copia(itemArray7);
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMax1.refaz(100, 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 100");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray7);
    }

    @Test
    public void test067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test067");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (byte) -1);
        fPHeapMax1.constroi();
        ds.FPHeapMax fPHeapMax4 = new ds.FPHeapMax((int) ' ');
        ds.FPHeapMax fPHeapMax6 = new ds.FPHeapMax(0);
        ds.Item item7 = null;
        ds.Item[] itemArray8 = new ds.Item[] { item7 };
        fPHeapMax6.copia(itemArray8);
        fPHeapMax4.copia(itemArray8);
        fPHeapMax1.copia(itemArray8);
        java.lang.Class<?> wildcardClass12 = fPHeapMax1.getClass();
        org.junit.Assert.assertNotNull(itemArray8);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test068");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax(0);
        ds.Item item2 = null;
        ds.Item[] itemArray3 = new ds.Item[] { item2 };
        fPHeapMax1.copia(itemArray3);
        ds.Item item5 = null;
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMax1.insere(item5);
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: heap cheio");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray3);
    }

    @Test
    public void test069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test069");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax(0);
        fPHeapMax1.imprime();
        ds.Item[] itemArray3 = new ds.Item[] {};
        fPHeapMax1.copia(itemArray3);
        fPHeapMax1.constroi();
        fPHeapMax1.imprime();
        ds.Item[] itemArray7 = new ds.Item[] {};
        fPHeapMax1.copia(itemArray7);
        java.lang.Class<?> wildcardClass9 = fPHeapMax1.getClass();
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertNotNull(itemArray7);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test070");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (byte) -1);
        fPHeapMax1.constroi();
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMax1.refaz(10, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 10");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test071");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax(0);
        fPHeapMax1.imprime();
        fPHeapMax1.constroi();
        fPHeapMax1.imprime();
        fPHeapMax1.constroi();
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
    public void test072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test072");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (byte) -1);
        ds.FPHeapMax fPHeapMax4 = new ds.FPHeapMax(1);
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMax1.aumentaChave((int) (short) 10, (java.lang.Object) fPHeapMax4);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 10");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test073");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) '4');
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
    public void test074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test074");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (byte) -1);
        fPHeapMax1.constroi();
        fPHeapMax1.constroi();
        fPHeapMax1.constroi();
        java.lang.Class<?> wildcardClass5 = fPHeapMax1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test075");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax(0);
        ds.Item item2 = null;
        ds.Item[] itemArray3 = new ds.Item[] { item2 };
        fPHeapMax1.copia(itemArray3);
        fPHeapMax1.imprime();
        ds.FPHeapMax fPHeapMax7 = new ds.FPHeapMax((int) (byte) -1);
        fPHeapMax7.constroi();
        fPHeapMax7.imprime();
        ds.Item[] itemArray10 = new ds.Item[] {};
        fPHeapMax7.copia(itemArray10);
        fPHeapMax1.copia(itemArray10);
        // The following exception was thrown during execution in test generation
        try {
            ds.Item item13 = fPHeapMax1.retiraMax();
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: heap vazio");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertNotNull(itemArray10);
    }

    @Test
    public void test076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test076");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) '4');
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
    public void test077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test077");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (byte) -1);
        fPHeapMax1.constroi();
        fPHeapMax1.imprime();
        ds.Item[] itemArray4 = new ds.Item[] {};
        fPHeapMax1.copia(itemArray4);
        // The following exception was thrown during execution in test generation
        try {
            ds.Item item6 = fPHeapMax1.retiraMax();
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: heap vazio");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray4);
    }

    @Test
    public void test078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test078");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (byte) -1);
        ds.FPHeapMax fPHeapMax4 = new ds.FPHeapMax(0);
        fPHeapMax4.imprime();
        ds.Item[] itemArray6 = new ds.Item[] {};
        fPHeapMax4.copia(itemArray6);
        java.lang.Class<?> wildcardClass8 = fPHeapMax4.getClass();
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMax1.aumentaChave((int) (byte) 100, (java.lang.Object) wildcardClass8);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 100");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray6);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test079");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) '4');
        ds.Item item2 = fPHeapMax1.max();
        fPHeapMax1.constroi();
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
    public void test080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test080");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) '4');
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
    public void test081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test081");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (byte) -1);
        fPHeapMax1.constroi();
        fPHeapMax1.constroi();
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMax1.aumentaChave((int) (short) 100, (java.lang.Object) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 100");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test082");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (byte) -1);
        fPHeapMax1.constroi();
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
    public void test083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test083");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax(0);
        ds.Item item2 = null;
        ds.Item[] itemArray3 = new ds.Item[] { item2 };
        fPHeapMax1.copia(itemArray3);
        fPHeapMax1.imprime();
        ds.FPHeapMax fPHeapMax7 = new ds.FPHeapMax((int) (byte) -1);
        fPHeapMax7.constroi();
        fPHeapMax7.imprime();
        ds.Item[] itemArray10 = new ds.Item[] {};
        fPHeapMax7.copia(itemArray10);
        fPHeapMax1.copia(itemArray10);
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMax1.refaz((int) (byte) -1, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertNotNull(itemArray10);
    }

    @Test
    public void test084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test084");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax(0);
        fPHeapMax1.imprime();
        fPHeapMax1.constroi();
        fPHeapMax1.imprime();
        fPHeapMax1.constroi();
        fPHeapMax1.imprime();
        java.lang.Class<?> wildcardClass7 = fPHeapMax1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test085");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (byte) -1);
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
    public void test086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test086");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax(0);
        fPHeapMax1.imprime();
        fPHeapMax1.constroi();
        fPHeapMax1.imprime();
        fPHeapMax1.imprime();
        // The following exception was thrown during execution in test generation
        try {
            ds.Item item6 = fPHeapMax1.max();
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test087");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax(0);
        fPHeapMax1.imprime();
        ds.Item[] itemArray3 = new ds.Item[] {};
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
    public void test088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test088");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax(0);
        fPHeapMax1.imprime();
        fPHeapMax1.constroi();
        java.lang.Object obj5 = new java.lang.Object();
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMax1.aumentaChave((int) (short) 100, obj5);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 100");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test089");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) '4');
        ds.Item item2 = fPHeapMax1.max();
        fPHeapMax1.constroi();
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMax1.refaz((int) (byte) 100, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 100");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(item2);
    }

    @Test
    public void test090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test090");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax(1);
        fPHeapMax1.constroi();
        ds.FPHeapMax fPHeapMax5 = new ds.FPHeapMax((int) (byte) -1);
        fPHeapMax5.constroi();
        fPHeapMax5.imprime();
        ds.Item[] itemArray8 = new ds.Item[] {};
        fPHeapMax5.copia(itemArray8);
        java.lang.Class<?> wildcardClass10 = fPHeapMax5.getClass();
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMax1.aumentaChave((-1), (java.lang.Object) fPHeapMax5);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray8);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test091");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax(0);
        fPHeapMax1.imprime();
        fPHeapMax1.constroi();
        fPHeapMax1.imprime();
        fPHeapMax1.constroi();
        fPHeapMax1.imprime();
        ds.Item item7 = null;
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMax1.insere(item7);
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: heap cheio");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
    }

    @Test
    public void test092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test092");
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
    public void test093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test093");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (byte) -1);
        fPHeapMax1.constroi();
        fPHeapMax1.imprime();
        ds.FPHeapMax fPHeapMax5 = new ds.FPHeapMax(0);
        ds.Item item6 = null;
        ds.Item[] itemArray7 = new ds.Item[] { item6 };
        fPHeapMax5.copia(itemArray7);
        fPHeapMax1.copia(itemArray7);
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMax1.aumentaChave((int) (short) 10, (java.lang.Object) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 10");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray7);
    }

    @Test
    public void test094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test094");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            ds.Item item2 = fPHeapMax1.retiraMax();
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: heap vazio");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
    }

    @Test
    public void test095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test095");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax(0);
        ds.Item item2 = null;
        ds.Item[] itemArray3 = new ds.Item[] { item2 };
        fPHeapMax1.copia(itemArray3);
        fPHeapMax1.imprime();
        ds.FPHeapMax fPHeapMax7 = new ds.FPHeapMax((int) (byte) -1);
        fPHeapMax7.constroi();
        fPHeapMax7.imprime();
        ds.Item[] itemArray10 = new ds.Item[] {};
        fPHeapMax7.copia(itemArray10);
        fPHeapMax1.copia(itemArray10);
        java.lang.Class<?> wildcardClass13 = itemArray10.getClass();
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertNotNull(itemArray10);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test096");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (byte) -1);
        fPHeapMax1.constroi();
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
    public void test097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test097");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax(0);
        fPHeapMax1.imprime();
        fPHeapMax1.constroi();
        ds.FPHeapMax fPHeapMax5 = new ds.FPHeapMax(0);
        ds.Item item6 = null;
        ds.Item[] itemArray7 = new ds.Item[] { item6 };
        fPHeapMax5.copia(itemArray7);
        fPHeapMax1.copia(itemArray7);
        // The following exception was thrown during execution in test generation
        try {
            ds.Item item10 = fPHeapMax1.max();
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray7);
    }

    @Test
    public void test098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test098");
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
    public void test099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test099");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax(1);
        fPHeapMax1.constroi();
        fPHeapMax1.imprime();
        fPHeapMax1.imprime();
        ds.Item[] itemArray5 = null;
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMax1.copia(itemArray5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test100");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax(0);
        fPHeapMax1.imprime();
        fPHeapMax1.constroi();
        ds.FPHeapMax fPHeapMax5 = new ds.FPHeapMax(0);
        ds.Item item6 = null;
        ds.Item[] itemArray7 = new ds.Item[] { item6 };
        fPHeapMax5.copia(itemArray7);
        fPHeapMax1.copia(itemArray7);
        ds.Item item10 = null;
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMax1.insere(item10);
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: heap cheio");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray7);
    }

    @Test
    public void test101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test101");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (byte) -1);
        fPHeapMax1.constroi();
        fPHeapMax1.constroi();
        fPHeapMax1.constroi();
        ds.FPHeapMax fPHeapMax6 = new ds.FPHeapMax(0);
        fPHeapMax6.imprime();
        fPHeapMax6.constroi();
        ds.FPHeapMax fPHeapMax10 = new ds.FPHeapMax(0);
        ds.Item item11 = null;
        ds.Item[] itemArray12 = new ds.Item[] { item11 };
        fPHeapMax10.copia(itemArray12);
        fPHeapMax6.copia(itemArray12);
        fPHeapMax1.copia(itemArray12);
        // The following exception was thrown during execution in test generation
        try {
            ds.Item item16 = fPHeapMax1.retiraMax();
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: heap vazio");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray12);
    }

    @Test
    public void test102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test102");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (short) 100);
        java.lang.Class<?> wildcardClass2 = fPHeapMax1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test103");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (short) 100);
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
    public void test105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test105");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (byte) -1);
        fPHeapMax1.constroi();
        fPHeapMax1.constroi();
        fPHeapMax1.constroi();
        ds.FPHeapMax fPHeapMax6 = new ds.FPHeapMax(0);
        fPHeapMax6.imprime();
        fPHeapMax6.constroi();
        ds.FPHeapMax fPHeapMax10 = new ds.FPHeapMax(0);
        ds.Item item11 = null;
        ds.Item[] itemArray12 = new ds.Item[] { item11 };
        fPHeapMax10.copia(itemArray12);
        fPHeapMax6.copia(itemArray12);
        fPHeapMax1.copia(itemArray12);
        ds.FPHeapMax fPHeapMax18 = new ds.FPHeapMax(0);
        fPHeapMax18.imprime();
        fPHeapMax18.constroi();
        fPHeapMax18.imprime();
        fPHeapMax18.constroi();
        fPHeapMax18.imprime();
        ds.FPHeapMax fPHeapMax25 = new ds.FPHeapMax(0);
        ds.Item item26 = null;
        ds.Item[] itemArray27 = new ds.Item[] { item26 };
        fPHeapMax25.copia(itemArray27);
        fPHeapMax25.imprime();
        ds.FPHeapMax fPHeapMax31 = new ds.FPHeapMax((int) (byte) -1);
        fPHeapMax31.constroi();
        fPHeapMax31.imprime();
        ds.Item[] itemArray34 = new ds.Item[] {};
        fPHeapMax31.copia(itemArray34);
        fPHeapMax25.copia(itemArray34);
        fPHeapMax18.copia(itemArray34);
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMax1.aumentaChave(0, (java.lang.Object) fPHeapMax18);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 0");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray12);
        org.junit.Assert.assertNotNull(itemArray27);
        org.junit.Assert.assertNotNull(itemArray34);
    }

    @Test
    public void test106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test106");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax(0);
        fPHeapMax1.imprime();
        fPHeapMax1.constroi();
        fPHeapMax1.imprime();
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
        org.junit.Assert.assertNotNull(itemArray7);
    }

    @Test
    public void test107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test107");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax(0);
        fPHeapMax1.imprime();
        ds.Item[] itemArray3 = new ds.Item[] {};
        fPHeapMax1.copia(itemArray3);
        fPHeapMax1.constroi();
        fPHeapMax1.imprime();
        java.lang.Class<?> wildcardClass7 = fPHeapMax1.getClass();
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test108");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (short) 1);
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
    public void test109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test109");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax(0);
        fPHeapMax1.imprime();
        ds.Item[] itemArray3 = new ds.Item[] {};
        fPHeapMax1.copia(itemArray3);
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMax1.aumentaChave((int) (short) 1, (java.lang.Object) 100L);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray3);
    }

    @Test
    public void test110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test110");
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
    public void test111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test111");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (byte) -1);
        fPHeapMax1.constroi();
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMax1.refaz((int) (byte) 1, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test112");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (byte) 0);
        fPHeapMax1.imprime();
        java.lang.Class<?> wildcardClass3 = fPHeapMax1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test113");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax(0);
        fPHeapMax1.imprime();
        ds.Item[] itemArray3 = new ds.Item[] {};
        fPHeapMax1.copia(itemArray3);
        fPHeapMax1.constroi();
        fPHeapMax1.imprime();
        ds.Item[] itemArray7 = new ds.Item[] {};
        fPHeapMax1.copia(itemArray7);
        java.lang.Class<?> wildcardClass9 = itemArray7.getClass();
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertNotNull(itemArray7);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test114");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (byte) -1);
        fPHeapMax1.constroi();
        fPHeapMax1.imprime();
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMax1.refaz(1, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test115");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) 'a');
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
    public void test116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test116");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax(0);
        fPHeapMax1.imprime();
        fPHeapMax1.constroi();
        fPHeapMax1.imprime();
        fPHeapMax1.constroi();
        java.lang.Class<?> wildcardClass6 = fPHeapMax1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test117");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) ' ');
        ds.FPHeapMax fPHeapMax3 = new ds.FPHeapMax(0);
        ds.Item item4 = null;
        ds.Item[] itemArray5 = new ds.Item[] { item4 };
        fPHeapMax3.copia(itemArray5);
        fPHeapMax1.copia(itemArray5);
        fPHeapMax1.imprime();
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMax1.aumentaChave((int) '#', (java.lang.Object) 1L);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 35");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray5);
    }

    @Test
    public void test118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test118");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax(0);
        ds.Item item2 = null;
        ds.Item[] itemArray3 = new ds.Item[] { item2 };
        fPHeapMax1.copia(itemArray3);
        fPHeapMax1.imprime();
        ds.FPHeapMax fPHeapMax7 = new ds.FPHeapMax((int) (byte) -1);
        fPHeapMax7.constroi();
        fPHeapMax7.imprime();
        ds.Item[] itemArray10 = new ds.Item[] {};
        fPHeapMax7.copia(itemArray10);
        fPHeapMax1.copia(itemArray10);
        java.lang.Class<?> wildcardClass13 = fPHeapMax1.getClass();
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertNotNull(itemArray10);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test119");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (byte) -1);
        fPHeapMax1.constroi();
        fPHeapMax1.constroi();
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMax1.refaz((int) (short) 0, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 0");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test120");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (byte) 0);
        ds.FPHeapMax fPHeapMax3 = new ds.FPHeapMax(0);
        fPHeapMax3.imprime();
        ds.Item[] itemArray5 = new ds.Item[] {};
        fPHeapMax3.copia(itemArray5);
        fPHeapMax3.constroi();
        fPHeapMax3.imprime();
        ds.Item[] itemArray9 = new ds.Item[] {};
        fPHeapMax3.copia(itemArray9);
        fPHeapMax1.copia(itemArray9);
        ds.Item item12 = null;
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMax1.insere(item12);
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: heap cheio");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray5);
        org.junit.Assert.assertNotNull(itemArray9);
    }

    @Test
    public void test121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test121");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax(0);
        ds.Item item2 = null;
        ds.Item[] itemArray3 = new ds.Item[] { item2 };
        fPHeapMax1.copia(itemArray3);
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMax1.refaz(10, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 10");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray3);
    }

    @Test
    public void test122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test122");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((-1));
        fPHeapMax1.imprime();
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMax1.refaz((int) (short) -1, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test123");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax(0);
        fPHeapMax1.imprime();
        fPHeapMax1.constroi();
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMax1.aumentaChave((int) (byte) 10, (java.lang.Object) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 10");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test124");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (byte) -1);
        fPHeapMax1.constroi();
        ds.FPHeapMax fPHeapMax4 = new ds.FPHeapMax((int) ' ');
        ds.FPHeapMax fPHeapMax6 = new ds.FPHeapMax(0);
        ds.Item item7 = null;
        ds.Item[] itemArray8 = new ds.Item[] { item7 };
        fPHeapMax6.copia(itemArray8);
        fPHeapMax4.copia(itemArray8);
        fPHeapMax1.copia(itemArray8);
        ds.Item item12 = null;
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMax1.insere(item12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray8);
    }

    @Test
    public void test125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test125");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) 'a');
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
    public void test126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test126");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (byte) -1);
        fPHeapMax1.constroi();
        fPHeapMax1.imprime();
        ds.Item[] itemArray4 = new ds.Item[] {};
        fPHeapMax1.copia(itemArray4);
        java.lang.Class<?> wildcardClass6 = itemArray4.getClass();
        org.junit.Assert.assertNotNull(itemArray4);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test127");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax(0);
        fPHeapMax1.imprime();
        fPHeapMax1.constroi();
        fPHeapMax1.imprime();
        fPHeapMax1.constroi();
        ds.Item item6 = null;
        ds.Item[] itemArray7 = new ds.Item[] { item6 };
        fPHeapMax1.copia(itemArray7);
        ds.FPHeapMax fPHeapMax10 = new ds.FPHeapMax(0);
        ds.Item item11 = null;
        ds.Item[] itemArray12 = new ds.Item[] { item11 };
        fPHeapMax10.copia(itemArray12);
        fPHeapMax10.imprime();
        ds.FPHeapMax fPHeapMax16 = new ds.FPHeapMax((int) (byte) -1);
        fPHeapMax16.constroi();
        fPHeapMax16.imprime();
        ds.Item[] itemArray19 = new ds.Item[] {};
        fPHeapMax16.copia(itemArray19);
        fPHeapMax10.copia(itemArray19);
        fPHeapMax1.copia(itemArray19);
        ds.FPHeapMax fPHeapMax25 = new ds.FPHeapMax(0);
        fPHeapMax25.imprime();
        fPHeapMax25.constroi();
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMax1.aumentaChave((int) (short) 100, (java.lang.Object) fPHeapMax25);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 100");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray7);
        org.junit.Assert.assertNotNull(itemArray12);
        org.junit.Assert.assertNotNull(itemArray19);
    }

    @Test
    public void test128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test128");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax(0);
        fPHeapMax1.imprime();
        ds.Item[] itemArray3 = new ds.Item[] {};
        fPHeapMax1.copia(itemArray3);
        fPHeapMax1.constroi();
        fPHeapMax1.imprime();
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMax1.refaz((int) (short) 0, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray3);
    }

    @Test
    public void test129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test129");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) '4');
        ds.FPHeapMax fPHeapMax3 = new ds.FPHeapMax(0);
        fPHeapMax3.imprime();
        ds.Item[] itemArray5 = new ds.Item[] {};
        fPHeapMax3.copia(itemArray5);
        fPHeapMax1.copia(itemArray5);
        java.lang.Class<?> wildcardClass8 = fPHeapMax1.getClass();
        org.junit.Assert.assertNotNull(itemArray5);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test130");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (short) 0);
        fPHeapMax1.imprime();
        fPHeapMax1.constroi();
        fPHeapMax1.constroi();
        // The following exception was thrown during execution in test generation
        try {
            ds.Item item5 = fPHeapMax1.retiraMax();
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: heap vazio");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
    }

    @Test
    public void test131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test131");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) '4');
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMax1.refaz((int) (byte) 100, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 100");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test132");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax(0);
        fPHeapMax1.imprime();
        fPHeapMax1.constroi();
        fPHeapMax1.imprime();
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
        org.junit.Assert.assertNotNull(itemArray7);
    }

    @Test
    public void test133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test133");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax(0);
        fPHeapMax1.imprime();
        fPHeapMax1.constroi();
        fPHeapMax1.imprime();
        fPHeapMax1.constroi();
        ds.Item item6 = null;
        ds.Item[] itemArray7 = new ds.Item[] { item6 };
        fPHeapMax1.copia(itemArray7);
        ds.FPHeapMax fPHeapMax10 = new ds.FPHeapMax(0);
        ds.Item item11 = null;
        ds.Item[] itemArray12 = new ds.Item[] { item11 };
        fPHeapMax10.copia(itemArray12);
        fPHeapMax10.imprime();
        ds.FPHeapMax fPHeapMax16 = new ds.FPHeapMax((int) (byte) -1);
        fPHeapMax16.constroi();
        fPHeapMax16.imprime();
        ds.Item[] itemArray19 = new ds.Item[] {};
        fPHeapMax16.copia(itemArray19);
        fPHeapMax10.copia(itemArray19);
        fPHeapMax1.copia(itemArray19);
        // The following exception was thrown during execution in test generation
        try {
            ds.Item item23 = fPHeapMax1.retiraMax();
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: heap vazio");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray7);
        org.junit.Assert.assertNotNull(itemArray12);
        org.junit.Assert.assertNotNull(itemArray19);
    }

    @Test
    public void test134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test134");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax(0);
        fPHeapMax1.imprime();
        ds.Item[] itemArray3 = new ds.Item[] {};
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
    public void test135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test135");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (short) 0);
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
    public void test136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test136");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax(10);
        fPHeapMax1.constroi();
        ds.FPHeapMax fPHeapMax5 = new ds.FPHeapMax(0);
        ds.Item item6 = null;
        ds.Item[] itemArray7 = new ds.Item[] { item6 };
        fPHeapMax5.copia(itemArray7);
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMax1.aumentaChave(10, (java.lang.Object) itemArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray7);
    }

    @Test
    public void test137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test137");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax(0);
        fPHeapMax1.imprime();
        ds.Item[] itemArray3 = new ds.Item[] {};
        fPHeapMax1.copia(itemArray3);
        fPHeapMax1.constroi();
        fPHeapMax1.imprime();
        fPHeapMax1.imprime();
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMax1.refaz((int) (byte) -1, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray3);
    }

    @Test
    public void test138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test138");
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
    public void test139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test139");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) '4');
        ds.FPHeapMax fPHeapMax3 = new ds.FPHeapMax(0);
        fPHeapMax3.imprime();
        ds.Item[] itemArray5 = new ds.Item[] {};
        fPHeapMax3.copia(itemArray5);
        fPHeapMax1.copia(itemArray5);
        ds.Item item8 = null;
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMax1.insere(item8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray5);
    }

    @Test
    public void test140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test140");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) '4');
        ds.FPHeapMax fPHeapMax3 = new ds.FPHeapMax(0);
        fPHeapMax3.imprime();
        ds.Item[] itemArray5 = new ds.Item[] {};
        fPHeapMax3.copia(itemArray5);
        fPHeapMax1.copia(itemArray5);
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMax1.refaz((int) (byte) -1, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray5);
    }

    @Test
    public void test141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test141");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (byte) -1);
        fPHeapMax1.constroi();
        fPHeapMax1.imprime();
        ds.Item[] itemArray4 = new ds.Item[] {};
        fPHeapMax1.copia(itemArray4);
        fPHeapMax1.imprime();
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMax1.aumentaChave((int) (byte) 100, (java.lang.Object) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 100");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray4);
    }

    @Test
    public void test142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test142");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (short) 100);
        ds.FPHeapMax fPHeapMax4 = new ds.FPHeapMax(0);
        fPHeapMax4.imprime();
        fPHeapMax4.constroi();
        fPHeapMax4.imprime();
        fPHeapMax4.constroi();
        fPHeapMax4.imprime();
        ds.FPHeapMax fPHeapMax11 = new ds.FPHeapMax(0);
        ds.Item item12 = null;
        ds.Item[] itemArray13 = new ds.Item[] { item12 };
        fPHeapMax11.copia(itemArray13);
        fPHeapMax11.imprime();
        ds.FPHeapMax fPHeapMax17 = new ds.FPHeapMax((int) (byte) -1);
        fPHeapMax17.constroi();
        fPHeapMax17.imprime();
        ds.Item[] itemArray20 = new ds.Item[] {};
        fPHeapMax17.copia(itemArray20);
        fPHeapMax11.copia(itemArray20);
        fPHeapMax4.copia(itemArray20);
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMax1.aumentaChave(0, (java.lang.Object) itemArray20);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray13);
        org.junit.Assert.assertNotNull(itemArray20);
    }

    @Test
    public void test143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test143");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax(0);
        fPHeapMax1.imprime();
        ds.Item[] itemArray3 = new ds.Item[] {};
        fPHeapMax1.copia(itemArray3);
        fPHeapMax1.constroi();
        fPHeapMax1.imprime();
        ds.Item[] itemArray7 = new ds.Item[] {};
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
    public void test144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test144");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax(0);
        fPHeapMax1.imprime();
        fPHeapMax1.constroi();
        fPHeapMax1.imprime();
        fPHeapMax1.constroi();
        ds.Item item6 = null;
        ds.Item[] itemArray7 = new ds.Item[] { item6 };
        fPHeapMax1.copia(itemArray7);
        ds.Item[] itemArray9 = null;
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMax1.copia(itemArray9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray7);
    }

    @Test
    public void test145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test145");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax(0);
        fPHeapMax1.imprime();
        fPHeapMax1.constroi();
        fPHeapMax1.imprime();
        fPHeapMax1.constroi();
        fPHeapMax1.imprime();
        ds.FPHeapMax fPHeapMax8 = new ds.FPHeapMax(0);
        ds.Item item9 = null;
        ds.Item[] itemArray10 = new ds.Item[] { item9 };
        fPHeapMax8.copia(itemArray10);
        fPHeapMax8.imprime();
        ds.FPHeapMax fPHeapMax14 = new ds.FPHeapMax((int) (byte) -1);
        fPHeapMax14.constroi();
        fPHeapMax14.imprime();
        ds.Item[] itemArray17 = new ds.Item[] {};
        fPHeapMax14.copia(itemArray17);
        fPHeapMax8.copia(itemArray17);
        fPHeapMax1.copia(itemArray17);
        ds.Item[] itemArray21 = null;
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMax1.copia(itemArray21);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray10);
        org.junit.Assert.assertNotNull(itemArray17);
    }

    @Test
    public void test146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test146");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (short) 0);
        fPHeapMax1.imprime();
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
    public void test147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test147");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax(1);
        fPHeapMax1.constroi();
        fPHeapMax1.imprime();
        fPHeapMax1.imprime();
        java.lang.Class<?> wildcardClass5 = fPHeapMax1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test148");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax(0);
        fPHeapMax1.imprime();
        ds.Item[] itemArray3 = new ds.Item[] {};
        fPHeapMax1.copia(itemArray3);
        fPHeapMax1.constroi();
        fPHeapMax1.imprime();
        fPHeapMax1.imprime();
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
    public void test149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test149");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (byte) -1);
        fPHeapMax1.constroi();
        fPHeapMax1.imprime();
        ds.FPHeapMax fPHeapMax5 = new ds.FPHeapMax(0);
        ds.Item item6 = null;
        ds.Item[] itemArray7 = new ds.Item[] { item6 };
        fPHeapMax5.copia(itemArray7);
        fPHeapMax1.copia(itemArray7);
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMax1.refaz((int) (short) 10, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 10");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray7);
    }

    @Test
    public void test150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test150");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax(0);
        fPHeapMax1.imprime();
        fPHeapMax1.constroi();
        fPHeapMax1.imprime();
        ds.FPHeapMax fPHeapMax6 = new ds.FPHeapMax((int) '4');
        ds.Item item7 = fPHeapMax6.max();
        ds.FPHeapMax fPHeapMax9 = new ds.FPHeapMax(0);
        fPHeapMax9.imprime();
        ds.Item[] itemArray11 = new ds.Item[] {};
        fPHeapMax9.copia(itemArray11);
        fPHeapMax9.constroi();
        fPHeapMax9.imprime();
        ds.Item[] itemArray15 = new ds.Item[] {};
        fPHeapMax9.copia(itemArray15);
        fPHeapMax6.copia(itemArray15);
        fPHeapMax1.copia(itemArray15);
        // The following exception was thrown during execution in test generation
        try {
            ds.Item item19 = fPHeapMax1.retiraMax();
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: heap vazio");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(item7);
        org.junit.Assert.assertNotNull(itemArray11);
        org.junit.Assert.assertNotNull(itemArray15);
    }

    @Test
    public void test151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test151");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) ' ');
        ds.FPHeapMax fPHeapMax3 = new ds.FPHeapMax(0);
        ds.Item item4 = null;
        ds.Item[] itemArray5 = new ds.Item[] { item4 };
        fPHeapMax3.copia(itemArray5);
        fPHeapMax1.copia(itemArray5);
        fPHeapMax1.imprime();
        ds.Item item9 = null;
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMax1.insere(item9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray5);
    }

    @Test
    public void test152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test152");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (byte) -1);
        fPHeapMax1.constroi();
        fPHeapMax1.constroi();
        fPHeapMax1.constroi();
        // The following exception was thrown during execution in test generation
        try {
            ds.Item item5 = fPHeapMax1.max();
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test153");
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
    public void test154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test154");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax(1);
        fPHeapMax1.constroi();
        ds.Item item3 = fPHeapMax1.max();
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMax1.refaz(100, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 100");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(item3);
    }

    @Test
    public void test155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test155");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax(0);
        fPHeapMax1.imprime();
        fPHeapMax1.constroi();
        fPHeapMax1.imprime();
        fPHeapMax1.constroi();
        fPHeapMax1.imprime();
        ds.FPHeapMax fPHeapMax9 = new ds.FPHeapMax(0);
        fPHeapMax9.imprime();
        fPHeapMax9.constroi();
        fPHeapMax9.imprime();
        fPHeapMax9.constroi();
        fPHeapMax9.imprime();
        ds.FPHeapMax fPHeapMax16 = new ds.FPHeapMax(0);
        ds.Item item17 = null;
        ds.Item[] itemArray18 = new ds.Item[] { item17 };
        fPHeapMax16.copia(itemArray18);
        fPHeapMax16.imprime();
        ds.FPHeapMax fPHeapMax22 = new ds.FPHeapMax((int) (byte) -1);
        fPHeapMax22.constroi();
        fPHeapMax22.imprime();
        ds.Item[] itemArray25 = new ds.Item[] {};
        fPHeapMax22.copia(itemArray25);
        fPHeapMax16.copia(itemArray25);
        fPHeapMax9.copia(itemArray25);
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMax1.aumentaChave((int) (short) 10, (java.lang.Object) itemArray25);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 10");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray18);
        org.junit.Assert.assertNotNull(itemArray25);
    }

    @Test
    public void test156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test156");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax(0);
        ds.Item item2 = null;
        ds.Item[] itemArray3 = new ds.Item[] { item2 };
        fPHeapMax1.copia(itemArray3);
        fPHeapMax1.imprime();
        ds.FPHeapMax fPHeapMax7 = new ds.FPHeapMax((int) (byte) -1);
        fPHeapMax7.constroi();
        fPHeapMax7.imprime();
        ds.Item[] itemArray10 = new ds.Item[] {};
        fPHeapMax7.copia(itemArray10);
        fPHeapMax1.copia(itemArray10);
        ds.FPHeapMax fPHeapMax14 = new ds.FPHeapMax(0);
        fPHeapMax14.imprime();
        ds.Item[] itemArray16 = new ds.Item[] {};
        fPHeapMax14.copia(itemArray16);
        fPHeapMax1.copia(itemArray16);
        // The following exception was thrown during execution in test generation
        try {
            ds.Item item19 = fPHeapMax1.max();
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertNotNull(itemArray10);
        org.junit.Assert.assertNotNull(itemArray16);
    }

    @Test
    public void test157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test157");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (byte) -1);
        fPHeapMax1.constroi();
        fPHeapMax1.imprime();
        ds.FPHeapMax fPHeapMax5 = new ds.FPHeapMax(0);
        ds.Item item6 = null;
        ds.Item[] itemArray7 = new ds.Item[] { item6 };
        fPHeapMax5.copia(itemArray7);
        fPHeapMax1.copia(itemArray7);
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMax1.aumentaChave(1, (java.lang.Object) (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray7);
    }

    @Test
    public void test158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test158");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (byte) -1);
        fPHeapMax1.constroi();
        fPHeapMax1.imprime();
        ds.FPHeapMax fPHeapMax5 = new ds.FPHeapMax(0);
        fPHeapMax5.imprime();
        fPHeapMax5.constroi();
        fPHeapMax5.imprime();
        fPHeapMax5.constroi();
        ds.Item item10 = null;
        ds.Item[] itemArray11 = new ds.Item[] { item10 };
        fPHeapMax5.copia(itemArray11);
        ds.FPHeapMax fPHeapMax14 = new ds.FPHeapMax(0);
        ds.Item item15 = null;
        ds.Item[] itemArray16 = new ds.Item[] { item15 };
        fPHeapMax14.copia(itemArray16);
        fPHeapMax14.imprime();
        ds.FPHeapMax fPHeapMax20 = new ds.FPHeapMax((int) (byte) -1);
        fPHeapMax20.constroi();
        fPHeapMax20.imprime();
        ds.Item[] itemArray23 = new ds.Item[] {};
        fPHeapMax20.copia(itemArray23);
        fPHeapMax14.copia(itemArray23);
        fPHeapMax5.copia(itemArray23);
        fPHeapMax1.copia(itemArray23);
        java.lang.Class<?> wildcardClass28 = itemArray23.getClass();
        org.junit.Assert.assertNotNull(itemArray11);
        org.junit.Assert.assertNotNull(itemArray16);
        org.junit.Assert.assertNotNull(itemArray23);
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test159");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax(0);
        fPHeapMax1.imprime();
        fPHeapMax1.constroi();
        fPHeapMax1.imprime();
        fPHeapMax1.constroi();
        fPHeapMax1.imprime();
        ds.FPHeapMax fPHeapMax8 = new ds.FPHeapMax(0);
        ds.Item item9 = null;
        ds.Item[] itemArray10 = new ds.Item[] { item9 };
        fPHeapMax8.copia(itemArray10);
        fPHeapMax8.imprime();
        ds.FPHeapMax fPHeapMax14 = new ds.FPHeapMax((int) (byte) -1);
        fPHeapMax14.constroi();
        fPHeapMax14.imprime();
        ds.Item[] itemArray17 = new ds.Item[] {};
        fPHeapMax14.copia(itemArray17);
        fPHeapMax8.copia(itemArray17);
        fPHeapMax1.copia(itemArray17);
        // The following exception was thrown during execution in test generation
        try {
            ds.Item item21 = fPHeapMax1.max();
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray10);
        org.junit.Assert.assertNotNull(itemArray17);
    }

    @Test
    public void test160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test160");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (byte) -1);
        fPHeapMax1.constroi();
        fPHeapMax1.imprime();
        ds.FPHeapMax fPHeapMax5 = new ds.FPHeapMax(0);
        ds.Item item6 = null;
        ds.Item[] itemArray7 = new ds.Item[] { item6 };
        fPHeapMax5.copia(itemArray7);
        fPHeapMax1.copia(itemArray7);
        fPHeapMax1.imprime();
        // The following exception was thrown during execution in test generation
        try {
            ds.Item item11 = fPHeapMax1.max();
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray7);
    }

    @Test
    public void test161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test161");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax(0);
        fPHeapMax1.imprime();
        ds.Item[] itemArray3 = new ds.Item[] {};
        fPHeapMax1.copia(itemArray3);
        fPHeapMax1.constroi();
        fPHeapMax1.imprime();
        ds.FPHeapMax fPHeapMax9 = new ds.FPHeapMax((int) ' ');
        java.lang.Class<?> wildcardClass10 = fPHeapMax9.getClass();
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMax1.aumentaChave((int) (byte) 100, (java.lang.Object) fPHeapMax9);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 100");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test162");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (byte) -1);
        fPHeapMax1.constroi();
        fPHeapMax1.constroi();
        java.lang.Class<?> wildcardClass4 = fPHeapMax1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test163");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax(0);
        fPHeapMax1.constroi();
        fPHeapMax1.constroi();
        fPHeapMax1.constroi();
        // The following exception was thrown during execution in test generation
        try {
            ds.Item item5 = fPHeapMax1.retiraMax();
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: heap vazio");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
    }

    @Test
    public void test164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test164");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((-1));
        fPHeapMax1.imprime();
        fPHeapMax1.imprime();
        ds.FPHeapMax fPHeapMax5 = new ds.FPHeapMax(0);
        fPHeapMax5.imprime();
        fPHeapMax5.constroi();
        fPHeapMax5.imprime();
        ds.FPHeapMax fPHeapMax10 = new ds.FPHeapMax((int) '4');
        ds.Item item11 = fPHeapMax10.max();
        ds.FPHeapMax fPHeapMax13 = new ds.FPHeapMax(0);
        fPHeapMax13.imprime();
        ds.Item[] itemArray15 = new ds.Item[] {};
        fPHeapMax13.copia(itemArray15);
        fPHeapMax13.constroi();
        fPHeapMax13.imprime();
        ds.Item[] itemArray19 = new ds.Item[] {};
        fPHeapMax13.copia(itemArray19);
        fPHeapMax10.copia(itemArray19);
        fPHeapMax5.copia(itemArray19);
        fPHeapMax1.copia(itemArray19);
        fPHeapMax1.imprime();
        ds.FPHeapMax fPHeapMax27 = new ds.FPHeapMax((int) (byte) -1);
        fPHeapMax27.constroi();
        ds.FPHeapMax fPHeapMax30 = new ds.FPHeapMax((int) ' ');
        ds.FPHeapMax fPHeapMax32 = new ds.FPHeapMax(0);
        ds.Item item33 = null;
        ds.Item[] itemArray34 = new ds.Item[] { item33 };
        fPHeapMax32.copia(itemArray34);
        fPHeapMax30.copia(itemArray34);
        fPHeapMax27.copia(itemArray34);
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMax1.aumentaChave(100, (java.lang.Object) fPHeapMax27);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 100");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(item11);
        org.junit.Assert.assertNotNull(itemArray15);
        org.junit.Assert.assertNotNull(itemArray19);
        org.junit.Assert.assertNotNull(itemArray34);
    }

    @Test
    public void test165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test165");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (byte) -1);
        fPHeapMax1.constroi();
        fPHeapMax1.constroi();
        fPHeapMax1.constroi();
        ds.FPHeapMax fPHeapMax6 = new ds.FPHeapMax(0);
        fPHeapMax6.imprime();
        fPHeapMax6.constroi();
        ds.FPHeapMax fPHeapMax10 = new ds.FPHeapMax(0);
        ds.Item item11 = null;
        ds.Item[] itemArray12 = new ds.Item[] { item11 };
        fPHeapMax10.copia(itemArray12);
        fPHeapMax6.copia(itemArray12);
        fPHeapMax1.copia(itemArray12);
        ds.Item item16 = null;
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMax1.insere(item16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray12);
    }

    @Test
    public void test166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test166");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (byte) 10);
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMax1.refaz((int) (byte) 100, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 100");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test167");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax(0);
        fPHeapMax1.imprime();
        fPHeapMax1.constroi();
        fPHeapMax1.constroi();
        // The following exception was thrown during execution in test generation
        try {
            ds.Item item5 = fPHeapMax1.max();
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test168");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax(0);
        ds.Item item2 = null;
        ds.Item[] itemArray3 = new ds.Item[] { item2 };
        fPHeapMax1.copia(itemArray3);
        fPHeapMax1.imprime();
        ds.FPHeapMax fPHeapMax7 = new ds.FPHeapMax((int) (byte) -1);
        fPHeapMax7.constroi();
        fPHeapMax7.imprime();
        ds.Item[] itemArray10 = new ds.Item[] {};
        fPHeapMax7.copia(itemArray10);
        fPHeapMax1.copia(itemArray10);
        ds.FPHeapMax fPHeapMax14 = new ds.FPHeapMax(0);
        fPHeapMax14.imprime();
        ds.Item[] itemArray16 = new ds.Item[] {};
        fPHeapMax14.copia(itemArray16);
        fPHeapMax1.copia(itemArray16);
        java.lang.Class<?> wildcardClass19 = fPHeapMax1.getClass();
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertNotNull(itemArray10);
        org.junit.Assert.assertNotNull(itemArray16);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test169");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) '4');
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
    public void test170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test170");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((-1));
        fPHeapMax1.imprime();
        fPHeapMax1.imprime();
        ds.FPHeapMax fPHeapMax5 = new ds.FPHeapMax(0);
        fPHeapMax5.imprime();
        fPHeapMax5.constroi();
        fPHeapMax5.imprime();
        ds.FPHeapMax fPHeapMax10 = new ds.FPHeapMax((int) '4');
        ds.Item item11 = fPHeapMax10.max();
        ds.FPHeapMax fPHeapMax13 = new ds.FPHeapMax(0);
        fPHeapMax13.imprime();
        ds.Item[] itemArray15 = new ds.Item[] {};
        fPHeapMax13.copia(itemArray15);
        fPHeapMax13.constroi();
        fPHeapMax13.imprime();
        ds.Item[] itemArray19 = new ds.Item[] {};
        fPHeapMax13.copia(itemArray19);
        fPHeapMax10.copia(itemArray19);
        fPHeapMax5.copia(itemArray19);
        fPHeapMax1.copia(itemArray19);
        fPHeapMax1.imprime();
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMax1.aumentaChave(0, (java.lang.Object) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 0");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(item11);
        org.junit.Assert.assertNotNull(itemArray15);
        org.junit.Assert.assertNotNull(itemArray19);
    }

    @Test
    public void test171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test171");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMax1.refaz((int) (byte) -1, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test172");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (byte) -1);
        fPHeapMax1.constroi();
        fPHeapMax1.constroi();
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMax1.refaz((int) (byte) 100, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 100");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test173");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax(0);
        fPHeapMax1.imprime();
        ds.Item[] itemArray3 = new ds.Item[] {};
        fPHeapMax1.copia(itemArray3);
        fPHeapMax1.constroi();
        fPHeapMax1.imprime();
        ds.Item[] itemArray7 = new ds.Item[] {};
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
    public void test174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test174");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax(1);
        fPHeapMax1.imprime();
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMax1.refaz(1, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 2");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test175");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (byte) -1);
        fPHeapMax1.constroi();
        fPHeapMax1.imprime();
        ds.FPHeapMax fPHeapMax5 = new ds.FPHeapMax(0);
        fPHeapMax5.imprime();
        fPHeapMax5.constroi();
        fPHeapMax5.imprime();
        fPHeapMax5.constroi();
        ds.Item item10 = null;
        ds.Item[] itemArray11 = new ds.Item[] { item10 };
        fPHeapMax5.copia(itemArray11);
        ds.FPHeapMax fPHeapMax14 = new ds.FPHeapMax(0);
        ds.Item item15 = null;
        ds.Item[] itemArray16 = new ds.Item[] { item15 };
        fPHeapMax14.copia(itemArray16);
        fPHeapMax14.imprime();
        ds.FPHeapMax fPHeapMax20 = new ds.FPHeapMax((int) (byte) -1);
        fPHeapMax20.constroi();
        fPHeapMax20.imprime();
        ds.Item[] itemArray23 = new ds.Item[] {};
        fPHeapMax20.copia(itemArray23);
        fPHeapMax14.copia(itemArray23);
        fPHeapMax5.copia(itemArray23);
        fPHeapMax1.copia(itemArray23);
        fPHeapMax1.constroi();
        org.junit.Assert.assertNotNull(itemArray11);
        org.junit.Assert.assertNotNull(itemArray16);
        org.junit.Assert.assertNotNull(itemArray23);
    }

    @Test
    public void test176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test176");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax(0);
        fPHeapMax1.imprime();
        ds.Item[] itemArray3 = new ds.Item[] {};
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
    public void test177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test177");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax(0);
        fPHeapMax1.imprime();
        fPHeapMax1.constroi();
        fPHeapMax1.imprime();
        fPHeapMax1.constroi();
        fPHeapMax1.imprime();
        ds.FPHeapMax fPHeapMax8 = new ds.FPHeapMax((int) (byte) -1);
        fPHeapMax8.constroi();
        fPHeapMax8.imprime();
        ds.Item[] itemArray11 = new ds.Item[] {};
        fPHeapMax8.copia(itemArray11);
        fPHeapMax1.copia(itemArray11);
        java.lang.Class<?> wildcardClass14 = fPHeapMax1.getClass();
        org.junit.Assert.assertNotNull(itemArray11);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test178");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (short) 100);
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMax1.refaz((int) (short) -1, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test179");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax(1);
        fPHeapMax1.constroi();
        fPHeapMax1.imprime();
        fPHeapMax1.imprime();
        // The following exception was thrown during execution in test generation
        try {
            ds.Item item5 = fPHeapMax1.retiraMax();
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: heap vazio");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
    }

    @Test
    public void test180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test180");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax(0);
        fPHeapMax1.imprime();
        ds.Item[] itemArray3 = new ds.Item[] {};
        fPHeapMax1.copia(itemArray3);
        fPHeapMax1.constroi();
        fPHeapMax1.imprime();
        fPHeapMax1.imprime();
        fPHeapMax1.constroi();
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMax1.refaz((int) (byte) 10, (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 10");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray3);
    }

    @Test
    public void test181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test181");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item2 = fPHeapMax1.max();
        ds.FPHeapMax fPHeapMax4 = new ds.FPHeapMax((int) '4');
        ds.FPHeapMax fPHeapMax6 = new ds.FPHeapMax(0);
        fPHeapMax6.imprime();
        fPHeapMax6.constroi();
        fPHeapMax6.imprime();
        ds.FPHeapMax fPHeapMax11 = new ds.FPHeapMax((int) '4');
        ds.Item item12 = fPHeapMax11.max();
        ds.FPHeapMax fPHeapMax14 = new ds.FPHeapMax(0);
        fPHeapMax14.imprime();
        ds.Item[] itemArray16 = new ds.Item[] {};
        fPHeapMax14.copia(itemArray16);
        fPHeapMax14.constroi();
        fPHeapMax14.imprime();
        ds.Item[] itemArray20 = new ds.Item[] {};
        fPHeapMax14.copia(itemArray20);
        fPHeapMax11.copia(itemArray20);
        fPHeapMax6.copia(itemArray20);
        fPHeapMax4.copia(itemArray20);
        fPHeapMax1.copia(itemArray20);
        java.lang.Object obj27 = null;
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMax1.aumentaChave((int) (byte) 10, obj27);
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: chaveNova com valor null");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(item2);
        org.junit.Assert.assertNull(item12);
        org.junit.Assert.assertNotNull(itemArray16);
        org.junit.Assert.assertNotNull(itemArray20);
    }

    @Test
    public void test182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test182");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) ' ');
        fPHeapMax1.imprime();
        ds.FPHeapMax fPHeapMax5 = new ds.FPHeapMax((int) (short) 1);
        fPHeapMax5.constroi();
        ds.FPHeapMax fPHeapMax8 = new ds.FPHeapMax((int) (byte) -1);
        fPHeapMax8.constroi();
        fPHeapMax8.imprime();
        ds.FPHeapMax fPHeapMax12 = new ds.FPHeapMax(0);
        ds.Item item13 = null;
        ds.Item[] itemArray14 = new ds.Item[] { item13 };
        fPHeapMax12.copia(itemArray14);
        fPHeapMax8.copia(itemArray14);
        fPHeapMax5.copia(itemArray14);
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMax1.aumentaChave((int) (byte) 0, (java.lang.Object) itemArray14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray14);
    }

    @Test
    public void test183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test183");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax(0);
        fPHeapMax1.constroi();
        ds.FPHeapMax fPHeapMax5 = new ds.FPHeapMax((int) (byte) -1);
        fPHeapMax5.constroi();
        fPHeapMax5.constroi();
        fPHeapMax5.constroi();
        ds.FPHeapMax fPHeapMax10 = new ds.FPHeapMax(0);
        fPHeapMax10.imprime();
        fPHeapMax10.constroi();
        ds.FPHeapMax fPHeapMax14 = new ds.FPHeapMax(0);
        ds.Item item15 = null;
        ds.Item[] itemArray16 = new ds.Item[] { item15 };
        fPHeapMax14.copia(itemArray16);
        fPHeapMax10.copia(itemArray16);
        fPHeapMax5.copia(itemArray16);
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMax1.aumentaChave((-1), (java.lang.Object) fPHeapMax5);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray16);
    }

    @Test
    public void test184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test184");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax(0);
        fPHeapMax1.imprime();
        fPHeapMax1.constroi();
        ds.FPHeapMax fPHeapMax5 = new ds.FPHeapMax(0);
        ds.Item item6 = null;
        ds.Item[] itemArray7 = new ds.Item[] { item6 };
        fPHeapMax5.copia(itemArray7);
        fPHeapMax1.copia(itemArray7);
        java.lang.Class<?> wildcardClass10 = fPHeapMax1.getClass();
        org.junit.Assert.assertNotNull(itemArray7);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test185");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) ' ');
        ds.FPHeapMax fPHeapMax4 = new ds.FPHeapMax((int) (byte) -1);
        fPHeapMax4.constroi();
        fPHeapMax4.imprime();
        ds.FPHeapMax fPHeapMax8 = new ds.FPHeapMax(0);
        ds.Item item9 = null;
        ds.Item[] itemArray10 = new ds.Item[] { item9 };
        fPHeapMax8.copia(itemArray10);
        fPHeapMax4.copia(itemArray10);
        fPHeapMax4.imprime();
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMax1.aumentaChave((int) (short) 100, (java.lang.Object) fPHeapMax4);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 100");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray10);
    }

    @Test
    public void test186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test186");
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
    public void test187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test187");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((-1));
        fPHeapMax1.imprime();
        fPHeapMax1.imprime();
        ds.FPHeapMax fPHeapMax5 = new ds.FPHeapMax(0);
        fPHeapMax5.imprime();
        fPHeapMax5.constroi();
        fPHeapMax5.imprime();
        ds.FPHeapMax fPHeapMax10 = new ds.FPHeapMax((int) '4');
        ds.Item item11 = fPHeapMax10.max();
        ds.FPHeapMax fPHeapMax13 = new ds.FPHeapMax(0);
        fPHeapMax13.imprime();
        ds.Item[] itemArray15 = new ds.Item[] {};
        fPHeapMax13.copia(itemArray15);
        fPHeapMax13.constroi();
        fPHeapMax13.imprime();
        ds.Item[] itemArray19 = new ds.Item[] {};
        fPHeapMax13.copia(itemArray19);
        fPHeapMax10.copia(itemArray19);
        fPHeapMax5.copia(itemArray19);
        fPHeapMax1.copia(itemArray19);
        fPHeapMax1.imprime();
        // The following exception was thrown during execution in test generation
        try {
            ds.Item item25 = fPHeapMax1.max();
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(item11);
        org.junit.Assert.assertNotNull(itemArray15);
        org.junit.Assert.assertNotNull(itemArray19);
    }

    @Test
    public void test188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test188");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((-1));
        fPHeapMax1.imprime();
        fPHeapMax1.imprime();
        ds.FPHeapMax fPHeapMax5 = new ds.FPHeapMax(0);
        fPHeapMax5.imprime();
        fPHeapMax5.constroi();
        fPHeapMax5.imprime();
        ds.FPHeapMax fPHeapMax10 = new ds.FPHeapMax((int) '4');
        ds.Item item11 = fPHeapMax10.max();
        ds.FPHeapMax fPHeapMax13 = new ds.FPHeapMax(0);
        fPHeapMax13.imprime();
        ds.Item[] itemArray15 = new ds.Item[] {};
        fPHeapMax13.copia(itemArray15);
        fPHeapMax13.constroi();
        fPHeapMax13.imprime();
        ds.Item[] itemArray19 = new ds.Item[] {};
        fPHeapMax13.copia(itemArray19);
        fPHeapMax10.copia(itemArray19);
        fPHeapMax5.copia(itemArray19);
        fPHeapMax1.copia(itemArray19);
        fPHeapMax1.imprime();
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMax1.aumentaChave(0, (java.lang.Object) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 0");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(item11);
        org.junit.Assert.assertNotNull(itemArray15);
        org.junit.Assert.assertNotNull(itemArray19);
    }

    @Test
    public void test189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test189");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax(0);
        fPHeapMax1.imprime();
        fPHeapMax1.constroi();
        fPHeapMax1.imprime();
        fPHeapMax1.constroi();
        ds.Item item6 = null;
        ds.Item[] itemArray7 = new ds.Item[] { item6 };
        fPHeapMax1.copia(itemArray7);
        ds.FPHeapMax fPHeapMax10 = new ds.FPHeapMax(0);
        ds.Item item11 = null;
        ds.Item[] itemArray12 = new ds.Item[] { item11 };
        fPHeapMax10.copia(itemArray12);
        fPHeapMax10.imprime();
        ds.FPHeapMax fPHeapMax16 = new ds.FPHeapMax((int) (byte) -1);
        fPHeapMax16.constroi();
        fPHeapMax16.imprime();
        ds.Item[] itemArray19 = new ds.Item[] {};
        fPHeapMax16.copia(itemArray19);
        fPHeapMax10.copia(itemArray19);
        fPHeapMax1.copia(itemArray19);
        fPHeapMax1.constroi();
        java.lang.Class<?> wildcardClass24 = fPHeapMax1.getClass();
        org.junit.Assert.assertNotNull(itemArray7);
        org.junit.Assert.assertNotNull(itemArray12);
        org.junit.Assert.assertNotNull(itemArray19);
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test190");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax(1);
        fPHeapMax1.constroi();
        fPHeapMax1.imprime();
        ds.FPHeapMax fPHeapMax5 = new ds.FPHeapMax((int) '4');
        ds.Item item6 = fPHeapMax5.max();
        ds.FPHeapMax fPHeapMax8 = new ds.FPHeapMax(0);
        fPHeapMax8.imprime();
        ds.Item[] itemArray10 = new ds.Item[] {};
        fPHeapMax8.copia(itemArray10);
        fPHeapMax8.constroi();
        fPHeapMax8.imprime();
        ds.Item[] itemArray14 = new ds.Item[] {};
        fPHeapMax8.copia(itemArray14);
        fPHeapMax5.copia(itemArray14);
        fPHeapMax1.copia(itemArray14);
        ds.Item item18 = fPHeapMax1.max();
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMax1.refaz((int) 'a', 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 97");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(item6);
        org.junit.Assert.assertNotNull(itemArray10);
        org.junit.Assert.assertNotNull(itemArray14);
        org.junit.Assert.assertNull(item18);
    }

    @Test
    public void test191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test191");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (short) 0);
        fPHeapMax1.imprime();
        fPHeapMax1.constroi();
        fPHeapMax1.constroi();
        // The following exception was thrown during execution in test generation
        try {
            ds.Item item5 = fPHeapMax1.max();
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test192");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax(1);
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
    public void test193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test193");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) '4');
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
    public void test194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test194");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax(0);
        fPHeapMax1.imprime();
        fPHeapMax1.constroi();
        fPHeapMax1.imprime();
        fPHeapMax1.constroi();
        fPHeapMax1.imprime();
        ds.FPHeapMax fPHeapMax8 = new ds.FPHeapMax((int) (byte) -1);
        fPHeapMax8.constroi();
        fPHeapMax8.imprime();
        ds.Item[] itemArray11 = new ds.Item[] {};
        fPHeapMax8.copia(itemArray11);
        fPHeapMax1.copia(itemArray11);
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMax1.refaz(100, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 100");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray11);
    }

    @Test
    public void test195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test195");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) '4');
        ds.FPHeapMax fPHeapMax3 = new ds.FPHeapMax(0);
        fPHeapMax3.imprime();
        ds.Item[] itemArray5 = new ds.Item[] {};
        fPHeapMax3.copia(itemArray5);
        fPHeapMax1.copia(itemArray5);
        java.lang.Class<?> wildcardClass8 = itemArray5.getClass();
        org.junit.Assert.assertNotNull(itemArray5);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test196");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (byte) 0);
        ds.FPHeapMax fPHeapMax3 = new ds.FPHeapMax(0);
        fPHeapMax3.imprime();
        ds.Item[] itemArray5 = new ds.Item[] {};
        fPHeapMax3.copia(itemArray5);
        fPHeapMax3.constroi();
        fPHeapMax3.imprime();
        ds.Item[] itemArray9 = new ds.Item[] {};
        fPHeapMax3.copia(itemArray9);
        fPHeapMax1.copia(itemArray9);
        // The following exception was thrown during execution in test generation
        try {
            ds.Item item12 = fPHeapMax1.max();
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray5);
        org.junit.Assert.assertNotNull(itemArray9);
    }

    @Test
    public void test197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test197");
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
    public void test198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test198");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (short) 1);
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
    public void test199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test199");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax(0);
        fPHeapMax1.imprime();
        ds.Item[] itemArray3 = new ds.Item[] {};
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
    public void test200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test200");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (short) -1);
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
    public void test201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test201");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax(0);
        fPHeapMax1.imprime();
        fPHeapMax1.constroi();
        ds.FPHeapMax fPHeapMax5 = new ds.FPHeapMax(0);
        ds.Item item6 = null;
        ds.Item[] itemArray7 = new ds.Item[] { item6 };
        fPHeapMax5.copia(itemArray7);
        fPHeapMax1.copia(itemArray7);
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMax1.refaz((-1), 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray7);
    }

    @Test
    public void test202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test202");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item2 = fPHeapMax1.max();
        ds.FPHeapMax fPHeapMax4 = new ds.FPHeapMax((int) '4');
        ds.FPHeapMax fPHeapMax6 = new ds.FPHeapMax(0);
        fPHeapMax6.imprime();
        fPHeapMax6.constroi();
        fPHeapMax6.imprime();
        ds.FPHeapMax fPHeapMax11 = new ds.FPHeapMax((int) '4');
        ds.Item item12 = fPHeapMax11.max();
        ds.FPHeapMax fPHeapMax14 = new ds.FPHeapMax(0);
        fPHeapMax14.imprime();
        ds.Item[] itemArray16 = new ds.Item[] {};
        fPHeapMax14.copia(itemArray16);
        fPHeapMax14.constroi();
        fPHeapMax14.imprime();
        ds.Item[] itemArray20 = new ds.Item[] {};
        fPHeapMax14.copia(itemArray20);
        fPHeapMax11.copia(itemArray20);
        fPHeapMax6.copia(itemArray20);
        fPHeapMax4.copia(itemArray20);
        fPHeapMax1.copia(itemArray20);
        // The following exception was thrown during execution in test generation
        try {
            ds.Item item26 = fPHeapMax1.retiraMax();
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: heap vazio");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(item2);
        org.junit.Assert.assertNull(item12);
        org.junit.Assert.assertNotNull(itemArray16);
        org.junit.Assert.assertNotNull(itemArray20);
    }

    @Test
    public void test203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test203");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax(0);
        fPHeapMax1.constroi();
        fPHeapMax1.constroi();
        fPHeapMax1.constroi();
        fPHeapMax1.constroi();
        ds.Item item6 = null;
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMax1.insere(item6);
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: heap cheio");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
    }

    @Test
    public void test204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test204");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax(0);
        fPHeapMax1.imprime();
        ds.Item[] itemArray3 = new ds.Item[] {};
        fPHeapMax1.copia(itemArray3);
        fPHeapMax1.constroi();
        fPHeapMax1.imprime();
        fPHeapMax1.imprime();
        fPHeapMax1.constroi();
        // The following exception was thrown during execution in test generation
        try {
            ds.Item item9 = fPHeapMax1.max();
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray3);
    }

    @Test
    public void test205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test205");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) ' ');
        fPHeapMax1.refaz((int) (short) 1, 0);
        ds.FPHeapMax fPHeapMax7 = new ds.FPHeapMax(0);
        fPHeapMax7.imprime();
        fPHeapMax7.constroi();
        ds.FPHeapMax fPHeapMax11 = new ds.FPHeapMax(0);
        ds.Item item12 = null;
        ds.Item[] itemArray13 = new ds.Item[] { item12 };
        fPHeapMax11.copia(itemArray13);
        fPHeapMax7.copia(itemArray13);
        fPHeapMax7.constroi();
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMax1.aumentaChave(1, (java.lang.Object) fPHeapMax7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray13);
    }

    @Test
    public void test206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test206");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (short) 0);
        fPHeapMax1.imprime();
        fPHeapMax1.constroi();
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMax1.aumentaChave((int) '#', (java.lang.Object) "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 35");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test207");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax(0);
        ds.Item item2 = null;
        ds.Item[] itemArray3 = new ds.Item[] { item2 };
        fPHeapMax1.copia(itemArray3);
        fPHeapMax1.imprime();
        ds.FPHeapMax fPHeapMax7 = new ds.FPHeapMax((int) (byte) -1);
        fPHeapMax7.constroi();
        fPHeapMax7.imprime();
        ds.Item[] itemArray10 = new ds.Item[] {};
        fPHeapMax7.copia(itemArray10);
        fPHeapMax1.copia(itemArray10);
        ds.FPHeapMax fPHeapMax14 = new ds.FPHeapMax(0);
        fPHeapMax14.imprime();
        ds.Item[] itemArray16 = new ds.Item[] {};
        fPHeapMax14.copia(itemArray16);
        fPHeapMax1.copia(itemArray16);
        fPHeapMax1.constroi();
        ds.Item item20 = null;
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMax1.insere(item20);
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: heap cheio");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertNotNull(itemArray10);
        org.junit.Assert.assertNotNull(itemArray16);
    }

    @Test
    public void test208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test208");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax(1);
        fPHeapMax1.constroi();
        ds.Item item3 = fPHeapMax1.max();
        fPHeapMax1.imprime();
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMax1.refaz((int) ' ', 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 32");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(item3);
    }

    @Test
    public void test209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test209");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((-1));
        fPHeapMax1.imprime();
        fPHeapMax1.imprime();
        ds.FPHeapMax fPHeapMax5 = new ds.FPHeapMax(0);
        fPHeapMax5.imprime();
        fPHeapMax5.constroi();
        fPHeapMax5.imprime();
        ds.FPHeapMax fPHeapMax10 = new ds.FPHeapMax((int) '4');
        ds.Item item11 = fPHeapMax10.max();
        ds.FPHeapMax fPHeapMax13 = new ds.FPHeapMax(0);
        fPHeapMax13.imprime();
        ds.Item[] itemArray15 = new ds.Item[] {};
        fPHeapMax13.copia(itemArray15);
        fPHeapMax13.constroi();
        fPHeapMax13.imprime();
        ds.Item[] itemArray19 = new ds.Item[] {};
        fPHeapMax13.copia(itemArray19);
        fPHeapMax10.copia(itemArray19);
        fPHeapMax5.copia(itemArray19);
        fPHeapMax1.copia(itemArray19);
        java.lang.Class<?> wildcardClass24 = itemArray19.getClass();
        org.junit.Assert.assertNull(item11);
        org.junit.Assert.assertNotNull(itemArray15);
        org.junit.Assert.assertNotNull(itemArray19);
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test210");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMax1.refaz((int) (short) -1, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test211");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (byte) -1);
        fPHeapMax1.constroi();
        fPHeapMax1.imprime();
        ds.Item[] itemArray4 = new ds.Item[] {};
        fPHeapMax1.copia(itemArray4);
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMax1.aumentaChave((int) '#', (java.lang.Object) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 35");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray4);
    }

    @Test
    public void test212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test212");
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
    public void test213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test213");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax(100);
        java.lang.Class<?> wildcardClass2 = fPHeapMax1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test214");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax(0);
        fPHeapMax1.imprime();
        fPHeapMax1.constroi();
        fPHeapMax1.imprime();
        fPHeapMax1.constroi();
        fPHeapMax1.imprime();
        ds.FPHeapMax fPHeapMax9 = new ds.FPHeapMax((int) '4');
        ds.FPHeapMax fPHeapMax11 = new ds.FPHeapMax(0);
        fPHeapMax11.imprime();
        fPHeapMax11.constroi();
        fPHeapMax11.imprime();
        ds.FPHeapMax fPHeapMax16 = new ds.FPHeapMax((int) '4');
        ds.Item item17 = fPHeapMax16.max();
        ds.FPHeapMax fPHeapMax19 = new ds.FPHeapMax(0);
        fPHeapMax19.imprime();
        ds.Item[] itemArray21 = new ds.Item[] {};
        fPHeapMax19.copia(itemArray21);
        fPHeapMax19.constroi();
        fPHeapMax19.imprime();
        ds.Item[] itemArray25 = new ds.Item[] {};
        fPHeapMax19.copia(itemArray25);
        fPHeapMax16.copia(itemArray25);
        fPHeapMax11.copia(itemArray25);
        fPHeapMax9.copia(itemArray25);
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMax1.aumentaChave((int) (short) 10, (java.lang.Object) itemArray25);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 10");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(item17);
        org.junit.Assert.assertNotNull(itemArray21);
        org.junit.Assert.assertNotNull(itemArray25);
    }

    @Test
    public void test215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test215");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax(1);
        fPHeapMax1.constroi();
        fPHeapMax1.constroi();
        ds.Item item4 = fPHeapMax1.max();
        org.junit.Assert.assertNull(item4);
    }

    @Test
    public void test216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test216");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax(10);
        fPHeapMax1.constroi();
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMax1.refaz((int) (byte) -1, (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test217");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax(0);
        fPHeapMax1.constroi();
        fPHeapMax1.constroi();
        java.lang.Class<?> wildcardClass4 = fPHeapMax1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test218");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax(0);
        fPHeapMax1.imprime();
        ds.Item[] itemArray3 = new ds.Item[] {};
        fPHeapMax1.copia(itemArray3);
        fPHeapMax1.constroi();
        java.lang.Class<?> wildcardClass6 = fPHeapMax1.getClass();
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test219");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) '4');
        ds.Item item2 = fPHeapMax1.max();
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMax1.refaz((int) 'a', 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 97");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(item2);
    }

    @Test
    public void test220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test220");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((-1));
        java.lang.Class<?> wildcardClass2 = fPHeapMax1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test221");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (byte) -1);
        fPHeapMax1.constroi();
        fPHeapMax1.imprime();
        ds.Item[] itemArray4 = new ds.Item[] {};
        fPHeapMax1.copia(itemArray4);
        fPHeapMax1.constroi();
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMax1.refaz((int) (short) 10, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 10");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray4);
    }

    @Test
    public void test222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test222");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax(0);
        ds.Item item2 = null;
        ds.Item[] itemArray3 = new ds.Item[] { item2 };
        fPHeapMax1.copia(itemArray3);
        fPHeapMax1.imprime();
        ds.FPHeapMax fPHeapMax7 = new ds.FPHeapMax((int) (byte) -1);
        fPHeapMax7.constroi();
        fPHeapMax7.imprime();
        ds.Item[] itemArray10 = new ds.Item[] {};
        fPHeapMax7.copia(itemArray10);
        fPHeapMax1.copia(itemArray10);
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMax1.aumentaChave((int) (short) 0, (java.lang.Object) "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertNotNull(itemArray10);
    }

    @Test
    public void test223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test223");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((-1));
        fPHeapMax1.imprime();
        ds.FPHeapMax fPHeapMax5 = new ds.FPHeapMax((int) (byte) -1);
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMax1.aumentaChave(0, (java.lang.Object) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 0");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test224");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (short) 1);
        fPHeapMax1.constroi();
        ds.FPHeapMax fPHeapMax4 = new ds.FPHeapMax((int) (byte) -1);
        fPHeapMax4.constroi();
        fPHeapMax4.imprime();
        ds.FPHeapMax fPHeapMax8 = new ds.FPHeapMax(0);
        ds.Item item9 = null;
        ds.Item[] itemArray10 = new ds.Item[] { item9 };
        fPHeapMax8.copia(itemArray10);
        fPHeapMax4.copia(itemArray10);
        fPHeapMax1.copia(itemArray10);
        java.lang.Class<?> wildcardClass14 = fPHeapMax1.getClass();
        org.junit.Assert.assertNotNull(itemArray10);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test225");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax(1);
        fPHeapMax1.constroi();
        fPHeapMax1.imprime();
        ds.FPHeapMax fPHeapMax5 = new ds.FPHeapMax((int) '4');
        ds.Item item6 = fPHeapMax5.max();
        ds.FPHeapMax fPHeapMax8 = new ds.FPHeapMax(0);
        fPHeapMax8.imprime();
        ds.Item[] itemArray10 = new ds.Item[] {};
        fPHeapMax8.copia(itemArray10);
        fPHeapMax8.constroi();
        fPHeapMax8.imprime();
        ds.Item[] itemArray14 = new ds.Item[] {};
        fPHeapMax8.copia(itemArray14);
        fPHeapMax5.copia(itemArray14);
        fPHeapMax1.copia(itemArray14);
        ds.Item item18 = fPHeapMax1.max();
        ds.Item item19 = fPHeapMax1.max();
        ds.Item item20 = null;
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMax1.insere(item20);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(item6);
        org.junit.Assert.assertNotNull(itemArray10);
        org.junit.Assert.assertNotNull(itemArray14);
        org.junit.Assert.assertNull(item18);
        org.junit.Assert.assertNull(item19);
    }

    @Test
    public void test226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test226");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item2 = fPHeapMax1.max();
        ds.FPHeapMax fPHeapMax4 = new ds.FPHeapMax((int) '4');
        ds.FPHeapMax fPHeapMax6 = new ds.FPHeapMax(0);
        fPHeapMax6.imprime();
        fPHeapMax6.constroi();
        fPHeapMax6.imprime();
        ds.FPHeapMax fPHeapMax11 = new ds.FPHeapMax((int) '4');
        ds.Item item12 = fPHeapMax11.max();
        ds.FPHeapMax fPHeapMax14 = new ds.FPHeapMax(0);
        fPHeapMax14.imprime();
        ds.Item[] itemArray16 = new ds.Item[] {};
        fPHeapMax14.copia(itemArray16);
        fPHeapMax14.constroi();
        fPHeapMax14.imprime();
        ds.Item[] itemArray20 = new ds.Item[] {};
        fPHeapMax14.copia(itemArray20);
        fPHeapMax11.copia(itemArray20);
        fPHeapMax6.copia(itemArray20);
        fPHeapMax4.copia(itemArray20);
        fPHeapMax1.copia(itemArray20);
        java.lang.Class<?> wildcardClass26 = fPHeapMax1.getClass();
        org.junit.Assert.assertNull(item2);
        org.junit.Assert.assertNull(item12);
        org.junit.Assert.assertNotNull(itemArray16);
        org.junit.Assert.assertNotNull(itemArray20);
        org.junit.Assert.assertNotNull(wildcardClass26);
    }

    @Test
    public void test227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test227");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax(1);
        fPHeapMax1.constroi();
        fPHeapMax1.imprime();
        fPHeapMax1.imprime();
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
    public void test228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test228");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax(0);
        fPHeapMax1.imprime();
        fPHeapMax1.constroi();
        fPHeapMax1.imprime();
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
    }

    @Test
    public void test229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test229");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax(0);
        fPHeapMax1.imprime();
        fPHeapMax1.constroi();
        fPHeapMax1.imprime();
        fPHeapMax1.imprime();
        fPHeapMax1.constroi();
        // The following exception was thrown during execution in test generation
        try {
            ds.Item item7 = fPHeapMax1.retiraMax();
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: heap vazio");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
    }

    @Test
    public void test230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test230");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax(1);
        fPHeapMax1.constroi();
        fPHeapMax1.imprime();
        ds.FPHeapMax fPHeapMax5 = new ds.FPHeapMax((int) '4');
        ds.Item item6 = fPHeapMax5.max();
        ds.FPHeapMax fPHeapMax8 = new ds.FPHeapMax(0);
        fPHeapMax8.imprime();
        ds.Item[] itemArray10 = new ds.Item[] {};
        fPHeapMax8.copia(itemArray10);
        fPHeapMax8.constroi();
        fPHeapMax8.imprime();
        ds.Item[] itemArray14 = new ds.Item[] {};
        fPHeapMax8.copia(itemArray14);
        fPHeapMax5.copia(itemArray14);
        fPHeapMax1.copia(itemArray14);
        ds.Item item18 = null;
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMax1.insere(item18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(item6);
        org.junit.Assert.assertNotNull(itemArray10);
        org.junit.Assert.assertNotNull(itemArray14);
    }

    @Test
    public void test231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test231");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (byte) 0);
        ds.FPHeapMax fPHeapMax3 = new ds.FPHeapMax(0);
        fPHeapMax3.imprime();
        ds.Item[] itemArray5 = new ds.Item[] {};
        fPHeapMax3.copia(itemArray5);
        fPHeapMax3.constroi();
        fPHeapMax3.imprime();
        ds.Item[] itemArray9 = new ds.Item[] {};
        fPHeapMax3.copia(itemArray9);
        fPHeapMax1.copia(itemArray9);
        ds.Item[] itemArray12 = null;
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMax1.copia(itemArray12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray5);
        org.junit.Assert.assertNotNull(itemArray9);
    }

    @Test
    public void test232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test232");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) '#');
        ds.FPHeapMax fPHeapMax3 = new ds.FPHeapMax(0);
        fPHeapMax3.imprime();
        fPHeapMax3.constroi();
        ds.FPHeapMax fPHeapMax7 = new ds.FPHeapMax(0);
        ds.Item item8 = null;
        ds.Item[] itemArray9 = new ds.Item[] { item8 };
        fPHeapMax7.copia(itemArray9);
        fPHeapMax3.copia(itemArray9);
        fPHeapMax1.copia(itemArray9);
        fPHeapMax1.constroi();
        ds.FPHeapMax fPHeapMax16 = new ds.FPHeapMax((int) (short) 10);
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMax1.aumentaChave(100, (java.lang.Object) fPHeapMax16);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 100");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray9);
    }

    @Test
    public void test233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test233");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (short) 0);
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
    public void test234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test234");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (short) -1);
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
    public void test235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test235");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax(0);
        fPHeapMax1.imprime();
        fPHeapMax1.constroi();
        fPHeapMax1.imprime();
        fPHeapMax1.constroi();
        ds.Item item6 = null;
        ds.Item[] itemArray7 = new ds.Item[] { item6 };
        fPHeapMax1.copia(itemArray7);
        ds.FPHeapMax fPHeapMax11 = new ds.FPHeapMax((int) (short) -1);
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMax1.aumentaChave((int) (byte) 0, (java.lang.Object) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray7);
    }

    @Test
    public void test236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test236");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) '4');
        ds.Item item2 = fPHeapMax1.max();
        ds.FPHeapMax fPHeapMax4 = new ds.FPHeapMax(0);
        fPHeapMax4.imprime();
        ds.Item[] itemArray6 = new ds.Item[] {};
        fPHeapMax4.copia(itemArray6);
        fPHeapMax4.constroi();
        fPHeapMax4.imprime();
        ds.Item[] itemArray10 = new ds.Item[] {};
        fPHeapMax4.copia(itemArray10);
        fPHeapMax1.copia(itemArray10);
        fPHeapMax1.imprime();
        fPHeapMax1.imprime();
        fPHeapMax1.refaz((int) '4', (int) 'a');
        org.junit.Assert.assertNull(item2);
        org.junit.Assert.assertNotNull(itemArray6);
        org.junit.Assert.assertNotNull(itemArray10);
    }

    @Test
    public void test237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test237");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax(0);
        fPHeapMax1.imprime();
        fPHeapMax1.constroi();
        fPHeapMax1.imprime();
        fPHeapMax1.constroi();
        fPHeapMax1.imprime();
        ds.FPHeapMax fPHeapMax8 = new ds.FPHeapMax(0);
        ds.Item item9 = null;
        ds.Item[] itemArray10 = new ds.Item[] { item9 };
        fPHeapMax8.copia(itemArray10);
        fPHeapMax8.imprime();
        ds.FPHeapMax fPHeapMax14 = new ds.FPHeapMax((int) (byte) -1);
        fPHeapMax14.constroi();
        fPHeapMax14.imprime();
        ds.Item[] itemArray17 = new ds.Item[] {};
        fPHeapMax14.copia(itemArray17);
        fPHeapMax8.copia(itemArray17);
        fPHeapMax1.copia(itemArray17);
        ds.FPHeapMax fPHeapMax22 = new ds.FPHeapMax(0);
        fPHeapMax22.imprime();
        fPHeapMax22.constroi();
        fPHeapMax22.imprime();
        ds.FPHeapMax fPHeapMax27 = new ds.FPHeapMax((int) '4');
        ds.Item item28 = fPHeapMax27.max();
        ds.FPHeapMax fPHeapMax30 = new ds.FPHeapMax(0);
        fPHeapMax30.imprime();
        ds.Item[] itemArray32 = new ds.Item[] {};
        fPHeapMax30.copia(itemArray32);
        fPHeapMax30.constroi();
        fPHeapMax30.imprime();
        ds.Item[] itemArray36 = new ds.Item[] {};
        fPHeapMax30.copia(itemArray36);
        fPHeapMax27.copia(itemArray36);
        fPHeapMax22.copia(itemArray36);
        fPHeapMax1.copia(itemArray36);
        ds.FPHeapMax fPHeapMax43 = new ds.FPHeapMax((int) (byte) -1);
        fPHeapMax43.constroi();
        fPHeapMax43.constroi();
        fPHeapMax43.constroi();
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMax1.aumentaChave((int) (byte) 10, (java.lang.Object) fPHeapMax43);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 10");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray10);
        org.junit.Assert.assertNotNull(itemArray17);
        org.junit.Assert.assertNull(item28);
        org.junit.Assert.assertNotNull(itemArray32);
        org.junit.Assert.assertNotNull(itemArray36);
    }

    @Test
    public void test238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test238");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) ' ');
        ds.FPHeapMax fPHeapMax3 = new ds.FPHeapMax(0);
        ds.Item item4 = null;
        ds.Item[] itemArray5 = new ds.Item[] { item4 };
        fPHeapMax3.copia(itemArray5);
        fPHeapMax1.copia(itemArray5);
        ds.FPHeapMax fPHeapMax9 = new ds.FPHeapMax(0);
        fPHeapMax9.constroi();
        fPHeapMax9.constroi();
        fPHeapMax9.constroi();
        fPHeapMax9.constroi();
        ds.FPHeapMax fPHeapMax15 = new ds.FPHeapMax(0);
        fPHeapMax15.imprime();
        ds.Item[] itemArray17 = new ds.Item[] {};
        fPHeapMax15.copia(itemArray17);
        fPHeapMax9.copia(itemArray17);
        fPHeapMax1.copia(itemArray17);
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMax1.refaz((int) (short) -1, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray5);
        org.junit.Assert.assertNotNull(itemArray17);
    }

    @Test
    public void test239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test239");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) ' ');
        ds.FPHeapMax fPHeapMax3 = new ds.FPHeapMax(0);
        ds.Item item4 = null;
        ds.Item[] itemArray5 = new ds.Item[] { item4 };
        fPHeapMax3.copia(itemArray5);
        fPHeapMax1.copia(itemArray5);
        fPHeapMax1.imprime();
        fPHeapMax1.constroi();
        fPHeapMax1.imprime();
        ds.FPHeapMax fPHeapMax13 = new ds.FPHeapMax((int) '4');
        ds.Item item14 = fPHeapMax13.max();
        fPHeapMax13.constroi();
        ds.FPHeapMax fPHeapMax17 = new ds.FPHeapMax(0);
        fPHeapMax17.imprime();
        fPHeapMax17.constroi();
        fPHeapMax17.imprime();
        fPHeapMax17.constroi();
        fPHeapMax17.imprime();
        ds.FPHeapMax fPHeapMax24 = new ds.FPHeapMax(0);
        ds.Item item25 = null;
        ds.Item[] itemArray26 = new ds.Item[] { item25 };
        fPHeapMax24.copia(itemArray26);
        fPHeapMax24.imprime();
        ds.FPHeapMax fPHeapMax30 = new ds.FPHeapMax((int) (byte) -1);
        fPHeapMax30.constroi();
        fPHeapMax30.imprime();
        ds.Item[] itemArray33 = new ds.Item[] {};
        fPHeapMax30.copia(itemArray33);
        fPHeapMax24.copia(itemArray33);
        fPHeapMax17.copia(itemArray33);
        ds.FPHeapMax fPHeapMax38 = new ds.FPHeapMax(0);
        fPHeapMax38.imprime();
        fPHeapMax38.constroi();
        fPHeapMax38.imprime();
        ds.FPHeapMax fPHeapMax43 = new ds.FPHeapMax((int) '4');
        ds.Item item44 = fPHeapMax43.max();
        ds.FPHeapMax fPHeapMax46 = new ds.FPHeapMax(0);
        fPHeapMax46.imprime();
        ds.Item[] itemArray48 = new ds.Item[] {};
        fPHeapMax46.copia(itemArray48);
        fPHeapMax46.constroi();
        fPHeapMax46.imprime();
        ds.Item[] itemArray52 = new ds.Item[] {};
        fPHeapMax46.copia(itemArray52);
        fPHeapMax43.copia(itemArray52);
        fPHeapMax38.copia(itemArray52);
        fPHeapMax17.copia(itemArray52);
        fPHeapMax13.copia(itemArray52);
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMax1.aumentaChave((int) (short) 10, (java.lang.Object) itemArray52);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray5);
        org.junit.Assert.assertNull(item14);
        org.junit.Assert.assertNotNull(itemArray26);
        org.junit.Assert.assertNotNull(itemArray33);
        org.junit.Assert.assertNull(item44);
        org.junit.Assert.assertNotNull(itemArray48);
        org.junit.Assert.assertNotNull(itemArray52);
    }

    @Test
    public void test240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test240");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax(0);
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
    public void test241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test241");
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
    public void test242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test242");
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
    public void test243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test243");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax(1);
        fPHeapMax1.imprime();
        fPHeapMax1.constroi();
        ds.FPHeapMax fPHeapMax5 = new ds.FPHeapMax(0);
        fPHeapMax5.imprime();
        ds.Item[] itemArray7 = new ds.Item[] {};
        fPHeapMax5.copia(itemArray7);
        fPHeapMax5.constroi();
        fPHeapMax5.imprime();
        fPHeapMax5.imprime();
        fPHeapMax5.constroi();
        ds.FPHeapMax fPHeapMax14 = new ds.FPHeapMax(0);
        fPHeapMax14.imprime();
        ds.FPHeapMax fPHeapMax17 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item18 = fPHeapMax17.max();
        ds.FPHeapMax fPHeapMax20 = new ds.FPHeapMax((int) '4');
        ds.FPHeapMax fPHeapMax22 = new ds.FPHeapMax(0);
        fPHeapMax22.imprime();
        fPHeapMax22.constroi();
        fPHeapMax22.imprime();
        ds.FPHeapMax fPHeapMax27 = new ds.FPHeapMax((int) '4');
        ds.Item item28 = fPHeapMax27.max();
        ds.FPHeapMax fPHeapMax30 = new ds.FPHeapMax(0);
        fPHeapMax30.imprime();
        ds.Item[] itemArray32 = new ds.Item[] {};
        fPHeapMax30.copia(itemArray32);
        fPHeapMax30.constroi();
        fPHeapMax30.imprime();
        ds.Item[] itemArray36 = new ds.Item[] {};
        fPHeapMax30.copia(itemArray36);
        fPHeapMax27.copia(itemArray36);
        fPHeapMax22.copia(itemArray36);
        fPHeapMax20.copia(itemArray36);
        fPHeapMax17.copia(itemArray36);
        fPHeapMax14.copia(itemArray36);
        fPHeapMax5.copia(itemArray36);
        ds.FPHeapMax fPHeapMax45 = new ds.FPHeapMax((int) (byte) -1);
        fPHeapMax45.constroi();
        fPHeapMax45.imprime();
        ds.Item[] itemArray48 = new ds.Item[] {};
        fPHeapMax45.copia(itemArray48);
        fPHeapMax5.copia(itemArray48);
        fPHeapMax1.copia(itemArray48);
        // The following exception was thrown during execution in test generation
        try {
            ds.Item item52 = fPHeapMax1.retiraMax();
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: heap vazio");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray7);
        org.junit.Assert.assertNull(item18);
        org.junit.Assert.assertNull(item28);
        org.junit.Assert.assertNotNull(itemArray32);
        org.junit.Assert.assertNotNull(itemArray36);
        org.junit.Assert.assertNotNull(itemArray48);
    }

    @Test
    public void test244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test244");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax(1);
        fPHeapMax1.constroi();
        fPHeapMax1.imprime();
        fPHeapMax1.constroi();
        ds.FPHeapMax fPHeapMax6 = new ds.FPHeapMax((int) (byte) -1);
        fPHeapMax6.constroi();
        fPHeapMax6.constroi();
        fPHeapMax6.constroi();
        ds.FPHeapMax fPHeapMax11 = new ds.FPHeapMax(0);
        fPHeapMax11.imprime();
        fPHeapMax11.constroi();
        ds.FPHeapMax fPHeapMax15 = new ds.FPHeapMax(0);
        ds.Item item16 = null;
        ds.Item[] itemArray17 = new ds.Item[] { item16 };
        fPHeapMax15.copia(itemArray17);
        fPHeapMax11.copia(itemArray17);
        fPHeapMax6.copia(itemArray17);
        fPHeapMax1.copia(itemArray17);
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMax1.refaz((int) (byte) 100, (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 100");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray17);
    }

    @Test
    public void test245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test245");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (short) -1);
        ds.FPHeapMax fPHeapMax4 = new ds.FPHeapMax((int) '#');
        ds.FPHeapMax fPHeapMax6 = new ds.FPHeapMax(0);
        fPHeapMax6.imprime();
        fPHeapMax6.constroi();
        ds.FPHeapMax fPHeapMax10 = new ds.FPHeapMax(0);
        ds.Item item11 = null;
        ds.Item[] itemArray12 = new ds.Item[] { item11 };
        fPHeapMax10.copia(itemArray12);
        fPHeapMax6.copia(itemArray12);
        fPHeapMax4.copia(itemArray12);
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMax1.aumentaChave(10, (java.lang.Object) itemArray12);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 10");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray12);
    }

    @Test
    public void test246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test246");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) '#');
        ds.FPHeapMax fPHeapMax3 = new ds.FPHeapMax(0);
        fPHeapMax3.imprime();
        fPHeapMax3.constroi();
        ds.FPHeapMax fPHeapMax7 = new ds.FPHeapMax(0);
        ds.Item item8 = null;
        ds.Item[] itemArray9 = new ds.Item[] { item8 };
        fPHeapMax7.copia(itemArray9);
        fPHeapMax3.copia(itemArray9);
        fPHeapMax1.copia(itemArray9);
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMax1.refaz((int) (short) 1, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray9);
    }

    @Test
    public void test247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test247");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax(1);
        fPHeapMax1.constroi();
        fPHeapMax1.imprime();
        ds.FPHeapMax fPHeapMax5 = new ds.FPHeapMax((int) '4');
        ds.Item item6 = fPHeapMax5.max();
        ds.FPHeapMax fPHeapMax8 = new ds.FPHeapMax(0);
        fPHeapMax8.imprime();
        ds.Item[] itemArray10 = new ds.Item[] {};
        fPHeapMax8.copia(itemArray10);
        fPHeapMax8.constroi();
        fPHeapMax8.imprime();
        ds.Item[] itemArray14 = new ds.Item[] {};
        fPHeapMax8.copia(itemArray14);
        fPHeapMax5.copia(itemArray14);
        fPHeapMax1.copia(itemArray14);
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMax1.aumentaChave(100, (java.lang.Object) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 100");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(item6);
        org.junit.Assert.assertNotNull(itemArray10);
        org.junit.Assert.assertNotNull(itemArray14);
    }

    @Test
    public void test248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test248");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (byte) 10);
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMax1.refaz((int) '#', (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 35");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test249");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) ' ');
        ds.Item item2 = fPHeapMax1.max();
        org.junit.Assert.assertNull(item2);
    }

    @Test
    public void test250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test250");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (byte) -1);
        fPHeapMax1.constroi();
        fPHeapMax1.constroi();
        fPHeapMax1.constroi();
        ds.FPHeapMax fPHeapMax6 = new ds.FPHeapMax((int) (byte) -1);
        fPHeapMax6.constroi();
        fPHeapMax6.imprime();
        ds.FPHeapMax fPHeapMax10 = new ds.FPHeapMax(0);
        fPHeapMax10.imprime();
        fPHeapMax10.constroi();
        fPHeapMax10.imprime();
        fPHeapMax10.constroi();
        ds.Item item15 = null;
        ds.Item[] itemArray16 = new ds.Item[] { item15 };
        fPHeapMax10.copia(itemArray16);
        ds.FPHeapMax fPHeapMax19 = new ds.FPHeapMax(0);
        ds.Item item20 = null;
        ds.Item[] itemArray21 = new ds.Item[] { item20 };
        fPHeapMax19.copia(itemArray21);
        fPHeapMax19.imprime();
        ds.FPHeapMax fPHeapMax25 = new ds.FPHeapMax((int) (byte) -1);
        fPHeapMax25.constroi();
        fPHeapMax25.imprime();
        ds.Item[] itemArray28 = new ds.Item[] {};
        fPHeapMax25.copia(itemArray28);
        fPHeapMax19.copia(itemArray28);
        fPHeapMax10.copia(itemArray28);
        fPHeapMax6.copia(itemArray28);
        fPHeapMax1.copia(itemArray28);
        // The following exception was thrown during execution in test generation
        try {
            ds.Item item34 = fPHeapMax1.max();
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray16);
        org.junit.Assert.assertNotNull(itemArray21);
        org.junit.Assert.assertNotNull(itemArray28);
    }

    @Test
    public void test251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test251");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax(0);
        fPHeapMax1.imprime();
        ds.Item[] itemArray3 = new ds.Item[] {};
        fPHeapMax1.copia(itemArray3);
        fPHeapMax1.constroi();
        fPHeapMax1.imprime();
        fPHeapMax1.imprime();
        fPHeapMax1.constroi();
        ds.FPHeapMax fPHeapMax10 = new ds.FPHeapMax(0);
        fPHeapMax10.imprime();
        ds.FPHeapMax fPHeapMax13 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item14 = fPHeapMax13.max();
        ds.FPHeapMax fPHeapMax16 = new ds.FPHeapMax((int) '4');
        ds.FPHeapMax fPHeapMax18 = new ds.FPHeapMax(0);
        fPHeapMax18.imprime();
        fPHeapMax18.constroi();
        fPHeapMax18.imprime();
        ds.FPHeapMax fPHeapMax23 = new ds.FPHeapMax((int) '4');
        ds.Item item24 = fPHeapMax23.max();
        ds.FPHeapMax fPHeapMax26 = new ds.FPHeapMax(0);
        fPHeapMax26.imprime();
        ds.Item[] itemArray28 = new ds.Item[] {};
        fPHeapMax26.copia(itemArray28);
        fPHeapMax26.constroi();
        fPHeapMax26.imprime();
        ds.Item[] itemArray32 = new ds.Item[] {};
        fPHeapMax26.copia(itemArray32);
        fPHeapMax23.copia(itemArray32);
        fPHeapMax18.copia(itemArray32);
        fPHeapMax16.copia(itemArray32);
        fPHeapMax13.copia(itemArray32);
        fPHeapMax10.copia(itemArray32);
        fPHeapMax1.copia(itemArray32);
        ds.Item item40 = null;
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMax1.insere(item40);
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: heap cheio");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertNull(item14);
        org.junit.Assert.assertNull(item24);
        org.junit.Assert.assertNotNull(itemArray28);
        org.junit.Assert.assertNotNull(itemArray32);
    }

    @Test
    public void test252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test252");
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
    public void test253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test253");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax(0);
        fPHeapMax1.imprime();
        fPHeapMax1.constroi();
        fPHeapMax1.imprime();
        ds.FPHeapMax fPHeapMax6 = new ds.FPHeapMax((int) '4');
        ds.Item item7 = fPHeapMax6.max();
        ds.FPHeapMax fPHeapMax9 = new ds.FPHeapMax(0);
        fPHeapMax9.imprime();
        ds.Item[] itemArray11 = new ds.Item[] {};
        fPHeapMax9.copia(itemArray11);
        fPHeapMax9.constroi();
        fPHeapMax9.imprime();
        ds.Item[] itemArray15 = new ds.Item[] {};
        fPHeapMax9.copia(itemArray15);
        fPHeapMax6.copia(itemArray15);
        fPHeapMax1.copia(itemArray15);
        java.lang.Class<?> wildcardClass19 = itemArray15.getClass();
        org.junit.Assert.assertNull(item7);
        org.junit.Assert.assertNotNull(itemArray11);
        org.junit.Assert.assertNotNull(itemArray15);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test254");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (short) 0);
        fPHeapMax1.imprime();
        fPHeapMax1.constroi();
        fPHeapMax1.constroi();
        java.lang.Class<?> wildcardClass5 = fPHeapMax1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test255");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax(0);
        fPHeapMax1.imprime();
        ds.FPHeapMax fPHeapMax4 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item5 = fPHeapMax4.max();
        ds.FPHeapMax fPHeapMax7 = new ds.FPHeapMax((int) '4');
        ds.FPHeapMax fPHeapMax9 = new ds.FPHeapMax(0);
        fPHeapMax9.imprime();
        fPHeapMax9.constroi();
        fPHeapMax9.imprime();
        ds.FPHeapMax fPHeapMax14 = new ds.FPHeapMax((int) '4');
        ds.Item item15 = fPHeapMax14.max();
        ds.FPHeapMax fPHeapMax17 = new ds.FPHeapMax(0);
        fPHeapMax17.imprime();
        ds.Item[] itemArray19 = new ds.Item[] {};
        fPHeapMax17.copia(itemArray19);
        fPHeapMax17.constroi();
        fPHeapMax17.imprime();
        ds.Item[] itemArray23 = new ds.Item[] {};
        fPHeapMax17.copia(itemArray23);
        fPHeapMax14.copia(itemArray23);
        fPHeapMax9.copia(itemArray23);
        fPHeapMax7.copia(itemArray23);
        fPHeapMax4.copia(itemArray23);
        fPHeapMax1.copia(itemArray23);
        ds.Item item30 = null;
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMax1.insere(item30);
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: heap cheio");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(item5);
        org.junit.Assert.assertNull(item15);
        org.junit.Assert.assertNotNull(itemArray19);
        org.junit.Assert.assertNotNull(itemArray23);
    }

    @Test
    public void test256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test256");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (byte) -1);
        fPHeapMax1.constroi();
        ds.FPHeapMax fPHeapMax5 = new ds.FPHeapMax((int) ' ');
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMax1.aumentaChave(10, (java.lang.Object) fPHeapMax5);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 10");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test257");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax(0);
        fPHeapMax1.imprime();
        fPHeapMax1.constroi();
        fPHeapMax1.imprime();
        fPHeapMax1.constroi();
        ds.Item item6 = null;
        ds.Item[] itemArray7 = new ds.Item[] { item6 };
        fPHeapMax1.copia(itemArray7);
        ds.FPHeapMax fPHeapMax10 = new ds.FPHeapMax(0);
        ds.Item item11 = null;
        ds.Item[] itemArray12 = new ds.Item[] { item11 };
        fPHeapMax10.copia(itemArray12);
        fPHeapMax10.imprime();
        ds.FPHeapMax fPHeapMax16 = new ds.FPHeapMax((int) (byte) -1);
        fPHeapMax16.constroi();
        fPHeapMax16.imprime();
        ds.Item[] itemArray19 = new ds.Item[] {};
        fPHeapMax16.copia(itemArray19);
        fPHeapMax10.copia(itemArray19);
        fPHeapMax1.copia(itemArray19);
        ds.FPHeapMax fPHeapMax24 = new ds.FPHeapMax(0);
        fPHeapMax24.imprime();
        fPHeapMax24.constroi();
        fPHeapMax24.imprime();
        fPHeapMax24.constroi();
        fPHeapMax24.imprime();
        ds.FPHeapMax fPHeapMax31 = new ds.FPHeapMax(1);
        fPHeapMax31.constroi();
        fPHeapMax31.imprime();
        ds.FPHeapMax fPHeapMax35 = new ds.FPHeapMax((int) '4');
        ds.Item item36 = fPHeapMax35.max();
        ds.FPHeapMax fPHeapMax38 = new ds.FPHeapMax(0);
        fPHeapMax38.imprime();
        ds.Item[] itemArray40 = new ds.Item[] {};
        fPHeapMax38.copia(itemArray40);
        fPHeapMax38.constroi();
        fPHeapMax38.imprime();
        ds.Item[] itemArray44 = new ds.Item[] {};
        fPHeapMax38.copia(itemArray44);
        fPHeapMax35.copia(itemArray44);
        fPHeapMax31.copia(itemArray44);
        fPHeapMax24.copia(itemArray44);
        fPHeapMax1.copia(itemArray44);
        ds.Item item50 = null;
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMax1.insere(item50);
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: heap cheio");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray7);
        org.junit.Assert.assertNotNull(itemArray12);
        org.junit.Assert.assertNotNull(itemArray19);
        org.junit.Assert.assertNull(item36);
        org.junit.Assert.assertNotNull(itemArray40);
        org.junit.Assert.assertNotNull(itemArray44);
    }

    @Test
    public void test258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test258");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (byte) -1);
        fPHeapMax1.constroi();
        fPHeapMax1.imprime();
        ds.FPHeapMax fPHeapMax5 = new ds.FPHeapMax(0);
        ds.Item item6 = null;
        ds.Item[] itemArray7 = new ds.Item[] { item6 };
        fPHeapMax5.copia(itemArray7);
        fPHeapMax1.copia(itemArray7);
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMax1.refaz((-1), (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray7);
    }

    @Test
    public void test259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test259");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax(1);
        fPHeapMax1.constroi();
        fPHeapMax1.imprime();
        ds.FPHeapMax fPHeapMax5 = new ds.FPHeapMax((int) '4');
        ds.Item item6 = fPHeapMax5.max();
        ds.FPHeapMax fPHeapMax8 = new ds.FPHeapMax(0);
        fPHeapMax8.imprime();
        ds.Item[] itemArray10 = new ds.Item[] {};
        fPHeapMax8.copia(itemArray10);
        fPHeapMax8.constroi();
        fPHeapMax8.imprime();
        ds.Item[] itemArray14 = new ds.Item[] {};
        fPHeapMax8.copia(itemArray14);
        fPHeapMax5.copia(itemArray14);
        fPHeapMax1.copia(itemArray14);
        ds.Item item18 = fPHeapMax1.max();
        ds.Item item19 = fPHeapMax1.max();
        ds.Item item20 = fPHeapMax1.max();
        ds.Item item21 = null;
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMax1.insere(item21);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(item6);
        org.junit.Assert.assertNotNull(itemArray10);
        org.junit.Assert.assertNotNull(itemArray14);
        org.junit.Assert.assertNull(item18);
        org.junit.Assert.assertNull(item19);
        org.junit.Assert.assertNull(item20);
    }

    @Test
    public void test260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test260");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax(0);
        fPHeapMax1.imprime();
        fPHeapMax1.constroi();
        fPHeapMax1.imprime();
        fPHeapMax1.constroi();
        fPHeapMax1.imprime();
        ds.FPHeapMax fPHeapMax8 = new ds.FPHeapMax(0);
        ds.Item item9 = null;
        ds.Item[] itemArray10 = new ds.Item[] { item9 };
        fPHeapMax8.copia(itemArray10);
        fPHeapMax8.imprime();
        ds.FPHeapMax fPHeapMax14 = new ds.FPHeapMax((int) (byte) -1);
        fPHeapMax14.constroi();
        fPHeapMax14.imprime();
        ds.Item[] itemArray17 = new ds.Item[] {};
        fPHeapMax14.copia(itemArray17);
        fPHeapMax8.copia(itemArray17);
        fPHeapMax1.copia(itemArray17);
        fPHeapMax1.constroi();
        fPHeapMax1.constroi();
        java.lang.Class<?> wildcardClass23 = fPHeapMax1.getClass();
        org.junit.Assert.assertNotNull(itemArray10);
        org.junit.Assert.assertNotNull(itemArray17);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test261");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (byte) 0);
        ds.FPHeapMax fPHeapMax3 = new ds.FPHeapMax(0);
        fPHeapMax3.imprime();
        ds.Item[] itemArray5 = new ds.Item[] {};
        fPHeapMax3.copia(itemArray5);
        fPHeapMax3.constroi();
        fPHeapMax3.imprime();
        ds.Item[] itemArray9 = new ds.Item[] {};
        fPHeapMax3.copia(itemArray9);
        fPHeapMax1.copia(itemArray9);
        java.lang.Class<?> wildcardClass12 = itemArray9.getClass();
        org.junit.Assert.assertNotNull(itemArray5);
        org.junit.Assert.assertNotNull(itemArray9);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test262");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax(0);
        ds.Item item2 = null;
        ds.Item[] itemArray3 = new ds.Item[] { item2 };
        fPHeapMax1.copia(itemArray3);
        fPHeapMax1.imprime();
        ds.FPHeapMax fPHeapMax7 = new ds.FPHeapMax((int) (byte) -1);
        fPHeapMax7.constroi();
        fPHeapMax7.imprime();
        ds.Item[] itemArray10 = new ds.Item[] {};
        fPHeapMax7.copia(itemArray10);
        fPHeapMax1.copia(itemArray10);
        // The following exception was thrown during execution in test generation
        try {
            ds.Item item13 = fPHeapMax1.max();
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertNotNull(itemArray10);
    }

    @Test
    public void test263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test263");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (byte) 0);
        java.lang.Class<?> wildcardClass2 = fPHeapMax1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test264");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax(1);
        fPHeapMax1.constroi();
        ds.Item item3 = fPHeapMax1.max();
        fPHeapMax1.imprime();
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMax1.refaz((-1), (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(item3);
    }

    @Test
    public void test265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test265");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) ' ');
        ds.FPHeapMax fPHeapMax3 = new ds.FPHeapMax(0);
        ds.Item item4 = null;
        ds.Item[] itemArray5 = new ds.Item[] { item4 };
        fPHeapMax3.copia(itemArray5);
        fPHeapMax1.copia(itemArray5);
        java.lang.Class<?> wildcardClass8 = itemArray5.getClass();
        org.junit.Assert.assertNotNull(itemArray5);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test266");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax(0);
        fPHeapMax1.imprime();
        fPHeapMax1.constroi();
        fPHeapMax1.imprime();
        fPHeapMax1.constroi();
        fPHeapMax1.imprime();
        ds.FPHeapMax fPHeapMax8 = new ds.FPHeapMax(0);
        ds.Item item9 = null;
        ds.Item[] itemArray10 = new ds.Item[] { item9 };
        fPHeapMax8.copia(itemArray10);
        fPHeapMax8.imprime();
        ds.FPHeapMax fPHeapMax14 = new ds.FPHeapMax((int) (byte) -1);
        fPHeapMax14.constroi();
        fPHeapMax14.imprime();
        ds.Item[] itemArray17 = new ds.Item[] {};
        fPHeapMax14.copia(itemArray17);
        fPHeapMax8.copia(itemArray17);
        fPHeapMax1.copia(itemArray17);
        fPHeapMax1.constroi();
        // The following exception was thrown during execution in test generation
        try {
            ds.Item item22 = fPHeapMax1.retiraMax();
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: heap vazio");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray10);
        org.junit.Assert.assertNotNull(itemArray17);
    }

    @Test
    public void test267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test267");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) ' ');
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
    public void test268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test268");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (byte) -1);
        fPHeapMax1.constroi();
        fPHeapMax1.imprime();
        ds.Item[] itemArray4 = new ds.Item[] {};
        fPHeapMax1.copia(itemArray4);
        fPHeapMax1.constroi();
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMax1.refaz((int) (byte) 1, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray4);
    }

    @Test
    public void test269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test269");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((-1));
        fPHeapMax1.imprime();
        fPHeapMax1.imprime();
        ds.FPHeapMax fPHeapMax5 = new ds.FPHeapMax(0);
        fPHeapMax5.imprime();
        fPHeapMax5.constroi();
        fPHeapMax5.imprime();
        ds.FPHeapMax fPHeapMax10 = new ds.FPHeapMax((int) '4');
        ds.Item item11 = fPHeapMax10.max();
        ds.FPHeapMax fPHeapMax13 = new ds.FPHeapMax(0);
        fPHeapMax13.imprime();
        ds.Item[] itemArray15 = new ds.Item[] {};
        fPHeapMax13.copia(itemArray15);
        fPHeapMax13.constroi();
        fPHeapMax13.imprime();
        ds.Item[] itemArray19 = new ds.Item[] {};
        fPHeapMax13.copia(itemArray19);
        fPHeapMax10.copia(itemArray19);
        fPHeapMax5.copia(itemArray19);
        fPHeapMax1.copia(itemArray19);
        fPHeapMax1.constroi();
        fPHeapMax1.imprime();
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMax1.refaz((int) ' ', (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 32");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(item11);
        org.junit.Assert.assertNotNull(itemArray15);
        org.junit.Assert.assertNotNull(itemArray19);
    }

    @Test
    public void test270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test270");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((-1));
        fPHeapMax1.imprime();
        fPHeapMax1.imprime();
        ds.FPHeapMax fPHeapMax5 = new ds.FPHeapMax(0);
        fPHeapMax5.imprime();
        fPHeapMax5.constroi();
        fPHeapMax5.imprime();
        ds.FPHeapMax fPHeapMax10 = new ds.FPHeapMax((int) '4');
        ds.Item item11 = fPHeapMax10.max();
        ds.FPHeapMax fPHeapMax13 = new ds.FPHeapMax(0);
        fPHeapMax13.imprime();
        ds.Item[] itemArray15 = new ds.Item[] {};
        fPHeapMax13.copia(itemArray15);
        fPHeapMax13.constroi();
        fPHeapMax13.imprime();
        ds.Item[] itemArray19 = new ds.Item[] {};
        fPHeapMax13.copia(itemArray19);
        fPHeapMax10.copia(itemArray19);
        fPHeapMax5.copia(itemArray19);
        fPHeapMax1.copia(itemArray19);
        // The following exception was thrown during execution in test generation
        try {
            ds.Item item24 = fPHeapMax1.retiraMax();
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: heap vazio");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(item11);
        org.junit.Assert.assertNotNull(itemArray15);
        org.junit.Assert.assertNotNull(itemArray19);
    }

    @Test
    public void test271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test271");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax(1);
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMax1.refaz((-1), (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test272");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((-1));
        fPHeapMax1.imprime();
        fPHeapMax1.imprime();
        ds.FPHeapMax fPHeapMax5 = new ds.FPHeapMax(0);
        fPHeapMax5.imprime();
        fPHeapMax5.constroi();
        fPHeapMax5.imprime();
        ds.FPHeapMax fPHeapMax10 = new ds.FPHeapMax((int) '4');
        ds.Item item11 = fPHeapMax10.max();
        ds.FPHeapMax fPHeapMax13 = new ds.FPHeapMax(0);
        fPHeapMax13.imprime();
        ds.Item[] itemArray15 = new ds.Item[] {};
        fPHeapMax13.copia(itemArray15);
        fPHeapMax13.constroi();
        fPHeapMax13.imprime();
        ds.Item[] itemArray19 = new ds.Item[] {};
        fPHeapMax13.copia(itemArray19);
        fPHeapMax10.copia(itemArray19);
        fPHeapMax5.copia(itemArray19);
        fPHeapMax1.copia(itemArray19);
        fPHeapMax1.imprime();
        fPHeapMax1.constroi();
        ds.FPHeapMax fPHeapMax28 = new ds.FPHeapMax((-1));
        fPHeapMax28.imprime();
        fPHeapMax28.imprime();
        ds.FPHeapMax fPHeapMax32 = new ds.FPHeapMax(0);
        fPHeapMax32.imprime();
        fPHeapMax32.constroi();
        fPHeapMax32.imprime();
        ds.FPHeapMax fPHeapMax37 = new ds.FPHeapMax((int) '4');
        ds.Item item38 = fPHeapMax37.max();
        ds.FPHeapMax fPHeapMax40 = new ds.FPHeapMax(0);
        fPHeapMax40.imprime();
        ds.Item[] itemArray42 = new ds.Item[] {};
        fPHeapMax40.copia(itemArray42);
        fPHeapMax40.constroi();
        fPHeapMax40.imprime();
        ds.Item[] itemArray46 = new ds.Item[] {};
        fPHeapMax40.copia(itemArray46);
        fPHeapMax37.copia(itemArray46);
        fPHeapMax32.copia(itemArray46);
        fPHeapMax28.copia(itemArray46);
        fPHeapMax28.imprime();
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMax1.aumentaChave((int) (byte) 10, (java.lang.Object) fPHeapMax28);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 10");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(item11);
        org.junit.Assert.assertNotNull(itemArray15);
        org.junit.Assert.assertNotNull(itemArray19);
        org.junit.Assert.assertNull(item38);
        org.junit.Assert.assertNotNull(itemArray42);
        org.junit.Assert.assertNotNull(itemArray46);
    }

    @Test
    public void test273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test273");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax(0);
        fPHeapMax1.imprime();
        fPHeapMax1.constroi();
        fPHeapMax1.imprime();
        ds.FPHeapMax fPHeapMax6 = new ds.FPHeapMax((int) '4');
        ds.Item item7 = fPHeapMax6.max();
        ds.FPHeapMax fPHeapMax9 = new ds.FPHeapMax(0);
        fPHeapMax9.imprime();
        ds.Item[] itemArray11 = new ds.Item[] {};
        fPHeapMax9.copia(itemArray11);
        fPHeapMax9.constroi();
        fPHeapMax9.imprime();
        ds.Item[] itemArray15 = new ds.Item[] {};
        fPHeapMax9.copia(itemArray15);
        fPHeapMax6.copia(itemArray15);
        fPHeapMax1.copia(itemArray15);
        fPHeapMax1.imprime();
        ds.Item item20 = null;
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMax1.insere(item20);
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: heap cheio");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(item7);
        org.junit.Assert.assertNotNull(itemArray11);
        org.junit.Assert.assertNotNull(itemArray15);
    }

    @Test
    public void test274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test274");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax(0);
        fPHeapMax1.constroi();
        fPHeapMax1.constroi();
        fPHeapMax1.constroi();
        fPHeapMax1.constroi();
        ds.FPHeapMax fPHeapMax7 = new ds.FPHeapMax(0);
        fPHeapMax7.imprime();
        ds.Item[] itemArray9 = new ds.Item[] {};
        fPHeapMax7.copia(itemArray9);
        fPHeapMax1.copia(itemArray9);
        fPHeapMax1.constroi();
        org.junit.Assert.assertNotNull(itemArray9);
    }

    @Test
    public void test275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test275");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax(0);
        ds.Item item2 = null;
        ds.Item[] itemArray3 = new ds.Item[] { item2 };
        fPHeapMax1.copia(itemArray3);
        fPHeapMax1.imprime();
        ds.FPHeapMax fPHeapMax7 = new ds.FPHeapMax((int) (byte) -1);
        fPHeapMax7.constroi();
        fPHeapMax7.imprime();
        ds.Item[] itemArray10 = new ds.Item[] {};
        fPHeapMax7.copia(itemArray10);
        fPHeapMax1.copia(itemArray10);
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMax1.refaz(10, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 10");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertNotNull(itemArray10);
    }

    @Test
    public void test276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test276");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) ' ');
        fPHeapMax1.imprime();
        java.lang.Class<?> wildcardClass3 = fPHeapMax1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test277");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax(0);
        fPHeapMax1.imprime();
        fPHeapMax1.constroi();
        fPHeapMax1.imprime();
        fPHeapMax1.constroi();
        fPHeapMax1.imprime();
        ds.FPHeapMax fPHeapMax8 = new ds.FPHeapMax((int) (byte) -1);
        fPHeapMax8.constroi();
        fPHeapMax8.constroi();
        fPHeapMax8.constroi();
        ds.FPHeapMax fPHeapMax13 = new ds.FPHeapMax(0);
        fPHeapMax13.imprime();
        fPHeapMax13.constroi();
        ds.FPHeapMax fPHeapMax17 = new ds.FPHeapMax(0);
        ds.Item item18 = null;
        ds.Item[] itemArray19 = new ds.Item[] { item18 };
        fPHeapMax17.copia(itemArray19);
        fPHeapMax13.copia(itemArray19);
        fPHeapMax8.copia(itemArray19);
        fPHeapMax1.copia(itemArray19);
        // The following exception was thrown during execution in test generation
        try {
            ds.Item item24 = fPHeapMax1.retiraMax();
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: heap vazio");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray19);
    }

    @Test
    public void test278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test278");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (byte) -1);
        fPHeapMax1.constroi();
        fPHeapMax1.constroi();
        fPHeapMax1.constroi();
        ds.FPHeapMax fPHeapMax6 = new ds.FPHeapMax(0);
        fPHeapMax6.imprime();
        fPHeapMax6.constroi();
        ds.FPHeapMax fPHeapMax10 = new ds.FPHeapMax(0);
        ds.Item item11 = null;
        ds.Item[] itemArray12 = new ds.Item[] { item11 };
        fPHeapMax10.copia(itemArray12);
        fPHeapMax6.copia(itemArray12);
        fPHeapMax1.copia(itemArray12);
        fPHeapMax1.imprime();
        ds.FPHeapMax fPHeapMax19 = new ds.FPHeapMax(0);
        fPHeapMax19.imprime();
        ds.Item[] itemArray21 = new ds.Item[] {};
        fPHeapMax19.copia(itemArray21);
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMax1.aumentaChave((int) 'a', (java.lang.Object) itemArray21);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 97");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray12);
        org.junit.Assert.assertNotNull(itemArray21);
    }

    @Test
    public void test279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test279");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (short) 10);
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMax1.refaz((int) ' ', 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 32");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test280");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax(0);
        ds.Item item2 = null;
        ds.Item[] itemArray3 = new ds.Item[] { item2 };
        fPHeapMax1.copia(itemArray3);
        fPHeapMax1.imprime();
        ds.FPHeapMax fPHeapMax7 = new ds.FPHeapMax((int) (byte) -1);
        fPHeapMax7.constroi();
        fPHeapMax7.imprime();
        ds.Item[] itemArray10 = new ds.Item[] {};
        fPHeapMax7.copia(itemArray10);
        fPHeapMax1.copia(itemArray10);
        fPHeapMax1.constroi();
        // The following exception was thrown during execution in test generation
        try {
            ds.Item item14 = fPHeapMax1.retiraMax();
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: heap vazio");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertNotNull(itemArray10);
    }

    @Test
    public void test281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test281");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (byte) -1);
        fPHeapMax1.constroi();
        fPHeapMax1.constroi();
        fPHeapMax1.constroi();
        ds.FPHeapMax fPHeapMax6 = new ds.FPHeapMax(0);
        fPHeapMax6.imprime();
        fPHeapMax6.constroi();
        ds.FPHeapMax fPHeapMax10 = new ds.FPHeapMax(0);
        ds.Item item11 = null;
        ds.Item[] itemArray12 = new ds.Item[] { item11 };
        fPHeapMax10.copia(itemArray12);
        fPHeapMax6.copia(itemArray12);
        fPHeapMax1.copia(itemArray12);
        fPHeapMax1.imprime();
        // The following exception was thrown during execution in test generation
        try {
            ds.Item item17 = fPHeapMax1.max();
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray12);
    }

    @Test
    public void test282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test282");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) 'a');
        ds.FPHeapMax fPHeapMax3 = new ds.FPHeapMax(0);
        fPHeapMax3.imprime();
        fPHeapMax3.constroi();
        fPHeapMax3.imprime();
        fPHeapMax3.constroi();
        fPHeapMax3.imprime();
        ds.FPHeapMax fPHeapMax10 = new ds.FPHeapMax(1);
        fPHeapMax10.constroi();
        fPHeapMax10.imprime();
        ds.FPHeapMax fPHeapMax14 = new ds.FPHeapMax((int) '4');
        ds.Item item15 = fPHeapMax14.max();
        ds.FPHeapMax fPHeapMax17 = new ds.FPHeapMax(0);
        fPHeapMax17.imprime();
        ds.Item[] itemArray19 = new ds.Item[] {};
        fPHeapMax17.copia(itemArray19);
        fPHeapMax17.constroi();
        fPHeapMax17.imprime();
        ds.Item[] itemArray23 = new ds.Item[] {};
        fPHeapMax17.copia(itemArray23);
        fPHeapMax14.copia(itemArray23);
        fPHeapMax10.copia(itemArray23);
        fPHeapMax3.copia(itemArray23);
        fPHeapMax1.copia(itemArray23);
        java.lang.Class<?> wildcardClass29 = itemArray23.getClass();
        org.junit.Assert.assertNull(item15);
        org.junit.Assert.assertNotNull(itemArray19);
        org.junit.Assert.assertNotNull(itemArray23);
        org.junit.Assert.assertNotNull(wildcardClass29);
    }

    @Test
    public void test283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test283");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) '#');
        ds.FPHeapMax fPHeapMax3 = new ds.FPHeapMax(0);
        fPHeapMax3.imprime();
        fPHeapMax3.constroi();
        ds.FPHeapMax fPHeapMax7 = new ds.FPHeapMax(0);
        ds.Item item8 = null;
        ds.Item[] itemArray9 = new ds.Item[] { item8 };
        fPHeapMax7.copia(itemArray9);
        fPHeapMax3.copia(itemArray9);
        fPHeapMax1.copia(itemArray9);
        ds.Item item13 = fPHeapMax1.max();
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMax1.refaz(100, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 100");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray9);
        org.junit.Assert.assertNull(item13);
    }

    @Test
    public void test284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test284");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax(0);
        fPHeapMax1.imprime();
        fPHeapMax1.constroi();
        fPHeapMax1.imprime();
        fPHeapMax1.constroi();
        fPHeapMax1.imprime();
        ds.FPHeapMax fPHeapMax8 = new ds.FPHeapMax((int) (byte) -1);
        fPHeapMax8.constroi();
        fPHeapMax8.imprime();
        ds.Item[] itemArray11 = new ds.Item[] {};
        fPHeapMax8.copia(itemArray11);
        fPHeapMax1.copia(itemArray11);
        ds.Item item14 = null;
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMax1.insere(item14);
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: heap cheio");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray11);
    }

    @Test
    public void test285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test285");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) '#');
        ds.FPHeapMax fPHeapMax3 = new ds.FPHeapMax(0);
        fPHeapMax3.imprime();
        fPHeapMax3.constroi();
        ds.FPHeapMax fPHeapMax7 = new ds.FPHeapMax(0);
        ds.Item item8 = null;
        ds.Item[] itemArray9 = new ds.Item[] { item8 };
        fPHeapMax7.copia(itemArray9);
        fPHeapMax3.copia(itemArray9);
        fPHeapMax1.copia(itemArray9);
        ds.Item item13 = fPHeapMax1.max();
        ds.FPHeapMax fPHeapMax16 = new ds.FPHeapMax((int) '4');
        ds.Item item17 = fPHeapMax16.max();
        ds.FPHeapMax fPHeapMax19 = new ds.FPHeapMax(0);
        fPHeapMax19.imprime();
        ds.Item[] itemArray21 = new ds.Item[] {};
        fPHeapMax19.copia(itemArray21);
        fPHeapMax19.constroi();
        fPHeapMax19.imprime();
        ds.Item[] itemArray25 = new ds.Item[] {};
        fPHeapMax19.copia(itemArray25);
        fPHeapMax16.copia(itemArray25);
        fPHeapMax16.imprime();
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMax1.aumentaChave((int) '4', (java.lang.Object) fPHeapMax16);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 52");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray9);
        org.junit.Assert.assertNull(item13);
        org.junit.Assert.assertNull(item17);
        org.junit.Assert.assertNotNull(itemArray21);
        org.junit.Assert.assertNotNull(itemArray25);
    }

    @Test
    public void test286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test286");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax(0);
        fPHeapMax1.constroi();
        fPHeapMax1.constroi();
        ds.Item item4 = null;
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMax1.insere(item4);
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: heap cheio");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
    }

    @Test
    public void test287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test287");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax(0);
        ds.Item item2 = null;
        ds.Item[] itemArray3 = new ds.Item[] { item2 };
        fPHeapMax1.copia(itemArray3);
        fPHeapMax1.imprime();
        ds.FPHeapMax fPHeapMax7 = new ds.FPHeapMax((int) (byte) -1);
        fPHeapMax7.constroi();
        fPHeapMax7.imprime();
        ds.Item[] itemArray10 = new ds.Item[] {};
        fPHeapMax7.copia(itemArray10);
        fPHeapMax1.copia(itemArray10);
        ds.FPHeapMax fPHeapMax14 = new ds.FPHeapMax(0);
        fPHeapMax14.imprime();
        ds.Item[] itemArray16 = new ds.Item[] {};
        fPHeapMax14.copia(itemArray16);
        fPHeapMax1.copia(itemArray16);
        // The following exception was thrown during execution in test generation
        try {
            ds.Item item19 = fPHeapMax1.retiraMax();
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: heap vazio");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertNotNull(itemArray10);
        org.junit.Assert.assertNotNull(itemArray16);
    }

    @Test
    public void test288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test288");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((-1));
        fPHeapMax1.imprime();
        fPHeapMax1.imprime();
        ds.FPHeapMax fPHeapMax5 = new ds.FPHeapMax(0);
        fPHeapMax5.imprime();
        fPHeapMax5.constroi();
        fPHeapMax5.imprime();
        ds.FPHeapMax fPHeapMax10 = new ds.FPHeapMax((int) '4');
        ds.Item item11 = fPHeapMax10.max();
        ds.FPHeapMax fPHeapMax13 = new ds.FPHeapMax(0);
        fPHeapMax13.imprime();
        ds.Item[] itemArray15 = new ds.Item[] {};
        fPHeapMax13.copia(itemArray15);
        fPHeapMax13.constroi();
        fPHeapMax13.imprime();
        ds.Item[] itemArray19 = new ds.Item[] {};
        fPHeapMax13.copia(itemArray19);
        fPHeapMax10.copia(itemArray19);
        fPHeapMax5.copia(itemArray19);
        fPHeapMax1.copia(itemArray19);
        fPHeapMax1.imprime();
        fPHeapMax1.constroi();
        // The following exception was thrown during execution in test generation
        try {
            ds.Item item26 = fPHeapMax1.max();
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(item11);
        org.junit.Assert.assertNotNull(itemArray15);
        org.junit.Assert.assertNotNull(itemArray19);
    }

    @Test
    public void test289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test289");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (byte) -1);
        fPHeapMax1.constroi();
        fPHeapMax1.constroi();
        fPHeapMax1.constroi();
        ds.FPHeapMax fPHeapMax6 = new ds.FPHeapMax((int) (byte) -1);
        fPHeapMax6.constroi();
        fPHeapMax6.imprime();
        ds.FPHeapMax fPHeapMax10 = new ds.FPHeapMax(0);
        fPHeapMax10.imprime();
        fPHeapMax10.constroi();
        fPHeapMax10.imprime();
        fPHeapMax10.constroi();
        ds.Item item15 = null;
        ds.Item[] itemArray16 = new ds.Item[] { item15 };
        fPHeapMax10.copia(itemArray16);
        ds.FPHeapMax fPHeapMax19 = new ds.FPHeapMax(0);
        ds.Item item20 = null;
        ds.Item[] itemArray21 = new ds.Item[] { item20 };
        fPHeapMax19.copia(itemArray21);
        fPHeapMax19.imprime();
        ds.FPHeapMax fPHeapMax25 = new ds.FPHeapMax((int) (byte) -1);
        fPHeapMax25.constroi();
        fPHeapMax25.imprime();
        ds.Item[] itemArray28 = new ds.Item[] {};
        fPHeapMax25.copia(itemArray28);
        fPHeapMax19.copia(itemArray28);
        fPHeapMax10.copia(itemArray28);
        fPHeapMax6.copia(itemArray28);
        fPHeapMax1.copia(itemArray28);
        ds.FPHeapMax fPHeapMax36 = new ds.FPHeapMax((int) (short) 1);
        fPHeapMax36.constroi();
        ds.FPHeapMax fPHeapMax39 = new ds.FPHeapMax((int) (byte) -1);
        fPHeapMax39.constroi();
        fPHeapMax39.imprime();
        ds.FPHeapMax fPHeapMax43 = new ds.FPHeapMax(0);
        ds.Item item44 = null;
        ds.Item[] itemArray45 = new ds.Item[] { item44 };
        fPHeapMax43.copia(itemArray45);
        fPHeapMax39.copia(itemArray45);
        fPHeapMax36.copia(itemArray45);
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMax1.aumentaChave((int) (byte) 0, (java.lang.Object) fPHeapMax36);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 0");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray16);
        org.junit.Assert.assertNotNull(itemArray21);
        org.junit.Assert.assertNotNull(itemArray28);
        org.junit.Assert.assertNotNull(itemArray45);
    }

    @Test
    public void test290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test290");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (short) -1);
        fPHeapMax1.imprime();
        fPHeapMax1.constroi();
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMax1.refaz((int) (short) 0, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 0");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test291");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax(0);
        ds.Item item2 = null;
        ds.Item[] itemArray3 = new ds.Item[] { item2 };
        fPHeapMax1.copia(itemArray3);
        fPHeapMax1.imprime();
        ds.FPHeapMax fPHeapMax7 = new ds.FPHeapMax((int) (byte) -1);
        fPHeapMax7.constroi();
        fPHeapMax7.imprime();
        ds.Item[] itemArray10 = new ds.Item[] {};
        fPHeapMax7.copia(itemArray10);
        fPHeapMax1.copia(itemArray10);
        ds.FPHeapMax fPHeapMax14 = new ds.FPHeapMax(0);
        fPHeapMax14.imprime();
        ds.Item[] itemArray16 = new ds.Item[] {};
        fPHeapMax14.copia(itemArray16);
        fPHeapMax1.copia(itemArray16);
        fPHeapMax1.constroi();
        ds.Item[] itemArray20 = null;
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMax1.copia(itemArray20);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertNotNull(itemArray10);
        org.junit.Assert.assertNotNull(itemArray16);
    }

    @Test
    public void test292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test292");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax(0);
        fPHeapMax1.imprime();
        fPHeapMax1.constroi();
        fPHeapMax1.imprime();
        fPHeapMax1.constroi();
        ds.Item item6 = null;
        ds.Item[] itemArray7 = new ds.Item[] { item6 };
        fPHeapMax1.copia(itemArray7);
        ds.FPHeapMax fPHeapMax10 = new ds.FPHeapMax(0);
        ds.Item item11 = null;
        ds.Item[] itemArray12 = new ds.Item[] { item11 };
        fPHeapMax10.copia(itemArray12);
        fPHeapMax10.imprime();
        ds.FPHeapMax fPHeapMax16 = new ds.FPHeapMax((int) (byte) -1);
        fPHeapMax16.constroi();
        fPHeapMax16.imprime();
        ds.Item[] itemArray19 = new ds.Item[] {};
        fPHeapMax16.copia(itemArray19);
        fPHeapMax10.copia(itemArray19);
        fPHeapMax1.copia(itemArray19);
        ds.FPHeapMax fPHeapMax24 = new ds.FPHeapMax(0);
        fPHeapMax24.imprime();
        fPHeapMax24.constroi();
        fPHeapMax24.imprime();
        fPHeapMax24.constroi();
        fPHeapMax24.imprime();
        ds.FPHeapMax fPHeapMax31 = new ds.FPHeapMax(1);
        fPHeapMax31.constroi();
        fPHeapMax31.imprime();
        ds.FPHeapMax fPHeapMax35 = new ds.FPHeapMax((int) '4');
        ds.Item item36 = fPHeapMax35.max();
        ds.FPHeapMax fPHeapMax38 = new ds.FPHeapMax(0);
        fPHeapMax38.imprime();
        ds.Item[] itemArray40 = new ds.Item[] {};
        fPHeapMax38.copia(itemArray40);
        fPHeapMax38.constroi();
        fPHeapMax38.imprime();
        ds.Item[] itemArray44 = new ds.Item[] {};
        fPHeapMax38.copia(itemArray44);
        fPHeapMax35.copia(itemArray44);
        fPHeapMax31.copia(itemArray44);
        fPHeapMax24.copia(itemArray44);
        fPHeapMax1.copia(itemArray44);
        java.lang.Class<?> wildcardClass50 = fPHeapMax1.getClass();
        org.junit.Assert.assertNotNull(itemArray7);
        org.junit.Assert.assertNotNull(itemArray12);
        org.junit.Assert.assertNotNull(itemArray19);
        org.junit.Assert.assertNull(item36);
        org.junit.Assert.assertNotNull(itemArray40);
        org.junit.Assert.assertNotNull(itemArray44);
        org.junit.Assert.assertNotNull(wildcardClass50);
    }

    @Test
    public void test293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test293");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax(0);
        fPHeapMax1.imprime();
        fPHeapMax1.constroi();
        fPHeapMax1.imprime();
        fPHeapMax1.constroi();
        fPHeapMax1.imprime();
        ds.FPHeapMax fPHeapMax8 = new ds.FPHeapMax(0);
        ds.Item item9 = null;
        ds.Item[] itemArray10 = new ds.Item[] { item9 };
        fPHeapMax8.copia(itemArray10);
        fPHeapMax8.imprime();
        ds.FPHeapMax fPHeapMax14 = new ds.FPHeapMax((int) (byte) -1);
        fPHeapMax14.constroi();
        fPHeapMax14.imprime();
        ds.Item[] itemArray17 = new ds.Item[] {};
        fPHeapMax14.copia(itemArray17);
        fPHeapMax8.copia(itemArray17);
        fPHeapMax1.copia(itemArray17);
        fPHeapMax1.constroi();
        java.lang.Class<?> wildcardClass22 = fPHeapMax1.getClass();
        org.junit.Assert.assertNotNull(itemArray10);
        org.junit.Assert.assertNotNull(itemArray17);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test294");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((-1));
        fPHeapMax1.imprime();
        fPHeapMax1.imprime();
        ds.FPHeapMax fPHeapMax5 = new ds.FPHeapMax(0);
        fPHeapMax5.imprime();
        fPHeapMax5.constroi();
        fPHeapMax5.imprime();
        ds.FPHeapMax fPHeapMax10 = new ds.FPHeapMax((int) '4');
        ds.Item item11 = fPHeapMax10.max();
        ds.FPHeapMax fPHeapMax13 = new ds.FPHeapMax(0);
        fPHeapMax13.imprime();
        ds.Item[] itemArray15 = new ds.Item[] {};
        fPHeapMax13.copia(itemArray15);
        fPHeapMax13.constroi();
        fPHeapMax13.imprime();
        ds.Item[] itemArray19 = new ds.Item[] {};
        fPHeapMax13.copia(itemArray19);
        fPHeapMax10.copia(itemArray19);
        fPHeapMax5.copia(itemArray19);
        fPHeapMax1.copia(itemArray19);
        fPHeapMax1.constroi();
        fPHeapMax1.constroi();
        java.lang.Class<?> wildcardClass26 = fPHeapMax1.getClass();
        org.junit.Assert.assertNull(item11);
        org.junit.Assert.assertNotNull(itemArray15);
        org.junit.Assert.assertNotNull(itemArray19);
        org.junit.Assert.assertNotNull(wildcardClass26);
    }

    @Test
    public void test295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test295");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((-1));
        fPHeapMax1.imprime();
        fPHeapMax1.imprime();
        ds.FPHeapMax fPHeapMax5 = new ds.FPHeapMax(0);
        fPHeapMax5.imprime();
        fPHeapMax5.constroi();
        fPHeapMax5.imprime();
        ds.FPHeapMax fPHeapMax10 = new ds.FPHeapMax((int) '4');
        ds.Item item11 = fPHeapMax10.max();
        ds.FPHeapMax fPHeapMax13 = new ds.FPHeapMax(0);
        fPHeapMax13.imprime();
        ds.Item[] itemArray15 = new ds.Item[] {};
        fPHeapMax13.copia(itemArray15);
        fPHeapMax13.constroi();
        fPHeapMax13.imprime();
        ds.Item[] itemArray19 = new ds.Item[] {};
        fPHeapMax13.copia(itemArray19);
        fPHeapMax10.copia(itemArray19);
        fPHeapMax5.copia(itemArray19);
        fPHeapMax1.copia(itemArray19);
        fPHeapMax1.imprime();
        // The following exception was thrown during execution in test generation
        try {
            ds.Item item25 = fPHeapMax1.retiraMax();
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: heap vazio");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(item11);
        org.junit.Assert.assertNotNull(itemArray15);
        org.junit.Assert.assertNotNull(itemArray19);
    }

    @Test
    public void test296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test296");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax(0);
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
    public void test297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test297");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax(1);
        fPHeapMax1.imprime();
        fPHeapMax1.constroi();
        ds.FPHeapMax fPHeapMax5 = new ds.FPHeapMax(0);
        fPHeapMax5.imprime();
        fPHeapMax5.constroi();
        fPHeapMax5.imprime();
        fPHeapMax5.constroi();
        ds.Item item10 = null;
        ds.Item[] itemArray11 = new ds.Item[] { item10 };
        fPHeapMax5.copia(itemArray11);
        ds.FPHeapMax fPHeapMax14 = new ds.FPHeapMax(0);
        ds.Item item15 = null;
        ds.Item[] itemArray16 = new ds.Item[] { item15 };
        fPHeapMax14.copia(itemArray16);
        fPHeapMax14.imprime();
        ds.FPHeapMax fPHeapMax20 = new ds.FPHeapMax((int) (byte) -1);
        fPHeapMax20.constroi();
        fPHeapMax20.imprime();
        ds.Item[] itemArray23 = new ds.Item[] {};
        fPHeapMax20.copia(itemArray23);
        fPHeapMax14.copia(itemArray23);
        fPHeapMax5.copia(itemArray23);
        fPHeapMax1.copia(itemArray23);
        java.lang.Class<?> wildcardClass28 = fPHeapMax1.getClass();
        org.junit.Assert.assertNotNull(itemArray11);
        org.junit.Assert.assertNotNull(itemArray16);
        org.junit.Assert.assertNotNull(itemArray23);
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test298");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax(0);
        fPHeapMax1.imprime();
        fPHeapMax1.constroi();
        ds.FPHeapMax fPHeapMax5 = new ds.FPHeapMax(0);
        ds.Item item6 = null;
        ds.Item[] itemArray7 = new ds.Item[] { item6 };
        fPHeapMax5.copia(itemArray7);
        fPHeapMax1.copia(itemArray7);
        fPHeapMax1.constroi();
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMax1.refaz((int) (byte) 1, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray7);
    }

    @Test
    public void test299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test299");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax(1);
        fPHeapMax1.imprime();
        fPHeapMax1.constroi();
        ds.FPHeapMax fPHeapMax5 = new ds.FPHeapMax(0);
        fPHeapMax5.imprime();
        fPHeapMax5.constroi();
        fPHeapMax5.imprime();
        fPHeapMax5.constroi();
        ds.Item item10 = null;
        ds.Item[] itemArray11 = new ds.Item[] { item10 };
        fPHeapMax5.copia(itemArray11);
        ds.FPHeapMax fPHeapMax14 = new ds.FPHeapMax(0);
        ds.Item item15 = null;
        ds.Item[] itemArray16 = new ds.Item[] { item15 };
        fPHeapMax14.copia(itemArray16);
        fPHeapMax14.imprime();
        ds.FPHeapMax fPHeapMax20 = new ds.FPHeapMax((int) (byte) -1);
        fPHeapMax20.constroi();
        fPHeapMax20.imprime();
        ds.Item[] itemArray23 = new ds.Item[] {};
        fPHeapMax20.copia(itemArray23);
        fPHeapMax14.copia(itemArray23);
        fPHeapMax5.copia(itemArray23);
        fPHeapMax1.copia(itemArray23);
        ds.FPHeapMax fPHeapMax30 = new ds.FPHeapMax(0);
        fPHeapMax30.imprime();
        fPHeapMax30.constroi();
        fPHeapMax30.imprime();
        fPHeapMax30.constroi();
        fPHeapMax30.imprime();
        ds.FPHeapMax fPHeapMax37 = new ds.FPHeapMax(0);
        ds.Item item38 = null;
        ds.Item[] itemArray39 = new ds.Item[] { item38 };
        fPHeapMax37.copia(itemArray39);
        fPHeapMax37.imprime();
        ds.FPHeapMax fPHeapMax43 = new ds.FPHeapMax((int) (byte) -1);
        fPHeapMax43.constroi();
        fPHeapMax43.imprime();
        ds.Item[] itemArray46 = new ds.Item[] {};
        fPHeapMax43.copia(itemArray46);
        fPHeapMax37.copia(itemArray46);
        fPHeapMax30.copia(itemArray46);
        java.lang.Class<?> wildcardClass50 = itemArray46.getClass();
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMax1.aumentaChave((int) (short) 1, (java.lang.Object) itemArray46);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray11);
        org.junit.Assert.assertNotNull(itemArray16);
        org.junit.Assert.assertNotNull(itemArray23);
        org.junit.Assert.assertNotNull(itemArray39);
        org.junit.Assert.assertNotNull(itemArray46);
        org.junit.Assert.assertNotNull(wildcardClass50);
    }

    @Test
    public void test300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test300");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax(0);
        fPHeapMax1.imprime();
        ds.Item[] itemArray3 = new ds.Item[] {};
        fPHeapMax1.copia(itemArray3);
        fPHeapMax1.constroi();
        fPHeapMax1.imprime();
        ds.Item[] itemArray7 = new ds.Item[] {};
        fPHeapMax1.copia(itemArray7);
        fPHeapMax1.constroi();
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMax1.aumentaChave((int) '4', (java.lang.Object) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 52");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertNotNull(itemArray7);
    }

    @Test
    public void test301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test301");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax(10);
        fPHeapMax1.constroi();
        fPHeapMax1.imprime();
        ds.FPHeapMax fPHeapMax6 = new ds.FPHeapMax(0);
        ds.Item item7 = null;
        ds.Item[] itemArray8 = new ds.Item[] { item7 };
        fPHeapMax6.copia(itemArray8);
        fPHeapMax6.imprime();
        ds.FPHeapMax fPHeapMax12 = new ds.FPHeapMax((int) (byte) -1);
        fPHeapMax12.constroi();
        fPHeapMax12.imprime();
        ds.Item[] itemArray15 = new ds.Item[] {};
        fPHeapMax12.copia(itemArray15);
        fPHeapMax6.copia(itemArray15);
        ds.FPHeapMax fPHeapMax19 = new ds.FPHeapMax(0);
        fPHeapMax19.imprime();
        ds.Item[] itemArray21 = new ds.Item[] {};
        fPHeapMax19.copia(itemArray21);
        fPHeapMax6.copia(itemArray21);
        fPHeapMax6.constroi();
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMax1.aumentaChave(0, (java.lang.Object) fPHeapMax6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray8);
        org.junit.Assert.assertNotNull(itemArray15);
        org.junit.Assert.assertNotNull(itemArray21);
    }

    @Test
    public void test302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test302");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax(0);
        fPHeapMax1.constroi();
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
    }

    @Test
    public void test303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test303");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMax1.refaz(10, (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 10");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test304");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) ' ');
        ds.FPHeapMax fPHeapMax3 = new ds.FPHeapMax(0);
        ds.Item item4 = null;
        ds.Item[] itemArray5 = new ds.Item[] { item4 };
        fPHeapMax3.copia(itemArray5);
        fPHeapMax1.copia(itemArray5);
        fPHeapMax1.imprime();
        fPHeapMax1.constroi();
        fPHeapMax1.imprime();
        ds.Item item11 = fPHeapMax1.max();
        // The following exception was thrown during execution in test generation
        try {
            ds.Item item12 = fPHeapMax1.retiraMax();
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: heap vazio");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray5);
        org.junit.Assert.assertNull(item11);
    }

    @Test
    public void test305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test305");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((-1));
        fPHeapMax1.imprime();
        fPHeapMax1.imprime();
        ds.FPHeapMax fPHeapMax5 = new ds.FPHeapMax(0);
        fPHeapMax5.imprime();
        fPHeapMax5.constroi();
        fPHeapMax5.imprime();
        ds.FPHeapMax fPHeapMax10 = new ds.FPHeapMax((int) '4');
        ds.Item item11 = fPHeapMax10.max();
        ds.FPHeapMax fPHeapMax13 = new ds.FPHeapMax(0);
        fPHeapMax13.imprime();
        ds.Item[] itemArray15 = new ds.Item[] {};
        fPHeapMax13.copia(itemArray15);
        fPHeapMax13.constroi();
        fPHeapMax13.imprime();
        ds.Item[] itemArray19 = new ds.Item[] {};
        fPHeapMax13.copia(itemArray19);
        fPHeapMax10.copia(itemArray19);
        fPHeapMax5.copia(itemArray19);
        fPHeapMax1.copia(itemArray19);
        fPHeapMax1.constroi();
        fPHeapMax1.imprime();
        java.lang.Class<?> wildcardClass26 = fPHeapMax1.getClass();
        org.junit.Assert.assertNull(item11);
        org.junit.Assert.assertNotNull(itemArray15);
        org.junit.Assert.assertNotNull(itemArray19);
        org.junit.Assert.assertNotNull(wildcardClass26);
    }

    @Test
    public void test306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test306");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax(1);
        fPHeapMax1.constroi();
        fPHeapMax1.imprime();
        fPHeapMax1.imprime();
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMax1.refaz(1, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 2");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test307");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax(0);
        fPHeapMax1.constroi();
        fPHeapMax1.constroi();
        fPHeapMax1.constroi();
        fPHeapMax1.constroi();
        ds.FPHeapMax fPHeapMax8 = new ds.FPHeapMax(0);
        fPHeapMax8.imprime();
        fPHeapMax8.constroi();
        fPHeapMax8.imprime();
        fPHeapMax8.constroi();
        ds.Item item13 = null;
        ds.Item[] itemArray14 = new ds.Item[] { item13 };
        fPHeapMax8.copia(itemArray14);
        ds.FPHeapMax fPHeapMax17 = new ds.FPHeapMax(0);
        ds.Item item18 = null;
        ds.Item[] itemArray19 = new ds.Item[] { item18 };
        fPHeapMax17.copia(itemArray19);
        fPHeapMax17.imprime();
        ds.FPHeapMax fPHeapMax23 = new ds.FPHeapMax((int) (byte) -1);
        fPHeapMax23.constroi();
        fPHeapMax23.imprime();
        ds.Item[] itemArray26 = new ds.Item[] {};
        fPHeapMax23.copia(itemArray26);
        fPHeapMax17.copia(itemArray26);
        fPHeapMax8.copia(itemArray26);
        java.lang.Class<?> wildcardClass30 = itemArray26.getClass();
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMax1.aumentaChave(100, (java.lang.Object) wildcardClass30);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 100");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray14);
        org.junit.Assert.assertNotNull(itemArray19);
        org.junit.Assert.assertNotNull(itemArray26);
        org.junit.Assert.assertNotNull(wildcardClass30);
    }

    @Test
    public void test308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test308");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((-1));
        fPHeapMax1.imprime();
        fPHeapMax1.imprime();
        ds.FPHeapMax fPHeapMax5 = new ds.FPHeapMax(0);
        fPHeapMax5.imprime();
        fPHeapMax5.constroi();
        fPHeapMax5.imprime();
        ds.FPHeapMax fPHeapMax10 = new ds.FPHeapMax((int) '4');
        ds.Item item11 = fPHeapMax10.max();
        ds.FPHeapMax fPHeapMax13 = new ds.FPHeapMax(0);
        fPHeapMax13.imprime();
        ds.Item[] itemArray15 = new ds.Item[] {};
        fPHeapMax13.copia(itemArray15);
        fPHeapMax13.constroi();
        fPHeapMax13.imprime();
        ds.Item[] itemArray19 = new ds.Item[] {};
        fPHeapMax13.copia(itemArray19);
        fPHeapMax10.copia(itemArray19);
        fPHeapMax5.copia(itemArray19);
        fPHeapMax1.copia(itemArray19);
        fPHeapMax1.imprime();
        java.lang.Object obj26 = null;
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMax1.aumentaChave((int) (byte) 0, obj26);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 0");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(item11);
        org.junit.Assert.assertNotNull(itemArray15);
        org.junit.Assert.assertNotNull(itemArray19);
    }

    @Test
    public void test309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test309");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((-1));
        ds.FPHeapMax fPHeapMax3 = new ds.FPHeapMax(0);
        ds.Item item4 = null;
        ds.Item[] itemArray5 = new ds.Item[] { item4 };
        fPHeapMax3.copia(itemArray5);
        fPHeapMax3.imprime();
        ds.FPHeapMax fPHeapMax9 = new ds.FPHeapMax((int) (byte) -1);
        fPHeapMax9.constroi();
        fPHeapMax9.imprime();
        ds.Item[] itemArray12 = new ds.Item[] {};
        fPHeapMax9.copia(itemArray12);
        fPHeapMax3.copia(itemArray12);
        ds.FPHeapMax fPHeapMax16 = new ds.FPHeapMax(0);
        fPHeapMax16.imprime();
        ds.Item[] itemArray18 = new ds.Item[] {};
        fPHeapMax16.copia(itemArray18);
        fPHeapMax3.copia(itemArray18);
        fPHeapMax1.copia(itemArray18);
        // The following exception was thrown during execution in test generation
        try {
            ds.Item item22 = fPHeapMax1.retiraMax();
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: heap vazio");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray5);
        org.junit.Assert.assertNotNull(itemArray12);
        org.junit.Assert.assertNotNull(itemArray18);
    }

    @Test
    public void test310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test310");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) '4');
        ds.Item item2 = fPHeapMax1.max();
        ds.FPHeapMax fPHeapMax4 = new ds.FPHeapMax(0);
        fPHeapMax4.imprime();
        ds.Item[] itemArray6 = new ds.Item[] {};
        fPHeapMax4.copia(itemArray6);
        fPHeapMax4.constroi();
        fPHeapMax4.imprime();
        ds.Item[] itemArray10 = new ds.Item[] {};
        fPHeapMax4.copia(itemArray10);
        fPHeapMax1.copia(itemArray10);
        ds.Item[] itemArray13 = null;
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMax1.copia(itemArray13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(item2);
        org.junit.Assert.assertNotNull(itemArray6);
        org.junit.Assert.assertNotNull(itemArray10);
    }

    @Test
    public void test311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test311");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax(1);
        fPHeapMax1.constroi();
        ds.FPHeapMax fPHeapMax5 = new ds.FPHeapMax((int) '#');
        ds.FPHeapMax fPHeapMax7 = new ds.FPHeapMax(0);
        fPHeapMax7.imprime();
        fPHeapMax7.constroi();
        ds.FPHeapMax fPHeapMax11 = new ds.FPHeapMax(0);
        ds.Item item12 = null;
        ds.Item[] itemArray13 = new ds.Item[] { item12 };
        fPHeapMax11.copia(itemArray13);
        fPHeapMax7.copia(itemArray13);
        fPHeapMax5.copia(itemArray13);
        fPHeapMax5.constroi();
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMax1.aumentaChave((int) (byte) -1, (java.lang.Object) fPHeapMax5);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray13);
    }

    @Test
    public void test312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test312");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((-1));
        fPHeapMax1.imprime();
        fPHeapMax1.imprime();
        ds.FPHeapMax fPHeapMax5 = new ds.FPHeapMax(0);
        fPHeapMax5.imprime();
        fPHeapMax5.constroi();
        fPHeapMax5.imprime();
        ds.FPHeapMax fPHeapMax10 = new ds.FPHeapMax((int) '4');
        ds.Item item11 = fPHeapMax10.max();
        ds.FPHeapMax fPHeapMax13 = new ds.FPHeapMax(0);
        fPHeapMax13.imprime();
        ds.Item[] itemArray15 = new ds.Item[] {};
        fPHeapMax13.copia(itemArray15);
        fPHeapMax13.constroi();
        fPHeapMax13.imprime();
        ds.Item[] itemArray19 = new ds.Item[] {};
        fPHeapMax13.copia(itemArray19);
        fPHeapMax10.copia(itemArray19);
        fPHeapMax5.copia(itemArray19);
        fPHeapMax1.copia(itemArray19);
        fPHeapMax1.imprime();
        fPHeapMax1.imprime();
        ds.Item item26 = null;
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMax1.insere(item26);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(item11);
        org.junit.Assert.assertNotNull(itemArray15);
        org.junit.Assert.assertNotNull(itemArray19);
    }

    @Test
    public void test313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test313");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (byte) -1);
        fPHeapMax1.constroi();
        fPHeapMax1.imprime();
        ds.Item[] itemArray4 = new ds.Item[] {};
        fPHeapMax1.copia(itemArray4);
        fPHeapMax1.imprime();
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMax1.refaz((int) (short) 100, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 100");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray4);
    }

    @Test
    public void test314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test314");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) ' ');
        ds.FPHeapMax fPHeapMax3 = new ds.FPHeapMax(0);
        ds.Item item4 = null;
        ds.Item[] itemArray5 = new ds.Item[] { item4 };
        fPHeapMax3.copia(itemArray5);
        fPHeapMax1.copia(itemArray5);
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
        org.junit.Assert.assertNotNull(itemArray5);
    }

    @Test
    public void test315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test315");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (short) 0);
        fPHeapMax1.imprime();
        fPHeapMax1.constroi();
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMax1.refaz((int) '4', 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 52");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test316");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax(0);
        fPHeapMax1.imprime();
        ds.Item[] itemArray3 = new ds.Item[] {};
        fPHeapMax1.copia(itemArray3);
        fPHeapMax1.constroi();
        fPHeapMax1.imprime();
        ds.Item[] itemArray7 = new ds.Item[] {};
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
    public void test317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test317");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (byte) -1);
        fPHeapMax1.constroi();
        fPHeapMax1.constroi();
        fPHeapMax1.constroi();
        ds.FPHeapMax fPHeapMax6 = new ds.FPHeapMax(0);
        fPHeapMax6.imprime();
        fPHeapMax6.constroi();
        ds.FPHeapMax fPHeapMax10 = new ds.FPHeapMax(0);
        ds.Item item11 = null;
        ds.Item[] itemArray12 = new ds.Item[] { item11 };
        fPHeapMax10.copia(itemArray12);
        fPHeapMax6.copia(itemArray12);
        fPHeapMax1.copia(itemArray12);
        // The following exception was thrown during execution in test generation
        try {
            ds.Item item16 = fPHeapMax1.max();
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray12);
    }

    @Test
    public void test318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test318");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) '4');
        ds.Item item2 = fPHeapMax1.max();
        fPHeapMax1.constroi();
        ds.FPHeapMax fPHeapMax5 = new ds.FPHeapMax(0);
        fPHeapMax5.imprime();
        fPHeapMax5.constroi();
        fPHeapMax5.imprime();
        fPHeapMax5.constroi();
        fPHeapMax5.imprime();
        ds.FPHeapMax fPHeapMax12 = new ds.FPHeapMax(0);
        ds.Item item13 = null;
        ds.Item[] itemArray14 = new ds.Item[] { item13 };
        fPHeapMax12.copia(itemArray14);
        fPHeapMax12.imprime();
        ds.FPHeapMax fPHeapMax18 = new ds.FPHeapMax((int) (byte) -1);
        fPHeapMax18.constroi();
        fPHeapMax18.imprime();
        ds.Item[] itemArray21 = new ds.Item[] {};
        fPHeapMax18.copia(itemArray21);
        fPHeapMax12.copia(itemArray21);
        fPHeapMax5.copia(itemArray21);
        ds.FPHeapMax fPHeapMax26 = new ds.FPHeapMax(0);
        fPHeapMax26.imprime();
        fPHeapMax26.constroi();
        fPHeapMax26.imprime();
        ds.FPHeapMax fPHeapMax31 = new ds.FPHeapMax((int) '4');
        ds.Item item32 = fPHeapMax31.max();
        ds.FPHeapMax fPHeapMax34 = new ds.FPHeapMax(0);
        fPHeapMax34.imprime();
        ds.Item[] itemArray36 = new ds.Item[] {};
        fPHeapMax34.copia(itemArray36);
        fPHeapMax34.constroi();
        fPHeapMax34.imprime();
        ds.Item[] itemArray40 = new ds.Item[] {};
        fPHeapMax34.copia(itemArray40);
        fPHeapMax31.copia(itemArray40);
        fPHeapMax26.copia(itemArray40);
        fPHeapMax5.copia(itemArray40);
        fPHeapMax1.copia(itemArray40);
        ds.FPHeapMax fPHeapMax48 = new ds.FPHeapMax((int) (byte) -1);
        java.lang.Class<?> wildcardClass49 = fPHeapMax48.getClass();
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMax1.aumentaChave((int) '#', (java.lang.Object) wildcardClass49);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(item2);
        org.junit.Assert.assertNotNull(itemArray14);
        org.junit.Assert.assertNotNull(itemArray21);
        org.junit.Assert.assertNull(item32);
        org.junit.Assert.assertNotNull(itemArray36);
        org.junit.Assert.assertNotNull(itemArray40);
        org.junit.Assert.assertNotNull(wildcardClass49);
    }

    @Test
    public void test319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test319");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax(0);
        fPHeapMax1.imprime();
        fPHeapMax1.constroi();
        fPHeapMax1.constroi();
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMax1.refaz((int) (byte) 0, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test320");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax(0);
        fPHeapMax1.imprime();
        ds.Item[] itemArray3 = new ds.Item[] {};
        fPHeapMax1.copia(itemArray3);
        fPHeapMax1.constroi();
        fPHeapMax1.imprime();
        ds.Item[] itemArray7 = new ds.Item[] {};
        fPHeapMax1.copia(itemArray7);
        fPHeapMax1.constroi();
        java.lang.Class<?> wildcardClass10 = fPHeapMax1.getClass();
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertNotNull(itemArray7);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test321");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax(1);
        fPHeapMax1.constroi();
        java.lang.Class<?> wildcardClass3 = fPHeapMax1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test322");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax(0);
        fPHeapMax1.imprime();
        fPHeapMax1.constroi();
        fPHeapMax1.imprime();
        fPHeapMax1.constroi();
        ds.Item item6 = null;
        ds.Item[] itemArray7 = new ds.Item[] { item6 };
        fPHeapMax1.copia(itemArray7);
        ds.FPHeapMax fPHeapMax10 = new ds.FPHeapMax(0);
        ds.Item item11 = null;
        ds.Item[] itemArray12 = new ds.Item[] { item11 };
        fPHeapMax10.copia(itemArray12);
        fPHeapMax10.imprime();
        ds.FPHeapMax fPHeapMax16 = new ds.FPHeapMax((int) (byte) -1);
        fPHeapMax16.constroi();
        fPHeapMax16.imprime();
        ds.Item[] itemArray19 = new ds.Item[] {};
        fPHeapMax16.copia(itemArray19);
        fPHeapMax10.copia(itemArray19);
        fPHeapMax1.copia(itemArray19);
        fPHeapMax1.constroi();
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMax1.refaz(10, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 10");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray7);
        org.junit.Assert.assertNotNull(itemArray12);
        org.junit.Assert.assertNotNull(itemArray19);
    }

    @Test
    public void test323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test323");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax(0);
        fPHeapMax1.imprime();
        fPHeapMax1.constroi();
        fPHeapMax1.imprime();
        fPHeapMax1.constroi();
        fPHeapMax1.imprime();
        ds.FPHeapMax fPHeapMax8 = new ds.FPHeapMax((int) (byte) -1);
        fPHeapMax8.constroi();
        fPHeapMax8.imprime();
        ds.Item[] itemArray11 = new ds.Item[] {};
        fPHeapMax8.copia(itemArray11);
        fPHeapMax1.copia(itemArray11);
        ds.FPHeapMax fPHeapMax16 = new ds.FPHeapMax((-1));
        fPHeapMax16.imprime();
        fPHeapMax16.imprime();
        ds.FPHeapMax fPHeapMax20 = new ds.FPHeapMax(0);
        fPHeapMax20.imprime();
        fPHeapMax20.constroi();
        fPHeapMax20.imprime();
        ds.FPHeapMax fPHeapMax25 = new ds.FPHeapMax((int) '4');
        ds.Item item26 = fPHeapMax25.max();
        ds.FPHeapMax fPHeapMax28 = new ds.FPHeapMax(0);
        fPHeapMax28.imprime();
        ds.Item[] itemArray30 = new ds.Item[] {};
        fPHeapMax28.copia(itemArray30);
        fPHeapMax28.constroi();
        fPHeapMax28.imprime();
        ds.Item[] itemArray34 = new ds.Item[] {};
        fPHeapMax28.copia(itemArray34);
        fPHeapMax25.copia(itemArray34);
        fPHeapMax20.copia(itemArray34);
        fPHeapMax16.copia(itemArray34);
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMax1.aumentaChave(100, (java.lang.Object) itemArray34);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 100");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray11);
        org.junit.Assert.assertNull(item26);
        org.junit.Assert.assertNotNull(itemArray30);
        org.junit.Assert.assertNotNull(itemArray34);
    }

    @Test
    public void test324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test324");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((-1));
        fPHeapMax1.imprime();
        fPHeapMax1.imprime();
        ds.FPHeapMax fPHeapMax5 = new ds.FPHeapMax(0);
        fPHeapMax5.imprime();
        fPHeapMax5.constroi();
        fPHeapMax5.imprime();
        ds.FPHeapMax fPHeapMax10 = new ds.FPHeapMax((int) '4');
        ds.Item item11 = fPHeapMax10.max();
        ds.FPHeapMax fPHeapMax13 = new ds.FPHeapMax(0);
        fPHeapMax13.imprime();
        ds.Item[] itemArray15 = new ds.Item[] {};
        fPHeapMax13.copia(itemArray15);
        fPHeapMax13.constroi();
        fPHeapMax13.imprime();
        ds.Item[] itemArray19 = new ds.Item[] {};
        fPHeapMax13.copia(itemArray19);
        fPHeapMax10.copia(itemArray19);
        fPHeapMax5.copia(itemArray19);
        fPHeapMax1.copia(itemArray19);
        fPHeapMax1.imprime();
        fPHeapMax1.constroi();
        fPHeapMax1.constroi();
        org.junit.Assert.assertNull(item11);
        org.junit.Assert.assertNotNull(itemArray15);
        org.junit.Assert.assertNotNull(itemArray19);
    }

    @Test
    public void test325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test325");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax(1);
        fPHeapMax1.imprime();
        ds.FPHeapMax fPHeapMax4 = new ds.FPHeapMax((int) '4');
        ds.FPHeapMax fPHeapMax6 = new ds.FPHeapMax(0);
        fPHeapMax6.imprime();
        ds.Item[] itemArray8 = new ds.Item[] {};
        fPHeapMax6.copia(itemArray8);
        fPHeapMax4.copia(itemArray8);
        ds.FPHeapMax fPHeapMax12 = new ds.FPHeapMax((int) (byte) -1);
        fPHeapMax12.constroi();
        fPHeapMax12.imprime();
        ds.FPHeapMax fPHeapMax16 = new ds.FPHeapMax(0);
        ds.Item item17 = null;
        ds.Item[] itemArray18 = new ds.Item[] { item17 };
        fPHeapMax16.copia(itemArray18);
        fPHeapMax12.copia(itemArray18);
        fPHeapMax4.copia(itemArray18);
        fPHeapMax1.copia(itemArray18);
        // The following exception was thrown during execution in test generation
        try {
            ds.Item item23 = fPHeapMax1.retiraMax();
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: heap vazio");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray8);
        org.junit.Assert.assertNotNull(itemArray18);
    }

    @Test
    public void test326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test326");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax(1);
        fPHeapMax1.imprime();
        fPHeapMax1.constroi();
        ds.FPHeapMax fPHeapMax5 = new ds.FPHeapMax(0);
        ds.Item item6 = null;
        ds.Item[] itemArray7 = new ds.Item[] { item6 };
        fPHeapMax5.copia(itemArray7);
        fPHeapMax5.imprime();
        ds.FPHeapMax fPHeapMax11 = new ds.FPHeapMax((int) (byte) -1);
        fPHeapMax11.constroi();
        fPHeapMax11.imprime();
        ds.Item[] itemArray14 = new ds.Item[] {};
        fPHeapMax11.copia(itemArray14);
        fPHeapMax5.copia(itemArray14);
        fPHeapMax1.copia(itemArray14);
        ds.Item item18 = null;
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMax1.insere(item18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray7);
        org.junit.Assert.assertNotNull(itemArray14);
    }

    @Test
    public void test327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test327");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (byte) -1);
        fPHeapMax1.constroi();
        ds.FPHeapMax fPHeapMax4 = new ds.FPHeapMax((int) ' ');
        ds.FPHeapMax fPHeapMax6 = new ds.FPHeapMax(0);
        ds.Item item7 = null;
        ds.Item[] itemArray8 = new ds.Item[] { item7 };
        fPHeapMax6.copia(itemArray8);
        fPHeapMax4.copia(itemArray8);
        fPHeapMax1.copia(itemArray8);
        fPHeapMax1.constroi();
        // The following exception was thrown during execution in test generation
        try {
            ds.Item item13 = fPHeapMax1.max();
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray8);
    }

    @Test
    public void test328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test328");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) ' ');
        ds.FPHeapMax fPHeapMax3 = new ds.FPHeapMax(0);
        ds.Item item4 = null;
        ds.Item[] itemArray5 = new ds.Item[] { item4 };
        fPHeapMax3.copia(itemArray5);
        fPHeapMax1.copia(itemArray5);
        ds.FPHeapMax fPHeapMax9 = new ds.FPHeapMax(0);
        fPHeapMax9.constroi();
        fPHeapMax9.constroi();
        fPHeapMax9.constroi();
        fPHeapMax9.constroi();
        ds.FPHeapMax fPHeapMax15 = new ds.FPHeapMax(0);
        fPHeapMax15.imprime();
        ds.Item[] itemArray17 = new ds.Item[] {};
        fPHeapMax15.copia(itemArray17);
        fPHeapMax9.copia(itemArray17);
        fPHeapMax1.copia(itemArray17);
        // The following exception was thrown during execution in test generation
        try {
            ds.Item item21 = fPHeapMax1.retiraMax();
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: heap vazio");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray5);
        org.junit.Assert.assertNotNull(itemArray17);
    }

    @Test
    public void test329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test329");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax(1);
        fPHeapMax1.imprime();
        ds.Item item3 = fPHeapMax1.max();
        org.junit.Assert.assertNull(item3);
    }

    @Test
    public void test330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test330");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax(0);
        fPHeapMax1.imprime();
        ds.Item[] itemArray3 = new ds.Item[] {};
        fPHeapMax1.copia(itemArray3);
        fPHeapMax1.constroi();
        fPHeapMax1.imprime();
        fPHeapMax1.imprime();
        java.lang.Class<?> wildcardClass8 = fPHeapMax1.getClass();
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test331");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax(0);
        fPHeapMax1.imprime();
        ds.Item[] itemArray3 = new ds.Item[] {};
        fPHeapMax1.copia(itemArray3);
        fPHeapMax1.constroi();
        fPHeapMax1.imprime();
        ds.Item[] itemArray7 = new ds.Item[] {};
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
    public void test332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test332");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (short) 0);
        fPHeapMax1.imprime();
        ds.FPHeapMax fPHeapMax5 = new ds.FPHeapMax(0);
        fPHeapMax5.imprime();
        ds.FPHeapMax fPHeapMax8 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item9 = fPHeapMax8.max();
        ds.FPHeapMax fPHeapMax11 = new ds.FPHeapMax((int) '4');
        ds.FPHeapMax fPHeapMax13 = new ds.FPHeapMax(0);
        fPHeapMax13.imprime();
        fPHeapMax13.constroi();
        fPHeapMax13.imprime();
        ds.FPHeapMax fPHeapMax18 = new ds.FPHeapMax((int) '4');
        ds.Item item19 = fPHeapMax18.max();
        ds.FPHeapMax fPHeapMax21 = new ds.FPHeapMax(0);
        fPHeapMax21.imprime();
        ds.Item[] itemArray23 = new ds.Item[] {};
        fPHeapMax21.copia(itemArray23);
        fPHeapMax21.constroi();
        fPHeapMax21.imprime();
        ds.Item[] itemArray27 = new ds.Item[] {};
        fPHeapMax21.copia(itemArray27);
        fPHeapMax18.copia(itemArray27);
        fPHeapMax13.copia(itemArray27);
        fPHeapMax11.copia(itemArray27);
        fPHeapMax8.copia(itemArray27);
        fPHeapMax5.copia(itemArray27);
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMax1.aumentaChave((int) '#', (java.lang.Object) fPHeapMax5);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 35");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(item9);
        org.junit.Assert.assertNull(item19);
        org.junit.Assert.assertNotNull(itemArray23);
        org.junit.Assert.assertNotNull(itemArray27);
    }

    @Test
    public void test333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test333");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax(1);
        fPHeapMax1.constroi();
        fPHeapMax1.imprime();
        ds.FPHeapMax fPHeapMax5 = new ds.FPHeapMax((int) '4');
        ds.Item item6 = fPHeapMax5.max();
        ds.FPHeapMax fPHeapMax8 = new ds.FPHeapMax(0);
        fPHeapMax8.imprime();
        ds.Item[] itemArray10 = new ds.Item[] {};
        fPHeapMax8.copia(itemArray10);
        fPHeapMax8.constroi();
        fPHeapMax8.imprime();
        ds.Item[] itemArray14 = new ds.Item[] {};
        fPHeapMax8.copia(itemArray14);
        fPHeapMax5.copia(itemArray14);
        fPHeapMax1.copia(itemArray14);
        ds.Item item18 = fPHeapMax1.max();
        ds.Item item19 = fPHeapMax1.max();
        ds.Item item20 = fPHeapMax1.max();
        ds.Item[] itemArray21 = null;
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMax1.copia(itemArray21);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(item6);
        org.junit.Assert.assertNotNull(itemArray10);
        org.junit.Assert.assertNotNull(itemArray14);
        org.junit.Assert.assertNull(item18);
        org.junit.Assert.assertNull(item19);
        org.junit.Assert.assertNull(item20);
    }

    @Test
    public void test334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test334");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax(0);
        fPHeapMax1.constroi();
        fPHeapMax1.constroi();
        fPHeapMax1.constroi();
        fPHeapMax1.constroi();
        ds.FPHeapMax fPHeapMax7 = new ds.FPHeapMax(0);
        fPHeapMax7.imprime();
        ds.Item[] itemArray9 = new ds.Item[] {};
        fPHeapMax7.copia(itemArray9);
        fPHeapMax1.copia(itemArray9);
        ds.FPHeapMax fPHeapMax14 = new ds.FPHeapMax((int) 'a');
        fPHeapMax14.refaz((int) '4', (int) 'a');
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMax1.aumentaChave(10, (java.lang.Object) fPHeapMax14);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 10");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray9);
    }

    @Test
    public void test335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test335");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax(1);
        fPHeapMax1.constroi();
        fPHeapMax1.imprime();
        ds.FPHeapMax fPHeapMax5 = new ds.FPHeapMax((int) '4');
        ds.Item item6 = fPHeapMax5.max();
        ds.FPHeapMax fPHeapMax8 = new ds.FPHeapMax(0);
        fPHeapMax8.imprime();
        ds.Item[] itemArray10 = new ds.Item[] {};
        fPHeapMax8.copia(itemArray10);
        fPHeapMax8.constroi();
        fPHeapMax8.imprime();
        ds.Item[] itemArray14 = new ds.Item[] {};
        fPHeapMax8.copia(itemArray14);
        fPHeapMax5.copia(itemArray14);
        fPHeapMax1.copia(itemArray14);
        ds.Item item18 = fPHeapMax1.max();
        ds.Item item19 = fPHeapMax1.max();
        ds.Item item20 = fPHeapMax1.max();
        fPHeapMax1.constroi();
        fPHeapMax1.imprime();
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMax1.aumentaChave(100, (java.lang.Object) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 100");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(item6);
        org.junit.Assert.assertNotNull(itemArray10);
        org.junit.Assert.assertNotNull(itemArray14);
        org.junit.Assert.assertNull(item18);
        org.junit.Assert.assertNull(item19);
        org.junit.Assert.assertNull(item20);
    }

    @Test
    public void test336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test336");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax(0);
        fPHeapMax1.imprime();
        fPHeapMax1.constroi();
        fPHeapMax1.imprime();
        fPHeapMax1.constroi();
        fPHeapMax1.imprime();
        ds.FPHeapMax fPHeapMax9 = new ds.FPHeapMax(0);
        fPHeapMax9.imprime();
        fPHeapMax9.constroi();
        fPHeapMax9.imprime();
        fPHeapMax9.constroi();
        ds.Item item14 = null;
        ds.Item[] itemArray15 = new ds.Item[] { item14 };
        fPHeapMax9.copia(itemArray15);
        java.lang.Class<?> wildcardClass17 = itemArray15.getClass();
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMax1.aumentaChave(0, (java.lang.Object) wildcardClass17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray15);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test337");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax(1);
        fPHeapMax1.constroi();
        fPHeapMax1.constroi();
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMax1.refaz(100, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 100");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test338");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax(0);
        ds.Item item2 = null;
        ds.Item[] itemArray3 = new ds.Item[] { item2 };
        fPHeapMax1.copia(itemArray3);
        fPHeapMax1.imprime();
        ds.FPHeapMax fPHeapMax7 = new ds.FPHeapMax((int) (byte) -1);
        fPHeapMax7.constroi();
        fPHeapMax7.imprime();
        ds.Item[] itemArray10 = new ds.Item[] {};
        fPHeapMax7.copia(itemArray10);
        fPHeapMax1.copia(itemArray10);
        fPHeapMax1.constroi();
        ds.FPHeapMax fPHeapMax15 = new ds.FPHeapMax((int) '4');
        ds.Item item16 = fPHeapMax15.max();
        fPHeapMax15.constroi();
        ds.FPHeapMax fPHeapMax19 = new ds.FPHeapMax(0);
        fPHeapMax19.imprime();
        fPHeapMax19.constroi();
        fPHeapMax19.imprime();
        fPHeapMax19.constroi();
        fPHeapMax19.imprime();
        ds.FPHeapMax fPHeapMax26 = new ds.FPHeapMax(0);
        ds.Item item27 = null;
        ds.Item[] itemArray28 = new ds.Item[] { item27 };
        fPHeapMax26.copia(itemArray28);
        fPHeapMax26.imprime();
        ds.FPHeapMax fPHeapMax32 = new ds.FPHeapMax((int) (byte) -1);
        fPHeapMax32.constroi();
        fPHeapMax32.imprime();
        ds.Item[] itemArray35 = new ds.Item[] {};
        fPHeapMax32.copia(itemArray35);
        fPHeapMax26.copia(itemArray35);
        fPHeapMax19.copia(itemArray35);
        ds.FPHeapMax fPHeapMax40 = new ds.FPHeapMax(0);
        fPHeapMax40.imprime();
        fPHeapMax40.constroi();
        fPHeapMax40.imprime();
        ds.FPHeapMax fPHeapMax45 = new ds.FPHeapMax((int) '4');
        ds.Item item46 = fPHeapMax45.max();
        ds.FPHeapMax fPHeapMax48 = new ds.FPHeapMax(0);
        fPHeapMax48.imprime();
        ds.Item[] itemArray50 = new ds.Item[] {};
        fPHeapMax48.copia(itemArray50);
        fPHeapMax48.constroi();
        fPHeapMax48.imprime();
        ds.Item[] itemArray54 = new ds.Item[] {};
        fPHeapMax48.copia(itemArray54);
        fPHeapMax45.copia(itemArray54);
        fPHeapMax40.copia(itemArray54);
        fPHeapMax19.copia(itemArray54);
        fPHeapMax15.copia(itemArray54);
        fPHeapMax1.copia(itemArray54);
        ds.FPHeapMax fPHeapMax63 = new ds.FPHeapMax((int) (byte) -1);
        fPHeapMax63.constroi();
        fPHeapMax63.imprime();
        ds.Item[] itemArray66 = new ds.Item[] {};
        fPHeapMax63.copia(itemArray66);
        fPHeapMax63.imprime();
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMax1.aumentaChave(100, (java.lang.Object) fPHeapMax63);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 100");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertNotNull(itemArray10);
        org.junit.Assert.assertNull(item16);
        org.junit.Assert.assertNotNull(itemArray28);
        org.junit.Assert.assertNotNull(itemArray35);
        org.junit.Assert.assertNull(item46);
        org.junit.Assert.assertNotNull(itemArray50);
        org.junit.Assert.assertNotNull(itemArray54);
        org.junit.Assert.assertNotNull(itemArray66);
    }

    @Test
    public void test339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test339");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((-1));
        fPHeapMax1.imprime();
        fPHeapMax1.imprime();
        ds.FPHeapMax fPHeapMax5 = new ds.FPHeapMax(0);
        fPHeapMax5.imprime();
        fPHeapMax5.constroi();
        fPHeapMax5.imprime();
        ds.FPHeapMax fPHeapMax10 = new ds.FPHeapMax((int) '4');
        ds.Item item11 = fPHeapMax10.max();
        ds.FPHeapMax fPHeapMax13 = new ds.FPHeapMax(0);
        fPHeapMax13.imprime();
        ds.Item[] itemArray15 = new ds.Item[] {};
        fPHeapMax13.copia(itemArray15);
        fPHeapMax13.constroi();
        fPHeapMax13.imprime();
        ds.Item[] itemArray19 = new ds.Item[] {};
        fPHeapMax13.copia(itemArray19);
        fPHeapMax10.copia(itemArray19);
        fPHeapMax5.copia(itemArray19);
        fPHeapMax1.copia(itemArray19);
        fPHeapMax1.imprime();
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMax1.refaz((int) ' ', (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 32");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(item11);
        org.junit.Assert.assertNotNull(itemArray15);
        org.junit.Assert.assertNotNull(itemArray19);
    }

    @Test
    public void test340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test340");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (byte) -1);
        fPHeapMax1.constroi();
        fPHeapMax1.imprime();
        ds.Item[] itemArray4 = new ds.Item[] {};
        fPHeapMax1.copia(itemArray4);
        ds.FPHeapMax fPHeapMax8 = new ds.FPHeapMax(0);
        fPHeapMax8.imprime();
        fPHeapMax8.constroi();
        fPHeapMax8.imprime();
        fPHeapMax8.constroi();
        ds.Item item13 = null;
        ds.Item[] itemArray14 = new ds.Item[] { item13 };
        fPHeapMax8.copia(itemArray14);
        ds.FPHeapMax fPHeapMax17 = new ds.FPHeapMax(0);
        ds.Item item18 = null;
        ds.Item[] itemArray19 = new ds.Item[] { item18 };
        fPHeapMax17.copia(itemArray19);
        fPHeapMax17.imprime();
        ds.FPHeapMax fPHeapMax23 = new ds.FPHeapMax((int) (byte) -1);
        fPHeapMax23.constroi();
        fPHeapMax23.imprime();
        ds.Item[] itemArray26 = new ds.Item[] {};
        fPHeapMax23.copia(itemArray26);
        fPHeapMax17.copia(itemArray26);
        fPHeapMax8.copia(itemArray26);
        fPHeapMax8.constroi();
        ds.FPHeapMax fPHeapMax32 = new ds.FPHeapMax(1);
        fPHeapMax32.constroi();
        fPHeapMax32.imprime();
        ds.FPHeapMax fPHeapMax36 = new ds.FPHeapMax((int) '4');
        ds.Item item37 = fPHeapMax36.max();
        ds.FPHeapMax fPHeapMax39 = new ds.FPHeapMax(0);
        fPHeapMax39.imprime();
        ds.Item[] itemArray41 = new ds.Item[] {};
        fPHeapMax39.copia(itemArray41);
        fPHeapMax39.constroi();
        fPHeapMax39.imprime();
        ds.Item[] itemArray45 = new ds.Item[] {};
        fPHeapMax39.copia(itemArray45);
        fPHeapMax36.copia(itemArray45);
        fPHeapMax32.copia(itemArray45);
        fPHeapMax8.copia(itemArray45);
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMax1.aumentaChave((int) (short) -1, (java.lang.Object) itemArray45);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray4);
        org.junit.Assert.assertNotNull(itemArray14);
        org.junit.Assert.assertNotNull(itemArray19);
        org.junit.Assert.assertNotNull(itemArray26);
        org.junit.Assert.assertNull(item37);
        org.junit.Assert.assertNotNull(itemArray41);
        org.junit.Assert.assertNotNull(itemArray45);
    }

    @Test
    public void test341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test341");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (short) 1);
        fPHeapMax1.constroi();
        ds.FPHeapMax fPHeapMax4 = new ds.FPHeapMax(0);
        fPHeapMax4.imprime();
        fPHeapMax4.constroi();
        fPHeapMax4.imprime();
        fPHeapMax4.constroi();
        ds.Item item9 = null;
        ds.Item[] itemArray10 = new ds.Item[] { item9 };
        fPHeapMax4.copia(itemArray10);
        ds.FPHeapMax fPHeapMax13 = new ds.FPHeapMax(0);
        ds.Item item14 = null;
        ds.Item[] itemArray15 = new ds.Item[] { item14 };
        fPHeapMax13.copia(itemArray15);
        fPHeapMax13.imprime();
        ds.FPHeapMax fPHeapMax19 = new ds.FPHeapMax((int) (byte) -1);
        fPHeapMax19.constroi();
        fPHeapMax19.imprime();
        ds.Item[] itemArray22 = new ds.Item[] {};
        fPHeapMax19.copia(itemArray22);
        fPHeapMax13.copia(itemArray22);
        fPHeapMax4.copia(itemArray22);
        fPHeapMax1.copia(itemArray22);
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMax1.refaz((int) (byte) 100, (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 100");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray10);
        org.junit.Assert.assertNotNull(itemArray15);
        org.junit.Assert.assertNotNull(itemArray22);
    }

    @Test
    public void test342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test342");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) '4');
        ds.Item item2 = fPHeapMax1.max();
        ds.FPHeapMax fPHeapMax4 = new ds.FPHeapMax(0);
        fPHeapMax4.imprime();
        ds.Item[] itemArray6 = new ds.Item[] {};
        fPHeapMax4.copia(itemArray6);
        fPHeapMax4.constroi();
        fPHeapMax4.imprime();
        ds.Item[] itemArray10 = new ds.Item[] {};
        fPHeapMax4.copia(itemArray10);
        fPHeapMax1.copia(itemArray10);
        ds.FPHeapMax fPHeapMax14 = new ds.FPHeapMax((int) '#');
        ds.FPHeapMax fPHeapMax16 = new ds.FPHeapMax(0);
        fPHeapMax16.imprime();
        fPHeapMax16.constroi();
        ds.FPHeapMax fPHeapMax20 = new ds.FPHeapMax(0);
        ds.Item item21 = null;
        ds.Item[] itemArray22 = new ds.Item[] { item21 };
        fPHeapMax20.copia(itemArray22);
        fPHeapMax16.copia(itemArray22);
        fPHeapMax14.copia(itemArray22);
        fPHeapMax14.constroi();
        ds.FPHeapMax fPHeapMax28 = new ds.FPHeapMax(0);
        fPHeapMax28.imprime();
        fPHeapMax28.constroi();
        fPHeapMax28.imprime();
        fPHeapMax28.constroi();
        ds.Item item33 = null;
        ds.Item[] itemArray34 = new ds.Item[] { item33 };
        fPHeapMax28.copia(itemArray34);
        ds.FPHeapMax fPHeapMax37 = new ds.FPHeapMax(0);
        ds.Item item38 = null;
        ds.Item[] itemArray39 = new ds.Item[] { item38 };
        fPHeapMax37.copia(itemArray39);
        fPHeapMax37.imprime();
        ds.FPHeapMax fPHeapMax43 = new ds.FPHeapMax((int) (byte) -1);
        fPHeapMax43.constroi();
        fPHeapMax43.imprime();
        ds.Item[] itemArray46 = new ds.Item[] {};
        fPHeapMax43.copia(itemArray46);
        fPHeapMax37.copia(itemArray46);
        fPHeapMax28.copia(itemArray46);
        ds.FPHeapMax fPHeapMax51 = new ds.FPHeapMax(0);
        fPHeapMax51.imprime();
        fPHeapMax51.constroi();
        fPHeapMax51.imprime();
        fPHeapMax51.constroi();
        fPHeapMax51.imprime();
        ds.FPHeapMax fPHeapMax58 = new ds.FPHeapMax(1);
        fPHeapMax58.constroi();
        fPHeapMax58.imprime();
        ds.FPHeapMax fPHeapMax62 = new ds.FPHeapMax((int) '4');
        ds.Item item63 = fPHeapMax62.max();
        ds.FPHeapMax fPHeapMax65 = new ds.FPHeapMax(0);
        fPHeapMax65.imprime();
        ds.Item[] itemArray67 = new ds.Item[] {};
        fPHeapMax65.copia(itemArray67);
        fPHeapMax65.constroi();
        fPHeapMax65.imprime();
        ds.Item[] itemArray71 = new ds.Item[] {};
        fPHeapMax65.copia(itemArray71);
        fPHeapMax62.copia(itemArray71);
        fPHeapMax58.copia(itemArray71);
        fPHeapMax51.copia(itemArray71);
        fPHeapMax28.copia(itemArray71);
        fPHeapMax14.copia(itemArray71);
        fPHeapMax1.copia(itemArray71);
        org.junit.Assert.assertNull(item2);
        org.junit.Assert.assertNotNull(itemArray6);
        org.junit.Assert.assertNotNull(itemArray10);
        org.junit.Assert.assertNotNull(itemArray22);
        org.junit.Assert.assertNotNull(itemArray34);
        org.junit.Assert.assertNotNull(itemArray39);
        org.junit.Assert.assertNotNull(itemArray46);
        org.junit.Assert.assertNull(item63);
        org.junit.Assert.assertNotNull(itemArray67);
        org.junit.Assert.assertNotNull(itemArray71);
    }

    @Test
    public void test343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test343");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax(1);
        fPHeapMax1.imprime();
        fPHeapMax1.constroi();
        ds.FPHeapMax fPHeapMax5 = new ds.FPHeapMax(0);
        fPHeapMax5.imprime();
        ds.Item[] itemArray7 = new ds.Item[] {};
        fPHeapMax5.copia(itemArray7);
        fPHeapMax5.constroi();
        fPHeapMax5.imprime();
        fPHeapMax5.imprime();
        fPHeapMax5.constroi();
        ds.FPHeapMax fPHeapMax14 = new ds.FPHeapMax(0);
        fPHeapMax14.imprime();
        ds.FPHeapMax fPHeapMax17 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item18 = fPHeapMax17.max();
        ds.FPHeapMax fPHeapMax20 = new ds.FPHeapMax((int) '4');
        ds.FPHeapMax fPHeapMax22 = new ds.FPHeapMax(0);
        fPHeapMax22.imprime();
        fPHeapMax22.constroi();
        fPHeapMax22.imprime();
        ds.FPHeapMax fPHeapMax27 = new ds.FPHeapMax((int) '4');
        ds.Item item28 = fPHeapMax27.max();
        ds.FPHeapMax fPHeapMax30 = new ds.FPHeapMax(0);
        fPHeapMax30.imprime();
        ds.Item[] itemArray32 = new ds.Item[] {};
        fPHeapMax30.copia(itemArray32);
        fPHeapMax30.constroi();
        fPHeapMax30.imprime();
        ds.Item[] itemArray36 = new ds.Item[] {};
        fPHeapMax30.copia(itemArray36);
        fPHeapMax27.copia(itemArray36);
        fPHeapMax22.copia(itemArray36);
        fPHeapMax20.copia(itemArray36);
        fPHeapMax17.copia(itemArray36);
        fPHeapMax14.copia(itemArray36);
        fPHeapMax5.copia(itemArray36);
        ds.FPHeapMax fPHeapMax45 = new ds.FPHeapMax((int) (byte) -1);
        fPHeapMax45.constroi();
        fPHeapMax45.imprime();
        ds.Item[] itemArray48 = new ds.Item[] {};
        fPHeapMax45.copia(itemArray48);
        fPHeapMax5.copia(itemArray48);
        fPHeapMax1.copia(itemArray48);
        java.lang.Class<?> wildcardClass52 = itemArray48.getClass();
        org.junit.Assert.assertNotNull(itemArray7);
        org.junit.Assert.assertNull(item18);
        org.junit.Assert.assertNull(item28);
        org.junit.Assert.assertNotNull(itemArray32);
        org.junit.Assert.assertNotNull(itemArray36);
        org.junit.Assert.assertNotNull(itemArray48);
        org.junit.Assert.assertNotNull(wildcardClass52);
    }

    @Test
    public void test344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test344");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) '#');
        ds.FPHeapMax fPHeapMax3 = new ds.FPHeapMax(0);
        fPHeapMax3.imprime();
        fPHeapMax3.constroi();
        ds.FPHeapMax fPHeapMax7 = new ds.FPHeapMax(0);
        ds.Item item8 = null;
        ds.Item[] itemArray9 = new ds.Item[] { item8 };
        fPHeapMax7.copia(itemArray9);
        fPHeapMax3.copia(itemArray9);
        fPHeapMax1.copia(itemArray9);
        ds.Item item13 = fPHeapMax1.max();
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMax1.refaz((int) (short) 1, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray9);
        org.junit.Assert.assertNull(item13);
    }

    @Test
    public void test345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test345");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax(0);
        fPHeapMax1.imprime();
        fPHeapMax1.constroi();
        fPHeapMax1.imprime();
        fPHeapMax1.constroi();
        fPHeapMax1.imprime();
        ds.FPHeapMax fPHeapMax8 = new ds.FPHeapMax(0);
        ds.Item item9 = null;
        ds.Item[] itemArray10 = new ds.Item[] { item9 };
        fPHeapMax8.copia(itemArray10);
        fPHeapMax8.imprime();
        ds.FPHeapMax fPHeapMax14 = new ds.FPHeapMax((int) (byte) -1);
        fPHeapMax14.constroi();
        fPHeapMax14.imprime();
        ds.Item[] itemArray17 = new ds.Item[] {};
        fPHeapMax14.copia(itemArray17);
        fPHeapMax8.copia(itemArray17);
        fPHeapMax1.copia(itemArray17);
        fPHeapMax1.constroi();
        ds.FPHeapMax fPHeapMax24 = new ds.FPHeapMax((int) '4');
        ds.Item item25 = fPHeapMax24.max();
        fPHeapMax24.constroi();
        fPHeapMax24.constroi();
        fPHeapMax24.imprime();
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMax1.aumentaChave((int) (byte) 100, (java.lang.Object) fPHeapMax24);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 100");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray10);
        org.junit.Assert.assertNotNull(itemArray17);
        org.junit.Assert.assertNull(item25);
    }

    @Test
    public void test346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test346");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) '4');
        ds.Item item2 = fPHeapMax1.max();
        fPHeapMax1.constroi();
        fPHeapMax1.constroi();
        fPHeapMax1.imprime();
        fPHeapMax1.imprime();
        java.lang.Object obj8 = null;
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMax1.aumentaChave((int) (short) 10, obj8);
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: chaveNova com valor null");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(item2);
    }

    @Test
    public void test347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test347");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax(0);
        fPHeapMax1.imprime();
        ds.Item[] itemArray3 = new ds.Item[] {};
        fPHeapMax1.copia(itemArray3);
        fPHeapMax1.constroi();
        fPHeapMax1.imprime();
        fPHeapMax1.imprime();
        fPHeapMax1.constroi();
        ds.FPHeapMax fPHeapMax10 = new ds.FPHeapMax(0);
        fPHeapMax10.imprime();
        ds.FPHeapMax fPHeapMax13 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item14 = fPHeapMax13.max();
        ds.FPHeapMax fPHeapMax16 = new ds.FPHeapMax((int) '4');
        ds.FPHeapMax fPHeapMax18 = new ds.FPHeapMax(0);
        fPHeapMax18.imprime();
        fPHeapMax18.constroi();
        fPHeapMax18.imprime();
        ds.FPHeapMax fPHeapMax23 = new ds.FPHeapMax((int) '4');
        ds.Item item24 = fPHeapMax23.max();
        ds.FPHeapMax fPHeapMax26 = new ds.FPHeapMax(0);
        fPHeapMax26.imprime();
        ds.Item[] itemArray28 = new ds.Item[] {};
        fPHeapMax26.copia(itemArray28);
        fPHeapMax26.constroi();
        fPHeapMax26.imprime();
        ds.Item[] itemArray32 = new ds.Item[] {};
        fPHeapMax26.copia(itemArray32);
        fPHeapMax23.copia(itemArray32);
        fPHeapMax18.copia(itemArray32);
        fPHeapMax16.copia(itemArray32);
        fPHeapMax13.copia(itemArray32);
        fPHeapMax10.copia(itemArray32);
        fPHeapMax1.copia(itemArray32);
        ds.FPHeapMax fPHeapMax41 = new ds.FPHeapMax(0);
        fPHeapMax41.imprime();
        ds.Item[] itemArray43 = new ds.Item[] {};
        fPHeapMax41.copia(itemArray43);
        fPHeapMax41.constroi();
        fPHeapMax41.imprime();
        ds.Item[] itemArray47 = new ds.Item[] {};
        fPHeapMax41.copia(itemArray47);
        fPHeapMax1.copia(itemArray47);
        // The following exception was thrown during execution in test generation
        try {
            ds.Item item50 = fPHeapMax1.max();
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertNull(item14);
        org.junit.Assert.assertNull(item24);
        org.junit.Assert.assertNotNull(itemArray28);
        org.junit.Assert.assertNotNull(itemArray32);
        org.junit.Assert.assertNotNull(itemArray43);
        org.junit.Assert.assertNotNull(itemArray47);
    }

    @Test
    public void test348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test348");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax(0);
        ds.Item item2 = null;
        ds.Item[] itemArray3 = new ds.Item[] { item2 };
        fPHeapMax1.copia(itemArray3);
        fPHeapMax1.imprime();
        ds.FPHeapMax fPHeapMax7 = new ds.FPHeapMax((int) (byte) -1);
        fPHeapMax7.constroi();
        fPHeapMax7.imprime();
        ds.Item[] itemArray10 = new ds.Item[] {};
        fPHeapMax7.copia(itemArray10);
        fPHeapMax1.copia(itemArray10);
        fPHeapMax1.constroi();
        ds.FPHeapMax fPHeapMax15 = new ds.FPHeapMax((int) '4');
        ds.Item item16 = fPHeapMax15.max();
        fPHeapMax15.constroi();
        ds.FPHeapMax fPHeapMax19 = new ds.FPHeapMax(0);
        fPHeapMax19.imprime();
        fPHeapMax19.constroi();
        fPHeapMax19.imprime();
        fPHeapMax19.constroi();
        fPHeapMax19.imprime();
        ds.FPHeapMax fPHeapMax26 = new ds.FPHeapMax(0);
        ds.Item item27 = null;
        ds.Item[] itemArray28 = new ds.Item[] { item27 };
        fPHeapMax26.copia(itemArray28);
        fPHeapMax26.imprime();
        ds.FPHeapMax fPHeapMax32 = new ds.FPHeapMax((int) (byte) -1);
        fPHeapMax32.constroi();
        fPHeapMax32.imprime();
        ds.Item[] itemArray35 = new ds.Item[] {};
        fPHeapMax32.copia(itemArray35);
        fPHeapMax26.copia(itemArray35);
        fPHeapMax19.copia(itemArray35);
        ds.FPHeapMax fPHeapMax40 = new ds.FPHeapMax(0);
        fPHeapMax40.imprime();
        fPHeapMax40.constroi();
        fPHeapMax40.imprime();
        ds.FPHeapMax fPHeapMax45 = new ds.FPHeapMax((int) '4');
        ds.Item item46 = fPHeapMax45.max();
        ds.FPHeapMax fPHeapMax48 = new ds.FPHeapMax(0);
        fPHeapMax48.imprime();
        ds.Item[] itemArray50 = new ds.Item[] {};
        fPHeapMax48.copia(itemArray50);
        fPHeapMax48.constroi();
        fPHeapMax48.imprime();
        ds.Item[] itemArray54 = new ds.Item[] {};
        fPHeapMax48.copia(itemArray54);
        fPHeapMax45.copia(itemArray54);
        fPHeapMax40.copia(itemArray54);
        fPHeapMax19.copia(itemArray54);
        fPHeapMax15.copia(itemArray54);
        fPHeapMax1.copia(itemArray54);
        // The following exception was thrown during execution in test generation
        try {
            ds.Item item61 = fPHeapMax1.retiraMax();
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: heap vazio");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertNotNull(itemArray10);
        org.junit.Assert.assertNull(item16);
        org.junit.Assert.assertNotNull(itemArray28);
        org.junit.Assert.assertNotNull(itemArray35);
        org.junit.Assert.assertNull(item46);
        org.junit.Assert.assertNotNull(itemArray50);
        org.junit.Assert.assertNotNull(itemArray54);
    }

    @Test
    public void test349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test349");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (byte) -1);
        fPHeapMax1.constroi();
        fPHeapMax1.imprime();
        ds.Item[] itemArray4 = new ds.Item[] {};
        fPHeapMax1.copia(itemArray4);
        fPHeapMax1.constroi();
        ds.FPHeapMax fPHeapMax9 = new ds.FPHeapMax(1);
        fPHeapMax9.constroi();
        fPHeapMax9.imprime();
        fPHeapMax9.constroi();
        ds.FPHeapMax fPHeapMax14 = new ds.FPHeapMax((int) (byte) -1);
        fPHeapMax14.constroi();
        fPHeapMax14.constroi();
        fPHeapMax14.constroi();
        ds.FPHeapMax fPHeapMax19 = new ds.FPHeapMax(0);
        fPHeapMax19.imprime();
        fPHeapMax19.constroi();
        ds.FPHeapMax fPHeapMax23 = new ds.FPHeapMax(0);
        ds.Item item24 = null;
        ds.Item[] itemArray25 = new ds.Item[] { item24 };
        fPHeapMax23.copia(itemArray25);
        fPHeapMax19.copia(itemArray25);
        fPHeapMax14.copia(itemArray25);
        fPHeapMax9.copia(itemArray25);
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMax1.aumentaChave((int) '#', (java.lang.Object) fPHeapMax9);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 35");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray4);
        org.junit.Assert.assertNotNull(itemArray25);
    }

    @Test
    public void test350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test350");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax(10);
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
    public void test351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test351");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax(0);
        fPHeapMax1.constroi();
        fPHeapMax1.imprime();
    }

    @Test
    public void test352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test352");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax(1);
        fPHeapMax1.constroi();
        fPHeapMax1.imprime();
        fPHeapMax1.constroi();
        ds.Item item5 = fPHeapMax1.max();
        ds.FPHeapMax fPHeapMax8 = new ds.FPHeapMax(0);
        fPHeapMax8.imprime();
        fPHeapMax8.constroi();
        fPHeapMax8.imprime();
        fPHeapMax8.constroi();
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMax1.aumentaChave((int) '4', (java.lang.Object) fPHeapMax8);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 52");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(item5);
    }

    @Test
    public void test353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test353");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax(1);
        fPHeapMax1.imprime();
        fPHeapMax1.constroi();
        ds.Item item4 = fPHeapMax1.max();
        org.junit.Assert.assertNull(item4);
    }

    @Test
    public void test354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test354");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax(1);
        fPHeapMax1.imprime();
        fPHeapMax1.constroi();
        ds.FPHeapMax fPHeapMax5 = new ds.FPHeapMax(0);
        fPHeapMax5.imprime();
        fPHeapMax5.constroi();
        fPHeapMax5.imprime();
        fPHeapMax5.constroi();
        ds.Item item10 = null;
        ds.Item[] itemArray11 = new ds.Item[] { item10 };
        fPHeapMax5.copia(itemArray11);
        ds.FPHeapMax fPHeapMax14 = new ds.FPHeapMax(0);
        ds.Item item15 = null;
        ds.Item[] itemArray16 = new ds.Item[] { item15 };
        fPHeapMax14.copia(itemArray16);
        fPHeapMax14.imprime();
        ds.FPHeapMax fPHeapMax20 = new ds.FPHeapMax((int) (byte) -1);
        fPHeapMax20.constroi();
        fPHeapMax20.imprime();
        ds.Item[] itemArray23 = new ds.Item[] {};
        fPHeapMax20.copia(itemArray23);
        fPHeapMax14.copia(itemArray23);
        fPHeapMax5.copia(itemArray23);
        fPHeapMax1.copia(itemArray23);
        ds.FPHeapMax fPHeapMax30 = new ds.FPHeapMax((int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMax1.aumentaChave(10, (java.lang.Object) fPHeapMax30);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 10");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray11);
        org.junit.Assert.assertNotNull(itemArray16);
        org.junit.Assert.assertNotNull(itemArray23);
    }

    @Test
    public void test355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test355");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (byte) -1);
        fPHeapMax1.constroi();
        fPHeapMax1.imprime();
        ds.Item[] itemArray4 = new ds.Item[] {};
        fPHeapMax1.copia(itemArray4);
        fPHeapMax1.constroi();
        ds.FPHeapMax fPHeapMax8 = new ds.FPHeapMax(0);
        ds.Item item9 = null;
        ds.Item[] itemArray10 = new ds.Item[] { item9 };
        fPHeapMax8.copia(itemArray10);
        fPHeapMax1.copia(itemArray10);
        ds.FPHeapMax fPHeapMax15 = new ds.FPHeapMax(1);
        fPHeapMax15.constroi();
        fPHeapMax15.imprime();
        ds.FPHeapMax fPHeapMax19 = new ds.FPHeapMax((int) '4');
        ds.Item item20 = fPHeapMax19.max();
        ds.FPHeapMax fPHeapMax22 = new ds.FPHeapMax(0);
        fPHeapMax22.imprime();
        ds.Item[] itemArray24 = new ds.Item[] {};
        fPHeapMax22.copia(itemArray24);
        fPHeapMax22.constroi();
        fPHeapMax22.imprime();
        ds.Item[] itemArray28 = new ds.Item[] {};
        fPHeapMax22.copia(itemArray28);
        fPHeapMax19.copia(itemArray28);
        fPHeapMax15.copia(itemArray28);
        ds.FPHeapMax fPHeapMax33 = new ds.FPHeapMax((int) (byte) -1);
        fPHeapMax33.constroi();
        fPHeapMax33.imprime();
        ds.Item[] itemArray36 = new ds.Item[] {};
        fPHeapMax33.copia(itemArray36);
        fPHeapMax15.copia(itemArray36);
        ds.FPHeapMax fPHeapMax40 = new ds.FPHeapMax(0);
        fPHeapMax40.imprime();
        ds.Item[] itemArray42 = new ds.Item[] {};
        fPHeapMax40.copia(itemArray42);
        fPHeapMax40.constroi();
        fPHeapMax40.imprime();
        ds.Item[] itemArray46 = new ds.Item[] {};
        fPHeapMax40.copia(itemArray46);
        fPHeapMax15.copia(itemArray46);
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMax1.aumentaChave((int) (short) -1, (java.lang.Object) fPHeapMax15);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray4);
        org.junit.Assert.assertNotNull(itemArray10);
        org.junit.Assert.assertNull(item20);
        org.junit.Assert.assertNotNull(itemArray24);
        org.junit.Assert.assertNotNull(itemArray28);
        org.junit.Assert.assertNotNull(itemArray36);
        org.junit.Assert.assertNotNull(itemArray42);
        org.junit.Assert.assertNotNull(itemArray46);
    }

    @Test
    public void test356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test356");
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
    public void test357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test357");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax(0);
        fPHeapMax1.imprime();
        fPHeapMax1.constroi();
        fPHeapMax1.imprime();
        fPHeapMax1.constroi();
        fPHeapMax1.imprime();
        ds.FPHeapMax fPHeapMax8 = new ds.FPHeapMax(0);
        ds.Item item9 = null;
        ds.Item[] itemArray10 = new ds.Item[] { item9 };
        fPHeapMax8.copia(itemArray10);
        fPHeapMax8.imprime();
        ds.FPHeapMax fPHeapMax14 = new ds.FPHeapMax((int) (byte) -1);
        fPHeapMax14.constroi();
        fPHeapMax14.imprime();
        ds.Item[] itemArray17 = new ds.Item[] {};
        fPHeapMax14.copia(itemArray17);
        fPHeapMax8.copia(itemArray17);
        fPHeapMax1.copia(itemArray17);
        fPHeapMax1.imprime();
        java.lang.Class<?> wildcardClass22 = fPHeapMax1.getClass();
        org.junit.Assert.assertNotNull(itemArray10);
        org.junit.Assert.assertNotNull(itemArray17);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test358");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) ' ');
        ds.FPHeapMax fPHeapMax3 = new ds.FPHeapMax(0);
        ds.Item item4 = null;
        ds.Item[] itemArray5 = new ds.Item[] { item4 };
        fPHeapMax3.copia(itemArray5);
        fPHeapMax1.copia(itemArray5);
        ds.FPHeapMax fPHeapMax9 = new ds.FPHeapMax(0);
        fPHeapMax9.constroi();
        fPHeapMax9.constroi();
        fPHeapMax9.constroi();
        fPHeapMax9.constroi();
        ds.FPHeapMax fPHeapMax15 = new ds.FPHeapMax(0);
        fPHeapMax15.imprime();
        ds.Item[] itemArray17 = new ds.Item[] {};
        fPHeapMax15.copia(itemArray17);
        fPHeapMax9.copia(itemArray17);
        fPHeapMax1.copia(itemArray17);
        ds.FPHeapMax fPHeapMax22 = new ds.FPHeapMax(0);
        fPHeapMax22.imprime();
        ds.Item[] itemArray24 = new ds.Item[] {};
        fPHeapMax22.copia(itemArray24);
        fPHeapMax22.constroi();
        fPHeapMax22.imprime();
        ds.Item[] itemArray28 = new ds.Item[] {};
        fPHeapMax22.copia(itemArray28);
        fPHeapMax1.copia(itemArray28);
        java.lang.Class<?> wildcardClass31 = fPHeapMax1.getClass();
        org.junit.Assert.assertNotNull(itemArray5);
        org.junit.Assert.assertNotNull(itemArray17);
        org.junit.Assert.assertNotNull(itemArray24);
        org.junit.Assert.assertNotNull(itemArray28);
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test359");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) '4');
        ds.FPHeapMax fPHeapMax3 = new ds.FPHeapMax(0);
        fPHeapMax3.imprime();
        ds.Item[] itemArray5 = new ds.Item[] {};
        fPHeapMax3.copia(itemArray5);
        fPHeapMax1.copia(itemArray5);
        ds.FPHeapMax fPHeapMax9 = new ds.FPHeapMax((int) '4');
        ds.Item item10 = fPHeapMax9.max();
        ds.FPHeapMax fPHeapMax12 = new ds.FPHeapMax(0);
        fPHeapMax12.imprime();
        ds.Item[] itemArray14 = new ds.Item[] {};
        fPHeapMax12.copia(itemArray14);
        fPHeapMax12.constroi();
        fPHeapMax12.imprime();
        ds.Item[] itemArray18 = new ds.Item[] {};
        fPHeapMax12.copia(itemArray18);
        fPHeapMax9.copia(itemArray18);
        fPHeapMax1.copia(itemArray18);
        ds.Item item22 = fPHeapMax1.max();
        fPHeapMax1.refaz((int) '#', (int) (short) 1);
        org.junit.Assert.assertNotNull(itemArray5);
        org.junit.Assert.assertNull(item10);
        org.junit.Assert.assertNotNull(itemArray14);
        org.junit.Assert.assertNotNull(itemArray18);
        org.junit.Assert.assertNull(item22);
    }

    @Test
    public void test360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test360");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax(0);
        fPHeapMax1.constroi();
        fPHeapMax1.constroi();
        fPHeapMax1.constroi();
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMax1.refaz((int) 'a', (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 97");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test361");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) '#');
        ds.FPHeapMax fPHeapMax3 = new ds.FPHeapMax(0);
        fPHeapMax3.imprime();
        fPHeapMax3.constroi();
        ds.FPHeapMax fPHeapMax7 = new ds.FPHeapMax(0);
        ds.Item item8 = null;
        ds.Item[] itemArray9 = new ds.Item[] { item8 };
        fPHeapMax7.copia(itemArray9);
        fPHeapMax3.copia(itemArray9);
        fPHeapMax1.copia(itemArray9);
        fPHeapMax1.constroi();
        ds.FPHeapMax fPHeapMax15 = new ds.FPHeapMax((int) '#');
        ds.FPHeapMax fPHeapMax17 = new ds.FPHeapMax(0);
        fPHeapMax17.imprime();
        fPHeapMax17.constroi();
        ds.FPHeapMax fPHeapMax21 = new ds.FPHeapMax(0);
        ds.Item item22 = null;
        ds.Item[] itemArray23 = new ds.Item[] { item22 };
        fPHeapMax21.copia(itemArray23);
        fPHeapMax17.copia(itemArray23);
        fPHeapMax15.copia(itemArray23);
        fPHeapMax15.constroi();
        ds.FPHeapMax fPHeapMax29 = new ds.FPHeapMax(0);
        fPHeapMax29.imprime();
        fPHeapMax29.constroi();
        fPHeapMax29.imprime();
        fPHeapMax29.constroi();
        ds.Item item34 = null;
        ds.Item[] itemArray35 = new ds.Item[] { item34 };
        fPHeapMax29.copia(itemArray35);
        ds.FPHeapMax fPHeapMax38 = new ds.FPHeapMax(0);
        ds.Item item39 = null;
        ds.Item[] itemArray40 = new ds.Item[] { item39 };
        fPHeapMax38.copia(itemArray40);
        fPHeapMax38.imprime();
        ds.FPHeapMax fPHeapMax44 = new ds.FPHeapMax((int) (byte) -1);
        fPHeapMax44.constroi();
        fPHeapMax44.imprime();
        ds.Item[] itemArray47 = new ds.Item[] {};
        fPHeapMax44.copia(itemArray47);
        fPHeapMax38.copia(itemArray47);
        fPHeapMax29.copia(itemArray47);
        ds.FPHeapMax fPHeapMax52 = new ds.FPHeapMax(0);
        fPHeapMax52.imprime();
        fPHeapMax52.constroi();
        fPHeapMax52.imprime();
        fPHeapMax52.constroi();
        fPHeapMax52.imprime();
        ds.FPHeapMax fPHeapMax59 = new ds.FPHeapMax(1);
        fPHeapMax59.constroi();
        fPHeapMax59.imprime();
        ds.FPHeapMax fPHeapMax63 = new ds.FPHeapMax((int) '4');
        ds.Item item64 = fPHeapMax63.max();
        ds.FPHeapMax fPHeapMax66 = new ds.FPHeapMax(0);
        fPHeapMax66.imprime();
        ds.Item[] itemArray68 = new ds.Item[] {};
        fPHeapMax66.copia(itemArray68);
        fPHeapMax66.constroi();
        fPHeapMax66.imprime();
        ds.Item[] itemArray72 = new ds.Item[] {};
        fPHeapMax66.copia(itemArray72);
        fPHeapMax63.copia(itemArray72);
        fPHeapMax59.copia(itemArray72);
        fPHeapMax52.copia(itemArray72);
        fPHeapMax29.copia(itemArray72);
        fPHeapMax15.copia(itemArray72);
        fPHeapMax1.copia(itemArray72);
        fPHeapMax1.imprime();
        org.junit.Assert.assertNotNull(itemArray9);
        org.junit.Assert.assertNotNull(itemArray23);
        org.junit.Assert.assertNotNull(itemArray35);
        org.junit.Assert.assertNotNull(itemArray40);
        org.junit.Assert.assertNotNull(itemArray47);
        org.junit.Assert.assertNull(item64);
        org.junit.Assert.assertNotNull(itemArray68);
        org.junit.Assert.assertNotNull(itemArray72);
    }

    @Test
    public void test362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test362");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (byte) -1);
        fPHeapMax1.constroi();
        fPHeapMax1.constroi();
        fPHeapMax1.constroi();
        ds.FPHeapMax fPHeapMax6 = new ds.FPHeapMax(0);
        fPHeapMax6.imprime();
        fPHeapMax6.constroi();
        ds.FPHeapMax fPHeapMax10 = new ds.FPHeapMax(0);
        ds.Item item11 = null;
        ds.Item[] itemArray12 = new ds.Item[] { item11 };
        fPHeapMax10.copia(itemArray12);
        fPHeapMax6.copia(itemArray12);
        fPHeapMax1.copia(itemArray12);
        fPHeapMax1.imprime();
        java.lang.Class<?> wildcardClass17 = fPHeapMax1.getClass();
        org.junit.Assert.assertNotNull(itemArray12);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test363");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax(0);
        fPHeapMax1.imprime();
        fPHeapMax1.constroi();
        fPHeapMax1.imprime();
        fPHeapMax1.constroi();
        ds.Item item6 = null;
        ds.Item[] itemArray7 = new ds.Item[] { item6 };
        fPHeapMax1.copia(itemArray7);
        ds.FPHeapMax fPHeapMax10 = new ds.FPHeapMax(0);
        ds.Item item11 = null;
        ds.Item[] itemArray12 = new ds.Item[] { item11 };
        fPHeapMax10.copia(itemArray12);
        fPHeapMax10.imprime();
        ds.FPHeapMax fPHeapMax16 = new ds.FPHeapMax((int) (byte) -1);
        fPHeapMax16.constroi();
        fPHeapMax16.imprime();
        ds.Item[] itemArray19 = new ds.Item[] {};
        fPHeapMax16.copia(itemArray19);
        fPHeapMax10.copia(itemArray19);
        fPHeapMax1.copia(itemArray19);
        fPHeapMax1.constroi();
        ds.FPHeapMax fPHeapMax25 = new ds.FPHeapMax(0);
        fPHeapMax25.imprime();
        fPHeapMax25.constroi();
        fPHeapMax25.imprime();
        fPHeapMax25.constroi();
        fPHeapMax25.imprime();
        ds.FPHeapMax fPHeapMax32 = new ds.FPHeapMax((int) (byte) -1);
        fPHeapMax32.constroi();
        fPHeapMax32.imprime();
        ds.Item[] itemArray35 = new ds.Item[] {};
        fPHeapMax32.copia(itemArray35);
        fPHeapMax25.copia(itemArray35);
        fPHeapMax1.copia(itemArray35);
        // The following exception was thrown during execution in test generation
        try {
            ds.Item item39 = fPHeapMax1.retiraMax();
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: heap vazio");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray7);
        org.junit.Assert.assertNotNull(itemArray12);
        org.junit.Assert.assertNotNull(itemArray19);
        org.junit.Assert.assertNotNull(itemArray35);
    }

    @Test
    public void test364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test364");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item2 = fPHeapMax1.max();
        ds.FPHeapMax fPHeapMax4 = new ds.FPHeapMax((int) '4');
        ds.FPHeapMax fPHeapMax6 = new ds.FPHeapMax(0);
        fPHeapMax6.imprime();
        fPHeapMax6.constroi();
        fPHeapMax6.imprime();
        ds.FPHeapMax fPHeapMax11 = new ds.FPHeapMax((int) '4');
        ds.Item item12 = fPHeapMax11.max();
        ds.FPHeapMax fPHeapMax14 = new ds.FPHeapMax(0);
        fPHeapMax14.imprime();
        ds.Item[] itemArray16 = new ds.Item[] {};
        fPHeapMax14.copia(itemArray16);
        fPHeapMax14.constroi();
        fPHeapMax14.imprime();
        ds.Item[] itemArray20 = new ds.Item[] {};
        fPHeapMax14.copia(itemArray20);
        fPHeapMax11.copia(itemArray20);
        fPHeapMax6.copia(itemArray20);
        fPHeapMax4.copia(itemArray20);
        fPHeapMax1.copia(itemArray20);
        fPHeapMax1.refaz((int) (byte) 100, 10);
        ds.FPHeapMax fPHeapMax30 = new ds.FPHeapMax(0);
        fPHeapMax30.imprime();
        ds.Item[] itemArray32 = new ds.Item[] {};
        fPHeapMax30.copia(itemArray32);
        fPHeapMax30.constroi();
        fPHeapMax30.imprime();
        fPHeapMax30.imprime();
        fPHeapMax30.constroi();
        ds.FPHeapMax fPHeapMax39 = new ds.FPHeapMax(0);
        fPHeapMax39.imprime();
        ds.FPHeapMax fPHeapMax42 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item43 = fPHeapMax42.max();
        ds.FPHeapMax fPHeapMax45 = new ds.FPHeapMax((int) '4');
        ds.FPHeapMax fPHeapMax47 = new ds.FPHeapMax(0);
        fPHeapMax47.imprime();
        fPHeapMax47.constroi();
        fPHeapMax47.imprime();
        ds.FPHeapMax fPHeapMax52 = new ds.FPHeapMax((int) '4');
        ds.Item item53 = fPHeapMax52.max();
        ds.FPHeapMax fPHeapMax55 = new ds.FPHeapMax(0);
        fPHeapMax55.imprime();
        ds.Item[] itemArray57 = new ds.Item[] {};
        fPHeapMax55.copia(itemArray57);
        fPHeapMax55.constroi();
        fPHeapMax55.imprime();
        ds.Item[] itemArray61 = new ds.Item[] {};
        fPHeapMax55.copia(itemArray61);
        fPHeapMax52.copia(itemArray61);
        fPHeapMax47.copia(itemArray61);
        fPHeapMax45.copia(itemArray61);
        fPHeapMax42.copia(itemArray61);
        fPHeapMax39.copia(itemArray61);
        fPHeapMax30.copia(itemArray61);
        fPHeapMax1.copia(itemArray61);
        ds.FPHeapMax fPHeapMax71 = new ds.FPHeapMax((int) 'a');
        ds.FPHeapMax fPHeapMax73 = new ds.FPHeapMax(0);
        fPHeapMax73.imprime();
        fPHeapMax73.constroi();
        fPHeapMax73.imprime();
        fPHeapMax73.constroi();
        fPHeapMax73.imprime();
        ds.FPHeapMax fPHeapMax80 = new ds.FPHeapMax(1);
        fPHeapMax80.constroi();
        fPHeapMax80.imprime();
        ds.FPHeapMax fPHeapMax84 = new ds.FPHeapMax((int) '4');
        ds.Item item85 = fPHeapMax84.max();
        ds.FPHeapMax fPHeapMax87 = new ds.FPHeapMax(0);
        fPHeapMax87.imprime();
        ds.Item[] itemArray89 = new ds.Item[] {};
        fPHeapMax87.copia(itemArray89);
        fPHeapMax87.constroi();
        fPHeapMax87.imprime();
        ds.Item[] itemArray93 = new ds.Item[] {};
        fPHeapMax87.copia(itemArray93);
        fPHeapMax84.copia(itemArray93);
        fPHeapMax80.copia(itemArray93);
        fPHeapMax73.copia(itemArray93);
        fPHeapMax71.copia(itemArray93);
        fPHeapMax1.copia(itemArray93);
        org.junit.Assert.assertNull(item2);
        org.junit.Assert.assertNull(item12);
        org.junit.Assert.assertNotNull(itemArray16);
        org.junit.Assert.assertNotNull(itemArray20);
        org.junit.Assert.assertNotNull(itemArray32);
        org.junit.Assert.assertNull(item43);
        org.junit.Assert.assertNull(item53);
        org.junit.Assert.assertNotNull(itemArray57);
        org.junit.Assert.assertNotNull(itemArray61);
        org.junit.Assert.assertNull(item85);
        org.junit.Assert.assertNotNull(itemArray89);
        org.junit.Assert.assertNotNull(itemArray93);
    }

    @Test
    public void test365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test365");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax(0);
        fPHeapMax1.imprime();
        fPHeapMax1.constroi();
        ds.FPHeapMax fPHeapMax5 = new ds.FPHeapMax(0);
        ds.Item item6 = null;
        ds.Item[] itemArray7 = new ds.Item[] { item6 };
        fPHeapMax5.copia(itemArray7);
        fPHeapMax1.copia(itemArray7);
        fPHeapMax1.constroi();
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMax1.refaz((int) (byte) 100, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 100");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray7);
    }

    @Test
    public void test366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test366");
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
    public void test367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test367");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax(0);
        fPHeapMax1.imprime();
        ds.Item[] itemArray3 = new ds.Item[] {};
        fPHeapMax1.copia(itemArray3);
        fPHeapMax1.constroi();
        fPHeapMax1.imprime();
        fPHeapMax1.imprime();
        fPHeapMax1.constroi();
        ds.FPHeapMax fPHeapMax10 = new ds.FPHeapMax((int) ' ');
        ds.FPHeapMax fPHeapMax12 = new ds.FPHeapMax(0);
        ds.Item item13 = null;
        ds.Item[] itemArray14 = new ds.Item[] { item13 };
        fPHeapMax12.copia(itemArray14);
        fPHeapMax10.copia(itemArray14);
        ds.FPHeapMax fPHeapMax18 = new ds.FPHeapMax(0);
        fPHeapMax18.constroi();
        fPHeapMax18.constroi();
        fPHeapMax18.constroi();
        fPHeapMax18.constroi();
        ds.FPHeapMax fPHeapMax24 = new ds.FPHeapMax(0);
        fPHeapMax24.imprime();
        ds.Item[] itemArray26 = new ds.Item[] {};
        fPHeapMax24.copia(itemArray26);
        fPHeapMax18.copia(itemArray26);
        fPHeapMax10.copia(itemArray26);
        fPHeapMax1.copia(itemArray26);
        ds.Item item31 = null;
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMax1.insere(item31);
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: heap cheio");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertNotNull(itemArray14);
        org.junit.Assert.assertNotNull(itemArray26);
    }

    @Test
    public void test368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test368");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax(0);
        fPHeapMax1.imprime();
        ds.Item[] itemArray3 = new ds.Item[] {};
        fPHeapMax1.copia(itemArray3);
        fPHeapMax1.constroi();
        fPHeapMax1.imprime();
        fPHeapMax1.imprime();
        fPHeapMax1.constroi();
        ds.Item item9 = null;
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMax1.insere(item9);
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: heap cheio");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray3);
    }

    @Test
    public void test369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test369");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax(0);
        fPHeapMax1.imprime();
        ds.FPHeapMax fPHeapMax4 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item5 = fPHeapMax4.max();
        ds.FPHeapMax fPHeapMax7 = new ds.FPHeapMax((int) '4');
        ds.FPHeapMax fPHeapMax9 = new ds.FPHeapMax(0);
        fPHeapMax9.imprime();
        fPHeapMax9.constroi();
        fPHeapMax9.imprime();
        ds.FPHeapMax fPHeapMax14 = new ds.FPHeapMax((int) '4');
        ds.Item item15 = fPHeapMax14.max();
        ds.FPHeapMax fPHeapMax17 = new ds.FPHeapMax(0);
        fPHeapMax17.imprime();
        ds.Item[] itemArray19 = new ds.Item[] {};
        fPHeapMax17.copia(itemArray19);
        fPHeapMax17.constroi();
        fPHeapMax17.imprime();
        ds.Item[] itemArray23 = new ds.Item[] {};
        fPHeapMax17.copia(itemArray23);
        fPHeapMax14.copia(itemArray23);
        fPHeapMax9.copia(itemArray23);
        fPHeapMax7.copia(itemArray23);
        fPHeapMax4.copia(itemArray23);
        fPHeapMax1.copia(itemArray23);
        fPHeapMax1.constroi();
        fPHeapMax1.imprime();
        ds.FPHeapMax fPHeapMax33 = new ds.FPHeapMax(0);
        fPHeapMax33.imprime();
        fPHeapMax33.constroi();
        fPHeapMax33.imprime();
        fPHeapMax33.constroi();
        fPHeapMax33.imprime();
        ds.FPHeapMax fPHeapMax40 = new ds.FPHeapMax(0);
        ds.Item item41 = null;
        ds.Item[] itemArray42 = new ds.Item[] { item41 };
        fPHeapMax40.copia(itemArray42);
        fPHeapMax40.imprime();
        ds.FPHeapMax fPHeapMax46 = new ds.FPHeapMax((int) (byte) -1);
        fPHeapMax46.constroi();
        fPHeapMax46.imprime();
        ds.Item[] itemArray49 = new ds.Item[] {};
        fPHeapMax46.copia(itemArray49);
        fPHeapMax40.copia(itemArray49);
        fPHeapMax33.copia(itemArray49);
        fPHeapMax1.copia(itemArray49);
        // The following exception was thrown during execution in test generation
        try {
            ds.Item item54 = fPHeapMax1.max();
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(item5);
        org.junit.Assert.assertNull(item15);
        org.junit.Assert.assertNotNull(itemArray19);
        org.junit.Assert.assertNotNull(itemArray23);
        org.junit.Assert.assertNotNull(itemArray42);
        org.junit.Assert.assertNotNull(itemArray49);
    }

    @Test
    public void test370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test370");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax(0);
        fPHeapMax1.imprime();
        ds.Item[] itemArray3 = new ds.Item[] {};
        fPHeapMax1.copia(itemArray3);
        fPHeapMax1.constroi();
        fPHeapMax1.imprime();
        fPHeapMax1.imprime();
        fPHeapMax1.constroi();
        ds.FPHeapMax fPHeapMax10 = new ds.FPHeapMax(0);
        fPHeapMax10.imprime();
        ds.FPHeapMax fPHeapMax13 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item14 = fPHeapMax13.max();
        ds.FPHeapMax fPHeapMax16 = new ds.FPHeapMax((int) '4');
        ds.FPHeapMax fPHeapMax18 = new ds.FPHeapMax(0);
        fPHeapMax18.imprime();
        fPHeapMax18.constroi();
        fPHeapMax18.imprime();
        ds.FPHeapMax fPHeapMax23 = new ds.FPHeapMax((int) '4');
        ds.Item item24 = fPHeapMax23.max();
        ds.FPHeapMax fPHeapMax26 = new ds.FPHeapMax(0);
        fPHeapMax26.imprime();
        ds.Item[] itemArray28 = new ds.Item[] {};
        fPHeapMax26.copia(itemArray28);
        fPHeapMax26.constroi();
        fPHeapMax26.imprime();
        ds.Item[] itemArray32 = new ds.Item[] {};
        fPHeapMax26.copia(itemArray32);
        fPHeapMax23.copia(itemArray32);
        fPHeapMax18.copia(itemArray32);
        fPHeapMax16.copia(itemArray32);
        fPHeapMax13.copia(itemArray32);
        fPHeapMax10.copia(itemArray32);
        fPHeapMax1.copia(itemArray32);
        ds.FPHeapMax fPHeapMax41 = new ds.FPHeapMax((int) (byte) -1);
        fPHeapMax41.constroi();
        fPHeapMax41.imprime();
        ds.Item[] itemArray44 = new ds.Item[] {};
        fPHeapMax41.copia(itemArray44);
        fPHeapMax1.copia(itemArray44);
        ds.Item item47 = null;
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMax1.insere(item47);
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: heap cheio");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertNull(item14);
        org.junit.Assert.assertNull(item24);
        org.junit.Assert.assertNotNull(itemArray28);
        org.junit.Assert.assertNotNull(itemArray32);
        org.junit.Assert.assertNotNull(itemArray44);
    }

    @Test
    public void test371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test371");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax(0);
        fPHeapMax1.imprime();
        fPHeapMax1.constroi();
        fPHeapMax1.constroi();
        // The following exception was thrown during execution in test generation
        try {
            ds.Item item5 = fPHeapMax1.retiraMax();
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: heap vazio");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
    }

    @Test
    public void test372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test372");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax(0);
        fPHeapMax1.imprime();
        ds.FPHeapMax fPHeapMax4 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item5 = fPHeapMax4.max();
        ds.FPHeapMax fPHeapMax7 = new ds.FPHeapMax((int) '4');
        ds.FPHeapMax fPHeapMax9 = new ds.FPHeapMax(0);
        fPHeapMax9.imprime();
        fPHeapMax9.constroi();
        fPHeapMax9.imprime();
        ds.FPHeapMax fPHeapMax14 = new ds.FPHeapMax((int) '4');
        ds.Item item15 = fPHeapMax14.max();
        ds.FPHeapMax fPHeapMax17 = new ds.FPHeapMax(0);
        fPHeapMax17.imprime();
        ds.Item[] itemArray19 = new ds.Item[] {};
        fPHeapMax17.copia(itemArray19);
        fPHeapMax17.constroi();
        fPHeapMax17.imprime();
        ds.Item[] itemArray23 = new ds.Item[] {};
        fPHeapMax17.copia(itemArray23);
        fPHeapMax14.copia(itemArray23);
        fPHeapMax9.copia(itemArray23);
        fPHeapMax7.copia(itemArray23);
        fPHeapMax4.copia(itemArray23);
        fPHeapMax1.copia(itemArray23);
        fPHeapMax1.constroi();
        ds.FPHeapMax fPHeapMax32 = new ds.FPHeapMax((int) (short) 1);
        fPHeapMax32.constroi();
        ds.FPHeapMax fPHeapMax35 = new ds.FPHeapMax(0);
        fPHeapMax35.imprime();
        fPHeapMax35.constroi();
        fPHeapMax35.imprime();
        fPHeapMax35.constroi();
        ds.Item item40 = null;
        ds.Item[] itemArray41 = new ds.Item[] { item40 };
        fPHeapMax35.copia(itemArray41);
        ds.FPHeapMax fPHeapMax44 = new ds.FPHeapMax(0);
        ds.Item item45 = null;
        ds.Item[] itemArray46 = new ds.Item[] { item45 };
        fPHeapMax44.copia(itemArray46);
        fPHeapMax44.imprime();
        ds.FPHeapMax fPHeapMax50 = new ds.FPHeapMax((int) (byte) -1);
        fPHeapMax50.constroi();
        fPHeapMax50.imprime();
        ds.Item[] itemArray53 = new ds.Item[] {};
        fPHeapMax50.copia(itemArray53);
        fPHeapMax44.copia(itemArray53);
        fPHeapMax35.copia(itemArray53);
        fPHeapMax32.copia(itemArray53);
        fPHeapMax1.copia(itemArray53);
        ds.FPHeapMax fPHeapMax61 = new ds.FPHeapMax(0);
        fPHeapMax61.imprime();
        ds.Item[] itemArray63 = new ds.Item[] {};
        fPHeapMax61.copia(itemArray63);
        fPHeapMax61.constroi();
        fPHeapMax61.imprime();
        ds.Item[] itemArray67 = new ds.Item[] {};
        fPHeapMax61.copia(itemArray67);
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMax1.aumentaChave(0, (java.lang.Object) itemArray67);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(item5);
        org.junit.Assert.assertNull(item15);
        org.junit.Assert.assertNotNull(itemArray19);
        org.junit.Assert.assertNotNull(itemArray23);
        org.junit.Assert.assertNotNull(itemArray41);
        org.junit.Assert.assertNotNull(itemArray46);
        org.junit.Assert.assertNotNull(itemArray53);
        org.junit.Assert.assertNotNull(itemArray63);
        org.junit.Assert.assertNotNull(itemArray67);
    }

    @Test
    public void test373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test373");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (short) 1);
        fPHeapMax1.constroi();
        ds.FPHeapMax fPHeapMax4 = new ds.FPHeapMax(0);
        fPHeapMax4.imprime();
        fPHeapMax4.constroi();
        fPHeapMax4.imprime();
        fPHeapMax4.constroi();
        ds.Item item9 = null;
        ds.Item[] itemArray10 = new ds.Item[] { item9 };
        fPHeapMax4.copia(itemArray10);
        ds.FPHeapMax fPHeapMax13 = new ds.FPHeapMax(0);
        ds.Item item14 = null;
        ds.Item[] itemArray15 = new ds.Item[] { item14 };
        fPHeapMax13.copia(itemArray15);
        fPHeapMax13.imprime();
        ds.FPHeapMax fPHeapMax19 = new ds.FPHeapMax((int) (byte) -1);
        fPHeapMax19.constroi();
        fPHeapMax19.imprime();
        ds.Item[] itemArray22 = new ds.Item[] {};
        fPHeapMax19.copia(itemArray22);
        fPHeapMax13.copia(itemArray22);
        fPHeapMax4.copia(itemArray22);
        fPHeapMax1.copia(itemArray22);
        // The following exception was thrown during execution in test generation
        try {
            ds.Item item27 = fPHeapMax1.retiraMax();
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: heap vazio");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray10);
        org.junit.Assert.assertNotNull(itemArray15);
        org.junit.Assert.assertNotNull(itemArray22);
    }

    @Test
    public void test374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test374");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax(0);
        fPHeapMax1.imprime();
        ds.Item[] itemArray3 = new ds.Item[] {};
        fPHeapMax1.copia(itemArray3);
        fPHeapMax1.constroi();
        fPHeapMax1.imprime();
        fPHeapMax1.imprime();
        fPHeapMax1.constroi();
        ds.FPHeapMax fPHeapMax10 = new ds.FPHeapMax(0);
        fPHeapMax10.imprime();
        ds.FPHeapMax fPHeapMax13 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item14 = fPHeapMax13.max();
        ds.FPHeapMax fPHeapMax16 = new ds.FPHeapMax((int) '4');
        ds.FPHeapMax fPHeapMax18 = new ds.FPHeapMax(0);
        fPHeapMax18.imprime();
        fPHeapMax18.constroi();
        fPHeapMax18.imprime();
        ds.FPHeapMax fPHeapMax23 = new ds.FPHeapMax((int) '4');
        ds.Item item24 = fPHeapMax23.max();
        ds.FPHeapMax fPHeapMax26 = new ds.FPHeapMax(0);
        fPHeapMax26.imprime();
        ds.Item[] itemArray28 = new ds.Item[] {};
        fPHeapMax26.copia(itemArray28);
        fPHeapMax26.constroi();
        fPHeapMax26.imprime();
        ds.Item[] itemArray32 = new ds.Item[] {};
        fPHeapMax26.copia(itemArray32);
        fPHeapMax23.copia(itemArray32);
        fPHeapMax18.copia(itemArray32);
        fPHeapMax16.copia(itemArray32);
        fPHeapMax13.copia(itemArray32);
        fPHeapMax10.copia(itemArray32);
        fPHeapMax1.copia(itemArray32);
        ds.FPHeapMax fPHeapMax41 = new ds.FPHeapMax(0);
        fPHeapMax41.imprime();
        ds.Item[] itemArray43 = new ds.Item[] {};
        fPHeapMax41.copia(itemArray43);
        fPHeapMax41.constroi();
        fPHeapMax41.imprime();
        ds.Item[] itemArray47 = new ds.Item[] {};
        fPHeapMax41.copia(itemArray47);
        fPHeapMax1.copia(itemArray47);
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMax1.refaz(10, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 10");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertNull(item14);
        org.junit.Assert.assertNull(item24);
        org.junit.Assert.assertNotNull(itemArray28);
        org.junit.Assert.assertNotNull(itemArray32);
        org.junit.Assert.assertNotNull(itemArray43);
        org.junit.Assert.assertNotNull(itemArray47);
    }

    @Test
    public void test375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test375");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) 'a');
        ds.FPHeapMax fPHeapMax3 = new ds.FPHeapMax(0);
        fPHeapMax3.imprime();
        fPHeapMax3.constroi();
        fPHeapMax3.imprime();
        fPHeapMax3.constroi();
        fPHeapMax3.imprime();
        ds.FPHeapMax fPHeapMax10 = new ds.FPHeapMax(1);
        fPHeapMax10.constroi();
        fPHeapMax10.imprime();
        ds.FPHeapMax fPHeapMax14 = new ds.FPHeapMax((int) '4');
        ds.Item item15 = fPHeapMax14.max();
        ds.FPHeapMax fPHeapMax17 = new ds.FPHeapMax(0);
        fPHeapMax17.imprime();
        ds.Item[] itemArray19 = new ds.Item[] {};
        fPHeapMax17.copia(itemArray19);
        fPHeapMax17.constroi();
        fPHeapMax17.imprime();
        ds.Item[] itemArray23 = new ds.Item[] {};
        fPHeapMax17.copia(itemArray23);
        fPHeapMax14.copia(itemArray23);
        fPHeapMax10.copia(itemArray23);
        fPHeapMax3.copia(itemArray23);
        fPHeapMax1.copia(itemArray23);
        fPHeapMax1.constroi();
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMax1.refaz((int) (byte) -1, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(item15);
        org.junit.Assert.assertNotNull(itemArray19);
        org.junit.Assert.assertNotNull(itemArray23);
    }

    @Test
    public void test376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test376");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax(0);
        fPHeapMax1.imprime();
        ds.Item[] itemArray3 = new ds.Item[] {};
        fPHeapMax1.copia(itemArray3);
        fPHeapMax1.constroi();
        fPHeapMax1.imprime();
        fPHeapMax1.imprime();
        fPHeapMax1.constroi();
        ds.FPHeapMax fPHeapMax10 = new ds.FPHeapMax(0);
        fPHeapMax10.imprime();
        ds.FPHeapMax fPHeapMax13 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item14 = fPHeapMax13.max();
        ds.FPHeapMax fPHeapMax16 = new ds.FPHeapMax((int) '4');
        ds.FPHeapMax fPHeapMax18 = new ds.FPHeapMax(0);
        fPHeapMax18.imprime();
        fPHeapMax18.constroi();
        fPHeapMax18.imprime();
        ds.FPHeapMax fPHeapMax23 = new ds.FPHeapMax((int) '4');
        ds.Item item24 = fPHeapMax23.max();
        ds.FPHeapMax fPHeapMax26 = new ds.FPHeapMax(0);
        fPHeapMax26.imprime();
        ds.Item[] itemArray28 = new ds.Item[] {};
        fPHeapMax26.copia(itemArray28);
        fPHeapMax26.constroi();
        fPHeapMax26.imprime();
        ds.Item[] itemArray32 = new ds.Item[] {};
        fPHeapMax26.copia(itemArray32);
        fPHeapMax23.copia(itemArray32);
        fPHeapMax18.copia(itemArray32);
        fPHeapMax16.copia(itemArray32);
        fPHeapMax13.copia(itemArray32);
        fPHeapMax10.copia(itemArray32);
        fPHeapMax1.copia(itemArray32);
        ds.FPHeapMax fPHeapMax41 = new ds.FPHeapMax(0);
        fPHeapMax41.imprime();
        ds.Item[] itemArray43 = new ds.Item[] {};
        fPHeapMax41.copia(itemArray43);
        fPHeapMax41.constroi();
        fPHeapMax41.imprime();
        ds.Item[] itemArray47 = new ds.Item[] {};
        fPHeapMax41.copia(itemArray47);
        fPHeapMax1.copia(itemArray47);
        ds.FPHeapMax fPHeapMax52 = new ds.FPHeapMax(1);
        fPHeapMax52.imprime();
        fPHeapMax52.constroi();
        ds.FPHeapMax fPHeapMax56 = new ds.FPHeapMax(0);
        fPHeapMax56.imprime();
        fPHeapMax56.constroi();
        fPHeapMax56.imprime();
        fPHeapMax56.constroi();
        ds.Item item61 = null;
        ds.Item[] itemArray62 = new ds.Item[] { item61 };
        fPHeapMax56.copia(itemArray62);
        ds.FPHeapMax fPHeapMax65 = new ds.FPHeapMax(0);
        ds.Item item66 = null;
        ds.Item[] itemArray67 = new ds.Item[] { item66 };
        fPHeapMax65.copia(itemArray67);
        fPHeapMax65.imprime();
        ds.FPHeapMax fPHeapMax71 = new ds.FPHeapMax((int) (byte) -1);
        fPHeapMax71.constroi();
        fPHeapMax71.imprime();
        ds.Item[] itemArray74 = new ds.Item[] {};
        fPHeapMax71.copia(itemArray74);
        fPHeapMax65.copia(itemArray74);
        fPHeapMax56.copia(itemArray74);
        fPHeapMax52.copia(itemArray74);
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMax1.aumentaChave((int) (byte) 0, (java.lang.Object) fPHeapMax52);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertNull(item14);
        org.junit.Assert.assertNull(item24);
        org.junit.Assert.assertNotNull(itemArray28);
        org.junit.Assert.assertNotNull(itemArray32);
        org.junit.Assert.assertNotNull(itemArray43);
        org.junit.Assert.assertNotNull(itemArray47);
        org.junit.Assert.assertNotNull(itemArray62);
        org.junit.Assert.assertNotNull(itemArray67);
        org.junit.Assert.assertNotNull(itemArray74);
    }

    @Test
    public void test377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test377");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (byte) -1);
        fPHeapMax1.constroi();
        fPHeapMax1.imprime();
        ds.Item[] itemArray4 = new ds.Item[] {};
        fPHeapMax1.copia(itemArray4);
        fPHeapMax1.constroi();
        ds.FPHeapMax fPHeapMax9 = new ds.FPHeapMax((int) (byte) -1);
        fPHeapMax9.constroi();
        fPHeapMax9.imprime();
        ds.Item[] itemArray12 = new ds.Item[] {};
        fPHeapMax9.copia(itemArray12);
        fPHeapMax9.constroi();
        ds.FPHeapMax fPHeapMax16 = new ds.FPHeapMax(0);
        fPHeapMax16.constroi();
        fPHeapMax16.constroi();
        fPHeapMax16.constroi();
        fPHeapMax16.constroi();
        ds.FPHeapMax fPHeapMax22 = new ds.FPHeapMax(0);
        fPHeapMax22.imprime();
        ds.Item[] itemArray24 = new ds.Item[] {};
        fPHeapMax22.copia(itemArray24);
        fPHeapMax16.copia(itemArray24);
        fPHeapMax9.copia(itemArray24);
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMax1.aumentaChave((int) '4', (java.lang.Object) itemArray24);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 52");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray4);
        org.junit.Assert.assertNotNull(itemArray12);
        org.junit.Assert.assertNotNull(itemArray24);
    }

    @Test
    public void test378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test378");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax(0);
        fPHeapMax1.imprime();
        ds.FPHeapMax fPHeapMax4 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item5 = fPHeapMax4.max();
        ds.FPHeapMax fPHeapMax7 = new ds.FPHeapMax((int) '4');
        ds.FPHeapMax fPHeapMax9 = new ds.FPHeapMax(0);
        fPHeapMax9.imprime();
        fPHeapMax9.constroi();
        fPHeapMax9.imprime();
        ds.FPHeapMax fPHeapMax14 = new ds.FPHeapMax((int) '4');
        ds.Item item15 = fPHeapMax14.max();
        ds.FPHeapMax fPHeapMax17 = new ds.FPHeapMax(0);
        fPHeapMax17.imprime();
        ds.Item[] itemArray19 = new ds.Item[] {};
        fPHeapMax17.copia(itemArray19);
        fPHeapMax17.constroi();
        fPHeapMax17.imprime();
        ds.Item[] itemArray23 = new ds.Item[] {};
        fPHeapMax17.copia(itemArray23);
        fPHeapMax14.copia(itemArray23);
        fPHeapMax9.copia(itemArray23);
        fPHeapMax7.copia(itemArray23);
        fPHeapMax4.copia(itemArray23);
        fPHeapMax1.copia(itemArray23);
        fPHeapMax1.constroi();
        fPHeapMax1.imprime();
        // The following exception was thrown during execution in test generation
        try {
            ds.Item item32 = fPHeapMax1.max();
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(item5);
        org.junit.Assert.assertNull(item15);
        org.junit.Assert.assertNotNull(itemArray19);
        org.junit.Assert.assertNotNull(itemArray23);
    }

    @Test
    public void test379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test379");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (byte) -1);
        fPHeapMax1.constroi();
        fPHeapMax1.constroi();
        fPHeapMax1.constroi();
        ds.FPHeapMax fPHeapMax6 = new ds.FPHeapMax(0);
        fPHeapMax6.imprime();
        fPHeapMax6.constroi();
        ds.FPHeapMax fPHeapMax10 = new ds.FPHeapMax(0);
        ds.Item item11 = null;
        ds.Item[] itemArray12 = new ds.Item[] { item11 };
        fPHeapMax10.copia(itemArray12);
        fPHeapMax6.copia(itemArray12);
        fPHeapMax1.copia(itemArray12);
        fPHeapMax1.imprime();
        fPHeapMax1.imprime();
        // The following exception was thrown during execution in test generation
        try {
            ds.Item item18 = fPHeapMax1.max();
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray12);
    }

    @Test
    public void test380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test380");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (byte) -1);
        fPHeapMax1.constroi();
        fPHeapMax1.imprime();
        ds.Item[] itemArray4 = new ds.Item[] {};
        fPHeapMax1.copia(itemArray4);
        fPHeapMax1.imprime();
        ds.FPHeapMax fPHeapMax8 = new ds.FPHeapMax((int) '4');
        ds.Item item9 = fPHeapMax8.max();
        ds.FPHeapMax fPHeapMax11 = new ds.FPHeapMax(0);
        fPHeapMax11.imprime();
        ds.Item[] itemArray13 = new ds.Item[] {};
        fPHeapMax11.copia(itemArray13);
        fPHeapMax11.constroi();
        fPHeapMax11.imprime();
        ds.Item[] itemArray17 = new ds.Item[] {};
        fPHeapMax11.copia(itemArray17);
        fPHeapMax8.copia(itemArray17);
        fPHeapMax1.copia(itemArray17);
        fPHeapMax1.constroi();
        org.junit.Assert.assertNotNull(itemArray4);
        org.junit.Assert.assertNull(item9);
        org.junit.Assert.assertNotNull(itemArray13);
        org.junit.Assert.assertNotNull(itemArray17);
    }

    @Test
    public void test381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test381");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) ' ');
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
    public void test382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test382");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax(0);
        fPHeapMax1.imprime();
        ds.FPHeapMax fPHeapMax5 = new ds.FPHeapMax((int) '4');
        ds.Item item6 = fPHeapMax5.max();
        fPHeapMax5.constroi();
        fPHeapMax5.constroi();
        java.lang.Class<?> wildcardClass9 = fPHeapMax5.getClass();
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMax1.aumentaChave((int) (short) -1, (java.lang.Object) wildcardClass9);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(item6);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test383");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) '#');
        ds.FPHeapMax fPHeapMax3 = new ds.FPHeapMax(0);
        fPHeapMax3.imprime();
        fPHeapMax3.constroi();
        ds.FPHeapMax fPHeapMax7 = new ds.FPHeapMax(0);
        ds.Item item8 = null;
        ds.Item[] itemArray9 = new ds.Item[] { item8 };
        fPHeapMax7.copia(itemArray9);
        fPHeapMax3.copia(itemArray9);
        fPHeapMax1.copia(itemArray9);
        fPHeapMax1.constroi();
        java.lang.Class<?> wildcardClass14 = fPHeapMax1.getClass();
        org.junit.Assert.assertNotNull(itemArray9);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test384");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax(0);
        fPHeapMax1.imprime();
        ds.FPHeapMax fPHeapMax4 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item5 = fPHeapMax4.max();
        ds.FPHeapMax fPHeapMax7 = new ds.FPHeapMax((int) '4');
        ds.FPHeapMax fPHeapMax9 = new ds.FPHeapMax(0);
        fPHeapMax9.imprime();
        fPHeapMax9.constroi();
        fPHeapMax9.imprime();
        ds.FPHeapMax fPHeapMax14 = new ds.FPHeapMax((int) '4');
        ds.Item item15 = fPHeapMax14.max();
        ds.FPHeapMax fPHeapMax17 = new ds.FPHeapMax(0);
        fPHeapMax17.imprime();
        ds.Item[] itemArray19 = new ds.Item[] {};
        fPHeapMax17.copia(itemArray19);
        fPHeapMax17.constroi();
        fPHeapMax17.imprime();
        ds.Item[] itemArray23 = new ds.Item[] {};
        fPHeapMax17.copia(itemArray23);
        fPHeapMax14.copia(itemArray23);
        fPHeapMax9.copia(itemArray23);
        fPHeapMax7.copia(itemArray23);
        fPHeapMax4.copia(itemArray23);
        fPHeapMax1.copia(itemArray23);
        fPHeapMax1.constroi();
        fPHeapMax1.imprime();
        java.lang.Class<?> wildcardClass32 = fPHeapMax1.getClass();
        org.junit.Assert.assertNull(item5);
        org.junit.Assert.assertNull(item15);
        org.junit.Assert.assertNotNull(itemArray19);
        org.junit.Assert.assertNotNull(itemArray23);
        org.junit.Assert.assertNotNull(wildcardClass32);
    }

    @Test
    public void test385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test385");
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
    public void test386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test386");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) '4');
        ds.Item item2 = fPHeapMax1.max();
        ds.FPHeapMax fPHeapMax4 = new ds.FPHeapMax(0);
        fPHeapMax4.imprime();
        ds.Item[] itemArray6 = new ds.Item[] {};
        fPHeapMax4.copia(itemArray6);
        fPHeapMax4.constroi();
        fPHeapMax4.imprime();
        ds.Item[] itemArray10 = new ds.Item[] {};
        fPHeapMax4.copia(itemArray10);
        fPHeapMax1.copia(itemArray10);
        fPHeapMax1.imprime();
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMax1.refaz((int) 'a', (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 97");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(item2);
        org.junit.Assert.assertNotNull(itemArray6);
        org.junit.Assert.assertNotNull(itemArray10);
    }

    @Test
    public void test387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test387");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax(0);
        fPHeapMax1.imprime();
        fPHeapMax1.constroi();
        ds.FPHeapMax fPHeapMax5 = new ds.FPHeapMax(0);
        ds.Item item6 = null;
        ds.Item[] itemArray7 = new ds.Item[] { item6 };
        fPHeapMax5.copia(itemArray7);
        fPHeapMax1.copia(itemArray7);
        fPHeapMax1.constroi();
        ds.FPHeapMax fPHeapMax12 = new ds.FPHeapMax(0);
        fPHeapMax12.imprime();
        fPHeapMax12.constroi();
        fPHeapMax12.imprime();
        fPHeapMax12.constroi();
        fPHeapMax12.imprime();
        ds.FPHeapMax fPHeapMax19 = new ds.FPHeapMax(0);
        ds.Item item20 = null;
        ds.Item[] itemArray21 = new ds.Item[] { item20 };
        fPHeapMax19.copia(itemArray21);
        fPHeapMax19.imprime();
        ds.FPHeapMax fPHeapMax25 = new ds.FPHeapMax((int) (byte) -1);
        fPHeapMax25.constroi();
        fPHeapMax25.imprime();
        ds.Item[] itemArray28 = new ds.Item[] {};
        fPHeapMax25.copia(itemArray28);
        fPHeapMax19.copia(itemArray28);
        fPHeapMax12.copia(itemArray28);
        ds.FPHeapMax fPHeapMax33 = new ds.FPHeapMax(0);
        fPHeapMax33.imprime();
        fPHeapMax33.constroi();
        fPHeapMax33.imprime();
        ds.FPHeapMax fPHeapMax38 = new ds.FPHeapMax((int) '4');
        ds.Item item39 = fPHeapMax38.max();
        ds.FPHeapMax fPHeapMax41 = new ds.FPHeapMax(0);
        fPHeapMax41.imprime();
        ds.Item[] itemArray43 = new ds.Item[] {};
        fPHeapMax41.copia(itemArray43);
        fPHeapMax41.constroi();
        fPHeapMax41.imprime();
        ds.Item[] itemArray47 = new ds.Item[] {};
        fPHeapMax41.copia(itemArray47);
        fPHeapMax38.copia(itemArray47);
        fPHeapMax33.copia(itemArray47);
        fPHeapMax12.copia(itemArray47);
        fPHeapMax1.copia(itemArray47);
        ds.FPHeapMax fPHeapMax54 = new ds.FPHeapMax(0);
        fPHeapMax54.imprime();
        fPHeapMax54.constroi();
        fPHeapMax54.imprime();
        fPHeapMax54.constroi();
        ds.Item item59 = null;
        ds.Item[] itemArray60 = new ds.Item[] { item59 };
        fPHeapMax54.copia(itemArray60);
        ds.FPHeapMax fPHeapMax63 = new ds.FPHeapMax(0);
        ds.Item item64 = null;
        ds.Item[] itemArray65 = new ds.Item[] { item64 };
        fPHeapMax63.copia(itemArray65);
        fPHeapMax63.imprime();
        ds.FPHeapMax fPHeapMax69 = new ds.FPHeapMax((int) (byte) -1);
        fPHeapMax69.constroi();
        fPHeapMax69.imprime();
        ds.Item[] itemArray72 = new ds.Item[] {};
        fPHeapMax69.copia(itemArray72);
        fPHeapMax63.copia(itemArray72);
        fPHeapMax54.copia(itemArray72);
        fPHeapMax54.constroi();
        ds.FPHeapMax fPHeapMax78 = new ds.FPHeapMax(1);
        fPHeapMax78.constroi();
        fPHeapMax78.imprime();
        ds.FPHeapMax fPHeapMax82 = new ds.FPHeapMax((int) '4');
        ds.Item item83 = fPHeapMax82.max();
        ds.FPHeapMax fPHeapMax85 = new ds.FPHeapMax(0);
        fPHeapMax85.imprime();
        ds.Item[] itemArray87 = new ds.Item[] {};
        fPHeapMax85.copia(itemArray87);
        fPHeapMax85.constroi();
        fPHeapMax85.imprime();
        ds.Item[] itemArray91 = new ds.Item[] {};
        fPHeapMax85.copia(itemArray91);
        fPHeapMax82.copia(itemArray91);
        fPHeapMax78.copia(itemArray91);
        fPHeapMax54.copia(itemArray91);
        fPHeapMax1.copia(itemArray91);
        fPHeapMax1.constroi();
        org.junit.Assert.assertNotNull(itemArray7);
        org.junit.Assert.assertNotNull(itemArray21);
        org.junit.Assert.assertNotNull(itemArray28);
        org.junit.Assert.assertNull(item39);
        org.junit.Assert.assertNotNull(itemArray43);
        org.junit.Assert.assertNotNull(itemArray47);
        org.junit.Assert.assertNotNull(itemArray60);
        org.junit.Assert.assertNotNull(itemArray65);
        org.junit.Assert.assertNotNull(itemArray72);
        org.junit.Assert.assertNull(item83);
        org.junit.Assert.assertNotNull(itemArray87);
        org.junit.Assert.assertNotNull(itemArray91);
    }

    @Test
    public void test388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test388");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax(0);
        fPHeapMax1.imprime();
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMax1.refaz((int) (short) 1, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test389");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (byte) -1);
        fPHeapMax1.constroi();
        fPHeapMax1.imprime();
        ds.Item[] itemArray4 = new ds.Item[] {};
        fPHeapMax1.copia(itemArray4);
        fPHeapMax1.constroi();
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMax1.refaz((int) (byte) 0, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 0");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray4);
    }

    @Test
    public void test390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test390");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) ' ');
        ds.FPHeapMax fPHeapMax3 = new ds.FPHeapMax(0);
        ds.Item item4 = null;
        ds.Item[] itemArray5 = new ds.Item[] { item4 };
        fPHeapMax3.copia(itemArray5);
        fPHeapMax1.copia(itemArray5);
        fPHeapMax1.imprime();
        // The following exception was thrown during execution in test generation
        try {
            ds.Item item9 = fPHeapMax1.retiraMax();
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: heap vazio");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray5);
    }

    @Test
    public void test391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test391");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax(1);
        fPHeapMax1.constroi();
        fPHeapMax1.imprime();
        fPHeapMax1.constroi();
        fPHeapMax1.imprime();
        ds.Item item6 = fPHeapMax1.max();
        org.junit.Assert.assertNull(item6);
    }

    @Test
    public void test392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test392");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax(0);
        fPHeapMax1.imprime();
        ds.Item[] itemArray3 = new ds.Item[] {};
        fPHeapMax1.copia(itemArray3);
        fPHeapMax1.constroi();
        fPHeapMax1.imprime();
        ds.Item[] itemArray7 = new ds.Item[] {};
        fPHeapMax1.copia(itemArray7);
        ds.FPHeapMax fPHeapMax11 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item12 = fPHeapMax11.max();
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMax1.aumentaChave((-1), (java.lang.Object) fPHeapMax11);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertNotNull(itemArray7);
        org.junit.Assert.assertNull(item12);
    }

    @Test
    public void test393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test393");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((-1));
        fPHeapMax1.imprime();
        fPHeapMax1.imprime();
        ds.FPHeapMax fPHeapMax5 = new ds.FPHeapMax(0);
        fPHeapMax5.imprime();
        fPHeapMax5.constroi();
        fPHeapMax5.imprime();
        ds.FPHeapMax fPHeapMax10 = new ds.FPHeapMax((int) '4');
        ds.Item item11 = fPHeapMax10.max();
        ds.FPHeapMax fPHeapMax13 = new ds.FPHeapMax(0);
        fPHeapMax13.imprime();
        ds.Item[] itemArray15 = new ds.Item[] {};
        fPHeapMax13.copia(itemArray15);
        fPHeapMax13.constroi();
        fPHeapMax13.imprime();
        ds.Item[] itemArray19 = new ds.Item[] {};
        fPHeapMax13.copia(itemArray19);
        fPHeapMax10.copia(itemArray19);
        fPHeapMax5.copia(itemArray19);
        fPHeapMax1.copia(itemArray19);
        fPHeapMax1.imprime();
        fPHeapMax1.imprime();
        fPHeapMax1.constroi();
        org.junit.Assert.assertNull(item11);
        org.junit.Assert.assertNotNull(itemArray15);
        org.junit.Assert.assertNotNull(itemArray19);
    }

    @Test
    public void test394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test394");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax(0);
        fPHeapMax1.imprime();
        ds.Item[] itemArray3 = new ds.Item[] {};
        fPHeapMax1.copia(itemArray3);
        fPHeapMax1.constroi();
        fPHeapMax1.imprime();
        fPHeapMax1.constroi();
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
    public void test395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test395");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item2 = fPHeapMax1.max();
        ds.FPHeapMax fPHeapMax4 = new ds.FPHeapMax((int) '4');
        ds.FPHeapMax fPHeapMax6 = new ds.FPHeapMax(0);
        fPHeapMax6.imprime();
        fPHeapMax6.constroi();
        fPHeapMax6.imprime();
        ds.FPHeapMax fPHeapMax11 = new ds.FPHeapMax((int) '4');
        ds.Item item12 = fPHeapMax11.max();
        ds.FPHeapMax fPHeapMax14 = new ds.FPHeapMax(0);
        fPHeapMax14.imprime();
        ds.Item[] itemArray16 = new ds.Item[] {};
        fPHeapMax14.copia(itemArray16);
        fPHeapMax14.constroi();
        fPHeapMax14.imprime();
        ds.Item[] itemArray20 = new ds.Item[] {};
        fPHeapMax14.copia(itemArray20);
        fPHeapMax11.copia(itemArray20);
        fPHeapMax6.copia(itemArray20);
        fPHeapMax4.copia(itemArray20);
        fPHeapMax1.copia(itemArray20);
        fPHeapMax1.refaz((int) (byte) 100, 10);
        fPHeapMax1.refaz(1, 0);
        ds.Item item32 = null;
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMax1.insere(item32);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(item2);
        org.junit.Assert.assertNull(item12);
        org.junit.Assert.assertNotNull(itemArray16);
        org.junit.Assert.assertNotNull(itemArray20);
    }

    @Test
    public void test396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test396");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (short) -1);
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
    public void test397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test397");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax(0);
        fPHeapMax1.imprime();
        ds.Item[] itemArray3 = new ds.Item[] {};
        fPHeapMax1.copia(itemArray3);
        fPHeapMax1.constroi();
        fPHeapMax1.imprime();
        ds.Item[] itemArray7 = new ds.Item[] {};
        fPHeapMax1.copia(itemArray7);
        ds.FPHeapMax fPHeapMax10 = new ds.FPHeapMax((int) ' ');
        ds.FPHeapMax fPHeapMax12 = new ds.FPHeapMax(0);
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
    public void test398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test398");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax(1);
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
    public void test399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test399");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) '#');
        ds.FPHeapMax fPHeapMax3 = new ds.FPHeapMax(0);
        fPHeapMax3.imprime();
        fPHeapMax3.constroi();
        ds.FPHeapMax fPHeapMax7 = new ds.FPHeapMax(0);
        ds.Item item8 = null;
        ds.Item[] itemArray9 = new ds.Item[] { item8 };
        fPHeapMax7.copia(itemArray9);
        fPHeapMax3.copia(itemArray9);
        fPHeapMax1.copia(itemArray9);
        fPHeapMax1.constroi();
        ds.FPHeapMax fPHeapMax16 = new ds.FPHeapMax((int) ' ');
        ds.FPHeapMax fPHeapMax18 = new ds.FPHeapMax(0);
        ds.Item item19 = null;
        ds.Item[] itemArray20 = new ds.Item[] { item19 };
        fPHeapMax18.copia(itemArray20);
        fPHeapMax16.copia(itemArray20);
        ds.FPHeapMax fPHeapMax24 = new ds.FPHeapMax(0);
        fPHeapMax24.constroi();
        fPHeapMax24.constroi();
        fPHeapMax24.constroi();
        fPHeapMax24.constroi();
        ds.FPHeapMax fPHeapMax30 = new ds.FPHeapMax(0);
        fPHeapMax30.imprime();
        ds.Item[] itemArray32 = new ds.Item[] {};
        fPHeapMax30.copia(itemArray32);
        fPHeapMax24.copia(itemArray32);
        fPHeapMax16.copia(itemArray32);
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMax1.aumentaChave((int) 'a', (java.lang.Object) fPHeapMax16);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 97");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray9);
        org.junit.Assert.assertNotNull(itemArray20);
        org.junit.Assert.assertNotNull(itemArray32);
    }

    @Test
    public void test400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test400");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax(0);
        fPHeapMax1.imprime();
        ds.Item[] itemArray3 = new ds.Item[] {};
        fPHeapMax1.copia(itemArray3);
        fPHeapMax1.constroi();
        fPHeapMax1.imprime();
        ds.Item[] itemArray7 = new ds.Item[] {};
        fPHeapMax1.copia(itemArray7);
        ds.FPHeapMax fPHeapMax10 = new ds.FPHeapMax((int) ' ');
        ds.FPHeapMax fPHeapMax12 = new ds.FPHeapMax(0);
        ds.Item item13 = null;
        ds.Item[] itemArray14 = new ds.Item[] { item13 };
        fPHeapMax12.copia(itemArray14);
        fPHeapMax10.copia(itemArray14);
        fPHeapMax1.copia(itemArray14);
        java.lang.Class<?> wildcardClass18 = fPHeapMax1.getClass();
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertNotNull(itemArray7);
        org.junit.Assert.assertNotNull(itemArray14);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test401");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax(1);
        fPHeapMax1.constroi();
        fPHeapMax1.imprime();
        ds.FPHeapMax fPHeapMax5 = new ds.FPHeapMax((int) '4');
        ds.Item item6 = fPHeapMax5.max();
        ds.FPHeapMax fPHeapMax8 = new ds.FPHeapMax(0);
        fPHeapMax8.imprime();
        ds.Item[] itemArray10 = new ds.Item[] {};
        fPHeapMax8.copia(itemArray10);
        fPHeapMax8.constroi();
        fPHeapMax8.imprime();
        ds.Item[] itemArray14 = new ds.Item[] {};
        fPHeapMax8.copia(itemArray14);
        fPHeapMax5.copia(itemArray14);
        fPHeapMax1.copia(itemArray14);
        ds.Item item18 = fPHeapMax1.max();
        ds.Item item19 = fPHeapMax1.max();
        ds.Item item20 = fPHeapMax1.max();
        fPHeapMax1.constroi();
        ds.FPHeapMax fPHeapMax24 = new ds.FPHeapMax((int) '4');
        ds.FPHeapMax fPHeapMax26 = new ds.FPHeapMax(0);
        fPHeapMax26.imprime();
        ds.Item[] itemArray28 = new ds.Item[] {};
        fPHeapMax26.copia(itemArray28);
        fPHeapMax24.copia(itemArray28);
        ds.FPHeapMax fPHeapMax32 = new ds.FPHeapMax((int) '4');
        ds.Item item33 = fPHeapMax32.max();
        ds.FPHeapMax fPHeapMax35 = new ds.FPHeapMax(0);
        fPHeapMax35.imprime();
        ds.Item[] itemArray37 = new ds.Item[] {};
        fPHeapMax35.copia(itemArray37);
        fPHeapMax35.constroi();
        fPHeapMax35.imprime();
        ds.Item[] itemArray41 = new ds.Item[] {};
        fPHeapMax35.copia(itemArray41);
        fPHeapMax32.copia(itemArray41);
        fPHeapMax24.copia(itemArray41);
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMax1.aumentaChave((int) '#', (java.lang.Object) itemArray41);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 35");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(item6);
        org.junit.Assert.assertNotNull(itemArray10);
        org.junit.Assert.assertNotNull(itemArray14);
        org.junit.Assert.assertNull(item18);
        org.junit.Assert.assertNull(item19);
        org.junit.Assert.assertNull(item20);
        org.junit.Assert.assertNotNull(itemArray28);
        org.junit.Assert.assertNull(item33);
        org.junit.Assert.assertNotNull(itemArray37);
        org.junit.Assert.assertNotNull(itemArray41);
    }

    @Test
    public void test402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test402");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax(0);
        fPHeapMax1.imprime();
        fPHeapMax1.constroi();
        fPHeapMax1.imprime();
        ds.FPHeapMax fPHeapMax6 = new ds.FPHeapMax((int) '4');
        ds.Item item7 = fPHeapMax6.max();
        ds.FPHeapMax fPHeapMax9 = new ds.FPHeapMax(0);
        fPHeapMax9.imprime();
        ds.Item[] itemArray11 = new ds.Item[] {};
        fPHeapMax9.copia(itemArray11);
        fPHeapMax9.constroi();
        fPHeapMax9.imprime();
        ds.Item[] itemArray15 = new ds.Item[] {};
        fPHeapMax9.copia(itemArray15);
        fPHeapMax6.copia(itemArray15);
        fPHeapMax1.copia(itemArray15);
        java.lang.Class<?> wildcardClass19 = fPHeapMax1.getClass();
        org.junit.Assert.assertNull(item7);
        org.junit.Assert.assertNotNull(itemArray11);
        org.junit.Assert.assertNotNull(itemArray15);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test403");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (short) 0);
        fPHeapMax1.imprime();
        fPHeapMax1.constroi();
        fPHeapMax1.constroi();
        ds.Item item5 = null;
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMax1.insere(item5);
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: heap cheio");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
    }

    @Test
    public void test404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test404");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax(1);
        fPHeapMax1.constroi();
        fPHeapMax1.imprime();
        fPHeapMax1.constroi();
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
    public void test405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test405");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((-1));
        fPHeapMax1.imprime();
        fPHeapMax1.imprime();
        ds.FPHeapMax fPHeapMax5 = new ds.FPHeapMax(0);
        fPHeapMax5.imprime();
        fPHeapMax5.constroi();
        fPHeapMax5.imprime();
        ds.FPHeapMax fPHeapMax10 = new ds.FPHeapMax((int) '4');
        ds.Item item11 = fPHeapMax10.max();
        ds.FPHeapMax fPHeapMax13 = new ds.FPHeapMax(0);
        fPHeapMax13.imprime();
        ds.Item[] itemArray15 = new ds.Item[] {};
        fPHeapMax13.copia(itemArray15);
        fPHeapMax13.constroi();
        fPHeapMax13.imprime();
        ds.Item[] itemArray19 = new ds.Item[] {};
        fPHeapMax13.copia(itemArray19);
        fPHeapMax10.copia(itemArray19);
        fPHeapMax5.copia(itemArray19);
        fPHeapMax1.copia(itemArray19);
        fPHeapMax1.imprime();
        fPHeapMax1.imprime();
        java.lang.Class<?> wildcardClass26 = fPHeapMax1.getClass();
        org.junit.Assert.assertNull(item11);
        org.junit.Assert.assertNotNull(itemArray15);
        org.junit.Assert.assertNotNull(itemArray19);
        org.junit.Assert.assertNotNull(wildcardClass26);
    }

    @Test
    public void test406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test406");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax(0);
        fPHeapMax1.imprime();
        fPHeapMax1.constroi();
        ds.FPHeapMax fPHeapMax5 = new ds.FPHeapMax(0);
        ds.Item item6 = null;
        ds.Item[] itemArray7 = new ds.Item[] { item6 };
        fPHeapMax5.copia(itemArray7);
        fPHeapMax1.copia(itemArray7);
        fPHeapMax1.constroi();
        ds.FPHeapMax fPHeapMax12 = new ds.FPHeapMax(0);
        fPHeapMax12.imprime();
        fPHeapMax12.constroi();
        fPHeapMax12.imprime();
        fPHeapMax12.constroi();
        fPHeapMax12.imprime();
        ds.FPHeapMax fPHeapMax19 = new ds.FPHeapMax(0);
        ds.Item item20 = null;
        ds.Item[] itemArray21 = new ds.Item[] { item20 };
        fPHeapMax19.copia(itemArray21);
        fPHeapMax19.imprime();
        ds.FPHeapMax fPHeapMax25 = new ds.FPHeapMax((int) (byte) -1);
        fPHeapMax25.constroi();
        fPHeapMax25.imprime();
        ds.Item[] itemArray28 = new ds.Item[] {};
        fPHeapMax25.copia(itemArray28);
        fPHeapMax19.copia(itemArray28);
        fPHeapMax12.copia(itemArray28);
        ds.FPHeapMax fPHeapMax33 = new ds.FPHeapMax(0);
        fPHeapMax33.imprime();
        fPHeapMax33.constroi();
        fPHeapMax33.imprime();
        ds.FPHeapMax fPHeapMax38 = new ds.FPHeapMax((int) '4');
        ds.Item item39 = fPHeapMax38.max();
        ds.FPHeapMax fPHeapMax41 = new ds.FPHeapMax(0);
        fPHeapMax41.imprime();
        ds.Item[] itemArray43 = new ds.Item[] {};
        fPHeapMax41.copia(itemArray43);
        fPHeapMax41.constroi();
        fPHeapMax41.imprime();
        ds.Item[] itemArray47 = new ds.Item[] {};
        fPHeapMax41.copia(itemArray47);
        fPHeapMax38.copia(itemArray47);
        fPHeapMax33.copia(itemArray47);
        fPHeapMax12.copia(itemArray47);
        fPHeapMax1.copia(itemArray47);
        fPHeapMax1.imprime();
        org.junit.Assert.assertNotNull(itemArray7);
        org.junit.Assert.assertNotNull(itemArray21);
        org.junit.Assert.assertNotNull(itemArray28);
        org.junit.Assert.assertNull(item39);
        org.junit.Assert.assertNotNull(itemArray43);
        org.junit.Assert.assertNotNull(itemArray47);
    }

    @Test
    public void test407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test407");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax(0);
        fPHeapMax1.imprime();
        ds.Item[] itemArray3 = new ds.Item[] {};
        fPHeapMax1.copia(itemArray3);
        fPHeapMax1.constroi();
        fPHeapMax1.imprime();
        ds.Item[] itemArray7 = new ds.Item[] {};
        fPHeapMax1.copia(itemArray7);
        ds.FPHeapMax fPHeapMax10 = new ds.FPHeapMax((int) ' ');
        ds.FPHeapMax fPHeapMax12 = new ds.FPHeapMax(0);
        ds.Item item13 = null;
        ds.Item[] itemArray14 = new ds.Item[] { item13 };
        fPHeapMax12.copia(itemArray14);
        fPHeapMax10.copia(itemArray14);
        fPHeapMax1.copia(itemArray14);
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMax1.refaz(1, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertNotNull(itemArray7);
        org.junit.Assert.assertNotNull(itemArray14);
    }

    @Test
    public void test408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test408");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax(0);
        fPHeapMax1.imprime();
        fPHeapMax1.constroi();
        fPHeapMax1.constroi();
        fPHeapMax1.constroi();
        ds.Item item6 = null;
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMax1.insere(item6);
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: heap cheio");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
    }

    @Test
    public void test409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test409");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (short) 1);
        fPHeapMax1.constroi();
        ds.FPHeapMax fPHeapMax4 = new ds.FPHeapMax((int) (byte) -1);
        fPHeapMax4.constroi();
        fPHeapMax4.imprime();
        ds.FPHeapMax fPHeapMax8 = new ds.FPHeapMax(0);
        ds.Item item9 = null;
        ds.Item[] itemArray10 = new ds.Item[] { item9 };
        fPHeapMax8.copia(itemArray10);
        fPHeapMax4.copia(itemArray10);
        fPHeapMax1.copia(itemArray10);
        fPHeapMax1.constroi();
        ds.FPHeapMax fPHeapMax16 = new ds.FPHeapMax(0);
        fPHeapMax16.imprime();
        fPHeapMax16.constroi();
        fPHeapMax16.imprime();
        fPHeapMax16.constroi();
        ds.Item item21 = null;
        ds.Item[] itemArray22 = new ds.Item[] { item21 };
        fPHeapMax16.copia(itemArray22);
        ds.FPHeapMax fPHeapMax25 = new ds.FPHeapMax(1);
        fPHeapMax25.constroi();
        fPHeapMax25.imprime();
        fPHeapMax25.constroi();
        ds.FPHeapMax fPHeapMax30 = new ds.FPHeapMax((int) (byte) -1);
        fPHeapMax30.constroi();
        fPHeapMax30.constroi();
        fPHeapMax30.constroi();
        ds.FPHeapMax fPHeapMax35 = new ds.FPHeapMax(0);
        fPHeapMax35.imprime();
        fPHeapMax35.constroi();
        ds.FPHeapMax fPHeapMax39 = new ds.FPHeapMax(0);
        ds.Item item40 = null;
        ds.Item[] itemArray41 = new ds.Item[] { item40 };
        fPHeapMax39.copia(itemArray41);
        fPHeapMax35.copia(itemArray41);
        fPHeapMax30.copia(itemArray41);
        fPHeapMax25.copia(itemArray41);
        fPHeapMax16.copia(itemArray41);
        fPHeapMax1.copia(itemArray41);
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMax1.refaz((int) 'a', (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 97");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray10);
        org.junit.Assert.assertNotNull(itemArray22);
        org.junit.Assert.assertNotNull(itemArray41);
    }

    @Test
    public void test410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test410");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax(0);
        fPHeapMax1.imprime();
        ds.Item[] itemArray3 = new ds.Item[] {};
        fPHeapMax1.copia(itemArray3);
        fPHeapMax1.constroi();
        fPHeapMax1.imprime();
        fPHeapMax1.imprime();
        fPHeapMax1.constroi();
        ds.FPHeapMax fPHeapMax10 = new ds.FPHeapMax(0);
        fPHeapMax10.imprime();
        ds.FPHeapMax fPHeapMax13 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item14 = fPHeapMax13.max();
        ds.FPHeapMax fPHeapMax16 = new ds.FPHeapMax((int) '4');
        ds.FPHeapMax fPHeapMax18 = new ds.FPHeapMax(0);
        fPHeapMax18.imprime();
        fPHeapMax18.constroi();
        fPHeapMax18.imprime();
        ds.FPHeapMax fPHeapMax23 = new ds.FPHeapMax((int) '4');
        ds.Item item24 = fPHeapMax23.max();
        ds.FPHeapMax fPHeapMax26 = new ds.FPHeapMax(0);
        fPHeapMax26.imprime();
        ds.Item[] itemArray28 = new ds.Item[] {};
        fPHeapMax26.copia(itemArray28);
        fPHeapMax26.constroi();
        fPHeapMax26.imprime();
        ds.Item[] itemArray32 = new ds.Item[] {};
        fPHeapMax26.copia(itemArray32);
        fPHeapMax23.copia(itemArray32);
        fPHeapMax18.copia(itemArray32);
        fPHeapMax16.copia(itemArray32);
        fPHeapMax13.copia(itemArray32);
        fPHeapMax10.copia(itemArray32);
        fPHeapMax1.copia(itemArray32);
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMax1.aumentaChave(10, (java.lang.Object) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 10");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertNull(item14);
        org.junit.Assert.assertNull(item24);
        org.junit.Assert.assertNotNull(itemArray28);
        org.junit.Assert.assertNotNull(itemArray32);
    }

    @Test
    public void test411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test411");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax(1);
        fPHeapMax1.constroi();
        ds.Item item3 = fPHeapMax1.max();
        fPHeapMax1.imprime();
        fPHeapMax1.constroi();
        org.junit.Assert.assertNull(item3);
    }

    @Test
    public void test412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test412");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax(1);
        fPHeapMax1.imprime();
        fPHeapMax1.constroi();
        ds.FPHeapMax fPHeapMax5 = new ds.FPHeapMax(0);
        fPHeapMax5.imprime();
        fPHeapMax5.constroi();
        fPHeapMax5.imprime();
        fPHeapMax5.constroi();
        ds.Item item10 = null;
        ds.Item[] itemArray11 = new ds.Item[] { item10 };
        fPHeapMax5.copia(itemArray11);
        ds.FPHeapMax fPHeapMax14 = new ds.FPHeapMax(0);
        ds.Item item15 = null;
        ds.Item[] itemArray16 = new ds.Item[] { item15 };
        fPHeapMax14.copia(itemArray16);
        fPHeapMax14.imprime();
        ds.FPHeapMax fPHeapMax20 = new ds.FPHeapMax((int) (byte) -1);
        fPHeapMax20.constroi();
        fPHeapMax20.imprime();
        ds.Item[] itemArray23 = new ds.Item[] {};
        fPHeapMax20.copia(itemArray23);
        fPHeapMax14.copia(itemArray23);
        fPHeapMax5.copia(itemArray23);
        fPHeapMax1.copia(itemArray23);
        ds.Item item28 = fPHeapMax1.max();
        // The following exception was thrown during execution in test generation
        try {
            ds.Item item29 = fPHeapMax1.retiraMax();
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: heap vazio");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray11);
        org.junit.Assert.assertNotNull(itemArray16);
        org.junit.Assert.assertNotNull(itemArray23);
        org.junit.Assert.assertNull(item28);
    }

    @Test
    public void test413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test413");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax(1);
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
    public void test414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test414");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (byte) -1);
        fPHeapMax1.constroi();
        fPHeapMax1.imprime();
        ds.Item[] itemArray4 = new ds.Item[] {};
        fPHeapMax1.copia(itemArray4);
        fPHeapMax1.imprime();
        ds.FPHeapMax fPHeapMax8 = new ds.FPHeapMax((int) '4');
        ds.Item item9 = fPHeapMax8.max();
        ds.FPHeapMax fPHeapMax11 = new ds.FPHeapMax(0);
        fPHeapMax11.imprime();
        ds.Item[] itemArray13 = new ds.Item[] {};
        fPHeapMax11.copia(itemArray13);
        fPHeapMax11.constroi();
        fPHeapMax11.imprime();
        ds.Item[] itemArray17 = new ds.Item[] {};
        fPHeapMax11.copia(itemArray17);
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
        org.junit.Assert.assertNotNull(itemArray4);
        org.junit.Assert.assertNull(item9);
        org.junit.Assert.assertNotNull(itemArray13);
        org.junit.Assert.assertNotNull(itemArray17);
    }

    @Test
    public void test415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test415");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (byte) 0);
        fPHeapMax1.imprime();
        ds.FPHeapMax fPHeapMax4 = new ds.FPHeapMax((int) '4');
        ds.Item item5 = fPHeapMax4.max();
        ds.FPHeapMax fPHeapMax7 = new ds.FPHeapMax(0);
        fPHeapMax7.imprime();
        ds.Item[] itemArray9 = new ds.Item[] {};
        fPHeapMax7.copia(itemArray9);
        fPHeapMax7.constroi();
        fPHeapMax7.imprime();
        ds.Item[] itemArray13 = new ds.Item[] {};
        fPHeapMax7.copia(itemArray13);
        fPHeapMax4.copia(itemArray13);
        fPHeapMax1.copia(itemArray13);
        // The following exception was thrown during execution in test generation
        try {
            ds.Item item17 = fPHeapMax1.max();
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(item5);
        org.junit.Assert.assertNotNull(itemArray9);
        org.junit.Assert.assertNotNull(itemArray13);
    }

    @Test
    public void test416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test416");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((-1));
        ds.FPHeapMax fPHeapMax3 = new ds.FPHeapMax(0);
        ds.Item item4 = null;
        ds.Item[] itemArray5 = new ds.Item[] { item4 };
        fPHeapMax3.copia(itemArray5);
        fPHeapMax3.imprime();
        ds.FPHeapMax fPHeapMax9 = new ds.FPHeapMax((int) (byte) -1);
        fPHeapMax9.constroi();
        fPHeapMax9.imprime();
        ds.Item[] itemArray12 = new ds.Item[] {};
        fPHeapMax9.copia(itemArray12);
        fPHeapMax3.copia(itemArray12);
        ds.FPHeapMax fPHeapMax16 = new ds.FPHeapMax(0);
        fPHeapMax16.imprime();
        ds.Item[] itemArray18 = new ds.Item[] {};
        fPHeapMax16.copia(itemArray18);
        fPHeapMax3.copia(itemArray18);
        fPHeapMax1.copia(itemArray18);
        fPHeapMax1.imprime();
        fPHeapMax1.constroi();
        org.junit.Assert.assertNotNull(itemArray5);
        org.junit.Assert.assertNotNull(itemArray12);
        org.junit.Assert.assertNotNull(itemArray18);
    }

    @Test
    public void test417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test417");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (byte) -1);
        fPHeapMax1.constroi();
        fPHeapMax1.imprime();
        ds.Item[] itemArray4 = new ds.Item[] {};
        fPHeapMax1.copia(itemArray4);
        fPHeapMax1.constroi();
        ds.FPHeapMax fPHeapMax8 = new ds.FPHeapMax(0);
        fPHeapMax8.imprime();
        fPHeapMax8.constroi();
        fPHeapMax8.imprime();
        fPHeapMax8.constroi();
        ds.Item item13 = null;
        ds.Item[] itemArray14 = new ds.Item[] { item13 };
        fPHeapMax8.copia(itemArray14);
        ds.FPHeapMax fPHeapMax17 = new ds.FPHeapMax(0);
        ds.Item item18 = null;
        ds.Item[] itemArray19 = new ds.Item[] { item18 };
        fPHeapMax17.copia(itemArray19);
        fPHeapMax17.imprime();
        ds.FPHeapMax fPHeapMax23 = new ds.FPHeapMax((int) (byte) -1);
        fPHeapMax23.constroi();
        fPHeapMax23.imprime();
        ds.Item[] itemArray26 = new ds.Item[] {};
        fPHeapMax23.copia(itemArray26);
        fPHeapMax17.copia(itemArray26);
        fPHeapMax8.copia(itemArray26);
        fPHeapMax1.copia(itemArray26);
        org.junit.Assert.assertNotNull(itemArray4);
        org.junit.Assert.assertNotNull(itemArray14);
        org.junit.Assert.assertNotNull(itemArray19);
        org.junit.Assert.assertNotNull(itemArray26);
    }

    @Test
    public void test418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test418");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax(0);
        fPHeapMax1.imprime();
        fPHeapMax1.constroi();
        fPHeapMax1.imprime();
        fPHeapMax1.constroi();
        fPHeapMax1.imprime();
        ds.FPHeapMax fPHeapMax8 = new ds.FPHeapMax((int) (byte) -1);
        fPHeapMax8.constroi();
        fPHeapMax8.constroi();
        fPHeapMax8.constroi();
        ds.FPHeapMax fPHeapMax13 = new ds.FPHeapMax(0);
        fPHeapMax13.imprime();
        fPHeapMax13.constroi();
        ds.FPHeapMax fPHeapMax17 = new ds.FPHeapMax(0);
        ds.Item item18 = null;
        ds.Item[] itemArray19 = new ds.Item[] { item18 };
        fPHeapMax17.copia(itemArray19);
        fPHeapMax13.copia(itemArray19);
        fPHeapMax8.copia(itemArray19);
        fPHeapMax1.copia(itemArray19);
        ds.Item item24 = null;
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMax1.insere(item24);
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: heap cheio");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray19);
    }

    @Test
    public void test419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test419");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (byte) -1);
        fPHeapMax1.constroi();
        fPHeapMax1.constroi();
        fPHeapMax1.constroi();
        ds.FPHeapMax fPHeapMax6 = new ds.FPHeapMax((int) (byte) -1);
        fPHeapMax6.constroi();
        fPHeapMax6.imprime();
        ds.FPHeapMax fPHeapMax10 = new ds.FPHeapMax(0);
        fPHeapMax10.imprime();
        fPHeapMax10.constroi();
        fPHeapMax10.imprime();
        fPHeapMax10.constroi();
        ds.Item item15 = null;
        ds.Item[] itemArray16 = new ds.Item[] { item15 };
        fPHeapMax10.copia(itemArray16);
        ds.FPHeapMax fPHeapMax19 = new ds.FPHeapMax(0);
        ds.Item item20 = null;
        ds.Item[] itemArray21 = new ds.Item[] { item20 };
        fPHeapMax19.copia(itemArray21);
        fPHeapMax19.imprime();
        ds.FPHeapMax fPHeapMax25 = new ds.FPHeapMax((int) (byte) -1);
        fPHeapMax25.constroi();
        fPHeapMax25.imprime();
        ds.Item[] itemArray28 = new ds.Item[] {};
        fPHeapMax25.copia(itemArray28);
        fPHeapMax19.copia(itemArray28);
        fPHeapMax10.copia(itemArray28);
        fPHeapMax6.copia(itemArray28);
        fPHeapMax1.copia(itemArray28);
        fPHeapMax1.imprime();
        org.junit.Assert.assertNotNull(itemArray16);
        org.junit.Assert.assertNotNull(itemArray21);
        org.junit.Assert.assertNotNull(itemArray28);
    }

    @Test
    public void test420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test420");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax(0);
        fPHeapMax1.constroi();
        fPHeapMax1.constroi();
        fPHeapMax1.constroi();
        // The following exception was thrown during execution in test generation
        try {
            ds.Item item5 = fPHeapMax1.max();
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test421");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (byte) -1);
        fPHeapMax1.constroi();
        fPHeapMax1.imprime();
        ds.Item[] itemArray4 = new ds.Item[] {};
        fPHeapMax1.copia(itemArray4);
        fPHeapMax1.constroi();
        ds.FPHeapMax fPHeapMax8 = new ds.FPHeapMax(0);
        ds.Item item9 = null;
        ds.Item[] itemArray10 = new ds.Item[] { item9 };
        fPHeapMax8.copia(itemArray10);
        fPHeapMax1.copia(itemArray10);
        fPHeapMax1.constroi();
        ds.Item item14 = null;
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMax1.insere(item14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray4);
        org.junit.Assert.assertNotNull(itemArray10);
    }

    @Test
    public void test422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test422");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax(1);
        fPHeapMax1.imprime();
        fPHeapMax1.constroi();
        ds.FPHeapMax fPHeapMax5 = new ds.FPHeapMax(0);
        fPHeapMax5.imprime();
        ds.Item[] itemArray7 = new ds.Item[] {};
        fPHeapMax5.copia(itemArray7);
        fPHeapMax5.constroi();
        fPHeapMax5.imprime();
        fPHeapMax5.imprime();
        fPHeapMax5.constroi();
        ds.FPHeapMax fPHeapMax14 = new ds.FPHeapMax(0);
        fPHeapMax14.imprime();
        ds.FPHeapMax fPHeapMax17 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item18 = fPHeapMax17.max();
        ds.FPHeapMax fPHeapMax20 = new ds.FPHeapMax((int) '4');
        ds.FPHeapMax fPHeapMax22 = new ds.FPHeapMax(0);
        fPHeapMax22.imprime();
        fPHeapMax22.constroi();
        fPHeapMax22.imprime();
        ds.FPHeapMax fPHeapMax27 = new ds.FPHeapMax((int) '4');
        ds.Item item28 = fPHeapMax27.max();
        ds.FPHeapMax fPHeapMax30 = new ds.FPHeapMax(0);
        fPHeapMax30.imprime();
        ds.Item[] itemArray32 = new ds.Item[] {};
        fPHeapMax30.copia(itemArray32);
        fPHeapMax30.constroi();
        fPHeapMax30.imprime();
        ds.Item[] itemArray36 = new ds.Item[] {};
        fPHeapMax30.copia(itemArray36);
        fPHeapMax27.copia(itemArray36);
        fPHeapMax22.copia(itemArray36);
        fPHeapMax20.copia(itemArray36);
        fPHeapMax17.copia(itemArray36);
        fPHeapMax14.copia(itemArray36);
        fPHeapMax5.copia(itemArray36);
        ds.FPHeapMax fPHeapMax45 = new ds.FPHeapMax((int) (byte) -1);
        fPHeapMax45.constroi();
        fPHeapMax45.imprime();
        ds.Item[] itemArray48 = new ds.Item[] {};
        fPHeapMax45.copia(itemArray48);
        fPHeapMax5.copia(itemArray48);
        fPHeapMax1.copia(itemArray48);
        ds.Item item52 = null;
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMax1.insere(item52);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray7);
        org.junit.Assert.assertNull(item18);
        org.junit.Assert.assertNull(item28);
        org.junit.Assert.assertNotNull(itemArray32);
        org.junit.Assert.assertNotNull(itemArray36);
        org.junit.Assert.assertNotNull(itemArray48);
    }

    @Test
    public void test423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test423");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) ' ');
        ds.FPHeapMax fPHeapMax3 = new ds.FPHeapMax(0);
        ds.Item item4 = null;
        ds.Item[] itemArray5 = new ds.Item[] { item4 };
        fPHeapMax3.copia(itemArray5);
        fPHeapMax1.copia(itemArray5);
        ds.FPHeapMax fPHeapMax9 = new ds.FPHeapMax(0);
        fPHeapMax9.constroi();
        fPHeapMax9.constroi();
        fPHeapMax9.constroi();
        fPHeapMax9.constroi();
        ds.FPHeapMax fPHeapMax15 = new ds.FPHeapMax(0);
        fPHeapMax15.imprime();
        ds.Item[] itemArray17 = new ds.Item[] {};
        fPHeapMax15.copia(itemArray17);
        fPHeapMax9.copia(itemArray17);
        fPHeapMax1.copia(itemArray17);
        ds.Item item21 = null;
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMax1.insere(item21);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray5);
        org.junit.Assert.assertNotNull(itemArray17);
    }

    @Test
    public void test424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test424");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax(1);
        fPHeapMax1.constroi();
        fPHeapMax1.imprime();
        ds.FPHeapMax fPHeapMax5 = new ds.FPHeapMax((int) '4');
        ds.Item item6 = fPHeapMax5.max();
        ds.FPHeapMax fPHeapMax8 = new ds.FPHeapMax(0);
        fPHeapMax8.imprime();
        ds.Item[] itemArray10 = new ds.Item[] {};
        fPHeapMax8.copia(itemArray10);
        fPHeapMax8.constroi();
        fPHeapMax8.imprime();
        ds.Item[] itemArray14 = new ds.Item[] {};
        fPHeapMax8.copia(itemArray14);
        fPHeapMax5.copia(itemArray14);
        fPHeapMax1.copia(itemArray14);
        ds.Item item18 = fPHeapMax1.max();
        ds.Item item19 = fPHeapMax1.max();
        ds.Item item20 = fPHeapMax1.max();
        fPHeapMax1.refaz((int) (short) 1, 0);
        fPHeapMax1.imprime();
        java.lang.Class<?> wildcardClass25 = fPHeapMax1.getClass();
        org.junit.Assert.assertNull(item6);
        org.junit.Assert.assertNotNull(itemArray10);
        org.junit.Assert.assertNotNull(itemArray14);
        org.junit.Assert.assertNull(item18);
        org.junit.Assert.assertNull(item19);
        org.junit.Assert.assertNull(item20);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test425");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) '#');
        ds.FPHeapMax fPHeapMax3 = new ds.FPHeapMax(0);
        fPHeapMax3.imprime();
        fPHeapMax3.constroi();
        ds.FPHeapMax fPHeapMax7 = new ds.FPHeapMax(0);
        ds.Item item8 = null;
        ds.Item[] itemArray9 = new ds.Item[] { item8 };
        fPHeapMax7.copia(itemArray9);
        fPHeapMax3.copia(itemArray9);
        fPHeapMax1.copia(itemArray9);
        fPHeapMax1.constroi();
        ds.FPHeapMax fPHeapMax15 = new ds.FPHeapMax((int) '#');
        ds.FPHeapMax fPHeapMax17 = new ds.FPHeapMax(0);
        fPHeapMax17.imprime();
        fPHeapMax17.constroi();
        ds.FPHeapMax fPHeapMax21 = new ds.FPHeapMax(0);
        ds.Item item22 = null;
        ds.Item[] itemArray23 = new ds.Item[] { item22 };
        fPHeapMax21.copia(itemArray23);
        fPHeapMax17.copia(itemArray23);
        fPHeapMax15.copia(itemArray23);
        fPHeapMax15.constroi();
        ds.FPHeapMax fPHeapMax29 = new ds.FPHeapMax(0);
        fPHeapMax29.imprime();
        fPHeapMax29.constroi();
        fPHeapMax29.imprime();
        fPHeapMax29.constroi();
        ds.Item item34 = null;
        ds.Item[] itemArray35 = new ds.Item[] { item34 };
        fPHeapMax29.copia(itemArray35);
        ds.FPHeapMax fPHeapMax38 = new ds.FPHeapMax(0);
        ds.Item item39 = null;
        ds.Item[] itemArray40 = new ds.Item[] { item39 };
        fPHeapMax38.copia(itemArray40);
        fPHeapMax38.imprime();
        ds.FPHeapMax fPHeapMax44 = new ds.FPHeapMax((int) (byte) -1);
        fPHeapMax44.constroi();
        fPHeapMax44.imprime();
        ds.Item[] itemArray47 = new ds.Item[] {};
        fPHeapMax44.copia(itemArray47);
        fPHeapMax38.copia(itemArray47);
        fPHeapMax29.copia(itemArray47);
        ds.FPHeapMax fPHeapMax52 = new ds.FPHeapMax(0);
        fPHeapMax52.imprime();
        fPHeapMax52.constroi();
        fPHeapMax52.imprime();
        fPHeapMax52.constroi();
        fPHeapMax52.imprime();
        ds.FPHeapMax fPHeapMax59 = new ds.FPHeapMax(1);
        fPHeapMax59.constroi();
        fPHeapMax59.imprime();
        ds.FPHeapMax fPHeapMax63 = new ds.FPHeapMax((int) '4');
        ds.Item item64 = fPHeapMax63.max();
        ds.FPHeapMax fPHeapMax66 = new ds.FPHeapMax(0);
        fPHeapMax66.imprime();
        ds.Item[] itemArray68 = new ds.Item[] {};
        fPHeapMax66.copia(itemArray68);
        fPHeapMax66.constroi();
        fPHeapMax66.imprime();
        ds.Item[] itemArray72 = new ds.Item[] {};
        fPHeapMax66.copia(itemArray72);
        fPHeapMax63.copia(itemArray72);
        fPHeapMax59.copia(itemArray72);
        fPHeapMax52.copia(itemArray72);
        fPHeapMax29.copia(itemArray72);
        fPHeapMax15.copia(itemArray72);
        fPHeapMax1.copia(itemArray72);
        fPHeapMax1.constroi();
        fPHeapMax1.constroi();
        org.junit.Assert.assertNotNull(itemArray9);
        org.junit.Assert.assertNotNull(itemArray23);
        org.junit.Assert.assertNotNull(itemArray35);
        org.junit.Assert.assertNotNull(itemArray40);
        org.junit.Assert.assertNotNull(itemArray47);
        org.junit.Assert.assertNull(item64);
        org.junit.Assert.assertNotNull(itemArray68);
        org.junit.Assert.assertNotNull(itemArray72);
    }

    @Test
    public void test426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test426");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) 'a');
        ds.FPHeapMax fPHeapMax3 = new ds.FPHeapMax(0);
        fPHeapMax3.imprime();
        fPHeapMax3.constroi();
        fPHeapMax3.imprime();
        fPHeapMax3.constroi();
        fPHeapMax3.imprime();
        ds.FPHeapMax fPHeapMax10 = new ds.FPHeapMax(1);
        fPHeapMax10.constroi();
        fPHeapMax10.imprime();
        ds.FPHeapMax fPHeapMax14 = new ds.FPHeapMax((int) '4');
        ds.Item item15 = fPHeapMax14.max();
        ds.FPHeapMax fPHeapMax17 = new ds.FPHeapMax(0);
        fPHeapMax17.imprime();
        ds.Item[] itemArray19 = new ds.Item[] {};
        fPHeapMax17.copia(itemArray19);
        fPHeapMax17.constroi();
        fPHeapMax17.imprime();
        ds.Item[] itemArray23 = new ds.Item[] {};
        fPHeapMax17.copia(itemArray23);
        fPHeapMax14.copia(itemArray23);
        fPHeapMax10.copia(itemArray23);
        fPHeapMax3.copia(itemArray23);
        fPHeapMax1.copia(itemArray23);
        fPHeapMax1.constroi();
        fPHeapMax1.constroi();
        org.junit.Assert.assertNull(item15);
        org.junit.Assert.assertNotNull(itemArray19);
        org.junit.Assert.assertNotNull(itemArray23);
    }

    @Test
    public void test427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test427");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) '#');
        ds.FPHeapMax fPHeapMax3 = new ds.FPHeapMax(0);
        fPHeapMax3.imprime();
        fPHeapMax3.constroi();
        ds.FPHeapMax fPHeapMax7 = new ds.FPHeapMax(0);
        ds.Item item8 = null;
        ds.Item[] itemArray9 = new ds.Item[] { item8 };
        fPHeapMax7.copia(itemArray9);
        fPHeapMax3.copia(itemArray9);
        fPHeapMax1.copia(itemArray9);
        fPHeapMax1.constroi();
        ds.FPHeapMax fPHeapMax15 = new ds.FPHeapMax(0);
        fPHeapMax15.imprime();
        fPHeapMax15.constroi();
        fPHeapMax15.imprime();
        fPHeapMax15.constroi();
        ds.Item item20 = null;
        ds.Item[] itemArray21 = new ds.Item[] { item20 };
        fPHeapMax15.copia(itemArray21);
        ds.FPHeapMax fPHeapMax24 = new ds.FPHeapMax(0);
        ds.Item item25 = null;
        ds.Item[] itemArray26 = new ds.Item[] { item25 };
        fPHeapMax24.copia(itemArray26);
        fPHeapMax24.imprime();
        ds.FPHeapMax fPHeapMax30 = new ds.FPHeapMax((int) (byte) -1);
        fPHeapMax30.constroi();
        fPHeapMax30.imprime();
        ds.Item[] itemArray33 = new ds.Item[] {};
        fPHeapMax30.copia(itemArray33);
        fPHeapMax24.copia(itemArray33);
        fPHeapMax15.copia(itemArray33);
        ds.FPHeapMax fPHeapMax38 = new ds.FPHeapMax(0);
        fPHeapMax38.imprime();
        fPHeapMax38.constroi();
        fPHeapMax38.imprime();
        fPHeapMax38.constroi();
        fPHeapMax38.imprime();
        ds.FPHeapMax fPHeapMax45 = new ds.FPHeapMax(1);
        fPHeapMax45.constroi();
        fPHeapMax45.imprime();
        ds.FPHeapMax fPHeapMax49 = new ds.FPHeapMax((int) '4');
        ds.Item item50 = fPHeapMax49.max();
        ds.FPHeapMax fPHeapMax52 = new ds.FPHeapMax(0);
        fPHeapMax52.imprime();
        ds.Item[] itemArray54 = new ds.Item[] {};
        fPHeapMax52.copia(itemArray54);
        fPHeapMax52.constroi();
        fPHeapMax52.imprime();
        ds.Item[] itemArray58 = new ds.Item[] {};
        fPHeapMax52.copia(itemArray58);
        fPHeapMax49.copia(itemArray58);
        fPHeapMax45.copia(itemArray58);
        fPHeapMax38.copia(itemArray58);
        fPHeapMax15.copia(itemArray58);
        fPHeapMax1.copia(itemArray58);
        fPHeapMax1.constroi();
        ds.Item item66 = fPHeapMax1.max();
        // The following exception was thrown during execution in test generation
        try {
            ds.Item item67 = fPHeapMax1.retiraMax();
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: heap vazio");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray9);
        org.junit.Assert.assertNotNull(itemArray21);
        org.junit.Assert.assertNotNull(itemArray26);
        org.junit.Assert.assertNotNull(itemArray33);
        org.junit.Assert.assertNull(item50);
        org.junit.Assert.assertNotNull(itemArray54);
        org.junit.Assert.assertNotNull(itemArray58);
        org.junit.Assert.assertNull(item66);
    }

    @Test
    public void test428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test428");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) 'a');
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
    public void test429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test429");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) '4');
        ds.FPHeapMax fPHeapMax3 = new ds.FPHeapMax(0);
        fPHeapMax3.imprime();
        fPHeapMax3.constroi();
        fPHeapMax3.imprime();
        ds.FPHeapMax fPHeapMax8 = new ds.FPHeapMax((int) '4');
        ds.Item item9 = fPHeapMax8.max();
        ds.FPHeapMax fPHeapMax11 = new ds.FPHeapMax(0);
        fPHeapMax11.imprime();
        ds.Item[] itemArray13 = new ds.Item[] {};
        fPHeapMax11.copia(itemArray13);
        fPHeapMax11.constroi();
        fPHeapMax11.imprime();
        ds.Item[] itemArray17 = new ds.Item[] {};
        fPHeapMax11.copia(itemArray17);
        fPHeapMax8.copia(itemArray17);
        fPHeapMax3.copia(itemArray17);
        fPHeapMax1.copia(itemArray17);
        fPHeapMax1.constroi();
        org.junit.Assert.assertNull(item9);
        org.junit.Assert.assertNotNull(itemArray13);
        org.junit.Assert.assertNotNull(itemArray17);
    }

    @Test
    public void test430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test430");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax(1);
        fPHeapMax1.imprime();
        fPHeapMax1.constroi();
        ds.FPHeapMax fPHeapMax5 = new ds.FPHeapMax(0);
        ds.Item item6 = null;
        ds.Item[] itemArray7 = new ds.Item[] { item6 };
        fPHeapMax5.copia(itemArray7);
        fPHeapMax5.imprime();
        ds.FPHeapMax fPHeapMax11 = new ds.FPHeapMax((int) (byte) -1);
        fPHeapMax11.constroi();
        fPHeapMax11.imprime();
        ds.Item[] itemArray14 = new ds.Item[] {};
        fPHeapMax11.copia(itemArray14);
        fPHeapMax5.copia(itemArray14);
        fPHeapMax1.copia(itemArray14);
        java.lang.Class<?> wildcardClass18 = itemArray14.getClass();
        org.junit.Assert.assertNotNull(itemArray7);
        org.junit.Assert.assertNotNull(itemArray14);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test431");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax(0);
        fPHeapMax1.imprime();
        fPHeapMax1.constroi();
        fPHeapMax1.imprime();
        fPHeapMax1.constroi();
        fPHeapMax1.imprime();
        ds.FPHeapMax fPHeapMax8 = new ds.FPHeapMax(0);
        ds.Item item9 = null;
        ds.Item[] itemArray10 = new ds.Item[] { item9 };
        fPHeapMax8.copia(itemArray10);
        fPHeapMax8.imprime();
        ds.FPHeapMax fPHeapMax14 = new ds.FPHeapMax((int) (byte) -1);
        fPHeapMax14.constroi();
        fPHeapMax14.imprime();
        ds.Item[] itemArray17 = new ds.Item[] {};
        fPHeapMax14.copia(itemArray17);
        fPHeapMax8.copia(itemArray17);
        fPHeapMax1.copia(itemArray17);
        fPHeapMax1.constroi();
        fPHeapMax1.constroi();
        // The following exception was thrown during execution in test generation
        try {
            ds.Item item23 = fPHeapMax1.retiraMax();
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: heap vazio");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray10);
        org.junit.Assert.assertNotNull(itemArray17);
    }

    @Test
    public void test432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test432");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item2 = fPHeapMax1.max();
        ds.FPHeapMax fPHeapMax4 = new ds.FPHeapMax((int) '4');
        ds.FPHeapMax fPHeapMax6 = new ds.FPHeapMax(0);
        fPHeapMax6.imprime();
        fPHeapMax6.constroi();
        fPHeapMax6.imprime();
        ds.FPHeapMax fPHeapMax11 = new ds.FPHeapMax((int) '4');
        ds.Item item12 = fPHeapMax11.max();
        ds.FPHeapMax fPHeapMax14 = new ds.FPHeapMax(0);
        fPHeapMax14.imprime();
        ds.Item[] itemArray16 = new ds.Item[] {};
        fPHeapMax14.copia(itemArray16);
        fPHeapMax14.constroi();
        fPHeapMax14.imprime();
        ds.Item[] itemArray20 = new ds.Item[] {};
        fPHeapMax14.copia(itemArray20);
        fPHeapMax11.copia(itemArray20);
        fPHeapMax6.copia(itemArray20);
        fPHeapMax4.copia(itemArray20);
        fPHeapMax1.copia(itemArray20);
        fPHeapMax1.refaz((int) (byte) 100, 10);
        ds.FPHeapMax fPHeapMax30 = new ds.FPHeapMax(0);
        fPHeapMax30.imprime();
        ds.Item[] itemArray32 = new ds.Item[] {};
        fPHeapMax30.copia(itemArray32);
        fPHeapMax30.constroi();
        fPHeapMax30.imprime();
        fPHeapMax30.imprime();
        fPHeapMax30.constroi();
        ds.FPHeapMax fPHeapMax39 = new ds.FPHeapMax(0);
        fPHeapMax39.imprime();
        ds.FPHeapMax fPHeapMax42 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item43 = fPHeapMax42.max();
        ds.FPHeapMax fPHeapMax45 = new ds.FPHeapMax((int) '4');
        ds.FPHeapMax fPHeapMax47 = new ds.FPHeapMax(0);
        fPHeapMax47.imprime();
        fPHeapMax47.constroi();
        fPHeapMax47.imprime();
        ds.FPHeapMax fPHeapMax52 = new ds.FPHeapMax((int) '4');
        ds.Item item53 = fPHeapMax52.max();
        ds.FPHeapMax fPHeapMax55 = new ds.FPHeapMax(0);
        fPHeapMax55.imprime();
        ds.Item[] itemArray57 = new ds.Item[] {};
        fPHeapMax55.copia(itemArray57);
        fPHeapMax55.constroi();
        fPHeapMax55.imprime();
        ds.Item[] itemArray61 = new ds.Item[] {};
        fPHeapMax55.copia(itemArray61);
        fPHeapMax52.copia(itemArray61);
        fPHeapMax47.copia(itemArray61);
        fPHeapMax45.copia(itemArray61);
        fPHeapMax42.copia(itemArray61);
        fPHeapMax39.copia(itemArray61);
        fPHeapMax30.copia(itemArray61);
        fPHeapMax1.copia(itemArray61);
        ds.Item item70 = null;
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMax1.insere(item70);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(item2);
        org.junit.Assert.assertNull(item12);
        org.junit.Assert.assertNotNull(itemArray16);
        org.junit.Assert.assertNotNull(itemArray20);
        org.junit.Assert.assertNotNull(itemArray32);
        org.junit.Assert.assertNull(item43);
        org.junit.Assert.assertNull(item53);
        org.junit.Assert.assertNotNull(itemArray57);
        org.junit.Assert.assertNotNull(itemArray61);
    }

    @Test
    public void test433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test433");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (short) 1);
        fPHeapMax1.constroi();
        ds.Item item3 = fPHeapMax1.max();
        org.junit.Assert.assertNull(item3);
    }

    @Test
    public void test434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test434");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax(0);
        fPHeapMax1.imprime();
        ds.Item[] itemArray3 = new ds.Item[] {};
        fPHeapMax1.copia(itemArray3);
        fPHeapMax1.constroi();
        fPHeapMax1.imprime();
        fPHeapMax1.imprime();
        fPHeapMax1.constroi();
        ds.FPHeapMax fPHeapMax10 = new ds.FPHeapMax(0);
        fPHeapMax10.imprime();
        ds.FPHeapMax fPHeapMax13 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item14 = fPHeapMax13.max();
        ds.FPHeapMax fPHeapMax16 = new ds.FPHeapMax((int) '4');
        ds.FPHeapMax fPHeapMax18 = new ds.FPHeapMax(0);
        fPHeapMax18.imprime();
        fPHeapMax18.constroi();
        fPHeapMax18.imprime();
        ds.FPHeapMax fPHeapMax23 = new ds.FPHeapMax((int) '4');
        ds.Item item24 = fPHeapMax23.max();
        ds.FPHeapMax fPHeapMax26 = new ds.FPHeapMax(0);
        fPHeapMax26.imprime();
        ds.Item[] itemArray28 = new ds.Item[] {};
        fPHeapMax26.copia(itemArray28);
        fPHeapMax26.constroi();
        fPHeapMax26.imprime();
        ds.Item[] itemArray32 = new ds.Item[] {};
        fPHeapMax26.copia(itemArray32);
        fPHeapMax23.copia(itemArray32);
        fPHeapMax18.copia(itemArray32);
        fPHeapMax16.copia(itemArray32);
        fPHeapMax13.copia(itemArray32);
        fPHeapMax10.copia(itemArray32);
        fPHeapMax1.copia(itemArray32);
        ds.FPHeapMax fPHeapMax41 = new ds.FPHeapMax(0);
        fPHeapMax41.imprime();
        ds.Item[] itemArray43 = new ds.Item[] {};
        fPHeapMax41.copia(itemArray43);
        fPHeapMax41.constroi();
        fPHeapMax41.imprime();
        ds.Item[] itemArray47 = new ds.Item[] {};
        fPHeapMax41.copia(itemArray47);
        fPHeapMax1.copia(itemArray47);
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMax1.refaz((int) (byte) -1, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertNull(item14);
        org.junit.Assert.assertNull(item24);
        org.junit.Assert.assertNotNull(itemArray28);
        org.junit.Assert.assertNotNull(itemArray32);
        org.junit.Assert.assertNotNull(itemArray43);
        org.junit.Assert.assertNotNull(itemArray47);
    }

    @Test
    public void test435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test435");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax(0);
        fPHeapMax1.imprime();
        fPHeapMax1.constroi();
        fPHeapMax1.imprime();
        fPHeapMax1.constroi();
        fPHeapMax1.imprime();
        ds.FPHeapMax fPHeapMax8 = new ds.FPHeapMax(0);
        ds.Item item9 = null;
        ds.Item[] itemArray10 = new ds.Item[] { item9 };
        fPHeapMax8.copia(itemArray10);
        fPHeapMax8.imprime();
        ds.FPHeapMax fPHeapMax14 = new ds.FPHeapMax((int) (byte) -1);
        fPHeapMax14.constroi();
        fPHeapMax14.imprime();
        ds.Item[] itemArray17 = new ds.Item[] {};
        fPHeapMax14.copia(itemArray17);
        fPHeapMax8.copia(itemArray17);
        fPHeapMax1.copia(itemArray17);
        fPHeapMax1.constroi();
        fPHeapMax1.constroi();
        ds.FPHeapMax fPHeapMax25 = new ds.FPHeapMax((int) (byte) -1);
        fPHeapMax25.constroi();
        ds.FPHeapMax fPHeapMax28 = new ds.FPHeapMax((int) ' ');
        ds.FPHeapMax fPHeapMax30 = new ds.FPHeapMax(0);
        ds.Item item31 = null;
        ds.Item[] itemArray32 = new ds.Item[] { item31 };
        fPHeapMax30.copia(itemArray32);
        fPHeapMax28.copia(itemArray32);
        fPHeapMax25.copia(itemArray32);
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMax1.aumentaChave((int) (short) 100, (java.lang.Object) fPHeapMax25);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 100");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray10);
        org.junit.Assert.assertNotNull(itemArray17);
        org.junit.Assert.assertNotNull(itemArray32);
    }

    @Test
    public void test436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test436");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax(0);
        fPHeapMax1.imprime();
        fPHeapMax1.constroi();
        fPHeapMax1.imprime();
        fPHeapMax1.constroi();
        ds.FPHeapMax fPHeapMax8 = new ds.FPHeapMax(1);
        fPHeapMax8.constroi();
        fPHeapMax8.imprime();
        ds.FPHeapMax fPHeapMax12 = new ds.FPHeapMax((int) '4');
        ds.Item item13 = fPHeapMax12.max();
        ds.FPHeapMax fPHeapMax15 = new ds.FPHeapMax(0);
        fPHeapMax15.imprime();
        ds.Item[] itemArray17 = new ds.Item[] {};
        fPHeapMax15.copia(itemArray17);
        fPHeapMax15.constroi();
        fPHeapMax15.imprime();
        ds.Item[] itemArray21 = new ds.Item[] {};
        fPHeapMax15.copia(itemArray21);
        fPHeapMax12.copia(itemArray21);
        fPHeapMax8.copia(itemArray21);
        ds.FPHeapMax fPHeapMax26 = new ds.FPHeapMax((int) (byte) -1);
        fPHeapMax26.constroi();
        fPHeapMax26.imprime();
        ds.Item[] itemArray29 = new ds.Item[] {};
        fPHeapMax26.copia(itemArray29);
        fPHeapMax8.copia(itemArray29);
        java.lang.Class<?> wildcardClass32 = itemArray29.getClass();
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMax1.aumentaChave(1, (java.lang.Object) wildcardClass32);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(item13);
        org.junit.Assert.assertNotNull(itemArray17);
        org.junit.Assert.assertNotNull(itemArray21);
        org.junit.Assert.assertNotNull(itemArray29);
        org.junit.Assert.assertNotNull(wildcardClass32);
    }

    @Test
    public void test437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test437");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (byte) -1);
        fPHeapMax1.constroi();
        fPHeapMax1.constroi();
        fPHeapMax1.constroi();
        ds.FPHeapMax fPHeapMax6 = new ds.FPHeapMax(0);
        fPHeapMax6.imprime();
        fPHeapMax6.constroi();
        ds.FPHeapMax fPHeapMax10 = new ds.FPHeapMax(0);
        ds.Item item11 = null;
        ds.Item[] itemArray12 = new ds.Item[] { item11 };
        fPHeapMax10.copia(itemArray12);
        fPHeapMax6.copia(itemArray12);
        fPHeapMax1.copia(itemArray12);
        fPHeapMax1.imprime();
        fPHeapMax1.imprime();
        ds.FPHeapMax fPHeapMax20 = new ds.FPHeapMax(0);
        fPHeapMax20.imprime();
        fPHeapMax20.constroi();
        fPHeapMax20.constroi();
        fPHeapMax20.imprime();
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMax1.aumentaChave((int) ' ', (java.lang.Object) fPHeapMax20);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 32");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray12);
    }

    @Test
    public void test438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test438");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (byte) -1);
        fPHeapMax1.constroi();
        ds.FPHeapMax fPHeapMax4 = new ds.FPHeapMax((int) ' ');
        ds.FPHeapMax fPHeapMax6 = new ds.FPHeapMax(0);
        ds.Item item7 = null;
        ds.Item[] itemArray8 = new ds.Item[] { item7 };
        fPHeapMax6.copia(itemArray8);
        fPHeapMax4.copia(itemArray8);
        fPHeapMax1.copia(itemArray8);
        fPHeapMax1.constroi();
        fPHeapMax1.imprime();
        org.junit.Assert.assertNotNull(itemArray8);
    }

    @Test
    public void test439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test439");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (byte) -1);
        fPHeapMax1.constroi();
        fPHeapMax1.imprime();
        ds.Item[] itemArray4 = new ds.Item[] {};
        fPHeapMax1.copia(itemArray4);
        fPHeapMax1.imprime();
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMax1.refaz((int) (byte) 100, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 100");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray4);
    }

    @Test
    public void test440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test440");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax(0);
        fPHeapMax1.constroi();
        fPHeapMax1.constroi();
        fPHeapMax1.constroi();
        fPHeapMax1.constroi();
        ds.FPHeapMax fPHeapMax7 = new ds.FPHeapMax(0);
        fPHeapMax7.imprime();
        ds.Item[] itemArray9 = new ds.Item[] {};
        fPHeapMax7.copia(itemArray9);
        fPHeapMax1.copia(itemArray9);
        java.lang.Object obj13 = null;
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMax1.aumentaChave((int) (short) 100, obj13);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 100");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray9);
    }

    @Test
    public void test441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test441");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax(0);
        fPHeapMax1.imprime();
        fPHeapMax1.constroi();
        fPHeapMax1.imprime();
        fPHeapMax1.constroi();
        fPHeapMax1.imprime();
        ds.FPHeapMax fPHeapMax8 = new ds.FPHeapMax(1);
        fPHeapMax8.constroi();
        fPHeapMax8.imprime();
        ds.FPHeapMax fPHeapMax12 = new ds.FPHeapMax((int) '4');
        ds.Item item13 = fPHeapMax12.max();
        ds.FPHeapMax fPHeapMax15 = new ds.FPHeapMax(0);
        fPHeapMax15.imprime();
        ds.Item[] itemArray17 = new ds.Item[] {};
        fPHeapMax15.copia(itemArray17);
        fPHeapMax15.constroi();
        fPHeapMax15.imprime();
        ds.Item[] itemArray21 = new ds.Item[] {};
        fPHeapMax15.copia(itemArray21);
        fPHeapMax12.copia(itemArray21);
        fPHeapMax8.copia(itemArray21);
        fPHeapMax1.copia(itemArray21);
        fPHeapMax1.imprime();
        org.junit.Assert.assertNull(item13);
        org.junit.Assert.assertNotNull(itemArray17);
        org.junit.Assert.assertNotNull(itemArray21);
    }

    @Test
    public void test442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test442");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) '4');
        ds.Item item2 = fPHeapMax1.max();
        fPHeapMax1.constroi();
        fPHeapMax1.constroi();
        fPHeapMax1.imprime();
        fPHeapMax1.imprime();
        fPHeapMax1.constroi();
        ds.FPHeapMax fPHeapMax9 = new ds.FPHeapMax((int) '#');
        ds.FPHeapMax fPHeapMax11 = new ds.FPHeapMax(0);
        fPHeapMax11.imprime();
        fPHeapMax11.constroi();
        ds.FPHeapMax fPHeapMax15 = new ds.FPHeapMax(0);
        ds.Item item16 = null;
        ds.Item[] itemArray17 = new ds.Item[] { item16 };
        fPHeapMax15.copia(itemArray17);
        fPHeapMax11.copia(itemArray17);
        fPHeapMax9.copia(itemArray17);
        fPHeapMax1.copia(itemArray17);
        ds.Item item22 = fPHeapMax1.max();
        ds.Item item23 = fPHeapMax1.max();
        org.junit.Assert.assertNull(item2);
        org.junit.Assert.assertNotNull(itemArray17);
        org.junit.Assert.assertNull(item22);
        org.junit.Assert.assertNull(item23);
    }

    @Test
    public void test443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test443");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax(0);
        fPHeapMax1.imprime();
        fPHeapMax1.constroi();
        ds.FPHeapMax fPHeapMax5 = new ds.FPHeapMax(0);
        ds.Item item6 = null;
        ds.Item[] itemArray7 = new ds.Item[] { item6 };
        fPHeapMax5.copia(itemArray7);
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
        org.junit.Assert.assertNotNull(itemArray7);
    }

    @Test
    public void test444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test444");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax(0);
        ds.FPHeapMax fPHeapMax3 = new ds.FPHeapMax(1);
        fPHeapMax3.imprime();
        fPHeapMax3.constroi();
        ds.FPHeapMax fPHeapMax7 = new ds.FPHeapMax(0);
        fPHeapMax7.imprime();
        ds.Item[] itemArray9 = new ds.Item[] {};
        fPHeapMax7.copia(itemArray9);
        fPHeapMax7.constroi();
        fPHeapMax7.imprime();
        fPHeapMax7.imprime();
        fPHeapMax7.constroi();
        ds.FPHeapMax fPHeapMax16 = new ds.FPHeapMax(0);
        fPHeapMax16.imprime();
        ds.FPHeapMax fPHeapMax19 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item20 = fPHeapMax19.max();
        ds.FPHeapMax fPHeapMax22 = new ds.FPHeapMax((int) '4');
        ds.FPHeapMax fPHeapMax24 = new ds.FPHeapMax(0);
        fPHeapMax24.imprime();
        fPHeapMax24.constroi();
        fPHeapMax24.imprime();
        ds.FPHeapMax fPHeapMax29 = new ds.FPHeapMax((int) '4');
        ds.Item item30 = fPHeapMax29.max();
        ds.FPHeapMax fPHeapMax32 = new ds.FPHeapMax(0);
        fPHeapMax32.imprime();
        ds.Item[] itemArray34 = new ds.Item[] {};
        fPHeapMax32.copia(itemArray34);
        fPHeapMax32.constroi();
        fPHeapMax32.imprime();
        ds.Item[] itemArray38 = new ds.Item[] {};
        fPHeapMax32.copia(itemArray38);
        fPHeapMax29.copia(itemArray38);
        fPHeapMax24.copia(itemArray38);
        fPHeapMax22.copia(itemArray38);
        fPHeapMax19.copia(itemArray38);
        fPHeapMax16.copia(itemArray38);
        fPHeapMax7.copia(itemArray38);
        ds.FPHeapMax fPHeapMax47 = new ds.FPHeapMax((int) (byte) -1);
        fPHeapMax47.constroi();
        fPHeapMax47.imprime();
        ds.Item[] itemArray50 = new ds.Item[] {};
        fPHeapMax47.copia(itemArray50);
        fPHeapMax7.copia(itemArray50);
        fPHeapMax3.copia(itemArray50);
        fPHeapMax1.copia(itemArray50);
        org.junit.Assert.assertNotNull(itemArray9);
        org.junit.Assert.assertNull(item20);
        org.junit.Assert.assertNull(item30);
        org.junit.Assert.assertNotNull(itemArray34);
        org.junit.Assert.assertNotNull(itemArray38);
        org.junit.Assert.assertNotNull(itemArray50);
    }

    @Test
    public void test445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test445");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax(0);
        fPHeapMax1.imprime();
        ds.FPHeapMax fPHeapMax4 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item5 = fPHeapMax4.max();
        ds.FPHeapMax fPHeapMax7 = new ds.FPHeapMax((int) '4');
        ds.FPHeapMax fPHeapMax9 = new ds.FPHeapMax(0);
        fPHeapMax9.imprime();
        fPHeapMax9.constroi();
        fPHeapMax9.imprime();
        ds.FPHeapMax fPHeapMax14 = new ds.FPHeapMax((int) '4');
        ds.Item item15 = fPHeapMax14.max();
        ds.FPHeapMax fPHeapMax17 = new ds.FPHeapMax(0);
        fPHeapMax17.imprime();
        ds.Item[] itemArray19 = new ds.Item[] {};
        fPHeapMax17.copia(itemArray19);
        fPHeapMax17.constroi();
        fPHeapMax17.imprime();
        ds.Item[] itemArray23 = new ds.Item[] {};
        fPHeapMax17.copia(itemArray23);
        fPHeapMax14.copia(itemArray23);
        fPHeapMax9.copia(itemArray23);
        fPHeapMax7.copia(itemArray23);
        fPHeapMax4.copia(itemArray23);
        fPHeapMax1.copia(itemArray23);
        fPHeapMax1.constroi();
        fPHeapMax1.constroi();
        org.junit.Assert.assertNull(item5);
        org.junit.Assert.assertNull(item15);
        org.junit.Assert.assertNotNull(itemArray19);
        org.junit.Assert.assertNotNull(itemArray23);
    }

    @Test
    public void test446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test446");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax(1);
        fPHeapMax1.constroi();
        fPHeapMax1.imprime();
        ds.FPHeapMax fPHeapMax5 = new ds.FPHeapMax((int) (short) 1);
        fPHeapMax5.constroi();
        ds.FPHeapMax fPHeapMax8 = new ds.FPHeapMax((int) (byte) -1);
        fPHeapMax8.constroi();
        fPHeapMax8.imprime();
        ds.FPHeapMax fPHeapMax12 = new ds.FPHeapMax(0);
        ds.Item item13 = null;
        ds.Item[] itemArray14 = new ds.Item[] { item13 };
        fPHeapMax12.copia(itemArray14);
        fPHeapMax8.copia(itemArray14);
        fPHeapMax5.copia(itemArray14);
        fPHeapMax5.imprime();
        ds.FPHeapMax fPHeapMax20 = new ds.FPHeapMax(1);
        fPHeapMax20.constroi();
        fPHeapMax20.imprime();
        ds.FPHeapMax fPHeapMax24 = new ds.FPHeapMax((int) '4');
        ds.Item item25 = fPHeapMax24.max();
        ds.FPHeapMax fPHeapMax27 = new ds.FPHeapMax(0);
        fPHeapMax27.imprime();
        ds.Item[] itemArray29 = new ds.Item[] {};
        fPHeapMax27.copia(itemArray29);
        fPHeapMax27.constroi();
        fPHeapMax27.imprime();
        ds.Item[] itemArray33 = new ds.Item[] {};
        fPHeapMax27.copia(itemArray33);
        fPHeapMax24.copia(itemArray33);
        fPHeapMax20.copia(itemArray33);
        fPHeapMax5.copia(itemArray33);
        fPHeapMax1.copia(itemArray33);
        org.junit.Assert.assertNotNull(itemArray14);
        org.junit.Assert.assertNull(item25);
        org.junit.Assert.assertNotNull(itemArray29);
        org.junit.Assert.assertNotNull(itemArray33);
    }

    @Test
    public void test447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test447");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (short) 1);
        fPHeapMax1.constroi();
        ds.FPHeapMax fPHeapMax4 = new ds.FPHeapMax(0);
        fPHeapMax4.imprime();
        fPHeapMax4.constroi();
        fPHeapMax4.imprime();
        fPHeapMax4.constroi();
        ds.Item item9 = null;
        ds.Item[] itemArray10 = new ds.Item[] { item9 };
        fPHeapMax4.copia(itemArray10);
        ds.FPHeapMax fPHeapMax13 = new ds.FPHeapMax(0);
        ds.Item item14 = null;
        ds.Item[] itemArray15 = new ds.Item[] { item14 };
        fPHeapMax13.copia(itemArray15);
        fPHeapMax13.imprime();
        ds.FPHeapMax fPHeapMax19 = new ds.FPHeapMax((int) (byte) -1);
        fPHeapMax19.constroi();
        fPHeapMax19.imprime();
        ds.Item[] itemArray22 = new ds.Item[] {};
        fPHeapMax19.copia(itemArray22);
        fPHeapMax13.copia(itemArray22);
        fPHeapMax4.copia(itemArray22);
        fPHeapMax1.copia(itemArray22);
        ds.FPHeapMax fPHeapMax29 = new ds.FPHeapMax(0);
        fPHeapMax29.imprime();
        ds.FPHeapMax fPHeapMax32 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item33 = fPHeapMax32.max();
        ds.FPHeapMax fPHeapMax35 = new ds.FPHeapMax((int) '4');
        ds.FPHeapMax fPHeapMax37 = new ds.FPHeapMax(0);
        fPHeapMax37.imprime();
        fPHeapMax37.constroi();
        fPHeapMax37.imprime();
        ds.FPHeapMax fPHeapMax42 = new ds.FPHeapMax((int) '4');
        ds.Item item43 = fPHeapMax42.max();
        ds.FPHeapMax fPHeapMax45 = new ds.FPHeapMax(0);
        fPHeapMax45.imprime();
        ds.Item[] itemArray47 = new ds.Item[] {};
        fPHeapMax45.copia(itemArray47);
        fPHeapMax45.constroi();
        fPHeapMax45.imprime();
        ds.Item[] itemArray51 = new ds.Item[] {};
        fPHeapMax45.copia(itemArray51);
        fPHeapMax42.copia(itemArray51);
        fPHeapMax37.copia(itemArray51);
        fPHeapMax35.copia(itemArray51);
        fPHeapMax32.copia(itemArray51);
        fPHeapMax29.copia(itemArray51);
        java.lang.Class<?> wildcardClass58 = fPHeapMax29.getClass();
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMax1.aumentaChave((int) '4', (java.lang.Object) fPHeapMax29);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 52");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray10);
        org.junit.Assert.assertNotNull(itemArray15);
        org.junit.Assert.assertNotNull(itemArray22);
        org.junit.Assert.assertNull(item33);
        org.junit.Assert.assertNull(item43);
        org.junit.Assert.assertNotNull(itemArray47);
        org.junit.Assert.assertNotNull(itemArray51);
        org.junit.Assert.assertNotNull(wildcardClass58);
    }

    @Test
    public void test448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test448");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (short) 1);
        fPHeapMax1.constroi();
        ds.FPHeapMax fPHeapMax4 = new ds.FPHeapMax((int) (byte) -1);
        fPHeapMax4.constroi();
        fPHeapMax4.imprime();
        ds.FPHeapMax fPHeapMax8 = new ds.FPHeapMax(0);
        ds.Item item9 = null;
        ds.Item[] itemArray10 = new ds.Item[] { item9 };
        fPHeapMax8.copia(itemArray10);
        fPHeapMax4.copia(itemArray10);
        fPHeapMax1.copia(itemArray10);
        fPHeapMax1.constroi();
        // The following exception was thrown during execution in test generation
        try {
            ds.Item item15 = fPHeapMax1.retiraMax();
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: heap vazio");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray10);
    }

    @Test
    public void test449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test449");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax(1);
        fPHeapMax1.imprime();
        ds.FPHeapMax fPHeapMax4 = new ds.FPHeapMax((int) '4');
        ds.FPHeapMax fPHeapMax6 = new ds.FPHeapMax(0);
        fPHeapMax6.imprime();
        ds.Item[] itemArray8 = new ds.Item[] {};
        fPHeapMax6.copia(itemArray8);
        fPHeapMax4.copia(itemArray8);
        ds.FPHeapMax fPHeapMax12 = new ds.FPHeapMax((int) (byte) -1);
        fPHeapMax12.constroi();
        fPHeapMax12.imprime();
        ds.FPHeapMax fPHeapMax16 = new ds.FPHeapMax(0);
        ds.Item item17 = null;
        ds.Item[] itemArray18 = new ds.Item[] { item17 };
        fPHeapMax16.copia(itemArray18);
        fPHeapMax12.copia(itemArray18);
        fPHeapMax4.copia(itemArray18);
        fPHeapMax1.copia(itemArray18);
        ds.FPHeapMax fPHeapMax24 = new ds.FPHeapMax(0);
        fPHeapMax24.imprime();
        ds.Item[] itemArray26 = new ds.Item[] {};
        fPHeapMax24.copia(itemArray26);
        fPHeapMax24.constroi();
        fPHeapMax24.imprime();
        ds.Item[] itemArray30 = new ds.Item[] {};
        fPHeapMax24.copia(itemArray30);
        fPHeapMax1.copia(itemArray30);
        fPHeapMax1.imprime();
        org.junit.Assert.assertNotNull(itemArray8);
        org.junit.Assert.assertNotNull(itemArray18);
        org.junit.Assert.assertNotNull(itemArray26);
        org.junit.Assert.assertNotNull(itemArray30);
    }

    @Test
    public void test450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test450");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (short) 10);
        fPHeapMax1.imprime();
    }

    @Test
    public void test451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test451");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (short) 0);
        fPHeapMax1.imprime();
        ds.FPHeapMax fPHeapMax5 = new ds.FPHeapMax(0);
        fPHeapMax5.imprime();
        fPHeapMax5.constroi();
        fPHeapMax5.imprime();
        fPHeapMax5.constroi();
        fPHeapMax5.imprime();
        ds.FPHeapMax fPHeapMax12 = new ds.FPHeapMax(0);
        ds.Item item13 = null;
        ds.Item[] itemArray14 = new ds.Item[] { item13 };
        fPHeapMax12.copia(itemArray14);
        fPHeapMax12.imprime();
        ds.FPHeapMax fPHeapMax18 = new ds.FPHeapMax((int) (byte) -1);
        fPHeapMax18.constroi();
        fPHeapMax18.imprime();
        ds.Item[] itemArray21 = new ds.Item[] {};
        fPHeapMax18.copia(itemArray21);
        fPHeapMax12.copia(itemArray21);
        fPHeapMax5.copia(itemArray21);
        fPHeapMax5.constroi();
        ds.FPHeapMax fPHeapMax27 = new ds.FPHeapMax((int) ' ');
        ds.FPHeapMax fPHeapMax29 = new ds.FPHeapMax(0);
        ds.Item item30 = null;
        ds.Item[] itemArray31 = new ds.Item[] { item30 };
        fPHeapMax29.copia(itemArray31);
        fPHeapMax27.copia(itemArray31);
        ds.FPHeapMax fPHeapMax35 = new ds.FPHeapMax(0);
        fPHeapMax35.constroi();
        fPHeapMax35.constroi();
        fPHeapMax35.constroi();
        fPHeapMax35.constroi();
        ds.FPHeapMax fPHeapMax41 = new ds.FPHeapMax(0);
        fPHeapMax41.imprime();
        ds.Item[] itemArray43 = new ds.Item[] {};
        fPHeapMax41.copia(itemArray43);
        fPHeapMax35.copia(itemArray43);
        fPHeapMax27.copia(itemArray43);
        ds.FPHeapMax fPHeapMax48 = new ds.FPHeapMax(0);
        fPHeapMax48.imprime();
        ds.Item[] itemArray50 = new ds.Item[] {};
        fPHeapMax48.copia(itemArray50);
        fPHeapMax48.constroi();
        fPHeapMax48.imprime();
        ds.Item[] itemArray54 = new ds.Item[] {};
        fPHeapMax48.copia(itemArray54);
        fPHeapMax27.copia(itemArray54);
        fPHeapMax5.copia(itemArray54);
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMax1.aumentaChave(1, (java.lang.Object) fPHeapMax5);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray14);
        org.junit.Assert.assertNotNull(itemArray21);
        org.junit.Assert.assertNotNull(itemArray31);
        org.junit.Assert.assertNotNull(itemArray43);
        org.junit.Assert.assertNotNull(itemArray50);
        org.junit.Assert.assertNotNull(itemArray54);
    }

    @Test
    public void test452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test452");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((-1));
        fPHeapMax1.imprime();
        fPHeapMax1.imprime();
        ds.FPHeapMax fPHeapMax5 = new ds.FPHeapMax(0);
        fPHeapMax5.imprime();
        fPHeapMax5.constroi();
        fPHeapMax5.imprime();
        ds.FPHeapMax fPHeapMax10 = new ds.FPHeapMax((int) '4');
        ds.Item item11 = fPHeapMax10.max();
        ds.FPHeapMax fPHeapMax13 = new ds.FPHeapMax(0);
        fPHeapMax13.imprime();
        ds.Item[] itemArray15 = new ds.Item[] {};
        fPHeapMax13.copia(itemArray15);
        fPHeapMax13.constroi();
        fPHeapMax13.imprime();
        ds.Item[] itemArray19 = new ds.Item[] {};
        fPHeapMax13.copia(itemArray19);
        fPHeapMax10.copia(itemArray19);
        fPHeapMax5.copia(itemArray19);
        fPHeapMax1.copia(itemArray19);
        fPHeapMax1.constroi();
        java.lang.Class<?> wildcardClass25 = fPHeapMax1.getClass();
        org.junit.Assert.assertNull(item11);
        org.junit.Assert.assertNotNull(itemArray15);
        org.junit.Assert.assertNotNull(itemArray19);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test453");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax(0);
        fPHeapMax1.imprime();
        fPHeapMax1.constroi();
        fPHeapMax1.imprime();
        fPHeapMax1.constroi();
        fPHeapMax1.imprime();
        ds.FPHeapMax fPHeapMax8 = new ds.FPHeapMax(0);
        ds.Item item9 = null;
        ds.Item[] itemArray10 = new ds.Item[] { item9 };
        fPHeapMax8.copia(itemArray10);
        fPHeapMax8.imprime();
        ds.FPHeapMax fPHeapMax14 = new ds.FPHeapMax((int) (byte) -1);
        fPHeapMax14.constroi();
        fPHeapMax14.imprime();
        ds.Item[] itemArray17 = new ds.Item[] {};
        fPHeapMax14.copia(itemArray17);
        fPHeapMax8.copia(itemArray17);
        fPHeapMax1.copia(itemArray17);
        fPHeapMax1.constroi();
        ds.FPHeapMax fPHeapMax23 = new ds.FPHeapMax((int) ' ');
        ds.FPHeapMax fPHeapMax25 = new ds.FPHeapMax(0);
        ds.Item item26 = null;
        ds.Item[] itemArray27 = new ds.Item[] { item26 };
        fPHeapMax25.copia(itemArray27);
        fPHeapMax23.copia(itemArray27);
        ds.FPHeapMax fPHeapMax31 = new ds.FPHeapMax(0);
        fPHeapMax31.constroi();
        fPHeapMax31.constroi();
        fPHeapMax31.constroi();
        fPHeapMax31.constroi();
        ds.FPHeapMax fPHeapMax37 = new ds.FPHeapMax(0);
        fPHeapMax37.imprime();
        ds.Item[] itemArray39 = new ds.Item[] {};
        fPHeapMax37.copia(itemArray39);
        fPHeapMax31.copia(itemArray39);
        fPHeapMax23.copia(itemArray39);
        ds.FPHeapMax fPHeapMax44 = new ds.FPHeapMax(0);
        fPHeapMax44.imprime();
        ds.Item[] itemArray46 = new ds.Item[] {};
        fPHeapMax44.copia(itemArray46);
        fPHeapMax44.constroi();
        fPHeapMax44.imprime();
        ds.Item[] itemArray50 = new ds.Item[] {};
        fPHeapMax44.copia(itemArray50);
        fPHeapMax23.copia(itemArray50);
        fPHeapMax1.copia(itemArray50);
        // The following exception was thrown during execution in test generation
        try {
            ds.Item item54 = fPHeapMax1.max();
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray10);
        org.junit.Assert.assertNotNull(itemArray17);
        org.junit.Assert.assertNotNull(itemArray27);
        org.junit.Assert.assertNotNull(itemArray39);
        org.junit.Assert.assertNotNull(itemArray46);
        org.junit.Assert.assertNotNull(itemArray50);
    }

    @Test
    public void test454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test454");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (short) 1);
        fPHeapMax1.constroi();
        ds.FPHeapMax fPHeapMax4 = new ds.FPHeapMax((int) (byte) -1);
        fPHeapMax4.constroi();
        fPHeapMax4.imprime();
        ds.FPHeapMax fPHeapMax8 = new ds.FPHeapMax(0);
        ds.Item item9 = null;
        ds.Item[] itemArray10 = new ds.Item[] { item9 };
        fPHeapMax8.copia(itemArray10);
        fPHeapMax4.copia(itemArray10);
        fPHeapMax1.copia(itemArray10);
        ds.Item item14 = null;
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMax1.insere(item14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray10);
    }

    @Test
    public void test455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test455");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) 'a');
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
    public void test456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test456");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (byte) -1);
        fPHeapMax1.constroi();
        fPHeapMax1.imprime();
        ds.Item[] itemArray4 = new ds.Item[] {};
        fPHeapMax1.copia(itemArray4);
        fPHeapMax1.imprime();
        ds.FPHeapMax fPHeapMax8 = new ds.FPHeapMax((int) '4');
        ds.Item item9 = fPHeapMax8.max();
        ds.FPHeapMax fPHeapMax11 = new ds.FPHeapMax(0);
        fPHeapMax11.imprime();
        ds.Item[] itemArray13 = new ds.Item[] {};
        fPHeapMax11.copia(itemArray13);
        fPHeapMax11.constroi();
        fPHeapMax11.imprime();
        ds.Item[] itemArray17 = new ds.Item[] {};
        fPHeapMax11.copia(itemArray17);
        fPHeapMax8.copia(itemArray17);
        fPHeapMax1.copia(itemArray17);
        fPHeapMax1.imprime();
        ds.FPHeapMax fPHeapMax24 = new ds.FPHeapMax((int) (byte) 0);
        fPHeapMax24.imprime();
        ds.FPHeapMax fPHeapMax27 = new ds.FPHeapMax((int) '4');
        ds.Item item28 = fPHeapMax27.max();
        ds.FPHeapMax fPHeapMax30 = new ds.FPHeapMax(0);
        fPHeapMax30.imprime();
        ds.Item[] itemArray32 = new ds.Item[] {};
        fPHeapMax30.copia(itemArray32);
        fPHeapMax30.constroi();
        fPHeapMax30.imprime();
        ds.Item[] itemArray36 = new ds.Item[] {};
        fPHeapMax30.copia(itemArray36);
        fPHeapMax27.copia(itemArray36);
        fPHeapMax24.copia(itemArray36);
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMax1.aumentaChave((int) (byte) 10, (java.lang.Object) fPHeapMax24);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 10");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray4);
        org.junit.Assert.assertNull(item9);
        org.junit.Assert.assertNotNull(itemArray13);
        org.junit.Assert.assertNotNull(itemArray17);
        org.junit.Assert.assertNull(item28);
        org.junit.Assert.assertNotNull(itemArray32);
        org.junit.Assert.assertNotNull(itemArray36);
    }

    @Test
    public void test457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test457");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) '4');
        ds.FPHeapMax fPHeapMax3 = new ds.FPHeapMax(0);
        fPHeapMax3.imprime();
        ds.Item[] itemArray5 = new ds.Item[] {};
        fPHeapMax3.copia(itemArray5);
        fPHeapMax1.copia(itemArray5);
        ds.FPHeapMax fPHeapMax9 = new ds.FPHeapMax((int) '4');
        ds.Item item10 = fPHeapMax9.max();
        ds.FPHeapMax fPHeapMax12 = new ds.FPHeapMax(0);
        fPHeapMax12.imprime();
        ds.Item[] itemArray14 = new ds.Item[] {};
        fPHeapMax12.copia(itemArray14);
        fPHeapMax12.constroi();
        fPHeapMax12.imprime();
        ds.Item[] itemArray18 = new ds.Item[] {};
        fPHeapMax12.copia(itemArray18);
        fPHeapMax9.copia(itemArray18);
        fPHeapMax1.copia(itemArray18);
        ds.Item item22 = fPHeapMax1.max();
        java.lang.Class<?> wildcardClass23 = fPHeapMax1.getClass();
        org.junit.Assert.assertNotNull(itemArray5);
        org.junit.Assert.assertNull(item10);
        org.junit.Assert.assertNotNull(itemArray14);
        org.junit.Assert.assertNotNull(itemArray18);
        org.junit.Assert.assertNull(item22);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test458");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (short) -1);
        fPHeapMax1.imprime();
        fPHeapMax1.imprime();
        java.lang.Object obj5 = null;
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMax1.aumentaChave(0, obj5);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 0");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test459");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) '4');
        ds.FPHeapMax fPHeapMax3 = new ds.FPHeapMax(0);
        fPHeapMax3.imprime();
        ds.Item[] itemArray5 = new ds.Item[] {};
        fPHeapMax3.copia(itemArray5);
        fPHeapMax1.copia(itemArray5);
        ds.FPHeapMax fPHeapMax10 = new ds.FPHeapMax((int) (byte) 0);
        ds.FPHeapMax fPHeapMax12 = new ds.FPHeapMax((int) '4');
        ds.Item item13 = fPHeapMax12.max();
        ds.FPHeapMax fPHeapMax15 = new ds.FPHeapMax(0);
        fPHeapMax15.imprime();
        ds.Item[] itemArray17 = new ds.Item[] {};
        fPHeapMax15.copia(itemArray17);
        fPHeapMax15.constroi();
        fPHeapMax15.imprime();
        ds.Item[] itemArray21 = new ds.Item[] {};
        fPHeapMax15.copia(itemArray21);
        fPHeapMax12.copia(itemArray21);
        fPHeapMax10.copia(itemArray21);
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMax1.aumentaChave((int) (short) 100, (java.lang.Object) fPHeapMax10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 100");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray5);
        org.junit.Assert.assertNull(item13);
        org.junit.Assert.assertNotNull(itemArray17);
        org.junit.Assert.assertNotNull(itemArray21);
    }

    @Test
    public void test460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test460");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((-1));
        fPHeapMax1.imprime();
        fPHeapMax1.imprime();
        ds.FPHeapMax fPHeapMax5 = new ds.FPHeapMax(0);
        fPHeapMax5.imprime();
        fPHeapMax5.constroi();
        fPHeapMax5.imprime();
        ds.FPHeapMax fPHeapMax10 = new ds.FPHeapMax((int) '4');
        ds.Item item11 = fPHeapMax10.max();
        ds.FPHeapMax fPHeapMax13 = new ds.FPHeapMax(0);
        fPHeapMax13.imprime();
        ds.Item[] itemArray15 = new ds.Item[] {};
        fPHeapMax13.copia(itemArray15);
        fPHeapMax13.constroi();
        fPHeapMax13.imprime();
        ds.Item[] itemArray19 = new ds.Item[] {};
        fPHeapMax13.copia(itemArray19);
        fPHeapMax10.copia(itemArray19);
        fPHeapMax5.copia(itemArray19);
        fPHeapMax1.copia(itemArray19);
        fPHeapMax1.imprime();
        fPHeapMax1.constroi();
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMax1.refaz((int) (short) 0, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 0");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(item11);
        org.junit.Assert.assertNotNull(itemArray15);
        org.junit.Assert.assertNotNull(itemArray19);
    }

    @Test
    public void test461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test461");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (byte) 0);
        ds.FPHeapMax fPHeapMax3 = new ds.FPHeapMax(0);
        fPHeapMax3.imprime();
        ds.Item[] itemArray5 = new ds.Item[] {};
        fPHeapMax3.copia(itemArray5);
        fPHeapMax3.constroi();
        fPHeapMax3.imprime();
        ds.Item[] itemArray9 = new ds.Item[] {};
        fPHeapMax3.copia(itemArray9);
        fPHeapMax1.copia(itemArray9);
        fPHeapMax1.constroi();
        fPHeapMax1.imprime();
        org.junit.Assert.assertNotNull(itemArray5);
        org.junit.Assert.assertNotNull(itemArray9);
    }

    @Test
    public void test462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test462");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax(0);
        fPHeapMax1.imprime();
        ds.Item[] itemArray3 = new ds.Item[] {};
        fPHeapMax1.copia(itemArray3);
        fPHeapMax1.constroi();
        fPHeapMax1.imprime();
        fPHeapMax1.constroi();
        fPHeapMax1.constroi();
        org.junit.Assert.assertNotNull(itemArray3);
    }

    @Test
    public void test463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test463");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (byte) -1);
        fPHeapMax1.constroi();
        fPHeapMax1.constroi();
        fPHeapMax1.constroi();
        ds.FPHeapMax fPHeapMax6 = new ds.FPHeapMax(0);
        fPHeapMax6.imprime();
        fPHeapMax6.constroi();
        ds.FPHeapMax fPHeapMax10 = new ds.FPHeapMax(0);
        ds.Item item11 = null;
        ds.Item[] itemArray12 = new ds.Item[] { item11 };
        fPHeapMax10.copia(itemArray12);
        fPHeapMax6.copia(itemArray12);
        fPHeapMax1.copia(itemArray12);
        fPHeapMax1.imprime();
        fPHeapMax1.imprime();
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMax1.refaz((int) (byte) -1, (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray12);
    }

    @Test
    public void test464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test464");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) '4');
        ds.Item item2 = fPHeapMax1.max();
        fPHeapMax1.imprime();
        fPHeapMax1.imprime();
        org.junit.Assert.assertNull(item2);
    }

    @Test
    public void test465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test465");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (byte) -1);
        fPHeapMax1.constroi();
        fPHeapMax1.constroi();
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMax1.refaz(10, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 10");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test466");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax(0);
        fPHeapMax1.imprime();
        fPHeapMax1.constroi();
        fPHeapMax1.imprime();
        fPHeapMax1.constroi();
        fPHeapMax1.imprime();
        ds.FPHeapMax fPHeapMax8 = new ds.FPHeapMax(1);
        fPHeapMax8.constroi();
        fPHeapMax8.imprime();
        ds.FPHeapMax fPHeapMax12 = new ds.FPHeapMax((int) '4');
        ds.Item item13 = fPHeapMax12.max();
        ds.FPHeapMax fPHeapMax15 = new ds.FPHeapMax(0);
        fPHeapMax15.imprime();
        ds.Item[] itemArray17 = new ds.Item[] {};
        fPHeapMax15.copia(itemArray17);
        fPHeapMax15.constroi();
        fPHeapMax15.imprime();
        ds.Item[] itemArray21 = new ds.Item[] {};
        fPHeapMax15.copia(itemArray21);
        fPHeapMax12.copia(itemArray21);
        fPHeapMax8.copia(itemArray21);
        fPHeapMax1.copia(itemArray21);
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMax1.refaz(0, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(item13);
        org.junit.Assert.assertNotNull(itemArray17);
        org.junit.Assert.assertNotNull(itemArray21);
    }

    @Test
    public void test467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test467");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax(1);
        fPHeapMax1.constroi();
        fPHeapMax1.imprime();
        fPHeapMax1.constroi();
        ds.Item item5 = fPHeapMax1.max();
        ds.Item item6 = fPHeapMax1.max();
        org.junit.Assert.assertNull(item5);
        org.junit.Assert.assertNull(item6);
    }

    @Test
    public void test468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test468");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) 'a');
        ds.FPHeapMax fPHeapMax3 = new ds.FPHeapMax(0);
        fPHeapMax3.imprime();
        fPHeapMax3.constroi();
        fPHeapMax3.imprime();
        fPHeapMax3.constroi();
        fPHeapMax3.imprime();
        ds.FPHeapMax fPHeapMax10 = new ds.FPHeapMax(1);
        fPHeapMax10.constroi();
        fPHeapMax10.imprime();
        ds.FPHeapMax fPHeapMax14 = new ds.FPHeapMax((int) '4');
        ds.Item item15 = fPHeapMax14.max();
        ds.FPHeapMax fPHeapMax17 = new ds.FPHeapMax(0);
        fPHeapMax17.imprime();
        ds.Item[] itemArray19 = new ds.Item[] {};
        fPHeapMax17.copia(itemArray19);
        fPHeapMax17.constroi();
        fPHeapMax17.imprime();
        ds.Item[] itemArray23 = new ds.Item[] {};
        fPHeapMax17.copia(itemArray23);
        fPHeapMax14.copia(itemArray23);
        fPHeapMax10.copia(itemArray23);
        fPHeapMax3.copia(itemArray23);
        fPHeapMax1.copia(itemArray23);
        java.lang.Class<?> wildcardClass29 = fPHeapMax1.getClass();
        org.junit.Assert.assertNull(item15);
        org.junit.Assert.assertNotNull(itemArray19);
        org.junit.Assert.assertNotNull(itemArray23);
        org.junit.Assert.assertNotNull(wildcardClass29);
    }

    @Test
    public void test469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test469");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax(0);
        fPHeapMax1.imprime();
        fPHeapMax1.constroi();
        fPHeapMax1.imprime();
        fPHeapMax1.constroi();
        fPHeapMax1.imprime();
        ds.FPHeapMax fPHeapMax8 = new ds.FPHeapMax(0);
        ds.Item item9 = null;
        ds.Item[] itemArray10 = new ds.Item[] { item9 };
        fPHeapMax8.copia(itemArray10);
        fPHeapMax8.imprime();
        ds.FPHeapMax fPHeapMax14 = new ds.FPHeapMax((int) (byte) -1);
        fPHeapMax14.constroi();
        fPHeapMax14.imprime();
        ds.Item[] itemArray17 = new ds.Item[] {};
        fPHeapMax14.copia(itemArray17);
        fPHeapMax8.copia(itemArray17);
        fPHeapMax1.copia(itemArray17);
        fPHeapMax1.constroi();
        ds.FPHeapMax fPHeapMax24 = new ds.FPHeapMax((int) ' ');
        fPHeapMax24.refaz((int) (short) 1, 0);
        ds.Item item28 = fPHeapMax24.max();
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMax1.aumentaChave((int) (short) 0, (java.lang.Object) item28);
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: chaveNova com valor null");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray10);
        org.junit.Assert.assertNotNull(itemArray17);
        org.junit.Assert.assertNull(item28);
    }

    @Test
    public void test470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test470");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (short) 1);
        fPHeapMax1.constroi();
        ds.FPHeapMax fPHeapMax4 = new ds.FPHeapMax(0);
        fPHeapMax4.imprime();
        fPHeapMax4.constroi();
        fPHeapMax4.imprime();
        fPHeapMax4.constroi();
        ds.Item item9 = null;
        ds.Item[] itemArray10 = new ds.Item[] { item9 };
        fPHeapMax4.copia(itemArray10);
        ds.FPHeapMax fPHeapMax13 = new ds.FPHeapMax(0);
        ds.Item item14 = null;
        ds.Item[] itemArray15 = new ds.Item[] { item14 };
        fPHeapMax13.copia(itemArray15);
        fPHeapMax13.imprime();
        ds.FPHeapMax fPHeapMax19 = new ds.FPHeapMax((int) (byte) -1);
        fPHeapMax19.constroi();
        fPHeapMax19.imprime();
        ds.Item[] itemArray22 = new ds.Item[] {};
        fPHeapMax19.copia(itemArray22);
        fPHeapMax13.copia(itemArray22);
        fPHeapMax4.copia(itemArray22);
        fPHeapMax1.copia(itemArray22);
        ds.Item item27 = null;
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMax1.insere(item27);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray10);
        org.junit.Assert.assertNotNull(itemArray15);
        org.junit.Assert.assertNotNull(itemArray22);
    }

    @Test
    public void test471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test471");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax(0);
        fPHeapMax1.imprime();
        fPHeapMax1.constroi();
        fPHeapMax1.imprime();
        fPHeapMax1.constroi();
        ds.Item item6 = null;
        ds.Item[] itemArray7 = new ds.Item[] { item6 };
        fPHeapMax1.copia(itemArray7);
        ds.FPHeapMax fPHeapMax10 = new ds.FPHeapMax(0);
        ds.Item item11 = null;
        ds.Item[] itemArray12 = new ds.Item[] { item11 };
        fPHeapMax10.copia(itemArray12);
        fPHeapMax10.imprime();
        ds.FPHeapMax fPHeapMax16 = new ds.FPHeapMax((int) (byte) -1);
        fPHeapMax16.constroi();
        fPHeapMax16.imprime();
        ds.Item[] itemArray19 = new ds.Item[] {};
        fPHeapMax16.copia(itemArray19);
        fPHeapMax10.copia(itemArray19);
        fPHeapMax1.copia(itemArray19);
        fPHeapMax1.constroi();
        ds.FPHeapMax fPHeapMax25 = new ds.FPHeapMax(0);
        fPHeapMax25.imprime();
        fPHeapMax25.constroi();
        fPHeapMax25.imprime();
        fPHeapMax25.constroi();
        fPHeapMax25.imprime();
        ds.FPHeapMax fPHeapMax32 = new ds.FPHeapMax((int) (byte) -1);
        fPHeapMax32.constroi();
        fPHeapMax32.imprime();
        ds.Item[] itemArray35 = new ds.Item[] {};
        fPHeapMax32.copia(itemArray35);
        fPHeapMax25.copia(itemArray35);
        fPHeapMax1.copia(itemArray35);
        ds.Item item39 = null;
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMax1.insere(item39);
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: heap cheio");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray7);
        org.junit.Assert.assertNotNull(itemArray12);
        org.junit.Assert.assertNotNull(itemArray19);
        org.junit.Assert.assertNotNull(itemArray35);
    }

    @Test
    public void test472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test472");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax(10);
        fPHeapMax1.constroi();
        ds.FPHeapMax fPHeapMax4 = new ds.FPHeapMax((int) (short) 1);
        fPHeapMax4.constroi();
        ds.FPHeapMax fPHeapMax7 = new ds.FPHeapMax((int) (byte) -1);
        fPHeapMax7.constroi();
        fPHeapMax7.imprime();
        ds.FPHeapMax fPHeapMax11 = new ds.FPHeapMax(0);
        ds.Item item12 = null;
        ds.Item[] itemArray13 = new ds.Item[] { item12 };
        fPHeapMax11.copia(itemArray13);
        fPHeapMax7.copia(itemArray13);
        fPHeapMax4.copia(itemArray13);
        fPHeapMax4.imprime();
        ds.FPHeapMax fPHeapMax19 = new ds.FPHeapMax(1);
        fPHeapMax19.constroi();
        fPHeapMax19.imprime();
        ds.FPHeapMax fPHeapMax23 = new ds.FPHeapMax((int) '4');
        ds.Item item24 = fPHeapMax23.max();
        ds.FPHeapMax fPHeapMax26 = new ds.FPHeapMax(0);
        fPHeapMax26.imprime();
        ds.Item[] itemArray28 = new ds.Item[] {};
        fPHeapMax26.copia(itemArray28);
        fPHeapMax26.constroi();
        fPHeapMax26.imprime();
        ds.Item[] itemArray32 = new ds.Item[] {};
        fPHeapMax26.copia(itemArray32);
        fPHeapMax23.copia(itemArray32);
        fPHeapMax19.copia(itemArray32);
        fPHeapMax4.copia(itemArray32);
        fPHeapMax1.copia(itemArray32);
        org.junit.Assert.assertNotNull(itemArray13);
        org.junit.Assert.assertNull(item24);
        org.junit.Assert.assertNotNull(itemArray28);
        org.junit.Assert.assertNotNull(itemArray32);
    }

    @Test
    public void test473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test473");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax(1);
        fPHeapMax1.constroi();
        ds.Item item3 = fPHeapMax1.max();
        fPHeapMax1.imprime();
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
    public void test474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test474");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((-1));
        fPHeapMax1.imprime();
        fPHeapMax1.imprime();
        ds.FPHeapMax fPHeapMax5 = new ds.FPHeapMax(0);
        fPHeapMax5.imprime();
        fPHeapMax5.constroi();
        fPHeapMax5.imprime();
        ds.FPHeapMax fPHeapMax10 = new ds.FPHeapMax((int) '4');
        ds.Item item11 = fPHeapMax10.max();
        ds.FPHeapMax fPHeapMax13 = new ds.FPHeapMax(0);
        fPHeapMax13.imprime();
        ds.Item[] itemArray15 = new ds.Item[] {};
        fPHeapMax13.copia(itemArray15);
        fPHeapMax13.constroi();
        fPHeapMax13.imprime();
        ds.Item[] itemArray19 = new ds.Item[] {};
        fPHeapMax13.copia(itemArray19);
        fPHeapMax10.copia(itemArray19);
        fPHeapMax5.copia(itemArray19);
        fPHeapMax1.copia(itemArray19);
        fPHeapMax1.constroi();
        fPHeapMax1.constroi();
        ds.FPHeapMax fPHeapMax27 = new ds.FPHeapMax((-1));
        fPHeapMax27.imprime();
        fPHeapMax27.imprime();
        ds.FPHeapMax fPHeapMax31 = new ds.FPHeapMax(0);
        fPHeapMax31.imprime();
        fPHeapMax31.constroi();
        fPHeapMax31.imprime();
        ds.FPHeapMax fPHeapMax36 = new ds.FPHeapMax((int) '4');
        ds.Item item37 = fPHeapMax36.max();
        ds.FPHeapMax fPHeapMax39 = new ds.FPHeapMax(0);
        fPHeapMax39.imprime();
        ds.Item[] itemArray41 = new ds.Item[] {};
        fPHeapMax39.copia(itemArray41);
        fPHeapMax39.constroi();
        fPHeapMax39.imprime();
        ds.Item[] itemArray45 = new ds.Item[] {};
        fPHeapMax39.copia(itemArray45);
        fPHeapMax36.copia(itemArray45);
        fPHeapMax31.copia(itemArray45);
        fPHeapMax27.copia(itemArray45);
        fPHeapMax27.imprime();
        fPHeapMax27.imprime();
        ds.FPHeapMax fPHeapMax53 = new ds.FPHeapMax(1);
        fPHeapMax53.constroi();
        ds.FPHeapMax fPHeapMax56 = new ds.FPHeapMax(0);
        fPHeapMax56.imprime();
        fPHeapMax56.constroi();
        fPHeapMax56.imprime();
        ds.FPHeapMax fPHeapMax61 = new ds.FPHeapMax((int) '4');
        ds.Item item62 = fPHeapMax61.max();
        ds.FPHeapMax fPHeapMax64 = new ds.FPHeapMax(0);
        fPHeapMax64.imprime();
        ds.Item[] itemArray66 = new ds.Item[] {};
        fPHeapMax64.copia(itemArray66);
        fPHeapMax64.constroi();
        fPHeapMax64.imprime();
        ds.Item[] itemArray70 = new ds.Item[] {};
        fPHeapMax64.copia(itemArray70);
        fPHeapMax61.copia(itemArray70);
        fPHeapMax56.copia(itemArray70);
        fPHeapMax53.copia(itemArray70);
        fPHeapMax27.copia(itemArray70);
        fPHeapMax1.copia(itemArray70);
        // The following exception was thrown during execution in test generation
        try {
            ds.Item item77 = fPHeapMax1.max();
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(item11);
        org.junit.Assert.assertNotNull(itemArray15);
        org.junit.Assert.assertNotNull(itemArray19);
        org.junit.Assert.assertNull(item37);
        org.junit.Assert.assertNotNull(itemArray41);
        org.junit.Assert.assertNotNull(itemArray45);
        org.junit.Assert.assertNull(item62);
        org.junit.Assert.assertNotNull(itemArray66);
        org.junit.Assert.assertNotNull(itemArray70);
    }

    @Test
    public void test475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test475");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax(0);
        fPHeapMax1.imprime();
        fPHeapMax1.constroi();
        fPHeapMax1.imprime();
        fPHeapMax1.constroi();
        fPHeapMax1.imprime();
        ds.FPHeapMax fPHeapMax8 = new ds.FPHeapMax(0);
        ds.Item item9 = null;
        ds.Item[] itemArray10 = new ds.Item[] { item9 };
        fPHeapMax8.copia(itemArray10);
        fPHeapMax8.imprime();
        ds.FPHeapMax fPHeapMax14 = new ds.FPHeapMax((int) (byte) -1);
        fPHeapMax14.constroi();
        fPHeapMax14.imprime();
        ds.Item[] itemArray17 = new ds.Item[] {};
        fPHeapMax14.copia(itemArray17);
        fPHeapMax8.copia(itemArray17);
        fPHeapMax1.copia(itemArray17);
        fPHeapMax1.constroi();
        fPHeapMax1.constroi();
        ds.FPHeapMax fPHeapMax25 = new ds.FPHeapMax((int) '4');
        ds.Item item26 = fPHeapMax25.max();
        fPHeapMax25.constroi();
        fPHeapMax25.constroi();
        fPHeapMax25.imprime();
        fPHeapMax25.imprime();
        fPHeapMax25.constroi();
        ds.FPHeapMax fPHeapMax33 = new ds.FPHeapMax((int) '#');
        ds.FPHeapMax fPHeapMax35 = new ds.FPHeapMax(0);
        fPHeapMax35.imprime();
        fPHeapMax35.constroi();
        ds.FPHeapMax fPHeapMax39 = new ds.FPHeapMax(0);
        ds.Item item40 = null;
        ds.Item[] itemArray41 = new ds.Item[] { item40 };
        fPHeapMax39.copia(itemArray41);
        fPHeapMax35.copia(itemArray41);
        fPHeapMax33.copia(itemArray41);
        fPHeapMax25.copia(itemArray41);
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMax1.aumentaChave((int) (byte) 1, (java.lang.Object) fPHeapMax25);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray10);
        org.junit.Assert.assertNotNull(itemArray17);
        org.junit.Assert.assertNull(item26);
        org.junit.Assert.assertNotNull(itemArray41);
    }

    @Test
    public void test476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test476");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (byte) 0);
        ds.FPHeapMax fPHeapMax3 = new ds.FPHeapMax(0);
        fPHeapMax3.imprime();
        ds.Item[] itemArray5 = new ds.Item[] {};
        fPHeapMax3.copia(itemArray5);
        fPHeapMax3.constroi();
        fPHeapMax3.imprime();
        ds.Item[] itemArray9 = new ds.Item[] {};
        fPHeapMax3.copia(itemArray9);
        fPHeapMax1.copia(itemArray9);
        java.lang.Class<?> wildcardClass12 = fPHeapMax1.getClass();
        org.junit.Assert.assertNotNull(itemArray5);
        org.junit.Assert.assertNotNull(itemArray9);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test477");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (short) 1);
        fPHeapMax1.constroi();
        ds.FPHeapMax fPHeapMax4 = new ds.FPHeapMax((int) (byte) -1);
        fPHeapMax4.constroi();
        fPHeapMax4.imprime();
        ds.FPHeapMax fPHeapMax8 = new ds.FPHeapMax(0);
        ds.Item item9 = null;
        ds.Item[] itemArray10 = new ds.Item[] { item9 };
        fPHeapMax8.copia(itemArray10);
        fPHeapMax4.copia(itemArray10);
        fPHeapMax1.copia(itemArray10);
        fPHeapMax1.constroi();
        ds.FPHeapMax fPHeapMax16 = new ds.FPHeapMax(0);
        fPHeapMax16.imprime();
        fPHeapMax16.constroi();
        fPHeapMax16.imprime();
        fPHeapMax16.constroi();
        ds.Item item21 = null;
        ds.Item[] itemArray22 = new ds.Item[] { item21 };
        fPHeapMax16.copia(itemArray22);
        ds.FPHeapMax fPHeapMax25 = new ds.FPHeapMax(1);
        fPHeapMax25.constroi();
        fPHeapMax25.imprime();
        fPHeapMax25.constroi();
        ds.FPHeapMax fPHeapMax30 = new ds.FPHeapMax((int) (byte) -1);
        fPHeapMax30.constroi();
        fPHeapMax30.constroi();
        fPHeapMax30.constroi();
        ds.FPHeapMax fPHeapMax35 = new ds.FPHeapMax(0);
        fPHeapMax35.imprime();
        fPHeapMax35.constroi();
        ds.FPHeapMax fPHeapMax39 = new ds.FPHeapMax(0);
        ds.Item item40 = null;
        ds.Item[] itemArray41 = new ds.Item[] { item40 };
        fPHeapMax39.copia(itemArray41);
        fPHeapMax35.copia(itemArray41);
        fPHeapMax30.copia(itemArray41);
        fPHeapMax25.copia(itemArray41);
        fPHeapMax16.copia(itemArray41);
        fPHeapMax1.copia(itemArray41);
        ds.FPHeapMax fPHeapMax50 = new ds.FPHeapMax((int) ' ');
        ds.FPHeapMax fPHeapMax52 = new ds.FPHeapMax(0);
        ds.Item item53 = null;
        ds.Item[] itemArray54 = new ds.Item[] { item53 };
        fPHeapMax52.copia(itemArray54);
        fPHeapMax50.copia(itemArray54);
        ds.FPHeapMax fPHeapMax58 = new ds.FPHeapMax(0);
        fPHeapMax58.constroi();
        fPHeapMax58.constroi();
        fPHeapMax58.constroi();
        fPHeapMax58.constroi();
        ds.FPHeapMax fPHeapMax64 = new ds.FPHeapMax(0);
        fPHeapMax64.imprime();
        ds.Item[] itemArray66 = new ds.Item[] {};
        fPHeapMax64.copia(itemArray66);
        fPHeapMax58.copia(itemArray66);
        fPHeapMax50.copia(itemArray66);
        ds.FPHeapMax fPHeapMax71 = new ds.FPHeapMax(0);
        fPHeapMax71.imprime();
        ds.Item[] itemArray73 = new ds.Item[] {};
        fPHeapMax71.copia(itemArray73);
        fPHeapMax71.constroi();
        fPHeapMax71.imprime();
        ds.Item[] itemArray77 = new ds.Item[] {};
        fPHeapMax71.copia(itemArray77);
        fPHeapMax50.copia(itemArray77);
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMax1.aumentaChave((int) (short) -1, (java.lang.Object) itemArray77);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray10);
        org.junit.Assert.assertNotNull(itemArray22);
        org.junit.Assert.assertNotNull(itemArray41);
        org.junit.Assert.assertNotNull(itemArray54);
        org.junit.Assert.assertNotNull(itemArray66);
        org.junit.Assert.assertNotNull(itemArray73);
        org.junit.Assert.assertNotNull(itemArray77);
    }

    @Test
    public void test478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test478");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (byte) 0);
        ds.FPHeapMax fPHeapMax3 = new ds.FPHeapMax(0);
        fPHeapMax3.imprime();
        ds.Item[] itemArray5 = new ds.Item[] {};
        fPHeapMax3.copia(itemArray5);
        fPHeapMax3.constroi();
        fPHeapMax3.imprime();
        ds.Item[] itemArray9 = new ds.Item[] {};
        fPHeapMax3.copia(itemArray9);
        fPHeapMax1.copia(itemArray9);
        fPHeapMax1.constroi();
        // The following exception was thrown during execution in test generation
        try {
            ds.Item item13 = fPHeapMax1.retiraMax();
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: heap vazio");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray5);
        org.junit.Assert.assertNotNull(itemArray9);
    }

    @Test
    public void test479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test479");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) '#');
        ds.FPHeapMax fPHeapMax3 = new ds.FPHeapMax(0);
        fPHeapMax3.imprime();
        fPHeapMax3.constroi();
        ds.FPHeapMax fPHeapMax7 = new ds.FPHeapMax(0);
        ds.Item item8 = null;
        ds.Item[] itemArray9 = new ds.Item[] { item8 };
        fPHeapMax7.copia(itemArray9);
        fPHeapMax3.copia(itemArray9);
        fPHeapMax1.copia(itemArray9);
        fPHeapMax1.constroi();
        ds.FPHeapMax fPHeapMax15 = new ds.FPHeapMax((int) '#');
        ds.FPHeapMax fPHeapMax17 = new ds.FPHeapMax(0);
        fPHeapMax17.imprime();
        fPHeapMax17.constroi();
        ds.FPHeapMax fPHeapMax21 = new ds.FPHeapMax(0);
        ds.Item item22 = null;
        ds.Item[] itemArray23 = new ds.Item[] { item22 };
        fPHeapMax21.copia(itemArray23);
        fPHeapMax17.copia(itemArray23);
        fPHeapMax15.copia(itemArray23);
        fPHeapMax15.constroi();
        ds.FPHeapMax fPHeapMax29 = new ds.FPHeapMax(0);
        fPHeapMax29.imprime();
        fPHeapMax29.constroi();
        fPHeapMax29.imprime();
        fPHeapMax29.constroi();
        ds.Item item34 = null;
        ds.Item[] itemArray35 = new ds.Item[] { item34 };
        fPHeapMax29.copia(itemArray35);
        ds.FPHeapMax fPHeapMax38 = new ds.FPHeapMax(0);
        ds.Item item39 = null;
        ds.Item[] itemArray40 = new ds.Item[] { item39 };
        fPHeapMax38.copia(itemArray40);
        fPHeapMax38.imprime();
        ds.FPHeapMax fPHeapMax44 = new ds.FPHeapMax((int) (byte) -1);
        fPHeapMax44.constroi();
        fPHeapMax44.imprime();
        ds.Item[] itemArray47 = new ds.Item[] {};
        fPHeapMax44.copia(itemArray47);
        fPHeapMax38.copia(itemArray47);
        fPHeapMax29.copia(itemArray47);
        ds.FPHeapMax fPHeapMax52 = new ds.FPHeapMax(0);
        fPHeapMax52.imprime();
        fPHeapMax52.constroi();
        fPHeapMax52.imprime();
        fPHeapMax52.constroi();
        fPHeapMax52.imprime();
        ds.FPHeapMax fPHeapMax59 = new ds.FPHeapMax(1);
        fPHeapMax59.constroi();
        fPHeapMax59.imprime();
        ds.FPHeapMax fPHeapMax63 = new ds.FPHeapMax((int) '4');
        ds.Item item64 = fPHeapMax63.max();
        ds.FPHeapMax fPHeapMax66 = new ds.FPHeapMax(0);
        fPHeapMax66.imprime();
        ds.Item[] itemArray68 = new ds.Item[] {};
        fPHeapMax66.copia(itemArray68);
        fPHeapMax66.constroi();
        fPHeapMax66.imprime();
        ds.Item[] itemArray72 = new ds.Item[] {};
        fPHeapMax66.copia(itemArray72);
        fPHeapMax63.copia(itemArray72);
        fPHeapMax59.copia(itemArray72);
        fPHeapMax52.copia(itemArray72);
        fPHeapMax29.copia(itemArray72);
        fPHeapMax15.copia(itemArray72);
        fPHeapMax1.copia(itemArray72);
        ds.Item item80 = null;
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMax1.insere(item80);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray9);
        org.junit.Assert.assertNotNull(itemArray23);
        org.junit.Assert.assertNotNull(itemArray35);
        org.junit.Assert.assertNotNull(itemArray40);
        org.junit.Assert.assertNotNull(itemArray47);
        org.junit.Assert.assertNull(item64);
        org.junit.Assert.assertNotNull(itemArray68);
        org.junit.Assert.assertNotNull(itemArray72);
    }

    @Test
    public void test480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test480");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (byte) -1);
        fPHeapMax1.constroi();
        fPHeapMax1.imprime();
        ds.Item[] itemArray4 = new ds.Item[] {};
        fPHeapMax1.copia(itemArray4);
        fPHeapMax1.imprime();
        ds.Item item7 = null;
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMax1.insere(item7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray4);
    }

    @Test
    public void test481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test481");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item2 = fPHeapMax1.max();
        ds.FPHeapMax fPHeapMax4 = new ds.FPHeapMax((int) '4');
        ds.FPHeapMax fPHeapMax6 = new ds.FPHeapMax(0);
        fPHeapMax6.imprime();
        fPHeapMax6.constroi();
        fPHeapMax6.imprime();
        ds.FPHeapMax fPHeapMax11 = new ds.FPHeapMax((int) '4');
        ds.Item item12 = fPHeapMax11.max();
        ds.FPHeapMax fPHeapMax14 = new ds.FPHeapMax(0);
        fPHeapMax14.imprime();
        ds.Item[] itemArray16 = new ds.Item[] {};
        fPHeapMax14.copia(itemArray16);
        fPHeapMax14.constroi();
        fPHeapMax14.imprime();
        ds.Item[] itemArray20 = new ds.Item[] {};
        fPHeapMax14.copia(itemArray20);
        fPHeapMax11.copia(itemArray20);
        fPHeapMax6.copia(itemArray20);
        fPHeapMax4.copia(itemArray20);
        fPHeapMax1.copia(itemArray20);
        fPHeapMax1.refaz((int) (byte) 100, 10);
        fPHeapMax1.refaz((int) ' ', (int) (byte) 1);
        org.junit.Assert.assertNull(item2);
        org.junit.Assert.assertNull(item12);
        org.junit.Assert.assertNotNull(itemArray16);
        org.junit.Assert.assertNotNull(itemArray20);
    }

    @Test
    public void test482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test482");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax(0);
        ds.Item item2 = null;
        ds.Item[] itemArray3 = new ds.Item[] { item2 };
        fPHeapMax1.copia(itemArray3);
        fPHeapMax1.imprime();
        java.lang.Class<?> wildcardClass6 = fPHeapMax1.getClass();
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test483");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax(0);
        fPHeapMax1.imprime();
        fPHeapMax1.constroi();
        ds.FPHeapMax fPHeapMax5 = new ds.FPHeapMax(0);
        ds.Item item6 = null;
        ds.Item[] itemArray7 = new ds.Item[] { item6 };
        fPHeapMax5.copia(itemArray7);
        fPHeapMax1.copia(itemArray7);
        fPHeapMax1.constroi();
        ds.FPHeapMax fPHeapMax12 = new ds.FPHeapMax(0);
        fPHeapMax12.imprime();
        fPHeapMax12.constroi();
        fPHeapMax12.imprime();
        fPHeapMax12.constroi();
        fPHeapMax12.imprime();
        ds.FPHeapMax fPHeapMax19 = new ds.FPHeapMax(0);
        ds.Item item20 = null;
        ds.Item[] itemArray21 = new ds.Item[] { item20 };
        fPHeapMax19.copia(itemArray21);
        fPHeapMax19.imprime();
        ds.FPHeapMax fPHeapMax25 = new ds.FPHeapMax((int) (byte) -1);
        fPHeapMax25.constroi();
        fPHeapMax25.imprime();
        ds.Item[] itemArray28 = new ds.Item[] {};
        fPHeapMax25.copia(itemArray28);
        fPHeapMax19.copia(itemArray28);
        fPHeapMax12.copia(itemArray28);
        ds.FPHeapMax fPHeapMax33 = new ds.FPHeapMax(0);
        fPHeapMax33.imprime();
        fPHeapMax33.constroi();
        fPHeapMax33.imprime();
        ds.FPHeapMax fPHeapMax38 = new ds.FPHeapMax((int) '4');
        ds.Item item39 = fPHeapMax38.max();
        ds.FPHeapMax fPHeapMax41 = new ds.FPHeapMax(0);
        fPHeapMax41.imprime();
        ds.Item[] itemArray43 = new ds.Item[] {};
        fPHeapMax41.copia(itemArray43);
        fPHeapMax41.constroi();
        fPHeapMax41.imprime();
        ds.Item[] itemArray47 = new ds.Item[] {};
        fPHeapMax41.copia(itemArray47);
        fPHeapMax38.copia(itemArray47);
        fPHeapMax33.copia(itemArray47);
        fPHeapMax12.copia(itemArray47);
        fPHeapMax1.copia(itemArray47);
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMax1.refaz((int) ' ', (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 32");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray7);
        org.junit.Assert.assertNotNull(itemArray21);
        org.junit.Assert.assertNotNull(itemArray28);
        org.junit.Assert.assertNull(item39);
        org.junit.Assert.assertNotNull(itemArray43);
        org.junit.Assert.assertNotNull(itemArray47);
    }

    @Test
    public void test484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test484");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax(10);
        fPHeapMax1.constroi();
        fPHeapMax1.imprime();
        ds.Item item4 = fPHeapMax1.max();
        ds.FPHeapMax fPHeapMax6 = new ds.FPHeapMax((int) (byte) -1);
        fPHeapMax6.constroi();
        fPHeapMax6.imprime();
        ds.Item[] itemArray9 = new ds.Item[] {};
        fPHeapMax6.copia(itemArray9);
        fPHeapMax6.constroi();
        ds.FPHeapMax fPHeapMax13 = new ds.FPHeapMax(0);
        fPHeapMax13.constroi();
        fPHeapMax13.constroi();
        fPHeapMax13.constroi();
        fPHeapMax13.constroi();
        ds.FPHeapMax fPHeapMax19 = new ds.FPHeapMax(0);
        fPHeapMax19.imprime();
        ds.Item[] itemArray21 = new ds.Item[] {};
        fPHeapMax19.copia(itemArray21);
        fPHeapMax13.copia(itemArray21);
        fPHeapMax6.copia(itemArray21);
        fPHeapMax1.copia(itemArray21);
        java.lang.Class<?> wildcardClass26 = itemArray21.getClass();
        org.junit.Assert.assertNull(item4);
        org.junit.Assert.assertNotNull(itemArray9);
        org.junit.Assert.assertNotNull(itemArray21);
        org.junit.Assert.assertNotNull(wildcardClass26);
    }

    @Test
    public void test485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test485");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) ' ');
        ds.FPHeapMax fPHeapMax3 = new ds.FPHeapMax(0);
        ds.Item item4 = null;
        ds.Item[] itemArray5 = new ds.Item[] { item4 };
        fPHeapMax3.copia(itemArray5);
        fPHeapMax1.copia(itemArray5);
        ds.FPHeapMax fPHeapMax9 = new ds.FPHeapMax(0);
        fPHeapMax9.constroi();
        fPHeapMax9.constroi();
        fPHeapMax9.constroi();
        fPHeapMax9.constroi();
        ds.FPHeapMax fPHeapMax15 = new ds.FPHeapMax(0);
        fPHeapMax15.imprime();
        ds.Item[] itemArray17 = new ds.Item[] {};
        fPHeapMax15.copia(itemArray17);
        fPHeapMax9.copia(itemArray17);
        fPHeapMax1.copia(itemArray17);
        fPHeapMax1.refaz((int) (byte) 1, (int) (byte) 1);
        org.junit.Assert.assertNotNull(itemArray5);
        org.junit.Assert.assertNotNull(itemArray17);
    }

    @Test
    public void test486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test486");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) 'a');
        fPHeapMax1.refaz((int) '4', (int) 'a');
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
    public void test487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test487");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (byte) -1);
        fPHeapMax1.constroi();
        fPHeapMax1.imprime();
        ds.Item[] itemArray4 = new ds.Item[] {};
        fPHeapMax1.copia(itemArray4);
        fPHeapMax1.constroi();
        ds.FPHeapMax fPHeapMax8 = new ds.FPHeapMax(0);
        ds.Item item9 = null;
        ds.Item[] itemArray10 = new ds.Item[] { item9 };
        fPHeapMax8.copia(itemArray10);
        fPHeapMax1.copia(itemArray10);
        fPHeapMax1.constroi();
        java.lang.Class<?> wildcardClass14 = fPHeapMax1.getClass();
        org.junit.Assert.assertNotNull(itemArray4);
        org.junit.Assert.assertNotNull(itemArray10);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test488");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) ' ');
        fPHeapMax1.imprime();
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMax1.refaz((-1), (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test489");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((-1));
        fPHeapMax1.imprime();
        fPHeapMax1.imprime();
        ds.FPHeapMax fPHeapMax5 = new ds.FPHeapMax(0);
        fPHeapMax5.imprime();
        fPHeapMax5.constroi();
        fPHeapMax5.imprime();
        ds.FPHeapMax fPHeapMax10 = new ds.FPHeapMax((int) '4');
        ds.Item item11 = fPHeapMax10.max();
        ds.FPHeapMax fPHeapMax13 = new ds.FPHeapMax(0);
        fPHeapMax13.imprime();
        ds.Item[] itemArray15 = new ds.Item[] {};
        fPHeapMax13.copia(itemArray15);
        fPHeapMax13.constroi();
        fPHeapMax13.imprime();
        ds.Item[] itemArray19 = new ds.Item[] {};
        fPHeapMax13.copia(itemArray19);
        fPHeapMax10.copia(itemArray19);
        fPHeapMax5.copia(itemArray19);
        fPHeapMax1.copia(itemArray19);
        fPHeapMax1.constroi();
        fPHeapMax1.constroi();
        // The following exception was thrown during execution in test generation
        try {
            ds.Item item26 = fPHeapMax1.retiraMax();
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: heap vazio");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(item11);
        org.junit.Assert.assertNotNull(itemArray15);
        org.junit.Assert.assertNotNull(itemArray19);
    }

    @Test
    public void test490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test490");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax(0);
        fPHeapMax1.imprime();
        fPHeapMax1.constroi();
        fPHeapMax1.imprime();
        fPHeapMax1.constroi();
        ds.Item item6 = null;
        ds.Item[] itemArray7 = new ds.Item[] { item6 };
        fPHeapMax1.copia(itemArray7);
        ds.FPHeapMax fPHeapMax10 = new ds.FPHeapMax(1);
        fPHeapMax10.constroi();
        fPHeapMax10.imprime();
        fPHeapMax10.constroi();
        ds.FPHeapMax fPHeapMax15 = new ds.FPHeapMax((int) (byte) -1);
        fPHeapMax15.constroi();
        fPHeapMax15.constroi();
        fPHeapMax15.constroi();
        ds.FPHeapMax fPHeapMax20 = new ds.FPHeapMax(0);
        fPHeapMax20.imprime();
        fPHeapMax20.constroi();
        ds.FPHeapMax fPHeapMax24 = new ds.FPHeapMax(0);
        ds.Item item25 = null;
        ds.Item[] itemArray26 = new ds.Item[] { item25 };
        fPHeapMax24.copia(itemArray26);
        fPHeapMax20.copia(itemArray26);
        fPHeapMax15.copia(itemArray26);
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
        org.junit.Assert.assertNotNull(itemArray7);
        org.junit.Assert.assertNotNull(itemArray26);
    }

    @Test
    public void test491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test491");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (short) 0);
        fPHeapMax1.imprime();
        fPHeapMax1.constroi();
        fPHeapMax1.constroi();
        fPHeapMax1.imprime();
    }

    @Test
    public void test492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test492");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax(0);
        fPHeapMax1.imprime();
        fPHeapMax1.constroi();
        fPHeapMax1.imprime();
        ds.FPHeapMax fPHeapMax6 = new ds.FPHeapMax((int) '4');
        ds.Item item7 = fPHeapMax6.max();
        ds.FPHeapMax fPHeapMax9 = new ds.FPHeapMax(0);
        fPHeapMax9.imprime();
        ds.Item[] itemArray11 = new ds.Item[] {};
        fPHeapMax9.copia(itemArray11);
        fPHeapMax9.constroi();
        fPHeapMax9.imprime();
        ds.Item[] itemArray15 = new ds.Item[] {};
        fPHeapMax9.copia(itemArray15);
        fPHeapMax6.copia(itemArray15);
        fPHeapMax1.copia(itemArray15);
        fPHeapMax1.imprime();
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMax1.refaz(10, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 10");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(item7);
        org.junit.Assert.assertNotNull(itemArray11);
        org.junit.Assert.assertNotNull(itemArray15);
    }

    @Test
    public void test493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test493");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax(0);
        fPHeapMax1.imprime();
        fPHeapMax1.constroi();
        ds.FPHeapMax fPHeapMax5 = new ds.FPHeapMax(0);
        ds.Item item6 = null;
        ds.Item[] itemArray7 = new ds.Item[] { item6 };
        fPHeapMax5.copia(itemArray7);
        fPHeapMax1.copia(itemArray7);
        fPHeapMax1.constroi();
        ds.FPHeapMax fPHeapMax12 = new ds.FPHeapMax(0);
        fPHeapMax12.imprime();
        fPHeapMax12.constroi();
        fPHeapMax12.imprime();
        fPHeapMax12.constroi();
        fPHeapMax12.imprime();
        ds.FPHeapMax fPHeapMax19 = new ds.FPHeapMax(0);
        ds.Item item20 = null;
        ds.Item[] itemArray21 = new ds.Item[] { item20 };
        fPHeapMax19.copia(itemArray21);
        fPHeapMax19.imprime();
        ds.FPHeapMax fPHeapMax25 = new ds.FPHeapMax((int) (byte) -1);
        fPHeapMax25.constroi();
        fPHeapMax25.imprime();
        ds.Item[] itemArray28 = new ds.Item[] {};
        fPHeapMax25.copia(itemArray28);
        fPHeapMax19.copia(itemArray28);
        fPHeapMax12.copia(itemArray28);
        ds.FPHeapMax fPHeapMax33 = new ds.FPHeapMax(0);
        fPHeapMax33.imprime();
        fPHeapMax33.constroi();
        fPHeapMax33.imprime();
        ds.FPHeapMax fPHeapMax38 = new ds.FPHeapMax((int) '4');
        ds.Item item39 = fPHeapMax38.max();
        ds.FPHeapMax fPHeapMax41 = new ds.FPHeapMax(0);
        fPHeapMax41.imprime();
        ds.Item[] itemArray43 = new ds.Item[] {};
        fPHeapMax41.copia(itemArray43);
        fPHeapMax41.constroi();
        fPHeapMax41.imprime();
        ds.Item[] itemArray47 = new ds.Item[] {};
        fPHeapMax41.copia(itemArray47);
        fPHeapMax38.copia(itemArray47);
        fPHeapMax33.copia(itemArray47);
        fPHeapMax12.copia(itemArray47);
        fPHeapMax1.copia(itemArray47);
        fPHeapMax1.constroi();
        org.junit.Assert.assertNotNull(itemArray7);
        org.junit.Assert.assertNotNull(itemArray21);
        org.junit.Assert.assertNotNull(itemArray28);
        org.junit.Assert.assertNull(item39);
        org.junit.Assert.assertNotNull(itemArray43);
        org.junit.Assert.assertNotNull(itemArray47);
    }

    @Test
    public void test494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test494");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (short) 100);
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
    public void test495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test495");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) '4');
        fPHeapMax1.imprime();
        ds.FPHeapMax fPHeapMax5 = new ds.FPHeapMax(0);
        fPHeapMax5.imprime();
        ds.FPHeapMax fPHeapMax8 = new ds.FPHeapMax((int) (short) 100);
        ds.Item item9 = fPHeapMax8.max();
        ds.FPHeapMax fPHeapMax11 = new ds.FPHeapMax((int) '4');
        ds.FPHeapMax fPHeapMax13 = new ds.FPHeapMax(0);
        fPHeapMax13.imprime();
        fPHeapMax13.constroi();
        fPHeapMax13.imprime();
        ds.FPHeapMax fPHeapMax18 = new ds.FPHeapMax((int) '4');
        ds.Item item19 = fPHeapMax18.max();
        ds.FPHeapMax fPHeapMax21 = new ds.FPHeapMax(0);
        fPHeapMax21.imprime();
        ds.Item[] itemArray23 = new ds.Item[] {};
        fPHeapMax21.copia(itemArray23);
        fPHeapMax21.constroi();
        fPHeapMax21.imprime();
        ds.Item[] itemArray27 = new ds.Item[] {};
        fPHeapMax21.copia(itemArray27);
        fPHeapMax18.copia(itemArray27);
        fPHeapMax13.copia(itemArray27);
        fPHeapMax11.copia(itemArray27);
        fPHeapMax8.copia(itemArray27);
        fPHeapMax5.copia(itemArray27);
        fPHeapMax5.constroi();
        ds.FPHeapMax fPHeapMax36 = new ds.FPHeapMax((int) (short) 1);
        fPHeapMax36.constroi();
        ds.FPHeapMax fPHeapMax39 = new ds.FPHeapMax(0);
        fPHeapMax39.imprime();
        fPHeapMax39.constroi();
        fPHeapMax39.imprime();
        fPHeapMax39.constroi();
        ds.Item item44 = null;
        ds.Item[] itemArray45 = new ds.Item[] { item44 };
        fPHeapMax39.copia(itemArray45);
        ds.FPHeapMax fPHeapMax48 = new ds.FPHeapMax(0);
        ds.Item item49 = null;
        ds.Item[] itemArray50 = new ds.Item[] { item49 };
        fPHeapMax48.copia(itemArray50);
        fPHeapMax48.imprime();
        ds.FPHeapMax fPHeapMax54 = new ds.FPHeapMax((int) (byte) -1);
        fPHeapMax54.constroi();
        fPHeapMax54.imprime();
        ds.Item[] itemArray57 = new ds.Item[] {};
        fPHeapMax54.copia(itemArray57);
        fPHeapMax48.copia(itemArray57);
        fPHeapMax39.copia(itemArray57);
        fPHeapMax36.copia(itemArray57);
        fPHeapMax5.copia(itemArray57);
        fPHeapMax5.imprime();
        fPHeapMax5.constroi();
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMax1.aumentaChave((int) (short) 0, (java.lang.Object) fPHeapMax5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(item9);
        org.junit.Assert.assertNull(item19);
        org.junit.Assert.assertNotNull(itemArray23);
        org.junit.Assert.assertNotNull(itemArray27);
        org.junit.Assert.assertNotNull(itemArray45);
        org.junit.Assert.assertNotNull(itemArray50);
        org.junit.Assert.assertNotNull(itemArray57);
    }

    @Test
    public void test496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test496");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax(0);
        fPHeapMax1.imprime();
        fPHeapMax1.constroi();
        ds.FPHeapMax fPHeapMax5 = new ds.FPHeapMax(0);
        ds.Item item6 = null;
        ds.Item[] itemArray7 = new ds.Item[] { item6 };
        fPHeapMax5.copia(itemArray7);
        fPHeapMax1.copia(itemArray7);
        fPHeapMax1.constroi();
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMax1.refaz((int) '#', (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 35");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray7);
    }

    @Test
    public void test497() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test497");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (byte) 0);
        fPHeapMax1.imprime();
        ds.FPHeapMax fPHeapMax4 = new ds.FPHeapMax((int) '4');
        ds.Item item5 = fPHeapMax4.max();
        ds.FPHeapMax fPHeapMax7 = new ds.FPHeapMax(0);
        fPHeapMax7.imprime();
        ds.Item[] itemArray9 = new ds.Item[] {};
        fPHeapMax7.copia(itemArray9);
        fPHeapMax7.constroi();
        fPHeapMax7.imprime();
        ds.Item[] itemArray13 = new ds.Item[] {};
        fPHeapMax7.copia(itemArray13);
        fPHeapMax4.copia(itemArray13);
        fPHeapMax1.copia(itemArray13);
        ds.FPHeapMax fPHeapMax19 = new ds.FPHeapMax((int) (byte) 0);
        fPHeapMax19.imprime();
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMax1.aumentaChave(100, (java.lang.Object) fPHeapMax19);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 100");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(item5);
        org.junit.Assert.assertNotNull(itemArray9);
        org.junit.Assert.assertNotNull(itemArray13);
    }

    @Test
    public void test498() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test498");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (byte) -1);
        fPHeapMax1.constroi();
        ds.FPHeapMax fPHeapMax4 = new ds.FPHeapMax((int) ' ');
        ds.FPHeapMax fPHeapMax6 = new ds.FPHeapMax(0);
        ds.Item item7 = null;
        ds.Item[] itemArray8 = new ds.Item[] { item7 };
        fPHeapMax6.copia(itemArray8);
        fPHeapMax4.copia(itemArray8);
        fPHeapMax1.copia(itemArray8);
        fPHeapMax1.constroi();
        ds.FPHeapMax fPHeapMax15 = new ds.FPHeapMax((int) '4');
        ds.Item item16 = fPHeapMax15.max();
        fPHeapMax15.constroi();
        fPHeapMax15.constroi();
        fPHeapMax15.imprime();
        fPHeapMax15.imprime();
        fPHeapMax15.constroi();
        fPHeapMax15.imprime();
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMax1.aumentaChave(10, (java.lang.Object) fPHeapMax15);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 10");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray8);
        org.junit.Assert.assertNull(item16);
    }

    @Test
    public void test499() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test499");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (short) -1);
        fPHeapMax1.imprime();
        fPHeapMax1.constroi();
        ds.FPHeapMax fPHeapMax5 = new ds.FPHeapMax((int) (byte) -1);
        fPHeapMax5.constroi();
        fPHeapMax5.imprime();
        ds.FPHeapMax fPHeapMax9 = new ds.FPHeapMax(0);
        ds.Item item10 = null;
        ds.Item[] itemArray11 = new ds.Item[] { item10 };
        fPHeapMax9.copia(itemArray11);
        fPHeapMax5.copia(itemArray11);
        fPHeapMax1.copia(itemArray11);
        fPHeapMax1.imprime();
        org.junit.Assert.assertNotNull(itemArray11);
    }

    @Test
    public void test500() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test500");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (short) 100);
        fPHeapMax1.constroi();
        fPHeapMax1.imprime();
    }
}

