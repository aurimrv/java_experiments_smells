package ds.seed5831;

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
        int[] intArray2 = new int[] { '#', 100 };
        ds.Ordenacao.mergeSort(intArray2, (int) '4', (int) '4');
        ds.Ordenacao.mergeSort(intArray2, (int) (short) 100, (int) (short) 1);
        ds.Ordenacao.mergeSort(intArray2, (int) 'a', (int) (short) -1);
        java.lang.Class<?> wildcardClass12 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[35, 100]");
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test2002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2002");
        int[] intArray2 = new int[] { '#', 100 };
        ds.Ordenacao.mergeSort(intArray2, (int) '4', (int) '4');
        ds.Ordenacao.mergeSort(intArray2, (int) (short) 10, (int) (short) 10);
        ds.Ordenacao.mergeSort(intArray2, 100, 0);
        ds.Ordenacao.mergeSort(intArray2, (int) 'a', (int) (byte) 10);
        ds.Ordenacao.mergeSort(intArray2, (int) (byte) 100, (int) (byte) 0);
        ds.Ordenacao.mergeSort(intArray2, (int) (byte) 100, (int) (byte) 1);
        ds.Ordenacao.mergeSort(intArray2, (int) (short) 1, (int) (byte) 1);
        ds.Ordenacao.mergeSort(intArray2, (int) (byte) 10, (int) (short) -1);
        ds.Ordenacao.mergeSort(intArray2, 1, 1);
        ds.Ordenacao.mergeSort(intArray2, 10, (int) (byte) 10);
        java.lang.Class<?> wildcardClass33 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[35, 100]");
        org.junit.Assert.assertNotNull(wildcardClass33);
    }

    @Test
    public void test2003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2003");
        int[] intArray2 = new int[] { '#', 100 };
        ds.Ordenacao.mergeSort(intArray2, (int) '4', (int) '4');
        ds.Ordenacao.mergeSort(intArray2, 1, (int) (short) 0);
        ds.Ordenacao.mergeSort(intArray2, 0, (int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            ds.Ordenacao.mergeSort(intArray2, (int) (short) 10, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 10");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[35, 100]");
    }

    @Test
    public void test2004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2004");
        int[] intArray2 = new int[] { '#', 100 };
        ds.Ordenacao.mergeSort(intArray2, (int) '4', (int) '4');
        ds.Ordenacao.mergeSort(intArray2, (int) (short) 10, (int) (short) 10);
        ds.Ordenacao.mergeSort(intArray2, (int) ' ', (int) (byte) 0);
        ds.Ordenacao.mergeSort(intArray2, (int) (byte) 10, (-1));
        ds.Ordenacao.mergeSort(intArray2, (int) (short) 10, (-1));
        ds.Ordenacao.mergeSort(intArray2, (int) (byte) 100, (int) ' ');
        ds.Ordenacao.mergeSort(intArray2, (int) ' ', (int) (byte) 1);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[35, 100]");
    }

    @Test
    public void test2005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2005");
        int[] intArray2 = new int[] { '#', 100 };
        ds.Ordenacao.mergeSort(intArray2, (int) '4', (int) '4');
        ds.Ordenacao.mergeSort(intArray2, (int) (short) 10, (int) (short) 10);
        ds.Ordenacao.mergeSort(intArray2, (int) (byte) -1, (int) (byte) -1);
        ds.Ordenacao.mergeSort(intArray2, (int) (short) 0, 1);
        ds.Ordenacao.mergeSort(intArray2, 1, (int) (short) -1);
        ds.Ordenacao.mergeSort(intArray2, (int) (short) 1, (int) (byte) 1);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[35, 100]");
    }

    @Test
    public void test2006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2006");
        int[] intArray1 = new int[] { (byte) -1 };
        ds.Ordenacao.mergeSort(intArray1, 0, (int) (short) -1);
        ds.Ordenacao.mergeSort(intArray1, 100, 0);
        ds.Ordenacao.mergeSort(intArray1, (int) (byte) 1, (int) (short) 0);
        ds.Ordenacao.mergeSort(intArray1, (int) (short) 10, 0);
        ds.Ordenacao.mergeSort(intArray1, (int) (short) 1, (int) (short) -1);
        ds.Ordenacao.mergeSort(intArray1, (int) (short) 10, (int) (short) 10);
        ds.Ordenacao.mergeSort(intArray1, (int) 'a', (int) (byte) -1);
        ds.Ordenacao.mergeSort(intArray1, (int) '4', (int) (short) 1);
        ds.Ordenacao.mergeSort(intArray1, (int) (short) 100, 0);
        java.lang.Class<?> wildcardClass29 = intArray1.getClass();
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray1), "[-1]");
        org.junit.Assert.assertNotNull(wildcardClass29);
    }

    @Test
    public void test2007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2007");
        int[] intArray2 = new int[] { '#', 100 };
        ds.Ordenacao.mergeSort(intArray2, (int) '4', (int) '4');
        ds.Ordenacao.mergeSort(intArray2, (int) 'a', (int) (short) 10);
        ds.Ordenacao.mergeSort(intArray2, (int) '4', (int) (short) 10);
        ds.Ordenacao.mergeSort(intArray2, 10, (int) (short) 1);
        ds.Ordenacao.mergeSort(intArray2, (int) 'a', (int) (byte) 10);
        ds.Ordenacao.mergeSort(intArray2, (int) '4', 1);
        ds.Ordenacao.mergeSort(intArray2, (int) (byte) 10, (int) (short) 0);
        ds.Ordenacao.mergeSort(intArray2, (int) (byte) 1, (int) (byte) 0);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[35, 100]");
    }

    @Test
    public void test2008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2008");
        int[] intArray2 = new int[] { '#', 100 };
        ds.Ordenacao.mergeSort(intArray2, (int) '4', (int) '4');
        ds.Ordenacao.mergeSort(intArray2, (int) (short) 10, (int) (short) 10);
        ds.Ordenacao.mergeSort(intArray2, 100, (int) (short) 10);
        ds.Ordenacao.mergeSort(intArray2, (int) (short) 10, (int) (byte) 1);
        ds.Ordenacao.mergeSort(intArray2, 10, 1);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[35, 100]");
    }

    @Test
    public void test2009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2009");
        int[] intArray1 = new int[] { (byte) 0 };
        ds.Ordenacao.mergeSort(intArray1, (int) (short) -1, (-1));
        ds.Ordenacao.mergeSort(intArray1, (int) (short) 10, 0);
        ds.Ordenacao.mergeSort(intArray1, 100, (int) (short) 0);
        ds.Ordenacao.mergeSort(intArray1, 100, (int) (short) 100);
        ds.Ordenacao.mergeSort(intArray1, (int) (short) 10, (int) (short) 1);
        ds.Ordenacao.mergeSort(intArray1, (int) (short) 100, (int) (byte) -1);
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray1), "[0]");
    }

    @Test
    public void test2010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2010");
        int[] intArray2 = new int[] { '#', 100 };
        ds.Ordenacao.mergeSort(intArray2, (int) '4', (int) '4');
        ds.Ordenacao.mergeSort(intArray2, (int) (short) 10, (int) (short) 10);
        ds.Ordenacao.mergeSort(intArray2, (int) ' ', (int) (byte) 0);
        ds.Ordenacao.mergeSort(intArray2, 1, (int) (byte) 1);
        ds.Ordenacao.mergeSort(intArray2, 10, (int) (byte) 10);
        ds.Ordenacao.mergeSort(intArray2, 0, (int) (byte) 0);
        ds.Ordenacao.mergeSort(intArray2, 100, 100);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[35, 100]");
    }

    @Test
    public void test2011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2011");
        int[] intArray1 = new int[] { (byte) -1 };
        ds.Ordenacao.mergeSort(intArray1, 0, (int) (short) -1);
        ds.Ordenacao.mergeSort(intArray1, 100, 0);
        ds.Ordenacao.mergeSort(intArray1, (int) (byte) 1, (int) (short) 0);
        ds.Ordenacao.mergeSort(intArray1, 10, 1);
        // The following exception was thrown during execution in test generation
        try {
            ds.Ordenacao.mergeSort(intArray1, (int) (byte) 0, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray1), "[-1]");
    }

    @Test
    public void test2012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2012");
        int[] intArray1 = new int[] { (byte) -1 };
        ds.Ordenacao.mergeSort(intArray1, 0, (int) (short) -1);
        ds.Ordenacao.mergeSort(intArray1, 100, 0);
        ds.Ordenacao.mergeSort(intArray1, (int) (byte) 1, (int) (short) 0);
        ds.Ordenacao.mergeSort(intArray1, 100, (int) '#');
        ds.Ordenacao.mergeSort(intArray1, (int) '#', (int) (short) 1);
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray1), "[-1]");
    }

    @Test
    public void test2013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2013");
        int[] intArray2 = new int[] { '#', 100 };
        ds.Ordenacao.mergeSort(intArray2, (int) '4', (int) '4');
        ds.Ordenacao.mergeSort(intArray2, (int) (short) 10, (int) (short) 10);
        ds.Ordenacao.mergeSort(intArray2, (int) ' ', (int) (byte) 0);
        ds.Ordenacao.mergeSort(intArray2, 1, (int) (byte) 1);
        ds.Ordenacao.mergeSort(intArray2, (-1), (int) (short) -1);
        ds.Ordenacao.mergeSort(intArray2, (int) (byte) 100, (int) (byte) 1);
        ds.Ordenacao.mergeSort(intArray2, (int) (short) 10, 10);
        ds.Ordenacao.mergeSort(intArray2, (int) ' ', (int) (short) 10);
        ds.Ordenacao.mergeSort(intArray2, (int) '4', 0);
        java.lang.Class<?> wildcardClass30 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[35, 100]");
        org.junit.Assert.assertNotNull(wildcardClass30);
    }

    @Test
    public void test2014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2014");
        int[] intArray1 = new int[] { (byte) -1 };
        ds.Ordenacao.mergeSort(intArray1, 0, (int) (short) -1);
        ds.Ordenacao.mergeSort(intArray1, 100, 0);
        ds.Ordenacao.mergeSort(intArray1, (int) '4', (int) (byte) 10);
        ds.Ordenacao.mergeSort(intArray1, (int) (byte) 100, 10);
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray1), "[-1]");
    }

    @Test
    public void test2015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2015");
        int[] intArray2 = new int[] { '#', 100 };
        ds.Ordenacao.mergeSort(intArray2, (int) '4', (int) '4');
        ds.Ordenacao.mergeSort(intArray2, (int) (short) 10, (int) (short) 10);
        ds.Ordenacao.mergeSort(intArray2, 100, (int) (short) 10);
        ds.Ordenacao.mergeSort(intArray2, 100, (-1));
        ds.Ordenacao.mergeSort(intArray2, (int) (short) 100, (int) (byte) 100);
        ds.Ordenacao.mergeSort(intArray2, 100, (int) (byte) 0);
        ds.Ordenacao.mergeSort(intArray2, 0, (int) (short) 1);
        ds.Ordenacao.mergeSort(intArray2, (int) '4', (int) (byte) 0);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[35, 100]");
    }

    @Test
    public void test2016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2016");
        int[] intArray0 = new int[] {};
        ds.Ordenacao.mergeSort(intArray0, (int) ' ', (int) (short) 0);
        ds.Ordenacao.mergeSort(intArray0, (int) ' ', (int) (short) -1);
        ds.Ordenacao.mergeSort(intArray0, (int) '#', (int) (byte) 10);
        ds.Ordenacao.mergeSort(intArray0, (int) (byte) 10, 10);
        ds.Ordenacao.mergeSort(intArray0, 1, (int) (short) 0);
        ds.Ordenacao.mergeSort(intArray0, (int) (byte) 1, (int) (short) -1);
        ds.Ordenacao.mergeSort(intArray0, (int) (short) 100, (int) (short) 10);
        ds.Ordenacao.mergeSort(intArray0, (int) (byte) 10, 0);
        ds.Ordenacao.mergeSort(intArray0, (int) 'a', (int) '#');
        ds.Ordenacao.mergeSort(intArray0, (int) '#', (-1));
        ds.Ordenacao.mergeSort(intArray0, 100, (int) (byte) 0);
        java.lang.Class<?> wildcardClass34 = intArray0.getClass();
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertNotNull(wildcardClass34);
    }

    @Test
    public void test2017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2017");
        int[] intArray2 = new int[] { '#', 100 };
        ds.Ordenacao.mergeSort(intArray2, (int) '4', (int) '4');
        ds.Ordenacao.mergeSort(intArray2, (int) (byte) 100, (int) ' ');
        ds.Ordenacao.mergeSort(intArray2, (int) ' ', (int) (short) 1);
        ds.Ordenacao.mergeSort(intArray2, (int) '4', (int) ' ');
        ds.Ordenacao.mergeSort(intArray2, 100, 1);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[35, 100]");
    }

    @Test
    public void test2018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2018");
        int[] intArray5 = new int[] { 10, (byte) 100, (short) 1, (byte) 0, 0 };
        ds.Ordenacao.mergeSort(intArray5, (int) (byte) 1, (int) (byte) 1);
        ds.Ordenacao.mergeSort(intArray5, (int) (short) 10, (int) (short) 10);
        ds.Ordenacao.mergeSort(intArray5, (int) (byte) 0, (int) (byte) -1);
        ds.Ordenacao.mergeSort(intArray5, (int) ' ', (int) (short) 1);
        java.lang.Class<?> wildcardClass18 = intArray5.getClass();
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[10, 100, 1, 0, 0]");
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test2019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2019");
        int[] intArray5 = new int[] { 10, (byte) 100, (short) 1, (byte) 0, 0 };
        ds.Ordenacao.mergeSort(intArray5, (int) (byte) 1, (int) (byte) 1);
        ds.Ordenacao.mergeSort(intArray5, 100, (-1));
        ds.Ordenacao.mergeSort(intArray5, (int) (byte) 10, (int) (short) -1);
        ds.Ordenacao.mergeSort(intArray5, (int) (short) 1, (int) (short) -1);
        ds.Ordenacao.mergeSort(intArray5, (int) (byte) 100, (int) (byte) 0);
        ds.Ordenacao.mergeSort(intArray5, 0, 1);
        ds.Ordenacao.mergeSort(intArray5, (int) '#', (int) (byte) 1);
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[10, 100, 1, 0, 0]");
    }

    @Test
    public void test2020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2020");
        int[] intArray2 = new int[] { '#', 100 };
        ds.Ordenacao.mergeSort(intArray2, (int) '4', (int) '4');
        ds.Ordenacao.mergeSort(intArray2, (int) (short) 10, (int) (short) 10);
        ds.Ordenacao.mergeSort(intArray2, 100, 0);
        ds.Ordenacao.mergeSort(intArray2, 100, 0);
        ds.Ordenacao.mergeSort(intArray2, 0, (int) (short) 0);
        ds.Ordenacao.mergeSort(intArray2, 1, 0);
        ds.Ordenacao.mergeSort(intArray2, (int) (byte) 10, (int) (byte) 10);
        ds.Ordenacao.mergeSort(intArray2, (int) '4', (int) '4');
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[35, 100]");
    }
}

