package ds.seed6733;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class Randoop4 {

    public static boolean debug = false;

    @Test
    public void test2001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2001");
        ds.Item[] itemArray0 = new ds.Item[] {};
        ds.Ordenacao.heapsort(itemArray0, 0);
        ds.Ordenacao.insercao(itemArray0, 0);
        ds.Ordenacao.selecao(itemArray0, 0);
        ds.Ordenacao.insercao(itemArray0, (-1));
        ds.Ordenacao.insercao(itemArray0, (int) (byte) -1);
        ds.Ordenacao.heapsort(itemArray0, (int) (byte) -1);
        ds.Ordenacao.insercao(itemArray0, 0);
        ds.Ordenacao.insercao(itemArray0, 0);
        ds.Ordenacao.heapsort(itemArray0, (int) (short) 0);
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
    public void test2002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2002");
        ds.Item[] itemArray0 = new ds.Item[] {};
        ds.Ordenacao.heapsort(itemArray0, 0);
        ds.Ordenacao.insercao(itemArray0, 0);
        ds.Ordenacao.selecao(itemArray0, 0);
        ds.Ordenacao.insercao(itemArray0, (-1));
        ds.Ordenacao.heapsort(itemArray0, (-1));
        ds.Ordenacao.insercao(itemArray0, (int) (short) -1);
        ds.Ordenacao.shellsort(itemArray0, 1);
        ds.Ordenacao.heapsort(itemArray0, (int) (short) -1);
        org.junit.Assert.assertNotNull(itemArray0);
    }

    @Test
    public void test2003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2003");
        ds.Item[] itemArray0 = new ds.Item[] {};
        ds.Ordenacao.heapsort(itemArray0, 0);
        ds.Ordenacao.insercao(itemArray0, 0);
        ds.Ordenacao.insercao(itemArray0, (int) (short) 0);
        ds.Ordenacao.selecao(itemArray0, 1);
        ds.Ordenacao.selecao(itemArray0, (int) (short) -1);
        ds.Ordenacao.insercao(itemArray0, 0);
        ds.Ordenacao.heapsort(itemArray0, (int) (short) -1);
        ds.Ordenacao.shellsort(itemArray0, 0);
        ds.Ordenacao.insercao(itemArray0, (int) (short) 0);
        ds.Ordenacao.heapsort(itemArray0, 1);
        ds.Ordenacao.selecao(itemArray0, (int) (short) 1);
        org.junit.Assert.assertNotNull(itemArray0);
    }

    @Test
    public void test2004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2004");
        ds.Item item0 = null;
        ds.Item[] itemArray1 = new ds.Item[] { item0 };
        ds.Ordenacao.selecao(itemArray1, (int) (short) 1);
        ds.Ordenacao.heapsort(itemArray1, 0);
        ds.Ordenacao.heapsort(itemArray1, 0);
        // The following exception was thrown during execution in test generation
        try {
            ds.Ordenacao.selecao(itemArray1, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 2");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray1);
    }

    @Test
    public void test2005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2005");
        ds.Item[] itemArray0 = new ds.Item[] {};
        ds.Ordenacao.heapsort(itemArray0, 0);
        ds.Ordenacao.insercao(itemArray0, 0);
        ds.Ordenacao.shellsort(itemArray0, (-1));
        ds.Ordenacao.insercao(itemArray0, (int) (byte) 1);
        ds.Ordenacao.selecao(itemArray0, 0);
        ds.Ordenacao.selecao(itemArray0, (int) (byte) -1);
        ds.Ordenacao.selecao(itemArray0, 0);
        ds.Ordenacao.insercao(itemArray0, (int) (byte) 1);
        ds.Ordenacao.insercao(itemArray0, (int) (byte) 0);
        ds.Ordenacao.insercao(itemArray0, (-1));
        java.lang.Class<?> wildcardClass21 = itemArray0.getClass();
        org.junit.Assert.assertNotNull(itemArray0);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test2006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2006");
        ds.Item[] itemArray0 = new ds.Item[] {};
        ds.Ordenacao.heapsort(itemArray0, 0);
        ds.Ordenacao.insercao(itemArray0, 0);
        ds.Ordenacao.insercao(itemArray0, (int) (short) 0);
        ds.Ordenacao.selecao(itemArray0, 1);
        ds.Ordenacao.selecao(itemArray0, (int) (short) -1);
        ds.Ordenacao.insercao(itemArray0, 0);
        ds.Ordenacao.selecao(itemArray0, 0);
        ds.Ordenacao.shellsort(itemArray0, (int) (byte) 0);
        java.lang.Class<?> wildcardClass17 = itemArray0.getClass();
        org.junit.Assert.assertNotNull(itemArray0);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test2007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2007");
        ds.Item[] itemArray0 = null;
        // The following exception was thrown during execution in test generation
        try {
            ds.Ordenacao.heapsort(itemArray0, (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2008");
        ds.Item[] itemArray0 = new ds.Item[] {};
        ds.Ordenacao.heapsort(itemArray0, 0);
        ds.Ordenacao.insercao(itemArray0, 0);
        ds.Ordenacao.shellsort(itemArray0, (-1));
        ds.Ordenacao.selecao(itemArray0, (-1));
        ds.Ordenacao.heapsort(itemArray0, (int) (short) 0);
        ds.Ordenacao.selecao(itemArray0, 1);
        ds.Ordenacao.heapsort(itemArray0, (int) (short) 1);
        ds.Ordenacao.heapsort(itemArray0, (int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            ds.Ordenacao.quicksort(itemArray0, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 26");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray0);
    }

    @Test
    public void test2009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2009");
        ds.Item item0 = null;
        ds.Item[] itemArray1 = new ds.Item[] { item0 };
        ds.Ordenacao.heapsort(itemArray1, 0);
        ds.Ordenacao.heapsort(itemArray1, 1);
        ds.Ordenacao.heapsort(itemArray1, 1);
        ds.Ordenacao.selecao(itemArray1, (int) (short) 1);
        ds.Ordenacao.selecao(itemArray1, (int) (short) 1);
        ds.Ordenacao.insercao(itemArray1, (int) (byte) -1);
        ds.Ordenacao.selecao(itemArray1, (int) (short) 1);
        ds.Ordenacao.heapsort(itemArray1, (int) (byte) 0);
        java.lang.Class<?> wildcardClass18 = itemArray1.getClass();
        org.junit.Assert.assertNotNull(itemArray1);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test2010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2010");
        ds.Item[] itemArray0 = new ds.Item[] {};
        ds.Ordenacao.heapsort(itemArray0, 0);
        ds.Ordenacao.insercao(itemArray0, 0);
        ds.Ordenacao.selecao(itemArray0, 0);
        ds.Ordenacao.insercao(itemArray0, (-1));
        ds.Ordenacao.heapsort(itemArray0, 1);
        ds.Ordenacao.selecao(itemArray0, (int) (short) -1);
        ds.Ordenacao.shellsort(itemArray0, (int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            ds.Ordenacao.selecao(itemArray0, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 2");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray0);
    }

    @Test
    public void test2011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2011");
        ds.Item[] itemArray0 = new ds.Item[] {};
        ds.Ordenacao.heapsort(itemArray0, 0);
        ds.Ordenacao.insercao(itemArray0, 0);
        ds.Ordenacao.selecao(itemArray0, 0);
        ds.Ordenacao.insercao(itemArray0, (-1));
        ds.Ordenacao.heapsort(itemArray0, (-1));
        ds.Ordenacao.selecao(itemArray0, 1);
        ds.Ordenacao.shellsort(itemArray0, 0);
        ds.Ordenacao.heapsort(itemArray0, 1);
        // The following exception was thrown during execution in test generation
        try {
            ds.Ordenacao.selecao(itemArray0, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 2");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray0);
    }

    @Test
    public void test2012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2012");
        ds.Item item0 = null;
        ds.Item[] itemArray1 = new ds.Item[] { item0 };
        ds.Ordenacao.heapsort(itemArray1, 0);
        ds.Ordenacao.heapsort(itemArray1, 1);
        ds.Ordenacao.shellsort(itemArray1, (int) (byte) 1);
        ds.Ordenacao.shellsort(itemArray1, 0);
        java.lang.Class<?> wildcardClass10 = itemArray1.getClass();
        org.junit.Assert.assertNotNull(itemArray1);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test2013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2013");
        ds.Item[] itemArray0 = new ds.Item[] {};
        ds.Ordenacao.heapsort(itemArray0, 0);
        ds.Ordenacao.insercao(itemArray0, 0);
        ds.Ordenacao.insercao(itemArray0, (int) (short) 0);
        ds.Ordenacao.selecao(itemArray0, 1);
        ds.Ordenacao.shellsort(itemArray0, (int) (short) 1);
        ds.Ordenacao.insercao(itemArray0, (int) (short) 1);
        ds.Ordenacao.selecao(itemArray0, 0);
        ds.Ordenacao.shellsort(itemArray0, (-1));
        ds.Ordenacao.heapsort(itemArray0, (int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            ds.Ordenacao.quicksort(itemArray0, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray0);
    }

    @Test
    public void test2014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2014");
        ds.Item[] itemArray0 = new ds.Item[] {};
        ds.Ordenacao.heapsort(itemArray0, 0);
        ds.Ordenacao.insercao(itemArray0, 0);
        ds.Ordenacao.selecao(itemArray0, 0);
        ds.Ordenacao.insercao(itemArray0, (-1));
        ds.Ordenacao.insercao(itemArray0, (int) (byte) -1);
        ds.Ordenacao.insercao(itemArray0, 0);
        ds.Ordenacao.heapsort(itemArray0, (int) (byte) -1);
        ds.Ordenacao.insercao(itemArray0, 0);
        org.junit.Assert.assertNotNull(itemArray0);
    }

    @Test
    public void test2015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2015");
        ds.Item[] itemArray0 = new ds.Item[] {};
        ds.Ordenacao.heapsort(itemArray0, 0);
        ds.Ordenacao.heapsort(itemArray0, (int) (byte) 0);
        ds.Ordenacao.shellsort(itemArray0, 0);
        ds.Ordenacao.heapsort(itemArray0, (int) (byte) -1);
        ds.Ordenacao.heapsort(itemArray0, (int) (byte) 1);
        ds.Ordenacao.heapsort(itemArray0, 0);
        ds.Ordenacao.selecao(itemArray0, (int) (byte) -1);
        ds.Ordenacao.shellsort(itemArray0, 0);
        org.junit.Assert.assertNotNull(itemArray0);
    }

    @Test
    public void test2016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2016");
        ds.Item[] itemArray0 = new ds.Item[] {};
        ds.Ordenacao.heapsort(itemArray0, 0);
        ds.Ordenacao.insercao(itemArray0, 0);
        ds.Ordenacao.shellsort(itemArray0, (-1));
        ds.Ordenacao.insercao(itemArray0, (int) (byte) 1);
        ds.Ordenacao.selecao(itemArray0, 0);
        ds.Ordenacao.selecao(itemArray0, (int) (byte) -1);
        ds.Ordenacao.selecao(itemArray0, 0);
        ds.Ordenacao.insercao(itemArray0, (int) (byte) 1);
        ds.Ordenacao.heapsort(itemArray0, (int) (short) 1);
        ds.Ordenacao.heapsort(itemArray0, (int) (short) -1);
        ds.Ordenacao.insercao(itemArray0, (int) (byte) -1);
        ds.Ordenacao.heapsort(itemArray0, 1);
        ds.Ordenacao.heapsort(itemArray0, (int) (byte) 1);
        ds.Ordenacao.selecao(itemArray0, (int) (short) -1);
        ds.Ordenacao.heapsort(itemArray0, 0);
        ds.Ordenacao.shellsort(itemArray0, 0);
        // The following exception was thrown during execution in test generation
        try {
            ds.Ordenacao.quicksort(itemArray0, (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray0);
    }

    @Test
    public void test2017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2017");
        ds.Item[] itemArray0 = new ds.Item[] {};
        ds.Ordenacao.heapsort(itemArray0, 0);
        ds.Ordenacao.insercao(itemArray0, 0);
        ds.Ordenacao.insercao(itemArray0, (int) (short) 0);
        ds.Ordenacao.selecao(itemArray0, 1);
        ds.Ordenacao.selecao(itemArray0, 0);
        ds.Ordenacao.insercao(itemArray0, 0);
        ds.Ordenacao.heapsort(itemArray0, (-1));
        ds.Ordenacao.heapsort(itemArray0, (int) (byte) 1);
        ds.Ordenacao.insercao(itemArray0, (int) (byte) 0);
        java.lang.Class<?> wildcardClass19 = itemArray0.getClass();
        org.junit.Assert.assertNotNull(itemArray0);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test2018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2018");
        ds.Item[] itemArray0 = new ds.Item[] {};
        ds.Ordenacao.heapsort(itemArray0, 0);
        ds.Ordenacao.insercao(itemArray0, 0);
        ds.Ordenacao.insercao(itemArray0, (int) (short) 0);
        ds.Ordenacao.selecao(itemArray0, 1);
        ds.Ordenacao.shellsort(itemArray0, (int) (short) 1);
        ds.Ordenacao.heapsort(itemArray0, (int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            ds.Ordenacao.quicksort(itemArray0, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 26");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray0);
    }

    @Test
    public void test2019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2019");
        ds.Item[] itemArray0 = new ds.Item[] {};
        ds.Ordenacao.heapsort(itemArray0, 0);
        ds.Ordenacao.insercao(itemArray0, 0);
        ds.Ordenacao.shellsort(itemArray0, (-1));
        ds.Ordenacao.insercao(itemArray0, (int) (byte) 1);
        ds.Ordenacao.selecao(itemArray0, 0);
        ds.Ordenacao.selecao(itemArray0, (int) (byte) -1);
        ds.Ordenacao.selecao(itemArray0, 0);
        ds.Ordenacao.insercao(itemArray0, (int) (byte) 1);
        ds.Ordenacao.insercao(itemArray0, (int) (byte) 0);
        ds.Ordenacao.insercao(itemArray0, (-1));
        ds.Ordenacao.selecao(itemArray0, (int) (byte) 0);
        ds.Ordenacao.shellsort(itemArray0, (-1));
        java.lang.Class<?> wildcardClass25 = itemArray0.getClass();
        org.junit.Assert.assertNotNull(itemArray0);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test2020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2020");
        ds.Item[] itemArray0 = new ds.Item[] {};
        ds.Ordenacao.heapsort(itemArray0, 0);
        ds.Ordenacao.insercao(itemArray0, 0);
        ds.Ordenacao.insercao(itemArray0, (int) (short) 0);
        ds.Ordenacao.selecao(itemArray0, 1);
        ds.Ordenacao.selecao(itemArray0, (int) (short) -1);
        ds.Ordenacao.insercao(itemArray0, 0);
        ds.Ordenacao.selecao(itemArray0, 0);
        ds.Ordenacao.shellsort(itemArray0, (int) (short) -1);
        ds.Ordenacao.heapsort(itemArray0, (int) (byte) 1);
        ds.Ordenacao.selecao(itemArray0, (int) (short) 1);
        ds.Ordenacao.shellsort(itemArray0, 0);
        // The following exception was thrown during execution in test generation
        try {
            ds.Ordenacao.insercao(itemArray0, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray0);
    }

    @Test
    public void test2021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2021");
        ds.Item[] itemArray0 = new ds.Item[] {};
        ds.Ordenacao.heapsort(itemArray0, 0);
        ds.Ordenacao.insercao(itemArray0, 0);
        ds.Ordenacao.heapsort(itemArray0, 1);
        ds.Ordenacao.shellsort(itemArray0, (int) (short) 1);
        ds.Ordenacao.selecao(itemArray0, 0);
        ds.Ordenacao.insercao(itemArray0, (int) (byte) -1);
        ds.Ordenacao.selecao(itemArray0, 0);
        org.junit.Assert.assertNotNull(itemArray0);
    }

    @Test
    public void test2022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2022");
        ds.Item[] itemArray0 = new ds.Item[] {};
        ds.Ordenacao.heapsort(itemArray0, 0);
        ds.Ordenacao.insercao(itemArray0, 0);
        ds.Ordenacao.shellsort(itemArray0, (-1));
        ds.Ordenacao.selecao(itemArray0, (-1));
        ds.Ordenacao.heapsort(itemArray0, (int) (short) 0);
        ds.Ordenacao.heapsort(itemArray0, (int) (short) 1);
        ds.Ordenacao.shellsort(itemArray0, (int) (byte) -1);
        // The following exception was thrown during execution in test generation
        try {
            ds.Ordenacao.shellsort(itemArray0, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 14");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray0);
    }

    @Test
    public void test2023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2023");
        ds.Item[] itemArray0 = new ds.Item[] {};
        ds.Ordenacao.heapsort(itemArray0, 0);
        ds.Ordenacao.insercao(itemArray0, 0);
        ds.Ordenacao.shellsort(itemArray0, (-1));
        ds.Ordenacao.selecao(itemArray0, 0);
        ds.Ordenacao.insercao(itemArray0, (int) (byte) 0);
        ds.Ordenacao.shellsort(itemArray0, (int) (short) 1);
        ds.Ordenacao.heapsort(itemArray0, 1);
        java.lang.Class<?> wildcardClass15 = itemArray0.getClass();
        org.junit.Assert.assertNotNull(itemArray0);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test2024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2024");
        ds.Item[] itemArray0 = new ds.Item[] {};
        ds.Ordenacao.heapsort(itemArray0, 0);
        ds.Ordenacao.insercao(itemArray0, 0);
        ds.Ordenacao.shellsort(itemArray0, (-1));
        ds.Ordenacao.insercao(itemArray0, (int) (byte) 1);
        ds.Ordenacao.selecao(itemArray0, 1);
        ds.Ordenacao.shellsort(itemArray0, (int) (short) 1);
        ds.Ordenacao.heapsort(itemArray0, (int) (short) -1);
        java.lang.Class<?> wildcardClass15 = itemArray0.getClass();
        org.junit.Assert.assertNotNull(itemArray0);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test2025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2025");
        ds.Item[] itemArray0 = new ds.Item[] {};
        ds.Ordenacao.heapsort(itemArray0, 0);
        ds.Ordenacao.insercao(itemArray0, 0);
        ds.Ordenacao.selecao(itemArray0, 0);
        ds.Ordenacao.shellsort(itemArray0, (int) (byte) 1);
        ds.Ordenacao.selecao(itemArray0, 0);
        ds.Ordenacao.selecao(itemArray0, (int) (byte) -1);
        ds.Ordenacao.heapsort(itemArray0, (int) (short) 1);
        ds.Ordenacao.insercao(itemArray0, (int) (short) -1);
        // The following exception was thrown during execution in test generation
        try {
            ds.Ordenacao.selecao(itemArray0, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 2");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray0);
    }

    @Test
    public void test2026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2026");
        ds.Item[] itemArray0 = new ds.Item[] {};
        ds.Ordenacao.shellsort(itemArray0, 0);
        ds.Ordenacao.shellsort(itemArray0, (int) (byte) -1);
        ds.Ordenacao.selecao(itemArray0, (-1));
        ds.Ordenacao.shellsort(itemArray0, (int) (byte) 1);
        ds.Ordenacao.selecao(itemArray0, (int) (byte) 0);
        org.junit.Assert.assertNotNull(itemArray0);
    }

    @Test
    public void test2027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2027");
        ds.Item[] itemArray0 = new ds.Item[] {};
        ds.Ordenacao.heapsort(itemArray0, 0);
        ds.Ordenacao.insercao(itemArray0, 0);
        ds.Ordenacao.shellsort(itemArray0, (-1));
        ds.Ordenacao.insercao(itemArray0, (int) (byte) 1);
        ds.Ordenacao.selecao(itemArray0, 0);
        ds.Ordenacao.shellsort(itemArray0, 1);
        ds.Ordenacao.insercao(itemArray0, (-1));
        ds.Ordenacao.insercao(itemArray0, (int) (byte) 0);
        ds.Ordenacao.selecao(itemArray0, (int) (byte) -1);
        ds.Ordenacao.selecao(itemArray0, 1);
        ds.Ordenacao.insercao(itemArray0, (int) (byte) -1);
        org.junit.Assert.assertNotNull(itemArray0);
    }

    @Test
    public void test2028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2028");
        ds.Item item0 = null;
        ds.Item[] itemArray1 = new ds.Item[] { item0 };
        ds.Ordenacao.heapsort(itemArray1, 0);
        ds.Ordenacao.selecao(itemArray1, (int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            ds.Ordenacao.selecao(itemArray1, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 2");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray1);
    }

    @Test
    public void test2029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2029");
        ds.Item[] itemArray0 = new ds.Item[] {};
        ds.Ordenacao.heapsort(itemArray0, 0);
        ds.Ordenacao.heapsort(itemArray0, (int) (byte) 0);
        ds.Ordenacao.shellsort(itemArray0, 0);
        ds.Ordenacao.insercao(itemArray0, (-1));
        ds.Ordenacao.heapsort(itemArray0, (int) (byte) -1);
        ds.Ordenacao.selecao(itemArray0, (int) (short) -1);
        // The following exception was thrown during execution in test generation
        try {
            ds.Ordenacao.insercao(itemArray0, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray0);
    }

    @Test
    public void test2030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2030");
        ds.Item[] itemArray0 = new ds.Item[] {};
        ds.Ordenacao.shellsort(itemArray0, 0);
        ds.Ordenacao.selecao(itemArray0, (int) (byte) 1);
        ds.Ordenacao.shellsort(itemArray0, (int) (short) -1);
        ds.Ordenacao.shellsort(itemArray0, (int) (byte) 1);
        java.lang.Class<?> wildcardClass9 = itemArray0.getClass();
        org.junit.Assert.assertNotNull(itemArray0);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test2031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2031");
        ds.Item[] itemArray0 = new ds.Item[] {};
        ds.Ordenacao.heapsort(itemArray0, 0);
        ds.Ordenacao.insercao(itemArray0, 0);
        ds.Ordenacao.shellsort(itemArray0, (-1));
        ds.Ordenacao.insercao(itemArray0, (int) (byte) 1);
        ds.Ordenacao.insercao(itemArray0, (int) (byte) 0);
        ds.Ordenacao.selecao(itemArray0, (int) (short) -1);
        ds.Ordenacao.heapsort(itemArray0, (int) (short) 1);
        ds.Ordenacao.shellsort(itemArray0, (int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            ds.Ordenacao.insercao(itemArray0, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray0);
    }

    @Test
    public void test2032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2032");
        ds.Item[] itemArray0 = null;
        // The following exception was thrown during execution in test generation
        try {
            ds.Ordenacao.shellsort(itemArray0, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2033");
        ds.Item[] itemArray0 = new ds.Item[] {};
        ds.Ordenacao.heapsort(itemArray0, 0);
        ds.Ordenacao.insercao(itemArray0, 0);
        ds.Ordenacao.insercao(itemArray0, (int) (short) 0);
        ds.Ordenacao.selecao(itemArray0, 1);
        ds.Ordenacao.selecao(itemArray0, 0);
        ds.Ordenacao.heapsort(itemArray0, (int) (byte) -1);
        java.lang.Class<?> wildcardClass13 = itemArray0.getClass();
        org.junit.Assert.assertNotNull(itemArray0);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test2034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2034");
        ds.Item[] itemArray0 = new ds.Item[] {};
        ds.Ordenacao.heapsort(itemArray0, 0);
        ds.Ordenacao.insercao(itemArray0, 0);
        ds.Ordenacao.shellsort(itemArray0, (-1));
        ds.Ordenacao.selecao(itemArray0, (-1));
        ds.Ordenacao.heapsort(itemArray0, (int) (short) 0);
        ds.Ordenacao.heapsort(itemArray0, (int) (short) 1);
        ds.Ordenacao.heapsort(itemArray0, (int) (byte) 0);
        ds.Ordenacao.shellsort(itemArray0, (-1));
        // The following exception was thrown during execution in test generation
        try {
            ds.Ordenacao.insercao(itemArray0, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray0);
    }

    @Test
    public void test2035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2035");
        ds.Item[] itemArray0 = new ds.Item[] {};
        ds.Ordenacao.heapsort(itemArray0, 0);
        ds.Ordenacao.insercao(itemArray0, 0);
        ds.Ordenacao.insercao(itemArray0, (int) (short) 0);
        ds.Ordenacao.selecao(itemArray0, 1);
        ds.Ordenacao.selecao(itemArray0, (int) (short) -1);
        ds.Ordenacao.heapsort(itemArray0, (int) (short) 1);
        ds.Ordenacao.selecao(itemArray0, (int) (short) 0);
        java.lang.Class<?> wildcardClass15 = itemArray0.getClass();
        org.junit.Assert.assertNotNull(itemArray0);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test2036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2036");
        ds.Item[] itemArray0 = new ds.Item[] {};
        ds.Ordenacao.heapsort(itemArray0, 0);
        ds.Ordenacao.insercao(itemArray0, 0);
        ds.Ordenacao.shellsort(itemArray0, (-1));
        ds.Ordenacao.selecao(itemArray0, (-1));
        ds.Ordenacao.heapsort(itemArray0, (int) (short) 0);
        ds.Ordenacao.heapsort(itemArray0, (int) (short) 1);
        ds.Ordenacao.heapsort(itemArray0, (int) (byte) 0);
        ds.Ordenacao.insercao(itemArray0, (int) (byte) -1);
        // The following exception was thrown during execution in test generation
        try {
            ds.Ordenacao.insercao(itemArray0, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray0);
    }

    @Test
    public void test2037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2037");
        ds.Item[] itemArray0 = new ds.Item[] {};
        ds.Ordenacao.heapsort(itemArray0, 0);
        ds.Ordenacao.insercao(itemArray0, 0);
        ds.Ordenacao.shellsort(itemArray0, (-1));
        ds.Ordenacao.selecao(itemArray0, (-1));
        ds.Ordenacao.heapsort(itemArray0, (int) (short) 0);
        ds.Ordenacao.shellsort(itemArray0, 0);
        ds.Ordenacao.shellsort(itemArray0, (int) (byte) 0);
        ds.Ordenacao.selecao(itemArray0, (-1));
        ds.Ordenacao.selecao(itemArray0, 0);
        ds.Ordenacao.shellsort(itemArray0, 0);
        // The following exception was thrown during execution in test generation
        try {
            ds.Ordenacao.selecao(itemArray0, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 2");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray0);
    }

    @Test
    public void test2038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2038");
        ds.Item[] itemArray0 = new ds.Item[] {};
        ds.Ordenacao.heapsort(itemArray0, 0);
        ds.Ordenacao.insercao(itemArray0, 0);
        ds.Ordenacao.selecao(itemArray0, 0);
        ds.Ordenacao.insercao(itemArray0, (-1));
        ds.Ordenacao.heapsort(itemArray0, (-1));
        ds.Ordenacao.insercao(itemArray0, 1);
        // The following exception was thrown during execution in test generation
        try {
            ds.Ordenacao.shellsort(itemArray0, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 41");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray0);
    }

    @Test
    public void test2039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2039");
        ds.Item[] itemArray0 = new ds.Item[] {};
        ds.Ordenacao.heapsort(itemArray0, 0);
        ds.Ordenacao.insercao(itemArray0, 0);
        ds.Ordenacao.insercao(itemArray0, (int) (short) 0);
        ds.Ordenacao.selecao(itemArray0, 1);
        ds.Ordenacao.selecao(itemArray0, (int) (short) -1);
        ds.Ordenacao.heapsort(itemArray0, (int) (short) 1);
        ds.Ordenacao.heapsort(itemArray0, (int) (short) 1);
        ds.Ordenacao.shellsort(itemArray0, (int) (short) -1);
        ds.Ordenacao.shellsort(itemArray0, (int) (short) -1);
        ds.Ordenacao.selecao(itemArray0, (int) (short) 1);
        java.lang.Class<?> wildcardClass21 = itemArray0.getClass();
        org.junit.Assert.assertNotNull(itemArray0);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test2040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2040");
        ds.Item[] itemArray0 = new ds.Item[] {};
        ds.Ordenacao.heapsort(itemArray0, 0);
        ds.Ordenacao.heapsort(itemArray0, 0);
        ds.Ordenacao.shellsort(itemArray0, (int) (byte) 1);
        ds.Ordenacao.insercao(itemArray0, (int) (byte) 1);
        ds.Ordenacao.insercao(itemArray0, (int) (byte) 1);
        org.junit.Assert.assertNotNull(itemArray0);
    }

    @Test
    public void test2041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2041");
        ds.Item[] itemArray0 = new ds.Item[] {};
        ds.Ordenacao.heapsort(itemArray0, 0);
        ds.Ordenacao.insercao(itemArray0, 0);
        ds.Ordenacao.selecao(itemArray0, 0);
        ds.Ordenacao.selecao(itemArray0, (int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            ds.Ordenacao.heapsort(itemArray0, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray0);
    }

    @Test
    public void test2042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2042");
        ds.Item[] itemArray0 = new ds.Item[] {};
        ds.Ordenacao.heapsort(itemArray0, 0);
        ds.Ordenacao.insercao(itemArray0, 0);
        ds.Ordenacao.selecao(itemArray0, 0);
        ds.Ordenacao.insercao(itemArray0, (-1));
        ds.Ordenacao.heapsort(itemArray0, (-1));
        ds.Ordenacao.selecao(itemArray0, (int) (short) 0);
        ds.Ordenacao.selecao(itemArray0, (int) (short) -1);
        org.junit.Assert.assertNotNull(itemArray0);
    }

    @Test
    public void test2043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2043");
        ds.Item[] itemArray0 = new ds.Item[] {};
        ds.Ordenacao.heapsort(itemArray0, 0);
        ds.Ordenacao.insercao(itemArray0, 0);
        ds.Ordenacao.insercao(itemArray0, (int) (short) 0);
        ds.Ordenacao.selecao(itemArray0, 1);
        ds.Ordenacao.shellsort(itemArray0, (int) (byte) -1);
        ds.Ordenacao.heapsort(itemArray0, (int) (byte) -1);
        ds.Ordenacao.heapsort(itemArray0, (int) (short) 0);
        ds.Ordenacao.heapsort(itemArray0, (int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            ds.Ordenacao.selecao(itemArray0, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 2");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray0);
    }

    @Test
    public void test2044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2044");
        ds.Item item0 = null;
        ds.Item[] itemArray1 = new ds.Item[] { item0 };
        ds.Ordenacao.heapsort(itemArray1, 0);
        ds.Ordenacao.heapsort(itemArray1, 1);
        ds.Ordenacao.heapsort(itemArray1, 1);
        ds.Ordenacao.selecao(itemArray1, (int) (short) 1);
        ds.Ordenacao.selecao(itemArray1, (int) (short) 1);
        ds.Ordenacao.insercao(itemArray1, (int) (short) 0);
        ds.Ordenacao.selecao(itemArray1, (-1));
        // The following exception was thrown during execution in test generation
        try {
            ds.Ordenacao.heapsort(itemArray1, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray1);
    }

    @Test
    public void test2045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2045");
        ds.Item[] itemArray0 = new ds.Item[] {};
        ds.Ordenacao.heapsort(itemArray0, 0);
        ds.Ordenacao.insercao(itemArray0, 0);
        ds.Ordenacao.insercao(itemArray0, (int) (short) 0);
        ds.Ordenacao.selecao(itemArray0, 1);
        ds.Ordenacao.selecao(itemArray0, (int) (short) -1);
        ds.Ordenacao.insercao(itemArray0, 0);
        ds.Ordenacao.heapsort(itemArray0, (int) (byte) 1);
        ds.Ordenacao.shellsort(itemArray0, 0);
        ds.Ordenacao.shellsort(itemArray0, (int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            ds.Ordenacao.selecao(itemArray0, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 2");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray0);
    }

    @Test
    public void test2046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2046");
        ds.Item[] itemArray0 = null;
        // The following exception was thrown during execution in test generation
        try {
            ds.Ordenacao.quicksort(itemArray0, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2047");
        ds.Item[] itemArray0 = new ds.Item[] {};
        ds.Ordenacao.heapsort(itemArray0, 0);
        ds.Ordenacao.insercao(itemArray0, 0);
        ds.Ordenacao.insercao(itemArray0, 0);
        ds.Ordenacao.selecao(itemArray0, (int) (short) -1);
        ds.Ordenacao.shellsort(itemArray0, 1);
        // The following exception was thrown during execution in test generation
        try {
            ds.Ordenacao.insercao(itemArray0, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray0);
    }

    @Test
    public void test2048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2048");
        ds.Item[] itemArray0 = new ds.Item[] {};
        ds.Ordenacao.heapsort(itemArray0, 0);
        ds.Ordenacao.insercao(itemArray0, 0);
        ds.Ordenacao.shellsort(itemArray0, (-1));
        ds.Ordenacao.insercao(itemArray0, (int) (byte) 1);
        ds.Ordenacao.selecao(itemArray0, 0);
        ds.Ordenacao.insercao(itemArray0, (int) (short) 0);
        ds.Ordenacao.shellsort(itemArray0, 0);
        org.junit.Assert.assertNotNull(itemArray0);
    }

    @Test
    public void test2049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2049");
        ds.Item[] itemArray0 = new ds.Item[] {};
        ds.Ordenacao.heapsort(itemArray0, 0);
        ds.Ordenacao.insercao(itemArray0, 0);
        ds.Ordenacao.selecao(itemArray0, 0);
        ds.Ordenacao.shellsort(itemArray0, (int) (byte) 1);
        ds.Ordenacao.selecao(itemArray0, 0);
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
    public void test2050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2050");
        ds.Item[] itemArray0 = new ds.Item[] {};
        ds.Ordenacao.heapsort(itemArray0, 0);
        ds.Ordenacao.insercao(itemArray0, 0);
        ds.Ordenacao.insercao(itemArray0, (int) (short) 0);
        ds.Ordenacao.selecao(itemArray0, 1);
        ds.Ordenacao.shellsort(itemArray0, (int) (short) 1);
        ds.Ordenacao.insercao(itemArray0, (int) (short) 1);
        ds.Ordenacao.selecao(itemArray0, 0);
        ds.Ordenacao.shellsort(itemArray0, (-1));
        java.lang.Class<?> wildcardClass17 = itemArray0.getClass();
        org.junit.Assert.assertNotNull(itemArray0);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test2051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2051");
        ds.Item[] itemArray0 = new ds.Item[] {};
        ds.Ordenacao.heapsort(itemArray0, 0);
        ds.Ordenacao.insercao(itemArray0, 0);
        ds.Ordenacao.shellsort(itemArray0, (-1));
        ds.Ordenacao.selecao(itemArray0, (-1));
        ds.Ordenacao.heapsort(itemArray0, (int) (short) 0);
        ds.Ordenacao.shellsort(itemArray0, (int) (short) 0);
        ds.Ordenacao.selecao(itemArray0, (int) (short) 1);
        ds.Ordenacao.heapsort(itemArray0, 0);
        ds.Ordenacao.heapsort(itemArray0, 1);
        org.junit.Assert.assertNotNull(itemArray0);
    }

    @Test
    public void test2052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2052");
        ds.Item[] itemArray0 = new ds.Item[] {};
        ds.Ordenacao.heapsort(itemArray0, 0);
        ds.Ordenacao.insercao(itemArray0, 0);
        ds.Ordenacao.shellsort(itemArray0, (-1));
        ds.Ordenacao.insercao(itemArray0, (int) (byte) 1);
        ds.Ordenacao.selecao(itemArray0, 0);
        ds.Ordenacao.shellsort(itemArray0, 1);
        ds.Ordenacao.insercao(itemArray0, (-1));
        ds.Ordenacao.shellsort(itemArray0, 1);
        // The following exception was thrown during execution in test generation
        try {
            ds.Ordenacao.shellsort(itemArray0, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 14");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray0);
    }

    @Test
    public void test2053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2053");
        ds.Item[] itemArray0 = new ds.Item[] {};
        ds.Ordenacao.heapsort(itemArray0, 0);
        ds.Ordenacao.insercao(itemArray0, 0);
        ds.Ordenacao.selecao(itemArray0, 0);
        ds.Ordenacao.insercao(itemArray0, (-1));
        ds.Ordenacao.insercao(itemArray0, (int) (byte) -1);
        ds.Ordenacao.heapsort(itemArray0, (int) (byte) 0);
        java.lang.Class<?> wildcardClass13 = itemArray0.getClass();
        org.junit.Assert.assertNotNull(itemArray0);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test2054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2054");
        ds.Item[] itemArray0 = new ds.Item[] {};
        ds.Ordenacao.heapsort(itemArray0, 0);
        ds.Ordenacao.heapsort(itemArray0, (int) (byte) 0);
        ds.Ordenacao.shellsort(itemArray0, 0);
        ds.Ordenacao.insercao(itemArray0, (-1));
        ds.Ordenacao.heapsort(itemArray0, (int) (byte) -1);
        ds.Ordenacao.selecao(itemArray0, (-1));
        // The following exception was thrown during execution in test generation
        try {
            ds.Ordenacao.heapsort(itemArray0, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray0);
    }

    @Test
    public void test2055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2055");
        ds.Item[] itemArray0 = new ds.Item[] {};
        ds.Ordenacao.heapsort(itemArray0, 0);
        ds.Ordenacao.insercao(itemArray0, 0);
        ds.Ordenacao.shellsort(itemArray0, (-1));
        ds.Ordenacao.insercao(itemArray0, (int) (byte) 1);
        ds.Ordenacao.selecao(itemArray0, 0);
        ds.Ordenacao.shellsort(itemArray0, 1);
        ds.Ordenacao.selecao(itemArray0, (-1));
        java.lang.Class<?> wildcardClass15 = itemArray0.getClass();
        org.junit.Assert.assertNotNull(itemArray0);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test2056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2056");
        ds.Item[] itemArray0 = new ds.Item[] {};
        ds.Ordenacao.shellsort(itemArray0, (int) (short) 1);
        ds.Ordenacao.selecao(itemArray0, 1);
        ds.Ordenacao.selecao(itemArray0, (int) (byte) 1);
        java.lang.Class<?> wildcardClass7 = itemArray0.getClass();
        org.junit.Assert.assertNotNull(itemArray0);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test2057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2057");
        ds.Item item0 = null;
        ds.Item[] itemArray1 = new ds.Item[] { item0 };
        ds.Ordenacao.heapsort(itemArray1, 0);
        ds.Ordenacao.heapsort(itemArray1, 1);
        ds.Ordenacao.heapsort(itemArray1, 1);
        ds.Ordenacao.selecao(itemArray1, (int) (short) 1);
        ds.Ordenacao.selecao(itemArray1, (int) (short) 1);
        ds.Ordenacao.insercao(itemArray1, 0);
        ds.Ordenacao.insercao(itemArray1, (int) (byte) 0);
        ds.Ordenacao.insercao(itemArray1, (int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            ds.Ordenacao.quicksort(itemArray1, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 16");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray1);
    }

    @Test
    public void test2058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2058");
        ds.Item[] itemArray0 = new ds.Item[] {};
        ds.Ordenacao.heapsort(itemArray0, 0);
        ds.Ordenacao.insercao(itemArray0, 0);
        ds.Ordenacao.shellsort(itemArray0, (-1));
        ds.Ordenacao.selecao(itemArray0, (-1));
        ds.Ordenacao.heapsort(itemArray0, (int) (short) 0);
        ds.Ordenacao.heapsort(itemArray0, 0);
        ds.Ordenacao.selecao(itemArray0, 0);
        ds.Ordenacao.insercao(itemArray0, (-1));
        ds.Ordenacao.heapsort(itemArray0, (int) (byte) 0);
        ds.Ordenacao.heapsort(itemArray0, (-1));
        // The following exception was thrown during execution in test generation
        try {
            ds.Ordenacao.insercao(itemArray0, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray0);
    }

    @Test
    public void test2059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2059");
        ds.Item[] itemArray0 = new ds.Item[] {};
        ds.Ordenacao.heapsort(itemArray0, 0);
        ds.Ordenacao.insercao(itemArray0, 0);
        ds.Ordenacao.selecao(itemArray0, 0);
        // The following exception was thrown during execution in test generation
        try {
            ds.Ordenacao.quicksort(itemArray0, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 0");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray0);
    }

    @Test
    public void test2060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2060");
        ds.Item[] itemArray0 = new ds.Item[] {};
        ds.Ordenacao.heapsort(itemArray0, 0);
        ds.Ordenacao.insercao(itemArray0, 0);
        ds.Ordenacao.shellsort(itemArray0, (-1));
        ds.Ordenacao.insercao(itemArray0, (int) (byte) 1);
        ds.Ordenacao.insercao(itemArray0, (int) (byte) 0);
        ds.Ordenacao.selecao(itemArray0, (int) (short) -1);
        // The following exception was thrown during execution in test generation
        try {
            ds.Ordenacao.selecao(itemArray0, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 2");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray0);
    }

    @Test
    public void test2061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2061");
        ds.Item[] itemArray0 = new ds.Item[] {};
        ds.Ordenacao.heapsort(itemArray0, 0);
        ds.Ordenacao.heapsort(itemArray0, (-1));
        ds.Ordenacao.shellsort(itemArray0, 0);
        ds.Ordenacao.shellsort(itemArray0, (int) (byte) 0);
        org.junit.Assert.assertNotNull(itemArray0);
    }

    @Test
    public void test2062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2062");
        ds.Item[] itemArray0 = new ds.Item[] {};
        ds.Ordenacao.heapsort(itemArray0, 0);
        ds.Ordenacao.insercao(itemArray0, 0);
        ds.Ordenacao.shellsort(itemArray0, (-1));
        ds.Ordenacao.insercao(itemArray0, (int) (byte) 1);
        ds.Ordenacao.insercao(itemArray0, (int) (byte) 0);
        ds.Ordenacao.selecao(itemArray0, (int) (short) -1);
        ds.Ordenacao.selecao(itemArray0, (int) (short) -1);
        ds.Ordenacao.insercao(itemArray0, (int) (byte) -1);
        ds.Ordenacao.shellsort(itemArray0, (int) (short) -1);
        ds.Ordenacao.heapsort(itemArray0, (int) (short) 0);
        org.junit.Assert.assertNotNull(itemArray0);
    }

    @Test
    public void test2063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2063");
        ds.Item[] itemArray0 = new ds.Item[] {};
        ds.Ordenacao.heapsort(itemArray0, 0);
        ds.Ordenacao.insercao(itemArray0, 0);
        ds.Ordenacao.shellsort(itemArray0, (-1));
        ds.Ordenacao.selecao(itemArray0, (-1));
        // The following exception was thrown during execution in test generation
        try {
            ds.Ordenacao.shellsort(itemArray0, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 41");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray0);
    }

    @Test
    public void test2064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2064");
        ds.Item[] itemArray0 = new ds.Item[] {};
        ds.Ordenacao.heapsort(itemArray0, 0);
        ds.Ordenacao.insercao(itemArray0, 0);
        ds.Ordenacao.shellsort(itemArray0, (-1));
        ds.Ordenacao.insercao(itemArray0, (int) (byte) 1);
        ds.Ordenacao.selecao(itemArray0, 0);
        ds.Ordenacao.selecao(itemArray0, (int) (byte) -1);
        ds.Ordenacao.selecao(itemArray0, 0);
        ds.Ordenacao.insercao(itemArray0, (int) (byte) 1);
        ds.Ordenacao.heapsort(itemArray0, (int) (short) 1);
        ds.Ordenacao.heapsort(itemArray0, (int) (short) -1);
        ds.Ordenacao.insercao(itemArray0, (int) (byte) -1);
        ds.Ordenacao.heapsort(itemArray0, 1);
        ds.Ordenacao.heapsort(itemArray0, (int) (byte) 1);
        ds.Ordenacao.shellsort(itemArray0, 0);
        ds.Ordenacao.selecao(itemArray0, 1);
        org.junit.Assert.assertNotNull(itemArray0);
    }

    @Test
    public void test2065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2065");
        ds.Item[] itemArray0 = new ds.Item[] {};
        ds.Ordenacao.shellsort(itemArray0, 1);
        ds.Ordenacao.selecao(itemArray0, 0);
        org.junit.Assert.assertNotNull(itemArray0);
    }

    @Test
    public void test2066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2066");
        ds.Item[] itemArray0 = new ds.Item[] {};
        ds.Ordenacao.heapsort(itemArray0, 0);
        ds.Ordenacao.insercao(itemArray0, 0);
        ds.Ordenacao.shellsort(itemArray0, (-1));
        ds.Ordenacao.selecao(itemArray0, (-1));
        ds.Ordenacao.shellsort(itemArray0, (int) (byte) 0);
        ds.Ordenacao.insercao(itemArray0, (int) (short) -1);
        ds.Ordenacao.insercao(itemArray0, (int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            ds.Ordenacao.insercao(itemArray0, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray0);
    }

    @Test
    public void test2067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2067");
        ds.Item[] itemArray0 = new ds.Item[] {};
        ds.Ordenacao.heapsort(itemArray0, 0);
        ds.Ordenacao.insercao(itemArray0, 0);
        ds.Ordenacao.shellsort(itemArray0, (-1));
        ds.Ordenacao.selecao(itemArray0, (-1));
        ds.Ordenacao.heapsort(itemArray0, (int) (short) 0);
        ds.Ordenacao.heapsort(itemArray0, 0);
        ds.Ordenacao.selecao(itemArray0, 0);
        ds.Ordenacao.insercao(itemArray0, (-1));
        ds.Ordenacao.heapsort(itemArray0, (int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            ds.Ordenacao.heapsort(itemArray0, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray0);
    }

    @Test
    public void test2068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2068");
        ds.Item[] itemArray0 = new ds.Item[] {};
        ds.Ordenacao.heapsort(itemArray0, 0);
        ds.Ordenacao.insercao(itemArray0, 0);
        ds.Ordenacao.insercao(itemArray0, (int) (short) 0);
        ds.Ordenacao.selecao(itemArray0, 1);
        ds.Ordenacao.selecao(itemArray0, (int) (short) -1);
        ds.Ordenacao.heapsort(itemArray0, (int) (short) 1);
        ds.Ordenacao.insercao(itemArray0, 0);
        ds.Ordenacao.insercao(itemArray0, (int) (short) 1);
        ds.Ordenacao.selecao(itemArray0, (int) (short) 1);
        ds.Ordenacao.insercao(itemArray0, (int) (short) 0);
        org.junit.Assert.assertNotNull(itemArray0);
    }

    @Test
    public void test2069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2069");
        ds.Item[] itemArray0 = new ds.Item[] {};
        ds.Ordenacao.heapsort(itemArray0, 0);
        ds.Ordenacao.shellsort(itemArray0, (int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            ds.Ordenacao.insercao(itemArray0, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray0);
    }

    @Test
    public void test2070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2070");
        ds.Item[] itemArray0 = new ds.Item[] {};
        ds.Ordenacao.heapsort(itemArray0, 0);
        ds.Ordenacao.insercao(itemArray0, 0);
        ds.Ordenacao.selecao(itemArray0, 0);
        ds.Ordenacao.shellsort(itemArray0, (int) (byte) 1);
        ds.Ordenacao.selecao(itemArray0, 0);
        // The following exception was thrown during execution in test generation
        try {
            ds.Ordenacao.insercao(itemArray0, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray0);
    }

    @Test
    public void test2071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2071");
        ds.Item[] itemArray0 = new ds.Item[] {};
        ds.Ordenacao.heapsort(itemArray0, 0);
        ds.Ordenacao.heapsort(itemArray0, 0);
        ds.Ordenacao.insercao(itemArray0, (int) (short) -1);
        ds.Ordenacao.heapsort(itemArray0, (int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            ds.Ordenacao.selecao(itemArray0, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 2");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray0);
    }

    @Test
    public void test2072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2072");
        ds.Item item0 = null;
        ds.Item[] itemArray1 = new ds.Item[] { item0 };
        ds.Ordenacao.selecao(itemArray1, (int) (short) 1);
        ds.Ordenacao.heapsort(itemArray1, 0);
        ds.Ordenacao.heapsort(itemArray1, 0);
        ds.Ordenacao.insercao(itemArray1, 0);
        // The following exception was thrown during execution in test generation
        try {
            ds.Ordenacao.shellsort(itemArray1, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 41");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray1);
    }

    @Test
    public void test2073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2073");
        ds.Item[] itemArray0 = new ds.Item[] {};
        ds.Ordenacao.heapsort(itemArray0, 0);
        ds.Ordenacao.insercao(itemArray0, 0);
        ds.Ordenacao.insercao(itemArray0, (int) (short) 0);
        ds.Ordenacao.selecao(itemArray0, 1);
        ds.Ordenacao.shellsort(itemArray0, (int) (byte) -1);
        ds.Ordenacao.heapsort(itemArray0, (int) (byte) -1);
        ds.Ordenacao.heapsort(itemArray0, (int) (short) 0);
        ds.Ordenacao.heapsort(itemArray0, (int) (short) 0);
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
    public void test2074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2074");
        ds.Item[] itemArray0 = null;
        // The following exception was thrown during execution in test generation
        try {
            ds.Ordenacao.insercao(itemArray0, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2075");
        ds.Item[] itemArray0 = new ds.Item[] {};
        ds.Ordenacao.heapsort(itemArray0, 0);
        ds.Ordenacao.insercao(itemArray0, 0);
        ds.Ordenacao.shellsort(itemArray0, (-1));
        ds.Ordenacao.insercao(itemArray0, (int) (byte) 1);
        ds.Ordenacao.selecao(itemArray0, 0);
        ds.Ordenacao.shellsort(itemArray0, 1);
        ds.Ordenacao.selecao(itemArray0, (int) (byte) -1);
        ds.Ordenacao.heapsort(itemArray0, (int) (short) 1);
        ds.Ordenacao.shellsort(itemArray0, (int) (short) -1);
        ds.Ordenacao.insercao(itemArray0, (int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            ds.Ordenacao.selecao(itemArray0, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 2");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray0);
    }

    @Test
    public void test2076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2076");
        ds.Item[] itemArray0 = new ds.Item[] {};
        ds.Ordenacao.heapsort(itemArray0, 0);
        ds.Ordenacao.insercao(itemArray0, 0);
        ds.Ordenacao.shellsort(itemArray0, (-1));
        ds.Ordenacao.selecao(itemArray0, (int) (byte) 0);
        ds.Ordenacao.insercao(itemArray0, (int) (byte) 0);
        ds.Ordenacao.shellsort(itemArray0, 0);
        ds.Ordenacao.insercao(itemArray0, 0);
        org.junit.Assert.assertNotNull(itemArray0);
    }

    @Test
    public void test2077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2077");
        ds.Item[] itemArray0 = new ds.Item[] {};
        ds.Ordenacao.heapsort(itemArray0, 0);
        ds.Ordenacao.heapsort(itemArray0, (-1));
        ds.Ordenacao.insercao(itemArray0, 0);
        ds.Ordenacao.selecao(itemArray0, 0);
        // The following exception was thrown during execution in test generation
        try {
            ds.Ordenacao.selecao(itemArray0, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 2");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray0);
    }

    @Test
    public void test2078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2078");
        ds.Item[] itemArray0 = new ds.Item[] {};
        ds.Ordenacao.heapsort(itemArray0, 0);
        ds.Ordenacao.insercao(itemArray0, 0);
        ds.Ordenacao.shellsort(itemArray0, (-1));
        ds.Ordenacao.insercao(itemArray0, (int) (byte) 1);
        ds.Ordenacao.selecao(itemArray0, 0);
        ds.Ordenacao.selecao(itemArray0, (int) (byte) -1);
        ds.Ordenacao.selecao(itemArray0, 0);
        ds.Ordenacao.insercao(itemArray0, (int) (byte) 1);
        ds.Ordenacao.insercao(itemArray0, (int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            ds.Ordenacao.heapsort(itemArray0, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray0);
    }

    @Test
    public void test2079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2079");
        ds.Item[] itemArray0 = new ds.Item[] {};
        ds.Ordenacao.heapsort(itemArray0, 0);
        ds.Ordenacao.insercao(itemArray0, 0);
        ds.Ordenacao.selecao(itemArray0, 0);
        ds.Ordenacao.insercao(itemArray0, (-1));
        ds.Ordenacao.heapsort(itemArray0, (-1));
        ds.Ordenacao.selecao(itemArray0, 1);
        ds.Ordenacao.heapsort(itemArray0, (int) (byte) -1);
        ds.Ordenacao.heapsort(itemArray0, 1);
        ds.Ordenacao.shellsort(itemArray0, (int) (short) -1);
        ds.Ordenacao.heapsort(itemArray0, (int) (byte) -1);
        java.lang.Class<?> wildcardClass21 = itemArray0.getClass();
        org.junit.Assert.assertNotNull(itemArray0);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test2080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2080");
        ds.Item[] itemArray0 = new ds.Item[] {};
        ds.Ordenacao.heapsort(itemArray0, 0);
        ds.Ordenacao.insercao(itemArray0, 0);
        ds.Ordenacao.selecao(itemArray0, 0);
        ds.Ordenacao.shellsort(itemArray0, 0);
        ds.Ordenacao.insercao(itemArray0, (int) (short) 0);
        ds.Ordenacao.selecao(itemArray0, (int) (short) 0);
        ds.Ordenacao.selecao(itemArray0, (int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            ds.Ordenacao.quicksort(itemArray0, (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray0);
    }

    @Test
    public void test2081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2081");
        ds.Item[] itemArray0 = new ds.Item[] {};
        ds.Ordenacao.heapsort(itemArray0, 0);
        ds.Ordenacao.insercao(itemArray0, 0);
        ds.Ordenacao.shellsort(itemArray0, (-1));
        ds.Ordenacao.insercao(itemArray0, (int) (byte) 1);
        ds.Ordenacao.selecao(itemArray0, 0);
        ds.Ordenacao.insercao(itemArray0, 0);
        ds.Ordenacao.shellsort(itemArray0, 0);
        ds.Ordenacao.insercao(itemArray0, (int) (short) -1);
        org.junit.Assert.assertNotNull(itemArray0);
    }

    @Test
    public void test2082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2082");
        ds.Item[] itemArray0 = new ds.Item[] {};
        ds.Ordenacao.heapsort(itemArray0, 0);
        ds.Ordenacao.insercao(itemArray0, 0);
        ds.Ordenacao.shellsort(itemArray0, (-1));
        ds.Ordenacao.insercao(itemArray0, (int) (byte) 1);
        ds.Ordenacao.selecao(itemArray0, 0);
        ds.Ordenacao.heapsort(itemArray0, (int) (short) 1);
        ds.Ordenacao.selecao(itemArray0, 0);
        ds.Ordenacao.shellsort(itemArray0, (int) (byte) -1);
        org.junit.Assert.assertNotNull(itemArray0);
    }

    @Test
    public void test2083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2083");
        ds.Item[] itemArray0 = new ds.Item[] {};
        ds.Ordenacao.heapsort(itemArray0, 0);
        ds.Ordenacao.insercao(itemArray0, 0);
        ds.Ordenacao.shellsort(itemArray0, (-1));
        ds.Ordenacao.selecao(itemArray0, (int) (byte) 0);
        ds.Ordenacao.insercao(itemArray0, (int) (byte) 0);
        ds.Ordenacao.shellsort(itemArray0, 0);
        // The following exception was thrown during execution in test generation
        try {
            ds.Ordenacao.quicksort(itemArray0, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 49");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray0);
    }

    @Test
    public void test2084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2084");
        ds.Item[] itemArray0 = new ds.Item[] {};
        ds.Ordenacao.heapsort(itemArray0, 0);
        ds.Ordenacao.heapsort(itemArray0, (int) (byte) 0);
        ds.Ordenacao.shellsort(itemArray0, 0);
        ds.Ordenacao.insercao(itemArray0, (-1));
        ds.Ordenacao.insercao(itemArray0, 0);
        ds.Ordenacao.shellsort(itemArray0, 1);
        java.lang.Class<?> wildcardClass13 = itemArray0.getClass();
        org.junit.Assert.assertNotNull(itemArray0);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test2085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2085");
        ds.Item[] itemArray0 = new ds.Item[] {};
        ds.Ordenacao.heapsort(itemArray0, 0);
        ds.Ordenacao.insercao(itemArray0, 0);
        ds.Ordenacao.selecao(itemArray0, 0);
        ds.Ordenacao.insercao(itemArray0, (-1));
        ds.Ordenacao.heapsort(itemArray0, (-1));
        ds.Ordenacao.selecao(itemArray0, 1);
        ds.Ordenacao.heapsort(itemArray0, (int) (byte) -1);
        ds.Ordenacao.shellsort(itemArray0, (-1));
        // The following exception was thrown during execution in test generation
        try {
            ds.Ordenacao.quicksort(itemArray0, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 16");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray0);
    }

    @Test
    public void test2086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2086");
        ds.Item[] itemArray0 = new ds.Item[] {};
        ds.Ordenacao.heapsort(itemArray0, 0);
        ds.Ordenacao.insercao(itemArray0, 0);
        ds.Ordenacao.insercao(itemArray0, (int) (short) 0);
        ds.Ordenacao.selecao(itemArray0, 1);
        ds.Ordenacao.selecao(itemArray0, (int) (short) -1);
        ds.Ordenacao.insercao(itemArray0, 0);
        ds.Ordenacao.heapsort(itemArray0, (int) (short) -1);
        ds.Ordenacao.shellsort(itemArray0, 0);
        ds.Ordenacao.insercao(itemArray0, (int) (short) 0);
        ds.Ordenacao.selecao(itemArray0, (int) (short) -1);
        ds.Ordenacao.insercao(itemArray0, 0);
        // The following exception was thrown during execution in test generation
        try {
            ds.Ordenacao.insercao(itemArray0, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray0);
    }

    @Test
    public void test2087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2087");
        ds.Item[] itemArray0 = new ds.Item[] {};
        ds.Ordenacao.heapsort(itemArray0, 0);
        ds.Ordenacao.heapsort(itemArray0, (int) (byte) 0);
        ds.Ordenacao.shellsort(itemArray0, 0);
        ds.Ordenacao.selecao(itemArray0, (int) (short) 0);
        org.junit.Assert.assertNotNull(itemArray0);
    }

    @Test
    public void test2088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2088");
        ds.Item[] itemArray0 = new ds.Item[] {};
        ds.Ordenacao.heapsort(itemArray0, 0);
        ds.Ordenacao.insercao(itemArray0, 0);
        ds.Ordenacao.shellsort(itemArray0, (-1));
        ds.Ordenacao.insercao(itemArray0, (int) (byte) 1);
        ds.Ordenacao.selecao(itemArray0, 0);
        ds.Ordenacao.selecao(itemArray0, (int) (byte) -1);
        ds.Ordenacao.selecao(itemArray0, 0);
        ds.Ordenacao.insercao(itemArray0, (int) (byte) 1);
        ds.Ordenacao.heapsort(itemArray0, (int) (short) 1);
        ds.Ordenacao.heapsort(itemArray0, (int) (short) -1);
        ds.Ordenacao.insercao(itemArray0, 1);
        ds.Ordenacao.selecao(itemArray0, (int) (byte) 0);
        ds.Ordenacao.shellsort(itemArray0, 0);
        // The following exception was thrown during execution in test generation
        try {
            ds.Ordenacao.heapsort(itemArray0, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray0);
    }

    @Test
    public void test2089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2089");
        ds.Item item0 = null;
        ds.Item[] itemArray1 = new ds.Item[] { item0 };
        ds.Ordenacao.heapsort(itemArray1, 0);
        ds.Ordenacao.heapsort(itemArray1, 1);
        ds.Ordenacao.heapsort(itemArray1, 1);
        ds.Ordenacao.selecao(itemArray1, (int) (short) 1);
        ds.Ordenacao.selecao(itemArray1, (int) (short) 1);
        ds.Ordenacao.insercao(itemArray1, 0);
        ds.Ordenacao.heapsort(itemArray1, (int) (short) -1);
        // The following exception was thrown during execution in test generation
        try {
            ds.Ordenacao.shellsort(itemArray1, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 41");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray1);
    }

    @Test
    public void test2090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2090");
        ds.Item[] itemArray0 = new ds.Item[] {};
        ds.Ordenacao.heapsort(itemArray0, 0);
        ds.Ordenacao.insercao(itemArray0, 0);
        ds.Ordenacao.shellsort(itemArray0, (-1));
        ds.Ordenacao.selecao(itemArray0, (-1));
        ds.Ordenacao.heapsort(itemArray0, (int) (short) 0);
        ds.Ordenacao.shellsort(itemArray0, (int) (short) 0);
        ds.Ordenacao.insercao(itemArray0, 0);
        ds.Ordenacao.heapsort(itemArray0, 1);
        ds.Ordenacao.insercao(itemArray0, (int) (short) 0);
        org.junit.Assert.assertNotNull(itemArray0);
    }

    @Test
    public void test2091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2091");
        ds.Item[] itemArray0 = new ds.Item[] {};
        ds.Ordenacao.heapsort(itemArray0, 0);
        ds.Ordenacao.insercao(itemArray0, 0);
        ds.Ordenacao.shellsort(itemArray0, (-1));
        ds.Ordenacao.insercao(itemArray0, (int) (byte) 1);
        ds.Ordenacao.selecao(itemArray0, 0);
        ds.Ordenacao.selecao(itemArray0, (int) (byte) -1);
        ds.Ordenacao.selecao(itemArray0, 0);
        ds.Ordenacao.insercao(itemArray0, (int) (byte) 1);
        ds.Ordenacao.heapsort(itemArray0, (int) (short) 1);
        ds.Ordenacao.heapsort(itemArray0, (int) (short) -1);
        ds.Ordenacao.insercao(itemArray0, (int) (byte) -1);
        ds.Ordenacao.heapsort(itemArray0, 1);
        ds.Ordenacao.insercao(itemArray0, 0);
        ds.Ordenacao.heapsort(itemArray0, (int) (byte) 0);
        org.junit.Assert.assertNotNull(itemArray0);
    }

    @Test
    public void test2092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2092");
        ds.Item[] itemArray0 = new ds.Item[] {};
        ds.Ordenacao.heapsort(itemArray0, 0);
        ds.Ordenacao.insercao(itemArray0, 0);
        ds.Ordenacao.insercao(itemArray0, (int) (short) 0);
        ds.Ordenacao.selecao(itemArray0, 1);
        ds.Ordenacao.shellsort(itemArray0, (int) (short) 1);
        ds.Ordenacao.insercao(itemArray0, (int) (short) 1);
        ds.Ordenacao.insercao(itemArray0, (int) (byte) 1);
        org.junit.Assert.assertNotNull(itemArray0);
    }

    @Test
    public void test2093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2093");
        ds.Item[] itemArray0 = new ds.Item[] {};
        ds.Ordenacao.heapsort(itemArray0, 0);
        ds.Ordenacao.insercao(itemArray0, 0);
        ds.Ordenacao.selecao(itemArray0, 0);
        ds.Ordenacao.selecao(itemArray0, (int) (byte) 0);
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
    public void test2094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2094");
        ds.Item[] itemArray0 = new ds.Item[] {};
        ds.Ordenacao.heapsort(itemArray0, 0);
        ds.Ordenacao.insercao(itemArray0, 0);
        ds.Ordenacao.insercao(itemArray0, (int) (short) 0);
        ds.Ordenacao.selecao(itemArray0, 1);
        ds.Ordenacao.shellsort(itemArray0, (int) (short) 1);
        ds.Ordenacao.insercao(itemArray0, (int) (short) 1);
        ds.Ordenacao.selecao(itemArray0, 0);
        ds.Ordenacao.insercao(itemArray0, (-1));
        org.junit.Assert.assertNotNull(itemArray0);
    }

    @Test
    public void test2095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2095");
        ds.Item[] itemArray0 = new ds.Item[] {};
        ds.Ordenacao.heapsort(itemArray0, 0);
        ds.Ordenacao.insercao(itemArray0, 0);
        ds.Ordenacao.selecao(itemArray0, 0);
        ds.Ordenacao.shellsort(itemArray0, (int) (byte) 1);
        ds.Ordenacao.insercao(itemArray0, 0);
        ds.Ordenacao.shellsort(itemArray0, (int) (short) 0);
        ds.Ordenacao.insercao(itemArray0, (int) (short) 0);
        ds.Ordenacao.heapsort(itemArray0, 1);
        ds.Ordenacao.shellsort(itemArray0, 1);
        ds.Ordenacao.heapsort(itemArray0, (int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            ds.Ordenacao.quicksort(itemArray0, (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray0);
    }

    @Test
    public void test2096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2096");
        ds.Item[] itemArray0 = new ds.Item[] {};
        ds.Ordenacao.heapsort(itemArray0, 0);
        ds.Ordenacao.heapsort(itemArray0, (int) (byte) 0);
        ds.Ordenacao.shellsort(itemArray0, 0);
        ds.Ordenacao.insercao(itemArray0, (-1));
        ds.Ordenacao.insercao(itemArray0, 0);
        ds.Ordenacao.selecao(itemArray0, (int) (short) -1);
        org.junit.Assert.assertNotNull(itemArray0);
    }

    @Test
    public void test2097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2097");
        ds.Item[] itemArray0 = new ds.Item[] {};
        ds.Ordenacao.heapsort(itemArray0, 0);
        ds.Ordenacao.insercao(itemArray0, 0);
        ds.Ordenacao.selecao(itemArray0, 0);
        ds.Ordenacao.shellsort(itemArray0, (int) (byte) 1);
        ds.Ordenacao.insercao(itemArray0, 0);
        ds.Ordenacao.shellsort(itemArray0, (int) (short) 0);
        ds.Ordenacao.insercao(itemArray0, (int) (short) 0);
        ds.Ordenacao.heapsort(itemArray0, 1);
        ds.Ordenacao.shellsort(itemArray0, 1);
        ds.Ordenacao.heapsort(itemArray0, (-1));
        java.lang.Class<?> wildcardClass21 = itemArray0.getClass();
        org.junit.Assert.assertNotNull(itemArray0);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test2098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2098");
        ds.Item item0 = null;
        ds.Item[] itemArray1 = new ds.Item[] { item0 };
        ds.Ordenacao.heapsort(itemArray1, 0);
        ds.Ordenacao.heapsort(itemArray1, 1);
        ds.Ordenacao.heapsort(itemArray1, 1);
        ds.Ordenacao.insercao(itemArray1, (-1));
        org.junit.Assert.assertNotNull(itemArray1);
    }

    @Test
    public void test2099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2099");
        ds.Item[] itemArray0 = new ds.Item[] {};
        ds.Ordenacao.heapsort(itemArray0, 0);
        ds.Ordenacao.insercao(itemArray0, 0);
        ds.Ordenacao.insercao(itemArray0, (int) (short) 0);
        ds.Ordenacao.insercao(itemArray0, 1);
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
    public void test2100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2100");
        ds.Item[] itemArray0 = new ds.Item[] {};
        ds.Ordenacao.heapsort(itemArray0, 0);
        ds.Ordenacao.insercao(itemArray0, 0);
        ds.Ordenacao.shellsort(itemArray0, (-1));
        ds.Ordenacao.insercao(itemArray0, (int) (byte) 1);
        ds.Ordenacao.selecao(itemArray0, 0);
        ds.Ordenacao.insercao(itemArray0, 0);
        ds.Ordenacao.shellsort(itemArray0, 0);
        // The following exception was thrown during execution in test generation
        try {
            ds.Ordenacao.heapsort(itemArray0, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray0);
    }

    @Test
    public void test2101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2101");
        ds.Item[] itemArray0 = new ds.Item[] {};
        ds.Ordenacao.heapsort(itemArray0, 0);
        ds.Ordenacao.insercao(itemArray0, 0);
        ds.Ordenacao.insercao(itemArray0, (int) (short) 0);
        ds.Ordenacao.selecao(itemArray0, 1);
        ds.Ordenacao.selecao(itemArray0, (int) (short) -1);
        ds.Ordenacao.insercao(itemArray0, 0);
        ds.Ordenacao.heapsort(itemArray0, (int) (short) -1);
        ds.Ordenacao.shellsort(itemArray0, (int) (short) 0);
        ds.Ordenacao.heapsort(itemArray0, (int) (byte) 0);
        ds.Ordenacao.shellsort(itemArray0, (int) (short) 0);
        ds.Ordenacao.selecao(itemArray0, (-1));
        ds.Ordenacao.insercao(itemArray0, 0);
        ds.Ordenacao.selecao(itemArray0, (int) (byte) 0);
        org.junit.Assert.assertNotNull(itemArray0);
    }

    @Test
    public void test2102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2102");
        ds.Item[] itemArray0 = new ds.Item[] {};
        ds.Ordenacao.shellsort(itemArray0, 0);
        ds.Ordenacao.shellsort(itemArray0, (int) (byte) -1);
        ds.Ordenacao.selecao(itemArray0, (-1));
        ds.Ordenacao.selecao(itemArray0, (int) (byte) -1);
        ds.Ordenacao.insercao(itemArray0, (int) (short) -1);
        // The following exception was thrown during execution in test generation
        try {
            ds.Ordenacao.quicksort(itemArray0, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 16");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray0);
    }

    @Test
    public void test2103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2103");
        ds.Item[] itemArray0 = new ds.Item[] {};
        ds.Ordenacao.heapsort(itemArray0, 0);
        ds.Ordenacao.insercao(itemArray0, 0);
        ds.Ordenacao.insercao(itemArray0, (int) (short) 0);
        ds.Ordenacao.selecao(itemArray0, 1);
        ds.Ordenacao.selecao(itemArray0, (int) (short) -1);
        ds.Ordenacao.insercao(itemArray0, 0);
        ds.Ordenacao.heapsort(itemArray0, (int) (byte) 1);
        ds.Ordenacao.shellsort(itemArray0, 0);
        ds.Ordenacao.selecao(itemArray0, (int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            ds.Ordenacao.heapsort(itemArray0, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray0);
    }

    @Test
    public void test2104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2104");
        ds.Item[] itemArray0 = new ds.Item[] {};
        ds.Ordenacao.heapsort(itemArray0, 0);
        ds.Ordenacao.insercao(itemArray0, 0);
        ds.Ordenacao.shellsort(itemArray0, (-1));
        ds.Ordenacao.insercao(itemArray0, (int) (byte) 1);
        ds.Ordenacao.selecao(itemArray0, 0);
        ds.Ordenacao.shellsort(itemArray0, 1);
        ds.Ordenacao.selecao(itemArray0, (int) (byte) -1);
        ds.Ordenacao.heapsort(itemArray0, (int) (short) 1);
        ds.Ordenacao.shellsort(itemArray0, (int) (short) -1);
        // The following exception was thrown during execution in test generation
        try {
            ds.Ordenacao.selecao(itemArray0, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 2");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray0);
    }

    @Test
    public void test2105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2105");
        ds.Item[] itemArray0 = new ds.Item[] {};
        ds.Ordenacao.heapsort(itemArray0, 0);
        ds.Ordenacao.heapsort(itemArray0, 0);
        ds.Ordenacao.insercao(itemArray0, (int) (short) -1);
        ds.Ordenacao.heapsort(itemArray0, (int) (byte) 0);
        ds.Ordenacao.selecao(itemArray0, (int) (short) 0);
        ds.Ordenacao.heapsort(itemArray0, 0);
        ds.Ordenacao.insercao(itemArray0, 1);
        // The following exception was thrown during execution in test generation
        try {
            ds.Ordenacao.quicksort(itemArray0, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray0);
    }

    @Test
    public void test2106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2106");
        ds.Item[] itemArray0 = null;
        ds.Ordenacao.selecao(itemArray0, (-1));
    }

    @Test
    public void test2107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2107");
        ds.Item[] itemArray0 = new ds.Item[] {};
        ds.Ordenacao.heapsort(itemArray0, 0);
        ds.Ordenacao.insercao(itemArray0, 0);
        ds.Ordenacao.shellsort(itemArray0, (-1));
        ds.Ordenacao.insercao(itemArray0, (int) (byte) 1);
        ds.Ordenacao.insercao(itemArray0, (int) (byte) 0);
        ds.Ordenacao.selecao(itemArray0, (int) (short) -1);
        ds.Ordenacao.insercao(itemArray0, (int) (short) -1);
        ds.Ordenacao.heapsort(itemArray0, (int) (short) 0);
        ds.Ordenacao.selecao(itemArray0, (int) (short) -1);
        ds.Ordenacao.heapsort(itemArray0, (-1));
        org.junit.Assert.assertNotNull(itemArray0);
    }

    @Test
    public void test2108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2108");
        ds.Item[] itemArray0 = new ds.Item[] {};
        ds.Ordenacao.heapsort(itemArray0, 0);
        ds.Ordenacao.insercao(itemArray0, 0);
        ds.Ordenacao.shellsort(itemArray0, (-1));
        ds.Ordenacao.insercao(itemArray0, (int) (byte) 1);
        ds.Ordenacao.selecao(itemArray0, 0);
        ds.Ordenacao.selecao(itemArray0, (int) (byte) -1);
        ds.Ordenacao.selecao(itemArray0, 0);
        ds.Ordenacao.insercao(itemArray0, (int) (byte) 1);
        ds.Ordenacao.heapsort(itemArray0, (int) (short) 1);
        ds.Ordenacao.heapsort(itemArray0, (int) (short) -1);
        ds.Ordenacao.insercao(itemArray0, (int) (byte) -1);
        ds.Ordenacao.heapsort(itemArray0, 1);
        ds.Ordenacao.heapsort(itemArray0, (int) (byte) 1);
        ds.Ordenacao.shellsort(itemArray0, 0);
        ds.Ordenacao.insercao(itemArray0, (int) (short) -1);
        ds.Ordenacao.heapsort(itemArray0, (int) (short) -1);
        java.lang.Class<?> wildcardClass33 = itemArray0.getClass();
        org.junit.Assert.assertNotNull(itemArray0);
        org.junit.Assert.assertNotNull(wildcardClass33);
    }

    @Test
    public void test2109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2109");
        ds.Item[] itemArray0 = new ds.Item[] {};
        ds.Ordenacao.heapsort(itemArray0, 0);
        ds.Ordenacao.insercao(itemArray0, 0);
        ds.Ordenacao.selecao(itemArray0, 0);
        ds.Ordenacao.insercao(itemArray0, (-1));
        ds.Ordenacao.heapsort(itemArray0, (-1));
        ds.Ordenacao.selecao(itemArray0, 1);
        ds.Ordenacao.shellsort(itemArray0, 0);
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
    public void test2110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2110");
        ds.Item[] itemArray0 = new ds.Item[] {};
        ds.Ordenacao.heapsort(itemArray0, 0);
        ds.Ordenacao.insercao(itemArray0, 0);
        ds.Ordenacao.insercao(itemArray0, (int) (short) 0);
        ds.Ordenacao.selecao(itemArray0, 1);
        ds.Ordenacao.shellsort(itemArray0, (int) (short) 1);
        ds.Ordenacao.insercao(itemArray0, (int) (short) 1);
        ds.Ordenacao.selecao(itemArray0, 0);
        ds.Ordenacao.shellsort(itemArray0, (-1));
        ds.Ordenacao.selecao(itemArray0, (int) (byte) -1);
        ds.Ordenacao.heapsort(itemArray0, (int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            ds.Ordenacao.heapsort(itemArray0, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray0);
    }

    @Test
    public void test2111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2111");
        ds.Item item0 = null;
        ds.Item[] itemArray1 = new ds.Item[] { item0 };
        ds.Ordenacao.heapsort(itemArray1, 0);
        ds.Ordenacao.heapsort(itemArray1, 1);
        ds.Ordenacao.heapsort(itemArray1, 1);
        ds.Ordenacao.selecao(itemArray1, (int) (short) 1);
        ds.Ordenacao.selecao(itemArray1, (int) (short) 1);
        ds.Ordenacao.insercao(itemArray1, (int) (byte) -1);
        ds.Ordenacao.selecao(itemArray1, (int) (short) 1);
        ds.Ordenacao.heapsort(itemArray1, (int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            ds.Ordenacao.shellsort(itemArray1, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 41");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray1);
    }

    @Test
    public void test2112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2112");
        ds.Item[] itemArray0 = new ds.Item[] {};
        ds.Ordenacao.heapsort(itemArray0, 0);
        ds.Ordenacao.insercao(itemArray0, 0);
        ds.Ordenacao.selecao(itemArray0, 0);
        ds.Ordenacao.shellsort(itemArray0, (int) (short) 1);
        ds.Ordenacao.insercao(itemArray0, 0);
        ds.Ordenacao.selecao(itemArray0, (int) (byte) -1);
        ds.Ordenacao.insercao(itemArray0, 0);
        ds.Ordenacao.selecao(itemArray0, 0);
        java.lang.Class<?> wildcardClass17 = itemArray0.getClass();
        org.junit.Assert.assertNotNull(itemArray0);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test2113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2113");
        ds.Item[] itemArray0 = new ds.Item[] {};
        ds.Ordenacao.heapsort(itemArray0, 0);
        ds.Ordenacao.insercao(itemArray0, 0);
        ds.Ordenacao.shellsort(itemArray0, (-1));
        ds.Ordenacao.selecao(itemArray0, (-1));
        ds.Ordenacao.heapsort(itemArray0, (int) (short) 0);
        ds.Ordenacao.heapsort(itemArray0, (int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            ds.Ordenacao.selecao(itemArray0, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 2");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray0);
    }

    @Test
    public void test2114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2114");
        ds.Item[] itemArray0 = new ds.Item[] {};
        ds.Ordenacao.heapsort(itemArray0, 0);
        ds.Ordenacao.insercao(itemArray0, 0);
        ds.Ordenacao.selecao(itemArray0, 0);
        ds.Ordenacao.insercao(itemArray0, (-1));
        ds.Ordenacao.heapsort(itemArray0, (-1));
        ds.Ordenacao.insercao(itemArray0, 0);
        ds.Ordenacao.shellsort(itemArray0, 0);
        // The following exception was thrown during execution in test generation
        try {
            ds.Ordenacao.quicksort(itemArray0, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 16");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray0);
    }

    @Test
    public void test2115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2115");
        ds.Item[] itemArray0 = new ds.Item[] {};
        ds.Ordenacao.heapsort(itemArray0, 0);
        ds.Ordenacao.insercao(itemArray0, 0);
        ds.Ordenacao.shellsort(itemArray0, (-1));
        ds.Ordenacao.selecao(itemArray0, (-1));
        ds.Ordenacao.heapsort(itemArray0, (int) (short) 0);
        ds.Ordenacao.shellsort(itemArray0, (int) (short) 0);
        ds.Ordenacao.selecao(itemArray0, (int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            ds.Ordenacao.selecao(itemArray0, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 2");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray0);
    }

    @Test
    public void test2116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2116");
        ds.Item[] itemArray0 = new ds.Item[] {};
        ds.Ordenacao.heapsort(itemArray0, 0);
        ds.Ordenacao.insercao(itemArray0, 0);
        ds.Ordenacao.shellsort(itemArray0, (-1));
        ds.Ordenacao.insercao(itemArray0, (int) (byte) 1);
        ds.Ordenacao.selecao(itemArray0, 0);
        ds.Ordenacao.shellsort(itemArray0, 1);
        ds.Ordenacao.insercao(itemArray0, (-1));
        ds.Ordenacao.insercao(itemArray0, (int) (byte) 0);
        ds.Ordenacao.heapsort(itemArray0, (int) (byte) 1);
        ds.Ordenacao.insercao(itemArray0, 0);
        ds.Ordenacao.shellsort(itemArray0, (-1));
        // The following exception was thrown during execution in test generation
        try {
            ds.Ordenacao.shellsort(itemArray0, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 41");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray0);
    }

    @Test
    public void test2117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2117");
        ds.Item[] itemArray0 = new ds.Item[] {};
        ds.Ordenacao.heapsort(itemArray0, 0);
        ds.Ordenacao.insercao(itemArray0, 0);
        ds.Ordenacao.insercao(itemArray0, (int) (short) 0);
        ds.Ordenacao.selecao(itemArray0, 1);
        ds.Ordenacao.selecao(itemArray0, (int) (short) -1);
        ds.Ordenacao.heapsort(itemArray0, (int) (short) 1);
        ds.Ordenacao.insercao(itemArray0, 0);
        // The following exception was thrown during execution in test generation
        try {
            ds.Ordenacao.heapsort(itemArray0, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray0);
    }

    @Test
    public void test2118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2118");
        ds.Item item0 = null;
        ds.Item[] itemArray1 = new ds.Item[] { item0 };
        ds.Ordenacao.heapsort(itemArray1, 0);
        ds.Ordenacao.heapsort(itemArray1, (-1));
        // The following exception was thrown during execution in test generation
        try {
            ds.Ordenacao.shellsort(itemArray1, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 41");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray1);
    }

    @Test
    public void test2119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2119");
        ds.Item item0 = null;
        ds.Item[] itemArray1 = new ds.Item[] { item0 };
        ds.Ordenacao.heapsort(itemArray1, 0);
        ds.Ordenacao.heapsort(itemArray1, 1);
        ds.Ordenacao.shellsort(itemArray1, (-1));
        ds.Ordenacao.selecao(itemArray1, (int) (byte) -1);
        java.lang.Class<?> wildcardClass10 = itemArray1.getClass();
        org.junit.Assert.assertNotNull(itemArray1);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test2120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2120");
        ds.Item item0 = null;
        ds.Item[] itemArray1 = new ds.Item[] { item0 };
        ds.Ordenacao.heapsort(itemArray1, 0);
        ds.Ordenacao.heapsort(itemArray1, 1);
        ds.Ordenacao.heapsort(itemArray1, 1);
        ds.Ordenacao.selecao(itemArray1, (int) (short) 1);
        ds.Ordenacao.selecao(itemArray1, (-1));
        ds.Ordenacao.selecao(itemArray1, (int) (byte) -1);
        ds.Ordenacao.selecao(itemArray1, 0);
        // The following exception was thrown during execution in test generation
        try {
            ds.Ordenacao.heapsort(itemArray1, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray1);
    }

    @Test
    public void test2121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2121");
        ds.Item[] itemArray0 = new ds.Item[] {};
        ds.Ordenacao.heapsort(itemArray0, 0);
        ds.Ordenacao.insercao(itemArray0, 0);
        ds.Ordenacao.shellsort(itemArray0, (-1));
        ds.Ordenacao.insercao(itemArray0, (int) (byte) 1);
        ds.Ordenacao.selecao(itemArray0, 0);
        ds.Ordenacao.selecao(itemArray0, (int) (byte) -1);
        ds.Ordenacao.selecao(itemArray0, 0);
        ds.Ordenacao.insercao(itemArray0, (int) (byte) 1);
        ds.Ordenacao.heapsort(itemArray0, (int) (short) 1);
        ds.Ordenacao.heapsort(itemArray0, (int) (short) -1);
        ds.Ordenacao.insercao(itemArray0, (int) (byte) -1);
        // The following exception was thrown during execution in test generation
        try {
            ds.Ordenacao.quicksort(itemArray0, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 49");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray0);
    }

    @Test
    public void test2122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2122");
        ds.Item[] itemArray0 = new ds.Item[] {};
        ds.Ordenacao.heapsort(itemArray0, 0);
        ds.Ordenacao.insercao(itemArray0, 0);
        ds.Ordenacao.selecao(itemArray0, 0);
        ds.Ordenacao.shellsort(itemArray0, (int) (byte) 1);
        ds.Ordenacao.insercao(itemArray0, 0);
        ds.Ordenacao.insercao(itemArray0, (int) (short) -1);
        ds.Ordenacao.shellsort(itemArray0, (int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            ds.Ordenacao.insercao(itemArray0, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray0);
    }

    @Test
    public void test2123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2123");
        ds.Item[] itemArray0 = new ds.Item[] {};
        ds.Ordenacao.heapsort(itemArray0, 0);
        ds.Ordenacao.insercao(itemArray0, 0);
        ds.Ordenacao.shellsort(itemArray0, (-1));
        ds.Ordenacao.insercao(itemArray0, (int) (byte) 1);
        ds.Ordenacao.selecao(itemArray0, 1);
        ds.Ordenacao.shellsort(itemArray0, (int) (short) 1);
        ds.Ordenacao.insercao(itemArray0, 1);
        ds.Ordenacao.selecao(itemArray0, 0);
        org.junit.Assert.assertNotNull(itemArray0);
    }

    @Test
    public void test2124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2124");
        ds.Item[] itemArray0 = new ds.Item[] {};
        ds.Ordenacao.shellsort(itemArray0, 0);
        ds.Ordenacao.shellsort(itemArray0, (int) (byte) -1);
        ds.Ordenacao.selecao(itemArray0, (-1));
        ds.Ordenacao.selecao(itemArray0, (int) (byte) -1);
        ds.Ordenacao.insercao(itemArray0, (int) (short) -1);
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
    public void test2125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2125");
        ds.Item[] itemArray0 = new ds.Item[] {};
        ds.Ordenacao.heapsort(itemArray0, 0);
        ds.Ordenacao.insercao(itemArray0, 0);
        ds.Ordenacao.shellsort(itemArray0, (-1));
        ds.Ordenacao.insercao(itemArray0, (int) (byte) 1);
        ds.Ordenacao.selecao(itemArray0, 0);
        ds.Ordenacao.shellsort(itemArray0, 1);
        ds.Ordenacao.insercao(itemArray0, (-1));
        ds.Ordenacao.insercao(itemArray0, (int) (byte) 0);
        ds.Ordenacao.heapsort(itemArray0, (int) (byte) 1);
        ds.Ordenacao.shellsort(itemArray0, 0);
        // The following exception was thrown during execution in test generation
        try {
            ds.Ordenacao.shellsort(itemArray0, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 41");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray0);
    }

    @Test
    public void test2126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2126");
        ds.Item[] itemArray0 = new ds.Item[] {};
        ds.Ordenacao.heapsort(itemArray0, 0);
        ds.Ordenacao.insercao(itemArray0, 0);
        ds.Ordenacao.insercao(itemArray0, (int) (short) 0);
        ds.Ordenacao.selecao(itemArray0, 1);
        ds.Ordenacao.selecao(itemArray0, (int) (short) -1);
        ds.Ordenacao.insercao(itemArray0, 0);
        ds.Ordenacao.selecao(itemArray0, 0);
        ds.Ordenacao.shellsort(itemArray0, (int) (short) -1);
        ds.Ordenacao.selecao(itemArray0, (int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            ds.Ordenacao.shellsort(itemArray0, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 41");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray0);
    }

    @Test
    public void test2127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2127");
        ds.Item[] itemArray0 = new ds.Item[] {};
        ds.Ordenacao.heapsort(itemArray0, 0);
        ds.Ordenacao.insercao(itemArray0, 0);
        ds.Ordenacao.heapsort(itemArray0, 1);
        ds.Ordenacao.shellsort(itemArray0, (int) (short) 1);
        ds.Ordenacao.selecao(itemArray0, 0);
        ds.Ordenacao.selecao(itemArray0, (int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            ds.Ordenacao.selecao(itemArray0, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 2");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray0);
    }

    @Test
    public void test2128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2128");
        ds.Item[] itemArray0 = new ds.Item[] {};
        ds.Ordenacao.heapsort(itemArray0, 0);
        ds.Ordenacao.insercao(itemArray0, 0);
        ds.Ordenacao.insercao(itemArray0, (int) (short) 0);
        ds.Ordenacao.selecao(itemArray0, 1);
        ds.Ordenacao.shellsort(itemArray0, (int) (short) 1);
        ds.Ordenacao.insercao(itemArray0, (int) (short) 1);
        ds.Ordenacao.selecao(itemArray0, 0);
        ds.Ordenacao.shellsort(itemArray0, (-1));
        ds.Ordenacao.insercao(itemArray0, (int) (byte) -1);
        // The following exception was thrown during execution in test generation
        try {
            ds.Ordenacao.selecao(itemArray0, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 2");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray0);
    }

    @Test
    public void test2129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2129");
        ds.Item[] itemArray0 = new ds.Item[] {};
        ds.Ordenacao.shellsort(itemArray0, 0);
        ds.Ordenacao.selecao(itemArray0, (int) (byte) 1);
        ds.Ordenacao.shellsort(itemArray0, (int) (short) -1);
        // The following exception was thrown during execution in test generation
        try {
            ds.Ordenacao.selecao(itemArray0, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 2");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray0);
    }

    @Test
    public void test2130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2130");
        ds.Item[] itemArray0 = new ds.Item[] {};
        ds.Ordenacao.heapsort(itemArray0, 0);
        ds.Ordenacao.insercao(itemArray0, 0);
        ds.Ordenacao.insercao(itemArray0, (int) (short) 0);
        ds.Ordenacao.heapsort(itemArray0, 0);
        java.lang.Class<?> wildcardClass9 = itemArray0.getClass();
        org.junit.Assert.assertNotNull(itemArray0);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test2131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2131");
        ds.Item[] itemArray0 = new ds.Item[] {};
        ds.Ordenacao.heapsort(itemArray0, 0);
        ds.Ordenacao.insercao(itemArray0, 0);
        ds.Ordenacao.insercao(itemArray0, (int) (short) 0);
        ds.Ordenacao.selecao(itemArray0, 1);
        ds.Ordenacao.shellsort(itemArray0, (int) (short) 1);
        ds.Ordenacao.selecao(itemArray0, 0);
        org.junit.Assert.assertNotNull(itemArray0);
    }

    @Test
    public void test2132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2132");
        ds.Item[] itemArray0 = new ds.Item[] {};
        ds.Ordenacao.heapsort(itemArray0, 0);
        ds.Ordenacao.insercao(itemArray0, 0);
        ds.Ordenacao.selecao(itemArray0, 0);
        ds.Ordenacao.insercao(itemArray0, (-1));
        ds.Ordenacao.heapsort(itemArray0, (-1));
        ds.Ordenacao.selecao(itemArray0, 1);
        ds.Ordenacao.insercao(itemArray0, 1);
        ds.Ordenacao.insercao(itemArray0, (int) (short) -1);
        // The following exception was thrown during execution in test generation
        try {
            ds.Ordenacao.insercao(itemArray0, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray0);
    }

    @Test
    public void test2133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2133");
        ds.Item[] itemArray0 = new ds.Item[] {};
        ds.Ordenacao.heapsort(itemArray0, 0);
        ds.Ordenacao.insercao(itemArray0, 0);
        ds.Ordenacao.shellsort(itemArray0, (-1));
        ds.Ordenacao.selecao(itemArray0, (-1));
        ds.Ordenacao.heapsort(itemArray0, (int) (short) 0);
        ds.Ordenacao.selecao(itemArray0, 1);
        ds.Ordenacao.selecao(itemArray0, 1);
        ds.Ordenacao.selecao(itemArray0, (-1));
        org.junit.Assert.assertNotNull(itemArray0);
    }

    @Test
    public void test2134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2134");
        ds.Item[] itemArray0 = new ds.Item[] {};
        ds.Ordenacao.heapsort(itemArray0, 0);
        ds.Ordenacao.insercao(itemArray0, 0);
        ds.Ordenacao.selecao(itemArray0, 0);
        ds.Ordenacao.insercao(itemArray0, (-1));
        ds.Ordenacao.insercao(itemArray0, (int) (byte) -1);
        ds.Ordenacao.heapsort(itemArray0, (int) (byte) 0);
        ds.Ordenacao.selecao(itemArray0, (int) (byte) 1);
        org.junit.Assert.assertNotNull(itemArray0);
    }

    @Test
    public void test2135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2135");
        ds.Item[] itemArray0 = new ds.Item[] {};
        ds.Ordenacao.heapsort(itemArray0, 0);
        ds.Ordenacao.heapsort(itemArray0, (int) (byte) 0);
        ds.Ordenacao.shellsort(itemArray0, 0);
        ds.Ordenacao.insercao(itemArray0, (-1));
        ds.Ordenacao.heapsort(itemArray0, (int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            ds.Ordenacao.insercao(itemArray0, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray0);
    }

    @Test
    public void test2136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2136");
        ds.Item[] itemArray0 = new ds.Item[] {};
        ds.Ordenacao.heapsort(itemArray0, 0);
        ds.Ordenacao.insercao(itemArray0, 0);
        ds.Ordenacao.insercao(itemArray0, (int) (short) 0);
        ds.Ordenacao.selecao(itemArray0, 1);
        ds.Ordenacao.selecao(itemArray0, (int) (short) -1);
        ds.Ordenacao.insercao(itemArray0, 0);
        ds.Ordenacao.heapsort(itemArray0, (int) (byte) 1);
        ds.Ordenacao.shellsort(itemArray0, (int) (byte) 0);
        ds.Ordenacao.insercao(itemArray0, (int) (short) 1);
        ds.Ordenacao.shellsort(itemArray0, 0);
        // The following exception was thrown during execution in test generation
        try {
            ds.Ordenacao.quicksort(itemArray0, (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 0");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray0);
    }

    @Test
    public void test2137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2137");
        ds.Item[] itemArray0 = new ds.Item[] {};
        ds.Ordenacao.heapsort(itemArray0, 0);
        ds.Ordenacao.insercao(itemArray0, 0);
        ds.Ordenacao.shellsort(itemArray0, (-1));
        ds.Ordenacao.selecao(itemArray0, (-1));
        ds.Ordenacao.shellsort(itemArray0, (int) (byte) 0);
        ds.Ordenacao.insercao(itemArray0, (int) (short) -1);
        ds.Ordenacao.insercao(itemArray0, (int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            ds.Ordenacao.insercao(itemArray0, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray0);
    }

    @Test
    public void test2138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2138");
        ds.Item[] itemArray0 = new ds.Item[] {};
        ds.Ordenacao.heapsort(itemArray0, 0);
        ds.Ordenacao.insercao(itemArray0, 0);
        ds.Ordenacao.selecao(itemArray0, 0);
        ds.Ordenacao.selecao(itemArray0, (int) (short) 0);
        ds.Ordenacao.heapsort(itemArray0, 1);
        ds.Ordenacao.heapsort(itemArray0, (int) (short) -1);
        // The following exception was thrown during execution in test generation
        try {
            ds.Ordenacao.insercao(itemArray0, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray0);
    }

    @Test
    public void test2139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2139");
        ds.Item[] itemArray0 = new ds.Item[] {};
        ds.Ordenacao.heapsort(itemArray0, 0);
        ds.Ordenacao.insercao(itemArray0, 0);
        ds.Ordenacao.insercao(itemArray0, (int) (short) 0);
        ds.Ordenacao.selecao(itemArray0, 1);
        ds.Ordenacao.selecao(itemArray0, (int) (short) -1);
        ds.Ordenacao.insercao(itemArray0, 0);
        ds.Ordenacao.heapsort(itemArray0, (int) (byte) 1);
        ds.Ordenacao.shellsort(itemArray0, (int) (byte) 0);
        ds.Ordenacao.heapsort(itemArray0, (int) (short) 0);
        org.junit.Assert.assertNotNull(itemArray0);
    }

    @Test
    public void test2140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2140");
        ds.Item[] itemArray0 = new ds.Item[] {};
        ds.Ordenacao.heapsort(itemArray0, 0);
        ds.Ordenacao.insercao(itemArray0, 0);
        ds.Ordenacao.shellsort(itemArray0, (-1));
        ds.Ordenacao.insercao(itemArray0, (int) (byte) 1);
        ds.Ordenacao.selecao(itemArray0, 0);
        ds.Ordenacao.selecao(itemArray0, (int) (byte) -1);
        ds.Ordenacao.selecao(itemArray0, 0);
        ds.Ordenacao.insercao(itemArray0, (int) (byte) 1);
        ds.Ordenacao.heapsort(itemArray0, (int) (short) 1);
        ds.Ordenacao.heapsort(itemArray0, (int) (short) -1);
        ds.Ordenacao.insercao(itemArray0, (int) (byte) -1);
        ds.Ordenacao.heapsort(itemArray0, 1);
        ds.Ordenacao.heapsort(itemArray0, (int) (byte) 1);
        ds.Ordenacao.shellsort(itemArray0, 0);
        ds.Ordenacao.insercao(itemArray0, (int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            ds.Ordenacao.insercao(itemArray0, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray0);
    }

    @Test
    public void test2141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2141");
        ds.Item[] itemArray0 = new ds.Item[] {};
        ds.Ordenacao.heapsort(itemArray0, 0);
        ds.Ordenacao.insercao(itemArray0, 0);
        ds.Ordenacao.selecao(itemArray0, 0);
        ds.Ordenacao.insercao(itemArray0, (-1));
        ds.Ordenacao.heapsort(itemArray0, (-1));
        ds.Ordenacao.selecao(itemArray0, 1);
        ds.Ordenacao.shellsort(itemArray0, 0);
        ds.Ordenacao.heapsort(itemArray0, 1);
        // The following exception was thrown during execution in test generation
        try {
            ds.Ordenacao.heapsort(itemArray0, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray0);
    }

    @Test
    public void test2142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2142");
        ds.Item[] itemArray0 = new ds.Item[] {};
        ds.Ordenacao.heapsort(itemArray0, 0);
        ds.Ordenacao.insercao(itemArray0, 0);
        ds.Ordenacao.insercao(itemArray0, (int) (short) 0);
        ds.Ordenacao.selecao(itemArray0, 1);
        ds.Ordenacao.selecao(itemArray0, (int) (short) -1);
        ds.Ordenacao.insercao(itemArray0, 0);
        ds.Ordenacao.selecao(itemArray0, 0);
        ds.Ordenacao.shellsort(itemArray0, 0);
        // The following exception was thrown during execution in test generation
        try {
            ds.Ordenacao.insercao(itemArray0, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray0);
    }

    @Test
    public void test2143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2143");
        ds.Item item0 = null;
        ds.Item[] itemArray1 = new ds.Item[] { item0 };
        ds.Ordenacao.heapsort(itemArray1, 0);
        ds.Ordenacao.heapsort(itemArray1, 1);
        ds.Ordenacao.heapsort(itemArray1, (-1));
        ds.Ordenacao.heapsort(itemArray1, (-1));
        ds.Ordenacao.shellsort(itemArray1, 1);
        ds.Ordenacao.shellsort(itemArray1, (int) (short) -1);
        org.junit.Assert.assertNotNull(itemArray1);
    }

    @Test
    public void test2144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2144");
        ds.Item[] itemArray0 = new ds.Item[] {};
        ds.Ordenacao.heapsort(itemArray0, 0);
        ds.Ordenacao.insercao(itemArray0, 0);
        ds.Ordenacao.insercao(itemArray0, (int) (short) 0);
        ds.Ordenacao.selecao(itemArray0, 1);
        ds.Ordenacao.shellsort(itemArray0, (int) (short) 1);
        ds.Ordenacao.shellsort(itemArray0, (int) (short) -1);
        ds.Ordenacao.insercao(itemArray0, (int) (short) 0);
        ds.Ordenacao.heapsort(itemArray0, (int) (byte) 0);
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
    public void test2145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2145");
        ds.Item[] itemArray0 = new ds.Item[] {};
        ds.Ordenacao.heapsort(itemArray0, 0);
        ds.Ordenacao.insercao(itemArray0, 0);
        ds.Ordenacao.shellsort(itemArray0, (-1));
        ds.Ordenacao.selecao(itemArray0, 0);
        ds.Ordenacao.insercao(itemArray0, (int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            ds.Ordenacao.quicksort(itemArray0, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 50");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray0);
    }

    @Test
    public void test2146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2146");
        ds.Item[] itemArray0 = new ds.Item[] {};
        ds.Ordenacao.heapsort(itemArray0, 0);
        ds.Ordenacao.insercao(itemArray0, 0);
        ds.Ordenacao.insercao(itemArray0, (int) (short) 0);
        ds.Ordenacao.selecao(itemArray0, 1);
        ds.Ordenacao.shellsort(itemArray0, (int) (short) 1);
        ds.Ordenacao.shellsort(itemArray0, 0);
        ds.Ordenacao.shellsort(itemArray0, (-1));
        ds.Ordenacao.selecao(itemArray0, 0);
        ds.Ordenacao.insercao(itemArray0, 0);
        ds.Ordenacao.insercao(itemArray0, (-1));
        // The following exception was thrown during execution in test generation
        try {
            ds.Ordenacao.quicksort(itemArray0, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 16");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray0);
    }

    @Test
    public void test2147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2147");
        ds.Item[] itemArray0 = new ds.Item[] {};
        ds.Ordenacao.heapsort(itemArray0, 0);
        ds.Ordenacao.insercao(itemArray0, 0);
        ds.Ordenacao.shellsort(itemArray0, (-1));
        ds.Ordenacao.shellsort(itemArray0, (int) (byte) -1);
        ds.Ordenacao.selecao(itemArray0, (int) (byte) -1);
        ds.Ordenacao.heapsort(itemArray0, (int) (byte) -1);
        ds.Ordenacao.heapsort(itemArray0, (int) (byte) 1);
        ds.Ordenacao.heapsort(itemArray0, (int) (byte) -1);
        ds.Ordenacao.insercao(itemArray0, (-1));
        ds.Ordenacao.selecao(itemArray0, (int) (byte) -1);
        ds.Ordenacao.selecao(itemArray0, 0);
        // The following exception was thrown during execution in test generation
        try {
            ds.Ordenacao.heapsort(itemArray0, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray0);
    }

    @Test
    public void test2148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2148");
        ds.Item[] itemArray0 = new ds.Item[] {};
        ds.Ordenacao.heapsort(itemArray0, 0);
        ds.Ordenacao.insercao(itemArray0, 0);
        ds.Ordenacao.shellsort(itemArray0, (-1));
        ds.Ordenacao.insercao(itemArray0, (int) (byte) 1);
        ds.Ordenacao.insercao(itemArray0, (int) (byte) 1);
        ds.Ordenacao.shellsort(itemArray0, (int) (short) 1);
        org.junit.Assert.assertNotNull(itemArray0);
    }

    @Test
    public void test2149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2149");
        ds.Item[] itemArray0 = new ds.Item[] {};
        ds.Ordenacao.heapsort(itemArray0, 0);
        ds.Ordenacao.insercao(itemArray0, 0);
        ds.Ordenacao.shellsort(itemArray0, (-1));
        ds.Ordenacao.insercao(itemArray0, (int) (byte) 1);
        ds.Ordenacao.selecao(itemArray0, 1);
        // The following exception was thrown during execution in test generation
        try {
            ds.Ordenacao.heapsort(itemArray0, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray0);
    }

    @Test
    public void test2150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2150");
        ds.Item[] itemArray0 = new ds.Item[] {};
        ds.Ordenacao.heapsort(itemArray0, 0);
        ds.Ordenacao.insercao(itemArray0, 0);
        ds.Ordenacao.selecao(itemArray0, 0);
        ds.Ordenacao.insercao(itemArray0, (-1));
        ds.Ordenacao.heapsort(itemArray0, (-1));
        ds.Ordenacao.selecao(itemArray0, 1);
        ds.Ordenacao.insercao(itemArray0, 0);
        ds.Ordenacao.heapsort(itemArray0, (int) (byte) 1);
        java.lang.Class<?> wildcardClass17 = itemArray0.getClass();
        org.junit.Assert.assertNotNull(itemArray0);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test2151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2151");
        ds.Item item0 = null;
        ds.Item[] itemArray1 = new ds.Item[] { item0 };
        ds.Ordenacao.heapsort(itemArray1, 0);
        ds.Ordenacao.selecao(itemArray1, 0);
        ds.Ordenacao.selecao(itemArray1, 1);
        // The following exception was thrown during execution in test generation
        try {
            ds.Ordenacao.selecao(itemArray1, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 2");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray1);
    }

    @Test
    public void test2152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2152");
        ds.Item[] itemArray0 = new ds.Item[] {};
        ds.Ordenacao.heapsort(itemArray0, 0);
        ds.Ordenacao.insercao(itemArray0, 0);
        ds.Ordenacao.shellsort(itemArray0, (-1));
        ds.Ordenacao.insercao(itemArray0, (int) (byte) 1);
        ds.Ordenacao.selecao(itemArray0, 0);
        ds.Ordenacao.shellsort(itemArray0, 1);
        ds.Ordenacao.selecao(itemArray0, (-1));
        ds.Ordenacao.shellsort(itemArray0, (-1));
        // The following exception was thrown during execution in test generation
        try {
            ds.Ordenacao.quicksort(itemArray0, (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray0);
    }

    @Test
    public void test2153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2153");
        ds.Item[] itemArray0 = new ds.Item[] {};
        ds.Ordenacao.heapsort(itemArray0, 0);
        ds.Ordenacao.heapsort(itemArray0, 0);
        ds.Ordenacao.insercao(itemArray0, (int) (short) -1);
        ds.Ordenacao.insercao(itemArray0, (int) (short) 0);
        ds.Ordenacao.selecao(itemArray0, (int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            ds.Ordenacao.quicksort(itemArray0, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 50");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray0);
    }

    @Test
    public void test2154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2154");
        ds.Item[] itemArray0 = new ds.Item[] {};
        ds.Ordenacao.heapsort(itemArray0, 0);
        ds.Ordenacao.insercao(itemArray0, 0);
        ds.Ordenacao.selecao(itemArray0, 0);
        ds.Ordenacao.insercao(itemArray0, (-1));
        ds.Ordenacao.heapsort(itemArray0, (-1));
        ds.Ordenacao.selecao(itemArray0, 1);
        ds.Ordenacao.heapsort(itemArray0, (int) (byte) -1);
        ds.Ordenacao.heapsort(itemArray0, 1);
        ds.Ordenacao.shellsort(itemArray0, (int) (short) -1);
        java.lang.Class<?> wildcardClass19 = itemArray0.getClass();
        org.junit.Assert.assertNotNull(itemArray0);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test2155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2155");
        ds.Item[] itemArray0 = new ds.Item[] {};
        ds.Ordenacao.heapsort(itemArray0, 0);
        ds.Ordenacao.insercao(itemArray0, 0);
        ds.Ordenacao.selecao(itemArray0, 0);
        ds.Ordenacao.selecao(itemArray0, (int) (short) 0);
        ds.Ordenacao.shellsort(itemArray0, (int) (byte) 1);
        org.junit.Assert.assertNotNull(itemArray0);
    }

    @Test
    public void test2156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2156");
        ds.Item[] itemArray0 = new ds.Item[] {};
        ds.Ordenacao.heapsort(itemArray0, 0);
        ds.Ordenacao.insercao(itemArray0, 0);
        ds.Ordenacao.shellsort(itemArray0, (-1));
        ds.Ordenacao.insercao(itemArray0, (int) (byte) 1);
        ds.Ordenacao.selecao(itemArray0, 0);
        ds.Ordenacao.shellsort(itemArray0, 1);
        ds.Ordenacao.insercao(itemArray0, (-1));
        ds.Ordenacao.insercao(itemArray0, (int) (byte) 0);
        ds.Ordenacao.heapsort(itemArray0, (int) (byte) 1);
        ds.Ordenacao.insercao(itemArray0, 0);
        ds.Ordenacao.heapsort(itemArray0, (int) (byte) 1);
        org.junit.Assert.assertNotNull(itemArray0);
    }

    @Test
    public void test2157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2157");
        ds.Item[] itemArray0 = new ds.Item[] {};
        ds.Ordenacao.heapsort(itemArray0, 0);
        ds.Ordenacao.insercao(itemArray0, 0);
        ds.Ordenacao.shellsort(itemArray0, (-1));
        ds.Ordenacao.insercao(itemArray0, (int) (byte) 1);
        ds.Ordenacao.selecao(itemArray0, 0);
        ds.Ordenacao.selecao(itemArray0, (int) (byte) -1);
        ds.Ordenacao.selecao(itemArray0, 0);
        ds.Ordenacao.insercao(itemArray0, (int) (byte) 1);
        ds.Ordenacao.insercao(itemArray0, (int) (byte) 0);
        ds.Ordenacao.insercao(itemArray0, (-1));
        ds.Ordenacao.insercao(itemArray0, (int) (byte) 0);
        ds.Ordenacao.selecao(itemArray0, (int) (short) -1);
        org.junit.Assert.assertNotNull(itemArray0);
    }

    @Test
    public void test2158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2158");
        ds.Item[] itemArray0 = new ds.Item[] {};
        ds.Ordenacao.heapsort(itemArray0, 0);
        ds.Ordenacao.insercao(itemArray0, 0);
        ds.Ordenacao.shellsort(itemArray0, (-1));
        ds.Ordenacao.insercao(itemArray0, (int) (byte) 1);
        ds.Ordenacao.selecao(itemArray0, 0);
        ds.Ordenacao.shellsort(itemArray0, 1);
        ds.Ordenacao.selecao(itemArray0, (int) (byte) -1);
        ds.Ordenacao.heapsort(itemArray0, (int) (short) 1);
        ds.Ordenacao.shellsort(itemArray0, (int) (short) -1);
        ds.Ordenacao.insercao(itemArray0, (int) (byte) 1);
        ds.Ordenacao.selecao(itemArray0, (int) (short) 0);
        org.junit.Assert.assertNotNull(itemArray0);
    }

    @Test
    public void test2159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2159");
        ds.Item[] itemArray0 = new ds.Item[] {};
        ds.Ordenacao.heapsort(itemArray0, 0);
        ds.Ordenacao.heapsort(itemArray0, (int) (byte) 0);
        ds.Ordenacao.shellsort(itemArray0, 0);
        ds.Ordenacao.insercao(itemArray0, (-1));
        ds.Ordenacao.insercao(itemArray0, 0);
        ds.Ordenacao.shellsort(itemArray0, 1);
        ds.Ordenacao.insercao(itemArray0, (int) (byte) 0);
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
    public void test2160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2160");
        ds.Item item0 = null;
        ds.Item[] itemArray1 = new ds.Item[] { item0 };
        ds.Ordenacao.selecao(itemArray1, (int) (short) 1);
        ds.Ordenacao.selecao(itemArray1, 1);
        // The following exception was thrown during execution in test generation
        try {
            ds.Ordenacao.quicksort(itemArray1, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray1);
    }

    @Test
    public void test2161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2161");
        ds.Item[] itemArray0 = new ds.Item[] {};
        ds.Ordenacao.heapsort(itemArray0, 0);
        ds.Ordenacao.insercao(itemArray0, 0);
        ds.Ordenacao.heapsort(itemArray0, 1);
        ds.Ordenacao.shellsort(itemArray0, (int) (short) 1);
        ds.Ordenacao.selecao(itemArray0, 0);
        ds.Ordenacao.selecao(itemArray0, (int) (short) 1);
        ds.Ordenacao.selecao(itemArray0, (int) (byte) 0);
        org.junit.Assert.assertNotNull(itemArray0);
    }

    @Test
    public void test2162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2162");
        ds.Item[] itemArray0 = new ds.Item[] {};
        ds.Ordenacao.heapsort(itemArray0, 0);
        ds.Ordenacao.insercao(itemArray0, 0);
        ds.Ordenacao.selecao(itemArray0, 0);
        ds.Ordenacao.shellsort(itemArray0, (int) (byte) 1);
        ds.Ordenacao.insercao(itemArray0, 0);
        ds.Ordenacao.insercao(itemArray0, (int) (short) 1);
        ds.Ordenacao.selecao(itemArray0, (int) (short) 0);
        ds.Ordenacao.shellsort(itemArray0, 0);
        org.junit.Assert.assertNotNull(itemArray0);
    }

    @Test
    public void test2163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2163");
        ds.Item[] itemArray0 = new ds.Item[] {};
        ds.Ordenacao.heapsort(itemArray0, 0);
        ds.Ordenacao.heapsort(itemArray0, 0);
        ds.Ordenacao.shellsort(itemArray0, (int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            ds.Ordenacao.insercao(itemArray0, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray0);
    }

    @Test
    public void test2164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2164");
        ds.Item[] itemArray0 = new ds.Item[] {};
        ds.Ordenacao.heapsort(itemArray0, 0);
        ds.Ordenacao.insercao(itemArray0, 0);
        ds.Ordenacao.insercao(itemArray0, (int) (short) 0);
        ds.Ordenacao.selecao(itemArray0, 1);
        ds.Ordenacao.selecao(itemArray0, (int) (short) -1);
        ds.Ordenacao.heapsort(itemArray0, (int) (short) 1);
        ds.Ordenacao.selecao(itemArray0, (int) (short) 0);
        ds.Ordenacao.insercao(itemArray0, (int) (byte) -1);
        ds.Ordenacao.selecao(itemArray0, 0);
        ds.Ordenacao.selecao(itemArray0, (int) (byte) 0);
        ds.Ordenacao.insercao(itemArray0, (int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            ds.Ordenacao.shellsort(itemArray0, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 14");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray0);
    }

    @Test
    public void test2165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2165");
        ds.Item[] itemArray0 = new ds.Item[] {};
        ds.Ordenacao.heapsort(itemArray0, 0);
        ds.Ordenacao.insercao(itemArray0, 0);
        ds.Ordenacao.shellsort(itemArray0, (-1));
        ds.Ordenacao.insercao(itemArray0, (int) (byte) 1);
        ds.Ordenacao.selecao(itemArray0, 0);
        ds.Ordenacao.selecao(itemArray0, (int) (byte) -1);
        ds.Ordenacao.selecao(itemArray0, 0);
        ds.Ordenacao.insercao(itemArray0, (int) (byte) 1);
        ds.Ordenacao.insercao(itemArray0, (int) (byte) 0);
        ds.Ordenacao.selecao(itemArray0, 1);
        // The following exception was thrown during execution in test generation
        try {
            ds.Ordenacao.quicksort(itemArray0, 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray0);
    }

    @Test
    public void test2166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2166");
        ds.Item[] itemArray0 = new ds.Item[] {};
        ds.Ordenacao.heapsort(itemArray0, 0);
        ds.Ordenacao.heapsort(itemArray0, (-1));
        ds.Ordenacao.insercao(itemArray0, 0);
        ds.Ordenacao.selecao(itemArray0, 0);
        // The following exception was thrown during execution in test generation
        try {
            ds.Ordenacao.quicksort(itemArray0, (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray0);
    }

    @Test
    public void test2167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2167");
        ds.Item[] itemArray0 = new ds.Item[] {};
        ds.Ordenacao.heapsort(itemArray0, 0);
        ds.Ordenacao.heapsort(itemArray0, 0);
        ds.Ordenacao.shellsort(itemArray0, (int) (byte) 0);
        ds.Ordenacao.insercao(itemArray0, 0);
        ds.Ordenacao.heapsort(itemArray0, 1);
        // The following exception was thrown during execution in test generation
        try {
            ds.Ordenacao.shellsort(itemArray0, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 41");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray0);
    }

    @Test
    public void test2168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2168");
        ds.Item[] itemArray0 = new ds.Item[] {};
        ds.Ordenacao.heapsort(itemArray0, 0);
        ds.Ordenacao.insercao(itemArray0, 0);
        ds.Ordenacao.selecao(itemArray0, 0);
        ds.Ordenacao.shellsort(itemArray0, (int) (short) 1);
        ds.Ordenacao.insercao(itemArray0, 0);
        ds.Ordenacao.selecao(itemArray0, (int) (byte) -1);
        ds.Ordenacao.insercao(itemArray0, 0);
        ds.Ordenacao.selecao(itemArray0, 0);
        ds.Ordenacao.shellsort(itemArray0, (-1));
        java.lang.Class<?> wildcardClass19 = itemArray0.getClass();
        org.junit.Assert.assertNotNull(itemArray0);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test2169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2169");
        ds.Item[] itemArray0 = new ds.Item[] {};
        ds.Ordenacao.heapsort(itemArray0, 0);
        ds.Ordenacao.insercao(itemArray0, 0);
        ds.Ordenacao.selecao(itemArray0, 0);
        ds.Ordenacao.insercao(itemArray0, (-1));
        ds.Ordenacao.insercao(itemArray0, (int) (byte) -1);
        ds.Ordenacao.heapsort(itemArray0, (int) (byte) 0);
        ds.Ordenacao.selecao(itemArray0, (int) (short) 0);
        ds.Ordenacao.insercao(itemArray0, 0);
        org.junit.Assert.assertNotNull(itemArray0);
    }

    @Test
    public void test2170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2170");
        ds.Item[] itemArray0 = new ds.Item[] {};
        ds.Ordenacao.heapsort(itemArray0, 0);
        ds.Ordenacao.insercao(itemArray0, 0);
        ds.Ordenacao.selecao(itemArray0, 0);
        ds.Ordenacao.insercao(itemArray0, (-1));
        ds.Ordenacao.heapsort(itemArray0, (-1));
        // The following exception was thrown during execution in test generation
        try {
            ds.Ordenacao.shellsort(itemArray0, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 41");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray0);
    }

    @Test
    public void test2171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2171");
        ds.Item[] itemArray0 = new ds.Item[] {};
        ds.Ordenacao.heapsort(itemArray0, 0);
        ds.Ordenacao.insercao(itemArray0, 0);
        ds.Ordenacao.insercao(itemArray0, (int) (short) 0);
        ds.Ordenacao.selecao(itemArray0, 1);
        ds.Ordenacao.selecao(itemArray0, (int) (short) -1);
        ds.Ordenacao.insercao(itemArray0, 0);
        ds.Ordenacao.heapsort(itemArray0, (int) (short) -1);
        ds.Ordenacao.shellsort(itemArray0, 0);
        ds.Ordenacao.shellsort(itemArray0, (-1));
        ds.Ordenacao.shellsort(itemArray0, (int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            ds.Ordenacao.heapsort(itemArray0, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray0);
    }

    @Test
    public void test2172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2172");
        ds.Item[] itemArray0 = new ds.Item[] {};
        ds.Ordenacao.heapsort(itemArray0, 0);
        ds.Ordenacao.insercao(itemArray0, 0);
        ds.Ordenacao.shellsort(itemArray0, (-1));
        ds.Ordenacao.shellsort(itemArray0, (int) (byte) -1);
        ds.Ordenacao.selecao(itemArray0, (int) (byte) -1);
        ds.Ordenacao.heapsort(itemArray0, (int) (byte) -1);
        ds.Ordenacao.heapsort(itemArray0, (int) (byte) 1);
        ds.Ordenacao.selecao(itemArray0, (int) (byte) 1);
        ds.Ordenacao.insercao(itemArray0, (int) (short) 1);
        ds.Ordenacao.insercao(itemArray0, (-1));
        // The following exception was thrown during execution in test generation
        try {
            ds.Ordenacao.shellsort(itemArray0, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 14");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray0);
    }

    @Test
    public void test2173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2173");
        ds.Item[] itemArray0 = new ds.Item[] {};
        ds.Ordenacao.heapsort(itemArray0, 0);
        ds.Ordenacao.shellsort(itemArray0, (int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            ds.Ordenacao.heapsort(itemArray0, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray0);
    }

    @Test
    public void test2174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2174");
        ds.Item[] itemArray0 = new ds.Item[] {};
        ds.Ordenacao.heapsort(itemArray0, 0);
        ds.Ordenacao.insercao(itemArray0, 0);
        ds.Ordenacao.shellsort(itemArray0, (-1));
        ds.Ordenacao.selecao(itemArray0, (-1));
        ds.Ordenacao.heapsort(itemArray0, (int) (short) 0);
        ds.Ordenacao.heapsort(itemArray0, 0);
        ds.Ordenacao.heapsort(itemArray0, 1);
        ds.Ordenacao.shellsort(itemArray0, 0);
        // The following exception was thrown during execution in test generation
        try {
            ds.Ordenacao.quicksort(itemArray0, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 49");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray0);
    }

    @Test
    public void test2175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2175");
        ds.Item[] itemArray0 = new ds.Item[] {};
        ds.Ordenacao.heapsort(itemArray0, 0);
        ds.Ordenacao.heapsort(itemArray0, 0);
        ds.Ordenacao.shellsort(itemArray0, (int) (byte) 0);
        ds.Ordenacao.insercao(itemArray0, 0);
        ds.Ordenacao.selecao(itemArray0, 1);
        ds.Ordenacao.selecao(itemArray0, (int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            ds.Ordenacao.shellsort(itemArray0, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray0);
    }

    @Test
    public void test2176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2176");
        ds.Item[] itemArray0 = new ds.Item[] {};
        ds.Ordenacao.heapsort(itemArray0, 0);
        ds.Ordenacao.insercao(itemArray0, 0);
        ds.Ordenacao.shellsort(itemArray0, (-1));
        ds.Ordenacao.insercao(itemArray0, (int) (byte) 1);
        ds.Ordenacao.selecao(itemArray0, 0);
        ds.Ordenacao.shellsort(itemArray0, 1);
        ds.Ordenacao.insercao(itemArray0, (-1));
        ds.Ordenacao.insercao(itemArray0, (int) (byte) 0);
        ds.Ordenacao.heapsort(itemArray0, (int) (byte) 1);
        ds.Ordenacao.insercao(itemArray0, (int) (byte) 0);
        ds.Ordenacao.insercao(itemArray0, 0);
        ds.Ordenacao.insercao(itemArray0, 0);
        // The following exception was thrown during execution in test generation
        try {
            ds.Ordenacao.selecao(itemArray0, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 2");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray0);
    }

    @Test
    public void test2177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2177");
        ds.Item[] itemArray0 = new ds.Item[] {};
        ds.Ordenacao.heapsort(itemArray0, 0);
        ds.Ordenacao.heapsort(itemArray0, 0);
        ds.Ordenacao.shellsort(itemArray0, (int) (byte) 0);
        ds.Ordenacao.insercao(itemArray0, 0);
        ds.Ordenacao.selecao(itemArray0, (int) (byte) 0);
        org.junit.Assert.assertNotNull(itemArray0);
    }

    @Test
    public void test2178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2178");
        ds.Item[] itemArray0 = new ds.Item[] {};
        ds.Ordenacao.heapsort(itemArray0, 0);
        ds.Ordenacao.insercao(itemArray0, 0);
        ds.Ordenacao.insercao(itemArray0, (int) (short) 0);
        ds.Ordenacao.heapsort(itemArray0, 0);
        ds.Ordenacao.heapsort(itemArray0, (int) (short) 1);
        org.junit.Assert.assertNotNull(itemArray0);
    }

    @Test
    public void test2179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2179");
        ds.Item[] itemArray0 = new ds.Item[] {};
        ds.Ordenacao.heapsort(itemArray0, 0);
        ds.Ordenacao.insercao(itemArray0, 0);
        ds.Ordenacao.shellsort(itemArray0, (-1));
        ds.Ordenacao.selecao(itemArray0, (-1));
        ds.Ordenacao.heapsort(itemArray0, (int) (short) 0);
        ds.Ordenacao.selecao(itemArray0, 1);
        ds.Ordenacao.shellsort(itemArray0, (int) (byte) 0);
        ds.Ordenacao.insercao(itemArray0, 0);
        ds.Ordenacao.insercao(itemArray0, (int) (short) -1);
        ds.Ordenacao.selecao(itemArray0, 0);
        org.junit.Assert.assertNotNull(itemArray0);
    }

    @Test
    public void test2180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2180");
        ds.Item item0 = null;
        ds.Item[] itemArray1 = new ds.Item[] { item0 };
        ds.Ordenacao.heapsort(itemArray1, 0);
        ds.Ordenacao.shellsort(itemArray1, (int) (byte) 0);
        ds.Ordenacao.heapsort(itemArray1, (-1));
        java.lang.Class<?> wildcardClass8 = itemArray1.getClass();
        org.junit.Assert.assertNotNull(itemArray1);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test2181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2181");
        ds.Item[] itemArray0 = new ds.Item[] {};
        ds.Ordenacao.heapsort(itemArray0, 0);
        ds.Ordenacao.insercao(itemArray0, 0);
        ds.Ordenacao.insercao(itemArray0, (int) (short) 0);
        ds.Ordenacao.selecao(itemArray0, 1);
        ds.Ordenacao.selecao(itemArray0, (int) (short) -1);
        ds.Ordenacao.insercao(itemArray0, 0);
        ds.Ordenacao.heapsort(itemArray0, (int) (byte) 1);
        ds.Ordenacao.shellsort(itemArray0, 0);
        ds.Ordenacao.selecao(itemArray0, (int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            ds.Ordenacao.selecao(itemArray0, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 2");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray0);
    }

    @Test
    public void test2182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2182");
        ds.Item[] itemArray0 = new ds.Item[] {};
        ds.Ordenacao.heapsort(itemArray0, 0);
        ds.Ordenacao.insercao(itemArray0, 0);
        ds.Ordenacao.shellsort(itemArray0, (-1));
        ds.Ordenacao.selecao(itemArray0, (int) (byte) 0);
        ds.Ordenacao.insercao(itemArray0, (int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            ds.Ordenacao.quicksort(itemArray0, (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray0);
    }

    @Test
    public void test2183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2183");
        ds.Item[] itemArray0 = new ds.Item[] {};
        ds.Ordenacao.heapsort(itemArray0, 0);
        ds.Ordenacao.insercao(itemArray0, 0);
        ds.Ordenacao.selecao(itemArray0, 0);
        ds.Ordenacao.shellsort(itemArray0, (int) (byte) 1);
        ds.Ordenacao.selecao(itemArray0, 0);
        ds.Ordenacao.heapsort(itemArray0, 0);
        ds.Ordenacao.insercao(itemArray0, 1);
        java.lang.Class<?> wildcardClass15 = itemArray0.getClass();
        org.junit.Assert.assertNotNull(itemArray0);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test2184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2184");
        ds.Item[] itemArray0 = new ds.Item[] {};
        ds.Ordenacao.heapsort(itemArray0, 0);
        ds.Ordenacao.insercao(itemArray0, 0);
        ds.Ordenacao.insercao(itemArray0, (int) (short) 0);
        ds.Ordenacao.selecao(itemArray0, 1);
        ds.Ordenacao.selecao(itemArray0, 0);
        ds.Ordenacao.selecao(itemArray0, 0);
        ds.Ordenacao.selecao(itemArray0, (int) (byte) 1);
        ds.Ordenacao.shellsort(itemArray0, (int) (short) 0);
        org.junit.Assert.assertNotNull(itemArray0);
    }

    @Test
    public void test2185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2185");
        ds.Item item0 = null;
        ds.Item[] itemArray1 = new ds.Item[] { item0 };
        ds.Ordenacao.heapsort(itemArray1, 0);
        ds.Ordenacao.shellsort(itemArray1, (int) (byte) 0);
        ds.Ordenacao.shellsort(itemArray1, (int) (short) 1);
        ds.Ordenacao.shellsort(itemArray1, (int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            ds.Ordenacao.selecao(itemArray1, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 2");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray1);
    }

    @Test
    public void test2186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2186");
        ds.Item[] itemArray0 = new ds.Item[] {};
        ds.Ordenacao.heapsort(itemArray0, 0);
        ds.Ordenacao.insercao(itemArray0, 0);
        ds.Ordenacao.selecao(itemArray0, 0);
        ds.Ordenacao.insercao(itemArray0, (-1));
        ds.Ordenacao.heapsort(itemArray0, (-1));
        ds.Ordenacao.selecao(itemArray0, (int) (short) 0);
        ds.Ordenacao.heapsort(itemArray0, (-1));
        // The following exception was thrown during execution in test generation
        try {
            ds.Ordenacao.insercao(itemArray0, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray0);
    }

    @Test
    public void test2187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2187");
        ds.Item[] itemArray0 = new ds.Item[] {};
        ds.Ordenacao.heapsort(itemArray0, 0);
        ds.Ordenacao.insercao(itemArray0, 0);
        ds.Ordenacao.selecao(itemArray0, 0);
        ds.Ordenacao.shellsort(itemArray0, (int) (byte) 1);
        ds.Ordenacao.insercao(itemArray0, 0);
        ds.Ordenacao.shellsort(itemArray0, (int) (short) 0);
        ds.Ordenacao.insercao(itemArray0, (int) (short) 0);
        ds.Ordenacao.heapsort(itemArray0, 1);
        ds.Ordenacao.shellsort(itemArray0, 1);
        ds.Ordenacao.selecao(itemArray0, 0);
        ds.Ordenacao.shellsort(itemArray0, (int) (byte) -1);
        org.junit.Assert.assertNotNull(itemArray0);
    }

    @Test
    public void test2188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2188");
        ds.Item[] itemArray0 = new ds.Item[] {};
        ds.Ordenacao.heapsort(itemArray0, 0);
        ds.Ordenacao.insercao(itemArray0, 0);
        ds.Ordenacao.selecao(itemArray0, 0);
        ds.Ordenacao.shellsort(itemArray0, 0);
        ds.Ordenacao.selecao(itemArray0, 0);
        org.junit.Assert.assertNotNull(itemArray0);
    }

    @Test
    public void test2189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2189");
        ds.Item[] itemArray0 = new ds.Item[] {};
        ds.Ordenacao.heapsort(itemArray0, 0);
        ds.Ordenacao.insercao(itemArray0, 0);
        ds.Ordenacao.selecao(itemArray0, 0);
        ds.Ordenacao.insercao(itemArray0, (-1));
        ds.Ordenacao.insercao(itemArray0, (int) (byte) -1);
        ds.Ordenacao.heapsort(itemArray0, (int) (byte) -1);
        ds.Ordenacao.insercao(itemArray0, 0);
        ds.Ordenacao.insercao(itemArray0, 0);
        ds.Ordenacao.heapsort(itemArray0, 0);
        org.junit.Assert.assertNotNull(itemArray0);
    }

    @Test
    public void test2190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2190");
        ds.Item[] itemArray0 = new ds.Item[] {};
        ds.Ordenacao.heapsort(itemArray0, 0);
        ds.Ordenacao.insercao(itemArray0, 0);
        ds.Ordenacao.shellsort(itemArray0, (-1));
        ds.Ordenacao.insercao(itemArray0, (int) (byte) 0);
        ds.Ordenacao.insercao(itemArray0, 0);
        // The following exception was thrown during execution in test generation
        try {
            ds.Ordenacao.shellsort(itemArray0, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray0);
    }

    @Test
    public void test2191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2191");
        ds.Item[] itemArray0 = new ds.Item[] {};
        ds.Ordenacao.heapsort(itemArray0, 0);
        ds.Ordenacao.insercao(itemArray0, 0);
        ds.Ordenacao.insercao(itemArray0, (int) (short) 0);
        ds.Ordenacao.selecao(itemArray0, 1);
        ds.Ordenacao.insercao(itemArray0, 1);
        ds.Ordenacao.heapsort(itemArray0, (int) (short) 0);
        ds.Ordenacao.heapsort(itemArray0, (-1));
        // The following exception was thrown during execution in test generation
        try {
            ds.Ordenacao.heapsort(itemArray0, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray0);
    }

    @Test
    public void test2192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2192");
        ds.Item[] itemArray0 = new ds.Item[] {};
        ds.Ordenacao.heapsort(itemArray0, 0);
        ds.Ordenacao.insercao(itemArray0, 0);
        ds.Ordenacao.insercao(itemArray0, 0);
        ds.Ordenacao.selecao(itemArray0, (int) (short) -1);
        // The following exception was thrown during execution in test generation
        try {
            ds.Ordenacao.quicksort(itemArray0, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray0);
    }

    @Test
    public void test2193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2193");
        ds.Item item0 = null;
        ds.Item[] itemArray1 = new ds.Item[] { item0 };
        ds.Ordenacao.heapsort(itemArray1, 0);
        ds.Ordenacao.shellsort(itemArray1, (int) (byte) 0);
        ds.Ordenacao.heapsort(itemArray1, (-1));
        ds.Ordenacao.insercao(itemArray1, (int) (byte) 1);
        ds.Ordenacao.heapsort(itemArray1, 0);
        ds.Ordenacao.selecao(itemArray1, (int) (byte) 1);
        org.junit.Assert.assertNotNull(itemArray1);
    }

    @Test
    public void test2194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2194");
        ds.Item[] itemArray0 = new ds.Item[] {};
        ds.Ordenacao.heapsort(itemArray0, 0);
        ds.Ordenacao.insercao(itemArray0, 0);
        ds.Ordenacao.selecao(itemArray0, 0);
        ds.Ordenacao.shellsort(itemArray0, (int) (byte) 1);
        ds.Ordenacao.insercao(itemArray0, 0);
        ds.Ordenacao.insercao(itemArray0, (int) (short) -1);
        ds.Ordenacao.shellsort(itemArray0, (int) (short) 0);
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
    public void test2195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2195");
        ds.Item item0 = null;
        ds.Item[] itemArray1 = new ds.Item[] { item0 };
        ds.Ordenacao.heapsort(itemArray1, 0);
        ds.Ordenacao.shellsort(itemArray1, (int) (byte) 0);
        ds.Ordenacao.heapsort(itemArray1, (-1));
        ds.Ordenacao.insercao(itemArray1, (int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            ds.Ordenacao.heapsort(itemArray1, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray1);
    }

    @Test
    public void test2196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2196");
        ds.Item[] itemArray0 = new ds.Item[] {};
        ds.Ordenacao.heapsort(itemArray0, 0);
        ds.Ordenacao.insercao(itemArray0, 0);
        ds.Ordenacao.selecao(itemArray0, 0);
        ds.Ordenacao.shellsort(itemArray0, (int) (byte) 1);
        ds.Ordenacao.selecao(itemArray0, 0);
        ds.Ordenacao.heapsort(itemArray0, 0);
        ds.Ordenacao.shellsort(itemArray0, (int) (short) -1);
        // The following exception was thrown during execution in test generation
        try {
            ds.Ordenacao.selecao(itemArray0, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 2");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray0);
    }

    @Test
    public void test2197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2197");
        ds.Item[] itemArray0 = null;
        // The following exception was thrown during execution in test generation
        try {
            ds.Ordenacao.quicksort(itemArray0, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2198");
        ds.Item[] itemArray0 = new ds.Item[] {};
        ds.Ordenacao.heapsort(itemArray0, 0);
        ds.Ordenacao.insercao(itemArray0, 0);
        ds.Ordenacao.shellsort(itemArray0, (-1));
        ds.Ordenacao.insercao(itemArray0, (int) (byte) 1);
        ds.Ordenacao.selecao(itemArray0, 0);
        ds.Ordenacao.shellsort(itemArray0, 1);
        ds.Ordenacao.insercao(itemArray0, (-1));
        ds.Ordenacao.insercao(itemArray0, (int) (byte) 0);
        ds.Ordenacao.heapsort(itemArray0, (int) (byte) 1);
        ds.Ordenacao.insercao(itemArray0, 0);
        ds.Ordenacao.heapsort(itemArray0, (int) (byte) -1);
        ds.Ordenacao.selecao(itemArray0, (-1));
        ds.Ordenacao.heapsort(itemArray0, (int) (short) -1);
        org.junit.Assert.assertNotNull(itemArray0);
    }

    @Test
    public void test2199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2199");
        ds.Item[] itemArray0 = new ds.Item[] {};
        ds.Ordenacao.heapsort(itemArray0, 0);
        ds.Ordenacao.heapsort(itemArray0, 0);
        ds.Ordenacao.shellsort(itemArray0, (int) (byte) 1);
        ds.Ordenacao.insercao(itemArray0, (int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            ds.Ordenacao.insercao(itemArray0, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray0);
    }

    @Test
    public void test2200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2200");
        ds.Item[] itemArray0 = new ds.Item[] {};
        ds.Ordenacao.heapsort(itemArray0, 0);
        ds.Ordenacao.insercao(itemArray0, 0);
        ds.Ordenacao.insercao(itemArray0, (int) (short) 0);
        ds.Ordenacao.selecao(itemArray0, 1);
        ds.Ordenacao.insercao(itemArray0, 1);
        ds.Ordenacao.insercao(itemArray0, (int) (byte) 1);
        java.lang.Class<?> wildcardClass13 = itemArray0.getClass();
        org.junit.Assert.assertNotNull(itemArray0);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test2201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2201");
        ds.Item item0 = null;
        ds.Item[] itemArray1 = new ds.Item[] { item0 };
        ds.Ordenacao.heapsort(itemArray1, 0);
        ds.Ordenacao.heapsort(itemArray1, 1);
        ds.Ordenacao.heapsort(itemArray1, 1);
        ds.Ordenacao.selecao(itemArray1, (int) (short) 1);
        ds.Ordenacao.selecao(itemArray1, (int) (short) 1);
        ds.Ordenacao.insercao(itemArray1, 0);
        ds.Ordenacao.heapsort(itemArray1, (int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            ds.Ordenacao.quicksort(itemArray1, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray1);
    }

    @Test
    public void test2202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2202");
        ds.Item[] itemArray0 = new ds.Item[] {};
        ds.Ordenacao.heapsort(itemArray0, 0);
        ds.Ordenacao.heapsort(itemArray0, (int) (byte) 0);
        ds.Ordenacao.shellsort(itemArray0, 0);
        ds.Ordenacao.heapsort(itemArray0, (int) (byte) -1);
        ds.Ordenacao.selecao(itemArray0, (int) (byte) 1);
        ds.Ordenacao.insercao(itemArray0, 0);
        // The following exception was thrown during execution in test generation
        try {
            ds.Ordenacao.shellsort(itemArray0, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray0);
    }

    @Test
    public void test2203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2203");
        ds.Item[] itemArray0 = new ds.Item[] {};
        ds.Ordenacao.heapsort(itemArray0, 0);
        ds.Ordenacao.insercao(itemArray0, 0);
        ds.Ordenacao.selecao(itemArray0, 0);
        ds.Ordenacao.insercao(itemArray0, (-1));
        ds.Ordenacao.insercao(itemArray0, (int) (byte) -1);
        ds.Ordenacao.heapsort(itemArray0, (int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            ds.Ordenacao.quicksort(itemArray0, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray0);
    }

    @Test
    public void test2204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2204");
        ds.Item[] itemArray0 = new ds.Item[] {};
        ds.Ordenacao.heapsort(itemArray0, 0);
        ds.Ordenacao.heapsort(itemArray0, (int) (byte) 0);
        ds.Ordenacao.shellsort(itemArray0, 0);
        ds.Ordenacao.heapsort(itemArray0, (int) (byte) -1);
        ds.Ordenacao.heapsort(itemArray0, (int) (byte) 1);
        ds.Ordenacao.heapsort(itemArray0, 0);
        ds.Ordenacao.heapsort(itemArray0, (-1));
        // The following exception was thrown during execution in test generation
        try {
            ds.Ordenacao.selecao(itemArray0, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 2");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray0);
    }

    @Test
    public void test2205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2205");
        ds.Item[] itemArray0 = new ds.Item[] {};
        ds.Ordenacao.heapsort(itemArray0, 0);
        ds.Ordenacao.insercao(itemArray0, 0);
        ds.Ordenacao.selecao(itemArray0, 0);
        ds.Ordenacao.insercao(itemArray0, (-1));
        ds.Ordenacao.heapsort(itemArray0, (-1));
        ds.Ordenacao.selecao(itemArray0, 1);
        ds.Ordenacao.shellsort(itemArray0, 0);
        ds.Ordenacao.insercao(itemArray0, 0);
        java.lang.Class<?> wildcardClass17 = itemArray0.getClass();
        org.junit.Assert.assertNotNull(itemArray0);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test2206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2206");
        ds.Item[] itemArray0 = new ds.Item[] {};
        ds.Ordenacao.heapsort(itemArray0, 0);
        ds.Ordenacao.insercao(itemArray0, 0);
        ds.Ordenacao.shellsort(itemArray0, (-1));
        ds.Ordenacao.insercao(itemArray0, (int) (byte) 0);
        ds.Ordenacao.heapsort(itemArray0, (int) (byte) -1);
        ds.Ordenacao.shellsort(itemArray0, 0);
        // The following exception was thrown during execution in test generation
        try {
            ds.Ordenacao.selecao(itemArray0, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 2");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray0);
    }

    @Test
    public void test2207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2207");
        ds.Item[] itemArray0 = new ds.Item[] {};
        ds.Ordenacao.heapsort(itemArray0, 0);
        ds.Ordenacao.insercao(itemArray0, 0);
        ds.Ordenacao.shellsort(itemArray0, (-1));
        ds.Ordenacao.insercao(itemArray0, (int) (byte) 0);
        ds.Ordenacao.heapsort(itemArray0, (int) (short) 0);
        org.junit.Assert.assertNotNull(itemArray0);
    }

    @Test
    public void test2208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2208");
        ds.Item[] itemArray0 = new ds.Item[] {};
        ds.Ordenacao.heapsort(itemArray0, 0);
        ds.Ordenacao.insercao(itemArray0, 0);
        ds.Ordenacao.insercao(itemArray0, (int) (short) 0);
        ds.Ordenacao.selecao(itemArray0, 1);
        ds.Ordenacao.selecao(itemArray0, (int) (short) -1);
        ds.Ordenacao.insercao(itemArray0, 0);
        ds.Ordenacao.selecao(itemArray0, 0);
        ds.Ordenacao.shellsort(itemArray0, (int) (short) -1);
        ds.Ordenacao.heapsort(itemArray0, (int) (byte) 1);
        ds.Ordenacao.selecao(itemArray0, (int) (short) 1);
        ds.Ordenacao.shellsort(itemArray0, 0);
        ds.Ordenacao.selecao(itemArray0, (int) (short) 1);
        org.junit.Assert.assertNotNull(itemArray0);
    }

    @Test
    public void test2209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2209");
        ds.Item[] itemArray0 = new ds.Item[] {};
        ds.Ordenacao.heapsort(itemArray0, 0);
        ds.Ordenacao.insercao(itemArray0, 0);
        ds.Ordenacao.shellsort(itemArray0, (-1));
        ds.Ordenacao.selecao(itemArray0, (-1));
        ds.Ordenacao.heapsort(itemArray0, (int) (short) 0);
        ds.Ordenacao.heapsort(itemArray0, 0);
        ds.Ordenacao.selecao(itemArray0, 0);
        ds.Ordenacao.insercao(itemArray0, (-1));
        ds.Ordenacao.heapsort(itemArray0, (int) (byte) 0);
        ds.Ordenacao.heapsort(itemArray0, (-1));
        ds.Ordenacao.heapsort(itemArray0, 0);
        java.lang.Class<?> wildcardClass23 = itemArray0.getClass();
        org.junit.Assert.assertNotNull(itemArray0);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test2210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2210");
        ds.Item[] itemArray0 = new ds.Item[] {};
        ds.Ordenacao.heapsort(itemArray0, 0);
        ds.Ordenacao.insercao(itemArray0, 0);
        ds.Ordenacao.shellsort(itemArray0, (-1));
        ds.Ordenacao.insercao(itemArray0, (int) (byte) 1);
        ds.Ordenacao.insercao(itemArray0, (int) (byte) 0);
        ds.Ordenacao.selecao(itemArray0, (int) (short) -1);
        ds.Ordenacao.insercao(itemArray0, 1);
        // The following exception was thrown during execution in test generation
        try {
            ds.Ordenacao.selecao(itemArray0, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 2");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray0);
    }

    @Test
    public void test2211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2211");
        ds.Item[] itemArray0 = new ds.Item[] {};
        ds.Ordenacao.heapsort(itemArray0, 0);
        ds.Ordenacao.insercao(itemArray0, 0);
        ds.Ordenacao.insercao(itemArray0, (int) (short) 0);
        ds.Ordenacao.selecao(itemArray0, 1);
        ds.Ordenacao.selecao(itemArray0, (int) (short) -1);
        ds.Ordenacao.shellsort(itemArray0, (int) (short) -1);
        ds.Ordenacao.insercao(itemArray0, 0);
        ds.Ordenacao.insercao(itemArray0, 1);
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
    public void test2212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2212");
        ds.Item[] itemArray0 = new ds.Item[] {};
        ds.Ordenacao.heapsort(itemArray0, 0);
        ds.Ordenacao.insercao(itemArray0, 0);
        ds.Ordenacao.insercao(itemArray0, (int) (short) 0);
        ds.Ordenacao.selecao(itemArray0, 1);
        ds.Ordenacao.shellsort(itemArray0, (int) (short) 1);
        ds.Ordenacao.insercao(itemArray0, (int) (short) 1);
        ds.Ordenacao.selecao(itemArray0, 0);
        ds.Ordenacao.shellsort(itemArray0, (-1));
        ds.Ordenacao.insercao(itemArray0, (int) (byte) -1);
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
    public void test2213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2213");
        ds.Item[] itemArray0 = new ds.Item[] {};
        ds.Ordenacao.heapsort(itemArray0, 0);
        ds.Ordenacao.insercao(itemArray0, 0);
        ds.Ordenacao.selecao(itemArray0, 0);
        ds.Ordenacao.shellsort(itemArray0, (int) (short) 1);
        ds.Ordenacao.shellsort(itemArray0, 0);
        // The following exception was thrown during execution in test generation
        try {
            ds.Ordenacao.quicksort(itemArray0, 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray0);
    }

    @Test
    public void test2214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2214");
        ds.Item[] itemArray0 = new ds.Item[] {};
        ds.Ordenacao.heapsort(itemArray0, 0);
        ds.Ordenacao.insercao(itemArray0, 0);
        ds.Ordenacao.shellsort(itemArray0, (-1));
        ds.Ordenacao.insercao(itemArray0, (int) (byte) 1);
        ds.Ordenacao.selecao(itemArray0, 0);
        ds.Ordenacao.insercao(itemArray0, 0);
        ds.Ordenacao.shellsort(itemArray0, (-1));
        org.junit.Assert.assertNotNull(itemArray0);
    }

    @Test
    public void test2215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2215");
        ds.Item[] itemArray0 = new ds.Item[] {};
        ds.Ordenacao.heapsort(itemArray0, 0);
        ds.Ordenacao.insercao(itemArray0, 0);
        ds.Ordenacao.shellsort(itemArray0, (-1));
        ds.Ordenacao.shellsort(itemArray0, (int) (byte) -1);
        ds.Ordenacao.selecao(itemArray0, (int) (byte) -1);
        ds.Ordenacao.heapsort(itemArray0, (int) (byte) -1);
        ds.Ordenacao.heapsort(itemArray0, (int) (byte) 1);
        ds.Ordenacao.selecao(itemArray0, (int) (byte) 1);
        ds.Ordenacao.insercao(itemArray0, (int) (short) 1);
        ds.Ordenacao.insercao(itemArray0, (-1));
        ds.Ordenacao.insercao(itemArray0, (int) (short) 0);
        ds.Ordenacao.heapsort(itemArray0, 0);
        // The following exception was thrown during execution in test generation
        try {
            ds.Ordenacao.heapsort(itemArray0, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray0);
    }

    @Test
    public void test2216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2216");
        ds.Item[] itemArray0 = new ds.Item[] {};
        ds.Ordenacao.heapsort(itemArray0, 0);
        ds.Ordenacao.insercao(itemArray0, 0);
        ds.Ordenacao.shellsort(itemArray0, (-1));
        ds.Ordenacao.insercao(itemArray0, (int) (byte) 1);
        ds.Ordenacao.selecao(itemArray0, 0);
        ds.Ordenacao.selecao(itemArray0, (int) (byte) -1);
        ds.Ordenacao.selecao(itemArray0, 0);
        ds.Ordenacao.insercao(itemArray0, (int) (byte) 1);
        ds.Ordenacao.heapsort(itemArray0, (int) (short) 1);
        ds.Ordenacao.heapsort(itemArray0, (int) (short) -1);
        ds.Ordenacao.insercao(itemArray0, (int) (byte) -1);
        ds.Ordenacao.heapsort(itemArray0, 1);
        ds.Ordenacao.heapsort(itemArray0, (int) (byte) 1);
        ds.Ordenacao.selecao(itemArray0, (int) (short) -1);
        ds.Ordenacao.heapsort(itemArray0, 0);
        ds.Ordenacao.shellsort(itemArray0, 0);
        // The following exception was thrown during execution in test generation
        try {
            ds.Ordenacao.quicksort(itemArray0, 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray0);
    }

    @Test
    public void test2217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2217");
        ds.Item[] itemArray0 = new ds.Item[] {};
        ds.Ordenacao.heapsort(itemArray0, 0);
        ds.Ordenacao.insercao(itemArray0, 0);
        ds.Ordenacao.insercao(itemArray0, (int) (short) 0);
        ds.Ordenacao.selecao(itemArray0, 1);
        ds.Ordenacao.selecao(itemArray0, (int) (short) -1);
        ds.Ordenacao.insercao(itemArray0, 0);
        ds.Ordenacao.heapsort(itemArray0, (int) (byte) 1);
        ds.Ordenacao.shellsort(itemArray0, 0);
        ds.Ordenacao.shellsort(itemArray0, (int) (short) 1);
        ds.Ordenacao.heapsort(itemArray0, (int) (byte) -1);
        // The following exception was thrown during execution in test generation
        try {
            ds.Ordenacao.selecao(itemArray0, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 2");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray0);
    }

    @Test
    public void test2218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2218");
        ds.Item[] itemArray0 = new ds.Item[] {};
        ds.Ordenacao.heapsort(itemArray0, 0);
        ds.Ordenacao.insercao(itemArray0, 0);
        ds.Ordenacao.shellsort(itemArray0, (-1));
        ds.Ordenacao.insercao(itemArray0, (int) (byte) 1);
        ds.Ordenacao.insercao(itemArray0, 1);
        ds.Ordenacao.shellsort(itemArray0, (int) (byte) 0);
        ds.Ordenacao.shellsort(itemArray0, (-1));
        ds.Ordenacao.selecao(itemArray0, (int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            ds.Ordenacao.insercao(itemArray0, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray0);
    }

    @Test
    public void test2219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2219");
        ds.Item[] itemArray0 = new ds.Item[] {};
        ds.Ordenacao.heapsort(itemArray0, 0);
        ds.Ordenacao.insercao(itemArray0, 0);
        ds.Ordenacao.insercao(itemArray0, (int) (short) 0);
        ds.Ordenacao.selecao(itemArray0, 1);
        ds.Ordenacao.selecao(itemArray0, (int) (short) -1);
        ds.Ordenacao.heapsort(itemArray0, (int) (short) 1);
        ds.Ordenacao.selecao(itemArray0, (int) (short) 0);
        ds.Ordenacao.insercao(itemArray0, (int) (byte) -1);
        ds.Ordenacao.heapsort(itemArray0, (-1));
        ds.Ordenacao.insercao(itemArray0, (int) (short) 0);
        ds.Ordenacao.heapsort(itemArray0, 0);
        java.lang.Class<?> wildcardClass23 = itemArray0.getClass();
        org.junit.Assert.assertNotNull(itemArray0);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test2220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2220");
        ds.Item[] itemArray0 = new ds.Item[] {};
        ds.Ordenacao.heapsort(itemArray0, 0);
        ds.Ordenacao.insercao(itemArray0, 0);
        ds.Ordenacao.selecao(itemArray0, 0);
        ds.Ordenacao.insercao(itemArray0, (-1));
        ds.Ordenacao.heapsort(itemArray0, (-1));
        ds.Ordenacao.insercao(itemArray0, 0);
        ds.Ordenacao.selecao(itemArray0, (int) (byte) -1);
        ds.Ordenacao.selecao(itemArray0, 0);
        ds.Ordenacao.shellsort(itemArray0, 0);
        ds.Ordenacao.heapsort(itemArray0, (int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            ds.Ordenacao.quicksort(itemArray0, 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray0);
    }

    @Test
    public void test2221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2221");
        ds.Item[] itemArray0 = new ds.Item[] {};
        ds.Ordenacao.heapsort(itemArray0, 0);
        ds.Ordenacao.insercao(itemArray0, 0);
        ds.Ordenacao.selecao(itemArray0, 0);
        ds.Ordenacao.shellsort(itemArray0, 0);
        ds.Ordenacao.insercao(itemArray0, (int) (short) 0);
        ds.Ordenacao.selecao(itemArray0, (int) (short) 0);
        ds.Ordenacao.selecao(itemArray0, (int) (short) 1);
        java.lang.Class<?> wildcardClass15 = itemArray0.getClass();
        org.junit.Assert.assertNotNull(itemArray0);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test2222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2222");
        ds.Item[] itemArray0 = new ds.Item[] {};
        ds.Ordenacao.heapsort(itemArray0, 0);
        ds.Ordenacao.insercao(itemArray0, 0);
        ds.Ordenacao.shellsort(itemArray0, (-1));
        ds.Ordenacao.selecao(itemArray0, (-1));
        ds.Ordenacao.shellsort(itemArray0, (int) (byte) 0);
        ds.Ordenacao.insercao(itemArray0, (int) (short) -1);
        ds.Ordenacao.insercao(itemArray0, (int) (short) 1);
        ds.Ordenacao.shellsort(itemArray0, (int) (short) -1);
        org.junit.Assert.assertNotNull(itemArray0);
    }

    @Test
    public void test2223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2223");
        ds.Item[] itemArray0 = new ds.Item[] {};
        ds.Ordenacao.heapsort(itemArray0, 0);
        ds.Ordenacao.insercao(itemArray0, 0);
        ds.Ordenacao.shellsort(itemArray0, (-1));
        ds.Ordenacao.shellsort(itemArray0, (int) (byte) -1);
        ds.Ordenacao.selecao(itemArray0, (int) (byte) -1);
        ds.Ordenacao.heapsort(itemArray0, (int) (byte) -1);
        ds.Ordenacao.heapsort(itemArray0, (int) (byte) 1);
        ds.Ordenacao.selecao(itemArray0, (int) (byte) 1);
        ds.Ordenacao.insercao(itemArray0, (int) (short) 1);
        ds.Ordenacao.selecao(itemArray0, 0);
        ds.Ordenacao.selecao(itemArray0, (int) (byte) 0);
        java.lang.Class<?> wildcardClass23 = itemArray0.getClass();
        org.junit.Assert.assertNotNull(itemArray0);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test2224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2224");
        ds.Item item0 = null;
        ds.Item[] itemArray1 = new ds.Item[] { item0 };
        ds.Ordenacao.heapsort(itemArray1, 0);
        ds.Ordenacao.shellsort(itemArray1, (int) (byte) 0);
        ds.Ordenacao.heapsort(itemArray1, (-1));
        ds.Ordenacao.heapsort(itemArray1, (-1));
        // The following exception was thrown during execution in test generation
        try {
            ds.Ordenacao.quicksort(itemArray1, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray1);
    }

    @Test
    public void test2225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2225");
        ds.Item[] itemArray0 = new ds.Item[] {};
        ds.Ordenacao.heapsort(itemArray0, 0);
        ds.Ordenacao.insercao(itemArray0, 0);
        ds.Ordenacao.selecao(itemArray0, 0);
        ds.Ordenacao.insercao(itemArray0, (-1));
        ds.Ordenacao.insercao(itemArray0, (int) (byte) -1);
        // The following exception was thrown during execution in test generation
        try {
            ds.Ordenacao.heapsort(itemArray0, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray0);
    }

    @Test
    public void test2226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2226");
        ds.Item[] itemArray0 = new ds.Item[] {};
        ds.Ordenacao.heapsort(itemArray0, 0);
        ds.Ordenacao.insercao(itemArray0, 0);
        ds.Ordenacao.shellsort(itemArray0, (-1));
        ds.Ordenacao.selecao(itemArray0, (-1));
        ds.Ordenacao.heapsort(itemArray0, (int) (short) 0);
        ds.Ordenacao.selecao(itemArray0, 1);
        ds.Ordenacao.heapsort(itemArray0, (int) (short) 1);
        ds.Ordenacao.heapsort(itemArray0, (int) (byte) 1);
        ds.Ordenacao.insercao(itemArray0, (int) (short) -1);
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
    public void test2227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2227");
        ds.Item[] itemArray0 = new ds.Item[] {};
        ds.Ordenacao.heapsort(itemArray0, 0);
        ds.Ordenacao.insercao(itemArray0, 0);
        ds.Ordenacao.insercao(itemArray0, (int) (short) 0);
        ds.Ordenacao.selecao(itemArray0, 1);
        ds.Ordenacao.selecao(itemArray0, 0);
        ds.Ordenacao.insercao(itemArray0, 0);
        ds.Ordenacao.heapsort(itemArray0, (-1));
        ds.Ordenacao.heapsort(itemArray0, (int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            ds.Ordenacao.heapsort(itemArray0, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray0);
    }

    @Test
    public void test2228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2228");
        ds.Item[] itemArray0 = new ds.Item[] {};
        ds.Ordenacao.heapsort(itemArray0, 0);
        ds.Ordenacao.insercao(itemArray0, 0);
        ds.Ordenacao.insercao(itemArray0, (int) (short) 0);
        ds.Ordenacao.selecao(itemArray0, 1);
        ds.Ordenacao.selecao(itemArray0, (int) (short) -1);
        ds.Ordenacao.insercao(itemArray0, 0);
        ds.Ordenacao.heapsort(itemArray0, (int) (short) -1);
        ds.Ordenacao.shellsort(itemArray0, 0);
        ds.Ordenacao.shellsort(itemArray0, (-1));
        ds.Ordenacao.shellsort(itemArray0, (int) (byte) 0);
        java.lang.Class<?> wildcardClass21 = itemArray0.getClass();
        org.junit.Assert.assertNotNull(itemArray0);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test2229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2229");
        ds.Item[] itemArray0 = new ds.Item[] {};
        ds.Ordenacao.heapsort(itemArray0, 0);
        ds.Ordenacao.insercao(itemArray0, 0);
        ds.Ordenacao.insercao(itemArray0, (int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            ds.Ordenacao.selecao(itemArray0, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 2");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray0);
    }

    @Test
    public void test2230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2230");
        ds.Item[] itemArray0 = new ds.Item[] {};
        ds.Ordenacao.heapsort(itemArray0, 0);
        ds.Ordenacao.heapsort(itemArray0, 0);
        ds.Ordenacao.insercao(itemArray0, (int) (short) -1);
        ds.Ordenacao.heapsort(itemArray0, (int) (short) 1);
        java.lang.Class<?> wildcardClass9 = itemArray0.getClass();
        org.junit.Assert.assertNotNull(itemArray0);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test2231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2231");
        ds.Item[] itemArray0 = new ds.Item[] {};
        ds.Ordenacao.heapsort(itemArray0, 0);
        ds.Ordenacao.insercao(itemArray0, 0);
        ds.Ordenacao.selecao(itemArray0, 0);
        ds.Ordenacao.insercao(itemArray0, (-1));
        ds.Ordenacao.insercao(itemArray0, (int) (byte) -1);
        ds.Ordenacao.heapsort(itemArray0, (int) (byte) 0);
        ds.Ordenacao.shellsort(itemArray0, 0);
        ds.Ordenacao.insercao(itemArray0, (-1));
        org.junit.Assert.assertNotNull(itemArray0);
    }

    @Test
    public void test2232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2232");
        ds.Item[] itemArray0 = new ds.Item[] {};
        ds.Ordenacao.heapsort(itemArray0, 0);
        ds.Ordenacao.heapsort(itemArray0, (int) (byte) 0);
        ds.Ordenacao.shellsort(itemArray0, 0);
        ds.Ordenacao.insercao(itemArray0, (-1));
        ds.Ordenacao.heapsort(itemArray0, (int) (short) 1);
        ds.Ordenacao.insercao(itemArray0, (int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            ds.Ordenacao.shellsort(itemArray0, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray0);
    }

    @Test
    public void test2233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2233");
        ds.Item[] itemArray0 = new ds.Item[] {};
        ds.Ordenacao.heapsort(itemArray0, 0);
        ds.Ordenacao.insercao(itemArray0, 0);
        ds.Ordenacao.shellsort(itemArray0, (-1));
        ds.Ordenacao.selecao(itemArray0, (int) (short) -1);
        ds.Ordenacao.insercao(itemArray0, 1);
        ds.Ordenacao.shellsort(itemArray0, 0);
        ds.Ordenacao.heapsort(itemArray0, (int) (byte) -1);
        ds.Ordenacao.heapsort(itemArray0, 1);
        org.junit.Assert.assertNotNull(itemArray0);
    }

    @Test
    public void test2234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2234");
        ds.Item[] itemArray0 = new ds.Item[] {};
        ds.Ordenacao.heapsort(itemArray0, 0);
        ds.Ordenacao.heapsort(itemArray0, 0);
        ds.Ordenacao.shellsort(itemArray0, (int) (byte) 0);
        ds.Ordenacao.insercao(itemArray0, 0);
        ds.Ordenacao.heapsort(itemArray0, 1);
        ds.Ordenacao.heapsort(itemArray0, (int) (byte) 1);
        ds.Ordenacao.heapsort(itemArray0, (int) (short) -1);
        org.junit.Assert.assertNotNull(itemArray0);
    }

    @Test
    public void test2235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2235");
        ds.Item[] itemArray0 = new ds.Item[] {};
        ds.Ordenacao.heapsort(itemArray0, 0);
        ds.Ordenacao.insercao(itemArray0, 0);
        ds.Ordenacao.shellsort(itemArray0, (-1));
        ds.Ordenacao.insercao(itemArray0, (int) (byte) 1);
        ds.Ordenacao.selecao(itemArray0, 0);
        ds.Ordenacao.shellsort(itemArray0, 1);
        ds.Ordenacao.selecao(itemArray0, (-1));
        ds.Ordenacao.shellsort(itemArray0, (-1));
        ds.Ordenacao.selecao(itemArray0, (int) (byte) 0);
        java.lang.Class<?> wildcardClass19 = itemArray0.getClass();
        org.junit.Assert.assertNotNull(itemArray0);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test2236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2236");
        ds.Item item0 = null;
        ds.Item[] itemArray1 = new ds.Item[] { item0 };
        ds.Ordenacao.heapsort(itemArray1, 0);
        ds.Ordenacao.heapsort(itemArray1, 1);
        ds.Ordenacao.heapsort(itemArray1, 1);
        ds.Ordenacao.selecao(itemArray1, (int) (short) 1);
        ds.Ordenacao.selecao(itemArray1, (-1));
        ds.Ordenacao.selecao(itemArray1, (-1));
        ds.Ordenacao.insercao(itemArray1, 0);
        ds.Ordenacao.insercao(itemArray1, (int) (short) 0);
        org.junit.Assert.assertNotNull(itemArray1);
    }

    @Test
    public void test2237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2237");
        ds.Item[] itemArray0 = new ds.Item[] {};
        ds.Ordenacao.heapsort(itemArray0, 0);
        ds.Ordenacao.insercao(itemArray0, 0);
        ds.Ordenacao.selecao(itemArray0, 0);
        ds.Ordenacao.shellsort(itemArray0, (int) (byte) 1);
        ds.Ordenacao.insercao(itemArray0, 0);
        ds.Ordenacao.shellsort(itemArray0, (int) (short) 0);
        ds.Ordenacao.insercao(itemArray0, (int) (short) 0);
        ds.Ordenacao.heapsort(itemArray0, 1);
        ds.Ordenacao.insercao(itemArray0, (int) (byte) 0);
        org.junit.Assert.assertNotNull(itemArray0);
    }

    @Test
    public void test2238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2238");
        ds.Item[] itemArray0 = new ds.Item[] {};
        ds.Ordenacao.shellsort(itemArray0, (int) (short) 1);
        ds.Ordenacao.heapsort(itemArray0, 1);
        ds.Ordenacao.selecao(itemArray0, 1);
        org.junit.Assert.assertNotNull(itemArray0);
    }

    @Test
    public void test2239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2239");
        ds.Item[] itemArray0 = new ds.Item[] {};
        ds.Ordenacao.heapsort(itemArray0, 0);
        ds.Ordenacao.insercao(itemArray0, 0);
        ds.Ordenacao.shellsort(itemArray0, (-1));
        ds.Ordenacao.insercao(itemArray0, (int) (byte) 1);
        ds.Ordenacao.selecao(itemArray0, 0);
        ds.Ordenacao.shellsort(itemArray0, 1);
        ds.Ordenacao.insercao(itemArray0, (-1));
        ds.Ordenacao.insercao(itemArray0, (int) (byte) 0);
        ds.Ordenacao.insercao(itemArray0, (int) (byte) -1);
        // The following exception was thrown during execution in test generation
        try {
            ds.Ordenacao.quicksort(itemArray0, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 49");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray0);
    }

    @Test
    public void test2240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2240");
        ds.Item[] itemArray0 = new ds.Item[] {};
        ds.Ordenacao.heapsort(itemArray0, 0);
        ds.Ordenacao.heapsort(itemArray0, (int) (byte) 0);
        ds.Ordenacao.shellsort(itemArray0, 0);
        ds.Ordenacao.heapsort(itemArray0, (int) (byte) -1);
        ds.Ordenacao.heapsort(itemArray0, (int) (byte) 1);
        ds.Ordenacao.selecao(itemArray0, 0);
        ds.Ordenacao.insercao(itemArray0, (int) (short) 1);
        ds.Ordenacao.insercao(itemArray0, 0);
        org.junit.Assert.assertNotNull(itemArray0);
    }

    @Test
    public void test2241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2241");
        ds.Item[] itemArray0 = new ds.Item[] {};
        ds.Ordenacao.heapsort(itemArray0, 0);
        ds.Ordenacao.insercao(itemArray0, 0);
        ds.Ordenacao.shellsort(itemArray0, (-1));
        ds.Ordenacao.insercao(itemArray0, (int) (byte) 1);
        ds.Ordenacao.selecao(itemArray0, 0);
        ds.Ordenacao.shellsort(itemArray0, 1);
        ds.Ordenacao.insercao(itemArray0, (-1));
        ds.Ordenacao.insercao(itemArray0, (int) (byte) 0);
        ds.Ordenacao.heapsort(itemArray0, (int) (byte) 1);
        ds.Ordenacao.shellsort(itemArray0, 0);
        // The following exception was thrown during execution in test generation
        try {
            ds.Ordenacao.insercao(itemArray0, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray0);
    }

    @Test
    public void test2242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2242");
        ds.Item item0 = null;
        ds.Item[] itemArray1 = new ds.Item[] { item0 };
        ds.Ordenacao.heapsort(itemArray1, 0);
        ds.Ordenacao.shellsort(itemArray1, (int) (byte) 0);
        ds.Ordenacao.heapsort(itemArray1, (-1));
        ds.Ordenacao.insercao(itemArray1, (int) (byte) 1);
        ds.Ordenacao.heapsort(itemArray1, 0);
        java.lang.Class<?> wildcardClass12 = itemArray1.getClass();
        org.junit.Assert.assertNotNull(itemArray1);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test2243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2243");
        ds.Item[] itemArray0 = new ds.Item[] {};
        ds.Ordenacao.heapsort(itemArray0, 0);
        ds.Ordenacao.insercao(itemArray0, 0);
        ds.Ordenacao.insercao(itemArray0, (int) (short) 0);
        ds.Ordenacao.selecao(itemArray0, 1);
        ds.Ordenacao.shellsort(itemArray0, (int) (short) 1);
        ds.Ordenacao.shellsort(itemArray0, 0);
        ds.Ordenacao.selecao(itemArray0, 0);
        ds.Ordenacao.selecao(itemArray0, (-1));
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
    public void test2244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2244");
        ds.Item[] itemArray0 = new ds.Item[] {};
        ds.Ordenacao.heapsort(itemArray0, 0);
        ds.Ordenacao.insercao(itemArray0, 0);
        ds.Ordenacao.shellsort(itemArray0, (-1));
        ds.Ordenacao.insercao(itemArray0, (int) (byte) 1);
        ds.Ordenacao.selecao(itemArray0, 0);
        ds.Ordenacao.shellsort(itemArray0, 1);
        ds.Ordenacao.insercao(itemArray0, (-1));
        ds.Ordenacao.insercao(itemArray0, (int) (byte) 0);
        ds.Ordenacao.selecao(itemArray0, (int) (byte) -1);
        ds.Ordenacao.selecao(itemArray0, 0);
        // The following exception was thrown during execution in test generation
        try {
            ds.Ordenacao.quicksort(itemArray0, 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray0);
    }

    @Test
    public void test2245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2245");
        ds.Item[] itemArray0 = new ds.Item[] {};
        ds.Ordenacao.heapsort(itemArray0, 0);
        ds.Ordenacao.insercao(itemArray0, 0);
        ds.Ordenacao.insercao(itemArray0, (int) (short) 0);
        ds.Ordenacao.selecao(itemArray0, 1);
        ds.Ordenacao.shellsort(itemArray0, (int) (short) 1);
        ds.Ordenacao.shellsort(itemArray0, 0);
        ds.Ordenacao.selecao(itemArray0, 0);
        ds.Ordenacao.heapsort(itemArray0, 0);
        ds.Ordenacao.heapsort(itemArray0, (int) (byte) 0);
        ds.Ordenacao.heapsort(itemArray0, 0);
        // The following exception was thrown during execution in test generation
        try {
            ds.Ordenacao.quicksort(itemArray0, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 50");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray0);
    }

    @Test
    public void test2246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2246");
        ds.Item[] itemArray0 = new ds.Item[] {};
        ds.Ordenacao.heapsort(itemArray0, 0);
        ds.Ordenacao.insercao(itemArray0, 0);
        ds.Ordenacao.insercao(itemArray0, (int) (short) 0);
        ds.Ordenacao.selecao(itemArray0, 1);
        ds.Ordenacao.selecao(itemArray0, (int) (short) -1);
        ds.Ordenacao.insercao(itemArray0, 0);
        ds.Ordenacao.heapsort(itemArray0, (int) (byte) 1);
        ds.Ordenacao.shellsort(itemArray0, 0);
        ds.Ordenacao.selecao(itemArray0, (int) (short) 1);
        java.lang.Class<?> wildcardClass19 = itemArray0.getClass();
        org.junit.Assert.assertNotNull(itemArray0);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test2247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2247");
        ds.Item[] itemArray0 = new ds.Item[] {};
        ds.Ordenacao.heapsort(itemArray0, 0);
        ds.Ordenacao.insercao(itemArray0, 0);
        ds.Ordenacao.insercao(itemArray0, (int) (short) 0);
        ds.Ordenacao.selecao(itemArray0, 1);
        ds.Ordenacao.selecao(itemArray0, (int) (short) -1);
        ds.Ordenacao.insercao(itemArray0, 0);
        ds.Ordenacao.heapsort(itemArray0, (int) (short) -1);
        ds.Ordenacao.heapsort(itemArray0, (int) (byte) -1);
        ds.Ordenacao.shellsort(itemArray0, (int) (short) 1);
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
    public void test2248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2248");
        ds.Item[] itemArray0 = new ds.Item[] {};
        ds.Ordenacao.heapsort(itemArray0, 0);
        ds.Ordenacao.insercao(itemArray0, 0);
        ds.Ordenacao.insercao(itemArray0, (int) (short) 0);
        ds.Ordenacao.selecao(itemArray0, 1);
        ds.Ordenacao.selecao(itemArray0, (int) (short) -1);
        ds.Ordenacao.shellsort(itemArray0, (int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            ds.Ordenacao.shellsort(itemArray0, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray0);
    }

    @Test
    public void test2249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2249");
        ds.Item[] itemArray0 = new ds.Item[] {};
        ds.Ordenacao.heapsort(itemArray0, 0);
        ds.Ordenacao.insercao(itemArray0, 0);
        ds.Ordenacao.selecao(itemArray0, 0);
        ds.Ordenacao.insercao(itemArray0, (-1));
        ds.Ordenacao.insercao(itemArray0, (int) (byte) -1);
        ds.Ordenacao.heapsort(itemArray0, (int) (byte) -1);
        ds.Ordenacao.insercao(itemArray0, 0);
        ds.Ordenacao.heapsort(itemArray0, (int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            ds.Ordenacao.selecao(itemArray0, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 2");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray0);
    }

    @Test
    public void test2250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2250");
        ds.Item item0 = null;
        ds.Item[] itemArray1 = new ds.Item[] { item0 };
        ds.Ordenacao.heapsort(itemArray1, 0);
        ds.Ordenacao.heapsort(itemArray1, 1);
        ds.Ordenacao.heapsort(itemArray1, 1);
        ds.Ordenacao.selecao(itemArray1, (int) (short) 1);
        ds.Ordenacao.selecao(itemArray1, (int) (short) 1);
        ds.Ordenacao.insercao(itemArray1, (int) (byte) -1);
        ds.Ordenacao.selecao(itemArray1, (int) (short) 1);
        ds.Ordenacao.selecao(itemArray1, 1);
        // The following exception was thrown during execution in test generation
        try {
            ds.Ordenacao.shellsort(itemArray1, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 41");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray1);
    }

    @Test
    public void test2251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2251");
        ds.Item item0 = null;
        ds.Item[] itemArray1 = new ds.Item[] { item0 };
        ds.Ordenacao.heapsort(itemArray1, 0);
        ds.Ordenacao.heapsort(itemArray1, 1);
        ds.Ordenacao.heapsort(itemArray1, 1);
        ds.Ordenacao.selecao(itemArray1, (int) (short) 1);
        ds.Ordenacao.selecao(itemArray1, (int) (short) 1);
        ds.Ordenacao.insercao(itemArray1, 0);
        ds.Ordenacao.heapsort(itemArray1, (int) (short) -1);
        ds.Ordenacao.insercao(itemArray1, 0);
        // The following exception was thrown during execution in test generation
        try {
            ds.Ordenacao.insercao(itemArray1, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray1);
    }

    @Test
    public void test2252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2252");
        ds.Item item0 = null;
        ds.Item[] itemArray1 = new ds.Item[] { item0 };
        ds.Ordenacao.heapsort(itemArray1, 0);
        ds.Ordenacao.shellsort(itemArray1, (int) (byte) 0);
        ds.Ordenacao.heapsort(itemArray1, (-1));
        ds.Ordenacao.heapsort(itemArray1, (-1));
        ds.Ordenacao.selecao(itemArray1, (int) (byte) 0);
        org.junit.Assert.assertNotNull(itemArray1);
    }

    @Test
    public void test2253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2253");
        ds.Item[] itemArray0 = new ds.Item[] {};
        ds.Ordenacao.heapsort(itemArray0, 0);
        ds.Ordenacao.insercao(itemArray0, 0);
        ds.Ordenacao.shellsort(itemArray0, (-1));
        ds.Ordenacao.shellsort(itemArray0, (int) (byte) -1);
        ds.Ordenacao.selecao(itemArray0, (int) (byte) -1);
        ds.Ordenacao.heapsort(itemArray0, (int) (byte) -1);
        ds.Ordenacao.heapsort(itemArray0, (int) (byte) 1);
        ds.Ordenacao.selecao(itemArray0, (int) (byte) 1);
        ds.Ordenacao.insercao(itemArray0, (int) (short) 1);
        ds.Ordenacao.selecao(itemArray0, 0);
        ds.Ordenacao.shellsort(itemArray0, 0);
        org.junit.Assert.assertNotNull(itemArray0);
    }

    @Test
    public void test2254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2254");
        ds.Item[] itemArray0 = new ds.Item[] {};
        ds.Ordenacao.shellsort(itemArray0, (int) (short) 1);
        ds.Ordenacao.selecao(itemArray0, 1);
        ds.Ordenacao.insercao(itemArray0, (int) (byte) 0);
        ds.Ordenacao.selecao(itemArray0, (int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            ds.Ordenacao.quicksort(itemArray0, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 0");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray0);
    }

    @Test
    public void test2255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2255");
        ds.Item[] itemArray0 = new ds.Item[] {};
        ds.Ordenacao.heapsort(itemArray0, 0);
        ds.Ordenacao.insercao(itemArray0, 0);
        ds.Ordenacao.selecao(itemArray0, 0);
        ds.Ordenacao.shellsort(itemArray0, (int) (byte) 1);
        ds.Ordenacao.insercao(itemArray0, 0);
        ds.Ordenacao.shellsort(itemArray0, (int) (short) 0);
        ds.Ordenacao.insercao(itemArray0, (int) (short) 0);
        ds.Ordenacao.selecao(itemArray0, (int) (short) -1);
        ds.Ordenacao.selecao(itemArray0, (int) (short) -1);
        ds.Ordenacao.heapsort(itemArray0, (int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            ds.Ordenacao.selecao(itemArray0, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 2");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray0);
    }

    @Test
    public void test2256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2256");
        ds.Item[] itemArray0 = new ds.Item[] {};
        ds.Ordenacao.heapsort(itemArray0, 0);
        ds.Ordenacao.insercao(itemArray0, 0);
        ds.Ordenacao.insercao(itemArray0, (int) (short) 0);
        ds.Ordenacao.selecao(itemArray0, 1);
        ds.Ordenacao.shellsort(itemArray0, (int) (short) 1);
        ds.Ordenacao.insercao(itemArray0, (int) (short) 1);
        ds.Ordenacao.heapsort(itemArray0, (-1));
        ds.Ordenacao.selecao(itemArray0, (int) (short) 0);
        ds.Ordenacao.insercao(itemArray0, 0);
        org.junit.Assert.assertNotNull(itemArray0);
    }

    @Test
    public void test2257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2257");
        ds.Item[] itemArray0 = new ds.Item[] {};
        ds.Ordenacao.heapsort(itemArray0, 0);
        ds.Ordenacao.insercao(itemArray0, 0);
        ds.Ordenacao.insercao(itemArray0, (int) (short) 0);
        ds.Ordenacao.selecao(itemArray0, 1);
        ds.Ordenacao.shellsort(itemArray0, (int) (byte) -1);
        // The following exception was thrown during execution in test generation
        try {
            ds.Ordenacao.shellsort(itemArray0, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 41");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray0);
    }

    @Test
    public void test2258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2258");
        ds.Item[] itemArray0 = new ds.Item[] {};
        ds.Ordenacao.heapsort(itemArray0, 0);
        ds.Ordenacao.insercao(itemArray0, 0);
        ds.Ordenacao.insercao(itemArray0, (int) (short) 0);
        ds.Ordenacao.selecao(itemArray0, 1);
        ds.Ordenacao.selecao(itemArray0, 0);
        ds.Ordenacao.selecao(itemArray0, 0);
        ds.Ordenacao.selecao(itemArray0, (int) (byte) 1);
        ds.Ordenacao.heapsort(itemArray0, 0);
        java.lang.Class<?> wildcardClass17 = itemArray0.getClass();
        org.junit.Assert.assertNotNull(itemArray0);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test2259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2259");
        ds.Item[] itemArray0 = new ds.Item[] {};
        ds.Ordenacao.heapsort(itemArray0, 0);
        ds.Ordenacao.insercao(itemArray0, 0);
        ds.Ordenacao.shellsort(itemArray0, (-1));
        ds.Ordenacao.insercao(itemArray0, (int) (byte) 1);
        ds.Ordenacao.selecao(itemArray0, 0);
        ds.Ordenacao.insercao(itemArray0, (int) (short) 0);
        ds.Ordenacao.heapsort(itemArray0, (int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            ds.Ordenacao.heapsort(itemArray0, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray0);
    }

    @Test
    public void test2260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2260");
        ds.Item[] itemArray0 = new ds.Item[] {};
        ds.Ordenacao.shellsort(itemArray0, (int) (short) 1);
        ds.Ordenacao.selecao(itemArray0, 1);
        ds.Ordenacao.heapsort(itemArray0, (int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            ds.Ordenacao.shellsort(itemArray0, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 14");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray0);
    }

    @Test
    public void test2261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2261");
        ds.Item[] itemArray0 = new ds.Item[] {};
        ds.Ordenacao.heapsort(itemArray0, 0);
        ds.Ordenacao.insercao(itemArray0, 0);
        ds.Ordenacao.selecao(itemArray0, 0);
        ds.Ordenacao.shellsort(itemArray0, (int) (byte) 1);
        ds.Ordenacao.insercao(itemArray0, 0);
        ds.Ordenacao.shellsort(itemArray0, (int) (short) 0);
        ds.Ordenacao.shellsort(itemArray0, (-1));
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
    public void test2262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2262");
        ds.Item[] itemArray0 = new ds.Item[] {};
        ds.Ordenacao.heapsort(itemArray0, 0);
        ds.Ordenacao.insercao(itemArray0, 0);
        ds.Ordenacao.insercao(itemArray0, (int) (short) 0);
        ds.Ordenacao.selecao(itemArray0, 1);
        ds.Ordenacao.selecao(itemArray0, (int) (short) -1);
        ds.Ordenacao.shellsort(itemArray0, (int) (short) -1);
        ds.Ordenacao.heapsort(itemArray0, (int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            ds.Ordenacao.shellsort(itemArray0, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 41");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray0);
    }

    @Test
    public void test2263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2263");
        ds.Item item0 = null;
        ds.Item[] itemArray1 = new ds.Item[] { item0 };
        ds.Ordenacao.heapsort(itemArray1, 0);
        ds.Ordenacao.shellsort(itemArray1, (int) (byte) 0);
        ds.Ordenacao.heapsort(itemArray1, (-1));
        ds.Ordenacao.heapsort(itemArray1, (-1));
        // The following exception was thrown during execution in test generation
        try {
            ds.Ordenacao.selecao(itemArray1, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 2");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray1);
    }

    @Test
    public void test2264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2264");
        ds.Item[] itemArray0 = new ds.Item[] {};
        ds.Ordenacao.heapsort(itemArray0, 0);
        ds.Ordenacao.heapsort(itemArray0, 0);
        ds.Ordenacao.shellsort(itemArray0, (int) (byte) 1);
        ds.Ordenacao.insercao(itemArray0, 1);
        ds.Ordenacao.selecao(itemArray0, (int) (byte) 0);
        org.junit.Assert.assertNotNull(itemArray0);
    }

    @Test
    public void test2265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2265");
        ds.Item item0 = null;
        ds.Item[] itemArray1 = new ds.Item[] { item0 };
        ds.Ordenacao.heapsort(itemArray1, 0);
        ds.Ordenacao.heapsort(itemArray1, 1);
        ds.Ordenacao.heapsort(itemArray1, 1);
        ds.Ordenacao.selecao(itemArray1, (int) (short) 1);
        ds.Ordenacao.selecao(itemArray1, (int) (short) 1);
        ds.Ordenacao.insercao(itemArray1, (int) (byte) -1);
        ds.Ordenacao.selecao(itemArray1, (int) (short) 1);
        ds.Ordenacao.shellsort(itemArray1, 0);
        org.junit.Assert.assertNotNull(itemArray1);
    }

    @Test
    public void test2266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2266");
        ds.Item[] itemArray0 = new ds.Item[] {};
        ds.Ordenacao.heapsort(itemArray0, 0);
        ds.Ordenacao.heapsort(itemArray0, 0);
        ds.Ordenacao.shellsort(itemArray0, (int) (short) 0);
        ds.Ordenacao.insercao(itemArray0, (int) (byte) 1);
        org.junit.Assert.assertNotNull(itemArray0);
    }

    @Test
    public void test2267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2267");
        ds.Item item0 = null;
        ds.Item[] itemArray1 = new ds.Item[] { item0 };
        ds.Ordenacao.heapsort(itemArray1, 0);
        ds.Ordenacao.heapsort(itemArray1, 1);
        ds.Ordenacao.heapsort(itemArray1, 1);
        ds.Ordenacao.selecao(itemArray1, (int) (short) 1);
        ds.Ordenacao.selecao(itemArray1, 1);
        // The following exception was thrown during execution in test generation
        try {
            ds.Ordenacao.quicksort(itemArray1, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray1);
    }

    @Test
    public void test2268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2268");
        ds.Item[] itemArray0 = new ds.Item[] {};
        ds.Ordenacao.heapsort(itemArray0, 0);
        ds.Ordenacao.insercao(itemArray0, 0);
        ds.Ordenacao.insercao(itemArray0, (int) (short) 0);
        ds.Ordenacao.selecao(itemArray0, 1);
        ds.Ordenacao.selecao(itemArray0, (int) (short) -1);
        ds.Ordenacao.insercao(itemArray0, 0);
        ds.Ordenacao.selecao(itemArray0, 0);
        ds.Ordenacao.shellsort(itemArray0, (int) (short) -1);
        ds.Ordenacao.heapsort(itemArray0, (int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            ds.Ordenacao.selecao(itemArray0, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 2");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray0);
    }

    @Test
    public void test2269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2269");
        ds.Item item0 = null;
        ds.Item[] itemArray1 = new ds.Item[] { item0 };
        ds.Ordenacao.heapsort(itemArray1, 0);
        ds.Ordenacao.heapsort(itemArray1, 1);
        ds.Ordenacao.heapsort(itemArray1, 1);
        ds.Ordenacao.selecao(itemArray1, (int) (short) 1);
        ds.Ordenacao.selecao(itemArray1, (int) (short) 1);
        ds.Ordenacao.insercao(itemArray1, (int) (byte) -1);
        ds.Ordenacao.selecao(itemArray1, (int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            ds.Ordenacao.insercao(itemArray1, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray1);
    }

    @Test
    public void test2270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2270");
        ds.Item[] itemArray0 = new ds.Item[] {};
        ds.Ordenacao.heapsort(itemArray0, 0);
        ds.Ordenacao.insercao(itemArray0, 0);
        ds.Ordenacao.selecao(itemArray0, 0);
        ds.Ordenacao.selecao(itemArray0, (int) (byte) -1);
        ds.Ordenacao.heapsort(itemArray0, (int) (short) -1);
        ds.Ordenacao.selecao(itemArray0, 0);
        ds.Ordenacao.shellsort(itemArray0, (int) (short) 0);
        org.junit.Assert.assertNotNull(itemArray0);
    }

    @Test
    public void test2271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2271");
        ds.Item[] itemArray0 = new ds.Item[] {};
        ds.Ordenacao.heapsort(itemArray0, 0);
        ds.Ordenacao.insercao(itemArray0, 0);
        ds.Ordenacao.selecao(itemArray0, 0);
        ds.Ordenacao.shellsort(itemArray0, (int) (byte) 1);
        ds.Ordenacao.shellsort(itemArray0, (int) (byte) 1);
        ds.Ordenacao.insercao(itemArray0, (int) (byte) -1);
        // The following exception was thrown during execution in test generation
        try {
            ds.Ordenacao.selecao(itemArray0, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 2");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray0);
    }

    @Test
    public void test2272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2272");
        ds.Item[] itemArray0 = new ds.Item[] {};
        ds.Ordenacao.heapsort(itemArray0, 0);
        ds.Ordenacao.heapsort(itemArray0, (int) (byte) 0);
        ds.Ordenacao.shellsort(itemArray0, 0);
        ds.Ordenacao.heapsort(itemArray0, (int) (byte) -1);
        ds.Ordenacao.selecao(itemArray0, (int) (byte) 1);
        ds.Ordenacao.insercao(itemArray0, 1);
        ds.Ordenacao.shellsort(itemArray0, (int) (short) 0);
        org.junit.Assert.assertNotNull(itemArray0);
    }

    @Test
    public void test2273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2273");
        ds.Item item0 = null;
        ds.Item[] itemArray1 = new ds.Item[] { item0 };
        ds.Ordenacao.heapsort(itemArray1, 0);
        ds.Ordenacao.heapsort(itemArray1, 1);
        ds.Ordenacao.heapsort(itemArray1, 1);
        ds.Ordenacao.selecao(itemArray1, (int) (short) 1);
        ds.Ordenacao.shellsort(itemArray1, (-1));
        ds.Ordenacao.selecao(itemArray1, 0);
        org.junit.Assert.assertNotNull(itemArray1);
    }

    @Test
    public void test2274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2274");
        ds.Item[] itemArray0 = new ds.Item[] {};
        ds.Ordenacao.heapsort(itemArray0, 0);
        ds.Ordenacao.insercao(itemArray0, 0);
        ds.Ordenacao.selecao(itemArray0, 0);
        ds.Ordenacao.insercao(itemArray0, (-1));
        ds.Ordenacao.heapsort(itemArray0, (-1));
        ds.Ordenacao.selecao(itemArray0, 1);
        ds.Ordenacao.heapsort(itemArray0, (int) (byte) -1);
        ds.Ordenacao.heapsort(itemArray0, 1);
        ds.Ordenacao.selecao(itemArray0, (int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            ds.Ordenacao.selecao(itemArray0, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 2");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray0);
    }

    @Test
    public void test2275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2275");
        ds.Item[] itemArray0 = new ds.Item[] {};
        ds.Ordenacao.heapsort(itemArray0, 0);
        ds.Ordenacao.insercao(itemArray0, 0);
        ds.Ordenacao.insercao(itemArray0, (int) (short) 0);
        ds.Ordenacao.selecao(itemArray0, 1);
        ds.Ordenacao.shellsort(itemArray0, (int) (short) 1);
        ds.Ordenacao.insercao(itemArray0, (int) (short) 1);
        ds.Ordenacao.heapsort(itemArray0, (-1));
        ds.Ordenacao.selecao(itemArray0, (int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            ds.Ordenacao.insercao(itemArray0, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray0);
    }

    @Test
    public void test2276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2276");
        ds.Item[] itemArray0 = new ds.Item[] {};
        ds.Ordenacao.heapsort(itemArray0, 0);
        ds.Ordenacao.insercao(itemArray0, 0);
        ds.Ordenacao.shellsort(itemArray0, (-1));
        ds.Ordenacao.insercao(itemArray0, (int) (byte) 1);
        ds.Ordenacao.selecao(itemArray0, 0);
        ds.Ordenacao.selecao(itemArray0, (int) (byte) -1);
        ds.Ordenacao.selecao(itemArray0, 0);
        ds.Ordenacao.insercao(itemArray0, (int) (byte) 1);
        ds.Ordenacao.insercao(itemArray0, (int) (byte) 0);
        ds.Ordenacao.insercao(itemArray0, (-1));
        ds.Ordenacao.heapsort(itemArray0, (int) (short) 1);
        ds.Ordenacao.selecao(itemArray0, (int) (short) -1);
        // The following exception was thrown during execution in test generation
        try {
            ds.Ordenacao.quicksort(itemArray0, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 50");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray0);
    }

    @Test
    public void test2277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2277");
        ds.Item[] itemArray0 = new ds.Item[] {};
        ds.Ordenacao.heapsort(itemArray0, 0);
        ds.Ordenacao.insercao(itemArray0, 0);
        ds.Ordenacao.shellsort(itemArray0, (-1));
        ds.Ordenacao.insercao(itemArray0, (int) (byte) 1);
        ds.Ordenacao.selecao(itemArray0, 0);
        ds.Ordenacao.shellsort(itemArray0, 1);
        ds.Ordenacao.selecao(itemArray0, (-1));
        ds.Ordenacao.selecao(itemArray0, (int) (short) 1);
        org.junit.Assert.assertNotNull(itemArray0);
    }

    @Test
    public void test2278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2278");
        ds.Item[] itemArray0 = new ds.Item[] {};
        ds.Ordenacao.heapsort(itemArray0, 0);
        ds.Ordenacao.insercao(itemArray0, 0);
        ds.Ordenacao.selecao(itemArray0, 0);
        ds.Ordenacao.insercao(itemArray0, (-1));
        ds.Ordenacao.heapsort(itemArray0, (-1));
        ds.Ordenacao.insercao(itemArray0, 0);
        ds.Ordenacao.selecao(itemArray0, (int) (byte) -1);
        ds.Ordenacao.selecao(itemArray0, 0);
        ds.Ordenacao.shellsort(itemArray0, 0);
        java.lang.Class<?> wildcardClass19 = itemArray0.getClass();
        org.junit.Assert.assertNotNull(itemArray0);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test2279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2279");
        ds.Item item0 = null;
        ds.Item[] itemArray1 = new ds.Item[] { item0 };
        ds.Ordenacao.heapsort(itemArray1, 0);
        ds.Ordenacao.shellsort(itemArray1, (int) (byte) 0);
        ds.Ordenacao.heapsort(itemArray1, (-1));
        ds.Ordenacao.insercao(itemArray1, (int) (byte) 1);
        ds.Ordenacao.heapsort(itemArray1, 0);
        ds.Ordenacao.insercao(itemArray1, (int) (short) -1);
        // The following exception was thrown during execution in test generation
        try {
            ds.Ordenacao.insercao(itemArray1, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray1);
    }

    @Test
    public void test2280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2280");
        ds.Item[] itemArray0 = new ds.Item[] {};
        ds.Ordenacao.heapsort(itemArray0, 0);
        ds.Ordenacao.insercao(itemArray0, 0);
        ds.Ordenacao.shellsort(itemArray0, (-1));
        ds.Ordenacao.shellsort(itemArray0, (int) (byte) -1);
        ds.Ordenacao.selecao(itemArray0, (int) (byte) -1);
        ds.Ordenacao.heapsort(itemArray0, (int) (byte) -1);
        ds.Ordenacao.heapsort(itemArray0, (int) (byte) 1);
        ds.Ordenacao.heapsort(itemArray0, (int) (byte) -1);
        ds.Ordenacao.insercao(itemArray0, (-1));
        ds.Ordenacao.selecao(itemArray0, (int) (byte) -1);
        ds.Ordenacao.selecao(itemArray0, 0);
        // The following exception was thrown during execution in test generation
        try {
            ds.Ordenacao.quicksort(itemArray0, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 0");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray0);
    }

    @Test
    public void test2281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2281");
        ds.Item[] itemArray0 = new ds.Item[] {};
        ds.Ordenacao.heapsort(itemArray0, 0);
        ds.Ordenacao.insercao(itemArray0, 0);
        ds.Ordenacao.insercao(itemArray0, (int) (short) 0);
        ds.Ordenacao.selecao(itemArray0, 1);
        ds.Ordenacao.selecao(itemArray0, (int) (short) -1);
        ds.Ordenacao.insercao(itemArray0, 0);
        ds.Ordenacao.heapsort(itemArray0, (int) (short) -1);
        ds.Ordenacao.shellsort(itemArray0, (int) (short) 0);
        ds.Ordenacao.heapsort(itemArray0, (int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            ds.Ordenacao.shellsort(itemArray0, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 41");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray0);
    }

    @Test
    public void test2282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2282");
        ds.Item[] itemArray0 = new ds.Item[] {};
        ds.Ordenacao.heapsort(itemArray0, 0);
        ds.Ordenacao.insercao(itemArray0, 0);
        ds.Ordenacao.insercao(itemArray0, (int) (short) 0);
        ds.Ordenacao.selecao(itemArray0, 1);
        ds.Ordenacao.shellsort(itemArray0, (int) (short) 1);
        ds.Ordenacao.insercao(itemArray0, (int) (short) 1);
        ds.Ordenacao.heapsort(itemArray0, (int) (short) 0);
        ds.Ordenacao.shellsort(itemArray0, (int) (short) -1);
        // The following exception was thrown during execution in test generation
        try {
            ds.Ordenacao.selecao(itemArray0, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 2");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray0);
    }

    @Test
    public void test2283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2283");
        ds.Item[] itemArray0 = new ds.Item[] {};
        ds.Ordenacao.heapsort(itemArray0, 0);
        ds.Ordenacao.insercao(itemArray0, 0);
        ds.Ordenacao.shellsort(itemArray0, (-1));
        ds.Ordenacao.selecao(itemArray0, (-1));
        ds.Ordenacao.heapsort(itemArray0, (int) (short) 0);
        ds.Ordenacao.shellsort(itemArray0, (int) (short) 0);
        ds.Ordenacao.insercao(itemArray0, 0);
        java.lang.Class<?> wildcardClass15 = itemArray0.getClass();
        org.junit.Assert.assertNotNull(itemArray0);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test2284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2284");
        ds.Item[] itemArray0 = new ds.Item[] {};
        ds.Ordenacao.heapsort(itemArray0, 0);
        ds.Ordenacao.insercao(itemArray0, 0);
        ds.Ordenacao.shellsort(itemArray0, (-1));
        ds.Ordenacao.insercao(itemArray0, (int) (byte) 1);
        ds.Ordenacao.selecao(itemArray0, 0);
        ds.Ordenacao.shellsort(itemArray0, 1);
        ds.Ordenacao.insercao(itemArray0, (-1));
        ds.Ordenacao.insercao(itemArray0, (int) (byte) 0);
        ds.Ordenacao.heapsort(itemArray0, (int) (byte) 1);
        ds.Ordenacao.insercao(itemArray0, 0);
        ds.Ordenacao.heapsort(itemArray0, (int) (byte) -1);
        ds.Ordenacao.selecao(itemArray0, (-1));
        ds.Ordenacao.insercao(itemArray0, (int) (short) 1);
        org.junit.Assert.assertNotNull(itemArray0);
    }

    @Test
    public void test2285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2285");
        ds.Item[] itemArray0 = new ds.Item[] {};
        ds.Ordenacao.heapsort(itemArray0, 0);
        ds.Ordenacao.insercao(itemArray0, 0);
        ds.Ordenacao.insercao(itemArray0, (int) (short) 0);
        ds.Ordenacao.selecao(itemArray0, 1);
        ds.Ordenacao.selecao(itemArray0, (int) (short) -1);
        ds.Ordenacao.insercao(itemArray0, 0);
        ds.Ordenacao.selecao(itemArray0, 0);
        ds.Ordenacao.shellsort(itemArray0, 0);
        ds.Ordenacao.shellsort(itemArray0, 0);
        ds.Ordenacao.heapsort(itemArray0, (-1));
        org.junit.Assert.assertNotNull(itemArray0);
    }

    @Test
    public void test2286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2286");
        ds.Item[] itemArray0 = new ds.Item[] {};
        ds.Ordenacao.heapsort(itemArray0, 0);
        ds.Ordenacao.insercao(itemArray0, 0);
        ds.Ordenacao.insercao(itemArray0, (int) (short) 0);
        ds.Ordenacao.selecao(itemArray0, 1);
        ds.Ordenacao.shellsort(itemArray0, (int) (byte) -1);
        // The following exception was thrown during execution in test generation
        try {
            ds.Ordenacao.quicksort(itemArray0, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray0);
    }

    @Test
    public void test2287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2287");
        ds.Item[] itemArray0 = new ds.Item[] {};
        ds.Ordenacao.heapsort(itemArray0, 0);
        ds.Ordenacao.insercao(itemArray0, 0);
        ds.Ordenacao.selecao(itemArray0, 0);
        ds.Ordenacao.shellsort(itemArray0, (int) (byte) 1);
        ds.Ordenacao.insercao(itemArray0, 0);
        ds.Ordenacao.insercao(itemArray0, (int) (short) 1);
        ds.Ordenacao.insercao(itemArray0, 0);
        ds.Ordenacao.insercao(itemArray0, (int) (short) 1);
        ds.Ordenacao.selecao(itemArray0, (int) (byte) -1);
        org.junit.Assert.assertNotNull(itemArray0);
    }

    @Test
    public void test2288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2288");
        ds.Item[] itemArray0 = new ds.Item[] {};
        ds.Ordenacao.heapsort(itemArray0, 0);
        ds.Ordenacao.insercao(itemArray0, 0);
        ds.Ordenacao.shellsort(itemArray0, (-1));
        ds.Ordenacao.insercao(itemArray0, (int) (byte) 1);
        ds.Ordenacao.selecao(itemArray0, 0);
        ds.Ordenacao.shellsort(itemArray0, 1);
        ds.Ordenacao.insercao(itemArray0, (-1));
        ds.Ordenacao.insercao(itemArray0, (int) (byte) 0);
        ds.Ordenacao.selecao(itemArray0, (int) (byte) 0);
        ds.Ordenacao.selecao(itemArray0, (-1));
        org.junit.Assert.assertNotNull(itemArray0);
    }

    @Test
    public void test2289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2289");
        ds.Item[] itemArray0 = new ds.Item[] {};
        // The following exception was thrown during execution in test generation
        try {
            ds.Ordenacao.shellsort(itemArray0, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray0);
    }

    @Test
    public void test2290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2290");
        ds.Item[] itemArray0 = new ds.Item[] {};
        ds.Ordenacao.heapsort(itemArray0, 0);
        ds.Ordenacao.insercao(itemArray0, 0);
        ds.Ordenacao.shellsort(itemArray0, (-1));
        ds.Ordenacao.selecao(itemArray0, 0);
        ds.Ordenacao.insercao(itemArray0, (int) (byte) 0);
        ds.Ordenacao.shellsort(itemArray0, (int) (short) 1);
        ds.Ordenacao.insercao(itemArray0, 0);
        ds.Ordenacao.heapsort(itemArray0, 0);
        // The following exception was thrown during execution in test generation
        try {
            ds.Ordenacao.quicksort(itemArray0, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 49");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray0);
    }

    @Test
    public void test2291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2291");
        ds.Item item0 = null;
        ds.Item[] itemArray1 = new ds.Item[] { item0 };
        ds.Ordenacao.heapsort(itemArray1, 0);
        ds.Ordenacao.heapsort(itemArray1, 1);
        ds.Ordenacao.heapsort(itemArray1, 1);
        ds.Ordenacao.selecao(itemArray1, (int) (short) 1);
        ds.Ordenacao.selecao(itemArray1, (int) (short) 1);
        ds.Ordenacao.insercao(itemArray1, (int) (byte) -1);
        ds.Ordenacao.selecao(itemArray1, (int) (short) 1);
        ds.Ordenacao.selecao(itemArray1, 1);
        ds.Ordenacao.shellsort(itemArray1, 0);
        // The following exception was thrown during execution in test generation
        try {
            ds.Ordenacao.heapsort(itemArray1, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray1);
    }

    @Test
    public void test2292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2292");
        ds.Item[] itemArray0 = new ds.Item[] {};
        ds.Ordenacao.heapsort(itemArray0, 0);
        ds.Ordenacao.insercao(itemArray0, 0);
        ds.Ordenacao.insercao(itemArray0, (int) (short) 0);
        ds.Ordenacao.selecao(itemArray0, 1);
        ds.Ordenacao.shellsort(itemArray0, (int) (short) 1);
        ds.Ordenacao.shellsort(itemArray0, 0);
        // The following exception was thrown during execution in test generation
        try {
            ds.Ordenacao.shellsort(itemArray0, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 41");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray0);
    }

    @Test
    public void test2293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2293");
        ds.Item[] itemArray0 = new ds.Item[] {};
        ds.Ordenacao.heapsort(itemArray0, 0);
        ds.Ordenacao.insercao(itemArray0, 0);
        ds.Ordenacao.shellsort(itemArray0, (-1));
        ds.Ordenacao.insercao(itemArray0, (int) (byte) 1);
        ds.Ordenacao.selecao(itemArray0, 0);
        ds.Ordenacao.selecao(itemArray0, (int) (byte) -1);
        ds.Ordenacao.selecao(itemArray0, 0);
        ds.Ordenacao.insercao(itemArray0, (int) (byte) 1);
        ds.Ordenacao.insercao(itemArray0, (int) (byte) 0);
        ds.Ordenacao.selecao(itemArray0, 1);
        ds.Ordenacao.heapsort(itemArray0, 0);
        org.junit.Assert.assertNotNull(itemArray0);
    }

    @Test
    public void test2294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2294");
        ds.Item[] itemArray0 = new ds.Item[] {};
        ds.Ordenacao.heapsort(itemArray0, 0);
        ds.Ordenacao.insercao(itemArray0, 0);
        ds.Ordenacao.insercao(itemArray0, 0);
        ds.Ordenacao.selecao(itemArray0, (int) (short) -1);
        ds.Ordenacao.shellsort(itemArray0, (-1));
        ds.Ordenacao.insercao(itemArray0, (int) (short) 0);
        org.junit.Assert.assertNotNull(itemArray0);
    }

    @Test
    public void test2295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2295");
        ds.Item[] itemArray0 = new ds.Item[] {};
        ds.Ordenacao.heapsort(itemArray0, 0);
        ds.Ordenacao.insercao(itemArray0, 0);
        ds.Ordenacao.selecao(itemArray0, 0);
        ds.Ordenacao.shellsort(itemArray0, (int) (short) 1);
        ds.Ordenacao.insercao(itemArray0, (int) (byte) 0);
        ds.Ordenacao.selecao(itemArray0, 0);
        // The following exception was thrown during execution in test generation
        try {
            ds.Ordenacao.quicksort(itemArray0, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 16");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray0);
    }

    @Test
    public void test2296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2296");
        ds.Item[] itemArray0 = new ds.Item[] {};
        ds.Ordenacao.heapsort(itemArray0, 0);
        ds.Ordenacao.insercao(itemArray0, 0);
        ds.Ordenacao.shellsort(itemArray0, (-1));
        ds.Ordenacao.selecao(itemArray0, (int) (byte) 0);
        ds.Ordenacao.shellsort(itemArray0, (int) (byte) -1);
        org.junit.Assert.assertNotNull(itemArray0);
    }

    @Test
    public void test2297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2297");
        ds.Item item0 = null;
        ds.Item[] itemArray1 = new ds.Item[] { item0 };
        ds.Ordenacao.heapsort(itemArray1, 0);
        ds.Ordenacao.heapsort(itemArray1, 1);
        ds.Ordenacao.heapsort(itemArray1, 1);
        ds.Ordenacao.selecao(itemArray1, (int) (short) 1);
        ds.Ordenacao.selecao(itemArray1, (int) (short) 1);
        ds.Ordenacao.insercao(itemArray1, (int) (byte) -1);
        ds.Ordenacao.selecao(itemArray1, (int) (short) 1);
        ds.Ordenacao.shellsort(itemArray1, (-1));
        org.junit.Assert.assertNotNull(itemArray1);
    }

    @Test
    public void test2298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2298");
        ds.Item[] itemArray0 = new ds.Item[] {};
        ds.Ordenacao.heapsort(itemArray0, 0);
        ds.Ordenacao.heapsort(itemArray0, 0);
        ds.Ordenacao.insercao(itemArray0, (int) (short) -1);
        ds.Ordenacao.insercao(itemArray0, (int) (short) 0);
        ds.Ordenacao.selecao(itemArray0, (int) (byte) -1);
        ds.Ordenacao.shellsort(itemArray0, (int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            ds.Ordenacao.heapsort(itemArray0, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray0);
    }

    @Test
    public void test2299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2299");
        ds.Item[] itemArray0 = new ds.Item[] {};
        ds.Ordenacao.heapsort(itemArray0, 0);
        ds.Ordenacao.insercao(itemArray0, 0);
        ds.Ordenacao.insercao(itemArray0, (int) (short) 0);
        ds.Ordenacao.selecao(itemArray0, 1);
        ds.Ordenacao.selecao(itemArray0, (int) (short) -1);
        ds.Ordenacao.heapsort(itemArray0, (int) (short) 1);
        ds.Ordenacao.heapsort(itemArray0, (int) (short) 1);
        ds.Ordenacao.shellsort(itemArray0, (int) (short) -1);
        ds.Ordenacao.shellsort(itemArray0, (int) (short) -1);
        // The following exception was thrown during execution in test generation
        try {
            ds.Ordenacao.insercao(itemArray0, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray0);
    }

    @Test
    public void test2300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2300");
        ds.Item[] itemArray0 = new ds.Item[] {};
        ds.Ordenacao.heapsort(itemArray0, 0);
        ds.Ordenacao.insercao(itemArray0, 0);
        ds.Ordenacao.insercao(itemArray0, (int) (short) 0);
        ds.Ordenacao.selecao(itemArray0, 1);
        ds.Ordenacao.selecao(itemArray0, 0);
        ds.Ordenacao.insercao(itemArray0, 1);
        ds.Ordenacao.shellsort(itemArray0, (int) (byte) -1);
        org.junit.Assert.assertNotNull(itemArray0);
    }

    @Test
    public void test2301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2301");
        ds.Item item0 = null;
        ds.Item[] itemArray1 = new ds.Item[] { item0 };
        ds.Ordenacao.heapsort(itemArray1, 0);
        ds.Ordenacao.heapsort(itemArray1, 1);
        ds.Ordenacao.heapsort(itemArray1, 1);
        ds.Ordenacao.selecao(itemArray1, (int) (short) 1);
        ds.Ordenacao.selecao(itemArray1, (int) (short) 1);
        ds.Ordenacao.insercao(itemArray1, (int) (byte) -1);
        ds.Ordenacao.selecao(itemArray1, (int) (short) 1);
        ds.Ordenacao.selecao(itemArray1, 1);
        ds.Ordenacao.shellsort(itemArray1, 0);
        // The following exception was thrown during execution in test generation
        try {
            ds.Ordenacao.selecao(itemArray1, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 2");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray1);
    }

    @Test
    public void test2302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2302");
        ds.Item[] itemArray0 = new ds.Item[] {};
        ds.Ordenacao.heapsort(itemArray0, 0);
        ds.Ordenacao.insercao(itemArray0, 0);
        ds.Ordenacao.shellsort(itemArray0, (-1));
        ds.Ordenacao.selecao(itemArray0, (-1));
        ds.Ordenacao.heapsort(itemArray0, (int) (short) 0);
        ds.Ordenacao.selecao(itemArray0, 1);
        ds.Ordenacao.heapsort(itemArray0, (int) (short) 1);
        ds.Ordenacao.heapsort(itemArray0, (int) (byte) 1);
        ds.Ordenacao.selecao(itemArray0, (int) (short) 1);
        org.junit.Assert.assertNotNull(itemArray0);
    }

    @Test
    public void test2303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2303");
        ds.Item[] itemArray0 = new ds.Item[] {};
        ds.Ordenacao.heapsort(itemArray0, 0);
        ds.Ordenacao.insercao(itemArray0, 0);
        ds.Ordenacao.insercao(itemArray0, 0);
        ds.Ordenacao.insercao(itemArray0, 1);
        // The following exception was thrown during execution in test generation
        try {
            ds.Ordenacao.heapsort(itemArray0, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray0);
    }

    @Test
    public void test2304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2304");
        ds.Item[] itemArray0 = new ds.Item[] {};
        ds.Ordenacao.heapsort(itemArray0, 0);
        ds.Ordenacao.insercao(itemArray0, 0);
        ds.Ordenacao.shellsort(itemArray0, (-1));
        ds.Ordenacao.insercao(itemArray0, (int) (byte) 1);
        ds.Ordenacao.selecao(itemArray0, 0);
        ds.Ordenacao.selecao(itemArray0, (int) (byte) -1);
        ds.Ordenacao.selecao(itemArray0, 0);
        ds.Ordenacao.insercao(itemArray0, (int) (byte) 1);
        ds.Ordenacao.heapsort(itemArray0, (int) (short) 1);
        ds.Ordenacao.heapsort(itemArray0, (int) (short) 0);
        ds.Ordenacao.selecao(itemArray0, (int) (byte) -1);
        ds.Ordenacao.insercao(itemArray0, (int) (short) 0);
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
    public void test2305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2305");
        ds.Item[] itemArray0 = new ds.Item[] {};
        ds.Ordenacao.heapsort(itemArray0, 0);
        ds.Ordenacao.insercao(itemArray0, 0);
        ds.Ordenacao.shellsort(itemArray0, (-1));
        ds.Ordenacao.insercao(itemArray0, (int) (byte) 1);
        ds.Ordenacao.insercao(itemArray0, 1);
        ds.Ordenacao.shellsort(itemArray0, (int) (byte) 0);
        ds.Ordenacao.shellsort(itemArray0, 0);
        org.junit.Assert.assertNotNull(itemArray0);
    }

    @Test
    public void test2306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2306");
        ds.Item[] itemArray0 = new ds.Item[] {};
        ds.Ordenacao.heapsort(itemArray0, 0);
        ds.Ordenacao.insercao(itemArray0, 0);
        ds.Ordenacao.shellsort(itemArray0, (-1));
        ds.Ordenacao.insercao(itemArray0, (int) (byte) 1);
        ds.Ordenacao.selecao(itemArray0, 0);
        ds.Ordenacao.selecao(itemArray0, (int) (byte) -1);
        ds.Ordenacao.selecao(itemArray0, 0);
        ds.Ordenacao.insercao(itemArray0, (int) (byte) 1);
        ds.Ordenacao.heapsort(itemArray0, (int) (short) 1);
        ds.Ordenacao.heapsort(itemArray0, (int) (short) -1);
        ds.Ordenacao.insercao(itemArray0, (int) (byte) -1);
        ds.Ordenacao.heapsort(itemArray0, 1);
        ds.Ordenacao.heapsort(itemArray0, (int) (byte) 1);
        ds.Ordenacao.selecao(itemArray0, (int) (short) -1);
        ds.Ordenacao.heapsort(itemArray0, 0);
        ds.Ordenacao.shellsort(itemArray0, 0);
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
    public void test2307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2307");
        ds.Item[] itemArray0 = new ds.Item[] {};
        ds.Ordenacao.heapsort(itemArray0, 0);
        ds.Ordenacao.insercao(itemArray0, 0);
        ds.Ordenacao.insercao(itemArray0, (int) (short) 0);
        ds.Ordenacao.selecao(itemArray0, 1);
        ds.Ordenacao.selecao(itemArray0, (int) (short) -1);
        ds.Ordenacao.heapsort(itemArray0, (int) (short) 1);
        ds.Ordenacao.heapsort(itemArray0, (int) (short) 1);
        ds.Ordenacao.shellsort(itemArray0, (int) (short) -1);
        ds.Ordenacao.shellsort(itemArray0, (int) (byte) 1);
        ds.Ordenacao.shellsort(itemArray0, 1);
        org.junit.Assert.assertNotNull(itemArray0);
    }

    @Test
    public void test2308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2308");
        ds.Item[] itemArray0 = new ds.Item[] {};
        ds.Ordenacao.heapsort(itemArray0, 0);
        ds.Ordenacao.insercao(itemArray0, 0);
        ds.Ordenacao.shellsort(itemArray0, (-1));
        ds.Ordenacao.insercao(itemArray0, (int) (byte) 1);
        ds.Ordenacao.insercao(itemArray0, 1);
        ds.Ordenacao.shellsort(itemArray0, (int) (byte) 0);
        ds.Ordenacao.shellsort(itemArray0, (-1));
        java.lang.Class<?> wildcardClass15 = itemArray0.getClass();
        org.junit.Assert.assertNotNull(itemArray0);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test2309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2309");
        ds.Item[] itemArray0 = new ds.Item[] {};
        ds.Ordenacao.heapsort(itemArray0, 0);
        ds.Ordenacao.heapsort(itemArray0, (int) (byte) 0);
        ds.Ordenacao.shellsort(itemArray0, 0);
        ds.Ordenacao.heapsort(itemArray0, (int) (byte) -1);
        ds.Ordenacao.selecao(itemArray0, (int) (byte) 1);
        ds.Ordenacao.insercao(itemArray0, 0);
        // The following exception was thrown during execution in test generation
        try {
            ds.Ordenacao.shellsort(itemArray0, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 41");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray0);
    }

    @Test
    public void test2310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2310");
        ds.Item[] itemArray0 = new ds.Item[] {};
        ds.Ordenacao.heapsort(itemArray0, 0);
        ds.Ordenacao.insercao(itemArray0, 0);
        ds.Ordenacao.selecao(itemArray0, 0);
        ds.Ordenacao.shellsort(itemArray0, (int) (byte) 1);
        ds.Ordenacao.insercao(itemArray0, 0);
        ds.Ordenacao.insercao(itemArray0, (int) (short) -1);
        ds.Ordenacao.shellsort(itemArray0, (int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            ds.Ordenacao.quicksort(itemArray0, (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 0");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray0);
    }

    @Test
    public void test2311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2311");
        ds.Item[] itemArray0 = new ds.Item[] {};
        ds.Ordenacao.heapsort(itemArray0, 0);
        ds.Ordenacao.insercao(itemArray0, 0);
        ds.Ordenacao.shellsort(itemArray0, (-1));
        ds.Ordenacao.insercao(itemArray0, (int) (byte) 1);
        ds.Ordenacao.insercao(itemArray0, (int) (byte) 0);
        ds.Ordenacao.selecao(itemArray0, (int) (short) -1);
        ds.Ordenacao.selecao(itemArray0, (int) (short) -1);
        ds.Ordenacao.insercao(itemArray0, (int) (byte) -1);
        ds.Ordenacao.heapsort(itemArray0, 1);
        org.junit.Assert.assertNotNull(itemArray0);
    }

    @Test
    public void test2312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2312");
        ds.Item[] itemArray0 = new ds.Item[] {};
        ds.Ordenacao.heapsort(itemArray0, 0);
        ds.Ordenacao.insercao(itemArray0, 0);
        ds.Ordenacao.shellsort(itemArray0, (-1));
        ds.Ordenacao.insercao(itemArray0, (int) (byte) 1);
        ds.Ordenacao.insercao(itemArray0, (int) (byte) 0);
        ds.Ordenacao.selecao(itemArray0, (int) (short) -1);
        ds.Ordenacao.heapsort(itemArray0, (int) (short) 1);
        ds.Ordenacao.heapsort(itemArray0, (-1));
        ds.Ordenacao.heapsort(itemArray0, (int) (byte) -1);
        ds.Ordenacao.selecao(itemArray0, (int) (short) -1);
        // The following exception was thrown during execution in test generation
        try {
            ds.Ordenacao.heapsort(itemArray0, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray0);
    }

    @Test
    public void test2313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2313");
        ds.Item[] itemArray0 = new ds.Item[] {};
        ds.Ordenacao.heapsort(itemArray0, 0);
        ds.Ordenacao.insercao(itemArray0, 0);
        ds.Ordenacao.shellsort(itemArray0, (-1));
        ds.Ordenacao.selecao(itemArray0, (-1));
        ds.Ordenacao.heapsort(itemArray0, 0);
        ds.Ordenacao.heapsort(itemArray0, (int) (byte) -1);
        // The following exception was thrown during execution in test generation
        try {
            ds.Ordenacao.shellsort(itemArray0, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 14");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray0);
    }

    @Test
    public void test2314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2314");
        ds.Item item0 = null;
        ds.Item[] itemArray1 = new ds.Item[] { item0 };
        ds.Ordenacao.selecao(itemArray1, (int) (short) 1);
        ds.Ordenacao.heapsort(itemArray1, 0);
        ds.Ordenacao.heapsort(itemArray1, 0);
        ds.Ordenacao.insercao(itemArray1, 0);
        ds.Ordenacao.heapsort(itemArray1, 0);
        // The following exception was thrown during execution in test generation
        try {
            ds.Ordenacao.quicksort(itemArray1, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 50");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray1);
    }

    @Test
    public void test2315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2315");
        ds.Item item0 = null;
        ds.Item[] itemArray1 = new ds.Item[] { item0 };
        ds.Ordenacao.heapsort(itemArray1, 0);
        ds.Ordenacao.shellsort(itemArray1, (int) (byte) 0);
        ds.Ordenacao.shellsort(itemArray1, (int) (short) 0);
        ds.Ordenacao.insercao(itemArray1, 0);
        ds.Ordenacao.selecao(itemArray1, (-1));
        java.lang.Class<?> wildcardClass12 = itemArray1.getClass();
        org.junit.Assert.assertNotNull(itemArray1);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test2316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2316");
        ds.Item[] itemArray0 = new ds.Item[] {};
        ds.Ordenacao.heapsort(itemArray0, 0);
        ds.Ordenacao.insercao(itemArray0, 0);
        ds.Ordenacao.selecao(itemArray0, 0);
        ds.Ordenacao.insercao(itemArray0, (-1));
        ds.Ordenacao.insercao(itemArray0, (int) (byte) -1);
        ds.Ordenacao.heapsort(itemArray0, (int) (byte) -1);
        ds.Ordenacao.insercao(itemArray0, 0);
        ds.Ordenacao.insercao(itemArray0, 0);
        // The following exception was thrown during execution in test generation
        try {
            ds.Ordenacao.insercao(itemArray0, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray0);
    }

    @Test
    public void test2317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2317");
        ds.Item[] itemArray0 = new ds.Item[] {};
        ds.Ordenacao.heapsort(itemArray0, 0);
        ds.Ordenacao.insercao(itemArray0, 0);
        ds.Ordenacao.insercao(itemArray0, (int) (short) 0);
        ds.Ordenacao.selecao(itemArray0, 1);
        ds.Ordenacao.selecao(itemArray0, (int) (short) -1);
        ds.Ordenacao.insercao(itemArray0, 0);
        ds.Ordenacao.selecao(itemArray0, 0);
        ds.Ordenacao.shellsort(itemArray0, 0);
        ds.Ordenacao.shellsort(itemArray0, 0);
        ds.Ordenacao.insercao(itemArray0, 0);
        org.junit.Assert.assertNotNull(itemArray0);
    }

    @Test
    public void test2318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2318");
        ds.Item[] itemArray0 = new ds.Item[] {};
        ds.Ordenacao.heapsort(itemArray0, 0);
        ds.Ordenacao.insercao(itemArray0, 0);
        ds.Ordenacao.selecao(itemArray0, 0);
        ds.Ordenacao.shellsort(itemArray0, (int) (byte) 1);
        ds.Ordenacao.insercao(itemArray0, 0);
        ds.Ordenacao.insercao(itemArray0, (int) (short) 1);
        ds.Ordenacao.selecao(itemArray0, (int) (short) 0);
        ds.Ordenacao.heapsort(itemArray0, (int) (short) 1);
        ds.Ordenacao.shellsort(itemArray0, (int) (short) -1);
        ds.Ordenacao.insercao(itemArray0, (int) (short) -1);
        org.junit.Assert.assertNotNull(itemArray0);
    }

    @Test
    public void test2319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2319");
        ds.Item[] itemArray0 = new ds.Item[] {};
        ds.Ordenacao.heapsort(itemArray0, 0);
        ds.Ordenacao.insercao(itemArray0, 0);
        ds.Ordenacao.shellsort(itemArray0, (-1));
        ds.Ordenacao.insercao(itemArray0, 1);
        // The following exception was thrown during execution in test generation
        try {
            ds.Ordenacao.selecao(itemArray0, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 2");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray0);
    }

    @Test
    public void test2320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2320");
        ds.Item[] itemArray0 = new ds.Item[] {};
        ds.Ordenacao.heapsort(itemArray0, 0);
        ds.Ordenacao.insercao(itemArray0, 0);
        ds.Ordenacao.selecao(itemArray0, 0);
        ds.Ordenacao.selecao(itemArray0, (int) (byte) 0);
        ds.Ordenacao.selecao(itemArray0, (int) (byte) 1);
        ds.Ordenacao.shellsort(itemArray0, (int) (short) 0);
        org.junit.Assert.assertNotNull(itemArray0);
    }

    @Test
    public void test2321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2321");
        ds.Item item0 = null;
        ds.Item[] itemArray1 = new ds.Item[] { item0 };
        ds.Ordenacao.heapsort(itemArray1, 0);
        ds.Ordenacao.heapsort(itemArray1, 1);
        ds.Ordenacao.shellsort(itemArray1, (-1));
        ds.Ordenacao.selecao(itemArray1, (int) (byte) -1);
        ds.Ordenacao.heapsort(itemArray1, (int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            ds.Ordenacao.shellsort(itemArray1, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray1);
    }

    @Test
    public void test2322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2322");
        ds.Item[] itemArray0 = new ds.Item[] {};
        ds.Ordenacao.heapsort(itemArray0, 0);
        ds.Ordenacao.insercao(itemArray0, 0);
        ds.Ordenacao.insercao(itemArray0, (int) (short) 0);
        ds.Ordenacao.selecao(itemArray0, 1);
        ds.Ordenacao.shellsort(itemArray0, (int) (short) 1);
        ds.Ordenacao.shellsort(itemArray0, 0);
        ds.Ordenacao.shellsort(itemArray0, (-1));
        ds.Ordenacao.selecao(itemArray0, 0);
        // The following exception was thrown during execution in test generation
        try {
            ds.Ordenacao.heapsort(itemArray0, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray0);
    }

    @Test
    public void test2323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2323");
        ds.Item[] itemArray0 = new ds.Item[] {};
        ds.Ordenacao.heapsort(itemArray0, 0);
        ds.Ordenacao.insercao(itemArray0, 0);
        ds.Ordenacao.selecao(itemArray0, 0);
        ds.Ordenacao.shellsort(itemArray0, (int) (short) 1);
        ds.Ordenacao.insercao(itemArray0, 0);
        ds.Ordenacao.selecao(itemArray0, (int) (byte) -1);
        ds.Ordenacao.insercao(itemArray0, 0);
        ds.Ordenacao.selecao(itemArray0, 0);
        ds.Ordenacao.shellsort(itemArray0, (-1));
        // The following exception was thrown during execution in test generation
        try {
            ds.Ordenacao.heapsort(itemArray0, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray0);
    }

    @Test
    public void test2324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2324");
        ds.Item[] itemArray0 = new ds.Item[] {};
        ds.Ordenacao.heapsort(itemArray0, 0);
        ds.Ordenacao.insercao(itemArray0, 0);
        ds.Ordenacao.shellsort(itemArray0, (-1));
        ds.Ordenacao.insercao(itemArray0, (int) (byte) 1);
        ds.Ordenacao.selecao(itemArray0, 0);
        ds.Ordenacao.selecao(itemArray0, (int) (byte) -1);
        ds.Ordenacao.selecao(itemArray0, 0);
        ds.Ordenacao.insercao(itemArray0, (int) (byte) 1);
        ds.Ordenacao.heapsort(itemArray0, (int) (byte) -1);
        ds.Ordenacao.selecao(itemArray0, (int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            ds.Ordenacao.shellsort(itemArray0, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 41");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray0);
    }

    @Test
    public void test2325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2325");
        ds.Item[] itemArray0 = new ds.Item[] {};
        ds.Ordenacao.heapsort(itemArray0, 0);
        ds.Ordenacao.insercao(itemArray0, 0);
        ds.Ordenacao.insercao(itemArray0, (int) (short) 0);
        ds.Ordenacao.selecao(itemArray0, 1);
        ds.Ordenacao.selecao(itemArray0, (int) (short) -1);
        ds.Ordenacao.insercao(itemArray0, 0);
        ds.Ordenacao.heapsort(itemArray0, (int) (byte) 1);
        ds.Ordenacao.shellsort(itemArray0, 0);
        ds.Ordenacao.shellsort(itemArray0, (int) (short) 1);
        ds.Ordenacao.selecao(itemArray0, (int) (short) 1);
        ds.Ordenacao.heapsort(itemArray0, (int) (byte) 0);
        org.junit.Assert.assertNotNull(itemArray0);
    }

    @Test
    public void test2326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2326");
        ds.Item[] itemArray0 = new ds.Item[] {};
        ds.Ordenacao.heapsort(itemArray0, 0);
        ds.Ordenacao.insercao(itemArray0, 0);
        ds.Ordenacao.selecao(itemArray0, 0);
        ds.Ordenacao.shellsort(itemArray0, 0);
        ds.Ordenacao.shellsort(itemArray0, (int) (byte) -1);
        // The following exception was thrown during execution in test generation
        try {
            ds.Ordenacao.heapsort(itemArray0, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray0);
    }

    @Test
    public void test2327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2327");
        ds.Item[] itemArray0 = new ds.Item[] {};
        ds.Ordenacao.heapsort(itemArray0, 0);
        ds.Ordenacao.insercao(itemArray0, 0);
        ds.Ordenacao.selecao(itemArray0, 0);
        // The following exception was thrown during execution in test generation
        try {
            ds.Ordenacao.shellsort(itemArray0, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 41");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray0);
    }

    @Test
    public void test2328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2328");
        ds.Item[] itemArray0 = new ds.Item[] {};
        ds.Ordenacao.heapsort(itemArray0, 0);
        ds.Ordenacao.insercao(itemArray0, 0);
        ds.Ordenacao.selecao(itemArray0, 0);
        ds.Ordenacao.insercao(itemArray0, (-1));
        ds.Ordenacao.insercao(itemArray0, (int) (byte) -1);
        ds.Ordenacao.heapsort(itemArray0, (int) (byte) -1);
        ds.Ordenacao.insercao(itemArray0, 0);
        ds.Ordenacao.insercao(itemArray0, 0);
        ds.Ordenacao.shellsort(itemArray0, (int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            ds.Ordenacao.quicksort(itemArray0, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 50");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray0);
    }

    @Test
    public void test2329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2329");
        ds.Item[] itemArray0 = new ds.Item[] {};
        ds.Ordenacao.heapsort(itemArray0, 0);
        ds.Ordenacao.insercao(itemArray0, 0);
        ds.Ordenacao.shellsort(itemArray0, (-1));
        ds.Ordenacao.insercao(itemArray0, (int) (byte) 0);
        ds.Ordenacao.insercao(itemArray0, 0);
        // The following exception was thrown during execution in test generation
        try {
            ds.Ordenacao.insercao(itemArray0, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray0);
    }

    @Test
    public void test2330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2330");
        ds.Item[] itemArray0 = new ds.Item[] {};
        ds.Ordenacao.heapsort(itemArray0, 0);
        ds.Ordenacao.insercao(itemArray0, 0);
        ds.Ordenacao.shellsort(itemArray0, (-1));
        ds.Ordenacao.insercao(itemArray0, (int) (byte) 1);
        ds.Ordenacao.selecao(itemArray0, 0);
        ds.Ordenacao.shellsort(itemArray0, 1);
        ds.Ordenacao.selecao(itemArray0, (int) (byte) -1);
        ds.Ordenacao.heapsort(itemArray0, (int) (short) 1);
        ds.Ordenacao.shellsort(itemArray0, (int) (short) -1);
        ds.Ordenacao.insercao(itemArray0, (int) (byte) 1);
        ds.Ordenacao.heapsort(itemArray0, (int) (short) 0);
        ds.Ordenacao.selecao(itemArray0, 0);
        org.junit.Assert.assertNotNull(itemArray0);
    }

    @Test
    public void test2331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2331");
        ds.Item item0 = null;
        ds.Item[] itemArray1 = new ds.Item[] { item0 };
        ds.Ordenacao.heapsort(itemArray1, 0);
        ds.Ordenacao.selecao(itemArray1, 0);
        ds.Ordenacao.selecao(itemArray1, 1);
        // The following exception was thrown during execution in test generation
        try {
            ds.Ordenacao.quicksort(itemArray1, (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray1);
    }

    @Test
    public void test2332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2332");
        ds.Item[] itemArray0 = new ds.Item[] {};
        ds.Ordenacao.heapsort(itemArray0, 0);
        ds.Ordenacao.insercao(itemArray0, 0);
        ds.Ordenacao.selecao(itemArray0, 0);
        ds.Ordenacao.shellsort(itemArray0, (int) (byte) 1);
        ds.Ordenacao.insercao(itemArray0, 0);
        ds.Ordenacao.shellsort(itemArray0, (int) (short) 0);
        ds.Ordenacao.heapsort(itemArray0, (int) (byte) 0);
        ds.Ordenacao.shellsort(itemArray0, (int) (byte) 0);
        ds.Ordenacao.shellsort(itemArray0, (int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            ds.Ordenacao.insercao(itemArray0, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray0);
    }

    @Test
    public void test2333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2333");
        ds.Item[] itemArray0 = new ds.Item[] {};
        ds.Ordenacao.heapsort(itemArray0, 0);
        ds.Ordenacao.insercao(itemArray0, 0);
        ds.Ordenacao.shellsort(itemArray0, (-1));
        ds.Ordenacao.insercao(itemArray0, (int) (byte) 1);
        ds.Ordenacao.selecao(itemArray0, 0);
        ds.Ordenacao.selecao(itemArray0, (int) (byte) -1);
        ds.Ordenacao.selecao(itemArray0, 0);
        ds.Ordenacao.insercao(itemArray0, (int) (byte) 1);
        ds.Ordenacao.heapsort(itemArray0, (int) (short) 1);
        ds.Ordenacao.heapsort(itemArray0, (int) (short) -1);
        ds.Ordenacao.insercao(itemArray0, (int) (byte) -1);
        // The following exception was thrown during execution in test generation
        try {
            ds.Ordenacao.heapsort(itemArray0, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray0);
    }

    @Test
    public void test2334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2334");
        ds.Item[] itemArray0 = new ds.Item[] {};
        ds.Ordenacao.heapsort(itemArray0, 0);
        ds.Ordenacao.insercao(itemArray0, 0);
        ds.Ordenacao.insercao(itemArray0, (int) (short) 0);
        ds.Ordenacao.selecao(itemArray0, 1);
        ds.Ordenacao.shellsort(itemArray0, (int) (short) 1);
        ds.Ordenacao.insercao(itemArray0, (int) (short) 1);
        ds.Ordenacao.heapsort(itemArray0, (-1));
        ds.Ordenacao.selecao(itemArray0, (int) (byte) 1);
        ds.Ordenacao.shellsort(itemArray0, (int) (byte) 0);
        org.junit.Assert.assertNotNull(itemArray0);
    }

    @Test
    public void test2335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2335");
        ds.Item[] itemArray0 = new ds.Item[] {};
        ds.Ordenacao.heapsort(itemArray0, 0);
        ds.Ordenacao.insercao(itemArray0, 0);
        ds.Ordenacao.insercao(itemArray0, (int) (short) 0);
        ds.Ordenacao.selecao(itemArray0, 1);
        ds.Ordenacao.selecao(itemArray0, 0);
        ds.Ordenacao.heapsort(itemArray0, (int) (byte) -1);
        ds.Ordenacao.heapsort(itemArray0, 1);
        org.junit.Assert.assertNotNull(itemArray0);
    }

    @Test
    public void test2336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2336");
        ds.Item[] itemArray0 = new ds.Item[] {};
        ds.Ordenacao.heapsort(itemArray0, 0);
        ds.Ordenacao.insercao(itemArray0, 0);
        ds.Ordenacao.shellsort(itemArray0, (-1));
        ds.Ordenacao.selecao(itemArray0, (int) (short) -1);
        ds.Ordenacao.insercao(itemArray0, 1);
        ds.Ordenacao.shellsort(itemArray0, 0);
        ds.Ordenacao.heapsort(itemArray0, (int) (byte) -1);
        ds.Ordenacao.insercao(itemArray0, 0);
        org.junit.Assert.assertNotNull(itemArray0);
    }

    @Test
    public void test2337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2337");
        ds.Item[] itemArray0 = new ds.Item[] {};
        ds.Ordenacao.heapsort(itemArray0, 0);
        ds.Ordenacao.insercao(itemArray0, 0);
        ds.Ordenacao.insercao(itemArray0, (int) (short) 0);
        ds.Ordenacao.selecao(itemArray0, 1);
        ds.Ordenacao.shellsort(itemArray0, (int) (short) 1);
        ds.Ordenacao.insercao(itemArray0, (int) (short) 1);
        ds.Ordenacao.selecao(itemArray0, 0);
        ds.Ordenacao.shellsort(itemArray0, (-1));
        ds.Ordenacao.selecao(itemArray0, (int) (byte) -1);
        ds.Ordenacao.heapsort(itemArray0, (int) (short) 0);
        ds.Ordenacao.insercao(itemArray0, (int) (byte) -1);
        org.junit.Assert.assertNotNull(itemArray0);
    }

    @Test
    public void test2338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2338");
        ds.Item[] itemArray0 = new ds.Item[] {};
        ds.Ordenacao.heapsort(itemArray0, 0);
        ds.Ordenacao.insercao(itemArray0, 0);
        ds.Ordenacao.shellsort(itemArray0, (-1));
        ds.Ordenacao.insercao(itemArray0, (int) (byte) 1);
        ds.Ordenacao.selecao(itemArray0, 0);
        ds.Ordenacao.selecao(itemArray0, (int) (byte) -1);
        ds.Ordenacao.selecao(itemArray0, 0);
        // The following exception was thrown during execution in test generation
        try {
            ds.Ordenacao.selecao(itemArray0, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 2");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray0);
    }

    @Test
    public void test2339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2339");
        ds.Item[] itemArray0 = new ds.Item[] {};
        ds.Ordenacao.shellsort(itemArray0, 0);
        ds.Ordenacao.shellsort(itemArray0, (int) (byte) -1);
        ds.Ordenacao.selecao(itemArray0, (-1));
        ds.Ordenacao.selecao(itemArray0, (int) (byte) -1);
        // The following exception was thrown during execution in test generation
        try {
            ds.Ordenacao.quicksort(itemArray0, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 0");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray0);
    }

    @Test
    public void test2340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2340");
        ds.Item[] itemArray0 = new ds.Item[] {};
        ds.Ordenacao.heapsort(itemArray0, 0);
        ds.Ordenacao.heapsort(itemArray0, 0);
        ds.Ordenacao.insercao(itemArray0, (int) (short) -1);
        ds.Ordenacao.insercao(itemArray0, (int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            ds.Ordenacao.quicksort(itemArray0, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 0");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray0);
    }

    @Test
    public void test2341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2341");
        ds.Item[] itemArray0 = new ds.Item[] {};
        ds.Ordenacao.heapsort(itemArray0, 0);
        ds.Ordenacao.insercao(itemArray0, 0);
        ds.Ordenacao.shellsort(itemArray0, (-1));
        ds.Ordenacao.selecao(itemArray0, (-1));
        ds.Ordenacao.heapsort(itemArray0, (int) (short) 0);
        ds.Ordenacao.heapsort(itemArray0, 0);
        ds.Ordenacao.heapsort(itemArray0, 1);
        ds.Ordenacao.shellsort(itemArray0, 0);
        // The following exception was thrown during execution in test generation
        try {
            ds.Ordenacao.heapsort(itemArray0, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray0);
    }

    @Test
    public void test2342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2342");
        ds.Item[] itemArray0 = new ds.Item[] {};
        ds.Ordenacao.heapsort(itemArray0, 0);
        ds.Ordenacao.insercao(itemArray0, 0);
        ds.Ordenacao.insercao(itemArray0, (int) (short) 0);
        ds.Ordenacao.selecao(itemArray0, 1);
        ds.Ordenacao.selecao(itemArray0, (int) (short) -1);
        ds.Ordenacao.shellsort(itemArray0, (int) (short) -1);
        ds.Ordenacao.heapsort(itemArray0, (int) (short) 1);
        ds.Ordenacao.heapsort(itemArray0, (int) (byte) 1);
        ds.Ordenacao.selecao(itemArray0, (int) (short) 1);
        ds.Ordenacao.shellsort(itemArray0, (int) (byte) -1);
        org.junit.Assert.assertNotNull(itemArray0);
    }

    @Test
    public void test2343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2343");
        ds.Item item0 = null;
        ds.Item[] itemArray1 = new ds.Item[] { item0 };
        ds.Ordenacao.heapsort(itemArray1, 0);
        ds.Ordenacao.heapsort(itemArray1, 1);
        ds.Ordenacao.shellsort(itemArray1, (-1));
        ds.Ordenacao.selecao(itemArray1, (int) (byte) -1);
        ds.Ordenacao.selecao(itemArray1, (int) (short) 0);
        org.junit.Assert.assertNotNull(itemArray1);
    }

    @Test
    public void test2344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2344");
        ds.Item[] itemArray0 = new ds.Item[] {};
        ds.Ordenacao.heapsort(itemArray0, 0);
        ds.Ordenacao.insercao(itemArray0, 0);
        ds.Ordenacao.insercao(itemArray0, (int) (short) 0);
        ds.Ordenacao.selecao(itemArray0, 1);
        ds.Ordenacao.insercao(itemArray0, 1);
        ds.Ordenacao.heapsort(itemArray0, (int) (short) 0);
        java.lang.Class<?> wildcardClass13 = itemArray0.getClass();
        org.junit.Assert.assertNotNull(itemArray0);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test2345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2345");
        ds.Item[] itemArray0 = new ds.Item[] {};
        ds.Ordenacao.heapsort(itemArray0, 0);
        ds.Ordenacao.insercao(itemArray0, 0);
        ds.Ordenacao.insercao(itemArray0, (int) (short) 0);
        ds.Ordenacao.heapsort(itemArray0, (-1));
        ds.Ordenacao.heapsort(itemArray0, (int) (byte) 1);
        java.lang.Class<?> wildcardClass11 = itemArray0.getClass();
        org.junit.Assert.assertNotNull(itemArray0);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test2346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2346");
        ds.Item[] itemArray0 = new ds.Item[] {};
        ds.Ordenacao.heapsort(itemArray0, 0);
        ds.Ordenacao.heapsort(itemArray0, 0);
        ds.Ordenacao.shellsort(itemArray0, (int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            ds.Ordenacao.quicksort(itemArray0, (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 0");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray0);
    }

    @Test
    public void test2347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2347");
        ds.Item[] itemArray0 = new ds.Item[] {};
        ds.Ordenacao.heapsort(itemArray0, 0);
        ds.Ordenacao.insercao(itemArray0, 0);
        ds.Ordenacao.shellsort(itemArray0, (-1));
        ds.Ordenacao.selecao(itemArray0, (-1));
        ds.Ordenacao.heapsort(itemArray0, (int) (short) 0);
        ds.Ordenacao.heapsort(itemArray0, 0);
        ds.Ordenacao.selecao(itemArray0, 0);
        ds.Ordenacao.insercao(itemArray0, (-1));
        ds.Ordenacao.heapsort(itemArray0, (int) (short) 1);
        ds.Ordenacao.selecao(itemArray0, (int) (byte) -1);
        ds.Ordenacao.insercao(itemArray0, (int) (short) -1);
        org.junit.Assert.assertNotNull(itemArray0);
    }

    @Test
    public void test2348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2348");
        ds.Item[] itemArray0 = new ds.Item[] {};
        ds.Ordenacao.heapsort(itemArray0, 0);
        ds.Ordenacao.insercao(itemArray0, 0);
        ds.Ordenacao.insercao(itemArray0, (int) (short) 0);
        ds.Ordenacao.selecao(itemArray0, 1);
        ds.Ordenacao.shellsort(itemArray0, (int) (short) 1);
        ds.Ordenacao.shellsort(itemArray0, 0);
        ds.Ordenacao.shellsort(itemArray0, (-1));
        ds.Ordenacao.heapsort(itemArray0, 1);
        ds.Ordenacao.selecao(itemArray0, 1);
        java.lang.Class<?> wildcardClass19 = itemArray0.getClass();
        org.junit.Assert.assertNotNull(itemArray0);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test2349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2349");
        ds.Item[] itemArray0 = new ds.Item[] {};
        ds.Ordenacao.heapsort(itemArray0, 0);
        ds.Ordenacao.insercao(itemArray0, 0);
        ds.Ordenacao.selecao(itemArray0, 0);
        ds.Ordenacao.insercao(itemArray0, (-1));
        ds.Ordenacao.heapsort(itemArray0, (-1));
        ds.Ordenacao.heapsort(itemArray0, 1);
        ds.Ordenacao.selecao(itemArray0, (-1));
        ds.Ordenacao.shellsort(itemArray0, (int) (byte) -1);
        ds.Ordenacao.shellsort(itemArray0, 1);
        // The following exception was thrown during execution in test generation
        try {
            ds.Ordenacao.selecao(itemArray0, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 2");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray0);
    }

    @Test
    public void test2350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2350");
        ds.Item[] itemArray0 = new ds.Item[] {};
        ds.Ordenacao.heapsort(itemArray0, 0);
        ds.Ordenacao.insercao(itemArray0, 0);
        ds.Ordenacao.shellsort(itemArray0, (-1));
        ds.Ordenacao.insercao(itemArray0, (int) (byte) 1);
        ds.Ordenacao.selecao(itemArray0, 0);
        ds.Ordenacao.selecao(itemArray0, (int) (byte) -1);
        ds.Ordenacao.selecao(itemArray0, 0);
        ds.Ordenacao.insercao(itemArray0, (int) (byte) 1);
        ds.Ordenacao.heapsort(itemArray0, (int) (short) 1);
        ds.Ordenacao.heapsort(itemArray0, (int) (short) -1);
        // The following exception was thrown during execution in test generation
        try {
            ds.Ordenacao.heapsort(itemArray0, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray0);
    }

    @Test
    public void test2351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2351");
        ds.Item item0 = null;
        ds.Item[] itemArray1 = new ds.Item[] { item0 };
        ds.Ordenacao.selecao(itemArray1, (int) (short) 1);
        ds.Ordenacao.heapsort(itemArray1, 0);
        ds.Ordenacao.selecao(itemArray1, 0);
        ds.Ordenacao.shellsort(itemArray1, (-1));
        org.junit.Assert.assertNotNull(itemArray1);
    }

    @Test
    public void test2352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2352");
        ds.Item[] itemArray0 = new ds.Item[] {};
        ds.Ordenacao.heapsort(itemArray0, 0);
        ds.Ordenacao.insercao(itemArray0, 0);
        ds.Ordenacao.insercao(itemArray0, (int) (short) 0);
        ds.Ordenacao.selecao(itemArray0, 1);
        ds.Ordenacao.selecao(itemArray0, (int) (short) -1);
        ds.Ordenacao.heapsort(itemArray0, (int) (short) 1);
        ds.Ordenacao.heapsort(itemArray0, (int) (short) 1);
        ds.Ordenacao.shellsort(itemArray0, (int) (short) -1);
        ds.Ordenacao.shellsort(itemArray0, (int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            ds.Ordenacao.shellsort(itemArray0, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 41");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray0);
    }

    @Test
    public void test2353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2353");
        ds.Item[] itemArray0 = new ds.Item[] {};
        ds.Ordenacao.heapsort(itemArray0, 0);
        ds.Ordenacao.insercao(itemArray0, 0);
        ds.Ordenacao.selecao(itemArray0, 0);
        ds.Ordenacao.shellsort(itemArray0, (int) (byte) 1);
        ds.Ordenacao.insercao(itemArray0, 0);
        ds.Ordenacao.shellsort(itemArray0, (int) (short) 0);
        ds.Ordenacao.heapsort(itemArray0, (int) (byte) 0);
        ds.Ordenacao.insercao(itemArray0, (int) (short) 0);
        ds.Ordenacao.heapsort(itemArray0, 0);
        // The following exception was thrown during execution in test generation
        try {
            ds.Ordenacao.selecao(itemArray0, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 2");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray0);
    }

    @Test
    public void test2354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2354");
        ds.Item[] itemArray0 = new ds.Item[] {};
        ds.Ordenacao.heapsort(itemArray0, 0);
        ds.Ordenacao.insercao(itemArray0, 0);
        ds.Ordenacao.insercao(itemArray0, 0);
        ds.Ordenacao.insercao(itemArray0, (int) (short) 1);
        ds.Ordenacao.selecao(itemArray0, (int) (short) -1);
        ds.Ordenacao.insercao(itemArray0, (int) (short) 0);
        org.junit.Assert.assertNotNull(itemArray0);
    }

    @Test
    public void test2355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2355");
        ds.Item[] itemArray0 = new ds.Item[] {};
        ds.Ordenacao.heapsort(itemArray0, 0);
        ds.Ordenacao.insercao(itemArray0, 0);
        ds.Ordenacao.shellsort(itemArray0, (-1));
        ds.Ordenacao.selecao(itemArray0, (-1));
        ds.Ordenacao.heapsort(itemArray0, (int) (short) 0);
        ds.Ordenacao.heapsort(itemArray0, (int) (short) 1);
        ds.Ordenacao.heapsort(itemArray0, (int) (byte) 0);
        ds.Ordenacao.insercao(itemArray0, (int) (byte) -1);
        // The following exception was thrown during execution in test generation
        try {
            ds.Ordenacao.heapsort(itemArray0, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray0);
    }

    @Test
    public void test2356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2356");
        ds.Item[] itemArray0 = new ds.Item[] {};
        ds.Ordenacao.heapsort(itemArray0, 0);
        ds.Ordenacao.insercao(itemArray0, 0);
        ds.Ordenacao.heapsort(itemArray0, 1);
        ds.Ordenacao.shellsort(itemArray0, (int) (short) 1);
        ds.Ordenacao.selecao(itemArray0, 0);
        ds.Ordenacao.selecao(itemArray0, (int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            ds.Ordenacao.insercao(itemArray0, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray0);
    }

    @Test
    public void test2357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2357");
        ds.Item[] itemArray0 = new ds.Item[] {};
        ds.Ordenacao.heapsort(itemArray0, 0);
        ds.Ordenacao.insercao(itemArray0, 0);
        ds.Ordenacao.shellsort(itemArray0, (-1));
        ds.Ordenacao.selecao(itemArray0, (-1));
        ds.Ordenacao.shellsort(itemArray0, (int) (byte) 0);
        ds.Ordenacao.insercao(itemArray0, (int) (short) -1);
        ds.Ordenacao.heapsort(itemArray0, (int) (short) 0);
        org.junit.Assert.assertNotNull(itemArray0);
    }

    @Test
    public void test2358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2358");
        ds.Item[] itemArray0 = new ds.Item[] {};
        ds.Ordenacao.heapsort(itemArray0, 0);
        ds.Ordenacao.insercao(itemArray0, 0);
        // The following exception was thrown during execution in test generation
        try {
            ds.Ordenacao.shellsort(itemArray0, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 41");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray0);
    }

    @Test
    public void test2359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2359");
        ds.Item[] itemArray0 = new ds.Item[] {};
        ds.Ordenacao.heapsort(itemArray0, 0);
        ds.Ordenacao.heapsort(itemArray0, 0);
        ds.Ordenacao.shellsort(itemArray0, (int) (byte) 0);
        ds.Ordenacao.insercao(itemArray0, 0);
        ds.Ordenacao.heapsort(itemArray0, 1);
        // The following exception was thrown during execution in test generation
        try {
            ds.Ordenacao.quicksort(itemArray0, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 26");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray0);
    }

    @Test
    public void test2360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2360");
        ds.Item[] itemArray0 = new ds.Item[] {};
        ds.Ordenacao.heapsort(itemArray0, 0);
        ds.Ordenacao.insercao(itemArray0, 0);
        ds.Ordenacao.selecao(itemArray0, 0);
        ds.Ordenacao.insercao(itemArray0, (-1));
        ds.Ordenacao.heapsort(itemArray0, (-1));
        ds.Ordenacao.selecao(itemArray0, 1);
        ds.Ordenacao.heapsort(itemArray0, (int) (byte) -1);
        ds.Ordenacao.heapsort(itemArray0, 1);
        ds.Ordenacao.shellsort(itemArray0, (int) (short) -1);
        ds.Ordenacao.shellsort(itemArray0, (int) (short) 1);
        org.junit.Assert.assertNotNull(itemArray0);
    }

    @Test
    public void test2361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2361");
        ds.Item[] itemArray0 = new ds.Item[] {};
        ds.Ordenacao.heapsort(itemArray0, 0);
        ds.Ordenacao.insercao(itemArray0, 0);
        ds.Ordenacao.heapsort(itemArray0, 1);
        ds.Ordenacao.selecao(itemArray0, (int) (byte) 0);
        ds.Ordenacao.shellsort(itemArray0, 0);
        ds.Ordenacao.shellsort(itemArray0, (int) (short) 1);
        org.junit.Assert.assertNotNull(itemArray0);
    }

    @Test
    public void test2362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2362");
        ds.Item[] itemArray0 = new ds.Item[] {};
        ds.Ordenacao.heapsort(itemArray0, 0);
        ds.Ordenacao.insercao(itemArray0, 0);
        ds.Ordenacao.insercao(itemArray0, (int) (short) 0);
        ds.Ordenacao.selecao(itemArray0, 1);
        ds.Ordenacao.selecao(itemArray0, 0);
        ds.Ordenacao.selecao(itemArray0, 0);
        // The following exception was thrown during execution in test generation
        try {
            ds.Ordenacao.shellsort(itemArray0, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 41");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray0);
    }

    @Test
    public void test2363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2363");
        ds.Item[] itemArray0 = new ds.Item[] {};
        ds.Ordenacao.heapsort(itemArray0, 0);
        ds.Ordenacao.insercao(itemArray0, 0);
        ds.Ordenacao.shellsort(itemArray0, (-1));
        ds.Ordenacao.selecao(itemArray0, 0);
        ds.Ordenacao.selecao(itemArray0, (int) (byte) 1);
        ds.Ordenacao.insercao(itemArray0, (-1));
        // The following exception was thrown during execution in test generation
        try {
            ds.Ordenacao.insercao(itemArray0, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray0);
    }

    @Test
    public void test2364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2364");
        ds.Item[] itemArray0 = new ds.Item[] {};
        ds.Ordenacao.heapsort(itemArray0, 0);
        ds.Ordenacao.insercao(itemArray0, 0);
        ds.Ordenacao.shellsort(itemArray0, (-1));
        ds.Ordenacao.shellsort(itemArray0, (int) (byte) -1);
        ds.Ordenacao.selecao(itemArray0, (int) (byte) -1);
        ds.Ordenacao.heapsort(itemArray0, (int) (byte) -1);
        ds.Ordenacao.insercao(itemArray0, 0);
        java.lang.Class<?> wildcardClass15 = itemArray0.getClass();
        org.junit.Assert.assertNotNull(itemArray0);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test2365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2365");
        ds.Item item0 = null;
        ds.Item[] itemArray1 = new ds.Item[] { item0 };
        ds.Ordenacao.heapsort(itemArray1, 0);
        ds.Ordenacao.heapsort(itemArray1, 1);
        ds.Ordenacao.insercao(itemArray1, (int) (byte) -1);
        ds.Ordenacao.heapsort(itemArray1, (int) (byte) 1);
        org.junit.Assert.assertNotNull(itemArray1);
    }

    @Test
    public void test2366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2366");
        ds.Item[] itemArray0 = new ds.Item[] {};
        ds.Ordenacao.heapsort(itemArray0, 0);
        ds.Ordenacao.heapsort(itemArray0, (int) (byte) 0);
        ds.Ordenacao.shellsort(itemArray0, 0);
        ds.Ordenacao.heapsort(itemArray0, (int) (byte) -1);
        ds.Ordenacao.selecao(itemArray0, (int) (byte) 1);
        ds.Ordenacao.insercao(itemArray0, 1);
        ds.Ordenacao.shellsort(itemArray0, (int) (short) -1);
        org.junit.Assert.assertNotNull(itemArray0);
    }

    @Test
    public void test2367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2367");
        ds.Item[] itemArray0 = new ds.Item[] {};
        ds.Ordenacao.heapsort(itemArray0, 0);
        ds.Ordenacao.insercao(itemArray0, 0);
        ds.Ordenacao.insercao(itemArray0, (int) (short) 0);
        ds.Ordenacao.selecao(itemArray0, 1);
        ds.Ordenacao.selecao(itemArray0, (int) (short) -1);
        ds.Ordenacao.insercao(itemArray0, 0);
        ds.Ordenacao.heapsort(itemArray0, (int) (short) -1);
        ds.Ordenacao.shellsort(itemArray0, 0);
        ds.Ordenacao.shellsort(itemArray0, (-1));
        ds.Ordenacao.heapsort(itemArray0, (int) (short) -1);
        org.junit.Assert.assertNotNull(itemArray0);
    }

    @Test
    public void test2368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2368");
        ds.Item[] itemArray0 = new ds.Item[] {};
        ds.Ordenacao.heapsort(itemArray0, 0);
        ds.Ordenacao.insercao(itemArray0, 0);
        ds.Ordenacao.shellsort(itemArray0, (-1));
        ds.Ordenacao.insercao(itemArray0, (int) (byte) 1);
        ds.Ordenacao.selecao(itemArray0, 1);
        ds.Ordenacao.shellsort(itemArray0, (int) (short) 1);
        ds.Ordenacao.heapsort(itemArray0, (int) (short) -1);
        ds.Ordenacao.shellsort(itemArray0, (int) (short) 0);
        org.junit.Assert.assertNotNull(itemArray0);
    }

    @Test
    public void test2369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2369");
        ds.Item[] itemArray0 = new ds.Item[] {};
        ds.Ordenacao.heapsort(itemArray0, 0);
        ds.Ordenacao.insercao(itemArray0, 0);
        ds.Ordenacao.shellsort(itemArray0, (-1));
        ds.Ordenacao.insercao(itemArray0, (int) (byte) 1);
        ds.Ordenacao.selecao(itemArray0, 0);
        ds.Ordenacao.selecao(itemArray0, (int) (byte) -1);
        ds.Ordenacao.selecao(itemArray0, 0);
        ds.Ordenacao.insercao(itemArray0, (int) (byte) 1);
        ds.Ordenacao.insercao(itemArray0, (int) (byte) 0);
        ds.Ordenacao.insercao(itemArray0, (-1));
        ds.Ordenacao.insercao(itemArray0, (int) (byte) 0);
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
    public void test2370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2370");
        ds.Item[] itemArray0 = new ds.Item[] {};
        ds.Ordenacao.heapsort(itemArray0, 0);
        ds.Ordenacao.insercao(itemArray0, 0);
        ds.Ordenacao.shellsort(itemArray0, (-1));
        ds.Ordenacao.selecao(itemArray0, (-1));
        ds.Ordenacao.heapsort(itemArray0, (int) (short) 0);
        ds.Ordenacao.selecao(itemArray0, 1);
        ds.Ordenacao.heapsort(itemArray0, (int) (short) 1);
        ds.Ordenacao.insercao(itemArray0, (-1));
        org.junit.Assert.assertNotNull(itemArray0);
    }

    @Test
    public void test2371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2371");
        ds.Item[] itemArray0 = new ds.Item[] {};
        ds.Ordenacao.heapsort(itemArray0, 0);
        ds.Ordenacao.insercao(itemArray0, 0);
        ds.Ordenacao.shellsort(itemArray0, (-1));
        ds.Ordenacao.selecao(itemArray0, 0);
        ds.Ordenacao.selecao(itemArray0, (int) (byte) 1);
        ds.Ordenacao.insercao(itemArray0, (int) (byte) 1);
        org.junit.Assert.assertNotNull(itemArray0);
    }
}

