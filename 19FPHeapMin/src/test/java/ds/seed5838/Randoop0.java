package ds.seed5838;

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
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin(0);
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
    public void test003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test003");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin(0);
        // The following exception was thrown during execution in test generation
        try {
            ds.Item item2 = fPHeapMin1.retiraMin();
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: heap vazio");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
    }

    @Test
    public void test004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test004");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin(0);
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMin1.refaz((int) (short) 10, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 10");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test005");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin(0);
        fPHeapMin1.imprime();
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
    public void test006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test006");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin(0);
        fPHeapMin1.imprime();
        fPHeapMin1.imprime();
        ds.FPHeapMin fPHeapMin6 = new ds.FPHeapMin(0);
        fPHeapMin6.imprime();
        ds.Item[] itemArray8 = new ds.Item[] {};
        fPHeapMin6.copia(itemArray8);
        ds.FPHeapMin fPHeapMin10 = new ds.FPHeapMin(itemArray8);
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMin1.diminuiChave((-1), (java.lang.Object) itemArray8);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray8);
    }

    @Test
    public void test007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test007");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin(0);
        fPHeapMin1.imprime();
        ds.Item[] itemArray3 = new ds.Item[] {};
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
    public void test008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test008");
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
    public void test009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test009");
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
    public void test010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test010");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin(0);
        fPHeapMin1.imprime();
        ds.Item[] itemArray3 = new ds.Item[] {};
        fPHeapMin1.copia(itemArray3);
        ds.FPHeapMin fPHeapMin5 = new ds.FPHeapMin(itemArray3);
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMin5.refaz((int) (byte) 1, (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray3);
    }

    @Test
    public void test011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test011");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin(0);
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMin1.refaz(1, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test012");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin(0);
        fPHeapMin1.imprime();
        fPHeapMin1.imprime();
        ds.Item item4 = null;
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMin1.insere(item4);
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: heap cheio");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
    }

    @Test
    public void test013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test013");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin(0);
        fPHeapMin1.imprime();
        ds.Item[] itemArray3 = new ds.Item[] {};
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
    public void test014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test014");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin(0);
        fPHeapMin1.imprime();
        ds.Item[] itemArray3 = new ds.Item[] {};
        fPHeapMin1.copia(itemArray3);
        // The following exception was thrown during execution in test generation
        try {
            ds.Item item5 = fPHeapMin1.min();
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray3);
    }

    @Test
    public void test015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test015");
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
    public void test016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test016");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin(0);
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
    public void test017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test017");
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
    public void test018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test018");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin(0);
        fPHeapMin1.imprime();
        ds.Item[] itemArray3 = new ds.Item[] {};
        fPHeapMin1.copia(itemArray3);
        ds.FPHeapMin fPHeapMin5 = new ds.FPHeapMin(itemArray3);
        fPHeapMin5.constroi();
        ds.Item[] itemArray7 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin8 = new ds.FPHeapMin(itemArray7);
        fPHeapMin5.copia(itemArray7);
        java.lang.Class<?> wildcardClass10 = fPHeapMin5.getClass();
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertNotNull(itemArray7);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test019");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin(0);
        fPHeapMin1.imprime();
        ds.Item[] itemArray3 = new ds.Item[] {};
        fPHeapMin1.copia(itemArray3);
        ds.FPHeapMin fPHeapMin5 = new ds.FPHeapMin(itemArray3);
        ds.FPHeapMin fPHeapMin7 = new ds.FPHeapMin(0);
        fPHeapMin7.imprime();
        ds.Item[] itemArray9 = new ds.Item[] {};
        fPHeapMin7.copia(itemArray9);
        fPHeapMin5.copia(itemArray9);
        // The following exception was thrown during execution in test generation
        try {
            ds.Item item12 = fPHeapMin5.retiraMin();
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: heap vazio");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertNotNull(itemArray9);
    }

    @Test
    public void test020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test020");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin(0);
        fPHeapMin1.imprime();
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMin1.refaz((int) (short) -1, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test021");
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
    public void test022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test022");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin(0);
        fPHeapMin1.imprime();
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMin1.refaz(100, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 100");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test023");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin(0);
        fPHeapMin1.imprime();
        ds.Item[] itemArray3 = new ds.Item[] {};
        fPHeapMin1.copia(itemArray3);
        ds.FPHeapMin fPHeapMin5 = new ds.FPHeapMin(itemArray3);
        ds.FPHeapMin fPHeapMin7 = new ds.FPHeapMin(0);
        fPHeapMin7.imprime();
        ds.Item[] itemArray9 = new ds.Item[] {};
        fPHeapMin7.copia(itemArray9);
        fPHeapMin5.copia(itemArray9);
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
    public void test024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test024");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin(0);
        fPHeapMin1.imprime();
        ds.Item[] itemArray3 = new ds.Item[] {};
        fPHeapMin1.copia(itemArray3);
        fPHeapMin1.constroi();
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMin1.refaz((int) (byte) 100, (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 100");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray3);
    }

    @Test
    public void test025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test025");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin((int) '4');
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
    public void test026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test026");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin(0);
        fPHeapMin1.imprime();
        ds.Item[] itemArray3 = new ds.Item[] {};
        fPHeapMin1.copia(itemArray3);
        ds.FPHeapMin fPHeapMin7 = new ds.FPHeapMin(0);
        fPHeapMin7.imprime();
        ds.Item[] itemArray9 = new ds.Item[] {};
        fPHeapMin7.copia(itemArray9);
        ds.FPHeapMin fPHeapMin11 = new ds.FPHeapMin(itemArray9);
        ds.FPHeapMin fPHeapMin13 = new ds.FPHeapMin(0);
        fPHeapMin13.imprime();
        ds.Item[] itemArray15 = new ds.Item[] {};
        fPHeapMin13.copia(itemArray15);
        fPHeapMin11.copia(itemArray15);
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMin1.diminuiChave((int) ' ', (java.lang.Object) itemArray15);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 32");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertNotNull(itemArray9);
        org.junit.Assert.assertNotNull(itemArray15);
    }

    @Test
    public void test027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test027");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin((int) (short) -1);
        ds.FPHeapMin fPHeapMin3 = new ds.FPHeapMin(0);
        fPHeapMin3.imprime();
        ds.Item[] itemArray5 = new ds.Item[] {};
        fPHeapMin3.copia(itemArray5);
        ds.FPHeapMin fPHeapMin7 = new ds.FPHeapMin(itemArray5);
        fPHeapMin7.constroi();
        ds.Item[] itemArray9 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin10 = new ds.FPHeapMin(itemArray9);
        fPHeapMin7.copia(itemArray9);
        fPHeapMin1.copia(itemArray9);
        // The following exception was thrown during execution in test generation
        try {
            ds.Item item13 = fPHeapMin1.min();
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray5);
        org.junit.Assert.assertNotNull(itemArray9);
    }

    @Test
    public void test028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test028");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin(0);
        fPHeapMin1.imprime();
        ds.Item[] itemArray3 = new ds.Item[] {};
        fPHeapMin1.copia(itemArray3);
        fPHeapMin1.constroi();
        // The following exception was thrown during execution in test generation
        try {
            ds.Item item6 = fPHeapMin1.min();
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray3);
    }

    @Test
    public void test029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test029");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin((int) (short) -1);
        ds.FPHeapMin fPHeapMin3 = new ds.FPHeapMin(0);
        fPHeapMin3.imprime();
        ds.Item[] itemArray5 = new ds.Item[] {};
        fPHeapMin3.copia(itemArray5);
        ds.FPHeapMin fPHeapMin7 = new ds.FPHeapMin(itemArray5);
        fPHeapMin7.constroi();
        ds.Item[] itemArray9 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin10 = new ds.FPHeapMin(itemArray9);
        fPHeapMin7.copia(itemArray9);
        fPHeapMin1.copia(itemArray9);
        ds.FPHeapMin fPHeapMin14 = new ds.FPHeapMin((int) (short) -1);
        ds.FPHeapMin fPHeapMin16 = new ds.FPHeapMin(0);
        fPHeapMin16.imprime();
        ds.Item[] itemArray18 = new ds.Item[] {};
        fPHeapMin16.copia(itemArray18);
        ds.FPHeapMin fPHeapMin20 = new ds.FPHeapMin(itemArray18);
        fPHeapMin20.constroi();
        ds.Item[] itemArray22 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin23 = new ds.FPHeapMin(itemArray22);
        fPHeapMin20.copia(itemArray22);
        fPHeapMin14.copia(itemArray22);
        fPHeapMin1.copia(itemArray22);
        ds.Item item27 = null;
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMin1.insere(item27);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray5);
        org.junit.Assert.assertNotNull(itemArray9);
        org.junit.Assert.assertNotNull(itemArray18);
        org.junit.Assert.assertNotNull(itemArray22);
    }

    @Test
    public void test030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test030");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin((int) (short) -1);
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
    public void test031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test031");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin((int) (short) -1);
        ds.FPHeapMin fPHeapMin3 = new ds.FPHeapMin(0);
        fPHeapMin3.imprime();
        ds.Item[] itemArray5 = new ds.Item[] {};
        fPHeapMin3.copia(itemArray5);
        ds.FPHeapMin fPHeapMin7 = new ds.FPHeapMin(itemArray5);
        fPHeapMin7.constroi();
        ds.Item[] itemArray9 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin10 = new ds.FPHeapMin(itemArray9);
        fPHeapMin7.copia(itemArray9);
        fPHeapMin1.copia(itemArray9);
        ds.FPHeapMin fPHeapMin13 = new ds.FPHeapMin(itemArray9);
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMin13.refaz((int) 'a', (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 97");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray5);
        org.junit.Assert.assertNotNull(itemArray9);
    }

    @Test
    public void test032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test032");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin(0);
        fPHeapMin1.imprime();
        ds.Item[] itemArray3 = new ds.Item[] {};
        fPHeapMin1.copia(itemArray3);
        ds.FPHeapMin fPHeapMin5 = new ds.FPHeapMin(itemArray3);
        ds.FPHeapMin fPHeapMin7 = new ds.FPHeapMin((int) (short) -1);
        ds.FPHeapMin fPHeapMin9 = new ds.FPHeapMin(0);
        fPHeapMin9.imprime();
        ds.Item[] itemArray11 = new ds.Item[] {};
        fPHeapMin9.copia(itemArray11);
        ds.FPHeapMin fPHeapMin13 = new ds.FPHeapMin(itemArray11);
        fPHeapMin13.constroi();
        ds.Item[] itemArray15 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin16 = new ds.FPHeapMin(itemArray15);
        fPHeapMin13.copia(itemArray15);
        fPHeapMin7.copia(itemArray15);
        ds.FPHeapMin fPHeapMin20 = new ds.FPHeapMin((int) (short) -1);
        ds.FPHeapMin fPHeapMin22 = new ds.FPHeapMin(0);
        fPHeapMin22.imprime();
        ds.Item[] itemArray24 = new ds.Item[] {};
        fPHeapMin22.copia(itemArray24);
        ds.FPHeapMin fPHeapMin26 = new ds.FPHeapMin(itemArray24);
        fPHeapMin26.constroi();
        ds.Item[] itemArray28 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin29 = new ds.FPHeapMin(itemArray28);
        fPHeapMin26.copia(itemArray28);
        fPHeapMin20.copia(itemArray28);
        fPHeapMin7.copia(itemArray28);
        fPHeapMin5.copia(itemArray28);
        // The following exception was thrown during execution in test generation
        try {
            ds.Item item34 = fPHeapMin5.min();
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertNotNull(itemArray11);
        org.junit.Assert.assertNotNull(itemArray15);
        org.junit.Assert.assertNotNull(itemArray24);
        org.junit.Assert.assertNotNull(itemArray28);
    }

    @Test
    public void test033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test033");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin(0);
        fPHeapMin1.imprime();
        ds.Item[] itemArray3 = new ds.Item[] {};
        fPHeapMin1.copia(itemArray3);
        fPHeapMin1.constroi();
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMin1.diminuiChave((int) (byte) -1, (java.lang.Object) 1.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray3);
    }

    @Test
    public void test034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test034");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin((int) (short) 1);
        ds.FPHeapMin fPHeapMin4 = new ds.FPHeapMin(0);
        fPHeapMin4.imprime();
        ds.Item[] itemArray6 = new ds.Item[] {};
        fPHeapMin4.copia(itemArray6);
        ds.FPHeapMin fPHeapMin8 = new ds.FPHeapMin(itemArray6);
        ds.FPHeapMin fPHeapMin10 = new ds.FPHeapMin(0);
        fPHeapMin10.imprime();
        ds.Item[] itemArray12 = new ds.Item[] {};
        fPHeapMin10.copia(itemArray12);
        fPHeapMin8.copia(itemArray12);
        ds.FPHeapMin fPHeapMin15 = new ds.FPHeapMin(itemArray12);
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMin1.diminuiChave((int) (short) 100, (java.lang.Object) fPHeapMin15);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 100");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray6);
        org.junit.Assert.assertNotNull(itemArray12);
    }

    @Test
    public void test035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test035");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin((int) (short) -1);
        fPHeapMin1.imprime();
        ds.FPHeapMin fPHeapMin5 = new ds.FPHeapMin(0);
        fPHeapMin5.imprime();
        ds.Item[] itemArray7 = new ds.Item[] {};
        fPHeapMin5.copia(itemArray7);
        ds.FPHeapMin fPHeapMin9 = new ds.FPHeapMin(itemArray7);
        ds.FPHeapMin fPHeapMin11 = new ds.FPHeapMin(0);
        fPHeapMin11.imprime();
        ds.Item[] itemArray13 = new ds.Item[] {};
        fPHeapMin11.copia(itemArray13);
        fPHeapMin9.copia(itemArray13);
        ds.FPHeapMin fPHeapMin16 = new ds.FPHeapMin(itemArray13);
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMin1.diminuiChave((-1), (java.lang.Object) itemArray13);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray7);
        org.junit.Assert.assertNotNull(itemArray13);
    }

    @Test
    public void test036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test036");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin(0);
        fPHeapMin1.imprime();
        ds.FPHeapMin fPHeapMin5 = new ds.FPHeapMin((int) (short) -1);
        ds.FPHeapMin fPHeapMin7 = new ds.FPHeapMin(0);
        fPHeapMin7.imprime();
        ds.Item[] itemArray9 = new ds.Item[] {};
        fPHeapMin7.copia(itemArray9);
        ds.FPHeapMin fPHeapMin11 = new ds.FPHeapMin(itemArray9);
        fPHeapMin11.constroi();
        ds.Item[] itemArray13 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin14 = new ds.FPHeapMin(itemArray13);
        fPHeapMin11.copia(itemArray13);
        fPHeapMin5.copia(itemArray13);
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMin1.diminuiChave((int) '4', (java.lang.Object) fPHeapMin5);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 52");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray9);
        org.junit.Assert.assertNotNull(itemArray13);
    }

    @Test
    public void test037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test037");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin((int) 'a');
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
    public void test038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test038");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin((int) '4');
        ds.Item item2 = fPHeapMin1.min();
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
    public void test039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test039");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin(0);
        fPHeapMin1.imprime();
        ds.Item[] itemArray3 = new ds.Item[] {};
        fPHeapMin1.copia(itemArray3);
        ds.FPHeapMin fPHeapMin5 = new ds.FPHeapMin(itemArray3);
        ds.FPHeapMin fPHeapMin7 = new ds.FPHeapMin(0);
        fPHeapMin7.imprime();
        ds.Item[] itemArray9 = new ds.Item[] {};
        fPHeapMin7.copia(itemArray9);
        fPHeapMin5.copia(itemArray9);
        ds.FPHeapMin fPHeapMin12 = new ds.FPHeapMin(itemArray9);
        ds.FPHeapMin fPHeapMin13 = new ds.FPHeapMin(itemArray9);
        java.lang.Class<?> wildcardClass14 = itemArray9.getClass();
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertNotNull(itemArray9);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test040");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin((int) (short) -1);
        ds.FPHeapMin fPHeapMin3 = new ds.FPHeapMin(0);
        fPHeapMin3.imprime();
        ds.Item[] itemArray5 = new ds.Item[] {};
        fPHeapMin3.copia(itemArray5);
        ds.FPHeapMin fPHeapMin7 = new ds.FPHeapMin(itemArray5);
        fPHeapMin7.constroi();
        ds.Item[] itemArray9 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin10 = new ds.FPHeapMin(itemArray9);
        fPHeapMin7.copia(itemArray9);
        fPHeapMin1.copia(itemArray9);
        java.lang.Class<?> wildcardClass13 = fPHeapMin1.getClass();
        org.junit.Assert.assertNotNull(itemArray5);
        org.junit.Assert.assertNotNull(itemArray9);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test041");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin(0);
        fPHeapMin1.imprime();
        ds.Item[] itemArray3 = new ds.Item[] {};
        fPHeapMin1.copia(itemArray3);
        fPHeapMin1.constroi();
        ds.Item item6 = null;
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMin1.insere(item6);
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: heap cheio");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray3);
    }

    @Test
    public void test042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test042");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin(0);
        fPHeapMin1.imprime();
        ds.Item[] itemArray3 = new ds.Item[] {};
        fPHeapMin1.copia(itemArray3);
        ds.FPHeapMin fPHeapMin5 = new ds.FPHeapMin(itemArray3);
        ds.FPHeapMin fPHeapMin7 = new ds.FPHeapMin((int) (short) -1);
        ds.FPHeapMin fPHeapMin9 = new ds.FPHeapMin(0);
        fPHeapMin9.imprime();
        ds.Item[] itemArray11 = new ds.Item[] {};
        fPHeapMin9.copia(itemArray11);
        ds.FPHeapMin fPHeapMin13 = new ds.FPHeapMin(itemArray11);
        fPHeapMin13.constroi();
        ds.Item[] itemArray15 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin16 = new ds.FPHeapMin(itemArray15);
        fPHeapMin13.copia(itemArray15);
        fPHeapMin7.copia(itemArray15);
        ds.FPHeapMin fPHeapMin20 = new ds.FPHeapMin((int) (short) -1);
        ds.FPHeapMin fPHeapMin22 = new ds.FPHeapMin(0);
        fPHeapMin22.imprime();
        ds.Item[] itemArray24 = new ds.Item[] {};
        fPHeapMin22.copia(itemArray24);
        ds.FPHeapMin fPHeapMin26 = new ds.FPHeapMin(itemArray24);
        fPHeapMin26.constroi();
        ds.Item[] itemArray28 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin29 = new ds.FPHeapMin(itemArray28);
        fPHeapMin26.copia(itemArray28);
        fPHeapMin20.copia(itemArray28);
        fPHeapMin7.copia(itemArray28);
        fPHeapMin5.copia(itemArray28);
        java.lang.Class<?> wildcardClass34 = fPHeapMin5.getClass();
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertNotNull(itemArray11);
        org.junit.Assert.assertNotNull(itemArray15);
        org.junit.Assert.assertNotNull(itemArray24);
        org.junit.Assert.assertNotNull(itemArray28);
        org.junit.Assert.assertNotNull(wildcardClass34);
    }

    @Test
    public void test043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test043");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin((int) (short) -1);
        ds.FPHeapMin fPHeapMin3 = new ds.FPHeapMin(0);
        fPHeapMin3.imprime();
        ds.Item[] itemArray5 = new ds.Item[] {};
        fPHeapMin3.copia(itemArray5);
        ds.FPHeapMin fPHeapMin7 = new ds.FPHeapMin(itemArray5);
        fPHeapMin7.constroi();
        ds.Item[] itemArray9 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin10 = new ds.FPHeapMin(itemArray9);
        fPHeapMin7.copia(itemArray9);
        fPHeapMin1.copia(itemArray9);
        ds.Item[] itemArray13 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin14 = new ds.FPHeapMin(itemArray13);
        fPHeapMin1.copia(itemArray13);
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMin1.refaz((int) (byte) 0, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 0");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray5);
        org.junit.Assert.assertNotNull(itemArray9);
        org.junit.Assert.assertNotNull(itemArray13);
    }

    @Test
    public void test044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test044");
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
    public void test045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test045");
        ds.Item[] itemArray0 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin(itemArray0);
        fPHeapMin1.imprime();
        ds.FPHeapMin fPHeapMin5 = new ds.FPHeapMin(0);
        fPHeapMin5.imprime();
        ds.Item[] itemArray7 = new ds.Item[] {};
        fPHeapMin5.copia(itemArray7);
        ds.FPHeapMin fPHeapMin9 = new ds.FPHeapMin(itemArray7);
        fPHeapMin9.constroi();
        ds.Item[] itemArray11 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin12 = new ds.FPHeapMin(itemArray11);
        fPHeapMin9.copia(itemArray11);
        ds.FPHeapMin fPHeapMin15 = new ds.FPHeapMin((int) (short) -1);
        ds.FPHeapMin fPHeapMin17 = new ds.FPHeapMin(0);
        fPHeapMin17.imprime();
        ds.Item[] itemArray19 = new ds.Item[] {};
        fPHeapMin17.copia(itemArray19);
        ds.FPHeapMin fPHeapMin21 = new ds.FPHeapMin(itemArray19);
        fPHeapMin21.constroi();
        ds.Item[] itemArray23 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin24 = new ds.FPHeapMin(itemArray23);
        fPHeapMin21.copia(itemArray23);
        fPHeapMin15.copia(itemArray23);
        ds.FPHeapMin fPHeapMin28 = new ds.FPHeapMin((int) (short) -1);
        ds.FPHeapMin fPHeapMin30 = new ds.FPHeapMin(0);
        fPHeapMin30.imprime();
        ds.Item[] itemArray32 = new ds.Item[] {};
        fPHeapMin30.copia(itemArray32);
        ds.FPHeapMin fPHeapMin34 = new ds.FPHeapMin(itemArray32);
        fPHeapMin34.constroi();
        ds.Item[] itemArray36 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin37 = new ds.FPHeapMin(itemArray36);
        fPHeapMin34.copia(itemArray36);
        fPHeapMin28.copia(itemArray36);
        fPHeapMin15.copia(itemArray36);
        fPHeapMin9.copia(itemArray36);
        ds.FPHeapMin fPHeapMin43 = new ds.FPHeapMin((int) (short) -1);
        ds.FPHeapMin fPHeapMin45 = new ds.FPHeapMin(0);
        fPHeapMin45.imprime();
        ds.Item[] itemArray47 = new ds.Item[] {};
        fPHeapMin45.copia(itemArray47);
        ds.FPHeapMin fPHeapMin49 = new ds.FPHeapMin(itemArray47);
        fPHeapMin49.constroi();
        ds.Item[] itemArray51 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin52 = new ds.FPHeapMin(itemArray51);
        fPHeapMin49.copia(itemArray51);
        fPHeapMin43.copia(itemArray51);
        fPHeapMin9.copia(itemArray51);
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMin1.diminuiChave((int) (byte) 0, (java.lang.Object) fPHeapMin9);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 0");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray0);
        org.junit.Assert.assertNotNull(itemArray7);
        org.junit.Assert.assertNotNull(itemArray11);
        org.junit.Assert.assertNotNull(itemArray19);
        org.junit.Assert.assertNotNull(itemArray23);
        org.junit.Assert.assertNotNull(itemArray32);
        org.junit.Assert.assertNotNull(itemArray36);
        org.junit.Assert.assertNotNull(itemArray47);
        org.junit.Assert.assertNotNull(itemArray51);
    }

    @Test
    public void test046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test046");
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
    public void test047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test047");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin((int) (short) -1);
        ds.FPHeapMin fPHeapMin3 = new ds.FPHeapMin(0);
        fPHeapMin3.imprime();
        ds.Item[] itemArray5 = new ds.Item[] {};
        fPHeapMin3.copia(itemArray5);
        ds.FPHeapMin fPHeapMin7 = new ds.FPHeapMin(itemArray5);
        fPHeapMin7.constroi();
        ds.Item[] itemArray9 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin10 = new ds.FPHeapMin(itemArray9);
        fPHeapMin7.copia(itemArray9);
        fPHeapMin1.copia(itemArray9);
        fPHeapMin1.imprime();
        ds.Item item14 = null;
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMin1.insere(item14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray5);
        org.junit.Assert.assertNotNull(itemArray9);
    }

    @Test
    public void test048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test048");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin((int) (short) -1);
        fPHeapMin1.imprime();
        java.lang.Class<?> wildcardClass3 = fPHeapMin1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test049");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin((int) (short) -1);
        ds.FPHeapMin fPHeapMin3 = new ds.FPHeapMin(0);
        fPHeapMin3.imprime();
        ds.Item[] itemArray5 = new ds.Item[] {};
        fPHeapMin3.copia(itemArray5);
        ds.FPHeapMin fPHeapMin7 = new ds.FPHeapMin(itemArray5);
        fPHeapMin7.constroi();
        ds.Item[] itemArray9 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin10 = new ds.FPHeapMin(itemArray9);
        fPHeapMin7.copia(itemArray9);
        fPHeapMin1.copia(itemArray9);
        ds.FPHeapMin fPHeapMin14 = new ds.FPHeapMin((int) (short) -1);
        ds.FPHeapMin fPHeapMin16 = new ds.FPHeapMin(0);
        fPHeapMin16.imprime();
        ds.Item[] itemArray18 = new ds.Item[] {};
        fPHeapMin16.copia(itemArray18);
        ds.FPHeapMin fPHeapMin20 = new ds.FPHeapMin(itemArray18);
        fPHeapMin20.constroi();
        ds.Item[] itemArray22 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin23 = new ds.FPHeapMin(itemArray22);
        fPHeapMin20.copia(itemArray22);
        fPHeapMin14.copia(itemArray22);
        fPHeapMin1.copia(itemArray22);
        ds.FPHeapMin fPHeapMin27 = new ds.FPHeapMin(itemArray22);
        ds.FPHeapMin fPHeapMin28 = new ds.FPHeapMin(itemArray22);
        ds.FPHeapMin fPHeapMin31 = new ds.FPHeapMin((int) (short) 1);
        fPHeapMin31.constroi();
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMin28.diminuiChave((int) '#', (java.lang.Object) fPHeapMin31);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 35");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray5);
        org.junit.Assert.assertNotNull(itemArray9);
        org.junit.Assert.assertNotNull(itemArray18);
        org.junit.Assert.assertNotNull(itemArray22);
    }

    @Test
    public void test050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test050");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin((int) (short) -1);
        ds.FPHeapMin fPHeapMin3 = new ds.FPHeapMin(0);
        fPHeapMin3.imprime();
        ds.Item[] itemArray5 = new ds.Item[] {};
        fPHeapMin3.copia(itemArray5);
        ds.FPHeapMin fPHeapMin7 = new ds.FPHeapMin(itemArray5);
        fPHeapMin7.constroi();
        ds.Item[] itemArray9 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin10 = new ds.FPHeapMin(itemArray9);
        fPHeapMin7.copia(itemArray9);
        fPHeapMin1.copia(itemArray9);
        fPHeapMin1.imprime();
        fPHeapMin1.imprime();
        java.lang.Class<?> wildcardClass15 = fPHeapMin1.getClass();
        org.junit.Assert.assertNotNull(itemArray5);
        org.junit.Assert.assertNotNull(itemArray9);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test051");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin(0);
        fPHeapMin1.imprime();
        ds.Item[] itemArray3 = new ds.Item[] {};
        fPHeapMin1.copia(itemArray3);
        // The following exception was thrown during execution in test generation
        try {
            ds.Item item5 = fPHeapMin1.retiraMin();
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: heap vazio");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray3);
    }

    @Test
    public void test052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test052");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin((int) (short) -1);
        ds.FPHeapMin fPHeapMin3 = new ds.FPHeapMin(0);
        fPHeapMin3.imprime();
        ds.Item[] itemArray5 = new ds.Item[] {};
        fPHeapMin3.copia(itemArray5);
        ds.FPHeapMin fPHeapMin7 = new ds.FPHeapMin(itemArray5);
        fPHeapMin7.constroi();
        ds.Item[] itemArray9 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin10 = new ds.FPHeapMin(itemArray9);
        fPHeapMin7.copia(itemArray9);
        fPHeapMin1.copia(itemArray9);
        fPHeapMin1.constroi();
        // The following exception was thrown during execution in test generation
        try {
            ds.Item item14 = fPHeapMin1.min();
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray5);
        org.junit.Assert.assertNotNull(itemArray9);
    }

    @Test
    public void test053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test053");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin((int) '4');
        ds.Item item2 = fPHeapMin1.min();
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMin1.refaz((int) (short) -1, (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(item2);
    }

    @Test
    public void test054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test054");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin(0);
        fPHeapMin1.imprime();
        ds.Item[] itemArray3 = new ds.Item[] {};
        fPHeapMin1.copia(itemArray3);
        ds.FPHeapMin fPHeapMin5 = new ds.FPHeapMin(itemArray3);
        ds.FPHeapMin fPHeapMin7 = new ds.FPHeapMin(0);
        fPHeapMin7.imprime();
        ds.Item[] itemArray9 = new ds.Item[] {};
        fPHeapMin7.copia(itemArray9);
        fPHeapMin5.copia(itemArray9);
        fPHeapMin5.constroi();
        // The following exception was thrown during execution in test generation
        try {
            ds.Item item13 = fPHeapMin5.min();
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertNotNull(itemArray9);
    }

    @Test
    public void test055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test055");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin((int) (short) -1);
        fPHeapMin1.imprime();
        fPHeapMin1.imprime();
        fPHeapMin1.imprime();
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
    public void test056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test056");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin((int) (short) -1);
        fPHeapMin1.imprime();
        fPHeapMin1.imprime();
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMin1.refaz((int) (byte) -1, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test057");
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
    public void test058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test058");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin((int) (short) -1);
        ds.FPHeapMin fPHeapMin3 = new ds.FPHeapMin(0);
        fPHeapMin3.imprime();
        ds.Item[] itemArray5 = new ds.Item[] {};
        fPHeapMin3.copia(itemArray5);
        ds.FPHeapMin fPHeapMin7 = new ds.FPHeapMin(itemArray5);
        fPHeapMin7.constroi();
        ds.Item[] itemArray9 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin10 = new ds.FPHeapMin(itemArray9);
        fPHeapMin7.copia(itemArray9);
        fPHeapMin1.copia(itemArray9);
        fPHeapMin1.constroi();
        java.lang.Class<?> wildcardClass14 = fPHeapMin1.getClass();
        org.junit.Assert.assertNotNull(itemArray5);
        org.junit.Assert.assertNotNull(itemArray9);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test059");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin(0);
        fPHeapMin1.imprime();
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMin1.refaz((int) (short) 0, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test060");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin((int) (short) -1);
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
    public void test061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test061");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin((int) (short) -1);
        fPHeapMin1.imprime();
        fPHeapMin1.imprime();
        fPHeapMin1.imprime();
        fPHeapMin1.constroi();
        ds.Item[] itemArray6 = null;
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMin1.copia(itemArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test062");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin(0);
        fPHeapMin1.imprime();
        fPHeapMin1.imprime();
        fPHeapMin1.imprime();
        ds.Item item5 = null;
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMin1.insere(item5);
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: heap cheio");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
    }

    @Test
    public void test063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test063");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin(0);
        fPHeapMin1.imprime();
        ds.Item[] itemArray3 = new ds.Item[] {};
        fPHeapMin1.copia(itemArray3);
        ds.FPHeapMin fPHeapMin5 = new ds.FPHeapMin(itemArray3);
        ds.FPHeapMin fPHeapMin7 = new ds.FPHeapMin(0);
        fPHeapMin7.imprime();
        ds.Item[] itemArray9 = new ds.Item[] {};
        fPHeapMin7.copia(itemArray9);
        fPHeapMin5.copia(itemArray9);
        fPHeapMin5.constroi();
        ds.FPHeapMin fPHeapMin14 = new ds.FPHeapMin((int) (short) -1);
        ds.FPHeapMin fPHeapMin16 = new ds.FPHeapMin(0);
        fPHeapMin16.imprime();
        ds.Item[] itemArray18 = new ds.Item[] {};
        fPHeapMin16.copia(itemArray18);
        ds.FPHeapMin fPHeapMin20 = new ds.FPHeapMin(itemArray18);
        fPHeapMin20.constroi();
        ds.Item[] itemArray22 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin23 = new ds.FPHeapMin(itemArray22);
        fPHeapMin20.copia(itemArray22);
        fPHeapMin14.copia(itemArray22);
        ds.FPHeapMin fPHeapMin27 = new ds.FPHeapMin((int) (short) -1);
        ds.FPHeapMin fPHeapMin29 = new ds.FPHeapMin(0);
        fPHeapMin29.imprime();
        ds.Item[] itemArray31 = new ds.Item[] {};
        fPHeapMin29.copia(itemArray31);
        ds.FPHeapMin fPHeapMin33 = new ds.FPHeapMin(itemArray31);
        fPHeapMin33.constroi();
        ds.Item[] itemArray35 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin36 = new ds.FPHeapMin(itemArray35);
        fPHeapMin33.copia(itemArray35);
        fPHeapMin27.copia(itemArray35);
        fPHeapMin14.copia(itemArray35);
        ds.FPHeapMin fPHeapMin40 = new ds.FPHeapMin(itemArray35);
        fPHeapMin5.copia(itemArray35);
        java.lang.Class<?> wildcardClass42 = itemArray35.getClass();
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertNotNull(itemArray9);
        org.junit.Assert.assertNotNull(itemArray18);
        org.junit.Assert.assertNotNull(itemArray22);
        org.junit.Assert.assertNotNull(itemArray31);
        org.junit.Assert.assertNotNull(itemArray35);
        org.junit.Assert.assertNotNull(wildcardClass42);
    }

    @Test
    public void test064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test064");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin((int) (short) -1);
        java.lang.Class<?> wildcardClass2 = fPHeapMin1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test065");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin(0);
        fPHeapMin1.imprime();
        ds.Item[] itemArray3 = new ds.Item[] {};
        fPHeapMin1.copia(itemArray3);
        ds.FPHeapMin fPHeapMin5 = new ds.FPHeapMin(itemArray3);
        fPHeapMin5.constroi();
        ds.Item[] itemArray7 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin8 = new ds.FPHeapMin(itemArray7);
        fPHeapMin5.copia(itemArray7);
        // The following exception was thrown during execution in test generation
        try {
            ds.Item item10 = fPHeapMin5.min();
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertNotNull(itemArray7);
    }

    @Test
    public void test066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test066");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin(0);
        fPHeapMin1.imprime();
        ds.Item[] itemArray3 = new ds.Item[] {};
        fPHeapMin1.copia(itemArray3);
        ds.FPHeapMin fPHeapMin5 = new ds.FPHeapMin(itemArray3);
        ds.FPHeapMin fPHeapMin7 = new ds.FPHeapMin(0);
        fPHeapMin7.imprime();
        ds.Item[] itemArray9 = new ds.Item[] {};
        fPHeapMin7.copia(itemArray9);
        fPHeapMin5.copia(itemArray9);
        fPHeapMin5.constroi();
        ds.FPHeapMin fPHeapMin14 = new ds.FPHeapMin((int) (short) -1);
        ds.FPHeapMin fPHeapMin16 = new ds.FPHeapMin(0);
        fPHeapMin16.imprime();
        ds.Item[] itemArray18 = new ds.Item[] {};
        fPHeapMin16.copia(itemArray18);
        ds.FPHeapMin fPHeapMin20 = new ds.FPHeapMin(itemArray18);
        fPHeapMin20.constroi();
        ds.Item[] itemArray22 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin23 = new ds.FPHeapMin(itemArray22);
        fPHeapMin20.copia(itemArray22);
        fPHeapMin14.copia(itemArray22);
        ds.FPHeapMin fPHeapMin27 = new ds.FPHeapMin((int) (short) -1);
        ds.FPHeapMin fPHeapMin29 = new ds.FPHeapMin(0);
        fPHeapMin29.imprime();
        ds.Item[] itemArray31 = new ds.Item[] {};
        fPHeapMin29.copia(itemArray31);
        ds.FPHeapMin fPHeapMin33 = new ds.FPHeapMin(itemArray31);
        fPHeapMin33.constroi();
        ds.Item[] itemArray35 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin36 = new ds.FPHeapMin(itemArray35);
        fPHeapMin33.copia(itemArray35);
        fPHeapMin27.copia(itemArray35);
        fPHeapMin14.copia(itemArray35);
        ds.FPHeapMin fPHeapMin40 = new ds.FPHeapMin(itemArray35);
        fPHeapMin5.copia(itemArray35);
        fPHeapMin5.constroi();
        // The following exception was thrown during execution in test generation
        try {
            ds.Item item43 = fPHeapMin5.min();
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertNotNull(itemArray9);
        org.junit.Assert.assertNotNull(itemArray18);
        org.junit.Assert.assertNotNull(itemArray22);
        org.junit.Assert.assertNotNull(itemArray31);
        org.junit.Assert.assertNotNull(itemArray35);
    }

    @Test
    public void test067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test067");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin(0);
        fPHeapMin1.imprime();
        ds.Item[] itemArray3 = new ds.Item[] {};
        fPHeapMin1.copia(itemArray3);
        ds.FPHeapMin fPHeapMin5 = new ds.FPHeapMin(itemArray3);
        fPHeapMin5.constroi();
        ds.Item[] itemArray7 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin8 = new ds.FPHeapMin(itemArray7);
        fPHeapMin5.copia(itemArray7);
        ds.FPHeapMin fPHeapMin11 = new ds.FPHeapMin((int) (short) -1);
        ds.FPHeapMin fPHeapMin13 = new ds.FPHeapMin(0);
        fPHeapMin13.imprime();
        ds.Item[] itemArray15 = new ds.Item[] {};
        fPHeapMin13.copia(itemArray15);
        ds.FPHeapMin fPHeapMin17 = new ds.FPHeapMin(itemArray15);
        fPHeapMin17.constroi();
        ds.Item[] itemArray19 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin20 = new ds.FPHeapMin(itemArray19);
        fPHeapMin17.copia(itemArray19);
        fPHeapMin11.copia(itemArray19);
        ds.FPHeapMin fPHeapMin23 = new ds.FPHeapMin(itemArray19);
        fPHeapMin5.copia(itemArray19);
        ds.FPHeapMin fPHeapMin27 = new ds.FPHeapMin(0);
        fPHeapMin27.imprime();
        ds.Item[] itemArray29 = new ds.Item[] {};
        fPHeapMin27.copia(itemArray29);
        ds.FPHeapMin fPHeapMin31 = new ds.FPHeapMin(itemArray29);
        ds.FPHeapMin fPHeapMin33 = new ds.FPHeapMin((int) (short) -1);
        ds.FPHeapMin fPHeapMin35 = new ds.FPHeapMin(0);
        fPHeapMin35.imprime();
        ds.Item[] itemArray37 = new ds.Item[] {};
        fPHeapMin35.copia(itemArray37);
        ds.FPHeapMin fPHeapMin39 = new ds.FPHeapMin(itemArray37);
        fPHeapMin39.constroi();
        ds.Item[] itemArray41 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin42 = new ds.FPHeapMin(itemArray41);
        fPHeapMin39.copia(itemArray41);
        fPHeapMin33.copia(itemArray41);
        ds.FPHeapMin fPHeapMin46 = new ds.FPHeapMin((int) (short) -1);
        ds.FPHeapMin fPHeapMin48 = new ds.FPHeapMin(0);
        fPHeapMin48.imprime();
        ds.Item[] itemArray50 = new ds.Item[] {};
        fPHeapMin48.copia(itemArray50);
        ds.FPHeapMin fPHeapMin52 = new ds.FPHeapMin(itemArray50);
        fPHeapMin52.constroi();
        ds.Item[] itemArray54 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin55 = new ds.FPHeapMin(itemArray54);
        fPHeapMin52.copia(itemArray54);
        fPHeapMin46.copia(itemArray54);
        fPHeapMin33.copia(itemArray54);
        fPHeapMin31.copia(itemArray54);
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMin5.diminuiChave((int) (short) 10, (java.lang.Object) itemArray54);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 10");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertNotNull(itemArray7);
        org.junit.Assert.assertNotNull(itemArray15);
        org.junit.Assert.assertNotNull(itemArray19);
        org.junit.Assert.assertNotNull(itemArray29);
        org.junit.Assert.assertNotNull(itemArray37);
        org.junit.Assert.assertNotNull(itemArray41);
        org.junit.Assert.assertNotNull(itemArray50);
        org.junit.Assert.assertNotNull(itemArray54);
    }

    @Test
    public void test068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test068");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin((int) '4');
        ds.Item item2 = fPHeapMin1.min();
        ds.FPHeapMin fPHeapMin4 = new ds.FPHeapMin((int) (short) -1);
        ds.FPHeapMin fPHeapMin6 = new ds.FPHeapMin(0);
        fPHeapMin6.imprime();
        ds.Item[] itemArray8 = new ds.Item[] {};
        fPHeapMin6.copia(itemArray8);
        ds.FPHeapMin fPHeapMin10 = new ds.FPHeapMin(itemArray8);
        fPHeapMin10.constroi();
        ds.Item[] itemArray12 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin13 = new ds.FPHeapMin(itemArray12);
        fPHeapMin10.copia(itemArray12);
        fPHeapMin4.copia(itemArray12);
        ds.FPHeapMin fPHeapMin17 = new ds.FPHeapMin((int) (short) -1);
        ds.FPHeapMin fPHeapMin19 = new ds.FPHeapMin(0);
        fPHeapMin19.imprime();
        ds.Item[] itemArray21 = new ds.Item[] {};
        fPHeapMin19.copia(itemArray21);
        ds.FPHeapMin fPHeapMin23 = new ds.FPHeapMin(itemArray21);
        fPHeapMin23.constroi();
        ds.Item[] itemArray25 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin26 = new ds.FPHeapMin(itemArray25);
        fPHeapMin23.copia(itemArray25);
        fPHeapMin17.copia(itemArray25);
        fPHeapMin4.copia(itemArray25);
        fPHeapMin1.copia(itemArray25);
        // The following exception was thrown during execution in test generation
        try {
            ds.Item item31 = fPHeapMin1.retiraMin();
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: heap vazio");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(item2);
        org.junit.Assert.assertNotNull(itemArray8);
        org.junit.Assert.assertNotNull(itemArray12);
        org.junit.Assert.assertNotNull(itemArray21);
        org.junit.Assert.assertNotNull(itemArray25);
    }

    @Test
    public void test069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test069");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin((int) '4');
        ds.Item item2 = fPHeapMin1.min();
        ds.Item[] itemArray3 = new ds.Item[] {};
        fPHeapMin1.copia(itemArray3);
        ds.FPHeapMin fPHeapMin5 = new ds.FPHeapMin(itemArray3);
        ds.FPHeapMin fPHeapMin8 = new ds.FPHeapMin(0);
        fPHeapMin8.imprime();
        ds.Item[] itemArray10 = new ds.Item[] {};
        fPHeapMin8.copia(itemArray10);
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMin5.diminuiChave((int) (short) 1, (java.lang.Object) itemArray10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(item2);
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertNotNull(itemArray10);
    }

    @Test
    public void test070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test070");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin(0);
        fPHeapMin1.imprime();
        ds.Item[] itemArray3 = new ds.Item[] {};
        fPHeapMin1.copia(itemArray3);
        ds.FPHeapMin fPHeapMin5 = new ds.FPHeapMin(itemArray3);
        ds.FPHeapMin fPHeapMin7 = new ds.FPHeapMin(0);
        fPHeapMin7.imprime();
        ds.Item[] itemArray9 = new ds.Item[] {};
        fPHeapMin7.copia(itemArray9);
        fPHeapMin5.copia(itemArray9);
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
    public void test071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test071");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin(0);
        fPHeapMin1.imprime();
        ds.Item[] itemArray3 = new ds.Item[] {};
        fPHeapMin1.copia(itemArray3);
        ds.FPHeapMin fPHeapMin5 = new ds.FPHeapMin(itemArray3);
        ds.FPHeapMin fPHeapMin7 = new ds.FPHeapMin(0);
        fPHeapMin7.imprime();
        ds.Item[] itemArray9 = new ds.Item[] {};
        fPHeapMin7.copia(itemArray9);
        fPHeapMin5.copia(itemArray9);
        ds.FPHeapMin fPHeapMin12 = new ds.FPHeapMin(itemArray9);
        ds.FPHeapMin fPHeapMin14 = new ds.FPHeapMin(0);
        fPHeapMin14.imprime();
        ds.Item[] itemArray16 = new ds.Item[] {};
        fPHeapMin14.copia(itemArray16);
        ds.FPHeapMin fPHeapMin18 = new ds.FPHeapMin(itemArray16);
        fPHeapMin18.constroi();
        ds.Item[] itemArray20 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin21 = new ds.FPHeapMin(itemArray20);
        fPHeapMin18.copia(itemArray20);
        ds.FPHeapMin fPHeapMin24 = new ds.FPHeapMin((int) (short) -1);
        ds.FPHeapMin fPHeapMin26 = new ds.FPHeapMin(0);
        fPHeapMin26.imprime();
        ds.Item[] itemArray28 = new ds.Item[] {};
        fPHeapMin26.copia(itemArray28);
        ds.FPHeapMin fPHeapMin30 = new ds.FPHeapMin(itemArray28);
        fPHeapMin30.constroi();
        ds.Item[] itemArray32 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin33 = new ds.FPHeapMin(itemArray32);
        fPHeapMin30.copia(itemArray32);
        fPHeapMin24.copia(itemArray32);
        ds.FPHeapMin fPHeapMin37 = new ds.FPHeapMin((int) (short) -1);
        ds.FPHeapMin fPHeapMin39 = new ds.FPHeapMin(0);
        fPHeapMin39.imprime();
        ds.Item[] itemArray41 = new ds.Item[] {};
        fPHeapMin39.copia(itemArray41);
        ds.FPHeapMin fPHeapMin43 = new ds.FPHeapMin(itemArray41);
        fPHeapMin43.constroi();
        ds.Item[] itemArray45 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin46 = new ds.FPHeapMin(itemArray45);
        fPHeapMin43.copia(itemArray45);
        fPHeapMin37.copia(itemArray45);
        fPHeapMin24.copia(itemArray45);
        fPHeapMin18.copia(itemArray45);
        fPHeapMin12.copia(itemArray45);
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMin12.refaz((int) (byte) 10, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 10");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertNotNull(itemArray9);
        org.junit.Assert.assertNotNull(itemArray16);
        org.junit.Assert.assertNotNull(itemArray20);
        org.junit.Assert.assertNotNull(itemArray28);
        org.junit.Assert.assertNotNull(itemArray32);
        org.junit.Assert.assertNotNull(itemArray41);
        org.junit.Assert.assertNotNull(itemArray45);
    }

    @Test
    public void test072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test072");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin(0);
        fPHeapMin1.imprime();
        ds.Item[] itemArray3 = new ds.Item[] {};
        fPHeapMin1.copia(itemArray3);
        ds.FPHeapMin fPHeapMin5 = new ds.FPHeapMin(itemArray3);
        ds.FPHeapMin fPHeapMin7 = new ds.FPHeapMin(0);
        fPHeapMin7.imprime();
        ds.Item[] itemArray9 = new ds.Item[] {};
        fPHeapMin7.copia(itemArray9);
        fPHeapMin5.copia(itemArray9);
        fPHeapMin5.constroi();
        // The following exception was thrown during execution in test generation
        try {
            ds.Item item13 = fPHeapMin5.retiraMin();
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: heap vazio");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertNotNull(itemArray9);
    }

    @Test
    public void test073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test073");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin(0);
        fPHeapMin1.imprime();
        ds.Item[] itemArray3 = new ds.Item[] {};
        fPHeapMin1.copia(itemArray3);
        ds.FPHeapMin fPHeapMin5 = new ds.FPHeapMin(itemArray3);
        ds.FPHeapMin fPHeapMin7 = new ds.FPHeapMin(0);
        fPHeapMin7.imprime();
        ds.Item[] itemArray9 = new ds.Item[] {};
        fPHeapMin7.copia(itemArray9);
        fPHeapMin5.copia(itemArray9);
        fPHeapMin5.constroi();
        ds.FPHeapMin fPHeapMin14 = new ds.FPHeapMin((int) (short) -1);
        ds.FPHeapMin fPHeapMin16 = new ds.FPHeapMin(0);
        fPHeapMin16.imprime();
        ds.Item[] itemArray18 = new ds.Item[] {};
        fPHeapMin16.copia(itemArray18);
        ds.FPHeapMin fPHeapMin20 = new ds.FPHeapMin(itemArray18);
        fPHeapMin20.constroi();
        ds.Item[] itemArray22 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin23 = new ds.FPHeapMin(itemArray22);
        fPHeapMin20.copia(itemArray22);
        fPHeapMin14.copia(itemArray22);
        ds.FPHeapMin fPHeapMin27 = new ds.FPHeapMin((int) (short) -1);
        ds.FPHeapMin fPHeapMin29 = new ds.FPHeapMin(0);
        fPHeapMin29.imprime();
        ds.Item[] itemArray31 = new ds.Item[] {};
        fPHeapMin29.copia(itemArray31);
        ds.FPHeapMin fPHeapMin33 = new ds.FPHeapMin(itemArray31);
        fPHeapMin33.constroi();
        ds.Item[] itemArray35 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin36 = new ds.FPHeapMin(itemArray35);
        fPHeapMin33.copia(itemArray35);
        fPHeapMin27.copia(itemArray35);
        fPHeapMin14.copia(itemArray35);
        ds.FPHeapMin fPHeapMin40 = new ds.FPHeapMin(itemArray35);
        fPHeapMin5.copia(itemArray35);
        ds.FPHeapMin fPHeapMin43 = new ds.FPHeapMin(0);
        fPHeapMin43.imprime();
        ds.Item[] itemArray45 = new ds.Item[] {};
        fPHeapMin43.copia(itemArray45);
        ds.FPHeapMin fPHeapMin47 = new ds.FPHeapMin(itemArray45);
        ds.FPHeapMin fPHeapMin49 = new ds.FPHeapMin(0);
        fPHeapMin49.imprime();
        ds.Item[] itemArray51 = new ds.Item[] {};
        fPHeapMin49.copia(itemArray51);
        fPHeapMin47.copia(itemArray51);
        ds.FPHeapMin fPHeapMin54 = new ds.FPHeapMin(itemArray51);
        ds.FPHeapMin fPHeapMin56 = new ds.FPHeapMin(0);
        fPHeapMin56.imprime();
        ds.Item[] itemArray58 = new ds.Item[] {};
        fPHeapMin56.copia(itemArray58);
        ds.FPHeapMin fPHeapMin60 = new ds.FPHeapMin(itemArray58);
        fPHeapMin60.constroi();
        ds.Item[] itemArray62 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin63 = new ds.FPHeapMin(itemArray62);
        fPHeapMin60.copia(itemArray62);
        ds.FPHeapMin fPHeapMin66 = new ds.FPHeapMin((int) (short) -1);
        ds.FPHeapMin fPHeapMin68 = new ds.FPHeapMin(0);
        fPHeapMin68.imprime();
        ds.Item[] itemArray70 = new ds.Item[] {};
        fPHeapMin68.copia(itemArray70);
        ds.FPHeapMin fPHeapMin72 = new ds.FPHeapMin(itemArray70);
        fPHeapMin72.constroi();
        ds.Item[] itemArray74 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin75 = new ds.FPHeapMin(itemArray74);
        fPHeapMin72.copia(itemArray74);
        fPHeapMin66.copia(itemArray74);
        ds.FPHeapMin fPHeapMin79 = new ds.FPHeapMin((int) (short) -1);
        ds.FPHeapMin fPHeapMin81 = new ds.FPHeapMin(0);
        fPHeapMin81.imprime();
        ds.Item[] itemArray83 = new ds.Item[] {};
        fPHeapMin81.copia(itemArray83);
        ds.FPHeapMin fPHeapMin85 = new ds.FPHeapMin(itemArray83);
        fPHeapMin85.constroi();
        ds.Item[] itemArray87 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin88 = new ds.FPHeapMin(itemArray87);
        fPHeapMin85.copia(itemArray87);
        fPHeapMin79.copia(itemArray87);
        fPHeapMin66.copia(itemArray87);
        fPHeapMin60.copia(itemArray87);
        fPHeapMin54.copia(itemArray87);
        fPHeapMin5.copia(itemArray87);
        java.lang.Class<?> wildcardClass95 = fPHeapMin5.getClass();
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertNotNull(itemArray9);
        org.junit.Assert.assertNotNull(itemArray18);
        org.junit.Assert.assertNotNull(itemArray22);
        org.junit.Assert.assertNotNull(itemArray31);
        org.junit.Assert.assertNotNull(itemArray35);
        org.junit.Assert.assertNotNull(itemArray45);
        org.junit.Assert.assertNotNull(itemArray51);
        org.junit.Assert.assertNotNull(itemArray58);
        org.junit.Assert.assertNotNull(itemArray62);
        org.junit.Assert.assertNotNull(itemArray70);
        org.junit.Assert.assertNotNull(itemArray74);
        org.junit.Assert.assertNotNull(itemArray83);
        org.junit.Assert.assertNotNull(itemArray87);
        org.junit.Assert.assertNotNull(wildcardClass95);
    }

    @Test
    public void test074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test074");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin((int) (short) -1);
        ds.FPHeapMin fPHeapMin3 = new ds.FPHeapMin(0);
        fPHeapMin3.imprime();
        ds.Item[] itemArray5 = new ds.Item[] {};
        fPHeapMin3.copia(itemArray5);
        ds.FPHeapMin fPHeapMin7 = new ds.FPHeapMin(itemArray5);
        fPHeapMin7.constroi();
        ds.Item[] itemArray9 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin10 = new ds.FPHeapMin(itemArray9);
        fPHeapMin7.copia(itemArray9);
        fPHeapMin1.copia(itemArray9);
        ds.Item[] itemArray13 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin14 = new ds.FPHeapMin(itemArray13);
        fPHeapMin1.copia(itemArray13);
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMin1.refaz((int) (short) 100, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 100");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray5);
        org.junit.Assert.assertNotNull(itemArray9);
        org.junit.Assert.assertNotNull(itemArray13);
    }

    @Test
    public void test075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test075");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin((int) (short) -1);
        ds.FPHeapMin fPHeapMin3 = new ds.FPHeapMin(0);
        fPHeapMin3.imprime();
        ds.Item[] itemArray5 = new ds.Item[] {};
        fPHeapMin3.copia(itemArray5);
        ds.FPHeapMin fPHeapMin7 = new ds.FPHeapMin(itemArray5);
        fPHeapMin7.constroi();
        ds.Item[] itemArray9 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin10 = new ds.FPHeapMin(itemArray9);
        fPHeapMin7.copia(itemArray9);
        fPHeapMin1.copia(itemArray9);
        ds.FPHeapMin fPHeapMin14 = new ds.FPHeapMin((int) (short) -1);
        ds.FPHeapMin fPHeapMin16 = new ds.FPHeapMin(0);
        fPHeapMin16.imprime();
        ds.Item[] itemArray18 = new ds.Item[] {};
        fPHeapMin16.copia(itemArray18);
        ds.FPHeapMin fPHeapMin20 = new ds.FPHeapMin(itemArray18);
        fPHeapMin20.constroi();
        ds.Item[] itemArray22 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin23 = new ds.FPHeapMin(itemArray22);
        fPHeapMin20.copia(itemArray22);
        fPHeapMin14.copia(itemArray22);
        fPHeapMin1.copia(itemArray22);
        ds.FPHeapMin fPHeapMin28 = new ds.FPHeapMin((int) (byte) 100);
        ds.FPHeapMin fPHeapMin30 = new ds.FPHeapMin(0);
        fPHeapMin30.imprime();
        ds.Item[] itemArray32 = new ds.Item[] {};
        fPHeapMin30.copia(itemArray32);
        ds.FPHeapMin fPHeapMin34 = new ds.FPHeapMin(itemArray32);
        ds.FPHeapMin fPHeapMin36 = new ds.FPHeapMin(0);
        fPHeapMin36.imprime();
        ds.Item[] itemArray38 = new ds.Item[] {};
        fPHeapMin36.copia(itemArray38);
        fPHeapMin34.copia(itemArray38);
        fPHeapMin28.copia(itemArray38);
        fPHeapMin1.copia(itemArray38);
        ds.FPHeapMin fPHeapMin44 = new ds.FPHeapMin(0);
        fPHeapMin44.imprime();
        ds.Item[] itemArray46 = new ds.Item[] {};
        fPHeapMin44.copia(itemArray46);
        ds.FPHeapMin fPHeapMin48 = new ds.FPHeapMin(itemArray46);
        fPHeapMin48.constroi();
        ds.Item[] itemArray50 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin51 = new ds.FPHeapMin(itemArray50);
        fPHeapMin48.copia(itemArray50);
        ds.FPHeapMin fPHeapMin54 = new ds.FPHeapMin((int) (short) -1);
        ds.FPHeapMin fPHeapMin56 = new ds.FPHeapMin(0);
        fPHeapMin56.imprime();
        ds.Item[] itemArray58 = new ds.Item[] {};
        fPHeapMin56.copia(itemArray58);
        ds.FPHeapMin fPHeapMin60 = new ds.FPHeapMin(itemArray58);
        fPHeapMin60.constroi();
        ds.Item[] itemArray62 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin63 = new ds.FPHeapMin(itemArray62);
        fPHeapMin60.copia(itemArray62);
        fPHeapMin54.copia(itemArray62);
        ds.FPHeapMin fPHeapMin66 = new ds.FPHeapMin(itemArray62);
        fPHeapMin48.copia(itemArray62);
        fPHeapMin1.copia(itemArray62);
        // The following exception was thrown during execution in test generation
        try {
            ds.Item item69 = fPHeapMin1.retiraMin();
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: heap vazio");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray5);
        org.junit.Assert.assertNotNull(itemArray9);
        org.junit.Assert.assertNotNull(itemArray18);
        org.junit.Assert.assertNotNull(itemArray22);
        org.junit.Assert.assertNotNull(itemArray32);
        org.junit.Assert.assertNotNull(itemArray38);
        org.junit.Assert.assertNotNull(itemArray46);
        org.junit.Assert.assertNotNull(itemArray50);
        org.junit.Assert.assertNotNull(itemArray58);
        org.junit.Assert.assertNotNull(itemArray62);
    }

    @Test
    public void test076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test076");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin((int) (short) -1);
        ds.FPHeapMin fPHeapMin3 = new ds.FPHeapMin(0);
        fPHeapMin3.imprime();
        ds.Item[] itemArray5 = new ds.Item[] {};
        fPHeapMin3.copia(itemArray5);
        ds.FPHeapMin fPHeapMin7 = new ds.FPHeapMin(itemArray5);
        fPHeapMin7.constroi();
        ds.Item[] itemArray9 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin10 = new ds.FPHeapMin(itemArray9);
        fPHeapMin7.copia(itemArray9);
        fPHeapMin1.copia(itemArray9);
        ds.Item[] itemArray13 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin14 = new ds.FPHeapMin(itemArray13);
        fPHeapMin1.copia(itemArray13);
        ds.FPHeapMin fPHeapMin17 = new ds.FPHeapMin(0);
        fPHeapMin17.imprime();
        ds.Item[] itemArray19 = new ds.Item[] {};
        fPHeapMin17.copia(itemArray19);
        ds.FPHeapMin fPHeapMin21 = new ds.FPHeapMin(itemArray19);
        ds.FPHeapMin fPHeapMin23 = new ds.FPHeapMin(0);
        fPHeapMin23.imprime();
        ds.Item[] itemArray25 = new ds.Item[] {};
        fPHeapMin23.copia(itemArray25);
        fPHeapMin21.copia(itemArray25);
        ds.FPHeapMin fPHeapMin28 = new ds.FPHeapMin(itemArray25);
        fPHeapMin1.copia(itemArray25);
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMin1.refaz((int) (short) -1, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray5);
        org.junit.Assert.assertNotNull(itemArray9);
        org.junit.Assert.assertNotNull(itemArray13);
        org.junit.Assert.assertNotNull(itemArray19);
        org.junit.Assert.assertNotNull(itemArray25);
    }

    @Test
    public void test077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test077");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin(0);
        fPHeapMin1.imprime();
        ds.Item[] itemArray3 = new ds.Item[] {};
        fPHeapMin1.copia(itemArray3);
        ds.FPHeapMin fPHeapMin5 = new ds.FPHeapMin(itemArray3);
        ds.FPHeapMin fPHeapMin7 = new ds.FPHeapMin(0);
        fPHeapMin7.imprime();
        ds.Item[] itemArray9 = new ds.Item[] {};
        fPHeapMin7.copia(itemArray9);
        fPHeapMin5.copia(itemArray9);
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
    public void test078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test078");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin(0);
        fPHeapMin1.imprime();
        ds.Item[] itemArray3 = new ds.Item[] {};
        fPHeapMin1.copia(itemArray3);
        ds.FPHeapMin fPHeapMin5 = new ds.FPHeapMin(itemArray3);
        fPHeapMin5.constroi();
        ds.Item[] itemArray7 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin8 = new ds.FPHeapMin(itemArray7);
        fPHeapMin5.copia(itemArray7);
        ds.FPHeapMin fPHeapMin11 = new ds.FPHeapMin((int) (short) -1);
        ds.FPHeapMin fPHeapMin13 = new ds.FPHeapMin(0);
        fPHeapMin13.imprime();
        ds.Item[] itemArray15 = new ds.Item[] {};
        fPHeapMin13.copia(itemArray15);
        ds.FPHeapMin fPHeapMin17 = new ds.FPHeapMin(itemArray15);
        fPHeapMin17.constroi();
        ds.Item[] itemArray19 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin20 = new ds.FPHeapMin(itemArray19);
        fPHeapMin17.copia(itemArray19);
        fPHeapMin11.copia(itemArray19);
        ds.FPHeapMin fPHeapMin23 = new ds.FPHeapMin(itemArray19);
        fPHeapMin5.copia(itemArray19);
        fPHeapMin5.constroi();
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertNotNull(itemArray7);
        org.junit.Assert.assertNotNull(itemArray15);
        org.junit.Assert.assertNotNull(itemArray19);
    }

    @Test
    public void test079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test079");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin((int) (short) -1);
        ds.FPHeapMin fPHeapMin3 = new ds.FPHeapMin(0);
        fPHeapMin3.imprime();
        ds.Item[] itemArray5 = new ds.Item[] {};
        fPHeapMin3.copia(itemArray5);
        ds.FPHeapMin fPHeapMin7 = new ds.FPHeapMin(itemArray5);
        fPHeapMin7.constroi();
        ds.Item[] itemArray9 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin10 = new ds.FPHeapMin(itemArray9);
        fPHeapMin7.copia(itemArray9);
        fPHeapMin1.copia(itemArray9);
        ds.FPHeapMin fPHeapMin13 = new ds.FPHeapMin(itemArray9);
        ds.Item item14 = null;
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMin13.insere(item14);
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: heap cheio");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray5);
        org.junit.Assert.assertNotNull(itemArray9);
    }

    @Test
    public void test080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test080");
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
    public void test081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test081");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin(0);
        fPHeapMin1.imprime();
        ds.Item[] itemArray3 = new ds.Item[] {};
        fPHeapMin1.copia(itemArray3);
        ds.FPHeapMin fPHeapMin5 = new ds.FPHeapMin(itemArray3);
        ds.FPHeapMin fPHeapMin7 = new ds.FPHeapMin(0);
        fPHeapMin7.imprime();
        ds.Item[] itemArray9 = new ds.Item[] {};
        fPHeapMin7.copia(itemArray9);
        fPHeapMin5.copia(itemArray9);
        fPHeapMin5.constroi();
        ds.FPHeapMin fPHeapMin14 = new ds.FPHeapMin((int) (short) -1);
        ds.FPHeapMin fPHeapMin16 = new ds.FPHeapMin(0);
        fPHeapMin16.imprime();
        ds.Item[] itemArray18 = new ds.Item[] {};
        fPHeapMin16.copia(itemArray18);
        ds.FPHeapMin fPHeapMin20 = new ds.FPHeapMin(itemArray18);
        fPHeapMin20.constroi();
        ds.Item[] itemArray22 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin23 = new ds.FPHeapMin(itemArray22);
        fPHeapMin20.copia(itemArray22);
        fPHeapMin14.copia(itemArray22);
        ds.FPHeapMin fPHeapMin27 = new ds.FPHeapMin((int) (short) -1);
        ds.FPHeapMin fPHeapMin29 = new ds.FPHeapMin(0);
        fPHeapMin29.imprime();
        ds.Item[] itemArray31 = new ds.Item[] {};
        fPHeapMin29.copia(itemArray31);
        ds.FPHeapMin fPHeapMin33 = new ds.FPHeapMin(itemArray31);
        fPHeapMin33.constroi();
        ds.Item[] itemArray35 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin36 = new ds.FPHeapMin(itemArray35);
        fPHeapMin33.copia(itemArray35);
        fPHeapMin27.copia(itemArray35);
        fPHeapMin14.copia(itemArray35);
        ds.FPHeapMin fPHeapMin40 = new ds.FPHeapMin(itemArray35);
        fPHeapMin5.copia(itemArray35);
        fPHeapMin5.constroi();
        fPHeapMin5.constroi();
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertNotNull(itemArray9);
        org.junit.Assert.assertNotNull(itemArray18);
        org.junit.Assert.assertNotNull(itemArray22);
        org.junit.Assert.assertNotNull(itemArray31);
        org.junit.Assert.assertNotNull(itemArray35);
    }

    @Test
    public void test082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test082");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin(100);
        ds.FPHeapMin fPHeapMin4 = new ds.FPHeapMin((int) (short) 100);
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMin1.diminuiChave((int) (byte) -1, (java.lang.Object) fPHeapMin4);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test083");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin(0);
        fPHeapMin1.imprime();
        ds.Item[] itemArray3 = new ds.Item[] {};
        fPHeapMin1.copia(itemArray3);
        ds.FPHeapMin fPHeapMin5 = new ds.FPHeapMin(itemArray3);
        ds.FPHeapMin fPHeapMin7 = new ds.FPHeapMin(0);
        fPHeapMin7.imprime();
        ds.Item[] itemArray9 = new ds.Item[] {};
        fPHeapMin7.copia(itemArray9);
        fPHeapMin5.copia(itemArray9);
        fPHeapMin5.constroi();
        java.lang.Class<?> wildcardClass13 = fPHeapMin5.getClass();
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertNotNull(itemArray9);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test084");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin((int) (byte) 100);
        fPHeapMin1.imprime();
        java.lang.Class<?> wildcardClass3 = fPHeapMin1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test085");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin(100);
        ds.Item item2 = fPHeapMin1.min();
        org.junit.Assert.assertNull(item2);
    }

    @Test
    public void test086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test086");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin((int) '4');
        ds.Item item2 = fPHeapMin1.min();
        ds.FPHeapMin fPHeapMin4 = new ds.FPHeapMin((int) (short) -1);
        ds.FPHeapMin fPHeapMin6 = new ds.FPHeapMin(0);
        fPHeapMin6.imprime();
        ds.Item[] itemArray8 = new ds.Item[] {};
        fPHeapMin6.copia(itemArray8);
        ds.FPHeapMin fPHeapMin10 = new ds.FPHeapMin(itemArray8);
        fPHeapMin10.constroi();
        ds.Item[] itemArray12 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin13 = new ds.FPHeapMin(itemArray12);
        fPHeapMin10.copia(itemArray12);
        fPHeapMin4.copia(itemArray12);
        ds.FPHeapMin fPHeapMin17 = new ds.FPHeapMin((int) (short) -1);
        ds.FPHeapMin fPHeapMin19 = new ds.FPHeapMin(0);
        fPHeapMin19.imprime();
        ds.Item[] itemArray21 = new ds.Item[] {};
        fPHeapMin19.copia(itemArray21);
        ds.FPHeapMin fPHeapMin23 = new ds.FPHeapMin(itemArray21);
        fPHeapMin23.constroi();
        ds.Item[] itemArray25 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin26 = new ds.FPHeapMin(itemArray25);
        fPHeapMin23.copia(itemArray25);
        fPHeapMin17.copia(itemArray25);
        fPHeapMin4.copia(itemArray25);
        fPHeapMin1.copia(itemArray25);
        ds.Item[] itemArray31 = null;
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMin1.copia(itemArray31);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(item2);
        org.junit.Assert.assertNotNull(itemArray8);
        org.junit.Assert.assertNotNull(itemArray12);
        org.junit.Assert.assertNotNull(itemArray21);
        org.junit.Assert.assertNotNull(itemArray25);
    }

    @Test
    public void test087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test087");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin(0);
        fPHeapMin1.imprime();
        ds.Item[] itemArray3 = new ds.Item[] {};
        fPHeapMin1.copia(itemArray3);
        ds.FPHeapMin fPHeapMin5 = new ds.FPHeapMin(itemArray3);
        fPHeapMin5.constroi();
        java.lang.Object obj8 = null;
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMin5.diminuiChave(0, obj8);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 0");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray3);
    }

    @Test
    public void test088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test088");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin(0);
        fPHeapMin1.imprime();
        ds.Item[] itemArray3 = new ds.Item[] {};
        fPHeapMin1.copia(itemArray3);
        ds.FPHeapMin fPHeapMin5 = new ds.FPHeapMin(itemArray3);
        ds.FPHeapMin fPHeapMin7 = new ds.FPHeapMin(0);
        fPHeapMin7.imprime();
        ds.Item[] itemArray9 = new ds.Item[] {};
        fPHeapMin7.copia(itemArray9);
        fPHeapMin5.copia(itemArray9);
        fPHeapMin5.constroi();
        ds.FPHeapMin fPHeapMin14 = new ds.FPHeapMin((int) (short) -1);
        ds.FPHeapMin fPHeapMin16 = new ds.FPHeapMin(0);
        fPHeapMin16.imprime();
        ds.Item[] itemArray18 = new ds.Item[] {};
        fPHeapMin16.copia(itemArray18);
        ds.FPHeapMin fPHeapMin20 = new ds.FPHeapMin(itemArray18);
        fPHeapMin20.constroi();
        ds.Item[] itemArray22 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin23 = new ds.FPHeapMin(itemArray22);
        fPHeapMin20.copia(itemArray22);
        fPHeapMin14.copia(itemArray22);
        ds.FPHeapMin fPHeapMin27 = new ds.FPHeapMin((int) (short) -1);
        ds.FPHeapMin fPHeapMin29 = new ds.FPHeapMin(0);
        fPHeapMin29.imprime();
        ds.Item[] itemArray31 = new ds.Item[] {};
        fPHeapMin29.copia(itemArray31);
        ds.FPHeapMin fPHeapMin33 = new ds.FPHeapMin(itemArray31);
        fPHeapMin33.constroi();
        ds.Item[] itemArray35 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin36 = new ds.FPHeapMin(itemArray35);
        fPHeapMin33.copia(itemArray35);
        fPHeapMin27.copia(itemArray35);
        fPHeapMin14.copia(itemArray35);
        ds.FPHeapMin fPHeapMin40 = new ds.FPHeapMin(itemArray35);
        fPHeapMin5.copia(itemArray35);
        java.lang.Class<?> wildcardClass42 = fPHeapMin5.getClass();
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertNotNull(itemArray9);
        org.junit.Assert.assertNotNull(itemArray18);
        org.junit.Assert.assertNotNull(itemArray22);
        org.junit.Assert.assertNotNull(itemArray31);
        org.junit.Assert.assertNotNull(itemArray35);
        org.junit.Assert.assertNotNull(wildcardClass42);
    }

    @Test
    public void test089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test089");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin((int) (short) -1);
        ds.FPHeapMin fPHeapMin3 = new ds.FPHeapMin(0);
        fPHeapMin3.imprime();
        ds.Item[] itemArray5 = new ds.Item[] {};
        fPHeapMin3.copia(itemArray5);
        ds.FPHeapMin fPHeapMin7 = new ds.FPHeapMin(itemArray5);
        fPHeapMin7.constroi();
        ds.Item[] itemArray9 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin10 = new ds.FPHeapMin(itemArray9);
        fPHeapMin7.copia(itemArray9);
        fPHeapMin1.copia(itemArray9);
        ds.FPHeapMin fPHeapMin14 = new ds.FPHeapMin((int) (short) -1);
        ds.FPHeapMin fPHeapMin16 = new ds.FPHeapMin(0);
        fPHeapMin16.imprime();
        ds.Item[] itemArray18 = new ds.Item[] {};
        fPHeapMin16.copia(itemArray18);
        ds.FPHeapMin fPHeapMin20 = new ds.FPHeapMin(itemArray18);
        fPHeapMin20.constroi();
        ds.Item[] itemArray22 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin23 = new ds.FPHeapMin(itemArray22);
        fPHeapMin20.copia(itemArray22);
        fPHeapMin14.copia(itemArray22);
        fPHeapMin1.copia(itemArray22);
        ds.FPHeapMin fPHeapMin28 = new ds.FPHeapMin((int) (byte) 100);
        ds.FPHeapMin fPHeapMin30 = new ds.FPHeapMin(0);
        fPHeapMin30.imprime();
        ds.Item[] itemArray32 = new ds.Item[] {};
        fPHeapMin30.copia(itemArray32);
        ds.FPHeapMin fPHeapMin34 = new ds.FPHeapMin(itemArray32);
        ds.FPHeapMin fPHeapMin36 = new ds.FPHeapMin(0);
        fPHeapMin36.imprime();
        ds.Item[] itemArray38 = new ds.Item[] {};
        fPHeapMin36.copia(itemArray38);
        fPHeapMin34.copia(itemArray38);
        fPHeapMin28.copia(itemArray38);
        fPHeapMin1.copia(itemArray38);
        ds.FPHeapMin fPHeapMin44 = new ds.FPHeapMin(0);
        fPHeapMin44.imprime();
        ds.Item[] itemArray46 = new ds.Item[] {};
        fPHeapMin44.copia(itemArray46);
        ds.FPHeapMin fPHeapMin48 = new ds.FPHeapMin(itemArray46);
        fPHeapMin48.constroi();
        ds.Item[] itemArray50 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin51 = new ds.FPHeapMin(itemArray50);
        fPHeapMin48.copia(itemArray50);
        ds.FPHeapMin fPHeapMin54 = new ds.FPHeapMin((int) (short) -1);
        ds.FPHeapMin fPHeapMin56 = new ds.FPHeapMin(0);
        fPHeapMin56.imprime();
        ds.Item[] itemArray58 = new ds.Item[] {};
        fPHeapMin56.copia(itemArray58);
        ds.FPHeapMin fPHeapMin60 = new ds.FPHeapMin(itemArray58);
        fPHeapMin60.constroi();
        ds.Item[] itemArray62 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin63 = new ds.FPHeapMin(itemArray62);
        fPHeapMin60.copia(itemArray62);
        fPHeapMin54.copia(itemArray62);
        ds.FPHeapMin fPHeapMin66 = new ds.FPHeapMin(itemArray62);
        fPHeapMin48.copia(itemArray62);
        fPHeapMin1.copia(itemArray62);
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMin1.diminuiChave((int) (byte) 100, (java.lang.Object) 100.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 100");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray5);
        org.junit.Assert.assertNotNull(itemArray9);
        org.junit.Assert.assertNotNull(itemArray18);
        org.junit.Assert.assertNotNull(itemArray22);
        org.junit.Assert.assertNotNull(itemArray32);
        org.junit.Assert.assertNotNull(itemArray38);
        org.junit.Assert.assertNotNull(itemArray46);
        org.junit.Assert.assertNotNull(itemArray50);
        org.junit.Assert.assertNotNull(itemArray58);
        org.junit.Assert.assertNotNull(itemArray62);
    }

    @Test
    public void test090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test090");
        ds.Item[] itemArray0 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin(itemArray0);
        java.lang.Class<?> wildcardClass2 = fPHeapMin1.getClass();
        org.junit.Assert.assertNotNull(itemArray0);
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test091");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin((int) (short) -1);
        ds.FPHeapMin fPHeapMin3 = new ds.FPHeapMin(0);
        fPHeapMin3.imprime();
        ds.Item[] itemArray5 = new ds.Item[] {};
        fPHeapMin3.copia(itemArray5);
        ds.FPHeapMin fPHeapMin7 = new ds.FPHeapMin(itemArray5);
        fPHeapMin7.constroi();
        ds.Item[] itemArray9 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin10 = new ds.FPHeapMin(itemArray9);
        fPHeapMin7.copia(itemArray9);
        fPHeapMin1.copia(itemArray9);
        ds.FPHeapMin fPHeapMin14 = new ds.FPHeapMin((int) (short) -1);
        ds.FPHeapMin fPHeapMin16 = new ds.FPHeapMin(0);
        fPHeapMin16.imprime();
        ds.Item[] itemArray18 = new ds.Item[] {};
        fPHeapMin16.copia(itemArray18);
        ds.FPHeapMin fPHeapMin20 = new ds.FPHeapMin(itemArray18);
        fPHeapMin20.constroi();
        ds.Item[] itemArray22 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin23 = new ds.FPHeapMin(itemArray22);
        fPHeapMin20.copia(itemArray22);
        fPHeapMin14.copia(itemArray22);
        fPHeapMin1.copia(itemArray22);
        ds.FPHeapMin fPHeapMin29 = new ds.FPHeapMin((int) (short) -1);
        fPHeapMin29.imprime();
        fPHeapMin29.imprime();
        fPHeapMin29.imprime();
        fPHeapMin29.constroi();
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMin1.diminuiChave(1, (java.lang.Object) fPHeapMin29);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray5);
        org.junit.Assert.assertNotNull(itemArray9);
        org.junit.Assert.assertNotNull(itemArray18);
        org.junit.Assert.assertNotNull(itemArray22);
    }

    @Test
    public void test092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test092");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin((int) (byte) 100);
        ds.Item item2 = fPHeapMin1.min();
        ds.FPHeapMin fPHeapMin4 = new ds.FPHeapMin((int) (short) -1);
        ds.FPHeapMin fPHeapMin6 = new ds.FPHeapMin(0);
        fPHeapMin6.imprime();
        ds.Item[] itemArray8 = new ds.Item[] {};
        fPHeapMin6.copia(itemArray8);
        ds.FPHeapMin fPHeapMin10 = new ds.FPHeapMin(itemArray8);
        fPHeapMin10.constroi();
        ds.Item[] itemArray12 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin13 = new ds.FPHeapMin(itemArray12);
        fPHeapMin10.copia(itemArray12);
        fPHeapMin4.copia(itemArray12);
        ds.Item[] itemArray16 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin17 = new ds.FPHeapMin(itemArray16);
        fPHeapMin4.copia(itemArray16);
        ds.FPHeapMin fPHeapMin19 = new ds.FPHeapMin(itemArray16);
        fPHeapMin1.copia(itemArray16);
        java.lang.Class<?> wildcardClass21 = fPHeapMin1.getClass();
        org.junit.Assert.assertNull(item2);
        org.junit.Assert.assertNotNull(itemArray8);
        org.junit.Assert.assertNotNull(itemArray12);
        org.junit.Assert.assertNotNull(itemArray16);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test093");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin((int) (short) -1);
        ds.FPHeapMin fPHeapMin3 = new ds.FPHeapMin(0);
        fPHeapMin3.imprime();
        ds.Item[] itemArray5 = new ds.Item[] {};
        fPHeapMin3.copia(itemArray5);
        ds.FPHeapMin fPHeapMin7 = new ds.FPHeapMin(itemArray5);
        fPHeapMin7.constroi();
        ds.Item[] itemArray9 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin10 = new ds.FPHeapMin(itemArray9);
        fPHeapMin7.copia(itemArray9);
        fPHeapMin1.copia(itemArray9);
        ds.FPHeapMin fPHeapMin13 = new ds.FPHeapMin(itemArray9);
        java.lang.Class<?> wildcardClass14 = fPHeapMin13.getClass();
        org.junit.Assert.assertNotNull(itemArray5);
        org.junit.Assert.assertNotNull(itemArray9);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test094");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin(0);
        fPHeapMin1.imprime();
        ds.Item[] itemArray3 = new ds.Item[] {};
        fPHeapMin1.copia(itemArray3);
        ds.FPHeapMin fPHeapMin5 = new ds.FPHeapMin(itemArray3);
        fPHeapMin5.constroi();
        ds.Item[] itemArray7 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin8 = new ds.FPHeapMin(itemArray7);
        fPHeapMin5.copia(itemArray7);
        ds.FPHeapMin fPHeapMin11 = new ds.FPHeapMin((int) (short) -1);
        ds.FPHeapMin fPHeapMin13 = new ds.FPHeapMin(0);
        fPHeapMin13.imprime();
        ds.Item[] itemArray15 = new ds.Item[] {};
        fPHeapMin13.copia(itemArray15);
        ds.FPHeapMin fPHeapMin17 = new ds.FPHeapMin(itemArray15);
        fPHeapMin17.constroi();
        ds.Item[] itemArray19 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin20 = new ds.FPHeapMin(itemArray19);
        fPHeapMin17.copia(itemArray19);
        fPHeapMin11.copia(itemArray19);
        ds.FPHeapMin fPHeapMin24 = new ds.FPHeapMin((int) (short) -1);
        ds.FPHeapMin fPHeapMin26 = new ds.FPHeapMin(0);
        fPHeapMin26.imprime();
        ds.Item[] itemArray28 = new ds.Item[] {};
        fPHeapMin26.copia(itemArray28);
        ds.FPHeapMin fPHeapMin30 = new ds.FPHeapMin(itemArray28);
        fPHeapMin30.constroi();
        ds.Item[] itemArray32 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin33 = new ds.FPHeapMin(itemArray32);
        fPHeapMin30.copia(itemArray32);
        fPHeapMin24.copia(itemArray32);
        fPHeapMin11.copia(itemArray32);
        fPHeapMin5.copia(itemArray32);
        ds.FPHeapMin fPHeapMin39 = new ds.FPHeapMin((int) (short) -1);
        ds.FPHeapMin fPHeapMin41 = new ds.FPHeapMin(0);
        fPHeapMin41.imprime();
        ds.Item[] itemArray43 = new ds.Item[] {};
        fPHeapMin41.copia(itemArray43);
        ds.FPHeapMin fPHeapMin45 = new ds.FPHeapMin(itemArray43);
        fPHeapMin45.constroi();
        ds.Item[] itemArray47 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin48 = new ds.FPHeapMin(itemArray47);
        fPHeapMin45.copia(itemArray47);
        fPHeapMin39.copia(itemArray47);
        fPHeapMin5.copia(itemArray47);
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMin5.refaz((int) (byte) -1, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertNotNull(itemArray7);
        org.junit.Assert.assertNotNull(itemArray15);
        org.junit.Assert.assertNotNull(itemArray19);
        org.junit.Assert.assertNotNull(itemArray28);
        org.junit.Assert.assertNotNull(itemArray32);
        org.junit.Assert.assertNotNull(itemArray43);
        org.junit.Assert.assertNotNull(itemArray47);
    }

    @Test
    public void test095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test095");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin((int) (short) 0);
    }

    @Test
    public void test096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test096");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin((int) (short) -1);
        ds.FPHeapMin fPHeapMin3 = new ds.FPHeapMin(0);
        fPHeapMin3.imprime();
        ds.Item[] itemArray5 = new ds.Item[] {};
        fPHeapMin3.copia(itemArray5);
        ds.FPHeapMin fPHeapMin7 = new ds.FPHeapMin(itemArray5);
        fPHeapMin7.constroi();
        ds.Item[] itemArray9 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin10 = new ds.FPHeapMin(itemArray9);
        fPHeapMin7.copia(itemArray9);
        fPHeapMin1.copia(itemArray9);
        ds.FPHeapMin fPHeapMin13 = new ds.FPHeapMin(itemArray9);
        ds.FPHeapMin fPHeapMin14 = new ds.FPHeapMin(itemArray9);
        fPHeapMin14.imprime();
        org.junit.Assert.assertNotNull(itemArray5);
        org.junit.Assert.assertNotNull(itemArray9);
    }

    @Test
    public void test097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test097");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin(0);
        fPHeapMin1.imprime();
        fPHeapMin1.constroi();
        ds.FPHeapMin fPHeapMin5 = new ds.FPHeapMin(0);
        fPHeapMin5.imprime();
        ds.FPHeapMin fPHeapMin8 = new ds.FPHeapMin((int) (short) -1);
        ds.FPHeapMin fPHeapMin10 = new ds.FPHeapMin(0);
        fPHeapMin10.imprime();
        ds.Item[] itemArray12 = new ds.Item[] {};
        fPHeapMin10.copia(itemArray12);
        ds.FPHeapMin fPHeapMin14 = new ds.FPHeapMin(itemArray12);
        fPHeapMin14.constroi();
        ds.Item[] itemArray16 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin17 = new ds.FPHeapMin(itemArray16);
        fPHeapMin14.copia(itemArray16);
        fPHeapMin8.copia(itemArray16);
        ds.FPHeapMin fPHeapMin21 = new ds.FPHeapMin((int) (short) -1);
        ds.FPHeapMin fPHeapMin23 = new ds.FPHeapMin(0);
        fPHeapMin23.imprime();
        ds.Item[] itemArray25 = new ds.Item[] {};
        fPHeapMin23.copia(itemArray25);
        ds.FPHeapMin fPHeapMin27 = new ds.FPHeapMin(itemArray25);
        fPHeapMin27.constroi();
        ds.Item[] itemArray29 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin30 = new ds.FPHeapMin(itemArray29);
        fPHeapMin27.copia(itemArray29);
        fPHeapMin21.copia(itemArray29);
        fPHeapMin8.copia(itemArray29);
        ds.FPHeapMin fPHeapMin35 = new ds.FPHeapMin((int) (byte) 100);
        ds.FPHeapMin fPHeapMin37 = new ds.FPHeapMin(0);
        fPHeapMin37.imprime();
        ds.Item[] itemArray39 = new ds.Item[] {};
        fPHeapMin37.copia(itemArray39);
        ds.FPHeapMin fPHeapMin41 = new ds.FPHeapMin(itemArray39);
        ds.FPHeapMin fPHeapMin43 = new ds.FPHeapMin(0);
        fPHeapMin43.imprime();
        ds.Item[] itemArray45 = new ds.Item[] {};
        fPHeapMin43.copia(itemArray45);
        fPHeapMin41.copia(itemArray45);
        fPHeapMin35.copia(itemArray45);
        fPHeapMin8.copia(itemArray45);
        ds.FPHeapMin fPHeapMin51 = new ds.FPHeapMin(0);
        fPHeapMin51.imprime();
        ds.Item[] itemArray53 = new ds.Item[] {};
        fPHeapMin51.copia(itemArray53);
        ds.FPHeapMin fPHeapMin55 = new ds.FPHeapMin(itemArray53);
        fPHeapMin55.constroi();
        ds.Item[] itemArray57 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin58 = new ds.FPHeapMin(itemArray57);
        fPHeapMin55.copia(itemArray57);
        ds.FPHeapMin fPHeapMin61 = new ds.FPHeapMin((int) (short) -1);
        ds.FPHeapMin fPHeapMin63 = new ds.FPHeapMin(0);
        fPHeapMin63.imprime();
        ds.Item[] itemArray65 = new ds.Item[] {};
        fPHeapMin63.copia(itemArray65);
        ds.FPHeapMin fPHeapMin67 = new ds.FPHeapMin(itemArray65);
        fPHeapMin67.constroi();
        ds.Item[] itemArray69 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin70 = new ds.FPHeapMin(itemArray69);
        fPHeapMin67.copia(itemArray69);
        fPHeapMin61.copia(itemArray69);
        ds.FPHeapMin fPHeapMin73 = new ds.FPHeapMin(itemArray69);
        fPHeapMin55.copia(itemArray69);
        fPHeapMin8.copia(itemArray69);
        fPHeapMin5.copia(itemArray69);
        fPHeapMin1.copia(itemArray69);
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMin1.refaz((int) (short) 10, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 10");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray12);
        org.junit.Assert.assertNotNull(itemArray16);
        org.junit.Assert.assertNotNull(itemArray25);
        org.junit.Assert.assertNotNull(itemArray29);
        org.junit.Assert.assertNotNull(itemArray39);
        org.junit.Assert.assertNotNull(itemArray45);
        org.junit.Assert.assertNotNull(itemArray53);
        org.junit.Assert.assertNotNull(itemArray57);
        org.junit.Assert.assertNotNull(itemArray65);
        org.junit.Assert.assertNotNull(itemArray69);
    }

    @Test
    public void test098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test098");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin((int) '#');
    }

    @Test
    public void test099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test099");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin((int) '4');
        ds.Item item2 = fPHeapMin1.min();
        ds.Item[] itemArray3 = new ds.Item[] {};
        fPHeapMin1.copia(itemArray3);
        ds.FPHeapMin fPHeapMin5 = new ds.FPHeapMin(itemArray3);
        ds.FPHeapMin fPHeapMin7 = new ds.FPHeapMin(0);
        fPHeapMin7.imprime();
        ds.Item[] itemArray9 = new ds.Item[] {};
        fPHeapMin7.copia(itemArray9);
        ds.FPHeapMin fPHeapMin11 = new ds.FPHeapMin(itemArray9);
        ds.FPHeapMin fPHeapMin13 = new ds.FPHeapMin((int) (short) -1);
        ds.FPHeapMin fPHeapMin15 = new ds.FPHeapMin(0);
        fPHeapMin15.imprime();
        ds.Item[] itemArray17 = new ds.Item[] {};
        fPHeapMin15.copia(itemArray17);
        ds.FPHeapMin fPHeapMin19 = new ds.FPHeapMin(itemArray17);
        fPHeapMin19.constroi();
        ds.Item[] itemArray21 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin22 = new ds.FPHeapMin(itemArray21);
        fPHeapMin19.copia(itemArray21);
        fPHeapMin13.copia(itemArray21);
        ds.FPHeapMin fPHeapMin26 = new ds.FPHeapMin((int) (short) -1);
        ds.FPHeapMin fPHeapMin28 = new ds.FPHeapMin(0);
        fPHeapMin28.imprime();
        ds.Item[] itemArray30 = new ds.Item[] {};
        fPHeapMin28.copia(itemArray30);
        ds.FPHeapMin fPHeapMin32 = new ds.FPHeapMin(itemArray30);
        fPHeapMin32.constroi();
        ds.Item[] itemArray34 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin35 = new ds.FPHeapMin(itemArray34);
        fPHeapMin32.copia(itemArray34);
        fPHeapMin26.copia(itemArray34);
        fPHeapMin13.copia(itemArray34);
        fPHeapMin11.copia(itemArray34);
        fPHeapMin5.copia(itemArray34);
        // The following exception was thrown during execution in test generation
        try {
            ds.Item item41 = fPHeapMin5.min();
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(item2);
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertNotNull(itemArray9);
        org.junit.Assert.assertNotNull(itemArray17);
        org.junit.Assert.assertNotNull(itemArray21);
        org.junit.Assert.assertNotNull(itemArray30);
        org.junit.Assert.assertNotNull(itemArray34);
    }

    @Test
    public void test100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test100");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin((int) (byte) 100);
        ds.Item item2 = fPHeapMin1.min();
        ds.FPHeapMin fPHeapMin4 = new ds.FPHeapMin((int) (short) -1);
        ds.FPHeapMin fPHeapMin6 = new ds.FPHeapMin(0);
        fPHeapMin6.imprime();
        ds.Item[] itemArray8 = new ds.Item[] {};
        fPHeapMin6.copia(itemArray8);
        ds.FPHeapMin fPHeapMin10 = new ds.FPHeapMin(itemArray8);
        fPHeapMin10.constroi();
        ds.Item[] itemArray12 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin13 = new ds.FPHeapMin(itemArray12);
        fPHeapMin10.copia(itemArray12);
        fPHeapMin4.copia(itemArray12);
        ds.Item[] itemArray16 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin17 = new ds.FPHeapMin(itemArray16);
        fPHeapMin4.copia(itemArray16);
        ds.FPHeapMin fPHeapMin19 = new ds.FPHeapMin(itemArray16);
        fPHeapMin1.copia(itemArray16);
        ds.FPHeapMin fPHeapMin22 = new ds.FPHeapMin((int) (short) 1);
        fPHeapMin22.constroi();
        fPHeapMin22.constroi();
        ds.FPHeapMin fPHeapMin26 = new ds.FPHeapMin((int) (short) -1);
        ds.FPHeapMin fPHeapMin28 = new ds.FPHeapMin(0);
        fPHeapMin28.imprime();
        ds.Item[] itemArray30 = new ds.Item[] {};
        fPHeapMin28.copia(itemArray30);
        ds.FPHeapMin fPHeapMin32 = new ds.FPHeapMin(itemArray30);
        fPHeapMin32.constroi();
        ds.Item[] itemArray34 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin35 = new ds.FPHeapMin(itemArray34);
        fPHeapMin32.copia(itemArray34);
        fPHeapMin26.copia(itemArray34);
        ds.FPHeapMin fPHeapMin39 = new ds.FPHeapMin((int) (short) -1);
        ds.FPHeapMin fPHeapMin41 = new ds.FPHeapMin(0);
        fPHeapMin41.imprime();
        ds.Item[] itemArray43 = new ds.Item[] {};
        fPHeapMin41.copia(itemArray43);
        ds.FPHeapMin fPHeapMin45 = new ds.FPHeapMin(itemArray43);
        fPHeapMin45.constroi();
        ds.Item[] itemArray47 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin48 = new ds.FPHeapMin(itemArray47);
        fPHeapMin45.copia(itemArray47);
        fPHeapMin39.copia(itemArray47);
        fPHeapMin26.copia(itemArray47);
        ds.FPHeapMin fPHeapMin53 = new ds.FPHeapMin((int) (byte) 100);
        ds.FPHeapMin fPHeapMin55 = new ds.FPHeapMin(0);
        fPHeapMin55.imprime();
        ds.Item[] itemArray57 = new ds.Item[] {};
        fPHeapMin55.copia(itemArray57);
        ds.FPHeapMin fPHeapMin59 = new ds.FPHeapMin(itemArray57);
        ds.FPHeapMin fPHeapMin61 = new ds.FPHeapMin(0);
        fPHeapMin61.imprime();
        ds.Item[] itemArray63 = new ds.Item[] {};
        fPHeapMin61.copia(itemArray63);
        fPHeapMin59.copia(itemArray63);
        fPHeapMin53.copia(itemArray63);
        fPHeapMin26.copia(itemArray63);
        fPHeapMin22.copia(itemArray63);
        fPHeapMin1.copia(itemArray63);
        org.junit.Assert.assertNull(item2);
        org.junit.Assert.assertNotNull(itemArray8);
        org.junit.Assert.assertNotNull(itemArray12);
        org.junit.Assert.assertNotNull(itemArray16);
        org.junit.Assert.assertNotNull(itemArray30);
        org.junit.Assert.assertNotNull(itemArray34);
        org.junit.Assert.assertNotNull(itemArray43);
        org.junit.Assert.assertNotNull(itemArray47);
        org.junit.Assert.assertNotNull(itemArray57);
        org.junit.Assert.assertNotNull(itemArray63);
    }

    @Test
    public void test101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test101");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin((int) (short) 1);
        fPHeapMin1.constroi();
        fPHeapMin1.constroi();
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMin1.refaz((-1), (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test102");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin(0);
        fPHeapMin1.imprime();
        ds.Item[] itemArray3 = new ds.Item[] {};
        fPHeapMin1.copia(itemArray3);
        ds.FPHeapMin fPHeapMin5 = new ds.FPHeapMin(itemArray3);
        fPHeapMin5.constroi();
        ds.Item[] itemArray7 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin8 = new ds.FPHeapMin(itemArray7);
        fPHeapMin5.copia(itemArray7);
        ds.FPHeapMin fPHeapMin11 = new ds.FPHeapMin((int) (short) -1);
        ds.FPHeapMin fPHeapMin13 = new ds.FPHeapMin(0);
        fPHeapMin13.imprime();
        ds.Item[] itemArray15 = new ds.Item[] {};
        fPHeapMin13.copia(itemArray15);
        ds.FPHeapMin fPHeapMin17 = new ds.FPHeapMin(itemArray15);
        fPHeapMin17.constroi();
        ds.Item[] itemArray19 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin20 = new ds.FPHeapMin(itemArray19);
        fPHeapMin17.copia(itemArray19);
        fPHeapMin11.copia(itemArray19);
        ds.FPHeapMin fPHeapMin24 = new ds.FPHeapMin((int) (short) -1);
        ds.FPHeapMin fPHeapMin26 = new ds.FPHeapMin(0);
        fPHeapMin26.imprime();
        ds.Item[] itemArray28 = new ds.Item[] {};
        fPHeapMin26.copia(itemArray28);
        ds.FPHeapMin fPHeapMin30 = new ds.FPHeapMin(itemArray28);
        fPHeapMin30.constroi();
        ds.Item[] itemArray32 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin33 = new ds.FPHeapMin(itemArray32);
        fPHeapMin30.copia(itemArray32);
        fPHeapMin24.copia(itemArray32);
        fPHeapMin11.copia(itemArray32);
        fPHeapMin5.copia(itemArray32);
        ds.FPHeapMin fPHeapMin39 = new ds.FPHeapMin((int) (short) -1);
        ds.FPHeapMin fPHeapMin41 = new ds.FPHeapMin(0);
        fPHeapMin41.imprime();
        ds.Item[] itemArray43 = new ds.Item[] {};
        fPHeapMin41.copia(itemArray43);
        ds.FPHeapMin fPHeapMin45 = new ds.FPHeapMin(itemArray43);
        fPHeapMin45.constroi();
        ds.Item[] itemArray47 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin48 = new ds.FPHeapMin(itemArray47);
        fPHeapMin45.copia(itemArray47);
        fPHeapMin39.copia(itemArray47);
        fPHeapMin5.copia(itemArray47);
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMin5.diminuiChave((int) (byte) 1, (java.lang.Object) (-1L));
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertNotNull(itemArray7);
        org.junit.Assert.assertNotNull(itemArray15);
        org.junit.Assert.assertNotNull(itemArray19);
        org.junit.Assert.assertNotNull(itemArray28);
        org.junit.Assert.assertNotNull(itemArray32);
        org.junit.Assert.assertNotNull(itemArray43);
        org.junit.Assert.assertNotNull(itemArray47);
    }

    @Test
    public void test103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test103");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin(0);
        fPHeapMin1.imprime();
        ds.Item[] itemArray3 = new ds.Item[] {};
        fPHeapMin1.copia(itemArray3);
        fPHeapMin1.constroi();
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
    public void test104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test104");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin((int) '4');
        ds.Item item2 = fPHeapMin1.min();
        ds.Item[] itemArray3 = new ds.Item[] {};
        fPHeapMin1.copia(itemArray3);
        ds.FPHeapMin fPHeapMin5 = new ds.FPHeapMin(itemArray3);
        ds.FPHeapMin fPHeapMin7 = new ds.FPHeapMin(0);
        fPHeapMin7.imprime();
        ds.Item[] itemArray9 = new ds.Item[] {};
        fPHeapMin7.copia(itemArray9);
        ds.FPHeapMin fPHeapMin11 = new ds.FPHeapMin(itemArray9);
        ds.FPHeapMin fPHeapMin13 = new ds.FPHeapMin((int) (short) -1);
        ds.FPHeapMin fPHeapMin15 = new ds.FPHeapMin(0);
        fPHeapMin15.imprime();
        ds.Item[] itemArray17 = new ds.Item[] {};
        fPHeapMin15.copia(itemArray17);
        ds.FPHeapMin fPHeapMin19 = new ds.FPHeapMin(itemArray17);
        fPHeapMin19.constroi();
        ds.Item[] itemArray21 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin22 = new ds.FPHeapMin(itemArray21);
        fPHeapMin19.copia(itemArray21);
        fPHeapMin13.copia(itemArray21);
        ds.FPHeapMin fPHeapMin26 = new ds.FPHeapMin((int) (short) -1);
        ds.FPHeapMin fPHeapMin28 = new ds.FPHeapMin(0);
        fPHeapMin28.imprime();
        ds.Item[] itemArray30 = new ds.Item[] {};
        fPHeapMin28.copia(itemArray30);
        ds.FPHeapMin fPHeapMin32 = new ds.FPHeapMin(itemArray30);
        fPHeapMin32.constroi();
        ds.Item[] itemArray34 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin35 = new ds.FPHeapMin(itemArray34);
        fPHeapMin32.copia(itemArray34);
        fPHeapMin26.copia(itemArray34);
        fPHeapMin13.copia(itemArray34);
        fPHeapMin11.copia(itemArray34);
        fPHeapMin5.copia(itemArray34);
        ds.FPHeapMin fPHeapMin41 = new ds.FPHeapMin(itemArray34);
        java.lang.Class<?> wildcardClass42 = fPHeapMin41.getClass();
        org.junit.Assert.assertNull(item2);
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertNotNull(itemArray9);
        org.junit.Assert.assertNotNull(itemArray17);
        org.junit.Assert.assertNotNull(itemArray21);
        org.junit.Assert.assertNotNull(itemArray30);
        org.junit.Assert.assertNotNull(itemArray34);
        org.junit.Assert.assertNotNull(wildcardClass42);
    }

    @Test
    public void test105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test105");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin((int) '4');
        ds.Item item2 = fPHeapMin1.min();
        ds.Item[] itemArray3 = new ds.Item[] {};
        fPHeapMin1.copia(itemArray3);
        ds.FPHeapMin fPHeapMin5 = new ds.FPHeapMin(itemArray3);
        ds.FPHeapMin fPHeapMin7 = new ds.FPHeapMin(0);
        fPHeapMin7.imprime();
        ds.Item[] itemArray9 = new ds.Item[] {};
        fPHeapMin7.copia(itemArray9);
        ds.FPHeapMin fPHeapMin11 = new ds.FPHeapMin(itemArray9);
        ds.FPHeapMin fPHeapMin13 = new ds.FPHeapMin((int) (short) -1);
        ds.FPHeapMin fPHeapMin15 = new ds.FPHeapMin(0);
        fPHeapMin15.imprime();
        ds.Item[] itemArray17 = new ds.Item[] {};
        fPHeapMin15.copia(itemArray17);
        ds.FPHeapMin fPHeapMin19 = new ds.FPHeapMin(itemArray17);
        fPHeapMin19.constroi();
        ds.Item[] itemArray21 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin22 = new ds.FPHeapMin(itemArray21);
        fPHeapMin19.copia(itemArray21);
        fPHeapMin13.copia(itemArray21);
        ds.FPHeapMin fPHeapMin26 = new ds.FPHeapMin((int) (short) -1);
        ds.FPHeapMin fPHeapMin28 = new ds.FPHeapMin(0);
        fPHeapMin28.imprime();
        ds.Item[] itemArray30 = new ds.Item[] {};
        fPHeapMin28.copia(itemArray30);
        ds.FPHeapMin fPHeapMin32 = new ds.FPHeapMin(itemArray30);
        fPHeapMin32.constroi();
        ds.Item[] itemArray34 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin35 = new ds.FPHeapMin(itemArray34);
        fPHeapMin32.copia(itemArray34);
        fPHeapMin26.copia(itemArray34);
        fPHeapMin13.copia(itemArray34);
        fPHeapMin11.copia(itemArray34);
        fPHeapMin5.copia(itemArray34);
        ds.FPHeapMin fPHeapMin41 = new ds.FPHeapMin(itemArray34);
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMin41.refaz((int) (byte) 0, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 0");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(item2);
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertNotNull(itemArray9);
        org.junit.Assert.assertNotNull(itemArray17);
        org.junit.Assert.assertNotNull(itemArray21);
        org.junit.Assert.assertNotNull(itemArray30);
        org.junit.Assert.assertNotNull(itemArray34);
    }

    @Test
    public void test106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test106");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin(0);
        fPHeapMin1.imprime();
        ds.Item[] itemArray3 = new ds.Item[] {};
        fPHeapMin1.copia(itemArray3);
        ds.FPHeapMin fPHeapMin5 = new ds.FPHeapMin(itemArray3);
        ds.FPHeapMin fPHeapMin7 = new ds.FPHeapMin(0);
        fPHeapMin7.imprime();
        ds.Item[] itemArray9 = new ds.Item[] {};
        fPHeapMin7.copia(itemArray9);
        fPHeapMin5.copia(itemArray9);
        fPHeapMin5.constroi();
        ds.FPHeapMin fPHeapMin14 = new ds.FPHeapMin((int) (short) -1);
        ds.FPHeapMin fPHeapMin16 = new ds.FPHeapMin(0);
        fPHeapMin16.imprime();
        ds.Item[] itemArray18 = new ds.Item[] {};
        fPHeapMin16.copia(itemArray18);
        ds.FPHeapMin fPHeapMin20 = new ds.FPHeapMin(itemArray18);
        fPHeapMin20.constroi();
        ds.Item[] itemArray22 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin23 = new ds.FPHeapMin(itemArray22);
        fPHeapMin20.copia(itemArray22);
        fPHeapMin14.copia(itemArray22);
        ds.FPHeapMin fPHeapMin27 = new ds.FPHeapMin((int) (short) -1);
        ds.FPHeapMin fPHeapMin29 = new ds.FPHeapMin(0);
        fPHeapMin29.imprime();
        ds.Item[] itemArray31 = new ds.Item[] {};
        fPHeapMin29.copia(itemArray31);
        ds.FPHeapMin fPHeapMin33 = new ds.FPHeapMin(itemArray31);
        fPHeapMin33.constroi();
        ds.Item[] itemArray35 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin36 = new ds.FPHeapMin(itemArray35);
        fPHeapMin33.copia(itemArray35);
        fPHeapMin27.copia(itemArray35);
        fPHeapMin14.copia(itemArray35);
        ds.FPHeapMin fPHeapMin40 = new ds.FPHeapMin(itemArray35);
        fPHeapMin5.copia(itemArray35);
        fPHeapMin5.constroi();
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMin5.refaz((int) (byte) 0, (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 0");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertNotNull(itemArray9);
        org.junit.Assert.assertNotNull(itemArray18);
        org.junit.Assert.assertNotNull(itemArray22);
        org.junit.Assert.assertNotNull(itemArray31);
        org.junit.Assert.assertNotNull(itemArray35);
    }

    @Test
    public void test107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test107");
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
    public void test108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test108");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin((int) (short) -1);
        ds.FPHeapMin fPHeapMin3 = new ds.FPHeapMin(0);
        fPHeapMin3.imprime();
        ds.Item[] itemArray5 = new ds.Item[] {};
        fPHeapMin3.copia(itemArray5);
        ds.FPHeapMin fPHeapMin7 = new ds.FPHeapMin(itemArray5);
        fPHeapMin7.constroi();
        ds.Item[] itemArray9 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin10 = new ds.FPHeapMin(itemArray9);
        fPHeapMin7.copia(itemArray9);
        fPHeapMin1.copia(itemArray9);
        ds.FPHeapMin fPHeapMin14 = new ds.FPHeapMin((int) (short) -1);
        ds.FPHeapMin fPHeapMin16 = new ds.FPHeapMin(0);
        fPHeapMin16.imprime();
        ds.Item[] itemArray18 = new ds.Item[] {};
        fPHeapMin16.copia(itemArray18);
        ds.FPHeapMin fPHeapMin20 = new ds.FPHeapMin(itemArray18);
        fPHeapMin20.constroi();
        ds.Item[] itemArray22 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin23 = new ds.FPHeapMin(itemArray22);
        fPHeapMin20.copia(itemArray22);
        fPHeapMin14.copia(itemArray22);
        fPHeapMin1.copia(itemArray22);
        ds.FPHeapMin fPHeapMin27 = new ds.FPHeapMin(itemArray22);
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMin27.refaz((int) (byte) -1, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray5);
        org.junit.Assert.assertNotNull(itemArray9);
        org.junit.Assert.assertNotNull(itemArray18);
        org.junit.Assert.assertNotNull(itemArray22);
    }

    @Test
    public void test109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test109");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin(0);
        fPHeapMin1.imprime();
        ds.FPHeapMin fPHeapMin4 = new ds.FPHeapMin(0);
        fPHeapMin4.imprime();
        ds.Item[] itemArray6 = new ds.Item[] {};
        fPHeapMin4.copia(itemArray6);
        ds.FPHeapMin fPHeapMin8 = new ds.FPHeapMin(itemArray6);
        ds.FPHeapMin fPHeapMin10 = new ds.FPHeapMin(0);
        fPHeapMin10.imprime();
        ds.Item[] itemArray12 = new ds.Item[] {};
        fPHeapMin10.copia(itemArray12);
        fPHeapMin8.copia(itemArray12);
        ds.FPHeapMin fPHeapMin15 = new ds.FPHeapMin(itemArray12);
        ds.FPHeapMin fPHeapMin17 = new ds.FPHeapMin(0);
        fPHeapMin17.imprime();
        ds.Item[] itemArray19 = new ds.Item[] {};
        fPHeapMin17.copia(itemArray19);
        ds.FPHeapMin fPHeapMin21 = new ds.FPHeapMin(itemArray19);
        fPHeapMin21.constroi();
        ds.Item[] itemArray23 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin24 = new ds.FPHeapMin(itemArray23);
        fPHeapMin21.copia(itemArray23);
        ds.FPHeapMin fPHeapMin27 = new ds.FPHeapMin((int) (short) -1);
        ds.FPHeapMin fPHeapMin29 = new ds.FPHeapMin(0);
        fPHeapMin29.imprime();
        ds.Item[] itemArray31 = new ds.Item[] {};
        fPHeapMin29.copia(itemArray31);
        ds.FPHeapMin fPHeapMin33 = new ds.FPHeapMin(itemArray31);
        fPHeapMin33.constroi();
        ds.Item[] itemArray35 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin36 = new ds.FPHeapMin(itemArray35);
        fPHeapMin33.copia(itemArray35);
        fPHeapMin27.copia(itemArray35);
        ds.FPHeapMin fPHeapMin40 = new ds.FPHeapMin((int) (short) -1);
        ds.FPHeapMin fPHeapMin42 = new ds.FPHeapMin(0);
        fPHeapMin42.imprime();
        ds.Item[] itemArray44 = new ds.Item[] {};
        fPHeapMin42.copia(itemArray44);
        ds.FPHeapMin fPHeapMin46 = new ds.FPHeapMin(itemArray44);
        fPHeapMin46.constroi();
        ds.Item[] itemArray48 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin49 = new ds.FPHeapMin(itemArray48);
        fPHeapMin46.copia(itemArray48);
        fPHeapMin40.copia(itemArray48);
        fPHeapMin27.copia(itemArray48);
        fPHeapMin21.copia(itemArray48);
        fPHeapMin15.copia(itemArray48);
        fPHeapMin1.copia(itemArray48);
        org.junit.Assert.assertNotNull(itemArray6);
        org.junit.Assert.assertNotNull(itemArray12);
        org.junit.Assert.assertNotNull(itemArray19);
        org.junit.Assert.assertNotNull(itemArray23);
        org.junit.Assert.assertNotNull(itemArray31);
        org.junit.Assert.assertNotNull(itemArray35);
        org.junit.Assert.assertNotNull(itemArray44);
        org.junit.Assert.assertNotNull(itemArray48);
    }

    @Test
    public void test110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test110");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin((int) '4');
        ds.Item item2 = fPHeapMin1.min();
        ds.Item[] itemArray3 = new ds.Item[] {};
        fPHeapMin1.copia(itemArray3);
        ds.FPHeapMin fPHeapMin5 = new ds.FPHeapMin(itemArray3);
        ds.FPHeapMin fPHeapMin7 = new ds.FPHeapMin(0);
        fPHeapMin7.imprime();
        ds.Item[] itemArray9 = new ds.Item[] {};
        fPHeapMin7.copia(itemArray9);
        ds.FPHeapMin fPHeapMin11 = new ds.FPHeapMin(itemArray9);
        ds.FPHeapMin fPHeapMin13 = new ds.FPHeapMin((int) (short) -1);
        ds.FPHeapMin fPHeapMin15 = new ds.FPHeapMin(0);
        fPHeapMin15.imprime();
        ds.Item[] itemArray17 = new ds.Item[] {};
        fPHeapMin15.copia(itemArray17);
        ds.FPHeapMin fPHeapMin19 = new ds.FPHeapMin(itemArray17);
        fPHeapMin19.constroi();
        ds.Item[] itemArray21 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin22 = new ds.FPHeapMin(itemArray21);
        fPHeapMin19.copia(itemArray21);
        fPHeapMin13.copia(itemArray21);
        ds.FPHeapMin fPHeapMin26 = new ds.FPHeapMin((int) (short) -1);
        ds.FPHeapMin fPHeapMin28 = new ds.FPHeapMin(0);
        fPHeapMin28.imprime();
        ds.Item[] itemArray30 = new ds.Item[] {};
        fPHeapMin28.copia(itemArray30);
        ds.FPHeapMin fPHeapMin32 = new ds.FPHeapMin(itemArray30);
        fPHeapMin32.constroi();
        ds.Item[] itemArray34 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin35 = new ds.FPHeapMin(itemArray34);
        fPHeapMin32.copia(itemArray34);
        fPHeapMin26.copia(itemArray34);
        fPHeapMin13.copia(itemArray34);
        fPHeapMin11.copia(itemArray34);
        fPHeapMin5.copia(itemArray34);
        ds.FPHeapMin fPHeapMin41 = new ds.FPHeapMin(itemArray34);
        ds.Item item42 = null;
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMin41.insere(item42);
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: heap cheio");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(item2);
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertNotNull(itemArray9);
        org.junit.Assert.assertNotNull(itemArray17);
        org.junit.Assert.assertNotNull(itemArray21);
        org.junit.Assert.assertNotNull(itemArray30);
        org.junit.Assert.assertNotNull(itemArray34);
    }

    @Test
    public void test111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test111");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin(0);
        fPHeapMin1.imprime();
        java.lang.Class<?> wildcardClass3 = fPHeapMin1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test112");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin((int) (short) -1);
        ds.FPHeapMin fPHeapMin3 = new ds.FPHeapMin(0);
        fPHeapMin3.imprime();
        ds.Item[] itemArray5 = new ds.Item[] {};
        fPHeapMin3.copia(itemArray5);
        ds.FPHeapMin fPHeapMin7 = new ds.FPHeapMin(itemArray5);
        fPHeapMin7.constroi();
        ds.Item[] itemArray9 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin10 = new ds.FPHeapMin(itemArray9);
        fPHeapMin7.copia(itemArray9);
        fPHeapMin1.copia(itemArray9);
        ds.FPHeapMin fPHeapMin14 = new ds.FPHeapMin((int) (short) -1);
        ds.FPHeapMin fPHeapMin16 = new ds.FPHeapMin(0);
        fPHeapMin16.imprime();
        ds.Item[] itemArray18 = new ds.Item[] {};
        fPHeapMin16.copia(itemArray18);
        ds.FPHeapMin fPHeapMin20 = new ds.FPHeapMin(itemArray18);
        fPHeapMin20.constroi();
        ds.Item[] itemArray22 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin23 = new ds.FPHeapMin(itemArray22);
        fPHeapMin20.copia(itemArray22);
        fPHeapMin14.copia(itemArray22);
        fPHeapMin1.copia(itemArray22);
        ds.FPHeapMin fPHeapMin28 = new ds.FPHeapMin((int) (byte) 100);
        ds.FPHeapMin fPHeapMin30 = new ds.FPHeapMin(0);
        fPHeapMin30.imprime();
        ds.Item[] itemArray32 = new ds.Item[] {};
        fPHeapMin30.copia(itemArray32);
        ds.FPHeapMin fPHeapMin34 = new ds.FPHeapMin(itemArray32);
        ds.FPHeapMin fPHeapMin36 = new ds.FPHeapMin(0);
        fPHeapMin36.imprime();
        ds.Item[] itemArray38 = new ds.Item[] {};
        fPHeapMin36.copia(itemArray38);
        fPHeapMin34.copia(itemArray38);
        fPHeapMin28.copia(itemArray38);
        fPHeapMin1.copia(itemArray38);
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMin1.refaz((int) (short) 100, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 100");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray5);
        org.junit.Assert.assertNotNull(itemArray9);
        org.junit.Assert.assertNotNull(itemArray18);
        org.junit.Assert.assertNotNull(itemArray22);
        org.junit.Assert.assertNotNull(itemArray32);
        org.junit.Assert.assertNotNull(itemArray38);
    }

    @Test
    public void test113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test113");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin(0);
        fPHeapMin1.imprime();
        ds.Item[] itemArray3 = new ds.Item[] {};
        fPHeapMin1.copia(itemArray3);
        ds.FPHeapMin fPHeapMin5 = new ds.FPHeapMin(itemArray3);
        fPHeapMin5.constroi();
        ds.Item[] itemArray7 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin8 = new ds.FPHeapMin(itemArray7);
        fPHeapMin5.copia(itemArray7);
        // The following exception was thrown during execution in test generation
        try {
            ds.Item item10 = fPHeapMin5.retiraMin();
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: heap vazio");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertNotNull(itemArray7);
    }

    @Test
    public void test114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test114");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin((int) '4');
        ds.Item item2 = fPHeapMin1.min();
        ds.Item[] itemArray3 = new ds.Item[] {};
        fPHeapMin1.copia(itemArray3);
        ds.FPHeapMin fPHeapMin5 = new ds.FPHeapMin(itemArray3);
        ds.FPHeapMin fPHeapMin7 = new ds.FPHeapMin(0);
        fPHeapMin7.imprime();
        ds.Item[] itemArray9 = new ds.Item[] {};
        fPHeapMin7.copia(itemArray9);
        ds.FPHeapMin fPHeapMin11 = new ds.FPHeapMin(itemArray9);
        ds.FPHeapMin fPHeapMin13 = new ds.FPHeapMin((int) (short) -1);
        ds.FPHeapMin fPHeapMin15 = new ds.FPHeapMin(0);
        fPHeapMin15.imprime();
        ds.Item[] itemArray17 = new ds.Item[] {};
        fPHeapMin15.copia(itemArray17);
        ds.FPHeapMin fPHeapMin19 = new ds.FPHeapMin(itemArray17);
        fPHeapMin19.constroi();
        ds.Item[] itemArray21 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin22 = new ds.FPHeapMin(itemArray21);
        fPHeapMin19.copia(itemArray21);
        fPHeapMin13.copia(itemArray21);
        ds.FPHeapMin fPHeapMin26 = new ds.FPHeapMin((int) (short) -1);
        ds.FPHeapMin fPHeapMin28 = new ds.FPHeapMin(0);
        fPHeapMin28.imprime();
        ds.Item[] itemArray30 = new ds.Item[] {};
        fPHeapMin28.copia(itemArray30);
        ds.FPHeapMin fPHeapMin32 = new ds.FPHeapMin(itemArray30);
        fPHeapMin32.constroi();
        ds.Item[] itemArray34 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin35 = new ds.FPHeapMin(itemArray34);
        fPHeapMin32.copia(itemArray34);
        fPHeapMin26.copia(itemArray34);
        fPHeapMin13.copia(itemArray34);
        fPHeapMin11.copia(itemArray34);
        fPHeapMin5.copia(itemArray34);
        ds.FPHeapMin fPHeapMin41 = new ds.FPHeapMin(itemArray34);
        // The following exception was thrown during execution in test generation
        try {
            ds.Item item42 = fPHeapMin41.retiraMin();
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: heap vazio");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(item2);
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertNotNull(itemArray9);
        org.junit.Assert.assertNotNull(itemArray17);
        org.junit.Assert.assertNotNull(itemArray21);
        org.junit.Assert.assertNotNull(itemArray30);
        org.junit.Assert.assertNotNull(itemArray34);
    }

    @Test
    public void test115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test115");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin(0);
        fPHeapMin1.imprime();
        ds.Item[] itemArray3 = new ds.Item[] {};
        fPHeapMin1.copia(itemArray3);
        java.lang.Class<?> wildcardClass5 = fPHeapMin1.getClass();
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test116");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin((int) '4');
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
    public void test117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test117");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin((int) '4');
        ds.Item item2 = fPHeapMin1.min();
        ds.Item[] itemArray3 = new ds.Item[] {};
        fPHeapMin1.copia(itemArray3);
        ds.Item item5 = null;
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMin1.insere(item5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(item2);
        org.junit.Assert.assertNotNull(itemArray3);
    }

    @Test
    public void test118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test118");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin((int) (byte) 100);
        fPHeapMin1.constroi();
    }

    @Test
    public void test119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test119");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin((int) (short) 1);
        fPHeapMin1.constroi();
        fPHeapMin1.constroi();
        ds.FPHeapMin fPHeapMin5 = new ds.FPHeapMin((int) (short) -1);
        ds.FPHeapMin fPHeapMin7 = new ds.FPHeapMin(0);
        fPHeapMin7.imprime();
        ds.Item[] itemArray9 = new ds.Item[] {};
        fPHeapMin7.copia(itemArray9);
        ds.FPHeapMin fPHeapMin11 = new ds.FPHeapMin(itemArray9);
        fPHeapMin11.constroi();
        ds.Item[] itemArray13 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin14 = new ds.FPHeapMin(itemArray13);
        fPHeapMin11.copia(itemArray13);
        fPHeapMin5.copia(itemArray13);
        ds.FPHeapMin fPHeapMin18 = new ds.FPHeapMin((int) (short) -1);
        ds.FPHeapMin fPHeapMin20 = new ds.FPHeapMin(0);
        fPHeapMin20.imprime();
        ds.Item[] itemArray22 = new ds.Item[] {};
        fPHeapMin20.copia(itemArray22);
        ds.FPHeapMin fPHeapMin24 = new ds.FPHeapMin(itemArray22);
        fPHeapMin24.constroi();
        ds.Item[] itemArray26 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin27 = new ds.FPHeapMin(itemArray26);
        fPHeapMin24.copia(itemArray26);
        fPHeapMin18.copia(itemArray26);
        fPHeapMin5.copia(itemArray26);
        ds.FPHeapMin fPHeapMin32 = new ds.FPHeapMin((int) (byte) 100);
        ds.FPHeapMin fPHeapMin34 = new ds.FPHeapMin(0);
        fPHeapMin34.imprime();
        ds.Item[] itemArray36 = new ds.Item[] {};
        fPHeapMin34.copia(itemArray36);
        ds.FPHeapMin fPHeapMin38 = new ds.FPHeapMin(itemArray36);
        ds.FPHeapMin fPHeapMin40 = new ds.FPHeapMin(0);
        fPHeapMin40.imprime();
        ds.Item[] itemArray42 = new ds.Item[] {};
        fPHeapMin40.copia(itemArray42);
        fPHeapMin38.copia(itemArray42);
        fPHeapMin32.copia(itemArray42);
        fPHeapMin5.copia(itemArray42);
        fPHeapMin1.copia(itemArray42);
        fPHeapMin1.imprime();
        ds.FPHeapMin fPHeapMin50 = new ds.FPHeapMin((int) (short) -1);
        ds.FPHeapMin fPHeapMin52 = new ds.FPHeapMin(0);
        fPHeapMin52.imprime();
        ds.Item[] itemArray54 = new ds.Item[] {};
        fPHeapMin52.copia(itemArray54);
        ds.FPHeapMin fPHeapMin56 = new ds.FPHeapMin(itemArray54);
        fPHeapMin56.constroi();
        ds.Item[] itemArray58 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin59 = new ds.FPHeapMin(itemArray58);
        fPHeapMin56.copia(itemArray58);
        fPHeapMin50.copia(itemArray58);
        ds.Item[] itemArray62 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin63 = new ds.FPHeapMin(itemArray62);
        fPHeapMin50.copia(itemArray62);
        ds.FPHeapMin fPHeapMin66 = new ds.FPHeapMin((int) (byte) 100);
        ds.FPHeapMin fPHeapMin68 = new ds.FPHeapMin(0);
        fPHeapMin68.imprime();
        ds.Item[] itemArray70 = new ds.Item[] {};
        fPHeapMin68.copia(itemArray70);
        ds.FPHeapMin fPHeapMin72 = new ds.FPHeapMin(itemArray70);
        ds.FPHeapMin fPHeapMin74 = new ds.FPHeapMin(0);
        fPHeapMin74.imprime();
        ds.Item[] itemArray76 = new ds.Item[] {};
        fPHeapMin74.copia(itemArray76);
        fPHeapMin72.copia(itemArray76);
        fPHeapMin66.copia(itemArray76);
        fPHeapMin50.copia(itemArray76);
        fPHeapMin1.copia(itemArray76);
        org.junit.Assert.assertNotNull(itemArray9);
        org.junit.Assert.assertNotNull(itemArray13);
        org.junit.Assert.assertNotNull(itemArray22);
        org.junit.Assert.assertNotNull(itemArray26);
        org.junit.Assert.assertNotNull(itemArray36);
        org.junit.Assert.assertNotNull(itemArray42);
        org.junit.Assert.assertNotNull(itemArray54);
        org.junit.Assert.assertNotNull(itemArray58);
        org.junit.Assert.assertNotNull(itemArray62);
        org.junit.Assert.assertNotNull(itemArray70);
        org.junit.Assert.assertNotNull(itemArray76);
    }

    @Test
    public void test120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test120");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin((int) (byte) 100);
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
    public void test121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test121");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin((int) (short) -1);
        ds.FPHeapMin fPHeapMin3 = new ds.FPHeapMin(0);
        fPHeapMin3.imprime();
        ds.Item[] itemArray5 = new ds.Item[] {};
        fPHeapMin3.copia(itemArray5);
        ds.FPHeapMin fPHeapMin7 = new ds.FPHeapMin(itemArray5);
        fPHeapMin7.constroi();
        ds.Item[] itemArray9 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin10 = new ds.FPHeapMin(itemArray9);
        fPHeapMin7.copia(itemArray9);
        fPHeapMin1.copia(itemArray9);
        ds.Item[] itemArray13 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin14 = new ds.FPHeapMin(itemArray13);
        fPHeapMin1.copia(itemArray13);
        ds.FPHeapMin fPHeapMin17 = new ds.FPHeapMin((int) (byte) 100);
        ds.FPHeapMin fPHeapMin19 = new ds.FPHeapMin(0);
        fPHeapMin19.imprime();
        ds.Item[] itemArray21 = new ds.Item[] {};
        fPHeapMin19.copia(itemArray21);
        ds.FPHeapMin fPHeapMin23 = new ds.FPHeapMin(itemArray21);
        ds.FPHeapMin fPHeapMin25 = new ds.FPHeapMin(0);
        fPHeapMin25.imprime();
        ds.Item[] itemArray27 = new ds.Item[] {};
        fPHeapMin25.copia(itemArray27);
        fPHeapMin23.copia(itemArray27);
        fPHeapMin17.copia(itemArray27);
        fPHeapMin1.copia(itemArray27);
        ds.FPHeapMin fPHeapMin33 = new ds.FPHeapMin((int) (short) 100);
        ds.Item item34 = fPHeapMin33.min();
        ds.Item[] itemArray35 = new ds.Item[] {};
        fPHeapMin33.copia(itemArray35);
        ds.FPHeapMin fPHeapMin38 = new ds.FPHeapMin((int) (short) 100);
        ds.Item item39 = fPHeapMin38.min();
        ds.Item[] itemArray40 = new ds.Item[] {};
        fPHeapMin38.copia(itemArray40);
        fPHeapMin33.copia(itemArray40);
        fPHeapMin1.copia(itemArray40);
        org.junit.Assert.assertNotNull(itemArray5);
        org.junit.Assert.assertNotNull(itemArray9);
        org.junit.Assert.assertNotNull(itemArray13);
        org.junit.Assert.assertNotNull(itemArray21);
        org.junit.Assert.assertNotNull(itemArray27);
        org.junit.Assert.assertNull(item34);
        org.junit.Assert.assertNotNull(itemArray35);
        org.junit.Assert.assertNull(item39);
        org.junit.Assert.assertNotNull(itemArray40);
    }

    @Test
    public void test122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test122");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin(0);
        fPHeapMin1.imprime();
        ds.Item[] itemArray3 = new ds.Item[] {};
        fPHeapMin1.copia(itemArray3);
        ds.FPHeapMin fPHeapMin5 = new ds.FPHeapMin(itemArray3);
        ds.FPHeapMin fPHeapMin7 = new ds.FPHeapMin(0);
        fPHeapMin7.imprime();
        ds.Item[] itemArray9 = new ds.Item[] {};
        fPHeapMin7.copia(itemArray9);
        fPHeapMin5.copia(itemArray9);
        fPHeapMin5.constroi();
        ds.FPHeapMin fPHeapMin14 = new ds.FPHeapMin((int) (short) -1);
        ds.FPHeapMin fPHeapMin16 = new ds.FPHeapMin(0);
        fPHeapMin16.imprime();
        ds.Item[] itemArray18 = new ds.Item[] {};
        fPHeapMin16.copia(itemArray18);
        ds.FPHeapMin fPHeapMin20 = new ds.FPHeapMin(itemArray18);
        fPHeapMin20.constroi();
        ds.Item[] itemArray22 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin23 = new ds.FPHeapMin(itemArray22);
        fPHeapMin20.copia(itemArray22);
        fPHeapMin14.copia(itemArray22);
        ds.FPHeapMin fPHeapMin27 = new ds.FPHeapMin((int) (short) -1);
        ds.FPHeapMin fPHeapMin29 = new ds.FPHeapMin(0);
        fPHeapMin29.imprime();
        ds.Item[] itemArray31 = new ds.Item[] {};
        fPHeapMin29.copia(itemArray31);
        ds.FPHeapMin fPHeapMin33 = new ds.FPHeapMin(itemArray31);
        fPHeapMin33.constroi();
        ds.Item[] itemArray35 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin36 = new ds.FPHeapMin(itemArray35);
        fPHeapMin33.copia(itemArray35);
        fPHeapMin27.copia(itemArray35);
        fPHeapMin14.copia(itemArray35);
        ds.FPHeapMin fPHeapMin40 = new ds.FPHeapMin(itemArray35);
        fPHeapMin5.copia(itemArray35);
        fPHeapMin5.constroi();
        fPHeapMin5.imprime();
        // The following exception was thrown during execution in test generation
        try {
            ds.Item item44 = fPHeapMin5.retiraMin();
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: heap vazio");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertNotNull(itemArray9);
        org.junit.Assert.assertNotNull(itemArray18);
        org.junit.Assert.assertNotNull(itemArray22);
        org.junit.Assert.assertNotNull(itemArray31);
        org.junit.Assert.assertNotNull(itemArray35);
    }

    @Test
    public void test123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test123");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin(0);
        fPHeapMin1.imprime();
        fPHeapMin1.constroi();
        ds.FPHeapMin fPHeapMin5 = new ds.FPHeapMin(0);
        fPHeapMin5.imprime();
        ds.FPHeapMin fPHeapMin8 = new ds.FPHeapMin((int) (short) -1);
        ds.FPHeapMin fPHeapMin10 = new ds.FPHeapMin(0);
        fPHeapMin10.imprime();
        ds.Item[] itemArray12 = new ds.Item[] {};
        fPHeapMin10.copia(itemArray12);
        ds.FPHeapMin fPHeapMin14 = new ds.FPHeapMin(itemArray12);
        fPHeapMin14.constroi();
        ds.Item[] itemArray16 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin17 = new ds.FPHeapMin(itemArray16);
        fPHeapMin14.copia(itemArray16);
        fPHeapMin8.copia(itemArray16);
        ds.FPHeapMin fPHeapMin21 = new ds.FPHeapMin((int) (short) -1);
        ds.FPHeapMin fPHeapMin23 = new ds.FPHeapMin(0);
        fPHeapMin23.imprime();
        ds.Item[] itemArray25 = new ds.Item[] {};
        fPHeapMin23.copia(itemArray25);
        ds.FPHeapMin fPHeapMin27 = new ds.FPHeapMin(itemArray25);
        fPHeapMin27.constroi();
        ds.Item[] itemArray29 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin30 = new ds.FPHeapMin(itemArray29);
        fPHeapMin27.copia(itemArray29);
        fPHeapMin21.copia(itemArray29);
        fPHeapMin8.copia(itemArray29);
        ds.FPHeapMin fPHeapMin35 = new ds.FPHeapMin((int) (byte) 100);
        ds.FPHeapMin fPHeapMin37 = new ds.FPHeapMin(0);
        fPHeapMin37.imprime();
        ds.Item[] itemArray39 = new ds.Item[] {};
        fPHeapMin37.copia(itemArray39);
        ds.FPHeapMin fPHeapMin41 = new ds.FPHeapMin(itemArray39);
        ds.FPHeapMin fPHeapMin43 = new ds.FPHeapMin(0);
        fPHeapMin43.imprime();
        ds.Item[] itemArray45 = new ds.Item[] {};
        fPHeapMin43.copia(itemArray45);
        fPHeapMin41.copia(itemArray45);
        fPHeapMin35.copia(itemArray45);
        fPHeapMin8.copia(itemArray45);
        ds.FPHeapMin fPHeapMin51 = new ds.FPHeapMin(0);
        fPHeapMin51.imprime();
        ds.Item[] itemArray53 = new ds.Item[] {};
        fPHeapMin51.copia(itemArray53);
        ds.FPHeapMin fPHeapMin55 = new ds.FPHeapMin(itemArray53);
        fPHeapMin55.constroi();
        ds.Item[] itemArray57 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin58 = new ds.FPHeapMin(itemArray57);
        fPHeapMin55.copia(itemArray57);
        ds.FPHeapMin fPHeapMin61 = new ds.FPHeapMin((int) (short) -1);
        ds.FPHeapMin fPHeapMin63 = new ds.FPHeapMin(0);
        fPHeapMin63.imprime();
        ds.Item[] itemArray65 = new ds.Item[] {};
        fPHeapMin63.copia(itemArray65);
        ds.FPHeapMin fPHeapMin67 = new ds.FPHeapMin(itemArray65);
        fPHeapMin67.constroi();
        ds.Item[] itemArray69 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin70 = new ds.FPHeapMin(itemArray69);
        fPHeapMin67.copia(itemArray69);
        fPHeapMin61.copia(itemArray69);
        ds.FPHeapMin fPHeapMin73 = new ds.FPHeapMin(itemArray69);
        fPHeapMin55.copia(itemArray69);
        fPHeapMin8.copia(itemArray69);
        fPHeapMin5.copia(itemArray69);
        fPHeapMin1.copia(itemArray69);
        fPHeapMin1.imprime();
        org.junit.Assert.assertNotNull(itemArray12);
        org.junit.Assert.assertNotNull(itemArray16);
        org.junit.Assert.assertNotNull(itemArray25);
        org.junit.Assert.assertNotNull(itemArray29);
        org.junit.Assert.assertNotNull(itemArray39);
        org.junit.Assert.assertNotNull(itemArray45);
        org.junit.Assert.assertNotNull(itemArray53);
        org.junit.Assert.assertNotNull(itemArray57);
        org.junit.Assert.assertNotNull(itemArray65);
        org.junit.Assert.assertNotNull(itemArray69);
    }

    @Test
    public void test124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test124");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin((int) (short) -1);
        ds.FPHeapMin fPHeapMin3 = new ds.FPHeapMin(0);
        fPHeapMin3.imprime();
        ds.Item[] itemArray5 = new ds.Item[] {};
        fPHeapMin3.copia(itemArray5);
        ds.FPHeapMin fPHeapMin7 = new ds.FPHeapMin(itemArray5);
        fPHeapMin7.constroi();
        ds.Item[] itemArray9 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin10 = new ds.FPHeapMin(itemArray9);
        fPHeapMin7.copia(itemArray9);
        fPHeapMin1.copia(itemArray9);
        ds.Item[] itemArray13 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin14 = new ds.FPHeapMin(itemArray13);
        fPHeapMin1.copia(itemArray13);
        fPHeapMin1.imprime();
        org.junit.Assert.assertNotNull(itemArray5);
        org.junit.Assert.assertNotNull(itemArray9);
        org.junit.Assert.assertNotNull(itemArray13);
    }

    @Test
    public void test125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test125");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin((int) (short) -1);
        ds.FPHeapMin fPHeapMin3 = new ds.FPHeapMin(0);
        fPHeapMin3.imprime();
        ds.Item[] itemArray5 = new ds.Item[] {};
        fPHeapMin3.copia(itemArray5);
        ds.FPHeapMin fPHeapMin7 = new ds.FPHeapMin(itemArray5);
        fPHeapMin7.constroi();
        ds.Item[] itemArray9 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin10 = new ds.FPHeapMin(itemArray9);
        fPHeapMin7.copia(itemArray9);
        fPHeapMin1.copia(itemArray9);
        ds.Item[] itemArray13 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin14 = new ds.FPHeapMin(itemArray13);
        fPHeapMin1.copia(itemArray13);
        ds.FPHeapMin fPHeapMin17 = new ds.FPHeapMin(0);
        fPHeapMin17.imprime();
        ds.Item[] itemArray19 = new ds.Item[] {};
        fPHeapMin17.copia(itemArray19);
        ds.FPHeapMin fPHeapMin21 = new ds.FPHeapMin(itemArray19);
        ds.FPHeapMin fPHeapMin23 = new ds.FPHeapMin(0);
        fPHeapMin23.imprime();
        ds.Item[] itemArray25 = new ds.Item[] {};
        fPHeapMin23.copia(itemArray25);
        fPHeapMin21.copia(itemArray25);
        ds.FPHeapMin fPHeapMin28 = new ds.FPHeapMin(itemArray25);
        fPHeapMin1.copia(itemArray25);
        fPHeapMin1.constroi();
        // The following exception was thrown during execution in test generation
        try {
            ds.Item item31 = fPHeapMin1.min();
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray5);
        org.junit.Assert.assertNotNull(itemArray9);
        org.junit.Assert.assertNotNull(itemArray13);
        org.junit.Assert.assertNotNull(itemArray19);
        org.junit.Assert.assertNotNull(itemArray25);
    }

    @Test
    public void test126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test126");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin((int) '4');
        ds.Item item2 = fPHeapMin1.min();
        ds.FPHeapMin fPHeapMin4 = new ds.FPHeapMin((int) (short) -1);
        ds.FPHeapMin fPHeapMin6 = new ds.FPHeapMin(0);
        fPHeapMin6.imprime();
        ds.Item[] itemArray8 = new ds.Item[] {};
        fPHeapMin6.copia(itemArray8);
        ds.FPHeapMin fPHeapMin10 = new ds.FPHeapMin(itemArray8);
        fPHeapMin10.constroi();
        ds.Item[] itemArray12 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin13 = new ds.FPHeapMin(itemArray12);
        fPHeapMin10.copia(itemArray12);
        fPHeapMin4.copia(itemArray12);
        ds.FPHeapMin fPHeapMin17 = new ds.FPHeapMin((int) (short) -1);
        ds.FPHeapMin fPHeapMin19 = new ds.FPHeapMin(0);
        fPHeapMin19.imprime();
        ds.Item[] itemArray21 = new ds.Item[] {};
        fPHeapMin19.copia(itemArray21);
        ds.FPHeapMin fPHeapMin23 = new ds.FPHeapMin(itemArray21);
        fPHeapMin23.constroi();
        ds.Item[] itemArray25 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin26 = new ds.FPHeapMin(itemArray25);
        fPHeapMin23.copia(itemArray25);
        fPHeapMin17.copia(itemArray25);
        fPHeapMin4.copia(itemArray25);
        fPHeapMin1.copia(itemArray25);
        java.lang.Class<?> wildcardClass31 = fPHeapMin1.getClass();
        org.junit.Assert.assertNull(item2);
        org.junit.Assert.assertNotNull(itemArray8);
        org.junit.Assert.assertNotNull(itemArray12);
        org.junit.Assert.assertNotNull(itemArray21);
        org.junit.Assert.assertNotNull(itemArray25);
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test127");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin((-1));
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMin1.refaz((int) (byte) 100, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 100");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test128");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin((int) (byte) 100);
        ds.Item item2 = fPHeapMin1.min();
        ds.FPHeapMin fPHeapMin4 = new ds.FPHeapMin((int) (short) -1);
        ds.FPHeapMin fPHeapMin6 = new ds.FPHeapMin(0);
        fPHeapMin6.imprime();
        ds.Item[] itemArray8 = new ds.Item[] {};
        fPHeapMin6.copia(itemArray8);
        ds.FPHeapMin fPHeapMin10 = new ds.FPHeapMin(itemArray8);
        fPHeapMin10.constroi();
        ds.Item[] itemArray12 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin13 = new ds.FPHeapMin(itemArray12);
        fPHeapMin10.copia(itemArray12);
        fPHeapMin4.copia(itemArray12);
        ds.Item[] itemArray16 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin17 = new ds.FPHeapMin(itemArray16);
        fPHeapMin4.copia(itemArray16);
        ds.FPHeapMin fPHeapMin19 = new ds.FPHeapMin(itemArray16);
        fPHeapMin1.copia(itemArray16);
        java.lang.Class<?> wildcardClass21 = itemArray16.getClass();
        org.junit.Assert.assertNull(item2);
        org.junit.Assert.assertNotNull(itemArray8);
        org.junit.Assert.assertNotNull(itemArray12);
        org.junit.Assert.assertNotNull(itemArray16);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test129");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin(0);
        fPHeapMin1.imprime();
        ds.Item[] itemArray3 = new ds.Item[] {};
        fPHeapMin1.copia(itemArray3);
        ds.FPHeapMin fPHeapMin5 = new ds.FPHeapMin(itemArray3);
        fPHeapMin5.constroi();
        ds.Item[] itemArray7 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin8 = new ds.FPHeapMin(itemArray7);
        fPHeapMin5.copia(itemArray7);
        ds.FPHeapMin fPHeapMin11 = new ds.FPHeapMin((int) (short) -1);
        ds.FPHeapMin fPHeapMin13 = new ds.FPHeapMin(0);
        fPHeapMin13.imprime();
        ds.Item[] itemArray15 = new ds.Item[] {};
        fPHeapMin13.copia(itemArray15);
        ds.FPHeapMin fPHeapMin17 = new ds.FPHeapMin(itemArray15);
        fPHeapMin17.constroi();
        ds.Item[] itemArray19 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin20 = new ds.FPHeapMin(itemArray19);
        fPHeapMin17.copia(itemArray19);
        fPHeapMin11.copia(itemArray19);
        ds.FPHeapMin fPHeapMin24 = new ds.FPHeapMin((int) (short) -1);
        ds.FPHeapMin fPHeapMin26 = new ds.FPHeapMin(0);
        fPHeapMin26.imprime();
        ds.Item[] itemArray28 = new ds.Item[] {};
        fPHeapMin26.copia(itemArray28);
        ds.FPHeapMin fPHeapMin30 = new ds.FPHeapMin(itemArray28);
        fPHeapMin30.constroi();
        ds.Item[] itemArray32 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin33 = new ds.FPHeapMin(itemArray32);
        fPHeapMin30.copia(itemArray32);
        fPHeapMin24.copia(itemArray32);
        fPHeapMin11.copia(itemArray32);
        fPHeapMin5.copia(itemArray32);
        ds.FPHeapMin fPHeapMin39 = new ds.FPHeapMin((int) (short) -1);
        ds.FPHeapMin fPHeapMin41 = new ds.FPHeapMin(0);
        fPHeapMin41.imprime();
        ds.Item[] itemArray43 = new ds.Item[] {};
        fPHeapMin41.copia(itemArray43);
        ds.FPHeapMin fPHeapMin45 = new ds.FPHeapMin(itemArray43);
        fPHeapMin45.constroi();
        ds.Item[] itemArray47 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin48 = new ds.FPHeapMin(itemArray47);
        fPHeapMin45.copia(itemArray47);
        fPHeapMin39.copia(itemArray47);
        fPHeapMin5.copia(itemArray47);
        ds.FPHeapMin fPHeapMin53 = new ds.FPHeapMin(0);
        fPHeapMin53.imprime();
        ds.Item[] itemArray55 = new ds.Item[] {};
        fPHeapMin53.copia(itemArray55);
        ds.FPHeapMin fPHeapMin57 = new ds.FPHeapMin(itemArray55);
        ds.FPHeapMin fPHeapMin59 = new ds.FPHeapMin((int) (short) -1);
        ds.FPHeapMin fPHeapMin61 = new ds.FPHeapMin(0);
        fPHeapMin61.imprime();
        ds.Item[] itemArray63 = new ds.Item[] {};
        fPHeapMin61.copia(itemArray63);
        ds.FPHeapMin fPHeapMin65 = new ds.FPHeapMin(itemArray63);
        fPHeapMin65.constroi();
        ds.Item[] itemArray67 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin68 = new ds.FPHeapMin(itemArray67);
        fPHeapMin65.copia(itemArray67);
        fPHeapMin59.copia(itemArray67);
        ds.FPHeapMin fPHeapMin72 = new ds.FPHeapMin((int) (short) -1);
        ds.FPHeapMin fPHeapMin74 = new ds.FPHeapMin(0);
        fPHeapMin74.imprime();
        ds.Item[] itemArray76 = new ds.Item[] {};
        fPHeapMin74.copia(itemArray76);
        ds.FPHeapMin fPHeapMin78 = new ds.FPHeapMin(itemArray76);
        fPHeapMin78.constroi();
        ds.Item[] itemArray80 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin81 = new ds.FPHeapMin(itemArray80);
        fPHeapMin78.copia(itemArray80);
        fPHeapMin72.copia(itemArray80);
        fPHeapMin59.copia(itemArray80);
        fPHeapMin57.copia(itemArray80);
        fPHeapMin5.copia(itemArray80);
        // The following exception was thrown during execution in test generation
        try {
            ds.Item item87 = fPHeapMin5.retiraMin();
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: heap vazio");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertNotNull(itemArray7);
        org.junit.Assert.assertNotNull(itemArray15);
        org.junit.Assert.assertNotNull(itemArray19);
        org.junit.Assert.assertNotNull(itemArray28);
        org.junit.Assert.assertNotNull(itemArray32);
        org.junit.Assert.assertNotNull(itemArray43);
        org.junit.Assert.assertNotNull(itemArray47);
        org.junit.Assert.assertNotNull(itemArray55);
        org.junit.Assert.assertNotNull(itemArray63);
        org.junit.Assert.assertNotNull(itemArray67);
        org.junit.Assert.assertNotNull(itemArray76);
        org.junit.Assert.assertNotNull(itemArray80);
    }

    @Test
    public void test130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test130");
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
    public void test131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test131");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin((int) (byte) 100);
        ds.Item item2 = fPHeapMin1.min();
        ds.FPHeapMin fPHeapMin4 = new ds.FPHeapMin((int) (short) -1);
        ds.FPHeapMin fPHeapMin6 = new ds.FPHeapMin(0);
        fPHeapMin6.imprime();
        ds.Item[] itemArray8 = new ds.Item[] {};
        fPHeapMin6.copia(itemArray8);
        ds.FPHeapMin fPHeapMin10 = new ds.FPHeapMin(itemArray8);
        fPHeapMin10.constroi();
        ds.Item[] itemArray12 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin13 = new ds.FPHeapMin(itemArray12);
        fPHeapMin10.copia(itemArray12);
        fPHeapMin4.copia(itemArray12);
        ds.Item[] itemArray16 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin17 = new ds.FPHeapMin(itemArray16);
        fPHeapMin4.copia(itemArray16);
        ds.FPHeapMin fPHeapMin19 = new ds.FPHeapMin(itemArray16);
        fPHeapMin1.copia(itemArray16);
        ds.FPHeapMin fPHeapMin21 = new ds.FPHeapMin(itemArray16);
        org.junit.Assert.assertNull(item2);
        org.junit.Assert.assertNotNull(itemArray8);
        org.junit.Assert.assertNotNull(itemArray12);
        org.junit.Assert.assertNotNull(itemArray16);
    }

    @Test
    public void test132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test132");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin((int) (short) -1);
        ds.FPHeapMin fPHeapMin3 = new ds.FPHeapMin(0);
        fPHeapMin3.imprime();
        ds.Item[] itemArray5 = new ds.Item[] {};
        fPHeapMin3.copia(itemArray5);
        ds.FPHeapMin fPHeapMin7 = new ds.FPHeapMin(itemArray5);
        fPHeapMin7.constroi();
        ds.Item[] itemArray9 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin10 = new ds.FPHeapMin(itemArray9);
        fPHeapMin7.copia(itemArray9);
        fPHeapMin1.copia(itemArray9);
        ds.FPHeapMin fPHeapMin14 = new ds.FPHeapMin((int) (short) -1);
        ds.FPHeapMin fPHeapMin16 = new ds.FPHeapMin(0);
        fPHeapMin16.imprime();
        ds.Item[] itemArray18 = new ds.Item[] {};
        fPHeapMin16.copia(itemArray18);
        ds.FPHeapMin fPHeapMin20 = new ds.FPHeapMin(itemArray18);
        fPHeapMin20.constroi();
        ds.Item[] itemArray22 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin23 = new ds.FPHeapMin(itemArray22);
        fPHeapMin20.copia(itemArray22);
        fPHeapMin14.copia(itemArray22);
        fPHeapMin1.copia(itemArray22);
        ds.FPHeapMin fPHeapMin28 = new ds.FPHeapMin((int) (byte) 100);
        ds.FPHeapMin fPHeapMin30 = new ds.FPHeapMin(0);
        fPHeapMin30.imprime();
        ds.Item[] itemArray32 = new ds.Item[] {};
        fPHeapMin30.copia(itemArray32);
        ds.FPHeapMin fPHeapMin34 = new ds.FPHeapMin(itemArray32);
        ds.FPHeapMin fPHeapMin36 = new ds.FPHeapMin(0);
        fPHeapMin36.imprime();
        ds.Item[] itemArray38 = new ds.Item[] {};
        fPHeapMin36.copia(itemArray38);
        fPHeapMin34.copia(itemArray38);
        fPHeapMin28.copia(itemArray38);
        fPHeapMin1.copia(itemArray38);
        ds.FPHeapMin fPHeapMin44 = new ds.FPHeapMin(0);
        fPHeapMin44.imprime();
        ds.Item[] itemArray46 = new ds.Item[] {};
        fPHeapMin44.copia(itemArray46);
        ds.FPHeapMin fPHeapMin48 = new ds.FPHeapMin(itemArray46);
        fPHeapMin48.constroi();
        ds.Item[] itemArray50 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin51 = new ds.FPHeapMin(itemArray50);
        fPHeapMin48.copia(itemArray50);
        ds.FPHeapMin fPHeapMin54 = new ds.FPHeapMin((int) (short) -1);
        ds.FPHeapMin fPHeapMin56 = new ds.FPHeapMin(0);
        fPHeapMin56.imprime();
        ds.Item[] itemArray58 = new ds.Item[] {};
        fPHeapMin56.copia(itemArray58);
        ds.FPHeapMin fPHeapMin60 = new ds.FPHeapMin(itemArray58);
        fPHeapMin60.constroi();
        ds.Item[] itemArray62 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin63 = new ds.FPHeapMin(itemArray62);
        fPHeapMin60.copia(itemArray62);
        fPHeapMin54.copia(itemArray62);
        ds.FPHeapMin fPHeapMin66 = new ds.FPHeapMin(itemArray62);
        fPHeapMin48.copia(itemArray62);
        fPHeapMin1.copia(itemArray62);
        ds.FPHeapMin fPHeapMin69 = new ds.FPHeapMin(itemArray62);
        org.junit.Assert.assertNotNull(itemArray5);
        org.junit.Assert.assertNotNull(itemArray9);
        org.junit.Assert.assertNotNull(itemArray18);
        org.junit.Assert.assertNotNull(itemArray22);
        org.junit.Assert.assertNotNull(itemArray32);
        org.junit.Assert.assertNotNull(itemArray38);
        org.junit.Assert.assertNotNull(itemArray46);
        org.junit.Assert.assertNotNull(itemArray50);
        org.junit.Assert.assertNotNull(itemArray58);
        org.junit.Assert.assertNotNull(itemArray62);
    }

    @Test
    public void test133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test133");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin((int) (byte) 100);
        fPHeapMin1.imprime();
        fPHeapMin1.constroi();
    }

    @Test
    public void test134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test134");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin(0);
        fPHeapMin1.imprime();
        fPHeapMin1.constroi();
        ds.FPHeapMin fPHeapMin5 = new ds.FPHeapMin(0);
        fPHeapMin5.imprime();
        ds.FPHeapMin fPHeapMin8 = new ds.FPHeapMin((int) (short) -1);
        ds.FPHeapMin fPHeapMin10 = new ds.FPHeapMin(0);
        fPHeapMin10.imprime();
        ds.Item[] itemArray12 = new ds.Item[] {};
        fPHeapMin10.copia(itemArray12);
        ds.FPHeapMin fPHeapMin14 = new ds.FPHeapMin(itemArray12);
        fPHeapMin14.constroi();
        ds.Item[] itemArray16 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin17 = new ds.FPHeapMin(itemArray16);
        fPHeapMin14.copia(itemArray16);
        fPHeapMin8.copia(itemArray16);
        ds.FPHeapMin fPHeapMin21 = new ds.FPHeapMin((int) (short) -1);
        ds.FPHeapMin fPHeapMin23 = new ds.FPHeapMin(0);
        fPHeapMin23.imprime();
        ds.Item[] itemArray25 = new ds.Item[] {};
        fPHeapMin23.copia(itemArray25);
        ds.FPHeapMin fPHeapMin27 = new ds.FPHeapMin(itemArray25);
        fPHeapMin27.constroi();
        ds.Item[] itemArray29 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin30 = new ds.FPHeapMin(itemArray29);
        fPHeapMin27.copia(itemArray29);
        fPHeapMin21.copia(itemArray29);
        fPHeapMin8.copia(itemArray29);
        ds.FPHeapMin fPHeapMin35 = new ds.FPHeapMin((int) (byte) 100);
        ds.FPHeapMin fPHeapMin37 = new ds.FPHeapMin(0);
        fPHeapMin37.imprime();
        ds.Item[] itemArray39 = new ds.Item[] {};
        fPHeapMin37.copia(itemArray39);
        ds.FPHeapMin fPHeapMin41 = new ds.FPHeapMin(itemArray39);
        ds.FPHeapMin fPHeapMin43 = new ds.FPHeapMin(0);
        fPHeapMin43.imprime();
        ds.Item[] itemArray45 = new ds.Item[] {};
        fPHeapMin43.copia(itemArray45);
        fPHeapMin41.copia(itemArray45);
        fPHeapMin35.copia(itemArray45);
        fPHeapMin8.copia(itemArray45);
        ds.FPHeapMin fPHeapMin51 = new ds.FPHeapMin(0);
        fPHeapMin51.imprime();
        ds.Item[] itemArray53 = new ds.Item[] {};
        fPHeapMin51.copia(itemArray53);
        ds.FPHeapMin fPHeapMin55 = new ds.FPHeapMin(itemArray53);
        fPHeapMin55.constroi();
        ds.Item[] itemArray57 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin58 = new ds.FPHeapMin(itemArray57);
        fPHeapMin55.copia(itemArray57);
        ds.FPHeapMin fPHeapMin61 = new ds.FPHeapMin((int) (short) -1);
        ds.FPHeapMin fPHeapMin63 = new ds.FPHeapMin(0);
        fPHeapMin63.imprime();
        ds.Item[] itemArray65 = new ds.Item[] {};
        fPHeapMin63.copia(itemArray65);
        ds.FPHeapMin fPHeapMin67 = new ds.FPHeapMin(itemArray65);
        fPHeapMin67.constroi();
        ds.Item[] itemArray69 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin70 = new ds.FPHeapMin(itemArray69);
        fPHeapMin67.copia(itemArray69);
        fPHeapMin61.copia(itemArray69);
        ds.FPHeapMin fPHeapMin73 = new ds.FPHeapMin(itemArray69);
        fPHeapMin55.copia(itemArray69);
        fPHeapMin8.copia(itemArray69);
        fPHeapMin5.copia(itemArray69);
        fPHeapMin1.copia(itemArray69);
        java.lang.Class<?> wildcardClass78 = fPHeapMin1.getClass();
        org.junit.Assert.assertNotNull(itemArray12);
        org.junit.Assert.assertNotNull(itemArray16);
        org.junit.Assert.assertNotNull(itemArray25);
        org.junit.Assert.assertNotNull(itemArray29);
        org.junit.Assert.assertNotNull(itemArray39);
        org.junit.Assert.assertNotNull(itemArray45);
        org.junit.Assert.assertNotNull(itemArray53);
        org.junit.Assert.assertNotNull(itemArray57);
        org.junit.Assert.assertNotNull(itemArray65);
        org.junit.Assert.assertNotNull(itemArray69);
        org.junit.Assert.assertNotNull(wildcardClass78);
    }

    @Test
    public void test135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test135");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin(10);
    }

    @Test
    public void test136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test136");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin(0);
        fPHeapMin1.imprime();
        ds.Item[] itemArray3 = new ds.Item[] {};
        fPHeapMin1.copia(itemArray3);
        ds.FPHeapMin fPHeapMin5 = new ds.FPHeapMin(itemArray3);
        fPHeapMin5.constroi();
        ds.Item[] itemArray7 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin8 = new ds.FPHeapMin(itemArray7);
        fPHeapMin5.copia(itemArray7);
        fPHeapMin5.constroi();
        // The following exception was thrown during execution in test generation
        try {
            ds.Item item11 = fPHeapMin5.retiraMin();
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: heap vazio");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertNotNull(itemArray7);
    }

    @Test
    public void test137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test137");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin((int) '4');
        ds.Item item2 = fPHeapMin1.min();
        java.lang.Class<?> wildcardClass3 = fPHeapMin1.getClass();
        org.junit.Assert.assertNull(item2);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test138");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin(0);
        fPHeapMin1.imprime();
        ds.Item[] itemArray3 = new ds.Item[] {};
        fPHeapMin1.copia(itemArray3);
        ds.FPHeapMin fPHeapMin5 = new ds.FPHeapMin(itemArray3);
        fPHeapMin5.constroi();
        ds.Item[] itemArray7 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin8 = new ds.FPHeapMin(itemArray7);
        fPHeapMin5.copia(itemArray7);
        ds.FPHeapMin fPHeapMin11 = new ds.FPHeapMin((int) (short) -1);
        ds.FPHeapMin fPHeapMin13 = new ds.FPHeapMin(0);
        fPHeapMin13.imprime();
        ds.Item[] itemArray15 = new ds.Item[] {};
        fPHeapMin13.copia(itemArray15);
        ds.FPHeapMin fPHeapMin17 = new ds.FPHeapMin(itemArray15);
        fPHeapMin17.constroi();
        ds.Item[] itemArray19 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin20 = new ds.FPHeapMin(itemArray19);
        fPHeapMin17.copia(itemArray19);
        fPHeapMin11.copia(itemArray19);
        ds.FPHeapMin fPHeapMin24 = new ds.FPHeapMin((int) (short) -1);
        ds.FPHeapMin fPHeapMin26 = new ds.FPHeapMin(0);
        fPHeapMin26.imprime();
        ds.Item[] itemArray28 = new ds.Item[] {};
        fPHeapMin26.copia(itemArray28);
        ds.FPHeapMin fPHeapMin30 = new ds.FPHeapMin(itemArray28);
        fPHeapMin30.constroi();
        ds.Item[] itemArray32 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin33 = new ds.FPHeapMin(itemArray32);
        fPHeapMin30.copia(itemArray32);
        fPHeapMin24.copia(itemArray32);
        fPHeapMin11.copia(itemArray32);
        fPHeapMin5.copia(itemArray32);
        ds.FPHeapMin fPHeapMin39 = new ds.FPHeapMin((int) (short) -1);
        ds.FPHeapMin fPHeapMin41 = new ds.FPHeapMin(0);
        fPHeapMin41.imprime();
        ds.Item[] itemArray43 = new ds.Item[] {};
        fPHeapMin41.copia(itemArray43);
        ds.FPHeapMin fPHeapMin45 = new ds.FPHeapMin(itemArray43);
        fPHeapMin45.constroi();
        ds.Item[] itemArray47 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin48 = new ds.FPHeapMin(itemArray47);
        fPHeapMin45.copia(itemArray47);
        fPHeapMin39.copia(itemArray47);
        fPHeapMin5.copia(itemArray47);
        ds.FPHeapMin fPHeapMin53 = new ds.FPHeapMin(0);
        fPHeapMin53.imprime();
        ds.Item[] itemArray55 = new ds.Item[] {};
        fPHeapMin53.copia(itemArray55);
        ds.FPHeapMin fPHeapMin57 = new ds.FPHeapMin(itemArray55);
        ds.FPHeapMin fPHeapMin59 = new ds.FPHeapMin((int) (short) -1);
        ds.FPHeapMin fPHeapMin61 = new ds.FPHeapMin(0);
        fPHeapMin61.imprime();
        ds.Item[] itemArray63 = new ds.Item[] {};
        fPHeapMin61.copia(itemArray63);
        ds.FPHeapMin fPHeapMin65 = new ds.FPHeapMin(itemArray63);
        fPHeapMin65.constroi();
        ds.Item[] itemArray67 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin68 = new ds.FPHeapMin(itemArray67);
        fPHeapMin65.copia(itemArray67);
        fPHeapMin59.copia(itemArray67);
        ds.FPHeapMin fPHeapMin72 = new ds.FPHeapMin((int) (short) -1);
        ds.FPHeapMin fPHeapMin74 = new ds.FPHeapMin(0);
        fPHeapMin74.imprime();
        ds.Item[] itemArray76 = new ds.Item[] {};
        fPHeapMin74.copia(itemArray76);
        ds.FPHeapMin fPHeapMin78 = new ds.FPHeapMin(itemArray76);
        fPHeapMin78.constroi();
        ds.Item[] itemArray80 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin81 = new ds.FPHeapMin(itemArray80);
        fPHeapMin78.copia(itemArray80);
        fPHeapMin72.copia(itemArray80);
        fPHeapMin59.copia(itemArray80);
        fPHeapMin57.copia(itemArray80);
        fPHeapMin5.copia(itemArray80);
        java.lang.Class<?> wildcardClass87 = fPHeapMin5.getClass();
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertNotNull(itemArray7);
        org.junit.Assert.assertNotNull(itemArray15);
        org.junit.Assert.assertNotNull(itemArray19);
        org.junit.Assert.assertNotNull(itemArray28);
        org.junit.Assert.assertNotNull(itemArray32);
        org.junit.Assert.assertNotNull(itemArray43);
        org.junit.Assert.assertNotNull(itemArray47);
        org.junit.Assert.assertNotNull(itemArray55);
        org.junit.Assert.assertNotNull(itemArray63);
        org.junit.Assert.assertNotNull(itemArray67);
        org.junit.Assert.assertNotNull(itemArray76);
        org.junit.Assert.assertNotNull(itemArray80);
        org.junit.Assert.assertNotNull(wildcardClass87);
    }

    @Test
    public void test139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test139");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin((int) '4');
        ds.Item item2 = fPHeapMin1.min();
        ds.Item[] itemArray3 = new ds.Item[] {};
        fPHeapMin1.copia(itemArray3);
        ds.FPHeapMin fPHeapMin5 = new ds.FPHeapMin(itemArray3);
        ds.FPHeapMin fPHeapMin8 = new ds.FPHeapMin(0);
        fPHeapMin8.imprime();
        ds.Item[] itemArray10 = new ds.Item[] {};
        fPHeapMin8.copia(itemArray10);
        ds.FPHeapMin fPHeapMin12 = new ds.FPHeapMin(itemArray10);
        fPHeapMin12.constroi();
        ds.Item[] itemArray14 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin15 = new ds.FPHeapMin(itemArray14);
        fPHeapMin12.copia(itemArray14);
        ds.FPHeapMin fPHeapMin18 = new ds.FPHeapMin((int) (short) -1);
        ds.FPHeapMin fPHeapMin20 = new ds.FPHeapMin(0);
        fPHeapMin20.imprime();
        ds.Item[] itemArray22 = new ds.Item[] {};
        fPHeapMin20.copia(itemArray22);
        ds.FPHeapMin fPHeapMin24 = new ds.FPHeapMin(itemArray22);
        fPHeapMin24.constroi();
        ds.Item[] itemArray26 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin27 = new ds.FPHeapMin(itemArray26);
        fPHeapMin24.copia(itemArray26);
        fPHeapMin18.copia(itemArray26);
        ds.FPHeapMin fPHeapMin31 = new ds.FPHeapMin((int) (short) -1);
        ds.FPHeapMin fPHeapMin33 = new ds.FPHeapMin(0);
        fPHeapMin33.imprime();
        ds.Item[] itemArray35 = new ds.Item[] {};
        fPHeapMin33.copia(itemArray35);
        ds.FPHeapMin fPHeapMin37 = new ds.FPHeapMin(itemArray35);
        fPHeapMin37.constroi();
        ds.Item[] itemArray39 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin40 = new ds.FPHeapMin(itemArray39);
        fPHeapMin37.copia(itemArray39);
        fPHeapMin31.copia(itemArray39);
        fPHeapMin18.copia(itemArray39);
        fPHeapMin12.copia(itemArray39);
        java.lang.Class<?> wildcardClass45 = fPHeapMin12.getClass();
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMin5.diminuiChave((int) (short) 1, (java.lang.Object) wildcardClass45);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(item2);
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertNotNull(itemArray10);
        org.junit.Assert.assertNotNull(itemArray14);
        org.junit.Assert.assertNotNull(itemArray22);
        org.junit.Assert.assertNotNull(itemArray26);
        org.junit.Assert.assertNotNull(itemArray35);
        org.junit.Assert.assertNotNull(itemArray39);
        org.junit.Assert.assertNotNull(wildcardClass45);
    }

    @Test
    public void test140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test140");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin((int) (byte) 100);
        ds.Item item2 = fPHeapMin1.min();
        fPHeapMin1.imprime();
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
    public void test141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test141");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin(0);
        fPHeapMin1.imprime();
        ds.Item[] itemArray3 = new ds.Item[] {};
        fPHeapMin1.copia(itemArray3);
        ds.FPHeapMin fPHeapMin5 = new ds.FPHeapMin(itemArray3);
        ds.FPHeapMin fPHeapMin7 = new ds.FPHeapMin(0);
        fPHeapMin7.imprime();
        ds.Item[] itemArray9 = new ds.Item[] {};
        fPHeapMin7.copia(itemArray9);
        fPHeapMin5.copia(itemArray9);
        fPHeapMin5.constroi();
        ds.FPHeapMin fPHeapMin14 = new ds.FPHeapMin((int) (short) -1);
        ds.FPHeapMin fPHeapMin16 = new ds.FPHeapMin(0);
        fPHeapMin16.imprime();
        ds.Item[] itemArray18 = new ds.Item[] {};
        fPHeapMin16.copia(itemArray18);
        ds.FPHeapMin fPHeapMin20 = new ds.FPHeapMin(itemArray18);
        fPHeapMin20.constroi();
        ds.Item[] itemArray22 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin23 = new ds.FPHeapMin(itemArray22);
        fPHeapMin20.copia(itemArray22);
        fPHeapMin14.copia(itemArray22);
        ds.FPHeapMin fPHeapMin27 = new ds.FPHeapMin((int) (short) -1);
        ds.FPHeapMin fPHeapMin29 = new ds.FPHeapMin(0);
        fPHeapMin29.imprime();
        ds.Item[] itemArray31 = new ds.Item[] {};
        fPHeapMin29.copia(itemArray31);
        ds.FPHeapMin fPHeapMin33 = new ds.FPHeapMin(itemArray31);
        fPHeapMin33.constroi();
        ds.Item[] itemArray35 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin36 = new ds.FPHeapMin(itemArray35);
        fPHeapMin33.copia(itemArray35);
        fPHeapMin27.copia(itemArray35);
        fPHeapMin14.copia(itemArray35);
        ds.FPHeapMin fPHeapMin40 = new ds.FPHeapMin(itemArray35);
        fPHeapMin5.copia(itemArray35);
        ds.Item item42 = null;
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMin5.insere(item42);
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: heap cheio");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertNotNull(itemArray9);
        org.junit.Assert.assertNotNull(itemArray18);
        org.junit.Assert.assertNotNull(itemArray22);
        org.junit.Assert.assertNotNull(itemArray31);
        org.junit.Assert.assertNotNull(itemArray35);
    }

    @Test
    public void test142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test142");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin((int) '4');
        ds.Item item2 = fPHeapMin1.min();
        ds.FPHeapMin fPHeapMin4 = new ds.FPHeapMin((int) (short) -1);
        ds.FPHeapMin fPHeapMin6 = new ds.FPHeapMin(0);
        fPHeapMin6.imprime();
        ds.Item[] itemArray8 = new ds.Item[] {};
        fPHeapMin6.copia(itemArray8);
        ds.FPHeapMin fPHeapMin10 = new ds.FPHeapMin(itemArray8);
        fPHeapMin10.constroi();
        ds.Item[] itemArray12 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin13 = new ds.FPHeapMin(itemArray12);
        fPHeapMin10.copia(itemArray12);
        fPHeapMin4.copia(itemArray12);
        ds.FPHeapMin fPHeapMin17 = new ds.FPHeapMin((int) (short) -1);
        ds.FPHeapMin fPHeapMin19 = new ds.FPHeapMin(0);
        fPHeapMin19.imprime();
        ds.Item[] itemArray21 = new ds.Item[] {};
        fPHeapMin19.copia(itemArray21);
        ds.FPHeapMin fPHeapMin23 = new ds.FPHeapMin(itemArray21);
        fPHeapMin23.constroi();
        ds.Item[] itemArray25 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin26 = new ds.FPHeapMin(itemArray25);
        fPHeapMin23.copia(itemArray25);
        fPHeapMin17.copia(itemArray25);
        fPHeapMin4.copia(itemArray25);
        fPHeapMin1.copia(itemArray25);
        ds.FPHeapMin fPHeapMin31 = new ds.FPHeapMin(itemArray25);
        ds.FPHeapMin fPHeapMin32 = new ds.FPHeapMin(itemArray25);
        org.junit.Assert.assertNull(item2);
        org.junit.Assert.assertNotNull(itemArray8);
        org.junit.Assert.assertNotNull(itemArray12);
        org.junit.Assert.assertNotNull(itemArray21);
        org.junit.Assert.assertNotNull(itemArray25);
    }

    @Test
    public void test143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test143");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin((int) (short) -1);
        fPHeapMin1.constroi();
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMin1.refaz((-1), (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test144");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin((int) (short) -1);
        ds.FPHeapMin fPHeapMin3 = new ds.FPHeapMin(0);
        fPHeapMin3.imprime();
        ds.Item[] itemArray5 = new ds.Item[] {};
        fPHeapMin3.copia(itemArray5);
        ds.FPHeapMin fPHeapMin7 = new ds.FPHeapMin(itemArray5);
        fPHeapMin7.constroi();
        ds.Item[] itemArray9 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin10 = new ds.FPHeapMin(itemArray9);
        fPHeapMin7.copia(itemArray9);
        fPHeapMin1.copia(itemArray9);
        ds.FPHeapMin fPHeapMin14 = new ds.FPHeapMin((int) (short) -1);
        ds.FPHeapMin fPHeapMin16 = new ds.FPHeapMin(0);
        fPHeapMin16.imprime();
        ds.Item[] itemArray18 = new ds.Item[] {};
        fPHeapMin16.copia(itemArray18);
        ds.FPHeapMin fPHeapMin20 = new ds.FPHeapMin(itemArray18);
        fPHeapMin20.constroi();
        ds.Item[] itemArray22 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin23 = new ds.FPHeapMin(itemArray22);
        fPHeapMin20.copia(itemArray22);
        fPHeapMin14.copia(itemArray22);
        fPHeapMin1.copia(itemArray22);
        ds.FPHeapMin fPHeapMin27 = new ds.FPHeapMin(itemArray22);
        ds.FPHeapMin fPHeapMin28 = new ds.FPHeapMin(itemArray22);
        fPHeapMin28.imprime();
        java.lang.Class<?> wildcardClass30 = fPHeapMin28.getClass();
        org.junit.Assert.assertNotNull(itemArray5);
        org.junit.Assert.assertNotNull(itemArray9);
        org.junit.Assert.assertNotNull(itemArray18);
        org.junit.Assert.assertNotNull(itemArray22);
        org.junit.Assert.assertNotNull(wildcardClass30);
    }

    @Test
    public void test145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test145");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin((int) (short) 1);
        fPHeapMin1.constroi();
        fPHeapMin1.constroi();
        ds.FPHeapMin fPHeapMin5 = new ds.FPHeapMin((int) (short) -1);
        ds.FPHeapMin fPHeapMin7 = new ds.FPHeapMin(0);
        fPHeapMin7.imprime();
        ds.Item[] itemArray9 = new ds.Item[] {};
        fPHeapMin7.copia(itemArray9);
        ds.FPHeapMin fPHeapMin11 = new ds.FPHeapMin(itemArray9);
        fPHeapMin11.constroi();
        ds.Item[] itemArray13 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin14 = new ds.FPHeapMin(itemArray13);
        fPHeapMin11.copia(itemArray13);
        fPHeapMin5.copia(itemArray13);
        ds.FPHeapMin fPHeapMin18 = new ds.FPHeapMin((int) (short) -1);
        ds.FPHeapMin fPHeapMin20 = new ds.FPHeapMin(0);
        fPHeapMin20.imprime();
        ds.Item[] itemArray22 = new ds.Item[] {};
        fPHeapMin20.copia(itemArray22);
        ds.FPHeapMin fPHeapMin24 = new ds.FPHeapMin(itemArray22);
        fPHeapMin24.constroi();
        ds.Item[] itemArray26 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin27 = new ds.FPHeapMin(itemArray26);
        fPHeapMin24.copia(itemArray26);
        fPHeapMin18.copia(itemArray26);
        fPHeapMin5.copia(itemArray26);
        ds.FPHeapMin fPHeapMin32 = new ds.FPHeapMin((int) (byte) 100);
        ds.FPHeapMin fPHeapMin34 = new ds.FPHeapMin(0);
        fPHeapMin34.imprime();
        ds.Item[] itemArray36 = new ds.Item[] {};
        fPHeapMin34.copia(itemArray36);
        ds.FPHeapMin fPHeapMin38 = new ds.FPHeapMin(itemArray36);
        ds.FPHeapMin fPHeapMin40 = new ds.FPHeapMin(0);
        fPHeapMin40.imprime();
        ds.Item[] itemArray42 = new ds.Item[] {};
        fPHeapMin40.copia(itemArray42);
        fPHeapMin38.copia(itemArray42);
        fPHeapMin32.copia(itemArray42);
        fPHeapMin5.copia(itemArray42);
        fPHeapMin1.copia(itemArray42);
        ds.Item item48 = fPHeapMin1.min();
        ds.FPHeapMin fPHeapMin51 = new ds.FPHeapMin(0);
        fPHeapMin51.imprime();
        ds.Item[] itemArray53 = new ds.Item[] {};
        fPHeapMin51.copia(itemArray53);
        ds.FPHeapMin fPHeapMin55 = new ds.FPHeapMin(itemArray53);
        fPHeapMin55.constroi();
        ds.Item[] itemArray57 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin58 = new ds.FPHeapMin(itemArray57);
        fPHeapMin55.copia(itemArray57);
        ds.FPHeapMin fPHeapMin61 = new ds.FPHeapMin((int) (short) -1);
        ds.FPHeapMin fPHeapMin63 = new ds.FPHeapMin(0);
        fPHeapMin63.imprime();
        ds.Item[] itemArray65 = new ds.Item[] {};
        fPHeapMin63.copia(itemArray65);
        ds.FPHeapMin fPHeapMin67 = new ds.FPHeapMin(itemArray65);
        fPHeapMin67.constroi();
        ds.Item[] itemArray69 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin70 = new ds.FPHeapMin(itemArray69);
        fPHeapMin67.copia(itemArray69);
        fPHeapMin61.copia(itemArray69);
        ds.FPHeapMin fPHeapMin74 = new ds.FPHeapMin((int) (short) -1);
        ds.FPHeapMin fPHeapMin76 = new ds.FPHeapMin(0);
        fPHeapMin76.imprime();
        ds.Item[] itemArray78 = new ds.Item[] {};
        fPHeapMin76.copia(itemArray78);
        ds.FPHeapMin fPHeapMin80 = new ds.FPHeapMin(itemArray78);
        fPHeapMin80.constroi();
        ds.Item[] itemArray82 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin83 = new ds.FPHeapMin(itemArray82);
        fPHeapMin80.copia(itemArray82);
        fPHeapMin74.copia(itemArray82);
        fPHeapMin61.copia(itemArray82);
        fPHeapMin55.copia(itemArray82);
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMin1.diminuiChave((int) '#', (java.lang.Object) fPHeapMin55);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 35");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray9);
        org.junit.Assert.assertNotNull(itemArray13);
        org.junit.Assert.assertNotNull(itemArray22);
        org.junit.Assert.assertNotNull(itemArray26);
        org.junit.Assert.assertNotNull(itemArray36);
        org.junit.Assert.assertNotNull(itemArray42);
        org.junit.Assert.assertNull(item48);
        org.junit.Assert.assertNotNull(itemArray53);
        org.junit.Assert.assertNotNull(itemArray57);
        org.junit.Assert.assertNotNull(itemArray65);
        org.junit.Assert.assertNotNull(itemArray69);
        org.junit.Assert.assertNotNull(itemArray78);
        org.junit.Assert.assertNotNull(itemArray82);
    }

    @Test
    public void test146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test146");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin(0);
        fPHeapMin1.imprime();
        ds.Item[] itemArray3 = new ds.Item[] {};
        fPHeapMin1.copia(itemArray3);
        ds.FPHeapMin fPHeapMin5 = new ds.FPHeapMin(itemArray3);
        fPHeapMin5.constroi();
        ds.Item[] itemArray7 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin8 = new ds.FPHeapMin(itemArray7);
        fPHeapMin5.copia(itemArray7);
        ds.FPHeapMin fPHeapMin10 = new ds.FPHeapMin(itemArray7);
        ds.FPHeapMin fPHeapMin11 = new ds.FPHeapMin(itemArray7);
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertNotNull(itemArray7);
    }

    @Test
    public void test147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test147");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin(0);
        fPHeapMin1.imprime();
        ds.Item[] itemArray3 = new ds.Item[] {};
        fPHeapMin1.copia(itemArray3);
        ds.FPHeapMin fPHeapMin5 = new ds.FPHeapMin(itemArray3);
        ds.FPHeapMin fPHeapMin7 = new ds.FPHeapMin((int) (short) -1);
        ds.FPHeapMin fPHeapMin9 = new ds.FPHeapMin(0);
        fPHeapMin9.imprime();
        ds.Item[] itemArray11 = new ds.Item[] {};
        fPHeapMin9.copia(itemArray11);
        ds.FPHeapMin fPHeapMin13 = new ds.FPHeapMin(itemArray11);
        fPHeapMin13.constroi();
        ds.Item[] itemArray15 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin16 = new ds.FPHeapMin(itemArray15);
        fPHeapMin13.copia(itemArray15);
        fPHeapMin7.copia(itemArray15);
        ds.FPHeapMin fPHeapMin20 = new ds.FPHeapMin((int) (short) -1);
        ds.FPHeapMin fPHeapMin22 = new ds.FPHeapMin(0);
        fPHeapMin22.imprime();
        ds.Item[] itemArray24 = new ds.Item[] {};
        fPHeapMin22.copia(itemArray24);
        ds.FPHeapMin fPHeapMin26 = new ds.FPHeapMin(itemArray24);
        fPHeapMin26.constroi();
        ds.Item[] itemArray28 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin29 = new ds.FPHeapMin(itemArray28);
        fPHeapMin26.copia(itemArray28);
        fPHeapMin20.copia(itemArray28);
        fPHeapMin7.copia(itemArray28);
        fPHeapMin5.copia(itemArray28);
        ds.FPHeapMin fPHeapMin36 = new ds.FPHeapMin((int) (short) -1);
        fPHeapMin36.imprime();
        fPHeapMin36.imprime();
        fPHeapMin36.imprime();
        fPHeapMin36.constroi();
        java.lang.Class<?> wildcardClass41 = fPHeapMin36.getClass();
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMin5.diminuiChave((int) '4', (java.lang.Object) fPHeapMin36);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 52");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertNotNull(itemArray11);
        org.junit.Assert.assertNotNull(itemArray15);
        org.junit.Assert.assertNotNull(itemArray24);
        org.junit.Assert.assertNotNull(itemArray28);
        org.junit.Assert.assertNotNull(wildcardClass41);
    }

    @Test
    public void test148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test148");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin(0);
        fPHeapMin1.imprime();
        ds.Item[] itemArray3 = new ds.Item[] {};
        fPHeapMin1.copia(itemArray3);
        ds.FPHeapMin fPHeapMin5 = new ds.FPHeapMin(itemArray3);
        ds.FPHeapMin fPHeapMin7 = new ds.FPHeapMin(0);
        fPHeapMin7.imprime();
        ds.Item[] itemArray9 = new ds.Item[] {};
        fPHeapMin7.copia(itemArray9);
        fPHeapMin5.copia(itemArray9);
        ds.FPHeapMin fPHeapMin12 = new ds.FPHeapMin(itemArray9);
        ds.FPHeapMin fPHeapMin13 = new ds.FPHeapMin(itemArray9);
        fPHeapMin13.imprime();
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertNotNull(itemArray9);
    }

    @Test
    public void test149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test149");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin((int) (short) 100);
        ds.Item item2 = fPHeapMin1.min();
        ds.Item[] itemArray3 = new ds.Item[] {};
        fPHeapMin1.copia(itemArray3);
        fPHeapMin1.imprime();
        ds.FPHeapMin fPHeapMin7 = new ds.FPHeapMin((int) '4');
        ds.Item item8 = fPHeapMin7.min();
        ds.FPHeapMin fPHeapMin10 = new ds.FPHeapMin((int) (short) -1);
        ds.FPHeapMin fPHeapMin12 = new ds.FPHeapMin(0);
        fPHeapMin12.imprime();
        ds.Item[] itemArray14 = new ds.Item[] {};
        fPHeapMin12.copia(itemArray14);
        ds.FPHeapMin fPHeapMin16 = new ds.FPHeapMin(itemArray14);
        fPHeapMin16.constroi();
        ds.Item[] itemArray18 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin19 = new ds.FPHeapMin(itemArray18);
        fPHeapMin16.copia(itemArray18);
        fPHeapMin10.copia(itemArray18);
        ds.FPHeapMin fPHeapMin23 = new ds.FPHeapMin((int) (short) -1);
        ds.FPHeapMin fPHeapMin25 = new ds.FPHeapMin(0);
        fPHeapMin25.imprime();
        ds.Item[] itemArray27 = new ds.Item[] {};
        fPHeapMin25.copia(itemArray27);
        ds.FPHeapMin fPHeapMin29 = new ds.FPHeapMin(itemArray27);
        fPHeapMin29.constroi();
        ds.Item[] itemArray31 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin32 = new ds.FPHeapMin(itemArray31);
        fPHeapMin29.copia(itemArray31);
        fPHeapMin23.copia(itemArray31);
        fPHeapMin10.copia(itemArray31);
        fPHeapMin7.copia(itemArray31);
        fPHeapMin1.copia(itemArray31);
        org.junit.Assert.assertNull(item2);
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertNull(item8);
        org.junit.Assert.assertNotNull(itemArray14);
        org.junit.Assert.assertNotNull(itemArray18);
        org.junit.Assert.assertNotNull(itemArray27);
        org.junit.Assert.assertNotNull(itemArray31);
    }

    @Test
    public void test150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test150");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin((int) '4');
        ds.Item item2 = fPHeapMin1.min();
        ds.Item[] itemArray3 = new ds.Item[] {};
        fPHeapMin1.copia(itemArray3);
        fPHeapMin1.constroi();
        org.junit.Assert.assertNull(item2);
        org.junit.Assert.assertNotNull(itemArray3);
    }

    @Test
    public void test151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test151");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin((int) (short) -1);
        fPHeapMin1.imprime();
        fPHeapMin1.imprime();
        fPHeapMin1.constroi();
    }

    @Test
    public void test152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test152");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin((int) '4');
        ds.Item item2 = fPHeapMin1.min();
        ds.Item[] itemArray3 = new ds.Item[] {};
        fPHeapMin1.copia(itemArray3);
        fPHeapMin1.imprime();
        ds.Item item6 = fPHeapMin1.min();
        ds.Item item7 = null;
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMin1.insere(item7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(item2);
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertNull(item6);
    }

    @Test
    public void test153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test153");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin(0);
        fPHeapMin1.imprime();
        ds.Item[] itemArray3 = new ds.Item[] {};
        fPHeapMin1.copia(itemArray3);
        ds.FPHeapMin fPHeapMin5 = new ds.FPHeapMin(itemArray3);
        ds.Item[] itemArray6 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin7 = new ds.FPHeapMin(itemArray6);
        fPHeapMin7.imprime();
        ds.FPHeapMin fPHeapMin10 = new ds.FPHeapMin((int) '4');
        ds.Item item11 = fPHeapMin10.min();
        ds.FPHeapMin fPHeapMin13 = new ds.FPHeapMin((int) (short) -1);
        ds.FPHeapMin fPHeapMin15 = new ds.FPHeapMin(0);
        fPHeapMin15.imprime();
        ds.Item[] itemArray17 = new ds.Item[] {};
        fPHeapMin15.copia(itemArray17);
        ds.FPHeapMin fPHeapMin19 = new ds.FPHeapMin(itemArray17);
        fPHeapMin19.constroi();
        ds.Item[] itemArray21 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin22 = new ds.FPHeapMin(itemArray21);
        fPHeapMin19.copia(itemArray21);
        fPHeapMin13.copia(itemArray21);
        ds.FPHeapMin fPHeapMin26 = new ds.FPHeapMin((int) (short) -1);
        ds.FPHeapMin fPHeapMin28 = new ds.FPHeapMin(0);
        fPHeapMin28.imprime();
        ds.Item[] itemArray30 = new ds.Item[] {};
        fPHeapMin28.copia(itemArray30);
        ds.FPHeapMin fPHeapMin32 = new ds.FPHeapMin(itemArray30);
        fPHeapMin32.constroi();
        ds.Item[] itemArray34 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin35 = new ds.FPHeapMin(itemArray34);
        fPHeapMin32.copia(itemArray34);
        fPHeapMin26.copia(itemArray34);
        fPHeapMin13.copia(itemArray34);
        fPHeapMin10.copia(itemArray34);
        fPHeapMin7.copia(itemArray34);
        fPHeapMin5.copia(itemArray34);
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertNotNull(itemArray6);
        org.junit.Assert.assertNull(item11);
        org.junit.Assert.assertNotNull(itemArray17);
        org.junit.Assert.assertNotNull(itemArray21);
        org.junit.Assert.assertNotNull(itemArray30);
        org.junit.Assert.assertNotNull(itemArray34);
    }

    @Test
    public void test154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test154");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin((int) (short) -1);
        fPHeapMin1.imprime();
        ds.FPHeapMin fPHeapMin5 = new ds.FPHeapMin((int) '4');
        ds.Item item6 = fPHeapMin5.min();
        ds.Item[] itemArray7 = new ds.Item[] {};
        fPHeapMin5.copia(itemArray7);
        fPHeapMin5.imprime();
        ds.Item item10 = fPHeapMin5.min();
        fPHeapMin5.refaz((int) '4', (int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMin1.diminuiChave(0, (java.lang.Object) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 0");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(item6);
        org.junit.Assert.assertNotNull(itemArray7);
        org.junit.Assert.assertNull(item10);
    }

    @Test
    public void test155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test155");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin(0);
        fPHeapMin1.imprime();
        ds.Item[] itemArray3 = new ds.Item[] {};
        fPHeapMin1.copia(itemArray3);
        ds.FPHeapMin fPHeapMin5 = new ds.FPHeapMin(itemArray3);
        fPHeapMin5.constroi();
        ds.Item[] itemArray7 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin8 = new ds.FPHeapMin(itemArray7);
        fPHeapMin5.copia(itemArray7);
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMin5.diminuiChave((int) (short) -1, (java.lang.Object) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertNotNull(itemArray7);
    }

    @Test
    public void test156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test156");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin(0);
        fPHeapMin1.imprime();
        ds.Item[] itemArray3 = new ds.Item[] {};
        fPHeapMin1.copia(itemArray3);
        ds.FPHeapMin fPHeapMin5 = new ds.FPHeapMin(itemArray3);
        ds.FPHeapMin fPHeapMin7 = new ds.FPHeapMin((int) (short) -1);
        ds.FPHeapMin fPHeapMin9 = new ds.FPHeapMin(0);
        fPHeapMin9.imprime();
        ds.Item[] itemArray11 = new ds.Item[] {};
        fPHeapMin9.copia(itemArray11);
        ds.FPHeapMin fPHeapMin13 = new ds.FPHeapMin(itemArray11);
        fPHeapMin13.constroi();
        ds.Item[] itemArray15 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin16 = new ds.FPHeapMin(itemArray15);
        fPHeapMin13.copia(itemArray15);
        fPHeapMin7.copia(itemArray15);
        ds.FPHeapMin fPHeapMin20 = new ds.FPHeapMin((int) (short) -1);
        ds.FPHeapMin fPHeapMin22 = new ds.FPHeapMin(0);
        fPHeapMin22.imprime();
        ds.Item[] itemArray24 = new ds.Item[] {};
        fPHeapMin22.copia(itemArray24);
        ds.FPHeapMin fPHeapMin26 = new ds.FPHeapMin(itemArray24);
        fPHeapMin26.constroi();
        ds.Item[] itemArray28 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin29 = new ds.FPHeapMin(itemArray28);
        fPHeapMin26.copia(itemArray28);
        fPHeapMin20.copia(itemArray28);
        fPHeapMin7.copia(itemArray28);
        fPHeapMin5.copia(itemArray28);
        fPHeapMin5.imprime();
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertNotNull(itemArray11);
        org.junit.Assert.assertNotNull(itemArray15);
        org.junit.Assert.assertNotNull(itemArray24);
        org.junit.Assert.assertNotNull(itemArray28);
    }

    @Test
    public void test157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test157");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin((int) (short) -1);
        ds.FPHeapMin fPHeapMin3 = new ds.FPHeapMin(0);
        fPHeapMin3.imprime();
        ds.Item[] itemArray5 = new ds.Item[] {};
        fPHeapMin3.copia(itemArray5);
        ds.FPHeapMin fPHeapMin7 = new ds.FPHeapMin(itemArray5);
        fPHeapMin7.constroi();
        ds.Item[] itemArray9 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin10 = new ds.FPHeapMin(itemArray9);
        fPHeapMin7.copia(itemArray9);
        fPHeapMin1.copia(itemArray9);
        ds.Item[] itemArray13 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin14 = new ds.FPHeapMin(itemArray13);
        fPHeapMin1.copia(itemArray13);
        ds.FPHeapMin fPHeapMin17 = new ds.FPHeapMin((int) (byte) 100);
        ds.FPHeapMin fPHeapMin19 = new ds.FPHeapMin(0);
        fPHeapMin19.imprime();
        ds.Item[] itemArray21 = new ds.Item[] {};
        fPHeapMin19.copia(itemArray21);
        ds.FPHeapMin fPHeapMin23 = new ds.FPHeapMin(itemArray21);
        ds.FPHeapMin fPHeapMin25 = new ds.FPHeapMin(0);
        fPHeapMin25.imprime();
        ds.Item[] itemArray27 = new ds.Item[] {};
        fPHeapMin25.copia(itemArray27);
        fPHeapMin23.copia(itemArray27);
        fPHeapMin17.copia(itemArray27);
        fPHeapMin1.copia(itemArray27);
        java.lang.Class<?> wildcardClass32 = fPHeapMin1.getClass();
        org.junit.Assert.assertNotNull(itemArray5);
        org.junit.Assert.assertNotNull(itemArray9);
        org.junit.Assert.assertNotNull(itemArray13);
        org.junit.Assert.assertNotNull(itemArray21);
        org.junit.Assert.assertNotNull(itemArray27);
        org.junit.Assert.assertNotNull(wildcardClass32);
    }

    @Test
    public void test158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test158");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin((int) (byte) 100);
        fPHeapMin1.imprime();
        ds.Item item3 = fPHeapMin1.min();
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMin1.refaz((int) (byte) -1, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(item3);
    }

    @Test
    public void test159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test159");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin(0);
        fPHeapMin1.imprime();
        ds.Item[] itemArray3 = new ds.Item[] {};
        fPHeapMin1.copia(itemArray3);
        ds.FPHeapMin fPHeapMin5 = new ds.FPHeapMin(itemArray3);
        fPHeapMin5.constroi();
        ds.Item[] itemArray7 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin8 = new ds.FPHeapMin(itemArray7);
        fPHeapMin5.copia(itemArray7);
        ds.FPHeapMin fPHeapMin11 = new ds.FPHeapMin((int) (short) -1);
        ds.FPHeapMin fPHeapMin13 = new ds.FPHeapMin(0);
        fPHeapMin13.imprime();
        ds.Item[] itemArray15 = new ds.Item[] {};
        fPHeapMin13.copia(itemArray15);
        ds.FPHeapMin fPHeapMin17 = new ds.FPHeapMin(itemArray15);
        fPHeapMin17.constroi();
        ds.Item[] itemArray19 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin20 = new ds.FPHeapMin(itemArray19);
        fPHeapMin17.copia(itemArray19);
        fPHeapMin11.copia(itemArray19);
        ds.FPHeapMin fPHeapMin23 = new ds.FPHeapMin(itemArray19);
        fPHeapMin5.copia(itemArray19);
        ds.FPHeapMin fPHeapMin26 = new ds.FPHeapMin(0);
        fPHeapMin26.imprime();
        ds.Item[] itemArray28 = new ds.Item[] {};
        fPHeapMin26.copia(itemArray28);
        ds.FPHeapMin fPHeapMin30 = new ds.FPHeapMin(itemArray28);
        ds.FPHeapMin fPHeapMin32 = new ds.FPHeapMin((int) (short) -1);
        ds.FPHeapMin fPHeapMin34 = new ds.FPHeapMin(0);
        fPHeapMin34.imprime();
        ds.Item[] itemArray36 = new ds.Item[] {};
        fPHeapMin34.copia(itemArray36);
        ds.FPHeapMin fPHeapMin38 = new ds.FPHeapMin(itemArray36);
        fPHeapMin38.constroi();
        ds.Item[] itemArray40 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin41 = new ds.FPHeapMin(itemArray40);
        fPHeapMin38.copia(itemArray40);
        fPHeapMin32.copia(itemArray40);
        ds.FPHeapMin fPHeapMin45 = new ds.FPHeapMin((int) (short) -1);
        ds.FPHeapMin fPHeapMin47 = new ds.FPHeapMin(0);
        fPHeapMin47.imprime();
        ds.Item[] itemArray49 = new ds.Item[] {};
        fPHeapMin47.copia(itemArray49);
        ds.FPHeapMin fPHeapMin51 = new ds.FPHeapMin(itemArray49);
        fPHeapMin51.constroi();
        ds.Item[] itemArray53 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin54 = new ds.FPHeapMin(itemArray53);
        fPHeapMin51.copia(itemArray53);
        fPHeapMin45.copia(itemArray53);
        fPHeapMin32.copia(itemArray53);
        fPHeapMin30.copia(itemArray53);
        fPHeapMin5.copia(itemArray53);
        ds.FPHeapMin fPHeapMin62 = new ds.FPHeapMin(0);
        fPHeapMin62.imprime();
        ds.Item[] itemArray64 = new ds.Item[] {};
        fPHeapMin62.copia(itemArray64);
        ds.FPHeapMin fPHeapMin66 = new ds.FPHeapMin(itemArray64);
        fPHeapMin66.constroi();
        ds.Item[] itemArray68 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin69 = new ds.FPHeapMin(itemArray68);
        fPHeapMin66.copia(itemArray68);
        ds.FPHeapMin fPHeapMin72 = new ds.FPHeapMin((int) (short) -1);
        ds.FPHeapMin fPHeapMin74 = new ds.FPHeapMin(0);
        fPHeapMin74.imprime();
        ds.Item[] itemArray76 = new ds.Item[] {};
        fPHeapMin74.copia(itemArray76);
        ds.FPHeapMin fPHeapMin78 = new ds.FPHeapMin(itemArray76);
        fPHeapMin78.constroi();
        ds.Item[] itemArray80 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin81 = new ds.FPHeapMin(itemArray80);
        fPHeapMin78.copia(itemArray80);
        fPHeapMin72.copia(itemArray80);
        ds.FPHeapMin fPHeapMin85 = new ds.FPHeapMin((int) (short) -1);
        ds.FPHeapMin fPHeapMin87 = new ds.FPHeapMin(0);
        fPHeapMin87.imprime();
        ds.Item[] itemArray89 = new ds.Item[] {};
        fPHeapMin87.copia(itemArray89);
        ds.FPHeapMin fPHeapMin91 = new ds.FPHeapMin(itemArray89);
        fPHeapMin91.constroi();
        ds.Item[] itemArray93 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin94 = new ds.FPHeapMin(itemArray93);
        fPHeapMin91.copia(itemArray93);
        fPHeapMin85.copia(itemArray93);
        fPHeapMin72.copia(itemArray93);
        fPHeapMin66.copia(itemArray93);
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMin5.diminuiChave(0, (java.lang.Object) itemArray93);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 0");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertNotNull(itemArray7);
        org.junit.Assert.assertNotNull(itemArray15);
        org.junit.Assert.assertNotNull(itemArray19);
        org.junit.Assert.assertNotNull(itemArray28);
        org.junit.Assert.assertNotNull(itemArray36);
        org.junit.Assert.assertNotNull(itemArray40);
        org.junit.Assert.assertNotNull(itemArray49);
        org.junit.Assert.assertNotNull(itemArray53);
        org.junit.Assert.assertNotNull(itemArray64);
        org.junit.Assert.assertNotNull(itemArray68);
        org.junit.Assert.assertNotNull(itemArray76);
        org.junit.Assert.assertNotNull(itemArray80);
        org.junit.Assert.assertNotNull(itemArray89);
        org.junit.Assert.assertNotNull(itemArray93);
    }

    @Test
    public void test160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test160");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin((int) (short) -1);
        ds.FPHeapMin fPHeapMin3 = new ds.FPHeapMin(0);
        fPHeapMin3.imprime();
        ds.Item[] itemArray5 = new ds.Item[] {};
        fPHeapMin3.copia(itemArray5);
        ds.FPHeapMin fPHeapMin7 = new ds.FPHeapMin(itemArray5);
        fPHeapMin7.constroi();
        ds.Item[] itemArray9 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin10 = new ds.FPHeapMin(itemArray9);
        fPHeapMin7.copia(itemArray9);
        fPHeapMin1.copia(itemArray9);
        ds.FPHeapMin fPHeapMin14 = new ds.FPHeapMin((int) (short) -1);
        ds.FPHeapMin fPHeapMin16 = new ds.FPHeapMin(0);
        fPHeapMin16.imprime();
        ds.Item[] itemArray18 = new ds.Item[] {};
        fPHeapMin16.copia(itemArray18);
        ds.FPHeapMin fPHeapMin20 = new ds.FPHeapMin(itemArray18);
        fPHeapMin20.constroi();
        ds.Item[] itemArray22 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin23 = new ds.FPHeapMin(itemArray22);
        fPHeapMin20.copia(itemArray22);
        fPHeapMin14.copia(itemArray22);
        fPHeapMin1.copia(itemArray22);
        ds.FPHeapMin fPHeapMin27 = new ds.FPHeapMin(itemArray22);
        ds.FPHeapMin fPHeapMin28 = new ds.FPHeapMin(itemArray22);
        fPHeapMin28.imprime();
        ds.FPHeapMin fPHeapMin31 = new ds.FPHeapMin((int) (short) 1);
        fPHeapMin31.constroi();
        fPHeapMin31.constroi();
        ds.FPHeapMin fPHeapMin35 = new ds.FPHeapMin((int) (short) -1);
        ds.FPHeapMin fPHeapMin37 = new ds.FPHeapMin(0);
        fPHeapMin37.imprime();
        ds.Item[] itemArray39 = new ds.Item[] {};
        fPHeapMin37.copia(itemArray39);
        ds.FPHeapMin fPHeapMin41 = new ds.FPHeapMin(itemArray39);
        fPHeapMin41.constroi();
        ds.Item[] itemArray43 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin44 = new ds.FPHeapMin(itemArray43);
        fPHeapMin41.copia(itemArray43);
        fPHeapMin35.copia(itemArray43);
        ds.FPHeapMin fPHeapMin48 = new ds.FPHeapMin((int) (short) -1);
        ds.FPHeapMin fPHeapMin50 = new ds.FPHeapMin(0);
        fPHeapMin50.imprime();
        ds.Item[] itemArray52 = new ds.Item[] {};
        fPHeapMin50.copia(itemArray52);
        ds.FPHeapMin fPHeapMin54 = new ds.FPHeapMin(itemArray52);
        fPHeapMin54.constroi();
        ds.Item[] itemArray56 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin57 = new ds.FPHeapMin(itemArray56);
        fPHeapMin54.copia(itemArray56);
        fPHeapMin48.copia(itemArray56);
        fPHeapMin35.copia(itemArray56);
        ds.FPHeapMin fPHeapMin62 = new ds.FPHeapMin((int) (byte) 100);
        ds.FPHeapMin fPHeapMin64 = new ds.FPHeapMin(0);
        fPHeapMin64.imprime();
        ds.Item[] itemArray66 = new ds.Item[] {};
        fPHeapMin64.copia(itemArray66);
        ds.FPHeapMin fPHeapMin68 = new ds.FPHeapMin(itemArray66);
        ds.FPHeapMin fPHeapMin70 = new ds.FPHeapMin(0);
        fPHeapMin70.imprime();
        ds.Item[] itemArray72 = new ds.Item[] {};
        fPHeapMin70.copia(itemArray72);
        fPHeapMin68.copia(itemArray72);
        fPHeapMin62.copia(itemArray72);
        fPHeapMin35.copia(itemArray72);
        fPHeapMin31.copia(itemArray72);
        ds.FPHeapMin fPHeapMin78 = new ds.FPHeapMin(itemArray72);
        fPHeapMin28.copia(itemArray72);
        java.lang.Class<?> wildcardClass80 = itemArray72.getClass();
        org.junit.Assert.assertNotNull(itemArray5);
        org.junit.Assert.assertNotNull(itemArray9);
        org.junit.Assert.assertNotNull(itemArray18);
        org.junit.Assert.assertNotNull(itemArray22);
        org.junit.Assert.assertNotNull(itemArray39);
        org.junit.Assert.assertNotNull(itemArray43);
        org.junit.Assert.assertNotNull(itemArray52);
        org.junit.Assert.assertNotNull(itemArray56);
        org.junit.Assert.assertNotNull(itemArray66);
        org.junit.Assert.assertNotNull(itemArray72);
        org.junit.Assert.assertNotNull(wildcardClass80);
    }

    @Test
    public void test161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test161");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin((int) (short) -1);
        ds.FPHeapMin fPHeapMin3 = new ds.FPHeapMin(0);
        fPHeapMin3.imprime();
        ds.Item[] itemArray5 = new ds.Item[] {};
        fPHeapMin3.copia(itemArray5);
        ds.FPHeapMin fPHeapMin7 = new ds.FPHeapMin(itemArray5);
        fPHeapMin7.constroi();
        ds.Item[] itemArray9 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin10 = new ds.FPHeapMin(itemArray9);
        fPHeapMin7.copia(itemArray9);
        fPHeapMin1.copia(itemArray9);
        ds.Item[] itemArray13 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin14 = new ds.FPHeapMin(itemArray13);
        fPHeapMin1.copia(itemArray13);
        ds.FPHeapMin fPHeapMin17 = new ds.FPHeapMin(0);
        fPHeapMin17.imprime();
        ds.Item[] itemArray19 = new ds.Item[] {};
        fPHeapMin17.copia(itemArray19);
        ds.FPHeapMin fPHeapMin21 = new ds.FPHeapMin(itemArray19);
        ds.FPHeapMin fPHeapMin23 = new ds.FPHeapMin(0);
        fPHeapMin23.imprime();
        ds.Item[] itemArray25 = new ds.Item[] {};
        fPHeapMin23.copia(itemArray25);
        fPHeapMin21.copia(itemArray25);
        ds.FPHeapMin fPHeapMin28 = new ds.FPHeapMin(itemArray25);
        fPHeapMin1.copia(itemArray25);
        fPHeapMin1.constroi();
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMin1.refaz((-1), (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray5);
        org.junit.Assert.assertNotNull(itemArray9);
        org.junit.Assert.assertNotNull(itemArray13);
        org.junit.Assert.assertNotNull(itemArray19);
        org.junit.Assert.assertNotNull(itemArray25);
    }

    @Test
    public void test162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test162");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin((int) (byte) 1);
    }

    @Test
    public void test163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test163");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin(0);
        fPHeapMin1.imprime();
        ds.Item[] itemArray3 = new ds.Item[] {};
        fPHeapMin1.copia(itemArray3);
        ds.FPHeapMin fPHeapMin5 = new ds.FPHeapMin(itemArray3);
        ds.FPHeapMin fPHeapMin7 = new ds.FPHeapMin(0);
        fPHeapMin7.imprime();
        ds.Item[] itemArray9 = new ds.Item[] {};
        fPHeapMin7.copia(itemArray9);
        fPHeapMin5.copia(itemArray9);
        ds.FPHeapMin fPHeapMin12 = new ds.FPHeapMin(itemArray9);
        ds.FPHeapMin fPHeapMin14 = new ds.FPHeapMin(0);
        fPHeapMin14.imprime();
        ds.Item[] itemArray16 = new ds.Item[] {};
        fPHeapMin14.copia(itemArray16);
        ds.FPHeapMin fPHeapMin18 = new ds.FPHeapMin(itemArray16);
        fPHeapMin18.constroi();
        ds.Item[] itemArray20 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin21 = new ds.FPHeapMin(itemArray20);
        fPHeapMin18.copia(itemArray20);
        ds.FPHeapMin fPHeapMin24 = new ds.FPHeapMin((int) (short) -1);
        ds.FPHeapMin fPHeapMin26 = new ds.FPHeapMin(0);
        fPHeapMin26.imprime();
        ds.Item[] itemArray28 = new ds.Item[] {};
        fPHeapMin26.copia(itemArray28);
        ds.FPHeapMin fPHeapMin30 = new ds.FPHeapMin(itemArray28);
        fPHeapMin30.constroi();
        ds.Item[] itemArray32 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin33 = new ds.FPHeapMin(itemArray32);
        fPHeapMin30.copia(itemArray32);
        fPHeapMin24.copia(itemArray32);
        ds.FPHeapMin fPHeapMin37 = new ds.FPHeapMin((int) (short) -1);
        ds.FPHeapMin fPHeapMin39 = new ds.FPHeapMin(0);
        fPHeapMin39.imprime();
        ds.Item[] itemArray41 = new ds.Item[] {};
        fPHeapMin39.copia(itemArray41);
        ds.FPHeapMin fPHeapMin43 = new ds.FPHeapMin(itemArray41);
        fPHeapMin43.constroi();
        ds.Item[] itemArray45 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin46 = new ds.FPHeapMin(itemArray45);
        fPHeapMin43.copia(itemArray45);
        fPHeapMin37.copia(itemArray45);
        fPHeapMin24.copia(itemArray45);
        fPHeapMin18.copia(itemArray45);
        fPHeapMin12.copia(itemArray45);
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMin12.refaz((int) '#', (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 35");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertNotNull(itemArray9);
        org.junit.Assert.assertNotNull(itemArray16);
        org.junit.Assert.assertNotNull(itemArray20);
        org.junit.Assert.assertNotNull(itemArray28);
        org.junit.Assert.assertNotNull(itemArray32);
        org.junit.Assert.assertNotNull(itemArray41);
        org.junit.Assert.assertNotNull(itemArray45);
    }

    @Test
    public void test164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test164");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin(0);
        fPHeapMin1.imprime();
        ds.Item[] itemArray3 = new ds.Item[] {};
        fPHeapMin1.copia(itemArray3);
        ds.FPHeapMin fPHeapMin5 = new ds.FPHeapMin(itemArray3);
        ds.FPHeapMin fPHeapMin7 = new ds.FPHeapMin(0);
        fPHeapMin7.imprime();
        ds.Item[] itemArray9 = new ds.Item[] {};
        fPHeapMin7.copia(itemArray9);
        fPHeapMin5.copia(itemArray9);
        fPHeapMin5.constroi();
        ds.FPHeapMin fPHeapMin14 = new ds.FPHeapMin((int) (short) -1);
        ds.FPHeapMin fPHeapMin16 = new ds.FPHeapMin(0);
        fPHeapMin16.imprime();
        ds.Item[] itemArray18 = new ds.Item[] {};
        fPHeapMin16.copia(itemArray18);
        ds.FPHeapMin fPHeapMin20 = new ds.FPHeapMin(itemArray18);
        fPHeapMin20.constroi();
        ds.Item[] itemArray22 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin23 = new ds.FPHeapMin(itemArray22);
        fPHeapMin20.copia(itemArray22);
        fPHeapMin14.copia(itemArray22);
        ds.FPHeapMin fPHeapMin27 = new ds.FPHeapMin((int) (short) -1);
        ds.FPHeapMin fPHeapMin29 = new ds.FPHeapMin(0);
        fPHeapMin29.imprime();
        ds.Item[] itemArray31 = new ds.Item[] {};
        fPHeapMin29.copia(itemArray31);
        ds.FPHeapMin fPHeapMin33 = new ds.FPHeapMin(itemArray31);
        fPHeapMin33.constroi();
        ds.Item[] itemArray35 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin36 = new ds.FPHeapMin(itemArray35);
        fPHeapMin33.copia(itemArray35);
        fPHeapMin27.copia(itemArray35);
        fPHeapMin14.copia(itemArray35);
        ds.FPHeapMin fPHeapMin40 = new ds.FPHeapMin(itemArray35);
        fPHeapMin5.copia(itemArray35);
        fPHeapMin5.constroi();
        // The following exception was thrown during execution in test generation
        try {
            ds.Item item43 = fPHeapMin5.retiraMin();
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: heap vazio");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertNotNull(itemArray9);
        org.junit.Assert.assertNotNull(itemArray18);
        org.junit.Assert.assertNotNull(itemArray22);
        org.junit.Assert.assertNotNull(itemArray31);
        org.junit.Assert.assertNotNull(itemArray35);
    }

    @Test
    public void test165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test165");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin(1);
        fPHeapMin1.imprime();
        fPHeapMin1.constroi();
    }

    @Test
    public void test166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test166");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin((int) '4');
        ds.Item item2 = fPHeapMin1.min();
        ds.Item[] itemArray3 = new ds.Item[] {};
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
        org.junit.Assert.assertNull(item2);
        org.junit.Assert.assertNotNull(itemArray3);
    }

    @Test
    public void test167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test167");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin((int) (short) -1);
        ds.FPHeapMin fPHeapMin3 = new ds.FPHeapMin(0);
        fPHeapMin3.imprime();
        ds.Item[] itemArray5 = new ds.Item[] {};
        fPHeapMin3.copia(itemArray5);
        ds.FPHeapMin fPHeapMin7 = new ds.FPHeapMin(itemArray5);
        fPHeapMin7.constroi();
        ds.Item[] itemArray9 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin10 = new ds.FPHeapMin(itemArray9);
        fPHeapMin7.copia(itemArray9);
        fPHeapMin1.copia(itemArray9);
        ds.FPHeapMin fPHeapMin14 = new ds.FPHeapMin((int) (short) -1);
        ds.FPHeapMin fPHeapMin16 = new ds.FPHeapMin(0);
        fPHeapMin16.imprime();
        ds.Item[] itemArray18 = new ds.Item[] {};
        fPHeapMin16.copia(itemArray18);
        ds.FPHeapMin fPHeapMin20 = new ds.FPHeapMin(itemArray18);
        fPHeapMin20.constroi();
        ds.Item[] itemArray22 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin23 = new ds.FPHeapMin(itemArray22);
        fPHeapMin20.copia(itemArray22);
        fPHeapMin14.copia(itemArray22);
        fPHeapMin1.copia(itemArray22);
        ds.FPHeapMin fPHeapMin28 = new ds.FPHeapMin((int) '4');
        ds.Item item29 = fPHeapMin28.min();
        ds.FPHeapMin fPHeapMin31 = new ds.FPHeapMin((int) (short) -1);
        ds.FPHeapMin fPHeapMin33 = new ds.FPHeapMin(0);
        fPHeapMin33.imprime();
        ds.Item[] itemArray35 = new ds.Item[] {};
        fPHeapMin33.copia(itemArray35);
        ds.FPHeapMin fPHeapMin37 = new ds.FPHeapMin(itemArray35);
        fPHeapMin37.constroi();
        ds.Item[] itemArray39 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin40 = new ds.FPHeapMin(itemArray39);
        fPHeapMin37.copia(itemArray39);
        fPHeapMin31.copia(itemArray39);
        ds.FPHeapMin fPHeapMin44 = new ds.FPHeapMin((int) (short) -1);
        ds.FPHeapMin fPHeapMin46 = new ds.FPHeapMin(0);
        fPHeapMin46.imprime();
        ds.Item[] itemArray48 = new ds.Item[] {};
        fPHeapMin46.copia(itemArray48);
        ds.FPHeapMin fPHeapMin50 = new ds.FPHeapMin(itemArray48);
        fPHeapMin50.constroi();
        ds.Item[] itemArray52 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin53 = new ds.FPHeapMin(itemArray52);
        fPHeapMin50.copia(itemArray52);
        fPHeapMin44.copia(itemArray52);
        fPHeapMin31.copia(itemArray52);
        fPHeapMin28.copia(itemArray52);
        fPHeapMin1.copia(itemArray52);
        fPHeapMin1.constroi();
        org.junit.Assert.assertNotNull(itemArray5);
        org.junit.Assert.assertNotNull(itemArray9);
        org.junit.Assert.assertNotNull(itemArray18);
        org.junit.Assert.assertNotNull(itemArray22);
        org.junit.Assert.assertNull(item29);
        org.junit.Assert.assertNotNull(itemArray35);
        org.junit.Assert.assertNotNull(itemArray39);
        org.junit.Assert.assertNotNull(itemArray48);
        org.junit.Assert.assertNotNull(itemArray52);
    }

    @Test
    public void test168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test168");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin((int) (byte) 100);
        ds.FPHeapMin fPHeapMin3 = new ds.FPHeapMin(0);
        fPHeapMin3.imprime();
        ds.Item[] itemArray5 = new ds.Item[] {};
        fPHeapMin3.copia(itemArray5);
        ds.FPHeapMin fPHeapMin7 = new ds.FPHeapMin(itemArray5);
        ds.FPHeapMin fPHeapMin9 = new ds.FPHeapMin(0);
        fPHeapMin9.imprime();
        ds.Item[] itemArray11 = new ds.Item[] {};
        fPHeapMin9.copia(itemArray11);
        fPHeapMin7.copia(itemArray11);
        fPHeapMin1.copia(itemArray11);
        ds.Item item15 = null;
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMin1.insere(item15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray5);
        org.junit.Assert.assertNotNull(itemArray11);
    }

    @Test
    public void test169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test169");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin((int) (short) -1);
        ds.FPHeapMin fPHeapMin3 = new ds.FPHeapMin(0);
        fPHeapMin3.imprime();
        ds.Item[] itemArray5 = new ds.Item[] {};
        fPHeapMin3.copia(itemArray5);
        ds.FPHeapMin fPHeapMin7 = new ds.FPHeapMin(itemArray5);
        fPHeapMin7.constroi();
        ds.Item[] itemArray9 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin10 = new ds.FPHeapMin(itemArray9);
        fPHeapMin7.copia(itemArray9);
        fPHeapMin1.copia(itemArray9);
        ds.FPHeapMin fPHeapMin14 = new ds.FPHeapMin((int) (short) -1);
        ds.FPHeapMin fPHeapMin16 = new ds.FPHeapMin(0);
        fPHeapMin16.imprime();
        ds.Item[] itemArray18 = new ds.Item[] {};
        fPHeapMin16.copia(itemArray18);
        ds.FPHeapMin fPHeapMin20 = new ds.FPHeapMin(itemArray18);
        fPHeapMin20.constroi();
        ds.Item[] itemArray22 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin23 = new ds.FPHeapMin(itemArray22);
        fPHeapMin20.copia(itemArray22);
        fPHeapMin14.copia(itemArray22);
        fPHeapMin1.copia(itemArray22);
        ds.FPHeapMin fPHeapMin28 = new ds.FPHeapMin((int) (byte) 100);
        ds.FPHeapMin fPHeapMin30 = new ds.FPHeapMin(0);
        fPHeapMin30.imprime();
        ds.Item[] itemArray32 = new ds.Item[] {};
        fPHeapMin30.copia(itemArray32);
        ds.FPHeapMin fPHeapMin34 = new ds.FPHeapMin(itemArray32);
        ds.FPHeapMin fPHeapMin36 = new ds.FPHeapMin(0);
        fPHeapMin36.imprime();
        ds.Item[] itemArray38 = new ds.Item[] {};
        fPHeapMin36.copia(itemArray38);
        fPHeapMin34.copia(itemArray38);
        fPHeapMin28.copia(itemArray38);
        fPHeapMin1.copia(itemArray38);
        ds.FPHeapMin fPHeapMin44 = new ds.FPHeapMin(0);
        fPHeapMin44.imprime();
        ds.Item[] itemArray46 = new ds.Item[] {};
        fPHeapMin44.copia(itemArray46);
        ds.FPHeapMin fPHeapMin48 = new ds.FPHeapMin(itemArray46);
        fPHeapMin48.constroi();
        ds.Item[] itemArray50 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin51 = new ds.FPHeapMin(itemArray50);
        fPHeapMin48.copia(itemArray50);
        ds.FPHeapMin fPHeapMin54 = new ds.FPHeapMin((int) (short) -1);
        ds.FPHeapMin fPHeapMin56 = new ds.FPHeapMin(0);
        fPHeapMin56.imprime();
        ds.Item[] itemArray58 = new ds.Item[] {};
        fPHeapMin56.copia(itemArray58);
        ds.FPHeapMin fPHeapMin60 = new ds.FPHeapMin(itemArray58);
        fPHeapMin60.constroi();
        ds.Item[] itemArray62 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin63 = new ds.FPHeapMin(itemArray62);
        fPHeapMin60.copia(itemArray62);
        fPHeapMin54.copia(itemArray62);
        ds.FPHeapMin fPHeapMin66 = new ds.FPHeapMin(itemArray62);
        fPHeapMin48.copia(itemArray62);
        fPHeapMin1.copia(itemArray62);
        ds.FPHeapMin fPHeapMin71 = new ds.FPHeapMin((int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMin1.diminuiChave((int) '4', (java.lang.Object) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 52");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray5);
        org.junit.Assert.assertNotNull(itemArray9);
        org.junit.Assert.assertNotNull(itemArray18);
        org.junit.Assert.assertNotNull(itemArray22);
        org.junit.Assert.assertNotNull(itemArray32);
        org.junit.Assert.assertNotNull(itemArray38);
        org.junit.Assert.assertNotNull(itemArray46);
        org.junit.Assert.assertNotNull(itemArray50);
        org.junit.Assert.assertNotNull(itemArray58);
        org.junit.Assert.assertNotNull(itemArray62);
    }

    @Test
    public void test170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test170");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin(0);
        fPHeapMin1.imprime();
        ds.Item[] itemArray3 = new ds.Item[] {};
        fPHeapMin1.copia(itemArray3);
        ds.FPHeapMin fPHeapMin5 = new ds.FPHeapMin(itemArray3);
        fPHeapMin5.constroi();
        ds.Item[] itemArray7 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin8 = new ds.FPHeapMin(itemArray7);
        fPHeapMin5.copia(itemArray7);
        ds.FPHeapMin fPHeapMin11 = new ds.FPHeapMin((int) (short) -1);
        ds.FPHeapMin fPHeapMin13 = new ds.FPHeapMin(0);
        fPHeapMin13.imprime();
        ds.Item[] itemArray15 = new ds.Item[] {};
        fPHeapMin13.copia(itemArray15);
        ds.FPHeapMin fPHeapMin17 = new ds.FPHeapMin(itemArray15);
        fPHeapMin17.constroi();
        ds.Item[] itemArray19 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin20 = new ds.FPHeapMin(itemArray19);
        fPHeapMin17.copia(itemArray19);
        fPHeapMin11.copia(itemArray19);
        ds.FPHeapMin fPHeapMin24 = new ds.FPHeapMin((int) (short) -1);
        ds.FPHeapMin fPHeapMin26 = new ds.FPHeapMin(0);
        fPHeapMin26.imprime();
        ds.Item[] itemArray28 = new ds.Item[] {};
        fPHeapMin26.copia(itemArray28);
        ds.FPHeapMin fPHeapMin30 = new ds.FPHeapMin(itemArray28);
        fPHeapMin30.constroi();
        ds.Item[] itemArray32 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin33 = new ds.FPHeapMin(itemArray32);
        fPHeapMin30.copia(itemArray32);
        fPHeapMin24.copia(itemArray32);
        fPHeapMin11.copia(itemArray32);
        fPHeapMin5.copia(itemArray32);
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMin5.diminuiChave((int) (byte) 0, (java.lang.Object) (-1.0f));
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 0");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertNotNull(itemArray7);
        org.junit.Assert.assertNotNull(itemArray15);
        org.junit.Assert.assertNotNull(itemArray19);
        org.junit.Assert.assertNotNull(itemArray28);
        org.junit.Assert.assertNotNull(itemArray32);
    }

    @Test
    public void test171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test171");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin((int) (short) -1);
        ds.FPHeapMin fPHeapMin3 = new ds.FPHeapMin(0);
        fPHeapMin3.imprime();
        ds.Item[] itemArray5 = new ds.Item[] {};
        fPHeapMin3.copia(itemArray5);
        ds.FPHeapMin fPHeapMin7 = new ds.FPHeapMin(itemArray5);
        fPHeapMin7.constroi();
        ds.Item[] itemArray9 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin10 = new ds.FPHeapMin(itemArray9);
        fPHeapMin7.copia(itemArray9);
        fPHeapMin1.copia(itemArray9);
        ds.FPHeapMin fPHeapMin14 = new ds.FPHeapMin((int) (short) -1);
        ds.FPHeapMin fPHeapMin16 = new ds.FPHeapMin(0);
        fPHeapMin16.imprime();
        ds.Item[] itemArray18 = new ds.Item[] {};
        fPHeapMin16.copia(itemArray18);
        ds.FPHeapMin fPHeapMin20 = new ds.FPHeapMin(itemArray18);
        fPHeapMin20.constroi();
        ds.Item[] itemArray22 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin23 = new ds.FPHeapMin(itemArray22);
        fPHeapMin20.copia(itemArray22);
        fPHeapMin14.copia(itemArray22);
        fPHeapMin1.copia(itemArray22);
        ds.FPHeapMin fPHeapMin28 = new ds.FPHeapMin((int) '4');
        ds.Item item29 = fPHeapMin28.min();
        ds.FPHeapMin fPHeapMin31 = new ds.FPHeapMin((int) (short) -1);
        ds.FPHeapMin fPHeapMin33 = new ds.FPHeapMin(0);
        fPHeapMin33.imprime();
        ds.Item[] itemArray35 = new ds.Item[] {};
        fPHeapMin33.copia(itemArray35);
        ds.FPHeapMin fPHeapMin37 = new ds.FPHeapMin(itemArray35);
        fPHeapMin37.constroi();
        ds.Item[] itemArray39 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin40 = new ds.FPHeapMin(itemArray39);
        fPHeapMin37.copia(itemArray39);
        fPHeapMin31.copia(itemArray39);
        ds.FPHeapMin fPHeapMin44 = new ds.FPHeapMin((int) (short) -1);
        ds.FPHeapMin fPHeapMin46 = new ds.FPHeapMin(0);
        fPHeapMin46.imprime();
        ds.Item[] itemArray48 = new ds.Item[] {};
        fPHeapMin46.copia(itemArray48);
        ds.FPHeapMin fPHeapMin50 = new ds.FPHeapMin(itemArray48);
        fPHeapMin50.constroi();
        ds.Item[] itemArray52 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin53 = new ds.FPHeapMin(itemArray52);
        fPHeapMin50.copia(itemArray52);
        fPHeapMin44.copia(itemArray52);
        fPHeapMin31.copia(itemArray52);
        fPHeapMin28.copia(itemArray52);
        fPHeapMin1.copia(itemArray52);
        ds.FPHeapMin fPHeapMin59 = new ds.FPHeapMin(itemArray52);
        org.junit.Assert.assertNotNull(itemArray5);
        org.junit.Assert.assertNotNull(itemArray9);
        org.junit.Assert.assertNotNull(itemArray18);
        org.junit.Assert.assertNotNull(itemArray22);
        org.junit.Assert.assertNull(item29);
        org.junit.Assert.assertNotNull(itemArray35);
        org.junit.Assert.assertNotNull(itemArray39);
        org.junit.Assert.assertNotNull(itemArray48);
        org.junit.Assert.assertNotNull(itemArray52);
    }

    @Test
    public void test172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test172");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin(0);
        fPHeapMin1.imprime();
        fPHeapMin1.constroi();
        ds.Item item4 = null;
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMin1.insere(item4);
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: heap cheio");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
    }

    @Test
    public void test173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test173");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin((int) '4');
        ds.Item item2 = fPHeapMin1.min();
        ds.FPHeapMin fPHeapMin4 = new ds.FPHeapMin((int) (short) -1);
        ds.FPHeapMin fPHeapMin6 = new ds.FPHeapMin(0);
        fPHeapMin6.imprime();
        ds.Item[] itemArray8 = new ds.Item[] {};
        fPHeapMin6.copia(itemArray8);
        ds.FPHeapMin fPHeapMin10 = new ds.FPHeapMin(itemArray8);
        fPHeapMin10.constroi();
        ds.Item[] itemArray12 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin13 = new ds.FPHeapMin(itemArray12);
        fPHeapMin10.copia(itemArray12);
        fPHeapMin4.copia(itemArray12);
        ds.FPHeapMin fPHeapMin17 = new ds.FPHeapMin((int) (short) -1);
        ds.FPHeapMin fPHeapMin19 = new ds.FPHeapMin(0);
        fPHeapMin19.imprime();
        ds.Item[] itemArray21 = new ds.Item[] {};
        fPHeapMin19.copia(itemArray21);
        ds.FPHeapMin fPHeapMin23 = new ds.FPHeapMin(itemArray21);
        fPHeapMin23.constroi();
        ds.Item[] itemArray25 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin26 = new ds.FPHeapMin(itemArray25);
        fPHeapMin23.copia(itemArray25);
        fPHeapMin17.copia(itemArray25);
        fPHeapMin4.copia(itemArray25);
        fPHeapMin1.copia(itemArray25);
        ds.FPHeapMin fPHeapMin31 = new ds.FPHeapMin(itemArray25);
        java.lang.Class<?> wildcardClass32 = fPHeapMin31.getClass();
        org.junit.Assert.assertNull(item2);
        org.junit.Assert.assertNotNull(itemArray8);
        org.junit.Assert.assertNotNull(itemArray12);
        org.junit.Assert.assertNotNull(itemArray21);
        org.junit.Assert.assertNotNull(itemArray25);
        org.junit.Assert.assertNotNull(wildcardClass32);
    }

    @Test
    public void test174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test174");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin(0);
        fPHeapMin1.imprime();
        ds.Item[] itemArray3 = new ds.Item[] {};
        fPHeapMin1.copia(itemArray3);
        ds.FPHeapMin fPHeapMin5 = new ds.FPHeapMin(itemArray3);
        fPHeapMin5.constroi();
        ds.Item[] itemArray7 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin8 = new ds.FPHeapMin(itemArray7);
        fPHeapMin5.copia(itemArray7);
        ds.FPHeapMin fPHeapMin11 = new ds.FPHeapMin((int) (short) -1);
        ds.FPHeapMin fPHeapMin13 = new ds.FPHeapMin(0);
        fPHeapMin13.imprime();
        ds.Item[] itemArray15 = new ds.Item[] {};
        fPHeapMin13.copia(itemArray15);
        ds.FPHeapMin fPHeapMin17 = new ds.FPHeapMin(itemArray15);
        fPHeapMin17.constroi();
        ds.Item[] itemArray19 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin20 = new ds.FPHeapMin(itemArray19);
        fPHeapMin17.copia(itemArray19);
        fPHeapMin11.copia(itemArray19);
        ds.FPHeapMin fPHeapMin24 = new ds.FPHeapMin((int) (short) -1);
        ds.FPHeapMin fPHeapMin26 = new ds.FPHeapMin(0);
        fPHeapMin26.imprime();
        ds.Item[] itemArray28 = new ds.Item[] {};
        fPHeapMin26.copia(itemArray28);
        ds.FPHeapMin fPHeapMin30 = new ds.FPHeapMin(itemArray28);
        fPHeapMin30.constroi();
        ds.Item[] itemArray32 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin33 = new ds.FPHeapMin(itemArray32);
        fPHeapMin30.copia(itemArray32);
        fPHeapMin24.copia(itemArray32);
        fPHeapMin11.copia(itemArray32);
        fPHeapMin5.copia(itemArray32);
        ds.FPHeapMin fPHeapMin39 = new ds.FPHeapMin((int) (short) -1);
        ds.FPHeapMin fPHeapMin41 = new ds.FPHeapMin(0);
        fPHeapMin41.imprime();
        ds.Item[] itemArray43 = new ds.Item[] {};
        fPHeapMin41.copia(itemArray43);
        ds.FPHeapMin fPHeapMin45 = new ds.FPHeapMin(itemArray43);
        fPHeapMin45.constroi();
        ds.Item[] itemArray47 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin48 = new ds.FPHeapMin(itemArray47);
        fPHeapMin45.copia(itemArray47);
        fPHeapMin39.copia(itemArray47);
        fPHeapMin5.copia(itemArray47);
        ds.Item item52 = null;
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMin5.insere(item52);
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: heap cheio");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertNotNull(itemArray7);
        org.junit.Assert.assertNotNull(itemArray15);
        org.junit.Assert.assertNotNull(itemArray19);
        org.junit.Assert.assertNotNull(itemArray28);
        org.junit.Assert.assertNotNull(itemArray32);
        org.junit.Assert.assertNotNull(itemArray43);
        org.junit.Assert.assertNotNull(itemArray47);
    }

    @Test
    public void test175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test175");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin((-1));
        java.lang.Class<?> wildcardClass2 = fPHeapMin1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test176");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin(0);
        fPHeapMin1.imprime();
        ds.Item[] itemArray3 = new ds.Item[] {};
        fPHeapMin1.copia(itemArray3);
        ds.FPHeapMin fPHeapMin5 = new ds.FPHeapMin(itemArray3);
        ds.FPHeapMin fPHeapMin7 = new ds.FPHeapMin(0);
        fPHeapMin7.imprime();
        ds.Item[] itemArray9 = new ds.Item[] {};
        fPHeapMin7.copia(itemArray9);
        fPHeapMin5.copia(itemArray9);
        ds.FPHeapMin fPHeapMin12 = new ds.FPHeapMin(itemArray9);
        ds.FPHeapMin fPHeapMin14 = new ds.FPHeapMin(0);
        fPHeapMin14.imprime();
        ds.Item[] itemArray16 = new ds.Item[] {};
        fPHeapMin14.copia(itemArray16);
        ds.FPHeapMin fPHeapMin18 = new ds.FPHeapMin(itemArray16);
        fPHeapMin18.constroi();
        ds.Item[] itemArray20 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin21 = new ds.FPHeapMin(itemArray20);
        fPHeapMin18.copia(itemArray20);
        ds.FPHeapMin fPHeapMin24 = new ds.FPHeapMin((int) (short) -1);
        ds.FPHeapMin fPHeapMin26 = new ds.FPHeapMin(0);
        fPHeapMin26.imprime();
        ds.Item[] itemArray28 = new ds.Item[] {};
        fPHeapMin26.copia(itemArray28);
        ds.FPHeapMin fPHeapMin30 = new ds.FPHeapMin(itemArray28);
        fPHeapMin30.constroi();
        ds.Item[] itemArray32 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin33 = new ds.FPHeapMin(itemArray32);
        fPHeapMin30.copia(itemArray32);
        fPHeapMin24.copia(itemArray32);
        ds.FPHeapMin fPHeapMin37 = new ds.FPHeapMin((int) (short) -1);
        ds.FPHeapMin fPHeapMin39 = new ds.FPHeapMin(0);
        fPHeapMin39.imprime();
        ds.Item[] itemArray41 = new ds.Item[] {};
        fPHeapMin39.copia(itemArray41);
        ds.FPHeapMin fPHeapMin43 = new ds.FPHeapMin(itemArray41);
        fPHeapMin43.constroi();
        ds.Item[] itemArray45 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin46 = new ds.FPHeapMin(itemArray45);
        fPHeapMin43.copia(itemArray45);
        fPHeapMin37.copia(itemArray45);
        fPHeapMin24.copia(itemArray45);
        fPHeapMin18.copia(itemArray45);
        fPHeapMin12.copia(itemArray45);
        ds.FPHeapMin fPHeapMin54 = new ds.FPHeapMin((int) (short) -1);
        ds.FPHeapMin fPHeapMin56 = new ds.FPHeapMin(0);
        fPHeapMin56.imprime();
        ds.Item[] itemArray58 = new ds.Item[] {};
        fPHeapMin56.copia(itemArray58);
        ds.FPHeapMin fPHeapMin60 = new ds.FPHeapMin(itemArray58);
        fPHeapMin60.constroi();
        ds.Item[] itemArray62 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin63 = new ds.FPHeapMin(itemArray62);
        fPHeapMin60.copia(itemArray62);
        fPHeapMin54.copia(itemArray62);
        ds.FPHeapMin fPHeapMin66 = new ds.FPHeapMin(itemArray62);
        ds.FPHeapMin fPHeapMin67 = new ds.FPHeapMin(itemArray62);
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMin12.diminuiChave((int) '#', (java.lang.Object) fPHeapMin67);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 35");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertNotNull(itemArray9);
        org.junit.Assert.assertNotNull(itemArray16);
        org.junit.Assert.assertNotNull(itemArray20);
        org.junit.Assert.assertNotNull(itemArray28);
        org.junit.Assert.assertNotNull(itemArray32);
        org.junit.Assert.assertNotNull(itemArray41);
        org.junit.Assert.assertNotNull(itemArray45);
        org.junit.Assert.assertNotNull(itemArray58);
        org.junit.Assert.assertNotNull(itemArray62);
    }

    @Test
    public void test177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test177");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin((-1));
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMin1.diminuiChave((int) '#', (java.lang.Object) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 35");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test178");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin(0);
        fPHeapMin1.imprime();
        ds.Item[] itemArray3 = new ds.Item[] {};
        fPHeapMin1.copia(itemArray3);
        ds.FPHeapMin fPHeapMin5 = new ds.FPHeapMin(itemArray3);
        ds.FPHeapMin fPHeapMin7 = new ds.FPHeapMin(0);
        fPHeapMin7.imprime();
        ds.Item[] itemArray9 = new ds.Item[] {};
        fPHeapMin7.copia(itemArray9);
        fPHeapMin5.copia(itemArray9);
        ds.FPHeapMin fPHeapMin12 = new ds.FPHeapMin(itemArray9);
        ds.FPHeapMin fPHeapMin14 = new ds.FPHeapMin(0);
        fPHeapMin14.imprime();
        ds.Item[] itemArray16 = new ds.Item[] {};
        fPHeapMin14.copia(itemArray16);
        ds.FPHeapMin fPHeapMin18 = new ds.FPHeapMin(itemArray16);
        fPHeapMin18.constroi();
        ds.Item[] itemArray20 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin21 = new ds.FPHeapMin(itemArray20);
        fPHeapMin18.copia(itemArray20);
        ds.FPHeapMin fPHeapMin24 = new ds.FPHeapMin((int) (short) -1);
        ds.FPHeapMin fPHeapMin26 = new ds.FPHeapMin(0);
        fPHeapMin26.imprime();
        ds.Item[] itemArray28 = new ds.Item[] {};
        fPHeapMin26.copia(itemArray28);
        ds.FPHeapMin fPHeapMin30 = new ds.FPHeapMin(itemArray28);
        fPHeapMin30.constroi();
        ds.Item[] itemArray32 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin33 = new ds.FPHeapMin(itemArray32);
        fPHeapMin30.copia(itemArray32);
        fPHeapMin24.copia(itemArray32);
        ds.FPHeapMin fPHeapMin37 = new ds.FPHeapMin((int) (short) -1);
        ds.FPHeapMin fPHeapMin39 = new ds.FPHeapMin(0);
        fPHeapMin39.imprime();
        ds.Item[] itemArray41 = new ds.Item[] {};
        fPHeapMin39.copia(itemArray41);
        ds.FPHeapMin fPHeapMin43 = new ds.FPHeapMin(itemArray41);
        fPHeapMin43.constroi();
        ds.Item[] itemArray45 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin46 = new ds.FPHeapMin(itemArray45);
        fPHeapMin43.copia(itemArray45);
        fPHeapMin37.copia(itemArray45);
        fPHeapMin24.copia(itemArray45);
        fPHeapMin18.copia(itemArray45);
        fPHeapMin12.copia(itemArray45);
        fPHeapMin12.constroi();
        fPHeapMin12.imprime();
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertNotNull(itemArray9);
        org.junit.Assert.assertNotNull(itemArray16);
        org.junit.Assert.assertNotNull(itemArray20);
        org.junit.Assert.assertNotNull(itemArray28);
        org.junit.Assert.assertNotNull(itemArray32);
        org.junit.Assert.assertNotNull(itemArray41);
        org.junit.Assert.assertNotNull(itemArray45);
    }

    @Test
    public void test179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test179");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin((int) (short) 1);
        fPHeapMin1.constroi();
        fPHeapMin1.constroi();
        ds.FPHeapMin fPHeapMin5 = new ds.FPHeapMin((int) (short) -1);
        ds.FPHeapMin fPHeapMin7 = new ds.FPHeapMin(0);
        fPHeapMin7.imprime();
        ds.Item[] itemArray9 = new ds.Item[] {};
        fPHeapMin7.copia(itemArray9);
        ds.FPHeapMin fPHeapMin11 = new ds.FPHeapMin(itemArray9);
        fPHeapMin11.constroi();
        ds.Item[] itemArray13 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin14 = new ds.FPHeapMin(itemArray13);
        fPHeapMin11.copia(itemArray13);
        fPHeapMin5.copia(itemArray13);
        ds.FPHeapMin fPHeapMin18 = new ds.FPHeapMin((int) (short) -1);
        ds.FPHeapMin fPHeapMin20 = new ds.FPHeapMin(0);
        fPHeapMin20.imprime();
        ds.Item[] itemArray22 = new ds.Item[] {};
        fPHeapMin20.copia(itemArray22);
        ds.FPHeapMin fPHeapMin24 = new ds.FPHeapMin(itemArray22);
        fPHeapMin24.constroi();
        ds.Item[] itemArray26 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin27 = new ds.FPHeapMin(itemArray26);
        fPHeapMin24.copia(itemArray26);
        fPHeapMin18.copia(itemArray26);
        fPHeapMin5.copia(itemArray26);
        ds.FPHeapMin fPHeapMin32 = new ds.FPHeapMin((int) (byte) 100);
        ds.FPHeapMin fPHeapMin34 = new ds.FPHeapMin(0);
        fPHeapMin34.imprime();
        ds.Item[] itemArray36 = new ds.Item[] {};
        fPHeapMin34.copia(itemArray36);
        ds.FPHeapMin fPHeapMin38 = new ds.FPHeapMin(itemArray36);
        ds.FPHeapMin fPHeapMin40 = new ds.FPHeapMin(0);
        fPHeapMin40.imprime();
        ds.Item[] itemArray42 = new ds.Item[] {};
        fPHeapMin40.copia(itemArray42);
        fPHeapMin38.copia(itemArray42);
        fPHeapMin32.copia(itemArray42);
        fPHeapMin5.copia(itemArray42);
        fPHeapMin1.copia(itemArray42);
        ds.Item item48 = fPHeapMin1.min();
        fPHeapMin1.imprime();
        ds.Item item50 = null;
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMin1.insere(item50);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray9);
        org.junit.Assert.assertNotNull(itemArray13);
        org.junit.Assert.assertNotNull(itemArray22);
        org.junit.Assert.assertNotNull(itemArray26);
        org.junit.Assert.assertNotNull(itemArray36);
        org.junit.Assert.assertNotNull(itemArray42);
        org.junit.Assert.assertNull(item48);
    }

    @Test
    public void test180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test180");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin((int) (byte) 100);
        ds.Item item2 = fPHeapMin1.min();
        ds.FPHeapMin fPHeapMin4 = new ds.FPHeapMin((int) (short) -1);
        ds.FPHeapMin fPHeapMin6 = new ds.FPHeapMin(0);
        fPHeapMin6.imprime();
        ds.Item[] itemArray8 = new ds.Item[] {};
        fPHeapMin6.copia(itemArray8);
        ds.FPHeapMin fPHeapMin10 = new ds.FPHeapMin(itemArray8);
        fPHeapMin10.constroi();
        ds.Item[] itemArray12 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin13 = new ds.FPHeapMin(itemArray12);
        fPHeapMin10.copia(itemArray12);
        fPHeapMin4.copia(itemArray12);
        ds.Item[] itemArray16 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin17 = new ds.FPHeapMin(itemArray16);
        fPHeapMin4.copia(itemArray16);
        ds.FPHeapMin fPHeapMin19 = new ds.FPHeapMin(itemArray16);
        fPHeapMin1.copia(itemArray16);
        fPHeapMin1.imprime();
        org.junit.Assert.assertNull(item2);
        org.junit.Assert.assertNotNull(itemArray8);
        org.junit.Assert.assertNotNull(itemArray12);
        org.junit.Assert.assertNotNull(itemArray16);
    }

    @Test
    public void test181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test181");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin(0);
        fPHeapMin1.imprime();
        ds.Item[] itemArray3 = new ds.Item[] {};
        fPHeapMin1.copia(itemArray3);
        ds.FPHeapMin fPHeapMin5 = new ds.FPHeapMin(itemArray3);
        fPHeapMin5.constroi();
        ds.Item[] itemArray7 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin8 = new ds.FPHeapMin(itemArray7);
        fPHeapMin5.copia(itemArray7);
        ds.FPHeapMin fPHeapMin10 = new ds.FPHeapMin(itemArray7);
        fPHeapMin10.constroi();
        ds.Item item12 = null;
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMin10.insere(item12);
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: heap cheio");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertNotNull(itemArray7);
    }

    @Test
    public void test182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test182");
        ds.Item[] itemArray0 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin(itemArray0);
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMin1.refaz((int) '4', (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 52");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray0);
    }

    @Test
    public void test183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test183");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin((int) (short) 1);
        fPHeapMin1.constroi();
        fPHeapMin1.constroi();
        ds.FPHeapMin fPHeapMin5 = new ds.FPHeapMin((int) (short) -1);
        ds.FPHeapMin fPHeapMin7 = new ds.FPHeapMin(0);
        fPHeapMin7.imprime();
        ds.Item[] itemArray9 = new ds.Item[] {};
        fPHeapMin7.copia(itemArray9);
        ds.FPHeapMin fPHeapMin11 = new ds.FPHeapMin(itemArray9);
        fPHeapMin11.constroi();
        ds.Item[] itemArray13 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin14 = new ds.FPHeapMin(itemArray13);
        fPHeapMin11.copia(itemArray13);
        fPHeapMin5.copia(itemArray13);
        ds.FPHeapMin fPHeapMin18 = new ds.FPHeapMin((int) (short) -1);
        ds.FPHeapMin fPHeapMin20 = new ds.FPHeapMin(0);
        fPHeapMin20.imprime();
        ds.Item[] itemArray22 = new ds.Item[] {};
        fPHeapMin20.copia(itemArray22);
        ds.FPHeapMin fPHeapMin24 = new ds.FPHeapMin(itemArray22);
        fPHeapMin24.constroi();
        ds.Item[] itemArray26 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin27 = new ds.FPHeapMin(itemArray26);
        fPHeapMin24.copia(itemArray26);
        fPHeapMin18.copia(itemArray26);
        fPHeapMin5.copia(itemArray26);
        ds.FPHeapMin fPHeapMin32 = new ds.FPHeapMin((int) (byte) 100);
        ds.FPHeapMin fPHeapMin34 = new ds.FPHeapMin(0);
        fPHeapMin34.imprime();
        ds.Item[] itemArray36 = new ds.Item[] {};
        fPHeapMin34.copia(itemArray36);
        ds.FPHeapMin fPHeapMin38 = new ds.FPHeapMin(itemArray36);
        ds.FPHeapMin fPHeapMin40 = new ds.FPHeapMin(0);
        fPHeapMin40.imprime();
        ds.Item[] itemArray42 = new ds.Item[] {};
        fPHeapMin40.copia(itemArray42);
        fPHeapMin38.copia(itemArray42);
        fPHeapMin32.copia(itemArray42);
        fPHeapMin5.copia(itemArray42);
        fPHeapMin1.copia(itemArray42);
        fPHeapMin1.imprime();
        fPHeapMin1.constroi();
        fPHeapMin1.constroi();
        org.junit.Assert.assertNotNull(itemArray9);
        org.junit.Assert.assertNotNull(itemArray13);
        org.junit.Assert.assertNotNull(itemArray22);
        org.junit.Assert.assertNotNull(itemArray26);
        org.junit.Assert.assertNotNull(itemArray36);
        org.junit.Assert.assertNotNull(itemArray42);
    }

    @Test
    public void test184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test184");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin((int) (short) 100);
        ds.Item item2 = fPHeapMin1.min();
        ds.Item[] itemArray3 = new ds.Item[] {};
        fPHeapMin1.copia(itemArray3);
        ds.FPHeapMin fPHeapMin6 = new ds.FPHeapMin((int) '4');
        ds.Item item7 = fPHeapMin6.min();
        ds.Item[] itemArray8 = new ds.Item[] {};
        fPHeapMin6.copia(itemArray8);
        ds.FPHeapMin fPHeapMin10 = new ds.FPHeapMin(itemArray8);
        ds.FPHeapMin fPHeapMin12 = new ds.FPHeapMin(0);
        fPHeapMin12.imprime();
        ds.Item[] itemArray14 = new ds.Item[] {};
        fPHeapMin12.copia(itemArray14);
        ds.FPHeapMin fPHeapMin16 = new ds.FPHeapMin(itemArray14);
        ds.FPHeapMin fPHeapMin18 = new ds.FPHeapMin((int) (short) -1);
        ds.FPHeapMin fPHeapMin20 = new ds.FPHeapMin(0);
        fPHeapMin20.imprime();
        ds.Item[] itemArray22 = new ds.Item[] {};
        fPHeapMin20.copia(itemArray22);
        ds.FPHeapMin fPHeapMin24 = new ds.FPHeapMin(itemArray22);
        fPHeapMin24.constroi();
        ds.Item[] itemArray26 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin27 = new ds.FPHeapMin(itemArray26);
        fPHeapMin24.copia(itemArray26);
        fPHeapMin18.copia(itemArray26);
        ds.FPHeapMin fPHeapMin31 = new ds.FPHeapMin((int) (short) -1);
        ds.FPHeapMin fPHeapMin33 = new ds.FPHeapMin(0);
        fPHeapMin33.imprime();
        ds.Item[] itemArray35 = new ds.Item[] {};
        fPHeapMin33.copia(itemArray35);
        ds.FPHeapMin fPHeapMin37 = new ds.FPHeapMin(itemArray35);
        fPHeapMin37.constroi();
        ds.Item[] itemArray39 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin40 = new ds.FPHeapMin(itemArray39);
        fPHeapMin37.copia(itemArray39);
        fPHeapMin31.copia(itemArray39);
        fPHeapMin18.copia(itemArray39);
        fPHeapMin16.copia(itemArray39);
        fPHeapMin10.copia(itemArray39);
        fPHeapMin1.copia(itemArray39);
        fPHeapMin1.imprime();
        ds.FPHeapMin fPHeapMin49 = new ds.FPHeapMin((int) (short) -1);
        ds.FPHeapMin fPHeapMin51 = new ds.FPHeapMin(0);
        fPHeapMin51.imprime();
        ds.Item[] itemArray53 = new ds.Item[] {};
        fPHeapMin51.copia(itemArray53);
        ds.FPHeapMin fPHeapMin55 = new ds.FPHeapMin(itemArray53);
        fPHeapMin55.constroi();
        ds.Item[] itemArray57 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin58 = new ds.FPHeapMin(itemArray57);
        fPHeapMin55.copia(itemArray57);
        fPHeapMin49.copia(itemArray57);
        ds.FPHeapMin fPHeapMin62 = new ds.FPHeapMin((int) (short) -1);
        ds.FPHeapMin fPHeapMin64 = new ds.FPHeapMin(0);
        fPHeapMin64.imprime();
        ds.Item[] itemArray66 = new ds.Item[] {};
        fPHeapMin64.copia(itemArray66);
        ds.FPHeapMin fPHeapMin68 = new ds.FPHeapMin(itemArray66);
        fPHeapMin68.constroi();
        ds.Item[] itemArray70 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin71 = new ds.FPHeapMin(itemArray70);
        fPHeapMin68.copia(itemArray70);
        fPHeapMin62.copia(itemArray70);
        fPHeapMin49.copia(itemArray70);
        fPHeapMin1.copia(itemArray70);
        org.junit.Assert.assertNull(item2);
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertNull(item7);
        org.junit.Assert.assertNotNull(itemArray8);
        org.junit.Assert.assertNotNull(itemArray14);
        org.junit.Assert.assertNotNull(itemArray22);
        org.junit.Assert.assertNotNull(itemArray26);
        org.junit.Assert.assertNotNull(itemArray35);
        org.junit.Assert.assertNotNull(itemArray39);
        org.junit.Assert.assertNotNull(itemArray53);
        org.junit.Assert.assertNotNull(itemArray57);
        org.junit.Assert.assertNotNull(itemArray66);
        org.junit.Assert.assertNotNull(itemArray70);
    }
}

