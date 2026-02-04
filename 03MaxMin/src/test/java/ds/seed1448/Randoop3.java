package ds.seed1448;

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
        int[] intArray3 = new int[] { (short) 100, (short) 100, 1 };
        int[] intArray5 = ds.MaxMin2.maxMin2(intArray3, (int) (short) 0);
        int[] intArray7 = ds.MaxMin2.maxMin2(intArray3, 1);
        int[] intArray9 = ds.MaxMin2.maxMin2(intArray3, (int) (byte) 0);
        int[] intArray11 = ds.MaxMin2.maxMin2(intArray9, (int) (short) -1);
        int[] intArray13 = ds.MaxMin2.maxMin2(intArray11, (int) (byte) 0);
        int[] intArray15 = ds.MaxMin2.maxMin2(intArray11, (int) (byte) 1);
        java.lang.Class<?> wildcardClass16 = intArray11.getClass();
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[100, 100, 1]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[100, 100]");
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test1502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1502");
        int[] intArray3 = new int[] { (short) 100, (short) 100, 1 };
        int[] intArray5 = ds.MaxMin2.maxMin2(intArray3, (int) (short) 0);
        int[] intArray7 = ds.MaxMin2.maxMin2(intArray3, 1);
        int[] intArray9 = ds.MaxMin2.maxMin2(intArray3, (int) (byte) 0);
        int[] intArray11 = ds.MaxMin2.maxMin2(intArray9, (int) (short) -1);
        int[] intArray13 = ds.MaxMin2.maxMin2(intArray11, (int) (byte) 0);
        int[] intArray15 = ds.MaxMin2.maxMin2(intArray13, 0);
        int[] intArray17 = ds.MaxMin2.maxMin2(intArray13, (int) (short) -1);
        int[] intArray19 = ds.MaxMin2.maxMin2(intArray17, 1);
        int[] intArray21 = ds.MaxMin2.maxMin2(intArray17, 1);
        int[] intArray23 = ds.MaxMin2.maxMin2(intArray17, 0);
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[100, 100, 1]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray19), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray21), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray23), "[100, 100]");
    }

    @Test
    public void test1503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1503");
        int[] intArray3 = new int[] { (short) 100, (short) 100, 1 };
        int[] intArray5 = ds.MaxMin2.maxMin2(intArray3, (int) (short) 0);
        int[] intArray7 = ds.MaxMin2.maxMin2(intArray3, (int) (byte) 1);
        int[] intArray9 = ds.MaxMin2.maxMin2(intArray7, (int) (byte) 0);
        int[] intArray11 = ds.MaxMin2.maxMin2(intArray7, (int) (byte) -1);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray13 = ds.MaxMin2.maxMin2(intArray11, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[100, 100, 1]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[100, 100]");
    }

    @Test
    public void test1504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1504");
        int[] intArray3 = new int[] { (short) 100, (short) 100, 1 };
        int[] intArray5 = ds.MaxMin2.maxMin2(intArray3, (int) (short) 0);
        int[] intArray7 = ds.MaxMin2.maxMin2(intArray3, 1);
        int[] intArray9 = ds.MaxMin2.maxMin2(intArray7, (int) (short) -1);
        int[] intArray11 = ds.MaxMin2.maxMin2(intArray9, (int) (byte) 0);
        int[] intArray13 = ds.MaxMin2.maxMin2(intArray11, (-1));
        int[] intArray15 = ds.MaxMin2.maxMin2(intArray13, (int) (byte) -1);
        int[] intArray17 = ds.MaxMin2.maxMin2(intArray13, 1);
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[100, 100, 1]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[100, 100]");
    }

    @Test
    public void test1505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1505");
        int[] intArray3 = new int[] { (short) 100, (short) 100, 1 };
        int[] intArray5 = ds.MaxMin2.maxMin2(intArray3, (int) (short) 0);
        int[] intArray7 = ds.MaxMin2.maxMin2(intArray5, (int) (byte) 0);
        int[] intArray9 = ds.MaxMin2.maxMin2(intArray7, (int) (short) -1);
        int[] intArray11 = ds.MaxMin2.maxMin2(intArray7, (int) (byte) 1);
        int[] intArray13 = ds.MaxMin2.maxMin2(intArray11, (int) (short) -1);
        int[] intArray15 = ds.MaxMin2.maxMin2(intArray11, (int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray17 = ds.MaxMin2.maxMin2(intArray11, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[100, 100, 1]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[100, 100]");
    }

    @Test
    public void test1506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1506");
        int[] intArray3 = new int[] { (short) 100, (short) 100, 1 };
        int[] intArray5 = ds.MaxMin2.maxMin2(intArray3, (int) (short) 0);
        int[] intArray7 = ds.MaxMin2.maxMin2(intArray3, 1);
        int[] intArray9 = ds.MaxMin2.maxMin2(intArray3, (int) (byte) 0);
        int[] intArray11 = ds.MaxMin2.maxMin2(intArray9, (-1));
        int[] intArray13 = ds.MaxMin2.maxMin2(intArray11, 1);
        int[] intArray15 = ds.MaxMin2.maxMin2(intArray11, (int) (byte) 0);
        int[] intArray17 = ds.MaxMin2.maxMin2(intArray11, (int) (short) -1);
        java.lang.Class<?> wildcardClass18 = intArray17.getClass();
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[100, 100, 1]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[100, 100]");
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test1507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1507");
        int[] intArray3 = new int[] { (short) 100, (short) 100, 1 };
        int[] intArray5 = ds.MaxMin2.maxMin2(intArray3, (int) (short) 0);
        int[] intArray7 = ds.MaxMin2.maxMin2(intArray3, (int) (byte) -1);
        int[] intArray9 = ds.MaxMin2.maxMin2(intArray7, (int) (byte) 1);
        int[] intArray11 = ds.MaxMin2.maxMin2(intArray9, (int) (byte) -1);
        int[] intArray13 = ds.MaxMin2.maxMin2(intArray11, (-1));
        int[] intArray15 = ds.MaxMin2.maxMin2(intArray11, (int) (byte) -1);
        int[] intArray17 = ds.MaxMin2.maxMin2(intArray15, 0);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray19 = ds.MaxMin2.maxMin2(intArray17, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[100, 100, 1]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[100, 100]");
    }

    @Test
    public void test1508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1508");
        int[] intArray3 = new int[] { (short) 100, (short) 100, 1 };
        int[] intArray5 = ds.MaxMin2.maxMin2(intArray3, (int) (short) 0);
        int[] intArray7 = ds.MaxMin2.maxMin2(intArray3, 1);
        int[] intArray9 = ds.MaxMin2.maxMin2(intArray7, (int) (short) -1);
        int[] intArray11 = ds.MaxMin2.maxMin2(intArray7, (int) (short) 0);
        int[] intArray13 = ds.MaxMin2.maxMin2(intArray11, (-1));
        int[] intArray15 = ds.MaxMin2.maxMin2(intArray11, 0);
        java.lang.Class<?> wildcardClass16 = intArray15.getClass();
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[100, 100, 1]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[100, 100]");
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test1509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1509");
        int[] intArray3 = new int[] { (short) 100, (short) 100, 1 };
        int[] intArray5 = ds.MaxMin2.maxMin2(intArray3, (int) (short) 0);
        int[] intArray7 = ds.MaxMin2.maxMin2(intArray5, (int) (byte) -1);
        int[] intArray9 = ds.MaxMin2.maxMin2(intArray7, 1);
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[100, 100, 1]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[100, 100]");
    }

    @Test
    public void test1510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1510");
        int[] intArray2 = new int[] { 10, '#' };
        int[] intArray4 = ds.MaxMin2.maxMin2(intArray2, (-1));
        int[] intArray6 = ds.MaxMin2.maxMin2(intArray4, (int) (short) -1);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray8 = ds.MaxMin2.maxMin2(intArray4, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[10, 35]");
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[10, 10]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[10, 10]");
    }

    @Test
    public void test1511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1511");
        int[] intArray3 = new int[] { (short) 100, (short) 100, 1 };
        int[] intArray5 = ds.MaxMin2.maxMin2(intArray3, (int) (short) 0);
        int[] intArray7 = ds.MaxMin2.maxMin2(intArray3, 1);
        int[] intArray9 = ds.MaxMin2.maxMin2(intArray7, (int) (short) -1);
        int[] intArray11 = ds.MaxMin2.maxMin2(intArray9, (int) (byte) -1);
        int[] intArray13 = ds.MaxMin2.maxMin2(intArray9, (-1));
        int[] intArray15 = ds.MaxMin2.maxMin2(intArray9, (int) (short) 1);
        int[] intArray17 = ds.MaxMin2.maxMin2(intArray15, (int) (short) -1);
        int[] intArray19 = ds.MaxMin2.maxMin2(intArray15, (int) (short) -1);
        int[] intArray21 = ds.MaxMin2.maxMin2(intArray19, (-1));
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray23 = ds.MaxMin2.maxMin2(intArray19, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[100, 100, 1]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray19), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray21), "[100, 100]");
    }

    @Test
    public void test1512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1512");
        int[] intArray3 = new int[] { (short) 100, (short) 100, 1 };
        int[] intArray5 = ds.MaxMin2.maxMin2(intArray3, (int) (short) 0);
        int[] intArray7 = ds.MaxMin2.maxMin2(intArray5, (int) (byte) -1);
        int[] intArray9 = ds.MaxMin2.maxMin2(intArray5, (int) (byte) 0);
        int[] intArray11 = ds.MaxMin2.maxMin2(intArray9, (int) (short) -1);
        int[] intArray13 = ds.MaxMin2.maxMin2(intArray9, (int) (byte) -1);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray15 = ds.MaxMin2.maxMin2(intArray13, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[100, 100, 1]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[100, 100]");
    }

    @Test
    public void test1513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1513");
        int[] intArray3 = new int[] { (short) 100, (short) 100, 1 };
        int[] intArray5 = ds.MaxMin2.maxMin2(intArray3, (int) (short) 0);
        int[] intArray7 = ds.MaxMin2.maxMin2(intArray3, 1);
        int[] intArray9 = ds.MaxMin2.maxMin2(intArray7, (int) (short) -1);
        int[] intArray11 = ds.MaxMin2.maxMin2(intArray7, (int) (short) 0);
        int[] intArray13 = ds.MaxMin2.maxMin2(intArray11, (-1));
        int[] intArray15 = ds.MaxMin2.maxMin2(intArray11, 0);
        int[] intArray17 = ds.MaxMin2.maxMin2(intArray15, (int) (short) 1);
        java.lang.Class<?> wildcardClass18 = intArray17.getClass();
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[100, 100, 1]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[100, 100]");
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test1514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1514");
        int[] intArray3 = new int[] { (short) 100, (short) 100, 1 };
        int[] intArray5 = ds.MaxMin2.maxMin2(intArray3, (int) (short) 0);
        int[] intArray7 = ds.MaxMin2.maxMin2(intArray5, (int) (byte) -1);
        int[] intArray9 = ds.MaxMin2.maxMin2(intArray5, 0);
        int[] intArray11 = ds.MaxMin2.maxMin2(intArray5, (int) (short) 1);
        int[] intArray13 = ds.MaxMin2.maxMin2(intArray5, 0);
        int[] intArray15 = ds.MaxMin2.maxMin2(intArray5, 0);
        int[] intArray17 = ds.MaxMin2.maxMin2(intArray5, 0);
        int[] intArray19 = ds.MaxMin2.maxMin2(intArray5, (-1));
        java.lang.Class<?> wildcardClass20 = intArray5.getClass();
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[100, 100, 1]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray19), "[100, 100]");
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test1515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1515");
        int[] intArray3 = new int[] { (short) 100, (short) 100, 1 };
        int[] intArray5 = ds.MaxMin2.maxMin2(intArray3, (int) (short) 0);
        int[] intArray7 = ds.MaxMin2.maxMin2(intArray3, 0);
        int[] intArray9 = ds.MaxMin2.maxMin2(intArray7, (int) (short) -1);
        int[] intArray11 = ds.MaxMin2.maxMin2(intArray9, (-1));
        int[] intArray13 = ds.MaxMin2.maxMin2(intArray11, (int) (short) 0);
        int[] intArray15 = ds.MaxMin2.maxMin2(intArray11, (int) (short) -1);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray17 = ds.MaxMin2.maxMin2(intArray15, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[100, 100, 1]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[100, 100]");
    }

    @Test
    public void test1516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1516");
        int[] intArray3 = new int[] { (short) 100, (short) 100, 1 };
        int[] intArray5 = ds.MaxMin2.maxMin2(intArray3, (int) (short) 0);
        int[] intArray7 = ds.MaxMin2.maxMin2(intArray3, 1);
        int[] intArray9 = ds.MaxMin2.maxMin2(intArray3, (int) (byte) 0);
        int[] intArray11 = ds.MaxMin2.maxMin2(intArray9, (int) (short) -1);
        int[] intArray13 = ds.MaxMin2.maxMin2(intArray11, (int) (byte) 0);
        int[] intArray15 = ds.MaxMin2.maxMin2(intArray13, 0);
        int[] intArray17 = ds.MaxMin2.maxMin2(intArray15, 1);
        int[] intArray19 = ds.MaxMin2.maxMin2(intArray17, (-1));
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray21 = ds.MaxMin2.maxMin2(intArray17, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[100, 100, 1]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray19), "[100, 100]");
    }

    @Test
    public void test1517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1517");
        int[] intArray3 = new int[] { (short) 100, (short) 100, 1 };
        int[] intArray5 = ds.MaxMin2.maxMin2(intArray3, (int) (short) 0);
        int[] intArray7 = ds.MaxMin2.maxMin2(intArray3, 1);
        int[] intArray9 = ds.MaxMin2.maxMin2(intArray3, (int) (byte) 0);
        int[] intArray11 = ds.MaxMin2.maxMin2(intArray9, (-1));
        int[] intArray13 = ds.MaxMin2.maxMin2(intArray11, 0);
        int[] intArray15 = ds.MaxMin2.maxMin2(intArray13, (int) (byte) 1);
        int[] intArray17 = ds.MaxMin2.maxMin2(intArray15, (int) (byte) -1);
        java.lang.Class<?> wildcardClass18 = intArray17.getClass();
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[100, 100, 1]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[100, 100]");
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test1518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1518");
        int[] intArray3 = new int[] { (short) 100, (short) 100, 1 };
        int[] intArray5 = ds.MaxMin2.maxMin2(intArray3, (int) (short) 0);
        int[] intArray7 = ds.MaxMin2.maxMin2(intArray5, (int) (short) 1);
        int[] intArray9 = ds.MaxMin2.maxMin2(intArray5, (int) (byte) -1);
        int[] intArray11 = ds.MaxMin2.maxMin2(intArray5, (int) (short) 0);
        int[] intArray13 = ds.MaxMin2.maxMin2(intArray11, 0);
        java.lang.Class<?> wildcardClass14 = intArray11.getClass();
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[100, 100, 1]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[100, 100]");
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test1519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1519");
        int[] intArray3 = new int[] { (short) 100, (short) 100, 1 };
        int[] intArray5 = ds.MaxMin2.maxMin2(intArray3, (int) (short) 0);
        int[] intArray7 = ds.MaxMin2.maxMin2(intArray3, 1);
        int[] intArray9 = ds.MaxMin2.maxMin2(intArray3, (int) (byte) 0);
        int[] intArray11 = ds.MaxMin2.maxMin2(intArray9, (int) (short) -1);
        int[] intArray13 = ds.MaxMin2.maxMin2(intArray11, (int) (byte) 0);
        int[] intArray15 = ds.MaxMin2.maxMin2(intArray13, 0);
        int[] intArray17 = ds.MaxMin2.maxMin2(intArray13, (int) (short) -1);
        int[] intArray19 = ds.MaxMin2.maxMin2(intArray17, (int) (short) 1);
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[100, 100, 1]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray19), "[100, 100]");
    }

    @Test
    public void test1520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1520");
        int[] intArray3 = new int[] { (short) 100, (short) 100, 1 };
        int[] intArray5 = ds.MaxMin2.maxMin2(intArray3, (int) (short) 0);
        int[] intArray7 = ds.MaxMin2.maxMin2(intArray3, 1);
        int[] intArray9 = ds.MaxMin2.maxMin2(intArray7, (int) (short) -1);
        int[] intArray11 = ds.MaxMin2.maxMin2(intArray9, (int) (byte) -1);
        int[] intArray13 = ds.MaxMin2.maxMin2(intArray9, (-1));
        int[] intArray15 = ds.MaxMin2.maxMin2(intArray9, (int) (short) 1);
        int[] intArray17 = ds.MaxMin2.maxMin2(intArray15, (-1));
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray19 = ds.MaxMin2.maxMin2(intArray15, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[100, 100, 1]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[100, 100]");
    }

    @Test
    public void test1521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1521");
        int[] intArray3 = new int[] { (short) 100, (short) 100, 1 };
        int[] intArray5 = ds.MaxMin2.maxMin2(intArray3, (int) (short) 0);
        int[] intArray7 = ds.MaxMin2.maxMin2(intArray3, 1);
        int[] intArray9 = ds.MaxMin2.maxMin2(intArray7, (int) (short) -1);
        int[] intArray11 = ds.MaxMin2.maxMin2(intArray9, (int) (byte) 0);
        int[] intArray13 = ds.MaxMin2.maxMin2(intArray11, (-1));
        int[] intArray15 = ds.MaxMin2.maxMin2(intArray13, 1);
        int[] intArray17 = ds.MaxMin2.maxMin2(intArray15, 0);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray19 = ds.MaxMin2.maxMin2(intArray15, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[100, 100, 1]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[100, 100]");
    }

    @Test
    public void test1522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1522");
        int[] intArray3 = new int[] { (short) 100, (short) 100, 1 };
        int[] intArray5 = ds.MaxMin2.maxMin2(intArray3, (int) (short) 0);
        int[] intArray7 = ds.MaxMin2.maxMin2(intArray5, (int) (short) 1);
        int[] intArray9 = ds.MaxMin2.maxMin2(intArray5, (int) (byte) -1);
        int[] intArray11 = ds.MaxMin2.maxMin2(intArray5, (int) (short) 0);
        int[] intArray13 = ds.MaxMin2.maxMin2(intArray11, (int) (byte) 1);
        int[] intArray15 = ds.MaxMin2.maxMin2(intArray13, (int) (byte) 0);
        int[] intArray17 = ds.MaxMin2.maxMin2(intArray13, 0);
        int[] intArray19 = ds.MaxMin2.maxMin2(intArray17, 0);
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[100, 100, 1]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray19), "[100, 100]");
    }

    @Test
    public void test1523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1523");
        int[] intArray3 = new int[] { (short) 100, (short) 100, 1 };
        int[] intArray5 = ds.MaxMin2.maxMin2(intArray3, (int) (short) 0);
        int[] intArray7 = ds.MaxMin2.maxMin2(intArray3, 1);
        int[] intArray9 = ds.MaxMin2.maxMin2(intArray7, (int) (short) -1);
        int[] intArray11 = ds.MaxMin2.maxMin2(intArray9, (int) (byte) -1);
        int[] intArray13 = ds.MaxMin2.maxMin2(intArray9, (-1));
        int[] intArray15 = ds.MaxMin2.maxMin2(intArray9, (int) (short) 1);
        int[] intArray17 = ds.MaxMin2.maxMin2(intArray9, (-1));
        java.lang.Class<?> wildcardClass18 = intArray17.getClass();
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[100, 100, 1]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[100, 100]");
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test1524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1524");
        int[] intArray3 = new int[] { (short) 100, (short) 100, 1 };
        int[] intArray5 = ds.MaxMin2.maxMin2(intArray3, (int) (short) 0);
        int[] intArray7 = ds.MaxMin2.maxMin2(intArray3, (int) (byte) 1);
        int[] intArray9 = ds.MaxMin2.maxMin2(intArray3, 0);
        int[] intArray11 = ds.MaxMin2.maxMin2(intArray3, 0);
        int[] intArray13 = ds.MaxMin2.maxMin2(intArray11, (int) (byte) 1);
        int[] intArray15 = ds.MaxMin2.maxMin2(intArray11, (int) (byte) 0);
        int[] intArray17 = ds.MaxMin2.maxMin2(intArray11, (int) (byte) 1);
        int[] intArray19 = ds.MaxMin2.maxMin2(intArray17, (int) (short) -1);
        java.lang.Class<?> wildcardClass20 = intArray19.getClass();
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[100, 100, 1]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray19), "[100, 100]");
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test1525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1525");
        int[] intArray3 = new int[] { (short) 100, (short) 100, 1 };
        int[] intArray5 = ds.MaxMin2.maxMin2(intArray3, (int) (short) 0);
        int[] intArray7 = ds.MaxMin2.maxMin2(intArray3, 1);
        int[] intArray9 = ds.MaxMin2.maxMin2(intArray7, (int) (short) -1);
        int[] intArray11 = ds.MaxMin2.maxMin2(intArray9, (int) (byte) -1);
        int[] intArray13 = ds.MaxMin2.maxMin2(intArray9, (-1));
        int[] intArray15 = ds.MaxMin2.maxMin2(intArray9, (int) (short) 1);
        int[] intArray17 = ds.MaxMin2.maxMin2(intArray15, (-1));
        int[] intArray19 = ds.MaxMin2.maxMin2(intArray15, 0);
        int[] intArray21 = ds.MaxMin2.maxMin2(intArray19, (int) (short) -1);
        java.lang.Class<?> wildcardClass22 = intArray19.getClass();
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[100, 100, 1]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray19), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray21), "[100, 100]");
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test1526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1526");
        int[] intArray3 = new int[] { (short) 100, (short) 100, 1 };
        int[] intArray5 = ds.MaxMin2.maxMin2(intArray3, (int) (short) 0);
        int[] intArray7 = ds.MaxMin2.maxMin2(intArray3, (int) (byte) 1);
        int[] intArray9 = ds.MaxMin2.maxMin2(intArray3, (int) (byte) -1);
        int[] intArray11 = ds.MaxMin2.maxMin2(intArray3, (int) (short) 0);
        int[] intArray13 = ds.MaxMin2.maxMin2(intArray11, 0);
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[100, 100, 1]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[100, 100]");
    }

    @Test
    public void test1527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1527");
        int[] intArray3 = new int[] { (short) 100, (short) 100, 1 };
        int[] intArray5 = ds.MaxMin2.maxMin2(intArray3, (int) (short) 0);
        int[] intArray7 = ds.MaxMin2.maxMin2(intArray3, 0);
        int[] intArray9 = ds.MaxMin2.maxMin2(intArray7, (int) (short) -1);
        int[] intArray11 = ds.MaxMin2.maxMin2(intArray9, 0);
        int[] intArray13 = ds.MaxMin2.maxMin2(intArray9, 0);
        int[] intArray15 = ds.MaxMin2.maxMin2(intArray9, 0);
        int[] intArray17 = ds.MaxMin2.maxMin2(intArray9, (int) (byte) 1);
        int[] intArray19 = ds.MaxMin2.maxMin2(intArray9, (int) (short) 1);
        java.lang.Class<?> wildcardClass20 = intArray9.getClass();
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[100, 100, 1]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray19), "[100, 100]");
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test1528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1528");
        int[] intArray3 = new int[] { (short) 100, (short) 100, 1 };
        int[] intArray5 = ds.MaxMin2.maxMin2(intArray3, (int) (short) 0);
        int[] intArray7 = ds.MaxMin2.maxMin2(intArray3, 1);
        int[] intArray9 = ds.MaxMin2.maxMin2(intArray7, (int) (short) -1);
        int[] intArray11 = ds.MaxMin2.maxMin2(intArray9, (int) (byte) 0);
        int[] intArray13 = ds.MaxMin2.maxMin2(intArray9, (int) (byte) 0);
        int[] intArray15 = ds.MaxMin2.maxMin2(intArray13, (int) (short) -1);
        int[] intArray17 = ds.MaxMin2.maxMin2(intArray13, (int) (short) -1);
        int[] intArray19 = ds.MaxMin2.maxMin2(intArray17, (int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray21 = ds.MaxMin2.maxMin2(intArray17, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[100, 100, 1]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray19), "[100, 100]");
    }

    @Test
    public void test1529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1529");
        int[] intArray3 = new int[] { (short) 100, (short) 100, 1 };
        int[] intArray5 = ds.MaxMin2.maxMin2(intArray3, (int) (short) 0);
        int[] intArray7 = ds.MaxMin2.maxMin2(intArray5, (int) (byte) -1);
        int[] intArray9 = ds.MaxMin2.maxMin2(intArray5, 0);
        int[] intArray11 = ds.MaxMin2.maxMin2(intArray5, (int) (short) 1);
        int[] intArray13 = ds.MaxMin2.maxMin2(intArray5, 0);
        int[] intArray15 = ds.MaxMin2.maxMin2(intArray5, 0);
        int[] intArray17 = ds.MaxMin2.maxMin2(intArray5, 0);
        int[] intArray19 = ds.MaxMin2.maxMin2(intArray17, 0);
        int[] intArray21 = ds.MaxMin2.maxMin2(intArray17, 0);
        int[] intArray23 = ds.MaxMin2.maxMin2(intArray17, (int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray25 = ds.MaxMin2.maxMin2(intArray17, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[100, 100, 1]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray19), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray21), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray23), "[100, 100]");
    }

    @Test
    public void test1530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1530");
        int[] intArray3 = new int[] { (short) 100, (short) 100, 1 };
        int[] intArray5 = ds.MaxMin2.maxMin2(intArray3, (int) (short) 0);
        int[] intArray7 = ds.MaxMin2.maxMin2(intArray3, 1);
        int[] intArray9 = ds.MaxMin2.maxMin2(intArray7, (int) (short) -1);
        int[] intArray11 = ds.MaxMin2.maxMin2(intArray9, (int) (byte) 0);
        int[] intArray13 = ds.MaxMin2.maxMin2(intArray11, (-1));
        int[] intArray15 = ds.MaxMin2.maxMin2(intArray11, (int) (short) 0);
        int[] intArray17 = ds.MaxMin2.maxMin2(intArray15, (int) (byte) -1);
        int[] intArray19 = ds.MaxMin2.maxMin2(intArray17, (int) (short) 1);
        int[] intArray21 = ds.MaxMin2.maxMin2(intArray19, (int) (byte) -1);
        int[] intArray23 = ds.MaxMin2.maxMin2(intArray21, (int) (short) 0);
        int[] intArray25 = ds.MaxMin2.maxMin2(intArray21, (int) (byte) -1);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray27 = ds.MaxMin2.maxMin2(intArray21, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[100, 100, 1]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray19), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray21), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray23), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray25), "[100, 100]");
    }

    @Test
    public void test1531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1531");
        int[] intArray3 = new int[] { (short) 100, (short) 100, 1 };
        int[] intArray5 = ds.MaxMin2.maxMin2(intArray3, (int) (short) 0);
        int[] intArray7 = ds.MaxMin2.maxMin2(intArray3, 1);
        int[] intArray9 = ds.MaxMin2.maxMin2(intArray7, (int) (short) -1);
        int[] intArray11 = ds.MaxMin2.maxMin2(intArray9, (int) (byte) 0);
        int[] intArray13 = ds.MaxMin2.maxMin2(intArray11, (-1));
        int[] intArray15 = ds.MaxMin2.maxMin2(intArray11, (int) (byte) 1);
        int[] intArray17 = ds.MaxMin2.maxMin2(intArray15, 1);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray19 = ds.MaxMin2.maxMin2(intArray15, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[100, 100, 1]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[100, 100]");
    }

    @Test
    public void test1532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1532");
        int[] intArray3 = new int[] { (short) 100, (short) 100, 1 };
        int[] intArray5 = ds.MaxMin2.maxMin2(intArray3, (int) (short) 0);
        int[] intArray7 = ds.MaxMin2.maxMin2(intArray3, 1);
        int[] intArray9 = ds.MaxMin2.maxMin2(intArray7, (int) (short) -1);
        int[] intArray11 = ds.MaxMin2.maxMin2(intArray9, (int) (byte) 0);
        int[] intArray13 = ds.MaxMin2.maxMin2(intArray11, (-1));
        int[] intArray15 = ds.MaxMin2.maxMin2(intArray11, (int) (short) 0);
        int[] intArray17 = ds.MaxMin2.maxMin2(intArray15, (-1));
        int[] intArray19 = ds.MaxMin2.maxMin2(intArray15, 0);
        int[] intArray21 = ds.MaxMin2.maxMin2(intArray15, (int) (short) 0);
        java.lang.Class<?> wildcardClass22 = intArray15.getClass();
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[100, 100, 1]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray19), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray21), "[100, 100]");
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test1533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1533");
        int[] intArray3 = new int[] { (short) 100, (short) 100, 1 };
        int[] intArray5 = ds.MaxMin2.maxMin2(intArray3, (int) (short) 0);
        int[] intArray7 = ds.MaxMin2.maxMin2(intArray3, (int) (byte) 1);
        int[] intArray9 = ds.MaxMin2.maxMin2(intArray3, 0);
        int[] intArray11 = ds.MaxMin2.maxMin2(intArray3, 0);
        int[] intArray13 = ds.MaxMin2.maxMin2(intArray11, (int) (byte) 1);
        int[] intArray15 = ds.MaxMin2.maxMin2(intArray11, (int) (byte) 0);
        int[] intArray17 = ds.MaxMin2.maxMin2(intArray15, (int) (short) 1);
        int[] intArray19 = ds.MaxMin2.maxMin2(intArray17, (int) (byte) 0);
        int[] intArray21 = ds.MaxMin2.maxMin2(intArray17, (int) (byte) -1);
        int[] intArray23 = ds.MaxMin2.maxMin2(intArray21, (-1));
        java.lang.Class<?> wildcardClass24 = intArray23.getClass();
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[100, 100, 1]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray19), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray21), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray23), "[100, 100]");
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test1534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1534");
        int[] intArray3 = new int[] { (short) 100, (short) 100, 1 };
        int[] intArray5 = ds.MaxMin2.maxMin2(intArray3, (int) (short) 0);
        int[] intArray7 = ds.MaxMin2.maxMin2(intArray5, (int) (byte) 0);
        int[] intArray9 = ds.MaxMin2.maxMin2(intArray7, (int) (short) -1);
        int[] intArray11 = ds.MaxMin2.maxMin2(intArray7, (int) (byte) 1);
        int[] intArray13 = ds.MaxMin2.maxMin2(intArray11, (int) (short) -1);
        int[] intArray15 = ds.MaxMin2.maxMin2(intArray11, (int) (byte) 0);
        int[] intArray17 = ds.MaxMin2.maxMin2(intArray15, (-1));
        int[] intArray19 = ds.MaxMin2.maxMin2(intArray17, (int) (byte) -1);
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[100, 100, 1]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray19), "[100, 100]");
    }

    @Test
    public void test1535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1535");
        int[] intArray3 = new int[] { (short) 100, (short) 100, 1 };
        int[] intArray5 = ds.MaxMin2.maxMin2(intArray3, (int) (short) 0);
        int[] intArray7 = ds.MaxMin2.maxMin2(intArray3, (int) (byte) 1);
        int[] intArray9 = ds.MaxMin2.maxMin2(intArray3, 0);
        int[] intArray11 = ds.MaxMin2.maxMin2(intArray3, 0);
        int[] intArray13 = ds.MaxMin2.maxMin2(intArray3, 1);
        int[] intArray15 = ds.MaxMin2.maxMin2(intArray3, (int) (short) -1);
        int[] intArray17 = ds.MaxMin2.maxMin2(intArray3, (-1));
        int[] intArray19 = ds.MaxMin2.maxMin2(intArray17, (int) (short) -1);
        int[] intArray21 = ds.MaxMin2.maxMin2(intArray19, (int) (short) -1);
        int[] intArray23 = ds.MaxMin2.maxMin2(intArray19, (int) (short) 1);
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[100, 100, 1]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray19), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray21), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray23), "[100, 100]");
    }

    @Test
    public void test1536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1536");
        int[] intArray3 = new int[] { (short) 100, (short) 100, 1 };
        int[] intArray5 = ds.MaxMin2.maxMin2(intArray3, (int) (short) 0);
        int[] intArray7 = ds.MaxMin2.maxMin2(intArray3, (int) (byte) -1);
        int[] intArray9 = ds.MaxMin2.maxMin2(intArray7, (int) (byte) 1);
        int[] intArray11 = ds.MaxMin2.maxMin2(intArray9, (int) (byte) -1);
        int[] intArray13 = ds.MaxMin2.maxMin2(intArray11, (-1));
        int[] intArray15 = ds.MaxMin2.maxMin2(intArray11, (int) (byte) -1);
        int[] intArray17 = ds.MaxMin2.maxMin2(intArray15, 0);
        int[] intArray19 = ds.MaxMin2.maxMin2(intArray17, 0);
        int[] intArray21 = ds.MaxMin2.maxMin2(intArray17, (int) (short) 1);
        java.lang.Class<?> wildcardClass22 = intArray21.getClass();
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[100, 100, 1]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray19), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray21), "[100, 100]");
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test1537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1537");
        int[] intArray3 = new int[] { (short) 100, (short) 100, 1 };
        int[] intArray5 = ds.MaxMin2.maxMin2(intArray3, (int) (short) 0);
        int[] intArray7 = ds.MaxMin2.maxMin2(intArray3, 1);
        int[] intArray9 = ds.MaxMin2.maxMin2(intArray7, (int) (short) -1);
        int[] intArray11 = ds.MaxMin2.maxMin2(intArray9, (int) (byte) -1);
        int[] intArray13 = ds.MaxMin2.maxMin2(intArray9, (-1));
        int[] intArray15 = ds.MaxMin2.maxMin2(intArray9, (int) (byte) 0);
        int[] intArray17 = ds.MaxMin2.maxMin2(intArray15, (int) (byte) 0);
        int[] intArray19 = ds.MaxMin2.maxMin2(intArray15, 0);
        int[] intArray21 = ds.MaxMin2.maxMin2(intArray15, 1);
        int[] intArray23 = ds.MaxMin2.maxMin2(intArray15, 1);
        int[] intArray25 = ds.MaxMin2.maxMin2(intArray15, (int) (byte) -1);
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[100, 100, 1]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray19), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray21), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray23), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray25), "[100, 100]");
    }

    @Test
    public void test1538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1538");
        int[] intArray3 = new int[] { (short) 100, (short) 100, 1 };
        int[] intArray5 = ds.MaxMin2.maxMin2(intArray3, (int) (short) 0);
        int[] intArray7 = ds.MaxMin2.maxMin2(intArray3, 1);
        int[] intArray9 = ds.MaxMin2.maxMin2(intArray7, (int) (short) -1);
        int[] intArray11 = ds.MaxMin2.maxMin2(intArray9, (int) (byte) 0);
        int[] intArray13 = ds.MaxMin2.maxMin2(intArray11, (-1));
        int[] intArray15 = ds.MaxMin2.maxMin2(intArray13, (int) (byte) -1);
        int[] intArray17 = ds.MaxMin2.maxMin2(intArray15, (-1));
        int[] intArray19 = ds.MaxMin2.maxMin2(intArray17, (int) (byte) 0);
        java.lang.Class<?> wildcardClass20 = intArray19.getClass();
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[100, 100, 1]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray19), "[100, 100]");
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test1539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1539");
        int[] intArray3 = new int[] { (short) 100, (short) 100, 1 };
        int[] intArray5 = ds.MaxMin2.maxMin2(intArray3, (int) (short) 0);
        int[] intArray7 = ds.MaxMin2.maxMin2(intArray3, 1);
        int[] intArray9 = ds.MaxMin2.maxMin2(intArray7, (int) (short) 0);
        int[] intArray11 = ds.MaxMin2.maxMin2(intArray9, (-1));
        java.lang.Class<?> wildcardClass12 = intArray9.getClass();
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[100, 100, 1]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[100, 100]");
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test1540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1540");
        int[] intArray3 = new int[] { (short) 100, (short) 100, 1 };
        int[] intArray5 = ds.MaxMin2.maxMin2(intArray3, (int) (short) 0);
        int[] intArray7 = ds.MaxMin2.maxMin2(intArray3, 1);
        int[] intArray9 = ds.MaxMin2.maxMin2(intArray7, (int) (byte) -1);
        int[] intArray11 = ds.MaxMin2.maxMin2(intArray7, (int) (byte) -1);
        int[] intArray13 = ds.MaxMin2.maxMin2(intArray7, (int) (byte) -1);
        int[] intArray15 = ds.MaxMin2.maxMin2(intArray13, 1);
        int[] intArray17 = ds.MaxMin2.maxMin2(intArray13, (int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray19 = ds.MaxMin2.maxMin2(intArray17, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[100, 100, 1]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[100, 100]");
    }

    @Test
    public void test1541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1541");
        int[] intArray3 = new int[] { (short) 100, (short) 100, 1 };
        int[] intArray5 = ds.MaxMin2.maxMin2(intArray3, (int) (short) 0);
        int[] intArray7 = ds.MaxMin2.maxMin2(intArray3, (int) (byte) 1);
        int[] intArray9 = ds.MaxMin2.maxMin2(intArray3, (int) (byte) -1);
        int[] intArray11 = ds.MaxMin2.maxMin2(intArray3, (int) (short) 1);
        int[] intArray13 = ds.MaxMin2.maxMin2(intArray3, (int) (short) 0);
        java.lang.Class<?> wildcardClass14 = intArray3.getClass();
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[100, 100, 1]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[100, 100]");
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test1542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1542");
        int[] intArray3 = new int[] { (short) 100, (short) 100, 1 };
        int[] intArray5 = ds.MaxMin2.maxMin2(intArray3, (int) (short) 0);
        int[] intArray7 = ds.MaxMin2.maxMin2(intArray5, (int) (byte) -1);
        int[] intArray9 = ds.MaxMin2.maxMin2(intArray5, (int) (byte) 0);
        int[] intArray11 = ds.MaxMin2.maxMin2(intArray9, (int) (short) -1);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray13 = ds.MaxMin2.maxMin2(intArray9, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[100, 100, 1]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[100, 100]");
    }

    @Test
    public void test1543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1543");
        int[] intArray3 = new int[] { (short) 100, (short) 100, 1 };
        int[] intArray5 = ds.MaxMin2.maxMin2(intArray3, (int) (short) 0);
        int[] intArray7 = ds.MaxMin2.maxMin2(intArray3, (int) (byte) 1);
        int[] intArray9 = ds.MaxMin2.maxMin2(intArray3, 0);
        int[] intArray11 = ds.MaxMin2.maxMin2(intArray3, 0);
        int[] intArray13 = ds.MaxMin2.maxMin2(intArray11, (int) (byte) 1);
        int[] intArray15 = ds.MaxMin2.maxMin2(intArray11, (int) (byte) 0);
        int[] intArray17 = ds.MaxMin2.maxMin2(intArray15, (int) (short) 1);
        int[] intArray19 = ds.MaxMin2.maxMin2(intArray17, (int) (byte) 0);
        int[] intArray21 = ds.MaxMin2.maxMin2(intArray17, (int) (byte) -1);
        int[] intArray23 = ds.MaxMin2.maxMin2(intArray21, (-1));
        int[] intArray25 = ds.MaxMin2.maxMin2(intArray23, (int) (short) 0);
        java.lang.Class<?> wildcardClass26 = intArray23.getClass();
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[100, 100, 1]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray19), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray21), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray23), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray25), "[100, 100]");
        org.junit.Assert.assertNotNull(wildcardClass26);
    }

    @Test
    public void test1544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1544");
        int[] intArray3 = new int[] { (short) 100, (short) 100, 1 };
        int[] intArray5 = ds.MaxMin2.maxMin2(intArray3, (int) (short) 0);
        int[] intArray7 = ds.MaxMin2.maxMin2(intArray3, (int) (byte) 1);
        int[] intArray9 = ds.MaxMin2.maxMin2(intArray3, 0);
        int[] intArray11 = ds.MaxMin2.maxMin2(intArray3, 0);
        int[] intArray13 = ds.MaxMin2.maxMin2(intArray11, (int) (byte) 1);
        int[] intArray15 = ds.MaxMin2.maxMin2(intArray11, (int) (byte) 0);
        int[] intArray17 = ds.MaxMin2.maxMin2(intArray11, (int) (byte) -1);
        int[] intArray19 = ds.MaxMin2.maxMin2(intArray17, (int) (short) -1);
        int[] intArray21 = ds.MaxMin2.maxMin2(intArray19, 1);
        int[] intArray23 = ds.MaxMin2.maxMin2(intArray21, (int) (short) 1);
        int[] intArray25 = ds.MaxMin2.maxMin2(intArray23, (int) (short) 0);
        java.lang.Class<?> wildcardClass26 = intArray23.getClass();
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[100, 100, 1]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray19), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray21), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray23), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray25), "[100, 100]");
        org.junit.Assert.assertNotNull(wildcardClass26);
    }

    @Test
    public void test1545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1545");
        int[] intArray3 = new int[] { (short) 100, (short) 100, 1 };
        int[] intArray5 = ds.MaxMin2.maxMin2(intArray3, (int) (short) 0);
        int[] intArray7 = ds.MaxMin2.maxMin2(intArray3, (int) (byte) 1);
        int[] intArray9 = ds.MaxMin2.maxMin2(intArray3, (int) (byte) -1);
        int[] intArray11 = ds.MaxMin2.maxMin2(intArray3, (int) (byte) -1);
        int[] intArray13 = ds.MaxMin2.maxMin2(intArray11, (int) (byte) 1);
        int[] intArray15 = ds.MaxMin2.maxMin2(intArray13, (-1));
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray17 = ds.MaxMin2.maxMin2(intArray13, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[100, 100, 1]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[100, 100]");
    }

    @Test
    public void test1546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1546");
        int[] intArray3 = new int[] { (short) 100, (short) 100, 1 };
        int[] intArray5 = ds.MaxMin2.maxMin2(intArray3, (int) (short) 0);
        int[] intArray7 = ds.MaxMin2.maxMin2(intArray3, (int) (byte) 1);
        int[] intArray9 = ds.MaxMin2.maxMin2(intArray3, 0);
        int[] intArray11 = ds.MaxMin2.maxMin2(intArray3, 0);
        int[] intArray13 = ds.MaxMin2.maxMin2(intArray11, (int) (byte) -1);
        int[] intArray15 = ds.MaxMin2.maxMin2(intArray11, (int) (short) 1);
        int[] intArray17 = ds.MaxMin2.maxMin2(intArray11, (int) (short) 1);
        int[] intArray19 = ds.MaxMin2.maxMin2(intArray17, (int) (byte) 1);
        int[] intArray21 = ds.MaxMin2.maxMin2(intArray17, 1);
        int[] intArray23 = ds.MaxMin2.maxMin2(intArray21, (int) (short) -1);
        java.lang.Class<?> wildcardClass24 = intArray21.getClass();
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[100, 100, 1]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray19), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray21), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray23), "[100, 100]");
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test1547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1547");
        int[] intArray3 = new int[] { (short) 100, (short) 100, 1 };
        int[] intArray5 = ds.MaxMin2.maxMin2(intArray3, (int) (short) 0);
        int[] intArray7 = ds.MaxMin2.maxMin2(intArray3, 1);
        int[] intArray9 = ds.MaxMin2.maxMin2(intArray7, (int) (short) -1);
        int[] intArray11 = ds.MaxMin2.maxMin2(intArray9, (int) (byte) 0);
        int[] intArray13 = ds.MaxMin2.maxMin2(intArray11, 0);
        int[] intArray15 = ds.MaxMin2.maxMin2(intArray11, (int) (short) 0);
        int[] intArray17 = ds.MaxMin2.maxMin2(intArray11, (int) (short) -1);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray19 = ds.MaxMin2.maxMin2(intArray11, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[100, 100, 1]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[100, 100]");
    }

    @Test
    public void test1548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1548");
        int[] intArray3 = new int[] { (short) 100, (short) 100, 1 };
        int[] intArray5 = ds.MaxMin2.maxMin2(intArray3, (int) (short) 0);
        int[] intArray7 = ds.MaxMin2.maxMin2(intArray5, (int) (byte) -1);
        int[] intArray9 = ds.MaxMin2.maxMin2(intArray5, 0);
        int[] intArray11 = ds.MaxMin2.maxMin2(intArray5, 0);
        int[] intArray13 = ds.MaxMin2.maxMin2(intArray5, 0);
        int[] intArray15 = ds.MaxMin2.maxMin2(intArray5, (int) (short) -1);
        int[] intArray17 = ds.MaxMin2.maxMin2(intArray15, 0);
        int[] intArray19 = ds.MaxMin2.maxMin2(intArray15, 0);
        java.lang.Class<?> wildcardClass20 = intArray19.getClass();
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[100, 100, 1]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray19), "[100, 100]");
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test1549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1549");
        int[] intArray3 = new int[] { (short) 100, (short) 100, 1 };
        int[] intArray5 = ds.MaxMin2.maxMin2(intArray3, (int) (short) 0);
        int[] intArray7 = ds.MaxMin2.maxMin2(intArray3, (int) (byte) 1);
        int[] intArray9 = ds.MaxMin2.maxMin2(intArray3, 0);
        int[] intArray11 = ds.MaxMin2.maxMin2(intArray3, 0);
        int[] intArray13 = ds.MaxMin2.maxMin2(intArray11, (int) (byte) 1);
        int[] intArray15 = ds.MaxMin2.maxMin2(intArray11, (int) (byte) 0);
        int[] intArray17 = ds.MaxMin2.maxMin2(intArray15, (int) (short) 1);
        int[] intArray19 = ds.MaxMin2.maxMin2(intArray17, (int) (byte) 0);
        int[] intArray21 = ds.MaxMin2.maxMin2(intArray17, 0);
        int[] intArray23 = ds.MaxMin2.maxMin2(intArray21, (-1));
        java.lang.Class<?> wildcardClass24 = intArray23.getClass();
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[100, 100, 1]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray19), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray21), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray23), "[100, 100]");
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test1550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1550");
        int[] intArray3 = new int[] { (short) 100, (short) 100, 1 };
        int[] intArray5 = ds.MaxMin2.maxMin2(intArray3, (int) (short) 0);
        int[] intArray7 = ds.MaxMin2.maxMin2(intArray3, 1);
        int[] intArray9 = ds.MaxMin2.maxMin2(intArray3, (int) (byte) 0);
        int[] intArray11 = ds.MaxMin2.maxMin2(intArray9, (-1));
        int[] intArray13 = ds.MaxMin2.maxMin2(intArray11, 1);
        int[] intArray15 = ds.MaxMin2.maxMin2(intArray11, (int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray17 = ds.MaxMin2.maxMin2(intArray11, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[100, 100, 1]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[100, 100]");
    }

    @Test
    public void test1551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1551");
        int[] intArray3 = new int[] { (short) 100, (short) 100, 1 };
        int[] intArray5 = ds.MaxMin2.maxMin2(intArray3, (int) (short) 0);
        int[] intArray7 = ds.MaxMin2.maxMin2(intArray3, 1);
        int[] intArray9 = ds.MaxMin2.maxMin2(intArray7, (int) (short) -1);
        int[] intArray11 = ds.MaxMin2.maxMin2(intArray9, (int) (byte) -1);
        int[] intArray13 = ds.MaxMin2.maxMin2(intArray9, (-1));
        int[] intArray15 = ds.MaxMin2.maxMin2(intArray9, (int) (byte) 0);
        int[] intArray17 = ds.MaxMin2.maxMin2(intArray15, (int) (byte) 0);
        int[] intArray19 = ds.MaxMin2.maxMin2(intArray15, (int) (byte) -1);
        java.lang.Class<?> wildcardClass20 = intArray15.getClass();
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[100, 100, 1]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray19), "[100, 100]");
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test1552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1552");
        int[] intArray3 = new int[] { (short) 100, (short) 100, 1 };
        int[] intArray5 = ds.MaxMin2.maxMin2(intArray3, (int) (short) 0);
        int[] intArray7 = ds.MaxMin2.maxMin2(intArray5, (int) (byte) -1);
        int[] intArray9 = ds.MaxMin2.maxMin2(intArray5, (int) (byte) 0);
        int[] intArray11 = ds.MaxMin2.maxMin2(intArray9, (int) (short) -1);
        int[] intArray13 = ds.MaxMin2.maxMin2(intArray9, (int) (byte) -1);
        int[] intArray15 = ds.MaxMin2.maxMin2(intArray13, (int) (byte) 1);
        int[] intArray17 = ds.MaxMin2.maxMin2(intArray13, (int) (short) 1);
        int[] intArray19 = ds.MaxMin2.maxMin2(intArray13, (-1));
        int[] intArray21 = ds.MaxMin2.maxMin2(intArray19, (-1));
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray23 = ds.MaxMin2.maxMin2(intArray21, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[100, 100, 1]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray19), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray21), "[100, 100]");
    }

    @Test
    public void test1553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1553");
        int[] intArray3 = new int[] { (short) 100, (short) 100, 1 };
        int[] intArray5 = ds.MaxMin2.maxMin2(intArray3, (int) (short) 0);
        int[] intArray7 = ds.MaxMin2.maxMin2(intArray5, (int) (byte) -1);
        int[] intArray9 = ds.MaxMin2.maxMin2(intArray5, 0);
        int[] intArray11 = ds.MaxMin2.maxMin2(intArray5, (int) (short) 1);
        int[] intArray13 = ds.MaxMin2.maxMin2(intArray5, 0);
        int[] intArray15 = ds.MaxMin2.maxMin2(intArray5, 0);
        int[] intArray17 = ds.MaxMin2.maxMin2(intArray5, 0);
        int[] intArray19 = ds.MaxMin2.maxMin2(intArray5, (int) (byte) -1);
        int[] intArray21 = ds.MaxMin2.maxMin2(intArray5, (int) (short) -1);
        int[] intArray23 = ds.MaxMin2.maxMin2(intArray5, (int) (byte) 0);
        int[] intArray25 = ds.MaxMin2.maxMin2(intArray5, (int) (short) -1);
        java.lang.Class<?> wildcardClass26 = intArray5.getClass();
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[100, 100, 1]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray19), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray21), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray23), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray25), "[100, 100]");
        org.junit.Assert.assertNotNull(wildcardClass26);
    }

    @Test
    public void test1554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1554");
        int[] intArray3 = new int[] { (short) 100, (short) 100, 1 };
        int[] intArray5 = ds.MaxMin2.maxMin2(intArray3, (int) (short) 0);
        int[] intArray7 = ds.MaxMin2.maxMin2(intArray3, 1);
        int[] intArray9 = ds.MaxMin2.maxMin2(intArray7, 1);
        int[] intArray11 = ds.MaxMin2.maxMin2(intArray9, (int) (short) -1);
        int[] intArray13 = ds.MaxMin2.maxMin2(intArray9, 0);
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[100, 100, 1]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[100, 100]");
    }

    @Test
    public void test1555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1555");
        int[] intArray3 = new int[] { (short) 100, (short) 100, 1 };
        int[] intArray5 = ds.MaxMin2.maxMin2(intArray3, (int) (short) 0);
        int[] intArray7 = ds.MaxMin2.maxMin2(intArray3, 1);
        int[] intArray9 = ds.MaxMin2.maxMin2(intArray3, (int) (byte) 0);
        int[] intArray11 = ds.MaxMin2.maxMin2(intArray9, (int) (short) -1);
        int[] intArray13 = ds.MaxMin2.maxMin2(intArray11, (int) (byte) 0);
        int[] intArray15 = ds.MaxMin2.maxMin2(intArray13, 0);
        int[] intArray17 = ds.MaxMin2.maxMin2(intArray13, (int) (short) -1);
        int[] intArray19 = ds.MaxMin2.maxMin2(intArray17, 1);
        int[] intArray21 = ds.MaxMin2.maxMin2(intArray17, 1);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray23 = ds.MaxMin2.maxMin2(intArray17, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[100, 100, 1]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray19), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray21), "[100, 100]");
    }

    @Test
    public void test1556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1556");
        int[] intArray3 = new int[] { (short) 100, (short) 100, 1 };
        int[] intArray5 = ds.MaxMin2.maxMin2(intArray3, (int) (short) 0);
        int[] intArray7 = ds.MaxMin2.maxMin2(intArray3, (int) (byte) 1);
        int[] intArray9 = ds.MaxMin2.maxMin2(intArray7, (int) (byte) 0);
        int[] intArray11 = ds.MaxMin2.maxMin2(intArray7, (int) (byte) -1);
        int[] intArray13 = ds.MaxMin2.maxMin2(intArray7, 0);
        java.lang.Class<?> wildcardClass14 = intArray13.getClass();
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[100, 100, 1]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[100, 100]");
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test1557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1557");
        int[] intArray3 = new int[] { (short) 100, (short) 100, 1 };
        int[] intArray5 = ds.MaxMin2.maxMin2(intArray3, (int) (short) 0);
        int[] intArray7 = ds.MaxMin2.maxMin2(intArray5, (int) (byte) 0);
        int[] intArray9 = ds.MaxMin2.maxMin2(intArray7, (int) (short) -1);
        int[] intArray11 = ds.MaxMin2.maxMin2(intArray7, (int) (byte) 1);
        int[] intArray13 = ds.MaxMin2.maxMin2(intArray7, (int) (byte) 1);
        int[] intArray15 = ds.MaxMin2.maxMin2(intArray13, (int) (byte) 1);
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[100, 100, 1]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[100, 100]");
    }

    @Test
    public void test1558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1558");
        int[] intArray3 = new int[] { (short) 100, (short) 100, 1 };
        int[] intArray5 = ds.MaxMin2.maxMin2(intArray3, (int) (short) 0);
        int[] intArray7 = ds.MaxMin2.maxMin2(intArray5, (int) (byte) -1);
        int[] intArray9 = ds.MaxMin2.maxMin2(intArray5, (int) (byte) 0);
        int[] intArray11 = ds.MaxMin2.maxMin2(intArray5, (int) (byte) -1);
        int[] intArray13 = ds.MaxMin2.maxMin2(intArray11, (-1));
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray15 = ds.MaxMin2.maxMin2(intArray13, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[100, 100, 1]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[100, 100]");
    }

    @Test
    public void test1559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1559");
        int[] intArray3 = new int[] { (short) 100, (short) 100, 1 };
        int[] intArray5 = ds.MaxMin2.maxMin2(intArray3, (int) (short) 0);
        int[] intArray7 = ds.MaxMin2.maxMin2(intArray3, 1);
        int[] intArray9 = ds.MaxMin2.maxMin2(intArray7, (int) (short) -1);
        int[] intArray11 = ds.MaxMin2.maxMin2(intArray7, (int) (short) 0);
        int[] intArray13 = ds.MaxMin2.maxMin2(intArray7, 0);
        int[] intArray15 = ds.MaxMin2.maxMin2(intArray13, (int) (short) 0);
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[100, 100, 1]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[100, 100]");
    }

    @Test
    public void test1560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1560");
        int[] intArray3 = new int[] { (short) 100, (short) 100, 1 };
        int[] intArray5 = ds.MaxMin2.maxMin2(intArray3, (int) (short) 0);
        int[] intArray7 = ds.MaxMin2.maxMin2(intArray3, 1);
        int[] intArray9 = ds.MaxMin2.maxMin2(intArray7, (int) (short) -1);
        int[] intArray11 = ds.MaxMin2.maxMin2(intArray9, (int) (byte) 0);
        int[] intArray13 = ds.MaxMin2.maxMin2(intArray11, (-1));
        int[] intArray15 = ds.MaxMin2.maxMin2(intArray11, (int) (short) 1);
        int[] intArray17 = ds.MaxMin2.maxMin2(intArray15, (int) (byte) -1);
        int[] intArray19 = ds.MaxMin2.maxMin2(intArray17, (int) (short) 1);
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[100, 100, 1]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray19), "[100, 100]");
    }

    @Test
    public void test1561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1561");
        int[] intArray3 = new int[] { (short) 100, (short) 100, 1 };
        int[] intArray5 = ds.MaxMin2.maxMin2(intArray3, (int) (short) 0);
        int[] intArray7 = ds.MaxMin2.maxMin2(intArray3, (int) (byte) -1);
        int[] intArray9 = ds.MaxMin2.maxMin2(intArray7, (int) (byte) 1);
        int[] intArray11 = ds.MaxMin2.maxMin2(intArray9, (int) (byte) -1);
        int[] intArray13 = ds.MaxMin2.maxMin2(intArray11, (-1));
        int[] intArray15 = ds.MaxMin2.maxMin2(intArray11, (int) (byte) -1);
        int[] intArray17 = ds.MaxMin2.maxMin2(intArray15, 0);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray19 = ds.MaxMin2.maxMin2(intArray15, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[100, 100, 1]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[100, 100]");
    }

    @Test
    public void test1562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1562");
        int[] intArray3 = new int[] { (short) 100, (short) 100, 1 };
        int[] intArray5 = ds.MaxMin2.maxMin2(intArray3, (int) (short) 0);
        int[] intArray7 = ds.MaxMin2.maxMin2(intArray5, (int) (short) 1);
        int[] intArray9 = ds.MaxMin2.maxMin2(intArray5, (int) (byte) -1);
        int[] intArray11 = ds.MaxMin2.maxMin2(intArray5, (int) (short) 0);
        int[] intArray13 = ds.MaxMin2.maxMin2(intArray5, 1);
        int[] intArray15 = ds.MaxMin2.maxMin2(intArray13, 1);
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[100, 100, 1]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[100, 100]");
    }

    @Test
    public void test1563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1563");
        int[] intArray3 = new int[] { (short) 100, (short) 100, 1 };
        int[] intArray5 = ds.MaxMin2.maxMin2(intArray3, (int) (short) 0);
        int[] intArray7 = ds.MaxMin2.maxMin2(intArray3, 1);
        int[] intArray9 = ds.MaxMin2.maxMin2(intArray7, (int) (short) 0);
        int[] intArray11 = ds.MaxMin2.maxMin2(intArray9, (-1));
        int[] intArray13 = ds.MaxMin2.maxMin2(intArray11, 0);
        int[] intArray15 = ds.MaxMin2.maxMin2(intArray11, (int) (byte) 0);
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[100, 100, 1]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[100, 100]");
    }

    @Test
    public void test1564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1564");
        int[] intArray3 = new int[] { (short) 100, (short) 100, 1 };
        int[] intArray5 = ds.MaxMin2.maxMin2(intArray3, (int) (short) 0);
        int[] intArray7 = ds.MaxMin2.maxMin2(intArray3, 1);
        int[] intArray9 = ds.MaxMin2.maxMin2(intArray3, (int) (byte) 0);
        int[] intArray11 = ds.MaxMin2.maxMin2(intArray9, (-1));
        int[] intArray13 = ds.MaxMin2.maxMin2(intArray11, 1);
        int[] intArray15 = ds.MaxMin2.maxMin2(intArray11, (int) (byte) 0);
        int[] intArray17 = ds.MaxMin2.maxMin2(intArray11, (int) (short) -1);
        int[] intArray19 = ds.MaxMin2.maxMin2(intArray11, (int) (short) 1);
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[100, 100, 1]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray19), "[100, 100]");
    }

    @Test
    public void test1565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1565");
        int[] intArray3 = new int[] { (short) 100, (short) 100, 1 };
        int[] intArray5 = ds.MaxMin2.maxMin2(intArray3, (int) (short) 0);
        int[] intArray7 = ds.MaxMin2.maxMin2(intArray3, 1);
        int[] intArray9 = ds.MaxMin2.maxMin2(intArray7, (int) (short) -1);
        int[] intArray11 = ds.MaxMin2.maxMin2(intArray9, (int) (byte) 0);
        int[] intArray13 = ds.MaxMin2.maxMin2(intArray11, 0);
        int[] intArray15 = ds.MaxMin2.maxMin2(intArray13, (int) (byte) -1);
        int[] intArray17 = ds.MaxMin2.maxMin2(intArray13, (int) (byte) 0);
        int[] intArray19 = ds.MaxMin2.maxMin2(intArray13, 0);
        int[] intArray21 = ds.MaxMin2.maxMin2(intArray19, (int) (short) -1);
        int[] intArray23 = ds.MaxMin2.maxMin2(intArray21, 1);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray25 = ds.MaxMin2.maxMin2(intArray23, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[100, 100, 1]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray19), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray21), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray23), "[100, 100]");
    }

    @Test
    public void test1566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1566");
        int[] intArray3 = new int[] { (short) 100, (short) 100, 1 };
        int[] intArray5 = ds.MaxMin2.maxMin2(intArray3, (int) (short) 0);
        int[] intArray7 = ds.MaxMin2.maxMin2(intArray3, 0);
        int[] intArray9 = ds.MaxMin2.maxMin2(intArray7, (int) (short) -1);
        int[] intArray11 = ds.MaxMin2.maxMin2(intArray9, 0);
        int[] intArray13 = ds.MaxMin2.maxMin2(intArray11, (int) (byte) 1);
        int[] intArray15 = ds.MaxMin2.maxMin2(intArray13, 0);
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[100, 100, 1]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[100, 100]");
    }

    @Test
    public void test1567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1567");
        int[] intArray3 = new int[] { (short) 100, (short) 100, 1 };
        int[] intArray5 = ds.MaxMin2.maxMin2(intArray3, (int) (short) 0);
        int[] intArray7 = ds.MaxMin2.maxMin2(intArray3, 1);
        int[] intArray9 = ds.MaxMin2.maxMin2(intArray7, (int) (short) -1);
        int[] intArray11 = ds.MaxMin2.maxMin2(intArray9, (int) (byte) -1);
        int[] intArray13 = ds.MaxMin2.maxMin2(intArray9, (-1));
        int[] intArray15 = ds.MaxMin2.maxMin2(intArray9, (int) (byte) 0);
        int[] intArray17 = ds.MaxMin2.maxMin2(intArray15, (int) (byte) 0);
        int[] intArray19 = ds.MaxMin2.maxMin2(intArray15, 0);
        int[] intArray21 = ds.MaxMin2.maxMin2(intArray15, (int) (byte) 1);
        int[] intArray23 = ds.MaxMin2.maxMin2(intArray15, (int) (short) -1);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray25 = ds.MaxMin2.maxMin2(intArray23, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[100, 100, 1]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray19), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray21), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray23), "[100, 100]");
    }

    @Test
    public void test1568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1568");
        int[] intArray3 = new int[] { (short) 100, (short) 100, 1 };
        int[] intArray5 = ds.MaxMin2.maxMin2(intArray3, (int) (short) 0);
        int[] intArray7 = ds.MaxMin2.maxMin2(intArray3, (int) (byte) 1);
        int[] intArray9 = ds.MaxMin2.maxMin2(intArray3, 0);
        int[] intArray11 = ds.MaxMin2.maxMin2(intArray3, 0);
        int[] intArray13 = ds.MaxMin2.maxMin2(intArray11, (int) (byte) -1);
        int[] intArray15 = ds.MaxMin2.maxMin2(intArray11, (int) (short) 1);
        int[] intArray17 = ds.MaxMin2.maxMin2(intArray11, (int) (short) 1);
        int[] intArray19 = ds.MaxMin2.maxMin2(intArray17, (int) (byte) 1);
        int[] intArray21 = ds.MaxMin2.maxMin2(intArray17, 1);
        int[] intArray23 = ds.MaxMin2.maxMin2(intArray21, (int) (byte) 1);
        java.lang.Class<?> wildcardClass24 = intArray23.getClass();
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[100, 100, 1]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray19), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray21), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray23), "[100, 100]");
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test1569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1569");
        int[] intArray3 = new int[] { (short) 100, (short) 100, 1 };
        int[] intArray5 = ds.MaxMin2.maxMin2(intArray3, (int) (short) 0);
        int[] intArray7 = ds.MaxMin2.maxMin2(intArray5, (int) (byte) 0);
        int[] intArray9 = ds.MaxMin2.maxMin2(intArray7, (int) (short) -1);
        int[] intArray11 = ds.MaxMin2.maxMin2(intArray7, (int) (byte) 1);
        int[] intArray13 = ds.MaxMin2.maxMin2(intArray11, (int) (short) -1);
        int[] intArray15 = ds.MaxMin2.maxMin2(intArray11, (int) (byte) 0);
        int[] intArray17 = ds.MaxMin2.maxMin2(intArray15, (int) (byte) -1);
        int[] intArray19 = ds.MaxMin2.maxMin2(intArray15, (int) (byte) -1);
        int[] intArray21 = ds.MaxMin2.maxMin2(intArray15, (int) (short) 1);
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[100, 100, 1]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray19), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray21), "[100, 100]");
    }

    @Test
    public void test1570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1570");
        int[] intArray3 = new int[] { (short) 100, (short) 100, 1 };
        int[] intArray5 = ds.MaxMin2.maxMin2(intArray3, (int) (short) 0);
        int[] intArray7 = ds.MaxMin2.maxMin2(intArray5, (int) (byte) -1);
        int[] intArray9 = ds.MaxMin2.maxMin2(intArray5, 0);
        int[] intArray11 = ds.MaxMin2.maxMin2(intArray5, (int) (short) 1);
        int[] intArray13 = ds.MaxMin2.maxMin2(intArray5, 0);
        int[] intArray15 = ds.MaxMin2.maxMin2(intArray5, 0);
        int[] intArray17 = ds.MaxMin2.maxMin2(intArray5, 0);
        int[] intArray19 = ds.MaxMin2.maxMin2(intArray5, (int) (byte) -1);
        int[] intArray21 = ds.MaxMin2.maxMin2(intArray5, (int) (short) -1);
        int[] intArray23 = ds.MaxMin2.maxMin2(intArray21, (-1));
        java.lang.Class<?> wildcardClass24 = intArray23.getClass();
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[100, 100, 1]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray19), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray21), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray23), "[100, 100]");
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test1571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1571");
        int[] intArray3 = new int[] { (short) 100, (short) 100, 1 };
        int[] intArray5 = ds.MaxMin2.maxMin2(intArray3, (int) (short) 0);
        int[] intArray7 = ds.MaxMin2.maxMin2(intArray3, 1);
        int[] intArray9 = ds.MaxMin2.maxMin2(intArray7, (int) (short) 0);
        int[] intArray11 = ds.MaxMin2.maxMin2(intArray9, (-1));
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray13 = ds.MaxMin2.maxMin2(intArray9, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[100, 100, 1]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[100, 100]");
    }

    @Test
    public void test1572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1572");
        int[] intArray3 = new int[] { (short) 100, (short) 100, 1 };
        int[] intArray5 = ds.MaxMin2.maxMin2(intArray3, (int) (short) 0);
        int[] intArray7 = ds.MaxMin2.maxMin2(intArray3, 1);
        int[] intArray9 = ds.MaxMin2.maxMin2(intArray3, (int) (byte) 0);
        int[] intArray11 = ds.MaxMin2.maxMin2(intArray9, (int) (short) -1);
        int[] intArray13 = ds.MaxMin2.maxMin2(intArray9, (-1));
        int[] intArray15 = ds.MaxMin2.maxMin2(intArray13, 0);
        int[] intArray17 = ds.MaxMin2.maxMin2(intArray13, (-1));
        int[] intArray19 = ds.MaxMin2.maxMin2(intArray17, (int) (short) -1);
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[100, 100, 1]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray19), "[100, 100]");
    }

    @Test
    public void test1573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1573");
        int[] intArray3 = new int[] { (short) 100, (short) 100, 1 };
        int[] intArray5 = ds.MaxMin2.maxMin2(intArray3, (int) (short) 0);
        int[] intArray7 = ds.MaxMin2.maxMin2(intArray3, (int) (byte) -1);
        int[] intArray9 = ds.MaxMin2.maxMin2(intArray7, (int) (byte) 1);
        int[] intArray11 = ds.MaxMin2.maxMin2(intArray9, (int) (byte) -1);
        int[] intArray13 = ds.MaxMin2.maxMin2(intArray11, (-1));
        int[] intArray15 = ds.MaxMin2.maxMin2(intArray13, 0);
        int[] intArray17 = ds.MaxMin2.maxMin2(intArray13, 1);
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[100, 100, 1]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[100, 100]");
    }

    @Test
    public void test1574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1574");
        int[] intArray3 = new int[] { (short) 100, (short) 100, 1 };
        int[] intArray5 = ds.MaxMin2.maxMin2(intArray3, (int) (short) 0);
        int[] intArray7 = ds.MaxMin2.maxMin2(intArray5, (int) (byte) -1);
        int[] intArray9 = ds.MaxMin2.maxMin2(intArray5, (int) (byte) 0);
        int[] intArray11 = ds.MaxMin2.maxMin2(intArray9, (int) (short) -1);
        int[] intArray13 = ds.MaxMin2.maxMin2(intArray9, (int) (byte) -1);
        int[] intArray15 = ds.MaxMin2.maxMin2(intArray13, (int) (byte) 1);
        int[] intArray17 = ds.MaxMin2.maxMin2(intArray13, (int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray19 = ds.MaxMin2.maxMin2(intArray17, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[100, 100, 1]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[100, 100]");
    }

    @Test
    public void test1575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1575");
        int[] intArray3 = new int[] { (short) 100, (short) 100, 1 };
        int[] intArray5 = ds.MaxMin2.maxMin2(intArray3, (int) (short) 0);
        int[] intArray7 = ds.MaxMin2.maxMin2(intArray3, 1);
        int[] intArray9 = ds.MaxMin2.maxMin2(intArray7, (int) (short) -1);
        int[] intArray11 = ds.MaxMin2.maxMin2(intArray9, (int) (byte) -1);
        int[] intArray13 = ds.MaxMin2.maxMin2(intArray9, (-1));
        int[] intArray15 = ds.MaxMin2.maxMin2(intArray9, (int) (byte) 0);
        int[] intArray17 = ds.MaxMin2.maxMin2(intArray15, (int) (byte) 0);
        int[] intArray19 = ds.MaxMin2.maxMin2(intArray15, 0);
        int[] intArray21 = ds.MaxMin2.maxMin2(intArray15, 1);
        int[] intArray23 = ds.MaxMin2.maxMin2(intArray15, 1);
        int[] intArray25 = ds.MaxMin2.maxMin2(intArray15, (int) (short) -1);
        int[] intArray27 = ds.MaxMin2.maxMin2(intArray15, 0);
        int[] intArray29 = ds.MaxMin2.maxMin2(intArray27, (int) (byte) 1);
        java.lang.Class<?> wildcardClass30 = intArray29.getClass();
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[100, 100, 1]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray19), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray21), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray23), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray25), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray27), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray29), "[100, 100]");
        org.junit.Assert.assertNotNull(wildcardClass30);
    }

    @Test
    public void test1576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1576");
        int[] intArray3 = new int[] { (short) 100, (short) 100, 1 };
        int[] intArray5 = ds.MaxMin2.maxMin2(intArray3, (int) (short) 0);
        int[] intArray7 = ds.MaxMin2.maxMin2(intArray3, (int) (byte) 1);
        int[] intArray9 = ds.MaxMin2.maxMin2(intArray3, 0);
        int[] intArray11 = ds.MaxMin2.maxMin2(intArray3, 0);
        int[] intArray13 = ds.MaxMin2.maxMin2(intArray11, (int) (byte) -1);
        int[] intArray15 = ds.MaxMin2.maxMin2(intArray11, (int) (short) 1);
        int[] intArray17 = ds.MaxMin2.maxMin2(intArray11, (int) (short) 1);
        int[] intArray19 = ds.MaxMin2.maxMin2(intArray17, (int) (byte) 1);
        int[] intArray21 = ds.MaxMin2.maxMin2(intArray17, 1);
        int[] intArray23 = ds.MaxMin2.maxMin2(intArray21, (int) (byte) 1);
        int[] intArray25 = ds.MaxMin2.maxMin2(intArray23, 0);
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[100, 100, 1]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray19), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray21), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray23), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray25), "[100, 100]");
    }

    @Test
    public void test1577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1577");
        int[] intArray3 = new int[] { (short) 100, (short) 100, 1 };
        int[] intArray5 = ds.MaxMin2.maxMin2(intArray3, (int) (short) 0);
        int[] intArray7 = ds.MaxMin2.maxMin2(intArray3, (int) (byte) 1);
        int[] intArray9 = ds.MaxMin2.maxMin2(intArray3, (int) (byte) -1);
        int[] intArray11 = ds.MaxMin2.maxMin2(intArray3, (int) (byte) -1);
        int[] intArray13 = ds.MaxMin2.maxMin2(intArray11, (int) (byte) 1);
        int[] intArray15 = ds.MaxMin2.maxMin2(intArray13, (-1));
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray17 = ds.MaxMin2.maxMin2(intArray15, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[100, 100, 1]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[100, 100]");
    }

    @Test
    public void test1578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1578");
        int[] intArray3 = new int[] { (short) 100, (short) 100, 1 };
        int[] intArray5 = ds.MaxMin2.maxMin2(intArray3, (int) (short) 0);
        int[] intArray7 = ds.MaxMin2.maxMin2(intArray3, (int) (byte) -1);
        int[] intArray9 = ds.MaxMin2.maxMin2(intArray7, (int) (byte) 1);
        int[] intArray11 = ds.MaxMin2.maxMin2(intArray7, (-1));
        int[] intArray13 = ds.MaxMin2.maxMin2(intArray7, (int) (short) 0);
        int[] intArray15 = ds.MaxMin2.maxMin2(intArray13, (int) (short) 0);
        int[] intArray17 = ds.MaxMin2.maxMin2(intArray13, (int) (byte) -1);
        int[] intArray19 = ds.MaxMin2.maxMin2(intArray13, (int) (byte) -1);
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[100, 100, 1]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray19), "[100, 100]");
    }

    @Test
    public void test1579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1579");
        int[] intArray3 = new int[] { (short) 100, (short) 100, 1 };
        int[] intArray5 = ds.MaxMin2.maxMin2(intArray3, (int) (short) 0);
        int[] intArray7 = ds.MaxMin2.maxMin2(intArray3, (int) (byte) 1);
        int[] intArray9 = ds.MaxMin2.maxMin2(intArray3, 0);
        int[] intArray11 = ds.MaxMin2.maxMin2(intArray3, 0);
        int[] intArray13 = ds.MaxMin2.maxMin2(intArray11, (int) (byte) 1);
        int[] intArray15 = ds.MaxMin2.maxMin2(intArray11, (int) (byte) 0);
        int[] intArray17 = ds.MaxMin2.maxMin2(intArray15, (int) (short) 1);
        int[] intArray19 = ds.MaxMin2.maxMin2(intArray17, (int) (short) -1);
        java.lang.Class<?> wildcardClass20 = intArray17.getClass();
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[100, 100, 1]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray19), "[100, 100]");
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test1580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1580");
        int[] intArray3 = new int[] { (short) 100, (short) 100, 1 };
        int[] intArray5 = ds.MaxMin2.maxMin2(intArray3, (int) (short) 0);
        int[] intArray7 = ds.MaxMin2.maxMin2(intArray3, 1);
        int[] intArray9 = ds.MaxMin2.maxMin2(intArray7, (int) (short) -1);
        int[] intArray11 = ds.MaxMin2.maxMin2(intArray9, (int) (byte) -1);
        int[] intArray13 = ds.MaxMin2.maxMin2(intArray9, (-1));
        int[] intArray15 = ds.MaxMin2.maxMin2(intArray9, (int) (byte) 0);
        int[] intArray17 = ds.MaxMin2.maxMin2(intArray15, (int) (byte) 0);
        int[] intArray19 = ds.MaxMin2.maxMin2(intArray15, 0);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray21 = ds.MaxMin2.maxMin2(intArray15, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[100, 100, 1]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray19), "[100, 100]");
    }

    @Test
    public void test1581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1581");
        int[] intArray3 = new int[] { (short) 100, (short) 100, 1 };
        int[] intArray5 = ds.MaxMin2.maxMin2(intArray3, (int) (short) 0);
        int[] intArray7 = ds.MaxMin2.maxMin2(intArray3, 1);
        int[] intArray9 = ds.MaxMin2.maxMin2(intArray7, (int) (short) -1);
        int[] intArray11 = ds.MaxMin2.maxMin2(intArray9, (int) (byte) -1);
        int[] intArray13 = ds.MaxMin2.maxMin2(intArray9, 0);
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[100, 100, 1]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[100, 100]");
    }

    @Test
    public void test1582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1582");
        int[] intArray3 = new int[] { (short) 100, (short) 100, 1 };
        int[] intArray5 = ds.MaxMin2.maxMin2(intArray3, (int) (short) 0);
        int[] intArray7 = ds.MaxMin2.maxMin2(intArray3, (int) (byte) 1);
        int[] intArray9 = ds.MaxMin2.maxMin2(intArray3, 0);
        int[] intArray11 = ds.MaxMin2.maxMin2(intArray3, 0);
        int[] intArray13 = ds.MaxMin2.maxMin2(intArray3, 1);
        int[] intArray15 = ds.MaxMin2.maxMin2(intArray3, (int) (short) 1);
        java.lang.Class<?> wildcardClass16 = intArray15.getClass();
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[100, 100, 1]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[100, 100]");
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test1583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1583");
        int[] intArray3 = new int[] { (short) 100, (short) 100, 1 };
        int[] intArray5 = ds.MaxMin2.maxMin2(intArray3, (int) (short) 0);
        int[] intArray7 = ds.MaxMin2.maxMin2(intArray5, (int) (byte) -1);
        int[] intArray9 = ds.MaxMin2.maxMin2(intArray5, 0);
        int[] intArray11 = ds.MaxMin2.maxMin2(intArray5, 0);
        int[] intArray13 = ds.MaxMin2.maxMin2(intArray5, 0);
        int[] intArray15 = ds.MaxMin2.maxMin2(intArray5, (int) (short) -1);
        int[] intArray17 = ds.MaxMin2.maxMin2(intArray15, 0);
        int[] intArray19 = ds.MaxMin2.maxMin2(intArray15, 0);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray21 = ds.MaxMin2.maxMin2(intArray19, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[100, 100, 1]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray19), "[100, 100]");
    }

    @Test
    public void test1584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1584");
        int[] intArray3 = new int[] { (short) 100, (short) 100, 1 };
        int[] intArray5 = ds.MaxMin2.maxMin2(intArray3, (int) (short) 0);
        int[] intArray7 = ds.MaxMin2.maxMin2(intArray3, 1);
        int[] intArray9 = ds.MaxMin2.maxMin2(intArray7, (int) (short) -1);
        int[] intArray11 = ds.MaxMin2.maxMin2(intArray9, (int) (byte) 0);
        int[] intArray13 = ds.MaxMin2.maxMin2(intArray11, (-1));
        int[] intArray15 = ds.MaxMin2.maxMin2(intArray11, (int) (short) 0);
        int[] intArray17 = ds.MaxMin2.maxMin2(intArray15, (int) (byte) -1);
        int[] intArray19 = ds.MaxMin2.maxMin2(intArray17, 0);
        java.lang.Class<?> wildcardClass20 = intArray19.getClass();
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[100, 100, 1]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray19), "[100, 100]");
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test1585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1585");
        int[] intArray3 = new int[] { (short) 100, (short) 100, 1 };
        int[] intArray5 = ds.MaxMin2.maxMin2(intArray3, (int) (short) 0);
        int[] intArray7 = ds.MaxMin2.maxMin2(intArray3, 1);
        int[] intArray9 = ds.MaxMin2.maxMin2(intArray7, (int) (short) -1);
        int[] intArray11 = ds.MaxMin2.maxMin2(intArray9, (int) (byte) -1);
        int[] intArray13 = ds.MaxMin2.maxMin2(intArray9, (-1));
        int[] intArray15 = ds.MaxMin2.maxMin2(intArray9, (int) (byte) 0);
        int[] intArray17 = ds.MaxMin2.maxMin2(intArray15, (int) (byte) 0);
        int[] intArray19 = ds.MaxMin2.maxMin2(intArray15, 0);
        int[] intArray21 = ds.MaxMin2.maxMin2(intArray15, 1);
        int[] intArray23 = ds.MaxMin2.maxMin2(intArray15, 1);
        int[] intArray25 = ds.MaxMin2.maxMin2(intArray15, (int) (short) -1);
        int[] intArray27 = ds.MaxMin2.maxMin2(intArray15, 1);
        java.lang.Class<?> wildcardClass28 = intArray27.getClass();
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[100, 100, 1]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray19), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray21), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray23), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray25), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray27), "[100, 100]");
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test1586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1586");
        int[] intArray3 = new int[] { (short) 100, (short) 100, 1 };
        int[] intArray5 = ds.MaxMin2.maxMin2(intArray3, (int) (short) 0);
        int[] intArray7 = ds.MaxMin2.maxMin2(intArray3, (int) (byte) 1);
        int[] intArray9 = ds.MaxMin2.maxMin2(intArray3, 0);
        int[] intArray11 = ds.MaxMin2.maxMin2(intArray3, 0);
        int[] intArray13 = ds.MaxMin2.maxMin2(intArray3, 1);
        int[] intArray15 = ds.MaxMin2.maxMin2(intArray3, (int) (short) -1);
        int[] intArray17 = ds.MaxMin2.maxMin2(intArray15, (int) (byte) 1);
        int[] intArray19 = ds.MaxMin2.maxMin2(intArray17, (int) (short) 1);
        int[] intArray21 = ds.MaxMin2.maxMin2(intArray19, 1);
        int[] intArray23 = ds.MaxMin2.maxMin2(intArray19, (int) (byte) 0);
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[100, 100, 1]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray19), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray21), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray23), "[100, 100]");
    }

    @Test
    public void test1587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1587");
        int[] intArray3 = new int[] { (short) 100, (short) 100, 1 };
        int[] intArray5 = ds.MaxMin2.maxMin2(intArray3, (int) (short) 0);
        int[] intArray7 = ds.MaxMin2.maxMin2(intArray3, 1);
        int[] intArray9 = ds.MaxMin2.maxMin2(intArray7, (int) (short) 0);
        int[] intArray11 = ds.MaxMin2.maxMin2(intArray9, (int) (short) 0);
        int[] intArray13 = ds.MaxMin2.maxMin2(intArray11, (int) (byte) 1);
        int[] intArray15 = ds.MaxMin2.maxMin2(intArray13, (int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray17 = ds.MaxMin2.maxMin2(intArray15, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[100, 100, 1]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[100, 100]");
    }

    @Test
    public void test1588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1588");
        int[] intArray3 = new int[] { (short) 100, (short) 100, 1 };
        int[] intArray5 = ds.MaxMin2.maxMin2(intArray3, (int) (short) 0);
        int[] intArray7 = ds.MaxMin2.maxMin2(intArray3, 1);
        int[] intArray9 = ds.MaxMin2.maxMin2(intArray3, (int) (byte) 0);
        int[] intArray11 = ds.MaxMin2.maxMin2(intArray9, (int) (short) -1);
        int[] intArray13 = ds.MaxMin2.maxMin2(intArray9, (-1));
        int[] intArray15 = ds.MaxMin2.maxMin2(intArray13, 0);
        int[] intArray17 = ds.MaxMin2.maxMin2(intArray13, (-1));
        int[] intArray19 = ds.MaxMin2.maxMin2(intArray13, (-1));
        int[] intArray21 = ds.MaxMin2.maxMin2(intArray13, (int) (byte) -1);
        int[] intArray23 = ds.MaxMin2.maxMin2(intArray13, (int) (short) 0);
        int[] intArray25 = ds.MaxMin2.maxMin2(intArray13, (int) (byte) -1);
        int[] intArray27 = ds.MaxMin2.maxMin2(intArray25, 1);
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[100, 100, 1]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray19), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray21), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray23), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray25), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray27), "[100, 100]");
    }

    @Test
    public void test1589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1589");
        int[] intArray3 = new int[] { (short) 100, (short) 100, 1 };
        int[] intArray5 = ds.MaxMin2.maxMin2(intArray3, (int) (short) 0);
        int[] intArray7 = ds.MaxMin2.maxMin2(intArray3, (int) (byte) 1);
        int[] intArray9 = ds.MaxMin2.maxMin2(intArray3, 0);
        int[] intArray11 = ds.MaxMin2.maxMin2(intArray3, 0);
        int[] intArray13 = ds.MaxMin2.maxMin2(intArray11, (int) (byte) 1);
        int[] intArray15 = ds.MaxMin2.maxMin2(intArray11, (int) (byte) 0);
        int[] intArray17 = ds.MaxMin2.maxMin2(intArray15, (int) (short) 1);
        int[] intArray19 = ds.MaxMin2.maxMin2(intArray15, (int) (short) 0);
        int[] intArray21 = ds.MaxMin2.maxMin2(intArray19, 0);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray23 = ds.MaxMin2.maxMin2(intArray21, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[100, 100, 1]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray19), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray21), "[100, 100]");
    }

    @Test
    public void test1590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1590");
        int[] intArray3 = new int[] { (short) 100, (short) 100, 1 };
        int[] intArray5 = ds.MaxMin2.maxMin2(intArray3, (int) (short) 0);
        int[] intArray7 = ds.MaxMin2.maxMin2(intArray3, 1);
        int[] intArray9 = ds.MaxMin2.maxMin2(intArray7, (int) (short) -1);
        int[] intArray11 = ds.MaxMin2.maxMin2(intArray9, (int) (byte) 1);
        int[] intArray13 = ds.MaxMin2.maxMin2(intArray11, 1);
        int[] intArray15 = ds.MaxMin2.maxMin2(intArray13, (int) (byte) -1);
        java.lang.Class<?> wildcardClass16 = intArray15.getClass();
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[100, 100, 1]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[100, 100]");
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test1591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1591");
        int[] intArray3 = new int[] { (short) 100, (short) 100, 1 };
        int[] intArray5 = ds.MaxMin2.maxMin2(intArray3, (int) (short) 0);
        int[] intArray7 = ds.MaxMin2.maxMin2(intArray5, (int) (byte) 0);
        int[] intArray9 = ds.MaxMin2.maxMin2(intArray7, (int) (short) -1);
        int[] intArray11 = ds.MaxMin2.maxMin2(intArray7, (int) (byte) 1);
        int[] intArray13 = ds.MaxMin2.maxMin2(intArray7, (int) (byte) 1);
        int[] intArray15 = ds.MaxMin2.maxMin2(intArray13, (int) (short) 0);
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[100, 100, 1]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[100, 100]");
    }

    @Test
    public void test1592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1592");
        int[] intArray3 = new int[] { (short) 100, (short) 100, 1 };
        int[] intArray5 = ds.MaxMin2.maxMin2(intArray3, (int) (short) 0);
        int[] intArray7 = ds.MaxMin2.maxMin2(intArray3, 1);
        int[] intArray9 = ds.MaxMin2.maxMin2(intArray7, (int) (short) -1);
        int[] intArray11 = ds.MaxMin2.maxMin2(intArray9, (int) (byte) 0);
        int[] intArray13 = ds.MaxMin2.maxMin2(intArray11, (-1));
        int[] intArray15 = ds.MaxMin2.maxMin2(intArray11, (int) (short) 0);
        int[] intArray17 = ds.MaxMin2.maxMin2(intArray15, (int) (byte) -1);
        int[] intArray19 = ds.MaxMin2.maxMin2(intArray17, 0);
        int[] intArray21 = ds.MaxMin2.maxMin2(intArray17, 0);
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[100, 100, 1]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray19), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray21), "[100, 100]");
    }

    @Test
    public void test1593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1593");
        int[] intArray3 = new int[] { (short) 100, (short) 100, 1 };
        int[] intArray5 = ds.MaxMin2.maxMin2(intArray3, (int) (short) 0);
        int[] intArray7 = ds.MaxMin2.maxMin2(intArray3, (int) (byte) 1);
        int[] intArray9 = ds.MaxMin2.maxMin2(intArray3, 0);
        int[] intArray11 = ds.MaxMin2.maxMin2(intArray3, 0);
        int[] intArray13 = ds.MaxMin2.maxMin2(intArray11, (int) (byte) 1);
        int[] intArray15 = ds.MaxMin2.maxMin2(intArray11, (int) (byte) 0);
        int[] intArray17 = ds.MaxMin2.maxMin2(intArray15, (int) (short) 1);
        int[] intArray19 = ds.MaxMin2.maxMin2(intArray17, (int) (byte) 0);
        int[] intArray21 = ds.MaxMin2.maxMin2(intArray19, 1);
        int[] intArray23 = ds.MaxMin2.maxMin2(intArray19, (int) (byte) -1);
        java.lang.Class<?> wildcardClass24 = intArray23.getClass();
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[100, 100, 1]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray19), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray21), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray23), "[100, 100]");
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test1594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1594");
        int[] intArray3 = new int[] { (short) 100, (short) 100, 1 };
        int[] intArray5 = ds.MaxMin2.maxMin2(intArray3, (int) (short) 0);
        int[] intArray7 = ds.MaxMin2.maxMin2(intArray3, (int) (byte) 1);
        int[] intArray9 = ds.MaxMin2.maxMin2(intArray3, (int) (byte) -1);
        int[] intArray11 = ds.MaxMin2.maxMin2(intArray3, (-1));
        int[] intArray13 = ds.MaxMin2.maxMin2(intArray3, 0);
        int[] intArray15 = ds.MaxMin2.maxMin2(intArray3, (-1));
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[100, 100, 1]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[100, 100]");
    }

    @Test
    public void test1595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1595");
        int[] intArray3 = new int[] { (short) 100, (short) 100, 1 };
        int[] intArray5 = ds.MaxMin2.maxMin2(intArray3, (int) (short) 0);
        int[] intArray7 = ds.MaxMin2.maxMin2(intArray3, 1);
        int[] intArray9 = ds.MaxMin2.maxMin2(intArray7, (int) (short) -1);
        int[] intArray11 = ds.MaxMin2.maxMin2(intArray9, (int) (byte) -1);
        int[] intArray13 = ds.MaxMin2.maxMin2(intArray9, (-1));
        int[] intArray15 = ds.MaxMin2.maxMin2(intArray9, (int) (short) 1);
        int[] intArray17 = ds.MaxMin2.maxMin2(intArray9, (-1));
        int[] intArray19 = ds.MaxMin2.maxMin2(intArray9, (int) (byte) 1);
        int[] intArray21 = ds.MaxMin2.maxMin2(intArray9, (int) (short) 1);
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[100, 100, 1]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray19), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray21), "[100, 100]");
    }

    @Test
    public void test1596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1596");
        int[] intArray3 = new int[] { (short) 100, (short) 100, 1 };
        int[] intArray5 = ds.MaxMin2.maxMin2(intArray3, (int) (short) 0);
        int[] intArray7 = ds.MaxMin2.maxMin2(intArray5, (int) (byte) -1);
        int[] intArray9 = ds.MaxMin2.maxMin2(intArray5, 0);
        int[] intArray11 = ds.MaxMin2.maxMin2(intArray5, (int) (short) 1);
        int[] intArray13 = ds.MaxMin2.maxMin2(intArray5, 0);
        int[] intArray15 = ds.MaxMin2.maxMin2(intArray5, 0);
        int[] intArray17 = ds.MaxMin2.maxMin2(intArray5, 0);
        int[] intArray19 = ds.MaxMin2.maxMin2(intArray17, 0);
        int[] intArray21 = ds.MaxMin2.maxMin2(intArray17, 0);
        int[] intArray23 = ds.MaxMin2.maxMin2(intArray17, (int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray25 = ds.MaxMin2.maxMin2(intArray17, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[100, 100, 1]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray19), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray21), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray23), "[100, 100]");
    }

    @Test
    public void test1597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1597");
        int[] intArray3 = new int[] { (short) 100, (short) 100, 1 };
        int[] intArray5 = ds.MaxMin2.maxMin2(intArray3, (int) (short) 0);
        int[] intArray7 = ds.MaxMin2.maxMin2(intArray5, (int) (byte) 0);
        int[] intArray9 = ds.MaxMin2.maxMin2(intArray7, (int) (short) -1);
        int[] intArray11 = ds.MaxMin2.maxMin2(intArray7, (int) (byte) 1);
        int[] intArray13 = ds.MaxMin2.maxMin2(intArray7, (int) (byte) 1);
        int[] intArray15 = ds.MaxMin2.maxMin2(intArray7, (int) (short) 1);
        int[] intArray17 = ds.MaxMin2.maxMin2(intArray7, (int) (byte) 1);
        int[] intArray19 = ds.MaxMin2.maxMin2(intArray17, (int) (short) 0);
        int[] intArray21 = ds.MaxMin2.maxMin2(intArray19, (int) (byte) -1);
        int[] intArray23 = ds.MaxMin2.maxMin2(intArray19, 1);
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[100, 100, 1]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray19), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray21), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray23), "[100, 100]");
    }

    @Test
    public void test1598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1598");
        int[] intArray3 = new int[] { (short) 100, (short) 100, 1 };
        int[] intArray5 = ds.MaxMin2.maxMin2(intArray3, (int) (short) 0);
        int[] intArray7 = ds.MaxMin2.maxMin2(intArray3, 1);
        int[] intArray9 = ds.MaxMin2.maxMin2(intArray7, (int) (short) -1);
        int[] intArray11 = ds.MaxMin2.maxMin2(intArray9, (int) (byte) 0);
        int[] intArray13 = ds.MaxMin2.maxMin2(intArray11, 0);
        int[] intArray15 = ds.MaxMin2.maxMin2(intArray11, (int) (byte) -1);
        int[] intArray17 = ds.MaxMin2.maxMin2(intArray15, (int) (short) -1);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray19 = ds.MaxMin2.maxMin2(intArray17, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[100, 100, 1]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[100, 100]");
    }

    @Test
    public void test1599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1599");
        int[] intArray3 = new int[] { (short) 100, (short) 100, 1 };
        int[] intArray5 = ds.MaxMin2.maxMin2(intArray3, (int) (short) 0);
        int[] intArray7 = ds.MaxMin2.maxMin2(intArray3, 1);
        int[] intArray9 = ds.MaxMin2.maxMin2(intArray3, (int) (byte) 0);
        int[] intArray11 = ds.MaxMin2.maxMin2(intArray9, (int) (short) -1);
        int[] intArray13 = ds.MaxMin2.maxMin2(intArray11, (int) (byte) 0);
        int[] intArray15 = ds.MaxMin2.maxMin2(intArray13, 0);
        int[] intArray17 = ds.MaxMin2.maxMin2(intArray15, 1);
        int[] intArray19 = ds.MaxMin2.maxMin2(intArray17, 1);
        int[] intArray21 = ds.MaxMin2.maxMin2(intArray17, (int) (byte) 0);
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[100, 100, 1]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray19), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray21), "[100, 100]");
    }

    @Test
    public void test1600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1600");
        int[] intArray3 = new int[] { (short) 100, (short) 100, 1 };
        int[] intArray5 = ds.MaxMin2.maxMin2(intArray3, (int) (short) 0);
        int[] intArray7 = ds.MaxMin2.maxMin2(intArray5, 0);
        int[] intArray9 = ds.MaxMin2.maxMin2(intArray7, 0);
        int[] intArray11 = ds.MaxMin2.maxMin2(intArray7, (int) (byte) 0);
        int[] intArray13 = ds.MaxMin2.maxMin2(intArray7, (-1));
        java.lang.Class<?> wildcardClass14 = intArray7.getClass();
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[100, 100, 1]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[100, 100]");
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test1601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1601");
        int[] intArray3 = new int[] { (short) 100, (short) 100, 1 };
        int[] intArray5 = ds.MaxMin2.maxMin2(intArray3, (int) (short) 0);
        int[] intArray7 = ds.MaxMin2.maxMin2(intArray3, (int) (byte) 1);
        int[] intArray9 = ds.MaxMin2.maxMin2(intArray7, (int) (byte) 0);
        int[] intArray11 = ds.MaxMin2.maxMin2(intArray7, (int) (byte) -1);
        int[] intArray13 = ds.MaxMin2.maxMin2(intArray7, 0);
        int[] intArray15 = ds.MaxMin2.maxMin2(intArray7, (int) (byte) 0);
        java.lang.Class<?> wildcardClass16 = intArray15.getClass();
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[100, 100, 1]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[100, 100]");
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test1602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1602");
        int[] intArray3 = new int[] { (short) 100, (short) 100, 1 };
        int[] intArray5 = ds.MaxMin2.maxMin2(intArray3, (int) (short) 0);
        int[] intArray7 = ds.MaxMin2.maxMin2(intArray3, 1);
        int[] intArray9 = ds.MaxMin2.maxMin2(intArray7, (int) (short) -1);
        int[] intArray11 = ds.MaxMin2.maxMin2(intArray7, (int) (short) 0);
        int[] intArray13 = ds.MaxMin2.maxMin2(intArray7, (int) (byte) 1);
        java.lang.Class<?> wildcardClass14 = intArray7.getClass();
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[100, 100, 1]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[100, 100]");
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test1603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1603");
        int[] intArray3 = new int[] { (short) 100, (short) 100, 1 };
        int[] intArray5 = ds.MaxMin2.maxMin2(intArray3, (int) (short) 0);
        int[] intArray7 = ds.MaxMin2.maxMin2(intArray3, 1);
        int[] intArray9 = ds.MaxMin2.maxMin2(intArray7, (int) (short) -1);
        int[] intArray11 = ds.MaxMin2.maxMin2(intArray9, (int) (byte) 0);
        int[] intArray13 = ds.MaxMin2.maxMin2(intArray11, 0);
        int[] intArray15 = ds.MaxMin2.maxMin2(intArray11, (int) (short) 0);
        int[] intArray17 = ds.MaxMin2.maxMin2(intArray11, 0);
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[100, 100, 1]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[100, 100]");
    }

    @Test
    public void test1604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1604");
        int[] intArray3 = new int[] { (short) 100, (short) 100, 1 };
        int[] intArray5 = ds.MaxMin2.maxMin2(intArray3, (int) (short) 0);
        int[] intArray7 = ds.MaxMin2.maxMin2(intArray3, (int) (byte) -1);
        int[] intArray9 = ds.MaxMin2.maxMin2(intArray7, (int) (byte) 1);
        int[] intArray11 = ds.MaxMin2.maxMin2(intArray9, (int) (byte) -1);
        int[] intArray13 = ds.MaxMin2.maxMin2(intArray11, (-1));
        int[] intArray15 = ds.MaxMin2.maxMin2(intArray11, (int) (byte) -1);
        int[] intArray17 = ds.MaxMin2.maxMin2(intArray15, 0);
        int[] intArray19 = ds.MaxMin2.maxMin2(intArray17, 0);
        int[] intArray21 = ds.MaxMin2.maxMin2(intArray17, (int) (short) 1);
        java.lang.Class<?> wildcardClass22 = intArray17.getClass();
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[100, 100, 1]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray19), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray21), "[100, 100]");
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test1605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1605");
        int[] intArray3 = new int[] { (short) 100, (short) 100, 1 };
        int[] intArray5 = ds.MaxMin2.maxMin2(intArray3, (int) (short) 0);
        int[] intArray7 = ds.MaxMin2.maxMin2(intArray3, 1);
        int[] intArray9 = ds.MaxMin2.maxMin2(intArray7, (int) (short) -1);
        int[] intArray11 = ds.MaxMin2.maxMin2(intArray7, (int) (short) 0);
        int[] intArray13 = ds.MaxMin2.maxMin2(intArray7, (int) (short) 0);
        int[] intArray15 = ds.MaxMin2.maxMin2(intArray7, (int) (short) 0);
        java.lang.Class<?> wildcardClass16 = intArray15.getClass();
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[100, 100, 1]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[100, 100]");
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test1606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1606");
        int[] intArray3 = new int[] { (short) 100, (short) 100, 1 };
        int[] intArray5 = ds.MaxMin2.maxMin2(intArray3, (int) (short) 0);
        int[] intArray7 = ds.MaxMin2.maxMin2(intArray5, (int) (short) 1);
        int[] intArray9 = ds.MaxMin2.maxMin2(intArray5, (int) (byte) -1);
        int[] intArray11 = ds.MaxMin2.maxMin2(intArray5, 0);
        int[] intArray13 = ds.MaxMin2.maxMin2(intArray5, (-1));
        int[] intArray15 = ds.MaxMin2.maxMin2(intArray13, (int) (short) 0);
        int[] intArray17 = ds.MaxMin2.maxMin2(intArray13, 0);
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[100, 100, 1]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[100, 100]");
    }

    @Test
    public void test1607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1607");
        int[] intArray3 = new int[] { (short) 100, (short) 100, 1 };
        int[] intArray5 = ds.MaxMin2.maxMin2(intArray3, (int) (short) 0);
        int[] intArray7 = ds.MaxMin2.maxMin2(intArray5, (int) (byte) -1);
        int[] intArray9 = ds.MaxMin2.maxMin2(intArray5, 0);
        int[] intArray11 = ds.MaxMin2.maxMin2(intArray5, (int) (short) 1);
        int[] intArray13 = ds.MaxMin2.maxMin2(intArray5, 0);
        int[] intArray15 = ds.MaxMin2.maxMin2(intArray5, 0);
        int[] intArray17 = ds.MaxMin2.maxMin2(intArray5, 0);
        int[] intArray19 = ds.MaxMin2.maxMin2(intArray5, (int) (byte) -1);
        int[] intArray21 = ds.MaxMin2.maxMin2(intArray5, (int) (short) -1);
        int[] intArray23 = ds.MaxMin2.maxMin2(intArray5, (int) (byte) 0);
        int[] intArray25 = ds.MaxMin2.maxMin2(intArray5, (int) (short) -1);
        int[] intArray27 = ds.MaxMin2.maxMin2(intArray5, 0);
        java.lang.Class<?> wildcardClass28 = intArray27.getClass();
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[100, 100, 1]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray19), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray21), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray23), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray25), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray27), "[100, 100]");
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test1608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1608");
        int[] intArray3 = new int[] { (short) 100, (short) 100, 1 };
        int[] intArray5 = ds.MaxMin2.maxMin2(intArray3, (int) (short) 0);
        int[] intArray7 = ds.MaxMin2.maxMin2(intArray3, 0);
        int[] intArray9 = ds.MaxMin2.maxMin2(intArray7, (int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray11 = ds.MaxMin2.maxMin2(intArray9, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[100, 100, 1]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[100, 100]");
    }

    @Test
    public void test1609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1609");
        int[] intArray3 = new int[] { (short) 100, (short) 100, 1 };
        int[] intArray5 = ds.MaxMin2.maxMin2(intArray3, (int) (short) 0);
        int[] intArray7 = ds.MaxMin2.maxMin2(intArray3, 1);
        int[] intArray9 = ds.MaxMin2.maxMin2(intArray7, (int) (short) -1);
        int[] intArray11 = ds.MaxMin2.maxMin2(intArray9, (int) (byte) 0);
        int[] intArray13 = ds.MaxMin2.maxMin2(intArray11, 0);
        int[] intArray15 = ds.MaxMin2.maxMin2(intArray11, (int) (byte) -1);
        int[] intArray17 = ds.MaxMin2.maxMin2(intArray11, (int) (byte) -1);
        int[] intArray19 = ds.MaxMin2.maxMin2(intArray11, (int) (short) -1);
        java.lang.Class<?> wildcardClass20 = intArray11.getClass();
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[100, 100, 1]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray19), "[100, 100]");
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test1610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1610");
        int[] intArray3 = new int[] { (short) 100, (short) 100, 1 };
        int[] intArray5 = ds.MaxMin2.maxMin2(intArray3, (int) (short) 0);
        int[] intArray7 = ds.MaxMin2.maxMin2(intArray3, 1);
        int[] intArray9 = ds.MaxMin2.maxMin2(intArray7, (int) (short) -1);
        int[] intArray11 = ds.MaxMin2.maxMin2(intArray9, (int) (byte) 0);
        int[] intArray13 = ds.MaxMin2.maxMin2(intArray9, (int) (byte) 0);
        int[] intArray15 = ds.MaxMin2.maxMin2(intArray13, (int) (short) -1);
        int[] intArray17 = ds.MaxMin2.maxMin2(intArray13, (int) (short) -1);
        int[] intArray19 = ds.MaxMin2.maxMin2(intArray17, (int) (short) 1);
        int[] intArray21 = ds.MaxMin2.maxMin2(intArray19, (int) (short) 1);
        java.lang.Class<?> wildcardClass22 = intArray21.getClass();
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[100, 100, 1]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray19), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray21), "[100, 100]");
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test1611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1611");
        int[] intArray3 = new int[] { (short) 100, (short) 100, 1 };
        int[] intArray5 = ds.MaxMin2.maxMin2(intArray3, (int) (short) 0);
        int[] intArray7 = ds.MaxMin2.maxMin2(intArray5, (int) (byte) 0);
        int[] intArray9 = ds.MaxMin2.maxMin2(intArray7, (int) (short) -1);
        int[] intArray11 = ds.MaxMin2.maxMin2(intArray9, 0);
        int[] intArray13 = ds.MaxMin2.maxMin2(intArray11, (int) (short) -1);
        int[] intArray15 = ds.MaxMin2.maxMin2(intArray11, 0);
        int[] intArray17 = ds.MaxMin2.maxMin2(intArray15, (int) (short) 1);
        int[] intArray19 = ds.MaxMin2.maxMin2(intArray17, (int) (short) 1);
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[100, 100, 1]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray19), "[100, 100]");
    }

    @Test
    public void test1612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1612");
        int[] intArray3 = new int[] { (short) 100, (short) 100, 1 };
        int[] intArray5 = ds.MaxMin2.maxMin2(intArray3, (int) (short) 0);
        int[] intArray7 = ds.MaxMin2.maxMin2(intArray3, 1);
        int[] intArray9 = ds.MaxMin2.maxMin2(intArray7, (int) (short) -1);
        int[] intArray11 = ds.MaxMin2.maxMin2(intArray9, (int) (byte) 1);
        int[] intArray13 = ds.MaxMin2.maxMin2(intArray11, (-1));
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray15 = ds.MaxMin2.maxMin2(intArray13, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[100, 100, 1]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[100, 100]");
    }

    @Test
    public void test1613() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1613");
        int[] intArray3 = new int[] { (short) 100, (short) 100, 1 };
        int[] intArray5 = ds.MaxMin2.maxMin2(intArray3, (int) (short) 0);
        int[] intArray7 = ds.MaxMin2.maxMin2(intArray5, (int) (byte) 0);
        int[] intArray9 = ds.MaxMin2.maxMin2(intArray7, (int) (short) -1);
        int[] intArray11 = ds.MaxMin2.maxMin2(intArray7, (int) (byte) 1);
        int[] intArray13 = ds.MaxMin2.maxMin2(intArray11, (int) (short) -1);
        int[] intArray15 = ds.MaxMin2.maxMin2(intArray11, (int) (byte) 0);
        int[] intArray17 = ds.MaxMin2.maxMin2(intArray15, (-1));
        int[] intArray19 = ds.MaxMin2.maxMin2(intArray17, (int) (short) 0);
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[100, 100, 1]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray19), "[100, 100]");
    }

    @Test
    public void test1614() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1614");
        int[] intArray3 = new int[] { (short) 100, (short) 100, 1 };
        int[] intArray5 = ds.MaxMin2.maxMin2(intArray3, (int) (short) 0);
        int[] intArray7 = ds.MaxMin2.maxMin2(intArray3, 1);
        int[] intArray9 = ds.MaxMin2.maxMin2(intArray3, (int) (byte) 0);
        int[] intArray11 = ds.MaxMin2.maxMin2(intArray9, (int) (short) -1);
        int[] intArray13 = ds.MaxMin2.maxMin2(intArray11, (int) (byte) 0);
        int[] intArray15 = ds.MaxMin2.maxMin2(intArray13, 0);
        int[] intArray17 = ds.MaxMin2.maxMin2(intArray13, (int) (short) -1);
        int[] intArray19 = ds.MaxMin2.maxMin2(intArray13, (-1));
        int[] intArray21 = ds.MaxMin2.maxMin2(intArray19, 1);
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[100, 100, 1]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray19), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray21), "[100, 100]");
    }

    @Test
    public void test1615() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1615");
        int[] intArray3 = new int[] { (short) 100, (short) 100, 1 };
        int[] intArray5 = ds.MaxMin2.maxMin2(intArray3, (int) (short) 0);
        int[] intArray7 = ds.MaxMin2.maxMin2(intArray3, 1);
        int[] intArray9 = ds.MaxMin2.maxMin2(intArray3, (int) (byte) 0);
        int[] intArray11 = ds.MaxMin2.maxMin2(intArray9, (int) (short) -1);
        int[] intArray13 = ds.MaxMin2.maxMin2(intArray9, (-1));
        int[] intArray15 = ds.MaxMin2.maxMin2(intArray13, 0);
        int[] intArray17 = ds.MaxMin2.maxMin2(intArray13, (-1));
        int[] intArray19 = ds.MaxMin2.maxMin2(intArray13, (-1));
        int[] intArray21 = ds.MaxMin2.maxMin2(intArray13, (int) (byte) -1);
        int[] intArray23 = ds.MaxMin2.maxMin2(intArray21, 0);
        int[] intArray25 = ds.MaxMin2.maxMin2(intArray21, 1);
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[100, 100, 1]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray19), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray21), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray23), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray25), "[100, 100]");
    }

    @Test
    public void test1616() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1616");
        int[] intArray3 = new int[] { (short) 100, (short) 100, 1 };
        int[] intArray5 = ds.MaxMin2.maxMin2(intArray3, (int) (short) 0);
        int[] intArray7 = ds.MaxMin2.maxMin2(intArray3, (int) (byte) -1);
        int[] intArray9 = ds.MaxMin2.maxMin2(intArray3, (-1));
        int[] intArray11 = ds.MaxMin2.maxMin2(intArray9, (int) (byte) -1);
        int[] intArray13 = ds.MaxMin2.maxMin2(intArray9, (int) (byte) 1);
        int[] intArray15 = ds.MaxMin2.maxMin2(intArray13, 1);
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[100, 100, 1]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[100, 100]");
    }

    @Test
    public void test1617() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1617");
        int[] intArray3 = new int[] { (short) 100, (short) 100, 1 };
        int[] intArray5 = ds.MaxMin2.maxMin2(intArray3, (int) (short) 0);
        int[] intArray7 = ds.MaxMin2.maxMin2(intArray3, 1);
        int[] intArray9 = ds.MaxMin2.maxMin2(intArray7, (int) (short) -1);
        int[] intArray11 = ds.MaxMin2.maxMin2(intArray9, (int) (byte) 1);
        int[] intArray13 = ds.MaxMin2.maxMin2(intArray9, (int) (byte) 0);
        int[] intArray15 = ds.MaxMin2.maxMin2(intArray9, 0);
        int[] intArray17 = ds.MaxMin2.maxMin2(intArray15, 0);
        int[] intArray19 = ds.MaxMin2.maxMin2(intArray17, (int) (short) 1);
        int[] intArray21 = ds.MaxMin2.maxMin2(intArray19, (int) (short) 1);
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[100, 100, 1]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray19), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray21), "[100, 100]");
    }

    @Test
    public void test1618() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1618");
        int[] intArray3 = new int[] { (short) 100, (short) 100, 1 };
        int[] intArray5 = ds.MaxMin2.maxMin2(intArray3, (int) (short) 0);
        int[] intArray7 = ds.MaxMin2.maxMin2(intArray5, (int) (byte) -1);
        int[] intArray9 = ds.MaxMin2.maxMin2(intArray5, 0);
        int[] intArray11 = ds.MaxMin2.maxMin2(intArray5, 0);
        int[] intArray13 = ds.MaxMin2.maxMin2(intArray11, (int) (short) -1);
        int[] intArray15 = ds.MaxMin2.maxMin2(intArray13, (int) (byte) -1);
        int[] intArray17 = ds.MaxMin2.maxMin2(intArray13, (int) (short) -1);
        java.lang.Class<?> wildcardClass18 = intArray17.getClass();
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[100, 100, 1]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[100, 100]");
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test1619() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1619");
        int[] intArray3 = new int[] { (short) 100, (short) 100, 1 };
        int[] intArray5 = ds.MaxMin2.maxMin2(intArray3, (int) (short) 0);
        int[] intArray7 = ds.MaxMin2.maxMin2(intArray3, 1);
        int[] intArray9 = ds.MaxMin2.maxMin2(intArray7, (int) (short) -1);
        int[] intArray11 = ds.MaxMin2.maxMin2(intArray9, (int) (byte) 0);
        int[] intArray13 = ds.MaxMin2.maxMin2(intArray11, (-1));
        int[] intArray15 = ds.MaxMin2.maxMin2(intArray11, (int) (short) 0);
        int[] intArray17 = ds.MaxMin2.maxMin2(intArray11, 1);
        int[] intArray19 = ds.MaxMin2.maxMin2(intArray11, 0);
        int[] intArray21 = ds.MaxMin2.maxMin2(intArray11, 0);
        int[] intArray23 = ds.MaxMin2.maxMin2(intArray21, (int) (byte) 0);
        int[] intArray25 = ds.MaxMin2.maxMin2(intArray23, 0);
        java.lang.Class<?> wildcardClass26 = intArray25.getClass();
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[100, 100, 1]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray19), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray21), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray23), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray25), "[100, 100]");
        org.junit.Assert.assertNotNull(wildcardClass26);
    }

    @Test
    public void test1620() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1620");
        int[] intArray3 = new int[] { (short) 100, (short) 100, 1 };
        int[] intArray5 = ds.MaxMin2.maxMin2(intArray3, (int) (short) 0);
        int[] intArray7 = ds.MaxMin2.maxMin2(intArray3, 1);
        int[] intArray9 = ds.MaxMin2.maxMin2(intArray7, (int) (short) -1);
        int[] intArray11 = ds.MaxMin2.maxMin2(intArray9, (int) (byte) 0);
        int[] intArray13 = ds.MaxMin2.maxMin2(intArray11, 0);
        int[] intArray15 = ds.MaxMin2.maxMin2(intArray13, 1);
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[100, 100, 1]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[100, 100]");
    }

    @Test
    public void test1621() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1621");
        int[] intArray3 = new int[] { (short) 100, (short) 100, 1 };
        int[] intArray5 = ds.MaxMin2.maxMin2(intArray3, (int) (short) 0);
        int[] intArray7 = ds.MaxMin2.maxMin2(intArray5, (int) (byte) -1);
        int[] intArray9 = ds.MaxMin2.maxMin2(intArray5, 0);
        int[] intArray11 = ds.MaxMin2.maxMin2(intArray5, 0);
        int[] intArray13 = ds.MaxMin2.maxMin2(intArray5, 0);
        int[] intArray15 = ds.MaxMin2.maxMin2(intArray13, (int) (short) 0);
        java.lang.Class<?> wildcardClass16 = intArray13.getClass();
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[100, 100, 1]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[100, 100]");
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test1622() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1622");
        int[] intArray3 = new int[] { (short) 100, (short) 100, 1 };
        int[] intArray5 = ds.MaxMin2.maxMin2(intArray3, (int) (short) 0);
        int[] intArray7 = ds.MaxMin2.maxMin2(intArray5, (int) (byte) 0);
        int[] intArray9 = ds.MaxMin2.maxMin2(intArray7, (int) (short) -1);
        int[] intArray11 = ds.MaxMin2.maxMin2(intArray9, 1);
        java.lang.Class<?> wildcardClass12 = intArray9.getClass();
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[100, 100, 1]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[100, 100]");
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test1623() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1623");
        int[] intArray3 = new int[] { (short) 100, (short) 100, 1 };
        int[] intArray5 = ds.MaxMin2.maxMin2(intArray3, (int) (short) 0);
        int[] intArray7 = ds.MaxMin2.maxMin2(intArray3, (int) (byte) 1);
        int[] intArray9 = ds.MaxMin2.maxMin2(intArray3, (int) (byte) -1);
        int[] intArray11 = ds.MaxMin2.maxMin2(intArray3, (-1));
        int[] intArray13 = ds.MaxMin2.maxMin2(intArray11, (int) (byte) 0);
        java.lang.Class<?> wildcardClass14 = intArray11.getClass();
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[100, 100, 1]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[100, 100]");
        org.junit.Assert.assertNotNull(wildcardClass14);
    }
}

