package ds.seed5831;

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
        int[] intArray1 = new int[] { (byte) -1 };
        int[] intArray3 = ds.MaxMin1.maxMin1(intArray1, 0);
        int[] intArray5 = ds.MaxMin1.maxMin1(intArray3, 0);
        int[] intArray7 = ds.MaxMin1.maxMin1(intArray3, 0);
        int[] intArray9 = ds.MaxMin1.maxMin1(intArray3, (int) (byte) -1);
        int[] intArray11 = ds.MaxMin1.maxMin1(intArray3, 1);
        int[] intArray13 = ds.MaxMin1.maxMin1(intArray3, 1);
        int[] intArray15 = ds.MaxMin1.maxMin1(intArray3, (int) (byte) -1);
        int[] intArray17 = ds.MaxMin1.maxMin1(intArray3, 0);
        int[] intArray19 = ds.MaxMin1.maxMin1(intArray17, (int) (short) 1);
        int[] intArray21 = ds.MaxMin1.maxMin1(intArray17, (int) (short) -1);
        int[] intArray23 = ds.MaxMin1.maxMin1(intArray21, (int) (byte) 1);
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray1), "[-1]");
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray19), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray21), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray23), "[-1, -1]");
    }

    @Test
    public void test1502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1502");
        int[] intArray1 = new int[] { (byte) -1 };
        int[] intArray3 = ds.MaxMin1.maxMin1(intArray1, 0);
        int[] intArray5 = ds.MaxMin1.maxMin1(intArray3, 0);
        int[] intArray7 = ds.MaxMin1.maxMin1(intArray5, (int) (byte) -1);
        int[] intArray9 = ds.MaxMin1.maxMin1(intArray7, 1);
        int[] intArray11 = ds.MaxMin1.maxMin1(intArray7, (-1));
        int[] intArray13 = ds.MaxMin1.maxMin1(intArray7, 0);
        int[] intArray15 = ds.MaxMin1.maxMin1(intArray13, (int) (byte) 1);
        int[] intArray17 = ds.MaxMin1.maxMin1(intArray15, (int) (short) -1);
        int[] intArray19 = ds.MaxMin1.maxMin1(intArray15, (int) (short) -1);
        int[] intArray21 = ds.MaxMin1.maxMin1(intArray19, (int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray23 = ds.MaxMin1.maxMin1(intArray19, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray1), "[-1]");
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray19), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray21), "[-1, -1]");
    }

    @Test
    public void test1503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1503");
        int[] intArray1 = new int[] { (byte) -1 };
        int[] intArray3 = ds.MaxMin1.maxMin1(intArray1, 0);
        int[] intArray5 = ds.MaxMin1.maxMin1(intArray3, 0);
        int[] intArray7 = ds.MaxMin1.maxMin1(intArray5, (int) (byte) -1);
        int[] intArray9 = ds.MaxMin1.maxMin1(intArray7, 1);
        int[] intArray11 = ds.MaxMin1.maxMin1(intArray7, (-1));
        int[] intArray13 = ds.MaxMin1.maxMin1(intArray7, (-1));
        int[] intArray15 = ds.MaxMin1.maxMin1(intArray7, (int) (byte) -1);
        int[] intArray17 = ds.MaxMin1.maxMin1(intArray15, (int) (byte) -1);
        int[] intArray19 = ds.MaxMin1.maxMin1(intArray17, (int) (byte) -1);
        int[] intArray21 = ds.MaxMin1.maxMin1(intArray17, (-1));
        int[] intArray23 = ds.MaxMin1.maxMin1(intArray21, 1);
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray1), "[-1]");
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray19), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray21), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray23), "[-1, -1]");
    }

    @Test
    public void test1504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1504");
        int[] intArray1 = new int[] { (byte) -1 };
        int[] intArray3 = ds.MaxMin1.maxMin1(intArray1, 0);
        int[] intArray5 = ds.MaxMin1.maxMin1(intArray3, 0);
        int[] intArray7 = ds.MaxMin1.maxMin1(intArray5, (int) (byte) -1);
        int[] intArray9 = ds.MaxMin1.maxMin1(intArray7, 1);
        int[] intArray11 = ds.MaxMin1.maxMin1(intArray7, (-1));
        int[] intArray13 = ds.MaxMin1.maxMin1(intArray7, (int) (byte) 0);
        int[] intArray15 = ds.MaxMin1.maxMin1(intArray7, (int) (short) -1);
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray1), "[-1]");
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[-1, -1]");
    }

    @Test
    public void test1505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1505");
        int[] intArray2 = new int[] { (byte) 1, (byte) -1 };
        int[] intArray4 = ds.MaxMin1.maxMin1(intArray2, (int) (short) -1);
        int[] intArray6 = ds.MaxMin1.maxMin1(intArray4, (int) (short) -1);
        int[] intArray8 = ds.MaxMin1.maxMin1(intArray4, (int) (byte) 1);
        java.lang.Class<?> wildcardClass9 = intArray4.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[1, -1]");
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[1, 1]");
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test1506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1506");
        int[] intArray1 = new int[] { (byte) -1 };
        int[] intArray3 = ds.MaxMin1.maxMin1(intArray1, 0);
        int[] intArray5 = ds.MaxMin1.maxMin1(intArray3, 0);
        int[] intArray7 = ds.MaxMin1.maxMin1(intArray3, 0);
        int[] intArray9 = ds.MaxMin1.maxMin1(intArray3, (int) (byte) -1);
        int[] intArray11 = ds.MaxMin1.maxMin1(intArray3, 1);
        int[] intArray13 = ds.MaxMin1.maxMin1(intArray11, (int) (byte) -1);
        int[] intArray15 = ds.MaxMin1.maxMin1(intArray11, 0);
        java.lang.Class<?> wildcardClass16 = intArray11.getClass();
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray1), "[-1]");
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[-1, -1]");
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test1507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1507");
        int[] intArray3 = new int[] { 0, (-1), (short) 1 };
        int[] intArray5 = ds.MaxMin1.maxMin1(intArray3, (int) (byte) 0);
        int[] intArray7 = ds.MaxMin1.maxMin1(intArray5, (int) (short) 1);
        int[] intArray9 = ds.MaxMin1.maxMin1(intArray5, 1);
        int[] intArray11 = ds.MaxMin1.maxMin1(intArray9, 1);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray13 = ds.MaxMin1.maxMin1(intArray11, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[0, -1, 1]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[0, 0]");
    }

    @Test
    public void test1508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1508");
        int[] intArray5 = new int[] { (short) 1, 0, (byte) 10, (-1), 0 };
        int[] intArray7 = ds.MaxMin1.maxMin1(intArray5, (-1));
        int[] intArray9 = ds.MaxMin1.maxMin1(intArray7, (int) (byte) -1);
        int[] intArray11 = ds.MaxMin1.maxMin1(intArray7, (int) (byte) 1);
        int[] intArray13 = ds.MaxMin1.maxMin1(intArray7, (-1));
        int[] intArray15 = ds.MaxMin1.maxMin1(intArray7, (int) (short) 0);
        int[] intArray17 = ds.MaxMin1.maxMin1(intArray7, (int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray19 = ds.MaxMin1.maxMin1(intArray7, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[1, 0, 10, -1, 0]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[1, 1]");
    }

    @Test
    public void test1509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1509");
        int[] intArray5 = new int[] { (short) 1, 0, (byte) 10, (-1), 0 };
        int[] intArray7 = ds.MaxMin1.maxMin1(intArray5, (-1));
        int[] intArray9 = ds.MaxMin1.maxMin1(intArray7, (int) (byte) -1);
        int[] intArray11 = ds.MaxMin1.maxMin1(intArray9, (int) (byte) 1);
        int[] intArray13 = ds.MaxMin1.maxMin1(intArray9, (int) (byte) 0);
        int[] intArray15 = ds.MaxMin1.maxMin1(intArray9, (int) (short) 0);
        int[] intArray17 = ds.MaxMin1.maxMin1(intArray9, (int) (byte) -1);
        int[] intArray19 = ds.MaxMin1.maxMin1(intArray17, (-1));
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[1, 0, 10, -1, 0]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray19), "[1, 1]");
    }

    @Test
    public void test1510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1510");
        int[] intArray1 = new int[] { (byte) -1 };
        int[] intArray3 = ds.MaxMin1.maxMin1(intArray1, 0);
        int[] intArray5 = ds.MaxMin1.maxMin1(intArray3, 0);
        int[] intArray7 = ds.MaxMin1.maxMin1(intArray3, 0);
        int[] intArray9 = ds.MaxMin1.maxMin1(intArray3, 1);
        int[] intArray11 = ds.MaxMin1.maxMin1(intArray3, (int) (short) -1);
        int[] intArray13 = ds.MaxMin1.maxMin1(intArray11, (int) (short) 1);
        int[] intArray15 = ds.MaxMin1.maxMin1(intArray13, (-1));
        int[] intArray17 = ds.MaxMin1.maxMin1(intArray15, (int) (byte) 1);
        int[] intArray19 = ds.MaxMin1.maxMin1(intArray15, (int) (byte) 0);
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray1), "[-1]");
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray19), "[-1, -1]");
    }

    @Test
    public void test1511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1511");
        int[] intArray5 = new int[] { (short) 1, 0, (byte) 10, (-1), 0 };
        int[] intArray7 = ds.MaxMin1.maxMin1(intArray5, (-1));
        int[] intArray9 = ds.MaxMin1.maxMin1(intArray7, (int) (byte) -1);
        int[] intArray11 = ds.MaxMin1.maxMin1(intArray7, (int) (short) 1);
        int[] intArray13 = ds.MaxMin1.maxMin1(intArray7, (int) (short) 0);
        int[] intArray15 = ds.MaxMin1.maxMin1(intArray13, 0);
        int[] intArray17 = ds.MaxMin1.maxMin1(intArray13, (int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray19 = ds.MaxMin1.maxMin1(intArray13, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[1, 0, 10, -1, 0]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[1, 1]");
    }

    @Test
    public void test1512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1512");
        int[] intArray5 = new int[] { (short) 1, 0, (byte) 10, (-1), 0 };
        int[] intArray7 = ds.MaxMin1.maxMin1(intArray5, (-1));
        int[] intArray9 = ds.MaxMin1.maxMin1(intArray7, (int) (byte) -1);
        int[] intArray11 = ds.MaxMin1.maxMin1(intArray9, (int) (byte) 1);
        int[] intArray13 = ds.MaxMin1.maxMin1(intArray9, (int) (byte) 0);
        int[] intArray15 = ds.MaxMin1.maxMin1(intArray9, 1);
        int[] intArray17 = ds.MaxMin1.maxMin1(intArray9, (int) (short) 1);
        int[] intArray19 = ds.MaxMin1.maxMin1(intArray17, (int) (short) 0);
        int[] intArray21 = ds.MaxMin1.maxMin1(intArray19, (int) (byte) 0);
        java.lang.Class<?> wildcardClass22 = intArray21.getClass();
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[1, 0, 10, -1, 0]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray19), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray21), "[1, 1]");
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test1513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1513");
        int[] intArray5 = new int[] { (short) 1, 0, (byte) 10, (-1), 0 };
        int[] intArray7 = ds.MaxMin1.maxMin1(intArray5, (-1));
        int[] intArray9 = ds.MaxMin1.maxMin1(intArray7, (int) (byte) -1);
        int[] intArray11 = ds.MaxMin1.maxMin1(intArray7, (int) (byte) 1);
        int[] intArray13 = ds.MaxMin1.maxMin1(intArray7, (-1));
        int[] intArray15 = ds.MaxMin1.maxMin1(intArray7, (int) (short) 0);
        int[] intArray17 = ds.MaxMin1.maxMin1(intArray7, (int) (short) 1);
        java.lang.Class<?> wildcardClass18 = intArray17.getClass();
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[1, 0, 10, -1, 0]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[1, 1]");
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test1514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1514");
        int[] intArray6 = new int[] { (byte) 10, '#', (short) 1, (short) -1, (short) 1, '4' };
        int[] intArray8 = ds.MaxMin1.maxMin1(intArray6, (int) (byte) 1);
        int[] intArray10 = ds.MaxMin1.maxMin1(intArray6, (int) (short) -1);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray12 = ds.MaxMin1.maxMin1(intArray6, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[10, 35, 1, -1, 1, 52]");
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[10, 10]");
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[10, 10]");
    }

    @Test
    public void test1515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1515");
        int[] intArray1 = new int[] { (byte) -1 };
        int[] intArray3 = ds.MaxMin1.maxMin1(intArray1, 0);
        int[] intArray5 = ds.MaxMin1.maxMin1(intArray3, 0);
        int[] intArray7 = ds.MaxMin1.maxMin1(intArray5, (int) (byte) -1);
        int[] intArray9 = ds.MaxMin1.maxMin1(intArray5, 1);
        int[] intArray11 = ds.MaxMin1.maxMin1(intArray5, (int) (short) 1);
        int[] intArray13 = ds.MaxMin1.maxMin1(intArray11, (int) (short) -1);
        int[] intArray15 = ds.MaxMin1.maxMin1(intArray11, 0);
        int[] intArray17 = ds.MaxMin1.maxMin1(intArray11, (int) (byte) -1);
        java.lang.Class<?> wildcardClass18 = intArray17.getClass();
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray1), "[-1]");
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[-1, -1]");
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test1516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1516");
        int[] intArray1 = new int[] { (byte) -1 };
        int[] intArray3 = ds.MaxMin1.maxMin1(intArray1, 0);
        int[] intArray5 = ds.MaxMin1.maxMin1(intArray3, 0);
        int[] intArray7 = ds.MaxMin1.maxMin1(intArray5, (int) (byte) -1);
        int[] intArray9 = ds.MaxMin1.maxMin1(intArray7, 1);
        int[] intArray11 = ds.MaxMin1.maxMin1(intArray7, (-1));
        int[] intArray13 = ds.MaxMin1.maxMin1(intArray7, 0);
        int[] intArray15 = ds.MaxMin1.maxMin1(intArray13, 0);
        int[] intArray17 = ds.MaxMin1.maxMin1(intArray13, 0);
        int[] intArray19 = ds.MaxMin1.maxMin1(intArray17, (-1));
        int[] intArray21 = ds.MaxMin1.maxMin1(intArray19, (-1));
        int[] intArray23 = ds.MaxMin1.maxMin1(intArray19, (int) (byte) 1);
        java.lang.Class<?> wildcardClass24 = intArray23.getClass();
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray1), "[-1]");
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray19), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray21), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray23), "[-1, -1]");
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test1517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1517");
        int[] intArray1 = new int[] { (byte) -1 };
        int[] intArray3 = ds.MaxMin1.maxMin1(intArray1, 0);
        int[] intArray5 = ds.MaxMin1.maxMin1(intArray3, 0);
        int[] intArray7 = ds.MaxMin1.maxMin1(intArray5, (int) (byte) -1);
        int[] intArray9 = ds.MaxMin1.maxMin1(intArray5, 1);
        int[] intArray11 = ds.MaxMin1.maxMin1(intArray5, (int) (short) 1);
        int[] intArray13 = ds.MaxMin1.maxMin1(intArray11, 1);
        int[] intArray15 = ds.MaxMin1.maxMin1(intArray11, (int) (short) -1);
        java.lang.Class<?> wildcardClass16 = intArray15.getClass();
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray1), "[-1]");
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[-1, -1]");
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test1518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1518");
        int[] intArray5 = new int[] { (short) 1, 0, (byte) 10, (-1), 0 };
        int[] intArray7 = ds.MaxMin1.maxMin1(intArray5, (-1));
        int[] intArray9 = ds.MaxMin1.maxMin1(intArray7, (int) (byte) -1);
        int[] intArray11 = ds.MaxMin1.maxMin1(intArray7, (int) (short) 1);
        int[] intArray13 = ds.MaxMin1.maxMin1(intArray7, (int) (short) 0);
        int[] intArray15 = ds.MaxMin1.maxMin1(intArray7, 0);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray17 = ds.MaxMin1.maxMin1(intArray15, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[1, 0, 10, -1, 0]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[1, 1]");
    }

    @Test
    public void test1519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1519");
        int[] intArray1 = new int[] { (byte) -1 };
        int[] intArray3 = ds.MaxMin1.maxMin1(intArray1, 0);
        int[] intArray5 = ds.MaxMin1.maxMin1(intArray3, 0);
        int[] intArray7 = ds.MaxMin1.maxMin1(intArray5, (int) (byte) -1);
        int[] intArray9 = ds.MaxMin1.maxMin1(intArray7, 1);
        int[] intArray11 = ds.MaxMin1.maxMin1(intArray7, (-1));
        int[] intArray13 = ds.MaxMin1.maxMin1(intArray7, 0);
        int[] intArray15 = ds.MaxMin1.maxMin1(intArray13, (int) (byte) 1);
        int[] intArray17 = ds.MaxMin1.maxMin1(intArray15, (int) (short) -1);
        int[] intArray19 = ds.MaxMin1.maxMin1(intArray15, 0);
        int[] intArray21 = ds.MaxMin1.maxMin1(intArray15, (int) (byte) -1);
        int[] intArray23 = ds.MaxMin1.maxMin1(intArray15, (int) (byte) 0);
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray1), "[-1]");
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray19), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray21), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray23), "[-1, -1]");
    }

    @Test
    public void test1520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1520");
        int[] intArray1 = new int[] { (byte) -1 };
        int[] intArray3 = ds.MaxMin1.maxMin1(intArray1, 0);
        int[] intArray5 = ds.MaxMin1.maxMin1(intArray3, 0);
        int[] intArray7 = ds.MaxMin1.maxMin1(intArray5, (int) (byte) -1);
        int[] intArray9 = ds.MaxMin1.maxMin1(intArray7, 1);
        int[] intArray11 = ds.MaxMin1.maxMin1(intArray7, (-1));
        int[] intArray13 = ds.MaxMin1.maxMin1(intArray7, 0);
        int[] intArray15 = ds.MaxMin1.maxMin1(intArray13, 0);
        int[] intArray17 = ds.MaxMin1.maxMin1(intArray13, 0);
        int[] intArray19 = ds.MaxMin1.maxMin1(intArray13, (int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray21 = ds.MaxMin1.maxMin1(intArray19, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray1), "[-1]");
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray19), "[-1, -1]");
    }

    @Test
    public void test1521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1521");
        int[] intArray1 = new int[] { (byte) -1 };
        int[] intArray3 = ds.MaxMin1.maxMin1(intArray1, 0);
        int[] intArray5 = ds.MaxMin1.maxMin1(intArray3, 0);
        int[] intArray7 = ds.MaxMin1.maxMin1(intArray5, 0);
        int[] intArray9 = ds.MaxMin1.maxMin1(intArray5, (int) (short) -1);
        int[] intArray11 = ds.MaxMin1.maxMin1(intArray5, 0);
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray1), "[-1]");
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[-1, -1]");
    }

    @Test
    public void test1522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1522");
        int[] intArray1 = new int[] { (byte) -1 };
        int[] intArray3 = ds.MaxMin1.maxMin1(intArray1, 0);
        int[] intArray5 = ds.MaxMin1.maxMin1(intArray3, 0);
        int[] intArray7 = ds.MaxMin1.maxMin1(intArray5, (int) (byte) -1);
        int[] intArray9 = ds.MaxMin1.maxMin1(intArray5, 1);
        int[] intArray11 = ds.MaxMin1.maxMin1(intArray5, (int) (short) 1);
        int[] intArray13 = ds.MaxMin1.maxMin1(intArray11, 1);
        int[] intArray15 = ds.MaxMin1.maxMin1(intArray11, (int) (short) -1);
        int[] intArray17 = ds.MaxMin1.maxMin1(intArray15, (int) (byte) 1);
        int[] intArray19 = ds.MaxMin1.maxMin1(intArray17, (int) (short) 1);
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray1), "[-1]");
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray19), "[-1, -1]");
    }

    @Test
    public void test1523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1523");
        int[] intArray1 = new int[] { (byte) -1 };
        int[] intArray3 = ds.MaxMin1.maxMin1(intArray1, 0);
        int[] intArray5 = ds.MaxMin1.maxMin1(intArray3, 0);
        int[] intArray7 = ds.MaxMin1.maxMin1(intArray3, 0);
        int[] intArray9 = ds.MaxMin1.maxMin1(intArray3, 1);
        int[] intArray11 = ds.MaxMin1.maxMin1(intArray3, (int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray13 = ds.MaxMin1.maxMin1(intArray11, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray1), "[-1]");
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[-1, -1]");
    }

    @Test
    public void test1524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1524");
        int[] intArray1 = new int[] { (byte) -1 };
        int[] intArray3 = ds.MaxMin1.maxMin1(intArray1, 0);
        int[] intArray5 = ds.MaxMin1.maxMin1(intArray3, 0);
        int[] intArray7 = ds.MaxMin1.maxMin1(intArray3, 0);
        int[] intArray9 = ds.MaxMin1.maxMin1(intArray3, 1);
        int[] intArray11 = ds.MaxMin1.maxMin1(intArray9, (int) (short) -1);
        int[] intArray13 = ds.MaxMin1.maxMin1(intArray11, (int) (short) 1);
        int[] intArray15 = ds.MaxMin1.maxMin1(intArray13, (int) (short) 0);
        int[] intArray17 = ds.MaxMin1.maxMin1(intArray15, 0);
        int[] intArray19 = ds.MaxMin1.maxMin1(intArray15, 1);
        int[] intArray21 = ds.MaxMin1.maxMin1(intArray19, (-1));
        int[] intArray23 = ds.MaxMin1.maxMin1(intArray19, (int) (byte) -1);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray25 = ds.MaxMin1.maxMin1(intArray23, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray1), "[-1]");
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray19), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray21), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray23), "[-1, -1]");
    }

    @Test
    public void test1525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1525");
        int[] intArray3 = new int[] { 0, (-1), (short) 1 };
        int[] intArray5 = ds.MaxMin1.maxMin1(intArray3, (int) (byte) 0);
        int[] intArray7 = ds.MaxMin1.maxMin1(intArray5, (int) (short) -1);
        int[] intArray9 = ds.MaxMin1.maxMin1(intArray5, 1);
        int[] intArray11 = ds.MaxMin1.maxMin1(intArray5, (int) (short) 0);
        int[] intArray13 = ds.MaxMin1.maxMin1(intArray11, (int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray15 = ds.MaxMin1.maxMin1(intArray11, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[0, -1, 1]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[0, 0]");
    }

    @Test
    public void test1526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1526");
        int[] intArray1 = new int[] { (byte) -1 };
        int[] intArray3 = ds.MaxMin1.maxMin1(intArray1, 0);
        int[] intArray5 = ds.MaxMin1.maxMin1(intArray3, 0);
        int[] intArray7 = ds.MaxMin1.maxMin1(intArray5, (int) (byte) -1);
        int[] intArray9 = ds.MaxMin1.maxMin1(intArray5, 1);
        int[] intArray11 = ds.MaxMin1.maxMin1(intArray9, (int) (byte) -1);
        int[] intArray13 = ds.MaxMin1.maxMin1(intArray9, (int) (byte) 0);
        int[] intArray15 = ds.MaxMin1.maxMin1(intArray13, (int) (short) 0);
        int[] intArray17 = ds.MaxMin1.maxMin1(intArray13, (int) (short) 1);
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray1), "[-1]");
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[-1, -1]");
    }

    @Test
    public void test1527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1527");
        int[] intArray5 = new int[] { (short) 1, 0, (byte) 10, (-1), 0 };
        int[] intArray7 = ds.MaxMin1.maxMin1(intArray5, (-1));
        int[] intArray9 = ds.MaxMin1.maxMin1(intArray7, (int) (short) 1);
        int[] intArray11 = ds.MaxMin1.maxMin1(intArray7, (-1));
        java.lang.Class<?> wildcardClass12 = intArray7.getClass();
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[1, 0, 10, -1, 0]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[1, 1]");
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test1528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1528");
        int[] intArray1 = new int[] { (byte) -1 };
        int[] intArray3 = ds.MaxMin1.maxMin1(intArray1, 0);
        int[] intArray5 = ds.MaxMin1.maxMin1(intArray3, 0);
        int[] intArray7 = ds.MaxMin1.maxMin1(intArray3, 0);
        int[] intArray9 = ds.MaxMin1.maxMin1(intArray3, 1);
        int[] intArray11 = ds.MaxMin1.maxMin1(intArray9, (int) (short) -1);
        int[] intArray13 = ds.MaxMin1.maxMin1(intArray11, (int) (short) 1);
        int[] intArray15 = ds.MaxMin1.maxMin1(intArray11, 1);
        int[] intArray17 = ds.MaxMin1.maxMin1(intArray15, 1);
        int[] intArray19 = ds.MaxMin1.maxMin1(intArray15, (int) (short) 1);
        java.lang.Class<?> wildcardClass20 = intArray19.getClass();
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray1), "[-1]");
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray19), "[-1, -1]");
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test1529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1529");
        int[] intArray5 = new int[] { (short) 1, 0, (byte) 10, (-1), 0 };
        int[] intArray7 = ds.MaxMin1.maxMin1(intArray5, (-1));
        int[] intArray9 = ds.MaxMin1.maxMin1(intArray7, (int) (byte) -1);
        int[] intArray11 = ds.MaxMin1.maxMin1(intArray9, (int) (byte) 1);
        int[] intArray13 = ds.MaxMin1.maxMin1(intArray9, (int) (byte) 0);
        int[] intArray15 = ds.MaxMin1.maxMin1(intArray9, 1);
        int[] intArray17 = ds.MaxMin1.maxMin1(intArray15, 0);
        java.lang.Class<?> wildcardClass18 = intArray15.getClass();
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[1, 0, 10, -1, 0]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[1, 1]");
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test1530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1530");
        int[] intArray1 = new int[] { (byte) -1 };
        int[] intArray3 = ds.MaxMin1.maxMin1(intArray1, 0);
        int[] intArray5 = ds.MaxMin1.maxMin1(intArray3, 0);
        int[] intArray7 = ds.MaxMin1.maxMin1(intArray5, (int) (byte) -1);
        int[] intArray9 = ds.MaxMin1.maxMin1(intArray5, 1);
        int[] intArray11 = ds.MaxMin1.maxMin1(intArray9, (int) (byte) -1);
        int[] intArray13 = ds.MaxMin1.maxMin1(intArray9, 0);
        int[] intArray15 = ds.MaxMin1.maxMin1(intArray13, (int) (byte) 1);
        int[] intArray17 = ds.MaxMin1.maxMin1(intArray13, 1);
        int[] intArray19 = ds.MaxMin1.maxMin1(intArray17, (int) (short) 1);
        java.lang.Class<?> wildcardClass20 = intArray17.getClass();
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray1), "[-1]");
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray19), "[-1, -1]");
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test1531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1531");
        int[] intArray3 = new int[] { 0, (-1), (short) 1 };
        int[] intArray5 = ds.MaxMin1.maxMin1(intArray3, (int) (byte) 0);
        int[] intArray7 = ds.MaxMin1.maxMin1(intArray5, (int) (short) -1);
        int[] intArray9 = ds.MaxMin1.maxMin1(intArray5, (int) (short) -1);
        int[] intArray11 = ds.MaxMin1.maxMin1(intArray5, (-1));
        int[] intArray13 = ds.MaxMin1.maxMin1(intArray11, (int) (byte) 0);
        int[] intArray15 = ds.MaxMin1.maxMin1(intArray13, (int) (short) -1);
        int[] intArray17 = ds.MaxMin1.maxMin1(intArray13, (int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray19 = ds.MaxMin1.maxMin1(intArray13, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[0, -1, 1]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[0, 0]");
    }

    @Test
    public void test1532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1532");
        int[] intArray1 = new int[] { (byte) -1 };
        int[] intArray3 = ds.MaxMin1.maxMin1(intArray1, 0);
        int[] intArray5 = ds.MaxMin1.maxMin1(intArray3, 0);
        int[] intArray7 = ds.MaxMin1.maxMin1(intArray5, (int) (byte) -1);
        int[] intArray9 = ds.MaxMin1.maxMin1(intArray7, 1);
        int[] intArray11 = ds.MaxMin1.maxMin1(intArray7, (-1));
        int[] intArray13 = ds.MaxMin1.maxMin1(intArray7, 0);
        int[] intArray15 = ds.MaxMin1.maxMin1(intArray13, 0);
        int[] intArray17 = ds.MaxMin1.maxMin1(intArray13, 0);
        int[] intArray19 = ds.MaxMin1.maxMin1(intArray17, (int) (short) 0);
        int[] intArray21 = ds.MaxMin1.maxMin1(intArray17, (int) (byte) 1);
        int[] intArray23 = ds.MaxMin1.maxMin1(intArray17, 0);
        int[] intArray25 = ds.MaxMin1.maxMin1(intArray17, (int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray27 = ds.MaxMin1.maxMin1(intArray17, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray1), "[-1]");
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray19), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray21), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray23), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray25), "[-1, -1]");
    }

    @Test
    public void test1533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1533");
        int[] intArray1 = new int[] { (byte) -1 };
        int[] intArray3 = ds.MaxMin1.maxMin1(intArray1, 0);
        int[] intArray5 = ds.MaxMin1.maxMin1(intArray3, 0);
        int[] intArray7 = ds.MaxMin1.maxMin1(intArray5, (int) (byte) -1);
        int[] intArray9 = ds.MaxMin1.maxMin1(intArray7, 1);
        int[] intArray11 = ds.MaxMin1.maxMin1(intArray7, (-1));
        int[] intArray13 = ds.MaxMin1.maxMin1(intArray7, 0);
        int[] intArray15 = ds.MaxMin1.maxMin1(intArray13, 0);
        int[] intArray17 = ds.MaxMin1.maxMin1(intArray13, 0);
        int[] intArray19 = ds.MaxMin1.maxMin1(intArray17, (int) (short) 0);
        int[] intArray21 = ds.MaxMin1.maxMin1(intArray17, (int) (byte) 1);
        int[] intArray23 = ds.MaxMin1.maxMin1(intArray17, 0);
        int[] intArray25 = ds.MaxMin1.maxMin1(intArray17, 0);
        int[] intArray27 = ds.MaxMin1.maxMin1(intArray25, 0);
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray1), "[-1]");
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray19), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray21), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray23), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray25), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray27), "[-1, -1]");
    }

    @Test
    public void test1534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1534");
        int[] intArray5 = new int[] { (short) 1, 0, (byte) 10, (-1), 0 };
        int[] intArray7 = ds.MaxMin1.maxMin1(intArray5, (-1));
        int[] intArray9 = ds.MaxMin1.maxMin1(intArray7, (int) (byte) -1);
        int[] intArray11 = ds.MaxMin1.maxMin1(intArray7, (int) (byte) 1);
        int[] intArray13 = ds.MaxMin1.maxMin1(intArray7, 1);
        int[] intArray15 = ds.MaxMin1.maxMin1(intArray7, 0);
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[1, 0, 10, -1, 0]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[1, 1]");
    }

    @Test
    public void test1535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1535");
        int[] intArray2 = new int[] { 0, 'a' };
        int[] intArray4 = ds.MaxMin1.maxMin1(intArray2, (int) (byte) 1);
        int[] intArray6 = ds.MaxMin1.maxMin1(intArray2, 0);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[0, 97]");
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[0, 0]");
    }

    @Test
    public void test1536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1536");
        int[] intArray1 = new int[] { (byte) -1 };
        int[] intArray3 = ds.MaxMin1.maxMin1(intArray1, 0);
        int[] intArray5 = ds.MaxMin1.maxMin1(intArray3, 0);
        int[] intArray7 = ds.MaxMin1.maxMin1(intArray5, (int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray9 = ds.MaxMin1.maxMin1(intArray7, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray1), "[-1]");
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[-1, -1]");
    }

    @Test
    public void test1537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1537");
        int[] intArray1 = new int[] { (byte) -1 };
        int[] intArray3 = ds.MaxMin1.maxMin1(intArray1, 0);
        int[] intArray5 = ds.MaxMin1.maxMin1(intArray3, 0);
        int[] intArray7 = ds.MaxMin1.maxMin1(intArray3, 0);
        int[] intArray9 = ds.MaxMin1.maxMin1(intArray3, (-1));
        int[] intArray11 = ds.MaxMin1.maxMin1(intArray3, 0);
        int[] intArray13 = ds.MaxMin1.maxMin1(intArray3, 1);
        int[] intArray15 = ds.MaxMin1.maxMin1(intArray3, 1);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray17 = ds.MaxMin1.maxMin1(intArray15, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray1), "[-1]");
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[-1, -1]");
    }

    @Test
    public void test1538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1538");
        int[] intArray1 = new int[] { (byte) -1 };
        int[] intArray3 = ds.MaxMin1.maxMin1(intArray1, 0);
        int[] intArray5 = ds.MaxMin1.maxMin1(intArray3, 0);
        int[] intArray7 = ds.MaxMin1.maxMin1(intArray3, 0);
        int[] intArray9 = ds.MaxMin1.maxMin1(intArray3, 1);
        int[] intArray11 = ds.MaxMin1.maxMin1(intArray3, (int) (byte) 1);
        int[] intArray13 = ds.MaxMin1.maxMin1(intArray11, (int) (byte) -1);
        int[] intArray15 = ds.MaxMin1.maxMin1(intArray13, (int) (byte) 1);
        int[] intArray17 = ds.MaxMin1.maxMin1(intArray13, 0);
        int[] intArray19 = ds.MaxMin1.maxMin1(intArray13, (int) (byte) -1);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray21 = ds.MaxMin1.maxMin1(intArray13, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray1), "[-1]");
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray19), "[-1, -1]");
    }

    @Test
    public void test1539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1539");
        int[] intArray6 = new int[] { (byte) 10, '#', (short) 1, (short) -1, (short) 1, '4' };
        int[] intArray8 = ds.MaxMin1.maxMin1(intArray6, (int) (byte) 1);
        int[] intArray10 = ds.MaxMin1.maxMin1(intArray6, (int) (byte) -1);
        int[] intArray12 = ds.MaxMin1.maxMin1(intArray10, (int) (short) -1);
        int[] intArray14 = ds.MaxMin1.maxMin1(intArray10, (int) (short) 0);
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[10, 35, 1, -1, 1, 52]");
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[10, 10]");
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[10, 10]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[10, 10]");
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[10, 10]");
    }

    @Test
    public void test1540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1540");
        int[] intArray1 = new int[] { (byte) -1 };
        int[] intArray3 = ds.MaxMin1.maxMin1(intArray1, 0);
        int[] intArray5 = ds.MaxMin1.maxMin1(intArray1, (int) (short) 1);
        int[] intArray7 = ds.MaxMin1.maxMin1(intArray1, (-1));
        int[] intArray9 = ds.MaxMin1.maxMin1(intArray7, (int) (short) -1);
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray1), "[-1]");
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[-1, -1]");
    }

    @Test
    public void test1541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1541");
        int[] intArray1 = new int[] { (byte) -1 };
        int[] intArray3 = ds.MaxMin1.maxMin1(intArray1, 0);
        int[] intArray5 = ds.MaxMin1.maxMin1(intArray3, 0);
        int[] intArray7 = ds.MaxMin1.maxMin1(intArray3, 0);
        int[] intArray9 = ds.MaxMin1.maxMin1(intArray3, 1);
        int[] intArray11 = ds.MaxMin1.maxMin1(intArray9, (int) (short) -1);
        int[] intArray13 = ds.MaxMin1.maxMin1(intArray11, (int) (short) 1);
        int[] intArray15 = ds.MaxMin1.maxMin1(intArray13, (int) (short) 0);
        int[] intArray17 = ds.MaxMin1.maxMin1(intArray13, (int) (short) 1);
        int[] intArray19 = ds.MaxMin1.maxMin1(intArray17, 0);
        int[] intArray21 = ds.MaxMin1.maxMin1(intArray17, 0);
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray1), "[-1]");
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray19), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray21), "[-1, -1]");
    }

    @Test
    public void test1542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1542");
        int[] intArray2 = new int[] { (byte) 1, (byte) -1 };
        int[] intArray4 = ds.MaxMin1.maxMin1(intArray2, (int) (short) -1);
        int[] intArray6 = ds.MaxMin1.maxMin1(intArray4, (int) (short) -1);
        int[] intArray8 = ds.MaxMin1.maxMin1(intArray4, (int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray10 = ds.MaxMin1.maxMin1(intArray8, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[1, -1]");
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[1, 1]");
    }

    @Test
    public void test1543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1543");
        int[] intArray1 = new int[] { (byte) -1 };
        int[] intArray3 = ds.MaxMin1.maxMin1(intArray1, 0);
        int[] intArray5 = ds.MaxMin1.maxMin1(intArray3, 0);
        int[] intArray7 = ds.MaxMin1.maxMin1(intArray5, (int) (byte) -1);
        int[] intArray9 = ds.MaxMin1.maxMin1(intArray7, 1);
        int[] intArray11 = ds.MaxMin1.maxMin1(intArray7, (-1));
        int[] intArray13 = ds.MaxMin1.maxMin1(intArray7, (-1));
        int[] intArray15 = ds.MaxMin1.maxMin1(intArray7, (int) (byte) -1);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray17 = ds.MaxMin1.maxMin1(intArray7, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray1), "[-1]");
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[-1, -1]");
    }

    @Test
    public void test1544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1544");
        int[] intArray1 = new int[] { (byte) -1 };
        int[] intArray3 = ds.MaxMin1.maxMin1(intArray1, 0);
        int[] intArray5 = ds.MaxMin1.maxMin1(intArray3, 0);
        int[] intArray7 = ds.MaxMin1.maxMin1(intArray5, (int) (byte) 1);
        int[] intArray9 = ds.MaxMin1.maxMin1(intArray7, (int) (short) 1);
        int[] intArray11 = ds.MaxMin1.maxMin1(intArray9, 0);
        int[] intArray13 = ds.MaxMin1.maxMin1(intArray9, 0);
        int[] intArray15 = ds.MaxMin1.maxMin1(intArray13, (int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray17 = ds.MaxMin1.maxMin1(intArray13, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray1), "[-1]");
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[-1, -1]");
    }

    @Test
    public void test1545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1545");
        int[] intArray1 = new int[] { (byte) -1 };
        int[] intArray3 = ds.MaxMin1.maxMin1(intArray1, 0);
        int[] intArray5 = ds.MaxMin1.maxMin1(intArray3, 0);
        int[] intArray7 = ds.MaxMin1.maxMin1(intArray5, (int) (byte) -1);
        int[] intArray9 = ds.MaxMin1.maxMin1(intArray7, 1);
        int[] intArray11 = ds.MaxMin1.maxMin1(intArray9, 1);
        int[] intArray13 = ds.MaxMin1.maxMin1(intArray9, (-1));
        int[] intArray15 = ds.MaxMin1.maxMin1(intArray13, (int) (byte) 1);
        int[] intArray17 = ds.MaxMin1.maxMin1(intArray15, (int) (byte) 1);
        int[] intArray19 = ds.MaxMin1.maxMin1(intArray15, (int) (byte) -1);
        java.lang.Class<?> wildcardClass20 = intArray19.getClass();
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray1), "[-1]");
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray19), "[-1, -1]");
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test1546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1546");
        int[] intArray5 = new int[] { (short) 1, 0, (byte) 10, (-1), 0 };
        int[] intArray7 = ds.MaxMin1.maxMin1(intArray5, (-1));
        int[] intArray9 = ds.MaxMin1.maxMin1(intArray5, (int) (short) -1);
        int[] intArray11 = ds.MaxMin1.maxMin1(intArray5, (int) (byte) 1);
        java.lang.Class<?> wildcardClass12 = intArray11.getClass();
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[1, 0, 10, -1, 0]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[1, 1]");
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test1547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1547");
        int[] intArray1 = new int[] { (byte) -1 };
        int[] intArray3 = ds.MaxMin1.maxMin1(intArray1, 0);
        int[] intArray5 = ds.MaxMin1.maxMin1(intArray3, 0);
        int[] intArray7 = ds.MaxMin1.maxMin1(intArray5, (int) (byte) -1);
        int[] intArray9 = ds.MaxMin1.maxMin1(intArray5, 1);
        int[] intArray11 = ds.MaxMin1.maxMin1(intArray9, (int) (byte) -1);
        int[] intArray13 = ds.MaxMin1.maxMin1(intArray9, 0);
        int[] intArray15 = ds.MaxMin1.maxMin1(intArray13, (int) (byte) 1);
        int[] intArray17 = ds.MaxMin1.maxMin1(intArray15, (-1));
        int[] intArray19 = ds.MaxMin1.maxMin1(intArray15, (int) (byte) -1);
        int[] intArray21 = ds.MaxMin1.maxMin1(intArray19, (int) (short) 1);
        int[] intArray23 = ds.MaxMin1.maxMin1(intArray19, (-1));
        int[] intArray25 = ds.MaxMin1.maxMin1(intArray19, (int) (short) 1);
        int[] intArray27 = ds.MaxMin1.maxMin1(intArray19, (int) (short) 1);
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray1), "[-1]");
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray19), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray21), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray23), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray25), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray27), "[-1, -1]");
    }

    @Test
    public void test1548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1548");
        int[] intArray5 = new int[] { (short) 1, 0, (byte) 10, (-1), 0 };
        int[] intArray7 = ds.MaxMin1.maxMin1(intArray5, (-1));
        int[] intArray9 = ds.MaxMin1.maxMin1(intArray5, (int) (short) -1);
        int[] intArray11 = ds.MaxMin1.maxMin1(intArray9, 0);
        int[] intArray13 = ds.MaxMin1.maxMin1(intArray9, (int) (short) 1);
        java.lang.Class<?> wildcardClass14 = intArray9.getClass();
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[1, 0, 10, -1, 0]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[1, 1]");
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test1549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1549");
        int[] intArray1 = new int[] { (byte) -1 };
        int[] intArray3 = ds.MaxMin1.maxMin1(intArray1, 0);
        int[] intArray5 = ds.MaxMin1.maxMin1(intArray3, 0);
        int[] intArray7 = ds.MaxMin1.maxMin1(intArray5, (int) (byte) 1);
        int[] intArray9 = ds.MaxMin1.maxMin1(intArray7, (int) (short) 1);
        int[] intArray11 = ds.MaxMin1.maxMin1(intArray9, (int) (byte) 0);
        int[] intArray13 = ds.MaxMin1.maxMin1(intArray9, 0);
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray1), "[-1]");
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[-1, -1]");
    }

    @Test
    public void test1550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1550");
        int[] intArray1 = new int[] { (byte) -1 };
        int[] intArray3 = ds.MaxMin1.maxMin1(intArray1, 0);
        int[] intArray5 = ds.MaxMin1.maxMin1(intArray3, 0);
        int[] intArray7 = ds.MaxMin1.maxMin1(intArray3, 0);
        int[] intArray9 = ds.MaxMin1.maxMin1(intArray3, (int) (byte) -1);
        int[] intArray11 = ds.MaxMin1.maxMin1(intArray3, 1);
        int[] intArray13 = ds.MaxMin1.maxMin1(intArray3, 1);
        int[] intArray15 = ds.MaxMin1.maxMin1(intArray3, (int) (byte) -1);
        int[] intArray17 = ds.MaxMin1.maxMin1(intArray3, 0);
        int[] intArray19 = ds.MaxMin1.maxMin1(intArray3, 0);
        int[] intArray21 = ds.MaxMin1.maxMin1(intArray3, 1);
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray1), "[-1]");
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray19), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray21), "[-1, -1]");
    }

    @Test
    public void test1551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1551");
        int[] intArray5 = new int[] { (short) 1, 0, (byte) 10, (-1), 0 };
        int[] intArray7 = ds.MaxMin1.maxMin1(intArray5, (-1));
        int[] intArray9 = ds.MaxMin1.maxMin1(intArray7, (int) (byte) -1);
        int[] intArray11 = ds.MaxMin1.maxMin1(intArray9, (int) (byte) 1);
        int[] intArray13 = ds.MaxMin1.maxMin1(intArray9, (int) (short) 1);
        int[] intArray15 = ds.MaxMin1.maxMin1(intArray13, (int) (short) -1);
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[1, 0, 10, -1, 0]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[1, 1]");
    }

    @Test
    public void test1552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1552");
        int[] intArray1 = new int[] { (byte) -1 };
        int[] intArray3 = ds.MaxMin1.maxMin1(intArray1, 0);
        int[] intArray5 = ds.MaxMin1.maxMin1(intArray3, 0);
        int[] intArray7 = ds.MaxMin1.maxMin1(intArray5, (int) (byte) -1);
        int[] intArray9 = ds.MaxMin1.maxMin1(intArray5, 1);
        int[] intArray11 = ds.MaxMin1.maxMin1(intArray5, (int) (short) 1);
        int[] intArray13 = ds.MaxMin1.maxMin1(intArray11, (int) (short) -1);
        int[] intArray15 = ds.MaxMin1.maxMin1(intArray13, (int) (byte) 1);
        int[] intArray17 = ds.MaxMin1.maxMin1(intArray15, (int) (short) 0);
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray1), "[-1]");
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[-1, -1]");
    }

    @Test
    public void test1553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1553");
        int[] intArray1 = new int[] { (byte) -1 };
        int[] intArray3 = ds.MaxMin1.maxMin1(intArray1, 0);
        int[] intArray5 = ds.MaxMin1.maxMin1(intArray3, 0);
        int[] intArray7 = ds.MaxMin1.maxMin1(intArray5, (int) (byte) 1);
        int[] intArray9 = ds.MaxMin1.maxMin1(intArray7, (int) (short) 1);
        int[] intArray11 = ds.MaxMin1.maxMin1(intArray9, (int) (byte) -1);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray13 = ds.MaxMin1.maxMin1(intArray9, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray1), "[-1]");
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[-1, -1]");
    }

    @Test
    public void test1554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1554");
        int[] intArray5 = new int[] { (short) 1, 0, (byte) 10, (-1), 0 };
        int[] intArray7 = ds.MaxMin1.maxMin1(intArray5, (-1));
        int[] intArray9 = ds.MaxMin1.maxMin1(intArray7, (int) (byte) -1);
        int[] intArray11 = ds.MaxMin1.maxMin1(intArray7, (int) (byte) 1);
        int[] intArray13 = ds.MaxMin1.maxMin1(intArray7, (-1));
        int[] intArray15 = ds.MaxMin1.maxMin1(intArray7, (int) (short) 0);
        int[] intArray17 = ds.MaxMin1.maxMin1(intArray7, (int) (short) 1);
        java.lang.Class<?> wildcardClass18 = intArray7.getClass();
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[1, 0, 10, -1, 0]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[1, 1]");
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test1555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1555");
        int[] intArray5 = new int[] { (short) 1, 0, (byte) 10, (-1), 0 };
        int[] intArray7 = ds.MaxMin1.maxMin1(intArray5, (-1));
        int[] intArray9 = ds.MaxMin1.maxMin1(intArray7, (int) (byte) -1);
        int[] intArray11 = ds.MaxMin1.maxMin1(intArray9, (int) (byte) 1);
        int[] intArray13 = ds.MaxMin1.maxMin1(intArray9, (int) (byte) 0);
        int[] intArray15 = ds.MaxMin1.maxMin1(intArray9, (int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray17 = ds.MaxMin1.maxMin1(intArray15, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[1, 0, 10, -1, 0]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[1, 1]");
    }

    @Test
    public void test1556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1556");
        int[] intArray1 = new int[] { (byte) -1 };
        int[] intArray3 = ds.MaxMin1.maxMin1(intArray1, 0);
        int[] intArray5 = ds.MaxMin1.maxMin1(intArray3, (int) (short) 0);
        int[] intArray7 = ds.MaxMin1.maxMin1(intArray5, 0);
        int[] intArray9 = ds.MaxMin1.maxMin1(intArray5, (int) (short) 1);
        int[] intArray11 = ds.MaxMin1.maxMin1(intArray5, (int) (byte) -1);
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray1), "[-1]");
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[-1, -1]");
    }

    @Test
    public void test1557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1557");
        int[] intArray1 = new int[] { (byte) -1 };
        int[] intArray3 = ds.MaxMin1.maxMin1(intArray1, 0);
        int[] intArray5 = ds.MaxMin1.maxMin1(intArray3, 0);
        int[] intArray7 = ds.MaxMin1.maxMin1(intArray5, (int) (byte) -1);
        int[] intArray9 = ds.MaxMin1.maxMin1(intArray5, 1);
        int[] intArray11 = ds.MaxMin1.maxMin1(intArray9, (int) (byte) -1);
        int[] intArray13 = ds.MaxMin1.maxMin1(intArray9, 0);
        int[] intArray15 = ds.MaxMin1.maxMin1(intArray13, (int) (byte) 1);
        int[] intArray17 = ds.MaxMin1.maxMin1(intArray15, (int) (short) -1);
        int[] intArray19 = ds.MaxMin1.maxMin1(intArray15, 0);
        int[] intArray21 = ds.MaxMin1.maxMin1(intArray15, (int) (short) -1);
        int[] intArray23 = ds.MaxMin1.maxMin1(intArray21, (int) (short) -1);
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray1), "[-1]");
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray19), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray21), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray23), "[-1, -1]");
    }

    @Test
    public void test1558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1558");
        int[] intArray3 = new int[] { 0, (-1), (short) 1 };
        int[] intArray5 = ds.MaxMin1.maxMin1(intArray3, (int) (byte) 0);
        int[] intArray7 = ds.MaxMin1.maxMin1(intArray5, (int) (short) 1);
        int[] intArray9 = ds.MaxMin1.maxMin1(intArray5, 1);
        int[] intArray11 = ds.MaxMin1.maxMin1(intArray5, (int) (short) 1);
        int[] intArray13 = ds.MaxMin1.maxMin1(intArray11, (int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray15 = ds.MaxMin1.maxMin1(intArray11, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[0, -1, 1]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[0, 0]");
    }

    @Test
    public void test1559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1559");
        int[] intArray1 = new int[] { (byte) -1 };
        int[] intArray3 = ds.MaxMin1.maxMin1(intArray1, 0);
        int[] intArray5 = ds.MaxMin1.maxMin1(intArray3, 0);
        int[] intArray7 = ds.MaxMin1.maxMin1(intArray3, 0);
        int[] intArray9 = ds.MaxMin1.maxMin1(intArray3, 1);
        int[] intArray11 = ds.MaxMin1.maxMin1(intArray3, 0);
        int[] intArray13 = ds.MaxMin1.maxMin1(intArray3, 0);
        int[] intArray15 = ds.MaxMin1.maxMin1(intArray3, 0);
        int[] intArray17 = ds.MaxMin1.maxMin1(intArray3, (int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray19 = ds.MaxMin1.maxMin1(intArray17, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray1), "[-1]");
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[-1, -1]");
    }

    @Test
    public void test1560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1560");
        int[] intArray1 = new int[] { (byte) -1 };
        int[] intArray3 = ds.MaxMin1.maxMin1(intArray1, 0);
        int[] intArray5 = ds.MaxMin1.maxMin1(intArray3, 0);
        int[] intArray7 = ds.MaxMin1.maxMin1(intArray3, 0);
        int[] intArray9 = ds.MaxMin1.maxMin1(intArray7, (int) (short) -1);
        int[] intArray11 = ds.MaxMin1.maxMin1(intArray9, (int) (byte) 0);
        int[] intArray13 = ds.MaxMin1.maxMin1(intArray9, 0);
        int[] intArray15 = ds.MaxMin1.maxMin1(intArray9, 0);
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray1), "[-1]");
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[-1, -1]");
    }

    @Test
    public void test1561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1561");
        int[] intArray1 = new int[] { (byte) -1 };
        int[] intArray3 = ds.MaxMin1.maxMin1(intArray1, 0);
        int[] intArray5 = ds.MaxMin1.maxMin1(intArray3, 0);
        int[] intArray7 = ds.MaxMin1.maxMin1(intArray3, 0);
        int[] intArray9 = ds.MaxMin1.maxMin1(intArray3, 1);
        int[] intArray11 = ds.MaxMin1.maxMin1(intArray9, (int) (short) -1);
        int[] intArray13 = ds.MaxMin1.maxMin1(intArray11, (int) (short) 1);
        int[] intArray15 = ds.MaxMin1.maxMin1(intArray11, 1);
        int[] intArray17 = ds.MaxMin1.maxMin1(intArray15, 1);
        int[] intArray19 = ds.MaxMin1.maxMin1(intArray15, (int) (short) 0);
        int[] intArray21 = ds.MaxMin1.maxMin1(intArray19, (int) (short) 0);
        java.lang.Class<?> wildcardClass22 = intArray19.getClass();
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray1), "[-1]");
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray19), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray21), "[-1, -1]");
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test1562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1562");
        int[] intArray1 = new int[] { (byte) -1 };
        int[] intArray3 = ds.MaxMin1.maxMin1(intArray1, 0);
        int[] intArray5 = ds.MaxMin1.maxMin1(intArray3, 0);
        int[] intArray7 = ds.MaxMin1.maxMin1(intArray5, (int) (byte) -1);
        int[] intArray9 = ds.MaxMin1.maxMin1(intArray5, 1);
        int[] intArray11 = ds.MaxMin1.maxMin1(intArray9, (int) (byte) -1);
        int[] intArray13 = ds.MaxMin1.maxMin1(intArray9, (int) (byte) 0);
        int[] intArray15 = ds.MaxMin1.maxMin1(intArray13, (int) (byte) 1);
        int[] intArray17 = ds.MaxMin1.maxMin1(intArray13, 0);
        int[] intArray19 = ds.MaxMin1.maxMin1(intArray17, 0);
        int[] intArray21 = ds.MaxMin1.maxMin1(intArray19, (int) (short) 0);
        int[] intArray23 = ds.MaxMin1.maxMin1(intArray19, 1);
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray1), "[-1]");
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray19), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray21), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray23), "[-1, -1]");
    }

    @Test
    public void test1563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1563");
        int[] intArray1 = new int[] { (byte) -1 };
        int[] intArray3 = ds.MaxMin1.maxMin1(intArray1, 0);
        int[] intArray5 = ds.MaxMin1.maxMin1(intArray3, 0);
        int[] intArray7 = ds.MaxMin1.maxMin1(intArray5, (int) (byte) -1);
        int[] intArray9 = ds.MaxMin1.maxMin1(intArray5, 1);
        int[] intArray11 = ds.MaxMin1.maxMin1(intArray9, (int) (byte) -1);
        int[] intArray13 = ds.MaxMin1.maxMin1(intArray9, (int) (byte) 0);
        int[] intArray15 = ds.MaxMin1.maxMin1(intArray13, (int) (short) 0);
        int[] intArray17 = ds.MaxMin1.maxMin1(intArray13, (int) (byte) 0);
        int[] intArray19 = ds.MaxMin1.maxMin1(intArray13, (-1));
        int[] intArray21 = ds.MaxMin1.maxMin1(intArray19, (int) (short) -1);
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray1), "[-1]");
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray19), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray21), "[-1, -1]");
    }

    @Test
    public void test1564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1564");
        int[] intArray1 = new int[] { (byte) -1 };
        int[] intArray3 = ds.MaxMin1.maxMin1(intArray1, 0);
        int[] intArray5 = ds.MaxMin1.maxMin1(intArray3, 0);
        int[] intArray7 = ds.MaxMin1.maxMin1(intArray5, (int) (byte) -1);
        int[] intArray9 = ds.MaxMin1.maxMin1(intArray7, 1);
        int[] intArray11 = ds.MaxMin1.maxMin1(intArray7, (-1));
        int[] intArray13 = ds.MaxMin1.maxMin1(intArray7, 0);
        int[] intArray15 = ds.MaxMin1.maxMin1(intArray13, 0);
        int[] intArray17 = ds.MaxMin1.maxMin1(intArray13, 0);
        int[] intArray19 = ds.MaxMin1.maxMin1(intArray17, (int) (short) 1);
        java.lang.Class<?> wildcardClass20 = intArray19.getClass();
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray1), "[-1]");
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray19), "[-1, -1]");
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test1565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1565");
        int[] intArray1 = new int[] { (byte) -1 };
        int[] intArray3 = ds.MaxMin1.maxMin1(intArray1, 0);
        int[] intArray5 = ds.MaxMin1.maxMin1(intArray3, 0);
        int[] intArray7 = ds.MaxMin1.maxMin1(intArray5, (int) (byte) -1);
        int[] intArray9 = ds.MaxMin1.maxMin1(intArray7, 1);
        int[] intArray11 = ds.MaxMin1.maxMin1(intArray7, (-1));
        int[] intArray13 = ds.MaxMin1.maxMin1(intArray7, 0);
        int[] intArray15 = ds.MaxMin1.maxMin1(intArray13, (int) (byte) 1);
        int[] intArray17 = ds.MaxMin1.maxMin1(intArray15, 1);
        int[] intArray19 = ds.MaxMin1.maxMin1(intArray17, (int) (short) -1);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray21 = ds.MaxMin1.maxMin1(intArray19, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray1), "[-1]");
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray19), "[-1, -1]");
    }

    @Test
    public void test1566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1566");
        int[] intArray1 = new int[] { (byte) -1 };
        int[] intArray3 = ds.MaxMin1.maxMin1(intArray1, 0);
        int[] intArray5 = ds.MaxMin1.maxMin1(intArray3, (-1));
        int[] intArray7 = ds.MaxMin1.maxMin1(intArray5, (int) (short) 0);
        int[] intArray9 = ds.MaxMin1.maxMin1(intArray7, 0);
        java.lang.Class<?> wildcardClass10 = intArray9.getClass();
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray1), "[-1]");
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[-1, -1]");
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test1567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1567");
        int[] intArray1 = new int[] { (byte) -1 };
        int[] intArray3 = ds.MaxMin1.maxMin1(intArray1, 0);
        int[] intArray5 = ds.MaxMin1.maxMin1(intArray3, 0);
        int[] intArray7 = ds.MaxMin1.maxMin1(intArray3, (int) (short) 1);
        int[] intArray9 = ds.MaxMin1.maxMin1(intArray7, (-1));
        int[] intArray11 = ds.MaxMin1.maxMin1(intArray7, (int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray13 = ds.MaxMin1.maxMin1(intArray7, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray1), "[-1]");
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[-1, -1]");
    }

    @Test
    public void test1568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1568");
        int[] intArray1 = new int[] { (byte) -1 };
        int[] intArray3 = ds.MaxMin1.maxMin1(intArray1, 0);
        int[] intArray5 = ds.MaxMin1.maxMin1(intArray3, 0);
        int[] intArray7 = ds.MaxMin1.maxMin1(intArray5, (int) (byte) -1);
        int[] intArray9 = ds.MaxMin1.maxMin1(intArray5, 1);
        int[] intArray11 = ds.MaxMin1.maxMin1(intArray5, (int) (short) 1);
        int[] intArray13 = ds.MaxMin1.maxMin1(intArray11, 1);
        int[] intArray15 = ds.MaxMin1.maxMin1(intArray11, (int) (short) 0);
        int[] intArray17 = ds.MaxMin1.maxMin1(intArray15, (int) (byte) 0);
        java.lang.Class<?> wildcardClass18 = intArray15.getClass();
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray1), "[-1]");
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[-1, -1]");
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test1569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1569");
        int[] intArray1 = new int[] { (byte) -1 };
        int[] intArray3 = ds.MaxMin1.maxMin1(intArray1, 0);
        int[] intArray5 = ds.MaxMin1.maxMin1(intArray3, 0);
        int[] intArray7 = ds.MaxMin1.maxMin1(intArray5, (int) (byte) -1);
        int[] intArray9 = ds.MaxMin1.maxMin1(intArray5, 1);
        int[] intArray11 = ds.MaxMin1.maxMin1(intArray9, (int) (byte) -1);
        int[] intArray13 = ds.MaxMin1.maxMin1(intArray9, (int) (byte) 0);
        int[] intArray15 = ds.MaxMin1.maxMin1(intArray13, (int) (short) 0);
        int[] intArray17 = ds.MaxMin1.maxMin1(intArray13, (int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray19 = ds.MaxMin1.maxMin1(intArray17, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray1), "[-1]");
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[-1, -1]");
    }

    @Test
    public void test1570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1570");
        int[] intArray1 = new int[] { (byte) -1 };
        int[] intArray3 = ds.MaxMin1.maxMin1(intArray1, 0);
        int[] intArray5 = ds.MaxMin1.maxMin1(intArray3, 0);
        int[] intArray7 = ds.MaxMin1.maxMin1(intArray5, (int) (byte) 1);
        int[] intArray9 = ds.MaxMin1.maxMin1(intArray7, (int) (short) 1);
        int[] intArray11 = ds.MaxMin1.maxMin1(intArray7, (int) (short) -1);
        int[] intArray13 = ds.MaxMin1.maxMin1(intArray7, 0);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray15 = ds.MaxMin1.maxMin1(intArray7, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray1), "[-1]");
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[-1, -1]");
    }

    @Test
    public void test1571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1571");
        int[] intArray5 = new int[] { (short) 1, 0, (byte) 10, (-1), 0 };
        int[] intArray7 = ds.MaxMin1.maxMin1(intArray5, (-1));
        int[] intArray9 = ds.MaxMin1.maxMin1(intArray7, (int) (byte) -1);
        int[] intArray11 = ds.MaxMin1.maxMin1(intArray7, (int) (byte) 1);
        int[] intArray13 = ds.MaxMin1.maxMin1(intArray11, (int) (byte) 0);
        int[] intArray15 = ds.MaxMin1.maxMin1(intArray11, (-1));
        int[] intArray17 = ds.MaxMin1.maxMin1(intArray11, (-1));
        int[] intArray19 = ds.MaxMin1.maxMin1(intArray17, (int) (byte) -1);
        int[] intArray21 = ds.MaxMin1.maxMin1(intArray17, (int) (short) -1);
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[1, 0, 10, -1, 0]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray19), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray21), "[1, 1]");
    }

    @Test
    public void test1572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1572");
        int[] intArray1 = new int[] { (byte) -1 };
        int[] intArray3 = ds.MaxMin1.maxMin1(intArray1, 0);
        int[] intArray5 = ds.MaxMin1.maxMin1(intArray3, 0);
        int[] intArray7 = ds.MaxMin1.maxMin1(intArray5, (int) (byte) -1);
        int[] intArray9 = ds.MaxMin1.maxMin1(intArray7, 1);
        int[] intArray11 = ds.MaxMin1.maxMin1(intArray9, 1);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray13 = ds.MaxMin1.maxMin1(intArray11, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray1), "[-1]");
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[-1, -1]");
    }

    @Test
    public void test1573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1573");
        int[] intArray1 = new int[] { (byte) -1 };
        int[] intArray3 = ds.MaxMin1.maxMin1(intArray1, 0);
        int[] intArray5 = ds.MaxMin1.maxMin1(intArray3, (-1));
        int[] intArray7 = ds.MaxMin1.maxMin1(intArray5, (int) (short) 0);
        int[] intArray9 = ds.MaxMin1.maxMin1(intArray7, 0);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray11 = ds.MaxMin1.maxMin1(intArray7, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray1), "[-1]");
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[-1, -1]");
    }

    @Test
    public void test1574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1574");
        int[] intArray1 = new int[] { (byte) -1 };
        int[] intArray3 = ds.MaxMin1.maxMin1(intArray1, 0);
        int[] intArray5 = ds.MaxMin1.maxMin1(intArray3, 0);
        int[] intArray7 = ds.MaxMin1.maxMin1(intArray5, (int) (byte) -1);
        int[] intArray9 = ds.MaxMin1.maxMin1(intArray5, 1);
        int[] intArray11 = ds.MaxMin1.maxMin1(intArray9, (int) (byte) -1);
        int[] intArray13 = ds.MaxMin1.maxMin1(intArray9, 0);
        int[] intArray15 = ds.MaxMin1.maxMin1(intArray9, (-1));
        int[] intArray17 = ds.MaxMin1.maxMin1(intArray9, (int) (byte) 0);
        int[] intArray19 = ds.MaxMin1.maxMin1(intArray17, (int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray21 = ds.MaxMin1.maxMin1(intArray19, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray1), "[-1]");
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray19), "[-1, -1]");
    }

    @Test
    public void test1575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1575");
        int[] intArray6 = new int[] { (byte) 10, '#', (short) 1, (short) -1, (short) 1, '4' };
        int[] intArray8 = ds.MaxMin1.maxMin1(intArray6, (int) (byte) 1);
        int[] intArray10 = ds.MaxMin1.maxMin1(intArray6, 0);
        int[] intArray12 = ds.MaxMin1.maxMin1(intArray6, (int) (byte) 1);
        int[] intArray14 = ds.MaxMin1.maxMin1(intArray6, 0);
        int[] intArray16 = ds.MaxMin1.maxMin1(intArray14, (int) (short) -1);
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[10, 35, 1, -1, 1, 52]");
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[10, 10]");
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[10, 10]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[10, 10]");
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[10, 10]");
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray16), "[10, 10]");
    }

    @Test
    public void test1576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1576");
        int[] intArray1 = new int[] { (byte) -1 };
        int[] intArray3 = ds.MaxMin1.maxMin1(intArray1, 0);
        int[] intArray5 = ds.MaxMin1.maxMin1(intArray3, 0);
        int[] intArray7 = ds.MaxMin1.maxMin1(intArray5, (int) (byte) -1);
        int[] intArray9 = ds.MaxMin1.maxMin1(intArray5, 1);
        int[] intArray11 = ds.MaxMin1.maxMin1(intArray9, (int) (byte) -1);
        int[] intArray13 = ds.MaxMin1.maxMin1(intArray9, 0);
        int[] intArray15 = ds.MaxMin1.maxMin1(intArray13, (int) (byte) 1);
        int[] intArray17 = ds.MaxMin1.maxMin1(intArray15, (int) (short) -1);
        int[] intArray19 = ds.MaxMin1.maxMin1(intArray17, 1);
        int[] intArray21 = ds.MaxMin1.maxMin1(intArray19, (int) (byte) -1);
        int[] intArray23 = ds.MaxMin1.maxMin1(intArray19, (int) (short) 0);
        int[] intArray25 = ds.MaxMin1.maxMin1(intArray19, (int) (short) -1);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray27 = ds.MaxMin1.maxMin1(intArray25, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray1), "[-1]");
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray19), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray21), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray23), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray25), "[-1, -1]");
    }

    @Test
    public void test1577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1577");
        int[] intArray3 = new int[] { 0, (-1), (short) 1 };
        int[] intArray5 = ds.MaxMin1.maxMin1(intArray3, (int) (byte) 0);
        int[] intArray7 = ds.MaxMin1.maxMin1(intArray5, (int) (short) -1);
        int[] intArray9 = ds.MaxMin1.maxMin1(intArray5, (int) (short) -1);
        int[] intArray11 = ds.MaxMin1.maxMin1(intArray5, (-1));
        int[] intArray13 = ds.MaxMin1.maxMin1(intArray11, (int) (byte) 0);
        int[] intArray15 = ds.MaxMin1.maxMin1(intArray11, (int) (byte) -1);
        java.lang.Class<?> wildcardClass16 = intArray11.getClass();
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[0, -1, 1]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[0, 0]");
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test1578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1578");
        int[] intArray3 = new int[] { 0, (-1), (short) 1 };
        int[] intArray5 = ds.MaxMin1.maxMin1(intArray3, (int) (byte) 0);
        int[] intArray7 = ds.MaxMin1.maxMin1(intArray5, (int) (short) -1);
        int[] intArray9 = ds.MaxMin1.maxMin1(intArray5, (int) (short) -1);
        int[] intArray11 = ds.MaxMin1.maxMin1(intArray5, (-1));
        int[] intArray13 = ds.MaxMin1.maxMin1(intArray11, (int) (byte) 0);
        int[] intArray15 = ds.MaxMin1.maxMin1(intArray13, (int) (short) -1);
        int[] intArray17 = ds.MaxMin1.maxMin1(intArray13, (int) (byte) 1);
        int[] intArray19 = ds.MaxMin1.maxMin1(intArray17, (int) (byte) 0);
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[0, -1, 1]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray19), "[0, 0]");
    }

    @Test
    public void test1579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1579");
        int[] intArray5 = new int[] { (short) 1, 0, (byte) 10, (-1), 0 };
        int[] intArray7 = ds.MaxMin1.maxMin1(intArray5, (-1));
        int[] intArray9 = ds.MaxMin1.maxMin1(intArray7, (int) (byte) -1);
        int[] intArray11 = ds.MaxMin1.maxMin1(intArray7, (int) (short) 1);
        int[] intArray13 = ds.MaxMin1.maxMin1(intArray7, (int) (short) 0);
        int[] intArray15 = ds.MaxMin1.maxMin1(intArray7, (int) (short) -1);
        int[] intArray17 = ds.MaxMin1.maxMin1(intArray15, 0);
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[1, 0, 10, -1, 0]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[1, 1]");
    }

    @Test
    public void test1580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1580");
        int[] intArray5 = new int[] { (short) 1, 0, (byte) 10, (-1), 0 };
        int[] intArray7 = ds.MaxMin1.maxMin1(intArray5, (-1));
        int[] intArray9 = ds.MaxMin1.maxMin1(intArray5, (int) (short) -1);
        int[] intArray11 = ds.MaxMin1.maxMin1(intArray9, 0);
        int[] intArray13 = ds.MaxMin1.maxMin1(intArray9, (int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray15 = ds.MaxMin1.maxMin1(intArray9, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[1, 0, 10, -1, 0]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[1, 1]");
    }

    @Test
    public void test1581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1581");
        int[] intArray6 = new int[] { (byte) 10, '#', (short) 1, (short) -1, (short) 1, '4' };
        int[] intArray8 = ds.MaxMin1.maxMin1(intArray6, (int) (byte) 1);
        int[] intArray10 = ds.MaxMin1.maxMin1(intArray6, 0);
        int[] intArray12 = ds.MaxMin1.maxMin1(intArray6, (-1));
        int[] intArray14 = ds.MaxMin1.maxMin1(intArray12, (int) (byte) -1);
        int[] intArray16 = ds.MaxMin1.maxMin1(intArray14, (int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray18 = ds.MaxMin1.maxMin1(intArray16, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[10, 35, 1, -1, 1, 52]");
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[10, 10]");
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[10, 10]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[10, 10]");
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[10, 10]");
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray16), "[10, 10]");
    }

    @Test
    public void test1582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1582");
        int[] intArray3 = new int[] { 0, (-1), (short) 1 };
        int[] intArray5 = ds.MaxMin1.maxMin1(intArray3, (int) (byte) 0);
        int[] intArray7 = ds.MaxMin1.maxMin1(intArray5, (int) (short) -1);
        int[] intArray9 = ds.MaxMin1.maxMin1(intArray5, (int) (short) -1);
        int[] intArray11 = ds.MaxMin1.maxMin1(intArray5, (-1));
        int[] intArray13 = ds.MaxMin1.maxMin1(intArray11, (int) (byte) 0);
        int[] intArray15 = ds.MaxMin1.maxMin1(intArray11, (int) (byte) -1);
        int[] intArray17 = ds.MaxMin1.maxMin1(intArray11, 1);
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[0, -1, 1]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[0, 0]");
    }

    @Test
    public void test1583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1583");
        int[] intArray6 = new int[] { (byte) 10, '#', (short) 1, (short) -1, (short) 1, '4' };
        int[] intArray8 = ds.MaxMin1.maxMin1(intArray6, (int) (byte) 1);
        int[] intArray10 = ds.MaxMin1.maxMin1(intArray6, 0);
        int[] intArray12 = ds.MaxMin1.maxMin1(intArray6, 0);
        int[] intArray14 = ds.MaxMin1.maxMin1(intArray6, (int) (short) 1);
        int[] intArray16 = ds.MaxMin1.maxMin1(intArray6, 1);
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[10, 35, 1, -1, 1, 52]");
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[10, 10]");
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[10, 10]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[10, 10]");
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[10, 10]");
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray16), "[10, 10]");
    }

    @Test
    public void test1584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1584");
        int[] intArray6 = new int[] { (byte) 10, '#', (short) 1, (short) -1, (short) 1, '4' };
        int[] intArray8 = ds.MaxMin1.maxMin1(intArray6, (int) (byte) 1);
        int[] intArray10 = ds.MaxMin1.maxMin1(intArray6, 0);
        int[] intArray12 = ds.MaxMin1.maxMin1(intArray10, 1);
        int[] intArray14 = ds.MaxMin1.maxMin1(intArray10, (int) (byte) 0);
        int[] intArray16 = ds.MaxMin1.maxMin1(intArray14, (int) (short) 0);
        java.lang.Class<?> wildcardClass17 = intArray14.getClass();
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[10, 35, 1, -1, 1, 52]");
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[10, 10]");
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[10, 10]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[10, 10]");
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[10, 10]");
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray16), "[10, 10]");
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test1585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1585");
        int[] intArray1 = new int[] { (byte) -1 };
        int[] intArray3 = ds.MaxMin1.maxMin1(intArray1, 0);
        int[] intArray5 = ds.MaxMin1.maxMin1(intArray3, 0);
        int[] intArray7 = ds.MaxMin1.maxMin1(intArray3, 0);
        int[] intArray9 = ds.MaxMin1.maxMin1(intArray3, 1);
        int[] intArray11 = ds.MaxMin1.maxMin1(intArray3, (int) (byte) 1);
        int[] intArray13 = ds.MaxMin1.maxMin1(intArray11, (int) (byte) -1);
        int[] intArray15 = ds.MaxMin1.maxMin1(intArray13, (int) (byte) 1);
        int[] intArray17 = ds.MaxMin1.maxMin1(intArray13, 0);
        int[] intArray19 = ds.MaxMin1.maxMin1(intArray13, (int) (byte) 0);
        java.lang.Class<?> wildcardClass20 = intArray13.getClass();
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray1), "[-1]");
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray19), "[-1, -1]");
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test1586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1586");
        int[] intArray1 = new int[] { (byte) -1 };
        int[] intArray3 = ds.MaxMin1.maxMin1(intArray1, 0);
        int[] intArray5 = ds.MaxMin1.maxMin1(intArray3, 0);
        int[] intArray7 = ds.MaxMin1.maxMin1(intArray5, (int) (byte) -1);
        int[] intArray9 = ds.MaxMin1.maxMin1(intArray5, 1);
        int[] intArray11 = ds.MaxMin1.maxMin1(intArray9, (-1));
        int[] intArray13 = ds.MaxMin1.maxMin1(intArray11, (int) (byte) 0);
        int[] intArray15 = ds.MaxMin1.maxMin1(intArray13, (-1));
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray17 = ds.MaxMin1.maxMin1(intArray15, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray1), "[-1]");
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[-1, -1]");
    }

    @Test
    public void test1587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1587");
        int[] intArray1 = new int[] { (byte) -1 };
        int[] intArray3 = ds.MaxMin1.maxMin1(intArray1, 0);
        int[] intArray5 = ds.MaxMin1.maxMin1(intArray3, 0);
        int[] intArray7 = ds.MaxMin1.maxMin1(intArray3, 0);
        int[] intArray9 = ds.MaxMin1.maxMin1(intArray3, 1);
        int[] intArray11 = ds.MaxMin1.maxMin1(intArray3, 0);
        int[] intArray13 = ds.MaxMin1.maxMin1(intArray3, (int) (short) -1);
        int[] intArray15 = ds.MaxMin1.maxMin1(intArray13, (int) (short) -1);
        int[] intArray17 = ds.MaxMin1.maxMin1(intArray13, (int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray19 = ds.MaxMin1.maxMin1(intArray13, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray1), "[-1]");
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[-1, -1]");
    }

    @Test
    public void test1588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1588");
        int[] intArray1 = new int[] { (byte) -1 };
        int[] intArray3 = ds.MaxMin1.maxMin1(intArray1, 0);
        int[] intArray5 = ds.MaxMin1.maxMin1(intArray3, 0);
        int[] intArray7 = ds.MaxMin1.maxMin1(intArray3, 0);
        int[] intArray9 = ds.MaxMin1.maxMin1(intArray3, 1);
        int[] intArray11 = ds.MaxMin1.maxMin1(intArray3, (-1));
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray13 = ds.MaxMin1.maxMin1(intArray11, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray1), "[-1]");
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[-1, -1]");
    }

    @Test
    public void test1589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1589");
        int[] intArray1 = new int[] { (byte) -1 };
        int[] intArray3 = ds.MaxMin1.maxMin1(intArray1, 0);
        int[] intArray5 = ds.MaxMin1.maxMin1(intArray3, 0);
        int[] intArray7 = ds.MaxMin1.maxMin1(intArray5, (int) (byte) -1);
        int[] intArray9 = ds.MaxMin1.maxMin1(intArray5, 1);
        int[] intArray11 = ds.MaxMin1.maxMin1(intArray5, (int) (short) 1);
        int[] intArray13 = ds.MaxMin1.maxMin1(intArray11, (int) (short) -1);
        int[] intArray15 = ds.MaxMin1.maxMin1(intArray11, (int) (short) 1);
        int[] intArray17 = ds.MaxMin1.maxMin1(intArray15, (int) (short) 1);
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray1), "[-1]");
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[-1, -1]");
    }

    @Test
    public void test1590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1590");
        int[] intArray1 = new int[] { (byte) -1 };
        int[] intArray3 = ds.MaxMin1.maxMin1(intArray1, 0);
        int[] intArray5 = ds.MaxMin1.maxMin1(intArray3, 0);
        int[] intArray7 = ds.MaxMin1.maxMin1(intArray3, 0);
        int[] intArray9 = ds.MaxMin1.maxMin1(intArray3, (-1));
        int[] intArray11 = ds.MaxMin1.maxMin1(intArray9, (int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray13 = ds.MaxMin1.maxMin1(intArray11, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray1), "[-1]");
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[-1, -1]");
    }

    @Test
    public void test1591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1591");
        int[] intArray6 = new int[] { (byte) 10, '#', (short) 1, (short) -1, (short) 1, '4' };
        int[] intArray8 = ds.MaxMin1.maxMin1(intArray6, (int) (byte) 1);
        int[] intArray10 = ds.MaxMin1.maxMin1(intArray6, (int) (short) -1);
        int[] intArray12 = ds.MaxMin1.maxMin1(intArray10, (int) (short) -1);
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[10, 35, 1, -1, 1, 52]");
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[10, 10]");
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[10, 10]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[10, 10]");
    }

    @Test
    public void test1592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1592");
        int[] intArray1 = new int[] { (byte) -1 };
        int[] intArray3 = ds.MaxMin1.maxMin1(intArray1, 0);
        int[] intArray5 = ds.MaxMin1.maxMin1(intArray3, 0);
        int[] intArray7 = ds.MaxMin1.maxMin1(intArray3, 0);
        int[] intArray9 = ds.MaxMin1.maxMin1(intArray3, 1);
        int[] intArray11 = ds.MaxMin1.maxMin1(intArray9, (int) (short) -1);
        int[] intArray13 = ds.MaxMin1.maxMin1(intArray11, (int) (short) 1);
        int[] intArray15 = ds.MaxMin1.maxMin1(intArray11, 1);
        int[] intArray17 = ds.MaxMin1.maxMin1(intArray15, (int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray19 = ds.MaxMin1.maxMin1(intArray17, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray1), "[-1]");
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[-1, -1]");
    }

    @Test
    public void test1593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1593");
        int[] intArray1 = new int[] { (byte) -1 };
        int[] intArray3 = ds.MaxMin1.maxMin1(intArray1, 0);
        int[] intArray5 = ds.MaxMin1.maxMin1(intArray3, 0);
        int[] intArray7 = ds.MaxMin1.maxMin1(intArray5, (int) (byte) 1);
        int[] intArray9 = ds.MaxMin1.maxMin1(intArray7, (int) (short) 1);
        int[] intArray11 = ds.MaxMin1.maxMin1(intArray9, 0);
        int[] intArray13 = ds.MaxMin1.maxMin1(intArray9, 0);
        int[] intArray15 = ds.MaxMin1.maxMin1(intArray13, (int) (byte) 1);
        int[] intArray17 = ds.MaxMin1.maxMin1(intArray15, (int) (short) 1);
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray1), "[-1]");
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[-1, -1]");
    }

    @Test
    public void test1594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1594");
        int[] intArray1 = new int[] { (byte) -1 };
        int[] intArray3 = ds.MaxMin1.maxMin1(intArray1, 0);
        int[] intArray5 = ds.MaxMin1.maxMin1(intArray3, 0);
        int[] intArray7 = ds.MaxMin1.maxMin1(intArray5, (int) (byte) -1);
        int[] intArray9 = ds.MaxMin1.maxMin1(intArray5, 1);
        int[] intArray11 = ds.MaxMin1.maxMin1(intArray9, (int) (byte) -1);
        int[] intArray13 = ds.MaxMin1.maxMin1(intArray9, 0);
        int[] intArray15 = ds.MaxMin1.maxMin1(intArray13, (int) (byte) 1);
        int[] intArray17 = ds.MaxMin1.maxMin1(intArray15, (int) (short) -1);
        int[] intArray19 = ds.MaxMin1.maxMin1(intArray17, 1);
        int[] intArray21 = ds.MaxMin1.maxMin1(intArray19, (int) (byte) -1);
        int[] intArray23 = ds.MaxMin1.maxMin1(intArray19, (int) (short) 0);
        java.lang.Class<?> wildcardClass24 = intArray19.getClass();
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray1), "[-1]");
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray19), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray21), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray23), "[-1, -1]");
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test1595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1595");
        int[] intArray3 = new int[] { 0, (-1), (short) 1 };
        int[] intArray5 = ds.MaxMin1.maxMin1(intArray3, (int) (byte) 0);
        int[] intArray7 = ds.MaxMin1.maxMin1(intArray5, (int) (short) 1);
        int[] intArray9 = ds.MaxMin1.maxMin1(intArray5, 1);
        int[] intArray11 = ds.MaxMin1.maxMin1(intArray5, (int) (short) 0);
        int[] intArray13 = ds.MaxMin1.maxMin1(intArray5, 0);
        java.lang.Class<?> wildcardClass14 = intArray13.getClass();
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[0, -1, 1]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[0, 0]");
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test1596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1596");
        int[] intArray1 = new int[] { (byte) -1 };
        int[] intArray3 = ds.MaxMin1.maxMin1(intArray1, 0);
        int[] intArray5 = ds.MaxMin1.maxMin1(intArray3, 0);
        int[] intArray7 = ds.MaxMin1.maxMin1(intArray3, 0);
        int[] intArray9 = ds.MaxMin1.maxMin1(intArray3, 1);
        int[] intArray11 = ds.MaxMin1.maxMin1(intArray3, (int) (short) -1);
        int[] intArray13 = ds.MaxMin1.maxMin1(intArray11, (int) (short) 1);
        int[] intArray15 = ds.MaxMin1.maxMin1(intArray13, (-1));
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray17 = ds.MaxMin1.maxMin1(intArray15, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray1), "[-1]");
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[-1, -1]");
    }

    @Test
    public void test1597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1597");
        int[] intArray1 = new int[] { (byte) -1 };
        int[] intArray3 = ds.MaxMin1.maxMin1(intArray1, 0);
        int[] intArray5 = ds.MaxMin1.maxMin1(intArray3, 0);
        int[] intArray7 = ds.MaxMin1.maxMin1(intArray3, 0);
        int[] intArray9 = ds.MaxMin1.maxMin1(intArray3, (int) (byte) -1);
        int[] intArray11 = ds.MaxMin1.maxMin1(intArray3, 1);
        int[] intArray13 = ds.MaxMin1.maxMin1(intArray3, 1);
        int[] intArray15 = ds.MaxMin1.maxMin1(intArray3, (int) (byte) -1);
        int[] intArray17 = ds.MaxMin1.maxMin1(intArray3, 0);
        java.lang.Class<?> wildcardClass18 = intArray17.getClass();
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray1), "[-1]");
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[-1, -1]");
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test1598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1598");
        int[] intArray2 = new int[] { (byte) 1, (byte) -1 };
        int[] intArray4 = ds.MaxMin1.maxMin1(intArray2, (int) (short) -1);
        int[] intArray6 = ds.MaxMin1.maxMin1(intArray4, (int) (short) -1);
        int[] intArray8 = ds.MaxMin1.maxMin1(intArray4, (int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray10 = ds.MaxMin1.maxMin1(intArray8, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[1, -1]");
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[1, 1]");
    }

    @Test
    public void test1599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1599");
        int[] intArray5 = new int[] { (short) 1, 0, (byte) 10, (-1), 0 };
        int[] intArray7 = ds.MaxMin1.maxMin1(intArray5, (-1));
        int[] intArray9 = ds.MaxMin1.maxMin1(intArray7, (int) (byte) -1);
        int[] intArray11 = ds.MaxMin1.maxMin1(intArray7, (int) (short) 1);
        int[] intArray13 = ds.MaxMin1.maxMin1(intArray7, (int) (short) 0);
        int[] intArray15 = ds.MaxMin1.maxMin1(intArray13, 0);
        int[] intArray17 = ds.MaxMin1.maxMin1(intArray15, (int) (byte) 0);
        int[] intArray19 = ds.MaxMin1.maxMin1(intArray15, (int) (short) -1);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray21 = ds.MaxMin1.maxMin1(intArray15, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[1, 0, 10, -1, 0]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray19), "[1, 1]");
    }

    @Test
    public void test1600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1600");
        int[] intArray1 = new int[] { (byte) -1 };
        int[] intArray3 = ds.MaxMin1.maxMin1(intArray1, 0);
        int[] intArray5 = ds.MaxMin1.maxMin1(intArray3, 0);
        int[] intArray7 = ds.MaxMin1.maxMin1(intArray5, (int) (byte) -1);
        int[] intArray9 = ds.MaxMin1.maxMin1(intArray7, 1);
        int[] intArray11 = ds.MaxMin1.maxMin1(intArray7, (-1));
        int[] intArray13 = ds.MaxMin1.maxMin1(intArray7, 0);
        int[] intArray15 = ds.MaxMin1.maxMin1(intArray13, (int) (byte) 1);
        int[] intArray17 = ds.MaxMin1.maxMin1(intArray13, (int) (byte) 1);
        int[] intArray19 = ds.MaxMin1.maxMin1(intArray13, 0);
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray1), "[-1]");
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray19), "[-1, -1]");
    }

    @Test
    public void test1601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1601");
        int[] intArray3 = new int[] { 0, (-1), (short) 1 };
        int[] intArray5 = ds.MaxMin1.maxMin1(intArray3, (int) (byte) 0);
        int[] intArray7 = ds.MaxMin1.maxMin1(intArray5, (int) (short) -1);
        int[] intArray9 = ds.MaxMin1.maxMin1(intArray5, 1);
        int[] intArray11 = ds.MaxMin1.maxMin1(intArray5, (int) (short) 0);
        int[] intArray13 = ds.MaxMin1.maxMin1(intArray11, (int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray15 = ds.MaxMin1.maxMin1(intArray13, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[0, -1, 1]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[0, 0]");
    }

    @Test
    public void test1602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1602");
        int[] intArray1 = new int[] { (byte) -1 };
        int[] intArray3 = ds.MaxMin1.maxMin1(intArray1, 0);
        int[] intArray5 = ds.MaxMin1.maxMin1(intArray3, 0);
        int[] intArray7 = ds.MaxMin1.maxMin1(intArray3, 0);
        int[] intArray9 = ds.MaxMin1.maxMin1(intArray3, 1);
        int[] intArray11 = ds.MaxMin1.maxMin1(intArray3, 0);
        int[] intArray13 = ds.MaxMin1.maxMin1(intArray3, (int) (short) -1);
        int[] intArray15 = ds.MaxMin1.maxMin1(intArray3, (int) (short) -1);
        java.lang.Class<?> wildcardClass16 = intArray3.getClass();
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray1), "[-1]");
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[-1, -1]");
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test1603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1603");
        int[] intArray1 = new int[] { (byte) -1 };
        int[] intArray3 = ds.MaxMin1.maxMin1(intArray1, 0);
        int[] intArray5 = ds.MaxMin1.maxMin1(intArray3, 0);
        int[] intArray7 = ds.MaxMin1.maxMin1(intArray5, (int) (byte) -1);
        int[] intArray9 = ds.MaxMin1.maxMin1(intArray7, 1);
        int[] intArray11 = ds.MaxMin1.maxMin1(intArray7, (-1));
        int[] intArray13 = ds.MaxMin1.maxMin1(intArray7, 0);
        int[] intArray15 = ds.MaxMin1.maxMin1(intArray13, 0);
        int[] intArray17 = ds.MaxMin1.maxMin1(intArray13, 0);
        int[] intArray19 = ds.MaxMin1.maxMin1(intArray17, (int) (short) 0);
        int[] intArray21 = ds.MaxMin1.maxMin1(intArray17, (int) (byte) 1);
        int[] intArray23 = ds.MaxMin1.maxMin1(intArray17, 1);
        int[] intArray25 = ds.MaxMin1.maxMin1(intArray23, (int) (short) 1);
        int[] intArray27 = ds.MaxMin1.maxMin1(intArray23, (int) (byte) 1);
        int[] intArray29 = ds.MaxMin1.maxMin1(intArray27, (int) (byte) 0);
        int[] intArray31 = ds.MaxMin1.maxMin1(intArray27, (-1));
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray1), "[-1]");
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray19), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray21), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray23), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray25), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray27), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray29), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray31);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray31), "[-1, -1]");
    }

    @Test
    public void test1604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1604");
        int[] intArray1 = new int[] { (byte) -1 };
        int[] intArray3 = ds.MaxMin1.maxMin1(intArray1, 0);
        int[] intArray5 = ds.MaxMin1.maxMin1(intArray3, 0);
        int[] intArray7 = ds.MaxMin1.maxMin1(intArray5, (int) (byte) -1);
        int[] intArray9 = ds.MaxMin1.maxMin1(intArray5, 0);
        int[] intArray11 = ds.MaxMin1.maxMin1(intArray9, 1);
        int[] intArray13 = ds.MaxMin1.maxMin1(intArray9, (int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray15 = ds.MaxMin1.maxMin1(intArray9, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray1), "[-1]");
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[-1, -1]");
    }

    @Test
    public void test1605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1605");
        int[] intArray1 = new int[] { (byte) -1 };
        int[] intArray3 = ds.MaxMin1.maxMin1(intArray1, 0);
        int[] intArray5 = ds.MaxMin1.maxMin1(intArray3, 0);
        int[] intArray7 = ds.MaxMin1.maxMin1(intArray5, (int) (byte) -1);
        int[] intArray9 = ds.MaxMin1.maxMin1(intArray7, 1);
        int[] intArray11 = ds.MaxMin1.maxMin1(intArray7, (-1));
        int[] intArray13 = ds.MaxMin1.maxMin1(intArray7, (-1));
        int[] intArray15 = ds.MaxMin1.maxMin1(intArray7, (int) (byte) -1);
        int[] intArray17 = ds.MaxMin1.maxMin1(intArray15, (int) (byte) -1);
        int[] intArray19 = ds.MaxMin1.maxMin1(intArray17, (int) (byte) -1);
        int[] intArray21 = ds.MaxMin1.maxMin1(intArray17, (-1));
        int[] intArray23 = ds.MaxMin1.maxMin1(intArray17, 1);
        int[] intArray25 = ds.MaxMin1.maxMin1(intArray23, (int) (short) -1);
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray1), "[-1]");
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray19), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray21), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray23), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray25), "[-1, -1]");
    }

    @Test
    public void test1606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1606");
        int[] intArray1 = new int[] { (byte) -1 };
        int[] intArray3 = ds.MaxMin1.maxMin1(intArray1, 0);
        int[] intArray5 = ds.MaxMin1.maxMin1(intArray3, 0);
        int[] intArray7 = ds.MaxMin1.maxMin1(intArray5, (int) (byte) -1);
        int[] intArray9 = ds.MaxMin1.maxMin1(intArray7, 1);
        int[] intArray11 = ds.MaxMin1.maxMin1(intArray7, (-1));
        int[] intArray13 = ds.MaxMin1.maxMin1(intArray7, 0);
        int[] intArray15 = ds.MaxMin1.maxMin1(intArray13, (int) (byte) 1);
        int[] intArray17 = ds.MaxMin1.maxMin1(intArray15, (int) (short) -1);
        int[] intArray19 = ds.MaxMin1.maxMin1(intArray15, 0);
        int[] intArray21 = ds.MaxMin1.maxMin1(intArray15, (int) (short) -1);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray23 = ds.MaxMin1.maxMin1(intArray15, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray1), "[-1]");
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray19), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray21), "[-1, -1]");
    }

    @Test
    public void test1607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1607");
        int[] intArray1 = new int[] { (byte) -1 };
        int[] intArray3 = ds.MaxMin1.maxMin1(intArray1, 0);
        int[] intArray5 = ds.MaxMin1.maxMin1(intArray3, 0);
        int[] intArray7 = ds.MaxMin1.maxMin1(intArray5, (int) (byte) -1);
        int[] intArray9 = ds.MaxMin1.maxMin1(intArray7, 1);
        int[] intArray11 = ds.MaxMin1.maxMin1(intArray7, (-1));
        int[] intArray13 = ds.MaxMin1.maxMin1(intArray7, 0);
        int[] intArray15 = ds.MaxMin1.maxMin1(intArray13, 0);
        int[] intArray17 = ds.MaxMin1.maxMin1(intArray13, 0);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray19 = ds.MaxMin1.maxMin1(intArray13, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray1), "[-1]");
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[-1, -1]");
    }

    @Test
    public void test1608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1608");
        int[] intArray1 = new int[] { (byte) -1 };
        int[] intArray3 = ds.MaxMin1.maxMin1(intArray1, 0);
        int[] intArray5 = ds.MaxMin1.maxMin1(intArray3, 0);
        int[] intArray7 = ds.MaxMin1.maxMin1(intArray5, (int) (byte) -1);
        int[] intArray9 = ds.MaxMin1.maxMin1(intArray7, 1);
        int[] intArray11 = ds.MaxMin1.maxMin1(intArray7, (-1));
        int[] intArray13 = ds.MaxMin1.maxMin1(intArray7, (-1));
        int[] intArray15 = ds.MaxMin1.maxMin1(intArray7, (int) (byte) 1);
        java.lang.Class<?> wildcardClass16 = intArray15.getClass();
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray1), "[-1]");
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[-1, -1]");
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test1609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1609");
        int[] intArray3 = new int[] { 0, (-1), (short) 1 };
        int[] intArray5 = ds.MaxMin1.maxMin1(intArray3, (int) (byte) 0);
        int[] intArray7 = ds.MaxMin1.maxMin1(intArray5, 0);
        int[] intArray9 = ds.MaxMin1.maxMin1(intArray7, (-1));
        java.lang.Class<?> wildcardClass10 = intArray7.getClass();
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[0, -1, 1]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[0, 0]");
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test1610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1610");
        int[] intArray1 = new int[] { (byte) -1 };
        int[] intArray3 = ds.MaxMin1.maxMin1(intArray1, 0);
        int[] intArray5 = ds.MaxMin1.maxMin1(intArray3, 0);
        int[] intArray7 = ds.MaxMin1.maxMin1(intArray5, (int) (byte) -1);
        int[] intArray9 = ds.MaxMin1.maxMin1(intArray7, 1);
        int[] intArray11 = ds.MaxMin1.maxMin1(intArray7, (-1));
        int[] intArray13 = ds.MaxMin1.maxMin1(intArray7, 0);
        int[] intArray15 = ds.MaxMin1.maxMin1(intArray13, (int) (byte) 1);
        int[] intArray17 = ds.MaxMin1.maxMin1(intArray15, (int) (short) -1);
        int[] intArray19 = ds.MaxMin1.maxMin1(intArray15, (int) (short) -1);
        int[] intArray21 = ds.MaxMin1.maxMin1(intArray19, (int) (byte) 1);
        java.lang.Class<?> wildcardClass22 = intArray21.getClass();
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray1), "[-1]");
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray19), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray21), "[-1, -1]");
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test1611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1611");
        int[] intArray1 = new int[] { (byte) -1 };
        int[] intArray3 = ds.MaxMin1.maxMin1(intArray1, 0);
        int[] intArray5 = ds.MaxMin1.maxMin1(intArray3, 0);
        int[] intArray7 = ds.MaxMin1.maxMin1(intArray5, (int) (byte) -1);
        int[] intArray9 = ds.MaxMin1.maxMin1(intArray7, 1);
        int[] intArray11 = ds.MaxMin1.maxMin1(intArray7, (-1));
        int[] intArray13 = ds.MaxMin1.maxMin1(intArray7, (-1));
        int[] intArray15 = ds.MaxMin1.maxMin1(intArray13, (int) (short) 0);
        java.lang.Class<?> wildcardClass16 = intArray15.getClass();
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray1), "[-1]");
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[-1, -1]");
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test1612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1612");
        int[] intArray1 = new int[] { (byte) -1 };
        int[] intArray3 = ds.MaxMin1.maxMin1(intArray1, 0);
        int[] intArray5 = ds.MaxMin1.maxMin1(intArray3, 0);
        int[] intArray7 = ds.MaxMin1.maxMin1(intArray5, (int) (byte) -1);
        int[] intArray9 = ds.MaxMin1.maxMin1(intArray5, 1);
        int[] intArray11 = ds.MaxMin1.maxMin1(intArray9, (int) (byte) -1);
        int[] intArray13 = ds.MaxMin1.maxMin1(intArray9, 0);
        int[] intArray15 = ds.MaxMin1.maxMin1(intArray9, (-1));
        int[] intArray17 = ds.MaxMin1.maxMin1(intArray9, (int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray19 = ds.MaxMin1.maxMin1(intArray17, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray1), "[-1]");
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[-1, -1]");
    }
}

