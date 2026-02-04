package ds.seed5838;

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
        int[] intArray3 = new int[] { 100, 1, 10 };
        int[] intArray5 = ds.MaxMin1.maxMin1(intArray3, 0);
        int[] intArray7 = ds.MaxMin1.maxMin1(intArray3, (int) (short) 0);
        int[] intArray9 = ds.MaxMin1.maxMin1(intArray3, (int) (byte) -1);
        int[] intArray11 = ds.MaxMin1.maxMin1(intArray3, 0);
        int[] intArray13 = ds.MaxMin1.maxMin1(intArray3, (int) (short) 0);
        int[] intArray15 = ds.MaxMin1.maxMin1(intArray3, 0);
        int[] intArray17 = ds.MaxMin1.maxMin1(intArray15, (-1));
        int[] intArray19 = ds.MaxMin1.maxMin1(intArray17, (int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray21 = ds.MaxMin1.maxMin1(intArray17, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[100, 1, 10]");
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
    public void test1502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1502");
        int[] intArray3 = new int[] { 100, 1, 10 };
        int[] intArray5 = ds.MaxMin1.maxMin1(intArray3, 0);
        int[] intArray7 = ds.MaxMin1.maxMin1(intArray5, 0);
        int[] intArray9 = ds.MaxMin1.maxMin1(intArray5, (int) (short) 0);
        int[] intArray11 = ds.MaxMin1.maxMin1(intArray9, (int) (short) 0);
        int[] intArray13 = ds.MaxMin1.maxMin1(intArray11, 1);
        int[] intArray15 = ds.MaxMin1.maxMin1(intArray11, (int) (short) 0);
        int[] intArray17 = ds.MaxMin1.maxMin1(intArray11, (int) (short) -1);
        int[] intArray19 = ds.MaxMin1.maxMin1(intArray17, (int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray21 = ds.MaxMin1.maxMin1(intArray19, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[100, 1, 10]");
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
    public void test1503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1503");
        int[] intArray3 = new int[] { 100, 1, 10 };
        int[] intArray5 = ds.MaxMin1.maxMin1(intArray3, 0);
        int[] intArray7 = ds.MaxMin1.maxMin1(intArray5, 0);
        int[] intArray9 = ds.MaxMin1.maxMin1(intArray5, (int) (short) 0);
        int[] intArray11 = ds.MaxMin1.maxMin1(intArray5, (-1));
        int[] intArray13 = ds.MaxMin1.maxMin1(intArray11, 0);
        int[] intArray15 = ds.MaxMin1.maxMin1(intArray13, (int) (short) 0);
        int[] intArray17 = ds.MaxMin1.maxMin1(intArray15, (int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray19 = ds.MaxMin1.maxMin1(intArray17, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[100, 1, 10]");
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
    public void test1504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1504");
        int[] intArray3 = new int[] { 100, 1, 10 };
        int[] intArray5 = ds.MaxMin1.maxMin1(intArray3, 0);
        int[] intArray7 = ds.MaxMin1.maxMin1(intArray5, 0);
        int[] intArray9 = ds.MaxMin1.maxMin1(intArray7, (-1));
        int[] intArray11 = ds.MaxMin1.maxMin1(intArray7, (-1));
        int[] intArray13 = ds.MaxMin1.maxMin1(intArray7, (int) (short) -1);
        int[] intArray15 = ds.MaxMin1.maxMin1(intArray13, (int) (byte) -1);
        int[] intArray17 = ds.MaxMin1.maxMin1(intArray13, (int) (byte) 1);
        int[] intArray19 = ds.MaxMin1.maxMin1(intArray13, (int) (short) -1);
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[100, 1, 10]");
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
    public void test1505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1505");
        int[] intArray3 = new int[] { 100, 1, 10 };
        int[] intArray5 = ds.MaxMin1.maxMin1(intArray3, 0);
        int[] intArray7 = ds.MaxMin1.maxMin1(intArray5, 0);
        int[] intArray9 = ds.MaxMin1.maxMin1(intArray5, (int) (short) 0);
        int[] intArray11 = ds.MaxMin1.maxMin1(intArray9, (int) (short) 0);
        int[] intArray13 = ds.MaxMin1.maxMin1(intArray11, 0);
        int[] intArray15 = ds.MaxMin1.maxMin1(intArray13, (int) (byte) -1);
        int[] intArray17 = ds.MaxMin1.maxMin1(intArray15, (int) (byte) 0);
        int[] intArray19 = ds.MaxMin1.maxMin1(intArray17, 0);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray21 = ds.MaxMin1.maxMin1(intArray17, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[100, 1, 10]");
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
    public void test1506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1506");
        int[] intArray3 = new int[] { 100, 1, 10 };
        int[] intArray5 = ds.MaxMin1.maxMin1(intArray3, 0);
        int[] intArray7 = ds.MaxMin1.maxMin1(intArray3, (int) (short) 0);
        int[] intArray9 = ds.MaxMin1.maxMin1(intArray7, (int) (short) 0);
        int[] intArray11 = ds.MaxMin1.maxMin1(intArray9, (int) (byte) 0);
        int[] intArray13 = ds.MaxMin1.maxMin1(intArray11, 1);
        int[] intArray15 = ds.MaxMin1.maxMin1(intArray11, (int) (byte) -1);
        int[] intArray17 = ds.MaxMin1.maxMin1(intArray15, (int) (short) 1);
        int[] intArray19 = ds.MaxMin1.maxMin1(intArray17, (int) (short) 0);
        int[] intArray21 = ds.MaxMin1.maxMin1(intArray19, 1);
        int[] intArray23 = ds.MaxMin1.maxMin1(intArray19, 0);
        int[] intArray25 = ds.MaxMin1.maxMin1(intArray19, (int) (byte) 1);
        java.lang.Class<?> wildcardClass26 = intArray19.getClass();
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[100, 1, 10]");
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
    public void test1507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1507");
        int[] intArray3 = new int[] { 100, 1, 10 };
        int[] intArray5 = ds.MaxMin1.maxMin1(intArray3, 0);
        int[] intArray7 = ds.MaxMin1.maxMin1(intArray3, (int) (short) 0);
        int[] intArray9 = ds.MaxMin1.maxMin1(intArray7, (int) (short) 0);
        int[] intArray11 = ds.MaxMin1.maxMin1(intArray9, (int) (byte) 0);
        int[] intArray13 = ds.MaxMin1.maxMin1(intArray11, 1);
        int[] intArray15 = ds.MaxMin1.maxMin1(intArray13, 0);
        int[] intArray17 = ds.MaxMin1.maxMin1(intArray15, 0);
        int[] intArray19 = ds.MaxMin1.maxMin1(intArray15, 1);
        int[] intArray21 = ds.MaxMin1.maxMin1(intArray19, 0);
        int[] intArray23 = ds.MaxMin1.maxMin1(intArray19, (int) (short) 1);
        int[] intArray25 = ds.MaxMin1.maxMin1(intArray23, 1);
        java.lang.Class<?> wildcardClass26 = intArray25.getClass();
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[100, 1, 10]");
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
    public void test1508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1508");
        int[] intArray4 = new int[] { (short) 10, (byte) 100, (short) 0, (short) 100 };
        int[] intArray6 = ds.MaxMin1.maxMin1(intArray4, 1);
        int[] intArray8 = ds.MaxMin1.maxMin1(intArray4, (int) (byte) -1);
        int[] intArray10 = ds.MaxMin1.maxMin1(intArray4, 0);
        int[] intArray12 = ds.MaxMin1.maxMin1(intArray4, (int) (short) -1);
        int[] intArray14 = ds.MaxMin1.maxMin1(intArray4, (int) (short) 1);
        int[] intArray16 = ds.MaxMin1.maxMin1(intArray4, 0);
        int[] intArray18 = ds.MaxMin1.maxMin1(intArray4, (int) (byte) -1);
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[10, 100, 0, 100]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[10, 10]");
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
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray18), "[10, 10]");
    }

    @Test
    public void test1509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1509");
        int[] intArray3 = new int[] { 100, 1, 10 };
        int[] intArray5 = ds.MaxMin1.maxMin1(intArray3, 0);
        int[] intArray7 = ds.MaxMin1.maxMin1(intArray5, 0);
        int[] intArray9 = ds.MaxMin1.maxMin1(intArray7, (-1));
        int[] intArray11 = ds.MaxMin1.maxMin1(intArray7, (-1));
        int[] intArray13 = ds.MaxMin1.maxMin1(intArray7, (int) (short) 1);
        int[] intArray15 = ds.MaxMin1.maxMin1(intArray13, (int) (short) 0);
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[100, 1, 10]");
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
    public void test1510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1510");
        int[] intArray3 = new int[] { 100, 1, 10 };
        int[] intArray5 = ds.MaxMin1.maxMin1(intArray3, 0);
        int[] intArray7 = ds.MaxMin1.maxMin1(intArray3, (int) (short) 0);
        int[] intArray9 = ds.MaxMin1.maxMin1(intArray7, (int) (short) 0);
        int[] intArray11 = ds.MaxMin1.maxMin1(intArray9, 1);
        int[] intArray13 = ds.MaxMin1.maxMin1(intArray9, 1);
        int[] intArray15 = ds.MaxMin1.maxMin1(intArray9, (int) (short) -1);
        java.lang.Class<?> wildcardClass16 = intArray15.getClass();
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[100, 1, 10]");
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
    public void test1511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1511");
        int[] intArray3 = new int[] { 100, 1, 10 };
        int[] intArray5 = ds.MaxMin1.maxMin1(intArray3, 0);
        int[] intArray7 = ds.MaxMin1.maxMin1(intArray5, 0);
        int[] intArray9 = ds.MaxMin1.maxMin1(intArray7, (-1));
        int[] intArray11 = ds.MaxMin1.maxMin1(intArray7, (-1));
        int[] intArray13 = ds.MaxMin1.maxMin1(intArray7, (int) (byte) 0);
        int[] intArray15 = ds.MaxMin1.maxMin1(intArray13, (int) (byte) 0);
        int[] intArray17 = ds.MaxMin1.maxMin1(intArray13, 1);
        int[] intArray19 = ds.MaxMin1.maxMin1(intArray17, (-1));
        int[] intArray21 = ds.MaxMin1.maxMin1(intArray17, (int) (byte) 0);
        int[] intArray23 = ds.MaxMin1.maxMin1(intArray17, (int) (byte) -1);
        int[] intArray25 = ds.MaxMin1.maxMin1(intArray23, (int) (byte) 0);
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[100, 1, 10]");
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
    public void test1512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1512");
        int[] intArray3 = new int[] { 100, 1, 10 };
        int[] intArray5 = ds.MaxMin1.maxMin1(intArray3, 0);
        int[] intArray7 = ds.MaxMin1.maxMin1(intArray5, 0);
        int[] intArray9 = ds.MaxMin1.maxMin1(intArray7, (-1));
        int[] intArray11 = ds.MaxMin1.maxMin1(intArray7, (int) (byte) 1);
        int[] intArray13 = ds.MaxMin1.maxMin1(intArray11, (int) (byte) -1);
        int[] intArray15 = ds.MaxMin1.maxMin1(intArray13, 0);
        java.lang.Class<?> wildcardClass16 = intArray13.getClass();
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[100, 1, 10]");
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
    public void test1513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1513");
        int[] intArray3 = new int[] { 100, 1, 10 };
        int[] intArray5 = ds.MaxMin1.maxMin1(intArray3, 0);
        int[] intArray7 = ds.MaxMin1.maxMin1(intArray5, 0);
        int[] intArray9 = ds.MaxMin1.maxMin1(intArray5, (int) (short) 0);
        int[] intArray11 = ds.MaxMin1.maxMin1(intArray5, (int) (short) 0);
        int[] intArray13 = ds.MaxMin1.maxMin1(intArray5, 1);
        int[] intArray15 = ds.MaxMin1.maxMin1(intArray13, (int) (byte) 0);
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[100, 1, 10]");
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
    public void test1514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1514");
        int[] intArray3 = new int[] { 100, 1, 10 };
        int[] intArray5 = ds.MaxMin1.maxMin1(intArray3, 0);
        int[] intArray7 = ds.MaxMin1.maxMin1(intArray5, 0);
        int[] intArray9 = ds.MaxMin1.maxMin1(intArray7, (-1));
        int[] intArray11 = ds.MaxMin1.maxMin1(intArray7, (-1));
        int[] intArray13 = ds.MaxMin1.maxMin1(intArray7, (int) (byte) 0);
        int[] intArray15 = ds.MaxMin1.maxMin1(intArray13, (int) (byte) 0);
        int[] intArray17 = ds.MaxMin1.maxMin1(intArray13, 1);
        int[] intArray19 = ds.MaxMin1.maxMin1(intArray17, (-1));
        int[] intArray21 = ds.MaxMin1.maxMin1(intArray17, (int) (byte) 0);
        int[] intArray23 = ds.MaxMin1.maxMin1(intArray17, (int) (byte) -1);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray25 = ds.MaxMin1.maxMin1(intArray23, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[100, 1, 10]");
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
    public void test1515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1515");
        int[] intArray3 = new int[] { 100, 1, 10 };
        int[] intArray5 = ds.MaxMin1.maxMin1(intArray3, 0);
        int[] intArray7 = ds.MaxMin1.maxMin1(intArray5, 0);
        int[] intArray9 = ds.MaxMin1.maxMin1(intArray7, (-1));
        int[] intArray11 = ds.MaxMin1.maxMin1(intArray7, (int) (byte) 1);
        int[] intArray13 = ds.MaxMin1.maxMin1(intArray11, (int) (byte) -1);
        int[] intArray15 = ds.MaxMin1.maxMin1(intArray13, (int) (short) 1);
        int[] intArray17 = ds.MaxMin1.maxMin1(intArray13, 0);
        int[] intArray19 = ds.MaxMin1.maxMin1(intArray17, (int) (short) 0);
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[100, 1, 10]");
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
    public void test1516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1516");
        int[] intArray2 = new int[] { 1, 10 };
        int[] intArray4 = ds.MaxMin1.maxMin1(intArray2, (int) (short) 0);
        int[] intArray6 = ds.MaxMin1.maxMin1(intArray2, (-1));
        int[] intArray8 = ds.MaxMin1.maxMin1(intArray6, 1);
        int[] intArray10 = ds.MaxMin1.maxMin1(intArray6, 0);
        int[] intArray12 = ds.MaxMin1.maxMin1(intArray10, 0);
        int[] intArray14 = ds.MaxMin1.maxMin1(intArray12, 0);
        int[] intArray16 = ds.MaxMin1.maxMin1(intArray12, (-1));
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[1, 10]");
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray16), "[1, 1]");
    }

    @Test
    public void test1517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1517");
        int[] intArray2 = new int[] { 1, 10 };
        int[] intArray4 = ds.MaxMin1.maxMin1(intArray2, (int) (short) 0);
        int[] intArray6 = ds.MaxMin1.maxMin1(intArray2, (-1));
        int[] intArray8 = ds.MaxMin1.maxMin1(intArray6, 1);
        int[] intArray10 = ds.MaxMin1.maxMin1(intArray8, 0);
        int[] intArray12 = ds.MaxMin1.maxMin1(intArray10, 0);
        int[] intArray14 = ds.MaxMin1.maxMin1(intArray12, (int) (short) -1);
        int[] intArray16 = ds.MaxMin1.maxMin1(intArray14, (-1));
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray18 = ds.MaxMin1.maxMin1(intArray14, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[1, 10]");
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray16), "[1, 1]");
    }

    @Test
    public void test1518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1518");
        int[] intArray2 = new int[] { 1, 10 };
        int[] intArray4 = ds.MaxMin1.maxMin1(intArray2, (int) (short) 0);
        int[] intArray6 = ds.MaxMin1.maxMin1(intArray4, (int) (byte) 0);
        int[] intArray8 = ds.MaxMin1.maxMin1(intArray4, (int) (short) 0);
        int[] intArray10 = ds.MaxMin1.maxMin1(intArray4, (int) (byte) -1);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray12 = ds.MaxMin1.maxMin1(intArray10, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[1, 10]");
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[1, 1]");
    }

    @Test
    public void test1519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1519");
        int[] intArray3 = new int[] { 100, 1, 10 };
        int[] intArray5 = ds.MaxMin1.maxMin1(intArray3, 0);
        int[] intArray7 = ds.MaxMin1.maxMin1(intArray5, 0);
        int[] intArray9 = ds.MaxMin1.maxMin1(intArray5, (int) (short) 0);
        int[] intArray11 = ds.MaxMin1.maxMin1(intArray5, (int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray13 = ds.MaxMin1.maxMin1(intArray11, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[100, 1, 10]");
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
    public void test1520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1520");
        int[] intArray3 = new int[] { 100, 1, 10 };
        int[] intArray5 = ds.MaxMin1.maxMin1(intArray3, 0);
        int[] intArray7 = ds.MaxMin1.maxMin1(intArray3, (int) (short) 0);
        int[] intArray9 = ds.MaxMin1.maxMin1(intArray7, (int) (short) 0);
        int[] intArray11 = ds.MaxMin1.maxMin1(intArray9, 1);
        int[] intArray13 = ds.MaxMin1.maxMin1(intArray9, (int) (byte) -1);
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[100, 1, 10]");
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
    public void test1521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1521");
        int[] intArray3 = new int[] { 100, 1, 10 };
        int[] intArray5 = ds.MaxMin1.maxMin1(intArray3, 0);
        int[] intArray7 = ds.MaxMin1.maxMin1(intArray5, 0);
        int[] intArray9 = ds.MaxMin1.maxMin1(intArray5, (int) (short) 0);
        int[] intArray11 = ds.MaxMin1.maxMin1(intArray9, (int) (short) 0);
        int[] intArray13 = ds.MaxMin1.maxMin1(intArray11, (int) (short) -1);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray15 = ds.MaxMin1.maxMin1(intArray13, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[100, 1, 10]");
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
    public void test1522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1522");
        int[] intArray2 = new int[] { 1, 10 };
        int[] intArray4 = ds.MaxMin1.maxMin1(intArray2, (int) (short) 0);
        int[] intArray6 = ds.MaxMin1.maxMin1(intArray2, (-1));
        int[] intArray8 = ds.MaxMin1.maxMin1(intArray6, 0);
        int[] intArray10 = ds.MaxMin1.maxMin1(intArray6, (int) (short) 1);
        int[] intArray12 = ds.MaxMin1.maxMin1(intArray6, (-1));
        int[] intArray14 = ds.MaxMin1.maxMin1(intArray12, 0);
        int[] intArray16 = ds.MaxMin1.maxMin1(intArray14, (int) (short) 1);
        int[] intArray18 = ds.MaxMin1.maxMin1(intArray16, (int) (short) 0);
        int[] intArray20 = ds.MaxMin1.maxMin1(intArray18, (int) (short) -1);
        java.lang.Class<?> wildcardClass21 = intArray20.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[1, 10]");
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray16), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray18), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray20), "[1, 1]");
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test1523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1523");
        int[] intArray3 = new int[] { 100, 1, 10 };
        int[] intArray5 = ds.MaxMin1.maxMin1(intArray3, 0);
        int[] intArray7 = ds.MaxMin1.maxMin1(intArray5, 0);
        int[] intArray9 = ds.MaxMin1.maxMin1(intArray7, (int) (byte) 1);
        int[] intArray11 = ds.MaxMin1.maxMin1(intArray7, (-1));
        int[] intArray13 = ds.MaxMin1.maxMin1(intArray11, (int) (short) 1);
        int[] intArray15 = ds.MaxMin1.maxMin1(intArray11, (-1));
        int[] intArray17 = ds.MaxMin1.maxMin1(intArray15, (int) (byte) 1);
        int[] intArray19 = ds.MaxMin1.maxMin1(intArray15, (int) (short) -1);
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[100, 1, 10]");
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
    public void test1524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1524");
        int[] intArray3 = new int[] { 100, 1, 10 };
        int[] intArray5 = ds.MaxMin1.maxMin1(intArray3, 0);
        int[] intArray7 = ds.MaxMin1.maxMin1(intArray3, (int) (short) 0);
        int[] intArray9 = ds.MaxMin1.maxMin1(intArray3, (int) (byte) -1);
        int[] intArray11 = ds.MaxMin1.maxMin1(intArray3, 0);
        int[] intArray13 = ds.MaxMin1.maxMin1(intArray3, (int) (short) 0);
        int[] intArray15 = ds.MaxMin1.maxMin1(intArray3, 0);
        int[] intArray17 = ds.MaxMin1.maxMin1(intArray15, (-1));
        int[] intArray19 = ds.MaxMin1.maxMin1(intArray15, (int) (byte) 0);
        int[] intArray21 = ds.MaxMin1.maxMin1(intArray19, (int) (byte) 0);
        java.lang.Class<?> wildcardClass22 = intArray19.getClass();
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[100, 1, 10]");
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
    public void test1525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1525");
        int[] intArray2 = new int[] { 1, 10 };
        int[] intArray4 = ds.MaxMin1.maxMin1(intArray2, (int) (short) 0);
        int[] intArray6 = ds.MaxMin1.maxMin1(intArray2, (-1));
        int[] intArray8 = ds.MaxMin1.maxMin1(intArray6, 0);
        int[] intArray10 = ds.MaxMin1.maxMin1(intArray6, 1);
        java.lang.Class<?> wildcardClass11 = intArray6.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[1, 10]");
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[1, 1]");
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test1526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1526");
        int[] intArray3 = new int[] { 100, 1, 10 };
        int[] intArray5 = ds.MaxMin1.maxMin1(intArray3, 0);
        int[] intArray7 = ds.MaxMin1.maxMin1(intArray3, (int) (short) 0);
        int[] intArray9 = ds.MaxMin1.maxMin1(intArray7, (int) (short) 0);
        int[] intArray11 = ds.MaxMin1.maxMin1(intArray9, (int) (byte) 0);
        int[] intArray13 = ds.MaxMin1.maxMin1(intArray11, 1);
        int[] intArray15 = ds.MaxMin1.maxMin1(intArray11, (int) (byte) -1);
        int[] intArray17 = ds.MaxMin1.maxMin1(intArray15, (int) (short) 1);
        int[] intArray19 = ds.MaxMin1.maxMin1(intArray15, 0);
        int[] intArray21 = ds.MaxMin1.maxMin1(intArray19, (int) (short) 1);
        int[] intArray23 = ds.MaxMin1.maxMin1(intArray21, (-1));
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[100, 1, 10]");
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
    public void test1527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1527");
        int[] intArray3 = new int[] { 100, 1, 10 };
        int[] intArray5 = ds.MaxMin1.maxMin1(intArray3, 0);
        int[] intArray7 = ds.MaxMin1.maxMin1(intArray5, 0);
        int[] intArray9 = ds.MaxMin1.maxMin1(intArray7, (int) (byte) 1);
        int[] intArray11 = ds.MaxMin1.maxMin1(intArray7, (-1));
        int[] intArray13 = ds.MaxMin1.maxMin1(intArray7, 0);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray15 = ds.MaxMin1.maxMin1(intArray7, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[100, 1, 10]");
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
    public void test1528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1528");
        int[] intArray3 = new int[] { 100, 1, 10 };
        int[] intArray5 = ds.MaxMin1.maxMin1(intArray3, 0);
        int[] intArray7 = ds.MaxMin1.maxMin1(intArray5, 0);
        int[] intArray9 = ds.MaxMin1.maxMin1(intArray7, (-1));
        int[] intArray11 = ds.MaxMin1.maxMin1(intArray7, (int) (byte) 1);
        int[] intArray13 = ds.MaxMin1.maxMin1(intArray11, (int) (short) 1);
        int[] intArray15 = ds.MaxMin1.maxMin1(intArray13, 1);
        int[] intArray17 = ds.MaxMin1.maxMin1(intArray13, (int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray19 = ds.MaxMin1.maxMin1(intArray17, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[100, 1, 10]");
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
    public void test1529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1529");
        int[] intArray2 = new int[] { 1, 10 };
        int[] intArray4 = ds.MaxMin1.maxMin1(intArray2, (int) (short) 0);
        int[] intArray6 = ds.MaxMin1.maxMin1(intArray4, (int) (byte) 0);
        int[] intArray8 = ds.MaxMin1.maxMin1(intArray4, (int) (short) 0);
        int[] intArray10 = ds.MaxMin1.maxMin1(intArray4, (int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray12 = ds.MaxMin1.maxMin1(intArray4, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[1, 10]");
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[1, 1]");
    }

    @Test
    public void test1530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1530");
        int[] intArray4 = new int[] { (short) 10, (byte) 100, (short) 0, (short) 100 };
        int[] intArray6 = ds.MaxMin1.maxMin1(intArray4, 1);
        int[] intArray8 = ds.MaxMin1.maxMin1(intArray4, (int) (byte) -1);
        int[] intArray10 = ds.MaxMin1.maxMin1(intArray8, (int) (byte) 1);
        int[] intArray12 = ds.MaxMin1.maxMin1(intArray10, (int) (byte) 0);
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[10, 100, 0, 100]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[10, 10]");
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[10, 10]");
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[10, 10]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[10, 10]");
    }

    @Test
    public void test1531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1531");
        int[] intArray2 = new int[] { 1, 10 };
        int[] intArray4 = ds.MaxMin1.maxMin1(intArray2, (int) (short) 0);
        int[] intArray6 = ds.MaxMin1.maxMin1(intArray2, (-1));
        int[] intArray8 = ds.MaxMin1.maxMin1(intArray6, (int) (byte) -1);
        int[] intArray10 = ds.MaxMin1.maxMin1(intArray8, 0);
        int[] intArray12 = ds.MaxMin1.maxMin1(intArray8, 0);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[1, 10]");
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[1, 1]");
    }

    @Test
    public void test1532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1532");
        int[] intArray3 = new int[] { 100, 1, 10 };
        int[] intArray5 = ds.MaxMin1.maxMin1(intArray3, 0);
        int[] intArray7 = ds.MaxMin1.maxMin1(intArray3, (int) (short) 0);
        int[] intArray9 = ds.MaxMin1.maxMin1(intArray7, (int) (short) 0);
        int[] intArray11 = ds.MaxMin1.maxMin1(intArray9, (int) (byte) 0);
        int[] intArray13 = ds.MaxMin1.maxMin1(intArray11, 1);
        int[] intArray15 = ds.MaxMin1.maxMin1(intArray13, 0);
        int[] intArray17 = ds.MaxMin1.maxMin1(intArray15, 0);
        int[] intArray19 = ds.MaxMin1.maxMin1(intArray17, (int) (short) 1);
        int[] intArray21 = ds.MaxMin1.maxMin1(intArray19, (int) (byte) 1);
        int[] intArray23 = ds.MaxMin1.maxMin1(intArray19, (int) (byte) 1);
        int[] intArray25 = ds.MaxMin1.maxMin1(intArray23, 1);
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[100, 1, 10]");
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
    public void test1533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1533");
        int[] intArray3 = new int[] { 100, 1, 10 };
        int[] intArray5 = ds.MaxMin1.maxMin1(intArray3, 0);
        int[] intArray7 = ds.MaxMin1.maxMin1(intArray5, 0);
        int[] intArray9 = ds.MaxMin1.maxMin1(intArray7, (int) (short) 0);
        int[] intArray11 = ds.MaxMin1.maxMin1(intArray7, (-1));
        int[] intArray13 = ds.MaxMin1.maxMin1(intArray11, (int) (short) -1);
        int[] intArray15 = ds.MaxMin1.maxMin1(intArray13, (int) (short) -1);
        int[] intArray17 = ds.MaxMin1.maxMin1(intArray15, 1);
        int[] intArray19 = ds.MaxMin1.maxMin1(intArray17, 0);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray21 = ds.MaxMin1.maxMin1(intArray19, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[100, 1, 10]");
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
    public void test1534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1534");
        int[] intArray3 = new int[] { 100, 1, 10 };
        int[] intArray5 = ds.MaxMin1.maxMin1(intArray3, 0);
        int[] intArray7 = ds.MaxMin1.maxMin1(intArray3, (int) (short) 0);
        int[] intArray9 = ds.MaxMin1.maxMin1(intArray7, (int) (short) 0);
        int[] intArray11 = ds.MaxMin1.maxMin1(intArray9, (int) (byte) 0);
        int[] intArray13 = ds.MaxMin1.maxMin1(intArray11, 1);
        int[] intArray15 = ds.MaxMin1.maxMin1(intArray13, 0);
        int[] intArray17 = ds.MaxMin1.maxMin1(intArray15, 0);
        int[] intArray19 = ds.MaxMin1.maxMin1(intArray15, 1);
        int[] intArray21 = ds.MaxMin1.maxMin1(intArray19, 0);
        int[] intArray23 = ds.MaxMin1.maxMin1(intArray21, 0);
        int[] intArray25 = ds.MaxMin1.maxMin1(intArray21, (int) (byte) 1);
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[100, 1, 10]");
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
    public void test1535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1535");
        int[] intArray2 = new int[] { 1, 10 };
        int[] intArray4 = ds.MaxMin1.maxMin1(intArray2, (int) (short) 0);
        int[] intArray6 = ds.MaxMin1.maxMin1(intArray2, (-1));
        int[] intArray8 = ds.MaxMin1.maxMin1(intArray2, 0);
        int[] intArray10 = ds.MaxMin1.maxMin1(intArray2, 0);
        int[] intArray12 = ds.MaxMin1.maxMin1(intArray2, (int) (short) -1);
        int[] intArray14 = ds.MaxMin1.maxMin1(intArray2, (int) (byte) 1);
        int[] intArray16 = ds.MaxMin1.maxMin1(intArray2, (int) (short) 0);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[1, 10]");
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray16), "[1, 1]");
    }

    @Test
    public void test1536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1536");
        int[] intArray3 = new int[] { 100, 1, 10 };
        int[] intArray5 = ds.MaxMin1.maxMin1(intArray3, 0);
        int[] intArray7 = ds.MaxMin1.maxMin1(intArray3, (int) (short) 0);
        int[] intArray9 = ds.MaxMin1.maxMin1(intArray7, (int) (short) 0);
        int[] intArray11 = ds.MaxMin1.maxMin1(intArray9, (int) (byte) 0);
        int[] intArray13 = ds.MaxMin1.maxMin1(intArray9, 0);
        int[] intArray15 = ds.MaxMin1.maxMin1(intArray13, (int) (byte) 0);
        int[] intArray17 = ds.MaxMin1.maxMin1(intArray15, (int) (short) -1);
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[100, 1, 10]");
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
    public void test1537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1537");
        int[] intArray2 = new int[] { 1, 10 };
        int[] intArray4 = ds.MaxMin1.maxMin1(intArray2, (int) (short) 0);
        int[] intArray6 = ds.MaxMin1.maxMin1(intArray2, (-1));
        int[] intArray8 = ds.MaxMin1.maxMin1(intArray6, 1);
        int[] intArray10 = ds.MaxMin1.maxMin1(intArray6, 0);
        int[] intArray12 = ds.MaxMin1.maxMin1(intArray10, (int) (short) 1);
        int[] intArray14 = ds.MaxMin1.maxMin1(intArray12, 1);
        int[] intArray16 = ds.MaxMin1.maxMin1(intArray12, (int) (short) 0);
        int[] intArray18 = ds.MaxMin1.maxMin1(intArray12, (int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray20 = ds.MaxMin1.maxMin1(intArray18, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[1, 10]");
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray16), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray18), "[1, 1]");
    }

    @Test
    public void test1538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1538");
        int[] intArray2 = new int[] { 1, 10 };
        int[] intArray4 = ds.MaxMin1.maxMin1(intArray2, (int) (short) 0);
        int[] intArray6 = ds.MaxMin1.maxMin1(intArray2, (-1));
        java.lang.Class<?> wildcardClass7 = intArray6.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[1, 10]");
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[1, 1]");
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test1539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1539");
        int[] intArray2 = new int[] { 1, 10 };
        int[] intArray4 = ds.MaxMin1.maxMin1(intArray2, (int) (short) 0);
        int[] intArray6 = ds.MaxMin1.maxMin1(intArray2, (-1));
        int[] intArray8 = ds.MaxMin1.maxMin1(intArray6, 1);
        int[] intArray10 = ds.MaxMin1.maxMin1(intArray6, 0);
        int[] intArray12 = ds.MaxMin1.maxMin1(intArray10, 0);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray14 = ds.MaxMin1.maxMin1(intArray12, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[1, 10]");
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[1, 1]");
    }
}

