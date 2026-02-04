package ds.seed7992;

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
        int[] intArray5 = new int[] { 0, (short) 100, '#', (byte) 100, ' ' };
        int[] intArray7 = ds.MaxMin3.maxMin3(intArray5, 1);
        int[] intArray9 = ds.MaxMin3.maxMin3(intArray5, (int) (short) 0);
        int[] intArray11 = ds.MaxMin3.maxMin3(intArray5, (-1));
        int[] intArray13 = ds.MaxMin3.maxMin3(intArray5, (int) (byte) 1);
        int[] intArray15 = ds.MaxMin3.maxMin3(intArray5, 0);
        int[] intArray17 = ds.MaxMin3.maxMin3(intArray5, 0);
        int[] intArray19 = ds.MaxMin3.maxMin3(intArray17, (int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray21 = ds.MaxMin3.maxMin3(intArray19, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[0, 0, 35, 100, 32]");
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
    public void test1502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1502");
        int[] intArray5 = new int[] { 0, (short) 100, '#', (byte) 100, ' ' };
        int[] intArray7 = ds.MaxMin3.maxMin3(intArray5, 1);
        int[] intArray9 = ds.MaxMin3.maxMin3(intArray5, (int) (short) 0);
        int[] intArray11 = ds.MaxMin3.maxMin3(intArray5, (-1));
        int[] intArray13 = ds.MaxMin3.maxMin3(intArray5, (int) (byte) 1);
        int[] intArray15 = ds.MaxMin3.maxMin3(intArray5, 1);
        int[] intArray17 = ds.MaxMin3.maxMin3(intArray15, (-1));
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray19 = ds.MaxMin3.maxMin3(intArray15, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[0, 0, 35, 100, 32]");
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
    public void test1503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1503");
        int[] intArray3 = new int[] { ' ', 1, (short) 10 };
        int[] intArray5 = ds.MaxMin3.maxMin3(intArray3, (int) (short) 0);
        int[] intArray7 = ds.MaxMin3.maxMin3(intArray5, (int) (byte) 0);
        int[] intArray9 = ds.MaxMin3.maxMin3(intArray7, (int) (short) -1);
        int[] intArray11 = ds.MaxMin3.maxMin3(intArray9, (int) (short) 1);
        int[] intArray13 = ds.MaxMin3.maxMin3(intArray11, (int) (byte) -1);
        java.lang.Class<?> wildcardClass14 = intArray11.getClass();
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[32, 1, 10]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[32, 1]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[32, 1]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[32, 32]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[32, 32]");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[32, 32]");
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test1504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1504");
        int[] intArray2 = new int[] { 10, '4' };
        int[] intArray4 = ds.MaxMin3.maxMin3(intArray2, (int) (short) 1);
        int[] intArray6 = ds.MaxMin3.maxMin3(intArray4, 0);
        int[] intArray8 = ds.MaxMin3.maxMin3(intArray4, 0);
        int[] intArray10 = ds.MaxMin3.maxMin3(intArray8, 1);
        int[] intArray12 = ds.MaxMin3.maxMin3(intArray8, (int) (byte) -1);
        int[] intArray14 = ds.MaxMin3.maxMin3(intArray12, (int) (byte) 0);
        int[] intArray16 = ds.MaxMin3.maxMin3(intArray12, (int) (short) 1);
        int[] intArray18 = ds.MaxMin3.maxMin3(intArray12, (int) (short) -1);
        int[] intArray20 = ds.MaxMin3.maxMin3(intArray12, 0);
        int[] intArray22 = ds.MaxMin3.maxMin3(intArray12, 0);
        java.lang.Class<?> wildcardClass23 = intArray12.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[10, 10]");
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[10, 10]");
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
        org.junit.Assert.assertNotNull(intArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray20), "[10, 10]");
        org.junit.Assert.assertNotNull(intArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray22), "[10, 10]");
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test1505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1505");
        int[] intArray5 = new int[] { 0, (short) 100, '#', (byte) 100, ' ' };
        int[] intArray7 = ds.MaxMin3.maxMin3(intArray5, 1);
        int[] intArray9 = ds.MaxMin3.maxMin3(intArray5, (int) (short) 0);
        int[] intArray11 = ds.MaxMin3.maxMin3(intArray5, (-1));
        int[] intArray13 = ds.MaxMin3.maxMin3(intArray5, 1);
        int[] intArray15 = ds.MaxMin3.maxMin3(intArray13, (-1));
        int[] intArray17 = ds.MaxMin3.maxMin3(intArray13, (int) (short) 0);
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[0, 0, 35, 100, 32]");
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
    public void test1506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1506");
        int[] intArray2 = new int[] { 10, '4' };
        int[] intArray4 = ds.MaxMin3.maxMin3(intArray2, (int) (short) 1);
        int[] intArray6 = ds.MaxMin3.maxMin3(intArray2, 0);
        int[] intArray8 = ds.MaxMin3.maxMin3(intArray2, (int) (byte) 0);
        int[] intArray10 = ds.MaxMin3.maxMin3(intArray8, 1);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[10, 10]");
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[10, 10]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[10, 10]");
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[10, 10]");
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[10, 10]");
    }

    @Test
    public void test1507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1507");
        int[] intArray3 = new int[] { ' ', 1, (short) 10 };
        int[] intArray5 = ds.MaxMin3.maxMin3(intArray3, (int) (short) 0);
        int[] intArray7 = ds.MaxMin3.maxMin3(intArray5, (int) (byte) 0);
        int[] intArray9 = ds.MaxMin3.maxMin3(intArray7, 0);
        int[] intArray11 = ds.MaxMin3.maxMin3(intArray9, 0);
        int[] intArray13 = ds.MaxMin3.maxMin3(intArray9, (int) (byte) 1);
        java.lang.Class<?> wildcardClass14 = intArray13.getClass();
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[32, 1, 10]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[32, 1]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[32, 1]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[32, 32]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[32, 1]");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[32, 32]");
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test1508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1508");
        int[] intArray2 = new int[] { 10, '4' };
        int[] intArray4 = ds.MaxMin3.maxMin3(intArray2, (int) (short) 1);
        int[] intArray6 = ds.MaxMin3.maxMin3(intArray4, 0);
        int[] intArray8 = ds.MaxMin3.maxMin3(intArray4, 0);
        int[] intArray10 = ds.MaxMin3.maxMin3(intArray8, (int) (byte) 1);
        int[] intArray12 = ds.MaxMin3.maxMin3(intArray10, (int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray14 = ds.MaxMin3.maxMin3(intArray12, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[10, 10]");
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[10, 10]");
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
    public void test1509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1509");
        int[] intArray5 = new int[] { 0, (short) 100, '#', (byte) 100, ' ' };
        int[] intArray7 = ds.MaxMin3.maxMin3(intArray5, 1);
        int[] intArray9 = ds.MaxMin3.maxMin3(intArray5, (int) (short) 0);
        int[] intArray11 = ds.MaxMin3.maxMin3(intArray5, (-1));
        int[] intArray13 = ds.MaxMin3.maxMin3(intArray5, 1);
        int[] intArray15 = ds.MaxMin3.maxMin3(intArray13, 1);
        int[] intArray17 = ds.MaxMin3.maxMin3(intArray15, (int) (short) -1);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray19 = ds.MaxMin3.maxMin3(intArray15, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[0, 0, 35, 100, 32]");
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
    public void test1510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1510");
        int[] intArray2 = new int[] { 10, '4' };
        int[] intArray4 = ds.MaxMin3.maxMin3(intArray2, (int) (short) 1);
        int[] intArray6 = ds.MaxMin3.maxMin3(intArray4, 0);
        int[] intArray8 = ds.MaxMin3.maxMin3(intArray4, 0);
        int[] intArray10 = ds.MaxMin3.maxMin3(intArray4, (int) (byte) 0);
        int[] intArray12 = ds.MaxMin3.maxMin3(intArray10, (int) (byte) 1);
        int[] intArray14 = ds.MaxMin3.maxMin3(intArray12, (int) (short) 1);
        int[] intArray16 = ds.MaxMin3.maxMin3(intArray14, 1);
        int[] intArray18 = ds.MaxMin3.maxMin3(intArray16, (int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray20 = ds.MaxMin3.maxMin3(intArray16, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[10, 10]");
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[10, 10]");
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
    public void test1511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1511");
        int[] intArray5 = new int[] { 0, (short) 100, '#', (byte) 100, ' ' };
        int[] intArray7 = ds.MaxMin3.maxMin3(intArray5, 1);
        int[] intArray9 = ds.MaxMin3.maxMin3(intArray5, (int) (short) 0);
        int[] intArray11 = ds.MaxMin3.maxMin3(intArray9, (int) (byte) 0);
        int[] intArray13 = ds.MaxMin3.maxMin3(intArray11, (int) (byte) 1);
        int[] intArray15 = ds.MaxMin3.maxMin3(intArray13, 0);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray17 = ds.MaxMin3.maxMin3(intArray15, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[0, 0, 35, 100, 32]");
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
    }

    @Test
    public void test1512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1512");
        int[] intArray2 = new int[] { 10, '4' };
        int[] intArray4 = ds.MaxMin3.maxMin3(intArray2, (int) (short) 1);
        int[] intArray6 = ds.MaxMin3.maxMin3(intArray4, 0);
        int[] intArray8 = ds.MaxMin3.maxMin3(intArray4, 0);
        int[] intArray10 = ds.MaxMin3.maxMin3(intArray8, 1);
        int[] intArray12 = ds.MaxMin3.maxMin3(intArray8, (int) (byte) -1);
        int[] intArray14 = ds.MaxMin3.maxMin3(intArray12, (int) (byte) 0);
        int[] intArray16 = ds.MaxMin3.maxMin3(intArray12, (int) (short) 1);
        int[] intArray18 = ds.MaxMin3.maxMin3(intArray16, (int) (short) 1);
        int[] intArray20 = ds.MaxMin3.maxMin3(intArray18, (-1));
        int[] intArray22 = ds.MaxMin3.maxMin3(intArray18, 0);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray24 = ds.MaxMin3.maxMin3(intArray18, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[10, 10]");
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[10, 10]");
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
        org.junit.Assert.assertNotNull(intArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray20), "[10, 10]");
        org.junit.Assert.assertNotNull(intArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray22), "[10, 10]");
    }

    @Test
    public void test1513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1513");
        int[] intArray3 = new int[] { ' ', 1, (short) 10 };
        int[] intArray5 = ds.MaxMin3.maxMin3(intArray3, (int) (short) 0);
        int[] intArray7 = ds.MaxMin3.maxMin3(intArray5, (int) (byte) 0);
        int[] intArray9 = ds.MaxMin3.maxMin3(intArray7, (int) (short) -1);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray11 = ds.MaxMin3.maxMin3(intArray9, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[32, 1, 10]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[32, 1]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[32, 1]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[32, 1]");
    }

    @Test
    public void test1514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1514");
        int[] intArray5 = new int[] { 0, (short) 100, '#', (byte) 100, ' ' };
        int[] intArray7 = ds.MaxMin3.maxMin3(intArray5, 1);
        int[] intArray9 = ds.MaxMin3.maxMin3(intArray5, (int) (short) 0);
        int[] intArray11 = ds.MaxMin3.maxMin3(intArray5, (-1));
        int[] intArray13 = ds.MaxMin3.maxMin3(intArray5, (int) (byte) 1);
        int[] intArray15 = ds.MaxMin3.maxMin3(intArray13, (int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray17 = ds.MaxMin3.maxMin3(intArray15, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[0, 0, 35, 100, 32]");
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
    }

    @Test
    public void test1515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1515");
        int[] intArray2 = new int[] { 10, '4' };
        int[] intArray4 = ds.MaxMin3.maxMin3(intArray2, (int) (short) 1);
        int[] intArray6 = ds.MaxMin3.maxMin3(intArray4, 0);
        int[] intArray8 = ds.MaxMin3.maxMin3(intArray4, 0);
        int[] intArray10 = ds.MaxMin3.maxMin3(intArray8, 1);
        int[] intArray12 = ds.MaxMin3.maxMin3(intArray8, (int) (byte) -1);
        int[] intArray14 = ds.MaxMin3.maxMin3(intArray12, (int) (byte) 0);
        int[] intArray16 = ds.MaxMin3.maxMin3(intArray12, (int) (short) 1);
        int[] intArray18 = ds.MaxMin3.maxMin3(intArray16, (int) (short) 1);
        int[] intArray20 = ds.MaxMin3.maxMin3(intArray18, (-1));
        int[] intArray22 = ds.MaxMin3.maxMin3(intArray18, 0);
        int[] intArray24 = ds.MaxMin3.maxMin3(intArray22, (int) (byte) 1);
        java.lang.Class<?> wildcardClass25 = intArray22.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[10, 10]");
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[10, 10]");
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
        org.junit.Assert.assertNotNull(intArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray20), "[10, 10]");
        org.junit.Assert.assertNotNull(intArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray22), "[10, 10]");
        org.junit.Assert.assertNotNull(intArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray24), "[10, 10]");
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test1516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1516");
        int[] intArray2 = new int[] { 10, '4' };
        int[] intArray4 = ds.MaxMin3.maxMin3(intArray2, (int) (short) 1);
        int[] intArray6 = ds.MaxMin3.maxMin3(intArray4, 0);
        int[] intArray8 = ds.MaxMin3.maxMin3(intArray4, 0);
        int[] intArray10 = ds.MaxMin3.maxMin3(intArray8, 1);
        int[] intArray12 = ds.MaxMin3.maxMin3(intArray8, (int) (byte) -1);
        int[] intArray14 = ds.MaxMin3.maxMin3(intArray12, (int) (byte) 0);
        int[] intArray16 = ds.MaxMin3.maxMin3(intArray12, 0);
        int[] intArray18 = ds.MaxMin3.maxMin3(intArray12, (int) (byte) 0);
        int[] intArray20 = ds.MaxMin3.maxMin3(intArray12, (int) (byte) -1);
        int[] intArray22 = ds.MaxMin3.maxMin3(intArray20, (int) (byte) -1);
        java.lang.Class<?> wildcardClass23 = intArray22.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[10, 10]");
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[10, 10]");
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
        org.junit.Assert.assertNotNull(intArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray20), "[10, 10]");
        org.junit.Assert.assertNotNull(intArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray22), "[10, 10]");
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test1517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1517");
        int[] intArray3 = new int[] { ' ', 1, (short) 10 };
        int[] intArray5 = ds.MaxMin3.maxMin3(intArray3, (int) (short) 0);
        int[] intArray7 = ds.MaxMin3.maxMin3(intArray5, (int) (byte) 0);
        int[] intArray9 = ds.MaxMin3.maxMin3(intArray7, (int) (short) -1);
        int[] intArray11 = ds.MaxMin3.maxMin3(intArray9, (int) (short) 1);
        int[] intArray13 = ds.MaxMin3.maxMin3(intArray11, (int) (byte) 0);
        int[] intArray15 = ds.MaxMin3.maxMin3(intArray11, 1);
        int[] intArray17 = ds.MaxMin3.maxMin3(intArray15, (-1));
        java.lang.Class<?> wildcardClass18 = intArray15.getClass();
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[32, 1, 10]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[32, 1]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[32, 1]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[32, 32]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[32, 32]");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[32, 32]");
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[32, 32]");
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[32, 32]");
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test1518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1518");
        int[] intArray2 = new int[] { 10, '4' };
        int[] intArray4 = ds.MaxMin3.maxMin3(intArray2, (int) (short) 1);
        int[] intArray6 = ds.MaxMin3.maxMin3(intArray4, 0);
        int[] intArray8 = ds.MaxMin3.maxMin3(intArray4, 0);
        int[] intArray10 = ds.MaxMin3.maxMin3(intArray8, 0);
        int[] intArray12 = ds.MaxMin3.maxMin3(intArray10, (int) (short) -1);
        int[] intArray14 = ds.MaxMin3.maxMin3(intArray12, (int) (byte) 1);
        int[] intArray16 = ds.MaxMin3.maxMin3(intArray12, (int) (byte) 1);
        int[] intArray18 = ds.MaxMin3.maxMin3(intArray16, (int) (byte) 1);
        java.lang.Class<?> wildcardClass19 = intArray18.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[10, 10]");
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[10, 10]");
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
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test1519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1519");
        int[] intArray2 = new int[] { 10, '4' };
        int[] intArray4 = ds.MaxMin3.maxMin3(intArray2, (int) (short) 1);
        int[] intArray6 = ds.MaxMin3.maxMin3(intArray4, (-1));
        int[] intArray8 = ds.MaxMin3.maxMin3(intArray6, (int) (short) -1);
        int[] intArray10 = ds.MaxMin3.maxMin3(intArray6, (int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray12 = ds.MaxMin3.maxMin3(intArray10, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[10, 10]");
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[10, 10]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[10, 10]");
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[10, 10]");
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[10, 10]");
    }

    @Test
    public void test1520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1520");
        int[] intArray2 = new int[] { 10, '4' };
        int[] intArray4 = ds.MaxMin3.maxMin3(intArray2, (int) (short) 1);
        int[] intArray6 = ds.MaxMin3.maxMin3(intArray4, 0);
        int[] intArray8 = ds.MaxMin3.maxMin3(intArray4, 0);
        int[] intArray10 = ds.MaxMin3.maxMin3(intArray8, (int) (short) -1);
        int[] intArray12 = ds.MaxMin3.maxMin3(intArray10, (int) (byte) 1);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[10, 10]");
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[10, 10]");
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
    public void test1521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1521");
        int[] intArray2 = new int[] { 10, '4' };
        int[] intArray4 = ds.MaxMin3.maxMin3(intArray2, (int) (short) 1);
        int[] intArray6 = ds.MaxMin3.maxMin3(intArray2, 0);
        int[] intArray8 = ds.MaxMin3.maxMin3(intArray2, (int) (byte) 0);
        int[] intArray10 = ds.MaxMin3.maxMin3(intArray2, (int) (short) 1);
        int[] intArray12 = ds.MaxMin3.maxMin3(intArray2, 0);
        int[] intArray14 = ds.MaxMin3.maxMin3(intArray2, (int) (short) 1);
        int[] intArray16 = ds.MaxMin3.maxMin3(intArray14, (int) (short) -1);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray18 = ds.MaxMin3.maxMin3(intArray16, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[10, 10]");
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[10, 10]");
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
    }

    @Test
    public void test1522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1522");
        int[] intArray3 = new int[] { ' ', 1, (short) 10 };
        int[] intArray5 = ds.MaxMin3.maxMin3(intArray3, (int) (short) 0);
        int[] intArray7 = ds.MaxMin3.maxMin3(intArray5, (int) (byte) 0);
        int[] intArray9 = ds.MaxMin3.maxMin3(intArray7, (int) (byte) -1);
        int[] intArray11 = ds.MaxMin3.maxMin3(intArray7, (int) (short) -1);
        java.lang.Class<?> wildcardClass12 = intArray11.getClass();
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[32, 1, 10]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[32, 1]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[32, 1]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[32, 1]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[32, 1]");
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test1523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1523");
        int[] intArray2 = new int[] { 10, '4' };
        int[] intArray4 = ds.MaxMin3.maxMin3(intArray2, (int) (short) 1);
        int[] intArray6 = ds.MaxMin3.maxMin3(intArray4, 0);
        int[] intArray8 = ds.MaxMin3.maxMin3(intArray4, 0);
        int[] intArray10 = ds.MaxMin3.maxMin3(intArray4, (int) (byte) 0);
        int[] intArray12 = ds.MaxMin3.maxMin3(intArray10, (int) (byte) 1);
        int[] intArray14 = ds.MaxMin3.maxMin3(intArray12, (int) (short) 1);
        int[] intArray16 = ds.MaxMin3.maxMin3(intArray14, 1);
        int[] intArray18 = ds.MaxMin3.maxMin3(intArray14, 0);
        int[] intArray20 = ds.MaxMin3.maxMin3(intArray18, 1);
        int[] intArray22 = ds.MaxMin3.maxMin3(intArray20, (-1));
        int[] intArray24 = ds.MaxMin3.maxMin3(intArray22, 0);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray26 = ds.MaxMin3.maxMin3(intArray22, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[10, 10]");
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[10, 10]");
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
        org.junit.Assert.assertNotNull(intArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray20), "[10, 10]");
        org.junit.Assert.assertNotNull(intArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray22), "[10, 10]");
        org.junit.Assert.assertNotNull(intArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray24), "[10, 10]");
    }

    @Test
    public void test1524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1524");
        int[] intArray2 = new int[] { 10, '4' };
        int[] intArray4 = ds.MaxMin3.maxMin3(intArray2, (int) (short) 1);
        int[] intArray6 = ds.MaxMin3.maxMin3(intArray4, 0);
        int[] intArray8 = ds.MaxMin3.maxMin3(intArray4, 0);
        int[] intArray10 = ds.MaxMin3.maxMin3(intArray8, 1);
        int[] intArray12 = ds.MaxMin3.maxMin3(intArray10, 1);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray14 = ds.MaxMin3.maxMin3(intArray12, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[10, 10]");
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[10, 10]");
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
    public void test1525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1525");
        int[] intArray2 = new int[] { 10, '4' };
        int[] intArray4 = ds.MaxMin3.maxMin3(intArray2, (int) (short) 1);
        int[] intArray6 = ds.MaxMin3.maxMin3(intArray2, 0);
        int[] intArray8 = ds.MaxMin3.maxMin3(intArray2, (int) (byte) 0);
        int[] intArray10 = ds.MaxMin3.maxMin3(intArray2, (int) (short) 1);
        int[] intArray12 = ds.MaxMin3.maxMin3(intArray2, 0);
        int[] intArray14 = ds.MaxMin3.maxMin3(intArray2, (int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray16 = ds.MaxMin3.maxMin3(intArray14, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[10, 10]");
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[10, 10]");
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
    }

    @Test
    public void test1526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1526");
        int[] intArray2 = new int[] { 10, '4' };
        int[] intArray4 = ds.MaxMin3.maxMin3(intArray2, (int) (short) 1);
        int[] intArray6 = ds.MaxMin3.maxMin3(intArray4, 0);
        int[] intArray8 = ds.MaxMin3.maxMin3(intArray4, 0);
        int[] intArray10 = ds.MaxMin3.maxMin3(intArray4, (int) (byte) 0);
        int[] intArray12 = ds.MaxMin3.maxMin3(intArray10, (int) (byte) 1);
        int[] intArray14 = ds.MaxMin3.maxMin3(intArray10, (int) (byte) 1);
        int[] intArray16 = ds.MaxMin3.maxMin3(intArray14, (-1));
        int[] intArray18 = ds.MaxMin3.maxMin3(intArray14, (int) (short) 0);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[10, 10]");
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[10, 10]");
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
    public void test1527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1527");
        int[] intArray2 = new int[] { 10, '4' };
        int[] intArray4 = ds.MaxMin3.maxMin3(intArray2, (int) (short) 1);
        int[] intArray6 = ds.MaxMin3.maxMin3(intArray2, 0);
        int[] intArray8 = ds.MaxMin3.maxMin3(intArray2, (int) (byte) 0);
        int[] intArray10 = ds.MaxMin3.maxMin3(intArray2, (int) (short) 1);
        int[] intArray12 = ds.MaxMin3.maxMin3(intArray2, (int) (short) 0);
        int[] intArray14 = ds.MaxMin3.maxMin3(intArray2, 1);
        int[] intArray16 = ds.MaxMin3.maxMin3(intArray14, (int) (short) 1);
        int[] intArray18 = ds.MaxMin3.maxMin3(intArray14, (int) (short) 0);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[10, 10]");
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[10, 10]");
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
    public void test1528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1528");
        int[] intArray3 = new int[] { ' ', 1, (short) 10 };
        int[] intArray5 = ds.MaxMin3.maxMin3(intArray3, (int) (short) 0);
        int[] intArray7 = ds.MaxMin3.maxMin3(intArray3, (int) (short) 1);
        int[] intArray9 = ds.MaxMin3.maxMin3(intArray3, (int) (short) 1);
        int[] intArray11 = ds.MaxMin3.maxMin3(intArray9, (int) (byte) -1);
        int[] intArray13 = ds.MaxMin3.maxMin3(intArray11, (int) (byte) -1);
        int[] intArray15 = ds.MaxMin3.maxMin3(intArray13, (int) (byte) 0);
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[32, 32, 10]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[32, 1]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[32, 32]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[32, 32]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[32, 32]");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[32, 32]");
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[32, 32]");
    }

    @Test
    public void test1529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1529");
        int[] intArray2 = new int[] { 10, '4' };
        int[] intArray4 = ds.MaxMin3.maxMin3(intArray2, (int) (short) 1);
        int[] intArray6 = ds.MaxMin3.maxMin3(intArray4, 0);
        int[] intArray8 = ds.MaxMin3.maxMin3(intArray4, 0);
        int[] intArray10 = ds.MaxMin3.maxMin3(intArray4, (int) (byte) 0);
        int[] intArray12 = ds.MaxMin3.maxMin3(intArray10, (int) (byte) 1);
        int[] intArray14 = ds.MaxMin3.maxMin3(intArray10, (int) (byte) 1);
        int[] intArray16 = ds.MaxMin3.maxMin3(intArray14, (-1));
        int[] intArray18 = ds.MaxMin3.maxMin3(intArray16, 0);
        int[] intArray20 = ds.MaxMin3.maxMin3(intArray16, (int) (short) 1);
        int[] intArray22 = ds.MaxMin3.maxMin3(intArray20, (int) (short) 0);
        int[] intArray24 = ds.MaxMin3.maxMin3(intArray20, 1);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[10, 10]");
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[10, 10]");
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
        org.junit.Assert.assertNotNull(intArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray20), "[10, 10]");
        org.junit.Assert.assertNotNull(intArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray22), "[10, 10]");
        org.junit.Assert.assertNotNull(intArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray24), "[10, 10]");
    }

    @Test
    public void test1530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1530");
        int[] intArray4 = new int[] { ' ', (short) 100, (byte) -1, '4' };
        int[] intArray6 = ds.MaxMin3.maxMin3(intArray4, (int) (short) 0);
        int[] intArray8 = ds.MaxMin3.maxMin3(intArray6, (int) (byte) -1);
        int[] intArray10 = ds.MaxMin3.maxMin3(intArray8, (-1));
        int[] intArray12 = ds.MaxMin3.maxMin3(intArray10, (int) (short) -1);
        int[] intArray14 = ds.MaxMin3.maxMin3(intArray12, (int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray16 = ds.MaxMin3.maxMin3(intArray12, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[32, 100, -1, 52]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[100, 32]");
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[100, 32]");
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[100, 32]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[100, 100]");
    }

    @Test
    public void test1531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1531");
        int[] intArray2 = new int[] { 10, '4' };
        int[] intArray4 = ds.MaxMin3.maxMin3(intArray2, (int) (short) 1);
        int[] intArray6 = ds.MaxMin3.maxMin3(intArray2, 0);
        int[] intArray8 = ds.MaxMin3.maxMin3(intArray2, (int) (byte) 0);
        int[] intArray10 = ds.MaxMin3.maxMin3(intArray2, (int) (short) 1);
        int[] intArray12 = ds.MaxMin3.maxMin3(intArray10, 0);
        int[] intArray14 = ds.MaxMin3.maxMin3(intArray12, (int) (short) -1);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray16 = ds.MaxMin3.maxMin3(intArray14, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[10, 10]");
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[10, 10]");
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
    }

    @Test
    public void test1532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1532");
        int[] intArray2 = new int[] { 10, '4' };
        int[] intArray4 = ds.MaxMin3.maxMin3(intArray2, (int) (short) 1);
        int[] intArray6 = ds.MaxMin3.maxMin3(intArray4, 0);
        int[] intArray8 = ds.MaxMin3.maxMin3(intArray6, 1);
        int[] intArray10 = ds.MaxMin3.maxMin3(intArray8, (-1));
        int[] intArray12 = ds.MaxMin3.maxMin3(intArray8, (int) (short) 1);
        int[] intArray14 = ds.MaxMin3.maxMin3(intArray12, (int) (byte) 1);
        int[] intArray16 = ds.MaxMin3.maxMin3(intArray12, 1);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[10, 10]");
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[10, 10]");
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
    }

    @Test
    public void test1533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1533");
        int[] intArray2 = new int[] { 10, '4' };
        int[] intArray4 = ds.MaxMin3.maxMin3(intArray2, (int) (short) 1);
        int[] intArray6 = ds.MaxMin3.maxMin3(intArray4, 0);
        int[] intArray8 = ds.MaxMin3.maxMin3(intArray4, (int) (byte) -1);
        int[] intArray10 = ds.MaxMin3.maxMin3(intArray8, (int) (byte) 0);
        int[] intArray12 = ds.MaxMin3.maxMin3(intArray8, (int) (byte) -1);
        int[] intArray14 = ds.MaxMin3.maxMin3(intArray12, 0);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray16 = ds.MaxMin3.maxMin3(intArray12, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[10, 10]");
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[10, 10]");
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
    }

    @Test
    public void test1534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1534");
        int[] intArray2 = new int[] { 10, '4' };
        int[] intArray4 = ds.MaxMin3.maxMin3(intArray2, (int) (short) 1);
        int[] intArray6 = ds.MaxMin3.maxMin3(intArray4, 0);
        int[] intArray8 = ds.MaxMin3.maxMin3(intArray4, 0);
        int[] intArray10 = ds.MaxMin3.maxMin3(intArray8, 1);
        int[] intArray12 = ds.MaxMin3.maxMin3(intArray8, (int) (byte) -1);
        int[] intArray14 = ds.MaxMin3.maxMin3(intArray12, (int) (byte) 0);
        int[] intArray16 = ds.MaxMin3.maxMin3(intArray12, (int) (short) 1);
        int[] intArray18 = ds.MaxMin3.maxMin3(intArray16, (int) (short) 1);
        int[] intArray20 = ds.MaxMin3.maxMin3(intArray16, (-1));
        int[] intArray22 = ds.MaxMin3.maxMin3(intArray16, (int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray24 = ds.MaxMin3.maxMin3(intArray22, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[10, 10]");
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[10, 10]");
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
        org.junit.Assert.assertNotNull(intArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray20), "[10, 10]");
        org.junit.Assert.assertNotNull(intArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray22), "[10, 10]");
    }

    @Test
    public void test1535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1535");
        int[] intArray3 = new int[] { ' ', 1, (short) 10 };
        int[] intArray5 = ds.MaxMin3.maxMin3(intArray3, (int) (short) 0);
        int[] intArray7 = ds.MaxMin3.maxMin3(intArray3, (int) (short) 1);
        int[] intArray9 = ds.MaxMin3.maxMin3(intArray3, 0);
        int[] intArray11 = ds.MaxMin3.maxMin3(intArray3, (-1));
        int[] intArray13 = ds.MaxMin3.maxMin3(intArray11, 0);
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[32, 32, 10]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[32, 1]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[32, 32]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[32, 32]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[32, 32]");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[32, 32]");
    }

    @Test
    public void test1536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1536");
        int[] intArray5 = new int[] { 0, (short) 100, '#', (byte) 100, ' ' };
        int[] intArray7 = ds.MaxMin3.maxMin3(intArray5, 1);
        int[] intArray9 = ds.MaxMin3.maxMin3(intArray5, (int) (short) 0);
        int[] intArray11 = ds.MaxMin3.maxMin3(intArray5, (-1));
        int[] intArray13 = ds.MaxMin3.maxMin3(intArray5, (int) (byte) 1);
        int[] intArray15 = ds.MaxMin3.maxMin3(intArray13, (int) (byte) 1);
        int[] intArray17 = ds.MaxMin3.maxMin3(intArray15, (int) (byte) 0);
        int[] intArray19 = ds.MaxMin3.maxMin3(intArray17, (int) (short) -1);
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[0, 0, 35, 100, 32]");
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
    public void test1537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1537");
        int[] intArray2 = new int[] { 10, '4' };
        int[] intArray4 = ds.MaxMin3.maxMin3(intArray2, (int) (short) 1);
        int[] intArray6 = ds.MaxMin3.maxMin3(intArray4, 0);
        int[] intArray8 = ds.MaxMin3.maxMin3(intArray4, 0);
        int[] intArray10 = ds.MaxMin3.maxMin3(intArray8, 1);
        int[] intArray12 = ds.MaxMin3.maxMin3(intArray8, (int) (byte) -1);
        int[] intArray14 = ds.MaxMin3.maxMin3(intArray12, (int) (byte) 0);
        int[] intArray16 = ds.MaxMin3.maxMin3(intArray12, (int) (short) 1);
        int[] intArray18 = ds.MaxMin3.maxMin3(intArray16, (int) (short) 1);
        int[] intArray20 = ds.MaxMin3.maxMin3(intArray16, 0);
        int[] intArray22 = ds.MaxMin3.maxMin3(intArray20, (int) (short) 1);
        int[] intArray24 = ds.MaxMin3.maxMin3(intArray22, 0);
        int[] intArray26 = ds.MaxMin3.maxMin3(intArray24, (int) (byte) -1);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[10, 10]");
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[10, 10]");
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
        org.junit.Assert.assertNotNull(intArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray20), "[10, 10]");
        org.junit.Assert.assertNotNull(intArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray22), "[10, 10]");
        org.junit.Assert.assertNotNull(intArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray24), "[10, 10]");
        org.junit.Assert.assertNotNull(intArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray26), "[10, 10]");
    }

    @Test
    public void test1538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1538");
        int[] intArray2 = new int[] { 10, '4' };
        int[] intArray4 = ds.MaxMin3.maxMin3(intArray2, (int) (short) 1);
        int[] intArray6 = ds.MaxMin3.maxMin3(intArray4, 0);
        int[] intArray8 = ds.MaxMin3.maxMin3(intArray4, 0);
        int[] intArray10 = ds.MaxMin3.maxMin3(intArray8, 0);
        int[] intArray12 = ds.MaxMin3.maxMin3(intArray10, (int) (short) 0);
        int[] intArray14 = ds.MaxMin3.maxMin3(intArray10, (int) (short) -1);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray16 = ds.MaxMin3.maxMin3(intArray14, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[10, 10]");
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[10, 10]");
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
    }

    @Test
    public void test1539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1539");
        int[] intArray5 = new int[] { 0, (short) 100, '#', (byte) 100, ' ' };
        int[] intArray7 = ds.MaxMin3.maxMin3(intArray5, 1);
        int[] intArray9 = ds.MaxMin3.maxMin3(intArray5, (int) (short) 0);
        int[] intArray11 = ds.MaxMin3.maxMin3(intArray5, (-1));
        int[] intArray13 = ds.MaxMin3.maxMin3(intArray5, 1);
        int[] intArray15 = ds.MaxMin3.maxMin3(intArray5, (int) (short) 0);
        int[] intArray17 = ds.MaxMin3.maxMin3(intArray5, (int) (byte) 0);
        int[] intArray19 = ds.MaxMin3.maxMin3(intArray17, (int) (short) -1);
        int[] intArray21 = ds.MaxMin3.maxMin3(intArray19, (int) (byte) -1);
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[0, 0, 35, 100, 32]");
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
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray21), "[0, 0]");
    }

    @Test
    public void test1540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1540");
        int[] intArray2 = new int[] { 10, '4' };
        int[] intArray4 = ds.MaxMin3.maxMin3(intArray2, (int) (short) 1);
        int[] intArray6 = ds.MaxMin3.maxMin3(intArray4, 0);
        int[] intArray8 = ds.MaxMin3.maxMin3(intArray4, 0);
        int[] intArray10 = ds.MaxMin3.maxMin3(intArray8, 1);
        int[] intArray12 = ds.MaxMin3.maxMin3(intArray8, (int) (byte) -1);
        int[] intArray14 = ds.MaxMin3.maxMin3(intArray12, (int) (byte) 0);
        int[] intArray16 = ds.MaxMin3.maxMin3(intArray12, (int) (short) 1);
        int[] intArray18 = ds.MaxMin3.maxMin3(intArray16, (int) (short) 1);
        int[] intArray20 = ds.MaxMin3.maxMin3(intArray16, 0);
        int[] intArray22 = ds.MaxMin3.maxMin3(intArray20, (int) (short) 1);
        java.lang.Class<?> wildcardClass23 = intArray20.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[10, 10]");
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[10, 10]");
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
        org.junit.Assert.assertNotNull(intArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray20), "[10, 10]");
        org.junit.Assert.assertNotNull(intArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray22), "[10, 10]");
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test1541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1541");
        int[] intArray2 = new int[] { 10, '4' };
        int[] intArray4 = ds.MaxMin3.maxMin3(intArray2, (int) (short) 1);
        int[] intArray6 = ds.MaxMin3.maxMin3(intArray4, 0);
        int[] intArray8 = ds.MaxMin3.maxMin3(intArray4, (int) (byte) -1);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray10 = ds.MaxMin3.maxMin3(intArray4, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[10, 10]");
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[10, 10]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[10, 10]");
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[10, 10]");
    }

    @Test
    public void test1542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1542");
        int[] intArray2 = new int[] { 10, '4' };
        int[] intArray4 = ds.MaxMin3.maxMin3(intArray2, (int) (short) 1);
        int[] intArray6 = ds.MaxMin3.maxMin3(intArray4, 0);
        int[] intArray8 = ds.MaxMin3.maxMin3(intArray4, 0);
        int[] intArray10 = ds.MaxMin3.maxMin3(intArray8, 1);
        int[] intArray12 = ds.MaxMin3.maxMin3(intArray8, 1);
        int[] intArray14 = ds.MaxMin3.maxMin3(intArray12, (int) (short) 1);
        int[] intArray16 = ds.MaxMin3.maxMin3(intArray14, (int) (short) 1);
        int[] intArray18 = ds.MaxMin3.maxMin3(intArray14, (int) (byte) -1);
        int[] intArray20 = ds.MaxMin3.maxMin3(intArray18, 0);
        int[] intArray22 = ds.MaxMin3.maxMin3(intArray20, (-1));
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[10, 10]");
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[10, 10]");
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
        org.junit.Assert.assertNotNull(intArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray20), "[10, 10]");
        org.junit.Assert.assertNotNull(intArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray22), "[10, 10]");
    }
}

