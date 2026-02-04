package ds.seed6733;

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
            fPHeapMax1.refaz((int) (short) 1, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test002");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax(0);
        java.lang.Class<?> wildcardClass2 = fPHeapMax1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test003");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax(0);
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMax1.refaz((int) (byte) -1, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test004");
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
    public void test005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test005");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMax1.aumentaChave((-1), (java.lang.Object) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test006");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (byte) 1);
        ds.Item item2 = null;
        ds.Item[] itemArray3 = new ds.Item[] { item2 };
        fPHeapMax1.copia(itemArray3);
        java.lang.Class<?> wildcardClass5 = itemArray3.getClass();
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test007");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (byte) 1);
        ds.Item item2 = null;
        ds.Item[] itemArray3 = new ds.Item[] { item2 };
        fPHeapMax1.copia(itemArray3);
        ds.Item item5 = fPHeapMax1.max();
        ds.Item item6 = fPHeapMax1.max();
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMax1.aumentaChave((int) (short) -1, (java.lang.Object) true);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertNull(item5);
        org.junit.Assert.assertNull(item6);
    }

    @Test
    public void test008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test008");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (byte) 1);
        ds.Item item2 = null;
        ds.Item[] itemArray3 = new ds.Item[] { item2 };
        fPHeapMax1.copia(itemArray3);
        ds.Item item5 = fPHeapMax1.max();
        fPHeapMax1.constroi();
        java.lang.Class<?> wildcardClass7 = fPHeapMax1.getClass();
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertNull(item5);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test009");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (byte) 1);
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
    public void test010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test010");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) ' ');
        // The following exception was thrown during execution in test generation
        try {
            ds.Item item2 = fPHeapMax1.retiraMax();
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: heap vazio");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
    }

    @Test
    public void test011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test011");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) ' ');
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMax1.refaz((-1), 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test012");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (byte) 1);
        ds.FPHeapMax fPHeapMax3 = new ds.FPHeapMax((int) (byte) 1);
        ds.Item item4 = null;
        ds.Item[] itemArray5 = new ds.Item[] { item4 };
        fPHeapMax3.copia(itemArray5);
        fPHeapMax1.copia(itemArray5);
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMax1.refaz(100, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 100");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray5);
    }

    @Test
    public void test013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test013");
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
    public void test014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test014");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (byte) 1);
        ds.Item item2 = null;
        ds.Item[] itemArray3 = new ds.Item[] { item2 };
        fPHeapMax1.copia(itemArray3);
        ds.Item item5 = fPHeapMax1.max();
        fPHeapMax1.constroi();
        fPHeapMax1.constroi();
        ds.Item item8 = fPHeapMax1.max();
        ds.Item item9 = null;
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMax1.insere(item9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertNull(item5);
        org.junit.Assert.assertNull(item8);
    }

    @Test
    public void test015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test015");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax(0);
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMax1.aumentaChave((int) 'a', (java.lang.Object) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 97");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test016");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (byte) 1);
        ds.Item item2 = null;
        ds.Item[] itemArray3 = new ds.Item[] { item2 };
        fPHeapMax1.copia(itemArray3);
        fPHeapMax1.imprime();
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMax1.refaz((int) (short) -1, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray3);
    }

    @Test
    public void test017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test017");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (byte) 1);
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
    public void test018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test018");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (byte) 1);
        ds.Item item2 = null;
        ds.Item[] itemArray3 = new ds.Item[] { item2 };
        fPHeapMax1.copia(itemArray3);
        ds.Item item5 = fPHeapMax1.max();
        fPHeapMax1.constroi();
        fPHeapMax1.constroi();
        ds.Item item8 = fPHeapMax1.max();
        fPHeapMax1.constroi();
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMax1.refaz((int) (short) 10, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 10");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertNull(item5);
        org.junit.Assert.assertNull(item8);
    }

    @Test
    public void test019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test019");
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
    public void test020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test020");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax(0);
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMax1.refaz((int) (byte) 1, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test021");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) ' ');
        java.lang.Class<?> wildcardClass2 = fPHeapMax1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test022");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (byte) 1);
        ds.FPHeapMax fPHeapMax4 = new ds.FPHeapMax((int) (byte) 1);
        ds.Item item5 = null;
        ds.Item[] itemArray6 = new ds.Item[] { item5 };
        fPHeapMax4.copia(itemArray6);
        fPHeapMax4.imprime();
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMax1.aumentaChave((int) 'a', (java.lang.Object) fPHeapMax4);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 97");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray6);
    }

    @Test
    public void test023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test023");
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
    public void test024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test024");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (byte) 1);
        ds.Item item2 = null;
        ds.Item[] itemArray3 = new ds.Item[] { item2 };
        fPHeapMax1.copia(itemArray3);
        ds.Item item5 = fPHeapMax1.max();
        fPHeapMax1.constroi();
        fPHeapMax1.constroi();
        ds.Item item8 = fPHeapMax1.max();
        fPHeapMax1.constroi();
        ds.Item item10 = fPHeapMax1.max();
        fPHeapMax1.constroi();
        ds.FPHeapMax fPHeapMax14 = new ds.FPHeapMax((int) ' ');
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMax1.aumentaChave((int) (short) 1, (java.lang.Object) fPHeapMax14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertNull(item5);
        org.junit.Assert.assertNull(item8);
        org.junit.Assert.assertNull(item10);
    }

    @Test
    public void test025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test025");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (byte) 1);
        ds.Item item2 = null;
        ds.Item[] itemArray3 = new ds.Item[] { item2 };
        fPHeapMax1.copia(itemArray3);
        ds.Item item5 = fPHeapMax1.max();
        fPHeapMax1.constroi();
        fPHeapMax1.constroi();
        ds.Item item8 = fPHeapMax1.max();
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
        org.junit.Assert.assertNull(item8);
    }

    @Test
    public void test026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test026");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (byte) 1);
        ds.Item item2 = null;
        ds.Item[] itemArray3 = new ds.Item[] { item2 };
        fPHeapMax1.copia(itemArray3);
        ds.Item item5 = fPHeapMax1.max();
        fPHeapMax1.constroi();
        fPHeapMax1.constroi();
        ds.Item item8 = fPHeapMax1.max();
        fPHeapMax1.imprime();
        java.lang.Class<?> wildcardClass10 = fPHeapMax1.getClass();
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertNull(item5);
        org.junit.Assert.assertNull(item8);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test027");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (byte) 1);
        ds.Item item2 = null;
        ds.Item[] itemArray3 = new ds.Item[] { item2 };
        fPHeapMax1.copia(itemArray3);
        ds.Item item5 = fPHeapMax1.max();
        fPHeapMax1.constroi();
        fPHeapMax1.constroi();
        ds.Item item8 = fPHeapMax1.max();
        fPHeapMax1.constroi();
        ds.Item item10 = fPHeapMax1.max();
        ds.Item item11 = fPHeapMax1.max();
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
        org.junit.Assert.assertNull(item8);
        org.junit.Assert.assertNull(item10);
        org.junit.Assert.assertNull(item11);
    }

    @Test
    public void test028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test028");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (byte) 1);
        ds.Item item2 = null;
        ds.Item[] itemArray3 = new ds.Item[] { item2 };
        fPHeapMax1.copia(itemArray3);
        ds.Item item5 = fPHeapMax1.max();
        fPHeapMax1.constroi();
        fPHeapMax1.constroi();
        ds.Item item8 = fPHeapMax1.max();
        fPHeapMax1.constroi();
        ds.Item item10 = fPHeapMax1.max();
        ds.Item item11 = fPHeapMax1.max();
        ds.FPHeapMax fPHeapMax14 = new ds.FPHeapMax((int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMax1.aumentaChave((int) '4', (java.lang.Object) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 52");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertNull(item5);
        org.junit.Assert.assertNull(item8);
        org.junit.Assert.assertNull(item10);
        org.junit.Assert.assertNull(item11);
    }

    @Test
    public void test029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test029");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (byte) 1);
        ds.FPHeapMax fPHeapMax3 = new ds.FPHeapMax((int) (byte) 1);
        ds.Item item4 = null;
        ds.Item[] itemArray5 = new ds.Item[] { item4 };
        fPHeapMax3.copia(itemArray5);
        fPHeapMax1.copia(itemArray5);
        fPHeapMax1.imprime();
        java.lang.Object obj10 = null;
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMax1.aumentaChave((int) (byte) 1, obj10);
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: chaveNova com valor null");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray5);
    }

    @Test
    public void test030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test030");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax(0);
        ds.FPHeapMax fPHeapMax3 = new ds.FPHeapMax((int) (byte) 1);
        ds.FPHeapMax fPHeapMax5 = new ds.FPHeapMax((int) (byte) 1);
        ds.Item item6 = null;
        ds.Item[] itemArray7 = new ds.Item[] { item6 };
        fPHeapMax5.copia(itemArray7);
        fPHeapMax3.copia(itemArray7);
        fPHeapMax1.copia(itemArray7);
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMax1.aumentaChave((int) (short) 0, (java.lang.Object) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray7);
    }

    @Test
    public void test031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test031");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (byte) 1);
        ds.Item item2 = null;
        ds.Item[] itemArray3 = new ds.Item[] { item2 };
        fPHeapMax1.copia(itemArray3);
        ds.Item item5 = fPHeapMax1.max();
        fPHeapMax1.constroi();
        fPHeapMax1.constroi();
        ds.Item item8 = fPHeapMax1.max();
        fPHeapMax1.constroi();
        java.lang.Class<?> wildcardClass10 = fPHeapMax1.getClass();
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertNull(item5);
        org.junit.Assert.assertNull(item8);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test032");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (byte) 1);
        ds.Item item2 = null;
        ds.Item[] itemArray3 = new ds.Item[] { item2 };
        fPHeapMax1.copia(itemArray3);
        ds.Item item5 = fPHeapMax1.max();
        fPHeapMax1.constroi();
        fPHeapMax1.constroi();
        ds.Item item8 = fPHeapMax1.max();
        fPHeapMax1.imprime();
        fPHeapMax1.constroi();
        ds.Item item11 = null;
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMax1.insere(item11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertNull(item5);
        org.junit.Assert.assertNull(item8);
    }

    @Test
    public void test033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test033");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) ' ');
        ds.FPHeapMax fPHeapMax4 = new ds.FPHeapMax((int) (byte) 1);
        ds.Item item5 = null;
        ds.Item[] itemArray6 = new ds.Item[] { item5 };
        fPHeapMax4.copia(itemArray6);
        ds.Item item8 = fPHeapMax4.max();
        fPHeapMax4.constroi();
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMax1.aumentaChave((int) (byte) 10, (java.lang.Object) fPHeapMax4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray6);
        org.junit.Assert.assertNull(item8);
    }

    @Test
    public void test034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test034");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax(0);
        ds.FPHeapMax fPHeapMax3 = new ds.FPHeapMax((int) (byte) 1);
        ds.FPHeapMax fPHeapMax5 = new ds.FPHeapMax((int) (byte) 1);
        ds.Item item6 = null;
        ds.Item[] itemArray7 = new ds.Item[] { item6 };
        fPHeapMax5.copia(itemArray7);
        fPHeapMax3.copia(itemArray7);
        fPHeapMax1.copia(itemArray7);
        // The following exception was thrown during execution in test generation
        try {
            ds.Item item11 = fPHeapMax1.retiraMax();
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: heap vazio");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray7);
    }

    @Test
    public void test035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test035");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (byte) 1);
        ds.Item item2 = null;
        ds.Item[] itemArray3 = new ds.Item[] { item2 };
        fPHeapMax1.copia(itemArray3);
        ds.Item item5 = fPHeapMax1.max();
        ds.Item item6 = fPHeapMax1.max();
        ds.FPHeapMax fPHeapMax9 = new ds.FPHeapMax((int) (byte) 1);
        ds.Item item10 = null;
        ds.Item[] itemArray11 = new ds.Item[] { item10 };
        fPHeapMax9.copia(itemArray11);
        fPHeapMax9.imprime();
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMax1.aumentaChave(1, (java.lang.Object) fPHeapMax9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertNull(item5);
        org.junit.Assert.assertNull(item6);
        org.junit.Assert.assertNotNull(itemArray11);
    }

    @Test
    public void test036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test036");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (byte) 1);
        ds.Item item2 = null;
        ds.Item[] itemArray3 = new ds.Item[] { item2 };
        fPHeapMax1.copia(itemArray3);
        ds.Item item5 = fPHeapMax1.max();
        ds.FPHeapMax fPHeapMax7 = new ds.FPHeapMax((int) (byte) 1);
        ds.FPHeapMax fPHeapMax9 = new ds.FPHeapMax((int) (byte) 1);
        ds.Item item10 = null;
        ds.Item[] itemArray11 = new ds.Item[] { item10 };
        fPHeapMax9.copia(itemArray11);
        fPHeapMax7.copia(itemArray11);
        fPHeapMax1.copia(itemArray11);
        java.lang.Class<?> wildcardClass15 = fPHeapMax1.getClass();
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertNull(item5);
        org.junit.Assert.assertNotNull(itemArray11);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test037");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) ' ');
        fPHeapMax1.refaz((int) (short) 1, (int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            ds.Item item5 = fPHeapMax1.retiraMax();
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: heap vazio");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
    }

    @Test
    public void test038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test038");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (byte) 1);
        ds.Item item2 = null;
        ds.Item[] itemArray3 = new ds.Item[] { item2 };
        fPHeapMax1.copia(itemArray3);
        ds.Item item5 = fPHeapMax1.max();
        fPHeapMax1.constroi();
        fPHeapMax1.constroi();
        ds.Item item8 = fPHeapMax1.max();
        fPHeapMax1.constroi();
        fPHeapMax1.refaz(0, (int) (short) -1);
        ds.Item item13 = null;
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMax1.insere(item13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertNull(item5);
        org.junit.Assert.assertNull(item8);
    }

    @Test
    public void test039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test039");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (byte) 1);
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
    public void test040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test040");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (byte) 1);
        ds.Item item2 = null;
        ds.Item[] itemArray3 = new ds.Item[] { item2 };
        fPHeapMax1.copia(itemArray3);
        ds.Item item5 = fPHeapMax1.max();
        ds.Item item6 = fPHeapMax1.max();
        fPHeapMax1.constroi();
        ds.FPHeapMax fPHeapMax10 = new ds.FPHeapMax((int) (byte) 1);
        ds.Item item11 = null;
        ds.Item[] itemArray12 = new ds.Item[] { item11 };
        fPHeapMax10.copia(itemArray12);
        fPHeapMax10.imprime();
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMax1.aumentaChave((int) '#', (java.lang.Object) fPHeapMax10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 35");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertNull(item5);
        org.junit.Assert.assertNull(item6);
        org.junit.Assert.assertNotNull(itemArray12);
    }

    @Test
    public void test041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test041");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (byte) 1);
        ds.FPHeapMax fPHeapMax3 = new ds.FPHeapMax((int) (byte) 1);
        ds.Item item4 = null;
        ds.Item[] itemArray5 = new ds.Item[] { item4 };
        fPHeapMax3.copia(itemArray5);
        fPHeapMax1.copia(itemArray5);
        ds.Item item8 = fPHeapMax1.max();
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMax1.aumentaChave((int) (byte) 0, (java.lang.Object) 10.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray5);
        org.junit.Assert.assertNull(item8);
    }

    @Test
    public void test042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test042");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (byte) 1);
        ds.Item item2 = null;
        ds.Item[] itemArray3 = new ds.Item[] { item2 };
        fPHeapMax1.copia(itemArray3);
        ds.Item item5 = fPHeapMax1.max();
        fPHeapMax1.constroi();
        fPHeapMax1.constroi();
        ds.Item item8 = null;
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMax1.insere(item8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertNull(item5);
    }

    @Test
    public void test043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test043");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (byte) 1);
        ds.Item item2 = null;
        ds.Item[] itemArray3 = new ds.Item[] { item2 };
        fPHeapMax1.copia(itemArray3);
        ds.Item item5 = fPHeapMax1.max();
        fPHeapMax1.constroi();
        fPHeapMax1.constroi();
        ds.Item item8 = fPHeapMax1.max();
        fPHeapMax1.constroi();
        fPHeapMax1.refaz(0, (int) (short) -1);
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMax1.aumentaChave((int) (short) -1, (java.lang.Object) "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertNull(item5);
        org.junit.Assert.assertNull(item8);
    }

    @Test
    public void test044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test044");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (byte) 1);
        ds.FPHeapMax fPHeapMax3 = new ds.FPHeapMax((int) (byte) 1);
        ds.Item item4 = null;
        ds.Item[] itemArray5 = new ds.Item[] { item4 };
        fPHeapMax3.copia(itemArray5);
        fPHeapMax1.copia(itemArray5);
        fPHeapMax1.imprime();
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMax1.refaz(100, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 100");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray5);
    }

    @Test
    public void test045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test045");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (byte) 1);
        ds.Item item2 = null;
        ds.Item[] itemArray3 = new ds.Item[] { item2 };
        fPHeapMax1.copia(itemArray3);
        ds.Item item5 = fPHeapMax1.max();
        fPHeapMax1.constroi();
        fPHeapMax1.constroi();
        ds.Item item8 = fPHeapMax1.max();
        fPHeapMax1.constroi();
        fPHeapMax1.imprime();
        ds.Item item11 = null;
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMax1.insere(item11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertNull(item5);
        org.junit.Assert.assertNull(item8);
    }

    @Test
    public void test046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test046");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (byte) 1);
        ds.FPHeapMax fPHeapMax3 = new ds.FPHeapMax((int) (byte) 1);
        ds.Item item4 = null;
        ds.Item[] itemArray5 = new ds.Item[] { item4 };
        fPHeapMax3.copia(itemArray5);
        fPHeapMax1.copia(itemArray5);
        fPHeapMax1.imprime();
        ds.FPHeapMax fPHeapMax10 = new ds.FPHeapMax((int) (byte) 1);
        ds.Item item11 = null;
        ds.Item[] itemArray12 = new ds.Item[] { item11 };
        fPHeapMax10.copia(itemArray12);
        ds.Item item14 = fPHeapMax10.max();
        ds.FPHeapMax fPHeapMax16 = new ds.FPHeapMax((int) (byte) 1);
        ds.FPHeapMax fPHeapMax18 = new ds.FPHeapMax((int) (byte) 1);
        ds.Item item19 = null;
        ds.Item[] itemArray20 = new ds.Item[] { item19 };
        fPHeapMax18.copia(itemArray20);
        fPHeapMax16.copia(itemArray20);
        fPHeapMax10.copia(itemArray20);
        fPHeapMax1.copia(itemArray20);
        java.lang.Class<?> wildcardClass25 = fPHeapMax1.getClass();
        org.junit.Assert.assertNotNull(itemArray5);
        org.junit.Assert.assertNotNull(itemArray12);
        org.junit.Assert.assertNull(item14);
        org.junit.Assert.assertNotNull(itemArray20);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test047");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (byte) 1);
        ds.Item item2 = null;
        ds.Item[] itemArray3 = new ds.Item[] { item2 };
        fPHeapMax1.copia(itemArray3);
        ds.Item item5 = fPHeapMax1.max();
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMax1.aumentaChave((-1), (java.lang.Object) 0L);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertNull(item5);
    }

    @Test
    public void test048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test048");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (byte) 1);
        ds.Item item2 = null;
        ds.Item[] itemArray3 = new ds.Item[] { item2 };
        fPHeapMax1.copia(itemArray3);
        ds.Item item5 = fPHeapMax1.max();
        fPHeapMax1.constroi();
        fPHeapMax1.constroi();
        ds.Item item8 = fPHeapMax1.max();
        fPHeapMax1.constroi();
        fPHeapMax1.refaz(0, (int) (short) -1);
        // The following exception was thrown during execution in test generation
        try {
            ds.Item item13 = fPHeapMax1.retiraMax();
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: heap vazio");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertNull(item5);
        org.junit.Assert.assertNull(item8);
    }

    @Test
    public void test049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test049");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (byte) 1);
        ds.Item item2 = null;
        ds.Item[] itemArray3 = new ds.Item[] { item2 };
        fPHeapMax1.copia(itemArray3);
        ds.Item item5 = fPHeapMax1.max();
        fPHeapMax1.constroi();
        fPHeapMax1.constroi();
        ds.Item item8 = fPHeapMax1.max();
        fPHeapMax1.constroi();
        ds.Item item10 = fPHeapMax1.max();
        ds.Item item11 = fPHeapMax1.max();
        fPHeapMax1.constroi();
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMax1.aumentaChave((-1), (java.lang.Object) 1.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertNull(item5);
        org.junit.Assert.assertNull(item8);
        org.junit.Assert.assertNull(item10);
        org.junit.Assert.assertNull(item11);
    }

    @Test
    public void test050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test050");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (byte) 1);
        ds.Item item2 = null;
        ds.Item[] itemArray3 = new ds.Item[] { item2 };
        fPHeapMax1.copia(itemArray3);
        ds.Item item5 = fPHeapMax1.max();
        fPHeapMax1.constroi();
        fPHeapMax1.constroi();
        ds.Item item8 = fPHeapMax1.max();
        fPHeapMax1.constroi();
        ds.FPHeapMax fPHeapMax12 = new ds.FPHeapMax((int) (byte) 0);
        fPHeapMax12.constroi();
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMax1.aumentaChave(10, (java.lang.Object) fPHeapMax12);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 10");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertNull(item5);
        org.junit.Assert.assertNull(item8);
    }

    @Test
    public void test051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test051");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (byte) 1);
        ds.Item item2 = null;
        ds.Item[] itemArray3 = new ds.Item[] { item2 };
        fPHeapMax1.copia(itemArray3);
        ds.Item item5 = fPHeapMax1.max();
        ds.Item item6 = fPHeapMax1.max();
        ds.FPHeapMax fPHeapMax9 = new ds.FPHeapMax((int) ' ');
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMax1.aumentaChave((int) (short) 100, (java.lang.Object) fPHeapMax9);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 100");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertNull(item5);
        org.junit.Assert.assertNull(item6);
    }

    @Test
    public void test052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test052");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) ' ');
        ds.FPHeapMax fPHeapMax4 = new ds.FPHeapMax((int) (byte) 1);
        ds.FPHeapMax fPHeapMax6 = new ds.FPHeapMax((int) (byte) 1);
        ds.Item item7 = null;
        ds.Item[] itemArray8 = new ds.Item[] { item7 };
        fPHeapMax6.copia(itemArray8);
        fPHeapMax4.copia(itemArray8);
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMax1.aumentaChave((int) (short) 10, (java.lang.Object) fPHeapMax4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray8);
    }

    @Test
    public void test053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test053");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (byte) 10);
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
    public void test054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test054");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax(0);
        ds.FPHeapMax fPHeapMax3 = new ds.FPHeapMax((int) (byte) 1);
        ds.FPHeapMax fPHeapMax5 = new ds.FPHeapMax((int) (byte) 1);
        ds.Item item6 = null;
        ds.Item[] itemArray7 = new ds.Item[] { item6 };
        fPHeapMax5.copia(itemArray7);
        fPHeapMax3.copia(itemArray7);
        fPHeapMax1.copia(itemArray7);
        ds.Item item11 = null;
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMax1.insere(item11);
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: heap cheio");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray7);
    }

    @Test
    public void test055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test055");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (byte) 10);
        fPHeapMax1.constroi();
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMax1.refaz((int) (byte) 10, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 20");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test056");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (byte) 10);
        fPHeapMax1.constroi();
        java.lang.Class<?> wildcardClass3 = fPHeapMax1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test057");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (byte) 1);
        ds.Item item2 = null;
        ds.Item[] itemArray3 = new ds.Item[] { item2 };
        fPHeapMax1.copia(itemArray3);
        ds.Item item5 = fPHeapMax1.max();
        ds.FPHeapMax fPHeapMax7 = new ds.FPHeapMax((int) (byte) 1);
        ds.FPHeapMax fPHeapMax9 = new ds.FPHeapMax((int) (byte) 1);
        ds.Item item10 = null;
        ds.Item[] itemArray11 = new ds.Item[] { item10 };
        fPHeapMax9.copia(itemArray11);
        fPHeapMax7.copia(itemArray11);
        fPHeapMax1.copia(itemArray11);
        ds.Item item15 = null;
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMax1.insere(item15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertNull(item5);
        org.junit.Assert.assertNotNull(itemArray11);
    }

    @Test
    public void test058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test058");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (byte) 1);
        ds.Item item2 = null;
        ds.Item[] itemArray3 = new ds.Item[] { item2 };
        fPHeapMax1.copia(itemArray3);
        ds.Item item5 = fPHeapMax1.max();
        fPHeapMax1.constroi();
        fPHeapMax1.constroi();
        ds.Item item8 = fPHeapMax1.max();
        fPHeapMax1.constroi();
        ds.Item item10 = fPHeapMax1.max();
        fPHeapMax1.constroi();
        fPHeapMax1.refaz((int) (byte) 1, (int) (byte) -1);
        ds.FPHeapMax fPHeapMax16 = new ds.FPHeapMax((int) (byte) 1);
        ds.Item item17 = null;
        ds.Item[] itemArray18 = new ds.Item[] { item17 };
        fPHeapMax16.copia(itemArray18);
        ds.Item item20 = fPHeapMax16.max();
        ds.FPHeapMax fPHeapMax22 = new ds.FPHeapMax((int) (byte) 1);
        ds.FPHeapMax fPHeapMax24 = new ds.FPHeapMax((int) (byte) 1);
        ds.Item item25 = null;
        ds.Item[] itemArray26 = new ds.Item[] { item25 };
        fPHeapMax24.copia(itemArray26);
        fPHeapMax22.copia(itemArray26);
        fPHeapMax16.copia(itemArray26);
        fPHeapMax1.copia(itemArray26);
        ds.Item item31 = null;
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMax1.insere(item31);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertNull(item5);
        org.junit.Assert.assertNull(item8);
        org.junit.Assert.assertNull(item10);
        org.junit.Assert.assertNotNull(itemArray18);
        org.junit.Assert.assertNull(item20);
        org.junit.Assert.assertNotNull(itemArray26);
    }

    @Test
    public void test059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test059");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (byte) 1);
        ds.Item item2 = null;
        ds.Item[] itemArray3 = new ds.Item[] { item2 };
        fPHeapMax1.copia(itemArray3);
        ds.Item item5 = fPHeapMax1.max();
        fPHeapMax1.constroi();
        fPHeapMax1.constroi();
        ds.Item item8 = fPHeapMax1.max();
        fPHeapMax1.constroi();
        ds.Item item10 = fPHeapMax1.max();
        ds.Item item11 = fPHeapMax1.max();
        // The following exception was thrown during execution in test generation
        try {
            ds.Item item12 = fPHeapMax1.retiraMax();
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: heap vazio");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertNull(item5);
        org.junit.Assert.assertNull(item8);
        org.junit.Assert.assertNull(item10);
        org.junit.Assert.assertNull(item11);
    }

    @Test
    public void test060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test060");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (byte) 1);
        ds.Item item2 = null;
        ds.Item[] itemArray3 = new ds.Item[] { item2 };
        fPHeapMax1.copia(itemArray3);
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMax1.refaz(0, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray3);
    }

    @Test
    public void test061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test061");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) '#');
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMax1.refaz((int) 'a', (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 97");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test062");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (byte) 1);
        ds.Item item2 = null;
        ds.Item[] itemArray3 = new ds.Item[] { item2 };
        fPHeapMax1.copia(itemArray3);
        ds.Item item5 = fPHeapMax1.max();
        fPHeapMax1.constroi();
        fPHeapMax1.constroi();
        ds.Item item8 = fPHeapMax1.max();
        fPHeapMax1.constroi();
        fPHeapMax1.refaz(0, (int) (short) -1);
        fPHeapMax1.constroi();
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMax1.refaz((int) '#', (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 35");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertNull(item5);
        org.junit.Assert.assertNull(item8);
    }

    @Test
    public void test063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test063");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax(0);
        ds.FPHeapMax fPHeapMax3 = new ds.FPHeapMax((int) (byte) 1);
        ds.FPHeapMax fPHeapMax5 = new ds.FPHeapMax((int) (byte) 1);
        ds.Item item6 = null;
        ds.Item[] itemArray7 = new ds.Item[] { item6 };
        fPHeapMax5.copia(itemArray7);
        fPHeapMax3.copia(itemArray7);
        fPHeapMax1.copia(itemArray7);
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMax1.refaz((int) (short) -1, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray7);
    }

    @Test
    public void test064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test064");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (byte) 1);
        ds.Item item2 = null;
        ds.Item[] itemArray3 = new ds.Item[] { item2 };
        fPHeapMax1.copia(itemArray3);
        ds.Item item5 = fPHeapMax1.max();
        fPHeapMax1.constroi();
        fPHeapMax1.constroi();
        ds.Item item8 = fPHeapMax1.max();
        fPHeapMax1.constroi();
        fPHeapMax1.constroi();
        ds.Item item11 = null;
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMax1.insere(item11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertNull(item5);
        org.junit.Assert.assertNull(item8);
    }

    @Test
    public void test065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test065");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax(1);
        ds.Item item2 = fPHeapMax1.max();
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMax1.refaz((int) (byte) 100, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 100");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(item2);
    }

    @Test
    public void test066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test066");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) ' ');
        fPHeapMax1.refaz((int) (short) 1, (int) (short) 1);
        java.lang.Class<?> wildcardClass5 = fPHeapMax1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test067");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (byte) -1);
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMax1.aumentaChave((int) (byte) 100, (java.lang.Object) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 100");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test068");
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
    public void test069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test069");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (byte) 1);
        ds.Item item2 = null;
        ds.Item[] itemArray3 = new ds.Item[] { item2 };
        fPHeapMax1.copia(itemArray3);
        ds.Item item5 = fPHeapMax1.max();
        fPHeapMax1.constroi();
        fPHeapMax1.constroi();
        ds.Item item8 = fPHeapMax1.max();
        fPHeapMax1.constroi();
        fPHeapMax1.refaz(0, (int) (short) -1);
        fPHeapMax1.constroi();
        ds.Item item14 = null;
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMax1.insere(item14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertNull(item5);
        org.junit.Assert.assertNull(item8);
    }

    @Test
    public void test070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test070");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax(0);
        ds.FPHeapMax fPHeapMax3 = new ds.FPHeapMax((int) (byte) 1);
        ds.FPHeapMax fPHeapMax5 = new ds.FPHeapMax((int) (byte) 1);
        ds.Item item6 = null;
        ds.Item[] itemArray7 = new ds.Item[] { item6 };
        fPHeapMax5.copia(itemArray7);
        fPHeapMax3.copia(itemArray7);
        fPHeapMax1.copia(itemArray7);
        ds.FPHeapMax fPHeapMax13 = new ds.FPHeapMax((int) (byte) 1);
        java.lang.Class<?> wildcardClass14 = fPHeapMax13.getClass();
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMax1.aumentaChave((int) (byte) 0, (java.lang.Object) wildcardClass14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray7);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test071");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (byte) 1);
        ds.Item item2 = null;
        ds.Item[] itemArray3 = new ds.Item[] { item2 };
        fPHeapMax1.copia(itemArray3);
        ds.Item item5 = fPHeapMax1.max();
        fPHeapMax1.constroi();
        fPHeapMax1.constroi();
        ds.Item item8 = fPHeapMax1.max();
        fPHeapMax1.constroi();
        ds.Item item10 = fPHeapMax1.max();
        fPHeapMax1.constroi();
        fPHeapMax1.imprime();
        ds.FPHeapMax fPHeapMax14 = new ds.FPHeapMax((int) (byte) 1);
        ds.Item item15 = null;
        ds.Item[] itemArray16 = new ds.Item[] { item15 };
        fPHeapMax14.copia(itemArray16);
        fPHeapMax1.copia(itemArray16);
        ds.FPHeapMax fPHeapMax21 = new ds.FPHeapMax((int) (byte) 1);
        ds.Item item22 = null;
        ds.Item[] itemArray23 = new ds.Item[] { item22 };
        fPHeapMax21.copia(itemArray23);
        ds.Item item25 = fPHeapMax21.max();
        fPHeapMax21.constroi();
        fPHeapMax21.constroi();
        ds.Item item28 = fPHeapMax21.max();
        fPHeapMax21.constroi();
        fPHeapMax21.refaz(0, (int) (short) -1);
        fPHeapMax21.constroi();
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMax1.aumentaChave(10, (java.lang.Object) fPHeapMax21);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 10");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertNull(item5);
        org.junit.Assert.assertNull(item8);
        org.junit.Assert.assertNull(item10);
        org.junit.Assert.assertNotNull(itemArray16);
        org.junit.Assert.assertNotNull(itemArray23);
        org.junit.Assert.assertNull(item25);
        org.junit.Assert.assertNull(item28);
    }

    @Test
    public void test072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test072");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (byte) 1);
        ds.Item item2 = null;
        ds.Item[] itemArray3 = new ds.Item[] { item2 };
        fPHeapMax1.copia(itemArray3);
        ds.Item item5 = fPHeapMax1.max();
        fPHeapMax1.constroi();
        fPHeapMax1.constroi();
        ds.Item item8 = fPHeapMax1.max();
        fPHeapMax1.constroi();
        ds.Item item10 = fPHeapMax1.max();
        fPHeapMax1.constroi();
        fPHeapMax1.refaz((int) (byte) 1, (int) (byte) -1);
        ds.FPHeapMax fPHeapMax16 = new ds.FPHeapMax((int) (byte) 1);
        ds.Item item17 = null;
        ds.Item[] itemArray18 = new ds.Item[] { item17 };
        fPHeapMax16.copia(itemArray18);
        ds.Item item20 = fPHeapMax16.max();
        ds.FPHeapMax fPHeapMax22 = new ds.FPHeapMax((int) (byte) 1);
        ds.FPHeapMax fPHeapMax24 = new ds.FPHeapMax((int) (byte) 1);
        ds.Item item25 = null;
        ds.Item[] itemArray26 = new ds.Item[] { item25 };
        fPHeapMax24.copia(itemArray26);
        fPHeapMax22.copia(itemArray26);
        fPHeapMax16.copia(itemArray26);
        fPHeapMax1.copia(itemArray26);
        java.lang.Class<?> wildcardClass31 = fPHeapMax1.getClass();
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertNull(item5);
        org.junit.Assert.assertNull(item8);
        org.junit.Assert.assertNull(item10);
        org.junit.Assert.assertNotNull(itemArray18);
        org.junit.Assert.assertNull(item20);
        org.junit.Assert.assertNotNull(itemArray26);
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test073");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (byte) 1);
        ds.FPHeapMax fPHeapMax3 = new ds.FPHeapMax((int) (byte) 1);
        ds.Item item4 = null;
        ds.Item[] itemArray5 = new ds.Item[] { item4 };
        fPHeapMax3.copia(itemArray5);
        fPHeapMax1.copia(itemArray5);
        fPHeapMax1.imprime();
        ds.FPHeapMax fPHeapMax10 = new ds.FPHeapMax((int) (byte) 1);
        ds.Item item11 = null;
        ds.Item[] itemArray12 = new ds.Item[] { item11 };
        fPHeapMax10.copia(itemArray12);
        ds.Item item14 = fPHeapMax10.max();
        ds.FPHeapMax fPHeapMax16 = new ds.FPHeapMax((int) (byte) 1);
        ds.FPHeapMax fPHeapMax18 = new ds.FPHeapMax((int) (byte) 1);
        ds.Item item19 = null;
        ds.Item[] itemArray20 = new ds.Item[] { item19 };
        fPHeapMax18.copia(itemArray20);
        fPHeapMax16.copia(itemArray20);
        fPHeapMax10.copia(itemArray20);
        fPHeapMax1.copia(itemArray20);
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMax1.refaz((int) (byte) -1, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray5);
        org.junit.Assert.assertNotNull(itemArray12);
        org.junit.Assert.assertNull(item14);
        org.junit.Assert.assertNotNull(itemArray20);
    }

    @Test
    public void test074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test074");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax(0);
        fPHeapMax1.imprime();
        java.lang.Class<?> wildcardClass3 = fPHeapMax1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test075");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (short) 10);
        java.lang.Class<?> wildcardClass2 = fPHeapMax1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test076");
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
    public void test077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test077");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) ' ');
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
    public void test078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test078");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (byte) 1);
        ds.FPHeapMax fPHeapMax3 = new ds.FPHeapMax((int) (byte) 1);
        ds.Item item4 = null;
        ds.Item[] itemArray5 = new ds.Item[] { item4 };
        fPHeapMax3.copia(itemArray5);
        fPHeapMax1.copia(itemArray5);
        java.lang.Class<?> wildcardClass8 = fPHeapMax1.getClass();
        org.junit.Assert.assertNotNull(itemArray5);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test079");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (byte) 100);
        fPHeapMax1.imprime();
        java.lang.Class<?> wildcardClass3 = fPHeapMax1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test080");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (byte) 1);
        ds.Item item2 = null;
        ds.Item[] itemArray3 = new ds.Item[] { item2 };
        fPHeapMax1.copia(itemArray3);
        ds.Item item5 = fPHeapMax1.max();
        fPHeapMax1.constroi();
        fPHeapMax1.constroi();
        ds.Item item8 = fPHeapMax1.max();
        fPHeapMax1.imprime();
        ds.Item item10 = fPHeapMax1.max();
        fPHeapMax1.imprime();
        fPHeapMax1.imprime();
        java.lang.Class<?> wildcardClass13 = fPHeapMax1.getClass();
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertNull(item5);
        org.junit.Assert.assertNull(item8);
        org.junit.Assert.assertNull(item10);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test081");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (byte) 1);
        ds.Item item2 = null;
        ds.Item[] itemArray3 = new ds.Item[] { item2 };
        fPHeapMax1.copia(itemArray3);
        ds.Item item5 = fPHeapMax1.max();
        fPHeapMax1.constroi();
        fPHeapMax1.constroi();
        ds.Item item8 = fPHeapMax1.max();
        fPHeapMax1.constroi();
        ds.Item item10 = fPHeapMax1.max();
        fPHeapMax1.constroi();
        fPHeapMax1.refaz((int) (byte) 1, (int) (byte) -1);
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMax1.refaz((int) (byte) 100, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 100");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertNull(item5);
        org.junit.Assert.assertNull(item8);
        org.junit.Assert.assertNull(item10);
    }

    @Test
    public void test082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test082");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (byte) 1);
        ds.Item item2 = null;
        ds.Item[] itemArray3 = new ds.Item[] { item2 };
        fPHeapMax1.copia(itemArray3);
        ds.Item item5 = fPHeapMax1.max();
        fPHeapMax1.constroi();
        fPHeapMax1.constroi();
        ds.Item item8 = fPHeapMax1.max();
        fPHeapMax1.constroi();
        ds.Item item10 = fPHeapMax1.max();
        fPHeapMax1.imprime();
        fPHeapMax1.imprime();
        // The following exception was thrown during execution in test generation
        try {
            ds.Item item13 = fPHeapMax1.retiraMax();
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: heap vazio");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertNull(item5);
        org.junit.Assert.assertNull(item8);
        org.junit.Assert.assertNull(item10);
    }

    @Test
    public void test083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test083");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) ' ');
        fPHeapMax1.refaz((int) (short) 1, (int) (short) 1);
        ds.Item item5 = fPHeapMax1.max();
        ds.FPHeapMax fPHeapMax7 = new ds.FPHeapMax((int) (byte) 1);
        ds.Item item8 = null;
        ds.Item[] itemArray9 = new ds.Item[] { item8 };
        fPHeapMax7.copia(itemArray9);
        fPHeapMax1.copia(itemArray9);
        fPHeapMax1.constroi();
        ds.FPHeapMax fPHeapMax14 = new ds.FPHeapMax((int) (byte) 1);
        ds.Item item15 = null;
        ds.Item[] itemArray16 = new ds.Item[] { item15 };
        fPHeapMax14.copia(itemArray16);
        fPHeapMax1.copia(itemArray16);
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMax1.refaz((int) (byte) -1, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(item5);
        org.junit.Assert.assertNotNull(itemArray9);
        org.junit.Assert.assertNotNull(itemArray16);
    }

    @Test
    public void test084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test084");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (byte) 1);
        ds.Item item2 = null;
        ds.Item[] itemArray3 = new ds.Item[] { item2 };
        fPHeapMax1.copia(itemArray3);
        ds.Item item5 = fPHeapMax1.max();
        fPHeapMax1.constroi();
        fPHeapMax1.constroi();
        ds.Item item8 = fPHeapMax1.max();
        fPHeapMax1.constroi();
        ds.Item item10 = fPHeapMax1.max();
        fPHeapMax1.constroi();
        fPHeapMax1.imprime();
        ds.FPHeapMax fPHeapMax14 = new ds.FPHeapMax((int) (byte) 1);
        ds.Item item15 = null;
        ds.Item[] itemArray16 = new ds.Item[] { item15 };
        fPHeapMax14.copia(itemArray16);
        fPHeapMax1.copia(itemArray16);
        fPHeapMax1.constroi();
        fPHeapMax1.constroi();
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertNull(item5);
        org.junit.Assert.assertNull(item8);
        org.junit.Assert.assertNull(item10);
        org.junit.Assert.assertNotNull(itemArray16);
    }

    @Test
    public void test085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test085");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (byte) 1);
        ds.Item item2 = null;
        ds.Item[] itemArray3 = new ds.Item[] { item2 };
        fPHeapMax1.copia(itemArray3);
        ds.Item item5 = fPHeapMax1.max();
        fPHeapMax1.constroi();
        fPHeapMax1.constroi();
        ds.Item item8 = fPHeapMax1.max();
        fPHeapMax1.constroi();
        ds.Item item10 = fPHeapMax1.max();
        ds.Item item11 = fPHeapMax1.max();
        fPHeapMax1.imprime();
        ds.Item item13 = null;
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMax1.insere(item13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertNull(item5);
        org.junit.Assert.assertNull(item8);
        org.junit.Assert.assertNull(item10);
        org.junit.Assert.assertNull(item11);
    }

    @Test
    public void test086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test086");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax(1);
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMax1.refaz((int) (short) 10, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 10");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test087");
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
    public void test088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test088");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (byte) 1);
        ds.Item item2 = null;
        ds.Item[] itemArray3 = new ds.Item[] { item2 };
        fPHeapMax1.copia(itemArray3);
        ds.Item item5 = fPHeapMax1.max();
        fPHeapMax1.constroi();
        fPHeapMax1.constroi();
        ds.Item item8 = fPHeapMax1.max();
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMax1.refaz((int) (short) 10, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 10");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertNull(item5);
        org.junit.Assert.assertNull(item8);
    }

    @Test
    public void test089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test089");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (byte) 1);
        ds.Item item2 = null;
        ds.Item[] itemArray3 = new ds.Item[] { item2 };
        fPHeapMax1.copia(itemArray3);
        ds.Item item5 = fPHeapMax1.max();
        fPHeapMax1.constroi();
        fPHeapMax1.constroi();
        ds.Item item8 = fPHeapMax1.max();
        fPHeapMax1.constroi();
        ds.Item item10 = fPHeapMax1.max();
        ds.Item item11 = fPHeapMax1.max();
        ds.Item item12 = fPHeapMax1.max();
        java.lang.Class<?> wildcardClass13 = fPHeapMax1.getClass();
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertNull(item5);
        org.junit.Assert.assertNull(item8);
        org.junit.Assert.assertNull(item10);
        org.junit.Assert.assertNull(item11);
        org.junit.Assert.assertNull(item12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test090");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (byte) 1);
        ds.Item item2 = null;
        ds.Item[] itemArray3 = new ds.Item[] { item2 };
        fPHeapMax1.copia(itemArray3);
        ds.Item item5 = fPHeapMax1.max();
        fPHeapMax1.constroi();
        fPHeapMax1.constroi();
        ds.Item item8 = fPHeapMax1.max();
        fPHeapMax1.constroi();
        ds.Item item10 = fPHeapMax1.max();
        fPHeapMax1.constroi();
        // The following exception was thrown during execution in test generation
        try {
            ds.Item item12 = fPHeapMax1.retiraMax();
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: heap vazio");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertNull(item5);
        org.junit.Assert.assertNull(item8);
        org.junit.Assert.assertNull(item10);
    }

    @Test
    public void test091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test091");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) 'a');
        java.lang.Class<?> wildcardClass2 = fPHeapMax1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test092");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (byte) 1);
        ds.Item item2 = null;
        ds.Item[] itemArray3 = new ds.Item[] { item2 };
        fPHeapMax1.copia(itemArray3);
        ds.Item item5 = fPHeapMax1.max();
        fPHeapMax1.constroi();
        fPHeapMax1.constroi();
        ds.Item item8 = fPHeapMax1.max();
        fPHeapMax1.imprime();
        ds.Item item10 = fPHeapMax1.max();
        fPHeapMax1.imprime();
        fPHeapMax1.imprime();
        ds.Item item13 = null;
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMax1.insere(item13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertNull(item5);
        org.junit.Assert.assertNull(item8);
        org.junit.Assert.assertNull(item10);
    }

    @Test
    public void test093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test093");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (byte) 1);
        ds.Item item2 = null;
        ds.Item[] itemArray3 = new ds.Item[] { item2 };
        fPHeapMax1.copia(itemArray3);
        ds.Item item5 = fPHeapMax1.max();
        fPHeapMax1.constroi();
        fPHeapMax1.constroi();
        ds.Item item8 = fPHeapMax1.max();
        fPHeapMax1.constroi();
        ds.Item item10 = fPHeapMax1.max();
        fPHeapMax1.constroi();
        fPHeapMax1.imprime();
        ds.Item item13 = null;
        ds.Item[] itemArray14 = new ds.Item[] { item13 };
        fPHeapMax1.copia(itemArray14);
        ds.FPHeapMax fPHeapMax18 = new ds.FPHeapMax((int) (byte) 1);
        ds.Item item19 = null;
        ds.Item[] itemArray20 = new ds.Item[] { item19 };
        fPHeapMax18.copia(itemArray20);
        ds.Item item22 = fPHeapMax18.max();
        fPHeapMax18.constroi();
        fPHeapMax18.constroi();
        ds.Item item25 = fPHeapMax18.max();
        fPHeapMax18.constroi();
        ds.Item item27 = fPHeapMax18.max();
        fPHeapMax18.constroi();
        fPHeapMax18.refaz((int) (byte) 1, (int) (byte) -1);
        ds.FPHeapMax fPHeapMax33 = new ds.FPHeapMax((int) (byte) 1);
        ds.Item item34 = null;
        ds.Item[] itemArray35 = new ds.Item[] { item34 };
        fPHeapMax33.copia(itemArray35);
        ds.Item item37 = fPHeapMax33.max();
        ds.FPHeapMax fPHeapMax39 = new ds.FPHeapMax((int) (byte) 1);
        ds.FPHeapMax fPHeapMax41 = new ds.FPHeapMax((int) (byte) 1);
        ds.Item item42 = null;
        ds.Item[] itemArray43 = new ds.Item[] { item42 };
        fPHeapMax41.copia(itemArray43);
        fPHeapMax39.copia(itemArray43);
        fPHeapMax33.copia(itemArray43);
        fPHeapMax18.copia(itemArray43);
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMax1.aumentaChave((int) (byte) -1, (java.lang.Object) fPHeapMax18);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertNull(item5);
        org.junit.Assert.assertNull(item8);
        org.junit.Assert.assertNull(item10);
        org.junit.Assert.assertNotNull(itemArray14);
        org.junit.Assert.assertNotNull(itemArray20);
        org.junit.Assert.assertNull(item22);
        org.junit.Assert.assertNull(item25);
        org.junit.Assert.assertNull(item27);
        org.junit.Assert.assertNotNull(itemArray35);
        org.junit.Assert.assertNull(item37);
        org.junit.Assert.assertNotNull(itemArray43);
    }

    @Test
    public void test094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test094");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (byte) 1);
        ds.FPHeapMax fPHeapMax3 = new ds.FPHeapMax((int) (byte) 1);
        ds.Item item4 = null;
        ds.Item[] itemArray5 = new ds.Item[] { item4 };
        fPHeapMax3.copia(itemArray5);
        fPHeapMax1.copia(itemArray5);
        fPHeapMax1.imprime();
        java.lang.Class<?> wildcardClass9 = fPHeapMax1.getClass();
        org.junit.Assert.assertNotNull(itemArray5);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test095");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (short) 1);
        ds.FPHeapMax fPHeapMax3 = new ds.FPHeapMax(0);
        ds.FPHeapMax fPHeapMax5 = new ds.FPHeapMax((int) (byte) 1);
        ds.FPHeapMax fPHeapMax7 = new ds.FPHeapMax((int) (byte) 1);
        ds.Item item8 = null;
        ds.Item[] itemArray9 = new ds.Item[] { item8 };
        fPHeapMax7.copia(itemArray9);
        fPHeapMax5.copia(itemArray9);
        fPHeapMax3.copia(itemArray9);
        fPHeapMax1.copia(itemArray9);
        fPHeapMax1.imprime();
        ds.FPHeapMax fPHeapMax16 = new ds.FPHeapMax((int) ' ');
        fPHeapMax16.refaz((int) (short) 1, (int) (short) 1);
        ds.Item item20 = fPHeapMax16.max();
        ds.FPHeapMax fPHeapMax22 = new ds.FPHeapMax((int) (byte) 1);
        ds.Item item23 = null;
        ds.Item[] itemArray24 = new ds.Item[] { item23 };
        fPHeapMax22.copia(itemArray24);
        fPHeapMax16.copia(itemArray24);
        fPHeapMax1.copia(itemArray24);
        ds.FPHeapMax fPHeapMax29 = new ds.FPHeapMax((int) (byte) 1);
        ds.Item item30 = null;
        ds.Item[] itemArray31 = new ds.Item[] { item30 };
        fPHeapMax29.copia(itemArray31);
        ds.Item item33 = fPHeapMax29.max();
        fPHeapMax29.constroi();
        fPHeapMax29.constroi();
        ds.Item item36 = fPHeapMax29.max();
        fPHeapMax29.constroi();
        ds.Item item38 = fPHeapMax29.max();
        fPHeapMax29.imprime();
        ds.FPHeapMax fPHeapMax41 = new ds.FPHeapMax((int) (byte) 1);
        ds.Item item42 = null;
        ds.Item[] itemArray43 = new ds.Item[] { item42 };
        fPHeapMax41.copia(itemArray43);
        ds.Item item45 = fPHeapMax41.max();
        ds.FPHeapMax fPHeapMax47 = new ds.FPHeapMax((int) (byte) 1);
        ds.FPHeapMax fPHeapMax49 = new ds.FPHeapMax((int) (byte) 1);
        ds.Item item50 = null;
        ds.Item[] itemArray51 = new ds.Item[] { item50 };
        fPHeapMax49.copia(itemArray51);
        fPHeapMax47.copia(itemArray51);
        fPHeapMax41.copia(itemArray51);
        fPHeapMax29.copia(itemArray51);
        fPHeapMax1.copia(itemArray51);
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMax1.refaz((int) (byte) 10, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 10");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray9);
        org.junit.Assert.assertNull(item20);
        org.junit.Assert.assertNotNull(itemArray24);
        org.junit.Assert.assertNotNull(itemArray31);
        org.junit.Assert.assertNull(item33);
        org.junit.Assert.assertNull(item36);
        org.junit.Assert.assertNull(item38);
        org.junit.Assert.assertNotNull(itemArray43);
        org.junit.Assert.assertNull(item45);
        org.junit.Assert.assertNotNull(itemArray51);
    }

    @Test
    public void test096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test096");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (short) 10);
        ds.FPHeapMax fPHeapMax3 = new ds.FPHeapMax((int) (byte) 1);
        ds.Item item4 = null;
        ds.Item[] itemArray5 = new ds.Item[] { item4 };
        fPHeapMax3.copia(itemArray5);
        ds.Item item7 = fPHeapMax3.max();
        fPHeapMax3.constroi();
        fPHeapMax3.constroi();
        ds.Item item10 = fPHeapMax3.max();
        fPHeapMax3.constroi();
        ds.Item item12 = fPHeapMax3.max();
        fPHeapMax3.constroi();
        fPHeapMax3.imprime();
        ds.FPHeapMax fPHeapMax16 = new ds.FPHeapMax((int) (byte) 1);
        ds.Item item17 = null;
        ds.Item[] itemArray18 = new ds.Item[] { item17 };
        fPHeapMax16.copia(itemArray18);
        fPHeapMax3.copia(itemArray18);
        fPHeapMax1.copia(itemArray18);
        ds.FPHeapMax fPHeapMax24 = new ds.FPHeapMax((int) (byte) 1);
        ds.Item item25 = null;
        ds.Item[] itemArray26 = new ds.Item[] { item25 };
        fPHeapMax24.copia(itemArray26);
        ds.Item item28 = fPHeapMax24.max();
        ds.Item item29 = fPHeapMax24.max();
        fPHeapMax24.constroi();
        ds.FPHeapMax fPHeapMax32 = new ds.FPHeapMax((int) (byte) 1);
        ds.Item item33 = null;
        ds.Item[] itemArray34 = new ds.Item[] { item33 };
        fPHeapMax32.copia(itemArray34);
        ds.Item item36 = fPHeapMax32.max();
        fPHeapMax32.constroi();
        fPHeapMax32.constroi();
        ds.Item item39 = fPHeapMax32.max();
        fPHeapMax32.constroi();
        ds.Item item41 = fPHeapMax32.max();
        fPHeapMax32.imprime();
        ds.FPHeapMax fPHeapMax44 = new ds.FPHeapMax((int) (byte) 1);
        ds.Item item45 = null;
        ds.Item[] itemArray46 = new ds.Item[] { item45 };
        fPHeapMax44.copia(itemArray46);
        ds.Item item48 = fPHeapMax44.max();
        ds.FPHeapMax fPHeapMax50 = new ds.FPHeapMax((int) (byte) 1);
        ds.FPHeapMax fPHeapMax52 = new ds.FPHeapMax((int) (byte) 1);
        ds.Item item53 = null;
        ds.Item[] itemArray54 = new ds.Item[] { item53 };
        fPHeapMax52.copia(itemArray54);
        fPHeapMax50.copia(itemArray54);
        fPHeapMax44.copia(itemArray54);
        fPHeapMax32.copia(itemArray54);
        fPHeapMax24.copia(itemArray54);
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMax1.aumentaChave((int) (byte) 0, (java.lang.Object) itemArray54);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray5);
        org.junit.Assert.assertNull(item7);
        org.junit.Assert.assertNull(item10);
        org.junit.Assert.assertNull(item12);
        org.junit.Assert.assertNotNull(itemArray18);
        org.junit.Assert.assertNotNull(itemArray26);
        org.junit.Assert.assertNull(item28);
        org.junit.Assert.assertNull(item29);
        org.junit.Assert.assertNotNull(itemArray34);
        org.junit.Assert.assertNull(item36);
        org.junit.Assert.assertNull(item39);
        org.junit.Assert.assertNull(item41);
        org.junit.Assert.assertNotNull(itemArray46);
        org.junit.Assert.assertNull(item48);
        org.junit.Assert.assertNotNull(itemArray54);
    }

    @Test
    public void test097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test097");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (byte) 1);
        ds.Item item2 = null;
        ds.Item[] itemArray3 = new ds.Item[] { item2 };
        fPHeapMax1.copia(itemArray3);
        ds.Item item5 = fPHeapMax1.max();
        fPHeapMax1.constroi();
        fPHeapMax1.constroi();
        ds.Item item8 = fPHeapMax1.max();
        fPHeapMax1.imprime();
        fPHeapMax1.imprime();
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertNull(item5);
        org.junit.Assert.assertNull(item8);
    }

    @Test
    public void test098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test098");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (byte) 100);
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
    public void test099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test099");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (byte) 1);
        ds.Item item2 = null;
        ds.Item[] itemArray3 = new ds.Item[] { item2 };
        fPHeapMax1.copia(itemArray3);
        ds.Item item5 = fPHeapMax1.max();
        fPHeapMax1.constroi();
        fPHeapMax1.constroi();
        ds.Item item8 = fPHeapMax1.max();
        fPHeapMax1.constroi();
        ds.Item item10 = fPHeapMax1.max();
        fPHeapMax1.constroi();
        fPHeapMax1.imprime();
        ds.FPHeapMax fPHeapMax14 = new ds.FPHeapMax((int) (byte) 1);
        ds.Item item15 = null;
        ds.Item[] itemArray16 = new ds.Item[] { item15 };
        fPHeapMax14.copia(itemArray16);
        fPHeapMax1.copia(itemArray16);
        ds.FPHeapMax fPHeapMax21 = new ds.FPHeapMax((int) (short) 1);
        ds.FPHeapMax fPHeapMax23 = new ds.FPHeapMax(0);
        ds.FPHeapMax fPHeapMax25 = new ds.FPHeapMax((int) (byte) 1);
        ds.FPHeapMax fPHeapMax27 = new ds.FPHeapMax((int) (byte) 1);
        ds.Item item28 = null;
        ds.Item[] itemArray29 = new ds.Item[] { item28 };
        fPHeapMax27.copia(itemArray29);
        fPHeapMax25.copia(itemArray29);
        fPHeapMax23.copia(itemArray29);
        fPHeapMax21.copia(itemArray29);
        fPHeapMax21.imprime();
        ds.FPHeapMax fPHeapMax36 = new ds.FPHeapMax((int) ' ');
        fPHeapMax36.refaz((int) (short) 1, (int) (short) 1);
        ds.Item item40 = fPHeapMax36.max();
        ds.FPHeapMax fPHeapMax42 = new ds.FPHeapMax((int) (byte) 1);
        ds.Item item43 = null;
        ds.Item[] itemArray44 = new ds.Item[] { item43 };
        fPHeapMax42.copia(itemArray44);
        fPHeapMax36.copia(itemArray44);
        fPHeapMax21.copia(itemArray44);
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMax1.aumentaChave((int) '#', (java.lang.Object) itemArray44);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 35");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertNull(item5);
        org.junit.Assert.assertNull(item8);
        org.junit.Assert.assertNull(item10);
        org.junit.Assert.assertNotNull(itemArray16);
        org.junit.Assert.assertNotNull(itemArray29);
        org.junit.Assert.assertNull(item40);
        org.junit.Assert.assertNotNull(itemArray44);
    }

    @Test
    public void test100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test100");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (byte) 1);
        ds.Item item2 = null;
        ds.Item[] itemArray3 = new ds.Item[] { item2 };
        fPHeapMax1.copia(itemArray3);
        ds.Item item5 = fPHeapMax1.max();
        fPHeapMax1.constroi();
        fPHeapMax1.constroi();
        ds.Item item8 = fPHeapMax1.max();
        fPHeapMax1.constroi();
        ds.Item item10 = fPHeapMax1.max();
        fPHeapMax1.constroi();
        fPHeapMax1.imprime();
        ds.FPHeapMax fPHeapMax14 = new ds.FPHeapMax((int) (byte) 1);
        ds.Item item15 = null;
        ds.Item[] itemArray16 = new ds.Item[] { item15 };
        fPHeapMax14.copia(itemArray16);
        fPHeapMax1.copia(itemArray16);
        java.lang.Class<?> wildcardClass19 = itemArray16.getClass();
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertNull(item5);
        org.junit.Assert.assertNull(item8);
        org.junit.Assert.assertNull(item10);
        org.junit.Assert.assertNotNull(itemArray16);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test101");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (byte) 1);
        ds.Item item2 = null;
        ds.Item[] itemArray3 = new ds.Item[] { item2 };
        fPHeapMax1.copia(itemArray3);
        ds.Item item5 = fPHeapMax1.max();
        fPHeapMax1.constroi();
        fPHeapMax1.constroi();
        ds.Item item8 = fPHeapMax1.max();
        fPHeapMax1.constroi();
        ds.Item item10 = fPHeapMax1.max();
        fPHeapMax1.constroi();
        fPHeapMax1.imprime();
        ds.Item item13 = null;
        ds.Item[] itemArray14 = new ds.Item[] { item13 };
        fPHeapMax1.copia(itemArray14);
        fPHeapMax1.imprime();
        ds.FPHeapMax fPHeapMax19 = new ds.FPHeapMax((int) (byte) 0);
        fPHeapMax19.constroi();
        fPHeapMax19.constroi();
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMax1.aumentaChave((int) (short) 10, (java.lang.Object) fPHeapMax19);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 10");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertNull(item5);
        org.junit.Assert.assertNull(item8);
        org.junit.Assert.assertNull(item10);
        org.junit.Assert.assertNotNull(itemArray14);
    }

    @Test
    public void test102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test102");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (byte) 1);
        ds.FPHeapMax fPHeapMax3 = new ds.FPHeapMax((int) (byte) 1);
        ds.Item item4 = null;
        ds.Item[] itemArray5 = new ds.Item[] { item4 };
        fPHeapMax3.copia(itemArray5);
        fPHeapMax1.copia(itemArray5);
        fPHeapMax1.imprime();
        ds.FPHeapMax fPHeapMax11 = new ds.FPHeapMax((int) (short) 1);
        fPHeapMax11.imprime();
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMax1.aumentaChave(0, (java.lang.Object) fPHeapMax11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray5);
    }

    @Test
    public void test103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test103");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (byte) 1);
        ds.Item item2 = null;
        ds.Item[] itemArray3 = new ds.Item[] { item2 };
        fPHeapMax1.copia(itemArray3);
        ds.Item item5 = fPHeapMax1.max();
        fPHeapMax1.constroi();
        fPHeapMax1.constroi();
        ds.Item item8 = fPHeapMax1.max();
        fPHeapMax1.constroi();
        fPHeapMax1.constroi();
        // The following exception was thrown during execution in test generation
        try {
            ds.Item item11 = fPHeapMax1.retiraMax();
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: heap vazio");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertNull(item5);
        org.junit.Assert.assertNull(item8);
    }

    @Test
    public void test104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test104");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (byte) 1);
        ds.Item item2 = null;
        ds.Item[] itemArray3 = new ds.Item[] { item2 };
        fPHeapMax1.copia(itemArray3);
        ds.Item item5 = fPHeapMax1.max();
        fPHeapMax1.constroi();
        fPHeapMax1.constroi();
        ds.Item item8 = fPHeapMax1.max();
        fPHeapMax1.constroi();
        fPHeapMax1.refaz(0, (int) (short) -1);
        fPHeapMax1.constroi();
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMax1.refaz((int) (short) 10, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 10");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertNull(item5);
        org.junit.Assert.assertNull(item8);
    }

    @Test
    public void test105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test105");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (byte) 1);
        ds.Item item2 = null;
        ds.Item[] itemArray3 = new ds.Item[] { item2 };
        fPHeapMax1.copia(itemArray3);
        ds.Item item5 = fPHeapMax1.max();
        fPHeapMax1.constroi();
        fPHeapMax1.constroi();
        ds.Item item8 = fPHeapMax1.max();
        fPHeapMax1.constroi();
        ds.Item item10 = fPHeapMax1.max();
        fPHeapMax1.constroi();
        java.lang.Class<?> wildcardClass12 = fPHeapMax1.getClass();
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertNull(item5);
        org.junit.Assert.assertNull(item8);
        org.junit.Assert.assertNull(item10);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test106");
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
    public void test107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test107");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (byte) 1);
        ds.Item item2 = null;
        ds.Item[] itemArray3 = new ds.Item[] { item2 };
        fPHeapMax1.copia(itemArray3);
        ds.Item item5 = fPHeapMax1.max();
        fPHeapMax1.constroi();
        fPHeapMax1.constroi();
        ds.Item item8 = fPHeapMax1.max();
        fPHeapMax1.constroi();
        ds.Item item10 = fPHeapMax1.max();
        fPHeapMax1.constroi();
        fPHeapMax1.refaz((int) (byte) 1, (int) (byte) -1);
        ds.FPHeapMax fPHeapMax17 = new ds.FPHeapMax((int) (byte) 1);
        ds.Item item18 = null;
        ds.Item[] itemArray19 = new ds.Item[] { item18 };
        fPHeapMax17.copia(itemArray19);
        ds.Item item21 = fPHeapMax17.max();
        fPHeapMax17.constroi();
        fPHeapMax17.constroi();
        ds.Item item24 = fPHeapMax17.max();
        fPHeapMax17.constroi();
        ds.Item item26 = fPHeapMax17.max();
        ds.Item item27 = fPHeapMax17.max();
        ds.Item item28 = fPHeapMax17.max();
        fPHeapMax17.constroi();
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMax1.aumentaChave(0, (java.lang.Object) fPHeapMax17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertNull(item5);
        org.junit.Assert.assertNull(item8);
        org.junit.Assert.assertNull(item10);
        org.junit.Assert.assertNotNull(itemArray19);
        org.junit.Assert.assertNull(item21);
        org.junit.Assert.assertNull(item24);
        org.junit.Assert.assertNull(item26);
        org.junit.Assert.assertNull(item27);
        org.junit.Assert.assertNull(item28);
    }

    @Test
    public void test108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test108");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) ' ');
        fPHeapMax1.imprime();
        fPHeapMax1.imprime();
        ds.FPHeapMax fPHeapMax6 = new ds.FPHeapMax((int) (byte) 1);
        ds.FPHeapMax fPHeapMax8 = new ds.FPHeapMax((int) (byte) 1);
        ds.Item item9 = null;
        ds.Item[] itemArray10 = new ds.Item[] { item9 };
        fPHeapMax8.copia(itemArray10);
        fPHeapMax6.copia(itemArray10);
        fPHeapMax6.imprime();
        ds.FPHeapMax fPHeapMax15 = new ds.FPHeapMax((int) (byte) 1);
        ds.Item item16 = null;
        ds.Item[] itemArray17 = new ds.Item[] { item16 };
        fPHeapMax15.copia(itemArray17);
        ds.Item item19 = fPHeapMax15.max();
        ds.FPHeapMax fPHeapMax21 = new ds.FPHeapMax((int) (byte) 1);
        ds.FPHeapMax fPHeapMax23 = new ds.FPHeapMax((int) (byte) 1);
        ds.Item item24 = null;
        ds.Item[] itemArray25 = new ds.Item[] { item24 };
        fPHeapMax23.copia(itemArray25);
        fPHeapMax21.copia(itemArray25);
        fPHeapMax15.copia(itemArray25);
        fPHeapMax6.copia(itemArray25);
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMax1.aumentaChave((int) (short) 1, (java.lang.Object) fPHeapMax6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray10);
        org.junit.Assert.assertNotNull(itemArray17);
        org.junit.Assert.assertNull(item19);
        org.junit.Assert.assertNotNull(itemArray25);
    }

    @Test
    public void test109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test109");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (byte) 1);
        ds.Item item2 = null;
        ds.Item[] itemArray3 = new ds.Item[] { item2 };
        fPHeapMax1.copia(itemArray3);
        ds.Item item5 = fPHeapMax1.max();
        fPHeapMax1.constroi();
        fPHeapMax1.constroi();
        ds.Item item8 = fPHeapMax1.max();
        fPHeapMax1.constroi();
        ds.Item item10 = fPHeapMax1.max();
        fPHeapMax1.constroi();
        fPHeapMax1.imprime();
        ds.FPHeapMax fPHeapMax14 = new ds.FPHeapMax((int) (byte) 1);
        ds.Item item15 = null;
        ds.Item[] itemArray16 = new ds.Item[] { item15 };
        fPHeapMax14.copia(itemArray16);
        fPHeapMax1.copia(itemArray16);
        ds.Item item19 = null;
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMax1.insere(item19);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertNull(item5);
        org.junit.Assert.assertNull(item8);
        org.junit.Assert.assertNull(item10);
        org.junit.Assert.assertNotNull(itemArray16);
    }

    @Test
    public void test110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test110");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax(1);
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
    public void test111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test111");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (short) 1);
        java.lang.Class<?> wildcardClass2 = fPHeapMax1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test112");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) ' ');
        fPHeapMax1.refaz((int) (short) 1, (int) (short) 1);
        ds.FPHeapMax fPHeapMax7 = new ds.FPHeapMax((int) (byte) 1);
        ds.Item item8 = null;
        ds.Item[] itemArray9 = new ds.Item[] { item8 };
        fPHeapMax7.copia(itemArray9);
        ds.Item item11 = fPHeapMax7.max();
        fPHeapMax7.constroi();
        fPHeapMax7.constroi();
        ds.Item item14 = fPHeapMax7.max();
        fPHeapMax7.imprime();
        fPHeapMax7.constroi();
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMax1.aumentaChave(100, (java.lang.Object) fPHeapMax7);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 100");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray9);
        org.junit.Assert.assertNull(item11);
        org.junit.Assert.assertNull(item14);
    }

    @Test
    public void test113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test113");
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
    public void test114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test114");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (byte) 1);
        ds.Item item2 = null;
        ds.Item[] itemArray3 = new ds.Item[] { item2 };
        fPHeapMax1.copia(itemArray3);
        ds.Item item5 = fPHeapMax1.max();
        fPHeapMax1.imprime();
        // The following exception was thrown during execution in test generation
        try {
            ds.Item item7 = fPHeapMax1.retiraMax();
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: heap vazio");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertNull(item5);
    }

    @Test
    public void test115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test115");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (byte) 1);
        ds.Item item2 = null;
        ds.Item[] itemArray3 = new ds.Item[] { item2 };
        fPHeapMax1.copia(itemArray3);
        ds.Item item5 = fPHeapMax1.max();
        fPHeapMax1.constroi();
        fPHeapMax1.constroi();
        ds.Item item8 = fPHeapMax1.max();
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
        org.junit.Assert.assertNull(item8);
    }

    @Test
    public void test116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test116");
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
    public void test117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test117");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) ' ');
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
    public void test118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test118");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (byte) 1);
        ds.Item item2 = null;
        ds.Item[] itemArray3 = new ds.Item[] { item2 };
        fPHeapMax1.copia(itemArray3);
        ds.Item item5 = fPHeapMax1.max();
        fPHeapMax1.constroi();
        fPHeapMax1.constroi();
        ds.Item item8 = fPHeapMax1.max();
        fPHeapMax1.constroi();
        ds.Item item10 = fPHeapMax1.max();
        fPHeapMax1.imprime();
        fPHeapMax1.constroi();
        java.lang.Class<?> wildcardClass13 = fPHeapMax1.getClass();
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertNull(item5);
        org.junit.Assert.assertNull(item8);
        org.junit.Assert.assertNull(item10);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test119");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (byte) 1);
        ds.Item item2 = fPHeapMax1.max();
        fPHeapMax1.imprime();
        fPHeapMax1.constroi();
        fPHeapMax1.constroi();
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMax1.refaz((int) (short) 10, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 10");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(item2);
    }

    @Test
    public void test120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test120");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (byte) 1);
        ds.Item item2 = null;
        ds.Item[] itemArray3 = new ds.Item[] { item2 };
        fPHeapMax1.copia(itemArray3);
        ds.Item item5 = fPHeapMax1.max();
        fPHeapMax1.constroi();
        fPHeapMax1.constroi();
        ds.Item item8 = fPHeapMax1.max();
        fPHeapMax1.constroi();
        ds.Item item10 = fPHeapMax1.max();
        ds.Item item11 = fPHeapMax1.max();
        fPHeapMax1.constroi();
        java.lang.Class<?> wildcardClass13 = fPHeapMax1.getClass();
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertNull(item5);
        org.junit.Assert.assertNull(item8);
        org.junit.Assert.assertNull(item10);
        org.junit.Assert.assertNull(item11);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test121");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (byte) 1);
        ds.FPHeapMax fPHeapMax3 = new ds.FPHeapMax((int) (byte) 1);
        ds.Item item4 = null;
        ds.Item[] itemArray5 = new ds.Item[] { item4 };
        fPHeapMax3.copia(itemArray5);
        fPHeapMax1.copia(itemArray5);
        ds.Item item8 = fPHeapMax1.max();
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMax1.refaz(0, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray5);
        org.junit.Assert.assertNull(item8);
    }

    @Test
    public void test122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test122");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (byte) 1);
        ds.Item item2 = fPHeapMax1.max();
        fPHeapMax1.imprime();
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
    public void test123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test123");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (byte) 1);
        ds.Item item2 = null;
        ds.Item[] itemArray3 = new ds.Item[] { item2 };
        fPHeapMax1.copia(itemArray3);
        ds.Item item5 = fPHeapMax1.max();
        fPHeapMax1.constroi();
        fPHeapMax1.constroi();
        ds.Item item8 = fPHeapMax1.max();
        fPHeapMax1.constroi();
        fPHeapMax1.constroi();
        ds.FPHeapMax fPHeapMax12 = new ds.FPHeapMax((int) (byte) 1);
        ds.FPHeapMax fPHeapMax14 = new ds.FPHeapMax((int) (byte) 1);
        ds.Item item15 = null;
        ds.Item[] itemArray16 = new ds.Item[] { item15 };
        fPHeapMax14.copia(itemArray16);
        fPHeapMax12.copia(itemArray16);
        fPHeapMax12.imprime();
        ds.FPHeapMax fPHeapMax21 = new ds.FPHeapMax((int) (byte) 1);
        ds.Item item22 = null;
        ds.Item[] itemArray23 = new ds.Item[] { item22 };
        fPHeapMax21.copia(itemArray23);
        ds.Item item25 = fPHeapMax21.max();
        ds.FPHeapMax fPHeapMax27 = new ds.FPHeapMax((int) (byte) 1);
        ds.FPHeapMax fPHeapMax29 = new ds.FPHeapMax((int) (byte) 1);
        ds.Item item30 = null;
        ds.Item[] itemArray31 = new ds.Item[] { item30 };
        fPHeapMax29.copia(itemArray31);
        fPHeapMax27.copia(itemArray31);
        fPHeapMax21.copia(itemArray31);
        fPHeapMax12.copia(itemArray31);
        fPHeapMax1.copia(itemArray31);
        // The following exception was thrown during execution in test generation
        try {
            ds.Item item37 = fPHeapMax1.retiraMax();
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: heap vazio");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertNull(item5);
        org.junit.Assert.assertNull(item8);
        org.junit.Assert.assertNotNull(itemArray16);
        org.junit.Assert.assertNotNull(itemArray23);
        org.junit.Assert.assertNull(item25);
        org.junit.Assert.assertNotNull(itemArray31);
    }

    @Test
    public void test124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test124");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (byte) 1);
        ds.Item item2 = null;
        ds.Item[] itemArray3 = new ds.Item[] { item2 };
        fPHeapMax1.copia(itemArray3);
        ds.Item item5 = fPHeapMax1.max();
        fPHeapMax1.constroi();
        fPHeapMax1.constroi();
        ds.Item item8 = fPHeapMax1.max();
        fPHeapMax1.constroi();
        ds.Item item10 = fPHeapMax1.max();
        fPHeapMax1.imprime();
        fPHeapMax1.imprime();
        ds.Item item13 = null;
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMax1.insere(item13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertNull(item5);
        org.junit.Assert.assertNull(item8);
        org.junit.Assert.assertNull(item10);
    }

    @Test
    public void test125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test125");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (byte) 1);
        ds.Item item2 = null;
        ds.Item[] itemArray3 = new ds.Item[] { item2 };
        fPHeapMax1.copia(itemArray3);
        ds.Item item5 = fPHeapMax1.max();
        fPHeapMax1.constroi();
        fPHeapMax1.constroi();
        ds.Item item8 = fPHeapMax1.max();
        fPHeapMax1.constroi();
        ds.Item item10 = fPHeapMax1.max();
        fPHeapMax1.constroi();
        fPHeapMax1.refaz((int) (byte) 1, (int) (byte) -1);
        ds.FPHeapMax fPHeapMax16 = new ds.FPHeapMax((int) (short) 10);
        ds.FPHeapMax fPHeapMax18 = new ds.FPHeapMax((int) (byte) 1);
        ds.Item item19 = null;
        ds.Item[] itemArray20 = new ds.Item[] { item19 };
        fPHeapMax18.copia(itemArray20);
        ds.Item item22 = fPHeapMax18.max();
        fPHeapMax18.constroi();
        fPHeapMax18.constroi();
        ds.Item item25 = fPHeapMax18.max();
        fPHeapMax18.constroi();
        ds.Item item27 = fPHeapMax18.max();
        fPHeapMax18.constroi();
        fPHeapMax18.imprime();
        ds.FPHeapMax fPHeapMax31 = new ds.FPHeapMax((int) (byte) 1);
        ds.Item item32 = null;
        ds.Item[] itemArray33 = new ds.Item[] { item32 };
        fPHeapMax31.copia(itemArray33);
        fPHeapMax18.copia(itemArray33);
        fPHeapMax16.copia(itemArray33);
        fPHeapMax1.copia(itemArray33);
        java.lang.Class<?> wildcardClass38 = itemArray33.getClass();
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertNull(item5);
        org.junit.Assert.assertNull(item8);
        org.junit.Assert.assertNull(item10);
        org.junit.Assert.assertNotNull(itemArray20);
        org.junit.Assert.assertNull(item22);
        org.junit.Assert.assertNull(item25);
        org.junit.Assert.assertNull(item27);
        org.junit.Assert.assertNotNull(itemArray33);
        org.junit.Assert.assertNotNull(wildcardClass38);
    }

    @Test
    public void test126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test126");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) ' ');
        fPHeapMax1.refaz((int) (short) 1, (int) (short) 1);
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
    public void test127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test127");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (byte) 1);
        ds.Item item2 = null;
        ds.Item[] itemArray3 = new ds.Item[] { item2 };
        fPHeapMax1.copia(itemArray3);
        ds.Item item5 = fPHeapMax1.max();
        fPHeapMax1.constroi();
        fPHeapMax1.constroi();
        ds.Item item8 = fPHeapMax1.max();
        fPHeapMax1.constroi();
        ds.Item item10 = fPHeapMax1.max();
        ds.FPHeapMax fPHeapMax12 = new ds.FPHeapMax((int) ' ');
        fPHeapMax12.refaz((int) (short) 1, (int) (short) 1);
        ds.Item item16 = fPHeapMax12.max();
        ds.FPHeapMax fPHeapMax18 = new ds.FPHeapMax((int) (byte) 1);
        ds.Item item19 = null;
        ds.Item[] itemArray20 = new ds.Item[] { item19 };
        fPHeapMax18.copia(itemArray20);
        fPHeapMax12.copia(itemArray20);
        fPHeapMax12.constroi();
        ds.FPHeapMax fPHeapMax25 = new ds.FPHeapMax((int) (byte) 1);
        ds.Item item26 = null;
        ds.Item[] itemArray27 = new ds.Item[] { item26 };
        fPHeapMax25.copia(itemArray27);
        fPHeapMax12.copia(itemArray27);
        fPHeapMax1.copia(itemArray27);
        fPHeapMax1.imprime();
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertNull(item5);
        org.junit.Assert.assertNull(item8);
        org.junit.Assert.assertNull(item10);
        org.junit.Assert.assertNull(item16);
        org.junit.Assert.assertNotNull(itemArray20);
        org.junit.Assert.assertNotNull(itemArray27);
    }

    @Test
    public void test128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test128");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) ' ');
        fPHeapMax1.imprime();
        ds.FPHeapMax fPHeapMax4 = new ds.FPHeapMax((int) (byte) 1);
        ds.FPHeapMax fPHeapMax6 = new ds.FPHeapMax((int) (byte) 1);
        ds.Item item7 = null;
        ds.Item[] itemArray8 = new ds.Item[] { item7 };
        fPHeapMax6.copia(itemArray8);
        fPHeapMax4.copia(itemArray8);
        fPHeapMax4.imprime();
        ds.FPHeapMax fPHeapMax13 = new ds.FPHeapMax((int) (byte) 1);
        ds.Item item14 = null;
        ds.Item[] itemArray15 = new ds.Item[] { item14 };
        fPHeapMax13.copia(itemArray15);
        ds.Item item17 = fPHeapMax13.max();
        ds.FPHeapMax fPHeapMax19 = new ds.FPHeapMax((int) (byte) 1);
        ds.FPHeapMax fPHeapMax21 = new ds.FPHeapMax((int) (byte) 1);
        ds.Item item22 = null;
        ds.Item[] itemArray23 = new ds.Item[] { item22 };
        fPHeapMax21.copia(itemArray23);
        fPHeapMax19.copia(itemArray23);
        fPHeapMax13.copia(itemArray23);
        fPHeapMax4.copia(itemArray23);
        fPHeapMax1.copia(itemArray23);
        java.lang.Class<?> wildcardClass29 = itemArray23.getClass();
        org.junit.Assert.assertNotNull(itemArray8);
        org.junit.Assert.assertNotNull(itemArray15);
        org.junit.Assert.assertNull(item17);
        org.junit.Assert.assertNotNull(itemArray23);
        org.junit.Assert.assertNotNull(wildcardClass29);
    }

    @Test
    public void test129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test129");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (byte) 100);
        fPHeapMax1.imprime();
        java.lang.Object obj4 = null;
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMax1.aumentaChave((int) (short) -1, obj4);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test130");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (byte) 1);
        ds.Item item2 = null;
        ds.Item[] itemArray3 = new ds.Item[] { item2 };
        fPHeapMax1.copia(itemArray3);
        ds.Item item5 = fPHeapMax1.max();
        fPHeapMax1.constroi();
        fPHeapMax1.constroi();
        ds.Item item8 = fPHeapMax1.max();
        fPHeapMax1.constroi();
        ds.Item item10 = fPHeapMax1.max();
        fPHeapMax1.imprime();
        fPHeapMax1.constroi();
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMax1.refaz(1, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 2");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertNull(item5);
        org.junit.Assert.assertNull(item8);
        org.junit.Assert.assertNull(item10);
    }

    @Test
    public void test131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test131");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax(0);
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMax1.refaz(0, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test132");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) ' ');
        fPHeapMax1.refaz((int) (short) 1, (int) (short) 1);
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
    public void test133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test133");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (byte) 10);
        fPHeapMax1.constroi();
        fPHeapMax1.constroi();
        ds.FPHeapMax fPHeapMax6 = new ds.FPHeapMax((int) (byte) 1);
        ds.Item item7 = null;
        ds.Item[] itemArray8 = new ds.Item[] { item7 };
        fPHeapMax6.copia(itemArray8);
        ds.Item item10 = fPHeapMax6.max();
        fPHeapMax6.constroi();
        fPHeapMax6.constroi();
        ds.Item item13 = fPHeapMax6.max();
        fPHeapMax6.constroi();
        ds.Item item15 = fPHeapMax6.max();
        fPHeapMax6.constroi();
        fPHeapMax6.imprime();
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMax1.aumentaChave((int) (byte) 10, (java.lang.Object) fPHeapMax6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray8);
        org.junit.Assert.assertNull(item10);
        org.junit.Assert.assertNull(item13);
        org.junit.Assert.assertNull(item15);
    }

    @Test
    public void test134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test134");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (byte) 1);
        ds.Item item2 = fPHeapMax1.max();
        fPHeapMax1.imprime();
        fPHeapMax1.constroi();
        fPHeapMax1.refaz((int) (byte) 1, 0);
        ds.FPHeapMax fPHeapMax9 = new ds.FPHeapMax((int) (short) 1);
        ds.FPHeapMax fPHeapMax11 = new ds.FPHeapMax(0);
        ds.FPHeapMax fPHeapMax13 = new ds.FPHeapMax((int) (byte) 1);
        ds.FPHeapMax fPHeapMax15 = new ds.FPHeapMax((int) (byte) 1);
        ds.Item item16 = null;
        ds.Item[] itemArray17 = new ds.Item[] { item16 };
        fPHeapMax15.copia(itemArray17);
        fPHeapMax13.copia(itemArray17);
        fPHeapMax11.copia(itemArray17);
        fPHeapMax9.copia(itemArray17);
        fPHeapMax9.imprime();
        ds.FPHeapMax fPHeapMax24 = new ds.FPHeapMax((int) ' ');
        fPHeapMax24.refaz((int) (short) 1, (int) (short) 1);
        ds.Item item28 = fPHeapMax24.max();
        ds.FPHeapMax fPHeapMax30 = new ds.FPHeapMax((int) (byte) 1);
        ds.Item item31 = null;
        ds.Item[] itemArray32 = new ds.Item[] { item31 };
        fPHeapMax30.copia(itemArray32);
        fPHeapMax24.copia(itemArray32);
        fPHeapMax9.copia(itemArray32);
        fPHeapMax1.copia(itemArray32);
        java.lang.Class<?> wildcardClass37 = fPHeapMax1.getClass();
        org.junit.Assert.assertNull(item2);
        org.junit.Assert.assertNotNull(itemArray17);
        org.junit.Assert.assertNull(item28);
        org.junit.Assert.assertNotNull(itemArray32);
        org.junit.Assert.assertNotNull(wildcardClass37);
    }

    @Test
    public void test135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test135");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (byte) 1);
        ds.Item item2 = null;
        ds.Item[] itemArray3 = new ds.Item[] { item2 };
        fPHeapMax1.copia(itemArray3);
        ds.Item item5 = fPHeapMax1.max();
        fPHeapMax1.constroi();
        fPHeapMax1.constroi();
        ds.Item item8 = fPHeapMax1.max();
        fPHeapMax1.constroi();
        ds.Item item10 = fPHeapMax1.max();
        ds.Item item11 = fPHeapMax1.max();
        ds.Item item12 = fPHeapMax1.max();
        fPHeapMax1.imprime();
        fPHeapMax1.constroi();
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertNull(item5);
        org.junit.Assert.assertNull(item8);
        org.junit.Assert.assertNull(item10);
        org.junit.Assert.assertNull(item11);
        org.junit.Assert.assertNull(item12);
    }

    @Test
    public void test136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test136");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (byte) 1);
        ds.Item item2 = null;
        ds.Item[] itemArray3 = new ds.Item[] { item2 };
        fPHeapMax1.copia(itemArray3);
        ds.Item item5 = fPHeapMax1.max();
        fPHeapMax1.constroi();
        fPHeapMax1.constroi();
        ds.Item item8 = fPHeapMax1.max();
        fPHeapMax1.constroi();
        ds.Item item10 = fPHeapMax1.max();
        fPHeapMax1.constroi();
        fPHeapMax1.imprime();
        ds.Item item13 = null;
        ds.Item[] itemArray14 = new ds.Item[] { item13 };
        fPHeapMax1.copia(itemArray14);
        java.lang.Class<?> wildcardClass16 = itemArray14.getClass();
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertNull(item5);
        org.junit.Assert.assertNull(item8);
        org.junit.Assert.assertNull(item10);
        org.junit.Assert.assertNotNull(itemArray14);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test137");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (byte) 1);
        ds.Item item2 = null;
        ds.Item[] itemArray3 = new ds.Item[] { item2 };
        fPHeapMax1.copia(itemArray3);
        ds.Item item5 = fPHeapMax1.max();
        fPHeapMax1.constroi();
        fPHeapMax1.constroi();
        ds.Item item8 = fPHeapMax1.max();
        fPHeapMax1.constroi();
        fPHeapMax1.refaz(0, (int) (short) -1);
        fPHeapMax1.imprime();
        ds.FPHeapMax fPHeapMax16 = new ds.FPHeapMax((int) (byte) 1);
        ds.Item item17 = fPHeapMax16.max();
        fPHeapMax16.imprime();
        fPHeapMax16.constroi();
        fPHeapMax16.refaz((int) (byte) 1, 0);
        ds.FPHeapMax fPHeapMax24 = new ds.FPHeapMax(0);
        ds.FPHeapMax fPHeapMax26 = new ds.FPHeapMax((int) (byte) 1);
        ds.FPHeapMax fPHeapMax28 = new ds.FPHeapMax((int) (byte) 1);
        ds.Item item29 = null;
        ds.Item[] itemArray30 = new ds.Item[] { item29 };
        fPHeapMax28.copia(itemArray30);
        fPHeapMax26.copia(itemArray30);
        fPHeapMax24.copia(itemArray30);
        fPHeapMax16.copia(itemArray30);
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMax1.aumentaChave(100, (java.lang.Object) itemArray30);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 100");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertNull(item5);
        org.junit.Assert.assertNull(item8);
        org.junit.Assert.assertNull(item17);
        org.junit.Assert.assertNotNull(itemArray30);
    }

    @Test
    public void test138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test138");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (byte) 1);
        ds.Item item2 = null;
        ds.Item[] itemArray3 = new ds.Item[] { item2 };
        fPHeapMax1.copia(itemArray3);
        ds.Item item5 = fPHeapMax1.max();
        fPHeapMax1.constroi();
        fPHeapMax1.constroi();
        ds.Item item8 = fPHeapMax1.max();
        fPHeapMax1.constroi();
        ds.Item item10 = fPHeapMax1.max();
        fPHeapMax1.constroi();
        fPHeapMax1.refaz((int) (byte) 1, (int) (byte) -1);
        ds.FPHeapMax fPHeapMax16 = new ds.FPHeapMax((int) (short) 10);
        ds.FPHeapMax fPHeapMax18 = new ds.FPHeapMax((int) (byte) 1);
        ds.Item item19 = null;
        ds.Item[] itemArray20 = new ds.Item[] { item19 };
        fPHeapMax18.copia(itemArray20);
        ds.Item item22 = fPHeapMax18.max();
        fPHeapMax18.constroi();
        fPHeapMax18.constroi();
        ds.Item item25 = fPHeapMax18.max();
        fPHeapMax18.constroi();
        ds.Item item27 = fPHeapMax18.max();
        fPHeapMax18.constroi();
        fPHeapMax18.imprime();
        ds.FPHeapMax fPHeapMax31 = new ds.FPHeapMax((int) (byte) 1);
        ds.Item item32 = null;
        ds.Item[] itemArray33 = new ds.Item[] { item32 };
        fPHeapMax31.copia(itemArray33);
        fPHeapMax18.copia(itemArray33);
        fPHeapMax16.copia(itemArray33);
        fPHeapMax1.copia(itemArray33);
        ds.Item item38 = null;
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMax1.insere(item38);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertNull(item5);
        org.junit.Assert.assertNull(item8);
        org.junit.Assert.assertNull(item10);
        org.junit.Assert.assertNotNull(itemArray20);
        org.junit.Assert.assertNull(item22);
        org.junit.Assert.assertNull(item25);
        org.junit.Assert.assertNull(item27);
        org.junit.Assert.assertNotNull(itemArray33);
    }

    @Test
    public void test139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test139");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (byte) 1);
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
    public void test140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test140");
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
    public void test141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test141");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax(100);
        ds.Item item2 = fPHeapMax1.max();
        fPHeapMax1.refaz((int) 'a', (int) ' ');
        org.junit.Assert.assertNull(item2);
    }

    @Test
    public void test142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test142");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (byte) 1);
        ds.Item item2 = null;
        ds.Item[] itemArray3 = new ds.Item[] { item2 };
        fPHeapMax1.copia(itemArray3);
        ds.Item item5 = fPHeapMax1.max();
        fPHeapMax1.constroi();
        fPHeapMax1.constroi();
        ds.Item item8 = fPHeapMax1.max();
        fPHeapMax1.constroi();
        ds.Item item10 = fPHeapMax1.max();
        ds.Item item11 = fPHeapMax1.max();
        ds.Item item12 = fPHeapMax1.max();
        // The following exception was thrown during execution in test generation
        try {
            ds.Item item13 = fPHeapMax1.retiraMax();
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: heap vazio");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertNull(item5);
        org.junit.Assert.assertNull(item8);
        org.junit.Assert.assertNull(item10);
        org.junit.Assert.assertNull(item11);
        org.junit.Assert.assertNull(item12);
    }

    @Test
    public void test143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test143");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax(100);
        ds.FPHeapMax fPHeapMax4 = new ds.FPHeapMax((int) (byte) 1);
        ds.Item item5 = null;
        ds.Item[] itemArray6 = new ds.Item[] { item5 };
        fPHeapMax4.copia(itemArray6);
        ds.Item item8 = fPHeapMax4.max();
        ds.Item item9 = fPHeapMax4.max();
        fPHeapMax4.constroi();
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMax1.aumentaChave((-1), (java.lang.Object) fPHeapMax4);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray6);
        org.junit.Assert.assertNull(item8);
        org.junit.Assert.assertNull(item9);
    }

    @Test
    public void test144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test144");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (byte) 1);
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
    public void test145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test145");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (byte) 1);
        ds.Item item2 = null;
        ds.Item[] itemArray3 = new ds.Item[] { item2 };
        fPHeapMax1.copia(itemArray3);
        ds.Item item5 = fPHeapMax1.max();
        fPHeapMax1.constroi();
        fPHeapMax1.constroi();
        ds.Item item8 = fPHeapMax1.max();
        fPHeapMax1.constroi();
        fPHeapMax1.constroi();
        fPHeapMax1.imprime();
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMax1.refaz((int) (byte) 10, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 10");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertNull(item5);
        org.junit.Assert.assertNull(item8);
    }

    @Test
    public void test146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test146");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax(10);
        java.lang.Class<?> wildcardClass2 = fPHeapMax1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test147");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (byte) 1);
        ds.Item item2 = fPHeapMax1.max();
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
        org.junit.Assert.assertNull(item2);
    }

    @Test
    public void test148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test148");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (byte) 1);
        ds.Item item2 = null;
        ds.Item[] itemArray3 = new ds.Item[] { item2 };
        fPHeapMax1.copia(itemArray3);
        ds.Item item5 = fPHeapMax1.max();
        fPHeapMax1.constroi();
        fPHeapMax1.constroi();
        ds.Item item8 = fPHeapMax1.max();
        fPHeapMax1.constroi();
        ds.Item item10 = fPHeapMax1.max();
        ds.Item item11 = fPHeapMax1.max();
        ds.Item item12 = fPHeapMax1.max();
        fPHeapMax1.imprime();
        java.lang.Class<?> wildcardClass14 = fPHeapMax1.getClass();
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertNull(item5);
        org.junit.Assert.assertNull(item8);
        org.junit.Assert.assertNull(item10);
        org.junit.Assert.assertNull(item11);
        org.junit.Assert.assertNull(item12);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test149");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (byte) 1);
        ds.Item item2 = fPHeapMax1.max();
        fPHeapMax1.imprime();
        fPHeapMax1.constroi();
        fPHeapMax1.refaz((int) (byte) 1, 0);
        ds.FPHeapMax fPHeapMax9 = new ds.FPHeapMax((int) (short) 1);
        ds.FPHeapMax fPHeapMax11 = new ds.FPHeapMax(0);
        ds.FPHeapMax fPHeapMax13 = new ds.FPHeapMax((int) (byte) 1);
        ds.FPHeapMax fPHeapMax15 = new ds.FPHeapMax((int) (byte) 1);
        ds.Item item16 = null;
        ds.Item[] itemArray17 = new ds.Item[] { item16 };
        fPHeapMax15.copia(itemArray17);
        fPHeapMax13.copia(itemArray17);
        fPHeapMax11.copia(itemArray17);
        fPHeapMax9.copia(itemArray17);
        fPHeapMax9.imprime();
        ds.FPHeapMax fPHeapMax24 = new ds.FPHeapMax((int) ' ');
        fPHeapMax24.refaz((int) (short) 1, (int) (short) 1);
        ds.Item item28 = fPHeapMax24.max();
        ds.FPHeapMax fPHeapMax30 = new ds.FPHeapMax((int) (byte) 1);
        ds.Item item31 = null;
        ds.Item[] itemArray32 = new ds.Item[] { item31 };
        fPHeapMax30.copia(itemArray32);
        fPHeapMax24.copia(itemArray32);
        fPHeapMax9.copia(itemArray32);
        fPHeapMax1.copia(itemArray32);
        ds.FPHeapMax fPHeapMax39 = new ds.FPHeapMax((int) ' ');
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMax1.aumentaChave((int) (byte) -1, (java.lang.Object) fPHeapMax39);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(item2);
        org.junit.Assert.assertNotNull(itemArray17);
        org.junit.Assert.assertNull(item28);
        org.junit.Assert.assertNotNull(itemArray32);
    }

    @Test
    public void test150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test150");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (byte) 1);
        ds.Item item2 = null;
        ds.Item[] itemArray3 = new ds.Item[] { item2 };
        fPHeapMax1.copia(itemArray3);
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMax1.refaz(10, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 10");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray3);
    }

    @Test
    public void test151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test151");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (byte) 1);
        ds.Item item2 = null;
        ds.Item[] itemArray3 = new ds.Item[] { item2 };
        fPHeapMax1.copia(itemArray3);
        ds.Item item5 = fPHeapMax1.max();
        fPHeapMax1.constroi();
        fPHeapMax1.constroi();
        ds.Item item8 = fPHeapMax1.max();
        fPHeapMax1.constroi();
        ds.Item item10 = fPHeapMax1.max();
        fPHeapMax1.imprime();
        ds.FPHeapMax fPHeapMax14 = new ds.FPHeapMax(100);
        fPHeapMax14.refaz((int) (byte) 100, 100);
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMax1.aumentaChave(0, (java.lang.Object) fPHeapMax14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertNull(item5);
        org.junit.Assert.assertNull(item8);
        org.junit.Assert.assertNull(item10);
    }

    @Test
    public void test152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test152");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (byte) 1);
        ds.Item item2 = null;
        ds.Item[] itemArray3 = new ds.Item[] { item2 };
        fPHeapMax1.copia(itemArray3);
        ds.Item item5 = fPHeapMax1.max();
        ds.FPHeapMax fPHeapMax7 = new ds.FPHeapMax((int) (byte) 1);
        ds.FPHeapMax fPHeapMax9 = new ds.FPHeapMax((int) (byte) 1);
        ds.Item item10 = null;
        ds.Item[] itemArray11 = new ds.Item[] { item10 };
        fPHeapMax9.copia(itemArray11);
        fPHeapMax7.copia(itemArray11);
        fPHeapMax1.copia(itemArray11);
        ds.FPHeapMax fPHeapMax17 = new ds.FPHeapMax((int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMax1.aumentaChave((int) '#', (java.lang.Object) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 35");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertNull(item5);
        org.junit.Assert.assertNotNull(itemArray11);
    }

    @Test
    public void test153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test153");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax(100);
        java.lang.Class<?> wildcardClass2 = fPHeapMax1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test154");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (byte) 1);
        ds.Item item2 = null;
        ds.Item[] itemArray3 = new ds.Item[] { item2 };
        fPHeapMax1.copia(itemArray3);
        ds.Item item5 = fPHeapMax1.max();
        fPHeapMax1.constroi();
        fPHeapMax1.imprime();
        ds.Item item8 = null;
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMax1.insere(item8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertNull(item5);
    }

    @Test
    public void test155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test155");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (byte) 1);
        ds.FPHeapMax fPHeapMax3 = new ds.FPHeapMax((int) (byte) 1);
        ds.Item item4 = null;
        ds.Item[] itemArray5 = new ds.Item[] { item4 };
        fPHeapMax3.copia(itemArray5);
        fPHeapMax1.copia(itemArray5);
        fPHeapMax1.imprime();
        ds.FPHeapMax fPHeapMax11 = new ds.FPHeapMax((int) ' ');
        fPHeapMax11.refaz((int) (short) 1, (int) (short) 1);
        ds.Item item15 = fPHeapMax11.max();
        ds.FPHeapMax fPHeapMax17 = new ds.FPHeapMax((int) (byte) 1);
        ds.Item item18 = null;
        ds.Item[] itemArray19 = new ds.Item[] { item18 };
        fPHeapMax17.copia(itemArray19);
        fPHeapMax11.copia(itemArray19);
        java.lang.Class<?> wildcardClass22 = itemArray19.getClass();
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMax1.aumentaChave(10, (java.lang.Object) wildcardClass22);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 10");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray5);
        org.junit.Assert.assertNull(item15);
        org.junit.Assert.assertNotNull(itemArray19);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test156");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (byte) 0);
        fPHeapMax1.constroi();
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
    public void test157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test157");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (byte) 1);
        ds.Item item2 = null;
        ds.Item[] itemArray3 = new ds.Item[] { item2 };
        fPHeapMax1.copia(itemArray3);
        ds.Item item5 = fPHeapMax1.max();
        fPHeapMax1.constroi();
        fPHeapMax1.constroi();
        ds.Item item8 = fPHeapMax1.max();
        fPHeapMax1.imprime();
        ds.Item item10 = fPHeapMax1.max();
        fPHeapMax1.imprime();
        fPHeapMax1.imprime();
        fPHeapMax1.refaz(0, (-1));
        ds.Item item16 = null;
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMax1.insere(item16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertNull(item5);
        org.junit.Assert.assertNull(item8);
        org.junit.Assert.assertNull(item10);
    }

    @Test
    public void test158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test158");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (byte) 1);
        ds.Item item2 = null;
        ds.Item[] itemArray3 = new ds.Item[] { item2 };
        fPHeapMax1.copia(itemArray3);
        ds.Item item5 = fPHeapMax1.max();
        fPHeapMax1.constroi();
        fPHeapMax1.constroi();
        ds.Item item8 = fPHeapMax1.max();
        fPHeapMax1.constroi();
        ds.Item item10 = fPHeapMax1.max();
        fPHeapMax1.constroi();
        fPHeapMax1.imprime();
        ds.FPHeapMax fPHeapMax14 = new ds.FPHeapMax((int) (byte) 1);
        ds.Item item15 = null;
        ds.Item[] itemArray16 = new ds.Item[] { item15 };
        fPHeapMax14.copia(itemArray16);
        fPHeapMax1.copia(itemArray16);
        fPHeapMax1.constroi();
        java.lang.Object obj21 = null;
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMax1.aumentaChave(100, obj21);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 100");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertNull(item5);
        org.junit.Assert.assertNull(item8);
        org.junit.Assert.assertNull(item10);
        org.junit.Assert.assertNotNull(itemArray16);
    }

    @Test
    public void test159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test159");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax(1);
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
    public void test160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test160");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (byte) 1);
        ds.Item item2 = null;
        ds.Item[] itemArray3 = new ds.Item[] { item2 };
        fPHeapMax1.copia(itemArray3);
        ds.Item item5 = fPHeapMax1.max();
        fPHeapMax1.constroi();
        fPHeapMax1.constroi();
        ds.Item item8 = fPHeapMax1.max();
        fPHeapMax1.constroi();
        fPHeapMax1.imprime();
        ds.Item item11 = fPHeapMax1.max();
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
        org.junit.Assert.assertNull(item8);
        org.junit.Assert.assertNull(item11);
    }

    @Test
    public void test161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test161");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (byte) 1);
        ds.Item item2 = null;
        ds.Item[] itemArray3 = new ds.Item[] { item2 };
        fPHeapMax1.copia(itemArray3);
        ds.Item item5 = fPHeapMax1.max();
        fPHeapMax1.constroi();
        fPHeapMax1.constroi();
        ds.Item item8 = fPHeapMax1.max();
        fPHeapMax1.constroi();
        ds.Item item10 = fPHeapMax1.max();
        fPHeapMax1.constroi();
        fPHeapMax1.imprime();
        ds.Item item13 = null;
        ds.Item[] itemArray14 = new ds.Item[] { item13 };
        fPHeapMax1.copia(itemArray14);
        fPHeapMax1.imprime();
        ds.FPHeapMax fPHeapMax18 = new ds.FPHeapMax((int) ' ');
        fPHeapMax18.imprime();
        ds.FPHeapMax fPHeapMax21 = new ds.FPHeapMax((int) (byte) 1);
        ds.FPHeapMax fPHeapMax23 = new ds.FPHeapMax((int) (byte) 1);
        ds.Item item24 = null;
        ds.Item[] itemArray25 = new ds.Item[] { item24 };
        fPHeapMax23.copia(itemArray25);
        fPHeapMax21.copia(itemArray25);
        fPHeapMax21.imprime();
        ds.FPHeapMax fPHeapMax30 = new ds.FPHeapMax((int) (byte) 1);
        ds.Item item31 = null;
        ds.Item[] itemArray32 = new ds.Item[] { item31 };
        fPHeapMax30.copia(itemArray32);
        ds.Item item34 = fPHeapMax30.max();
        ds.FPHeapMax fPHeapMax36 = new ds.FPHeapMax((int) (byte) 1);
        ds.FPHeapMax fPHeapMax38 = new ds.FPHeapMax((int) (byte) 1);
        ds.Item item39 = null;
        ds.Item[] itemArray40 = new ds.Item[] { item39 };
        fPHeapMax38.copia(itemArray40);
        fPHeapMax36.copia(itemArray40);
        fPHeapMax30.copia(itemArray40);
        fPHeapMax21.copia(itemArray40);
        fPHeapMax18.copia(itemArray40);
        ds.FPHeapMax fPHeapMax47 = new ds.FPHeapMax((int) (byte) 1);
        ds.Item item48 = null;
        ds.Item[] itemArray49 = new ds.Item[] { item48 };
        fPHeapMax47.copia(itemArray49);
        ds.Item item51 = fPHeapMax47.max();
        fPHeapMax47.constroi();
        fPHeapMax47.constroi();
        ds.Item item54 = fPHeapMax47.max();
        fPHeapMax47.constroi();
        ds.Item item56 = fPHeapMax47.max();
        ds.Item item57 = fPHeapMax47.max();
        ds.Item item58 = fPHeapMax47.max();
        fPHeapMax47.imprime();
        ds.FPHeapMax fPHeapMax61 = new ds.FPHeapMax((int) (byte) 1);
        ds.Item item62 = fPHeapMax61.max();
        fPHeapMax61.imprime();
        fPHeapMax61.constroi();
        fPHeapMax61.refaz((int) (byte) 1, 0);
        ds.FPHeapMax fPHeapMax69 = new ds.FPHeapMax(0);
        ds.FPHeapMax fPHeapMax71 = new ds.FPHeapMax((int) (byte) 1);
        ds.FPHeapMax fPHeapMax73 = new ds.FPHeapMax((int) (byte) 1);
        ds.Item item74 = null;
        ds.Item[] itemArray75 = new ds.Item[] { item74 };
        fPHeapMax73.copia(itemArray75);
        fPHeapMax71.copia(itemArray75);
        fPHeapMax69.copia(itemArray75);
        fPHeapMax61.copia(itemArray75);
        fPHeapMax47.copia(itemArray75);
        fPHeapMax18.copia(itemArray75);
        fPHeapMax1.copia(itemArray75);
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertNull(item5);
        org.junit.Assert.assertNull(item8);
        org.junit.Assert.assertNull(item10);
        org.junit.Assert.assertNotNull(itemArray14);
        org.junit.Assert.assertNotNull(itemArray25);
        org.junit.Assert.assertNotNull(itemArray32);
        org.junit.Assert.assertNull(item34);
        org.junit.Assert.assertNotNull(itemArray40);
        org.junit.Assert.assertNotNull(itemArray49);
        org.junit.Assert.assertNull(item51);
        org.junit.Assert.assertNull(item54);
        org.junit.Assert.assertNull(item56);
        org.junit.Assert.assertNull(item57);
        org.junit.Assert.assertNull(item58);
        org.junit.Assert.assertNull(item62);
        org.junit.Assert.assertNotNull(itemArray75);
    }

    @Test
    public void test162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test162");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (byte) 1);
        ds.Item item2 = null;
        ds.Item[] itemArray3 = new ds.Item[] { item2 };
        fPHeapMax1.copia(itemArray3);
        ds.Item item5 = fPHeapMax1.max();
        ds.Item item6 = fPHeapMax1.max();
        fPHeapMax1.constroi();
        ds.FPHeapMax fPHeapMax9 = new ds.FPHeapMax((int) (byte) 1);
        ds.Item item10 = null;
        ds.Item[] itemArray11 = new ds.Item[] { item10 };
        fPHeapMax9.copia(itemArray11);
        ds.Item item13 = fPHeapMax9.max();
        fPHeapMax9.constroi();
        fPHeapMax9.constroi();
        ds.Item item16 = fPHeapMax9.max();
        fPHeapMax9.constroi();
        ds.Item item18 = fPHeapMax9.max();
        fPHeapMax9.imprime();
        ds.FPHeapMax fPHeapMax21 = new ds.FPHeapMax((int) (byte) 1);
        ds.Item item22 = null;
        ds.Item[] itemArray23 = new ds.Item[] { item22 };
        fPHeapMax21.copia(itemArray23);
        ds.Item item25 = fPHeapMax21.max();
        ds.FPHeapMax fPHeapMax27 = new ds.FPHeapMax((int) (byte) 1);
        ds.FPHeapMax fPHeapMax29 = new ds.FPHeapMax((int) (byte) 1);
        ds.Item item30 = null;
        ds.Item[] itemArray31 = new ds.Item[] { item30 };
        fPHeapMax29.copia(itemArray31);
        fPHeapMax27.copia(itemArray31);
        fPHeapMax21.copia(itemArray31);
        fPHeapMax9.copia(itemArray31);
        fPHeapMax1.copia(itemArray31);
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
        org.junit.Assert.assertNotNull(itemArray11);
        org.junit.Assert.assertNull(item13);
        org.junit.Assert.assertNull(item16);
        org.junit.Assert.assertNull(item18);
        org.junit.Assert.assertNotNull(itemArray23);
        org.junit.Assert.assertNull(item25);
        org.junit.Assert.assertNotNull(itemArray31);
    }

    @Test
    public void test163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test163");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (byte) 1);
        ds.Item item2 = null;
        ds.Item[] itemArray3 = new ds.Item[] { item2 };
        fPHeapMax1.copia(itemArray3);
        ds.Item item5 = fPHeapMax1.max();
        fPHeapMax1.constroi();
        fPHeapMax1.constroi();
        ds.Item item8 = fPHeapMax1.max();
        fPHeapMax1.constroi();
        fPHeapMax1.constroi();
        ds.FPHeapMax fPHeapMax12 = new ds.FPHeapMax((int) (byte) 1);
        ds.FPHeapMax fPHeapMax14 = new ds.FPHeapMax((int) (byte) 1);
        ds.Item item15 = null;
        ds.Item[] itemArray16 = new ds.Item[] { item15 };
        fPHeapMax14.copia(itemArray16);
        fPHeapMax12.copia(itemArray16);
        fPHeapMax12.imprime();
        ds.FPHeapMax fPHeapMax21 = new ds.FPHeapMax((int) (byte) 1);
        ds.Item item22 = null;
        ds.Item[] itemArray23 = new ds.Item[] { item22 };
        fPHeapMax21.copia(itemArray23);
        ds.Item item25 = fPHeapMax21.max();
        ds.FPHeapMax fPHeapMax27 = new ds.FPHeapMax((int) (byte) 1);
        ds.FPHeapMax fPHeapMax29 = new ds.FPHeapMax((int) (byte) 1);
        ds.Item item30 = null;
        ds.Item[] itemArray31 = new ds.Item[] { item30 };
        fPHeapMax29.copia(itemArray31);
        fPHeapMax27.copia(itemArray31);
        fPHeapMax21.copia(itemArray31);
        fPHeapMax12.copia(itemArray31);
        fPHeapMax1.copia(itemArray31);
        ds.Item item37 = fPHeapMax1.max();
        // The following exception was thrown during execution in test generation
        try {
            ds.Item item38 = fPHeapMax1.retiraMax();
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: heap vazio");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertNull(item5);
        org.junit.Assert.assertNull(item8);
        org.junit.Assert.assertNotNull(itemArray16);
        org.junit.Assert.assertNotNull(itemArray23);
        org.junit.Assert.assertNull(item25);
        org.junit.Assert.assertNotNull(itemArray31);
        org.junit.Assert.assertNull(item37);
    }

    @Test
    public void test164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test164");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (byte) 1);
        ds.Item item2 = null;
        ds.Item[] itemArray3 = new ds.Item[] { item2 };
        fPHeapMax1.copia(itemArray3);
        ds.Item item5 = fPHeapMax1.max();
        fPHeapMax1.constroi();
        fPHeapMax1.constroi();
        ds.Item item8 = fPHeapMax1.max();
        fPHeapMax1.constroi();
        ds.Item item10 = fPHeapMax1.max();
        ds.FPHeapMax fPHeapMax12 = new ds.FPHeapMax((int) (byte) 1);
        ds.Item item13 = null;
        ds.Item[] itemArray14 = new ds.Item[] { item13 };
        fPHeapMax12.copia(itemArray14);
        ds.Item item16 = fPHeapMax12.max();
        ds.FPHeapMax fPHeapMax18 = new ds.FPHeapMax((int) (byte) 1);
        ds.FPHeapMax fPHeapMax20 = new ds.FPHeapMax((int) (byte) 1);
        ds.Item item21 = null;
        ds.Item[] itemArray22 = new ds.Item[] { item21 };
        fPHeapMax20.copia(itemArray22);
        fPHeapMax18.copia(itemArray22);
        fPHeapMax12.copia(itemArray22);
        fPHeapMax1.copia(itemArray22);
        ds.Item item27 = fPHeapMax1.max();
        ds.Item item28 = null;
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMax1.insere(item28);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertNull(item5);
        org.junit.Assert.assertNull(item8);
        org.junit.Assert.assertNull(item10);
        org.junit.Assert.assertNotNull(itemArray14);
        org.junit.Assert.assertNull(item16);
        org.junit.Assert.assertNotNull(itemArray22);
        org.junit.Assert.assertNull(item27);
    }

    @Test
    public void test165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test165");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (byte) 0);
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
    public void test166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test166");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (byte) 1);
        ds.Item item2 = null;
        ds.Item[] itemArray3 = new ds.Item[] { item2 };
        fPHeapMax1.copia(itemArray3);
        ds.Item item5 = fPHeapMax1.max();
        ds.FPHeapMax fPHeapMax7 = new ds.FPHeapMax((int) (byte) 1);
        ds.FPHeapMax fPHeapMax9 = new ds.FPHeapMax((int) (byte) 1);
        ds.Item item10 = null;
        ds.Item[] itemArray11 = new ds.Item[] { item10 };
        fPHeapMax9.copia(itemArray11);
        fPHeapMax7.copia(itemArray11);
        fPHeapMax1.copia(itemArray11);
        java.lang.Class<?> wildcardClass15 = itemArray11.getClass();
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertNull(item5);
        org.junit.Assert.assertNotNull(itemArray11);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test167");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (byte) 1);
        ds.Item item2 = null;
        ds.Item[] itemArray3 = new ds.Item[] { item2 };
        fPHeapMax1.copia(itemArray3);
        ds.Item item5 = fPHeapMax1.max();
        fPHeapMax1.constroi();
        fPHeapMax1.constroi();
        ds.Item item8 = fPHeapMax1.max();
        fPHeapMax1.constroi();
        ds.Item item10 = fPHeapMax1.max();
        fPHeapMax1.imprime();
        fPHeapMax1.imprime();
        ds.Item item13 = fPHeapMax1.max();
        // The following exception was thrown during execution in test generation
        try {
            ds.Item item14 = fPHeapMax1.retiraMax();
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: heap vazio");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertNull(item5);
        org.junit.Assert.assertNull(item8);
        org.junit.Assert.assertNull(item10);
        org.junit.Assert.assertNull(item13);
    }

    @Test
    public void test168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test168");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) 'a');
        ds.Item item2 = fPHeapMax1.max();
        ds.FPHeapMax fPHeapMax5 = new ds.FPHeapMax((int) (byte) 1);
        ds.Item item6 = null;
        ds.Item[] itemArray7 = new ds.Item[] { item6 };
        fPHeapMax5.copia(itemArray7);
        ds.Item item9 = fPHeapMax5.max();
        fPHeapMax5.constroi();
        fPHeapMax5.constroi();
        ds.Item item12 = fPHeapMax5.max();
        fPHeapMax5.constroi();
        ds.Item item14 = fPHeapMax5.max();
        fPHeapMax5.imprime();
        fPHeapMax5.imprime();
        ds.Item item17 = fPHeapMax5.max();
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMax1.aumentaChave((int) (byte) 10, (java.lang.Object) fPHeapMax5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(item2);
        org.junit.Assert.assertNotNull(itemArray7);
        org.junit.Assert.assertNull(item9);
        org.junit.Assert.assertNull(item12);
        org.junit.Assert.assertNull(item14);
        org.junit.Assert.assertNull(item17);
    }

    @Test
    public void test169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test169");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (short) 0);
        java.lang.Class<?> wildcardClass2 = fPHeapMax1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test170");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (byte) 1);
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
    public void test171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test171");
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
    public void test172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test172");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (byte) 1);
        ds.Item item2 = null;
        ds.Item[] itemArray3 = new ds.Item[] { item2 };
        fPHeapMax1.copia(itemArray3);
        ds.Item item5 = fPHeapMax1.max();
        fPHeapMax1.constroi();
        fPHeapMax1.imprime();
        // The following exception was thrown during execution in test generation
        try {
            ds.Item item8 = fPHeapMax1.retiraMax();
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: heap vazio");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertNull(item5);
    }

    @Test
    public void test173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test173");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (byte) 1);
        ds.Item item2 = null;
        ds.Item[] itemArray3 = new ds.Item[] { item2 };
        fPHeapMax1.copia(itemArray3);
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
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertNull(item5);
    }

    @Test
    public void test174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test174");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax(10);
        fPHeapMax1.constroi();
    }

    @Test
    public void test175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test175");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (byte) 1);
        ds.Item item2 = null;
        ds.Item[] itemArray3 = new ds.Item[] { item2 };
        fPHeapMax1.copia(itemArray3);
        ds.Item item5 = fPHeapMax1.max();
        fPHeapMax1.constroi();
        fPHeapMax1.constroi();
        ds.Item item8 = fPHeapMax1.max();
        fPHeapMax1.constroi();
        fPHeapMax1.imprime();
        ds.Item item11 = fPHeapMax1.max();
        ds.Item item12 = fPHeapMax1.max();
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMax1.refaz((int) '#', 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 35");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertNull(item5);
        org.junit.Assert.assertNull(item8);
        org.junit.Assert.assertNull(item11);
        org.junit.Assert.assertNull(item12);
    }

    @Test
    public void test176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test176");
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
    public void test177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test177");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (byte) 1);
        ds.Item item2 = null;
        ds.Item[] itemArray3 = new ds.Item[] { item2 };
        fPHeapMax1.copia(itemArray3);
        ds.Item item5 = fPHeapMax1.max();
        fPHeapMax1.constroi();
        fPHeapMax1.constroi();
        ds.Item item8 = fPHeapMax1.max();
        fPHeapMax1.constroi();
        ds.Item item10 = fPHeapMax1.max();
        fPHeapMax1.constroi();
        fPHeapMax1.imprime();
        ds.Item item13 = null;
        ds.Item[] itemArray14 = new ds.Item[] { item13 };
        fPHeapMax1.copia(itemArray14);
        fPHeapMax1.imprime();
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMax1.refaz((int) (short) 0, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertNull(item5);
        org.junit.Assert.assertNull(item8);
        org.junit.Assert.assertNull(item10);
        org.junit.Assert.assertNotNull(itemArray14);
    }

    @Test
    public void test178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test178");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (byte) 1);
        ds.FPHeapMax fPHeapMax3 = new ds.FPHeapMax((int) (byte) 1);
        ds.Item item4 = null;
        ds.Item[] itemArray5 = new ds.Item[] { item4 };
        fPHeapMax3.copia(itemArray5);
        fPHeapMax1.copia(itemArray5);
        fPHeapMax1.imprime();
        ds.FPHeapMax fPHeapMax10 = new ds.FPHeapMax((int) (byte) 1);
        ds.Item item11 = null;
        ds.Item[] itemArray12 = new ds.Item[] { item11 };
        fPHeapMax10.copia(itemArray12);
        ds.Item item14 = fPHeapMax10.max();
        ds.FPHeapMax fPHeapMax16 = new ds.FPHeapMax((int) (byte) 1);
        ds.FPHeapMax fPHeapMax18 = new ds.FPHeapMax((int) (byte) 1);
        ds.Item item19 = null;
        ds.Item[] itemArray20 = new ds.Item[] { item19 };
        fPHeapMax18.copia(itemArray20);
        fPHeapMax16.copia(itemArray20);
        fPHeapMax10.copia(itemArray20);
        fPHeapMax1.copia(itemArray20);
        ds.Item item25 = null;
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMax1.insere(item25);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray5);
        org.junit.Assert.assertNotNull(itemArray12);
        org.junit.Assert.assertNull(item14);
        org.junit.Assert.assertNotNull(itemArray20);
    }

    @Test
    public void test179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test179");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (byte) 1);
        ds.Item item2 = null;
        ds.Item[] itemArray3 = new ds.Item[] { item2 };
        fPHeapMax1.copia(itemArray3);
        ds.Item item5 = fPHeapMax1.max();
        fPHeapMax1.constroi();
        fPHeapMax1.constroi();
        ds.Item item8 = fPHeapMax1.max();
        fPHeapMax1.imprime();
        ds.Item item10 = fPHeapMax1.max();
        fPHeapMax1.imprime();
        fPHeapMax1.refaz((int) (short) 0, (-1));
        fPHeapMax1.imprime();
        // The following exception was thrown during execution in test generation
        try {
            ds.Item item16 = fPHeapMax1.retiraMax();
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: heap vazio");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertNull(item5);
        org.junit.Assert.assertNull(item8);
        org.junit.Assert.assertNull(item10);
    }

    @Test
    public void test180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test180");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (byte) 1);
        ds.Item item2 = null;
        ds.Item[] itemArray3 = new ds.Item[] { item2 };
        fPHeapMax1.copia(itemArray3);
        ds.Item item5 = fPHeapMax1.max();
        fPHeapMax1.imprime();
        ds.Item item7 = fPHeapMax1.max();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass8 = item7.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertNull(item5);
        org.junit.Assert.assertNull(item7);
    }

    @Test
    public void test181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test181");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) ' ');
        fPHeapMax1.refaz((int) (short) 1, (int) (short) 1);
        ds.Item item5 = fPHeapMax1.max();
        ds.FPHeapMax fPHeapMax7 = new ds.FPHeapMax((int) (byte) 1);
        ds.Item item8 = null;
        ds.Item[] itemArray9 = new ds.Item[] { item8 };
        fPHeapMax7.copia(itemArray9);
        fPHeapMax1.copia(itemArray9);
        fPHeapMax1.constroi();
        ds.Item item13 = null;
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMax1.insere(item13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(item5);
        org.junit.Assert.assertNotNull(itemArray9);
    }

    @Test
    public void test182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test182");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (byte) 1);
        ds.Item item2 = null;
        ds.Item[] itemArray3 = new ds.Item[] { item2 };
        fPHeapMax1.copia(itemArray3);
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
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertNull(item5);
        org.junit.Assert.assertNull(item6);
    }

    @Test
    public void test183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test183");
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
    public void test184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test184");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax(10);
        ds.FPHeapMax fPHeapMax3 = new ds.FPHeapMax((int) ' ');
        fPHeapMax3.imprime();
        ds.FPHeapMax fPHeapMax6 = new ds.FPHeapMax((int) (byte) 1);
        ds.FPHeapMax fPHeapMax8 = new ds.FPHeapMax((int) (byte) 1);
        ds.Item item9 = null;
        ds.Item[] itemArray10 = new ds.Item[] { item9 };
        fPHeapMax8.copia(itemArray10);
        fPHeapMax6.copia(itemArray10);
        fPHeapMax6.imprime();
        ds.FPHeapMax fPHeapMax15 = new ds.FPHeapMax((int) (byte) 1);
        ds.Item item16 = null;
        ds.Item[] itemArray17 = new ds.Item[] { item16 };
        fPHeapMax15.copia(itemArray17);
        ds.Item item19 = fPHeapMax15.max();
        ds.FPHeapMax fPHeapMax21 = new ds.FPHeapMax((int) (byte) 1);
        ds.FPHeapMax fPHeapMax23 = new ds.FPHeapMax((int) (byte) 1);
        ds.Item item24 = null;
        ds.Item[] itemArray25 = new ds.Item[] { item24 };
        fPHeapMax23.copia(itemArray25);
        fPHeapMax21.copia(itemArray25);
        fPHeapMax15.copia(itemArray25);
        fPHeapMax6.copia(itemArray25);
        fPHeapMax3.copia(itemArray25);
        fPHeapMax1.copia(itemArray25);
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMax1.refaz(100, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 100");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray10);
        org.junit.Assert.assertNotNull(itemArray17);
        org.junit.Assert.assertNull(item19);
        org.junit.Assert.assertNotNull(itemArray25);
    }

    @Test
    public void test185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test185");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (byte) 1);
        ds.Item item2 = fPHeapMax1.max();
        fPHeapMax1.imprime();
        fPHeapMax1.constroi();
        fPHeapMax1.refaz((int) (byte) 1, 0);
        ds.FPHeapMax fPHeapMax9 = new ds.FPHeapMax((int) (short) 1);
        ds.FPHeapMax fPHeapMax11 = new ds.FPHeapMax(0);
        ds.FPHeapMax fPHeapMax13 = new ds.FPHeapMax((int) (byte) 1);
        ds.FPHeapMax fPHeapMax15 = new ds.FPHeapMax((int) (byte) 1);
        ds.Item item16 = null;
        ds.Item[] itemArray17 = new ds.Item[] { item16 };
        fPHeapMax15.copia(itemArray17);
        fPHeapMax13.copia(itemArray17);
        fPHeapMax11.copia(itemArray17);
        fPHeapMax9.copia(itemArray17);
        fPHeapMax9.imprime();
        ds.FPHeapMax fPHeapMax24 = new ds.FPHeapMax((int) ' ');
        fPHeapMax24.refaz((int) (short) 1, (int) (short) 1);
        ds.Item item28 = fPHeapMax24.max();
        ds.FPHeapMax fPHeapMax30 = new ds.FPHeapMax((int) (byte) 1);
        ds.Item item31 = null;
        ds.Item[] itemArray32 = new ds.Item[] { item31 };
        fPHeapMax30.copia(itemArray32);
        fPHeapMax24.copia(itemArray32);
        fPHeapMax9.copia(itemArray32);
        fPHeapMax1.copia(itemArray32);
        ds.Item item37 = null;
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMax1.insere(item37);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(item2);
        org.junit.Assert.assertNotNull(itemArray17);
        org.junit.Assert.assertNull(item28);
        org.junit.Assert.assertNotNull(itemArray32);
    }

    @Test
    public void test186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test186");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (byte) 1);
        ds.Item item2 = null;
        ds.Item[] itemArray3 = new ds.Item[] { item2 };
        fPHeapMax1.copia(itemArray3);
        ds.Item item5 = fPHeapMax1.max();
        fPHeapMax1.constroi();
        fPHeapMax1.constroi();
        ds.Item item8 = fPHeapMax1.max();
        fPHeapMax1.constroi();
        ds.Item item10 = fPHeapMax1.max();
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
        org.junit.Assert.assertNull(item8);
        org.junit.Assert.assertNull(item10);
    }

    @Test
    public void test187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test187");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (byte) 1);
        ds.Item item2 = null;
        ds.Item[] itemArray3 = new ds.Item[] { item2 };
        fPHeapMax1.copia(itemArray3);
        ds.Item item5 = fPHeapMax1.max();
        fPHeapMax1.constroi();
        fPHeapMax1.constroi();
        ds.Item item8 = fPHeapMax1.max();
        fPHeapMax1.constroi();
        ds.Item item10 = fPHeapMax1.max();
        fPHeapMax1.constroi();
        fPHeapMax1.imprime();
        ds.Item item13 = null;
        ds.Item[] itemArray14 = new ds.Item[] { item13 };
        fPHeapMax1.copia(itemArray14);
        java.lang.Class<?> wildcardClass16 = fPHeapMax1.getClass();
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertNull(item5);
        org.junit.Assert.assertNull(item8);
        org.junit.Assert.assertNull(item10);
        org.junit.Assert.assertNotNull(itemArray14);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test188");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (byte) 1);
        ds.Item item2 = null;
        ds.Item[] itemArray3 = new ds.Item[] { item2 };
        fPHeapMax1.copia(itemArray3);
        ds.Item item5 = fPHeapMax1.max();
        fPHeapMax1.imprime();
        ds.FPHeapMax fPHeapMax8 = new ds.FPHeapMax((int) ' ');
        fPHeapMax8.refaz((int) (short) 1, (int) (short) 1);
        ds.Item item12 = fPHeapMax8.max();
        ds.FPHeapMax fPHeapMax14 = new ds.FPHeapMax((int) (byte) 1);
        ds.Item item15 = null;
        ds.Item[] itemArray16 = new ds.Item[] { item15 };
        fPHeapMax14.copia(itemArray16);
        fPHeapMax8.copia(itemArray16);
        fPHeapMax8.constroi();
        ds.FPHeapMax fPHeapMax21 = new ds.FPHeapMax((int) (byte) 1);
        ds.Item item22 = null;
        ds.Item[] itemArray23 = new ds.Item[] { item22 };
        fPHeapMax21.copia(itemArray23);
        fPHeapMax8.copia(itemArray23);
        fPHeapMax1.copia(itemArray23);
        fPHeapMax1.constroi();
        fPHeapMax1.imprime();
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMax1.refaz((int) 'a', 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 97");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertNull(item5);
        org.junit.Assert.assertNull(item12);
        org.junit.Assert.assertNotNull(itemArray16);
        org.junit.Assert.assertNotNull(itemArray23);
    }

    @Test
    public void test189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test189");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (byte) 100);
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
    public void test190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test190");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (byte) 0);
        fPHeapMax1.constroi();
        fPHeapMax1.constroi();
        fPHeapMax1.constroi();
        java.lang.Class<?> wildcardClass5 = fPHeapMax1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test191");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (short) 10);
        ds.FPHeapMax fPHeapMax3 = new ds.FPHeapMax((int) (byte) 1);
        ds.Item item4 = null;
        ds.Item[] itemArray5 = new ds.Item[] { item4 };
        fPHeapMax3.copia(itemArray5);
        ds.Item item7 = fPHeapMax3.max();
        fPHeapMax3.constroi();
        fPHeapMax3.constroi();
        ds.Item item10 = fPHeapMax3.max();
        fPHeapMax3.constroi();
        ds.Item item12 = fPHeapMax3.max();
        fPHeapMax3.constroi();
        fPHeapMax3.imprime();
        ds.FPHeapMax fPHeapMax16 = new ds.FPHeapMax((int) (byte) 1);
        ds.Item item17 = null;
        ds.Item[] itemArray18 = new ds.Item[] { item17 };
        fPHeapMax16.copia(itemArray18);
        fPHeapMax3.copia(itemArray18);
        fPHeapMax1.copia(itemArray18);
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMax1.refaz((int) (short) 10, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 20");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray5);
        org.junit.Assert.assertNull(item7);
        org.junit.Assert.assertNull(item10);
        org.junit.Assert.assertNull(item12);
        org.junit.Assert.assertNotNull(itemArray18);
    }

    @Test
    public void test192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test192");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (short) 10);
        ds.FPHeapMax fPHeapMax3 = new ds.FPHeapMax((int) (byte) 1);
        ds.Item item4 = null;
        ds.Item[] itemArray5 = new ds.Item[] { item4 };
        fPHeapMax3.copia(itemArray5);
        ds.Item item7 = fPHeapMax3.max();
        fPHeapMax3.constroi();
        fPHeapMax3.constroi();
        ds.Item item10 = fPHeapMax3.max();
        fPHeapMax3.constroi();
        ds.Item item12 = fPHeapMax3.max();
        fPHeapMax3.constroi();
        fPHeapMax3.refaz((int) (byte) 1, (int) (byte) -1);
        ds.FPHeapMax fPHeapMax18 = new ds.FPHeapMax((int) (byte) 1);
        ds.Item item19 = null;
        ds.Item[] itemArray20 = new ds.Item[] { item19 };
        fPHeapMax18.copia(itemArray20);
        ds.Item item22 = fPHeapMax18.max();
        ds.FPHeapMax fPHeapMax24 = new ds.FPHeapMax((int) (byte) 1);
        ds.FPHeapMax fPHeapMax26 = new ds.FPHeapMax((int) (byte) 1);
        ds.Item item27 = null;
        ds.Item[] itemArray28 = new ds.Item[] { item27 };
        fPHeapMax26.copia(itemArray28);
        fPHeapMax24.copia(itemArray28);
        fPHeapMax18.copia(itemArray28);
        fPHeapMax3.copia(itemArray28);
        fPHeapMax1.copia(itemArray28);
        // The following exception was thrown during execution in test generation
        try {
            ds.Item item34 = fPHeapMax1.retiraMax();
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: heap vazio");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray5);
        org.junit.Assert.assertNull(item7);
        org.junit.Assert.assertNull(item10);
        org.junit.Assert.assertNull(item12);
        org.junit.Assert.assertNotNull(itemArray20);
        org.junit.Assert.assertNull(item22);
        org.junit.Assert.assertNotNull(itemArray28);
    }

    @Test
    public void test193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test193");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax(100);
        fPHeapMax1.refaz((int) 'a', 0);
        java.lang.Class<?> wildcardClass5 = fPHeapMax1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test194");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax(0);
        fPHeapMax1.constroi();
        ds.FPHeapMax fPHeapMax4 = new ds.FPHeapMax((int) (byte) 1);
        ds.Item item5 = null;
        ds.Item[] itemArray6 = new ds.Item[] { item5 };
        fPHeapMax4.copia(itemArray6);
        ds.Item item8 = fPHeapMax4.max();
        fPHeapMax4.constroi();
        fPHeapMax4.constroi();
        ds.Item item11 = fPHeapMax4.max();
        fPHeapMax4.constroi();
        fPHeapMax4.imprime();
        ds.Item item14 = fPHeapMax4.max();
        ds.Item item15 = fPHeapMax4.max();
        ds.FPHeapMax fPHeapMax17 = new ds.FPHeapMax((int) ' ');
        fPHeapMax17.imprime();
        ds.FPHeapMax fPHeapMax20 = new ds.FPHeapMax((int) (byte) 1);
        ds.FPHeapMax fPHeapMax22 = new ds.FPHeapMax((int) (byte) 1);
        ds.Item item23 = null;
        ds.Item[] itemArray24 = new ds.Item[] { item23 };
        fPHeapMax22.copia(itemArray24);
        fPHeapMax20.copia(itemArray24);
        fPHeapMax20.imprime();
        ds.FPHeapMax fPHeapMax29 = new ds.FPHeapMax((int) (byte) 1);
        ds.Item item30 = null;
        ds.Item[] itemArray31 = new ds.Item[] { item30 };
        fPHeapMax29.copia(itemArray31);
        ds.Item item33 = fPHeapMax29.max();
        ds.FPHeapMax fPHeapMax35 = new ds.FPHeapMax((int) (byte) 1);
        ds.FPHeapMax fPHeapMax37 = new ds.FPHeapMax((int) (byte) 1);
        ds.Item item38 = null;
        ds.Item[] itemArray39 = new ds.Item[] { item38 };
        fPHeapMax37.copia(itemArray39);
        fPHeapMax35.copia(itemArray39);
        fPHeapMax29.copia(itemArray39);
        fPHeapMax20.copia(itemArray39);
        fPHeapMax17.copia(itemArray39);
        fPHeapMax4.copia(itemArray39);
        fPHeapMax1.copia(itemArray39);
        // The following exception was thrown during execution in test generation
        try {
            ds.Item item47 = fPHeapMax1.retiraMax();
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: heap vazio");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray6);
        org.junit.Assert.assertNull(item8);
        org.junit.Assert.assertNull(item11);
        org.junit.Assert.assertNull(item14);
        org.junit.Assert.assertNull(item15);
        org.junit.Assert.assertNotNull(itemArray24);
        org.junit.Assert.assertNotNull(itemArray31);
        org.junit.Assert.assertNull(item33);
        org.junit.Assert.assertNotNull(itemArray39);
    }

    @Test
    public void test195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test195");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (byte) 0);
        fPHeapMax1.constroi();
        ds.FPHeapMax fPHeapMax5 = new ds.FPHeapMax((int) (byte) 1);
        ds.FPHeapMax fPHeapMax7 = new ds.FPHeapMax((int) (byte) 1);
        ds.Item item8 = null;
        ds.Item[] itemArray9 = new ds.Item[] { item8 };
        fPHeapMax7.copia(itemArray9);
        fPHeapMax5.copia(itemArray9);
        fPHeapMax5.imprime();
        ds.FPHeapMax fPHeapMax14 = new ds.FPHeapMax((int) (byte) 1);
        ds.Item item15 = null;
        ds.Item[] itemArray16 = new ds.Item[] { item15 };
        fPHeapMax14.copia(itemArray16);
        ds.Item item18 = fPHeapMax14.max();
        ds.FPHeapMax fPHeapMax20 = new ds.FPHeapMax((int) (byte) 1);
        ds.FPHeapMax fPHeapMax22 = new ds.FPHeapMax((int) (byte) 1);
        ds.Item item23 = null;
        ds.Item[] itemArray24 = new ds.Item[] { item23 };
        fPHeapMax22.copia(itemArray24);
        fPHeapMax20.copia(itemArray24);
        fPHeapMax14.copia(itemArray24);
        fPHeapMax5.copia(itemArray24);
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMax1.aumentaChave((int) (short) -1, (java.lang.Object) fPHeapMax5);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray9);
        org.junit.Assert.assertNotNull(itemArray16);
        org.junit.Assert.assertNull(item18);
        org.junit.Assert.assertNotNull(itemArray24);
    }

    @Test
    public void test196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test196");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (short) 10);
        ds.FPHeapMax fPHeapMax3 = new ds.FPHeapMax((int) (byte) 1);
        ds.Item item4 = null;
        ds.Item[] itemArray5 = new ds.Item[] { item4 };
        fPHeapMax3.copia(itemArray5);
        ds.Item item7 = fPHeapMax3.max();
        fPHeapMax3.constroi();
        fPHeapMax3.constroi();
        ds.Item item10 = fPHeapMax3.max();
        fPHeapMax3.constroi();
        ds.Item item12 = fPHeapMax3.max();
        fPHeapMax3.constroi();
        fPHeapMax3.imprime();
        ds.FPHeapMax fPHeapMax16 = new ds.FPHeapMax((int) (byte) 1);
        ds.Item item17 = null;
        ds.Item[] itemArray18 = new ds.Item[] { item17 };
        fPHeapMax16.copia(itemArray18);
        fPHeapMax3.copia(itemArray18);
        fPHeapMax1.copia(itemArray18);
        ds.Item item22 = fPHeapMax1.max();
        ds.FPHeapMax fPHeapMax25 = new ds.FPHeapMax((int) (byte) 1);
        ds.Item item26 = null;
        ds.Item[] itemArray27 = new ds.Item[] { item26 };
        fPHeapMax25.copia(itemArray27);
        ds.Item item29 = fPHeapMax25.max();
        fPHeapMax25.constroi();
        fPHeapMax25.constroi();
        ds.Item item32 = fPHeapMax25.max();
        ds.FPHeapMax fPHeapMax34 = new ds.FPHeapMax((int) (byte) 1);
        ds.Item item35 = null;
        ds.Item[] itemArray36 = new ds.Item[] { item35 };
        fPHeapMax34.copia(itemArray36);
        ds.Item item38 = fPHeapMax34.max();
        fPHeapMax34.constroi();
        fPHeapMax34.constroi();
        ds.Item item41 = fPHeapMax34.max();
        fPHeapMax34.constroi();
        fPHeapMax34.constroi();
        ds.FPHeapMax fPHeapMax45 = new ds.FPHeapMax((int) (byte) 1);
        ds.FPHeapMax fPHeapMax47 = new ds.FPHeapMax((int) (byte) 1);
        ds.Item item48 = null;
        ds.Item[] itemArray49 = new ds.Item[] { item48 };
        fPHeapMax47.copia(itemArray49);
        fPHeapMax45.copia(itemArray49);
        fPHeapMax45.imprime();
        ds.FPHeapMax fPHeapMax54 = new ds.FPHeapMax((int) (byte) 1);
        ds.Item item55 = null;
        ds.Item[] itemArray56 = new ds.Item[] { item55 };
        fPHeapMax54.copia(itemArray56);
        ds.Item item58 = fPHeapMax54.max();
        ds.FPHeapMax fPHeapMax60 = new ds.FPHeapMax((int) (byte) 1);
        ds.FPHeapMax fPHeapMax62 = new ds.FPHeapMax((int) (byte) 1);
        ds.Item item63 = null;
        ds.Item[] itemArray64 = new ds.Item[] { item63 };
        fPHeapMax62.copia(itemArray64);
        fPHeapMax60.copia(itemArray64);
        fPHeapMax54.copia(itemArray64);
        fPHeapMax45.copia(itemArray64);
        fPHeapMax34.copia(itemArray64);
        fPHeapMax25.copia(itemArray64);
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMax1.aumentaChave(100, (java.lang.Object) fPHeapMax25);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 100");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray5);
        org.junit.Assert.assertNull(item7);
        org.junit.Assert.assertNull(item10);
        org.junit.Assert.assertNull(item12);
        org.junit.Assert.assertNotNull(itemArray18);
        org.junit.Assert.assertNull(item22);
        org.junit.Assert.assertNotNull(itemArray27);
        org.junit.Assert.assertNull(item29);
        org.junit.Assert.assertNull(item32);
        org.junit.Assert.assertNotNull(itemArray36);
        org.junit.Assert.assertNull(item38);
        org.junit.Assert.assertNull(item41);
        org.junit.Assert.assertNotNull(itemArray49);
        org.junit.Assert.assertNotNull(itemArray56);
        org.junit.Assert.assertNull(item58);
        org.junit.Assert.assertNotNull(itemArray64);
    }

    @Test
    public void test197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test197");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (byte) 1);
        ds.Item item2 = null;
        ds.Item[] itemArray3 = new ds.Item[] { item2 };
        fPHeapMax1.copia(itemArray3);
        ds.Item item5 = fPHeapMax1.max();
        fPHeapMax1.constroi();
        fPHeapMax1.constroi();
        ds.Item item8 = fPHeapMax1.max();
        fPHeapMax1.constroi();
        fPHeapMax1.refaz(0, (int) (short) -1);
        fPHeapMax1.constroi();
        fPHeapMax1.constroi();
        ds.Item item15 = null;
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMax1.insere(item15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertNull(item5);
        org.junit.Assert.assertNull(item8);
    }

    @Test
    public void test198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test198");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (byte) 1);
        ds.Item item2 = null;
        ds.Item[] itemArray3 = new ds.Item[] { item2 };
        fPHeapMax1.copia(itemArray3);
        ds.Item item5 = fPHeapMax1.max();
        fPHeapMax1.constroi();
        fPHeapMax1.constroi();
        ds.Item item8 = fPHeapMax1.max();
        fPHeapMax1.constroi();
        ds.Item item10 = fPHeapMax1.max();
        fPHeapMax1.imprime();
        fPHeapMax1.imprime();
        fPHeapMax1.constroi();
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertNull(item5);
        org.junit.Assert.assertNull(item8);
        org.junit.Assert.assertNull(item10);
    }

    @Test
    public void test199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test199");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) ' ');
        ds.Item item2 = fPHeapMax1.max();
        ds.FPHeapMax fPHeapMax5 = new ds.FPHeapMax((int) (byte) 1);
        ds.Item item6 = null;
        ds.Item[] itemArray7 = new ds.Item[] { item6 };
        fPHeapMax5.copia(itemArray7);
        ds.Item item9 = fPHeapMax5.max();
        fPHeapMax5.constroi();
        fPHeapMax5.constroi();
        ds.Item item12 = fPHeapMax5.max();
        fPHeapMax5.constroi();
        ds.Item item14 = fPHeapMax5.max();
        fPHeapMax5.imprime();
        ds.FPHeapMax fPHeapMax17 = new ds.FPHeapMax((int) (byte) 1);
        ds.Item item18 = null;
        ds.Item[] itemArray19 = new ds.Item[] { item18 };
        fPHeapMax17.copia(itemArray19);
        ds.Item item21 = fPHeapMax17.max();
        ds.FPHeapMax fPHeapMax23 = new ds.FPHeapMax((int) (byte) 1);
        ds.FPHeapMax fPHeapMax25 = new ds.FPHeapMax((int) (byte) 1);
        ds.Item item26 = null;
        ds.Item[] itemArray27 = new ds.Item[] { item26 };
        fPHeapMax25.copia(itemArray27);
        fPHeapMax23.copia(itemArray27);
        fPHeapMax17.copia(itemArray27);
        fPHeapMax5.copia(itemArray27);
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMax1.aumentaChave((int) (byte) -1, (java.lang.Object) itemArray27);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(item2);
        org.junit.Assert.assertNotNull(itemArray7);
        org.junit.Assert.assertNull(item9);
        org.junit.Assert.assertNull(item12);
        org.junit.Assert.assertNull(item14);
        org.junit.Assert.assertNotNull(itemArray19);
        org.junit.Assert.assertNull(item21);
        org.junit.Assert.assertNotNull(itemArray27);
    }

    @Test
    public void test200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test200");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (byte) 1);
        ds.Item item2 = null;
        ds.Item[] itemArray3 = new ds.Item[] { item2 };
        fPHeapMax1.copia(itemArray3);
        ds.Item item5 = fPHeapMax1.max();
        fPHeapMax1.constroi();
        fPHeapMax1.constroi();
        ds.Item item8 = fPHeapMax1.max();
        fPHeapMax1.constroi();
        fPHeapMax1.imprime();
        ds.FPHeapMax fPHeapMax12 = new ds.FPHeapMax(0);
        ds.FPHeapMax fPHeapMax14 = new ds.FPHeapMax((int) (byte) 1);
        ds.FPHeapMax fPHeapMax16 = new ds.FPHeapMax((int) (byte) 1);
        ds.Item item17 = null;
        ds.Item[] itemArray18 = new ds.Item[] { item17 };
        fPHeapMax16.copia(itemArray18);
        fPHeapMax14.copia(itemArray18);
        fPHeapMax12.copia(itemArray18);
        fPHeapMax1.copia(itemArray18);
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMax1.refaz(0, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertNull(item5);
        org.junit.Assert.assertNull(item8);
        org.junit.Assert.assertNotNull(itemArray18);
    }

    @Test
    public void test201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test201");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (byte) 1);
        ds.Item item2 = null;
        ds.Item[] itemArray3 = new ds.Item[] { item2 };
        fPHeapMax1.copia(itemArray3);
        ds.Item item5 = fPHeapMax1.max();
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
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertNull(item5);
        org.junit.Assert.assertNull(item8);
    }

    @Test
    public void test202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test202");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (byte) 1);
        ds.Item item2 = null;
        ds.Item[] itemArray3 = new ds.Item[] { item2 };
        fPHeapMax1.copia(itemArray3);
        ds.Item item5 = fPHeapMax1.max();
        fPHeapMax1.constroi();
        fPHeapMax1.constroi();
        ds.Item item8 = fPHeapMax1.max();
        fPHeapMax1.imprime();
        ds.Item item10 = fPHeapMax1.max();
        fPHeapMax1.imprime();
        fPHeapMax1.refaz((int) (short) 0, (-1));
        ds.FPHeapMax fPHeapMax17 = new ds.FPHeapMax((int) (short) 1);
        ds.FPHeapMax fPHeapMax19 = new ds.FPHeapMax(0);
        ds.FPHeapMax fPHeapMax21 = new ds.FPHeapMax((int) (byte) 1);
        ds.FPHeapMax fPHeapMax23 = new ds.FPHeapMax((int) (byte) 1);
        ds.Item item24 = null;
        ds.Item[] itemArray25 = new ds.Item[] { item24 };
        fPHeapMax23.copia(itemArray25);
        fPHeapMax21.copia(itemArray25);
        fPHeapMax19.copia(itemArray25);
        fPHeapMax17.copia(itemArray25);
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMax1.aumentaChave((int) (byte) 0, (java.lang.Object) fPHeapMax17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertNull(item5);
        org.junit.Assert.assertNull(item8);
        org.junit.Assert.assertNull(item10);
        org.junit.Assert.assertNotNull(itemArray25);
    }

    @Test
    public void test203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test203");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (byte) 1);
        ds.Item item2 = null;
        ds.Item[] itemArray3 = new ds.Item[] { item2 };
        fPHeapMax1.copia(itemArray3);
        ds.Item item5 = fPHeapMax1.max();
        fPHeapMax1.constroi();
        fPHeapMax1.constroi();
        ds.Item item8 = fPHeapMax1.max();
        fPHeapMax1.constroi();
        ds.Item item10 = fPHeapMax1.max();
        fPHeapMax1.constroi();
        fPHeapMax1.refaz((int) (byte) 1, (int) (byte) -1);
        ds.Item item15 = fPHeapMax1.max();
        // The following exception was thrown during execution in test generation
        try {
            ds.Item item16 = fPHeapMax1.retiraMax();
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: heap vazio");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertNull(item5);
        org.junit.Assert.assertNull(item8);
        org.junit.Assert.assertNull(item10);
        org.junit.Assert.assertNull(item15);
    }

    @Test
    public void test204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test204");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (byte) 1);
        ds.Item item2 = null;
        ds.Item[] itemArray3 = new ds.Item[] { item2 };
        fPHeapMax1.copia(itemArray3);
        ds.Item item5 = fPHeapMax1.max();
        fPHeapMax1.constroi();
        fPHeapMax1.constroi();
        ds.Item item8 = fPHeapMax1.max();
        fPHeapMax1.constroi();
        fPHeapMax1.imprime();
        ds.Item item11 = fPHeapMax1.max();
        ds.Item item12 = fPHeapMax1.max();
        ds.FPHeapMax fPHeapMax14 = new ds.FPHeapMax((int) ' ');
        fPHeapMax14.imprime();
        ds.FPHeapMax fPHeapMax17 = new ds.FPHeapMax((int) (byte) 1);
        ds.FPHeapMax fPHeapMax19 = new ds.FPHeapMax((int) (byte) 1);
        ds.Item item20 = null;
        ds.Item[] itemArray21 = new ds.Item[] { item20 };
        fPHeapMax19.copia(itemArray21);
        fPHeapMax17.copia(itemArray21);
        fPHeapMax17.imprime();
        ds.FPHeapMax fPHeapMax26 = new ds.FPHeapMax((int) (byte) 1);
        ds.Item item27 = null;
        ds.Item[] itemArray28 = new ds.Item[] { item27 };
        fPHeapMax26.copia(itemArray28);
        ds.Item item30 = fPHeapMax26.max();
        ds.FPHeapMax fPHeapMax32 = new ds.FPHeapMax((int) (byte) 1);
        ds.FPHeapMax fPHeapMax34 = new ds.FPHeapMax((int) (byte) 1);
        ds.Item item35 = null;
        ds.Item[] itemArray36 = new ds.Item[] { item35 };
        fPHeapMax34.copia(itemArray36);
        fPHeapMax32.copia(itemArray36);
        fPHeapMax26.copia(itemArray36);
        fPHeapMax17.copia(itemArray36);
        fPHeapMax14.copia(itemArray36);
        fPHeapMax1.copia(itemArray36);
        ds.FPHeapMax fPHeapMax45 = new ds.FPHeapMax((int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMax1.aumentaChave(0, (java.lang.Object) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertNull(item5);
        org.junit.Assert.assertNull(item8);
        org.junit.Assert.assertNull(item11);
        org.junit.Assert.assertNull(item12);
        org.junit.Assert.assertNotNull(itemArray21);
        org.junit.Assert.assertNotNull(itemArray28);
        org.junit.Assert.assertNull(item30);
        org.junit.Assert.assertNotNull(itemArray36);
    }

    @Test
    public void test205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test205");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (byte) 1);
        ds.Item item2 = null;
        ds.Item[] itemArray3 = new ds.Item[] { item2 };
        fPHeapMax1.copia(itemArray3);
        ds.Item item5 = fPHeapMax1.max();
        fPHeapMax1.constroi();
        fPHeapMax1.constroi();
        ds.Item item8 = fPHeapMax1.max();
        fPHeapMax1.constroi();
        fPHeapMax1.refaz(0, (int) (short) -1);
        ds.FPHeapMax fPHeapMax15 = new ds.FPHeapMax((int) (byte) 1);
        ds.Item item16 = null;
        ds.Item[] itemArray17 = new ds.Item[] { item16 };
        fPHeapMax15.copia(itemArray17);
        ds.Item item19 = fPHeapMax15.max();
        fPHeapMax15.constroi();
        fPHeapMax15.constroi();
        ds.Item item22 = fPHeapMax15.max();
        fPHeapMax15.constroi();
        ds.Item item24 = fPHeapMax15.max();
        fPHeapMax15.constroi();
        fPHeapMax15.imprime();
        ds.FPHeapMax fPHeapMax28 = new ds.FPHeapMax((int) (byte) 1);
        ds.Item item29 = null;
        ds.Item[] itemArray30 = new ds.Item[] { item29 };
        fPHeapMax28.copia(itemArray30);
        fPHeapMax15.copia(itemArray30);
        fPHeapMax15.constroi();
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMax1.aumentaChave((int) (short) 0, (java.lang.Object) fPHeapMax15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertNull(item5);
        org.junit.Assert.assertNull(item8);
        org.junit.Assert.assertNotNull(itemArray17);
        org.junit.Assert.assertNull(item19);
        org.junit.Assert.assertNull(item22);
        org.junit.Assert.assertNull(item24);
        org.junit.Assert.assertNotNull(itemArray30);
    }

    @Test
    public void test206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test206");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (byte) 1);
        ds.Item item2 = null;
        ds.Item[] itemArray3 = new ds.Item[] { item2 };
        fPHeapMax1.copia(itemArray3);
        ds.Item item5 = fPHeapMax1.max();
        fPHeapMax1.constroi();
        fPHeapMax1.constroi();
        ds.Item item8 = fPHeapMax1.max();
        fPHeapMax1.imprime();
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMax1.aumentaChave((int) 'a', (java.lang.Object) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 97");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertNull(item5);
        org.junit.Assert.assertNull(item8);
    }

    @Test
    public void test207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test207");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (byte) 1);
        ds.Item item2 = null;
        ds.Item[] itemArray3 = new ds.Item[] { item2 };
        fPHeapMax1.copia(itemArray3);
        ds.Item item5 = fPHeapMax1.max();
        fPHeapMax1.constroi();
        fPHeapMax1.constroi();
        ds.Item item8 = fPHeapMax1.max();
        fPHeapMax1.constroi();
        ds.Item item10 = fPHeapMax1.max();
        fPHeapMax1.imprime();
        java.lang.Class<?> wildcardClass12 = fPHeapMax1.getClass();
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertNull(item5);
        org.junit.Assert.assertNull(item8);
        org.junit.Assert.assertNull(item10);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test208");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) ' ');
        fPHeapMax1.imprime();
        ds.FPHeapMax fPHeapMax4 = new ds.FPHeapMax((int) (byte) 1);
        ds.Item item5 = null;
        ds.Item[] itemArray6 = new ds.Item[] { item5 };
        fPHeapMax4.copia(itemArray6);
        ds.Item item8 = fPHeapMax4.max();
        fPHeapMax4.constroi();
        fPHeapMax4.constroi();
        ds.Item item11 = fPHeapMax4.max();
        fPHeapMax4.constroi();
        ds.Item item13 = fPHeapMax4.max();
        fPHeapMax4.imprime();
        ds.FPHeapMax fPHeapMax16 = new ds.FPHeapMax((int) (byte) 1);
        ds.Item item17 = null;
        ds.Item[] itemArray18 = new ds.Item[] { item17 };
        fPHeapMax16.copia(itemArray18);
        ds.Item item20 = fPHeapMax16.max();
        ds.FPHeapMax fPHeapMax22 = new ds.FPHeapMax((int) (byte) 1);
        ds.FPHeapMax fPHeapMax24 = new ds.FPHeapMax((int) (byte) 1);
        ds.Item item25 = null;
        ds.Item[] itemArray26 = new ds.Item[] { item25 };
        fPHeapMax24.copia(itemArray26);
        fPHeapMax22.copia(itemArray26);
        fPHeapMax16.copia(itemArray26);
        fPHeapMax4.copia(itemArray26);
        fPHeapMax1.copia(itemArray26);
        ds.FPHeapMax fPHeapMax33 = new ds.FPHeapMax(10);
        ds.FPHeapMax fPHeapMax35 = new ds.FPHeapMax((int) ' ');
        fPHeapMax35.imprime();
        ds.FPHeapMax fPHeapMax38 = new ds.FPHeapMax((int) (byte) 1);
        ds.FPHeapMax fPHeapMax40 = new ds.FPHeapMax((int) (byte) 1);
        ds.Item item41 = null;
        ds.Item[] itemArray42 = new ds.Item[] { item41 };
        fPHeapMax40.copia(itemArray42);
        fPHeapMax38.copia(itemArray42);
        fPHeapMax38.imprime();
        ds.FPHeapMax fPHeapMax47 = new ds.FPHeapMax((int) (byte) 1);
        ds.Item item48 = null;
        ds.Item[] itemArray49 = new ds.Item[] { item48 };
        fPHeapMax47.copia(itemArray49);
        ds.Item item51 = fPHeapMax47.max();
        ds.FPHeapMax fPHeapMax53 = new ds.FPHeapMax((int) (byte) 1);
        ds.FPHeapMax fPHeapMax55 = new ds.FPHeapMax((int) (byte) 1);
        ds.Item item56 = null;
        ds.Item[] itemArray57 = new ds.Item[] { item56 };
        fPHeapMax55.copia(itemArray57);
        fPHeapMax53.copia(itemArray57);
        fPHeapMax47.copia(itemArray57);
        fPHeapMax38.copia(itemArray57);
        fPHeapMax35.copia(itemArray57);
        fPHeapMax33.copia(itemArray57);
        fPHeapMax1.copia(itemArray57);
        fPHeapMax1.imprime();
        // The following exception was thrown during execution in test generation
        try {
            ds.Item item66 = fPHeapMax1.retiraMax();
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: heap vazio");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray6);
        org.junit.Assert.assertNull(item8);
        org.junit.Assert.assertNull(item11);
        org.junit.Assert.assertNull(item13);
        org.junit.Assert.assertNotNull(itemArray18);
        org.junit.Assert.assertNull(item20);
        org.junit.Assert.assertNotNull(itemArray26);
        org.junit.Assert.assertNotNull(itemArray42);
        org.junit.Assert.assertNotNull(itemArray49);
        org.junit.Assert.assertNull(item51);
        org.junit.Assert.assertNotNull(itemArray57);
    }

    @Test
    public void test209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test209");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (byte) 1);
        ds.FPHeapMax fPHeapMax3 = new ds.FPHeapMax((int) (byte) 1);
        ds.Item item4 = null;
        ds.Item[] itemArray5 = new ds.Item[] { item4 };
        fPHeapMax3.copia(itemArray5);
        fPHeapMax1.copia(itemArray5);
        fPHeapMax1.constroi();
        ds.Item item9 = fPHeapMax1.max();
        ds.Item item10 = fPHeapMax1.max();
        org.junit.Assert.assertNotNull(itemArray5);
        org.junit.Assert.assertNull(item9);
        org.junit.Assert.assertNull(item10);
    }

    @Test
    public void test210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test210");
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
    public void test211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test211");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (byte) 100);
        fPHeapMax1.imprime();
        ds.FPHeapMax fPHeapMax5 = new ds.FPHeapMax((int) (byte) 1);
        ds.Item item6 = null;
        ds.Item[] itemArray7 = new ds.Item[] { item6 };
        fPHeapMax5.copia(itemArray7);
        ds.Item item9 = fPHeapMax5.max();
        ds.Item item10 = fPHeapMax5.max();
        fPHeapMax5.imprime();
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMax1.aumentaChave((int) ' ', (java.lang.Object) fPHeapMax5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray7);
        org.junit.Assert.assertNull(item9);
        org.junit.Assert.assertNull(item10);
    }

    @Test
    public void test212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test212");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (byte) 1);
        ds.Item item2 = null;
        ds.Item[] itemArray3 = new ds.Item[] { item2 };
        fPHeapMax1.copia(itemArray3);
        ds.Item item5 = fPHeapMax1.max();
        fPHeapMax1.constroi();
        fPHeapMax1.constroi();
        ds.Item item8 = fPHeapMax1.max();
        fPHeapMax1.constroi();
        fPHeapMax1.constroi();
        fPHeapMax1.imprime();
        ds.Item item12 = fPHeapMax1.max();
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertNull(item5);
        org.junit.Assert.assertNull(item8);
        org.junit.Assert.assertNull(item12);
    }

    @Test
    public void test213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test213");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax(1);
        ds.FPHeapMax fPHeapMax3 = new ds.FPHeapMax((int) (byte) -1);
        fPHeapMax3.imprime();
        ds.FPHeapMax fPHeapMax6 = new ds.FPHeapMax((int) (short) 1);
        ds.FPHeapMax fPHeapMax8 = new ds.FPHeapMax(0);
        ds.FPHeapMax fPHeapMax10 = new ds.FPHeapMax((int) (byte) 1);
        ds.FPHeapMax fPHeapMax12 = new ds.FPHeapMax((int) (byte) 1);
        ds.Item item13 = null;
        ds.Item[] itemArray14 = new ds.Item[] { item13 };
        fPHeapMax12.copia(itemArray14);
        fPHeapMax10.copia(itemArray14);
        fPHeapMax8.copia(itemArray14);
        fPHeapMax6.copia(itemArray14);
        fPHeapMax6.imprime();
        ds.FPHeapMax fPHeapMax21 = new ds.FPHeapMax((int) ' ');
        fPHeapMax21.refaz((int) (short) 1, (int) (short) 1);
        ds.Item item25 = fPHeapMax21.max();
        ds.FPHeapMax fPHeapMax27 = new ds.FPHeapMax((int) (byte) 1);
        ds.Item item28 = null;
        ds.Item[] itemArray29 = new ds.Item[] { item28 };
        fPHeapMax27.copia(itemArray29);
        fPHeapMax21.copia(itemArray29);
        fPHeapMax6.copia(itemArray29);
        fPHeapMax3.copia(itemArray29);
        fPHeapMax1.copia(itemArray29);
        org.junit.Assert.assertNotNull(itemArray14);
        org.junit.Assert.assertNull(item25);
        org.junit.Assert.assertNotNull(itemArray29);
    }

    @Test
    public void test214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test214");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) ' ');
        fPHeapMax1.imprime();
        fPHeapMax1.imprime();
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
    public void test215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test215");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (byte) 1);
        ds.Item item2 = null;
        ds.Item[] itemArray3 = new ds.Item[] { item2 };
        fPHeapMax1.copia(itemArray3);
        ds.Item item5 = fPHeapMax1.max();
        fPHeapMax1.constroi();
        fPHeapMax1.constroi();
        ds.Item item8 = fPHeapMax1.max();
        fPHeapMax1.constroi();
        ds.Item item10 = fPHeapMax1.max();
        fPHeapMax1.constroi();
        fPHeapMax1.imprime();
        ds.FPHeapMax fPHeapMax14 = new ds.FPHeapMax((int) (byte) 1);
        ds.Item item15 = null;
        ds.Item[] itemArray16 = new ds.Item[] { item15 };
        fPHeapMax14.copia(itemArray16);
        fPHeapMax1.copia(itemArray16);
        fPHeapMax1.constroi();
        fPHeapMax1.imprime();
        ds.FPHeapMax fPHeapMax22 = new ds.FPHeapMax(0);
        ds.FPHeapMax fPHeapMax24 = new ds.FPHeapMax((int) (byte) 1);
        ds.FPHeapMax fPHeapMax26 = new ds.FPHeapMax((int) (byte) 1);
        ds.Item item27 = null;
        ds.Item[] itemArray28 = new ds.Item[] { item27 };
        fPHeapMax26.copia(itemArray28);
        fPHeapMax24.copia(itemArray28);
        fPHeapMax22.copia(itemArray28);
        fPHeapMax1.copia(itemArray28);
        ds.Item item33 = null;
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMax1.insere(item33);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertNull(item5);
        org.junit.Assert.assertNull(item8);
        org.junit.Assert.assertNull(item10);
        org.junit.Assert.assertNotNull(itemArray16);
        org.junit.Assert.assertNotNull(itemArray28);
    }

    @Test
    public void test216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test216");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (byte) 1);
        ds.Item item2 = null;
        ds.Item[] itemArray3 = new ds.Item[] { item2 };
        fPHeapMax1.copia(itemArray3);
        ds.Item item5 = fPHeapMax1.max();
        fPHeapMax1.constroi();
        fPHeapMax1.constroi();
        ds.Item item8 = fPHeapMax1.max();
        fPHeapMax1.constroi();
        ds.Item item10 = fPHeapMax1.max();
        fPHeapMax1.constroi();
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMax1.aumentaChave((int) 'a', (java.lang.Object) 100.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 97");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertNull(item5);
        org.junit.Assert.assertNull(item8);
        org.junit.Assert.assertNull(item10);
    }

    @Test
    public void test217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test217");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (byte) 1);
        ds.Item item2 = null;
        ds.Item[] itemArray3 = new ds.Item[] { item2 };
        fPHeapMax1.copia(itemArray3);
        ds.Item item5 = fPHeapMax1.max();
        ds.FPHeapMax fPHeapMax7 = new ds.FPHeapMax((int) (byte) 1);
        ds.FPHeapMax fPHeapMax9 = new ds.FPHeapMax((int) (byte) 1);
        ds.Item item10 = null;
        ds.Item[] itemArray11 = new ds.Item[] { item10 };
        fPHeapMax9.copia(itemArray11);
        fPHeapMax7.copia(itemArray11);
        fPHeapMax1.copia(itemArray11);
        ds.FPHeapMax fPHeapMax16 = new ds.FPHeapMax((int) (byte) 1);
        ds.Item item17 = fPHeapMax16.max();
        fPHeapMax16.imprime();
        fPHeapMax16.constroi();
        fPHeapMax16.refaz((int) (byte) 1, 0);
        ds.FPHeapMax fPHeapMax24 = new ds.FPHeapMax(0);
        ds.FPHeapMax fPHeapMax26 = new ds.FPHeapMax((int) (byte) 1);
        ds.FPHeapMax fPHeapMax28 = new ds.FPHeapMax((int) (byte) 1);
        ds.Item item29 = null;
        ds.Item[] itemArray30 = new ds.Item[] { item29 };
        fPHeapMax28.copia(itemArray30);
        fPHeapMax26.copia(itemArray30);
        fPHeapMax24.copia(itemArray30);
        fPHeapMax16.copia(itemArray30);
        fPHeapMax1.copia(itemArray30);
        java.lang.Class<?> wildcardClass36 = fPHeapMax1.getClass();
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertNull(item5);
        org.junit.Assert.assertNotNull(itemArray11);
        org.junit.Assert.assertNull(item17);
        org.junit.Assert.assertNotNull(itemArray30);
        org.junit.Assert.assertNotNull(wildcardClass36);
    }

    @Test
    public void test218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test218");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax(0);
        fPHeapMax1.constroi();
        java.lang.Class<?> wildcardClass3 = fPHeapMax1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test219");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (short) 1);
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
    public void test220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test220");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (byte) 1);
        ds.Item item2 = null;
        ds.Item[] itemArray3 = new ds.Item[] { item2 };
        fPHeapMax1.copia(itemArray3);
        ds.Item item5 = fPHeapMax1.max();
        fPHeapMax1.constroi();
        fPHeapMax1.constroi();
        ds.Item item8 = fPHeapMax1.max();
        fPHeapMax1.constroi();
        ds.Item item10 = fPHeapMax1.max();
        fPHeapMax1.imprime();
        ds.Item item12 = fPHeapMax1.max();
        ds.FPHeapMax fPHeapMax15 = new ds.FPHeapMax((int) (byte) 1);
        ds.Item item16 = null;
        ds.Item[] itemArray17 = new ds.Item[] { item16 };
        fPHeapMax15.copia(itemArray17);
        ds.Item item19 = fPHeapMax15.max();
        fPHeapMax15.constroi();
        fPHeapMax15.constroi();
        ds.Item item22 = fPHeapMax15.max();
        fPHeapMax15.constroi();
        fPHeapMax15.constroi();
        fPHeapMax15.imprime();
        java.lang.Class<?> wildcardClass26 = fPHeapMax15.getClass();
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMax1.aumentaChave((int) (short) 10, (java.lang.Object) wildcardClass26);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 10");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertNull(item5);
        org.junit.Assert.assertNull(item8);
        org.junit.Assert.assertNull(item10);
        org.junit.Assert.assertNull(item12);
        org.junit.Assert.assertNotNull(itemArray17);
        org.junit.Assert.assertNull(item19);
        org.junit.Assert.assertNull(item22);
        org.junit.Assert.assertNotNull(wildcardClass26);
    }

    @Test
    public void test221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test221");
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
    public void test222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test222");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (byte) 1);
        ds.Item item2 = null;
        ds.Item[] itemArray3 = new ds.Item[] { item2 };
        fPHeapMax1.copia(itemArray3);
        ds.Item item5 = fPHeapMax1.max();
        fPHeapMax1.constroi();
        fPHeapMax1.constroi();
        ds.Item item8 = fPHeapMax1.max();
        fPHeapMax1.constroi();
        fPHeapMax1.imprime();
        ds.Item item11 = fPHeapMax1.max();
        java.lang.Class<?> wildcardClass12 = fPHeapMax1.getClass();
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertNull(item5);
        org.junit.Assert.assertNull(item8);
        org.junit.Assert.assertNull(item11);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test223");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (short) 1);
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
    public void test224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test224");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (byte) 1);
        ds.Item item2 = null;
        ds.Item[] itemArray3 = new ds.Item[] { item2 };
        fPHeapMax1.copia(itemArray3);
        ds.Item item5 = fPHeapMax1.max();
        fPHeapMax1.constroi();
        fPHeapMax1.constroi();
        ds.Item item8 = fPHeapMax1.max();
        fPHeapMax1.constroi();
        fPHeapMax1.imprime();
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMax1.refaz((int) (short) 100, (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 100");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertNull(item5);
        org.junit.Assert.assertNull(item8);
    }

    @Test
    public void test225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test225");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (byte) 1);
        ds.Item item2 = null;
        ds.Item[] itemArray3 = new ds.Item[] { item2 };
        fPHeapMax1.copia(itemArray3);
        ds.Item item5 = fPHeapMax1.max();
        fPHeapMax1.constroi();
        fPHeapMax1.constroi();
        ds.Item item8 = fPHeapMax1.max();
        fPHeapMax1.constroi();
        fPHeapMax1.refaz(0, (int) (short) -1);
        fPHeapMax1.constroi();
        fPHeapMax1.constroi();
        ds.Item item15 = fPHeapMax1.max();
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMax1.aumentaChave((int) (short) 1, (java.lang.Object) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertNull(item5);
        org.junit.Assert.assertNull(item8);
        org.junit.Assert.assertNull(item15);
    }

    @Test
    public void test226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test226");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (byte) 1);
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
    public void test227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test227");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (byte) 1);
        ds.Item item2 = null;
        ds.Item[] itemArray3 = new ds.Item[] { item2 };
        fPHeapMax1.copia(itemArray3);
        ds.Item item5 = fPHeapMax1.max();
        fPHeapMax1.constroi();
        fPHeapMax1.constroi();
        fPHeapMax1.imprime();
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertNull(item5);
    }

    @Test
    public void test228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test228");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax(0);
        fPHeapMax1.constroi();
        ds.FPHeapMax fPHeapMax4 = new ds.FPHeapMax((int) (byte) 1);
        ds.Item item5 = null;
        ds.Item[] itemArray6 = new ds.Item[] { item5 };
        fPHeapMax4.copia(itemArray6);
        ds.Item item8 = fPHeapMax4.max();
        fPHeapMax4.constroi();
        fPHeapMax4.constroi();
        ds.Item item11 = fPHeapMax4.max();
        fPHeapMax4.constroi();
        fPHeapMax4.imprime();
        ds.Item item14 = fPHeapMax4.max();
        ds.Item item15 = fPHeapMax4.max();
        ds.FPHeapMax fPHeapMax17 = new ds.FPHeapMax((int) ' ');
        fPHeapMax17.imprime();
        ds.FPHeapMax fPHeapMax20 = new ds.FPHeapMax((int) (byte) 1);
        ds.FPHeapMax fPHeapMax22 = new ds.FPHeapMax((int) (byte) 1);
        ds.Item item23 = null;
        ds.Item[] itemArray24 = new ds.Item[] { item23 };
        fPHeapMax22.copia(itemArray24);
        fPHeapMax20.copia(itemArray24);
        fPHeapMax20.imprime();
        ds.FPHeapMax fPHeapMax29 = new ds.FPHeapMax((int) (byte) 1);
        ds.Item item30 = null;
        ds.Item[] itemArray31 = new ds.Item[] { item30 };
        fPHeapMax29.copia(itemArray31);
        ds.Item item33 = fPHeapMax29.max();
        ds.FPHeapMax fPHeapMax35 = new ds.FPHeapMax((int) (byte) 1);
        ds.FPHeapMax fPHeapMax37 = new ds.FPHeapMax((int) (byte) 1);
        ds.Item item38 = null;
        ds.Item[] itemArray39 = new ds.Item[] { item38 };
        fPHeapMax37.copia(itemArray39);
        fPHeapMax35.copia(itemArray39);
        fPHeapMax29.copia(itemArray39);
        fPHeapMax20.copia(itemArray39);
        fPHeapMax17.copia(itemArray39);
        fPHeapMax4.copia(itemArray39);
        fPHeapMax1.copia(itemArray39);
        ds.FPHeapMax fPHeapMax49 = new ds.FPHeapMax((int) (byte) 1);
        ds.Item item50 = null;
        ds.Item[] itemArray51 = new ds.Item[] { item50 };
        fPHeapMax49.copia(itemArray51);
        ds.Item item53 = fPHeapMax49.max();
        ds.FPHeapMax fPHeapMax55 = new ds.FPHeapMax((int) (byte) 1);
        ds.FPHeapMax fPHeapMax57 = new ds.FPHeapMax((int) (byte) 1);
        ds.Item item58 = null;
        ds.Item[] itemArray59 = new ds.Item[] { item58 };
        fPHeapMax57.copia(itemArray59);
        fPHeapMax55.copia(itemArray59);
        fPHeapMax49.copia(itemArray59);
        ds.FPHeapMax fPHeapMax64 = new ds.FPHeapMax((int) (byte) 1);
        ds.Item item65 = null;
        ds.Item[] itemArray66 = new ds.Item[] { item65 };
        fPHeapMax64.copia(itemArray66);
        fPHeapMax49.copia(itemArray66);
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMax1.aumentaChave((int) (short) 10, (java.lang.Object) itemArray66);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 10");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray6);
        org.junit.Assert.assertNull(item8);
        org.junit.Assert.assertNull(item11);
        org.junit.Assert.assertNull(item14);
        org.junit.Assert.assertNull(item15);
        org.junit.Assert.assertNotNull(itemArray24);
        org.junit.Assert.assertNotNull(itemArray31);
        org.junit.Assert.assertNull(item33);
        org.junit.Assert.assertNotNull(itemArray39);
        org.junit.Assert.assertNotNull(itemArray51);
        org.junit.Assert.assertNull(item53);
        org.junit.Assert.assertNotNull(itemArray59);
        org.junit.Assert.assertNotNull(itemArray66);
    }

    @Test
    public void test229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test229");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (byte) 1);
        ds.Item item2 = null;
        ds.Item[] itemArray3 = new ds.Item[] { item2 };
        fPHeapMax1.copia(itemArray3);
        ds.Item item5 = fPHeapMax1.max();
        fPHeapMax1.constroi();
        fPHeapMax1.constroi();
        ds.Item item8 = fPHeapMax1.max();
        fPHeapMax1.constroi();
        ds.Item item10 = fPHeapMax1.max();
        ds.Item item11 = fPHeapMax1.max();
        ds.Item item12 = fPHeapMax1.max();
        fPHeapMax1.imprime();
        ds.FPHeapMax fPHeapMax15 = new ds.FPHeapMax((int) (byte) 1);
        ds.Item item16 = fPHeapMax15.max();
        fPHeapMax15.imprime();
        fPHeapMax15.constroi();
        fPHeapMax15.refaz((int) (byte) 1, 0);
        ds.FPHeapMax fPHeapMax23 = new ds.FPHeapMax(0);
        ds.FPHeapMax fPHeapMax25 = new ds.FPHeapMax((int) (byte) 1);
        ds.FPHeapMax fPHeapMax27 = new ds.FPHeapMax((int) (byte) 1);
        ds.Item item28 = null;
        ds.Item[] itemArray29 = new ds.Item[] { item28 };
        fPHeapMax27.copia(itemArray29);
        fPHeapMax25.copia(itemArray29);
        fPHeapMax23.copia(itemArray29);
        fPHeapMax15.copia(itemArray29);
        fPHeapMax1.copia(itemArray29);
        // The following exception was thrown during execution in test generation
        try {
            ds.Item item35 = fPHeapMax1.retiraMax();
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: heap vazio");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertNull(item5);
        org.junit.Assert.assertNull(item8);
        org.junit.Assert.assertNull(item10);
        org.junit.Assert.assertNull(item11);
        org.junit.Assert.assertNull(item12);
        org.junit.Assert.assertNull(item16);
        org.junit.Assert.assertNotNull(itemArray29);
    }

    @Test
    public void test230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test230");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (byte) 1);
        ds.Item item2 = null;
        ds.Item[] itemArray3 = new ds.Item[] { item2 };
        fPHeapMax1.copia(itemArray3);
        ds.Item item5 = fPHeapMax1.max();
        fPHeapMax1.constroi();
        fPHeapMax1.constroi();
        ds.Item item8 = fPHeapMax1.max();
        fPHeapMax1.constroi();
        ds.Item item10 = fPHeapMax1.max();
        fPHeapMax1.constroi();
        fPHeapMax1.imprime();
        ds.FPHeapMax fPHeapMax14 = new ds.FPHeapMax((int) (byte) 1);
        ds.Item item15 = null;
        ds.Item[] itemArray16 = new ds.Item[] { item15 };
        fPHeapMax14.copia(itemArray16);
        fPHeapMax1.copia(itemArray16);
        fPHeapMax1.constroi();
        ds.FPHeapMax fPHeapMax22 = new ds.FPHeapMax(1);
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMax1.aumentaChave((int) (short) 1, (java.lang.Object) fPHeapMax22);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertNull(item5);
        org.junit.Assert.assertNull(item8);
        org.junit.Assert.assertNull(item10);
        org.junit.Assert.assertNotNull(itemArray16);
    }

    @Test
    public void test231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test231");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax(10);
        ds.FPHeapMax fPHeapMax3 = new ds.FPHeapMax((int) ' ');
        fPHeapMax3.imprime();
        ds.FPHeapMax fPHeapMax6 = new ds.FPHeapMax((int) (byte) 1);
        ds.FPHeapMax fPHeapMax8 = new ds.FPHeapMax((int) (byte) 1);
        ds.Item item9 = null;
        ds.Item[] itemArray10 = new ds.Item[] { item9 };
        fPHeapMax8.copia(itemArray10);
        fPHeapMax6.copia(itemArray10);
        fPHeapMax6.imprime();
        ds.FPHeapMax fPHeapMax15 = new ds.FPHeapMax((int) (byte) 1);
        ds.Item item16 = null;
        ds.Item[] itemArray17 = new ds.Item[] { item16 };
        fPHeapMax15.copia(itemArray17);
        ds.Item item19 = fPHeapMax15.max();
        ds.FPHeapMax fPHeapMax21 = new ds.FPHeapMax((int) (byte) 1);
        ds.FPHeapMax fPHeapMax23 = new ds.FPHeapMax((int) (byte) 1);
        ds.Item item24 = null;
        ds.Item[] itemArray25 = new ds.Item[] { item24 };
        fPHeapMax23.copia(itemArray25);
        fPHeapMax21.copia(itemArray25);
        fPHeapMax15.copia(itemArray25);
        fPHeapMax6.copia(itemArray25);
        fPHeapMax3.copia(itemArray25);
        fPHeapMax1.copia(itemArray25);
        ds.FPHeapMax fPHeapMax34 = new ds.FPHeapMax((int) (byte) 1);
        ds.FPHeapMax fPHeapMax36 = new ds.FPHeapMax((int) (byte) 1);
        ds.Item item37 = null;
        ds.Item[] itemArray38 = new ds.Item[] { item37 };
        fPHeapMax36.copia(itemArray38);
        fPHeapMax34.copia(itemArray38);
        java.lang.Class<?> wildcardClass41 = itemArray38.getClass();
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMax1.aumentaChave((int) (byte) 0, (java.lang.Object) wildcardClass41);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray10);
        org.junit.Assert.assertNotNull(itemArray17);
        org.junit.Assert.assertNull(item19);
        org.junit.Assert.assertNotNull(itemArray25);
        org.junit.Assert.assertNotNull(itemArray38);
        org.junit.Assert.assertNotNull(wildcardClass41);
    }

    @Test
    public void test232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test232");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) ' ');
        fPHeapMax1.imprime();
        fPHeapMax1.imprime();
        fPHeapMax1.imprime();
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
    public void test233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test233");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (byte) 1);
        ds.Item item2 = null;
        ds.Item[] itemArray3 = new ds.Item[] { item2 };
        fPHeapMax1.copia(itemArray3);
        ds.Item item5 = fPHeapMax1.max();
        fPHeapMax1.constroi();
        fPHeapMax1.constroi();
        ds.Item item8 = fPHeapMax1.max();
        fPHeapMax1.constroi();
        ds.Item item10 = fPHeapMax1.max();
        ds.Item item11 = fPHeapMax1.max();
        fPHeapMax1.constroi();
        fPHeapMax1.constroi();
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertNull(item5);
        org.junit.Assert.assertNull(item8);
        org.junit.Assert.assertNull(item10);
        org.junit.Assert.assertNull(item11);
    }

    @Test
    public void test234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test234");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (byte) 1);
        ds.Item item2 = null;
        ds.Item[] itemArray3 = new ds.Item[] { item2 };
        fPHeapMax1.copia(itemArray3);
        ds.Item item5 = fPHeapMax1.max();
        fPHeapMax1.constroi();
        fPHeapMax1.constroi();
        ds.Item item8 = fPHeapMax1.max();
        fPHeapMax1.constroi();
        fPHeapMax1.refaz(0, (int) (short) -1);
        fPHeapMax1.constroi();
        ds.Item[] itemArray14 = null;
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMax1.copia(itemArray14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertNull(item5);
        org.junit.Assert.assertNull(item8);
    }

    @Test
    public void test235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test235");
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
    public void test236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test236");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (byte) 1);
        ds.Item item2 = null;
        ds.Item[] itemArray3 = new ds.Item[] { item2 };
        fPHeapMax1.copia(itemArray3);
        ds.Item item5 = fPHeapMax1.max();
        fPHeapMax1.constroi();
        fPHeapMax1.constroi();
        ds.Item item8 = fPHeapMax1.max();
        fPHeapMax1.constroi();
        fPHeapMax1.refaz(0, (int) (short) -1);
        fPHeapMax1.constroi();
        java.lang.Class<?> wildcardClass14 = fPHeapMax1.getClass();
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertNull(item5);
        org.junit.Assert.assertNull(item8);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test237");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (byte) 1);
        ds.Item item2 = null;
        ds.Item[] itemArray3 = new ds.Item[] { item2 };
        fPHeapMax1.copia(itemArray3);
        fPHeapMax1.constroi();
        ds.FPHeapMax fPHeapMax7 = new ds.FPHeapMax((int) ' ');
        fPHeapMax7.refaz((int) (short) 1, (int) (short) 1);
        ds.Item item11 = fPHeapMax7.max();
        ds.FPHeapMax fPHeapMax13 = new ds.FPHeapMax((int) (byte) 1);
        ds.Item item14 = null;
        ds.Item[] itemArray15 = new ds.Item[] { item14 };
        fPHeapMax13.copia(itemArray15);
        fPHeapMax7.copia(itemArray15);
        fPHeapMax1.copia(itemArray15);
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertNull(item11);
        org.junit.Assert.assertNotNull(itemArray15);
    }

    @Test
    public void test238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test238");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (byte) 1);
        ds.Item item2 = fPHeapMax1.max();
        fPHeapMax1.imprime();
        fPHeapMax1.constroi();
        fPHeapMax1.refaz((int) (byte) 1, 0);
        ds.FPHeapMax fPHeapMax9 = new ds.FPHeapMax(0);
        ds.FPHeapMax fPHeapMax11 = new ds.FPHeapMax((int) (byte) 1);
        ds.FPHeapMax fPHeapMax13 = new ds.FPHeapMax((int) (byte) 1);
        ds.Item item14 = null;
        ds.Item[] itemArray15 = new ds.Item[] { item14 };
        fPHeapMax13.copia(itemArray15);
        fPHeapMax11.copia(itemArray15);
        fPHeapMax9.copia(itemArray15);
        fPHeapMax1.copia(itemArray15);
        // The following exception was thrown during execution in test generation
        try {
            ds.Item item20 = fPHeapMax1.retiraMax();
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: heap vazio");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(item2);
        org.junit.Assert.assertNotNull(itemArray15);
    }

    @Test
    public void test239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test239");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (byte) 1);
        ds.Item item2 = null;
        ds.Item[] itemArray3 = new ds.Item[] { item2 };
        fPHeapMax1.copia(itemArray3);
        ds.Item item5 = fPHeapMax1.max();
        fPHeapMax1.constroi();
        fPHeapMax1.constroi();
        ds.Item item8 = fPHeapMax1.max();
        fPHeapMax1.imprime();
        fPHeapMax1.constroi();
        ds.FPHeapMax fPHeapMax12 = new ds.FPHeapMax((int) (short) 1);
        fPHeapMax12.imprime();
        fPHeapMax12.constroi();
        ds.FPHeapMax fPHeapMax16 = new ds.FPHeapMax((int) ' ');
        fPHeapMax16.imprime();
        ds.FPHeapMax fPHeapMax19 = new ds.FPHeapMax((int) (byte) 1);
        ds.Item item20 = null;
        ds.Item[] itemArray21 = new ds.Item[] { item20 };
        fPHeapMax19.copia(itemArray21);
        ds.Item item23 = fPHeapMax19.max();
        fPHeapMax19.constroi();
        fPHeapMax19.constroi();
        ds.Item item26 = fPHeapMax19.max();
        fPHeapMax19.constroi();
        ds.Item item28 = fPHeapMax19.max();
        fPHeapMax19.imprime();
        ds.FPHeapMax fPHeapMax31 = new ds.FPHeapMax((int) (byte) 1);
        ds.Item item32 = null;
        ds.Item[] itemArray33 = new ds.Item[] { item32 };
        fPHeapMax31.copia(itemArray33);
        ds.Item item35 = fPHeapMax31.max();
        ds.FPHeapMax fPHeapMax37 = new ds.FPHeapMax((int) (byte) 1);
        ds.FPHeapMax fPHeapMax39 = new ds.FPHeapMax((int) (byte) 1);
        ds.Item item40 = null;
        ds.Item[] itemArray41 = new ds.Item[] { item40 };
        fPHeapMax39.copia(itemArray41);
        fPHeapMax37.copia(itemArray41);
        fPHeapMax31.copia(itemArray41);
        fPHeapMax19.copia(itemArray41);
        fPHeapMax16.copia(itemArray41);
        ds.FPHeapMax fPHeapMax48 = new ds.FPHeapMax(10);
        ds.FPHeapMax fPHeapMax50 = new ds.FPHeapMax((int) ' ');
        fPHeapMax50.imprime();
        ds.FPHeapMax fPHeapMax53 = new ds.FPHeapMax((int) (byte) 1);
        ds.FPHeapMax fPHeapMax55 = new ds.FPHeapMax((int) (byte) 1);
        ds.Item item56 = null;
        ds.Item[] itemArray57 = new ds.Item[] { item56 };
        fPHeapMax55.copia(itemArray57);
        fPHeapMax53.copia(itemArray57);
        fPHeapMax53.imprime();
        ds.FPHeapMax fPHeapMax62 = new ds.FPHeapMax((int) (byte) 1);
        ds.Item item63 = null;
        ds.Item[] itemArray64 = new ds.Item[] { item63 };
        fPHeapMax62.copia(itemArray64);
        ds.Item item66 = fPHeapMax62.max();
        ds.FPHeapMax fPHeapMax68 = new ds.FPHeapMax((int) (byte) 1);
        ds.FPHeapMax fPHeapMax70 = new ds.FPHeapMax((int) (byte) 1);
        ds.Item item71 = null;
        ds.Item[] itemArray72 = new ds.Item[] { item71 };
        fPHeapMax70.copia(itemArray72);
        fPHeapMax68.copia(itemArray72);
        fPHeapMax62.copia(itemArray72);
        fPHeapMax53.copia(itemArray72);
        fPHeapMax50.copia(itemArray72);
        fPHeapMax48.copia(itemArray72);
        fPHeapMax16.copia(itemArray72);
        fPHeapMax12.copia(itemArray72);
        fPHeapMax1.copia(itemArray72);
        java.lang.Class<?> wildcardClass82 = itemArray72.getClass();
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertNull(item5);
        org.junit.Assert.assertNull(item8);
        org.junit.Assert.assertNotNull(itemArray21);
        org.junit.Assert.assertNull(item23);
        org.junit.Assert.assertNull(item26);
        org.junit.Assert.assertNull(item28);
        org.junit.Assert.assertNotNull(itemArray33);
        org.junit.Assert.assertNull(item35);
        org.junit.Assert.assertNotNull(itemArray41);
        org.junit.Assert.assertNotNull(itemArray57);
        org.junit.Assert.assertNotNull(itemArray64);
        org.junit.Assert.assertNull(item66);
        org.junit.Assert.assertNotNull(itemArray72);
        org.junit.Assert.assertNotNull(wildcardClass82);
    }

    @Test
    public void test240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test240");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) ' ');
        fPHeapMax1.imprime();
        fPHeapMax1.constroi();
        fPHeapMax1.refaz(10, (int) (short) 10);
    }

    @Test
    public void test241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test241");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) ' ');
        fPHeapMax1.imprime();
        ds.FPHeapMax fPHeapMax4 = new ds.FPHeapMax((int) (byte) 1);
        ds.FPHeapMax fPHeapMax6 = new ds.FPHeapMax((int) (byte) 1);
        ds.Item item7 = null;
        ds.Item[] itemArray8 = new ds.Item[] { item7 };
        fPHeapMax6.copia(itemArray8);
        fPHeapMax4.copia(itemArray8);
        fPHeapMax4.imprime();
        ds.FPHeapMax fPHeapMax13 = new ds.FPHeapMax((int) (byte) 1);
        ds.Item item14 = null;
        ds.Item[] itemArray15 = new ds.Item[] { item14 };
        fPHeapMax13.copia(itemArray15);
        ds.Item item17 = fPHeapMax13.max();
        ds.FPHeapMax fPHeapMax19 = new ds.FPHeapMax((int) (byte) 1);
        ds.FPHeapMax fPHeapMax21 = new ds.FPHeapMax((int) (byte) 1);
        ds.Item item22 = null;
        ds.Item[] itemArray23 = new ds.Item[] { item22 };
        fPHeapMax21.copia(itemArray23);
        fPHeapMax19.copia(itemArray23);
        fPHeapMax13.copia(itemArray23);
        fPHeapMax4.copia(itemArray23);
        fPHeapMax1.copia(itemArray23);
        ds.FPHeapMax fPHeapMax30 = new ds.FPHeapMax((int) (byte) 1);
        ds.Item item31 = null;
        ds.Item[] itemArray32 = new ds.Item[] { item31 };
        fPHeapMax30.copia(itemArray32);
        ds.Item item34 = fPHeapMax30.max();
        fPHeapMax30.constroi();
        fPHeapMax30.constroi();
        ds.Item item37 = fPHeapMax30.max();
        fPHeapMax30.constroi();
        ds.Item item39 = fPHeapMax30.max();
        ds.Item item40 = fPHeapMax30.max();
        ds.Item item41 = fPHeapMax30.max();
        fPHeapMax30.imprime();
        ds.FPHeapMax fPHeapMax44 = new ds.FPHeapMax((int) (byte) 1);
        ds.Item item45 = fPHeapMax44.max();
        fPHeapMax44.imprime();
        fPHeapMax44.constroi();
        fPHeapMax44.refaz((int) (byte) 1, 0);
        ds.FPHeapMax fPHeapMax52 = new ds.FPHeapMax(0);
        ds.FPHeapMax fPHeapMax54 = new ds.FPHeapMax((int) (byte) 1);
        ds.FPHeapMax fPHeapMax56 = new ds.FPHeapMax((int) (byte) 1);
        ds.Item item57 = null;
        ds.Item[] itemArray58 = new ds.Item[] { item57 };
        fPHeapMax56.copia(itemArray58);
        fPHeapMax54.copia(itemArray58);
        fPHeapMax52.copia(itemArray58);
        fPHeapMax44.copia(itemArray58);
        fPHeapMax30.copia(itemArray58);
        fPHeapMax1.copia(itemArray58);
        java.lang.Class<?> wildcardClass65 = itemArray58.getClass();
        org.junit.Assert.assertNotNull(itemArray8);
        org.junit.Assert.assertNotNull(itemArray15);
        org.junit.Assert.assertNull(item17);
        org.junit.Assert.assertNotNull(itemArray23);
        org.junit.Assert.assertNotNull(itemArray32);
        org.junit.Assert.assertNull(item34);
        org.junit.Assert.assertNull(item37);
        org.junit.Assert.assertNull(item39);
        org.junit.Assert.assertNull(item40);
        org.junit.Assert.assertNull(item41);
        org.junit.Assert.assertNull(item45);
        org.junit.Assert.assertNotNull(itemArray58);
        org.junit.Assert.assertNotNull(wildcardClass65);
    }

    @Test
    public void test242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test242");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) ' ');
        fPHeapMax1.refaz((int) (short) 1, (int) (short) 1);
        ds.Item item5 = fPHeapMax1.max();
        ds.FPHeapMax fPHeapMax7 = new ds.FPHeapMax((int) (byte) 1);
        ds.Item item8 = null;
        ds.Item[] itemArray9 = new ds.Item[] { item8 };
        fPHeapMax7.copia(itemArray9);
        fPHeapMax1.copia(itemArray9);
        fPHeapMax1.constroi();
        ds.FPHeapMax fPHeapMax14 = new ds.FPHeapMax((int) (byte) 1);
        ds.Item item15 = null;
        ds.Item[] itemArray16 = new ds.Item[] { item15 };
        fPHeapMax14.copia(itemArray16);
        fPHeapMax1.copia(itemArray16);
        ds.FPHeapMax fPHeapMax21 = new ds.FPHeapMax((int) (byte) 1);
        ds.Item item22 = null;
        ds.Item[] itemArray23 = new ds.Item[] { item22 };
        fPHeapMax21.copia(itemArray23);
        fPHeapMax21.constroi();
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMax1.aumentaChave((int) (short) 1, (java.lang.Object) fPHeapMax21);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(item5);
        org.junit.Assert.assertNotNull(itemArray9);
        org.junit.Assert.assertNotNull(itemArray16);
        org.junit.Assert.assertNotNull(itemArray23);
    }

    @Test
    public void test243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test243");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (byte) 1);
        ds.Item item2 = null;
        ds.Item[] itemArray3 = new ds.Item[] { item2 };
        fPHeapMax1.copia(itemArray3);
        ds.Item item5 = fPHeapMax1.max();
        fPHeapMax1.constroi();
        fPHeapMax1.constroi();
        ds.Item item8 = fPHeapMax1.max();
        fPHeapMax1.constroi();
        fPHeapMax1.imprime();
        ds.Item item11 = fPHeapMax1.max();
        ds.Item item12 = fPHeapMax1.max();
        ds.FPHeapMax fPHeapMax15 = new ds.FPHeapMax(0);
        ds.FPHeapMax fPHeapMax17 = new ds.FPHeapMax((int) (byte) 1);
        ds.FPHeapMax fPHeapMax19 = new ds.FPHeapMax((int) (byte) 1);
        ds.Item item20 = null;
        ds.Item[] itemArray21 = new ds.Item[] { item20 };
        fPHeapMax19.copia(itemArray21);
        fPHeapMax17.copia(itemArray21);
        fPHeapMax15.copia(itemArray21);
        java.lang.Class<?> wildcardClass25 = itemArray21.getClass();
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMax1.aumentaChave(1, (java.lang.Object) wildcardClass25);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertNull(item5);
        org.junit.Assert.assertNull(item8);
        org.junit.Assert.assertNull(item11);
        org.junit.Assert.assertNull(item12);
        org.junit.Assert.assertNotNull(itemArray21);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test244");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (byte) 1);
        ds.Item item2 = null;
        ds.Item[] itemArray3 = new ds.Item[] { item2 };
        fPHeapMax1.copia(itemArray3);
        ds.Item item5 = fPHeapMax1.max();
        fPHeapMax1.constroi();
        fPHeapMax1.constroi();
        ds.Item item8 = fPHeapMax1.max();
        fPHeapMax1.constroi();
        ds.Item item10 = fPHeapMax1.max();
        fPHeapMax1.constroi();
        fPHeapMax1.refaz((int) (byte) 1, (int) (byte) -1);
        ds.FPHeapMax fPHeapMax16 = new ds.FPHeapMax((int) (byte) 1);
        ds.Item item17 = null;
        ds.Item[] itemArray18 = new ds.Item[] { item17 };
        fPHeapMax16.copia(itemArray18);
        ds.Item item20 = fPHeapMax16.max();
        ds.FPHeapMax fPHeapMax22 = new ds.FPHeapMax((int) (byte) 1);
        ds.FPHeapMax fPHeapMax24 = new ds.FPHeapMax((int) (byte) 1);
        ds.Item item25 = null;
        ds.Item[] itemArray26 = new ds.Item[] { item25 };
        fPHeapMax24.copia(itemArray26);
        fPHeapMax22.copia(itemArray26);
        fPHeapMax16.copia(itemArray26);
        fPHeapMax1.copia(itemArray26);
        fPHeapMax1.imprime();
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMax1.refaz((int) (short) 10, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 10");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertNull(item5);
        org.junit.Assert.assertNull(item8);
        org.junit.Assert.assertNull(item10);
        org.junit.Assert.assertNotNull(itemArray18);
        org.junit.Assert.assertNull(item20);
        org.junit.Assert.assertNotNull(itemArray26);
    }

    @Test
    public void test245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test245");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (byte) 1);
        ds.Item item2 = null;
        ds.Item[] itemArray3 = new ds.Item[] { item2 };
        fPHeapMax1.copia(itemArray3);
        ds.Item item5 = fPHeapMax1.max();
        fPHeapMax1.constroi();
        fPHeapMax1.constroi();
        ds.Item item8 = fPHeapMax1.max();
        fPHeapMax1.imprime();
        ds.Item item10 = fPHeapMax1.max();
        fPHeapMax1.constroi();
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertNull(item5);
        org.junit.Assert.assertNull(item8);
        org.junit.Assert.assertNull(item10);
    }

    @Test
    public void test246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test246");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) ' ');
        fPHeapMax1.refaz((int) (short) 1, (int) (short) 1);
        ds.Item item5 = fPHeapMax1.max();
        ds.FPHeapMax fPHeapMax7 = new ds.FPHeapMax((int) (byte) 1);
        ds.Item item8 = null;
        ds.Item[] itemArray9 = new ds.Item[] { item8 };
        fPHeapMax7.copia(itemArray9);
        fPHeapMax1.copia(itemArray9);
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMax1.refaz((int) 'a', (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 97");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(item5);
        org.junit.Assert.assertNotNull(itemArray9);
    }

    @Test
    public void test247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test247");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (byte) -1);
        fPHeapMax1.imprime();
        ds.FPHeapMax fPHeapMax4 = new ds.FPHeapMax((int) (short) 1);
        ds.FPHeapMax fPHeapMax6 = new ds.FPHeapMax(0);
        ds.FPHeapMax fPHeapMax8 = new ds.FPHeapMax((int) (byte) 1);
        ds.FPHeapMax fPHeapMax10 = new ds.FPHeapMax((int) (byte) 1);
        ds.Item item11 = null;
        ds.Item[] itemArray12 = new ds.Item[] { item11 };
        fPHeapMax10.copia(itemArray12);
        fPHeapMax8.copia(itemArray12);
        fPHeapMax6.copia(itemArray12);
        fPHeapMax4.copia(itemArray12);
        fPHeapMax4.imprime();
        ds.FPHeapMax fPHeapMax19 = new ds.FPHeapMax((int) ' ');
        fPHeapMax19.refaz((int) (short) 1, (int) (short) 1);
        ds.Item item23 = fPHeapMax19.max();
        ds.FPHeapMax fPHeapMax25 = new ds.FPHeapMax((int) (byte) 1);
        ds.Item item26 = null;
        ds.Item[] itemArray27 = new ds.Item[] { item26 };
        fPHeapMax25.copia(itemArray27);
        fPHeapMax19.copia(itemArray27);
        fPHeapMax4.copia(itemArray27);
        fPHeapMax1.copia(itemArray27);
        ds.Item item32 = null;
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMax1.insere(item32);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray12);
        org.junit.Assert.assertNull(item23);
        org.junit.Assert.assertNotNull(itemArray27);
    }

    @Test
    public void test248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test248");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (byte) 1);
        ds.Item item2 = null;
        ds.Item[] itemArray3 = new ds.Item[] { item2 };
        fPHeapMax1.copia(itemArray3);
        ds.Item item5 = fPHeapMax1.max();
        fPHeapMax1.constroi();
        fPHeapMax1.constroi();
        ds.Item item8 = fPHeapMax1.max();
        fPHeapMax1.constroi();
        ds.Item item10 = fPHeapMax1.max();
        ds.FPHeapMax fPHeapMax12 = new ds.FPHeapMax((int) (byte) 1);
        ds.Item item13 = null;
        ds.Item[] itemArray14 = new ds.Item[] { item13 };
        fPHeapMax12.copia(itemArray14);
        ds.Item item16 = fPHeapMax12.max();
        ds.FPHeapMax fPHeapMax18 = new ds.FPHeapMax((int) (byte) 1);
        ds.FPHeapMax fPHeapMax20 = new ds.FPHeapMax((int) (byte) 1);
        ds.Item item21 = null;
        ds.Item[] itemArray22 = new ds.Item[] { item21 };
        fPHeapMax20.copia(itemArray22);
        fPHeapMax18.copia(itemArray22);
        fPHeapMax12.copia(itemArray22);
        fPHeapMax1.copia(itemArray22);
        fPHeapMax1.constroi();
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertNull(item5);
        org.junit.Assert.assertNull(item8);
        org.junit.Assert.assertNull(item10);
        org.junit.Assert.assertNotNull(itemArray14);
        org.junit.Assert.assertNull(item16);
        org.junit.Assert.assertNotNull(itemArray22);
    }

    @Test
    public void test249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test249");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (short) 1);
        fPHeapMax1.imprime();
        fPHeapMax1.constroi();
        ds.FPHeapMax fPHeapMax5 = new ds.FPHeapMax((int) ' ');
        fPHeapMax5.imprime();
        ds.FPHeapMax fPHeapMax8 = new ds.FPHeapMax((int) (byte) 1);
        ds.Item item9 = null;
        ds.Item[] itemArray10 = new ds.Item[] { item9 };
        fPHeapMax8.copia(itemArray10);
        ds.Item item12 = fPHeapMax8.max();
        fPHeapMax8.constroi();
        fPHeapMax8.constroi();
        ds.Item item15 = fPHeapMax8.max();
        fPHeapMax8.constroi();
        ds.Item item17 = fPHeapMax8.max();
        fPHeapMax8.imprime();
        ds.FPHeapMax fPHeapMax20 = new ds.FPHeapMax((int) (byte) 1);
        ds.Item item21 = null;
        ds.Item[] itemArray22 = new ds.Item[] { item21 };
        fPHeapMax20.copia(itemArray22);
        ds.Item item24 = fPHeapMax20.max();
        ds.FPHeapMax fPHeapMax26 = new ds.FPHeapMax((int) (byte) 1);
        ds.FPHeapMax fPHeapMax28 = new ds.FPHeapMax((int) (byte) 1);
        ds.Item item29 = null;
        ds.Item[] itemArray30 = new ds.Item[] { item29 };
        fPHeapMax28.copia(itemArray30);
        fPHeapMax26.copia(itemArray30);
        fPHeapMax20.copia(itemArray30);
        fPHeapMax8.copia(itemArray30);
        fPHeapMax5.copia(itemArray30);
        ds.FPHeapMax fPHeapMax37 = new ds.FPHeapMax(10);
        ds.FPHeapMax fPHeapMax39 = new ds.FPHeapMax((int) ' ');
        fPHeapMax39.imprime();
        ds.FPHeapMax fPHeapMax42 = new ds.FPHeapMax((int) (byte) 1);
        ds.FPHeapMax fPHeapMax44 = new ds.FPHeapMax((int) (byte) 1);
        ds.Item item45 = null;
        ds.Item[] itemArray46 = new ds.Item[] { item45 };
        fPHeapMax44.copia(itemArray46);
        fPHeapMax42.copia(itemArray46);
        fPHeapMax42.imprime();
        ds.FPHeapMax fPHeapMax51 = new ds.FPHeapMax((int) (byte) 1);
        ds.Item item52 = null;
        ds.Item[] itemArray53 = new ds.Item[] { item52 };
        fPHeapMax51.copia(itemArray53);
        ds.Item item55 = fPHeapMax51.max();
        ds.FPHeapMax fPHeapMax57 = new ds.FPHeapMax((int) (byte) 1);
        ds.FPHeapMax fPHeapMax59 = new ds.FPHeapMax((int) (byte) 1);
        ds.Item item60 = null;
        ds.Item[] itemArray61 = new ds.Item[] { item60 };
        fPHeapMax59.copia(itemArray61);
        fPHeapMax57.copia(itemArray61);
        fPHeapMax51.copia(itemArray61);
        fPHeapMax42.copia(itemArray61);
        fPHeapMax39.copia(itemArray61);
        fPHeapMax37.copia(itemArray61);
        fPHeapMax5.copia(itemArray61);
        fPHeapMax1.copia(itemArray61);
        java.lang.Class<?> wildcardClass70 = itemArray61.getClass();
        org.junit.Assert.assertNotNull(itemArray10);
        org.junit.Assert.assertNull(item12);
        org.junit.Assert.assertNull(item15);
        org.junit.Assert.assertNull(item17);
        org.junit.Assert.assertNotNull(itemArray22);
        org.junit.Assert.assertNull(item24);
        org.junit.Assert.assertNotNull(itemArray30);
        org.junit.Assert.assertNotNull(itemArray46);
        org.junit.Assert.assertNotNull(itemArray53);
        org.junit.Assert.assertNull(item55);
        org.junit.Assert.assertNotNull(itemArray61);
        org.junit.Assert.assertNotNull(wildcardClass70);
    }

    @Test
    public void test250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test250");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (byte) 0);
        fPHeapMax1.constroi();
        fPHeapMax1.constroi();
        fPHeapMax1.constroi();
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMax1.refaz((int) (byte) 0, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test251");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (byte) 1);
        ds.Item item2 = null;
        ds.Item[] itemArray3 = new ds.Item[] { item2 };
        fPHeapMax1.copia(itemArray3);
        ds.Item item5 = fPHeapMax1.max();
        fPHeapMax1.constroi();
        fPHeapMax1.imprime();
        ds.FPHeapMax fPHeapMax10 = new ds.FPHeapMax((int) (byte) 1);
        ds.Item item11 = null;
        ds.Item[] itemArray12 = new ds.Item[] { item11 };
        fPHeapMax10.copia(itemArray12);
        ds.Item item14 = fPHeapMax10.max();
        fPHeapMax10.constroi();
        fPHeapMax10.constroi();
        ds.Item item17 = fPHeapMax10.max();
        fPHeapMax10.constroi();
        ds.Item item19 = fPHeapMax10.max();
        fPHeapMax10.constroi();
        fPHeapMax10.refaz((int) (byte) 1, (int) (byte) -1);
        ds.FPHeapMax fPHeapMax25 = new ds.FPHeapMax((int) (byte) 1);
        ds.Item item26 = null;
        ds.Item[] itemArray27 = new ds.Item[] { item26 };
        fPHeapMax25.copia(itemArray27);
        ds.Item item29 = fPHeapMax25.max();
        fPHeapMax25.constroi();
        fPHeapMax25.constroi();
        ds.Item item32 = fPHeapMax25.max();
        fPHeapMax25.constroi();
        ds.Item item34 = fPHeapMax25.max();
        fPHeapMax25.constroi();
        fPHeapMax25.imprime();
        ds.Item item37 = null;
        ds.Item[] itemArray38 = new ds.Item[] { item37 };
        fPHeapMax25.copia(itemArray38);
        fPHeapMax10.copia(itemArray38);
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMax1.aumentaChave(10, (java.lang.Object) fPHeapMax10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 10");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertNull(item5);
        org.junit.Assert.assertNotNull(itemArray12);
        org.junit.Assert.assertNull(item14);
        org.junit.Assert.assertNull(item17);
        org.junit.Assert.assertNull(item19);
        org.junit.Assert.assertNotNull(itemArray27);
        org.junit.Assert.assertNull(item29);
        org.junit.Assert.assertNull(item32);
        org.junit.Assert.assertNull(item34);
        org.junit.Assert.assertNotNull(itemArray38);
    }

    @Test
    public void test252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test252");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (byte) 1);
        ds.Item item2 = null;
        ds.Item[] itemArray3 = new ds.Item[] { item2 };
        fPHeapMax1.copia(itemArray3);
        ds.Item item5 = fPHeapMax1.max();
        fPHeapMax1.constroi();
        fPHeapMax1.constroi();
        ds.Item item8 = fPHeapMax1.max();
        fPHeapMax1.constroi();
        fPHeapMax1.constroi();
        ds.FPHeapMax fPHeapMax12 = new ds.FPHeapMax((int) (byte) 1);
        ds.FPHeapMax fPHeapMax14 = new ds.FPHeapMax((int) (byte) 1);
        ds.Item item15 = null;
        ds.Item[] itemArray16 = new ds.Item[] { item15 };
        fPHeapMax14.copia(itemArray16);
        fPHeapMax12.copia(itemArray16);
        fPHeapMax12.imprime();
        ds.FPHeapMax fPHeapMax21 = new ds.FPHeapMax((int) (byte) 1);
        ds.Item item22 = null;
        ds.Item[] itemArray23 = new ds.Item[] { item22 };
        fPHeapMax21.copia(itemArray23);
        ds.Item item25 = fPHeapMax21.max();
        ds.FPHeapMax fPHeapMax27 = new ds.FPHeapMax((int) (byte) 1);
        ds.FPHeapMax fPHeapMax29 = new ds.FPHeapMax((int) (byte) 1);
        ds.Item item30 = null;
        ds.Item[] itemArray31 = new ds.Item[] { item30 };
        fPHeapMax29.copia(itemArray31);
        fPHeapMax27.copia(itemArray31);
        fPHeapMax21.copia(itemArray31);
        fPHeapMax12.copia(itemArray31);
        fPHeapMax1.copia(itemArray31);
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMax1.refaz(10, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 10");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertNull(item5);
        org.junit.Assert.assertNull(item8);
        org.junit.Assert.assertNotNull(itemArray16);
        org.junit.Assert.assertNotNull(itemArray23);
        org.junit.Assert.assertNull(item25);
        org.junit.Assert.assertNotNull(itemArray31);
    }

    @Test
    public void test253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test253");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax(0);
        ds.FPHeapMax fPHeapMax3 = new ds.FPHeapMax((int) (byte) 1);
        ds.FPHeapMax fPHeapMax5 = new ds.FPHeapMax((int) (byte) 1);
        ds.Item item6 = null;
        ds.Item[] itemArray7 = new ds.Item[] { item6 };
        fPHeapMax5.copia(itemArray7);
        fPHeapMax3.copia(itemArray7);
        fPHeapMax1.copia(itemArray7);
        ds.FPHeapMax fPHeapMax13 = new ds.FPHeapMax((int) '4');
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMax1.aumentaChave((int) (short) 0, (java.lang.Object) fPHeapMax13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray7);
    }

    @Test
    public void test254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test254");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) ' ');
        fPHeapMax1.imprime();
        ds.FPHeapMax fPHeapMax5 = new ds.FPHeapMax((int) (byte) 1);
        ds.Item item6 = null;
        ds.Item[] itemArray7 = new ds.Item[] { item6 };
        fPHeapMax5.copia(itemArray7);
        ds.Item item9 = fPHeapMax5.max();
        ds.Item item10 = fPHeapMax5.max();
        fPHeapMax5.imprime();
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMax1.aumentaChave(0, (java.lang.Object) fPHeapMax5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray7);
        org.junit.Assert.assertNull(item9);
        org.junit.Assert.assertNull(item10);
    }

    @Test
    public void test255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test255");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (short) 1);
        ds.FPHeapMax fPHeapMax3 = new ds.FPHeapMax(0);
        ds.FPHeapMax fPHeapMax5 = new ds.FPHeapMax((int) (byte) 1);
        ds.FPHeapMax fPHeapMax7 = new ds.FPHeapMax((int) (byte) 1);
        ds.Item item8 = null;
        ds.Item[] itemArray9 = new ds.Item[] { item8 };
        fPHeapMax7.copia(itemArray9);
        fPHeapMax5.copia(itemArray9);
        fPHeapMax3.copia(itemArray9);
        fPHeapMax1.copia(itemArray9);
        fPHeapMax1.imprime();
        ds.Item item15 = null;
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMax1.insere(item15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray9);
    }

    @Test
    public void test256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test256");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (byte) 1);
        ds.Item item2 = null;
        ds.Item[] itemArray3 = new ds.Item[] { item2 };
        fPHeapMax1.copia(itemArray3);
        ds.Item item5 = fPHeapMax1.max();
        fPHeapMax1.imprime();
        ds.FPHeapMax fPHeapMax8 = new ds.FPHeapMax((int) ' ');
        fPHeapMax8.refaz((int) (short) 1, (int) (short) 1);
        ds.Item item12 = fPHeapMax8.max();
        ds.FPHeapMax fPHeapMax14 = new ds.FPHeapMax((int) (byte) 1);
        ds.Item item15 = null;
        ds.Item[] itemArray16 = new ds.Item[] { item15 };
        fPHeapMax14.copia(itemArray16);
        fPHeapMax8.copia(itemArray16);
        fPHeapMax8.constroi();
        ds.FPHeapMax fPHeapMax21 = new ds.FPHeapMax((int) (byte) 1);
        ds.Item item22 = null;
        ds.Item[] itemArray23 = new ds.Item[] { item22 };
        fPHeapMax21.copia(itemArray23);
        fPHeapMax8.copia(itemArray23);
        fPHeapMax1.copia(itemArray23);
        fPHeapMax1.constroi();
        // The following exception was thrown during execution in test generation
        try {
            ds.Item item28 = fPHeapMax1.retiraMax();
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: heap vazio");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertNull(item5);
        org.junit.Assert.assertNull(item12);
        org.junit.Assert.assertNotNull(itemArray16);
        org.junit.Assert.assertNotNull(itemArray23);
    }

    @Test
    public void test257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test257");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (byte) 1);
        ds.Item item2 = fPHeapMax1.max();
        fPHeapMax1.imprime();
        fPHeapMax1.constroi();
        fPHeapMax1.refaz((int) (byte) 1, 0);
        ds.Item item8 = fPHeapMax1.max();
        fPHeapMax1.constroi();
        org.junit.Assert.assertNull(item2);
        org.junit.Assert.assertNull(item8);
    }

    @Test
    public void test258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test258");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (byte) 1);
        ds.Item item2 = null;
        ds.Item[] itemArray3 = new ds.Item[] { item2 };
        fPHeapMax1.copia(itemArray3);
        ds.Item item5 = fPHeapMax1.max();
        ds.Item item6 = fPHeapMax1.max();
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMax1.refaz((int) '#', 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 35");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertNull(item5);
        org.junit.Assert.assertNull(item6);
    }

    @Test
    public void test259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test259");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) ' ');
        fPHeapMax1.imprime();
        ds.FPHeapMax fPHeapMax4 = new ds.FPHeapMax((int) (byte) 1);
        ds.Item item5 = null;
        ds.Item[] itemArray6 = new ds.Item[] { item5 };
        fPHeapMax4.copia(itemArray6);
        ds.Item item8 = fPHeapMax4.max();
        fPHeapMax4.constroi();
        fPHeapMax4.constroi();
        ds.Item item11 = fPHeapMax4.max();
        fPHeapMax4.constroi();
        ds.Item item13 = fPHeapMax4.max();
        fPHeapMax4.imprime();
        ds.FPHeapMax fPHeapMax16 = new ds.FPHeapMax((int) (byte) 1);
        ds.Item item17 = null;
        ds.Item[] itemArray18 = new ds.Item[] { item17 };
        fPHeapMax16.copia(itemArray18);
        ds.Item item20 = fPHeapMax16.max();
        ds.FPHeapMax fPHeapMax22 = new ds.FPHeapMax((int) (byte) 1);
        ds.FPHeapMax fPHeapMax24 = new ds.FPHeapMax((int) (byte) 1);
        ds.Item item25 = null;
        ds.Item[] itemArray26 = new ds.Item[] { item25 };
        fPHeapMax24.copia(itemArray26);
        fPHeapMax22.copia(itemArray26);
        fPHeapMax16.copia(itemArray26);
        fPHeapMax4.copia(itemArray26);
        fPHeapMax1.copia(itemArray26);
        ds.FPHeapMax fPHeapMax33 = new ds.FPHeapMax(10);
        ds.FPHeapMax fPHeapMax35 = new ds.FPHeapMax((int) ' ');
        fPHeapMax35.imprime();
        ds.FPHeapMax fPHeapMax38 = new ds.FPHeapMax((int) (byte) 1);
        ds.FPHeapMax fPHeapMax40 = new ds.FPHeapMax((int) (byte) 1);
        ds.Item item41 = null;
        ds.Item[] itemArray42 = new ds.Item[] { item41 };
        fPHeapMax40.copia(itemArray42);
        fPHeapMax38.copia(itemArray42);
        fPHeapMax38.imprime();
        ds.FPHeapMax fPHeapMax47 = new ds.FPHeapMax((int) (byte) 1);
        ds.Item item48 = null;
        ds.Item[] itemArray49 = new ds.Item[] { item48 };
        fPHeapMax47.copia(itemArray49);
        ds.Item item51 = fPHeapMax47.max();
        ds.FPHeapMax fPHeapMax53 = new ds.FPHeapMax((int) (byte) 1);
        ds.FPHeapMax fPHeapMax55 = new ds.FPHeapMax((int) (byte) 1);
        ds.Item item56 = null;
        ds.Item[] itemArray57 = new ds.Item[] { item56 };
        fPHeapMax55.copia(itemArray57);
        fPHeapMax53.copia(itemArray57);
        fPHeapMax47.copia(itemArray57);
        fPHeapMax38.copia(itemArray57);
        fPHeapMax35.copia(itemArray57);
        fPHeapMax33.copia(itemArray57);
        fPHeapMax1.copia(itemArray57);
        // The following exception was thrown during execution in test generation
        try {
            ds.Item item65 = fPHeapMax1.retiraMax();
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: heap vazio");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray6);
        org.junit.Assert.assertNull(item8);
        org.junit.Assert.assertNull(item11);
        org.junit.Assert.assertNull(item13);
        org.junit.Assert.assertNotNull(itemArray18);
        org.junit.Assert.assertNull(item20);
        org.junit.Assert.assertNotNull(itemArray26);
        org.junit.Assert.assertNotNull(itemArray42);
        org.junit.Assert.assertNotNull(itemArray49);
        org.junit.Assert.assertNull(item51);
        org.junit.Assert.assertNotNull(itemArray57);
    }

    @Test
    public void test260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test260");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (byte) 0);
        fPHeapMax1.constroi();
        fPHeapMax1.imprime();
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
    public void test261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test261");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (byte) 1);
        ds.Item item2 = fPHeapMax1.max();
        fPHeapMax1.imprime();
        fPHeapMax1.constroi();
        fPHeapMax1.refaz((int) (byte) 1, 0);
        ds.FPHeapMax fPHeapMax9 = new ds.FPHeapMax((int) (short) 1);
        ds.FPHeapMax fPHeapMax11 = new ds.FPHeapMax(0);
        ds.FPHeapMax fPHeapMax13 = new ds.FPHeapMax((int) (byte) 1);
        ds.FPHeapMax fPHeapMax15 = new ds.FPHeapMax((int) (byte) 1);
        ds.Item item16 = null;
        ds.Item[] itemArray17 = new ds.Item[] { item16 };
        fPHeapMax15.copia(itemArray17);
        fPHeapMax13.copia(itemArray17);
        fPHeapMax11.copia(itemArray17);
        fPHeapMax9.copia(itemArray17);
        fPHeapMax9.imprime();
        ds.FPHeapMax fPHeapMax24 = new ds.FPHeapMax((int) ' ');
        fPHeapMax24.refaz((int) (short) 1, (int) (short) 1);
        ds.Item item28 = fPHeapMax24.max();
        ds.FPHeapMax fPHeapMax30 = new ds.FPHeapMax((int) (byte) 1);
        ds.Item item31 = null;
        ds.Item[] itemArray32 = new ds.Item[] { item31 };
        fPHeapMax30.copia(itemArray32);
        fPHeapMax24.copia(itemArray32);
        fPHeapMax9.copia(itemArray32);
        fPHeapMax1.copia(itemArray32);
        java.lang.Class<?> wildcardClass37 = itemArray32.getClass();
        org.junit.Assert.assertNull(item2);
        org.junit.Assert.assertNotNull(itemArray17);
        org.junit.Assert.assertNull(item28);
        org.junit.Assert.assertNotNull(itemArray32);
        org.junit.Assert.assertNotNull(wildcardClass37);
    }

    @Test
    public void test262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test262");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (byte) 1);
        ds.Item item2 = null;
        ds.Item[] itemArray3 = new ds.Item[] { item2 };
        fPHeapMax1.copia(itemArray3);
        ds.Item item5 = fPHeapMax1.max();
        fPHeapMax1.constroi();
        fPHeapMax1.constroi();
        ds.Item item8 = fPHeapMax1.max();
        fPHeapMax1.constroi();
        ds.Item item10 = fPHeapMax1.max();
        fPHeapMax1.constroi();
        fPHeapMax1.constroi();
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertNull(item5);
        org.junit.Assert.assertNull(item8);
        org.junit.Assert.assertNull(item10);
    }

    @Test
    public void test263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test263");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (byte) 1);
        ds.Item item2 = null;
        ds.Item[] itemArray3 = new ds.Item[] { item2 };
        fPHeapMax1.copia(itemArray3);
        ds.Item item5 = fPHeapMax1.max();
        fPHeapMax1.constroi();
        fPHeapMax1.constroi();
        ds.Item item8 = fPHeapMax1.max();
        fPHeapMax1.constroi();
        fPHeapMax1.constroi();
        ds.FPHeapMax fPHeapMax12 = new ds.FPHeapMax((int) (byte) 1);
        ds.FPHeapMax fPHeapMax14 = new ds.FPHeapMax((int) (byte) 1);
        ds.Item item15 = null;
        ds.Item[] itemArray16 = new ds.Item[] { item15 };
        fPHeapMax14.copia(itemArray16);
        fPHeapMax12.copia(itemArray16);
        fPHeapMax12.imprime();
        ds.FPHeapMax fPHeapMax21 = new ds.FPHeapMax((int) (byte) 1);
        ds.Item item22 = null;
        ds.Item[] itemArray23 = new ds.Item[] { item22 };
        fPHeapMax21.copia(itemArray23);
        ds.Item item25 = fPHeapMax21.max();
        ds.FPHeapMax fPHeapMax27 = new ds.FPHeapMax((int) (byte) 1);
        ds.FPHeapMax fPHeapMax29 = new ds.FPHeapMax((int) (byte) 1);
        ds.Item item30 = null;
        ds.Item[] itemArray31 = new ds.Item[] { item30 };
        fPHeapMax29.copia(itemArray31);
        fPHeapMax27.copia(itemArray31);
        fPHeapMax21.copia(itemArray31);
        fPHeapMax12.copia(itemArray31);
        fPHeapMax1.copia(itemArray31);
        ds.Item item37 = fPHeapMax1.max();
        fPHeapMax1.imprime();
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertNull(item5);
        org.junit.Assert.assertNull(item8);
        org.junit.Assert.assertNotNull(itemArray16);
        org.junit.Assert.assertNotNull(itemArray23);
        org.junit.Assert.assertNull(item25);
        org.junit.Assert.assertNotNull(itemArray31);
        org.junit.Assert.assertNull(item37);
    }

    @Test
    public void test264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test264");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) ' ');
        fPHeapMax1.refaz((int) (short) 1, (int) (short) 1);
        ds.Item item5 = fPHeapMax1.max();
        ds.FPHeapMax fPHeapMax7 = new ds.FPHeapMax((int) (byte) 1);
        ds.Item item8 = null;
        ds.Item[] itemArray9 = new ds.Item[] { item8 };
        fPHeapMax7.copia(itemArray9);
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
        org.junit.Assert.assertNotNull(itemArray9);
    }

    @Test
    public void test265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test265");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (short) 10);
        ds.FPHeapMax fPHeapMax3 = new ds.FPHeapMax((int) (byte) 1);
        ds.Item item4 = null;
        ds.Item[] itemArray5 = new ds.Item[] { item4 };
        fPHeapMax3.copia(itemArray5);
        ds.Item item7 = fPHeapMax3.max();
        fPHeapMax3.constroi();
        fPHeapMax3.constroi();
        ds.Item item10 = fPHeapMax3.max();
        fPHeapMax3.constroi();
        ds.Item item12 = fPHeapMax3.max();
        fPHeapMax3.constroi();
        fPHeapMax3.refaz((int) (byte) 1, (int) (byte) -1);
        ds.FPHeapMax fPHeapMax18 = new ds.FPHeapMax((int) (byte) 1);
        ds.Item item19 = null;
        ds.Item[] itemArray20 = new ds.Item[] { item19 };
        fPHeapMax18.copia(itemArray20);
        ds.Item item22 = fPHeapMax18.max();
        ds.FPHeapMax fPHeapMax24 = new ds.FPHeapMax((int) (byte) 1);
        ds.FPHeapMax fPHeapMax26 = new ds.FPHeapMax((int) (byte) 1);
        ds.Item item27 = null;
        ds.Item[] itemArray28 = new ds.Item[] { item27 };
        fPHeapMax26.copia(itemArray28);
        fPHeapMax24.copia(itemArray28);
        fPHeapMax18.copia(itemArray28);
        fPHeapMax3.copia(itemArray28);
        fPHeapMax1.copia(itemArray28);
        ds.Item[] itemArray34 = null;
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMax1.copia(itemArray34);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray5);
        org.junit.Assert.assertNull(item7);
        org.junit.Assert.assertNull(item10);
        org.junit.Assert.assertNull(item12);
        org.junit.Assert.assertNotNull(itemArray20);
        org.junit.Assert.assertNull(item22);
        org.junit.Assert.assertNotNull(itemArray28);
    }

    @Test
    public void test266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test266");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (byte) 1);
        ds.Item item2 = null;
        ds.Item[] itemArray3 = new ds.Item[] { item2 };
        fPHeapMax1.copia(itemArray3);
        ds.Item item5 = fPHeapMax1.max();
        fPHeapMax1.constroi();
        fPHeapMax1.constroi();
        ds.Item item8 = fPHeapMax1.max();
        fPHeapMax1.constroi();
        ds.Item item10 = fPHeapMax1.max();
        ds.Item item11 = fPHeapMax1.max();
        fPHeapMax1.imprime();
        // The following exception was thrown during execution in test generation
        try {
            ds.Item item13 = fPHeapMax1.retiraMax();
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: heap vazio");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertNull(item5);
        org.junit.Assert.assertNull(item8);
        org.junit.Assert.assertNull(item10);
        org.junit.Assert.assertNull(item11);
    }

    @Test
    public void test267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test267");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) ' ');
        fPHeapMax1.imprime();
        ds.FPHeapMax fPHeapMax4 = new ds.FPHeapMax((int) (byte) 1);
        ds.Item item5 = null;
        ds.Item[] itemArray6 = new ds.Item[] { item5 };
        fPHeapMax4.copia(itemArray6);
        ds.Item item8 = fPHeapMax4.max();
        fPHeapMax4.constroi();
        fPHeapMax4.constroi();
        ds.Item item11 = fPHeapMax4.max();
        fPHeapMax4.constroi();
        ds.Item item13 = fPHeapMax4.max();
        fPHeapMax4.imprime();
        ds.FPHeapMax fPHeapMax16 = new ds.FPHeapMax((int) (byte) 1);
        ds.Item item17 = null;
        ds.Item[] itemArray18 = new ds.Item[] { item17 };
        fPHeapMax16.copia(itemArray18);
        ds.Item item20 = fPHeapMax16.max();
        ds.FPHeapMax fPHeapMax22 = new ds.FPHeapMax((int) (byte) 1);
        ds.FPHeapMax fPHeapMax24 = new ds.FPHeapMax((int) (byte) 1);
        ds.Item item25 = null;
        ds.Item[] itemArray26 = new ds.Item[] { item25 };
        fPHeapMax24.copia(itemArray26);
        fPHeapMax22.copia(itemArray26);
        fPHeapMax16.copia(itemArray26);
        fPHeapMax4.copia(itemArray26);
        fPHeapMax1.copia(itemArray26);
        ds.FPHeapMax fPHeapMax33 = new ds.FPHeapMax(10);
        ds.FPHeapMax fPHeapMax35 = new ds.FPHeapMax((int) ' ');
        fPHeapMax35.imprime();
        ds.FPHeapMax fPHeapMax38 = new ds.FPHeapMax((int) (byte) 1);
        ds.FPHeapMax fPHeapMax40 = new ds.FPHeapMax((int) (byte) 1);
        ds.Item item41 = null;
        ds.Item[] itemArray42 = new ds.Item[] { item41 };
        fPHeapMax40.copia(itemArray42);
        fPHeapMax38.copia(itemArray42);
        fPHeapMax38.imprime();
        ds.FPHeapMax fPHeapMax47 = new ds.FPHeapMax((int) (byte) 1);
        ds.Item item48 = null;
        ds.Item[] itemArray49 = new ds.Item[] { item48 };
        fPHeapMax47.copia(itemArray49);
        ds.Item item51 = fPHeapMax47.max();
        ds.FPHeapMax fPHeapMax53 = new ds.FPHeapMax((int) (byte) 1);
        ds.FPHeapMax fPHeapMax55 = new ds.FPHeapMax((int) (byte) 1);
        ds.Item item56 = null;
        ds.Item[] itemArray57 = new ds.Item[] { item56 };
        fPHeapMax55.copia(itemArray57);
        fPHeapMax53.copia(itemArray57);
        fPHeapMax47.copia(itemArray57);
        fPHeapMax38.copia(itemArray57);
        fPHeapMax35.copia(itemArray57);
        fPHeapMax33.copia(itemArray57);
        fPHeapMax1.copia(itemArray57);
        fPHeapMax1.imprime();
        ds.Item item66 = null;
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMax1.insere(item66);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray6);
        org.junit.Assert.assertNull(item8);
        org.junit.Assert.assertNull(item11);
        org.junit.Assert.assertNull(item13);
        org.junit.Assert.assertNotNull(itemArray18);
        org.junit.Assert.assertNull(item20);
        org.junit.Assert.assertNotNull(itemArray26);
        org.junit.Assert.assertNotNull(itemArray42);
        org.junit.Assert.assertNotNull(itemArray49);
        org.junit.Assert.assertNull(item51);
        org.junit.Assert.assertNotNull(itemArray57);
    }

    @Test
    public void test268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test268");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (byte) 1);
        ds.Item item2 = null;
        ds.Item[] itemArray3 = new ds.Item[] { item2 };
        fPHeapMax1.copia(itemArray3);
        ds.Item item5 = fPHeapMax1.max();
        fPHeapMax1.constroi();
        fPHeapMax1.constroi();
        ds.Item item8 = fPHeapMax1.max();
        fPHeapMax1.imprime();
        ds.Item item10 = fPHeapMax1.max();
        fPHeapMax1.imprime();
        fPHeapMax1.constroi();
        ds.Item item13 = fPHeapMax1.max();
        fPHeapMax1.constroi();
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertNull(item5);
        org.junit.Assert.assertNull(item8);
        org.junit.Assert.assertNull(item10);
        org.junit.Assert.assertNull(item13);
    }

    @Test
    public void test269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test269");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) ' ');
        fPHeapMax1.imprime();
        ds.FPHeapMax fPHeapMax4 = new ds.FPHeapMax((int) (byte) 1);
        ds.FPHeapMax fPHeapMax6 = new ds.FPHeapMax((int) (byte) 1);
        ds.Item item7 = null;
        ds.Item[] itemArray8 = new ds.Item[] { item7 };
        fPHeapMax6.copia(itemArray8);
        fPHeapMax4.copia(itemArray8);
        fPHeapMax4.imprime();
        ds.FPHeapMax fPHeapMax13 = new ds.FPHeapMax((int) (byte) 1);
        ds.Item item14 = null;
        ds.Item[] itemArray15 = new ds.Item[] { item14 };
        fPHeapMax13.copia(itemArray15);
        ds.Item item17 = fPHeapMax13.max();
        ds.FPHeapMax fPHeapMax19 = new ds.FPHeapMax((int) (byte) 1);
        ds.FPHeapMax fPHeapMax21 = new ds.FPHeapMax((int) (byte) 1);
        ds.Item item22 = null;
        ds.Item[] itemArray23 = new ds.Item[] { item22 };
        fPHeapMax21.copia(itemArray23);
        fPHeapMax19.copia(itemArray23);
        fPHeapMax13.copia(itemArray23);
        fPHeapMax4.copia(itemArray23);
        fPHeapMax1.copia(itemArray23);
        ds.FPHeapMax fPHeapMax30 = new ds.FPHeapMax((int) (byte) 1);
        ds.Item item31 = null;
        ds.Item[] itemArray32 = new ds.Item[] { item31 };
        fPHeapMax30.copia(itemArray32);
        ds.Item item34 = fPHeapMax30.max();
        fPHeapMax30.constroi();
        fPHeapMax30.constroi();
        ds.Item item37 = fPHeapMax30.max();
        fPHeapMax30.constroi();
        ds.Item item39 = fPHeapMax30.max();
        ds.Item item40 = fPHeapMax30.max();
        ds.Item item41 = fPHeapMax30.max();
        fPHeapMax30.imprime();
        ds.FPHeapMax fPHeapMax44 = new ds.FPHeapMax((int) (byte) 1);
        ds.Item item45 = fPHeapMax44.max();
        fPHeapMax44.imprime();
        fPHeapMax44.constroi();
        fPHeapMax44.refaz((int) (byte) 1, 0);
        ds.FPHeapMax fPHeapMax52 = new ds.FPHeapMax(0);
        ds.FPHeapMax fPHeapMax54 = new ds.FPHeapMax((int) (byte) 1);
        ds.FPHeapMax fPHeapMax56 = new ds.FPHeapMax((int) (byte) 1);
        ds.Item item57 = null;
        ds.Item[] itemArray58 = new ds.Item[] { item57 };
        fPHeapMax56.copia(itemArray58);
        fPHeapMax54.copia(itemArray58);
        fPHeapMax52.copia(itemArray58);
        fPHeapMax44.copia(itemArray58);
        fPHeapMax30.copia(itemArray58);
        fPHeapMax1.copia(itemArray58);
        ds.Item item65 = null;
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMax1.insere(item65);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray8);
        org.junit.Assert.assertNotNull(itemArray15);
        org.junit.Assert.assertNull(item17);
        org.junit.Assert.assertNotNull(itemArray23);
        org.junit.Assert.assertNotNull(itemArray32);
        org.junit.Assert.assertNull(item34);
        org.junit.Assert.assertNull(item37);
        org.junit.Assert.assertNull(item39);
        org.junit.Assert.assertNull(item40);
        org.junit.Assert.assertNull(item41);
        org.junit.Assert.assertNull(item45);
        org.junit.Assert.assertNotNull(itemArray58);
    }

    @Test
    public void test270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test270");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (byte) 1);
        ds.Item item2 = fPHeapMax1.max();
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMax1.aumentaChave((int) '#', (java.lang.Object) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 35");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(item2);
    }

    @Test
    public void test271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test271");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (byte) 1);
        ds.Item item2 = null;
        ds.Item[] itemArray3 = new ds.Item[] { item2 };
        fPHeapMax1.copia(itemArray3);
        ds.Item item5 = fPHeapMax1.max();
        fPHeapMax1.constroi();
        fPHeapMax1.constroi();
        ds.Item item8 = fPHeapMax1.max();
        fPHeapMax1.constroi();
        ds.Item item10 = fPHeapMax1.max();
        fPHeapMax1.constroi();
        fPHeapMax1.refaz((int) (byte) 1, (int) (byte) -1);
        ds.FPHeapMax fPHeapMax16 = new ds.FPHeapMax((int) (short) 10);
        ds.FPHeapMax fPHeapMax18 = new ds.FPHeapMax((int) (byte) 1);
        ds.Item item19 = null;
        ds.Item[] itemArray20 = new ds.Item[] { item19 };
        fPHeapMax18.copia(itemArray20);
        ds.Item item22 = fPHeapMax18.max();
        fPHeapMax18.constroi();
        fPHeapMax18.constroi();
        ds.Item item25 = fPHeapMax18.max();
        fPHeapMax18.constroi();
        ds.Item item27 = fPHeapMax18.max();
        fPHeapMax18.constroi();
        fPHeapMax18.imprime();
        ds.FPHeapMax fPHeapMax31 = new ds.FPHeapMax((int) (byte) 1);
        ds.Item item32 = null;
        ds.Item[] itemArray33 = new ds.Item[] { item32 };
        fPHeapMax31.copia(itemArray33);
        fPHeapMax18.copia(itemArray33);
        fPHeapMax16.copia(itemArray33);
        fPHeapMax1.copia(itemArray33);
        fPHeapMax1.imprime();
        // The following exception was thrown during execution in test generation
        try {
            ds.Item item39 = fPHeapMax1.retiraMax();
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: heap vazio");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertNull(item5);
        org.junit.Assert.assertNull(item8);
        org.junit.Assert.assertNull(item10);
        org.junit.Assert.assertNotNull(itemArray20);
        org.junit.Assert.assertNull(item22);
        org.junit.Assert.assertNull(item25);
        org.junit.Assert.assertNull(item27);
        org.junit.Assert.assertNotNull(itemArray33);
    }

    @Test
    public void test272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test272");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (byte) 1);
        ds.Item item2 = null;
        ds.Item[] itemArray3 = new ds.Item[] { item2 };
        fPHeapMax1.copia(itemArray3);
        ds.Item item5 = fPHeapMax1.max();
        fPHeapMax1.constroi();
        fPHeapMax1.constroi();
        ds.Item item8 = fPHeapMax1.max();
        fPHeapMax1.constroi();
        ds.Item item10 = fPHeapMax1.max();
        ds.Item item11 = fPHeapMax1.max();
        fPHeapMax1.imprime();
        fPHeapMax1.imprime();
        ds.FPHeapMax fPHeapMax16 = new ds.FPHeapMax((int) (byte) 1);
        ds.Item item17 = null;
        ds.Item[] itemArray18 = new ds.Item[] { item17 };
        fPHeapMax16.copia(itemArray18);
        ds.Item item20 = fPHeapMax16.max();
        fPHeapMax16.constroi();
        fPHeapMax16.constroi();
        ds.Item item23 = fPHeapMax16.max();
        fPHeapMax16.constroi();
        fPHeapMax16.refaz(0, (int) (short) -1);
        fPHeapMax16.imprime();
        fPHeapMax16.imprime();
        fPHeapMax16.imprime();
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMax1.aumentaChave((int) '4', (java.lang.Object) fPHeapMax16);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 52");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertNull(item5);
        org.junit.Assert.assertNull(item8);
        org.junit.Assert.assertNull(item10);
        org.junit.Assert.assertNull(item11);
        org.junit.Assert.assertNotNull(itemArray18);
        org.junit.Assert.assertNull(item20);
        org.junit.Assert.assertNull(item23);
    }

    @Test
    public void test273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test273");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (byte) 1);
        ds.Item item2 = null;
        ds.Item[] itemArray3 = new ds.Item[] { item2 };
        fPHeapMax1.copia(itemArray3);
        ds.Item item5 = fPHeapMax1.max();
        fPHeapMax1.imprime();
        ds.Item item7 = fPHeapMax1.max();
        ds.FPHeapMax fPHeapMax10 = new ds.FPHeapMax((int) (byte) 1);
        ds.Item item11 = null;
        ds.Item[] itemArray12 = new ds.Item[] { item11 };
        fPHeapMax10.copia(itemArray12);
        ds.Item item14 = fPHeapMax10.max();
        fPHeapMax10.constroi();
        fPHeapMax10.constroi();
        ds.Item item17 = fPHeapMax10.max();
        fPHeapMax10.constroi();
        ds.Item item19 = fPHeapMax10.max();
        fPHeapMax10.imprime();
        fPHeapMax10.constroi();
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMax1.aumentaChave((int) (byte) 10, (java.lang.Object) fPHeapMax10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 10");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertNull(item5);
        org.junit.Assert.assertNull(item7);
        org.junit.Assert.assertNotNull(itemArray12);
        org.junit.Assert.assertNull(item14);
        org.junit.Assert.assertNull(item17);
        org.junit.Assert.assertNull(item19);
    }

    @Test
    public void test274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test274");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (short) 1);
        fPHeapMax1.imprime();
        ds.FPHeapMax fPHeapMax4 = new ds.FPHeapMax((int) (short) 1);
        ds.FPHeapMax fPHeapMax6 = new ds.FPHeapMax(0);
        ds.FPHeapMax fPHeapMax8 = new ds.FPHeapMax((int) (byte) 1);
        ds.FPHeapMax fPHeapMax10 = new ds.FPHeapMax((int) (byte) 1);
        ds.Item item11 = null;
        ds.Item[] itemArray12 = new ds.Item[] { item11 };
        fPHeapMax10.copia(itemArray12);
        fPHeapMax8.copia(itemArray12);
        fPHeapMax6.copia(itemArray12);
        fPHeapMax4.copia(itemArray12);
        fPHeapMax1.copia(itemArray12);
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMax1.refaz((int) (byte) 10, (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 10");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray12);
    }

    @Test
    public void test275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test275");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (byte) 1);
        ds.Item item2 = null;
        ds.Item[] itemArray3 = new ds.Item[] { item2 };
        fPHeapMax1.copia(itemArray3);
        ds.Item item5 = fPHeapMax1.max();
        fPHeapMax1.constroi();
        fPHeapMax1.constroi();
        ds.Item item8 = fPHeapMax1.max();
        fPHeapMax1.constroi();
        ds.Item item10 = fPHeapMax1.max();
        fPHeapMax1.imprime();
        fPHeapMax1.constroi();
        fPHeapMax1.constroi();
        ds.FPHeapMax fPHeapMax16 = new ds.FPHeapMax((int) (byte) 1);
        ds.Item item17 = null;
        ds.Item[] itemArray18 = new ds.Item[] { item17 };
        fPHeapMax16.copia(itemArray18);
        ds.Item item20 = fPHeapMax16.max();
        fPHeapMax16.constroi();
        fPHeapMax16.constroi();
        ds.Item item23 = fPHeapMax16.max();
        fPHeapMax16.constroi();
        ds.Item item25 = fPHeapMax16.max();
        ds.FPHeapMax fPHeapMax27 = new ds.FPHeapMax((int) (byte) 1);
        ds.Item item28 = null;
        ds.Item[] itemArray29 = new ds.Item[] { item28 };
        fPHeapMax27.copia(itemArray29);
        ds.Item item31 = fPHeapMax27.max();
        ds.FPHeapMax fPHeapMax33 = new ds.FPHeapMax((int) (byte) 1);
        ds.FPHeapMax fPHeapMax35 = new ds.FPHeapMax((int) (byte) 1);
        ds.Item item36 = null;
        ds.Item[] itemArray37 = new ds.Item[] { item36 };
        fPHeapMax35.copia(itemArray37);
        fPHeapMax33.copia(itemArray37);
        fPHeapMax27.copia(itemArray37);
        fPHeapMax16.copia(itemArray37);
        fPHeapMax16.imprime();
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMax1.aumentaChave((int) (short) 100, (java.lang.Object) fPHeapMax16);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 100");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertNull(item5);
        org.junit.Assert.assertNull(item8);
        org.junit.Assert.assertNull(item10);
        org.junit.Assert.assertNotNull(itemArray18);
        org.junit.Assert.assertNull(item20);
        org.junit.Assert.assertNull(item23);
        org.junit.Assert.assertNull(item25);
        org.junit.Assert.assertNotNull(itemArray29);
        org.junit.Assert.assertNull(item31);
        org.junit.Assert.assertNotNull(itemArray37);
    }

    @Test
    public void test276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test276");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (byte) 1);
        ds.Item item2 = null;
        ds.Item[] itemArray3 = new ds.Item[] { item2 };
        fPHeapMax1.copia(itemArray3);
        fPHeapMax1.imprime();
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMax1.refaz((-1), 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray3);
    }

    @Test
    public void test277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test277");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (byte) 1);
        ds.Item item2 = null;
        ds.Item[] itemArray3 = new ds.Item[] { item2 };
        fPHeapMax1.copia(itemArray3);
        ds.Item item5 = fPHeapMax1.max();
        fPHeapMax1.constroi();
        fPHeapMax1.constroi();
        ds.Item item8 = fPHeapMax1.max();
        fPHeapMax1.constroi();
        ds.Item item10 = fPHeapMax1.max();
        fPHeapMax1.constroi();
        fPHeapMax1.imprime();
        ds.FPHeapMax fPHeapMax14 = new ds.FPHeapMax((int) (byte) 1);
        ds.Item item15 = null;
        ds.Item[] itemArray16 = new ds.Item[] { item15 };
        fPHeapMax14.copia(itemArray16);
        fPHeapMax1.copia(itemArray16);
        fPHeapMax1.constroi();
        fPHeapMax1.imprime();
        ds.Item item21 = fPHeapMax1.max();
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertNull(item5);
        org.junit.Assert.assertNull(item8);
        org.junit.Assert.assertNull(item10);
        org.junit.Assert.assertNotNull(itemArray16);
        org.junit.Assert.assertNull(item21);
    }

    @Test
    public void test278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test278");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (byte) 1);
        ds.Item item2 = null;
        ds.Item[] itemArray3 = new ds.Item[] { item2 };
        fPHeapMax1.copia(itemArray3);
        ds.Item item5 = fPHeapMax1.max();
        fPHeapMax1.constroi();
        fPHeapMax1.constroi();
        ds.Item item8 = fPHeapMax1.max();
        fPHeapMax1.constroi();
        ds.Item item10 = fPHeapMax1.max();
        fPHeapMax1.imprime();
        fPHeapMax1.imprime();
        ds.Item item13 = fPHeapMax1.max();
        ds.Item item14 = null;
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMax1.insere(item14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertNull(item5);
        org.junit.Assert.assertNull(item8);
        org.junit.Assert.assertNull(item10);
        org.junit.Assert.assertNull(item13);
    }

    @Test
    public void test279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test279");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (byte) 1);
        ds.Item item2 = null;
        ds.Item[] itemArray3 = new ds.Item[] { item2 };
        fPHeapMax1.copia(itemArray3);
        ds.Item item5 = fPHeapMax1.max();
        ds.FPHeapMax fPHeapMax7 = new ds.FPHeapMax((int) (byte) 1);
        ds.FPHeapMax fPHeapMax9 = new ds.FPHeapMax((int) (byte) 1);
        ds.Item item10 = null;
        ds.Item[] itemArray11 = new ds.Item[] { item10 };
        fPHeapMax9.copia(itemArray11);
        fPHeapMax7.copia(itemArray11);
        fPHeapMax1.copia(itemArray11);
        ds.FPHeapMax fPHeapMax16 = new ds.FPHeapMax((int) (byte) 1);
        ds.Item item17 = null;
        ds.Item[] itemArray18 = new ds.Item[] { item17 };
        fPHeapMax16.copia(itemArray18);
        fPHeapMax1.copia(itemArray18);
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMax1.refaz((int) '#', (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 35");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertNull(item5);
        org.junit.Assert.assertNotNull(itemArray11);
        org.junit.Assert.assertNotNull(itemArray18);
    }

    @Test
    public void test280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test280");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (byte) 1);
        ds.Item item2 = null;
        ds.Item[] itemArray3 = new ds.Item[] { item2 };
        fPHeapMax1.copia(itemArray3);
        ds.Item item5 = fPHeapMax1.max();
        fPHeapMax1.constroi();
        fPHeapMax1.imprime();
        fPHeapMax1.constroi();
        fPHeapMax1.constroi();
        ds.FPHeapMax fPHeapMax12 = new ds.FPHeapMax((int) '4');
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMax1.aumentaChave((int) (short) -1, (java.lang.Object) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertNull(item5);
    }

    @Test
    public void test281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test281");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (byte) 1);
        ds.Item item2 = null;
        ds.Item[] itemArray3 = new ds.Item[] { item2 };
        fPHeapMax1.copia(itemArray3);
        ds.Item item5 = fPHeapMax1.max();
        fPHeapMax1.constroi();
        fPHeapMax1.constroi();
        ds.Item item8 = fPHeapMax1.max();
        fPHeapMax1.constroi();
        fPHeapMax1.refaz(0, (int) (short) -1);
        ds.FPHeapMax fPHeapMax14 = new ds.FPHeapMax((int) (byte) 1);
        ds.Item item15 = null;
        ds.Item[] itemArray16 = new ds.Item[] { item15 };
        fPHeapMax14.copia(itemArray16);
        ds.Item item18 = fPHeapMax14.max();
        fPHeapMax14.constroi();
        fPHeapMax14.constroi();
        ds.Item item21 = fPHeapMax14.max();
        fPHeapMax14.constroi();
        ds.Item item23 = fPHeapMax14.max();
        fPHeapMax14.constroi();
        fPHeapMax14.refaz((int) (byte) 1, (int) (byte) -1);
        ds.FPHeapMax fPHeapMax29 = new ds.FPHeapMax((int) (byte) 1);
        ds.Item item30 = null;
        ds.Item[] itemArray31 = new ds.Item[] { item30 };
        fPHeapMax29.copia(itemArray31);
        ds.Item item33 = fPHeapMax29.max();
        fPHeapMax29.constroi();
        fPHeapMax29.constroi();
        ds.Item item36 = fPHeapMax29.max();
        fPHeapMax29.constroi();
        ds.Item item38 = fPHeapMax29.max();
        fPHeapMax29.constroi();
        fPHeapMax29.imprime();
        ds.Item item41 = null;
        ds.Item[] itemArray42 = new ds.Item[] { item41 };
        fPHeapMax29.copia(itemArray42);
        fPHeapMax14.copia(itemArray42);
        fPHeapMax1.copia(itemArray42);
        java.lang.Class<?> wildcardClass46 = fPHeapMax1.getClass();
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertNull(item5);
        org.junit.Assert.assertNull(item8);
        org.junit.Assert.assertNotNull(itemArray16);
        org.junit.Assert.assertNull(item18);
        org.junit.Assert.assertNull(item21);
        org.junit.Assert.assertNull(item23);
        org.junit.Assert.assertNotNull(itemArray31);
        org.junit.Assert.assertNull(item33);
        org.junit.Assert.assertNull(item36);
        org.junit.Assert.assertNull(item38);
        org.junit.Assert.assertNotNull(itemArray42);
        org.junit.Assert.assertNotNull(wildcardClass46);
    }

    @Test
    public void test282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test282");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (short) 1);
        ds.FPHeapMax fPHeapMax3 = new ds.FPHeapMax(0);
        ds.FPHeapMax fPHeapMax5 = new ds.FPHeapMax((int) (byte) 1);
        ds.FPHeapMax fPHeapMax7 = new ds.FPHeapMax((int) (byte) 1);
        ds.Item item8 = null;
        ds.Item[] itemArray9 = new ds.Item[] { item8 };
        fPHeapMax7.copia(itemArray9);
        fPHeapMax5.copia(itemArray9);
        fPHeapMax3.copia(itemArray9);
        fPHeapMax1.copia(itemArray9);
        fPHeapMax1.imprime();
        ds.FPHeapMax fPHeapMax16 = new ds.FPHeapMax((int) ' ');
        fPHeapMax16.refaz((int) (short) 1, (int) (short) 1);
        ds.Item item20 = fPHeapMax16.max();
        ds.FPHeapMax fPHeapMax22 = new ds.FPHeapMax((int) (byte) 1);
        ds.Item item23 = null;
        ds.Item[] itemArray24 = new ds.Item[] { item23 };
        fPHeapMax22.copia(itemArray24);
        fPHeapMax16.copia(itemArray24);
        fPHeapMax1.copia(itemArray24);
        java.lang.Class<?> wildcardClass28 = itemArray24.getClass();
        org.junit.Assert.assertNotNull(itemArray9);
        org.junit.Assert.assertNull(item20);
        org.junit.Assert.assertNotNull(itemArray24);
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test283");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (byte) 0);
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
    public void test284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test284");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (byte) 1);
        ds.Item item2 = null;
        ds.Item[] itemArray3 = new ds.Item[] { item2 };
        fPHeapMax1.copia(itemArray3);
        ds.Item item5 = fPHeapMax1.max();
        fPHeapMax1.constroi();
        fPHeapMax1.constroi();
        ds.Item item8 = fPHeapMax1.max();
        fPHeapMax1.constroi();
        ds.Item item10 = fPHeapMax1.max();
        fPHeapMax1.constroi();
        fPHeapMax1.refaz((int) (byte) 1, (int) (byte) -1);
        ds.FPHeapMax fPHeapMax16 = new ds.FPHeapMax((int) (short) 10);
        ds.FPHeapMax fPHeapMax18 = new ds.FPHeapMax((int) (byte) 1);
        ds.Item item19 = null;
        ds.Item[] itemArray20 = new ds.Item[] { item19 };
        fPHeapMax18.copia(itemArray20);
        ds.Item item22 = fPHeapMax18.max();
        fPHeapMax18.constroi();
        fPHeapMax18.constroi();
        ds.Item item25 = fPHeapMax18.max();
        fPHeapMax18.constroi();
        ds.Item item27 = fPHeapMax18.max();
        fPHeapMax18.constroi();
        fPHeapMax18.imprime();
        ds.FPHeapMax fPHeapMax31 = new ds.FPHeapMax((int) (byte) 1);
        ds.Item item32 = null;
        ds.Item[] itemArray33 = new ds.Item[] { item32 };
        fPHeapMax31.copia(itemArray33);
        fPHeapMax18.copia(itemArray33);
        fPHeapMax16.copia(itemArray33);
        fPHeapMax1.copia(itemArray33);
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMax1.refaz((int) 'a', (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 97");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertNull(item5);
        org.junit.Assert.assertNull(item8);
        org.junit.Assert.assertNull(item10);
        org.junit.Assert.assertNotNull(itemArray20);
        org.junit.Assert.assertNull(item22);
        org.junit.Assert.assertNull(item25);
        org.junit.Assert.assertNull(item27);
        org.junit.Assert.assertNotNull(itemArray33);
    }

    @Test
    public void test285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test285");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (short) 1);
        fPHeapMax1.imprime();
        ds.FPHeapMax fPHeapMax4 = new ds.FPHeapMax((int) (short) 1);
        ds.FPHeapMax fPHeapMax6 = new ds.FPHeapMax(0);
        ds.FPHeapMax fPHeapMax8 = new ds.FPHeapMax((int) (byte) 1);
        ds.FPHeapMax fPHeapMax10 = new ds.FPHeapMax((int) (byte) 1);
        ds.Item item11 = null;
        ds.Item[] itemArray12 = new ds.Item[] { item11 };
        fPHeapMax10.copia(itemArray12);
        fPHeapMax8.copia(itemArray12);
        fPHeapMax6.copia(itemArray12);
        fPHeapMax4.copia(itemArray12);
        fPHeapMax1.copia(itemArray12);
        fPHeapMax1.constroi();
        org.junit.Assert.assertNotNull(itemArray12);
    }

    @Test
    public void test286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test286");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (byte) 1);
        ds.Item item2 = null;
        ds.Item[] itemArray3 = new ds.Item[] { item2 };
        fPHeapMax1.copia(itemArray3);
        ds.Item item5 = fPHeapMax1.max();
        fPHeapMax1.constroi();
        fPHeapMax1.constroi();
        ds.Item item8 = fPHeapMax1.max();
        fPHeapMax1.constroi();
        ds.Item item10 = fPHeapMax1.max();
        ds.Item item11 = fPHeapMax1.max();
        ds.FPHeapMax fPHeapMax14 = new ds.FPHeapMax((int) (byte) 1);
        ds.Item item15 = null;
        ds.Item[] itemArray16 = new ds.Item[] { item15 };
        fPHeapMax14.copia(itemArray16);
        ds.Item item18 = fPHeapMax14.max();
        fPHeapMax14.constroi();
        fPHeapMax14.constroi();
        ds.Item item21 = fPHeapMax14.max();
        fPHeapMax14.constroi();
        fPHeapMax14.imprime();
        ds.Item item24 = fPHeapMax14.max();
        ds.Item item25 = fPHeapMax14.max();
        ds.FPHeapMax fPHeapMax27 = new ds.FPHeapMax((int) ' ');
        fPHeapMax27.imprime();
        ds.FPHeapMax fPHeapMax30 = new ds.FPHeapMax((int) (byte) 1);
        ds.FPHeapMax fPHeapMax32 = new ds.FPHeapMax((int) (byte) 1);
        ds.Item item33 = null;
        ds.Item[] itemArray34 = new ds.Item[] { item33 };
        fPHeapMax32.copia(itemArray34);
        fPHeapMax30.copia(itemArray34);
        fPHeapMax30.imprime();
        ds.FPHeapMax fPHeapMax39 = new ds.FPHeapMax((int) (byte) 1);
        ds.Item item40 = null;
        ds.Item[] itemArray41 = new ds.Item[] { item40 };
        fPHeapMax39.copia(itemArray41);
        ds.Item item43 = fPHeapMax39.max();
        ds.FPHeapMax fPHeapMax45 = new ds.FPHeapMax((int) (byte) 1);
        ds.FPHeapMax fPHeapMax47 = new ds.FPHeapMax((int) (byte) 1);
        ds.Item item48 = null;
        ds.Item[] itemArray49 = new ds.Item[] { item48 };
        fPHeapMax47.copia(itemArray49);
        fPHeapMax45.copia(itemArray49);
        fPHeapMax39.copia(itemArray49);
        fPHeapMax30.copia(itemArray49);
        fPHeapMax27.copia(itemArray49);
        fPHeapMax14.copia(itemArray49);
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMax1.aumentaChave((int) (short) 10, (java.lang.Object) itemArray49);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 10");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertNull(item5);
        org.junit.Assert.assertNull(item8);
        org.junit.Assert.assertNull(item10);
        org.junit.Assert.assertNull(item11);
        org.junit.Assert.assertNotNull(itemArray16);
        org.junit.Assert.assertNull(item18);
        org.junit.Assert.assertNull(item21);
        org.junit.Assert.assertNull(item24);
        org.junit.Assert.assertNull(item25);
        org.junit.Assert.assertNotNull(itemArray34);
        org.junit.Assert.assertNotNull(itemArray41);
        org.junit.Assert.assertNull(item43);
        org.junit.Assert.assertNotNull(itemArray49);
    }

    @Test
    public void test287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test287");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (byte) 1);
        ds.Item item2 = fPHeapMax1.max();
        fPHeapMax1.imprime();
        fPHeapMax1.constroi();
        fPHeapMax1.refaz((int) (byte) 1, 0);
        ds.FPHeapMax fPHeapMax9 = new ds.FPHeapMax(0);
        ds.FPHeapMax fPHeapMax11 = new ds.FPHeapMax((int) (byte) 1);
        ds.FPHeapMax fPHeapMax13 = new ds.FPHeapMax((int) (byte) 1);
        ds.Item item14 = null;
        ds.Item[] itemArray15 = new ds.Item[] { item14 };
        fPHeapMax13.copia(itemArray15);
        fPHeapMax11.copia(itemArray15);
        fPHeapMax9.copia(itemArray15);
        fPHeapMax1.copia(itemArray15);
        ds.FPHeapMax fPHeapMax21 = new ds.FPHeapMax((int) (short) 1);
        fPHeapMax21.imprime();
        ds.FPHeapMax fPHeapMax24 = new ds.FPHeapMax((int) (short) 1);
        ds.FPHeapMax fPHeapMax26 = new ds.FPHeapMax(0);
        ds.FPHeapMax fPHeapMax28 = new ds.FPHeapMax((int) (byte) 1);
        ds.FPHeapMax fPHeapMax30 = new ds.FPHeapMax((int) (byte) 1);
        ds.Item item31 = null;
        ds.Item[] itemArray32 = new ds.Item[] { item31 };
        fPHeapMax30.copia(itemArray32);
        fPHeapMax28.copia(itemArray32);
        fPHeapMax26.copia(itemArray32);
        fPHeapMax24.copia(itemArray32);
        fPHeapMax21.copia(itemArray32);
        fPHeapMax1.copia(itemArray32);
        ds.FPHeapMax fPHeapMax41 = new ds.FPHeapMax((int) (byte) 1);
        ds.Item item42 = null;
        ds.Item[] itemArray43 = new ds.Item[] { item42 };
        fPHeapMax41.copia(itemArray43);
        ds.Item item45 = fPHeapMax41.max();
        fPHeapMax41.constroi();
        fPHeapMax41.constroi();
        ds.Item item48 = fPHeapMax41.max();
        fPHeapMax41.imprime();
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMax1.aumentaChave(0, (java.lang.Object) fPHeapMax41);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(item2);
        org.junit.Assert.assertNotNull(itemArray15);
        org.junit.Assert.assertNotNull(itemArray32);
        org.junit.Assert.assertNotNull(itemArray43);
        org.junit.Assert.assertNull(item45);
        org.junit.Assert.assertNull(item48);
    }

    @Test
    public void test288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test288");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (short) 1);
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
    public void test289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test289");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (short) 10);
        ds.FPHeapMax fPHeapMax3 = new ds.FPHeapMax((int) (byte) 1);
        ds.Item item4 = null;
        ds.Item[] itemArray5 = new ds.Item[] { item4 };
        fPHeapMax3.copia(itemArray5);
        ds.Item item7 = fPHeapMax3.max();
        fPHeapMax3.constroi();
        fPHeapMax3.constroi();
        ds.Item item10 = fPHeapMax3.max();
        fPHeapMax3.constroi();
        ds.Item item12 = fPHeapMax3.max();
        fPHeapMax3.constroi();
        fPHeapMax3.imprime();
        ds.FPHeapMax fPHeapMax16 = new ds.FPHeapMax((int) (byte) 1);
        ds.Item item17 = null;
        ds.Item[] itemArray18 = new ds.Item[] { item17 };
        fPHeapMax16.copia(itemArray18);
        fPHeapMax3.copia(itemArray18);
        fPHeapMax1.copia(itemArray18);
        ds.Item item22 = fPHeapMax1.max();
        ds.FPHeapMax fPHeapMax24 = new ds.FPHeapMax((int) (short) 10);
        ds.FPHeapMax fPHeapMax26 = new ds.FPHeapMax((int) (byte) 1);
        ds.Item item27 = null;
        ds.Item[] itemArray28 = new ds.Item[] { item27 };
        fPHeapMax26.copia(itemArray28);
        ds.Item item30 = fPHeapMax26.max();
        fPHeapMax26.constroi();
        fPHeapMax26.constroi();
        ds.Item item33 = fPHeapMax26.max();
        fPHeapMax26.constroi();
        ds.Item item35 = fPHeapMax26.max();
        fPHeapMax26.constroi();
        fPHeapMax26.imprime();
        ds.FPHeapMax fPHeapMax39 = new ds.FPHeapMax((int) (byte) 1);
        ds.Item item40 = null;
        ds.Item[] itemArray41 = new ds.Item[] { item40 };
        fPHeapMax39.copia(itemArray41);
        fPHeapMax26.copia(itemArray41);
        fPHeapMax24.copia(itemArray41);
        ds.Item item45 = fPHeapMax24.max();
        ds.FPHeapMax fPHeapMax47 = new ds.FPHeapMax((int) (byte) 1);
        ds.Item item48 = null;
        ds.Item[] itemArray49 = new ds.Item[] { item48 };
        fPHeapMax47.copia(itemArray49);
        ds.Item item51 = fPHeapMax47.max();
        fPHeapMax47.constroi();
        fPHeapMax47.constroi();
        ds.Item item54 = fPHeapMax47.max();
        fPHeapMax47.constroi();
        ds.Item item56 = fPHeapMax47.max();
        fPHeapMax47.constroi();
        fPHeapMax47.imprime();
        ds.FPHeapMax fPHeapMax60 = new ds.FPHeapMax((int) (byte) 1);
        ds.Item item61 = null;
        ds.Item[] itemArray62 = new ds.Item[] { item61 };
        fPHeapMax60.copia(itemArray62);
        fPHeapMax47.copia(itemArray62);
        fPHeapMax47.constroi();
        fPHeapMax47.imprime();
        ds.FPHeapMax fPHeapMax68 = new ds.FPHeapMax(0);
        ds.FPHeapMax fPHeapMax70 = new ds.FPHeapMax((int) (byte) 1);
        ds.FPHeapMax fPHeapMax72 = new ds.FPHeapMax((int) (byte) 1);
        ds.Item item73 = null;
        ds.Item[] itemArray74 = new ds.Item[] { item73 };
        fPHeapMax72.copia(itemArray74);
        fPHeapMax70.copia(itemArray74);
        fPHeapMax68.copia(itemArray74);
        fPHeapMax47.copia(itemArray74);
        fPHeapMax24.copia(itemArray74);
        fPHeapMax1.copia(itemArray74);
        // The following exception was thrown during execution in test generation
        try {
            ds.Item item81 = fPHeapMax1.retiraMax();
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: heap vazio");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray5);
        org.junit.Assert.assertNull(item7);
        org.junit.Assert.assertNull(item10);
        org.junit.Assert.assertNull(item12);
        org.junit.Assert.assertNotNull(itemArray18);
        org.junit.Assert.assertNull(item22);
        org.junit.Assert.assertNotNull(itemArray28);
        org.junit.Assert.assertNull(item30);
        org.junit.Assert.assertNull(item33);
        org.junit.Assert.assertNull(item35);
        org.junit.Assert.assertNotNull(itemArray41);
        org.junit.Assert.assertNull(item45);
        org.junit.Assert.assertNotNull(itemArray49);
        org.junit.Assert.assertNull(item51);
        org.junit.Assert.assertNull(item54);
        org.junit.Assert.assertNull(item56);
        org.junit.Assert.assertNotNull(itemArray62);
        org.junit.Assert.assertNotNull(itemArray74);
    }

    @Test
    public void test290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test290");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) ' ');
        fPHeapMax1.constroi();
        fPHeapMax1.constroi();
        ds.Item item4 = fPHeapMax1.max();
        org.junit.Assert.assertNull(item4);
    }

    @Test
    public void test291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test291");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (byte) 1);
        ds.Item item2 = null;
        ds.Item[] itemArray3 = new ds.Item[] { item2 };
        fPHeapMax1.copia(itemArray3);
        ds.Item item5 = fPHeapMax1.max();
        fPHeapMax1.constroi();
        fPHeapMax1.constroi();
        ds.Item item8 = fPHeapMax1.max();
        fPHeapMax1.constroi();
        ds.Item item10 = fPHeapMax1.max();
        fPHeapMax1.constroi();
        fPHeapMax1.refaz((int) (byte) 1, (int) (byte) -1);
        ds.FPHeapMax fPHeapMax16 = new ds.FPHeapMax((int) (byte) 1);
        ds.Item item17 = null;
        ds.Item[] itemArray18 = new ds.Item[] { item17 };
        fPHeapMax16.copia(itemArray18);
        ds.Item item20 = fPHeapMax16.max();
        ds.FPHeapMax fPHeapMax22 = new ds.FPHeapMax((int) (byte) 1);
        ds.FPHeapMax fPHeapMax24 = new ds.FPHeapMax((int) (byte) 1);
        ds.Item item25 = null;
        ds.Item[] itemArray26 = new ds.Item[] { item25 };
        fPHeapMax24.copia(itemArray26);
        fPHeapMax22.copia(itemArray26);
        fPHeapMax16.copia(itemArray26);
        fPHeapMax1.copia(itemArray26);
        fPHeapMax1.imprime();
        ds.FPHeapMax fPHeapMax34 = new ds.FPHeapMax((int) (byte) 1);
        ds.Item item35 = null;
        ds.Item[] itemArray36 = new ds.Item[] { item35 };
        fPHeapMax34.copia(itemArray36);
        ds.Item item38 = fPHeapMax34.max();
        fPHeapMax34.constroi();
        fPHeapMax34.constroi();
        ds.Item item41 = fPHeapMax34.max();
        fPHeapMax34.constroi();
        fPHeapMax34.constroi();
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMax1.aumentaChave((int) (byte) 1, (java.lang.Object) fPHeapMax34);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertNull(item5);
        org.junit.Assert.assertNull(item8);
        org.junit.Assert.assertNull(item10);
        org.junit.Assert.assertNotNull(itemArray18);
        org.junit.Assert.assertNull(item20);
        org.junit.Assert.assertNotNull(itemArray26);
        org.junit.Assert.assertNotNull(itemArray36);
        org.junit.Assert.assertNull(item38);
        org.junit.Assert.assertNull(item41);
    }

    @Test
    public void test292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test292");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (byte) 0);
        fPHeapMax1.imprime();
    }

    @Test
    public void test293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test293");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax(100);
        fPHeapMax1.refaz((int) 'a', 0);
        ds.FPHeapMax fPHeapMax7 = new ds.FPHeapMax((int) (byte) 1);
        ds.FPHeapMax fPHeapMax9 = new ds.FPHeapMax((int) (byte) 1);
        ds.Item item10 = null;
        ds.Item[] itemArray11 = new ds.Item[] { item10 };
        fPHeapMax9.copia(itemArray11);
        fPHeapMax7.copia(itemArray11);
        ds.Item item14 = fPHeapMax7.max();
        fPHeapMax7.constroi();
        fPHeapMax7.constroi();
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMax1.aumentaChave(100, (java.lang.Object) fPHeapMax7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray11);
        org.junit.Assert.assertNull(item14);
    }

    @Test
    public void test294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test294");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax(10);
        ds.FPHeapMax fPHeapMax3 = new ds.FPHeapMax((int) ' ');
        fPHeapMax3.imprime();
        ds.FPHeapMax fPHeapMax6 = new ds.FPHeapMax((int) (byte) 1);
        ds.FPHeapMax fPHeapMax8 = new ds.FPHeapMax((int) (byte) 1);
        ds.Item item9 = null;
        ds.Item[] itemArray10 = new ds.Item[] { item9 };
        fPHeapMax8.copia(itemArray10);
        fPHeapMax6.copia(itemArray10);
        fPHeapMax6.imprime();
        ds.FPHeapMax fPHeapMax15 = new ds.FPHeapMax((int) (byte) 1);
        ds.Item item16 = null;
        ds.Item[] itemArray17 = new ds.Item[] { item16 };
        fPHeapMax15.copia(itemArray17);
        ds.Item item19 = fPHeapMax15.max();
        ds.FPHeapMax fPHeapMax21 = new ds.FPHeapMax((int) (byte) 1);
        ds.FPHeapMax fPHeapMax23 = new ds.FPHeapMax((int) (byte) 1);
        ds.Item item24 = null;
        ds.Item[] itemArray25 = new ds.Item[] { item24 };
        fPHeapMax23.copia(itemArray25);
        fPHeapMax21.copia(itemArray25);
        fPHeapMax15.copia(itemArray25);
        fPHeapMax6.copia(itemArray25);
        fPHeapMax3.copia(itemArray25);
        fPHeapMax1.copia(itemArray25);
        ds.Item item32 = null;
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMax1.insere(item32);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray10);
        org.junit.Assert.assertNotNull(itemArray17);
        org.junit.Assert.assertNull(item19);
        org.junit.Assert.assertNotNull(itemArray25);
    }

    @Test
    public void test295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test295");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) ' ');
        fPHeapMax1.refaz((int) (short) 1, (int) (short) 1);
        fPHeapMax1.imprime();
        ds.FPHeapMax fPHeapMax8 = new ds.FPHeapMax((int) (byte) -1);
        fPHeapMax8.imprime();
        ds.FPHeapMax fPHeapMax11 = new ds.FPHeapMax((int) (short) 1);
        ds.FPHeapMax fPHeapMax13 = new ds.FPHeapMax(0);
        ds.FPHeapMax fPHeapMax15 = new ds.FPHeapMax((int) (byte) 1);
        ds.FPHeapMax fPHeapMax17 = new ds.FPHeapMax((int) (byte) 1);
        ds.Item item18 = null;
        ds.Item[] itemArray19 = new ds.Item[] { item18 };
        fPHeapMax17.copia(itemArray19);
        fPHeapMax15.copia(itemArray19);
        fPHeapMax13.copia(itemArray19);
        fPHeapMax11.copia(itemArray19);
        fPHeapMax11.imprime();
        ds.FPHeapMax fPHeapMax26 = new ds.FPHeapMax((int) ' ');
        fPHeapMax26.refaz((int) (short) 1, (int) (short) 1);
        ds.Item item30 = fPHeapMax26.max();
        ds.FPHeapMax fPHeapMax32 = new ds.FPHeapMax((int) (byte) 1);
        ds.Item item33 = null;
        ds.Item[] itemArray34 = new ds.Item[] { item33 };
        fPHeapMax32.copia(itemArray34);
        fPHeapMax26.copia(itemArray34);
        fPHeapMax11.copia(itemArray34);
        fPHeapMax8.copia(itemArray34);
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMax1.aumentaChave((int) (byte) -1, (java.lang.Object) fPHeapMax8);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray19);
        org.junit.Assert.assertNull(item30);
        org.junit.Assert.assertNotNull(itemArray34);
    }

    @Test
    public void test296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test296");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (short) 10);
        ds.FPHeapMax fPHeapMax3 = new ds.FPHeapMax((int) (byte) 1);
        ds.Item item4 = null;
        ds.Item[] itemArray5 = new ds.Item[] { item4 };
        fPHeapMax3.copia(itemArray5);
        ds.Item item7 = fPHeapMax3.max();
        fPHeapMax3.constroi();
        fPHeapMax3.constroi();
        ds.Item item10 = fPHeapMax3.max();
        fPHeapMax3.constroi();
        ds.Item item12 = fPHeapMax3.max();
        fPHeapMax3.constroi();
        fPHeapMax3.refaz((int) (byte) 1, (int) (byte) -1);
        ds.FPHeapMax fPHeapMax18 = new ds.FPHeapMax((int) (byte) 1);
        ds.Item item19 = null;
        ds.Item[] itemArray20 = new ds.Item[] { item19 };
        fPHeapMax18.copia(itemArray20);
        ds.Item item22 = fPHeapMax18.max();
        ds.FPHeapMax fPHeapMax24 = new ds.FPHeapMax((int) (byte) 1);
        ds.FPHeapMax fPHeapMax26 = new ds.FPHeapMax((int) (byte) 1);
        ds.Item item27 = null;
        ds.Item[] itemArray28 = new ds.Item[] { item27 };
        fPHeapMax26.copia(itemArray28);
        fPHeapMax24.copia(itemArray28);
        fPHeapMax18.copia(itemArray28);
        fPHeapMax3.copia(itemArray28);
        fPHeapMax1.copia(itemArray28);
        ds.Item item34 = null;
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMax1.insere(item34);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray5);
        org.junit.Assert.assertNull(item7);
        org.junit.Assert.assertNull(item10);
        org.junit.Assert.assertNull(item12);
        org.junit.Assert.assertNotNull(itemArray20);
        org.junit.Assert.assertNull(item22);
        org.junit.Assert.assertNotNull(itemArray28);
    }

    @Test
    public void test297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test297");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (byte) 100);
        fPHeapMax1.imprime();
        ds.FPHeapMax fPHeapMax5 = new ds.FPHeapMax(0);
        ds.FPHeapMax fPHeapMax7 = new ds.FPHeapMax((int) (byte) 1);
        ds.FPHeapMax fPHeapMax9 = new ds.FPHeapMax((int) (byte) 1);
        ds.Item item10 = null;
        ds.Item[] itemArray11 = new ds.Item[] { item10 };
        fPHeapMax9.copia(itemArray11);
        fPHeapMax7.copia(itemArray11);
        fPHeapMax5.copia(itemArray11);
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMax1.aumentaChave((int) (short) 10, (java.lang.Object) itemArray11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray11);
    }

    @Test
    public void test298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test298");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) ' ');
        fPHeapMax1.imprime();
        ds.FPHeapMax fPHeapMax4 = new ds.FPHeapMax((int) (byte) 1);
        ds.FPHeapMax fPHeapMax6 = new ds.FPHeapMax((int) (byte) 1);
        ds.Item item7 = null;
        ds.Item[] itemArray8 = new ds.Item[] { item7 };
        fPHeapMax6.copia(itemArray8);
        fPHeapMax4.copia(itemArray8);
        fPHeapMax4.imprime();
        ds.FPHeapMax fPHeapMax13 = new ds.FPHeapMax((int) (byte) 1);
        ds.Item item14 = null;
        ds.Item[] itemArray15 = new ds.Item[] { item14 };
        fPHeapMax13.copia(itemArray15);
        ds.Item item17 = fPHeapMax13.max();
        ds.FPHeapMax fPHeapMax19 = new ds.FPHeapMax((int) (byte) 1);
        ds.FPHeapMax fPHeapMax21 = new ds.FPHeapMax((int) (byte) 1);
        ds.Item item22 = null;
        ds.Item[] itemArray23 = new ds.Item[] { item22 };
        fPHeapMax21.copia(itemArray23);
        fPHeapMax19.copia(itemArray23);
        fPHeapMax13.copia(itemArray23);
        fPHeapMax4.copia(itemArray23);
        fPHeapMax1.copia(itemArray23);
        ds.FPHeapMax fPHeapMax30 = new ds.FPHeapMax((int) (byte) 1);
        ds.Item item31 = null;
        ds.Item[] itemArray32 = new ds.Item[] { item31 };
        fPHeapMax30.copia(itemArray32);
        ds.Item item34 = fPHeapMax30.max();
        fPHeapMax30.constroi();
        fPHeapMax30.constroi();
        ds.Item item37 = fPHeapMax30.max();
        fPHeapMax30.constroi();
        ds.Item item39 = fPHeapMax30.max();
        ds.Item item40 = fPHeapMax30.max();
        ds.Item item41 = fPHeapMax30.max();
        fPHeapMax30.imprime();
        ds.FPHeapMax fPHeapMax44 = new ds.FPHeapMax((int) (byte) 1);
        ds.Item item45 = fPHeapMax44.max();
        fPHeapMax44.imprime();
        fPHeapMax44.constroi();
        fPHeapMax44.refaz((int) (byte) 1, 0);
        ds.FPHeapMax fPHeapMax52 = new ds.FPHeapMax(0);
        ds.FPHeapMax fPHeapMax54 = new ds.FPHeapMax((int) (byte) 1);
        ds.FPHeapMax fPHeapMax56 = new ds.FPHeapMax((int) (byte) 1);
        ds.Item item57 = null;
        ds.Item[] itemArray58 = new ds.Item[] { item57 };
        fPHeapMax56.copia(itemArray58);
        fPHeapMax54.copia(itemArray58);
        fPHeapMax52.copia(itemArray58);
        fPHeapMax44.copia(itemArray58);
        fPHeapMax30.copia(itemArray58);
        fPHeapMax1.copia(itemArray58);
        fPHeapMax1.refaz((int) (short) 1, (int) (byte) -1);
        ds.Item item68 = fPHeapMax1.max();
        ds.Item item69 = fPHeapMax1.max();
        ds.Item item70 = null;
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMax1.insere(item70);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray8);
        org.junit.Assert.assertNotNull(itemArray15);
        org.junit.Assert.assertNull(item17);
        org.junit.Assert.assertNotNull(itemArray23);
        org.junit.Assert.assertNotNull(itemArray32);
        org.junit.Assert.assertNull(item34);
        org.junit.Assert.assertNull(item37);
        org.junit.Assert.assertNull(item39);
        org.junit.Assert.assertNull(item40);
        org.junit.Assert.assertNull(item41);
        org.junit.Assert.assertNull(item45);
        org.junit.Assert.assertNotNull(itemArray58);
        org.junit.Assert.assertNull(item68);
        org.junit.Assert.assertNull(item69);
    }

    @Test
    public void test299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test299");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (byte) 1);
        ds.Item item2 = null;
        ds.Item[] itemArray3 = new ds.Item[] { item2 };
        fPHeapMax1.copia(itemArray3);
        ds.Item item5 = fPHeapMax1.max();
        fPHeapMax1.constroi();
        fPHeapMax1.constroi();
        ds.Item item8 = fPHeapMax1.max();
        fPHeapMax1.constroi();
        ds.Item item10 = fPHeapMax1.max();
        ds.Item item11 = fPHeapMax1.max();
        fPHeapMax1.imprime();
        fPHeapMax1.imprime();
        java.lang.Class<?> wildcardClass14 = fPHeapMax1.getClass();
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertNull(item5);
        org.junit.Assert.assertNull(item8);
        org.junit.Assert.assertNull(item10);
        org.junit.Assert.assertNull(item11);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test300");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (short) 0);
        ds.FPHeapMax fPHeapMax3 = new ds.FPHeapMax((int) (byte) 1);
        ds.Item item4 = null;
        ds.Item[] itemArray5 = new ds.Item[] { item4 };
        fPHeapMax3.copia(itemArray5);
        ds.Item item7 = fPHeapMax3.max();
        fPHeapMax3.imprime();
        ds.FPHeapMax fPHeapMax10 = new ds.FPHeapMax((int) ' ');
        fPHeapMax10.refaz((int) (short) 1, (int) (short) 1);
        ds.Item item14 = fPHeapMax10.max();
        ds.FPHeapMax fPHeapMax16 = new ds.FPHeapMax((int) (byte) 1);
        ds.Item item17 = null;
        ds.Item[] itemArray18 = new ds.Item[] { item17 };
        fPHeapMax16.copia(itemArray18);
        fPHeapMax10.copia(itemArray18);
        fPHeapMax10.constroi();
        ds.FPHeapMax fPHeapMax23 = new ds.FPHeapMax((int) (byte) 1);
        ds.Item item24 = null;
        ds.Item[] itemArray25 = new ds.Item[] { item24 };
        fPHeapMax23.copia(itemArray25);
        fPHeapMax10.copia(itemArray25);
        fPHeapMax3.copia(itemArray25);
        fPHeapMax1.copia(itemArray25);
        // The following exception was thrown during execution in test generation
        try {
            ds.Item item30 = fPHeapMax1.retiraMax();
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: heap vazio");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray5);
        org.junit.Assert.assertNull(item7);
        org.junit.Assert.assertNull(item14);
        org.junit.Assert.assertNotNull(itemArray18);
        org.junit.Assert.assertNotNull(itemArray25);
    }

    @Test
    public void test301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test301");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (byte) 1);
        ds.Item item2 = null;
        ds.Item[] itemArray3 = new ds.Item[] { item2 };
        fPHeapMax1.copia(itemArray3);
        ds.Item item5 = fPHeapMax1.max();
        fPHeapMax1.constroi();
        fPHeapMax1.constroi();
        ds.Item item8 = fPHeapMax1.max();
        fPHeapMax1.constroi();
        fPHeapMax1.imprime();
        ds.FPHeapMax fPHeapMax12 = new ds.FPHeapMax((int) (short) 1);
        fPHeapMax12.imprime();
        fPHeapMax12.constroi();
        ds.FPHeapMax fPHeapMax16 = new ds.FPHeapMax((int) ' ');
        fPHeapMax16.imprime();
        ds.FPHeapMax fPHeapMax19 = new ds.FPHeapMax((int) (byte) 1);
        ds.Item item20 = null;
        ds.Item[] itemArray21 = new ds.Item[] { item20 };
        fPHeapMax19.copia(itemArray21);
        ds.Item item23 = fPHeapMax19.max();
        fPHeapMax19.constroi();
        fPHeapMax19.constroi();
        ds.Item item26 = fPHeapMax19.max();
        fPHeapMax19.constroi();
        ds.Item item28 = fPHeapMax19.max();
        fPHeapMax19.imprime();
        ds.FPHeapMax fPHeapMax31 = new ds.FPHeapMax((int) (byte) 1);
        ds.Item item32 = null;
        ds.Item[] itemArray33 = new ds.Item[] { item32 };
        fPHeapMax31.copia(itemArray33);
        ds.Item item35 = fPHeapMax31.max();
        ds.FPHeapMax fPHeapMax37 = new ds.FPHeapMax((int) (byte) 1);
        ds.FPHeapMax fPHeapMax39 = new ds.FPHeapMax((int) (byte) 1);
        ds.Item item40 = null;
        ds.Item[] itemArray41 = new ds.Item[] { item40 };
        fPHeapMax39.copia(itemArray41);
        fPHeapMax37.copia(itemArray41);
        fPHeapMax31.copia(itemArray41);
        fPHeapMax19.copia(itemArray41);
        fPHeapMax16.copia(itemArray41);
        ds.FPHeapMax fPHeapMax48 = new ds.FPHeapMax(10);
        ds.FPHeapMax fPHeapMax50 = new ds.FPHeapMax((int) ' ');
        fPHeapMax50.imprime();
        ds.FPHeapMax fPHeapMax53 = new ds.FPHeapMax((int) (byte) 1);
        ds.FPHeapMax fPHeapMax55 = new ds.FPHeapMax((int) (byte) 1);
        ds.Item item56 = null;
        ds.Item[] itemArray57 = new ds.Item[] { item56 };
        fPHeapMax55.copia(itemArray57);
        fPHeapMax53.copia(itemArray57);
        fPHeapMax53.imprime();
        ds.FPHeapMax fPHeapMax62 = new ds.FPHeapMax((int) (byte) 1);
        ds.Item item63 = null;
        ds.Item[] itemArray64 = new ds.Item[] { item63 };
        fPHeapMax62.copia(itemArray64);
        ds.Item item66 = fPHeapMax62.max();
        ds.FPHeapMax fPHeapMax68 = new ds.FPHeapMax((int) (byte) 1);
        ds.FPHeapMax fPHeapMax70 = new ds.FPHeapMax((int) (byte) 1);
        ds.Item item71 = null;
        ds.Item[] itemArray72 = new ds.Item[] { item71 };
        fPHeapMax70.copia(itemArray72);
        fPHeapMax68.copia(itemArray72);
        fPHeapMax62.copia(itemArray72);
        fPHeapMax53.copia(itemArray72);
        fPHeapMax50.copia(itemArray72);
        fPHeapMax48.copia(itemArray72);
        fPHeapMax16.copia(itemArray72);
        fPHeapMax12.copia(itemArray72);
        fPHeapMax1.copia(itemArray72);
        ds.Item item82 = null;
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMax1.insere(item82);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertNull(item5);
        org.junit.Assert.assertNull(item8);
        org.junit.Assert.assertNotNull(itemArray21);
        org.junit.Assert.assertNull(item23);
        org.junit.Assert.assertNull(item26);
        org.junit.Assert.assertNull(item28);
        org.junit.Assert.assertNotNull(itemArray33);
        org.junit.Assert.assertNull(item35);
        org.junit.Assert.assertNotNull(itemArray41);
        org.junit.Assert.assertNotNull(itemArray57);
        org.junit.Assert.assertNotNull(itemArray64);
        org.junit.Assert.assertNull(item66);
        org.junit.Assert.assertNotNull(itemArray72);
    }

    @Test
    public void test302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test302");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (byte) 1);
        ds.Item item2 = null;
        ds.Item[] itemArray3 = new ds.Item[] { item2 };
        fPHeapMax1.copia(itemArray3);
        ds.Item item5 = fPHeapMax1.max();
        fPHeapMax1.constroi();
        fPHeapMax1.constroi();
        ds.Item item8 = fPHeapMax1.max();
        fPHeapMax1.constroi();
        fPHeapMax1.refaz(0, (int) (short) -1);
        fPHeapMax1.imprime();
        fPHeapMax1.imprime();
        // The following exception was thrown during execution in test generation
        try {
            ds.Item item15 = fPHeapMax1.retiraMax();
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: heap vazio");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertNull(item5);
        org.junit.Assert.assertNull(item8);
    }

    @Test
    public void test303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test303");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax(100);
        fPHeapMax1.refaz((int) 'a', 0);
        // The following exception was thrown during execution in test generation
        try {
            ds.Item item5 = fPHeapMax1.retiraMax();
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: heap vazio");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
    }

    @Test
    public void test304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test304");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (byte) 1);
        ds.Item item2 = null;
        ds.Item[] itemArray3 = new ds.Item[] { item2 };
        fPHeapMax1.copia(itemArray3);
        ds.Item item5 = fPHeapMax1.max();
        fPHeapMax1.constroi();
        fPHeapMax1.constroi();
        ds.Item item8 = fPHeapMax1.max();
        fPHeapMax1.constroi();
        ds.Item item10 = fPHeapMax1.max();
        ds.Item item11 = fPHeapMax1.max();
        fPHeapMax1.imprime();
        fPHeapMax1.imprime();
        ds.Item item14 = null;
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMax1.insere(item14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertNull(item5);
        org.junit.Assert.assertNull(item8);
        org.junit.Assert.assertNull(item10);
        org.junit.Assert.assertNull(item11);
    }

    @Test
    public void test305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test305");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (byte) 1);
        ds.Item item2 = null;
        ds.Item[] itemArray3 = new ds.Item[] { item2 };
        fPHeapMax1.copia(itemArray3);
        ds.Item item5 = fPHeapMax1.max();
        fPHeapMax1.imprime();
        ds.FPHeapMax fPHeapMax8 = new ds.FPHeapMax((int) ' ');
        fPHeapMax8.refaz((int) (short) 1, (int) (short) 1);
        ds.Item item12 = fPHeapMax8.max();
        ds.FPHeapMax fPHeapMax14 = new ds.FPHeapMax((int) (byte) 1);
        ds.Item item15 = null;
        ds.Item[] itemArray16 = new ds.Item[] { item15 };
        fPHeapMax14.copia(itemArray16);
        fPHeapMax8.copia(itemArray16);
        fPHeapMax8.constroi();
        ds.FPHeapMax fPHeapMax21 = new ds.FPHeapMax((int) (byte) 1);
        ds.Item item22 = null;
        ds.Item[] itemArray23 = new ds.Item[] { item22 };
        fPHeapMax21.copia(itemArray23);
        fPHeapMax8.copia(itemArray23);
        fPHeapMax1.copia(itemArray23);
        ds.Item item27 = null;
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMax1.insere(item27);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertNull(item5);
        org.junit.Assert.assertNull(item12);
        org.junit.Assert.assertNotNull(itemArray16);
        org.junit.Assert.assertNotNull(itemArray23);
    }

    @Test
    public void test306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test306");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (byte) 1);
        ds.FPHeapMax fPHeapMax3 = new ds.FPHeapMax((int) (byte) 1);
        ds.Item item4 = null;
        ds.Item[] itemArray5 = new ds.Item[] { item4 };
        fPHeapMax3.copia(itemArray5);
        fPHeapMax1.copia(itemArray5);
        ds.Item item8 = fPHeapMax1.max();
        ds.Item item9 = fPHeapMax1.max();
        fPHeapMax1.constroi();
        fPHeapMax1.constroi();
        org.junit.Assert.assertNotNull(itemArray5);
        org.junit.Assert.assertNull(item8);
        org.junit.Assert.assertNull(item9);
    }

    @Test
    public void test307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test307");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (byte) 1);
        ds.Item item2 = null;
        ds.Item[] itemArray3 = new ds.Item[] { item2 };
        fPHeapMax1.copia(itemArray3);
        ds.Item item5 = fPHeapMax1.max();
        fPHeapMax1.constroi();
        fPHeapMax1.constroi();
        ds.Item item8 = fPHeapMax1.max();
        fPHeapMax1.constroi();
        ds.Item item10 = fPHeapMax1.max();
        ds.FPHeapMax fPHeapMax12 = new ds.FPHeapMax((int) (byte) 1);
        ds.Item item13 = null;
        ds.Item[] itemArray14 = new ds.Item[] { item13 };
        fPHeapMax12.copia(itemArray14);
        ds.Item item16 = fPHeapMax12.max();
        ds.FPHeapMax fPHeapMax18 = new ds.FPHeapMax((int) (byte) 1);
        ds.FPHeapMax fPHeapMax20 = new ds.FPHeapMax((int) (byte) 1);
        ds.Item item21 = null;
        ds.Item[] itemArray22 = new ds.Item[] { item21 };
        fPHeapMax20.copia(itemArray22);
        fPHeapMax18.copia(itemArray22);
        fPHeapMax12.copia(itemArray22);
        fPHeapMax1.copia(itemArray22);
        fPHeapMax1.imprime();
        ds.FPHeapMax fPHeapMax29 = new ds.FPHeapMax((int) (short) 1);
        fPHeapMax29.imprime();
        fPHeapMax29.constroi();
        ds.FPHeapMax fPHeapMax33 = new ds.FPHeapMax((int) ' ');
        fPHeapMax33.imprime();
        ds.FPHeapMax fPHeapMax36 = new ds.FPHeapMax((int) (byte) 1);
        ds.Item item37 = null;
        ds.Item[] itemArray38 = new ds.Item[] { item37 };
        fPHeapMax36.copia(itemArray38);
        ds.Item item40 = fPHeapMax36.max();
        fPHeapMax36.constroi();
        fPHeapMax36.constroi();
        ds.Item item43 = fPHeapMax36.max();
        fPHeapMax36.constroi();
        ds.Item item45 = fPHeapMax36.max();
        fPHeapMax36.imprime();
        ds.FPHeapMax fPHeapMax48 = new ds.FPHeapMax((int) (byte) 1);
        ds.Item item49 = null;
        ds.Item[] itemArray50 = new ds.Item[] { item49 };
        fPHeapMax48.copia(itemArray50);
        ds.Item item52 = fPHeapMax48.max();
        ds.FPHeapMax fPHeapMax54 = new ds.FPHeapMax((int) (byte) 1);
        ds.FPHeapMax fPHeapMax56 = new ds.FPHeapMax((int) (byte) 1);
        ds.Item item57 = null;
        ds.Item[] itemArray58 = new ds.Item[] { item57 };
        fPHeapMax56.copia(itemArray58);
        fPHeapMax54.copia(itemArray58);
        fPHeapMax48.copia(itemArray58);
        fPHeapMax36.copia(itemArray58);
        fPHeapMax33.copia(itemArray58);
        ds.FPHeapMax fPHeapMax65 = new ds.FPHeapMax(10);
        ds.FPHeapMax fPHeapMax67 = new ds.FPHeapMax((int) ' ');
        fPHeapMax67.imprime();
        ds.FPHeapMax fPHeapMax70 = new ds.FPHeapMax((int) (byte) 1);
        ds.FPHeapMax fPHeapMax72 = new ds.FPHeapMax((int) (byte) 1);
        ds.Item item73 = null;
        ds.Item[] itemArray74 = new ds.Item[] { item73 };
        fPHeapMax72.copia(itemArray74);
        fPHeapMax70.copia(itemArray74);
        fPHeapMax70.imprime();
        ds.FPHeapMax fPHeapMax79 = new ds.FPHeapMax((int) (byte) 1);
        ds.Item item80 = null;
        ds.Item[] itemArray81 = new ds.Item[] { item80 };
        fPHeapMax79.copia(itemArray81);
        ds.Item item83 = fPHeapMax79.max();
        ds.FPHeapMax fPHeapMax85 = new ds.FPHeapMax((int) (byte) 1);
        ds.FPHeapMax fPHeapMax87 = new ds.FPHeapMax((int) (byte) 1);
        ds.Item item88 = null;
        ds.Item[] itemArray89 = new ds.Item[] { item88 };
        fPHeapMax87.copia(itemArray89);
        fPHeapMax85.copia(itemArray89);
        fPHeapMax79.copia(itemArray89);
        fPHeapMax70.copia(itemArray89);
        fPHeapMax67.copia(itemArray89);
        fPHeapMax65.copia(itemArray89);
        fPHeapMax33.copia(itemArray89);
        fPHeapMax29.copia(itemArray89);
        fPHeapMax1.copia(itemArray89);
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertNull(item5);
        org.junit.Assert.assertNull(item8);
        org.junit.Assert.assertNull(item10);
        org.junit.Assert.assertNotNull(itemArray14);
        org.junit.Assert.assertNull(item16);
        org.junit.Assert.assertNotNull(itemArray22);
        org.junit.Assert.assertNotNull(itemArray38);
        org.junit.Assert.assertNull(item40);
        org.junit.Assert.assertNull(item43);
        org.junit.Assert.assertNull(item45);
        org.junit.Assert.assertNotNull(itemArray50);
        org.junit.Assert.assertNull(item52);
        org.junit.Assert.assertNotNull(itemArray58);
        org.junit.Assert.assertNotNull(itemArray74);
        org.junit.Assert.assertNotNull(itemArray81);
        org.junit.Assert.assertNull(item83);
        org.junit.Assert.assertNotNull(itemArray89);
    }

    @Test
    public void test308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test308");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (byte) 0);
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
    public void test309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test309");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (byte) 1);
        ds.Item item2 = null;
        ds.Item[] itemArray3 = new ds.Item[] { item2 };
        fPHeapMax1.copia(itemArray3);
        ds.Item item5 = fPHeapMax1.max();
        fPHeapMax1.constroi();
        fPHeapMax1.constroi();
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMax1.refaz((int) (byte) 0, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertNull(item5);
    }

    @Test
    public void test310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test310");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (byte) 1);
        ds.Item item2 = null;
        ds.Item[] itemArray3 = new ds.Item[] { item2 };
        fPHeapMax1.copia(itemArray3);
        ds.Item item5 = fPHeapMax1.max();
        fPHeapMax1.constroi();
        fPHeapMax1.imprime();
        fPHeapMax1.constroi();
        ds.Item item9 = null;
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMax1.insere(item9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertNull(item5);
    }

    @Test
    public void test311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test311");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (byte) 1);
        ds.Item item2 = null;
        ds.Item[] itemArray3 = new ds.Item[] { item2 };
        fPHeapMax1.copia(itemArray3);
        ds.Item item5 = fPHeapMax1.max();
        fPHeapMax1.constroi();
        fPHeapMax1.constroi();
        ds.Item item8 = fPHeapMax1.max();
        fPHeapMax1.constroi();
        ds.Item item10 = fPHeapMax1.max();
        fPHeapMax1.constroi();
        fPHeapMax1.imprime();
        ds.FPHeapMax fPHeapMax14 = new ds.FPHeapMax((int) (byte) 1);
        ds.Item item15 = null;
        ds.Item[] itemArray16 = new ds.Item[] { item15 };
        fPHeapMax14.copia(itemArray16);
        fPHeapMax1.copia(itemArray16);
        fPHeapMax1.constroi();
        fPHeapMax1.imprime();
        ds.FPHeapMax fPHeapMax23 = new ds.FPHeapMax((int) (short) 1);
        ds.FPHeapMax fPHeapMax25 = new ds.FPHeapMax(0);
        ds.FPHeapMax fPHeapMax27 = new ds.FPHeapMax((int) (byte) 1);
        ds.FPHeapMax fPHeapMax29 = new ds.FPHeapMax((int) (byte) 1);
        ds.Item item30 = null;
        ds.Item[] itemArray31 = new ds.Item[] { item30 };
        fPHeapMax29.copia(itemArray31);
        fPHeapMax27.copia(itemArray31);
        fPHeapMax25.copia(itemArray31);
        fPHeapMax23.copia(itemArray31);
        fPHeapMax23.imprime();
        ds.FPHeapMax fPHeapMax38 = new ds.FPHeapMax((int) ' ');
        fPHeapMax38.refaz((int) (short) 1, (int) (short) 1);
        ds.Item item42 = fPHeapMax38.max();
        ds.FPHeapMax fPHeapMax44 = new ds.FPHeapMax((int) (byte) 1);
        ds.Item item45 = null;
        ds.Item[] itemArray46 = new ds.Item[] { item45 };
        fPHeapMax44.copia(itemArray46);
        fPHeapMax38.copia(itemArray46);
        fPHeapMax23.copia(itemArray46);
        ds.FPHeapMax fPHeapMax51 = new ds.FPHeapMax((int) (byte) 1);
        ds.Item item52 = null;
        ds.Item[] itemArray53 = new ds.Item[] { item52 };
        fPHeapMax51.copia(itemArray53);
        ds.Item item55 = fPHeapMax51.max();
        fPHeapMax51.constroi();
        fPHeapMax51.constroi();
        ds.Item item58 = fPHeapMax51.max();
        fPHeapMax51.constroi();
        ds.Item item60 = fPHeapMax51.max();
        fPHeapMax51.imprime();
        ds.FPHeapMax fPHeapMax63 = new ds.FPHeapMax((int) (byte) 1);
        ds.Item item64 = null;
        ds.Item[] itemArray65 = new ds.Item[] { item64 };
        fPHeapMax63.copia(itemArray65);
        ds.Item item67 = fPHeapMax63.max();
        ds.FPHeapMax fPHeapMax69 = new ds.FPHeapMax((int) (byte) 1);
        ds.FPHeapMax fPHeapMax71 = new ds.FPHeapMax((int) (byte) 1);
        ds.Item item72 = null;
        ds.Item[] itemArray73 = new ds.Item[] { item72 };
        fPHeapMax71.copia(itemArray73);
        fPHeapMax69.copia(itemArray73);
        fPHeapMax63.copia(itemArray73);
        fPHeapMax51.copia(itemArray73);
        fPHeapMax23.copia(itemArray73);
        fPHeapMax23.constroi();
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMax1.aumentaChave(10, (java.lang.Object) fPHeapMax23);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 10");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertNull(item5);
        org.junit.Assert.assertNull(item8);
        org.junit.Assert.assertNull(item10);
        org.junit.Assert.assertNotNull(itemArray16);
        org.junit.Assert.assertNotNull(itemArray31);
        org.junit.Assert.assertNull(item42);
        org.junit.Assert.assertNotNull(itemArray46);
        org.junit.Assert.assertNotNull(itemArray53);
        org.junit.Assert.assertNull(item55);
        org.junit.Assert.assertNull(item58);
        org.junit.Assert.assertNull(item60);
        org.junit.Assert.assertNotNull(itemArray65);
        org.junit.Assert.assertNull(item67);
        org.junit.Assert.assertNotNull(itemArray73);
    }

    @Test
    public void test312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test312");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (byte) 10);
        fPHeapMax1.imprime();
    }

    @Test
    public void test313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test313");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (byte) 1);
        ds.Item item2 = null;
        ds.Item[] itemArray3 = new ds.Item[] { item2 };
        fPHeapMax1.copia(itemArray3);
        ds.Item item5 = fPHeapMax1.max();
        fPHeapMax1.constroi();
        fPHeapMax1.constroi();
        ds.Item item8 = fPHeapMax1.max();
        fPHeapMax1.imprime();
        ds.Item item10 = fPHeapMax1.max();
        fPHeapMax1.imprime();
        fPHeapMax1.imprime();
        fPHeapMax1.refaz(0, (-1));
        fPHeapMax1.imprime();
        ds.Item item17 = fPHeapMax1.max();
        fPHeapMax1.imprime();
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertNull(item5);
        org.junit.Assert.assertNull(item8);
        org.junit.Assert.assertNull(item10);
        org.junit.Assert.assertNull(item17);
    }

    @Test
    public void test314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test314");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (short) -1);
        java.lang.Class<?> wildcardClass2 = fPHeapMax1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test315");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (byte) 1);
        ds.Item item2 = null;
        ds.Item[] itemArray3 = new ds.Item[] { item2 };
        fPHeapMax1.copia(itemArray3);
        fPHeapMax1.constroi();
        ds.FPHeapMax fPHeapMax7 = new ds.FPHeapMax((int) ' ');
        fPHeapMax7.refaz((int) (short) 1, (int) (short) 1);
        ds.Item item11 = fPHeapMax7.max();
        ds.FPHeapMax fPHeapMax13 = new ds.FPHeapMax((int) (byte) 1);
        ds.Item item14 = null;
        ds.Item[] itemArray15 = new ds.Item[] { item14 };
        fPHeapMax13.copia(itemArray15);
        fPHeapMax7.copia(itemArray15);
        fPHeapMax7.constroi();
        ds.FPHeapMax fPHeapMax20 = new ds.FPHeapMax((int) (byte) 1);
        ds.Item item21 = null;
        ds.Item[] itemArray22 = new ds.Item[] { item21 };
        fPHeapMax20.copia(itemArray22);
        fPHeapMax7.copia(itemArray22);
        fPHeapMax1.copia(itemArray22);
        // The following exception was thrown during execution in test generation
        try {
            ds.Item item26 = fPHeapMax1.retiraMax();
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: heap vazio");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertNull(item11);
        org.junit.Assert.assertNotNull(itemArray15);
        org.junit.Assert.assertNotNull(itemArray22);
    }

    @Test
    public void test316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test316");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (byte) 1);
        ds.FPHeapMax fPHeapMax4 = new ds.FPHeapMax(0);
        fPHeapMax4.imprime();
        ds.FPHeapMax fPHeapMax7 = new ds.FPHeapMax((int) (short) 1);
        fPHeapMax7.imprime();
        fPHeapMax7.constroi();
        ds.FPHeapMax fPHeapMax11 = new ds.FPHeapMax((int) ' ');
        fPHeapMax11.imprime();
        ds.FPHeapMax fPHeapMax14 = new ds.FPHeapMax((int) (byte) 1);
        ds.Item item15 = null;
        ds.Item[] itemArray16 = new ds.Item[] { item15 };
        fPHeapMax14.copia(itemArray16);
        ds.Item item18 = fPHeapMax14.max();
        fPHeapMax14.constroi();
        fPHeapMax14.constroi();
        ds.Item item21 = fPHeapMax14.max();
        fPHeapMax14.constroi();
        ds.Item item23 = fPHeapMax14.max();
        fPHeapMax14.imprime();
        ds.FPHeapMax fPHeapMax26 = new ds.FPHeapMax((int) (byte) 1);
        ds.Item item27 = null;
        ds.Item[] itemArray28 = new ds.Item[] { item27 };
        fPHeapMax26.copia(itemArray28);
        ds.Item item30 = fPHeapMax26.max();
        ds.FPHeapMax fPHeapMax32 = new ds.FPHeapMax((int) (byte) 1);
        ds.FPHeapMax fPHeapMax34 = new ds.FPHeapMax((int) (byte) 1);
        ds.Item item35 = null;
        ds.Item[] itemArray36 = new ds.Item[] { item35 };
        fPHeapMax34.copia(itemArray36);
        fPHeapMax32.copia(itemArray36);
        fPHeapMax26.copia(itemArray36);
        fPHeapMax14.copia(itemArray36);
        fPHeapMax11.copia(itemArray36);
        ds.FPHeapMax fPHeapMax43 = new ds.FPHeapMax(10);
        ds.FPHeapMax fPHeapMax45 = new ds.FPHeapMax((int) ' ');
        fPHeapMax45.imprime();
        ds.FPHeapMax fPHeapMax48 = new ds.FPHeapMax((int) (byte) 1);
        ds.FPHeapMax fPHeapMax50 = new ds.FPHeapMax((int) (byte) 1);
        ds.Item item51 = null;
        ds.Item[] itemArray52 = new ds.Item[] { item51 };
        fPHeapMax50.copia(itemArray52);
        fPHeapMax48.copia(itemArray52);
        fPHeapMax48.imprime();
        ds.FPHeapMax fPHeapMax57 = new ds.FPHeapMax((int) (byte) 1);
        ds.Item item58 = null;
        ds.Item[] itemArray59 = new ds.Item[] { item58 };
        fPHeapMax57.copia(itemArray59);
        ds.Item item61 = fPHeapMax57.max();
        ds.FPHeapMax fPHeapMax63 = new ds.FPHeapMax((int) (byte) 1);
        ds.FPHeapMax fPHeapMax65 = new ds.FPHeapMax((int) (byte) 1);
        ds.Item item66 = null;
        ds.Item[] itemArray67 = new ds.Item[] { item66 };
        fPHeapMax65.copia(itemArray67);
        fPHeapMax63.copia(itemArray67);
        fPHeapMax57.copia(itemArray67);
        fPHeapMax48.copia(itemArray67);
        fPHeapMax45.copia(itemArray67);
        fPHeapMax43.copia(itemArray67);
        fPHeapMax11.copia(itemArray67);
        fPHeapMax7.copia(itemArray67);
        fPHeapMax4.copia(itemArray67);
        fPHeapMax4.constroi();
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMax1.aumentaChave((int) (byte) 0, (java.lang.Object) fPHeapMax4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray16);
        org.junit.Assert.assertNull(item18);
        org.junit.Assert.assertNull(item21);
        org.junit.Assert.assertNull(item23);
        org.junit.Assert.assertNotNull(itemArray28);
        org.junit.Assert.assertNull(item30);
        org.junit.Assert.assertNotNull(itemArray36);
        org.junit.Assert.assertNotNull(itemArray52);
        org.junit.Assert.assertNotNull(itemArray59);
        org.junit.Assert.assertNull(item61);
        org.junit.Assert.assertNotNull(itemArray67);
    }

    @Test
    public void test317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test317");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (byte) 1);
        ds.Item item2 = fPHeapMax1.max();
        fPHeapMax1.imprime();
        fPHeapMax1.constroi();
        fPHeapMax1.refaz((int) (byte) 1, 0);
        ds.FPHeapMax fPHeapMax10 = new ds.FPHeapMax((int) (short) 1);
        ds.FPHeapMax fPHeapMax12 = new ds.FPHeapMax(0);
        ds.FPHeapMax fPHeapMax14 = new ds.FPHeapMax((int) (byte) 1);
        ds.FPHeapMax fPHeapMax16 = new ds.FPHeapMax((int) (byte) 1);
        ds.Item item17 = null;
        ds.Item[] itemArray18 = new ds.Item[] { item17 };
        fPHeapMax16.copia(itemArray18);
        fPHeapMax14.copia(itemArray18);
        fPHeapMax12.copia(itemArray18);
        fPHeapMax10.copia(itemArray18);
        fPHeapMax10.imprime();
        ds.FPHeapMax fPHeapMax25 = new ds.FPHeapMax((int) ' ');
        fPHeapMax25.refaz((int) (short) 1, (int) (short) 1);
        ds.Item item29 = fPHeapMax25.max();
        ds.FPHeapMax fPHeapMax31 = new ds.FPHeapMax((int) (byte) 1);
        ds.Item item32 = null;
        ds.Item[] itemArray33 = new ds.Item[] { item32 };
        fPHeapMax31.copia(itemArray33);
        fPHeapMax25.copia(itemArray33);
        fPHeapMax10.copia(itemArray33);
        ds.FPHeapMax fPHeapMax38 = new ds.FPHeapMax((int) (byte) 1);
        ds.Item item39 = null;
        ds.Item[] itemArray40 = new ds.Item[] { item39 };
        fPHeapMax38.copia(itemArray40);
        ds.Item item42 = fPHeapMax38.max();
        fPHeapMax38.constroi();
        fPHeapMax38.constroi();
        ds.Item item45 = fPHeapMax38.max();
        fPHeapMax38.constroi();
        ds.Item item47 = fPHeapMax38.max();
        fPHeapMax38.imprime();
        ds.FPHeapMax fPHeapMax50 = new ds.FPHeapMax((int) (byte) 1);
        ds.Item item51 = null;
        ds.Item[] itemArray52 = new ds.Item[] { item51 };
        fPHeapMax50.copia(itemArray52);
        ds.Item item54 = fPHeapMax50.max();
        ds.FPHeapMax fPHeapMax56 = new ds.FPHeapMax((int) (byte) 1);
        ds.FPHeapMax fPHeapMax58 = new ds.FPHeapMax((int) (byte) 1);
        ds.Item item59 = null;
        ds.Item[] itemArray60 = new ds.Item[] { item59 };
        fPHeapMax58.copia(itemArray60);
        fPHeapMax56.copia(itemArray60);
        fPHeapMax50.copia(itemArray60);
        fPHeapMax38.copia(itemArray60);
        fPHeapMax10.copia(itemArray60);
        fPHeapMax10.constroi();
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMax1.aumentaChave(0, (java.lang.Object) fPHeapMax10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(item2);
        org.junit.Assert.assertNotNull(itemArray18);
        org.junit.Assert.assertNull(item29);
        org.junit.Assert.assertNotNull(itemArray33);
        org.junit.Assert.assertNotNull(itemArray40);
        org.junit.Assert.assertNull(item42);
        org.junit.Assert.assertNull(item45);
        org.junit.Assert.assertNull(item47);
        org.junit.Assert.assertNotNull(itemArray52);
        org.junit.Assert.assertNull(item54);
        org.junit.Assert.assertNotNull(itemArray60);
    }

    @Test
    public void test318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test318");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (short) 10);
        ds.FPHeapMax fPHeapMax3 = new ds.FPHeapMax((int) (byte) 1);
        ds.Item item4 = null;
        ds.Item[] itemArray5 = new ds.Item[] { item4 };
        fPHeapMax3.copia(itemArray5);
        ds.Item item7 = fPHeapMax3.max();
        fPHeapMax3.constroi();
        fPHeapMax3.constroi();
        ds.Item item10 = fPHeapMax3.max();
        fPHeapMax3.constroi();
        ds.Item item12 = fPHeapMax3.max();
        fPHeapMax3.constroi();
        fPHeapMax3.imprime();
        ds.FPHeapMax fPHeapMax16 = new ds.FPHeapMax((int) (byte) 1);
        ds.Item item17 = null;
        ds.Item[] itemArray18 = new ds.Item[] { item17 };
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
        org.junit.Assert.assertNull(item7);
        org.junit.Assert.assertNull(item10);
        org.junit.Assert.assertNull(item12);
        org.junit.Assert.assertNotNull(itemArray18);
    }

    @Test
    public void test319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test319");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (byte) 1);
        ds.Item item2 = null;
        ds.Item[] itemArray3 = new ds.Item[] { item2 };
        fPHeapMax1.copia(itemArray3);
        ds.Item item5 = fPHeapMax1.max();
        ds.FPHeapMax fPHeapMax7 = new ds.FPHeapMax((int) (byte) 1);
        ds.FPHeapMax fPHeapMax9 = new ds.FPHeapMax((int) (byte) 1);
        ds.Item item10 = null;
        ds.Item[] itemArray11 = new ds.Item[] { item10 };
        fPHeapMax9.copia(itemArray11);
        fPHeapMax7.copia(itemArray11);
        fPHeapMax1.copia(itemArray11);
        ds.FPHeapMax fPHeapMax16 = new ds.FPHeapMax((int) (byte) 1);
        ds.Item item17 = null;
        ds.Item[] itemArray18 = new ds.Item[] { item17 };
        fPHeapMax16.copia(itemArray18);
        fPHeapMax1.copia(itemArray18);
        ds.Item item21 = fPHeapMax1.max();
        ds.Item item22 = null;
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMax1.insere(item22);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertNull(item5);
        org.junit.Assert.assertNotNull(itemArray11);
        org.junit.Assert.assertNotNull(itemArray18);
        org.junit.Assert.assertNull(item21);
    }

    @Test
    public void test320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test320");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (byte) 1);
        ds.Item item2 = fPHeapMax1.max();
        fPHeapMax1.imprime();
        fPHeapMax1.constroi();
        fPHeapMax1.refaz((int) (byte) 1, 0);
        ds.FPHeapMax fPHeapMax9 = new ds.FPHeapMax(0);
        ds.FPHeapMax fPHeapMax11 = new ds.FPHeapMax((int) (byte) 1);
        ds.FPHeapMax fPHeapMax13 = new ds.FPHeapMax((int) (byte) 1);
        ds.Item item14 = null;
        ds.Item[] itemArray15 = new ds.Item[] { item14 };
        fPHeapMax13.copia(itemArray15);
        fPHeapMax11.copia(itemArray15);
        fPHeapMax9.copia(itemArray15);
        fPHeapMax1.copia(itemArray15);
        ds.FPHeapMax fPHeapMax21 = new ds.FPHeapMax(0);
        fPHeapMax21.constroi();
        ds.FPHeapMax fPHeapMax24 = new ds.FPHeapMax((int) (byte) 1);
        ds.Item item25 = null;
        ds.Item[] itemArray26 = new ds.Item[] { item25 };
        fPHeapMax24.copia(itemArray26);
        ds.Item item28 = fPHeapMax24.max();
        fPHeapMax24.constroi();
        fPHeapMax24.constroi();
        ds.Item item31 = fPHeapMax24.max();
        fPHeapMax24.constroi();
        fPHeapMax24.imprime();
        ds.Item item34 = fPHeapMax24.max();
        ds.Item item35 = fPHeapMax24.max();
        ds.FPHeapMax fPHeapMax37 = new ds.FPHeapMax((int) ' ');
        fPHeapMax37.imprime();
        ds.FPHeapMax fPHeapMax40 = new ds.FPHeapMax((int) (byte) 1);
        ds.FPHeapMax fPHeapMax42 = new ds.FPHeapMax((int) (byte) 1);
        ds.Item item43 = null;
        ds.Item[] itemArray44 = new ds.Item[] { item43 };
        fPHeapMax42.copia(itemArray44);
        fPHeapMax40.copia(itemArray44);
        fPHeapMax40.imprime();
        ds.FPHeapMax fPHeapMax49 = new ds.FPHeapMax((int) (byte) 1);
        ds.Item item50 = null;
        ds.Item[] itemArray51 = new ds.Item[] { item50 };
        fPHeapMax49.copia(itemArray51);
        ds.Item item53 = fPHeapMax49.max();
        ds.FPHeapMax fPHeapMax55 = new ds.FPHeapMax((int) (byte) 1);
        ds.FPHeapMax fPHeapMax57 = new ds.FPHeapMax((int) (byte) 1);
        ds.Item item58 = null;
        ds.Item[] itemArray59 = new ds.Item[] { item58 };
        fPHeapMax57.copia(itemArray59);
        fPHeapMax55.copia(itemArray59);
        fPHeapMax49.copia(itemArray59);
        fPHeapMax40.copia(itemArray59);
        fPHeapMax37.copia(itemArray59);
        fPHeapMax24.copia(itemArray59);
        fPHeapMax21.copia(itemArray59);
        fPHeapMax1.copia(itemArray59);
        ds.FPHeapMax fPHeapMax70 = new ds.FPHeapMax((int) (byte) 1);
        ds.Item item71 = null;
        ds.Item[] itemArray72 = new ds.Item[] { item71 };
        fPHeapMax70.copia(itemArray72);
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMax1.aumentaChave((-1), (java.lang.Object) fPHeapMax70);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(item2);
        org.junit.Assert.assertNotNull(itemArray15);
        org.junit.Assert.assertNotNull(itemArray26);
        org.junit.Assert.assertNull(item28);
        org.junit.Assert.assertNull(item31);
        org.junit.Assert.assertNull(item34);
        org.junit.Assert.assertNull(item35);
        org.junit.Assert.assertNotNull(itemArray44);
        org.junit.Assert.assertNotNull(itemArray51);
        org.junit.Assert.assertNull(item53);
        org.junit.Assert.assertNotNull(itemArray59);
        org.junit.Assert.assertNotNull(itemArray72);
    }

    @Test
    public void test321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test321");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (byte) 1);
        ds.Item item2 = null;
        ds.Item[] itemArray3 = new ds.Item[] { item2 };
        fPHeapMax1.copia(itemArray3);
        ds.Item item5 = fPHeapMax1.max();
        fPHeapMax1.constroi();
        fPHeapMax1.constroi();
        ds.Item item8 = fPHeapMax1.max();
        fPHeapMax1.imprime();
        ds.Item item10 = fPHeapMax1.max();
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
        org.junit.Assert.assertNull(item8);
        org.junit.Assert.assertNull(item10);
    }

    @Test
    public void test322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test322");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (byte) 1);
        ds.Item item2 = null;
        ds.Item[] itemArray3 = new ds.Item[] { item2 };
        fPHeapMax1.copia(itemArray3);
        ds.Item item5 = fPHeapMax1.max();
        fPHeapMax1.constroi();
        fPHeapMax1.constroi();
        ds.Item item8 = fPHeapMax1.max();
        fPHeapMax1.constroi();
        ds.FPHeapMax fPHeapMax12 = new ds.FPHeapMax((int) (byte) 1);
        ds.Item item13 = null;
        ds.Item[] itemArray14 = new ds.Item[] { item13 };
        fPHeapMax12.copia(itemArray14);
        ds.Item item16 = fPHeapMax12.max();
        fPHeapMax12.constroi();
        fPHeapMax12.constroi();
        ds.Item item19 = fPHeapMax12.max();
        fPHeapMax12.constroi();
        fPHeapMax12.constroi();
        ds.FPHeapMax fPHeapMax23 = new ds.FPHeapMax((int) (byte) 1);
        ds.FPHeapMax fPHeapMax25 = new ds.FPHeapMax((int) (byte) 1);
        ds.Item item26 = null;
        ds.Item[] itemArray27 = new ds.Item[] { item26 };
        fPHeapMax25.copia(itemArray27);
        fPHeapMax23.copia(itemArray27);
        fPHeapMax23.imprime();
        ds.FPHeapMax fPHeapMax32 = new ds.FPHeapMax((int) (byte) 1);
        ds.Item item33 = null;
        ds.Item[] itemArray34 = new ds.Item[] { item33 };
        fPHeapMax32.copia(itemArray34);
        ds.Item item36 = fPHeapMax32.max();
        ds.FPHeapMax fPHeapMax38 = new ds.FPHeapMax((int) (byte) 1);
        ds.FPHeapMax fPHeapMax40 = new ds.FPHeapMax((int) (byte) 1);
        ds.Item item41 = null;
        ds.Item[] itemArray42 = new ds.Item[] { item41 };
        fPHeapMax40.copia(itemArray42);
        fPHeapMax38.copia(itemArray42);
        fPHeapMax32.copia(itemArray42);
        fPHeapMax23.copia(itemArray42);
        fPHeapMax12.copia(itemArray42);
        ds.Item item48 = fPHeapMax12.max();
        ds.FPHeapMax fPHeapMax50 = new ds.FPHeapMax((int) (short) 1);
        fPHeapMax50.imprime();
        ds.FPHeapMax fPHeapMax53 = new ds.FPHeapMax((int) (short) 1);
        ds.FPHeapMax fPHeapMax55 = new ds.FPHeapMax(0);
        ds.FPHeapMax fPHeapMax57 = new ds.FPHeapMax((int) (byte) 1);
        ds.FPHeapMax fPHeapMax59 = new ds.FPHeapMax((int) (byte) 1);
        ds.Item item60 = null;
        ds.Item[] itemArray61 = new ds.Item[] { item60 };
        fPHeapMax59.copia(itemArray61);
        fPHeapMax57.copia(itemArray61);
        fPHeapMax55.copia(itemArray61);
        fPHeapMax53.copia(itemArray61);
        fPHeapMax50.copia(itemArray61);
        fPHeapMax12.copia(itemArray61);
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMax1.aumentaChave(1, (java.lang.Object) fPHeapMax12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertNull(item5);
        org.junit.Assert.assertNull(item8);
        org.junit.Assert.assertNotNull(itemArray14);
        org.junit.Assert.assertNull(item16);
        org.junit.Assert.assertNull(item19);
        org.junit.Assert.assertNotNull(itemArray27);
        org.junit.Assert.assertNotNull(itemArray34);
        org.junit.Assert.assertNull(item36);
        org.junit.Assert.assertNotNull(itemArray42);
        org.junit.Assert.assertNull(item48);
        org.junit.Assert.assertNotNull(itemArray61);
    }

    @Test
    public void test323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test323");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (byte) 1);
        ds.Item item2 = null;
        ds.Item[] itemArray3 = new ds.Item[] { item2 };
        fPHeapMax1.copia(itemArray3);
        ds.Item item5 = fPHeapMax1.max();
        fPHeapMax1.constroi();
        fPHeapMax1.constroi();
        ds.Item item8 = fPHeapMax1.max();
        fPHeapMax1.constroi();
        ds.Item item10 = fPHeapMax1.max();
        ds.FPHeapMax fPHeapMax12 = new ds.FPHeapMax((int) (byte) 1);
        ds.Item item13 = null;
        ds.Item[] itemArray14 = new ds.Item[] { item13 };
        fPHeapMax12.copia(itemArray14);
        ds.Item item16 = fPHeapMax12.max();
        ds.FPHeapMax fPHeapMax18 = new ds.FPHeapMax((int) (byte) 1);
        ds.FPHeapMax fPHeapMax20 = new ds.FPHeapMax((int) (byte) 1);
        ds.Item item21 = null;
        ds.Item[] itemArray22 = new ds.Item[] { item21 };
        fPHeapMax20.copia(itemArray22);
        fPHeapMax18.copia(itemArray22);
        fPHeapMax12.copia(itemArray22);
        fPHeapMax1.copia(itemArray22);
        ds.FPHeapMax fPHeapMax28 = new ds.FPHeapMax((int) (byte) 1);
        ds.Item item29 = null;
        ds.Item[] itemArray30 = new ds.Item[] { item29 };
        fPHeapMax28.copia(itemArray30);
        ds.Item item32 = fPHeapMax28.max();
        fPHeapMax28.constroi();
        fPHeapMax28.constroi();
        ds.Item item35 = fPHeapMax28.max();
        fPHeapMax28.constroi();
        fPHeapMax28.refaz(0, (int) (short) -1);
        fPHeapMax28.constroi();
        ds.FPHeapMax fPHeapMax42 = new ds.FPHeapMax((int) (short) 1);
        ds.FPHeapMax fPHeapMax44 = new ds.FPHeapMax(0);
        ds.FPHeapMax fPHeapMax46 = new ds.FPHeapMax((int) (byte) 1);
        ds.FPHeapMax fPHeapMax48 = new ds.FPHeapMax((int) (byte) 1);
        ds.Item item49 = null;
        ds.Item[] itemArray50 = new ds.Item[] { item49 };
        fPHeapMax48.copia(itemArray50);
        fPHeapMax46.copia(itemArray50);
        fPHeapMax44.copia(itemArray50);
        fPHeapMax42.copia(itemArray50);
        fPHeapMax42.imprime();
        ds.FPHeapMax fPHeapMax57 = new ds.FPHeapMax((int) ' ');
        fPHeapMax57.refaz((int) (short) 1, (int) (short) 1);
        ds.Item item61 = fPHeapMax57.max();
        ds.FPHeapMax fPHeapMax63 = new ds.FPHeapMax((int) (byte) 1);
        ds.Item item64 = null;
        ds.Item[] itemArray65 = new ds.Item[] { item64 };
        fPHeapMax63.copia(itemArray65);
        fPHeapMax57.copia(itemArray65);
        fPHeapMax42.copia(itemArray65);
        fPHeapMax28.copia(itemArray65);
        fPHeapMax1.copia(itemArray65);
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertNull(item5);
        org.junit.Assert.assertNull(item8);
        org.junit.Assert.assertNull(item10);
        org.junit.Assert.assertNotNull(itemArray14);
        org.junit.Assert.assertNull(item16);
        org.junit.Assert.assertNotNull(itemArray22);
        org.junit.Assert.assertNotNull(itemArray30);
        org.junit.Assert.assertNull(item32);
        org.junit.Assert.assertNull(item35);
        org.junit.Assert.assertNotNull(itemArray50);
        org.junit.Assert.assertNull(item61);
        org.junit.Assert.assertNotNull(itemArray65);
    }

    @Test
    public void test324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test324");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (short) 1);
        ds.FPHeapMax fPHeapMax3 = new ds.FPHeapMax(0);
        ds.FPHeapMax fPHeapMax5 = new ds.FPHeapMax((int) (byte) 1);
        ds.FPHeapMax fPHeapMax7 = new ds.FPHeapMax((int) (byte) 1);
        ds.Item item8 = null;
        ds.Item[] itemArray9 = new ds.Item[] { item8 };
        fPHeapMax7.copia(itemArray9);
        fPHeapMax5.copia(itemArray9);
        fPHeapMax3.copia(itemArray9);
        fPHeapMax1.copia(itemArray9);
        fPHeapMax1.imprime();
        ds.FPHeapMax fPHeapMax16 = new ds.FPHeapMax((int) ' ');
        fPHeapMax16.refaz((int) (short) 1, (int) (short) 1);
        ds.Item item20 = fPHeapMax16.max();
        ds.FPHeapMax fPHeapMax22 = new ds.FPHeapMax((int) (byte) 1);
        ds.Item item23 = null;
        ds.Item[] itemArray24 = new ds.Item[] { item23 };
        fPHeapMax22.copia(itemArray24);
        fPHeapMax16.copia(itemArray24);
        fPHeapMax1.copia(itemArray24);
        ds.Item item28 = fPHeapMax1.max();
        org.junit.Assert.assertNotNull(itemArray9);
        org.junit.Assert.assertNull(item20);
        org.junit.Assert.assertNotNull(itemArray24);
        org.junit.Assert.assertNull(item28);
    }

    @Test
    public void test325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test325");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (byte) 1);
        ds.Item item2 = null;
        ds.Item[] itemArray3 = new ds.Item[] { item2 };
        fPHeapMax1.copia(itemArray3);
        ds.Item item5 = fPHeapMax1.max();
        fPHeapMax1.constroi();
        fPHeapMax1.constroi();
        ds.Item item8 = fPHeapMax1.max();
        fPHeapMax1.constroi();
        ds.Item item10 = fPHeapMax1.max();
        ds.FPHeapMax fPHeapMax12 = new ds.FPHeapMax((int) (byte) 1);
        ds.Item item13 = null;
        ds.Item[] itemArray14 = new ds.Item[] { item13 };
        fPHeapMax12.copia(itemArray14);
        ds.Item item16 = fPHeapMax12.max();
        ds.FPHeapMax fPHeapMax18 = new ds.FPHeapMax((int) (byte) 1);
        ds.FPHeapMax fPHeapMax20 = new ds.FPHeapMax((int) (byte) 1);
        ds.Item item21 = null;
        ds.Item[] itemArray22 = new ds.Item[] { item21 };
        fPHeapMax20.copia(itemArray22);
        fPHeapMax18.copia(itemArray22);
        fPHeapMax12.copia(itemArray22);
        fPHeapMax1.copia(itemArray22);
        fPHeapMax1.imprime();
        fPHeapMax1.constroi();
        ds.FPHeapMax fPHeapMax30 = new ds.FPHeapMax((int) (short) 1);
        ds.FPHeapMax fPHeapMax32 = new ds.FPHeapMax(0);
        ds.FPHeapMax fPHeapMax34 = new ds.FPHeapMax((int) (byte) 1);
        ds.FPHeapMax fPHeapMax36 = new ds.FPHeapMax((int) (byte) 1);
        ds.Item item37 = null;
        ds.Item[] itemArray38 = new ds.Item[] { item37 };
        fPHeapMax36.copia(itemArray38);
        fPHeapMax34.copia(itemArray38);
        fPHeapMax32.copia(itemArray38);
        fPHeapMax30.copia(itemArray38);
        fPHeapMax30.imprime();
        ds.FPHeapMax fPHeapMax45 = new ds.FPHeapMax((int) ' ');
        fPHeapMax45.refaz((int) (short) 1, (int) (short) 1);
        ds.Item item49 = fPHeapMax45.max();
        ds.FPHeapMax fPHeapMax51 = new ds.FPHeapMax((int) (byte) 1);
        ds.Item item52 = null;
        ds.Item[] itemArray53 = new ds.Item[] { item52 };
        fPHeapMax51.copia(itemArray53);
        fPHeapMax45.copia(itemArray53);
        fPHeapMax30.copia(itemArray53);
        fPHeapMax1.copia(itemArray53);
        ds.Item item58 = fPHeapMax1.max();
        // The following exception was thrown during execution in test generation
        try {
            ds.Item item59 = fPHeapMax1.retiraMax();
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: heap vazio");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertNull(item5);
        org.junit.Assert.assertNull(item8);
        org.junit.Assert.assertNull(item10);
        org.junit.Assert.assertNotNull(itemArray14);
        org.junit.Assert.assertNull(item16);
        org.junit.Assert.assertNotNull(itemArray22);
        org.junit.Assert.assertNotNull(itemArray38);
        org.junit.Assert.assertNull(item49);
        org.junit.Assert.assertNotNull(itemArray53);
        org.junit.Assert.assertNull(item58);
    }

    @Test
    public void test326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test326");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (byte) 1);
        ds.Item item2 = null;
        ds.Item[] itemArray3 = new ds.Item[] { item2 };
        fPHeapMax1.copia(itemArray3);
        ds.Item item5 = fPHeapMax1.max();
        fPHeapMax1.constroi();
        fPHeapMax1.constroi();
        ds.Item item8 = fPHeapMax1.max();
        fPHeapMax1.imprime();
        fPHeapMax1.constroi();
        ds.FPHeapMax fPHeapMax12 = new ds.FPHeapMax((int) (short) 1);
        fPHeapMax12.imprime();
        fPHeapMax12.constroi();
        ds.FPHeapMax fPHeapMax16 = new ds.FPHeapMax((int) ' ');
        fPHeapMax16.imprime();
        ds.FPHeapMax fPHeapMax19 = new ds.FPHeapMax((int) (byte) 1);
        ds.Item item20 = null;
        ds.Item[] itemArray21 = new ds.Item[] { item20 };
        fPHeapMax19.copia(itemArray21);
        ds.Item item23 = fPHeapMax19.max();
        fPHeapMax19.constroi();
        fPHeapMax19.constroi();
        ds.Item item26 = fPHeapMax19.max();
        fPHeapMax19.constroi();
        ds.Item item28 = fPHeapMax19.max();
        fPHeapMax19.imprime();
        ds.FPHeapMax fPHeapMax31 = new ds.FPHeapMax((int) (byte) 1);
        ds.Item item32 = null;
        ds.Item[] itemArray33 = new ds.Item[] { item32 };
        fPHeapMax31.copia(itemArray33);
        ds.Item item35 = fPHeapMax31.max();
        ds.FPHeapMax fPHeapMax37 = new ds.FPHeapMax((int) (byte) 1);
        ds.FPHeapMax fPHeapMax39 = new ds.FPHeapMax((int) (byte) 1);
        ds.Item item40 = null;
        ds.Item[] itemArray41 = new ds.Item[] { item40 };
        fPHeapMax39.copia(itemArray41);
        fPHeapMax37.copia(itemArray41);
        fPHeapMax31.copia(itemArray41);
        fPHeapMax19.copia(itemArray41);
        fPHeapMax16.copia(itemArray41);
        ds.FPHeapMax fPHeapMax48 = new ds.FPHeapMax(10);
        ds.FPHeapMax fPHeapMax50 = new ds.FPHeapMax((int) ' ');
        fPHeapMax50.imprime();
        ds.FPHeapMax fPHeapMax53 = new ds.FPHeapMax((int) (byte) 1);
        ds.FPHeapMax fPHeapMax55 = new ds.FPHeapMax((int) (byte) 1);
        ds.Item item56 = null;
        ds.Item[] itemArray57 = new ds.Item[] { item56 };
        fPHeapMax55.copia(itemArray57);
        fPHeapMax53.copia(itemArray57);
        fPHeapMax53.imprime();
        ds.FPHeapMax fPHeapMax62 = new ds.FPHeapMax((int) (byte) 1);
        ds.Item item63 = null;
        ds.Item[] itemArray64 = new ds.Item[] { item63 };
        fPHeapMax62.copia(itemArray64);
        ds.Item item66 = fPHeapMax62.max();
        ds.FPHeapMax fPHeapMax68 = new ds.FPHeapMax((int) (byte) 1);
        ds.FPHeapMax fPHeapMax70 = new ds.FPHeapMax((int) (byte) 1);
        ds.Item item71 = null;
        ds.Item[] itemArray72 = new ds.Item[] { item71 };
        fPHeapMax70.copia(itemArray72);
        fPHeapMax68.copia(itemArray72);
        fPHeapMax62.copia(itemArray72);
        fPHeapMax53.copia(itemArray72);
        fPHeapMax50.copia(itemArray72);
        fPHeapMax48.copia(itemArray72);
        fPHeapMax16.copia(itemArray72);
        fPHeapMax12.copia(itemArray72);
        fPHeapMax1.copia(itemArray72);
        // The following exception was thrown during execution in test generation
        try {
            ds.Item item82 = fPHeapMax1.retiraMax();
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: heap vazio");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertNull(item5);
        org.junit.Assert.assertNull(item8);
        org.junit.Assert.assertNotNull(itemArray21);
        org.junit.Assert.assertNull(item23);
        org.junit.Assert.assertNull(item26);
        org.junit.Assert.assertNull(item28);
        org.junit.Assert.assertNotNull(itemArray33);
        org.junit.Assert.assertNull(item35);
        org.junit.Assert.assertNotNull(itemArray41);
        org.junit.Assert.assertNotNull(itemArray57);
        org.junit.Assert.assertNotNull(itemArray64);
        org.junit.Assert.assertNull(item66);
        org.junit.Assert.assertNotNull(itemArray72);
    }

    @Test
    public void test327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test327");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax(0);
        fPHeapMax1.constroi();
        ds.FPHeapMax fPHeapMax4 = new ds.FPHeapMax((int) (byte) 1);
        ds.Item item5 = null;
        ds.Item[] itemArray6 = new ds.Item[] { item5 };
        fPHeapMax4.copia(itemArray6);
        ds.Item item8 = fPHeapMax4.max();
        fPHeapMax4.constroi();
        fPHeapMax4.constroi();
        ds.Item item11 = fPHeapMax4.max();
        fPHeapMax4.constroi();
        fPHeapMax4.imprime();
        ds.Item item14 = fPHeapMax4.max();
        ds.Item item15 = fPHeapMax4.max();
        ds.FPHeapMax fPHeapMax17 = new ds.FPHeapMax((int) ' ');
        fPHeapMax17.imprime();
        ds.FPHeapMax fPHeapMax20 = new ds.FPHeapMax((int) (byte) 1);
        ds.FPHeapMax fPHeapMax22 = new ds.FPHeapMax((int) (byte) 1);
        ds.Item item23 = null;
        ds.Item[] itemArray24 = new ds.Item[] { item23 };
        fPHeapMax22.copia(itemArray24);
        fPHeapMax20.copia(itemArray24);
        fPHeapMax20.imprime();
        ds.FPHeapMax fPHeapMax29 = new ds.FPHeapMax((int) (byte) 1);
        ds.Item item30 = null;
        ds.Item[] itemArray31 = new ds.Item[] { item30 };
        fPHeapMax29.copia(itemArray31);
        ds.Item item33 = fPHeapMax29.max();
        ds.FPHeapMax fPHeapMax35 = new ds.FPHeapMax((int) (byte) 1);
        ds.FPHeapMax fPHeapMax37 = new ds.FPHeapMax((int) (byte) 1);
        ds.Item item38 = null;
        ds.Item[] itemArray39 = new ds.Item[] { item38 };
        fPHeapMax37.copia(itemArray39);
        fPHeapMax35.copia(itemArray39);
        fPHeapMax29.copia(itemArray39);
        fPHeapMax20.copia(itemArray39);
        fPHeapMax17.copia(itemArray39);
        fPHeapMax4.copia(itemArray39);
        fPHeapMax1.copia(itemArray39);
        ds.FPHeapMax fPHeapMax48 = new ds.FPHeapMax((int) (byte) 1);
        ds.Item item49 = null;
        ds.Item[] itemArray50 = new ds.Item[] { item49 };
        fPHeapMax48.copia(itemArray50);
        ds.Item item52 = fPHeapMax48.max();
        fPHeapMax48.constroi();
        fPHeapMax48.constroi();
        ds.Item item55 = fPHeapMax48.max();
        fPHeapMax48.constroi();
        ds.Item item57 = fPHeapMax48.max();
        fPHeapMax48.constroi();
        fPHeapMax48.imprime();
        ds.FPHeapMax fPHeapMax61 = new ds.FPHeapMax((int) (byte) 1);
        ds.Item item62 = null;
        ds.Item[] itemArray63 = new ds.Item[] { item62 };
        fPHeapMax61.copia(itemArray63);
        fPHeapMax48.copia(itemArray63);
        fPHeapMax1.copia(itemArray63);
        java.lang.Class<?> wildcardClass67 = itemArray63.getClass();
        org.junit.Assert.assertNotNull(itemArray6);
        org.junit.Assert.assertNull(item8);
        org.junit.Assert.assertNull(item11);
        org.junit.Assert.assertNull(item14);
        org.junit.Assert.assertNull(item15);
        org.junit.Assert.assertNotNull(itemArray24);
        org.junit.Assert.assertNotNull(itemArray31);
        org.junit.Assert.assertNull(item33);
        org.junit.Assert.assertNotNull(itemArray39);
        org.junit.Assert.assertNotNull(itemArray50);
        org.junit.Assert.assertNull(item52);
        org.junit.Assert.assertNull(item55);
        org.junit.Assert.assertNull(item57);
        org.junit.Assert.assertNotNull(itemArray63);
        org.junit.Assert.assertNotNull(wildcardClass67);
    }

    @Test
    public void test328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test328");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) ' ');
        fPHeapMax1.imprime();
        ds.FPHeapMax fPHeapMax4 = new ds.FPHeapMax((int) (byte) 1);
        ds.FPHeapMax fPHeapMax6 = new ds.FPHeapMax((int) (byte) 1);
        ds.Item item7 = null;
        ds.Item[] itemArray8 = new ds.Item[] { item7 };
        fPHeapMax6.copia(itemArray8);
        fPHeapMax4.copia(itemArray8);
        fPHeapMax4.imprime();
        ds.FPHeapMax fPHeapMax13 = new ds.FPHeapMax((int) (byte) 1);
        ds.Item item14 = null;
        ds.Item[] itemArray15 = new ds.Item[] { item14 };
        fPHeapMax13.copia(itemArray15);
        ds.Item item17 = fPHeapMax13.max();
        ds.FPHeapMax fPHeapMax19 = new ds.FPHeapMax((int) (byte) 1);
        ds.FPHeapMax fPHeapMax21 = new ds.FPHeapMax((int) (byte) 1);
        ds.Item item22 = null;
        ds.Item[] itemArray23 = new ds.Item[] { item22 };
        fPHeapMax21.copia(itemArray23);
        fPHeapMax19.copia(itemArray23);
        fPHeapMax13.copia(itemArray23);
        fPHeapMax4.copia(itemArray23);
        fPHeapMax1.copia(itemArray23);
        ds.FPHeapMax fPHeapMax30 = new ds.FPHeapMax((int) (byte) 1);
        ds.Item item31 = null;
        ds.Item[] itemArray32 = new ds.Item[] { item31 };
        fPHeapMax30.copia(itemArray32);
        ds.Item item34 = fPHeapMax30.max();
        fPHeapMax30.constroi();
        fPHeapMax30.constroi();
        ds.Item item37 = fPHeapMax30.max();
        fPHeapMax30.constroi();
        ds.Item item39 = fPHeapMax30.max();
        ds.Item item40 = fPHeapMax30.max();
        ds.Item item41 = fPHeapMax30.max();
        fPHeapMax30.imprime();
        ds.FPHeapMax fPHeapMax44 = new ds.FPHeapMax((int) (byte) 1);
        ds.Item item45 = fPHeapMax44.max();
        fPHeapMax44.imprime();
        fPHeapMax44.constroi();
        fPHeapMax44.refaz((int) (byte) 1, 0);
        ds.FPHeapMax fPHeapMax52 = new ds.FPHeapMax(0);
        ds.FPHeapMax fPHeapMax54 = new ds.FPHeapMax((int) (byte) 1);
        ds.FPHeapMax fPHeapMax56 = new ds.FPHeapMax((int) (byte) 1);
        ds.Item item57 = null;
        ds.Item[] itemArray58 = new ds.Item[] { item57 };
        fPHeapMax56.copia(itemArray58);
        fPHeapMax54.copia(itemArray58);
        fPHeapMax52.copia(itemArray58);
        fPHeapMax44.copia(itemArray58);
        fPHeapMax30.copia(itemArray58);
        fPHeapMax1.copia(itemArray58);
        java.lang.Class<?> wildcardClass65 = fPHeapMax1.getClass();
        org.junit.Assert.assertNotNull(itemArray8);
        org.junit.Assert.assertNotNull(itemArray15);
        org.junit.Assert.assertNull(item17);
        org.junit.Assert.assertNotNull(itemArray23);
        org.junit.Assert.assertNotNull(itemArray32);
        org.junit.Assert.assertNull(item34);
        org.junit.Assert.assertNull(item37);
        org.junit.Assert.assertNull(item39);
        org.junit.Assert.assertNull(item40);
        org.junit.Assert.assertNull(item41);
        org.junit.Assert.assertNull(item45);
        org.junit.Assert.assertNotNull(itemArray58);
        org.junit.Assert.assertNotNull(wildcardClass65);
    }

    @Test
    public void test329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test329");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (byte) 100);
        fPHeapMax1.imprime();
        fPHeapMax1.constroi();
        fPHeapMax1.constroi();
    }

    @Test
    public void test330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test330");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (byte) 1);
        ds.Item item2 = null;
        ds.Item[] itemArray3 = new ds.Item[] { item2 };
        fPHeapMax1.copia(itemArray3);
        ds.Item item5 = fPHeapMax1.max();
        fPHeapMax1.imprime();
        ds.FPHeapMax fPHeapMax8 = new ds.FPHeapMax((int) ' ');
        fPHeapMax8.refaz((int) (short) 1, (int) (short) 1);
        ds.Item item12 = fPHeapMax8.max();
        ds.FPHeapMax fPHeapMax14 = new ds.FPHeapMax((int) (byte) 1);
        ds.Item item15 = null;
        ds.Item[] itemArray16 = new ds.Item[] { item15 };
        fPHeapMax14.copia(itemArray16);
        fPHeapMax8.copia(itemArray16);
        fPHeapMax8.constroi();
        ds.FPHeapMax fPHeapMax21 = new ds.FPHeapMax((int) (byte) 1);
        ds.Item item22 = null;
        ds.Item[] itemArray23 = new ds.Item[] { item22 };
        fPHeapMax21.copia(itemArray23);
        fPHeapMax8.copia(itemArray23);
        fPHeapMax1.copia(itemArray23);
        java.lang.Class<?> wildcardClass27 = itemArray23.getClass();
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertNull(item5);
        org.junit.Assert.assertNull(item12);
        org.junit.Assert.assertNotNull(itemArray16);
        org.junit.Assert.assertNotNull(itemArray23);
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test331");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (byte) 1);
        ds.Item item2 = null;
        ds.Item[] itemArray3 = new ds.Item[] { item2 };
        fPHeapMax1.copia(itemArray3);
        ds.Item item5 = fPHeapMax1.max();
        fPHeapMax1.constroi();
        fPHeapMax1.constroi();
        ds.Item item8 = fPHeapMax1.max();
        fPHeapMax1.constroi();
        fPHeapMax1.imprime();
        ds.Item item11 = fPHeapMax1.max();
        ds.Item item12 = fPHeapMax1.max();
        ds.FPHeapMax fPHeapMax14 = new ds.FPHeapMax((int) ' ');
        fPHeapMax14.imprime();
        ds.FPHeapMax fPHeapMax17 = new ds.FPHeapMax((int) (byte) 1);
        ds.FPHeapMax fPHeapMax19 = new ds.FPHeapMax((int) (byte) 1);
        ds.Item item20 = null;
        ds.Item[] itemArray21 = new ds.Item[] { item20 };
        fPHeapMax19.copia(itemArray21);
        fPHeapMax17.copia(itemArray21);
        fPHeapMax17.imprime();
        ds.FPHeapMax fPHeapMax26 = new ds.FPHeapMax((int) (byte) 1);
        ds.Item item27 = null;
        ds.Item[] itemArray28 = new ds.Item[] { item27 };
        fPHeapMax26.copia(itemArray28);
        ds.Item item30 = fPHeapMax26.max();
        ds.FPHeapMax fPHeapMax32 = new ds.FPHeapMax((int) (byte) 1);
        ds.FPHeapMax fPHeapMax34 = new ds.FPHeapMax((int) (byte) 1);
        ds.Item item35 = null;
        ds.Item[] itemArray36 = new ds.Item[] { item35 };
        fPHeapMax34.copia(itemArray36);
        fPHeapMax32.copia(itemArray36);
        fPHeapMax26.copia(itemArray36);
        fPHeapMax17.copia(itemArray36);
        fPHeapMax14.copia(itemArray36);
        fPHeapMax1.copia(itemArray36);
        fPHeapMax1.imprime();
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertNull(item5);
        org.junit.Assert.assertNull(item8);
        org.junit.Assert.assertNull(item11);
        org.junit.Assert.assertNull(item12);
        org.junit.Assert.assertNotNull(itemArray21);
        org.junit.Assert.assertNotNull(itemArray28);
        org.junit.Assert.assertNull(item30);
        org.junit.Assert.assertNotNull(itemArray36);
    }

    @Test
    public void test332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test332");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (byte) 1);
        ds.Item item2 = null;
        ds.Item[] itemArray3 = new ds.Item[] { item2 };
        fPHeapMax1.copia(itemArray3);
        ds.Item item5 = fPHeapMax1.max();
        fPHeapMax1.constroi();
        fPHeapMax1.constroi();
        ds.Item item8 = fPHeapMax1.max();
        ds.FPHeapMax fPHeapMax10 = new ds.FPHeapMax((int) (byte) 1);
        ds.Item item11 = null;
        ds.Item[] itemArray12 = new ds.Item[] { item11 };
        fPHeapMax10.copia(itemArray12);
        ds.Item item14 = fPHeapMax10.max();
        fPHeapMax10.constroi();
        fPHeapMax10.constroi();
        ds.Item item17 = fPHeapMax10.max();
        fPHeapMax10.constroi();
        fPHeapMax10.constroi();
        ds.FPHeapMax fPHeapMax21 = new ds.FPHeapMax((int) (byte) 1);
        ds.FPHeapMax fPHeapMax23 = new ds.FPHeapMax((int) (byte) 1);
        ds.Item item24 = null;
        ds.Item[] itemArray25 = new ds.Item[] { item24 };
        fPHeapMax23.copia(itemArray25);
        fPHeapMax21.copia(itemArray25);
        fPHeapMax21.imprime();
        ds.FPHeapMax fPHeapMax30 = new ds.FPHeapMax((int) (byte) 1);
        ds.Item item31 = null;
        ds.Item[] itemArray32 = new ds.Item[] { item31 };
        fPHeapMax30.copia(itemArray32);
        ds.Item item34 = fPHeapMax30.max();
        ds.FPHeapMax fPHeapMax36 = new ds.FPHeapMax((int) (byte) 1);
        ds.FPHeapMax fPHeapMax38 = new ds.FPHeapMax((int) (byte) 1);
        ds.Item item39 = null;
        ds.Item[] itemArray40 = new ds.Item[] { item39 };
        fPHeapMax38.copia(itemArray40);
        fPHeapMax36.copia(itemArray40);
        fPHeapMax30.copia(itemArray40);
        fPHeapMax21.copia(itemArray40);
        fPHeapMax10.copia(itemArray40);
        fPHeapMax1.copia(itemArray40);
        java.lang.Class<?> wildcardClass47 = fPHeapMax1.getClass();
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertNull(item5);
        org.junit.Assert.assertNull(item8);
        org.junit.Assert.assertNotNull(itemArray12);
        org.junit.Assert.assertNull(item14);
        org.junit.Assert.assertNull(item17);
        org.junit.Assert.assertNotNull(itemArray25);
        org.junit.Assert.assertNotNull(itemArray32);
        org.junit.Assert.assertNull(item34);
        org.junit.Assert.assertNotNull(itemArray40);
        org.junit.Assert.assertNotNull(wildcardClass47);
    }

    @Test
    public void test333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test333");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (byte) 1);
        ds.FPHeapMax fPHeapMax3 = new ds.FPHeapMax((int) (byte) 1);
        ds.Item item4 = null;
        ds.Item[] itemArray5 = new ds.Item[] { item4 };
        fPHeapMax3.copia(itemArray5);
        fPHeapMax1.copia(itemArray5);
        ds.Item item8 = fPHeapMax1.max();
        ds.Item item9 = fPHeapMax1.max();
        // The following exception was thrown during execution in test generation
        try {
            ds.Item item10 = fPHeapMax1.retiraMax();
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: heap vazio");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray5);
        org.junit.Assert.assertNull(item8);
        org.junit.Assert.assertNull(item9);
    }

    @Test
    public void test334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test334");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) ' ');
        fPHeapMax1.imprime();
        ds.FPHeapMax fPHeapMax4 = new ds.FPHeapMax((int) (byte) 1);
        ds.FPHeapMax fPHeapMax6 = new ds.FPHeapMax((int) (byte) 1);
        ds.Item item7 = null;
        ds.Item[] itemArray8 = new ds.Item[] { item7 };
        fPHeapMax6.copia(itemArray8);
        fPHeapMax4.copia(itemArray8);
        fPHeapMax4.imprime();
        ds.FPHeapMax fPHeapMax13 = new ds.FPHeapMax((int) (byte) 1);
        ds.Item item14 = null;
        ds.Item[] itemArray15 = new ds.Item[] { item14 };
        fPHeapMax13.copia(itemArray15);
        ds.Item item17 = fPHeapMax13.max();
        ds.FPHeapMax fPHeapMax19 = new ds.FPHeapMax((int) (byte) 1);
        ds.FPHeapMax fPHeapMax21 = new ds.FPHeapMax((int) (byte) 1);
        ds.Item item22 = null;
        ds.Item[] itemArray23 = new ds.Item[] { item22 };
        fPHeapMax21.copia(itemArray23);
        fPHeapMax19.copia(itemArray23);
        fPHeapMax13.copia(itemArray23);
        fPHeapMax4.copia(itemArray23);
        fPHeapMax1.copia(itemArray23);
        ds.Item item29 = fPHeapMax1.max();
        org.junit.Assert.assertNotNull(itemArray8);
        org.junit.Assert.assertNotNull(itemArray15);
        org.junit.Assert.assertNull(item17);
        org.junit.Assert.assertNotNull(itemArray23);
        org.junit.Assert.assertNull(item29);
    }

    @Test
    public void test335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test335");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (byte) 1);
        ds.Item item2 = null;
        ds.Item[] itemArray3 = new ds.Item[] { item2 };
        fPHeapMax1.copia(itemArray3);
        ds.Item item5 = fPHeapMax1.max();
        fPHeapMax1.constroi();
        fPHeapMax1.imprime();
        fPHeapMax1.constroi();
        fPHeapMax1.imprime();
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMax1.refaz((int) (short) 100, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 100");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertNull(item5);
    }

    @Test
    public void test336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test336");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (byte) 1);
        ds.Item item2 = null;
        ds.Item[] itemArray3 = new ds.Item[] { item2 };
        fPHeapMax1.copia(itemArray3);
        ds.Item item5 = fPHeapMax1.max();
        fPHeapMax1.constroi();
        fPHeapMax1.constroi();
        ds.Item item8 = fPHeapMax1.max();
        fPHeapMax1.constroi();
        ds.Item item10 = fPHeapMax1.max();
        ds.FPHeapMax fPHeapMax12 = new ds.FPHeapMax((int) ' ');
        fPHeapMax12.refaz((int) (short) 1, (int) (short) 1);
        ds.Item item16 = fPHeapMax12.max();
        ds.FPHeapMax fPHeapMax18 = new ds.FPHeapMax((int) (byte) 1);
        ds.Item item19 = null;
        ds.Item[] itemArray20 = new ds.Item[] { item19 };
        fPHeapMax18.copia(itemArray20);
        fPHeapMax12.copia(itemArray20);
        fPHeapMax12.constroi();
        ds.FPHeapMax fPHeapMax25 = new ds.FPHeapMax((int) (byte) 1);
        ds.Item item26 = null;
        ds.Item[] itemArray27 = new ds.Item[] { item26 };
        fPHeapMax25.copia(itemArray27);
        fPHeapMax12.copia(itemArray27);
        fPHeapMax1.copia(itemArray27);
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMax1.refaz((int) (short) 0, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertNull(item5);
        org.junit.Assert.assertNull(item8);
        org.junit.Assert.assertNull(item10);
        org.junit.Assert.assertNull(item16);
        org.junit.Assert.assertNotNull(itemArray20);
        org.junit.Assert.assertNotNull(itemArray27);
    }

    @Test
    public void test337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test337");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) ' ');
        fPHeapMax1.imprime();
        ds.FPHeapMax fPHeapMax4 = new ds.FPHeapMax((int) (byte) 1);
        ds.Item item5 = null;
        ds.Item[] itemArray6 = new ds.Item[] { item5 };
        fPHeapMax4.copia(itemArray6);
        ds.Item item8 = fPHeapMax4.max();
        fPHeapMax4.constroi();
        fPHeapMax4.constroi();
        ds.Item item11 = fPHeapMax4.max();
        fPHeapMax4.constroi();
        ds.Item item13 = fPHeapMax4.max();
        fPHeapMax4.imprime();
        ds.FPHeapMax fPHeapMax16 = new ds.FPHeapMax((int) (byte) 1);
        ds.Item item17 = null;
        ds.Item[] itemArray18 = new ds.Item[] { item17 };
        fPHeapMax16.copia(itemArray18);
        ds.Item item20 = fPHeapMax16.max();
        ds.FPHeapMax fPHeapMax22 = new ds.FPHeapMax((int) (byte) 1);
        ds.FPHeapMax fPHeapMax24 = new ds.FPHeapMax((int) (byte) 1);
        ds.Item item25 = null;
        ds.Item[] itemArray26 = new ds.Item[] { item25 };
        fPHeapMax24.copia(itemArray26);
        fPHeapMax22.copia(itemArray26);
        fPHeapMax16.copia(itemArray26);
        fPHeapMax4.copia(itemArray26);
        fPHeapMax1.copia(itemArray26);
        ds.FPHeapMax fPHeapMax33 = new ds.FPHeapMax(10);
        ds.FPHeapMax fPHeapMax35 = new ds.FPHeapMax((int) ' ');
        fPHeapMax35.imprime();
        ds.FPHeapMax fPHeapMax38 = new ds.FPHeapMax((int) (byte) 1);
        ds.FPHeapMax fPHeapMax40 = new ds.FPHeapMax((int) (byte) 1);
        ds.Item item41 = null;
        ds.Item[] itemArray42 = new ds.Item[] { item41 };
        fPHeapMax40.copia(itemArray42);
        fPHeapMax38.copia(itemArray42);
        fPHeapMax38.imprime();
        ds.FPHeapMax fPHeapMax47 = new ds.FPHeapMax((int) (byte) 1);
        ds.Item item48 = null;
        ds.Item[] itemArray49 = new ds.Item[] { item48 };
        fPHeapMax47.copia(itemArray49);
        ds.Item item51 = fPHeapMax47.max();
        ds.FPHeapMax fPHeapMax53 = new ds.FPHeapMax((int) (byte) 1);
        ds.FPHeapMax fPHeapMax55 = new ds.FPHeapMax((int) (byte) 1);
        ds.Item item56 = null;
        ds.Item[] itemArray57 = new ds.Item[] { item56 };
        fPHeapMax55.copia(itemArray57);
        fPHeapMax53.copia(itemArray57);
        fPHeapMax47.copia(itemArray57);
        fPHeapMax38.copia(itemArray57);
        fPHeapMax35.copia(itemArray57);
        fPHeapMax33.copia(itemArray57);
        fPHeapMax1.copia(itemArray57);
        fPHeapMax1.imprime();
        fPHeapMax1.refaz(10, 10);
        org.junit.Assert.assertNotNull(itemArray6);
        org.junit.Assert.assertNull(item8);
        org.junit.Assert.assertNull(item11);
        org.junit.Assert.assertNull(item13);
        org.junit.Assert.assertNotNull(itemArray18);
        org.junit.Assert.assertNull(item20);
        org.junit.Assert.assertNotNull(itemArray26);
        org.junit.Assert.assertNotNull(itemArray42);
        org.junit.Assert.assertNotNull(itemArray49);
        org.junit.Assert.assertNull(item51);
        org.junit.Assert.assertNotNull(itemArray57);
    }

    @Test
    public void test338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test338");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (byte) 1);
        ds.Item item2 = fPHeapMax1.max();
        fPHeapMax1.imprime();
        fPHeapMax1.constroi();
        fPHeapMax1.refaz((int) (byte) 1, 0);
        ds.FPHeapMax fPHeapMax9 = new ds.FPHeapMax((int) (short) 1);
        ds.FPHeapMax fPHeapMax11 = new ds.FPHeapMax(0);
        ds.FPHeapMax fPHeapMax13 = new ds.FPHeapMax((int) (byte) 1);
        ds.FPHeapMax fPHeapMax15 = new ds.FPHeapMax((int) (byte) 1);
        ds.Item item16 = null;
        ds.Item[] itemArray17 = new ds.Item[] { item16 };
        fPHeapMax15.copia(itemArray17);
        fPHeapMax13.copia(itemArray17);
        fPHeapMax11.copia(itemArray17);
        fPHeapMax9.copia(itemArray17);
        fPHeapMax9.imprime();
        ds.FPHeapMax fPHeapMax24 = new ds.FPHeapMax((int) ' ');
        fPHeapMax24.refaz((int) (short) 1, (int) (short) 1);
        ds.Item item28 = fPHeapMax24.max();
        ds.FPHeapMax fPHeapMax30 = new ds.FPHeapMax((int) (byte) 1);
        ds.Item item31 = null;
        ds.Item[] itemArray32 = new ds.Item[] { item31 };
        fPHeapMax30.copia(itemArray32);
        fPHeapMax24.copia(itemArray32);
        fPHeapMax9.copia(itemArray32);
        fPHeapMax1.copia(itemArray32);
        fPHeapMax1.constroi();
        org.junit.Assert.assertNull(item2);
        org.junit.Assert.assertNotNull(itemArray17);
        org.junit.Assert.assertNull(item28);
        org.junit.Assert.assertNotNull(itemArray32);
    }

    @Test
    public void test339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test339");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) ' ');
        fPHeapMax1.imprime();
        ds.FPHeapMax fPHeapMax4 = new ds.FPHeapMax((int) (byte) 1);
        ds.FPHeapMax fPHeapMax6 = new ds.FPHeapMax((int) (byte) 1);
        ds.Item item7 = null;
        ds.Item[] itemArray8 = new ds.Item[] { item7 };
        fPHeapMax6.copia(itemArray8);
        fPHeapMax4.copia(itemArray8);
        fPHeapMax4.imprime();
        ds.FPHeapMax fPHeapMax13 = new ds.FPHeapMax((int) (byte) 1);
        ds.Item item14 = null;
        ds.Item[] itemArray15 = new ds.Item[] { item14 };
        fPHeapMax13.copia(itemArray15);
        ds.Item item17 = fPHeapMax13.max();
        ds.FPHeapMax fPHeapMax19 = new ds.FPHeapMax((int) (byte) 1);
        ds.FPHeapMax fPHeapMax21 = new ds.FPHeapMax((int) (byte) 1);
        ds.Item item22 = null;
        ds.Item[] itemArray23 = new ds.Item[] { item22 };
        fPHeapMax21.copia(itemArray23);
        fPHeapMax19.copia(itemArray23);
        fPHeapMax13.copia(itemArray23);
        fPHeapMax4.copia(itemArray23);
        fPHeapMax1.copia(itemArray23);
        fPHeapMax1.imprime();
        org.junit.Assert.assertNotNull(itemArray8);
        org.junit.Assert.assertNotNull(itemArray15);
        org.junit.Assert.assertNull(item17);
        org.junit.Assert.assertNotNull(itemArray23);
    }

    @Test
    public void test340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test340");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) 'a');
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
    public void test341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test341");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (byte) 1);
        ds.FPHeapMax fPHeapMax3 = new ds.FPHeapMax((int) (byte) 1);
        ds.Item item4 = null;
        ds.Item[] itemArray5 = new ds.Item[] { item4 };
        fPHeapMax3.copia(itemArray5);
        fPHeapMax1.copia(itemArray5);
        ds.Item item8 = fPHeapMax1.max();
        fPHeapMax1.constroi();
        fPHeapMax1.constroi();
        fPHeapMax1.constroi();
        org.junit.Assert.assertNotNull(itemArray5);
        org.junit.Assert.assertNull(item8);
    }

    @Test
    public void test342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test342");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) ' ');
        fPHeapMax1.refaz((int) (short) 1, (int) (short) 1);
        ds.Item item5 = fPHeapMax1.max();
        ds.FPHeapMax fPHeapMax7 = new ds.FPHeapMax((int) (byte) 1);
        ds.Item item8 = null;
        ds.Item[] itemArray9 = new ds.Item[] { item8 };
        fPHeapMax7.copia(itemArray9);
        fPHeapMax1.copia(itemArray9);
        fPHeapMax1.refaz(10, (int) (short) 0);
        org.junit.Assert.assertNull(item5);
        org.junit.Assert.assertNotNull(itemArray9);
    }

    @Test
    public void test343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test343");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (byte) 1);
        ds.Item item2 = null;
        ds.Item[] itemArray3 = new ds.Item[] { item2 };
        fPHeapMax1.copia(itemArray3);
        ds.Item item5 = fPHeapMax1.max();
        fPHeapMax1.imprime();
        ds.FPHeapMax fPHeapMax8 = new ds.FPHeapMax((int) ' ');
        fPHeapMax8.refaz((int) (short) 1, (int) (short) 1);
        ds.Item item12 = fPHeapMax8.max();
        ds.FPHeapMax fPHeapMax14 = new ds.FPHeapMax((int) (byte) 1);
        ds.Item item15 = null;
        ds.Item[] itemArray16 = new ds.Item[] { item15 };
        fPHeapMax14.copia(itemArray16);
        fPHeapMax8.copia(itemArray16);
        fPHeapMax8.constroi();
        ds.FPHeapMax fPHeapMax21 = new ds.FPHeapMax((int) (byte) 1);
        ds.Item item22 = null;
        ds.Item[] itemArray23 = new ds.Item[] { item22 };
        fPHeapMax21.copia(itemArray23);
        fPHeapMax8.copia(itemArray23);
        fPHeapMax1.copia(itemArray23);
        fPHeapMax1.imprime();
        ds.FPHeapMax fPHeapMax30 = new ds.FPHeapMax((int) (byte) 1);
        ds.FPHeapMax fPHeapMax32 = new ds.FPHeapMax((int) (byte) 1);
        ds.Item item33 = null;
        ds.Item[] itemArray34 = new ds.Item[] { item33 };
        fPHeapMax32.copia(itemArray34);
        fPHeapMax30.copia(itemArray34);
        ds.Item item37 = fPHeapMax30.max();
        fPHeapMax30.constroi();
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMax1.aumentaChave((int) '#', (java.lang.Object) fPHeapMax30);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 35");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertNull(item5);
        org.junit.Assert.assertNull(item12);
        org.junit.Assert.assertNotNull(itemArray16);
        org.junit.Assert.assertNotNull(itemArray23);
        org.junit.Assert.assertNotNull(itemArray34);
        org.junit.Assert.assertNull(item37);
    }

    @Test
    public void test344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test344");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (byte) 1);
        ds.FPHeapMax fPHeapMax3 = new ds.FPHeapMax((int) (byte) 1);
        ds.Item item4 = null;
        ds.Item[] itemArray5 = new ds.Item[] { item4 };
        fPHeapMax3.copia(itemArray5);
        fPHeapMax1.copia(itemArray5);
        ds.Item item8 = fPHeapMax1.max();
        ds.Item item9 = fPHeapMax1.max();
        ds.Item item10 = fPHeapMax1.max();
        org.junit.Assert.assertNotNull(itemArray5);
        org.junit.Assert.assertNull(item8);
        org.junit.Assert.assertNull(item9);
        org.junit.Assert.assertNull(item10);
    }

    @Test
    public void test345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test345");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (short) 0);
        fPHeapMax1.imprime();
        ds.FPHeapMax fPHeapMax4 = new ds.FPHeapMax((int) ' ');
        fPHeapMax4.imprime();
        ds.FPHeapMax fPHeapMax7 = new ds.FPHeapMax((int) (byte) 1);
        ds.Item item8 = null;
        ds.Item[] itemArray9 = new ds.Item[] { item8 };
        fPHeapMax7.copia(itemArray9);
        ds.Item item11 = fPHeapMax7.max();
        fPHeapMax7.constroi();
        fPHeapMax7.constroi();
        ds.Item item14 = fPHeapMax7.max();
        fPHeapMax7.constroi();
        ds.Item item16 = fPHeapMax7.max();
        fPHeapMax7.imprime();
        ds.FPHeapMax fPHeapMax19 = new ds.FPHeapMax((int) (byte) 1);
        ds.Item item20 = null;
        ds.Item[] itemArray21 = new ds.Item[] { item20 };
        fPHeapMax19.copia(itemArray21);
        ds.Item item23 = fPHeapMax19.max();
        ds.FPHeapMax fPHeapMax25 = new ds.FPHeapMax((int) (byte) 1);
        ds.FPHeapMax fPHeapMax27 = new ds.FPHeapMax((int) (byte) 1);
        ds.Item item28 = null;
        ds.Item[] itemArray29 = new ds.Item[] { item28 };
        fPHeapMax27.copia(itemArray29);
        fPHeapMax25.copia(itemArray29);
        fPHeapMax19.copia(itemArray29);
        fPHeapMax7.copia(itemArray29);
        fPHeapMax4.copia(itemArray29);
        fPHeapMax1.copia(itemArray29);
        org.junit.Assert.assertNotNull(itemArray9);
        org.junit.Assert.assertNull(item11);
        org.junit.Assert.assertNull(item14);
        org.junit.Assert.assertNull(item16);
        org.junit.Assert.assertNotNull(itemArray21);
        org.junit.Assert.assertNull(item23);
        org.junit.Assert.assertNotNull(itemArray29);
    }

    @Test
    public void test346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test346");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (byte) 1);
        ds.Item item2 = null;
        ds.Item[] itemArray3 = new ds.Item[] { item2 };
        fPHeapMax1.copia(itemArray3);
        ds.Item item5 = fPHeapMax1.max();
        ds.Item item6 = fPHeapMax1.max();
        fPHeapMax1.imprime();
        fPHeapMax1.constroi();
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertNull(item5);
        org.junit.Assert.assertNull(item6);
    }

    @Test
    public void test347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test347");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (byte) 1);
        ds.FPHeapMax fPHeapMax3 = new ds.FPHeapMax((int) (byte) 1);
        ds.Item item4 = null;
        ds.Item[] itemArray5 = new ds.Item[] { item4 };
        fPHeapMax3.copia(itemArray5);
        fPHeapMax1.copia(itemArray5);
        ds.Item item8 = fPHeapMax1.max();
        fPHeapMax1.imprime();
        // The following exception was thrown during execution in test generation
        try {
            ds.Item item10 = fPHeapMax1.retiraMax();
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: heap vazio");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray5);
        org.junit.Assert.assertNull(item8);
    }

    @Test
    public void test348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test348");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax(10);
        fPHeapMax1.imprime();
        ds.FPHeapMax fPHeapMax4 = new ds.FPHeapMax(0);
        ds.FPHeapMax fPHeapMax6 = new ds.FPHeapMax((int) (byte) 1);
        ds.FPHeapMax fPHeapMax8 = new ds.FPHeapMax((int) (byte) 1);
        ds.Item item9 = null;
        ds.Item[] itemArray10 = new ds.Item[] { item9 };
        fPHeapMax8.copia(itemArray10);
        fPHeapMax6.copia(itemArray10);
        fPHeapMax4.copia(itemArray10);
        fPHeapMax1.copia(itemArray10);
        fPHeapMax1.imprime();
        org.junit.Assert.assertNotNull(itemArray10);
    }

    @Test
    public void test349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test349");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) ' ');
        fPHeapMax1.refaz((int) (short) 1, (int) (short) 1);
        ds.Item item5 = fPHeapMax1.max();
        ds.FPHeapMax fPHeapMax7 = new ds.FPHeapMax((int) (byte) 1);
        ds.Item item8 = null;
        ds.Item[] itemArray9 = new ds.Item[] { item8 };
        fPHeapMax7.copia(itemArray9);
        fPHeapMax1.copia(itemArray9);
        fPHeapMax1.constroi();
        ds.FPHeapMax fPHeapMax14 = new ds.FPHeapMax((int) (byte) 1);
        ds.Item item15 = null;
        ds.Item[] itemArray16 = new ds.Item[] { item15 };
        fPHeapMax14.copia(itemArray16);
        fPHeapMax1.copia(itemArray16);
        ds.Item item19 = null;
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMax1.insere(item19);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(item5);
        org.junit.Assert.assertNotNull(itemArray9);
        org.junit.Assert.assertNotNull(itemArray16);
    }

    @Test
    public void test350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test350");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (byte) 1);
        ds.Item item2 = null;
        ds.Item[] itemArray3 = new ds.Item[] { item2 };
        fPHeapMax1.copia(itemArray3);
        ds.Item item5 = fPHeapMax1.max();
        fPHeapMax1.constroi();
        fPHeapMax1.constroi();
        ds.Item item8 = fPHeapMax1.max();
        fPHeapMax1.imprime();
        ds.Item item10 = fPHeapMax1.max();
        fPHeapMax1.imprime();
        fPHeapMax1.constroi();
        ds.FPHeapMax fPHeapMax14 = new ds.FPHeapMax((int) (byte) 1);
        ds.Item item15 = null;
        ds.Item[] itemArray16 = new ds.Item[] { item15 };
        fPHeapMax14.copia(itemArray16);
        ds.Item item18 = fPHeapMax14.max();
        fPHeapMax14.constroi();
        fPHeapMax14.constroi();
        ds.Item item21 = fPHeapMax14.max();
        fPHeapMax14.constroi();
        fPHeapMax14.imprime();
        ds.FPHeapMax fPHeapMax25 = new ds.FPHeapMax(0);
        ds.FPHeapMax fPHeapMax27 = new ds.FPHeapMax((int) (byte) 1);
        ds.FPHeapMax fPHeapMax29 = new ds.FPHeapMax((int) (byte) 1);
        ds.Item item30 = null;
        ds.Item[] itemArray31 = new ds.Item[] { item30 };
        fPHeapMax29.copia(itemArray31);
        fPHeapMax27.copia(itemArray31);
        fPHeapMax25.copia(itemArray31);
        fPHeapMax14.copia(itemArray31);
        fPHeapMax1.copia(itemArray31);
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
        org.junit.Assert.assertNull(item8);
        org.junit.Assert.assertNull(item10);
        org.junit.Assert.assertNotNull(itemArray16);
        org.junit.Assert.assertNull(item18);
        org.junit.Assert.assertNull(item21);
        org.junit.Assert.assertNotNull(itemArray31);
    }

    @Test
    public void test351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test351");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (short) 100);
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
    public void test352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test352");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) ' ');
        fPHeapMax1.imprime();
        fPHeapMax1.constroi();
        ds.Item item4 = fPHeapMax1.max();
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMax1.refaz((int) (short) -1, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(item4);
    }

    @Test
    public void test353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test353");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (short) 1);
        ds.FPHeapMax fPHeapMax3 = new ds.FPHeapMax(0);
        ds.FPHeapMax fPHeapMax5 = new ds.FPHeapMax((int) (byte) 1);
        ds.FPHeapMax fPHeapMax7 = new ds.FPHeapMax((int) (byte) 1);
        ds.Item item8 = null;
        ds.Item[] itemArray9 = new ds.Item[] { item8 };
        fPHeapMax7.copia(itemArray9);
        fPHeapMax5.copia(itemArray9);
        fPHeapMax3.copia(itemArray9);
        fPHeapMax1.copia(itemArray9);
        ds.Item item14 = null;
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMax1.insere(item14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray9);
    }

    @Test
    public void test354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test354");
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
    public void test355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test355");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (byte) 1);
        ds.Item item2 = null;
        ds.Item[] itemArray3 = new ds.Item[] { item2 };
        fPHeapMax1.copia(itemArray3);
        ds.Item item5 = fPHeapMax1.max();
        fPHeapMax1.constroi();
        fPHeapMax1.constroi();
        ds.Item item8 = fPHeapMax1.max();
        fPHeapMax1.constroi();
        fPHeapMax1.refaz(0, (int) (short) -1);
        fPHeapMax1.constroi();
        ds.FPHeapMax fPHeapMax15 = new ds.FPHeapMax((int) (short) 1);
        ds.FPHeapMax fPHeapMax17 = new ds.FPHeapMax(0);
        ds.FPHeapMax fPHeapMax19 = new ds.FPHeapMax((int) (byte) 1);
        ds.FPHeapMax fPHeapMax21 = new ds.FPHeapMax((int) (byte) 1);
        ds.Item item22 = null;
        ds.Item[] itemArray23 = new ds.Item[] { item22 };
        fPHeapMax21.copia(itemArray23);
        fPHeapMax19.copia(itemArray23);
        fPHeapMax17.copia(itemArray23);
        fPHeapMax15.copia(itemArray23);
        fPHeapMax15.imprime();
        ds.FPHeapMax fPHeapMax30 = new ds.FPHeapMax((int) ' ');
        fPHeapMax30.refaz((int) (short) 1, (int) (short) 1);
        ds.Item item34 = fPHeapMax30.max();
        ds.FPHeapMax fPHeapMax36 = new ds.FPHeapMax((int) (byte) 1);
        ds.Item item37 = null;
        ds.Item[] itemArray38 = new ds.Item[] { item37 };
        fPHeapMax36.copia(itemArray38);
        fPHeapMax30.copia(itemArray38);
        fPHeapMax15.copia(itemArray38);
        fPHeapMax1.copia(itemArray38);
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMax1.refaz(10, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 10");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertNull(item5);
        org.junit.Assert.assertNull(item8);
        org.junit.Assert.assertNotNull(itemArray23);
        org.junit.Assert.assertNull(item34);
        org.junit.Assert.assertNotNull(itemArray38);
    }

    @Test
    public void test356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test356");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (byte) 1);
        ds.Item item2 = null;
        ds.Item[] itemArray3 = new ds.Item[] { item2 };
        fPHeapMax1.copia(itemArray3);
        ds.Item item5 = fPHeapMax1.max();
        fPHeapMax1.imprime();
        ds.Item item7 = fPHeapMax1.max();
        java.lang.Class<?> wildcardClass8 = fPHeapMax1.getClass();
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertNull(item5);
        org.junit.Assert.assertNull(item7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test357");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (byte) 1);
        ds.Item item2 = null;
        ds.Item[] itemArray3 = new ds.Item[] { item2 };
        fPHeapMax1.copia(itemArray3);
        ds.FPHeapMax fPHeapMax6 = new ds.FPHeapMax((int) (byte) 1);
        ds.Item item7 = null;
        ds.Item[] itemArray8 = new ds.Item[] { item7 };
        fPHeapMax6.copia(itemArray8);
        ds.Item item10 = fPHeapMax6.max();
        fPHeapMax6.constroi();
        fPHeapMax6.constroi();
        ds.Item item13 = fPHeapMax6.max();
        fPHeapMax6.constroi();
        ds.Item item15 = fPHeapMax6.max();
        fPHeapMax6.constroi();
        fPHeapMax6.imprime();
        ds.FPHeapMax fPHeapMax19 = new ds.FPHeapMax((int) (byte) 1);
        ds.Item item20 = null;
        ds.Item[] itemArray21 = new ds.Item[] { item20 };
        fPHeapMax19.copia(itemArray21);
        ds.Item item23 = fPHeapMax19.max();
        fPHeapMax19.constroi();
        fPHeapMax19.constroi();
        ds.Item item26 = fPHeapMax19.max();
        fPHeapMax19.constroi();
        fPHeapMax19.imprime();
        ds.Item item29 = fPHeapMax19.max();
        ds.Item item30 = fPHeapMax19.max();
        ds.FPHeapMax fPHeapMax32 = new ds.FPHeapMax((int) ' ');
        fPHeapMax32.imprime();
        ds.FPHeapMax fPHeapMax35 = new ds.FPHeapMax((int) (byte) 1);
        ds.FPHeapMax fPHeapMax37 = new ds.FPHeapMax((int) (byte) 1);
        ds.Item item38 = null;
        ds.Item[] itemArray39 = new ds.Item[] { item38 };
        fPHeapMax37.copia(itemArray39);
        fPHeapMax35.copia(itemArray39);
        fPHeapMax35.imprime();
        ds.FPHeapMax fPHeapMax44 = new ds.FPHeapMax((int) (byte) 1);
        ds.Item item45 = null;
        ds.Item[] itemArray46 = new ds.Item[] { item45 };
        fPHeapMax44.copia(itemArray46);
        ds.Item item48 = fPHeapMax44.max();
        ds.FPHeapMax fPHeapMax50 = new ds.FPHeapMax((int) (byte) 1);
        ds.FPHeapMax fPHeapMax52 = new ds.FPHeapMax((int) (byte) 1);
        ds.Item item53 = null;
        ds.Item[] itemArray54 = new ds.Item[] { item53 };
        fPHeapMax52.copia(itemArray54);
        fPHeapMax50.copia(itemArray54);
        fPHeapMax44.copia(itemArray54);
        fPHeapMax35.copia(itemArray54);
        fPHeapMax32.copia(itemArray54);
        fPHeapMax19.copia(itemArray54);
        fPHeapMax6.copia(itemArray54);
        fPHeapMax1.copia(itemArray54);
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertNotNull(itemArray8);
        org.junit.Assert.assertNull(item10);
        org.junit.Assert.assertNull(item13);
        org.junit.Assert.assertNull(item15);
        org.junit.Assert.assertNotNull(itemArray21);
        org.junit.Assert.assertNull(item23);
        org.junit.Assert.assertNull(item26);
        org.junit.Assert.assertNull(item29);
        org.junit.Assert.assertNull(item30);
        org.junit.Assert.assertNotNull(itemArray39);
        org.junit.Assert.assertNotNull(itemArray46);
        org.junit.Assert.assertNull(item48);
        org.junit.Assert.assertNotNull(itemArray54);
    }

    @Test
    public void test358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test358");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) ' ');
        fPHeapMax1.imprime();
        ds.FPHeapMax fPHeapMax4 = new ds.FPHeapMax((int) (byte) 1);
        ds.Item item5 = null;
        ds.Item[] itemArray6 = new ds.Item[] { item5 };
        fPHeapMax4.copia(itemArray6);
        ds.Item item8 = fPHeapMax4.max();
        fPHeapMax4.constroi();
        fPHeapMax4.constroi();
        ds.Item item11 = fPHeapMax4.max();
        fPHeapMax4.constroi();
        ds.Item item13 = fPHeapMax4.max();
        fPHeapMax4.imprime();
        ds.FPHeapMax fPHeapMax16 = new ds.FPHeapMax((int) (byte) 1);
        ds.Item item17 = null;
        ds.Item[] itemArray18 = new ds.Item[] { item17 };
        fPHeapMax16.copia(itemArray18);
        ds.Item item20 = fPHeapMax16.max();
        ds.FPHeapMax fPHeapMax22 = new ds.FPHeapMax((int) (byte) 1);
        ds.FPHeapMax fPHeapMax24 = new ds.FPHeapMax((int) (byte) 1);
        ds.Item item25 = null;
        ds.Item[] itemArray26 = new ds.Item[] { item25 };
        fPHeapMax24.copia(itemArray26);
        fPHeapMax22.copia(itemArray26);
        fPHeapMax16.copia(itemArray26);
        fPHeapMax4.copia(itemArray26);
        fPHeapMax1.copia(itemArray26);
        ds.FPHeapMax fPHeapMax33 = new ds.FPHeapMax(10);
        ds.FPHeapMax fPHeapMax35 = new ds.FPHeapMax((int) ' ');
        fPHeapMax35.imprime();
        ds.FPHeapMax fPHeapMax38 = new ds.FPHeapMax((int) (byte) 1);
        ds.FPHeapMax fPHeapMax40 = new ds.FPHeapMax((int) (byte) 1);
        ds.Item item41 = null;
        ds.Item[] itemArray42 = new ds.Item[] { item41 };
        fPHeapMax40.copia(itemArray42);
        fPHeapMax38.copia(itemArray42);
        fPHeapMax38.imprime();
        ds.FPHeapMax fPHeapMax47 = new ds.FPHeapMax((int) (byte) 1);
        ds.Item item48 = null;
        ds.Item[] itemArray49 = new ds.Item[] { item48 };
        fPHeapMax47.copia(itemArray49);
        ds.Item item51 = fPHeapMax47.max();
        ds.FPHeapMax fPHeapMax53 = new ds.FPHeapMax((int) (byte) 1);
        ds.FPHeapMax fPHeapMax55 = new ds.FPHeapMax((int) (byte) 1);
        ds.Item item56 = null;
        ds.Item[] itemArray57 = new ds.Item[] { item56 };
        fPHeapMax55.copia(itemArray57);
        fPHeapMax53.copia(itemArray57);
        fPHeapMax47.copia(itemArray57);
        fPHeapMax38.copia(itemArray57);
        fPHeapMax35.copia(itemArray57);
        fPHeapMax33.copia(itemArray57);
        fPHeapMax1.copia(itemArray57);
        ds.Item item65 = fPHeapMax1.max();
        // The following exception was thrown during execution in test generation
        try {
            ds.Item item66 = fPHeapMax1.retiraMax();
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: heap vazio");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray6);
        org.junit.Assert.assertNull(item8);
        org.junit.Assert.assertNull(item11);
        org.junit.Assert.assertNull(item13);
        org.junit.Assert.assertNotNull(itemArray18);
        org.junit.Assert.assertNull(item20);
        org.junit.Assert.assertNotNull(itemArray26);
        org.junit.Assert.assertNotNull(itemArray42);
        org.junit.Assert.assertNotNull(itemArray49);
        org.junit.Assert.assertNull(item51);
        org.junit.Assert.assertNotNull(itemArray57);
        org.junit.Assert.assertNull(item65);
    }

    @Test
    public void test359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test359");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) ' ');
        fPHeapMax1.refaz((int) (short) 1, (int) (short) 1);
        ds.FPHeapMax fPHeapMax7 = new ds.FPHeapMax(100);
        fPHeapMax7.refaz((int) 'a', 0);
        ds.FPHeapMax fPHeapMax12 = new ds.FPHeapMax((int) (short) 1);
        ds.FPHeapMax fPHeapMax14 = new ds.FPHeapMax(0);
        ds.FPHeapMax fPHeapMax16 = new ds.FPHeapMax((int) (byte) 1);
        ds.FPHeapMax fPHeapMax18 = new ds.FPHeapMax((int) (byte) 1);
        ds.Item item19 = null;
        ds.Item[] itemArray20 = new ds.Item[] { item19 };
        fPHeapMax18.copia(itemArray20);
        fPHeapMax16.copia(itemArray20);
        fPHeapMax14.copia(itemArray20);
        fPHeapMax12.copia(itemArray20);
        fPHeapMax7.copia(itemArray20);
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMax1.aumentaChave(0, (java.lang.Object) fPHeapMax7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray20);
    }

    @Test
    public void test360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test360");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (byte) -1);
        fPHeapMax1.imprime();
        ds.FPHeapMax fPHeapMax4 = new ds.FPHeapMax((int) (short) 1);
        ds.FPHeapMax fPHeapMax6 = new ds.FPHeapMax(0);
        ds.FPHeapMax fPHeapMax8 = new ds.FPHeapMax((int) (byte) 1);
        ds.FPHeapMax fPHeapMax10 = new ds.FPHeapMax((int) (byte) 1);
        ds.Item item11 = null;
        ds.Item[] itemArray12 = new ds.Item[] { item11 };
        fPHeapMax10.copia(itemArray12);
        fPHeapMax8.copia(itemArray12);
        fPHeapMax6.copia(itemArray12);
        fPHeapMax4.copia(itemArray12);
        fPHeapMax4.imprime();
        ds.FPHeapMax fPHeapMax19 = new ds.FPHeapMax((int) ' ');
        fPHeapMax19.refaz((int) (short) 1, (int) (short) 1);
        ds.Item item23 = fPHeapMax19.max();
        ds.FPHeapMax fPHeapMax25 = new ds.FPHeapMax((int) (byte) 1);
        ds.Item item26 = null;
        ds.Item[] itemArray27 = new ds.Item[] { item26 };
        fPHeapMax25.copia(itemArray27);
        fPHeapMax19.copia(itemArray27);
        fPHeapMax4.copia(itemArray27);
        fPHeapMax1.copia(itemArray27);
        java.lang.Object obj33 = null;
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMax1.aumentaChave((int) (byte) 10, obj33);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 10");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray12);
        org.junit.Assert.assertNull(item23);
        org.junit.Assert.assertNotNull(itemArray27);
    }

    @Test
    public void test361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test361");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) ' ');
        fPHeapMax1.refaz((int) (short) 1, (int) (short) 1);
        ds.Item item5 = fPHeapMax1.max();
        ds.FPHeapMax fPHeapMax7 = new ds.FPHeapMax((int) (byte) 1);
        ds.Item item8 = null;
        ds.Item[] itemArray9 = new ds.Item[] { item8 };
        fPHeapMax7.copia(itemArray9);
        fPHeapMax1.copia(itemArray9);
        fPHeapMax1.constroi();
        ds.FPHeapMax fPHeapMax14 = new ds.FPHeapMax((int) (short) 1);
        ds.FPHeapMax fPHeapMax16 = new ds.FPHeapMax(0);
        ds.FPHeapMax fPHeapMax18 = new ds.FPHeapMax((int) (byte) 1);
        ds.FPHeapMax fPHeapMax20 = new ds.FPHeapMax((int) (byte) 1);
        ds.Item item21 = null;
        ds.Item[] itemArray22 = new ds.Item[] { item21 };
        fPHeapMax20.copia(itemArray22);
        fPHeapMax18.copia(itemArray22);
        fPHeapMax16.copia(itemArray22);
        fPHeapMax14.copia(itemArray22);
        fPHeapMax14.imprime();
        ds.FPHeapMax fPHeapMax29 = new ds.FPHeapMax((int) ' ');
        fPHeapMax29.refaz((int) (short) 1, (int) (short) 1);
        ds.Item item33 = fPHeapMax29.max();
        ds.FPHeapMax fPHeapMax35 = new ds.FPHeapMax((int) (byte) 1);
        ds.Item item36 = null;
        ds.Item[] itemArray37 = new ds.Item[] { item36 };
        fPHeapMax35.copia(itemArray37);
        fPHeapMax29.copia(itemArray37);
        fPHeapMax14.copia(itemArray37);
        ds.FPHeapMax fPHeapMax42 = new ds.FPHeapMax((int) (byte) 1);
        ds.Item item43 = null;
        ds.Item[] itemArray44 = new ds.Item[] { item43 };
        fPHeapMax42.copia(itemArray44);
        ds.Item item46 = fPHeapMax42.max();
        fPHeapMax42.constroi();
        fPHeapMax42.constroi();
        ds.Item item49 = fPHeapMax42.max();
        fPHeapMax42.constroi();
        ds.Item item51 = fPHeapMax42.max();
        fPHeapMax42.imprime();
        ds.FPHeapMax fPHeapMax54 = new ds.FPHeapMax((int) (byte) 1);
        ds.Item item55 = null;
        ds.Item[] itemArray56 = new ds.Item[] { item55 };
        fPHeapMax54.copia(itemArray56);
        ds.Item item58 = fPHeapMax54.max();
        ds.FPHeapMax fPHeapMax60 = new ds.FPHeapMax((int) (byte) 1);
        ds.FPHeapMax fPHeapMax62 = new ds.FPHeapMax((int) (byte) 1);
        ds.Item item63 = null;
        ds.Item[] itemArray64 = new ds.Item[] { item63 };
        fPHeapMax62.copia(itemArray64);
        fPHeapMax60.copia(itemArray64);
        fPHeapMax54.copia(itemArray64);
        fPHeapMax42.copia(itemArray64);
        fPHeapMax14.copia(itemArray64);
        fPHeapMax1.copia(itemArray64);
        ds.FPHeapMax fPHeapMax73 = new ds.FPHeapMax((int) (byte) 1);
        ds.FPHeapMax fPHeapMax75 = new ds.FPHeapMax((int) (byte) 1);
        ds.Item item76 = null;
        ds.Item[] itemArray77 = new ds.Item[] { item76 };
        fPHeapMax75.copia(itemArray77);
        fPHeapMax73.copia(itemArray77);
        ds.Item item80 = fPHeapMax73.max();
        ds.Item item81 = fPHeapMax73.max();
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMax1.aumentaChave((int) (short) 0, (java.lang.Object) item81);
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: chaveNova com valor null");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(item5);
        org.junit.Assert.assertNotNull(itemArray9);
        org.junit.Assert.assertNotNull(itemArray22);
        org.junit.Assert.assertNull(item33);
        org.junit.Assert.assertNotNull(itemArray37);
        org.junit.Assert.assertNotNull(itemArray44);
        org.junit.Assert.assertNull(item46);
        org.junit.Assert.assertNull(item49);
        org.junit.Assert.assertNull(item51);
        org.junit.Assert.assertNotNull(itemArray56);
        org.junit.Assert.assertNull(item58);
        org.junit.Assert.assertNotNull(itemArray64);
        org.junit.Assert.assertNotNull(itemArray77);
        org.junit.Assert.assertNull(item80);
        org.junit.Assert.assertNull(item81);
    }

    @Test
    public void test362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test362");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (byte) 1);
        ds.Item item2 = null;
        ds.Item[] itemArray3 = new ds.Item[] { item2 };
        fPHeapMax1.copia(itemArray3);
        ds.Item item5 = fPHeapMax1.max();
        fPHeapMax1.imprime();
        ds.Item item7 = fPHeapMax1.max();
        ds.Item item8 = fPHeapMax1.max();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass9 = item8.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertNull(item5);
        org.junit.Assert.assertNull(item7);
        org.junit.Assert.assertNull(item8);
    }

    @Test
    public void test363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test363");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (byte) 100);
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
    public void test364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test364");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) ' ');
        fPHeapMax1.imprime();
        ds.FPHeapMax fPHeapMax4 = new ds.FPHeapMax((int) (byte) 1);
        ds.Item item5 = null;
        ds.Item[] itemArray6 = new ds.Item[] { item5 };
        fPHeapMax4.copia(itemArray6);
        ds.Item item8 = fPHeapMax4.max();
        fPHeapMax4.constroi();
        fPHeapMax4.constroi();
        ds.Item item11 = fPHeapMax4.max();
        fPHeapMax4.constroi();
        ds.Item item13 = fPHeapMax4.max();
        fPHeapMax4.imprime();
        ds.FPHeapMax fPHeapMax16 = new ds.FPHeapMax((int) (byte) 1);
        ds.Item item17 = null;
        ds.Item[] itemArray18 = new ds.Item[] { item17 };
        fPHeapMax16.copia(itemArray18);
        ds.Item item20 = fPHeapMax16.max();
        ds.FPHeapMax fPHeapMax22 = new ds.FPHeapMax((int) (byte) 1);
        ds.FPHeapMax fPHeapMax24 = new ds.FPHeapMax((int) (byte) 1);
        ds.Item item25 = null;
        ds.Item[] itemArray26 = new ds.Item[] { item25 };
        fPHeapMax24.copia(itemArray26);
        fPHeapMax22.copia(itemArray26);
        fPHeapMax16.copia(itemArray26);
        fPHeapMax4.copia(itemArray26);
        fPHeapMax1.copia(itemArray26);
        ds.FPHeapMax fPHeapMax33 = new ds.FPHeapMax(10);
        ds.FPHeapMax fPHeapMax35 = new ds.FPHeapMax((int) ' ');
        fPHeapMax35.imprime();
        ds.FPHeapMax fPHeapMax38 = new ds.FPHeapMax((int) (byte) 1);
        ds.FPHeapMax fPHeapMax40 = new ds.FPHeapMax((int) (byte) 1);
        ds.Item item41 = null;
        ds.Item[] itemArray42 = new ds.Item[] { item41 };
        fPHeapMax40.copia(itemArray42);
        fPHeapMax38.copia(itemArray42);
        fPHeapMax38.imprime();
        ds.FPHeapMax fPHeapMax47 = new ds.FPHeapMax((int) (byte) 1);
        ds.Item item48 = null;
        ds.Item[] itemArray49 = new ds.Item[] { item48 };
        fPHeapMax47.copia(itemArray49);
        ds.Item item51 = fPHeapMax47.max();
        ds.FPHeapMax fPHeapMax53 = new ds.FPHeapMax((int) (byte) 1);
        ds.FPHeapMax fPHeapMax55 = new ds.FPHeapMax((int) (byte) 1);
        ds.Item item56 = null;
        ds.Item[] itemArray57 = new ds.Item[] { item56 };
        fPHeapMax55.copia(itemArray57);
        fPHeapMax53.copia(itemArray57);
        fPHeapMax47.copia(itemArray57);
        fPHeapMax38.copia(itemArray57);
        fPHeapMax35.copia(itemArray57);
        fPHeapMax33.copia(itemArray57);
        fPHeapMax1.copia(itemArray57);
        java.lang.Class<?> wildcardClass65 = itemArray57.getClass();
        org.junit.Assert.assertNotNull(itemArray6);
        org.junit.Assert.assertNull(item8);
        org.junit.Assert.assertNull(item11);
        org.junit.Assert.assertNull(item13);
        org.junit.Assert.assertNotNull(itemArray18);
        org.junit.Assert.assertNull(item20);
        org.junit.Assert.assertNotNull(itemArray26);
        org.junit.Assert.assertNotNull(itemArray42);
        org.junit.Assert.assertNotNull(itemArray49);
        org.junit.Assert.assertNull(item51);
        org.junit.Assert.assertNotNull(itemArray57);
        org.junit.Assert.assertNotNull(wildcardClass65);
    }

    @Test
    public void test365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test365");
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
    public void test366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test366");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (byte) 1);
        ds.Item item2 = null;
        ds.Item[] itemArray3 = new ds.Item[] { item2 };
        fPHeapMax1.copia(itemArray3);
        ds.Item item5 = fPHeapMax1.max();
        fPHeapMax1.constroi();
        fPHeapMax1.constroi();
        ds.Item item8 = fPHeapMax1.max();
        fPHeapMax1.constroi();
        ds.Item item10 = fPHeapMax1.max();
        ds.Item item11 = fPHeapMax1.max();
        fPHeapMax1.constroi();
        ds.FPHeapMax fPHeapMax14 = new ds.FPHeapMax((int) (byte) 1);
        ds.Item item15 = null;
        ds.Item[] itemArray16 = new ds.Item[] { item15 };
        fPHeapMax14.copia(itemArray16);
        ds.Item item18 = fPHeapMax14.max();
        fPHeapMax14.imprime();
        ds.FPHeapMax fPHeapMax21 = new ds.FPHeapMax((int) ' ');
        fPHeapMax21.refaz((int) (short) 1, (int) (short) 1);
        ds.Item item25 = fPHeapMax21.max();
        ds.FPHeapMax fPHeapMax27 = new ds.FPHeapMax((int) (byte) 1);
        ds.Item item28 = null;
        ds.Item[] itemArray29 = new ds.Item[] { item28 };
        fPHeapMax27.copia(itemArray29);
        fPHeapMax21.copia(itemArray29);
        fPHeapMax21.constroi();
        ds.FPHeapMax fPHeapMax34 = new ds.FPHeapMax((int) (byte) 1);
        ds.Item item35 = null;
        ds.Item[] itemArray36 = new ds.Item[] { item35 };
        fPHeapMax34.copia(itemArray36);
        fPHeapMax21.copia(itemArray36);
        fPHeapMax14.copia(itemArray36);
        fPHeapMax1.copia(itemArray36);
        // The following exception was thrown during execution in test generation
        try {
            ds.Item item41 = fPHeapMax1.retiraMax();
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: heap vazio");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertNull(item5);
        org.junit.Assert.assertNull(item8);
        org.junit.Assert.assertNull(item10);
        org.junit.Assert.assertNull(item11);
        org.junit.Assert.assertNotNull(itemArray16);
        org.junit.Assert.assertNull(item18);
        org.junit.Assert.assertNull(item25);
        org.junit.Assert.assertNotNull(itemArray29);
        org.junit.Assert.assertNotNull(itemArray36);
    }

    @Test
    public void test367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test367");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (short) 1);
        fPHeapMax1.imprime();
        fPHeapMax1.constroi();
        ds.FPHeapMax fPHeapMax5 = new ds.FPHeapMax((int) ' ');
        fPHeapMax5.imprime();
        ds.FPHeapMax fPHeapMax8 = new ds.FPHeapMax((int) (byte) 1);
        ds.Item item9 = null;
        ds.Item[] itemArray10 = new ds.Item[] { item9 };
        fPHeapMax8.copia(itemArray10);
        ds.Item item12 = fPHeapMax8.max();
        fPHeapMax8.constroi();
        fPHeapMax8.constroi();
        ds.Item item15 = fPHeapMax8.max();
        fPHeapMax8.constroi();
        ds.Item item17 = fPHeapMax8.max();
        fPHeapMax8.imprime();
        ds.FPHeapMax fPHeapMax20 = new ds.FPHeapMax((int) (byte) 1);
        ds.Item item21 = null;
        ds.Item[] itemArray22 = new ds.Item[] { item21 };
        fPHeapMax20.copia(itemArray22);
        ds.Item item24 = fPHeapMax20.max();
        ds.FPHeapMax fPHeapMax26 = new ds.FPHeapMax((int) (byte) 1);
        ds.FPHeapMax fPHeapMax28 = new ds.FPHeapMax((int) (byte) 1);
        ds.Item item29 = null;
        ds.Item[] itemArray30 = new ds.Item[] { item29 };
        fPHeapMax28.copia(itemArray30);
        fPHeapMax26.copia(itemArray30);
        fPHeapMax20.copia(itemArray30);
        fPHeapMax8.copia(itemArray30);
        fPHeapMax5.copia(itemArray30);
        ds.FPHeapMax fPHeapMax37 = new ds.FPHeapMax(10);
        ds.FPHeapMax fPHeapMax39 = new ds.FPHeapMax((int) ' ');
        fPHeapMax39.imprime();
        ds.FPHeapMax fPHeapMax42 = new ds.FPHeapMax((int) (byte) 1);
        ds.FPHeapMax fPHeapMax44 = new ds.FPHeapMax((int) (byte) 1);
        ds.Item item45 = null;
        ds.Item[] itemArray46 = new ds.Item[] { item45 };
        fPHeapMax44.copia(itemArray46);
        fPHeapMax42.copia(itemArray46);
        fPHeapMax42.imprime();
        ds.FPHeapMax fPHeapMax51 = new ds.FPHeapMax((int) (byte) 1);
        ds.Item item52 = null;
        ds.Item[] itemArray53 = new ds.Item[] { item52 };
        fPHeapMax51.copia(itemArray53);
        ds.Item item55 = fPHeapMax51.max();
        ds.FPHeapMax fPHeapMax57 = new ds.FPHeapMax((int) (byte) 1);
        ds.FPHeapMax fPHeapMax59 = new ds.FPHeapMax((int) (byte) 1);
        ds.Item item60 = null;
        ds.Item[] itemArray61 = new ds.Item[] { item60 };
        fPHeapMax59.copia(itemArray61);
        fPHeapMax57.copia(itemArray61);
        fPHeapMax51.copia(itemArray61);
        fPHeapMax42.copia(itemArray61);
        fPHeapMax39.copia(itemArray61);
        fPHeapMax37.copia(itemArray61);
        fPHeapMax5.copia(itemArray61);
        fPHeapMax1.copia(itemArray61);
        java.lang.Class<?> wildcardClass70 = fPHeapMax1.getClass();
        org.junit.Assert.assertNotNull(itemArray10);
        org.junit.Assert.assertNull(item12);
        org.junit.Assert.assertNull(item15);
        org.junit.Assert.assertNull(item17);
        org.junit.Assert.assertNotNull(itemArray22);
        org.junit.Assert.assertNull(item24);
        org.junit.Assert.assertNotNull(itemArray30);
        org.junit.Assert.assertNotNull(itemArray46);
        org.junit.Assert.assertNotNull(itemArray53);
        org.junit.Assert.assertNull(item55);
        org.junit.Assert.assertNotNull(itemArray61);
        org.junit.Assert.assertNotNull(wildcardClass70);
    }

    @Test
    public void test368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test368");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (byte) 100);
        fPHeapMax1.imprime();
        ds.Item item3 = fPHeapMax1.max();
        ds.FPHeapMax fPHeapMax6 = new ds.FPHeapMax((int) (byte) 1);
        ds.Item item7 = null;
        ds.Item[] itemArray8 = new ds.Item[] { item7 };
        fPHeapMax6.copia(itemArray8);
        ds.Item item10 = fPHeapMax6.max();
        fPHeapMax6.constroi();
        fPHeapMax6.constroi();
        ds.Item item13 = fPHeapMax6.max();
        fPHeapMax6.constroi();
        fPHeapMax6.imprime();
        ds.Item item16 = fPHeapMax6.max();
        ds.Item item17 = fPHeapMax6.max();
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMax1.aumentaChave(1, (java.lang.Object) fPHeapMax6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(item3);
        org.junit.Assert.assertNotNull(itemArray8);
        org.junit.Assert.assertNull(item10);
        org.junit.Assert.assertNull(item13);
        org.junit.Assert.assertNull(item16);
        org.junit.Assert.assertNull(item17);
    }

    @Test
    public void test369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test369");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (byte) 1);
        ds.Item item2 = null;
        ds.Item[] itemArray3 = new ds.Item[] { item2 };
        fPHeapMax1.copia(itemArray3);
        fPHeapMax1.constroi();
        ds.FPHeapMax fPHeapMax7 = new ds.FPHeapMax((int) (byte) 1);
        ds.Item item8 = null;
        ds.Item[] itemArray9 = new ds.Item[] { item8 };
        fPHeapMax7.copia(itemArray9);
        ds.Item item11 = fPHeapMax7.max();
        fPHeapMax7.constroi();
        fPHeapMax7.constroi();
        ds.Item item14 = fPHeapMax7.max();
        fPHeapMax7.constroi();
        fPHeapMax7.constroi();
        ds.FPHeapMax fPHeapMax18 = new ds.FPHeapMax((int) (byte) 1);
        ds.FPHeapMax fPHeapMax20 = new ds.FPHeapMax((int) (byte) 1);
        ds.Item item21 = null;
        ds.Item[] itemArray22 = new ds.Item[] { item21 };
        fPHeapMax20.copia(itemArray22);
        fPHeapMax18.copia(itemArray22);
        fPHeapMax18.imprime();
        ds.FPHeapMax fPHeapMax27 = new ds.FPHeapMax((int) (byte) 1);
        ds.Item item28 = null;
        ds.Item[] itemArray29 = new ds.Item[] { item28 };
        fPHeapMax27.copia(itemArray29);
        ds.Item item31 = fPHeapMax27.max();
        ds.FPHeapMax fPHeapMax33 = new ds.FPHeapMax((int) (byte) 1);
        ds.FPHeapMax fPHeapMax35 = new ds.FPHeapMax((int) (byte) 1);
        ds.Item item36 = null;
        ds.Item[] itemArray37 = new ds.Item[] { item36 };
        fPHeapMax35.copia(itemArray37);
        fPHeapMax33.copia(itemArray37);
        fPHeapMax27.copia(itemArray37);
        fPHeapMax18.copia(itemArray37);
        fPHeapMax7.copia(itemArray37);
        ds.Item item43 = fPHeapMax7.max();
        ds.FPHeapMax fPHeapMax45 = new ds.FPHeapMax((int) (short) 1);
        fPHeapMax45.imprime();
        ds.FPHeapMax fPHeapMax48 = new ds.FPHeapMax((int) (short) 1);
        ds.FPHeapMax fPHeapMax50 = new ds.FPHeapMax(0);
        ds.FPHeapMax fPHeapMax52 = new ds.FPHeapMax((int) (byte) 1);
        ds.FPHeapMax fPHeapMax54 = new ds.FPHeapMax((int) (byte) 1);
        ds.Item item55 = null;
        ds.Item[] itemArray56 = new ds.Item[] { item55 };
        fPHeapMax54.copia(itemArray56);
        fPHeapMax52.copia(itemArray56);
        fPHeapMax50.copia(itemArray56);
        fPHeapMax48.copia(itemArray56);
        fPHeapMax45.copia(itemArray56);
        fPHeapMax7.copia(itemArray56);
        fPHeapMax1.copia(itemArray56);
        java.lang.Class<?> wildcardClass64 = itemArray56.getClass();
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertNotNull(itemArray9);
        org.junit.Assert.assertNull(item11);
        org.junit.Assert.assertNull(item14);
        org.junit.Assert.assertNotNull(itemArray22);
        org.junit.Assert.assertNotNull(itemArray29);
        org.junit.Assert.assertNull(item31);
        org.junit.Assert.assertNotNull(itemArray37);
        org.junit.Assert.assertNull(item43);
        org.junit.Assert.assertNotNull(itemArray56);
        org.junit.Assert.assertNotNull(wildcardClass64);
    }

    @Test
    public void test370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test370");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (byte) 1);
        ds.Item item2 = null;
        ds.Item[] itemArray3 = new ds.Item[] { item2 };
        fPHeapMax1.copia(itemArray3);
        ds.Item item5 = fPHeapMax1.max();
        fPHeapMax1.constroi();
        fPHeapMax1.constroi();
        ds.Item item8 = fPHeapMax1.max();
        fPHeapMax1.constroi();
        fPHeapMax1.refaz(0, (int) (short) -1);
        fPHeapMax1.imprime();
        fPHeapMax1.imprime();
        fPHeapMax1.imprime();
        ds.Item item16 = fPHeapMax1.max();
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertNull(item5);
        org.junit.Assert.assertNull(item8);
        org.junit.Assert.assertNull(item16);
    }

    @Test
    public void test371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test371");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (byte) 1);
        ds.Item item2 = null;
        ds.Item[] itemArray3 = new ds.Item[] { item2 };
        fPHeapMax1.copia(itemArray3);
        ds.Item item5 = fPHeapMax1.max();
        fPHeapMax1.constroi();
        fPHeapMax1.constroi();
        ds.Item item8 = fPHeapMax1.max();
        fPHeapMax1.constroi();
        fPHeapMax1.constroi();
        fPHeapMax1.imprime();
        // The following exception was thrown during execution in test generation
        try {
            ds.Item item12 = fPHeapMax1.retiraMax();
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: heap vazio");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertNull(item5);
        org.junit.Assert.assertNull(item8);
    }

    @Test
    public void test372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test372");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) '4');
        fPHeapMax1.constroi();
    }

    @Test
    public void test373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test373");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (byte) 1);
        ds.Item item2 = null;
        ds.Item[] itemArray3 = new ds.Item[] { item2 };
        fPHeapMax1.copia(itemArray3);
        ds.Item item5 = fPHeapMax1.max();
        fPHeapMax1.constroi();
        fPHeapMax1.constroi();
        ds.Item item8 = fPHeapMax1.max();
        fPHeapMax1.constroi();
        ds.Item item10 = fPHeapMax1.max();
        ds.FPHeapMax fPHeapMax12 = new ds.FPHeapMax((int) (byte) 1);
        ds.Item item13 = null;
        ds.Item[] itemArray14 = new ds.Item[] { item13 };
        fPHeapMax12.copia(itemArray14);
        ds.Item item16 = fPHeapMax12.max();
        ds.FPHeapMax fPHeapMax18 = new ds.FPHeapMax((int) (byte) 1);
        ds.FPHeapMax fPHeapMax20 = new ds.FPHeapMax((int) (byte) 1);
        ds.Item item21 = null;
        ds.Item[] itemArray22 = new ds.Item[] { item21 };
        fPHeapMax20.copia(itemArray22);
        fPHeapMax18.copia(itemArray22);
        fPHeapMax12.copia(itemArray22);
        fPHeapMax1.copia(itemArray22);
        java.lang.Class<?> wildcardClass27 = fPHeapMax1.getClass();
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertNull(item5);
        org.junit.Assert.assertNull(item8);
        org.junit.Assert.assertNull(item10);
        org.junit.Assert.assertNotNull(itemArray14);
        org.junit.Assert.assertNull(item16);
        org.junit.Assert.assertNotNull(itemArray22);
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test374");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (byte) 1);
        ds.Item item2 = null;
        ds.Item[] itemArray3 = new ds.Item[] { item2 };
        fPHeapMax1.copia(itemArray3);
        ds.Item item5 = fPHeapMax1.max();
        fPHeapMax1.constroi();
        fPHeapMax1.constroi();
        ds.Item item8 = fPHeapMax1.max();
        fPHeapMax1.constroi();
        ds.Item item10 = fPHeapMax1.max();
        ds.Item item11 = fPHeapMax1.max();
        fPHeapMax1.imprime();
        ds.Item item13 = fPHeapMax1.max();
        fPHeapMax1.imprime();
        fPHeapMax1.imprime();
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertNull(item5);
        org.junit.Assert.assertNull(item8);
        org.junit.Assert.assertNull(item10);
        org.junit.Assert.assertNull(item11);
        org.junit.Assert.assertNull(item13);
    }

    @Test
    public void test375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test375");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (byte) 1);
        ds.Item item2 = null;
        ds.Item[] itemArray3 = new ds.Item[] { item2 };
        fPHeapMax1.copia(itemArray3);
        ds.Item item5 = fPHeapMax1.max();
        fPHeapMax1.constroi();
        fPHeapMax1.constroi();
        ds.Item item8 = fPHeapMax1.max();
        fPHeapMax1.constroi();
        ds.Item item10 = fPHeapMax1.max();
        fPHeapMax1.constroi();
        fPHeapMax1.refaz((int) (byte) 1, (int) (byte) -1);
        ds.FPHeapMax fPHeapMax16 = new ds.FPHeapMax((int) (byte) 1);
        ds.Item item17 = null;
        ds.Item[] itemArray18 = new ds.Item[] { item17 };
        fPHeapMax16.copia(itemArray18);
        ds.Item item20 = fPHeapMax16.max();
        fPHeapMax16.constroi();
        fPHeapMax16.constroi();
        ds.Item item23 = fPHeapMax16.max();
        fPHeapMax16.constroi();
        ds.Item item25 = fPHeapMax16.max();
        fPHeapMax16.constroi();
        fPHeapMax16.imprime();
        ds.Item item28 = null;
        ds.Item[] itemArray29 = new ds.Item[] { item28 };
        fPHeapMax16.copia(itemArray29);
        fPHeapMax1.copia(itemArray29);
        ds.FPHeapMax fPHeapMax33 = new ds.FPHeapMax((int) ' ');
        fPHeapMax33.refaz((int) (short) 1, (int) (short) 1);
        ds.Item item37 = fPHeapMax33.max();
        ds.FPHeapMax fPHeapMax39 = new ds.FPHeapMax((int) (byte) 1);
        ds.Item item40 = null;
        ds.Item[] itemArray41 = new ds.Item[] { item40 };
        fPHeapMax39.copia(itemArray41);
        fPHeapMax33.copia(itemArray41);
        fPHeapMax1.copia(itemArray41);
        fPHeapMax1.constroi();
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertNull(item5);
        org.junit.Assert.assertNull(item8);
        org.junit.Assert.assertNull(item10);
        org.junit.Assert.assertNotNull(itemArray18);
        org.junit.Assert.assertNull(item20);
        org.junit.Assert.assertNull(item23);
        org.junit.Assert.assertNull(item25);
        org.junit.Assert.assertNotNull(itemArray29);
        org.junit.Assert.assertNull(item37);
        org.junit.Assert.assertNotNull(itemArray41);
    }

    @Test
    public void test376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test376");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) ' ');
        fPHeapMax1.refaz((int) (short) 1, (int) (short) 1);
        fPHeapMax1.imprime();
        fPHeapMax1.constroi();
    }

    @Test
    public void test377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test377");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) ' ');
        fPHeapMax1.refaz((int) (short) 1, (int) (short) 1);
        ds.Item item5 = fPHeapMax1.max();
        ds.FPHeapMax fPHeapMax7 = new ds.FPHeapMax((int) (byte) 1);
        ds.Item item8 = null;
        ds.Item[] itemArray9 = new ds.Item[] { item8 };
        fPHeapMax7.copia(itemArray9);
        fPHeapMax1.copia(itemArray9);
        fPHeapMax1.constroi();
        ds.Item item13 = fPHeapMax1.max();
        org.junit.Assert.assertNull(item5);
        org.junit.Assert.assertNotNull(itemArray9);
        org.junit.Assert.assertNull(item13);
    }

    @Test
    public void test378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test378");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (byte) 1);
        ds.Item item2 = null;
        ds.Item[] itemArray3 = new ds.Item[] { item2 };
        fPHeapMax1.copia(itemArray3);
        ds.Item item5 = fPHeapMax1.max();
        fPHeapMax1.imprime();
        ds.FPHeapMax fPHeapMax8 = new ds.FPHeapMax((int) ' ');
        fPHeapMax8.refaz((int) (short) 1, (int) (short) 1);
        ds.Item item12 = fPHeapMax8.max();
        ds.FPHeapMax fPHeapMax14 = new ds.FPHeapMax((int) (byte) 1);
        ds.Item item15 = null;
        ds.Item[] itemArray16 = new ds.Item[] { item15 };
        fPHeapMax14.copia(itemArray16);
        fPHeapMax8.copia(itemArray16);
        fPHeapMax8.constroi();
        ds.FPHeapMax fPHeapMax21 = new ds.FPHeapMax((int) (byte) 1);
        ds.Item item22 = null;
        ds.Item[] itemArray23 = new ds.Item[] { item22 };
        fPHeapMax21.copia(itemArray23);
        fPHeapMax8.copia(itemArray23);
        fPHeapMax1.copia(itemArray23);
        java.lang.Class<?> wildcardClass27 = fPHeapMax1.getClass();
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertNull(item5);
        org.junit.Assert.assertNull(item12);
        org.junit.Assert.assertNotNull(itemArray16);
        org.junit.Assert.assertNotNull(itemArray23);
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test379");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (byte) 100);
        fPHeapMax1.constroi();
        fPHeapMax1.imprime();
        java.lang.Class<?> wildcardClass4 = fPHeapMax1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test380");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (short) 10);
        ds.FPHeapMax fPHeapMax3 = new ds.FPHeapMax((int) (byte) 1);
        ds.Item item4 = null;
        ds.Item[] itemArray5 = new ds.Item[] { item4 };
        fPHeapMax3.copia(itemArray5);
        ds.Item item7 = fPHeapMax3.max();
        fPHeapMax3.constroi();
        fPHeapMax3.constroi();
        ds.Item item10 = fPHeapMax3.max();
        fPHeapMax3.constroi();
        ds.Item item12 = fPHeapMax3.max();
        fPHeapMax3.constroi();
        fPHeapMax3.imprime();
        ds.FPHeapMax fPHeapMax16 = new ds.FPHeapMax((int) (byte) 1);
        ds.Item item17 = null;
        ds.Item[] itemArray18 = new ds.Item[] { item17 };
        fPHeapMax16.copia(itemArray18);
        fPHeapMax3.copia(itemArray18);
        fPHeapMax1.copia(itemArray18);
        ds.Item item22 = fPHeapMax1.max();
        ds.FPHeapMax fPHeapMax24 = new ds.FPHeapMax((int) (byte) 1);
        ds.Item item25 = null;
        ds.Item[] itemArray26 = new ds.Item[] { item25 };
        fPHeapMax24.copia(itemArray26);
        ds.Item item28 = fPHeapMax24.max();
        fPHeapMax24.constroi();
        fPHeapMax24.constroi();
        ds.Item item31 = fPHeapMax24.max();
        fPHeapMax24.constroi();
        ds.Item item33 = fPHeapMax24.max();
        fPHeapMax24.constroi();
        fPHeapMax24.imprime();
        ds.FPHeapMax fPHeapMax37 = new ds.FPHeapMax((int) (byte) 1);
        ds.Item item38 = null;
        ds.Item[] itemArray39 = new ds.Item[] { item38 };
        fPHeapMax37.copia(itemArray39);
        fPHeapMax24.copia(itemArray39);
        fPHeapMax24.constroi();
        fPHeapMax24.imprime();
        ds.FPHeapMax fPHeapMax45 = new ds.FPHeapMax(0);
        ds.FPHeapMax fPHeapMax47 = new ds.FPHeapMax((int) (byte) 1);
        ds.FPHeapMax fPHeapMax49 = new ds.FPHeapMax((int) (byte) 1);
        ds.Item item50 = null;
        ds.Item[] itemArray51 = new ds.Item[] { item50 };
        fPHeapMax49.copia(itemArray51);
        fPHeapMax47.copia(itemArray51);
        fPHeapMax45.copia(itemArray51);
        fPHeapMax24.copia(itemArray51);
        fPHeapMax1.copia(itemArray51);
        ds.Item item57 = fPHeapMax1.max();
        java.lang.Object obj59 = null;
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMax1.aumentaChave((int) (byte) 1, obj59);
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: chaveNova com valor null");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray5);
        org.junit.Assert.assertNull(item7);
        org.junit.Assert.assertNull(item10);
        org.junit.Assert.assertNull(item12);
        org.junit.Assert.assertNotNull(itemArray18);
        org.junit.Assert.assertNull(item22);
        org.junit.Assert.assertNotNull(itemArray26);
        org.junit.Assert.assertNull(item28);
        org.junit.Assert.assertNull(item31);
        org.junit.Assert.assertNull(item33);
        org.junit.Assert.assertNotNull(itemArray39);
        org.junit.Assert.assertNotNull(itemArray51);
        org.junit.Assert.assertNull(item57);
    }

    @Test
    public void test381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test381");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax(100);
        fPHeapMax1.refaz((int) (byte) 100, 100);
        ds.Item item5 = fPHeapMax1.max();
        org.junit.Assert.assertNull(item5);
    }

    @Test
    public void test382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test382");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (byte) 100);
        java.lang.Class<?> wildcardClass2 = fPHeapMax1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test383");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) ' ');
        fPHeapMax1.imprime();
        fPHeapMax1.constroi();
        ds.FPHeapMax fPHeapMax6 = new ds.FPHeapMax((int) (byte) 1);
        ds.Item item7 = null;
        ds.Item[] itemArray8 = new ds.Item[] { item7 };
        fPHeapMax6.copia(itemArray8);
        ds.Item item10 = fPHeapMax6.max();
        ds.Item item11 = fPHeapMax6.max();
        fPHeapMax6.constroi();
        ds.FPHeapMax fPHeapMax14 = new ds.FPHeapMax((int) (byte) 1);
        ds.Item item15 = null;
        ds.Item[] itemArray16 = new ds.Item[] { item15 };
        fPHeapMax14.copia(itemArray16);
        ds.Item item18 = fPHeapMax14.max();
        fPHeapMax14.constroi();
        fPHeapMax14.constroi();
        ds.Item item21 = fPHeapMax14.max();
        fPHeapMax14.constroi();
        ds.Item item23 = fPHeapMax14.max();
        fPHeapMax14.imprime();
        ds.FPHeapMax fPHeapMax26 = new ds.FPHeapMax((int) (byte) 1);
        ds.Item item27 = null;
        ds.Item[] itemArray28 = new ds.Item[] { item27 };
        fPHeapMax26.copia(itemArray28);
        ds.Item item30 = fPHeapMax26.max();
        ds.FPHeapMax fPHeapMax32 = new ds.FPHeapMax((int) (byte) 1);
        ds.FPHeapMax fPHeapMax34 = new ds.FPHeapMax((int) (byte) 1);
        ds.Item item35 = null;
        ds.Item[] itemArray36 = new ds.Item[] { item35 };
        fPHeapMax34.copia(itemArray36);
        fPHeapMax32.copia(itemArray36);
        fPHeapMax26.copia(itemArray36);
        fPHeapMax14.copia(itemArray36);
        fPHeapMax6.copia(itemArray36);
        java.lang.Class<?> wildcardClass42 = itemArray36.getClass();
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMax1.aumentaChave((int) 'a', (java.lang.Object) itemArray36);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 97");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray8);
        org.junit.Assert.assertNull(item10);
        org.junit.Assert.assertNull(item11);
        org.junit.Assert.assertNotNull(itemArray16);
        org.junit.Assert.assertNull(item18);
        org.junit.Assert.assertNull(item21);
        org.junit.Assert.assertNull(item23);
        org.junit.Assert.assertNotNull(itemArray28);
        org.junit.Assert.assertNull(item30);
        org.junit.Assert.assertNotNull(itemArray36);
        org.junit.Assert.assertNotNull(wildcardClass42);
    }

    @Test
    public void test384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test384");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax(0);
        fPHeapMax1.imprime();
        ds.FPHeapMax fPHeapMax4 = new ds.FPHeapMax((int) (short) 1);
        fPHeapMax4.imprime();
        fPHeapMax4.constroi();
        ds.FPHeapMax fPHeapMax8 = new ds.FPHeapMax((int) ' ');
        fPHeapMax8.imprime();
        ds.FPHeapMax fPHeapMax11 = new ds.FPHeapMax((int) (byte) 1);
        ds.Item item12 = null;
        ds.Item[] itemArray13 = new ds.Item[] { item12 };
        fPHeapMax11.copia(itemArray13);
        ds.Item item15 = fPHeapMax11.max();
        fPHeapMax11.constroi();
        fPHeapMax11.constroi();
        ds.Item item18 = fPHeapMax11.max();
        fPHeapMax11.constroi();
        ds.Item item20 = fPHeapMax11.max();
        fPHeapMax11.imprime();
        ds.FPHeapMax fPHeapMax23 = new ds.FPHeapMax((int) (byte) 1);
        ds.Item item24 = null;
        ds.Item[] itemArray25 = new ds.Item[] { item24 };
        fPHeapMax23.copia(itemArray25);
        ds.Item item27 = fPHeapMax23.max();
        ds.FPHeapMax fPHeapMax29 = new ds.FPHeapMax((int) (byte) 1);
        ds.FPHeapMax fPHeapMax31 = new ds.FPHeapMax((int) (byte) 1);
        ds.Item item32 = null;
        ds.Item[] itemArray33 = new ds.Item[] { item32 };
        fPHeapMax31.copia(itemArray33);
        fPHeapMax29.copia(itemArray33);
        fPHeapMax23.copia(itemArray33);
        fPHeapMax11.copia(itemArray33);
        fPHeapMax8.copia(itemArray33);
        ds.FPHeapMax fPHeapMax40 = new ds.FPHeapMax(10);
        ds.FPHeapMax fPHeapMax42 = new ds.FPHeapMax((int) ' ');
        fPHeapMax42.imprime();
        ds.FPHeapMax fPHeapMax45 = new ds.FPHeapMax((int) (byte) 1);
        ds.FPHeapMax fPHeapMax47 = new ds.FPHeapMax((int) (byte) 1);
        ds.Item item48 = null;
        ds.Item[] itemArray49 = new ds.Item[] { item48 };
        fPHeapMax47.copia(itemArray49);
        fPHeapMax45.copia(itemArray49);
        fPHeapMax45.imprime();
        ds.FPHeapMax fPHeapMax54 = new ds.FPHeapMax((int) (byte) 1);
        ds.Item item55 = null;
        ds.Item[] itemArray56 = new ds.Item[] { item55 };
        fPHeapMax54.copia(itemArray56);
        ds.Item item58 = fPHeapMax54.max();
        ds.FPHeapMax fPHeapMax60 = new ds.FPHeapMax((int) (byte) 1);
        ds.FPHeapMax fPHeapMax62 = new ds.FPHeapMax((int) (byte) 1);
        ds.Item item63 = null;
        ds.Item[] itemArray64 = new ds.Item[] { item63 };
        fPHeapMax62.copia(itemArray64);
        fPHeapMax60.copia(itemArray64);
        fPHeapMax54.copia(itemArray64);
        fPHeapMax45.copia(itemArray64);
        fPHeapMax42.copia(itemArray64);
        fPHeapMax40.copia(itemArray64);
        fPHeapMax8.copia(itemArray64);
        fPHeapMax4.copia(itemArray64);
        fPHeapMax1.copia(itemArray64);
        fPHeapMax1.constroi();
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMax1.refaz(10, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 10");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray13);
        org.junit.Assert.assertNull(item15);
        org.junit.Assert.assertNull(item18);
        org.junit.Assert.assertNull(item20);
        org.junit.Assert.assertNotNull(itemArray25);
        org.junit.Assert.assertNull(item27);
        org.junit.Assert.assertNotNull(itemArray33);
        org.junit.Assert.assertNotNull(itemArray49);
        org.junit.Assert.assertNotNull(itemArray56);
        org.junit.Assert.assertNull(item58);
        org.junit.Assert.assertNotNull(itemArray64);
    }

    @Test
    public void test385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test385");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (short) 10);
        ds.FPHeapMax fPHeapMax3 = new ds.FPHeapMax((int) (byte) 1);
        ds.Item item4 = null;
        ds.Item[] itemArray5 = new ds.Item[] { item4 };
        fPHeapMax3.copia(itemArray5);
        ds.Item item7 = fPHeapMax3.max();
        fPHeapMax3.constroi();
        fPHeapMax3.constroi();
        ds.Item item10 = fPHeapMax3.max();
        fPHeapMax3.constroi();
        ds.Item item12 = fPHeapMax3.max();
        fPHeapMax3.constroi();
        fPHeapMax3.imprime();
        ds.FPHeapMax fPHeapMax16 = new ds.FPHeapMax((int) (byte) 1);
        ds.Item item17 = null;
        ds.Item[] itemArray18 = new ds.Item[] { item17 };
        fPHeapMax16.copia(itemArray18);
        fPHeapMax3.copia(itemArray18);
        fPHeapMax1.copia(itemArray18);
        ds.Item item22 = fPHeapMax1.max();
        ds.FPHeapMax fPHeapMax24 = new ds.FPHeapMax((int) (short) 10);
        ds.FPHeapMax fPHeapMax26 = new ds.FPHeapMax((int) (byte) 1);
        ds.Item item27 = null;
        ds.Item[] itemArray28 = new ds.Item[] { item27 };
        fPHeapMax26.copia(itemArray28);
        ds.Item item30 = fPHeapMax26.max();
        fPHeapMax26.constroi();
        fPHeapMax26.constroi();
        ds.Item item33 = fPHeapMax26.max();
        fPHeapMax26.constroi();
        ds.Item item35 = fPHeapMax26.max();
        fPHeapMax26.constroi();
        fPHeapMax26.imprime();
        ds.FPHeapMax fPHeapMax39 = new ds.FPHeapMax((int) (byte) 1);
        ds.Item item40 = null;
        ds.Item[] itemArray41 = new ds.Item[] { item40 };
        fPHeapMax39.copia(itemArray41);
        fPHeapMax26.copia(itemArray41);
        fPHeapMax24.copia(itemArray41);
        ds.Item item45 = fPHeapMax24.max();
        ds.FPHeapMax fPHeapMax47 = new ds.FPHeapMax((int) (byte) 1);
        ds.Item item48 = null;
        ds.Item[] itemArray49 = new ds.Item[] { item48 };
        fPHeapMax47.copia(itemArray49);
        ds.Item item51 = fPHeapMax47.max();
        fPHeapMax47.constroi();
        fPHeapMax47.constroi();
        ds.Item item54 = fPHeapMax47.max();
        fPHeapMax47.constroi();
        ds.Item item56 = fPHeapMax47.max();
        fPHeapMax47.constroi();
        fPHeapMax47.imprime();
        ds.FPHeapMax fPHeapMax60 = new ds.FPHeapMax((int) (byte) 1);
        ds.Item item61 = null;
        ds.Item[] itemArray62 = new ds.Item[] { item61 };
        fPHeapMax60.copia(itemArray62);
        fPHeapMax47.copia(itemArray62);
        fPHeapMax47.constroi();
        fPHeapMax47.imprime();
        ds.FPHeapMax fPHeapMax68 = new ds.FPHeapMax(0);
        ds.FPHeapMax fPHeapMax70 = new ds.FPHeapMax((int) (byte) 1);
        ds.FPHeapMax fPHeapMax72 = new ds.FPHeapMax((int) (byte) 1);
        ds.Item item73 = null;
        ds.Item[] itemArray74 = new ds.Item[] { item73 };
        fPHeapMax72.copia(itemArray74);
        fPHeapMax70.copia(itemArray74);
        fPHeapMax68.copia(itemArray74);
        fPHeapMax47.copia(itemArray74);
        fPHeapMax24.copia(itemArray74);
        fPHeapMax1.copia(itemArray74);
        ds.FPHeapMax fPHeapMax82 = new ds.FPHeapMax((int) (byte) 1);
        ds.Item item83 = null;
        ds.Item[] itemArray84 = new ds.Item[] { item83 };
        fPHeapMax82.copia(itemArray84);
        ds.Item item86 = fPHeapMax82.max();
        fPHeapMax82.constroi();
        fPHeapMax82.constroi();
        ds.Item item89 = fPHeapMax82.max();
        fPHeapMax82.constroi();
        ds.Item item91 = fPHeapMax82.max();
        fPHeapMax82.constroi();
        fPHeapMax82.imprime();
        ds.Item item94 = null;
        ds.Item[] itemArray95 = new ds.Item[] { item94 };
        fPHeapMax82.copia(itemArray95);
        fPHeapMax1.copia(itemArray95);
        org.junit.Assert.assertNotNull(itemArray5);
        org.junit.Assert.assertNull(item7);
        org.junit.Assert.assertNull(item10);
        org.junit.Assert.assertNull(item12);
        org.junit.Assert.assertNotNull(itemArray18);
        org.junit.Assert.assertNull(item22);
        org.junit.Assert.assertNotNull(itemArray28);
        org.junit.Assert.assertNull(item30);
        org.junit.Assert.assertNull(item33);
        org.junit.Assert.assertNull(item35);
        org.junit.Assert.assertNotNull(itemArray41);
        org.junit.Assert.assertNull(item45);
        org.junit.Assert.assertNotNull(itemArray49);
        org.junit.Assert.assertNull(item51);
        org.junit.Assert.assertNull(item54);
        org.junit.Assert.assertNull(item56);
        org.junit.Assert.assertNotNull(itemArray62);
        org.junit.Assert.assertNotNull(itemArray74);
        org.junit.Assert.assertNotNull(itemArray84);
        org.junit.Assert.assertNull(item86);
        org.junit.Assert.assertNull(item89);
        org.junit.Assert.assertNull(item91);
        org.junit.Assert.assertNotNull(itemArray95);
    }

    @Test
    public void test386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test386");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (byte) 1);
        ds.Item item2 = null;
        ds.Item[] itemArray3 = new ds.Item[] { item2 };
        fPHeapMax1.copia(itemArray3);
        ds.Item item5 = fPHeapMax1.max();
        fPHeapMax1.constroi();
        fPHeapMax1.constroi();
        ds.Item item8 = fPHeapMax1.max();
        fPHeapMax1.constroi();
        ds.Item item10 = fPHeapMax1.max();
        fPHeapMax1.constroi();
        fPHeapMax1.imprime();
        ds.FPHeapMax fPHeapMax14 = new ds.FPHeapMax((int) (byte) 1);
        ds.Item item15 = null;
        ds.Item[] itemArray16 = new ds.Item[] { item15 };
        fPHeapMax14.copia(itemArray16);
        fPHeapMax1.copia(itemArray16);
        fPHeapMax1.refaz(1, (int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMax1.refaz((int) (short) -1, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertNull(item5);
        org.junit.Assert.assertNull(item8);
        org.junit.Assert.assertNull(item10);
        org.junit.Assert.assertNotNull(itemArray16);
    }

    @Test
    public void test387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test387");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax(0);
        fPHeapMax1.constroi();
        ds.FPHeapMax fPHeapMax4 = new ds.FPHeapMax((int) (byte) 1);
        ds.Item item5 = null;
        ds.Item[] itemArray6 = new ds.Item[] { item5 };
        fPHeapMax4.copia(itemArray6);
        ds.Item item8 = fPHeapMax4.max();
        fPHeapMax4.constroi();
        fPHeapMax4.constroi();
        ds.Item item11 = fPHeapMax4.max();
        fPHeapMax4.constroi();
        fPHeapMax4.imprime();
        ds.Item item14 = fPHeapMax4.max();
        ds.Item item15 = fPHeapMax4.max();
        ds.FPHeapMax fPHeapMax17 = new ds.FPHeapMax((int) ' ');
        fPHeapMax17.imprime();
        ds.FPHeapMax fPHeapMax20 = new ds.FPHeapMax((int) (byte) 1);
        ds.FPHeapMax fPHeapMax22 = new ds.FPHeapMax((int) (byte) 1);
        ds.Item item23 = null;
        ds.Item[] itemArray24 = new ds.Item[] { item23 };
        fPHeapMax22.copia(itemArray24);
        fPHeapMax20.copia(itemArray24);
        fPHeapMax20.imprime();
        ds.FPHeapMax fPHeapMax29 = new ds.FPHeapMax((int) (byte) 1);
        ds.Item item30 = null;
        ds.Item[] itemArray31 = new ds.Item[] { item30 };
        fPHeapMax29.copia(itemArray31);
        ds.Item item33 = fPHeapMax29.max();
        ds.FPHeapMax fPHeapMax35 = new ds.FPHeapMax((int) (byte) 1);
        ds.FPHeapMax fPHeapMax37 = new ds.FPHeapMax((int) (byte) 1);
        ds.Item item38 = null;
        ds.Item[] itemArray39 = new ds.Item[] { item38 };
        fPHeapMax37.copia(itemArray39);
        fPHeapMax35.copia(itemArray39);
        fPHeapMax29.copia(itemArray39);
        fPHeapMax20.copia(itemArray39);
        fPHeapMax17.copia(itemArray39);
        fPHeapMax4.copia(itemArray39);
        fPHeapMax1.copia(itemArray39);
        ds.FPHeapMax fPHeapMax48 = new ds.FPHeapMax((int) (byte) 1);
        ds.Item item49 = null;
        ds.Item[] itemArray50 = new ds.Item[] { item49 };
        fPHeapMax48.copia(itemArray50);
        ds.Item item52 = fPHeapMax48.max();
        fPHeapMax48.constroi();
        fPHeapMax48.constroi();
        ds.Item item55 = fPHeapMax48.max();
        fPHeapMax48.constroi();
        ds.Item item57 = fPHeapMax48.max();
        fPHeapMax48.constroi();
        fPHeapMax48.imprime();
        ds.FPHeapMax fPHeapMax61 = new ds.FPHeapMax((int) (byte) 1);
        ds.Item item62 = null;
        ds.Item[] itemArray63 = new ds.Item[] { item62 };
        fPHeapMax61.copia(itemArray63);
        fPHeapMax48.copia(itemArray63);
        fPHeapMax1.copia(itemArray63);
        ds.FPHeapMax fPHeapMax68 = new ds.FPHeapMax((int) (byte) 1);
        ds.Item item69 = null;
        ds.Item[] itemArray70 = new ds.Item[] { item69 };
        fPHeapMax68.copia(itemArray70);
        fPHeapMax1.copia(itemArray70);
        java.lang.Class<?> wildcardClass73 = fPHeapMax1.getClass();
        org.junit.Assert.assertNotNull(itemArray6);
        org.junit.Assert.assertNull(item8);
        org.junit.Assert.assertNull(item11);
        org.junit.Assert.assertNull(item14);
        org.junit.Assert.assertNull(item15);
        org.junit.Assert.assertNotNull(itemArray24);
        org.junit.Assert.assertNotNull(itemArray31);
        org.junit.Assert.assertNull(item33);
        org.junit.Assert.assertNotNull(itemArray39);
        org.junit.Assert.assertNotNull(itemArray50);
        org.junit.Assert.assertNull(item52);
        org.junit.Assert.assertNull(item55);
        org.junit.Assert.assertNull(item57);
        org.junit.Assert.assertNotNull(itemArray63);
        org.junit.Assert.assertNotNull(itemArray70);
        org.junit.Assert.assertNotNull(wildcardClass73);
    }

    @Test
    public void test388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test388");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (byte) 1);
        ds.Item item2 = null;
        ds.Item[] itemArray3 = new ds.Item[] { item2 };
        fPHeapMax1.copia(itemArray3);
        ds.Item item5 = fPHeapMax1.max();
        fPHeapMax1.constroi();
        fPHeapMax1.constroi();
        ds.Item item8 = fPHeapMax1.max();
        fPHeapMax1.constroi();
        fPHeapMax1.imprime();
        ds.Item item11 = fPHeapMax1.max();
        ds.Item item12 = fPHeapMax1.max();
        fPHeapMax1.constroi();
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertNull(item5);
        org.junit.Assert.assertNull(item8);
        org.junit.Assert.assertNull(item11);
        org.junit.Assert.assertNull(item12);
    }

    @Test
    public void test389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test389");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (byte) 1);
        ds.Item item2 = null;
        ds.Item[] itemArray3 = new ds.Item[] { item2 };
        fPHeapMax1.copia(itemArray3);
        fPHeapMax1.constroi();
        ds.FPHeapMax fPHeapMax7 = new ds.FPHeapMax((int) (byte) 1);
        ds.Item item8 = null;
        ds.Item[] itemArray9 = new ds.Item[] { item8 };
        fPHeapMax7.copia(itemArray9);
        ds.Item item11 = fPHeapMax7.max();
        fPHeapMax7.constroi();
        fPHeapMax7.constroi();
        ds.Item item14 = fPHeapMax7.max();
        fPHeapMax7.constroi();
        fPHeapMax7.constroi();
        ds.FPHeapMax fPHeapMax18 = new ds.FPHeapMax((int) (byte) 1);
        ds.FPHeapMax fPHeapMax20 = new ds.FPHeapMax((int) (byte) 1);
        ds.Item item21 = null;
        ds.Item[] itemArray22 = new ds.Item[] { item21 };
        fPHeapMax20.copia(itemArray22);
        fPHeapMax18.copia(itemArray22);
        fPHeapMax18.imprime();
        ds.FPHeapMax fPHeapMax27 = new ds.FPHeapMax((int) (byte) 1);
        ds.Item item28 = null;
        ds.Item[] itemArray29 = new ds.Item[] { item28 };
        fPHeapMax27.copia(itemArray29);
        ds.Item item31 = fPHeapMax27.max();
        ds.FPHeapMax fPHeapMax33 = new ds.FPHeapMax((int) (byte) 1);
        ds.FPHeapMax fPHeapMax35 = new ds.FPHeapMax((int) (byte) 1);
        ds.Item item36 = null;
        ds.Item[] itemArray37 = new ds.Item[] { item36 };
        fPHeapMax35.copia(itemArray37);
        fPHeapMax33.copia(itemArray37);
        fPHeapMax27.copia(itemArray37);
        fPHeapMax18.copia(itemArray37);
        fPHeapMax7.copia(itemArray37);
        ds.Item item43 = fPHeapMax7.max();
        ds.FPHeapMax fPHeapMax45 = new ds.FPHeapMax((int) (short) 1);
        fPHeapMax45.imprime();
        ds.FPHeapMax fPHeapMax48 = new ds.FPHeapMax((int) (short) 1);
        ds.FPHeapMax fPHeapMax50 = new ds.FPHeapMax(0);
        ds.FPHeapMax fPHeapMax52 = new ds.FPHeapMax((int) (byte) 1);
        ds.FPHeapMax fPHeapMax54 = new ds.FPHeapMax((int) (byte) 1);
        ds.Item item55 = null;
        ds.Item[] itemArray56 = new ds.Item[] { item55 };
        fPHeapMax54.copia(itemArray56);
        fPHeapMax52.copia(itemArray56);
        fPHeapMax50.copia(itemArray56);
        fPHeapMax48.copia(itemArray56);
        fPHeapMax45.copia(itemArray56);
        fPHeapMax7.copia(itemArray56);
        fPHeapMax1.copia(itemArray56);
        ds.FPHeapMax fPHeapMax65 = new ds.FPHeapMax((int) (byte) 1);
        ds.Item item66 = null;
        ds.Item[] itemArray67 = new ds.Item[] { item66 };
        fPHeapMax65.copia(itemArray67);
        ds.Item item69 = fPHeapMax65.max();
        fPHeapMax65.constroi();
        fPHeapMax65.constroi();
        ds.Item item72 = fPHeapMax65.max();
        fPHeapMax65.constroi();
        ds.Item item74 = fPHeapMax65.max();
        fPHeapMax65.constroi();
        fPHeapMax65.refaz((int) (byte) 1, (int) (byte) -1);
        ds.FPHeapMax fPHeapMax80 = new ds.FPHeapMax((int) (byte) 1);
        ds.Item item81 = null;
        ds.Item[] itemArray82 = new ds.Item[] { item81 };
        fPHeapMax80.copia(itemArray82);
        ds.Item item84 = fPHeapMax80.max();
        ds.FPHeapMax fPHeapMax86 = new ds.FPHeapMax((int) (byte) 1);
        ds.FPHeapMax fPHeapMax88 = new ds.FPHeapMax((int) (byte) 1);
        ds.Item item89 = null;
        ds.Item[] itemArray90 = new ds.Item[] { item89 };
        fPHeapMax88.copia(itemArray90);
        fPHeapMax86.copia(itemArray90);
        fPHeapMax80.copia(itemArray90);
        fPHeapMax65.copia(itemArray90);
        fPHeapMax1.copia(itemArray90);
        ds.Item item96 = null;
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMax1.insere(item96);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertNotNull(itemArray9);
        org.junit.Assert.assertNull(item11);
        org.junit.Assert.assertNull(item14);
        org.junit.Assert.assertNotNull(itemArray22);
        org.junit.Assert.assertNotNull(itemArray29);
        org.junit.Assert.assertNull(item31);
        org.junit.Assert.assertNotNull(itemArray37);
        org.junit.Assert.assertNull(item43);
        org.junit.Assert.assertNotNull(itemArray56);
        org.junit.Assert.assertNotNull(itemArray67);
        org.junit.Assert.assertNull(item69);
        org.junit.Assert.assertNull(item72);
        org.junit.Assert.assertNull(item74);
        org.junit.Assert.assertNotNull(itemArray82);
        org.junit.Assert.assertNull(item84);
        org.junit.Assert.assertNotNull(itemArray90);
    }

    @Test
    public void test390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test390");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (byte) 1);
        ds.Item item2 = null;
        ds.Item[] itemArray3 = new ds.Item[] { item2 };
        fPHeapMax1.copia(itemArray3);
        ds.Item item5 = fPHeapMax1.max();
        fPHeapMax1.constroi();
        fPHeapMax1.constroi();
        ds.Item item8 = fPHeapMax1.max();
        fPHeapMax1.imprime();
        ds.Item item10 = fPHeapMax1.max();
        fPHeapMax1.imprime();
        fPHeapMax1.constroi();
        ds.Item item13 = fPHeapMax1.max();
        ds.FPHeapMax fPHeapMax16 = new ds.FPHeapMax((int) (byte) 100);
        fPHeapMax16.constroi();
        fPHeapMax16.imprime();
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMax1.aumentaChave(1, (java.lang.Object) fPHeapMax16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertNull(item5);
        org.junit.Assert.assertNull(item8);
        org.junit.Assert.assertNull(item10);
        org.junit.Assert.assertNull(item13);
    }

    @Test
    public void test391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test391");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (byte) 1);
        fPHeapMax1.constroi();
        ds.Item item3 = fPHeapMax1.max();
        org.junit.Assert.assertNull(item3);
    }

    @Test
    public void test392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test392");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (byte) 1);
        ds.Item item2 = null;
        ds.Item[] itemArray3 = new ds.Item[] { item2 };
        fPHeapMax1.copia(itemArray3);
        ds.Item item5 = fPHeapMax1.max();
        fPHeapMax1.constroi();
        fPHeapMax1.constroi();
        ds.Item item8 = fPHeapMax1.max();
        fPHeapMax1.constroi();
        ds.Item item10 = fPHeapMax1.max();
        ds.FPHeapMax fPHeapMax12 = new ds.FPHeapMax((int) (byte) 1);
        ds.Item item13 = null;
        ds.Item[] itemArray14 = new ds.Item[] { item13 };
        fPHeapMax12.copia(itemArray14);
        ds.Item item16 = fPHeapMax12.max();
        ds.FPHeapMax fPHeapMax18 = new ds.FPHeapMax((int) (byte) 1);
        ds.FPHeapMax fPHeapMax20 = new ds.FPHeapMax((int) (byte) 1);
        ds.Item item21 = null;
        ds.Item[] itemArray22 = new ds.Item[] { item21 };
        fPHeapMax20.copia(itemArray22);
        fPHeapMax18.copia(itemArray22);
        fPHeapMax12.copia(itemArray22);
        fPHeapMax1.copia(itemArray22);
        ds.Item item27 = fPHeapMax1.max();
        fPHeapMax1.constroi();
        fPHeapMax1.constroi();
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertNull(item5);
        org.junit.Assert.assertNull(item8);
        org.junit.Assert.assertNull(item10);
        org.junit.Assert.assertNotNull(itemArray14);
        org.junit.Assert.assertNull(item16);
        org.junit.Assert.assertNotNull(itemArray22);
        org.junit.Assert.assertNull(item27);
    }

    @Test
    public void test393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test393");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (byte) 1);
        ds.FPHeapMax fPHeapMax3 = new ds.FPHeapMax((int) (byte) 1);
        ds.Item item4 = null;
        ds.Item[] itemArray5 = new ds.Item[] { item4 };
        fPHeapMax3.copia(itemArray5);
        fPHeapMax1.copia(itemArray5);
        fPHeapMax1.constroi();
        ds.FPHeapMax fPHeapMax11 = new ds.FPHeapMax((int) (byte) 1);
        ds.Item item12 = null;
        ds.Item[] itemArray13 = new ds.Item[] { item12 };
        fPHeapMax11.copia(itemArray13);
        ds.Item item15 = fPHeapMax11.max();
        fPHeapMax11.imprime();
        ds.FPHeapMax fPHeapMax18 = new ds.FPHeapMax((int) ' ');
        fPHeapMax18.refaz((int) (short) 1, (int) (short) 1);
        ds.Item item22 = fPHeapMax18.max();
        ds.FPHeapMax fPHeapMax24 = new ds.FPHeapMax((int) (byte) 1);
        ds.Item item25 = null;
        ds.Item[] itemArray26 = new ds.Item[] { item25 };
        fPHeapMax24.copia(itemArray26);
        fPHeapMax18.copia(itemArray26);
        fPHeapMax18.constroi();
        ds.FPHeapMax fPHeapMax31 = new ds.FPHeapMax((int) (byte) 1);
        ds.Item item32 = null;
        ds.Item[] itemArray33 = new ds.Item[] { item32 };
        fPHeapMax31.copia(itemArray33);
        fPHeapMax18.copia(itemArray33);
        fPHeapMax11.copia(itemArray33);
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMax1.aumentaChave((int) (byte) -1, (java.lang.Object) itemArray33);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray5);
        org.junit.Assert.assertNotNull(itemArray13);
        org.junit.Assert.assertNull(item15);
        org.junit.Assert.assertNull(item22);
        org.junit.Assert.assertNotNull(itemArray26);
        org.junit.Assert.assertNotNull(itemArray33);
    }

    @Test
    public void test394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test394");
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
    public void test395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test395");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (short) 0);
        fPHeapMax1.imprime();
        fPHeapMax1.constroi();
    }

    @Test
    public void test396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test396");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (byte) 10);
        fPHeapMax1.constroi();
        fPHeapMax1.refaz((int) (short) 10, 0);
        fPHeapMax1.imprime();
        ds.FPHeapMax fPHeapMax8 = new ds.FPHeapMax((int) ' ');
        fPHeapMax8.imprime();
        ds.FPHeapMax fPHeapMax11 = new ds.FPHeapMax((int) (byte) 1);
        ds.Item item12 = null;
        ds.Item[] itemArray13 = new ds.Item[] { item12 };
        fPHeapMax11.copia(itemArray13);
        fPHeapMax11.constroi();
        ds.FPHeapMax fPHeapMax17 = new ds.FPHeapMax((int) ' ');
        fPHeapMax17.refaz((int) (short) 1, (int) (short) 1);
        ds.Item item21 = fPHeapMax17.max();
        ds.FPHeapMax fPHeapMax23 = new ds.FPHeapMax((int) (byte) 1);
        ds.Item item24 = null;
        ds.Item[] itemArray25 = new ds.Item[] { item24 };
        fPHeapMax23.copia(itemArray25);
        fPHeapMax17.copia(itemArray25);
        fPHeapMax17.constroi();
        ds.FPHeapMax fPHeapMax30 = new ds.FPHeapMax((int) (byte) 1);
        ds.Item item31 = null;
        ds.Item[] itemArray32 = new ds.Item[] { item31 };
        fPHeapMax30.copia(itemArray32);
        fPHeapMax17.copia(itemArray32);
        fPHeapMax11.copia(itemArray32);
        fPHeapMax8.copia(itemArray32);
        fPHeapMax1.copia(itemArray32);
        ds.FPHeapMax fPHeapMax39 = new ds.FPHeapMax((int) (byte) 1);
        ds.FPHeapMax fPHeapMax41 = new ds.FPHeapMax((int) (byte) 1);
        ds.Item item42 = null;
        ds.Item[] itemArray43 = new ds.Item[] { item42 };
        fPHeapMax41.copia(itemArray43);
        fPHeapMax39.copia(itemArray43);
        ds.Item item46 = fPHeapMax39.max();
        fPHeapMax39.constroi();
        ds.FPHeapMax fPHeapMax49 = new ds.FPHeapMax(100);
        fPHeapMax49.refaz((int) 'a', 0);
        ds.FPHeapMax fPHeapMax54 = new ds.FPHeapMax((int) (short) 1);
        ds.FPHeapMax fPHeapMax56 = new ds.FPHeapMax(0);
        ds.FPHeapMax fPHeapMax58 = new ds.FPHeapMax((int) (byte) 1);
        ds.FPHeapMax fPHeapMax60 = new ds.FPHeapMax((int) (byte) 1);
        ds.Item item61 = null;
        ds.Item[] itemArray62 = new ds.Item[] { item61 };
        fPHeapMax60.copia(itemArray62);
        fPHeapMax58.copia(itemArray62);
        fPHeapMax56.copia(itemArray62);
        fPHeapMax54.copia(itemArray62);
        fPHeapMax49.copia(itemArray62);
        fPHeapMax39.copia(itemArray62);
        fPHeapMax1.copia(itemArray62);
        org.junit.Assert.assertNotNull(itemArray13);
        org.junit.Assert.assertNull(item21);
        org.junit.Assert.assertNotNull(itemArray25);
        org.junit.Assert.assertNotNull(itemArray32);
        org.junit.Assert.assertNotNull(itemArray43);
        org.junit.Assert.assertNull(item46);
        org.junit.Assert.assertNotNull(itemArray62);
    }

    @Test
    public void test397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test397");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (byte) 10);
        fPHeapMax1.constroi();
        fPHeapMax1.refaz((int) (short) 10, 0);
        // The following exception was thrown during execution in test generation
        try {
            ds.Item item6 = fPHeapMax1.retiraMax();
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: heap vazio");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
    }

    @Test
    public void test398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test398");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (byte) 1);
        ds.Item item2 = null;
        ds.Item[] itemArray3 = new ds.Item[] { item2 };
        fPHeapMax1.copia(itemArray3);
        ds.Item item5 = fPHeapMax1.max();
        fPHeapMax1.constroi();
        fPHeapMax1.imprime();
        fPHeapMax1.constroi();
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMax1.refaz((int) (byte) 1, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 2");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertNull(item5);
    }

    @Test
    public void test399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test399");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (byte) 10);
        fPHeapMax1.constroi();
        fPHeapMax1.refaz((int) (short) 10, 0);
        fPHeapMax1.imprime();
        ds.FPHeapMax fPHeapMax8 = new ds.FPHeapMax((int) ' ');
        fPHeapMax8.imprime();
        ds.FPHeapMax fPHeapMax11 = new ds.FPHeapMax((int) (byte) 1);
        ds.Item item12 = null;
        ds.Item[] itemArray13 = new ds.Item[] { item12 };
        fPHeapMax11.copia(itemArray13);
        fPHeapMax11.constroi();
        ds.FPHeapMax fPHeapMax17 = new ds.FPHeapMax((int) ' ');
        fPHeapMax17.refaz((int) (short) 1, (int) (short) 1);
        ds.Item item21 = fPHeapMax17.max();
        ds.FPHeapMax fPHeapMax23 = new ds.FPHeapMax((int) (byte) 1);
        ds.Item item24 = null;
        ds.Item[] itemArray25 = new ds.Item[] { item24 };
        fPHeapMax23.copia(itemArray25);
        fPHeapMax17.copia(itemArray25);
        fPHeapMax17.constroi();
        ds.FPHeapMax fPHeapMax30 = new ds.FPHeapMax((int) (byte) 1);
        ds.Item item31 = null;
        ds.Item[] itemArray32 = new ds.Item[] { item31 };
        fPHeapMax30.copia(itemArray32);
        fPHeapMax17.copia(itemArray32);
        fPHeapMax11.copia(itemArray32);
        fPHeapMax8.copia(itemArray32);
        fPHeapMax1.copia(itemArray32);
        ds.Item item38 = fPHeapMax1.max();
        ds.Item item39 = null;
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMax1.insere(item39);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray13);
        org.junit.Assert.assertNull(item21);
        org.junit.Assert.assertNotNull(itemArray25);
        org.junit.Assert.assertNotNull(itemArray32);
        org.junit.Assert.assertNull(item38);
    }

    @Test
    public void test400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test400");
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
    public void test401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test401");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) ' ');
        fPHeapMax1.imprime();
        ds.FPHeapMax fPHeapMax4 = new ds.FPHeapMax((int) (byte) 1);
        ds.FPHeapMax fPHeapMax6 = new ds.FPHeapMax((int) (byte) 1);
        ds.Item item7 = null;
        ds.Item[] itemArray8 = new ds.Item[] { item7 };
        fPHeapMax6.copia(itemArray8);
        fPHeapMax4.copia(itemArray8);
        fPHeapMax4.imprime();
        ds.FPHeapMax fPHeapMax13 = new ds.FPHeapMax((int) (byte) 1);
        ds.Item item14 = null;
        ds.Item[] itemArray15 = new ds.Item[] { item14 };
        fPHeapMax13.copia(itemArray15);
        ds.Item item17 = fPHeapMax13.max();
        ds.FPHeapMax fPHeapMax19 = new ds.FPHeapMax((int) (byte) 1);
        ds.FPHeapMax fPHeapMax21 = new ds.FPHeapMax((int) (byte) 1);
        ds.Item item22 = null;
        ds.Item[] itemArray23 = new ds.Item[] { item22 };
        fPHeapMax21.copia(itemArray23);
        fPHeapMax19.copia(itemArray23);
        fPHeapMax13.copia(itemArray23);
        fPHeapMax4.copia(itemArray23);
        fPHeapMax1.copia(itemArray23);
        ds.FPHeapMax fPHeapMax30 = new ds.FPHeapMax((int) (byte) 1);
        ds.Item item31 = null;
        ds.Item[] itemArray32 = new ds.Item[] { item31 };
        fPHeapMax30.copia(itemArray32);
        ds.Item item34 = fPHeapMax30.max();
        fPHeapMax30.constroi();
        fPHeapMax30.constroi();
        ds.Item item37 = fPHeapMax30.max();
        fPHeapMax30.constroi();
        ds.Item item39 = fPHeapMax30.max();
        ds.Item item40 = fPHeapMax30.max();
        ds.Item item41 = fPHeapMax30.max();
        fPHeapMax30.imprime();
        ds.FPHeapMax fPHeapMax44 = new ds.FPHeapMax((int) (byte) 1);
        ds.Item item45 = fPHeapMax44.max();
        fPHeapMax44.imprime();
        fPHeapMax44.constroi();
        fPHeapMax44.refaz((int) (byte) 1, 0);
        ds.FPHeapMax fPHeapMax52 = new ds.FPHeapMax(0);
        ds.FPHeapMax fPHeapMax54 = new ds.FPHeapMax((int) (byte) 1);
        ds.FPHeapMax fPHeapMax56 = new ds.FPHeapMax((int) (byte) 1);
        ds.Item item57 = null;
        ds.Item[] itemArray58 = new ds.Item[] { item57 };
        fPHeapMax56.copia(itemArray58);
        fPHeapMax54.copia(itemArray58);
        fPHeapMax52.copia(itemArray58);
        fPHeapMax44.copia(itemArray58);
        fPHeapMax30.copia(itemArray58);
        fPHeapMax1.copia(itemArray58);
        fPHeapMax1.refaz((int) (short) 1, (int) (byte) -1);
        fPHeapMax1.imprime();
        org.junit.Assert.assertNotNull(itemArray8);
        org.junit.Assert.assertNotNull(itemArray15);
        org.junit.Assert.assertNull(item17);
        org.junit.Assert.assertNotNull(itemArray23);
        org.junit.Assert.assertNotNull(itemArray32);
        org.junit.Assert.assertNull(item34);
        org.junit.Assert.assertNull(item37);
        org.junit.Assert.assertNull(item39);
        org.junit.Assert.assertNull(item40);
        org.junit.Assert.assertNull(item41);
        org.junit.Assert.assertNull(item45);
        org.junit.Assert.assertNotNull(itemArray58);
    }

    @Test
    public void test402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test402");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (byte) 1);
        ds.Item item2 = null;
        ds.Item[] itemArray3 = new ds.Item[] { item2 };
        fPHeapMax1.copia(itemArray3);
        ds.Item item5 = fPHeapMax1.max();
        fPHeapMax1.constroi();
        fPHeapMax1.constroi();
        ds.Item item8 = fPHeapMax1.max();
        fPHeapMax1.constroi();
        ds.Item item10 = fPHeapMax1.max();
        fPHeapMax1.constroi();
        fPHeapMax1.refaz((int) (byte) 1, (int) (byte) -1);
        ds.Item item15 = fPHeapMax1.max();
        ds.Item item16 = fPHeapMax1.max();
        // The following exception was thrown during execution in test generation
        try {
            ds.Item item17 = fPHeapMax1.retiraMax();
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: heap vazio");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertNull(item5);
        org.junit.Assert.assertNull(item8);
        org.junit.Assert.assertNull(item10);
        org.junit.Assert.assertNull(item15);
        org.junit.Assert.assertNull(item16);
    }

    @Test
    public void test403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test403");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (byte) 1);
        ds.FPHeapMax fPHeapMax3 = new ds.FPHeapMax((int) (byte) 1);
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
    public void test404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test404");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (byte) 1);
        ds.Item item2 = null;
        ds.Item[] itemArray3 = new ds.Item[] { item2 };
        fPHeapMax1.copia(itemArray3);
        ds.Item item5 = fPHeapMax1.max();
        fPHeapMax1.constroi();
        fPHeapMax1.constroi();
        ds.Item item8 = fPHeapMax1.max();
        fPHeapMax1.constroi();
        ds.Item item10 = fPHeapMax1.max();
        fPHeapMax1.constroi();
        fPHeapMax1.refaz((int) (byte) 1, (int) (byte) -1);
        ds.FPHeapMax fPHeapMax16 = new ds.FPHeapMax((int) (byte) 1);
        ds.Item item17 = null;
        ds.Item[] itemArray18 = new ds.Item[] { item17 };
        fPHeapMax16.copia(itemArray18);
        ds.Item item20 = fPHeapMax16.max();
        fPHeapMax16.constroi();
        fPHeapMax16.constroi();
        ds.Item item23 = fPHeapMax16.max();
        fPHeapMax16.constroi();
        ds.Item item25 = fPHeapMax16.max();
        fPHeapMax16.constroi();
        fPHeapMax16.imprime();
        ds.Item item28 = null;
        ds.Item[] itemArray29 = new ds.Item[] { item28 };
        fPHeapMax16.copia(itemArray29);
        fPHeapMax1.copia(itemArray29);
        ds.FPHeapMax fPHeapMax33 = new ds.FPHeapMax((int) ' ');
        fPHeapMax33.refaz((int) (short) 1, (int) (short) 1);
        ds.Item item37 = fPHeapMax33.max();
        ds.FPHeapMax fPHeapMax39 = new ds.FPHeapMax((int) (byte) 1);
        ds.Item item40 = null;
        ds.Item[] itemArray41 = new ds.Item[] { item40 };
        fPHeapMax39.copia(itemArray41);
        fPHeapMax33.copia(itemArray41);
        fPHeapMax1.copia(itemArray41);
        ds.FPHeapMax fPHeapMax46 = new ds.FPHeapMax(0);
        fPHeapMax46.constroi();
        ds.FPHeapMax fPHeapMax49 = new ds.FPHeapMax((int) (byte) 1);
        ds.Item item50 = null;
        ds.Item[] itemArray51 = new ds.Item[] { item50 };
        fPHeapMax49.copia(itemArray51);
        ds.Item item53 = fPHeapMax49.max();
        fPHeapMax49.constroi();
        fPHeapMax49.constroi();
        ds.Item item56 = fPHeapMax49.max();
        fPHeapMax49.constroi();
        fPHeapMax49.imprime();
        ds.Item item59 = fPHeapMax49.max();
        ds.Item item60 = fPHeapMax49.max();
        ds.FPHeapMax fPHeapMax62 = new ds.FPHeapMax((int) ' ');
        fPHeapMax62.imprime();
        ds.FPHeapMax fPHeapMax65 = new ds.FPHeapMax((int) (byte) 1);
        ds.FPHeapMax fPHeapMax67 = new ds.FPHeapMax((int) (byte) 1);
        ds.Item item68 = null;
        ds.Item[] itemArray69 = new ds.Item[] { item68 };
        fPHeapMax67.copia(itemArray69);
        fPHeapMax65.copia(itemArray69);
        fPHeapMax65.imprime();
        ds.FPHeapMax fPHeapMax74 = new ds.FPHeapMax((int) (byte) 1);
        ds.Item item75 = null;
        ds.Item[] itemArray76 = new ds.Item[] { item75 };
        fPHeapMax74.copia(itemArray76);
        ds.Item item78 = fPHeapMax74.max();
        ds.FPHeapMax fPHeapMax80 = new ds.FPHeapMax((int) (byte) 1);
        ds.FPHeapMax fPHeapMax82 = new ds.FPHeapMax((int) (byte) 1);
        ds.Item item83 = null;
        ds.Item[] itemArray84 = new ds.Item[] { item83 };
        fPHeapMax82.copia(itemArray84);
        fPHeapMax80.copia(itemArray84);
        fPHeapMax74.copia(itemArray84);
        fPHeapMax65.copia(itemArray84);
        fPHeapMax62.copia(itemArray84);
        fPHeapMax49.copia(itemArray84);
        fPHeapMax46.copia(itemArray84);
        fPHeapMax1.copia(itemArray84);
        fPHeapMax1.constroi();
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertNull(item5);
        org.junit.Assert.assertNull(item8);
        org.junit.Assert.assertNull(item10);
        org.junit.Assert.assertNotNull(itemArray18);
        org.junit.Assert.assertNull(item20);
        org.junit.Assert.assertNull(item23);
        org.junit.Assert.assertNull(item25);
        org.junit.Assert.assertNotNull(itemArray29);
        org.junit.Assert.assertNull(item37);
        org.junit.Assert.assertNotNull(itemArray41);
        org.junit.Assert.assertNotNull(itemArray51);
        org.junit.Assert.assertNull(item53);
        org.junit.Assert.assertNull(item56);
        org.junit.Assert.assertNull(item59);
        org.junit.Assert.assertNull(item60);
        org.junit.Assert.assertNotNull(itemArray69);
        org.junit.Assert.assertNotNull(itemArray76);
        org.junit.Assert.assertNull(item78);
        org.junit.Assert.assertNotNull(itemArray84);
    }

    @Test
    public void test405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test405");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (byte) 10);
        fPHeapMax1.constroi();
        fPHeapMax1.refaz((int) (short) 10, 0);
        fPHeapMax1.imprime();
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMax1.refaz((int) (short) 10, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 20");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test406");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (byte) 10);
        fPHeapMax1.constroi();
        fPHeapMax1.constroi();
        fPHeapMax1.constroi();
        java.lang.Class<?> wildcardClass5 = fPHeapMax1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test407");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (byte) 1);
        ds.Item item2 = null;
        ds.Item[] itemArray3 = new ds.Item[] { item2 };
        fPHeapMax1.copia(itemArray3);
        ds.Item item5 = fPHeapMax1.max();
        fPHeapMax1.constroi();
        fPHeapMax1.constroi();
        ds.Item item8 = fPHeapMax1.max();
        fPHeapMax1.constroi();
        ds.Item item10 = fPHeapMax1.max();
        ds.Item item11 = fPHeapMax1.max();
        fPHeapMax1.imprime();
        java.lang.Class<?> wildcardClass13 = fPHeapMax1.getClass();
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertNull(item5);
        org.junit.Assert.assertNull(item8);
        org.junit.Assert.assertNull(item10);
        org.junit.Assert.assertNull(item11);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test408");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (byte) 1);
        ds.Item item2 = null;
        ds.Item[] itemArray3 = new ds.Item[] { item2 };
        fPHeapMax1.copia(itemArray3);
        ds.Item item5 = fPHeapMax1.max();
        fPHeapMax1.constroi();
        fPHeapMax1.constroi();
        ds.Item item8 = fPHeapMax1.max();
        fPHeapMax1.constroi();
        fPHeapMax1.refaz(0, (int) (short) -1);
        fPHeapMax1.constroi();
        ds.FPHeapMax fPHeapMax15 = new ds.FPHeapMax((int) (short) 1);
        ds.FPHeapMax fPHeapMax17 = new ds.FPHeapMax(0);
        ds.FPHeapMax fPHeapMax19 = new ds.FPHeapMax((int) (byte) 1);
        ds.FPHeapMax fPHeapMax21 = new ds.FPHeapMax((int) (byte) 1);
        ds.Item item22 = null;
        ds.Item[] itemArray23 = new ds.Item[] { item22 };
        fPHeapMax21.copia(itemArray23);
        fPHeapMax19.copia(itemArray23);
        fPHeapMax17.copia(itemArray23);
        fPHeapMax15.copia(itemArray23);
        fPHeapMax15.imprime();
        ds.FPHeapMax fPHeapMax30 = new ds.FPHeapMax((int) ' ');
        fPHeapMax30.refaz((int) (short) 1, (int) (short) 1);
        ds.Item item34 = fPHeapMax30.max();
        ds.FPHeapMax fPHeapMax36 = new ds.FPHeapMax((int) (byte) 1);
        ds.Item item37 = null;
        ds.Item[] itemArray38 = new ds.Item[] { item37 };
        fPHeapMax36.copia(itemArray38);
        fPHeapMax30.copia(itemArray38);
        fPHeapMax15.copia(itemArray38);
        fPHeapMax1.copia(itemArray38);
        // The following exception was thrown during execution in test generation
        try {
            ds.Item item43 = fPHeapMax1.retiraMax();
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: heap vazio");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertNull(item5);
        org.junit.Assert.assertNull(item8);
        org.junit.Assert.assertNotNull(itemArray23);
        org.junit.Assert.assertNull(item34);
        org.junit.Assert.assertNotNull(itemArray38);
    }

    @Test
    public void test409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test409");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (byte) 1);
        ds.Item item2 = null;
        ds.Item[] itemArray3 = new ds.Item[] { item2 };
        fPHeapMax1.copia(itemArray3);
        ds.Item item5 = fPHeapMax1.max();
        fPHeapMax1.constroi();
        fPHeapMax1.imprime();
        fPHeapMax1.constroi();
        fPHeapMax1.imprime();
        java.lang.Class<?> wildcardClass10 = fPHeapMax1.getClass();
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertNull(item5);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test410");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (byte) 1);
        ds.Item item2 = null;
        ds.Item[] itemArray3 = new ds.Item[] { item2 };
        fPHeapMax1.copia(itemArray3);
        fPHeapMax1.constroi();
        ds.FPHeapMax fPHeapMax7 = new ds.FPHeapMax((int) ' ');
        fPHeapMax7.refaz((int) (short) 1, (int) (short) 1);
        ds.Item item11 = fPHeapMax7.max();
        ds.FPHeapMax fPHeapMax13 = new ds.FPHeapMax((int) (byte) 1);
        ds.Item item14 = null;
        ds.Item[] itemArray15 = new ds.Item[] { item14 };
        fPHeapMax13.copia(itemArray15);
        fPHeapMax7.copia(itemArray15);
        fPHeapMax7.constroi();
        ds.FPHeapMax fPHeapMax20 = new ds.FPHeapMax((int) (byte) 1);
        ds.Item item21 = null;
        ds.Item[] itemArray22 = new ds.Item[] { item21 };
        fPHeapMax20.copia(itemArray22);
        fPHeapMax7.copia(itemArray22);
        fPHeapMax1.copia(itemArray22);
        ds.FPHeapMax fPHeapMax28 = new ds.FPHeapMax((int) (byte) 1);
        ds.Item item29 = null;
        ds.Item[] itemArray30 = new ds.Item[] { item29 };
        fPHeapMax28.copia(itemArray30);
        ds.Item item32 = fPHeapMax28.max();
        fPHeapMax28.constroi();
        fPHeapMax28.constroi();
        ds.Item item35 = fPHeapMax28.max();
        fPHeapMax28.constroi();
        ds.Item item37 = fPHeapMax28.max();
        fPHeapMax28.imprime();
        ds.FPHeapMax fPHeapMax40 = new ds.FPHeapMax((int) (byte) 1);
        ds.Item item41 = null;
        ds.Item[] itemArray42 = new ds.Item[] { item41 };
        fPHeapMax40.copia(itemArray42);
        ds.Item item44 = fPHeapMax40.max();
        ds.FPHeapMax fPHeapMax46 = new ds.FPHeapMax((int) (byte) 1);
        ds.FPHeapMax fPHeapMax48 = new ds.FPHeapMax((int) (byte) 1);
        ds.Item item49 = null;
        ds.Item[] itemArray50 = new ds.Item[] { item49 };
        fPHeapMax48.copia(itemArray50);
        fPHeapMax46.copia(itemArray50);
        fPHeapMax40.copia(itemArray50);
        fPHeapMax28.copia(itemArray50);
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMax1.aumentaChave((int) (byte) -1, (java.lang.Object) fPHeapMax28);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertNull(item11);
        org.junit.Assert.assertNotNull(itemArray15);
        org.junit.Assert.assertNotNull(itemArray22);
        org.junit.Assert.assertNotNull(itemArray30);
        org.junit.Assert.assertNull(item32);
        org.junit.Assert.assertNull(item35);
        org.junit.Assert.assertNull(item37);
        org.junit.Assert.assertNotNull(itemArray42);
        org.junit.Assert.assertNull(item44);
        org.junit.Assert.assertNotNull(itemArray50);
    }

    @Test
    public void test411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test411");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (byte) 1);
        ds.Item item2 = null;
        ds.Item[] itemArray3 = new ds.Item[] { item2 };
        fPHeapMax1.copia(itemArray3);
        ds.Item item5 = fPHeapMax1.max();
        fPHeapMax1.constroi();
        fPHeapMax1.constroi();
        ds.Item item8 = fPHeapMax1.max();
        fPHeapMax1.constroi();
        ds.Item item10 = fPHeapMax1.max();
        ds.Item item11 = fPHeapMax1.max();
        ds.Item item12 = fPHeapMax1.max();
        fPHeapMax1.imprime();
        ds.FPHeapMax fPHeapMax15 = new ds.FPHeapMax((int) (byte) 1);
        ds.Item item16 = fPHeapMax15.max();
        fPHeapMax15.imprime();
        fPHeapMax15.constroi();
        fPHeapMax15.refaz((int) (byte) 1, 0);
        ds.FPHeapMax fPHeapMax23 = new ds.FPHeapMax(0);
        ds.FPHeapMax fPHeapMax25 = new ds.FPHeapMax((int) (byte) 1);
        ds.FPHeapMax fPHeapMax27 = new ds.FPHeapMax((int) (byte) 1);
        ds.Item item28 = null;
        ds.Item[] itemArray29 = new ds.Item[] { item28 };
        fPHeapMax27.copia(itemArray29);
        fPHeapMax25.copia(itemArray29);
        fPHeapMax23.copia(itemArray29);
        fPHeapMax15.copia(itemArray29);
        fPHeapMax1.copia(itemArray29);
        ds.Item item35 = fPHeapMax1.max();
        ds.Item item36 = fPHeapMax1.max();
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertNull(item5);
        org.junit.Assert.assertNull(item8);
        org.junit.Assert.assertNull(item10);
        org.junit.Assert.assertNull(item11);
        org.junit.Assert.assertNull(item12);
        org.junit.Assert.assertNull(item16);
        org.junit.Assert.assertNotNull(itemArray29);
        org.junit.Assert.assertNull(item35);
        org.junit.Assert.assertNull(item36);
    }

    @Test
    public void test412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test412");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (byte) 1);
        ds.Item item2 = fPHeapMax1.max();
        fPHeapMax1.imprime();
        fPHeapMax1.constroi();
        fPHeapMax1.constroi();
        fPHeapMax1.constroi();
        // The following exception was thrown during execution in test generation
        try {
            ds.Item item7 = fPHeapMax1.retiraMax();
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: heap vazio");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(item2);
    }

    @Test
    public void test413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test413");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (short) 10);
        ds.FPHeapMax fPHeapMax3 = new ds.FPHeapMax((int) (byte) 1);
        ds.Item item4 = null;
        ds.Item[] itemArray5 = new ds.Item[] { item4 };
        fPHeapMax3.copia(itemArray5);
        ds.Item item7 = fPHeapMax3.max();
        fPHeapMax3.constroi();
        fPHeapMax3.constroi();
        ds.Item item10 = fPHeapMax3.max();
        fPHeapMax3.constroi();
        ds.Item item12 = fPHeapMax3.max();
        fPHeapMax3.constroi();
        fPHeapMax3.refaz((int) (byte) 1, (int) (byte) -1);
        ds.FPHeapMax fPHeapMax18 = new ds.FPHeapMax((int) (byte) 1);
        ds.Item item19 = null;
        ds.Item[] itemArray20 = new ds.Item[] { item19 };
        fPHeapMax18.copia(itemArray20);
        ds.Item item22 = fPHeapMax18.max();
        ds.FPHeapMax fPHeapMax24 = new ds.FPHeapMax((int) (byte) 1);
        ds.FPHeapMax fPHeapMax26 = new ds.FPHeapMax((int) (byte) 1);
        ds.Item item27 = null;
        ds.Item[] itemArray28 = new ds.Item[] { item27 };
        fPHeapMax26.copia(itemArray28);
        fPHeapMax24.copia(itemArray28);
        fPHeapMax18.copia(itemArray28);
        fPHeapMax3.copia(itemArray28);
        fPHeapMax1.copia(itemArray28);
        ds.Item item34 = fPHeapMax1.max();
        org.junit.Assert.assertNotNull(itemArray5);
        org.junit.Assert.assertNull(item7);
        org.junit.Assert.assertNull(item10);
        org.junit.Assert.assertNull(item12);
        org.junit.Assert.assertNotNull(itemArray20);
        org.junit.Assert.assertNull(item22);
        org.junit.Assert.assertNotNull(itemArray28);
        org.junit.Assert.assertNull(item34);
    }

    @Test
    public void test414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test414");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (byte) 1);
        ds.Item item2 = null;
        ds.Item[] itemArray3 = new ds.Item[] { item2 };
        fPHeapMax1.copia(itemArray3);
        ds.Item item5 = fPHeapMax1.max();
        fPHeapMax1.constroi();
        fPHeapMax1.constroi();
        ds.Item item8 = fPHeapMax1.max();
        fPHeapMax1.constroi();
        fPHeapMax1.constroi();
        ds.FPHeapMax fPHeapMax12 = new ds.FPHeapMax((int) (byte) 1);
        ds.FPHeapMax fPHeapMax14 = new ds.FPHeapMax((int) (byte) 1);
        ds.Item item15 = null;
        ds.Item[] itemArray16 = new ds.Item[] { item15 };
        fPHeapMax14.copia(itemArray16);
        fPHeapMax12.copia(itemArray16);
        fPHeapMax12.imprime();
        ds.FPHeapMax fPHeapMax21 = new ds.FPHeapMax((int) (byte) 1);
        ds.Item item22 = null;
        ds.Item[] itemArray23 = new ds.Item[] { item22 };
        fPHeapMax21.copia(itemArray23);
        ds.Item item25 = fPHeapMax21.max();
        ds.FPHeapMax fPHeapMax27 = new ds.FPHeapMax((int) (byte) 1);
        ds.FPHeapMax fPHeapMax29 = new ds.FPHeapMax((int) (byte) 1);
        ds.Item item30 = null;
        ds.Item[] itemArray31 = new ds.Item[] { item30 };
        fPHeapMax29.copia(itemArray31);
        fPHeapMax27.copia(itemArray31);
        fPHeapMax21.copia(itemArray31);
        fPHeapMax12.copia(itemArray31);
        fPHeapMax1.copia(itemArray31);
        ds.Item item37 = fPHeapMax1.max();
        ds.FPHeapMax fPHeapMax39 = new ds.FPHeapMax((int) (short) 1);
        fPHeapMax39.imprime();
        ds.FPHeapMax fPHeapMax42 = new ds.FPHeapMax((int) (short) 1);
        ds.FPHeapMax fPHeapMax44 = new ds.FPHeapMax(0);
        ds.FPHeapMax fPHeapMax46 = new ds.FPHeapMax((int) (byte) 1);
        ds.FPHeapMax fPHeapMax48 = new ds.FPHeapMax((int) (byte) 1);
        ds.Item item49 = null;
        ds.Item[] itemArray50 = new ds.Item[] { item49 };
        fPHeapMax48.copia(itemArray50);
        fPHeapMax46.copia(itemArray50);
        fPHeapMax44.copia(itemArray50);
        fPHeapMax42.copia(itemArray50);
        fPHeapMax39.copia(itemArray50);
        fPHeapMax1.copia(itemArray50);
        java.lang.Class<?> wildcardClass57 = itemArray50.getClass();
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertNull(item5);
        org.junit.Assert.assertNull(item8);
        org.junit.Assert.assertNotNull(itemArray16);
        org.junit.Assert.assertNotNull(itemArray23);
        org.junit.Assert.assertNull(item25);
        org.junit.Assert.assertNotNull(itemArray31);
        org.junit.Assert.assertNull(item37);
        org.junit.Assert.assertNotNull(itemArray50);
        org.junit.Assert.assertNotNull(wildcardClass57);
    }

    @Test
    public void test415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test415");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (byte) 1);
        ds.Item item2 = null;
        ds.Item[] itemArray3 = new ds.Item[] { item2 };
        fPHeapMax1.copia(itemArray3);
        ds.Item item5 = fPHeapMax1.max();
        fPHeapMax1.constroi();
        fPHeapMax1.constroi();
        ds.Item item8 = fPHeapMax1.max();
        fPHeapMax1.constroi();
        ds.Item item10 = fPHeapMax1.max();
        fPHeapMax1.imprime();
        ds.Item item12 = fPHeapMax1.max();
        ds.FPHeapMax fPHeapMax15 = new ds.FPHeapMax((int) (byte) 1);
        ds.Item item16 = null;
        ds.Item[] itemArray17 = new ds.Item[] { item16 };
        fPHeapMax15.copia(itemArray17);
        ds.Item item19 = fPHeapMax15.max();
        fPHeapMax15.constroi();
        fPHeapMax15.constroi();
        ds.Item item22 = fPHeapMax15.max();
        fPHeapMax15.imprime();
        ds.Item item24 = fPHeapMax15.max();
        fPHeapMax15.imprime();
        fPHeapMax15.imprime();
        fPHeapMax15.refaz(0, (-1));
        fPHeapMax15.imprime();
        ds.Item item31 = fPHeapMax15.max();
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMax1.aumentaChave(100, (java.lang.Object) item31);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 100");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertNull(item5);
        org.junit.Assert.assertNull(item8);
        org.junit.Assert.assertNull(item10);
        org.junit.Assert.assertNull(item12);
        org.junit.Assert.assertNotNull(itemArray17);
        org.junit.Assert.assertNull(item19);
        org.junit.Assert.assertNull(item22);
        org.junit.Assert.assertNull(item24);
        org.junit.Assert.assertNull(item31);
    }

    @Test
    public void test416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test416");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (short) 1);
        fPHeapMax1.imprime();
        ds.FPHeapMax fPHeapMax4 = new ds.FPHeapMax((int) ' ');
        fPHeapMax4.refaz((int) (short) 1, (int) (short) 1);
        ds.Item item8 = fPHeapMax4.max();
        ds.FPHeapMax fPHeapMax10 = new ds.FPHeapMax((int) (byte) 1);
        ds.Item item11 = null;
        ds.Item[] itemArray12 = new ds.Item[] { item11 };
        fPHeapMax10.copia(itemArray12);
        fPHeapMax4.copia(itemArray12);
        fPHeapMax4.constroi();
        ds.FPHeapMax fPHeapMax17 = new ds.FPHeapMax((int) (short) 1);
        ds.FPHeapMax fPHeapMax19 = new ds.FPHeapMax(0);
        ds.FPHeapMax fPHeapMax21 = new ds.FPHeapMax((int) (byte) 1);
        ds.FPHeapMax fPHeapMax23 = new ds.FPHeapMax((int) (byte) 1);
        ds.Item item24 = null;
        ds.Item[] itemArray25 = new ds.Item[] { item24 };
        fPHeapMax23.copia(itemArray25);
        fPHeapMax21.copia(itemArray25);
        fPHeapMax19.copia(itemArray25);
        fPHeapMax17.copia(itemArray25);
        fPHeapMax17.imprime();
        ds.FPHeapMax fPHeapMax32 = new ds.FPHeapMax((int) ' ');
        fPHeapMax32.refaz((int) (short) 1, (int) (short) 1);
        ds.Item item36 = fPHeapMax32.max();
        ds.FPHeapMax fPHeapMax38 = new ds.FPHeapMax((int) (byte) 1);
        ds.Item item39 = null;
        ds.Item[] itemArray40 = new ds.Item[] { item39 };
        fPHeapMax38.copia(itemArray40);
        fPHeapMax32.copia(itemArray40);
        fPHeapMax17.copia(itemArray40);
        ds.FPHeapMax fPHeapMax45 = new ds.FPHeapMax((int) (byte) 1);
        ds.Item item46 = null;
        ds.Item[] itemArray47 = new ds.Item[] { item46 };
        fPHeapMax45.copia(itemArray47);
        ds.Item item49 = fPHeapMax45.max();
        fPHeapMax45.constroi();
        fPHeapMax45.constroi();
        ds.Item item52 = fPHeapMax45.max();
        fPHeapMax45.constroi();
        ds.Item item54 = fPHeapMax45.max();
        fPHeapMax45.imprime();
        ds.FPHeapMax fPHeapMax57 = new ds.FPHeapMax((int) (byte) 1);
        ds.Item item58 = null;
        ds.Item[] itemArray59 = new ds.Item[] { item58 };
        fPHeapMax57.copia(itemArray59);
        ds.Item item61 = fPHeapMax57.max();
        ds.FPHeapMax fPHeapMax63 = new ds.FPHeapMax((int) (byte) 1);
        ds.FPHeapMax fPHeapMax65 = new ds.FPHeapMax((int) (byte) 1);
        ds.Item item66 = null;
        ds.Item[] itemArray67 = new ds.Item[] { item66 };
        fPHeapMax65.copia(itemArray67);
        fPHeapMax63.copia(itemArray67);
        fPHeapMax57.copia(itemArray67);
        fPHeapMax45.copia(itemArray67);
        fPHeapMax17.copia(itemArray67);
        fPHeapMax4.copia(itemArray67);
        fPHeapMax1.copia(itemArray67);
        fPHeapMax1.constroi();
        fPHeapMax1.imprime();
        org.junit.Assert.assertNull(item8);
        org.junit.Assert.assertNotNull(itemArray12);
        org.junit.Assert.assertNotNull(itemArray25);
        org.junit.Assert.assertNull(item36);
        org.junit.Assert.assertNotNull(itemArray40);
        org.junit.Assert.assertNotNull(itemArray47);
        org.junit.Assert.assertNull(item49);
        org.junit.Assert.assertNull(item52);
        org.junit.Assert.assertNull(item54);
        org.junit.Assert.assertNotNull(itemArray59);
        org.junit.Assert.assertNull(item61);
        org.junit.Assert.assertNotNull(itemArray67);
    }

    @Test
    public void test417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test417");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (byte) 1);
        ds.Item item2 = null;
        ds.Item[] itemArray3 = new ds.Item[] { item2 };
        fPHeapMax1.copia(itemArray3);
        fPHeapMax1.constroi();
        java.lang.Class<?> wildcardClass6 = fPHeapMax1.getClass();
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test418");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (byte) 1);
        ds.Item item2 = null;
        ds.Item[] itemArray3 = new ds.Item[] { item2 };
        fPHeapMax1.copia(itemArray3);
        ds.Item item5 = fPHeapMax1.max();
        fPHeapMax1.constroi();
        fPHeapMax1.constroi();
        ds.Item item8 = fPHeapMax1.max();
        fPHeapMax1.constroi();
        ds.Item item10 = fPHeapMax1.max();
        fPHeapMax1.constroi();
        fPHeapMax1.imprime();
        ds.FPHeapMax fPHeapMax14 = new ds.FPHeapMax((int) (byte) 1);
        ds.Item item15 = null;
        ds.Item[] itemArray16 = new ds.Item[] { item15 };
        fPHeapMax14.copia(itemArray16);
        fPHeapMax1.copia(itemArray16);
        fPHeapMax1.constroi();
        fPHeapMax1.imprime();
        ds.FPHeapMax fPHeapMax22 = new ds.FPHeapMax((int) (byte) 1);
        ds.Item item23 = null;
        ds.Item[] itemArray24 = new ds.Item[] { item23 };
        fPHeapMax22.copia(itemArray24);
        fPHeapMax22.constroi();
        ds.FPHeapMax fPHeapMax28 = new ds.FPHeapMax((int) ' ');
        fPHeapMax28.refaz((int) (short) 1, (int) (short) 1);
        ds.Item item32 = fPHeapMax28.max();
        ds.FPHeapMax fPHeapMax34 = new ds.FPHeapMax((int) (byte) 1);
        ds.Item item35 = null;
        ds.Item[] itemArray36 = new ds.Item[] { item35 };
        fPHeapMax34.copia(itemArray36);
        fPHeapMax28.copia(itemArray36);
        fPHeapMax28.constroi();
        ds.FPHeapMax fPHeapMax41 = new ds.FPHeapMax((int) (byte) 1);
        ds.Item item42 = null;
        ds.Item[] itemArray43 = new ds.Item[] { item42 };
        fPHeapMax41.copia(itemArray43);
        fPHeapMax28.copia(itemArray43);
        fPHeapMax22.copia(itemArray43);
        fPHeapMax1.copia(itemArray43);
        fPHeapMax1.imprime();
        // The following exception was thrown during execution in test generation
        try {
            ds.Item item49 = fPHeapMax1.retiraMax();
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: heap vazio");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertNull(item5);
        org.junit.Assert.assertNull(item8);
        org.junit.Assert.assertNull(item10);
        org.junit.Assert.assertNotNull(itemArray16);
        org.junit.Assert.assertNotNull(itemArray24);
        org.junit.Assert.assertNull(item32);
        org.junit.Assert.assertNotNull(itemArray36);
        org.junit.Assert.assertNotNull(itemArray43);
    }

    @Test
    public void test419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test419");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (byte) 1);
        ds.Item item2 = null;
        ds.Item[] itemArray3 = new ds.Item[] { item2 };
        fPHeapMax1.copia(itemArray3);
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
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertNull(item5);
    }

    @Test
    public void test420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test420");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax(0);
        fPHeapMax1.imprime();
        ds.FPHeapMax fPHeapMax4 = new ds.FPHeapMax((int) (short) 1);
        fPHeapMax4.imprime();
        fPHeapMax4.constroi();
        ds.FPHeapMax fPHeapMax8 = new ds.FPHeapMax((int) ' ');
        fPHeapMax8.imprime();
        ds.FPHeapMax fPHeapMax11 = new ds.FPHeapMax((int) (byte) 1);
        ds.Item item12 = null;
        ds.Item[] itemArray13 = new ds.Item[] { item12 };
        fPHeapMax11.copia(itemArray13);
        ds.Item item15 = fPHeapMax11.max();
        fPHeapMax11.constroi();
        fPHeapMax11.constroi();
        ds.Item item18 = fPHeapMax11.max();
        fPHeapMax11.constroi();
        ds.Item item20 = fPHeapMax11.max();
        fPHeapMax11.imprime();
        ds.FPHeapMax fPHeapMax23 = new ds.FPHeapMax((int) (byte) 1);
        ds.Item item24 = null;
        ds.Item[] itemArray25 = new ds.Item[] { item24 };
        fPHeapMax23.copia(itemArray25);
        ds.Item item27 = fPHeapMax23.max();
        ds.FPHeapMax fPHeapMax29 = new ds.FPHeapMax((int) (byte) 1);
        ds.FPHeapMax fPHeapMax31 = new ds.FPHeapMax((int) (byte) 1);
        ds.Item item32 = null;
        ds.Item[] itemArray33 = new ds.Item[] { item32 };
        fPHeapMax31.copia(itemArray33);
        fPHeapMax29.copia(itemArray33);
        fPHeapMax23.copia(itemArray33);
        fPHeapMax11.copia(itemArray33);
        fPHeapMax8.copia(itemArray33);
        ds.FPHeapMax fPHeapMax40 = new ds.FPHeapMax(10);
        ds.FPHeapMax fPHeapMax42 = new ds.FPHeapMax((int) ' ');
        fPHeapMax42.imprime();
        ds.FPHeapMax fPHeapMax45 = new ds.FPHeapMax((int) (byte) 1);
        ds.FPHeapMax fPHeapMax47 = new ds.FPHeapMax((int) (byte) 1);
        ds.Item item48 = null;
        ds.Item[] itemArray49 = new ds.Item[] { item48 };
        fPHeapMax47.copia(itemArray49);
        fPHeapMax45.copia(itemArray49);
        fPHeapMax45.imprime();
        ds.FPHeapMax fPHeapMax54 = new ds.FPHeapMax((int) (byte) 1);
        ds.Item item55 = null;
        ds.Item[] itemArray56 = new ds.Item[] { item55 };
        fPHeapMax54.copia(itemArray56);
        ds.Item item58 = fPHeapMax54.max();
        ds.FPHeapMax fPHeapMax60 = new ds.FPHeapMax((int) (byte) 1);
        ds.FPHeapMax fPHeapMax62 = new ds.FPHeapMax((int) (byte) 1);
        ds.Item item63 = null;
        ds.Item[] itemArray64 = new ds.Item[] { item63 };
        fPHeapMax62.copia(itemArray64);
        fPHeapMax60.copia(itemArray64);
        fPHeapMax54.copia(itemArray64);
        fPHeapMax45.copia(itemArray64);
        fPHeapMax42.copia(itemArray64);
        fPHeapMax40.copia(itemArray64);
        fPHeapMax8.copia(itemArray64);
        fPHeapMax4.copia(itemArray64);
        fPHeapMax1.copia(itemArray64);
        fPHeapMax1.constroi();
        // The following exception was thrown during execution in test generation
        try {
            ds.Item item75 = fPHeapMax1.max();
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray13);
        org.junit.Assert.assertNull(item15);
        org.junit.Assert.assertNull(item18);
        org.junit.Assert.assertNull(item20);
        org.junit.Assert.assertNotNull(itemArray25);
        org.junit.Assert.assertNull(item27);
        org.junit.Assert.assertNotNull(itemArray33);
        org.junit.Assert.assertNotNull(itemArray49);
        org.junit.Assert.assertNotNull(itemArray56);
        org.junit.Assert.assertNull(item58);
        org.junit.Assert.assertNotNull(itemArray64);
    }

    @Test
    public void test421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test421");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) ' ');
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
    public void test422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test422");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (byte) 1);
        ds.Item item2 = null;
        ds.Item[] itemArray3 = new ds.Item[] { item2 };
        fPHeapMax1.copia(itemArray3);
        ds.Item item5 = fPHeapMax1.max();
        fPHeapMax1.constroi();
        fPHeapMax1.constroi();
        ds.Item item8 = fPHeapMax1.max();
        fPHeapMax1.constroi();
        ds.Item item10 = fPHeapMax1.max();
        fPHeapMax1.imprime();
        fPHeapMax1.constroi();
        fPHeapMax1.imprime();
        ds.Item[] itemArray14 = null;
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMax1.copia(itemArray14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertNull(item5);
        org.junit.Assert.assertNull(item8);
        org.junit.Assert.assertNull(item10);
    }

    @Test
    public void test423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test423");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (byte) 1);
        ds.Item item2 = null;
        ds.Item[] itemArray3 = new ds.Item[] { item2 };
        fPHeapMax1.copia(itemArray3);
        ds.Item item5 = fPHeapMax1.max();
        fPHeapMax1.constroi();
        fPHeapMax1.constroi();
        ds.Item item8 = fPHeapMax1.max();
        fPHeapMax1.constroi();
        ds.Item item10 = fPHeapMax1.max();
        ds.Item item11 = fPHeapMax1.max();
        fPHeapMax1.imprime();
        ds.Item item13 = fPHeapMax1.max();
        fPHeapMax1.constroi();
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMax1.refaz((int) (short) -1, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertNull(item5);
        org.junit.Assert.assertNull(item8);
        org.junit.Assert.assertNull(item10);
        org.junit.Assert.assertNull(item11);
        org.junit.Assert.assertNull(item13);
    }

    @Test
    public void test424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test424");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (byte) 1);
        ds.Item item2 = null;
        ds.Item[] itemArray3 = new ds.Item[] { item2 };
        fPHeapMax1.copia(itemArray3);
        ds.Item item5 = fPHeapMax1.max();
        fPHeapMax1.constroi();
        fPHeapMax1.constroi();
        ds.Item item8 = fPHeapMax1.max();
        fPHeapMax1.constroi();
        ds.Item item10 = fPHeapMax1.max();
        ds.Item item11 = fPHeapMax1.max();
        fPHeapMax1.imprime();
        ds.Item item13 = fPHeapMax1.max();
        ds.FPHeapMax fPHeapMax15 = new ds.FPHeapMax((int) ' ');
        fPHeapMax15.refaz((int) (short) 1, (int) (short) 1);
        ds.Item item19 = fPHeapMax15.max();
        ds.FPHeapMax fPHeapMax21 = new ds.FPHeapMax((int) (byte) 1);
        ds.Item item22 = null;
        ds.Item[] itemArray23 = new ds.Item[] { item22 };
        fPHeapMax21.copia(itemArray23);
        fPHeapMax15.copia(itemArray23);
        fPHeapMax1.copia(itemArray23);
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertNull(item5);
        org.junit.Assert.assertNull(item8);
        org.junit.Assert.assertNull(item10);
        org.junit.Assert.assertNull(item11);
        org.junit.Assert.assertNull(item13);
        org.junit.Assert.assertNull(item19);
        org.junit.Assert.assertNotNull(itemArray23);
    }

    @Test
    public void test425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test425");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (byte) 1);
        ds.Item item2 = null;
        ds.Item[] itemArray3 = new ds.Item[] { item2 };
        fPHeapMax1.copia(itemArray3);
        ds.Item item5 = fPHeapMax1.max();
        fPHeapMax1.constroi();
        fPHeapMax1.constroi();
        ds.Item item8 = fPHeapMax1.max();
        fPHeapMax1.constroi();
        ds.Item item10 = fPHeapMax1.max();
        fPHeapMax1.imprime();
        fPHeapMax1.constroi();
        // The following exception was thrown during execution in test generation
        try {
            ds.Item item13 = fPHeapMax1.retiraMax();
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: heap vazio");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertNull(item5);
        org.junit.Assert.assertNull(item8);
        org.junit.Assert.assertNull(item10);
    }

    @Test
    public void test426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test426");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (byte) 1);
        ds.Item item2 = null;
        ds.Item[] itemArray3 = new ds.Item[] { item2 };
        fPHeapMax1.copia(itemArray3);
        ds.Item item5 = fPHeapMax1.max();
        fPHeapMax1.constroi();
        fPHeapMax1.constroi();
        ds.Item item8 = fPHeapMax1.max();
        fPHeapMax1.imprime();
        ds.Item item10 = fPHeapMax1.max();
        fPHeapMax1.imprime();
        ds.FPHeapMax fPHeapMax13 = new ds.FPHeapMax((int) (byte) 1);
        ds.Item item14 = null;
        ds.Item[] itemArray15 = new ds.Item[] { item14 };
        fPHeapMax13.copia(itemArray15);
        ds.Item item17 = fPHeapMax13.max();
        fPHeapMax13.constroi();
        fPHeapMax13.constroi();
        ds.Item item20 = fPHeapMax13.max();
        fPHeapMax13.constroi();
        ds.Item item22 = fPHeapMax13.max();
        fPHeapMax13.constroi();
        fPHeapMax13.refaz((int) (byte) 1, (int) (byte) -1);
        ds.FPHeapMax fPHeapMax28 = new ds.FPHeapMax((int) (byte) 1);
        ds.Item item29 = null;
        ds.Item[] itemArray30 = new ds.Item[] { item29 };
        fPHeapMax28.copia(itemArray30);
        ds.Item item32 = fPHeapMax28.max();
        ds.FPHeapMax fPHeapMax34 = new ds.FPHeapMax((int) (byte) 1);
        ds.FPHeapMax fPHeapMax36 = new ds.FPHeapMax((int) (byte) 1);
        ds.Item item37 = null;
        ds.Item[] itemArray38 = new ds.Item[] { item37 };
        fPHeapMax36.copia(itemArray38);
        fPHeapMax34.copia(itemArray38);
        fPHeapMax28.copia(itemArray38);
        fPHeapMax13.copia(itemArray38);
        fPHeapMax1.copia(itemArray38);
        ds.Item item44 = null;
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMax1.insere(item44);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertNull(item5);
        org.junit.Assert.assertNull(item8);
        org.junit.Assert.assertNull(item10);
        org.junit.Assert.assertNotNull(itemArray15);
        org.junit.Assert.assertNull(item17);
        org.junit.Assert.assertNull(item20);
        org.junit.Assert.assertNull(item22);
        org.junit.Assert.assertNotNull(itemArray30);
        org.junit.Assert.assertNull(item32);
        org.junit.Assert.assertNotNull(itemArray38);
    }

    @Test
    public void test427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test427");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (byte) 10);
        fPHeapMax1.constroi();
        fPHeapMax1.refaz((int) (short) 10, 0);
        fPHeapMax1.imprime();
        ds.FPHeapMax fPHeapMax8 = new ds.FPHeapMax((int) ' ');
        fPHeapMax8.imprime();
        ds.FPHeapMax fPHeapMax11 = new ds.FPHeapMax((int) (byte) 1);
        ds.Item item12 = null;
        ds.Item[] itemArray13 = new ds.Item[] { item12 };
        fPHeapMax11.copia(itemArray13);
        fPHeapMax11.constroi();
        ds.FPHeapMax fPHeapMax17 = new ds.FPHeapMax((int) ' ');
        fPHeapMax17.refaz((int) (short) 1, (int) (short) 1);
        ds.Item item21 = fPHeapMax17.max();
        ds.FPHeapMax fPHeapMax23 = new ds.FPHeapMax((int) (byte) 1);
        ds.Item item24 = null;
        ds.Item[] itemArray25 = new ds.Item[] { item24 };
        fPHeapMax23.copia(itemArray25);
        fPHeapMax17.copia(itemArray25);
        fPHeapMax17.constroi();
        ds.FPHeapMax fPHeapMax30 = new ds.FPHeapMax((int) (byte) 1);
        ds.Item item31 = null;
        ds.Item[] itemArray32 = new ds.Item[] { item31 };
        fPHeapMax30.copia(itemArray32);
        fPHeapMax17.copia(itemArray32);
        fPHeapMax11.copia(itemArray32);
        fPHeapMax8.copia(itemArray32);
        fPHeapMax1.copia(itemArray32);
        ds.Item item38 = fPHeapMax1.max();
        fPHeapMax1.constroi();
        org.junit.Assert.assertNotNull(itemArray13);
        org.junit.Assert.assertNull(item21);
        org.junit.Assert.assertNotNull(itemArray25);
        org.junit.Assert.assertNotNull(itemArray32);
        org.junit.Assert.assertNull(item38);
    }

    @Test
    public void test428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test428");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax(100);
        fPHeapMax1.refaz((int) 'a', 0);
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
    public void test429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test429");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (byte) 1);
        ds.Item item2 = null;
        ds.Item[] itemArray3 = new ds.Item[] { item2 };
        fPHeapMax1.copia(itemArray3);
        ds.Item item5 = fPHeapMax1.max();
        fPHeapMax1.constroi();
        fPHeapMax1.constroi();
        ds.Item item8 = fPHeapMax1.max();
        fPHeapMax1.constroi();
        ds.Item item10 = fPHeapMax1.max();
        ds.Item item11 = fPHeapMax1.max();
        fPHeapMax1.imprime();
        ds.Item item13 = fPHeapMax1.max();
        ds.FPHeapMax fPHeapMax15 = new ds.FPHeapMax((int) (short) 10);
        ds.FPHeapMax fPHeapMax17 = new ds.FPHeapMax((int) (byte) 1);
        ds.Item item18 = null;
        ds.Item[] itemArray19 = new ds.Item[] { item18 };
        fPHeapMax17.copia(itemArray19);
        ds.Item item21 = fPHeapMax17.max();
        fPHeapMax17.constroi();
        fPHeapMax17.constroi();
        ds.Item item24 = fPHeapMax17.max();
        fPHeapMax17.constroi();
        ds.Item item26 = fPHeapMax17.max();
        fPHeapMax17.constroi();
        fPHeapMax17.imprime();
        ds.FPHeapMax fPHeapMax30 = new ds.FPHeapMax((int) (byte) 1);
        ds.Item item31 = null;
        ds.Item[] itemArray32 = new ds.Item[] { item31 };
        fPHeapMax30.copia(itemArray32);
        fPHeapMax17.copia(itemArray32);
        fPHeapMax15.copia(itemArray32);
        fPHeapMax1.copia(itemArray32);
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertNull(item5);
        org.junit.Assert.assertNull(item8);
        org.junit.Assert.assertNull(item10);
        org.junit.Assert.assertNull(item11);
        org.junit.Assert.assertNull(item13);
        org.junit.Assert.assertNotNull(itemArray19);
        org.junit.Assert.assertNull(item21);
        org.junit.Assert.assertNull(item24);
        org.junit.Assert.assertNull(item26);
        org.junit.Assert.assertNotNull(itemArray32);
    }

    @Test
    public void test430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test430");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (short) 10);
        ds.FPHeapMax fPHeapMax3 = new ds.FPHeapMax((int) (byte) 1);
        ds.Item item4 = null;
        ds.Item[] itemArray5 = new ds.Item[] { item4 };
        fPHeapMax3.copia(itemArray5);
        ds.Item item7 = fPHeapMax3.max();
        fPHeapMax3.constroi();
        fPHeapMax3.constroi();
        ds.Item item10 = fPHeapMax3.max();
        fPHeapMax3.constroi();
        ds.Item item12 = fPHeapMax3.max();
        fPHeapMax3.constroi();
        fPHeapMax3.imprime();
        ds.FPHeapMax fPHeapMax16 = new ds.FPHeapMax((int) (byte) 1);
        ds.Item item17 = null;
        ds.Item[] itemArray18 = new ds.Item[] { item17 };
        fPHeapMax16.copia(itemArray18);
        fPHeapMax3.copia(itemArray18);
        fPHeapMax1.copia(itemArray18);
        java.lang.Class<?> wildcardClass22 = itemArray18.getClass();
        org.junit.Assert.assertNotNull(itemArray5);
        org.junit.Assert.assertNull(item7);
        org.junit.Assert.assertNull(item10);
        org.junit.Assert.assertNull(item12);
        org.junit.Assert.assertNotNull(itemArray18);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test431");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (short) 10);
        ds.FPHeapMax fPHeapMax3 = new ds.FPHeapMax((int) (byte) 1);
        ds.Item item4 = null;
        ds.Item[] itemArray5 = new ds.Item[] { item4 };
        fPHeapMax3.copia(itemArray5);
        ds.Item item7 = fPHeapMax3.max();
        fPHeapMax3.constroi();
        fPHeapMax3.constroi();
        ds.Item item10 = fPHeapMax3.max();
        fPHeapMax3.constroi();
        ds.Item item12 = fPHeapMax3.max();
        fPHeapMax3.constroi();
        fPHeapMax3.imprime();
        ds.FPHeapMax fPHeapMax16 = new ds.FPHeapMax((int) (byte) 1);
        ds.Item item17 = null;
        ds.Item[] itemArray18 = new ds.Item[] { item17 };
        fPHeapMax16.copia(itemArray18);
        fPHeapMax3.copia(itemArray18);
        fPHeapMax1.copia(itemArray18);
        ds.Item item22 = fPHeapMax1.max();
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMax1.refaz((int) '#', 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 35");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray5);
        org.junit.Assert.assertNull(item7);
        org.junit.Assert.assertNull(item10);
        org.junit.Assert.assertNull(item12);
        org.junit.Assert.assertNotNull(itemArray18);
        org.junit.Assert.assertNull(item22);
    }

    @Test
    public void test432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test432");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) 'a');
        ds.Item item2 = fPHeapMax1.max();
        ds.Item item3 = fPHeapMax1.max();
        org.junit.Assert.assertNull(item2);
        org.junit.Assert.assertNull(item3);
    }

    @Test
    public void test433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test433");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (byte) 1);
        ds.Item item2 = null;
        ds.Item[] itemArray3 = new ds.Item[] { item2 };
        fPHeapMax1.copia(itemArray3);
        ds.Item item5 = fPHeapMax1.max();
        fPHeapMax1.constroi();
        fPHeapMax1.imprime();
        fPHeapMax1.constroi();
        fPHeapMax1.constroi();
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMax1.refaz(100, (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 100");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertNull(item5);
    }

    @Test
    public void test434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test434");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (byte) 1);
        ds.Item item2 = null;
        ds.Item[] itemArray3 = new ds.Item[] { item2 };
        fPHeapMax1.copia(itemArray3);
        ds.Item item5 = fPHeapMax1.max();
        fPHeapMax1.constroi();
        fPHeapMax1.constroi();
        ds.Item item8 = fPHeapMax1.max();
        fPHeapMax1.constroi();
        fPHeapMax1.refaz(0, (int) (short) -1);
        ds.FPHeapMax fPHeapMax14 = new ds.FPHeapMax((int) (byte) 1);
        ds.Item item15 = null;
        ds.Item[] itemArray16 = new ds.Item[] { item15 };
        fPHeapMax14.copia(itemArray16);
        ds.Item item18 = fPHeapMax14.max();
        fPHeapMax14.constroi();
        fPHeapMax14.constroi();
        ds.Item item21 = fPHeapMax14.max();
        fPHeapMax14.constroi();
        ds.Item item23 = fPHeapMax14.max();
        fPHeapMax14.constroi();
        fPHeapMax14.refaz((int) (byte) 1, (int) (byte) -1);
        ds.FPHeapMax fPHeapMax29 = new ds.FPHeapMax((int) (byte) 1);
        ds.Item item30 = null;
        ds.Item[] itemArray31 = new ds.Item[] { item30 };
        fPHeapMax29.copia(itemArray31);
        ds.Item item33 = fPHeapMax29.max();
        fPHeapMax29.constroi();
        fPHeapMax29.constroi();
        ds.Item item36 = fPHeapMax29.max();
        fPHeapMax29.constroi();
        ds.Item item38 = fPHeapMax29.max();
        fPHeapMax29.constroi();
        fPHeapMax29.imprime();
        ds.Item item41 = null;
        ds.Item[] itemArray42 = new ds.Item[] { item41 };
        fPHeapMax29.copia(itemArray42);
        fPHeapMax14.copia(itemArray42);
        fPHeapMax1.copia(itemArray42);
        fPHeapMax1.constroi();
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertNull(item5);
        org.junit.Assert.assertNull(item8);
        org.junit.Assert.assertNotNull(itemArray16);
        org.junit.Assert.assertNull(item18);
        org.junit.Assert.assertNull(item21);
        org.junit.Assert.assertNull(item23);
        org.junit.Assert.assertNotNull(itemArray31);
        org.junit.Assert.assertNull(item33);
        org.junit.Assert.assertNull(item36);
        org.junit.Assert.assertNull(item38);
        org.junit.Assert.assertNotNull(itemArray42);
    }

    @Test
    public void test435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test435");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) 'a');
        ds.Item item2 = fPHeapMax1.max();
        ds.FPHeapMax fPHeapMax5 = new ds.FPHeapMax((int) (byte) 1);
        ds.Item item6 = null;
        ds.Item[] itemArray7 = new ds.Item[] { item6 };
        fPHeapMax5.copia(itemArray7);
        ds.Item item9 = fPHeapMax5.max();
        fPHeapMax5.constroi();
        fPHeapMax5.constroi();
        ds.Item item12 = fPHeapMax5.max();
        fPHeapMax5.constroi();
        ds.Item item14 = fPHeapMax5.max();
        fPHeapMax5.imprime();
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMax1.aumentaChave((int) 'a', (java.lang.Object) fPHeapMax5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(item2);
        org.junit.Assert.assertNotNull(itemArray7);
        org.junit.Assert.assertNull(item9);
        org.junit.Assert.assertNull(item12);
        org.junit.Assert.assertNull(item14);
    }

    @Test
    public void test436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test436");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (short) 1);
        ds.FPHeapMax fPHeapMax4 = new ds.FPHeapMax((int) (byte) 1);
        ds.Item item5 = null;
        ds.Item[] itemArray6 = new ds.Item[] { item5 };
        fPHeapMax4.copia(itemArray6);
        ds.Item item8 = fPHeapMax4.max();
        fPHeapMax4.constroi();
        fPHeapMax4.refaz((int) (byte) 1, (int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMax1.aumentaChave((int) '4', (java.lang.Object) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 52");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray6);
        org.junit.Assert.assertNull(item8);
    }

    @Test
    public void test437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test437");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (byte) 1);
        ds.Item item2 = null;
        ds.Item[] itemArray3 = new ds.Item[] { item2 };
        fPHeapMax1.copia(itemArray3);
        ds.Item item5 = fPHeapMax1.max();
        fPHeapMax1.constroi();
        fPHeapMax1.constroi();
        ds.Item item8 = fPHeapMax1.max();
        fPHeapMax1.constroi();
        ds.Item item10 = fPHeapMax1.max();
        fPHeapMax1.constroi();
        fPHeapMax1.imprime();
        ds.FPHeapMax fPHeapMax14 = new ds.FPHeapMax((int) (byte) 1);
        ds.Item item15 = null;
        ds.Item[] itemArray16 = new ds.Item[] { item15 };
        fPHeapMax14.copia(itemArray16);
        fPHeapMax1.copia(itemArray16);
        fPHeapMax1.constroi();
        fPHeapMax1.imprime();
        ds.FPHeapMax fPHeapMax22 = new ds.FPHeapMax((int) (byte) 1);
        ds.Item item23 = null;
        ds.Item[] itemArray24 = new ds.Item[] { item23 };
        fPHeapMax22.copia(itemArray24);
        fPHeapMax22.constroi();
        ds.FPHeapMax fPHeapMax28 = new ds.FPHeapMax((int) ' ');
        fPHeapMax28.refaz((int) (short) 1, (int) (short) 1);
        ds.Item item32 = fPHeapMax28.max();
        ds.FPHeapMax fPHeapMax34 = new ds.FPHeapMax((int) (byte) 1);
        ds.Item item35 = null;
        ds.Item[] itemArray36 = new ds.Item[] { item35 };
        fPHeapMax34.copia(itemArray36);
        fPHeapMax28.copia(itemArray36);
        fPHeapMax28.constroi();
        ds.FPHeapMax fPHeapMax41 = new ds.FPHeapMax((int) (byte) 1);
        ds.Item item42 = null;
        ds.Item[] itemArray43 = new ds.Item[] { item42 };
        fPHeapMax41.copia(itemArray43);
        fPHeapMax28.copia(itemArray43);
        fPHeapMax22.copia(itemArray43);
        fPHeapMax1.copia(itemArray43);
        // The following exception was thrown during execution in test generation
        try {
            ds.Item item48 = fPHeapMax1.retiraMax();
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: heap vazio");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertNull(item5);
        org.junit.Assert.assertNull(item8);
        org.junit.Assert.assertNull(item10);
        org.junit.Assert.assertNotNull(itemArray16);
        org.junit.Assert.assertNotNull(itemArray24);
        org.junit.Assert.assertNull(item32);
        org.junit.Assert.assertNotNull(itemArray36);
        org.junit.Assert.assertNotNull(itemArray43);
    }

    @Test
    public void test438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test438");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax(100);
        fPHeapMax1.constroi();
    }

    @Test
    public void test439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test439");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (byte) 10);
        fPHeapMax1.constroi();
        fPHeapMax1.imprime();
    }

    @Test
    public void test440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test440");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) ' ');
        fPHeapMax1.imprime();
        ds.FPHeapMax fPHeapMax4 = new ds.FPHeapMax((int) (byte) 1);
        ds.Item item5 = null;
        ds.Item[] itemArray6 = new ds.Item[] { item5 };
        fPHeapMax4.copia(itemArray6);
        ds.Item item8 = fPHeapMax4.max();
        fPHeapMax4.constroi();
        fPHeapMax4.constroi();
        ds.Item item11 = fPHeapMax4.max();
        fPHeapMax4.constroi();
        ds.Item item13 = fPHeapMax4.max();
        fPHeapMax4.imprime();
        ds.FPHeapMax fPHeapMax16 = new ds.FPHeapMax((int) (byte) 1);
        ds.Item item17 = null;
        ds.Item[] itemArray18 = new ds.Item[] { item17 };
        fPHeapMax16.copia(itemArray18);
        ds.Item item20 = fPHeapMax16.max();
        ds.FPHeapMax fPHeapMax22 = new ds.FPHeapMax((int) (byte) 1);
        ds.FPHeapMax fPHeapMax24 = new ds.FPHeapMax((int) (byte) 1);
        ds.Item item25 = null;
        ds.Item[] itemArray26 = new ds.Item[] { item25 };
        fPHeapMax24.copia(itemArray26);
        fPHeapMax22.copia(itemArray26);
        fPHeapMax16.copia(itemArray26);
        fPHeapMax4.copia(itemArray26);
        fPHeapMax1.copia(itemArray26);
        ds.FPHeapMax fPHeapMax33 = new ds.FPHeapMax(10);
        ds.FPHeapMax fPHeapMax35 = new ds.FPHeapMax((int) ' ');
        fPHeapMax35.imprime();
        ds.FPHeapMax fPHeapMax38 = new ds.FPHeapMax((int) (byte) 1);
        ds.FPHeapMax fPHeapMax40 = new ds.FPHeapMax((int) (byte) 1);
        ds.Item item41 = null;
        ds.Item[] itemArray42 = new ds.Item[] { item41 };
        fPHeapMax40.copia(itemArray42);
        fPHeapMax38.copia(itemArray42);
        fPHeapMax38.imprime();
        ds.FPHeapMax fPHeapMax47 = new ds.FPHeapMax((int) (byte) 1);
        ds.Item item48 = null;
        ds.Item[] itemArray49 = new ds.Item[] { item48 };
        fPHeapMax47.copia(itemArray49);
        ds.Item item51 = fPHeapMax47.max();
        ds.FPHeapMax fPHeapMax53 = new ds.FPHeapMax((int) (byte) 1);
        ds.FPHeapMax fPHeapMax55 = new ds.FPHeapMax((int) (byte) 1);
        ds.Item item56 = null;
        ds.Item[] itemArray57 = new ds.Item[] { item56 };
        fPHeapMax55.copia(itemArray57);
        fPHeapMax53.copia(itemArray57);
        fPHeapMax47.copia(itemArray57);
        fPHeapMax38.copia(itemArray57);
        fPHeapMax35.copia(itemArray57);
        fPHeapMax33.copia(itemArray57);
        fPHeapMax1.copia(itemArray57);
        ds.Item item65 = fPHeapMax1.max();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass66 = item65.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray6);
        org.junit.Assert.assertNull(item8);
        org.junit.Assert.assertNull(item11);
        org.junit.Assert.assertNull(item13);
        org.junit.Assert.assertNotNull(itemArray18);
        org.junit.Assert.assertNull(item20);
        org.junit.Assert.assertNotNull(itemArray26);
        org.junit.Assert.assertNotNull(itemArray42);
        org.junit.Assert.assertNotNull(itemArray49);
        org.junit.Assert.assertNull(item51);
        org.junit.Assert.assertNotNull(itemArray57);
        org.junit.Assert.assertNull(item65);
    }

    @Test
    public void test441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test441");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (byte) 1);
        ds.Item item2 = fPHeapMax1.max();
        fPHeapMax1.imprime();
        fPHeapMax1.constroi();
        fPHeapMax1.refaz((int) (byte) 1, 0);
        ds.FPHeapMax fPHeapMax9 = new ds.FPHeapMax(0);
        ds.FPHeapMax fPHeapMax11 = new ds.FPHeapMax((int) (byte) 1);
        ds.FPHeapMax fPHeapMax13 = new ds.FPHeapMax((int) (byte) 1);
        ds.Item item14 = null;
        ds.Item[] itemArray15 = new ds.Item[] { item14 };
        fPHeapMax13.copia(itemArray15);
        fPHeapMax11.copia(itemArray15);
        fPHeapMax9.copia(itemArray15);
        fPHeapMax1.copia(itemArray15);
        fPHeapMax1.imprime();
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMax1.refaz((int) (byte) 100, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 100");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(item2);
        org.junit.Assert.assertNotNull(itemArray15);
    }

    @Test
    public void test442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test442");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (short) 10);
        ds.FPHeapMax fPHeapMax3 = new ds.FPHeapMax((int) (byte) 1);
        ds.Item item4 = null;
        ds.Item[] itemArray5 = new ds.Item[] { item4 };
        fPHeapMax3.copia(itemArray5);
        ds.Item item7 = fPHeapMax3.max();
        fPHeapMax3.constroi();
        fPHeapMax3.constroi();
        ds.Item item10 = fPHeapMax3.max();
        fPHeapMax3.constroi();
        ds.Item item12 = fPHeapMax3.max();
        fPHeapMax3.constroi();
        fPHeapMax3.imprime();
        ds.FPHeapMax fPHeapMax16 = new ds.FPHeapMax((int) (byte) 1);
        ds.Item item17 = null;
        ds.Item[] itemArray18 = new ds.Item[] { item17 };
        fPHeapMax16.copia(itemArray18);
        fPHeapMax3.copia(itemArray18);
        fPHeapMax1.copia(itemArray18);
        ds.Item item22 = fPHeapMax1.max();
        // The following exception was thrown during execution in test generation
        try {
            ds.Item item23 = fPHeapMax1.retiraMax();
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: heap vazio");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray5);
        org.junit.Assert.assertNull(item7);
        org.junit.Assert.assertNull(item10);
        org.junit.Assert.assertNull(item12);
        org.junit.Assert.assertNotNull(itemArray18);
        org.junit.Assert.assertNull(item22);
    }

    @Test
    public void test443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test443");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax(0);
        fPHeapMax1.imprime();
        ds.FPHeapMax fPHeapMax4 = new ds.FPHeapMax((int) (short) 1);
        fPHeapMax4.imprime();
        fPHeapMax4.constroi();
        ds.FPHeapMax fPHeapMax8 = new ds.FPHeapMax((int) ' ');
        fPHeapMax8.imprime();
        ds.FPHeapMax fPHeapMax11 = new ds.FPHeapMax((int) (byte) 1);
        ds.Item item12 = null;
        ds.Item[] itemArray13 = new ds.Item[] { item12 };
        fPHeapMax11.copia(itemArray13);
        ds.Item item15 = fPHeapMax11.max();
        fPHeapMax11.constroi();
        fPHeapMax11.constroi();
        ds.Item item18 = fPHeapMax11.max();
        fPHeapMax11.constroi();
        ds.Item item20 = fPHeapMax11.max();
        fPHeapMax11.imprime();
        ds.FPHeapMax fPHeapMax23 = new ds.FPHeapMax((int) (byte) 1);
        ds.Item item24 = null;
        ds.Item[] itemArray25 = new ds.Item[] { item24 };
        fPHeapMax23.copia(itemArray25);
        ds.Item item27 = fPHeapMax23.max();
        ds.FPHeapMax fPHeapMax29 = new ds.FPHeapMax((int) (byte) 1);
        ds.FPHeapMax fPHeapMax31 = new ds.FPHeapMax((int) (byte) 1);
        ds.Item item32 = null;
        ds.Item[] itemArray33 = new ds.Item[] { item32 };
        fPHeapMax31.copia(itemArray33);
        fPHeapMax29.copia(itemArray33);
        fPHeapMax23.copia(itemArray33);
        fPHeapMax11.copia(itemArray33);
        fPHeapMax8.copia(itemArray33);
        ds.FPHeapMax fPHeapMax40 = new ds.FPHeapMax(10);
        ds.FPHeapMax fPHeapMax42 = new ds.FPHeapMax((int) ' ');
        fPHeapMax42.imprime();
        ds.FPHeapMax fPHeapMax45 = new ds.FPHeapMax((int) (byte) 1);
        ds.FPHeapMax fPHeapMax47 = new ds.FPHeapMax((int) (byte) 1);
        ds.Item item48 = null;
        ds.Item[] itemArray49 = new ds.Item[] { item48 };
        fPHeapMax47.copia(itemArray49);
        fPHeapMax45.copia(itemArray49);
        fPHeapMax45.imprime();
        ds.FPHeapMax fPHeapMax54 = new ds.FPHeapMax((int) (byte) 1);
        ds.Item item55 = null;
        ds.Item[] itemArray56 = new ds.Item[] { item55 };
        fPHeapMax54.copia(itemArray56);
        ds.Item item58 = fPHeapMax54.max();
        ds.FPHeapMax fPHeapMax60 = new ds.FPHeapMax((int) (byte) 1);
        ds.FPHeapMax fPHeapMax62 = new ds.FPHeapMax((int) (byte) 1);
        ds.Item item63 = null;
        ds.Item[] itemArray64 = new ds.Item[] { item63 };
        fPHeapMax62.copia(itemArray64);
        fPHeapMax60.copia(itemArray64);
        fPHeapMax54.copia(itemArray64);
        fPHeapMax45.copia(itemArray64);
        fPHeapMax42.copia(itemArray64);
        fPHeapMax40.copia(itemArray64);
        fPHeapMax8.copia(itemArray64);
        fPHeapMax4.copia(itemArray64);
        fPHeapMax1.copia(itemArray64);
        fPHeapMax1.constroi();
        // The following exception was thrown during execution in test generation
        try {
            ds.Item item75 = fPHeapMax1.retiraMax();
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: heap vazio");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray13);
        org.junit.Assert.assertNull(item15);
        org.junit.Assert.assertNull(item18);
        org.junit.Assert.assertNull(item20);
        org.junit.Assert.assertNotNull(itemArray25);
        org.junit.Assert.assertNull(item27);
        org.junit.Assert.assertNotNull(itemArray33);
        org.junit.Assert.assertNotNull(itemArray49);
        org.junit.Assert.assertNotNull(itemArray56);
        org.junit.Assert.assertNull(item58);
        org.junit.Assert.assertNotNull(itemArray64);
    }

    @Test
    public void test444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test444");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (byte) 1);
        ds.Item item2 = null;
        ds.Item[] itemArray3 = new ds.Item[] { item2 };
        fPHeapMax1.copia(itemArray3);
        ds.Item item5 = fPHeapMax1.max();
        fPHeapMax1.constroi();
        fPHeapMax1.constroi();
        ds.Item item8 = fPHeapMax1.max();
        fPHeapMax1.constroi();
        fPHeapMax1.imprime();
        ds.Item item11 = fPHeapMax1.max();
        ds.FPHeapMax fPHeapMax13 = new ds.FPHeapMax((int) ' ');
        fPHeapMax13.refaz((int) (short) 1, (int) (short) 1);
        ds.Item item17 = fPHeapMax13.max();
        ds.FPHeapMax fPHeapMax19 = new ds.FPHeapMax((int) (byte) 1);
        ds.Item item20 = null;
        ds.Item[] itemArray21 = new ds.Item[] { item20 };
        fPHeapMax19.copia(itemArray21);
        fPHeapMax13.copia(itemArray21);
        fPHeapMax13.constroi();
        ds.FPHeapMax fPHeapMax26 = new ds.FPHeapMax((int) (short) 1);
        ds.FPHeapMax fPHeapMax28 = new ds.FPHeapMax(0);
        ds.FPHeapMax fPHeapMax30 = new ds.FPHeapMax((int) (byte) 1);
        ds.FPHeapMax fPHeapMax32 = new ds.FPHeapMax((int) (byte) 1);
        ds.Item item33 = null;
        ds.Item[] itemArray34 = new ds.Item[] { item33 };
        fPHeapMax32.copia(itemArray34);
        fPHeapMax30.copia(itemArray34);
        fPHeapMax28.copia(itemArray34);
        fPHeapMax26.copia(itemArray34);
        fPHeapMax26.imprime();
        ds.FPHeapMax fPHeapMax41 = new ds.FPHeapMax((int) ' ');
        fPHeapMax41.refaz((int) (short) 1, (int) (short) 1);
        ds.Item item45 = fPHeapMax41.max();
        ds.FPHeapMax fPHeapMax47 = new ds.FPHeapMax((int) (byte) 1);
        ds.Item item48 = null;
        ds.Item[] itemArray49 = new ds.Item[] { item48 };
        fPHeapMax47.copia(itemArray49);
        fPHeapMax41.copia(itemArray49);
        fPHeapMax26.copia(itemArray49);
        ds.FPHeapMax fPHeapMax54 = new ds.FPHeapMax((int) (byte) 1);
        ds.Item item55 = null;
        ds.Item[] itemArray56 = new ds.Item[] { item55 };
        fPHeapMax54.copia(itemArray56);
        ds.Item item58 = fPHeapMax54.max();
        fPHeapMax54.constroi();
        fPHeapMax54.constroi();
        ds.Item item61 = fPHeapMax54.max();
        fPHeapMax54.constroi();
        ds.Item item63 = fPHeapMax54.max();
        fPHeapMax54.imprime();
        ds.FPHeapMax fPHeapMax66 = new ds.FPHeapMax((int) (byte) 1);
        ds.Item item67 = null;
        ds.Item[] itemArray68 = new ds.Item[] { item67 };
        fPHeapMax66.copia(itemArray68);
        ds.Item item70 = fPHeapMax66.max();
        ds.FPHeapMax fPHeapMax72 = new ds.FPHeapMax((int) (byte) 1);
        ds.FPHeapMax fPHeapMax74 = new ds.FPHeapMax((int) (byte) 1);
        ds.Item item75 = null;
        ds.Item[] itemArray76 = new ds.Item[] { item75 };
        fPHeapMax74.copia(itemArray76);
        fPHeapMax72.copia(itemArray76);
        fPHeapMax66.copia(itemArray76);
        fPHeapMax54.copia(itemArray76);
        fPHeapMax26.copia(itemArray76);
        fPHeapMax13.copia(itemArray76);
        fPHeapMax1.copia(itemArray76);
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertNull(item5);
        org.junit.Assert.assertNull(item8);
        org.junit.Assert.assertNull(item11);
        org.junit.Assert.assertNull(item17);
        org.junit.Assert.assertNotNull(itemArray21);
        org.junit.Assert.assertNotNull(itemArray34);
        org.junit.Assert.assertNull(item45);
        org.junit.Assert.assertNotNull(itemArray49);
        org.junit.Assert.assertNotNull(itemArray56);
        org.junit.Assert.assertNull(item58);
        org.junit.Assert.assertNull(item61);
        org.junit.Assert.assertNull(item63);
        org.junit.Assert.assertNotNull(itemArray68);
        org.junit.Assert.assertNull(item70);
        org.junit.Assert.assertNotNull(itemArray76);
    }

    @Test
    public void test445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test445");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (byte) 100);
        fPHeapMax1.constroi();
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMax1.refaz((int) (short) -1, (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test446");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (short) 1);
        ds.FPHeapMax fPHeapMax3 = new ds.FPHeapMax(0);
        ds.FPHeapMax fPHeapMax5 = new ds.FPHeapMax((int) (byte) 1);
        ds.FPHeapMax fPHeapMax7 = new ds.FPHeapMax((int) (byte) 1);
        ds.Item item8 = null;
        ds.Item[] itemArray9 = new ds.Item[] { item8 };
        fPHeapMax7.copia(itemArray9);
        fPHeapMax5.copia(itemArray9);
        fPHeapMax3.copia(itemArray9);
        fPHeapMax1.copia(itemArray9);
        fPHeapMax1.imprime();
        ds.FPHeapMax fPHeapMax16 = new ds.FPHeapMax((int) ' ');
        fPHeapMax16.refaz((int) (short) 1, (int) (short) 1);
        ds.Item item20 = fPHeapMax16.max();
        ds.FPHeapMax fPHeapMax22 = new ds.FPHeapMax((int) (byte) 1);
        ds.Item item23 = null;
        ds.Item[] itemArray24 = new ds.Item[] { item23 };
        fPHeapMax22.copia(itemArray24);
        fPHeapMax16.copia(itemArray24);
        fPHeapMax1.copia(itemArray24);
        ds.FPHeapMax fPHeapMax29 = new ds.FPHeapMax(100);
        fPHeapMax29.refaz((int) 'a', 0);
        ds.FPHeapMax fPHeapMax34 = new ds.FPHeapMax((int) (short) 1);
        ds.FPHeapMax fPHeapMax36 = new ds.FPHeapMax(0);
        ds.FPHeapMax fPHeapMax38 = new ds.FPHeapMax((int) (byte) 1);
        ds.FPHeapMax fPHeapMax40 = new ds.FPHeapMax((int) (byte) 1);
        ds.Item item41 = null;
        ds.Item[] itemArray42 = new ds.Item[] { item41 };
        fPHeapMax40.copia(itemArray42);
        fPHeapMax38.copia(itemArray42);
        fPHeapMax36.copia(itemArray42);
        fPHeapMax34.copia(itemArray42);
        fPHeapMax29.copia(itemArray42);
        fPHeapMax1.copia(itemArray42);
        org.junit.Assert.assertNotNull(itemArray9);
        org.junit.Assert.assertNull(item20);
        org.junit.Assert.assertNotNull(itemArray24);
        org.junit.Assert.assertNotNull(itemArray42);
    }

    @Test
    public void test447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test447");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (byte) 1);
        ds.Item item2 = null;
        ds.Item[] itemArray3 = new ds.Item[] { item2 };
        fPHeapMax1.copia(itemArray3);
        ds.Item item5 = fPHeapMax1.max();
        fPHeapMax1.constroi();
        fPHeapMax1.constroi();
        ds.Item item8 = fPHeapMax1.max();
        fPHeapMax1.constroi();
        ds.Item item10 = fPHeapMax1.max();
        ds.Item item11 = fPHeapMax1.max();
        fPHeapMax1.constroi();
        ds.Item item13 = fPHeapMax1.max();
        ds.Item item14 = null;
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMax1.insere(item14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertNull(item5);
        org.junit.Assert.assertNull(item8);
        org.junit.Assert.assertNull(item10);
        org.junit.Assert.assertNull(item11);
        org.junit.Assert.assertNull(item13);
    }

    @Test
    public void test448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test448");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (byte) 1);
        ds.Item item2 = null;
        ds.Item[] itemArray3 = new ds.Item[] { item2 };
        fPHeapMax1.copia(itemArray3);
        ds.Item item5 = fPHeapMax1.max();
        fPHeapMax1.constroi();
        fPHeapMax1.refaz((int) (byte) 1, (int) (short) 0);
        fPHeapMax1.constroi();
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertNull(item5);
    }

    @Test
    public void test449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test449");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (byte) 1);
        ds.Item item2 = null;
        ds.Item[] itemArray3 = new ds.Item[] { item2 };
        fPHeapMax1.copia(itemArray3);
        ds.Item item5 = fPHeapMax1.max();
        fPHeapMax1.constroi();
        fPHeapMax1.constroi();
        ds.Item item8 = fPHeapMax1.max();
        fPHeapMax1.constroi();
        ds.Item item10 = fPHeapMax1.max();
        ds.FPHeapMax fPHeapMax12 = new ds.FPHeapMax((int) (byte) 1);
        ds.Item item13 = null;
        ds.Item[] itemArray14 = new ds.Item[] { item13 };
        fPHeapMax12.copia(itemArray14);
        ds.Item item16 = fPHeapMax12.max();
        ds.FPHeapMax fPHeapMax18 = new ds.FPHeapMax((int) (byte) 1);
        ds.FPHeapMax fPHeapMax20 = new ds.FPHeapMax((int) (byte) 1);
        ds.Item item21 = null;
        ds.Item[] itemArray22 = new ds.Item[] { item21 };
        fPHeapMax20.copia(itemArray22);
        fPHeapMax18.copia(itemArray22);
        fPHeapMax12.copia(itemArray22);
        fPHeapMax1.copia(itemArray22);
        fPHeapMax1.imprime();
        ds.Item item28 = fPHeapMax1.max();
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertNull(item5);
        org.junit.Assert.assertNull(item8);
        org.junit.Assert.assertNull(item10);
        org.junit.Assert.assertNotNull(itemArray14);
        org.junit.Assert.assertNull(item16);
        org.junit.Assert.assertNotNull(itemArray22);
        org.junit.Assert.assertNull(item28);
    }

    @Test
    public void test450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test450");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) ' ');
        fPHeapMax1.refaz((int) (short) 1, (int) (short) 1);
        ds.Item item5 = fPHeapMax1.max();
        ds.FPHeapMax fPHeapMax7 = new ds.FPHeapMax((int) (byte) 1);
        ds.Item item8 = null;
        ds.Item[] itemArray9 = new ds.Item[] { item8 };
        fPHeapMax7.copia(itemArray9);
        fPHeapMax1.copia(itemArray9);
        fPHeapMax1.constroi();
        ds.FPHeapMax fPHeapMax14 = new ds.FPHeapMax((int) (byte) 1);
        ds.Item item15 = null;
        ds.Item[] itemArray16 = new ds.Item[] { item15 };
        fPHeapMax14.copia(itemArray16);
        fPHeapMax1.copia(itemArray16);
        ds.Item item19 = fPHeapMax1.max();
        org.junit.Assert.assertNull(item5);
        org.junit.Assert.assertNotNull(itemArray9);
        org.junit.Assert.assertNotNull(itemArray16);
        org.junit.Assert.assertNull(item19);
    }

    @Test
    public void test451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test451");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (byte) 1);
        ds.Item item2 = null;
        ds.Item[] itemArray3 = new ds.Item[] { item2 };
        fPHeapMax1.copia(itemArray3);
        ds.Item item5 = fPHeapMax1.max();
        fPHeapMax1.constroi();
        fPHeapMax1.constroi();
        ds.Item item8 = fPHeapMax1.max();
        fPHeapMax1.constroi();
        ds.Item item10 = fPHeapMax1.max();
        fPHeapMax1.imprime();
        ds.FPHeapMax fPHeapMax13 = new ds.FPHeapMax((int) (byte) 1);
        ds.Item item14 = null;
        ds.Item[] itemArray15 = new ds.Item[] { item14 };
        fPHeapMax13.copia(itemArray15);
        ds.Item item17 = fPHeapMax13.max();
        ds.FPHeapMax fPHeapMax19 = new ds.FPHeapMax((int) (byte) 1);
        ds.FPHeapMax fPHeapMax21 = new ds.FPHeapMax((int) (byte) 1);
        ds.Item item22 = null;
        ds.Item[] itemArray23 = new ds.Item[] { item22 };
        fPHeapMax21.copia(itemArray23);
        fPHeapMax19.copia(itemArray23);
        fPHeapMax13.copia(itemArray23);
        fPHeapMax1.copia(itemArray23);
        ds.Item item28 = fPHeapMax1.max();
        // The following exception was thrown during execution in test generation
        try {
            ds.Item item29 = fPHeapMax1.retiraMax();
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: heap vazio");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertNull(item5);
        org.junit.Assert.assertNull(item8);
        org.junit.Assert.assertNull(item10);
        org.junit.Assert.assertNotNull(itemArray15);
        org.junit.Assert.assertNull(item17);
        org.junit.Assert.assertNotNull(itemArray23);
        org.junit.Assert.assertNull(item28);
    }

    @Test
    public void test452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test452");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax(0);
        fPHeapMax1.constroi();
        ds.FPHeapMax fPHeapMax4 = new ds.FPHeapMax((int) (byte) 1);
        ds.Item item5 = null;
        ds.Item[] itemArray6 = new ds.Item[] { item5 };
        fPHeapMax4.copia(itemArray6);
        ds.Item item8 = fPHeapMax4.max();
        fPHeapMax4.constroi();
        fPHeapMax4.constroi();
        ds.Item item11 = fPHeapMax4.max();
        fPHeapMax4.constroi();
        fPHeapMax4.constroi();
        ds.FPHeapMax fPHeapMax15 = new ds.FPHeapMax((int) (byte) 1);
        ds.FPHeapMax fPHeapMax17 = new ds.FPHeapMax((int) (byte) 1);
        ds.Item item18 = null;
        ds.Item[] itemArray19 = new ds.Item[] { item18 };
        fPHeapMax17.copia(itemArray19);
        fPHeapMax15.copia(itemArray19);
        fPHeapMax15.imprime();
        ds.FPHeapMax fPHeapMax24 = new ds.FPHeapMax((int) (byte) 1);
        ds.Item item25 = null;
        ds.Item[] itemArray26 = new ds.Item[] { item25 };
        fPHeapMax24.copia(itemArray26);
        ds.Item item28 = fPHeapMax24.max();
        ds.FPHeapMax fPHeapMax30 = new ds.FPHeapMax((int) (byte) 1);
        ds.FPHeapMax fPHeapMax32 = new ds.FPHeapMax((int) (byte) 1);
        ds.Item item33 = null;
        ds.Item[] itemArray34 = new ds.Item[] { item33 };
        fPHeapMax32.copia(itemArray34);
        fPHeapMax30.copia(itemArray34);
        fPHeapMax24.copia(itemArray34);
        fPHeapMax15.copia(itemArray34);
        fPHeapMax4.copia(itemArray34);
        ds.Item item40 = fPHeapMax4.max();
        ds.FPHeapMax fPHeapMax42 = new ds.FPHeapMax((int) (short) 1);
        fPHeapMax42.imprime();
        ds.FPHeapMax fPHeapMax45 = new ds.FPHeapMax((int) (short) 1);
        ds.FPHeapMax fPHeapMax47 = new ds.FPHeapMax(0);
        ds.FPHeapMax fPHeapMax49 = new ds.FPHeapMax((int) (byte) 1);
        ds.FPHeapMax fPHeapMax51 = new ds.FPHeapMax((int) (byte) 1);
        ds.Item item52 = null;
        ds.Item[] itemArray53 = new ds.Item[] { item52 };
        fPHeapMax51.copia(itemArray53);
        fPHeapMax49.copia(itemArray53);
        fPHeapMax47.copia(itemArray53);
        fPHeapMax45.copia(itemArray53);
        fPHeapMax42.copia(itemArray53);
        fPHeapMax4.copia(itemArray53);
        fPHeapMax1.copia(itemArray53);
        ds.Item item61 = null;
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMax1.insere(item61);
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: heap cheio");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray6);
        org.junit.Assert.assertNull(item8);
        org.junit.Assert.assertNull(item11);
        org.junit.Assert.assertNotNull(itemArray19);
        org.junit.Assert.assertNotNull(itemArray26);
        org.junit.Assert.assertNull(item28);
        org.junit.Assert.assertNotNull(itemArray34);
        org.junit.Assert.assertNull(item40);
        org.junit.Assert.assertNotNull(itemArray53);
    }

    @Test
    public void test453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test453");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) ' ');
        fPHeapMax1.imprime();
        ds.FPHeapMax fPHeapMax4 = new ds.FPHeapMax((int) (byte) 1);
        ds.FPHeapMax fPHeapMax6 = new ds.FPHeapMax((int) (byte) 1);
        ds.Item item7 = null;
        ds.Item[] itemArray8 = new ds.Item[] { item7 };
        fPHeapMax6.copia(itemArray8);
        fPHeapMax4.copia(itemArray8);
        fPHeapMax4.imprime();
        ds.FPHeapMax fPHeapMax13 = new ds.FPHeapMax((int) (byte) 1);
        ds.Item item14 = null;
        ds.Item[] itemArray15 = new ds.Item[] { item14 };
        fPHeapMax13.copia(itemArray15);
        ds.Item item17 = fPHeapMax13.max();
        ds.FPHeapMax fPHeapMax19 = new ds.FPHeapMax((int) (byte) 1);
        ds.FPHeapMax fPHeapMax21 = new ds.FPHeapMax((int) (byte) 1);
        ds.Item item22 = null;
        ds.Item[] itemArray23 = new ds.Item[] { item22 };
        fPHeapMax21.copia(itemArray23);
        fPHeapMax19.copia(itemArray23);
        fPHeapMax13.copia(itemArray23);
        fPHeapMax4.copia(itemArray23);
        fPHeapMax1.copia(itemArray23);
        ds.FPHeapMax fPHeapMax30 = new ds.FPHeapMax((int) (byte) 1);
        ds.Item item31 = null;
        ds.Item[] itemArray32 = new ds.Item[] { item31 };
        fPHeapMax30.copia(itemArray32);
        ds.Item item34 = fPHeapMax30.max();
        fPHeapMax30.constroi();
        fPHeapMax30.constroi();
        ds.Item item37 = fPHeapMax30.max();
        fPHeapMax30.constroi();
        ds.Item item39 = fPHeapMax30.max();
        ds.Item item40 = fPHeapMax30.max();
        ds.Item item41 = fPHeapMax30.max();
        fPHeapMax30.imprime();
        ds.FPHeapMax fPHeapMax44 = new ds.FPHeapMax((int) (byte) 1);
        ds.Item item45 = fPHeapMax44.max();
        fPHeapMax44.imprime();
        fPHeapMax44.constroi();
        fPHeapMax44.refaz((int) (byte) 1, 0);
        ds.FPHeapMax fPHeapMax52 = new ds.FPHeapMax(0);
        ds.FPHeapMax fPHeapMax54 = new ds.FPHeapMax((int) (byte) 1);
        ds.FPHeapMax fPHeapMax56 = new ds.FPHeapMax((int) (byte) 1);
        ds.Item item57 = null;
        ds.Item[] itemArray58 = new ds.Item[] { item57 };
        fPHeapMax56.copia(itemArray58);
        fPHeapMax54.copia(itemArray58);
        fPHeapMax52.copia(itemArray58);
        fPHeapMax44.copia(itemArray58);
        fPHeapMax30.copia(itemArray58);
        fPHeapMax1.copia(itemArray58);
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMax1.refaz((int) '#', 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 35");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray8);
        org.junit.Assert.assertNotNull(itemArray15);
        org.junit.Assert.assertNull(item17);
        org.junit.Assert.assertNotNull(itemArray23);
        org.junit.Assert.assertNotNull(itemArray32);
        org.junit.Assert.assertNull(item34);
        org.junit.Assert.assertNull(item37);
        org.junit.Assert.assertNull(item39);
        org.junit.Assert.assertNull(item40);
        org.junit.Assert.assertNull(item41);
        org.junit.Assert.assertNull(item45);
        org.junit.Assert.assertNotNull(itemArray58);
    }

    @Test
    public void test454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test454");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (byte) 1);
        ds.Item item2 = null;
        ds.Item[] itemArray3 = new ds.Item[] { item2 };
        fPHeapMax1.copia(itemArray3);
        ds.Item item5 = fPHeapMax1.max();
        fPHeapMax1.imprime();
        ds.FPHeapMax fPHeapMax8 = new ds.FPHeapMax((int) ' ');
        fPHeapMax8.refaz((int) (short) 1, (int) (short) 1);
        ds.Item item12 = fPHeapMax8.max();
        ds.FPHeapMax fPHeapMax14 = new ds.FPHeapMax((int) (byte) 1);
        ds.Item item15 = null;
        ds.Item[] itemArray16 = new ds.Item[] { item15 };
        fPHeapMax14.copia(itemArray16);
        fPHeapMax8.copia(itemArray16);
        fPHeapMax8.constroi();
        ds.FPHeapMax fPHeapMax21 = new ds.FPHeapMax((int) (byte) 1);
        ds.Item item22 = null;
        ds.Item[] itemArray23 = new ds.Item[] { item22 };
        fPHeapMax21.copia(itemArray23);
        fPHeapMax8.copia(itemArray23);
        fPHeapMax1.copia(itemArray23);
        fPHeapMax1.imprime();
        ds.Item item28 = fPHeapMax1.max();
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertNull(item5);
        org.junit.Assert.assertNull(item12);
        org.junit.Assert.assertNotNull(itemArray16);
        org.junit.Assert.assertNotNull(itemArray23);
        org.junit.Assert.assertNull(item28);
    }

    @Test
    public void test455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test455");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (byte) 1);
        ds.Item item2 = null;
        ds.Item[] itemArray3 = new ds.Item[] { item2 };
        fPHeapMax1.copia(itemArray3);
        fPHeapMax1.imprime();
        ds.FPHeapMax fPHeapMax7 = new ds.FPHeapMax((int) (short) -1);
        ds.FPHeapMax fPHeapMax9 = new ds.FPHeapMax((int) (byte) 1);
        ds.Item item10 = null;
        ds.Item[] itemArray11 = new ds.Item[] { item10 };
        fPHeapMax9.copia(itemArray11);
        ds.Item item13 = fPHeapMax9.max();
        fPHeapMax9.constroi();
        fPHeapMax9.constroi();
        ds.Item item16 = fPHeapMax9.max();
        fPHeapMax9.constroi();
        fPHeapMax9.refaz(0, (int) (short) -1);
        fPHeapMax9.constroi();
        ds.FPHeapMax fPHeapMax23 = new ds.FPHeapMax((int) (short) 1);
        ds.FPHeapMax fPHeapMax25 = new ds.FPHeapMax(0);
        ds.FPHeapMax fPHeapMax27 = new ds.FPHeapMax((int) (byte) 1);
        ds.FPHeapMax fPHeapMax29 = new ds.FPHeapMax((int) (byte) 1);
        ds.Item item30 = null;
        ds.Item[] itemArray31 = new ds.Item[] { item30 };
        fPHeapMax29.copia(itemArray31);
        fPHeapMax27.copia(itemArray31);
        fPHeapMax25.copia(itemArray31);
        fPHeapMax23.copia(itemArray31);
        fPHeapMax23.imprime();
        ds.FPHeapMax fPHeapMax38 = new ds.FPHeapMax((int) ' ');
        fPHeapMax38.refaz((int) (short) 1, (int) (short) 1);
        ds.Item item42 = fPHeapMax38.max();
        ds.FPHeapMax fPHeapMax44 = new ds.FPHeapMax((int) (byte) 1);
        ds.Item item45 = null;
        ds.Item[] itemArray46 = new ds.Item[] { item45 };
        fPHeapMax44.copia(itemArray46);
        fPHeapMax38.copia(itemArray46);
        fPHeapMax23.copia(itemArray46);
        fPHeapMax9.copia(itemArray46);
        fPHeapMax7.copia(itemArray46);
        fPHeapMax1.copia(itemArray46);
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertNotNull(itemArray11);
        org.junit.Assert.assertNull(item13);
        org.junit.Assert.assertNull(item16);
        org.junit.Assert.assertNotNull(itemArray31);
        org.junit.Assert.assertNull(item42);
        org.junit.Assert.assertNotNull(itemArray46);
    }

    @Test
    public void test456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test456");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (short) 1);
        ds.FPHeapMax fPHeapMax3 = new ds.FPHeapMax(0);
        ds.FPHeapMax fPHeapMax5 = new ds.FPHeapMax((int) (byte) 1);
        ds.FPHeapMax fPHeapMax7 = new ds.FPHeapMax((int) (byte) 1);
        ds.Item item8 = null;
        ds.Item[] itemArray9 = new ds.Item[] { item8 };
        fPHeapMax7.copia(itemArray9);
        fPHeapMax5.copia(itemArray9);
        fPHeapMax3.copia(itemArray9);
        fPHeapMax1.copia(itemArray9);
        fPHeapMax1.imprime();
        ds.FPHeapMax fPHeapMax16 = new ds.FPHeapMax((int) ' ');
        fPHeapMax16.refaz((int) (short) 1, (int) (short) 1);
        ds.Item item20 = fPHeapMax16.max();
        ds.FPHeapMax fPHeapMax22 = new ds.FPHeapMax((int) (byte) 1);
        ds.Item item23 = null;
        ds.Item[] itemArray24 = new ds.Item[] { item23 };
        fPHeapMax22.copia(itemArray24);
        fPHeapMax16.copia(itemArray24);
        fPHeapMax1.copia(itemArray24);
        ds.FPHeapMax fPHeapMax29 = new ds.FPHeapMax((int) (byte) 1);
        ds.Item item30 = null;
        ds.Item[] itemArray31 = new ds.Item[] { item30 };
        fPHeapMax29.copia(itemArray31);
        ds.Item item33 = fPHeapMax29.max();
        fPHeapMax29.constroi();
        fPHeapMax29.constroi();
        ds.Item item36 = fPHeapMax29.max();
        fPHeapMax29.constroi();
        ds.Item item38 = fPHeapMax29.max();
        fPHeapMax29.imprime();
        ds.FPHeapMax fPHeapMax41 = new ds.FPHeapMax((int) (byte) 1);
        ds.Item item42 = null;
        ds.Item[] itemArray43 = new ds.Item[] { item42 };
        fPHeapMax41.copia(itemArray43);
        ds.Item item45 = fPHeapMax41.max();
        ds.FPHeapMax fPHeapMax47 = new ds.FPHeapMax((int) (byte) 1);
        ds.FPHeapMax fPHeapMax49 = new ds.FPHeapMax((int) (byte) 1);
        ds.Item item50 = null;
        ds.Item[] itemArray51 = new ds.Item[] { item50 };
        fPHeapMax49.copia(itemArray51);
        fPHeapMax47.copia(itemArray51);
        fPHeapMax41.copia(itemArray51);
        fPHeapMax29.copia(itemArray51);
        fPHeapMax1.copia(itemArray51);
        ds.FPHeapMax fPHeapMax58 = new ds.FPHeapMax((int) (byte) 1);
        ds.Item item59 = fPHeapMax58.max();
        fPHeapMax58.imprime();
        fPHeapMax58.constroi();
        fPHeapMax58.refaz((int) (byte) 1, 0);
        ds.FPHeapMax fPHeapMax66 = new ds.FPHeapMax((int) (short) 1);
        ds.FPHeapMax fPHeapMax68 = new ds.FPHeapMax(0);
        ds.FPHeapMax fPHeapMax70 = new ds.FPHeapMax((int) (byte) 1);
        ds.FPHeapMax fPHeapMax72 = new ds.FPHeapMax((int) (byte) 1);
        ds.Item item73 = null;
        ds.Item[] itemArray74 = new ds.Item[] { item73 };
        fPHeapMax72.copia(itemArray74);
        fPHeapMax70.copia(itemArray74);
        fPHeapMax68.copia(itemArray74);
        fPHeapMax66.copia(itemArray74);
        fPHeapMax66.imprime();
        ds.FPHeapMax fPHeapMax81 = new ds.FPHeapMax((int) ' ');
        fPHeapMax81.refaz((int) (short) 1, (int) (short) 1);
        ds.Item item85 = fPHeapMax81.max();
        ds.FPHeapMax fPHeapMax87 = new ds.FPHeapMax((int) (byte) 1);
        ds.Item item88 = null;
        ds.Item[] itemArray89 = new ds.Item[] { item88 };
        fPHeapMax87.copia(itemArray89);
        fPHeapMax81.copia(itemArray89);
        fPHeapMax66.copia(itemArray89);
        fPHeapMax58.copia(itemArray89);
        fPHeapMax1.copia(itemArray89);
        java.lang.Class<?> wildcardClass95 = itemArray89.getClass();
        org.junit.Assert.assertNotNull(itemArray9);
        org.junit.Assert.assertNull(item20);
        org.junit.Assert.assertNotNull(itemArray24);
        org.junit.Assert.assertNotNull(itemArray31);
        org.junit.Assert.assertNull(item33);
        org.junit.Assert.assertNull(item36);
        org.junit.Assert.assertNull(item38);
        org.junit.Assert.assertNotNull(itemArray43);
        org.junit.Assert.assertNull(item45);
        org.junit.Assert.assertNotNull(itemArray51);
        org.junit.Assert.assertNull(item59);
        org.junit.Assert.assertNotNull(itemArray74);
        org.junit.Assert.assertNull(item85);
        org.junit.Assert.assertNotNull(itemArray89);
        org.junit.Assert.assertNotNull(wildcardClass95);
    }

    @Test
    public void test457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test457");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) ' ');
        fPHeapMax1.refaz((int) (short) 1, (int) (short) 1);
        fPHeapMax1.imprime();
        fPHeapMax1.imprime();
    }

    @Test
    public void test458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test458");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (byte) 1);
        ds.Item item2 = null;
        ds.Item[] itemArray3 = new ds.Item[] { item2 };
        fPHeapMax1.copia(itemArray3);
        ds.Item item5 = fPHeapMax1.max();
        fPHeapMax1.constroi();
        fPHeapMax1.constroi();
        ds.Item item8 = fPHeapMax1.max();
        fPHeapMax1.constroi();
        ds.Item item10 = fPHeapMax1.max();
        ds.FPHeapMax fPHeapMax12 = new ds.FPHeapMax((int) ' ');
        fPHeapMax12.refaz((int) (short) 1, (int) (short) 1);
        ds.Item item16 = fPHeapMax12.max();
        ds.FPHeapMax fPHeapMax18 = new ds.FPHeapMax((int) (byte) 1);
        ds.Item item19 = null;
        ds.Item[] itemArray20 = new ds.Item[] { item19 };
        fPHeapMax18.copia(itemArray20);
        fPHeapMax12.copia(itemArray20);
        fPHeapMax12.constroi();
        ds.FPHeapMax fPHeapMax25 = new ds.FPHeapMax((int) (byte) 1);
        ds.Item item26 = null;
        ds.Item[] itemArray27 = new ds.Item[] { item26 };
        fPHeapMax25.copia(itemArray27);
        fPHeapMax12.copia(itemArray27);
        fPHeapMax1.copia(itemArray27);
        fPHeapMax1.constroi();
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertNull(item5);
        org.junit.Assert.assertNull(item8);
        org.junit.Assert.assertNull(item10);
        org.junit.Assert.assertNull(item16);
        org.junit.Assert.assertNotNull(itemArray20);
        org.junit.Assert.assertNotNull(itemArray27);
    }

    @Test
    public void test459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test459");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (byte) 1);
        ds.Item item2 = null;
        ds.Item[] itemArray3 = new ds.Item[] { item2 };
        fPHeapMax1.copia(itemArray3);
        ds.Item item5 = fPHeapMax1.max();
        fPHeapMax1.constroi();
        fPHeapMax1.constroi();
        ds.Item item8 = fPHeapMax1.max();
        fPHeapMax1.constroi();
        ds.Item item10 = fPHeapMax1.max();
        ds.Item item11 = fPHeapMax1.max();
        ds.Item item12 = fPHeapMax1.max();
        fPHeapMax1.imprime();
        ds.FPHeapMax fPHeapMax15 = new ds.FPHeapMax((int) (byte) 1);
        ds.Item item16 = fPHeapMax15.max();
        fPHeapMax15.imprime();
        fPHeapMax15.constroi();
        fPHeapMax15.refaz((int) (byte) 1, 0);
        ds.FPHeapMax fPHeapMax23 = new ds.FPHeapMax(0);
        ds.FPHeapMax fPHeapMax25 = new ds.FPHeapMax((int) (byte) 1);
        ds.FPHeapMax fPHeapMax27 = new ds.FPHeapMax((int) (byte) 1);
        ds.Item item28 = null;
        ds.Item[] itemArray29 = new ds.Item[] { item28 };
        fPHeapMax27.copia(itemArray29);
        fPHeapMax25.copia(itemArray29);
        fPHeapMax23.copia(itemArray29);
        fPHeapMax15.copia(itemArray29);
        fPHeapMax1.copia(itemArray29);
        ds.FPHeapMax fPHeapMax36 = new ds.FPHeapMax((int) (byte) 1);
        ds.Item item37 = fPHeapMax36.max();
        fPHeapMax36.imprime();
        fPHeapMax36.constroi();
        fPHeapMax36.refaz((int) (byte) 1, 0);
        ds.FPHeapMax fPHeapMax44 = new ds.FPHeapMax(0);
        ds.FPHeapMax fPHeapMax46 = new ds.FPHeapMax((int) (byte) 1);
        ds.FPHeapMax fPHeapMax48 = new ds.FPHeapMax((int) (byte) 1);
        ds.Item item49 = null;
        ds.Item[] itemArray50 = new ds.Item[] { item49 };
        fPHeapMax48.copia(itemArray50);
        fPHeapMax46.copia(itemArray50);
        fPHeapMax44.copia(itemArray50);
        fPHeapMax36.copia(itemArray50);
        fPHeapMax36.imprime();
        ds.FPHeapMax fPHeapMax57 = new ds.FPHeapMax((int) (byte) 1);
        ds.Item item58 = null;
        ds.Item[] itemArray59 = new ds.Item[] { item58 };
        fPHeapMax57.copia(itemArray59);
        ds.Item item61 = fPHeapMax57.max();
        fPHeapMax57.constroi();
        fPHeapMax57.constroi();
        ds.Item item64 = fPHeapMax57.max();
        fPHeapMax57.constroi();
        ds.Item item66 = fPHeapMax57.max();
        ds.Item item67 = fPHeapMax57.max();
        ds.Item item68 = fPHeapMax57.max();
        fPHeapMax57.imprime();
        ds.FPHeapMax fPHeapMax71 = new ds.FPHeapMax((int) (byte) 1);
        ds.Item item72 = fPHeapMax71.max();
        fPHeapMax71.imprime();
        fPHeapMax71.constroi();
        fPHeapMax71.refaz((int) (byte) 1, 0);
        ds.FPHeapMax fPHeapMax79 = new ds.FPHeapMax(0);
        ds.FPHeapMax fPHeapMax81 = new ds.FPHeapMax((int) (byte) 1);
        ds.FPHeapMax fPHeapMax83 = new ds.FPHeapMax((int) (byte) 1);
        ds.Item item84 = null;
        ds.Item[] itemArray85 = new ds.Item[] { item84 };
        fPHeapMax83.copia(itemArray85);
        fPHeapMax81.copia(itemArray85);
        fPHeapMax79.copia(itemArray85);
        fPHeapMax71.copia(itemArray85);
        fPHeapMax57.copia(itemArray85);
        fPHeapMax36.copia(itemArray85);
        fPHeapMax1.copia(itemArray85);
        ds.Item item93 = fPHeapMax1.max();
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMax1.refaz((int) (short) -1, (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertNull(item5);
        org.junit.Assert.assertNull(item8);
        org.junit.Assert.assertNull(item10);
        org.junit.Assert.assertNull(item11);
        org.junit.Assert.assertNull(item12);
        org.junit.Assert.assertNull(item16);
        org.junit.Assert.assertNotNull(itemArray29);
        org.junit.Assert.assertNull(item37);
        org.junit.Assert.assertNotNull(itemArray50);
        org.junit.Assert.assertNotNull(itemArray59);
        org.junit.Assert.assertNull(item61);
        org.junit.Assert.assertNull(item64);
        org.junit.Assert.assertNull(item66);
        org.junit.Assert.assertNull(item67);
        org.junit.Assert.assertNull(item68);
        org.junit.Assert.assertNull(item72);
        org.junit.Assert.assertNotNull(itemArray85);
        org.junit.Assert.assertNull(item93);
    }

    @Test
    public void test460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test460");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) ' ');
        fPHeapMax1.imprime();
        ds.FPHeapMax fPHeapMax4 = new ds.FPHeapMax((int) (byte) 1);
        ds.Item item5 = null;
        ds.Item[] itemArray6 = new ds.Item[] { item5 };
        fPHeapMax4.copia(itemArray6);
        ds.Item item8 = fPHeapMax4.max();
        fPHeapMax4.constroi();
        fPHeapMax4.constroi();
        ds.Item item11 = fPHeapMax4.max();
        fPHeapMax4.constroi();
        ds.Item item13 = fPHeapMax4.max();
        fPHeapMax4.imprime();
        ds.FPHeapMax fPHeapMax16 = new ds.FPHeapMax((int) (byte) 1);
        ds.Item item17 = null;
        ds.Item[] itemArray18 = new ds.Item[] { item17 };
        fPHeapMax16.copia(itemArray18);
        ds.Item item20 = fPHeapMax16.max();
        ds.FPHeapMax fPHeapMax22 = new ds.FPHeapMax((int) (byte) 1);
        ds.FPHeapMax fPHeapMax24 = new ds.FPHeapMax((int) (byte) 1);
        ds.Item item25 = null;
        ds.Item[] itemArray26 = new ds.Item[] { item25 };
        fPHeapMax24.copia(itemArray26);
        fPHeapMax22.copia(itemArray26);
        fPHeapMax16.copia(itemArray26);
        fPHeapMax4.copia(itemArray26);
        fPHeapMax1.copia(itemArray26);
        ds.FPHeapMax fPHeapMax33 = new ds.FPHeapMax(10);
        ds.FPHeapMax fPHeapMax35 = new ds.FPHeapMax((int) ' ');
        fPHeapMax35.imprime();
        ds.FPHeapMax fPHeapMax38 = new ds.FPHeapMax((int) (byte) 1);
        ds.FPHeapMax fPHeapMax40 = new ds.FPHeapMax((int) (byte) 1);
        ds.Item item41 = null;
        ds.Item[] itemArray42 = new ds.Item[] { item41 };
        fPHeapMax40.copia(itemArray42);
        fPHeapMax38.copia(itemArray42);
        fPHeapMax38.imprime();
        ds.FPHeapMax fPHeapMax47 = new ds.FPHeapMax((int) (byte) 1);
        ds.Item item48 = null;
        ds.Item[] itemArray49 = new ds.Item[] { item48 };
        fPHeapMax47.copia(itemArray49);
        ds.Item item51 = fPHeapMax47.max();
        ds.FPHeapMax fPHeapMax53 = new ds.FPHeapMax((int) (byte) 1);
        ds.FPHeapMax fPHeapMax55 = new ds.FPHeapMax((int) (byte) 1);
        ds.Item item56 = null;
        ds.Item[] itemArray57 = new ds.Item[] { item56 };
        fPHeapMax55.copia(itemArray57);
        fPHeapMax53.copia(itemArray57);
        fPHeapMax47.copia(itemArray57);
        fPHeapMax38.copia(itemArray57);
        fPHeapMax35.copia(itemArray57);
        fPHeapMax33.copia(itemArray57);
        fPHeapMax1.copia(itemArray57);
        ds.Item item65 = fPHeapMax1.max();
        ds.FPHeapMax fPHeapMax68 = new ds.FPHeapMax((int) (byte) 1);
        ds.Item item69 = null;
        ds.Item[] itemArray70 = new ds.Item[] { item69 };
        fPHeapMax68.copia(itemArray70);
        ds.Item item72 = fPHeapMax68.max();
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMax1.aumentaChave((-1), (java.lang.Object) item72);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray6);
        org.junit.Assert.assertNull(item8);
        org.junit.Assert.assertNull(item11);
        org.junit.Assert.assertNull(item13);
        org.junit.Assert.assertNotNull(itemArray18);
        org.junit.Assert.assertNull(item20);
        org.junit.Assert.assertNotNull(itemArray26);
        org.junit.Assert.assertNotNull(itemArray42);
        org.junit.Assert.assertNotNull(itemArray49);
        org.junit.Assert.assertNull(item51);
        org.junit.Assert.assertNotNull(itemArray57);
        org.junit.Assert.assertNull(item65);
        org.junit.Assert.assertNotNull(itemArray70);
        org.junit.Assert.assertNull(item72);
    }

    @Test
    public void test461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test461");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (byte) 1);
        ds.Item item2 = null;
        ds.Item[] itemArray3 = new ds.Item[] { item2 };
        fPHeapMax1.copia(itemArray3);
        ds.Item item5 = fPHeapMax1.max();
        fPHeapMax1.constroi();
        fPHeapMax1.imprime();
        fPHeapMax1.constroi();
        fPHeapMax1.imprime();
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
    }

    @Test
    public void test462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test462");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (byte) 1);
        ds.Item item2 = null;
        ds.Item[] itemArray3 = new ds.Item[] { item2 };
        fPHeapMax1.copia(itemArray3);
        ds.Item item5 = fPHeapMax1.max();
        fPHeapMax1.constroi();
        fPHeapMax1.constroi();
        ds.Item item8 = fPHeapMax1.max();
        fPHeapMax1.constroi();
        fPHeapMax1.imprime();
        ds.Item item11 = fPHeapMax1.max();
        ds.Item item12 = fPHeapMax1.max();
        // The following exception was thrown during execution in test generation
        try {
            ds.Item item13 = fPHeapMax1.retiraMax();
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: heap vazio");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertNull(item5);
        org.junit.Assert.assertNull(item8);
        org.junit.Assert.assertNull(item11);
        org.junit.Assert.assertNull(item12);
    }

    @Test
    public void test463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test463");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (byte) 1);
        ds.Item item2 = null;
        ds.Item[] itemArray3 = new ds.Item[] { item2 };
        fPHeapMax1.copia(itemArray3);
        ds.Item item5 = fPHeapMax1.max();
        fPHeapMax1.imprime();
        ds.FPHeapMax fPHeapMax8 = new ds.FPHeapMax((int) ' ');
        fPHeapMax8.refaz((int) (short) 1, (int) (short) 1);
        ds.Item item12 = fPHeapMax8.max();
        ds.FPHeapMax fPHeapMax14 = new ds.FPHeapMax((int) (byte) 1);
        ds.Item item15 = null;
        ds.Item[] itemArray16 = new ds.Item[] { item15 };
        fPHeapMax14.copia(itemArray16);
        fPHeapMax8.copia(itemArray16);
        fPHeapMax8.constroi();
        ds.FPHeapMax fPHeapMax21 = new ds.FPHeapMax((int) (byte) 1);
        ds.Item item22 = null;
        ds.Item[] itemArray23 = new ds.Item[] { item22 };
        fPHeapMax21.copia(itemArray23);
        fPHeapMax8.copia(itemArray23);
        fPHeapMax1.copia(itemArray23);
        fPHeapMax1.imprime();
        fPHeapMax1.imprime();
        java.lang.Class<?> wildcardClass29 = fPHeapMax1.getClass();
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertNull(item5);
        org.junit.Assert.assertNull(item12);
        org.junit.Assert.assertNotNull(itemArray16);
        org.junit.Assert.assertNotNull(itemArray23);
        org.junit.Assert.assertNotNull(wildcardClass29);
    }

    @Test
    public void test464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test464");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (byte) 1);
        ds.Item item2 = null;
        ds.Item[] itemArray3 = new ds.Item[] { item2 };
        fPHeapMax1.copia(itemArray3);
        ds.Item item5 = fPHeapMax1.max();
        fPHeapMax1.imprime();
        ds.FPHeapMax fPHeapMax8 = new ds.FPHeapMax((int) ' ');
        fPHeapMax8.refaz((int) (short) 1, (int) (short) 1);
        ds.Item item12 = fPHeapMax8.max();
        ds.FPHeapMax fPHeapMax14 = new ds.FPHeapMax((int) (byte) 1);
        ds.Item item15 = null;
        ds.Item[] itemArray16 = new ds.Item[] { item15 };
        fPHeapMax14.copia(itemArray16);
        fPHeapMax8.copia(itemArray16);
        fPHeapMax8.constroi();
        ds.FPHeapMax fPHeapMax21 = new ds.FPHeapMax((int) (byte) 1);
        ds.Item item22 = null;
        ds.Item[] itemArray23 = new ds.Item[] { item22 };
        fPHeapMax21.copia(itemArray23);
        fPHeapMax8.copia(itemArray23);
        fPHeapMax1.copia(itemArray23);
        fPHeapMax1.imprime();
        // The following exception was thrown during execution in test generation
        try {
            ds.Item item28 = fPHeapMax1.retiraMax();
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: heap vazio");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertNull(item5);
        org.junit.Assert.assertNull(item12);
        org.junit.Assert.assertNotNull(itemArray16);
        org.junit.Assert.assertNotNull(itemArray23);
    }

    @Test
    public void test465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test465");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (byte) 1);
        ds.Item item2 = null;
        ds.Item[] itemArray3 = new ds.Item[] { item2 };
        fPHeapMax1.copia(itemArray3);
        ds.Item item5 = fPHeapMax1.max();
        fPHeapMax1.constroi();
        fPHeapMax1.constroi();
        ds.Item item8 = fPHeapMax1.max();
        fPHeapMax1.constroi();
        ds.Item item10 = fPHeapMax1.max();
        ds.Item item11 = fPHeapMax1.max();
        ds.Item item12 = fPHeapMax1.max();
        fPHeapMax1.imprime();
        ds.FPHeapMax fPHeapMax15 = new ds.FPHeapMax((int) (byte) 1);
        ds.Item item16 = fPHeapMax15.max();
        fPHeapMax15.imprime();
        fPHeapMax15.constroi();
        fPHeapMax15.refaz((int) (byte) 1, 0);
        ds.FPHeapMax fPHeapMax23 = new ds.FPHeapMax(0);
        ds.FPHeapMax fPHeapMax25 = new ds.FPHeapMax((int) (byte) 1);
        ds.FPHeapMax fPHeapMax27 = new ds.FPHeapMax((int) (byte) 1);
        ds.Item item28 = null;
        ds.Item[] itemArray29 = new ds.Item[] { item28 };
        fPHeapMax27.copia(itemArray29);
        fPHeapMax25.copia(itemArray29);
        fPHeapMax23.copia(itemArray29);
        fPHeapMax15.copia(itemArray29);
        fPHeapMax1.copia(itemArray29);
        ds.FPHeapMax fPHeapMax36 = new ds.FPHeapMax((int) (byte) 1);
        ds.Item item37 = fPHeapMax36.max();
        fPHeapMax36.imprime();
        fPHeapMax36.constroi();
        fPHeapMax36.refaz((int) (byte) 1, 0);
        ds.FPHeapMax fPHeapMax44 = new ds.FPHeapMax(0);
        ds.FPHeapMax fPHeapMax46 = new ds.FPHeapMax((int) (byte) 1);
        ds.FPHeapMax fPHeapMax48 = new ds.FPHeapMax((int) (byte) 1);
        ds.Item item49 = null;
        ds.Item[] itemArray50 = new ds.Item[] { item49 };
        fPHeapMax48.copia(itemArray50);
        fPHeapMax46.copia(itemArray50);
        fPHeapMax44.copia(itemArray50);
        fPHeapMax36.copia(itemArray50);
        fPHeapMax36.imprime();
        ds.FPHeapMax fPHeapMax57 = new ds.FPHeapMax((int) (byte) 1);
        ds.Item item58 = null;
        ds.Item[] itemArray59 = new ds.Item[] { item58 };
        fPHeapMax57.copia(itemArray59);
        ds.Item item61 = fPHeapMax57.max();
        fPHeapMax57.constroi();
        fPHeapMax57.constroi();
        ds.Item item64 = fPHeapMax57.max();
        fPHeapMax57.constroi();
        ds.Item item66 = fPHeapMax57.max();
        ds.Item item67 = fPHeapMax57.max();
        ds.Item item68 = fPHeapMax57.max();
        fPHeapMax57.imprime();
        ds.FPHeapMax fPHeapMax71 = new ds.FPHeapMax((int) (byte) 1);
        ds.Item item72 = fPHeapMax71.max();
        fPHeapMax71.imprime();
        fPHeapMax71.constroi();
        fPHeapMax71.refaz((int) (byte) 1, 0);
        ds.FPHeapMax fPHeapMax79 = new ds.FPHeapMax(0);
        ds.FPHeapMax fPHeapMax81 = new ds.FPHeapMax((int) (byte) 1);
        ds.FPHeapMax fPHeapMax83 = new ds.FPHeapMax((int) (byte) 1);
        ds.Item item84 = null;
        ds.Item[] itemArray85 = new ds.Item[] { item84 };
        fPHeapMax83.copia(itemArray85);
        fPHeapMax81.copia(itemArray85);
        fPHeapMax79.copia(itemArray85);
        fPHeapMax71.copia(itemArray85);
        fPHeapMax57.copia(itemArray85);
        fPHeapMax36.copia(itemArray85);
        fPHeapMax1.copia(itemArray85);
        // The following exception was thrown during execution in test generation
        try {
            ds.Item item93 = fPHeapMax1.retiraMax();
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: heap vazio");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertNull(item5);
        org.junit.Assert.assertNull(item8);
        org.junit.Assert.assertNull(item10);
        org.junit.Assert.assertNull(item11);
        org.junit.Assert.assertNull(item12);
        org.junit.Assert.assertNull(item16);
        org.junit.Assert.assertNotNull(itemArray29);
        org.junit.Assert.assertNull(item37);
        org.junit.Assert.assertNotNull(itemArray50);
        org.junit.Assert.assertNotNull(itemArray59);
        org.junit.Assert.assertNull(item61);
        org.junit.Assert.assertNull(item64);
        org.junit.Assert.assertNull(item66);
        org.junit.Assert.assertNull(item67);
        org.junit.Assert.assertNull(item68);
        org.junit.Assert.assertNull(item72);
        org.junit.Assert.assertNotNull(itemArray85);
    }

    @Test
    public void test466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test466");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (byte) 10);
        fPHeapMax1.constroi();
        fPHeapMax1.refaz((int) (short) 10, 0);
        fPHeapMax1.imprime();
        ds.FPHeapMax fPHeapMax8 = new ds.FPHeapMax((int) ' ');
        fPHeapMax8.imprime();
        ds.FPHeapMax fPHeapMax11 = new ds.FPHeapMax((int) (byte) 1);
        ds.Item item12 = null;
        ds.Item[] itemArray13 = new ds.Item[] { item12 };
        fPHeapMax11.copia(itemArray13);
        fPHeapMax11.constroi();
        ds.FPHeapMax fPHeapMax17 = new ds.FPHeapMax((int) ' ');
        fPHeapMax17.refaz((int) (short) 1, (int) (short) 1);
        ds.Item item21 = fPHeapMax17.max();
        ds.FPHeapMax fPHeapMax23 = new ds.FPHeapMax((int) (byte) 1);
        ds.Item item24 = null;
        ds.Item[] itemArray25 = new ds.Item[] { item24 };
        fPHeapMax23.copia(itemArray25);
        fPHeapMax17.copia(itemArray25);
        fPHeapMax17.constroi();
        ds.FPHeapMax fPHeapMax30 = new ds.FPHeapMax((int) (byte) 1);
        ds.Item item31 = null;
        ds.Item[] itemArray32 = new ds.Item[] { item31 };
        fPHeapMax30.copia(itemArray32);
        fPHeapMax17.copia(itemArray32);
        fPHeapMax11.copia(itemArray32);
        fPHeapMax8.copia(itemArray32);
        fPHeapMax1.copia(itemArray32);
        fPHeapMax1.constroi();
        java.lang.Class<?> wildcardClass39 = fPHeapMax1.getClass();
        org.junit.Assert.assertNotNull(itemArray13);
        org.junit.Assert.assertNull(item21);
        org.junit.Assert.assertNotNull(itemArray25);
        org.junit.Assert.assertNotNull(itemArray32);
        org.junit.Assert.assertNotNull(wildcardClass39);
    }

    @Test
    public void test467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test467");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (short) -1);
        ds.FPHeapMax fPHeapMax3 = new ds.FPHeapMax((int) (byte) 1);
        ds.Item item4 = null;
        ds.Item[] itemArray5 = new ds.Item[] { item4 };
        fPHeapMax3.copia(itemArray5);
        ds.Item item7 = fPHeapMax3.max();
        fPHeapMax3.constroi();
        fPHeapMax3.constroi();
        ds.Item item10 = fPHeapMax3.max();
        fPHeapMax3.constroi();
        fPHeapMax3.refaz(0, (int) (short) -1);
        fPHeapMax3.constroi();
        ds.FPHeapMax fPHeapMax17 = new ds.FPHeapMax((int) (short) 1);
        ds.FPHeapMax fPHeapMax19 = new ds.FPHeapMax(0);
        ds.FPHeapMax fPHeapMax21 = new ds.FPHeapMax((int) (byte) 1);
        ds.FPHeapMax fPHeapMax23 = new ds.FPHeapMax((int) (byte) 1);
        ds.Item item24 = null;
        ds.Item[] itemArray25 = new ds.Item[] { item24 };
        fPHeapMax23.copia(itemArray25);
        fPHeapMax21.copia(itemArray25);
        fPHeapMax19.copia(itemArray25);
        fPHeapMax17.copia(itemArray25);
        fPHeapMax17.imprime();
        ds.FPHeapMax fPHeapMax32 = new ds.FPHeapMax((int) ' ');
        fPHeapMax32.refaz((int) (short) 1, (int) (short) 1);
        ds.Item item36 = fPHeapMax32.max();
        ds.FPHeapMax fPHeapMax38 = new ds.FPHeapMax((int) (byte) 1);
        ds.Item item39 = null;
        ds.Item[] itemArray40 = new ds.Item[] { item39 };
        fPHeapMax38.copia(itemArray40);
        fPHeapMax32.copia(itemArray40);
        fPHeapMax17.copia(itemArray40);
        fPHeapMax3.copia(itemArray40);
        fPHeapMax1.copia(itemArray40);
        java.lang.Class<?> wildcardClass46 = fPHeapMax1.getClass();
        org.junit.Assert.assertNotNull(itemArray5);
        org.junit.Assert.assertNull(item7);
        org.junit.Assert.assertNull(item10);
        org.junit.Assert.assertNotNull(itemArray25);
        org.junit.Assert.assertNull(item36);
        org.junit.Assert.assertNotNull(itemArray40);
        org.junit.Assert.assertNotNull(wildcardClass46);
    }

    @Test
    public void test468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test468");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (short) -1);
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
    public void test469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test469");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (byte) 1);
        ds.Item item2 = null;
        ds.Item[] itemArray3 = new ds.Item[] { item2 };
        fPHeapMax1.copia(itemArray3);
        ds.Item item5 = fPHeapMax1.max();
        fPHeapMax1.constroi();
        fPHeapMax1.constroi();
        ds.Item item8 = fPHeapMax1.max();
        fPHeapMax1.constroi();
        ds.Item item10 = fPHeapMax1.max();
        fPHeapMax1.constroi();
        fPHeapMax1.refaz((int) (byte) 1, (int) (byte) -1);
        ds.FPHeapMax fPHeapMax16 = new ds.FPHeapMax((int) (short) 10);
        ds.FPHeapMax fPHeapMax18 = new ds.FPHeapMax((int) (byte) 1);
        ds.Item item19 = null;
        ds.Item[] itemArray20 = new ds.Item[] { item19 };
        fPHeapMax18.copia(itemArray20);
        ds.Item item22 = fPHeapMax18.max();
        fPHeapMax18.constroi();
        fPHeapMax18.constroi();
        ds.Item item25 = fPHeapMax18.max();
        fPHeapMax18.constroi();
        ds.Item item27 = fPHeapMax18.max();
        fPHeapMax18.constroi();
        fPHeapMax18.imprime();
        ds.FPHeapMax fPHeapMax31 = new ds.FPHeapMax((int) (byte) 1);
        ds.Item item32 = null;
        ds.Item[] itemArray33 = new ds.Item[] { item32 };
        fPHeapMax31.copia(itemArray33);
        fPHeapMax18.copia(itemArray33);
        fPHeapMax16.copia(itemArray33);
        fPHeapMax1.copia(itemArray33);
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
        org.junit.Assert.assertNull(item8);
        org.junit.Assert.assertNull(item10);
        org.junit.Assert.assertNotNull(itemArray20);
        org.junit.Assert.assertNull(item22);
        org.junit.Assert.assertNull(item25);
        org.junit.Assert.assertNull(item27);
        org.junit.Assert.assertNotNull(itemArray33);
    }

    @Test
    public void test470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test470");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (byte) 1);
        ds.Item item2 = null;
        ds.Item[] itemArray3 = new ds.Item[] { item2 };
        fPHeapMax1.copia(itemArray3);
        ds.Item item5 = fPHeapMax1.max();
        fPHeapMax1.constroi();
        fPHeapMax1.constroi();
        ds.Item item8 = fPHeapMax1.max();
        fPHeapMax1.constroi();
        ds.Item item10 = fPHeapMax1.max();
        ds.Item item11 = fPHeapMax1.max();
        java.lang.Object obj13 = null;
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMax1.aumentaChave((int) (byte) 10, obj13);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 10");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertNull(item5);
        org.junit.Assert.assertNull(item8);
        org.junit.Assert.assertNull(item10);
        org.junit.Assert.assertNull(item11);
    }

    @Test
    public void test471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test471");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (byte) 1);
        ds.Item item2 = null;
        ds.Item[] itemArray3 = new ds.Item[] { item2 };
        fPHeapMax1.copia(itemArray3);
        ds.Item item5 = fPHeapMax1.max();
        fPHeapMax1.constroi();
        fPHeapMax1.constroi();
        ds.Item item8 = fPHeapMax1.max();
        fPHeapMax1.imprime();
        fPHeapMax1.constroi();
        ds.FPHeapMax fPHeapMax12 = new ds.FPHeapMax((int) (short) 1);
        fPHeapMax12.imprime();
        fPHeapMax12.constroi();
        ds.FPHeapMax fPHeapMax16 = new ds.FPHeapMax((int) ' ');
        fPHeapMax16.imprime();
        ds.FPHeapMax fPHeapMax19 = new ds.FPHeapMax((int) (byte) 1);
        ds.Item item20 = null;
        ds.Item[] itemArray21 = new ds.Item[] { item20 };
        fPHeapMax19.copia(itemArray21);
        ds.Item item23 = fPHeapMax19.max();
        fPHeapMax19.constroi();
        fPHeapMax19.constroi();
        ds.Item item26 = fPHeapMax19.max();
        fPHeapMax19.constroi();
        ds.Item item28 = fPHeapMax19.max();
        fPHeapMax19.imprime();
        ds.FPHeapMax fPHeapMax31 = new ds.FPHeapMax((int) (byte) 1);
        ds.Item item32 = null;
        ds.Item[] itemArray33 = new ds.Item[] { item32 };
        fPHeapMax31.copia(itemArray33);
        ds.Item item35 = fPHeapMax31.max();
        ds.FPHeapMax fPHeapMax37 = new ds.FPHeapMax((int) (byte) 1);
        ds.FPHeapMax fPHeapMax39 = new ds.FPHeapMax((int) (byte) 1);
        ds.Item item40 = null;
        ds.Item[] itemArray41 = new ds.Item[] { item40 };
        fPHeapMax39.copia(itemArray41);
        fPHeapMax37.copia(itemArray41);
        fPHeapMax31.copia(itemArray41);
        fPHeapMax19.copia(itemArray41);
        fPHeapMax16.copia(itemArray41);
        ds.FPHeapMax fPHeapMax48 = new ds.FPHeapMax(10);
        ds.FPHeapMax fPHeapMax50 = new ds.FPHeapMax((int) ' ');
        fPHeapMax50.imprime();
        ds.FPHeapMax fPHeapMax53 = new ds.FPHeapMax((int) (byte) 1);
        ds.FPHeapMax fPHeapMax55 = new ds.FPHeapMax((int) (byte) 1);
        ds.Item item56 = null;
        ds.Item[] itemArray57 = new ds.Item[] { item56 };
        fPHeapMax55.copia(itemArray57);
        fPHeapMax53.copia(itemArray57);
        fPHeapMax53.imprime();
        ds.FPHeapMax fPHeapMax62 = new ds.FPHeapMax((int) (byte) 1);
        ds.Item item63 = null;
        ds.Item[] itemArray64 = new ds.Item[] { item63 };
        fPHeapMax62.copia(itemArray64);
        ds.Item item66 = fPHeapMax62.max();
        ds.FPHeapMax fPHeapMax68 = new ds.FPHeapMax((int) (byte) 1);
        ds.FPHeapMax fPHeapMax70 = new ds.FPHeapMax((int) (byte) 1);
        ds.Item item71 = null;
        ds.Item[] itemArray72 = new ds.Item[] { item71 };
        fPHeapMax70.copia(itemArray72);
        fPHeapMax68.copia(itemArray72);
        fPHeapMax62.copia(itemArray72);
        fPHeapMax53.copia(itemArray72);
        fPHeapMax50.copia(itemArray72);
        fPHeapMax48.copia(itemArray72);
        fPHeapMax16.copia(itemArray72);
        fPHeapMax12.copia(itemArray72);
        fPHeapMax1.copia(itemArray72);
        fPHeapMax1.constroi();
        fPHeapMax1.imprime();
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertNull(item5);
        org.junit.Assert.assertNull(item8);
        org.junit.Assert.assertNotNull(itemArray21);
        org.junit.Assert.assertNull(item23);
        org.junit.Assert.assertNull(item26);
        org.junit.Assert.assertNull(item28);
        org.junit.Assert.assertNotNull(itemArray33);
        org.junit.Assert.assertNull(item35);
        org.junit.Assert.assertNotNull(itemArray41);
        org.junit.Assert.assertNotNull(itemArray57);
        org.junit.Assert.assertNotNull(itemArray64);
        org.junit.Assert.assertNull(item66);
        org.junit.Assert.assertNotNull(itemArray72);
    }

    @Test
    public void test472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test472");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (byte) 1);
        ds.Item item2 = null;
        ds.Item[] itemArray3 = new ds.Item[] { item2 };
        fPHeapMax1.copia(itemArray3);
        ds.Item item5 = fPHeapMax1.max();
        fPHeapMax1.constroi();
        fPHeapMax1.constroi();
        ds.Item item8 = fPHeapMax1.max();
        fPHeapMax1.constroi();
        ds.Item item10 = fPHeapMax1.max();
        fPHeapMax1.constroi();
        fPHeapMax1.refaz((int) (byte) 1, (int) (byte) -1);
        ds.FPHeapMax fPHeapMax16 = new ds.FPHeapMax((int) (short) 10);
        ds.FPHeapMax fPHeapMax18 = new ds.FPHeapMax((int) (byte) 1);
        ds.Item item19 = null;
        ds.Item[] itemArray20 = new ds.Item[] { item19 };
        fPHeapMax18.copia(itemArray20);
        ds.Item item22 = fPHeapMax18.max();
        fPHeapMax18.constroi();
        fPHeapMax18.constroi();
        ds.Item item25 = fPHeapMax18.max();
        fPHeapMax18.constroi();
        ds.Item item27 = fPHeapMax18.max();
        fPHeapMax18.constroi();
        fPHeapMax18.imprime();
        ds.FPHeapMax fPHeapMax31 = new ds.FPHeapMax((int) (byte) 1);
        ds.Item item32 = null;
        ds.Item[] itemArray33 = new ds.Item[] { item32 };
        fPHeapMax31.copia(itemArray33);
        fPHeapMax18.copia(itemArray33);
        fPHeapMax16.copia(itemArray33);
        fPHeapMax1.copia(itemArray33);
        fPHeapMax1.constroi();
        java.lang.Class<?> wildcardClass39 = fPHeapMax1.getClass();
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertNull(item5);
        org.junit.Assert.assertNull(item8);
        org.junit.Assert.assertNull(item10);
        org.junit.Assert.assertNotNull(itemArray20);
        org.junit.Assert.assertNull(item22);
        org.junit.Assert.assertNull(item25);
        org.junit.Assert.assertNull(item27);
        org.junit.Assert.assertNotNull(itemArray33);
        org.junit.Assert.assertNotNull(wildcardClass39);
    }

    @Test
    public void test473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test473");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (byte) 1);
        ds.Item item2 = null;
        ds.Item[] itemArray3 = new ds.Item[] { item2 };
        fPHeapMax1.copia(itemArray3);
        ds.Item item5 = fPHeapMax1.max();
        fPHeapMax1.imprime();
        ds.FPHeapMax fPHeapMax8 = new ds.FPHeapMax((int) ' ');
        fPHeapMax8.refaz((int) (short) 1, (int) (short) 1);
        ds.Item item12 = fPHeapMax8.max();
        ds.FPHeapMax fPHeapMax14 = new ds.FPHeapMax((int) (byte) 1);
        ds.Item item15 = null;
        ds.Item[] itemArray16 = new ds.Item[] { item15 };
        fPHeapMax14.copia(itemArray16);
        fPHeapMax8.copia(itemArray16);
        fPHeapMax8.constroi();
        ds.FPHeapMax fPHeapMax21 = new ds.FPHeapMax((int) (byte) 1);
        ds.Item item22 = null;
        ds.Item[] itemArray23 = new ds.Item[] { item22 };
        fPHeapMax21.copia(itemArray23);
        fPHeapMax8.copia(itemArray23);
        fPHeapMax1.copia(itemArray23);
        fPHeapMax1.imprime();
        fPHeapMax1.imprime();
        ds.FPHeapMax fPHeapMax31 = new ds.FPHeapMax((int) (byte) 10);
        fPHeapMax31.constroi();
        fPHeapMax31.refaz((int) (short) 10, 0);
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMax1.aumentaChave(100, (java.lang.Object) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 100");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertNull(item5);
        org.junit.Assert.assertNull(item12);
        org.junit.Assert.assertNotNull(itemArray16);
        org.junit.Assert.assertNotNull(itemArray23);
    }

    @Test
    public void test474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test474");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (short) 1);
        fPHeapMax1.imprime();
        ds.FPHeapMax fPHeapMax4 = new ds.FPHeapMax((int) (short) 1);
        ds.FPHeapMax fPHeapMax6 = new ds.FPHeapMax(0);
        ds.FPHeapMax fPHeapMax8 = new ds.FPHeapMax((int) (byte) 1);
        ds.FPHeapMax fPHeapMax10 = new ds.FPHeapMax((int) (byte) 1);
        ds.Item item11 = null;
        ds.Item[] itemArray12 = new ds.Item[] { item11 };
        fPHeapMax10.copia(itemArray12);
        fPHeapMax8.copia(itemArray12);
        fPHeapMax6.copia(itemArray12);
        fPHeapMax4.copia(itemArray12);
        fPHeapMax1.copia(itemArray12);
        ds.Item item18 = fPHeapMax1.max();
        org.junit.Assert.assertNotNull(itemArray12);
        org.junit.Assert.assertNull(item18);
    }

    @Test
    public void test475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test475");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (byte) 1);
        ds.Item item2 = null;
        ds.Item[] itemArray3 = new ds.Item[] { item2 };
        fPHeapMax1.copia(itemArray3);
        ds.Item item5 = fPHeapMax1.max();
        fPHeapMax1.constroi();
        fPHeapMax1.constroi();
        ds.Item item8 = fPHeapMax1.max();
        fPHeapMax1.constroi();
        ds.Item item10 = fPHeapMax1.max();
        ds.FPHeapMax fPHeapMax12 = new ds.FPHeapMax((int) (byte) 1);
        ds.Item item13 = null;
        ds.Item[] itemArray14 = new ds.Item[] { item13 };
        fPHeapMax12.copia(itemArray14);
        ds.Item item16 = fPHeapMax12.max();
        ds.FPHeapMax fPHeapMax18 = new ds.FPHeapMax((int) (byte) 1);
        ds.FPHeapMax fPHeapMax20 = new ds.FPHeapMax((int) (byte) 1);
        ds.Item item21 = null;
        ds.Item[] itemArray22 = new ds.Item[] { item21 };
        fPHeapMax20.copia(itemArray22);
        fPHeapMax18.copia(itemArray22);
        fPHeapMax12.copia(itemArray22);
        fPHeapMax1.copia(itemArray22);
        ds.Item item27 = fPHeapMax1.max();
        ds.Item item28 = fPHeapMax1.max();
        fPHeapMax1.constroi();
        ds.Item item30 = fPHeapMax1.max();
        // The following exception was thrown during execution in test generation
        try {
            ds.Item item31 = fPHeapMax1.retiraMax();
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: heap vazio");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertNull(item5);
        org.junit.Assert.assertNull(item8);
        org.junit.Assert.assertNull(item10);
        org.junit.Assert.assertNotNull(itemArray14);
        org.junit.Assert.assertNull(item16);
        org.junit.Assert.assertNotNull(itemArray22);
        org.junit.Assert.assertNull(item27);
        org.junit.Assert.assertNull(item28);
        org.junit.Assert.assertNull(item30);
    }

    @Test
    public void test476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test476");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (byte) 1);
        ds.Item item2 = null;
        ds.Item[] itemArray3 = new ds.Item[] { item2 };
        fPHeapMax1.copia(itemArray3);
        ds.Item item5 = fPHeapMax1.max();
        fPHeapMax1.constroi();
        fPHeapMax1.constroi();
        ds.Item item8 = fPHeapMax1.max();
        fPHeapMax1.constroi();
        ds.Item item10 = fPHeapMax1.max();
        ds.Item item11 = fPHeapMax1.max();
        fPHeapMax1.imprime();
        fPHeapMax1.imprime();
        ds.Item item14 = fPHeapMax1.max();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass15 = item14.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertNull(item5);
        org.junit.Assert.assertNull(item8);
        org.junit.Assert.assertNull(item10);
        org.junit.Assert.assertNull(item11);
        org.junit.Assert.assertNull(item14);
    }

    @Test
    public void test477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test477");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (short) 1);
        fPHeapMax1.imprime();
        ds.FPHeapMax fPHeapMax4 = new ds.FPHeapMax((int) (byte) 1);
        ds.Item item5 = null;
        ds.Item[] itemArray6 = new ds.Item[] { item5 };
        fPHeapMax4.copia(itemArray6);
        ds.Item item8 = fPHeapMax4.max();
        fPHeapMax4.constroi();
        fPHeapMax4.constroi();
        ds.Item item11 = fPHeapMax4.max();
        fPHeapMax4.constroi();
        fPHeapMax4.imprime();
        ds.FPHeapMax fPHeapMax15 = new ds.FPHeapMax(0);
        ds.FPHeapMax fPHeapMax17 = new ds.FPHeapMax((int) (byte) 1);
        ds.FPHeapMax fPHeapMax19 = new ds.FPHeapMax((int) (byte) 1);
        ds.Item item20 = null;
        ds.Item[] itemArray21 = new ds.Item[] { item20 };
        fPHeapMax19.copia(itemArray21);
        fPHeapMax17.copia(itemArray21);
        fPHeapMax15.copia(itemArray21);
        fPHeapMax4.copia(itemArray21);
        fPHeapMax1.copia(itemArray21);
        java.lang.Class<?> wildcardClass27 = fPHeapMax1.getClass();
        org.junit.Assert.assertNotNull(itemArray6);
        org.junit.Assert.assertNull(item8);
        org.junit.Assert.assertNull(item11);
        org.junit.Assert.assertNotNull(itemArray21);
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test478");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (short) 1);
        ds.FPHeapMax fPHeapMax3 = new ds.FPHeapMax(0);
        ds.FPHeapMax fPHeapMax5 = new ds.FPHeapMax((int) (byte) 1);
        ds.FPHeapMax fPHeapMax7 = new ds.FPHeapMax((int) (byte) 1);
        ds.Item item8 = null;
        ds.Item[] itemArray9 = new ds.Item[] { item8 };
        fPHeapMax7.copia(itemArray9);
        fPHeapMax5.copia(itemArray9);
        fPHeapMax3.copia(itemArray9);
        fPHeapMax1.copia(itemArray9);
        java.lang.Class<?> wildcardClass14 = fPHeapMax1.getClass();
        org.junit.Assert.assertNotNull(itemArray9);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test479");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (byte) 1);
        ds.Item item2 = null;
        ds.Item[] itemArray3 = new ds.Item[] { item2 };
        fPHeapMax1.copia(itemArray3);
        ds.Item item5 = fPHeapMax1.max();
        fPHeapMax1.constroi();
        fPHeapMax1.constroi();
        ds.Item item8 = fPHeapMax1.max();
        ds.FPHeapMax fPHeapMax10 = new ds.FPHeapMax((int) (byte) 1);
        ds.Item item11 = null;
        ds.Item[] itemArray12 = new ds.Item[] { item11 };
        fPHeapMax10.copia(itemArray12);
        ds.Item item14 = fPHeapMax10.max();
        fPHeapMax10.constroi();
        fPHeapMax10.constroi();
        ds.Item item17 = fPHeapMax10.max();
        fPHeapMax10.constroi();
        fPHeapMax10.constroi();
        ds.FPHeapMax fPHeapMax21 = new ds.FPHeapMax((int) (byte) 1);
        ds.FPHeapMax fPHeapMax23 = new ds.FPHeapMax((int) (byte) 1);
        ds.Item item24 = null;
        ds.Item[] itemArray25 = new ds.Item[] { item24 };
        fPHeapMax23.copia(itemArray25);
        fPHeapMax21.copia(itemArray25);
        fPHeapMax21.imprime();
        ds.FPHeapMax fPHeapMax30 = new ds.FPHeapMax((int) (byte) 1);
        ds.Item item31 = null;
        ds.Item[] itemArray32 = new ds.Item[] { item31 };
        fPHeapMax30.copia(itemArray32);
        ds.Item item34 = fPHeapMax30.max();
        ds.FPHeapMax fPHeapMax36 = new ds.FPHeapMax((int) (byte) 1);
        ds.FPHeapMax fPHeapMax38 = new ds.FPHeapMax((int) (byte) 1);
        ds.Item item39 = null;
        ds.Item[] itemArray40 = new ds.Item[] { item39 };
        fPHeapMax38.copia(itemArray40);
        fPHeapMax36.copia(itemArray40);
        fPHeapMax30.copia(itemArray40);
        fPHeapMax21.copia(itemArray40);
        fPHeapMax10.copia(itemArray40);
        fPHeapMax1.copia(itemArray40);
        fPHeapMax1.imprime();
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertNull(item5);
        org.junit.Assert.assertNull(item8);
        org.junit.Assert.assertNotNull(itemArray12);
        org.junit.Assert.assertNull(item14);
        org.junit.Assert.assertNull(item17);
        org.junit.Assert.assertNotNull(itemArray25);
        org.junit.Assert.assertNotNull(itemArray32);
        org.junit.Assert.assertNull(item34);
        org.junit.Assert.assertNotNull(itemArray40);
    }

    @Test
    public void test480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test480");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (byte) 1);
        ds.Item item2 = null;
        ds.Item[] itemArray3 = new ds.Item[] { item2 };
        fPHeapMax1.copia(itemArray3);
        fPHeapMax1.imprime();
        fPHeapMax1.constroi();
        org.junit.Assert.assertNotNull(itemArray3);
    }

    @Test
    public void test481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test481");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (short) 1);
        ds.Item item2 = fPHeapMax1.max();
        fPHeapMax1.constroi();
        fPHeapMax1.imprime();
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMax1.refaz((int) '#', (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 35");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(item2);
    }

    @Test
    public void test482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test482");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (byte) 1);
        ds.Item item2 = null;
        ds.Item[] itemArray3 = new ds.Item[] { item2 };
        fPHeapMax1.copia(itemArray3);
        ds.Item item5 = fPHeapMax1.max();
        fPHeapMax1.constroi();
        fPHeapMax1.constroi();
        ds.Item item8 = fPHeapMax1.max();
        fPHeapMax1.constroi();
        fPHeapMax1.refaz(0, (int) (short) -1);
        fPHeapMax1.constroi();
        ds.FPHeapMax fPHeapMax16 = new ds.FPHeapMax((int) (byte) 1);
        ds.FPHeapMax fPHeapMax18 = new ds.FPHeapMax((int) (byte) 1);
        ds.Item item19 = null;
        ds.Item[] itemArray20 = new ds.Item[] { item19 };
        fPHeapMax18.copia(itemArray20);
        fPHeapMax16.copia(itemArray20);
        java.lang.Class<?> wildcardClass23 = itemArray20.getClass();
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMax1.aumentaChave((int) 'a', (java.lang.Object) itemArray20);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 97");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertNull(item5);
        org.junit.Assert.assertNull(item8);
        org.junit.Assert.assertNotNull(itemArray20);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test483");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (byte) 1);
        ds.Item item2 = null;
        ds.Item[] itemArray3 = new ds.Item[] { item2 };
        fPHeapMax1.copia(itemArray3);
        ds.Item item5 = fPHeapMax1.max();
        fPHeapMax1.imprime();
        ds.FPHeapMax fPHeapMax8 = new ds.FPHeapMax((int) ' ');
        fPHeapMax8.refaz((int) (short) 1, (int) (short) 1);
        ds.Item item12 = fPHeapMax8.max();
        ds.FPHeapMax fPHeapMax14 = new ds.FPHeapMax((int) (byte) 1);
        ds.Item item15 = null;
        ds.Item[] itemArray16 = new ds.Item[] { item15 };
        fPHeapMax14.copia(itemArray16);
        fPHeapMax8.copia(itemArray16);
        fPHeapMax8.constroi();
        ds.FPHeapMax fPHeapMax21 = new ds.FPHeapMax((int) (byte) 1);
        ds.Item item22 = null;
        ds.Item[] itemArray23 = new ds.Item[] { item22 };
        fPHeapMax21.copia(itemArray23);
        fPHeapMax8.copia(itemArray23);
        fPHeapMax1.copia(itemArray23);
        fPHeapMax1.constroi();
        fPHeapMax1.constroi();
        fPHeapMax1.imprime();
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertNull(item5);
        org.junit.Assert.assertNull(item12);
        org.junit.Assert.assertNotNull(itemArray16);
        org.junit.Assert.assertNotNull(itemArray23);
    }

    @Test
    public void test484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test484");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (byte) 1);
        ds.Item item2 = null;
        ds.Item[] itemArray3 = new ds.Item[] { item2 };
        fPHeapMax1.copia(itemArray3);
        ds.Item item5 = fPHeapMax1.max();
        fPHeapMax1.constroi();
        fPHeapMax1.constroi();
        ds.Item item8 = fPHeapMax1.max();
        fPHeapMax1.imprime();
        ds.Item item10 = fPHeapMax1.max();
        fPHeapMax1.imprime();
        ds.Item item12 = fPHeapMax1.max();
        ds.FPHeapMax fPHeapMax14 = new ds.FPHeapMax((int) (short) 1);
        ds.FPHeapMax fPHeapMax16 = new ds.FPHeapMax(0);
        ds.FPHeapMax fPHeapMax18 = new ds.FPHeapMax((int) (byte) 1);
        ds.FPHeapMax fPHeapMax20 = new ds.FPHeapMax((int) (byte) 1);
        ds.Item item21 = null;
        ds.Item[] itemArray22 = new ds.Item[] { item21 };
        fPHeapMax20.copia(itemArray22);
        fPHeapMax18.copia(itemArray22);
        fPHeapMax16.copia(itemArray22);
        fPHeapMax14.copia(itemArray22);
        fPHeapMax14.imprime();
        ds.FPHeapMax fPHeapMax29 = new ds.FPHeapMax((int) ' ');
        fPHeapMax29.refaz((int) (short) 1, (int) (short) 1);
        ds.Item item33 = fPHeapMax29.max();
        ds.FPHeapMax fPHeapMax35 = new ds.FPHeapMax((int) (byte) 1);
        ds.Item item36 = null;
        ds.Item[] itemArray37 = new ds.Item[] { item36 };
        fPHeapMax35.copia(itemArray37);
        fPHeapMax29.copia(itemArray37);
        fPHeapMax14.copia(itemArray37);
        fPHeapMax1.copia(itemArray37);
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMax1.refaz((int) 'a', (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 97");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertNull(item5);
        org.junit.Assert.assertNull(item8);
        org.junit.Assert.assertNull(item10);
        org.junit.Assert.assertNull(item12);
        org.junit.Assert.assertNotNull(itemArray22);
        org.junit.Assert.assertNull(item33);
        org.junit.Assert.assertNotNull(itemArray37);
    }

    @Test
    public void test485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test485");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (byte) 1);
        ds.Item item2 = null;
        ds.Item[] itemArray3 = new ds.Item[] { item2 };
        fPHeapMax1.copia(itemArray3);
        ds.Item item5 = fPHeapMax1.max();
        fPHeapMax1.constroi();
        fPHeapMax1.constroi();
        ds.Item item8 = fPHeapMax1.max();
        fPHeapMax1.constroi();
        fPHeapMax1.constroi();
        ds.FPHeapMax fPHeapMax12 = new ds.FPHeapMax((int) (byte) 1);
        ds.FPHeapMax fPHeapMax14 = new ds.FPHeapMax((int) (byte) 1);
        ds.Item item15 = null;
        ds.Item[] itemArray16 = new ds.Item[] { item15 };
        fPHeapMax14.copia(itemArray16);
        fPHeapMax12.copia(itemArray16);
        fPHeapMax12.imprime();
        ds.FPHeapMax fPHeapMax21 = new ds.FPHeapMax((int) (byte) 1);
        ds.Item item22 = null;
        ds.Item[] itemArray23 = new ds.Item[] { item22 };
        fPHeapMax21.copia(itemArray23);
        ds.Item item25 = fPHeapMax21.max();
        ds.FPHeapMax fPHeapMax27 = new ds.FPHeapMax((int) (byte) 1);
        ds.FPHeapMax fPHeapMax29 = new ds.FPHeapMax((int) (byte) 1);
        ds.Item item30 = null;
        ds.Item[] itemArray31 = new ds.Item[] { item30 };
        fPHeapMax29.copia(itemArray31);
        fPHeapMax27.copia(itemArray31);
        fPHeapMax21.copia(itemArray31);
        fPHeapMax12.copia(itemArray31);
        fPHeapMax1.copia(itemArray31);
        ds.Item item37 = fPHeapMax1.max();
        ds.Item item38 = null;
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMax1.insere(item38);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertNull(item5);
        org.junit.Assert.assertNull(item8);
        org.junit.Assert.assertNotNull(itemArray16);
        org.junit.Assert.assertNotNull(itemArray23);
        org.junit.Assert.assertNull(item25);
        org.junit.Assert.assertNotNull(itemArray31);
        org.junit.Assert.assertNull(item37);
    }

    @Test
    public void test486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test486");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (byte) 1);
        ds.Item item2 = null;
        ds.Item[] itemArray3 = new ds.Item[] { item2 };
        fPHeapMax1.copia(itemArray3);
        ds.Item item5 = fPHeapMax1.max();
        ds.FPHeapMax fPHeapMax7 = new ds.FPHeapMax((int) (byte) 1);
        ds.FPHeapMax fPHeapMax9 = new ds.FPHeapMax((int) (byte) 1);
        ds.Item item10 = null;
        ds.Item[] itemArray11 = new ds.Item[] { item10 };
        fPHeapMax9.copia(itemArray11);
        fPHeapMax7.copia(itemArray11);
        fPHeapMax1.copia(itemArray11);
        ds.FPHeapMax fPHeapMax16 = new ds.FPHeapMax((int) (byte) 1);
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
        org.junit.Assert.assertNull(item5);
        org.junit.Assert.assertNotNull(itemArray11);
        org.junit.Assert.assertNotNull(itemArray18);
    }

    @Test
    public void test487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test487");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (short) 1);
        fPHeapMax1.imprime();
        fPHeapMax1.constroi();
        ds.FPHeapMax fPHeapMax5 = new ds.FPHeapMax((int) ' ');
        fPHeapMax5.imprime();
        ds.FPHeapMax fPHeapMax8 = new ds.FPHeapMax((int) (byte) 1);
        ds.Item item9 = null;
        ds.Item[] itemArray10 = new ds.Item[] { item9 };
        fPHeapMax8.copia(itemArray10);
        ds.Item item12 = fPHeapMax8.max();
        fPHeapMax8.constroi();
        fPHeapMax8.constroi();
        ds.Item item15 = fPHeapMax8.max();
        fPHeapMax8.constroi();
        ds.Item item17 = fPHeapMax8.max();
        fPHeapMax8.imprime();
        ds.FPHeapMax fPHeapMax20 = new ds.FPHeapMax((int) (byte) 1);
        ds.Item item21 = null;
        ds.Item[] itemArray22 = new ds.Item[] { item21 };
        fPHeapMax20.copia(itemArray22);
        ds.Item item24 = fPHeapMax20.max();
        ds.FPHeapMax fPHeapMax26 = new ds.FPHeapMax((int) (byte) 1);
        ds.FPHeapMax fPHeapMax28 = new ds.FPHeapMax((int) (byte) 1);
        ds.Item item29 = null;
        ds.Item[] itemArray30 = new ds.Item[] { item29 };
        fPHeapMax28.copia(itemArray30);
        fPHeapMax26.copia(itemArray30);
        fPHeapMax20.copia(itemArray30);
        fPHeapMax8.copia(itemArray30);
        fPHeapMax5.copia(itemArray30);
        ds.FPHeapMax fPHeapMax37 = new ds.FPHeapMax(10);
        ds.FPHeapMax fPHeapMax39 = new ds.FPHeapMax((int) ' ');
        fPHeapMax39.imprime();
        ds.FPHeapMax fPHeapMax42 = new ds.FPHeapMax((int) (byte) 1);
        ds.FPHeapMax fPHeapMax44 = new ds.FPHeapMax((int) (byte) 1);
        ds.Item item45 = null;
        ds.Item[] itemArray46 = new ds.Item[] { item45 };
        fPHeapMax44.copia(itemArray46);
        fPHeapMax42.copia(itemArray46);
        fPHeapMax42.imprime();
        ds.FPHeapMax fPHeapMax51 = new ds.FPHeapMax((int) (byte) 1);
        ds.Item item52 = null;
        ds.Item[] itemArray53 = new ds.Item[] { item52 };
        fPHeapMax51.copia(itemArray53);
        ds.Item item55 = fPHeapMax51.max();
        ds.FPHeapMax fPHeapMax57 = new ds.FPHeapMax((int) (byte) 1);
        ds.FPHeapMax fPHeapMax59 = new ds.FPHeapMax((int) (byte) 1);
        ds.Item item60 = null;
        ds.Item[] itemArray61 = new ds.Item[] { item60 };
        fPHeapMax59.copia(itemArray61);
        fPHeapMax57.copia(itemArray61);
        fPHeapMax51.copia(itemArray61);
        fPHeapMax42.copia(itemArray61);
        fPHeapMax39.copia(itemArray61);
        fPHeapMax37.copia(itemArray61);
        fPHeapMax5.copia(itemArray61);
        fPHeapMax1.copia(itemArray61);
        ds.Item item70 = fPHeapMax1.max();
        fPHeapMax1.constroi();
        org.junit.Assert.assertNotNull(itemArray10);
        org.junit.Assert.assertNull(item12);
        org.junit.Assert.assertNull(item15);
        org.junit.Assert.assertNull(item17);
        org.junit.Assert.assertNotNull(itemArray22);
        org.junit.Assert.assertNull(item24);
        org.junit.Assert.assertNotNull(itemArray30);
        org.junit.Assert.assertNotNull(itemArray46);
        org.junit.Assert.assertNotNull(itemArray53);
        org.junit.Assert.assertNull(item55);
        org.junit.Assert.assertNotNull(itemArray61);
        org.junit.Assert.assertNull(item70);
    }

    @Test
    public void test488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test488");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (short) 1);
        fPHeapMax1.imprime();
        ds.FPHeapMax fPHeapMax4 = new ds.FPHeapMax((int) ' ');
        fPHeapMax4.refaz((int) (short) 1, (int) (short) 1);
        ds.Item item8 = fPHeapMax4.max();
        ds.FPHeapMax fPHeapMax10 = new ds.FPHeapMax((int) (byte) 1);
        ds.Item item11 = null;
        ds.Item[] itemArray12 = new ds.Item[] { item11 };
        fPHeapMax10.copia(itemArray12);
        fPHeapMax4.copia(itemArray12);
        fPHeapMax4.constroi();
        ds.FPHeapMax fPHeapMax17 = new ds.FPHeapMax((int) (short) 1);
        ds.FPHeapMax fPHeapMax19 = new ds.FPHeapMax(0);
        ds.FPHeapMax fPHeapMax21 = new ds.FPHeapMax((int) (byte) 1);
        ds.FPHeapMax fPHeapMax23 = new ds.FPHeapMax((int) (byte) 1);
        ds.Item item24 = null;
        ds.Item[] itemArray25 = new ds.Item[] { item24 };
        fPHeapMax23.copia(itemArray25);
        fPHeapMax21.copia(itemArray25);
        fPHeapMax19.copia(itemArray25);
        fPHeapMax17.copia(itemArray25);
        fPHeapMax17.imprime();
        ds.FPHeapMax fPHeapMax32 = new ds.FPHeapMax((int) ' ');
        fPHeapMax32.refaz((int) (short) 1, (int) (short) 1);
        ds.Item item36 = fPHeapMax32.max();
        ds.FPHeapMax fPHeapMax38 = new ds.FPHeapMax((int) (byte) 1);
        ds.Item item39 = null;
        ds.Item[] itemArray40 = new ds.Item[] { item39 };
        fPHeapMax38.copia(itemArray40);
        fPHeapMax32.copia(itemArray40);
        fPHeapMax17.copia(itemArray40);
        ds.FPHeapMax fPHeapMax45 = new ds.FPHeapMax((int) (byte) 1);
        ds.Item item46 = null;
        ds.Item[] itemArray47 = new ds.Item[] { item46 };
        fPHeapMax45.copia(itemArray47);
        ds.Item item49 = fPHeapMax45.max();
        fPHeapMax45.constroi();
        fPHeapMax45.constroi();
        ds.Item item52 = fPHeapMax45.max();
        fPHeapMax45.constroi();
        ds.Item item54 = fPHeapMax45.max();
        fPHeapMax45.imprime();
        ds.FPHeapMax fPHeapMax57 = new ds.FPHeapMax((int) (byte) 1);
        ds.Item item58 = null;
        ds.Item[] itemArray59 = new ds.Item[] { item58 };
        fPHeapMax57.copia(itemArray59);
        ds.Item item61 = fPHeapMax57.max();
        ds.FPHeapMax fPHeapMax63 = new ds.FPHeapMax((int) (byte) 1);
        ds.FPHeapMax fPHeapMax65 = new ds.FPHeapMax((int) (byte) 1);
        ds.Item item66 = null;
        ds.Item[] itemArray67 = new ds.Item[] { item66 };
        fPHeapMax65.copia(itemArray67);
        fPHeapMax63.copia(itemArray67);
        fPHeapMax57.copia(itemArray67);
        fPHeapMax45.copia(itemArray67);
        fPHeapMax17.copia(itemArray67);
        fPHeapMax4.copia(itemArray67);
        fPHeapMax1.copia(itemArray67);
        fPHeapMax1.constroi();
        ds.Item item76 = fPHeapMax1.max();
        org.junit.Assert.assertNull(item8);
        org.junit.Assert.assertNotNull(itemArray12);
        org.junit.Assert.assertNotNull(itemArray25);
        org.junit.Assert.assertNull(item36);
        org.junit.Assert.assertNotNull(itemArray40);
        org.junit.Assert.assertNotNull(itemArray47);
        org.junit.Assert.assertNull(item49);
        org.junit.Assert.assertNull(item52);
        org.junit.Assert.assertNull(item54);
        org.junit.Assert.assertNotNull(itemArray59);
        org.junit.Assert.assertNull(item61);
        org.junit.Assert.assertNotNull(itemArray67);
        org.junit.Assert.assertNull(item76);
    }

    @Test
    public void test489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test489");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (byte) 1);
        ds.Item item2 = null;
        ds.Item[] itemArray3 = new ds.Item[] { item2 };
        fPHeapMax1.copia(itemArray3);
        ds.Item item5 = fPHeapMax1.max();
        fPHeapMax1.constroi();
        fPHeapMax1.constroi();
        ds.Item item8 = fPHeapMax1.max();
        fPHeapMax1.constroi();
        fPHeapMax1.constroi();
        ds.FPHeapMax fPHeapMax12 = new ds.FPHeapMax((int) (byte) 1);
        ds.FPHeapMax fPHeapMax14 = new ds.FPHeapMax((int) (byte) 1);
        ds.Item item15 = null;
        ds.Item[] itemArray16 = new ds.Item[] { item15 };
        fPHeapMax14.copia(itemArray16);
        fPHeapMax12.copia(itemArray16);
        fPHeapMax12.imprime();
        ds.FPHeapMax fPHeapMax21 = new ds.FPHeapMax((int) (byte) 1);
        ds.Item item22 = null;
        ds.Item[] itemArray23 = new ds.Item[] { item22 };
        fPHeapMax21.copia(itemArray23);
        ds.Item item25 = fPHeapMax21.max();
        ds.FPHeapMax fPHeapMax27 = new ds.FPHeapMax((int) (byte) 1);
        ds.FPHeapMax fPHeapMax29 = new ds.FPHeapMax((int) (byte) 1);
        ds.Item item30 = null;
        ds.Item[] itemArray31 = new ds.Item[] { item30 };
        fPHeapMax29.copia(itemArray31);
        fPHeapMax27.copia(itemArray31);
        fPHeapMax21.copia(itemArray31);
        fPHeapMax12.copia(itemArray31);
        fPHeapMax1.copia(itemArray31);
        ds.Item item37 = fPHeapMax1.max();
        ds.FPHeapMax fPHeapMax39 = new ds.FPHeapMax((int) (short) 1);
        fPHeapMax39.imprime();
        ds.FPHeapMax fPHeapMax42 = new ds.FPHeapMax((int) (short) 1);
        ds.FPHeapMax fPHeapMax44 = new ds.FPHeapMax(0);
        ds.FPHeapMax fPHeapMax46 = new ds.FPHeapMax((int) (byte) 1);
        ds.FPHeapMax fPHeapMax48 = new ds.FPHeapMax((int) (byte) 1);
        ds.Item item49 = null;
        ds.Item[] itemArray50 = new ds.Item[] { item49 };
        fPHeapMax48.copia(itemArray50);
        fPHeapMax46.copia(itemArray50);
        fPHeapMax44.copia(itemArray50);
        fPHeapMax42.copia(itemArray50);
        fPHeapMax39.copia(itemArray50);
        fPHeapMax1.copia(itemArray50);
        fPHeapMax1.imprime();
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertNull(item5);
        org.junit.Assert.assertNull(item8);
        org.junit.Assert.assertNotNull(itemArray16);
        org.junit.Assert.assertNotNull(itemArray23);
        org.junit.Assert.assertNull(item25);
        org.junit.Assert.assertNotNull(itemArray31);
        org.junit.Assert.assertNull(item37);
        org.junit.Assert.assertNotNull(itemArray50);
    }

    @Test
    public void test490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test490");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (short) 1);
        ds.Item item2 = fPHeapMax1.max();
        fPHeapMax1.constroi();
        fPHeapMax1.imprime();
        ds.Item item5 = fPHeapMax1.max();
        org.junit.Assert.assertNull(item2);
        org.junit.Assert.assertNull(item5);
    }

    @Test
    public void test491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test491");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (byte) 1);
        ds.Item item2 = null;
        ds.Item[] itemArray3 = new ds.Item[] { item2 };
        fPHeapMax1.copia(itemArray3);
        ds.Item item5 = fPHeapMax1.max();
        fPHeapMax1.constroi();
        fPHeapMax1.constroi();
        ds.Item item8 = fPHeapMax1.max();
        fPHeapMax1.constroi();
        fPHeapMax1.imprime();
        ds.FPHeapMax fPHeapMax12 = new ds.FPHeapMax((int) (short) 1);
        fPHeapMax12.imprime();
        fPHeapMax12.constroi();
        ds.FPHeapMax fPHeapMax16 = new ds.FPHeapMax((int) ' ');
        fPHeapMax16.imprime();
        ds.FPHeapMax fPHeapMax19 = new ds.FPHeapMax((int) (byte) 1);
        ds.Item item20 = null;
        ds.Item[] itemArray21 = new ds.Item[] { item20 };
        fPHeapMax19.copia(itemArray21);
        ds.Item item23 = fPHeapMax19.max();
        fPHeapMax19.constroi();
        fPHeapMax19.constroi();
        ds.Item item26 = fPHeapMax19.max();
        fPHeapMax19.constroi();
        ds.Item item28 = fPHeapMax19.max();
        fPHeapMax19.imprime();
        ds.FPHeapMax fPHeapMax31 = new ds.FPHeapMax((int) (byte) 1);
        ds.Item item32 = null;
        ds.Item[] itemArray33 = new ds.Item[] { item32 };
        fPHeapMax31.copia(itemArray33);
        ds.Item item35 = fPHeapMax31.max();
        ds.FPHeapMax fPHeapMax37 = new ds.FPHeapMax((int) (byte) 1);
        ds.FPHeapMax fPHeapMax39 = new ds.FPHeapMax((int) (byte) 1);
        ds.Item item40 = null;
        ds.Item[] itemArray41 = new ds.Item[] { item40 };
        fPHeapMax39.copia(itemArray41);
        fPHeapMax37.copia(itemArray41);
        fPHeapMax31.copia(itemArray41);
        fPHeapMax19.copia(itemArray41);
        fPHeapMax16.copia(itemArray41);
        ds.FPHeapMax fPHeapMax48 = new ds.FPHeapMax(10);
        ds.FPHeapMax fPHeapMax50 = new ds.FPHeapMax((int) ' ');
        fPHeapMax50.imprime();
        ds.FPHeapMax fPHeapMax53 = new ds.FPHeapMax((int) (byte) 1);
        ds.FPHeapMax fPHeapMax55 = new ds.FPHeapMax((int) (byte) 1);
        ds.Item item56 = null;
        ds.Item[] itemArray57 = new ds.Item[] { item56 };
        fPHeapMax55.copia(itemArray57);
        fPHeapMax53.copia(itemArray57);
        fPHeapMax53.imprime();
        ds.FPHeapMax fPHeapMax62 = new ds.FPHeapMax((int) (byte) 1);
        ds.Item item63 = null;
        ds.Item[] itemArray64 = new ds.Item[] { item63 };
        fPHeapMax62.copia(itemArray64);
        ds.Item item66 = fPHeapMax62.max();
        ds.FPHeapMax fPHeapMax68 = new ds.FPHeapMax((int) (byte) 1);
        ds.FPHeapMax fPHeapMax70 = new ds.FPHeapMax((int) (byte) 1);
        ds.Item item71 = null;
        ds.Item[] itemArray72 = new ds.Item[] { item71 };
        fPHeapMax70.copia(itemArray72);
        fPHeapMax68.copia(itemArray72);
        fPHeapMax62.copia(itemArray72);
        fPHeapMax53.copia(itemArray72);
        fPHeapMax50.copia(itemArray72);
        fPHeapMax48.copia(itemArray72);
        fPHeapMax16.copia(itemArray72);
        fPHeapMax12.copia(itemArray72);
        fPHeapMax1.copia(itemArray72);
        java.lang.Class<?> wildcardClass82 = itemArray72.getClass();
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertNull(item5);
        org.junit.Assert.assertNull(item8);
        org.junit.Assert.assertNotNull(itemArray21);
        org.junit.Assert.assertNull(item23);
        org.junit.Assert.assertNull(item26);
        org.junit.Assert.assertNull(item28);
        org.junit.Assert.assertNotNull(itemArray33);
        org.junit.Assert.assertNull(item35);
        org.junit.Assert.assertNotNull(itemArray41);
        org.junit.Assert.assertNotNull(itemArray57);
        org.junit.Assert.assertNotNull(itemArray64);
        org.junit.Assert.assertNull(item66);
        org.junit.Assert.assertNotNull(itemArray72);
        org.junit.Assert.assertNotNull(wildcardClass82);
    }

    @Test
    public void test492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test492");
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
    public void test493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test493");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (byte) 1);
        ds.Item item2 = null;
        ds.Item[] itemArray3 = new ds.Item[] { item2 };
        fPHeapMax1.copia(itemArray3);
        ds.Item item5 = fPHeapMax1.max();
        fPHeapMax1.constroi();
        fPHeapMax1.constroi();
        ds.Item item8 = fPHeapMax1.max();
        fPHeapMax1.constroi();
        ds.Item item10 = fPHeapMax1.max();
        ds.FPHeapMax fPHeapMax12 = new ds.FPHeapMax((int) (byte) 1);
        ds.Item item13 = null;
        ds.Item[] itemArray14 = new ds.Item[] { item13 };
        fPHeapMax12.copia(itemArray14);
        ds.Item item16 = fPHeapMax12.max();
        ds.FPHeapMax fPHeapMax18 = new ds.FPHeapMax((int) (byte) 1);
        ds.FPHeapMax fPHeapMax20 = new ds.FPHeapMax((int) (byte) 1);
        ds.Item item21 = null;
        ds.Item[] itemArray22 = new ds.Item[] { item21 };
        fPHeapMax20.copia(itemArray22);
        fPHeapMax18.copia(itemArray22);
        fPHeapMax12.copia(itemArray22);
        fPHeapMax1.copia(itemArray22);
        fPHeapMax1.imprime();
        fPHeapMax1.constroi();
        ds.FPHeapMax fPHeapMax30 = new ds.FPHeapMax((int) (short) 1);
        ds.FPHeapMax fPHeapMax32 = new ds.FPHeapMax(0);
        ds.FPHeapMax fPHeapMax34 = new ds.FPHeapMax((int) (byte) 1);
        ds.FPHeapMax fPHeapMax36 = new ds.FPHeapMax((int) (byte) 1);
        ds.Item item37 = null;
        ds.Item[] itemArray38 = new ds.Item[] { item37 };
        fPHeapMax36.copia(itemArray38);
        fPHeapMax34.copia(itemArray38);
        fPHeapMax32.copia(itemArray38);
        fPHeapMax30.copia(itemArray38);
        fPHeapMax30.imprime();
        ds.FPHeapMax fPHeapMax45 = new ds.FPHeapMax((int) ' ');
        fPHeapMax45.refaz((int) (short) 1, (int) (short) 1);
        ds.Item item49 = fPHeapMax45.max();
        ds.FPHeapMax fPHeapMax51 = new ds.FPHeapMax((int) (byte) 1);
        ds.Item item52 = null;
        ds.Item[] itemArray53 = new ds.Item[] { item52 };
        fPHeapMax51.copia(itemArray53);
        fPHeapMax45.copia(itemArray53);
        fPHeapMax30.copia(itemArray53);
        fPHeapMax1.copia(itemArray53);
        fPHeapMax1.constroi();
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertNull(item5);
        org.junit.Assert.assertNull(item8);
        org.junit.Assert.assertNull(item10);
        org.junit.Assert.assertNotNull(itemArray14);
        org.junit.Assert.assertNull(item16);
        org.junit.Assert.assertNotNull(itemArray22);
        org.junit.Assert.assertNotNull(itemArray38);
        org.junit.Assert.assertNull(item49);
        org.junit.Assert.assertNotNull(itemArray53);
    }

    @Test
    public void test494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test494");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (byte) 1);
        ds.Item item2 = null;
        ds.Item[] itemArray3 = new ds.Item[] { item2 };
        fPHeapMax1.copia(itemArray3);
        ds.Item item5 = fPHeapMax1.max();
        fPHeapMax1.constroi();
        fPHeapMax1.constroi();
        ds.Item item8 = fPHeapMax1.max();
        fPHeapMax1.constroi();
        ds.Item item10 = fPHeapMax1.max();
        fPHeapMax1.imprime();
        fPHeapMax1.constroi();
        fPHeapMax1.imprime();
        fPHeapMax1.constroi();
        // The following exception was thrown during execution in test generation
        try {
            ds.Item item15 = fPHeapMax1.retiraMax();
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: heap vazio");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertNull(item5);
        org.junit.Assert.assertNull(item8);
        org.junit.Assert.assertNull(item10);
    }

    @Test
    public void test495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test495");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (byte) 1);
        ds.Item item2 = null;
        ds.Item[] itemArray3 = new ds.Item[] { item2 };
        fPHeapMax1.copia(itemArray3);
        ds.Item item5 = fPHeapMax1.max();
        fPHeapMax1.constroi();
        fPHeapMax1.constroi();
        ds.Item item8 = fPHeapMax1.max();
        fPHeapMax1.constroi();
        fPHeapMax1.refaz(0, (int) (short) -1);
        fPHeapMax1.imprime();
        fPHeapMax1.imprime();
        ds.FPHeapMax fPHeapMax16 = new ds.FPHeapMax((int) (byte) 1);
        ds.Item item17 = null;
        ds.Item[] itemArray18 = new ds.Item[] { item17 };
        fPHeapMax16.copia(itemArray18);
        ds.Item item20 = fPHeapMax16.max();
        fPHeapMax16.constroi();
        fPHeapMax16.constroi();
        ds.Item item23 = fPHeapMax16.max();
        fPHeapMax16.constroi();
        ds.Item item25 = fPHeapMax16.max();
        fPHeapMax16.constroi();
        fPHeapMax16.imprime();
        ds.FPHeapMax fPHeapMax29 = new ds.FPHeapMax((int) (byte) 1);
        ds.Item item30 = null;
        ds.Item[] itemArray31 = new ds.Item[] { item30 };
        fPHeapMax29.copia(itemArray31);
        ds.Item item33 = fPHeapMax29.max();
        fPHeapMax29.constroi();
        fPHeapMax29.constroi();
        ds.Item item36 = fPHeapMax29.max();
        fPHeapMax29.constroi();
        fPHeapMax29.imprime();
        ds.Item item39 = fPHeapMax29.max();
        ds.Item item40 = fPHeapMax29.max();
        ds.FPHeapMax fPHeapMax42 = new ds.FPHeapMax((int) ' ');
        fPHeapMax42.imprime();
        ds.FPHeapMax fPHeapMax45 = new ds.FPHeapMax((int) (byte) 1);
        ds.FPHeapMax fPHeapMax47 = new ds.FPHeapMax((int) (byte) 1);
        ds.Item item48 = null;
        ds.Item[] itemArray49 = new ds.Item[] { item48 };
        fPHeapMax47.copia(itemArray49);
        fPHeapMax45.copia(itemArray49);
        fPHeapMax45.imprime();
        ds.FPHeapMax fPHeapMax54 = new ds.FPHeapMax((int) (byte) 1);
        ds.Item item55 = null;
        ds.Item[] itemArray56 = new ds.Item[] { item55 };
        fPHeapMax54.copia(itemArray56);
        ds.Item item58 = fPHeapMax54.max();
        ds.FPHeapMax fPHeapMax60 = new ds.FPHeapMax((int) (byte) 1);
        ds.FPHeapMax fPHeapMax62 = new ds.FPHeapMax((int) (byte) 1);
        ds.Item item63 = null;
        ds.Item[] itemArray64 = new ds.Item[] { item63 };
        fPHeapMax62.copia(itemArray64);
        fPHeapMax60.copia(itemArray64);
        fPHeapMax54.copia(itemArray64);
        fPHeapMax45.copia(itemArray64);
        fPHeapMax42.copia(itemArray64);
        fPHeapMax29.copia(itemArray64);
        fPHeapMax16.copia(itemArray64);
        fPHeapMax1.copia(itemArray64);
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertNull(item5);
        org.junit.Assert.assertNull(item8);
        org.junit.Assert.assertNotNull(itemArray18);
        org.junit.Assert.assertNull(item20);
        org.junit.Assert.assertNull(item23);
        org.junit.Assert.assertNull(item25);
        org.junit.Assert.assertNotNull(itemArray31);
        org.junit.Assert.assertNull(item33);
        org.junit.Assert.assertNull(item36);
        org.junit.Assert.assertNull(item39);
        org.junit.Assert.assertNull(item40);
        org.junit.Assert.assertNotNull(itemArray49);
        org.junit.Assert.assertNotNull(itemArray56);
        org.junit.Assert.assertNull(item58);
        org.junit.Assert.assertNotNull(itemArray64);
    }

    @Test
    public void test496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test496");
        ds.FPHeapMax fPHeapMax1 = new ds.FPHeapMax((int) (byte) 1);
        ds.Item item2 = null;
        ds.Item[] itemArray3 = new ds.Item[] { item2 };
        fPHeapMax1.copia(itemArray3);
        ds.Item item5 = fPHeapMax1.max();
        fPHeapMax1.constroi();
        fPHeapMax1.constroi();
        ds.Item item8 = fPHeapMax1.max();
        fPHeapMax1.constroi();
        ds.Item item10 = fPHeapMax1.max();
        fPHeapMax1.constroi();
        fPHeapMax1.imprime();
        ds.FPHeapMax fPHeapMax14 = new ds.FPHeapMax((int) (byte) 1);
        ds.Item item15 = null;
        ds.Item[] itemArray16 = new ds.Item[] { item15 };
        fPHeapMax14.copia(itemArray16);
        ds.Item item18 = fPHeapMax14.max();
        fPHeapMax14.constroi();
        fPHeapMax14.constroi();
        ds.Item item21 = fPHeapMax14.max();
        fPHeapMax14.constroi();
        fPHeapMax14.imprime();
        ds.Item item24 = fPHeapMax14.max();
        ds.Item item25 = fPHeapMax14.max();
        ds.FPHeapMax fPHeapMax27 = new ds.FPHeapMax((int) ' ');
        fPHeapMax27.imprime();
        ds.FPHeapMax fPHeapMax30 = new ds.FPHeapMax((int) (byte) 1);
        ds.FPHeapMax fPHeapMax32 = new ds.FPHeapMax((int) (byte) 1);
        ds.Item item33 = null;
        ds.Item[] itemArray34 = new ds.Item[] { item33 };
        fPHeapMax32.copia(itemArray34);
        fPHeapMax30.copia(itemArray34);
        fPHeapMax30.imprime();
        ds.FPHeapMax fPHeapMax39 = new ds.FPHeapMax((int) (byte) 1);
        ds.Item item40 = null;
        ds.Item[] itemArray41 = new ds.Item[] { item40 };
        fPHeapMax39.copia(itemArray41);
        ds.Item item43 = fPHeapMax39.max();
        ds.FPHeapMax fPHeapMax45 = new ds.FPHeapMax((int) (byte) 1);
        ds.FPHeapMax fPHeapMax47 = new ds.FPHeapMax((int) (byte) 1);
        ds.Item item48 = null;
        ds.Item[] itemArray49 = new ds.Item[] { item48 };
        fPHeapMax47.copia(itemArray49);
        fPHeapMax45.copia(itemArray49);
        fPHeapMax39.copia(itemArray49);
        fPHeapMax30.copia(itemArray49);
        fPHeapMax27.copia(itemArray49);
        fPHeapMax14.copia(itemArray49);
        fPHeapMax1.copia(itemArray49);
        java.lang.Object obj58 = null;
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMax1.aumentaChave((int) (short) 10, obj58);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 10");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertNull(item5);
        org.junit.Assert.assertNull(item8);
        org.junit.Assert.assertNull(item10);
        org.junit.Assert.assertNotNull(itemArray16);
        org.junit.Assert.assertNull(item18);
        org.junit.Assert.assertNull(item21);
        org.junit.Assert.assertNull(item24);
        org.junit.Assert.assertNull(item25);
        org.junit.Assert.assertNotNull(itemArray34);
        org.junit.Assert.assertNotNull(itemArray41);
        org.junit.Assert.assertNull(item43);
        org.junit.Assert.assertNotNull(itemArray49);
    }
}

