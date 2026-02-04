package ds.seed6733;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class Randoop3 {

    public static boolean debug = false;

    @Test
    public void test1501() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1501");
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
    public void test1502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1502");
        ds.Item[] itemArray0 = new ds.Item[] {};
        ds.Ordenacao.heapsort(itemArray0, 0);
        ds.Ordenacao.insercao(itemArray0, 0);
        ds.Ordenacao.shellsort(itemArray0, (-1));
        ds.Ordenacao.insercao(itemArray0, (int) (byte) 0);
        ds.Ordenacao.heapsort(itemArray0, (int) (byte) -1);
        ds.Ordenacao.insercao(itemArray0, (int) (byte) 0);
        ds.Ordenacao.shellsort(itemArray0, (int) (byte) 1);
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
    public void test1503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1503");
        ds.Item[] itemArray0 = new ds.Item[] {};
        ds.Ordenacao.shellsort(itemArray0, (int) (short) 1);
        ds.Ordenacao.selecao(itemArray0, 1);
        ds.Ordenacao.selecao(itemArray0, (int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            ds.Ordenacao.insercao(itemArray0, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 2");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray0);
    }

    @Test
    public void test1504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1504");
        ds.Item[] itemArray0 = new ds.Item[] {};
        ds.Ordenacao.heapsort(itemArray0, 0);
        ds.Ordenacao.insercao(itemArray0, 0);
        ds.Ordenacao.shellsort(itemArray0, (-1));
        ds.Ordenacao.selecao(itemArray0, (-1));
        ds.Ordenacao.heapsort(itemArray0, (int) (short) 0);
        ds.Ordenacao.selecao(itemArray0, 1);
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
    public void test1505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1505");
        ds.Item[] itemArray0 = new ds.Item[] {};
        ds.Ordenacao.heapsort(itemArray0, 0);
        ds.Ordenacao.insercao(itemArray0, 0);
        ds.Ordenacao.shellsort(itemArray0, (-1));
        ds.Ordenacao.selecao(itemArray0, (-1));
        ds.Ordenacao.heapsort(itemArray0, (int) (short) 0);
        ds.Ordenacao.selecao(itemArray0, 1);
        ds.Ordenacao.shellsort(itemArray0, (int) (byte) 0);
        ds.Ordenacao.insercao(itemArray0, 0);
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
    public void test1506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1506");
        ds.Item[] itemArray0 = new ds.Item[] {};
        ds.Ordenacao.heapsort(itemArray0, 0);
        ds.Ordenacao.insercao(itemArray0, 0);
        ds.Ordenacao.insercao(itemArray0, (int) (short) 0);
        ds.Ordenacao.selecao(itemArray0, 1);
        ds.Ordenacao.insercao(itemArray0, 1);
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
    public void test1507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1507");
        ds.Item[] itemArray0 = new ds.Item[] {};
        ds.Ordenacao.heapsort(itemArray0, 0);
        ds.Ordenacao.insercao(itemArray0, 0);
        ds.Ordenacao.insercao(itemArray0, (int) (short) 0);
        ds.Ordenacao.selecao(itemArray0, 1);
        ds.Ordenacao.shellsort(itemArray0, (int) (short) 1);
        ds.Ordenacao.insercao(itemArray0, (int) (short) 1);
        ds.Ordenacao.heapsort(itemArray0, (-1));
        ds.Ordenacao.selecao(itemArray0, (int) (byte) 1);
        ds.Ordenacao.heapsort(itemArray0, (-1));
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
    public void test1508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1508");
        ds.Item[] itemArray0 = new ds.Item[] {};
        ds.Ordenacao.shellsort(itemArray0, (int) (short) 1);
        ds.Ordenacao.selecao(itemArray0, 1);
        ds.Ordenacao.insercao(itemArray0, (int) (byte) 0);
        ds.Ordenacao.insercao(itemArray0, (int) (short) 1);
        ds.Ordenacao.heapsort(itemArray0, (-1));
        ds.Ordenacao.selecao(itemArray0, (int) (byte) -1);
        ds.Ordenacao.shellsort(itemArray0, 0);
        org.junit.Assert.assertNotNull(itemArray0);
    }

    @Test
    public void test1509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1509");
        ds.Item[] itemArray0 = new ds.Item[] {};
        ds.Ordenacao.heapsort(itemArray0, 0);
        ds.Ordenacao.insercao(itemArray0, 0);
        ds.Ordenacao.insercao(itemArray0, (int) (byte) 0);
        ds.Ordenacao.shellsort(itemArray0, 0);
        org.junit.Assert.assertNotNull(itemArray0);
    }

    @Test
    public void test1510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1510");
        ds.Item[] itemArray0 = new ds.Item[] {};
        ds.Ordenacao.heapsort(itemArray0, 0);
        ds.Ordenacao.insercao(itemArray0, 0);
        ds.Ordenacao.selecao(itemArray0, 0);
        ds.Ordenacao.selecao(itemArray0, (int) (short) 0);
        ds.Ordenacao.selecao(itemArray0, (int) (byte) 0);
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
    public void test1511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1511");
        ds.Item[] itemArray0 = new ds.Item[] {};
        ds.Ordenacao.heapsort(itemArray0, 0);
        ds.Ordenacao.insercao(itemArray0, 0);
        ds.Ordenacao.shellsort(itemArray0, (-1));
        ds.Ordenacao.selecao(itemArray0, (int) (short) -1);
        // The following exception was thrown during execution in test generation
        try {
            ds.Ordenacao.insercao(itemArray0, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 2");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray0);
    }

    @Test
    public void test1512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1512");
        ds.Item[] itemArray0 = new ds.Item[] {};
        ds.Ordenacao.heapsort(itemArray0, 0);
        ds.Ordenacao.insercao(itemArray0, 0);
        ds.Ordenacao.insercao(itemArray0, (int) (short) 0);
        ds.Ordenacao.selecao(itemArray0, 1);
        ds.Ordenacao.selecao(itemArray0, (int) (short) -1);
        ds.Ordenacao.shellsort(itemArray0, (int) (short) -1);
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
    public void test1513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1513");
        ds.Item[] itemArray0 = new ds.Item[] {};
        ds.Ordenacao.heapsort(itemArray0, 0);
        ds.Ordenacao.insercao(itemArray0, 0);
        ds.Ordenacao.selecao(itemArray0, 0);
        ds.Ordenacao.shellsort(itemArray0, (int) (byte) 1);
        ds.Ordenacao.insercao(itemArray0, 0);
        ds.Ordenacao.insercao(itemArray0, (int) (short) -1);
        ds.Ordenacao.insercao(itemArray0, (int) (byte) 0);
        ds.Ordenacao.insercao(itemArray0, (-1));
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
    public void test1514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1514");
        ds.Item[] itemArray0 = new ds.Item[] {};
        ds.Ordenacao.heapsort(itemArray0, 0);
        ds.Ordenacao.heapsort(itemArray0, 0);
        ds.Ordenacao.insercao(itemArray0, (int) (short) -1);
        ds.Ordenacao.insercao(itemArray0, (int) (short) 0);
        ds.Ordenacao.selecao(itemArray0, (int) (short) 1);
        java.lang.Class<?> wildcardClass11 = itemArray0.getClass();
        org.junit.Assert.assertNotNull(itemArray0);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test1515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1515");
        ds.Item[] itemArray0 = new ds.Item[] {};
        ds.Ordenacao.heapsort(itemArray0, 0);
        ds.Ordenacao.insercao(itemArray0, 0);
        ds.Ordenacao.selecao(itemArray0, 0);
        ds.Ordenacao.insercao(itemArray0, (-1));
        ds.Ordenacao.heapsort(itemArray0, (-1));
        ds.Ordenacao.insercao(itemArray0, (int) (short) -1);
        java.lang.Class<?> wildcardClass13 = itemArray0.getClass();
        org.junit.Assert.assertNotNull(itemArray0);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test1516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1516");
        ds.Item[] itemArray0 = new ds.Item[] {};
        ds.Ordenacao.heapsort(itemArray0, 0);
        ds.Ordenacao.heapsort(itemArray0, (int) (byte) 0);
        ds.Ordenacao.shellsort(itemArray0, 0);
        ds.Ordenacao.heapsort(itemArray0, (int) (byte) -1);
        ds.Ordenacao.heapsort(itemArray0, (int) (byte) 1);
        ds.Ordenacao.heapsort(itemArray0, 0);
        ds.Ordenacao.selecao(itemArray0, (int) (byte) -1);
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
    public void test1517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1517");
        ds.Item[] itemArray0 = new ds.Item[] {};
        ds.Ordenacao.heapsort(itemArray0, 0);
        ds.Ordenacao.insercao(itemArray0, 0);
        ds.Ordenacao.shellsort(itemArray0, (-1));
        ds.Ordenacao.insercao(itemArray0, (int) (byte) 1);
        ds.Ordenacao.selecao(itemArray0, 0);
        ds.Ordenacao.insercao(itemArray0, 0);
        ds.Ordenacao.selecao(itemArray0, (int) (short) -1);
        java.lang.Class<?> wildcardClass15 = itemArray0.getClass();
        org.junit.Assert.assertNotNull(itemArray0);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test1518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1518");
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
        java.lang.Class<?> wildcardClass21 = itemArray0.getClass();
        org.junit.Assert.assertNotNull(itemArray0);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test1519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1519");
        ds.Item[] itemArray0 = new ds.Item[] {};
        ds.Ordenacao.heapsort(itemArray0, 0);
        ds.Ordenacao.insercao(itemArray0, 0);
        ds.Ordenacao.shellsort(itemArray0, (-1));
        ds.Ordenacao.selecao(itemArray0, (-1));
        ds.Ordenacao.heapsort(itemArray0, (int) (short) 0);
        ds.Ordenacao.shellsort(itemArray0, (int) (short) 0);
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
    public void test1520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1520");
        ds.Item[] itemArray0 = new ds.Item[] {};
        ds.Ordenacao.heapsort(itemArray0, 0);
        ds.Ordenacao.insercao(itemArray0, 0);
        ds.Ordenacao.shellsort(itemArray0, (-1));
        ds.Ordenacao.insercao(itemArray0, (int) (byte) 1);
        ds.Ordenacao.insercao(itemArray0, 1);
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
    public void test1521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1521");
        ds.Item[] itemArray0 = new ds.Item[] {};
        ds.Ordenacao.heapsort(itemArray0, 0);
        ds.Ordenacao.heapsort(itemArray0, 0);
        // The following exception was thrown during execution in test generation
        try {
            ds.Ordenacao.insercao(itemArray0, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 2");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray0);
    }

    @Test
    public void test1522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1522");
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
        ds.Ordenacao.selecao(itemArray0, (int) (byte) 1);
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
    public void test1523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1523");
        ds.Item[] itemArray0 = new ds.Item[] {};
        ds.Ordenacao.heapsort(itemArray0, 0);
        ds.Ordenacao.insercao(itemArray0, 0);
        ds.Ordenacao.selecao(itemArray0, 0);
        ds.Ordenacao.insercao(itemArray0, (-1));
        ds.Ordenacao.heapsort(itemArray0, 1);
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
    public void test1524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1524");
        ds.Item[] itemArray0 = new ds.Item[] {};
        ds.Ordenacao.heapsort(itemArray0, 0);
        ds.Ordenacao.insercao(itemArray0, 0);
        ds.Ordenacao.shellsort(itemArray0, (-1));
        ds.Ordenacao.insercao(itemArray0, (int) (byte) 1);
        ds.Ordenacao.selecao(itemArray0, 0);
        ds.Ordenacao.insercao(itemArray0, 0);
        ds.Ordenacao.shellsort(itemArray0, 1);
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
    public void test1525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1525");
        ds.Item[] itemArray0 = new ds.Item[] {};
        ds.Ordenacao.heapsort(itemArray0, 0);
        ds.Ordenacao.insercao(itemArray0, 0);
        ds.Ordenacao.shellsort(itemArray0, (-1));
        ds.Ordenacao.insercao(itemArray0, (int) (byte) 1);
        ds.Ordenacao.insercao(itemArray0, (int) (byte) 1);
        ds.Ordenacao.shellsort(itemArray0, (int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            ds.Ordenacao.insercao(itemArray0, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 2");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray0);
    }

    @Test
    public void test1526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1526");
        ds.Item[] itemArray0 = new ds.Item[] {};
        ds.Ordenacao.heapsort(itemArray0, 0);
        ds.Ordenacao.insercao(itemArray0, 0);
        ds.Ordenacao.shellsort(itemArray0, (-1));
        ds.Ordenacao.selecao(itemArray0, (-1));
        ds.Ordenacao.heapsort(itemArray0, (int) (short) 0);
        ds.Ordenacao.selecao(itemArray0, 1);
        ds.Ordenacao.selecao(itemArray0, 1);
        ds.Ordenacao.selecao(itemArray0, (int) (short) -1);
        org.junit.Assert.assertNotNull(itemArray0);
    }

    @Test
    public void test1527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1527");
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
        ds.Ordenacao.heapsort(itemArray0, (-1));
        org.junit.Assert.assertNotNull(itemArray0);
    }

    @Test
    public void test1528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1528");
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
    public void test1529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1529");
        ds.Item[] itemArray0 = new ds.Item[] {};
        ds.Ordenacao.shellsort(itemArray0, (int) (short) 1);
        ds.Ordenacao.heapsort(itemArray0, 1);
        ds.Ordenacao.heapsort(itemArray0, (int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            ds.Ordenacao.insercao(itemArray0, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 2");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray0);
    }

    @Test
    public void test1530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1530");
        ds.Item[] itemArray0 = new ds.Item[] {};
        ds.Ordenacao.heapsort(itemArray0, 0);
        ds.Ordenacao.heapsort(itemArray0, 0);
        ds.Ordenacao.insercao(itemArray0, (int) (short) -1);
        ds.Ordenacao.shellsort(itemArray0, (int) (byte) 0);
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
    public void test1531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1531");
        ds.Item[] itemArray0 = new ds.Item[] {};
        ds.Ordenacao.heapsort(itemArray0, 0);
        ds.Ordenacao.insercao(itemArray0, 0);
        ds.Ordenacao.insercao(itemArray0, (int) (short) 0);
        ds.Ordenacao.selecao(itemArray0, 1);
        ds.Ordenacao.selecao(itemArray0, (int) (short) -1);
        ds.Ordenacao.selecao(itemArray0, 0);
        // The following exception was thrown during execution in test generation
        try {
            ds.Ordenacao.heapsort(itemArray0, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray0);
    }

    @Test
    public void test1532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1532");
        ds.Item[] itemArray0 = new ds.Item[] {};
        ds.Ordenacao.heapsort(itemArray0, 0);
        ds.Ordenacao.insercao(itemArray0, 0);
        ds.Ordenacao.insercao(itemArray0, (int) (short) 0);
        ds.Ordenacao.selecao(itemArray0, 1);
        ds.Ordenacao.selecao(itemArray0, (int) (short) -1);
        ds.Ordenacao.insercao(itemArray0, 0);
        ds.Ordenacao.heapsort(itemArray0, (int) (byte) 1);
        ds.Ordenacao.shellsort(itemArray0, 0);
        ds.Ordenacao.heapsort(itemArray0, (-1));
        // The following exception was thrown during execution in test generation
        try {
            ds.Ordenacao.heapsort(itemArray0, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray0);
    }

    @Test
    public void test1533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1533");
        ds.Item[] itemArray0 = new ds.Item[] {};
        ds.Ordenacao.heapsort(itemArray0, 0);
        ds.Ordenacao.insercao(itemArray0, 0);
        ds.Ordenacao.selecao(itemArray0, 0);
        ds.Ordenacao.selecao(itemArray0, (int) (short) 0);
        ds.Ordenacao.insercao(itemArray0, (int) (byte) -1);
        // The following exception was thrown during execution in test generation
        try {
            ds.Ordenacao.insercao(itemArray0, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 2");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray0);
    }

    @Test
    public void test1534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1534");
        ds.Item item0 = null;
        ds.Item[] itemArray1 = new ds.Item[] { item0 };
        ds.Ordenacao.heapsort(itemArray1, 0);
        ds.Ordenacao.shellsort(itemArray1, (int) (byte) 0);
        ds.Ordenacao.shellsort(itemArray1, (int) (short) 0);
        ds.Ordenacao.insercao(itemArray1, 0);
        ds.Ordenacao.heapsort(itemArray1, 0);
        // The following exception was thrown during execution in test generation
        try {
            ds.Ordenacao.insercao(itemArray1, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 2");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray1);
    }

    @Test
    public void test1535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1535");
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
        // The following exception was thrown during execution in test generation
        try {
            ds.Ordenacao.heapsort(itemArray0, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray0);
    }

    @Test
    public void test1536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1536");
        ds.Item[] itemArray0 = new ds.Item[] {};
        ds.Ordenacao.heapsort(itemArray0, 0);
        ds.Ordenacao.insercao(itemArray0, 0);
        ds.Ordenacao.selecao(itemArray0, 0);
        ds.Ordenacao.shellsort(itemArray0, (int) (byte) 1);
        ds.Ordenacao.insercao(itemArray0, 0);
        ds.Ordenacao.insercao(itemArray0, (int) (short) -1);
        ds.Ordenacao.insercao(itemArray0, (int) (byte) 0);
        ds.Ordenacao.heapsort(itemArray0, (-1));
        ds.Ordenacao.heapsort(itemArray0, (-1));
        org.junit.Assert.assertNotNull(itemArray0);
    }

    @Test
    public void test1537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1537");
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
        ds.Ordenacao.heapsort(itemArray0, 0);
        java.lang.Class<?> wildcardClass21 = itemArray0.getClass();
        org.junit.Assert.assertNotNull(itemArray0);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test1538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1538");
        ds.Item[] itemArray0 = new ds.Item[] {};
        ds.Ordenacao.heapsort(itemArray0, 0);
        ds.Ordenacao.insercao(itemArray0, 0);
        ds.Ordenacao.selecao(itemArray0, 0);
        ds.Ordenacao.shellsort(itemArray0, (int) (short) 1);
        ds.Ordenacao.shellsort(itemArray0, 0);
        java.lang.Class<?> wildcardClass11 = itemArray0.getClass();
        org.junit.Assert.assertNotNull(itemArray0);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test1539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1539");
        ds.Item[] itemArray0 = new ds.Item[] {};
        ds.Ordenacao.heapsort(itemArray0, 0);
        ds.Ordenacao.insercao(itemArray0, 0);
        ds.Ordenacao.selecao(itemArray0, 0);
        ds.Ordenacao.insercao(itemArray0, (-1));
        ds.Ordenacao.heapsort(itemArray0, (-1));
        ds.Ordenacao.selecao(itemArray0, (int) (byte) -1);
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
    public void test1540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1540");
        ds.Item[] itemArray0 = new ds.Item[] {};
        ds.Ordenacao.heapsort(itemArray0, 0);
        ds.Ordenacao.insercao(itemArray0, 0);
        ds.Ordenacao.insercao(itemArray0, 0);
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
    public void test1541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1541");
        ds.Item[] itemArray0 = new ds.Item[] {};
        ds.Ordenacao.heapsort(itemArray0, 0);
        ds.Ordenacao.insercao(itemArray0, 0);
        ds.Ordenacao.selecao(itemArray0, 0);
        ds.Ordenacao.insercao(itemArray0, (-1));
        ds.Ordenacao.heapsort(itemArray0, (-1));
        ds.Ordenacao.insercao(itemArray0, 0);
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
    public void test1542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1542");
        ds.Item[] itemArray0 = new ds.Item[] {};
        ds.Ordenacao.heapsort(itemArray0, 0);
        ds.Ordenacao.insercao(itemArray0, 0);
        ds.Ordenacao.selecao(itemArray0, 0);
        ds.Ordenacao.shellsort(itemArray0, (int) (byte) 1);
        ds.Ordenacao.selecao(itemArray0, 0);
        ds.Ordenacao.selecao(itemArray0, 1);
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
    public void test1543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1543");
        ds.Item[] itemArray0 = new ds.Item[] {};
        ds.Ordenacao.heapsort(itemArray0, 0);
        ds.Ordenacao.heapsort(itemArray0, (-1));
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
    public void test1544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1544");
        ds.Item[] itemArray0 = new ds.Item[] {};
        ds.Ordenacao.heapsort(itemArray0, 0);
        ds.Ordenacao.insercao(itemArray0, 0);
        ds.Ordenacao.insercao(itemArray0, 0);
        ds.Ordenacao.insercao(itemArray0, (int) (short) 1);
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
    public void test1545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1545");
        ds.Item[] itemArray0 = new ds.Item[] {};
        ds.Ordenacao.heapsort(itemArray0, 0);
        ds.Ordenacao.insercao(itemArray0, 0);
        ds.Ordenacao.shellsort(itemArray0, (-1));
        ds.Ordenacao.selecao(itemArray0, (-1));
        ds.Ordenacao.heapsort(itemArray0, (int) (short) 0);
        ds.Ordenacao.heapsort(itemArray0, (int) (short) 1);
        ds.Ordenacao.heapsort(itemArray0, (int) (byte) 0);
        ds.Ordenacao.selecao(itemArray0, (int) (byte) -1);
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
    public void test1546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1546");
        ds.Item[] itemArray0 = new ds.Item[] {};
        ds.Ordenacao.heapsort(itemArray0, 0);
        ds.Ordenacao.insercao(itemArray0, 0);
        ds.Ordenacao.shellsort(itemArray0, (-1));
        ds.Ordenacao.insercao(itemArray0, (int) (byte) 1);
        ds.Ordenacao.selecao(itemArray0, 1);
        ds.Ordenacao.insercao(itemArray0, (int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            ds.Ordenacao.insercao(itemArray0, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 2");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray0);
    }

    @Test
    public void test1547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1547");
        ds.Item item0 = null;
        ds.Item[] itemArray1 = new ds.Item[] { item0 };
        ds.Ordenacao.heapsort(itemArray1, 0);
        ds.Ordenacao.heapsort(itemArray1, 1);
        ds.Ordenacao.heapsort(itemArray1, 1);
        ds.Ordenacao.selecao(itemArray1, (int) (short) 1);
        ds.Ordenacao.selecao(itemArray1, (int) (short) 1);
        ds.Ordenacao.insercao(itemArray1, 0);
        ds.Ordenacao.heapsort(itemArray1, (int) (short) -1);
        ds.Ordenacao.shellsort(itemArray1, 0);
        // The following exception was thrown during execution in test generation
        try {
            ds.Ordenacao.insercao(itemArray1, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 2");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray1);
    }

    @Test
    public void test1548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1548");
        ds.Item[] itemArray0 = new ds.Item[] {};
        ds.Ordenacao.heapsort(itemArray0, 0);
        ds.Ordenacao.insercao(itemArray0, 0);
        ds.Ordenacao.shellsort(itemArray0, (-1));
        ds.Ordenacao.selecao(itemArray0, 0);
        ds.Ordenacao.insercao(itemArray0, (-1));
        ds.Ordenacao.insercao(itemArray0, (int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            ds.Ordenacao.heapsort(itemArray0, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray0);
    }

    @Test
    public void test1549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1549");
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
        ds.Ordenacao.shellsort(itemArray0, (int) (byte) 1);
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
    public void test1550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1550");
        ds.Item[] itemArray0 = new ds.Item[] {};
        ds.Ordenacao.heapsort(itemArray0, 0);
        ds.Ordenacao.insercao(itemArray0, 0);
        ds.Ordenacao.selecao(itemArray0, 0);
        ds.Ordenacao.shellsort(itemArray0, (int) (byte) 1);
        ds.Ordenacao.selecao(itemArray0, 0);
        ds.Ordenacao.selecao(itemArray0, (int) (byte) -1);
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
    public void test1551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1551");
        ds.Item[] itemArray0 = new ds.Item[] {};
        ds.Ordenacao.heapsort(itemArray0, 0);
        ds.Ordenacao.insercao(itemArray0, 0);
        ds.Ordenacao.shellsort(itemArray0, (-1));
        ds.Ordenacao.insercao(itemArray0, (int) (byte) 1);
        ds.Ordenacao.selecao(itemArray0, 0);
        ds.Ordenacao.shellsort(itemArray0, 1);
        ds.Ordenacao.heapsort(itemArray0, 0);
        java.lang.Class<?> wildcardClass15 = itemArray0.getClass();
        org.junit.Assert.assertNotNull(itemArray0);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test1552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1552");
        ds.Item[] itemArray0 = new ds.Item[] {};
        ds.Ordenacao.heapsort(itemArray0, 0);
        ds.Ordenacao.insercao(itemArray0, 0);
        ds.Ordenacao.shellsort(itemArray0, (-1));
        ds.Ordenacao.insercao(itemArray0, (int) (byte) 1);
        ds.Ordenacao.selecao(itemArray0, 0);
        ds.Ordenacao.heapsort(itemArray0, (int) (short) 1);
        ds.Ordenacao.selecao(itemArray0, 0);
        java.lang.Class<?> wildcardClass15 = itemArray0.getClass();
        org.junit.Assert.assertNotNull(itemArray0);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test1553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1553");
        ds.Item[] itemArray0 = new ds.Item[] {};
        ds.Ordenacao.heapsort(itemArray0, 0);
        ds.Ordenacao.insercao(itemArray0, 0);
        ds.Ordenacao.insercao(itemArray0, (int) (short) 0);
        ds.Ordenacao.selecao(itemArray0, 1);
        ds.Ordenacao.shellsort(itemArray0, (int) (short) 1);
        ds.Ordenacao.insercao(itemArray0, (int) (short) 1);
        ds.Ordenacao.heapsort(itemArray0, (-1));
        ds.Ordenacao.shellsort(itemArray0, 0);
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
    public void test1554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1554");
        ds.Item[] itemArray0 = new ds.Item[] {};
        ds.Ordenacao.heapsort(itemArray0, 0);
        ds.Ordenacao.insercao(itemArray0, 0);
        ds.Ordenacao.shellsort(itemArray0, (-1));
        ds.Ordenacao.insercao(itemArray0, (int) (byte) 1);
        ds.Ordenacao.selecao(itemArray0, 1);
        ds.Ordenacao.shellsort(itemArray0, (int) (short) 1);
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
    public void test1555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1555");
        ds.Item[] itemArray0 = new ds.Item[] {};
        ds.Ordenacao.heapsort(itemArray0, 0);
        ds.Ordenacao.insercao(itemArray0, 0);
        ds.Ordenacao.insercao(itemArray0, (int) (short) 0);
        ds.Ordenacao.selecao(itemArray0, 1);
        ds.Ordenacao.shellsort(itemArray0, (int) (short) 1);
        ds.Ordenacao.shellsort(itemArray0, 0);
        ds.Ordenacao.shellsort(itemArray0, (int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            ds.Ordenacao.heapsort(itemArray0, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray0);
    }

    @Test
    public void test1556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1556");
        ds.Item[] itemArray0 = new ds.Item[] {};
        ds.Ordenacao.heapsort(itemArray0, 0);
        ds.Ordenacao.insercao(itemArray0, 0);
        ds.Ordenacao.selecao(itemArray0, 0);
        ds.Ordenacao.shellsort(itemArray0, (int) (byte) 1);
        ds.Ordenacao.insercao(itemArray0, 0);
        ds.Ordenacao.shellsort(itemArray0, (int) (short) 0);
        ds.Ordenacao.insercao(itemArray0, (int) (short) 0);
        ds.Ordenacao.heapsort(itemArray0, 1);
        ds.Ordenacao.heapsort(itemArray0, 1);
        // The following exception was thrown during execution in test generation
        try {
            ds.Ordenacao.heapsort(itemArray0, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray0);
    }

    @Test
    public void test1557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1557");
        ds.Item[] itemArray0 = new ds.Item[] {};
        ds.Ordenacao.heapsort(itemArray0, 0);
        ds.Ordenacao.heapsort(itemArray0, (-1));
        ds.Ordenacao.insercao(itemArray0, 0);
        java.lang.Class<?> wildcardClass7 = itemArray0.getClass();
        org.junit.Assert.assertNotNull(itemArray0);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test1558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1558");
        ds.Item[] itemArray0 = new ds.Item[] {};
        ds.Ordenacao.heapsort(itemArray0, 0);
        ds.Ordenacao.insercao(itemArray0, 0);
        ds.Ordenacao.selecao(itemArray0, 0);
        ds.Ordenacao.insercao(itemArray0, (-1));
        ds.Ordenacao.insercao(itemArray0, (int) (byte) -1);
        ds.Ordenacao.heapsort(itemArray0, (int) (byte) -1);
        ds.Ordenacao.insercao(itemArray0, (int) (byte) -1);
        ds.Ordenacao.selecao(itemArray0, (int) (short) 1);
        org.junit.Assert.assertNotNull(itemArray0);
    }

    @Test
    public void test1559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1559");
        ds.Item[] itemArray0 = new ds.Item[] {};
        ds.Ordenacao.heapsort(itemArray0, 0);
        ds.Ordenacao.insercao(itemArray0, 0);
        ds.Ordenacao.shellsort(itemArray0, (-1));
        ds.Ordenacao.insercao(itemArray0, (int) (byte) 1);
        ds.Ordenacao.insercao(itemArray0, (int) (byte) 0);
        ds.Ordenacao.selecao(itemArray0, (int) (short) -1);
        ds.Ordenacao.heapsort(itemArray0, (int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            ds.Ordenacao.insercao(itemArray0, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 2");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray0);
    }

    @Test
    public void test1560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1560");
        ds.Item[] itemArray0 = new ds.Item[] {};
        ds.Ordenacao.heapsort(itemArray0, 0);
        ds.Ordenacao.insercao(itemArray0, 0);
        ds.Ordenacao.insercao(itemArray0, (int) (short) 0);
        ds.Ordenacao.selecao(itemArray0, 1);
        ds.Ordenacao.selecao(itemArray0, (int) (short) -1);
        ds.Ordenacao.insercao(itemArray0, 0);
        ds.Ordenacao.heapsort(itemArray0, (int) (short) -1);
        ds.Ordenacao.shellsort(itemArray0, (int) (short) 0);
        ds.Ordenacao.heapsort(itemArray0, (int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            ds.Ordenacao.heapsort(itemArray0, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray0);
    }

    @Test
    public void test1561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1561");
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
        java.lang.Class<?> wildcardClass23 = itemArray0.getClass();
        org.junit.Assert.assertNotNull(itemArray0);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test1562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1562");
        ds.Item item0 = null;
        ds.Item[] itemArray1 = new ds.Item[] { item0 };
        ds.Ordenacao.heapsort(itemArray1, 0);
        ds.Ordenacao.heapsort(itemArray1, 1);
        ds.Ordenacao.heapsort(itemArray1, 1);
        ds.Ordenacao.selecao(itemArray1, (int) (short) 1);
        ds.Ordenacao.selecao(itemArray1, (int) (short) 1);
        ds.Ordenacao.insercao(itemArray1, 0);
        ds.Ordenacao.heapsort(itemArray1, (int) (short) 0);
        ds.Ordenacao.shellsort(itemArray1, 1);
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
    public void test1563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1563");
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
            ds.Ordenacao.heapsort(itemArray0, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray0);
    }

    @Test
    public void test1564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1564");
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
        ds.Ordenacao.heapsort(itemArray0, (int) (byte) 1);
        org.junit.Assert.assertNotNull(itemArray0);
    }

    @Test
    public void test1565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1565");
        ds.Item[] itemArray0 = new ds.Item[] {};
        ds.Ordenacao.heapsort(itemArray0, 0);
        ds.Ordenacao.insercao(itemArray0, 0);
        ds.Ordenacao.shellsort(itemArray0, (-1));
        ds.Ordenacao.insercao(itemArray0, (int) (byte) 1);
        ds.Ordenacao.insercao(itemArray0, 1);
        ds.Ordenacao.shellsort(itemArray0, (int) (byte) 0);
        ds.Ordenacao.heapsort(itemArray0, (-1));
        org.junit.Assert.assertNotNull(itemArray0);
    }

    @Test
    public void test1566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1566");
        ds.Item[] itemArray0 = new ds.Item[] {};
        ds.Ordenacao.heapsort(itemArray0, 0);
        ds.Ordenacao.insercao(itemArray0, 0);
        ds.Ordenacao.selecao(itemArray0, 0);
        ds.Ordenacao.insercao(itemArray0, (-1));
        ds.Ordenacao.heapsort(itemArray0, (-1));
        ds.Ordenacao.selecao(itemArray0, 1);
        ds.Ordenacao.insercao(itemArray0, 0);
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
    public void test1567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1567");
        ds.Item item0 = null;
        ds.Item[] itemArray1 = new ds.Item[] { item0 };
        ds.Ordenacao.heapsort(itemArray1, 0);
        ds.Ordenacao.shellsort(itemArray1, (int) (byte) 0);
        ds.Ordenacao.heapsort(itemArray1, (-1));
        ds.Ordenacao.heapsort(itemArray1, (int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            ds.Ordenacao.insercao(itemArray1, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 2");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray1);
    }

    @Test
    public void test1568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1568");
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
            ds.Ordenacao.quicksort(itemArray0, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 50");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray0);
    }

    @Test
    public void test1569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1569");
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
        ds.Ordenacao.insercao(itemArray0, (int) (short) 1);
        java.lang.Class<?> wildcardClass23 = itemArray0.getClass();
        org.junit.Assert.assertNotNull(itemArray0);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test1570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1570");
        ds.Item[] itemArray0 = new ds.Item[] {};
        ds.Ordenacao.heapsort(itemArray0, 0);
        ds.Ordenacao.insercao(itemArray0, 0);
        ds.Ordenacao.insercao(itemArray0, (int) (short) 0);
        ds.Ordenacao.selecao(itemArray0, 1);
        ds.Ordenacao.selecao(itemArray0, (int) (short) -1);
        ds.Ordenacao.heapsort(itemArray0, (int) (short) 1);
        ds.Ordenacao.heapsort(itemArray0, (int) (short) 1);
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
    public void test1571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1571");
        ds.Item[] itemArray0 = new ds.Item[] {};
        ds.Ordenacao.heapsort(itemArray0, 0);
        ds.Ordenacao.insercao(itemArray0, 0);
        ds.Ordenacao.selecao(itemArray0, 0);
        ds.Ordenacao.insercao(itemArray0, (-1));
        ds.Ordenacao.heapsort(itemArray0, (-1));
        ds.Ordenacao.selecao(itemArray0, (int) (byte) -1);
        ds.Ordenacao.heapsort(itemArray0, (int) (short) -1);
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
    public void test1572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1572");
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
        ds.Ordenacao.shellsort(itemArray0, (int) (byte) 1);
        java.lang.Class<?> wildcardClass21 = itemArray0.getClass();
        org.junit.Assert.assertNotNull(itemArray0);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test1573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1573");
        ds.Item[] itemArray0 = new ds.Item[] {};
        ds.Ordenacao.heapsort(itemArray0, 0);
        ds.Ordenacao.insercao(itemArray0, 0);
        ds.Ordenacao.shellsort(itemArray0, (-1));
        ds.Ordenacao.insercao(itemArray0, (int) (byte) 1);
        ds.Ordenacao.selecao(itemArray0, 0);
        ds.Ordenacao.selecao(itemArray0, (int) (byte) -1);
        ds.Ordenacao.selecao(itemArray0, 0);
        ds.Ordenacao.insercao(itemArray0, (int) (byte) 1);
        ds.Ordenacao.selecao(itemArray0, (int) (byte) 0);
        ds.Ordenacao.selecao(itemArray0, 1);
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
    public void test1574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1574");
        ds.Item[] itemArray0 = new ds.Item[] {};
        ds.Ordenacao.heapsort(itemArray0, 0);
        ds.Ordenacao.heapsort(itemArray0, 0);
        ds.Ordenacao.shellsort(itemArray0, (int) (byte) 0);
        ds.Ordenacao.insercao(itemArray0, 0);
        ds.Ordenacao.heapsort(itemArray0, 1);
        ds.Ordenacao.heapsort(itemArray0, (int) (byte) 1);
        ds.Ordenacao.selecao(itemArray0, (int) (byte) 0);
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
    public void test1575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1575");
        ds.Item item0 = null;
        ds.Item[] itemArray1 = new ds.Item[] { item0 };
        ds.Ordenacao.heapsort(itemArray1, 0);
        ds.Ordenacao.heapsort(itemArray1, 1);
        ds.Ordenacao.shellsort(itemArray1, (-1));
        ds.Ordenacao.insercao(itemArray1, (-1));
        ds.Ordenacao.heapsort(itemArray1, 0);
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
    public void test1576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1576");
        ds.Item[] itemArray0 = new ds.Item[] {};
        ds.Ordenacao.heapsort(itemArray0, 0);
        ds.Ordenacao.insercao(itemArray0, 0);
        ds.Ordenacao.selecao(itemArray0, 0);
        ds.Ordenacao.insercao(itemArray0, (-1));
        ds.Ordenacao.insercao(itemArray0, (int) (byte) -1);
        ds.Ordenacao.heapsort(itemArray0, (int) (byte) 0);
        ds.Ordenacao.selecao(itemArray0, (int) (short) 0);
        ds.Ordenacao.heapsort(itemArray0, (int) (short) -1);
        org.junit.Assert.assertNotNull(itemArray0);
    }

    @Test
    public void test1577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1577");
        ds.Item[] itemArray0 = new ds.Item[] {};
        ds.Ordenacao.heapsort(itemArray0, 0);
        ds.Ordenacao.insercao(itemArray0, 0);
        ds.Ordenacao.selecao(itemArray0, 0);
        ds.Ordenacao.shellsort(itemArray0, (int) (byte) 1);
        ds.Ordenacao.insercao(itemArray0, 0);
        ds.Ordenacao.shellsort(itemArray0, (int) (short) 0);
        ds.Ordenacao.insercao(itemArray0, (int) (short) 0);
        ds.Ordenacao.heapsort(itemArray0, 1);
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
    public void test1578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1578");
        ds.Item[] itemArray0 = new ds.Item[] {};
        ds.Ordenacao.heapsort(itemArray0, 0);
        ds.Ordenacao.heapsort(itemArray0, (int) (byte) 0);
        ds.Ordenacao.shellsort(itemArray0, 0);
        ds.Ordenacao.heapsort(itemArray0, (int) (byte) -1);
        ds.Ordenacao.heapsort(itemArray0, (int) (byte) 1);
        ds.Ordenacao.heapsort(itemArray0, 0);
        ds.Ordenacao.heapsort(itemArray0, 1);
        org.junit.Assert.assertNotNull(itemArray0);
    }

    @Test
    public void test1579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1579");
        ds.Item item0 = null;
        ds.Item[] itemArray1 = new ds.Item[] { item0 };
        ds.Ordenacao.heapsort(itemArray1, 0);
        ds.Ordenacao.selecao(itemArray1, 0);
        ds.Ordenacao.selecao(itemArray1, 1);
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
    public void test1580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1580");
        ds.Item[] itemArray0 = new ds.Item[] {};
        ds.Ordenacao.heapsort(itemArray0, 0);
        ds.Ordenacao.insercao(itemArray0, 0);
        ds.Ordenacao.shellsort(itemArray0, (-1));
        ds.Ordenacao.insercao(itemArray0, (int) (byte) 1);
        ds.Ordenacao.selecao(itemArray0, 1);
        ds.Ordenacao.insercao(itemArray0, (int) (byte) 0);
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
    public void test1581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1581");
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
        // The following exception was thrown during execution in test generation
        try {
            ds.Ordenacao.insercao(itemArray0, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 2");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray0);
    }

    @Test
    public void test1582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1582");
        ds.Item[] itemArray0 = new ds.Item[] {};
        ds.Ordenacao.heapsort(itemArray0, 0);
        ds.Ordenacao.insercao(itemArray0, 0);
        ds.Ordenacao.shellsort(itemArray0, (-1));
        ds.Ordenacao.insercao(itemArray0, (int) (byte) 1);
        ds.Ordenacao.insercao(itemArray0, 1);
        ds.Ordenacao.shellsort(itemArray0, (int) (byte) 0);
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
    public void test1583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1583");
        ds.Item[] itemArray0 = new ds.Item[] {};
        ds.Ordenacao.heapsort(itemArray0, 0);
        ds.Ordenacao.insercao(itemArray0, 0);
        ds.Ordenacao.shellsort(itemArray0, (-1));
        ds.Ordenacao.selecao(itemArray0, (int) (short) -1);
        ds.Ordenacao.insercao(itemArray0, 1);
        ds.Ordenacao.shellsort(itemArray0, 0);
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
    public void test1584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1584");
        ds.Item[] itemArray0 = new ds.Item[] {};
        ds.Ordenacao.heapsort(itemArray0, 0);
        ds.Ordenacao.insercao(itemArray0, 0);
        ds.Ordenacao.insercao(itemArray0, (int) (short) 0);
        ds.Ordenacao.selecao(itemArray0, 1);
        ds.Ordenacao.selecao(itemArray0, (int) (short) -1);
        ds.Ordenacao.heapsort(itemArray0, (int) (short) 1);
        ds.Ordenacao.selecao(itemArray0, (int) (short) 0);
        ds.Ordenacao.shellsort(itemArray0, (int) (byte) -1);
        // The following exception was thrown during execution in test generation
        try {
            ds.Ordenacao.insercao(itemArray0, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 2");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray0);
    }

    @Test
    public void test1585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1585");
        ds.Item[] itemArray0 = new ds.Item[] {};
        ds.Ordenacao.heapsort(itemArray0, 0);
        ds.Ordenacao.insercao(itemArray0, 0);
        ds.Ordenacao.selecao(itemArray0, 0);
        ds.Ordenacao.insercao(itemArray0, (-1));
        ds.Ordenacao.heapsort(itemArray0, (-1));
        ds.Ordenacao.selecao(itemArray0, 1);
        ds.Ordenacao.heapsort(itemArray0, (int) (byte) -1);
        ds.Ordenacao.shellsort(itemArray0, (-1));
        ds.Ordenacao.shellsort(itemArray0, 0);
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
    public void test1586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1586");
        ds.Item[] itemArray0 = new ds.Item[] {};
        ds.Ordenacao.heapsort(itemArray0, 0);
        ds.Ordenacao.insercao(itemArray0, 0);
        ds.Ordenacao.selecao(itemArray0, 0);
        ds.Ordenacao.insercao(itemArray0, (-1));
        ds.Ordenacao.insercao(itemArray0, (int) (byte) -1);
        ds.Ordenacao.insercao(itemArray0, 0);
        ds.Ordenacao.heapsort(itemArray0, (int) (byte) -1);
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
    public void test1587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1587");
        ds.Item[] itemArray0 = new ds.Item[] {};
        ds.Ordenacao.heapsort(itemArray0, 0);
        ds.Ordenacao.heapsort(itemArray0, (int) (byte) 0);
        ds.Ordenacao.shellsort(itemArray0, 0);
        ds.Ordenacao.insercao(itemArray0, (-1));
        ds.Ordenacao.heapsort(itemArray0, (int) (byte) -1);
        ds.Ordenacao.insercao(itemArray0, (int) (short) 1);
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
    public void test1588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1588");
        ds.Item[] itemArray0 = new ds.Item[] {};
        ds.Ordenacao.heapsort(itemArray0, 0);
        ds.Ordenacao.insercao(itemArray0, 0);
        ds.Ordenacao.selecao(itemArray0, 0);
        ds.Ordenacao.shellsort(itemArray0, (int) (byte) 1);
        ds.Ordenacao.insercao(itemArray0, 0);
        ds.Ordenacao.shellsort(itemArray0, (int) (short) 0);
        ds.Ordenacao.selecao(itemArray0, (int) (byte) 1);
        org.junit.Assert.assertNotNull(itemArray0);
    }

    @Test
    public void test1589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1589");
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
        ds.Ordenacao.shellsort(itemArray0, (int) (byte) 1);
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
    public void test1590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1590");
        ds.Item[] itemArray0 = new ds.Item[] {};
        ds.Ordenacao.heapsort(itemArray0, 0);
        ds.Ordenacao.insercao(itemArray0, 0);
        ds.Ordenacao.insercao(itemArray0, (int) (short) 0);
        ds.Ordenacao.selecao(itemArray0, 1);
        ds.Ordenacao.shellsort(itemArray0, (int) (short) 1);
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
    public void test1591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1591");
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
        ds.Ordenacao.shellsort(itemArray0, (int) (short) 0);
        ds.Ordenacao.shellsort(itemArray0, (int) (byte) -1);
        org.junit.Assert.assertNotNull(itemArray0);
    }

    @Test
    public void test1592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1592");
        ds.Item[] itemArray0 = new ds.Item[] {};
        ds.Ordenacao.heapsort(itemArray0, 0);
        ds.Ordenacao.insercao(itemArray0, 0);
        ds.Ordenacao.selecao(itemArray0, 0);
        ds.Ordenacao.shellsort(itemArray0, (int) (short) 1);
        ds.Ordenacao.insercao(itemArray0, 0);
        ds.Ordenacao.selecao(itemArray0, (int) (byte) -1);
        ds.Ordenacao.insercao(itemArray0, (int) (short) 0);
        java.lang.Class<?> wildcardClass15 = itemArray0.getClass();
        org.junit.Assert.assertNotNull(itemArray0);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test1593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1593");
        ds.Item[] itemArray0 = new ds.Item[] {};
        ds.Ordenacao.heapsort(itemArray0, 0);
        ds.Ordenacao.insercao(itemArray0, 0);
        ds.Ordenacao.selecao(itemArray0, 0);
        ds.Ordenacao.insercao(itemArray0, (-1));
        ds.Ordenacao.insercao(itemArray0, (int) (byte) -1);
        ds.Ordenacao.heapsort(itemArray0, (int) (byte) 0);
        ds.Ordenacao.selecao(itemArray0, (int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            ds.Ordenacao.insercao(itemArray0, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 2");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray0);
    }

    @Test
    public void test1594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1594");
        ds.Item[] itemArray0 = new ds.Item[] {};
        ds.Ordenacao.heapsort(itemArray0, 0);
        ds.Ordenacao.heapsort(itemArray0, 0);
        ds.Ordenacao.shellsort(itemArray0, (int) (byte) 1);
        ds.Ordenacao.insercao(itemArray0, (int) (byte) 1);
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
    public void test1595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1595");
        ds.Item item0 = null;
        ds.Item[] itemArray1 = new ds.Item[] { item0 };
        ds.Ordenacao.heapsort(itemArray1, 0);
        ds.Ordenacao.heapsort(itemArray1, 1);
        ds.Ordenacao.shellsort(itemArray1, (-1));
        ds.Ordenacao.shellsort(itemArray1, (int) (byte) 1);
        org.junit.Assert.assertNotNull(itemArray1);
    }

    @Test
    public void test1596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1596");
        ds.Item[] itemArray0 = new ds.Item[] {};
        ds.Ordenacao.heapsort(itemArray0, 0);
        ds.Ordenacao.insercao(itemArray0, 0);
        ds.Ordenacao.shellsort(itemArray0, (-1));
        ds.Ordenacao.shellsort(itemArray0, (int) (byte) -1);
        ds.Ordenacao.selecao(itemArray0, (int) (byte) -1);
        ds.Ordenacao.shellsort(itemArray0, 0);
        ds.Ordenacao.shellsort(itemArray0, (int) (byte) 0);
        ds.Ordenacao.selecao(itemArray0, (int) (byte) 1);
        org.junit.Assert.assertNotNull(itemArray0);
    }

    @Test
    public void test1597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1597");
        ds.Item[] itemArray0 = new ds.Item[] {};
        ds.Ordenacao.heapsort(itemArray0, 0);
        ds.Ordenacao.heapsort(itemArray0, (int) (byte) 0);
        ds.Ordenacao.shellsort(itemArray0, 0);
        ds.Ordenacao.heapsort(itemArray0, (int) (byte) -1);
        ds.Ordenacao.selecao(itemArray0, 0);
        org.junit.Assert.assertNotNull(itemArray0);
    }

    @Test
    public void test1598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1598");
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
        ds.Ordenacao.shellsort(itemArray0, (int) (short) 1);
        org.junit.Assert.assertNotNull(itemArray0);
    }

    @Test
    public void test1599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1599");
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
        ds.Ordenacao.insercao(itemArray0, (int) (byte) -1);
        java.lang.Class<?> wildcardClass23 = itemArray0.getClass();
        org.junit.Assert.assertNotNull(itemArray0);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test1600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1600");
        ds.Item[] itemArray0 = new ds.Item[] {};
        ds.Ordenacao.heapsort(itemArray0, 0);
        ds.Ordenacao.insercao(itemArray0, 0);
        ds.Ordenacao.shellsort(itemArray0, (-1));
        ds.Ordenacao.insercao(itemArray0, (int) (byte) 0);
        ds.Ordenacao.heapsort(itemArray0, (int) (byte) -1);
        ds.Ordenacao.insercao(itemArray0, (int) (byte) 0);
        ds.Ordenacao.insercao(itemArray0, (-1));
        ds.Ordenacao.insercao(itemArray0, (int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            ds.Ordenacao.heapsort(itemArray0, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray0);
    }

    @Test
    public void test1601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1601");
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
        ds.Ordenacao.insercao(itemArray0, 0);
        org.junit.Assert.assertNotNull(itemArray0);
    }

    @Test
    public void test1602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1602");
        ds.Item[] itemArray0 = new ds.Item[] {};
        ds.Ordenacao.heapsort(itemArray0, 0);
        ds.Ordenacao.insercao(itemArray0, 0);
        ds.Ordenacao.selecao(itemArray0, 0);
        ds.Ordenacao.shellsort(itemArray0, (int) (byte) 1);
        ds.Ordenacao.insercao(itemArray0, 0);
        ds.Ordenacao.insercao(itemArray0, (int) (short) 1);
        ds.Ordenacao.selecao(itemArray0, (int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            ds.Ordenacao.insercao(itemArray0, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 2");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray0);
    }

    @Test
    public void test1603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1603");
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
        ds.Ordenacao.heapsort(itemArray0, (int) (short) -1);
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
    public void test1604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1604");
        ds.Item[] itemArray0 = new ds.Item[] {};
        ds.Ordenacao.heapsort(itemArray0, 0);
        ds.Ordenacao.insercao(itemArray0, 0);
        ds.Ordenacao.heapsort(itemArray0, 1);
        ds.Ordenacao.selecao(itemArray0, (int) (byte) 0);
        ds.Ordenacao.shellsort(itemArray0, 0);
        ds.Ordenacao.shellsort(itemArray0, (int) (short) 0);
        ds.Ordenacao.heapsort(itemArray0, 0);
        // The following exception was thrown during execution in test generation
        try {
            ds.Ordenacao.insercao(itemArray0, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 2");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray0);
    }

    @Test
    public void test1605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1605");
        ds.Item[] itemArray0 = new ds.Item[] {};
        ds.Ordenacao.heapsort(itemArray0, 0);
        ds.Ordenacao.insercao(itemArray0, 0);
        ds.Ordenacao.shellsort(itemArray0, (-1));
        ds.Ordenacao.insercao(itemArray0, (int) (byte) 0);
        ds.Ordenacao.heapsort(itemArray0, (int) (byte) -1);
        ds.Ordenacao.insercao(itemArray0, (int) (byte) 0);
        ds.Ordenacao.shellsort(itemArray0, (int) (byte) 1);
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
    public void test1606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1606");
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
        ds.Ordenacao.shellsort(itemArray0, 0);
        org.junit.Assert.assertNotNull(itemArray0);
    }

    @Test
    public void test1607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1607");
        ds.Item[] itemArray0 = new ds.Item[] {};
        ds.Ordenacao.heapsort(itemArray0, 0);
        ds.Ordenacao.insercao(itemArray0, 0);
        ds.Ordenacao.shellsort(itemArray0, (-1));
        ds.Ordenacao.insercao(itemArray0, (int) (byte) 1);
        ds.Ordenacao.insercao(itemArray0, 1);
        ds.Ordenacao.shellsort(itemArray0, (int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            ds.Ordenacao.insercao(itemArray0, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 2");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray0);
    }

    @Test
    public void test1608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1608");
        ds.Item[] itemArray0 = new ds.Item[] {};
        ds.Ordenacao.heapsort(itemArray0, 0);
        ds.Ordenacao.heapsort(itemArray0, (int) (byte) 0);
        ds.Ordenacao.shellsort(itemArray0, 0);
        ds.Ordenacao.heapsort(itemArray0, (int) (byte) -1);
        ds.Ordenacao.selecao(itemArray0, (int) (short) 0);
        ds.Ordenacao.selecao(itemArray0, (int) (byte) 0);
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
    public void test1609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1609");
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
        ds.Ordenacao.selecao(itemArray0, (int) (short) 1);
        java.lang.Class<?> wildcardClass23 = itemArray0.getClass();
        org.junit.Assert.assertNotNull(itemArray0);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test1610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1610");
        ds.Item[] itemArray0 = new ds.Item[] {};
        ds.Ordenacao.heapsort(itemArray0, 0);
        ds.Ordenacao.insercao(itemArray0, 0);
        ds.Ordenacao.insercao(itemArray0, (int) (short) 0);
        ds.Ordenacao.selecao(itemArray0, 1);
        ds.Ordenacao.selecao(itemArray0, (int) (short) -1);
        ds.Ordenacao.shellsort(itemArray0, (int) (short) -1);
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
    public void test1611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1611");
        ds.Item[] itemArray0 = new ds.Item[] {};
        ds.Ordenacao.heapsort(itemArray0, 0);
        ds.Ordenacao.insercao(itemArray0, 0);
        ds.Ordenacao.selecao(itemArray0, 0);
        ds.Ordenacao.insercao(itemArray0, (-1));
        ds.Ordenacao.heapsort(itemArray0, (-1));
        ds.Ordenacao.selecao(itemArray0, 1);
        ds.Ordenacao.heapsort(itemArray0, (int) (byte) -1);
        ds.Ordenacao.heapsort(itemArray0, 1);
        // The following exception was thrown during execution in test generation
        try {
            ds.Ordenacao.heapsort(itemArray0, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray0);
    }

    @Test
    public void test1612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1612");
        ds.Item[] itemArray0 = new ds.Item[] {};
        ds.Ordenacao.heapsort(itemArray0, 0);
        ds.Ordenacao.insercao(itemArray0, 0);
        ds.Ordenacao.selecao(itemArray0, 0);
        ds.Ordenacao.selecao(itemArray0, (int) (short) 0);
        ds.Ordenacao.insercao(itemArray0, (int) (byte) -1);
        ds.Ordenacao.selecao(itemArray0, (int) (short) -1);
        // The following exception was thrown during execution in test generation
        try {
            ds.Ordenacao.insercao(itemArray0, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 2");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray0);
    }

    @Test
    public void test1613() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1613");
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
        ds.Ordenacao.shellsort(itemArray0, (-1));
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
    public void test1614() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1614");
        ds.Item[] itemArray0 = new ds.Item[] {};
        ds.Ordenacao.heapsort(itemArray0, 0);
        ds.Ordenacao.insercao(itemArray0, 0);
        ds.Ordenacao.insercao(itemArray0, (int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            ds.Ordenacao.heapsort(itemArray0, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray0);
    }

    @Test
    public void test1615() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1615");
        ds.Item[] itemArray0 = new ds.Item[] {};
        ds.Ordenacao.shellsort(itemArray0, (int) (short) 1);
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
    public void test1616() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1616");
        ds.Item[] itemArray0 = new ds.Item[] {};
        ds.Ordenacao.heapsort(itemArray0, 0);
        ds.Ordenacao.insercao(itemArray0, 0);
        ds.Ordenacao.shellsort(itemArray0, (-1));
        ds.Ordenacao.selecao(itemArray0, 0);
        ds.Ordenacao.insercao(itemArray0, (int) (byte) 0);
        ds.Ordenacao.shellsort(itemArray0, (int) (short) 1);
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
    public void test1617() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1617");
        ds.Item[] itemArray0 = new ds.Item[] {};
        ds.Ordenacao.heapsort(itemArray0, 0);
        ds.Ordenacao.insercao(itemArray0, 0);
        ds.Ordenacao.shellsort(itemArray0, (-1));
        ds.Ordenacao.shellsort(itemArray0, (int) (byte) -1);
        ds.Ordenacao.selecao(itemArray0, (int) (byte) -1);
        // The following exception was thrown during execution in test generation
        try {
            ds.Ordenacao.heapsort(itemArray0, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray0);
    }

    @Test
    public void test1618() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1618");
        ds.Item[] itemArray0 = new ds.Item[] {};
        ds.Ordenacao.heapsort(itemArray0, 0);
        ds.Ordenacao.insercao(itemArray0, 0);
        ds.Ordenacao.insercao(itemArray0, (int) (short) 0);
        ds.Ordenacao.selecao(itemArray0, 1);
        ds.Ordenacao.selecao(itemArray0, 0);
        ds.Ordenacao.insercao(itemArray0, (int) (short) 0);
        ds.Ordenacao.shellsort(itemArray0, (int) (short) 1);
        org.junit.Assert.assertNotNull(itemArray0);
    }

    @Test
    public void test1619() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1619");
        ds.Item[] itemArray0 = new ds.Item[] {};
        ds.Ordenacao.heapsort(itemArray0, 0);
        ds.Ordenacao.insercao(itemArray0, 0);
        ds.Ordenacao.selecao(itemArray0, 0);
        ds.Ordenacao.insercao(itemArray0, (-1));
        ds.Ordenacao.heapsort(itemArray0, (-1));
        ds.Ordenacao.heapsort(itemArray0, 1);
        ds.Ordenacao.heapsort(itemArray0, (int) (byte) 0);
        java.lang.Class<?> wildcardClass15 = itemArray0.getClass();
        org.junit.Assert.assertNotNull(itemArray0);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test1620() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1620");
        ds.Item[] itemArray0 = new ds.Item[] {};
        ds.Ordenacao.heapsort(itemArray0, 0);
        ds.Ordenacao.heapsort(itemArray0, 0);
        ds.Ordenacao.shellsort(itemArray0, (int) (byte) 0);
        ds.Ordenacao.insercao(itemArray0, 0);
        ds.Ordenacao.selecao(itemArray0, 1);
        ds.Ordenacao.shellsort(itemArray0, (int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            ds.Ordenacao.insercao(itemArray0, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 2");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray0);
    }

    @Test
    public void test1621() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1621");
        ds.Item item0 = null;
        ds.Item[] itemArray1 = new ds.Item[] { item0 };
        ds.Ordenacao.heapsort(itemArray1, 0);
        ds.Ordenacao.insercao(itemArray1, (int) (short) -1);
        ds.Ordenacao.insercao(itemArray1, (int) (byte) -1);
        java.lang.Class<?> wildcardClass8 = itemArray1.getClass();
        org.junit.Assert.assertNotNull(itemArray1);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test1622() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1622");
        ds.Item item0 = null;
        ds.Item[] itemArray1 = new ds.Item[] { item0 };
        ds.Ordenacao.heapsort(itemArray1, 0);
        ds.Ordenacao.heapsort(itemArray1, 1);
        ds.Ordenacao.shellsort(itemArray1, (int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            ds.Ordenacao.shellsort(itemArray1, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 41");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray1);
    }

    @Test
    public void test1623() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1623");
        ds.Item[] itemArray0 = new ds.Item[] {};
        ds.Ordenacao.heapsort(itemArray0, 0);
        ds.Ordenacao.insercao(itemArray0, 0);
        ds.Ordenacao.selecao(itemArray0, 0);
        ds.Ordenacao.selecao(itemArray0, (int) (byte) -1);
        ds.Ordenacao.heapsort(itemArray0, (int) (short) -1);
        ds.Ordenacao.selecao(itemArray0, 0);
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
    public void test1624() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1624");
        ds.Item[] itemArray0 = new ds.Item[] {};
        ds.Ordenacao.heapsort(itemArray0, 0);
        ds.Ordenacao.heapsort(itemArray0, (int) (byte) 0);
        ds.Ordenacao.shellsort(itemArray0, 0);
        ds.Ordenacao.insercao(itemArray0, (-1));
        ds.Ordenacao.insercao(itemArray0, 0);
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
    public void test1625() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1625");
        ds.Item[] itemArray0 = new ds.Item[] {};
        ds.Ordenacao.heapsort(itemArray0, 0);
        ds.Ordenacao.insercao(itemArray0, 0);
        ds.Ordenacao.insercao(itemArray0, (int) (short) 0);
        ds.Ordenacao.selecao(itemArray0, 1);
        ds.Ordenacao.shellsort(itemArray0, (int) (short) 1);
        ds.Ordenacao.shellsort(itemArray0, 0);
        ds.Ordenacao.shellsort(itemArray0, (-1));
        ds.Ordenacao.heapsort(itemArray0, 1);
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
    public void test1626() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1626");
        ds.Item[] itemArray0 = new ds.Item[] {};
        ds.Ordenacao.heapsort(itemArray0, 0);
        ds.Ordenacao.insercao(itemArray0, 0);
        ds.Ordenacao.shellsort(itemArray0, (-1));
        ds.Ordenacao.insercao(itemArray0, (int) (byte) 1);
        ds.Ordenacao.selecao(itemArray0, 0);
        ds.Ordenacao.insercao(itemArray0, 0);
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
    public void test1627() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1627");
        ds.Item item0 = null;
        ds.Item[] itemArray1 = new ds.Item[] { item0 };
        ds.Ordenacao.heapsort(itemArray1, 0);
        ds.Ordenacao.heapsort(itemArray1, 1);
        // The following exception was thrown during execution in test generation
        try {
            ds.Ordenacao.insercao(itemArray1, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 2");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray1);
    }

    @Test
    public void test1628() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1628");
        ds.Item[] itemArray0 = new ds.Item[] {};
        ds.Ordenacao.shellsort(itemArray0, (int) (short) 1);
        ds.Ordenacao.selecao(itemArray0, 0);
        org.junit.Assert.assertNotNull(itemArray0);
    }

    @Test
    public void test1629() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1629");
        ds.Item[] itemArray0 = new ds.Item[] {};
        ds.Ordenacao.heapsort(itemArray0, 0);
        ds.Ordenacao.insercao(itemArray0, 0);
        ds.Ordenacao.selecao(itemArray0, 0);
        ds.Ordenacao.insercao(itemArray0, (-1));
        ds.Ordenacao.heapsort(itemArray0, (-1));
        ds.Ordenacao.selecao(itemArray0, (int) (byte) -1);
        ds.Ordenacao.shellsort(itemArray0, 0);
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
    public void test1630() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1630");
        ds.Item[] itemArray0 = new ds.Item[] {};
        ds.Ordenacao.heapsort(itemArray0, 0);
        ds.Ordenacao.insercao(itemArray0, 0);
        ds.Ordenacao.shellsort(itemArray0, (-1));
        ds.Ordenacao.insercao(itemArray0, (int) (byte) 0);
        ds.Ordenacao.insercao(itemArray0, 0);
        java.lang.Class<?> wildcardClass11 = itemArray0.getClass();
        org.junit.Assert.assertNotNull(itemArray0);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test1631() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1631");
        ds.Item[] itemArray0 = new ds.Item[] {};
        ds.Ordenacao.heapsort(itemArray0, 0);
        ds.Ordenacao.insercao(itemArray0, 0);
        ds.Ordenacao.shellsort(itemArray0, (-1));
        ds.Ordenacao.selecao(itemArray0, 0);
        ds.Ordenacao.insercao(itemArray0, (-1));
        ds.Ordenacao.insercao(itemArray0, (int) (byte) 0);
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
    public void test1632() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1632");
        ds.Item[] itemArray0 = new ds.Item[] {};
        ds.Ordenacao.heapsort(itemArray0, 0);
        ds.Ordenacao.insercao(itemArray0, 0);
        ds.Ordenacao.heapsort(itemArray0, 1);
        ds.Ordenacao.shellsort(itemArray0, (int) (short) 1);
        ds.Ordenacao.selecao(itemArray0, 0);
        ds.Ordenacao.selecao(itemArray0, (int) (short) 1);
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
    public void test1633() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1633");
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
            ds.Ordenacao.quicksort(itemArray0, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray0);
    }

    @Test
    public void test1634() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1634");
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
        ds.Ordenacao.insercao(itemArray0, (int) (byte) 0);
        org.junit.Assert.assertNotNull(itemArray0);
    }

    @Test
    public void test1635() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1635");
        ds.Item[] itemArray0 = new ds.Item[] {};
        ds.Ordenacao.heapsort(itemArray0, 0);
        ds.Ordenacao.insercao(itemArray0, 0);
        ds.Ordenacao.selecao(itemArray0, 0);
        ds.Ordenacao.shellsort(itemArray0, (int) (byte) 1);
        ds.Ordenacao.insercao(itemArray0, 0);
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
    public void test1636() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1636");
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
    public void test1637() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1637");
        ds.Item[] itemArray0 = new ds.Item[] {};
        ds.Ordenacao.heapsort(itemArray0, 0);
        ds.Ordenacao.insercao(itemArray0, 0);
        ds.Ordenacao.insercao(itemArray0, (int) (short) 0);
        ds.Ordenacao.selecao(itemArray0, 1);
        ds.Ordenacao.shellsort(itemArray0, (int) (short) 1);
        ds.Ordenacao.shellsort(itemArray0, 0);
        ds.Ordenacao.selecao(itemArray0, 0);
        ds.Ordenacao.selecao(itemArray0, (-1));
        java.lang.Class<?> wildcardClass17 = itemArray0.getClass();
        org.junit.Assert.assertNotNull(itemArray0);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test1638() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1638");
        ds.Item item0 = null;
        ds.Item[] itemArray1 = new ds.Item[] { item0 };
        ds.Ordenacao.heapsort(itemArray1, 0);
        ds.Ordenacao.selecao(itemArray1, 0);
        ds.Ordenacao.selecao(itemArray1, 1);
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
    public void test1639() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1639");
        ds.Item[] itemArray0 = new ds.Item[] {};
        ds.Ordenacao.heapsort(itemArray0, 0);
        ds.Ordenacao.insercao(itemArray0, 0);
        ds.Ordenacao.heapsort(itemArray0, 1);
        ds.Ordenacao.selecao(itemArray0, (int) (byte) 0);
        ds.Ordenacao.shellsort(itemArray0, 0);
        ds.Ordenacao.shellsort(itemArray0, (int) (short) 0);
        ds.Ordenacao.selecao(itemArray0, (int) (short) 0);
        java.lang.Class<?> wildcardClass15 = itemArray0.getClass();
        org.junit.Assert.assertNotNull(itemArray0);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test1640() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1640");
        ds.Item[] itemArray0 = new ds.Item[] {};
        ds.Ordenacao.heapsort(itemArray0, 0);
        ds.Ordenacao.insercao(itemArray0, 0);
        ds.Ordenacao.insercao(itemArray0, (int) (short) 0);
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
    public void test1641() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1641");
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
    public void test1642() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1642");
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
        ds.Ordenacao.heapsort(itemArray0, (int) (short) -1);
        java.lang.Class<?> wildcardClass23 = itemArray0.getClass();
        org.junit.Assert.assertNotNull(itemArray0);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test1643() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1643");
        ds.Item[] itemArray0 = new ds.Item[] {};
        ds.Ordenacao.heapsort(itemArray0, 0);
        ds.Ordenacao.insercao(itemArray0, 0);
        ds.Ordenacao.selecao(itemArray0, 0);
        ds.Ordenacao.shellsort(itemArray0, (int) (byte) 1);
        ds.Ordenacao.insercao(itemArray0, 0);
        ds.Ordenacao.shellsort(itemArray0, (int) (short) 0);
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
    public void test1644() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1644");
        ds.Item[] itemArray0 = new ds.Item[] {};
        ds.Ordenacao.heapsort(itemArray0, 0);
        ds.Ordenacao.insercao(itemArray0, 0);
        ds.Ordenacao.shellsort(itemArray0, (-1));
        ds.Ordenacao.insercao(itemArray0, (int) (byte) 1);
        ds.Ordenacao.selecao(itemArray0, 0);
        ds.Ordenacao.heapsort(itemArray0, (int) (short) 1);
        ds.Ordenacao.selecao(itemArray0, 0);
        ds.Ordenacao.heapsort(itemArray0, (int) (short) 0);
        java.lang.Class<?> wildcardClass17 = itemArray0.getClass();
        org.junit.Assert.assertNotNull(itemArray0);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test1645() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1645");
        ds.Item[] itemArray0 = new ds.Item[] {};
        ds.Ordenacao.heapsort(itemArray0, 0);
        ds.Ordenacao.insercao(itemArray0, 0);
        ds.Ordenacao.shellsort(itemArray0, (-1));
        ds.Ordenacao.selecao(itemArray0, 0);
        ds.Ordenacao.insercao(itemArray0, (int) (byte) 0);
        ds.Ordenacao.selecao(itemArray0, 0);
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
    public void test1646() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1646");
        ds.Item item0 = null;
        ds.Item[] itemArray1 = new ds.Item[] { item0 };
        ds.Ordenacao.heapsort(itemArray1, 0);
        ds.Ordenacao.selecao(itemArray1, 0);
        // The following exception was thrown during execution in test generation
        try {
            ds.Ordenacao.heapsort(itemArray1, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray1);
    }

    @Test
    public void test1647() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1647");
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
        java.lang.Class<?> wildcardClass19 = itemArray0.getClass();
        org.junit.Assert.assertNotNull(itemArray0);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test1648() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1648");
        ds.Item[] itemArray0 = new ds.Item[] {};
        ds.Ordenacao.heapsort(itemArray0, 0);
        ds.Ordenacao.insercao(itemArray0, 0);
        ds.Ordenacao.heapsort(itemArray0, 1);
        ds.Ordenacao.shellsort(itemArray0, (int) (short) 1);
        ds.Ordenacao.selecao(itemArray0, 0);
        ds.Ordenacao.insercao(itemArray0, (int) (byte) -1);
        // The following exception was thrown during execution in test generation
        try {
            ds.Ordenacao.insercao(itemArray0, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 2");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray0);
    }

    @Test
    public void test1649() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1649");
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
            ds.Ordenacao.selecao(itemArray0, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 2");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray0);
    }

    @Test
    public void test1650() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1650");
        ds.Item[] itemArray0 = new ds.Item[] {};
        ds.Ordenacao.heapsort(itemArray0, 0);
        ds.Ordenacao.insercao(itemArray0, 0);
        ds.Ordenacao.selecao(itemArray0, 0);
        ds.Ordenacao.shellsort(itemArray0, (int) (byte) 1);
        ds.Ordenacao.shellsort(itemArray0, (int) (byte) 1);
        ds.Ordenacao.insercao(itemArray0, (int) (byte) -1);
        java.lang.Class<?> wildcardClass13 = itemArray0.getClass();
        org.junit.Assert.assertNotNull(itemArray0);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test1651() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1651");
        ds.Item[] itemArray0 = new ds.Item[] {};
        ds.Ordenacao.heapsort(itemArray0, 0);
        ds.Ordenacao.heapsort(itemArray0, 0);
        ds.Ordenacao.insercao(itemArray0, (int) (short) -1);
        ds.Ordenacao.shellsort(itemArray0, (int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            ds.Ordenacao.heapsort(itemArray0, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray0);
    }

    @Test
    public void test1652() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1652");
        ds.Item[] itemArray0 = new ds.Item[] {};
        ds.Ordenacao.heapsort(itemArray0, 0);
        ds.Ordenacao.heapsort(itemArray0, (int) (byte) 0);
        ds.Ordenacao.shellsort(itemArray0, 0);
        ds.Ordenacao.heapsort(itemArray0, (int) (byte) -1);
        ds.Ordenacao.heapsort(itemArray0, (int) (byte) 1);
        ds.Ordenacao.heapsort(itemArray0, 0);
        java.lang.Class<?> wildcardClass13 = itemArray0.getClass();
        org.junit.Assert.assertNotNull(itemArray0);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test1653() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1653");
        ds.Item[] itemArray0 = new ds.Item[] {};
        ds.Ordenacao.heapsort(itemArray0, 0);
        ds.Ordenacao.insercao(itemArray0, 0);
        ds.Ordenacao.shellsort(itemArray0, (-1));
        ds.Ordenacao.insercao(itemArray0, (int) (byte) 1);
        ds.Ordenacao.insercao(itemArray0, (int) (byte) 0);
        ds.Ordenacao.selecao(itemArray0, (int) (short) -1);
        ds.Ordenacao.heapsort(itemArray0, (int) (short) 1);
        ds.Ordenacao.shellsort(itemArray0, (int) (short) 0);
        ds.Ordenacao.shellsort(itemArray0, (int) (byte) 1);
        org.junit.Assert.assertNotNull(itemArray0);
    }

    @Test
    public void test1654() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1654");
        ds.Item[] itemArray0 = new ds.Item[] {};
        ds.Ordenacao.heapsort(itemArray0, 0);
        ds.Ordenacao.heapsort(itemArray0, (int) (byte) 0);
        ds.Ordenacao.shellsort(itemArray0, 0);
        ds.Ordenacao.heapsort(itemArray0, (int) (byte) -1);
        ds.Ordenacao.heapsort(itemArray0, (int) (byte) 1);
        ds.Ordenacao.selecao(itemArray0, 0);
        ds.Ordenacao.insercao(itemArray0, (int) (short) 1);
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
    public void test1655() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1655");
        ds.Item[] itemArray0 = new ds.Item[] {};
        ds.Ordenacao.heapsort(itemArray0, 0);
        ds.Ordenacao.insercao(itemArray0, 0);
        ds.Ordenacao.insercao(itemArray0, (int) (short) 0);
        ds.Ordenacao.selecao(itemArray0, 1);
        ds.Ordenacao.selecao(itemArray0, 0);
        ds.Ordenacao.heapsort(itemArray0, (int) (short) -1);
        ds.Ordenacao.shellsort(itemArray0, 1);
        ds.Ordenacao.heapsort(itemArray0, (int) (byte) 0);
        org.junit.Assert.assertNotNull(itemArray0);
    }

    @Test
    public void test1656() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1656");
        ds.Item[] itemArray0 = new ds.Item[] {};
        ds.Ordenacao.shellsort(itemArray0, (int) (short) 1);
        ds.Ordenacao.selecao(itemArray0, 1);
        ds.Ordenacao.selecao(itemArray0, (int) (byte) 1);
        ds.Ordenacao.insercao(itemArray0, (int) (byte) 0);
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
    public void test1657() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1657");
        ds.Item[] itemArray0 = new ds.Item[] {};
        ds.Ordenacao.heapsort(itemArray0, 0);
        ds.Ordenacao.insercao(itemArray0, 0);
        ds.Ordenacao.shellsort(itemArray0, (-1));
        ds.Ordenacao.selecao(itemArray0, (-1));
        ds.Ordenacao.heapsort(itemArray0, 0);
        ds.Ordenacao.heapsort(itemArray0, (int) (byte) -1);
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
    public void test1658() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1658");
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
        // The following exception was thrown during execution in test generation
        try {
            ds.Ordenacao.heapsort(itemArray0, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray0);
    }

    @Test
    public void test1659() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1659");
        ds.Item[] itemArray0 = new ds.Item[] {};
        ds.Ordenacao.heapsort(itemArray0, 0);
        ds.Ordenacao.insercao(itemArray0, 0);
        ds.Ordenacao.shellsort(itemArray0, (-1));
        ds.Ordenacao.insercao(itemArray0, (int) (byte) 1);
        ds.Ordenacao.insercao(itemArray0, 1);
        ds.Ordenacao.shellsort(itemArray0, (int) (byte) 0);
        ds.Ordenacao.selecao(itemArray0, 0);
        org.junit.Assert.assertNotNull(itemArray0);
    }

    @Test
    public void test1660() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1660");
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
        ds.Ordenacao.heapsort(itemArray0, (int) (byte) -1);
        org.junit.Assert.assertNotNull(itemArray0);
    }

    @Test
    public void test1661() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1661");
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
    public void test1662() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1662");
        ds.Item[] itemArray0 = new ds.Item[] {};
        ds.Ordenacao.heapsort(itemArray0, 0);
        ds.Ordenacao.insercao(itemArray0, 0);
        ds.Ordenacao.insercao(itemArray0, (int) (short) 0);
        ds.Ordenacao.selecao(itemArray0, 1);
        ds.Ordenacao.selecao(itemArray0, (int) (short) -1);
        ds.Ordenacao.insercao(itemArray0, 0);
        ds.Ordenacao.heapsort(itemArray0, (int) (short) -1);
        ds.Ordenacao.heapsort(itemArray0, (int) (byte) -1);
        ds.Ordenacao.selecao(itemArray0, 0);
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
    public void test1663() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1663");
        ds.Item[] itemArray0 = new ds.Item[] {};
        ds.Ordenacao.heapsort(itemArray0, 0);
        ds.Ordenacao.insercao(itemArray0, 0);
        ds.Ordenacao.selecao(itemArray0, 0);
        ds.Ordenacao.insercao(itemArray0, (-1));
        ds.Ordenacao.heapsort(itemArray0, (-1));
        ds.Ordenacao.insercao(itemArray0, (int) (short) -1);
        ds.Ordenacao.shellsort(itemArray0, 1);
        ds.Ordenacao.shellsort(itemArray0, 1);
        // The following exception was thrown during execution in test generation
        try {
            ds.Ordenacao.insercao(itemArray0, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 2");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray0);
    }

    @Test
    public void test1664() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1664");
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
            ds.Ordenacao.selecao(itemArray0, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 2");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray0);
    }

    @Test
    public void test1665() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1665");
        ds.Item[] itemArray0 = new ds.Item[] {};
        ds.Ordenacao.heapsort(itemArray0, 0);
        ds.Ordenacao.insercao(itemArray0, 0);
        ds.Ordenacao.shellsort(itemArray0, (-1));
        ds.Ordenacao.selecao(itemArray0, (-1));
        ds.Ordenacao.heapsort(itemArray0, (int) (short) 0);
        ds.Ordenacao.selecao(itemArray0, 1);
        ds.Ordenacao.shellsort(itemArray0, 1);
        org.junit.Assert.assertNotNull(itemArray0);
    }

    @Test
    public void test1666() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1666");
        ds.Item[] itemArray0 = new ds.Item[] {};
        ds.Ordenacao.heapsort(itemArray0, 0);
        ds.Ordenacao.insercao(itemArray0, 0);
        ds.Ordenacao.selecao(itemArray0, 0);
        ds.Ordenacao.insercao(itemArray0, (-1));
        ds.Ordenacao.heapsort(itemArray0, (-1));
        ds.Ordenacao.heapsort(itemArray0, 1);
        ds.Ordenacao.selecao(itemArray0, (-1));
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
    public void test1667() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1667");
        ds.Item item0 = null;
        ds.Item[] itemArray1 = new ds.Item[] { item0 };
        ds.Ordenacao.heapsort(itemArray1, 0);
        ds.Ordenacao.shellsort(itemArray1, (int) (byte) 0);
        ds.Ordenacao.shellsort(itemArray1, (int) (short) 1);
        ds.Ordenacao.selecao(itemArray1, (int) (short) -1);
        ds.Ordenacao.heapsort(itemArray1, 0);
        // The following exception was thrown during execution in test generation
        try {
            ds.Ordenacao.quicksort(itemArray1, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray1);
    }

    @Test
    public void test1668() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1668");
        ds.Item[] itemArray0 = new ds.Item[] {};
        ds.Ordenacao.heapsort(itemArray0, 0);
        ds.Ordenacao.insercao(itemArray0, 0);
        ds.Ordenacao.selecao(itemArray0, 0);
        ds.Ordenacao.insercao(itemArray0, (-1));
        ds.Ordenacao.heapsort(itemArray0, (-1));
        ds.Ordenacao.selecao(itemArray0, 1);
        ds.Ordenacao.heapsort(itemArray0, (int) (byte) -1);
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
    public void test1669() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1669");
        ds.Item[] itemArray0 = new ds.Item[] {};
        ds.Ordenacao.heapsort(itemArray0, 0);
        ds.Ordenacao.insercao(itemArray0, 0);
        ds.Ordenacao.selecao(itemArray0, 0);
        ds.Ordenacao.selecao(itemArray0, (int) (byte) -1);
        ds.Ordenacao.heapsort(itemArray0, (int) (short) -1);
        ds.Ordenacao.selecao(itemArray0, 0);
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
    public void test1670() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1670");
        ds.Item[] itemArray0 = new ds.Item[] {};
        ds.Ordenacao.heapsort(itemArray0, 0);
        ds.Ordenacao.insercao(itemArray0, 0);
        ds.Ordenacao.selecao(itemArray0, 0);
        ds.Ordenacao.insercao(itemArray0, (-1));
        ds.Ordenacao.heapsort(itemArray0, (-1));
        ds.Ordenacao.selecao(itemArray0, 1);
        ds.Ordenacao.insercao(itemArray0, 1);
        ds.Ordenacao.insercao(itemArray0, (int) (short) -1);
        ds.Ordenacao.insercao(itemArray0, (int) (short) -1);
        org.junit.Assert.assertNotNull(itemArray0);
    }

    @Test
    public void test1671() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1671");
        ds.Item[] itemArray0 = new ds.Item[] {};
        ds.Ordenacao.shellsort(itemArray0, 0);
        // The following exception was thrown during execution in test generation
        try {
            ds.Ordenacao.heapsort(itemArray0, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray0);
    }

    @Test
    public void test1672() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1672");
        ds.Item[] itemArray0 = new ds.Item[] {};
        ds.Ordenacao.heapsort(itemArray0, 0);
        ds.Ordenacao.insercao(itemArray0, 0);
        ds.Ordenacao.shellsort(itemArray0, (-1));
        ds.Ordenacao.selecao(itemArray0, 0);
        ds.Ordenacao.shellsort(itemArray0, (int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            ds.Ordenacao.insercao(itemArray0, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 2");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray0);
    }

    @Test
    public void test1673() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1673");
        ds.Item[] itemArray0 = new ds.Item[] {};
        ds.Ordenacao.heapsort(itemArray0, 0);
        ds.Ordenacao.heapsort(itemArray0, 0);
        ds.Ordenacao.shellsort(itemArray0, (int) (byte) 1);
        ds.Ordenacao.shellsort(itemArray0, (int) (short) -1);
        org.junit.Assert.assertNotNull(itemArray0);
    }

    @Test
    public void test1674() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1674");
        ds.Item[] itemArray0 = new ds.Item[] {};
        ds.Ordenacao.heapsort(itemArray0, 0);
        ds.Ordenacao.insercao(itemArray0, 0);
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
    public void test1675() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1675");
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
    public void test1676() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1676");
        ds.Item item0 = null;
        ds.Item[] itemArray1 = new ds.Item[] { item0 };
        ds.Ordenacao.heapsort(itemArray1, 0);
        ds.Ordenacao.insercao(itemArray1, (int) (short) -1);
        ds.Ordenacao.insercao(itemArray1, (int) (byte) -1);
        ds.Ordenacao.insercao(itemArray1, 1);
        org.junit.Assert.assertNotNull(itemArray1);
    }

    @Test
    public void test1677() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1677");
        ds.Item[] itemArray0 = new ds.Item[] {};
        ds.Ordenacao.heapsort(itemArray0, 0);
        ds.Ordenacao.insercao(itemArray0, 0);
        ds.Ordenacao.selecao(itemArray0, 0);
        ds.Ordenacao.shellsort(itemArray0, (int) (byte) 1);
        ds.Ordenacao.selecao(itemArray0, 0);
        ds.Ordenacao.selecao(itemArray0, (int) (byte) -1);
        ds.Ordenacao.heapsort(itemArray0, (int) (short) 1);
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
    public void test1678() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1678");
        ds.Item[] itemArray0 = new ds.Item[] {};
        ds.Ordenacao.shellsort(itemArray0, 0);
        ds.Ordenacao.shellsort(itemArray0, (int) (byte) -1);
        ds.Ordenacao.selecao(itemArray0, (-1));
        ds.Ordenacao.shellsort(itemArray0, (int) (byte) 1);
        ds.Ordenacao.heapsort(itemArray0, (int) (byte) -1);
        org.junit.Assert.assertNotNull(itemArray0);
    }

    @Test
    public void test1679() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1679");
        ds.Item[] itemArray0 = new ds.Item[] {};
        ds.Ordenacao.heapsort(itemArray0, 0);
        ds.Ordenacao.insercao(itemArray0, 0);
        ds.Ordenacao.shellsort(itemArray0, (-1));
        ds.Ordenacao.selecao(itemArray0, (-1));
        ds.Ordenacao.heapsort(itemArray0, (int) (short) 0);
        ds.Ordenacao.shellsort(itemArray0, (int) (short) 0);
        ds.Ordenacao.selecao(itemArray0, (int) (short) 1);
        ds.Ordenacao.heapsort(itemArray0, 0);
        // The following exception was thrown during execution in test generation
        try {
            ds.Ordenacao.insercao(itemArray0, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 2");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray0);
    }

    @Test
    public void test1680() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1680");
        ds.Item[] itemArray0 = new ds.Item[] {};
        ds.Ordenacao.heapsort(itemArray0, 0);
        ds.Ordenacao.insercao(itemArray0, 0);
        ds.Ordenacao.selecao(itemArray0, 0);
        ds.Ordenacao.shellsort(itemArray0, (int) (byte) 1);
        ds.Ordenacao.insercao(itemArray0, 0);
        ds.Ordenacao.shellsort(itemArray0, (int) (short) 0);
        ds.Ordenacao.insercao(itemArray0, (int) (short) 0);
        ds.Ordenacao.heapsort(itemArray0, 1);
        // The following exception was thrown during execution in test generation
        try {
            ds.Ordenacao.insercao(itemArray0, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 2");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray0);
    }

    @Test
    public void test1681() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1681");
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
        java.lang.Class<?> wildcardClass21 = itemArray0.getClass();
        org.junit.Assert.assertNotNull(itemArray0);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test1682() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1682");
        ds.Item[] itemArray0 = new ds.Item[] {};
        ds.Ordenacao.heapsort(itemArray0, 0);
        ds.Ordenacao.heapsort(itemArray0, (-1));
        ds.Ordenacao.insercao(itemArray0, 0);
        ds.Ordenacao.selecao(itemArray0, 0);
        // The following exception was thrown during execution in test generation
        try {
            ds.Ordenacao.heapsort(itemArray0, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray0);
    }

    @Test
    public void test1683() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1683");
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
            ds.Ordenacao.insercao(itemArray0, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 2");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray0);
    }

    @Test
    public void test1684() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1684");
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
            ds.Ordenacao.quicksort(itemArray0, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 0");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray0);
    }

    @Test
    public void test1685() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1685");
        ds.Item[] itemArray0 = new ds.Item[] {};
        ds.Ordenacao.heapsort(itemArray0, 0);
        ds.Ordenacao.insercao(itemArray0, 0);
        ds.Ordenacao.shellsort(itemArray0, (-1));
        ds.Ordenacao.insercao(itemArray0, (int) (byte) 1);
        ds.Ordenacao.insercao(itemArray0, (int) (byte) 0);
        ds.Ordenacao.selecao(itemArray0, (int) (short) -1);
        ds.Ordenacao.selecao(itemArray0, (int) (short) -1);
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
    public void test1686() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1686");
        ds.Item[] itemArray0 = new ds.Item[] {};
        ds.Ordenacao.shellsort(itemArray0, (int) (short) 1);
        ds.Ordenacao.selecao(itemArray0, 1);
        ds.Ordenacao.selecao(itemArray0, (int) (byte) 1);
        ds.Ordenacao.insercao(itemArray0, (int) (byte) 0);
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
    public void test1687() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1687");
        ds.Item[] itemArray0 = new ds.Item[] {};
        ds.Ordenacao.heapsort(itemArray0, 0);
        ds.Ordenacao.insercao(itemArray0, 0);
        ds.Ordenacao.selecao(itemArray0, 0);
        ds.Ordenacao.shellsort(itemArray0, (int) (byte) 1);
        ds.Ordenacao.shellsort(itemArray0, (int) (byte) 1);
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
    public void test1688() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1688");
        ds.Item[] itemArray0 = new ds.Item[] {};
        ds.Ordenacao.heapsort(itemArray0, 0);
        ds.Ordenacao.insercao(itemArray0, 0);
        ds.Ordenacao.insercao(itemArray0, (int) (short) 0);
        ds.Ordenacao.selecao(itemArray0, 1);
        ds.Ordenacao.selecao(itemArray0, 0);
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
    public void test1689() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1689");
        ds.Item[] itemArray0 = new ds.Item[] {};
        ds.Ordenacao.heapsort(itemArray0, 0);
        ds.Ordenacao.insercao(itemArray0, 0);
        ds.Ordenacao.shellsort(itemArray0, (-1));
        ds.Ordenacao.selecao(itemArray0, (int) (short) -1);
        ds.Ordenacao.insercao(itemArray0, 1);
        ds.Ordenacao.shellsort(itemArray0, 0);
        java.lang.Class<?> wildcardClass13 = itemArray0.getClass();
        org.junit.Assert.assertNotNull(itemArray0);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test1690() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1690");
        ds.Item[] itemArray0 = null;
        // The following exception was thrown during execution in test generation
        try {
            ds.Ordenacao.insercao(itemArray0, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1691() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1691");
        ds.Item[] itemArray0 = new ds.Item[] {};
        ds.Ordenacao.heapsort(itemArray0, 0);
        ds.Ordenacao.insercao(itemArray0, 0);
        ds.Ordenacao.insercao(itemArray0, (int) (short) 0);
        ds.Ordenacao.selecao(itemArray0, 1);
        ds.Ordenacao.shellsort(itemArray0, (int) (short) 1);
        ds.Ordenacao.heapsort(itemArray0, 0);
        ds.Ordenacao.shellsort(itemArray0, (int) (short) 1);
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
    public void test1692() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1692");
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
    public void test1693() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1693");
        ds.Item[] itemArray0 = new ds.Item[] {};
        ds.Ordenacao.heapsort(itemArray0, 0);
        ds.Ordenacao.insercao(itemArray0, 0);
        ds.Ordenacao.insercao(itemArray0, (int) (short) 0);
        ds.Ordenacao.selecao(itemArray0, 1);
        ds.Ordenacao.shellsort(itemArray0, (int) (short) 1);
        ds.Ordenacao.insercao(itemArray0, (int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            ds.Ordenacao.insercao(itemArray0, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 2");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray0);
    }

    @Test
    public void test1694() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1694");
        ds.Item[] itemArray0 = new ds.Item[] {};
        ds.Ordenacao.heapsort(itemArray0, 0);
        ds.Ordenacao.insercao(itemArray0, 0);
        ds.Ordenacao.shellsort(itemArray0, (-1));
        ds.Ordenacao.selecao(itemArray0, (-1));
        ds.Ordenacao.heapsort(itemArray0, (int) (short) 0);
        ds.Ordenacao.shellsort(itemArray0, (int) (short) 0);
        ds.Ordenacao.selecao(itemArray0, (int) (short) 1);
        java.lang.Class<?> wildcardClass15 = itemArray0.getClass();
        org.junit.Assert.assertNotNull(itemArray0);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test1695() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1695");
        ds.Item[] itemArray0 = new ds.Item[] {};
        ds.Ordenacao.heapsort(itemArray0, 0);
        ds.Ordenacao.insercao(itemArray0, 0);
        ds.Ordenacao.selecao(itemArray0, 0);
        ds.Ordenacao.shellsort(itemArray0, (int) (byte) 1);
        ds.Ordenacao.insercao(itemArray0, 0);
        ds.Ordenacao.insercao(itemArray0, (int) (byte) 1);
        java.lang.Class<?> wildcardClass13 = itemArray0.getClass();
        org.junit.Assert.assertNotNull(itemArray0);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test1696() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1696");
        ds.Item[] itemArray0 = new ds.Item[] {};
        ds.Ordenacao.heapsort(itemArray0, 0);
        ds.Ordenacao.heapsort(itemArray0, 0);
        ds.Ordenacao.shellsort(itemArray0, (int) (byte) 0);
        ds.Ordenacao.heapsort(itemArray0, (int) (short) -1);
        // The following exception was thrown during execution in test generation
        try {
            ds.Ordenacao.insercao(itemArray0, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 2");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray0);
    }

    @Test
    public void test1697() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1697");
        ds.Item[] itemArray0 = new ds.Item[] {};
        ds.Ordenacao.shellsort(itemArray0, (int) (short) 1);
        ds.Ordenacao.heapsort(itemArray0, 1);
        ds.Ordenacao.heapsort(itemArray0, (int) (byte) 1);
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
    public void test1698() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1698");
        ds.Item[] itemArray0 = new ds.Item[] {};
        ds.Ordenacao.heapsort(itemArray0, 0);
        ds.Ordenacao.insercao(itemArray0, 0);
        ds.Ordenacao.selecao(itemArray0, 0);
        ds.Ordenacao.shellsort(itemArray0, (int) (byte) 1);
        ds.Ordenacao.selecao(itemArray0, 0);
        ds.Ordenacao.selecao(itemArray0, 1);
        ds.Ordenacao.heapsort(itemArray0, (int) (short) 0);
        org.junit.Assert.assertNotNull(itemArray0);
    }

    @Test
    public void test1699() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1699");
        ds.Item[] itemArray0 = new ds.Item[] {};
        ds.Ordenacao.heapsort(itemArray0, 0);
        ds.Ordenacao.insercao(itemArray0, 0);
        ds.Ordenacao.shellsort(itemArray0, (-1));
        ds.Ordenacao.insercao(itemArray0, (int) (byte) 1);
        ds.Ordenacao.selecao(itemArray0, 0);
        ds.Ordenacao.insercao(itemArray0, 0);
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
    public void test1700() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1700");
        ds.Item[] itemArray0 = new ds.Item[] {};
        ds.Ordenacao.heapsort(itemArray0, 0);
        ds.Ordenacao.insercao(itemArray0, 0);
        ds.Ordenacao.selecao(itemArray0, 0);
        ds.Ordenacao.insercao(itemArray0, (-1));
        ds.Ordenacao.heapsort(itemArray0, (-1));
        ds.Ordenacao.selecao(itemArray0, 1);
        ds.Ordenacao.heapsort(itemArray0, (int) (byte) -1);
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
    public void test1701() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1701");
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
        ds.Ordenacao.insercao(itemArray0, (int) (short) -1);
        ds.Ordenacao.shellsort(itemArray0, (int) (short) -1);
        java.lang.Class<?> wildcardClass23 = itemArray0.getClass();
        org.junit.Assert.assertNotNull(itemArray0);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test1702() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1702");
        ds.Item[] itemArray0 = new ds.Item[] {};
        ds.Ordenacao.heapsort(itemArray0, 0);
        ds.Ordenacao.insercao(itemArray0, 0);
        ds.Ordenacao.shellsort(itemArray0, (-1));
        ds.Ordenacao.selecao(itemArray0, (-1));
        ds.Ordenacao.shellsort(itemArray0, (int) (byte) 0);
        ds.Ordenacao.insercao(itemArray0, (int) (short) -1);
        ds.Ordenacao.insercao(itemArray0, (int) (byte) -1);
        ds.Ordenacao.insercao(itemArray0, 0);
        org.junit.Assert.assertNotNull(itemArray0);
    }

    @Test
    public void test1703() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1703");
        ds.Item[] itemArray0 = new ds.Item[] {};
        ds.Ordenacao.heapsort(itemArray0, 0);
        ds.Ordenacao.insercao(itemArray0, 0);
        ds.Ordenacao.shellsort(itemArray0, (-1));
        ds.Ordenacao.insercao(itemArray0, (int) (byte) 1);
        ds.Ordenacao.selecao(itemArray0, 1);
        ds.Ordenacao.shellsort(itemArray0, (int) (short) 1);
        ds.Ordenacao.heapsort(itemArray0, (int) (short) -1);
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
    public void test1704() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1704");
        ds.Item item0 = null;
        ds.Item[] itemArray1 = new ds.Item[] { item0 };
        ds.Ordenacao.heapsort(itemArray1, 0);
        ds.Ordenacao.shellsort(itemArray1, (int) (byte) 0);
        ds.Ordenacao.shellsort(itemArray1, (int) (short) 0);
        ds.Ordenacao.insercao(itemArray1, 0);
        // The following exception was thrown during execution in test generation
        try {
            ds.Ordenacao.shellsort(itemArray1, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 14");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray1);
    }

    @Test
    public void test1705() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1705");
        ds.Item[] itemArray0 = new ds.Item[] {};
        ds.Ordenacao.heapsort(itemArray0, 0);
        ds.Ordenacao.insercao(itemArray0, 0);
        ds.Ordenacao.insercao(itemArray0, (int) (short) 0);
        ds.Ordenacao.selecao(itemArray0, 1);
        ds.Ordenacao.shellsort(itemArray0, (int) (short) 1);
        ds.Ordenacao.insercao(itemArray0, (int) (short) 1);
        ds.Ordenacao.heapsort(itemArray0, (int) (short) 0);
        ds.Ordenacao.heapsort(itemArray0, (int) (short) -1);
        org.junit.Assert.assertNotNull(itemArray0);
    }

    @Test
    public void test1706() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1706");
        ds.Item[] itemArray0 = new ds.Item[] {};
        ds.Ordenacao.heapsort(itemArray0, 0);
        ds.Ordenacao.insercao(itemArray0, 0);
        ds.Ordenacao.insercao(itemArray0, (int) (short) 0);
        ds.Ordenacao.selecao(itemArray0, 1);
        ds.Ordenacao.selecao(itemArray0, 0);
        ds.Ordenacao.selecao(itemArray0, 0);
        ds.Ordenacao.insercao(itemArray0, (int) (short) 0);
        org.junit.Assert.assertNotNull(itemArray0);
    }

    @Test
    public void test1707() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1707");
        ds.Item[] itemArray0 = new ds.Item[] {};
        ds.Ordenacao.heapsort(itemArray0, 0);
        ds.Ordenacao.heapsort(itemArray0, (-1));
        ds.Ordenacao.selecao(itemArray0, 1);
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
    public void test1708() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1708");
        ds.Item[] itemArray0 = new ds.Item[] {};
        ds.Ordenacao.heapsort(itemArray0, 0);
        ds.Ordenacao.insercao(itemArray0, 0);
        ds.Ordenacao.selecao(itemArray0, 0);
        ds.Ordenacao.insercao(itemArray0, (-1));
        ds.Ordenacao.heapsort(itemArray0, (-1));
        ds.Ordenacao.insercao(itemArray0, (int) (short) -1);
        ds.Ordenacao.shellsort(itemArray0, 1);
        ds.Ordenacao.shellsort(itemArray0, 1);
        ds.Ordenacao.shellsort(itemArray0, (int) (byte) 1);
        org.junit.Assert.assertNotNull(itemArray0);
    }

    @Test
    public void test1709() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1709");
        ds.Item[] itemArray0 = new ds.Item[] {};
        ds.Ordenacao.heapsort(itemArray0, 0);
        ds.Ordenacao.insercao(itemArray0, 0);
        ds.Ordenacao.shellsort(itemArray0, (-1));
        ds.Ordenacao.insercao(itemArray0, (int) (byte) 1);
        ds.Ordenacao.selecao(itemArray0, 0);
        ds.Ordenacao.shellsort(itemArray0, 1);
        ds.Ordenacao.selecao(itemArray0, (int) (byte) -1);
        ds.Ordenacao.shellsort(itemArray0, (int) (short) -1);
        org.junit.Assert.assertNotNull(itemArray0);
    }

    @Test
    public void test1710() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1710");
        ds.Item[] itemArray0 = new ds.Item[] {};
        ds.Ordenacao.heapsort(itemArray0, 0);
        ds.Ordenacao.insercao(itemArray0, 0);
        ds.Ordenacao.insercao(itemArray0, (int) (short) 0);
        ds.Ordenacao.selecao(itemArray0, 1);
        ds.Ordenacao.shellsort(itemArray0, (int) (short) 1);
        ds.Ordenacao.insercao(itemArray0, (int) (short) 1);
        ds.Ordenacao.selecao(itemArray0, 0);
        ds.Ordenacao.heapsort(itemArray0, (int) (short) 1);
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
    public void test1711() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1711");
        ds.Item[] itemArray0 = new ds.Item[] {};
        ds.Ordenacao.heapsort(itemArray0, 0);
        ds.Ordenacao.insercao(itemArray0, 0);
        ds.Ordenacao.insercao(itemArray0, (int) (short) 0);
        ds.Ordenacao.selecao(itemArray0, 1);
        ds.Ordenacao.shellsort(itemArray0, (int) (short) 1);
        ds.Ordenacao.shellsort(itemArray0, 0);
        ds.Ordenacao.shellsort(itemArray0, (-1));
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
    public void test1712() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1712");
        ds.Item item0 = null;
        ds.Item[] itemArray1 = new ds.Item[] { item0 };
        ds.Ordenacao.heapsort(itemArray1, 0);
        ds.Ordenacao.shellsort(itemArray1, (int) (byte) 0);
        ds.Ordenacao.shellsort(itemArray1, (int) (short) 1);
        ds.Ordenacao.selecao(itemArray1, (int) (short) -1);
        ds.Ordenacao.heapsort(itemArray1, (int) (short) 0);
        java.lang.Class<?> wildcardClass12 = itemArray1.getClass();
        org.junit.Assert.assertNotNull(itemArray1);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test1713() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1713");
        ds.Item item0 = null;
        ds.Item[] itemArray1 = new ds.Item[] { item0 };
        ds.Ordenacao.heapsort(itemArray1, 0);
        ds.Ordenacao.shellsort(itemArray1, (int) (byte) 0);
        ds.Ordenacao.heapsort(itemArray1, (int) (byte) 1);
        ds.Ordenacao.selecao(itemArray1, (int) (short) 1);
        ds.Ordenacao.insercao(itemArray1, 0);
        org.junit.Assert.assertNotNull(itemArray1);
    }

    @Test
    public void test1714() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1714");
        ds.Item[] itemArray0 = new ds.Item[] {};
        ds.Ordenacao.heapsort(itemArray0, 0);
        ds.Ordenacao.insercao(itemArray0, 0);
        ds.Ordenacao.insercao(itemArray0, (int) (short) 0);
        ds.Ordenacao.selecao(itemArray0, 1);
        ds.Ordenacao.shellsort(itemArray0, (int) (byte) -1);
        ds.Ordenacao.heapsort(itemArray0, (int) (byte) -1);
        ds.Ordenacao.heapsort(itemArray0, (int) (short) 0);
        ds.Ordenacao.heapsort(itemArray0, (int) (short) 0);
        java.lang.Class<?> wildcardClass17 = itemArray0.getClass();
        org.junit.Assert.assertNotNull(itemArray0);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test1715() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1715");
        ds.Item[] itemArray0 = new ds.Item[] {};
        ds.Ordenacao.heapsort(itemArray0, 0);
        ds.Ordenacao.insercao(itemArray0, 0);
        ds.Ordenacao.insercao(itemArray0, (int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            ds.Ordenacao.heapsort(itemArray0, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray0);
    }

    @Test
    public void test1716() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1716");
        ds.Item[] itemArray0 = new ds.Item[] {};
        ds.Ordenacao.heapsort(itemArray0, 0);
        ds.Ordenacao.insercao(itemArray0, 0);
        ds.Ordenacao.shellsort(itemArray0, (-1));
        ds.Ordenacao.selecao(itemArray0, (-1));
        ds.Ordenacao.heapsort(itemArray0, (int) (short) 0);
        ds.Ordenacao.selecao(itemArray0, 1);
        ds.Ordenacao.heapsort(itemArray0, (int) (short) 1);
        java.lang.Class<?> wildcardClass15 = itemArray0.getClass();
        org.junit.Assert.assertNotNull(itemArray0);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test1717() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1717");
        ds.Item[] itemArray0 = new ds.Item[] {};
        ds.Ordenacao.heapsort(itemArray0, 0);
        ds.Ordenacao.insercao(itemArray0, 0);
        ds.Ordenacao.shellsort(itemArray0, (-1));
        ds.Ordenacao.insercao(itemArray0, (int) (byte) 1);
        ds.Ordenacao.insercao(itemArray0, (int) (byte) 1);
        ds.Ordenacao.shellsort(itemArray0, 0);
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
    public void test1718() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1718");
        ds.Item[] itemArray0 = new ds.Item[] {};
        ds.Ordenacao.heapsort(itemArray0, 0);
        ds.Ordenacao.insercao(itemArray0, 0);
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
    public void test1719() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1719");
        ds.Item[] itemArray0 = new ds.Item[] {};
        ds.Ordenacao.heapsort(itemArray0, 0);
        ds.Ordenacao.insercao(itemArray0, 0);
        ds.Ordenacao.selecao(itemArray0, 0);
        ds.Ordenacao.shellsort(itemArray0, (int) (byte) 1);
        ds.Ordenacao.insercao(itemArray0, 0);
        ds.Ordenacao.shellsort(itemArray0, (int) (short) 1);
        ds.Ordenacao.shellsort(itemArray0, (int) (byte) -1);
        ds.Ordenacao.selecao(itemArray0, (int) (short) 0);
        org.junit.Assert.assertNotNull(itemArray0);
    }

    @Test
    public void test1720() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1720");
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
    public void test1721() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1721");
        ds.Item[] itemArray0 = new ds.Item[] {};
        ds.Ordenacao.heapsort(itemArray0, 0);
        ds.Ordenacao.insercao(itemArray0, 0);
        ds.Ordenacao.selecao(itemArray0, 0);
        ds.Ordenacao.shellsort(itemArray0, (int) (byte) 1);
        ds.Ordenacao.insercao(itemArray0, 0);
        ds.Ordenacao.insercao(itemArray0, (int) (short) -1);
        ds.Ordenacao.insercao(itemArray0, 0);
        ds.Ordenacao.heapsort(itemArray0, 1);
        org.junit.Assert.assertNotNull(itemArray0);
    }

    @Test
    public void test1722() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1722");
        ds.Item item0 = null;
        ds.Item[] itemArray1 = new ds.Item[] { item0 };
        ds.Ordenacao.heapsort(itemArray1, 0);
        ds.Ordenacao.heapsort(itemArray1, 1);
        ds.Ordenacao.heapsort(itemArray1, 1);
        ds.Ordenacao.shellsort(itemArray1, (-1));
        ds.Ordenacao.selecao(itemArray1, (int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            ds.Ordenacao.selecao(itemArray1, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 2");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray1);
    }

    @Test
    public void test1723() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1723");
        ds.Item[] itemArray0 = new ds.Item[] {};
        ds.Ordenacao.heapsort(itemArray0, 0);
        ds.Ordenacao.insercao(itemArray0, 0);
        ds.Ordenacao.insercao(itemArray0, (int) (short) 0);
        ds.Ordenacao.selecao(itemArray0, 1);
        ds.Ordenacao.shellsort(itemArray0, (int) (short) 1);
        ds.Ordenacao.shellsort(itemArray0, 0);
        ds.Ordenacao.shellsort(itemArray0, (-1));
        ds.Ordenacao.selecao(itemArray0, 0);
        ds.Ordenacao.selecao(itemArray0, (int) (byte) 1);
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
    public void test1724() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1724");
        ds.Item[] itemArray0 = new ds.Item[] {};
        ds.Ordenacao.heapsort(itemArray0, 0);
        ds.Ordenacao.insercao(itemArray0, 0);
        ds.Ordenacao.insercao(itemArray0, (int) (byte) 0);
        ds.Ordenacao.selecao(itemArray0, (int) (byte) 0);
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
    public void test1725() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1725");
        ds.Item[] itemArray0 = new ds.Item[] {};
        ds.Ordenacao.heapsort(itemArray0, 0);
        ds.Ordenacao.insercao(itemArray0, 0);
        ds.Ordenacao.selecao(itemArray0, 0);
        ds.Ordenacao.insercao(itemArray0, (-1));
        ds.Ordenacao.heapsort(itemArray0, (-1));
        ds.Ordenacao.selecao(itemArray0, 1);
        // The following exception was thrown during execution in test generation
        try {
            ds.Ordenacao.insercao(itemArray0, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 2");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray0);
    }

    @Test
    public void test1726() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1726");
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
        ds.Ordenacao.insercao(itemArray0, (int) (short) 1);
        java.lang.Class<?> wildcardClass21 = itemArray0.getClass();
        org.junit.Assert.assertNotNull(itemArray0);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test1727() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1727");
        ds.Item[] itemArray0 = new ds.Item[] {};
        ds.Ordenacao.heapsort(itemArray0, 0);
        ds.Ordenacao.insercao(itemArray0, 0);
        ds.Ordenacao.selecao(itemArray0, 0);
        ds.Ordenacao.shellsort(itemArray0, (int) (short) 1);
        ds.Ordenacao.selecao(itemArray0, (int) (short) 0);
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
    public void test1728() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1728");
        ds.Item[] itemArray0 = new ds.Item[] {};
        ds.Ordenacao.heapsort(itemArray0, 0);
        ds.Ordenacao.heapsort(itemArray0, (int) (byte) 0);
        ds.Ordenacao.shellsort(itemArray0, 0);
        ds.Ordenacao.heapsort(itemArray0, (int) (byte) -1);
        ds.Ordenacao.heapsort(itemArray0, (int) (byte) 1);
        ds.Ordenacao.heapsort(itemArray0, 0);
        ds.Ordenacao.heapsort(itemArray0, (-1));
        java.lang.Class<?> wildcardClass15 = itemArray0.getClass();
        org.junit.Assert.assertNotNull(itemArray0);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test1729() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1729");
        ds.Item[] itemArray0 = new ds.Item[] {};
        ds.Ordenacao.heapsort(itemArray0, 0);
        ds.Ordenacao.insercao(itemArray0, 0);
        ds.Ordenacao.shellsort(itemArray0, (-1));
        ds.Ordenacao.insercao(itemArray0, (int) (byte) 1);
        ds.Ordenacao.insercao(itemArray0, (int) (byte) 1);
        ds.Ordenacao.shellsort(itemArray0, 0);
        // The following exception was thrown during execution in test generation
        try {
            ds.Ordenacao.heapsort(itemArray0, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray0);
    }

    @Test
    public void test1730() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1730");
        ds.Item[] itemArray0 = new ds.Item[] {};
        ds.Ordenacao.shellsort(itemArray0, (int) (short) 1);
        ds.Ordenacao.selecao(itemArray0, 1);
        ds.Ordenacao.insercao(itemArray0, (int) (byte) 0);
        ds.Ordenacao.insercao(itemArray0, (int) (short) 1);
        ds.Ordenacao.heapsort(itemArray0, (-1));
        ds.Ordenacao.selecao(itemArray0, (int) (byte) -1);
        java.lang.Class<?> wildcardClass13 = itemArray0.getClass();
        org.junit.Assert.assertNotNull(itemArray0);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test1731() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1731");
        ds.Item[] itemArray0 = new ds.Item[] {};
        ds.Ordenacao.heapsort(itemArray0, 0);
        ds.Ordenacao.insercao(itemArray0, 0);
        ds.Ordenacao.insercao(itemArray0, (int) (short) 0);
        ds.Ordenacao.selecao(itemArray0, 1);
        ds.Ordenacao.selecao(itemArray0, 0);
        ds.Ordenacao.selecao(itemArray0, 0);
        ds.Ordenacao.selecao(itemArray0, (int) (byte) 1);
        ds.Ordenacao.heapsort(itemArray0, 0);
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
    public void test1732() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1732");
        ds.Item item0 = null;
        ds.Item[] itemArray1 = new ds.Item[] { item0 };
        ds.Ordenacao.heapsort(itemArray1, 0);
        ds.Ordenacao.shellsort(itemArray1, (int) (byte) 0);
        ds.Ordenacao.heapsort(itemArray1, (int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            ds.Ordenacao.selecao(itemArray1, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 2");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray1);
    }

    @Test
    public void test1733() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1733");
        ds.Item[] itemArray0 = new ds.Item[] {};
        ds.Ordenacao.heapsort(itemArray0, 0);
        ds.Ordenacao.heapsort(itemArray0, 0);
        ds.Ordenacao.heapsort(itemArray0, (int) (byte) 1);
        ds.Ordenacao.selecao(itemArray0, 0);
        // The following exception was thrown during execution in test generation
        try {
            ds.Ordenacao.heapsort(itemArray0, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray0);
    }

    @Test
    public void test1734() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1734");
        ds.Item[] itemArray0 = new ds.Item[] {};
        ds.Ordenacao.heapsort(itemArray0, 0);
        ds.Ordenacao.insercao(itemArray0, 0);
        ds.Ordenacao.shellsort(itemArray0, (-1));
        ds.Ordenacao.shellsort(itemArray0, (int) (byte) -1);
        ds.Ordenacao.selecao(itemArray0, (int) (byte) -1);
        ds.Ordenacao.heapsort(itemArray0, (int) (byte) -1);
        ds.Ordenacao.heapsort(itemArray0, (int) (byte) 1);
        ds.Ordenacao.selecao(itemArray0, (int) (byte) 1);
        ds.Ordenacao.shellsort(itemArray0, 1);
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
    public void test1735() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1735");
        ds.Item[] itemArray0 = new ds.Item[] {};
        ds.Ordenacao.shellsort(itemArray0, (int) (short) 1);
        ds.Ordenacao.selecao(itemArray0, 1);
        ds.Ordenacao.selecao(itemArray0, (int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            ds.Ordenacao.insercao(itemArray0, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 2");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray0);
    }

    @Test
    public void test1736() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1736");
        ds.Item[] itemArray0 = new ds.Item[] {};
        ds.Ordenacao.heapsort(itemArray0, 0);
        ds.Ordenacao.insercao(itemArray0, 0);
        ds.Ordenacao.shellsort(itemArray0, (-1));
        ds.Ordenacao.selecao(itemArray0, (-1));
        ds.Ordenacao.insercao(itemArray0, (int) (byte) 1);
        java.lang.Class<?> wildcardClass11 = itemArray0.getClass();
        org.junit.Assert.assertNotNull(itemArray0);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test1737() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1737");
        ds.Item[] itemArray0 = new ds.Item[] {};
        ds.Ordenacao.heapsort(itemArray0, 0);
        ds.Ordenacao.insercao(itemArray0, 0);
        ds.Ordenacao.insercao(itemArray0, (int) (short) 0);
        ds.Ordenacao.insercao(itemArray0, 1);
        ds.Ordenacao.insercao(itemArray0, (int) (byte) 0);
        ds.Ordenacao.selecao(itemArray0, (int) (byte) 0);
        org.junit.Assert.assertNotNull(itemArray0);
    }

    @Test
    public void test1738() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1738");
        ds.Item[] itemArray0 = new ds.Item[] {};
        ds.Ordenacao.heapsort(itemArray0, 0);
        ds.Ordenacao.insercao(itemArray0, 0);
        ds.Ordenacao.insercao(itemArray0, (int) (short) 0);
        ds.Ordenacao.selecao(itemArray0, 1);
        ds.Ordenacao.shellsort(itemArray0, (int) (byte) -1);
        ds.Ordenacao.heapsort(itemArray0, (int) (byte) -1);
        ds.Ordenacao.heapsort(itemArray0, (int) (short) 0);
        ds.Ordenacao.heapsort(itemArray0, (int) (short) 1);
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
    public void test1739() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1739");
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
        ds.Ordenacao.insercao(itemArray0, (int) (short) -1);
        ds.Ordenacao.shellsort(itemArray0, 0);
        org.junit.Assert.assertNotNull(itemArray0);
    }

    @Test
    public void test1740() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1740");
        ds.Item[] itemArray0 = new ds.Item[] {};
        ds.Ordenacao.heapsort(itemArray0, 0);
        ds.Ordenacao.insercao(itemArray0, 0);
        ds.Ordenacao.insercao(itemArray0, (int) (short) 0);
        ds.Ordenacao.selecao(itemArray0, 1);
        ds.Ordenacao.shellsort(itemArray0, (int) (short) 1);
        ds.Ordenacao.heapsort(itemArray0, 0);
        ds.Ordenacao.shellsort(itemArray0, (int) (short) 1);
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
    public void test1741() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1741");
        ds.Item[] itemArray0 = new ds.Item[] {};
        ds.Ordenacao.heapsort(itemArray0, 0);
        ds.Ordenacao.insercao(itemArray0, 0);
        ds.Ordenacao.insercao(itemArray0, (int) (short) 0);
        ds.Ordenacao.selecao(itemArray0, 1);
        ds.Ordenacao.shellsort(itemArray0, (int) (byte) -1);
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
    public void test1742() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1742");
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
        java.lang.Class<?> wildcardClass23 = itemArray0.getClass();
        org.junit.Assert.assertNotNull(itemArray0);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test1743() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1743");
        ds.Item[] itemArray0 = new ds.Item[] {};
        ds.Ordenacao.heapsort(itemArray0, 0);
        ds.Ordenacao.insercao(itemArray0, 0);
        ds.Ordenacao.insercao(itemArray0, (int) (short) 0);
        ds.Ordenacao.selecao(itemArray0, 1);
        ds.Ordenacao.selecao(itemArray0, 0);
        ds.Ordenacao.selecao(itemArray0, 0);
        // The following exception was thrown during execution in test generation
        try {
            ds.Ordenacao.heapsort(itemArray0, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray0);
    }

    @Test
    public void test1744() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1744");
        ds.Item item0 = null;
        ds.Item[] itemArray1 = new ds.Item[] { item0 };
        ds.Ordenacao.heapsort(itemArray1, 0);
        ds.Ordenacao.shellsort(itemArray1, (int) (byte) 0);
        ds.Ordenacao.shellsort(itemArray1, (int) (short) 1);
        ds.Ordenacao.heapsort(itemArray1, (-1));
        ds.Ordenacao.heapsort(itemArray1, (int) (short) 1);
        org.junit.Assert.assertNotNull(itemArray1);
    }

    @Test
    public void test1745() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1745");
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
    public void test1746() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1746");
        ds.Item[] itemArray0 = new ds.Item[] {};
        ds.Ordenacao.heapsort(itemArray0, 0);
        ds.Ordenacao.insercao(itemArray0, 0);
        ds.Ordenacao.insercao(itemArray0, (int) (short) 0);
        ds.Ordenacao.selecao(itemArray0, 1);
        ds.Ordenacao.selecao(itemArray0, (int) (short) -1);
        ds.Ordenacao.insercao(itemArray0, 0);
        ds.Ordenacao.heapsort(itemArray0, (int) (byte) 1);
        ds.Ordenacao.shellsort(itemArray0, 0);
        ds.Ordenacao.heapsort(itemArray0, 1);
        // The following exception was thrown during execution in test generation
        try {
            ds.Ordenacao.insercao(itemArray0, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 2");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray0);
    }

    @Test
    public void test1747() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1747");
        ds.Item[] itemArray0 = new ds.Item[] {};
        ds.Ordenacao.heapsort(itemArray0, 0);
        ds.Ordenacao.insercao(itemArray0, 0);
        ds.Ordenacao.selecao(itemArray0, 0);
        ds.Ordenacao.shellsort(itemArray0, 0);
        ds.Ordenacao.insercao(itemArray0, (int) (short) 0);
        ds.Ordenacao.selecao(itemArray0, (int) (short) 0);
        ds.Ordenacao.insercao(itemArray0, (int) (byte) 1);
        ds.Ordenacao.selecao(itemArray0, (int) (short) -1);
        ds.Ordenacao.heapsort(itemArray0, (int) (short) -1);
        org.junit.Assert.assertNotNull(itemArray0);
    }

    @Test
    public void test1748() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1748");
        ds.Item[] itemArray0 = new ds.Item[] {};
        ds.Ordenacao.heapsort(itemArray0, 0);
        ds.Ordenacao.insercao(itemArray0, 0);
        ds.Ordenacao.insercao(itemArray0, (int) (short) 0);
        ds.Ordenacao.selecao(itemArray0, 1);
        ds.Ordenacao.selecao(itemArray0, (int) (short) -1);
        ds.Ordenacao.insercao(itemArray0, 0);
        ds.Ordenacao.selecao(itemArray0, 0);
        ds.Ordenacao.shellsort(itemArray0, (int) (short) -1);
        ds.Ordenacao.heapsort(itemArray0, 1);
        ds.Ordenacao.selecao(itemArray0, (-1));
        org.junit.Assert.assertNotNull(itemArray0);
    }

    @Test
    public void test1749() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1749");
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
            ds.Ordenacao.insercao(itemArray0, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 2");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray0);
    }

    @Test
    public void test1750() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1750");
        ds.Item item0 = null;
        ds.Item[] itemArray1 = new ds.Item[] { item0 };
        ds.Ordenacao.heapsort(itemArray1, 0);
        ds.Ordenacao.shellsort(itemArray1, (int) (byte) 0);
        ds.Ordenacao.heapsort(itemArray1, (-1));
        // The following exception was thrown during execution in test generation
        try {
            ds.Ordenacao.quicksort(itemArray1, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray1);
    }

    @Test
    public void test1751() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1751");
        ds.Item[] itemArray0 = new ds.Item[] {};
        ds.Ordenacao.heapsort(itemArray0, 0);
        ds.Ordenacao.insercao(itemArray0, 0);
        ds.Ordenacao.insercao(itemArray0, (int) (short) 0);
        ds.Ordenacao.selecao(itemArray0, 1);
        ds.Ordenacao.insercao(itemArray0, 1);
        ds.Ordenacao.insercao(itemArray0, (int) (byte) 1);
        ds.Ordenacao.heapsort(itemArray0, (-1));
        ds.Ordenacao.heapsort(itemArray0, (int) (short) -1);
        org.junit.Assert.assertNotNull(itemArray0);
    }

    @Test
    public void test1752() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1752");
        ds.Item[] itemArray0 = new ds.Item[] {};
        ds.Ordenacao.heapsort(itemArray0, 0);
        ds.Ordenacao.insercao(itemArray0, 0);
        ds.Ordenacao.heapsort(itemArray0, 1);
        ds.Ordenacao.shellsort(itemArray0, (int) (short) 1);
        ds.Ordenacao.selecao(itemArray0, 0);
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
    public void test1753() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1753");
        ds.Item[] itemArray0 = new ds.Item[] {};
        ds.Ordenacao.heapsort(itemArray0, 0);
        ds.Ordenacao.insercao(itemArray0, 0);
        ds.Ordenacao.heapsort(itemArray0, 1);
        ds.Ordenacao.shellsort(itemArray0, (int) (short) 1);
        ds.Ordenacao.selecao(itemArray0, 0);
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
    public void test1754() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1754");
        ds.Item[] itemArray0 = null;
        ds.Ordenacao.selecao(itemArray0, 0);
    }

    @Test
    public void test1755() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1755");
        ds.Item[] itemArray0 = new ds.Item[] {};
        ds.Ordenacao.heapsort(itemArray0, 0);
        ds.Ordenacao.insercao(itemArray0, 0);
        ds.Ordenacao.insercao(itemArray0, (int) (short) 0);
        ds.Ordenacao.selecao(itemArray0, 1);
        ds.Ordenacao.shellsort(itemArray0, (int) (short) 1);
        ds.Ordenacao.shellsort(itemArray0, 0);
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
    public void test1756() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1756");
        ds.Item[] itemArray0 = new ds.Item[] {};
        ds.Ordenacao.heapsort(itemArray0, 0);
        ds.Ordenacao.insercao(itemArray0, 0);
        ds.Ordenacao.shellsort(itemArray0, (-1));
        ds.Ordenacao.selecao(itemArray0, (-1));
        ds.Ordenacao.heapsort(itemArray0, (int) (short) 0);
        ds.Ordenacao.shellsort(itemArray0, (int) (short) 0);
        ds.Ordenacao.insercao(itemArray0, 0);
        ds.Ordenacao.heapsort(itemArray0, 1);
        ds.Ordenacao.heapsort(itemArray0, (int) (byte) 1);
        org.junit.Assert.assertNotNull(itemArray0);
    }

    @Test
    public void test1757() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1757");
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
    public void test1758() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1758");
        ds.Item[] itemArray0 = new ds.Item[] {};
        ds.Ordenacao.heapsort(itemArray0, 0);
        ds.Ordenacao.heapsort(itemArray0, 0);
        ds.Ordenacao.insercao(itemArray0, (int) (short) -1);
        ds.Ordenacao.insercao(itemArray0, (int) (short) 0);
        ds.Ordenacao.selecao(itemArray0, (int) (short) 1);
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
    public void test1759() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1759");
        ds.Item[] itemArray0 = new ds.Item[] {};
        ds.Ordenacao.heapsort(itemArray0, 0);
        ds.Ordenacao.heapsort(itemArray0, 0);
        ds.Ordenacao.shellsort(itemArray0, (int) (byte) 1);
        ds.Ordenacao.insercao(itemArray0, (int) (byte) 1);
        ds.Ordenacao.selecao(itemArray0, (-1));
        ds.Ordenacao.heapsort(itemArray0, (-1));
        org.junit.Assert.assertNotNull(itemArray0);
    }

    @Test
    public void test1760() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1760");
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
        ds.Ordenacao.shellsort(itemArray0, (int) (byte) 0);
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
    public void test1761() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1761");
        ds.Item[] itemArray0 = new ds.Item[] {};
        ds.Ordenacao.heapsort(itemArray0, 0);
        ds.Ordenacao.insercao(itemArray0, 0);
        ds.Ordenacao.selecao(itemArray0, 0);
        ds.Ordenacao.selecao(itemArray0, (int) (short) 0);
        ds.Ordenacao.selecao(itemArray0, (int) (byte) 0);
        java.lang.Class<?> wildcardClass11 = itemArray0.getClass();
        org.junit.Assert.assertNotNull(itemArray0);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test1762() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1762");
        ds.Item item0 = null;
        ds.Item[] itemArray1 = new ds.Item[] { item0 };
        ds.Ordenacao.heapsort(itemArray1, 0);
        ds.Ordenacao.insercao(itemArray1, (int) (short) -1);
        ds.Ordenacao.insercao(itemArray1, (int) (byte) -1);
        // The following exception was thrown during execution in test generation
        try {
            ds.Ordenacao.insercao(itemArray1, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 2");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray1);
    }

    @Test
    public void test1763() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1763");
        ds.Item[] itemArray0 = new ds.Item[] {};
        ds.Ordenacao.heapsort(itemArray0, 0);
        ds.Ordenacao.insercao(itemArray0, 0);
        ds.Ordenacao.insercao(itemArray0, (int) (short) 0);
        ds.Ordenacao.selecao(itemArray0, 1);
        ds.Ordenacao.selecao(itemArray0, 1);
        ds.Ordenacao.insercao(itemArray0, (int) (short) 0);
        org.junit.Assert.assertNotNull(itemArray0);
    }

    @Test
    public void test1764() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1764");
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
        ds.Ordenacao.heapsort(itemArray0, (int) (byte) 0);
        org.junit.Assert.assertNotNull(itemArray0);
    }

    @Test
    public void test1765() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1765");
        ds.Item[] itemArray0 = new ds.Item[] {};
        ds.Ordenacao.heapsort(itemArray0, 0);
        ds.Ordenacao.insercao(itemArray0, 0);
        ds.Ordenacao.shellsort(itemArray0, (-1));
        ds.Ordenacao.selecao(itemArray0, (-1));
        ds.Ordenacao.heapsort(itemArray0, (int) (short) 0);
        ds.Ordenacao.selecao(itemArray0, 1);
        ds.Ordenacao.heapsort(itemArray0, (int) (short) 1);
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
    public void test1766() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1766");
        ds.Item item0 = null;
        ds.Item[] itemArray1 = new ds.Item[] { item0 };
        ds.Ordenacao.heapsort(itemArray1, 0);
        ds.Ordenacao.heapsort(itemArray1, 1);
        ds.Ordenacao.heapsort(itemArray1, 1);
        ds.Ordenacao.selecao(itemArray1, (int) (short) 1);
        ds.Ordenacao.selecao(itemArray1, (int) (short) 1);
        ds.Ordenacao.insercao(itemArray1, 0);
        ds.Ordenacao.heapsort(itemArray1, (int) (short) 0);
        ds.Ordenacao.shellsort(itemArray1, (int) (short) 1);
        ds.Ordenacao.insercao(itemArray1, (int) (short) -1);
        org.junit.Assert.assertNotNull(itemArray1);
    }

    @Test
    public void test1767() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1767");
        ds.Item[] itemArray0 = new ds.Item[] {};
        ds.Ordenacao.heapsort(itemArray0, 0);
        ds.Ordenacao.insercao(itemArray0, 0);
        ds.Ordenacao.insercao(itemArray0, (int) (short) 0);
        ds.Ordenacao.selecao(itemArray0, 1);
        ds.Ordenacao.selecao(itemArray0, (int) (short) -1);
        ds.Ordenacao.insercao(itemArray0, 0);
        // The following exception was thrown during execution in test generation
        try {
            ds.Ordenacao.heapsort(itemArray0, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray0);
    }

    @Test
    public void test1768() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1768");
        ds.Item[] itemArray0 = new ds.Item[] {};
        ds.Ordenacao.heapsort(itemArray0, 0);
        ds.Ordenacao.insercao(itemArray0, 0);
        ds.Ordenacao.shellsort(itemArray0, (-1));
        ds.Ordenacao.insercao(itemArray0, (int) (byte) 1);
        ds.Ordenacao.selecao(itemArray0, 0);
        ds.Ordenacao.shellsort(itemArray0, 1);
        ds.Ordenacao.selecao(itemArray0, (-1));
        ds.Ordenacao.shellsort(itemArray0, (-1));
        ds.Ordenacao.shellsort(itemArray0, (int) (short) 1);
        org.junit.Assert.assertNotNull(itemArray0);
    }

    @Test
    public void test1769() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1769");
        ds.Item[] itemArray0 = new ds.Item[] {};
        ds.Ordenacao.heapsort(itemArray0, 0);
        ds.Ordenacao.insercao(itemArray0, 0);
        ds.Ordenacao.selecao(itemArray0, 0);
        ds.Ordenacao.selecao(itemArray0, (int) (short) 0);
        ds.Ordenacao.insercao(itemArray0, (int) (byte) -1);
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
    public void test1770() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1770");
        ds.Item item0 = null;
        ds.Item[] itemArray1 = new ds.Item[] { item0 };
        ds.Ordenacao.heapsort(itemArray1, 0);
        ds.Ordenacao.heapsort(itemArray1, 1);
        ds.Ordenacao.heapsort(itemArray1, 1);
        ds.Ordenacao.selecao(itemArray1, (int) (short) 1);
        ds.Ordenacao.selecao(itemArray1, (int) (short) 1);
        ds.Ordenacao.insercao(itemArray1, 0);
        ds.Ordenacao.heapsort(itemArray1, (int) (short) -1);
        ds.Ordenacao.shellsort(itemArray1, 0);
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
    public void test1771() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1771");
        ds.Item item0 = null;
        ds.Item[] itemArray1 = new ds.Item[] { item0 };
        ds.Ordenacao.heapsort(itemArray1, 0);
        ds.Ordenacao.shellsort(itemArray1, (int) (byte) 0);
        ds.Ordenacao.shellsort(itemArray1, (int) (short) 0);
        ds.Ordenacao.selecao(itemArray1, (int) (byte) -1);
        ds.Ordenacao.shellsort(itemArray1, 1);
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
    public void test1772() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1772");
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
        // The following exception was thrown during execution in test generation
        try {
            ds.Ordenacao.heapsort(itemArray0, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray0);
    }

    @Test
    public void test1773() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1773");
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
    public void test1774() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1774");
        ds.Item[] itemArray0 = new ds.Item[] {};
        ds.Ordenacao.heapsort(itemArray0, 0);
        ds.Ordenacao.insercao(itemArray0, 0);
        ds.Ordenacao.insercao(itemArray0, (int) (short) 0);
        ds.Ordenacao.selecao(itemArray0, 1);
        ds.Ordenacao.shellsort(itemArray0, (int) (short) 1);
        ds.Ordenacao.shellsort(itemArray0, 0);
        ds.Ordenacao.shellsort(itemArray0, (-1));
        ds.Ordenacao.heapsort(itemArray0, 1);
        ds.Ordenacao.heapsort(itemArray0, (int) (short) 1);
        ds.Ordenacao.shellsort(itemArray0, (int) (short) 0);
        ds.Ordenacao.heapsort(itemArray0, 0);
        org.junit.Assert.assertNotNull(itemArray0);
    }

    @Test
    public void test1775() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1775");
        ds.Item[] itemArray0 = new ds.Item[] {};
        ds.Ordenacao.heapsort(itemArray0, 0);
        ds.Ordenacao.insercao(itemArray0, 0);
        ds.Ordenacao.insercao(itemArray0, (int) (short) 0);
        ds.Ordenacao.selecao(itemArray0, 1);
        ds.Ordenacao.shellsort(itemArray0, (int) (short) 1);
        ds.Ordenacao.shellsort(itemArray0, 0);
        ds.Ordenacao.shellsort(itemArray0, (-1));
        ds.Ordenacao.heapsort(itemArray0, 1);
        ds.Ordenacao.heapsort(itemArray0, (int) (short) 1);
        ds.Ordenacao.shellsort(itemArray0, (int) (byte) -1);
        ds.Ordenacao.insercao(itemArray0, (int) (byte) 0);
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
    public void test1776() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1776");
        ds.Item[] itemArray0 = new ds.Item[] {};
        ds.Ordenacao.heapsort(itemArray0, 0);
        ds.Ordenacao.insercao(itemArray0, 0);
        ds.Ordenacao.selecao(itemArray0, 0);
        ds.Ordenacao.insercao(itemArray0, (-1));
        ds.Ordenacao.heapsort(itemArray0, (-1));
        ds.Ordenacao.insercao(itemArray0, 0);
        ds.Ordenacao.selecao(itemArray0, (int) (byte) -1);
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
    public void test1777() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1777");
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
        java.lang.Class<?> wildcardClass27 = itemArray0.getClass();
        org.junit.Assert.assertNotNull(itemArray0);
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test1778() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1778");
        ds.Item[] itemArray0 = new ds.Item[] {};
        ds.Ordenacao.heapsort(itemArray0, 0);
        ds.Ordenacao.insercao(itemArray0, 0);
        ds.Ordenacao.insercao(itemArray0, (int) (short) 0);
        ds.Ordenacao.selecao(itemArray0, 1);
        ds.Ordenacao.shellsort(itemArray0, (int) (short) 1);
        ds.Ordenacao.insercao(itemArray0, (int) (short) 1);
        ds.Ordenacao.selecao(itemArray0, 0);
        ds.Ordenacao.shellsort(itemArray0, (-1));
        ds.Ordenacao.selecao(itemArray0, (int) (short) 1);
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
    public void test1779() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1779");
        ds.Item[] itemArray0 = new ds.Item[] {};
        ds.Ordenacao.heapsort(itemArray0, 0);
        ds.Ordenacao.heapsort(itemArray0, (int) (byte) 0);
        ds.Ordenacao.shellsort(itemArray0, 0);
        ds.Ordenacao.heapsort(itemArray0, (int) (byte) -1);
        ds.Ordenacao.heapsort(itemArray0, (int) (byte) 1);
        ds.Ordenacao.selecao(itemArray0, 0);
        ds.Ordenacao.insercao(itemArray0, (int) (short) 1);
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
    public void test1780() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1780");
        ds.Item[] itemArray0 = new ds.Item[] {};
        ds.Ordenacao.heapsort(itemArray0, 0);
        ds.Ordenacao.insercao(itemArray0, 0);
        ds.Ordenacao.insercao(itemArray0, (int) (short) 0);
        ds.Ordenacao.selecao(itemArray0, 1);
        ds.Ordenacao.selecao(itemArray0, (int) (short) -1);
        ds.Ordenacao.shellsort(itemArray0, (int) (short) -1);
        ds.Ordenacao.insercao(itemArray0, 0);
        ds.Ordenacao.insercao(itemArray0, 1);
        ds.Ordenacao.insercao(itemArray0, (int) (short) 0);
        org.junit.Assert.assertNotNull(itemArray0);
    }

    @Test
    public void test1781() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1781");
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
        ds.Ordenacao.insercao(itemArray0, (int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            ds.Ordenacao.heapsort(itemArray0, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray0);
    }

    @Test
    public void test1782() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1782");
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
        ds.Ordenacao.insercao(itemArray0, (int) (short) -1);
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
    public void test1783() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1783");
        ds.Item[] itemArray0 = new ds.Item[] {};
        ds.Ordenacao.heapsort(itemArray0, 0);
        ds.Ordenacao.insercao(itemArray0, 0);
        ds.Ordenacao.shellsort(itemArray0, (-1));
        ds.Ordenacao.selecao(itemArray0, (-1));
        ds.Ordenacao.heapsort(itemArray0, (int) (short) 0);
        ds.Ordenacao.shellsort(itemArray0, (int) (short) 0);
        ds.Ordenacao.selecao(itemArray0, (-1));
        org.junit.Assert.assertNotNull(itemArray0);
    }

    @Test
    public void test1784() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1784");
        ds.Item[] itemArray0 = null;
        ds.Ordenacao.shellsort(itemArray0, (-1));
    }

    @Test
    public void test1785() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1785");
        ds.Item[] itemArray0 = new ds.Item[] {};
        ds.Ordenacao.heapsort(itemArray0, 0);
        ds.Ordenacao.heapsort(itemArray0, (int) (byte) 0);
        ds.Ordenacao.shellsort(itemArray0, 0);
        ds.Ordenacao.heapsort(itemArray0, (int) (byte) -1);
        ds.Ordenacao.shellsort(itemArray0, (int) (byte) 0);
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
    public void test1786() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1786");
        ds.Item[] itemArray0 = new ds.Item[] {};
        ds.Ordenacao.heapsort(itemArray0, 0);
        ds.Ordenacao.insercao(itemArray0, 0);
        ds.Ordenacao.selecao(itemArray0, 0);
        ds.Ordenacao.selecao(itemArray0, (int) (byte) 0);
        ds.Ordenacao.selecao(itemArray0, (int) (byte) 1);
        java.lang.Class<?> wildcardClass11 = itemArray0.getClass();
        org.junit.Assert.assertNotNull(itemArray0);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test1787() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1787");
        ds.Item[] itemArray0 = new ds.Item[] {};
        ds.Ordenacao.heapsort(itemArray0, 0);
        ds.Ordenacao.heapsort(itemArray0, 0);
        ds.Ordenacao.insercao(itemArray0, (int) (short) -1);
        ds.Ordenacao.heapsort(itemArray0, (int) (byte) 0);
        ds.Ordenacao.heapsort(itemArray0, 0);
        ds.Ordenacao.heapsort(itemArray0, (int) (byte) -1);
        org.junit.Assert.assertNotNull(itemArray0);
    }

    @Test
    public void test1788() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1788");
        ds.Item item0 = null;
        ds.Item[] itemArray1 = new ds.Item[] { item0 };
        ds.Ordenacao.heapsort(itemArray1, 0);
        ds.Ordenacao.shellsort(itemArray1, (int) (byte) 0);
        ds.Ordenacao.shellsort(itemArray1, (int) (short) 0);
        ds.Ordenacao.insercao(itemArray1, 0);
        ds.Ordenacao.heapsort(itemArray1, 0);
        java.lang.Class<?> wildcardClass12 = itemArray1.getClass();
        org.junit.Assert.assertNotNull(itemArray1);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test1789() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1789");
        ds.Item item0 = null;
        ds.Item[] itemArray1 = new ds.Item[] { item0 };
        ds.Ordenacao.heapsort(itemArray1, 0);
        ds.Ordenacao.heapsort(itemArray1, 1);
        ds.Ordenacao.shellsort(itemArray1, (-1));
        ds.Ordenacao.insercao(itemArray1, (-1));
        ds.Ordenacao.heapsort(itemArray1, 0);
        ds.Ordenacao.heapsort(itemArray1, (int) (byte) 1);
        ds.Ordenacao.heapsort(itemArray1, (int) (byte) -1);
        org.junit.Assert.assertNotNull(itemArray1);
    }

    @Test
    public void test1790() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1790");
        ds.Item[] itemArray0 = new ds.Item[] {};
        ds.Ordenacao.heapsort(itemArray0, 0);
        ds.Ordenacao.insercao(itemArray0, 0);
        ds.Ordenacao.shellsort(itemArray0, (-1));
        ds.Ordenacao.selecao(itemArray0, 0);
        ds.Ordenacao.insercao(itemArray0, (int) (byte) 0);
        ds.Ordenacao.shellsort(itemArray0, (int) (byte) 0);
        org.junit.Assert.assertNotNull(itemArray0);
    }

    @Test
    public void test1791() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1791");
        ds.Item[] itemArray0 = new ds.Item[] {};
        ds.Ordenacao.heapsort(itemArray0, 0);
        ds.Ordenacao.insercao(itemArray0, 0);
        ds.Ordenacao.selecao(itemArray0, 0);
        ds.Ordenacao.shellsort(itemArray0, (int) (byte) 1);
        ds.Ordenacao.insercao(itemArray0, 0);
        ds.Ordenacao.shellsort(itemArray0, (int) (short) 0);
        ds.Ordenacao.heapsort(itemArray0, (int) (byte) 0);
        ds.Ordenacao.insercao(itemArray0, (int) (short) 0);
        ds.Ordenacao.insercao(itemArray0, 0);
        org.junit.Assert.assertNotNull(itemArray0);
    }

    @Test
    public void test1792() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1792");
        ds.Item[] itemArray0 = new ds.Item[] {};
        ds.Ordenacao.heapsort(itemArray0, 0);
        ds.Ordenacao.heapsort(itemArray0, 0);
        ds.Ordenacao.insercao(itemArray0, (int) (short) -1);
        ds.Ordenacao.insercao(itemArray0, (int) (short) 0);
        ds.Ordenacao.selecao(itemArray0, (int) (byte) -1);
        // The following exception was thrown during execution in test generation
        try {
            ds.Ordenacao.heapsort(itemArray0, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray0);
    }

    @Test
    public void test1793() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1793");
        ds.Item[] itemArray0 = new ds.Item[] {};
        ds.Ordenacao.heapsort(itemArray0, 0);
        ds.Ordenacao.insercao(itemArray0, 0);
        ds.Ordenacao.shellsort(itemArray0, (-1));
        ds.Ordenacao.shellsort(itemArray0, (int) (byte) -1);
        ds.Ordenacao.selecao(itemArray0, (int) (byte) -1);
        ds.Ordenacao.heapsort(itemArray0, (int) (byte) -1);
        ds.Ordenacao.heapsort(itemArray0, (int) (byte) 1);
        ds.Ordenacao.heapsort(itemArray0, (int) (byte) 1);
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
    public void test1794() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1794");
        ds.Item[] itemArray0 = new ds.Item[] {};
        ds.Ordenacao.heapsort(itemArray0, 0);
        ds.Ordenacao.insercao(itemArray0, 0);
        ds.Ordenacao.selecao(itemArray0, 0);
        ds.Ordenacao.insercao(itemArray0, (-1));
        ds.Ordenacao.insercao(itemArray0, (int) (byte) -1);
        ds.Ordenacao.insercao(itemArray0, 0);
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
    public void test1795() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1795");
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
    public void test1796() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1796");
        ds.Item[] itemArray0 = new ds.Item[] {};
        ds.Ordenacao.heapsort(itemArray0, 0);
        ds.Ordenacao.insercao(itemArray0, 0);
        ds.Ordenacao.insercao(itemArray0, (int) (short) 0);
        ds.Ordenacao.selecao(itemArray0, 1);
        ds.Ordenacao.shellsort(itemArray0, (int) (short) 1);
        ds.Ordenacao.shellsort(itemArray0, 0);
        ds.Ordenacao.shellsort(itemArray0, (-1));
        ds.Ordenacao.heapsort(itemArray0, 1);
        ds.Ordenacao.heapsort(itemArray0, (int) (short) 1);
        ds.Ordenacao.shellsort(itemArray0, (int) (byte) -1);
        ds.Ordenacao.insercao(itemArray0, (int) (byte) 0);
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
    public void test1797() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1797");
        ds.Item[] itemArray0 = new ds.Item[] {};
        ds.Ordenacao.heapsort(itemArray0, 0);
        ds.Ordenacao.insercao(itemArray0, 0);
        ds.Ordenacao.selecao(itemArray0, 0);
        ds.Ordenacao.shellsort(itemArray0, (int) (byte) 1);
        ds.Ordenacao.shellsort(itemArray0, (int) (byte) 1);
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
    public void test1798() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1798");
        ds.Item[] itemArray0 = new ds.Item[] {};
        ds.Ordenacao.heapsort(itemArray0, 0);
        ds.Ordenacao.insercao(itemArray0, 0);
        ds.Ordenacao.selecao(itemArray0, 0);
        ds.Ordenacao.insercao(itemArray0, (-1));
        ds.Ordenacao.heapsort(itemArray0, (-1));
        ds.Ordenacao.insercao(itemArray0, (int) (short) -1);
        // The following exception was thrown during execution in test generation
        try {
            ds.Ordenacao.heapsort(itemArray0, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray0);
    }

    @Test
    public void test1799() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1799");
        ds.Item[] itemArray0 = new ds.Item[] {};
        ds.Ordenacao.heapsort(itemArray0, 0);
        ds.Ordenacao.insercao(itemArray0, 0);
        ds.Ordenacao.shellsort(itemArray0, (-1));
        ds.Ordenacao.insercao(itemArray0, (int) (byte) 0);
        ds.Ordenacao.heapsort(itemArray0, (int) (byte) -1);
        ds.Ordenacao.insercao(itemArray0, (int) (byte) 0);
        ds.Ordenacao.shellsort(itemArray0, (int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            ds.Ordenacao.heapsort(itemArray0, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray0);
    }

    @Test
    public void test1800() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1800");
        ds.Item[] itemArray0 = new ds.Item[] {};
        ds.Ordenacao.heapsort(itemArray0, 0);
        ds.Ordenacao.insercao(itemArray0, 0);
        ds.Ordenacao.shellsort(itemArray0, (-1));
        ds.Ordenacao.shellsort(itemArray0, (int) (byte) -1);
        ds.Ordenacao.selecao(itemArray0, (int) (byte) -1);
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
    public void test1801() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1801");
        ds.Item[] itemArray0 = new ds.Item[] {};
        ds.Ordenacao.heapsort(itemArray0, 0);
        ds.Ordenacao.heapsort(itemArray0, (int) (byte) 0);
        ds.Ordenacao.shellsort(itemArray0, 0);
        ds.Ordenacao.insercao(itemArray0, (-1));
        ds.Ordenacao.heapsort(itemArray0, (int) (short) 1);
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
    public void test1802() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1802");
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
        ds.Ordenacao.heapsort(itemArray0, (int) (byte) 1);
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
    public void test1803() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1803");
        ds.Item[] itemArray0 = null;
        ds.Ordenacao.selecao(itemArray0, (int) (short) 0);
    }

    @Test
    public void test1804() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1804");
        ds.Item[] itemArray0 = new ds.Item[] {};
        ds.Ordenacao.heapsort(itemArray0, 0);
        ds.Ordenacao.insercao(itemArray0, 0);
        ds.Ordenacao.insercao(itemArray0, (int) (short) 0);
        ds.Ordenacao.selecao(itemArray0, 1);
        ds.Ordenacao.selecao(itemArray0, (int) (short) -1);
        ds.Ordenacao.heapsort(itemArray0, (int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            ds.Ordenacao.heapsort(itemArray0, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray0);
    }

    @Test
    public void test1805() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1805");
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
        ds.Ordenacao.insercao(itemArray0, (int) (short) -1);
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
    public void test1806() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1806");
        ds.Item[] itemArray0 = new ds.Item[] {};
        ds.Ordenacao.heapsort(itemArray0, 0);
        ds.Ordenacao.insercao(itemArray0, 0);
        ds.Ordenacao.insercao(itemArray0, (int) (short) 0);
        ds.Ordenacao.selecao(itemArray0, 1);
        ds.Ordenacao.selecao(itemArray0, 0);
        ds.Ordenacao.heapsort(itemArray0, (int) (byte) -1);
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
    public void test1807() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1807");
        ds.Item[] itemArray0 = new ds.Item[] {};
        ds.Ordenacao.heapsort(itemArray0, 0);
        ds.Ordenacao.insercao(itemArray0, 0);
        ds.Ordenacao.selecao(itemArray0, 0);
        ds.Ordenacao.shellsort(itemArray0, (int) (byte) 1);
        ds.Ordenacao.insercao(itemArray0, 0);
        ds.Ordenacao.shellsort(itemArray0, (int) (short) 0);
        ds.Ordenacao.heapsort(itemArray0, (int) (byte) 0);
        ds.Ordenacao.insercao(itemArray0, (int) (short) 0);
        ds.Ordenacao.heapsort(itemArray0, (int) (short) -1);
        java.lang.Class<?> wildcardClass19 = itemArray0.getClass();
        org.junit.Assert.assertNotNull(itemArray0);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test1808() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1808");
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
            ds.Ordenacao.insercao(itemArray0, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray0);
    }

    @Test
    public void test1809() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1809");
        ds.Item[] itemArray0 = new ds.Item[] {};
        ds.Ordenacao.heapsort(itemArray0, 0);
        ds.Ordenacao.insercao(itemArray0, 0);
        ds.Ordenacao.insercao(itemArray0, (int) (short) 0);
        ds.Ordenacao.selecao(itemArray0, 1);
        ds.Ordenacao.shellsort(itemArray0, (int) (byte) -1);
        ds.Ordenacao.heapsort(itemArray0, (int) (byte) -1);
        ds.Ordenacao.heapsort(itemArray0, (int) (short) 0);
        ds.Ordenacao.heapsort(itemArray0, (int) (short) 1);
        ds.Ordenacao.heapsort(itemArray0, (int) (short) 1);
        org.junit.Assert.assertNotNull(itemArray0);
    }

    @Test
    public void test1810() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1810");
        ds.Item[] itemArray0 = null;
        // The following exception was thrown during execution in test generation
        try {
            ds.Ordenacao.shellsort(itemArray0, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1811() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1811");
        ds.Item item0 = null;
        ds.Item[] itemArray1 = new ds.Item[] { item0 };
        ds.Ordenacao.heapsort(itemArray1, 0);
        ds.Ordenacao.heapsort(itemArray1, 1);
        ds.Ordenacao.shellsort(itemArray1, (int) (byte) 1);
        ds.Ordenacao.shellsort(itemArray1, 0);
        ds.Ordenacao.shellsort(itemArray1, 1);
        // The following exception was thrown during execution in test generation
        try {
            ds.Ordenacao.selecao(itemArray1, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 2");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray1);
    }

    @Test
    public void test1812() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1812");
        ds.Item[] itemArray0 = new ds.Item[] {};
        ds.Ordenacao.heapsort(itemArray0, 0);
        ds.Ordenacao.insercao(itemArray0, 0);
        ds.Ordenacao.shellsort(itemArray0, (-1));
        ds.Ordenacao.selecao(itemArray0, (-1));
        ds.Ordenacao.heapsort(itemArray0, (int) (short) 0);
        ds.Ordenacao.heapsort(itemArray0, (int) (short) 1);
        ds.Ordenacao.heapsort(itemArray0, (int) (byte) 0);
        ds.Ordenacao.insercao(itemArray0, (int) (byte) -1);
        ds.Ordenacao.insercao(itemArray0, (int) (short) 1);
        org.junit.Assert.assertNotNull(itemArray0);
    }

    @Test
    public void test1813() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1813");
        ds.Item[] itemArray0 = new ds.Item[] {};
        ds.Ordenacao.heapsort(itemArray0, 0);
        ds.Ordenacao.insercao(itemArray0, 0);
        ds.Ordenacao.shellsort(itemArray0, (-1));
        ds.Ordenacao.selecao(itemArray0, (int) (byte) 0);
        ds.Ordenacao.shellsort(itemArray0, 0);
        ds.Ordenacao.selecao(itemArray0, (int) (byte) -1);
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
    public void test1814() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1814");
        ds.Item[] itemArray0 = new ds.Item[] {};
        ds.Ordenacao.heapsort(itemArray0, 0);
        ds.Ordenacao.insercao(itemArray0, 0);
        ds.Ordenacao.shellsort(itemArray0, (-1));
        ds.Ordenacao.insercao(itemArray0, (int) (byte) 1);
        ds.Ordenacao.insercao(itemArray0, (int) (byte) 0);
        ds.Ordenacao.selecao(itemArray0, (int) (short) -1);
        ds.Ordenacao.insercao(itemArray0, (int) (short) -1);
        ds.Ordenacao.shellsort(itemArray0, (int) (short) 0);
        java.lang.Class<?> wildcardClass17 = itemArray0.getClass();
        org.junit.Assert.assertNotNull(itemArray0);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test1815() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1815");
        ds.Item[] itemArray0 = new ds.Item[] {};
        ds.Ordenacao.heapsort(itemArray0, 0);
        ds.Ordenacao.insercao(itemArray0, 0);
        ds.Ordenacao.shellsort(itemArray0, (-1));
        ds.Ordenacao.selecao(itemArray0, (-1));
        ds.Ordenacao.heapsort(itemArray0, (int) (short) 0);
        ds.Ordenacao.selecao(itemArray0, 1);
        ds.Ordenacao.shellsort(itemArray0, (int) (byte) 0);
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
    public void test1816() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1816");
        ds.Item[] itemArray0 = new ds.Item[] {};
        ds.Ordenacao.heapsort(itemArray0, 0);
        ds.Ordenacao.insercao(itemArray0, 0);
        ds.Ordenacao.selecao(itemArray0, 0);
        ds.Ordenacao.shellsort(itemArray0, (int) (short) 1);
        ds.Ordenacao.insercao(itemArray0, 0);
        ds.Ordenacao.selecao(itemArray0, (int) (byte) -1);
        ds.Ordenacao.insercao(itemArray0, (int) (short) 0);
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
    public void test1817() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1817");
        ds.Item item0 = null;
        ds.Item[] itemArray1 = new ds.Item[] { item0 };
        ds.Ordenacao.heapsort(itemArray1, 0);
        ds.Ordenacao.shellsort(itemArray1, (int) (byte) 0);
        ds.Ordenacao.heapsort(itemArray1, (int) (byte) 1);
        ds.Ordenacao.selecao(itemArray1, (int) (short) 1);
        ds.Ordenacao.insercao(itemArray1, (int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            ds.Ordenacao.insercao(itemArray1, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray1);
    }

    @Test
    public void test1818() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1818");
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
        java.lang.Class<?> wildcardClass33 = itemArray0.getClass();
        org.junit.Assert.assertNotNull(itemArray0);
        org.junit.Assert.assertNotNull(wildcardClass33);
    }

    @Test
    public void test1819() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1819");
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
        ds.Ordenacao.insercao(itemArray0, 1);
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
    public void test1820() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1820");
        ds.Item[] itemArray0 = new ds.Item[] {};
        ds.Ordenacao.heapsort(itemArray0, 0);
        ds.Ordenacao.insercao(itemArray0, 0);
        ds.Ordenacao.shellsort(itemArray0, (-1));
        ds.Ordenacao.selecao(itemArray0, (-1));
        ds.Ordenacao.heapsort(itemArray0, (int) (short) 0);
        ds.Ordenacao.heapsort(itemArray0, 0);
        ds.Ordenacao.selecao(itemArray0, 0);
        ds.Ordenacao.selecao(itemArray0, (int) (byte) 0);
        java.lang.Class<?> wildcardClass17 = itemArray0.getClass();
        org.junit.Assert.assertNotNull(itemArray0);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test1821() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1821");
        ds.Item[] itemArray0 = new ds.Item[] {};
        ds.Ordenacao.heapsort(itemArray0, 0);
        ds.Ordenacao.insercao(itemArray0, 0);
        ds.Ordenacao.insercao(itemArray0, (int) (short) 0);
        ds.Ordenacao.selecao(itemArray0, 1);
        ds.Ordenacao.selecao(itemArray0, 0);
        ds.Ordenacao.selecao(itemArray0, 0);
        ds.Ordenacao.insercao(itemArray0, (-1));
        org.junit.Assert.assertNotNull(itemArray0);
    }

    @Test
    public void test1822() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1822");
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
            ds.Ordenacao.quicksort(itemArray0, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 26");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray0);
    }

    @Test
    public void test1823() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1823");
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
        ds.Ordenacao.heapsort(itemArray0, 1);
        org.junit.Assert.assertNotNull(itemArray0);
    }

    @Test
    public void test1824() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1824");
        ds.Item[] itemArray0 = new ds.Item[] {};
        ds.Ordenacao.heapsort(itemArray0, 0);
        ds.Ordenacao.insercao(itemArray0, 0);
        ds.Ordenacao.shellsort(itemArray0, (-1));
        ds.Ordenacao.selecao(itemArray0, (int) (byte) 0);
        java.lang.Class<?> wildcardClass9 = itemArray0.getClass();
        org.junit.Assert.assertNotNull(itemArray0);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test1825() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1825");
        ds.Item[] itemArray0 = new ds.Item[] {};
        ds.Ordenacao.heapsort(itemArray0, 0);
        ds.Ordenacao.insercao(itemArray0, 0);
        ds.Ordenacao.insercao(itemArray0, (int) (short) 0);
        ds.Ordenacao.selecao(itemArray0, 1);
        ds.Ordenacao.selecao(itemArray0, 0);
        ds.Ordenacao.heapsort(itemArray0, (int) (short) -1);
        ds.Ordenacao.shellsort(itemArray0, 1);
        // The following exception was thrown during execution in test generation
        try {
            ds.Ordenacao.insercao(itemArray0, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray0);
    }

    @Test
    public void test1826() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1826");
        ds.Item[] itemArray0 = new ds.Item[] {};
        ds.Ordenacao.heapsort(itemArray0, 0);
        ds.Ordenacao.insercao(itemArray0, 0);
        ds.Ordenacao.selecao(itemArray0, 0);
        ds.Ordenacao.shellsort(itemArray0, 0);
        ds.Ordenacao.insercao(itemArray0, (int) (short) 0);
        ds.Ordenacao.selecao(itemArray0, (int) (short) 0);
        ds.Ordenacao.insercao(itemArray0, (int) (byte) 1);
        ds.Ordenacao.selecao(itemArray0, (int) (short) -1);
        ds.Ordenacao.selecao(itemArray0, (int) (byte) 1);
        org.junit.Assert.assertNotNull(itemArray0);
    }

    @Test
    public void test1827() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1827");
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
            ds.Ordenacao.shellsort(itemArray0, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 41");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray0);
    }

    @Test
    public void test1828() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1828");
        ds.Item[] itemArray0 = new ds.Item[] {};
        ds.Ordenacao.heapsort(itemArray0, 0);
        ds.Ordenacao.heapsort(itemArray0, (int) (byte) 0);
        ds.Ordenacao.shellsort(itemArray0, 0);
        ds.Ordenacao.heapsort(itemArray0, (int) (byte) -1);
        ds.Ordenacao.selecao(itemArray0, (int) (byte) 1);
        ds.Ordenacao.insercao(itemArray0, 1);
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
    public void test1829() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1829");
        ds.Item[] itemArray0 = new ds.Item[] {};
        ds.Ordenacao.shellsort(itemArray0, (int) (short) 1);
        ds.Ordenacao.selecao(itemArray0, 1);
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
    public void test1830() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1830");
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
    public void test1831() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1831");
        ds.Item item0 = null;
        ds.Item[] itemArray1 = new ds.Item[] { item0 };
        ds.Ordenacao.heapsort(itemArray1, 0);
        ds.Ordenacao.heapsort(itemArray1, 1);
        ds.Ordenacao.heapsort(itemArray1, 1);
        ds.Ordenacao.selecao(itemArray1, (int) (short) 1);
        ds.Ordenacao.selecao(itemArray1, 1);
        java.lang.Class<?> wildcardClass12 = itemArray1.getClass();
        org.junit.Assert.assertNotNull(itemArray1);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test1832() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1832");
        ds.Item[] itemArray0 = new ds.Item[] {};
        ds.Ordenacao.heapsort(itemArray0, 0);
        ds.Ordenacao.heapsort(itemArray0, (int) (byte) 0);
        ds.Ordenacao.shellsort(itemArray0, 0);
        ds.Ordenacao.insercao(itemArray0, (-1));
        ds.Ordenacao.heapsort(itemArray0, (int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            ds.Ordenacao.heapsort(itemArray0, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray0);
    }

    @Test
    public void test1833() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1833");
        ds.Item[] itemArray0 = null;
        // The following exception was thrown during execution in test generation
        try {
            ds.Ordenacao.quicksort(itemArray0, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1834() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1834");
        ds.Item[] itemArray0 = new ds.Item[] {};
        ds.Ordenacao.heapsort(itemArray0, 0);
        ds.Ordenacao.insercao(itemArray0, 0);
        ds.Ordenacao.selecao(itemArray0, 0);
        ds.Ordenacao.shellsort(itemArray0, (int) (byte) 1);
        ds.Ordenacao.insercao(itemArray0, 0);
        ds.Ordenacao.shellsort(itemArray0, (int) (short) 0);
        ds.Ordenacao.heapsort(itemArray0, (int) (byte) 0);
        ds.Ordenacao.insercao(itemArray0, (int) (short) 0);
        ds.Ordenacao.heapsort(itemArray0, (int) (short) -1);
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
    public void test1835() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1835");
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
            ds.Ordenacao.insercao(itemArray0, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray0);
    }

    @Test
    public void test1836() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1836");
        ds.Item[] itemArray0 = new ds.Item[] {};
        ds.Ordenacao.heapsort(itemArray0, 0);
        ds.Ordenacao.insercao(itemArray0, 0);
        ds.Ordenacao.insercao(itemArray0, (int) (short) 0);
        ds.Ordenacao.selecao(itemArray0, 1);
        ds.Ordenacao.selecao(itemArray0, (int) (short) -1);
        ds.Ordenacao.shellsort(itemArray0, (int) (short) -1);
        ds.Ordenacao.insercao(itemArray0, (int) (short) 0);
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
    public void test1837() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1837");
        ds.Item[] itemArray0 = new ds.Item[] {};
        ds.Ordenacao.shellsort(itemArray0, 1);
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
    public void test1838() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1838");
        ds.Item[] itemArray0 = new ds.Item[] {};
        ds.Ordenacao.heapsort(itemArray0, 0);
        ds.Ordenacao.insercao(itemArray0, 0);
        ds.Ordenacao.shellsort(itemArray0, (-1));
        ds.Ordenacao.selecao(itemArray0, (int) (short) -1);
        ds.Ordenacao.insercao(itemArray0, 1);
        ds.Ordenacao.shellsort(itemArray0, 0);
        ds.Ordenacao.heapsort(itemArray0, (int) (short) -1);
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
    public void test1839() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1839");
        ds.Item item0 = null;
        ds.Item[] itemArray1 = new ds.Item[] { item0 };
        ds.Ordenacao.heapsort(itemArray1, 0);
        ds.Ordenacao.heapsort(itemArray1, 1);
        // The following exception was thrown during execution in test generation
        try {
            ds.Ordenacao.quicksort(itemArray1, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray1);
    }

    @Test
    public void test1840() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1840");
        ds.Item[] itemArray0 = new ds.Item[] {};
        ds.Ordenacao.heapsort(itemArray0, 0);
        ds.Ordenacao.insercao(itemArray0, 0);
        ds.Ordenacao.heapsort(itemArray0, 1);
        ds.Ordenacao.shellsort(itemArray0, (int) (short) 1);
        ds.Ordenacao.selecao(itemArray0, 0);
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
    public void test1841() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1841");
        ds.Item[] itemArray0 = new ds.Item[] {};
        ds.Ordenacao.heapsort(itemArray0, 0);
        ds.Ordenacao.heapsort(itemArray0, (-1));
        ds.Ordenacao.insercao(itemArray0, (int) (byte) 1);
        ds.Ordenacao.shellsort(itemArray0, 0);
        org.junit.Assert.assertNotNull(itemArray0);
    }

    @Test
    public void test1842() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1842");
        ds.Item[] itemArray0 = new ds.Item[] {};
        ds.Ordenacao.heapsort(itemArray0, 0);
        ds.Ordenacao.insercao(itemArray0, 0);
        ds.Ordenacao.selecao(itemArray0, 0);
        ds.Ordenacao.insercao(itemArray0, (-1));
        ds.Ordenacao.insercao(itemArray0, (int) (byte) -1);
        ds.Ordenacao.heapsort(itemArray0, (int) (byte) -1);
        ds.Ordenacao.insercao(itemArray0, (int) (byte) -1);
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
    public void test1843() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1843");
        ds.Item[] itemArray0 = new ds.Item[] {};
        ds.Ordenacao.heapsort(itemArray0, 0);
        ds.Ordenacao.insercao(itemArray0, 0);
        ds.Ordenacao.shellsort(itemArray0, (-1));
        ds.Ordenacao.selecao(itemArray0, (-1));
        ds.Ordenacao.heapsort(itemArray0, (int) (short) 0);
        ds.Ordenacao.selecao(itemArray0, 1);
        ds.Ordenacao.heapsort(itemArray0, (int) (short) 1);
        ds.Ordenacao.heapsort(itemArray0, (int) (byte) -1);
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
    public void test1844() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1844");
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
        ds.Ordenacao.insercao(itemArray0, (int) (byte) 0);
        ds.Ordenacao.shellsort(itemArray0, 0);
        org.junit.Assert.assertNotNull(itemArray0);
    }

    @Test
    public void test1845() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1845");
        ds.Item[] itemArray0 = new ds.Item[] {};
        ds.Ordenacao.heapsort(itemArray0, 0);
        ds.Ordenacao.insercao(itemArray0, 0);
        ds.Ordenacao.selecao(itemArray0, 0);
        ds.Ordenacao.insercao(itemArray0, (-1));
        ds.Ordenacao.heapsort(itemArray0, (-1));
        ds.Ordenacao.heapsort(itemArray0, 1);
        java.lang.Class<?> wildcardClass13 = itemArray0.getClass();
        org.junit.Assert.assertNotNull(itemArray0);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test1846() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1846");
        ds.Item[] itemArray0 = new ds.Item[] {};
        ds.Ordenacao.heapsort(itemArray0, 0);
        ds.Ordenacao.insercao(itemArray0, 0);
        ds.Ordenacao.selecao(itemArray0, 0);
        ds.Ordenacao.insercao(itemArray0, (-1));
        ds.Ordenacao.insercao(itemArray0, (int) (byte) -1);
        ds.Ordenacao.heapsort(itemArray0, (int) (byte) -1);
        ds.Ordenacao.insercao(itemArray0, 0);
        ds.Ordenacao.insercao(itemArray0, 0);
        ds.Ordenacao.heapsort(itemArray0, (int) (short) 1);
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
    public void test1847() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1847");
        ds.Item[] itemArray0 = new ds.Item[] {};
        ds.Ordenacao.heapsort(itemArray0, 0);
        ds.Ordenacao.insercao(itemArray0, 0);
        ds.Ordenacao.insercao(itemArray0, (int) (short) 0);
        ds.Ordenacao.selecao(itemArray0, 1);
        ds.Ordenacao.selecao(itemArray0, (int) (short) -1);
        ds.Ordenacao.heapsort(itemArray0, (int) (short) 1);
        ds.Ordenacao.insercao(itemArray0, 0);
        ds.Ordenacao.insercao(itemArray0, (int) (byte) 1);
        ds.Ordenacao.shellsort(itemArray0, 1);
        org.junit.Assert.assertNotNull(itemArray0);
    }

    @Test
    public void test1848() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1848");
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
        ds.Ordenacao.insercao(itemArray0, (int) (short) 1);
        ds.Ordenacao.selecao(itemArray0, (int) (short) 0);
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
    public void test1849() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1849");
        ds.Item[] itemArray0 = new ds.Item[] {};
        ds.Ordenacao.heapsort(itemArray0, 0);
        ds.Ordenacao.insercao(itemArray0, 0);
        ds.Ordenacao.selecao(itemArray0, 0);
        ds.Ordenacao.insercao(itemArray0, (-1));
        ds.Ordenacao.heapsort(itemArray0, (-1));
        ds.Ordenacao.selecao(itemArray0, 1);
        ds.Ordenacao.insercao(itemArray0, 0);
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
    public void test1850() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1850");
        ds.Item[] itemArray0 = new ds.Item[] {};
        ds.Ordenacao.shellsort(itemArray0, 0);
        ds.Ordenacao.selecao(itemArray0, (int) (byte) 1);
        ds.Ordenacao.shellsort(itemArray0, (int) (short) -1);
        ds.Ordenacao.shellsort(itemArray0, (int) (short) -1);
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
    public void test1851() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1851");
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
            ds.Ordenacao.selecao(itemArray0, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 2");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray0);
    }

    @Test
    public void test1852() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1852");
        ds.Item[] itemArray0 = new ds.Item[] {};
        ds.Ordenacao.heapsort(itemArray0, 0);
        ds.Ordenacao.insercao(itemArray0, 0);
        ds.Ordenacao.selecao(itemArray0, 0);
        ds.Ordenacao.insercao(itemArray0, (-1));
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
    public void test1853() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1853");
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
        java.lang.Class<?> wildcardClass29 = itemArray0.getClass();
        org.junit.Assert.assertNotNull(itemArray0);
        org.junit.Assert.assertNotNull(wildcardClass29);
    }

    @Test
    public void test1854() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1854");
        ds.Item[] itemArray0 = new ds.Item[] {};
        ds.Ordenacao.heapsort(itemArray0, 0);
        ds.Ordenacao.insercao(itemArray0, 0);
        ds.Ordenacao.insercao(itemArray0, (int) (short) 0);
        ds.Ordenacao.selecao(itemArray0, 1);
        ds.Ordenacao.selecao(itemArray0, 0);
        ds.Ordenacao.selecao(itemArray0, 0);
        // The following exception was thrown during execution in test generation
        try {
            ds.Ordenacao.insercao(itemArray0, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray0);
    }

    @Test
    public void test1855() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1855");
        ds.Item[] itemArray0 = new ds.Item[] {};
        ds.Ordenacao.heapsort(itemArray0, 0);
        ds.Ordenacao.heapsort(itemArray0, 0);
        ds.Ordenacao.insercao(itemArray0, (int) (short) -1);
        ds.Ordenacao.heapsort(itemArray0, (int) (byte) 0);
        ds.Ordenacao.selecao(itemArray0, (int) (short) 0);
        ds.Ordenacao.heapsort(itemArray0, 0);
        ds.Ordenacao.selecao(itemArray0, 1);
        org.junit.Assert.assertNotNull(itemArray0);
    }

    @Test
    public void test1856() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1856");
        ds.Item[] itemArray0 = new ds.Item[] {};
        ds.Ordenacao.heapsort(itemArray0, 0);
        ds.Ordenacao.insercao(itemArray0, 0);
        ds.Ordenacao.insercao(itemArray0, (int) (short) 0);
        ds.Ordenacao.selecao(itemArray0, 1);
        ds.Ordenacao.shellsort(itemArray0, (int) (short) 1);
        ds.Ordenacao.shellsort(itemArray0, 0);
        ds.Ordenacao.shellsort(itemArray0, (int) (short) 1);
        ds.Ordenacao.insercao(itemArray0, (int) (byte) 1);
        org.junit.Assert.assertNotNull(itemArray0);
    }

    @Test
    public void test1857() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1857");
        ds.Item[] itemArray0 = new ds.Item[] {};
        ds.Ordenacao.heapsort(itemArray0, 0);
        ds.Ordenacao.insercao(itemArray0, 0);
        ds.Ordenacao.insercao(itemArray0, (int) (short) 0);
        ds.Ordenacao.selecao(itemArray0, 1);
        ds.Ordenacao.shellsort(itemArray0, (int) (short) 1);
        ds.Ordenacao.shellsort(itemArray0, 0);
        ds.Ordenacao.shellsort(itemArray0, (-1));
        ds.Ordenacao.heapsort(itemArray0, 1);
        ds.Ordenacao.heapsort(itemArray0, (int) (short) 1);
        ds.Ordenacao.shellsort(itemArray0, (int) (byte) -1);
        ds.Ordenacao.insercao(itemArray0, (int) (byte) 0);
        java.lang.Class<?> wildcardClass23 = itemArray0.getClass();
        org.junit.Assert.assertNotNull(itemArray0);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test1858() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1858");
        ds.Item[] itemArray0 = new ds.Item[] {};
        ds.Ordenacao.heapsort(itemArray0, 0);
        ds.Ordenacao.insercao(itemArray0, 0);
        ds.Ordenacao.shellsort(itemArray0, (-1));
        ds.Ordenacao.insercao(itemArray0, (int) (byte) 1);
        ds.Ordenacao.insercao(itemArray0, (int) (byte) 0);
        ds.Ordenacao.selecao(itemArray0, (int) (short) -1);
        ds.Ordenacao.insercao(itemArray0, (int) (short) -1);
        ds.Ordenacao.heapsort(itemArray0, (int) (short) 0);
        ds.Ordenacao.selecao(itemArray0, (-1));
        java.lang.Class<?> wildcardClass19 = itemArray0.getClass();
        org.junit.Assert.assertNotNull(itemArray0);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test1859() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1859");
        ds.Item[] itemArray0 = new ds.Item[] {};
        ds.Ordenacao.heapsort(itemArray0, 0);
        ds.Ordenacao.insercao(itemArray0, 0);
        ds.Ordenacao.shellsort(itemArray0, (-1));
        ds.Ordenacao.selecao(itemArray0, (-1));
        ds.Ordenacao.heapsort(itemArray0, (int) (short) 0);
        ds.Ordenacao.heapsort(itemArray0, 0);
        ds.Ordenacao.heapsort(itemArray0, 1);
        // The following exception was thrown during execution in test generation
        try {
            ds.Ordenacao.insercao(itemArray0, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray0);
    }

    @Test
    public void test1860() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1860");
        ds.Item[] itemArray0 = new ds.Item[] {};
        ds.Ordenacao.heapsort(itemArray0, 0);
        ds.Ordenacao.insercao(itemArray0, 0);
        ds.Ordenacao.insercao(itemArray0, (int) (short) 0);
        ds.Ordenacao.selecao(itemArray0, 1);
        ds.Ordenacao.selecao(itemArray0, (int) (short) -1);
        ds.Ordenacao.shellsort(itemArray0, (int) (short) -1);
        ds.Ordenacao.heapsort(itemArray0, (int) (short) 1);
        ds.Ordenacao.heapsort(itemArray0, (int) (byte) 1);
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
    public void test1861() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1861");
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
            ds.Ordenacao.selecao(itemArray1, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 2");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray1);
    }

    @Test
    public void test1862() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1862");
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
        ds.Ordenacao.heapsort(itemArray0, 1);
        org.junit.Assert.assertNotNull(itemArray0);
    }

    @Test
    public void test1863() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1863");
        ds.Item[] itemArray0 = new ds.Item[] {};
        ds.Ordenacao.heapsort(itemArray0, 0);
        ds.Ordenacao.heapsort(itemArray0, (-1));
        ds.Ordenacao.selecao(itemArray0, 1);
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
    public void test1864() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1864");
        ds.Item item0 = null;
        ds.Item[] itemArray1 = new ds.Item[] { item0 };
        ds.Ordenacao.heapsort(itemArray1, 0);
        ds.Ordenacao.heapsort(itemArray1, 1);
        ds.Ordenacao.heapsort(itemArray1, 1);
        ds.Ordenacao.selecao(itemArray1, (int) (short) 1);
        ds.Ordenacao.selecao(itemArray1, (-1));
        ds.Ordenacao.selecao(itemArray1, (-1));
        ds.Ordenacao.insercao(itemArray1, 0);
        ds.Ordenacao.heapsort(itemArray1, 0);
        ds.Ordenacao.heapsort(itemArray1, (int) (byte) -1);
        java.lang.Class<?> wildcardClass20 = itemArray1.getClass();
        org.junit.Assert.assertNotNull(itemArray1);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test1865() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1865");
        ds.Item item0 = null;
        ds.Item[] itemArray1 = new ds.Item[] { item0 };
        ds.Ordenacao.heapsort(itemArray1, 0);
        ds.Ordenacao.heapsort(itemArray1, 1);
        ds.Ordenacao.heapsort(itemArray1, 1);
        ds.Ordenacao.selecao(itemArray1, (int) (short) 1);
        ds.Ordenacao.selecao(itemArray1, (int) (short) 1);
        ds.Ordenacao.insercao(itemArray1, (int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            ds.Ordenacao.insercao(itemArray1, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray1);
    }

    @Test
    public void test1866() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1866");
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
    public void test1867() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1867");
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
    public void test1868() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1868");
        ds.Item[] itemArray0 = new ds.Item[] {};
        ds.Ordenacao.heapsort(itemArray0, 0);
        ds.Ordenacao.insercao(itemArray0, 0);
        ds.Ordenacao.selecao(itemArray0, 0);
        ds.Ordenacao.insercao(itemArray0, (-1));
        ds.Ordenacao.heapsort(itemArray0, (-1));
        ds.Ordenacao.selecao(itemArray0, 1);
        ds.Ordenacao.insercao(itemArray0, 0);
        ds.Ordenacao.insercao(itemArray0, (-1));
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
    public void test1869() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1869");
        ds.Item[] itemArray0 = new ds.Item[] {};
        ds.Ordenacao.heapsort(itemArray0, 0);
        ds.Ordenacao.insercao(itemArray0, 0);
        ds.Ordenacao.insercao(itemArray0, (int) (short) 0);
        ds.Ordenacao.selecao(itemArray0, 1);
        ds.Ordenacao.shellsort(itemArray0, (int) (short) 1);
        ds.Ordenacao.insercao(itemArray0, (int) (short) 1);
        ds.Ordenacao.selecao(itemArray0, 0);
        ds.Ordenacao.shellsort(itemArray0, (-1));
        ds.Ordenacao.insercao(itemArray0, (int) (byte) 1);
        ds.Ordenacao.heapsort(itemArray0, (int) (short) 1);
        java.lang.Class<?> wildcardClass21 = itemArray0.getClass();
        org.junit.Assert.assertNotNull(itemArray0);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test1870() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1870");
        ds.Item[] itemArray0 = new ds.Item[] {};
        ds.Ordenacao.heapsort(itemArray0, 0);
        ds.Ordenacao.insercao(itemArray0, 0);
        ds.Ordenacao.selecao(itemArray0, 0);
        ds.Ordenacao.insercao(itemArray0, (-1));
        ds.Ordenacao.insercao(itemArray0, (int) (byte) -1);
        ds.Ordenacao.heapsort(itemArray0, (int) (byte) -1);
        ds.Ordenacao.insercao(itemArray0, 0);
        ds.Ordenacao.shellsort(itemArray0, (int) (short) 0);
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
    public void test1871() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1871");
        ds.Item[] itemArray0 = null;
        // The following exception was thrown during execution in test generation
        try {
            ds.Ordenacao.insercao(itemArray0, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1872() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1872");
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
            ds.Ordenacao.selecao(itemArray0, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 2");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray0);
    }

    @Test
    public void test1873() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1873");
        ds.Item[] itemArray0 = new ds.Item[] {};
        ds.Ordenacao.heapsort(itemArray0, 0);
        ds.Ordenacao.insercao(itemArray0, 0);
        ds.Ordenacao.insercao(itemArray0, (int) (short) 0);
        ds.Ordenacao.selecao(itemArray0, 1);
        ds.Ordenacao.shellsort(itemArray0, (int) (short) 1);
        ds.Ordenacao.shellsort(itemArray0, 0);
        ds.Ordenacao.shellsort(itemArray0, (-1));
        ds.Ordenacao.selecao(itemArray0, 0);
        ds.Ordenacao.shellsort(itemArray0, 0);
        ds.Ordenacao.insercao(itemArray0, 1);
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
    public void test1874() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1874");
        ds.Item[] itemArray0 = new ds.Item[] {};
        ds.Ordenacao.heapsort(itemArray0, 0);
        ds.Ordenacao.insercao(itemArray0, 0);
        ds.Ordenacao.selecao(itemArray0, 0);
        ds.Ordenacao.insercao(itemArray0, (-1));
        ds.Ordenacao.heapsort(itemArray0, (-1));
        ds.Ordenacao.selecao(itemArray0, (int) (byte) -1);
        ds.Ordenacao.heapsort(itemArray0, (int) (short) -1);
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
    public void test1875() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1875");
        ds.Item[] itemArray0 = new ds.Item[] {};
        ds.Ordenacao.heapsort(itemArray0, 0);
        ds.Ordenacao.insercao(itemArray0, 0);
        ds.Ordenacao.insercao(itemArray0, (int) (short) 0);
        ds.Ordenacao.selecao(itemArray0, 1);
        ds.Ordenacao.shellsort(itemArray0, (int) (byte) -1);
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
    public void test1876() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1876");
        ds.Item[] itemArray0 = new ds.Item[] {};
        ds.Ordenacao.heapsort(itemArray0, 0);
        ds.Ordenacao.insercao(itemArray0, 0);
        ds.Ordenacao.shellsort(itemArray0, (-1));
        ds.Ordenacao.selecao(itemArray0, (int) (byte) 0);
        ds.Ordenacao.shellsort(itemArray0, 0);
        ds.Ordenacao.insercao(itemArray0, (-1));
        ds.Ordenacao.shellsort(itemArray0, 0);
        java.lang.Class<?> wildcardClass15 = itemArray0.getClass();
        org.junit.Assert.assertNotNull(itemArray0);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test1877() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1877");
        ds.Item[] itemArray0 = new ds.Item[] {};
        ds.Ordenacao.heapsort(itemArray0, 0);
        ds.Ordenacao.insercao(itemArray0, 0);
        ds.Ordenacao.selecao(itemArray0, 0);
        ds.Ordenacao.selecao(itemArray0, (int) (short) 0);
        ds.Ordenacao.heapsort(itemArray0, 1);
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
    public void test1878() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1878");
        ds.Item item0 = null;
        ds.Item[] itemArray1 = new ds.Item[] { item0 };
        ds.Ordenacao.heapsort(itemArray1, 0);
        ds.Ordenacao.heapsort(itemArray1, 1);
        ds.Ordenacao.heapsort(itemArray1, 1);
        ds.Ordenacao.selecao(itemArray1, (int) (short) 1);
        ds.Ordenacao.selecao(itemArray1, (int) (short) 1);
        ds.Ordenacao.insercao(itemArray1, 0);
        ds.Ordenacao.heapsort(itemArray1, (int) (short) 0);
        ds.Ordenacao.shellsort(itemArray1, (int) (short) 1);
        java.lang.Class<?> wildcardClass18 = itemArray1.getClass();
        org.junit.Assert.assertNotNull(itemArray1);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test1879() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1879");
        ds.Item[] itemArray0 = new ds.Item[] {};
        ds.Ordenacao.heapsort(itemArray0, 0);
        ds.Ordenacao.insercao(itemArray0, 0);
        ds.Ordenacao.insercao(itemArray0, (int) (short) 0);
        ds.Ordenacao.selecao(itemArray0, 1);
        ds.Ordenacao.shellsort(itemArray0, (int) (short) 1);
        ds.Ordenacao.insercao(itemArray0, (int) (short) 1);
        ds.Ordenacao.heapsort(itemArray0, (-1));
        ds.Ordenacao.shellsort(itemArray0, 0);
        ds.Ordenacao.shellsort(itemArray0, (int) (short) 0);
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
    public void test1880() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1880");
        ds.Item item0 = null;
        ds.Item[] itemArray1 = new ds.Item[] { item0 };
        ds.Ordenacao.heapsort(itemArray1, 0);
        ds.Ordenacao.heapsort(itemArray1, 1);
        ds.Ordenacao.shellsort(itemArray1, (int) (byte) 1);
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
    public void test1881() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1881");
        ds.Item item0 = null;
        ds.Item[] itemArray1 = new ds.Item[] { item0 };
        ds.Ordenacao.heapsort(itemArray1, 0);
        ds.Ordenacao.heapsort(itemArray1, 1);
        ds.Ordenacao.heapsort(itemArray1, 1);
        ds.Ordenacao.selecao(itemArray1, (int) (short) 1);
        ds.Ordenacao.selecao(itemArray1, 1);
        // The following exception was thrown during execution in test generation
        try {
            ds.Ordenacao.selecao(itemArray1, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 2");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray1);
    }

    @Test
    public void test1882() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1882");
        ds.Item[] itemArray0 = new ds.Item[] {};
        ds.Ordenacao.heapsort(itemArray0, 0);
        ds.Ordenacao.insercao(itemArray0, 0);
        ds.Ordenacao.selecao(itemArray0, 0);
        ds.Ordenacao.shellsort(itemArray0, (int) (byte) 1);
        ds.Ordenacao.insercao(itemArray0, 0);
        ds.Ordenacao.insercao(itemArray0, (int) (byte) 1);
        ds.Ordenacao.shellsort(itemArray0, (int) (short) -1);
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
    public void test1883() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1883");
        ds.Item[] itemArray0 = new ds.Item[] {};
        ds.Ordenacao.heapsort(itemArray0, 0);
        ds.Ordenacao.insercao(itemArray0, 0);
        ds.Ordenacao.shellsort(itemArray0, (-1));
        ds.Ordenacao.selecao(itemArray0, (-1));
        ds.Ordenacao.heapsort(itemArray0, (int) (short) 0);
        ds.Ordenacao.selecao(itemArray0, 1);
        ds.Ordenacao.heapsort(itemArray0, (int) (short) 1);
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
    public void test1884() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1884");
        ds.Item[] itemArray0 = new ds.Item[] {};
        ds.Ordenacao.heapsort(itemArray0, 0);
        ds.Ordenacao.insercao(itemArray0, 0);
        ds.Ordenacao.insercao(itemArray0, (int) (short) 0);
        ds.Ordenacao.selecao(itemArray0, 1);
        ds.Ordenacao.selecao(itemArray0, (int) (short) -1);
        ds.Ordenacao.insercao(itemArray0, 0);
        ds.Ordenacao.heapsort(itemArray0, (int) (short) -1);
        ds.Ordenacao.heapsort(itemArray0, (int) (byte) -1);
        ds.Ordenacao.selecao(itemArray0, 0);
        java.lang.Class<?> wildcardClass19 = itemArray0.getClass();
        org.junit.Assert.assertNotNull(itemArray0);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test1885() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1885");
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
    public void test1886() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1886");
        ds.Item[] itemArray0 = new ds.Item[] {};
        ds.Ordenacao.heapsort(itemArray0, 0);
        ds.Ordenacao.insercao(itemArray0, 0);
        ds.Ordenacao.selecao(itemArray0, 0);
        ds.Ordenacao.insercao(itemArray0, (-1));
        ds.Ordenacao.heapsort(itemArray0, (-1));
        ds.Ordenacao.insercao(itemArray0, 0);
        ds.Ordenacao.heapsort(itemArray0, (int) (short) 1);
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
    public void test1887() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1887");
        ds.Item[] itemArray0 = new ds.Item[] {};
        ds.Ordenacao.shellsort(itemArray0, (int) (short) 1);
        ds.Ordenacao.heapsort(itemArray0, 1);
        ds.Ordenacao.heapsort(itemArray0, (int) (byte) 1);
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
    public void test1888() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1888");
        ds.Item[] itemArray0 = new ds.Item[] {};
        ds.Ordenacao.shellsort(itemArray0, (int) (short) 1);
        ds.Ordenacao.selecao(itemArray0, 1);
        ds.Ordenacao.insercao(itemArray0, (int) (byte) 0);
        ds.Ordenacao.selecao(itemArray0, (int) (short) 0);
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
    public void test1889() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1889");
        ds.Item[] itemArray0 = new ds.Item[] {};
        ds.Ordenacao.heapsort(itemArray0, 0);
        ds.Ordenacao.insercao(itemArray0, 0);
        ds.Ordenacao.shellsort(itemArray0, (-1));
        ds.Ordenacao.insercao(itemArray0, (int) (byte) 1);
        ds.Ordenacao.selecao(itemArray0, 0);
        ds.Ordenacao.selecao(itemArray0, (int) (byte) -1);
        ds.Ordenacao.selecao(itemArray0, 0);
        ds.Ordenacao.insercao(itemArray0, (int) (byte) 1);
        ds.Ordenacao.selecao(itemArray0, (int) (byte) 0);
        ds.Ordenacao.shellsort(itemArray0, (int) (byte) 0);
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
    public void test1890() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1890");
        ds.Item[] itemArray0 = new ds.Item[] {};
        ds.Ordenacao.heapsort(itemArray0, 0);
        ds.Ordenacao.insercao(itemArray0, 0);
        ds.Ordenacao.insercao(itemArray0, (int) (short) 0);
        ds.Ordenacao.selecao(itemArray0, 1);
        ds.Ordenacao.selecao(itemArray0, (int) (short) -1);
        ds.Ordenacao.heapsort(itemArray0, (int) (short) 1);
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
    public void test1891() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1891");
        ds.Item[] itemArray0 = new ds.Item[] {};
        ds.Ordenacao.shellsort(itemArray0, 0);
        ds.Ordenacao.shellsort(itemArray0, (int) (byte) -1);
        ds.Ordenacao.selecao(itemArray0, (-1));
        ds.Ordenacao.selecao(itemArray0, (int) (byte) -1);
        ds.Ordenacao.insercao(itemArray0, (int) (short) -1);
        java.lang.Class<?> wildcardClass11 = itemArray0.getClass();
        org.junit.Assert.assertNotNull(itemArray0);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test1892() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1892");
        ds.Item[] itemArray0 = new ds.Item[] {};
        ds.Ordenacao.heapsort(itemArray0, 0);
        ds.Ordenacao.insercao(itemArray0, 0);
        ds.Ordenacao.insercao(itemArray0, (int) (byte) 0);
        ds.Ordenacao.shellsort(itemArray0, (int) (byte) 1);
        ds.Ordenacao.heapsort(itemArray0, 0);
        org.junit.Assert.assertNotNull(itemArray0);
    }

    @Test
    public void test1893() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1893");
        ds.Item[] itemArray0 = new ds.Item[] {};
        ds.Ordenacao.heapsort(itemArray0, 0);
        ds.Ordenacao.insercao(itemArray0, 0);
        ds.Ordenacao.selecao(itemArray0, 0);
        ds.Ordenacao.insercao(itemArray0, (-1));
        ds.Ordenacao.heapsort(itemArray0, (-1));
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
    public void test1894() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1894");
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
        ds.Ordenacao.insercao(itemArray0, (int) (byte) 0);
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
    public void test1895() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1895");
        ds.Item[] itemArray0 = new ds.Item[] {};
        ds.Ordenacao.heapsort(itemArray0, 0);
        ds.Ordenacao.heapsort(itemArray0, 0);
        ds.Ordenacao.shellsort(itemArray0, (int) (byte) 0);
        ds.Ordenacao.shellsort(itemArray0, (-1));
        org.junit.Assert.assertNotNull(itemArray0);
    }

    @Test
    public void test1896() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1896");
        ds.Item item0 = null;
        ds.Item[] itemArray1 = new ds.Item[] { item0 };
        ds.Ordenacao.selecao(itemArray1, (int) (short) 1);
        ds.Ordenacao.heapsort(itemArray1, 0);
        ds.Ordenacao.selecao(itemArray1, 0);
        ds.Ordenacao.heapsort(itemArray1, 1);
        // The following exception was thrown during execution in test generation
        try {
            ds.Ordenacao.selecao(itemArray1, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 2");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray1);
    }

    @Test
    public void test1897() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1897");
        ds.Item[] itemArray0 = new ds.Item[] {};
        ds.Ordenacao.heapsort(itemArray0, 0);
        ds.Ordenacao.insercao(itemArray0, 0);
        ds.Ordenacao.selecao(itemArray0, 0);
        ds.Ordenacao.shellsort(itemArray0, (int) (short) 1);
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
    public void test1898() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1898");
        ds.Item[] itemArray0 = new ds.Item[] {};
        ds.Ordenacao.heapsort(itemArray0, 0);
        ds.Ordenacao.insercao(itemArray0, 0);
        ds.Ordenacao.insercao(itemArray0, (int) (short) 0);
        ds.Ordenacao.selecao(itemArray0, 1);
        ds.Ordenacao.shellsort(itemArray0, (int) (short) 1);
        ds.Ordenacao.insercao(itemArray0, (int) (short) 1);
        ds.Ordenacao.heapsort(itemArray0, (-1));
        ds.Ordenacao.selecao(itemArray0, (int) (byte) 1);
        ds.Ordenacao.heapsort(itemArray0, (-1));
        java.lang.Class<?> wildcardClass19 = itemArray0.getClass();
        org.junit.Assert.assertNotNull(itemArray0);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test1899() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1899");
        ds.Item[] itemArray0 = new ds.Item[] {};
        ds.Ordenacao.heapsort(itemArray0, 0);
        ds.Ordenacao.insercao(itemArray0, 0);
        ds.Ordenacao.heapsort(itemArray0, 1);
        ds.Ordenacao.selecao(itemArray0, (int) (byte) 0);
        ds.Ordenacao.shellsort(itemArray0, 0);
        ds.Ordenacao.insercao(itemArray0, (int) (short) 1);
        java.lang.Class<?> wildcardClass13 = itemArray0.getClass();
        org.junit.Assert.assertNotNull(itemArray0);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test1900() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1900");
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
            ds.Ordenacao.heapsort(itemArray0, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray0);
    }

    @Test
    public void test1901() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1901");
        ds.Item[] itemArray0 = new ds.Item[] {};
        ds.Ordenacao.heapsort(itemArray0, 0);
        ds.Ordenacao.insercao(itemArray0, 0);
        ds.Ordenacao.insercao(itemArray0, (int) (short) 0);
        ds.Ordenacao.selecao(itemArray0, 1);
        ds.Ordenacao.selecao(itemArray0, (int) (short) -1);
        ds.Ordenacao.shellsort(itemArray0, (int) (short) 1);
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
    public void test1902() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1902");
        ds.Item[] itemArray0 = new ds.Item[] {};
        ds.Ordenacao.heapsort(itemArray0, 0);
        ds.Ordenacao.heapsort(itemArray0, (int) (byte) 0);
        ds.Ordenacao.shellsort(itemArray0, 0);
        ds.Ordenacao.insercao(itemArray0, (-1));
        ds.Ordenacao.insercao(itemArray0, 0);
        ds.Ordenacao.shellsort(itemArray0, 1);
        ds.Ordenacao.heapsort(itemArray0, (int) (short) -1);
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
    public void test1903() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1903");
        ds.Item[] itemArray0 = new ds.Item[] {};
        ds.Ordenacao.shellsort(itemArray0, (int) (short) 1);
        ds.Ordenacao.selecao(itemArray0, 1);
        ds.Ordenacao.selecao(itemArray0, (int) (byte) 1);
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
    public void test1904() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1904");
        ds.Item[] itemArray0 = new ds.Item[] {};
        ds.Ordenacao.heapsort(itemArray0, 0);
        ds.Ordenacao.insercao(itemArray0, 0);
        ds.Ordenacao.insercao(itemArray0, (int) (short) 0);
        ds.Ordenacao.selecao(itemArray0, 1);
        ds.Ordenacao.selecao(itemArray0, (int) (short) -1);
        ds.Ordenacao.insercao(itemArray0, 0);
        ds.Ordenacao.heapsort(itemArray0, (int) (short) -1);
        ds.Ordenacao.shellsort(itemArray0, (int) (short) 0);
        ds.Ordenacao.heapsort(itemArray0, (int) (short) 0);
        ds.Ordenacao.selecao(itemArray0, (int) (byte) 0);
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
    public void test1905() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1905");
        ds.Item[] itemArray0 = new ds.Item[] {};
        ds.Ordenacao.heapsort(itemArray0, 0);
        ds.Ordenacao.insercao(itemArray0, 0);
        ds.Ordenacao.insercao(itemArray0, (int) (short) 0);
        ds.Ordenacao.selecao(itemArray0, 1);
        ds.Ordenacao.selecao(itemArray0, (int) (short) -1);
        ds.Ordenacao.insercao(itemArray0, 0);
        ds.Ordenacao.heapsort(itemArray0, (int) (byte) 1);
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
    public void test1906() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1906");
        ds.Item item0 = null;
        ds.Item[] itemArray1 = new ds.Item[] { item0 };
        ds.Ordenacao.selecao(itemArray1, (int) (short) 1);
        ds.Ordenacao.heapsort(itemArray1, 0);
        ds.Ordenacao.heapsort(itemArray1, 0);
        ds.Ordenacao.insercao(itemArray1, 0);
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
    public void test1907() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1907");
        ds.Item[] itemArray0 = new ds.Item[] {};
        ds.Ordenacao.heapsort(itemArray0, 0);
        ds.Ordenacao.insercao(itemArray0, 0);
        ds.Ordenacao.insercao(itemArray0, (int) (short) 0);
        ds.Ordenacao.selecao(itemArray0, 1);
        ds.Ordenacao.shellsort(itemArray0, (int) (short) 1);
        ds.Ordenacao.insercao(itemArray0, (int) (short) 1);
        ds.Ordenacao.heapsort(itemArray0, (int) (short) 0);
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
    public void test1908() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1908");
        ds.Item[] itemArray0 = new ds.Item[] {};
        ds.Ordenacao.heapsort(itemArray0, 0);
        ds.Ordenacao.insercao(itemArray0, 0);
        ds.Ordenacao.shellsort(itemArray0, (-1));
        ds.Ordenacao.selecao(itemArray0, (-1));
        ds.Ordenacao.heapsort(itemArray0, (int) (short) 0);
        ds.Ordenacao.shellsort(itemArray0, 0);
        ds.Ordenacao.shellsort(itemArray0, (int) (byte) 0);
        ds.Ordenacao.shellsort(itemArray0, (-1));
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
    public void test1909() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1909");
        ds.Item[] itemArray0 = new ds.Item[] {};
        ds.Ordenacao.heapsort(itemArray0, 0);
        ds.Ordenacao.insercao(itemArray0, 0);
        ds.Ordenacao.selecao(itemArray0, 0);
        ds.Ordenacao.shellsort(itemArray0, (int) (short) 1);
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
    public void test1910() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1910");
        ds.Item item0 = null;
        ds.Item[] itemArray1 = new ds.Item[] { item0 };
        ds.Ordenacao.heapsort(itemArray1, 0);
        ds.Ordenacao.shellsort(itemArray1, (int) (byte) 0);
        ds.Ordenacao.heapsort(itemArray1, (-1));
        // The following exception was thrown during execution in test generation
        try {
            ds.Ordenacao.selecao(itemArray1, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 2");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray1);
    }

    @Test
    public void test1911() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1911");
        ds.Item[] itemArray0 = new ds.Item[] {};
        ds.Ordenacao.heapsort(itemArray0, 0);
        ds.Ordenacao.insercao(itemArray0, 0);
        ds.Ordenacao.shellsort(itemArray0, (-1));
        ds.Ordenacao.insercao(itemArray0, (int) (byte) 1);
        ds.Ordenacao.selecao(itemArray0, 0);
        ds.Ordenacao.insercao(itemArray0, (int) (short) 0);
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
    public void test1912() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1912");
        ds.Item[] itemArray0 = new ds.Item[] {};
        ds.Ordenacao.heapsort(itemArray0, 0);
        ds.Ordenacao.insercao(itemArray0, 0);
        ds.Ordenacao.insercao(itemArray0, (int) (short) 0);
        ds.Ordenacao.selecao(itemArray0, 1);
        ds.Ordenacao.shellsort(itemArray0, (int) (short) 1);
        ds.Ordenacao.insercao(itemArray0, (int) (short) 1);
        ds.Ordenacao.selecao(itemArray0, 0);
        ds.Ordenacao.insercao(itemArray0, (int) (short) 1);
        ds.Ordenacao.selecao(itemArray0, 1);
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
    public void test1913() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1913");
        ds.Item[] itemArray0 = null;
        // The following exception was thrown during execution in test generation
        try {
            ds.Ordenacao.heapsort(itemArray0, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1914() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1914");
        ds.Item[] itemArray0 = new ds.Item[] {};
        ds.Ordenacao.heapsort(itemArray0, 0);
        ds.Ordenacao.insercao(itemArray0, 0);
        ds.Ordenacao.selecao(itemArray0, 0);
        ds.Ordenacao.insercao(itemArray0, (-1));
        ds.Ordenacao.heapsort(itemArray0, (-1));
        ds.Ordenacao.selecao(itemArray0, 1);
        ds.Ordenacao.insercao(itemArray0, 0);
        ds.Ordenacao.heapsort(itemArray0, (int) (byte) 1);
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
    public void test1915() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1915");
        ds.Item[] itemArray0 = new ds.Item[] {};
        ds.Ordenacao.heapsort(itemArray0, 0);
        ds.Ordenacao.insercao(itemArray0, 0);
        ds.Ordenacao.selecao(itemArray0, 0);
        ds.Ordenacao.shellsort(itemArray0, (int) (short) 1);
        ds.Ordenacao.selecao(itemArray0, (int) (short) 0);
        ds.Ordenacao.heapsort(itemArray0, (-1));
        org.junit.Assert.assertNotNull(itemArray0);
    }

    @Test
    public void test1916() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1916");
        ds.Item item0 = null;
        ds.Item[] itemArray1 = new ds.Item[] { item0 };
        ds.Ordenacao.heapsort(itemArray1, 0);
        ds.Ordenacao.shellsort(itemArray1, (int) (byte) 0);
        ds.Ordenacao.shellsort(itemArray1, (int) (short) 1);
        ds.Ordenacao.selecao(itemArray1, (int) (short) -1);
        ds.Ordenacao.heapsort(itemArray1, 0);
        java.lang.Class<?> wildcardClass12 = itemArray1.getClass();
        org.junit.Assert.assertNotNull(itemArray1);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test1917() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1917");
        ds.Item[] itemArray0 = new ds.Item[] {};
        ds.Ordenacao.heapsort(itemArray0, 0);
        ds.Ordenacao.insercao(itemArray0, 0);
        ds.Ordenacao.shellsort(itemArray0, (-1));
        ds.Ordenacao.selecao(itemArray0, (-1));
        ds.Ordenacao.heapsort(itemArray0, (int) (short) 0);
        ds.Ordenacao.selecao(itemArray0, 1);
        ds.Ordenacao.heapsort(itemArray0, (int) (short) 1);
        ds.Ordenacao.heapsort(itemArray0, (int) (byte) -1);
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
    public void test1918() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1918");
        ds.Item[] itemArray0 = new ds.Item[] {};
        ds.Ordenacao.heapsort(itemArray0, 0);
        ds.Ordenacao.heapsort(itemArray0, (int) (byte) 0);
        ds.Ordenacao.shellsort(itemArray0, 0);
        ds.Ordenacao.insercao(itemArray0, (-1));
        ds.Ordenacao.selecao(itemArray0, 1);
        ds.Ordenacao.heapsort(itemArray0, (int) (byte) -1);
        ds.Ordenacao.heapsort(itemArray0, 0);
        org.junit.Assert.assertNotNull(itemArray0);
    }

    @Test
    public void test1919() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1919");
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
        ds.Ordenacao.shellsort(itemArray0, (int) (byte) 1);
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
    public void test1920() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1920");
        ds.Item[] itemArray0 = new ds.Item[] {};
        ds.Ordenacao.heapsort(itemArray0, 0);
        ds.Ordenacao.insercao(itemArray0, 0);
        ds.Ordenacao.shellsort(itemArray0, (-1));
        ds.Ordenacao.selecao(itemArray0, (-1));
        ds.Ordenacao.heapsort(itemArray0, 0);
        ds.Ordenacao.heapsort(itemArray0, (int) (byte) -1);
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
    public void test1921() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1921");
        ds.Item[] itemArray0 = new ds.Item[] {};
        ds.Ordenacao.heapsort(itemArray0, 0);
        ds.Ordenacao.insercao(itemArray0, 0);
        ds.Ordenacao.shellsort(itemArray0, (-1));
        ds.Ordenacao.insercao(itemArray0, (int) (byte) 0);
        ds.Ordenacao.heapsort(itemArray0, (int) (byte) -1);
        ds.Ordenacao.insercao(itemArray0, (int) (byte) 0);
        ds.Ordenacao.insercao(itemArray0, (-1));
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
    public void test1922() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1922");
        ds.Item[] itemArray0 = new ds.Item[] {};
        ds.Ordenacao.heapsort(itemArray0, 0);
        ds.Ordenacao.insercao(itemArray0, 0);
        ds.Ordenacao.insercao(itemArray0, (int) (short) 0);
        ds.Ordenacao.selecao(itemArray0, 1);
        ds.Ordenacao.selecao(itemArray0, 0);
        ds.Ordenacao.selecao(itemArray0, 0);
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
    public void test1923() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1923");
        ds.Item item0 = null;
        ds.Item[] itemArray1 = new ds.Item[] { item0 };
        ds.Ordenacao.heapsort(itemArray1, 0);
        ds.Ordenacao.selecao(itemArray1, 0);
        // The following exception was thrown during execution in test generation
        try {
            ds.Ordenacao.shellsort(itemArray1, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 41");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray1);
    }

    @Test
    public void test1924() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1924");
        ds.Item[] itemArray0 = new ds.Item[] {};
        ds.Ordenacao.heapsort(itemArray0, 0);
        ds.Ordenacao.heapsort(itemArray0, 0);
        ds.Ordenacao.shellsort(itemArray0, (int) (byte) 0);
        ds.Ordenacao.insercao(itemArray0, 0);
        ds.Ordenacao.heapsort(itemArray0, 1);
        ds.Ordenacao.heapsort(itemArray0, (int) (byte) 1);
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
    public void test1925() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1925");
        ds.Item[] itemArray0 = new ds.Item[] {};
        ds.Ordenacao.heapsort(itemArray0, 0);
        ds.Ordenacao.heapsort(itemArray0, (int) (byte) 0);
        ds.Ordenacao.shellsort(itemArray0, 0);
        ds.Ordenacao.heapsort(itemArray0, (int) (byte) -1);
        ds.Ordenacao.selecao(itemArray0, (int) (byte) 1);
        ds.Ordenacao.insercao(itemArray0, 0);
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
    public void test1926() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1926");
        ds.Item[] itemArray0 = new ds.Item[] {};
        ds.Ordenacao.heapsort(itemArray0, 0);
        ds.Ordenacao.insercao(itemArray0, 0);
        ds.Ordenacao.shellsort(itemArray0, (-1));
        ds.Ordenacao.selecao(itemArray0, (-1));
        ds.Ordenacao.heapsort(itemArray0, (int) (short) 0);
        ds.Ordenacao.heapsort(itemArray0, 0);
        ds.Ordenacao.insercao(itemArray0, (int) (short) 0);
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
    public void test1927() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1927");
        ds.Item[] itemArray0 = new ds.Item[] {};
        ds.Ordenacao.heapsort(itemArray0, 0);
        ds.Ordenacao.insercao(itemArray0, 0);
        ds.Ordenacao.insercao(itemArray0, (int) (short) 0);
        ds.Ordenacao.selecao(itemArray0, 1);
        ds.Ordenacao.shellsort(itemArray0, (int) (short) 1);
        ds.Ordenacao.shellsort(itemArray0, (int) (short) -1);
        ds.Ordenacao.insercao(itemArray0, (int) (short) 0);
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
    public void test1928() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1928");
        ds.Item[] itemArray0 = new ds.Item[] {};
        ds.Ordenacao.heapsort(itemArray0, 0);
        ds.Ordenacao.insercao(itemArray0, 0);
        ds.Ordenacao.insercao(itemArray0, (int) (short) 0);
        ds.Ordenacao.selecao(itemArray0, 1);
        ds.Ordenacao.selecao(itemArray0, (int) (short) -1);
        ds.Ordenacao.insercao(itemArray0, 0);
        ds.Ordenacao.heapsort(itemArray0, (int) (short) -1);
        ds.Ordenacao.heapsort(itemArray0, (int) (byte) -1);
        ds.Ordenacao.shellsort(itemArray0, (-1));
        ds.Ordenacao.heapsort(itemArray0, (int) (short) -1);
        org.junit.Assert.assertNotNull(itemArray0);
    }

    @Test
    public void test1929() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1929");
        ds.Item[] itemArray0 = new ds.Item[] {};
        ds.Ordenacao.heapsort(itemArray0, 0);
        ds.Ordenacao.insercao(itemArray0, 0);
        ds.Ordenacao.shellsort(itemArray0, (-1));
        ds.Ordenacao.insercao(itemArray0, (int) (byte) 1);
        ds.Ordenacao.selecao(itemArray0, 0);
        ds.Ordenacao.shellsort(itemArray0, 1);
        ds.Ordenacao.insercao(itemArray0, (-1));
        ds.Ordenacao.insercao(itemArray0, (int) (byte) 0);
        ds.Ordenacao.shellsort(itemArray0, 0);
        ds.Ordenacao.selecao(itemArray0, 0);
        ds.Ordenacao.heapsort(itemArray0, 0);
        org.junit.Assert.assertNotNull(itemArray0);
    }

    @Test
    public void test1930() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1930");
        ds.Item[] itemArray0 = new ds.Item[] {};
        ds.Ordenacao.heapsort(itemArray0, 0);
        ds.Ordenacao.insercao(itemArray0, 0);
        ds.Ordenacao.insercao(itemArray0, (int) (short) 0);
        ds.Ordenacao.selecao(itemArray0, 1);
        ds.Ordenacao.insercao(itemArray0, 1);
        ds.Ordenacao.insercao(itemArray0, (int) (short) 1);
        org.junit.Assert.assertNotNull(itemArray0);
    }

    @Test
    public void test1931() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1931");
        ds.Item[] itemArray0 = new ds.Item[] {};
        ds.Ordenacao.heapsort(itemArray0, 0);
        ds.Ordenacao.insercao(itemArray0, 0);
        ds.Ordenacao.shellsort(itemArray0, (-1));
        ds.Ordenacao.insercao(itemArray0, (int) (byte) 1);
        ds.Ordenacao.selecao(itemArray0, 0);
        ds.Ordenacao.insercao(itemArray0, 0);
        ds.Ordenacao.selecao(itemArray0, (int) (short) -1);
        ds.Ordenacao.insercao(itemArray0, (int) (byte) 0);
        org.junit.Assert.assertNotNull(itemArray0);
    }

    @Test
    public void test1932() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1932");
        ds.Item[] itemArray0 = new ds.Item[] {};
        ds.Ordenacao.heapsort(itemArray0, 0);
        ds.Ordenacao.insercao(itemArray0, 0);
        ds.Ordenacao.selecao(itemArray0, 0);
        ds.Ordenacao.insercao(itemArray0, (-1));
        ds.Ordenacao.heapsort(itemArray0, (-1));
        ds.Ordenacao.selecao(itemArray0, 1);
        ds.Ordenacao.insercao(itemArray0, 0);
        ds.Ordenacao.insercao(itemArray0, (-1));
        ds.Ordenacao.selecao(itemArray0, 0);
        org.junit.Assert.assertNotNull(itemArray0);
    }

    @Test
    public void test1933() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1933");
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
        ds.Ordenacao.heapsort(itemArray0, (int) (byte) -1);
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
    public void test1934() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1934");
        ds.Item[] itemArray0 = new ds.Item[] {};
        ds.Ordenacao.heapsort(itemArray0, 0);
        ds.Ordenacao.insercao(itemArray0, 0);
        ds.Ordenacao.selecao(itemArray0, 0);
        ds.Ordenacao.shellsort(itemArray0, (int) (byte) 1);
        ds.Ordenacao.selecao(itemArray0, 0);
        ds.Ordenacao.selecao(itemArray0, (int) (byte) -1);
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
    public void test1935() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1935");
        ds.Item[] itemArray0 = new ds.Item[] {};
        ds.Ordenacao.heapsort(itemArray0, 0);
        ds.Ordenacao.insercao(itemArray0, 0);
        ds.Ordenacao.insercao(itemArray0, (int) (short) 0);
        ds.Ordenacao.selecao(itemArray0, 1);
        ds.Ordenacao.shellsort(itemArray0, (int) (short) 1);
        ds.Ordenacao.insercao(itemArray0, (int) (byte) -1);
        ds.Ordenacao.heapsort(itemArray0, (-1));
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
    public void test1936() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1936");
        ds.Item[] itemArray0 = new ds.Item[] {};
        ds.Ordenacao.heapsort(itemArray0, 0);
        ds.Ordenacao.insercao(itemArray0, 0);
        ds.Ordenacao.selecao(itemArray0, 0);
        ds.Ordenacao.shellsort(itemArray0, 0);
        ds.Ordenacao.shellsort(itemArray0, (int) (byte) -1);
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
    public void test1937() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1937");
        ds.Item[] itemArray0 = null;
        ds.Ordenacao.shellsort(itemArray0, 0);
    }

    @Test
    public void test1938() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1938");
        ds.Item[] itemArray0 = new ds.Item[] {};
        ds.Ordenacao.shellsort(itemArray0, (int) (short) 1);
        ds.Ordenacao.selecao(itemArray0, 1);
        ds.Ordenacao.insercao(itemArray0, (int) (byte) 0);
        ds.Ordenacao.selecao(itemArray0, (int) (short) 0);
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
    public void test1939() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1939");
        ds.Item[] itemArray0 = new ds.Item[] {};
        ds.Ordenacao.heapsort(itemArray0, 0);
        ds.Ordenacao.insercao(itemArray0, 0);
        ds.Ordenacao.shellsort(itemArray0, (-1));
        ds.Ordenacao.selecao(itemArray0, 0);
        ds.Ordenacao.selecao(itemArray0, (int) (byte) 1);
        ds.Ordenacao.insercao(itemArray0, (-1));
        ds.Ordenacao.insercao(itemArray0, (int) (byte) -1);
        ds.Ordenacao.shellsort(itemArray0, (int) (short) -1);
        org.junit.Assert.assertNotNull(itemArray0);
    }

    @Test
    public void test1940() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1940");
        ds.Item[] itemArray0 = new ds.Item[] {};
        ds.Ordenacao.heapsort(itemArray0, 0);
        ds.Ordenacao.insercao(itemArray0, 0);
        ds.Ordenacao.shellsort(itemArray0, (-1));
        ds.Ordenacao.insercao(itemArray0, (int) (byte) 0);
        ds.Ordenacao.heapsort(itemArray0, (int) (byte) -1);
        ds.Ordenacao.insercao(itemArray0, (int) (byte) 0);
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
    public void test1941() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1941");
        ds.Item item0 = null;
        ds.Item[] itemArray1 = new ds.Item[] { item0 };
        ds.Ordenacao.heapsort(itemArray1, 0);
        ds.Ordenacao.heapsort(itemArray1, 1);
        ds.Ordenacao.heapsort(itemArray1, 1);
        ds.Ordenacao.selecao(itemArray1, (int) (short) 1);
        ds.Ordenacao.selecao(itemArray1, (-1));
        ds.Ordenacao.selecao(itemArray1, (-1));
        ds.Ordenacao.shellsort(itemArray1, (int) (byte) -1);
        ds.Ordenacao.selecao(itemArray1, 0);
        org.junit.Assert.assertNotNull(itemArray1);
    }

    @Test
    public void test1942() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1942");
        ds.Item[] itemArray0 = new ds.Item[] {};
        ds.Ordenacao.heapsort(itemArray0, 0);
        ds.Ordenacao.insercao(itemArray0, 0);
        ds.Ordenacao.shellsort(itemArray0, (-1));
        ds.Ordenacao.selecao(itemArray0, (-1));
        ds.Ordenacao.shellsort(itemArray0, (int) (byte) 0);
        ds.Ordenacao.insercao(itemArray0, (int) (short) -1);
        ds.Ordenacao.insercao(itemArray0, (int) (byte) -1);
        ds.Ordenacao.insercao(itemArray0, (-1));
        org.junit.Assert.assertNotNull(itemArray0);
    }

    @Test
    public void test1943() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1943");
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
        java.lang.Class<?> wildcardClass21 = itemArray0.getClass();
        org.junit.Assert.assertNotNull(itemArray0);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test1944() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1944");
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
        java.lang.Class<?> wildcardClass19 = itemArray0.getClass();
        org.junit.Assert.assertNotNull(itemArray0);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test1945() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1945");
        ds.Item[] itemArray0 = new ds.Item[] {};
        ds.Ordenacao.heapsort(itemArray0, 0);
        ds.Ordenacao.insercao(itemArray0, 0);
        ds.Ordenacao.shellsort(itemArray0, (-1));
        ds.Ordenacao.insercao(itemArray0, (int) (byte) 0);
        ds.Ordenacao.heapsort(itemArray0, (int) (byte) -1);
        ds.Ordenacao.insercao(itemArray0, (int) (byte) 0);
        ds.Ordenacao.shellsort(itemArray0, (int) (byte) 1);
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
    public void test1946() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1946");
        ds.Item[] itemArray0 = new ds.Item[] {};
        ds.Ordenacao.heapsort(itemArray0, 0);
        ds.Ordenacao.insercao(itemArray0, 0);
        ds.Ordenacao.shellsort(itemArray0, (-1));
        ds.Ordenacao.selecao(itemArray0, (-1));
        ds.Ordenacao.heapsort(itemArray0, (int) (short) 0);
        ds.Ordenacao.heapsort(itemArray0, 0);
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
    public void test1947() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1947");
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
            ds.Ordenacao.quicksort(itemArray0, (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 0");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray0);
    }

    @Test
    public void test1948() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1948");
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
        ds.Ordenacao.shellsort(itemArray0, 0);
        ds.Ordenacao.selecao(itemArray0, (int) (short) 1);
        ds.Ordenacao.heapsort(itemArray0, (-1));
        org.junit.Assert.assertNotNull(itemArray0);
    }

    @Test
    public void test1949() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1949");
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
        ds.Ordenacao.heapsort(itemArray0, 0);
        ds.Ordenacao.shellsort(itemArray0, (int) (byte) 1);
        org.junit.Assert.assertNotNull(itemArray0);
    }

    @Test
    public void test1950() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1950");
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
            ds.Ordenacao.quicksort(itemArray0, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 50");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray0);
    }

    @Test
    public void test1951() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1951");
        ds.Item[] itemArray0 = new ds.Item[] {};
        ds.Ordenacao.heapsort(itemArray0, 0);
        ds.Ordenacao.insercao(itemArray0, 0);
        ds.Ordenacao.selecao(itemArray0, 0);
        ds.Ordenacao.shellsort(itemArray0, (int) (byte) 1);
        ds.Ordenacao.insercao(itemArray0, 0);
        ds.Ordenacao.insercao(itemArray0, (int) (short) -1);
        ds.Ordenacao.shellsort(itemArray0, (int) (short) 1);
        ds.Ordenacao.selecao(itemArray0, (int) (byte) -1);
        java.lang.Class<?> wildcardClass17 = itemArray0.getClass();
        org.junit.Assert.assertNotNull(itemArray0);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test1952() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1952");
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
        ds.Ordenacao.heapsort(itemArray0, 0);
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
    public void test1953() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1953");
        ds.Item[] itemArray0 = new ds.Item[] {};
        ds.Ordenacao.heapsort(itemArray0, 0);
        ds.Ordenacao.insercao(itemArray0, 0);
        ds.Ordenacao.shellsort(itemArray0, (-1));
        ds.Ordenacao.selecao(itemArray0, (-1));
        ds.Ordenacao.heapsort(itemArray0, (int) (short) 0);
        ds.Ordenacao.shellsort(itemArray0, 0);
        ds.Ordenacao.shellsort(itemArray0, (int) (byte) 0);
        ds.Ordenacao.shellsort(itemArray0, (-1));
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
    public void test1954() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1954");
        ds.Item[] itemArray0 = new ds.Item[] {};
        ds.Ordenacao.heapsort(itemArray0, 0);
        ds.Ordenacao.insercao(itemArray0, 0);
        ds.Ordenacao.insercao(itemArray0, (int) (short) 0);
        ds.Ordenacao.selecao(itemArray0, 1);
        ds.Ordenacao.selecao(itemArray0, (int) (short) -1);
        ds.Ordenacao.insercao(itemArray0, 0);
        ds.Ordenacao.heapsort(itemArray0, (int) (byte) 1);
        ds.Ordenacao.shellsort(itemArray0, 0);
        ds.Ordenacao.heapsort(itemArray0, (int) (byte) 0);
        java.lang.Class<?> wildcardClass19 = itemArray0.getClass();
        org.junit.Assert.assertNotNull(itemArray0);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test1955() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1955");
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
        ds.Ordenacao.selecao(itemArray0, (int) (byte) 0);
        ds.Ordenacao.shellsort(itemArray0, (int) (short) 0);
        org.junit.Assert.assertNotNull(itemArray0);
    }

    @Test
    public void test1956() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1956");
        ds.Item[] itemArray0 = new ds.Item[] {};
        ds.Ordenacao.heapsort(itemArray0, 0);
        ds.Ordenacao.insercao(itemArray0, 0);
        ds.Ordenacao.shellsort(itemArray0, (-1));
        ds.Ordenacao.insercao(itemArray0, (int) (byte) 1);
        ds.Ordenacao.selecao(itemArray0, 0);
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
    public void test1957() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1957");
        ds.Item[] itemArray0 = new ds.Item[] {};
        ds.Ordenacao.heapsort(itemArray0, 0);
        ds.Ordenacao.insercao(itemArray0, 0);
        ds.Ordenacao.insercao(itemArray0, 0);
        ds.Ordenacao.selecao(itemArray0, (int) (short) -1);
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
    public void test1958() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1958");
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
        ds.Ordenacao.shellsort(itemArray0, (int) (byte) 0);
        org.junit.Assert.assertNotNull(itemArray0);
    }

    @Test
    public void test1959() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1959");
        ds.Item[] itemArray0 = new ds.Item[] {};
        ds.Ordenacao.heapsort(itemArray0, 0);
        ds.Ordenacao.insercao(itemArray0, 0);
        ds.Ordenacao.shellsort(itemArray0, (-1));
        ds.Ordenacao.selecao(itemArray0, (-1));
        ds.Ordenacao.heapsort(itemArray0, (int) (short) 0);
        ds.Ordenacao.heapsort(itemArray0, (int) (short) 1);
        ds.Ordenacao.heapsort(itemArray0, (int) (byte) 0);
        java.lang.Class<?> wildcardClass15 = itemArray0.getClass();
        org.junit.Assert.assertNotNull(itemArray0);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test1960() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1960");
        ds.Item item0 = null;
        ds.Item[] itemArray1 = new ds.Item[] { item0 };
        ds.Ordenacao.heapsort(itemArray1, 0);
        ds.Ordenacao.heapsort(itemArray1, 1);
        ds.Ordenacao.heapsort(itemArray1, 1);
        ds.Ordenacao.selecao(itemArray1, (int) (short) 1);
        ds.Ordenacao.selecao(itemArray1, 1);
        ds.Ordenacao.insercao(itemArray1, (int) (short) 1);
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
    public void test1961() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1961");
        ds.Item[] itemArray0 = new ds.Item[] {};
        ds.Ordenacao.heapsort(itemArray0, 0);
        ds.Ordenacao.insercao(itemArray0, 0);
        ds.Ordenacao.selecao(itemArray0, 0);
        ds.Ordenacao.insercao(itemArray0, (-1));
        ds.Ordenacao.insercao(itemArray0, (int) (byte) -1);
        ds.Ordenacao.selecao(itemArray0, (int) (byte) 1);
        org.junit.Assert.assertNotNull(itemArray0);
    }

    @Test
    public void test1962() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1962");
        ds.Item[] itemArray0 = new ds.Item[] {};
        ds.Ordenacao.heapsort(itemArray0, 0);
        ds.Ordenacao.insercao(itemArray0, 0);
        ds.Ordenacao.insercao(itemArray0, (int) (short) 0);
        ds.Ordenacao.selecao(itemArray0, 1);
        ds.Ordenacao.selecao(itemArray0, (int) (short) -1);
        ds.Ordenacao.shellsort(itemArray0, (int) (short) -1);
        ds.Ordenacao.heapsort(itemArray0, (int) (short) 1);
        java.lang.Class<?> wildcardClass15 = itemArray0.getClass();
        org.junit.Assert.assertNotNull(itemArray0);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test1963() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1963");
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
        ds.Ordenacao.insercao(itemArray0, 0);
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
    public void test1964() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1964");
        ds.Item item0 = null;
        ds.Item[] itemArray1 = new ds.Item[] { item0 };
        ds.Ordenacao.heapsort(itemArray1, 0);
        ds.Ordenacao.heapsort(itemArray1, 1);
        ds.Ordenacao.heapsort(itemArray1, 1);
        ds.Ordenacao.selecao(itemArray1, (int) (short) 1);
        ds.Ordenacao.selecao(itemArray1, (int) (short) 1);
        ds.Ordenacao.insercao(itemArray1, 0);
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
    public void test1965() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1965");
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
        ds.Ordenacao.shellsort(itemArray0, (int) (short) 1);
        org.junit.Assert.assertNotNull(itemArray0);
    }

    @Test
    public void test1966() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1966");
        ds.Item[] itemArray0 = new ds.Item[] {};
        ds.Ordenacao.heapsort(itemArray0, 0);
        ds.Ordenacao.heapsort(itemArray0, (int) (byte) 0);
        ds.Ordenacao.shellsort(itemArray0, 0);
        ds.Ordenacao.heapsort(itemArray0, (int) (byte) -1);
        ds.Ordenacao.selecao(itemArray0, (int) (short) 0);
        ds.Ordenacao.selecao(itemArray0, (int) (byte) 0);
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
    public void test1967() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1967");
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
            ds.Ordenacao.heapsort(itemArray0, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray0);
    }

    @Test
    public void test1968() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1968");
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
        java.lang.Class<?> wildcardClass19 = itemArray0.getClass();
        org.junit.Assert.assertNotNull(itemArray0);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test1969() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1969");
        ds.Item[] itemArray0 = new ds.Item[] {};
        ds.Ordenacao.heapsort(itemArray0, 0);
        ds.Ordenacao.insercao(itemArray0, 0);
        ds.Ordenacao.insercao(itemArray0, (int) (short) 0);
        ds.Ordenacao.selecao(itemArray0, 1);
        ds.Ordenacao.shellsort(itemArray0, (int) (short) 1);
        ds.Ordenacao.insercao(itemArray0, (int) (byte) -1);
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
    public void test1970() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1970");
        ds.Item[] itemArray0 = new ds.Item[] {};
        ds.Ordenacao.heapsort(itemArray0, 0);
        ds.Ordenacao.insercao(itemArray0, 0);
        ds.Ordenacao.selecao(itemArray0, 0);
        ds.Ordenacao.insercao(itemArray0, (-1));
        ds.Ordenacao.insercao(itemArray0, (int) (byte) -1);
        ds.Ordenacao.heapsort(itemArray0, (int) (short) 1);
        ds.Ordenacao.insercao(itemArray0, 1);
        org.junit.Assert.assertNotNull(itemArray0);
    }

    @Test
    public void test1971() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1971");
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
        ds.Ordenacao.shellsort(itemArray0, (int) (short) -1);
        org.junit.Assert.assertNotNull(itemArray0);
    }

    @Test
    public void test1972() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1972");
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
        ds.Ordenacao.shellsort(itemArray0, (int) (short) 0);
        org.junit.Assert.assertNotNull(itemArray0);
    }

    @Test
    public void test1973() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1973");
        ds.Item[] itemArray0 = new ds.Item[] {};
        ds.Ordenacao.heapsort(itemArray0, 0);
        ds.Ordenacao.insercao(itemArray0, 0);
        ds.Ordenacao.shellsort(itemArray0, (-1));
        ds.Ordenacao.shellsort(itemArray0, (int) (byte) -1);
        ds.Ordenacao.selecao(itemArray0, (int) (byte) -1);
        ds.Ordenacao.shellsort(itemArray0, 0);
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
    public void test1974() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1974");
        ds.Item[] itemArray0 = new ds.Item[] {};
        ds.Ordenacao.heapsort(itemArray0, 0);
        ds.Ordenacao.insercao(itemArray0, 0);
        ds.Ordenacao.selecao(itemArray0, 0);
        ds.Ordenacao.insercao(itemArray0, (-1));
        ds.Ordenacao.heapsort(itemArray0, (-1));
        ds.Ordenacao.insercao(itemArray0, 0);
        ds.Ordenacao.selecao(itemArray0, (int) (byte) -1);
        ds.Ordenacao.heapsort(itemArray0, 1);
        ds.Ordenacao.heapsort(itemArray0, (int) (byte) -1);
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
    public void test1975() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1975");
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
            ds.Ordenacao.heapsort(itemArray0, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray0);
    }

    @Test
    public void test1976() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1976");
        ds.Item[] itemArray0 = new ds.Item[] {};
        ds.Ordenacao.heapsort(itemArray0, 0);
        ds.Ordenacao.insercao(itemArray0, 0);
        ds.Ordenacao.shellsort(itemArray0, (-1));
        ds.Ordenacao.insercao(itemArray0, (int) (byte) 0);
        ds.Ordenacao.heapsort(itemArray0, (int) (byte) -1);
        ds.Ordenacao.insercao(itemArray0, (int) (byte) 0);
        ds.Ordenacao.selecao(itemArray0, 0);
        org.junit.Assert.assertNotNull(itemArray0);
    }

    @Test
    public void test1977() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1977");
        ds.Item[] itemArray0 = new ds.Item[] {};
        ds.Ordenacao.heapsort(itemArray0, 0);
        ds.Ordenacao.insercao(itemArray0, 0);
        ds.Ordenacao.insercao(itemArray0, (int) (short) 0);
        ds.Ordenacao.selecao(itemArray0, 1);
        ds.Ordenacao.shellsort(itemArray0, (int) (short) 1);
        ds.Ordenacao.shellsort(itemArray0, 0);
        ds.Ordenacao.shellsort(itemArray0, (-1));
        ds.Ordenacao.selecao(itemArray0, 0);
        ds.Ordenacao.shellsort(itemArray0, 0);
        ds.Ordenacao.insercao(itemArray0, 1);
        ds.Ordenacao.selecao(itemArray0, 0);
        org.junit.Assert.assertNotNull(itemArray0);
    }

    @Test
    public void test1978() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1978");
        ds.Item[] itemArray0 = new ds.Item[] {};
        ds.Ordenacao.heapsort(itemArray0, 0);
        ds.Ordenacao.insercao(itemArray0, 0);
        ds.Ordenacao.insercao(itemArray0, (int) (short) 0);
        ds.Ordenacao.selecao(itemArray0, 1);
        ds.Ordenacao.shellsort(itemArray0, (int) (short) 1);
        ds.Ordenacao.insercao(itemArray0, (int) (short) 1);
        ds.Ordenacao.heapsort(itemArray0, (-1));
        ds.Ordenacao.selecao(itemArray0, (int) (byte) 1);
        ds.Ordenacao.heapsort(itemArray0, (int) (short) -1);
        ds.Ordenacao.shellsort(itemArray0, (int) (byte) 1);
        org.junit.Assert.assertNotNull(itemArray0);
    }

    @Test
    public void test1979() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1979");
        ds.Item item0 = null;
        ds.Item[] itemArray1 = new ds.Item[] { item0 };
        ds.Ordenacao.heapsort(itemArray1, 0);
        ds.Ordenacao.heapsort(itemArray1, 1);
        ds.Ordenacao.heapsort(itemArray1, 1);
        ds.Ordenacao.selecao(itemArray1, (int) (short) 1);
        ds.Ordenacao.selecao(itemArray1, (int) (short) 1);
        ds.Ordenacao.insercao(itemArray1, 0);
        ds.Ordenacao.shellsort(itemArray1, 0);
        org.junit.Assert.assertNotNull(itemArray1);
    }

    @Test
    public void test1980() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1980");
        ds.Item[] itemArray0 = new ds.Item[] {};
        ds.Ordenacao.heapsort(itemArray0, 0);
        ds.Ordenacao.heapsort(itemArray0, 0);
        ds.Ordenacao.shellsort(itemArray0, (int) (byte) 0);
        ds.Ordenacao.selecao(itemArray0, (int) (short) -1);
        ds.Ordenacao.shellsort(itemArray0, (int) (byte) 1);
        ds.Ordenacao.heapsort(itemArray0, (int) (short) -1);
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
    public void test1981() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1981");
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
        ds.Ordenacao.insercao(itemArray0, (int) (short) -1);
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
    public void test1982() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1982");
        ds.Item[] itemArray0 = new ds.Item[] {};
        ds.Ordenacao.heapsort(itemArray0, 0);
        ds.Ordenacao.insercao(itemArray0, 0);
        ds.Ordenacao.selecao(itemArray0, 0);
        ds.Ordenacao.insercao(itemArray0, (-1));
        ds.Ordenacao.insercao(itemArray0, (int) (byte) -1);
        ds.Ordenacao.heapsort(itemArray0, (int) (byte) -1);
        ds.Ordenacao.insercao(itemArray0, 0);
        ds.Ordenacao.insercao(itemArray0, 0);
        ds.Ordenacao.heapsort(itemArray0, (int) (short) 1);
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
    public void test1983() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1983");
        ds.Item[] itemArray0 = new ds.Item[] {};
        ds.Ordenacao.heapsort(itemArray0, 0);
        ds.Ordenacao.insercao(itemArray0, 0);
        ds.Ordenacao.insercao(itemArray0, (int) (short) 0);
        ds.Ordenacao.selecao(itemArray0, 1);
        ds.Ordenacao.selecao(itemArray0, 0);
        ds.Ordenacao.selecao(itemArray0, 0);
        ds.Ordenacao.shellsort(itemArray0, 1);
        ds.Ordenacao.shellsort(itemArray0, 1);
        ds.Ordenacao.heapsort(itemArray0, 0);
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
    public void test1984() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1984");
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
    public void test1985() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1985");
        ds.Item[] itemArray0 = new ds.Item[] {};
        ds.Ordenacao.heapsort(itemArray0, 0);
        ds.Ordenacao.insercao(itemArray0, 0);
        ds.Ordenacao.selecao(itemArray0, 0);
        ds.Ordenacao.insercao(itemArray0, (-1));
        ds.Ordenacao.heapsort(itemArray0, 1);
        ds.Ordenacao.selecao(itemArray0, (int) (short) -1);
        ds.Ordenacao.shellsort(itemArray0, (int) (short) 1);
        ds.Ordenacao.shellsort(itemArray0, (int) (short) -1);
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
    public void test1986() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1986");
        ds.Item[] itemArray0 = new ds.Item[] {};
        ds.Ordenacao.heapsort(itemArray0, 0);
        ds.Ordenacao.insercao(itemArray0, 0);
        ds.Ordenacao.shellsort(itemArray0, (-1));
        ds.Ordenacao.insercao(itemArray0, (int) (byte) 1);
        ds.Ordenacao.insercao(itemArray0, (int) (byte) 0);
        ds.Ordenacao.selecao(itemArray0, (int) (short) -1);
        ds.Ordenacao.insercao(itemArray0, (int) (short) -1);
        ds.Ordenacao.heapsort(itemArray0, (int) (short) 0);
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
    public void test1987() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1987");
        ds.Item item0 = null;
        ds.Item[] itemArray1 = new ds.Item[] { item0 };
        ds.Ordenacao.heapsort(itemArray1, 0);
        ds.Ordenacao.heapsort(itemArray1, 1);
        ds.Ordenacao.shellsort(itemArray1, (-1));
        ds.Ordenacao.insercao(itemArray1, (-1));
        // The following exception was thrown during execution in test generation
        try {
            ds.Ordenacao.shellsort(itemArray1, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 41");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray1);
    }

    @Test
    public void test1988() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1988");
        ds.Item item0 = null;
        ds.Item[] itemArray1 = new ds.Item[] { item0 };
        ds.Ordenacao.heapsort(itemArray1, 0);
        ds.Ordenacao.heapsort(itemArray1, 1);
        ds.Ordenacao.heapsort(itemArray1, 1);
        ds.Ordenacao.selecao(itemArray1, (int) (short) 1);
        ds.Ordenacao.selecao(itemArray1, (int) (short) 1);
        ds.Ordenacao.selecao(itemArray1, (int) (short) 0);
        org.junit.Assert.assertNotNull(itemArray1);
    }

    @Test
    public void test1989() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1989");
        ds.Item[] itemArray0 = new ds.Item[] {};
        ds.Ordenacao.heapsort(itemArray0, 0);
        ds.Ordenacao.insercao(itemArray0, 0);
        ds.Ordenacao.insercao(itemArray0, (int) (byte) 0);
        ds.Ordenacao.selecao(itemArray0, (int) (byte) 0);
        ds.Ordenacao.shellsort(itemArray0, (int) (short) -1);
        ds.Ordenacao.heapsort(itemArray0, (-1));
        org.junit.Assert.assertNotNull(itemArray0);
    }

    @Test
    public void test1990() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1990");
        ds.Item[] itemArray0 = new ds.Item[] {};
        ds.Ordenacao.heapsort(itemArray0, 0);
        ds.Ordenacao.insercao(itemArray0, 0);
        ds.Ordenacao.shellsort(itemArray0, (-1));
        ds.Ordenacao.selecao(itemArray0, (int) (byte) 0);
        ds.Ordenacao.insercao(itemArray0, (int) (byte) 0);
        ds.Ordenacao.shellsort(itemArray0, 0);
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
    public void test1991() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1991");
        ds.Item[] itemArray0 = null;
        // The following exception was thrown during execution in test generation
        try {
            ds.Ordenacao.selecao(itemArray0, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1992() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1992");
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
    public void test1993() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1993");
        ds.Item[] itemArray0 = new ds.Item[] {};
        ds.Ordenacao.heapsort(itemArray0, 0);
        ds.Ordenacao.heapsort(itemArray0, (int) (byte) 0);
        ds.Ordenacao.shellsort(itemArray0, 0);
        ds.Ordenacao.insercao(itemArray0, (-1));
        ds.Ordenacao.heapsort(itemArray0, (int) (byte) -1);
        java.lang.Class<?> wildcardClass11 = itemArray0.getClass();
        org.junit.Assert.assertNotNull(itemArray0);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test1994() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1994");
        ds.Item item0 = null;
        ds.Item[] itemArray1 = new ds.Item[] { item0 };
        ds.Ordenacao.heapsort(itemArray1, 0);
        ds.Ordenacao.heapsort(itemArray1, 1);
        ds.Ordenacao.shellsort(itemArray1, (-1));
        ds.Ordenacao.selecao(itemArray1, (int) (byte) -1);
        ds.Ordenacao.heapsort(itemArray1, (int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            ds.Ordenacao.selecao(itemArray1, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 2");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(itemArray1);
    }

    @Test
    public void test1995() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1995");
        ds.Item[] itemArray0 = new ds.Item[] {};
        ds.Ordenacao.heapsort(itemArray0, 0);
        ds.Ordenacao.insercao(itemArray0, 0);
        ds.Ordenacao.shellsort(itemArray0, (-1));
        ds.Ordenacao.selecao(itemArray0, (-1));
        ds.Ordenacao.heapsort(itemArray0, (int) (short) 0);
        ds.Ordenacao.heapsort(itemArray0, (int) (short) 1);
        ds.Ordenacao.shellsort(itemArray0, (int) (byte) -1);
        ds.Ordenacao.selecao(itemArray0, (int) (short) 0);
        ds.Ordenacao.shellsort(itemArray0, (int) (byte) 0);
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
    public void test1996() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1996");
        ds.Item[] itemArray0 = new ds.Item[] {};
        ds.Ordenacao.heapsort(itemArray0, 0);
        ds.Ordenacao.shellsort(itemArray0, (int) (byte) 1);
        ds.Ordenacao.shellsort(itemArray0, 0);
        ds.Ordenacao.shellsort(itemArray0, (int) (short) 0);
        ds.Ordenacao.selecao(itemArray0, (int) (byte) 0);
        org.junit.Assert.assertNotNull(itemArray0);
    }

    @Test
    public void test1997() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1997");
        ds.Item[] itemArray0 = new ds.Item[] {};
        ds.Ordenacao.heapsort(itemArray0, 0);
        ds.Ordenacao.insercao(itemArray0, 0);
        ds.Ordenacao.insercao(itemArray0, (int) (short) 0);
        ds.Ordenacao.selecao(itemArray0, 1);
        ds.Ordenacao.selecao(itemArray0, (int) (short) -1);
        ds.Ordenacao.shellsort(itemArray0, (int) (short) -1);
        ds.Ordenacao.heapsort(itemArray0, (int) (short) 1);
        ds.Ordenacao.heapsort(itemArray0, (int) (byte) 1);
        java.lang.Class<?> wildcardClass17 = itemArray0.getClass();
        org.junit.Assert.assertNotNull(itemArray0);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test1998() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1998");
        ds.Item[] itemArray0 = new ds.Item[] {};
        ds.Ordenacao.heapsort(itemArray0, 0);
        ds.Ordenacao.insercao(itemArray0, 0);
        ds.Ordenacao.selecao(itemArray0, 0);
        ds.Ordenacao.shellsort(itemArray0, (int) (byte) 1);
        ds.Ordenacao.insercao(itemArray0, 0);
        ds.Ordenacao.insercao(itemArray0, (int) (short) -1);
        ds.Ordenacao.shellsort(itemArray0, (int) (short) 1);
        ds.Ordenacao.selecao(itemArray0, (int) (byte) -1);
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
    public void test1999() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1999");
        ds.Item[] itemArray0 = null;
        // The following exception was thrown during execution in test generation
        try {
            ds.Ordenacao.insercao(itemArray0, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2000() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test2000");
        ds.Item[] itemArray0 = new ds.Item[] {};
        ds.Ordenacao.shellsort(itemArray0, (int) (short) 1);
        ds.Ordenacao.heapsort(itemArray0, 1);
        ds.Ordenacao.heapsort(itemArray0, (int) (byte) 1);
        ds.Ordenacao.shellsort(itemArray0, (int) (short) -1);
        ds.Ordenacao.heapsort(itemArray0, (int) (short) -1);
        org.junit.Assert.assertNotNull(itemArray0);
    }
}

