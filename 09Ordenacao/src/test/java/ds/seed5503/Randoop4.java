package ds.seed5503;

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
        int[] intArray3 = new int[] { '#', (byte) 0, 'a' };
        ds.Ordenacao.mergeSort(intArray3, (int) (byte) 100, (int) '4');
        ds.Ordenacao.mergeSort(intArray3, (int) (byte) 1, (int) (short) 0);
        ds.Ordenacao.mergeSort(intArray3, (int) (short) 10, (int) (byte) 0);
        ds.Ordenacao.mergeSort(intArray3, (int) '4', 1);
        ds.Ordenacao.mergeSort(intArray3, (int) '4', (int) '#');
        ds.Ordenacao.mergeSort(intArray3, (int) '#', (int) (byte) 10);
        java.lang.Class<?> wildcardClass22 = intArray3.getClass();
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[35, 0, 97]");
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test2002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2002");
        int[] intArray4 = new int[] { '#', (short) 10, ' ', (byte) 1 };
        ds.Ordenacao.mergeSort(intArray4, (int) (byte) 1, (int) (byte) -1);
        ds.Ordenacao.mergeSort(intArray4, (int) (byte) 1, (int) (byte) 1);
        ds.Ordenacao.mergeSort(intArray4, 100, 10);
        ds.Ordenacao.mergeSort(intArray4, 0, (int) (short) 1);
        ds.Ordenacao.mergeSort(intArray4, (int) (short) 10, 0);
        ds.Ordenacao.mergeSort(intArray4, (int) (byte) 100, (int) '4');
        ds.Ordenacao.mergeSort(intArray4, 100, 100);
        ds.Ordenacao.mergeSort(intArray4, (int) (byte) 100, (int) (byte) 0);
        ds.Ordenacao.mergeSort(intArray4, (int) (byte) 1, (int) (byte) -1);
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[10, 35, 32, 1]");
    }

    @Test
    public void test2003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2003");
        int[] intArray4 = new int[] { '#', (short) 10, ' ', (byte) 1 };
        ds.Ordenacao.mergeSort(intArray4, (int) (byte) 1, (int) (byte) -1);
        ds.Ordenacao.mergeSort(intArray4, (int) (short) 10, (int) (short) 0);
        ds.Ordenacao.mergeSort(intArray4, 100, 10);
        ds.Ordenacao.mergeSort(intArray4, (int) (byte) 100, (int) (byte) 100);
        ds.Ordenacao.mergeSort(intArray4, (int) '#', (-1));
        ds.Ordenacao.mergeSort(intArray4, (int) (byte) -1, (int) (short) -1);
        ds.Ordenacao.mergeSort(intArray4, (int) '#', 0);
        java.lang.Class<?> wildcardClass26 = intArray4.getClass();
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[35, 10, 32, 1]");
        org.junit.Assert.assertNotNull(wildcardClass26);
    }

    @Test
    public void test2004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2004");
        int[] intArray0 = null;
        ds.Ordenacao.mergeSort(intArray0, 100, 0);
    }

    @Test
    public void test2005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2005");
        int[] intArray4 = new int[] { '#', (short) 10, ' ', (byte) 1 };
        ds.Ordenacao.mergeSort(intArray4, (int) (byte) 1, (int) (byte) -1);
        ds.Ordenacao.mergeSort(intArray4, (int) '#', (int) (byte) 10);
        ds.Ordenacao.mergeSort(intArray4, (int) ' ', (int) (short) 0);
        ds.Ordenacao.mergeSort(intArray4, 0, 0);
        java.lang.Class<?> wildcardClass17 = intArray4.getClass();
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[35, 10, 32, 1]");
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test2006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2006");
        int[] intArray1 = new int[] { (short) -1 };
        ds.Ordenacao.mergeSort(intArray1, (int) '#', (int) '#');
        ds.Ordenacao.mergeSort(intArray1, (int) '#', (int) (short) 1);
        ds.Ordenacao.mergeSort(intArray1, 100, 10);
        ds.Ordenacao.mergeSort(intArray1, (int) 'a', 0);
        ds.Ordenacao.mergeSort(intArray1, (int) (byte) 10, (int) (byte) 10);
        ds.Ordenacao.mergeSort(intArray1, (int) ' ', (int) (short) 0);
        java.lang.Class<?> wildcardClass20 = intArray1.getClass();
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray1), "[-1]");
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test2007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2007");
        int[] intArray5 = new int[] { (byte) 1, (byte) 0, (short) 100, (short) -1, '#' };
        ds.Ordenacao.mergeSort(intArray5, (int) (byte) 0, 0);
        ds.Ordenacao.mergeSort(intArray5, (int) 'a', (int) (byte) -1);
        ds.Ordenacao.mergeSort(intArray5, (int) (byte) 100, (int) '#');
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[1, 0, 100, -1, 35]");
    }

    @Test
    public void test2008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2008");
        int[] intArray5 = new int[] { (byte) 1, (byte) 0, (short) 100, (short) -1, '#' };
        ds.Ordenacao.mergeSort(intArray5, (int) (byte) 0, 0);
        ds.Ordenacao.mergeSort(intArray5, (int) (short) 100, (int) (byte) -1);
        ds.Ordenacao.mergeSort(intArray5, (int) '4', (int) '4');
        ds.Ordenacao.mergeSort(intArray5, (int) (byte) 0, (int) (short) -1);
        ds.Ordenacao.mergeSort(intArray5, (int) '4', (int) ' ');
        ds.Ordenacao.mergeSort(intArray5, (int) '4', (int) '4');
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[1, 0, 100, -1, 35]");
    }

    @Test
    public void test2009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2009");
        int[] intArray2 = new int[] { (byte) 1, (short) -1 };
        ds.Ordenacao.mergeSort(intArray2, (int) '4', (-1));
        ds.Ordenacao.mergeSort(intArray2, (int) ' ', (int) (byte) 0);
        ds.Ordenacao.mergeSort(intArray2, (int) (short) 10, 1);
        ds.Ordenacao.mergeSort(intArray2, (int) (short) 1, (int) (byte) -1);
        ds.Ordenacao.mergeSort(intArray2, 0, (int) (short) -1);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[1, -1]");
    }

    @Test
    public void test2010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2010");
        int[] intArray3 = new int[] { '#', (byte) 0, 'a' };
        ds.Ordenacao.mergeSort(intArray3, (int) (byte) 100, (int) '4');
        ds.Ordenacao.mergeSort(intArray3, (int) (byte) 1, (int) (short) 0);
        ds.Ordenacao.mergeSort(intArray3, (int) (short) 10, (int) (byte) 0);
        ds.Ordenacao.mergeSort(intArray3, (int) '4', 1);
        ds.Ordenacao.mergeSort(intArray3, (int) (byte) 1, 0);
        ds.Ordenacao.mergeSort(intArray3, 10, (int) (byte) -1);
        ds.Ordenacao.mergeSort(intArray3, 10, (int) (byte) -1);
        ds.Ordenacao.mergeSort(intArray3, (int) '4', 1);
        ds.Ordenacao.mergeSort(intArray3, 100, (int) ' ');
        ds.Ordenacao.mergeSort(intArray3, (int) '4', (int) (short) 10);
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[35, 0, 97]");
    }

    @Test
    public void test2011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2011");
        int[] intArray2 = new int[] { (byte) 1, (short) -1 };
        ds.Ordenacao.mergeSort(intArray2, (int) '4', (-1));
        ds.Ordenacao.mergeSort(intArray2, (int) ' ', (int) (byte) 0);
        ds.Ordenacao.mergeSort(intArray2, (int) '#', 10);
        ds.Ordenacao.mergeSort(intArray2, (int) (byte) 1, (int) (byte) 1);
        ds.Ordenacao.mergeSort(intArray2, (int) (byte) 100, (int) (short) 10);
        ds.Ordenacao.mergeSort(intArray2, 10, (int) (short) 0);
        ds.Ordenacao.mergeSort(intArray2, (int) 'a', (int) (short) 1);
        java.lang.Class<?> wildcardClass24 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[1, -1]");
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test2012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2012");
        int[] intArray4 = new int[] { '#', (short) 10, ' ', (byte) 1 };
        ds.Ordenacao.mergeSort(intArray4, (int) (byte) 1, (int) (byte) -1);
        ds.Ordenacao.mergeSort(intArray4, (int) (short) 10, (int) (short) 0);
        ds.Ordenacao.mergeSort(intArray4, 100, 10);
        ds.Ordenacao.mergeSort(intArray4, (int) (byte) 100, (int) (byte) 100);
        ds.Ordenacao.mergeSort(intArray4, (int) (short) 1, 0);
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[35, 10, 32, 1]");
    }
}

