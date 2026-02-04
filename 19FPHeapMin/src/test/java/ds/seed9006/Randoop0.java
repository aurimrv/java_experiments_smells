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
    public void test002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test002");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin(100);
        ds.Item item2 = null;
        ds.Item[] itemArray3 = new ds.Item[] { item2 };
        fPHeapMin1.copia(itemArray3);
        ds.Item item5 = null;
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMin1.insere(item5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray3);
    }

    @Test
    public void test003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test003");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin(100);
        ds.Item[] itemArray2 = null;
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMin1.copia(itemArray2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test004");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin(100);
        fPHeapMin1.imprime();
        fPHeapMin1.refaz((int) 'a', (int) 'a');
    }

    @Test
    public void test005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test005");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin(100);
        ds.Item item2 = null;
        ds.Item[] itemArray3 = new ds.Item[] { item2 };
        fPHeapMin1.copia(itemArray3);
        fPHeapMin1.imprime();
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMin1.diminuiChave((int) '#', (java.lang.Object) (-1.0f));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray3);
    }

    @Test
    public void test006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test006");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin(100);
        ds.Item item2 = null;
        ds.Item[] itemArray3 = new ds.Item[] { item2 };
        fPHeapMin1.copia(itemArray3);
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMin1.diminuiChave((int) (short) 10, (java.lang.Object) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray3);
    }

    @Test
    public void test007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test007");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin(100);
        ds.Item[] itemArray2 = new ds.Item[] {};
        fPHeapMin1.copia(itemArray2);
        ds.FPHeapMin fPHeapMin5 = new ds.FPHeapMin(100);
        ds.Item item6 = null;
        ds.Item[] itemArray7 = new ds.Item[] { item6 };
        fPHeapMin5.copia(itemArray7);
        fPHeapMin1.copia(itemArray7);
        java.lang.Class<?> wildcardClass10 = fPHeapMin1.getClass();
        org.junit.Assert.assertNotNull(itemArray2);
        org.junit.Assert.assertNotNull(itemArray7);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test008");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin(100);
        fPHeapMin1.imprime();
        java.lang.Class<?> wildcardClass3 = fPHeapMin1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test009");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin(100);
        ds.Item[] itemArray2 = new ds.Item[] {};
        fPHeapMin1.copia(itemArray2);
        ds.FPHeapMin fPHeapMin5 = new ds.FPHeapMin(100);
        ds.Item item6 = null;
        ds.Item[] itemArray7 = new ds.Item[] { item6 };
        fPHeapMin5.copia(itemArray7);
        fPHeapMin1.copia(itemArray7);
        fPHeapMin1.imprime();
        fPHeapMin1.imprime();
        // The following exception was thrown during execution in test generation
        try {
            ds.Item item12 = fPHeapMin1.retiraMin();
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: heap vazio");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray2);
        org.junit.Assert.assertNotNull(itemArray7);
    }

    @Test
    public void test010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test010");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin(100);
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
    public void test011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test011");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin((int) (byte) -1);
        // The following exception was thrown during execution in test generation
        try {
            ds.Item item2 = fPHeapMin1.min();
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test012");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin(100);
        ds.Item[] itemArray2 = new ds.Item[] {};
        fPHeapMin1.copia(itemArray2);
        ds.FPHeapMin fPHeapMin5 = new ds.FPHeapMin(100);
        ds.Item item6 = null;
        ds.Item[] itemArray7 = new ds.Item[] { item6 };
        fPHeapMin5.copia(itemArray7);
        fPHeapMin1.copia(itemArray7);
        fPHeapMin1.imprime();
        fPHeapMin1.constroi();
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMin1.diminuiChave(1, (java.lang.Object) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray2);
        org.junit.Assert.assertNotNull(itemArray7);
    }

    @Test
    public void test013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test013");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin(100);
        ds.Item item2 = null;
        ds.Item[] itemArray3 = new ds.Item[] { item2 };
        fPHeapMin1.copia(itemArray3);
        fPHeapMin1.imprime();
        ds.FPHeapMin fPHeapMin7 = new ds.FPHeapMin(100);
        ds.Item[] itemArray8 = new ds.Item[] {};
        fPHeapMin7.copia(itemArray8);
        ds.FPHeapMin fPHeapMin11 = new ds.FPHeapMin(100);
        ds.Item item12 = null;
        ds.Item[] itemArray13 = new ds.Item[] { item12 };
        fPHeapMin11.copia(itemArray13);
        fPHeapMin7.copia(itemArray13);
        fPHeapMin1.copia(itemArray13);
        ds.FPHeapMin fPHeapMin18 = new ds.FPHeapMin(100);
        fPHeapMin18.imprime();
        ds.FPHeapMin fPHeapMin21 = new ds.FPHeapMin(100);
        ds.Item[] itemArray22 = new ds.Item[] {};
        fPHeapMin21.copia(itemArray22);
        ds.FPHeapMin fPHeapMin25 = new ds.FPHeapMin(100);
        ds.Item item26 = null;
        ds.Item[] itemArray27 = new ds.Item[] { item26 };
        fPHeapMin25.copia(itemArray27);
        fPHeapMin21.copia(itemArray27);
        fPHeapMin18.copia(itemArray27);
        fPHeapMin1.copia(itemArray27);
        fPHeapMin1.constroi();
        // The following exception was thrown during execution in test generation
        try {
            ds.Item item33 = fPHeapMin1.retiraMin();
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: heap vazio");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertNotNull(itemArray8);
        org.junit.Assert.assertNotNull(itemArray13);
        org.junit.Assert.assertNotNull(itemArray22);
        org.junit.Assert.assertNotNull(itemArray27);
    }

    @Test
    public void test014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test014");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin(100);
        ds.Item item2 = null;
        ds.Item[] itemArray3 = new ds.Item[] { item2 };
        fPHeapMin1.copia(itemArray3);
        fPHeapMin1.imprime();
        ds.FPHeapMin fPHeapMin7 = new ds.FPHeapMin(100);
        ds.Item[] itemArray8 = new ds.Item[] {};
        fPHeapMin7.copia(itemArray8);
        ds.FPHeapMin fPHeapMin11 = new ds.FPHeapMin(100);
        ds.Item item12 = null;
        ds.Item[] itemArray13 = new ds.Item[] { item12 };
        fPHeapMin11.copia(itemArray13);
        fPHeapMin7.copia(itemArray13);
        fPHeapMin1.copia(itemArray13);
        ds.FPHeapMin fPHeapMin18 = new ds.FPHeapMin(100);
        fPHeapMin18.imprime();
        ds.FPHeapMin fPHeapMin21 = new ds.FPHeapMin(100);
        ds.Item[] itemArray22 = new ds.Item[] {};
        fPHeapMin21.copia(itemArray22);
        ds.FPHeapMin fPHeapMin25 = new ds.FPHeapMin(100);
        ds.Item item26 = null;
        ds.Item[] itemArray27 = new ds.Item[] { item26 };
        fPHeapMin25.copia(itemArray27);
        fPHeapMin21.copia(itemArray27);
        fPHeapMin18.copia(itemArray27);
        fPHeapMin1.copia(itemArray27);
        fPHeapMin1.constroi();
        java.lang.Class<?> wildcardClass33 = fPHeapMin1.getClass();
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertNotNull(itemArray8);
        org.junit.Assert.assertNotNull(itemArray13);
        org.junit.Assert.assertNotNull(itemArray22);
        org.junit.Assert.assertNotNull(itemArray27);
        org.junit.Assert.assertNotNull(wildcardClass33);
    }

    @Test
    public void test015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test015");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin(100);
        ds.Item item2 = null;
        ds.Item[] itemArray3 = new ds.Item[] { item2 };
        fPHeapMin1.copia(itemArray3);
        ds.FPHeapMin fPHeapMin6 = new ds.FPHeapMin(100);
        ds.Item item7 = null;
        ds.Item[] itemArray8 = new ds.Item[] { item7 };
        fPHeapMin6.copia(itemArray8);
        fPHeapMin6.imprime();
        ds.FPHeapMin fPHeapMin12 = new ds.FPHeapMin(100);
        ds.Item[] itemArray13 = new ds.Item[] {};
        fPHeapMin12.copia(itemArray13);
        ds.FPHeapMin fPHeapMin16 = new ds.FPHeapMin(100);
        ds.Item item17 = null;
        ds.Item[] itemArray18 = new ds.Item[] { item17 };
        fPHeapMin16.copia(itemArray18);
        fPHeapMin12.copia(itemArray18);
        fPHeapMin6.copia(itemArray18);
        ds.FPHeapMin fPHeapMin23 = new ds.FPHeapMin(100);
        ds.Item item24 = null;
        ds.Item[] itemArray25 = new ds.Item[] { item24 };
        fPHeapMin23.copia(itemArray25);
        fPHeapMin6.copia(itemArray25);
        fPHeapMin1.copia(itemArray25);
        ds.FPHeapMin fPHeapMin29 = new ds.FPHeapMin(itemArray25);
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMin29.refaz((int) (byte) 100, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 100");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertNotNull(itemArray8);
        org.junit.Assert.assertNotNull(itemArray13);
        org.junit.Assert.assertNotNull(itemArray18);
        org.junit.Assert.assertNotNull(itemArray25);
    }

    @Test
    public void test016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test016");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin(100);
        ds.Item item2 = null;
        ds.Item[] itemArray3 = new ds.Item[] { item2 };
        fPHeapMin1.copia(itemArray3);
        fPHeapMin1.imprime();
        ds.FPHeapMin fPHeapMin7 = new ds.FPHeapMin(100);
        ds.Item[] itemArray8 = new ds.Item[] {};
        fPHeapMin7.copia(itemArray8);
        ds.FPHeapMin fPHeapMin11 = new ds.FPHeapMin(100);
        ds.Item item12 = null;
        ds.Item[] itemArray13 = new ds.Item[] { item12 };
        fPHeapMin11.copia(itemArray13);
        fPHeapMin7.copia(itemArray13);
        fPHeapMin1.copia(itemArray13);
        ds.FPHeapMin fPHeapMin18 = new ds.FPHeapMin(100);
        fPHeapMin18.imprime();
        ds.FPHeapMin fPHeapMin21 = new ds.FPHeapMin(100);
        ds.Item[] itemArray22 = new ds.Item[] {};
        fPHeapMin21.copia(itemArray22);
        ds.FPHeapMin fPHeapMin25 = new ds.FPHeapMin(100);
        ds.Item item26 = null;
        ds.Item[] itemArray27 = new ds.Item[] { item26 };
        fPHeapMin25.copia(itemArray27);
        fPHeapMin21.copia(itemArray27);
        fPHeapMin18.copia(itemArray27);
        fPHeapMin1.copia(itemArray27);
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMin1.diminuiChave((int) (short) 0, (java.lang.Object) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertNotNull(itemArray8);
        org.junit.Assert.assertNotNull(itemArray13);
        org.junit.Assert.assertNotNull(itemArray22);
        org.junit.Assert.assertNotNull(itemArray27);
    }

    @Test
    public void test017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test017");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin(100);
        ds.Item item2 = null;
        ds.Item[] itemArray3 = new ds.Item[] { item2 };
        fPHeapMin1.copia(itemArray3);
        java.lang.Class<?> wildcardClass5 = itemArray3.getClass();
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test018");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin(100);
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
    public void test019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test019");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin(100);
        ds.Item[] itemArray2 = new ds.Item[] {};
        fPHeapMin1.copia(itemArray2);
        ds.FPHeapMin fPHeapMin5 = new ds.FPHeapMin(100);
        ds.Item item6 = null;
        ds.Item[] itemArray7 = new ds.Item[] { item6 };
        fPHeapMin5.copia(itemArray7);
        fPHeapMin1.copia(itemArray7);
        fPHeapMin1.imprime();
        fPHeapMin1.imprime();
        ds.Item item12 = null;
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMin1.insere(item12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray2);
        org.junit.Assert.assertNotNull(itemArray7);
    }

    @Test
    public void test020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test020");
        ds.Item[] itemArray0 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin(itemArray0);
        ds.FPHeapMin fPHeapMin3 = new ds.FPHeapMin(100);
        ds.Item item4 = null;
        ds.Item[] itemArray5 = new ds.Item[] { item4 };
        fPHeapMin3.copia(itemArray5);
        ds.FPHeapMin fPHeapMin8 = new ds.FPHeapMin(100);
        ds.Item item9 = null;
        ds.Item[] itemArray10 = new ds.Item[] { item9 };
        fPHeapMin8.copia(itemArray10);
        fPHeapMin8.imprime();
        ds.FPHeapMin fPHeapMin14 = new ds.FPHeapMin(100);
        ds.Item[] itemArray15 = new ds.Item[] {};
        fPHeapMin14.copia(itemArray15);
        ds.FPHeapMin fPHeapMin18 = new ds.FPHeapMin(100);
        ds.Item item19 = null;
        ds.Item[] itemArray20 = new ds.Item[] { item19 };
        fPHeapMin18.copia(itemArray20);
        fPHeapMin14.copia(itemArray20);
        fPHeapMin8.copia(itemArray20);
        ds.FPHeapMin fPHeapMin25 = new ds.FPHeapMin(100);
        ds.Item item26 = null;
        ds.Item[] itemArray27 = new ds.Item[] { item26 };
        fPHeapMin25.copia(itemArray27);
        fPHeapMin8.copia(itemArray27);
        fPHeapMin3.copia(itemArray27);
        ds.FPHeapMin fPHeapMin31 = new ds.FPHeapMin(itemArray27);
        fPHeapMin1.copia(itemArray27);
        java.lang.Class<?> wildcardClass33 = itemArray27.getClass();
        org.junit.Assert.assertNotNull(itemArray0);
        org.junit.Assert.assertNotNull(itemArray5);
        org.junit.Assert.assertNotNull(itemArray10);
        org.junit.Assert.assertNotNull(itemArray15);
        org.junit.Assert.assertNotNull(itemArray20);
        org.junit.Assert.assertNotNull(itemArray27);
        org.junit.Assert.assertNotNull(wildcardClass33);
    }

    @Test
    public void test021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test021");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin(100);
        fPHeapMin1.imprime();
        ds.FPHeapMin fPHeapMin4 = new ds.FPHeapMin(100);
        ds.Item[] itemArray5 = new ds.Item[] {};
        fPHeapMin4.copia(itemArray5);
        ds.FPHeapMin fPHeapMin8 = new ds.FPHeapMin(100);
        ds.Item item9 = null;
        ds.Item[] itemArray10 = new ds.Item[] { item9 };
        fPHeapMin8.copia(itemArray10);
        fPHeapMin4.copia(itemArray10);
        fPHeapMin1.copia(itemArray10);
        ds.FPHeapMin fPHeapMin14 = new ds.FPHeapMin(itemArray10);
        java.lang.Class<?> wildcardClass15 = fPHeapMin14.getClass();
        org.junit.Assert.assertNotNull(itemArray5);
        org.junit.Assert.assertNotNull(itemArray10);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test022");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin(100);
        fPHeapMin1.imprime();
        ds.FPHeapMin fPHeapMin4 = new ds.FPHeapMin(100);
        ds.Item[] itemArray5 = new ds.Item[] {};
        fPHeapMin4.copia(itemArray5);
        ds.FPHeapMin fPHeapMin8 = new ds.FPHeapMin(100);
        ds.Item item9 = null;
        ds.Item[] itemArray10 = new ds.Item[] { item9 };
        fPHeapMin8.copia(itemArray10);
        fPHeapMin4.copia(itemArray10);
        fPHeapMin1.copia(itemArray10);
        ds.Item item14 = null;
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMin1.insere(item14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray5);
        org.junit.Assert.assertNotNull(itemArray10);
    }

    @Test
    public void test023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test023");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin(100);
        ds.Item item2 = null;
        ds.Item[] itemArray3 = new ds.Item[] { item2 };
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
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertNull(item6);
    }

    @Test
    public void test024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test024");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin(100);
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
    public void test025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test025");
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
    public void test026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test026");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin(100);
        ds.Item item2 = null;
        ds.Item[] itemArray3 = new ds.Item[] { item2 };
        fPHeapMin1.copia(itemArray3);
        fPHeapMin1.imprime();
        ds.FPHeapMin fPHeapMin7 = new ds.FPHeapMin(100);
        ds.Item[] itemArray8 = new ds.Item[] {};
        fPHeapMin7.copia(itemArray8);
        ds.FPHeapMin fPHeapMin11 = new ds.FPHeapMin(100);
        ds.Item item12 = null;
        ds.Item[] itemArray13 = new ds.Item[] { item12 };
        fPHeapMin11.copia(itemArray13);
        fPHeapMin7.copia(itemArray13);
        fPHeapMin1.copia(itemArray13);
        ds.FPHeapMin fPHeapMin18 = new ds.FPHeapMin(100);
        fPHeapMin18.imprime();
        ds.FPHeapMin fPHeapMin21 = new ds.FPHeapMin(100);
        ds.Item[] itemArray22 = new ds.Item[] {};
        fPHeapMin21.copia(itemArray22);
        ds.FPHeapMin fPHeapMin25 = new ds.FPHeapMin(100);
        ds.Item item26 = null;
        ds.Item[] itemArray27 = new ds.Item[] { item26 };
        fPHeapMin25.copia(itemArray27);
        fPHeapMin21.copia(itemArray27);
        fPHeapMin18.copia(itemArray27);
        fPHeapMin1.copia(itemArray27);
        fPHeapMin1.constroi();
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMin1.diminuiChave((int) '4', (java.lang.Object) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertNotNull(itemArray8);
        org.junit.Assert.assertNotNull(itemArray13);
        org.junit.Assert.assertNotNull(itemArray22);
        org.junit.Assert.assertNotNull(itemArray27);
    }

    @Test
    public void test027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test027");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin(100);
        ds.Item item2 = null;
        ds.Item[] itemArray3 = new ds.Item[] { item2 };
        fPHeapMin1.copia(itemArray3);
        fPHeapMin1.imprime();
        fPHeapMin1.constroi();
        ds.FPHeapMin fPHeapMin8 = new ds.FPHeapMin(100);
        ds.Item item9 = null;
        ds.Item[] itemArray10 = new ds.Item[] { item9 };
        fPHeapMin8.copia(itemArray10);
        ds.FPHeapMin fPHeapMin13 = new ds.FPHeapMin(100);
        ds.Item item14 = null;
        ds.Item[] itemArray15 = new ds.Item[] { item14 };
        fPHeapMin13.copia(itemArray15);
        fPHeapMin13.imprime();
        ds.FPHeapMin fPHeapMin19 = new ds.FPHeapMin(100);
        ds.Item[] itemArray20 = new ds.Item[] {};
        fPHeapMin19.copia(itemArray20);
        ds.FPHeapMin fPHeapMin23 = new ds.FPHeapMin(100);
        ds.Item item24 = null;
        ds.Item[] itemArray25 = new ds.Item[] { item24 };
        fPHeapMin23.copia(itemArray25);
        fPHeapMin19.copia(itemArray25);
        fPHeapMin13.copia(itemArray25);
        ds.FPHeapMin fPHeapMin30 = new ds.FPHeapMin(100);
        ds.Item item31 = null;
        ds.Item[] itemArray32 = new ds.Item[] { item31 };
        fPHeapMin30.copia(itemArray32);
        fPHeapMin13.copia(itemArray32);
        fPHeapMin8.copia(itemArray32);
        fPHeapMin1.copia(itemArray32);
        fPHeapMin1.refaz((int) (byte) 100, (int) ' ');
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertNotNull(itemArray10);
        org.junit.Assert.assertNotNull(itemArray15);
        org.junit.Assert.assertNotNull(itemArray20);
        org.junit.Assert.assertNotNull(itemArray25);
        org.junit.Assert.assertNotNull(itemArray32);
    }

    @Test
    public void test028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test028");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin(100);
        ds.Item item2 = null;
        ds.Item[] itemArray3 = new ds.Item[] { item2 };
        fPHeapMin1.copia(itemArray3);
        fPHeapMin1.imprime();
        ds.FPHeapMin fPHeapMin7 = new ds.FPHeapMin(100);
        ds.Item[] itemArray8 = new ds.Item[] {};
        fPHeapMin7.copia(itemArray8);
        ds.FPHeapMin fPHeapMin11 = new ds.FPHeapMin(100);
        ds.Item item12 = null;
        ds.Item[] itemArray13 = new ds.Item[] { item12 };
        fPHeapMin11.copia(itemArray13);
        fPHeapMin7.copia(itemArray13);
        fPHeapMin1.copia(itemArray13);
        ds.FPHeapMin fPHeapMin17 = new ds.FPHeapMin(itemArray13);
        fPHeapMin17.constroi();
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMin17.refaz((int) (byte) -1, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertNotNull(itemArray8);
        org.junit.Assert.assertNotNull(itemArray13);
    }

    @Test
    public void test029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test029");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin(100);
        fPHeapMin1.imprime();
        ds.FPHeapMin fPHeapMin4 = new ds.FPHeapMin(100);
        ds.Item[] itemArray5 = new ds.Item[] {};
        fPHeapMin4.copia(itemArray5);
        ds.FPHeapMin fPHeapMin8 = new ds.FPHeapMin(100);
        ds.Item item9 = null;
        ds.Item[] itemArray10 = new ds.Item[] { item9 };
        fPHeapMin8.copia(itemArray10);
        fPHeapMin4.copia(itemArray10);
        fPHeapMin1.copia(itemArray10);
        ds.FPHeapMin fPHeapMin15 = new ds.FPHeapMin(100);
        ds.Item item16 = null;
        ds.Item[] itemArray17 = new ds.Item[] { item16 };
        fPHeapMin15.copia(itemArray17);
        fPHeapMin15.imprime();
        ds.FPHeapMin fPHeapMin21 = new ds.FPHeapMin(100);
        ds.Item[] itemArray22 = new ds.Item[] {};
        fPHeapMin21.copia(itemArray22);
        ds.FPHeapMin fPHeapMin25 = new ds.FPHeapMin(100);
        ds.Item item26 = null;
        ds.Item[] itemArray27 = new ds.Item[] { item26 };
        fPHeapMin25.copia(itemArray27);
        fPHeapMin21.copia(itemArray27);
        fPHeapMin15.copia(itemArray27);
        ds.FPHeapMin fPHeapMin31 = new ds.FPHeapMin(itemArray27);
        fPHeapMin1.copia(itemArray27);
        ds.FPHeapMin fPHeapMin33 = new ds.FPHeapMin(itemArray27);
        java.lang.Class<?> wildcardClass34 = itemArray27.getClass();
        org.junit.Assert.assertNotNull(itemArray5);
        org.junit.Assert.assertNotNull(itemArray10);
        org.junit.Assert.assertNotNull(itemArray17);
        org.junit.Assert.assertNotNull(itemArray22);
        org.junit.Assert.assertNotNull(itemArray27);
        org.junit.Assert.assertNotNull(wildcardClass34);
    }

    @Test
    public void test030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test030");
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
    public void test031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test031");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin(100);
        ds.Item item2 = null;
        ds.Item[] itemArray3 = new ds.Item[] { item2 };
        fPHeapMin1.copia(itemArray3);
        fPHeapMin1.imprime();
        ds.FPHeapMin fPHeapMin7 = new ds.FPHeapMin(100);
        ds.Item[] itemArray8 = new ds.Item[] {};
        fPHeapMin7.copia(itemArray8);
        ds.FPHeapMin fPHeapMin11 = new ds.FPHeapMin(100);
        ds.Item item12 = null;
        ds.Item[] itemArray13 = new ds.Item[] { item12 };
        fPHeapMin11.copia(itemArray13);
        fPHeapMin7.copia(itemArray13);
        fPHeapMin1.copia(itemArray13);
        ds.FPHeapMin fPHeapMin18 = new ds.FPHeapMin(100);
        ds.Item item19 = null;
        ds.Item[] itemArray20 = new ds.Item[] { item19 };
        fPHeapMin18.copia(itemArray20);
        fPHeapMin1.copia(itemArray20);
        ds.Item item23 = fPHeapMin1.min();
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMin1.refaz(0, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertNotNull(itemArray8);
        org.junit.Assert.assertNotNull(itemArray13);
        org.junit.Assert.assertNotNull(itemArray20);
        org.junit.Assert.assertNull(item23);
    }

    @Test
    public void test032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test032");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin((int) (byte) -1);
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMin1.refaz((int) (short) 0, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 0");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test033");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin(100);
        ds.Item[] itemArray2 = new ds.Item[] {};
        fPHeapMin1.copia(itemArray2);
        ds.FPHeapMin fPHeapMin5 = new ds.FPHeapMin(100);
        ds.Item item6 = null;
        ds.Item[] itemArray7 = new ds.Item[] { item6 };
        fPHeapMin5.copia(itemArray7);
        fPHeapMin1.copia(itemArray7);
        fPHeapMin1.imprime();
        ds.Item item11 = fPHeapMin1.min();
        fPHeapMin1.constroi();
        ds.FPHeapMin fPHeapMin15 = new ds.FPHeapMin(100);
        ds.Item item16 = null;
        ds.Item[] itemArray17 = new ds.Item[] { item16 };
        fPHeapMin15.copia(itemArray17);
        fPHeapMin15.imprime();
        ds.FPHeapMin fPHeapMin21 = new ds.FPHeapMin(100);
        ds.Item[] itemArray22 = new ds.Item[] {};
        fPHeapMin21.copia(itemArray22);
        ds.FPHeapMin fPHeapMin25 = new ds.FPHeapMin(100);
        ds.Item item26 = null;
        ds.Item[] itemArray27 = new ds.Item[] { item26 };
        fPHeapMin25.copia(itemArray27);
        fPHeapMin21.copia(itemArray27);
        fPHeapMin15.copia(itemArray27);
        ds.FPHeapMin fPHeapMin32 = new ds.FPHeapMin(100);
        fPHeapMin32.imprime();
        ds.FPHeapMin fPHeapMin35 = new ds.FPHeapMin(100);
        ds.Item[] itemArray36 = new ds.Item[] {};
        fPHeapMin35.copia(itemArray36);
        ds.FPHeapMin fPHeapMin39 = new ds.FPHeapMin(100);
        ds.Item item40 = null;
        ds.Item[] itemArray41 = new ds.Item[] { item40 };
        fPHeapMin39.copia(itemArray41);
        fPHeapMin35.copia(itemArray41);
        fPHeapMin32.copia(itemArray41);
        fPHeapMin15.copia(itemArray41);
        fPHeapMin15.constroi();
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMin1.diminuiChave((int) (byte) 0, (java.lang.Object) fPHeapMin15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray2);
        org.junit.Assert.assertNotNull(itemArray7);
        org.junit.Assert.assertNull(item11);
        org.junit.Assert.assertNotNull(itemArray17);
        org.junit.Assert.assertNotNull(itemArray22);
        org.junit.Assert.assertNotNull(itemArray27);
        org.junit.Assert.assertNotNull(itemArray36);
        org.junit.Assert.assertNotNull(itemArray41);
    }

    @Test
    public void test034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test034");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin(100);
        ds.Item[] itemArray2 = new ds.Item[] {};
        fPHeapMin1.copia(itemArray2);
        ds.FPHeapMin fPHeapMin5 = new ds.FPHeapMin(100);
        ds.Item item6 = null;
        ds.Item[] itemArray7 = new ds.Item[] { item6 };
        fPHeapMin5.copia(itemArray7);
        fPHeapMin1.copia(itemArray7);
        fPHeapMin1.imprime();
        fPHeapMin1.constroi();
        ds.Item item12 = fPHeapMin1.min();
        fPHeapMin1.imprime();
        org.junit.Assert.assertNotNull(itemArray2);
        org.junit.Assert.assertNotNull(itemArray7);
        org.junit.Assert.assertNull(item12);
    }

    @Test
    public void test035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test035");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin(100);
        ds.Item[] itemArray2 = new ds.Item[] {};
        fPHeapMin1.copia(itemArray2);
        ds.FPHeapMin fPHeapMin5 = new ds.FPHeapMin(100);
        ds.Item[] itemArray6 = new ds.Item[] {};
        fPHeapMin5.copia(itemArray6);
        ds.FPHeapMin fPHeapMin9 = new ds.FPHeapMin(100);
        ds.Item item10 = null;
        ds.Item[] itemArray11 = new ds.Item[] { item10 };
        fPHeapMin9.copia(itemArray11);
        fPHeapMin5.copia(itemArray11);
        ds.FPHeapMin fPHeapMin14 = new ds.FPHeapMin(itemArray11);
        fPHeapMin1.copia(itemArray11);
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMin1.refaz((int) (byte) -1, (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray2);
        org.junit.Assert.assertNotNull(itemArray6);
        org.junit.Assert.assertNotNull(itemArray11);
    }

    @Test
    public void test036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test036");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin(100);
        ds.Item[] itemArray2 = new ds.Item[] {};
        fPHeapMin1.copia(itemArray2);
        java.lang.Class<?> wildcardClass4 = fPHeapMin1.getClass();
        org.junit.Assert.assertNotNull(itemArray2);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test037");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin((int) ' ');
        java.lang.Object obj3 = null;
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMin1.diminuiChave((int) (short) 100, obj3);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 100");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test038");
        ds.Item[] itemArray0 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin(itemArray0);
        ds.FPHeapMin fPHeapMin4 = new ds.FPHeapMin(100);
        fPHeapMin4.imprime();
        ds.FPHeapMin fPHeapMin7 = new ds.FPHeapMin(100);
        ds.Item[] itemArray8 = new ds.Item[] {};
        fPHeapMin7.copia(itemArray8);
        ds.FPHeapMin fPHeapMin11 = new ds.FPHeapMin(100);
        ds.Item item12 = null;
        ds.Item[] itemArray13 = new ds.Item[] { item12 };
        fPHeapMin11.copia(itemArray13);
        fPHeapMin7.copia(itemArray13);
        fPHeapMin4.copia(itemArray13);
        ds.FPHeapMin fPHeapMin17 = new ds.FPHeapMin(itemArray13);
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMin1.diminuiChave((int) 'a', (java.lang.Object) fPHeapMin17);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 97");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray0);
        org.junit.Assert.assertNotNull(itemArray8);
        org.junit.Assert.assertNotNull(itemArray13);
    }

    @Test
    public void test039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test039");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin(100);
        ds.Item item2 = null;
        ds.Item[] itemArray3 = new ds.Item[] { item2 };
        fPHeapMin1.copia(itemArray3);
        ds.FPHeapMin fPHeapMin6 = new ds.FPHeapMin(100);
        ds.Item item7 = null;
        ds.Item[] itemArray8 = new ds.Item[] { item7 };
        fPHeapMin6.copia(itemArray8);
        fPHeapMin6.imprime();
        ds.FPHeapMin fPHeapMin12 = new ds.FPHeapMin(100);
        ds.Item[] itemArray13 = new ds.Item[] {};
        fPHeapMin12.copia(itemArray13);
        ds.FPHeapMin fPHeapMin16 = new ds.FPHeapMin(100);
        ds.Item item17 = null;
        ds.Item[] itemArray18 = new ds.Item[] { item17 };
        fPHeapMin16.copia(itemArray18);
        fPHeapMin12.copia(itemArray18);
        fPHeapMin6.copia(itemArray18);
        ds.FPHeapMin fPHeapMin23 = new ds.FPHeapMin(100);
        ds.Item item24 = null;
        ds.Item[] itemArray25 = new ds.Item[] { item24 };
        fPHeapMin23.copia(itemArray25);
        fPHeapMin6.copia(itemArray25);
        fPHeapMin1.copia(itemArray25);
        ds.FPHeapMin fPHeapMin29 = new ds.FPHeapMin(itemArray25);
        // The following exception was thrown during execution in test generation
        try {
            ds.Item item30 = fPHeapMin29.retiraMin();
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: heap vazio");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertNotNull(itemArray8);
        org.junit.Assert.assertNotNull(itemArray13);
        org.junit.Assert.assertNotNull(itemArray18);
        org.junit.Assert.assertNotNull(itemArray25);
    }

    @Test
    public void test040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test040");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin(100);
        ds.Item item2 = null;
        ds.Item[] itemArray3 = new ds.Item[] { item2 };
        fPHeapMin1.copia(itemArray3);
        ds.FPHeapMin fPHeapMin6 = new ds.FPHeapMin(100);
        ds.Item item7 = null;
        ds.Item[] itemArray8 = new ds.Item[] { item7 };
        fPHeapMin6.copia(itemArray8);
        fPHeapMin6.imprime();
        ds.FPHeapMin fPHeapMin12 = new ds.FPHeapMin(100);
        ds.Item[] itemArray13 = new ds.Item[] {};
        fPHeapMin12.copia(itemArray13);
        ds.FPHeapMin fPHeapMin16 = new ds.FPHeapMin(100);
        ds.Item item17 = null;
        ds.Item[] itemArray18 = new ds.Item[] { item17 };
        fPHeapMin16.copia(itemArray18);
        fPHeapMin12.copia(itemArray18);
        fPHeapMin6.copia(itemArray18);
        ds.FPHeapMin fPHeapMin23 = new ds.FPHeapMin(100);
        ds.Item item24 = null;
        ds.Item[] itemArray25 = new ds.Item[] { item24 };
        fPHeapMin23.copia(itemArray25);
        fPHeapMin6.copia(itemArray25);
        fPHeapMin1.copia(itemArray25);
        ds.FPHeapMin fPHeapMin31 = new ds.FPHeapMin(100);
        ds.Item[] itemArray32 = new ds.Item[] {};
        fPHeapMin31.copia(itemArray32);
        ds.FPHeapMin fPHeapMin35 = new ds.FPHeapMin(100);
        ds.Item item36 = null;
        ds.Item[] itemArray37 = new ds.Item[] { item36 };
        fPHeapMin35.copia(itemArray37);
        fPHeapMin31.copia(itemArray37);
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMin1.diminuiChave((int) 'a', (java.lang.Object) itemArray37);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertNotNull(itemArray8);
        org.junit.Assert.assertNotNull(itemArray13);
        org.junit.Assert.assertNotNull(itemArray18);
        org.junit.Assert.assertNotNull(itemArray25);
        org.junit.Assert.assertNotNull(itemArray32);
        org.junit.Assert.assertNotNull(itemArray37);
    }

    @Test
    public void test041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test041");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin(100);
        ds.Item item2 = null;
        ds.Item[] itemArray3 = new ds.Item[] { item2 };
        fPHeapMin1.copia(itemArray3);
        fPHeapMin1.imprime();
        fPHeapMin1.constroi();
        fPHeapMin1.constroi();
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
    public void test042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test042");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin(100);
        ds.Item item2 = null;
        ds.Item[] itemArray3 = new ds.Item[] { item2 };
        fPHeapMin1.copia(itemArray3);
        fPHeapMin1.imprime();
        ds.FPHeapMin fPHeapMin7 = new ds.FPHeapMin(100);
        ds.Item[] itemArray8 = new ds.Item[] {};
        fPHeapMin7.copia(itemArray8);
        ds.FPHeapMin fPHeapMin11 = new ds.FPHeapMin(100);
        ds.Item item12 = null;
        ds.Item[] itemArray13 = new ds.Item[] { item12 };
        fPHeapMin11.copia(itemArray13);
        fPHeapMin7.copia(itemArray13);
        fPHeapMin1.copia(itemArray13);
        ds.FPHeapMin fPHeapMin18 = new ds.FPHeapMin(100);
        ds.Item item19 = null;
        ds.Item[] itemArray20 = new ds.Item[] { item19 };
        fPHeapMin18.copia(itemArray20);
        fPHeapMin1.copia(itemArray20);
        // The following exception was thrown during execution in test generation
        try {
            ds.Item item23 = fPHeapMin1.retiraMin();
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: heap vazio");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertNotNull(itemArray8);
        org.junit.Assert.assertNotNull(itemArray13);
        org.junit.Assert.assertNotNull(itemArray20);
    }

    @Test
    public void test043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test043");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin((int) ' ');
        ds.FPHeapMin fPHeapMin4 = new ds.FPHeapMin(100);
        ds.Item item5 = null;
        ds.Item[] itemArray6 = new ds.Item[] { item5 };
        fPHeapMin4.copia(itemArray6);
        fPHeapMin4.imprime();
        ds.FPHeapMin fPHeapMin10 = new ds.FPHeapMin(100);
        ds.Item[] itemArray11 = new ds.Item[] {};
        fPHeapMin10.copia(itemArray11);
        ds.FPHeapMin fPHeapMin14 = new ds.FPHeapMin(100);
        ds.Item item15 = null;
        ds.Item[] itemArray16 = new ds.Item[] { item15 };
        fPHeapMin14.copia(itemArray16);
        fPHeapMin10.copia(itemArray16);
        fPHeapMin4.copia(itemArray16);
        ds.FPHeapMin fPHeapMin21 = new ds.FPHeapMin(100);
        fPHeapMin21.imprime();
        ds.FPHeapMin fPHeapMin24 = new ds.FPHeapMin(100);
        ds.Item[] itemArray25 = new ds.Item[] {};
        fPHeapMin24.copia(itemArray25);
        ds.FPHeapMin fPHeapMin28 = new ds.FPHeapMin(100);
        ds.Item item29 = null;
        ds.Item[] itemArray30 = new ds.Item[] { item29 };
        fPHeapMin28.copia(itemArray30);
        fPHeapMin24.copia(itemArray30);
        fPHeapMin21.copia(itemArray30);
        fPHeapMin4.copia(itemArray30);
        ds.FPHeapMin fPHeapMin35 = new ds.FPHeapMin(itemArray30);
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMin1.diminuiChave(0, (java.lang.Object) fPHeapMin35);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray6);
        org.junit.Assert.assertNotNull(itemArray11);
        org.junit.Assert.assertNotNull(itemArray16);
        org.junit.Assert.assertNotNull(itemArray25);
        org.junit.Assert.assertNotNull(itemArray30);
    }

    @Test
    public void test044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test044");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin(100);
        ds.Item item2 = null;
        ds.Item[] itemArray3 = new ds.Item[] { item2 };
        fPHeapMin1.copia(itemArray3);
        fPHeapMin1.imprime();
        fPHeapMin1.imprime();
        fPHeapMin1.imprime();
        fPHeapMin1.constroi();
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMin1.diminuiChave((int) (short) 1, (java.lang.Object) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray3);
    }

    @Test
    public void test045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test045");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin(100);
        ds.Item item2 = null;
        ds.Item[] itemArray3 = new ds.Item[] { item2 };
        fPHeapMin1.copia(itemArray3);
        fPHeapMin1.imprime();
        ds.FPHeapMin fPHeapMin7 = new ds.FPHeapMin(100);
        ds.Item[] itemArray8 = new ds.Item[] {};
        fPHeapMin7.copia(itemArray8);
        ds.FPHeapMin fPHeapMin11 = new ds.FPHeapMin(100);
        ds.Item item12 = null;
        ds.Item[] itemArray13 = new ds.Item[] { item12 };
        fPHeapMin11.copia(itemArray13);
        fPHeapMin7.copia(itemArray13);
        fPHeapMin1.copia(itemArray13);
        ds.FPHeapMin fPHeapMin18 = new ds.FPHeapMin(100);
        fPHeapMin18.imprime();
        ds.FPHeapMin fPHeapMin21 = new ds.FPHeapMin(100);
        ds.Item[] itemArray22 = new ds.Item[] {};
        fPHeapMin21.copia(itemArray22);
        ds.FPHeapMin fPHeapMin25 = new ds.FPHeapMin(100);
        ds.Item item26 = null;
        ds.Item[] itemArray27 = new ds.Item[] { item26 };
        fPHeapMin25.copia(itemArray27);
        fPHeapMin21.copia(itemArray27);
        fPHeapMin18.copia(itemArray27);
        fPHeapMin1.copia(itemArray27);
        fPHeapMin1.constroi();
        fPHeapMin1.constroi();
        java.lang.Class<?> wildcardClass34 = fPHeapMin1.getClass();
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertNotNull(itemArray8);
        org.junit.Assert.assertNotNull(itemArray13);
        org.junit.Assert.assertNotNull(itemArray22);
        org.junit.Assert.assertNotNull(itemArray27);
        org.junit.Assert.assertNotNull(wildcardClass34);
    }

    @Test
    public void test046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test046");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin(100);
        ds.Item item2 = null;
        ds.Item[] itemArray3 = new ds.Item[] { item2 };
        fPHeapMin1.copia(itemArray3);
        fPHeapMin1.imprime();
        ds.Item item6 = fPHeapMin1.min();
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMin1.diminuiChave((int) 'a', (java.lang.Object) false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertNull(item6);
    }

    @Test
    public void test047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test047");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin(100);
        fPHeapMin1.imprime();
        ds.Item item3 = fPHeapMin1.min();
        ds.Item item4 = fPHeapMin1.min();
        fPHeapMin1.constroi();
        ds.Item item6 = null;
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMin1.insere(item6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(item3);
        org.junit.Assert.assertNull(item4);
    }

    @Test
    public void test048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test048");
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
    public void test049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test049");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin(0);
        fPHeapMin1.constroi();
        fPHeapMin1.constroi();
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMin1.refaz((int) '#', 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 35");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test050");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin(100);
        ds.Item[] itemArray2 = new ds.Item[] {};
        fPHeapMin1.copia(itemArray2);
        ds.FPHeapMin fPHeapMin5 = new ds.FPHeapMin(100);
        ds.Item item6 = null;
        ds.Item[] itemArray7 = new ds.Item[] { item6 };
        fPHeapMin5.copia(itemArray7);
        fPHeapMin1.copia(itemArray7);
        java.lang.Class<?> wildcardClass10 = itemArray7.getClass();
        org.junit.Assert.assertNotNull(itemArray2);
        org.junit.Assert.assertNotNull(itemArray7);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test051");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin(100);
        ds.Item item2 = null;
        ds.Item[] itemArray3 = new ds.Item[] { item2 };
        fPHeapMin1.copia(itemArray3);
        fPHeapMin1.imprime();
        ds.FPHeapMin fPHeapMin7 = new ds.FPHeapMin(100);
        ds.Item[] itemArray8 = new ds.Item[] {};
        fPHeapMin7.copia(itemArray8);
        ds.FPHeapMin fPHeapMin11 = new ds.FPHeapMin(100);
        ds.Item item12 = null;
        ds.Item[] itemArray13 = new ds.Item[] { item12 };
        fPHeapMin11.copia(itemArray13);
        fPHeapMin7.copia(itemArray13);
        fPHeapMin1.copia(itemArray13);
        ds.FPHeapMin fPHeapMin18 = new ds.FPHeapMin(100);
        fPHeapMin18.imprime();
        ds.FPHeapMin fPHeapMin21 = new ds.FPHeapMin(100);
        ds.Item[] itemArray22 = new ds.Item[] {};
        fPHeapMin21.copia(itemArray22);
        ds.FPHeapMin fPHeapMin25 = new ds.FPHeapMin(100);
        ds.Item item26 = null;
        ds.Item[] itemArray27 = new ds.Item[] { item26 };
        fPHeapMin25.copia(itemArray27);
        fPHeapMin21.copia(itemArray27);
        fPHeapMin18.copia(itemArray27);
        fPHeapMin1.copia(itemArray27);
        // The following exception was thrown during execution in test generation
        try {
            ds.Item item32 = fPHeapMin1.retiraMin();
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: heap vazio");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertNotNull(itemArray8);
        org.junit.Assert.assertNotNull(itemArray13);
        org.junit.Assert.assertNotNull(itemArray22);
        org.junit.Assert.assertNotNull(itemArray27);
    }

    @Test
    public void test052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test052");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin(100);
        ds.Item item2 = null;
        ds.Item[] itemArray3 = new ds.Item[] { item2 };
        fPHeapMin1.copia(itemArray3);
        fPHeapMin1.imprime();
        ds.FPHeapMin fPHeapMin7 = new ds.FPHeapMin(100);
        ds.Item[] itemArray8 = new ds.Item[] {};
        fPHeapMin7.copia(itemArray8);
        ds.FPHeapMin fPHeapMin11 = new ds.FPHeapMin(100);
        ds.Item item12 = null;
        ds.Item[] itemArray13 = new ds.Item[] { item12 };
        fPHeapMin11.copia(itemArray13);
        fPHeapMin7.copia(itemArray13);
        fPHeapMin1.copia(itemArray13);
        ds.FPHeapMin fPHeapMin18 = new ds.FPHeapMin(100);
        ds.Item item19 = null;
        ds.Item[] itemArray20 = new ds.Item[] { item19 };
        fPHeapMin18.copia(itemArray20);
        fPHeapMin1.copia(itemArray20);
        ds.Item item23 = fPHeapMin1.min();
        fPHeapMin1.imprime();
        fPHeapMin1.constroi();
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertNotNull(itemArray8);
        org.junit.Assert.assertNotNull(itemArray13);
        org.junit.Assert.assertNotNull(itemArray20);
        org.junit.Assert.assertNull(item23);
    }

    @Test
    public void test053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test053");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin(100);
        fPHeapMin1.imprime();
        ds.FPHeapMin fPHeapMin4 = new ds.FPHeapMin(100);
        ds.Item[] itemArray5 = new ds.Item[] {};
        fPHeapMin4.copia(itemArray5);
        ds.FPHeapMin fPHeapMin8 = new ds.FPHeapMin(100);
        ds.Item item9 = null;
        ds.Item[] itemArray10 = new ds.Item[] { item9 };
        fPHeapMin8.copia(itemArray10);
        fPHeapMin4.copia(itemArray10);
        fPHeapMin1.copia(itemArray10);
        ds.FPHeapMin fPHeapMin15 = new ds.FPHeapMin(100);
        ds.Item item16 = null;
        ds.Item[] itemArray17 = new ds.Item[] { item16 };
        fPHeapMin15.copia(itemArray17);
        fPHeapMin15.imprime();
        ds.FPHeapMin fPHeapMin21 = new ds.FPHeapMin(100);
        ds.Item[] itemArray22 = new ds.Item[] {};
        fPHeapMin21.copia(itemArray22);
        ds.FPHeapMin fPHeapMin25 = new ds.FPHeapMin(100);
        ds.Item item26 = null;
        ds.Item[] itemArray27 = new ds.Item[] { item26 };
        fPHeapMin25.copia(itemArray27);
        fPHeapMin21.copia(itemArray27);
        fPHeapMin15.copia(itemArray27);
        ds.FPHeapMin fPHeapMin31 = new ds.FPHeapMin(itemArray27);
        fPHeapMin1.copia(itemArray27);
        ds.FPHeapMin fPHeapMin33 = new ds.FPHeapMin(itemArray27);
        // The following exception was thrown during execution in test generation
        try {
            ds.Item item34 = fPHeapMin33.retiraMin();
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: heap vazio");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray5);
        org.junit.Assert.assertNotNull(itemArray10);
        org.junit.Assert.assertNotNull(itemArray17);
        org.junit.Assert.assertNotNull(itemArray22);
        org.junit.Assert.assertNotNull(itemArray27);
    }

    @Test
    public void test054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test054");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin(100);
        ds.Item[] itemArray2 = new ds.Item[] {};
        fPHeapMin1.copia(itemArray2);
        ds.FPHeapMin fPHeapMin5 = new ds.FPHeapMin(100);
        ds.Item item6 = null;
        ds.Item[] itemArray7 = new ds.Item[] { item6 };
        fPHeapMin5.copia(itemArray7);
        fPHeapMin1.copia(itemArray7);
        fPHeapMin1.imprime();
        fPHeapMin1.constroi();
        // The following exception was thrown during execution in test generation
        try {
            ds.Item item12 = fPHeapMin1.retiraMin();
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: heap vazio");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray2);
        org.junit.Assert.assertNotNull(itemArray7);
    }

    @Test
    public void test055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test055");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin(100);
        ds.Item item2 = null;
        ds.Item[] itemArray3 = new ds.Item[] { item2 };
        fPHeapMin1.copia(itemArray3);
        fPHeapMin1.imprime();
        ds.FPHeapMin fPHeapMin7 = new ds.FPHeapMin(100);
        ds.Item[] itemArray8 = new ds.Item[] {};
        fPHeapMin7.copia(itemArray8);
        ds.FPHeapMin fPHeapMin11 = new ds.FPHeapMin(100);
        ds.Item item12 = null;
        ds.Item[] itemArray13 = new ds.Item[] { item12 };
        fPHeapMin11.copia(itemArray13);
        fPHeapMin7.copia(itemArray13);
        fPHeapMin1.copia(itemArray13);
        ds.FPHeapMin fPHeapMin18 = new ds.FPHeapMin(100);
        fPHeapMin18.imprime();
        ds.FPHeapMin fPHeapMin21 = new ds.FPHeapMin(100);
        ds.Item[] itemArray22 = new ds.Item[] {};
        fPHeapMin21.copia(itemArray22);
        ds.FPHeapMin fPHeapMin25 = new ds.FPHeapMin(100);
        ds.Item item26 = null;
        ds.Item[] itemArray27 = new ds.Item[] { item26 };
        fPHeapMin25.copia(itemArray27);
        fPHeapMin21.copia(itemArray27);
        fPHeapMin18.copia(itemArray27);
        fPHeapMin1.copia(itemArray27);
        ds.FPHeapMin fPHeapMin33 = new ds.FPHeapMin(100);
        ds.Item item34 = null;
        ds.Item[] itemArray35 = new ds.Item[] { item34 };
        fPHeapMin33.copia(itemArray35);
        fPHeapMin33.imprime();
        ds.FPHeapMin fPHeapMin39 = new ds.FPHeapMin(100);
        ds.Item[] itemArray40 = new ds.Item[] {};
        fPHeapMin39.copia(itemArray40);
        ds.FPHeapMin fPHeapMin43 = new ds.FPHeapMin(100);
        ds.Item item44 = null;
        ds.Item[] itemArray45 = new ds.Item[] { item44 };
        fPHeapMin43.copia(itemArray45);
        fPHeapMin39.copia(itemArray45);
        fPHeapMin33.copia(itemArray45);
        ds.FPHeapMin fPHeapMin50 = new ds.FPHeapMin(100);
        fPHeapMin50.imprime();
        ds.FPHeapMin fPHeapMin53 = new ds.FPHeapMin(100);
        ds.Item[] itemArray54 = new ds.Item[] {};
        fPHeapMin53.copia(itemArray54);
        ds.FPHeapMin fPHeapMin57 = new ds.FPHeapMin(100);
        ds.Item item58 = null;
        ds.Item[] itemArray59 = new ds.Item[] { item58 };
        fPHeapMin57.copia(itemArray59);
        fPHeapMin53.copia(itemArray59);
        fPHeapMin50.copia(itemArray59);
        fPHeapMin33.copia(itemArray59);
        ds.FPHeapMin fPHeapMin64 = new ds.FPHeapMin(itemArray59);
        fPHeapMin1.copia(itemArray59);
        // The following exception was thrown during execution in test generation
        try {
            ds.Item item66 = fPHeapMin1.retiraMin();
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: heap vazio");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertNotNull(itemArray8);
        org.junit.Assert.assertNotNull(itemArray13);
        org.junit.Assert.assertNotNull(itemArray22);
        org.junit.Assert.assertNotNull(itemArray27);
        org.junit.Assert.assertNotNull(itemArray35);
        org.junit.Assert.assertNotNull(itemArray40);
        org.junit.Assert.assertNotNull(itemArray45);
        org.junit.Assert.assertNotNull(itemArray54);
        org.junit.Assert.assertNotNull(itemArray59);
    }

    @Test
    public void test056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test056");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin(100);
        ds.Item item2 = null;
        ds.Item[] itemArray3 = new ds.Item[] { item2 };
        fPHeapMin1.copia(itemArray3);
        fPHeapMin1.imprime();
        ds.FPHeapMin fPHeapMin7 = new ds.FPHeapMin(100);
        ds.Item[] itemArray8 = new ds.Item[] {};
        fPHeapMin7.copia(itemArray8);
        ds.FPHeapMin fPHeapMin11 = new ds.FPHeapMin(100);
        ds.Item item12 = null;
        ds.Item[] itemArray13 = new ds.Item[] { item12 };
        fPHeapMin11.copia(itemArray13);
        fPHeapMin7.copia(itemArray13);
        fPHeapMin1.copia(itemArray13);
        ds.FPHeapMin fPHeapMin18 = new ds.FPHeapMin(100);
        ds.Item item19 = null;
        ds.Item[] itemArray20 = new ds.Item[] { item19 };
        fPHeapMin18.copia(itemArray20);
        fPHeapMin1.copia(itemArray20);
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMin1.refaz((int) (byte) 0, (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertNotNull(itemArray8);
        org.junit.Assert.assertNotNull(itemArray13);
        org.junit.Assert.assertNotNull(itemArray20);
    }

    @Test
    public void test057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test057");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin(100);
        ds.Item item2 = null;
        ds.Item[] itemArray3 = new ds.Item[] { item2 };
        fPHeapMin1.copia(itemArray3);
        fPHeapMin1.imprime();
        ds.FPHeapMin fPHeapMin7 = new ds.FPHeapMin(100);
        ds.Item[] itemArray8 = new ds.Item[] {};
        fPHeapMin7.copia(itemArray8);
        ds.FPHeapMin fPHeapMin11 = new ds.FPHeapMin(100);
        ds.Item item12 = null;
        ds.Item[] itemArray13 = new ds.Item[] { item12 };
        fPHeapMin11.copia(itemArray13);
        fPHeapMin7.copia(itemArray13);
        fPHeapMin1.copia(itemArray13);
        ds.FPHeapMin fPHeapMin18 = new ds.FPHeapMin(100);
        ds.Item item19 = null;
        ds.Item[] itemArray20 = new ds.Item[] { item19 };
        fPHeapMin18.copia(itemArray20);
        fPHeapMin1.copia(itemArray20);
        fPHeapMin1.imprime();
        ds.Item item24 = fPHeapMin1.min();
        ds.Item item25 = fPHeapMin1.min();
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertNotNull(itemArray8);
        org.junit.Assert.assertNotNull(itemArray13);
        org.junit.Assert.assertNotNull(itemArray20);
        org.junit.Assert.assertNull(item24);
        org.junit.Assert.assertNull(item25);
    }

    @Test
    public void test058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test058");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin(100);
        ds.Item item2 = null;
        ds.Item[] itemArray3 = new ds.Item[] { item2 };
        fPHeapMin1.copia(itemArray3);
        fPHeapMin1.imprime();
        ds.FPHeapMin fPHeapMin7 = new ds.FPHeapMin(100);
        ds.Item[] itemArray8 = new ds.Item[] {};
        fPHeapMin7.copia(itemArray8);
        ds.FPHeapMin fPHeapMin11 = new ds.FPHeapMin(100);
        ds.Item item12 = null;
        ds.Item[] itemArray13 = new ds.Item[] { item12 };
        fPHeapMin11.copia(itemArray13);
        fPHeapMin7.copia(itemArray13);
        fPHeapMin1.copia(itemArray13);
        ds.FPHeapMin fPHeapMin18 = new ds.FPHeapMin(100);
        fPHeapMin18.imprime();
        ds.FPHeapMin fPHeapMin21 = new ds.FPHeapMin(100);
        ds.Item[] itemArray22 = new ds.Item[] {};
        fPHeapMin21.copia(itemArray22);
        ds.FPHeapMin fPHeapMin25 = new ds.FPHeapMin(100);
        ds.Item item26 = null;
        ds.Item[] itemArray27 = new ds.Item[] { item26 };
        fPHeapMin25.copia(itemArray27);
        fPHeapMin21.copia(itemArray27);
        fPHeapMin18.copia(itemArray27);
        fPHeapMin1.copia(itemArray27);
        ds.Item item32 = fPHeapMin1.min();
        ds.Item item33 = null;
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMin1.insere(item33);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertNotNull(itemArray8);
        org.junit.Assert.assertNotNull(itemArray13);
        org.junit.Assert.assertNotNull(itemArray22);
        org.junit.Assert.assertNotNull(itemArray27);
        org.junit.Assert.assertNull(item32);
    }

    @Test
    public void test059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test059");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin(100);
        ds.Item item2 = null;
        ds.Item[] itemArray3 = new ds.Item[] { item2 };
        fPHeapMin1.copia(itemArray3);
        fPHeapMin1.imprime();
        ds.FPHeapMin fPHeapMin7 = new ds.FPHeapMin(100);
        ds.Item[] itemArray8 = new ds.Item[] {};
        fPHeapMin7.copia(itemArray8);
        ds.FPHeapMin fPHeapMin11 = new ds.FPHeapMin(100);
        ds.Item item12 = null;
        ds.Item[] itemArray13 = new ds.Item[] { item12 };
        fPHeapMin11.copia(itemArray13);
        fPHeapMin7.copia(itemArray13);
        fPHeapMin1.copia(itemArray13);
        ds.FPHeapMin fPHeapMin18 = new ds.FPHeapMin(100);
        fPHeapMin18.imprime();
        ds.FPHeapMin fPHeapMin21 = new ds.FPHeapMin(100);
        ds.Item[] itemArray22 = new ds.Item[] {};
        fPHeapMin21.copia(itemArray22);
        ds.FPHeapMin fPHeapMin25 = new ds.FPHeapMin(100);
        ds.Item item26 = null;
        ds.Item[] itemArray27 = new ds.Item[] { item26 };
        fPHeapMin25.copia(itemArray27);
        fPHeapMin21.copia(itemArray27);
        fPHeapMin18.copia(itemArray27);
        fPHeapMin1.copia(itemArray27);
        ds.FPHeapMin fPHeapMin33 = new ds.FPHeapMin(100);
        ds.Item item34 = null;
        ds.Item[] itemArray35 = new ds.Item[] { item34 };
        fPHeapMin33.copia(itemArray35);
        fPHeapMin33.imprime();
        ds.FPHeapMin fPHeapMin39 = new ds.FPHeapMin(100);
        ds.Item[] itemArray40 = new ds.Item[] {};
        fPHeapMin39.copia(itemArray40);
        ds.FPHeapMin fPHeapMin43 = new ds.FPHeapMin(100);
        ds.Item item44 = null;
        ds.Item[] itemArray45 = new ds.Item[] { item44 };
        fPHeapMin43.copia(itemArray45);
        fPHeapMin39.copia(itemArray45);
        fPHeapMin33.copia(itemArray45);
        ds.FPHeapMin fPHeapMin50 = new ds.FPHeapMin(100);
        fPHeapMin50.imprime();
        ds.FPHeapMin fPHeapMin53 = new ds.FPHeapMin(100);
        ds.Item[] itemArray54 = new ds.Item[] {};
        fPHeapMin53.copia(itemArray54);
        ds.FPHeapMin fPHeapMin57 = new ds.FPHeapMin(100);
        ds.Item item58 = null;
        ds.Item[] itemArray59 = new ds.Item[] { item58 };
        fPHeapMin57.copia(itemArray59);
        fPHeapMin53.copia(itemArray59);
        fPHeapMin50.copia(itemArray59);
        fPHeapMin33.copia(itemArray59);
        ds.FPHeapMin fPHeapMin64 = new ds.FPHeapMin(itemArray59);
        fPHeapMin1.copia(itemArray59);
        java.lang.Class<?> wildcardClass66 = fPHeapMin1.getClass();
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertNotNull(itemArray8);
        org.junit.Assert.assertNotNull(itemArray13);
        org.junit.Assert.assertNotNull(itemArray22);
        org.junit.Assert.assertNotNull(itemArray27);
        org.junit.Assert.assertNotNull(itemArray35);
        org.junit.Assert.assertNotNull(itemArray40);
        org.junit.Assert.assertNotNull(itemArray45);
        org.junit.Assert.assertNotNull(itemArray54);
        org.junit.Assert.assertNotNull(itemArray59);
        org.junit.Assert.assertNotNull(wildcardClass66);
    }

    @Test
    public void test060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test060");
        ds.Item[] itemArray0 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin(itemArray0);
        java.lang.Class<?> wildcardClass2 = itemArray0.getClass();
        org.junit.Assert.assertNotNull(itemArray0);
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test061");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin(100);
        ds.Item item2 = null;
        ds.Item[] itemArray3 = new ds.Item[] { item2 };
        fPHeapMin1.copia(itemArray3);
        fPHeapMin1.imprime();
        ds.FPHeapMin fPHeapMin7 = new ds.FPHeapMin(100);
        ds.Item[] itemArray8 = new ds.Item[] {};
        fPHeapMin7.copia(itemArray8);
        ds.FPHeapMin fPHeapMin11 = new ds.FPHeapMin(100);
        ds.Item item12 = null;
        ds.Item[] itemArray13 = new ds.Item[] { item12 };
        fPHeapMin11.copia(itemArray13);
        fPHeapMin7.copia(itemArray13);
        fPHeapMin1.copia(itemArray13);
        ds.FPHeapMin fPHeapMin17 = new ds.FPHeapMin(itemArray13);
        fPHeapMin17.imprime();
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertNotNull(itemArray8);
        org.junit.Assert.assertNotNull(itemArray13);
    }

    @Test
    public void test062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test062");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin(100);
        ds.Item item2 = null;
        ds.Item[] itemArray3 = new ds.Item[] { item2 };
        fPHeapMin1.copia(itemArray3);
        fPHeapMin1.imprime();
        fPHeapMin1.imprime();
        fPHeapMin1.imprime();
        fPHeapMin1.constroi();
        java.lang.Class<?> wildcardClass9 = fPHeapMin1.getClass();
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test063");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin(100);
        fPHeapMin1.constroi();
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMin1.refaz((int) (short) -1, (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test064");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin(100);
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
    public void test065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test065");
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
    public void test066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test066");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin(100);
        fPHeapMin1.imprime();
        ds.FPHeapMin fPHeapMin4 = new ds.FPHeapMin(100);
        ds.Item[] itemArray5 = new ds.Item[] {};
        fPHeapMin4.copia(itemArray5);
        ds.FPHeapMin fPHeapMin8 = new ds.FPHeapMin(100);
        ds.Item item9 = null;
        ds.Item[] itemArray10 = new ds.Item[] { item9 };
        fPHeapMin8.copia(itemArray10);
        fPHeapMin4.copia(itemArray10);
        fPHeapMin1.copia(itemArray10);
        ds.FPHeapMin fPHeapMin14 = new ds.FPHeapMin(itemArray10);
        ds.FPHeapMin fPHeapMin15 = new ds.FPHeapMin(itemArray10);
        java.lang.Class<?> wildcardClass16 = fPHeapMin15.getClass();
        org.junit.Assert.assertNotNull(itemArray5);
        org.junit.Assert.assertNotNull(itemArray10);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test067");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin(100);
        ds.Item item2 = null;
        ds.Item[] itemArray3 = new ds.Item[] { item2 };
        fPHeapMin1.copia(itemArray3);
        fPHeapMin1.imprime();
        ds.FPHeapMin fPHeapMin7 = new ds.FPHeapMin(100);
        ds.Item[] itemArray8 = new ds.Item[] {};
        fPHeapMin7.copia(itemArray8);
        ds.FPHeapMin fPHeapMin11 = new ds.FPHeapMin(100);
        ds.Item item12 = null;
        ds.Item[] itemArray13 = new ds.Item[] { item12 };
        fPHeapMin11.copia(itemArray13);
        fPHeapMin7.copia(itemArray13);
        fPHeapMin1.copia(itemArray13);
        ds.FPHeapMin fPHeapMin18 = new ds.FPHeapMin(100);
        fPHeapMin18.imprime();
        ds.FPHeapMin fPHeapMin21 = new ds.FPHeapMin(100);
        ds.Item[] itemArray22 = new ds.Item[] {};
        fPHeapMin21.copia(itemArray22);
        ds.FPHeapMin fPHeapMin25 = new ds.FPHeapMin(100);
        ds.Item item26 = null;
        ds.Item[] itemArray27 = new ds.Item[] { item26 };
        fPHeapMin25.copia(itemArray27);
        fPHeapMin21.copia(itemArray27);
        fPHeapMin18.copia(itemArray27);
        fPHeapMin1.copia(itemArray27);
        ds.FPHeapMin fPHeapMin32 = new ds.FPHeapMin(itemArray27);
        ds.Item item33 = null;
        ds.Item[] itemArray34 = new ds.Item[] { item33 };
        fPHeapMin32.copia(itemArray34);
        ds.FPHeapMin fPHeapMin37 = new ds.FPHeapMin(100);
        fPHeapMin37.imprime();
        ds.FPHeapMin fPHeapMin40 = new ds.FPHeapMin(100);
        ds.Item[] itemArray41 = new ds.Item[] {};
        fPHeapMin40.copia(itemArray41);
        ds.FPHeapMin fPHeapMin44 = new ds.FPHeapMin(100);
        ds.Item item45 = null;
        ds.Item[] itemArray46 = new ds.Item[] { item45 };
        fPHeapMin44.copia(itemArray46);
        fPHeapMin40.copia(itemArray46);
        fPHeapMin37.copia(itemArray46);
        ds.FPHeapMin fPHeapMin50 = new ds.FPHeapMin(itemArray46);
        ds.FPHeapMin fPHeapMin51 = new ds.FPHeapMin(itemArray46);
        fPHeapMin32.copia(itemArray46);
        ds.FPHeapMin fPHeapMin55 = new ds.FPHeapMin(100);
        ds.Item item56 = null;
        ds.Item[] itemArray57 = new ds.Item[] { item56 };
        fPHeapMin55.copia(itemArray57);
        fPHeapMin55.imprime();
        fPHeapMin55.constroi();
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMin32.diminuiChave((int) (byte) 100, (java.lang.Object) fPHeapMin55);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 100");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertNotNull(itemArray8);
        org.junit.Assert.assertNotNull(itemArray13);
        org.junit.Assert.assertNotNull(itemArray22);
        org.junit.Assert.assertNotNull(itemArray27);
        org.junit.Assert.assertNotNull(itemArray34);
        org.junit.Assert.assertNotNull(itemArray41);
        org.junit.Assert.assertNotNull(itemArray46);
        org.junit.Assert.assertNotNull(itemArray57);
    }

    @Test
    public void test068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test068");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin(100);
        ds.Item item2 = null;
        ds.Item[] itemArray3 = new ds.Item[] { item2 };
        fPHeapMin1.copia(itemArray3);
        fPHeapMin1.imprime();
        ds.FPHeapMin fPHeapMin7 = new ds.FPHeapMin(100);
        ds.Item[] itemArray8 = new ds.Item[] {};
        fPHeapMin7.copia(itemArray8);
        ds.FPHeapMin fPHeapMin11 = new ds.FPHeapMin(100);
        ds.Item item12 = null;
        ds.Item[] itemArray13 = new ds.Item[] { item12 };
        fPHeapMin11.copia(itemArray13);
        fPHeapMin7.copia(itemArray13);
        fPHeapMin1.copia(itemArray13);
        ds.FPHeapMin fPHeapMin18 = new ds.FPHeapMin(100);
        fPHeapMin18.imprime();
        ds.FPHeapMin fPHeapMin21 = new ds.FPHeapMin(100);
        ds.Item[] itemArray22 = new ds.Item[] {};
        fPHeapMin21.copia(itemArray22);
        ds.FPHeapMin fPHeapMin25 = new ds.FPHeapMin(100);
        ds.Item item26 = null;
        ds.Item[] itemArray27 = new ds.Item[] { item26 };
        fPHeapMin25.copia(itemArray27);
        fPHeapMin21.copia(itemArray27);
        fPHeapMin18.copia(itemArray27);
        fPHeapMin1.copia(itemArray27);
        ds.FPHeapMin fPHeapMin32 = new ds.FPHeapMin(itemArray27);
        ds.Item item33 = null;
        ds.Item[] itemArray34 = new ds.Item[] { item33 };
        fPHeapMin32.copia(itemArray34);
        ds.FPHeapMin fPHeapMin37 = new ds.FPHeapMin(100);
        fPHeapMin37.imprime();
        ds.FPHeapMin fPHeapMin40 = new ds.FPHeapMin(100);
        ds.Item[] itemArray41 = new ds.Item[] {};
        fPHeapMin40.copia(itemArray41);
        ds.FPHeapMin fPHeapMin44 = new ds.FPHeapMin(100);
        ds.Item item45 = null;
        ds.Item[] itemArray46 = new ds.Item[] { item45 };
        fPHeapMin44.copia(itemArray46);
        fPHeapMin40.copia(itemArray46);
        fPHeapMin37.copia(itemArray46);
        ds.FPHeapMin fPHeapMin50 = new ds.FPHeapMin(itemArray46);
        ds.FPHeapMin fPHeapMin51 = new ds.FPHeapMin(itemArray46);
        fPHeapMin32.copia(itemArray46);
        ds.Item item53 = null;
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMin32.insere(item53);
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: heap cheio");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertNotNull(itemArray8);
        org.junit.Assert.assertNotNull(itemArray13);
        org.junit.Assert.assertNotNull(itemArray22);
        org.junit.Assert.assertNotNull(itemArray27);
        org.junit.Assert.assertNotNull(itemArray34);
        org.junit.Assert.assertNotNull(itemArray41);
        org.junit.Assert.assertNotNull(itemArray46);
    }

    @Test
    public void test069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test069");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin(100);
        ds.Item[] itemArray2 = new ds.Item[] {};
        fPHeapMin1.copia(itemArray2);
        ds.FPHeapMin fPHeapMin5 = new ds.FPHeapMin(100);
        ds.Item item6 = null;
        ds.Item[] itemArray7 = new ds.Item[] { item6 };
        fPHeapMin5.copia(itemArray7);
        fPHeapMin1.copia(itemArray7);
        fPHeapMin1.imprime();
        java.lang.Class<?> wildcardClass11 = fPHeapMin1.getClass();
        org.junit.Assert.assertNotNull(itemArray2);
        org.junit.Assert.assertNotNull(itemArray7);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test070");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin(100);
        fPHeapMin1.imprime();
        ds.FPHeapMin fPHeapMin4 = new ds.FPHeapMin(100);
        ds.Item[] itemArray5 = new ds.Item[] {};
        fPHeapMin4.copia(itemArray5);
        ds.FPHeapMin fPHeapMin8 = new ds.FPHeapMin(100);
        ds.Item item9 = null;
        ds.Item[] itemArray10 = new ds.Item[] { item9 };
        fPHeapMin8.copia(itemArray10);
        fPHeapMin4.copia(itemArray10);
        fPHeapMin1.copia(itemArray10);
        ds.FPHeapMin fPHeapMin15 = new ds.FPHeapMin(100);
        ds.Item item16 = null;
        ds.Item[] itemArray17 = new ds.Item[] { item16 };
        fPHeapMin15.copia(itemArray17);
        fPHeapMin15.imprime();
        ds.FPHeapMin fPHeapMin21 = new ds.FPHeapMin(100);
        ds.Item[] itemArray22 = new ds.Item[] {};
        fPHeapMin21.copia(itemArray22);
        ds.FPHeapMin fPHeapMin25 = new ds.FPHeapMin(100);
        ds.Item item26 = null;
        ds.Item[] itemArray27 = new ds.Item[] { item26 };
        fPHeapMin25.copia(itemArray27);
        fPHeapMin21.copia(itemArray27);
        fPHeapMin15.copia(itemArray27);
        ds.FPHeapMin fPHeapMin31 = new ds.FPHeapMin(itemArray27);
        fPHeapMin1.copia(itemArray27);
        ds.FPHeapMin fPHeapMin33 = new ds.FPHeapMin(itemArray27);
        ds.Item item34 = null;
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMin33.insere(item34);
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: heap cheio");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray5);
        org.junit.Assert.assertNotNull(itemArray10);
        org.junit.Assert.assertNotNull(itemArray17);
        org.junit.Assert.assertNotNull(itemArray22);
        org.junit.Assert.assertNotNull(itemArray27);
    }

    @Test
    public void test071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test071");
        ds.Item[] itemArray0 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin(itemArray0);
        ds.FPHeapMin fPHeapMin3 = new ds.FPHeapMin(100);
        ds.Item item4 = null;
        ds.Item[] itemArray5 = new ds.Item[] { item4 };
        fPHeapMin3.copia(itemArray5);
        ds.FPHeapMin fPHeapMin8 = new ds.FPHeapMin(100);
        ds.Item item9 = null;
        ds.Item[] itemArray10 = new ds.Item[] { item9 };
        fPHeapMin8.copia(itemArray10);
        fPHeapMin8.imprime();
        ds.FPHeapMin fPHeapMin14 = new ds.FPHeapMin(100);
        ds.Item[] itemArray15 = new ds.Item[] {};
        fPHeapMin14.copia(itemArray15);
        ds.FPHeapMin fPHeapMin18 = new ds.FPHeapMin(100);
        ds.Item item19 = null;
        ds.Item[] itemArray20 = new ds.Item[] { item19 };
        fPHeapMin18.copia(itemArray20);
        fPHeapMin14.copia(itemArray20);
        fPHeapMin8.copia(itemArray20);
        ds.FPHeapMin fPHeapMin25 = new ds.FPHeapMin(100);
        ds.Item item26 = null;
        ds.Item[] itemArray27 = new ds.Item[] { item26 };
        fPHeapMin25.copia(itemArray27);
        fPHeapMin8.copia(itemArray27);
        fPHeapMin3.copia(itemArray27);
        ds.FPHeapMin fPHeapMin31 = new ds.FPHeapMin(itemArray27);
        fPHeapMin1.copia(itemArray27);
        fPHeapMin1.constroi();
        org.junit.Assert.assertNotNull(itemArray0);
        org.junit.Assert.assertNotNull(itemArray5);
        org.junit.Assert.assertNotNull(itemArray10);
        org.junit.Assert.assertNotNull(itemArray15);
        org.junit.Assert.assertNotNull(itemArray20);
        org.junit.Assert.assertNotNull(itemArray27);
    }

    @Test
    public void test072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test072");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin(100);
        ds.Item item2 = null;
        ds.Item[] itemArray3 = new ds.Item[] { item2 };
        fPHeapMin1.copia(itemArray3);
        ds.FPHeapMin fPHeapMin6 = new ds.FPHeapMin(100);
        ds.Item item7 = null;
        ds.Item[] itemArray8 = new ds.Item[] { item7 };
        fPHeapMin6.copia(itemArray8);
        fPHeapMin6.imprime();
        ds.FPHeapMin fPHeapMin12 = new ds.FPHeapMin(100);
        ds.Item[] itemArray13 = new ds.Item[] {};
        fPHeapMin12.copia(itemArray13);
        ds.FPHeapMin fPHeapMin16 = new ds.FPHeapMin(100);
        ds.Item item17 = null;
        ds.Item[] itemArray18 = new ds.Item[] { item17 };
        fPHeapMin16.copia(itemArray18);
        fPHeapMin12.copia(itemArray18);
        fPHeapMin6.copia(itemArray18);
        ds.FPHeapMin fPHeapMin23 = new ds.FPHeapMin(100);
        ds.Item item24 = null;
        ds.Item[] itemArray25 = new ds.Item[] { item24 };
        fPHeapMin23.copia(itemArray25);
        fPHeapMin6.copia(itemArray25);
        fPHeapMin1.copia(itemArray25);
        ds.FPHeapMin fPHeapMin29 = new ds.FPHeapMin(itemArray25);
        ds.FPHeapMin fPHeapMin30 = new ds.FPHeapMin(itemArray25);
        ds.FPHeapMin fPHeapMin32 = new ds.FPHeapMin(100);
        ds.Item[] itemArray33 = new ds.Item[] {};
        fPHeapMin32.copia(itemArray33);
        fPHeapMin30.copia(itemArray33);
        ds.Item item36 = null;
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMin30.insere(item36);
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: heap cheio");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertNotNull(itemArray8);
        org.junit.Assert.assertNotNull(itemArray13);
        org.junit.Assert.assertNotNull(itemArray18);
        org.junit.Assert.assertNotNull(itemArray25);
        org.junit.Assert.assertNotNull(itemArray33);
    }

    @Test
    public void test073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test073");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin(100);
        ds.Item item2 = null;
        ds.Item[] itemArray3 = new ds.Item[] { item2 };
        fPHeapMin1.copia(itemArray3);
        fPHeapMin1.imprime();
        ds.FPHeapMin fPHeapMin7 = new ds.FPHeapMin(100);
        ds.Item[] itemArray8 = new ds.Item[] {};
        fPHeapMin7.copia(itemArray8);
        ds.FPHeapMin fPHeapMin11 = new ds.FPHeapMin(100);
        ds.Item item12 = null;
        ds.Item[] itemArray13 = new ds.Item[] { item12 };
        fPHeapMin11.copia(itemArray13);
        fPHeapMin7.copia(itemArray13);
        fPHeapMin1.copia(itemArray13);
        ds.FPHeapMin fPHeapMin18 = new ds.FPHeapMin(100);
        fPHeapMin18.imprime();
        ds.FPHeapMin fPHeapMin21 = new ds.FPHeapMin(100);
        ds.Item[] itemArray22 = new ds.Item[] {};
        fPHeapMin21.copia(itemArray22);
        ds.FPHeapMin fPHeapMin25 = new ds.FPHeapMin(100);
        ds.Item item26 = null;
        ds.Item[] itemArray27 = new ds.Item[] { item26 };
        fPHeapMin25.copia(itemArray27);
        fPHeapMin21.copia(itemArray27);
        fPHeapMin18.copia(itemArray27);
        fPHeapMin1.copia(itemArray27);
        ds.FPHeapMin fPHeapMin32 = new ds.FPHeapMin(itemArray27);
        ds.Item item33 = null;
        ds.Item[] itemArray34 = new ds.Item[] { item33 };
        fPHeapMin32.copia(itemArray34);
        ds.Item item36 = null;
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMin32.insere(item36);
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: heap cheio");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertNotNull(itemArray8);
        org.junit.Assert.assertNotNull(itemArray13);
        org.junit.Assert.assertNotNull(itemArray22);
        org.junit.Assert.assertNotNull(itemArray27);
        org.junit.Assert.assertNotNull(itemArray34);
    }

    @Test
    public void test074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test074");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin(100);
        ds.Item item2 = null;
        ds.Item[] itemArray3 = new ds.Item[] { item2 };
        fPHeapMin1.copia(itemArray3);
        fPHeapMin1.imprime();
        fPHeapMin1.constroi();
        fPHeapMin1.constroi();
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
    public void test075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test075");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin(100);
        ds.FPHeapMin fPHeapMin4 = new ds.FPHeapMin(100);
        ds.Item item5 = null;
        ds.Item[] itemArray6 = new ds.Item[] { item5 };
        fPHeapMin4.copia(itemArray6);
        fPHeapMin4.imprime();
        ds.FPHeapMin fPHeapMin10 = new ds.FPHeapMin(100);
        ds.Item[] itemArray11 = new ds.Item[] {};
        fPHeapMin10.copia(itemArray11);
        ds.FPHeapMin fPHeapMin14 = new ds.FPHeapMin(100);
        ds.Item item15 = null;
        ds.Item[] itemArray16 = new ds.Item[] { item15 };
        fPHeapMin14.copia(itemArray16);
        fPHeapMin10.copia(itemArray16);
        fPHeapMin4.copia(itemArray16);
        ds.FPHeapMin fPHeapMin21 = new ds.FPHeapMin(100);
        ds.Item item22 = null;
        ds.Item[] itemArray23 = new ds.Item[] { item22 };
        fPHeapMin21.copia(itemArray23);
        fPHeapMin4.copia(itemArray23);
        ds.FPHeapMin fPHeapMin26 = new ds.FPHeapMin(itemArray23);
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMin1.diminuiChave((int) (byte) 100, (java.lang.Object) itemArray23);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray6);
        org.junit.Assert.assertNotNull(itemArray11);
        org.junit.Assert.assertNotNull(itemArray16);
        org.junit.Assert.assertNotNull(itemArray23);
    }

    @Test
    public void test076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test076");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin(100);
        ds.Item item2 = null;
        ds.Item[] itemArray3 = new ds.Item[] { item2 };
        fPHeapMin1.copia(itemArray3);
        java.lang.Class<?> wildcardClass5 = fPHeapMin1.getClass();
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test077");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin(100);
        ds.Item item2 = null;
        ds.Item[] itemArray3 = new ds.Item[] { item2 };
        fPHeapMin1.copia(itemArray3);
        fPHeapMin1.imprime();
        ds.FPHeapMin fPHeapMin7 = new ds.FPHeapMin(100);
        ds.Item item8 = null;
        ds.Item[] itemArray9 = new ds.Item[] { item8 };
        fPHeapMin7.copia(itemArray9);
        fPHeapMin7.imprime();
        ds.FPHeapMin fPHeapMin13 = new ds.FPHeapMin(100);
        ds.Item[] itemArray14 = new ds.Item[] {};
        fPHeapMin13.copia(itemArray14);
        ds.FPHeapMin fPHeapMin17 = new ds.FPHeapMin(100);
        ds.Item item18 = null;
        ds.Item[] itemArray19 = new ds.Item[] { item18 };
        fPHeapMin17.copia(itemArray19);
        fPHeapMin13.copia(itemArray19);
        fPHeapMin7.copia(itemArray19);
        ds.FPHeapMin fPHeapMin24 = new ds.FPHeapMin(100);
        fPHeapMin24.imprime();
        ds.FPHeapMin fPHeapMin27 = new ds.FPHeapMin(100);
        ds.Item[] itemArray28 = new ds.Item[] {};
        fPHeapMin27.copia(itemArray28);
        ds.FPHeapMin fPHeapMin31 = new ds.FPHeapMin(100);
        ds.Item item32 = null;
        ds.Item[] itemArray33 = new ds.Item[] { item32 };
        fPHeapMin31.copia(itemArray33);
        fPHeapMin27.copia(itemArray33);
        fPHeapMin24.copia(itemArray33);
        fPHeapMin7.copia(itemArray33);
        ds.FPHeapMin fPHeapMin39 = new ds.FPHeapMin(100);
        ds.Item item40 = null;
        ds.Item[] itemArray41 = new ds.Item[] { item40 };
        fPHeapMin39.copia(itemArray41);
        fPHeapMin39.imprime();
        ds.FPHeapMin fPHeapMin45 = new ds.FPHeapMin(100);
        ds.Item[] itemArray46 = new ds.Item[] {};
        fPHeapMin45.copia(itemArray46);
        ds.FPHeapMin fPHeapMin49 = new ds.FPHeapMin(100);
        ds.Item item50 = null;
        ds.Item[] itemArray51 = new ds.Item[] { item50 };
        fPHeapMin49.copia(itemArray51);
        fPHeapMin45.copia(itemArray51);
        fPHeapMin39.copia(itemArray51);
        ds.FPHeapMin fPHeapMin56 = new ds.FPHeapMin(100);
        fPHeapMin56.imprime();
        ds.FPHeapMin fPHeapMin59 = new ds.FPHeapMin(100);
        ds.Item[] itemArray60 = new ds.Item[] {};
        fPHeapMin59.copia(itemArray60);
        ds.FPHeapMin fPHeapMin63 = new ds.FPHeapMin(100);
        ds.Item item64 = null;
        ds.Item[] itemArray65 = new ds.Item[] { item64 };
        fPHeapMin63.copia(itemArray65);
        fPHeapMin59.copia(itemArray65);
        fPHeapMin56.copia(itemArray65);
        fPHeapMin39.copia(itemArray65);
        ds.FPHeapMin fPHeapMin70 = new ds.FPHeapMin(itemArray65);
        fPHeapMin7.copia(itemArray65);
        fPHeapMin1.copia(itemArray65);
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertNotNull(itemArray9);
        org.junit.Assert.assertNotNull(itemArray14);
        org.junit.Assert.assertNotNull(itemArray19);
        org.junit.Assert.assertNotNull(itemArray28);
        org.junit.Assert.assertNotNull(itemArray33);
        org.junit.Assert.assertNotNull(itemArray41);
        org.junit.Assert.assertNotNull(itemArray46);
        org.junit.Assert.assertNotNull(itemArray51);
        org.junit.Assert.assertNotNull(itemArray60);
        org.junit.Assert.assertNotNull(itemArray65);
    }

    @Test
    public void test078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test078");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin(100);
        ds.Item item2 = null;
        ds.Item[] itemArray3 = new ds.Item[] { item2 };
        fPHeapMin1.copia(itemArray3);
        fPHeapMin1.imprime();
        java.lang.Class<?> wildcardClass6 = fPHeapMin1.getClass();
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test079");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin(0);
        fPHeapMin1.constroi();
        fPHeapMin1.constroi();
        fPHeapMin1.imprime();
    }

    @Test
    public void test080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test080");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin(100);
        ds.Item item2 = null;
        ds.Item[] itemArray3 = new ds.Item[] { item2 };
        fPHeapMin1.copia(itemArray3);
        fPHeapMin1.imprime();
        ds.FPHeapMin fPHeapMin7 = new ds.FPHeapMin(100);
        ds.Item[] itemArray8 = new ds.Item[] {};
        fPHeapMin7.copia(itemArray8);
        ds.FPHeapMin fPHeapMin11 = new ds.FPHeapMin(100);
        ds.Item item12 = null;
        ds.Item[] itemArray13 = new ds.Item[] { item12 };
        fPHeapMin11.copia(itemArray13);
        fPHeapMin7.copia(itemArray13);
        fPHeapMin1.copia(itemArray13);
        ds.FPHeapMin fPHeapMin18 = new ds.FPHeapMin(100);
        ds.Item item19 = null;
        ds.Item[] itemArray20 = new ds.Item[] { item19 };
        fPHeapMin18.copia(itemArray20);
        fPHeapMin1.copia(itemArray20);
        fPHeapMin1.imprime();
        ds.Item item24 = null;
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMin1.insere(item24);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertNotNull(itemArray8);
        org.junit.Assert.assertNotNull(itemArray13);
        org.junit.Assert.assertNotNull(itemArray20);
    }

    @Test
    public void test081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test081");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin(100);
        ds.Item item2 = null;
        ds.Item[] itemArray3 = new ds.Item[] { item2 };
        fPHeapMin1.copia(itemArray3);
        fPHeapMin1.imprime();
        fPHeapMin1.constroi();
        fPHeapMin1.constroi();
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
    public void test082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test082");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin(100);
        fPHeapMin1.constroi();
        ds.FPHeapMin fPHeapMin4 = new ds.FPHeapMin(100);
        ds.Item item5 = null;
        ds.Item[] itemArray6 = new ds.Item[] { item5 };
        fPHeapMin4.copia(itemArray6);
        ds.FPHeapMin fPHeapMin9 = new ds.FPHeapMin(100);
        ds.Item item10 = null;
        ds.Item[] itemArray11 = new ds.Item[] { item10 };
        fPHeapMin9.copia(itemArray11);
        fPHeapMin9.imprime();
        ds.FPHeapMin fPHeapMin15 = new ds.FPHeapMin(100);
        ds.Item[] itemArray16 = new ds.Item[] {};
        fPHeapMin15.copia(itemArray16);
        ds.FPHeapMin fPHeapMin19 = new ds.FPHeapMin(100);
        ds.Item item20 = null;
        ds.Item[] itemArray21 = new ds.Item[] { item20 };
        fPHeapMin19.copia(itemArray21);
        fPHeapMin15.copia(itemArray21);
        fPHeapMin9.copia(itemArray21);
        ds.FPHeapMin fPHeapMin26 = new ds.FPHeapMin(100);
        ds.Item item27 = null;
        ds.Item[] itemArray28 = new ds.Item[] { item27 };
        fPHeapMin26.copia(itemArray28);
        fPHeapMin9.copia(itemArray28);
        fPHeapMin4.copia(itemArray28);
        ds.FPHeapMin fPHeapMin32 = new ds.FPHeapMin(itemArray28);
        ds.FPHeapMin fPHeapMin33 = new ds.FPHeapMin(itemArray28);
        fPHeapMin1.copia(itemArray28);
        java.lang.Class<?> wildcardClass35 = itemArray28.getClass();
        org.junit.Assert.assertNotNull(itemArray6);
        org.junit.Assert.assertNotNull(itemArray11);
        org.junit.Assert.assertNotNull(itemArray16);
        org.junit.Assert.assertNotNull(itemArray21);
        org.junit.Assert.assertNotNull(itemArray28);
        org.junit.Assert.assertNotNull(wildcardClass35);
    }

    @Test
    public void test083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test083");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin(100);
        ds.Item item2 = null;
        ds.Item[] itemArray3 = new ds.Item[] { item2 };
        fPHeapMin1.copia(itemArray3);
        fPHeapMin1.imprime();
        fPHeapMin1.constroi();
        ds.FPHeapMin fPHeapMin8 = new ds.FPHeapMin(100);
        ds.Item item9 = null;
        ds.Item[] itemArray10 = new ds.Item[] { item9 };
        fPHeapMin8.copia(itemArray10);
        ds.FPHeapMin fPHeapMin13 = new ds.FPHeapMin(100);
        ds.Item item14 = null;
        ds.Item[] itemArray15 = new ds.Item[] { item14 };
        fPHeapMin13.copia(itemArray15);
        fPHeapMin13.imprime();
        ds.FPHeapMin fPHeapMin19 = new ds.FPHeapMin(100);
        ds.Item[] itemArray20 = new ds.Item[] {};
        fPHeapMin19.copia(itemArray20);
        ds.FPHeapMin fPHeapMin23 = new ds.FPHeapMin(100);
        ds.Item item24 = null;
        ds.Item[] itemArray25 = new ds.Item[] { item24 };
        fPHeapMin23.copia(itemArray25);
        fPHeapMin19.copia(itemArray25);
        fPHeapMin13.copia(itemArray25);
        ds.FPHeapMin fPHeapMin30 = new ds.FPHeapMin(100);
        ds.Item item31 = null;
        ds.Item[] itemArray32 = new ds.Item[] { item31 };
        fPHeapMin30.copia(itemArray32);
        fPHeapMin13.copia(itemArray32);
        fPHeapMin8.copia(itemArray32);
        fPHeapMin1.copia(itemArray32);
        fPHeapMin1.constroi();
        java.lang.Class<?> wildcardClass38 = fPHeapMin1.getClass();
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertNotNull(itemArray10);
        org.junit.Assert.assertNotNull(itemArray15);
        org.junit.Assert.assertNotNull(itemArray20);
        org.junit.Assert.assertNotNull(itemArray25);
        org.junit.Assert.assertNotNull(itemArray32);
        org.junit.Assert.assertNotNull(wildcardClass38);
    }

    @Test
    public void test084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test084");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin((int) '4');
        fPHeapMin1.imprime();
    }

    @Test
    public void test085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test085");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin(100);
        ds.Item item2 = null;
        ds.Item[] itemArray3 = new ds.Item[] { item2 };
        fPHeapMin1.copia(itemArray3);
        fPHeapMin1.imprime();
        ds.FPHeapMin fPHeapMin7 = new ds.FPHeapMin(100);
        ds.Item[] itemArray8 = new ds.Item[] {};
        fPHeapMin7.copia(itemArray8);
        ds.FPHeapMin fPHeapMin11 = new ds.FPHeapMin(100);
        ds.Item item12 = null;
        ds.Item[] itemArray13 = new ds.Item[] { item12 };
        fPHeapMin11.copia(itemArray13);
        fPHeapMin7.copia(itemArray13);
        fPHeapMin1.copia(itemArray13);
        ds.Item item17 = null;
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMin1.insere(item17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertNotNull(itemArray8);
        org.junit.Assert.assertNotNull(itemArray13);
    }

    @Test
    public void test086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test086");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin(100);
        ds.Item item2 = null;
        ds.Item[] itemArray3 = new ds.Item[] { item2 };
        fPHeapMin1.copia(itemArray3);
        ds.FPHeapMin fPHeapMin6 = new ds.FPHeapMin(100);
        ds.Item item7 = null;
        ds.Item[] itemArray8 = new ds.Item[] { item7 };
        fPHeapMin6.copia(itemArray8);
        fPHeapMin6.imprime();
        ds.FPHeapMin fPHeapMin12 = new ds.FPHeapMin(100);
        ds.Item[] itemArray13 = new ds.Item[] {};
        fPHeapMin12.copia(itemArray13);
        ds.FPHeapMin fPHeapMin16 = new ds.FPHeapMin(100);
        ds.Item item17 = null;
        ds.Item[] itemArray18 = new ds.Item[] { item17 };
        fPHeapMin16.copia(itemArray18);
        fPHeapMin12.copia(itemArray18);
        fPHeapMin6.copia(itemArray18);
        ds.FPHeapMin fPHeapMin23 = new ds.FPHeapMin(100);
        ds.Item item24 = null;
        ds.Item[] itemArray25 = new ds.Item[] { item24 };
        fPHeapMin23.copia(itemArray25);
        fPHeapMin6.copia(itemArray25);
        fPHeapMin1.copia(itemArray25);
        fPHeapMin1.constroi();
        // The following exception was thrown during execution in test generation
        try {
            ds.Item item30 = fPHeapMin1.retiraMin();
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: heap vazio");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertNotNull(itemArray8);
        org.junit.Assert.assertNotNull(itemArray13);
        org.junit.Assert.assertNotNull(itemArray18);
        org.junit.Assert.assertNotNull(itemArray25);
    }

    @Test
    public void test087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test087");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin(100);
        fPHeapMin1.imprime();
        fPHeapMin1.constroi();
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
    public void test088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test088");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin(100);
        ds.Item[] itemArray2 = new ds.Item[] {};
        fPHeapMin1.copia(itemArray2);
        ds.FPHeapMin fPHeapMin5 = new ds.FPHeapMin(100);
        ds.Item item6 = null;
        ds.Item[] itemArray7 = new ds.Item[] { item6 };
        fPHeapMin5.copia(itemArray7);
        fPHeapMin1.copia(itemArray7);
        fPHeapMin1.imprime();
        ds.Item item11 = fPHeapMin1.min();
        fPHeapMin1.constroi();
        fPHeapMin1.constroi();
        fPHeapMin1.refaz(1, 0);
        org.junit.Assert.assertNotNull(itemArray2);
        org.junit.Assert.assertNotNull(itemArray7);
        org.junit.Assert.assertNull(item11);
    }

    @Test
    public void test089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test089");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin(100);
        fPHeapMin1.imprime();
        ds.Item item3 = fPHeapMin1.min();
        ds.Item item4 = fPHeapMin1.min();
        ds.FPHeapMin fPHeapMin7 = new ds.FPHeapMin(100);
        ds.Item item8 = null;
        ds.Item[] itemArray9 = new ds.Item[] { item8 };
        fPHeapMin7.copia(itemArray9);
        ds.FPHeapMin fPHeapMin11 = new ds.FPHeapMin(itemArray9);
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMin1.diminuiChave((int) (short) -1, (java.lang.Object) itemArray9);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(item3);
        org.junit.Assert.assertNull(item4);
        org.junit.Assert.assertNotNull(itemArray9);
    }

    @Test
    public void test090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test090");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin((int) (short) 100);
        ds.FPHeapMin fPHeapMin4 = new ds.FPHeapMin(100);
        ds.Item[] itemArray5 = new ds.Item[] {};
        fPHeapMin4.copia(itemArray5);
        ds.FPHeapMin fPHeapMin8 = new ds.FPHeapMin(100);
        ds.Item item9 = null;
        ds.Item[] itemArray10 = new ds.Item[] { item9 };
        fPHeapMin8.copia(itemArray10);
        fPHeapMin4.copia(itemArray10);
        fPHeapMin4.imprime();
        ds.Item item14 = fPHeapMin4.min();
        fPHeapMin4.constroi();
        fPHeapMin4.constroi();
        java.lang.Class<?> wildcardClass17 = fPHeapMin4.getClass();
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMin1.diminuiChave((int) '#', (java.lang.Object) fPHeapMin4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray5);
        org.junit.Assert.assertNotNull(itemArray10);
        org.junit.Assert.assertNull(item14);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test091");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin(100);
        ds.Item[] itemArray2 = new ds.Item[] {};
        fPHeapMin1.copia(itemArray2);
        ds.FPHeapMin fPHeapMin5 = new ds.FPHeapMin(100);
        ds.Item item6 = null;
        ds.Item[] itemArray7 = new ds.Item[] { item6 };
        fPHeapMin5.copia(itemArray7);
        fPHeapMin1.copia(itemArray7);
        fPHeapMin1.imprime();
        fPHeapMin1.constroi();
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMin1.refaz(0, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray2);
        org.junit.Assert.assertNotNull(itemArray7);
    }

    @Test
    public void test092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test092");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin(100);
        fPHeapMin1.imprime();
        ds.Item item3 = fPHeapMin1.min();
        ds.Item item4 = fPHeapMin1.min();
        java.lang.Class<?> wildcardClass5 = fPHeapMin1.getClass();
        org.junit.Assert.assertNull(item3);
        org.junit.Assert.assertNull(item4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test093");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin(100);
        ds.Item item2 = null;
        ds.Item[] itemArray3 = new ds.Item[] { item2 };
        fPHeapMin1.copia(itemArray3);
        ds.FPHeapMin fPHeapMin6 = new ds.FPHeapMin(100);
        ds.Item item7 = null;
        ds.Item[] itemArray8 = new ds.Item[] { item7 };
        fPHeapMin6.copia(itemArray8);
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
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertNotNull(itemArray8);
    }

    @Test
    public void test094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test094");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin(100);
        ds.Item item2 = null;
        ds.Item[] itemArray3 = new ds.Item[] { item2 };
        fPHeapMin1.copia(itemArray3);
        fPHeapMin1.imprime();
        fPHeapMin1.imprime();
        fPHeapMin1.imprime();
        ds.Item item8 = null;
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMin1.insere(item8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray3);
    }

    @Test
    public void test095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test095");
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
    public void test096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test096");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin(100);
        ds.Item[] itemArray2 = new ds.Item[] {};
        fPHeapMin1.copia(itemArray2);
        ds.FPHeapMin fPHeapMin5 = new ds.FPHeapMin(100);
        ds.Item item6 = null;
        ds.Item[] itemArray7 = new ds.Item[] { item6 };
        fPHeapMin5.copia(itemArray7);
        fPHeapMin1.copia(itemArray7);
        ds.FPHeapMin fPHeapMin11 = new ds.FPHeapMin(100);
        ds.Item item12 = null;
        ds.Item[] itemArray13 = new ds.Item[] { item12 };
        fPHeapMin11.copia(itemArray13);
        ds.FPHeapMin fPHeapMin15 = new ds.FPHeapMin(itemArray13);
        fPHeapMin1.copia(itemArray13);
        fPHeapMin1.imprime();
        ds.FPHeapMin fPHeapMin19 = new ds.FPHeapMin(100);
        fPHeapMin19.imprime();
        ds.FPHeapMin fPHeapMin22 = new ds.FPHeapMin(100);
        ds.Item[] itemArray23 = new ds.Item[] {};
        fPHeapMin22.copia(itemArray23);
        ds.FPHeapMin fPHeapMin26 = new ds.FPHeapMin(100);
        ds.Item item27 = null;
        ds.Item[] itemArray28 = new ds.Item[] { item27 };
        fPHeapMin26.copia(itemArray28);
        fPHeapMin22.copia(itemArray28);
        fPHeapMin19.copia(itemArray28);
        ds.FPHeapMin fPHeapMin32 = new ds.FPHeapMin(itemArray28);
        ds.FPHeapMin fPHeapMin33 = new ds.FPHeapMin(itemArray28);
        fPHeapMin1.copia(itemArray28);
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMin1.refaz(0, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray2);
        org.junit.Assert.assertNotNull(itemArray7);
        org.junit.Assert.assertNotNull(itemArray13);
        org.junit.Assert.assertNotNull(itemArray23);
        org.junit.Assert.assertNotNull(itemArray28);
    }

    @Test
    public void test097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test097");
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
    public void test098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test098");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin(100);
        ds.Item item2 = null;
        ds.Item[] itemArray3 = new ds.Item[] { item2 };
        fPHeapMin1.copia(itemArray3);
        fPHeapMin1.imprime();
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
    public void test099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test099");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin(100);
        ds.Item[] itemArray2 = new ds.Item[] {};
        fPHeapMin1.copia(itemArray2);
        ds.FPHeapMin fPHeapMin4 = new ds.FPHeapMin(itemArray2);
        fPHeapMin4.imprime();
        fPHeapMin4.constroi();
        fPHeapMin4.constroi();
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMin4.refaz(100, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 100");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray2);
    }

    @Test
    public void test100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test100");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin(100);
        fPHeapMin1.constroi();
        ds.FPHeapMin fPHeapMin4 = new ds.FPHeapMin(100);
        ds.Item item5 = null;
        ds.Item[] itemArray6 = new ds.Item[] { item5 };
        fPHeapMin4.copia(itemArray6);
        ds.FPHeapMin fPHeapMin9 = new ds.FPHeapMin(100);
        ds.Item item10 = null;
        ds.Item[] itemArray11 = new ds.Item[] { item10 };
        fPHeapMin9.copia(itemArray11);
        fPHeapMin9.imprime();
        ds.FPHeapMin fPHeapMin15 = new ds.FPHeapMin(100);
        ds.Item[] itemArray16 = new ds.Item[] {};
        fPHeapMin15.copia(itemArray16);
        ds.FPHeapMin fPHeapMin19 = new ds.FPHeapMin(100);
        ds.Item item20 = null;
        ds.Item[] itemArray21 = new ds.Item[] { item20 };
        fPHeapMin19.copia(itemArray21);
        fPHeapMin15.copia(itemArray21);
        fPHeapMin9.copia(itemArray21);
        ds.FPHeapMin fPHeapMin26 = new ds.FPHeapMin(100);
        ds.Item item27 = null;
        ds.Item[] itemArray28 = new ds.Item[] { item27 };
        fPHeapMin26.copia(itemArray28);
        fPHeapMin9.copia(itemArray28);
        fPHeapMin4.copia(itemArray28);
        ds.FPHeapMin fPHeapMin32 = new ds.FPHeapMin(itemArray28);
        ds.FPHeapMin fPHeapMin33 = new ds.FPHeapMin(itemArray28);
        fPHeapMin1.copia(itemArray28);
        ds.Item item35 = null;
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMin1.insere(item35);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray6);
        org.junit.Assert.assertNotNull(itemArray11);
        org.junit.Assert.assertNotNull(itemArray16);
        org.junit.Assert.assertNotNull(itemArray21);
        org.junit.Assert.assertNotNull(itemArray28);
    }

    @Test
    public void test101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test101");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin(100);
        ds.Item item2 = null;
        ds.Item[] itemArray3 = new ds.Item[] { item2 };
        fPHeapMin1.copia(itemArray3);
        ds.FPHeapMin fPHeapMin6 = new ds.FPHeapMin(100);
        ds.Item item7 = null;
        ds.Item[] itemArray8 = new ds.Item[] { item7 };
        fPHeapMin6.copia(itemArray8);
        fPHeapMin6.imprime();
        ds.FPHeapMin fPHeapMin12 = new ds.FPHeapMin(100);
        ds.Item[] itemArray13 = new ds.Item[] {};
        fPHeapMin12.copia(itemArray13);
        ds.FPHeapMin fPHeapMin16 = new ds.FPHeapMin(100);
        ds.Item item17 = null;
        ds.Item[] itemArray18 = new ds.Item[] { item17 };
        fPHeapMin16.copia(itemArray18);
        fPHeapMin12.copia(itemArray18);
        fPHeapMin6.copia(itemArray18);
        ds.FPHeapMin fPHeapMin23 = new ds.FPHeapMin(100);
        ds.Item item24 = null;
        ds.Item[] itemArray25 = new ds.Item[] { item24 };
        fPHeapMin23.copia(itemArray25);
        fPHeapMin6.copia(itemArray25);
        fPHeapMin1.copia(itemArray25);
        fPHeapMin1.constroi();
        fPHeapMin1.constroi();
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertNotNull(itemArray8);
        org.junit.Assert.assertNotNull(itemArray13);
        org.junit.Assert.assertNotNull(itemArray18);
        org.junit.Assert.assertNotNull(itemArray25);
    }

    @Test
    public void test102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test102");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin(100);
        ds.Item item2 = null;
        ds.Item[] itemArray3 = new ds.Item[] { item2 };
        fPHeapMin1.copia(itemArray3);
        fPHeapMin1.imprime();
        fPHeapMin1.imprime();
        ds.FPHeapMin fPHeapMin8 = new ds.FPHeapMin(100);
        ds.Item item9 = null;
        ds.Item[] itemArray10 = new ds.Item[] { item9 };
        fPHeapMin8.copia(itemArray10);
        ds.FPHeapMin fPHeapMin13 = new ds.FPHeapMin(100);
        ds.Item item14 = null;
        ds.Item[] itemArray15 = new ds.Item[] { item14 };
        fPHeapMin13.copia(itemArray15);
        fPHeapMin13.imprime();
        ds.FPHeapMin fPHeapMin19 = new ds.FPHeapMin(100);
        ds.Item[] itemArray20 = new ds.Item[] {};
        fPHeapMin19.copia(itemArray20);
        ds.FPHeapMin fPHeapMin23 = new ds.FPHeapMin(100);
        ds.Item item24 = null;
        ds.Item[] itemArray25 = new ds.Item[] { item24 };
        fPHeapMin23.copia(itemArray25);
        fPHeapMin19.copia(itemArray25);
        fPHeapMin13.copia(itemArray25);
        ds.FPHeapMin fPHeapMin30 = new ds.FPHeapMin(100);
        ds.Item item31 = null;
        ds.Item[] itemArray32 = new ds.Item[] { item31 };
        fPHeapMin30.copia(itemArray32);
        fPHeapMin13.copia(itemArray32);
        fPHeapMin8.copia(itemArray32);
        fPHeapMin1.copia(itemArray32);
        fPHeapMin1.imprime();
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertNotNull(itemArray10);
        org.junit.Assert.assertNotNull(itemArray15);
        org.junit.Assert.assertNotNull(itemArray20);
        org.junit.Assert.assertNotNull(itemArray25);
        org.junit.Assert.assertNotNull(itemArray32);
    }

    @Test
    public void test103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test103");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin((int) (short) -1);
        ds.FPHeapMin fPHeapMin4 = new ds.FPHeapMin(100);
        java.lang.Class<?> wildcardClass5 = fPHeapMin4.getClass();
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMin1.diminuiChave((int) 'a', (java.lang.Object) wildcardClass5);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 97");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test104");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin((-1));
        fPHeapMin1.imprime();
        java.lang.Object obj4 = null;
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMin1.diminuiChave(10, obj4);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 10");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test105");
        ds.Item[] itemArray0 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin(itemArray0);
        ds.FPHeapMin fPHeapMin3 = new ds.FPHeapMin(100);
        ds.Item item4 = null;
        ds.Item[] itemArray5 = new ds.Item[] { item4 };
        fPHeapMin3.copia(itemArray5);
        ds.FPHeapMin fPHeapMin8 = new ds.FPHeapMin(100);
        ds.Item item9 = null;
        ds.Item[] itemArray10 = new ds.Item[] { item9 };
        fPHeapMin8.copia(itemArray10);
        fPHeapMin8.imprime();
        ds.FPHeapMin fPHeapMin14 = new ds.FPHeapMin(100);
        ds.Item[] itemArray15 = new ds.Item[] {};
        fPHeapMin14.copia(itemArray15);
        ds.FPHeapMin fPHeapMin18 = new ds.FPHeapMin(100);
        ds.Item item19 = null;
        ds.Item[] itemArray20 = new ds.Item[] { item19 };
        fPHeapMin18.copia(itemArray20);
        fPHeapMin14.copia(itemArray20);
        fPHeapMin8.copia(itemArray20);
        ds.FPHeapMin fPHeapMin25 = new ds.FPHeapMin(100);
        ds.Item item26 = null;
        ds.Item[] itemArray27 = new ds.Item[] { item26 };
        fPHeapMin25.copia(itemArray27);
        fPHeapMin8.copia(itemArray27);
        fPHeapMin3.copia(itemArray27);
        ds.FPHeapMin fPHeapMin31 = new ds.FPHeapMin(itemArray27);
        fPHeapMin1.copia(itemArray27);
        ds.FPHeapMin fPHeapMin33 = new ds.FPHeapMin(itemArray27);
        java.lang.Class<?> wildcardClass34 = itemArray27.getClass();
        org.junit.Assert.assertNotNull(itemArray0);
        org.junit.Assert.assertNotNull(itemArray5);
        org.junit.Assert.assertNotNull(itemArray10);
        org.junit.Assert.assertNotNull(itemArray15);
        org.junit.Assert.assertNotNull(itemArray20);
        org.junit.Assert.assertNotNull(itemArray27);
        org.junit.Assert.assertNotNull(wildcardClass34);
    }

    @Test
    public void test106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test106");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin(100);
        ds.Item item2 = null;
        ds.Item[] itemArray3 = new ds.Item[] { item2 };
        fPHeapMin1.copia(itemArray3);
        fPHeapMin1.imprime();
        fPHeapMin1.constroi();
        fPHeapMin1.constroi();
        ds.Item item8 = fPHeapMin1.min();
        fPHeapMin1.constroi();
        fPHeapMin1.imprime();
        ds.Item item11 = null;
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMin1.insere(item11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertNull(item8);
    }

    @Test
    public void test107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test107");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin(100);
        ds.Item item2 = null;
        ds.Item[] itemArray3 = new ds.Item[] { item2 };
        fPHeapMin1.copia(itemArray3);
        ds.FPHeapMin fPHeapMin5 = new ds.FPHeapMin(itemArray3);
        java.lang.Class<?> wildcardClass6 = fPHeapMin5.getClass();
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test108");
        ds.Item[] itemArray0 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin(itemArray0);
        ds.FPHeapMin fPHeapMin3 = new ds.FPHeapMin(100);
        ds.Item item4 = null;
        ds.Item[] itemArray5 = new ds.Item[] { item4 };
        fPHeapMin3.copia(itemArray5);
        ds.FPHeapMin fPHeapMin8 = new ds.FPHeapMin(100);
        ds.Item item9 = null;
        ds.Item[] itemArray10 = new ds.Item[] { item9 };
        fPHeapMin8.copia(itemArray10);
        fPHeapMin8.imprime();
        ds.FPHeapMin fPHeapMin14 = new ds.FPHeapMin(100);
        ds.Item[] itemArray15 = new ds.Item[] {};
        fPHeapMin14.copia(itemArray15);
        ds.FPHeapMin fPHeapMin18 = new ds.FPHeapMin(100);
        ds.Item item19 = null;
        ds.Item[] itemArray20 = new ds.Item[] { item19 };
        fPHeapMin18.copia(itemArray20);
        fPHeapMin14.copia(itemArray20);
        fPHeapMin8.copia(itemArray20);
        ds.FPHeapMin fPHeapMin25 = new ds.FPHeapMin(100);
        ds.Item item26 = null;
        ds.Item[] itemArray27 = new ds.Item[] { item26 };
        fPHeapMin25.copia(itemArray27);
        fPHeapMin8.copia(itemArray27);
        fPHeapMin3.copia(itemArray27);
        ds.FPHeapMin fPHeapMin31 = new ds.FPHeapMin(itemArray27);
        fPHeapMin1.copia(itemArray27);
        ds.FPHeapMin fPHeapMin33 = new ds.FPHeapMin(itemArray27);
        ds.Item[] itemArray34 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin35 = new ds.FPHeapMin(itemArray34);
        ds.FPHeapMin fPHeapMin37 = new ds.FPHeapMin(100);
        ds.Item item38 = null;
        ds.Item[] itemArray39 = new ds.Item[] { item38 };
        fPHeapMin37.copia(itemArray39);
        ds.FPHeapMin fPHeapMin42 = new ds.FPHeapMin(100);
        ds.Item item43 = null;
        ds.Item[] itemArray44 = new ds.Item[] { item43 };
        fPHeapMin42.copia(itemArray44);
        fPHeapMin42.imprime();
        ds.FPHeapMin fPHeapMin48 = new ds.FPHeapMin(100);
        ds.Item[] itemArray49 = new ds.Item[] {};
        fPHeapMin48.copia(itemArray49);
        ds.FPHeapMin fPHeapMin52 = new ds.FPHeapMin(100);
        ds.Item item53 = null;
        ds.Item[] itemArray54 = new ds.Item[] { item53 };
        fPHeapMin52.copia(itemArray54);
        fPHeapMin48.copia(itemArray54);
        fPHeapMin42.copia(itemArray54);
        ds.FPHeapMin fPHeapMin59 = new ds.FPHeapMin(100);
        ds.Item item60 = null;
        ds.Item[] itemArray61 = new ds.Item[] { item60 };
        fPHeapMin59.copia(itemArray61);
        fPHeapMin42.copia(itemArray61);
        fPHeapMin37.copia(itemArray61);
        ds.FPHeapMin fPHeapMin65 = new ds.FPHeapMin(itemArray61);
        fPHeapMin35.copia(itemArray61);
        fPHeapMin33.copia(itemArray61);
        org.junit.Assert.assertNotNull(itemArray0);
        org.junit.Assert.assertNotNull(itemArray5);
        org.junit.Assert.assertNotNull(itemArray10);
        org.junit.Assert.assertNotNull(itemArray15);
        org.junit.Assert.assertNotNull(itemArray20);
        org.junit.Assert.assertNotNull(itemArray27);
        org.junit.Assert.assertNotNull(itemArray34);
        org.junit.Assert.assertNotNull(itemArray39);
        org.junit.Assert.assertNotNull(itemArray44);
        org.junit.Assert.assertNotNull(itemArray49);
        org.junit.Assert.assertNotNull(itemArray54);
        org.junit.Assert.assertNotNull(itemArray61);
    }

    @Test
    public void test109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test109");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin(100);
        ds.Item item2 = null;
        ds.Item[] itemArray3 = new ds.Item[] { item2 };
        fPHeapMin1.copia(itemArray3);
        ds.FPHeapMin fPHeapMin6 = new ds.FPHeapMin(100);
        ds.Item item7 = null;
        ds.Item[] itemArray8 = new ds.Item[] { item7 };
        fPHeapMin6.copia(itemArray8);
        ds.FPHeapMin fPHeapMin10 = new ds.FPHeapMin(itemArray8);
        fPHeapMin1.copia(itemArray8);
        fPHeapMin1.imprime();
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertNotNull(itemArray8);
    }

    @Test
    public void test110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test110");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin(100);
        ds.Item item2 = null;
        ds.Item[] itemArray3 = new ds.Item[] { item2 };
        fPHeapMin1.copia(itemArray3);
        ds.FPHeapMin fPHeapMin6 = new ds.FPHeapMin(100);
        ds.Item item7 = null;
        ds.Item[] itemArray8 = new ds.Item[] { item7 };
        fPHeapMin6.copia(itemArray8);
        fPHeapMin6.imprime();
        ds.FPHeapMin fPHeapMin12 = new ds.FPHeapMin(100);
        ds.Item[] itemArray13 = new ds.Item[] {};
        fPHeapMin12.copia(itemArray13);
        ds.FPHeapMin fPHeapMin16 = new ds.FPHeapMin(100);
        ds.Item item17 = null;
        ds.Item[] itemArray18 = new ds.Item[] { item17 };
        fPHeapMin16.copia(itemArray18);
        fPHeapMin12.copia(itemArray18);
        fPHeapMin6.copia(itemArray18);
        ds.FPHeapMin fPHeapMin23 = new ds.FPHeapMin(100);
        ds.Item item24 = null;
        ds.Item[] itemArray25 = new ds.Item[] { item24 };
        fPHeapMin23.copia(itemArray25);
        fPHeapMin6.copia(itemArray25);
        fPHeapMin1.copia(itemArray25);
        ds.FPHeapMin fPHeapMin29 = new ds.FPHeapMin(itemArray25);
        ds.FPHeapMin fPHeapMin30 = new ds.FPHeapMin(itemArray25);
        ds.FPHeapMin fPHeapMin32 = new ds.FPHeapMin(100);
        ds.Item[] itemArray33 = new ds.Item[] {};
        fPHeapMin32.copia(itemArray33);
        fPHeapMin30.copia(itemArray33);
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMin30.refaz(100, (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 100");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertNotNull(itemArray8);
        org.junit.Assert.assertNotNull(itemArray13);
        org.junit.Assert.assertNotNull(itemArray18);
        org.junit.Assert.assertNotNull(itemArray25);
        org.junit.Assert.assertNotNull(itemArray33);
    }

    @Test
    public void test111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test111");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin(100);
        ds.Item[] itemArray2 = new ds.Item[] {};
        fPHeapMin1.copia(itemArray2);
        ds.FPHeapMin fPHeapMin5 = new ds.FPHeapMin(100);
        ds.Item item6 = null;
        ds.Item[] itemArray7 = new ds.Item[] { item6 };
        fPHeapMin5.copia(itemArray7);
        fPHeapMin1.copia(itemArray7);
        fPHeapMin1.imprime();
        ds.Item item11 = fPHeapMin1.min();
        ds.Item item12 = null;
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMin1.insere(item12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray2);
        org.junit.Assert.assertNotNull(itemArray7);
        org.junit.Assert.assertNull(item11);
    }

    @Test
    public void test112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test112");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin((int) (byte) 10);
        java.lang.Class<?> wildcardClass2 = fPHeapMin1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test113");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin(100);
        ds.Item[] itemArray2 = new ds.Item[] {};
        fPHeapMin1.copia(itemArray2);
        ds.FPHeapMin fPHeapMin5 = new ds.FPHeapMin(100);
        ds.Item item6 = null;
        ds.Item[] itemArray7 = new ds.Item[] { item6 };
        fPHeapMin5.copia(itemArray7);
        fPHeapMin1.copia(itemArray7);
        ds.FPHeapMin fPHeapMin11 = new ds.FPHeapMin(100);
        ds.Item item12 = null;
        ds.Item[] itemArray13 = new ds.Item[] { item12 };
        fPHeapMin11.copia(itemArray13);
        ds.FPHeapMin fPHeapMin15 = new ds.FPHeapMin(itemArray13);
        fPHeapMin1.copia(itemArray13);
        fPHeapMin1.imprime();
        ds.FPHeapMin fPHeapMin19 = new ds.FPHeapMin(100);
        fPHeapMin19.imprime();
        ds.FPHeapMin fPHeapMin22 = new ds.FPHeapMin(100);
        ds.Item[] itemArray23 = new ds.Item[] {};
        fPHeapMin22.copia(itemArray23);
        ds.FPHeapMin fPHeapMin26 = new ds.FPHeapMin(100);
        ds.Item item27 = null;
        ds.Item[] itemArray28 = new ds.Item[] { item27 };
        fPHeapMin26.copia(itemArray28);
        fPHeapMin22.copia(itemArray28);
        fPHeapMin19.copia(itemArray28);
        ds.FPHeapMin fPHeapMin32 = new ds.FPHeapMin(itemArray28);
        ds.FPHeapMin fPHeapMin33 = new ds.FPHeapMin(itemArray28);
        fPHeapMin1.copia(itemArray28);
        // The following exception was thrown during execution in test generation
        try {
            ds.Item item35 = fPHeapMin1.retiraMin();
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: heap vazio");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray2);
        org.junit.Assert.assertNotNull(itemArray7);
        org.junit.Assert.assertNotNull(itemArray13);
        org.junit.Assert.assertNotNull(itemArray23);
        org.junit.Assert.assertNotNull(itemArray28);
    }

    @Test
    public void test114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test114");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin((int) '4');
        java.lang.Class<?> wildcardClass2 = fPHeapMin1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test115");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin(100);
        ds.Item item2 = null;
        ds.Item[] itemArray3 = new ds.Item[] { item2 };
        fPHeapMin1.copia(itemArray3);
        ds.FPHeapMin fPHeapMin6 = new ds.FPHeapMin(100);
        ds.Item item7 = null;
        ds.Item[] itemArray8 = new ds.Item[] { item7 };
        fPHeapMin6.copia(itemArray8);
        fPHeapMin6.imprime();
        ds.FPHeapMin fPHeapMin12 = new ds.FPHeapMin(100);
        ds.Item[] itemArray13 = new ds.Item[] {};
        fPHeapMin12.copia(itemArray13);
        ds.FPHeapMin fPHeapMin16 = new ds.FPHeapMin(100);
        ds.Item item17 = null;
        ds.Item[] itemArray18 = new ds.Item[] { item17 };
        fPHeapMin16.copia(itemArray18);
        fPHeapMin12.copia(itemArray18);
        fPHeapMin6.copia(itemArray18);
        ds.FPHeapMin fPHeapMin23 = new ds.FPHeapMin(100);
        ds.Item item24 = null;
        ds.Item[] itemArray25 = new ds.Item[] { item24 };
        fPHeapMin23.copia(itemArray25);
        fPHeapMin6.copia(itemArray25);
        fPHeapMin1.copia(itemArray25);
        ds.FPHeapMin fPHeapMin29 = new ds.FPHeapMin(itemArray25);
        ds.FPHeapMin fPHeapMin30 = new ds.FPHeapMin(itemArray25);
        ds.Item item31 = null;
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMin30.insere(item31);
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: heap cheio");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertNotNull(itemArray8);
        org.junit.Assert.assertNotNull(itemArray13);
        org.junit.Assert.assertNotNull(itemArray18);
        org.junit.Assert.assertNotNull(itemArray25);
    }

    @Test
    public void test116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test116");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin(100);
        ds.Item[] itemArray2 = new ds.Item[] {};
        fPHeapMin1.copia(itemArray2);
        ds.FPHeapMin fPHeapMin5 = new ds.FPHeapMin(100);
        ds.Item item6 = null;
        ds.Item[] itemArray7 = new ds.Item[] { item6 };
        fPHeapMin5.copia(itemArray7);
        fPHeapMin1.copia(itemArray7);
        ds.FPHeapMin fPHeapMin11 = new ds.FPHeapMin(100);
        ds.Item item12 = null;
        ds.Item[] itemArray13 = new ds.Item[] { item12 };
        fPHeapMin11.copia(itemArray13);
        ds.FPHeapMin fPHeapMin15 = new ds.FPHeapMin(itemArray13);
        fPHeapMin1.copia(itemArray13);
        fPHeapMin1.imprime();
        fPHeapMin1.refaz(10, (int) (short) 1);
        org.junit.Assert.assertNotNull(itemArray2);
        org.junit.Assert.assertNotNull(itemArray7);
        org.junit.Assert.assertNotNull(itemArray13);
    }

    @Test
    public void test117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test117");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin(100);
        ds.Item item2 = null;
        ds.Item[] itemArray3 = new ds.Item[] { item2 };
        fPHeapMin1.copia(itemArray3);
        fPHeapMin1.imprime();
        ds.FPHeapMin fPHeapMin7 = new ds.FPHeapMin(100);
        ds.Item[] itemArray8 = new ds.Item[] {};
        fPHeapMin7.copia(itemArray8);
        ds.FPHeapMin fPHeapMin11 = new ds.FPHeapMin(100);
        ds.Item item12 = null;
        ds.Item[] itemArray13 = new ds.Item[] { item12 };
        fPHeapMin11.copia(itemArray13);
        fPHeapMin7.copia(itemArray13);
        fPHeapMin1.copia(itemArray13);
        ds.FPHeapMin fPHeapMin18 = new ds.FPHeapMin(100);
        fPHeapMin18.imprime();
        ds.FPHeapMin fPHeapMin21 = new ds.FPHeapMin(100);
        ds.Item[] itemArray22 = new ds.Item[] {};
        fPHeapMin21.copia(itemArray22);
        ds.FPHeapMin fPHeapMin25 = new ds.FPHeapMin(100);
        ds.Item item26 = null;
        ds.Item[] itemArray27 = new ds.Item[] { item26 };
        fPHeapMin25.copia(itemArray27);
        fPHeapMin21.copia(itemArray27);
        fPHeapMin18.copia(itemArray27);
        fPHeapMin1.copia(itemArray27);
        fPHeapMin1.constroi();
        fPHeapMin1.constroi();
        ds.FPHeapMin fPHeapMin35 = new ds.FPHeapMin(100);
        fPHeapMin35.constroi();
        fPHeapMin35.refaz(100, (int) (byte) 100);
        ds.Item[] itemArray40 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin41 = new ds.FPHeapMin(itemArray40);
        ds.FPHeapMin fPHeapMin43 = new ds.FPHeapMin(100);
        ds.Item item44 = null;
        ds.Item[] itemArray45 = new ds.Item[] { item44 };
        fPHeapMin43.copia(itemArray45);
        ds.FPHeapMin fPHeapMin48 = new ds.FPHeapMin(100);
        ds.Item item49 = null;
        ds.Item[] itemArray50 = new ds.Item[] { item49 };
        fPHeapMin48.copia(itemArray50);
        fPHeapMin48.imprime();
        ds.FPHeapMin fPHeapMin54 = new ds.FPHeapMin(100);
        ds.Item[] itemArray55 = new ds.Item[] {};
        fPHeapMin54.copia(itemArray55);
        ds.FPHeapMin fPHeapMin58 = new ds.FPHeapMin(100);
        ds.Item item59 = null;
        ds.Item[] itemArray60 = new ds.Item[] { item59 };
        fPHeapMin58.copia(itemArray60);
        fPHeapMin54.copia(itemArray60);
        fPHeapMin48.copia(itemArray60);
        ds.FPHeapMin fPHeapMin65 = new ds.FPHeapMin(100);
        ds.Item item66 = null;
        ds.Item[] itemArray67 = new ds.Item[] { item66 };
        fPHeapMin65.copia(itemArray67);
        fPHeapMin48.copia(itemArray67);
        fPHeapMin43.copia(itemArray67);
        ds.FPHeapMin fPHeapMin71 = new ds.FPHeapMin(itemArray67);
        fPHeapMin41.copia(itemArray67);
        ds.FPHeapMin fPHeapMin73 = new ds.FPHeapMin(itemArray67);
        fPHeapMin35.copia(itemArray67);
        fPHeapMin1.copia(itemArray67);
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertNotNull(itemArray8);
        org.junit.Assert.assertNotNull(itemArray13);
        org.junit.Assert.assertNotNull(itemArray22);
        org.junit.Assert.assertNotNull(itemArray27);
        org.junit.Assert.assertNotNull(itemArray40);
        org.junit.Assert.assertNotNull(itemArray45);
        org.junit.Assert.assertNotNull(itemArray50);
        org.junit.Assert.assertNotNull(itemArray55);
        org.junit.Assert.assertNotNull(itemArray60);
        org.junit.Assert.assertNotNull(itemArray67);
    }

    @Test
    public void test118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test118");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin(0);
        fPHeapMin1.constroi();
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
    public void test119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test119");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin(100);
        ds.Item[] itemArray2 = new ds.Item[] {};
        fPHeapMin1.copia(itemArray2);
        ds.FPHeapMin fPHeapMin5 = new ds.FPHeapMin(100);
        ds.Item item6 = null;
        ds.Item[] itemArray7 = new ds.Item[] { item6 };
        fPHeapMin5.copia(itemArray7);
        fPHeapMin1.copia(itemArray7);
        fPHeapMin1.imprime();
        ds.Item item11 = fPHeapMin1.min();
        fPHeapMin1.constroi();
        ds.Item item13 = null;
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMin1.insere(item13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray2);
        org.junit.Assert.assertNotNull(itemArray7);
        org.junit.Assert.assertNull(item11);
    }

    @Test
    public void test120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test120");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin(100);
        ds.Item item2 = null;
        ds.Item[] itemArray3 = new ds.Item[] { item2 };
        fPHeapMin1.copia(itemArray3);
        fPHeapMin1.imprime();
        ds.FPHeapMin fPHeapMin7 = new ds.FPHeapMin(100);
        ds.Item[] itemArray8 = new ds.Item[] {};
        fPHeapMin7.copia(itemArray8);
        ds.FPHeapMin fPHeapMin11 = new ds.FPHeapMin(100);
        ds.Item item12 = null;
        ds.Item[] itemArray13 = new ds.Item[] { item12 };
        fPHeapMin11.copia(itemArray13);
        fPHeapMin7.copia(itemArray13);
        fPHeapMin1.copia(itemArray13);
        ds.FPHeapMin fPHeapMin18 = new ds.FPHeapMin(100);
        ds.Item item19 = null;
        ds.Item[] itemArray20 = new ds.Item[] { item19 };
        fPHeapMin18.copia(itemArray20);
        fPHeapMin1.copia(itemArray20);
        fPHeapMin1.imprime();
        ds.Item item24 = fPHeapMin1.min();
        java.lang.Class<?> wildcardClass25 = fPHeapMin1.getClass();
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertNotNull(itemArray8);
        org.junit.Assert.assertNotNull(itemArray13);
        org.junit.Assert.assertNotNull(itemArray20);
        org.junit.Assert.assertNull(item24);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test121");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin(100);
        ds.Item item2 = null;
        ds.Item[] itemArray3 = new ds.Item[] { item2 };
        fPHeapMin1.copia(itemArray3);
        fPHeapMin1.imprime();
        ds.FPHeapMin fPHeapMin7 = new ds.FPHeapMin(100);
        ds.Item[] itemArray8 = new ds.Item[] {};
        fPHeapMin7.copia(itemArray8);
        ds.FPHeapMin fPHeapMin11 = new ds.FPHeapMin(100);
        ds.Item item12 = null;
        ds.Item[] itemArray13 = new ds.Item[] { item12 };
        fPHeapMin11.copia(itemArray13);
        fPHeapMin7.copia(itemArray13);
        fPHeapMin1.copia(itemArray13);
        ds.FPHeapMin fPHeapMin18 = new ds.FPHeapMin(100);
        ds.Item item19 = null;
        ds.Item[] itemArray20 = new ds.Item[] { item19 };
        fPHeapMin18.copia(itemArray20);
        fPHeapMin1.copia(itemArray20);
        ds.Item item23 = fPHeapMin1.min();
        fPHeapMin1.imprime();
        ds.Item item25 = null;
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMin1.insere(item25);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertNotNull(itemArray8);
        org.junit.Assert.assertNotNull(itemArray13);
        org.junit.Assert.assertNotNull(itemArray20);
        org.junit.Assert.assertNull(item23);
    }

    @Test
    public void test122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test122");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin((int) '#');
        fPHeapMin1.constroi();
    }

    @Test
    public void test123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test123");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin(100);
        ds.Item[] itemArray2 = new ds.Item[] {};
        fPHeapMin1.copia(itemArray2);
        ds.FPHeapMin fPHeapMin5 = new ds.FPHeapMin(100);
        ds.Item item6 = null;
        ds.Item[] itemArray7 = new ds.Item[] { item6 };
        fPHeapMin5.copia(itemArray7);
        fPHeapMin1.copia(itemArray7);
        ds.FPHeapMin fPHeapMin11 = new ds.FPHeapMin(100);
        ds.Item item12 = null;
        ds.Item[] itemArray13 = new ds.Item[] { item12 };
        fPHeapMin11.copia(itemArray13);
        ds.FPHeapMin fPHeapMin15 = new ds.FPHeapMin(itemArray13);
        fPHeapMin1.copia(itemArray13);
        fPHeapMin1.imprime();
        ds.FPHeapMin fPHeapMin19 = new ds.FPHeapMin(100);
        fPHeapMin19.imprime();
        ds.FPHeapMin fPHeapMin22 = new ds.FPHeapMin(100);
        ds.Item[] itemArray23 = new ds.Item[] {};
        fPHeapMin22.copia(itemArray23);
        ds.FPHeapMin fPHeapMin26 = new ds.FPHeapMin(100);
        ds.Item item27 = null;
        ds.Item[] itemArray28 = new ds.Item[] { item27 };
        fPHeapMin26.copia(itemArray28);
        fPHeapMin22.copia(itemArray28);
        fPHeapMin19.copia(itemArray28);
        ds.FPHeapMin fPHeapMin32 = new ds.FPHeapMin(itemArray28);
        ds.FPHeapMin fPHeapMin33 = new ds.FPHeapMin(itemArray28);
        fPHeapMin1.copia(itemArray28);
        ds.FPHeapMin fPHeapMin36 = new ds.FPHeapMin(100);
        ds.Item[] itemArray37 = new ds.Item[] {};
        fPHeapMin36.copia(itemArray37);
        ds.FPHeapMin fPHeapMin39 = new ds.FPHeapMin(itemArray37);
        fPHeapMin1.copia(itemArray37);
        org.junit.Assert.assertNotNull(itemArray2);
        org.junit.Assert.assertNotNull(itemArray7);
        org.junit.Assert.assertNotNull(itemArray13);
        org.junit.Assert.assertNotNull(itemArray23);
        org.junit.Assert.assertNotNull(itemArray28);
        org.junit.Assert.assertNotNull(itemArray37);
    }

    @Test
    public void test124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test124");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin(100);
        fPHeapMin1.imprime();
        ds.FPHeapMin fPHeapMin4 = new ds.FPHeapMin(100);
        fPHeapMin4.constroi();
        fPHeapMin4.refaz(100, (int) (byte) 100);
        ds.Item[] itemArray9 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin10 = new ds.FPHeapMin(itemArray9);
        ds.FPHeapMin fPHeapMin12 = new ds.FPHeapMin(100);
        ds.Item item13 = null;
        ds.Item[] itemArray14 = new ds.Item[] { item13 };
        fPHeapMin12.copia(itemArray14);
        ds.FPHeapMin fPHeapMin17 = new ds.FPHeapMin(100);
        ds.Item item18 = null;
        ds.Item[] itemArray19 = new ds.Item[] { item18 };
        fPHeapMin17.copia(itemArray19);
        fPHeapMin17.imprime();
        ds.FPHeapMin fPHeapMin23 = new ds.FPHeapMin(100);
        ds.Item[] itemArray24 = new ds.Item[] {};
        fPHeapMin23.copia(itemArray24);
        ds.FPHeapMin fPHeapMin27 = new ds.FPHeapMin(100);
        ds.Item item28 = null;
        ds.Item[] itemArray29 = new ds.Item[] { item28 };
        fPHeapMin27.copia(itemArray29);
        fPHeapMin23.copia(itemArray29);
        fPHeapMin17.copia(itemArray29);
        ds.FPHeapMin fPHeapMin34 = new ds.FPHeapMin(100);
        ds.Item item35 = null;
        ds.Item[] itemArray36 = new ds.Item[] { item35 };
        fPHeapMin34.copia(itemArray36);
        fPHeapMin17.copia(itemArray36);
        fPHeapMin12.copia(itemArray36);
        ds.FPHeapMin fPHeapMin40 = new ds.FPHeapMin(itemArray36);
        fPHeapMin10.copia(itemArray36);
        ds.FPHeapMin fPHeapMin42 = new ds.FPHeapMin(itemArray36);
        fPHeapMin4.copia(itemArray36);
        fPHeapMin1.copia(itemArray36);
        ds.Item item45 = null;
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMin1.insere(item45);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray9);
        org.junit.Assert.assertNotNull(itemArray14);
        org.junit.Assert.assertNotNull(itemArray19);
        org.junit.Assert.assertNotNull(itemArray24);
        org.junit.Assert.assertNotNull(itemArray29);
        org.junit.Assert.assertNotNull(itemArray36);
    }

    @Test
    public void test125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test125");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin(100);
        ds.Item item2 = null;
        ds.Item[] itemArray3 = new ds.Item[] { item2 };
        fPHeapMin1.copia(itemArray3);
        ds.FPHeapMin fPHeapMin6 = new ds.FPHeapMin(100);
        ds.Item item7 = null;
        ds.Item[] itemArray8 = new ds.Item[] { item7 };
        fPHeapMin6.copia(itemArray8);
        fPHeapMin6.imprime();
        ds.FPHeapMin fPHeapMin12 = new ds.FPHeapMin(100);
        ds.Item[] itemArray13 = new ds.Item[] {};
        fPHeapMin12.copia(itemArray13);
        ds.FPHeapMin fPHeapMin16 = new ds.FPHeapMin(100);
        ds.Item item17 = null;
        ds.Item[] itemArray18 = new ds.Item[] { item17 };
        fPHeapMin16.copia(itemArray18);
        fPHeapMin12.copia(itemArray18);
        fPHeapMin6.copia(itemArray18);
        ds.FPHeapMin fPHeapMin23 = new ds.FPHeapMin(100);
        ds.Item item24 = null;
        ds.Item[] itemArray25 = new ds.Item[] { item24 };
        fPHeapMin23.copia(itemArray25);
        fPHeapMin6.copia(itemArray25);
        fPHeapMin1.copia(itemArray25);
        ds.FPHeapMin fPHeapMin29 = new ds.FPHeapMin(itemArray25);
        ds.FPHeapMin fPHeapMin30 = new ds.FPHeapMin(itemArray25);
        ds.FPHeapMin fPHeapMin31 = new ds.FPHeapMin(itemArray25);
        java.lang.Class<?> wildcardClass32 = itemArray25.getClass();
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertNotNull(itemArray8);
        org.junit.Assert.assertNotNull(itemArray13);
        org.junit.Assert.assertNotNull(itemArray18);
        org.junit.Assert.assertNotNull(itemArray25);
        org.junit.Assert.assertNotNull(wildcardClass32);
    }

    @Test
    public void test126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test126");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin((int) (byte) 1);
        java.lang.Class<?> wildcardClass2 = fPHeapMin1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test127");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin(100);
        ds.Item item2 = null;
        ds.Item[] itemArray3 = new ds.Item[] { item2 };
        fPHeapMin1.copia(itemArray3);
        fPHeapMin1.imprime();
        ds.FPHeapMin fPHeapMin7 = new ds.FPHeapMin(100);
        ds.Item[] itemArray8 = new ds.Item[] {};
        fPHeapMin7.copia(itemArray8);
        ds.FPHeapMin fPHeapMin11 = new ds.FPHeapMin(100);
        ds.Item item12 = null;
        ds.Item[] itemArray13 = new ds.Item[] { item12 };
        fPHeapMin11.copia(itemArray13);
        fPHeapMin7.copia(itemArray13);
        fPHeapMin1.copia(itemArray13);
        ds.FPHeapMin fPHeapMin18 = new ds.FPHeapMin(100);
        ds.Item item19 = null;
        ds.Item[] itemArray20 = new ds.Item[] { item19 };
        fPHeapMin18.copia(itemArray20);
        fPHeapMin1.copia(itemArray20);
        fPHeapMin1.imprime();
        ds.Item item24 = fPHeapMin1.min();
        fPHeapMin1.constroi();
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertNotNull(itemArray8);
        org.junit.Assert.assertNotNull(itemArray13);
        org.junit.Assert.assertNotNull(itemArray20);
        org.junit.Assert.assertNull(item24);
    }

    @Test
    public void test128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test128");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin(100);
        fPHeapMin1.imprime();
        ds.FPHeapMin fPHeapMin4 = new ds.FPHeapMin(100);
        ds.Item[] itemArray5 = new ds.Item[] {};
        fPHeapMin4.copia(itemArray5);
        ds.FPHeapMin fPHeapMin8 = new ds.FPHeapMin(100);
        ds.Item item9 = null;
        ds.Item[] itemArray10 = new ds.Item[] { item9 };
        fPHeapMin8.copia(itemArray10);
        fPHeapMin4.copia(itemArray10);
        fPHeapMin1.copia(itemArray10);
        ds.FPHeapMin fPHeapMin15 = new ds.FPHeapMin(100);
        ds.Item item16 = null;
        ds.Item[] itemArray17 = new ds.Item[] { item16 };
        fPHeapMin15.copia(itemArray17);
        fPHeapMin15.imprime();
        ds.FPHeapMin fPHeapMin21 = new ds.FPHeapMin(100);
        ds.Item[] itemArray22 = new ds.Item[] {};
        fPHeapMin21.copia(itemArray22);
        ds.FPHeapMin fPHeapMin25 = new ds.FPHeapMin(100);
        ds.Item item26 = null;
        ds.Item[] itemArray27 = new ds.Item[] { item26 };
        fPHeapMin25.copia(itemArray27);
        fPHeapMin21.copia(itemArray27);
        fPHeapMin15.copia(itemArray27);
        ds.FPHeapMin fPHeapMin31 = new ds.FPHeapMin(itemArray27);
        fPHeapMin1.copia(itemArray27);
        ds.FPHeapMin fPHeapMin33 = new ds.FPHeapMin(itemArray27);
        // The following exception was thrown during execution in test generation
        try {
            ds.Item item34 = fPHeapMin33.min();
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray5);
        org.junit.Assert.assertNotNull(itemArray10);
        org.junit.Assert.assertNotNull(itemArray17);
        org.junit.Assert.assertNotNull(itemArray22);
        org.junit.Assert.assertNotNull(itemArray27);
    }

    @Test
    public void test129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test129");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin(100);
        ds.Item[] itemArray2 = new ds.Item[] {};
        fPHeapMin1.copia(itemArray2);
        ds.FPHeapMin fPHeapMin4 = new ds.FPHeapMin(itemArray2);
        fPHeapMin4.imprime();
        fPHeapMin4.constroi();
        fPHeapMin4.imprime();
        org.junit.Assert.assertNotNull(itemArray2);
    }

    @Test
    public void test130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test130");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin(100);
        ds.Item item2 = null;
        ds.Item[] itemArray3 = new ds.Item[] { item2 };
        fPHeapMin1.copia(itemArray3);
        fPHeapMin1.imprime();
        ds.FPHeapMin fPHeapMin7 = new ds.FPHeapMin(100);
        ds.Item[] itemArray8 = new ds.Item[] {};
        fPHeapMin7.copia(itemArray8);
        ds.FPHeapMin fPHeapMin11 = new ds.FPHeapMin(100);
        ds.Item item12 = null;
        ds.Item[] itemArray13 = new ds.Item[] { item12 };
        fPHeapMin11.copia(itemArray13);
        fPHeapMin7.copia(itemArray13);
        fPHeapMin1.copia(itemArray13);
        ds.FPHeapMin fPHeapMin18 = new ds.FPHeapMin(100);
        fPHeapMin18.imprime();
        ds.FPHeapMin fPHeapMin21 = new ds.FPHeapMin(100);
        ds.Item[] itemArray22 = new ds.Item[] {};
        fPHeapMin21.copia(itemArray22);
        ds.FPHeapMin fPHeapMin25 = new ds.FPHeapMin(100);
        ds.Item item26 = null;
        ds.Item[] itemArray27 = new ds.Item[] { item26 };
        fPHeapMin25.copia(itemArray27);
        fPHeapMin21.copia(itemArray27);
        fPHeapMin18.copia(itemArray27);
        fPHeapMin1.copia(itemArray27);
        ds.FPHeapMin fPHeapMin33 = new ds.FPHeapMin(100);
        ds.Item item34 = null;
        ds.Item[] itemArray35 = new ds.Item[] { item34 };
        fPHeapMin33.copia(itemArray35);
        fPHeapMin33.imprime();
        ds.FPHeapMin fPHeapMin39 = new ds.FPHeapMin(100);
        ds.Item[] itemArray40 = new ds.Item[] {};
        fPHeapMin39.copia(itemArray40);
        ds.FPHeapMin fPHeapMin43 = new ds.FPHeapMin(100);
        ds.Item item44 = null;
        ds.Item[] itemArray45 = new ds.Item[] { item44 };
        fPHeapMin43.copia(itemArray45);
        fPHeapMin39.copia(itemArray45);
        fPHeapMin33.copia(itemArray45);
        ds.FPHeapMin fPHeapMin50 = new ds.FPHeapMin(100);
        fPHeapMin50.imprime();
        ds.FPHeapMin fPHeapMin53 = new ds.FPHeapMin(100);
        ds.Item[] itemArray54 = new ds.Item[] {};
        fPHeapMin53.copia(itemArray54);
        ds.FPHeapMin fPHeapMin57 = new ds.FPHeapMin(100);
        ds.Item item58 = null;
        ds.Item[] itemArray59 = new ds.Item[] { item58 };
        fPHeapMin57.copia(itemArray59);
        fPHeapMin53.copia(itemArray59);
        fPHeapMin50.copia(itemArray59);
        fPHeapMin33.copia(itemArray59);
        ds.Item item64 = fPHeapMin33.min();
        ds.FPHeapMin fPHeapMin66 = new ds.FPHeapMin(100);
        ds.Item item67 = null;
        ds.Item[] itemArray68 = new ds.Item[] { item67 };
        fPHeapMin66.copia(itemArray68);
        ds.FPHeapMin fPHeapMin71 = new ds.FPHeapMin(100);
        ds.Item item72 = null;
        ds.Item[] itemArray73 = new ds.Item[] { item72 };
        fPHeapMin71.copia(itemArray73);
        fPHeapMin71.imprime();
        ds.FPHeapMin fPHeapMin77 = new ds.FPHeapMin(100);
        ds.Item[] itemArray78 = new ds.Item[] {};
        fPHeapMin77.copia(itemArray78);
        ds.FPHeapMin fPHeapMin81 = new ds.FPHeapMin(100);
        ds.Item item82 = null;
        ds.Item[] itemArray83 = new ds.Item[] { item82 };
        fPHeapMin81.copia(itemArray83);
        fPHeapMin77.copia(itemArray83);
        fPHeapMin71.copia(itemArray83);
        ds.FPHeapMin fPHeapMin88 = new ds.FPHeapMin(100);
        ds.Item item89 = null;
        ds.Item[] itemArray90 = new ds.Item[] { item89 };
        fPHeapMin88.copia(itemArray90);
        fPHeapMin71.copia(itemArray90);
        fPHeapMin66.copia(itemArray90);
        ds.FPHeapMin fPHeapMin94 = new ds.FPHeapMin(itemArray90);
        ds.FPHeapMin fPHeapMin95 = new ds.FPHeapMin(itemArray90);
        ds.FPHeapMin fPHeapMin96 = new ds.FPHeapMin(itemArray90);
        ds.FPHeapMin fPHeapMin97 = new ds.FPHeapMin(itemArray90);
        fPHeapMin33.copia(itemArray90);
        fPHeapMin1.copia(itemArray90);
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertNotNull(itemArray8);
        org.junit.Assert.assertNotNull(itemArray13);
        org.junit.Assert.assertNotNull(itemArray22);
        org.junit.Assert.assertNotNull(itemArray27);
        org.junit.Assert.assertNotNull(itemArray35);
        org.junit.Assert.assertNotNull(itemArray40);
        org.junit.Assert.assertNotNull(itemArray45);
        org.junit.Assert.assertNotNull(itemArray54);
        org.junit.Assert.assertNotNull(itemArray59);
        org.junit.Assert.assertNull(item64);
        org.junit.Assert.assertNotNull(itemArray68);
        org.junit.Assert.assertNotNull(itemArray73);
        org.junit.Assert.assertNotNull(itemArray78);
        org.junit.Assert.assertNotNull(itemArray83);
        org.junit.Assert.assertNotNull(itemArray90);
    }

    @Test
    public void test131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test131");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin(100);
        ds.Item item2 = null;
        ds.Item[] itemArray3 = new ds.Item[] { item2 };
        fPHeapMin1.copia(itemArray3);
        fPHeapMin1.imprime();
        fPHeapMin1.imprime();
        fPHeapMin1.imprime();
        ds.Item[] itemArray8 = null;
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMin1.copia(itemArray8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray3);
    }

    @Test
    public void test132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test132");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin(100);
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
    public void test133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test133");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin(100);
        ds.Item item2 = null;
        ds.Item[] itemArray3 = new ds.Item[] { item2 };
        fPHeapMin1.copia(itemArray3);
        fPHeapMin1.imprime();
        ds.FPHeapMin fPHeapMin7 = new ds.FPHeapMin(100);
        ds.Item[] itemArray8 = new ds.Item[] {};
        fPHeapMin7.copia(itemArray8);
        ds.FPHeapMin fPHeapMin11 = new ds.FPHeapMin(100);
        ds.Item item12 = null;
        ds.Item[] itemArray13 = new ds.Item[] { item12 };
        fPHeapMin11.copia(itemArray13);
        fPHeapMin7.copia(itemArray13);
        fPHeapMin1.copia(itemArray13);
        fPHeapMin1.imprime();
        ds.Item item18 = null;
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMin1.insere(item18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertNotNull(itemArray8);
        org.junit.Assert.assertNotNull(itemArray13);
    }

    @Test
    public void test134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test134");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin(100);
        ds.Item[] itemArray2 = new ds.Item[] {};
        fPHeapMin1.copia(itemArray2);
        fPHeapMin1.refaz((int) (byte) 100, (int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            ds.Item item7 = fPHeapMin1.retiraMin();
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: heap vazio");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray2);
    }

    @Test
    public void test135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test135");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin(100);
        ds.Item item2 = null;
        ds.Item[] itemArray3 = new ds.Item[] { item2 };
        fPHeapMin1.copia(itemArray3);
        fPHeapMin1.imprime();
        ds.FPHeapMin fPHeapMin7 = new ds.FPHeapMin(100);
        ds.Item[] itemArray8 = new ds.Item[] {};
        fPHeapMin7.copia(itemArray8);
        ds.FPHeapMin fPHeapMin11 = new ds.FPHeapMin(100);
        ds.Item item12 = null;
        ds.Item[] itemArray13 = new ds.Item[] { item12 };
        fPHeapMin11.copia(itemArray13);
        fPHeapMin7.copia(itemArray13);
        fPHeapMin1.copia(itemArray13);
        ds.FPHeapMin fPHeapMin18 = new ds.FPHeapMin(100);
        fPHeapMin18.imprime();
        ds.FPHeapMin fPHeapMin21 = new ds.FPHeapMin(100);
        ds.Item[] itemArray22 = new ds.Item[] {};
        fPHeapMin21.copia(itemArray22);
        ds.FPHeapMin fPHeapMin25 = new ds.FPHeapMin(100);
        ds.Item item26 = null;
        ds.Item[] itemArray27 = new ds.Item[] { item26 };
        fPHeapMin25.copia(itemArray27);
        fPHeapMin21.copia(itemArray27);
        fPHeapMin18.copia(itemArray27);
        fPHeapMin1.copia(itemArray27);
        ds.Item item32 = fPHeapMin1.min();
        ds.FPHeapMin fPHeapMin34 = new ds.FPHeapMin(100);
        ds.Item item35 = null;
        ds.Item[] itemArray36 = new ds.Item[] { item35 };
        fPHeapMin34.copia(itemArray36);
        ds.FPHeapMin fPHeapMin39 = new ds.FPHeapMin(100);
        ds.Item item40 = null;
        ds.Item[] itemArray41 = new ds.Item[] { item40 };
        fPHeapMin39.copia(itemArray41);
        fPHeapMin39.imprime();
        ds.FPHeapMin fPHeapMin45 = new ds.FPHeapMin(100);
        ds.Item[] itemArray46 = new ds.Item[] {};
        fPHeapMin45.copia(itemArray46);
        ds.FPHeapMin fPHeapMin49 = new ds.FPHeapMin(100);
        ds.Item item50 = null;
        ds.Item[] itemArray51 = new ds.Item[] { item50 };
        fPHeapMin49.copia(itemArray51);
        fPHeapMin45.copia(itemArray51);
        fPHeapMin39.copia(itemArray51);
        ds.FPHeapMin fPHeapMin56 = new ds.FPHeapMin(100);
        ds.Item item57 = null;
        ds.Item[] itemArray58 = new ds.Item[] { item57 };
        fPHeapMin56.copia(itemArray58);
        fPHeapMin39.copia(itemArray58);
        fPHeapMin34.copia(itemArray58);
        ds.FPHeapMin fPHeapMin62 = new ds.FPHeapMin(itemArray58);
        ds.FPHeapMin fPHeapMin63 = new ds.FPHeapMin(itemArray58);
        ds.FPHeapMin fPHeapMin64 = new ds.FPHeapMin(itemArray58);
        ds.FPHeapMin fPHeapMin65 = new ds.FPHeapMin(itemArray58);
        fPHeapMin1.copia(itemArray58);
        fPHeapMin1.imprime();
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertNotNull(itemArray8);
        org.junit.Assert.assertNotNull(itemArray13);
        org.junit.Assert.assertNotNull(itemArray22);
        org.junit.Assert.assertNotNull(itemArray27);
        org.junit.Assert.assertNull(item32);
        org.junit.Assert.assertNotNull(itemArray36);
        org.junit.Assert.assertNotNull(itemArray41);
        org.junit.Assert.assertNotNull(itemArray46);
        org.junit.Assert.assertNotNull(itemArray51);
        org.junit.Assert.assertNotNull(itemArray58);
    }

    @Test
    public void test136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test136");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin((-1));
        ds.FPHeapMin fPHeapMin3 = new ds.FPHeapMin(100);
        ds.Item item4 = null;
        ds.Item[] itemArray5 = new ds.Item[] { item4 };
        fPHeapMin3.copia(itemArray5);
        ds.FPHeapMin fPHeapMin8 = new ds.FPHeapMin(100);
        ds.Item item9 = null;
        ds.Item[] itemArray10 = new ds.Item[] { item9 };
        fPHeapMin8.copia(itemArray10);
        fPHeapMin8.imprime();
        ds.FPHeapMin fPHeapMin14 = new ds.FPHeapMin(100);
        ds.Item[] itemArray15 = new ds.Item[] {};
        fPHeapMin14.copia(itemArray15);
        ds.FPHeapMin fPHeapMin18 = new ds.FPHeapMin(100);
        ds.Item item19 = null;
        ds.Item[] itemArray20 = new ds.Item[] { item19 };
        fPHeapMin18.copia(itemArray20);
        fPHeapMin14.copia(itemArray20);
        fPHeapMin8.copia(itemArray20);
        ds.FPHeapMin fPHeapMin25 = new ds.FPHeapMin(100);
        ds.Item item26 = null;
        ds.Item[] itemArray27 = new ds.Item[] { item26 };
        fPHeapMin25.copia(itemArray27);
        fPHeapMin8.copia(itemArray27);
        fPHeapMin3.copia(itemArray27);
        ds.FPHeapMin fPHeapMin31 = new ds.FPHeapMin(itemArray27);
        ds.FPHeapMin fPHeapMin32 = new ds.FPHeapMin(itemArray27);
        ds.FPHeapMin fPHeapMin33 = new ds.FPHeapMin(itemArray27);
        ds.FPHeapMin fPHeapMin34 = new ds.FPHeapMin(itemArray27);
        fPHeapMin1.copia(itemArray27);
        // The following exception was thrown during execution in test generation
        try {
            ds.Item item36 = fPHeapMin1.min();
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray5);
        org.junit.Assert.assertNotNull(itemArray10);
        org.junit.Assert.assertNotNull(itemArray15);
        org.junit.Assert.assertNotNull(itemArray20);
        org.junit.Assert.assertNotNull(itemArray27);
    }

    @Test
    public void test137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test137");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin(100);
        ds.Item[] itemArray2 = new ds.Item[] {};
        fPHeapMin1.copia(itemArray2);
        ds.FPHeapMin fPHeapMin5 = new ds.FPHeapMin(100);
        ds.Item item6 = null;
        ds.Item[] itemArray7 = new ds.Item[] { item6 };
        fPHeapMin5.copia(itemArray7);
        fPHeapMin1.copia(itemArray7);
        ds.FPHeapMin fPHeapMin11 = new ds.FPHeapMin(100);
        ds.Item item12 = null;
        ds.Item[] itemArray13 = new ds.Item[] { item12 };
        fPHeapMin11.copia(itemArray13);
        ds.FPHeapMin fPHeapMin15 = new ds.FPHeapMin(itemArray13);
        fPHeapMin1.copia(itemArray13);
        fPHeapMin1.imprime();
        // The following exception was thrown during execution in test generation
        try {
            ds.Item item18 = fPHeapMin1.retiraMin();
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: heap vazio");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray2);
        org.junit.Assert.assertNotNull(itemArray7);
        org.junit.Assert.assertNotNull(itemArray13);
    }

    @Test
    public void test138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test138");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin(100);
        ds.Item[] itemArray2 = new ds.Item[] {};
        fPHeapMin1.copia(itemArray2);
        ds.FPHeapMin fPHeapMin5 = new ds.FPHeapMin(100);
        ds.Item item6 = null;
        ds.Item[] itemArray7 = new ds.Item[] { item6 };
        fPHeapMin5.copia(itemArray7);
        fPHeapMin1.copia(itemArray7);
        ds.FPHeapMin fPHeapMin11 = new ds.FPHeapMin(100);
        ds.Item item12 = null;
        ds.Item[] itemArray13 = new ds.Item[] { item12 };
        fPHeapMin11.copia(itemArray13);
        ds.FPHeapMin fPHeapMin15 = new ds.FPHeapMin(itemArray13);
        fPHeapMin1.copia(itemArray13);
        fPHeapMin1.imprime();
        fPHeapMin1.imprime();
        org.junit.Assert.assertNotNull(itemArray2);
        org.junit.Assert.assertNotNull(itemArray7);
        org.junit.Assert.assertNotNull(itemArray13);
    }

    @Test
    public void test139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test139");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin(100);
        ds.Item item2 = null;
        ds.Item[] itemArray3 = new ds.Item[] { item2 };
        fPHeapMin1.copia(itemArray3);
        fPHeapMin1.imprime();
        ds.FPHeapMin fPHeapMin7 = new ds.FPHeapMin(100);
        ds.Item[] itemArray8 = new ds.Item[] {};
        fPHeapMin7.copia(itemArray8);
        ds.FPHeapMin fPHeapMin11 = new ds.FPHeapMin(100);
        ds.Item item12 = null;
        ds.Item[] itemArray13 = new ds.Item[] { item12 };
        fPHeapMin11.copia(itemArray13);
        fPHeapMin7.copia(itemArray13);
        fPHeapMin1.copia(itemArray13);
        ds.FPHeapMin fPHeapMin18 = new ds.FPHeapMin(100);
        fPHeapMin18.imprime();
        ds.FPHeapMin fPHeapMin21 = new ds.FPHeapMin(100);
        ds.Item[] itemArray22 = new ds.Item[] {};
        fPHeapMin21.copia(itemArray22);
        ds.FPHeapMin fPHeapMin25 = new ds.FPHeapMin(100);
        ds.Item item26 = null;
        ds.Item[] itemArray27 = new ds.Item[] { item26 };
        fPHeapMin25.copia(itemArray27);
        fPHeapMin21.copia(itemArray27);
        fPHeapMin18.copia(itemArray27);
        fPHeapMin1.copia(itemArray27);
        ds.FPHeapMin fPHeapMin32 = new ds.FPHeapMin(itemArray27);
        java.lang.Class<?> wildcardClass33 = fPHeapMin32.getClass();
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertNotNull(itemArray8);
        org.junit.Assert.assertNotNull(itemArray13);
        org.junit.Assert.assertNotNull(itemArray22);
        org.junit.Assert.assertNotNull(itemArray27);
        org.junit.Assert.assertNotNull(wildcardClass33);
    }

    @Test
    public void test140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test140");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin(100);
        fPHeapMin1.imprime();
        ds.Item[] itemArray3 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin4 = new ds.FPHeapMin(itemArray3);
        ds.FPHeapMin fPHeapMin6 = new ds.FPHeapMin(100);
        ds.Item item7 = null;
        ds.Item[] itemArray8 = new ds.Item[] { item7 };
        fPHeapMin6.copia(itemArray8);
        ds.FPHeapMin fPHeapMin11 = new ds.FPHeapMin(100);
        ds.Item item12 = null;
        ds.Item[] itemArray13 = new ds.Item[] { item12 };
        fPHeapMin11.copia(itemArray13);
        fPHeapMin11.imprime();
        ds.FPHeapMin fPHeapMin17 = new ds.FPHeapMin(100);
        ds.Item[] itemArray18 = new ds.Item[] {};
        fPHeapMin17.copia(itemArray18);
        ds.FPHeapMin fPHeapMin21 = new ds.FPHeapMin(100);
        ds.Item item22 = null;
        ds.Item[] itemArray23 = new ds.Item[] { item22 };
        fPHeapMin21.copia(itemArray23);
        fPHeapMin17.copia(itemArray23);
        fPHeapMin11.copia(itemArray23);
        ds.FPHeapMin fPHeapMin28 = new ds.FPHeapMin(100);
        ds.Item item29 = null;
        ds.Item[] itemArray30 = new ds.Item[] { item29 };
        fPHeapMin28.copia(itemArray30);
        fPHeapMin11.copia(itemArray30);
        fPHeapMin6.copia(itemArray30);
        ds.FPHeapMin fPHeapMin34 = new ds.FPHeapMin(itemArray30);
        fPHeapMin4.copia(itemArray30);
        ds.FPHeapMin fPHeapMin37 = new ds.FPHeapMin(100);
        ds.Item item38 = null;
        ds.Item[] itemArray39 = new ds.Item[] { item38 };
        fPHeapMin37.copia(itemArray39);
        fPHeapMin4.copia(itemArray39);
        fPHeapMin1.copia(itemArray39);
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertNotNull(itemArray8);
        org.junit.Assert.assertNotNull(itemArray13);
        org.junit.Assert.assertNotNull(itemArray18);
        org.junit.Assert.assertNotNull(itemArray23);
        org.junit.Assert.assertNotNull(itemArray30);
        org.junit.Assert.assertNotNull(itemArray39);
    }

    @Test
    public void test141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test141");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin(100);
        ds.Item item2 = null;
        ds.Item[] itemArray3 = new ds.Item[] { item2 };
        fPHeapMin1.copia(itemArray3);
        ds.FPHeapMin fPHeapMin6 = new ds.FPHeapMin(100);
        ds.Item item7 = null;
        ds.Item[] itemArray8 = new ds.Item[] { item7 };
        fPHeapMin6.copia(itemArray8);
        fPHeapMin6.imprime();
        ds.FPHeapMin fPHeapMin12 = new ds.FPHeapMin(100);
        ds.Item[] itemArray13 = new ds.Item[] {};
        fPHeapMin12.copia(itemArray13);
        ds.FPHeapMin fPHeapMin16 = new ds.FPHeapMin(100);
        ds.Item item17 = null;
        ds.Item[] itemArray18 = new ds.Item[] { item17 };
        fPHeapMin16.copia(itemArray18);
        fPHeapMin12.copia(itemArray18);
        fPHeapMin6.copia(itemArray18);
        ds.FPHeapMin fPHeapMin23 = new ds.FPHeapMin(100);
        ds.Item item24 = null;
        ds.Item[] itemArray25 = new ds.Item[] { item24 };
        fPHeapMin23.copia(itemArray25);
        fPHeapMin6.copia(itemArray25);
        fPHeapMin1.copia(itemArray25);
        fPHeapMin1.imprime();
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertNotNull(itemArray8);
        org.junit.Assert.assertNotNull(itemArray13);
        org.junit.Assert.assertNotNull(itemArray18);
        org.junit.Assert.assertNotNull(itemArray25);
    }

    @Test
    public void test142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test142");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin(100);
        fPHeapMin1.constroi();
        ds.FPHeapMin fPHeapMin4 = new ds.FPHeapMin(100);
        fPHeapMin4.imprime();
        ds.FPHeapMin fPHeapMin7 = new ds.FPHeapMin(100);
        ds.Item[] itemArray8 = new ds.Item[] {};
        fPHeapMin7.copia(itemArray8);
        ds.FPHeapMin fPHeapMin11 = new ds.FPHeapMin(100);
        ds.Item item12 = null;
        ds.Item[] itemArray13 = new ds.Item[] { item12 };
        fPHeapMin11.copia(itemArray13);
        fPHeapMin7.copia(itemArray13);
        fPHeapMin4.copia(itemArray13);
        ds.FPHeapMin fPHeapMin17 = new ds.FPHeapMin(itemArray13);
        ds.FPHeapMin fPHeapMin18 = new ds.FPHeapMin(itemArray13);
        fPHeapMin1.copia(itemArray13);
        java.lang.Class<?> wildcardClass20 = fPHeapMin1.getClass();
        org.junit.Assert.assertNotNull(itemArray8);
        org.junit.Assert.assertNotNull(itemArray13);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test143");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin(100);
        ds.Item item2 = null;
        ds.Item[] itemArray3 = new ds.Item[] { item2 };
        fPHeapMin1.copia(itemArray3);
        fPHeapMin1.imprime();
        ds.FPHeapMin fPHeapMin7 = new ds.FPHeapMin(100);
        ds.Item[] itemArray8 = new ds.Item[] {};
        fPHeapMin7.copia(itemArray8);
        ds.FPHeapMin fPHeapMin11 = new ds.FPHeapMin(100);
        ds.Item item12 = null;
        ds.Item[] itemArray13 = new ds.Item[] { item12 };
        fPHeapMin11.copia(itemArray13);
        fPHeapMin7.copia(itemArray13);
        fPHeapMin1.copia(itemArray13);
        ds.FPHeapMin fPHeapMin18 = new ds.FPHeapMin(100);
        ds.Item item19 = null;
        ds.Item[] itemArray20 = new ds.Item[] { item19 };
        fPHeapMin18.copia(itemArray20);
        fPHeapMin1.copia(itemArray20);
        ds.FPHeapMin fPHeapMin23 = new ds.FPHeapMin(itemArray20);
        // The following exception was thrown during execution in test generation
        try {
            ds.Item item24 = fPHeapMin23.retiraMin();
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: heap vazio");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertNotNull(itemArray8);
        org.junit.Assert.assertNotNull(itemArray13);
        org.junit.Assert.assertNotNull(itemArray20);
    }

    @Test
    public void test144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test144");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin(100);
        ds.Item item2 = null;
        ds.Item[] itemArray3 = new ds.Item[] { item2 };
        fPHeapMin1.copia(itemArray3);
        fPHeapMin1.imprime();
        fPHeapMin1.constroi();
        fPHeapMin1.constroi();
        ds.FPHeapMin fPHeapMin9 = new ds.FPHeapMin(100);
        ds.Item[] itemArray10 = new ds.Item[] {};
        fPHeapMin9.copia(itemArray10);
        ds.FPHeapMin fPHeapMin13 = new ds.FPHeapMin(100);
        ds.Item item14 = null;
        ds.Item[] itemArray15 = new ds.Item[] { item14 };
        fPHeapMin13.copia(itemArray15);
        fPHeapMin9.copia(itemArray15);
        ds.FPHeapMin fPHeapMin19 = new ds.FPHeapMin(100);
        ds.Item item20 = null;
        ds.Item[] itemArray21 = new ds.Item[] { item20 };
        fPHeapMin19.copia(itemArray21);
        ds.FPHeapMin fPHeapMin23 = new ds.FPHeapMin(itemArray21);
        fPHeapMin9.copia(itemArray21);
        fPHeapMin1.copia(itemArray21);
        fPHeapMin1.refaz((int) (byte) 10, (int) (byte) 0);
        ds.FPHeapMin fPHeapMin31 = new ds.FPHeapMin((int) (short) 1);
        fPHeapMin31.imprime();
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMin1.diminuiChave((int) (short) 1, (java.lang.Object) fPHeapMin31);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertNotNull(itemArray10);
        org.junit.Assert.assertNotNull(itemArray15);
        org.junit.Assert.assertNotNull(itemArray21);
    }

    @Test
    public void test145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test145");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin(100);
        ds.Item[] itemArray2 = new ds.Item[] {};
        fPHeapMin1.copia(itemArray2);
        ds.FPHeapMin fPHeapMin5 = new ds.FPHeapMin(100);
        ds.Item item6 = null;
        ds.Item[] itemArray7 = new ds.Item[] { item6 };
        fPHeapMin5.copia(itemArray7);
        fPHeapMin1.copia(itemArray7);
        ds.FPHeapMin fPHeapMin11 = new ds.FPHeapMin(100);
        ds.Item item12 = null;
        ds.Item[] itemArray13 = new ds.Item[] { item12 };
        fPHeapMin11.copia(itemArray13);
        ds.FPHeapMin fPHeapMin15 = new ds.FPHeapMin(itemArray13);
        fPHeapMin1.copia(itemArray13);
        ds.FPHeapMin fPHeapMin19 = new ds.FPHeapMin(100);
        ds.Item item20 = null;
        ds.Item[] itemArray21 = new ds.Item[] { item20 };
        fPHeapMin19.copia(itemArray21);
        fPHeapMin19.imprime();
        fPHeapMin19.imprime();
        ds.FPHeapMin fPHeapMin26 = new ds.FPHeapMin(100);
        ds.Item item27 = null;
        ds.Item[] itemArray28 = new ds.Item[] { item27 };
        fPHeapMin26.copia(itemArray28);
        ds.FPHeapMin fPHeapMin31 = new ds.FPHeapMin(100);
        ds.Item item32 = null;
        ds.Item[] itemArray33 = new ds.Item[] { item32 };
        fPHeapMin31.copia(itemArray33);
        fPHeapMin31.imprime();
        ds.FPHeapMin fPHeapMin37 = new ds.FPHeapMin(100);
        ds.Item[] itemArray38 = new ds.Item[] {};
        fPHeapMin37.copia(itemArray38);
        ds.FPHeapMin fPHeapMin41 = new ds.FPHeapMin(100);
        ds.Item item42 = null;
        ds.Item[] itemArray43 = new ds.Item[] { item42 };
        fPHeapMin41.copia(itemArray43);
        fPHeapMin37.copia(itemArray43);
        fPHeapMin31.copia(itemArray43);
        ds.FPHeapMin fPHeapMin48 = new ds.FPHeapMin(100);
        ds.Item item49 = null;
        ds.Item[] itemArray50 = new ds.Item[] { item49 };
        fPHeapMin48.copia(itemArray50);
        fPHeapMin31.copia(itemArray50);
        fPHeapMin26.copia(itemArray50);
        fPHeapMin19.copia(itemArray50);
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMin1.diminuiChave((int) (short) 1, (java.lang.Object) fPHeapMin19);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray2);
        org.junit.Assert.assertNotNull(itemArray7);
        org.junit.Assert.assertNotNull(itemArray13);
        org.junit.Assert.assertNotNull(itemArray21);
        org.junit.Assert.assertNotNull(itemArray28);
        org.junit.Assert.assertNotNull(itemArray33);
        org.junit.Assert.assertNotNull(itemArray38);
        org.junit.Assert.assertNotNull(itemArray43);
        org.junit.Assert.assertNotNull(itemArray50);
    }

    @Test
    public void test146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test146");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin(100);
        ds.Item item2 = null;
        ds.Item[] itemArray3 = new ds.Item[] { item2 };
        fPHeapMin1.copia(itemArray3);
        ds.FPHeapMin fPHeapMin6 = new ds.FPHeapMin(100);
        ds.Item item7 = null;
        ds.Item[] itemArray8 = new ds.Item[] { item7 };
        fPHeapMin6.copia(itemArray8);
        fPHeapMin6.imprime();
        ds.FPHeapMin fPHeapMin12 = new ds.FPHeapMin(100);
        ds.Item[] itemArray13 = new ds.Item[] {};
        fPHeapMin12.copia(itemArray13);
        ds.FPHeapMin fPHeapMin16 = new ds.FPHeapMin(100);
        ds.Item item17 = null;
        ds.Item[] itemArray18 = new ds.Item[] { item17 };
        fPHeapMin16.copia(itemArray18);
        fPHeapMin12.copia(itemArray18);
        fPHeapMin6.copia(itemArray18);
        ds.FPHeapMin fPHeapMin23 = new ds.FPHeapMin(100);
        ds.Item item24 = null;
        ds.Item[] itemArray25 = new ds.Item[] { item24 };
        fPHeapMin23.copia(itemArray25);
        fPHeapMin6.copia(itemArray25);
        fPHeapMin1.copia(itemArray25);
        ds.FPHeapMin fPHeapMin29 = new ds.FPHeapMin(itemArray25);
        ds.FPHeapMin fPHeapMin30 = new ds.FPHeapMin(itemArray25);
        ds.FPHeapMin fPHeapMin31 = new ds.FPHeapMin(itemArray25);
        ds.FPHeapMin fPHeapMin32 = new ds.FPHeapMin(itemArray25);
        fPHeapMin32.imprime();
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertNotNull(itemArray8);
        org.junit.Assert.assertNotNull(itemArray13);
        org.junit.Assert.assertNotNull(itemArray18);
        org.junit.Assert.assertNotNull(itemArray25);
    }

    @Test
    public void test147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test147");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin(100);
        ds.Item[] itemArray2 = new ds.Item[] {};
        fPHeapMin1.copia(itemArray2);
        ds.FPHeapMin fPHeapMin4 = new ds.FPHeapMin(itemArray2);
        fPHeapMin4.imprime();
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMin4.refaz((int) (short) -1, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray2);
    }

    @Test
    public void test148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test148");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin(100);
        ds.Item item2 = null;
        ds.Item[] itemArray3 = new ds.Item[] { item2 };
        fPHeapMin1.copia(itemArray3);
        ds.FPHeapMin fPHeapMin6 = new ds.FPHeapMin(100);
        ds.Item item7 = null;
        ds.Item[] itemArray8 = new ds.Item[] { item7 };
        fPHeapMin6.copia(itemArray8);
        fPHeapMin6.imprime();
        ds.FPHeapMin fPHeapMin12 = new ds.FPHeapMin(100);
        ds.Item[] itemArray13 = new ds.Item[] {};
        fPHeapMin12.copia(itemArray13);
        ds.FPHeapMin fPHeapMin16 = new ds.FPHeapMin(100);
        ds.Item item17 = null;
        ds.Item[] itemArray18 = new ds.Item[] { item17 };
        fPHeapMin16.copia(itemArray18);
        fPHeapMin12.copia(itemArray18);
        fPHeapMin6.copia(itemArray18);
        ds.FPHeapMin fPHeapMin23 = new ds.FPHeapMin(100);
        ds.Item item24 = null;
        ds.Item[] itemArray25 = new ds.Item[] { item24 };
        fPHeapMin23.copia(itemArray25);
        fPHeapMin6.copia(itemArray25);
        fPHeapMin1.copia(itemArray25);
        fPHeapMin1.constroi();
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMin1.refaz((int) (byte) 0, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertNotNull(itemArray8);
        org.junit.Assert.assertNotNull(itemArray13);
        org.junit.Assert.assertNotNull(itemArray18);
        org.junit.Assert.assertNotNull(itemArray25);
    }

    @Test
    public void test149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test149");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin(100);
        fPHeapMin1.imprime();
        ds.FPHeapMin fPHeapMin4 = new ds.FPHeapMin(100);
        ds.Item[] itemArray5 = new ds.Item[] {};
        fPHeapMin4.copia(itemArray5);
        ds.FPHeapMin fPHeapMin8 = new ds.FPHeapMin(100);
        ds.Item item9 = null;
        ds.Item[] itemArray10 = new ds.Item[] { item9 };
        fPHeapMin8.copia(itemArray10);
        fPHeapMin4.copia(itemArray10);
        fPHeapMin1.copia(itemArray10);
        ds.FPHeapMin fPHeapMin14 = new ds.FPHeapMin(itemArray10);
        // The following exception was thrown during execution in test generation
        try {
            ds.Item item15 = fPHeapMin14.retiraMin();
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: heap vazio");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray5);
        org.junit.Assert.assertNotNull(itemArray10);
    }

    @Test
    public void test150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test150");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin(100);
        ds.Item item2 = null;
        ds.Item[] itemArray3 = new ds.Item[] { item2 };
        fPHeapMin1.copia(itemArray3);
        fPHeapMin1.imprime();
        ds.Item item6 = fPHeapMin1.min();
        fPHeapMin1.constroi();
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertNull(item6);
    }

    @Test
    public void test151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test151");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin((-1));
        fPHeapMin1.imprime();
        java.lang.Class<?> wildcardClass3 = fPHeapMin1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test152");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin(100);
        ds.Item[] itemArray2 = new ds.Item[] {};
        fPHeapMin1.copia(itemArray2);
        ds.FPHeapMin fPHeapMin5 = new ds.FPHeapMin(100);
        ds.Item item6 = null;
        ds.Item[] itemArray7 = new ds.Item[] { item6 };
        fPHeapMin5.copia(itemArray7);
        fPHeapMin1.copia(itemArray7);
        fPHeapMin1.imprime();
        ds.Item item11 = fPHeapMin1.min();
        fPHeapMin1.constroi();
        fPHeapMin1.constroi();
        fPHeapMin1.imprime();
        ds.Item item15 = null;
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMin1.insere(item15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray2);
        org.junit.Assert.assertNotNull(itemArray7);
        org.junit.Assert.assertNull(item11);
    }

    @Test
    public void test153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test153");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin(100);
        ds.Item item2 = null;
        ds.Item[] itemArray3 = new ds.Item[] { item2 };
        fPHeapMin1.copia(itemArray3);
        fPHeapMin1.imprime();
        ds.FPHeapMin fPHeapMin7 = new ds.FPHeapMin(100);
        ds.Item[] itemArray8 = new ds.Item[] {};
        fPHeapMin7.copia(itemArray8);
        ds.FPHeapMin fPHeapMin11 = new ds.FPHeapMin(100);
        ds.Item item12 = null;
        ds.Item[] itemArray13 = new ds.Item[] { item12 };
        fPHeapMin11.copia(itemArray13);
        fPHeapMin7.copia(itemArray13);
        fPHeapMin1.copia(itemArray13);
        ds.FPHeapMin fPHeapMin18 = new ds.FPHeapMin(100);
        fPHeapMin18.imprime();
        ds.FPHeapMin fPHeapMin21 = new ds.FPHeapMin(100);
        ds.Item[] itemArray22 = new ds.Item[] {};
        fPHeapMin21.copia(itemArray22);
        ds.FPHeapMin fPHeapMin25 = new ds.FPHeapMin(100);
        ds.Item item26 = null;
        ds.Item[] itemArray27 = new ds.Item[] { item26 };
        fPHeapMin25.copia(itemArray27);
        fPHeapMin21.copia(itemArray27);
        fPHeapMin18.copia(itemArray27);
        fPHeapMin1.copia(itemArray27);
        ds.Item item32 = fPHeapMin1.min();
        ds.FPHeapMin fPHeapMin34 = new ds.FPHeapMin(100);
        ds.Item item35 = null;
        ds.Item[] itemArray36 = new ds.Item[] { item35 };
        fPHeapMin34.copia(itemArray36);
        ds.FPHeapMin fPHeapMin39 = new ds.FPHeapMin(100);
        ds.Item item40 = null;
        ds.Item[] itemArray41 = new ds.Item[] { item40 };
        fPHeapMin39.copia(itemArray41);
        fPHeapMin39.imprime();
        ds.FPHeapMin fPHeapMin45 = new ds.FPHeapMin(100);
        ds.Item[] itemArray46 = new ds.Item[] {};
        fPHeapMin45.copia(itemArray46);
        ds.FPHeapMin fPHeapMin49 = new ds.FPHeapMin(100);
        ds.Item item50 = null;
        ds.Item[] itemArray51 = new ds.Item[] { item50 };
        fPHeapMin49.copia(itemArray51);
        fPHeapMin45.copia(itemArray51);
        fPHeapMin39.copia(itemArray51);
        ds.FPHeapMin fPHeapMin56 = new ds.FPHeapMin(100);
        ds.Item item57 = null;
        ds.Item[] itemArray58 = new ds.Item[] { item57 };
        fPHeapMin56.copia(itemArray58);
        fPHeapMin39.copia(itemArray58);
        fPHeapMin34.copia(itemArray58);
        ds.FPHeapMin fPHeapMin62 = new ds.FPHeapMin(itemArray58);
        ds.FPHeapMin fPHeapMin63 = new ds.FPHeapMin(itemArray58);
        ds.FPHeapMin fPHeapMin64 = new ds.FPHeapMin(itemArray58);
        ds.FPHeapMin fPHeapMin65 = new ds.FPHeapMin(itemArray58);
        fPHeapMin1.copia(itemArray58);
        ds.FPHeapMin fPHeapMin67 = new ds.FPHeapMin(itemArray58);
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertNotNull(itemArray8);
        org.junit.Assert.assertNotNull(itemArray13);
        org.junit.Assert.assertNotNull(itemArray22);
        org.junit.Assert.assertNotNull(itemArray27);
        org.junit.Assert.assertNull(item32);
        org.junit.Assert.assertNotNull(itemArray36);
        org.junit.Assert.assertNotNull(itemArray41);
        org.junit.Assert.assertNotNull(itemArray46);
        org.junit.Assert.assertNotNull(itemArray51);
        org.junit.Assert.assertNotNull(itemArray58);
    }

    @Test
    public void test154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test154");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin(100);
        ds.Item item2 = null;
        ds.Item[] itemArray3 = new ds.Item[] { item2 };
        fPHeapMin1.copia(itemArray3);
        fPHeapMin1.imprime();
        ds.FPHeapMin fPHeapMin7 = new ds.FPHeapMin(100);
        ds.Item[] itemArray8 = new ds.Item[] {};
        fPHeapMin7.copia(itemArray8);
        ds.FPHeapMin fPHeapMin11 = new ds.FPHeapMin(100);
        ds.Item item12 = null;
        ds.Item[] itemArray13 = new ds.Item[] { item12 };
        fPHeapMin11.copia(itemArray13);
        fPHeapMin7.copia(itemArray13);
        fPHeapMin1.copia(itemArray13);
        ds.FPHeapMin fPHeapMin17 = new ds.FPHeapMin(itemArray13);
        fPHeapMin17.constroi();
        fPHeapMin17.imprime();
        java.lang.Class<?> wildcardClass20 = fPHeapMin17.getClass();
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertNotNull(itemArray8);
        org.junit.Assert.assertNotNull(itemArray13);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test155");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin(0);
        java.lang.Class<?> wildcardClass2 = fPHeapMin1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test156");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin(100);
        ds.Item item2 = null;
        ds.Item[] itemArray3 = new ds.Item[] { item2 };
        fPHeapMin1.copia(itemArray3);
        ds.FPHeapMin fPHeapMin6 = new ds.FPHeapMin(100);
        ds.Item item7 = null;
        ds.Item[] itemArray8 = new ds.Item[] { item7 };
        fPHeapMin6.copia(itemArray8);
        ds.FPHeapMin fPHeapMin10 = new ds.FPHeapMin(itemArray8);
        fPHeapMin1.copia(itemArray8);
        fPHeapMin1.constroi();
        ds.Item item13 = fPHeapMin1.min();
        ds.Item item14 = fPHeapMin1.min();
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertNotNull(itemArray8);
        org.junit.Assert.assertNull(item13);
        org.junit.Assert.assertNull(item14);
    }

    @Test
    public void test157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test157");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin(100);
        fPHeapMin1.constroi();
        fPHeapMin1.refaz(100, (int) (byte) 100);
        ds.Item[] itemArray6 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin7 = new ds.FPHeapMin(itemArray6);
        ds.FPHeapMin fPHeapMin9 = new ds.FPHeapMin(100);
        ds.Item item10 = null;
        ds.Item[] itemArray11 = new ds.Item[] { item10 };
        fPHeapMin9.copia(itemArray11);
        ds.FPHeapMin fPHeapMin14 = new ds.FPHeapMin(100);
        ds.Item item15 = null;
        ds.Item[] itemArray16 = new ds.Item[] { item15 };
        fPHeapMin14.copia(itemArray16);
        fPHeapMin14.imprime();
        ds.FPHeapMin fPHeapMin20 = new ds.FPHeapMin(100);
        ds.Item[] itemArray21 = new ds.Item[] {};
        fPHeapMin20.copia(itemArray21);
        ds.FPHeapMin fPHeapMin24 = new ds.FPHeapMin(100);
        ds.Item item25 = null;
        ds.Item[] itemArray26 = new ds.Item[] { item25 };
        fPHeapMin24.copia(itemArray26);
        fPHeapMin20.copia(itemArray26);
        fPHeapMin14.copia(itemArray26);
        ds.FPHeapMin fPHeapMin31 = new ds.FPHeapMin(100);
        ds.Item item32 = null;
        ds.Item[] itemArray33 = new ds.Item[] { item32 };
        fPHeapMin31.copia(itemArray33);
        fPHeapMin14.copia(itemArray33);
        fPHeapMin9.copia(itemArray33);
        ds.FPHeapMin fPHeapMin37 = new ds.FPHeapMin(itemArray33);
        fPHeapMin7.copia(itemArray33);
        ds.FPHeapMin fPHeapMin39 = new ds.FPHeapMin(itemArray33);
        fPHeapMin1.copia(itemArray33);
        fPHeapMin1.imprime();
        org.junit.Assert.assertNotNull(itemArray6);
        org.junit.Assert.assertNotNull(itemArray11);
        org.junit.Assert.assertNotNull(itemArray16);
        org.junit.Assert.assertNotNull(itemArray21);
        org.junit.Assert.assertNotNull(itemArray26);
        org.junit.Assert.assertNotNull(itemArray33);
    }

    @Test
    public void test158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test158");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin(100);
        ds.Item[] itemArray2 = new ds.Item[] {};
        fPHeapMin1.copia(itemArray2);
        ds.FPHeapMin fPHeapMin4 = new ds.FPHeapMin(itemArray2);
        fPHeapMin4.imprime();
        fPHeapMin4.constroi();
        ds.FPHeapMin fPHeapMin8 = new ds.FPHeapMin(100);
        ds.Item[] itemArray9 = new ds.Item[] {};
        fPHeapMin8.copia(itemArray9);
        ds.FPHeapMin fPHeapMin12 = new ds.FPHeapMin(100);
        ds.Item item13 = null;
        ds.Item[] itemArray14 = new ds.Item[] { item13 };
        fPHeapMin12.copia(itemArray14);
        fPHeapMin8.copia(itemArray14);
        ds.FPHeapMin fPHeapMin18 = new ds.FPHeapMin(100);
        ds.Item item19 = null;
        ds.Item[] itemArray20 = new ds.Item[] { item19 };
        fPHeapMin18.copia(itemArray20);
        ds.FPHeapMin fPHeapMin22 = new ds.FPHeapMin(itemArray20);
        fPHeapMin8.copia(itemArray20);
        fPHeapMin8.imprime();
        ds.FPHeapMin fPHeapMin26 = new ds.FPHeapMin(100);
        fPHeapMin26.imprime();
        ds.FPHeapMin fPHeapMin29 = new ds.FPHeapMin(100);
        ds.Item[] itemArray30 = new ds.Item[] {};
        fPHeapMin29.copia(itemArray30);
        ds.FPHeapMin fPHeapMin33 = new ds.FPHeapMin(100);
        ds.Item item34 = null;
        ds.Item[] itemArray35 = new ds.Item[] { item34 };
        fPHeapMin33.copia(itemArray35);
        fPHeapMin29.copia(itemArray35);
        fPHeapMin26.copia(itemArray35);
        ds.FPHeapMin fPHeapMin39 = new ds.FPHeapMin(itemArray35);
        ds.FPHeapMin fPHeapMin40 = new ds.FPHeapMin(itemArray35);
        fPHeapMin8.copia(itemArray35);
        fPHeapMin4.copia(itemArray35);
        ds.FPHeapMin fPHeapMin43 = new ds.FPHeapMin(itemArray35);
        org.junit.Assert.assertNotNull(itemArray2);
        org.junit.Assert.assertNotNull(itemArray9);
        org.junit.Assert.assertNotNull(itemArray14);
        org.junit.Assert.assertNotNull(itemArray20);
        org.junit.Assert.assertNotNull(itemArray30);
        org.junit.Assert.assertNotNull(itemArray35);
    }

    @Test
    public void test159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test159");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin(100);
        ds.Item item2 = null;
        ds.Item[] itemArray3 = new ds.Item[] { item2 };
        fPHeapMin1.copia(itemArray3);
        fPHeapMin1.imprime();
        ds.FPHeapMin fPHeapMin7 = new ds.FPHeapMin(100);
        ds.Item[] itemArray8 = new ds.Item[] {};
        fPHeapMin7.copia(itemArray8);
        ds.FPHeapMin fPHeapMin11 = new ds.FPHeapMin(100);
        ds.Item item12 = null;
        ds.Item[] itemArray13 = new ds.Item[] { item12 };
        fPHeapMin11.copia(itemArray13);
        fPHeapMin7.copia(itemArray13);
        fPHeapMin1.copia(itemArray13);
        ds.FPHeapMin fPHeapMin18 = new ds.FPHeapMin(100);
        fPHeapMin18.imprime();
        ds.FPHeapMin fPHeapMin21 = new ds.FPHeapMin(100);
        ds.Item[] itemArray22 = new ds.Item[] {};
        fPHeapMin21.copia(itemArray22);
        ds.FPHeapMin fPHeapMin25 = new ds.FPHeapMin(100);
        ds.Item item26 = null;
        ds.Item[] itemArray27 = new ds.Item[] { item26 };
        fPHeapMin25.copia(itemArray27);
        fPHeapMin21.copia(itemArray27);
        fPHeapMin18.copia(itemArray27);
        fPHeapMin1.copia(itemArray27);
        fPHeapMin1.constroi();
        ds.Item item33 = null;
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMin1.insere(item33);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertNotNull(itemArray8);
        org.junit.Assert.assertNotNull(itemArray13);
        org.junit.Assert.assertNotNull(itemArray22);
        org.junit.Assert.assertNotNull(itemArray27);
    }

    @Test
    public void test160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test160");
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
    public void test161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test161");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin(100);
        fPHeapMin1.constroi();
        ds.FPHeapMin fPHeapMin4 = new ds.FPHeapMin(100);
        fPHeapMin4.imprime();
        ds.FPHeapMin fPHeapMin7 = new ds.FPHeapMin(100);
        ds.Item[] itemArray8 = new ds.Item[] {};
        fPHeapMin7.copia(itemArray8);
        ds.FPHeapMin fPHeapMin11 = new ds.FPHeapMin(100);
        ds.Item item12 = null;
        ds.Item[] itemArray13 = new ds.Item[] { item12 };
        fPHeapMin11.copia(itemArray13);
        fPHeapMin7.copia(itemArray13);
        fPHeapMin4.copia(itemArray13);
        ds.FPHeapMin fPHeapMin17 = new ds.FPHeapMin(itemArray13);
        ds.FPHeapMin fPHeapMin18 = new ds.FPHeapMin(itemArray13);
        fPHeapMin1.copia(itemArray13);
        ds.FPHeapMin fPHeapMin21 = new ds.FPHeapMin(100);
        ds.Item item22 = null;
        ds.Item[] itemArray23 = new ds.Item[] { item22 };
        fPHeapMin21.copia(itemArray23);
        fPHeapMin21.imprime();
        fPHeapMin21.imprime();
        ds.FPHeapMin fPHeapMin28 = new ds.FPHeapMin(100);
        ds.Item item29 = null;
        ds.Item[] itemArray30 = new ds.Item[] { item29 };
        fPHeapMin28.copia(itemArray30);
        ds.FPHeapMin fPHeapMin33 = new ds.FPHeapMin(100);
        ds.Item item34 = null;
        ds.Item[] itemArray35 = new ds.Item[] { item34 };
        fPHeapMin33.copia(itemArray35);
        fPHeapMin33.imprime();
        ds.FPHeapMin fPHeapMin39 = new ds.FPHeapMin(100);
        ds.Item[] itemArray40 = new ds.Item[] {};
        fPHeapMin39.copia(itemArray40);
        ds.FPHeapMin fPHeapMin43 = new ds.FPHeapMin(100);
        ds.Item item44 = null;
        ds.Item[] itemArray45 = new ds.Item[] { item44 };
        fPHeapMin43.copia(itemArray45);
        fPHeapMin39.copia(itemArray45);
        fPHeapMin33.copia(itemArray45);
        ds.FPHeapMin fPHeapMin50 = new ds.FPHeapMin(100);
        ds.Item item51 = null;
        ds.Item[] itemArray52 = new ds.Item[] { item51 };
        fPHeapMin50.copia(itemArray52);
        fPHeapMin33.copia(itemArray52);
        fPHeapMin28.copia(itemArray52);
        fPHeapMin21.copia(itemArray52);
        fPHeapMin1.copia(itemArray52);
        ds.FPHeapMin fPHeapMin60 = new ds.FPHeapMin(100);
        ds.Item[] itemArray61 = new ds.Item[] {};
        fPHeapMin60.copia(itemArray61);
        ds.Item item63 = fPHeapMin60.min();
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMin1.diminuiChave((int) (byte) 1, (java.lang.Object) fPHeapMin60);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray8);
        org.junit.Assert.assertNotNull(itemArray13);
        org.junit.Assert.assertNotNull(itemArray23);
        org.junit.Assert.assertNotNull(itemArray30);
        org.junit.Assert.assertNotNull(itemArray35);
        org.junit.Assert.assertNotNull(itemArray40);
        org.junit.Assert.assertNotNull(itemArray45);
        org.junit.Assert.assertNotNull(itemArray52);
        org.junit.Assert.assertNotNull(itemArray61);
        org.junit.Assert.assertNull(item63);
    }

    @Test
    public void test162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test162");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin(100);
        fPHeapMin1.constroi();
        fPHeapMin1.refaz(100, (int) (byte) 100);
        ds.Item[] itemArray6 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin7 = new ds.FPHeapMin(itemArray6);
        ds.FPHeapMin fPHeapMin9 = new ds.FPHeapMin(100);
        ds.Item item10 = null;
        ds.Item[] itemArray11 = new ds.Item[] { item10 };
        fPHeapMin9.copia(itemArray11);
        ds.FPHeapMin fPHeapMin14 = new ds.FPHeapMin(100);
        ds.Item item15 = null;
        ds.Item[] itemArray16 = new ds.Item[] { item15 };
        fPHeapMin14.copia(itemArray16);
        fPHeapMin14.imprime();
        ds.FPHeapMin fPHeapMin20 = new ds.FPHeapMin(100);
        ds.Item[] itemArray21 = new ds.Item[] {};
        fPHeapMin20.copia(itemArray21);
        ds.FPHeapMin fPHeapMin24 = new ds.FPHeapMin(100);
        ds.Item item25 = null;
        ds.Item[] itemArray26 = new ds.Item[] { item25 };
        fPHeapMin24.copia(itemArray26);
        fPHeapMin20.copia(itemArray26);
        fPHeapMin14.copia(itemArray26);
        ds.FPHeapMin fPHeapMin31 = new ds.FPHeapMin(100);
        ds.Item item32 = null;
        ds.Item[] itemArray33 = new ds.Item[] { item32 };
        fPHeapMin31.copia(itemArray33);
        fPHeapMin14.copia(itemArray33);
        fPHeapMin9.copia(itemArray33);
        ds.FPHeapMin fPHeapMin37 = new ds.FPHeapMin(itemArray33);
        fPHeapMin7.copia(itemArray33);
        ds.FPHeapMin fPHeapMin39 = new ds.FPHeapMin(itemArray33);
        fPHeapMin1.copia(itemArray33);
        java.lang.Class<?> wildcardClass41 = itemArray33.getClass();
        org.junit.Assert.assertNotNull(itemArray6);
        org.junit.Assert.assertNotNull(itemArray11);
        org.junit.Assert.assertNotNull(itemArray16);
        org.junit.Assert.assertNotNull(itemArray21);
        org.junit.Assert.assertNotNull(itemArray26);
        org.junit.Assert.assertNotNull(itemArray33);
        org.junit.Assert.assertNotNull(wildcardClass41);
    }

    @Test
    public void test163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test163");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin(100);
        ds.Item item2 = null;
        ds.Item[] itemArray3 = new ds.Item[] { item2 };
        fPHeapMin1.copia(itemArray3);
        fPHeapMin1.imprime();
        fPHeapMin1.constroi();
        fPHeapMin1.constroi();
        ds.Item item8 = fPHeapMin1.min();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass9 = item8.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertNull(item8);
    }

    @Test
    public void test164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test164");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin((-1));
        ds.FPHeapMin fPHeapMin3 = new ds.FPHeapMin(100);
        fPHeapMin3.imprime();
        ds.FPHeapMin fPHeapMin6 = new ds.FPHeapMin(100);
        ds.Item[] itemArray7 = new ds.Item[] {};
        fPHeapMin6.copia(itemArray7);
        ds.FPHeapMin fPHeapMin10 = new ds.FPHeapMin(100);
        ds.Item item11 = null;
        ds.Item[] itemArray12 = new ds.Item[] { item11 };
        fPHeapMin10.copia(itemArray12);
        fPHeapMin6.copia(itemArray12);
        fPHeapMin3.copia(itemArray12);
        ds.FPHeapMin fPHeapMin17 = new ds.FPHeapMin(100);
        ds.Item item18 = null;
        ds.Item[] itemArray19 = new ds.Item[] { item18 };
        fPHeapMin17.copia(itemArray19);
        fPHeapMin17.imprime();
        ds.FPHeapMin fPHeapMin23 = new ds.FPHeapMin(100);
        ds.Item[] itemArray24 = new ds.Item[] {};
        fPHeapMin23.copia(itemArray24);
        ds.FPHeapMin fPHeapMin27 = new ds.FPHeapMin(100);
        ds.Item item28 = null;
        ds.Item[] itemArray29 = new ds.Item[] { item28 };
        fPHeapMin27.copia(itemArray29);
        fPHeapMin23.copia(itemArray29);
        fPHeapMin17.copia(itemArray29);
        ds.FPHeapMin fPHeapMin33 = new ds.FPHeapMin(itemArray29);
        fPHeapMin3.copia(itemArray29);
        ds.FPHeapMin fPHeapMin35 = new ds.FPHeapMin(itemArray29);
        fPHeapMin1.copia(itemArray29);
        ds.Item item37 = null;
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMin1.insere(item37);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray7);
        org.junit.Assert.assertNotNull(itemArray12);
        org.junit.Assert.assertNotNull(itemArray19);
        org.junit.Assert.assertNotNull(itemArray24);
        org.junit.Assert.assertNotNull(itemArray29);
    }

    @Test
    public void test165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test165");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin(100);
        ds.Item item2 = null;
        ds.Item[] itemArray3 = new ds.Item[] { item2 };
        fPHeapMin1.copia(itemArray3);
        ds.FPHeapMin fPHeapMin5 = new ds.FPHeapMin(itemArray3);
        ds.FPHeapMin fPHeapMin7 = new ds.FPHeapMin(100);
        ds.Item item8 = null;
        ds.Item[] itemArray9 = new ds.Item[] { item8 };
        fPHeapMin7.copia(itemArray9);
        fPHeapMin7.imprime();
        fPHeapMin7.constroi();
        ds.FPHeapMin fPHeapMin14 = new ds.FPHeapMin(100);
        ds.Item item15 = null;
        ds.Item[] itemArray16 = new ds.Item[] { item15 };
        fPHeapMin14.copia(itemArray16);
        ds.FPHeapMin fPHeapMin19 = new ds.FPHeapMin(100);
        ds.Item item20 = null;
        ds.Item[] itemArray21 = new ds.Item[] { item20 };
        fPHeapMin19.copia(itemArray21);
        fPHeapMin19.imprime();
        ds.FPHeapMin fPHeapMin25 = new ds.FPHeapMin(100);
        ds.Item[] itemArray26 = new ds.Item[] {};
        fPHeapMin25.copia(itemArray26);
        ds.FPHeapMin fPHeapMin29 = new ds.FPHeapMin(100);
        ds.Item item30 = null;
        ds.Item[] itemArray31 = new ds.Item[] { item30 };
        fPHeapMin29.copia(itemArray31);
        fPHeapMin25.copia(itemArray31);
        fPHeapMin19.copia(itemArray31);
        ds.FPHeapMin fPHeapMin36 = new ds.FPHeapMin(100);
        ds.Item item37 = null;
        ds.Item[] itemArray38 = new ds.Item[] { item37 };
        fPHeapMin36.copia(itemArray38);
        fPHeapMin19.copia(itemArray38);
        fPHeapMin14.copia(itemArray38);
        fPHeapMin7.copia(itemArray38);
        fPHeapMin5.copia(itemArray38);
        // The following exception was thrown during execution in test generation
        try {
            ds.Item item44 = fPHeapMin5.min();
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertNotNull(itemArray9);
        org.junit.Assert.assertNotNull(itemArray16);
        org.junit.Assert.assertNotNull(itemArray21);
        org.junit.Assert.assertNotNull(itemArray26);
        org.junit.Assert.assertNotNull(itemArray31);
        org.junit.Assert.assertNotNull(itemArray38);
    }

    @Test
    public void test166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test166");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin(100);
        fPHeapMin1.constroi();
        fPHeapMin1.refaz(100, (int) (byte) 100);
        fPHeapMin1.constroi();
        java.lang.Class<?> wildcardClass7 = fPHeapMin1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test167");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin((int) (byte) 1);
        ds.FPHeapMin fPHeapMin3 = new ds.FPHeapMin(100);
        ds.Item[] itemArray4 = new ds.Item[] {};
        fPHeapMin3.copia(itemArray4);
        ds.FPHeapMin fPHeapMin6 = new ds.FPHeapMin(itemArray4);
        ds.FPHeapMin fPHeapMin8 = new ds.FPHeapMin(100);
        ds.Item item9 = null;
        ds.Item[] itemArray10 = new ds.Item[] { item9 };
        fPHeapMin8.copia(itemArray10);
        fPHeapMin8.imprime();
        ds.FPHeapMin fPHeapMin14 = new ds.FPHeapMin(100);
        ds.Item[] itemArray15 = new ds.Item[] {};
        fPHeapMin14.copia(itemArray15);
        ds.FPHeapMin fPHeapMin18 = new ds.FPHeapMin(100);
        ds.Item item19 = null;
        ds.Item[] itemArray20 = new ds.Item[] { item19 };
        fPHeapMin18.copia(itemArray20);
        fPHeapMin14.copia(itemArray20);
        fPHeapMin8.copia(itemArray20);
        ds.FPHeapMin fPHeapMin25 = new ds.FPHeapMin(100);
        ds.Item item26 = null;
        ds.Item[] itemArray27 = new ds.Item[] { item26 };
        fPHeapMin25.copia(itemArray27);
        fPHeapMin8.copia(itemArray27);
        fPHeapMin6.copia(itemArray27);
        fPHeapMin1.copia(itemArray27);
        ds.FPHeapMin fPHeapMin32 = new ds.FPHeapMin(itemArray27);
        org.junit.Assert.assertNotNull(itemArray4);
        org.junit.Assert.assertNotNull(itemArray10);
        org.junit.Assert.assertNotNull(itemArray15);
        org.junit.Assert.assertNotNull(itemArray20);
        org.junit.Assert.assertNotNull(itemArray27);
    }

    @Test
    public void test168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test168");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin(100);
        ds.Item[] itemArray2 = new ds.Item[] {};
        fPHeapMin1.copia(itemArray2);
        ds.FPHeapMin fPHeapMin4 = new ds.FPHeapMin(itemArray2);
        ds.FPHeapMin fPHeapMin6 = new ds.FPHeapMin(100);
        ds.Item item7 = null;
        ds.Item[] itemArray8 = new ds.Item[] { item7 };
        fPHeapMin6.copia(itemArray8);
        fPHeapMin6.imprime();
        ds.FPHeapMin fPHeapMin12 = new ds.FPHeapMin(100);
        ds.Item[] itemArray13 = new ds.Item[] {};
        fPHeapMin12.copia(itemArray13);
        ds.FPHeapMin fPHeapMin16 = new ds.FPHeapMin(100);
        ds.Item item17 = null;
        ds.Item[] itemArray18 = new ds.Item[] { item17 };
        fPHeapMin16.copia(itemArray18);
        fPHeapMin12.copia(itemArray18);
        fPHeapMin6.copia(itemArray18);
        ds.FPHeapMin fPHeapMin23 = new ds.FPHeapMin(100);
        ds.Item item24 = null;
        ds.Item[] itemArray25 = new ds.Item[] { item24 };
        fPHeapMin23.copia(itemArray25);
        fPHeapMin6.copia(itemArray25);
        fPHeapMin4.copia(itemArray25);
        ds.Item item29 = null;
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMin4.insere(item29);
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: heap cheio");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray2);
        org.junit.Assert.assertNotNull(itemArray8);
        org.junit.Assert.assertNotNull(itemArray13);
        org.junit.Assert.assertNotNull(itemArray18);
        org.junit.Assert.assertNotNull(itemArray25);
    }

    @Test
    public void test169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test169");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin(100);
        fPHeapMin1.constroi();
        fPHeapMin1.refaz(100, (int) (byte) 100);
        ds.Item[] itemArray6 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin7 = new ds.FPHeapMin(itemArray6);
        ds.FPHeapMin fPHeapMin9 = new ds.FPHeapMin(100);
        ds.Item item10 = null;
        ds.Item[] itemArray11 = new ds.Item[] { item10 };
        fPHeapMin9.copia(itemArray11);
        ds.FPHeapMin fPHeapMin14 = new ds.FPHeapMin(100);
        ds.Item item15 = null;
        ds.Item[] itemArray16 = new ds.Item[] { item15 };
        fPHeapMin14.copia(itemArray16);
        fPHeapMin14.imprime();
        ds.FPHeapMin fPHeapMin20 = new ds.FPHeapMin(100);
        ds.Item[] itemArray21 = new ds.Item[] {};
        fPHeapMin20.copia(itemArray21);
        ds.FPHeapMin fPHeapMin24 = new ds.FPHeapMin(100);
        ds.Item item25 = null;
        ds.Item[] itemArray26 = new ds.Item[] { item25 };
        fPHeapMin24.copia(itemArray26);
        fPHeapMin20.copia(itemArray26);
        fPHeapMin14.copia(itemArray26);
        ds.FPHeapMin fPHeapMin31 = new ds.FPHeapMin(100);
        ds.Item item32 = null;
        ds.Item[] itemArray33 = new ds.Item[] { item32 };
        fPHeapMin31.copia(itemArray33);
        fPHeapMin14.copia(itemArray33);
        fPHeapMin9.copia(itemArray33);
        ds.FPHeapMin fPHeapMin37 = new ds.FPHeapMin(itemArray33);
        fPHeapMin7.copia(itemArray33);
        ds.FPHeapMin fPHeapMin39 = new ds.FPHeapMin(itemArray33);
        fPHeapMin1.copia(itemArray33);
        ds.FPHeapMin fPHeapMin41 = new ds.FPHeapMin(itemArray33);
        org.junit.Assert.assertNotNull(itemArray6);
        org.junit.Assert.assertNotNull(itemArray11);
        org.junit.Assert.assertNotNull(itemArray16);
        org.junit.Assert.assertNotNull(itemArray21);
        org.junit.Assert.assertNotNull(itemArray26);
        org.junit.Assert.assertNotNull(itemArray33);
    }

    @Test
    public void test170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test170");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin(10);
    }

    @Test
    public void test171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test171");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin(100);
        ds.Item item2 = null;
        ds.Item[] itemArray3 = new ds.Item[] { item2 };
        fPHeapMin1.copia(itemArray3);
        fPHeapMin1.imprime();
        ds.FPHeapMin fPHeapMin7 = new ds.FPHeapMin(100);
        ds.Item[] itemArray8 = new ds.Item[] {};
        fPHeapMin7.copia(itemArray8);
        ds.FPHeapMin fPHeapMin11 = new ds.FPHeapMin(100);
        ds.Item item12 = null;
        ds.Item[] itemArray13 = new ds.Item[] { item12 };
        fPHeapMin11.copia(itemArray13);
        fPHeapMin7.copia(itemArray13);
        fPHeapMin1.copia(itemArray13);
        ds.FPHeapMin fPHeapMin18 = new ds.FPHeapMin(100);
        fPHeapMin18.imprime();
        ds.FPHeapMin fPHeapMin21 = new ds.FPHeapMin(100);
        ds.Item[] itemArray22 = new ds.Item[] {};
        fPHeapMin21.copia(itemArray22);
        ds.FPHeapMin fPHeapMin25 = new ds.FPHeapMin(100);
        ds.Item item26 = null;
        ds.Item[] itemArray27 = new ds.Item[] { item26 };
        fPHeapMin25.copia(itemArray27);
        fPHeapMin21.copia(itemArray27);
        fPHeapMin18.copia(itemArray27);
        fPHeapMin1.copia(itemArray27);
        ds.FPHeapMin fPHeapMin32 = new ds.FPHeapMin(itemArray27);
        ds.Item item33 = null;
        ds.Item[] itemArray34 = new ds.Item[] { item33 };
        fPHeapMin32.copia(itemArray34);
        fPHeapMin32.constroi();
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertNotNull(itemArray8);
        org.junit.Assert.assertNotNull(itemArray13);
        org.junit.Assert.assertNotNull(itemArray22);
        org.junit.Assert.assertNotNull(itemArray27);
        org.junit.Assert.assertNotNull(itemArray34);
    }

    @Test
    public void test172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test172");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin((int) 'a');
    }

    @Test
    public void test173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test173");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin(100);
        ds.Item item2 = null;
        ds.Item[] itemArray3 = new ds.Item[] { item2 };
        fPHeapMin1.copia(itemArray3);
        fPHeapMin1.imprime();
        ds.FPHeapMin fPHeapMin7 = new ds.FPHeapMin(100);
        ds.Item[] itemArray8 = new ds.Item[] {};
        fPHeapMin7.copia(itemArray8);
        ds.FPHeapMin fPHeapMin11 = new ds.FPHeapMin(100);
        ds.Item item12 = null;
        ds.Item[] itemArray13 = new ds.Item[] { item12 };
        fPHeapMin11.copia(itemArray13);
        fPHeapMin7.copia(itemArray13);
        fPHeapMin1.copia(itemArray13);
        ds.FPHeapMin fPHeapMin18 = new ds.FPHeapMin(100);
        fPHeapMin18.imprime();
        ds.FPHeapMin fPHeapMin21 = new ds.FPHeapMin(100);
        ds.Item[] itemArray22 = new ds.Item[] {};
        fPHeapMin21.copia(itemArray22);
        ds.FPHeapMin fPHeapMin25 = new ds.FPHeapMin(100);
        ds.Item item26 = null;
        ds.Item[] itemArray27 = new ds.Item[] { item26 };
        fPHeapMin25.copia(itemArray27);
        fPHeapMin21.copia(itemArray27);
        fPHeapMin18.copia(itemArray27);
        fPHeapMin1.copia(itemArray27);
        ds.FPHeapMin fPHeapMin32 = new ds.FPHeapMin(itemArray27);
        fPHeapMin32.imprime();
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertNotNull(itemArray8);
        org.junit.Assert.assertNotNull(itemArray13);
        org.junit.Assert.assertNotNull(itemArray22);
        org.junit.Assert.assertNotNull(itemArray27);
    }

    @Test
    public void test174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test174");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin(100);
        ds.Item[] itemArray2 = new ds.Item[] {};
        fPHeapMin1.copia(itemArray2);
        ds.FPHeapMin fPHeapMin4 = new ds.FPHeapMin(itemArray2);
        ds.FPHeapMin fPHeapMin5 = new ds.FPHeapMin(itemArray2);
        ds.FPHeapMin fPHeapMin6 = new ds.FPHeapMin(itemArray2);
        org.junit.Assert.assertNotNull(itemArray2);
    }

    @Test
    public void test175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test175");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin(100);
        ds.Item item2 = null;
        ds.Item[] itemArray3 = new ds.Item[] { item2 };
        fPHeapMin1.copia(itemArray3);
        ds.FPHeapMin fPHeapMin6 = new ds.FPHeapMin(100);
        ds.Item item7 = null;
        ds.Item[] itemArray8 = new ds.Item[] { item7 };
        fPHeapMin6.copia(itemArray8);
        fPHeapMin6.imprime();
        ds.FPHeapMin fPHeapMin12 = new ds.FPHeapMin(100);
        ds.Item[] itemArray13 = new ds.Item[] {};
        fPHeapMin12.copia(itemArray13);
        ds.FPHeapMin fPHeapMin16 = new ds.FPHeapMin(100);
        ds.Item item17 = null;
        ds.Item[] itemArray18 = new ds.Item[] { item17 };
        fPHeapMin16.copia(itemArray18);
        fPHeapMin12.copia(itemArray18);
        fPHeapMin6.copia(itemArray18);
        ds.FPHeapMin fPHeapMin23 = new ds.FPHeapMin(100);
        ds.Item item24 = null;
        ds.Item[] itemArray25 = new ds.Item[] { item24 };
        fPHeapMin23.copia(itemArray25);
        fPHeapMin6.copia(itemArray25);
        fPHeapMin1.copia(itemArray25);
        ds.FPHeapMin fPHeapMin29 = new ds.FPHeapMin(itemArray25);
        ds.FPHeapMin fPHeapMin30 = new ds.FPHeapMin(itemArray25);
        fPHeapMin30.constroi();
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMin30.diminuiChave((int) '4', (java.lang.Object) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 52");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertNotNull(itemArray8);
        org.junit.Assert.assertNotNull(itemArray13);
        org.junit.Assert.assertNotNull(itemArray18);
        org.junit.Assert.assertNotNull(itemArray25);
    }

    @Test
    public void test176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test176");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin(100);
        ds.Item item2 = null;
        ds.Item[] itemArray3 = new ds.Item[] { item2 };
        fPHeapMin1.copia(itemArray3);
        ds.FPHeapMin fPHeapMin5 = new ds.FPHeapMin(itemArray3);
        ds.FPHeapMin fPHeapMin6 = new ds.FPHeapMin(itemArray3);
        ds.Item[] itemArray7 = null;
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMin6.copia(itemArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray3);
    }

    @Test
    public void test177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test177");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin(100);
        ds.Item item2 = null;
        ds.Item[] itemArray3 = new ds.Item[] { item2 };
        fPHeapMin1.copia(itemArray3);
        ds.FPHeapMin fPHeapMin6 = new ds.FPHeapMin(100);
        ds.Item item7 = null;
        ds.Item[] itemArray8 = new ds.Item[] { item7 };
        fPHeapMin6.copia(itemArray8);
        fPHeapMin6.imprime();
        ds.FPHeapMin fPHeapMin12 = new ds.FPHeapMin(100);
        ds.Item[] itemArray13 = new ds.Item[] {};
        fPHeapMin12.copia(itemArray13);
        ds.FPHeapMin fPHeapMin16 = new ds.FPHeapMin(100);
        ds.Item item17 = null;
        ds.Item[] itemArray18 = new ds.Item[] { item17 };
        fPHeapMin16.copia(itemArray18);
        fPHeapMin12.copia(itemArray18);
        fPHeapMin6.copia(itemArray18);
        ds.FPHeapMin fPHeapMin23 = new ds.FPHeapMin(100);
        ds.Item item24 = null;
        ds.Item[] itemArray25 = new ds.Item[] { item24 };
        fPHeapMin23.copia(itemArray25);
        fPHeapMin6.copia(itemArray25);
        fPHeapMin1.copia(itemArray25);
        ds.FPHeapMin fPHeapMin29 = new ds.FPHeapMin(itemArray25);
        ds.FPHeapMin fPHeapMin30 = new ds.FPHeapMin(itemArray25);
        fPHeapMin30.constroi();
        // The following exception was thrown during execution in test generation
        try {
            ds.Item item32 = fPHeapMin30.retiraMin();
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: heap vazio");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertNotNull(itemArray8);
        org.junit.Assert.assertNotNull(itemArray13);
        org.junit.Assert.assertNotNull(itemArray18);
        org.junit.Assert.assertNotNull(itemArray25);
    }

    @Test
    public void test178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test178");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin(100);
        ds.Item[] itemArray2 = new ds.Item[] {};
        fPHeapMin1.copia(itemArray2);
        ds.FPHeapMin fPHeapMin5 = new ds.FPHeapMin(100);
        ds.Item[] itemArray6 = new ds.Item[] {};
        fPHeapMin5.copia(itemArray6);
        ds.FPHeapMin fPHeapMin9 = new ds.FPHeapMin(100);
        ds.Item item10 = null;
        ds.Item[] itemArray11 = new ds.Item[] { item10 };
        fPHeapMin9.copia(itemArray11);
        fPHeapMin5.copia(itemArray11);
        ds.FPHeapMin fPHeapMin14 = new ds.FPHeapMin(itemArray11);
        fPHeapMin1.copia(itemArray11);
        fPHeapMin1.constroi();
        org.junit.Assert.assertNotNull(itemArray2);
        org.junit.Assert.assertNotNull(itemArray6);
        org.junit.Assert.assertNotNull(itemArray11);
    }

    @Test
    public void test179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test179");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin(100);
        ds.Item[] itemArray2 = new ds.Item[] {};
        fPHeapMin1.copia(itemArray2);
        ds.FPHeapMin fPHeapMin5 = new ds.FPHeapMin(100);
        ds.Item item6 = null;
        ds.Item[] itemArray7 = new ds.Item[] { item6 };
        fPHeapMin5.copia(itemArray7);
        fPHeapMin1.copia(itemArray7);
        fPHeapMin1.imprime();
        fPHeapMin1.refaz((int) '4', (int) '4');
        ds.Item item14 = null;
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMin1.insere(item14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray2);
        org.junit.Assert.assertNotNull(itemArray7);
    }

    @Test
    public void test180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test180");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin(100);
        ds.Item[] itemArray2 = new ds.Item[] {};
        fPHeapMin1.copia(itemArray2);
        ds.FPHeapMin fPHeapMin4 = new ds.FPHeapMin(itemArray2);
        fPHeapMin4.imprime();
        fPHeapMin4.constroi();
        ds.FPHeapMin fPHeapMin8 = new ds.FPHeapMin(100);
        ds.Item[] itemArray9 = new ds.Item[] {};
        fPHeapMin8.copia(itemArray9);
        ds.FPHeapMin fPHeapMin12 = new ds.FPHeapMin(100);
        ds.Item item13 = null;
        ds.Item[] itemArray14 = new ds.Item[] { item13 };
        fPHeapMin12.copia(itemArray14);
        fPHeapMin8.copia(itemArray14);
        ds.FPHeapMin fPHeapMin18 = new ds.FPHeapMin(100);
        ds.Item item19 = null;
        ds.Item[] itemArray20 = new ds.Item[] { item19 };
        fPHeapMin18.copia(itemArray20);
        ds.FPHeapMin fPHeapMin22 = new ds.FPHeapMin(itemArray20);
        fPHeapMin8.copia(itemArray20);
        fPHeapMin8.imprime();
        ds.FPHeapMin fPHeapMin26 = new ds.FPHeapMin(100);
        fPHeapMin26.imprime();
        ds.FPHeapMin fPHeapMin29 = new ds.FPHeapMin(100);
        ds.Item[] itemArray30 = new ds.Item[] {};
        fPHeapMin29.copia(itemArray30);
        ds.FPHeapMin fPHeapMin33 = new ds.FPHeapMin(100);
        ds.Item item34 = null;
        ds.Item[] itemArray35 = new ds.Item[] { item34 };
        fPHeapMin33.copia(itemArray35);
        fPHeapMin29.copia(itemArray35);
        fPHeapMin26.copia(itemArray35);
        ds.FPHeapMin fPHeapMin39 = new ds.FPHeapMin(itemArray35);
        ds.FPHeapMin fPHeapMin40 = new ds.FPHeapMin(itemArray35);
        fPHeapMin8.copia(itemArray35);
        fPHeapMin4.copia(itemArray35);
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMin4.refaz((int) (short) -1, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray2);
        org.junit.Assert.assertNotNull(itemArray9);
        org.junit.Assert.assertNotNull(itemArray14);
        org.junit.Assert.assertNotNull(itemArray20);
        org.junit.Assert.assertNotNull(itemArray30);
        org.junit.Assert.assertNotNull(itemArray35);
    }

    @Test
    public void test181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test181");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin(100);
        ds.Item item2 = null;
        ds.Item[] itemArray3 = new ds.Item[] { item2 };
        fPHeapMin1.copia(itemArray3);
        fPHeapMin1.imprime();
        ds.FPHeapMin fPHeapMin7 = new ds.FPHeapMin(100);
        ds.Item[] itemArray8 = new ds.Item[] {};
        fPHeapMin7.copia(itemArray8);
        ds.FPHeapMin fPHeapMin11 = new ds.FPHeapMin(100);
        ds.Item item12 = null;
        ds.Item[] itemArray13 = new ds.Item[] { item12 };
        fPHeapMin11.copia(itemArray13);
        fPHeapMin7.copia(itemArray13);
        fPHeapMin1.copia(itemArray13);
        ds.FPHeapMin fPHeapMin18 = new ds.FPHeapMin(100);
        fPHeapMin18.imprime();
        ds.FPHeapMin fPHeapMin21 = new ds.FPHeapMin(100);
        ds.Item[] itemArray22 = new ds.Item[] {};
        fPHeapMin21.copia(itemArray22);
        ds.FPHeapMin fPHeapMin25 = new ds.FPHeapMin(100);
        ds.Item item26 = null;
        ds.Item[] itemArray27 = new ds.Item[] { item26 };
        fPHeapMin25.copia(itemArray27);
        fPHeapMin21.copia(itemArray27);
        fPHeapMin18.copia(itemArray27);
        fPHeapMin1.copia(itemArray27);
        fPHeapMin1.imprime();
        ds.Item item33 = null;
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMin1.insere(item33);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertNotNull(itemArray8);
        org.junit.Assert.assertNotNull(itemArray13);
        org.junit.Assert.assertNotNull(itemArray22);
        org.junit.Assert.assertNotNull(itemArray27);
    }

    @Test
    public void test182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test182");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin(100);
        ds.Item item2 = null;
        ds.Item[] itemArray3 = new ds.Item[] { item2 };
        fPHeapMin1.copia(itemArray3);
        fPHeapMin1.imprime();
        fPHeapMin1.constroi();
        fPHeapMin1.constroi();
        ds.FPHeapMin fPHeapMin9 = new ds.FPHeapMin(100);
        ds.Item[] itemArray10 = new ds.Item[] {};
        fPHeapMin9.copia(itemArray10);
        ds.FPHeapMin fPHeapMin13 = new ds.FPHeapMin(100);
        ds.Item item14 = null;
        ds.Item[] itemArray15 = new ds.Item[] { item14 };
        fPHeapMin13.copia(itemArray15);
        fPHeapMin9.copia(itemArray15);
        ds.FPHeapMin fPHeapMin19 = new ds.FPHeapMin(100);
        ds.Item item20 = null;
        ds.Item[] itemArray21 = new ds.Item[] { item20 };
        fPHeapMin19.copia(itemArray21);
        ds.FPHeapMin fPHeapMin23 = new ds.FPHeapMin(itemArray21);
        fPHeapMin9.copia(itemArray21);
        fPHeapMin1.copia(itemArray21);
        fPHeapMin1.refaz((int) (byte) 10, (int) (byte) 0);
        ds.Item item29 = fPHeapMin1.min();
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertNotNull(itemArray10);
        org.junit.Assert.assertNotNull(itemArray15);
        org.junit.Assert.assertNotNull(itemArray21);
        org.junit.Assert.assertNull(item29);
    }

    @Test
    public void test183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test183");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin(100);
        ds.Item item2 = null;
        ds.Item[] itemArray3 = new ds.Item[] { item2 };
        fPHeapMin1.copia(itemArray3);
        fPHeapMin1.imprime();
        ds.FPHeapMin fPHeapMin7 = new ds.FPHeapMin(100);
        ds.Item[] itemArray8 = new ds.Item[] {};
        fPHeapMin7.copia(itemArray8);
        ds.FPHeapMin fPHeapMin11 = new ds.FPHeapMin(100);
        ds.Item item12 = null;
        ds.Item[] itemArray13 = new ds.Item[] { item12 };
        fPHeapMin11.copia(itemArray13);
        fPHeapMin7.copia(itemArray13);
        fPHeapMin1.copia(itemArray13);
        ds.FPHeapMin fPHeapMin18 = new ds.FPHeapMin(100);
        fPHeapMin18.imprime();
        ds.FPHeapMin fPHeapMin21 = new ds.FPHeapMin(100);
        ds.Item[] itemArray22 = new ds.Item[] {};
        fPHeapMin21.copia(itemArray22);
        ds.FPHeapMin fPHeapMin25 = new ds.FPHeapMin(100);
        ds.Item item26 = null;
        ds.Item[] itemArray27 = new ds.Item[] { item26 };
        fPHeapMin25.copia(itemArray27);
        fPHeapMin21.copia(itemArray27);
        fPHeapMin18.copia(itemArray27);
        fPHeapMin1.copia(itemArray27);
        ds.FPHeapMin fPHeapMin32 = new ds.FPHeapMin(itemArray27);
        ds.Item item33 = null;
        ds.Item[] itemArray34 = new ds.Item[] { item33 };
        fPHeapMin32.copia(itemArray34);
        ds.FPHeapMin fPHeapMin37 = new ds.FPHeapMin(100);
        fPHeapMin37.imprime();
        ds.FPHeapMin fPHeapMin40 = new ds.FPHeapMin(100);
        ds.Item[] itemArray41 = new ds.Item[] {};
        fPHeapMin40.copia(itemArray41);
        ds.FPHeapMin fPHeapMin44 = new ds.FPHeapMin(100);
        ds.Item item45 = null;
        ds.Item[] itemArray46 = new ds.Item[] { item45 };
        fPHeapMin44.copia(itemArray46);
        fPHeapMin40.copia(itemArray46);
        fPHeapMin37.copia(itemArray46);
        ds.FPHeapMin fPHeapMin50 = new ds.FPHeapMin(itemArray46);
        ds.FPHeapMin fPHeapMin51 = new ds.FPHeapMin(itemArray46);
        fPHeapMin32.copia(itemArray46);
        ds.FPHeapMin fPHeapMin53 = new ds.FPHeapMin(itemArray46);
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertNotNull(itemArray8);
        org.junit.Assert.assertNotNull(itemArray13);
        org.junit.Assert.assertNotNull(itemArray22);
        org.junit.Assert.assertNotNull(itemArray27);
        org.junit.Assert.assertNotNull(itemArray34);
        org.junit.Assert.assertNotNull(itemArray41);
        org.junit.Assert.assertNotNull(itemArray46);
    }

    @Test
    public void test184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test184");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin(100);
        ds.Item[] itemArray2 = new ds.Item[] {};
        fPHeapMin1.copia(itemArray2);
        ds.FPHeapMin fPHeapMin5 = new ds.FPHeapMin(100);
        ds.Item item6 = null;
        ds.Item[] itemArray7 = new ds.Item[] { item6 };
        fPHeapMin5.copia(itemArray7);
        fPHeapMin1.copia(itemArray7);
        ds.FPHeapMin fPHeapMin11 = new ds.FPHeapMin(100);
        ds.Item item12 = null;
        ds.Item[] itemArray13 = new ds.Item[] { item12 };
        fPHeapMin11.copia(itemArray13);
        ds.FPHeapMin fPHeapMin15 = new ds.FPHeapMin(itemArray13);
        fPHeapMin1.copia(itemArray13);
        fPHeapMin1.imprime();
        ds.Item[] itemArray19 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin20 = new ds.FPHeapMin(itemArray19);
        ds.FPHeapMin fPHeapMin22 = new ds.FPHeapMin(100);
        ds.Item item23 = null;
        ds.Item[] itemArray24 = new ds.Item[] { item23 };
        fPHeapMin22.copia(itemArray24);
        ds.FPHeapMin fPHeapMin27 = new ds.FPHeapMin(100);
        ds.Item item28 = null;
        ds.Item[] itemArray29 = new ds.Item[] { item28 };
        fPHeapMin27.copia(itemArray29);
        fPHeapMin27.imprime();
        ds.FPHeapMin fPHeapMin33 = new ds.FPHeapMin(100);
        ds.Item[] itemArray34 = new ds.Item[] {};
        fPHeapMin33.copia(itemArray34);
        ds.FPHeapMin fPHeapMin37 = new ds.FPHeapMin(100);
        ds.Item item38 = null;
        ds.Item[] itemArray39 = new ds.Item[] { item38 };
        fPHeapMin37.copia(itemArray39);
        fPHeapMin33.copia(itemArray39);
        fPHeapMin27.copia(itemArray39);
        ds.FPHeapMin fPHeapMin44 = new ds.FPHeapMin(100);
        ds.Item item45 = null;
        ds.Item[] itemArray46 = new ds.Item[] { item45 };
        fPHeapMin44.copia(itemArray46);
        fPHeapMin27.copia(itemArray46);
        fPHeapMin22.copia(itemArray46);
        ds.FPHeapMin fPHeapMin50 = new ds.FPHeapMin(itemArray46);
        fPHeapMin20.copia(itemArray46);
        ds.FPHeapMin fPHeapMin52 = new ds.FPHeapMin(itemArray46);
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMin1.diminuiChave(100, (java.lang.Object) fPHeapMin52);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray2);
        org.junit.Assert.assertNotNull(itemArray7);
        org.junit.Assert.assertNotNull(itemArray13);
        org.junit.Assert.assertNotNull(itemArray19);
        org.junit.Assert.assertNotNull(itemArray24);
        org.junit.Assert.assertNotNull(itemArray29);
        org.junit.Assert.assertNotNull(itemArray34);
        org.junit.Assert.assertNotNull(itemArray39);
        org.junit.Assert.assertNotNull(itemArray46);
    }

    @Test
    public void test185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test185");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin((int) (short) 0);
    }

    @Test
    public void test186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test186");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin((int) '#');
        ds.Item item2 = fPHeapMin1.min();
        fPHeapMin1.imprime();
        org.junit.Assert.assertNull(item2);
    }

    @Test
    public void test187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test187");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin(100);
        ds.Item item2 = null;
        ds.Item[] itemArray3 = new ds.Item[] { item2 };
        fPHeapMin1.copia(itemArray3);
        fPHeapMin1.imprime();
        fPHeapMin1.imprime();
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMin1.diminuiChave(0, (java.lang.Object) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray3);
    }

    @Test
    public void test188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test188");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin(100);
        ds.Item[] itemArray2 = new ds.Item[] {};
        fPHeapMin1.copia(itemArray2);
        ds.FPHeapMin fPHeapMin5 = new ds.FPHeapMin(100);
        ds.Item item6 = null;
        ds.Item[] itemArray7 = new ds.Item[] { item6 };
        fPHeapMin5.copia(itemArray7);
        fPHeapMin1.copia(itemArray7);
        fPHeapMin1.imprime();
        ds.Item item11 = fPHeapMin1.min();
        ds.Item item12 = fPHeapMin1.min();
        ds.Item item13 = fPHeapMin1.min();
        org.junit.Assert.assertNotNull(itemArray2);
        org.junit.Assert.assertNotNull(itemArray7);
        org.junit.Assert.assertNull(item11);
        org.junit.Assert.assertNull(item12);
        org.junit.Assert.assertNull(item13);
    }

    @Test
    public void test189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test189");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin(1);
        ds.FPHeapMin fPHeapMin4 = new ds.FPHeapMin(100);
        ds.Item[] itemArray5 = new ds.Item[] {};
        fPHeapMin4.copia(itemArray5);
        ds.FPHeapMin fPHeapMin8 = new ds.FPHeapMin(100);
        ds.Item item9 = null;
        ds.Item[] itemArray10 = new ds.Item[] { item9 };
        fPHeapMin8.copia(itemArray10);
        fPHeapMin4.copia(itemArray10);
        fPHeapMin4.imprime();
        ds.Item item14 = fPHeapMin4.min();
        fPHeapMin4.constroi();
        fPHeapMin4.constroi();
        java.lang.Class<?> wildcardClass17 = fPHeapMin4.getClass();
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMin1.diminuiChave((-1), (java.lang.Object) wildcardClass17);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray5);
        org.junit.Assert.assertNotNull(itemArray10);
        org.junit.Assert.assertNull(item14);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test190");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin(100);
        ds.Item item2 = null;
        ds.Item[] itemArray3 = new ds.Item[] { item2 };
        fPHeapMin1.copia(itemArray3);
        fPHeapMin1.imprime();
        fPHeapMin1.constroi();
        fPHeapMin1.constroi();
        ds.Item item8 = fPHeapMin1.min();
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
        org.junit.Assert.assertNull(item8);
    }

    @Test
    public void test191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test191");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin(100);
        ds.Item item2 = null;
        ds.Item[] itemArray3 = new ds.Item[] { item2 };
        fPHeapMin1.copia(itemArray3);
        fPHeapMin1.imprime();
        ds.FPHeapMin fPHeapMin7 = new ds.FPHeapMin(100);
        ds.Item[] itemArray8 = new ds.Item[] {};
        fPHeapMin7.copia(itemArray8);
        ds.FPHeapMin fPHeapMin11 = new ds.FPHeapMin(100);
        ds.Item item12 = null;
        ds.Item[] itemArray13 = new ds.Item[] { item12 };
        fPHeapMin11.copia(itemArray13);
        fPHeapMin7.copia(itemArray13);
        fPHeapMin1.copia(itemArray13);
        ds.FPHeapMin fPHeapMin17 = new ds.FPHeapMin(itemArray13);
        fPHeapMin17.constroi();
        fPHeapMin17.constroi();
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertNotNull(itemArray8);
        org.junit.Assert.assertNotNull(itemArray13);
    }

    @Test
    public void test192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test192");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin(100);
        ds.Item item2 = null;
        ds.Item[] itemArray3 = new ds.Item[] { item2 };
        fPHeapMin1.copia(itemArray3);
        fPHeapMin1.imprime();
        fPHeapMin1.imprime();
        fPHeapMin1.imprime();
        fPHeapMin1.constroi();
        fPHeapMin1.imprime();
        org.junit.Assert.assertNotNull(itemArray3);
    }

    @Test
    public void test193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test193");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin(100);
        ds.Item[] itemArray2 = new ds.Item[] {};
        fPHeapMin1.copia(itemArray2);
        fPHeapMin1.refaz((int) (byte) 100, (int) (byte) 0);
        fPHeapMin1.refaz((int) (short) 100, (int) (short) 100);
        org.junit.Assert.assertNotNull(itemArray2);
    }

    @Test
    public void test194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test194");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin(100);
        ds.Item item2 = null;
        ds.Item[] itemArray3 = new ds.Item[] { item2 };
        fPHeapMin1.copia(itemArray3);
        fPHeapMin1.imprime();
        ds.FPHeapMin fPHeapMin7 = new ds.FPHeapMin(100);
        ds.Item[] itemArray8 = new ds.Item[] {};
        fPHeapMin7.copia(itemArray8);
        ds.FPHeapMin fPHeapMin11 = new ds.FPHeapMin(100);
        ds.Item item12 = null;
        ds.Item[] itemArray13 = new ds.Item[] { item12 };
        fPHeapMin11.copia(itemArray13);
        fPHeapMin7.copia(itemArray13);
        fPHeapMin1.copia(itemArray13);
        ds.FPHeapMin fPHeapMin18 = new ds.FPHeapMin(100);
        ds.Item item19 = null;
        ds.Item[] itemArray20 = new ds.Item[] { item19 };
        fPHeapMin18.copia(itemArray20);
        fPHeapMin1.copia(itemArray20);
        fPHeapMin1.imprime();
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMin1.refaz((int) (short) 0, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertNotNull(itemArray8);
        org.junit.Assert.assertNotNull(itemArray13);
        org.junit.Assert.assertNotNull(itemArray20);
    }

    @Test
    public void test195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test195");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin(100);
        ds.Item item2 = null;
        ds.Item[] itemArray3 = new ds.Item[] { item2 };
        fPHeapMin1.copia(itemArray3);
        fPHeapMin1.imprime();
        ds.FPHeapMin fPHeapMin7 = new ds.FPHeapMin(100);
        ds.Item[] itemArray8 = new ds.Item[] {};
        fPHeapMin7.copia(itemArray8);
        ds.FPHeapMin fPHeapMin11 = new ds.FPHeapMin(100);
        ds.Item item12 = null;
        ds.Item[] itemArray13 = new ds.Item[] { item12 };
        fPHeapMin11.copia(itemArray13);
        fPHeapMin7.copia(itemArray13);
        fPHeapMin1.copia(itemArray13);
        fPHeapMin1.imprime();
        fPHeapMin1.refaz((int) '4', 0);
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertNotNull(itemArray8);
        org.junit.Assert.assertNotNull(itemArray13);
    }

    @Test
    public void test196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test196");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin(0);
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
    public void test197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test197");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin(100);
        fPHeapMin1.imprime();
        ds.Item item3 = fPHeapMin1.min();
        ds.Item item4 = fPHeapMin1.min();
        fPHeapMin1.constroi();
        ds.Item item6 = fPHeapMin1.min();
        fPHeapMin1.constroi();
        org.junit.Assert.assertNull(item3);
        org.junit.Assert.assertNull(item4);
        org.junit.Assert.assertNull(item6);
    }

    @Test
    public void test198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test198");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin(100);
        fPHeapMin1.constroi();
        fPHeapMin1.refaz(100, (int) (byte) 100);
        ds.Item[] itemArray6 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin7 = new ds.FPHeapMin(itemArray6);
        ds.FPHeapMin fPHeapMin9 = new ds.FPHeapMin(100);
        ds.Item item10 = null;
        ds.Item[] itemArray11 = new ds.Item[] { item10 };
        fPHeapMin9.copia(itemArray11);
        ds.FPHeapMin fPHeapMin14 = new ds.FPHeapMin(100);
        ds.Item item15 = null;
        ds.Item[] itemArray16 = new ds.Item[] { item15 };
        fPHeapMin14.copia(itemArray16);
        fPHeapMin14.imprime();
        ds.FPHeapMin fPHeapMin20 = new ds.FPHeapMin(100);
        ds.Item[] itemArray21 = new ds.Item[] {};
        fPHeapMin20.copia(itemArray21);
        ds.FPHeapMin fPHeapMin24 = new ds.FPHeapMin(100);
        ds.Item item25 = null;
        ds.Item[] itemArray26 = new ds.Item[] { item25 };
        fPHeapMin24.copia(itemArray26);
        fPHeapMin20.copia(itemArray26);
        fPHeapMin14.copia(itemArray26);
        ds.FPHeapMin fPHeapMin31 = new ds.FPHeapMin(100);
        ds.Item item32 = null;
        ds.Item[] itemArray33 = new ds.Item[] { item32 };
        fPHeapMin31.copia(itemArray33);
        fPHeapMin14.copia(itemArray33);
        fPHeapMin9.copia(itemArray33);
        ds.FPHeapMin fPHeapMin37 = new ds.FPHeapMin(itemArray33);
        fPHeapMin7.copia(itemArray33);
        ds.FPHeapMin fPHeapMin39 = new ds.FPHeapMin(itemArray33);
        fPHeapMin1.copia(itemArray33);
        // The following exception was thrown during execution in test generation
        try {
            ds.Item item41 = fPHeapMin1.retiraMin();
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: heap vazio");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray6);
        org.junit.Assert.assertNotNull(itemArray11);
        org.junit.Assert.assertNotNull(itemArray16);
        org.junit.Assert.assertNotNull(itemArray21);
        org.junit.Assert.assertNotNull(itemArray26);
        org.junit.Assert.assertNotNull(itemArray33);
    }

    @Test
    public void test199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test199");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin((-1));
        ds.FPHeapMin fPHeapMin3 = new ds.FPHeapMin(100);
        fPHeapMin3.imprime();
        ds.FPHeapMin fPHeapMin6 = new ds.FPHeapMin(100);
        ds.Item[] itemArray7 = new ds.Item[] {};
        fPHeapMin6.copia(itemArray7);
        ds.FPHeapMin fPHeapMin10 = new ds.FPHeapMin(100);
        ds.Item item11 = null;
        ds.Item[] itemArray12 = new ds.Item[] { item11 };
        fPHeapMin10.copia(itemArray12);
        fPHeapMin6.copia(itemArray12);
        fPHeapMin3.copia(itemArray12);
        ds.FPHeapMin fPHeapMin17 = new ds.FPHeapMin(100);
        ds.Item item18 = null;
        ds.Item[] itemArray19 = new ds.Item[] { item18 };
        fPHeapMin17.copia(itemArray19);
        fPHeapMin17.imprime();
        ds.FPHeapMin fPHeapMin23 = new ds.FPHeapMin(100);
        ds.Item[] itemArray24 = new ds.Item[] {};
        fPHeapMin23.copia(itemArray24);
        ds.FPHeapMin fPHeapMin27 = new ds.FPHeapMin(100);
        ds.Item item28 = null;
        ds.Item[] itemArray29 = new ds.Item[] { item28 };
        fPHeapMin27.copia(itemArray29);
        fPHeapMin23.copia(itemArray29);
        fPHeapMin17.copia(itemArray29);
        ds.FPHeapMin fPHeapMin33 = new ds.FPHeapMin(itemArray29);
        fPHeapMin3.copia(itemArray29);
        ds.FPHeapMin fPHeapMin35 = new ds.FPHeapMin(itemArray29);
        fPHeapMin1.copia(itemArray29);
        // The following exception was thrown during execution in test generation
        try {
            ds.Item item37 = fPHeapMin1.min();
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray7);
        org.junit.Assert.assertNotNull(itemArray12);
        org.junit.Assert.assertNotNull(itemArray19);
        org.junit.Assert.assertNotNull(itemArray24);
        org.junit.Assert.assertNotNull(itemArray29);
    }

    @Test
    public void test200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test200");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin(100);
        ds.Item item2 = null;
        ds.Item[] itemArray3 = new ds.Item[] { item2 };
        fPHeapMin1.copia(itemArray3);
        fPHeapMin1.imprime();
        ds.FPHeapMin fPHeapMin7 = new ds.FPHeapMin(100);
        ds.Item[] itemArray8 = new ds.Item[] {};
        fPHeapMin7.copia(itemArray8);
        ds.FPHeapMin fPHeapMin11 = new ds.FPHeapMin(100);
        ds.Item item12 = null;
        ds.Item[] itemArray13 = new ds.Item[] { item12 };
        fPHeapMin11.copia(itemArray13);
        fPHeapMin7.copia(itemArray13);
        fPHeapMin1.copia(itemArray13);
        ds.FPHeapMin fPHeapMin18 = new ds.FPHeapMin(100);
        fPHeapMin18.imprime();
        ds.FPHeapMin fPHeapMin21 = new ds.FPHeapMin(100);
        ds.Item[] itemArray22 = new ds.Item[] {};
        fPHeapMin21.copia(itemArray22);
        ds.FPHeapMin fPHeapMin25 = new ds.FPHeapMin(100);
        ds.Item item26 = null;
        ds.Item[] itemArray27 = new ds.Item[] { item26 };
        fPHeapMin25.copia(itemArray27);
        fPHeapMin21.copia(itemArray27);
        fPHeapMin18.copia(itemArray27);
        fPHeapMin1.copia(itemArray27);
        ds.FPHeapMin fPHeapMin32 = new ds.FPHeapMin(itemArray27);
        ds.Item item33 = null;
        ds.Item[] itemArray34 = new ds.Item[] { item33 };
        fPHeapMin32.copia(itemArray34);
        ds.FPHeapMin fPHeapMin37 = new ds.FPHeapMin(100);
        fPHeapMin37.imprime();
        ds.FPHeapMin fPHeapMin40 = new ds.FPHeapMin(100);
        ds.Item[] itemArray41 = new ds.Item[] {};
        fPHeapMin40.copia(itemArray41);
        ds.FPHeapMin fPHeapMin44 = new ds.FPHeapMin(100);
        ds.Item item45 = null;
        ds.Item[] itemArray46 = new ds.Item[] { item45 };
        fPHeapMin44.copia(itemArray46);
        fPHeapMin40.copia(itemArray46);
        fPHeapMin37.copia(itemArray46);
        ds.FPHeapMin fPHeapMin50 = new ds.FPHeapMin(itemArray46);
        ds.FPHeapMin fPHeapMin51 = new ds.FPHeapMin(itemArray46);
        fPHeapMin32.copia(itemArray46);
        fPHeapMin32.constroi();
        java.lang.Class<?> wildcardClass54 = fPHeapMin32.getClass();
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertNotNull(itemArray8);
        org.junit.Assert.assertNotNull(itemArray13);
        org.junit.Assert.assertNotNull(itemArray22);
        org.junit.Assert.assertNotNull(itemArray27);
        org.junit.Assert.assertNotNull(itemArray34);
        org.junit.Assert.assertNotNull(itemArray41);
        org.junit.Assert.assertNotNull(itemArray46);
        org.junit.Assert.assertNotNull(wildcardClass54);
    }

    @Test
    public void test201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test201");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin(100);
        fPHeapMin1.imprime();
        ds.FPHeapMin fPHeapMin4 = new ds.FPHeapMin(100);
        ds.Item[] itemArray5 = new ds.Item[] {};
        fPHeapMin4.copia(itemArray5);
        ds.FPHeapMin fPHeapMin8 = new ds.FPHeapMin(100);
        ds.Item item9 = null;
        ds.Item[] itemArray10 = new ds.Item[] { item9 };
        fPHeapMin8.copia(itemArray10);
        fPHeapMin4.copia(itemArray10);
        fPHeapMin1.copia(itemArray10);
        ds.FPHeapMin fPHeapMin15 = new ds.FPHeapMin(100);
        ds.Item item16 = null;
        ds.Item[] itemArray17 = new ds.Item[] { item16 };
        fPHeapMin15.copia(itemArray17);
        fPHeapMin15.imprime();
        ds.FPHeapMin fPHeapMin21 = new ds.FPHeapMin(100);
        ds.Item[] itemArray22 = new ds.Item[] {};
        fPHeapMin21.copia(itemArray22);
        ds.FPHeapMin fPHeapMin25 = new ds.FPHeapMin(100);
        ds.Item item26 = null;
        ds.Item[] itemArray27 = new ds.Item[] { item26 };
        fPHeapMin25.copia(itemArray27);
        fPHeapMin21.copia(itemArray27);
        fPHeapMin15.copia(itemArray27);
        ds.FPHeapMin fPHeapMin31 = new ds.FPHeapMin(itemArray27);
        fPHeapMin1.copia(itemArray27);
        ds.FPHeapMin fPHeapMin33 = new ds.FPHeapMin(itemArray27);
        fPHeapMin33.imprime();
        // The following exception was thrown during execution in test generation
        try {
            ds.Item item35 = fPHeapMin33.min();
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray5);
        org.junit.Assert.assertNotNull(itemArray10);
        org.junit.Assert.assertNotNull(itemArray17);
        org.junit.Assert.assertNotNull(itemArray22);
        org.junit.Assert.assertNotNull(itemArray27);
    }

    @Test
    public void test202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test202");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin(100);
        ds.Item item2 = null;
        ds.Item[] itemArray3 = new ds.Item[] { item2 };
        fPHeapMin1.copia(itemArray3);
        fPHeapMin1.imprime();
        ds.FPHeapMin fPHeapMin7 = new ds.FPHeapMin(100);
        ds.Item[] itemArray8 = new ds.Item[] {};
        fPHeapMin7.copia(itemArray8);
        ds.FPHeapMin fPHeapMin11 = new ds.FPHeapMin(100);
        ds.Item item12 = null;
        ds.Item[] itemArray13 = new ds.Item[] { item12 };
        fPHeapMin11.copia(itemArray13);
        fPHeapMin7.copia(itemArray13);
        fPHeapMin1.copia(itemArray13);
        ds.FPHeapMin fPHeapMin17 = new ds.FPHeapMin(itemArray13);
        ds.FPHeapMin fPHeapMin19 = new ds.FPHeapMin(100);
        fPHeapMin19.constroi();
        ds.FPHeapMin fPHeapMin22 = new ds.FPHeapMin(100);
        fPHeapMin22.imprime();
        ds.FPHeapMin fPHeapMin25 = new ds.FPHeapMin(100);
        ds.Item[] itemArray26 = new ds.Item[] {};
        fPHeapMin25.copia(itemArray26);
        ds.FPHeapMin fPHeapMin29 = new ds.FPHeapMin(100);
        ds.Item item30 = null;
        ds.Item[] itemArray31 = new ds.Item[] { item30 };
        fPHeapMin29.copia(itemArray31);
        fPHeapMin25.copia(itemArray31);
        fPHeapMin22.copia(itemArray31);
        ds.FPHeapMin fPHeapMin35 = new ds.FPHeapMin(itemArray31);
        ds.FPHeapMin fPHeapMin36 = new ds.FPHeapMin(itemArray31);
        fPHeapMin19.copia(itemArray31);
        fPHeapMin17.copia(itemArray31);
        ds.FPHeapMin fPHeapMin39 = new ds.FPHeapMin(itemArray31);
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMin39.diminuiChave((int) (byte) -1, (java.lang.Object) 100.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertNotNull(itemArray8);
        org.junit.Assert.assertNotNull(itemArray13);
        org.junit.Assert.assertNotNull(itemArray26);
        org.junit.Assert.assertNotNull(itemArray31);
    }

    @Test
    public void test203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test203");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin(100);
        ds.Item item2 = null;
        ds.Item[] itemArray3 = new ds.Item[] { item2 };
        fPHeapMin1.copia(itemArray3);
        ds.FPHeapMin fPHeapMin5 = new ds.FPHeapMin(itemArray3);
        ds.FPHeapMin fPHeapMin7 = new ds.FPHeapMin(100);
        ds.Item item8 = null;
        ds.Item[] itemArray9 = new ds.Item[] { item8 };
        fPHeapMin7.copia(itemArray9);
        fPHeapMin7.imprime();
        fPHeapMin7.constroi();
        ds.FPHeapMin fPHeapMin14 = new ds.FPHeapMin(100);
        ds.Item item15 = null;
        ds.Item[] itemArray16 = new ds.Item[] { item15 };
        fPHeapMin14.copia(itemArray16);
        ds.FPHeapMin fPHeapMin19 = new ds.FPHeapMin(100);
        ds.Item item20 = null;
        ds.Item[] itemArray21 = new ds.Item[] { item20 };
        fPHeapMin19.copia(itemArray21);
        fPHeapMin19.imprime();
        ds.FPHeapMin fPHeapMin25 = new ds.FPHeapMin(100);
        ds.Item[] itemArray26 = new ds.Item[] {};
        fPHeapMin25.copia(itemArray26);
        ds.FPHeapMin fPHeapMin29 = new ds.FPHeapMin(100);
        ds.Item item30 = null;
        ds.Item[] itemArray31 = new ds.Item[] { item30 };
        fPHeapMin29.copia(itemArray31);
        fPHeapMin25.copia(itemArray31);
        fPHeapMin19.copia(itemArray31);
        ds.FPHeapMin fPHeapMin36 = new ds.FPHeapMin(100);
        ds.Item item37 = null;
        ds.Item[] itemArray38 = new ds.Item[] { item37 };
        fPHeapMin36.copia(itemArray38);
        fPHeapMin19.copia(itemArray38);
        fPHeapMin14.copia(itemArray38);
        fPHeapMin7.copia(itemArray38);
        fPHeapMin5.copia(itemArray38);
        fPHeapMin5.constroi();
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertNotNull(itemArray9);
        org.junit.Assert.assertNotNull(itemArray16);
        org.junit.Assert.assertNotNull(itemArray21);
        org.junit.Assert.assertNotNull(itemArray26);
        org.junit.Assert.assertNotNull(itemArray31);
        org.junit.Assert.assertNotNull(itemArray38);
    }

    @Test
    public void test204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test204");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin(100);
        ds.Item item2 = null;
        ds.Item[] itemArray3 = new ds.Item[] { item2 };
        fPHeapMin1.copia(itemArray3);
        fPHeapMin1.imprime();
        ds.FPHeapMin fPHeapMin7 = new ds.FPHeapMin(100);
        ds.Item[] itemArray8 = new ds.Item[] {};
        fPHeapMin7.copia(itemArray8);
        ds.FPHeapMin fPHeapMin11 = new ds.FPHeapMin(100);
        ds.Item item12 = null;
        ds.Item[] itemArray13 = new ds.Item[] { item12 };
        fPHeapMin11.copia(itemArray13);
        fPHeapMin7.copia(itemArray13);
        fPHeapMin1.copia(itemArray13);
        ds.FPHeapMin fPHeapMin18 = new ds.FPHeapMin(100);
        fPHeapMin18.imprime();
        ds.FPHeapMin fPHeapMin21 = new ds.FPHeapMin(100);
        ds.Item[] itemArray22 = new ds.Item[] {};
        fPHeapMin21.copia(itemArray22);
        ds.FPHeapMin fPHeapMin25 = new ds.FPHeapMin(100);
        ds.Item item26 = null;
        ds.Item[] itemArray27 = new ds.Item[] { item26 };
        fPHeapMin25.copia(itemArray27);
        fPHeapMin21.copia(itemArray27);
        fPHeapMin18.copia(itemArray27);
        fPHeapMin1.copia(itemArray27);
        ds.FPHeapMin fPHeapMin33 = new ds.FPHeapMin(100);
        ds.Item item34 = null;
        ds.Item[] itemArray35 = new ds.Item[] { item34 };
        fPHeapMin33.copia(itemArray35);
        fPHeapMin33.imprime();
        fPHeapMin33.imprime();
        ds.FPHeapMin fPHeapMin40 = new ds.FPHeapMin(100);
        ds.Item item41 = null;
        ds.Item[] itemArray42 = new ds.Item[] { item41 };
        fPHeapMin40.copia(itemArray42);
        ds.FPHeapMin fPHeapMin45 = new ds.FPHeapMin(100);
        ds.Item item46 = null;
        ds.Item[] itemArray47 = new ds.Item[] { item46 };
        fPHeapMin45.copia(itemArray47);
        fPHeapMin45.imprime();
        ds.FPHeapMin fPHeapMin51 = new ds.FPHeapMin(100);
        ds.Item[] itemArray52 = new ds.Item[] {};
        fPHeapMin51.copia(itemArray52);
        ds.FPHeapMin fPHeapMin55 = new ds.FPHeapMin(100);
        ds.Item item56 = null;
        ds.Item[] itemArray57 = new ds.Item[] { item56 };
        fPHeapMin55.copia(itemArray57);
        fPHeapMin51.copia(itemArray57);
        fPHeapMin45.copia(itemArray57);
        ds.FPHeapMin fPHeapMin62 = new ds.FPHeapMin(100);
        ds.Item item63 = null;
        ds.Item[] itemArray64 = new ds.Item[] { item63 };
        fPHeapMin62.copia(itemArray64);
        fPHeapMin45.copia(itemArray64);
        fPHeapMin40.copia(itemArray64);
        fPHeapMin33.copia(itemArray64);
        fPHeapMin1.copia(itemArray64);
        ds.FPHeapMin fPHeapMin70 = new ds.FPHeapMin(itemArray64);
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertNotNull(itemArray8);
        org.junit.Assert.assertNotNull(itemArray13);
        org.junit.Assert.assertNotNull(itemArray22);
        org.junit.Assert.assertNotNull(itemArray27);
        org.junit.Assert.assertNotNull(itemArray35);
        org.junit.Assert.assertNotNull(itemArray42);
        org.junit.Assert.assertNotNull(itemArray47);
        org.junit.Assert.assertNotNull(itemArray52);
        org.junit.Assert.assertNotNull(itemArray57);
        org.junit.Assert.assertNotNull(itemArray64);
    }

    @Test
    public void test205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test205");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin(0);
        fPHeapMin1.constroi();
        java.lang.Class<?> wildcardClass3 = fPHeapMin1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test206");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin((int) (short) 10);
    }

    @Test
    public void test207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test207");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin(100);
        ds.Item[] itemArray2 = new ds.Item[] {};
        fPHeapMin1.copia(itemArray2);
        ds.FPHeapMin fPHeapMin4 = new ds.FPHeapMin(itemArray2);
        ds.FPHeapMin fPHeapMin5 = new ds.FPHeapMin(itemArray2);
        // The following exception was thrown during execution in test generation
        try {
            ds.Item item6 = fPHeapMin5.min();
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray2);
    }

    @Test
    public void test208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test208");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin(100);
        ds.Item item2 = null;
        ds.Item[] itemArray3 = new ds.Item[] { item2 };
        fPHeapMin1.copia(itemArray3);
        fPHeapMin1.imprime();
        ds.FPHeapMin fPHeapMin7 = new ds.FPHeapMin(100);
        ds.Item[] itemArray8 = new ds.Item[] {};
        fPHeapMin7.copia(itemArray8);
        ds.FPHeapMin fPHeapMin11 = new ds.FPHeapMin(100);
        ds.Item item12 = null;
        ds.Item[] itemArray13 = new ds.Item[] { item12 };
        fPHeapMin11.copia(itemArray13);
        fPHeapMin7.copia(itemArray13);
        fPHeapMin1.copia(itemArray13);
        ds.FPHeapMin fPHeapMin18 = new ds.FPHeapMin(100);
        ds.Item item19 = null;
        ds.Item[] itemArray20 = new ds.Item[] { item19 };
        fPHeapMin18.copia(itemArray20);
        fPHeapMin1.copia(itemArray20);
        ds.Item item23 = fPHeapMin1.min();
        fPHeapMin1.imprime();
        fPHeapMin1.refaz((int) ' ', (int) '4');
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertNotNull(itemArray8);
        org.junit.Assert.assertNotNull(itemArray13);
        org.junit.Assert.assertNotNull(itemArray20);
        org.junit.Assert.assertNull(item23);
    }

    @Test
    public void test209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test209");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin(100);
        ds.Item item2 = null;
        ds.Item[] itemArray3 = new ds.Item[] { item2 };
        fPHeapMin1.copia(itemArray3);
        fPHeapMin1.imprime();
        fPHeapMin1.imprime();
        fPHeapMin1.imprime();
        ds.FPHeapMin fPHeapMin9 = new ds.FPHeapMin(100);
        ds.Item[] itemArray10 = new ds.Item[] {};
        fPHeapMin9.copia(itemArray10);
        fPHeapMin1.copia(itemArray10);
        ds.FPHeapMin fPHeapMin13 = new ds.FPHeapMin(itemArray10);
        fPHeapMin13.imprime();
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertNotNull(itemArray10);
    }

    @Test
    public void test210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test210");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin(100);
        fPHeapMin1.imprime();
        ds.FPHeapMin fPHeapMin4 = new ds.FPHeapMin(100);
        ds.Item[] itemArray5 = new ds.Item[] {};
        fPHeapMin4.copia(itemArray5);
        ds.FPHeapMin fPHeapMin8 = new ds.FPHeapMin(100);
        ds.Item item9 = null;
        ds.Item[] itemArray10 = new ds.Item[] { item9 };
        fPHeapMin8.copia(itemArray10);
        fPHeapMin4.copia(itemArray10);
        fPHeapMin1.copia(itemArray10);
        ds.FPHeapMin fPHeapMin14 = new ds.FPHeapMin(itemArray10);
        ds.FPHeapMin fPHeapMin15 = new ds.FPHeapMin(itemArray10);
        fPHeapMin15.imprime();
        ds.Item item17 = null;
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMin15.insere(item17);
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: heap cheio");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray5);
        org.junit.Assert.assertNotNull(itemArray10);
    }

    @Test
    public void test211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test211");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin(100);
        fPHeapMin1.constroi();
        fPHeapMin1.refaz(100, (int) (byte) 100);
        ds.Item[] itemArray6 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin7 = new ds.FPHeapMin(itemArray6);
        ds.FPHeapMin fPHeapMin9 = new ds.FPHeapMin(100);
        ds.Item item10 = null;
        ds.Item[] itemArray11 = new ds.Item[] { item10 };
        fPHeapMin9.copia(itemArray11);
        ds.FPHeapMin fPHeapMin14 = new ds.FPHeapMin(100);
        ds.Item item15 = null;
        ds.Item[] itemArray16 = new ds.Item[] { item15 };
        fPHeapMin14.copia(itemArray16);
        fPHeapMin14.imprime();
        ds.FPHeapMin fPHeapMin20 = new ds.FPHeapMin(100);
        ds.Item[] itemArray21 = new ds.Item[] {};
        fPHeapMin20.copia(itemArray21);
        ds.FPHeapMin fPHeapMin24 = new ds.FPHeapMin(100);
        ds.Item item25 = null;
        ds.Item[] itemArray26 = new ds.Item[] { item25 };
        fPHeapMin24.copia(itemArray26);
        fPHeapMin20.copia(itemArray26);
        fPHeapMin14.copia(itemArray26);
        ds.FPHeapMin fPHeapMin31 = new ds.FPHeapMin(100);
        ds.Item item32 = null;
        ds.Item[] itemArray33 = new ds.Item[] { item32 };
        fPHeapMin31.copia(itemArray33);
        fPHeapMin14.copia(itemArray33);
        fPHeapMin9.copia(itemArray33);
        ds.FPHeapMin fPHeapMin37 = new ds.FPHeapMin(itemArray33);
        fPHeapMin7.copia(itemArray33);
        ds.FPHeapMin fPHeapMin39 = new ds.FPHeapMin(itemArray33);
        fPHeapMin1.copia(itemArray33);
        ds.Item item41 = fPHeapMin1.min();
        ds.Item item42 = fPHeapMin1.min();
        org.junit.Assert.assertNotNull(itemArray6);
        org.junit.Assert.assertNotNull(itemArray11);
        org.junit.Assert.assertNotNull(itemArray16);
        org.junit.Assert.assertNotNull(itemArray21);
        org.junit.Assert.assertNotNull(itemArray26);
        org.junit.Assert.assertNotNull(itemArray33);
        org.junit.Assert.assertNull(item41);
        org.junit.Assert.assertNull(item42);
    }

    @Test
    public void test212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test212");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin(100);
        ds.Item[] itemArray2 = new ds.Item[] {};
        fPHeapMin1.copia(itemArray2);
        ds.Item item4 = fPHeapMin1.min();
        // The following exception was thrown during execution in test generation
        try {
            ds.Item item5 = fPHeapMin1.retiraMin();
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: heap vazio");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray2);
        org.junit.Assert.assertNull(item4);
    }

    @Test
    public void test213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test213");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin(100);
        fPHeapMin1.imprime();
        ds.Item item3 = fPHeapMin1.min();
        ds.Item item4 = fPHeapMin1.min();
        fPHeapMin1.constroi();
        ds.Item item6 = fPHeapMin1.min();
        ds.Item item7 = fPHeapMin1.min();
        org.junit.Assert.assertNull(item3);
        org.junit.Assert.assertNull(item4);
        org.junit.Assert.assertNull(item6);
        org.junit.Assert.assertNull(item7);
    }

    @Test
    public void test214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test214");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin(100);
        ds.Item[] itemArray2 = new ds.Item[] {};
        fPHeapMin1.copia(itemArray2);
        ds.FPHeapMin fPHeapMin5 = new ds.FPHeapMin(100);
        ds.Item item6 = null;
        ds.Item[] itemArray7 = new ds.Item[] { item6 };
        fPHeapMin5.copia(itemArray7);
        fPHeapMin1.copia(itemArray7);
        fPHeapMin1.imprime();
        fPHeapMin1.imprime();
        ds.FPHeapMin fPHeapMin13 = new ds.FPHeapMin(100);
        ds.Item item14 = null;
        ds.Item[] itemArray15 = new ds.Item[] { item14 };
        fPHeapMin13.copia(itemArray15);
        fPHeapMin13.imprime();
        ds.FPHeapMin fPHeapMin19 = new ds.FPHeapMin(100);
        ds.Item[] itemArray20 = new ds.Item[] {};
        fPHeapMin19.copia(itemArray20);
        ds.FPHeapMin fPHeapMin23 = new ds.FPHeapMin(100);
        ds.Item item24 = null;
        ds.Item[] itemArray25 = new ds.Item[] { item24 };
        fPHeapMin23.copia(itemArray25);
        fPHeapMin19.copia(itemArray25);
        fPHeapMin13.copia(itemArray25);
        ds.FPHeapMin fPHeapMin30 = new ds.FPHeapMin(100);
        fPHeapMin30.imprime();
        ds.FPHeapMin fPHeapMin33 = new ds.FPHeapMin(100);
        ds.Item[] itemArray34 = new ds.Item[] {};
        fPHeapMin33.copia(itemArray34);
        ds.FPHeapMin fPHeapMin37 = new ds.FPHeapMin(100);
        ds.Item item38 = null;
        ds.Item[] itemArray39 = new ds.Item[] { item38 };
        fPHeapMin37.copia(itemArray39);
        fPHeapMin33.copia(itemArray39);
        fPHeapMin30.copia(itemArray39);
        fPHeapMin13.copia(itemArray39);
        ds.FPHeapMin fPHeapMin44 = new ds.FPHeapMin(itemArray39);
        ds.Item item45 = null;
        ds.Item[] itemArray46 = new ds.Item[] { item45 };
        fPHeapMin44.copia(itemArray46);
        fPHeapMin1.copia(itemArray46);
        org.junit.Assert.assertNotNull(itemArray2);
        org.junit.Assert.assertNotNull(itemArray7);
        org.junit.Assert.assertNotNull(itemArray15);
        org.junit.Assert.assertNotNull(itemArray20);
        org.junit.Assert.assertNotNull(itemArray25);
        org.junit.Assert.assertNotNull(itemArray34);
        org.junit.Assert.assertNotNull(itemArray39);
        org.junit.Assert.assertNotNull(itemArray46);
    }

    @Test
    public void test215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test215");
        ds.Item[] itemArray0 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin(itemArray0);
        ds.FPHeapMin fPHeapMin3 = new ds.FPHeapMin(100);
        ds.Item item4 = null;
        ds.Item[] itemArray5 = new ds.Item[] { item4 };
        fPHeapMin3.copia(itemArray5);
        ds.FPHeapMin fPHeapMin8 = new ds.FPHeapMin(100);
        ds.Item item9 = null;
        ds.Item[] itemArray10 = new ds.Item[] { item9 };
        fPHeapMin8.copia(itemArray10);
        fPHeapMin8.imprime();
        ds.FPHeapMin fPHeapMin14 = new ds.FPHeapMin(100);
        ds.Item[] itemArray15 = new ds.Item[] {};
        fPHeapMin14.copia(itemArray15);
        ds.FPHeapMin fPHeapMin18 = new ds.FPHeapMin(100);
        ds.Item item19 = null;
        ds.Item[] itemArray20 = new ds.Item[] { item19 };
        fPHeapMin18.copia(itemArray20);
        fPHeapMin14.copia(itemArray20);
        fPHeapMin8.copia(itemArray20);
        ds.FPHeapMin fPHeapMin25 = new ds.FPHeapMin(100);
        ds.Item item26 = null;
        ds.Item[] itemArray27 = new ds.Item[] { item26 };
        fPHeapMin25.copia(itemArray27);
        fPHeapMin8.copia(itemArray27);
        fPHeapMin3.copia(itemArray27);
        ds.FPHeapMin fPHeapMin31 = new ds.FPHeapMin(itemArray27);
        fPHeapMin1.copia(itemArray27);
        ds.FPHeapMin fPHeapMin34 = new ds.FPHeapMin(100);
        ds.Item item35 = null;
        ds.Item[] itemArray36 = new ds.Item[] { item35 };
        fPHeapMin34.copia(itemArray36);
        fPHeapMin1.copia(itemArray36);
        fPHeapMin1.imprime();
        org.junit.Assert.assertNotNull(itemArray0);
        org.junit.Assert.assertNotNull(itemArray5);
        org.junit.Assert.assertNotNull(itemArray10);
        org.junit.Assert.assertNotNull(itemArray15);
        org.junit.Assert.assertNotNull(itemArray20);
        org.junit.Assert.assertNotNull(itemArray27);
        org.junit.Assert.assertNotNull(itemArray36);
    }

    @Test
    public void test216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test216");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin(100);
        ds.Item item2 = null;
        ds.Item[] itemArray3 = new ds.Item[] { item2 };
        fPHeapMin1.copia(itemArray3);
        fPHeapMin1.imprime();
        ds.FPHeapMin fPHeapMin7 = new ds.FPHeapMin(100);
        ds.Item[] itemArray8 = new ds.Item[] {};
        fPHeapMin7.copia(itemArray8);
        ds.FPHeapMin fPHeapMin11 = new ds.FPHeapMin(100);
        ds.Item item12 = null;
        ds.Item[] itemArray13 = new ds.Item[] { item12 };
        fPHeapMin11.copia(itemArray13);
        fPHeapMin7.copia(itemArray13);
        fPHeapMin1.copia(itemArray13);
        ds.FPHeapMin fPHeapMin18 = new ds.FPHeapMin(100);
        ds.Item item19 = null;
        ds.Item[] itemArray20 = new ds.Item[] { item19 };
        fPHeapMin18.copia(itemArray20);
        fPHeapMin1.copia(itemArray20);
        fPHeapMin1.imprime();
        fPHeapMin1.constroi();
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertNotNull(itemArray8);
        org.junit.Assert.assertNotNull(itemArray13);
        org.junit.Assert.assertNotNull(itemArray20);
    }

    @Test
    public void test217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test217");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin(100);
        ds.Item item2 = null;
        ds.Item[] itemArray3 = new ds.Item[] { item2 };
        fPHeapMin1.copia(itemArray3);
        fPHeapMin1.imprime();
        ds.FPHeapMin fPHeapMin7 = new ds.FPHeapMin(100);
        ds.Item[] itemArray8 = new ds.Item[] {};
        fPHeapMin7.copia(itemArray8);
        ds.FPHeapMin fPHeapMin11 = new ds.FPHeapMin(100);
        ds.Item item12 = null;
        ds.Item[] itemArray13 = new ds.Item[] { item12 };
        fPHeapMin11.copia(itemArray13);
        fPHeapMin7.copia(itemArray13);
        fPHeapMin1.copia(itemArray13);
        ds.FPHeapMin fPHeapMin18 = new ds.FPHeapMin(100);
        ds.Item item19 = null;
        ds.Item[] itemArray20 = new ds.Item[] { item19 };
        fPHeapMin18.copia(itemArray20);
        fPHeapMin1.copia(itemArray20);
        fPHeapMin1.imprime();
        java.lang.Class<?> wildcardClass24 = fPHeapMin1.getClass();
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertNotNull(itemArray8);
        org.junit.Assert.assertNotNull(itemArray13);
        org.junit.Assert.assertNotNull(itemArray20);
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test218");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin((-1));
        ds.FPHeapMin fPHeapMin3 = new ds.FPHeapMin(100);
        ds.Item item4 = null;
        ds.Item[] itemArray5 = new ds.Item[] { item4 };
        fPHeapMin3.copia(itemArray5);
        ds.FPHeapMin fPHeapMin8 = new ds.FPHeapMin(100);
        ds.Item item9 = null;
        ds.Item[] itemArray10 = new ds.Item[] { item9 };
        fPHeapMin8.copia(itemArray10);
        fPHeapMin8.imprime();
        ds.FPHeapMin fPHeapMin14 = new ds.FPHeapMin(100);
        ds.Item[] itemArray15 = new ds.Item[] {};
        fPHeapMin14.copia(itemArray15);
        ds.FPHeapMin fPHeapMin18 = new ds.FPHeapMin(100);
        ds.Item item19 = null;
        ds.Item[] itemArray20 = new ds.Item[] { item19 };
        fPHeapMin18.copia(itemArray20);
        fPHeapMin14.copia(itemArray20);
        fPHeapMin8.copia(itemArray20);
        ds.FPHeapMin fPHeapMin25 = new ds.FPHeapMin(100);
        ds.Item item26 = null;
        ds.Item[] itemArray27 = new ds.Item[] { item26 };
        fPHeapMin25.copia(itemArray27);
        fPHeapMin8.copia(itemArray27);
        fPHeapMin3.copia(itemArray27);
        ds.FPHeapMin fPHeapMin31 = new ds.FPHeapMin(itemArray27);
        ds.FPHeapMin fPHeapMin32 = new ds.FPHeapMin(itemArray27);
        ds.FPHeapMin fPHeapMin33 = new ds.FPHeapMin(itemArray27);
        ds.FPHeapMin fPHeapMin34 = new ds.FPHeapMin(itemArray27);
        fPHeapMin1.copia(itemArray27);
        // The following exception was thrown during execution in test generation
        try {
            ds.Item item36 = fPHeapMin1.retiraMin();
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: heap vazio");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray5);
        org.junit.Assert.assertNotNull(itemArray10);
        org.junit.Assert.assertNotNull(itemArray15);
        org.junit.Assert.assertNotNull(itemArray20);
        org.junit.Assert.assertNotNull(itemArray27);
    }

    @Test
    public void test219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test219");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin((int) (short) 100);
        ds.FPHeapMin fPHeapMin3 = new ds.FPHeapMin(100);
        ds.Item item4 = null;
        ds.Item[] itemArray5 = new ds.Item[] { item4 };
        fPHeapMin3.copia(itemArray5);
        ds.FPHeapMin fPHeapMin8 = new ds.FPHeapMin(100);
        ds.Item item9 = null;
        ds.Item[] itemArray10 = new ds.Item[] { item9 };
        fPHeapMin8.copia(itemArray10);
        fPHeapMin8.imprime();
        ds.FPHeapMin fPHeapMin14 = new ds.FPHeapMin(100);
        ds.Item[] itemArray15 = new ds.Item[] {};
        fPHeapMin14.copia(itemArray15);
        ds.FPHeapMin fPHeapMin18 = new ds.FPHeapMin(100);
        ds.Item item19 = null;
        ds.Item[] itemArray20 = new ds.Item[] { item19 };
        fPHeapMin18.copia(itemArray20);
        fPHeapMin14.copia(itemArray20);
        fPHeapMin8.copia(itemArray20);
        ds.FPHeapMin fPHeapMin25 = new ds.FPHeapMin(100);
        ds.Item item26 = null;
        ds.Item[] itemArray27 = new ds.Item[] { item26 };
        fPHeapMin25.copia(itemArray27);
        fPHeapMin8.copia(itemArray27);
        fPHeapMin3.copia(itemArray27);
        ds.FPHeapMin fPHeapMin31 = new ds.FPHeapMin(itemArray27);
        ds.FPHeapMin fPHeapMin33 = new ds.FPHeapMin(100);
        ds.Item item34 = null;
        ds.Item[] itemArray35 = new ds.Item[] { item34 };
        fPHeapMin33.copia(itemArray35);
        ds.FPHeapMin fPHeapMin38 = new ds.FPHeapMin(100);
        ds.Item item39 = null;
        ds.Item[] itemArray40 = new ds.Item[] { item39 };
        fPHeapMin38.copia(itemArray40);
        fPHeapMin38.imprime();
        ds.FPHeapMin fPHeapMin44 = new ds.FPHeapMin(100);
        ds.Item[] itemArray45 = new ds.Item[] {};
        fPHeapMin44.copia(itemArray45);
        ds.FPHeapMin fPHeapMin48 = new ds.FPHeapMin(100);
        ds.Item item49 = null;
        ds.Item[] itemArray50 = new ds.Item[] { item49 };
        fPHeapMin48.copia(itemArray50);
        fPHeapMin44.copia(itemArray50);
        fPHeapMin38.copia(itemArray50);
        ds.FPHeapMin fPHeapMin55 = new ds.FPHeapMin(100);
        ds.Item item56 = null;
        ds.Item[] itemArray57 = new ds.Item[] { item56 };
        fPHeapMin55.copia(itemArray57);
        fPHeapMin38.copia(itemArray57);
        fPHeapMin33.copia(itemArray57);
        fPHeapMin31.copia(itemArray57);
        ds.FPHeapMin fPHeapMin62 = new ds.FPHeapMin(itemArray57);
        fPHeapMin1.copia(itemArray57);
        ds.Item item64 = null;
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMin1.insere(item64);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray5);
        org.junit.Assert.assertNotNull(itemArray10);
        org.junit.Assert.assertNotNull(itemArray15);
        org.junit.Assert.assertNotNull(itemArray20);
        org.junit.Assert.assertNotNull(itemArray27);
        org.junit.Assert.assertNotNull(itemArray35);
        org.junit.Assert.assertNotNull(itemArray40);
        org.junit.Assert.assertNotNull(itemArray45);
        org.junit.Assert.assertNotNull(itemArray50);
        org.junit.Assert.assertNotNull(itemArray57);
    }

    @Test
    public void test220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test220");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin(100);
        ds.Item item2 = null;
        ds.Item[] itemArray3 = new ds.Item[] { item2 };
        fPHeapMin1.copia(itemArray3);
        ds.FPHeapMin fPHeapMin6 = new ds.FPHeapMin(100);
        ds.Item item7 = null;
        ds.Item[] itemArray8 = new ds.Item[] { item7 };
        fPHeapMin6.copia(itemArray8);
        ds.FPHeapMin fPHeapMin10 = new ds.FPHeapMin(itemArray8);
        fPHeapMin1.copia(itemArray8);
        fPHeapMin1.constroi();
        java.lang.Class<?> wildcardClass13 = fPHeapMin1.getClass();
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertNotNull(itemArray8);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test221");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin(100);
        ds.Item item2 = null;
        ds.Item[] itemArray3 = new ds.Item[] { item2 };
        fPHeapMin1.copia(itemArray3);
        fPHeapMin1.imprime();
        ds.FPHeapMin fPHeapMin7 = new ds.FPHeapMin(100);
        ds.Item[] itemArray8 = new ds.Item[] {};
        fPHeapMin7.copia(itemArray8);
        ds.FPHeapMin fPHeapMin11 = new ds.FPHeapMin(100);
        ds.Item item12 = null;
        ds.Item[] itemArray13 = new ds.Item[] { item12 };
        fPHeapMin11.copia(itemArray13);
        fPHeapMin7.copia(itemArray13);
        fPHeapMin1.copia(itemArray13);
        ds.FPHeapMin fPHeapMin18 = new ds.FPHeapMin(100);
        ds.Item item19 = null;
        ds.Item[] itemArray20 = new ds.Item[] { item19 };
        fPHeapMin18.copia(itemArray20);
        fPHeapMin1.copia(itemArray20);
        fPHeapMin1.imprime();
        ds.FPHeapMin fPHeapMin25 = new ds.FPHeapMin(100);
        ds.Item item26 = null;
        ds.Item[] itemArray27 = new ds.Item[] { item26 };
        fPHeapMin25.copia(itemArray27);
        ds.FPHeapMin fPHeapMin29 = new ds.FPHeapMin(itemArray27);
        ds.FPHeapMin fPHeapMin31 = new ds.FPHeapMin(100);
        ds.Item item32 = null;
        ds.Item[] itemArray33 = new ds.Item[] { item32 };
        fPHeapMin31.copia(itemArray33);
        fPHeapMin31.imprime();
        fPHeapMin31.constroi();
        ds.FPHeapMin fPHeapMin38 = new ds.FPHeapMin(100);
        ds.Item item39 = null;
        ds.Item[] itemArray40 = new ds.Item[] { item39 };
        fPHeapMin38.copia(itemArray40);
        ds.FPHeapMin fPHeapMin43 = new ds.FPHeapMin(100);
        ds.Item item44 = null;
        ds.Item[] itemArray45 = new ds.Item[] { item44 };
        fPHeapMin43.copia(itemArray45);
        fPHeapMin43.imprime();
        ds.FPHeapMin fPHeapMin49 = new ds.FPHeapMin(100);
        ds.Item[] itemArray50 = new ds.Item[] {};
        fPHeapMin49.copia(itemArray50);
        ds.FPHeapMin fPHeapMin53 = new ds.FPHeapMin(100);
        ds.Item item54 = null;
        ds.Item[] itemArray55 = new ds.Item[] { item54 };
        fPHeapMin53.copia(itemArray55);
        fPHeapMin49.copia(itemArray55);
        fPHeapMin43.copia(itemArray55);
        ds.FPHeapMin fPHeapMin60 = new ds.FPHeapMin(100);
        ds.Item item61 = null;
        ds.Item[] itemArray62 = new ds.Item[] { item61 };
        fPHeapMin60.copia(itemArray62);
        fPHeapMin43.copia(itemArray62);
        fPHeapMin38.copia(itemArray62);
        fPHeapMin31.copia(itemArray62);
        fPHeapMin29.copia(itemArray62);
        ds.FPHeapMin fPHeapMin69 = new ds.FPHeapMin(100);
        fPHeapMin69.imprime();
        ds.FPHeapMin fPHeapMin72 = new ds.FPHeapMin(100);
        ds.Item[] itemArray73 = new ds.Item[] {};
        fPHeapMin72.copia(itemArray73);
        ds.FPHeapMin fPHeapMin76 = new ds.FPHeapMin(100);
        ds.Item item77 = null;
        ds.Item[] itemArray78 = new ds.Item[] { item77 };
        fPHeapMin76.copia(itemArray78);
        fPHeapMin72.copia(itemArray78);
        fPHeapMin69.copia(itemArray78);
        ds.FPHeapMin fPHeapMin82 = new ds.FPHeapMin(itemArray78);
        fPHeapMin29.copia(itemArray78);
        ds.FPHeapMin fPHeapMin84 = new ds.FPHeapMin(itemArray78);
        fPHeapMin1.copia(itemArray78);
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertNotNull(itemArray8);
        org.junit.Assert.assertNotNull(itemArray13);
        org.junit.Assert.assertNotNull(itemArray20);
        org.junit.Assert.assertNotNull(itemArray27);
        org.junit.Assert.assertNotNull(itemArray33);
        org.junit.Assert.assertNotNull(itemArray40);
        org.junit.Assert.assertNotNull(itemArray45);
        org.junit.Assert.assertNotNull(itemArray50);
        org.junit.Assert.assertNotNull(itemArray55);
        org.junit.Assert.assertNotNull(itemArray62);
        org.junit.Assert.assertNotNull(itemArray73);
        org.junit.Assert.assertNotNull(itemArray78);
    }

    @Test
    public void test222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test222");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin((int) (short) -1);
        fPHeapMin1.imprime();
        ds.FPHeapMin fPHeapMin4 = new ds.FPHeapMin(100);
        ds.Item item5 = null;
        ds.Item[] itemArray6 = new ds.Item[] { item5 };
        fPHeapMin4.copia(itemArray6);
        fPHeapMin4.imprime();
        ds.FPHeapMin fPHeapMin10 = new ds.FPHeapMin(100);
        ds.Item[] itemArray11 = new ds.Item[] {};
        fPHeapMin10.copia(itemArray11);
        ds.FPHeapMin fPHeapMin14 = new ds.FPHeapMin(100);
        ds.Item item15 = null;
        ds.Item[] itemArray16 = new ds.Item[] { item15 };
        fPHeapMin14.copia(itemArray16);
        fPHeapMin10.copia(itemArray16);
        fPHeapMin4.copia(itemArray16);
        ds.FPHeapMin fPHeapMin21 = new ds.FPHeapMin(100);
        ds.Item item22 = null;
        ds.Item[] itemArray23 = new ds.Item[] { item22 };
        fPHeapMin21.copia(itemArray23);
        fPHeapMin4.copia(itemArray23);
        ds.Item item26 = fPHeapMin4.min();
        ds.Item item27 = fPHeapMin4.min();
        fPHeapMin4.constroi();
        ds.FPHeapMin fPHeapMin30 = new ds.FPHeapMin((int) (short) -1);
        ds.FPHeapMin fPHeapMin32 = new ds.FPHeapMin(100);
        ds.Item item33 = null;
        ds.Item[] itemArray34 = new ds.Item[] { item33 };
        fPHeapMin32.copia(itemArray34);
        fPHeapMin32.imprime();
        fPHeapMin32.constroi();
        fPHeapMin32.constroi();
        ds.FPHeapMin fPHeapMin40 = new ds.FPHeapMin(100);
        ds.Item[] itemArray41 = new ds.Item[] {};
        fPHeapMin40.copia(itemArray41);
        ds.FPHeapMin fPHeapMin44 = new ds.FPHeapMin(100);
        ds.Item item45 = null;
        ds.Item[] itemArray46 = new ds.Item[] { item45 };
        fPHeapMin44.copia(itemArray46);
        fPHeapMin40.copia(itemArray46);
        ds.FPHeapMin fPHeapMin50 = new ds.FPHeapMin(100);
        ds.Item item51 = null;
        ds.Item[] itemArray52 = new ds.Item[] { item51 };
        fPHeapMin50.copia(itemArray52);
        ds.FPHeapMin fPHeapMin54 = new ds.FPHeapMin(itemArray52);
        fPHeapMin40.copia(itemArray52);
        fPHeapMin32.copia(itemArray52);
        fPHeapMin30.copia(itemArray52);
        fPHeapMin4.copia(itemArray52);
        fPHeapMin1.copia(itemArray52);
        org.junit.Assert.assertNotNull(itemArray6);
        org.junit.Assert.assertNotNull(itemArray11);
        org.junit.Assert.assertNotNull(itemArray16);
        org.junit.Assert.assertNotNull(itemArray23);
        org.junit.Assert.assertNull(item26);
        org.junit.Assert.assertNull(item27);
        org.junit.Assert.assertNotNull(itemArray34);
        org.junit.Assert.assertNotNull(itemArray41);
        org.junit.Assert.assertNotNull(itemArray46);
        org.junit.Assert.assertNotNull(itemArray52);
    }

    @Test
    public void test223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test223");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin((int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            ds.Item item2 = fPHeapMin1.min();
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test224");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin(100);
        ds.Item item2 = null;
        ds.Item[] itemArray3 = new ds.Item[] { item2 };
        fPHeapMin1.copia(itemArray3);
        fPHeapMin1.imprime();
        fPHeapMin1.imprime();
        fPHeapMin1.imprime();
        ds.FPHeapMin fPHeapMin9 = new ds.FPHeapMin(100);
        ds.Item[] itemArray10 = new ds.Item[] {};
        fPHeapMin9.copia(itemArray10);
        fPHeapMin1.copia(itemArray10);
        fPHeapMin1.constroi();
        fPHeapMin1.imprime();
        ds.Item item15 = fPHeapMin1.min();
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertNotNull(itemArray10);
        org.junit.Assert.assertNull(item15);
    }

    @Test
    public void test225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test225");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin(100);
        ds.Item item2 = null;
        ds.Item[] itemArray3 = new ds.Item[] { item2 };
        fPHeapMin1.copia(itemArray3);
        fPHeapMin1.imprime();
        ds.FPHeapMin fPHeapMin7 = new ds.FPHeapMin(100);
        ds.Item[] itemArray8 = new ds.Item[] {};
        fPHeapMin7.copia(itemArray8);
        ds.FPHeapMin fPHeapMin11 = new ds.FPHeapMin(100);
        ds.Item item12 = null;
        ds.Item[] itemArray13 = new ds.Item[] { item12 };
        fPHeapMin11.copia(itemArray13);
        fPHeapMin7.copia(itemArray13);
        fPHeapMin1.copia(itemArray13);
        ds.FPHeapMin fPHeapMin18 = new ds.FPHeapMin(100);
        ds.Item item19 = null;
        ds.Item[] itemArray20 = new ds.Item[] { item19 };
        fPHeapMin18.copia(itemArray20);
        fPHeapMin1.copia(itemArray20);
        ds.Item item23 = fPHeapMin1.min();
        ds.Item item24 = fPHeapMin1.min();
        ds.FPHeapMin fPHeapMin26 = new ds.FPHeapMin(100);
        ds.Item item27 = null;
        ds.Item[] itemArray28 = new ds.Item[] { item27 };
        fPHeapMin26.copia(itemArray28);
        ds.FPHeapMin fPHeapMin30 = new ds.FPHeapMin(itemArray28);
        fPHeapMin1.copia(itemArray28);
        ds.Item item32 = null;
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMin1.insere(item32);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertNotNull(itemArray8);
        org.junit.Assert.assertNotNull(itemArray13);
        org.junit.Assert.assertNotNull(itemArray20);
        org.junit.Assert.assertNull(item23);
        org.junit.Assert.assertNull(item24);
        org.junit.Assert.assertNotNull(itemArray28);
    }

    @Test
    public void test226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test226");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin((int) '#');
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
    public void test227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test227");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin(100);
        ds.Item[] itemArray2 = new ds.Item[] {};
        fPHeapMin1.copia(itemArray2);
        ds.FPHeapMin fPHeapMin5 = new ds.FPHeapMin(100);
        ds.Item[] itemArray6 = new ds.Item[] {};
        fPHeapMin5.copia(itemArray6);
        ds.FPHeapMin fPHeapMin9 = new ds.FPHeapMin(100);
        ds.Item item10 = null;
        ds.Item[] itemArray11 = new ds.Item[] { item10 };
        fPHeapMin9.copia(itemArray11);
        fPHeapMin5.copia(itemArray11);
        ds.FPHeapMin fPHeapMin14 = new ds.FPHeapMin(itemArray11);
        fPHeapMin1.copia(itemArray11);
        ds.Item item16 = fPHeapMin1.min();
        ds.FPHeapMin fPHeapMin19 = new ds.FPHeapMin(100);
        ds.Item[] itemArray20 = new ds.Item[] {};
        fPHeapMin19.copia(itemArray20);
        ds.FPHeapMin fPHeapMin22 = new ds.FPHeapMin(itemArray20);
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMin1.diminuiChave((int) (byte) 1, (java.lang.Object) fPHeapMin22);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray2);
        org.junit.Assert.assertNotNull(itemArray6);
        org.junit.Assert.assertNotNull(itemArray11);
        org.junit.Assert.assertNull(item16);
        org.junit.Assert.assertNotNull(itemArray20);
    }

    @Test
    public void test228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test228");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin((int) '#');
        ds.FPHeapMin fPHeapMin3 = new ds.FPHeapMin(100);
        ds.Item[] itemArray4 = new ds.Item[] {};
        fPHeapMin3.copia(itemArray4);
        ds.FPHeapMin fPHeapMin7 = new ds.FPHeapMin(100);
        ds.Item item8 = null;
        ds.Item[] itemArray9 = new ds.Item[] { item8 };
        fPHeapMin7.copia(itemArray9);
        fPHeapMin3.copia(itemArray9);
        ds.FPHeapMin fPHeapMin13 = new ds.FPHeapMin(100);
        ds.Item item14 = null;
        ds.Item[] itemArray15 = new ds.Item[] { item14 };
        fPHeapMin13.copia(itemArray15);
        ds.FPHeapMin fPHeapMin17 = new ds.FPHeapMin(itemArray15);
        fPHeapMin3.copia(itemArray15);
        fPHeapMin1.copia(itemArray15);
        // The following exception was thrown during execution in test generation
        try {
            ds.Item item20 = fPHeapMin1.retiraMin();
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: heap vazio");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray4);
        org.junit.Assert.assertNotNull(itemArray9);
        org.junit.Assert.assertNotNull(itemArray15);
    }

    @Test
    public void test229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test229");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin((int) (byte) 100);
    }

    @Test
    public void test230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test230");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin((-1));
        fPHeapMin1.constroi();
    }

    @Test
    public void test231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test231");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin(100);
        ds.Item item2 = null;
        ds.Item[] itemArray3 = new ds.Item[] { item2 };
        fPHeapMin1.copia(itemArray3);
        fPHeapMin1.imprime();
        fPHeapMin1.constroi();
        fPHeapMin1.constroi();
        ds.Item item8 = fPHeapMin1.min();
        fPHeapMin1.constroi();
        fPHeapMin1.imprime();
        fPHeapMin1.constroi();
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertNull(item8);
    }

    @Test
    public void test232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test232");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin(100);
        ds.Item item2 = null;
        ds.Item[] itemArray3 = new ds.Item[] { item2 };
        fPHeapMin1.copia(itemArray3);
        fPHeapMin1.imprime();
        ds.FPHeapMin fPHeapMin7 = new ds.FPHeapMin(100);
        ds.Item[] itemArray8 = new ds.Item[] {};
        fPHeapMin7.copia(itemArray8);
        ds.FPHeapMin fPHeapMin11 = new ds.FPHeapMin(100);
        ds.Item item12 = null;
        ds.Item[] itemArray13 = new ds.Item[] { item12 };
        fPHeapMin11.copia(itemArray13);
        fPHeapMin7.copia(itemArray13);
        fPHeapMin1.copia(itemArray13);
        ds.FPHeapMin fPHeapMin18 = new ds.FPHeapMin(100);
        fPHeapMin18.imprime();
        ds.FPHeapMin fPHeapMin21 = new ds.FPHeapMin(100);
        ds.Item[] itemArray22 = new ds.Item[] {};
        fPHeapMin21.copia(itemArray22);
        ds.FPHeapMin fPHeapMin25 = new ds.FPHeapMin(100);
        ds.Item item26 = null;
        ds.Item[] itemArray27 = new ds.Item[] { item26 };
        fPHeapMin25.copia(itemArray27);
        fPHeapMin21.copia(itemArray27);
        fPHeapMin18.copia(itemArray27);
        fPHeapMin1.copia(itemArray27);
        ds.FPHeapMin fPHeapMin33 = new ds.FPHeapMin(100);
        ds.Item item34 = null;
        ds.Item[] itemArray35 = new ds.Item[] { item34 };
        fPHeapMin33.copia(itemArray35);
        fPHeapMin33.imprime();
        fPHeapMin33.imprime();
        ds.FPHeapMin fPHeapMin40 = new ds.FPHeapMin(100);
        ds.Item item41 = null;
        ds.Item[] itemArray42 = new ds.Item[] { item41 };
        fPHeapMin40.copia(itemArray42);
        ds.FPHeapMin fPHeapMin45 = new ds.FPHeapMin(100);
        ds.Item item46 = null;
        ds.Item[] itemArray47 = new ds.Item[] { item46 };
        fPHeapMin45.copia(itemArray47);
        fPHeapMin45.imprime();
        ds.FPHeapMin fPHeapMin51 = new ds.FPHeapMin(100);
        ds.Item[] itemArray52 = new ds.Item[] {};
        fPHeapMin51.copia(itemArray52);
        ds.FPHeapMin fPHeapMin55 = new ds.FPHeapMin(100);
        ds.Item item56 = null;
        ds.Item[] itemArray57 = new ds.Item[] { item56 };
        fPHeapMin55.copia(itemArray57);
        fPHeapMin51.copia(itemArray57);
        fPHeapMin45.copia(itemArray57);
        ds.FPHeapMin fPHeapMin62 = new ds.FPHeapMin(100);
        ds.Item item63 = null;
        ds.Item[] itemArray64 = new ds.Item[] { item63 };
        fPHeapMin62.copia(itemArray64);
        fPHeapMin45.copia(itemArray64);
        fPHeapMin40.copia(itemArray64);
        fPHeapMin33.copia(itemArray64);
        fPHeapMin1.copia(itemArray64);
        java.lang.Class<?> wildcardClass70 = fPHeapMin1.getClass();
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertNotNull(itemArray8);
        org.junit.Assert.assertNotNull(itemArray13);
        org.junit.Assert.assertNotNull(itemArray22);
        org.junit.Assert.assertNotNull(itemArray27);
        org.junit.Assert.assertNotNull(itemArray35);
        org.junit.Assert.assertNotNull(itemArray42);
        org.junit.Assert.assertNotNull(itemArray47);
        org.junit.Assert.assertNotNull(itemArray52);
        org.junit.Assert.assertNotNull(itemArray57);
        org.junit.Assert.assertNotNull(itemArray64);
        org.junit.Assert.assertNotNull(wildcardClass70);
    }

    @Test
    public void test233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test233");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin(100);
        ds.Item[] itemArray2 = new ds.Item[] {};
        fPHeapMin1.copia(itemArray2);
        ds.FPHeapMin fPHeapMin5 = new ds.FPHeapMin(100);
        ds.Item item6 = null;
        ds.Item[] itemArray7 = new ds.Item[] { item6 };
        fPHeapMin5.copia(itemArray7);
        fPHeapMin1.copia(itemArray7);
        fPHeapMin1.imprime();
        fPHeapMin1.constroi();
        fPHeapMin1.imprime();
        org.junit.Assert.assertNotNull(itemArray2);
        org.junit.Assert.assertNotNull(itemArray7);
    }

    @Test
    public void test234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test234");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin(100);
        ds.Item item2 = null;
        ds.Item[] itemArray3 = new ds.Item[] { item2 };
        fPHeapMin1.copia(itemArray3);
        ds.FPHeapMin fPHeapMin5 = new ds.FPHeapMin(itemArray3);
        ds.FPHeapMin fPHeapMin6 = new ds.FPHeapMin(itemArray3);
        fPHeapMin6.constroi();
        org.junit.Assert.assertNotNull(itemArray3);
    }

    @Test
    public void test235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test235");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin(100);
        ds.Item item2 = null;
        ds.Item[] itemArray3 = new ds.Item[] { item2 };
        fPHeapMin1.copia(itemArray3);
        fPHeapMin1.imprime();
        fPHeapMin1.imprime();
        ds.FPHeapMin fPHeapMin8 = new ds.FPHeapMin(100);
        ds.Item item9 = null;
        ds.Item[] itemArray10 = new ds.Item[] { item9 };
        fPHeapMin8.copia(itemArray10);
        ds.FPHeapMin fPHeapMin13 = new ds.FPHeapMin(100);
        ds.Item item14 = null;
        ds.Item[] itemArray15 = new ds.Item[] { item14 };
        fPHeapMin13.copia(itemArray15);
        fPHeapMin13.imprime();
        ds.FPHeapMin fPHeapMin19 = new ds.FPHeapMin(100);
        ds.Item[] itemArray20 = new ds.Item[] {};
        fPHeapMin19.copia(itemArray20);
        ds.FPHeapMin fPHeapMin23 = new ds.FPHeapMin(100);
        ds.Item item24 = null;
        ds.Item[] itemArray25 = new ds.Item[] { item24 };
        fPHeapMin23.copia(itemArray25);
        fPHeapMin19.copia(itemArray25);
        fPHeapMin13.copia(itemArray25);
        ds.FPHeapMin fPHeapMin30 = new ds.FPHeapMin(100);
        ds.Item item31 = null;
        ds.Item[] itemArray32 = new ds.Item[] { item31 };
        fPHeapMin30.copia(itemArray32);
        fPHeapMin13.copia(itemArray32);
        fPHeapMin8.copia(itemArray32);
        fPHeapMin1.copia(itemArray32);
        ds.Item item37 = fPHeapMin1.min();
        ds.FPHeapMin fPHeapMin39 = new ds.FPHeapMin(100);
        ds.Item item40 = null;
        ds.Item[] itemArray41 = new ds.Item[] { item40 };
        fPHeapMin39.copia(itemArray41);
        fPHeapMin39.imprime();
        fPHeapMin39.constroi();
        fPHeapMin39.constroi();
        ds.FPHeapMin fPHeapMin47 = new ds.FPHeapMin(100);
        ds.Item[] itemArray48 = new ds.Item[] {};
        fPHeapMin47.copia(itemArray48);
        ds.FPHeapMin fPHeapMin51 = new ds.FPHeapMin(100);
        ds.Item item52 = null;
        ds.Item[] itemArray53 = new ds.Item[] { item52 };
        fPHeapMin51.copia(itemArray53);
        fPHeapMin47.copia(itemArray53);
        ds.FPHeapMin fPHeapMin57 = new ds.FPHeapMin(100);
        ds.Item item58 = null;
        ds.Item[] itemArray59 = new ds.Item[] { item58 };
        fPHeapMin57.copia(itemArray59);
        ds.FPHeapMin fPHeapMin61 = new ds.FPHeapMin(itemArray59);
        fPHeapMin47.copia(itemArray59);
        fPHeapMin39.copia(itemArray59);
        fPHeapMin1.copia(itemArray59);
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertNotNull(itemArray10);
        org.junit.Assert.assertNotNull(itemArray15);
        org.junit.Assert.assertNotNull(itemArray20);
        org.junit.Assert.assertNotNull(itemArray25);
        org.junit.Assert.assertNotNull(itemArray32);
        org.junit.Assert.assertNull(item37);
        org.junit.Assert.assertNotNull(itemArray41);
        org.junit.Assert.assertNotNull(itemArray48);
        org.junit.Assert.assertNotNull(itemArray53);
        org.junit.Assert.assertNotNull(itemArray59);
    }

    @Test
    public void test236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test236");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin(100);
        ds.Item item2 = null;
        ds.Item[] itemArray3 = new ds.Item[] { item2 };
        fPHeapMin1.copia(itemArray3);
        ds.FPHeapMin fPHeapMin6 = new ds.FPHeapMin(100);
        ds.Item item7 = null;
        ds.Item[] itemArray8 = new ds.Item[] { item7 };
        fPHeapMin6.copia(itemArray8);
        ds.FPHeapMin fPHeapMin10 = new ds.FPHeapMin(itemArray8);
        fPHeapMin1.copia(itemArray8);
        ds.FPHeapMin fPHeapMin12 = new ds.FPHeapMin(itemArray8);
        ds.FPHeapMin fPHeapMin13 = new ds.FPHeapMin(itemArray8);
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertNotNull(itemArray8);
    }

    @Test
    public void test237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test237");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin(100);
        ds.Item item2 = null;
        ds.Item[] itemArray3 = new ds.Item[] { item2 };
        fPHeapMin1.copia(itemArray3);
        ds.FPHeapMin fPHeapMin5 = new ds.FPHeapMin(itemArray3);
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMin5.refaz((int) (byte) -1, 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray3);
    }

    @Test
    public void test238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test238");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin(100);
        ds.Item item2 = null;
        ds.Item[] itemArray3 = new ds.Item[] { item2 };
        fPHeapMin1.copia(itemArray3);
        fPHeapMin1.imprime();
        fPHeapMin1.constroi();
        ds.Item item7 = fPHeapMin1.min();
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertNull(item7);
    }

    @Test
    public void test239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test239");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin(100);
        fPHeapMin1.imprime();
        ds.FPHeapMin fPHeapMin4 = new ds.FPHeapMin(100);
        ds.Item[] itemArray5 = new ds.Item[] {};
        fPHeapMin4.copia(itemArray5);
        ds.FPHeapMin fPHeapMin8 = new ds.FPHeapMin(100);
        ds.Item item9 = null;
        ds.Item[] itemArray10 = new ds.Item[] { item9 };
        fPHeapMin8.copia(itemArray10);
        fPHeapMin4.copia(itemArray10);
        fPHeapMin1.copia(itemArray10);
        ds.FPHeapMin fPHeapMin14 = new ds.FPHeapMin(itemArray10);
        ds.FPHeapMin fPHeapMin15 = new ds.FPHeapMin(itemArray10);
        // The following exception was thrown during execution in test generation
        try {
            ds.Item item16 = fPHeapMin15.min();
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray5);
        org.junit.Assert.assertNotNull(itemArray10);
    }

    @Test
    public void test240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test240");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin(100);
        ds.Item item2 = null;
        ds.Item[] itemArray3 = new ds.Item[] { item2 };
        fPHeapMin1.copia(itemArray3);
        ds.FPHeapMin fPHeapMin6 = new ds.FPHeapMin(100);
        ds.Item item7 = null;
        ds.Item[] itemArray8 = new ds.Item[] { item7 };
        fPHeapMin6.copia(itemArray8);
        fPHeapMin6.imprime();
        ds.FPHeapMin fPHeapMin12 = new ds.FPHeapMin(100);
        ds.Item[] itemArray13 = new ds.Item[] {};
        fPHeapMin12.copia(itemArray13);
        ds.FPHeapMin fPHeapMin16 = new ds.FPHeapMin(100);
        ds.Item item17 = null;
        ds.Item[] itemArray18 = new ds.Item[] { item17 };
        fPHeapMin16.copia(itemArray18);
        fPHeapMin12.copia(itemArray18);
        fPHeapMin6.copia(itemArray18);
        ds.FPHeapMin fPHeapMin23 = new ds.FPHeapMin(100);
        ds.Item item24 = null;
        ds.Item[] itemArray25 = new ds.Item[] { item24 };
        fPHeapMin23.copia(itemArray25);
        fPHeapMin6.copia(itemArray25);
        fPHeapMin1.copia(itemArray25);
        ds.FPHeapMin fPHeapMin29 = new ds.FPHeapMin(itemArray25);
        fPHeapMin29.constroi();
        ds.Item[] itemArray31 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin32 = new ds.FPHeapMin(itemArray31);
        ds.FPHeapMin fPHeapMin34 = new ds.FPHeapMin(100);
        ds.Item item35 = null;
        ds.Item[] itemArray36 = new ds.Item[] { item35 };
        fPHeapMin34.copia(itemArray36);
        ds.FPHeapMin fPHeapMin39 = new ds.FPHeapMin(100);
        ds.Item item40 = null;
        ds.Item[] itemArray41 = new ds.Item[] { item40 };
        fPHeapMin39.copia(itemArray41);
        fPHeapMin39.imprime();
        ds.FPHeapMin fPHeapMin45 = new ds.FPHeapMin(100);
        ds.Item[] itemArray46 = new ds.Item[] {};
        fPHeapMin45.copia(itemArray46);
        ds.FPHeapMin fPHeapMin49 = new ds.FPHeapMin(100);
        ds.Item item50 = null;
        ds.Item[] itemArray51 = new ds.Item[] { item50 };
        fPHeapMin49.copia(itemArray51);
        fPHeapMin45.copia(itemArray51);
        fPHeapMin39.copia(itemArray51);
        ds.FPHeapMin fPHeapMin56 = new ds.FPHeapMin(100);
        ds.Item item57 = null;
        ds.Item[] itemArray58 = new ds.Item[] { item57 };
        fPHeapMin56.copia(itemArray58);
        fPHeapMin39.copia(itemArray58);
        fPHeapMin34.copia(itemArray58);
        ds.FPHeapMin fPHeapMin62 = new ds.FPHeapMin(itemArray58);
        fPHeapMin32.copia(itemArray58);
        ds.FPHeapMin fPHeapMin64 = new ds.FPHeapMin(itemArray58);
        fPHeapMin29.copia(itemArray58);
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertNotNull(itemArray8);
        org.junit.Assert.assertNotNull(itemArray13);
        org.junit.Assert.assertNotNull(itemArray18);
        org.junit.Assert.assertNotNull(itemArray25);
        org.junit.Assert.assertNotNull(itemArray31);
        org.junit.Assert.assertNotNull(itemArray36);
        org.junit.Assert.assertNotNull(itemArray41);
        org.junit.Assert.assertNotNull(itemArray46);
        org.junit.Assert.assertNotNull(itemArray51);
        org.junit.Assert.assertNotNull(itemArray58);
    }

    @Test
    public void test241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test241");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin(100);
        ds.Item item2 = null;
        ds.Item[] itemArray3 = new ds.Item[] { item2 };
        fPHeapMin1.copia(itemArray3);
        fPHeapMin1.imprime();
        ds.FPHeapMin fPHeapMin7 = new ds.FPHeapMin(100);
        ds.Item[] itemArray8 = new ds.Item[] {};
        fPHeapMin7.copia(itemArray8);
        ds.FPHeapMin fPHeapMin11 = new ds.FPHeapMin(100);
        ds.Item item12 = null;
        ds.Item[] itemArray13 = new ds.Item[] { item12 };
        fPHeapMin11.copia(itemArray13);
        fPHeapMin7.copia(itemArray13);
        fPHeapMin1.copia(itemArray13);
        ds.FPHeapMin fPHeapMin18 = new ds.FPHeapMin(100);
        fPHeapMin18.imprime();
        ds.FPHeapMin fPHeapMin21 = new ds.FPHeapMin(100);
        ds.Item[] itemArray22 = new ds.Item[] {};
        fPHeapMin21.copia(itemArray22);
        ds.FPHeapMin fPHeapMin25 = new ds.FPHeapMin(100);
        ds.Item item26 = null;
        ds.Item[] itemArray27 = new ds.Item[] { item26 };
        fPHeapMin25.copia(itemArray27);
        fPHeapMin21.copia(itemArray27);
        fPHeapMin18.copia(itemArray27);
        fPHeapMin1.copia(itemArray27);
        ds.FPHeapMin fPHeapMin33 = new ds.FPHeapMin(100);
        ds.Item item34 = null;
        ds.Item[] itemArray35 = new ds.Item[] { item34 };
        fPHeapMin33.copia(itemArray35);
        fPHeapMin33.imprime();
        fPHeapMin33.imprime();
        ds.FPHeapMin fPHeapMin40 = new ds.FPHeapMin(100);
        ds.Item item41 = null;
        ds.Item[] itemArray42 = new ds.Item[] { item41 };
        fPHeapMin40.copia(itemArray42);
        ds.FPHeapMin fPHeapMin45 = new ds.FPHeapMin(100);
        ds.Item item46 = null;
        ds.Item[] itemArray47 = new ds.Item[] { item46 };
        fPHeapMin45.copia(itemArray47);
        fPHeapMin45.imprime();
        ds.FPHeapMin fPHeapMin51 = new ds.FPHeapMin(100);
        ds.Item[] itemArray52 = new ds.Item[] {};
        fPHeapMin51.copia(itemArray52);
        ds.FPHeapMin fPHeapMin55 = new ds.FPHeapMin(100);
        ds.Item item56 = null;
        ds.Item[] itemArray57 = new ds.Item[] { item56 };
        fPHeapMin55.copia(itemArray57);
        fPHeapMin51.copia(itemArray57);
        fPHeapMin45.copia(itemArray57);
        ds.FPHeapMin fPHeapMin62 = new ds.FPHeapMin(100);
        ds.Item item63 = null;
        ds.Item[] itemArray64 = new ds.Item[] { item63 };
        fPHeapMin62.copia(itemArray64);
        fPHeapMin45.copia(itemArray64);
        fPHeapMin40.copia(itemArray64);
        fPHeapMin33.copia(itemArray64);
        fPHeapMin1.copia(itemArray64);
        fPHeapMin1.imprime();
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertNotNull(itemArray8);
        org.junit.Assert.assertNotNull(itemArray13);
        org.junit.Assert.assertNotNull(itemArray22);
        org.junit.Assert.assertNotNull(itemArray27);
        org.junit.Assert.assertNotNull(itemArray35);
        org.junit.Assert.assertNotNull(itemArray42);
        org.junit.Assert.assertNotNull(itemArray47);
        org.junit.Assert.assertNotNull(itemArray52);
        org.junit.Assert.assertNotNull(itemArray57);
        org.junit.Assert.assertNotNull(itemArray64);
    }

    @Test
    public void test242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test242");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin(0);
        fPHeapMin1.constroi();
        // The following exception was thrown during execution in test generation
        try {
            ds.Item item3 = fPHeapMin1.min();
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test243");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin((int) (short) 100);
        ds.FPHeapMin fPHeapMin3 = new ds.FPHeapMin(100);
        ds.Item item4 = null;
        ds.Item[] itemArray5 = new ds.Item[] { item4 };
        fPHeapMin3.copia(itemArray5);
        ds.FPHeapMin fPHeapMin8 = new ds.FPHeapMin(100);
        ds.Item item9 = null;
        ds.Item[] itemArray10 = new ds.Item[] { item9 };
        fPHeapMin8.copia(itemArray10);
        fPHeapMin8.imprime();
        ds.FPHeapMin fPHeapMin14 = new ds.FPHeapMin(100);
        ds.Item[] itemArray15 = new ds.Item[] {};
        fPHeapMin14.copia(itemArray15);
        ds.FPHeapMin fPHeapMin18 = new ds.FPHeapMin(100);
        ds.Item item19 = null;
        ds.Item[] itemArray20 = new ds.Item[] { item19 };
        fPHeapMin18.copia(itemArray20);
        fPHeapMin14.copia(itemArray20);
        fPHeapMin8.copia(itemArray20);
        ds.FPHeapMin fPHeapMin25 = new ds.FPHeapMin(100);
        ds.Item item26 = null;
        ds.Item[] itemArray27 = new ds.Item[] { item26 };
        fPHeapMin25.copia(itemArray27);
        fPHeapMin8.copia(itemArray27);
        fPHeapMin3.copia(itemArray27);
        ds.FPHeapMin fPHeapMin31 = new ds.FPHeapMin(itemArray27);
        ds.FPHeapMin fPHeapMin33 = new ds.FPHeapMin(100);
        ds.Item item34 = null;
        ds.Item[] itemArray35 = new ds.Item[] { item34 };
        fPHeapMin33.copia(itemArray35);
        ds.FPHeapMin fPHeapMin38 = new ds.FPHeapMin(100);
        ds.Item item39 = null;
        ds.Item[] itemArray40 = new ds.Item[] { item39 };
        fPHeapMin38.copia(itemArray40);
        fPHeapMin38.imprime();
        ds.FPHeapMin fPHeapMin44 = new ds.FPHeapMin(100);
        ds.Item[] itemArray45 = new ds.Item[] {};
        fPHeapMin44.copia(itemArray45);
        ds.FPHeapMin fPHeapMin48 = new ds.FPHeapMin(100);
        ds.Item item49 = null;
        ds.Item[] itemArray50 = new ds.Item[] { item49 };
        fPHeapMin48.copia(itemArray50);
        fPHeapMin44.copia(itemArray50);
        fPHeapMin38.copia(itemArray50);
        ds.FPHeapMin fPHeapMin55 = new ds.FPHeapMin(100);
        ds.Item item56 = null;
        ds.Item[] itemArray57 = new ds.Item[] { item56 };
        fPHeapMin55.copia(itemArray57);
        fPHeapMin38.copia(itemArray57);
        fPHeapMin33.copia(itemArray57);
        fPHeapMin31.copia(itemArray57);
        ds.FPHeapMin fPHeapMin62 = new ds.FPHeapMin(itemArray57);
        fPHeapMin1.copia(itemArray57);
        java.lang.Class<?> wildcardClass64 = fPHeapMin1.getClass();
        org.junit.Assert.assertNotNull(itemArray5);
        org.junit.Assert.assertNotNull(itemArray10);
        org.junit.Assert.assertNotNull(itemArray15);
        org.junit.Assert.assertNotNull(itemArray20);
        org.junit.Assert.assertNotNull(itemArray27);
        org.junit.Assert.assertNotNull(itemArray35);
        org.junit.Assert.assertNotNull(itemArray40);
        org.junit.Assert.assertNotNull(itemArray45);
        org.junit.Assert.assertNotNull(itemArray50);
        org.junit.Assert.assertNotNull(itemArray57);
        org.junit.Assert.assertNotNull(wildcardClass64);
    }

    @Test
    public void test244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test244");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin(100);
        ds.Item[] itemArray2 = new ds.Item[] {};
        fPHeapMin1.copia(itemArray2);
        ds.FPHeapMin fPHeapMin5 = new ds.FPHeapMin(100);
        ds.Item item6 = null;
        ds.Item[] itemArray7 = new ds.Item[] { item6 };
        fPHeapMin5.copia(itemArray7);
        fPHeapMin1.copia(itemArray7);
        ds.FPHeapMin fPHeapMin11 = new ds.FPHeapMin(100);
        ds.Item item12 = null;
        ds.Item[] itemArray13 = new ds.Item[] { item12 };
        fPHeapMin11.copia(itemArray13);
        ds.FPHeapMin fPHeapMin15 = new ds.FPHeapMin(itemArray13);
        fPHeapMin1.copia(itemArray13);
        ds.FPHeapMin fPHeapMin17 = new ds.FPHeapMin(itemArray13);
        // The following exception was thrown during execution in test generation
        try {
            ds.Item item18 = fPHeapMin17.retiraMin();
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: heap vazio");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray2);
        org.junit.Assert.assertNotNull(itemArray7);
        org.junit.Assert.assertNotNull(itemArray13);
    }

    @Test
    public void test245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test245");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin(100);
        ds.Item item2 = null;
        ds.Item[] itemArray3 = new ds.Item[] { item2 };
        fPHeapMin1.copia(itemArray3);
        fPHeapMin1.imprime();
        ds.FPHeapMin fPHeapMin7 = new ds.FPHeapMin(100);
        ds.Item[] itemArray8 = new ds.Item[] {};
        fPHeapMin7.copia(itemArray8);
        ds.FPHeapMin fPHeapMin11 = new ds.FPHeapMin(100);
        ds.Item item12 = null;
        ds.Item[] itemArray13 = new ds.Item[] { item12 };
        fPHeapMin11.copia(itemArray13);
        fPHeapMin7.copia(itemArray13);
        fPHeapMin1.copia(itemArray13);
        ds.FPHeapMin fPHeapMin18 = new ds.FPHeapMin(100);
        ds.Item item19 = null;
        ds.Item[] itemArray20 = new ds.Item[] { item19 };
        fPHeapMin18.copia(itemArray20);
        fPHeapMin1.copia(itemArray20);
        ds.Item item23 = fPHeapMin1.min();
        fPHeapMin1.imprime();
        ds.Item item25 = fPHeapMin1.min();
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertNotNull(itemArray8);
        org.junit.Assert.assertNotNull(itemArray13);
        org.junit.Assert.assertNotNull(itemArray20);
        org.junit.Assert.assertNull(item23);
        org.junit.Assert.assertNull(item25);
    }

    @Test
    public void test246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test246");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin(100);
        ds.Item item2 = null;
        ds.Item[] itemArray3 = new ds.Item[] { item2 };
        fPHeapMin1.copia(itemArray3);
        fPHeapMin1.imprime();
        ds.FPHeapMin fPHeapMin7 = new ds.FPHeapMin(100);
        ds.Item[] itemArray8 = new ds.Item[] {};
        fPHeapMin7.copia(itemArray8);
        ds.FPHeapMin fPHeapMin11 = new ds.FPHeapMin(100);
        ds.Item item12 = null;
        ds.Item[] itemArray13 = new ds.Item[] { item12 };
        fPHeapMin11.copia(itemArray13);
        fPHeapMin7.copia(itemArray13);
        fPHeapMin1.copia(itemArray13);
        ds.FPHeapMin fPHeapMin18 = new ds.FPHeapMin(100);
        fPHeapMin18.imprime();
        ds.FPHeapMin fPHeapMin21 = new ds.FPHeapMin(100);
        ds.Item[] itemArray22 = new ds.Item[] {};
        fPHeapMin21.copia(itemArray22);
        ds.FPHeapMin fPHeapMin25 = new ds.FPHeapMin(100);
        ds.Item item26 = null;
        ds.Item[] itemArray27 = new ds.Item[] { item26 };
        fPHeapMin25.copia(itemArray27);
        fPHeapMin21.copia(itemArray27);
        fPHeapMin18.copia(itemArray27);
        fPHeapMin1.copia(itemArray27);
        fPHeapMin1.constroi();
        fPHeapMin1.constroi();
        ds.Item item34 = fPHeapMin1.min();
        // The following exception was thrown during execution in test generation
        try {
            ds.Item item35 = fPHeapMin1.retiraMin();
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: heap vazio");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertNotNull(itemArray8);
        org.junit.Assert.assertNotNull(itemArray13);
        org.junit.Assert.assertNotNull(itemArray22);
        org.junit.Assert.assertNotNull(itemArray27);
        org.junit.Assert.assertNull(item34);
    }

    @Test
    public void test247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test247");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin(100);
        ds.Item item2 = null;
        ds.Item[] itemArray3 = new ds.Item[] { item2 };
        fPHeapMin1.copia(itemArray3);
        fPHeapMin1.imprime();
        fPHeapMin1.constroi();
        ds.FPHeapMin fPHeapMin8 = new ds.FPHeapMin(100);
        ds.Item item9 = null;
        ds.Item[] itemArray10 = new ds.Item[] { item9 };
        fPHeapMin8.copia(itemArray10);
        ds.FPHeapMin fPHeapMin13 = new ds.FPHeapMin(100);
        ds.Item item14 = null;
        ds.Item[] itemArray15 = new ds.Item[] { item14 };
        fPHeapMin13.copia(itemArray15);
        fPHeapMin13.imprime();
        ds.FPHeapMin fPHeapMin19 = new ds.FPHeapMin(100);
        ds.Item[] itemArray20 = new ds.Item[] {};
        fPHeapMin19.copia(itemArray20);
        ds.FPHeapMin fPHeapMin23 = new ds.FPHeapMin(100);
        ds.Item item24 = null;
        ds.Item[] itemArray25 = new ds.Item[] { item24 };
        fPHeapMin23.copia(itemArray25);
        fPHeapMin19.copia(itemArray25);
        fPHeapMin13.copia(itemArray25);
        ds.FPHeapMin fPHeapMin30 = new ds.FPHeapMin(100);
        ds.Item item31 = null;
        ds.Item[] itemArray32 = new ds.Item[] { item31 };
        fPHeapMin30.copia(itemArray32);
        fPHeapMin13.copia(itemArray32);
        fPHeapMin8.copia(itemArray32);
        fPHeapMin1.copia(itemArray32);
        fPHeapMin1.constroi();
        ds.Item item38 = null;
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMin1.insere(item38);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertNotNull(itemArray10);
        org.junit.Assert.assertNotNull(itemArray15);
        org.junit.Assert.assertNotNull(itemArray20);
        org.junit.Assert.assertNotNull(itemArray25);
        org.junit.Assert.assertNotNull(itemArray32);
    }

    @Test
    public void test248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test248");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin((int) (short) -1);
        ds.FPHeapMin fPHeapMin4 = new ds.FPHeapMin(0);
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMin1.diminuiChave((int) (short) 10, (java.lang.Object) fPHeapMin4);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 10");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test249");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin((int) (short) -1);
        fPHeapMin1.imprime();
        fPHeapMin1.imprime();
    }

    @Test
    public void test250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test250");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin(100);
        ds.Item item2 = null;
        ds.Item[] itemArray3 = new ds.Item[] { item2 };
        fPHeapMin1.copia(itemArray3);
        fPHeapMin1.imprime();
        ds.FPHeapMin fPHeapMin7 = new ds.FPHeapMin(100);
        ds.Item[] itemArray8 = new ds.Item[] {};
        fPHeapMin7.copia(itemArray8);
        ds.FPHeapMin fPHeapMin11 = new ds.FPHeapMin(100);
        ds.Item item12 = null;
        ds.Item[] itemArray13 = new ds.Item[] { item12 };
        fPHeapMin11.copia(itemArray13);
        fPHeapMin7.copia(itemArray13);
        fPHeapMin1.copia(itemArray13);
        ds.FPHeapMin fPHeapMin17 = new ds.FPHeapMin(itemArray13);
        fPHeapMin17.constroi();
        fPHeapMin17.imprime();
        fPHeapMin17.constroi();
        // The following exception was thrown during execution in test generation
        try {
            ds.Item item21 = fPHeapMin17.min();
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertNotNull(itemArray8);
        org.junit.Assert.assertNotNull(itemArray13);
    }

    @Test
    public void test251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test251");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin(100);
        ds.Item item2 = null;
        ds.Item[] itemArray3 = new ds.Item[] { item2 };
        fPHeapMin1.copia(itemArray3);
        fPHeapMin1.imprime();
        ds.FPHeapMin fPHeapMin7 = new ds.FPHeapMin(100);
        ds.Item[] itemArray8 = new ds.Item[] {};
        fPHeapMin7.copia(itemArray8);
        ds.FPHeapMin fPHeapMin11 = new ds.FPHeapMin(100);
        ds.Item item12 = null;
        ds.Item[] itemArray13 = new ds.Item[] { item12 };
        fPHeapMin11.copia(itemArray13);
        fPHeapMin7.copia(itemArray13);
        fPHeapMin1.copia(itemArray13);
        ds.FPHeapMin fPHeapMin18 = new ds.FPHeapMin(100);
        ds.Item item19 = null;
        ds.Item[] itemArray20 = new ds.Item[] { item19 };
        fPHeapMin18.copia(itemArray20);
        fPHeapMin1.copia(itemArray20);
        ds.Item item23 = fPHeapMin1.min();
        ds.Item item24 = fPHeapMin1.min();
        fPHeapMin1.constroi();
        ds.FPHeapMin fPHeapMin27 = new ds.FPHeapMin((int) (short) -1);
        ds.FPHeapMin fPHeapMin29 = new ds.FPHeapMin(100);
        ds.Item item30 = null;
        ds.Item[] itemArray31 = new ds.Item[] { item30 };
        fPHeapMin29.copia(itemArray31);
        fPHeapMin29.imprime();
        fPHeapMin29.constroi();
        fPHeapMin29.constroi();
        ds.FPHeapMin fPHeapMin37 = new ds.FPHeapMin(100);
        ds.Item[] itemArray38 = new ds.Item[] {};
        fPHeapMin37.copia(itemArray38);
        ds.FPHeapMin fPHeapMin41 = new ds.FPHeapMin(100);
        ds.Item item42 = null;
        ds.Item[] itemArray43 = new ds.Item[] { item42 };
        fPHeapMin41.copia(itemArray43);
        fPHeapMin37.copia(itemArray43);
        ds.FPHeapMin fPHeapMin47 = new ds.FPHeapMin(100);
        ds.Item item48 = null;
        ds.Item[] itemArray49 = new ds.Item[] { item48 };
        fPHeapMin47.copia(itemArray49);
        ds.FPHeapMin fPHeapMin51 = new ds.FPHeapMin(itemArray49);
        fPHeapMin37.copia(itemArray49);
        fPHeapMin29.copia(itemArray49);
        fPHeapMin27.copia(itemArray49);
        fPHeapMin1.copia(itemArray49);
        ds.Item item56 = null;
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMin1.insere(item56);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertNotNull(itemArray8);
        org.junit.Assert.assertNotNull(itemArray13);
        org.junit.Assert.assertNotNull(itemArray20);
        org.junit.Assert.assertNull(item23);
        org.junit.Assert.assertNull(item24);
        org.junit.Assert.assertNotNull(itemArray31);
        org.junit.Assert.assertNotNull(itemArray38);
        org.junit.Assert.assertNotNull(itemArray43);
        org.junit.Assert.assertNotNull(itemArray49);
    }

    @Test
    public void test252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test252");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin(100);
        ds.Item[] itemArray2 = new ds.Item[] {};
        fPHeapMin1.copia(itemArray2);
        ds.FPHeapMin fPHeapMin5 = new ds.FPHeapMin(100);
        ds.Item item6 = null;
        ds.Item[] itemArray7 = new ds.Item[] { item6 };
        fPHeapMin5.copia(itemArray7);
        fPHeapMin1.copia(itemArray7);
        ds.FPHeapMin fPHeapMin11 = new ds.FPHeapMin(100);
        ds.Item item12 = null;
        ds.Item[] itemArray13 = new ds.Item[] { item12 };
        fPHeapMin11.copia(itemArray13);
        ds.FPHeapMin fPHeapMin15 = new ds.FPHeapMin(itemArray13);
        fPHeapMin1.copia(itemArray13);
        ds.FPHeapMin fPHeapMin17 = new ds.FPHeapMin(itemArray13);
        ds.FPHeapMin fPHeapMin19 = new ds.FPHeapMin(100);
        ds.Item[] itemArray20 = new ds.Item[] {};
        fPHeapMin19.copia(itemArray20);
        ds.FPHeapMin fPHeapMin23 = new ds.FPHeapMin(100);
        ds.Item item24 = null;
        ds.Item[] itemArray25 = new ds.Item[] { item24 };
        fPHeapMin23.copia(itemArray25);
        fPHeapMin19.copia(itemArray25);
        ds.FPHeapMin fPHeapMin29 = new ds.FPHeapMin(100);
        ds.Item item30 = null;
        ds.Item[] itemArray31 = new ds.Item[] { item30 };
        fPHeapMin29.copia(itemArray31);
        ds.FPHeapMin fPHeapMin33 = new ds.FPHeapMin(itemArray31);
        fPHeapMin19.copia(itemArray31);
        fPHeapMin19.imprime();
        ds.FPHeapMin fPHeapMin37 = new ds.FPHeapMin(100);
        fPHeapMin37.imprime();
        ds.FPHeapMin fPHeapMin40 = new ds.FPHeapMin(100);
        ds.Item[] itemArray41 = new ds.Item[] {};
        fPHeapMin40.copia(itemArray41);
        ds.FPHeapMin fPHeapMin44 = new ds.FPHeapMin(100);
        ds.Item item45 = null;
        ds.Item[] itemArray46 = new ds.Item[] { item45 };
        fPHeapMin44.copia(itemArray46);
        fPHeapMin40.copia(itemArray46);
        fPHeapMin37.copia(itemArray46);
        ds.FPHeapMin fPHeapMin50 = new ds.FPHeapMin(itemArray46);
        ds.FPHeapMin fPHeapMin51 = new ds.FPHeapMin(itemArray46);
        fPHeapMin19.copia(itemArray46);
        fPHeapMin17.copia(itemArray46);
        ds.Item item54 = null;
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMin17.insere(item54);
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: heap cheio");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray2);
        org.junit.Assert.assertNotNull(itemArray7);
        org.junit.Assert.assertNotNull(itemArray13);
        org.junit.Assert.assertNotNull(itemArray20);
        org.junit.Assert.assertNotNull(itemArray25);
        org.junit.Assert.assertNotNull(itemArray31);
        org.junit.Assert.assertNotNull(itemArray41);
        org.junit.Assert.assertNotNull(itemArray46);
    }

    @Test
    public void test253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test253");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin(100);
        ds.Item item2 = null;
        ds.Item[] itemArray3 = new ds.Item[] { item2 };
        fPHeapMin1.copia(itemArray3);
        fPHeapMin1.imprime();
        ds.FPHeapMin fPHeapMin7 = new ds.FPHeapMin(100);
        ds.Item[] itemArray8 = new ds.Item[] {};
        fPHeapMin7.copia(itemArray8);
        ds.FPHeapMin fPHeapMin11 = new ds.FPHeapMin(100);
        ds.Item item12 = null;
        ds.Item[] itemArray13 = new ds.Item[] { item12 };
        fPHeapMin11.copia(itemArray13);
        fPHeapMin7.copia(itemArray13);
        fPHeapMin1.copia(itemArray13);
        fPHeapMin1.imprime();
        ds.Item item18 = fPHeapMin1.min();
        ds.FPHeapMin fPHeapMin21 = new ds.FPHeapMin(100);
        fPHeapMin21.imprime();
        ds.FPHeapMin fPHeapMin24 = new ds.FPHeapMin(100);
        ds.Item[] itemArray25 = new ds.Item[] {};
        fPHeapMin24.copia(itemArray25);
        ds.FPHeapMin fPHeapMin28 = new ds.FPHeapMin(100);
        ds.Item item29 = null;
        ds.Item[] itemArray30 = new ds.Item[] { item29 };
        fPHeapMin28.copia(itemArray30);
        fPHeapMin24.copia(itemArray30);
        fPHeapMin21.copia(itemArray30);
        ds.FPHeapMin fPHeapMin34 = new ds.FPHeapMin(itemArray30);
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMin1.diminuiChave(10, (java.lang.Object) fPHeapMin34);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertNotNull(itemArray8);
        org.junit.Assert.assertNotNull(itemArray13);
        org.junit.Assert.assertNull(item18);
        org.junit.Assert.assertNotNull(itemArray25);
        org.junit.Assert.assertNotNull(itemArray30);
    }

    @Test
    public void test254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test254");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin(100);
        ds.Item[] itemArray2 = new ds.Item[] {};
        fPHeapMin1.copia(itemArray2);
        ds.Item item4 = fPHeapMin1.min();
        ds.FPHeapMin fPHeapMin6 = new ds.FPHeapMin(100);
        fPHeapMin6.constroi();
        fPHeapMin6.refaz(100, (int) (byte) 100);
        ds.Item[] itemArray11 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin12 = new ds.FPHeapMin(itemArray11);
        ds.FPHeapMin fPHeapMin14 = new ds.FPHeapMin(100);
        ds.Item item15 = null;
        ds.Item[] itemArray16 = new ds.Item[] { item15 };
        fPHeapMin14.copia(itemArray16);
        ds.FPHeapMin fPHeapMin19 = new ds.FPHeapMin(100);
        ds.Item item20 = null;
        ds.Item[] itemArray21 = new ds.Item[] { item20 };
        fPHeapMin19.copia(itemArray21);
        fPHeapMin19.imprime();
        ds.FPHeapMin fPHeapMin25 = new ds.FPHeapMin(100);
        ds.Item[] itemArray26 = new ds.Item[] {};
        fPHeapMin25.copia(itemArray26);
        ds.FPHeapMin fPHeapMin29 = new ds.FPHeapMin(100);
        ds.Item item30 = null;
        ds.Item[] itemArray31 = new ds.Item[] { item30 };
        fPHeapMin29.copia(itemArray31);
        fPHeapMin25.copia(itemArray31);
        fPHeapMin19.copia(itemArray31);
        ds.FPHeapMin fPHeapMin36 = new ds.FPHeapMin(100);
        ds.Item item37 = null;
        ds.Item[] itemArray38 = new ds.Item[] { item37 };
        fPHeapMin36.copia(itemArray38);
        fPHeapMin19.copia(itemArray38);
        fPHeapMin14.copia(itemArray38);
        ds.FPHeapMin fPHeapMin42 = new ds.FPHeapMin(itemArray38);
        fPHeapMin12.copia(itemArray38);
        ds.FPHeapMin fPHeapMin44 = new ds.FPHeapMin(itemArray38);
        fPHeapMin6.copia(itemArray38);
        ds.Item item46 = fPHeapMin6.min();
        ds.FPHeapMin fPHeapMin48 = new ds.FPHeapMin(100);
        ds.Item item49 = null;
        ds.Item[] itemArray50 = new ds.Item[] { item49 };
        fPHeapMin48.copia(itemArray50);
        fPHeapMin48.imprime();
        fPHeapMin48.imprime();
        ds.FPHeapMin fPHeapMin55 = new ds.FPHeapMin(100);
        ds.Item item56 = null;
        ds.Item[] itemArray57 = new ds.Item[] { item56 };
        fPHeapMin55.copia(itemArray57);
        ds.FPHeapMin fPHeapMin60 = new ds.FPHeapMin(100);
        ds.Item item61 = null;
        ds.Item[] itemArray62 = new ds.Item[] { item61 };
        fPHeapMin60.copia(itemArray62);
        fPHeapMin60.imprime();
        ds.FPHeapMin fPHeapMin66 = new ds.FPHeapMin(100);
        ds.Item[] itemArray67 = new ds.Item[] {};
        fPHeapMin66.copia(itemArray67);
        ds.FPHeapMin fPHeapMin70 = new ds.FPHeapMin(100);
        ds.Item item71 = null;
        ds.Item[] itemArray72 = new ds.Item[] { item71 };
        fPHeapMin70.copia(itemArray72);
        fPHeapMin66.copia(itemArray72);
        fPHeapMin60.copia(itemArray72);
        ds.FPHeapMin fPHeapMin77 = new ds.FPHeapMin(100);
        ds.Item item78 = null;
        ds.Item[] itemArray79 = new ds.Item[] { item78 };
        fPHeapMin77.copia(itemArray79);
        fPHeapMin60.copia(itemArray79);
        fPHeapMin55.copia(itemArray79);
        fPHeapMin48.copia(itemArray79);
        ds.FPHeapMin fPHeapMin84 = new ds.FPHeapMin(itemArray79);
        fPHeapMin6.copia(itemArray79);
        fPHeapMin1.copia(itemArray79);
        // The following exception was thrown during execution in test generation
        try {
            ds.Item item87 = fPHeapMin1.retiraMin();
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: heap vazio");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray2);
        org.junit.Assert.assertNull(item4);
        org.junit.Assert.assertNotNull(itemArray11);
        org.junit.Assert.assertNotNull(itemArray16);
        org.junit.Assert.assertNotNull(itemArray21);
        org.junit.Assert.assertNotNull(itemArray26);
        org.junit.Assert.assertNotNull(itemArray31);
        org.junit.Assert.assertNotNull(itemArray38);
        org.junit.Assert.assertNull(item46);
        org.junit.Assert.assertNotNull(itemArray50);
        org.junit.Assert.assertNotNull(itemArray57);
        org.junit.Assert.assertNotNull(itemArray62);
        org.junit.Assert.assertNotNull(itemArray67);
        org.junit.Assert.assertNotNull(itemArray72);
        org.junit.Assert.assertNotNull(itemArray79);
    }

    @Test
    public void test255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test255");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin(100);
        ds.Item[] itemArray2 = new ds.Item[] {};
        fPHeapMin1.copia(itemArray2);
        ds.FPHeapMin fPHeapMin4 = new ds.FPHeapMin(itemArray2);
        ds.FPHeapMin fPHeapMin5 = new ds.FPHeapMin(itemArray2);
        ds.FPHeapMin fPHeapMin7 = new ds.FPHeapMin(100);
        ds.Item item8 = null;
        ds.Item[] itemArray9 = new ds.Item[] { item8 };
        fPHeapMin7.copia(itemArray9);
        ds.FPHeapMin fPHeapMin11 = new ds.FPHeapMin(itemArray9);
        ds.FPHeapMin fPHeapMin13 = new ds.FPHeapMin(100);
        ds.Item item14 = null;
        ds.Item[] itemArray15 = new ds.Item[] { item14 };
        fPHeapMin13.copia(itemArray15);
        fPHeapMin13.imprime();
        fPHeapMin13.constroi();
        ds.FPHeapMin fPHeapMin20 = new ds.FPHeapMin(100);
        ds.Item item21 = null;
        ds.Item[] itemArray22 = new ds.Item[] { item21 };
        fPHeapMin20.copia(itemArray22);
        ds.FPHeapMin fPHeapMin25 = new ds.FPHeapMin(100);
        ds.Item item26 = null;
        ds.Item[] itemArray27 = new ds.Item[] { item26 };
        fPHeapMin25.copia(itemArray27);
        fPHeapMin25.imprime();
        ds.FPHeapMin fPHeapMin31 = new ds.FPHeapMin(100);
        ds.Item[] itemArray32 = new ds.Item[] {};
        fPHeapMin31.copia(itemArray32);
        ds.FPHeapMin fPHeapMin35 = new ds.FPHeapMin(100);
        ds.Item item36 = null;
        ds.Item[] itemArray37 = new ds.Item[] { item36 };
        fPHeapMin35.copia(itemArray37);
        fPHeapMin31.copia(itemArray37);
        fPHeapMin25.copia(itemArray37);
        ds.FPHeapMin fPHeapMin42 = new ds.FPHeapMin(100);
        ds.Item item43 = null;
        ds.Item[] itemArray44 = new ds.Item[] { item43 };
        fPHeapMin42.copia(itemArray44);
        fPHeapMin25.copia(itemArray44);
        fPHeapMin20.copia(itemArray44);
        fPHeapMin13.copia(itemArray44);
        fPHeapMin11.copia(itemArray44);
        ds.FPHeapMin fPHeapMin51 = new ds.FPHeapMin(100);
        fPHeapMin51.imprime();
        ds.FPHeapMin fPHeapMin54 = new ds.FPHeapMin(100);
        ds.Item[] itemArray55 = new ds.Item[] {};
        fPHeapMin54.copia(itemArray55);
        ds.FPHeapMin fPHeapMin58 = new ds.FPHeapMin(100);
        ds.Item item59 = null;
        ds.Item[] itemArray60 = new ds.Item[] { item59 };
        fPHeapMin58.copia(itemArray60);
        fPHeapMin54.copia(itemArray60);
        fPHeapMin51.copia(itemArray60);
        ds.FPHeapMin fPHeapMin64 = new ds.FPHeapMin(itemArray60);
        fPHeapMin11.copia(itemArray60);
        ds.FPHeapMin fPHeapMin66 = new ds.FPHeapMin(itemArray60);
        fPHeapMin5.copia(itemArray60);
        // The following exception was thrown during execution in test generation
        try {
            ds.Item item68 = fPHeapMin5.min();
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray2);
        org.junit.Assert.assertNotNull(itemArray9);
        org.junit.Assert.assertNotNull(itemArray15);
        org.junit.Assert.assertNotNull(itemArray22);
        org.junit.Assert.assertNotNull(itemArray27);
        org.junit.Assert.assertNotNull(itemArray32);
        org.junit.Assert.assertNotNull(itemArray37);
        org.junit.Assert.assertNotNull(itemArray44);
        org.junit.Assert.assertNotNull(itemArray55);
        org.junit.Assert.assertNotNull(itemArray60);
    }

    @Test
    public void test256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test256");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin(100);
        ds.Item item2 = fPHeapMin1.min();
        fPHeapMin1.imprime();
        fPHeapMin1.refaz(0, (int) (byte) -1);
        org.junit.Assert.assertNull(item2);
    }

    @Test
    public void test257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test257");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin(100);
        ds.Item[] itemArray2 = new ds.Item[] {};
        fPHeapMin1.copia(itemArray2);
        ds.Item item4 = fPHeapMin1.min();
        ds.FPHeapMin fPHeapMin6 = new ds.FPHeapMin(100);
        fPHeapMin6.constroi();
        fPHeapMin6.refaz(100, (int) (byte) 100);
        ds.Item[] itemArray11 = new ds.Item[] {};
        ds.FPHeapMin fPHeapMin12 = new ds.FPHeapMin(itemArray11);
        ds.FPHeapMin fPHeapMin14 = new ds.FPHeapMin(100);
        ds.Item item15 = null;
        ds.Item[] itemArray16 = new ds.Item[] { item15 };
        fPHeapMin14.copia(itemArray16);
        ds.FPHeapMin fPHeapMin19 = new ds.FPHeapMin(100);
        ds.Item item20 = null;
        ds.Item[] itemArray21 = new ds.Item[] { item20 };
        fPHeapMin19.copia(itemArray21);
        fPHeapMin19.imprime();
        ds.FPHeapMin fPHeapMin25 = new ds.FPHeapMin(100);
        ds.Item[] itemArray26 = new ds.Item[] {};
        fPHeapMin25.copia(itemArray26);
        ds.FPHeapMin fPHeapMin29 = new ds.FPHeapMin(100);
        ds.Item item30 = null;
        ds.Item[] itemArray31 = new ds.Item[] { item30 };
        fPHeapMin29.copia(itemArray31);
        fPHeapMin25.copia(itemArray31);
        fPHeapMin19.copia(itemArray31);
        ds.FPHeapMin fPHeapMin36 = new ds.FPHeapMin(100);
        ds.Item item37 = null;
        ds.Item[] itemArray38 = new ds.Item[] { item37 };
        fPHeapMin36.copia(itemArray38);
        fPHeapMin19.copia(itemArray38);
        fPHeapMin14.copia(itemArray38);
        ds.FPHeapMin fPHeapMin42 = new ds.FPHeapMin(itemArray38);
        fPHeapMin12.copia(itemArray38);
        ds.FPHeapMin fPHeapMin44 = new ds.FPHeapMin(itemArray38);
        fPHeapMin6.copia(itemArray38);
        ds.Item item46 = fPHeapMin6.min();
        ds.FPHeapMin fPHeapMin48 = new ds.FPHeapMin(100);
        ds.Item item49 = null;
        ds.Item[] itemArray50 = new ds.Item[] { item49 };
        fPHeapMin48.copia(itemArray50);
        fPHeapMin48.imprime();
        fPHeapMin48.imprime();
        ds.FPHeapMin fPHeapMin55 = new ds.FPHeapMin(100);
        ds.Item item56 = null;
        ds.Item[] itemArray57 = new ds.Item[] { item56 };
        fPHeapMin55.copia(itemArray57);
        ds.FPHeapMin fPHeapMin60 = new ds.FPHeapMin(100);
        ds.Item item61 = null;
        ds.Item[] itemArray62 = new ds.Item[] { item61 };
        fPHeapMin60.copia(itemArray62);
        fPHeapMin60.imprime();
        ds.FPHeapMin fPHeapMin66 = new ds.FPHeapMin(100);
        ds.Item[] itemArray67 = new ds.Item[] {};
        fPHeapMin66.copia(itemArray67);
        ds.FPHeapMin fPHeapMin70 = new ds.FPHeapMin(100);
        ds.Item item71 = null;
        ds.Item[] itemArray72 = new ds.Item[] { item71 };
        fPHeapMin70.copia(itemArray72);
        fPHeapMin66.copia(itemArray72);
        fPHeapMin60.copia(itemArray72);
        ds.FPHeapMin fPHeapMin77 = new ds.FPHeapMin(100);
        ds.Item item78 = null;
        ds.Item[] itemArray79 = new ds.Item[] { item78 };
        fPHeapMin77.copia(itemArray79);
        fPHeapMin60.copia(itemArray79);
        fPHeapMin55.copia(itemArray79);
        fPHeapMin48.copia(itemArray79);
        ds.FPHeapMin fPHeapMin84 = new ds.FPHeapMin(itemArray79);
        fPHeapMin6.copia(itemArray79);
        fPHeapMin1.copia(itemArray79);
        ds.FPHeapMin fPHeapMin87 = new ds.FPHeapMin(itemArray79);
        org.junit.Assert.assertNotNull(itemArray2);
        org.junit.Assert.assertNull(item4);
        org.junit.Assert.assertNotNull(itemArray11);
        org.junit.Assert.assertNotNull(itemArray16);
        org.junit.Assert.assertNotNull(itemArray21);
        org.junit.Assert.assertNotNull(itemArray26);
        org.junit.Assert.assertNotNull(itemArray31);
        org.junit.Assert.assertNotNull(itemArray38);
        org.junit.Assert.assertNull(item46);
        org.junit.Assert.assertNotNull(itemArray50);
        org.junit.Assert.assertNotNull(itemArray57);
        org.junit.Assert.assertNotNull(itemArray62);
        org.junit.Assert.assertNotNull(itemArray67);
        org.junit.Assert.assertNotNull(itemArray72);
        org.junit.Assert.assertNotNull(itemArray79);
    }

    @Test
    public void test258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test258");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin(100);
        ds.Item[] itemArray2 = new ds.Item[] {};
        fPHeapMin1.copia(itemArray2);
        ds.FPHeapMin fPHeapMin5 = new ds.FPHeapMin(100);
        ds.Item item6 = null;
        ds.Item[] itemArray7 = new ds.Item[] { item6 };
        fPHeapMin5.copia(itemArray7);
        fPHeapMin1.copia(itemArray7);
        fPHeapMin1.imprime();
        ds.Item item11 = fPHeapMin1.min();
        ds.Item item12 = fPHeapMin1.min();
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMin1.refaz((int) (short) -1, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray2);
        org.junit.Assert.assertNotNull(itemArray7);
        org.junit.Assert.assertNull(item11);
        org.junit.Assert.assertNull(item12);
    }

    @Test
    public void test259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test259");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin(100);
        ds.Item[] itemArray2 = new ds.Item[] {};
        fPHeapMin1.copia(itemArray2);
        ds.FPHeapMin fPHeapMin5 = new ds.FPHeapMin(100);
        ds.Item item6 = null;
        ds.Item[] itemArray7 = new ds.Item[] { item6 };
        fPHeapMin5.copia(itemArray7);
        fPHeapMin1.copia(itemArray7);
        ds.FPHeapMin fPHeapMin11 = new ds.FPHeapMin(100);
        ds.Item item12 = null;
        ds.Item[] itemArray13 = new ds.Item[] { item12 };
        fPHeapMin11.copia(itemArray13);
        ds.FPHeapMin fPHeapMin15 = new ds.FPHeapMin(itemArray13);
        fPHeapMin1.copia(itemArray13);
        fPHeapMin1.imprime();
        ds.Item item18 = null;
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMin1.insere(item18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray2);
        org.junit.Assert.assertNotNull(itemArray7);
        org.junit.Assert.assertNotNull(itemArray13);
    }

    @Test
    public void test260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test260");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin(100);
        ds.Item item2 = null;
        ds.Item[] itemArray3 = new ds.Item[] { item2 };
        fPHeapMin1.copia(itemArray3);
        fPHeapMin1.imprime();
        ds.FPHeapMin fPHeapMin7 = new ds.FPHeapMin(100);
        ds.Item[] itemArray8 = new ds.Item[] {};
        fPHeapMin7.copia(itemArray8);
        ds.FPHeapMin fPHeapMin11 = new ds.FPHeapMin(100);
        ds.Item item12 = null;
        ds.Item[] itemArray13 = new ds.Item[] { item12 };
        fPHeapMin11.copia(itemArray13);
        fPHeapMin7.copia(itemArray13);
        fPHeapMin1.copia(itemArray13);
        ds.FPHeapMin fPHeapMin18 = new ds.FPHeapMin(100);
        fPHeapMin18.imprime();
        ds.FPHeapMin fPHeapMin21 = new ds.FPHeapMin(100);
        ds.Item[] itemArray22 = new ds.Item[] {};
        fPHeapMin21.copia(itemArray22);
        ds.FPHeapMin fPHeapMin25 = new ds.FPHeapMin(100);
        ds.Item item26 = null;
        ds.Item[] itemArray27 = new ds.Item[] { item26 };
        fPHeapMin25.copia(itemArray27);
        fPHeapMin21.copia(itemArray27);
        fPHeapMin18.copia(itemArray27);
        fPHeapMin1.copia(itemArray27);
        ds.FPHeapMin fPHeapMin32 = new ds.FPHeapMin(itemArray27);
        ds.Item item33 = null;
        ds.Item[] itemArray34 = new ds.Item[] { item33 };
        fPHeapMin32.copia(itemArray34);
        ds.FPHeapMin fPHeapMin37 = new ds.FPHeapMin(100);
        fPHeapMin37.imprime();
        ds.FPHeapMin fPHeapMin40 = new ds.FPHeapMin(100);
        ds.Item[] itemArray41 = new ds.Item[] {};
        fPHeapMin40.copia(itemArray41);
        ds.FPHeapMin fPHeapMin44 = new ds.FPHeapMin(100);
        ds.Item item45 = null;
        ds.Item[] itemArray46 = new ds.Item[] { item45 };
        fPHeapMin44.copia(itemArray46);
        fPHeapMin40.copia(itemArray46);
        fPHeapMin37.copia(itemArray46);
        ds.FPHeapMin fPHeapMin50 = new ds.FPHeapMin(itemArray46);
        ds.FPHeapMin fPHeapMin51 = new ds.FPHeapMin(itemArray46);
        fPHeapMin32.copia(itemArray46);
        fPHeapMin32.constroi();
        ds.FPHeapMin fPHeapMin55 = new ds.FPHeapMin(100);
        ds.Item item56 = null;
        ds.Item[] itemArray57 = new ds.Item[] { item56 };
        fPHeapMin55.copia(itemArray57);
        fPHeapMin55.imprime();
        ds.FPHeapMin fPHeapMin61 = new ds.FPHeapMin(100);
        ds.Item[] itemArray62 = new ds.Item[] {};
        fPHeapMin61.copia(itemArray62);
        ds.FPHeapMin fPHeapMin65 = new ds.FPHeapMin(100);
        ds.Item item66 = null;
        ds.Item[] itemArray67 = new ds.Item[] { item66 };
        fPHeapMin65.copia(itemArray67);
        fPHeapMin61.copia(itemArray67);
        fPHeapMin55.copia(itemArray67);
        fPHeapMin32.copia(itemArray67);
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertNotNull(itemArray8);
        org.junit.Assert.assertNotNull(itemArray13);
        org.junit.Assert.assertNotNull(itemArray22);
        org.junit.Assert.assertNotNull(itemArray27);
        org.junit.Assert.assertNotNull(itemArray34);
        org.junit.Assert.assertNotNull(itemArray41);
        org.junit.Assert.assertNotNull(itemArray46);
        org.junit.Assert.assertNotNull(itemArray57);
        org.junit.Assert.assertNotNull(itemArray62);
        org.junit.Assert.assertNotNull(itemArray67);
    }

    @Test
    public void test261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test261");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin(100);
        fPHeapMin1.imprime();
        ds.FPHeapMin fPHeapMin4 = new ds.FPHeapMin(100);
        ds.Item[] itemArray5 = new ds.Item[] {};
        fPHeapMin4.copia(itemArray5);
        ds.FPHeapMin fPHeapMin8 = new ds.FPHeapMin(100);
        ds.Item item9 = null;
        ds.Item[] itemArray10 = new ds.Item[] { item9 };
        fPHeapMin8.copia(itemArray10);
        fPHeapMin4.copia(itemArray10);
        fPHeapMin1.copia(itemArray10);
        ds.FPHeapMin fPHeapMin14 = new ds.FPHeapMin(itemArray10);
        ds.FPHeapMin fPHeapMin17 = new ds.FPHeapMin(100);
        ds.Item[] itemArray18 = new ds.Item[] {};
        fPHeapMin17.copia(itemArray18);
        ds.FPHeapMin fPHeapMin21 = new ds.FPHeapMin(100);
        ds.Item item22 = null;
        ds.Item[] itemArray23 = new ds.Item[] { item22 };
        fPHeapMin21.copia(itemArray23);
        fPHeapMin17.copia(itemArray23);
        fPHeapMin17.imprime();
        fPHeapMin17.constroi();
        ds.Item item28 = fPHeapMin17.min();
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMin14.diminuiChave(100, (java.lang.Object) fPHeapMin17);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 100");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray5);
        org.junit.Assert.assertNotNull(itemArray10);
        org.junit.Assert.assertNotNull(itemArray18);
        org.junit.Assert.assertNotNull(itemArray23);
        org.junit.Assert.assertNull(item28);
    }

    @Test
    public void test262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test262");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin(100);
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
    public void test263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test263");
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
    public void test264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test264");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin(100);
        ds.Item item2 = null;
        ds.Item[] itemArray3 = new ds.Item[] { item2 };
        fPHeapMin1.copia(itemArray3);
        fPHeapMin1.imprime();
        fPHeapMin1.imprime();
        fPHeapMin1.imprime();
        ds.FPHeapMin fPHeapMin9 = new ds.FPHeapMin(100);
        ds.Item[] itemArray10 = new ds.Item[] {};
        fPHeapMin9.copia(itemArray10);
        fPHeapMin1.copia(itemArray10);
        ds.FPHeapMin fPHeapMin13 = new ds.FPHeapMin(itemArray10);
        fPHeapMin13.constroi();
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertNotNull(itemArray10);
    }

    @Test
    public void test265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test265");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin(100);
        ds.Item item2 = null;
        ds.Item[] itemArray3 = new ds.Item[] { item2 };
        fPHeapMin1.copia(itemArray3);
        fPHeapMin1.imprime();
        fPHeapMin1.constroi();
        fPHeapMin1.constroi();
        ds.Item item8 = fPHeapMin1.min();
        fPHeapMin1.constroi();
        ds.FPHeapMin fPHeapMin12 = new ds.FPHeapMin((int) (byte) 1);
        ds.FPHeapMin fPHeapMin14 = new ds.FPHeapMin(100);
        ds.Item[] itemArray15 = new ds.Item[] {};
        fPHeapMin14.copia(itemArray15);
        ds.FPHeapMin fPHeapMin17 = new ds.FPHeapMin(itemArray15);
        ds.FPHeapMin fPHeapMin19 = new ds.FPHeapMin(100);
        ds.Item item20 = null;
        ds.Item[] itemArray21 = new ds.Item[] { item20 };
        fPHeapMin19.copia(itemArray21);
        fPHeapMin19.imprime();
        ds.FPHeapMin fPHeapMin25 = new ds.FPHeapMin(100);
        ds.Item[] itemArray26 = new ds.Item[] {};
        fPHeapMin25.copia(itemArray26);
        ds.FPHeapMin fPHeapMin29 = new ds.FPHeapMin(100);
        ds.Item item30 = null;
        ds.Item[] itemArray31 = new ds.Item[] { item30 };
        fPHeapMin29.copia(itemArray31);
        fPHeapMin25.copia(itemArray31);
        fPHeapMin19.copia(itemArray31);
        ds.FPHeapMin fPHeapMin36 = new ds.FPHeapMin(100);
        ds.Item item37 = null;
        ds.Item[] itemArray38 = new ds.Item[] { item37 };
        fPHeapMin36.copia(itemArray38);
        fPHeapMin19.copia(itemArray38);
        fPHeapMin17.copia(itemArray38);
        fPHeapMin12.copia(itemArray38);
        ds.Item item43 = fPHeapMin12.min();
        // The following exception was thrown during execution in test generation
        try {
            fPHeapMin1.diminuiChave((int) (byte) 1, (java.lang.Object) item43);
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: chaveNova com valor null");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray3);
        org.junit.Assert.assertNull(item8);
        org.junit.Assert.assertNotNull(itemArray15);
        org.junit.Assert.assertNotNull(itemArray21);
        org.junit.Assert.assertNotNull(itemArray26);
        org.junit.Assert.assertNotNull(itemArray31);
        org.junit.Assert.assertNotNull(itemArray38);
        org.junit.Assert.assertNull(item43);
    }

    @Test
    public void test266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test266");
        ds.FPHeapMin fPHeapMin1 = new ds.FPHeapMin((-1));
        ds.FPHeapMin fPHeapMin3 = new ds.FPHeapMin(100);
        ds.Item item4 = null;
        ds.Item[] itemArray5 = new ds.Item[] { item4 };
        fPHeapMin3.copia(itemArray5);
        ds.FPHeapMin fPHeapMin8 = new ds.FPHeapMin(100);
        ds.Item item9 = null;
        ds.Item[] itemArray10 = new ds.Item[] { item9 };
        fPHeapMin8.copia(itemArray10);
        fPHeapMin8.imprime();
        ds.FPHeapMin fPHeapMin14 = new ds.FPHeapMin(100);
        ds.Item[] itemArray15 = new ds.Item[] {};
        fPHeapMin14.copia(itemArray15);
        ds.FPHeapMin fPHeapMin18 = new ds.FPHeapMin(100);
        ds.Item item19 = null;
        ds.Item[] itemArray20 = new ds.Item[] { item19 };
        fPHeapMin18.copia(itemArray20);
        fPHeapMin14.copia(itemArray20);
        fPHeapMin8.copia(itemArray20);
        ds.FPHeapMin fPHeapMin25 = new ds.FPHeapMin(100);
        ds.Item item26 = null;
        ds.Item[] itemArray27 = new ds.Item[] { item26 };
        fPHeapMin25.copia(itemArray27);
        fPHeapMin8.copia(itemArray27);
        fPHeapMin3.copia(itemArray27);
        ds.FPHeapMin fPHeapMin31 = new ds.FPHeapMin(itemArray27);
        ds.FPHeapMin fPHeapMin33 = new ds.FPHeapMin(100);
        ds.Item item34 = null;
        ds.Item[] itemArray35 = new ds.Item[] { item34 };
        fPHeapMin33.copia(itemArray35);
        ds.FPHeapMin fPHeapMin38 = new ds.FPHeapMin(100);
        ds.Item item39 = null;
        ds.Item[] itemArray40 = new ds.Item[] { item39 };
        fPHeapMin38.copia(itemArray40);
        fPHeapMin38.imprime();
        ds.FPHeapMin fPHeapMin44 = new ds.FPHeapMin(100);
        ds.Item[] itemArray45 = new ds.Item[] {};
        fPHeapMin44.copia(itemArray45);
        ds.FPHeapMin fPHeapMin48 = new ds.FPHeapMin(100);
        ds.Item item49 = null;
        ds.Item[] itemArray50 = new ds.Item[] { item49 };
        fPHeapMin48.copia(itemArray50);
        fPHeapMin44.copia(itemArray50);
        fPHeapMin38.copia(itemArray50);
        ds.FPHeapMin fPHeapMin55 = new ds.FPHeapMin(100);
        ds.Item item56 = null;
        ds.Item[] itemArray57 = new ds.Item[] { item56 };
        fPHeapMin55.copia(itemArray57);
        fPHeapMin38.copia(itemArray57);
        fPHeapMin33.copia(itemArray57);
        fPHeapMin31.copia(itemArray57);
        ds.FPHeapMin fPHeapMin62 = new ds.FPHeapMin(itemArray57);
        fPHeapMin1.copia(itemArray57);
        org.junit.Assert.assertNotNull(itemArray5);
        org.junit.Assert.assertNotNull(itemArray10);
        org.junit.Assert.assertNotNull(itemArray15);
        org.junit.Assert.assertNotNull(itemArray20);
        org.junit.Assert.assertNotNull(itemArray27);
        org.junit.Assert.assertNotNull(itemArray35);
        org.junit.Assert.assertNotNull(itemArray40);
        org.junit.Assert.assertNotNull(itemArray45);
        org.junit.Assert.assertNotNull(itemArray50);
        org.junit.Assert.assertNotNull(itemArray57);
    }
}

