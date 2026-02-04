package ds.seed1448;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class Randoop5 {

    public static boolean debug = false;

    @Test
    public void test2501() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop5.test2501");
        ds.Item[] itemArray0 = new ds.Item[] {};
        ds.Ordenacao.selecao(itemArray0, (-1));
        ds.Ordenacao.shellsort(itemArray0, (int) (byte) 1);
        ds.Ordenacao.shellsort(itemArray0, 0);
        ds.Ordenacao.shellsort(itemArray0, 1);
        ds.Ordenacao.shellsort(itemArray0, (int) (byte) -1);
        ds.Ordenacao.selecao(itemArray0, (int) (byte) 0);
        ds.Ordenacao.shellsort(itemArray0, (int) (byte) -1);
        ds.Ordenacao.selecao(itemArray0, (int) (byte) -1);
        ds.Ordenacao.insercao(itemArray0, (int) (short) 0);
        ds.Ordenacao.shellsort(itemArray0, (int) (byte) -1);
        ds.Ordenacao.insercao(itemArray0, (int) (short) -1);
        ds.Ordenacao.shellsort(itemArray0, (-1));
        org.junit.Assert.assertNotNull(itemArray0);
    }

    @Test
    public void test2502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop5.test2502");
        ds.Item item0 = null;
        ds.Item[] itemArray1 = new ds.Item[] { item0 };
        ds.Ordenacao.shellsort(itemArray1, 1);
        ds.Ordenacao.selecao(itemArray1, (int) (short) -1);
        ds.Ordenacao.shellsort(itemArray1, 0);
        ds.Ordenacao.shellsort(itemArray1, (int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            ds.Ordenacao.shellsort(itemArray1, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray1);
    }

    @Test
    public void test2503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop5.test2503");
        ds.Item[] itemArray0 = new ds.Item[] {};
        ds.Ordenacao.selecao(itemArray0, (-1));
        ds.Ordenacao.shellsort(itemArray0, (int) (byte) -1);
        ds.Ordenacao.insercao(itemArray0, 0);
        ds.Ordenacao.heapsort(itemArray0, (-1));
        ds.Ordenacao.insercao(itemArray0, 1);
        ds.Ordenacao.heapsort(itemArray0, (int) (byte) 1);
        ds.Ordenacao.shellsort(itemArray0, (int) (byte) 0);
        ds.Ordenacao.selecao(itemArray0, 0);
        org.junit.Assert.assertNotNull(itemArray0);
    }

    @Test
    public void test2504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop5.test2504");
        ds.Item[] itemArray0 = new ds.Item[] {};
        ds.Ordenacao.selecao(itemArray0, (-1));
        ds.Ordenacao.shellsort(itemArray0, (int) (byte) 1);
        ds.Ordenacao.shellsort(itemArray0, (int) (short) 1);
        ds.Ordenacao.insercao(itemArray0, (int) (byte) 1);
        ds.Ordenacao.shellsort(itemArray0, (int) (short) 0);
        ds.Ordenacao.shellsort(itemArray0, 1);
        ds.Ordenacao.shellsort(itemArray0, (int) (byte) -1);
        ds.Ordenacao.heapsort(itemArray0, (int) (short) -1);
        ds.Ordenacao.insercao(itemArray0, (int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            ds.Ordenacao.insercao(itemArray0, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 2");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray0);
    }

    @Test
    public void test2505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop5.test2505");
        ds.Item item0 = null;
        ds.Item[] itemArray1 = new ds.Item[] { item0 };
        ds.Ordenacao.shellsort(itemArray1, (int) (byte) 0);
        ds.Ordenacao.heapsort(itemArray1, (-1));
        ds.Ordenacao.shellsort(itemArray1, (int) (byte) -1);
        ds.Ordenacao.heapsort(itemArray1, 0);
        ds.Ordenacao.heapsort(itemArray1, (int) (short) 0);
        ds.Ordenacao.selecao(itemArray1, (int) (byte) 1);
        org.junit.Assert.assertNotNull(itemArray1);
    }

    @Test
    public void test2506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop5.test2506");
        ds.Item[] itemArray0 = new ds.Item[] {};
        ds.Ordenacao.selecao(itemArray0, (-1));
        ds.Ordenacao.shellsort(itemArray0, (int) (byte) 1);
        ds.Ordenacao.shellsort(itemArray0, (int) (short) 1);
        ds.Ordenacao.insercao(itemArray0, (int) (byte) 1);
        ds.Ordenacao.shellsort(itemArray0, (int) (short) 0);
        ds.Ordenacao.shellsort(itemArray0, 1);
        ds.Ordenacao.shellsort(itemArray0, (int) (byte) -1);
        ds.Ordenacao.selecao(itemArray0, (int) (short) 0);
        ds.Ordenacao.insercao(itemArray0, (int) (byte) 1);
        ds.Ordenacao.insercao(itemArray0, 1);
        ds.Ordenacao.shellsort(itemArray0, (-1));
        ds.Ordenacao.selecao(itemArray0, 1);
        ds.Ordenacao.heapsort(itemArray0, 0);
        org.junit.Assert.assertNotNull(itemArray0);
    }

    @Test
    public void test2507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop5.test2507");
        ds.Item[] itemArray0 = new ds.Item[] {};
        ds.Ordenacao.selecao(itemArray0, (-1));
        ds.Ordenacao.shellsort(itemArray0, (int) (byte) -1);
        ds.Ordenacao.insercao(itemArray0, (int) (byte) -1);
        ds.Ordenacao.selecao(itemArray0, 0);
        ds.Ordenacao.insercao(itemArray0, (int) (byte) 0);
        ds.Ordenacao.heapsort(itemArray0, 1);
        ds.Ordenacao.insercao(itemArray0, 0);
        org.junit.Assert.assertNotNull(itemArray0);
    }

    @Test
    public void test2508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop5.test2508");
        ds.Item[] itemArray0 = new ds.Item[] {};
        ds.Ordenacao.shellsort(itemArray0, (int) (short) 0);
        ds.Ordenacao.shellsort(itemArray0, 0);
        ds.Ordenacao.insercao(itemArray0, (int) (byte) 0);
        ds.Ordenacao.selecao(itemArray0, (int) (byte) 1);
        ds.Ordenacao.insercao(itemArray0, (int) (byte) 1);
        ds.Ordenacao.heapsort(itemArray0, (int) (byte) -1);
        // The following exception was thrown during execution in test generation
        try {
            ds.Ordenacao.selecao(itemArray0, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 2");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray0);
    }

    @Test
    public void test2509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop5.test2509");
        ds.Item item0 = null;
        ds.Item[] itemArray1 = new ds.Item[] { item0 };
        ds.Ordenacao.shellsort(itemArray1, 1);
        ds.Ordenacao.heapsort(itemArray1, (int) (byte) 0);
        ds.Ordenacao.shellsort(itemArray1, (int) (short) -1);
        ds.Ordenacao.selecao(itemArray1, (int) (short) -1);
        ds.Ordenacao.selecao(itemArray1, 0);
        // The following exception was thrown during execution in test generation
        try {
            ds.Ordenacao.insercao(itemArray1, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 2");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray1);
    }

    @Test
    public void test2510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop5.test2510");
        ds.Item[] itemArray0 = new ds.Item[] {};
        ds.Ordenacao.selecao(itemArray0, (-1));
        ds.Ordenacao.shellsort(itemArray0, (int) (byte) 1);
        ds.Ordenacao.shellsort(itemArray0, 0);
        ds.Ordenacao.shellsort(itemArray0, 1);
        ds.Ordenacao.heapsort(itemArray0, 0);
        ds.Ordenacao.selecao(itemArray0, 1);
        ds.Ordenacao.heapsort(itemArray0, (int) (short) -1);
        ds.Ordenacao.shellsort(itemArray0, 0);
        ds.Ordenacao.insercao(itemArray0, (int) (byte) 0);
        ds.Ordenacao.insercao(itemArray0, (int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            ds.Ordenacao.quicksort(itemArray0, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray0);
    }

    @Test
    public void test2511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop5.test2511");
        ds.Item item0 = null;
        ds.Item[] itemArray1 = new ds.Item[] { item0 };
        ds.Ordenacao.shellsort(itemArray1, 1);
        ds.Ordenacao.heapsort(itemArray1, (int) (byte) 0);
        ds.Ordenacao.insercao(itemArray1, 0);
        ds.Ordenacao.insercao(itemArray1, (int) (short) 1);
        ds.Ordenacao.selecao(itemArray1, 0);
        ds.Ordenacao.selecao(itemArray1, 0);
        ds.Ordenacao.shellsort(itemArray1, (-1));
        org.junit.Assert.assertNotNull(itemArray1);
    }

    @Test
    public void test2512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop5.test2512");
        ds.Item item0 = null;
        ds.Item[] itemArray1 = new ds.Item[] { item0 };
        ds.Ordenacao.shellsort(itemArray1, 1);
        ds.Ordenacao.selecao(itemArray1, (int) (short) -1);
        ds.Ordenacao.selecao(itemArray1, 0);
        ds.Ordenacao.shellsort(itemArray1, (-1));
        ds.Ordenacao.shellsort(itemArray1, (int) (byte) 1);
        ds.Ordenacao.shellsort(itemArray1, (int) (byte) 0);
        java.lang.Class<?> wildcardClass14 = itemArray1.getClass();
        org.junit.Assert.assertNotNull(itemArray1);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test2513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop5.test2513");
        ds.Item[] itemArray0 = new ds.Item[] {};
        ds.Ordenacao.selecao(itemArray0, (-1));
        ds.Ordenacao.heapsort(itemArray0, (int) (byte) 0);
        ds.Ordenacao.shellsort(itemArray0, (int) (short) -1);
        ds.Ordenacao.insercao(itemArray0, 0);
        ds.Ordenacao.shellsort(itemArray0, (-1));
        org.junit.Assert.assertNotNull(itemArray0);
    }

    @Test
    public void test2514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop5.test2514");
        ds.Item[] itemArray0 = new ds.Item[] {};
        ds.Ordenacao.shellsort(itemArray0, (int) (short) 0);
        ds.Ordenacao.shellsort(itemArray0, 0);
        ds.Ordenacao.shellsort(itemArray0, (int) (short) 0);
        ds.Ordenacao.shellsort(itemArray0, 1);
        ds.Ordenacao.heapsort(itemArray0, (int) (short) 0);
        ds.Ordenacao.heapsort(itemArray0, (int) (byte) 1);
        java.lang.Class<?> wildcardClass13 = itemArray0.getClass();
        org.junit.Assert.assertNotNull(itemArray0);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test2515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop5.test2515");
        ds.Item[] itemArray0 = new ds.Item[] {};
        ds.Ordenacao.selecao(itemArray0, (-1));
        ds.Ordenacao.shellsort(itemArray0, (int) (byte) 1);
        ds.Ordenacao.shellsort(itemArray0, (int) (short) 1);
        ds.Ordenacao.insercao(itemArray0, (int) (byte) 1);
        ds.Ordenacao.shellsort(itemArray0, (int) (short) 0);
        ds.Ordenacao.shellsort(itemArray0, 1);
        ds.Ordenacao.heapsort(itemArray0, 1);
        ds.Ordenacao.insercao(itemArray0, (int) (short) -1);
        java.lang.Class<?> wildcardClass17 = itemArray0.getClass();
        org.junit.Assert.assertNotNull(itemArray0);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test2516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop5.test2516");
        ds.Item[] itemArray0 = new ds.Item[] {};
        ds.Ordenacao.selecao(itemArray0, (-1));
        ds.Ordenacao.insercao(itemArray0, (int) (short) 0);
        ds.Ordenacao.insercao(itemArray0, (int) (byte) -1);
        ds.Ordenacao.heapsort(itemArray0, (-1));
        ds.Ordenacao.selecao(itemArray0, (int) (short) 0);
        ds.Ordenacao.insercao(itemArray0, (int) (byte) 1);
        ds.Ordenacao.heapsort(itemArray0, (-1));
        ds.Ordenacao.heapsort(itemArray0, (int) (byte) 1);
        ds.Ordenacao.shellsort(itemArray0, (int) (byte) -1);
        // The following exception was thrown during execution in test generation
        try {
            ds.Ordenacao.shellsort(itemArray0, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray0);
    }

    @Test
    public void test2517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop5.test2517");
        ds.Item item0 = null;
        ds.Item[] itemArray1 = new ds.Item[] { item0 };
        ds.Ordenacao.shellsort(itemArray1, 1);
        ds.Ordenacao.selecao(itemArray1, (int) (byte) 1);
        ds.Ordenacao.heapsort(itemArray1, 0);
        ds.Ordenacao.shellsort(itemArray1, (int) (short) 1);
        java.lang.Class<?> wildcardClass10 = itemArray1.getClass();
        org.junit.Assert.assertNotNull(itemArray1);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test2518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop5.test2518");
        ds.Item[] itemArray0 = new ds.Item[] {};
        ds.Ordenacao.selecao(itemArray0, (-1));
        ds.Ordenacao.insercao(itemArray0, (int) (short) 0);
        ds.Ordenacao.insercao(itemArray0, (int) (byte) -1);
        ds.Ordenacao.heapsort(itemArray0, (-1));
        ds.Ordenacao.selecao(itemArray0, (int) (short) 0);
        ds.Ordenacao.heapsort(itemArray0, 0);
        ds.Ordenacao.insercao(itemArray0, (int) (short) -1);
        ds.Ordenacao.selecao(itemArray0, (int) (short) 1);
        org.junit.Assert.assertNotNull(itemArray0);
    }

    @Test
    public void test2519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop5.test2519");
        ds.Item[] itemArray0 = new ds.Item[] {};
        ds.Ordenacao.selecao(itemArray0, (-1));
        ds.Ordenacao.shellsort(itemArray0, (int) (byte) 1);
        ds.Ordenacao.shellsort(itemArray0, 0);
        ds.Ordenacao.shellsort(itemArray0, 1);
        ds.Ordenacao.shellsort(itemArray0, (int) (byte) -1);
        ds.Ordenacao.shellsort(itemArray0, (int) (byte) -1);
        ds.Ordenacao.shellsort(itemArray0, (-1));
        ds.Ordenacao.selecao(itemArray0, (int) (byte) 0);
        ds.Ordenacao.insercao(itemArray0, (int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            ds.Ordenacao.heapsort(itemArray0, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray0);
    }

    @Test
    public void test2520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop5.test2520");
        ds.Item[] itemArray0 = new ds.Item[] {};
        ds.Ordenacao.selecao(itemArray0, (-1));
        ds.Ordenacao.shellsort(itemArray0, (int) (byte) 1);
        ds.Ordenacao.shellsort(itemArray0, 0);
        ds.Ordenacao.shellsort(itemArray0, 1);
        ds.Ordenacao.heapsort(itemArray0, 0);
        ds.Ordenacao.selecao(itemArray0, 1);
        ds.Ordenacao.heapsort(itemArray0, (int) (short) -1);
        ds.Ordenacao.insercao(itemArray0, (int) (byte) 0);
        ds.Ordenacao.insercao(itemArray0, 0);
        ds.Ordenacao.shellsort(itemArray0, (int) (short) 1);
        ds.Ordenacao.selecao(itemArray0, 0);
        ds.Ordenacao.insercao(itemArray0, 1);
        ds.Ordenacao.heapsort(itemArray0, 0);
        // The following exception was thrown during execution in test generation
        try {
            ds.Ordenacao.quicksort(itemArray0, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 0");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray0);
    }

    @Test
    public void test2521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop5.test2521");
        ds.Item[] itemArray0 = new ds.Item[] {};
        ds.Ordenacao.selecao(itemArray0, (-1));
        ds.Ordenacao.shellsort(itemArray0, (int) (short) 0);
        ds.Ordenacao.insercao(itemArray0, (int) (byte) -1);
        ds.Ordenacao.insercao(itemArray0, (int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            ds.Ordenacao.quicksort(itemArray0, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 18");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray0);
    }

    @Test
    public void test2522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop5.test2522");
        ds.Item[] itemArray0 = new ds.Item[] {};
        ds.Ordenacao.selecao(itemArray0, (-1));
        ds.Ordenacao.selecao(itemArray0, (int) (short) 0);
        ds.Ordenacao.insercao(itemArray0, 0);
        ds.Ordenacao.heapsort(itemArray0, (-1));
        ds.Ordenacao.insercao(itemArray0, (int) (byte) 1);
        ds.Ordenacao.insercao(itemArray0, (int) (short) -1);
        org.junit.Assert.assertNotNull(itemArray0);
    }

    @Test
    public void test2523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop5.test2523");
        ds.Item[] itemArray0 = new ds.Item[] {};
        ds.Ordenacao.shellsort(itemArray0, (int) (short) 0);
        ds.Ordenacao.shellsort(itemArray0, 0);
        ds.Ordenacao.shellsort(itemArray0, (int) (byte) -1);
        ds.Ordenacao.selecao(itemArray0, (-1));
        ds.Ordenacao.shellsort(itemArray0, (int) (byte) 0);
        org.junit.Assert.assertNotNull(itemArray0);
    }

    @Test
    public void test2524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop5.test2524");
        ds.Item[] itemArray0 = new ds.Item[] {};
        ds.Ordenacao.selecao(itemArray0, (-1));
        ds.Ordenacao.shellsort(itemArray0, (int) (byte) -1);
        ds.Ordenacao.insercao(itemArray0, (int) (byte) -1);
        ds.Ordenacao.selecao(itemArray0, 0);
        ds.Ordenacao.selecao(itemArray0, (int) (byte) 0);
        ds.Ordenacao.heapsort(itemArray0, (int) (byte) 1);
        ds.Ordenacao.insercao(itemArray0, (int) (byte) -1);
        org.junit.Assert.assertNotNull(itemArray0);
    }

    @Test
    public void test2525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop5.test2525");
        ds.Item[] itemArray0 = new ds.Item[] {};
        ds.Ordenacao.selecao(itemArray0, (-1));
        ds.Ordenacao.shellsort(itemArray0, (int) (byte) -1);
        ds.Ordenacao.insercao(itemArray0, 0);
        ds.Ordenacao.heapsort(itemArray0, (int) (short) 0);
        ds.Ordenacao.insercao(itemArray0, (int) (short) 1);
        ds.Ordenacao.selecao(itemArray0, (int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            ds.Ordenacao.quicksort(itemArray0, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 50");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray0);
    }

    @Test
    public void test2526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop5.test2526");
        ds.Item[] itemArray0 = new ds.Item[] {};
        ds.Ordenacao.selecao(itemArray0, (-1));
        ds.Ordenacao.shellsort(itemArray0, (int) (short) 0);
        ds.Ordenacao.insercao(itemArray0, (int) (byte) -1);
        ds.Ordenacao.shellsort(itemArray0, (int) (byte) 0);
        org.junit.Assert.assertNotNull(itemArray0);
    }

    @Test
    public void test2527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop5.test2527");
        ds.Item item0 = null;
        ds.Item[] itemArray1 = new ds.Item[] { item0 };
        ds.Ordenacao.shellsort(itemArray1, 1);
        ds.Ordenacao.selecao(itemArray1, (int) (short) 1);
        ds.Ordenacao.shellsort(itemArray1, (int) (byte) -1);
        ds.Ordenacao.selecao(itemArray1, (int) (short) -1);
        ds.Ordenacao.insercao(itemArray1, (int) (short) -1);
        ds.Ordenacao.shellsort(itemArray1, 0);
        ds.Ordenacao.shellsort(itemArray1, (int) (short) 1);
        org.junit.Assert.assertNotNull(itemArray1);
    }

    @Test
    public void test2528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop5.test2528");
        ds.Item[] itemArray0 = new ds.Item[] {};
        ds.Ordenacao.selecao(itemArray0, (-1));
        ds.Ordenacao.insercao(itemArray0, (int) (short) 1);
        ds.Ordenacao.selecao(itemArray0, 0);
        ds.Ordenacao.insercao(itemArray0, (int) (short) -1);
        ds.Ordenacao.shellsort(itemArray0, (int) (short) -1);
        ds.Ordenacao.heapsort(itemArray0, (int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            ds.Ordenacao.selecao(itemArray0, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 2");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray0);
    }

    @Test
    public void test2529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop5.test2529");
        ds.Item[] itemArray0 = new ds.Item[] {};
        ds.Ordenacao.selecao(itemArray0, (-1));
        ds.Ordenacao.shellsort(itemArray0, (int) (byte) 1);
        ds.Ordenacao.shellsort(itemArray0, 0);
        ds.Ordenacao.shellsort(itemArray0, 1);
        ds.Ordenacao.shellsort(itemArray0, (int) (byte) -1);
        ds.Ordenacao.selecao(itemArray0, 1);
        ds.Ordenacao.heapsort(itemArray0, (int) (byte) -1);
        ds.Ordenacao.selecao(itemArray0, (int) (byte) 0);
        ds.Ordenacao.insercao(itemArray0, (int) (byte) -1);
        ds.Ordenacao.shellsort(itemArray0, (-1));
        ds.Ordenacao.shellsort(itemArray0, 1);
        org.junit.Assert.assertNotNull(itemArray0);
    }

    @Test
    public void test2530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop5.test2530");
        ds.Item item0 = null;
        ds.Item[] itemArray1 = new ds.Item[] { item0 };
        ds.Ordenacao.shellsort(itemArray1, 1);
        ds.Ordenacao.selecao(itemArray1, (int) (byte) 1);
        ds.Ordenacao.shellsort(itemArray1, 1);
        ds.Ordenacao.insercao(itemArray1, (int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            ds.Ordenacao.quicksort(itemArray1, 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray1);
    }

    @Test
    public void test2531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop5.test2531");
        ds.Item[] itemArray0 = new ds.Item[] {};
        ds.Ordenacao.selecao(itemArray0, (-1));
        ds.Ordenacao.shellsort(itemArray0, (int) (byte) 1);
        ds.Ordenacao.shellsort(itemArray0, (int) (short) 1);
        ds.Ordenacao.heapsort(itemArray0, (int) (short) 0);
        ds.Ordenacao.heapsort(itemArray0, (-1));
        ds.Ordenacao.selecao(itemArray0, (int) (byte) 1);
        ds.Ordenacao.insercao(itemArray0, (int) (short) 1);
        org.junit.Assert.assertNotNull(itemArray0);
    }

    @Test
    public void test2532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop5.test2532");
        ds.Item[] itemArray0 = new ds.Item[] {};
        ds.Ordenacao.selecao(itemArray0, (-1));
        ds.Ordenacao.shellsort(itemArray0, (int) (byte) -1);
        ds.Ordenacao.insercao(itemArray0, 0);
        ds.Ordenacao.heapsort(itemArray0, 0);
        ds.Ordenacao.selecao(itemArray0, (int) (byte) 0);
        ds.Ordenacao.shellsort(itemArray0, (int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            ds.Ordenacao.quicksort(itemArray0, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 0");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray0);
    }

    @Test
    public void test2533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop5.test2533");
        ds.Item[] itemArray0 = new ds.Item[] {};
        ds.Ordenacao.selecao(itemArray0, (-1));
        ds.Ordenacao.shellsort(itemArray0, (int) (byte) 1);
        ds.Ordenacao.shellsort(itemArray0, 0);
        ds.Ordenacao.shellsort(itemArray0, 1);
        ds.Ordenacao.insercao(itemArray0, (int) (short) 0);
        ds.Ordenacao.heapsort(itemArray0, 1);
        ds.Ordenacao.heapsort(itemArray0, (-1));
        // The following exception was thrown during execution in test generation
        try {
            ds.Ordenacao.insercao(itemArray0, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 2");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray0);
    }

    @Test
    public void test2534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop5.test2534");
        ds.Item item0 = null;
        ds.Item[] itemArray1 = new ds.Item[] { item0 };
        ds.Ordenacao.shellsort(itemArray1, 1);
        ds.Ordenacao.heapsort(itemArray1, (int) (byte) 0);
        ds.Ordenacao.insercao(itemArray1, 0);
        ds.Ordenacao.insercao(itemArray1, (int) (short) 1);
        ds.Ordenacao.selecao(itemArray1, 0);
        ds.Ordenacao.heapsort(itemArray1, (int) (short) -1);
        // The following exception was thrown during execution in test generation
        try {
            ds.Ordenacao.heapsort(itemArray1, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray1);
    }

    @Test
    public void test2535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop5.test2535");
        ds.Item[] itemArray0 = new ds.Item[] {};
        ds.Ordenacao.selecao(itemArray0, (-1));
        ds.Ordenacao.selecao(itemArray0, (int) (short) 0);
        ds.Ordenacao.heapsort(itemArray0, (int) (short) 0);
        ds.Ordenacao.shellsort(itemArray0, (int) (short) 1);
        ds.Ordenacao.shellsort(itemArray0, (int) (short) 0);
        ds.Ordenacao.shellsort(itemArray0, 1);
        ds.Ordenacao.selecao(itemArray0, (int) (byte) -1);
        ds.Ordenacao.selecao(itemArray0, 0);
        ds.Ordenacao.heapsort(itemArray0, (int) (byte) -1);
        ds.Ordenacao.heapsort(itemArray0, (-1));
        org.junit.Assert.assertNotNull(itemArray0);
    }

    @Test
    public void test2536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop5.test2536");
        ds.Item[] itemArray0 = new ds.Item[] {};
        ds.Ordenacao.selecao(itemArray0, (-1));
        ds.Ordenacao.insercao(itemArray0, (int) (short) 1);
        ds.Ordenacao.selecao(itemArray0, 0);
        ds.Ordenacao.insercao(itemArray0, (int) (short) -1);
        ds.Ordenacao.insercao(itemArray0, (int) (byte) 0);
        org.junit.Assert.assertNotNull(itemArray0);
    }

    @Test
    public void test2537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop5.test2537");
        ds.Item item0 = null;
        ds.Item[] itemArray1 = new ds.Item[] { item0 };
        ds.Ordenacao.shellsort(itemArray1, 1);
        ds.Ordenacao.selecao(itemArray1, (int) (short) -1);
        ds.Ordenacao.shellsort(itemArray1, (int) (byte) 0);
        org.junit.Assert.assertNotNull(itemArray1);
    }

    @Test
    public void test2538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop5.test2538");
        ds.Item[] itemArray0 = new ds.Item[] {};
        ds.Ordenacao.selecao(itemArray0, (-1));
        ds.Ordenacao.insercao(itemArray0, (int) (short) 0);
        ds.Ordenacao.selecao(itemArray0, (int) (byte) 1);
        ds.Ordenacao.heapsort(itemArray0, 0);
        ds.Ordenacao.heapsort(itemArray0, (int) (byte) -1);
        org.junit.Assert.assertNotNull(itemArray0);
    }

    @Test
    public void test2539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop5.test2539");
        ds.Item[] itemArray0 = new ds.Item[] {};
        ds.Ordenacao.selecao(itemArray0, (-1));
        ds.Ordenacao.shellsort(itemArray0, (int) (byte) 1);
        ds.Ordenacao.shellsort(itemArray0, 0);
        ds.Ordenacao.shellsort(itemArray0, 1);
        ds.Ordenacao.shellsort(itemArray0, (int) (byte) -1);
        ds.Ordenacao.heapsort(itemArray0, 1);
        ds.Ordenacao.heapsort(itemArray0, (int) (byte) 1);
        ds.Ordenacao.shellsort(itemArray0, (int) (byte) 0);
        ds.Ordenacao.heapsort(itemArray0, (int) (short) 1);
        ds.Ordenacao.insercao(itemArray0, (int) (byte) 0);
        java.lang.Class<?> wildcardClass21 = itemArray0.getClass();
        org.junit.Assert.assertNotNull(itemArray0);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test2540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop5.test2540");
        ds.Item[] itemArray0 = new ds.Item[] {};
        ds.Ordenacao.selecao(itemArray0, (-1));
        ds.Ordenacao.shellsort(itemArray0, (int) (byte) 1);
        ds.Ordenacao.shellsort(itemArray0, 0);
        ds.Ordenacao.shellsort(itemArray0, 1);
        ds.Ordenacao.shellsort(itemArray0, (int) (byte) -1);
        ds.Ordenacao.heapsort(itemArray0, 1);
        ds.Ordenacao.insercao(itemArray0, (int) (byte) -1);
        ds.Ordenacao.heapsort(itemArray0, (int) (short) -1);
        ds.Ordenacao.insercao(itemArray0, (int) (byte) -1);
        ds.Ordenacao.insercao(itemArray0, (int) (byte) -1);
        // The following exception was thrown during execution in test generation
        try {
            ds.Ordenacao.selecao(itemArray0, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray0);
    }

    @Test
    public void test2541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop5.test2541");
        ds.Item item0 = null;
        ds.Item[] itemArray1 = new ds.Item[] { item0 };
        ds.Ordenacao.shellsort(itemArray1, 1);
        ds.Ordenacao.selecao(itemArray1, (int) (byte) 1);
        ds.Ordenacao.shellsort(itemArray1, 1);
        ds.Ordenacao.insercao(itemArray1, (int) (byte) -1);
        ds.Ordenacao.heapsort(itemArray1, (int) (byte) -1);
        ds.Ordenacao.heapsort(itemArray1, (-1));
        ds.Ordenacao.selecao(itemArray1, 1);
        ds.Ordenacao.insercao(itemArray1, (int) (byte) -1);
        ds.Ordenacao.heapsort(itemArray1, (int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            ds.Ordenacao.insercao(itemArray1, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 2");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray1);
    }

    @Test
    public void test2542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop5.test2542");
        ds.Item[] itemArray0 = new ds.Item[] {};
        ds.Ordenacao.shellsort(itemArray0, (int) (short) 0);
        ds.Ordenacao.shellsort(itemArray0, (int) (short) -1);
        // The following exception was thrown during execution in test generation
        try {
            ds.Ordenacao.selecao(itemArray0, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray0);
    }

    @Test
    public void test2543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop5.test2543");
        ds.Item[] itemArray0 = new ds.Item[] {};
        ds.Ordenacao.heapsort(itemArray0, 1);
        ds.Ordenacao.heapsort(itemArray0, (int) (short) 0);
        ds.Ordenacao.shellsort(itemArray0, (int) (byte) -1);
        java.lang.Class<?> wildcardClass7 = itemArray0.getClass();
        org.junit.Assert.assertNotNull(itemArray0);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test2544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop5.test2544");
        ds.Item[] itemArray0 = new ds.Item[] {};
        ds.Ordenacao.selecao(itemArray0, (-1));
        ds.Ordenacao.shellsort(itemArray0, (int) (byte) 1);
        ds.Ordenacao.shellsort(itemArray0, 0);
        ds.Ordenacao.shellsort(itemArray0, 1);
        ds.Ordenacao.shellsort(itemArray0, (int) (byte) -1);
        ds.Ordenacao.heapsort(itemArray0, 1);
        ds.Ordenacao.insercao(itemArray0, (int) (byte) -1);
        ds.Ordenacao.heapsort(itemArray0, (int) (short) -1);
        ds.Ordenacao.insercao(itemArray0, (int) (byte) -1);
        ds.Ordenacao.heapsort(itemArray0, 0);
        // The following exception was thrown during execution in test generation
        try {
            ds.Ordenacao.quicksort(itemArray0, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray0);
    }

    @Test
    public void test2545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop5.test2545");
        ds.Item[] itemArray0 = new ds.Item[] {};
        ds.Ordenacao.selecao(itemArray0, (-1));
        ds.Ordenacao.shellsort(itemArray0, (int) (byte) 1);
        ds.Ordenacao.shellsort(itemArray0, 0);
        ds.Ordenacao.shellsort(itemArray0, (int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            ds.Ordenacao.selecao(itemArray0, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray0);
    }

    @Test
    public void test2546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop5.test2546");
        ds.Item[] itemArray0 = new ds.Item[] {};
        ds.Ordenacao.selecao(itemArray0, (-1));
        ds.Ordenacao.shellsort(itemArray0, (int) (byte) 1);
        ds.Ordenacao.shellsort(itemArray0, (int) (byte) 1);
        ds.Ordenacao.shellsort(itemArray0, (int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            ds.Ordenacao.heapsort(itemArray0, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray0);
    }

    @Test
    public void test2547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop5.test2547");
        ds.Item[] itemArray0 = new ds.Item[] {};
        ds.Ordenacao.selecao(itemArray0, (-1));
        ds.Ordenacao.shellsort(itemArray0, (int) (byte) 1);
        ds.Ordenacao.shellsort(itemArray0, (int) (short) 1);
        ds.Ordenacao.insercao(itemArray0, (int) (byte) 1);
        ds.Ordenacao.shellsort(itemArray0, (int) (short) 0);
        ds.Ordenacao.shellsort(itemArray0, 1);
        ds.Ordenacao.shellsort(itemArray0, (int) (byte) -1);
        ds.Ordenacao.selecao(itemArray0, (int) (short) 0);
        ds.Ordenacao.insercao(itemArray0, (int) (byte) 1);
        ds.Ordenacao.shellsort(itemArray0, (int) (byte) -1);
        ds.Ordenacao.shellsort(itemArray0, (int) (short) 0);
        ds.Ordenacao.insercao(itemArray0, 0);
        ds.Ordenacao.shellsort(itemArray0, (int) (byte) -1);
        org.junit.Assert.assertNotNull(itemArray0);
    }

    @Test
    public void test2548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop5.test2548");
        ds.Item[] itemArray0 = new ds.Item[] {};
        ds.Ordenacao.selecao(itemArray0, (-1));
        ds.Ordenacao.shellsort(itemArray0, (int) (byte) 1);
        ds.Ordenacao.shellsort(itemArray0, 0);
        ds.Ordenacao.shellsort(itemArray0, 1);
        ds.Ordenacao.shellsort(itemArray0, (int) (byte) -1);
        ds.Ordenacao.selecao(itemArray0, (int) (byte) 0);
        ds.Ordenacao.shellsort(itemArray0, (int) (byte) -1);
        ds.Ordenacao.selecao(itemArray0, (int) (byte) -1);
        ds.Ordenacao.insercao(itemArray0, 1);
        ds.Ordenacao.insercao(itemArray0, 0);
        org.junit.Assert.assertNotNull(itemArray0);
    }
}

