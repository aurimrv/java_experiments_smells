package ds.seed5482;

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
        int[] intArray2 = new int[] { ' ', 0 };
        ds.Ordenacao.mergeSort(intArray2, (int) (byte) 1, (int) (short) 1);
        ds.Ordenacao.mergeSort(intArray2, (int) (byte) 0, 0);
        ds.Ordenacao.mergeSort(intArray2, (int) (short) 100, (int) (short) 10);
        ds.Ordenacao.mergeSort(intArray2, (int) ' ', (int) (short) 0);
        ds.Ordenacao.mergeSort(intArray2, (int) ' ', (int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            ds.Ordenacao.mergeSort(intArray2, 10, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 10");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[32, 0]");
    }

    @Test
    public void test1502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1502");
        int[] intArray2 = new int[] { ' ', 0 };
        ds.Ordenacao.mergeSort(intArray2, (int) (byte) 1, (int) (short) 1);
        ds.Ordenacao.mergeSort(intArray2, (int) (byte) 0, 0);
        ds.Ordenacao.mergeSort(intArray2, (int) '4', 10);
        ds.Ordenacao.mergeSort(intArray2, (int) (short) 10, (int) (short) 0);
        ds.Ordenacao.mergeSort(intArray2, (int) (short) 100, (int) (short) 0);
        ds.Ordenacao.mergeSort(intArray2, 0, (int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            ds.Ordenacao.mergeSort(intArray2, (int) (byte) 0, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 2");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[0, 32]");
    }

    @Test
    public void test1503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1503");
        int[] intArray3 = new int[] { (byte) 100, (short) 1, (byte) 1 };
        ds.Ordenacao.mergeSort(intArray3, 0, (int) (byte) -1);
        ds.Ordenacao.mergeSort(intArray3, (int) '4', (int) (short) 0);
        ds.Ordenacao.mergeSort(intArray3, (int) ' ', (int) (short) 1);
        ds.Ordenacao.mergeSort(intArray3, (int) (byte) 10, 1);
        ds.Ordenacao.mergeSort(intArray3, (int) (byte) 0, (-1));
        ds.Ordenacao.mergeSort(intArray3, (int) 'a', (int) (byte) -1);
        ds.Ordenacao.mergeSort(intArray3, (int) (byte) 10, (int) (byte) 1);
        ds.Ordenacao.mergeSort(intArray3, (int) ' ', (int) (byte) 10);
        ds.Ordenacao.mergeSort(intArray3, (int) ' ', 1);
        ds.Ordenacao.mergeSort(intArray3, 0, (int) (byte) -1);
        ds.Ordenacao.mergeSort(intArray3, 10, (int) (short) 10);
        java.lang.Class<?> wildcardClass37 = intArray3.getClass();
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[100, 1, 1]");
        org.junit.Assert.assertNotNull(wildcardClass37);
    }

    @Test
    public void test1504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1504");
        int[] intArray1 = new int[] { '4' };
        ds.Ordenacao.mergeSort(intArray1, (int) '4', (int) (byte) 1);
        ds.Ordenacao.mergeSort(intArray1, 100, 100);
        ds.Ordenacao.mergeSort(intArray1, (int) 'a', 1);
        // The following exception was thrown during execution in test generation
        try {
            ds.Ordenacao.mergeSort(intArray1, (int) (short) 0, (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray1), "[52]");
    }

    @Test
    public void test1505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1505");
        int[] intArray3 = new int[] { (byte) 100, (short) 1, (byte) 1 };
        ds.Ordenacao.mergeSort(intArray3, 0, (int) (byte) -1);
        ds.Ordenacao.mergeSort(intArray3, (int) ' ', (int) (short) 1);
        ds.Ordenacao.mergeSort(intArray3, 100, 0);
        ds.Ordenacao.mergeSort(intArray3, (int) (byte) 100, (int) (byte) 0);
        ds.Ordenacao.mergeSort(intArray3, (int) (short) 0, (int) (short) -1);
        ds.Ordenacao.mergeSort(intArray3, 0, 1);
        java.lang.Class<?> wildcardClass22 = intArray3.getClass();
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[1, 100, 1]");
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test1506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1506");
        int[] intArray3 = new int[] { (byte) 100, (short) 1, (byte) 1 };
        ds.Ordenacao.mergeSort(intArray3, 0, (int) (byte) -1);
        ds.Ordenacao.mergeSort(intArray3, (int) ' ', (int) (short) 1);
        ds.Ordenacao.mergeSort(intArray3, 100, 0);
        ds.Ordenacao.mergeSort(intArray3, (int) (short) 100, (int) 'a');
        ds.Ordenacao.mergeSort(intArray3, (int) 'a', (int) '#');
        ds.Ordenacao.mergeSort(intArray3, (int) (short) 0, (int) (short) 1);
        ds.Ordenacao.mergeSort(intArray3, 0, (int) (short) -1);
        ds.Ordenacao.mergeSort(intArray3, 100, (int) '4');
        ds.Ordenacao.mergeSort(intArray3, (int) '4', (int) (byte) 10);
        ds.Ordenacao.mergeSort(intArray3, 0, (-1));
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[1, 100, 1]");
    }

    @Test
    public void test1507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1507");
        int[] intArray3 = new int[] { (byte) 100, (short) 1, (byte) 1 };
        ds.Ordenacao.mergeSort(intArray3, 0, (int) (byte) -1);
        ds.Ordenacao.mergeSort(intArray3, (int) ' ', (int) (short) 1);
        ds.Ordenacao.mergeSort(intArray3, (int) (byte) 0, 0);
        ds.Ordenacao.mergeSort(intArray3, 0, 1);
        ds.Ordenacao.mergeSort(intArray3, (int) 'a', (int) (byte) 0);
        ds.Ordenacao.mergeSort(intArray3, (int) (short) 1, (int) (short) 1);
        ds.Ordenacao.mergeSort(intArray3, (int) (byte) 1, (-1));
        ds.Ordenacao.mergeSort(intArray3, (int) (short) 100, (int) (byte) 10);
        ds.Ordenacao.mergeSort(intArray3, 10, 0);
        // The following exception was thrown during execution in test generation
        try {
            ds.Ordenacao.mergeSort(intArray3, 10, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 10");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[1, 100, 1]");
    }

    @Test
    public void test1508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1508");
        int[] intArray3 = new int[] { 10, (byte) 0, (byte) 0 };
        ds.Ordenacao.mergeSort(intArray3, 1, (int) (byte) -1);
        ds.Ordenacao.mergeSort(intArray3, 10, 0);
        ds.Ordenacao.mergeSort(intArray3, (int) (byte) 10, (int) (byte) -1);
        ds.Ordenacao.mergeSort(intArray3, 0, 1);
        ds.Ordenacao.mergeSort(intArray3, (int) (byte) 10, (int) (byte) 10);
        // The following exception was thrown during execution in test generation
        try {
            ds.Ordenacao.mergeSort(intArray3, (int) '4', 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 52");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[0, 10, 0]");
    }

    @Test
    public void test1509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1509");
        int[] intArray2 = new int[] { ' ', 0 };
        ds.Ordenacao.mergeSort(intArray2, (int) (byte) 1, (int) (short) 1);
        ds.Ordenacao.mergeSort(intArray2, (int) (byte) 0, 0);
        ds.Ordenacao.mergeSort(intArray2, (int) (short) 100, (int) (short) 10);
        ds.Ordenacao.mergeSort(intArray2, (int) '#', (int) (short) 0);
        ds.Ordenacao.mergeSort(intArray2, (int) (short) 100, (int) (short) 1);
        ds.Ordenacao.mergeSort(intArray2, 100, (int) 'a');
        ds.Ordenacao.mergeSort(intArray2, 100, 0);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[32, 0]");
    }

    @Test
    public void test1510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1510");
        int[] intArray3 = new int[] { (byte) 100, (short) 1, (byte) 1 };
        ds.Ordenacao.mergeSort(intArray3, 0, (int) (byte) -1);
        ds.Ordenacao.mergeSort(intArray3, (int) 'a', 1);
        ds.Ordenacao.mergeSort(intArray3, 1, (int) (byte) 0);
        ds.Ordenacao.mergeSort(intArray3, (int) (short) 1, 0);
        ds.Ordenacao.mergeSort(intArray3, (int) '#', (int) (byte) 0);
        ds.Ordenacao.mergeSort(intArray3, (int) (byte) 1, 0);
        ds.Ordenacao.mergeSort(intArray3, (int) (byte) 0, (int) (byte) 1);
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[1, 100, 1]");
    }

    @Test
    public void test1511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1511");
        int[] intArray3 = new int[] { (byte) 100, (short) 1, (byte) 1 };
        ds.Ordenacao.mergeSort(intArray3, 0, (int) (byte) -1);
        ds.Ordenacao.mergeSort(intArray3, (int) ' ', (int) (short) 1);
        ds.Ordenacao.mergeSort(intArray3, (int) (byte) 0, 0);
        ds.Ordenacao.mergeSort(intArray3, 0, 1);
        ds.Ordenacao.mergeSort(intArray3, (int) 'a', (int) (byte) 0);
        ds.Ordenacao.mergeSort(intArray3, (int) (short) 1, (int) (short) 1);
        ds.Ordenacao.mergeSort(intArray3, (int) 'a', 0);
        ds.Ordenacao.mergeSort(intArray3, 0, 0);
        ds.Ordenacao.mergeSort(intArray3, (int) (short) 10, 10);
        // The following exception was thrown during execution in test generation
        try {
            ds.Ordenacao.mergeSort(intArray3, (int) (short) 0, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 3");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[1, 1, 100]");
    }

    @Test
    public void test1512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1512");
        int[] intArray2 = new int[] { ' ', 0 };
        ds.Ordenacao.mergeSort(intArray2, (int) (byte) 1, (int) (short) 1);
        ds.Ordenacao.mergeSort(intArray2, (int) (byte) 0, 0);
        ds.Ordenacao.mergeSort(intArray2, (int) (short) 100, (int) (short) 10);
        ds.Ordenacao.mergeSort(intArray2, (int) '4', (int) ' ');
        // The following exception was thrown during execution in test generation
        try {
            ds.Ordenacao.mergeSort(intArray2, (int) (short) 1, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 2");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[32, 0]");
    }

    @Test
    public void test1513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1513");
        int[] intArray3 = new int[] { 10, (byte) 0, (byte) 0 };
        ds.Ordenacao.mergeSort(intArray3, 1, (int) (byte) -1);
        ds.Ordenacao.mergeSort(intArray3, (int) (byte) 0, (int) (byte) -1);
        ds.Ordenacao.mergeSort(intArray3, (int) 'a', (int) (byte) 1);
        ds.Ordenacao.mergeSort(intArray3, (int) '#', (int) ' ');
        ds.Ordenacao.mergeSort(intArray3, (int) '#', (int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            ds.Ordenacao.mergeSort(intArray3, 1, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 3");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[10, 0, 0]");
    }

    @Test
    public void test1514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1514");
        int[] intArray2 = new int[] { ' ', 0 };
        ds.Ordenacao.mergeSort(intArray2, (int) (byte) 1, (int) (short) 1);
        ds.Ordenacao.mergeSort(intArray2, (int) (byte) 0, 0);
        ds.Ordenacao.mergeSort(intArray2, (int) (short) 100, (int) (short) 10);
        ds.Ordenacao.mergeSort(intArray2, (int) '#', (int) (short) 0);
        ds.Ordenacao.mergeSort(intArray2, (int) (short) 100, (int) (short) 1);
        ds.Ordenacao.mergeSort(intArray2, (int) (byte) 10, (int) (byte) -1);
        ds.Ordenacao.mergeSort(intArray2, (int) (short) 100, (int) (byte) 1);
        ds.Ordenacao.mergeSort(intArray2, (int) (short) -1, (-1));
        java.lang.Class<?> wildcardClass27 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[32, 0]");
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test1515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1515");
        int[] intArray3 = new int[] { (byte) 100, (short) 1, (byte) 1 };
        ds.Ordenacao.mergeSort(intArray3, 0, (int) (byte) -1);
        ds.Ordenacao.mergeSort(intArray3, (int) ' ', (int) (short) 1);
        ds.Ordenacao.mergeSort(intArray3, 100, 0);
        ds.Ordenacao.mergeSort(intArray3, (int) (short) 100, (int) 'a');
        ds.Ordenacao.mergeSort(intArray3, 0, (int) (byte) 1);
        ds.Ordenacao.mergeSort(intArray3, 10, 0);
        ds.Ordenacao.mergeSort(intArray3, (int) (short) 1, 0);
        ds.Ordenacao.mergeSort(intArray3, (int) (byte) 100, 10);
        ds.Ordenacao.mergeSort(intArray3, (int) (short) 100, (int) 'a');
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[1, 100, 1]");
    }

    @Test
    public void test1516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1516");
        int[] intArray3 = new int[] { (byte) 100, (short) 1, (byte) 1 };
        ds.Ordenacao.mergeSort(intArray3, 0, (int) (byte) -1);
        ds.Ordenacao.mergeSort(intArray3, (int) ' ', (int) (short) 1);
        ds.Ordenacao.mergeSort(intArray3, 100, 0);
        ds.Ordenacao.mergeSort(intArray3, (int) (short) 100, (int) 'a');
        ds.Ordenacao.mergeSort(intArray3, 0, (int) (byte) 1);
        ds.Ordenacao.mergeSort(intArray3, 10, 0);
        ds.Ordenacao.mergeSort(intArray3, (int) (short) 1, 0);
        ds.Ordenacao.mergeSort(intArray3, (int) ' ', (int) (byte) 1);
        ds.Ordenacao.mergeSort(intArray3, 0, 0);
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[1, 100, 1]");
    }

    @Test
    public void test1517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1517");
        int[] intArray0 = new int[] {};
        ds.Ordenacao.mergeSort(intArray0, (int) (short) 1, (int) (byte) 0);
        ds.Ordenacao.mergeSort(intArray0, (int) (byte) 1, (int) (short) 0);
        ds.Ordenacao.mergeSort(intArray0, (int) (short) 0, (int) (short) -1);
        ds.Ordenacao.mergeSort(intArray0, 100, (int) '4');
        java.lang.Class<?> wildcardClass13 = intArray0.getClass();
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test1518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1518");
        int[] intArray3 = new int[] { (byte) 100, (short) 1, (byte) 1 };
        ds.Ordenacao.mergeSort(intArray3, 0, (int) (byte) -1);
        ds.Ordenacao.mergeSort(intArray3, (int) 'a', 1);
        ds.Ordenacao.mergeSort(intArray3, 1, (int) (byte) 0);
        ds.Ordenacao.mergeSort(intArray3, (int) (short) 0, (int) (byte) -1);
        ds.Ordenacao.mergeSort(intArray3, 100, (int) (byte) -1);
        ds.Ordenacao.mergeSort(intArray3, 0, (int) (short) 0);
        java.lang.Class<?> wildcardClass22 = intArray3.getClass();
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[100, 1, 1]");
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test1519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1519");
        int[] intArray3 = new int[] { (byte) 100, (short) 1, (byte) 1 };
        ds.Ordenacao.mergeSort(intArray3, 0, (int) (byte) -1);
        ds.Ordenacao.mergeSort(intArray3, (int) ' ', (int) (short) 1);
        ds.Ordenacao.mergeSort(intArray3, 100, 0);
        ds.Ordenacao.mergeSort(intArray3, (int) (byte) 100, (int) (byte) 0);
        ds.Ordenacao.mergeSort(intArray3, (int) (short) 0, (int) (short) -1);
        ds.Ordenacao.mergeSort(intArray3, (int) (byte) 10, (int) (short) -1);
        ds.Ordenacao.mergeSort(intArray3, (int) (short) 10, 0);
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[100, 1, 1]");
    }

    @Test
    public void test1520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1520");
        int[] intArray2 = new int[] { ' ', 0 };
        ds.Ordenacao.mergeSort(intArray2, (int) (byte) 1, (int) (short) 1);
        ds.Ordenacao.mergeSort(intArray2, (int) '4', 0);
        ds.Ordenacao.mergeSort(intArray2, (int) '#', (int) (byte) -1);
        ds.Ordenacao.mergeSort(intArray2, (int) '4', (-1));
        ds.Ordenacao.mergeSort(intArray2, (int) '4', (int) (short) -1);
        ds.Ordenacao.mergeSort(intArray2, (int) '#', (int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            ds.Ordenacao.mergeSort(intArray2, 0, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 2");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[0, 32]");
    }

    @Test
    public void test1521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1521");
        int[] intArray2 = new int[] { ' ', 0 };
        ds.Ordenacao.mergeSort(intArray2, (int) (byte) 1, (int) (short) 1);
        ds.Ordenacao.mergeSort(intArray2, (int) '4', 0);
        ds.Ordenacao.mergeSort(intArray2, (int) (short) 100, (int) '4');
        ds.Ordenacao.mergeSort(intArray2, (int) (byte) 0, (int) (short) -1);
        ds.Ordenacao.mergeSort(intArray2, (int) (byte) 10, 10);
        ds.Ordenacao.mergeSort(intArray2, (int) (byte) 100, (int) (byte) -1);
        // The following exception was thrown during execution in test generation
        try {
            ds.Ordenacao.mergeSort(intArray2, (int) 'a', (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[32, 0]");
    }

    @Test
    public void test1522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1522");
        int[] intArray3 = new int[] { (byte) 100, (short) 1, (byte) 1 };
        ds.Ordenacao.mergeSort(intArray3, 0, (int) (byte) -1);
        ds.Ordenacao.mergeSort(intArray3, (int) 'a', 1);
        ds.Ordenacao.mergeSort(intArray3, (int) '4', 0);
        ds.Ordenacao.mergeSort(intArray3, (int) (short) 1, (int) (short) 1);
        ds.Ordenacao.mergeSort(intArray3, (int) 'a', (int) ' ');
        ds.Ordenacao.mergeSort(intArray3, (int) '4', 0);
        ds.Ordenacao.mergeSort(intArray3, (int) (byte) 10, 10);
        ds.Ordenacao.mergeSort(intArray3, (int) 'a', (int) ' ');
        java.lang.Class<?> wildcardClass28 = intArray3.getClass();
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[100, 1, 1]");
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test1523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1523");
        int[] intArray1 = new int[] { '4' };
        ds.Ordenacao.mergeSort(intArray1, (int) '4', (int) (byte) 1);
        ds.Ordenacao.mergeSort(intArray1, (int) (short) 10, (int) (byte) 0);
        ds.Ordenacao.mergeSort(intArray1, (int) 'a', (int) (short) -1);
        ds.Ordenacao.mergeSort(intArray1, (int) (short) 1, 0);
        ds.Ordenacao.mergeSort(intArray1, (int) 'a', (int) 'a');
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray1), "[52]");
    }

    @Test
    public void test1524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1524");
        int[] intArray3 = new int[] { 10, (byte) 0, (byte) 0 };
        ds.Ordenacao.mergeSort(intArray3, 1, (int) (byte) -1);
        ds.Ordenacao.mergeSort(intArray3, 10, 0);
        ds.Ordenacao.mergeSort(intArray3, (int) (short) 0, 0);
        ds.Ordenacao.mergeSort(intArray3, 10, (int) (byte) 0);
        ds.Ordenacao.mergeSort(intArray3, (int) (byte) 10, 0);
        ds.Ordenacao.mergeSort(intArray3, (int) (byte) 1, (int) (byte) 0);
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[10, 0, 0]");
    }

    @Test
    public void test1525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1525");
        int[] intArray3 = new int[] { (byte) 100, (short) 1, (byte) 1 };
        ds.Ordenacao.mergeSort(intArray3, 0, (int) (byte) -1);
        ds.Ordenacao.mergeSort(intArray3, (int) ' ', (int) (short) 1);
        ds.Ordenacao.mergeSort(intArray3, 100, 0);
        ds.Ordenacao.mergeSort(intArray3, (int) (short) 100, (int) 'a');
        ds.Ordenacao.mergeSort(intArray3, (int) (byte) 100, (int) (short) -1);
        ds.Ordenacao.mergeSort(intArray3, (int) (byte) 100, (int) ' ');
        // The following exception was thrown during execution in test generation
        try {
            ds.Ordenacao.mergeSort(intArray3, (int) (short) 1, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 3");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[100, 1, 1]");
    }

    @Test
    public void test1526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1526");
        int[] intArray2 = new int[] { ' ', 0 };
        ds.Ordenacao.mergeSort(intArray2, (int) (byte) 1, (int) (short) 1);
        ds.Ordenacao.mergeSort(intArray2, (int) (byte) 0, 0);
        ds.Ordenacao.mergeSort(intArray2, (int) (short) 100, (int) (short) 10);
        ds.Ordenacao.mergeSort(intArray2, (int) '#', (int) (short) 0);
        ds.Ordenacao.mergeSort(intArray2, (int) (short) 100, (int) (short) 1);
        ds.Ordenacao.mergeSort(intArray2, 100, (int) 'a');
        ds.Ordenacao.mergeSort(intArray2, (int) (byte) 0, (int) (byte) -1);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[32, 0]");
    }

    @Test
    public void test1527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1527");
        int[] intArray3 = new int[] { (byte) 100, (short) 1, (byte) 1 };
        ds.Ordenacao.mergeSort(intArray3, 0, (int) (byte) -1);
        ds.Ordenacao.mergeSort(intArray3, (int) ' ', (int) (short) 1);
        ds.Ordenacao.mergeSort(intArray3, (int) (byte) 0, 0);
        ds.Ordenacao.mergeSort(intArray3, 0, 1);
        ds.Ordenacao.mergeSort(intArray3, (int) (short) 10, (int) (byte) 1);
        ds.Ordenacao.mergeSort(intArray3, 0, (-1));
        ds.Ordenacao.mergeSort(intArray3, (int) (byte) 100, (int) (byte) 0);
        java.lang.Class<?> wildcardClass25 = intArray3.getClass();
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[1, 100, 1]");
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test1528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1528");
        int[] intArray3 = new int[] { (byte) 100, (short) 1, (byte) 1 };
        ds.Ordenacao.mergeSort(intArray3, 0, (int) (byte) -1);
        ds.Ordenacao.mergeSort(intArray3, (int) ' ', (int) (short) 1);
        ds.Ordenacao.mergeSort(intArray3, 100, 0);
        ds.Ordenacao.mergeSort(intArray3, (int) (short) 100, (int) 'a');
        ds.Ordenacao.mergeSort(intArray3, (int) 'a', (int) '#');
        ds.Ordenacao.mergeSort(intArray3, (int) (byte) 1, (-1));
        ds.Ordenacao.mergeSort(intArray3, 100, (int) (short) 100);
        ds.Ordenacao.mergeSort(intArray3, 10, 10);
        ds.Ordenacao.mergeSort(intArray3, 10, (-1));
        ds.Ordenacao.mergeSort(intArray3, (int) ' ', (int) (short) 1);
        java.lang.Class<?> wildcardClass34 = intArray3.getClass();
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[100, 1, 1]");
        org.junit.Assert.assertNotNull(wildcardClass34);
    }

    @Test
    public void test1529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1529");
        int[] intArray1 = new int[] { '4' };
        ds.Ordenacao.mergeSort(intArray1, (int) '4', (int) (byte) 1);
        ds.Ordenacao.mergeSort(intArray1, (int) (short) 10, (int) (byte) 0);
        ds.Ordenacao.mergeSort(intArray1, (int) '#', 0);
        ds.Ordenacao.mergeSort(intArray1, (int) 'a', (int) (short) 0);
        ds.Ordenacao.mergeSort(intArray1, (int) ' ', (int) (short) -1);
        ds.Ordenacao.mergeSort(intArray1, (int) (byte) 1, (-1));
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray1), "[52]");
    }

    @Test
    public void test1530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1530");
        int[] intArray2 = new int[] { 1, (short) 100 };
        ds.Ordenacao.mergeSort(intArray2, (int) '#', 1);
        ds.Ordenacao.mergeSort(intArray2, (int) '4', (int) '4');
        ds.Ordenacao.mergeSort(intArray2, 100, (int) (short) 10);
        ds.Ordenacao.mergeSort(intArray2, (int) 'a', (int) '4');
        java.lang.Class<?> wildcardClass15 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[1, 100]");
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test1531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1531");
        int[] intArray0 = null;
        ds.Ordenacao.mergeSort(intArray0, (int) ' ', 10);
    }

    @Test
    public void test1532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1532");
        int[] intArray3 = new int[] { (byte) 100, (short) 1, (byte) 1 };
        ds.Ordenacao.mergeSort(intArray3, 0, (int) (byte) -1);
        ds.Ordenacao.mergeSort(intArray3, (int) ' ', (int) (short) 1);
        ds.Ordenacao.mergeSort(intArray3, 100, 0);
        ds.Ordenacao.mergeSort(intArray3, (int) (short) 10, 0);
        ds.Ordenacao.mergeSort(intArray3, (int) 'a', (int) (short) 10);
        ds.Ordenacao.mergeSort(intArray3, (int) (short) 100, 0);
        ds.Ordenacao.mergeSort(intArray3, 10, (int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            ds.Ordenacao.mergeSort(intArray3, 1, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 3");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[100, 1, 1]");
    }

    @Test
    public void test1533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1533");
        int[] intArray3 = new int[] { (byte) 100, (short) 1, (byte) 1 };
        ds.Ordenacao.mergeSort(intArray3, 0, (int) (byte) -1);
        ds.Ordenacao.mergeSort(intArray3, (int) ' ', (int) (short) 1);
        ds.Ordenacao.mergeSort(intArray3, (int) (byte) 0, 0);
        ds.Ordenacao.mergeSort(intArray3, 0, 1);
        ds.Ordenacao.mergeSort(intArray3, (int) (short) 10, 10);
        ds.Ordenacao.mergeSort(intArray3, (int) '#', (int) (short) -1);
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[1, 100, 1]");
    }

    @Test
    public void test1534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1534");
        int[] intArray0 = new int[] {};
        ds.Ordenacao.mergeSort(intArray0, (int) (short) 1, (int) (byte) 0);
        ds.Ordenacao.mergeSort(intArray0, 0, (int) (short) -1);
        ds.Ordenacao.mergeSort(intArray0, (int) (byte) 10, 0);
        ds.Ordenacao.mergeSort(intArray0, (int) (short) 10, (int) (byte) 10);
        ds.Ordenacao.mergeSort(intArray0, (int) (byte) 0, (int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            ds.Ordenacao.mergeSort(intArray0, 0, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 0");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
    }

    @Test
    public void test1535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1535");
        int[] intArray3 = new int[] { (byte) 100, (short) 1, (byte) 1 };
        ds.Ordenacao.mergeSort(intArray3, 0, (int) (byte) -1);
        ds.Ordenacao.mergeSort(intArray3, (int) ' ', (int) (short) 1);
        ds.Ordenacao.mergeSort(intArray3, 100, 0);
        ds.Ordenacao.mergeSort(intArray3, (int) (short) 100, (int) 'a');
        ds.Ordenacao.mergeSort(intArray3, (int) 'a', (int) '#');
        ds.Ordenacao.mergeSort(intArray3, 100, (int) (short) 100);
        ds.Ordenacao.mergeSort(intArray3, 0, (int) (short) -1);
        ds.Ordenacao.mergeSort(intArray3, 100, (int) ' ');
        java.lang.Class<?> wildcardClass28 = intArray3.getClass();
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[100, 1, 1]");
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test1536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1536");
        int[] intArray3 = new int[] { (byte) 100, (short) 1, (byte) 1 };
        ds.Ordenacao.mergeSort(intArray3, 0, (int) (byte) -1);
        ds.Ordenacao.mergeSort(intArray3, (int) ' ', (int) (short) 1);
        ds.Ordenacao.mergeSort(intArray3, (int) '#', (int) (short) 1);
        ds.Ordenacao.mergeSort(intArray3, 0, (int) (byte) -1);
        ds.Ordenacao.mergeSort(intArray3, (int) (short) 100, (int) (short) 100);
        ds.Ordenacao.mergeSort(intArray3, 10, (int) (byte) 0);
        ds.Ordenacao.mergeSort(intArray3, (int) (byte) 10, (int) (byte) 0);
        java.lang.Class<?> wildcardClass25 = intArray3.getClass();
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[100, 1, 1]");
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test1537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1537");
        int[] intArray3 = new int[] { 10, (byte) 0, (byte) 0 };
        ds.Ordenacao.mergeSort(intArray3, 1, (int) (byte) -1);
        ds.Ordenacao.mergeSort(intArray3, 10, 0);
        ds.Ordenacao.mergeSort(intArray3, (int) (byte) 10, (int) (byte) -1);
        ds.Ordenacao.mergeSort(intArray3, (int) (byte) 0, (int) (short) 0);
        ds.Ordenacao.mergeSort(intArray3, (int) '4', 0);
        ds.Ordenacao.mergeSort(intArray3, (int) 'a', (-1));
        ds.Ordenacao.mergeSort(intArray3, (int) '4', (int) (byte) 1);
        java.lang.Class<?> wildcardClass25 = intArray3.getClass();
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[10, 0, 0]");
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test1538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1538");
        int[] intArray3 = new int[] { (byte) 100, (short) 1, (byte) 1 };
        ds.Ordenacao.mergeSort(intArray3, 0, (int) (byte) -1);
        ds.Ordenacao.mergeSort(intArray3, (int) ' ', (int) (short) 1);
        ds.Ordenacao.mergeSort(intArray3, 100, 0);
        ds.Ordenacao.mergeSort(intArray3, (int) (short) 100, (int) 'a');
        ds.Ordenacao.mergeSort(intArray3, (int) 'a', (int) '#');
        ds.Ordenacao.mergeSort(intArray3, (int) (short) 0, (int) (short) 1);
        ds.Ordenacao.mergeSort(intArray3, (int) '#', (int) (byte) 1);
        ds.Ordenacao.mergeSort(intArray3, (int) (byte) 100, 0);
        ds.Ordenacao.mergeSort(intArray3, (int) (short) 10, 0);
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[1, 100, 1]");
    }

    @Test
    public void test1539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1539");
        int[] intArray3 = new int[] { 10, (byte) 0, (byte) 0 };
        ds.Ordenacao.mergeSort(intArray3, 1, (int) (byte) -1);
        ds.Ordenacao.mergeSort(intArray3, (int) (byte) 0, (int) (byte) -1);
        ds.Ordenacao.mergeSort(intArray3, (int) 'a', (int) (byte) 1);
        ds.Ordenacao.mergeSort(intArray3, 100, 100);
        ds.Ordenacao.mergeSort(intArray3, (int) (short) 100, (-1));
        ds.Ordenacao.mergeSort(intArray3, 100, 10);
        // The following exception was thrown during execution in test generation
        try {
            ds.Ordenacao.mergeSort(intArray3, 0, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 3");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[0, 0, 10]");
    }

    @Test
    public void test1540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1540");
        int[] intArray3 = new int[] { (byte) 100, (short) 1, (byte) 1 };
        ds.Ordenacao.mergeSort(intArray3, 0, (int) (byte) -1);
        ds.Ordenacao.mergeSort(intArray3, (int) ' ', (int) (short) 1);
        ds.Ordenacao.mergeSort(intArray3, (int) (byte) 0, 0);
        ds.Ordenacao.mergeSort(intArray3, 0, 1);
        ds.Ordenacao.mergeSort(intArray3, (int) (short) 10, (int) (byte) 1);
        ds.Ordenacao.mergeSort(intArray3, 0, (-1));
        ds.Ordenacao.mergeSort(intArray3, (int) ' ', (int) (short) 0);
        ds.Ordenacao.mergeSort(intArray3, (int) (short) 10, 0);
        ds.Ordenacao.mergeSort(intArray3, (int) 'a', 1);
        ds.Ordenacao.mergeSort(intArray3, 10, (int) (byte) 1);
        ds.Ordenacao.mergeSort(intArray3, (int) (short) 100, 0);
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[1, 100, 1]");
    }

    @Test
    public void test1541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1541");
        int[] intArray2 = new int[] { ' ', 0 };
        ds.Ordenacao.mergeSort(intArray2, (int) (byte) 1, (int) (short) 1);
        ds.Ordenacao.mergeSort(intArray2, (int) (byte) 0, 0);
        ds.Ordenacao.mergeSort(intArray2, (int) (short) -1, (int) (byte) -1);
        ds.Ordenacao.mergeSort(intArray2, (int) '#', (int) ' ');
        ds.Ordenacao.mergeSort(intArray2, (int) ' ', (int) (short) 0);
        ds.Ordenacao.mergeSort(intArray2, (int) (short) 100, (int) (byte) 0);
        java.lang.Class<?> wildcardClass21 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[32, 0]");
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test1542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1542");
        int[] intArray1 = new int[] { '4' };
        ds.Ordenacao.mergeSort(intArray1, (int) '4', (int) (byte) 1);
        ds.Ordenacao.mergeSort(intArray1, (int) (short) 10, (int) (byte) 0);
        ds.Ordenacao.mergeSort(intArray1, (int) '4', 1);
        ds.Ordenacao.mergeSort(intArray1, 100, 0);
        ds.Ordenacao.mergeSort(intArray1, 100, (int) 'a');
        ds.Ordenacao.mergeSort(intArray1, (int) (short) 10, (int) (short) 10);
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray1), "[52]");
    }

    @Test
    public void test1543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1543");
        int[] intArray1 = new int[] { '4' };
        ds.Ordenacao.mergeSort(intArray1, (int) '4', (int) (byte) 1);
        ds.Ordenacao.mergeSort(intArray1, (int) (short) 10, (int) (byte) 0);
        ds.Ordenacao.mergeSort(intArray1, (int) 'a', (int) (short) -1);
        ds.Ordenacao.mergeSort(intArray1, (int) (short) 1, 0);
        ds.Ordenacao.mergeSort(intArray1, (int) ' ', (int) (short) 10);
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray1), "[52]");
    }

    @Test
    public void test1544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1544");
        int[] intArray3 = new int[] { (byte) 100, (short) 1, (byte) 1 };
        ds.Ordenacao.mergeSort(intArray3, 0, (int) (byte) -1);
        ds.Ordenacao.mergeSort(intArray3, (int) '4', (int) (short) 0);
        ds.Ordenacao.mergeSort(intArray3, (int) ' ', (int) (short) 1);
        ds.Ordenacao.mergeSort(intArray3, (int) 'a', (int) (short) 1);
        java.lang.Class<?> wildcardClass16 = intArray3.getClass();
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[100, 1, 1]");
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test1545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1545");
        int[] intArray1 = new int[] { '4' };
        ds.Ordenacao.mergeSort(intArray1, (int) '4', (int) (byte) 1);
        ds.Ordenacao.mergeSort(intArray1, 100, 100);
        ds.Ordenacao.mergeSort(intArray1, (int) 'a', 10);
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray1), "[52]");
    }

    @Test
    public void test1546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1546");
        int[] intArray3 = new int[] { 10, (byte) 0, (byte) 0 };
        ds.Ordenacao.mergeSort(intArray3, 1, (int) (byte) -1);
        ds.Ordenacao.mergeSort(intArray3, 100, 0);
        ds.Ordenacao.mergeSort(intArray3, (int) (short) 100, (int) (byte) 10);
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[10, 0, 0]");
    }

    @Test
    public void test1547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1547");
        int[] intArray1 = new int[] { '4' };
        ds.Ordenacao.mergeSort(intArray1, (int) '4', (int) (byte) 1);
        ds.Ordenacao.mergeSort(intArray1, (int) (byte) 1, 0);
        ds.Ordenacao.mergeSort(intArray1, 0, (int) (byte) 0);
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray1), "[52]");
    }

    @Test
    public void test1548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1548");
        int[] intArray3 = new int[] { 10, (byte) 0, (byte) 0 };
        ds.Ordenacao.mergeSort(intArray3, 1, (int) (byte) -1);
        ds.Ordenacao.mergeSort(intArray3, (int) (byte) 0, (int) (byte) -1);
        ds.Ordenacao.mergeSort(intArray3, (int) 'a', (int) '#');
        ds.Ordenacao.mergeSort(intArray3, (int) (short) 0, (int) (byte) -1);
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[10, 0, 0]");
    }

    @Test
    public void test1549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1549");
        int[] intArray1 = new int[] { '4' };
        ds.Ordenacao.mergeSort(intArray1, (int) '4', (int) (byte) 1);
        ds.Ordenacao.mergeSort(intArray1, (int) (byte) 1, 0);
        ds.Ordenacao.mergeSort(intArray1, (int) (short) 1, 0);
        // The following exception was thrown during execution in test generation
        try {
            ds.Ordenacao.mergeSort(intArray1, (int) (byte) 0, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray1), "[52]");
    }

    @Test
    public void test1550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1550");
        int[] intArray2 = new int[] { ' ', 0 };
        ds.Ordenacao.mergeSort(intArray2, (int) (byte) 1, (int) (short) 1);
        ds.Ordenacao.mergeSort(intArray2, (int) (byte) 0, 0);
        ds.Ordenacao.mergeSort(intArray2, (int) (short) 100, (int) (short) 10);
        ds.Ordenacao.mergeSort(intArray2, (int) '#', (int) (short) 0);
        ds.Ordenacao.mergeSort(intArray2, (int) (short) 100, (int) (short) 1);
        ds.Ordenacao.mergeSort(intArray2, (int) (byte) 10, (int) (byte) -1);
        ds.Ordenacao.mergeSort(intArray2, (int) (short) 1, (-1));
        ds.Ordenacao.mergeSort(intArray2, (int) (short) 1, 0);
        java.lang.Class<?> wildcardClass27 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[32, 0]");
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test1551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1551");
        int[] intArray3 = new int[] { (byte) 100, (short) 1, (byte) 1 };
        ds.Ordenacao.mergeSort(intArray3, 0, (int) (byte) -1);
        ds.Ordenacao.mergeSort(intArray3, (int) '#', 0);
        ds.Ordenacao.mergeSort(intArray3, 0, (int) (short) -1);
        // The following exception was thrown during execution in test generation
        try {
            ds.Ordenacao.mergeSort(intArray3, 10, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 10");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[100, 1, 1]");
    }

    @Test
    public void test1552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1552");
        int[] intArray3 = new int[] { 10, (byte) 0, (byte) 0 };
        ds.Ordenacao.mergeSort(intArray3, 1, (int) (byte) -1);
        ds.Ordenacao.mergeSort(intArray3, (int) (byte) 0, (int) (byte) -1);
        ds.Ordenacao.mergeSort(intArray3, (int) 'a', (int) (byte) 1);
        ds.Ordenacao.mergeSort(intArray3, (int) '#', (int) ' ');
        ds.Ordenacao.mergeSort(intArray3, (int) '4', (int) (short) -1);
        ds.Ordenacao.mergeSort(intArray3, (int) '#', (int) (byte) 1);
        ds.Ordenacao.mergeSort(intArray3, (int) '#', (int) (short) 10);
        java.lang.Class<?> wildcardClass25 = intArray3.getClass();
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[10, 0, 0]");
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test1553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1553");
        int[] intArray0 = new int[] {};
        ds.Ordenacao.mergeSort(intArray0, (int) (short) 1, (int) (byte) 0);
        ds.Ordenacao.mergeSort(intArray0, 0, (int) (short) -1);
        ds.Ordenacao.mergeSort(intArray0, (int) (short) 100, (int) (byte) 0);
        ds.Ordenacao.mergeSort(intArray0, (int) (byte) 10, (int) (byte) 10);
        ds.Ordenacao.mergeSort(intArray0, (int) 'a', (int) (short) 10);
        ds.Ordenacao.mergeSort(intArray0, (int) ' ', (int) (byte) 0);
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
    }

    @Test
    public void test1554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1554");
        int[] intArray2 = new int[] { ' ', 0 };
        ds.Ordenacao.mergeSort(intArray2, (int) (byte) 1, (int) (short) 1);
        ds.Ordenacao.mergeSort(intArray2, (int) (byte) 0, 0);
        ds.Ordenacao.mergeSort(intArray2, (int) (short) 100, (int) (short) 10);
        ds.Ordenacao.mergeSort(intArray2, (int) '#', (int) (short) 0);
        ds.Ordenacao.mergeSort(intArray2, (int) (short) 100, (int) (short) 1);
        ds.Ordenacao.mergeSort(intArray2, (int) (short) 100, (int) (short) 100);
        ds.Ordenacao.mergeSort(intArray2, 10, 10);
        ds.Ordenacao.mergeSort(intArray2, 1, 0);
        ds.Ordenacao.mergeSort(intArray2, (int) 'a', (int) (short) 0);
        ds.Ordenacao.mergeSort(intArray2, (int) (short) 1, (-1));
        ds.Ordenacao.mergeSort(intArray2, (int) (short) 100, (int) (byte) 100);
        ds.Ordenacao.mergeSort(intArray2, (int) '4', (int) (byte) 1);
        java.lang.Class<?> wildcardClass39 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[32, 0]");
        org.junit.Assert.assertNotNull(wildcardClass39);
    }

    @Test
    public void test1555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1555");
        int[] intArray2 = new int[] { 1, (short) 100 };
        ds.Ordenacao.mergeSort(intArray2, (int) '#', 1);
        ds.Ordenacao.mergeSort(intArray2, 0, (int) (short) -1);
        ds.Ordenacao.mergeSort(intArray2, (int) '#', 0);
        java.lang.Class<?> wildcardClass12 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[1, 100]");
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test1556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1556");
        int[] intArray2 = new int[] { ' ', 0 };
        ds.Ordenacao.mergeSort(intArray2, (int) (byte) 1, (int) (short) 1);
        ds.Ordenacao.mergeSort(intArray2, (int) (byte) 0, 0);
        ds.Ordenacao.mergeSort(intArray2, (int) (short) -1, (int) (byte) -1);
        ds.Ordenacao.mergeSort(intArray2, (int) '#', (int) ' ');
        ds.Ordenacao.mergeSort(intArray2, (int) ' ', (int) (short) 0);
        ds.Ordenacao.mergeSort(intArray2, (int) (short) 100, (int) (byte) 0);
        ds.Ordenacao.mergeSort(intArray2, 1, (int) (short) -1);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[32, 0]");
    }

    @Test
    public void test1557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1557");
        int[] intArray3 = new int[] { (byte) 100, (short) 1, (byte) 1 };
        ds.Ordenacao.mergeSort(intArray3, 0, (int) (byte) -1);
        ds.Ordenacao.mergeSort(intArray3, (int) ' ', (int) (short) 1);
        ds.Ordenacao.mergeSort(intArray3, (int) (byte) 0, 0);
        ds.Ordenacao.mergeSort(intArray3, 0, 1);
        ds.Ordenacao.mergeSort(intArray3, (int) 'a', (int) (byte) 0);
        ds.Ordenacao.mergeSort(intArray3, (int) (short) 1, (int) (short) 1);
        ds.Ordenacao.mergeSort(intArray3, (int) '#', (int) (short) -1);
        ds.Ordenacao.mergeSort(intArray3, 10, 0);
        ds.Ordenacao.mergeSort(intArray3, (int) 'a', (int) ' ');
        ds.Ordenacao.mergeSort(intArray3, (int) (byte) 100, (int) (byte) 100);
        // The following exception was thrown during execution in test generation
        try {
            ds.Ordenacao.mergeSort(intArray3, 10, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 10");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[1, 100, 1]");
    }

    @Test
    public void test1558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1558");
        int[] intArray0 = null;
        // The following exception was thrown during execution in test generation
        try {
            ds.Ordenacao.mergeSort(intArray0, (int) (short) 0, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1559");
        int[] intArray2 = new int[] { ' ', 0 };
        ds.Ordenacao.mergeSort(intArray2, (int) (byte) 1, (int) (short) 1);
        ds.Ordenacao.mergeSort(intArray2, (int) (byte) 0, 0);
        ds.Ordenacao.mergeSort(intArray2, (int) (short) 100, (int) (short) 10);
        ds.Ordenacao.mergeSort(intArray2, (int) '#', (int) (short) 0);
        ds.Ordenacao.mergeSort(intArray2, 10, (int) (short) 0);
        java.lang.Class<?> wildcardClass18 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[32, 0]");
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test1560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1560");
        int[] intArray2 = new int[] { ' ', 0 };
        ds.Ordenacao.mergeSort(intArray2, (int) (byte) 1, (int) (short) 1);
        ds.Ordenacao.mergeSort(intArray2, (int) (byte) 0, 0);
        ds.Ordenacao.mergeSort(intArray2, (int) (short) 100, (int) (short) 10);
        ds.Ordenacao.mergeSort(intArray2, (int) ' ', (int) (short) 0);
        ds.Ordenacao.mergeSort(intArray2, (int) (byte) 10, (int) (short) 1);
        ds.Ordenacao.mergeSort(intArray2, 100, (int) (short) 1);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[32, 0]");
    }

    @Test
    public void test1561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1561");
        int[] intArray3 = new int[] { (byte) 100, (short) 1, (byte) 1 };
        ds.Ordenacao.mergeSort(intArray3, 0, (int) (byte) -1);
        ds.Ordenacao.mergeSort(intArray3, (int) '4', (int) (short) 0);
        ds.Ordenacao.mergeSort(intArray3, (int) ' ', (int) (short) 1);
        ds.Ordenacao.mergeSort(intArray3, (int) 'a', (int) (short) 1);
        ds.Ordenacao.mergeSort(intArray3, (int) '#', (int) '#');
        ds.Ordenacao.mergeSort(intArray3, 0, (-1));
        ds.Ordenacao.mergeSort(intArray3, (int) ' ', 1);
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[100, 1, 1]");
    }

    @Test
    public void test1562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1562");
        int[] intArray3 = new int[] { (byte) 100, (short) 1, (byte) 1 };
        ds.Ordenacao.mergeSort(intArray3, 0, (int) (byte) -1);
        ds.Ordenacao.mergeSort(intArray3, (int) '4', (int) (short) 0);
        ds.Ordenacao.mergeSort(intArray3, (int) ' ', (int) (short) 1);
        ds.Ordenacao.mergeSort(intArray3, (int) ' ', 0);
        ds.Ordenacao.mergeSort(intArray3, 0, (int) (byte) 1);
        java.lang.Class<?> wildcardClass19 = intArray3.getClass();
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[1, 100, 1]");
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test1563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1563");
        int[] intArray3 = new int[] { (byte) 100, (short) 1, (byte) 1 };
        ds.Ordenacao.mergeSort(intArray3, 0, (int) (byte) -1);
        ds.Ordenacao.mergeSort(intArray3, (int) ' ', (int) (short) 1);
        ds.Ordenacao.mergeSort(intArray3, (int) (byte) 0, 0);
        ds.Ordenacao.mergeSort(intArray3, 0, 1);
        ds.Ordenacao.mergeSort(intArray3, (int) 'a', (int) (byte) 0);
        ds.Ordenacao.mergeSort(intArray3, (int) (short) 1, (int) (short) 1);
        ds.Ordenacao.mergeSort(intArray3, (int) (byte) 1, (-1));
        ds.Ordenacao.mergeSort(intArray3, (int) '4', (int) (short) -1);
        ds.Ordenacao.mergeSort(intArray3, 0, (int) (byte) 1);
        ds.Ordenacao.mergeSort(intArray3, (int) (byte) 10, (int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            ds.Ordenacao.mergeSort(intArray3, (int) (short) 10, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 10");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[1, 100, 1]");
    }

    @Test
    public void test1564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1564");
        int[] intArray3 = new int[] { (byte) 100, (short) 1, (byte) 1 };
        ds.Ordenacao.mergeSort(intArray3, 0, (int) (byte) -1);
        ds.Ordenacao.mergeSort(intArray3, (int) ' ', (int) (short) 1);
        ds.Ordenacao.mergeSort(intArray3, 100, 0);
        ds.Ordenacao.mergeSort(intArray3, (int) (short) 100, (int) 'a');
        ds.Ordenacao.mergeSort(intArray3, 0, (int) (byte) 1);
        ds.Ordenacao.mergeSort(intArray3, 10, 0);
        ds.Ordenacao.mergeSort(intArray3, (int) '4', (int) (short) 10);
        ds.Ordenacao.mergeSort(intArray3, (int) ' ', (int) (byte) 1);
        ds.Ordenacao.mergeSort(intArray3, (int) (byte) 0, (-1));
        // The following exception was thrown during execution in test generation
        try {
            ds.Ordenacao.mergeSort(intArray3, (int) (short) 0, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 3");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[1, 1, 100]");
    }

    @Test
    public void test1565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1565");
        int[] intArray3 = new int[] { (byte) 100, (short) 1, (byte) 1 };
        ds.Ordenacao.mergeSort(intArray3, 0, (int) (byte) -1);
        ds.Ordenacao.mergeSort(intArray3, (int) ' ', (int) (short) 1);
        ds.Ordenacao.mergeSort(intArray3, 100, 0);
        ds.Ordenacao.mergeSort(intArray3, (int) (short) 100, (int) 'a');
        ds.Ordenacao.mergeSort(intArray3, (int) 'a', (int) '#');
        ds.Ordenacao.mergeSort(intArray3, (int) (byte) 10, (int) (short) 0);
        ds.Ordenacao.mergeSort(intArray3, 1, (int) (byte) 0);
        ds.Ordenacao.mergeSort(intArray3, (int) 'a', 1);
        java.lang.Class<?> wildcardClass28 = intArray3.getClass();
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[100, 1, 1]");
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test1566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1566");
        int[] intArray3 = new int[] { (byte) 100, (short) 1, (byte) 1 };
        ds.Ordenacao.mergeSort(intArray3, 0, (int) (byte) -1);
        ds.Ordenacao.mergeSort(intArray3, (int) ' ', (int) (short) 1);
        ds.Ordenacao.mergeSort(intArray3, (int) (byte) 0, 0);
        ds.Ordenacao.mergeSort(intArray3, 0, 1);
        ds.Ordenacao.mergeSort(intArray3, (int) 'a', (int) (byte) 0);
        ds.Ordenacao.mergeSort(intArray3, (int) (short) 1, (int) (short) 1);
        ds.Ordenacao.mergeSort(intArray3, (int) (short) 100, (-1));
        ds.Ordenacao.mergeSort(intArray3, (int) (short) 10, 0);
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[1, 100, 1]");
    }

    @Test
    public void test1567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1567");
        int[] intArray0 = new int[] {};
        ds.Ordenacao.mergeSort(intArray0, (int) (short) 1, (int) (byte) 0);
        ds.Ordenacao.mergeSort(intArray0, (int) (byte) 1, (int) (short) 0);
        ds.Ordenacao.mergeSort(intArray0, 100, 1);
        ds.Ordenacao.mergeSort(intArray0, (int) '4', (int) (short) -1);
        java.lang.Class<?> wildcardClass13 = intArray0.getClass();
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test1568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1568");
        int[] intArray3 = new int[] { (byte) 100, (short) 1, (byte) 1 };
        ds.Ordenacao.mergeSort(intArray3, 0, (int) (byte) -1);
        ds.Ordenacao.mergeSort(intArray3, (int) ' ', (int) (short) 1);
        ds.Ordenacao.mergeSort(intArray3, (int) (byte) 0, 0);
        ds.Ordenacao.mergeSort(intArray3, 0, 1);
        ds.Ordenacao.mergeSort(intArray3, (int) (short) 10, (int) (short) 1);
        ds.Ordenacao.mergeSort(intArray3, 1, 1);
        ds.Ordenacao.mergeSort(intArray3, 100, (int) (short) -1);
        ds.Ordenacao.mergeSort(intArray3, (int) 'a', (int) 'a');
        ds.Ordenacao.mergeSort(intArray3, 100, (int) (byte) 0);
        ds.Ordenacao.mergeSort(intArray3, 100, (int) (short) 0);
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[1, 100, 1]");
    }

    @Test
    public void test1569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1569");
        int[] intArray2 = new int[] { ' ', 0 };
        ds.Ordenacao.mergeSort(intArray2, (int) (byte) 1, (int) (short) 1);
        ds.Ordenacao.mergeSort(intArray2, (int) (short) 100, (int) (short) 1);
        ds.Ordenacao.mergeSort(intArray2, (int) (byte) 1, (-1));
        ds.Ordenacao.mergeSort(intArray2, 10, 0);
        ds.Ordenacao.mergeSort(intArray2, 0, 0);
        java.lang.Class<?> wildcardClass18 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[32, 0]");
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test1570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1570");
        int[] intArray0 = new int[] {};
        ds.Ordenacao.mergeSort(intArray0, (int) (short) 1, (int) (byte) 0);
        ds.Ordenacao.mergeSort(intArray0, 0, (int) (short) -1);
        ds.Ordenacao.mergeSort(intArray0, (int) (byte) 10, 0);
        ds.Ordenacao.mergeSort(intArray0, (int) (short) 10, (int) (byte) 10);
        ds.Ordenacao.mergeSort(intArray0, (int) (short) 100, (int) (byte) -1);
        java.lang.Class<?> wildcardClass16 = intArray0.getClass();
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test1571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1571");
        int[] intArray3 = new int[] { (byte) 100, (short) 1, (byte) 1 };
        ds.Ordenacao.mergeSort(intArray3, 0, (int) (byte) -1);
        ds.Ordenacao.mergeSort(intArray3, (int) ' ', (int) (short) 1);
        ds.Ordenacao.mergeSort(intArray3, 100, 0);
        ds.Ordenacao.mergeSort(intArray3, (int) (short) 100, (int) 'a');
        ds.Ordenacao.mergeSort(intArray3, (int) 'a', (int) '#');
        ds.Ordenacao.mergeSort(intArray3, (int) (byte) 1, (-1));
        ds.Ordenacao.mergeSort(intArray3, 100, (int) (short) 100);
        ds.Ordenacao.mergeSort(intArray3, 10, 10);
        ds.Ordenacao.mergeSort(intArray3, 10, (-1));
        ds.Ordenacao.mergeSort(intArray3, 1, (int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            ds.Ordenacao.mergeSort(intArray3, 10, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 10");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[100, 1, 1]");
    }

    @Test
    public void test1572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1572");
        int[] intArray2 = new int[] { ' ', 0 };
        ds.Ordenacao.mergeSort(intArray2, (int) (byte) 1, (int) (short) 1);
        ds.Ordenacao.mergeSort(intArray2, (int) (short) 100, (int) (short) 1);
        ds.Ordenacao.mergeSort(intArray2, 0, (int) (short) 1);
        ds.Ordenacao.mergeSort(intArray2, (int) '4', 0);
        ds.Ordenacao.mergeSort(intArray2, (int) (byte) 100, (int) (byte) 1);
        ds.Ordenacao.mergeSort(intArray2, (int) (byte) 10, 10);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[0, 32]");
    }

    @Test
    public void test1573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1573");
        int[] intArray1 = new int[] { '4' };
        ds.Ordenacao.mergeSort(intArray1, (int) '4', (int) (byte) 1);
        ds.Ordenacao.mergeSort(intArray1, 100, 100);
        ds.Ordenacao.mergeSort(intArray1, (int) 'a', 1);
        // The following exception was thrown during execution in test generation
        try {
            ds.Ordenacao.mergeSort(intArray1, (int) (short) 1, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray1), "[52]");
    }

    @Test
    public void test1574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1574");
        int[] intArray3 = new int[] { 10, (byte) 0, (byte) 0 };
        ds.Ordenacao.mergeSort(intArray3, 1, (int) (byte) -1);
        ds.Ordenacao.mergeSort(intArray3, (int) (byte) 0, (int) (byte) -1);
        ds.Ordenacao.mergeSort(intArray3, (int) 'a', (int) (byte) 1);
        ds.Ordenacao.mergeSort(intArray3, (int) '#', (int) ' ');
        ds.Ordenacao.mergeSort(intArray3, (int) (byte) 100, (int) (byte) 0);
        ds.Ordenacao.mergeSort(intArray3, (int) (short) 0, 0);
        ds.Ordenacao.mergeSort(intArray3, 0, 0);
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[10, 0, 0]");
    }

    @Test
    public void test1575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1575");
        int[] intArray3 = new int[] { 10, (byte) 0, (byte) 0 };
        ds.Ordenacao.mergeSort(intArray3, 1, (int) (byte) -1);
        ds.Ordenacao.mergeSort(intArray3, (int) (byte) 0, (int) (byte) -1);
        ds.Ordenacao.mergeSort(intArray3, (int) 'a', (int) (byte) 1);
        ds.Ordenacao.mergeSort(intArray3, 100, 100);
        ds.Ordenacao.mergeSort(intArray3, (int) (short) 100, (-1));
        // The following exception was thrown during execution in test generation
        try {
            ds.Ordenacao.mergeSort(intArray3, 1, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 3");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[10, 0, 0]");
    }

    @Test
    public void test1576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1576");
        int[] intArray3 = new int[] { (byte) 100, (short) 1, (byte) 1 };
        ds.Ordenacao.mergeSort(intArray3, 0, (int) (byte) -1);
        ds.Ordenacao.mergeSort(intArray3, (int) ' ', (int) (short) 1);
        ds.Ordenacao.mergeSort(intArray3, 100, 0);
        ds.Ordenacao.mergeSort(intArray3, (int) (short) 100, (int) 'a');
        ds.Ordenacao.mergeSort(intArray3, (int) 'a', (int) '#');
        ds.Ordenacao.mergeSort(intArray3, (int) 'a', (int) '4');
        ds.Ordenacao.mergeSort(intArray3, (int) (byte) 0, 0);
        ds.Ordenacao.mergeSort(intArray3, (int) (short) 1, (-1));
        ds.Ordenacao.mergeSort(intArray3, (int) (short) 0, (-1));
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[100, 1, 1]");
    }

    @Test
    public void test1577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1577");
        int[] intArray3 = new int[] { 10, (byte) 0, (byte) 0 };
        ds.Ordenacao.mergeSort(intArray3, 1, (int) (byte) -1);
        ds.Ordenacao.mergeSort(intArray3, (int) (byte) 0, (int) (byte) -1);
        ds.Ordenacao.mergeSort(intArray3, (int) 'a', (int) (byte) 1);
        ds.Ordenacao.mergeSort(intArray3, (int) '#', (int) ' ');
        ds.Ordenacao.mergeSort(intArray3, (int) (byte) 100, (int) (byte) 0);
        ds.Ordenacao.mergeSort(intArray3, (int) (short) 0, 0);
        java.lang.Class<?> wildcardClass22 = intArray3.getClass();
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[10, 0, 0]");
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test1578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1578");
        int[] intArray2 = new int[] { 1, (short) 100 };
        ds.Ordenacao.mergeSort(intArray2, (int) '#', 1);
        ds.Ordenacao.mergeSort(intArray2, (int) (short) 10, (int) (byte) 1);
        ds.Ordenacao.mergeSort(intArray2, (int) (byte) 10, (int) (byte) -1);
        ds.Ordenacao.mergeSort(intArray2, (int) (short) 10, 1);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[1, 100]");
    }

    @Test
    public void test1579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1579");
        int[] intArray3 = new int[] { (byte) 100, (short) 1, (byte) 1 };
        ds.Ordenacao.mergeSort(intArray3, 0, (int) (byte) -1);
        ds.Ordenacao.mergeSort(intArray3, (int) ' ', (int) (short) 1);
        ds.Ordenacao.mergeSort(intArray3, (int) (byte) 0, 0);
        ds.Ordenacao.mergeSort(intArray3, 0, 1);
        ds.Ordenacao.mergeSort(intArray3, (int) (short) 10, (int) (short) 1);
        ds.Ordenacao.mergeSort(intArray3, 1, 1);
        ds.Ordenacao.mergeSort(intArray3, 100, (int) (short) -1);
        ds.Ordenacao.mergeSort(intArray3, (int) 'a', (int) 'a');
        ds.Ordenacao.mergeSort(intArray3, 100, (int) (byte) 0);
        ds.Ordenacao.mergeSort(intArray3, (int) (short) 10, (-1));
        java.lang.Class<?> wildcardClass34 = intArray3.getClass();
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[1, 100, 1]");
        org.junit.Assert.assertNotNull(wildcardClass34);
    }

    @Test
    public void test1580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1580");
        int[] intArray2 = new int[] { ' ', 0 };
        ds.Ordenacao.mergeSort(intArray2, (int) (byte) 1, (int) (short) 1);
        ds.Ordenacao.mergeSort(intArray2, (int) (byte) 0, 0);
        ds.Ordenacao.mergeSort(intArray2, (int) (short) 100, (int) (short) 10);
        ds.Ordenacao.mergeSort(intArray2, (int) '#', (int) (short) 0);
        ds.Ordenacao.mergeSort(intArray2, (int) (short) 100, (int) (short) 1);
        ds.Ordenacao.mergeSort(intArray2, (int) (short) 100, (int) (short) 100);
        ds.Ordenacao.mergeSort(intArray2, 10, 10);
        ds.Ordenacao.mergeSort(intArray2, 1, (-1));
        ds.Ordenacao.mergeSort(intArray2, (int) '4', (int) (byte) 10);
        ds.Ordenacao.mergeSort(intArray2, (int) (short) 1, (int) (byte) 0);
        ds.Ordenacao.mergeSort(intArray2, 100, (int) (short) 100);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[32, 0]");
    }

    @Test
    public void test1581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1581");
        int[] intArray3 = new int[] { (byte) 100, (short) 1, (byte) 1 };
        ds.Ordenacao.mergeSort(intArray3, 0, (int) (byte) -1);
        ds.Ordenacao.mergeSort(intArray3, (int) ' ', (int) (short) 1);
        ds.Ordenacao.mergeSort(intArray3, (int) (byte) 0, 0);
        ds.Ordenacao.mergeSort(intArray3, 0, 1);
        ds.Ordenacao.mergeSort(intArray3, (int) 'a', (int) (byte) 0);
        ds.Ordenacao.mergeSort(intArray3, (int) (short) 1, (int) (short) 1);
        ds.Ordenacao.mergeSort(intArray3, (int) (byte) 1, (-1));
        ds.Ordenacao.mergeSort(intArray3, (int) '4', (int) (short) -1);
        ds.Ordenacao.mergeSort(intArray3, 0, (int) (byte) 1);
        ds.Ordenacao.mergeSort(intArray3, (int) (byte) 10, (int) (short) 1);
        ds.Ordenacao.mergeSort(intArray3, (int) ' ', (int) (short) 0);
        java.lang.Class<?> wildcardClass37 = intArray3.getClass();
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[1, 100, 1]");
        org.junit.Assert.assertNotNull(wildcardClass37);
    }

    @Test
    public void test1582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1582");
        int[] intArray2 = new int[] { 1, (short) 100 };
        ds.Ordenacao.mergeSort(intArray2, (int) '#', 1);
        ds.Ordenacao.mergeSort(intArray2, 0, (int) (short) -1);
        ds.Ordenacao.mergeSort(intArray2, (int) (short) 10, (int) (short) 1);
        ds.Ordenacao.mergeSort(intArray2, (-1), (-1));
        ds.Ordenacao.mergeSort(intArray2, (int) (short) 0, (int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            ds.Ordenacao.mergeSort(intArray2, 0, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 2");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[1, 100]");
    }

    @Test
    public void test1583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1583");
        int[] intArray3 = new int[] { (byte) 100, (short) 1, (byte) 1 };
        ds.Ordenacao.mergeSort(intArray3, 0, (int) (byte) -1);
        ds.Ordenacao.mergeSort(intArray3, (int) '4', (int) (short) 0);
        ds.Ordenacao.mergeSort(intArray3, (int) ' ', (int) (short) 1);
        ds.Ordenacao.mergeSort(intArray3, (int) (byte) 10, 1);
        ds.Ordenacao.mergeSort(intArray3, (int) (byte) 0, (-1));
        ds.Ordenacao.mergeSort(intArray3, (int) 'a', (int) (byte) -1);
        ds.Ordenacao.mergeSort(intArray3, (int) (short) 100, (int) (short) 1);
        ds.Ordenacao.mergeSort(intArray3, (int) (short) -1, (-1));
        ds.Ordenacao.mergeSort(intArray3, (int) (short) 1, (int) (short) 0);
        ds.Ordenacao.mergeSort(intArray3, (int) ' ', (int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            ds.Ordenacao.mergeSort(intArray3, (int) (byte) 1, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 3");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[100, 1, 1]");
    }

    @Test
    public void test1584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1584");
        int[] intArray2 = new int[] { ' ', 0 };
        ds.Ordenacao.mergeSort(intArray2, (int) (byte) 1, (int) (short) 1);
        ds.Ordenacao.mergeSort(intArray2, (int) (byte) 0, 0);
        ds.Ordenacao.mergeSort(intArray2, (int) (short) 100, (int) (short) 10);
        ds.Ordenacao.mergeSort(intArray2, (int) '#', (int) (short) 0);
        ds.Ordenacao.mergeSort(intArray2, (int) (short) 100, (int) (short) 1);
        ds.Ordenacao.mergeSort(intArray2, (int) (short) 100, (int) (short) 100);
        ds.Ordenacao.mergeSort(intArray2, (int) (byte) 10, (int) (byte) 10);
        // The following exception was thrown during execution in test generation
        try {
            ds.Ordenacao.mergeSort(intArray2, (int) (byte) 1, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 2");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[32, 0]");
    }

    @Test
    public void test1585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1585");
        int[] intArray3 = new int[] { (byte) 100, (short) 1, (byte) 1 };
        ds.Ordenacao.mergeSort(intArray3, 0, (int) (byte) -1);
        ds.Ordenacao.mergeSort(intArray3, (int) ' ', (int) (short) 1);
        ds.Ordenacao.mergeSort(intArray3, 100, 0);
        ds.Ordenacao.mergeSort(intArray3, (int) (short) 100, (int) 'a');
        ds.Ordenacao.mergeSort(intArray3, (int) 'a', (int) '#');
        ds.Ordenacao.mergeSort(intArray3, (int) (byte) 10, (int) (short) 0);
        ds.Ordenacao.mergeSort(intArray3, 1, (int) (byte) 0);
        ds.Ordenacao.mergeSort(intArray3, 10, 0);
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[100, 1, 1]");
    }

    @Test
    public void test1586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1586");
        int[] intArray3 = new int[] { (byte) 100, (short) 1, (byte) 1 };
        ds.Ordenacao.mergeSort(intArray3, 0, (int) (byte) -1);
        ds.Ordenacao.mergeSort(intArray3, (int) ' ', (int) (short) 1);
        ds.Ordenacao.mergeSort(intArray3, (int) (byte) 0, 0);
        ds.Ordenacao.mergeSort(intArray3, 0, 1);
        ds.Ordenacao.mergeSort(intArray3, (int) (short) 10, (int) (byte) 1);
        ds.Ordenacao.mergeSort(intArray3, 0, (-1));
        ds.Ordenacao.mergeSort(intArray3, (int) ' ', (int) (short) 0);
        ds.Ordenacao.mergeSort(intArray3, (int) (short) 10, 0);
        ds.Ordenacao.mergeSort(intArray3, (int) 'a', 1);
        ds.Ordenacao.mergeSort(intArray3, 10, (int) (byte) 1);
        java.lang.Class<?> wildcardClass34 = intArray3.getClass();
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[1, 100, 1]");
        org.junit.Assert.assertNotNull(wildcardClass34);
    }

    @Test
    public void test1587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1587");
        int[] intArray3 = new int[] { (byte) 100, (short) 1, (byte) 1 };
        ds.Ordenacao.mergeSort(intArray3, 0, (int) (byte) -1);
        ds.Ordenacao.mergeSort(intArray3, (int) ' ', (int) (short) 1);
        ds.Ordenacao.mergeSort(intArray3, 100, 0);
        ds.Ordenacao.mergeSort(intArray3, (int) (short) 100, (int) 'a');
        ds.Ordenacao.mergeSort(intArray3, (int) 'a', (int) '#');
        ds.Ordenacao.mergeSort(intArray3, (int) (byte) 1, (-1));
        ds.Ordenacao.mergeSort(intArray3, 100, (int) (short) 100);
        ds.Ordenacao.mergeSort(intArray3, (int) (byte) 0, (-1));
        ds.Ordenacao.mergeSort(intArray3, (int) 'a', 1);
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[100, 1, 1]");
    }

    @Test
    public void test1588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1588");
        int[] intArray3 = new int[] { (byte) 100, (short) 1, (byte) 1 };
        ds.Ordenacao.mergeSort(intArray3, 0, (int) (byte) -1);
        ds.Ordenacao.mergeSort(intArray3, (int) ' ', (int) (short) 1);
        ds.Ordenacao.mergeSort(intArray3, (int) (byte) 0, 0);
        ds.Ordenacao.mergeSort(intArray3, (int) (short) -1, (-1));
        java.lang.Class<?> wildcardClass16 = intArray3.getClass();
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[100, 1, 1]");
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test1589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1589");
        int[] intArray3 = new int[] { (byte) 100, (short) 1, (byte) 1 };
        ds.Ordenacao.mergeSort(intArray3, 0, (int) (byte) -1);
        ds.Ordenacao.mergeSort(intArray3, (int) '4', (int) (short) 0);
        ds.Ordenacao.mergeSort(intArray3, (int) ' ', (int) (short) 1);
        ds.Ordenacao.mergeSort(intArray3, (int) 'a', (int) (short) 1);
        ds.Ordenacao.mergeSort(intArray3, (int) '#', (int) '#');
        ds.Ordenacao.mergeSort(intArray3, 0, (-1));
        ds.Ordenacao.mergeSort(intArray3, 0, (int) (short) -1);
        java.lang.Class<?> wildcardClass25 = intArray3.getClass();
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[100, 1, 1]");
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test1590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1590");
        int[] intArray3 = new int[] { (byte) 100, (short) 1, (byte) 1 };
        ds.Ordenacao.mergeSort(intArray3, 0, (int) (byte) -1);
        ds.Ordenacao.mergeSort(intArray3, (int) ' ', (int) (short) 1);
        ds.Ordenacao.mergeSort(intArray3, 100, 0);
        ds.Ordenacao.mergeSort(intArray3, (int) (short) 100, (int) 'a');
        ds.Ordenacao.mergeSort(intArray3, 0, (int) (byte) 1);
        ds.Ordenacao.mergeSort(intArray3, 10, 0);
        ds.Ordenacao.mergeSort(intArray3, (int) (short) 1, 0);
        // The following exception was thrown during execution in test generation
        try {
            ds.Ordenacao.mergeSort(intArray3, (int) ' ', (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 32");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[1, 100, 1]");
    }

    @Test
    public void test1591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1591");
        int[] intArray2 = new int[] { 1, (short) 100 };
        ds.Ordenacao.mergeSort(intArray2, (int) '#', 1);
        ds.Ordenacao.mergeSort(intArray2, 0, (int) (short) -1);
        ds.Ordenacao.mergeSort(intArray2, (int) ' ', (-1));
        ds.Ordenacao.mergeSort(intArray2, (int) 'a', 10);
        java.lang.Class<?> wildcardClass15 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[1, 100]");
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test1592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1592");
        int[] intArray3 = new int[] { (byte) 100, (short) 1, (byte) 1 };
        ds.Ordenacao.mergeSort(intArray3, 0, (int) (byte) -1);
        ds.Ordenacao.mergeSort(intArray3, (int) ' ', (int) (short) 1);
        ds.Ordenacao.mergeSort(intArray3, 100, 0);
        ds.Ordenacao.mergeSort(intArray3, (int) (short) 100, (int) 'a');
        ds.Ordenacao.mergeSort(intArray3, 0, (int) (byte) 1);
        ds.Ordenacao.mergeSort(intArray3, 10, 0);
        ds.Ordenacao.mergeSort(intArray3, (int) '4', (int) (short) 10);
        ds.Ordenacao.mergeSort(intArray3, (int) ' ', (int) (byte) 1);
        ds.Ordenacao.mergeSort(intArray3, (int) (byte) 1, (int) (short) 0);
        ds.Ordenacao.mergeSort(intArray3, (int) (short) 100, 0);
        ds.Ordenacao.mergeSort(intArray3, (int) '#', (int) (short) 1);
        ds.Ordenacao.mergeSort(intArray3, (int) 'a', (int) (short) 10);
        java.lang.Class<?> wildcardClass40 = intArray3.getClass();
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[1, 100, 1]");
        org.junit.Assert.assertNotNull(wildcardClass40);
    }

    @Test
    public void test1593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1593");
        int[] intArray3 = new int[] { (byte) 100, (short) 1, (byte) 1 };
        ds.Ordenacao.mergeSort(intArray3, 0, (int) (byte) -1);
        ds.Ordenacao.mergeSort(intArray3, (int) ' ', (int) (short) 1);
        ds.Ordenacao.mergeSort(intArray3, 100, 0);
        ds.Ordenacao.mergeSort(intArray3, (int) (short) 100, (int) 'a');
        ds.Ordenacao.mergeSort(intArray3, 0, (int) (byte) 1);
        ds.Ordenacao.mergeSort(intArray3, 10, 0);
        ds.Ordenacao.mergeSort(intArray3, (int) '4', (int) (short) 10);
        ds.Ordenacao.mergeSort(intArray3, 100, (int) (byte) 1);
        ds.Ordenacao.mergeSort(intArray3, (int) (byte) 10, (int) (short) 1);
        ds.Ordenacao.mergeSort(intArray3, (int) ' ', 0);
        ds.Ordenacao.mergeSort(intArray3, 100, (int) '4');
        java.lang.Class<?> wildcardClass37 = intArray3.getClass();
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[1, 100, 1]");
        org.junit.Assert.assertNotNull(wildcardClass37);
    }

    @Test
    public void test1594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1594");
        int[] intArray2 = new int[] { ' ', 0 };
        ds.Ordenacao.mergeSort(intArray2, (int) (byte) 1, (int) (short) 1);
        ds.Ordenacao.mergeSort(intArray2, (int) ' ', (int) (short) 0);
        ds.Ordenacao.mergeSort(intArray2, 0, (int) (short) -1);
        ds.Ordenacao.mergeSort(intArray2, (int) (short) 10, (int) (byte) 0);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[32, 0]");
    }

    @Test
    public void test1595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1595");
        int[] intArray3 = new int[] { (byte) 100, (short) 1, (byte) 1 };
        ds.Ordenacao.mergeSort(intArray3, 0, (int) (byte) -1);
        ds.Ordenacao.mergeSort(intArray3, (int) '4', (int) (short) 0);
        ds.Ordenacao.mergeSort(intArray3, (int) ' ', (int) (short) 1);
        ds.Ordenacao.mergeSort(intArray3, (int) (byte) 10, 1);
        ds.Ordenacao.mergeSort(intArray3, (int) (byte) 0, (-1));
        ds.Ordenacao.mergeSort(intArray3, (int) 'a', (int) (byte) -1);
        ds.Ordenacao.mergeSort(intArray3, (int) (byte) 10, (int) (byte) 1);
        ds.Ordenacao.mergeSort(intArray3, (int) ' ', (int) (byte) 10);
        ds.Ordenacao.mergeSort(intArray3, (int) ' ', 1);
        ds.Ordenacao.mergeSort(intArray3, (int) (short) 0, (int) (byte) 1);
        java.lang.Class<?> wildcardClass34 = intArray3.getClass();
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[1, 100, 1]");
        org.junit.Assert.assertNotNull(wildcardClass34);
    }

    @Test
    public void test1596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1596");
        int[] intArray3 = new int[] { (byte) 100, (short) 1, (byte) 1 };
        ds.Ordenacao.mergeSort(intArray3, 0, (int) (byte) -1);
        ds.Ordenacao.mergeSort(intArray3, (int) ' ', (int) (short) 1);
        ds.Ordenacao.mergeSort(intArray3, 100, 0);
        ds.Ordenacao.mergeSort(intArray3, (int) (short) 100, (int) 'a');
        ds.Ordenacao.mergeSort(intArray3, (int) 'a', (int) '#');
        ds.Ordenacao.mergeSort(intArray3, (int) 'a', (int) '4');
        ds.Ordenacao.mergeSort(intArray3, (int) (byte) 100, (int) '4');
        ds.Ordenacao.mergeSort(intArray3, (int) 'a', (int) '4');
        // The following exception was thrown during execution in test generation
        try {
            ds.Ordenacao.mergeSort(intArray3, (int) (short) 1, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 3");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[100, 1, 1]");
    }

    @Test
    public void test1597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1597");
        int[] intArray3 = new int[] { (byte) 100, (short) 1, (byte) 1 };
        ds.Ordenacao.mergeSort(intArray3, 0, (int) (byte) -1);
        ds.Ordenacao.mergeSort(intArray3, (int) ' ', (int) (short) 1);
        ds.Ordenacao.mergeSort(intArray3, 100, 0);
        ds.Ordenacao.mergeSort(intArray3, (int) (short) 100, (int) 'a');
        ds.Ordenacao.mergeSort(intArray3, 0, (int) (byte) 1);
        ds.Ordenacao.mergeSort(intArray3, 10, 0);
        ds.Ordenacao.mergeSort(intArray3, (int) '4', (int) (short) 10);
        ds.Ordenacao.mergeSort(intArray3, 0, 1);
        ds.Ordenacao.mergeSort(intArray3, 10, (int) (short) 1);
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[1, 100, 1]");
    }

    @Test
    public void test1598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1598");
        int[] intArray3 = new int[] { (byte) 100, (short) 1, (byte) 1 };
        ds.Ordenacao.mergeSort(intArray3, 0, (int) (byte) -1);
        ds.Ordenacao.mergeSort(intArray3, (int) ' ', (int) (short) 1);
        ds.Ordenacao.mergeSort(intArray3, 100, 0);
        ds.Ordenacao.mergeSort(intArray3, (int) (short) 100, (int) 'a');
        ds.Ordenacao.mergeSort(intArray3, 0, (int) (byte) 1);
        ds.Ordenacao.mergeSort(intArray3, 10, 0);
        ds.Ordenacao.mergeSort(intArray3, 0, 1);
        ds.Ordenacao.mergeSort(intArray3, (int) (byte) 0, (int) (short) 0);
        ds.Ordenacao.mergeSort(intArray3, (int) '4', 0);
        ds.Ordenacao.mergeSort(intArray3, 100, (int) '#');
        java.lang.Class<?> wildcardClass34 = intArray3.getClass();
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[1, 100, 1]");
        org.junit.Assert.assertNotNull(wildcardClass34);
    }

    @Test
    public void test1599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1599");
        int[] intArray0 = null;
        // The following exception was thrown during execution in test generation
        try {
            ds.Ordenacao.mergeSort(intArray0, (int) (byte) 0, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1600");
        int[] intArray3 = new int[] { (byte) 100, (short) 1, (byte) 1 };
        ds.Ordenacao.mergeSort(intArray3, 0, (int) (byte) -1);
        ds.Ordenacao.mergeSort(intArray3, (int) ' ', (int) (short) 1);
        ds.Ordenacao.mergeSort(intArray3, (int) (byte) 10, (-1));
        ds.Ordenacao.mergeSort(intArray3, 1, 0);
        ds.Ordenacao.mergeSort(intArray3, (int) (short) 10, (int) (short) -1);
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[100, 1, 1]");
    }

    @Test
    public void test1601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1601");
        int[] intArray3 = new int[] { (byte) 100, (short) 1, (byte) 1 };
        ds.Ordenacao.mergeSort(intArray3, 0, (int) (byte) -1);
        ds.Ordenacao.mergeSort(intArray3, (int) ' ', (int) (short) 1);
        ds.Ordenacao.mergeSort(intArray3, 100, 0);
        ds.Ordenacao.mergeSort(intArray3, (int) (short) 100, (int) 'a');
        ds.Ordenacao.mergeSort(intArray3, (int) 'a', (int) '#');
        ds.Ordenacao.mergeSort(intArray3, (int) (byte) 10, (int) (short) 0);
        ds.Ordenacao.mergeSort(intArray3, 1, (int) (byte) 0);
        ds.Ordenacao.mergeSort(intArray3, (int) 'a', 1);
        ds.Ordenacao.mergeSort(intArray3, (int) (short) 1, (-1));
        ds.Ordenacao.mergeSort(intArray3, 100, (int) (byte) 10);
        ds.Ordenacao.mergeSort(intArray3, 0, (int) (byte) -1);
        // The following exception was thrown during execution in test generation
        try {
            ds.Ordenacao.mergeSort(intArray3, (int) (short) 10, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 10");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[100, 1, 1]");
    }

    @Test
    public void test1602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1602");
        int[] intArray3 = new int[] { 10, (byte) 0, (byte) 0 };
        ds.Ordenacao.mergeSort(intArray3, 1, (int) (byte) -1);
        ds.Ordenacao.mergeSort(intArray3, (int) (byte) 0, (int) (byte) -1);
        ds.Ordenacao.mergeSort(intArray3, (int) 'a', (int) (byte) 1);
        ds.Ordenacao.mergeSort(intArray3, (int) (short) 0, 0);
        ds.Ordenacao.mergeSort(intArray3, (int) (short) 1, (int) (byte) 0);
        ds.Ordenacao.mergeSort(intArray3, (int) (short) 100, (int) '#');
        java.lang.Class<?> wildcardClass22 = intArray3.getClass();
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[10, 0, 0]");
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test1603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1603");
        int[] intArray3 = new int[] { (byte) 100, (short) 1, (byte) 1 };
        ds.Ordenacao.mergeSort(intArray3, 0, (int) (byte) -1);
        ds.Ordenacao.mergeSort(intArray3, (int) '4', (int) (short) 0);
        ds.Ordenacao.mergeSort(intArray3, (int) ' ', (int) (short) 1);
        ds.Ordenacao.mergeSort(intArray3, (int) ' ', 0);
        ds.Ordenacao.mergeSort(intArray3, 10, 1);
        ds.Ordenacao.mergeSort(intArray3, (int) '#', (int) (byte) 1);
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[100, 1, 1]");
    }

    @Test
    public void test1604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1604");
        int[] intArray2 = new int[] { ' ', 0 };
        ds.Ordenacao.mergeSort(intArray2, (int) (byte) 1, (int) (short) 1);
        ds.Ordenacao.mergeSort(intArray2, (int) (short) 100, (int) (short) 1);
        ds.Ordenacao.mergeSort(intArray2, (int) (short) 1, (int) (byte) 1);
        ds.Ordenacao.mergeSort(intArray2, (int) (byte) 1, 1);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[32, 0]");
    }

    @Test
    public void test1605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1605");
        int[] intArray3 = new int[] { (byte) 100, (short) 1, (byte) 1 };
        ds.Ordenacao.mergeSort(intArray3, 0, (int) (byte) -1);
        ds.Ordenacao.mergeSort(intArray3, (int) 'a', 1);
        ds.Ordenacao.mergeSort(intArray3, (int) '4', 0);
        ds.Ordenacao.mergeSort(intArray3, 100, (int) (byte) -1);
        ds.Ordenacao.mergeSort(intArray3, (int) (short) 1, (int) (byte) 1);
        ds.Ordenacao.mergeSort(intArray3, 10, (int) (byte) 10);
        ds.Ordenacao.mergeSort(intArray3, 1, 1);
        ds.Ordenacao.mergeSort(intArray3, (int) (short) 100, (int) ' ');
        ds.Ordenacao.mergeSort(intArray3, 10, 1);
        ds.Ordenacao.mergeSort(intArray3, 10, (int) (byte) 0);
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[100, 1, 1]");
    }

    @Test
    public void test1606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1606");
        int[] intArray3 = new int[] { 10, (byte) 0, (byte) 0 };
        ds.Ordenacao.mergeSort(intArray3, 1, (int) (byte) -1);
        ds.Ordenacao.mergeSort(intArray3, (int) (byte) 0, (int) (byte) -1);
        ds.Ordenacao.mergeSort(intArray3, (int) 'a', (int) (byte) 1);
        ds.Ordenacao.mergeSort(intArray3, (int) '#', (int) ' ');
        ds.Ordenacao.mergeSort(intArray3, (int) '4', (int) (short) -1);
        ds.Ordenacao.mergeSort(intArray3, (int) '#', (int) (byte) 1);
        ds.Ordenacao.mergeSort(intArray3, (int) '#', (int) (short) 10);
        ds.Ordenacao.mergeSort(intArray3, (int) (byte) 100, (int) (byte) -1);
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[10, 0, 0]");
    }

    @Test
    public void test1607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1607");
        int[] intArray2 = new int[] { ' ', 0 };
        ds.Ordenacao.mergeSort(intArray2, (int) (byte) 1, (int) (short) 1);
        ds.Ordenacao.mergeSort(intArray2, (int) '4', 0);
        ds.Ordenacao.mergeSort(intArray2, (int) (short) 100, (int) '4');
        ds.Ordenacao.mergeSort(intArray2, (int) (byte) 0, (int) (short) -1);
        ds.Ordenacao.mergeSort(intArray2, (int) (byte) 10, 10);
        ds.Ordenacao.mergeSort(intArray2, (int) (byte) 100, (int) (byte) -1);
        java.lang.Class<?> wildcardClass21 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[32, 0]");
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test1608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1608");
        int[] intArray1 = new int[] { '4' };
        ds.Ordenacao.mergeSort(intArray1, (int) '4', (int) (byte) 1);
        ds.Ordenacao.mergeSort(intArray1, 10, 0);
        ds.Ordenacao.mergeSort(intArray1, (int) (byte) 100, (int) ' ');
        ds.Ordenacao.mergeSort(intArray1, (int) (short) 0, 0);
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray1), "[52]");
    }

    @Test
    public void test1609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1609");
        int[] intArray3 = new int[] { 10, (byte) 0, (byte) 0 };
        ds.Ordenacao.mergeSort(intArray3, 1, (int) (byte) -1);
        ds.Ordenacao.mergeSort(intArray3, (int) (byte) 0, (int) (byte) -1);
        ds.Ordenacao.mergeSort(intArray3, (int) 'a', (int) (byte) 1);
        ds.Ordenacao.mergeSort(intArray3, 100, 100);
        ds.Ordenacao.mergeSort(intArray3, 10, (int) (byte) 10);
        ds.Ordenacao.mergeSort(intArray3, (int) (byte) 1, 0);
        ds.Ordenacao.mergeSort(intArray3, (int) '4', (int) (byte) 1);
        ds.Ordenacao.mergeSort(intArray3, (int) (byte) 0, (int) (short) 1);
        ds.Ordenacao.mergeSort(intArray3, (int) '4', 0);
        ds.Ordenacao.mergeSort(intArray3, 10, 0);
        java.lang.Class<?> wildcardClass34 = intArray3.getClass();
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[0, 10, 0]");
        org.junit.Assert.assertNotNull(wildcardClass34);
    }

    @Test
    public void test1610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1610");
        int[] intArray2 = new int[] { ' ', 0 };
        ds.Ordenacao.mergeSort(intArray2, (int) (byte) 1, (int) (short) 1);
        ds.Ordenacao.mergeSort(intArray2, (int) (byte) 0, 0);
        ds.Ordenacao.mergeSort(intArray2, (int) '4', 10);
        ds.Ordenacao.mergeSort(intArray2, (int) ' ', (int) (short) -1);
        ds.Ordenacao.mergeSort(intArray2, (int) (short) 10, (int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            ds.Ordenacao.mergeSort(intArray2, (int) ' ', (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 32");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[32, 0]");
    }

    @Test
    public void test1611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1611");
        int[] intArray3 = new int[] { (byte) 100, (short) 1, (byte) 1 };
        ds.Ordenacao.mergeSort(intArray3, 0, (int) (byte) -1);
        ds.Ordenacao.mergeSort(intArray3, (int) ' ', (int) (short) 1);
        ds.Ordenacao.mergeSort(intArray3, 100, 0);
        ds.Ordenacao.mergeSort(intArray3, (int) (short) 10, 0);
        ds.Ordenacao.mergeSort(intArray3, (int) 'a', (int) (short) 10);
        ds.Ordenacao.mergeSort(intArray3, 1, (int) (byte) -1);
        java.lang.Class<?> wildcardClass22 = intArray3.getClass();
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[100, 1, 1]");
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test1612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1612");
        int[] intArray0 = new int[] {};
        ds.Ordenacao.mergeSort(intArray0, (int) (short) 1, (int) (byte) 0);
        ds.Ordenacao.mergeSort(intArray0, (int) (byte) 1, (int) (short) 0);
        ds.Ordenacao.mergeSort(intArray0, (int) (short) 1, (-1));
        ds.Ordenacao.mergeSort(intArray0, (int) (short) 10, (int) (byte) 10);
        java.lang.Class<?> wildcardClass13 = intArray0.getClass();
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test1613() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1613");
        int[] intArray3 = new int[] { (byte) 100, (short) 1, (byte) 1 };
        ds.Ordenacao.mergeSort(intArray3, 0, (int) (byte) -1);
        ds.Ordenacao.mergeSort(intArray3, (int) '#', 0);
        ds.Ordenacao.mergeSort(intArray3, 0, (int) (byte) 0);
        ds.Ordenacao.mergeSort(intArray3, 1, 1);
        ds.Ordenacao.mergeSort(intArray3, (int) ' ', 1);
        ds.Ordenacao.mergeSort(intArray3, 100, 10);
        ds.Ordenacao.mergeSort(intArray3, (int) 'a', 0);
        java.lang.Class<?> wildcardClass25 = intArray3.getClass();
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[100, 1, 1]");
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test1614() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1614");
        int[] intArray3 = new int[] { 10, (byte) 0, (byte) 0 };
        ds.Ordenacao.mergeSort(intArray3, 1, (int) (byte) -1);
        ds.Ordenacao.mergeSort(intArray3, 100, 0);
        ds.Ordenacao.mergeSort(intArray3, (int) '#', (-1));
        ds.Ordenacao.mergeSort(intArray3, (int) '4', (int) (byte) 1);
        ds.Ordenacao.mergeSort(intArray3, (int) (short) 0, (int) (short) 1);
        ds.Ordenacao.mergeSort(intArray3, (int) '4', (int) (short) -1);
        ds.Ordenacao.mergeSort(intArray3, 10, (int) (byte) 1);
        ds.Ordenacao.mergeSort(intArray3, (int) (short) 100, (int) '4');
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[0, 10, 0]");
    }

    @Test
    public void test1615() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1615");
        int[] intArray3 = new int[] { (byte) 100, (short) 1, (byte) 1 };
        ds.Ordenacao.mergeSort(intArray3, 0, (int) (byte) -1);
        ds.Ordenacao.mergeSort(intArray3, (int) 'a', 1);
        ds.Ordenacao.mergeSort(intArray3, (int) '4', 0);
        ds.Ordenacao.mergeSort(intArray3, (int) (short) 1, (int) (short) 1);
        ds.Ordenacao.mergeSort(intArray3, (int) 'a', (int) ' ');
        ds.Ordenacao.mergeSort(intArray3, 100, (-1));
        ds.Ordenacao.mergeSort(intArray3, (int) ' ', (-1));
        java.lang.Class<?> wildcardClass25 = intArray3.getClass();
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[100, 1, 1]");
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test1616() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1616");
        int[] intArray3 = new int[] { (byte) 100, (short) 1, (byte) 1 };
        ds.Ordenacao.mergeSort(intArray3, 0, (int) (byte) -1);
        ds.Ordenacao.mergeSort(intArray3, (int) ' ', (int) (short) 1);
        ds.Ordenacao.mergeSort(intArray3, 100, 0);
        ds.Ordenacao.mergeSort(intArray3, (int) (short) 100, (int) 'a');
        ds.Ordenacao.mergeSort(intArray3, (int) 'a', (int) '#');
        ds.Ordenacao.mergeSort(intArray3, (int) (byte) 10, (int) (short) 0);
        ds.Ordenacao.mergeSort(intArray3, 1, (int) (byte) 0);
        ds.Ordenacao.mergeSort(intArray3, (int) 'a', 1);
        ds.Ordenacao.mergeSort(intArray3, (int) (short) 1, (-1));
        ds.Ordenacao.mergeSort(intArray3, (int) '4', 0);
        java.lang.Class<?> wildcardClass34 = intArray3.getClass();
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[100, 1, 1]");
        org.junit.Assert.assertNotNull(wildcardClass34);
    }

    @Test
    public void test1617() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1617");
        int[] intArray3 = new int[] { (byte) 100, (short) 1, (byte) 1 };
        ds.Ordenacao.mergeSort(intArray3, 0, (int) (byte) -1);
        ds.Ordenacao.mergeSort(intArray3, (int) ' ', (int) (short) 1);
        ds.Ordenacao.mergeSort(intArray3, 100, 0);
        ds.Ordenacao.mergeSort(intArray3, (int) (short) 10, 0);
        ds.Ordenacao.mergeSort(intArray3, (int) 'a', (int) (short) 10);
        ds.Ordenacao.mergeSort(intArray3, (int) (short) 100, 0);
        ds.Ordenacao.mergeSort(intArray3, (int) (byte) 0, (int) (short) -1);
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[100, 1, 1]");
    }

    @Test
    public void test1618() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1618");
        int[] intArray3 = new int[] { (byte) 100, (short) 1, (byte) 1 };
        ds.Ordenacao.mergeSort(intArray3, 0, (int) (byte) -1);
        ds.Ordenacao.mergeSort(intArray3, (int) ' ', (int) (short) 1);
        ds.Ordenacao.mergeSort(intArray3, (int) (byte) 0, 0);
        ds.Ordenacao.mergeSort(intArray3, 0, 1);
        ds.Ordenacao.mergeSort(intArray3, (int) (short) 10, (int) (byte) 1);
        ds.Ordenacao.mergeSort(intArray3, (int) (short) 10, 10);
        ds.Ordenacao.mergeSort(intArray3, (int) (byte) 1, (int) (byte) -1);
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[1, 100, 1]");
    }

    @Test
    public void test1619() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1619");
        int[] intArray3 = new int[] { (byte) 100, (short) 1, (byte) 1 };
        ds.Ordenacao.mergeSort(intArray3, 0, (int) (byte) -1);
        ds.Ordenacao.mergeSort(intArray3, (int) '4', (int) (short) 0);
        ds.Ordenacao.mergeSort(intArray3, (int) ' ', (int) (short) 1);
        ds.Ordenacao.mergeSort(intArray3, (int) (byte) 10, 1);
        ds.Ordenacao.mergeSort(intArray3, (int) (byte) 0, (-1));
        ds.Ordenacao.mergeSort(intArray3, (int) 'a', (int) (byte) -1);
        ds.Ordenacao.mergeSort(intArray3, (int) (short) 100, (int) (short) 1);
        ds.Ordenacao.mergeSort(intArray3, (int) (short) -1, (-1));
        ds.Ordenacao.mergeSort(intArray3, (int) (short) 1, (int) (short) 0);
        ds.Ordenacao.mergeSort(intArray3, (int) (byte) 100, (int) ' ');
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[100, 1, 1]");
    }

    @Test
    public void test1620() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1620");
        int[] intArray3 = new int[] { (byte) 100, (short) 1, (byte) 1 };
        ds.Ordenacao.mergeSort(intArray3, 0, (int) (byte) -1);
        ds.Ordenacao.mergeSort(intArray3, (int) '4', (int) (short) 0);
        ds.Ordenacao.mergeSort(intArray3, (int) ' ', (int) (short) 1);
        ds.Ordenacao.mergeSort(intArray3, (int) 'a', (int) (short) 1);
        ds.Ordenacao.mergeSort(intArray3, (int) ' ', (int) (byte) 0);
        ds.Ordenacao.mergeSort(intArray3, (int) '#', (int) (byte) 10);
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[100, 1, 1]");
    }

    @Test
    public void test1621() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1621");
        int[] intArray2 = new int[] { 1, (short) 100 };
        ds.Ordenacao.mergeSort(intArray2, (int) '#', 1);
        ds.Ordenacao.mergeSort(intArray2, 0, (int) (short) -1);
        ds.Ordenacao.mergeSort(intArray2, (int) (short) 10, (int) (short) 1);
        ds.Ordenacao.mergeSort(intArray2, (-1), (-1));
        ds.Ordenacao.mergeSort(intArray2, 0, 0);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[1, 100]");
    }

    @Test
    public void test1622() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1622");
        int[] intArray3 = new int[] { 10, (byte) 0, (byte) 0 };
        ds.Ordenacao.mergeSort(intArray3, 1, (int) (byte) -1);
        ds.Ordenacao.mergeSort(intArray3, 100, 0);
        ds.Ordenacao.mergeSort(intArray3, (int) '#', (-1));
        ds.Ordenacao.mergeSort(intArray3, (int) '4', (int) (byte) 1);
        ds.Ordenacao.mergeSort(intArray3, (int) (short) 0, (int) (short) 1);
        ds.Ordenacao.mergeSort(intArray3, 0, 0);
        java.lang.Class<?> wildcardClass22 = intArray3.getClass();
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[0, 10, 0]");
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test1623() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1623");
        int[] intArray3 = new int[] { 10, (byte) 0, (byte) 0 };
        ds.Ordenacao.mergeSort(intArray3, 1, (int) (byte) -1);
        ds.Ordenacao.mergeSort(intArray3, (int) (byte) 0, (int) (byte) -1);
        ds.Ordenacao.mergeSort(intArray3, (int) 'a', (int) (byte) 1);
        ds.Ordenacao.mergeSort(intArray3, 100, 100);
        ds.Ordenacao.mergeSort(intArray3, 10, (int) (byte) 10);
        ds.Ordenacao.mergeSort(intArray3, (int) (byte) 1, 0);
        ds.Ordenacao.mergeSort(intArray3, (int) '4', (int) (byte) 1);
        ds.Ordenacao.mergeSort(intArray3, (int) 'a', (int) (short) 0);
        java.lang.Class<?> wildcardClass28 = intArray3.getClass();
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[10, 0, 0]");
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test1624() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1624");
        int[] intArray3 = new int[] { 10, (byte) 0, (byte) 0 };
        ds.Ordenacao.mergeSort(intArray3, 1, (int) (byte) -1);
        ds.Ordenacao.mergeSort(intArray3, (-1), (-1));
        ds.Ordenacao.mergeSort(intArray3, 1, (int) (byte) 0);
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[10, 0, 0]");
    }

    @Test
    public void test1625() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1625");
        int[] intArray1 = new int[] { '4' };
        ds.Ordenacao.mergeSort(intArray1, (int) '4', (int) (byte) 1);
        ds.Ordenacao.mergeSort(intArray1, (int) (byte) 1, 0);
        ds.Ordenacao.mergeSort(intArray1, 10, (int) (byte) -1);
        ds.Ordenacao.mergeSort(intArray1, (int) 'a', (int) '4');
        ds.Ordenacao.mergeSort(intArray1, (int) ' ', (int) (byte) 0);
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray1), "[52]");
    }

    @Test
    public void test1626() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1626");
        int[] intArray0 = new int[] {};
        ds.Ordenacao.mergeSort(intArray0, (int) (short) 1, (int) (byte) 0);
        ds.Ordenacao.mergeSort(intArray0, 0, (int) (short) -1);
        ds.Ordenacao.mergeSort(intArray0, (int) (short) 100, (int) (byte) 0);
        ds.Ordenacao.mergeSort(intArray0, (int) (byte) 10, (int) (byte) 10);
        ds.Ordenacao.mergeSort(intArray0, (int) (byte) 100, (int) (short) 1);
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
    }

    @Test
    public void test1627() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1627");
        int[] intArray2 = new int[] { 1, (short) 100 };
        ds.Ordenacao.mergeSort(intArray2, (int) '#', 1);
        ds.Ordenacao.mergeSort(intArray2, 0, (int) (short) -1);
        ds.Ordenacao.mergeSort(intArray2, (int) (short) 10, (int) (short) 1);
        ds.Ordenacao.mergeSort(intArray2, (-1), (-1));
        ds.Ordenacao.mergeSort(intArray2, (int) 'a', 1);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[1, 100]");
    }

    @Test
    public void test1628() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1628");
        int[] intArray3 = new int[] { 10, (byte) 0, (byte) 0 };
        ds.Ordenacao.mergeSort(intArray3, 1, (int) (byte) -1);
        ds.Ordenacao.mergeSort(intArray3, (int) (byte) 0, (int) (byte) -1);
        ds.Ordenacao.mergeSort(intArray3, (int) 'a', (int) (byte) 1);
        ds.Ordenacao.mergeSort(intArray3, 100, 100);
        ds.Ordenacao.mergeSort(intArray3, 10, (int) (byte) 10);
        ds.Ordenacao.mergeSort(intArray3, (int) (byte) 100, (int) (short) 10);
        ds.Ordenacao.mergeSort(intArray3, (int) (short) 100, (int) (byte) 0);
        ds.Ordenacao.mergeSort(intArray3, (int) (short) 10, (int) (byte) 0);
        ds.Ordenacao.mergeSort(intArray3, 0, (int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            ds.Ordenacao.mergeSort(intArray3, 1, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 3");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[10, 0, 0]");
    }

    @Test
    public void test1629() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1629");
        int[] intArray3 = new int[] { (byte) 100, (short) 1, (byte) 1 };
        ds.Ordenacao.mergeSort(intArray3, 0, (int) (byte) -1);
        ds.Ordenacao.mergeSort(intArray3, (int) ' ', (int) (short) 1);
        ds.Ordenacao.mergeSort(intArray3, 100, 0);
        ds.Ordenacao.mergeSort(intArray3, (int) (short) 100, (int) 'a');
        ds.Ordenacao.mergeSort(intArray3, (int) 'a', (int) '#');
        ds.Ordenacao.mergeSort(intArray3, (int) (byte) 1, (-1));
        ds.Ordenacao.mergeSort(intArray3, 100, (int) (short) 100);
        ds.Ordenacao.mergeSort(intArray3, 10, 10);
        ds.Ordenacao.mergeSort(intArray3, 10, (-1));
        ds.Ordenacao.mergeSort(intArray3, (int) (byte) 10, (int) (short) 1);
        java.lang.Class<?> wildcardClass34 = intArray3.getClass();
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[100, 1, 1]");
        org.junit.Assert.assertNotNull(wildcardClass34);
    }

    @Test
    public void test1630() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1630");
        int[] intArray3 = new int[] { 10, (byte) 0, (byte) 0 };
        ds.Ordenacao.mergeSort(intArray3, 1, (int) (byte) -1);
        ds.Ordenacao.mergeSort(intArray3, (int) (byte) 0, (int) (byte) -1);
        ds.Ordenacao.mergeSort(intArray3, (int) 'a', (int) (byte) 1);
        ds.Ordenacao.mergeSort(intArray3, 100, 100);
        ds.Ordenacao.mergeSort(intArray3, 10, (int) (byte) 10);
        ds.Ordenacao.mergeSort(intArray3, (int) ' ', (int) (byte) 1);
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[10, 0, 0]");
    }

    @Test
    public void test1631() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1631");
        int[] intArray3 = new int[] { (byte) 100, (short) 1, (byte) 1 };
        ds.Ordenacao.mergeSort(intArray3, 0, (int) (byte) -1);
        ds.Ordenacao.mergeSort(intArray3, (int) 'a', 1);
        ds.Ordenacao.mergeSort(intArray3, (int) '4', 0);
        ds.Ordenacao.mergeSort(intArray3, 100, (int) (byte) -1);
        ds.Ordenacao.mergeSort(intArray3, (int) (short) 1, (int) (byte) 1);
        ds.Ordenacao.mergeSort(intArray3, 10, (int) (byte) 10);
        ds.Ordenacao.mergeSort(intArray3, 1, 1);
        ds.Ordenacao.mergeSort(intArray3, (int) (byte) 100, (int) (byte) 1);
        ds.Ordenacao.mergeSort(intArray3, (int) (short) 1, (int) (short) 0);
        java.lang.Class<?> wildcardClass31 = intArray3.getClass();
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[100, 1, 1]");
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test1632() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1632");
        int[] intArray3 = new int[] { (byte) 100, (short) 1, (byte) 1 };
        ds.Ordenacao.mergeSort(intArray3, 0, (int) (byte) -1);
        ds.Ordenacao.mergeSort(intArray3, (int) ' ', (int) (short) 1);
        ds.Ordenacao.mergeSort(intArray3, 100, 0);
        ds.Ordenacao.mergeSort(intArray3, (int) (byte) 100, (int) (byte) 0);
        ds.Ordenacao.mergeSort(intArray3, (int) (short) 10, (int) (byte) 10);
        ds.Ordenacao.mergeSort(intArray3, (int) '4', 1);
        ds.Ordenacao.mergeSort(intArray3, (int) (byte) 10, (int) (short) 1);
        ds.Ordenacao.mergeSort(intArray3, (int) (byte) 100, 10);
        java.lang.Class<?> wildcardClass28 = intArray3.getClass();
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[100, 1, 1]");
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test1633() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1633");
        int[] intArray2 = new int[] { ' ', 0 };
        ds.Ordenacao.mergeSort(intArray2, (int) (byte) 1, (int) (short) 1);
        ds.Ordenacao.mergeSort(intArray2, (int) (byte) 0, 0);
        ds.Ordenacao.mergeSort(intArray2, (int) (short) -1, (int) (byte) -1);
        ds.Ordenacao.mergeSort(intArray2, (int) 'a', (int) ' ');
        ds.Ordenacao.mergeSort(intArray2, (int) (short) 100, (int) (short) 1);
        ds.Ordenacao.mergeSort(intArray2, (int) (byte) -1, (int) (byte) -1);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[32, 0]");
    }

    @Test
    public void test1634() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1634");
        int[] intArray2 = new int[] { ' ', 0 };
        ds.Ordenacao.mergeSort(intArray2, (int) (byte) 1, (int) (short) 1);
        ds.Ordenacao.mergeSort(intArray2, (int) (byte) 0, 0);
        ds.Ordenacao.mergeSort(intArray2, (int) (short) 100, (int) (short) 10);
        ds.Ordenacao.mergeSort(intArray2, (int) '#', (int) (short) 0);
        ds.Ordenacao.mergeSort(intArray2, (int) (short) 100, (int) (short) 1);
        ds.Ordenacao.mergeSort(intArray2, 0, 1);
        ds.Ordenacao.mergeSort(intArray2, (int) (byte) 100, (int) (short) 1);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[0, 32]");
    }

    @Test
    public void test1635() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1635");
        int[] intArray3 = new int[] { (byte) 100, (short) 1, (byte) 1 };
        ds.Ordenacao.mergeSort(intArray3, 0, (int) (byte) -1);
        ds.Ordenacao.mergeSort(intArray3, (int) 'a', 1);
        ds.Ordenacao.mergeSort(intArray3, (int) '4', 0);
        ds.Ordenacao.mergeSort(intArray3, 100, (int) (byte) -1);
        ds.Ordenacao.mergeSort(intArray3, (int) (short) 10, 0);
        ds.Ordenacao.mergeSort(intArray3, (int) (short) 10, 0);
        ds.Ordenacao.mergeSort(intArray3, (int) (short) 100, 100);
        ds.Ordenacao.mergeSort(intArray3, 10, 1);
        java.lang.Class<?> wildcardClass28 = intArray3.getClass();
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[100, 1, 1]");
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test1636() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1636");
        int[] intArray3 = new int[] { (byte) 100, (short) 1, (byte) 1 };
        ds.Ordenacao.mergeSort(intArray3, 0, (int) (byte) -1);
        ds.Ordenacao.mergeSort(intArray3, (int) ' ', (int) (short) 1);
        ds.Ordenacao.mergeSort(intArray3, (int) (byte) 0, 0);
        ds.Ordenacao.mergeSort(intArray3, 0, 1);
        ds.Ordenacao.mergeSort(intArray3, (int) 'a', (int) (byte) 0);
        ds.Ordenacao.mergeSort(intArray3, (int) (short) 1, (int) (short) 1);
        ds.Ordenacao.mergeSort(intArray3, (int) '#', (int) (short) -1);
        ds.Ordenacao.mergeSort(intArray3, 10, 0);
        ds.Ordenacao.mergeSort(intArray3, (int) 'a', (int) 'a');
        ds.Ordenacao.mergeSort(intArray3, (int) '4', (int) ' ');
        // The following exception was thrown during execution in test generation
        try {
            ds.Ordenacao.mergeSort(intArray3, (int) (byte) 10, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 10");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[1, 100, 1]");
    }

    @Test
    public void test1637() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1637");
        int[] intArray3 = new int[] { (byte) 100, (short) 1, (byte) 1 };
        ds.Ordenacao.mergeSort(intArray3, 0, (int) (byte) -1);
        ds.Ordenacao.mergeSort(intArray3, (int) ' ', (int) (short) 1);
        ds.Ordenacao.mergeSort(intArray3, 100, 0);
        ds.Ordenacao.mergeSort(intArray3, (int) (short) 10, 0);
        ds.Ordenacao.mergeSort(intArray3, (int) 'a', (int) (short) 10);
        // The following exception was thrown during execution in test generation
        try {
            ds.Ordenacao.mergeSort(intArray3, (int) (short) 10, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 10");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[100, 1, 1]");
    }

    @Test
    public void test1638() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1638");
        int[] intArray3 = new int[] { (byte) 100, (short) 1, (byte) 1 };
        ds.Ordenacao.mergeSort(intArray3, 0, (int) (byte) -1);
        ds.Ordenacao.mergeSort(intArray3, (int) ' ', (int) (short) 1);
        ds.Ordenacao.mergeSort(intArray3, 100, 0);
        ds.Ordenacao.mergeSort(intArray3, (int) (byte) 100, (int) (byte) 0);
        ds.Ordenacao.mergeSort(intArray3, (int) (short) 10, (int) (byte) 10);
        ds.Ordenacao.mergeSort(intArray3, (int) '4', 1);
        ds.Ordenacao.mergeSort(intArray3, (int) (byte) 0, (int) (short) 0);
        ds.Ordenacao.mergeSort(intArray3, (int) (byte) 0, (int) (short) -1);
        ds.Ordenacao.mergeSort(intArray3, (int) (byte) 100, (int) '#');
        java.lang.Class<?> wildcardClass31 = intArray3.getClass();
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[100, 1, 1]");
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test1639() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1639");
        int[] intArray2 = new int[] { ' ', 0 };
        ds.Ordenacao.mergeSort(intArray2, (int) (byte) 1, (int) (short) 1);
        ds.Ordenacao.mergeSort(intArray2, (int) (byte) 0, 0);
        ds.Ordenacao.mergeSort(intArray2, (int) '4', 10);
        ds.Ordenacao.mergeSort(intArray2, 100, (int) '4');
        ds.Ordenacao.mergeSort(intArray2, 10, (int) (short) 1);
        ds.Ordenacao.mergeSort(intArray2, (int) ' ', (int) ' ');
        ds.Ordenacao.mergeSort(intArray2, (int) (byte) 10, 10);
        java.lang.Class<?> wildcardClass24 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[32, 0]");
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test1640() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1640");
        int[] intArray1 = new int[] { '4' };
        ds.Ordenacao.mergeSort(intArray1, (int) '4', (int) (byte) 1);
        ds.Ordenacao.mergeSort(intArray1, (int) (byte) 1, 0);
        ds.Ordenacao.mergeSort(intArray1, (int) (short) 1, 0);
        ds.Ordenacao.mergeSort(intArray1, (int) (short) 100, (int) ' ');
        java.lang.Class<?> wildcardClass14 = intArray1.getClass();
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray1), "[52]");
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test1641() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1641");
        int[] intArray2 = new int[] { ' ', 0 };
        ds.Ordenacao.mergeSort(intArray2, (int) (byte) 1, (int) (short) 1);
        ds.Ordenacao.mergeSort(intArray2, (int) (byte) 0, 0);
        ds.Ordenacao.mergeSort(intArray2, (int) (short) 100, (int) (short) 10);
        ds.Ordenacao.mergeSort(intArray2, (int) '#', (int) (short) 0);
        ds.Ordenacao.mergeSort(intArray2, (int) (short) 100, (int) (short) 1);
        ds.Ordenacao.mergeSort(intArray2, (int) (short) 100, (int) (short) 100);
        ds.Ordenacao.mergeSort(intArray2, 10, 10);
        ds.Ordenacao.mergeSort(intArray2, 1, (-1));
        ds.Ordenacao.mergeSort(intArray2, (int) '4', (int) (byte) 10);
        ds.Ordenacao.mergeSort(intArray2, 100, 10);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[32, 0]");
    }

    @Test
    public void test1642() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1642");
        int[] intArray3 = new int[] { (byte) 100, (short) 1, (byte) 1 };
        ds.Ordenacao.mergeSort(intArray3, 0, (int) (byte) -1);
        ds.Ordenacao.mergeSort(intArray3, (int) '4', (int) (short) 0);
        ds.Ordenacao.mergeSort(intArray3, (int) ' ', (int) (short) 1);
        ds.Ordenacao.mergeSort(intArray3, (int) ' ', 1);
        ds.Ordenacao.mergeSort(intArray3, (int) (short) 100, 100);
        java.lang.Class<?> wildcardClass19 = intArray3.getClass();
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[100, 1, 1]");
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test1643() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1643");
        int[] intArray3 = new int[] { (byte) 100, (short) 1, (byte) 1 };
        ds.Ordenacao.mergeSort(intArray3, 0, (int) (byte) -1);
        ds.Ordenacao.mergeSort(intArray3, (int) '#', 0);
        ds.Ordenacao.mergeSort(intArray3, 0, (int) (short) 1);
        ds.Ordenacao.mergeSort(intArray3, (int) (byte) 0, (int) (short) 0);
        ds.Ordenacao.mergeSort(intArray3, (int) 'a', (int) (short) 1);
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[1, 100, 1]");
    }

    @Test
    public void test1644() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1644");
        int[] intArray3 = new int[] { (byte) 100, (short) 1, (byte) 1 };
        ds.Ordenacao.mergeSort(intArray3, 0, (int) (byte) -1);
        ds.Ordenacao.mergeSort(intArray3, (int) ' ', (int) (short) 1);
        ds.Ordenacao.mergeSort(intArray3, 100, 0);
        ds.Ordenacao.mergeSort(intArray3, (int) (short) 100, (int) 'a');
        ds.Ordenacao.mergeSort(intArray3, (int) 'a', (int) '#');
        ds.Ordenacao.mergeSort(intArray3, (int) (byte) 1, (-1));
        ds.Ordenacao.mergeSort(intArray3, (int) (short) 100, (int) (byte) -1);
        ds.Ordenacao.mergeSort(intArray3, (int) (byte) 0, (int) (byte) 0);
        ds.Ordenacao.mergeSort(intArray3, 100, (int) ' ');
        ds.Ordenacao.mergeSort(intArray3, (int) (short) 0, (int) (short) 0);
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[100, 1, 1]");
    }

    @Test
    public void test1645() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1645");
        int[] intArray0 = null;
        ds.Ordenacao.mergeSort(intArray0, (int) 'a', 1);
    }

    @Test
    public void test1646() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1646");
        int[] intArray3 = new int[] { (byte) 100, (short) 1, (byte) 1 };
        ds.Ordenacao.mergeSort(intArray3, 0, (int) (byte) -1);
        ds.Ordenacao.mergeSort(intArray3, (int) '4', (int) (short) 0);
        ds.Ordenacao.mergeSort(intArray3, (int) ' ', (int) (short) 1);
        ds.Ordenacao.mergeSort(intArray3, (int) (byte) 10, 1);
        ds.Ordenacao.mergeSort(intArray3, (int) (byte) 0, (-1));
        ds.Ordenacao.mergeSort(intArray3, (int) 'a', (int) (byte) -1);
        ds.Ordenacao.mergeSort(intArray3, (int) (byte) 10, (int) (byte) 1);
        ds.Ordenacao.mergeSort(intArray3, (int) ' ', (int) (byte) 10);
        ds.Ordenacao.mergeSort(intArray3, (int) ' ', 1);
        ds.Ordenacao.mergeSort(intArray3, 0, (int) (byte) -1);
        ds.Ordenacao.mergeSort(intArray3, (int) ' ', (int) (byte) 0);
        ds.Ordenacao.mergeSort(intArray3, 0, 1);
        ds.Ordenacao.mergeSort(intArray3, (int) '#', 10);
        ds.Ordenacao.mergeSort(intArray3, (int) '#', (int) (byte) 1);
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[1, 100, 1]");
    }

    @Test
    public void test1647() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1647");
        int[] intArray3 = new int[] { (byte) 100, (short) 1, (byte) 1 };
        ds.Ordenacao.mergeSort(intArray3, 0, (int) (byte) -1);
        ds.Ordenacao.mergeSort(intArray3, (int) '#', 0);
        ds.Ordenacao.mergeSort(intArray3, 0, (int) (short) 1);
        ds.Ordenacao.mergeSort(intArray3, (int) '#', (int) (byte) -1);
        ds.Ordenacao.mergeSort(intArray3, (-1), (int) (byte) -1);
        java.lang.Class<?> wildcardClass19 = intArray3.getClass();
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[1, 100, 1]");
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test1648() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1648");
        int[] intArray0 = new int[] {};
        ds.Ordenacao.mergeSort(intArray0, (int) (short) 1, (int) (byte) 0);
        ds.Ordenacao.mergeSort(intArray0, (int) (byte) 1, (int) (short) 0);
        ds.Ordenacao.mergeSort(intArray0, (int) (byte) 10, (int) (short) 10);
        ds.Ordenacao.mergeSort(intArray0, (int) '#', (int) ' ');
        ds.Ordenacao.mergeSort(intArray0, (int) (byte) 100, (int) (byte) 100);
        // The following exception was thrown during execution in test generation
        try {
            ds.Ordenacao.mergeSort(intArray0, 10, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 10");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
    }

    @Test
    public void test1649() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1649");
        int[] intArray3 = new int[] { (byte) 100, (short) 1, (byte) 1 };
        ds.Ordenacao.mergeSort(intArray3, 0, (int) (byte) -1);
        ds.Ordenacao.mergeSort(intArray3, (int) ' ', (int) (short) 1);
        ds.Ordenacao.mergeSort(intArray3, (int) (byte) 0, 0);
        ds.Ordenacao.mergeSort(intArray3, 0, 1);
        ds.Ordenacao.mergeSort(intArray3, (int) (short) 10, (int) (short) 1);
        ds.Ordenacao.mergeSort(intArray3, 1, 1);
        ds.Ordenacao.mergeSort(intArray3, (int) 'a', (int) '#');
        ds.Ordenacao.mergeSort(intArray3, (int) 'a', (int) (byte) -1);
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[1, 100, 1]");
    }

    @Test
    public void test1650() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1650");
        int[] intArray3 = new int[] { 10, (byte) 0, (byte) 0 };
        ds.Ordenacao.mergeSort(intArray3, 1, (int) (byte) -1);
        ds.Ordenacao.mergeSort(intArray3, 100, 0);
        ds.Ordenacao.mergeSort(intArray3, (int) '#', (-1));
        ds.Ordenacao.mergeSort(intArray3, (int) (short) 100, (int) ' ');
        ds.Ordenacao.mergeSort(intArray3, 100, (int) 'a');
        ds.Ordenacao.mergeSort(intArray3, (int) '#', (int) (short) 0);
        ds.Ordenacao.mergeSort(intArray3, (int) (byte) 100, (int) (short) 1);
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[10, 0, 0]");
    }

    @Test
    public void test1651() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1651");
        int[] intArray1 = new int[] { '4' };
        ds.Ordenacao.mergeSort(intArray1, (int) '4', (int) (byte) 1);
        ds.Ordenacao.mergeSort(intArray1, (int) (short) 10, (int) (byte) 0);
        ds.Ordenacao.mergeSort(intArray1, (int) '#', 0);
        ds.Ordenacao.mergeSort(intArray1, (int) 'a', (int) (short) 0);
        ds.Ordenacao.mergeSort(intArray1, (int) ' ', (int) (short) -1);
        ds.Ordenacao.mergeSort(intArray1, (int) 'a', 0);
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray1), "[52]");
    }

    @Test
    public void test1652() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1652");
        int[] intArray3 = new int[] { (byte) 100, (short) 1, (byte) 1 };
        ds.Ordenacao.mergeSort(intArray3, 0, (int) (byte) -1);
        ds.Ordenacao.mergeSort(intArray3, (int) ' ', (int) (short) 1);
        ds.Ordenacao.mergeSort(intArray3, 100, 0);
        ds.Ordenacao.mergeSort(intArray3, (int) (short) 100, (int) 'a');
        ds.Ordenacao.mergeSort(intArray3, 0, (int) (byte) 1);
        ds.Ordenacao.mergeSort(intArray3, 10, 0);
        ds.Ordenacao.mergeSort(intArray3, (int) '4', (int) (short) 10);
        ds.Ordenacao.mergeSort(intArray3, (int) ' ', (int) (byte) 1);
        ds.Ordenacao.mergeSort(intArray3, (int) (byte) 1, (int) (short) 0);
        ds.Ordenacao.mergeSort(intArray3, (int) (short) 100, 0);
        ds.Ordenacao.mergeSort(intArray3, (int) (short) 100, (int) (short) 0);
        ds.Ordenacao.mergeSort(intArray3, 0, (int) (short) 0);
        ds.Ordenacao.mergeSort(intArray3, (int) (byte) 100, 100);
        java.lang.Class<?> wildcardClass43 = intArray3.getClass();
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[1, 100, 1]");
        org.junit.Assert.assertNotNull(wildcardClass43);
    }

    @Test
    public void test1653() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1653");
        int[] intArray0 = new int[] {};
        ds.Ordenacao.mergeSort(intArray0, (int) (short) 1, (int) (byte) 0);
        ds.Ordenacao.mergeSort(intArray0, 100, 1);
        java.lang.Class<?> wildcardClass7 = intArray0.getClass();
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test1654() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1654");
        int[] intArray3 = new int[] { 10, (byte) 0, (byte) 0 };
        ds.Ordenacao.mergeSort(intArray3, 1, (int) (byte) -1);
        ds.Ordenacao.mergeSort(intArray3, 10, 0);
        ds.Ordenacao.mergeSort(intArray3, 0, (int) (byte) 0);
        ds.Ordenacao.mergeSort(intArray3, 0, 0);
        ds.Ordenacao.mergeSort(intArray3, (int) 'a', (int) (short) -1);
        ds.Ordenacao.mergeSort(intArray3, (int) ' ', 0);
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[10, 0, 0]");
    }

    @Test
    public void test1655() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1655");
        int[] intArray3 = new int[] { (byte) 100, (short) 1, (byte) 1 };
        ds.Ordenacao.mergeSort(intArray3, 0, (int) (byte) -1);
        ds.Ordenacao.mergeSort(intArray3, (int) 'a', 1);
        ds.Ordenacao.mergeSort(intArray3, 1, (int) (byte) 0);
        ds.Ordenacao.mergeSort(intArray3, (int) (short) 1, 0);
        ds.Ordenacao.mergeSort(intArray3, (int) (short) 1, (int) (byte) 1);
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[100, 1, 1]");
    }

    @Test
    public void test1656() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1656");
        int[] intArray0 = new int[] {};
        ds.Ordenacao.mergeSort(intArray0, (int) (short) 1, (int) (byte) 0);
        ds.Ordenacao.mergeSort(intArray0, (int) (byte) 1, (int) (short) 0);
        ds.Ordenacao.mergeSort(intArray0, 100, 1);
        ds.Ordenacao.mergeSort(intArray0, (int) (byte) 1, (int) (byte) 0);
        ds.Ordenacao.mergeSort(intArray0, (int) (short) 10, (-1));
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
    }

    @Test
    public void test1657() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1657");
        int[] intArray2 = new int[] { ' ', 0 };
        ds.Ordenacao.mergeSort(intArray2, (int) (byte) 1, (int) (short) 1);
        ds.Ordenacao.mergeSort(intArray2, (int) (byte) 0, 0);
        ds.Ordenacao.mergeSort(intArray2, (int) '4', 10);
        ds.Ordenacao.mergeSort(intArray2, (int) ' ', (int) (short) -1);
        ds.Ordenacao.mergeSort(intArray2, 0, (int) (byte) 0);
        ds.Ordenacao.mergeSort(intArray2, (int) '4', (int) (short) 10);
        java.lang.Class<?> wildcardClass21 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[32, 0]");
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test1658() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1658");
        int[] intArray3 = new int[] { 10, (byte) 0, (byte) 0 };
        ds.Ordenacao.mergeSort(intArray3, 1, (int) (byte) -1);
        ds.Ordenacao.mergeSort(intArray3, 10, 0);
        ds.Ordenacao.mergeSort(intArray3, (int) (short) 0, 0);
        ds.Ordenacao.mergeSort(intArray3, (int) (byte) 0, (int) (byte) 0);
        ds.Ordenacao.mergeSort(intArray3, (int) 'a', 0);
        // The following exception was thrown during execution in test generation
        try {
            ds.Ordenacao.mergeSort(intArray3, 0, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 3");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[0, 0, 10]");
    }

    @Test
    public void test1659() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1659");
        int[] intArray3 = new int[] { (byte) 100, (short) 1, (byte) 1 };
        ds.Ordenacao.mergeSort(intArray3, 0, (int) (byte) -1);
        ds.Ordenacao.mergeSort(intArray3, (int) ' ', (int) (short) 1);
        ds.Ordenacao.mergeSort(intArray3, 100, 0);
        ds.Ordenacao.mergeSort(intArray3, (int) (short) 100, (int) 'a');
        ds.Ordenacao.mergeSort(intArray3, (int) 'a', (int) '#');
        ds.Ordenacao.mergeSort(intArray3, (int) (byte) 1, (-1));
        ds.Ordenacao.mergeSort(intArray3, 100, (int) (short) 100);
        ds.Ordenacao.mergeSort(intArray3, 10, 10);
        ds.Ordenacao.mergeSort(intArray3, 10, (-1));
        ds.Ordenacao.mergeSort(intArray3, (int) (byte) 10, (int) (short) 1);
        ds.Ordenacao.mergeSort(intArray3, (int) (short) 100, (int) (short) 1);
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[100, 1, 1]");
    }

    @Test
    public void test1660() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1660");
        int[] intArray2 = new int[] { ' ', 0 };
        ds.Ordenacao.mergeSort(intArray2, (int) (byte) 1, (int) (short) 1);
        ds.Ordenacao.mergeSort(intArray2, (int) '4', 0);
        ds.Ordenacao.mergeSort(intArray2, (int) '#', (int) (byte) -1);
        ds.Ordenacao.mergeSort(intArray2, (int) '4', (-1));
        ds.Ordenacao.mergeSort(intArray2, (int) (short) -1, (int) (short) -1);
        ds.Ordenacao.mergeSort(intArray2, 0, (-1));
        ds.Ordenacao.mergeSort(intArray2, (int) (byte) 0, (int) (byte) 0);
        ds.Ordenacao.mergeSort(intArray2, (int) '#', (int) (byte) 0);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[32, 0]");
    }

    @Test
    public void test1661() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1661");
        int[] intArray3 = new int[] { (byte) 100, (short) 1, (byte) 1 };
        ds.Ordenacao.mergeSort(intArray3, 0, (int) (byte) -1);
        ds.Ordenacao.mergeSort(intArray3, (int) ' ', (int) (short) 1);
        ds.Ordenacao.mergeSort(intArray3, 100, 0);
        ds.Ordenacao.mergeSort(intArray3, (int) (short) 100, (int) 'a');
        ds.Ordenacao.mergeSort(intArray3, 0, (int) (byte) 1);
        ds.Ordenacao.mergeSort(intArray3, 10, 0);
        ds.Ordenacao.mergeSort(intArray3, (int) (short) 1, 0);
        ds.Ordenacao.mergeSort(intArray3, (int) ' ', (int) (byte) 1);
        ds.Ordenacao.mergeSort(intArray3, 0, (-1));
        ds.Ordenacao.mergeSort(intArray3, 10, (int) (byte) -1);
        ds.Ordenacao.mergeSort(intArray3, (int) (byte) 0, (int) (short) -1);
        ds.Ordenacao.mergeSort(intArray3, (int) (short) 10, (int) (short) 1);
        ds.Ordenacao.mergeSort(intArray3, (int) (byte) 100, (int) '#');
        java.lang.Class<?> wildcardClass43 = intArray3.getClass();
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[1, 100, 1]");
        org.junit.Assert.assertNotNull(wildcardClass43);
    }

    @Test
    public void test1662() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1662");
        int[] intArray3 = new int[] { (byte) 100, (short) 1, (byte) 1 };
        ds.Ordenacao.mergeSort(intArray3, 0, (int) (byte) -1);
        ds.Ordenacao.mergeSort(intArray3, (int) ' ', (int) (short) 1);
        ds.Ordenacao.mergeSort(intArray3, 100, 0);
        ds.Ordenacao.mergeSort(intArray3, (int) (byte) 100, (int) (byte) 0);
        ds.Ordenacao.mergeSort(intArray3, (int) (short) 10, (int) (byte) 10);
        ds.Ordenacao.mergeSort(intArray3, 100, (int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            ds.Ordenacao.mergeSort(intArray3, (int) (byte) 0, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 3");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[1, 100, 1]");
    }

    @Test
    public void test1663() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1663");
        int[] intArray3 = new int[] { 10, (byte) 0, (byte) 0 };
        ds.Ordenacao.mergeSort(intArray3, 1, (int) (byte) -1);
        ds.Ordenacao.mergeSort(intArray3, 10, 0);
        ds.Ordenacao.mergeSort(intArray3, (int) (short) 0, 0);
        ds.Ordenacao.mergeSort(intArray3, 10, (int) (byte) 0);
        ds.Ordenacao.mergeSort(intArray3, (int) (byte) 10, 0);
        ds.Ordenacao.mergeSort(intArray3, (int) '4', (int) '4');
        ds.Ordenacao.mergeSort(intArray3, (int) (byte) 100, (int) (short) 0);
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[10, 0, 0]");
    }

    @Test
    public void test1664() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1664");
        int[] intArray1 = new int[] { '4' };
        ds.Ordenacao.mergeSort(intArray1, (int) '4', (int) (byte) 1);
        ds.Ordenacao.mergeSort(intArray1, 10, 0);
        ds.Ordenacao.mergeSort(intArray1, (int) (byte) 100, (int) ' ');
        ds.Ordenacao.mergeSort(intArray1, (int) (short) 100, (int) (short) 10);
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray1), "[52]");
    }

    @Test
    public void test1665() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1665");
        int[] intArray3 = new int[] { (byte) 100, (short) 1, (byte) 1 };
        ds.Ordenacao.mergeSort(intArray3, 0, (int) (byte) -1);
        ds.Ordenacao.mergeSort(intArray3, (int) ' ', (int) (short) 1);
        ds.Ordenacao.mergeSort(intArray3, 100, 0);
        ds.Ordenacao.mergeSort(intArray3, (int) (short) 100, (int) 'a');
        ds.Ordenacao.mergeSort(intArray3, (int) 'a', (int) '#');
        ds.Ordenacao.mergeSort(intArray3, (int) (byte) 1, (-1));
        ds.Ordenacao.mergeSort(intArray3, (int) (byte) 100, (int) (short) -1);
        // The following exception was thrown during execution in test generation
        try {
            ds.Ordenacao.mergeSort(intArray3, (int) ' ', (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[100, 1, 1]");
    }

    @Test
    public void test1666() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1666");
        int[] intArray3 = new int[] { (byte) 100, (short) 1, (byte) 1 };
        ds.Ordenacao.mergeSort(intArray3, 0, (int) (byte) -1);
        ds.Ordenacao.mergeSort(intArray3, (int) '4', (int) (short) 0);
        ds.Ordenacao.mergeSort(intArray3, (int) ' ', (int) (short) 1);
        ds.Ordenacao.mergeSort(intArray3, (int) ' ', 0);
        ds.Ordenacao.mergeSort(intArray3, (int) (byte) 100, (-1));
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[100, 1, 1]");
    }

    @Test
    public void test1667() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1667");
        int[] intArray3 = new int[] { 10, (byte) 0, (byte) 0 };
        ds.Ordenacao.mergeSort(intArray3, 1, (int) (byte) -1);
        ds.Ordenacao.mergeSort(intArray3, (int) (byte) 0, (int) (byte) -1);
        ds.Ordenacao.mergeSort(intArray3, (int) ' ', (int) (short) -1);
        // The following exception was thrown during execution in test generation
        try {
            ds.Ordenacao.mergeSort(intArray3, (int) (short) 0, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 3");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[0, 10, 0]");
    }

    @Test
    public void test1668() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1668");
        int[] intArray3 = new int[] { (byte) 100, (short) 1, (byte) 1 };
        ds.Ordenacao.mergeSort(intArray3, 0, (int) (byte) -1);
        ds.Ordenacao.mergeSort(intArray3, (int) ' ', (int) (short) 1);
        ds.Ordenacao.mergeSort(intArray3, 100, 0);
        ds.Ordenacao.mergeSort(intArray3, (int) (short) 100, (int) 'a');
        ds.Ordenacao.mergeSort(intArray3, 0, (int) (byte) 1);
        ds.Ordenacao.mergeSort(intArray3, 10, 0);
        ds.Ordenacao.mergeSort(intArray3, (int) '4', (int) (short) 10);
        ds.Ordenacao.mergeSort(intArray3, 100, (int) (byte) 1);
        ds.Ordenacao.mergeSort(intArray3, (int) (byte) 10, (int) (short) 1);
        ds.Ordenacao.mergeSort(intArray3, (int) ' ', 0);
        ds.Ordenacao.mergeSort(intArray3, (int) '#', (int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            ds.Ordenacao.mergeSort(intArray3, (int) (short) 10, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 10");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[1, 100, 1]");
    }

    @Test
    public void test1669() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1669");
        int[] intArray3 = new int[] { 10, (byte) 0, (byte) 0 };
        ds.Ordenacao.mergeSort(intArray3, 1, (int) (byte) -1);
        ds.Ordenacao.mergeSort(intArray3, (int) (byte) 0, (int) (byte) -1);
        ds.Ordenacao.mergeSort(intArray3, (int) 'a', (int) (byte) 1);
        ds.Ordenacao.mergeSort(intArray3, 100, 100);
        ds.Ordenacao.mergeSort(intArray3, 10, (int) (byte) 10);
        ds.Ordenacao.mergeSort(intArray3, (int) (byte) 1, 0);
        ds.Ordenacao.mergeSort(intArray3, (int) '4', (int) (byte) 1);
        ds.Ordenacao.mergeSort(intArray3, (int) (byte) 0, (int) (short) 1);
        ds.Ordenacao.mergeSort(intArray3, (int) '4', 0);
        ds.Ordenacao.mergeSort(intArray3, 10, 0);
        // The following exception was thrown during execution in test generation
        try {
            ds.Ordenacao.mergeSort(intArray3, (int) (byte) 1, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 3");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[0, 0, 10]");
    }

    @Test
    public void test1670() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1670");
        int[] intArray3 = new int[] { (byte) 100, (short) 1, (byte) 1 };
        ds.Ordenacao.mergeSort(intArray3, 0, (int) (byte) -1);
        ds.Ordenacao.mergeSort(intArray3, (int) ' ', (int) (short) 1);
        ds.Ordenacao.mergeSort(intArray3, (int) '#', (int) (short) 1);
        ds.Ordenacao.mergeSort(intArray3, 0, (int) (byte) -1);
        ds.Ordenacao.mergeSort(intArray3, (int) (short) 100, (int) (short) 100);
        ds.Ordenacao.mergeSort(intArray3, 10, (int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            ds.Ordenacao.mergeSort(intArray3, (int) (byte) 1, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 3");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[100, 1, 1]");
    }

    @Test
    public void test1671() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1671");
        int[] intArray0 = null;
        ds.Ordenacao.mergeSort(intArray0, 0, (int) (short) -1);
    }

    @Test
    public void test1672() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1672");
        int[] intArray2 = new int[] { ' ', 0 };
        ds.Ordenacao.mergeSort(intArray2, (int) (byte) 1, (int) (short) 1);
        ds.Ordenacao.mergeSort(intArray2, (int) (byte) 0, 0);
        ds.Ordenacao.mergeSort(intArray2, (int) '4', 10);
        ds.Ordenacao.mergeSort(intArray2, 100, (int) '4');
        ds.Ordenacao.mergeSort(intArray2, (int) (byte) 1, (int) (byte) 0);
        ds.Ordenacao.mergeSort(intArray2, (int) (short) 0, (int) (byte) 1);
        ds.Ordenacao.mergeSort(intArray2, 0, (int) (byte) -1);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[0, 32]");
    }

    @Test
    public void test1673() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1673");
        int[] intArray3 = new int[] { (byte) 100, (short) 1, (byte) 1 };
        ds.Ordenacao.mergeSort(intArray3, 0, (int) (byte) -1);
        ds.Ordenacao.mergeSort(intArray3, (int) ' ', (int) (short) 1);
        ds.Ordenacao.mergeSort(intArray3, 100, 0);
        ds.Ordenacao.mergeSort(intArray3, (int) (short) 100, (int) 'a');
        ds.Ordenacao.mergeSort(intArray3, (int) 'a', (int) '#');
        ds.Ordenacao.mergeSort(intArray3, (int) (byte) 1, (-1));
        ds.Ordenacao.mergeSort(intArray3, 100, (int) (short) 100);
        ds.Ordenacao.mergeSort(intArray3, 10, 10);
        ds.Ordenacao.mergeSort(intArray3, 100, 1);
        ds.Ordenacao.mergeSort(intArray3, (int) (byte) 1, 1);
        ds.Ordenacao.mergeSort(intArray3, 10, (int) (byte) 0);
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[100, 1, 1]");
    }

    @Test
    public void test1674() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1674");
        int[] intArray3 = new int[] { 10, (byte) 0, (byte) 0 };
        ds.Ordenacao.mergeSort(intArray3, 1, (int) (byte) -1);
        ds.Ordenacao.mergeSort(intArray3, 10, 0);
        ds.Ordenacao.mergeSort(intArray3, (int) (byte) 10, (int) (byte) -1);
        ds.Ordenacao.mergeSort(intArray3, (int) (short) 100, (int) '4');
        ds.Ordenacao.mergeSort(intArray3, (int) 'a', (int) (short) 0);
        ds.Ordenacao.mergeSort(intArray3, (int) ' ', (int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            ds.Ordenacao.mergeSort(intArray3, (int) '4', 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 52");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[10, 0, 0]");
    }

    @Test
    public void test1675() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1675");
        int[] intArray3 = new int[] { (byte) 100, (short) 1, (byte) 1 };
        ds.Ordenacao.mergeSort(intArray3, 0, (int) (byte) -1);
        ds.Ordenacao.mergeSort(intArray3, (int) ' ', (int) (short) 1);
        ds.Ordenacao.mergeSort(intArray3, 100, 0);
        ds.Ordenacao.mergeSort(intArray3, (int) (short) 10, 0);
        // The following exception was thrown during execution in test generation
        try {
            ds.Ordenacao.mergeSort(intArray3, 1, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 3");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[100, 1, 1]");
    }

    @Test
    public void test1676() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1676");
        int[] intArray3 = new int[] { (byte) 100, (short) 1, (byte) 1 };
        ds.Ordenacao.mergeSort(intArray3, 0, (int) (byte) -1);
        ds.Ordenacao.mergeSort(intArray3, (int) ' ', (int) (short) 1);
        ds.Ordenacao.mergeSort(intArray3, (int) '#', (int) (short) 1);
        ds.Ordenacao.mergeSort(intArray3, (int) '#', (int) (short) -1);
        ds.Ordenacao.mergeSort(intArray3, (int) (byte) 100, (int) (byte) 100);
        ds.Ordenacao.mergeSort(intArray3, 0, 0);
        // The following exception was thrown during execution in test generation
        try {
            ds.Ordenacao.mergeSort(intArray3, (int) ' ', (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 32");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[100, 1, 1]");
    }

    @Test
    public void test1677() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1677");
        int[] intArray3 = new int[] { 10, (byte) 0, (byte) 0 };
        ds.Ordenacao.mergeSort(intArray3, 1, (int) (byte) -1);
        ds.Ordenacao.mergeSort(intArray3, (int) (byte) 0, (int) (byte) -1);
        ds.Ordenacao.mergeSort(intArray3, (int) 'a', (int) (byte) 1);
        ds.Ordenacao.mergeSort(intArray3, 100, 100);
        ds.Ordenacao.mergeSort(intArray3, (int) '4', (int) (short) 10);
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[10, 0, 0]");
    }

    @Test
    public void test1678() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1678");
        int[] intArray3 = new int[] { 10, (byte) 0, (byte) 0 };
        ds.Ordenacao.mergeSort(intArray3, 1, (int) (byte) -1);
        ds.Ordenacao.mergeSort(intArray3, (int) (byte) 0, (int) (byte) -1);
        ds.Ordenacao.mergeSort(intArray3, (int) 'a', (int) (byte) 1);
        ds.Ordenacao.mergeSort(intArray3, 100, 100);
        // The following exception was thrown during execution in test generation
        try {
            ds.Ordenacao.mergeSort(intArray3, (int) ' ', (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[10, 0, 0]");
    }

    @Test
    public void test1679() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1679");
        int[] intArray0 = new int[] {};
        ds.Ordenacao.mergeSort(intArray0, (int) (short) 1, (int) (byte) 0);
        ds.Ordenacao.mergeSort(intArray0, (int) (byte) 1, (int) (short) 0);
        ds.Ordenacao.mergeSort(intArray0, (int) ' ', (int) (byte) -1);
        ds.Ordenacao.mergeSort(intArray0, (int) (short) 100, (int) (short) -1);
        ds.Ordenacao.mergeSort(intArray0, (int) '4', 0);
        ds.Ordenacao.mergeSort(intArray0, (int) (short) 0, (int) (byte) -1);
        ds.Ordenacao.mergeSort(intArray0, (int) '#', (int) (byte) 10);
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
    }

    @Test
    public void test1680() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1680");
        int[] intArray2 = new int[] { ' ', 0 };
        ds.Ordenacao.mergeSort(intArray2, (int) (byte) 1, (int) (short) 1);
        ds.Ordenacao.mergeSort(intArray2, (int) (byte) 0, 0);
        ds.Ordenacao.mergeSort(intArray2, (int) (short) 100, (int) (short) 10);
        ds.Ordenacao.mergeSort(intArray2, (int) (byte) 100, 0);
        ds.Ordenacao.mergeSort(intArray2, (int) (byte) 100, 10);
        java.lang.Class<?> wildcardClass18 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[32, 0]");
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test1681() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1681");
        int[] intArray3 = new int[] { (byte) 100, (short) 1, (byte) 1 };
        ds.Ordenacao.mergeSort(intArray3, 0, (int) (byte) -1);
        ds.Ordenacao.mergeSort(intArray3, (int) '#', (int) (byte) 10);
        ds.Ordenacao.mergeSort(intArray3, (int) (byte) 0, (int) (byte) 1);
        ds.Ordenacao.mergeSort(intArray3, (int) (short) 100, (int) (short) -1);
        ds.Ordenacao.mergeSort(intArray3, (int) 'a', (int) (byte) 10);
        ds.Ordenacao.mergeSort(intArray3, (int) (byte) 100, (int) (byte) 1);
        ds.Ordenacao.mergeSort(intArray3, 10, (int) (short) 0);
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[1, 100, 1]");
    }

    @Test
    public void test1682() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1682");
        int[] intArray2 = new int[] { ' ', 0 };
        ds.Ordenacao.mergeSort(intArray2, (int) (byte) 1, (int) (short) 1);
        ds.Ordenacao.mergeSort(intArray2, (int) (byte) 0, 0);
        ds.Ordenacao.mergeSort(intArray2, (int) '#', (int) '#');
        ds.Ordenacao.mergeSort(intArray2, (int) (byte) 1, (-1));
        ds.Ordenacao.mergeSort(intArray2, (int) '#', 0);
        // The following exception was thrown during execution in test generation
        try {
            ds.Ordenacao.mergeSort(intArray2, 10, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 10");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[32, 0]");
    }

    @Test
    public void test1683() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1683");
        int[] intArray3 = new int[] { 10, (byte) 0, (byte) 0 };
        ds.Ordenacao.mergeSort(intArray3, 1, (int) (byte) -1);
        ds.Ordenacao.mergeSort(intArray3, (int) (byte) 0, (int) (byte) -1);
        ds.Ordenacao.mergeSort(intArray3, (int) 'a', (int) (byte) 1);
        ds.Ordenacao.mergeSort(intArray3, 100, 100);
        ds.Ordenacao.mergeSort(intArray3, 10, (int) (byte) 10);
        ds.Ordenacao.mergeSort(intArray3, (int) (byte) 1, 0);
        ds.Ordenacao.mergeSort(intArray3, (int) (short) 100, 10);
        java.lang.Class<?> wildcardClass25 = intArray3.getClass();
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[10, 0, 0]");
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test1684() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1684");
        int[] intArray3 = new int[] { 10, (byte) 0, (byte) 0 };
        ds.Ordenacao.mergeSort(intArray3, 1, (int) (byte) -1);
        ds.Ordenacao.mergeSort(intArray3, (int) (byte) 0, (int) (byte) -1);
        ds.Ordenacao.mergeSort(intArray3, (int) 'a', (int) (byte) 1);
        ds.Ordenacao.mergeSort(intArray3, (int) '#', (int) ' ');
        ds.Ordenacao.mergeSort(intArray3, (int) '#', (int) (byte) 1);
        ds.Ordenacao.mergeSort(intArray3, (int) (byte) 100, (int) (byte) 100);
        ds.Ordenacao.mergeSort(intArray3, (int) '4', (int) '#');
        ds.Ordenacao.mergeSort(intArray3, 100, (int) ' ');
        ds.Ordenacao.mergeSort(intArray3, (int) (byte) 100, (int) (byte) 1);
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[10, 0, 0]");
    }

    @Test
    public void test1685() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1685");
        int[] intArray2 = new int[] { ' ', 0 };
        ds.Ordenacao.mergeSort(intArray2, (int) (byte) 1, (int) (short) 1);
        ds.Ordenacao.mergeSort(intArray2, (int) (byte) 0, 0);
        ds.Ordenacao.mergeSort(intArray2, (int) '4', 10);
        ds.Ordenacao.mergeSort(intArray2, (int) '4', (int) (byte) 0);
        ds.Ordenacao.mergeSort(intArray2, (int) '4', (int) ' ');
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[32, 0]");
    }

    @Test
    public void test1686() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1686");
        int[] intArray2 = new int[] { 1, 1 };
        ds.Ordenacao.mergeSort(intArray2, 10, 0);
        ds.Ordenacao.mergeSort(intArray2, (int) (byte) 0, (int) (short) 1);
        ds.Ordenacao.mergeSort(intArray2, (int) (byte) 10, (int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            ds.Ordenacao.mergeSort(intArray2, (int) '4', 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 52");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[1, 1]");
    }

    @Test
    public void test1687() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1687");
        int[] intArray1 = new int[] { '4' };
        ds.Ordenacao.mergeSort(intArray1, (int) '4', (int) (byte) 1);
        ds.Ordenacao.mergeSort(intArray1, (int) (short) 10, (int) (byte) 0);
        ds.Ordenacao.mergeSort(intArray1, (int) (short) 10, (int) (short) 0);
        ds.Ordenacao.mergeSort(intArray1, (int) ' ', (int) (byte) 0);
        java.lang.Class<?> wildcardClass14 = intArray1.getClass();
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray1), "[52]");
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test1688() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1688");
        int[] intArray2 = new int[] { 1, (short) 100 };
        ds.Ordenacao.mergeSort(intArray2, (int) '#', 1);
        ds.Ordenacao.mergeSort(intArray2, (int) '4', (int) '4');
        ds.Ordenacao.mergeSort(intArray2, (int) ' ', 1);
        // The following exception was thrown during execution in test generation
        try {
            ds.Ordenacao.mergeSort(intArray2, 0, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 2");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[1, 100]");
    }

    @Test
    public void test1689() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1689");
        int[] intArray2 = new int[] { ' ', 0 };
        ds.Ordenacao.mergeSort(intArray2, (int) (byte) 1, (int) (short) 1);
        ds.Ordenacao.mergeSort(intArray2, (int) '4', 0);
        ds.Ordenacao.mergeSort(intArray2, (int) '#', (int) (byte) -1);
        ds.Ordenacao.mergeSort(intArray2, 100, (int) '4');
        ds.Ordenacao.mergeSort(intArray2, (int) (byte) 100, (int) (byte) 100);
        ds.Ordenacao.mergeSort(intArray2, (int) (short) 10, (int) (byte) 10);
        ds.Ordenacao.mergeSort(intArray2, (int) (short) 1, (int) (short) -1);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[32, 0]");
    }

    @Test
    public void test1690() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1690");
        int[] intArray3 = new int[] { (byte) 100, (short) 1, (byte) 1 };
        ds.Ordenacao.mergeSort(intArray3, 0, (int) (byte) -1);
        ds.Ordenacao.mergeSort(intArray3, (int) ' ', (int) (short) 1);
        ds.Ordenacao.mergeSort(intArray3, 100, 0);
        ds.Ordenacao.mergeSort(intArray3, (int) (short) 10, 0);
        ds.Ordenacao.mergeSort(intArray3, (int) '4', 1);
        ds.Ordenacao.mergeSort(intArray3, (int) '4', (int) (short) -1);
        ds.Ordenacao.mergeSort(intArray3, 1, 0);
        ds.Ordenacao.mergeSort(intArray3, 1, (int) (short) -1);
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[100, 1, 1]");
    }

    @Test
    public void test1691() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1691");
        int[] intArray3 = new int[] { (byte) 100, (short) 1, (byte) 1 };
        ds.Ordenacao.mergeSort(intArray3, 0, (int) (byte) -1);
        ds.Ordenacao.mergeSort(intArray3, (int) '4', (int) (short) 0);
        ds.Ordenacao.mergeSort(intArray3, (int) ' ', (int) (short) 1);
        ds.Ordenacao.mergeSort(intArray3, (int) (byte) 10, 1);
        ds.Ordenacao.mergeSort(intArray3, (int) (short) 100, (int) (byte) 10);
        ds.Ordenacao.mergeSort(intArray3, 100, (int) (short) 10);
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[100, 1, 1]");
    }

    @Test
    public void test1692() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1692");
        int[] intArray3 = new int[] { (byte) 100, (short) 1, (byte) 1 };
        ds.Ordenacao.mergeSort(intArray3, 0, (int) (byte) -1);
        ds.Ordenacao.mergeSort(intArray3, (int) ' ', (int) (short) 1);
        ds.Ordenacao.mergeSort(intArray3, 100, 0);
        ds.Ordenacao.mergeSort(intArray3, (int) (short) 100, (int) 'a');
        ds.Ordenacao.mergeSort(intArray3, 0, (int) (byte) 1);
        ds.Ordenacao.mergeSort(intArray3, 10, 0);
        ds.Ordenacao.mergeSort(intArray3, (int) (short) 1, 0);
        ds.Ordenacao.mergeSort(intArray3, (int) (byte) 100, 10);
        ds.Ordenacao.mergeSort(intArray3, 10, (int) (short) 10);
        ds.Ordenacao.mergeSort(intArray3, (int) (short) -1, (int) (short) -1);
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[1, 100, 1]");
    }

    @Test
    public void test1693() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1693");
        int[] intArray3 = new int[] { (byte) 100, (short) 1, (byte) 1 };
        ds.Ordenacao.mergeSort(intArray3, 0, (int) (byte) -1);
        ds.Ordenacao.mergeSort(intArray3, (int) ' ', (int) (short) 1);
        ds.Ordenacao.mergeSort(intArray3, 100, 0);
        ds.Ordenacao.mergeSort(intArray3, (int) (short) 100, (int) 'a');
        ds.Ordenacao.mergeSort(intArray3, (int) 'a', (int) '#');
        ds.Ordenacao.mergeSort(intArray3, (int) (byte) 1, (-1));
        ds.Ordenacao.mergeSort(intArray3, 100, (int) (short) 100);
        ds.Ordenacao.mergeSort(intArray3, (int) (byte) 0, (-1));
        ds.Ordenacao.mergeSort(intArray3, (int) (byte) 100, (int) '4');
        ds.Ordenacao.mergeSort(intArray3, (int) (byte) 1, 0);
        java.lang.Class<?> wildcardClass34 = intArray3.getClass();
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[100, 1, 1]");
        org.junit.Assert.assertNotNull(wildcardClass34);
    }

    @Test
    public void test1694() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1694");
        int[] intArray2 = new int[] { ' ', 0 };
        ds.Ordenacao.mergeSort(intArray2, (int) (byte) 1, (int) (short) 1);
        ds.Ordenacao.mergeSort(intArray2, (int) (byte) 0, 0);
        ds.Ordenacao.mergeSort(intArray2, (int) (short) 100, (int) (short) 10);
        ds.Ordenacao.mergeSort(intArray2, (int) '#', (int) (short) 0);
        ds.Ordenacao.mergeSort(intArray2, (int) (short) 100, (int) (short) 1);
        ds.Ordenacao.mergeSort(intArray2, (int) (byte) 10, (int) (byte) -1);
        ds.Ordenacao.mergeSort(intArray2, (int) (short) 100, (int) (byte) 1);
        ds.Ordenacao.mergeSort(intArray2, (int) 'a', 1);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[32, 0]");
    }

    @Test
    public void test1695() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1695");
        int[] intArray3 = new int[] { (byte) 100, (short) 1, (byte) 1 };
        ds.Ordenacao.mergeSort(intArray3, 0, (int) (byte) -1);
        ds.Ordenacao.mergeSort(intArray3, (int) ' ', (int) (short) 1);
        ds.Ordenacao.mergeSort(intArray3, 100, 0);
        ds.Ordenacao.mergeSort(intArray3, (int) (short) 100, (int) 'a');
        ds.Ordenacao.mergeSort(intArray3, 0, (int) (byte) 1);
        ds.Ordenacao.mergeSort(intArray3, 10, 0);
        ds.Ordenacao.mergeSort(intArray3, (int) '4', (int) (short) 10);
        ds.Ordenacao.mergeSort(intArray3, (int) ' ', (int) (byte) 1);
        ds.Ordenacao.mergeSort(intArray3, (int) (byte) 1, (int) (short) 0);
        ds.Ordenacao.mergeSort(intArray3, (int) (short) 100, 0);
        ds.Ordenacao.mergeSort(intArray3, 0, (int) (byte) -1);
        ds.Ordenacao.mergeSort(intArray3, (int) '4', (int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            ds.Ordenacao.mergeSort(intArray3, (int) (byte) 10, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 10");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[1, 100, 1]");
    }

    @Test
    public void test1696() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1696");
        int[] intArray3 = new int[] { (byte) 100, (short) 1, (byte) 1 };
        ds.Ordenacao.mergeSort(intArray3, 0, (int) (byte) -1);
        ds.Ordenacao.mergeSort(intArray3, (int) ' ', (int) (short) 1);
        ds.Ordenacao.mergeSort(intArray3, 100, 0);
        ds.Ordenacao.mergeSort(intArray3, (int) (short) 100, (int) 'a');
        ds.Ordenacao.mergeSort(intArray3, (int) 'a', (int) '#');
        ds.Ordenacao.mergeSort(intArray3, (int) (byte) 1, (-1));
        ds.Ordenacao.mergeSort(intArray3, 100, (int) (short) 100);
        ds.Ordenacao.mergeSort(intArray3, 10, 10);
        ds.Ordenacao.mergeSort(intArray3, (int) '#', (int) (short) 1);
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[100, 1, 1]");
    }

    @Test
    public void test1697() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1697");
        int[] intArray1 = new int[] { '4' };
        ds.Ordenacao.mergeSort(intArray1, (int) '4', (int) (byte) 1);
        ds.Ordenacao.mergeSort(intArray1, (int) (short) 10, (int) (byte) 0);
        ds.Ordenacao.mergeSort(intArray1, (int) '4', 1);
        ds.Ordenacao.mergeSort(intArray1, 100, 0);
        ds.Ordenacao.mergeSort(intArray1, 100, (int) 'a');
        ds.Ordenacao.mergeSort(intArray1, (int) (short) 10, 1);
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray1), "[52]");
    }

    @Test
    public void test1698() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1698");
        int[] intArray3 = new int[] { (byte) 100, (short) 1, (byte) 1 };
        ds.Ordenacao.mergeSort(intArray3, 0, (int) (byte) -1);
        ds.Ordenacao.mergeSort(intArray3, (int) ' ', (int) (short) 1);
        ds.Ordenacao.mergeSort(intArray3, 100, 0);
        ds.Ordenacao.mergeSort(intArray3, (int) (short) 100, (int) 'a');
        ds.Ordenacao.mergeSort(intArray3, (int) (byte) 100, (int) (short) -1);
        ds.Ordenacao.mergeSort(intArray3, (int) (byte) 0, (int) (byte) 0);
        ds.Ordenacao.mergeSort(intArray3, 0, 0);
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[100, 1, 1]");
    }

    @Test
    public void test1699() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1699");
        int[] intArray2 = new int[] { ' ', 0 };
        ds.Ordenacao.mergeSort(intArray2, (int) (byte) 1, (int) (short) 1);
        ds.Ordenacao.mergeSort(intArray2, (int) (byte) 0, 0);
        ds.Ordenacao.mergeSort(intArray2, (int) (short) 100, (int) (short) 10);
        ds.Ordenacao.mergeSort(intArray2, (int) '#', (int) (short) 0);
        ds.Ordenacao.mergeSort(intArray2, (int) (short) 100, (int) (short) 1);
        ds.Ordenacao.mergeSort(intArray2, (int) (short) 100, (int) (short) 100);
        ds.Ordenacao.mergeSort(intArray2, 10, 10);
        ds.Ordenacao.mergeSort(intArray2, 1, (-1));
        ds.Ordenacao.mergeSort(intArray2, (int) '4', (int) (byte) 10);
        ds.Ordenacao.mergeSort(intArray2, (int) ' ', 1);
        ds.Ordenacao.mergeSort(intArray2, (int) ' ', (-1));
        ds.Ordenacao.mergeSort(intArray2, (int) (byte) 10, 1);
        ds.Ordenacao.mergeSort(intArray2, (int) (byte) 100, 0);
        // The following exception was thrown during execution in test generation
        try {
            ds.Ordenacao.mergeSort(intArray2, (int) (short) 0, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 2");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[0, 32]");
    }

    @Test
    public void test1700() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1700");
        int[] intArray3 = new int[] { 10, (byte) 0, (byte) 0 };
        ds.Ordenacao.mergeSort(intArray3, 1, (int) (byte) -1);
        ds.Ordenacao.mergeSort(intArray3, (int) (byte) 0, (int) (byte) -1);
        ds.Ordenacao.mergeSort(intArray3, (int) 'a', (int) (byte) 1);
        ds.Ordenacao.mergeSort(intArray3, 100, 100);
        ds.Ordenacao.mergeSort(intArray3, 10, (int) (byte) 10);
        ds.Ordenacao.mergeSort(intArray3, (int) (byte) 1, 0);
        ds.Ordenacao.mergeSort(intArray3, (int) '4', (int) ' ');
        ds.Ordenacao.mergeSort(intArray3, (int) '4', (int) '#');
        // The following exception was thrown during execution in test generation
        try {
            ds.Ordenacao.mergeSort(intArray3, (int) '4', 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 52");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[10, 0, 0]");
    }

    @Test
    public void test1701() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1701");
        int[] intArray2 = new int[] { ' ', 0 };
        ds.Ordenacao.mergeSort(intArray2, (int) (byte) 1, (int) (short) 1);
        ds.Ordenacao.mergeSort(intArray2, (int) (byte) 0, 0);
        ds.Ordenacao.mergeSort(intArray2, (int) (short) -1, (int) (byte) -1);
        ds.Ordenacao.mergeSort(intArray2, (int) (byte) 100, (int) (byte) 1);
        java.lang.Class<?> wildcardClass15 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[32, 0]");
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test1702() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1702");
        int[] intArray2 = new int[] { ' ', 0 };
        ds.Ordenacao.mergeSort(intArray2, (int) (byte) 1, (int) (short) 1);
        ds.Ordenacao.mergeSort(intArray2, (int) (byte) 0, 0);
        ds.Ordenacao.mergeSort(intArray2, (int) '4', 10);
        ds.Ordenacao.mergeSort(intArray2, (int) (short) 10, (int) (short) 0);
        ds.Ordenacao.mergeSort(intArray2, (int) (short) 10, (int) (byte) 0);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[32, 0]");
    }

    @Test
    public void test1703() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1703");
        int[] intArray3 = new int[] { (byte) 100, (short) 1, (byte) 1 };
        ds.Ordenacao.mergeSort(intArray3, 0, (int) (byte) -1);
        ds.Ordenacao.mergeSort(intArray3, (int) ' ', (int) (short) 1);
        ds.Ordenacao.mergeSort(intArray3, 100, 0);
        ds.Ordenacao.mergeSort(intArray3, (int) (short) 100, (int) 'a');
        ds.Ordenacao.mergeSort(intArray3, 0, (int) (byte) 1);
        ds.Ordenacao.mergeSort(intArray3, 10, 0);
        ds.Ordenacao.mergeSort(intArray3, (int) (short) 1, 0);
        ds.Ordenacao.mergeSort(intArray3, (-1), (int) (short) -1);
        // The following exception was thrown during execution in test generation
        try {
            ds.Ordenacao.mergeSort(intArray3, 0, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 3");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[1, 1, 100]");
    }

    @Test
    public void test1704() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1704");
        int[] intArray2 = new int[] { ' ', 0 };
        ds.Ordenacao.mergeSort(intArray2, (int) (byte) 1, (int) (short) 1);
        ds.Ordenacao.mergeSort(intArray2, (int) (byte) 0, 0);
        ds.Ordenacao.mergeSort(intArray2, (int) (short) -1, (int) (byte) -1);
        ds.Ordenacao.mergeSort(intArray2, (int) '#', (int) ' ');
        ds.Ordenacao.mergeSort(intArray2, (int) (byte) 100, 0);
        ds.Ordenacao.mergeSort(intArray2, 100, (int) (byte) 0);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[32, 0]");
    }

    @Test
    public void test1705() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1705");
        int[] intArray0 = new int[] {};
        ds.Ordenacao.mergeSort(intArray0, (int) (short) 1, (int) (byte) 0);
        ds.Ordenacao.mergeSort(intArray0, 0, (int) (short) -1);
        ds.Ordenacao.mergeSort(intArray0, (int) (byte) 10, 0);
        ds.Ordenacao.mergeSort(intArray0, (int) (short) 10, (int) (byte) 10);
        ds.Ordenacao.mergeSort(intArray0, (int) (short) 100, (int) (byte) -1);
        // The following exception was thrown during execution in test generation
        try {
            ds.Ordenacao.mergeSort(intArray0, 0, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 0");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
    }

    @Test
    public void test1706() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1706");
        int[] intArray3 = new int[] { (byte) 100, (short) 1, (byte) 1 };
        ds.Ordenacao.mergeSort(intArray3, 0, (int) (byte) -1);
        ds.Ordenacao.mergeSort(intArray3, (int) '4', (int) (short) 0);
        ds.Ordenacao.mergeSort(intArray3, 10, (int) (byte) 1);
        ds.Ordenacao.mergeSort(intArray3, (int) (byte) 100, (int) (short) 100);
        // The following exception was thrown during execution in test generation
        try {
            ds.Ordenacao.mergeSort(intArray3, 0, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 3");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[1, 100, 1]");
    }

    @Test
    public void test1707() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1707");
        int[] intArray3 = new int[] { 10, (byte) 0, (byte) 0 };
        ds.Ordenacao.mergeSort(intArray3, 1, (int) (byte) -1);
        ds.Ordenacao.mergeSort(intArray3, (int) (byte) 0, (int) (byte) -1);
        ds.Ordenacao.mergeSort(intArray3, (int) 'a', (int) (byte) 1);
        ds.Ordenacao.mergeSort(intArray3, 100, 100);
        ds.Ordenacao.mergeSort(intArray3, 10, (int) (byte) 10);
        ds.Ordenacao.mergeSort(intArray3, 100, (int) (byte) 100);
        ds.Ordenacao.mergeSort(intArray3, (int) ' ', 0);
        java.lang.Class<?> wildcardClass25 = intArray3.getClass();
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[10, 0, 0]");
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test1708() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1708");
        int[] intArray3 = new int[] { (byte) 100, (short) 1, (byte) 1 };
        ds.Ordenacao.mergeSort(intArray3, 0, (int) (byte) -1);
        ds.Ordenacao.mergeSort(intArray3, (int) 'a', 1);
        ds.Ordenacao.mergeSort(intArray3, (int) '4', 0);
        ds.Ordenacao.mergeSort(intArray3, 100, (int) (byte) -1);
        ds.Ordenacao.mergeSort(intArray3, (int) (short) 10, 0);
        ds.Ordenacao.mergeSort(intArray3, (int) (short) 10, 0);
        ds.Ordenacao.mergeSort(intArray3, (int) (short) 100, 100);
        ds.Ordenacao.mergeSort(intArray3, (int) (byte) 100, (int) '4');
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[100, 1, 1]");
    }

    @Test
    public void test1709() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1709");
        int[] intArray2 = new int[] { 1, (short) 100 };
        ds.Ordenacao.mergeSort(intArray2, (int) '#', 1);
        ds.Ordenacao.mergeSort(intArray2, 0, (int) (short) -1);
        ds.Ordenacao.mergeSort(intArray2, (int) '#', 0);
        // The following exception was thrown during execution in test generation
        try {
            ds.Ordenacao.mergeSort(intArray2, (int) (byte) 0, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 2");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[1, 100]");
    }

    @Test
    public void test1710() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1710");
        int[] intArray3 = new int[] { (byte) 100, (short) 1, (byte) 1 };
        ds.Ordenacao.mergeSort(intArray3, 0, (int) (byte) -1);
        ds.Ordenacao.mergeSort(intArray3, (int) 'a', 1);
        ds.Ordenacao.mergeSort(intArray3, 1, (int) (byte) 0);
        ds.Ordenacao.mergeSort(intArray3, (int) (short) 0, (int) (byte) -1);
        ds.Ordenacao.mergeSort(intArray3, 0, (int) (short) 0);
        java.lang.Class<?> wildcardClass19 = intArray3.getClass();
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[100, 1, 1]");
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test1711() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1711");
        int[] intArray3 = new int[] { 10, (byte) 0, (byte) 0 };
        ds.Ordenacao.mergeSort(intArray3, 1, (int) (byte) -1);
        ds.Ordenacao.mergeSort(intArray3, (int) (byte) 0, (int) (byte) -1);
        ds.Ordenacao.mergeSort(intArray3, (int) 'a', (int) (byte) 1);
        ds.Ordenacao.mergeSort(intArray3, 100, 100);
        ds.Ordenacao.mergeSort(intArray3, 10, (int) (byte) 10);
        ds.Ordenacao.mergeSort(intArray3, (int) (byte) 1, 0);
        ds.Ordenacao.mergeSort(intArray3, (int) '4', (int) ' ');
        ds.Ordenacao.mergeSort(intArray3, (int) '4', (int) '#');
        // The following exception was thrown during execution in test generation
        try {
            ds.Ordenacao.mergeSort(intArray3, 0, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 3");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[0, 0, 10]");
    }

    @Test
    public void test1712() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1712");
        int[] intArray3 = new int[] { (byte) 100, (short) 1, (byte) 1 };
        ds.Ordenacao.mergeSort(intArray3, 0, (int) (byte) -1);
        ds.Ordenacao.mergeSort(intArray3, (int) ' ', (int) (short) 1);
        ds.Ordenacao.mergeSort(intArray3, (int) (byte) 10, (-1));
        ds.Ordenacao.mergeSort(intArray3, 100, (int) 'a');
        ds.Ordenacao.mergeSort(intArray3, 10, (-1));
        ds.Ordenacao.mergeSort(intArray3, (-1), (-1));
        ds.Ordenacao.mergeSort(intArray3, (int) (byte) 0, (int) (byte) 1);
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[1, 100, 1]");
    }

    @Test
    public void test1713() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1713");
        int[] intArray3 = new int[] { 10, (byte) 0, (byte) 0 };
        ds.Ordenacao.mergeSort(intArray3, 1, (int) (byte) -1);
        ds.Ordenacao.mergeSort(intArray3, 10, 0);
        ds.Ordenacao.mergeSort(intArray3, (int) (byte) 10, (int) (byte) -1);
        ds.Ordenacao.mergeSort(intArray3, (int) (short) 100, (int) '4');
        ds.Ordenacao.mergeSort(intArray3, (int) '#', 10);
        ds.Ordenacao.mergeSort(intArray3, 10, 1);
        ds.Ordenacao.mergeSort(intArray3, (int) (byte) 100, (int) (byte) 10);
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[10, 0, 0]");
    }

    @Test
    public void test1714() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1714");
        int[] intArray0 = new int[] {};
        ds.Ordenacao.mergeSort(intArray0, (int) (short) 1, (int) (byte) 0);
        ds.Ordenacao.mergeSort(intArray0, (int) (byte) 1, (int) (short) 0);
        ds.Ordenacao.mergeSort(intArray0, (int) (byte) 10, (int) (short) 10);
        ds.Ordenacao.mergeSort(intArray0, (int) '#', (int) ' ');
        ds.Ordenacao.mergeSort(intArray0, 10, (int) (byte) -1);
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
    }

    @Test
    public void test1715() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1715");
        int[] intArray3 = new int[] { (byte) 100, (short) 1, (byte) 1 };
        ds.Ordenacao.mergeSort(intArray3, 0, (int) (byte) -1);
        ds.Ordenacao.mergeSort(intArray3, (int) ' ', (int) (short) 1);
        ds.Ordenacao.mergeSort(intArray3, (int) '#', (int) (short) 1);
        ds.Ordenacao.mergeSort(intArray3, 0, (int) (byte) -1);
        ds.Ordenacao.mergeSort(intArray3, (int) (short) 100, (int) (short) 100);
        // The following exception was thrown during execution in test generation
        try {
            ds.Ordenacao.mergeSort(intArray3, (int) (short) 1, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 3");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[100, 1, 1]");
    }

    @Test
    public void test1716() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1716");
        int[] intArray0 = null;
        ds.Ordenacao.mergeSort(intArray0, (int) (short) -1, (int) (byte) -1);
    }

    @Test
    public void test1717() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1717");
        int[] intArray2 = new int[] { ' ', 0 };
        ds.Ordenacao.mergeSort(intArray2, (int) (byte) 1, (int) (short) 1);
        ds.Ordenacao.mergeSort(intArray2, (int) (byte) 0, 0);
        ds.Ordenacao.mergeSort(intArray2, (int) (short) -1, (int) (byte) -1);
        ds.Ordenacao.mergeSort(intArray2, (int) (byte) 10, 10);
        java.lang.Class<?> wildcardClass15 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[32, 0]");
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test1718() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1718");
        int[] intArray3 = new int[] { (byte) 100, (short) 1, (byte) 1 };
        ds.Ordenacao.mergeSort(intArray3, 0, (int) (byte) -1);
        ds.Ordenacao.mergeSort(intArray3, (int) ' ', (int) (short) 1);
        ds.Ordenacao.mergeSort(intArray3, 100, 0);
        ds.Ordenacao.mergeSort(intArray3, (int) (short) 100, (int) 'a');
        ds.Ordenacao.mergeSort(intArray3, (int) 'a', (int) '#');
        ds.Ordenacao.mergeSort(intArray3, (int) (byte) 1, (-1));
        ds.Ordenacao.mergeSort(intArray3, (int) (byte) 100, (int) (short) -1);
        // The following exception was thrown during execution in test generation
        try {
            ds.Ordenacao.mergeSort(intArray3, (int) (short) 0, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 3");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[1, 100, 1]");
    }

    @Test
    public void test1719() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1719");
        int[] intArray2 = new int[] { ' ', 0 };
        ds.Ordenacao.mergeSort(intArray2, (int) (byte) 1, (int) (short) 1);
        ds.Ordenacao.mergeSort(intArray2, (int) (byte) 0, 0);
        ds.Ordenacao.mergeSort(intArray2, (int) (short) 100, (int) (short) 10);
        ds.Ordenacao.mergeSort(intArray2, (int) '#', (int) (short) 0);
        ds.Ordenacao.mergeSort(intArray2, (int) (short) 100, (int) (short) 1);
        ds.Ordenacao.mergeSort(intArray2, (int) (byte) 10, (int) (byte) -1);
        ds.Ordenacao.mergeSort(intArray2, (int) (short) 1, (-1));
        ds.Ordenacao.mergeSort(intArray2, (int) (byte) -1, (-1));
        ds.Ordenacao.mergeSort(intArray2, 100, 1);
        ds.Ordenacao.mergeSort(intArray2, (int) (short) -1, (-1));
        ds.Ordenacao.mergeSort(intArray2, (int) '#', (int) (byte) 0);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[32, 0]");
    }

    @Test
    public void test1720() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1720");
        int[] intArray3 = new int[] { (byte) 100, (short) 1, (byte) 1 };
        ds.Ordenacao.mergeSort(intArray3, 0, (int) (byte) -1);
        ds.Ordenacao.mergeSort(intArray3, (int) '4', (int) (short) 0);
        ds.Ordenacao.mergeSort(intArray3, (int) ' ', (int) (short) 1);
        ds.Ordenacao.mergeSort(intArray3, (int) '4', (int) '4');
        ds.Ordenacao.mergeSort(intArray3, 1, 1);
        ds.Ordenacao.mergeSort(intArray3, (int) (short) -1, (int) (short) -1);
        ds.Ordenacao.mergeSort(intArray3, (int) (short) 0, 1);
        ds.Ordenacao.mergeSort(intArray3, (int) (short) 100, (int) (short) 0);
        ds.Ordenacao.mergeSort(intArray3, (int) (byte) 0, (int) (short) 0);
        ds.Ordenacao.mergeSort(intArray3, 100, (int) (byte) 100);
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[1, 100, 1]");
    }

    @Test
    public void test1721() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1721");
        int[] intArray3 = new int[] { (byte) 100, (short) 1, (byte) 1 };
        ds.Ordenacao.mergeSort(intArray3, 0, (int) (byte) -1);
        ds.Ordenacao.mergeSort(intArray3, (int) 'a', 1);
        ds.Ordenacao.mergeSort(intArray3, (int) '4', 0);
        ds.Ordenacao.mergeSort(intArray3, 100, (int) (byte) -1);
        ds.Ordenacao.mergeSort(intArray3, (int) (short) 1, (int) (byte) 1);
        ds.Ordenacao.mergeSort(intArray3, 10, (int) (byte) 10);
        ds.Ordenacao.mergeSort(intArray3, 1, 1);
        java.lang.Class<?> wildcardClass25 = intArray3.getClass();
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[100, 1, 1]");
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test1722() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1722");
        int[] intArray3 = new int[] { (byte) 100, (short) 1, (byte) 1 };
        ds.Ordenacao.mergeSort(intArray3, 0, (int) (byte) -1);
        ds.Ordenacao.mergeSort(intArray3, (int) ' ', (int) (short) 1);
        ds.Ordenacao.mergeSort(intArray3, 100, 0);
        ds.Ordenacao.mergeSort(intArray3, (int) (short) 100, (int) 'a');
        ds.Ordenacao.mergeSort(intArray3, (int) 'a', (int) '#');
        // The following exception was thrown during execution in test generation
        try {
            ds.Ordenacao.mergeSort(intArray3, 0, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 3");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[1, 100, 1]");
    }

    @Test
    public void test1723() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1723");
        int[] intArray1 = new int[] { '4' };
        ds.Ordenacao.mergeSort(intArray1, (int) '4', (int) (byte) 1);
        ds.Ordenacao.mergeSort(intArray1, (int) (short) 10, (int) (short) 10);
        java.lang.Class<?> wildcardClass8 = intArray1.getClass();
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray1), "[52]");
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test1724() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1724");
        int[] intArray3 = new int[] { (byte) 100, (short) 1, (byte) 1 };
        ds.Ordenacao.mergeSort(intArray3, 0, (int) (byte) -1);
        ds.Ordenacao.mergeSort(intArray3, (int) ' ', (int) (short) 1);
        ds.Ordenacao.mergeSort(intArray3, (int) (byte) 0, 0);
        ds.Ordenacao.mergeSort(intArray3, 0, 1);
        ds.Ordenacao.mergeSort(intArray3, (int) (short) 10, (int) (short) 1);
        ds.Ordenacao.mergeSort(intArray3, 1, 1);
        ds.Ordenacao.mergeSort(intArray3, (int) '4', (int) (byte) -1);
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[1, 100, 1]");
    }

    @Test
    public void test1725() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1725");
        int[] intArray2 = new int[] { ' ', 0 };
        ds.Ordenacao.mergeSort(intArray2, (int) (byte) 1, (int) (short) 1);
        ds.Ordenacao.mergeSort(intArray2, (int) (byte) 0, 0);
        ds.Ordenacao.mergeSort(intArray2, (int) (short) 100, (int) (short) 10);
        ds.Ordenacao.mergeSort(intArray2, (int) '#', (int) (short) 0);
        ds.Ordenacao.mergeSort(intArray2, 1, (int) (short) 1);
        ds.Ordenacao.mergeSort(intArray2, (int) (byte) 100, 0);
        ds.Ordenacao.mergeSort(intArray2, (int) (short) 1, 0);
        // The following exception was thrown during execution in test generation
        try {
            ds.Ordenacao.mergeSort(intArray2, 0, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 2");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[0, 32]");
    }

    @Test
    public void test1726() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1726");
        int[] intArray3 = new int[] { (byte) 100, (short) 1, (byte) 1 };
        ds.Ordenacao.mergeSort(intArray3, 0, (int) (byte) -1);
        ds.Ordenacao.mergeSort(intArray3, (int) ' ', (int) (short) 1);
        ds.Ordenacao.mergeSort(intArray3, 100, 0);
        ds.Ordenacao.mergeSort(intArray3, (int) (short) 100, (int) 'a');
        ds.Ordenacao.mergeSort(intArray3, (int) 'a', (int) '#');
        ds.Ordenacao.mergeSort(intArray3, (int) (byte) 1, (-1));
        ds.Ordenacao.mergeSort(intArray3, 100, (int) (short) 100);
        // The following exception was thrown during execution in test generation
        try {
            ds.Ordenacao.mergeSort(intArray3, (int) (short) 1, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 3");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[100, 1, 1]");
    }

    @Test
    public void test1727() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1727");
        int[] intArray3 = new int[] { (byte) 100, (short) 1, (byte) 1 };
        ds.Ordenacao.mergeSort(intArray3, 0, (int) (byte) -1);
        ds.Ordenacao.mergeSort(intArray3, (int) 'a', 1);
        ds.Ordenacao.mergeSort(intArray3, 100, (int) ' ');
        ds.Ordenacao.mergeSort(intArray3, (int) (byte) 100, (int) (short) 1);
        ds.Ordenacao.mergeSort(intArray3, 10, (int) (short) 1);
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[100, 1, 1]");
    }

    @Test
    public void test1728() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1728");
        int[] intArray3 = new int[] { (byte) 100, (short) 1, (byte) 1 };
        ds.Ordenacao.mergeSort(intArray3, 0, (int) (byte) -1);
        ds.Ordenacao.mergeSort(intArray3, (int) ' ', (int) (short) 1);
        ds.Ordenacao.mergeSort(intArray3, 100, 0);
        ds.Ordenacao.mergeSort(intArray3, (int) (short) 100, (int) 'a');
        ds.Ordenacao.mergeSort(intArray3, 0, (int) (byte) 1);
        ds.Ordenacao.mergeSort(intArray3, (-1), (-1));
        ds.Ordenacao.mergeSort(intArray3, (int) (byte) 100, (int) ' ');
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[1, 100, 1]");
    }

    @Test
    public void test1729() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1729");
        int[] intArray3 = new int[] { 10, (byte) 0, (byte) 0 };
        ds.Ordenacao.mergeSort(intArray3, 1, (int) (byte) -1);
        ds.Ordenacao.mergeSort(intArray3, 10, 0);
        ds.Ordenacao.mergeSort(intArray3, 0, (int) (byte) 0);
        ds.Ordenacao.mergeSort(intArray3, 0, 0);
        ds.Ordenacao.mergeSort(intArray3, (int) '#', (int) (byte) 0);
        ds.Ordenacao.mergeSort(intArray3, 10, (int) (short) 10);
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[10, 0, 0]");
    }

    @Test
    public void test1730() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1730");
        int[] intArray3 = new int[] { 10, (byte) 0, (byte) 0 };
        ds.Ordenacao.mergeSort(intArray3, 1, (int) (byte) -1);
        ds.Ordenacao.mergeSort(intArray3, (int) (byte) 0, (int) (byte) -1);
        ds.Ordenacao.mergeSort(intArray3, (int) 'a', (int) (byte) 1);
        ds.Ordenacao.mergeSort(intArray3, 100, 100);
        ds.Ordenacao.mergeSort(intArray3, 10, (int) (byte) 10);
        ds.Ordenacao.mergeSort(intArray3, (int) (byte) 1, 0);
        ds.Ordenacao.mergeSort(intArray3, (int) '4', (int) ' ');
        ds.Ordenacao.mergeSort(intArray3, (int) '4', (int) '#');
        ds.Ordenacao.mergeSort(intArray3, (int) (byte) 100, 10);
        java.lang.Class<?> wildcardClass31 = intArray3.getClass();
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[10, 0, 0]");
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test1731() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1731");
        int[] intArray3 = new int[] { (byte) 100, (short) 1, (byte) 1 };
        ds.Ordenacao.mergeSort(intArray3, 0, (int) (byte) -1);
        ds.Ordenacao.mergeSort(intArray3, (int) ' ', (int) (short) 1);
        ds.Ordenacao.mergeSort(intArray3, 100, 0);
        ds.Ordenacao.mergeSort(intArray3, (int) (short) 100, (int) 'a');
        ds.Ordenacao.mergeSort(intArray3, (int) 'a', (int) '#');
        ds.Ordenacao.mergeSort(intArray3, (int) 'a', (int) '4');
        ds.Ordenacao.mergeSort(intArray3, (int) (byte) 100, (int) '4');
        ds.Ordenacao.mergeSort(intArray3, (int) (short) 0, (int) (short) 1);
        java.lang.Class<?> wildcardClass28 = intArray3.getClass();
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[1, 100, 1]");
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test1732() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1732");
        int[] intArray3 = new int[] { 10, (byte) 0, (byte) 0 };
        ds.Ordenacao.mergeSort(intArray3, 1, (int) (byte) -1);
        ds.Ordenacao.mergeSort(intArray3, (int) (byte) 0, (int) (byte) -1);
        ds.Ordenacao.mergeSort(intArray3, (int) 'a', (int) (byte) 1);
        ds.Ordenacao.mergeSort(intArray3, 100, 100);
        ds.Ordenacao.mergeSort(intArray3, 10, (int) (byte) 10);
        ds.Ordenacao.mergeSort(intArray3, (int) (byte) 100, (int) (short) 10);
        ds.Ordenacao.mergeSort(intArray3, (int) (short) 100, (int) (byte) 0);
        ds.Ordenacao.mergeSort(intArray3, (int) (short) 10, (int) (byte) 0);
        ds.Ordenacao.mergeSort(intArray3, 0, (int) (byte) 0);
        ds.Ordenacao.mergeSort(intArray3, (int) (byte) 100, 0);
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[10, 0, 0]");
    }

    @Test
    public void test1733() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1733");
        int[] intArray3 = new int[] { (byte) 100, (short) 1, (byte) 1 };
        ds.Ordenacao.mergeSort(intArray3, 0, (int) (byte) -1);
        ds.Ordenacao.mergeSort(intArray3, (int) ' ', (int) (short) 1);
        ds.Ordenacao.mergeSort(intArray3, 100, 0);
        ds.Ordenacao.mergeSort(intArray3, (int) (short) 100, (int) 'a');
        ds.Ordenacao.mergeSort(intArray3, 0, (int) (byte) 1);
        ds.Ordenacao.mergeSort(intArray3, 10, 0);
        ds.Ordenacao.mergeSort(intArray3, (int) '4', (int) (short) 10);
        ds.Ordenacao.mergeSort(intArray3, (int) (byte) 100, (int) (short) 100);
        ds.Ordenacao.mergeSort(intArray3, (int) (byte) 10, 0);
        ds.Ordenacao.mergeSort(intArray3, (int) (byte) 100, 1);
        ds.Ordenacao.mergeSort(intArray3, (int) (short) 100, (int) (short) -1);
        ds.Ordenacao.mergeSort(intArray3, (int) '4', 1);
        ds.Ordenacao.mergeSort(intArray3, (int) (byte) 10, (int) (byte) 0);
        ds.Ordenacao.mergeSort(intArray3, (int) (short) 100, (int) '#');
        ds.Ordenacao.mergeSort(intArray3, 0, (int) (short) 0);
        ds.Ordenacao.mergeSort(intArray3, (int) (byte) 10, (int) (short) 1);
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[1, 100, 1]");
    }

    @Test
    public void test1734() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1734");
        int[] intArray3 = new int[] { (byte) 100, (short) 1, (byte) 1 };
        ds.Ordenacao.mergeSort(intArray3, 0, (int) (byte) -1);
        ds.Ordenacao.mergeSort(intArray3, (int) ' ', (int) (short) 1);
        ds.Ordenacao.mergeSort(intArray3, 100, 0);
        ds.Ordenacao.mergeSort(intArray3, (int) (short) 100, (int) 'a');
        ds.Ordenacao.mergeSort(intArray3, (int) 'a', (int) '#');
        ds.Ordenacao.mergeSort(intArray3, (int) (byte) 1, (-1));
        ds.Ordenacao.mergeSort(intArray3, 100, (int) (short) 100);
        ds.Ordenacao.mergeSort(intArray3, 10, 10);
        ds.Ordenacao.mergeSort(intArray3, 10, (-1));
        ds.Ordenacao.mergeSort(intArray3, (int) ' ', (int) ' ');
        ds.Ordenacao.mergeSort(intArray3, 100, (int) (byte) 100);
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[100, 1, 1]");
    }

    @Test
    public void test1735() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1735");
        int[] intArray3 = new int[] { 10, (byte) 0, (byte) 0 };
        ds.Ordenacao.mergeSort(intArray3, 1, (int) (byte) -1);
        ds.Ordenacao.mergeSort(intArray3, (int) (byte) 0, (int) (byte) -1);
        ds.Ordenacao.mergeSort(intArray3, (int) 'a', (int) (byte) 1);
        ds.Ordenacao.mergeSort(intArray3, 100, 100);
        ds.Ordenacao.mergeSort(intArray3, 10, (int) (byte) 10);
        ds.Ordenacao.mergeSort(intArray3, (int) (byte) 1, 0);
        ds.Ordenacao.mergeSort(intArray3, (int) '4', (int) (byte) 1);
        ds.Ordenacao.mergeSort(intArray3, (int) (byte) 0, (int) (short) 1);
        ds.Ordenacao.mergeSort(intArray3, (int) '4', 0);
        ds.Ordenacao.mergeSort(intArray3, 10, (int) (short) 0);
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[0, 10, 0]");
    }

    @Test
    public void test1736() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1736");
        int[] intArray3 = new int[] { (byte) 100, (short) 1, (byte) 1 };
        ds.Ordenacao.mergeSort(intArray3, 0, (int) (byte) -1);
        ds.Ordenacao.mergeSort(intArray3, (int) 'a', 1);
        ds.Ordenacao.mergeSort(intArray3, 1, (int) (byte) 0);
        ds.Ordenacao.mergeSort(intArray3, (int) (short) 0, (int) (byte) -1);
        ds.Ordenacao.mergeSort(intArray3, 100, (int) (byte) -1);
        ds.Ordenacao.mergeSort(intArray3, 0, (int) (short) 0);
        ds.Ordenacao.mergeSort(intArray3, (int) 'a', (-1));
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[100, 1, 1]");
    }

    @Test
    public void test1737() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1737");
        int[] intArray2 = new int[] { 1, (short) 100 };
        ds.Ordenacao.mergeSort(intArray2, (int) '#', 1);
        ds.Ordenacao.mergeSort(intArray2, 0, (int) (short) -1);
        ds.Ordenacao.mergeSort(intArray2, (int) (short) 10, (int) (short) 1);
        ds.Ordenacao.mergeSort(intArray2, (int) (byte) 100, (int) (byte) 1);
        ds.Ordenacao.mergeSort(intArray2, (int) (byte) 100, (int) (short) 0);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[1, 100]");
    }

    @Test
    public void test1738() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1738");
        int[] intArray3 = new int[] { (byte) 100, (short) 1, (byte) 1 };
        ds.Ordenacao.mergeSort(intArray3, 0, (int) (byte) -1);
        ds.Ordenacao.mergeSort(intArray3, (int) '4', (int) (short) 0);
        ds.Ordenacao.mergeSort(intArray3, (int) ' ', (int) (short) 1);
        ds.Ordenacao.mergeSort(intArray3, (int) (byte) 10, 1);
        ds.Ordenacao.mergeSort(intArray3, (int) (byte) 0, (-1));
        ds.Ordenacao.mergeSort(intArray3, (int) 'a', (int) (byte) -1);
        ds.Ordenacao.mergeSort(intArray3, (int) (short) 100, (int) (short) 1);
        ds.Ordenacao.mergeSort(intArray3, (int) (short) -1, (-1));
        ds.Ordenacao.mergeSort(intArray3, (int) (short) 1, (int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            ds.Ordenacao.mergeSort(intArray3, 0, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 3");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[1, 100, 1]");
    }

    @Test
    public void test1739() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1739");
        int[] intArray3 = new int[] { (byte) 100, (short) 1, (byte) 1 };
        ds.Ordenacao.mergeSort(intArray3, 0, (int) (byte) -1);
        ds.Ordenacao.mergeSort(intArray3, (int) 'a', 1);
        ds.Ordenacao.mergeSort(intArray3, (int) '4', 0);
        ds.Ordenacao.mergeSort(intArray3, 100, (int) (byte) -1);
        ds.Ordenacao.mergeSort(intArray3, (int) (short) 1, (int) (byte) 1);
        ds.Ordenacao.mergeSort(intArray3, 10, (int) (byte) 10);
        ds.Ordenacao.mergeSort(intArray3, 1, 1);
        ds.Ordenacao.mergeSort(intArray3, (int) (byte) 100, (int) (byte) 1);
        java.lang.Class<?> wildcardClass28 = intArray3.getClass();
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[100, 1, 1]");
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test1740() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1740");
        int[] intArray3 = new int[] { (byte) 100, (short) 1, (byte) 1 };
        ds.Ordenacao.mergeSort(intArray3, 0, (int) (byte) -1);
        ds.Ordenacao.mergeSort(intArray3, (int) ' ', (int) (short) 1);
        ds.Ordenacao.mergeSort(intArray3, 100, 0);
        ds.Ordenacao.mergeSort(intArray3, (int) (short) 100, (int) 'a');
        ds.Ordenacao.mergeSort(intArray3, 0, (int) (byte) 1);
        ds.Ordenacao.mergeSort(intArray3, 10, 0);
        ds.Ordenacao.mergeSort(intArray3, (int) '4', (int) (short) 10);
        ds.Ordenacao.mergeSort(intArray3, (int) (byte) 100, (int) (short) 100);
        ds.Ordenacao.mergeSort(intArray3, (int) (byte) 10, 0);
        ds.Ordenacao.mergeSort(intArray3, (int) (byte) 100, 1);
        ds.Ordenacao.mergeSort(intArray3, (int) (short) 100, (int) (short) -1);
        ds.Ordenacao.mergeSort(intArray3, (int) '4', 1);
        ds.Ordenacao.mergeSort(intArray3, (int) (byte) 10, (int) (byte) 0);
        ds.Ordenacao.mergeSort(intArray3, (int) (short) 100, (int) '#');
        java.lang.Class<?> wildcardClass46 = intArray3.getClass();
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[1, 100, 1]");
        org.junit.Assert.assertNotNull(wildcardClass46);
    }

    @Test
    public void test1741() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1741");
        int[] intArray3 = new int[] { (byte) 100, (short) 1, (byte) 1 };
        ds.Ordenacao.mergeSort(intArray3, 0, (int) (byte) -1);
        ds.Ordenacao.mergeSort(intArray3, (int) '4', (int) (short) 0);
        ds.Ordenacao.mergeSort(intArray3, (int) ' ', (int) (short) 1);
        ds.Ordenacao.mergeSort(intArray3, (int) (byte) 10, 1);
        // The following exception was thrown during execution in test generation
        try {
            ds.Ordenacao.mergeSort(intArray3, 0, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 3");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[1, 100, 1]");
    }

    @Test
    public void test1742() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1742");
        int[] intArray3 = new int[] { (byte) 100, (short) 1, (byte) 1 };
        ds.Ordenacao.mergeSort(intArray3, 0, (int) (byte) -1);
        ds.Ordenacao.mergeSort(intArray3, (int) ' ', (int) (short) 1);
        ds.Ordenacao.mergeSort(intArray3, (int) (byte) 0, 0);
        ds.Ordenacao.mergeSort(intArray3, 0, 1);
        ds.Ordenacao.mergeSort(intArray3, (int) (short) 10, (int) (short) 1);
        ds.Ordenacao.mergeSort(intArray3, 1, 1);
        ds.Ordenacao.mergeSort(intArray3, 100, (int) (short) -1);
        ds.Ordenacao.mergeSort(intArray3, (int) 'a', (int) 'a');
        ds.Ordenacao.mergeSort(intArray3, 100, (int) (byte) 0);
        ds.Ordenacao.mergeSort(intArray3, (int) '4', 0);
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[1, 100, 1]");
    }

    @Test
    public void test1743() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1743");
        int[] intArray3 = new int[] { 10, (byte) 0, (byte) 0 };
        ds.Ordenacao.mergeSort(intArray3, 1, (int) (byte) -1);
        ds.Ordenacao.mergeSort(intArray3, 10, 0);
        ds.Ordenacao.mergeSort(intArray3, (int) (byte) 10, (int) (byte) -1);
        ds.Ordenacao.mergeSort(intArray3, (int) (short) 100, (int) '4');
        ds.Ordenacao.mergeSort(intArray3, (int) '#', (int) (byte) 10);
        ds.Ordenacao.mergeSort(intArray3, (int) 'a', (int) (short) 0);
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[10, 0, 0]");
    }

    @Test
    public void test1744() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1744");
        int[] intArray3 = new int[] { 10, (byte) 0, (byte) 0 };
        ds.Ordenacao.mergeSort(intArray3, 1, (int) (byte) -1);
        ds.Ordenacao.mergeSort(intArray3, (int) (byte) 0, (int) (byte) -1);
        ds.Ordenacao.mergeSort(intArray3, (int) 'a', (int) (byte) 1);
        ds.Ordenacao.mergeSort(intArray3, 100, 100);
        ds.Ordenacao.mergeSort(intArray3, (int) (short) 100, (-1));
        // The following exception was thrown during execution in test generation
        try {
            ds.Ordenacao.mergeSort(intArray3, (int) ' ', (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 32");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[10, 0, 0]");
    }

    @Test
    public void test1745() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1745");
        int[] intArray3 = new int[] { (byte) 100, (short) 1, (byte) 1 };
        ds.Ordenacao.mergeSort(intArray3, 0, (int) (byte) -1);
        ds.Ordenacao.mergeSort(intArray3, (int) ' ', (int) (short) 1);
        ds.Ordenacao.mergeSort(intArray3, (int) (byte) 10, (-1));
        ds.Ordenacao.mergeSort(intArray3, 100, (int) 'a');
        ds.Ordenacao.mergeSort(intArray3, 10, (-1));
        ds.Ordenacao.mergeSort(intArray3, 100, (int) (short) 1);
        ds.Ordenacao.mergeSort(intArray3, (int) (byte) 10, (int) (byte) 0);
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[100, 1, 1]");
    }

    @Test
    public void test1746() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1746");
        int[] intArray2 = new int[] { ' ', 0 };
        ds.Ordenacao.mergeSort(intArray2, (int) (byte) 1, (int) (short) 1);
        ds.Ordenacao.mergeSort(intArray2, (int) (byte) 0, 0);
        ds.Ordenacao.mergeSort(intArray2, (int) (short) 100, (int) (short) 10);
        ds.Ordenacao.mergeSort(intArray2, (int) (byte) 1, 1);
        ds.Ordenacao.mergeSort(intArray2, (int) (short) 100, (int) '4');
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[32, 0]");
    }

    @Test
    public void test1747() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1747");
        int[] intArray0 = null;
        ds.Ordenacao.mergeSort(intArray0, (-1), (int) (short) -1);
    }

    @Test
    public void test1748() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1748");
        int[] intArray3 = new int[] { (byte) 100, (short) 1, (byte) 1 };
        ds.Ordenacao.mergeSort(intArray3, 0, (int) (byte) -1);
        ds.Ordenacao.mergeSort(intArray3, (int) ' ', (int) (short) 1);
        ds.Ordenacao.mergeSort(intArray3, (int) (byte) 0, 0);
        ds.Ordenacao.mergeSort(intArray3, 0, 1);
        ds.Ordenacao.mergeSort(intArray3, (int) (short) 10, (int) (short) 1);
        ds.Ordenacao.mergeSort(intArray3, (int) '#', (int) (short) 1);
        ds.Ordenacao.mergeSort(intArray3, (int) (byte) -1, (int) (byte) -1);
        // The following exception was thrown during execution in test generation
        try {
            ds.Ordenacao.mergeSort(intArray3, (int) ' ', (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 32");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[1, 100, 1]");
    }

    @Test
    public void test1749() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1749");
        int[] intArray3 = new int[] { (byte) 100, (short) 1, (byte) 1 };
        ds.Ordenacao.mergeSort(intArray3, 0, (int) (byte) -1);
        ds.Ordenacao.mergeSort(intArray3, (int) 'a', 1);
        ds.Ordenacao.mergeSort(intArray3, 100, (int) ' ');
        java.lang.Class<?> wildcardClass13 = intArray3.getClass();
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[100, 1, 1]");
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test1750() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1750");
        int[] intArray3 = new int[] { (byte) 100, (short) 1, (byte) 1 };
        ds.Ordenacao.mergeSort(intArray3, 0, (int) (byte) -1);
        ds.Ordenacao.mergeSort(intArray3, (int) ' ', (int) (short) 1);
        ds.Ordenacao.mergeSort(intArray3, (int) (byte) 10, (int) (byte) 10);
        ds.Ordenacao.mergeSort(intArray3, 100, (int) (short) -1);
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[100, 1, 1]");
    }

    @Test
    public void test1751() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1751");
        int[] intArray2 = new int[] { ' ', 0 };
        ds.Ordenacao.mergeSort(intArray2, (int) (byte) 1, (int) (short) 1);
        ds.Ordenacao.mergeSort(intArray2, (int) (byte) 0, 0);
        ds.Ordenacao.mergeSort(intArray2, (int) '4', 10);
        ds.Ordenacao.mergeSort(intArray2, (int) ' ', (int) (short) -1);
        ds.Ordenacao.mergeSort(intArray2, 100, (int) (byte) 100);
        ds.Ordenacao.mergeSort(intArray2, (int) (byte) -1, (int) (short) -1);
        ds.Ordenacao.mergeSort(intArray2, (int) (short) 10, 0);
        ds.Ordenacao.mergeSort(intArray2, (int) ' ', (int) (byte) -1);
        ds.Ordenacao.mergeSort(intArray2, (int) (byte) 1, (int) (short) 1);
        ds.Ordenacao.mergeSort(intArray2, 0, (int) (short) -1);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[32, 0]");
    }

    @Test
    public void test1752() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1752");
        int[] intArray3 = new int[] { (byte) 100, (short) 1, (byte) 1 };
        ds.Ordenacao.mergeSort(intArray3, 0, (int) (byte) -1);
        ds.Ordenacao.mergeSort(intArray3, (int) ' ', (int) (short) 1);
        ds.Ordenacao.mergeSort(intArray3, 100, 0);
        ds.Ordenacao.mergeSort(intArray3, (int) (short) 100, (int) 'a');
        ds.Ordenacao.mergeSort(intArray3, 0, (int) (byte) 1);
        ds.Ordenacao.mergeSort(intArray3, 10, 0);
        ds.Ordenacao.mergeSort(intArray3, (int) '4', (int) (short) 10);
        ds.Ordenacao.mergeSort(intArray3, (int) (byte) 100, (int) (short) 100);
        ds.Ordenacao.mergeSort(intArray3, (int) (byte) 10, 0);
        ds.Ordenacao.mergeSort(intArray3, (int) (byte) 100, 1);
        ds.Ordenacao.mergeSort(intArray3, (int) 'a', (int) (short) 10);
        java.lang.Class<?> wildcardClass37 = intArray3.getClass();
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[1, 100, 1]");
        org.junit.Assert.assertNotNull(wildcardClass37);
    }

    @Test
    public void test1753() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1753");
        int[] intArray3 = new int[] { (byte) 100, (short) 1, (byte) 1 };
        ds.Ordenacao.mergeSort(intArray3, 0, (int) (byte) -1);
        ds.Ordenacao.mergeSort(intArray3, (int) '4', (int) (short) 0);
        ds.Ordenacao.mergeSort(intArray3, (int) ' ', (int) (short) 1);
        ds.Ordenacao.mergeSort(intArray3, (int) '4', (int) '4');
        ds.Ordenacao.mergeSort(intArray3, 1, 1);
        ds.Ordenacao.mergeSort(intArray3, (int) (short) -1, (int) (short) -1);
        ds.Ordenacao.mergeSort(intArray3, (int) (short) 0, 1);
        ds.Ordenacao.mergeSort(intArray3, 0, (int) (byte) -1);
        ds.Ordenacao.mergeSort(intArray3, (int) '4', (int) (short) 0);
        ds.Ordenacao.mergeSort(intArray3, (int) (byte) 1, (int) (byte) 1);
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[1, 100, 1]");
    }

    @Test
    public void test1754() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1754");
        int[] intArray3 = new int[] { (byte) 100, (short) 1, (byte) 1 };
        ds.Ordenacao.mergeSort(intArray3, 0, (int) (byte) -1);
        ds.Ordenacao.mergeSort(intArray3, (int) '4', (int) (short) 0);
        ds.Ordenacao.mergeSort(intArray3, 10, (int) (byte) 1);
        ds.Ordenacao.mergeSort(intArray3, (int) (byte) 100, (int) (short) 100);
        ds.Ordenacao.mergeSort(intArray3, (int) '4', 0);
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[100, 1, 1]");
    }

    @Test
    public void test1755() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1755");
        int[] intArray1 = new int[] { '4' };
        ds.Ordenacao.mergeSort(intArray1, (int) '4', (int) (byte) 1);
        ds.Ordenacao.mergeSort(intArray1, (int) (byte) 1, 0);
        ds.Ordenacao.mergeSort(intArray1, (int) (short) 1, 0);
        ds.Ordenacao.mergeSort(intArray1, (-1), (-1));
        java.lang.Class<?> wildcardClass14 = intArray1.getClass();
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray1), "[52]");
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test1756() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1756");
        int[] intArray3 = new int[] { 10, (byte) 0, (byte) 0 };
        ds.Ordenacao.mergeSort(intArray3, 1, (int) (byte) -1);
        ds.Ordenacao.mergeSort(intArray3, 10, 0);
        ds.Ordenacao.mergeSort(intArray3, (int) (short) 0, 0);
        ds.Ordenacao.mergeSort(intArray3, (int) (byte) 0, (int) (byte) 0);
        ds.Ordenacao.mergeSort(intArray3, (int) 'a', 0);
        ds.Ordenacao.mergeSort(intArray3, (int) (byte) 100, (int) '4');
        ds.Ordenacao.mergeSort(intArray3, (int) (short) 100, (int) (short) 10);
        java.lang.Class<?> wildcardClass25 = intArray3.getClass();
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[10, 0, 0]");
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test1757() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1757");
        int[] intArray2 = new int[] { ' ', 0 };
        ds.Ordenacao.mergeSort(intArray2, (int) (byte) 1, (int) (short) 1);
        ds.Ordenacao.mergeSort(intArray2, (int) (byte) 10, 1);
        ds.Ordenacao.mergeSort(intArray2, (int) (short) 100, 100);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[32, 0]");
    }

    @Test
    public void test1758() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1758");
        int[] intArray3 = new int[] { (byte) 100, (short) 1, (byte) 1 };
        ds.Ordenacao.mergeSort(intArray3, 0, (int) (byte) -1);
        ds.Ordenacao.mergeSort(intArray3, (int) ' ', (int) (short) 1);
        ds.Ordenacao.mergeSort(intArray3, (int) (byte) 0, 0);
        ds.Ordenacao.mergeSort(intArray3, 0, 1);
        ds.Ordenacao.mergeSort(intArray3, (int) 'a', (int) (byte) 0);
        ds.Ordenacao.mergeSort(intArray3, (int) (short) 1, (int) (short) 1);
        ds.Ordenacao.mergeSort(intArray3, (int) '#', (int) (short) -1);
        ds.Ordenacao.mergeSort(intArray3, 10, 0);
        ds.Ordenacao.mergeSort(intArray3, (int) 'a', (int) ' ');
        ds.Ordenacao.mergeSort(intArray3, (int) (short) 0, (int) (short) 1);
        ds.Ordenacao.mergeSort(intArray3, (int) (byte) 100, (int) (byte) 10);
        java.lang.Class<?> wildcardClass37 = intArray3.getClass();
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[1, 100, 1]");
        org.junit.Assert.assertNotNull(wildcardClass37);
    }
}

