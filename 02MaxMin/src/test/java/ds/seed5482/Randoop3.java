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
        int[] intArray3 = new int[] { 10, (byte) 0, (byte) 0 };
        int[] intArray5 = ds.MaxMin1.maxMin1(intArray3, 1);
        int[] intArray7 = ds.MaxMin1.maxMin1(intArray3, (int) (short) -1);
        int[] intArray9 = ds.MaxMin1.maxMin1(intArray7, (int) (byte) 1);
        int[] intArray11 = ds.MaxMin1.maxMin1(intArray9, 0);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray13 = ds.MaxMin1.maxMin1(intArray11, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[10, 0, 0]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[10, 10]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[10, 10]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[10, 10]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[10, 10]");
    }

    @Test
    public void test1502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1502");
        int[] intArray3 = new int[] { 10, (byte) 0, (byte) 0 };
        int[] intArray5 = ds.MaxMin1.maxMin1(intArray3, 1);
        int[] intArray7 = ds.MaxMin1.maxMin1(intArray3, 0);
        int[] intArray9 = ds.MaxMin1.maxMin1(intArray3, 0);
        int[] intArray11 = ds.MaxMin1.maxMin1(intArray3, (int) (short) -1);
        int[] intArray13 = ds.MaxMin1.maxMin1(intArray11, (-1));
        int[] intArray15 = ds.MaxMin1.maxMin1(intArray11, (-1));
        int[] intArray17 = ds.MaxMin1.maxMin1(intArray11, 1);
        int[] intArray19 = ds.MaxMin1.maxMin1(intArray11, 0);
        java.lang.Class<?> wildcardClass20 = intArray11.getClass();
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[10, 0, 0]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[10, 10]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[10, 10]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[10, 10]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[10, 10]");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[10, 10]");
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[10, 10]");
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[10, 10]");
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray19), "[10, 10]");
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test1503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1503");
        int[] intArray3 = new int[] { 10, (byte) 0, (byte) 0 };
        int[] intArray5 = ds.MaxMin1.maxMin1(intArray3, 1);
        int[] intArray7 = ds.MaxMin1.maxMin1(intArray3, (int) (short) -1);
        int[] intArray9 = ds.MaxMin1.maxMin1(intArray7, (int) (byte) 1);
        int[] intArray11 = ds.MaxMin1.maxMin1(intArray9, 1);
        int[] intArray13 = ds.MaxMin1.maxMin1(intArray9, 1);
        int[] intArray15 = ds.MaxMin1.maxMin1(intArray9, 1);
        int[] intArray17 = ds.MaxMin1.maxMin1(intArray9, 0);
        java.lang.Class<?> wildcardClass18 = intArray17.getClass();
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[10, 0, 0]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[10, 10]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[10, 10]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[10, 10]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[10, 10]");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[10, 10]");
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[10, 10]");
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[10, 10]");
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test1504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1504");
        int[] intArray3 = new int[] { 10, (byte) 0, (byte) 0 };
        int[] intArray5 = ds.MaxMin1.maxMin1(intArray3, 1);
        int[] intArray7 = ds.MaxMin1.maxMin1(intArray3, 0);
        int[] intArray9 = ds.MaxMin1.maxMin1(intArray3, 0);
        int[] intArray11 = ds.MaxMin1.maxMin1(intArray3, (int) (short) -1);
        int[] intArray13 = ds.MaxMin1.maxMin1(intArray11, (int) (byte) 0);
        int[] intArray15 = ds.MaxMin1.maxMin1(intArray11, (int) (byte) 1);
        int[] intArray17 = ds.MaxMin1.maxMin1(intArray11, (int) (short) -1);
        int[] intArray19 = ds.MaxMin1.maxMin1(intArray17, 0);
        int[] intArray21 = ds.MaxMin1.maxMin1(intArray17, (-1));
        int[] intArray23 = ds.MaxMin1.maxMin1(intArray17, (int) (short) 0);
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[10, 0, 0]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[10, 10]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[10, 10]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[10, 10]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[10, 10]");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[10, 10]");
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[10, 10]");
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[10, 10]");
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray19), "[10, 10]");
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray21), "[10, 10]");
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray23), "[10, 10]");
    }

    @Test
    public void test1505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1505");
        int[] intArray3 = new int[] { 10, (byte) 0, (byte) 0 };
        int[] intArray5 = ds.MaxMin1.maxMin1(intArray3, 1);
        int[] intArray7 = ds.MaxMin1.maxMin1(intArray3, (int) (short) -1);
        int[] intArray9 = ds.MaxMin1.maxMin1(intArray7, (int) (short) 0);
        int[] intArray11 = ds.MaxMin1.maxMin1(intArray7, (int) (short) 1);
        int[] intArray13 = ds.MaxMin1.maxMin1(intArray7, 0);
        int[] intArray15 = ds.MaxMin1.maxMin1(intArray13, (int) (short) -1);
        int[] intArray17 = ds.MaxMin1.maxMin1(intArray15, (int) (short) 1);
        int[] intArray19 = ds.MaxMin1.maxMin1(intArray15, (int) (short) -1);
        int[] intArray21 = ds.MaxMin1.maxMin1(intArray19, (int) (short) -1);
        int[] intArray23 = ds.MaxMin1.maxMin1(intArray21, (int) (byte) 0);
        int[] intArray25 = ds.MaxMin1.maxMin1(intArray23, (int) (short) 0);
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[10, 0, 0]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[10, 10]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[10, 10]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[10, 10]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[10, 10]");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[10, 10]");
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[10, 10]");
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[10, 10]");
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray19), "[10, 10]");
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray21), "[10, 10]");
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray23), "[10, 10]");
        org.junit.Assert.assertNotNull(intArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray25), "[10, 10]");
    }

    @Test
    public void test1506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1506");
        int[] intArray3 = new int[] { 10, (byte) 0, (byte) 0 };
        int[] intArray5 = ds.MaxMin1.maxMin1(intArray3, 1);
        int[] intArray7 = ds.MaxMin1.maxMin1(intArray3, (int) (short) -1);
        int[] intArray9 = ds.MaxMin1.maxMin1(intArray7, (int) (byte) 1);
        int[] intArray11 = ds.MaxMin1.maxMin1(intArray9, 1);
        int[] intArray13 = ds.MaxMin1.maxMin1(intArray9, 1);
        java.lang.Class<?> wildcardClass14 = intArray13.getClass();
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[10, 0, 0]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[10, 10]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[10, 10]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[10, 10]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[10, 10]");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[10, 10]");
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test1507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1507");
        int[] intArray3 = new int[] { 10, (byte) 0, (byte) 0 };
        int[] intArray5 = ds.MaxMin1.maxMin1(intArray3, 1);
        int[] intArray7 = ds.MaxMin1.maxMin1(intArray3, (int) (short) -1);
        int[] intArray9 = ds.MaxMin1.maxMin1(intArray7, (int) (short) 0);
        int[] intArray11 = ds.MaxMin1.maxMin1(intArray7, (int) (short) 1);
        int[] intArray13 = ds.MaxMin1.maxMin1(intArray7, 0);
        int[] intArray15 = ds.MaxMin1.maxMin1(intArray13, (int) (short) -1);
        int[] intArray17 = ds.MaxMin1.maxMin1(intArray15, (int) (short) 1);
        int[] intArray19 = ds.MaxMin1.maxMin1(intArray15, 0);
        int[] intArray21 = ds.MaxMin1.maxMin1(intArray19, (int) (byte) -1);
        int[] intArray23 = ds.MaxMin1.maxMin1(intArray21, (int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray25 = ds.MaxMin1.maxMin1(intArray23, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[10, 0, 0]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[10, 10]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[10, 10]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[10, 10]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[10, 10]");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[10, 10]");
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[10, 10]");
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[10, 10]");
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray19), "[10, 10]");
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray21), "[10, 10]");
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray23), "[10, 10]");
    }

    @Test
    public void test1508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1508");
        int[] intArray3 = new int[] { 10, (byte) 0, (byte) 0 };
        int[] intArray5 = ds.MaxMin1.maxMin1(intArray3, 1);
        int[] intArray7 = ds.MaxMin1.maxMin1(intArray3, (int) (short) -1);
        int[] intArray9 = ds.MaxMin1.maxMin1(intArray7, (int) (short) 0);
        int[] intArray11 = ds.MaxMin1.maxMin1(intArray9, (int) (short) 1);
        int[] intArray13 = ds.MaxMin1.maxMin1(intArray11, (int) (short) 1);
        int[] intArray15 = ds.MaxMin1.maxMin1(intArray13, (int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray17 = ds.MaxMin1.maxMin1(intArray13, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[10, 0, 0]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[10, 10]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[10, 10]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[10, 10]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[10, 10]");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[10, 10]");
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[10, 10]");
    }

    @Test
    public void test1509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1509");
        int[] intArray3 = new int[] { 10, (byte) 0, (byte) 0 };
        int[] intArray5 = ds.MaxMin1.maxMin1(intArray3, 1);
        int[] intArray7 = ds.MaxMin1.maxMin1(intArray3, 0);
        int[] intArray9 = ds.MaxMin1.maxMin1(intArray3, 0);
        int[] intArray11 = ds.MaxMin1.maxMin1(intArray3, (int) (short) 1);
        int[] intArray13 = ds.MaxMin1.maxMin1(intArray3, (-1));
        int[] intArray15 = ds.MaxMin1.maxMin1(intArray13, (int) (short) -1);
        int[] intArray17 = ds.MaxMin1.maxMin1(intArray15, (int) (byte) 0);
        int[] intArray19 = ds.MaxMin1.maxMin1(intArray15, (-1));
        int[] intArray21 = ds.MaxMin1.maxMin1(intArray15, 0);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray23 = ds.MaxMin1.maxMin1(intArray21, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[10, 0, 0]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[10, 10]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[10, 10]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[10, 10]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[10, 10]");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[10, 10]");
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[10, 10]");
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[10, 10]");
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray19), "[10, 10]");
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray21), "[10, 10]");
    }

    @Test
    public void test1510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1510");
        int[] intArray3 = new int[] { 10, (byte) 0, (byte) 0 };
        int[] intArray5 = ds.MaxMin1.maxMin1(intArray3, 1);
        int[] intArray7 = ds.MaxMin1.maxMin1(intArray3, 0);
        int[] intArray9 = ds.MaxMin1.maxMin1(intArray7, 0);
        int[] intArray11 = ds.MaxMin1.maxMin1(intArray9, (int) (short) 0);
        int[] intArray13 = ds.MaxMin1.maxMin1(intArray9, 0);
        java.lang.Class<?> wildcardClass14 = intArray13.getClass();
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[10, 0, 0]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[10, 10]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[10, 10]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[10, 10]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[10, 10]");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[10, 10]");
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test1511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1511");
        int[] intArray3 = new int[] { 10, (byte) 0, (byte) 0 };
        int[] intArray5 = ds.MaxMin1.maxMin1(intArray3, 1);
        int[] intArray7 = ds.MaxMin1.maxMin1(intArray3, 0);
        int[] intArray9 = ds.MaxMin1.maxMin1(intArray3, 0);
        int[] intArray11 = ds.MaxMin1.maxMin1(intArray3, (int) (short) 1);
        int[] intArray13 = ds.MaxMin1.maxMin1(intArray3, (int) (byte) -1);
        int[] intArray15 = ds.MaxMin1.maxMin1(intArray13, (int) (byte) 1);
        int[] intArray17 = ds.MaxMin1.maxMin1(intArray13, (int) (byte) 1);
        int[] intArray19 = ds.MaxMin1.maxMin1(intArray17, (-1));
        int[] intArray21 = ds.MaxMin1.maxMin1(intArray19, 1);
        int[] intArray23 = ds.MaxMin1.maxMin1(intArray21, (int) (byte) 1);
        int[] intArray25 = ds.MaxMin1.maxMin1(intArray21, (int) (short) 1);
        java.lang.Class<?> wildcardClass26 = intArray21.getClass();
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[10, 0, 0]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[10, 10]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[10, 10]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[10, 10]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[10, 10]");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[10, 10]");
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[10, 10]");
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[10, 10]");
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray19), "[10, 10]");
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray21), "[10, 10]");
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray23), "[10, 10]");
        org.junit.Assert.assertNotNull(intArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray25), "[10, 10]");
        org.junit.Assert.assertNotNull(wildcardClass26);
    }

    @Test
    public void test1512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1512");
        int[] intArray3 = new int[] { 10, (byte) 0, (byte) 0 };
        int[] intArray5 = ds.MaxMin1.maxMin1(intArray3, 1);
        int[] intArray7 = ds.MaxMin1.maxMin1(intArray3, (int) (short) -1);
        int[] intArray9 = ds.MaxMin1.maxMin1(intArray3, (int) (byte) 1);
        int[] intArray11 = ds.MaxMin1.maxMin1(intArray9, (int) (byte) 1);
        int[] intArray13 = ds.MaxMin1.maxMin1(intArray11, 1);
        int[] intArray15 = ds.MaxMin1.maxMin1(intArray11, (int) (short) 0);
        int[] intArray17 = ds.MaxMin1.maxMin1(intArray11, (int) (byte) 0);
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[10, 0, 0]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[10, 10]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[10, 10]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[10, 10]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[10, 10]");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[10, 10]");
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[10, 10]");
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[10, 10]");
    }

    @Test
    public void test1513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1513");
        int[] intArray3 = new int[] { 10, (byte) 0, (byte) 0 };
        int[] intArray5 = ds.MaxMin1.maxMin1(intArray3, 1);
        int[] intArray7 = ds.MaxMin1.maxMin1(intArray3, (int) (short) -1);
        int[] intArray9 = ds.MaxMin1.maxMin1(intArray3, (int) (byte) 1);
        int[] intArray11 = ds.MaxMin1.maxMin1(intArray3, (int) (short) 1);
        int[] intArray13 = ds.MaxMin1.maxMin1(intArray3, (-1));
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[10, 0, 0]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[10, 10]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[10, 10]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[10, 10]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[10, 10]");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[10, 10]");
    }

    @Test
    public void test1514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1514");
        int[] intArray3 = new int[] { 10, (byte) 0, (byte) 0 };
        int[] intArray5 = ds.MaxMin1.maxMin1(intArray3, 1);
        int[] intArray7 = ds.MaxMin1.maxMin1(intArray3, 0);
        int[] intArray9 = ds.MaxMin1.maxMin1(intArray3, 0);
        int[] intArray11 = ds.MaxMin1.maxMin1(intArray3, (int) (short) 1);
        int[] intArray13 = ds.MaxMin1.maxMin1(intArray3, 0);
        int[] intArray15 = ds.MaxMin1.maxMin1(intArray13, 0);
        int[] intArray17 = ds.MaxMin1.maxMin1(intArray13, (int) (short) 1);
        int[] intArray19 = ds.MaxMin1.maxMin1(intArray17, (int) (byte) 0);
        java.lang.Class<?> wildcardClass20 = intArray19.getClass();
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[10, 0, 0]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[10, 10]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[10, 10]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[10, 10]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[10, 10]");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[10, 10]");
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[10, 10]");
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[10, 10]");
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray19), "[10, 10]");
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test1515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1515");
        int[] intArray3 = new int[] { 10, (byte) 0, (byte) 0 };
        int[] intArray5 = ds.MaxMin1.maxMin1(intArray3, 1);
        int[] intArray7 = ds.MaxMin1.maxMin1(intArray3, 0);
        int[] intArray9 = ds.MaxMin1.maxMin1(intArray3, 0);
        int[] intArray11 = ds.MaxMin1.maxMin1(intArray3, (int) (short) -1);
        int[] intArray13 = ds.MaxMin1.maxMin1(intArray3, (int) (short) 0);
        int[] intArray15 = ds.MaxMin1.maxMin1(intArray13, (int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray17 = ds.MaxMin1.maxMin1(intArray13, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[10, 0, 0]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[10, 10]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[10, 10]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[10, 10]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[10, 10]");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[10, 10]");
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[10, 10]");
    }

    @Test
    public void test1516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1516");
        int[] intArray3 = new int[] { 10, (byte) 0, (byte) 0 };
        int[] intArray5 = ds.MaxMin1.maxMin1(intArray3, 1);
        int[] intArray7 = ds.MaxMin1.maxMin1(intArray3, (int) (short) -1);
        int[] intArray9 = ds.MaxMin1.maxMin1(intArray7, (int) (short) 0);
        int[] intArray11 = ds.MaxMin1.maxMin1(intArray7, (int) (short) 1);
        int[] intArray13 = ds.MaxMin1.maxMin1(intArray7, 0);
        int[] intArray15 = ds.MaxMin1.maxMin1(intArray13, (int) (short) -1);
        int[] intArray17 = ds.MaxMin1.maxMin1(intArray15, (int) (short) 1);
        int[] intArray19 = ds.MaxMin1.maxMin1(intArray15, (int) (short) -1);
        int[] intArray21 = ds.MaxMin1.maxMin1(intArray15, (-1));
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[10, 0, 0]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[10, 10]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[10, 10]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[10, 10]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[10, 10]");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[10, 10]");
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[10, 10]");
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[10, 10]");
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray19), "[10, 10]");
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray21), "[10, 10]");
    }

    @Test
    public void test1517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1517");
        int[] intArray3 = new int[] { 10, (byte) 0, (byte) 0 };
        int[] intArray5 = ds.MaxMin1.maxMin1(intArray3, 1);
        int[] intArray7 = ds.MaxMin1.maxMin1(intArray3, 0);
        int[] intArray9 = ds.MaxMin1.maxMin1(intArray3, 0);
        int[] intArray11 = ds.MaxMin1.maxMin1(intArray3, (int) (short) -1);
        int[] intArray13 = ds.MaxMin1.maxMin1(intArray11, (int) (byte) 0);
        int[] intArray15 = ds.MaxMin1.maxMin1(intArray11, (int) (byte) 1);
        int[] intArray17 = ds.MaxMin1.maxMin1(intArray11, (int) (short) -1);
        int[] intArray19 = ds.MaxMin1.maxMin1(intArray17, (int) (short) 1);
        int[] intArray21 = ds.MaxMin1.maxMin1(intArray17, 0);
        java.lang.Class<?> wildcardClass22 = intArray21.getClass();
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[10, 0, 0]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[10, 10]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[10, 10]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[10, 10]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[10, 10]");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[10, 10]");
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[10, 10]");
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[10, 10]");
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray19), "[10, 10]");
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray21), "[10, 10]");
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test1518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1518");
        int[] intArray3 = new int[] { 10, (byte) 0, (byte) 0 };
        int[] intArray5 = ds.MaxMin1.maxMin1(intArray3, 1);
        int[] intArray7 = ds.MaxMin1.maxMin1(intArray3, 0);
        int[] intArray9 = ds.MaxMin1.maxMin1(intArray3, 0);
        int[] intArray11 = ds.MaxMin1.maxMin1(intArray3, (int) (short) -1);
        int[] intArray13 = ds.MaxMin1.maxMin1(intArray11, (-1));
        int[] intArray15 = ds.MaxMin1.maxMin1(intArray11, (int) (short) -1);
        int[] intArray17 = ds.MaxMin1.maxMin1(intArray15, (int) (byte) -1);
        java.lang.Class<?> wildcardClass18 = intArray17.getClass();
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[10, 0, 0]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[10, 10]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[10, 10]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[10, 10]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[10, 10]");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[10, 10]");
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[10, 10]");
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[10, 10]");
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test1519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1519");
        int[] intArray3 = new int[] { 10, (byte) 0, (byte) 0 };
        int[] intArray5 = ds.MaxMin1.maxMin1(intArray3, 1);
        int[] intArray7 = ds.MaxMin1.maxMin1(intArray3, 0);
        int[] intArray9 = ds.MaxMin1.maxMin1(intArray3, 0);
        int[] intArray11 = ds.MaxMin1.maxMin1(intArray3, (int) (short) -1);
        int[] intArray13 = ds.MaxMin1.maxMin1(intArray11, (int) (byte) 0);
        int[] intArray15 = ds.MaxMin1.maxMin1(intArray11, (int) (byte) 1);
        int[] intArray17 = ds.MaxMin1.maxMin1(intArray11, (int) (short) -1);
        int[] intArray19 = ds.MaxMin1.maxMin1(intArray17, 0);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray21 = ds.MaxMin1.maxMin1(intArray19, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[10, 0, 0]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[10, 10]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[10, 10]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[10, 10]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[10, 10]");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[10, 10]");
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[10, 10]");
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[10, 10]");
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray19), "[10, 10]");
    }

    @Test
    public void test1520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1520");
        int[] intArray3 = new int[] { 10, (byte) 0, (byte) 0 };
        int[] intArray5 = ds.MaxMin1.maxMin1(intArray3, 1);
        int[] intArray7 = ds.MaxMin1.maxMin1(intArray3, 0);
        int[] intArray9 = ds.MaxMin1.maxMin1(intArray3, 0);
        int[] intArray11 = ds.MaxMin1.maxMin1(intArray3, (int) (byte) -1);
        int[] intArray13 = ds.MaxMin1.maxMin1(intArray11, (int) (byte) 0);
        int[] intArray15 = ds.MaxMin1.maxMin1(intArray13, (int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray17 = ds.MaxMin1.maxMin1(intArray15, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[10, 0, 0]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[10, 10]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[10, 10]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[10, 10]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[10, 10]");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[10, 10]");
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[10, 10]");
    }

    @Test
    public void test1521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1521");
        int[] intArray3 = new int[] { 10, (byte) 0, (byte) 0 };
        int[] intArray5 = ds.MaxMin1.maxMin1(intArray3, 1);
        int[] intArray7 = ds.MaxMin1.maxMin1(intArray3, 0);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray9 = ds.MaxMin1.maxMin1(intArray3, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[10, 0, 0]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[10, 10]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[10, 10]");
    }

    @Test
    public void test1522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1522");
        int[] intArray3 = new int[] { 10, (byte) 0, (byte) 0 };
        int[] intArray5 = ds.MaxMin1.maxMin1(intArray3, 1);
        int[] intArray7 = ds.MaxMin1.maxMin1(intArray3, 0);
        int[] intArray9 = ds.MaxMin1.maxMin1(intArray3, 0);
        int[] intArray11 = ds.MaxMin1.maxMin1(intArray3, (int) (short) -1);
        int[] intArray13 = ds.MaxMin1.maxMin1(intArray11, 0);
        int[] intArray15 = ds.MaxMin1.maxMin1(intArray11, (int) (byte) 0);
        int[] intArray17 = ds.MaxMin1.maxMin1(intArray11, 1);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray19 = ds.MaxMin1.maxMin1(intArray17, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[10, 0, 0]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[10, 10]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[10, 10]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[10, 10]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[10, 10]");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[10, 10]");
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[10, 10]");
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[10, 10]");
    }

    @Test
    public void test1523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1523");
        int[] intArray1 = new int[] { 0 };
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray3 = ds.MaxMin1.maxMin1(intArray1, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray1), "[0]");
    }

    @Test
    public void test1524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1524");
        int[] intArray3 = new int[] { 10, (byte) 0, (byte) 0 };
        int[] intArray5 = ds.MaxMin1.maxMin1(intArray3, 1);
        int[] intArray7 = ds.MaxMin1.maxMin1(intArray3, 0);
        int[] intArray9 = ds.MaxMin1.maxMin1(intArray3, 0);
        int[] intArray11 = ds.MaxMin1.maxMin1(intArray3, (int) (short) 1);
        int[] intArray13 = ds.MaxMin1.maxMin1(intArray3, (int) (short) -1);
        int[] intArray15 = ds.MaxMin1.maxMin1(intArray13, 0);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray17 = ds.MaxMin1.maxMin1(intArray13, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[10, 0, 0]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[10, 10]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[10, 10]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[10, 10]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[10, 10]");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[10, 10]");
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[10, 10]");
    }

    @Test
    public void test1525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1525");
        int[] intArray3 = new int[] { 10, (byte) 0, (byte) 0 };
        int[] intArray5 = ds.MaxMin1.maxMin1(intArray3, 1);
        int[] intArray7 = ds.MaxMin1.maxMin1(intArray3, (int) (short) -1);
        int[] intArray9 = ds.MaxMin1.maxMin1(intArray7, (int) (short) 0);
        int[] intArray11 = ds.MaxMin1.maxMin1(intArray7, (int) (short) 1);
        int[] intArray13 = ds.MaxMin1.maxMin1(intArray7, 0);
        int[] intArray15 = ds.MaxMin1.maxMin1(intArray13, (int) (short) -1);
        int[] intArray17 = ds.MaxMin1.maxMin1(intArray15, (int) (short) 1);
        int[] intArray19 = ds.MaxMin1.maxMin1(intArray15, (int) (short) -1);
        int[] intArray21 = ds.MaxMin1.maxMin1(intArray19, (int) (short) -1);
        int[] intArray23 = ds.MaxMin1.maxMin1(intArray21, (int) (byte) 0);
        int[] intArray25 = ds.MaxMin1.maxMin1(intArray21, (int) (short) 0);
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[10, 0, 0]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[10, 10]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[10, 10]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[10, 10]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[10, 10]");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[10, 10]");
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[10, 10]");
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[10, 10]");
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray19), "[10, 10]");
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray21), "[10, 10]");
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray23), "[10, 10]");
        org.junit.Assert.assertNotNull(intArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray25), "[10, 10]");
    }

    @Test
    public void test1526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1526");
        int[] intArray3 = new int[] { 10, (byte) 0, (byte) 0 };
        int[] intArray5 = ds.MaxMin1.maxMin1(intArray3, 1);
        int[] intArray7 = ds.MaxMin1.maxMin1(intArray3, (int) (short) -1);
        int[] intArray9 = ds.MaxMin1.maxMin1(intArray7, (int) (byte) 1);
        int[] intArray11 = ds.MaxMin1.maxMin1(intArray9, 1);
        int[] intArray13 = ds.MaxMin1.maxMin1(intArray11, (int) (short) 1);
        int[] intArray15 = ds.MaxMin1.maxMin1(intArray11, (int) (short) -1);
        int[] intArray17 = ds.MaxMin1.maxMin1(intArray11, 1);
        int[] intArray19 = ds.MaxMin1.maxMin1(intArray11, 1);
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[10, 0, 0]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[10, 10]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[10, 10]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[10, 10]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[10, 10]");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[10, 10]");
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[10, 10]");
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[10, 10]");
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray19), "[10, 10]");
    }

    @Test
    public void test1527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1527");
        int[] intArray3 = new int[] { 10, (byte) 0, (byte) 0 };
        int[] intArray5 = ds.MaxMin1.maxMin1(intArray3, 1);
        int[] intArray7 = ds.MaxMin1.maxMin1(intArray3, (int) (short) -1);
        int[] intArray9 = ds.MaxMin1.maxMin1(intArray7, (int) (short) 0);
        int[] intArray11 = ds.MaxMin1.maxMin1(intArray7, (int) (short) 1);
        int[] intArray13 = ds.MaxMin1.maxMin1(intArray7, 0);
        int[] intArray15 = ds.MaxMin1.maxMin1(intArray13, (int) (short) -1);
        int[] intArray17 = ds.MaxMin1.maxMin1(intArray13, (-1));
        int[] intArray19 = ds.MaxMin1.maxMin1(intArray17, (int) (byte) -1);
        int[] intArray21 = ds.MaxMin1.maxMin1(intArray19, (int) (byte) -1);
        int[] intArray23 = ds.MaxMin1.maxMin1(intArray21, 0);
        int[] intArray25 = ds.MaxMin1.maxMin1(intArray21, 0);
        java.lang.Class<?> wildcardClass26 = intArray21.getClass();
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[10, 0, 0]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[10, 10]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[10, 10]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[10, 10]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[10, 10]");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[10, 10]");
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[10, 10]");
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[10, 10]");
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray19), "[10, 10]");
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray21), "[10, 10]");
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray23), "[10, 10]");
        org.junit.Assert.assertNotNull(intArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray25), "[10, 10]");
        org.junit.Assert.assertNotNull(wildcardClass26);
    }

    @Test
    public void test1528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1528");
        int[] intArray3 = new int[] { 10, (byte) 0, (byte) 0 };
        int[] intArray5 = ds.MaxMin1.maxMin1(intArray3, 1);
        int[] intArray7 = ds.MaxMin1.maxMin1(intArray3, 0);
        int[] intArray9 = ds.MaxMin1.maxMin1(intArray7, 0);
        int[] intArray11 = ds.MaxMin1.maxMin1(intArray9, (int) (short) 0);
        java.lang.Class<?> wildcardClass12 = intArray11.getClass();
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[10, 0, 0]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[10, 10]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[10, 10]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[10, 10]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[10, 10]");
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test1529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1529");
        int[] intArray3 = new int[] { 10, (byte) 0, (byte) 0 };
        int[] intArray5 = ds.MaxMin1.maxMin1(intArray3, 1);
        int[] intArray7 = ds.MaxMin1.maxMin1(intArray3, 0);
        int[] intArray9 = ds.MaxMin1.maxMin1(intArray3, 0);
        int[] intArray11 = ds.MaxMin1.maxMin1(intArray3, (int) (short) 1);
        int[] intArray13 = ds.MaxMin1.maxMin1(intArray3, 0);
        int[] intArray15 = ds.MaxMin1.maxMin1(intArray13, 0);
        int[] intArray17 = ds.MaxMin1.maxMin1(intArray13, (int) (short) -1);
        int[] intArray19 = ds.MaxMin1.maxMin1(intArray17, 1);
        int[] intArray21 = ds.MaxMin1.maxMin1(intArray19, 0);
        java.lang.Class<?> wildcardClass22 = intArray19.getClass();
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[10, 0, 0]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[10, 10]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[10, 10]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[10, 10]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[10, 10]");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[10, 10]");
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[10, 10]");
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[10, 10]");
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray19), "[10, 10]");
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray21), "[10, 10]");
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test1530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1530");
        int[] intArray3 = new int[] { 10, (byte) 0, (byte) 0 };
        int[] intArray5 = ds.MaxMin1.maxMin1(intArray3, 1);
        int[] intArray7 = ds.MaxMin1.maxMin1(intArray3, (int) (short) -1);
        int[] intArray9 = ds.MaxMin1.maxMin1(intArray7, (int) (short) 0);
        int[] intArray11 = ds.MaxMin1.maxMin1(intArray7, (int) (short) 1);
        int[] intArray13 = ds.MaxMin1.maxMin1(intArray7, 0);
        int[] intArray15 = ds.MaxMin1.maxMin1(intArray13, (int) (short) -1);
        int[] intArray17 = ds.MaxMin1.maxMin1(intArray15, (int) (short) 1);
        int[] intArray19 = ds.MaxMin1.maxMin1(intArray15, (int) (byte) 0);
        int[] intArray21 = ds.MaxMin1.maxMin1(intArray15, 0);
        java.lang.Class<?> wildcardClass22 = intArray15.getClass();
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[10, 0, 0]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[10, 10]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[10, 10]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[10, 10]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[10, 10]");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[10, 10]");
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[10, 10]");
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[10, 10]");
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray19), "[10, 10]");
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray21), "[10, 10]");
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test1531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1531");
        int[] intArray3 = new int[] { 10, (byte) 0, (byte) 0 };
        int[] intArray5 = ds.MaxMin1.maxMin1(intArray3, 1);
        int[] intArray7 = ds.MaxMin1.maxMin1(intArray3, 0);
        int[] intArray9 = ds.MaxMin1.maxMin1(intArray3, 0);
        int[] intArray11 = ds.MaxMin1.maxMin1(intArray3, (int) (short) 1);
        int[] intArray13 = ds.MaxMin1.maxMin1(intArray3, 0);
        int[] intArray15 = ds.MaxMin1.maxMin1(intArray13, (int) (short) 0);
        int[] intArray17 = ds.MaxMin1.maxMin1(intArray15, (int) (byte) 0);
        int[] intArray19 = ds.MaxMin1.maxMin1(intArray15, (-1));
        int[] intArray21 = ds.MaxMin1.maxMin1(intArray15, 0);
        int[] intArray23 = ds.MaxMin1.maxMin1(intArray21, (int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray25 = ds.MaxMin1.maxMin1(intArray21, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[10, 0, 0]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[10, 10]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[10, 10]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[10, 10]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[10, 10]");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[10, 10]");
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[10, 10]");
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[10, 10]");
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray19), "[10, 10]");
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray21), "[10, 10]");
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray23), "[10, 10]");
    }

    @Test
    public void test1532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1532");
        int[] intArray3 = new int[] { 10, (byte) 0, (byte) 0 };
        int[] intArray5 = ds.MaxMin1.maxMin1(intArray3, 1);
        int[] intArray7 = ds.MaxMin1.maxMin1(intArray3, 1);
        int[] intArray9 = ds.MaxMin1.maxMin1(intArray3, (int) (byte) 1);
        int[] intArray11 = ds.MaxMin1.maxMin1(intArray3, (int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray13 = ds.MaxMin1.maxMin1(intArray3, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[10, 0, 0]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[10, 10]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[10, 10]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[10, 10]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[10, 10]");
    }
}

