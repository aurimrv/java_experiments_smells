package ds.seed9006;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class Randoop1 {

    public static boolean debug = false;

    @Test
    public void test501() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test501");
        int[] intArray2 = new int[] { (short) 100, 10 };
        int[] intArray4 = ds.MaxMin2.maxMin2(intArray2, (int) (byte) -1);
        int[] intArray6 = ds.MaxMin2.maxMin2(intArray4, (int) (short) 0);
        int[] intArray8 = ds.MaxMin2.maxMin2(intArray4, (int) (short) 1);
        int[] intArray10 = ds.MaxMin2.maxMin2(intArray8, (int) (short) -1);
        int[] intArray12 = ds.MaxMin2.maxMin2(intArray8, (int) (short) 1);
        int[] intArray14 = ds.MaxMin2.maxMin2(intArray8, (int) (short) 0);
        int[] intArray16 = ds.MaxMin2.maxMin2(intArray14, (int) (byte) 1);
        int[] intArray18 = ds.MaxMin2.maxMin2(intArray16, 1);
        java.lang.Class<?> wildcardClass19 = intArray18.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[100, 10]");
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray16), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray18), "[100, 100]");
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test502");
        int[] intArray2 = new int[] { (short) 100, 10 };
        int[] intArray4 = ds.MaxMin2.maxMin2(intArray2, (int) (byte) -1);
        int[] intArray6 = ds.MaxMin2.maxMin2(intArray2, (int) (byte) -1);
        int[] intArray8 = ds.MaxMin2.maxMin2(intArray6, (int) (byte) -1);
        int[] intArray10 = ds.MaxMin2.maxMin2(intArray8, (-1));
        int[] intArray12 = ds.MaxMin2.maxMin2(intArray8, (int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray14 = ds.MaxMin2.maxMin2(intArray12, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[100, 10]");
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[100, 100]");
    }

    @Test
    public void test503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test503");
        int[] intArray2 = new int[] { (short) 100, 10 };
        int[] intArray4 = ds.MaxMin2.maxMin2(intArray2, (int) (byte) -1);
        int[] intArray6 = ds.MaxMin2.maxMin2(intArray2, (int) (byte) -1);
        int[] intArray8 = ds.MaxMin2.maxMin2(intArray6, (int) (byte) 0);
        int[] intArray10 = ds.MaxMin2.maxMin2(intArray8, (int) (short) 1);
        int[] intArray12 = ds.MaxMin2.maxMin2(intArray8, (int) (short) -1);
        int[] intArray14 = ds.MaxMin2.maxMin2(intArray12, (int) (byte) 0);
        java.lang.Class<?> wildcardClass15 = intArray14.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[100, 10]");
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[100, 100]");
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test504");
        int[] intArray2 = new int[] { (short) 100, 10 };
        int[] intArray4 = ds.MaxMin2.maxMin2(intArray2, (int) (byte) -1);
        int[] intArray6 = ds.MaxMin2.maxMin2(intArray2, (int) (byte) -1);
        int[] intArray8 = ds.MaxMin2.maxMin2(intArray6, (int) (byte) -1);
        int[] intArray10 = ds.MaxMin2.maxMin2(intArray8, (-1));
        int[] intArray12 = ds.MaxMin2.maxMin2(intArray8, 0);
        int[] intArray14 = ds.MaxMin2.maxMin2(intArray12, (int) (byte) 1);
        int[] intArray16 = ds.MaxMin2.maxMin2(intArray12, (int) (short) 0);
        int[] intArray18 = ds.MaxMin2.maxMin2(intArray16, (-1));
        int[] intArray20 = ds.MaxMin2.maxMin2(intArray16, 0);
        int[] intArray22 = ds.MaxMin2.maxMin2(intArray16, (int) (short) 1);
        int[] intArray24 = ds.MaxMin2.maxMin2(intArray16, (int) (byte) 0);
        java.lang.Class<?> wildcardClass25 = intArray16.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[100, 10]");
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray16), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray18), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray20), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray22), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray24), "[100, 100]");
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test505");
        int[] intArray2 = new int[] { (short) 100, 10 };
        int[] intArray4 = ds.MaxMin2.maxMin2(intArray2, (int) (byte) -1);
        int[] intArray6 = ds.MaxMin2.maxMin2(intArray2, (int) (byte) -1);
        int[] intArray8 = ds.MaxMin2.maxMin2(intArray6, (int) (byte) -1);
        int[] intArray10 = ds.MaxMin2.maxMin2(intArray8, (-1));
        int[] intArray12 = ds.MaxMin2.maxMin2(intArray8, (int) (short) 0);
        java.lang.Class<?> wildcardClass13 = intArray8.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[100, 10]");
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[100, 100]");
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test506");
        int[] intArray2 = new int[] { (short) 100, 10 };
        int[] intArray4 = ds.MaxMin2.maxMin2(intArray2, (int) (byte) -1);
        int[] intArray6 = ds.MaxMin2.maxMin2(intArray2, (int) (byte) -1);
        int[] intArray8 = ds.MaxMin2.maxMin2(intArray6, (int) (byte) 0);
        int[] intArray10 = ds.MaxMin2.maxMin2(intArray6, 1);
        int[] intArray12 = ds.MaxMin2.maxMin2(intArray6, (-1));
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray14 = ds.MaxMin2.maxMin2(intArray6, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[100, 10]");
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[100, 100]");
    }

    @Test
    public void test507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test507");
        int[] intArray2 = new int[] { (short) 100, 10 };
        int[] intArray4 = ds.MaxMin2.maxMin2(intArray2, (int) (byte) -1);
        int[] intArray6 = ds.MaxMin2.maxMin2(intArray2, (int) (byte) -1);
        int[] intArray8 = ds.MaxMin2.maxMin2(intArray6, (int) (byte) 0);
        int[] intArray10 = ds.MaxMin2.maxMin2(intArray8, (int) (short) 1);
        int[] intArray12 = ds.MaxMin2.maxMin2(intArray8, (int) (short) -1);
        java.lang.Class<?> wildcardClass13 = intArray12.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[100, 10]");
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[100, 100]");
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test508");
        int[] intArray2 = new int[] { (short) 100, 10 };
        int[] intArray4 = ds.MaxMin2.maxMin2(intArray2, (int) (byte) -1);
        int[] intArray6 = ds.MaxMin2.maxMin2(intArray2, (int) (byte) -1);
        int[] intArray8 = ds.MaxMin2.maxMin2(intArray6, (int) (byte) -1);
        int[] intArray10 = ds.MaxMin2.maxMin2(intArray8, (-1));
        int[] intArray12 = ds.MaxMin2.maxMin2(intArray8, 0);
        int[] intArray14 = ds.MaxMin2.maxMin2(intArray12, (int) (byte) 1);
        int[] intArray16 = ds.MaxMin2.maxMin2(intArray12, (int) (short) 0);
        int[] intArray18 = ds.MaxMin2.maxMin2(intArray16, (-1));
        int[] intArray20 = ds.MaxMin2.maxMin2(intArray18, 0);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray22 = ds.MaxMin2.maxMin2(intArray20, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[100, 10]");
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray16), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray18), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray20), "[100, 100]");
    }

    @Test
    public void test509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test509");
        int[] intArray0 = null;
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray2 = ds.MaxMin2.maxMin2(intArray0, 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test510");
        int[] intArray2 = new int[] { (short) 100, 10 };
        int[] intArray4 = ds.MaxMin2.maxMin2(intArray2, (int) (byte) -1);
        int[] intArray6 = ds.MaxMin2.maxMin2(intArray2, (int) (byte) -1);
        int[] intArray8 = ds.MaxMin2.maxMin2(intArray6, (int) (byte) 0);
        int[] intArray10 = ds.MaxMin2.maxMin2(intArray8, (int) (short) 1);
        int[] intArray12 = ds.MaxMin2.maxMin2(intArray10, (int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray14 = ds.MaxMin2.maxMin2(intArray10, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[100, 10]");
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[100, 100]");
    }

    @Test
    public void test511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test511");
        int[] intArray2 = new int[] { (short) 100, 10 };
        int[] intArray4 = ds.MaxMin2.maxMin2(intArray2, (int) (byte) -1);
        int[] intArray6 = ds.MaxMin2.maxMin2(intArray2, (int) (byte) -1);
        int[] intArray8 = ds.MaxMin2.maxMin2(intArray6, (int) (byte) 0);
        int[] intArray10 = ds.MaxMin2.maxMin2(intArray8, (int) (short) 1);
        int[] intArray12 = ds.MaxMin2.maxMin2(intArray10, (int) (short) 1);
        int[] intArray14 = ds.MaxMin2.maxMin2(intArray10, (int) (byte) -1);
        int[] intArray16 = ds.MaxMin2.maxMin2(intArray10, (int) (short) 1);
        java.lang.Class<?> wildcardClass17 = intArray16.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[100, 10]");
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray16), "[100, 100]");
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test512");
        int[] intArray2 = new int[] { (short) 100, 10 };
        int[] intArray4 = ds.MaxMin2.maxMin2(intArray2, (int) (byte) -1);
        int[] intArray6 = ds.MaxMin2.maxMin2(intArray4, (int) (short) 0);
        int[] intArray8 = ds.MaxMin2.maxMin2(intArray4, (int) (short) 1);
        int[] intArray10 = ds.MaxMin2.maxMin2(intArray8, (int) (short) -1);
        int[] intArray12 = ds.MaxMin2.maxMin2(intArray8, (int) (short) 1);
        int[] intArray14 = ds.MaxMin2.maxMin2(intArray8, (int) (short) 0);
        int[] intArray16 = ds.MaxMin2.maxMin2(intArray8, 0);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray18 = ds.MaxMin2.maxMin2(intArray16, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[100, 10]");
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray16), "[100, 100]");
    }

    @Test
    public void test513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test513");
        int[] intArray2 = new int[] { (short) 100, 10 };
        int[] intArray4 = ds.MaxMin2.maxMin2(intArray2, (int) (byte) -1);
        int[] intArray6 = ds.MaxMin2.maxMin2(intArray2, (int) (byte) -1);
        int[] intArray8 = ds.MaxMin2.maxMin2(intArray6, (int) (byte) 0);
        int[] intArray10 = ds.MaxMin2.maxMin2(intArray6, 1);
        int[] intArray12 = ds.MaxMin2.maxMin2(intArray6, (int) (byte) 0);
        int[] intArray14 = ds.MaxMin2.maxMin2(intArray12, (int) (short) 1);
        int[] intArray16 = ds.MaxMin2.maxMin2(intArray14, (int) (byte) -1);
        int[] intArray18 = ds.MaxMin2.maxMin2(intArray14, (int) (short) -1);
        int[] intArray20 = ds.MaxMin2.maxMin2(intArray14, 0);
        int[] intArray22 = ds.MaxMin2.maxMin2(intArray14, (int) (byte) -1);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[100, 10]");
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray16), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray18), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray20), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray22), "[100, 100]");
    }

    @Test
    public void test514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test514");
        int[] intArray2 = new int[] { (short) 100, 10 };
        int[] intArray4 = ds.MaxMin2.maxMin2(intArray2, (int) (byte) -1);
        int[] intArray6 = ds.MaxMin2.maxMin2(intArray2, (int) (byte) -1);
        int[] intArray8 = ds.MaxMin2.maxMin2(intArray6, (int) (byte) -1);
        int[] intArray10 = ds.MaxMin2.maxMin2(intArray8, (-1));
        int[] intArray12 = ds.MaxMin2.maxMin2(intArray10, (int) (byte) 1);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[100, 10]");
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[100, 100]");
    }

    @Test
    public void test515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test515");
        int[] intArray2 = new int[] { (short) 100, 10 };
        int[] intArray4 = ds.MaxMin2.maxMin2(intArray2, (int) (byte) -1);
        int[] intArray6 = ds.MaxMin2.maxMin2(intArray2, (int) (byte) -1);
        int[] intArray8 = ds.MaxMin2.maxMin2(intArray6, (int) (byte) -1);
        int[] intArray10 = ds.MaxMin2.maxMin2(intArray8, (-1));
        int[] intArray12 = ds.MaxMin2.maxMin2(intArray8, 0);
        int[] intArray14 = ds.MaxMin2.maxMin2(intArray12, (int) (byte) 1);
        int[] intArray16 = ds.MaxMin2.maxMin2(intArray12, (int) (short) 0);
        int[] intArray18 = ds.MaxMin2.maxMin2(intArray16, (-1));
        int[] intArray20 = ds.MaxMin2.maxMin2(intArray18, 1);
        java.lang.Class<?> wildcardClass21 = intArray18.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[100, 10]");
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray16), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray18), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray20), "[100, 100]");
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test516");
        int[] intArray2 = new int[] { (short) 100, 10 };
        int[] intArray4 = ds.MaxMin2.maxMin2(intArray2, (int) (byte) -1);
        int[] intArray6 = ds.MaxMin2.maxMin2(intArray2, (int) (byte) -1);
        int[] intArray8 = ds.MaxMin2.maxMin2(intArray6, (int) (byte) 0);
        int[] intArray10 = ds.MaxMin2.maxMin2(intArray8, 1);
        int[] intArray12 = ds.MaxMin2.maxMin2(intArray10, 0);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray14 = ds.MaxMin2.maxMin2(intArray10, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[100, 10]");
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[100, 100]");
    }

    @Test
    public void test517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test517");
        int[] intArray2 = new int[] { (short) 100, 10 };
        int[] intArray4 = ds.MaxMin2.maxMin2(intArray2, (int) (byte) -1);
        int[] intArray6 = ds.MaxMin2.maxMin2(intArray2, (int) (byte) -1);
        int[] intArray8 = ds.MaxMin2.maxMin2(intArray6, (int) (byte) 0);
        int[] intArray10 = ds.MaxMin2.maxMin2(intArray6, 1);
        int[] intArray12 = ds.MaxMin2.maxMin2(intArray6, (int) (byte) 1);
        int[] intArray14 = ds.MaxMin2.maxMin2(intArray6, (int) (byte) -1);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray16 = ds.MaxMin2.maxMin2(intArray14, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[100, 10]");
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[100, 100]");
    }

    @Test
    public void test518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test518");
        int[] intArray2 = new int[] { (short) 100, 10 };
        int[] intArray4 = ds.MaxMin2.maxMin2(intArray2, (int) (byte) -1);
        int[] intArray6 = ds.MaxMin2.maxMin2(intArray2, (int) (byte) -1);
        int[] intArray8 = ds.MaxMin2.maxMin2(intArray6, (int) (byte) -1);
        int[] intArray10 = ds.MaxMin2.maxMin2(intArray8, (-1));
        int[] intArray12 = ds.MaxMin2.maxMin2(intArray8, 0);
        int[] intArray14 = ds.MaxMin2.maxMin2(intArray12, (int) (byte) 1);
        int[] intArray16 = ds.MaxMin2.maxMin2(intArray14, (int) (byte) 0);
        int[] intArray18 = ds.MaxMin2.maxMin2(intArray14, (int) (byte) -1);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray20 = ds.MaxMin2.maxMin2(intArray18, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[100, 10]");
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray16), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray18), "[100, 100]");
    }

    @Test
    public void test519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test519");
        int[] intArray2 = new int[] { (short) 100, 10 };
        int[] intArray4 = ds.MaxMin2.maxMin2(intArray2, (int) (byte) -1);
        int[] intArray6 = ds.MaxMin2.maxMin2(intArray2, (int) (byte) -1);
        int[] intArray8 = ds.MaxMin2.maxMin2(intArray6, (int) (byte) 0);
        int[] intArray10 = ds.MaxMin2.maxMin2(intArray6, 1);
        int[] intArray12 = ds.MaxMin2.maxMin2(intArray6, (int) (byte) 0);
        int[] intArray14 = ds.MaxMin2.maxMin2(intArray6, 1);
        int[] intArray16 = ds.MaxMin2.maxMin2(intArray6, 0);
        int[] intArray18 = ds.MaxMin2.maxMin2(intArray16, (-1));
        int[] intArray20 = ds.MaxMin2.maxMin2(intArray18, (int) (short) -1);
        int[] intArray22 = ds.MaxMin2.maxMin2(intArray20, (-1));
        int[] intArray24 = ds.MaxMin2.maxMin2(intArray20, 0);
        java.lang.Class<?> wildcardClass25 = intArray20.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[100, 10]");
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray16), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray18), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray20), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray22), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray24), "[100, 100]");
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test520");
        int[] intArray2 = new int[] { (short) 100, 10 };
        int[] intArray4 = ds.MaxMin2.maxMin2(intArray2, (int) (byte) -1);
        int[] intArray6 = ds.MaxMin2.maxMin2(intArray2, (int) (byte) -1);
        int[] intArray8 = ds.MaxMin2.maxMin2(intArray6, (int) (byte) 0);
        int[] intArray10 = ds.MaxMin2.maxMin2(intArray6, 1);
        int[] intArray12 = ds.MaxMin2.maxMin2(intArray6, (int) (short) 0);
        int[] intArray14 = ds.MaxMin2.maxMin2(intArray12, (int) (short) 0);
        int[] intArray16 = ds.MaxMin2.maxMin2(intArray12, 0);
        int[] intArray18 = ds.MaxMin2.maxMin2(intArray12, (int) (byte) 0);
        java.lang.Class<?> wildcardClass19 = intArray18.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[100, 10]");
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray16), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray18), "[100, 100]");
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test521");
        int[] intArray2 = new int[] { (short) 100, 10 };
        int[] intArray4 = ds.MaxMin2.maxMin2(intArray2, (int) (byte) -1);
        int[] intArray6 = ds.MaxMin2.maxMin2(intArray2, (int) (byte) -1);
        int[] intArray8 = ds.MaxMin2.maxMin2(intArray6, (int) (byte) 0);
        int[] intArray10 = ds.MaxMin2.maxMin2(intArray8, (int) (short) 1);
        int[] intArray12 = ds.MaxMin2.maxMin2(intArray10, (int) (byte) -1);
        int[] intArray14 = ds.MaxMin2.maxMin2(intArray12, (int) (short) -1);
        java.lang.Class<?> wildcardClass15 = intArray14.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[100, 10]");
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[100, 100]");
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test522");
        int[] intArray2 = new int[] { (short) 100, 10 };
        int[] intArray4 = ds.MaxMin2.maxMin2(intArray2, (int) (byte) -1);
        int[] intArray6 = ds.MaxMin2.maxMin2(intArray2, (int) (byte) -1);
        int[] intArray8 = ds.MaxMin2.maxMin2(intArray6, (int) (byte) 0);
        int[] intArray10 = ds.MaxMin2.maxMin2(intArray6, 1);
        int[] intArray12 = ds.MaxMin2.maxMin2(intArray6, (int) (byte) 0);
        int[] intArray14 = ds.MaxMin2.maxMin2(intArray12, (int) (short) 1);
        int[] intArray16 = ds.MaxMin2.maxMin2(intArray12, 0);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray18 = ds.MaxMin2.maxMin2(intArray16, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[100, 10]");
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray16), "[100, 100]");
    }

    @Test
    public void test523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test523");
        int[] intArray2 = new int[] { (short) 100, 10 };
        int[] intArray4 = ds.MaxMin2.maxMin2(intArray2, (int) (byte) -1);
        int[] intArray6 = ds.MaxMin2.maxMin2(intArray2, (int) (byte) -1);
        int[] intArray8 = ds.MaxMin2.maxMin2(intArray6, (int) (byte) 0);
        int[] intArray10 = ds.MaxMin2.maxMin2(intArray6, 1);
        int[] intArray12 = ds.MaxMin2.maxMin2(intArray6, (-1));
        int[] intArray14 = ds.MaxMin2.maxMin2(intArray6, 1);
        int[] intArray16 = ds.MaxMin2.maxMin2(intArray14, (int) (short) -1);
        int[] intArray18 = ds.MaxMin2.maxMin2(intArray14, 0);
        int[] intArray20 = ds.MaxMin2.maxMin2(intArray14, (int) (byte) 0);
        int[] intArray22 = ds.MaxMin2.maxMin2(intArray14, 1);
        int[] intArray24 = ds.MaxMin2.maxMin2(intArray22, 0);
        int[] intArray26 = ds.MaxMin2.maxMin2(intArray22, 0);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray28 = ds.MaxMin2.maxMin2(intArray26, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[100, 10]");
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray16), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray18), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray20), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray22), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray24), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray26), "[100, 100]");
    }

    @Test
    public void test524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test524");
        int[] intArray2 = new int[] { (short) 100, 10 };
        int[] intArray4 = ds.MaxMin2.maxMin2(intArray2, (int) (byte) -1);
        int[] intArray6 = ds.MaxMin2.maxMin2(intArray4, (int) (short) 0);
        int[] intArray8 = ds.MaxMin2.maxMin2(intArray6, 0);
        int[] intArray10 = ds.MaxMin2.maxMin2(intArray6, (int) (byte) -1);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray12 = ds.MaxMin2.maxMin2(intArray6, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[100, 10]");
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[100, 100]");
    }

    @Test
    public void test525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test525");
        int[] intArray2 = new int[] { (short) 100, 10 };
        int[] intArray4 = ds.MaxMin2.maxMin2(intArray2, (int) (byte) -1);
        int[] intArray6 = ds.MaxMin2.maxMin2(intArray2, (int) (byte) -1);
        int[] intArray8 = ds.MaxMin2.maxMin2(intArray6, (int) (byte) -1);
        int[] intArray10 = ds.MaxMin2.maxMin2(intArray8, (-1));
        int[] intArray12 = ds.MaxMin2.maxMin2(intArray8, 0);
        int[] intArray14 = ds.MaxMin2.maxMin2(intArray12, (int) (byte) 1);
        int[] intArray16 = ds.MaxMin2.maxMin2(intArray12, (int) (short) 0);
        int[] intArray18 = ds.MaxMin2.maxMin2(intArray16, (-1));
        int[] intArray20 = ds.MaxMin2.maxMin2(intArray16, 0);
        int[] intArray22 = ds.MaxMin2.maxMin2(intArray16, (int) (byte) 0);
        int[] intArray24 = ds.MaxMin2.maxMin2(intArray16, 0);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray26 = ds.MaxMin2.maxMin2(intArray16, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[100, 10]");
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray16), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray18), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray20), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray22), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray24), "[100, 100]");
    }

    @Test
    public void test526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test526");
        int[] intArray2 = new int[] { (short) 100, 10 };
        int[] intArray4 = ds.MaxMin2.maxMin2(intArray2, (int) (byte) -1);
        int[] intArray6 = ds.MaxMin2.maxMin2(intArray2, (int) (byte) -1);
        int[] intArray8 = ds.MaxMin2.maxMin2(intArray6, (int) (byte) 0);
        int[] intArray10 = ds.MaxMin2.maxMin2(intArray6, 1);
        int[] intArray12 = ds.MaxMin2.maxMin2(intArray6, (-1));
        int[] intArray14 = ds.MaxMin2.maxMin2(intArray6, 1);
        int[] intArray16 = ds.MaxMin2.maxMin2(intArray14, (int) (short) -1);
        int[] intArray18 = ds.MaxMin2.maxMin2(intArray14, 0);
        int[] intArray20 = ds.MaxMin2.maxMin2(intArray14, (int) (byte) 0);
        int[] intArray22 = ds.MaxMin2.maxMin2(intArray14, 1);
        int[] intArray24 = ds.MaxMin2.maxMin2(intArray22, (int) (short) 1);
        int[] intArray26 = ds.MaxMin2.maxMin2(intArray22, 1);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[100, 10]");
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray16), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray18), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray20), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray22), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray24), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray26), "[100, 100]");
    }

    @Test
    public void test527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test527");
        int[] intArray2 = new int[] { (short) 100, 10 };
        int[] intArray4 = ds.MaxMin2.maxMin2(intArray2, (int) (byte) -1);
        int[] intArray6 = ds.MaxMin2.maxMin2(intArray2, (int) (byte) -1);
        int[] intArray8 = ds.MaxMin2.maxMin2(intArray6, (int) (byte) 0);
        int[] intArray10 = ds.MaxMin2.maxMin2(intArray6, 1);
        int[] intArray12 = ds.MaxMin2.maxMin2(intArray6, (int) (short) 0);
        int[] intArray14 = ds.MaxMin2.maxMin2(intArray6, (int) (byte) 0);
        int[] intArray16 = ds.MaxMin2.maxMin2(intArray14, 0);
        java.lang.Class<?> wildcardClass17 = intArray14.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[100, 10]");
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray16), "[100, 100]");
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test528");
        int[] intArray2 = new int[] { (short) 100, 10 };
        int[] intArray4 = ds.MaxMin2.maxMin2(intArray2, (int) (byte) -1);
        int[] intArray6 = ds.MaxMin2.maxMin2(intArray2, (int) (byte) -1);
        int[] intArray8 = ds.MaxMin2.maxMin2(intArray6, (int) (byte) 0);
        int[] intArray10 = ds.MaxMin2.maxMin2(intArray6, 1);
        int[] intArray12 = ds.MaxMin2.maxMin2(intArray6, (int) (short) 0);
        int[] intArray14 = ds.MaxMin2.maxMin2(intArray12, (int) (byte) 0);
        int[] intArray16 = ds.MaxMin2.maxMin2(intArray14, (int) (byte) 0);
        int[] intArray18 = ds.MaxMin2.maxMin2(intArray16, (int) (short) 0);
        java.lang.Class<?> wildcardClass19 = intArray18.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[100, 10]");
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray16), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray18), "[100, 100]");
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test529");
        int[] intArray2 = new int[] { (short) 100, 10 };
        int[] intArray4 = ds.MaxMin2.maxMin2(intArray2, (int) (byte) -1);
        int[] intArray6 = ds.MaxMin2.maxMin2(intArray2, (int) (byte) -1);
        int[] intArray8 = ds.MaxMin2.maxMin2(intArray6, (int) (byte) 0);
        int[] intArray10 = ds.MaxMin2.maxMin2(intArray6, 1);
        int[] intArray12 = ds.MaxMin2.maxMin2(intArray6, (int) (byte) 0);
        int[] intArray14 = ds.MaxMin2.maxMin2(intArray6, 1);
        int[] intArray16 = ds.MaxMin2.maxMin2(intArray6, 0);
        int[] intArray18 = ds.MaxMin2.maxMin2(intArray16, (-1));
        int[] intArray20 = ds.MaxMin2.maxMin2(intArray18, (int) (byte) 0);
        int[] intArray22 = ds.MaxMin2.maxMin2(intArray18, (int) (short) -1);
        int[] intArray24 = ds.MaxMin2.maxMin2(intArray22, (int) (short) -1);
        int[] intArray26 = ds.MaxMin2.maxMin2(intArray22, (int) (short) 1);
        java.lang.Class<?> wildcardClass27 = intArray22.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[100, 10]");
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray16), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray18), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray20), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray22), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray24), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray26), "[100, 100]");
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test530");
        int[] intArray2 = new int[] { (short) 100, 10 };
        int[] intArray4 = ds.MaxMin2.maxMin2(intArray2, (int) (byte) -1);
        int[] intArray6 = ds.MaxMin2.maxMin2(intArray2, (int) (byte) -1);
        int[] intArray8 = ds.MaxMin2.maxMin2(intArray6, (int) (byte) 0);
        int[] intArray10 = ds.MaxMin2.maxMin2(intArray6, 1);
        int[] intArray12 = ds.MaxMin2.maxMin2(intArray6, (-1));
        int[] intArray14 = ds.MaxMin2.maxMin2(intArray6, 1);
        int[] intArray16 = ds.MaxMin2.maxMin2(intArray14, (int) (short) -1);
        int[] intArray18 = ds.MaxMin2.maxMin2(intArray14, 0);
        int[] intArray20 = ds.MaxMin2.maxMin2(intArray14, (int) (byte) 0);
        int[] intArray22 = ds.MaxMin2.maxMin2(intArray14, 1);
        int[] intArray24 = ds.MaxMin2.maxMin2(intArray22, (int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray26 = ds.MaxMin2.maxMin2(intArray22, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[100, 10]");
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray16), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray18), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray20), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray22), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray24), "[100, 100]");
    }

    @Test
    public void test531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test531");
        int[] intArray2 = new int[] { (short) 100, 10 };
        int[] intArray4 = ds.MaxMin2.maxMin2(intArray2, (int) (byte) -1);
        int[] intArray6 = ds.MaxMin2.maxMin2(intArray4, (int) (short) 0);
        int[] intArray8 = ds.MaxMin2.maxMin2(intArray6, 0);
        int[] intArray10 = ds.MaxMin2.maxMin2(intArray8, (-1));
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray12 = ds.MaxMin2.maxMin2(intArray8, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[100, 10]");
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[100, 100]");
    }

    @Test
    public void test532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test532");
        int[] intArray2 = new int[] { (short) 100, 10 };
        int[] intArray4 = ds.MaxMin2.maxMin2(intArray2, (int) (byte) -1);
        int[] intArray6 = ds.MaxMin2.maxMin2(intArray2, (int) (byte) -1);
        int[] intArray8 = ds.MaxMin2.maxMin2(intArray6, (int) (byte) -1);
        int[] intArray10 = ds.MaxMin2.maxMin2(intArray8, (-1));
        int[] intArray12 = ds.MaxMin2.maxMin2(intArray8, 0);
        int[] intArray14 = ds.MaxMin2.maxMin2(intArray8, (int) (byte) -1);
        int[] intArray16 = ds.MaxMin2.maxMin2(intArray14, (int) (short) -1);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray18 = ds.MaxMin2.maxMin2(intArray16, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[100, 10]");
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray16), "[100, 100]");
    }

    @Test
    public void test533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test533");
        int[] intArray2 = new int[] { (short) 100, 10 };
        int[] intArray4 = ds.MaxMin2.maxMin2(intArray2, (int) (byte) -1);
        int[] intArray6 = ds.MaxMin2.maxMin2(intArray2, (int) (byte) -1);
        int[] intArray8 = ds.MaxMin2.maxMin2(intArray6, (int) (byte) 0);
        int[] intArray10 = ds.MaxMin2.maxMin2(intArray6, 1);
        int[] intArray12 = ds.MaxMin2.maxMin2(intArray6, (int) (byte) 0);
        int[] intArray14 = ds.MaxMin2.maxMin2(intArray6, 1);
        int[] intArray16 = ds.MaxMin2.maxMin2(intArray6, 0);
        int[] intArray18 = ds.MaxMin2.maxMin2(intArray16, (-1));
        int[] intArray20 = ds.MaxMin2.maxMin2(intArray18, (int) (short) -1);
        int[] intArray22 = ds.MaxMin2.maxMin2(intArray20, (-1));
        int[] intArray24 = ds.MaxMin2.maxMin2(intArray22, 1);
        int[] intArray26 = ds.MaxMin2.maxMin2(intArray22, (-1));
        java.lang.Class<?> wildcardClass27 = intArray26.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[100, 10]");
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray16), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray18), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray20), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray22), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray24), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray26), "[100, 100]");
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test534");
        int[] intArray2 = new int[] { (short) 100, 10 };
        int[] intArray4 = ds.MaxMin2.maxMin2(intArray2, (int) (byte) -1);
        int[] intArray6 = ds.MaxMin2.maxMin2(intArray2, (int) (byte) -1);
        int[] intArray8 = ds.MaxMin2.maxMin2(intArray6, (int) (byte) 0);
        int[] intArray10 = ds.MaxMin2.maxMin2(intArray6, 1);
        int[] intArray12 = ds.MaxMin2.maxMin2(intArray6, (int) (byte) 0);
        int[] intArray14 = ds.MaxMin2.maxMin2(intArray12, (int) (short) 1);
        int[] intArray16 = ds.MaxMin2.maxMin2(intArray14, (int) (byte) -1);
        java.lang.Class<?> wildcardClass17 = intArray16.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[100, 10]");
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray16), "[100, 100]");
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test535");
        int[] intArray2 = new int[] { (short) 100, 10 };
        int[] intArray4 = ds.MaxMin2.maxMin2(intArray2, (int) (byte) -1);
        int[] intArray6 = ds.MaxMin2.maxMin2(intArray2, (int) (byte) -1);
        int[] intArray8 = ds.MaxMin2.maxMin2(intArray6, (int) (byte) 0);
        int[] intArray10 = ds.MaxMin2.maxMin2(intArray6, 1);
        int[] intArray12 = ds.MaxMin2.maxMin2(intArray6, (int) (short) 0);
        int[] intArray14 = ds.MaxMin2.maxMin2(intArray12, (int) (short) 0);
        int[] intArray16 = ds.MaxMin2.maxMin2(intArray12, 0);
        int[] intArray18 = ds.MaxMin2.maxMin2(intArray12, (int) (byte) 0);
        int[] intArray20 = ds.MaxMin2.maxMin2(intArray12, (int) (short) 1);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[100, 10]");
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray16), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray18), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray20), "[100, 100]");
    }

    @Test
    public void test536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test536");
        int[] intArray2 = new int[] { (short) 100, 10 };
        int[] intArray4 = ds.MaxMin2.maxMin2(intArray2, (int) (byte) -1);
        int[] intArray6 = ds.MaxMin2.maxMin2(intArray2, (int) (byte) -1);
        int[] intArray8 = ds.MaxMin2.maxMin2(intArray6, (int) (byte) 0);
        int[] intArray10 = ds.MaxMin2.maxMin2(intArray6, 1);
        int[] intArray12 = ds.MaxMin2.maxMin2(intArray6, (int) (short) 0);
        int[] intArray14 = ds.MaxMin2.maxMin2(intArray6, (int) (byte) 0);
        int[] intArray16 = ds.MaxMin2.maxMin2(intArray6, (int) (short) 0);
        int[] intArray18 = ds.MaxMin2.maxMin2(intArray16, 0);
        int[] intArray20 = ds.MaxMin2.maxMin2(intArray18, (int) (short) -1);
        int[] intArray22 = ds.MaxMin2.maxMin2(intArray20, (-1));
        int[] intArray24 = ds.MaxMin2.maxMin2(intArray22, (int) (byte) -1);
        int[] intArray26 = ds.MaxMin2.maxMin2(intArray24, (int) (short) 1);
        int[] intArray28 = ds.MaxMin2.maxMin2(intArray24, (-1));
        java.lang.Class<?> wildcardClass29 = intArray24.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[100, 10]");
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray16), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray18), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray20), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray22), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray24), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray26), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray28);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray28), "[100, 100]");
        org.junit.Assert.assertNotNull(wildcardClass29);
    }

    @Test
    public void test537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test537");
        int[] intArray2 = new int[] { (short) 100, 10 };
        int[] intArray4 = ds.MaxMin2.maxMin2(intArray2, (int) (byte) -1);
        int[] intArray6 = ds.MaxMin2.maxMin2(intArray2, (int) (byte) -1);
        int[] intArray8 = ds.MaxMin2.maxMin2(intArray6, (int) (byte) -1);
        int[] intArray10 = ds.MaxMin2.maxMin2(intArray8, (-1));
        int[] intArray12 = ds.MaxMin2.maxMin2(intArray8, 0);
        int[] intArray14 = ds.MaxMin2.maxMin2(intArray8, (int) (byte) -1);
        int[] intArray16 = ds.MaxMin2.maxMin2(intArray8, 0);
        int[] intArray18 = ds.MaxMin2.maxMin2(intArray16, (int) (short) 0);
        java.lang.Class<?> wildcardClass19 = intArray16.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[100, 10]");
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray16), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray18), "[100, 100]");
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test538");
        int[] intArray2 = new int[] { (short) 100, 10 };
        int[] intArray4 = ds.MaxMin2.maxMin2(intArray2, (int) (byte) -1);
        int[] intArray6 = ds.MaxMin2.maxMin2(intArray2, (int) (byte) -1);
        int[] intArray8 = ds.MaxMin2.maxMin2(intArray6, (int) (byte) 0);
        int[] intArray10 = ds.MaxMin2.maxMin2(intArray6, 1);
        int[] intArray12 = ds.MaxMin2.maxMin2(intArray6, (int) (short) 0);
        int[] intArray14 = ds.MaxMin2.maxMin2(intArray6, (int) (byte) 0);
        int[] intArray16 = ds.MaxMin2.maxMin2(intArray6, (int) (short) 0);
        int[] intArray18 = ds.MaxMin2.maxMin2(intArray16, 0);
        int[] intArray20 = ds.MaxMin2.maxMin2(intArray18, (int) (short) -1);
        int[] intArray22 = ds.MaxMin2.maxMin2(intArray20, (-1));
        int[] intArray24 = ds.MaxMin2.maxMin2(intArray22, (int) (byte) -1);
        int[] intArray26 = ds.MaxMin2.maxMin2(intArray24, (int) (short) 1);
        int[] intArray28 = ds.MaxMin2.maxMin2(intArray24, (-1));
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray30 = ds.MaxMin2.maxMin2(intArray28, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[100, 10]");
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray16), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray18), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray20), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray22), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray24), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray26), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray28);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray28), "[100, 100]");
    }

    @Test
    public void test539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test539");
        int[] intArray2 = new int[] { (short) 100, 10 };
        int[] intArray4 = ds.MaxMin2.maxMin2(intArray2, (int) (byte) -1);
        int[] intArray6 = ds.MaxMin2.maxMin2(intArray2, (int) (byte) -1);
        int[] intArray8 = ds.MaxMin2.maxMin2(intArray6, (int) (byte) 0);
        int[] intArray10 = ds.MaxMin2.maxMin2(intArray6, 1);
        int[] intArray12 = ds.MaxMin2.maxMin2(intArray6, (int) (byte) 0);
        int[] intArray14 = ds.MaxMin2.maxMin2(intArray6, (int) (short) 0);
        int[] intArray16 = ds.MaxMin2.maxMin2(intArray14, (int) (short) 1);
        java.lang.Class<?> wildcardClass17 = intArray14.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[100, 10]");
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray16), "[100, 100]");
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test540");
        int[] intArray2 = new int[] { (short) 100, 10 };
        int[] intArray4 = ds.MaxMin2.maxMin2(intArray2, (int) (byte) -1);
        int[] intArray6 = ds.MaxMin2.maxMin2(intArray2, (int) (byte) -1);
        int[] intArray8 = ds.MaxMin2.maxMin2(intArray6, (int) (byte) 0);
        int[] intArray10 = ds.MaxMin2.maxMin2(intArray8, (int) (short) 1);
        int[] intArray12 = ds.MaxMin2.maxMin2(intArray8, (int) (short) -1);
        int[] intArray14 = ds.MaxMin2.maxMin2(intArray8, 1);
        java.lang.Class<?> wildcardClass15 = intArray8.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[100, 10]");
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[100, 100]");
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test541");
        int[] intArray2 = new int[] { (short) 100, 10 };
        int[] intArray4 = ds.MaxMin2.maxMin2(intArray2, (int) (byte) -1);
        int[] intArray6 = ds.MaxMin2.maxMin2(intArray2, (int) (byte) -1);
        int[] intArray8 = ds.MaxMin2.maxMin2(intArray6, (int) (byte) 0);
        int[] intArray10 = ds.MaxMin2.maxMin2(intArray6, 1);
        int[] intArray12 = ds.MaxMin2.maxMin2(intArray6, (-1));
        int[] intArray14 = ds.MaxMin2.maxMin2(intArray6, 1);
        int[] intArray16 = ds.MaxMin2.maxMin2(intArray14, (int) (short) -1);
        int[] intArray18 = ds.MaxMin2.maxMin2(intArray14, 0);
        int[] intArray20 = ds.MaxMin2.maxMin2(intArray14, (int) (byte) 0);
        int[] intArray22 = ds.MaxMin2.maxMin2(intArray14, 1);
        int[] intArray24 = ds.MaxMin2.maxMin2(intArray14, 0);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray26 = ds.MaxMin2.maxMin2(intArray24, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[100, 10]");
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray16), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray18), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray20), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray22), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray24), "[100, 100]");
    }

    @Test
    public void test542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test542");
        int[] intArray2 = new int[] { (short) 100, 10 };
        int[] intArray4 = ds.MaxMin2.maxMin2(intArray2, (int) (byte) -1);
        int[] intArray6 = ds.MaxMin2.maxMin2(intArray2, (int) (byte) -1);
        int[] intArray8 = ds.MaxMin2.maxMin2(intArray6, (int) (byte) 0);
        int[] intArray10 = ds.MaxMin2.maxMin2(intArray6, 1);
        int[] intArray12 = ds.MaxMin2.maxMin2(intArray6, (int) (byte) 0);
        int[] intArray14 = ds.MaxMin2.maxMin2(intArray12, (int) (short) 1);
        int[] intArray16 = ds.MaxMin2.maxMin2(intArray12, 0);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray18 = ds.MaxMin2.maxMin2(intArray16, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[100, 10]");
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray16), "[100, 100]");
    }

    @Test
    public void test543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test543");
        int[] intArray2 = new int[] { (short) 100, 10 };
        int[] intArray4 = ds.MaxMin2.maxMin2(intArray2, (int) (byte) -1);
        int[] intArray6 = ds.MaxMin2.maxMin2(intArray2, (int) (byte) -1);
        int[] intArray8 = ds.MaxMin2.maxMin2(intArray6, (int) (byte) 0);
        int[] intArray10 = ds.MaxMin2.maxMin2(intArray6, 1);
        int[] intArray12 = ds.MaxMin2.maxMin2(intArray6, (int) (byte) 0);
        int[] intArray14 = ds.MaxMin2.maxMin2(intArray6, 1);
        int[] intArray16 = ds.MaxMin2.maxMin2(intArray6, 0);
        int[] intArray18 = ds.MaxMin2.maxMin2(intArray16, (-1));
        int[] intArray20 = ds.MaxMin2.maxMin2(intArray18, (int) (byte) 0);
        int[] intArray22 = ds.MaxMin2.maxMin2(intArray18, (int) (short) -1);
        int[] intArray24 = ds.MaxMin2.maxMin2(intArray22, (int) (byte) 1);
        int[] intArray26 = ds.MaxMin2.maxMin2(intArray24, (-1));
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[100, 10]");
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray16), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray18), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray20), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray22), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray24), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray26), "[100, 100]");
    }

    @Test
    public void test544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test544");
        int[] intArray2 = new int[] { (short) 100, 10 };
        int[] intArray4 = ds.MaxMin2.maxMin2(intArray2, (int) (byte) -1);
        int[] intArray6 = ds.MaxMin2.maxMin2(intArray2, (int) (byte) -1);
        int[] intArray8 = ds.MaxMin2.maxMin2(intArray6, (int) (byte) 0);
        int[] intArray10 = ds.MaxMin2.maxMin2(intArray8, (int) (short) 1);
        int[] intArray12 = ds.MaxMin2.maxMin2(intArray10, (int) (byte) 0);
        int[] intArray14 = ds.MaxMin2.maxMin2(intArray12, (int) (short) 0);
        int[] intArray16 = ds.MaxMin2.maxMin2(intArray14, (-1));
        int[] intArray18 = ds.MaxMin2.maxMin2(intArray16, (int) (short) 0);
        int[] intArray20 = ds.MaxMin2.maxMin2(intArray18, (int) (byte) -1);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[100, 10]");
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray16), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray18), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray20), "[100, 100]");
    }

    @Test
    public void test545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test545");
        int[] intArray2 = new int[] { (short) 100, 10 };
        int[] intArray4 = ds.MaxMin2.maxMin2(intArray2, (int) (byte) -1);
        int[] intArray6 = ds.MaxMin2.maxMin2(intArray2, (int) (byte) -1);
        int[] intArray8 = ds.MaxMin2.maxMin2(intArray6, (int) (byte) 0);
        int[] intArray10 = ds.MaxMin2.maxMin2(intArray8, (int) (short) 1);
        int[] intArray12 = ds.MaxMin2.maxMin2(intArray10, (int) (short) 1);
        int[] intArray14 = ds.MaxMin2.maxMin2(intArray10, (int) (byte) -1);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray16 = ds.MaxMin2.maxMin2(intArray10, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[100, 10]");
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[100, 100]");
    }

    @Test
    public void test546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test546");
        int[] intArray2 = new int[] { (short) 100, 10 };
        int[] intArray4 = ds.MaxMin2.maxMin2(intArray2, (int) (byte) -1);
        int[] intArray6 = ds.MaxMin2.maxMin2(intArray2, 1);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[100, 10]");
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[100, 100]");
    }

    @Test
    public void test547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test547");
        int[] intArray2 = new int[] { (short) 100, 10 };
        int[] intArray4 = ds.MaxMin2.maxMin2(intArray2, (int) (byte) -1);
        int[] intArray6 = ds.MaxMin2.maxMin2(intArray4, (int) (short) 0);
        int[] intArray8 = ds.MaxMin2.maxMin2(intArray4, (-1));
        int[] intArray10 = ds.MaxMin2.maxMin2(intArray8, (int) (byte) 0);
        java.lang.Class<?> wildcardClass11 = intArray8.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[100, 10]");
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[100, 100]");
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test548");
        int[] intArray2 = new int[] { (short) 100, 10 };
        int[] intArray4 = ds.MaxMin2.maxMin2(intArray2, (int) (byte) -1);
        int[] intArray6 = ds.MaxMin2.maxMin2(intArray2, (int) (byte) -1);
        int[] intArray8 = ds.MaxMin2.maxMin2(intArray6, (int) (byte) 0);
        int[] intArray10 = ds.MaxMin2.maxMin2(intArray6, 1);
        int[] intArray12 = ds.MaxMin2.maxMin2(intArray6, (int) (short) 0);
        int[] intArray14 = ds.MaxMin2.maxMin2(intArray6, (int) (byte) 0);
        int[] intArray16 = ds.MaxMin2.maxMin2(intArray6, (int) (short) 0);
        int[] intArray18 = ds.MaxMin2.maxMin2(intArray16, 0);
        int[] intArray20 = ds.MaxMin2.maxMin2(intArray18, (int) (short) -1);
        int[] intArray22 = ds.MaxMin2.maxMin2(intArray20, (-1));
        int[] intArray24 = ds.MaxMin2.maxMin2(intArray22, (int) (byte) -1);
        int[] intArray26 = ds.MaxMin2.maxMin2(intArray22, (int) (byte) 0);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[100, 10]");
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray16), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray18), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray20), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray22), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray24), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray26), "[100, 100]");
    }

    @Test
    public void test549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test549");
        int[] intArray2 = new int[] { (short) 100, 10 };
        int[] intArray4 = ds.MaxMin2.maxMin2(intArray2, (int) (byte) -1);
        int[] intArray6 = ds.MaxMin2.maxMin2(intArray2, (int) (byte) -1);
        int[] intArray8 = ds.MaxMin2.maxMin2(intArray6, (int) (byte) 0);
        int[] intArray10 = ds.MaxMin2.maxMin2(intArray6, 1);
        int[] intArray12 = ds.MaxMin2.maxMin2(intArray6, (int) (short) 0);
        int[] intArray14 = ds.MaxMin2.maxMin2(intArray12, (int) (byte) 0);
        int[] intArray16 = ds.MaxMin2.maxMin2(intArray14, (int) (byte) 0);
        int[] intArray18 = ds.MaxMin2.maxMin2(intArray16, (int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray20 = ds.MaxMin2.maxMin2(intArray16, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[100, 10]");
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray16), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray18), "[100, 100]");
    }

    @Test
    public void test550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test550");
        int[] intArray2 = new int[] { (short) 100, 10 };
        int[] intArray4 = ds.MaxMin2.maxMin2(intArray2, (int) (byte) -1);
        int[] intArray6 = ds.MaxMin2.maxMin2(intArray2, (int) (byte) -1);
        int[] intArray8 = ds.MaxMin2.maxMin2(intArray6, (int) (byte) 0);
        int[] intArray10 = ds.MaxMin2.maxMin2(intArray8, 1);
        int[] intArray12 = ds.MaxMin2.maxMin2(intArray10, 0);
        java.lang.Class<?> wildcardClass13 = intArray10.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[100, 10]");
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[100, 100]");
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test551");
        int[] intArray2 = new int[] { (short) 100, 10 };
        int[] intArray4 = ds.MaxMin2.maxMin2(intArray2, (int) (byte) -1);
        int[] intArray6 = ds.MaxMin2.maxMin2(intArray2, (int) (byte) -1);
        int[] intArray8 = ds.MaxMin2.maxMin2(intArray6, (int) (byte) 0);
        int[] intArray10 = ds.MaxMin2.maxMin2(intArray6, 1);
        int[] intArray12 = ds.MaxMin2.maxMin2(intArray6, (int) (byte) 0);
        int[] intArray14 = ds.MaxMin2.maxMin2(intArray6, 1);
        int[] intArray16 = ds.MaxMin2.maxMin2(intArray6, 0);
        int[] intArray18 = ds.MaxMin2.maxMin2(intArray16, (int) (byte) 1);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[100, 10]");
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray16), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray18), "[100, 100]");
    }

    @Test
    public void test552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test552");
        int[] intArray2 = new int[] { (short) 100, 10 };
        int[] intArray4 = ds.MaxMin2.maxMin2(intArray2, (int) (byte) -1);
        int[] intArray6 = ds.MaxMin2.maxMin2(intArray4, (int) (short) 0);
        int[] intArray8 = ds.MaxMin2.maxMin2(intArray6, 0);
        int[] intArray10 = ds.MaxMin2.maxMin2(intArray6, (int) (byte) -1);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray12 = ds.MaxMin2.maxMin2(intArray6, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[100, 10]");
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[100, 100]");
    }

    @Test
    public void test553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test553");
        int[] intArray2 = new int[] { (short) 100, 10 };
        int[] intArray4 = ds.MaxMin2.maxMin2(intArray2, (int) (byte) -1);
        int[] intArray6 = ds.MaxMin2.maxMin2(intArray2, (int) (byte) -1);
        int[] intArray8 = ds.MaxMin2.maxMin2(intArray6, (int) (byte) -1);
        int[] intArray10 = ds.MaxMin2.maxMin2(intArray8, (-1));
        int[] intArray12 = ds.MaxMin2.maxMin2(intArray8, 0);
        int[] intArray14 = ds.MaxMin2.maxMin2(intArray8, (int) (short) 1);
        int[] intArray16 = ds.MaxMin2.maxMin2(intArray14, 0);
        int[] intArray18 = ds.MaxMin2.maxMin2(intArray14, (int) (byte) -1);
        int[] intArray20 = ds.MaxMin2.maxMin2(intArray14, (-1));
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray22 = ds.MaxMin2.maxMin2(intArray20, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[100, 10]");
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray16), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray18), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray20), "[100, 100]");
    }

    @Test
    public void test554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test554");
        int[] intArray2 = new int[] { (short) 100, 10 };
        int[] intArray4 = ds.MaxMin2.maxMin2(intArray2, (int) (byte) -1);
        int[] intArray6 = ds.MaxMin2.maxMin2(intArray2, (int) (byte) -1);
        int[] intArray8 = ds.MaxMin2.maxMin2(intArray6, (int) (byte) -1);
        int[] intArray10 = ds.MaxMin2.maxMin2(intArray6, (int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray12 = ds.MaxMin2.maxMin2(intArray6, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[100, 10]");
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[100, 100]");
    }

    @Test
    public void test555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test555");
        int[] intArray2 = new int[] { (short) 100, 10 };
        int[] intArray4 = ds.MaxMin2.maxMin2(intArray2, (int) (byte) -1);
        int[] intArray6 = ds.MaxMin2.maxMin2(intArray2, (int) (byte) -1);
        int[] intArray8 = ds.MaxMin2.maxMin2(intArray6, (int) (byte) 0);
        int[] intArray10 = ds.MaxMin2.maxMin2(intArray6, 1);
        int[] intArray12 = ds.MaxMin2.maxMin2(intArray6, (-1));
        int[] intArray14 = ds.MaxMin2.maxMin2(intArray6, 1);
        int[] intArray16 = ds.MaxMin2.maxMin2(intArray14, (int) (short) -1);
        int[] intArray18 = ds.MaxMin2.maxMin2(intArray14, 0);
        int[] intArray20 = ds.MaxMin2.maxMin2(intArray14, (int) (byte) 0);
        int[] intArray22 = ds.MaxMin2.maxMin2(intArray14, 0);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray24 = ds.MaxMin2.maxMin2(intArray22, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[100, 10]");
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray16), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray18), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray20), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray22), "[100, 100]");
    }

    @Test
    public void test556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test556");
        int[] intArray2 = new int[] { (short) 100, 10 };
        int[] intArray4 = ds.MaxMin2.maxMin2(intArray2, (int) (byte) -1);
        int[] intArray6 = ds.MaxMin2.maxMin2(intArray2, (int) (byte) -1);
        int[] intArray8 = ds.MaxMin2.maxMin2(intArray6, (int) (byte) 0);
        int[] intArray10 = ds.MaxMin2.maxMin2(intArray6, 1);
        int[] intArray12 = ds.MaxMin2.maxMin2(intArray6, (int) (byte) 0);
        int[] intArray14 = ds.MaxMin2.maxMin2(intArray6, 1);
        int[] intArray16 = ds.MaxMin2.maxMin2(intArray6, 0);
        int[] intArray18 = ds.MaxMin2.maxMin2(intArray16, (-1));
        int[] intArray20 = ds.MaxMin2.maxMin2(intArray18, (int) (byte) 0);
        int[] intArray22 = ds.MaxMin2.maxMin2(intArray18, (int) (short) -1);
        int[] intArray24 = ds.MaxMin2.maxMin2(intArray18, (int) (byte) 0);
        java.lang.Class<?> wildcardClass25 = intArray24.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[100, 10]");
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray16), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray18), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray20), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray22), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray24), "[100, 100]");
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test557");
        int[] intArray2 = new int[] { (short) 100, 10 };
        int[] intArray4 = ds.MaxMin2.maxMin2(intArray2, (int) (byte) -1);
        int[] intArray6 = ds.MaxMin2.maxMin2(intArray2, (int) (byte) -1);
        int[] intArray8 = ds.MaxMin2.maxMin2(intArray6, (int) (byte) 0);
        int[] intArray10 = ds.MaxMin2.maxMin2(intArray6, 1);
        int[] intArray12 = ds.MaxMin2.maxMin2(intArray6, (int) (byte) 0);
        int[] intArray14 = ds.MaxMin2.maxMin2(intArray6, 1);
        int[] intArray16 = ds.MaxMin2.maxMin2(intArray6, 0);
        int[] intArray18 = ds.MaxMin2.maxMin2(intArray16, (-1));
        int[] intArray20 = ds.MaxMin2.maxMin2(intArray18, (int) (byte) 0);
        int[] intArray22 = ds.MaxMin2.maxMin2(intArray18, (int) (short) -1);
        int[] intArray24 = ds.MaxMin2.maxMin2(intArray22, (int) (byte) 1);
        java.lang.Class<?> wildcardClass25 = intArray24.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[100, 10]");
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray16), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray18), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray20), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray22), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray24), "[100, 100]");
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test558");
        int[] intArray2 = new int[] { (short) 100, 10 };
        int[] intArray4 = ds.MaxMin2.maxMin2(intArray2, (int) (byte) -1);
        int[] intArray6 = ds.MaxMin2.maxMin2(intArray2, (int) (byte) -1);
        int[] intArray8 = ds.MaxMin2.maxMin2(intArray6, (int) (byte) 0);
        int[] intArray10 = ds.MaxMin2.maxMin2(intArray6, 1);
        int[] intArray12 = ds.MaxMin2.maxMin2(intArray6, (-1));
        int[] intArray14 = ds.MaxMin2.maxMin2(intArray6, 1);
        int[] intArray16 = ds.MaxMin2.maxMin2(intArray14, (int) (short) -1);
        int[] intArray18 = ds.MaxMin2.maxMin2(intArray14, 0);
        int[] intArray20 = ds.MaxMin2.maxMin2(intArray14, (int) (byte) 0);
        int[] intArray22 = ds.MaxMin2.maxMin2(intArray14, 1);
        int[] intArray24 = ds.MaxMin2.maxMin2(intArray14, 0);
        int[] intArray26 = ds.MaxMin2.maxMin2(intArray14, (int) (byte) 1);
        int[] intArray28 = ds.MaxMin2.maxMin2(intArray26, (int) (byte) 1);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[100, 10]");
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray16), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray18), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray20), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray22), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray24), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray26), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray28);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray28), "[100, 100]");
    }

    @Test
    public void test559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test559");
        int[] intArray0 = null;
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray2 = ds.MaxMin2.maxMin2(intArray0, (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test560");
        int[] intArray2 = new int[] { (short) 100, 10 };
        int[] intArray4 = ds.MaxMin2.maxMin2(intArray2, (int) (byte) -1);
        int[] intArray6 = ds.MaxMin2.maxMin2(intArray4, (int) (short) 0);
        int[] intArray8 = ds.MaxMin2.maxMin2(intArray4, (int) (short) 1);
        int[] intArray10 = ds.MaxMin2.maxMin2(intArray8, (int) (short) -1);
        int[] intArray12 = ds.MaxMin2.maxMin2(intArray8, (int) (short) 1);
        int[] intArray14 = ds.MaxMin2.maxMin2(intArray8, (int) (short) 0);
        int[] intArray16 = ds.MaxMin2.maxMin2(intArray14, (int) (byte) 1);
        java.lang.Class<?> wildcardClass17 = intArray16.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[100, 10]");
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray16), "[100, 100]");
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test561");
        int[] intArray2 = new int[] { (short) 100, 10 };
        int[] intArray4 = ds.MaxMin2.maxMin2(intArray2, (int) (byte) -1);
        int[] intArray6 = ds.MaxMin2.maxMin2(intArray2, (int) (byte) -1);
        int[] intArray8 = ds.MaxMin2.maxMin2(intArray6, (int) (byte) -1);
        int[] intArray10 = ds.MaxMin2.maxMin2(intArray8, (-1));
        int[] intArray12 = ds.MaxMin2.maxMin2(intArray8, 0);
        int[] intArray14 = ds.MaxMin2.maxMin2(intArray12, (int) (byte) 1);
        int[] intArray16 = ds.MaxMin2.maxMin2(intArray12, (int) (short) 0);
        int[] intArray18 = ds.MaxMin2.maxMin2(intArray16, (-1));
        int[] intArray20 = ds.MaxMin2.maxMin2(intArray16, 0);
        int[] intArray22 = ds.MaxMin2.maxMin2(intArray16, (int) (byte) 0);
        int[] intArray24 = ds.MaxMin2.maxMin2(intArray16, 0);
        int[] intArray26 = ds.MaxMin2.maxMin2(intArray16, (int) (short) -1);
        java.lang.Class<?> wildcardClass27 = intArray26.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[100, 10]");
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray16), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray18), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray20), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray22), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray24), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray26), "[100, 100]");
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test562");
        int[] intArray2 = new int[] { (short) 100, 10 };
        int[] intArray4 = ds.MaxMin2.maxMin2(intArray2, (int) (byte) -1);
        int[] intArray6 = ds.MaxMin2.maxMin2(intArray2, (int) (byte) -1);
        int[] intArray8 = ds.MaxMin2.maxMin2(intArray6, (int) (byte) -1);
        int[] intArray10 = ds.MaxMin2.maxMin2(intArray8, (-1));
        int[] intArray12 = ds.MaxMin2.maxMin2(intArray8, 0);
        int[] intArray14 = ds.MaxMin2.maxMin2(intArray12, (int) (byte) 1);
        int[] intArray16 = ds.MaxMin2.maxMin2(intArray12, (int) (short) 0);
        int[] intArray18 = ds.MaxMin2.maxMin2(intArray16, (-1));
        int[] intArray20 = ds.MaxMin2.maxMin2(intArray18, 1);
        java.lang.Class<?> wildcardClass21 = intArray20.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[100, 10]");
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray16), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray18), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray20), "[100, 100]");
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test563");
        int[] intArray2 = new int[] { (short) 100, 10 };
        int[] intArray4 = ds.MaxMin2.maxMin2(intArray2, (int) (byte) -1);
        int[] intArray6 = ds.MaxMin2.maxMin2(intArray2, (int) (byte) -1);
        int[] intArray8 = ds.MaxMin2.maxMin2(intArray6, (int) (byte) 0);
        int[] intArray10 = ds.MaxMin2.maxMin2(intArray6, 1);
        int[] intArray12 = ds.MaxMin2.maxMin2(intArray6, (int) (short) 0);
        int[] intArray14 = ds.MaxMin2.maxMin2(intArray6, (int) (byte) 0);
        int[] intArray16 = ds.MaxMin2.maxMin2(intArray14, 0);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray18 = ds.MaxMin2.maxMin2(intArray14, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[100, 10]");
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray16), "[100, 100]");
    }

    @Test
    public void test564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test564");
        int[] intArray2 = new int[] { (short) 100, 10 };
        int[] intArray4 = ds.MaxMin2.maxMin2(intArray2, (int) (byte) -1);
        int[] intArray6 = ds.MaxMin2.maxMin2(intArray2, (int) (byte) -1);
        int[] intArray8 = ds.MaxMin2.maxMin2(intArray6, (int) (byte) 0);
        int[] intArray10 = ds.MaxMin2.maxMin2(intArray6, 1);
        int[] intArray12 = ds.MaxMin2.maxMin2(intArray6, (int) (byte) 0);
        int[] intArray14 = ds.MaxMin2.maxMin2(intArray6, 1);
        int[] intArray16 = ds.MaxMin2.maxMin2(intArray6, 0);
        int[] intArray18 = ds.MaxMin2.maxMin2(intArray16, (-1));
        int[] intArray20 = ds.MaxMin2.maxMin2(intArray18, (int) (short) -1);
        int[] intArray22 = ds.MaxMin2.maxMin2(intArray20, (-1));
        int[] intArray24 = ds.MaxMin2.maxMin2(intArray20, 0);
        int[] intArray26 = ds.MaxMin2.maxMin2(intArray20, (int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray28 = ds.MaxMin2.maxMin2(intArray20, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[100, 10]");
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray16), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray18), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray20), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray22), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray24), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray26), "[100, 100]");
    }

    @Test
    public void test565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test565");
        int[] intArray2 = new int[] { (short) 100, 10 };
        int[] intArray4 = ds.MaxMin2.maxMin2(intArray2, (int) (byte) -1);
        int[] intArray6 = ds.MaxMin2.maxMin2(intArray4, (int) (short) 0);
        int[] intArray8 = ds.MaxMin2.maxMin2(intArray6, 0);
        int[] intArray10 = ds.MaxMin2.maxMin2(intArray8, (-1));
        int[] intArray12 = ds.MaxMin2.maxMin2(intArray10, (int) (byte) 0);
        int[] intArray14 = ds.MaxMin2.maxMin2(intArray12, 0);
        int[] intArray16 = ds.MaxMin2.maxMin2(intArray12, (-1));
        java.lang.Class<?> wildcardClass17 = intArray16.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[100, 10]");
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray16), "[100, 100]");
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test566");
        int[] intArray2 = new int[] { (short) 100, 10 };
        int[] intArray4 = ds.MaxMin2.maxMin2(intArray2, (int) (byte) -1);
        int[] intArray6 = ds.MaxMin2.maxMin2(intArray2, (int) (byte) -1);
        int[] intArray8 = ds.MaxMin2.maxMin2(intArray6, (int) (byte) 0);
        int[] intArray10 = ds.MaxMin2.maxMin2(intArray6, 1);
        int[] intArray12 = ds.MaxMin2.maxMin2(intArray6, (int) (byte) 0);
        int[] intArray14 = ds.MaxMin2.maxMin2(intArray6, 1);
        int[] intArray16 = ds.MaxMin2.maxMin2(intArray6, (int) (byte) -1);
        int[] intArray18 = ds.MaxMin2.maxMin2(intArray6, (int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray20 = ds.MaxMin2.maxMin2(intArray6, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[100, 10]");
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray16), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray18), "[100, 100]");
    }

    @Test
    public void test567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test567");
        int[] intArray2 = new int[] { (short) 100, 10 };
        int[] intArray4 = ds.MaxMin2.maxMin2(intArray2, (int) (byte) -1);
        int[] intArray6 = ds.MaxMin2.maxMin2(intArray2, (int) (byte) -1);
        int[] intArray8 = ds.MaxMin2.maxMin2(intArray6, (int) (byte) -1);
        int[] intArray10 = ds.MaxMin2.maxMin2(intArray8, (-1));
        int[] intArray12 = ds.MaxMin2.maxMin2(intArray8, 0);
        int[] intArray14 = ds.MaxMin2.maxMin2(intArray12, (int) (byte) 1);
        int[] intArray16 = ds.MaxMin2.maxMin2(intArray12, (int) (short) 0);
        int[] intArray18 = ds.MaxMin2.maxMin2(intArray16, (-1));
        int[] intArray20 = ds.MaxMin2.maxMin2(intArray16, 0);
        int[] intArray22 = ds.MaxMin2.maxMin2(intArray16, (int) (short) 1);
        int[] intArray24 = ds.MaxMin2.maxMin2(intArray16, 1);
        java.lang.Class<?> wildcardClass25 = intArray24.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[100, 10]");
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray16), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray18), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray20), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray22), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray24), "[100, 100]");
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test568");
        int[] intArray2 = new int[] { (short) 100, 10 };
        int[] intArray4 = ds.MaxMin2.maxMin2(intArray2, (int) (byte) -1);
        int[] intArray6 = ds.MaxMin2.maxMin2(intArray2, (int) (byte) -1);
        int[] intArray8 = ds.MaxMin2.maxMin2(intArray6, (int) (byte) 0);
        int[] intArray10 = ds.MaxMin2.maxMin2(intArray6, 1);
        int[] intArray12 = ds.MaxMin2.maxMin2(intArray6, (int) (short) 0);
        int[] intArray14 = ds.MaxMin2.maxMin2(intArray12, (int) (byte) 0);
        int[] intArray16 = ds.MaxMin2.maxMin2(intArray14, (int) (byte) -1);
        int[] intArray18 = ds.MaxMin2.maxMin2(intArray16, (int) (byte) -1);
        int[] intArray20 = ds.MaxMin2.maxMin2(intArray16, (int) (byte) 1);
        int[] intArray22 = ds.MaxMin2.maxMin2(intArray20, (int) (short) -1);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[100, 10]");
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray16), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray18), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray20), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray22), "[100, 100]");
    }

    @Test
    public void test569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test569");
        int[] intArray2 = new int[] { (short) 100, 10 };
        int[] intArray4 = ds.MaxMin2.maxMin2(intArray2, (int) (byte) -1);
        int[] intArray6 = ds.MaxMin2.maxMin2(intArray2, (int) (byte) -1);
        int[] intArray8 = ds.MaxMin2.maxMin2(intArray6, (int) (byte) 0);
        int[] intArray10 = ds.MaxMin2.maxMin2(intArray6, 1);
        int[] intArray12 = ds.MaxMin2.maxMin2(intArray6, (int) (short) 0);
        int[] intArray14 = ds.MaxMin2.maxMin2(intArray6, (int) (byte) 0);
        int[] intArray16 = ds.MaxMin2.maxMin2(intArray14, 1);
        int[] intArray18 = ds.MaxMin2.maxMin2(intArray14, (-1));
        java.lang.Class<?> wildcardClass19 = intArray14.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[100, 10]");
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray16), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray18), "[100, 100]");
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test570");
        int[] intArray2 = new int[] { (short) 100, 10 };
        int[] intArray4 = ds.MaxMin2.maxMin2(intArray2, (int) (byte) -1);
        int[] intArray6 = ds.MaxMin2.maxMin2(intArray2, (int) (byte) -1);
        int[] intArray8 = ds.MaxMin2.maxMin2(intArray6, (int) (byte) -1);
        int[] intArray10 = ds.MaxMin2.maxMin2(intArray8, (-1));
        int[] intArray12 = ds.MaxMin2.maxMin2(intArray8, 0);
        int[] intArray14 = ds.MaxMin2.maxMin2(intArray12, (int) (byte) 1);
        int[] intArray16 = ds.MaxMin2.maxMin2(intArray12, (int) (short) 0);
        int[] intArray18 = ds.MaxMin2.maxMin2(intArray16, (-1));
        int[] intArray20 = ds.MaxMin2.maxMin2(intArray18, (int) (short) 0);
        int[] intArray22 = ds.MaxMin2.maxMin2(intArray20, (int) (byte) 1);
        int[] intArray24 = ds.MaxMin2.maxMin2(intArray20, (-1));
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray26 = ds.MaxMin2.maxMin2(intArray24, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[100, 10]");
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray16), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray18), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray20), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray22), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray24), "[100, 100]");
    }

    @Test
    public void test571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test571");
        int[] intArray2 = new int[] { (short) 100, 10 };
        int[] intArray4 = ds.MaxMin2.maxMin2(intArray2, (int) (byte) -1);
        int[] intArray6 = ds.MaxMin2.maxMin2(intArray2, (int) (byte) -1);
        int[] intArray8 = ds.MaxMin2.maxMin2(intArray6, (int) (byte) -1);
        int[] intArray10 = ds.MaxMin2.maxMin2(intArray8, (-1));
        int[] intArray12 = ds.MaxMin2.maxMin2(intArray8, 0);
        int[] intArray14 = ds.MaxMin2.maxMin2(intArray8, (int) (byte) -1);
        int[] intArray16 = ds.MaxMin2.maxMin2(intArray8, 0);
        int[] intArray18 = ds.MaxMin2.maxMin2(intArray16, (int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray20 = ds.MaxMin2.maxMin2(intArray16, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[100, 10]");
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray16), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray18), "[100, 100]");
    }

    @Test
    public void test572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test572");
        int[] intArray2 = new int[] { (short) 100, 10 };
        int[] intArray4 = ds.MaxMin2.maxMin2(intArray2, (int) (byte) -1);
        int[] intArray6 = ds.MaxMin2.maxMin2(intArray2, (int) (byte) -1);
        int[] intArray8 = ds.MaxMin2.maxMin2(intArray6, (int) (byte) 0);
        int[] intArray10 = ds.MaxMin2.maxMin2(intArray6, 1);
        int[] intArray12 = ds.MaxMin2.maxMin2(intArray6, (int) (byte) 0);
        int[] intArray14 = ds.MaxMin2.maxMin2(intArray6, 1);
        int[] intArray16 = ds.MaxMin2.maxMin2(intArray6, 0);
        int[] intArray18 = ds.MaxMin2.maxMin2(intArray16, (-1));
        int[] intArray20 = ds.MaxMin2.maxMin2(intArray18, (int) (short) -1);
        int[] intArray22 = ds.MaxMin2.maxMin2(intArray20, (-1));
        int[] intArray24 = ds.MaxMin2.maxMin2(intArray20, 0);
        int[] intArray26 = ds.MaxMin2.maxMin2(intArray20, (int) (short) 0);
        java.lang.Class<?> wildcardClass27 = intArray20.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[100, 10]");
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray16), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray18), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray20), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray22), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray24), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray26), "[100, 100]");
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test573");
        int[] intArray2 = new int[] { (short) 100, 10 };
        int[] intArray4 = ds.MaxMin2.maxMin2(intArray2, (int) (byte) -1);
        int[] intArray6 = ds.MaxMin2.maxMin2(intArray2, (int) (byte) -1);
        int[] intArray8 = ds.MaxMin2.maxMin2(intArray6, (int) (byte) 0);
        int[] intArray10 = ds.MaxMin2.maxMin2(intArray6, 1);
        int[] intArray12 = ds.MaxMin2.maxMin2(intArray6, (int) (short) -1);
        int[] intArray14 = ds.MaxMin2.maxMin2(intArray6, (-1));
        int[] intArray16 = ds.MaxMin2.maxMin2(intArray14, 1);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray18 = ds.MaxMin2.maxMin2(intArray16, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[100, 10]");
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray16), "[100, 100]");
    }

    @Test
    public void test574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test574");
        int[] intArray2 = new int[] { (short) 100, 10 };
        int[] intArray4 = ds.MaxMin2.maxMin2(intArray2, (int) (byte) -1);
        int[] intArray6 = ds.MaxMin2.maxMin2(intArray2, (int) (byte) -1);
        int[] intArray8 = ds.MaxMin2.maxMin2(intArray6, (int) (byte) 0);
        int[] intArray10 = ds.MaxMin2.maxMin2(intArray6, 1);
        int[] intArray12 = ds.MaxMin2.maxMin2(intArray6, (int) (short) 0);
        int[] intArray14 = ds.MaxMin2.maxMin2(intArray12, (int) (short) 0);
        int[] intArray16 = ds.MaxMin2.maxMin2(intArray12, 0);
        int[] intArray18 = ds.MaxMin2.maxMin2(intArray12, (int) (byte) -1);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[100, 10]");
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray16), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray18), "[100, 100]");
    }

    @Test
    public void test575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test575");
        int[] intArray2 = new int[] { (short) 100, 10 };
        int[] intArray4 = ds.MaxMin2.maxMin2(intArray2, (int) (byte) -1);
        int[] intArray6 = ds.MaxMin2.maxMin2(intArray2, (int) (byte) -1);
        int[] intArray8 = ds.MaxMin2.maxMin2(intArray6, (int) (byte) 0);
        int[] intArray10 = ds.MaxMin2.maxMin2(intArray6, 1);
        int[] intArray12 = ds.MaxMin2.maxMin2(intArray6, (int) (short) 0);
        int[] intArray14 = ds.MaxMin2.maxMin2(intArray12, (int) (short) 0);
        int[] intArray16 = ds.MaxMin2.maxMin2(intArray12, 0);
        int[] intArray18 = ds.MaxMin2.maxMin2(intArray16, (int) (short) 1);
        int[] intArray20 = ds.MaxMin2.maxMin2(intArray18, (int) (short) 1);
        java.lang.Class<?> wildcardClass21 = intArray20.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[100, 10]");
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray16), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray18), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray20), "[100, 100]");
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test576");
        int[] intArray2 = new int[] { (short) 100, 10 };
        int[] intArray4 = ds.MaxMin2.maxMin2(intArray2, (int) (byte) -1);
        int[] intArray6 = ds.MaxMin2.maxMin2(intArray4, (int) (short) 0);
        int[] intArray8 = ds.MaxMin2.maxMin2(intArray4, (-1));
        int[] intArray10 = ds.MaxMin2.maxMin2(intArray8, (int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray12 = ds.MaxMin2.maxMin2(intArray8, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[100, 10]");
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[100, 100]");
    }

    @Test
    public void test577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test577");
        int[] intArray2 = new int[] { (short) 100, 10 };
        int[] intArray4 = ds.MaxMin2.maxMin2(intArray2, (int) (byte) -1);
        int[] intArray6 = ds.MaxMin2.maxMin2(intArray4, (int) (short) 0);
        int[] intArray8 = ds.MaxMin2.maxMin2(intArray6, 0);
        int[] intArray10 = ds.MaxMin2.maxMin2(intArray8, (-1));
        int[] intArray12 = ds.MaxMin2.maxMin2(intArray10, (int) (byte) 1);
        java.lang.Class<?> wildcardClass13 = intArray12.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[100, 10]");
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[100, 100]");
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test578");
        int[] intArray2 = new int[] { (short) 100, 10 };
        int[] intArray4 = ds.MaxMin2.maxMin2(intArray2, (int) (byte) -1);
        int[] intArray6 = ds.MaxMin2.maxMin2(intArray4, (int) (short) 0);
        int[] intArray8 = ds.MaxMin2.maxMin2(intArray4, (int) (short) 1);
        int[] intArray10 = ds.MaxMin2.maxMin2(intArray8, (int) (short) 1);
        int[] intArray12 = ds.MaxMin2.maxMin2(intArray8, (int) (short) -1);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[100, 10]");
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[100, 100]");
    }

    @Test
    public void test579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test579");
        int[] intArray2 = new int[] { (short) 100, 10 };
        int[] intArray4 = ds.MaxMin2.maxMin2(intArray2, (int) (byte) -1);
        int[] intArray6 = ds.MaxMin2.maxMin2(intArray2, (int) (byte) -1);
        int[] intArray8 = ds.MaxMin2.maxMin2(intArray6, (int) (byte) 0);
        int[] intArray10 = ds.MaxMin2.maxMin2(intArray6, 1);
        int[] intArray12 = ds.MaxMin2.maxMin2(intArray6, (int) (short) 0);
        int[] intArray14 = ds.MaxMin2.maxMin2(intArray6, (int) (byte) 0);
        int[] intArray16 = ds.MaxMin2.maxMin2(intArray6, (int) (short) 0);
        int[] intArray18 = ds.MaxMin2.maxMin2(intArray16, 0);
        int[] intArray20 = ds.MaxMin2.maxMin2(intArray16, 0);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[100, 10]");
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray16), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray18), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray20), "[100, 100]");
    }

    @Test
    public void test580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test580");
        int[] intArray2 = new int[] { (short) 100, 10 };
        int[] intArray4 = ds.MaxMin2.maxMin2(intArray2, (int) (byte) -1);
        int[] intArray6 = ds.MaxMin2.maxMin2(intArray2, (int) (byte) -1);
        int[] intArray8 = ds.MaxMin2.maxMin2(intArray6, (int) (byte) 0);
        int[] intArray10 = ds.MaxMin2.maxMin2(intArray6, 1);
        int[] intArray12 = ds.MaxMin2.maxMin2(intArray6, (int) (byte) 0);
        int[] intArray14 = ds.MaxMin2.maxMin2(intArray6, 1);
        int[] intArray16 = ds.MaxMin2.maxMin2(intArray6, 0);
        int[] intArray18 = ds.MaxMin2.maxMin2(intArray16, (-1));
        int[] intArray20 = ds.MaxMin2.maxMin2(intArray18, (int) (short) -1);
        int[] intArray22 = ds.MaxMin2.maxMin2(intArray20, (-1));
        int[] intArray24 = ds.MaxMin2.maxMin2(intArray22, 1);
        int[] intArray26 = ds.MaxMin2.maxMin2(intArray22, (-1));
        java.lang.Class<?> wildcardClass27 = intArray22.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[100, 10]");
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray16), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray18), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray20), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray22), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray24), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray26), "[100, 100]");
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test581");
        int[] intArray2 = new int[] { (short) 100, 10 };
        int[] intArray4 = ds.MaxMin2.maxMin2(intArray2, (int) (byte) -1);
        int[] intArray6 = ds.MaxMin2.maxMin2(intArray2, (int) (byte) -1);
        int[] intArray8 = ds.MaxMin2.maxMin2(intArray6, (int) (byte) 0);
        int[] intArray10 = ds.MaxMin2.maxMin2(intArray6, 1);
        int[] intArray12 = ds.MaxMin2.maxMin2(intArray6, (int) (byte) 0);
        int[] intArray14 = ds.MaxMin2.maxMin2(intArray12, (int) (short) 1);
        int[] intArray16 = ds.MaxMin2.maxMin2(intArray14, (int) (byte) -1);
        int[] intArray18 = ds.MaxMin2.maxMin2(intArray14, (-1));
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[100, 10]");
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray16), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray18), "[100, 100]");
    }

    @Test
    public void test582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test582");
        int[] intArray2 = new int[] { (short) 100, 10 };
        int[] intArray4 = ds.MaxMin2.maxMin2(intArray2, (int) (byte) -1);
        int[] intArray6 = ds.MaxMin2.maxMin2(intArray2, (int) (byte) -1);
        int[] intArray8 = ds.MaxMin2.maxMin2(intArray6, (int) (byte) 0);
        int[] intArray10 = ds.MaxMin2.maxMin2(intArray8, 0);
        int[] intArray12 = ds.MaxMin2.maxMin2(intArray10, 1);
        java.lang.Class<?> wildcardClass13 = intArray10.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[100, 10]");
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[100, 100]");
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test583");
        int[] intArray2 = new int[] { (short) 100, 10 };
        int[] intArray4 = ds.MaxMin2.maxMin2(intArray2, (int) (byte) -1);
        int[] intArray6 = ds.MaxMin2.maxMin2(intArray2, (int) (byte) -1);
        int[] intArray8 = ds.MaxMin2.maxMin2(intArray6, (int) (byte) 0);
        int[] intArray10 = ds.MaxMin2.maxMin2(intArray8, (int) (short) 1);
        int[] intArray12 = ds.MaxMin2.maxMin2(intArray8, (int) (short) -1);
        java.lang.Class<?> wildcardClass13 = intArray8.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[100, 10]");
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[100, 100]");
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test584");
        int[] intArray2 = new int[] { (short) 100, 10 };
        int[] intArray4 = ds.MaxMin2.maxMin2(intArray2, (int) (byte) -1);
        int[] intArray6 = ds.MaxMin2.maxMin2(intArray2, (int) (byte) -1);
        int[] intArray8 = ds.MaxMin2.maxMin2(intArray6, (int) (byte) 0);
        int[] intArray10 = ds.MaxMin2.maxMin2(intArray8, (int) (short) 1);
        int[] intArray12 = ds.MaxMin2.maxMin2(intArray10, (int) (byte) -1);
        int[] intArray14 = ds.MaxMin2.maxMin2(intArray10, (int) (short) 1);
        int[] intArray16 = ds.MaxMin2.maxMin2(intArray10, (int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray18 = ds.MaxMin2.maxMin2(intArray10, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[100, 10]");
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray16), "[100, 100]");
    }

    @Test
    public void test585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test585");
        int[] intArray2 = new int[] { (short) 100, 10 };
        int[] intArray4 = ds.MaxMin2.maxMin2(intArray2, (int) (byte) -1);
        int[] intArray6 = ds.MaxMin2.maxMin2(intArray2, (int) (byte) -1);
        int[] intArray8 = ds.MaxMin2.maxMin2(intArray6, (int) (byte) -1);
        int[] intArray10 = ds.MaxMin2.maxMin2(intArray6, (int) (byte) 0);
        java.lang.Class<?> wildcardClass11 = intArray10.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[100, 10]");
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[100, 100]");
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test586");
        int[] intArray2 = new int[] { (short) 100, 10 };
        int[] intArray4 = ds.MaxMin2.maxMin2(intArray2, (int) (byte) -1);
        int[] intArray6 = ds.MaxMin2.maxMin2(intArray2, (int) (byte) -1);
        int[] intArray8 = ds.MaxMin2.maxMin2(intArray6, (int) (byte) -1);
        int[] intArray10 = ds.MaxMin2.maxMin2(intArray8, (-1));
        int[] intArray12 = ds.MaxMin2.maxMin2(intArray8, 0);
        int[] intArray14 = ds.MaxMin2.maxMin2(intArray8, (int) (byte) -1);
        int[] intArray16 = ds.MaxMin2.maxMin2(intArray8, 0);
        int[] intArray18 = ds.MaxMin2.maxMin2(intArray16, (int) (short) 0);
        int[] intArray20 = ds.MaxMin2.maxMin2(intArray18, (int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray22 = ds.MaxMin2.maxMin2(intArray20, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[100, 10]");
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray16), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray18), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray20), "[100, 100]");
    }

    @Test
    public void test587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test587");
        int[] intArray2 = new int[] { (short) 100, 10 };
        int[] intArray4 = ds.MaxMin2.maxMin2(intArray2, (int) (byte) -1);
        int[] intArray6 = ds.MaxMin2.maxMin2(intArray2, (int) (byte) -1);
        int[] intArray8 = ds.MaxMin2.maxMin2(intArray6, (int) (byte) 0);
        int[] intArray10 = ds.MaxMin2.maxMin2(intArray6, 1);
        int[] intArray12 = ds.MaxMin2.maxMin2(intArray6, (int) (byte) 0);
        int[] intArray14 = ds.MaxMin2.maxMin2(intArray12, (int) (short) 1);
        int[] intArray16 = ds.MaxMin2.maxMin2(intArray14, (int) (byte) -1);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray18 = ds.MaxMin2.maxMin2(intArray14, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[100, 10]");
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray16), "[100, 100]");
    }

    @Test
    public void test588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test588");
        int[] intArray2 = new int[] { (short) 100, 10 };
        int[] intArray4 = ds.MaxMin2.maxMin2(intArray2, (int) (byte) -1);
        int[] intArray6 = ds.MaxMin2.maxMin2(intArray2, (int) (byte) -1);
        int[] intArray8 = ds.MaxMin2.maxMin2(intArray6, (int) (byte) 0);
        int[] intArray10 = ds.MaxMin2.maxMin2(intArray8, 0);
        int[] intArray12 = ds.MaxMin2.maxMin2(intArray10, 1);
        int[] intArray14 = ds.MaxMin2.maxMin2(intArray10, (int) (short) 0);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[100, 10]");
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[100, 100]");
    }

    @Test
    public void test589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test589");
        int[] intArray2 = new int[] { (short) 100, 10 };
        int[] intArray4 = ds.MaxMin2.maxMin2(intArray2, (int) (byte) -1);
        int[] intArray6 = ds.MaxMin2.maxMin2(intArray2, (int) (byte) -1);
        int[] intArray8 = ds.MaxMin2.maxMin2(intArray6, (int) (byte) 0);
        int[] intArray10 = ds.MaxMin2.maxMin2(intArray6, 1);
        int[] intArray12 = ds.MaxMin2.maxMin2(intArray6, (int) (short) 0);
        int[] intArray14 = ds.MaxMin2.maxMin2(intArray6, (int) (byte) 0);
        int[] intArray16 = ds.MaxMin2.maxMin2(intArray14, 1);
        int[] intArray18 = ds.MaxMin2.maxMin2(intArray14, (-1));
        java.lang.Class<?> wildcardClass19 = intArray18.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[100, 10]");
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray16), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray18), "[100, 100]");
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test590");
        int[] intArray2 = new int[] { (short) 100, 10 };
        int[] intArray4 = ds.MaxMin2.maxMin2(intArray2, (int) (byte) -1);
        int[] intArray6 = ds.MaxMin2.maxMin2(intArray4, (int) (short) 0);
        int[] intArray8 = ds.MaxMin2.maxMin2(intArray4, 1);
        int[] intArray10 = ds.MaxMin2.maxMin2(intArray8, (int) (short) 1);
        int[] intArray12 = ds.MaxMin2.maxMin2(intArray8, 0);
        int[] intArray14 = ds.MaxMin2.maxMin2(intArray8, 0);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[100, 10]");
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[100, 100]");
    }

    @Test
    public void test591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test591");
        int[] intArray2 = new int[] { (short) 100, 10 };
        int[] intArray4 = ds.MaxMin2.maxMin2(intArray2, (int) (byte) -1);
        int[] intArray6 = ds.MaxMin2.maxMin2(intArray2, (int) (byte) -1);
        int[] intArray8 = ds.MaxMin2.maxMin2(intArray6, (int) (byte) 0);
        int[] intArray10 = ds.MaxMin2.maxMin2(intArray6, 1);
        int[] intArray12 = ds.MaxMin2.maxMin2(intArray6, (-1));
        int[] intArray14 = ds.MaxMin2.maxMin2(intArray6, 1);
        int[] intArray16 = ds.MaxMin2.maxMin2(intArray14, (int) (short) -1);
        int[] intArray18 = ds.MaxMin2.maxMin2(intArray14, 0);
        int[] intArray20 = ds.MaxMin2.maxMin2(intArray14, (int) (byte) 0);
        int[] intArray22 = ds.MaxMin2.maxMin2(intArray14, 1);
        int[] intArray24 = ds.MaxMin2.maxMin2(intArray22, (int) (short) 1);
        int[] intArray26 = ds.MaxMin2.maxMin2(intArray24, 0);
        int[] intArray28 = ds.MaxMin2.maxMin2(intArray26, (int) (short) 1);
        java.lang.Class<?> wildcardClass29 = intArray28.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[100, 10]");
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray16), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray18), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray20), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray22), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray24), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray26), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray28);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray28), "[100, 100]");
        org.junit.Assert.assertNotNull(wildcardClass29);
    }

    @Test
    public void test592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test592");
        int[] intArray2 = new int[] { (short) 100, 10 };
        int[] intArray4 = ds.MaxMin2.maxMin2(intArray2, (int) (byte) -1);
        int[] intArray6 = ds.MaxMin2.maxMin2(intArray2, (int) (byte) -1);
        int[] intArray8 = ds.MaxMin2.maxMin2(intArray6, (int) (byte) 0);
        int[] intArray10 = ds.MaxMin2.maxMin2(intArray8, (int) (short) 1);
        int[] intArray12 = ds.MaxMin2.maxMin2(intArray10, (int) (byte) -1);
        int[] intArray14 = ds.MaxMin2.maxMin2(intArray12, (int) (short) -1);
        int[] intArray16 = ds.MaxMin2.maxMin2(intArray14, (int) (short) 0);
        java.lang.Class<?> wildcardClass17 = intArray14.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[100, 10]");
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray16), "[100, 100]");
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test593");
        int[] intArray2 = new int[] { (short) 100, 10 };
        int[] intArray4 = ds.MaxMin2.maxMin2(intArray2, (int) (byte) -1);
        int[] intArray6 = ds.MaxMin2.maxMin2(intArray2, (int) (byte) -1);
        int[] intArray8 = ds.MaxMin2.maxMin2(intArray6, (int) (byte) -1);
        int[] intArray10 = ds.MaxMin2.maxMin2(intArray8, (-1));
        int[] intArray12 = ds.MaxMin2.maxMin2(intArray8, 0);
        int[] intArray14 = ds.MaxMin2.maxMin2(intArray12, (int) (byte) 1);
        int[] intArray16 = ds.MaxMin2.maxMin2(intArray12, (int) (short) 0);
        int[] intArray18 = ds.MaxMin2.maxMin2(intArray16, (-1));
        int[] intArray20 = ds.MaxMin2.maxMin2(intArray16, 0);
        int[] intArray22 = ds.MaxMin2.maxMin2(intArray16, 0);
        int[] intArray24 = ds.MaxMin2.maxMin2(intArray22, 1);
        int[] intArray26 = ds.MaxMin2.maxMin2(intArray24, 0);
        java.lang.Class<?> wildcardClass27 = intArray26.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[100, 10]");
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray16), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray18), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray20), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray22), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray24), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray26), "[100, 100]");
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test594");
        int[] intArray2 = new int[] { (short) 100, 10 };
        int[] intArray4 = ds.MaxMin2.maxMin2(intArray2, (int) (byte) -1);
        int[] intArray6 = ds.MaxMin2.maxMin2(intArray2, (int) (byte) -1);
        int[] intArray8 = ds.MaxMin2.maxMin2(intArray6, (int) (byte) 0);
        int[] intArray10 = ds.MaxMin2.maxMin2(intArray6, 1);
        int[] intArray12 = ds.MaxMin2.maxMin2(intArray6, (-1));
        int[] intArray14 = ds.MaxMin2.maxMin2(intArray6, 1);
        int[] intArray16 = ds.MaxMin2.maxMin2(intArray14, (int) (short) -1);
        int[] intArray18 = ds.MaxMin2.maxMin2(intArray14, 0);
        int[] intArray20 = ds.MaxMin2.maxMin2(intArray14, (int) (byte) 0);
        int[] intArray22 = ds.MaxMin2.maxMin2(intArray14, 1);
        int[] intArray24 = ds.MaxMin2.maxMin2(intArray22, (int) (short) 1);
        int[] intArray26 = ds.MaxMin2.maxMin2(intArray24, 0);
        int[] intArray28 = ds.MaxMin2.maxMin2(intArray26, (int) (short) 1);
        java.lang.Class<?> wildcardClass29 = intArray26.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[100, 10]");
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray16), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray18), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray20), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray22), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray24), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray26), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray28);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray28), "[100, 100]");
        org.junit.Assert.assertNotNull(wildcardClass29);
    }

    @Test
    public void test595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test595");
        int[] intArray2 = new int[] { (short) 100, 10 };
        int[] intArray4 = ds.MaxMin2.maxMin2(intArray2, (int) (byte) -1);
        int[] intArray6 = ds.MaxMin2.maxMin2(intArray2, (int) (byte) -1);
        int[] intArray8 = ds.MaxMin2.maxMin2(intArray6, (int) (byte) 0);
        int[] intArray10 = ds.MaxMin2.maxMin2(intArray6, 1);
        int[] intArray12 = ds.MaxMin2.maxMin2(intArray6, (-1));
        int[] intArray14 = ds.MaxMin2.maxMin2(intArray6, 1);
        int[] intArray16 = ds.MaxMin2.maxMin2(intArray14, (int) (short) -1);
        int[] intArray18 = ds.MaxMin2.maxMin2(intArray14, 0);
        int[] intArray20 = ds.MaxMin2.maxMin2(intArray14, (int) (byte) 0);
        int[] intArray22 = ds.MaxMin2.maxMin2(intArray14, 1);
        int[] intArray24 = ds.MaxMin2.maxMin2(intArray22, 0);
        int[] intArray26 = ds.MaxMin2.maxMin2(intArray22, 0);
        java.lang.Class<?> wildcardClass27 = intArray26.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[100, 10]");
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray16), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray18), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray20), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray22), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray24), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray26), "[100, 100]");
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test596");
        int[] intArray2 = new int[] { (short) 100, 10 };
        int[] intArray4 = ds.MaxMin2.maxMin2(intArray2, (int) (byte) -1);
        int[] intArray6 = ds.MaxMin2.maxMin2(intArray2, (int) (byte) -1);
        int[] intArray8 = ds.MaxMin2.maxMin2(intArray6, (int) (byte) 0);
        int[] intArray10 = ds.MaxMin2.maxMin2(intArray6, 1);
        int[] intArray12 = ds.MaxMin2.maxMin2(intArray6, (int) (short) 0);
        int[] intArray14 = ds.MaxMin2.maxMin2(intArray12, (int) (byte) 0);
        int[] intArray16 = ds.MaxMin2.maxMin2(intArray14, (int) (byte) -1);
        java.lang.Class<?> wildcardClass17 = intArray16.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[100, 10]");
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray16), "[100, 100]");
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test597");
        int[] intArray2 = new int[] { (short) 100, 10 };
        int[] intArray4 = ds.MaxMin2.maxMin2(intArray2, (int) (byte) -1);
        int[] intArray6 = ds.MaxMin2.maxMin2(intArray4, (int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray8 = ds.MaxMin2.maxMin2(intArray4, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[100, 10]");
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[100, 100]");
    }

    @Test
    public void test598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test598");
        int[] intArray2 = new int[] { (short) 100, 10 };
        int[] intArray4 = ds.MaxMin2.maxMin2(intArray2, (int) (byte) -1);
        int[] intArray6 = ds.MaxMin2.maxMin2(intArray2, (int) (byte) -1);
        int[] intArray8 = ds.MaxMin2.maxMin2(intArray6, (int) (byte) -1);
        int[] intArray10 = ds.MaxMin2.maxMin2(intArray8, (-1));
        int[] intArray12 = ds.MaxMin2.maxMin2(intArray8, 0);
        int[] intArray14 = ds.MaxMin2.maxMin2(intArray12, (int) (byte) 1);
        int[] intArray16 = ds.MaxMin2.maxMin2(intArray14, (int) (byte) 0);
        int[] intArray18 = ds.MaxMin2.maxMin2(intArray14, (int) (byte) -1);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray20 = ds.MaxMin2.maxMin2(intArray14, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[100, 10]");
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray16), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray18), "[100, 100]");
    }

    @Test
    public void test599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test599");
        int[] intArray2 = new int[] { (short) 100, 10 };
        int[] intArray4 = ds.MaxMin2.maxMin2(intArray2, (int) (byte) -1);
        int[] intArray6 = ds.MaxMin2.maxMin2(intArray2, (int) (byte) -1);
        int[] intArray8 = ds.MaxMin2.maxMin2(intArray6, (int) (byte) 0);
        int[] intArray10 = ds.MaxMin2.maxMin2(intArray6, 1);
        int[] intArray12 = ds.MaxMin2.maxMin2(intArray6, (int) (short) 0);
        int[] intArray14 = ds.MaxMin2.maxMin2(intArray12, (int) (byte) 0);
        int[] intArray16 = ds.MaxMin2.maxMin2(intArray14, (int) (byte) -1);
        int[] intArray18 = ds.MaxMin2.maxMin2(intArray16, (int) (byte) -1);
        java.lang.Class<?> wildcardClass19 = intArray18.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[100, 10]");
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray16), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray18), "[100, 100]");
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test600");
        int[] intArray2 = new int[] { (short) 100, 10 };
        int[] intArray4 = ds.MaxMin2.maxMin2(intArray2, (int) (byte) -1);
        int[] intArray6 = ds.MaxMin2.maxMin2(intArray2, (int) (byte) -1);
        int[] intArray8 = ds.MaxMin2.maxMin2(intArray6, (int) (byte) 0);
        int[] intArray10 = ds.MaxMin2.maxMin2(intArray6, 1);
        int[] intArray12 = ds.MaxMin2.maxMin2(intArray6, (int) (short) 0);
        int[] intArray14 = ds.MaxMin2.maxMin2(intArray12, (int) (short) 0);
        int[] intArray16 = ds.MaxMin2.maxMin2(intArray12, 0);
        int[] intArray18 = ds.MaxMin2.maxMin2(intArray16, (int) (byte) -1);
        java.lang.Class<?> wildcardClass19 = intArray18.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[100, 10]");
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray16), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray18), "[100, 100]");
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test601");
        int[] intArray2 = new int[] { (short) 100, 10 };
        int[] intArray4 = ds.MaxMin2.maxMin2(intArray2, (int) (byte) -1);
        int[] intArray6 = ds.MaxMin2.maxMin2(intArray2, (int) (byte) -1);
        int[] intArray8 = ds.MaxMin2.maxMin2(intArray6, (int) (byte) 0);
        int[] intArray10 = ds.MaxMin2.maxMin2(intArray8, (int) (short) 1);
        int[] intArray12 = ds.MaxMin2.maxMin2(intArray10, 1);
        int[] intArray14 = ds.MaxMin2.maxMin2(intArray10, 1);
        int[] intArray16 = ds.MaxMin2.maxMin2(intArray14, 0);
        int[] intArray18 = ds.MaxMin2.maxMin2(intArray16, (int) (byte) 0);
        java.lang.Class<?> wildcardClass19 = intArray18.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[100, 10]");
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray16), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray18), "[100, 100]");
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test602");
        int[] intArray2 = new int[] { (short) 100, 10 };
        int[] intArray4 = ds.MaxMin2.maxMin2(intArray2, (int) (byte) -1);
        int[] intArray6 = ds.MaxMin2.maxMin2(intArray2, (int) (byte) -1);
        int[] intArray8 = ds.MaxMin2.maxMin2(intArray6, (int) (byte) -1);
        int[] intArray10 = ds.MaxMin2.maxMin2(intArray8, (-1));
        int[] intArray12 = ds.MaxMin2.maxMin2(intArray8, 0);
        int[] intArray14 = ds.MaxMin2.maxMin2(intArray12, (int) (byte) 1);
        int[] intArray16 = ds.MaxMin2.maxMin2(intArray12, (int) (short) 0);
        int[] intArray18 = ds.MaxMin2.maxMin2(intArray16, (-1));
        int[] intArray20 = ds.MaxMin2.maxMin2(intArray18, 1);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray22 = ds.MaxMin2.maxMin2(intArray20, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[100, 10]");
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray16), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray18), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray20), "[100, 100]");
    }

    @Test
    public void test603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test603");
        int[] intArray2 = new int[] { (short) 100, 10 };
        int[] intArray4 = ds.MaxMin2.maxMin2(intArray2, (int) (byte) -1);
        int[] intArray6 = ds.MaxMin2.maxMin2(intArray2, (int) (byte) -1);
        int[] intArray8 = ds.MaxMin2.maxMin2(intArray6, (int) (byte) 0);
        int[] intArray10 = ds.MaxMin2.maxMin2(intArray8, (int) (short) 1);
        int[] intArray12 = ds.MaxMin2.maxMin2(intArray10, (int) (byte) -1);
        int[] intArray14 = ds.MaxMin2.maxMin2(intArray10, (int) (short) 1);
        int[] intArray16 = ds.MaxMin2.maxMin2(intArray10, (int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray18 = ds.MaxMin2.maxMin2(intArray16, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[100, 10]");
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray16), "[100, 100]");
    }

    @Test
    public void test604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test604");
        int[] intArray0 = null;
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray2 = ds.MaxMin2.maxMin2(intArray0, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test605");
        int[] intArray2 = new int[] { (short) 100, 10 };
        int[] intArray4 = ds.MaxMin2.maxMin2(intArray2, (int) (byte) -1);
        int[] intArray6 = ds.MaxMin2.maxMin2(intArray2, (int) (byte) -1);
        int[] intArray8 = ds.MaxMin2.maxMin2(intArray6, (int) (byte) 0);
        int[] intArray10 = ds.MaxMin2.maxMin2(intArray6, 1);
        int[] intArray12 = ds.MaxMin2.maxMin2(intArray6, (-1));
        int[] intArray14 = ds.MaxMin2.maxMin2(intArray6, (int) (short) -1);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray16 = ds.MaxMin2.maxMin2(intArray6, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[100, 10]");
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[100, 100]");
    }

    @Test
    public void test606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test606");
        int[] intArray2 = new int[] { (short) 100, 10 };
        int[] intArray4 = ds.MaxMin2.maxMin2(intArray2, (int) (byte) -1);
        int[] intArray6 = ds.MaxMin2.maxMin2(intArray2, (int) (byte) -1);
        int[] intArray8 = ds.MaxMin2.maxMin2(intArray6, (int) (byte) 0);
        int[] intArray10 = ds.MaxMin2.maxMin2(intArray8, (int) (short) 1);
        int[] intArray12 = ds.MaxMin2.maxMin2(intArray8, (int) (short) -1);
        int[] intArray14 = ds.MaxMin2.maxMin2(intArray8, 1);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray16 = ds.MaxMin2.maxMin2(intArray14, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[100, 10]");
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[100, 100]");
    }

    @Test
    public void test607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test607");
        int[] intArray2 = new int[] { (short) 100, 10 };
        int[] intArray4 = ds.MaxMin2.maxMin2(intArray2, (int) (byte) -1);
        int[] intArray6 = ds.MaxMin2.maxMin2(intArray4, (int) (short) 0);
        int[] intArray8 = ds.MaxMin2.maxMin2(intArray6, 0);
        int[] intArray10 = ds.MaxMin2.maxMin2(intArray8, (-1));
        int[] intArray12 = ds.MaxMin2.maxMin2(intArray10, (int) (byte) 0);
        int[] intArray14 = ds.MaxMin2.maxMin2(intArray12, 0);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray16 = ds.MaxMin2.maxMin2(intArray14, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[100, 10]");
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[100, 100]");
    }

    @Test
    public void test608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test608");
        int[] intArray2 = new int[] { (short) 100, 10 };
        int[] intArray4 = ds.MaxMin2.maxMin2(intArray2, (int) (byte) -1);
        int[] intArray6 = ds.MaxMin2.maxMin2(intArray2, (int) (byte) -1);
        int[] intArray8 = ds.MaxMin2.maxMin2(intArray6, (int) (byte) 0);
        int[] intArray10 = ds.MaxMin2.maxMin2(intArray8, (int) (short) 1);
        int[] intArray12 = ds.MaxMin2.maxMin2(intArray8, (int) (short) -1);
        int[] intArray14 = ds.MaxMin2.maxMin2(intArray12, (int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray16 = ds.MaxMin2.maxMin2(intArray12, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[100, 10]");
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[100, 100]");
    }

    @Test
    public void test609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test609");
        int[] intArray2 = new int[] { (short) 100, 10 };
        int[] intArray4 = ds.MaxMin2.maxMin2(intArray2, (int) (byte) -1);
        int[] intArray6 = ds.MaxMin2.maxMin2(intArray2, (int) (byte) -1);
        int[] intArray8 = ds.MaxMin2.maxMin2(intArray6, (int) (byte) -1);
        int[] intArray10 = ds.MaxMin2.maxMin2(intArray8, (-1));
        int[] intArray12 = ds.MaxMin2.maxMin2(intArray8, 0);
        int[] intArray14 = ds.MaxMin2.maxMin2(intArray8, (int) (byte) -1);
        int[] intArray16 = ds.MaxMin2.maxMin2(intArray8, 0);
        int[] intArray18 = ds.MaxMin2.maxMin2(intArray16, 0);
        int[] intArray20 = ds.MaxMin2.maxMin2(intArray18, (int) (short) 0);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[100, 10]");
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray16), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray18), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray20), "[100, 100]");
    }

    @Test
    public void test610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test610");
        int[] intArray2 = new int[] { (short) 100, 10 };
        int[] intArray4 = ds.MaxMin2.maxMin2(intArray2, (int) (byte) -1);
        int[] intArray6 = ds.MaxMin2.maxMin2(intArray2, (int) (byte) -1);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray8 = ds.MaxMin2.maxMin2(intArray2, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[100, 10]");
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[100, 100]");
    }

    @Test
    public void test611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test611");
        int[] intArray2 = new int[] { (short) 100, 10 };
        int[] intArray4 = ds.MaxMin2.maxMin2(intArray2, (int) (byte) -1);
        int[] intArray6 = ds.MaxMin2.maxMin2(intArray2, (int) (byte) -1);
        int[] intArray8 = ds.MaxMin2.maxMin2(intArray6, (int) (byte) 0);
        int[] intArray10 = ds.MaxMin2.maxMin2(intArray8, (int) (short) 1);
        int[] intArray12 = ds.MaxMin2.maxMin2(intArray10, (int) (byte) 0);
        java.lang.Class<?> wildcardClass13 = intArray10.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[100, 10]");
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[100, 100]");
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test612");
        int[] intArray2 = new int[] { (short) 100, 10 };
        int[] intArray4 = ds.MaxMin2.maxMin2(intArray2, (int) (byte) -1);
        int[] intArray6 = ds.MaxMin2.maxMin2(intArray4, (int) (short) 0);
        int[] intArray8 = ds.MaxMin2.maxMin2(intArray4, (int) (short) 1);
        int[] intArray10 = ds.MaxMin2.maxMin2(intArray8, (int) (short) -1);
        int[] intArray12 = ds.MaxMin2.maxMin2(intArray8, (int) (short) 1);
        int[] intArray14 = ds.MaxMin2.maxMin2(intArray8, (int) (short) 0);
        int[] intArray16 = ds.MaxMin2.maxMin2(intArray14, (int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray18 = ds.MaxMin2.maxMin2(intArray16, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[100, 10]");
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray16), "[100, 100]");
    }

    @Test
    public void test613() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test613");
        int[] intArray2 = new int[] { (short) 100, 10 };
        int[] intArray4 = ds.MaxMin2.maxMin2(intArray2, (int) (byte) -1);
        int[] intArray6 = ds.MaxMin2.maxMin2(intArray2, (int) (byte) -1);
        int[] intArray8 = ds.MaxMin2.maxMin2(intArray6, (int) (byte) 0);
        int[] intArray10 = ds.MaxMin2.maxMin2(intArray6, 1);
        int[] intArray12 = ds.MaxMin2.maxMin2(intArray6, (int) (short) 0);
        int[] intArray14 = ds.MaxMin2.maxMin2(intArray6, 1);
        int[] intArray16 = ds.MaxMin2.maxMin2(intArray6, (int) (byte) 0);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[100, 10]");
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray16), "[100, 100]");
    }

    @Test
    public void test614() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test614");
        int[] intArray2 = new int[] { (short) 100, 10 };
        int[] intArray4 = ds.MaxMin2.maxMin2(intArray2, (int) (byte) -1);
        int[] intArray6 = ds.MaxMin2.maxMin2(intArray2, (int) (byte) -1);
        int[] intArray8 = ds.MaxMin2.maxMin2(intArray6, (int) (byte) 0);
        int[] intArray10 = ds.MaxMin2.maxMin2(intArray6, 1);
        int[] intArray12 = ds.MaxMin2.maxMin2(intArray6, (int) (byte) 0);
        int[] intArray14 = ds.MaxMin2.maxMin2(intArray6, 1);
        int[] intArray16 = ds.MaxMin2.maxMin2(intArray6, 0);
        int[] intArray18 = ds.MaxMin2.maxMin2(intArray16, (-1));
        int[] intArray20 = ds.MaxMin2.maxMin2(intArray18, (int) (short) -1);
        java.lang.Class<?> wildcardClass21 = intArray20.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[100, 10]");
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray16), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray18), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray20), "[100, 100]");
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test615() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test615");
        int[] intArray2 = new int[] { (short) 100, 10 };
        int[] intArray4 = ds.MaxMin2.maxMin2(intArray2, (int) (byte) -1);
        int[] intArray6 = ds.MaxMin2.maxMin2(intArray2, (int) (byte) -1);
        int[] intArray8 = ds.MaxMin2.maxMin2(intArray6, (int) (byte) 0);
        int[] intArray10 = ds.MaxMin2.maxMin2(intArray8, (int) (short) 1);
        int[] intArray12 = ds.MaxMin2.maxMin2(intArray10, 1);
        int[] intArray14 = ds.MaxMin2.maxMin2(intArray10, 1);
        int[] intArray16 = ds.MaxMin2.maxMin2(intArray14, 0);
        int[] intArray18 = ds.MaxMin2.maxMin2(intArray16, (int) (byte) 0);
        int[] intArray20 = ds.MaxMin2.maxMin2(intArray16, (-1));
        int[] intArray22 = ds.MaxMin2.maxMin2(intArray16, (int) (byte) 1);
        int[] intArray24 = ds.MaxMin2.maxMin2(intArray22, (int) (short) -1);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[100, 10]");
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray16), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray18), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray20), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray22), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray24), "[100, 100]");
    }

    @Test
    public void test616() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test616");
        int[] intArray2 = new int[] { (short) 100, 10 };
        int[] intArray4 = ds.MaxMin2.maxMin2(intArray2, (int) (byte) -1);
        int[] intArray6 = ds.MaxMin2.maxMin2(intArray2, (int) (byte) -1);
        int[] intArray8 = ds.MaxMin2.maxMin2(intArray6, (int) (byte) 0);
        int[] intArray10 = ds.MaxMin2.maxMin2(intArray6, 1);
        int[] intArray12 = ds.MaxMin2.maxMin2(intArray6, (int) (short) 0);
        int[] intArray14 = ds.MaxMin2.maxMin2(intArray12, (int) (byte) 0);
        int[] intArray16 = ds.MaxMin2.maxMin2(intArray14, (int) (short) 1);
        int[] intArray18 = ds.MaxMin2.maxMin2(intArray16, (int) (short) 1);
        java.lang.Class<?> wildcardClass19 = intArray16.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[100, 10]");
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray16), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray18), "[100, 100]");
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test617() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test617");
        int[] intArray2 = new int[] { (short) 100, 10 };
        int[] intArray4 = ds.MaxMin2.maxMin2(intArray2, (int) (byte) -1);
        int[] intArray6 = ds.MaxMin2.maxMin2(intArray2, (int) (byte) -1);
        int[] intArray8 = ds.MaxMin2.maxMin2(intArray6, (int) (byte) 0);
        int[] intArray10 = ds.MaxMin2.maxMin2(intArray6, 1);
        int[] intArray12 = ds.MaxMin2.maxMin2(intArray6, (int) (short) 0);
        int[] intArray14 = ds.MaxMin2.maxMin2(intArray12, (int) (short) 0);
        int[] intArray16 = ds.MaxMin2.maxMin2(intArray12, 0);
        int[] intArray18 = ds.MaxMin2.maxMin2(intArray12, (int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray20 = ds.MaxMin2.maxMin2(intArray12, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[100, 10]");
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray16), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray18), "[100, 100]");
    }

    @Test
    public void test618() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test618");
        int[] intArray2 = new int[] { (short) 100, 10 };
        int[] intArray4 = ds.MaxMin2.maxMin2(intArray2, (int) (byte) -1);
        int[] intArray6 = ds.MaxMin2.maxMin2(intArray2, (int) (byte) -1);
        int[] intArray8 = ds.MaxMin2.maxMin2(intArray6, (int) (byte) -1);
        int[] intArray10 = ds.MaxMin2.maxMin2(intArray6, (int) (byte) 1);
        int[] intArray12 = ds.MaxMin2.maxMin2(intArray10, 1);
        int[] intArray14 = ds.MaxMin2.maxMin2(intArray12, 0);
        int[] intArray16 = ds.MaxMin2.maxMin2(intArray14, (int) (byte) 0);
        int[] intArray18 = ds.MaxMin2.maxMin2(intArray14, (int) (byte) -1);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[100, 10]");
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray16), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray18), "[100, 100]");
    }

    @Test
    public void test619() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test619");
        int[] intArray2 = new int[] { (short) 100, 10 };
        int[] intArray4 = ds.MaxMin2.maxMin2(intArray2, (int) (byte) -1);
        int[] intArray6 = ds.MaxMin2.maxMin2(intArray2, (int) (byte) -1);
        int[] intArray8 = ds.MaxMin2.maxMin2(intArray6, (int) (byte) 0);
        int[] intArray10 = ds.MaxMin2.maxMin2(intArray6, 1);
        int[] intArray12 = ds.MaxMin2.maxMin2(intArray6, (int) (short) 0);
        int[] intArray14 = ds.MaxMin2.maxMin2(intArray6, (int) (byte) 0);
        int[] intArray16 = ds.MaxMin2.maxMin2(intArray6, (int) (short) 0);
        int[] intArray18 = ds.MaxMin2.maxMin2(intArray16, (int) (short) 1);
        int[] intArray20 = ds.MaxMin2.maxMin2(intArray16, (int) (byte) -1);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray22 = ds.MaxMin2.maxMin2(intArray20, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[100, 10]");
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray16), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray18), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray20), "[100, 100]");
    }

    @Test
    public void test620() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test620");
        int[] intArray2 = new int[] { (short) 100, 10 };
        int[] intArray4 = ds.MaxMin2.maxMin2(intArray2, (int) (byte) -1);
        int[] intArray6 = ds.MaxMin2.maxMin2(intArray4, (int) (short) 0);
        int[] intArray8 = ds.MaxMin2.maxMin2(intArray4, 1);
        int[] intArray10 = ds.MaxMin2.maxMin2(intArray8, (int) (byte) 0);
        int[] intArray12 = ds.MaxMin2.maxMin2(intArray10, 1);
        java.lang.Class<?> wildcardClass13 = intArray10.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[100, 10]");
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[100, 100]");
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test621() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test621");
        int[] intArray2 = new int[] { (short) 100, 10 };
        int[] intArray4 = ds.MaxMin2.maxMin2(intArray2, (int) (byte) -1);
        int[] intArray6 = ds.MaxMin2.maxMin2(intArray2, (int) (byte) -1);
        int[] intArray8 = ds.MaxMin2.maxMin2(intArray6, (int) (byte) 0);
        int[] intArray10 = ds.MaxMin2.maxMin2(intArray6, 1);
        int[] intArray12 = ds.MaxMin2.maxMin2(intArray6, (int) (short) 0);
        int[] intArray14 = ds.MaxMin2.maxMin2(intArray12, (int) (short) 0);
        int[] intArray16 = ds.MaxMin2.maxMin2(intArray12, 0);
        int[] intArray18 = ds.MaxMin2.maxMin2(intArray16, (int) (short) 1);
        java.lang.Class<?> wildcardClass19 = intArray18.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[100, 10]");
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray16), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray18), "[100, 100]");
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test622() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test622");
        int[] intArray2 = new int[] { (short) 100, 10 };
        int[] intArray4 = ds.MaxMin2.maxMin2(intArray2, (int) (byte) -1);
        int[] intArray6 = ds.MaxMin2.maxMin2(intArray4, (int) (short) 0);
        int[] intArray8 = ds.MaxMin2.maxMin2(intArray4, (-1));
        int[] intArray10 = ds.MaxMin2.maxMin2(intArray8, (int) (byte) 0);
        int[] intArray12 = ds.MaxMin2.maxMin2(intArray8, (int) (short) 0);
        java.lang.Class<?> wildcardClass13 = intArray12.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[100, 10]");
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[100, 100]");
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test623() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test623");
        int[] intArray2 = new int[] { (short) 100, 10 };
        int[] intArray4 = ds.MaxMin2.maxMin2(intArray2, (int) (byte) -1);
        int[] intArray6 = ds.MaxMin2.maxMin2(intArray2, (int) (byte) -1);
        int[] intArray8 = ds.MaxMin2.maxMin2(intArray6, (int) (byte) 0);
        int[] intArray10 = ds.MaxMin2.maxMin2(intArray8, (int) (short) 1);
        int[] intArray12 = ds.MaxMin2.maxMin2(intArray10, (int) (byte) -1);
        int[] intArray14 = ds.MaxMin2.maxMin2(intArray10, (int) (short) 1);
        int[] intArray16 = ds.MaxMin2.maxMin2(intArray10, (int) (byte) 0);
        java.lang.Class<?> wildcardClass17 = intArray16.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[100, 10]");
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray16), "[100, 100]");
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test624() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test624");
        int[] intArray2 = new int[] { (short) 100, 10 };
        int[] intArray4 = ds.MaxMin2.maxMin2(intArray2, (int) (byte) -1);
        int[] intArray6 = ds.MaxMin2.maxMin2(intArray2, (int) (byte) -1);
        int[] intArray8 = ds.MaxMin2.maxMin2(intArray6, (int) (byte) 0);
        int[] intArray10 = ds.MaxMin2.maxMin2(intArray6, 1);
        int[] intArray12 = ds.MaxMin2.maxMin2(intArray6, (int) (short) 0);
        int[] intArray14 = ds.MaxMin2.maxMin2(intArray6, (int) (byte) 0);
        java.lang.Class<?> wildcardClass15 = intArray14.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[100, 10]");
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[100, 100]");
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test625() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test625");
        int[] intArray2 = new int[] { (short) 100, 10 };
        int[] intArray4 = ds.MaxMin2.maxMin2(intArray2, (int) (byte) -1);
        int[] intArray6 = ds.MaxMin2.maxMin2(intArray2, (int) (byte) -1);
        int[] intArray8 = ds.MaxMin2.maxMin2(intArray6, (int) (byte) 0);
        int[] intArray10 = ds.MaxMin2.maxMin2(intArray8, (int) (short) 1);
        int[] intArray12 = ds.MaxMin2.maxMin2(intArray10, 1);
        int[] intArray14 = ds.MaxMin2.maxMin2(intArray10, 1);
        int[] intArray16 = ds.MaxMin2.maxMin2(intArray14, (int) (byte) -1);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray18 = ds.MaxMin2.maxMin2(intArray16, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[100, 10]");
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray16), "[100, 100]");
    }

    @Test
    public void test626() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test626");
        int[] intArray2 = new int[] { (short) 100, 10 };
        int[] intArray4 = ds.MaxMin2.maxMin2(intArray2, (int) (byte) -1);
        int[] intArray6 = ds.MaxMin2.maxMin2(intArray2, (int) (byte) -1);
        int[] intArray8 = ds.MaxMin2.maxMin2(intArray6, (int) (byte) 0);
        int[] intArray10 = ds.MaxMin2.maxMin2(intArray6, 1);
        int[] intArray12 = ds.MaxMin2.maxMin2(intArray6, (int) (byte) 0);
        int[] intArray14 = ds.MaxMin2.maxMin2(intArray6, 1);
        int[] intArray16 = ds.MaxMin2.maxMin2(intArray6, 0);
        int[] intArray18 = ds.MaxMin2.maxMin2(intArray16, (-1));
        int[] intArray20 = ds.MaxMin2.maxMin2(intArray18, (int) (short) -1);
        int[] intArray22 = ds.MaxMin2.maxMin2(intArray18, (int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray24 = ds.MaxMin2.maxMin2(intArray18, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[100, 10]");
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray16), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray18), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray20), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray22), "[100, 100]");
    }

    @Test
    public void test627() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test627");
        int[] intArray2 = new int[] { (short) 100, 10 };
        int[] intArray4 = ds.MaxMin2.maxMin2(intArray2, (int) (byte) -1);
        int[] intArray6 = ds.MaxMin2.maxMin2(intArray4, (int) (short) 0);
        int[] intArray8 = ds.MaxMin2.maxMin2(intArray4, 1);
        int[] intArray10 = ds.MaxMin2.maxMin2(intArray8, (int) (short) 1);
        int[] intArray12 = ds.MaxMin2.maxMin2(intArray8, 0);
        java.lang.Class<?> wildcardClass13 = intArray12.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[100, 10]");
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[100, 100]");
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test628() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test628");
        int[] intArray2 = new int[] { (short) 100, 10 };
        int[] intArray4 = ds.MaxMin2.maxMin2(intArray2, (int) (byte) -1);
        int[] intArray6 = ds.MaxMin2.maxMin2(intArray2, (int) (byte) -1);
        int[] intArray8 = ds.MaxMin2.maxMin2(intArray6, (int) (byte) 0);
        int[] intArray10 = ds.MaxMin2.maxMin2(intArray6, 1);
        int[] intArray12 = ds.MaxMin2.maxMin2(intArray6, (int) (short) 0);
        int[] intArray14 = ds.MaxMin2.maxMin2(intArray12, (int) (byte) 0);
        int[] intArray16 = ds.MaxMin2.maxMin2(intArray12, (int) (short) 1);
        java.lang.Class<?> wildcardClass17 = intArray12.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[100, 10]");
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray16), "[100, 100]");
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test629() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test629");
        int[] intArray2 = new int[] { (short) 100, 10 };
        int[] intArray4 = ds.MaxMin2.maxMin2(intArray2, (int) (byte) -1);
        int[] intArray6 = ds.MaxMin2.maxMin2(intArray4, (int) (short) 0);
        int[] intArray8 = ds.MaxMin2.maxMin2(intArray6, 0);
        int[] intArray10 = ds.MaxMin2.maxMin2(intArray8, (-1));
        int[] intArray12 = ds.MaxMin2.maxMin2(intArray10, (int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray14 = ds.MaxMin2.maxMin2(intArray12, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[100, 10]");
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[100, 100]");
    }

    @Test
    public void test630() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test630");
        int[] intArray2 = new int[] { (short) 100, 10 };
        int[] intArray4 = ds.MaxMin2.maxMin2(intArray2, (int) (byte) -1);
        int[] intArray6 = ds.MaxMin2.maxMin2(intArray2, (int) (byte) -1);
        int[] intArray8 = ds.MaxMin2.maxMin2(intArray6, (int) (byte) -1);
        int[] intArray10 = ds.MaxMin2.maxMin2(intArray8, (-1));
        int[] intArray12 = ds.MaxMin2.maxMin2(intArray8, 0);
        int[] intArray14 = ds.MaxMin2.maxMin2(intArray8, (int) (byte) -1);
        int[] intArray16 = ds.MaxMin2.maxMin2(intArray14, (int) (short) -1);
        int[] intArray18 = ds.MaxMin2.maxMin2(intArray16, (int) (short) 1);
        int[] intArray20 = ds.MaxMin2.maxMin2(intArray18, (int) (byte) -1);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[100, 10]");
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray16), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray18), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray20), "[100, 100]");
    }

    @Test
    public void test631() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test631");
        int[] intArray2 = new int[] { (short) 100, 10 };
        int[] intArray4 = ds.MaxMin2.maxMin2(intArray2, (int) (byte) -1);
        int[] intArray6 = ds.MaxMin2.maxMin2(intArray2, (int) (byte) -1);
        int[] intArray8 = ds.MaxMin2.maxMin2(intArray6, (int) (byte) -1);
        int[] intArray10 = ds.MaxMin2.maxMin2(intArray8, (-1));
        int[] intArray12 = ds.MaxMin2.maxMin2(intArray8, 0);
        int[] intArray14 = ds.MaxMin2.maxMin2(intArray8, (int) (short) 1);
        int[] intArray16 = ds.MaxMin2.maxMin2(intArray14, 0);
        int[] intArray18 = ds.MaxMin2.maxMin2(intArray16, (-1));
        java.lang.Class<?> wildcardClass19 = intArray18.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[100, 10]");
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray16), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray18), "[100, 100]");
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test632() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test632");
        int[] intArray2 = new int[] { (short) 100, 10 };
        int[] intArray4 = ds.MaxMin2.maxMin2(intArray2, (int) (byte) -1);
        int[] intArray6 = ds.MaxMin2.maxMin2(intArray2, (int) (byte) -1);
        int[] intArray8 = ds.MaxMin2.maxMin2(intArray6, (int) (byte) -1);
        int[] intArray10 = ds.MaxMin2.maxMin2(intArray8, (-1));
        int[] intArray12 = ds.MaxMin2.maxMin2(intArray8, 0);
        int[] intArray14 = ds.MaxMin2.maxMin2(intArray12, (int) (byte) 1);
        int[] intArray16 = ds.MaxMin2.maxMin2(intArray12, (int) (short) 0);
        int[] intArray18 = ds.MaxMin2.maxMin2(intArray16, (-1));
        int[] intArray20 = ds.MaxMin2.maxMin2(intArray16, 0);
        int[] intArray22 = ds.MaxMin2.maxMin2(intArray16, (int) (short) 1);
        int[] intArray24 = ds.MaxMin2.maxMin2(intArray16, (int) (byte) 1);
        java.lang.Class<?> wildcardClass25 = intArray24.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[100, 10]");
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray16), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray18), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray20), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray22), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray24), "[100, 100]");
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test633() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test633");
        int[] intArray2 = new int[] { (short) 100, 10 };
        int[] intArray4 = ds.MaxMin2.maxMin2(intArray2, (int) (byte) -1);
        int[] intArray6 = ds.MaxMin2.maxMin2(intArray2, (int) (byte) -1);
        int[] intArray8 = ds.MaxMin2.maxMin2(intArray6, (int) (byte) 0);
        int[] intArray10 = ds.MaxMin2.maxMin2(intArray6, 1);
        int[] intArray12 = ds.MaxMin2.maxMin2(intArray6, (int) (byte) 0);
        int[] intArray14 = ds.MaxMin2.maxMin2(intArray6, 1);
        int[] intArray16 = ds.MaxMin2.maxMin2(intArray6, 0);
        int[] intArray18 = ds.MaxMin2.maxMin2(intArray16, (-1));
        int[] intArray20 = ds.MaxMin2.maxMin2(intArray18, (int) (short) -1);
        int[] intArray22 = ds.MaxMin2.maxMin2(intArray20, 0);
        int[] intArray24 = ds.MaxMin2.maxMin2(intArray22, 1);
        int[] intArray26 = ds.MaxMin2.maxMin2(intArray24, (int) (byte) -1);
        java.lang.Class<?> wildcardClass27 = intArray24.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[100, 10]");
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray16), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray18), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray20), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray22), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray24), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray26), "[100, 100]");
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test634() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test634");
        int[] intArray2 = new int[] { (short) 100, 10 };
        int[] intArray4 = ds.MaxMin2.maxMin2(intArray2, (int) (byte) -1);
        int[] intArray6 = ds.MaxMin2.maxMin2(intArray2, (int) (byte) -1);
        int[] intArray8 = ds.MaxMin2.maxMin2(intArray6, (int) (byte) 0);
        int[] intArray10 = ds.MaxMin2.maxMin2(intArray8, (int) (short) 1);
        int[] intArray12 = ds.MaxMin2.maxMin2(intArray10, (int) (byte) -1);
        int[] intArray14 = ds.MaxMin2.maxMin2(intArray12, (int) (short) -1);
        int[] intArray16 = ds.MaxMin2.maxMin2(intArray14, (int) (short) 0);
        java.lang.Class<?> wildcardClass17 = intArray16.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[100, 10]");
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray16), "[100, 100]");
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test635() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test635");
        int[] intArray2 = new int[] { (short) 100, 10 };
        int[] intArray4 = ds.MaxMin2.maxMin2(intArray2, (int) (byte) -1);
        int[] intArray6 = ds.MaxMin2.maxMin2(intArray2, (int) (byte) -1);
        int[] intArray8 = ds.MaxMin2.maxMin2(intArray6, (int) (byte) -1);
        int[] intArray10 = ds.MaxMin2.maxMin2(intArray8, (-1));
        int[] intArray12 = ds.MaxMin2.maxMin2(intArray8, (int) (short) 0);
        int[] intArray14 = ds.MaxMin2.maxMin2(intArray8, 0);
        java.lang.Class<?> wildcardClass15 = intArray14.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[100, 10]");
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[100, 100]");
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test636() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test636");
        int[] intArray2 = new int[] { (short) 100, 10 };
        int[] intArray4 = ds.MaxMin2.maxMin2(intArray2, (int) (byte) -1);
        int[] intArray6 = ds.MaxMin2.maxMin2(intArray2, (int) (byte) -1);
        int[] intArray8 = ds.MaxMin2.maxMin2(intArray6, (int) (byte) 0);
        int[] intArray10 = ds.MaxMin2.maxMin2(intArray6, 1);
        int[] intArray12 = ds.MaxMin2.maxMin2(intArray6, (int) (short) 0);
        int[] intArray14 = ds.MaxMin2.maxMin2(intArray12, (int) (byte) 0);
        int[] intArray16 = ds.MaxMin2.maxMin2(intArray14, (int) (byte) -1);
        int[] intArray18 = ds.MaxMin2.maxMin2(intArray16, (int) (byte) -1);
        int[] intArray20 = ds.MaxMin2.maxMin2(intArray16, (int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray22 = ds.MaxMin2.maxMin2(intArray16, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[100, 10]");
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray16), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray18), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray20), "[100, 100]");
    }

    @Test
    public void test637() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test637");
        int[] intArray2 = new int[] { (short) 100, 10 };
        int[] intArray4 = ds.MaxMin2.maxMin2(intArray2, (int) (byte) -1);
        int[] intArray6 = ds.MaxMin2.maxMin2(intArray2, (int) (byte) -1);
        int[] intArray8 = ds.MaxMin2.maxMin2(intArray6, (int) (byte) 0);
        int[] intArray10 = ds.MaxMin2.maxMin2(intArray6, 1);
        int[] intArray12 = ds.MaxMin2.maxMin2(intArray6, (int) (byte) 0);
        int[] intArray14 = ds.MaxMin2.maxMin2(intArray6, (int) (short) 0);
        int[] intArray16 = ds.MaxMin2.maxMin2(intArray14, (int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray18 = ds.MaxMin2.maxMin2(intArray14, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[100, 10]");
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray16), "[100, 100]");
    }

    @Test
    public void test638() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test638");
        int[] intArray2 = new int[] { (short) 100, 10 };
        int[] intArray4 = ds.MaxMin2.maxMin2(intArray2, (int) (byte) -1);
        int[] intArray6 = ds.MaxMin2.maxMin2(intArray2, (int) (byte) -1);
        int[] intArray8 = ds.MaxMin2.maxMin2(intArray6, (int) (byte) 0);
        int[] intArray10 = ds.MaxMin2.maxMin2(intArray6, 1);
        int[] intArray12 = ds.MaxMin2.maxMin2(intArray6, (int) (short) 0);
        int[] intArray14 = ds.MaxMin2.maxMin2(intArray6, (int) (byte) 0);
        int[] intArray16 = ds.MaxMin2.maxMin2(intArray6, (int) (short) 0);
        int[] intArray18 = ds.MaxMin2.maxMin2(intArray16, 0);
        int[] intArray20 = ds.MaxMin2.maxMin2(intArray18, (int) (short) -1);
        int[] intArray22 = ds.MaxMin2.maxMin2(intArray18, (int) (short) -1);
        int[] intArray24 = ds.MaxMin2.maxMin2(intArray22, (int) (short) 1);
        java.lang.Class<?> wildcardClass25 = intArray24.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[100, 10]");
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray16), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray18), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray20), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray22), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray24), "[100, 100]");
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test639() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test639");
        int[] intArray2 = new int[] { (short) 100, 10 };
        int[] intArray4 = ds.MaxMin2.maxMin2(intArray2, (int) (byte) -1);
        int[] intArray6 = ds.MaxMin2.maxMin2(intArray2, (int) (byte) -1);
        int[] intArray8 = ds.MaxMin2.maxMin2(intArray6, (int) (byte) 0);
        int[] intArray10 = ds.MaxMin2.maxMin2(intArray8, (int) (short) 1);
        int[] intArray12 = ds.MaxMin2.maxMin2(intArray10, (int) (byte) 0);
        int[] intArray14 = ds.MaxMin2.maxMin2(intArray12, (int) (short) 0);
        int[] intArray16 = ds.MaxMin2.maxMin2(intArray14, (-1));
        java.lang.Class<?> wildcardClass17 = intArray16.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[100, 10]");
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray16), "[100, 100]");
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test640() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test640");
        int[] intArray2 = new int[] { (short) 100, 10 };
        int[] intArray4 = ds.MaxMin2.maxMin2(intArray2, (int) (byte) -1);
        int[] intArray6 = ds.MaxMin2.maxMin2(intArray2, (int) (byte) -1);
        int[] intArray8 = ds.MaxMin2.maxMin2(intArray6, (int) (byte) 0);
        int[] intArray10 = ds.MaxMin2.maxMin2(intArray6, 1);
        int[] intArray12 = ds.MaxMin2.maxMin2(intArray6, (int) (short) 0);
        int[] intArray14 = ds.MaxMin2.maxMin2(intArray6, (int) (byte) 0);
        int[] intArray16 = ds.MaxMin2.maxMin2(intArray6, (int) (short) 0);
        int[] intArray18 = ds.MaxMin2.maxMin2(intArray6, (int) (byte) 1);
        int[] intArray20 = ds.MaxMin2.maxMin2(intArray18, (int) (byte) 0);
        int[] intArray22 = ds.MaxMin2.maxMin2(intArray18, 0);
        int[] intArray24 = ds.MaxMin2.maxMin2(intArray22, (int) (byte) 0);
        java.lang.Class<?> wildcardClass25 = intArray24.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[100, 10]");
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray16), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray18), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray20), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray22), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray24), "[100, 100]");
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test641() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test641");
        int[] intArray2 = new int[] { (short) 100, 10 };
        int[] intArray4 = ds.MaxMin2.maxMin2(intArray2, (int) (byte) -1);
        int[] intArray6 = ds.MaxMin2.maxMin2(intArray4, (int) (short) 0);
        int[] intArray8 = ds.MaxMin2.maxMin2(intArray4, (-1));
        int[] intArray10 = ds.MaxMin2.maxMin2(intArray8, (int) (byte) 0);
        int[] intArray12 = ds.MaxMin2.maxMin2(intArray8, (int) (byte) 0);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[100, 10]");
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[100, 100]");
    }

    @Test
    public void test642() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test642");
        int[] intArray2 = new int[] { (short) 100, 10 };
        int[] intArray4 = ds.MaxMin2.maxMin2(intArray2, (int) (byte) -1);
        int[] intArray6 = ds.MaxMin2.maxMin2(intArray2, (int) (byte) -1);
        int[] intArray8 = ds.MaxMin2.maxMin2(intArray6, (int) (byte) 0);
        int[] intArray10 = ds.MaxMin2.maxMin2(intArray8, (int) (short) 1);
        int[] intArray12 = ds.MaxMin2.maxMin2(intArray10, (int) (byte) -1);
        int[] intArray14 = ds.MaxMin2.maxMin2(intArray10, (int) (short) 1);
        int[] intArray16 = ds.MaxMin2.maxMin2(intArray10, (int) (byte) 0);
        int[] intArray18 = ds.MaxMin2.maxMin2(intArray10, (-1));
        java.lang.Class<?> wildcardClass19 = intArray18.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[100, 10]");
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray16), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray18), "[100, 100]");
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test643() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test643");
        int[] intArray2 = new int[] { (short) 100, 10 };
        int[] intArray4 = ds.MaxMin2.maxMin2(intArray2, (int) (byte) -1);
        int[] intArray6 = ds.MaxMin2.maxMin2(intArray2, (int) (byte) -1);
        int[] intArray8 = ds.MaxMin2.maxMin2(intArray6, (int) (byte) 0);
        int[] intArray10 = ds.MaxMin2.maxMin2(intArray6, 1);
        int[] intArray12 = ds.MaxMin2.maxMin2(intArray6, (int) (short) 0);
        int[] intArray14 = ds.MaxMin2.maxMin2(intArray6, (int) (byte) 0);
        int[] intArray16 = ds.MaxMin2.maxMin2(intArray6, (int) (short) 0);
        int[] intArray18 = ds.MaxMin2.maxMin2(intArray16, (int) (short) 1);
        int[] intArray20 = ds.MaxMin2.maxMin2(intArray18, (int) (short) -1);
        int[] intArray22 = ds.MaxMin2.maxMin2(intArray20, (int) (byte) -1);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[100, 10]");
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray16), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray18), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray20), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray22), "[100, 100]");
    }

    @Test
    public void test644() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test644");
        int[] intArray2 = new int[] { (short) 100, 10 };
        int[] intArray4 = ds.MaxMin2.maxMin2(intArray2, (int) (byte) -1);
        int[] intArray6 = ds.MaxMin2.maxMin2(intArray2, (int) (byte) -1);
        int[] intArray8 = ds.MaxMin2.maxMin2(intArray6, (int) (byte) -1);
        int[] intArray10 = ds.MaxMin2.maxMin2(intArray8, (-1));
        int[] intArray12 = ds.MaxMin2.maxMin2(intArray8, 0);
        int[] intArray14 = ds.MaxMin2.maxMin2(intArray12, (int) (byte) 1);
        int[] intArray16 = ds.MaxMin2.maxMin2(intArray12, (int) (short) 0);
        int[] intArray18 = ds.MaxMin2.maxMin2(intArray16, (-1));
        int[] intArray20 = ds.MaxMin2.maxMin2(intArray18, (int) (short) 0);
        int[] intArray22 = ds.MaxMin2.maxMin2(intArray18, (int) (byte) -1);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray24 = ds.MaxMin2.maxMin2(intArray18, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[100, 10]");
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray16), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray18), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray20), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray22), "[100, 100]");
    }

    @Test
    public void test645() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test645");
        int[] intArray2 = new int[] { (short) 100, 10 };
        int[] intArray4 = ds.MaxMin2.maxMin2(intArray2, (int) (byte) -1);
        int[] intArray6 = ds.MaxMin2.maxMin2(intArray2, (int) (byte) -1);
        int[] intArray8 = ds.MaxMin2.maxMin2(intArray6, (int) (byte) 0);
        int[] intArray10 = ds.MaxMin2.maxMin2(intArray6, 1);
        int[] intArray12 = ds.MaxMin2.maxMin2(intArray6, (int) (short) 0);
        int[] intArray14 = ds.MaxMin2.maxMin2(intArray12, (int) (short) 0);
        int[] intArray16 = ds.MaxMin2.maxMin2(intArray12, 0);
        int[] intArray18 = ds.MaxMin2.maxMin2(intArray16, (int) (byte) 0);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[100, 10]");
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray16), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray18), "[100, 100]");
    }

    @Test
    public void test646() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test646");
        int[] intArray2 = new int[] { (short) 100, 10 };
        int[] intArray4 = ds.MaxMin2.maxMin2(intArray2, (int) (byte) -1);
        int[] intArray6 = ds.MaxMin2.maxMin2(intArray2, (int) (byte) -1);
        int[] intArray8 = ds.MaxMin2.maxMin2(intArray6, (int) (byte) 0);
        int[] intArray10 = ds.MaxMin2.maxMin2(intArray6, 1);
        int[] intArray12 = ds.MaxMin2.maxMin2(intArray6, (-1));
        int[] intArray14 = ds.MaxMin2.maxMin2(intArray6, 1);
        int[] intArray16 = ds.MaxMin2.maxMin2(intArray14, (int) (short) -1);
        int[] intArray18 = ds.MaxMin2.maxMin2(intArray14, 0);
        int[] intArray20 = ds.MaxMin2.maxMin2(intArray14, (int) (byte) 0);
        int[] intArray22 = ds.MaxMin2.maxMin2(intArray14, 1);
        int[] intArray24 = ds.MaxMin2.maxMin2(intArray22, 0);
        int[] intArray26 = ds.MaxMin2.maxMin2(intArray22, (int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray28 = ds.MaxMin2.maxMin2(intArray22, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[100, 10]");
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray16), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray18), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray20), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray22), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray24), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray26), "[100, 100]");
    }

    @Test
    public void test647() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test647");
        int[] intArray2 = new int[] { (short) 100, 10 };
        int[] intArray4 = ds.MaxMin2.maxMin2(intArray2, (int) (byte) -1);
        int[] intArray6 = ds.MaxMin2.maxMin2(intArray4, (int) (short) 0);
        int[] intArray8 = ds.MaxMin2.maxMin2(intArray4, (-1));
        int[] intArray10 = ds.MaxMin2.maxMin2(intArray8, (int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray12 = ds.MaxMin2.maxMin2(intArray10, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[100, 10]");
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[100, 100]");
    }

    @Test
    public void test648() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test648");
        int[] intArray2 = new int[] { (short) 100, 10 };
        int[] intArray4 = ds.MaxMin2.maxMin2(intArray2, (int) (byte) -1);
        int[] intArray6 = ds.MaxMin2.maxMin2(intArray2, (int) (byte) -1);
        int[] intArray8 = ds.MaxMin2.maxMin2(intArray6, (int) (byte) -1);
        int[] intArray10 = ds.MaxMin2.maxMin2(intArray6, (int) (byte) 1);
        int[] intArray12 = ds.MaxMin2.maxMin2(intArray10, 1);
        int[] intArray14 = ds.MaxMin2.maxMin2(intArray12, 0);
        int[] intArray16 = ds.MaxMin2.maxMin2(intArray14, (int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray18 = ds.MaxMin2.maxMin2(intArray14, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[100, 10]");
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray16), "[100, 100]");
    }

    @Test
    public void test649() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test649");
        int[] intArray2 = new int[] { (short) 100, 10 };
        int[] intArray4 = ds.MaxMin2.maxMin2(intArray2, (int) (byte) -1);
        int[] intArray6 = ds.MaxMin2.maxMin2(intArray2, (int) (byte) -1);
        int[] intArray8 = ds.MaxMin2.maxMin2(intArray6, (int) (byte) 0);
        int[] intArray10 = ds.MaxMin2.maxMin2(intArray6, 1);
        int[] intArray12 = ds.MaxMin2.maxMin2(intArray6, (int) (byte) 1);
        int[] intArray14 = ds.MaxMin2.maxMin2(intArray6, (int) (short) -1);
        java.lang.Class<?> wildcardClass15 = intArray6.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[100, 10]");
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[100, 100]");
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test650() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test650");
        int[] intArray2 = new int[] { (short) 100, 10 };
        int[] intArray4 = ds.MaxMin2.maxMin2(intArray2, (int) (byte) -1);
        int[] intArray6 = ds.MaxMin2.maxMin2(intArray2, (int) (byte) -1);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray8 = ds.MaxMin2.maxMin2(intArray6, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[100, 10]");
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[100, 100]");
    }

    @Test
    public void test651() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test651");
        int[] intArray2 = new int[] { (short) 100, 10 };
        int[] intArray4 = ds.MaxMin2.maxMin2(intArray2, (int) (byte) -1);
        int[] intArray6 = ds.MaxMin2.maxMin2(intArray2, (int) (byte) -1);
        int[] intArray8 = ds.MaxMin2.maxMin2(intArray6, (int) (byte) 0);
        int[] intArray10 = ds.MaxMin2.maxMin2(intArray6, 1);
        int[] intArray12 = ds.MaxMin2.maxMin2(intArray6, (int) (short) 0);
        int[] intArray14 = ds.MaxMin2.maxMin2(intArray6, (int) (byte) 0);
        int[] intArray16 = ds.MaxMin2.maxMin2(intArray6, (int) (short) 0);
        int[] intArray18 = ds.MaxMin2.maxMin2(intArray6, (int) (byte) 1);
        int[] intArray20 = ds.MaxMin2.maxMin2(intArray18, (int) (short) 0);
        java.lang.Class<?> wildcardClass21 = intArray20.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[100, 10]");
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray16), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray18), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray20), "[100, 100]");
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test652() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test652");
        int[] intArray2 = new int[] { (short) 100, 10 };
        int[] intArray4 = ds.MaxMin2.maxMin2(intArray2, (int) (byte) -1);
        int[] intArray6 = ds.MaxMin2.maxMin2(intArray4, (int) (short) 0);
        int[] intArray8 = ds.MaxMin2.maxMin2(intArray4, 1);
        int[] intArray10 = ds.MaxMin2.maxMin2(intArray8, (int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray12 = ds.MaxMin2.maxMin2(intArray8, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[100, 10]");
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[100, 100]");
    }

    @Test
    public void test653() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test653");
        int[] intArray2 = new int[] { (short) 100, 10 };
        int[] intArray4 = ds.MaxMin2.maxMin2(intArray2, (int) (byte) -1);
        int[] intArray6 = ds.MaxMin2.maxMin2(intArray2, (int) (byte) -1);
        int[] intArray8 = ds.MaxMin2.maxMin2(intArray6, (int) (byte) -1);
        int[] intArray10 = ds.MaxMin2.maxMin2(intArray8, (-1));
        int[] intArray12 = ds.MaxMin2.maxMin2(intArray8, 0);
        int[] intArray14 = ds.MaxMin2.maxMin2(intArray12, (int) (byte) 1);
        int[] intArray16 = ds.MaxMin2.maxMin2(intArray12, (int) (short) 0);
        int[] intArray18 = ds.MaxMin2.maxMin2(intArray16, (-1));
        int[] intArray20 = ds.MaxMin2.maxMin2(intArray18, (int) (short) 0);
        int[] intArray22 = ds.MaxMin2.maxMin2(intArray20, (int) (byte) 1);
        int[] intArray24 = ds.MaxMin2.maxMin2(intArray20, (-1));
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray26 = ds.MaxMin2.maxMin2(intArray20, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[100, 10]");
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray16), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray18), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray20), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray22), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray24), "[100, 100]");
    }

    @Test
    public void test654() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test654");
        int[] intArray2 = new int[] { (short) 100, 10 };
        int[] intArray4 = ds.MaxMin2.maxMin2(intArray2, (int) (byte) -1);
        int[] intArray6 = ds.MaxMin2.maxMin2(intArray2, (int) (byte) -1);
        int[] intArray8 = ds.MaxMin2.maxMin2(intArray6, (int) (byte) -1);
        int[] intArray10 = ds.MaxMin2.maxMin2(intArray8, (-1));
        int[] intArray12 = ds.MaxMin2.maxMin2(intArray8, 0);
        int[] intArray14 = ds.MaxMin2.maxMin2(intArray8, (int) (short) 1);
        int[] intArray16 = ds.MaxMin2.maxMin2(intArray14, 0);
        int[] intArray18 = ds.MaxMin2.maxMin2(intArray14, (int) (byte) -1);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray20 = ds.MaxMin2.maxMin2(intArray18, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[100, 10]");
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray16), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray18), "[100, 100]");
    }

    @Test
    public void test655() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test655");
        int[] intArray2 = new int[] { (short) 100, 10 };
        int[] intArray4 = ds.MaxMin2.maxMin2(intArray2, (int) (byte) -1);
        int[] intArray6 = ds.MaxMin2.maxMin2(intArray2, (int) (byte) -1);
        int[] intArray8 = ds.MaxMin2.maxMin2(intArray6, (int) (byte) -1);
        int[] intArray10 = ds.MaxMin2.maxMin2(intArray8, (-1));
        int[] intArray12 = ds.MaxMin2.maxMin2(intArray8, 0);
        int[] intArray14 = ds.MaxMin2.maxMin2(intArray12, (int) (byte) 1);
        int[] intArray16 = ds.MaxMin2.maxMin2(intArray14, (int) (byte) 0);
        int[] intArray18 = ds.MaxMin2.maxMin2(intArray14, (int) (byte) -1);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray20 = ds.MaxMin2.maxMin2(intArray14, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[100, 10]");
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray16), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray18), "[100, 100]");
    }

    @Test
    public void test656() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test656");
        int[] intArray2 = new int[] { (short) 100, 10 };
        int[] intArray4 = ds.MaxMin2.maxMin2(intArray2, (int) (byte) -1);
        int[] intArray6 = ds.MaxMin2.maxMin2(intArray2, (int) (byte) -1);
        int[] intArray8 = ds.MaxMin2.maxMin2(intArray6, (int) (byte) 0);
        int[] intArray10 = ds.MaxMin2.maxMin2(intArray6, 1);
        int[] intArray12 = ds.MaxMin2.maxMin2(intArray6, (int) (short) 0);
        int[] intArray14 = ds.MaxMin2.maxMin2(intArray6, (int) (byte) 0);
        int[] intArray16 = ds.MaxMin2.maxMin2(intArray6, (int) (short) 0);
        int[] intArray18 = ds.MaxMin2.maxMin2(intArray16, 0);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray20 = ds.MaxMin2.maxMin2(intArray18, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[100, 10]");
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray16), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray18), "[100, 100]");
    }

    @Test
    public void test657() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test657");
        int[] intArray2 = new int[] { (short) 100, 10 };
        int[] intArray4 = ds.MaxMin2.maxMin2(intArray2, (int) (byte) -1);
        int[] intArray6 = ds.MaxMin2.maxMin2(intArray2, (int) (byte) -1);
        int[] intArray8 = ds.MaxMin2.maxMin2(intArray6, (int) (byte) 0);
        int[] intArray10 = ds.MaxMin2.maxMin2(intArray6, 1);
        int[] intArray12 = ds.MaxMin2.maxMin2(intArray6, (int) (short) 0);
        int[] intArray14 = ds.MaxMin2.maxMin2(intArray12, (int) (byte) 0);
        int[] intArray16 = ds.MaxMin2.maxMin2(intArray12, (int) (byte) 0);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[100, 10]");
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray16), "[100, 100]");
    }

    @Test
    public void test658() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test658");
        int[] intArray2 = new int[] { (short) 100, 10 };
        int[] intArray4 = ds.MaxMin2.maxMin2(intArray2, (int) (byte) -1);
        int[] intArray6 = ds.MaxMin2.maxMin2(intArray2, (int) (byte) -1);
        int[] intArray8 = ds.MaxMin2.maxMin2(intArray6, (int) (byte) 0);
        int[] intArray10 = ds.MaxMin2.maxMin2(intArray6, 1);
        int[] intArray12 = ds.MaxMin2.maxMin2(intArray6, (int) (byte) 0);
        int[] intArray14 = ds.MaxMin2.maxMin2(intArray6, 1);
        int[] intArray16 = ds.MaxMin2.maxMin2(intArray6, (int) (byte) -1);
        int[] intArray18 = ds.MaxMin2.maxMin2(intArray6, (int) (short) 1);
        java.lang.Class<?> wildcardClass19 = intArray6.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[100, 10]");
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray16), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray18), "[100, 100]");
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test659() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test659");
        int[] intArray2 = new int[] { (short) 100, 10 };
        int[] intArray4 = ds.MaxMin2.maxMin2(intArray2, (int) (byte) -1);
        int[] intArray6 = ds.MaxMin2.maxMin2(intArray2, (int) (byte) -1);
        int[] intArray8 = ds.MaxMin2.maxMin2(intArray6, (int) (byte) 0);
        int[] intArray10 = ds.MaxMin2.maxMin2(intArray8, (int) (short) 1);
        int[] intArray12 = ds.MaxMin2.maxMin2(intArray10, 1);
        int[] intArray14 = ds.MaxMin2.maxMin2(intArray10, 1);
        int[] intArray16 = ds.MaxMin2.maxMin2(intArray14, 0);
        int[] intArray18 = ds.MaxMin2.maxMin2(intArray16, (int) (byte) 0);
        int[] intArray20 = ds.MaxMin2.maxMin2(intArray16, (-1));
        int[] intArray22 = ds.MaxMin2.maxMin2(intArray16, (int) (byte) 1);
        java.lang.Class<?> wildcardClass23 = intArray16.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[100, 10]");
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray16), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray18), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray20), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray22), "[100, 100]");
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test660() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test660");
        int[] intArray2 = new int[] { (short) 100, 10 };
        int[] intArray4 = ds.MaxMin2.maxMin2(intArray2, (int) (byte) -1);
        int[] intArray6 = ds.MaxMin2.maxMin2(intArray4, (int) (short) 0);
        int[] intArray8 = ds.MaxMin2.maxMin2(intArray4, 1);
        int[] intArray10 = ds.MaxMin2.maxMin2(intArray8, (int) (short) 1);
        java.lang.Class<?> wildcardClass11 = intArray10.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[100, 10]");
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[100, 100]");
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test661() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test661");
        int[] intArray2 = new int[] { (short) 100, 10 };
        int[] intArray4 = ds.MaxMin2.maxMin2(intArray2, (int) (byte) -1);
        int[] intArray6 = ds.MaxMin2.maxMin2(intArray2, (int) (byte) -1);
        int[] intArray8 = ds.MaxMin2.maxMin2(intArray6, (int) (byte) -1);
        int[] intArray10 = ds.MaxMin2.maxMin2(intArray8, (-1));
        int[] intArray12 = ds.MaxMin2.maxMin2(intArray8, 0);
        int[] intArray14 = ds.MaxMin2.maxMin2(intArray8, (int) (byte) -1);
        int[] intArray16 = ds.MaxMin2.maxMin2(intArray14, (int) (short) -1);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray18 = ds.MaxMin2.maxMin2(intArray14, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[100, 10]");
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray16), "[100, 100]");
    }

    @Test
    public void test662() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test662");
        int[] intArray2 = new int[] { (short) 100, 10 };
        int[] intArray4 = ds.MaxMin2.maxMin2(intArray2, (int) (byte) -1);
        int[] intArray6 = ds.MaxMin2.maxMin2(intArray2, (int) (byte) -1);
        int[] intArray8 = ds.MaxMin2.maxMin2(intArray6, (int) (byte) 0);
        int[] intArray10 = ds.MaxMin2.maxMin2(intArray6, 1);
        int[] intArray12 = ds.MaxMin2.maxMin2(intArray6, (int) (byte) 0);
        int[] intArray14 = ds.MaxMin2.maxMin2(intArray6, (int) (short) 0);
        int[] intArray16 = ds.MaxMin2.maxMin2(intArray14, (int) (short) 1);
        int[] intArray18 = ds.MaxMin2.maxMin2(intArray14, (int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray20 = ds.MaxMin2.maxMin2(intArray14, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[100, 10]");
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray16), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray18), "[100, 100]");
    }

    @Test
    public void test663() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test663");
        int[] intArray2 = new int[] { (short) 100, 10 };
        int[] intArray4 = ds.MaxMin2.maxMin2(intArray2, (int) (byte) -1);
        int[] intArray6 = ds.MaxMin2.maxMin2(intArray2, (int) (byte) -1);
        int[] intArray8 = ds.MaxMin2.maxMin2(intArray6, (int) (byte) 0);
        int[] intArray10 = ds.MaxMin2.maxMin2(intArray8, (int) (short) 1);
        int[] intArray12 = ds.MaxMin2.maxMin2(intArray10, 1);
        int[] intArray14 = ds.MaxMin2.maxMin2(intArray12, 0);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[100, 10]");
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[100, 100]");
    }

    @Test
    public void test664() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test664");
        int[] intArray2 = new int[] { (short) 100, 10 };
        int[] intArray4 = ds.MaxMin2.maxMin2(intArray2, (int) (byte) -1);
        int[] intArray6 = ds.MaxMin2.maxMin2(intArray2, (int) (byte) -1);
        int[] intArray8 = ds.MaxMin2.maxMin2(intArray6, (int) (byte) -1);
        int[] intArray10 = ds.MaxMin2.maxMin2(intArray8, (-1));
        int[] intArray12 = ds.MaxMin2.maxMin2(intArray8, 0);
        int[] intArray14 = ds.MaxMin2.maxMin2(intArray8, (int) (byte) -1);
        int[] intArray16 = ds.MaxMin2.maxMin2(intArray8, (int) (short) 1);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[100, 10]");
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray16), "[100, 100]");
    }

    @Test
    public void test665() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test665");
        int[] intArray2 = new int[] { (short) 100, 10 };
        int[] intArray4 = ds.MaxMin2.maxMin2(intArray2, (int) (byte) -1);
        int[] intArray6 = ds.MaxMin2.maxMin2(intArray4, (int) (short) 0);
        int[] intArray8 = ds.MaxMin2.maxMin2(intArray4, 1);
        int[] intArray10 = ds.MaxMin2.maxMin2(intArray8, (int) (short) 1);
        int[] intArray12 = ds.MaxMin2.maxMin2(intArray8, 0);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray14 = ds.MaxMin2.maxMin2(intArray12, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[100, 10]");
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[100, 100]");
    }

    @Test
    public void test666() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test666");
        int[] intArray2 = new int[] { (short) 100, 10 };
        int[] intArray4 = ds.MaxMin2.maxMin2(intArray2, (int) (byte) -1);
        int[] intArray6 = ds.MaxMin2.maxMin2(intArray2, (int) (byte) -1);
        int[] intArray8 = ds.MaxMin2.maxMin2(intArray6, (int) (byte) -1);
        int[] intArray10 = ds.MaxMin2.maxMin2(intArray8, (-1));
        int[] intArray12 = ds.MaxMin2.maxMin2(intArray8, 0);
        int[] intArray14 = ds.MaxMin2.maxMin2(intArray12, (int) (byte) 1);
        int[] intArray16 = ds.MaxMin2.maxMin2(intArray12, (int) (short) 0);
        int[] intArray18 = ds.MaxMin2.maxMin2(intArray16, (-1));
        int[] intArray20 = ds.MaxMin2.maxMin2(intArray16, 0);
        int[] intArray22 = ds.MaxMin2.maxMin2(intArray16, (int) (byte) 0);
        int[] intArray24 = ds.MaxMin2.maxMin2(intArray22, (int) (short) 1);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[100, 10]");
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray16), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray18), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray20), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray22), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray24), "[100, 100]");
    }

    @Test
    public void test667() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test667");
        int[] intArray2 = new int[] { (short) 100, 10 };
        int[] intArray4 = ds.MaxMin2.maxMin2(intArray2, (int) (byte) -1);
        int[] intArray6 = ds.MaxMin2.maxMin2(intArray4, (int) (short) 0);
        int[] intArray8 = ds.MaxMin2.maxMin2(intArray6, 0);
        int[] intArray10 = ds.MaxMin2.maxMin2(intArray8, (-1));
        int[] intArray12 = ds.MaxMin2.maxMin2(intArray10, (int) (byte) 0);
        int[] intArray14 = ds.MaxMin2.maxMin2(intArray12, 0);
        int[] intArray16 = ds.MaxMin2.maxMin2(intArray12, (int) (short) 1);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[100, 10]");
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray16), "[100, 100]");
    }

    @Test
    public void test668() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test668");
        int[] intArray2 = new int[] { (short) 100, 10 };
        int[] intArray4 = ds.MaxMin2.maxMin2(intArray2, (int) (byte) -1);
        int[] intArray6 = ds.MaxMin2.maxMin2(intArray4, (int) (short) 0);
        int[] intArray8 = ds.MaxMin2.maxMin2(intArray4, 1);
        int[] intArray10 = ds.MaxMin2.maxMin2(intArray8, (int) (short) 1);
        int[] intArray12 = ds.MaxMin2.maxMin2(intArray8, (-1));
        java.lang.Class<?> wildcardClass13 = intArray12.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[100, 10]");
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[100, 100]");
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test669() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test669");
        int[] intArray2 = new int[] { (short) 100, 10 };
        int[] intArray4 = ds.MaxMin2.maxMin2(intArray2, (int) (byte) -1);
        int[] intArray6 = ds.MaxMin2.maxMin2(intArray2, (int) (byte) -1);
        int[] intArray8 = ds.MaxMin2.maxMin2(intArray6, (int) (byte) 0);
        int[] intArray10 = ds.MaxMin2.maxMin2(intArray6, 1);
        int[] intArray12 = ds.MaxMin2.maxMin2(intArray6, (int) (short) -1);
        int[] intArray14 = ds.MaxMin2.maxMin2(intArray6, (-1));
        java.lang.Class<?> wildcardClass15 = intArray14.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[100, 10]");
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[100, 100]");
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test670() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test670");
        int[] intArray2 = new int[] { (short) 100, 10 };
        int[] intArray4 = ds.MaxMin2.maxMin2(intArray2, (int) (byte) -1);
        int[] intArray6 = ds.MaxMin2.maxMin2(intArray2, (int) (byte) -1);
        int[] intArray8 = ds.MaxMin2.maxMin2(intArray6, (int) (byte) 0);
        int[] intArray10 = ds.MaxMin2.maxMin2(intArray6, 1);
        int[] intArray12 = ds.MaxMin2.maxMin2(intArray6, (int) (byte) 0);
        int[] intArray14 = ds.MaxMin2.maxMin2(intArray6, 1);
        int[] intArray16 = ds.MaxMin2.maxMin2(intArray6, (int) (byte) -1);
        int[] intArray18 = ds.MaxMin2.maxMin2(intArray6, (int) (short) -1);
        int[] intArray20 = ds.MaxMin2.maxMin2(intArray18, 0);
        java.lang.Class<?> wildcardClass21 = intArray20.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[100, 10]");
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray16), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray18), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray20), "[100, 100]");
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test671() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test671");
        int[] intArray2 = new int[] { (short) 100, 10 };
        int[] intArray4 = ds.MaxMin2.maxMin2(intArray2, (int) (byte) -1);
        int[] intArray6 = ds.MaxMin2.maxMin2(intArray2, (int) (byte) -1);
        int[] intArray8 = ds.MaxMin2.maxMin2(intArray6, (int) (byte) 0);
        int[] intArray10 = ds.MaxMin2.maxMin2(intArray6, 1);
        int[] intArray12 = ds.MaxMin2.maxMin2(intArray6, (int) (short) 0);
        int[] intArray14 = ds.MaxMin2.maxMin2(intArray6, (int) (byte) 0);
        int[] intArray16 = ds.MaxMin2.maxMin2(intArray6, (int) (short) 0);
        int[] intArray18 = ds.MaxMin2.maxMin2(intArray6, (int) (byte) 1);
        int[] intArray20 = ds.MaxMin2.maxMin2(intArray18, (int) (byte) 0);
        int[] intArray22 = ds.MaxMin2.maxMin2(intArray18, 0);
        int[] intArray24 = ds.MaxMin2.maxMin2(intArray22, (-1));
        java.lang.Class<?> wildcardClass25 = intArray22.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[100, 10]");
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray16), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray18), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray20), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray22), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray24), "[100, 100]");
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test672() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test672");
        int[] intArray2 = new int[] { (short) 100, 10 };
        int[] intArray4 = ds.MaxMin2.maxMin2(intArray2, (int) (byte) -1);
        int[] intArray6 = ds.MaxMin2.maxMin2(intArray4, (int) (short) 0);
        int[] intArray8 = ds.MaxMin2.maxMin2(intArray4, 1);
        int[] intArray10 = ds.MaxMin2.maxMin2(intArray8, (int) (short) 1);
        int[] intArray12 = ds.MaxMin2.maxMin2(intArray8, (-1));
        java.lang.Class<?> wildcardClass13 = intArray8.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[100, 10]");
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[100, 100]");
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test673() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test673");
        int[] intArray2 = new int[] { (short) 100, 10 };
        int[] intArray4 = ds.MaxMin2.maxMin2(intArray2, (int) (byte) -1);
        int[] intArray6 = ds.MaxMin2.maxMin2(intArray2, (int) (byte) -1);
        int[] intArray8 = ds.MaxMin2.maxMin2(intArray6, (int) (byte) 0);
        int[] intArray10 = ds.MaxMin2.maxMin2(intArray6, 1);
        int[] intArray12 = ds.MaxMin2.maxMin2(intArray6, (int) (byte) 0);
        int[] intArray14 = ds.MaxMin2.maxMin2(intArray6, (-1));
        java.lang.Class<?> wildcardClass15 = intArray6.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[100, 10]");
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[100, 100]");
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test674() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test674");
        int[] intArray2 = new int[] { (short) 100, 10 };
        int[] intArray4 = ds.MaxMin2.maxMin2(intArray2, (int) (byte) -1);
        int[] intArray6 = ds.MaxMin2.maxMin2(intArray2, (int) (byte) -1);
        int[] intArray8 = ds.MaxMin2.maxMin2(intArray6, (int) (byte) 0);
        int[] intArray10 = ds.MaxMin2.maxMin2(intArray8, 0);
        int[] intArray12 = ds.MaxMin2.maxMin2(intArray8, (int) (short) 1);
        int[] intArray14 = ds.MaxMin2.maxMin2(intArray8, 1);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[100, 10]");
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[100, 100]");
    }

    @Test
    public void test675() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test675");
        int[] intArray2 = new int[] { (short) 100, 10 };
        int[] intArray4 = ds.MaxMin2.maxMin2(intArray2, (int) (byte) -1);
        int[] intArray6 = ds.MaxMin2.maxMin2(intArray4, (int) (short) 0);
        int[] intArray8 = ds.MaxMin2.maxMin2(intArray4, (int) (short) 1);
        int[] intArray10 = ds.MaxMin2.maxMin2(intArray8, (int) (short) -1);
        int[] intArray12 = ds.MaxMin2.maxMin2(intArray10, (int) (short) 1);
        int[] intArray14 = ds.MaxMin2.maxMin2(intArray10, 0);
        int[] intArray16 = ds.MaxMin2.maxMin2(intArray14, 1);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[100, 10]");
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray16), "[100, 100]");
    }

    @Test
    public void test676() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test676");
        int[] intArray2 = new int[] { (short) 100, 10 };
        int[] intArray4 = ds.MaxMin2.maxMin2(intArray2, (int) (byte) -1);
        int[] intArray6 = ds.MaxMin2.maxMin2(intArray2, (int) (byte) -1);
        int[] intArray8 = ds.MaxMin2.maxMin2(intArray6, (int) (byte) 0);
        int[] intArray10 = ds.MaxMin2.maxMin2(intArray6, 1);
        int[] intArray12 = ds.MaxMin2.maxMin2(intArray6, (int) (byte) 0);
        int[] intArray14 = ds.MaxMin2.maxMin2(intArray12, (int) (short) 1);
        int[] intArray16 = ds.MaxMin2.maxMin2(intArray12, 0);
        int[] intArray18 = ds.MaxMin2.maxMin2(intArray12, 1);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[100, 10]");
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray16), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray18), "[100, 100]");
    }

    @Test
    public void test677() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test677");
        int[] intArray2 = new int[] { (short) 100, 10 };
        int[] intArray4 = ds.MaxMin2.maxMin2(intArray2, (int) (byte) -1);
        int[] intArray6 = ds.MaxMin2.maxMin2(intArray2, (int) (byte) -1);
        int[] intArray8 = ds.MaxMin2.maxMin2(intArray6, (int) (byte) 0);
        int[] intArray10 = ds.MaxMin2.maxMin2(intArray6, 1);
        int[] intArray12 = ds.MaxMin2.maxMin2(intArray6, (int) (byte) 0);
        int[] intArray14 = ds.MaxMin2.maxMin2(intArray12, (int) (short) 1);
        int[] intArray16 = ds.MaxMin2.maxMin2(intArray12, 0);
        java.lang.Class<?> wildcardClass17 = intArray12.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[100, 10]");
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray16), "[100, 100]");
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test678() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test678");
        int[] intArray2 = new int[] { (short) 100, 10 };
        int[] intArray4 = ds.MaxMin2.maxMin2(intArray2, (int) (byte) -1);
        int[] intArray6 = ds.MaxMin2.maxMin2(intArray2, (int) (byte) -1);
        int[] intArray8 = ds.MaxMin2.maxMin2(intArray6, (int) (byte) -1);
        int[] intArray10 = ds.MaxMin2.maxMin2(intArray8, (-1));
        int[] intArray12 = ds.MaxMin2.maxMin2(intArray8, 0);
        int[] intArray14 = ds.MaxMin2.maxMin2(intArray8, (int) (byte) -1);
        int[] intArray16 = ds.MaxMin2.maxMin2(intArray8, 0);
        int[] intArray18 = ds.MaxMin2.maxMin2(intArray8, 0);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[100, 10]");
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray16), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray18), "[100, 100]");
    }

    @Test
    public void test679() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test679");
        int[] intArray2 = new int[] { (short) 100, 10 };
        int[] intArray4 = ds.MaxMin2.maxMin2(intArray2, (int) (byte) -1);
        int[] intArray6 = ds.MaxMin2.maxMin2(intArray4, (int) (short) 0);
        int[] intArray8 = ds.MaxMin2.maxMin2(intArray4, (int) (short) 1);
        int[] intArray10 = ds.MaxMin2.maxMin2(intArray8, (int) (short) -1);
        int[] intArray12 = ds.MaxMin2.maxMin2(intArray10, (int) (short) -1);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[100, 10]");
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[100, 100]");
    }

    @Test
    public void test680() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test680");
        int[] intArray2 = new int[] { (short) 100, 10 };
        int[] intArray4 = ds.MaxMin2.maxMin2(intArray2, (int) (byte) -1);
        int[] intArray6 = ds.MaxMin2.maxMin2(intArray2, (int) (byte) -1);
        int[] intArray8 = ds.MaxMin2.maxMin2(intArray6, (int) (byte) 0);
        int[] intArray10 = ds.MaxMin2.maxMin2(intArray6, 1);
        int[] intArray12 = ds.MaxMin2.maxMin2(intArray6, (int) (byte) 0);
        int[] intArray14 = ds.MaxMin2.maxMin2(intArray6, 1);
        int[] intArray16 = ds.MaxMin2.maxMin2(intArray6, 0);
        int[] intArray18 = ds.MaxMin2.maxMin2(intArray16, (-1));
        int[] intArray20 = ds.MaxMin2.maxMin2(intArray18, (int) (byte) 0);
        int[] intArray22 = ds.MaxMin2.maxMin2(intArray18, (int) (short) -1);
        int[] intArray24 = ds.MaxMin2.maxMin2(intArray22, (int) (byte) -1);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[100, 10]");
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray16), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray18), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray20), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray22), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray24), "[100, 100]");
    }

    @Test
    public void test681() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test681");
        int[] intArray2 = new int[] { (short) 100, 10 };
        int[] intArray4 = ds.MaxMin2.maxMin2(intArray2, (int) (byte) -1);
        int[] intArray6 = ds.MaxMin2.maxMin2(intArray2, (int) (byte) -1);
        int[] intArray8 = ds.MaxMin2.maxMin2(intArray6, (int) (byte) 0);
        int[] intArray10 = ds.MaxMin2.maxMin2(intArray6, 1);
        int[] intArray12 = ds.MaxMin2.maxMin2(intArray6, (int) (byte) 0);
        int[] intArray14 = ds.MaxMin2.maxMin2(intArray12, (int) (short) 1);
        int[] intArray16 = ds.MaxMin2.maxMin2(intArray14, (int) (byte) -1);
        int[] intArray18 = ds.MaxMin2.maxMin2(intArray14, (int) (short) -1);
        int[] intArray20 = ds.MaxMin2.maxMin2(intArray14, 0);
        java.lang.Class<?> wildcardClass21 = intArray14.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[100, 10]");
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray16), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray18), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray20), "[100, 100]");
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test682() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test682");
        int[] intArray2 = new int[] { (short) 100, 10 };
        int[] intArray4 = ds.MaxMin2.maxMin2(intArray2, (int) (byte) -1);
        int[] intArray6 = ds.MaxMin2.maxMin2(intArray2, (int) (byte) -1);
        int[] intArray8 = ds.MaxMin2.maxMin2(intArray6, (int) (byte) 0);
        int[] intArray10 = ds.MaxMin2.maxMin2(intArray6, 1);
        int[] intArray12 = ds.MaxMin2.maxMin2(intArray6, (int) (byte) 0);
        int[] intArray14 = ds.MaxMin2.maxMin2(intArray6, (int) (short) 0);
        int[] intArray16 = ds.MaxMin2.maxMin2(intArray14, (int) (short) 1);
        int[] intArray18 = ds.MaxMin2.maxMin2(intArray14, (int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray20 = ds.MaxMin2.maxMin2(intArray18, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[100, 10]");
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray16), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray18), "[100, 100]");
    }

    @Test
    public void test683() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test683");
        int[] intArray2 = new int[] { (short) 100, 10 };
        int[] intArray4 = ds.MaxMin2.maxMin2(intArray2, (int) (byte) -1);
        int[] intArray6 = ds.MaxMin2.maxMin2(intArray2, (int) (byte) -1);
        int[] intArray8 = ds.MaxMin2.maxMin2(intArray6, (int) (byte) 0);
        int[] intArray10 = ds.MaxMin2.maxMin2(intArray6, 1);
        int[] intArray12 = ds.MaxMin2.maxMin2(intArray6, (int) (short) -1);
        int[] intArray14 = ds.MaxMin2.maxMin2(intArray6, (-1));
        int[] intArray16 = ds.MaxMin2.maxMin2(intArray6, (int) (short) -1);
        java.lang.Class<?> wildcardClass17 = intArray6.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[100, 10]");
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray16), "[100, 100]");
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test684() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test684");
        int[] intArray2 = new int[] { (short) 100, 10 };
        int[] intArray4 = ds.MaxMin2.maxMin2(intArray2, (int) (byte) -1);
        int[] intArray6 = ds.MaxMin2.maxMin2(intArray2, (int) (byte) -1);
        int[] intArray8 = ds.MaxMin2.maxMin2(intArray6, (int) (byte) -1);
        int[] intArray10 = ds.MaxMin2.maxMin2(intArray8, (-1));
        int[] intArray12 = ds.MaxMin2.maxMin2(intArray8, 0);
        int[] intArray14 = ds.MaxMin2.maxMin2(intArray12, (int) (byte) 1);
        int[] intArray16 = ds.MaxMin2.maxMin2(intArray14, (int) (byte) 0);
        int[] intArray18 = ds.MaxMin2.maxMin2(intArray14, (int) (byte) -1);
        int[] intArray20 = ds.MaxMin2.maxMin2(intArray14, (int) (short) 1);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[100, 10]");
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray16), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray18), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray20), "[100, 100]");
    }

    @Test
    public void test685() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test685");
        int[] intArray2 = new int[] { (short) 100, 10 };
        int[] intArray4 = ds.MaxMin2.maxMin2(intArray2, (int) (byte) -1);
        int[] intArray6 = ds.MaxMin2.maxMin2(intArray2, (int) (byte) -1);
        int[] intArray8 = ds.MaxMin2.maxMin2(intArray6, (int) (byte) 0);
        int[] intArray10 = ds.MaxMin2.maxMin2(intArray6, 1);
        int[] intArray12 = ds.MaxMin2.maxMin2(intArray6, (int) (short) 0);
        int[] intArray14 = ds.MaxMin2.maxMin2(intArray6, (int) (byte) 0);
        int[] intArray16 = ds.MaxMin2.maxMin2(intArray6, (int) (short) 0);
        int[] intArray18 = ds.MaxMin2.maxMin2(intArray16, (int) (short) 1);
        int[] intArray20 = ds.MaxMin2.maxMin2(intArray18, (int) (short) -1);
        java.lang.Class<?> wildcardClass21 = intArray20.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[100, 10]");
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray16), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray18), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray20), "[100, 100]");
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test686() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test686");
        int[] intArray2 = new int[] { (short) 100, 10 };
        int[] intArray4 = ds.MaxMin2.maxMin2(intArray2, (int) (byte) -1);
        int[] intArray6 = ds.MaxMin2.maxMin2(intArray2, (int) (byte) -1);
        int[] intArray8 = ds.MaxMin2.maxMin2(intArray6, (int) (byte) 0);
        int[] intArray10 = ds.MaxMin2.maxMin2(intArray8, (int) (short) 1);
        int[] intArray12 = ds.MaxMin2.maxMin2(intArray10, (int) (short) 1);
        int[] intArray14 = ds.MaxMin2.maxMin2(intArray10, (int) (byte) -1);
        int[] intArray16 = ds.MaxMin2.maxMin2(intArray10, (int) (short) 1);
        int[] intArray18 = ds.MaxMin2.maxMin2(intArray16, 0);
        java.lang.Class<?> wildcardClass19 = intArray18.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[100, 10]");
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray16), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray18), "[100, 100]");
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test687() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test687");
        int[] intArray2 = new int[] { (short) 100, 10 };
        int[] intArray4 = ds.MaxMin2.maxMin2(intArray2, (int) (byte) -1);
        int[] intArray6 = ds.MaxMin2.maxMin2(intArray2, (int) (byte) -1);
        int[] intArray8 = ds.MaxMin2.maxMin2(intArray6, (int) (byte) 0);
        int[] intArray10 = ds.MaxMin2.maxMin2(intArray6, 1);
        int[] intArray12 = ds.MaxMin2.maxMin2(intArray6, (int) (short) 0);
        int[] intArray14 = ds.MaxMin2.maxMin2(intArray6, (int) (byte) 0);
        int[] intArray16 = ds.MaxMin2.maxMin2(intArray6, (int) (short) 0);
        int[] intArray18 = ds.MaxMin2.maxMin2(intArray6, (int) (byte) 1);
        int[] intArray20 = ds.MaxMin2.maxMin2(intArray18, (int) (byte) 0);
        int[] intArray22 = ds.MaxMin2.maxMin2(intArray18, 0);
        int[] intArray24 = ds.MaxMin2.maxMin2(intArray22, (int) (byte) 0);
        java.lang.Class<?> wildcardClass25 = intArray22.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[100, 10]");
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray16), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray18), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray20), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray22), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray24), "[100, 100]");
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test688() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test688");
        int[] intArray2 = new int[] { (short) 100, 10 };
        int[] intArray4 = ds.MaxMin2.maxMin2(intArray2, (int) (byte) -1);
        int[] intArray6 = ds.MaxMin2.maxMin2(intArray2, (int) (byte) -1);
        int[] intArray8 = ds.MaxMin2.maxMin2(intArray6, (int) (byte) -1);
        int[] intArray10 = ds.MaxMin2.maxMin2(intArray6, (int) (byte) 1);
        int[] intArray12 = ds.MaxMin2.maxMin2(intArray10, 1);
        int[] intArray14 = ds.MaxMin2.maxMin2(intArray12, 0);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray16 = ds.MaxMin2.maxMin2(intArray14, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[100, 10]");
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[100, 100]");
    }

    @Test
    public void test689() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test689");
        int[] intArray2 = new int[] { (short) 100, 10 };
        int[] intArray4 = ds.MaxMin2.maxMin2(intArray2, (int) (byte) -1);
        int[] intArray6 = ds.MaxMin2.maxMin2(intArray2, (int) (byte) -1);
        int[] intArray8 = ds.MaxMin2.maxMin2(intArray6, (int) (byte) 0);
        int[] intArray10 = ds.MaxMin2.maxMin2(intArray6, 1);
        int[] intArray12 = ds.MaxMin2.maxMin2(intArray6, (int) (byte) 0);
        int[] intArray14 = ds.MaxMin2.maxMin2(intArray6, 1);
        int[] intArray16 = ds.MaxMin2.maxMin2(intArray6, 0);
        int[] intArray18 = ds.MaxMin2.maxMin2(intArray16, (-1));
        int[] intArray20 = ds.MaxMin2.maxMin2(intArray18, (int) (short) -1);
        int[] intArray22 = ds.MaxMin2.maxMin2(intArray20, (int) (short) 0);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[100, 10]");
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray16), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray18), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray20), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray22), "[100, 100]");
    }

    @Test
    public void test690() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test690");
        int[] intArray2 = new int[] { (short) 100, 10 };
        int[] intArray4 = ds.MaxMin2.maxMin2(intArray2, (int) (byte) -1);
        int[] intArray6 = ds.MaxMin2.maxMin2(intArray4, (int) (short) 0);
        int[] intArray8 = ds.MaxMin2.maxMin2(intArray4, (int) (short) 1);
        int[] intArray10 = ds.MaxMin2.maxMin2(intArray8, (int) (short) -1);
        int[] intArray12 = ds.MaxMin2.maxMin2(intArray8, (int) (short) 1);
        int[] intArray14 = ds.MaxMin2.maxMin2(intArray8, (int) (short) 0);
        int[] intArray16 = ds.MaxMin2.maxMin2(intArray14, (int) (byte) 0);
        java.lang.Class<?> wildcardClass17 = intArray14.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[100, 10]");
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray16), "[100, 100]");
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test691() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test691");
        int[] intArray2 = new int[] { (short) 100, 10 };
        int[] intArray4 = ds.MaxMin2.maxMin2(intArray2, (int) (byte) -1);
        int[] intArray6 = ds.MaxMin2.maxMin2(intArray2, (int) (byte) -1);
        int[] intArray8 = ds.MaxMin2.maxMin2(intArray6, (int) (byte) -1);
        int[] intArray10 = ds.MaxMin2.maxMin2(intArray8, (-1));
        int[] intArray12 = ds.MaxMin2.maxMin2(intArray8, 0);
        int[] intArray14 = ds.MaxMin2.maxMin2(intArray8, (int) (byte) -1);
        int[] intArray16 = ds.MaxMin2.maxMin2(intArray8, 0);
        int[] intArray18 = ds.MaxMin2.maxMin2(intArray16, 0);
        int[] intArray20 = ds.MaxMin2.maxMin2(intArray16, 0);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray22 = ds.MaxMin2.maxMin2(intArray20, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[100, 10]");
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray16), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray18), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray20), "[100, 100]");
    }

    @Test
    public void test692() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test692");
        int[] intArray2 = new int[] { (short) 100, 10 };
        int[] intArray4 = ds.MaxMin2.maxMin2(intArray2, (int) (byte) -1);
        int[] intArray6 = ds.MaxMin2.maxMin2(intArray2, (int) (byte) -1);
        int[] intArray8 = ds.MaxMin2.maxMin2(intArray6, (int) (byte) 0);
        int[] intArray10 = ds.MaxMin2.maxMin2(intArray8, (int) (short) 1);
        int[] intArray12 = ds.MaxMin2.maxMin2(intArray10, (int) (byte) 0);
        int[] intArray14 = ds.MaxMin2.maxMin2(intArray12, (int) (short) 0);
        int[] intArray16 = ds.MaxMin2.maxMin2(intArray14, 0);
        int[] intArray18 = ds.MaxMin2.maxMin2(intArray16, 0);
        int[] intArray20 = ds.MaxMin2.maxMin2(intArray18, (int) (short) -1);
        java.lang.Class<?> wildcardClass21 = intArray20.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[100, 10]");
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray16), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray18), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray20), "[100, 100]");
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test693() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test693");
        int[] intArray2 = new int[] { (short) 100, 10 };
        int[] intArray4 = ds.MaxMin2.maxMin2(intArray2, (int) (byte) -1);
        int[] intArray6 = ds.MaxMin2.maxMin2(intArray2, (int) (byte) -1);
        int[] intArray8 = ds.MaxMin2.maxMin2(intArray6, (int) (byte) 0);
        int[] intArray10 = ds.MaxMin2.maxMin2(intArray6, 1);
        int[] intArray12 = ds.MaxMin2.maxMin2(intArray6, (-1));
        int[] intArray14 = ds.MaxMin2.maxMin2(intArray6, 1);
        int[] intArray16 = ds.MaxMin2.maxMin2(intArray14, (int) (short) -1);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray18 = ds.MaxMin2.maxMin2(intArray14, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[100, 10]");
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray16), "[100, 100]");
    }

    @Test
    public void test694() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test694");
        int[] intArray2 = new int[] { (short) 100, 10 };
        int[] intArray4 = ds.MaxMin2.maxMin2(intArray2, (int) (byte) -1);
        int[] intArray6 = ds.MaxMin2.maxMin2(intArray2, (int) (byte) -1);
        int[] intArray8 = ds.MaxMin2.maxMin2(intArray6, (int) (byte) 0);
        int[] intArray10 = ds.MaxMin2.maxMin2(intArray6, 1);
        int[] intArray12 = ds.MaxMin2.maxMin2(intArray6, (int) (short) 0);
        int[] intArray14 = ds.MaxMin2.maxMin2(intArray6, (int) (byte) 0);
        int[] intArray16 = ds.MaxMin2.maxMin2(intArray6, (int) (short) 0);
        int[] intArray18 = ds.MaxMin2.maxMin2(intArray16, 0);
        int[] intArray20 = ds.MaxMin2.maxMin2(intArray18, (int) (short) -1);
        int[] intArray22 = ds.MaxMin2.maxMin2(intArray20, (-1));
        int[] intArray24 = ds.MaxMin2.maxMin2(intArray22, (int) (byte) -1);
        int[] intArray26 = ds.MaxMin2.maxMin2(intArray24, (int) (short) 1);
        java.lang.Class<?> wildcardClass27 = intArray26.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[100, 10]");
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray16), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray18), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray20), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray22), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray24), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray26), "[100, 100]");
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test695() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test695");
        int[] intArray2 = new int[] { (short) 100, 10 };
        int[] intArray4 = ds.MaxMin2.maxMin2(intArray2, (int) (byte) -1);
        int[] intArray6 = ds.MaxMin2.maxMin2(intArray2, (int) (byte) -1);
        int[] intArray8 = ds.MaxMin2.maxMin2(intArray6, (int) (byte) 0);
        int[] intArray10 = ds.MaxMin2.maxMin2(intArray6, 1);
        int[] intArray12 = ds.MaxMin2.maxMin2(intArray6, (-1));
        int[] intArray14 = ds.MaxMin2.maxMin2(intArray6, 1);
        int[] intArray16 = ds.MaxMin2.maxMin2(intArray14, (int) (short) -1);
        int[] intArray18 = ds.MaxMin2.maxMin2(intArray14, 0);
        int[] intArray20 = ds.MaxMin2.maxMin2(intArray14, (int) (byte) 0);
        int[] intArray22 = ds.MaxMin2.maxMin2(intArray14, 1);
        int[] intArray24 = ds.MaxMin2.maxMin2(intArray22, 0);
        int[] intArray26 = ds.MaxMin2.maxMin2(intArray22, 0);
        int[] intArray28 = ds.MaxMin2.maxMin2(intArray26, (int) (byte) 1);
        int[] intArray30 = ds.MaxMin2.maxMin2(intArray28, (int) (short) 1);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[100, 10]");
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray16), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray18), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray20), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray22), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray24), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray26), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray28);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray28), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray30);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray30), "[100, 100]");
    }

    @Test
    public void test696() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test696");
        int[] intArray2 = new int[] { (short) 100, 10 };
        int[] intArray4 = ds.MaxMin2.maxMin2(intArray2, (int) (byte) -1);
        int[] intArray6 = ds.MaxMin2.maxMin2(intArray2, (int) (byte) -1);
        int[] intArray8 = ds.MaxMin2.maxMin2(intArray6, (int) (byte) 0);
        int[] intArray10 = ds.MaxMin2.maxMin2(intArray6, 1);
        int[] intArray12 = ds.MaxMin2.maxMin2(intArray6, (-1));
        int[] intArray14 = ds.MaxMin2.maxMin2(intArray6, 1);
        int[] intArray16 = ds.MaxMin2.maxMin2(intArray14, (int) (short) -1);
        int[] intArray18 = ds.MaxMin2.maxMin2(intArray14, 0);
        int[] intArray20 = ds.MaxMin2.maxMin2(intArray14, (int) (byte) 0);
        int[] intArray22 = ds.MaxMin2.maxMin2(intArray14, 1);
        int[] intArray24 = ds.MaxMin2.maxMin2(intArray22, 0);
        int[] intArray26 = ds.MaxMin2.maxMin2(intArray22, (int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray28 = ds.MaxMin2.maxMin2(intArray22, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[100, 10]");
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray16), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray18), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray20), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray22), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray24), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray26), "[100, 100]");
    }

    @Test
    public void test697() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test697");
        int[] intArray2 = new int[] { (short) 100, 10 };
        int[] intArray4 = ds.MaxMin2.maxMin2(intArray2, (int) (byte) -1);
        int[] intArray6 = ds.MaxMin2.maxMin2(intArray2, (int) (byte) -1);
        int[] intArray8 = ds.MaxMin2.maxMin2(intArray6, (int) (byte) 0);
        int[] intArray10 = ds.MaxMin2.maxMin2(intArray6, 1);
        int[] intArray12 = ds.MaxMin2.maxMin2(intArray6, (int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray14 = ds.MaxMin2.maxMin2(intArray12, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[100, 10]");
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[100, 100]");
    }

    @Test
    public void test698() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test698");
        int[] intArray2 = new int[] { (short) 100, 10 };
        int[] intArray4 = ds.MaxMin2.maxMin2(intArray2, (int) (byte) -1);
        int[] intArray6 = ds.MaxMin2.maxMin2(intArray2, (int) (byte) -1);
        int[] intArray8 = ds.MaxMin2.maxMin2(intArray6, (int) (byte) -1);
        int[] intArray10 = ds.MaxMin2.maxMin2(intArray8, (-1));
        int[] intArray12 = ds.MaxMin2.maxMin2(intArray8, 0);
        int[] intArray14 = ds.MaxMin2.maxMin2(intArray8, (int) (byte) -1);
        int[] intArray16 = ds.MaxMin2.maxMin2(intArray14, (int) (short) -1);
        int[] intArray18 = ds.MaxMin2.maxMin2(intArray16, (int) (short) 1);
        java.lang.Class<?> wildcardClass19 = intArray18.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[100, 10]");
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray16), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray18), "[100, 100]");
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test699() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test699");
        int[] intArray2 = new int[] { (short) 100, 10 };
        int[] intArray4 = ds.MaxMin2.maxMin2(intArray2, (int) (byte) -1);
        int[] intArray6 = ds.MaxMin2.maxMin2(intArray2, (int) (byte) -1);
        int[] intArray8 = ds.MaxMin2.maxMin2(intArray6, (int) (byte) 0);
        int[] intArray10 = ds.MaxMin2.maxMin2(intArray8, (int) (short) 1);
        int[] intArray12 = ds.MaxMin2.maxMin2(intArray10, (int) (byte) 0);
        int[] intArray14 = ds.MaxMin2.maxMin2(intArray12, (int) (short) 0);
        int[] intArray16 = ds.MaxMin2.maxMin2(intArray14, 0);
        int[] intArray18 = ds.MaxMin2.maxMin2(intArray16, 1);
        int[] intArray20 = ds.MaxMin2.maxMin2(intArray16, 0);
        int[] intArray22 = ds.MaxMin2.maxMin2(intArray20, (int) (byte) 0);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[100, 10]");
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray16), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray18), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray20), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray22), "[100, 100]");
    }

    @Test
    public void test700() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test700");
        int[] intArray2 = new int[] { (short) 100, 10 };
        int[] intArray4 = ds.MaxMin2.maxMin2(intArray2, (int) (byte) -1);
        int[] intArray6 = ds.MaxMin2.maxMin2(intArray2, (int) (byte) -1);
        int[] intArray8 = ds.MaxMin2.maxMin2(intArray6, (int) (byte) -1);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray10 = ds.MaxMin2.maxMin2(intArray6, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[100, 10]");
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[100, 100]");
    }

    @Test
    public void test701() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test701");
        int[] intArray2 = new int[] { (short) 100, 10 };
        int[] intArray4 = ds.MaxMin2.maxMin2(intArray2, (int) (byte) -1);
        int[] intArray6 = ds.MaxMin2.maxMin2(intArray2, (int) (byte) -1);
        int[] intArray8 = ds.MaxMin2.maxMin2(intArray6, (int) (byte) 0);
        int[] intArray10 = ds.MaxMin2.maxMin2(intArray6, 1);
        int[] intArray12 = ds.MaxMin2.maxMin2(intArray6, (int) (byte) 0);
        int[] intArray14 = ds.MaxMin2.maxMin2(intArray6, 1);
        int[] intArray16 = ds.MaxMin2.maxMin2(intArray6, (int) (byte) -1);
        int[] intArray18 = ds.MaxMin2.maxMin2(intArray6, (int) (short) 1);
        int[] intArray20 = ds.MaxMin2.maxMin2(intArray6, 1);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[100, 10]");
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray16), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray18), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray20), "[100, 100]");
    }

    @Test
    public void test702() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test702");
        int[] intArray2 = new int[] { (short) 100, 10 };
        int[] intArray4 = ds.MaxMin2.maxMin2(intArray2, (int) (byte) -1);
        int[] intArray6 = ds.MaxMin2.maxMin2(intArray4, (int) (short) 0);
        int[] intArray8 = ds.MaxMin2.maxMin2(intArray4, 1);
        int[] intArray10 = ds.MaxMin2.maxMin2(intArray8, (int) (short) 1);
        int[] intArray12 = ds.MaxMin2.maxMin2(intArray8, (-1));
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray14 = ds.MaxMin2.maxMin2(intArray8, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[100, 10]");
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[100, 100]");
    }

    @Test
    public void test703() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test703");
        int[] intArray2 = new int[] { (short) 100, 10 };
        int[] intArray4 = ds.MaxMin2.maxMin2(intArray2, (int) (byte) -1);
        int[] intArray6 = ds.MaxMin2.maxMin2(intArray2, (int) (byte) -1);
        int[] intArray8 = ds.MaxMin2.maxMin2(intArray6, (int) (byte) 0);
        int[] intArray10 = ds.MaxMin2.maxMin2(intArray6, 1);
        int[] intArray12 = ds.MaxMin2.maxMin2(intArray6, (int) (short) -1);
        int[] intArray14 = ds.MaxMin2.maxMin2(intArray6, (int) (short) 0);
        int[] intArray16 = ds.MaxMin2.maxMin2(intArray14, (int) (short) -1);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray18 = ds.MaxMin2.maxMin2(intArray14, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[100, 10]");
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray16), "[100, 100]");
    }

    @Test
    public void test704() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test704");
        int[] intArray2 = new int[] { (short) 100, 10 };
        int[] intArray4 = ds.MaxMin2.maxMin2(intArray2, (int) (byte) -1);
        int[] intArray6 = ds.MaxMin2.maxMin2(intArray2, (int) (byte) -1);
        int[] intArray8 = ds.MaxMin2.maxMin2(intArray6, (int) (byte) 0);
        int[] intArray10 = ds.MaxMin2.maxMin2(intArray6, 1);
        int[] intArray12 = ds.MaxMin2.maxMin2(intArray6, (int) (byte) 1);
        int[] intArray14 = ds.MaxMin2.maxMin2(intArray6, (int) (short) -1);
        int[] intArray16 = ds.MaxMin2.maxMin2(intArray6, (int) (byte) 0);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[100, 10]");
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray16), "[100, 100]");
    }

    @Test
    public void test705() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test705");
        int[] intArray2 = new int[] { (short) 100, 10 };
        int[] intArray4 = ds.MaxMin2.maxMin2(intArray2, (int) (byte) -1);
        int[] intArray6 = ds.MaxMin2.maxMin2(intArray2, (int) (byte) -1);
        int[] intArray8 = ds.MaxMin2.maxMin2(intArray6, (int) (byte) 0);
        int[] intArray10 = ds.MaxMin2.maxMin2(intArray8, (int) (short) 1);
        int[] intArray12 = ds.MaxMin2.maxMin2(intArray10, (int) (short) 1);
        int[] intArray14 = ds.MaxMin2.maxMin2(intArray10, (int) (byte) -1);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray16 = ds.MaxMin2.maxMin2(intArray14, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[100, 10]");
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[100, 100]");
    }

    @Test
    public void test706() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test706");
        int[] intArray2 = new int[] { (short) 100, 10 };
        int[] intArray4 = ds.MaxMin2.maxMin2(intArray2, (int) (byte) -1);
        int[] intArray6 = ds.MaxMin2.maxMin2(intArray2, (int) (byte) -1);
        int[] intArray8 = ds.MaxMin2.maxMin2(intArray2, (int) (byte) -1);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray10 = ds.MaxMin2.maxMin2(intArray2, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[100, 10]");
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[100, 100]");
    }

    @Test
    public void test707() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test707");
        int[] intArray2 = new int[] { (short) 100, 10 };
        int[] intArray4 = ds.MaxMin2.maxMin2(intArray2, (int) (byte) -1);
        int[] intArray6 = ds.MaxMin2.maxMin2(intArray4, (int) (short) 0);
        int[] intArray8 = ds.MaxMin2.maxMin2(intArray4, (int) (short) 1);
        int[] intArray10 = ds.MaxMin2.maxMin2(intArray8, (int) (short) -1);
        int[] intArray12 = ds.MaxMin2.maxMin2(intArray8, (int) (short) 1);
        int[] intArray14 = ds.MaxMin2.maxMin2(intArray8, 0);
        int[] intArray16 = ds.MaxMin2.maxMin2(intArray14, (int) (short) -1);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray18 = ds.MaxMin2.maxMin2(intArray16, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[100, 10]");
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray16), "[100, 100]");
    }

    @Test
    public void test708() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test708");
        int[] intArray2 = new int[] { (short) 100, 10 };
        int[] intArray4 = ds.MaxMin2.maxMin2(intArray2, (int) (byte) -1);
        int[] intArray6 = ds.MaxMin2.maxMin2(intArray2, (int) (byte) -1);
        int[] intArray8 = ds.MaxMin2.maxMin2(intArray6, (int) (byte) -1);
        int[] intArray10 = ds.MaxMin2.maxMin2(intArray8, (-1));
        int[] intArray12 = ds.MaxMin2.maxMin2(intArray8, (int) (short) 0);
        int[] intArray14 = ds.MaxMin2.maxMin2(intArray8, (int) (short) -1);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[100, 10]");
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[100, 100]");
    }

    @Test
    public void test709() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test709");
        int[] intArray2 = new int[] { (short) 100, 10 };
        int[] intArray4 = ds.MaxMin2.maxMin2(intArray2, (int) (byte) -1);
        int[] intArray6 = ds.MaxMin2.maxMin2(intArray2, (int) (byte) -1);
        int[] intArray8 = ds.MaxMin2.maxMin2(intArray6, (int) (byte) 0);
        int[] intArray10 = ds.MaxMin2.maxMin2(intArray6, 1);
        int[] intArray12 = ds.MaxMin2.maxMin2(intArray6, (int) (byte) 0);
        int[] intArray14 = ds.MaxMin2.maxMin2(intArray6, 1);
        int[] intArray16 = ds.MaxMin2.maxMin2(intArray6, 0);
        int[] intArray18 = ds.MaxMin2.maxMin2(intArray16, (-1));
        int[] intArray20 = ds.MaxMin2.maxMin2(intArray18, (int) (short) -1);
        int[] intArray22 = ds.MaxMin2.maxMin2(intArray20, (-1));
        int[] intArray24 = ds.MaxMin2.maxMin2(intArray20, 0);
        int[] intArray26 = ds.MaxMin2.maxMin2(intArray20, (int) (byte) 1);
        int[] intArray28 = ds.MaxMin2.maxMin2(intArray20, 0);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[100, 10]");
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray16), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray18), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray20), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray22), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray24), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray26), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray28);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray28), "[100, 100]");
    }

    @Test
    public void test710() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test710");
        int[] intArray2 = new int[] { (short) 100, 10 };
        int[] intArray4 = ds.MaxMin2.maxMin2(intArray2, (int) (byte) -1);
        int[] intArray6 = ds.MaxMin2.maxMin2(intArray4, (int) (short) 0);
        int[] intArray8 = ds.MaxMin2.maxMin2(intArray4, (-1));
        int[] intArray10 = ds.MaxMin2.maxMin2(intArray8, (int) (byte) 0);
        int[] intArray12 = ds.MaxMin2.maxMin2(intArray8, (int) (short) 0);
        int[] intArray14 = ds.MaxMin2.maxMin2(intArray12, (int) (short) -1);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[100, 10]");
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[100, 100]");
    }

    @Test
    public void test711() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test711");
        int[] intArray2 = new int[] { (short) 100, 10 };
        int[] intArray4 = ds.MaxMin2.maxMin2(intArray2, (int) (byte) -1);
        int[] intArray6 = ds.MaxMin2.maxMin2(intArray2, (int) (byte) -1);
        int[] intArray8 = ds.MaxMin2.maxMin2(intArray6, (int) (byte) 0);
        int[] intArray10 = ds.MaxMin2.maxMin2(intArray8, (int) (short) 1);
        int[] intArray12 = ds.MaxMin2.maxMin2(intArray10, (int) (short) 1);
        int[] intArray14 = ds.MaxMin2.maxMin2(intArray10, (int) (byte) -1);
        int[] intArray16 = ds.MaxMin2.maxMin2(intArray10, (int) (short) 1);
        int[] intArray18 = ds.MaxMin2.maxMin2(intArray16, 0);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray20 = ds.MaxMin2.maxMin2(intArray18, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[100, 10]");
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray16), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray18), "[100, 100]");
    }

    @Test
    public void test712() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test712");
        int[] intArray2 = new int[] { (short) 100, 10 };
        int[] intArray4 = ds.MaxMin2.maxMin2(intArray2, (int) (byte) -1);
        int[] intArray6 = ds.MaxMin2.maxMin2(intArray4, (int) (short) 0);
        int[] intArray8 = ds.MaxMin2.maxMin2(intArray4, (int) (short) 1);
        int[] intArray10 = ds.MaxMin2.maxMin2(intArray8, (int) (byte) -1);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[100, 10]");
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[100, 100]");
    }

    @Test
    public void test713() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test713");
        int[] intArray2 = new int[] { (short) 100, 10 };
        int[] intArray4 = ds.MaxMin2.maxMin2(intArray2, (int) (byte) -1);
        int[] intArray6 = ds.MaxMin2.maxMin2(intArray2, (int) (byte) -1);
        int[] intArray8 = ds.MaxMin2.maxMin2(intArray6, (int) (byte) 0);
        int[] intArray10 = ds.MaxMin2.maxMin2(intArray6, 1);
        int[] intArray12 = ds.MaxMin2.maxMin2(intArray6, (int) (short) 0);
        int[] intArray14 = ds.MaxMin2.maxMin2(intArray12, (int) (byte) 0);
        int[] intArray16 = ds.MaxMin2.maxMin2(intArray14, (int) (byte) 0);
        int[] intArray18 = ds.MaxMin2.maxMin2(intArray16, (int) (byte) 1);
        int[] intArray20 = ds.MaxMin2.maxMin2(intArray18, (int) (short) 0);
        int[] intArray22 = ds.MaxMin2.maxMin2(intArray20, (int) (byte) 0);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[100, 10]");
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray16), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray18), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray20), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray22), "[100, 100]");
    }

    @Test
    public void test714() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test714");
        int[] intArray2 = new int[] { (short) 100, 10 };
        int[] intArray4 = ds.MaxMin2.maxMin2(intArray2, (int) (byte) -1);
        int[] intArray6 = ds.MaxMin2.maxMin2(intArray2, (int) (byte) -1);
        int[] intArray8 = ds.MaxMin2.maxMin2(intArray6, (int) (byte) 0);
        int[] intArray10 = ds.MaxMin2.maxMin2(intArray6, 1);
        int[] intArray12 = ds.MaxMin2.maxMin2(intArray6, (int) (short) 0);
        int[] intArray14 = ds.MaxMin2.maxMin2(intArray6, (int) (byte) 0);
        int[] intArray16 = ds.MaxMin2.maxMin2(intArray6, (int) (short) 0);
        int[] intArray18 = ds.MaxMin2.maxMin2(intArray6, (int) (byte) 1);
        int[] intArray20 = ds.MaxMin2.maxMin2(intArray6, 0);
        java.lang.Class<?> wildcardClass21 = intArray20.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[100, 10]");
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray16), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray18), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray20), "[100, 100]");
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test715() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test715");
        int[] intArray2 = new int[] { (short) 100, 10 };
        int[] intArray4 = ds.MaxMin2.maxMin2(intArray2, (int) (byte) -1);
        int[] intArray6 = ds.MaxMin2.maxMin2(intArray2, (int) (byte) -1);
        int[] intArray8 = ds.MaxMin2.maxMin2(intArray6, (int) (byte) -1);
        int[] intArray10 = ds.MaxMin2.maxMin2(intArray8, (-1));
        int[] intArray12 = ds.MaxMin2.maxMin2(intArray8, 0);
        int[] intArray14 = ds.MaxMin2.maxMin2(intArray12, (int) (byte) 1);
        int[] intArray16 = ds.MaxMin2.maxMin2(intArray14, (int) (byte) 0);
        int[] intArray18 = ds.MaxMin2.maxMin2(intArray14, (int) (byte) -1);
        int[] intArray20 = ds.MaxMin2.maxMin2(intArray14, 1);
        int[] intArray22 = ds.MaxMin2.maxMin2(intArray20, 0);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[100, 10]");
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray16), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray18), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray20), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray22), "[100, 100]");
    }

    @Test
    public void test716() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test716");
        int[] intArray2 = new int[] { (short) 100, 10 };
        int[] intArray4 = ds.MaxMin2.maxMin2(intArray2, (int) (byte) -1);
        int[] intArray6 = ds.MaxMin2.maxMin2(intArray2, (int) (byte) -1);
        int[] intArray8 = ds.MaxMin2.maxMin2(intArray6, (int) (byte) 0);
        int[] intArray10 = ds.MaxMin2.maxMin2(intArray8, (int) (short) 1);
        int[] intArray12 = ds.MaxMin2.maxMin2(intArray10, (int) (byte) 0);
        int[] intArray14 = ds.MaxMin2.maxMin2(intArray12, (int) (short) 0);
        int[] intArray16 = ds.MaxMin2.maxMin2(intArray14, (-1));
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray18 = ds.MaxMin2.maxMin2(intArray14, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[100, 10]");
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray16), "[100, 100]");
    }

    @Test
    public void test717() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test717");
        int[] intArray2 = new int[] { (short) 100, 10 };
        int[] intArray4 = ds.MaxMin2.maxMin2(intArray2, (int) (byte) -1);
        int[] intArray6 = ds.MaxMin2.maxMin2(intArray2, (int) (byte) -1);
        int[] intArray8 = ds.MaxMin2.maxMin2(intArray6, (int) (byte) 0);
        int[] intArray10 = ds.MaxMin2.maxMin2(intArray6, 1);
        int[] intArray12 = ds.MaxMin2.maxMin2(intArray6, (-1));
        int[] intArray14 = ds.MaxMin2.maxMin2(intArray6, 1);
        int[] intArray16 = ds.MaxMin2.maxMin2(intArray14, (int) (short) -1);
        int[] intArray18 = ds.MaxMin2.maxMin2(intArray14, 0);
        int[] intArray20 = ds.MaxMin2.maxMin2(intArray18, (int) (short) -1);
        int[] intArray22 = ds.MaxMin2.maxMin2(intArray20, (int) (byte) 1);
        java.lang.Class<?> wildcardClass23 = intArray22.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[100, 10]");
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray16), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray18), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray20), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray22), "[100, 100]");
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test718() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test718");
        int[] intArray2 = new int[] { (short) 100, 10 };
        int[] intArray4 = ds.MaxMin2.maxMin2(intArray2, (int) (byte) -1);
        int[] intArray6 = ds.MaxMin2.maxMin2(intArray2, (int) (byte) -1);
        int[] intArray8 = ds.MaxMin2.maxMin2(intArray6, (int) (byte) 0);
        int[] intArray10 = ds.MaxMin2.maxMin2(intArray6, 1);
        int[] intArray12 = ds.MaxMin2.maxMin2(intArray6, (int) (short) 0);
        int[] intArray14 = ds.MaxMin2.maxMin2(intArray12, (int) (byte) 0);
        int[] intArray16 = ds.MaxMin2.maxMin2(intArray14, (int) (short) -1);
        int[] intArray18 = ds.MaxMin2.maxMin2(intArray16, (int) (short) 1);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[100, 10]");
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray16), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray18), "[100, 100]");
    }

    @Test
    public void test719() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test719");
        int[] intArray2 = new int[] { (short) 100, 10 };
        int[] intArray4 = ds.MaxMin2.maxMin2(intArray2, (int) (byte) -1);
        int[] intArray6 = ds.MaxMin2.maxMin2(intArray2, (int) (byte) -1);
        int[] intArray8 = ds.MaxMin2.maxMin2(intArray6, (int) (byte) 0);
        int[] intArray10 = ds.MaxMin2.maxMin2(intArray6, 1);
        int[] intArray12 = ds.MaxMin2.maxMin2(intArray6, (int) (short) 0);
        int[] intArray14 = ds.MaxMin2.maxMin2(intArray6, (int) (short) 1);
        java.lang.Class<?> wildcardClass15 = intArray6.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[100, 10]");
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[100, 100]");
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test720() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test720");
        int[] intArray2 = new int[] { (short) 100, 10 };
        int[] intArray4 = ds.MaxMin2.maxMin2(intArray2, (int) (byte) -1);
        int[] intArray6 = ds.MaxMin2.maxMin2(intArray2, (int) (byte) -1);
        int[] intArray8 = ds.MaxMin2.maxMin2(intArray6, (int) (byte) 0);
        int[] intArray10 = ds.MaxMin2.maxMin2(intArray8, (int) (short) 1);
        int[] intArray12 = ds.MaxMin2.maxMin2(intArray10, (int) (byte) -1);
        int[] intArray14 = ds.MaxMin2.maxMin2(intArray10, (int) (short) 1);
        int[] intArray16 = ds.MaxMin2.maxMin2(intArray10, (int) (byte) 0);
        int[] intArray18 = ds.MaxMin2.maxMin2(intArray16, 1);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray20 = ds.MaxMin2.maxMin2(intArray18, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[100, 10]");
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray16), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray18), "[100, 100]");
    }

    @Test
    public void test721() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test721");
        int[] intArray2 = new int[] { (short) 100, 10 };
        int[] intArray4 = ds.MaxMin2.maxMin2(intArray2, (int) (byte) -1);
        int[] intArray6 = ds.MaxMin2.maxMin2(intArray2, (int) (byte) -1);
        int[] intArray8 = ds.MaxMin2.maxMin2(intArray6, (int) (byte) 0);
        int[] intArray10 = ds.MaxMin2.maxMin2(intArray6, 1);
        int[] intArray12 = ds.MaxMin2.maxMin2(intArray6, (int) (byte) 0);
        int[] intArray14 = ds.MaxMin2.maxMin2(intArray12, (int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray16 = ds.MaxMin2.maxMin2(intArray14, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[100, 10]");
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[100, 100]");
    }

    @Test
    public void test722() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test722");
        int[] intArray2 = new int[] { (short) 100, 10 };
        int[] intArray4 = ds.MaxMin2.maxMin2(intArray2, (int) (byte) -1);
        int[] intArray6 = ds.MaxMin2.maxMin2(intArray2, (int) (byte) -1);
        int[] intArray8 = ds.MaxMin2.maxMin2(intArray6, (int) (byte) 0);
        int[] intArray10 = ds.MaxMin2.maxMin2(intArray6, 1);
        int[] intArray12 = ds.MaxMin2.maxMin2(intArray6, (int) (short) 0);
        int[] intArray14 = ds.MaxMin2.maxMin2(intArray12, (int) (byte) 0);
        int[] intArray16 = ds.MaxMin2.maxMin2(intArray14, (int) (short) -1);
        int[] intArray18 = ds.MaxMin2.maxMin2(intArray14, (int) (short) 0);
        java.lang.Class<?> wildcardClass19 = intArray18.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[100, 10]");
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray16), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray18), "[100, 100]");
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test723() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test723");
        int[] intArray2 = new int[] { (short) 100, 10 };
        int[] intArray4 = ds.MaxMin2.maxMin2(intArray2, (int) (byte) -1);
        int[] intArray6 = ds.MaxMin2.maxMin2(intArray2, (int) (byte) -1);
        int[] intArray8 = ds.MaxMin2.maxMin2(intArray6, (int) (byte) -1);
        int[] intArray10 = ds.MaxMin2.maxMin2(intArray8, (-1));
        int[] intArray12 = ds.MaxMin2.maxMin2(intArray8, 0);
        int[] intArray14 = ds.MaxMin2.maxMin2(intArray12, (int) (byte) 1);
        int[] intArray16 = ds.MaxMin2.maxMin2(intArray14, (int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray18 = ds.MaxMin2.maxMin2(intArray16, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[100, 10]");
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray16), "[100, 100]");
    }

    @Test
    public void test724() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test724");
        int[] intArray2 = new int[] { (short) 100, 10 };
        int[] intArray4 = ds.MaxMin2.maxMin2(intArray2, (int) (byte) -1);
        int[] intArray6 = ds.MaxMin2.maxMin2(intArray2, (int) (byte) -1);
        int[] intArray8 = ds.MaxMin2.maxMin2(intArray6, (int) (byte) -1);
        int[] intArray10 = ds.MaxMin2.maxMin2(intArray8, (-1));
        int[] intArray12 = ds.MaxMin2.maxMin2(intArray8, 0);
        int[] intArray14 = ds.MaxMin2.maxMin2(intArray12, (int) (byte) 1);
        int[] intArray16 = ds.MaxMin2.maxMin2(intArray14, (int) (short) 0);
        int[] intArray18 = ds.MaxMin2.maxMin2(intArray16, (int) (byte) 0);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[100, 10]");
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray16), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray18), "[100, 100]");
    }

    @Test
    public void test725() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test725");
        int[] intArray2 = new int[] { (short) 100, 10 };
        int[] intArray4 = ds.MaxMin2.maxMin2(intArray2, (int) (byte) -1);
        int[] intArray6 = ds.MaxMin2.maxMin2(intArray2, (int) (byte) -1);
        int[] intArray8 = ds.MaxMin2.maxMin2(intArray6, (int) (byte) 0);
        int[] intArray10 = ds.MaxMin2.maxMin2(intArray6, 1);
        int[] intArray12 = ds.MaxMin2.maxMin2(intArray6, (-1));
        int[] intArray14 = ds.MaxMin2.maxMin2(intArray6, (int) (short) -1);
        int[] intArray16 = ds.MaxMin2.maxMin2(intArray6, (int) (short) -1);
        int[] intArray18 = ds.MaxMin2.maxMin2(intArray16, (int) (short) 1);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[100, 10]");
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray16), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray18), "[100, 100]");
    }

    @Test
    public void test726() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test726");
        int[] intArray2 = new int[] { (short) 100, 10 };
        int[] intArray4 = ds.MaxMin2.maxMin2(intArray2, (int) (byte) -1);
        int[] intArray6 = ds.MaxMin2.maxMin2(intArray2, (int) (byte) -1);
        int[] intArray8 = ds.MaxMin2.maxMin2(intArray6, (int) (byte) 0);
        int[] intArray10 = ds.MaxMin2.maxMin2(intArray8, (int) (short) 1);
        int[] intArray12 = ds.MaxMin2.maxMin2(intArray10, (int) (byte) 0);
        int[] intArray14 = ds.MaxMin2.maxMin2(intArray12, (int) (short) 0);
        int[] intArray16 = ds.MaxMin2.maxMin2(intArray14, (-1));
        int[] intArray18 = ds.MaxMin2.maxMin2(intArray16, (int) (short) 0);
        int[] intArray20 = ds.MaxMin2.maxMin2(intArray18, (int) (short) 0);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[100, 10]");
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray16), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray18), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray20), "[100, 100]");
    }

    @Test
    public void test727() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test727");
        int[] intArray2 = new int[] { (short) 100, 10 };
        int[] intArray4 = ds.MaxMin2.maxMin2(intArray2, (int) (byte) -1);
        int[] intArray6 = ds.MaxMin2.maxMin2(intArray2, (int) (byte) -1);
        int[] intArray8 = ds.MaxMin2.maxMin2(intArray6, (int) (byte) 0);
        int[] intArray10 = ds.MaxMin2.maxMin2(intArray8, 0);
        int[] intArray12 = ds.MaxMin2.maxMin2(intArray10, (-1));
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[100, 10]");
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[100, 100]");
    }

    @Test
    public void test728() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test728");
        int[] intArray2 = new int[] { (short) 100, 10 };
        int[] intArray4 = ds.MaxMin2.maxMin2(intArray2, (int) (byte) -1);
        int[] intArray6 = ds.MaxMin2.maxMin2(intArray2, (int) (byte) -1);
        int[] intArray8 = ds.MaxMin2.maxMin2(intArray6, (int) (byte) 0);
        int[] intArray10 = ds.MaxMin2.maxMin2(intArray6, 1);
        int[] intArray12 = ds.MaxMin2.maxMin2(intArray6, (int) (byte) 0);
        int[] intArray14 = ds.MaxMin2.maxMin2(intArray6, 1);
        int[] intArray16 = ds.MaxMin2.maxMin2(intArray6, 0);
        int[] intArray18 = ds.MaxMin2.maxMin2(intArray16, (-1));
        int[] intArray20 = ds.MaxMin2.maxMin2(intArray18, (int) (short) -1);
        int[] intArray22 = ds.MaxMin2.maxMin2(intArray20, 0);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray24 = ds.MaxMin2.maxMin2(intArray22, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[100, 10]");
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray16), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray18), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray20), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray22), "[100, 100]");
    }

    @Test
    public void test729() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test729");
        int[] intArray2 = new int[] { (short) 100, 10 };
        int[] intArray4 = ds.MaxMin2.maxMin2(intArray2, (int) (byte) -1);
        int[] intArray6 = ds.MaxMin2.maxMin2(intArray2, (int) (byte) -1);
        int[] intArray8 = ds.MaxMin2.maxMin2(intArray6, (int) (byte) 0);
        int[] intArray10 = ds.MaxMin2.maxMin2(intArray6, 1);
        int[] intArray12 = ds.MaxMin2.maxMin2(intArray6, (int) (byte) 0);
        int[] intArray14 = ds.MaxMin2.maxMin2(intArray6, 1);
        int[] intArray16 = ds.MaxMin2.maxMin2(intArray6, 0);
        int[] intArray18 = ds.MaxMin2.maxMin2(intArray16, (-1));
        int[] intArray20 = ds.MaxMin2.maxMin2(intArray18, (int) (short) -1);
        int[] intArray22 = ds.MaxMin2.maxMin2(intArray20, (-1));
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray24 = ds.MaxMin2.maxMin2(intArray22, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[100, 10]");
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray16), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray18), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray20), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray22), "[100, 100]");
    }

    @Test
    public void test730() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test730");
        int[] intArray2 = new int[] { (short) 100, 10 };
        int[] intArray4 = ds.MaxMin2.maxMin2(intArray2, (int) (byte) -1);
        int[] intArray6 = ds.MaxMin2.maxMin2(intArray4, (int) (short) 0);
        int[] intArray8 = ds.MaxMin2.maxMin2(intArray4, (int) (short) 1);
        int[] intArray10 = ds.MaxMin2.maxMin2(intArray8, (int) (short) -1);
        int[] intArray12 = ds.MaxMin2.maxMin2(intArray8, (int) (short) 1);
        int[] intArray14 = ds.MaxMin2.maxMin2(intArray8, (int) (short) 0);
        int[] intArray16 = ds.MaxMin2.maxMin2(intArray8, 0);
        int[] intArray18 = ds.MaxMin2.maxMin2(intArray16, (int) (short) 1);
        int[] intArray20 = ds.MaxMin2.maxMin2(intArray16, (int) (short) 0);
        java.lang.Class<?> wildcardClass21 = intArray16.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[100, 10]");
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray16), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray18), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray20), "[100, 100]");
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test731() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test731");
        int[] intArray2 = new int[] { (short) 100, 10 };
        int[] intArray4 = ds.MaxMin2.maxMin2(intArray2, (int) (byte) -1);
        int[] intArray6 = ds.MaxMin2.maxMin2(intArray2, (int) (byte) -1);
        int[] intArray8 = ds.MaxMin2.maxMin2(intArray6, (int) (byte) 0);
        int[] intArray10 = ds.MaxMin2.maxMin2(intArray6, 1);
        int[] intArray12 = ds.MaxMin2.maxMin2(intArray6, (int) (byte) 0);
        int[] intArray14 = ds.MaxMin2.maxMin2(intArray6, 1);
        int[] intArray16 = ds.MaxMin2.maxMin2(intArray6, 0);
        int[] intArray18 = ds.MaxMin2.maxMin2(intArray16, (-1));
        int[] intArray20 = ds.MaxMin2.maxMin2(intArray18, (int) (short) -1);
        int[] intArray22 = ds.MaxMin2.maxMin2(intArray20, (-1));
        int[] intArray24 = ds.MaxMin2.maxMin2(intArray20, 0);
        int[] intArray26 = ds.MaxMin2.maxMin2(intArray20, (int) (short) 0);
        java.lang.Class<?> wildcardClass27 = intArray26.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[100, 10]");
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray16), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray18), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray20), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray22), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray24), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray26), "[100, 100]");
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test732() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test732");
        int[] intArray2 = new int[] { (short) 100, 10 };
        int[] intArray4 = ds.MaxMin2.maxMin2(intArray2, (int) (byte) -1);
        int[] intArray6 = ds.MaxMin2.maxMin2(intArray2, (int) (byte) -1);
        int[] intArray8 = ds.MaxMin2.maxMin2(intArray6, (int) (byte) 0);
        int[] intArray10 = ds.MaxMin2.maxMin2(intArray6, 1);
        int[] intArray12 = ds.MaxMin2.maxMin2(intArray6, (int) (short) 0);
        int[] intArray14 = ds.MaxMin2.maxMin2(intArray12, (int) (byte) 0);
        int[] intArray16 = ds.MaxMin2.maxMin2(intArray14, (int) (byte) -1);
        int[] intArray18 = ds.MaxMin2.maxMin2(intArray16, (int) (byte) -1);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray20 = ds.MaxMin2.maxMin2(intArray18, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[100, 10]");
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray16), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray18), "[100, 100]");
    }

    @Test
    public void test733() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test733");
        int[] intArray2 = new int[] { (short) 100, 10 };
        int[] intArray4 = ds.MaxMin2.maxMin2(intArray2, (int) (byte) -1);
        int[] intArray6 = ds.MaxMin2.maxMin2(intArray2, (int) (byte) -1);
        int[] intArray8 = ds.MaxMin2.maxMin2(intArray6, (int) (byte) 0);
        int[] intArray10 = ds.MaxMin2.maxMin2(intArray6, 1);
        int[] intArray12 = ds.MaxMin2.maxMin2(intArray6, (int) (byte) 0);
        int[] intArray14 = ds.MaxMin2.maxMin2(intArray6, 1);
        int[] intArray16 = ds.MaxMin2.maxMin2(intArray6, (int) (byte) -1);
        int[] intArray18 = ds.MaxMin2.maxMin2(intArray16, 0);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[100, 10]");
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray16), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray18), "[100, 100]");
    }

    @Test
    public void test734() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test734");
        int[] intArray2 = new int[] { (short) 100, 10 };
        int[] intArray4 = ds.MaxMin2.maxMin2(intArray2, (int) (byte) -1);
        int[] intArray6 = ds.MaxMin2.maxMin2(intArray2, (int) (byte) -1);
        int[] intArray8 = ds.MaxMin2.maxMin2(intArray6, (int) (byte) 0);
        int[] intArray10 = ds.MaxMin2.maxMin2(intArray6, 1);
        int[] intArray12 = ds.MaxMin2.maxMin2(intArray6, (int) (short) 0);
        int[] intArray14 = ds.MaxMin2.maxMin2(intArray12, (int) (byte) 0);
        int[] intArray16 = ds.MaxMin2.maxMin2(intArray14, (int) (byte) 0);
        int[] intArray18 = ds.MaxMin2.maxMin2(intArray16, (int) (byte) 1);
        int[] intArray20 = ds.MaxMin2.maxMin2(intArray16, 0);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[100, 10]");
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray16), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray18), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray20), "[100, 100]");
    }

    @Test
    public void test735() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test735");
        int[] intArray2 = new int[] { (short) 100, 10 };
        int[] intArray4 = ds.MaxMin2.maxMin2(intArray2, (int) (byte) -1);
        int[] intArray6 = ds.MaxMin2.maxMin2(intArray4, (int) (short) 0);
        int[] intArray8 = ds.MaxMin2.maxMin2(intArray4, (int) (short) 1);
        int[] intArray10 = ds.MaxMin2.maxMin2(intArray8, (int) (short) 1);
        java.lang.Class<?> wildcardClass11 = intArray8.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[100, 10]");
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[100, 100]");
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test736() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test736");
        int[] intArray2 = new int[] { (short) 100, 10 };
        int[] intArray4 = ds.MaxMin2.maxMin2(intArray2, (int) (byte) -1);
        int[] intArray6 = ds.MaxMin2.maxMin2(intArray2, (int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray8 = ds.MaxMin2.maxMin2(intArray2, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[100, 10]");
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[100, 100]");
    }

    @Test
    public void test737() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test737");
        int[] intArray2 = new int[] { (short) 100, 10 };
        int[] intArray4 = ds.MaxMin2.maxMin2(intArray2, (int) (byte) -1);
        int[] intArray6 = ds.MaxMin2.maxMin2(intArray2, (int) (byte) -1);
        int[] intArray8 = ds.MaxMin2.maxMin2(intArray6, (int) (byte) -1);
        int[] intArray10 = ds.MaxMin2.maxMin2(intArray8, (-1));
        int[] intArray12 = ds.MaxMin2.maxMin2(intArray8, (int) (short) 0);
        int[] intArray14 = ds.MaxMin2.maxMin2(intArray8, (int) (short) 1);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[100, 10]");
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[100, 100]");
    }

    @Test
    public void test738() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test738");
        int[] intArray2 = new int[] { (short) 100, 10 };
        int[] intArray4 = ds.MaxMin2.maxMin2(intArray2, (int) (byte) -1);
        int[] intArray6 = ds.MaxMin2.maxMin2(intArray2, (int) (byte) -1);
        int[] intArray8 = ds.MaxMin2.maxMin2(intArray6, (int) (byte) 0);
        int[] intArray10 = ds.MaxMin2.maxMin2(intArray6, 1);
        int[] intArray12 = ds.MaxMin2.maxMin2(intArray6, (int) (byte) 0);
        int[] intArray14 = ds.MaxMin2.maxMin2(intArray6, 1);
        int[] intArray16 = ds.MaxMin2.maxMin2(intArray6, 0);
        int[] intArray18 = ds.MaxMin2.maxMin2(intArray16, (-1));
        int[] intArray20 = ds.MaxMin2.maxMin2(intArray18, (int) (short) -1);
        int[] intArray22 = ds.MaxMin2.maxMin2(intArray20, (-1));
        int[] intArray24 = ds.MaxMin2.maxMin2(intArray22, 1);
        int[] intArray26 = ds.MaxMin2.maxMin2(intArray24, 0);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[100, 10]");
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray16), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray18), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray20), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray22), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray24), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray26), "[100, 100]");
    }

    @Test
    public void test739() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test739");
        int[] intArray2 = new int[] { (short) 100, 10 };
        int[] intArray4 = ds.MaxMin2.maxMin2(intArray2, (int) (byte) -1);
        int[] intArray6 = ds.MaxMin2.maxMin2(intArray2, (int) (byte) -1);
        int[] intArray8 = ds.MaxMin2.maxMin2(intArray6, (int) (byte) 0);
        int[] intArray10 = ds.MaxMin2.maxMin2(intArray6, 1);
        int[] intArray12 = ds.MaxMin2.maxMin2(intArray6, (int) (short) 0);
        int[] intArray14 = ds.MaxMin2.maxMin2(intArray6, (int) (byte) 0);
        int[] intArray16 = ds.MaxMin2.maxMin2(intArray14, 1);
        int[] intArray18 = ds.MaxMin2.maxMin2(intArray14, (-1));
        int[] intArray20 = ds.MaxMin2.maxMin2(intArray18, (int) (short) 1);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[100, 10]");
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray16), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray18), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray20), "[100, 100]");
    }

    @Test
    public void test740() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test740");
        int[] intArray2 = new int[] { (short) 100, 10 };
        int[] intArray4 = ds.MaxMin2.maxMin2(intArray2, (int) (byte) -1);
        int[] intArray6 = ds.MaxMin2.maxMin2(intArray2, (int) (byte) -1);
        int[] intArray8 = ds.MaxMin2.maxMin2(intArray6, (int) (byte) 0);
        int[] intArray10 = ds.MaxMin2.maxMin2(intArray6, 1);
        int[] intArray12 = ds.MaxMin2.maxMin2(intArray6, (int) (short) 0);
        int[] intArray14 = ds.MaxMin2.maxMin2(intArray6, (int) (byte) 0);
        int[] intArray16 = ds.MaxMin2.maxMin2(intArray14, 0);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray18 = ds.MaxMin2.maxMin2(intArray16, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[100, 10]");
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray16), "[100, 100]");
    }

    @Test
    public void test741() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test741");
        int[] intArray2 = new int[] { (short) 100, 10 };
        int[] intArray4 = ds.MaxMin2.maxMin2(intArray2, (int) (byte) -1);
        int[] intArray6 = ds.MaxMin2.maxMin2(intArray2, (int) (byte) -1);
        int[] intArray8 = ds.MaxMin2.maxMin2(intArray6, (int) (byte) 0);
        int[] intArray10 = ds.MaxMin2.maxMin2(intArray8, (int) (short) 1);
        int[] intArray12 = ds.MaxMin2.maxMin2(intArray10, 1);
        int[] intArray14 = ds.MaxMin2.maxMin2(intArray10, (int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray16 = ds.MaxMin2.maxMin2(intArray14, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[100, 10]");
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[100, 100]");
    }

    @Test
    public void test742() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test742");
        int[] intArray2 = new int[] { (short) 100, 10 };
        int[] intArray4 = ds.MaxMin2.maxMin2(intArray2, (int) (byte) -1);
        int[] intArray6 = ds.MaxMin2.maxMin2(intArray2, (int) (byte) -1);
        int[] intArray8 = ds.MaxMin2.maxMin2(intArray6, (int) (byte) -1);
        int[] intArray10 = ds.MaxMin2.maxMin2(intArray8, (-1));
        int[] intArray12 = ds.MaxMin2.maxMin2(intArray8, 0);
        int[] intArray14 = ds.MaxMin2.maxMin2(intArray12, (int) (byte) 1);
        int[] intArray16 = ds.MaxMin2.maxMin2(intArray14, (int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray18 = ds.MaxMin2.maxMin2(intArray14, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[100, 10]");
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray16), "[100, 100]");
    }

    @Test
    public void test743() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test743");
        int[] intArray2 = new int[] { (short) 100, 10 };
        int[] intArray4 = ds.MaxMin2.maxMin2(intArray2, (int) (byte) -1);
        int[] intArray6 = ds.MaxMin2.maxMin2(intArray2, (int) (byte) -1);
        int[] intArray8 = ds.MaxMin2.maxMin2(intArray6, (int) (byte) 0);
        int[] intArray10 = ds.MaxMin2.maxMin2(intArray8, 1);
        int[] intArray12 = ds.MaxMin2.maxMin2(intArray10, 0);
        int[] intArray14 = ds.MaxMin2.maxMin2(intArray10, 0);
        int[] intArray16 = ds.MaxMin2.maxMin2(intArray14, 0);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[100, 10]");
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray16), "[100, 100]");
    }

    @Test
    public void test744() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test744");
        int[] intArray2 = new int[] { (short) 100, 10 };
        int[] intArray4 = ds.MaxMin2.maxMin2(intArray2, (int) (byte) -1);
        int[] intArray6 = ds.MaxMin2.maxMin2(intArray2, (int) (byte) -1);
        int[] intArray8 = ds.MaxMin2.maxMin2(intArray6, (int) (byte) -1);
        int[] intArray10 = ds.MaxMin2.maxMin2(intArray6, (int) (byte) 1);
        int[] intArray12 = ds.MaxMin2.maxMin2(intArray10, 1);
        int[] intArray14 = ds.MaxMin2.maxMin2(intArray12, (int) (short) 1);
        int[] intArray16 = ds.MaxMin2.maxMin2(intArray12, (int) (short) -1);
        java.lang.Class<?> wildcardClass17 = intArray12.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[100, 10]");
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray16), "[100, 100]");
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test745() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test745");
        int[] intArray2 = new int[] { (short) 100, 10 };
        int[] intArray4 = ds.MaxMin2.maxMin2(intArray2, (int) (byte) -1);
        int[] intArray6 = ds.MaxMin2.maxMin2(intArray2, (int) (byte) -1);
        int[] intArray8 = ds.MaxMin2.maxMin2(intArray6, (int) (byte) 0);
        int[] intArray10 = ds.MaxMin2.maxMin2(intArray6, 1);
        int[] intArray12 = ds.MaxMin2.maxMin2(intArray6, (int) (short) 0);
        int[] intArray14 = ds.MaxMin2.maxMin2(intArray6, (int) (byte) 0);
        int[] intArray16 = ds.MaxMin2.maxMin2(intArray6, (int) (short) 0);
        int[] intArray18 = ds.MaxMin2.maxMin2(intArray16, 0);
        int[] intArray20 = ds.MaxMin2.maxMin2(intArray18, (int) (short) -1);
        int[] intArray22 = ds.MaxMin2.maxMin2(intArray20, (int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray24 = ds.MaxMin2.maxMin2(intArray22, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[100, 10]");
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray16), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray18), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray20), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray22), "[100, 100]");
    }

    @Test
    public void test746() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test746");
        int[] intArray2 = new int[] { (short) 100, 10 };
        int[] intArray4 = ds.MaxMin2.maxMin2(intArray2, (int) (byte) -1);
        int[] intArray6 = ds.MaxMin2.maxMin2(intArray2, (int) (byte) -1);
        int[] intArray8 = ds.MaxMin2.maxMin2(intArray6, (int) (byte) 0);
        int[] intArray10 = ds.MaxMin2.maxMin2(intArray6, 1);
        int[] intArray12 = ds.MaxMin2.maxMin2(intArray6, (-1));
        int[] intArray14 = ds.MaxMin2.maxMin2(intArray6, 1);
        int[] intArray16 = ds.MaxMin2.maxMin2(intArray14, (int) (short) -1);
        int[] intArray18 = ds.MaxMin2.maxMin2(intArray14, 0);
        int[] intArray20 = ds.MaxMin2.maxMin2(intArray14, (int) (byte) 0);
        int[] intArray22 = ds.MaxMin2.maxMin2(intArray14, 1);
        int[] intArray24 = ds.MaxMin2.maxMin2(intArray22, 0);
        int[] intArray26 = ds.MaxMin2.maxMin2(intArray22, 0);
        int[] intArray28 = ds.MaxMin2.maxMin2(intArray26, (int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray30 = ds.MaxMin2.maxMin2(intArray28, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[100, 10]");
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray16), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray18), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray20), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray22), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray24), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray26), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray28);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray28), "[100, 100]");
    }

    @Test
    public void test747() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test747");
        int[] intArray2 = new int[] { (short) 100, 10 };
        int[] intArray4 = ds.MaxMin2.maxMin2(intArray2, (int) (byte) -1);
        int[] intArray6 = ds.MaxMin2.maxMin2(intArray4, (int) (short) 0);
        int[] intArray8 = ds.MaxMin2.maxMin2(intArray4, (int) (short) 1);
        int[] intArray10 = ds.MaxMin2.maxMin2(intArray4, 0);
        int[] intArray12 = ds.MaxMin2.maxMin2(intArray4, 0);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray14 = ds.MaxMin2.maxMin2(intArray12, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[100, 10]");
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[100, 100]");
    }

    @Test
    public void test748() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test748");
        int[] intArray2 = new int[] { (short) 100, 10 };
        int[] intArray4 = ds.MaxMin2.maxMin2(intArray2, (int) (byte) -1);
        int[] intArray6 = ds.MaxMin2.maxMin2(intArray2, (int) (byte) -1);
        int[] intArray8 = ds.MaxMin2.maxMin2(intArray6, (int) (byte) 0);
        int[] intArray10 = ds.MaxMin2.maxMin2(intArray6, 1);
        int[] intArray12 = ds.MaxMin2.maxMin2(intArray6, (-1));
        int[] intArray14 = ds.MaxMin2.maxMin2(intArray6, 1);
        int[] intArray16 = ds.MaxMin2.maxMin2(intArray14, (int) (short) -1);
        int[] intArray18 = ds.MaxMin2.maxMin2(intArray14, 0);
        int[] intArray20 = ds.MaxMin2.maxMin2(intArray14, (int) (byte) 0);
        int[] intArray22 = ds.MaxMin2.maxMin2(intArray14, 1);
        int[] intArray24 = ds.MaxMin2.maxMin2(intArray22, (int) (short) 1);
        int[] intArray26 = ds.MaxMin2.maxMin2(intArray24, (int) (byte) 0);
        java.lang.Class<?> wildcardClass27 = intArray26.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[100, 10]");
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray16), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray18), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray20), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray22), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray24), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray26), "[100, 100]");
        org.junit.Assert.assertNotNull(wildcardClass27);
    }
}

