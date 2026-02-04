package ds.seed9121;

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
        int[] intArray6 = new int[] { (byte) -1, (byte) 1, ' ', (short) 10, (short) 1, (byte) 1 };
        int[] intArray8 = ds.MaxMin2.maxMin2(intArray6, (int) (byte) 0);
        int[] intArray10 = ds.MaxMin2.maxMin2(intArray6, (int) (short) 1);
        int[] intArray12 = ds.MaxMin2.maxMin2(intArray10, (-1));
        int[] intArray14 = ds.MaxMin2.maxMin2(intArray12, (int) (short) -1);
        int[] intArray16 = ds.MaxMin2.maxMin2(intArray14, (-1));
        int[] intArray18 = ds.MaxMin2.maxMin2(intArray14, 0);
        int[] intArray20 = ds.MaxMin2.maxMin2(intArray14, 1);
        int[] intArray22 = ds.MaxMin2.maxMin2(intArray20, (int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray24 = ds.MaxMin2.maxMin2(intArray22, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 2");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[-1, 1, 32, 10, 1, 1]");
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray16), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray18), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray20), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray22), "[-1, -1]");
    }

    @Test
    public void test502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test502");
        int[] intArray6 = new int[] { (byte) -1, (byte) 1, ' ', (short) 10, (short) 1, (byte) 1 };
        int[] intArray8 = ds.MaxMin2.maxMin2(intArray6, (int) (byte) 0);
        int[] intArray10 = ds.MaxMin2.maxMin2(intArray6, (int) (byte) 1);
        int[] intArray12 = ds.MaxMin2.maxMin2(intArray6, (int) (byte) -1);
        java.lang.Class<?> wildcardClass13 = intArray6.getClass();
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[-1, 1, 32, 10, 1, 1]");
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[-1, -1]");
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test503");
        int[] intArray4 = new int[] { (byte) 0, 10, '#', (short) 0 };
        int[] intArray6 = ds.MaxMin2.maxMin2(intArray4, (int) (short) 1);
        int[] intArray8 = ds.MaxMin2.maxMin2(intArray4, (int) (short) 1);
        int[] intArray10 = ds.MaxMin2.maxMin2(intArray8, (int) (byte) 1);
        int[] intArray12 = ds.MaxMin2.maxMin2(intArray10, (int) (short) -1);
        java.lang.Class<?> wildcardClass13 = intArray10.getClass();
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[0, 10, 35, 0]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[0, 0]");
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test504");
        int[] intArray6 = new int[] { (byte) -1, (byte) 1, ' ', (short) 10, (short) 1, (byte) 1 };
        int[] intArray8 = ds.MaxMin2.maxMin2(intArray6, (int) (byte) 0);
        int[] intArray10 = ds.MaxMin2.maxMin2(intArray6, (int) (byte) 0);
        int[] intArray12 = ds.MaxMin2.maxMin2(intArray10, (int) (short) 0);
        int[] intArray14 = ds.MaxMin2.maxMin2(intArray12, (int) (short) 1);
        int[] intArray16 = ds.MaxMin2.maxMin2(intArray12, 0);
        java.lang.Class<?> wildcardClass17 = intArray16.getClass();
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[-1, 1, 32, 10, 1, 1]");
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray16), "[-1, -1]");
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test505");
        int[] intArray6 = new int[] { (byte) -1, (byte) 1, ' ', (short) 10, (short) 1, (byte) 1 };
        int[] intArray8 = ds.MaxMin2.maxMin2(intArray6, (int) (byte) 0);
        int[] intArray10 = ds.MaxMin2.maxMin2(intArray6, (int) (short) 1);
        int[] intArray12 = ds.MaxMin2.maxMin2(intArray10, (-1));
        int[] intArray14 = ds.MaxMin2.maxMin2(intArray12, (int) (short) -1);
        int[] intArray16 = ds.MaxMin2.maxMin2(intArray14, (-1));
        int[] intArray18 = ds.MaxMin2.maxMin2(intArray16, (int) (short) 1);
        int[] intArray20 = ds.MaxMin2.maxMin2(intArray16, (int) (short) 0);
        int[] intArray22 = ds.MaxMin2.maxMin2(intArray20, (-1));
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray24 = ds.MaxMin2.maxMin2(intArray22, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 2");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[-1, 1, 32, 10, 1, 1]");
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray16), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray18), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray20), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray22), "[-1, -1]");
    }

    @Test
    public void test506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test506");
        int[] intArray6 = new int[] { (byte) -1, (byte) 1, ' ', (short) 10, (short) 1, (byte) 1 };
        int[] intArray8 = ds.MaxMin2.maxMin2(intArray6, (int) (byte) 0);
        int[] intArray10 = ds.MaxMin2.maxMin2(intArray6, (int) (short) 1);
        int[] intArray12 = ds.MaxMin2.maxMin2(intArray10, (-1));
        int[] intArray14 = ds.MaxMin2.maxMin2(intArray10, (int) (byte) 0);
        int[] intArray16 = ds.MaxMin2.maxMin2(intArray10, 1);
        int[] intArray18 = ds.MaxMin2.maxMin2(intArray16, 0);
        int[] intArray20 = ds.MaxMin2.maxMin2(intArray16, 1);
        java.lang.Class<?> wildcardClass21 = intArray20.getClass();
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[-1, 1, 32, 10, 1, 1]");
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray16), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray18), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray20), "[-1, -1]");
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test507");
        int[] intArray4 = new int[] { (byte) 0, 10, '#', (short) 0 };
        int[] intArray6 = ds.MaxMin2.maxMin2(intArray4, (int) (short) 1);
        int[] intArray8 = ds.MaxMin2.maxMin2(intArray6, 0);
        int[] intArray10 = ds.MaxMin2.maxMin2(intArray8, 0);
        int[] intArray12 = ds.MaxMin2.maxMin2(intArray8, 0);
        int[] intArray14 = ds.MaxMin2.maxMin2(intArray12, (int) (byte) 0);
        int[] intArray16 = ds.MaxMin2.maxMin2(intArray12, (int) (short) 1);
        java.lang.Class<?> wildcardClass17 = intArray16.getClass();
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[0, 10, 35, 0]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray16), "[0, 0]");
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test508");
        int[] intArray6 = new int[] { (byte) -1, (byte) 1, ' ', (short) 10, (short) 1, (byte) 1 };
        int[] intArray8 = ds.MaxMin2.maxMin2(intArray6, (int) (byte) 0);
        int[] intArray10 = ds.MaxMin2.maxMin2(intArray6, (int) (byte) 0);
        int[] intArray12 = ds.MaxMin2.maxMin2(intArray10, (int) (short) -1);
        int[] intArray14 = ds.MaxMin2.maxMin2(intArray10, (int) (byte) -1);
        int[] intArray16 = ds.MaxMin2.maxMin2(intArray10, 0);
        java.lang.Class<?> wildcardClass17 = intArray16.getClass();
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[-1, 1, 32, 10, 1, 1]");
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray16), "[-1, -1]");
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test509");
        int[] intArray6 = new int[] { (byte) -1, (byte) 1, ' ', (short) 10, (short) 1, (byte) 1 };
        int[] intArray8 = ds.MaxMin2.maxMin2(intArray6, (int) (byte) 0);
        int[] intArray10 = ds.MaxMin2.maxMin2(intArray6, (int) (short) 1);
        int[] intArray12 = ds.MaxMin2.maxMin2(intArray10, (-1));
        int[] intArray14 = ds.MaxMin2.maxMin2(intArray10, (int) (byte) 0);
        int[] intArray16 = ds.MaxMin2.maxMin2(intArray10, 1);
        int[] intArray18 = ds.MaxMin2.maxMin2(intArray16, (int) (short) 1);
        java.lang.Class<?> wildcardClass19 = intArray18.getClass();
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[-1, 1, 32, 10, 1, 1]");
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray16), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray18), "[-1, -1]");
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test510");
        int[] intArray6 = new int[] { (byte) -1, (byte) 1, ' ', (short) 10, (short) 1, (byte) 1 };
        int[] intArray8 = ds.MaxMin2.maxMin2(intArray6, (int) (byte) 0);
        int[] intArray10 = ds.MaxMin2.maxMin2(intArray6, (int) (byte) 1);
        int[] intArray12 = ds.MaxMin2.maxMin2(intArray10, (int) (byte) 1);
        int[] intArray14 = ds.MaxMin2.maxMin2(intArray10, 0);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray16 = ds.MaxMin2.maxMin2(intArray10, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 2");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[-1, 1, 32, 10, 1, 1]");
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[-1, -1]");
    }

    @Test
    public void test511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test511");
        int[] intArray6 = new int[] { (byte) -1, (byte) 1, ' ', (short) 10, (short) 1, (byte) 1 };
        int[] intArray8 = ds.MaxMin2.maxMin2(intArray6, (int) (byte) 0);
        int[] intArray10 = ds.MaxMin2.maxMin2(intArray6, (int) (short) 1);
        int[] intArray12 = ds.MaxMin2.maxMin2(intArray10, (-1));
        int[] intArray14 = ds.MaxMin2.maxMin2(intArray12, (int) (short) -1);
        int[] intArray16 = ds.MaxMin2.maxMin2(intArray14, (-1));
        int[] intArray18 = ds.MaxMin2.maxMin2(intArray16, (int) (short) 1);
        int[] intArray20 = ds.MaxMin2.maxMin2(intArray16, (int) (short) 0);
        int[] intArray22 = ds.MaxMin2.maxMin2(intArray20, (-1));
        int[] intArray24 = ds.MaxMin2.maxMin2(intArray20, (-1));
        java.lang.Class<?> wildcardClass25 = intArray20.getClass();
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[-1, 1, 32, 10, 1, 1]");
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray16), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray18), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray20), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray22), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray24), "[-1, -1]");
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test512");
        int[] intArray4 = new int[] { (byte) 0, 10, '#', (short) 0 };
        int[] intArray6 = ds.MaxMin2.maxMin2(intArray4, (int) (short) 1);
        int[] intArray8 = ds.MaxMin2.maxMin2(intArray4, (int) (short) 1);
        int[] intArray10 = ds.MaxMin2.maxMin2(intArray8, (int) (byte) 1);
        int[] intArray12 = ds.MaxMin2.maxMin2(intArray10, (int) (short) -1);
        java.lang.Class<?> wildcardClass13 = intArray12.getClass();
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[0, 10, 35, 0]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[0, 0]");
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test513");
        int[] intArray4 = new int[] { (byte) 0, 10, '#', (short) 0 };
        int[] intArray6 = ds.MaxMin2.maxMin2(intArray4, (int) (short) 1);
        int[] intArray8 = ds.MaxMin2.maxMin2(intArray6, 0);
        int[] intArray10 = ds.MaxMin2.maxMin2(intArray8, (int) (byte) -1);
        int[] intArray12 = ds.MaxMin2.maxMin2(intArray10, 0);
        int[] intArray14 = ds.MaxMin2.maxMin2(intArray12, 1);
        int[] intArray16 = ds.MaxMin2.maxMin2(intArray12, (int) (byte) -1);
        java.lang.Class<?> wildcardClass17 = intArray12.getClass();
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[0, 10, 35, 0]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray16), "[0, 0]");
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test514");
        int[] intArray4 = new int[] { (byte) 0, 10, '#', (short) 0 };
        int[] intArray6 = ds.MaxMin2.maxMin2(intArray4, (int) (short) 1);
        int[] intArray8 = ds.MaxMin2.maxMin2(intArray6, 0);
        int[] intArray10 = ds.MaxMin2.maxMin2(intArray8, (int) (byte) -1);
        int[] intArray12 = ds.MaxMin2.maxMin2(intArray10, 0);
        int[] intArray14 = ds.MaxMin2.maxMin2(intArray12, 0);
        int[] intArray16 = ds.MaxMin2.maxMin2(intArray14, (int) (byte) 1);
        int[] intArray18 = ds.MaxMin2.maxMin2(intArray16, (-1));
        java.lang.Class<?> wildcardClass19 = intArray16.getClass();
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[0, 10, 35, 0]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray16), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray18), "[0, 0]");
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test515");
        int[] intArray6 = new int[] { (byte) -1, (byte) 1, ' ', (short) 10, (short) 1, (byte) 1 };
        int[] intArray8 = ds.MaxMin2.maxMin2(intArray6, (int) (byte) 0);
        int[] intArray10 = ds.MaxMin2.maxMin2(intArray6, (int) (short) 1);
        int[] intArray12 = ds.MaxMin2.maxMin2(intArray10, (-1));
        int[] intArray14 = ds.MaxMin2.maxMin2(intArray10, (int) (byte) 0);
        int[] intArray16 = ds.MaxMin2.maxMin2(intArray10, 1);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray18 = ds.MaxMin2.maxMin2(intArray10, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 2");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[-1, 1, 32, 10, 1, 1]");
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray16), "[-1, -1]");
    }

    @Test
    public void test516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test516");
        int[] intArray4 = new int[] { (byte) 0, 10, '#', (short) 0 };
        int[] intArray6 = ds.MaxMin2.maxMin2(intArray4, (int) (short) 1);
        int[] intArray8 = ds.MaxMin2.maxMin2(intArray6, 0);
        int[] intArray10 = ds.MaxMin2.maxMin2(intArray8, (int) (byte) -1);
        int[] intArray12 = ds.MaxMin2.maxMin2(intArray10, 0);
        int[] intArray14 = ds.MaxMin2.maxMin2(intArray12, 0);
        int[] intArray16 = ds.MaxMin2.maxMin2(intArray14, (int) (short) 1);
        int[] intArray18 = ds.MaxMin2.maxMin2(intArray14, 0);
        int[] intArray20 = ds.MaxMin2.maxMin2(intArray18, (int) (short) -1);
        int[] intArray22 = ds.MaxMin2.maxMin2(intArray20, (int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray24 = ds.MaxMin2.maxMin2(intArray22, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 2");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[0, 10, 35, 0]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray16), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray18), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray20), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray22), "[0, 0]");
    }

    @Test
    public void test517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test517");
        int[] intArray6 = new int[] { (byte) -1, (byte) 1, ' ', (short) 10, (short) 1, (byte) 1 };
        int[] intArray8 = ds.MaxMin2.maxMin2(intArray6, (int) (byte) 0);
        int[] intArray10 = ds.MaxMin2.maxMin2(intArray6, (int) (byte) 0);
        int[] intArray12 = ds.MaxMin2.maxMin2(intArray10, (int) (short) 0);
        int[] intArray14 = ds.MaxMin2.maxMin2(intArray10, (int) (short) -1);
        int[] intArray16 = ds.MaxMin2.maxMin2(intArray10, (int) (byte) 0);
        int[] intArray18 = ds.MaxMin2.maxMin2(intArray16, (int) (byte) -1);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray20 = ds.MaxMin2.maxMin2(intArray18, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 2");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[-1, 1, 32, 10, 1, 1]");
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray16), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray18), "[-1, -1]");
    }

    @Test
    public void test518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test518");
        int[] intArray6 = new int[] { (byte) -1, (byte) 1, ' ', (short) 10, (short) 1, (byte) 1 };
        int[] intArray8 = ds.MaxMin2.maxMin2(intArray6, (int) (byte) 0);
        int[] intArray10 = ds.MaxMin2.maxMin2(intArray8, (int) (short) -1);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray12 = ds.MaxMin2.maxMin2(intArray10, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 2");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[-1, 1, 32, 10, 1, 1]");
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[-1, -1]");
    }

    @Test
    public void test519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test519");
        int[] intArray4 = new int[] { (byte) 0, 10, '#', (short) 0 };
        int[] intArray6 = ds.MaxMin2.maxMin2(intArray4, (int) (short) 1);
        int[] intArray8 = ds.MaxMin2.maxMin2(intArray6, 0);
        int[] intArray10 = ds.MaxMin2.maxMin2(intArray8, (int) (byte) -1);
        int[] intArray12 = ds.MaxMin2.maxMin2(intArray10, 0);
        int[] intArray14 = ds.MaxMin2.maxMin2(intArray12, 0);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray16 = ds.MaxMin2.maxMin2(intArray12, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 2");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[0, 10, 35, 0]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[0, 0]");
    }

    @Test
    public void test520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test520");
        int[] intArray4 = new int[] { (byte) 0, 10, '#', (short) 0 };
        int[] intArray6 = ds.MaxMin2.maxMin2(intArray4, (int) (short) 1);
        int[] intArray8 = ds.MaxMin2.maxMin2(intArray4, (int) (short) 1);
        int[] intArray10 = ds.MaxMin2.maxMin2(intArray8, (int) (byte) -1);
        int[] intArray12 = ds.MaxMin2.maxMin2(intArray10, 1);
        int[] intArray14 = ds.MaxMin2.maxMin2(intArray10, 1);
        int[] intArray16 = ds.MaxMin2.maxMin2(intArray10, (-1));
        int[] intArray18 = ds.MaxMin2.maxMin2(intArray16, (int) (byte) 0);
        int[] intArray20 = ds.MaxMin2.maxMin2(intArray16, (int) (short) 0);
        java.lang.Class<?> wildcardClass21 = intArray20.getClass();
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[0, 10, 35, 0]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray16), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray18), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray20), "[0, 0]");
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test521");
        int[] intArray4 = new int[] { (byte) 0, 10, '#', (short) 0 };
        int[] intArray6 = ds.MaxMin2.maxMin2(intArray4, (int) (short) 1);
        int[] intArray8 = ds.MaxMin2.maxMin2(intArray4, (int) (short) 1);
        int[] intArray10 = ds.MaxMin2.maxMin2(intArray8, (int) (byte) -1);
        int[] intArray12 = ds.MaxMin2.maxMin2(intArray10, 1);
        int[] intArray14 = ds.MaxMin2.maxMin2(intArray10, 1);
        int[] intArray16 = ds.MaxMin2.maxMin2(intArray14, 0);
        int[] intArray18 = ds.MaxMin2.maxMin2(intArray14, (int) (byte) 1);
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[0, 10, 35, 0]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray16), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray18), "[0, 0]");
    }

    @Test
    public void test522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test522");
        int[] intArray4 = new int[] { (byte) 0, 10, '#', (short) 0 };
        int[] intArray6 = ds.MaxMin2.maxMin2(intArray4, (int) (short) 1);
        int[] intArray8 = ds.MaxMin2.maxMin2(intArray6, 0);
        int[] intArray10 = ds.MaxMin2.maxMin2(intArray8, (int) (byte) -1);
        int[] intArray12 = ds.MaxMin2.maxMin2(intArray10, 0);
        int[] intArray14 = ds.MaxMin2.maxMin2(intArray10, (int) (short) 0);
        int[] intArray16 = ds.MaxMin2.maxMin2(intArray10, (int) (byte) 0);
        int[] intArray18 = ds.MaxMin2.maxMin2(intArray16, (int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray20 = ds.MaxMin2.maxMin2(intArray18, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 2");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[0, 10, 35, 0]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray16), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray18), "[0, 0]");
    }

    @Test
    public void test523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test523");
        int[] intArray4 = new int[] { (byte) 0, 10, '#', (short) 0 };
        int[] intArray6 = ds.MaxMin2.maxMin2(intArray4, (int) (short) 1);
        java.lang.Class<?> wildcardClass7 = intArray4.getClass();
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[0, 10, 35, 0]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[0, 0]");
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test524");
        int[] intArray4 = new int[] { (byte) 0, 10, '#', (short) 0 };
        int[] intArray6 = ds.MaxMin2.maxMin2(intArray4, (int) (short) 1);
        int[] intArray8 = ds.MaxMin2.maxMin2(intArray6, 0);
        int[] intArray10 = ds.MaxMin2.maxMin2(intArray8, 0);
        int[] intArray12 = ds.MaxMin2.maxMin2(intArray8, 0);
        int[] intArray14 = ds.MaxMin2.maxMin2(intArray12, 0);
        int[] intArray16 = ds.MaxMin2.maxMin2(intArray14, (-1));
        int[] intArray18 = ds.MaxMin2.maxMin2(intArray16, (int) (byte) 0);
        int[] intArray20 = ds.MaxMin2.maxMin2(intArray18, (int) (byte) 1);
        int[] intArray22 = ds.MaxMin2.maxMin2(intArray18, (int) (short) -1);
        int[] intArray24 = ds.MaxMin2.maxMin2(intArray18, (int) (short) 0);
        java.lang.Class<?> wildcardClass25 = intArray18.getClass();
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[0, 10, 35, 0]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray16), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray18), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray20), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray22), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray24), "[0, 0]");
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test525");
        int[] intArray4 = new int[] { (byte) 0, 10, '#', (short) 0 };
        int[] intArray6 = ds.MaxMin2.maxMin2(intArray4, (int) (short) 1);
        int[] intArray8 = ds.MaxMin2.maxMin2(intArray6, 0);
        int[] intArray10 = ds.MaxMin2.maxMin2(intArray8, 0);
        int[] intArray12 = ds.MaxMin2.maxMin2(intArray8, 0);
        int[] intArray14 = ds.MaxMin2.maxMin2(intArray12, (int) (byte) 0);
        int[] intArray16 = ds.MaxMin2.maxMin2(intArray12, (int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray18 = ds.MaxMin2.maxMin2(intArray16, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 2");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[0, 10, 35, 0]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray16), "[0, 0]");
    }

    @Test
    public void test526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test526");
        int[] intArray4 = new int[] { (byte) 0, 10, '#', (short) 0 };
        int[] intArray6 = ds.MaxMin2.maxMin2(intArray4, (int) (short) 1);
        int[] intArray8 = ds.MaxMin2.maxMin2(intArray6, 0);
        int[] intArray10 = ds.MaxMin2.maxMin2(intArray8, (int) (byte) -1);
        int[] intArray12 = ds.MaxMin2.maxMin2(intArray10, 0);
        int[] intArray14 = ds.MaxMin2.maxMin2(intArray12, 0);
        int[] intArray16 = ds.MaxMin2.maxMin2(intArray14, (-1));
        int[] intArray18 = ds.MaxMin2.maxMin2(intArray16, (int) (byte) -1);
        java.lang.Class<?> wildcardClass19 = intArray16.getClass();
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[0, 10, 35, 0]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray16), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray18), "[0, 0]");
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test527");
        int[] intArray6 = new int[] { (byte) -1, (byte) 1, ' ', (short) 10, (short) 1, (byte) 1 };
        int[] intArray8 = ds.MaxMin2.maxMin2(intArray6, (int) (byte) 0);
        int[] intArray10 = ds.MaxMin2.maxMin2(intArray6, (int) (short) 1);
        int[] intArray12 = ds.MaxMin2.maxMin2(intArray10, (-1));
        int[] intArray14 = ds.MaxMin2.maxMin2(intArray12, (int) (short) -1);
        int[] intArray16 = ds.MaxMin2.maxMin2(intArray12, (int) (byte) 1);
        java.lang.Class<?> wildcardClass17 = intArray12.getClass();
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[-1, 1, 32, 10, 1, 1]");
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray16), "[-1, -1]");
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test528");
        int[] intArray4 = new int[] { (byte) 0, 10, '#', (short) 0 };
        int[] intArray6 = ds.MaxMin2.maxMin2(intArray4, (int) (short) 1);
        int[] intArray8 = ds.MaxMin2.maxMin2(intArray6, 0);
        int[] intArray10 = ds.MaxMin2.maxMin2(intArray8, (int) (byte) -1);
        int[] intArray12 = ds.MaxMin2.maxMin2(intArray10, 0);
        int[] intArray14 = ds.MaxMin2.maxMin2(intArray12, 0);
        int[] intArray16 = ds.MaxMin2.maxMin2(intArray14, (int) (short) 1);
        int[] intArray18 = ds.MaxMin2.maxMin2(intArray14, 0);
        int[] intArray20 = ds.MaxMin2.maxMin2(intArray14, (int) (byte) 0);
        int[] intArray22 = ds.MaxMin2.maxMin2(intArray14, (int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray24 = ds.MaxMin2.maxMin2(intArray22, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 2");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[0, 10, 35, 0]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray16), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray18), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray20), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray22), "[0, 0]");
    }

    @Test
    public void test529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test529");
        int[] intArray4 = new int[] { (byte) 0, 10, '#', (short) 0 };
        int[] intArray6 = ds.MaxMin2.maxMin2(intArray4, (int) (short) 1);
        int[] intArray8 = ds.MaxMin2.maxMin2(intArray6, 0);
        int[] intArray10 = ds.MaxMin2.maxMin2(intArray8, 0);
        int[] intArray12 = ds.MaxMin2.maxMin2(intArray8, 0);
        int[] intArray14 = ds.MaxMin2.maxMin2(intArray12, (int) (byte) 0);
        int[] intArray16 = ds.MaxMin2.maxMin2(intArray14, (int) (short) 1);
        int[] intArray18 = ds.MaxMin2.maxMin2(intArray14, (int) (short) -1);
        java.lang.Class<?> wildcardClass19 = intArray14.getClass();
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[0, 10, 35, 0]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray16), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray18), "[0, 0]");
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test530");
        int[] intArray6 = new int[] { (byte) -1, (byte) 1, ' ', (short) 10, (short) 1, (byte) 1 };
        int[] intArray8 = ds.MaxMin2.maxMin2(intArray6, (int) (byte) 0);
        int[] intArray10 = ds.MaxMin2.maxMin2(intArray6, (int) (short) 1);
        int[] intArray12 = ds.MaxMin2.maxMin2(intArray10, (-1));
        int[] intArray14 = ds.MaxMin2.maxMin2(intArray12, (int) (short) -1);
        int[] intArray16 = ds.MaxMin2.maxMin2(intArray14, (-1));
        int[] intArray18 = ds.MaxMin2.maxMin2(intArray16, (int) (short) 1);
        int[] intArray20 = ds.MaxMin2.maxMin2(intArray16, (int) (short) 0);
        int[] intArray22 = ds.MaxMin2.maxMin2(intArray20, (-1));
        java.lang.Class<?> wildcardClass23 = intArray20.getClass();
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[-1, 1, 32, 10, 1, 1]");
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray16), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray18), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray20), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray22), "[-1, -1]");
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test531");
        int[] intArray6 = new int[] { (byte) -1, (byte) 1, ' ', (short) 10, (short) 1, (byte) 1 };
        int[] intArray8 = ds.MaxMin2.maxMin2(intArray6, (int) (byte) 0);
        int[] intArray10 = ds.MaxMin2.maxMin2(intArray6, (int) (short) 1);
        int[] intArray12 = ds.MaxMin2.maxMin2(intArray10, (-1));
        int[] intArray14 = ds.MaxMin2.maxMin2(intArray12, (int) (short) 1);
        java.lang.Class<?> wildcardClass15 = intArray14.getClass();
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[-1, 1, 32, 10, 1, 1]");
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[-1, -1]");
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test532");
        int[] intArray4 = new int[] { (byte) 0, 10, '#', (short) 0 };
        int[] intArray6 = ds.MaxMin2.maxMin2(intArray4, (int) (short) 1);
        int[] intArray8 = ds.MaxMin2.maxMin2(intArray6, 0);
        int[] intArray10 = ds.MaxMin2.maxMin2(intArray6, (int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray12 = ds.MaxMin2.maxMin2(intArray6, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 2");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[0, 10, 35, 0]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[0, 0]");
    }

    @Test
    public void test533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test533");
        int[] intArray4 = new int[] { (byte) 0, 10, '#', (short) 0 };
        int[] intArray6 = ds.MaxMin2.maxMin2(intArray4, (int) (short) 1);
        int[] intArray8 = ds.MaxMin2.maxMin2(intArray4, 0);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray10 = ds.MaxMin2.maxMin2(intArray4, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 4");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[0, 10, 35, 0]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[0, 0]");
    }

    @Test
    public void test534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test534");
        int[] intArray4 = new int[] { (byte) 0, 10, '#', (short) 0 };
        int[] intArray6 = ds.MaxMin2.maxMin2(intArray4, (int) (short) 1);
        int[] intArray8 = ds.MaxMin2.maxMin2(intArray6, 0);
        int[] intArray10 = ds.MaxMin2.maxMin2(intArray8, (int) (byte) -1);
        int[] intArray12 = ds.MaxMin2.maxMin2(intArray10, 0);
        int[] intArray14 = ds.MaxMin2.maxMin2(intArray10, (int) (short) 0);
        int[] intArray16 = ds.MaxMin2.maxMin2(intArray14, 1);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray18 = ds.MaxMin2.maxMin2(intArray16, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 2");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[0, 10, 35, 0]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray16), "[0, 0]");
    }

    @Test
    public void test535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test535");
        int[] intArray6 = new int[] { (byte) -1, (byte) 1, ' ', (short) 10, (short) 1, (byte) 1 };
        int[] intArray8 = ds.MaxMin2.maxMin2(intArray6, (int) (byte) 0);
        int[] intArray10 = ds.MaxMin2.maxMin2(intArray6, (int) (short) 1);
        int[] intArray12 = ds.MaxMin2.maxMin2(intArray10, (-1));
        int[] intArray14 = ds.MaxMin2.maxMin2(intArray12, (int) (short) -1);
        int[] intArray16 = ds.MaxMin2.maxMin2(intArray12, (int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray18 = ds.MaxMin2.maxMin2(intArray12, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 2");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[-1, 1, 32, 10, 1, 1]");
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray16), "[-1, -1]");
    }

    @Test
    public void test536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test536");
        int[] intArray4 = new int[] { (byte) 0, 10, '#', (short) 0 };
        int[] intArray6 = ds.MaxMin2.maxMin2(intArray4, (int) (short) 1);
        int[] intArray8 = ds.MaxMin2.maxMin2(intArray6, 0);
        int[] intArray10 = ds.MaxMin2.maxMin2(intArray8, (int) (byte) -1);
        int[] intArray12 = ds.MaxMin2.maxMin2(intArray10, 0);
        int[] intArray14 = ds.MaxMin2.maxMin2(intArray12, 0);
        int[] intArray16 = ds.MaxMin2.maxMin2(intArray14, (int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray18 = ds.MaxMin2.maxMin2(intArray16, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 2");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[0, 10, 35, 0]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray16), "[0, 0]");
    }

    @Test
    public void test537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test537");
        int[] intArray6 = new int[] { (byte) -1, (byte) 1, ' ', (short) 10, (short) 1, (byte) 1 };
        int[] intArray8 = ds.MaxMin2.maxMin2(intArray6, (int) (byte) 0);
        int[] intArray10 = ds.MaxMin2.maxMin2(intArray6, (int) (short) 1);
        int[] intArray12 = ds.MaxMin2.maxMin2(intArray10, (-1));
        int[] intArray14 = ds.MaxMin2.maxMin2(intArray12, (int) (short) -1);
        int[] intArray16 = ds.MaxMin2.maxMin2(intArray14, (-1));
        int[] intArray18 = ds.MaxMin2.maxMin2(intArray16, (int) (short) 1);
        int[] intArray20 = ds.MaxMin2.maxMin2(intArray16, (int) (byte) 1);
        int[] intArray22 = ds.MaxMin2.maxMin2(intArray16, 0);
        java.lang.Class<?> wildcardClass23 = intArray16.getClass();
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[-1, 1, 32, 10, 1, 1]");
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray16), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray18), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray20), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray22), "[-1, -1]");
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test538");
        int[] intArray6 = new int[] { (byte) -1, (byte) 1, ' ', (short) 10, (short) 1, (byte) 1 };
        int[] intArray8 = ds.MaxMin2.maxMin2(intArray6, (int) (byte) 0);
        int[] intArray10 = ds.MaxMin2.maxMin2(intArray6, (int) (byte) 0);
        int[] intArray12 = ds.MaxMin2.maxMin2(intArray10, (int) (short) 0);
        int[] intArray14 = ds.MaxMin2.maxMin2(intArray10, (int) (short) -1);
        int[] intArray16 = ds.MaxMin2.maxMin2(intArray10, (int) (byte) 0);
        int[] intArray18 = ds.MaxMin2.maxMin2(intArray16, (int) (byte) -1);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray20 = ds.MaxMin2.maxMin2(intArray16, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 2");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[-1, 1, 32, 10, 1, 1]");
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray16), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray18), "[-1, -1]");
    }

    @Test
    public void test539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test539");
        int[] intArray4 = new int[] { (byte) 0, 10, '#', (short) 0 };
        int[] intArray6 = ds.MaxMin2.maxMin2(intArray4, (int) (short) 1);
        int[] intArray8 = ds.MaxMin2.maxMin2(intArray6, 0);
        int[] intArray10 = ds.MaxMin2.maxMin2(intArray8, 0);
        int[] intArray12 = ds.MaxMin2.maxMin2(intArray8, 0);
        int[] intArray14 = ds.MaxMin2.maxMin2(intArray12, 0);
        int[] intArray16 = ds.MaxMin2.maxMin2(intArray12, 0);
        int[] intArray18 = ds.MaxMin2.maxMin2(intArray16, 1);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray20 = ds.MaxMin2.maxMin2(intArray18, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 2");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[0, 10, 35, 0]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray16), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray18), "[0, 0]");
    }

    @Test
    public void test540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test540");
        int[] intArray6 = new int[] { (byte) -1, (byte) 1, ' ', (short) 10, (short) 1, (byte) 1 };
        int[] intArray8 = ds.MaxMin2.maxMin2(intArray6, (int) (byte) 0);
        int[] intArray10 = ds.MaxMin2.maxMin2(intArray6, (int) (short) 1);
        int[] intArray12 = ds.MaxMin2.maxMin2(intArray10, (-1));
        int[] intArray14 = ds.MaxMin2.maxMin2(intArray10, (int) (byte) 0);
        int[] intArray16 = ds.MaxMin2.maxMin2(intArray10, 1);
        int[] intArray18 = ds.MaxMin2.maxMin2(intArray16, 0);
        int[] intArray20 = ds.MaxMin2.maxMin2(intArray16, 1);
        java.lang.Class<?> wildcardClass21 = intArray16.getClass();
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[-1, 1, 32, 10, 1, 1]");
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray16), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray18), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray20), "[-1, -1]");
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test541");
        int[] intArray6 = new int[] { (byte) -1, (byte) 1, ' ', (short) 10, (short) 1, (byte) 1 };
        int[] intArray8 = ds.MaxMin2.maxMin2(intArray6, (int) (byte) 0);
        int[] intArray10 = ds.MaxMin2.maxMin2(intArray6, (int) (short) 1);
        int[] intArray12 = ds.MaxMin2.maxMin2(intArray10, (-1));
        int[] intArray14 = ds.MaxMin2.maxMin2(intArray10, (int) (byte) 0);
        int[] intArray16 = ds.MaxMin2.maxMin2(intArray10, 1);
        int[] intArray18 = ds.MaxMin2.maxMin2(intArray16, 0);
        int[] intArray20 = ds.MaxMin2.maxMin2(intArray16, 1);
        int[] intArray22 = ds.MaxMin2.maxMin2(intArray16, (int) (short) 0);
        int[] intArray24 = ds.MaxMin2.maxMin2(intArray16, 0);
        java.lang.Class<?> wildcardClass25 = intArray24.getClass();
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[-1, 1, 32, 10, 1, 1]");
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray16), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray18), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray20), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray22), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray24), "[-1, -1]");
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test542");
        int[] intArray4 = new int[] { (byte) 0, 10, '#', (short) 0 };
        int[] intArray6 = ds.MaxMin2.maxMin2(intArray4, (int) (short) 1);
        int[] intArray8 = ds.MaxMin2.maxMin2(intArray4, (int) (short) 1);
        int[] intArray10 = ds.MaxMin2.maxMin2(intArray8, (int) (byte) -1);
        int[] intArray12 = ds.MaxMin2.maxMin2(intArray10, 1);
        java.lang.Class<?> wildcardClass13 = intArray10.getClass();
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[0, 10, 35, 0]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[0, 0]");
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test543");
        int[] intArray4 = new int[] { (byte) 0, 10, '#', (short) 0 };
        int[] intArray6 = ds.MaxMin2.maxMin2(intArray4, (int) (short) 1);
        int[] intArray8 = ds.MaxMin2.maxMin2(intArray6, 0);
        int[] intArray10 = ds.MaxMin2.maxMin2(intArray8, 0);
        int[] intArray12 = ds.MaxMin2.maxMin2(intArray8, 0);
        int[] intArray14 = ds.MaxMin2.maxMin2(intArray12, 0);
        int[] intArray16 = ds.MaxMin2.maxMin2(intArray12, (int) (short) -1);
        int[] intArray18 = ds.MaxMin2.maxMin2(intArray12, (int) (short) -1);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray20 = ds.MaxMin2.maxMin2(intArray18, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 2");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[0, 10, 35, 0]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray16), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray18), "[0, 0]");
    }

    @Test
    public void test544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test544");
        int[] intArray6 = new int[] { (byte) -1, (byte) 1, ' ', (short) 10, (short) 1, (byte) 1 };
        int[] intArray8 = ds.MaxMin2.maxMin2(intArray6, (int) (byte) 0);
        int[] intArray10 = ds.MaxMin2.maxMin2(intArray6, (int) (short) 1);
        int[] intArray12 = ds.MaxMin2.maxMin2(intArray10, (-1));
        int[] intArray14 = ds.MaxMin2.maxMin2(intArray12, (int) (short) -1);
        int[] intArray16 = ds.MaxMin2.maxMin2(intArray14, (-1));
        int[] intArray18 = ds.MaxMin2.maxMin2(intArray14, 0);
        int[] intArray20 = ds.MaxMin2.maxMin2(intArray14, 1);
        int[] intArray22 = ds.MaxMin2.maxMin2(intArray20, (-1));
        java.lang.Class<?> wildcardClass23 = intArray20.getClass();
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[-1, 1, 32, 10, 1, 1]");
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray16), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray18), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray20), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray22), "[-1, -1]");
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test545");
        int[] intArray4 = new int[] { (byte) 0, 10, '#', (short) 0 };
        int[] intArray6 = ds.MaxMin2.maxMin2(intArray4, (int) (short) 1);
        int[] intArray8 = ds.MaxMin2.maxMin2(intArray6, 0);
        int[] intArray10 = ds.MaxMin2.maxMin2(intArray8, (int) (byte) -1);
        int[] intArray12 = ds.MaxMin2.maxMin2(intArray10, 0);
        int[] intArray14 = ds.MaxMin2.maxMin2(intArray10, (int) (byte) 1);
        java.lang.Class<?> wildcardClass15 = intArray10.getClass();
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[0, 10, 35, 0]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[0, 0]");
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test546");
        int[] intArray4 = new int[] { (byte) 0, 10, '#', (short) 0 };
        int[] intArray6 = ds.MaxMin2.maxMin2(intArray4, (int) (short) 1);
        int[] intArray8 = ds.MaxMin2.maxMin2(intArray6, 0);
        int[] intArray10 = ds.MaxMin2.maxMin2(intArray8, 0);
        int[] intArray12 = ds.MaxMin2.maxMin2(intArray8, 0);
        int[] intArray14 = ds.MaxMin2.maxMin2(intArray12, (int) (byte) 0);
        int[] intArray16 = ds.MaxMin2.maxMin2(intArray12, (int) (short) 1);
        int[] intArray18 = ds.MaxMin2.maxMin2(intArray16, (int) (byte) 0);
        int[] intArray20 = ds.MaxMin2.maxMin2(intArray18, (int) (byte) 1);
        int[] intArray22 = ds.MaxMin2.maxMin2(intArray18, (int) (short) -1);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray24 = ds.MaxMin2.maxMin2(intArray22, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 2");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[0, 10, 35, 0]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray16), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray18), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray20), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray22), "[0, 0]");
    }

    @Test
    public void test547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test547");
        int[] intArray4 = new int[] { (byte) 0, 10, '#', (short) 0 };
        int[] intArray6 = ds.MaxMin2.maxMin2(intArray4, (int) (short) 1);
        int[] intArray8 = ds.MaxMin2.maxMin2(intArray6, 0);
        int[] intArray10 = ds.MaxMin2.maxMin2(intArray8, (int) (byte) -1);
        int[] intArray12 = ds.MaxMin2.maxMin2(intArray10, 0);
        int[] intArray14 = ds.MaxMin2.maxMin2(intArray12, 0);
        int[] intArray16 = ds.MaxMin2.maxMin2(intArray14, (int) (short) 1);
        int[] intArray18 = ds.MaxMin2.maxMin2(intArray14, 0);
        int[] intArray20 = ds.MaxMin2.maxMin2(intArray18, (int) (short) -1);
        int[] intArray22 = ds.MaxMin2.maxMin2(intArray18, (int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray24 = ds.MaxMin2.maxMin2(intArray18, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 2");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[0, 10, 35, 0]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray16), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray18), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray20), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray22), "[0, 0]");
    }

    @Test
    public void test548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test548");
        int[] intArray6 = new int[] { (byte) -1, (byte) 1, ' ', (short) 10, (short) 1, (byte) 1 };
        int[] intArray8 = ds.MaxMin2.maxMin2(intArray6, (int) (byte) 0);
        int[] intArray10 = ds.MaxMin2.maxMin2(intArray6, (int) (short) 1);
        int[] intArray12 = ds.MaxMin2.maxMin2(intArray10, (-1));
        int[] intArray14 = ds.MaxMin2.maxMin2(intArray12, (int) (short) -1);
        int[] intArray16 = ds.MaxMin2.maxMin2(intArray14, (-1));
        int[] intArray18 = ds.MaxMin2.maxMin2(intArray14, 0);
        int[] intArray20 = ds.MaxMin2.maxMin2(intArray14, (int) (short) 1);
        int[] intArray22 = ds.MaxMin2.maxMin2(intArray20, 1);
        java.lang.Class<?> wildcardClass23 = intArray22.getClass();
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[-1, 1, 32, 10, 1, 1]");
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray16), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray18), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray20), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray22), "[-1, -1]");
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test549");
        int[] intArray6 = new int[] { (byte) -1, (byte) 1, ' ', (short) 10, (short) 1, (byte) 1 };
        int[] intArray8 = ds.MaxMin2.maxMin2(intArray6, (int) (byte) 0);
        int[] intArray10 = ds.MaxMin2.maxMin2(intArray6, (int) (byte) 0);
        int[] intArray12 = ds.MaxMin2.maxMin2(intArray10, (int) (short) 0);
        int[] intArray14 = ds.MaxMin2.maxMin2(intArray10, (int) (short) -1);
        int[] intArray16 = ds.MaxMin2.maxMin2(intArray10, (int) (byte) 0);
        int[] intArray18 = ds.MaxMin2.maxMin2(intArray16, (int) (byte) -1);
        java.lang.Class<?> wildcardClass19 = intArray16.getClass();
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[-1, 1, 32, 10, 1, 1]");
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray16), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray18), "[-1, -1]");
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test550");
        int[] intArray4 = new int[] { (byte) 0, 10, '#', (short) 0 };
        int[] intArray6 = ds.MaxMin2.maxMin2(intArray4, (int) (short) 1);
        int[] intArray8 = ds.MaxMin2.maxMin2(intArray6, 0);
        int[] intArray10 = ds.MaxMin2.maxMin2(intArray8, (int) (byte) -1);
        int[] intArray12 = ds.MaxMin2.maxMin2(intArray10, 0);
        int[] intArray14 = ds.MaxMin2.maxMin2(intArray12, (int) (short) 0);
        int[] intArray16 = ds.MaxMin2.maxMin2(intArray14, (int) (short) -1);
        int[] intArray18 = ds.MaxMin2.maxMin2(intArray14, (int) (short) 0);
        java.lang.Class<?> wildcardClass19 = intArray14.getClass();
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[0, 10, 35, 0]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray16), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray18), "[0, 0]");
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test551");
        int[] intArray6 = new int[] { (byte) -1, (byte) 1, ' ', (short) 10, (short) 1, (byte) 1 };
        int[] intArray8 = ds.MaxMin2.maxMin2(intArray6, (int) (byte) 0);
        int[] intArray10 = ds.MaxMin2.maxMin2(intArray6, (int) (short) 1);
        int[] intArray12 = ds.MaxMin2.maxMin2(intArray10, (-1));
        int[] intArray14 = ds.MaxMin2.maxMin2(intArray10, (int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray16 = ds.MaxMin2.maxMin2(intArray10, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 2");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[-1, 1, 32, 10, 1, 1]");
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[-1, -1]");
    }

    @Test
    public void test552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test552");
        int[] intArray6 = new int[] { (byte) -1, (byte) 1, ' ', (short) 10, (short) 1, (byte) 1 };
        int[] intArray8 = ds.MaxMin2.maxMin2(intArray6, (int) (byte) 0);
        int[] intArray10 = ds.MaxMin2.maxMin2(intArray8, (-1));
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray12 = ds.MaxMin2.maxMin2(intArray10, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 2");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[-1, 1, 32, 10, 1, 1]");
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[-1, -1]");
    }

    @Test
    public void test553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test553");
        int[] intArray6 = new int[] { (byte) -1, (byte) 1, ' ', (short) 10, (short) 1, (byte) 1 };
        int[] intArray8 = ds.MaxMin2.maxMin2(intArray6, (int) (byte) 0);
        int[] intArray10 = ds.MaxMin2.maxMin2(intArray6, (int) (byte) 0);
        int[] intArray12 = ds.MaxMin2.maxMin2(intArray10, (int) (byte) -1);
        int[] intArray14 = ds.MaxMin2.maxMin2(intArray12, 0);
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[-1, 1, 32, 10, 1, 1]");
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[-1, -1]");
    }

    @Test
    public void test554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test554");
        int[] intArray4 = new int[] { (byte) 0, 10, '#', (short) 0 };
        int[] intArray6 = ds.MaxMin2.maxMin2(intArray4, (int) (short) 1);
        int[] intArray8 = ds.MaxMin2.maxMin2(intArray4, (int) (short) 1);
        int[] intArray10 = ds.MaxMin2.maxMin2(intArray8, (int) (short) 1);
        int[] intArray12 = ds.MaxMin2.maxMin2(intArray8, (-1));
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray14 = ds.MaxMin2.maxMin2(intArray8, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 2");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[0, 10, 35, 0]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[0, 0]");
    }

    @Test
    public void test555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test555");
        int[] intArray6 = new int[] { (byte) -1, (byte) 1, ' ', (short) 10, (short) 1, (byte) 1 };
        int[] intArray8 = ds.MaxMin2.maxMin2(intArray6, (int) (byte) 0);
        int[] intArray10 = ds.MaxMin2.maxMin2(intArray6, (int) (short) 1);
        int[] intArray12 = ds.MaxMin2.maxMin2(intArray10, (-1));
        int[] intArray14 = ds.MaxMin2.maxMin2(intArray12, (int) (short) -1);
        int[] intArray16 = ds.MaxMin2.maxMin2(intArray14, (-1));
        int[] intArray18 = ds.MaxMin2.maxMin2(intArray16, (int) (short) 0);
        int[] intArray20 = ds.MaxMin2.maxMin2(intArray16, (-1));
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray22 = ds.MaxMin2.maxMin2(intArray16, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 2");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[-1, 1, 32, 10, 1, 1]");
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray16), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray18), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray20), "[-1, -1]");
    }

    @Test
    public void test556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test556");
        int[] intArray6 = new int[] { (byte) -1, (byte) 1, ' ', (short) 10, (short) 1, (byte) 1 };
        int[] intArray8 = ds.MaxMin2.maxMin2(intArray6, (int) (byte) 0);
        int[] intArray10 = ds.MaxMin2.maxMin2(intArray6, (int) (short) 1);
        int[] intArray12 = ds.MaxMin2.maxMin2(intArray10, (-1));
        int[] intArray14 = ds.MaxMin2.maxMin2(intArray12, (int) (short) -1);
        int[] intArray16 = ds.MaxMin2.maxMin2(intArray14, (-1));
        int[] intArray18 = ds.MaxMin2.maxMin2(intArray16, (int) (short) 0);
        int[] intArray20 = ds.MaxMin2.maxMin2(intArray16, (-1));
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray22 = ds.MaxMin2.maxMin2(intArray16, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 2");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[-1, 1, 32, 10, 1, 1]");
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray16), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray18), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray20), "[-1, -1]");
    }

    @Test
    public void test557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test557");
        int[] intArray6 = new int[] { (byte) -1, (byte) 1, ' ', (short) 10, (short) 1, (byte) 1 };
        int[] intArray8 = ds.MaxMin2.maxMin2(intArray6, (int) (byte) 0);
        int[] intArray10 = ds.MaxMin2.maxMin2(intArray6, (int) (short) 1);
        int[] intArray12 = ds.MaxMin2.maxMin2(intArray10, (-1));
        int[] intArray14 = ds.MaxMin2.maxMin2(intArray12, (int) (short) -1);
        int[] intArray16 = ds.MaxMin2.maxMin2(intArray14, (-1));
        int[] intArray18 = ds.MaxMin2.maxMin2(intArray16, (int) (short) 1);
        int[] intArray20 = ds.MaxMin2.maxMin2(intArray16, (int) (short) 0);
        int[] intArray22 = ds.MaxMin2.maxMin2(intArray20, (int) (byte) 0);
        int[] intArray24 = ds.MaxMin2.maxMin2(intArray20, 0);
        int[] intArray26 = ds.MaxMin2.maxMin2(intArray20, (-1));
        java.lang.Class<?> wildcardClass27 = intArray26.getClass();
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[-1, 1, 32, 10, 1, 1]");
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray16), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray18), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray20), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray22), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray24), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray26), "[-1, -1]");
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test558");
        int[] intArray4 = new int[] { (byte) 0, 10, '#', (short) 0 };
        int[] intArray6 = ds.MaxMin2.maxMin2(intArray4, (int) (short) 1);
        int[] intArray8 = ds.MaxMin2.maxMin2(intArray6, 0);
        int[] intArray10 = ds.MaxMin2.maxMin2(intArray8, (int) (byte) -1);
        int[] intArray12 = ds.MaxMin2.maxMin2(intArray10, 0);
        int[] intArray14 = ds.MaxMin2.maxMin2(intArray12, (int) (short) 0);
        int[] intArray16 = ds.MaxMin2.maxMin2(intArray14, (int) (short) -1);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray18 = ds.MaxMin2.maxMin2(intArray16, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 2");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[0, 10, 35, 0]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray16), "[0, 0]");
    }

    @Test
    public void test559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test559");
        int[] intArray6 = new int[] { (byte) -1, (byte) 1, ' ', (short) 10, (short) 1, (byte) 1 };
        int[] intArray8 = ds.MaxMin2.maxMin2(intArray6, (int) (byte) 0);
        int[] intArray10 = ds.MaxMin2.maxMin2(intArray6, (int) (short) 1);
        int[] intArray12 = ds.MaxMin2.maxMin2(intArray10, (-1));
        int[] intArray14 = ds.MaxMin2.maxMin2(intArray12, (int) (short) -1);
        int[] intArray16 = ds.MaxMin2.maxMin2(intArray14, (-1));
        int[] intArray18 = ds.MaxMin2.maxMin2(intArray14, 0);
        int[] intArray20 = ds.MaxMin2.maxMin2(intArray14, 1);
        int[] intArray22 = ds.MaxMin2.maxMin2(intArray20, (-1));
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray24 = ds.MaxMin2.maxMin2(intArray20, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 2");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[-1, 1, 32, 10, 1, 1]");
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray16), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray18), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray20), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray22), "[-1, -1]");
    }

    @Test
    public void test560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test560");
        int[] intArray6 = new int[] { (byte) -1, (byte) 1, ' ', (short) 10, (short) 1, (byte) 1 };
        int[] intArray8 = ds.MaxMin2.maxMin2(intArray6, (int) (byte) 0);
        int[] intArray10 = ds.MaxMin2.maxMin2(intArray6, (int) (short) 1);
        int[] intArray12 = ds.MaxMin2.maxMin2(intArray10, (-1));
        int[] intArray14 = ds.MaxMin2.maxMin2(intArray10, (int) (byte) 0);
        int[] intArray16 = ds.MaxMin2.maxMin2(intArray10, 1);
        int[] intArray18 = ds.MaxMin2.maxMin2(intArray16, (int) (short) 0);
        java.lang.Class<?> wildcardClass19 = intArray16.getClass();
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[-1, 1, 32, 10, 1, 1]");
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray16), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray18), "[-1, -1]");
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test561");
        int[] intArray6 = new int[] { (byte) -1, (byte) 1, ' ', (short) 10, (short) 1, (byte) 1 };
        int[] intArray8 = ds.MaxMin2.maxMin2(intArray6, (int) (byte) 0);
        int[] intArray10 = ds.MaxMin2.maxMin2(intArray6, (int) (short) 1);
        int[] intArray12 = ds.MaxMin2.maxMin2(intArray10, (-1));
        int[] intArray14 = ds.MaxMin2.maxMin2(intArray12, (int) (short) -1);
        int[] intArray16 = ds.MaxMin2.maxMin2(intArray14, (-1));
        int[] intArray18 = ds.MaxMin2.maxMin2(intArray16, (int) (short) 1);
        int[] intArray20 = ds.MaxMin2.maxMin2(intArray18, (-1));
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray22 = ds.MaxMin2.maxMin2(intArray20, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 2");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[-1, 1, 32, 10, 1, 1]");
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray16), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray18), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray20), "[-1, -1]");
    }

    @Test
    public void test562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test562");
        int[] intArray6 = new int[] { (byte) -1, (byte) 1, ' ', (short) 10, (short) 1, (byte) 1 };
        int[] intArray8 = ds.MaxMin2.maxMin2(intArray6, (int) (byte) 0);
        int[] intArray10 = ds.MaxMin2.maxMin2(intArray6, (int) (short) 1);
        int[] intArray12 = ds.MaxMin2.maxMin2(intArray10, (-1));
        int[] intArray14 = ds.MaxMin2.maxMin2(intArray10, (int) (byte) 0);
        int[] intArray16 = ds.MaxMin2.maxMin2(intArray10, 1);
        int[] intArray18 = ds.MaxMin2.maxMin2(intArray16, 0);
        int[] intArray20 = ds.MaxMin2.maxMin2(intArray16, 1);
        int[] intArray22 = ds.MaxMin2.maxMin2(intArray16, (int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray24 = ds.MaxMin2.maxMin2(intArray22, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 2");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[-1, 1, 32, 10, 1, 1]");
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray16), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray18), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray20), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray22), "[-1, -1]");
    }

    @Test
    public void test563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test563");
        int[] intArray6 = new int[] { (byte) -1, (byte) 1, ' ', (short) 10, (short) 1, (byte) 1 };
        int[] intArray8 = ds.MaxMin2.maxMin2(intArray6, (int) (byte) 0);
        int[] intArray10 = ds.MaxMin2.maxMin2(intArray6, (int) (short) 1);
        int[] intArray12 = ds.MaxMin2.maxMin2(intArray10, (-1));
        int[] intArray14 = ds.MaxMin2.maxMin2(intArray12, (int) (short) -1);
        int[] intArray16 = ds.MaxMin2.maxMin2(intArray14, (-1));
        int[] intArray18 = ds.MaxMin2.maxMin2(intArray16, (int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray20 = ds.MaxMin2.maxMin2(intArray16, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 2");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[-1, 1, 32, 10, 1, 1]");
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray16), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray18), "[-1, -1]");
    }

    @Test
    public void test564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test564");
        int[] intArray6 = new int[] { (byte) -1, (byte) 1, ' ', (short) 10, (short) 1, (byte) 1 };
        int[] intArray8 = ds.MaxMin2.maxMin2(intArray6, (int) (byte) 0);
        int[] intArray10 = ds.MaxMin2.maxMin2(intArray6, (int) (short) 1);
        int[] intArray12 = ds.MaxMin2.maxMin2(intArray10, (-1));
        int[] intArray14 = ds.MaxMin2.maxMin2(intArray10, (int) (byte) 0);
        int[] intArray16 = ds.MaxMin2.maxMin2(intArray14, 1);
        int[] intArray18 = ds.MaxMin2.maxMin2(intArray14, (-1));
        java.lang.Class<?> wildcardClass19 = intArray18.getClass();
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[-1, 1, 32, 10, 1, 1]");
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray16), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray18), "[-1, -1]");
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test565");
        int[] intArray4 = new int[] { (byte) 0, 10, '#', (short) 0 };
        int[] intArray6 = ds.MaxMin2.maxMin2(intArray4, (int) (short) 1);
        int[] intArray8 = ds.MaxMin2.maxMin2(intArray6, 0);
        int[] intArray10 = ds.MaxMin2.maxMin2(intArray8, (int) (byte) -1);
        int[] intArray12 = ds.MaxMin2.maxMin2(intArray10, 0);
        int[] intArray14 = ds.MaxMin2.maxMin2(intArray10, (int) (short) 0);
        int[] intArray16 = ds.MaxMin2.maxMin2(intArray14, 1);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray18 = ds.MaxMin2.maxMin2(intArray14, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 2");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[0, 10, 35, 0]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray16), "[0, 0]");
    }

    @Test
    public void test566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test566");
        int[] intArray4 = new int[] { (byte) 0, 10, '#', (short) 0 };
        int[] intArray6 = ds.MaxMin2.maxMin2(intArray4, (int) (short) 1);
        int[] intArray8 = ds.MaxMin2.maxMin2(intArray4, (int) (short) 1);
        int[] intArray10 = ds.MaxMin2.maxMin2(intArray8, (int) (short) 1);
        int[] intArray12 = ds.MaxMin2.maxMin2(intArray8, (-1));
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray14 = ds.MaxMin2.maxMin2(intArray8, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 2");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[0, 10, 35, 0]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[0, 0]");
    }

    @Test
    public void test567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test567");
        int[] intArray6 = new int[] { (byte) -1, (byte) 1, ' ', (short) 10, (short) 1, (byte) 1 };
        int[] intArray8 = ds.MaxMin2.maxMin2(intArray6, (int) (byte) 0);
        int[] intArray10 = ds.MaxMin2.maxMin2(intArray6, (int) (byte) 1);
        int[] intArray12 = ds.MaxMin2.maxMin2(intArray6, (int) (short) 0);
        int[] intArray14 = ds.MaxMin2.maxMin2(intArray12, (int) (short) 0);
        java.lang.Class<?> wildcardClass15 = intArray14.getClass();
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[-1, 1, 32, 10, 1, 1]");
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[-1, -1]");
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test568");
        int[] intArray4 = new int[] { (byte) 0, 10, '#', (short) 0 };
        int[] intArray6 = ds.MaxMin2.maxMin2(intArray4, (int) (short) 1);
        int[] intArray8 = ds.MaxMin2.maxMin2(intArray6, 0);
        int[] intArray10 = ds.MaxMin2.maxMin2(intArray8, 0);
        int[] intArray12 = ds.MaxMin2.maxMin2(intArray8, 0);
        int[] intArray14 = ds.MaxMin2.maxMin2(intArray12, (int) (byte) 0);
        int[] intArray16 = ds.MaxMin2.maxMin2(intArray12, (int) (short) 1);
        int[] intArray18 = ds.MaxMin2.maxMin2(intArray16, (int) (byte) 0);
        int[] intArray20 = ds.MaxMin2.maxMin2(intArray18, (int) (byte) 1);
        int[] intArray22 = ds.MaxMin2.maxMin2(intArray20, (int) (byte) 0);
        int[] intArray24 = ds.MaxMin2.maxMin2(intArray22, (int) (byte) 0);
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[0, 10, 35, 0]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray16), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray18), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray20), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray22), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray24), "[0, 0]");
    }

    @Test
    public void test569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test569");
        int[] intArray6 = new int[] { (byte) -1, (byte) 1, ' ', (short) 10, (short) 1, (byte) 1 };
        int[] intArray8 = ds.MaxMin2.maxMin2(intArray6, (int) (byte) 0);
        int[] intArray10 = ds.MaxMin2.maxMin2(intArray6, (int) (short) 1);
        int[] intArray12 = ds.MaxMin2.maxMin2(intArray10, (-1));
        int[] intArray14 = ds.MaxMin2.maxMin2(intArray10, (int) (byte) 0);
        int[] intArray16 = ds.MaxMin2.maxMin2(intArray10, 1);
        int[] intArray18 = ds.MaxMin2.maxMin2(intArray16, (int) (short) 0);
        int[] intArray20 = ds.MaxMin2.maxMin2(intArray16, 0);
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[-1, 1, 32, 10, 1, 1]");
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray16), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray18), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray20), "[-1, -1]");
    }

    @Test
    public void test570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test570");
        int[] intArray4 = new int[] { (byte) 0, 10, '#', (short) 0 };
        int[] intArray6 = ds.MaxMin2.maxMin2(intArray4, (int) (short) 1);
        int[] intArray8 = ds.MaxMin2.maxMin2(intArray4, (int) (short) 1);
        int[] intArray10 = ds.MaxMin2.maxMin2(intArray8, (int) (byte) -1);
        int[] intArray12 = ds.MaxMin2.maxMin2(intArray10, 1);
        int[] intArray14 = ds.MaxMin2.maxMin2(intArray10, 1);
        int[] intArray16 = ds.MaxMin2.maxMin2(intArray10, (-1));
        int[] intArray18 = ds.MaxMin2.maxMin2(intArray16, (int) (byte) 0);
        int[] intArray20 = ds.MaxMin2.maxMin2(intArray16, (int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray22 = ds.MaxMin2.maxMin2(intArray20, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 2");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[0, 10, 35, 0]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray16), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray18), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray20), "[0, 0]");
    }

    @Test
    public void test571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test571");
        int[] intArray6 = new int[] { (byte) -1, (byte) 1, ' ', (short) 10, (short) 1, (byte) 1 };
        int[] intArray8 = ds.MaxMin2.maxMin2(intArray6, (int) (byte) 0);
        int[] intArray10 = ds.MaxMin2.maxMin2(intArray6, (int) (short) 1);
        int[] intArray12 = ds.MaxMin2.maxMin2(intArray10, (-1));
        int[] intArray14 = ds.MaxMin2.maxMin2(intArray12, (int) (short) -1);
        int[] intArray16 = ds.MaxMin2.maxMin2(intArray14, (-1));
        int[] intArray18 = ds.MaxMin2.maxMin2(intArray16, (int) (short) 1);
        int[] intArray20 = ds.MaxMin2.maxMin2(intArray16, (int) (short) 0);
        int[] intArray22 = ds.MaxMin2.maxMin2(intArray20, (int) (byte) 0);
        int[] intArray24 = ds.MaxMin2.maxMin2(intArray20, 0);
        int[] intArray26 = ds.MaxMin2.maxMin2(intArray20, (-1));
        java.lang.Class<?> wildcardClass27 = intArray20.getClass();
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[-1, 1, 32, 10, 1, 1]");
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray16), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray18), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray20), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray22), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray24), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray26), "[-1, -1]");
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test572");
        int[] intArray4 = new int[] { (byte) 0, 10, '#', (short) 0 };
        int[] intArray6 = ds.MaxMin2.maxMin2(intArray4, (int) (short) 1);
        int[] intArray8 = ds.MaxMin2.maxMin2(intArray4, (int) (byte) -1);
        int[] intArray10 = ds.MaxMin2.maxMin2(intArray8, (int) (short) -1);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray12 = ds.MaxMin2.maxMin2(intArray8, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 2");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[0, 10, 35, 0]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[0, 0]");
    }

    @Test
    public void test573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test573");
        int[] intArray6 = new int[] { (byte) -1, (byte) 1, ' ', (short) 10, (short) 1, (byte) 1 };
        int[] intArray8 = ds.MaxMin2.maxMin2(intArray6, (int) (byte) 0);
        int[] intArray10 = ds.MaxMin2.maxMin2(intArray6, (int) (short) 1);
        int[] intArray12 = ds.MaxMin2.maxMin2(intArray10, (-1));
        int[] intArray14 = ds.MaxMin2.maxMin2(intArray10, (int) (byte) 0);
        int[] intArray16 = ds.MaxMin2.maxMin2(intArray10, 1);
        int[] intArray18 = ds.MaxMin2.maxMin2(intArray16, 0);
        int[] intArray20 = ds.MaxMin2.maxMin2(intArray16, 1);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray22 = ds.MaxMin2.maxMin2(intArray20, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 2");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[-1, 1, 32, 10, 1, 1]");
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray16), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray18), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray20), "[-1, -1]");
    }

    @Test
    public void test574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test574");
        int[] intArray6 = new int[] { (byte) -1, (byte) 1, ' ', (short) 10, (short) 1, (byte) 1 };
        int[] intArray8 = ds.MaxMin2.maxMin2(intArray6, (int) (byte) 0);
        int[] intArray10 = ds.MaxMin2.maxMin2(intArray6, (int) (short) 1);
        int[] intArray12 = ds.MaxMin2.maxMin2(intArray10, (-1));
        int[] intArray14 = ds.MaxMin2.maxMin2(intArray10, (int) (byte) 0);
        int[] intArray16 = ds.MaxMin2.maxMin2(intArray10, 1);
        int[] intArray18 = ds.MaxMin2.maxMin2(intArray16, 0);
        int[] intArray20 = ds.MaxMin2.maxMin2(intArray16, 1);
        int[] intArray22 = ds.MaxMin2.maxMin2(intArray16, (int) (short) 0);
        java.lang.Class<?> wildcardClass23 = intArray22.getClass();
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[-1, 1, 32, 10, 1, 1]");
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray16), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray18), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray20), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray22), "[-1, -1]");
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test575");
        int[] intArray4 = new int[] { (byte) 0, 10, '#', (short) 0 };
        int[] intArray6 = ds.MaxMin2.maxMin2(intArray4, (int) (short) 1);
        int[] intArray8 = ds.MaxMin2.maxMin2(intArray6, 0);
        int[] intArray10 = ds.MaxMin2.maxMin2(intArray8, 0);
        int[] intArray12 = ds.MaxMin2.maxMin2(intArray8, 0);
        int[] intArray14 = ds.MaxMin2.maxMin2(intArray12, 0);
        int[] intArray16 = ds.MaxMin2.maxMin2(intArray14, (-1));
        int[] intArray18 = ds.MaxMin2.maxMin2(intArray16, (int) (byte) 1);
        int[] intArray20 = ds.MaxMin2.maxMin2(intArray16, (int) (byte) 0);
        int[] intArray22 = ds.MaxMin2.maxMin2(intArray20, (int) (byte) 1);
        java.lang.Class<?> wildcardClass23 = intArray22.getClass();
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[0, 10, 35, 0]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray16), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray18), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray20), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray22), "[0, 0]");
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test576");
        int[] intArray6 = new int[] { (byte) -1, (byte) 1, ' ', (short) 10, (short) 1, (byte) 1 };
        int[] intArray8 = ds.MaxMin2.maxMin2(intArray6, (int) (byte) 0);
        int[] intArray10 = ds.MaxMin2.maxMin2(intArray6, (int) (short) 1);
        int[] intArray12 = ds.MaxMin2.maxMin2(intArray10, (-1));
        int[] intArray14 = ds.MaxMin2.maxMin2(intArray12, (int) (short) -1);
        int[] intArray16 = ds.MaxMin2.maxMin2(intArray14, (-1));
        int[] intArray18 = ds.MaxMin2.maxMin2(intArray16, (int) (short) 1);
        int[] intArray20 = ds.MaxMin2.maxMin2(intArray16, (int) (short) 0);
        int[] intArray22 = ds.MaxMin2.maxMin2(intArray20, (int) (byte) 0);
        int[] intArray24 = ds.MaxMin2.maxMin2(intArray20, 0);
        java.lang.Class<?> wildcardClass25 = intArray20.getClass();
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[-1, 1, 32, 10, 1, 1]");
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray16), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray18), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray20), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray22), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray24), "[-1, -1]");
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test577");
        int[] intArray4 = new int[] { (byte) 0, 10, '#', (short) 0 };
        int[] intArray6 = ds.MaxMin2.maxMin2(intArray4, (int) (short) 1);
        int[] intArray8 = ds.MaxMin2.maxMin2(intArray4, (int) (byte) -1);
        int[] intArray10 = ds.MaxMin2.maxMin2(intArray8, (int) (short) 0);
        java.lang.Class<?> wildcardClass11 = intArray10.getClass();
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[0, 10, 35, 0]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[0, 0]");
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test578");
        int[] intArray4 = new int[] { (byte) 0, 10, '#', (short) 0 };
        int[] intArray6 = ds.MaxMin2.maxMin2(intArray4, (int) (short) 1);
        int[] intArray8 = ds.MaxMin2.maxMin2(intArray6, 0);
        int[] intArray10 = ds.MaxMin2.maxMin2(intArray8, 0);
        int[] intArray12 = ds.MaxMin2.maxMin2(intArray8, 0);
        int[] intArray14 = ds.MaxMin2.maxMin2(intArray12, 0);
        int[] intArray16 = ds.MaxMin2.maxMin2(intArray12, 0);
        int[] intArray18 = ds.MaxMin2.maxMin2(intArray16, 1);
        int[] intArray20 = ds.MaxMin2.maxMin2(intArray16, (int) (byte) 0);
        java.lang.Class<?> wildcardClass21 = intArray16.getClass();
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[0, 10, 35, 0]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray16), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray18), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray20), "[0, 0]");
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test579");
        int[] intArray6 = new int[] { (byte) -1, (byte) 1, ' ', (short) 10, (short) 1, (byte) 1 };
        int[] intArray8 = ds.MaxMin2.maxMin2(intArray6, (int) (byte) 0);
        int[] intArray10 = ds.MaxMin2.maxMin2(intArray6, (int) (byte) 1);
        int[] intArray12 = ds.MaxMin2.maxMin2(intArray6, (int) (byte) -1);
        int[] intArray14 = ds.MaxMin2.maxMin2(intArray12, 1);
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[-1, 1, 32, 10, 1, 1]");
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[-1, -1]");
    }

    @Test
    public void test580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test580");
        int[] intArray4 = new int[] { (byte) 0, 10, '#', (short) 0 };
        int[] intArray6 = ds.MaxMin2.maxMin2(intArray4, (int) (short) 1);
        int[] intArray8 = ds.MaxMin2.maxMin2(intArray6, 0);
        int[] intArray10 = ds.MaxMin2.maxMin2(intArray8, 0);
        int[] intArray12 = ds.MaxMin2.maxMin2(intArray8, 0);
        int[] intArray14 = ds.MaxMin2.maxMin2(intArray12, (int) (byte) 0);
        int[] intArray16 = ds.MaxMin2.maxMin2(intArray12, (int) (short) 1);
        int[] intArray18 = ds.MaxMin2.maxMin2(intArray16, (int) (byte) 0);
        int[] intArray20 = ds.MaxMin2.maxMin2(intArray18, (int) (byte) 1);
        int[] intArray22 = ds.MaxMin2.maxMin2(intArray18, (int) (short) -1);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray24 = ds.MaxMin2.maxMin2(intArray22, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 2");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[0, 10, 35, 0]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray16), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray18), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray20), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray22), "[0, 0]");
    }

    @Test
    public void test581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test581");
        int[] intArray4 = new int[] { (byte) 0, 10, '#', (short) 0 };
        int[] intArray6 = ds.MaxMin2.maxMin2(intArray4, (int) (short) 1);
        int[] intArray8 = ds.MaxMin2.maxMin2(intArray4, (int) (short) 1);
        int[] intArray10 = ds.MaxMin2.maxMin2(intArray8, (int) (byte) -1);
        int[] intArray12 = ds.MaxMin2.maxMin2(intArray10, 1);
        int[] intArray14 = ds.MaxMin2.maxMin2(intArray10, 1);
        int[] intArray16 = ds.MaxMin2.maxMin2(intArray14, 0);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray18 = ds.MaxMin2.maxMin2(intArray16, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 2");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[0, 10, 35, 0]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray16), "[0, 0]");
    }

    @Test
    public void test582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test582");
        int[] intArray4 = new int[] { (byte) 0, 10, '#', (short) 0 };
        int[] intArray6 = ds.MaxMin2.maxMin2(intArray4, (int) (short) 1);
        int[] intArray8 = ds.MaxMin2.maxMin2(intArray6, 0);
        int[] intArray10 = ds.MaxMin2.maxMin2(intArray8, (int) (byte) -1);
        int[] intArray12 = ds.MaxMin2.maxMin2(intArray10, 0);
        int[] intArray14 = ds.MaxMin2.maxMin2(intArray10, (int) (byte) 1);
        int[] intArray16 = ds.MaxMin2.maxMin2(intArray14, 1);
        int[] intArray18 = ds.MaxMin2.maxMin2(intArray14, (int) (short) 0);
        int[] intArray20 = ds.MaxMin2.maxMin2(intArray18, (-1));
        java.lang.Class<?> wildcardClass21 = intArray18.getClass();
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[0, 10, 35, 0]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray16), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray18), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray20), "[0, 0]");
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test583");
        int[] intArray4 = new int[] { (byte) 0, 10, '#', (short) 0 };
        int[] intArray6 = ds.MaxMin2.maxMin2(intArray4, (int) (short) 1);
        int[] intArray8 = ds.MaxMin2.maxMin2(intArray6, 0);
        int[] intArray10 = ds.MaxMin2.maxMin2(intArray8, (int) (byte) -1);
        int[] intArray12 = ds.MaxMin2.maxMin2(intArray10, 0);
        int[] intArray14 = ds.MaxMin2.maxMin2(intArray12, 0);
        int[] intArray16 = ds.MaxMin2.maxMin2(intArray14, (int) (short) 1);
        int[] intArray18 = ds.MaxMin2.maxMin2(intArray14, 0);
        int[] intArray20 = ds.MaxMin2.maxMin2(intArray14, (int) (byte) 0);
        int[] intArray22 = ds.MaxMin2.maxMin2(intArray20, 1);
        int[] intArray24 = ds.MaxMin2.maxMin2(intArray20, (int) (byte) 0);
        int[] intArray26 = ds.MaxMin2.maxMin2(intArray24, 1);
        java.lang.Class<?> wildcardClass27 = intArray24.getClass();
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[0, 10, 35, 0]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray16), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray18), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray20), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray22), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray24), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray26), "[0, 0]");
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test584");
        int[] intArray6 = new int[] { (byte) -1, (byte) 1, ' ', (short) 10, (short) 1, (byte) 1 };
        int[] intArray8 = ds.MaxMin2.maxMin2(intArray6, (int) (byte) 0);
        int[] intArray10 = ds.MaxMin2.maxMin2(intArray6, (int) (short) 1);
        int[] intArray12 = ds.MaxMin2.maxMin2(intArray10, (-1));
        int[] intArray14 = ds.MaxMin2.maxMin2(intArray10, (int) (byte) 0);
        int[] intArray16 = ds.MaxMin2.maxMin2(intArray10, 1);
        int[] intArray18 = ds.MaxMin2.maxMin2(intArray16, 0);
        int[] intArray20 = ds.MaxMin2.maxMin2(intArray16, 1);
        int[] intArray22 = ds.MaxMin2.maxMin2(intArray16, (int) (short) 0);
        int[] intArray24 = ds.MaxMin2.maxMin2(intArray16, (int) (byte) 0);
        java.lang.Class<?> wildcardClass25 = intArray16.getClass();
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[-1, 1, 32, 10, 1, 1]");
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray16), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray18), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray20), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray22), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray24), "[-1, -1]");
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test585");
        int[] intArray4 = new int[] { (byte) 0, 10, '#', (short) 0 };
        int[] intArray6 = ds.MaxMin2.maxMin2(intArray4, (int) (short) 1);
        int[] intArray8 = ds.MaxMin2.maxMin2(intArray6, 0);
        int[] intArray10 = ds.MaxMin2.maxMin2(intArray8, (int) (byte) -1);
        int[] intArray12 = ds.MaxMin2.maxMin2(intArray10, 0);
        int[] intArray14 = ds.MaxMin2.maxMin2(intArray12, 0);
        int[] intArray16 = ds.MaxMin2.maxMin2(intArray14, (int) (short) 1);
        int[] intArray18 = ds.MaxMin2.maxMin2(intArray14, 0);
        int[] intArray20 = ds.MaxMin2.maxMin2(intArray14, (int) (byte) 0);
        int[] intArray22 = ds.MaxMin2.maxMin2(intArray14, (int) (byte) 0);
        int[] intArray24 = ds.MaxMin2.maxMin2(intArray22, (-1));
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray26 = ds.MaxMin2.maxMin2(intArray22, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 2");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[0, 10, 35, 0]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray16), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray18), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray20), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray22), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray24), "[0, 0]");
    }

    @Test
    public void test586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test586");
        int[] intArray4 = new int[] { (byte) 0, 10, '#', (short) 0 };
        int[] intArray6 = ds.MaxMin2.maxMin2(intArray4, (int) (short) 1);
        int[] intArray8 = ds.MaxMin2.maxMin2(intArray6, 0);
        int[] intArray10 = ds.MaxMin2.maxMin2(intArray8, (int) (byte) -1);
        int[] intArray12 = ds.MaxMin2.maxMin2(intArray10, 0);
        int[] intArray14 = ds.MaxMin2.maxMin2(intArray10, (int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray16 = ds.MaxMin2.maxMin2(intArray10, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 2");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[0, 10, 35, 0]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[0, 0]");
    }

    @Test
    public void test587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test587");
        int[] intArray4 = new int[] { (byte) 0, 10, '#', (short) 0 };
        int[] intArray6 = ds.MaxMin2.maxMin2(intArray4, (int) (short) 1);
        int[] intArray8 = ds.MaxMin2.maxMin2(intArray6, 0);
        int[] intArray10 = ds.MaxMin2.maxMin2(intArray8, (int) (byte) -1);
        int[] intArray12 = ds.MaxMin2.maxMin2(intArray10, 0);
        int[] intArray14 = ds.MaxMin2.maxMin2(intArray12, 0);
        int[] intArray16 = ds.MaxMin2.maxMin2(intArray14, (int) (short) 1);
        int[] intArray18 = ds.MaxMin2.maxMin2(intArray14, 0);
        int[] intArray20 = ds.MaxMin2.maxMin2(intArray14, (int) (byte) 0);
        int[] intArray22 = ds.MaxMin2.maxMin2(intArray14, 0);
        java.lang.Class<?> wildcardClass23 = intArray14.getClass();
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[0, 10, 35, 0]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray16), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray18), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray20), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray22), "[0, 0]");
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test588");
        int[] intArray6 = new int[] { (byte) -1, (byte) 1, ' ', (short) 10, (short) 1, (byte) 1 };
        int[] intArray8 = ds.MaxMin2.maxMin2(intArray6, (int) (byte) 0);
        int[] intArray10 = ds.MaxMin2.maxMin2(intArray6, (int) (short) 1);
        int[] intArray12 = ds.MaxMin2.maxMin2(intArray10, (-1));
        int[] intArray14 = ds.MaxMin2.maxMin2(intArray10, (int) (byte) 0);
        int[] intArray16 = ds.MaxMin2.maxMin2(intArray10, 1);
        int[] intArray18 = ds.MaxMin2.maxMin2(intArray16, 0);
        int[] intArray20 = ds.MaxMin2.maxMin2(intArray16, 1);
        int[] intArray22 = ds.MaxMin2.maxMin2(intArray16, (int) (short) 0);
        int[] intArray24 = ds.MaxMin2.maxMin2(intArray16, 0);
        int[] intArray26 = ds.MaxMin2.maxMin2(intArray24, (-1));
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray28 = ds.MaxMin2.maxMin2(intArray26, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 2");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[-1, 1, 32, 10, 1, 1]");
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray16), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray18), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray20), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray22), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray24), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray26), "[-1, -1]");
    }

    @Test
    public void test589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test589");
        int[] intArray0 = null;
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray2 = ds.MaxMin2.maxMin2(intArray0, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test590");
        int[] intArray6 = new int[] { (byte) -1, (byte) 1, ' ', (short) 10, (short) 1, (byte) 1 };
        int[] intArray8 = ds.MaxMin2.maxMin2(intArray6, (int) (byte) 0);
        int[] intArray10 = ds.MaxMin2.maxMin2(intArray6, (int) (short) 1);
        int[] intArray12 = ds.MaxMin2.maxMin2(intArray10, (-1));
        int[] intArray14 = ds.MaxMin2.maxMin2(intArray12, (int) (short) -1);
        int[] intArray16 = ds.MaxMin2.maxMin2(intArray14, (-1));
        int[] intArray18 = ds.MaxMin2.maxMin2(intArray14, 0);
        int[] intArray20 = ds.MaxMin2.maxMin2(intArray14, 1);
        int[] intArray22 = ds.MaxMin2.maxMin2(intArray20, 0);
        java.lang.Class<?> wildcardClass23 = intArray20.getClass();
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[-1, 1, 32, 10, 1, 1]");
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray16), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray18), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray20), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray22), "[-1, -1]");
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test591");
        int[] intArray4 = new int[] { (byte) 0, 10, '#', (short) 0 };
        int[] intArray6 = ds.MaxMin2.maxMin2(intArray4, (int) (short) 1);
        int[] intArray8 = ds.MaxMin2.maxMin2(intArray6, 0);
        int[] intArray10 = ds.MaxMin2.maxMin2(intArray8, (int) (byte) -1);
        int[] intArray12 = ds.MaxMin2.maxMin2(intArray10, 0);
        int[] intArray14 = ds.MaxMin2.maxMin2(intArray12, (int) (short) 0);
        int[] intArray16 = ds.MaxMin2.maxMin2(intArray14, (int) (short) 0);
        int[] intArray18 = ds.MaxMin2.maxMin2(intArray16, (int) (byte) -1);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray20 = ds.MaxMin2.maxMin2(intArray18, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 2");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[0, 10, 35, 0]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray16), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray18), "[0, 0]");
    }

    @Test
    public void test592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test592");
        int[] intArray6 = new int[] { (byte) -1, (byte) 1, ' ', (short) 10, (short) 1, (byte) 1 };
        int[] intArray8 = ds.MaxMin2.maxMin2(intArray6, (int) (byte) 0);
        int[] intArray10 = ds.MaxMin2.maxMin2(intArray6, (int) (byte) 0);
        int[] intArray12 = ds.MaxMin2.maxMin2(intArray10, (int) (short) -1);
        int[] intArray14 = ds.MaxMin2.maxMin2(intArray10, (int) (byte) -1);
        int[] intArray16 = ds.MaxMin2.maxMin2(intArray10, (int) (short) 0);
        int[] intArray18 = ds.MaxMin2.maxMin2(intArray16, (int) (byte) 1);
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[-1, 1, 32, 10, 1, 1]");
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray16), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray18), "[-1, -1]");
    }

    @Test
    public void test593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test593");
        int[] intArray6 = new int[] { (byte) -1, (byte) 1, ' ', (short) 10, (short) 1, (byte) 1 };
        int[] intArray8 = ds.MaxMin2.maxMin2(intArray6, (int) (byte) 0);
        int[] intArray10 = ds.MaxMin2.maxMin2(intArray6, (int) (byte) 0);
        int[] intArray12 = ds.MaxMin2.maxMin2(intArray10, (int) (short) 0);
        int[] intArray14 = ds.MaxMin2.maxMin2(intArray12, (int) (short) 1);
        int[] intArray16 = ds.MaxMin2.maxMin2(intArray12, 0);
        java.lang.Class<?> wildcardClass17 = intArray12.getClass();
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[-1, 1, 32, 10, 1, 1]");
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray16), "[-1, -1]");
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test594");
        int[] intArray6 = new int[] { (byte) -1, (byte) 1, ' ', (short) 10, (short) 1, (byte) 1 };
        int[] intArray8 = ds.MaxMin2.maxMin2(intArray6, (int) (byte) 0);
        int[] intArray10 = ds.MaxMin2.maxMin2(intArray6, (int) (byte) 0);
        int[] intArray12 = ds.MaxMin2.maxMin2(intArray10, (int) (short) -1);
        int[] intArray14 = ds.MaxMin2.maxMin2(intArray10, (int) (byte) -1);
        int[] intArray16 = ds.MaxMin2.maxMin2(intArray10, (int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray18 = ds.MaxMin2.maxMin2(intArray10, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 2");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[-1, 1, 32, 10, 1, 1]");
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray16), "[-1, -1]");
    }

    @Test
    public void test595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test595");
        int[] intArray6 = new int[] { (byte) -1, (byte) 1, ' ', (short) 10, (short) 1, (byte) 1 };
        int[] intArray8 = ds.MaxMin2.maxMin2(intArray6, (int) (byte) 0);
        int[] intArray10 = ds.MaxMin2.maxMin2(intArray6, (int) (short) 1);
        int[] intArray12 = ds.MaxMin2.maxMin2(intArray10, (-1));
        int[] intArray14 = ds.MaxMin2.maxMin2(intArray12, (int) (short) -1);
        int[] intArray16 = ds.MaxMin2.maxMin2(intArray14, (-1));
        int[] intArray18 = ds.MaxMin2.maxMin2(intArray16, (int) (short) 1);
        int[] intArray20 = ds.MaxMin2.maxMin2(intArray18, (-1));
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray22 = ds.MaxMin2.maxMin2(intArray18, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 2");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[-1, 1, 32, 10, 1, 1]");
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray16), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray18), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray20), "[-1, -1]");
    }

    @Test
    public void test596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test596");
        int[] intArray4 = new int[] { (byte) 0, 10, '#', (short) 0 };
        int[] intArray6 = ds.MaxMin2.maxMin2(intArray4, (int) (short) 1);
        int[] intArray8 = ds.MaxMin2.maxMin2(intArray6, 0);
        int[] intArray10 = ds.MaxMin2.maxMin2(intArray8, (int) (byte) -1);
        int[] intArray12 = ds.MaxMin2.maxMin2(intArray10, 0);
        int[] intArray14 = ds.MaxMin2.maxMin2(intArray12, 0);
        int[] intArray16 = ds.MaxMin2.maxMin2(intArray14, (-1));
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray18 = ds.MaxMin2.maxMin2(intArray14, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 2");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[0, 10, 35, 0]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray16), "[0, 0]");
    }

    @Test
    public void test597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test597");
        int[] intArray4 = new int[] { (byte) 0, 10, '#', (short) 0 };
        int[] intArray6 = ds.MaxMin2.maxMin2(intArray4, (int) (short) 1);
        int[] intArray8 = ds.MaxMin2.maxMin2(intArray6, 0);
        int[] intArray10 = ds.MaxMin2.maxMin2(intArray8, 0);
        int[] intArray12 = ds.MaxMin2.maxMin2(intArray8, 0);
        int[] intArray14 = ds.MaxMin2.maxMin2(intArray12, (int) (byte) 0);
        int[] intArray16 = ds.MaxMin2.maxMin2(intArray12, (int) (short) 1);
        int[] intArray18 = ds.MaxMin2.maxMin2(intArray16, (int) (byte) 0);
        int[] intArray20 = ds.MaxMin2.maxMin2(intArray18, (int) (byte) 1);
        java.lang.Class<?> wildcardClass21 = intArray20.getClass();
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[0, 10, 35, 0]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray16), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray18), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray20), "[0, 0]");
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test598");
        int[] intArray4 = new int[] { (byte) 0, 10, '#', (short) 0 };
        int[] intArray6 = ds.MaxMin2.maxMin2(intArray4, (int) (short) 1);
        int[] intArray8 = ds.MaxMin2.maxMin2(intArray6, 0);
        int[] intArray10 = ds.MaxMin2.maxMin2(intArray8, (int) (byte) -1);
        int[] intArray12 = ds.MaxMin2.maxMin2(intArray10, 0);
        int[] intArray14 = ds.MaxMin2.maxMin2(intArray12, (int) (short) 0);
        int[] intArray16 = ds.MaxMin2.maxMin2(intArray14, (int) (short) -1);
        int[] intArray18 = ds.MaxMin2.maxMin2(intArray14, (int) (short) 0);
        int[] intArray20 = ds.MaxMin2.maxMin2(intArray14, (int) (short) 1);
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[0, 10, 35, 0]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray16), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray18), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray20), "[0, 0]");
    }

    @Test
    public void test599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test599");
        int[] intArray4 = new int[] { (byte) 0, 10, '#', (short) 0 };
        int[] intArray6 = ds.MaxMin2.maxMin2(intArray4, (int) (short) 1);
        int[] intArray8 = ds.MaxMin2.maxMin2(intArray6, 0);
        int[] intArray10 = ds.MaxMin2.maxMin2(intArray8, (int) (byte) -1);
        int[] intArray12 = ds.MaxMin2.maxMin2(intArray10, 0);
        int[] intArray14 = ds.MaxMin2.maxMin2(intArray12, 0);
        int[] intArray16 = ds.MaxMin2.maxMin2(intArray14, (int) (short) 1);
        int[] intArray18 = ds.MaxMin2.maxMin2(intArray14, 0);
        int[] intArray20 = ds.MaxMin2.maxMin2(intArray14, (int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray22 = ds.MaxMin2.maxMin2(intArray14, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 2");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[0, 10, 35, 0]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray16), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray18), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray20), "[0, 0]");
    }

    @Test
    public void test600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test600");
        int[] intArray6 = new int[] { (byte) -1, (byte) 1, ' ', (short) 10, (short) 1, (byte) 1 };
        int[] intArray8 = ds.MaxMin2.maxMin2(intArray6, (int) (byte) 0);
        int[] intArray10 = ds.MaxMin2.maxMin2(intArray6, (int) (short) 1);
        int[] intArray12 = ds.MaxMin2.maxMin2(intArray10, (-1));
        int[] intArray14 = ds.MaxMin2.maxMin2(intArray12, (int) (short) -1);
        int[] intArray16 = ds.MaxMin2.maxMin2(intArray14, (-1));
        int[] intArray18 = ds.MaxMin2.maxMin2(intArray14, 0);
        int[] intArray20 = ds.MaxMin2.maxMin2(intArray14, 1);
        int[] intArray22 = ds.MaxMin2.maxMin2(intArray20, 0);
        int[] intArray24 = ds.MaxMin2.maxMin2(intArray22, (int) (short) 0);
        java.lang.Class<?> wildcardClass25 = intArray24.getClass();
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[-1, 1, 32, 10, 1, 1]");
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray16), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray18), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray20), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray22), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray24), "[-1, -1]");
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test601");
        int[] intArray4 = new int[] { (byte) 0, 10, '#', (short) 0 };
        int[] intArray6 = ds.MaxMin2.maxMin2(intArray4, (int) (short) 1);
        int[] intArray8 = ds.MaxMin2.maxMin2(intArray6, 0);
        int[] intArray10 = ds.MaxMin2.maxMin2(intArray8, (int) (byte) -1);
        int[] intArray12 = ds.MaxMin2.maxMin2(intArray10, 0);
        int[] intArray14 = ds.MaxMin2.maxMin2(intArray12, 0);
        int[] intArray16 = ds.MaxMin2.maxMin2(intArray14, (int) (short) 1);
        int[] intArray18 = ds.MaxMin2.maxMin2(intArray14, 0);
        int[] intArray20 = ds.MaxMin2.maxMin2(intArray18, (int) (byte) 0);
        int[] intArray22 = ds.MaxMin2.maxMin2(intArray20, (int) (byte) 0);
        java.lang.Class<?> wildcardClass23 = intArray20.getClass();
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[0, 10, 35, 0]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray16), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray18), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray20), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray22), "[0, 0]");
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test602");
        int[] intArray4 = new int[] { (byte) 0, 10, '#', (short) 0 };
        int[] intArray6 = ds.MaxMin2.maxMin2(intArray4, (int) (short) 1);
        int[] intArray8 = ds.MaxMin2.maxMin2(intArray4, (int) (short) 1);
        int[] intArray10 = ds.MaxMin2.maxMin2(intArray8, (int) (byte) -1);
        int[] intArray12 = ds.MaxMin2.maxMin2(intArray10, 1);
        int[] intArray14 = ds.MaxMin2.maxMin2(intArray10, 1);
        int[] intArray16 = ds.MaxMin2.maxMin2(intArray10, (int) (short) -1);
        int[] intArray18 = ds.MaxMin2.maxMin2(intArray16, (int) (short) 0);
        int[] intArray20 = ds.MaxMin2.maxMin2(intArray18, 0);
        java.lang.Class<?> wildcardClass21 = intArray18.getClass();
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[0, 10, 35, 0]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray16), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray18), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray20), "[0, 0]");
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test603");
        int[] intArray4 = new int[] { (byte) 0, 10, '#', (short) 0 };
        int[] intArray6 = ds.MaxMin2.maxMin2(intArray4, (int) (short) 1);
        int[] intArray8 = ds.MaxMin2.maxMin2(intArray4, (int) (short) 0);
        int[] intArray10 = ds.MaxMin2.maxMin2(intArray4, (int) (byte) -1);
        int[] intArray12 = ds.MaxMin2.maxMin2(intArray4, (int) (short) 1);
        java.lang.Class<?> wildcardClass13 = intArray4.getClass();
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[0, 10, 35, 0]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[0, 0]");
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test604");
        int[] intArray4 = new int[] { (byte) 0, 10, '#', (short) 0 };
        int[] intArray6 = ds.MaxMin2.maxMin2(intArray4, (int) (short) 1);
        int[] intArray8 = ds.MaxMin2.maxMin2(intArray6, 0);
        int[] intArray10 = ds.MaxMin2.maxMin2(intArray8, (int) (byte) -1);
        int[] intArray12 = ds.MaxMin2.maxMin2(intArray10, 0);
        int[] intArray14 = ds.MaxMin2.maxMin2(intArray12, (int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray16 = ds.MaxMin2.maxMin2(intArray14, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 2");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[0, 10, 35, 0]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[0, 0]");
    }

    @Test
    public void test605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test605");
        int[] intArray6 = new int[] { (byte) -1, (byte) 1, ' ', (short) 10, (short) 1, (byte) 1 };
        int[] intArray8 = ds.MaxMin2.maxMin2(intArray6, (int) (byte) 0);
        int[] intArray10 = ds.MaxMin2.maxMin2(intArray6, (int) (byte) 1);
        int[] intArray12 = ds.MaxMin2.maxMin2(intArray10, (int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray14 = ds.MaxMin2.maxMin2(intArray12, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 2");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[-1, 1, 32, 10, 1, 1]");
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[-1, -1]");
    }

    @Test
    public void test606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test606");
        int[] intArray4 = new int[] { (byte) 0, 10, '#', (short) 0 };
        int[] intArray6 = ds.MaxMin2.maxMin2(intArray4, (int) (short) 1);
        int[] intArray8 = ds.MaxMin2.maxMin2(intArray4, (int) (short) 1);
        int[] intArray10 = ds.MaxMin2.maxMin2(intArray4, (-1));
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray12 = ds.MaxMin2.maxMin2(intArray10, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 2");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[0, 10, 35, 0]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[0, 0]");
    }

    @Test
    public void test607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test607");
        int[] intArray6 = new int[] { (byte) -1, (byte) 1, ' ', (short) 10, (short) 1, (byte) 1 };
        int[] intArray8 = ds.MaxMin2.maxMin2(intArray6, (int) (byte) 0);
        int[] intArray10 = ds.MaxMin2.maxMin2(intArray6, (int) (byte) 1);
        int[] intArray12 = ds.MaxMin2.maxMin2(intArray10, (int) (byte) 1);
        int[] intArray14 = ds.MaxMin2.maxMin2(intArray12, (int) (byte) -1);
        int[] intArray16 = ds.MaxMin2.maxMin2(intArray12, (int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray18 = ds.MaxMin2.maxMin2(intArray12, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 2");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[-1, 1, 32, 10, 1, 1]");
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray16), "[-1, -1]");
    }

    @Test
    public void test608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test608");
        int[] intArray4 = new int[] { (byte) 0, 10, '#', (short) 0 };
        int[] intArray6 = ds.MaxMin2.maxMin2(intArray4, (int) (short) 1);
        int[] intArray8 = ds.MaxMin2.maxMin2(intArray6, 0);
        int[] intArray10 = ds.MaxMin2.maxMin2(intArray8, (int) (byte) -1);
        int[] intArray12 = ds.MaxMin2.maxMin2(intArray10, 0);
        int[] intArray14 = ds.MaxMin2.maxMin2(intArray12, 0);
        int[] intArray16 = ds.MaxMin2.maxMin2(intArray14, (int) (short) 1);
        int[] intArray18 = ds.MaxMin2.maxMin2(intArray14, 0);
        int[] intArray20 = ds.MaxMin2.maxMin2(intArray14, (int) (byte) 0);
        int[] intArray22 = ds.MaxMin2.maxMin2(intArray20, 0);
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[0, 10, 35, 0]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray16), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray18), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray20), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray22), "[0, 0]");
    }

    @Test
    public void test609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test609");
        int[] intArray4 = new int[] { (byte) 0, 10, '#', (short) 0 };
        int[] intArray6 = ds.MaxMin2.maxMin2(intArray4, (int) (short) 1);
        int[] intArray8 = ds.MaxMin2.maxMin2(intArray6, 0);
        int[] intArray10 = ds.MaxMin2.maxMin2(intArray8, (int) (byte) -1);
        int[] intArray12 = ds.MaxMin2.maxMin2(intArray10, 0);
        int[] intArray14 = ds.MaxMin2.maxMin2(intArray10, (int) (byte) 1);
        int[] intArray16 = ds.MaxMin2.maxMin2(intArray14, 1);
        int[] intArray18 = ds.MaxMin2.maxMin2(intArray14, (int) (short) 0);
        int[] intArray20 = ds.MaxMin2.maxMin2(intArray18, (-1));
        int[] intArray22 = ds.MaxMin2.maxMin2(intArray18, (int) (byte) 0);
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[0, 10, 35, 0]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray16), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray18), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray20), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray22), "[0, 0]");
    }

    @Test
    public void test610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test610");
        int[] intArray4 = new int[] { (byte) 0, 10, '#', (short) 0 };
        int[] intArray6 = ds.MaxMin2.maxMin2(intArray4, (int) (short) 1);
        int[] intArray8 = ds.MaxMin2.maxMin2(intArray6, 0);
        int[] intArray10 = ds.MaxMin2.maxMin2(intArray8, (int) (byte) -1);
        int[] intArray12 = ds.MaxMin2.maxMin2(intArray10, 0);
        int[] intArray14 = ds.MaxMin2.maxMin2(intArray12, 0);
        int[] intArray16 = ds.MaxMin2.maxMin2(intArray14, (int) (short) 1);
        int[] intArray18 = ds.MaxMin2.maxMin2(intArray14, 0);
        int[] intArray20 = ds.MaxMin2.maxMin2(intArray14, (int) (byte) 0);
        int[] intArray22 = ds.MaxMin2.maxMin2(intArray14, (int) (byte) 0);
        java.lang.Class<?> wildcardClass23 = intArray14.getClass();
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[0, 10, 35, 0]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray16), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray18), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray20), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray22), "[0, 0]");
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test611");
        int[] intArray6 = new int[] { (byte) -1, (byte) 1, ' ', (short) 10, (short) 1, (byte) 1 };
        int[] intArray8 = ds.MaxMin2.maxMin2(intArray6, (int) (byte) 0);
        int[] intArray10 = ds.MaxMin2.maxMin2(intArray6, (int) (byte) 1);
        int[] intArray12 = ds.MaxMin2.maxMin2(intArray10, (int) (byte) 1);
        int[] intArray14 = ds.MaxMin2.maxMin2(intArray12, (int) (byte) -1);
        int[] intArray16 = ds.MaxMin2.maxMin2(intArray12, (int) (short) 0);
        java.lang.Class<?> wildcardClass17 = intArray12.getClass();
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[-1, 1, 32, 10, 1, 1]");
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray16), "[-1, -1]");
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test612");
        int[] intArray6 = new int[] { (byte) -1, (byte) 1, ' ', (short) 10, (short) 1, (byte) 1 };
        int[] intArray8 = ds.MaxMin2.maxMin2(intArray6, (int) (byte) 0);
        int[] intArray10 = ds.MaxMin2.maxMin2(intArray6, (int) (short) 1);
        int[] intArray12 = ds.MaxMin2.maxMin2(intArray10, (-1));
        int[] intArray14 = ds.MaxMin2.maxMin2(intArray12, (int) (short) -1);
        int[] intArray16 = ds.MaxMin2.maxMin2(intArray12, (int) (short) -1);
        java.lang.Class<?> wildcardClass17 = intArray12.getClass();
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[-1, 1, 32, 10, 1, 1]");
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray16), "[-1, -1]");
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test613() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test613");
        int[] intArray6 = new int[] { (byte) -1, (byte) 1, ' ', (short) 10, (short) 1, (byte) 1 };
        int[] intArray8 = ds.MaxMin2.maxMin2(intArray6, (int) (byte) 0);
        int[] intArray10 = ds.MaxMin2.maxMin2(intArray6, (int) (short) 1);
        int[] intArray12 = ds.MaxMin2.maxMin2(intArray10, (-1));
        int[] intArray14 = ds.MaxMin2.maxMin2(intArray10, (int) (byte) 0);
        int[] intArray16 = ds.MaxMin2.maxMin2(intArray10, 1);
        int[] intArray18 = ds.MaxMin2.maxMin2(intArray16, 0);
        int[] intArray20 = ds.MaxMin2.maxMin2(intArray16, 1);
        int[] intArray22 = ds.MaxMin2.maxMin2(intArray16, (int) (short) 0);
        int[] intArray24 = ds.MaxMin2.maxMin2(intArray16, (int) (byte) 0);
        java.lang.Class<?> wildcardClass25 = intArray24.getClass();
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[-1, 1, 32, 10, 1, 1]");
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray16), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray18), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray20), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray22), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray24), "[-1, -1]");
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test614() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test614");
        int[] intArray6 = new int[] { (byte) -1, (byte) 1, ' ', (short) 10, (short) 1, (byte) 1 };
        int[] intArray8 = ds.MaxMin2.maxMin2(intArray6, (int) (byte) 0);
        int[] intArray10 = ds.MaxMin2.maxMin2(intArray6, (int) (short) 1);
        int[] intArray12 = ds.MaxMin2.maxMin2(intArray10, (-1));
        int[] intArray14 = ds.MaxMin2.maxMin2(intArray12, (int) (short) -1);
        int[] intArray16 = ds.MaxMin2.maxMin2(intArray14, (-1));
        int[] intArray18 = ds.MaxMin2.maxMin2(intArray16, (int) (short) 0);
        int[] intArray20 = ds.MaxMin2.maxMin2(intArray16, (-1));
        java.lang.Class<?> wildcardClass21 = intArray16.getClass();
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[-1, 1, 32, 10, 1, 1]");
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray16), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray18), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray20), "[-1, -1]");
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test615() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test615");
        int[] intArray4 = new int[] { (byte) 0, 10, '#', (short) 0 };
        int[] intArray6 = ds.MaxMin2.maxMin2(intArray4, (int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray8 = ds.MaxMin2.maxMin2(intArray4, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 4");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[0, 10, 35, 0]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[0, 0]");
    }

    @Test
    public void test616() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test616");
        int[] intArray6 = new int[] { (byte) -1, (byte) 1, ' ', (short) 10, (short) 1, (byte) 1 };
        int[] intArray8 = ds.MaxMin2.maxMin2(intArray6, (int) (byte) 0);
        int[] intArray10 = ds.MaxMin2.maxMin2(intArray6, (int) (short) 1);
        int[] intArray12 = ds.MaxMin2.maxMin2(intArray10, (-1));
        int[] intArray14 = ds.MaxMin2.maxMin2(intArray12, (int) (short) -1);
        int[] intArray16 = ds.MaxMin2.maxMin2(intArray14, (-1));
        int[] intArray18 = ds.MaxMin2.maxMin2(intArray16, (int) (short) 1);
        int[] intArray20 = ds.MaxMin2.maxMin2(intArray16, (int) (byte) 1);
        int[] intArray22 = ds.MaxMin2.maxMin2(intArray16, 0);
        int[] intArray24 = ds.MaxMin2.maxMin2(intArray22, 0);
        java.lang.Class<?> wildcardClass25 = intArray22.getClass();
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[-1, 1, 32, 10, 1, 1]");
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray16), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray18), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray20), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray22), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray24), "[-1, -1]");
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test617() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test617");
        int[] intArray6 = new int[] { (byte) -1, (byte) 1, ' ', (short) 10, (short) 1, (byte) 1 };
        int[] intArray8 = ds.MaxMin2.maxMin2(intArray6, (int) (byte) 0);
        int[] intArray10 = ds.MaxMin2.maxMin2(intArray6, (int) (short) 1);
        int[] intArray12 = ds.MaxMin2.maxMin2(intArray10, (-1));
        int[] intArray14 = ds.MaxMin2.maxMin2(intArray12, (int) (short) -1);
        int[] intArray16 = ds.MaxMin2.maxMin2(intArray14, (-1));
        int[] intArray18 = ds.MaxMin2.maxMin2(intArray16, (int) (short) 1);
        int[] intArray20 = ds.MaxMin2.maxMin2(intArray18, (-1));
        java.lang.Class<?> wildcardClass21 = intArray18.getClass();
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[-1, 1, 32, 10, 1, 1]");
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray16), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray18), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray20), "[-1, -1]");
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test618() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test618");
        int[] intArray4 = new int[] { (byte) 0, 10, '#', (short) 0 };
        int[] intArray6 = ds.MaxMin2.maxMin2(intArray4, (int) (short) 1);
        int[] intArray8 = ds.MaxMin2.maxMin2(intArray6, 0);
        int[] intArray10 = ds.MaxMin2.maxMin2(intArray8, 0);
        int[] intArray12 = ds.MaxMin2.maxMin2(intArray8, 0);
        int[] intArray14 = ds.MaxMin2.maxMin2(intArray12, 0);
        int[] intArray16 = ds.MaxMin2.maxMin2(intArray12, (int) (short) -1);
        int[] intArray18 = ds.MaxMin2.maxMin2(intArray12, (int) (short) -1);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray20 = ds.MaxMin2.maxMin2(intArray18, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[0, 10, 35, 0]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray16), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray18), "[0, 0]");
    }

    @Test
    public void test619() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test619");
        int[] intArray6 = new int[] { (byte) -1, (byte) 1, ' ', (short) 10, (short) 1, (byte) 1 };
        int[] intArray8 = ds.MaxMin2.maxMin2(intArray6, (int) (byte) 0);
        int[] intArray10 = ds.MaxMin2.maxMin2(intArray6, (int) (short) 1);
        int[] intArray12 = ds.MaxMin2.maxMin2(intArray10, (-1));
        int[] intArray14 = ds.MaxMin2.maxMin2(intArray12, (int) (short) 1);
        java.lang.Class<?> wildcardClass15 = intArray12.getClass();
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[-1, 1, 32, 10, 1, 1]");
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[-1, -1]");
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test620() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test620");
        int[] intArray6 = new int[] { (byte) -1, (byte) 1, ' ', (short) 10, (short) 1, (byte) 1 };
        int[] intArray8 = ds.MaxMin2.maxMin2(intArray6, (int) (byte) 0);
        int[] intArray10 = ds.MaxMin2.maxMin2(intArray8, (-1));
        int[] intArray12 = ds.MaxMin2.maxMin2(intArray10, (int) (byte) -1);
        int[] intArray14 = ds.MaxMin2.maxMin2(intArray10, 1);
        java.lang.Class<?> wildcardClass15 = intArray10.getClass();
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[-1, 1, 32, 10, 1, 1]");
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[-1, -1]");
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test621() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test621");
        int[] intArray4 = new int[] { (byte) 0, 10, '#', (short) 0 };
        int[] intArray6 = ds.MaxMin2.maxMin2(intArray4, (int) (short) 1);
        int[] intArray8 = ds.MaxMin2.maxMin2(intArray6, 0);
        int[] intArray10 = ds.MaxMin2.maxMin2(intArray8, 0);
        int[] intArray12 = ds.MaxMin2.maxMin2(intArray8, 0);
        int[] intArray14 = ds.MaxMin2.maxMin2(intArray12, 0);
        int[] intArray16 = ds.MaxMin2.maxMin2(intArray14, (-1));
        int[] intArray18 = ds.MaxMin2.maxMin2(intArray16, (int) (byte) 0);
        int[] intArray20 = ds.MaxMin2.maxMin2(intArray18, (int) (byte) 1);
        int[] intArray22 = ds.MaxMin2.maxMin2(intArray18, (int) (short) -1);
        int[] intArray24 = ds.MaxMin2.maxMin2(intArray22, (int) (short) 0);
        java.lang.Class<?> wildcardClass25 = intArray24.getClass();
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[0, 10, 35, 0]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray16), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray18), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray20), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray22), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray24), "[0, 0]");
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test622() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test622");
        int[] intArray4 = new int[] { (byte) 0, 10, '#', (short) 0 };
        int[] intArray6 = ds.MaxMin2.maxMin2(intArray4, (int) (short) 1);
        int[] intArray8 = ds.MaxMin2.maxMin2(intArray6, 0);
        int[] intArray10 = ds.MaxMin2.maxMin2(intArray8, (int) (byte) -1);
        int[] intArray12 = ds.MaxMin2.maxMin2(intArray10, 0);
        int[] intArray14 = ds.MaxMin2.maxMin2(intArray12, 0);
        int[] intArray16 = ds.MaxMin2.maxMin2(intArray14, (int) (short) 1);
        int[] intArray18 = ds.MaxMin2.maxMin2(intArray14, 0);
        int[] intArray20 = ds.MaxMin2.maxMin2(intArray14, (int) (byte) 0);
        int[] intArray22 = ds.MaxMin2.maxMin2(intArray14, (int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray24 = ds.MaxMin2.maxMin2(intArray22, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[0, 10, 35, 0]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray16), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray18), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray20), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray22), "[0, 0]");
    }

    @Test
    public void test623() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test623");
        int[] intArray4 = new int[] { (byte) 0, 10, '#', (short) 0 };
        int[] intArray6 = ds.MaxMin2.maxMin2(intArray4, (int) (short) 1);
        int[] intArray8 = ds.MaxMin2.maxMin2(intArray4, 0);
        int[] intArray10 = ds.MaxMin2.maxMin2(intArray8, 1);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray12 = ds.MaxMin2.maxMin2(intArray8, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[0, 10, 35, 0]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[0, 0]");
    }

    @Test
    public void test624() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test624");
        int[] intArray4 = new int[] { (byte) 0, 10, '#', (short) 0 };
        int[] intArray6 = ds.MaxMin2.maxMin2(intArray4, (int) (short) 1);
        int[] intArray8 = ds.MaxMin2.maxMin2(intArray6, 0);
        int[] intArray10 = ds.MaxMin2.maxMin2(intArray8, (int) (byte) -1);
        int[] intArray12 = ds.MaxMin2.maxMin2(intArray10, 0);
        int[] intArray14 = ds.MaxMin2.maxMin2(intArray10, (int) (byte) 1);
        int[] intArray16 = ds.MaxMin2.maxMin2(intArray14, 1);
        int[] intArray18 = ds.MaxMin2.maxMin2(intArray14, (int) (short) 0);
        int[] intArray20 = ds.MaxMin2.maxMin2(intArray18, (-1));
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray22 = ds.MaxMin2.maxMin2(intArray20, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[0, 10, 35, 0]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray16), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray18), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray20), "[0, 0]");
    }

    @Test
    public void test625() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test625");
        int[] intArray4 = new int[] { (byte) 0, 10, '#', (short) 0 };
        int[] intArray6 = ds.MaxMin2.maxMin2(intArray4, (int) (short) 1);
        int[] intArray8 = ds.MaxMin2.maxMin2(intArray6, 0);
        int[] intArray10 = ds.MaxMin2.maxMin2(intArray6, 0);
        int[] intArray12 = ds.MaxMin2.maxMin2(intArray10, (-1));
        java.lang.Class<?> wildcardClass13 = intArray10.getClass();
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[0, 10, 35, 0]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[0, 0]");
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test626() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test626");
        int[] intArray6 = new int[] { (byte) -1, (byte) 1, ' ', (short) 10, (short) 1, (byte) 1 };
        int[] intArray8 = ds.MaxMin2.maxMin2(intArray6, (int) (byte) 0);
        int[] intArray10 = ds.MaxMin2.maxMin2(intArray6, (int) (short) 1);
        int[] intArray12 = ds.MaxMin2.maxMin2(intArray10, (-1));
        int[] intArray14 = ds.MaxMin2.maxMin2(intArray12, (int) (short) -1);
        int[] intArray16 = ds.MaxMin2.maxMin2(intArray14, (-1));
        int[] intArray18 = ds.MaxMin2.maxMin2(intArray14, 0);
        int[] intArray20 = ds.MaxMin2.maxMin2(intArray14, 0);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray22 = ds.MaxMin2.maxMin2(intArray20, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[-1, 1, 32, 10, 1, 1]");
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray16), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray18), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray20), "[-1, -1]");
    }

    @Test
    public void test627() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test627");
        int[] intArray6 = new int[] { (byte) -1, (byte) 1, ' ', (short) 10, (short) 1, (byte) 1 };
        int[] intArray8 = ds.MaxMin2.maxMin2(intArray6, (int) (byte) 0);
        int[] intArray10 = ds.MaxMin2.maxMin2(intArray6, (int) (short) 1);
        int[] intArray12 = ds.MaxMin2.maxMin2(intArray10, (-1));
        int[] intArray14 = ds.MaxMin2.maxMin2(intArray10, (int) (byte) 0);
        int[] intArray16 = ds.MaxMin2.maxMin2(intArray10, 1);
        int[] intArray18 = ds.MaxMin2.maxMin2(intArray16, 0);
        int[] intArray20 = ds.MaxMin2.maxMin2(intArray18, 0);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray22 = ds.MaxMin2.maxMin2(intArray18, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[-1, 1, 32, 10, 1, 1]");
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray16), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray18), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray20), "[-1, -1]");
    }

    @Test
    public void test628() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test628");
        int[] intArray6 = new int[] { (byte) -1, (byte) 1, ' ', (short) 10, (short) 1, (byte) 1 };
        int[] intArray8 = ds.MaxMin2.maxMin2(intArray6, (int) (byte) 0);
        int[] intArray10 = ds.MaxMin2.maxMin2(intArray6, (int) (short) 1);
        int[] intArray12 = ds.MaxMin2.maxMin2(intArray10, (-1));
        int[] intArray14 = ds.MaxMin2.maxMin2(intArray12, (int) (short) -1);
        int[] intArray16 = ds.MaxMin2.maxMin2(intArray14, (-1));
        int[] intArray18 = ds.MaxMin2.maxMin2(intArray16, (int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray20 = ds.MaxMin2.maxMin2(intArray16, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[-1, 1, 32, 10, 1, 1]");
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray16), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray18), "[-1, -1]");
    }

    @Test
    public void test629() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test629");
        int[] intArray6 = new int[] { (byte) -1, (byte) 1, ' ', (short) 10, (short) 1, (byte) 1 };
        int[] intArray8 = ds.MaxMin2.maxMin2(intArray6, (int) (byte) 0);
        int[] intArray10 = ds.MaxMin2.maxMin2(intArray6, (int) (short) 1);
        int[] intArray12 = ds.MaxMin2.maxMin2(intArray10, (-1));
        int[] intArray14 = ds.MaxMin2.maxMin2(intArray12, (int) (short) -1);
        int[] intArray16 = ds.MaxMin2.maxMin2(intArray14, (-1));
        int[] intArray18 = ds.MaxMin2.maxMin2(intArray14, 0);
        int[] intArray20 = ds.MaxMin2.maxMin2(intArray14, 1);
        int[] intArray22 = ds.MaxMin2.maxMin2(intArray20, (int) (byte) 1);
        int[] intArray24 = ds.MaxMin2.maxMin2(intArray20, (int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray26 = ds.MaxMin2.maxMin2(intArray24, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[-1, 1, 32, 10, 1, 1]");
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray16), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray18), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray20), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray22), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray24), "[-1, -1]");
    }

    @Test
    public void test630() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test630");
        int[] intArray4 = new int[] { (byte) 0, 10, '#', (short) 0 };
        int[] intArray6 = ds.MaxMin2.maxMin2(intArray4, (int) (short) 1);
        int[] intArray8 = ds.MaxMin2.maxMin2(intArray6, 0);
        int[] intArray10 = ds.MaxMin2.maxMin2(intArray8, (int) (byte) -1);
        int[] intArray12 = ds.MaxMin2.maxMin2(intArray10, 0);
        int[] intArray14 = ds.MaxMin2.maxMin2(intArray12, 0);
        int[] intArray16 = ds.MaxMin2.maxMin2(intArray14, (int) (short) 1);
        int[] intArray18 = ds.MaxMin2.maxMin2(intArray14, 0);
        int[] intArray20 = ds.MaxMin2.maxMin2(intArray18, (int) (short) -1);
        int[] intArray22 = ds.MaxMin2.maxMin2(intArray18, (int) (short) 1);
        java.lang.Class<?> wildcardClass23 = intArray22.getClass();
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[0, 10, 35, 0]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray16), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray18), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray20), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray22), "[0, 0]");
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test631() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test631");
        int[] intArray6 = new int[] { (byte) -1, (byte) 1, ' ', (short) 10, (short) 1, (byte) 1 };
        int[] intArray8 = ds.MaxMin2.maxMin2(intArray6, (int) (byte) 0);
        int[] intArray10 = ds.MaxMin2.maxMin2(intArray6, (int) (short) 1);
        int[] intArray12 = ds.MaxMin2.maxMin2(intArray10, (-1));
        int[] intArray14 = ds.MaxMin2.maxMin2(intArray12, (int) (short) -1);
        int[] intArray16 = ds.MaxMin2.maxMin2(intArray14, (-1));
        int[] intArray18 = ds.MaxMin2.maxMin2(intArray16, (int) (short) 1);
        int[] intArray20 = ds.MaxMin2.maxMin2(intArray16, (int) (short) 0);
        int[] intArray22 = ds.MaxMin2.maxMin2(intArray20, (-1));
        java.lang.Class<?> wildcardClass23 = intArray22.getClass();
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[-1, 1, 32, 10, 1, 1]");
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray16), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray18), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray20), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray22), "[-1, -1]");
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test632() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test632");
        int[] intArray6 = new int[] { (byte) -1, (byte) 1, ' ', (short) 10, (short) 1, (byte) 1 };
        int[] intArray8 = ds.MaxMin2.maxMin2(intArray6, (int) (byte) 0);
        int[] intArray10 = ds.MaxMin2.maxMin2(intArray8, (-1));
        int[] intArray12 = ds.MaxMin2.maxMin2(intArray10, (int) (byte) -1);
        int[] intArray14 = ds.MaxMin2.maxMin2(intArray10, 1);
        int[] intArray16 = ds.MaxMin2.maxMin2(intArray10, (-1));
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray18 = ds.MaxMin2.maxMin2(intArray16, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[-1, 1, 32, 10, 1, 1]");
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray16), "[-1, -1]");
    }

    @Test
    public void test633() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test633");
        int[] intArray6 = new int[] { (short) 10, 10, 0, 10, (short) -1, (byte) 0 };
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray8 = ds.MaxMin2.maxMin2(intArray6, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[10, 10, 0, 10, -1, 0]");
    }

    @Test
    public void test634() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test634");
        int[] intArray4 = new int[] { (byte) 0, 10, '#', (short) 0 };
        int[] intArray6 = ds.MaxMin2.maxMin2(intArray4, (int) (short) 1);
        int[] intArray8 = ds.MaxMin2.maxMin2(intArray4, (int) (short) 1);
        int[] intArray10 = ds.MaxMin2.maxMin2(intArray8, (int) (byte) -1);
        int[] intArray12 = ds.MaxMin2.maxMin2(intArray10, 1);
        int[] intArray14 = ds.MaxMin2.maxMin2(intArray10, 1);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray16 = ds.MaxMin2.maxMin2(intArray14, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[0, 10, 35, 0]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[0, 0]");
    }

    @Test
    public void test635() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test635");
        int[] intArray6 = new int[] { (byte) -1, (byte) 1, ' ', (short) 10, (short) 1, (byte) 1 };
        int[] intArray8 = ds.MaxMin2.maxMin2(intArray6, (int) (byte) 0);
        int[] intArray10 = ds.MaxMin2.maxMin2(intArray6, (int) (short) 1);
        int[] intArray12 = ds.MaxMin2.maxMin2(intArray10, (-1));
        int[] intArray14 = ds.MaxMin2.maxMin2(intArray12, (int) (short) -1);
        int[] intArray16 = ds.MaxMin2.maxMin2(intArray14, (-1));
        int[] intArray18 = ds.MaxMin2.maxMin2(intArray16, (int) (short) 1);
        int[] intArray20 = ds.MaxMin2.maxMin2(intArray18, 0);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray22 = ds.MaxMin2.maxMin2(intArray18, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[-1, 1, 32, 10, 1, 1]");
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray16), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray18), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray20), "[-1, -1]");
    }

    @Test
    public void test636() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test636");
        int[] intArray6 = new int[] { (byte) -1, (byte) 1, ' ', (short) 10, (short) 1, (byte) 1 };
        int[] intArray8 = ds.MaxMin2.maxMin2(intArray6, (int) (byte) 0);
        int[] intArray10 = ds.MaxMin2.maxMin2(intArray6, (int) (short) 1);
        int[] intArray12 = ds.MaxMin2.maxMin2(intArray10, (-1));
        int[] intArray14 = ds.MaxMin2.maxMin2(intArray10, (int) (byte) 0);
        int[] intArray16 = ds.MaxMin2.maxMin2(intArray14, 1);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray18 = ds.MaxMin2.maxMin2(intArray14, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[-1, 1, 32, 10, 1, 1]");
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray16), "[-1, -1]");
    }

    @Test
    public void test637() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test637");
        int[] intArray6 = new int[] { (byte) -1, (byte) 1, ' ', (short) 10, (short) 1, (byte) 1 };
        int[] intArray8 = ds.MaxMin2.maxMin2(intArray6, (int) (byte) 0);
        int[] intArray10 = ds.MaxMin2.maxMin2(intArray6, (int) (short) 1);
        int[] intArray12 = ds.MaxMin2.maxMin2(intArray10, (-1));
        int[] intArray14 = ds.MaxMin2.maxMin2(intArray12, (int) (short) -1);
        int[] intArray16 = ds.MaxMin2.maxMin2(intArray14, (-1));
        int[] intArray18 = ds.MaxMin2.maxMin2(intArray14, 0);
        int[] intArray20 = ds.MaxMin2.maxMin2(intArray14, 1);
        int[] intArray22 = ds.MaxMin2.maxMin2(intArray20, 0);
        int[] intArray24 = ds.MaxMin2.maxMin2(intArray22, (int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray26 = ds.MaxMin2.maxMin2(intArray22, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[-1, 1, 32, 10, 1, 1]");
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray16), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray18), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray20), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray22), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray24), "[-1, -1]");
    }

    @Test
    public void test638() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test638");
        int[] intArray6 = new int[] { (byte) -1, (byte) 1, ' ', (short) 10, (short) 1, (byte) 1 };
        int[] intArray8 = ds.MaxMin2.maxMin2(intArray6, (int) (byte) 0);
        int[] intArray10 = ds.MaxMin2.maxMin2(intArray6, (int) (short) 1);
        int[] intArray12 = ds.MaxMin2.maxMin2(intArray10, (-1));
        int[] intArray14 = ds.MaxMin2.maxMin2(intArray10, (int) (byte) 0);
        int[] intArray16 = ds.MaxMin2.maxMin2(intArray10, 1);
        int[] intArray18 = ds.MaxMin2.maxMin2(intArray16, 0);
        int[] intArray20 = ds.MaxMin2.maxMin2(intArray18, (int) (byte) -1);
        java.lang.Class<?> wildcardClass21 = intArray18.getClass();
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[-1, 1, 32, 10, 1, 1]");
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray16), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray18), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray20), "[-1, -1]");
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test639() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test639");
        int[] intArray6 = new int[] { (byte) -1, (byte) 1, ' ', (short) 10, (short) 1, (byte) 1 };
        int[] intArray8 = ds.MaxMin2.maxMin2(intArray6, (int) (byte) 0);
        int[] intArray10 = ds.MaxMin2.maxMin2(intArray6, (int) (short) 1);
        int[] intArray12 = ds.MaxMin2.maxMin2(intArray10, (-1));
        int[] intArray14 = ds.MaxMin2.maxMin2(intArray12, (int) (short) -1);
        int[] intArray16 = ds.MaxMin2.maxMin2(intArray14, (-1));
        int[] intArray18 = ds.MaxMin2.maxMin2(intArray16, (int) (short) 1);
        int[] intArray20 = ds.MaxMin2.maxMin2(intArray16, (int) (byte) 1);
        java.lang.Class<?> wildcardClass21 = intArray16.getClass();
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[-1, 1, 32, 10, 1, 1]");
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray16), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray18), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray20), "[-1, -1]");
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test640() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test640");
        int[] intArray4 = new int[] { (byte) 0, 10, '#', (short) 0 };
        int[] intArray6 = ds.MaxMin2.maxMin2(intArray4, (int) (short) 1);
        int[] intArray8 = ds.MaxMin2.maxMin2(intArray4, (int) (short) 0);
        int[] intArray10 = ds.MaxMin2.maxMin2(intArray4, (int) (byte) -1);
        int[] intArray12 = ds.MaxMin2.maxMin2(intArray10, (int) (short) 0);
        int[] intArray14 = ds.MaxMin2.maxMin2(intArray12, (-1));
        java.lang.Class<?> wildcardClass15 = intArray12.getClass();
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[0, 10, 35, 0]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[0, 0]");
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test641() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test641");
        int[] intArray4 = new int[] { (byte) 0, 10, '#', (short) 0 };
        int[] intArray6 = ds.MaxMin2.maxMin2(intArray4, (int) (short) 1);
        int[] intArray8 = ds.MaxMin2.maxMin2(intArray6, 0);
        int[] intArray10 = ds.MaxMin2.maxMin2(intArray8, 0);
        int[] intArray12 = ds.MaxMin2.maxMin2(intArray8, 0);
        int[] intArray14 = ds.MaxMin2.maxMin2(intArray12, (int) (byte) 0);
        int[] intArray16 = ds.MaxMin2.maxMin2(intArray12, (int) (short) 1);
        int[] intArray18 = ds.MaxMin2.maxMin2(intArray16, (int) (byte) 0);
        int[] intArray20 = ds.MaxMin2.maxMin2(intArray18, (int) (byte) 1);
        int[] intArray22 = ds.MaxMin2.maxMin2(intArray20, (int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray24 = ds.MaxMin2.maxMin2(intArray22, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[0, 10, 35, 0]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray16), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray18), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray20), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray22), "[0, 0]");
    }

    @Test
    public void test642() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test642");
        int[] intArray4 = new int[] { (byte) 0, 10, '#', (short) 0 };
        int[] intArray6 = ds.MaxMin2.maxMin2(intArray4, (int) (short) 1);
        int[] intArray8 = ds.MaxMin2.maxMin2(intArray6, 0);
        int[] intArray10 = ds.MaxMin2.maxMin2(intArray8, (int) (byte) -1);
        int[] intArray12 = ds.MaxMin2.maxMin2(intArray10, 0);
        int[] intArray14 = ds.MaxMin2.maxMin2(intArray12, 0);
        int[] intArray16 = ds.MaxMin2.maxMin2(intArray14, (int) (byte) 1);
        int[] intArray18 = ds.MaxMin2.maxMin2(intArray16, (-1));
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray20 = ds.MaxMin2.maxMin2(intArray18, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[0, 10, 35, 0]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray16), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray18), "[0, 0]");
    }

    @Test
    public void test643() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test643");
        int[] intArray6 = new int[] { (byte) -1, (byte) 1, ' ', (short) 10, (short) 1, (byte) 1 };
        int[] intArray8 = ds.MaxMin2.maxMin2(intArray6, (int) (byte) 0);
        int[] intArray10 = ds.MaxMin2.maxMin2(intArray6, (int) (short) 1);
        int[] intArray12 = ds.MaxMin2.maxMin2(intArray10, (-1));
        int[] intArray14 = ds.MaxMin2.maxMin2(intArray12, (int) (short) -1);
        int[] intArray16 = ds.MaxMin2.maxMin2(intArray14, (-1));
        int[] intArray18 = ds.MaxMin2.maxMin2(intArray14, 0);
        int[] intArray20 = ds.MaxMin2.maxMin2(intArray14, 1);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray22 = ds.MaxMin2.maxMin2(intArray14, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[-1, 1, 32, 10, 1, 1]");
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray16), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray18), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray20), "[-1, -1]");
    }

    @Test
    public void test644() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test644");
        int[] intArray6 = new int[] { (byte) -1, (byte) 1, ' ', (short) 10, (short) 1, (byte) 1 };
        int[] intArray8 = ds.MaxMin2.maxMin2(intArray6, (int) (byte) 0);
        int[] intArray10 = ds.MaxMin2.maxMin2(intArray6, (int) (short) 1);
        int[] intArray12 = ds.MaxMin2.maxMin2(intArray10, (int) (byte) -1);
        int[] intArray14 = ds.MaxMin2.maxMin2(intArray10, 1);
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[-1, 1, 32, 10, 1, 1]");
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[-1, -1]");
    }

    @Test
    public void test645() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test645");
        int[] intArray4 = new int[] { (byte) 0, 10, '#', (short) 0 };
        int[] intArray6 = ds.MaxMin2.maxMin2(intArray4, (int) (short) 1);
        int[] intArray8 = ds.MaxMin2.maxMin2(intArray6, 0);
        int[] intArray10 = ds.MaxMin2.maxMin2(intArray8, 0);
        int[] intArray12 = ds.MaxMin2.maxMin2(intArray8, 0);
        int[] intArray14 = ds.MaxMin2.maxMin2(intArray12, 0);
        int[] intArray16 = ds.MaxMin2.maxMin2(intArray12, (int) (short) -1);
        int[] intArray18 = ds.MaxMin2.maxMin2(intArray12, (int) (short) -1);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray20 = ds.MaxMin2.maxMin2(intArray12, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[0, 10, 35, 0]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray16), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray18), "[0, 0]");
    }

    @Test
    public void test646() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test646");
        int[] intArray6 = new int[] { (byte) -1, (byte) 1, ' ', (short) 10, (short) 1, (byte) 1 };
        int[] intArray8 = ds.MaxMin2.maxMin2(intArray6, (int) (byte) 0);
        int[] intArray10 = ds.MaxMin2.maxMin2(intArray6, (int) (short) 1);
        int[] intArray12 = ds.MaxMin2.maxMin2(intArray10, (-1));
        int[] intArray14 = ds.MaxMin2.maxMin2(intArray12, (int) (short) -1);
        int[] intArray16 = ds.MaxMin2.maxMin2(intArray12, (int) (byte) 1);
        int[] intArray18 = ds.MaxMin2.maxMin2(intArray12, 1);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray20 = ds.MaxMin2.maxMin2(intArray12, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[-1, 1, 32, 10, 1, 1]");
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray16), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray18), "[-1, -1]");
    }

    @Test
    public void test647() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test647");
        int[] intArray4 = new int[] { (byte) 0, 10, '#', (short) 0 };
        int[] intArray6 = ds.MaxMin2.maxMin2(intArray4, (int) (short) 1);
        int[] intArray8 = ds.MaxMin2.maxMin2(intArray6, 0);
        int[] intArray10 = ds.MaxMin2.maxMin2(intArray8, (int) (byte) -1);
        int[] intArray12 = ds.MaxMin2.maxMin2(intArray10, 0);
        int[] intArray14 = ds.MaxMin2.maxMin2(intArray12, (int) (short) 1);
        int[] intArray16 = ds.MaxMin2.maxMin2(intArray14, 0);
        int[] intArray18 = ds.MaxMin2.maxMin2(intArray16, (int) (short) -1);
        int[] intArray20 = ds.MaxMin2.maxMin2(intArray16, (-1));
        java.lang.Class<?> wildcardClass21 = intArray20.getClass();
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[0, 10, 35, 0]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray16), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray18), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray20), "[0, 0]");
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test648() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test648");
        int[] intArray4 = new int[] { (byte) 0, 10, '#', (short) 0 };
        int[] intArray6 = ds.MaxMin2.maxMin2(intArray4, (int) (short) 1);
        int[] intArray8 = ds.MaxMin2.maxMin2(intArray6, 0);
        int[] intArray10 = ds.MaxMin2.maxMin2(intArray8, (int) (byte) -1);
        int[] intArray12 = ds.MaxMin2.maxMin2(intArray10, 0);
        int[] intArray14 = ds.MaxMin2.maxMin2(intArray12, 0);
        int[] intArray16 = ds.MaxMin2.maxMin2(intArray14, (int) (short) 1);
        int[] intArray18 = ds.MaxMin2.maxMin2(intArray16, (int) (short) 1);
        int[] intArray20 = ds.MaxMin2.maxMin2(intArray16, 0);
        java.lang.Class<?> wildcardClass21 = intArray16.getClass();
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[0, 10, 35, 0]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray16), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray18), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray20), "[0, 0]");
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test649() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test649");
        int[] intArray6 = new int[] { (byte) -1, (byte) 1, ' ', (short) 10, (short) 1, (byte) 1 };
        int[] intArray8 = ds.MaxMin2.maxMin2(intArray6, (int) (byte) 0);
        int[] intArray10 = ds.MaxMin2.maxMin2(intArray6, (int) (short) 1);
        int[] intArray12 = ds.MaxMin2.maxMin2(intArray10, (-1));
        int[] intArray14 = ds.MaxMin2.maxMin2(intArray12, (int) (short) -1);
        int[] intArray16 = ds.MaxMin2.maxMin2(intArray12, (int) (short) -1);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray18 = ds.MaxMin2.maxMin2(intArray12, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[-1, 1, 32, 10, 1, 1]");
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray16), "[-1, -1]");
    }

    @Test
    public void test650() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test650");
        int[] intArray4 = new int[] { (byte) 0, 10, '#', (short) 0 };
        int[] intArray6 = ds.MaxMin2.maxMin2(intArray4, (int) (short) 1);
        int[] intArray8 = ds.MaxMin2.maxMin2(intArray6, 0);
        int[] intArray10 = ds.MaxMin2.maxMin2(intArray8, 0);
        int[] intArray12 = ds.MaxMin2.maxMin2(intArray8, 0);
        int[] intArray14 = ds.MaxMin2.maxMin2(intArray12, 0);
        int[] intArray16 = ds.MaxMin2.maxMin2(intArray14, (-1));
        int[] intArray18 = ds.MaxMin2.maxMin2(intArray16, (int) (byte) 0);
        java.lang.Class<?> wildcardClass19 = intArray18.getClass();
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[0, 10, 35, 0]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray16), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray18), "[0, 0]");
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test651() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test651");
        int[] intArray4 = new int[] { (byte) 0, 10, '#', (short) 0 };
        int[] intArray6 = ds.MaxMin2.maxMin2(intArray4, (int) (short) 1);
        int[] intArray8 = ds.MaxMin2.maxMin2(intArray6, 0);
        int[] intArray10 = ds.MaxMin2.maxMin2(intArray8, 0);
        int[] intArray12 = ds.MaxMin2.maxMin2(intArray8, 0);
        int[] intArray14 = ds.MaxMin2.maxMin2(intArray12, (int) (byte) 1);
        java.lang.Class<?> wildcardClass15 = intArray12.getClass();
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[0, 10, 35, 0]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[0, 0]");
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test652() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test652");
        int[] intArray4 = new int[] { (byte) 0, 10, '#', (short) 0 };
        int[] intArray6 = ds.MaxMin2.maxMin2(intArray4, (int) (short) 1);
        int[] intArray8 = ds.MaxMin2.maxMin2(intArray6, 0);
        int[] intArray10 = ds.MaxMin2.maxMin2(intArray8, 0);
        int[] intArray12 = ds.MaxMin2.maxMin2(intArray8, 0);
        int[] intArray14 = ds.MaxMin2.maxMin2(intArray12, 0);
        int[] intArray16 = ds.MaxMin2.maxMin2(intArray14, (-1));
        int[] intArray18 = ds.MaxMin2.maxMin2(intArray16, (int) (byte) 0);
        int[] intArray20 = ds.MaxMin2.maxMin2(intArray18, (int) (byte) 1);
        int[] intArray22 = ds.MaxMin2.maxMin2(intArray18, (int) (short) -1);
        int[] intArray24 = ds.MaxMin2.maxMin2(intArray22, (int) (byte) 0);
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[0, 10, 35, 0]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray16), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray18), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray20), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray22), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray24), "[0, 0]");
    }

    @Test
    public void test653() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test653");
        int[] intArray6 = new int[] { (byte) -1, (byte) 1, ' ', (short) 10, (short) 1, (byte) 1 };
        int[] intArray8 = ds.MaxMin2.maxMin2(intArray6, (int) (byte) 0);
        int[] intArray10 = ds.MaxMin2.maxMin2(intArray6, (int) (short) 1);
        int[] intArray12 = ds.MaxMin2.maxMin2(intArray10, (-1));
        int[] intArray14 = ds.MaxMin2.maxMin2(intArray12, (int) (short) -1);
        int[] intArray16 = ds.MaxMin2.maxMin2(intArray12, (int) (byte) 1);
        int[] intArray18 = ds.MaxMin2.maxMin2(intArray12, 1);
        java.lang.Class<?> wildcardClass19 = intArray12.getClass();
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[-1, 1, 32, 10, 1, 1]");
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray16), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray18), "[-1, -1]");
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test654() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test654");
        int[] intArray4 = new int[] { (byte) 0, 10, '#', (short) 0 };
        int[] intArray6 = ds.MaxMin2.maxMin2(intArray4, (int) (short) 1);
        int[] intArray8 = ds.MaxMin2.maxMin2(intArray6, 0);
        int[] intArray10 = ds.MaxMin2.maxMin2(intArray8, (int) (byte) -1);
        int[] intArray12 = ds.MaxMin2.maxMin2(intArray10, 0);
        int[] intArray14 = ds.MaxMin2.maxMin2(intArray12, 0);
        int[] intArray16 = ds.MaxMin2.maxMin2(intArray14, (int) (short) 1);
        int[] intArray18 = ds.MaxMin2.maxMin2(intArray16, (int) (short) 0);
        int[] intArray20 = ds.MaxMin2.maxMin2(intArray18, (int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray22 = ds.MaxMin2.maxMin2(intArray18, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[0, 10, 35, 0]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray16), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray18), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray20), "[0, 0]");
    }

    @Test
    public void test655() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test655");
        int[] intArray6 = new int[] { (byte) -1, (byte) 1, ' ', (short) 10, (short) 1, (byte) 1 };
        int[] intArray8 = ds.MaxMin2.maxMin2(intArray6, (int) (byte) 0);
        int[] intArray10 = ds.MaxMin2.maxMin2(intArray8, (-1));
        int[] intArray12 = ds.MaxMin2.maxMin2(intArray10, 1);
        java.lang.Class<?> wildcardClass13 = intArray12.getClass();
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[-1, 1, 32, 10, 1, 1]");
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[-1, -1]");
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test656() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test656");
        int[] intArray6 = new int[] { (byte) -1, (byte) 1, ' ', (short) 10, (short) 1, (byte) 1 };
        int[] intArray8 = ds.MaxMin2.maxMin2(intArray6, (int) (byte) 0);
        int[] intArray10 = ds.MaxMin2.maxMin2(intArray6, (int) (short) 1);
        int[] intArray12 = ds.MaxMin2.maxMin2(intArray10, (-1));
        int[] intArray14 = ds.MaxMin2.maxMin2(intArray10, (int) (byte) 0);
        int[] intArray16 = ds.MaxMin2.maxMin2(intArray14, 1);
        int[] intArray18 = ds.MaxMin2.maxMin2(intArray14, (-1));
        java.lang.Class<?> wildcardClass19 = intArray14.getClass();
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[-1, 1, 32, 10, 1, 1]");
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray16), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray18), "[-1, -1]");
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test657() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test657");
        int[] intArray6 = new int[] { (byte) -1, (byte) 1, ' ', (short) 10, (short) 1, (byte) 1 };
        int[] intArray8 = ds.MaxMin2.maxMin2(intArray6, (int) (byte) 0);
        int[] intArray10 = ds.MaxMin2.maxMin2(intArray6, (int) (short) 1);
        int[] intArray12 = ds.MaxMin2.maxMin2(intArray10, (-1));
        int[] intArray14 = ds.MaxMin2.maxMin2(intArray12, (int) (byte) -1);
        int[] intArray16 = ds.MaxMin2.maxMin2(intArray14, (int) (byte) 1);
        int[] intArray18 = ds.MaxMin2.maxMin2(intArray16, (int) (byte) -1);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray20 = ds.MaxMin2.maxMin2(intArray18, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[-1, 1, 32, 10, 1, 1]");
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray16), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray18), "[-1, -1]");
    }

    @Test
    public void test658() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test658");
        int[] intArray4 = new int[] { (byte) 0, 10, '#', (short) 0 };
        int[] intArray6 = ds.MaxMin2.maxMin2(intArray4, (int) (short) 1);
        int[] intArray8 = ds.MaxMin2.maxMin2(intArray6, 0);
        int[] intArray10 = ds.MaxMin2.maxMin2(intArray8, (int) (byte) -1);
        int[] intArray12 = ds.MaxMin2.maxMin2(intArray10, 0);
        int[] intArray14 = ds.MaxMin2.maxMin2(intArray12, (int) (short) 1);
        int[] intArray16 = ds.MaxMin2.maxMin2(intArray14, (int) (short) 1);
        java.lang.Class<?> wildcardClass17 = intArray14.getClass();
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[0, 10, 35, 0]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray16), "[0, 0]");
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test659() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test659");
        int[] intArray4 = new int[] { (byte) 0, 10, '#', (short) 0 };
        int[] intArray6 = ds.MaxMin2.maxMin2(intArray4, (int) (short) 1);
        int[] intArray8 = ds.MaxMin2.maxMin2(intArray4, (int) (short) 0);
        int[] intArray10 = ds.MaxMin2.maxMin2(intArray8, (int) (byte) 1);
        java.lang.Class<?> wildcardClass11 = intArray10.getClass();
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[0, 10, 35, 0]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[0, 0]");
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test660() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test660");
        int[] intArray4 = new int[] { (byte) 0, 10, '#', (short) 0 };
        int[] intArray6 = ds.MaxMin2.maxMin2(intArray4, (int) (short) 1);
        int[] intArray8 = ds.MaxMin2.maxMin2(intArray6, 0);
        int[] intArray10 = ds.MaxMin2.maxMin2(intArray8, (int) (byte) -1);
        int[] intArray12 = ds.MaxMin2.maxMin2(intArray10, 0);
        int[] intArray14 = ds.MaxMin2.maxMin2(intArray12, 0);
        int[] intArray16 = ds.MaxMin2.maxMin2(intArray14, (int) (short) 1);
        int[] intArray18 = ds.MaxMin2.maxMin2(intArray14, 0);
        int[] intArray20 = ds.MaxMin2.maxMin2(intArray14, (int) (byte) 0);
        int[] intArray22 = ds.MaxMin2.maxMin2(intArray20, (int) (short) 1);
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[0, 10, 35, 0]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray16), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray18), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray20), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray22), "[0, 0]");
    }

    @Test
    public void test661() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test661");
        int[] intArray4 = new int[] { (byte) 0, 10, '#', (short) 0 };
        int[] intArray6 = ds.MaxMin2.maxMin2(intArray4, (int) (short) 1);
        int[] intArray8 = ds.MaxMin2.maxMin2(intArray6, 0);
        int[] intArray10 = ds.MaxMin2.maxMin2(intArray8, 0);
        int[] intArray12 = ds.MaxMin2.maxMin2(intArray8, 0);
        int[] intArray14 = ds.MaxMin2.maxMin2(intArray12, (int) (byte) 0);
        int[] intArray16 = ds.MaxMin2.maxMin2(intArray12, (int) (short) 1);
        int[] intArray18 = ds.MaxMin2.maxMin2(intArray16, (int) (byte) 0);
        int[] intArray20 = ds.MaxMin2.maxMin2(intArray18, (int) (byte) 1);
        java.lang.Class<?> wildcardClass21 = intArray18.getClass();
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[0, 10, 35, 0]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray16), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray18), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray20), "[0, 0]");
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test662() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test662");
        int[] intArray6 = new int[] { (byte) -1, (byte) 1, ' ', (short) 10, (short) 1, (byte) 1 };
        int[] intArray8 = ds.MaxMin2.maxMin2(intArray6, (int) (byte) 0);
        int[] intArray10 = ds.MaxMin2.maxMin2(intArray6, (int) (short) 1);
        int[] intArray12 = ds.MaxMin2.maxMin2(intArray10, (-1));
        int[] intArray14 = ds.MaxMin2.maxMin2(intArray12, (int) (short) 1);
        int[] intArray16 = ds.MaxMin2.maxMin2(intArray14, (-1));
        java.lang.Class<?> wildcardClass17 = intArray16.getClass();
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[-1, 1, 32, 10, 1, 1]");
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray16), "[-1, -1]");
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test663() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test663");
        int[] intArray6 = new int[] { (byte) -1, (byte) 1, ' ', (short) 10, (short) 1, (byte) 1 };
        int[] intArray8 = ds.MaxMin2.maxMin2(intArray6, (int) (byte) 0);
        int[] intArray10 = ds.MaxMin2.maxMin2(intArray6, (int) (byte) 0);
        int[] intArray12 = ds.MaxMin2.maxMin2(intArray10, (int) (short) 0);
        int[] intArray14 = ds.MaxMin2.maxMin2(intArray10, (int) (short) -1);
        int[] intArray16 = ds.MaxMin2.maxMin2(intArray10, (int) (byte) 0);
        int[] intArray18 = ds.MaxMin2.maxMin2(intArray16, (int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray20 = ds.MaxMin2.maxMin2(intArray18, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[-1, 1, 32, 10, 1, 1]");
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray16), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray18), "[-1, -1]");
    }

    @Test
    public void test664() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test664");
        int[] intArray4 = new int[] { (byte) 0, 10, '#', (short) 0 };
        int[] intArray6 = ds.MaxMin2.maxMin2(intArray4, (int) (short) 1);
        int[] intArray8 = ds.MaxMin2.maxMin2(intArray6, 0);
        int[] intArray10 = ds.MaxMin2.maxMin2(intArray8, (int) (byte) -1);
        int[] intArray12 = ds.MaxMin2.maxMin2(intArray10, 0);
        int[] intArray14 = ds.MaxMin2.maxMin2(intArray12, 0);
        int[] intArray16 = ds.MaxMin2.maxMin2(intArray14, (int) (short) 1);
        int[] intArray18 = ds.MaxMin2.maxMin2(intArray14, 0);
        int[] intArray20 = ds.MaxMin2.maxMin2(intArray18, (int) (byte) 0);
        int[] intArray22 = ds.MaxMin2.maxMin2(intArray20, (int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray24 = ds.MaxMin2.maxMin2(intArray22, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[0, 10, 35, 0]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray16), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray18), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray20), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray22), "[0, 0]");
    }

    @Test
    public void test665() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test665");
        int[] intArray4 = new int[] { (byte) 0, 10, '#', (short) 0 };
        int[] intArray6 = ds.MaxMin2.maxMin2(intArray4, (int) (short) 1);
        int[] intArray8 = ds.MaxMin2.maxMin2(intArray6, 0);
        int[] intArray10 = ds.MaxMin2.maxMin2(intArray8, (int) (byte) -1);
        int[] intArray12 = ds.MaxMin2.maxMin2(intArray10, 0);
        int[] intArray14 = ds.MaxMin2.maxMin2(intArray12, 0);
        int[] intArray16 = ds.MaxMin2.maxMin2(intArray14, (int) (short) 1);
        int[] intArray18 = ds.MaxMin2.maxMin2(intArray14, 0);
        int[] intArray20 = ds.MaxMin2.maxMin2(intArray14, (int) (byte) 0);
        int[] intArray22 = ds.MaxMin2.maxMin2(intArray14, 0);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray24 = ds.MaxMin2.maxMin2(intArray14, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[0, 10, 35, 0]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray16), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray18), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray20), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray22), "[0, 0]");
    }

    @Test
    public void test666() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test666");
        int[] intArray6 = new int[] { (byte) -1, (byte) 1, ' ', (short) 10, (short) 1, (byte) 1 };
        int[] intArray8 = ds.MaxMin2.maxMin2(intArray6, (int) (byte) 0);
        int[] intArray10 = ds.MaxMin2.maxMin2(intArray6, (int) (short) 1);
        int[] intArray12 = ds.MaxMin2.maxMin2(intArray10, (-1));
        int[] intArray14 = ds.MaxMin2.maxMin2(intArray12, (int) (short) -1);
        int[] intArray16 = ds.MaxMin2.maxMin2(intArray14, (-1));
        int[] intArray18 = ds.MaxMin2.maxMin2(intArray14, 0);
        int[] intArray20 = ds.MaxMin2.maxMin2(intArray14, 1);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray22 = ds.MaxMin2.maxMin2(intArray20, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[-1, 1, 32, 10, 1, 1]");
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray16), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray18), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray20), "[-1, -1]");
    }

    @Test
    public void test667() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test667");
        int[] intArray4 = new int[] { (byte) 0, 10, '#', (short) 0 };
        int[] intArray6 = ds.MaxMin2.maxMin2(intArray4, (int) (short) 1);
        int[] intArray8 = ds.MaxMin2.maxMin2(intArray6, 0);
        int[] intArray10 = ds.MaxMin2.maxMin2(intArray8, 0);
        int[] intArray12 = ds.MaxMin2.maxMin2(intArray8, 0);
        int[] intArray14 = ds.MaxMin2.maxMin2(intArray12, (int) (byte) 0);
        int[] intArray16 = ds.MaxMin2.maxMin2(intArray12, (int) (short) 1);
        int[] intArray18 = ds.MaxMin2.maxMin2(intArray16, (int) (byte) 0);
        int[] intArray20 = ds.MaxMin2.maxMin2(intArray18, (int) (byte) 1);
        int[] intArray22 = ds.MaxMin2.maxMin2(intArray20, (int) (byte) 0);
        java.lang.Class<?> wildcardClass23 = intArray20.getClass();
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[0, 10, 35, 0]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray16), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray18), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray20), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray22), "[0, 0]");
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test668() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test668");
        int[] intArray6 = new int[] { (byte) -1, (byte) 1, ' ', (short) 10, (short) 1, (byte) 1 };
        int[] intArray8 = ds.MaxMin2.maxMin2(intArray6, (int) (byte) 0);
        int[] intArray10 = ds.MaxMin2.maxMin2(intArray6, (int) (short) 1);
        int[] intArray12 = ds.MaxMin2.maxMin2(intArray10, (-1));
        int[] intArray14 = ds.MaxMin2.maxMin2(intArray12, (int) (short) -1);
        int[] intArray16 = ds.MaxMin2.maxMin2(intArray14, (-1));
        int[] intArray18 = ds.MaxMin2.maxMin2(intArray14, 0);
        int[] intArray20 = ds.MaxMin2.maxMin2(intArray14, 1);
        int[] intArray22 = ds.MaxMin2.maxMin2(intArray20, (int) (byte) 1);
        int[] intArray24 = ds.MaxMin2.maxMin2(intArray20, 0);
        java.lang.Class<?> wildcardClass25 = intArray20.getClass();
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[-1, 1, 32, 10, 1, 1]");
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray16), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray18), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray20), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray22), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray24), "[-1, -1]");
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test669() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test669");
        int[] intArray6 = new int[] { (byte) -1, (byte) 1, ' ', (short) 10, (short) 1, (byte) 1 };
        int[] intArray8 = ds.MaxMin2.maxMin2(intArray6, (int) (byte) 0);
        int[] intArray10 = ds.MaxMin2.maxMin2(intArray6, (int) (short) 1);
        int[] intArray12 = ds.MaxMin2.maxMin2(intArray10, (-1));
        int[] intArray14 = ds.MaxMin2.maxMin2(intArray12, (int) (short) -1);
        int[] intArray16 = ds.MaxMin2.maxMin2(intArray12, (int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray18 = ds.MaxMin2.maxMin2(intArray16, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[-1, 1, 32, 10, 1, 1]");
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray16), "[-1, -1]");
    }

    @Test
    public void test670() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test670");
        int[] intArray6 = new int[] { (byte) -1, (byte) 1, ' ', (short) 10, (short) 1, (byte) 1 };
        int[] intArray8 = ds.MaxMin2.maxMin2(intArray6, (int) (byte) 0);
        int[] intArray10 = ds.MaxMin2.maxMin2(intArray6, (int) (short) 1);
        int[] intArray12 = ds.MaxMin2.maxMin2(intArray10, (-1));
        int[] intArray14 = ds.MaxMin2.maxMin2(intArray10, (int) (byte) 0);
        int[] intArray16 = ds.MaxMin2.maxMin2(intArray10, 1);
        int[] intArray18 = ds.MaxMin2.maxMin2(intArray16, 0);
        int[] intArray20 = ds.MaxMin2.maxMin2(intArray18, 1);
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[-1, 1, 32, 10, 1, 1]");
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray16), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray18), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray20), "[-1, -1]");
    }

    @Test
    public void test671() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test671");
        int[] intArray4 = new int[] { (byte) 0, 10, '#', (short) 0 };
        int[] intArray6 = ds.MaxMin2.maxMin2(intArray4, (int) (short) 1);
        int[] intArray8 = ds.MaxMin2.maxMin2(intArray6, 0);
        int[] intArray10 = ds.MaxMin2.maxMin2(intArray8, (int) (byte) -1);
        int[] intArray12 = ds.MaxMin2.maxMin2(intArray10, 0);
        int[] intArray14 = ds.MaxMin2.maxMin2(intArray12, 0);
        int[] intArray16 = ds.MaxMin2.maxMin2(intArray14, (int) (short) 1);
        int[] intArray18 = ds.MaxMin2.maxMin2(intArray16, (int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray20 = ds.MaxMin2.maxMin2(intArray16, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[0, 10, 35, 0]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray16), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray18), "[0, 0]");
    }

    @Test
    public void test672() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test672");
        int[] intArray4 = new int[] { (byte) 0, 10, '#', (short) 0 };
        int[] intArray6 = ds.MaxMin2.maxMin2(intArray4, (int) (short) 1);
        int[] intArray8 = ds.MaxMin2.maxMin2(intArray6, 0);
        int[] intArray10 = ds.MaxMin2.maxMin2(intArray8, 0);
        int[] intArray12 = ds.MaxMin2.maxMin2(intArray8, 0);
        int[] intArray14 = ds.MaxMin2.maxMin2(intArray12, (int) (byte) 0);
        int[] intArray16 = ds.MaxMin2.maxMin2(intArray12, (int) (short) 1);
        int[] intArray18 = ds.MaxMin2.maxMin2(intArray16, (int) (byte) 0);
        int[] intArray20 = ds.MaxMin2.maxMin2(intArray18, (int) (byte) 1);
        int[] intArray22 = ds.MaxMin2.maxMin2(intArray18, (int) (short) -1);
        java.lang.Class<?> wildcardClass23 = intArray18.getClass();
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[0, 10, 35, 0]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray16), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray18), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray20), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray22), "[0, 0]");
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test673() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test673");
        int[] intArray6 = new int[] { (byte) -1, (byte) 1, ' ', (short) 10, (short) 1, (byte) 1 };
        int[] intArray8 = ds.MaxMin2.maxMin2(intArray6, (int) (byte) 0);
        int[] intArray10 = ds.MaxMin2.maxMin2(intArray6, (int) (short) 1);
        int[] intArray12 = ds.MaxMin2.maxMin2(intArray10, (-1));
        int[] intArray14 = ds.MaxMin2.maxMin2(intArray10, (int) (byte) 0);
        int[] intArray16 = ds.MaxMin2.maxMin2(intArray10, 1);
        int[] intArray18 = ds.MaxMin2.maxMin2(intArray16, 0);
        int[] intArray20 = ds.MaxMin2.maxMin2(intArray16, 1);
        int[] intArray22 = ds.MaxMin2.maxMin2(intArray16, (int) (short) 0);
        java.lang.Class<?> wildcardClass23 = intArray16.getClass();
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[-1, 1, 32, 10, 1, 1]");
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray16), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray18), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray20), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray22), "[-1, -1]");
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test674() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test674");
        int[] intArray6 = new int[] { (byte) -1, (byte) 1, ' ', (short) 10, (short) 1, (byte) 1 };
        int[] intArray8 = ds.MaxMin2.maxMin2(intArray6, (int) (byte) 0);
        int[] intArray10 = ds.MaxMin2.maxMin2(intArray6, (int) (byte) 1);
        int[] intArray12 = ds.MaxMin2.maxMin2(intArray10, (int) (byte) 0);
        java.lang.Class<?> wildcardClass13 = intArray10.getClass();
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[-1, 1, 32, 10, 1, 1]");
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[-1, -1]");
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test675() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test675");
        int[] intArray4 = new int[] { (byte) 0, 10, '#', (short) 0 };
        int[] intArray6 = ds.MaxMin2.maxMin2(intArray4, (int) (short) 1);
        int[] intArray8 = ds.MaxMin2.maxMin2(intArray6, 0);
        int[] intArray10 = ds.MaxMin2.maxMin2(intArray8, 0);
        int[] intArray12 = ds.MaxMin2.maxMin2(intArray8, 0);
        int[] intArray14 = ds.MaxMin2.maxMin2(intArray12, (int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray16 = ds.MaxMin2.maxMin2(intArray14, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[0, 10, 35, 0]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[0, 0]");
    }

    @Test
    public void test676() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test676");
        int[] intArray6 = new int[] { (byte) -1, (byte) 1, ' ', (short) 10, (short) 1, (byte) 1 };
        int[] intArray8 = ds.MaxMin2.maxMin2(intArray6, (int) (byte) 0);
        int[] intArray10 = ds.MaxMin2.maxMin2(intArray6, (int) (short) 1);
        int[] intArray12 = ds.MaxMin2.maxMin2(intArray10, (-1));
        int[] intArray14 = ds.MaxMin2.maxMin2(intArray12, (int) (byte) -1);
        int[] intArray16 = ds.MaxMin2.maxMin2(intArray14, (int) (short) 1);
        java.lang.Class<?> wildcardClass17 = intArray16.getClass();
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[-1, 1, 32, 10, 1, 1]");
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray16), "[-1, -1]");
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test677() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test677");
        int[] intArray4 = new int[] { (byte) 0, 10, '#', (short) 0 };
        int[] intArray6 = ds.MaxMin2.maxMin2(intArray4, (int) (short) 1);
        int[] intArray8 = ds.MaxMin2.maxMin2(intArray4, (int) (short) 1);
        int[] intArray10 = ds.MaxMin2.maxMin2(intArray8, (int) (byte) -1);
        int[] intArray12 = ds.MaxMin2.maxMin2(intArray10, 1);
        int[] intArray14 = ds.MaxMin2.maxMin2(intArray10, 1);
        int[] intArray16 = ds.MaxMin2.maxMin2(intArray10, (int) (short) -1);
        int[] intArray18 = ds.MaxMin2.maxMin2(intArray16, (int) (short) 0);
        int[] intArray20 = ds.MaxMin2.maxMin2(intArray16, (int) (short) 0);
        int[] intArray22 = ds.MaxMin2.maxMin2(intArray20, (int) (short) 1);
        java.lang.Class<?> wildcardClass23 = intArray22.getClass();
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[0, 10, 35, 0]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray16), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray18), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray20), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray22), "[0, 0]");
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test678() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test678");
        int[] intArray4 = new int[] { (byte) 0, 10, '#', (short) 0 };
        int[] intArray6 = ds.MaxMin2.maxMin2(intArray4, (int) (short) 1);
        int[] intArray8 = ds.MaxMin2.maxMin2(intArray6, 0);
        int[] intArray10 = ds.MaxMin2.maxMin2(intArray8, (int) (byte) -1);
        int[] intArray12 = ds.MaxMin2.maxMin2(intArray10, 0);
        int[] intArray14 = ds.MaxMin2.maxMin2(intArray12, 0);
        int[] intArray16 = ds.MaxMin2.maxMin2(intArray14, (int) (short) 1);
        int[] intArray18 = ds.MaxMin2.maxMin2(intArray16, (int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray20 = ds.MaxMin2.maxMin2(intArray16, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[0, 10, 35, 0]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray16), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray18), "[0, 0]");
    }

    @Test
    public void test679() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test679");
        int[] intArray4 = new int[] { (byte) 0, 10, '#', (short) 0 };
        int[] intArray6 = ds.MaxMin2.maxMin2(intArray4, (int) (short) 1);
        int[] intArray8 = ds.MaxMin2.maxMin2(intArray4, (int) (short) 1);
        int[] intArray10 = ds.MaxMin2.maxMin2(intArray8, (int) (short) 1);
        int[] intArray12 = ds.MaxMin2.maxMin2(intArray8, (-1));
        int[] intArray14 = ds.MaxMin2.maxMin2(intArray12, (int) (byte) 0);
        java.lang.Class<?> wildcardClass15 = intArray14.getClass();
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[0, 10, 35, 0]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[0, 0]");
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test680() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test680");
        int[] intArray4 = new int[] { (byte) 0, 10, '#', (short) 0 };
        int[] intArray6 = ds.MaxMin2.maxMin2(intArray4, (int) (short) 1);
        int[] intArray8 = ds.MaxMin2.maxMin2(intArray6, 0);
        int[] intArray10 = ds.MaxMin2.maxMin2(intArray8, (int) (byte) -1);
        int[] intArray12 = ds.MaxMin2.maxMin2(intArray10, 0);
        int[] intArray14 = ds.MaxMin2.maxMin2(intArray12, (int) (short) 1);
        int[] intArray16 = ds.MaxMin2.maxMin2(intArray14, 0);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray18 = ds.MaxMin2.maxMin2(intArray14, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[0, 10, 35, 0]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray16), "[0, 0]");
    }

    @Test
    public void test681() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test681");
        int[] intArray6 = new int[] { (byte) -1, (byte) 1, ' ', (short) 10, (short) 1, (byte) 1 };
        int[] intArray8 = ds.MaxMin2.maxMin2(intArray6, (int) (byte) 0);
        int[] intArray10 = ds.MaxMin2.maxMin2(intArray6, (int) (byte) 0);
        int[] intArray12 = ds.MaxMin2.maxMin2(intArray10, (int) (short) -1);
        int[] intArray14 = ds.MaxMin2.maxMin2(intArray10, (int) (byte) -1);
        int[] intArray16 = ds.MaxMin2.maxMin2(intArray10, 0);
        int[] intArray18 = ds.MaxMin2.maxMin2(intArray10, (int) (short) -1);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray20 = ds.MaxMin2.maxMin2(intArray10, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[-1, 1, 32, 10, 1, 1]");
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray16), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray18), "[-1, -1]");
    }

    @Test
    public void test682() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test682");
        int[] intArray4 = new int[] { (byte) 0, 10, '#', (short) 0 };
        int[] intArray6 = ds.MaxMin2.maxMin2(intArray4, (int) (short) 1);
        int[] intArray8 = ds.MaxMin2.maxMin2(intArray6, 0);
        int[] intArray10 = ds.MaxMin2.maxMin2(intArray8, 0);
        int[] intArray12 = ds.MaxMin2.maxMin2(intArray8, 0);
        int[] intArray14 = ds.MaxMin2.maxMin2(intArray12, 0);
        int[] intArray16 = ds.MaxMin2.maxMin2(intArray12, 0);
        int[] intArray18 = ds.MaxMin2.maxMin2(intArray12, (int) (byte) -1);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray20 = ds.MaxMin2.maxMin2(intArray18, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[0, 10, 35, 0]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray16), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray18), "[0, 0]");
    }

    @Test
    public void test683() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test683");
        int[] intArray4 = new int[] { (byte) 0, 10, '#', (short) 0 };
        int[] intArray6 = ds.MaxMin2.maxMin2(intArray4, (int) (short) 1);
        int[] intArray8 = ds.MaxMin2.maxMin2(intArray6, 0);
        int[] intArray10 = ds.MaxMin2.maxMin2(intArray8, (int) (byte) -1);
        int[] intArray12 = ds.MaxMin2.maxMin2(intArray10, 0);
        int[] intArray14 = ds.MaxMin2.maxMin2(intArray12, (int) (short) 0);
        int[] intArray16 = ds.MaxMin2.maxMin2(intArray14, (int) (short) -1);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray18 = ds.MaxMin2.maxMin2(intArray14, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[0, 10, 35, 0]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray16), "[0, 0]");
    }

    @Test
    public void test684() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test684");
        int[] intArray6 = new int[] { (byte) -1, (byte) 1, ' ', (short) 10, (short) 1, (byte) 1 };
        int[] intArray8 = ds.MaxMin2.maxMin2(intArray6, (int) (byte) 0);
        int[] intArray10 = ds.MaxMin2.maxMin2(intArray6, (int) (byte) 1);
        int[] intArray12 = ds.MaxMin2.maxMin2(intArray10, (int) (byte) 1);
        int[] intArray14 = ds.MaxMin2.maxMin2(intArray12, (int) (byte) -1);
        int[] intArray16 = ds.MaxMin2.maxMin2(intArray12, (int) (short) 1);
        int[] intArray18 = ds.MaxMin2.maxMin2(intArray12, (int) (byte) -1);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray20 = ds.MaxMin2.maxMin2(intArray12, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[-1, 1, 32, 10, 1, 1]");
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray16), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray18), "[-1, -1]");
    }

    @Test
    public void test685() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test685");
        int[] intArray4 = new int[] { (byte) 0, 10, '#', (short) 0 };
        int[] intArray6 = ds.MaxMin2.maxMin2(intArray4, (int) (short) 1);
        int[] intArray8 = ds.MaxMin2.maxMin2(intArray4, (int) (short) 0);
        int[] intArray10 = ds.MaxMin2.maxMin2(intArray4, (int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray12 = ds.MaxMin2.maxMin2(intArray4, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[0, 10, 35, 0]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[0, 0]");
    }

    @Test
    public void test686() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test686");
        int[] intArray4 = new int[] { (byte) 0, 10, '#', (short) 0 };
        int[] intArray6 = ds.MaxMin2.maxMin2(intArray4, (int) (short) 1);
        int[] intArray8 = ds.MaxMin2.maxMin2(intArray4, (int) (short) 1);
        int[] intArray10 = ds.MaxMin2.maxMin2(intArray8, (int) (byte) -1);
        int[] intArray12 = ds.MaxMin2.maxMin2(intArray10, 1);
        int[] intArray14 = ds.MaxMin2.maxMin2(intArray10, 1);
        int[] intArray16 = ds.MaxMin2.maxMin2(intArray10, (int) (short) -1);
        int[] intArray18 = ds.MaxMin2.maxMin2(intArray16, (int) (short) 0);
        java.lang.Class<?> wildcardClass19 = intArray18.getClass();
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[0, 10, 35, 0]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray16), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray18), "[0, 0]");
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test687() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test687");
        int[] intArray6 = new int[] { (byte) -1, (byte) 1, ' ', (short) 10, (short) 1, (byte) 1 };
        int[] intArray8 = ds.MaxMin2.maxMin2(intArray6, (int) (byte) 0);
        int[] intArray10 = ds.MaxMin2.maxMin2(intArray6, (int) (short) 1);
        int[] intArray12 = ds.MaxMin2.maxMin2(intArray10, (-1));
        int[] intArray14 = ds.MaxMin2.maxMin2(intArray12, (int) (short) -1);
        int[] intArray16 = ds.MaxMin2.maxMin2(intArray14, (-1));
        int[] intArray18 = ds.MaxMin2.maxMin2(intArray14, 0);
        int[] intArray20 = ds.MaxMin2.maxMin2(intArray14, 1);
        int[] intArray22 = ds.MaxMin2.maxMin2(intArray20, (int) (byte) 1);
        int[] intArray24 = ds.MaxMin2.maxMin2(intArray20, (int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray26 = ds.MaxMin2.maxMin2(intArray20, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[-1, 1, 32, 10, 1, 1]");
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray16), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray18), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray20), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray22), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray24), "[-1, -1]");
    }

    @Test
    public void test688() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test688");
        int[] intArray6 = new int[] { (byte) -1, (byte) 1, ' ', (short) 10, (short) 1, (byte) 1 };
        int[] intArray8 = ds.MaxMin2.maxMin2(intArray6, (int) (byte) 0);
        int[] intArray10 = ds.MaxMin2.maxMin2(intArray6, (int) (short) 1);
        int[] intArray12 = ds.MaxMin2.maxMin2(intArray10, (-1));
        int[] intArray14 = ds.MaxMin2.maxMin2(intArray12, (int) (short) -1);
        int[] intArray16 = ds.MaxMin2.maxMin2(intArray14, (-1));
        int[] intArray18 = ds.MaxMin2.maxMin2(intArray16, (int) (short) 1);
        int[] intArray20 = ds.MaxMin2.maxMin2(intArray18, (-1));
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray22 = ds.MaxMin2.maxMin2(intArray18, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[-1, 1, 32, 10, 1, 1]");
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray16), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray18), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray20), "[-1, -1]");
    }

    @Test
    public void test689() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test689");
        int[] intArray6 = new int[] { (byte) -1, (byte) 1, ' ', (short) 10, (short) 1, (byte) 1 };
        int[] intArray8 = ds.MaxMin2.maxMin2(intArray6, (int) (byte) 0);
        int[] intArray10 = ds.MaxMin2.maxMin2(intArray6, (int) (short) 1);
        int[] intArray12 = ds.MaxMin2.maxMin2(intArray10, (-1));
        int[] intArray14 = ds.MaxMin2.maxMin2(intArray10, (int) (byte) 0);
        int[] intArray16 = ds.MaxMin2.maxMin2(intArray10, 1);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray18 = ds.MaxMin2.maxMin2(intArray10, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[-1, 1, 32, 10, 1, 1]");
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray16), "[-1, -1]");
    }

    @Test
    public void test690() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test690");
        int[] intArray0 = null;
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray2 = ds.MaxMin2.maxMin2(intArray0, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test691() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test691");
        int[] intArray6 = new int[] { (byte) -1, (byte) 1, ' ', (short) 10, (short) 1, (byte) 1 };
        int[] intArray8 = ds.MaxMin2.maxMin2(intArray6, (int) (byte) 0);
        int[] intArray10 = ds.MaxMin2.maxMin2(intArray6, (int) (short) 1);
        int[] intArray12 = ds.MaxMin2.maxMin2(intArray10, (-1));
        int[] intArray14 = ds.MaxMin2.maxMin2(intArray12, (int) (short) -1);
        int[] intArray16 = ds.MaxMin2.maxMin2(intArray14, (-1));
        int[] intArray18 = ds.MaxMin2.maxMin2(intArray14, 0);
        int[] intArray20 = ds.MaxMin2.maxMin2(intArray14, 1);
        int[] intArray22 = ds.MaxMin2.maxMin2(intArray20, (int) (byte) 1);
        int[] intArray24 = ds.MaxMin2.maxMin2(intArray22, (int) (short) -1);
        java.lang.Class<?> wildcardClass25 = intArray22.getClass();
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[-1, 1, 32, 10, 1, 1]");
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray16), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray18), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray20), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray22), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray24), "[-1, -1]");
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test692() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test692");
        int[] intArray4 = new int[] { (byte) 0, 10, '#', (short) 0 };
        int[] intArray6 = ds.MaxMin2.maxMin2(intArray4, (int) (short) 1);
        int[] intArray8 = ds.MaxMin2.maxMin2(intArray6, 0);
        int[] intArray10 = ds.MaxMin2.maxMin2(intArray8, 0);
        int[] intArray12 = ds.MaxMin2.maxMin2(intArray8, 0);
        int[] intArray14 = ds.MaxMin2.maxMin2(intArray12, 0);
        int[] intArray16 = ds.MaxMin2.maxMin2(intArray14, (-1));
        int[] intArray18 = ds.MaxMin2.maxMin2(intArray16, (int) (byte) 1);
        int[] intArray20 = ds.MaxMin2.maxMin2(intArray16, (int) (byte) 0);
        int[] intArray22 = ds.MaxMin2.maxMin2(intArray20, (int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray24 = ds.MaxMin2.maxMin2(intArray22, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[0, 10, 35, 0]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray16), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray18), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray20), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray22), "[0, 0]");
    }

    @Test
    public void test693() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test693");
        int[] intArray6 = new int[] { (byte) -1, (byte) 1, ' ', (short) 10, (short) 1, (byte) 1 };
        int[] intArray8 = ds.MaxMin2.maxMin2(intArray6, (int) (byte) 0);
        int[] intArray10 = ds.MaxMin2.maxMin2(intArray8, (-1));
        int[] intArray12 = ds.MaxMin2.maxMin2(intArray10, (int) (byte) -1);
        int[] intArray14 = ds.MaxMin2.maxMin2(intArray10, 1);
        int[] intArray16 = ds.MaxMin2.maxMin2(intArray14, 0);
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[-1, 1, 32, 10, 1, 1]");
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray16), "[-1, -1]");
    }

    @Test
    public void test694() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test694");
        int[] intArray6 = new int[] { (byte) -1, (byte) 1, ' ', (short) 10, (short) 1, (byte) 1 };
        int[] intArray8 = ds.MaxMin2.maxMin2(intArray6, (int) (byte) 0);
        int[] intArray10 = ds.MaxMin2.maxMin2(intArray6, (int) (short) 1);
        int[] intArray12 = ds.MaxMin2.maxMin2(intArray10, (-1));
        int[] intArray14 = ds.MaxMin2.maxMin2(intArray12, (int) (short) -1);
        int[] intArray16 = ds.MaxMin2.maxMin2(intArray14, (-1));
        int[] intArray18 = ds.MaxMin2.maxMin2(intArray16, (int) (short) 1);
        int[] intArray20 = ds.MaxMin2.maxMin2(intArray16, (int) (short) 0);
        int[] intArray22 = ds.MaxMin2.maxMin2(intArray20, (-1));
        int[] intArray24 = ds.MaxMin2.maxMin2(intArray20, (-1));
        int[] intArray26 = ds.MaxMin2.maxMin2(intArray24, (int) (short) 0);
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[-1, 1, 32, 10, 1, 1]");
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray16), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray18), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray20), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray22), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray24), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray26), "[-1, -1]");
    }

    @Test
    public void test695() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test695");
        int[] intArray6 = new int[] { (byte) -1, (byte) 1, ' ', (short) 10, (short) 1, (byte) 1 };
        int[] intArray8 = ds.MaxMin2.maxMin2(intArray6, (int) (byte) 0);
        int[] intArray10 = ds.MaxMin2.maxMin2(intArray6, (int) (byte) 1);
        int[] intArray12 = ds.MaxMin2.maxMin2(intArray10, (int) (byte) 1);
        int[] intArray14 = ds.MaxMin2.maxMin2(intArray12, (int) (byte) -1);
        int[] intArray16 = ds.MaxMin2.maxMin2(intArray12, (int) (short) 1);
        int[] intArray18 = ds.MaxMin2.maxMin2(intArray12, (int) (byte) -1);
        int[] intArray20 = ds.MaxMin2.maxMin2(intArray12, (int) (byte) 1);
        java.lang.Class<?> wildcardClass21 = intArray20.getClass();
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[-1, 1, 32, 10, 1, 1]");
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray16), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray18), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray20), "[-1, -1]");
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test696() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test696");
        int[] intArray4 = new int[] { (byte) 0, 10, '#', (short) 0 };
        int[] intArray6 = ds.MaxMin2.maxMin2(intArray4, (int) (short) 1);
        int[] intArray8 = ds.MaxMin2.maxMin2(intArray6, 0);
        int[] intArray10 = ds.MaxMin2.maxMin2(intArray8, (int) (byte) -1);
        int[] intArray12 = ds.MaxMin2.maxMin2(intArray10, 0);
        int[] intArray14 = ds.MaxMin2.maxMin2(intArray12, 0);
        int[] intArray16 = ds.MaxMin2.maxMin2(intArray14, (int) (byte) 1);
        int[] intArray18 = ds.MaxMin2.maxMin2(intArray14, (int) (byte) 0);
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[0, 10, 35, 0]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray16), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray18), "[0, 0]");
    }

    @Test
    public void test697() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test697");
        int[] intArray4 = new int[] { (byte) 0, 10, '#', (short) 0 };
        int[] intArray6 = ds.MaxMin2.maxMin2(intArray4, (int) (short) 1);
        int[] intArray8 = ds.MaxMin2.maxMin2(intArray4, (int) (short) 1);
        int[] intArray10 = ds.MaxMin2.maxMin2(intArray4, (-1));
        java.lang.Class<?> wildcardClass11 = intArray4.getClass();
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[0, 10, 35, 0]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[0, 0]");
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test698() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test698");
        int[] intArray6 = new int[] { (byte) -1, (byte) 1, ' ', (short) 10, (short) 1, (byte) 1 };
        int[] intArray8 = ds.MaxMin2.maxMin2(intArray6, (int) (byte) 0);
        int[] intArray10 = ds.MaxMin2.maxMin2(intArray6, (int) (short) 1);
        int[] intArray12 = ds.MaxMin2.maxMin2(intArray10, (-1));
        int[] intArray14 = ds.MaxMin2.maxMin2(intArray12, (int) (short) -1);
        int[] intArray16 = ds.MaxMin2.maxMin2(intArray14, (-1));
        int[] intArray18 = ds.MaxMin2.maxMin2(intArray16, (int) (short) 1);
        int[] intArray20 = ds.MaxMin2.maxMin2(intArray16, (int) (byte) 1);
        int[] intArray22 = ds.MaxMin2.maxMin2(intArray16, 0);
        int[] intArray24 = ds.MaxMin2.maxMin2(intArray22, 0);
        int[] intArray26 = ds.MaxMin2.maxMin2(intArray24, (int) (short) 0);
        int[] intArray28 = ds.MaxMin2.maxMin2(intArray24, (int) (byte) 0);
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[-1, 1, 32, 10, 1, 1]");
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray16), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray18), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray20), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray22), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray24), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray26), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray28);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray28), "[-1, -1]");
    }

    @Test
    public void test699() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test699");
        int[] intArray6 = new int[] { (byte) -1, (byte) 1, ' ', (short) 10, (short) 1, (byte) 1 };
        int[] intArray8 = ds.MaxMin2.maxMin2(intArray6, (int) (byte) 0);
        int[] intArray10 = ds.MaxMin2.maxMin2(intArray6, (int) (short) 1);
        int[] intArray12 = ds.MaxMin2.maxMin2(intArray10, (-1));
        int[] intArray14 = ds.MaxMin2.maxMin2(intArray12, (int) (short) -1);
        int[] intArray16 = ds.MaxMin2.maxMin2(intArray14, (-1));
        int[] intArray18 = ds.MaxMin2.maxMin2(intArray14, 0);
        int[] intArray20 = ds.MaxMin2.maxMin2(intArray14, 1);
        int[] intArray22 = ds.MaxMin2.maxMin2(intArray20, (int) (byte) 1);
        int[] intArray24 = ds.MaxMin2.maxMin2(intArray20, (int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray26 = ds.MaxMin2.maxMin2(intArray20, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[-1, 1, 32, 10, 1, 1]");
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray16), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray18), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray20), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray22), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray24), "[-1, -1]");
    }

    @Test
    public void test700() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test700");
        int[] intArray6 = new int[] { (byte) -1, (byte) 1, ' ', (short) 10, (short) 1, (byte) 1 };
        int[] intArray8 = ds.MaxMin2.maxMin2(intArray6, (int) (byte) 0);
        int[] intArray10 = ds.MaxMin2.maxMin2(intArray6, (int) (short) 1);
        int[] intArray12 = ds.MaxMin2.maxMin2(intArray10, (-1));
        int[] intArray14 = ds.MaxMin2.maxMin2(intArray12, (int) (short) -1);
        int[] intArray16 = ds.MaxMin2.maxMin2(intArray14, (-1));
        int[] intArray18 = ds.MaxMin2.maxMin2(intArray16, (int) (short) 1);
        int[] intArray20 = ds.MaxMin2.maxMin2(intArray16, (int) (short) 0);
        int[] intArray22 = ds.MaxMin2.maxMin2(intArray20, (-1));
        int[] intArray24 = ds.MaxMin2.maxMin2(intArray20, (-1));
        java.lang.Class<?> wildcardClass25 = intArray24.getClass();
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[-1, 1, 32, 10, 1, 1]");
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray16), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray18), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray20), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray22), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray24), "[-1, -1]");
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test701() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test701");
        int[] intArray6 = new int[] { (byte) -1, (byte) 1, ' ', (short) 10, (short) 1, (byte) 1 };
        int[] intArray8 = ds.MaxMin2.maxMin2(intArray6, (int) (byte) 0);
        int[] intArray10 = ds.MaxMin2.maxMin2(intArray6, (int) (short) 1);
        int[] intArray12 = ds.MaxMin2.maxMin2(intArray10, (-1));
        int[] intArray14 = ds.MaxMin2.maxMin2(intArray12, (int) (short) -1);
        int[] intArray16 = ds.MaxMin2.maxMin2(intArray14, (-1));
        int[] intArray18 = ds.MaxMin2.maxMin2(intArray16, (int) (short) 1);
        int[] intArray20 = ds.MaxMin2.maxMin2(intArray16, (int) (short) 0);
        int[] intArray22 = ds.MaxMin2.maxMin2(intArray20, (-1));
        int[] intArray24 = ds.MaxMin2.maxMin2(intArray22, 0);
        int[] intArray26 = ds.MaxMin2.maxMin2(intArray24, 1);
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[-1, 1, 32, 10, 1, 1]");
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray16), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray18), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray20), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray22), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray24), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray26), "[-1, -1]");
    }

    @Test
    public void test702() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test702");
        int[] intArray6 = new int[] { (byte) -1, (byte) 1, ' ', (short) 10, (short) 1, (byte) 1 };
        int[] intArray8 = ds.MaxMin2.maxMin2(intArray6, (int) (byte) 0);
        int[] intArray10 = ds.MaxMin2.maxMin2(intArray6, (int) (byte) 1);
        int[] intArray12 = ds.MaxMin2.maxMin2(intArray10, 0);
        java.lang.Class<?> wildcardClass13 = intArray10.getClass();
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[-1, 1, 32, 10, 1, 1]");
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[-1, -1]");
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test703() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test703");
        int[] intArray6 = new int[] { (byte) -1, (byte) 1, ' ', (short) 10, (short) 1, (byte) 1 };
        int[] intArray8 = ds.MaxMin2.maxMin2(intArray6, (int) (byte) 0);
        int[] intArray10 = ds.MaxMin2.maxMin2(intArray6, (int) (byte) 0);
        int[] intArray12 = ds.MaxMin2.maxMin2(intArray10, (int) (short) 0);
        int[] intArray14 = ds.MaxMin2.maxMin2(intArray10, (int) (short) -1);
        int[] intArray16 = ds.MaxMin2.maxMin2(intArray10, (int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray18 = ds.MaxMin2.maxMin2(intArray16, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[-1, 1, 32, 10, 1, 1]");
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray16), "[-1, -1]");
    }

    @Test
    public void test704() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test704");
        int[] intArray6 = new int[] { (byte) -1, (byte) 1, ' ', (short) 10, (short) 1, (byte) 1 };
        int[] intArray8 = ds.MaxMin2.maxMin2(intArray6, (int) (byte) 0);
        int[] intArray10 = ds.MaxMin2.maxMin2(intArray6, (int) (byte) 1);
        int[] intArray12 = ds.MaxMin2.maxMin2(intArray10, 0);
        java.lang.Class<?> wildcardClass13 = intArray12.getClass();
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[-1, 1, 32, 10, 1, 1]");
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[-1, -1]");
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test705() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test705");
        int[] intArray6 = new int[] { (byte) -1, (byte) 1, ' ', (short) 10, (short) 1, (byte) 1 };
        int[] intArray8 = ds.MaxMin2.maxMin2(intArray6, (int) (byte) 0);
        int[] intArray10 = ds.MaxMin2.maxMin2(intArray6, (int) (short) 1);
        int[] intArray12 = ds.MaxMin2.maxMin2(intArray10, (-1));
        int[] intArray14 = ds.MaxMin2.maxMin2(intArray12, (int) (short) -1);
        int[] intArray16 = ds.MaxMin2.maxMin2(intArray12, (int) (byte) 1);
        int[] intArray18 = ds.MaxMin2.maxMin2(intArray12, 1);
        java.lang.Class<?> wildcardClass19 = intArray18.getClass();
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[-1, 1, 32, 10, 1, 1]");
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray16), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray18), "[-1, -1]");
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test706() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test706");
        int[] intArray6 = new int[] { (byte) -1, (byte) 1, ' ', (short) 10, (short) 1, (byte) 1 };
        int[] intArray8 = ds.MaxMin2.maxMin2(intArray6, (int) (byte) 0);
        int[] intArray10 = ds.MaxMin2.maxMin2(intArray6, (int) (byte) 1);
        int[] intArray12 = ds.MaxMin2.maxMin2(intArray6, (int) (byte) -1);
        int[] intArray14 = ds.MaxMin2.maxMin2(intArray6, 0);
        java.lang.Class<?> wildcardClass15 = intArray14.getClass();
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[-1, 1, 32, 10, 1, 1]");
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[-1, -1]");
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test707() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test707");
        int[] intArray4 = new int[] { (byte) 0, 10, '#', (short) 0 };
        int[] intArray6 = ds.MaxMin2.maxMin2(intArray4, (int) (short) 1);
        int[] intArray8 = ds.MaxMin2.maxMin2(intArray6, 0);
        int[] intArray10 = ds.MaxMin2.maxMin2(intArray8, 0);
        int[] intArray12 = ds.MaxMin2.maxMin2(intArray8, 0);
        int[] intArray14 = ds.MaxMin2.maxMin2(intArray12, 0);
        int[] intArray16 = ds.MaxMin2.maxMin2(intArray12, (int) (short) -1);
        int[] intArray18 = ds.MaxMin2.maxMin2(intArray16, (int) (short) 0);
        java.lang.Class<?> wildcardClass19 = intArray16.getClass();
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[0, 10, 35, 0]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray16), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray18), "[0, 0]");
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test708() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test708");
        int[] intArray4 = new int[] { (byte) 0, 10, '#', (short) 0 };
        int[] intArray6 = ds.MaxMin2.maxMin2(intArray4, (int) (short) 1);
        int[] intArray8 = ds.MaxMin2.maxMin2(intArray6, 0);
        int[] intArray10 = ds.MaxMin2.maxMin2(intArray8, (int) (byte) -1);
        int[] intArray12 = ds.MaxMin2.maxMin2(intArray10, 0);
        int[] intArray14 = ds.MaxMin2.maxMin2(intArray10, (int) (byte) 1);
        java.lang.Class<?> wildcardClass15 = intArray14.getClass();
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[0, 10, 35, 0]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[0, 0]");
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test709() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test709");
        int[] intArray6 = new int[] { (byte) -1, (byte) 1, ' ', (short) 10, (short) 1, (byte) 1 };
        int[] intArray8 = ds.MaxMin2.maxMin2(intArray6, (int) (byte) 0);
        int[] intArray10 = ds.MaxMin2.maxMin2(intArray6, (int) (byte) 1);
        int[] intArray12 = ds.MaxMin2.maxMin2(intArray6, (int) (byte) -1);
        int[] intArray14 = ds.MaxMin2.maxMin2(intArray6, 1);
        int[] intArray16 = ds.MaxMin2.maxMin2(intArray6, (int) (short) -1);
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[-1, 1, 32, 10, 1, 1]");
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray16), "[-1, -1]");
    }

    @Test
    public void test710() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test710");
        int[] intArray6 = new int[] { (byte) -1, (byte) 1, ' ', (short) 10, (short) 1, (byte) 1 };
        int[] intArray8 = ds.MaxMin2.maxMin2(intArray6, (int) (byte) 0);
        int[] intArray10 = ds.MaxMin2.maxMin2(intArray6, (int) (short) 1);
        int[] intArray12 = ds.MaxMin2.maxMin2(intArray10, (-1));
        int[] intArray14 = ds.MaxMin2.maxMin2(intArray12, (int) (short) -1);
        int[] intArray16 = ds.MaxMin2.maxMin2(intArray14, (-1));
        int[] intArray18 = ds.MaxMin2.maxMin2(intArray16, (int) (short) 1);
        int[] intArray20 = ds.MaxMin2.maxMin2(intArray16, (int) (byte) 1);
        int[] intArray22 = ds.MaxMin2.maxMin2(intArray16, 0);
        int[] intArray24 = ds.MaxMin2.maxMin2(intArray22, 0);
        int[] intArray26 = ds.MaxMin2.maxMin2(intArray24, (int) (short) 0);
        int[] intArray28 = ds.MaxMin2.maxMin2(intArray24, 0);
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[-1, 1, 32, 10, 1, 1]");
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray16), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray18), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray20), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray22), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray24), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray26), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray28);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray28), "[-1, -1]");
    }

    @Test
    public void test711() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test711");
        int[] intArray4 = new int[] { (byte) 0, 10, '#', (short) 0 };
        int[] intArray6 = ds.MaxMin2.maxMin2(intArray4, (int) (short) 1);
        int[] intArray8 = ds.MaxMin2.maxMin2(intArray6, 0);
        int[] intArray10 = ds.MaxMin2.maxMin2(intArray8, (int) (byte) -1);
        int[] intArray12 = ds.MaxMin2.maxMin2(intArray10, 0);
        int[] intArray14 = ds.MaxMin2.maxMin2(intArray12, (int) (short) 0);
        int[] intArray16 = ds.MaxMin2.maxMin2(intArray14, (int) (short) -1);
        int[] intArray18 = ds.MaxMin2.maxMin2(intArray14, (int) (short) 0);
        int[] intArray20 = ds.MaxMin2.maxMin2(intArray14, 1);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray22 = ds.MaxMin2.maxMin2(intArray20, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[0, 10, 35, 0]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray16), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray18), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray20), "[0, 0]");
    }

    @Test
    public void test712() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test712");
        int[] intArray6 = new int[] { (byte) -1, (byte) 1, ' ', (short) 10, (short) 1, (byte) 1 };
        int[] intArray8 = ds.MaxMin2.maxMin2(intArray6, (int) (byte) 0);
        int[] intArray10 = ds.MaxMin2.maxMin2(intArray6, (int) (short) 1);
        int[] intArray12 = ds.MaxMin2.maxMin2(intArray10, (-1));
        int[] intArray14 = ds.MaxMin2.maxMin2(intArray12, (int) (byte) -1);
        int[] intArray16 = ds.MaxMin2.maxMin2(intArray14, (int) (short) 1);
        int[] intArray18 = ds.MaxMin2.maxMin2(intArray16, (int) (byte) -1);
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[-1, 1, 32, 10, 1, 1]");
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray16), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray18), "[-1, -1]");
    }

    @Test
    public void test713() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test713");
        int[] intArray4 = new int[] { (byte) 0, 10, '#', (short) 0 };
        int[] intArray6 = ds.MaxMin2.maxMin2(intArray4, (int) (short) 1);
        int[] intArray8 = ds.MaxMin2.maxMin2(intArray6, 0);
        int[] intArray10 = ds.MaxMin2.maxMin2(intArray8, (int) (byte) -1);
        int[] intArray12 = ds.MaxMin2.maxMin2(intArray10, 0);
        int[] intArray14 = ds.MaxMin2.maxMin2(intArray10, (int) (short) 0);
        int[] intArray16 = ds.MaxMin2.maxMin2(intArray14, 1);
        int[] intArray18 = ds.MaxMin2.maxMin2(intArray16, (int) (short) -1);
        java.lang.Class<?> wildcardClass19 = intArray16.getClass();
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[0, 10, 35, 0]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray16), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray18), "[0, 0]");
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test714() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test714");
        int[] intArray4 = new int[] { (byte) 0, 10, '#', (short) 0 };
        int[] intArray6 = ds.MaxMin2.maxMin2(intArray4, (int) (short) 1);
        int[] intArray8 = ds.MaxMin2.maxMin2(intArray6, 0);
        int[] intArray10 = ds.MaxMin2.maxMin2(intArray8, (int) (byte) -1);
        int[] intArray12 = ds.MaxMin2.maxMin2(intArray10, 0);
        int[] intArray14 = ds.MaxMin2.maxMin2(intArray12, 0);
        int[] intArray16 = ds.MaxMin2.maxMin2(intArray14, (int) (short) 1);
        int[] intArray18 = ds.MaxMin2.maxMin2(intArray16, (int) (short) 1);
        int[] intArray20 = ds.MaxMin2.maxMin2(intArray16, (int) (byte) -1);
        java.lang.Class<?> wildcardClass21 = intArray20.getClass();
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[0, 10, 35, 0]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray16), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray18), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray20), "[0, 0]");
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test715() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test715");
        int[] intArray6 = new int[] { (byte) -1, (byte) 1, ' ', (short) 10, (short) 1, (byte) 1 };
        int[] intArray8 = ds.MaxMin2.maxMin2(intArray6, (int) (byte) 0);
        int[] intArray10 = ds.MaxMin2.maxMin2(intArray6, (int) (short) 1);
        int[] intArray12 = ds.MaxMin2.maxMin2(intArray10, (-1));
        int[] intArray14 = ds.MaxMin2.maxMin2(intArray10, (int) (byte) 0);
        int[] intArray16 = ds.MaxMin2.maxMin2(intArray10, 1);
        int[] intArray18 = ds.MaxMin2.maxMin2(intArray16, (int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray20 = ds.MaxMin2.maxMin2(intArray18, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[-1, 1, 32, 10, 1, 1]");
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray16), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray18), "[-1, -1]");
    }

    @Test
    public void test716() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test716");
        int[] intArray6 = new int[] { (byte) -1, (byte) 1, ' ', (short) 10, (short) 1, (byte) 1 };
        int[] intArray8 = ds.MaxMin2.maxMin2(intArray6, (int) (byte) 0);
        int[] intArray10 = ds.MaxMin2.maxMin2(intArray6, (int) (short) 1);
        int[] intArray12 = ds.MaxMin2.maxMin2(intArray10, (-1));
        int[] intArray14 = ds.MaxMin2.maxMin2(intArray10, (int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray16 = ds.MaxMin2.maxMin2(intArray10, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[-1, 1, 32, 10, 1, 1]");
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[-1, -1]");
    }

    @Test
    public void test717() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test717");
        int[] intArray4 = new int[] { (byte) 0, 10, '#', (short) 0 };
        int[] intArray6 = ds.MaxMin2.maxMin2(intArray4, (int) (short) 1);
        int[] intArray8 = ds.MaxMin2.maxMin2(intArray4, (int) (byte) -1);
        int[] intArray10 = ds.MaxMin2.maxMin2(intArray8, (int) (short) -1);
        int[] intArray12 = ds.MaxMin2.maxMin2(intArray8, (-1));
        java.lang.Class<?> wildcardClass13 = intArray8.getClass();
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[0, 10, 35, 0]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[0, 0]");
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test718() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test718");
        int[] intArray4 = new int[] { (byte) 0, 10, '#', (short) 0 };
        int[] intArray6 = ds.MaxMin2.maxMin2(intArray4, (int) (short) 1);
        int[] intArray8 = ds.MaxMin2.maxMin2(intArray6, 0);
        int[] intArray10 = ds.MaxMin2.maxMin2(intArray8, 0);
        int[] intArray12 = ds.MaxMin2.maxMin2(intArray8, 0);
        int[] intArray14 = ds.MaxMin2.maxMin2(intArray12, 0);
        int[] intArray16 = ds.MaxMin2.maxMin2(intArray14, (-1));
        int[] intArray18 = ds.MaxMin2.maxMin2(intArray16, (int) (byte) 0);
        int[] intArray20 = ds.MaxMin2.maxMin2(intArray18, (int) (byte) 1);
        int[] intArray22 = ds.MaxMin2.maxMin2(intArray18, 0);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray24 = ds.MaxMin2.maxMin2(intArray22, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[0, 10, 35, 0]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray16), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray18), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray20), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray22), "[0, 0]");
    }

    @Test
    public void test719() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test719");
        int[] intArray4 = new int[] { (byte) 0, 10, '#', (short) 0 };
        int[] intArray6 = ds.MaxMin2.maxMin2(intArray4, (int) (short) 1);
        int[] intArray8 = ds.MaxMin2.maxMin2(intArray6, 0);
        int[] intArray10 = ds.MaxMin2.maxMin2(intArray8, 0);
        int[] intArray12 = ds.MaxMin2.maxMin2(intArray8, 0);
        int[] intArray14 = ds.MaxMin2.maxMin2(intArray12, 0);
        int[] intArray16 = ds.MaxMin2.maxMin2(intArray12, 0);
        int[] intArray18 = ds.MaxMin2.maxMin2(intArray16, 1);
        int[] intArray20 = ds.MaxMin2.maxMin2(intArray16, (int) (byte) 0);
        int[] intArray22 = ds.MaxMin2.maxMin2(intArray20, 1);
        java.lang.Class<?> wildcardClass23 = intArray22.getClass();
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[0, 10, 35, 0]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray16), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray18), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray20), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray22), "[0, 0]");
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test720() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test720");
        int[] intArray6 = new int[] { (byte) -1, (byte) 1, ' ', (short) 10, (short) 1, (byte) 1 };
        int[] intArray8 = ds.MaxMin2.maxMin2(intArray6, (int) (byte) 0);
        int[] intArray10 = ds.MaxMin2.maxMin2(intArray6, (int) (short) 1);
        int[] intArray12 = ds.MaxMin2.maxMin2(intArray10, (-1));
        int[] intArray14 = ds.MaxMin2.maxMin2(intArray12, (int) (short) -1);
        int[] intArray16 = ds.MaxMin2.maxMin2(intArray14, (-1));
        int[] intArray18 = ds.MaxMin2.maxMin2(intArray14, 0);
        int[] intArray20 = ds.MaxMin2.maxMin2(intArray14, 1);
        int[] intArray22 = ds.MaxMin2.maxMin2(intArray20, (int) (byte) 1);
        int[] intArray24 = ds.MaxMin2.maxMin2(intArray22, (int) (short) -1);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray26 = ds.MaxMin2.maxMin2(intArray22, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[-1, 1, 32, 10, 1, 1]");
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray16), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray18), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray20), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray22), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray24), "[-1, -1]");
    }

    @Test
    public void test721() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test721");
        int[] intArray6 = new int[] { (byte) -1, (byte) 1, ' ', (short) 10, (short) 1, (byte) 1 };
        int[] intArray8 = ds.MaxMin2.maxMin2(intArray6, (int) (byte) 0);
        int[] intArray10 = ds.MaxMin2.maxMin2(intArray6, (int) (byte) 1);
        int[] intArray12 = ds.MaxMin2.maxMin2(intArray10, (int) (byte) 1);
        int[] intArray14 = ds.MaxMin2.maxMin2(intArray12, (int) (byte) -1);
        int[] intArray16 = ds.MaxMin2.maxMin2(intArray12, (int) (short) 1);
        int[] intArray18 = ds.MaxMin2.maxMin2(intArray12, 1);
        int[] intArray20 = ds.MaxMin2.maxMin2(intArray12, (int) (short) -1);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray22 = ds.MaxMin2.maxMin2(intArray12, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[-1, 1, 32, 10, 1, 1]");
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray16), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray18), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray20), "[-1, -1]");
    }

    @Test
    public void test722() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test722");
        int[] intArray6 = new int[] { (byte) -1, (byte) 1, ' ', (short) 10, (short) 1, (byte) 1 };
        int[] intArray8 = ds.MaxMin2.maxMin2(intArray6, (int) (byte) 0);
        int[] intArray10 = ds.MaxMin2.maxMin2(intArray8, (int) (short) -1);
        int[] intArray12 = ds.MaxMin2.maxMin2(intArray8, (int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray14 = ds.MaxMin2.maxMin2(intArray8, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[-1, 1, 32, 10, 1, 1]");
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[-1, -1]");
    }

    @Test
    public void test723() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test723");
        int[] intArray4 = new int[] { (byte) 0, 10, '#', (short) 0 };
        int[] intArray6 = ds.MaxMin2.maxMin2(intArray4, (int) (short) 1);
        int[] intArray8 = ds.MaxMin2.maxMin2(intArray6, 0);
        int[] intArray10 = ds.MaxMin2.maxMin2(intArray8, 0);
        int[] intArray12 = ds.MaxMin2.maxMin2(intArray8, 0);
        int[] intArray14 = ds.MaxMin2.maxMin2(intArray12, 0);
        int[] intArray16 = ds.MaxMin2.maxMin2(intArray14, (-1));
        int[] intArray18 = ds.MaxMin2.maxMin2(intArray16, (int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray20 = ds.MaxMin2.maxMin2(intArray18, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[0, 10, 35, 0]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray16), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray18), "[0, 0]");
    }

    @Test
    public void test724() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test724");
        int[] intArray4 = new int[] { (byte) 0, 10, '#', (short) 0 };
        int[] intArray6 = ds.MaxMin2.maxMin2(intArray4, (int) (short) 1);
        int[] intArray8 = ds.MaxMin2.maxMin2(intArray4, (int) (byte) -1);
        int[] intArray10 = ds.MaxMin2.maxMin2(intArray8, (int) (short) -1);
        int[] intArray12 = ds.MaxMin2.maxMin2(intArray8, (-1));
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray14 = ds.MaxMin2.maxMin2(intArray12, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[0, 10, 35, 0]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[0, 0]");
    }

    @Test
    public void test725() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test725");
        int[] intArray5 = new int[] { (short) 100, 1, 0, 100, ' ' };
        int[] intArray7 = ds.MaxMin2.maxMin2(intArray5, (int) (byte) 0);
        java.lang.Class<?> wildcardClass8 = intArray7.getClass();
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[100, 1, 0, 100, 32]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[100, 100]");
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test726() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test726");
        int[] intArray4 = new int[] { (byte) 0, 10, '#', (short) 0 };
        int[] intArray6 = ds.MaxMin2.maxMin2(intArray4, (int) (short) 1);
        int[] intArray8 = ds.MaxMin2.maxMin2(intArray6, 0);
        int[] intArray10 = ds.MaxMin2.maxMin2(intArray8, 0);
        int[] intArray12 = ds.MaxMin2.maxMin2(intArray8, 0);
        int[] intArray14 = ds.MaxMin2.maxMin2(intArray12, (int) (byte) 0);
        int[] intArray16 = ds.MaxMin2.maxMin2(intArray14, (int) (short) 1);
        int[] intArray18 = ds.MaxMin2.maxMin2(intArray14, (int) (short) -1);
        int[] intArray20 = ds.MaxMin2.maxMin2(intArray14, (int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray22 = ds.MaxMin2.maxMin2(intArray14, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[0, 10, 35, 0]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray16), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray18), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray20), "[0, 0]");
    }

    @Test
    public void test727() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test727");
        int[] intArray4 = new int[] { (byte) 0, 10, '#', (short) 0 };
        int[] intArray6 = ds.MaxMin2.maxMin2(intArray4, (int) (short) 1);
        int[] intArray8 = ds.MaxMin2.maxMin2(intArray4, (int) (byte) -1);
        int[] intArray10 = ds.MaxMin2.maxMin2(intArray8, (int) (short) 0);
        int[] intArray12 = ds.MaxMin2.maxMin2(intArray8, (int) (short) -1);
        java.lang.Class<?> wildcardClass13 = intArray8.getClass();
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[0, 10, 35, 0]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[0, 0]");
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test728() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test728");
        int[] intArray4 = new int[] { (byte) 0, 10, '#', (short) 0 };
        int[] intArray6 = ds.MaxMin2.maxMin2(intArray4, (int) (short) 1);
        int[] intArray8 = ds.MaxMin2.maxMin2(intArray6, 0);
        int[] intArray10 = ds.MaxMin2.maxMin2(intArray8, (int) (byte) -1);
        int[] intArray12 = ds.MaxMin2.maxMin2(intArray10, 0);
        int[] intArray14 = ds.MaxMin2.maxMin2(intArray12, 0);
        int[] intArray16 = ds.MaxMin2.maxMin2(intArray14, (int) (short) 1);
        int[] intArray18 = ds.MaxMin2.maxMin2(intArray14, 0);
        int[] intArray20 = ds.MaxMin2.maxMin2(intArray18, (int) (short) -1);
        int[] intArray22 = ds.MaxMin2.maxMin2(intArray20, (int) (byte) 1);
        java.lang.Class<?> wildcardClass23 = intArray20.getClass();
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[0, 10, 35, 0]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray16), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray18), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray20), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray22), "[0, 0]");
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test729() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test729");
        int[] intArray4 = new int[] { (byte) 0, 10, '#', (short) 0 };
        int[] intArray6 = ds.MaxMin2.maxMin2(intArray4, (int) (short) 1);
        int[] intArray8 = ds.MaxMin2.maxMin2(intArray6, 0);
        int[] intArray10 = ds.MaxMin2.maxMin2(intArray6, 0);
        int[] intArray12 = ds.MaxMin2.maxMin2(intArray10, (-1));
        java.lang.Class<?> wildcardClass13 = intArray12.getClass();
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[0, 10, 35, 0]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[0, 0]");
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test730() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test730");
        int[] intArray4 = new int[] { (byte) 0, 10, '#', (short) 0 };
        int[] intArray6 = ds.MaxMin2.maxMin2(intArray4, (int) (short) 1);
        int[] intArray8 = ds.MaxMin2.maxMin2(intArray6, 0);
        int[] intArray10 = ds.MaxMin2.maxMin2(intArray8, 0);
        int[] intArray12 = ds.MaxMin2.maxMin2(intArray8, 0);
        int[] intArray14 = ds.MaxMin2.maxMin2(intArray12, (int) (byte) 0);
        int[] intArray16 = ds.MaxMin2.maxMin2(intArray12, (int) (byte) 1);
        int[] intArray18 = ds.MaxMin2.maxMin2(intArray16, 0);
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[0, 10, 35, 0]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray16), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray18), "[0, 0]");
    }

    @Test
    public void test731() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test731");
        int[] intArray6 = new int[] { (byte) -1, (byte) 1, ' ', (short) 10, (short) 1, (byte) 1 };
        int[] intArray8 = ds.MaxMin2.maxMin2(intArray6, (int) (byte) 0);
        int[] intArray10 = ds.MaxMin2.maxMin2(intArray6, (int) (byte) 0);
        int[] intArray12 = ds.MaxMin2.maxMin2(intArray10, (int) (short) -1);
        int[] intArray14 = ds.MaxMin2.maxMin2(intArray10, (int) (byte) -1);
        int[] intArray16 = ds.MaxMin2.maxMin2(intArray14, (int) (byte) 0);
        int[] intArray18 = ds.MaxMin2.maxMin2(intArray14, 0);
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[-1, 1, 32, 10, 1, 1]");
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray16), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray18), "[-1, -1]");
    }

    @Test
    public void test732() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test732");
        int[] intArray4 = new int[] { (byte) 0, 10, '#', (short) 0 };
        int[] intArray6 = ds.MaxMin2.maxMin2(intArray4, (int) (short) 1);
        int[] intArray8 = ds.MaxMin2.maxMin2(intArray6, 0);
        int[] intArray10 = ds.MaxMin2.maxMin2(intArray8, (int) (byte) -1);
        int[] intArray12 = ds.MaxMin2.maxMin2(intArray10, 0);
        int[] intArray14 = ds.MaxMin2.maxMin2(intArray10, (int) (byte) 1);
        int[] intArray16 = ds.MaxMin2.maxMin2(intArray14, 1);
        int[] intArray18 = ds.MaxMin2.maxMin2(intArray16, (int) (byte) 0);
        int[] intArray20 = ds.MaxMin2.maxMin2(intArray16, (int) (short) 0);
        java.lang.Class<?> wildcardClass21 = intArray16.getClass();
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[0, 10, 35, 0]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray16), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray18), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray20), "[0, 0]");
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test733() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test733");
        int[] intArray4 = new int[] { (byte) 0, 10, '#', (short) 0 };
        int[] intArray6 = ds.MaxMin2.maxMin2(intArray4, (int) (short) 1);
        int[] intArray8 = ds.MaxMin2.maxMin2(intArray4, (int) (short) 1);
        int[] intArray10 = ds.MaxMin2.maxMin2(intArray8, (int) (byte) -1);
        int[] intArray12 = ds.MaxMin2.maxMin2(intArray10, 1);
        int[] intArray14 = ds.MaxMin2.maxMin2(intArray10, 1);
        int[] intArray16 = ds.MaxMin2.maxMin2(intArray10, (int) (short) -1);
        int[] intArray18 = ds.MaxMin2.maxMin2(intArray16, (int) (short) 0);
        java.lang.Class<?> wildcardClass19 = intArray16.getClass();
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[0, 10, 35, 0]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray16), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray18), "[0, 0]");
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test734() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test734");
        int[] intArray4 = new int[] { (byte) 0, 10, '#', (short) 0 };
        int[] intArray6 = ds.MaxMin2.maxMin2(intArray4, (int) (short) 1);
        int[] intArray8 = ds.MaxMin2.maxMin2(intArray6, 0);
        int[] intArray10 = ds.MaxMin2.maxMin2(intArray8, (int) (byte) -1);
        int[] intArray12 = ds.MaxMin2.maxMin2(intArray10, 0);
        int[] intArray14 = ds.MaxMin2.maxMin2(intArray12, 0);
        int[] intArray16 = ds.MaxMin2.maxMin2(intArray14, (int) (short) 1);
        int[] intArray18 = ds.MaxMin2.maxMin2(intArray16, (int) (short) -1);
        int[] intArray20 = ds.MaxMin2.maxMin2(intArray18, (int) (short) 1);
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[0, 10, 35, 0]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray16), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray18), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray20), "[0, 0]");
    }

    @Test
    public void test735() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test735");
        int[] intArray6 = new int[] { (byte) -1, (byte) 1, ' ', (short) 10, (short) 1, (byte) 1 };
        int[] intArray8 = ds.MaxMin2.maxMin2(intArray6, (int) (byte) 0);
        int[] intArray10 = ds.MaxMin2.maxMin2(intArray6, (int) (short) 1);
        int[] intArray12 = ds.MaxMin2.maxMin2(intArray10, (-1));
        int[] intArray14 = ds.MaxMin2.maxMin2(intArray12, (int) (short) -1);
        int[] intArray16 = ds.MaxMin2.maxMin2(intArray14, (-1));
        int[] intArray18 = ds.MaxMin2.maxMin2(intArray16, (int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray20 = ds.MaxMin2.maxMin2(intArray18, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[-1, 1, 32, 10, 1, 1]");
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray16), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray18), "[-1, -1]");
    }

    @Test
    public void test736() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test736");
        int[] intArray4 = new int[] { (byte) 0, 10, '#', (short) 0 };
        int[] intArray6 = ds.MaxMin2.maxMin2(intArray4, (int) (short) 1);
        int[] intArray8 = ds.MaxMin2.maxMin2(intArray6, 0);
        int[] intArray10 = ds.MaxMin2.maxMin2(intArray8, 0);
        int[] intArray12 = ds.MaxMin2.maxMin2(intArray8, 0);
        int[] intArray14 = ds.MaxMin2.maxMin2(intArray12, (int) (byte) 0);
        int[] intArray16 = ds.MaxMin2.maxMin2(intArray12, (int) (byte) 1);
        java.lang.Class<?> wildcardClass17 = intArray12.getClass();
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[0, 10, 35, 0]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray16), "[0, 0]");
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test737() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test737");
        int[] intArray4 = new int[] { (byte) 0, 10, '#', (short) 0 };
        int[] intArray6 = ds.MaxMin2.maxMin2(intArray4, (int) (short) 1);
        int[] intArray8 = ds.MaxMin2.maxMin2(intArray4, (int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray10 = ds.MaxMin2.maxMin2(intArray4, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[0, 10, 35, 0]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[0, 0]");
    }

    @Test
    public void test738() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test738");
        int[] intArray4 = new int[] { (byte) 0, 10, '#', (short) 0 };
        int[] intArray6 = ds.MaxMin2.maxMin2(intArray4, (int) (short) 1);
        int[] intArray8 = ds.MaxMin2.maxMin2(intArray6, 0);
        int[] intArray10 = ds.MaxMin2.maxMin2(intArray8, (int) (byte) -1);
        int[] intArray12 = ds.MaxMin2.maxMin2(intArray10, 0);
        int[] intArray14 = ds.MaxMin2.maxMin2(intArray10, (int) (byte) 1);
        int[] intArray16 = ds.MaxMin2.maxMin2(intArray14, 1);
        int[] intArray18 = ds.MaxMin2.maxMin2(intArray16, (int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray20 = ds.MaxMin2.maxMin2(intArray16, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[0, 10, 35, 0]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray16), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray18), "[0, 0]");
    }

    @Test
    public void test739() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test739");
        int[] intArray6 = new int[] { (byte) -1, (byte) 1, ' ', (short) 10, (short) 1, (byte) 1 };
        int[] intArray8 = ds.MaxMin2.maxMin2(intArray6, (int) (byte) 0);
        int[] intArray10 = ds.MaxMin2.maxMin2(intArray6, (int) (short) 1);
        int[] intArray12 = ds.MaxMin2.maxMin2(intArray10, (-1));
        int[] intArray14 = ds.MaxMin2.maxMin2(intArray12, (int) (short) -1);
        int[] intArray16 = ds.MaxMin2.maxMin2(intArray14, (-1));
        int[] intArray18 = ds.MaxMin2.maxMin2(intArray14, 0);
        int[] intArray20 = ds.MaxMin2.maxMin2(intArray18, 0);
        int[] intArray22 = ds.MaxMin2.maxMin2(intArray18, 0);
        int[] intArray24 = ds.MaxMin2.maxMin2(intArray18, (int) (byte) 1);
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[-1, 1, 32, 10, 1, 1]");
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray16), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray18), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray20), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray22), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray24), "[-1, -1]");
    }

    @Test
    public void test740() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test740");
        int[] intArray4 = new int[] { (byte) 0, 10, '#', (short) 0 };
        int[] intArray6 = ds.MaxMin2.maxMin2(intArray4, (int) (short) 1);
        int[] intArray8 = ds.MaxMin2.maxMin2(intArray6, 0);
        int[] intArray10 = ds.MaxMin2.maxMin2(intArray8, 0);
        int[] intArray12 = ds.MaxMin2.maxMin2(intArray8, 0);
        int[] intArray14 = ds.MaxMin2.maxMin2(intArray12, 0);
        int[] intArray16 = ds.MaxMin2.maxMin2(intArray14, (-1));
        int[] intArray18 = ds.MaxMin2.maxMin2(intArray16, 0);
        int[] intArray20 = ds.MaxMin2.maxMin2(intArray18, (int) (byte) 0);
        java.lang.Class<?> wildcardClass21 = intArray20.getClass();
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[0, 10, 35, 0]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray16), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray18), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray20), "[0, 0]");
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test741() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test741");
        int[] intArray4 = new int[] { (byte) 0, 10, '#', (short) 0 };
        int[] intArray6 = ds.MaxMin2.maxMin2(intArray4, (int) (short) 1);
        int[] intArray8 = ds.MaxMin2.maxMin2(intArray6, 0);
        int[] intArray10 = ds.MaxMin2.maxMin2(intArray8, (int) (byte) -1);
        int[] intArray12 = ds.MaxMin2.maxMin2(intArray10, 0);
        int[] intArray14 = ds.MaxMin2.maxMin2(intArray10, (int) (byte) 1);
        int[] intArray16 = ds.MaxMin2.maxMin2(intArray14, 1);
        int[] intArray18 = ds.MaxMin2.maxMin2(intArray14, (int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray20 = ds.MaxMin2.maxMin2(intArray18, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[0, 10, 35, 0]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray16), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray18), "[0, 0]");
    }

    @Test
    public void test742() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test742");
        int[] intArray6 = new int[] { (byte) -1, (byte) 1, ' ', (short) 10, (short) 1, (byte) 1 };
        int[] intArray8 = ds.MaxMin2.maxMin2(intArray6, (int) (byte) 0);
        int[] intArray10 = ds.MaxMin2.maxMin2(intArray6, (int) (byte) 1);
        int[] intArray12 = ds.MaxMin2.maxMin2(intArray6, (int) (short) 0);
        int[] intArray14 = ds.MaxMin2.maxMin2(intArray12, (int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray16 = ds.MaxMin2.maxMin2(intArray14, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[-1, 1, 32, 10, 1, 1]");
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[-1, -1]");
    }

    @Test
    public void test743() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test743");
        int[] intArray4 = new int[] { (byte) 0, 10, '#', (short) 0 };
        int[] intArray6 = ds.MaxMin2.maxMin2(intArray4, (int) (short) 1);
        int[] intArray8 = ds.MaxMin2.maxMin2(intArray6, 0);
        int[] intArray10 = ds.MaxMin2.maxMin2(intArray8, 0);
        int[] intArray12 = ds.MaxMin2.maxMin2(intArray8, 0);
        int[] intArray14 = ds.MaxMin2.maxMin2(intArray12, (int) (byte) 0);
        int[] intArray16 = ds.MaxMin2.maxMin2(intArray12, (int) (short) 1);
        int[] intArray18 = ds.MaxMin2.maxMin2(intArray16, (int) (byte) 0);
        int[] intArray20 = ds.MaxMin2.maxMin2(intArray18, 0);
        java.lang.Class<?> wildcardClass21 = intArray20.getClass();
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[0, 10, 35, 0]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray16), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray18), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray20), "[0, 0]");
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test744() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test744");
        int[] intArray6 = new int[] { (byte) -1, (byte) 1, ' ', (short) 10, (short) 1, (byte) 1 };
        int[] intArray8 = ds.MaxMin2.maxMin2(intArray6, (int) (byte) 0);
        int[] intArray10 = ds.MaxMin2.maxMin2(intArray6, (int) (short) 1);
        int[] intArray12 = ds.MaxMin2.maxMin2(intArray10, (-1));
        int[] intArray14 = ds.MaxMin2.maxMin2(intArray12, (int) (byte) -1);
        int[] intArray16 = ds.MaxMin2.maxMin2(intArray14, (int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray18 = ds.MaxMin2.maxMin2(intArray16, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[-1, 1, 32, 10, 1, 1]");
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray16), "[-1, -1]");
    }

    @Test
    public void test745() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test745");
        int[] intArray4 = new int[] { (byte) 0, 10, '#', (short) 0 };
        int[] intArray6 = ds.MaxMin2.maxMin2(intArray4, (int) (short) 1);
        int[] intArray8 = ds.MaxMin2.maxMin2(intArray4, (int) (byte) -1);
        int[] intArray10 = ds.MaxMin2.maxMin2(intArray8, (int) (short) -1);
        java.lang.Class<?> wildcardClass11 = intArray10.getClass();
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[0, 10, 35, 0]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[0, 0]");
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test746() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test746");
        int[] intArray4 = new int[] { (byte) 0, 10, '#', (short) 0 };
        int[] intArray6 = ds.MaxMin2.maxMin2(intArray4, (int) (short) 1);
        int[] intArray8 = ds.MaxMin2.maxMin2(intArray6, 0);
        int[] intArray10 = ds.MaxMin2.maxMin2(intArray8, (int) (byte) -1);
        int[] intArray12 = ds.MaxMin2.maxMin2(intArray10, 0);
        int[] intArray14 = ds.MaxMin2.maxMin2(intArray12, 0);
        int[] intArray16 = ds.MaxMin2.maxMin2(intArray14, (int) (short) 1);
        int[] intArray18 = ds.MaxMin2.maxMin2(intArray14, 0);
        int[] intArray20 = ds.MaxMin2.maxMin2(intArray18, 0);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray22 = ds.MaxMin2.maxMin2(intArray18, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[0, 10, 35, 0]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray16), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray18), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray20), "[0, 0]");
    }

    @Test
    public void test747() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test747");
        int[] intArray6 = new int[] { (byte) -1, (byte) 1, ' ', (short) 10, (short) 1, (byte) 1 };
        int[] intArray8 = ds.MaxMin2.maxMin2(intArray6, (int) (byte) 0);
        int[] intArray10 = ds.MaxMin2.maxMin2(intArray6, (int) (byte) 1);
        int[] intArray12 = ds.MaxMin2.maxMin2(intArray10, (int) (byte) 1);
        int[] intArray14 = ds.MaxMin2.maxMin2(intArray12, (int) (byte) -1);
        int[] intArray16 = ds.MaxMin2.maxMin2(intArray12, (int) (short) 1);
        int[] intArray18 = ds.MaxMin2.maxMin2(intArray12, 1);
        int[] intArray20 = ds.MaxMin2.maxMin2(intArray12, (int) (short) -1);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray22 = ds.MaxMin2.maxMin2(intArray20, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[-1, 1, 32, 10, 1, 1]");
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray16), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray18), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray20), "[-1, -1]");
    }

    @Test
    public void test748() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test748");
        int[] intArray6 = new int[] { (byte) -1, (byte) 1, ' ', (short) 10, (short) 1, (byte) 1 };
        int[] intArray8 = ds.MaxMin2.maxMin2(intArray6, (int) (byte) 0);
        int[] intArray10 = ds.MaxMin2.maxMin2(intArray8, (-1));
        int[] intArray12 = ds.MaxMin2.maxMin2(intArray10, (int) (byte) -1);
        int[] intArray14 = ds.MaxMin2.maxMin2(intArray10, 1);
        int[] intArray16 = ds.MaxMin2.maxMin2(intArray10, (-1));
        int[] intArray18 = ds.MaxMin2.maxMin2(intArray16, (int) (short) 1);
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[-1, 1, 32, 10, 1, 1]");
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray16), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray18), "[-1, -1]");
    }

    @Test
    public void test749() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test749");
        int[] intArray4 = new int[] { (byte) 0, 10, '#', (short) 0 };
        int[] intArray6 = ds.MaxMin2.maxMin2(intArray4, (int) (short) 1);
        int[] intArray8 = ds.MaxMin2.maxMin2(intArray4, (int) (short) 1);
        int[] intArray10 = ds.MaxMin2.maxMin2(intArray8, (int) (byte) 1);
        int[] intArray12 = ds.MaxMin2.maxMin2(intArray10, 0);
        java.lang.Class<?> wildcardClass13 = intArray12.getClass();
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[0, 10, 35, 0]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[0, 0]");
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test750() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test750");
        int[] intArray4 = new int[] { (byte) 0, 10, '#', (short) 0 };
        int[] intArray6 = ds.MaxMin2.maxMin2(intArray4, (int) (short) 1);
        int[] intArray8 = ds.MaxMin2.maxMin2(intArray6, 0);
        int[] intArray10 = ds.MaxMin2.maxMin2(intArray8, (int) (byte) -1);
        int[] intArray12 = ds.MaxMin2.maxMin2(intArray10, 0);
        int[] intArray14 = ds.MaxMin2.maxMin2(intArray12, 0);
        int[] intArray16 = ds.MaxMin2.maxMin2(intArray14, (int) (short) 1);
        int[] intArray18 = ds.MaxMin2.maxMin2(intArray14, 0);
        int[] intArray20 = ds.MaxMin2.maxMin2(intArray18, (int) (byte) 0);
        int[] intArray22 = ds.MaxMin2.maxMin2(intArray20, (int) (byte) 0);
        java.lang.Class<?> wildcardClass23 = intArray22.getClass();
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[0, 10, 35, 0]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray16), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray18), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray20), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray22), "[0, 0]");
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test751() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test751");
        int[] intArray4 = new int[] { (byte) 0, 10, '#', (short) 0 };
        int[] intArray6 = ds.MaxMin2.maxMin2(intArray4, (int) (short) 1);
        int[] intArray8 = ds.MaxMin2.maxMin2(intArray6, 0);
        int[] intArray10 = ds.MaxMin2.maxMin2(intArray8, 0);
        int[] intArray12 = ds.MaxMin2.maxMin2(intArray8, 0);
        int[] intArray14 = ds.MaxMin2.maxMin2(intArray12, (int) (byte) 0);
        int[] intArray16 = ds.MaxMin2.maxMin2(intArray14, (int) (short) 1);
        int[] intArray18 = ds.MaxMin2.maxMin2(intArray14, (int) (short) -1);
        int[] intArray20 = ds.MaxMin2.maxMin2(intArray14, (int) (byte) 1);
        int[] intArray22 = ds.MaxMin2.maxMin2(intArray14, (int) (short) -1);
        int[] intArray24 = ds.MaxMin2.maxMin2(intArray14, (int) (byte) 1);
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[0, 10, 35, 0]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray16), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray18), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray20), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray22), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray24), "[0, 0]");
    }

    @Test
    public void test752() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test752");
        int[] intArray4 = new int[] { (byte) 0, 10, '#', (short) 0 };
        int[] intArray6 = ds.MaxMin2.maxMin2(intArray4, (int) (short) 1);
        int[] intArray8 = ds.MaxMin2.maxMin2(intArray4, (int) (byte) -1);
        int[] intArray10 = ds.MaxMin2.maxMin2(intArray8, (int) (short) -1);
        int[] intArray12 = ds.MaxMin2.maxMin2(intArray8, (-1));
        int[] intArray14 = ds.MaxMin2.maxMin2(intArray12, (int) (byte) -1);
        java.lang.Class<?> wildcardClass15 = intArray14.getClass();
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[0, 10, 35, 0]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[0, 0]");
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test753() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test753");
        int[] intArray4 = new int[] { (byte) 0, 10, '#', (short) 0 };
        int[] intArray6 = ds.MaxMin2.maxMin2(intArray4, (int) (short) 1);
        int[] intArray8 = ds.MaxMin2.maxMin2(intArray4, (int) (short) 1);
        int[] intArray10 = ds.MaxMin2.maxMin2(intArray8, (int) (short) 1);
        int[] intArray12 = ds.MaxMin2.maxMin2(intArray8, 0);
        java.lang.Class<?> wildcardClass13 = intArray8.getClass();
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[0, 10, 35, 0]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[0, 0]");
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test754() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test754");
        int[] intArray4 = new int[] { (byte) 0, 10, '#', (short) 0 };
        int[] intArray6 = ds.MaxMin2.maxMin2(intArray4, (int) (short) 1);
        int[] intArray8 = ds.MaxMin2.maxMin2(intArray6, 0);
        int[] intArray10 = ds.MaxMin2.maxMin2(intArray8, 0);
        int[] intArray12 = ds.MaxMin2.maxMin2(intArray8, 0);
        int[] intArray14 = ds.MaxMin2.maxMin2(intArray12, (int) (byte) 0);
        int[] intArray16 = ds.MaxMin2.maxMin2(intArray12, (int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray18 = ds.MaxMin2.maxMin2(intArray12, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[0, 10, 35, 0]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray16), "[0, 0]");
    }

    @Test
    public void test755() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test755");
        int[] intArray4 = new int[] { (byte) 0, 10, '#', (short) 0 };
        int[] intArray6 = ds.MaxMin2.maxMin2(intArray4, (int) (short) 1);
        int[] intArray8 = ds.MaxMin2.maxMin2(intArray4, (int) (short) 1);
        int[] intArray10 = ds.MaxMin2.maxMin2(intArray4, (-1));
        int[] intArray12 = ds.MaxMin2.maxMin2(intArray10, (int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray14 = ds.MaxMin2.maxMin2(intArray10, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[0, 10, 35, 0]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[0, 0]");
    }

    @Test
    public void test756() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test756");
        int[] intArray4 = new int[] { (byte) 0, 10, '#', (short) 0 };
        int[] intArray6 = ds.MaxMin2.maxMin2(intArray4, (int) (short) 1);
        int[] intArray8 = ds.MaxMin2.maxMin2(intArray6, 0);
        int[] intArray10 = ds.MaxMin2.maxMin2(intArray8, (int) (byte) -1);
        int[] intArray12 = ds.MaxMin2.maxMin2(intArray10, 0);
        int[] intArray14 = ds.MaxMin2.maxMin2(intArray12, (int) (short) 1);
        int[] intArray16 = ds.MaxMin2.maxMin2(intArray14, (int) (short) 1);
        java.lang.Class<?> wildcardClass17 = intArray16.getClass();
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[0, 10, 35, 0]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray16), "[0, 0]");
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test757() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test757");
        int[] intArray6 = new int[] { (byte) -1, (byte) 1, ' ', (short) 10, (short) 1, (byte) 1 };
        int[] intArray8 = ds.MaxMin2.maxMin2(intArray6, (int) (byte) 0);
        int[] intArray10 = ds.MaxMin2.maxMin2(intArray6, (int) (byte) 0);
        int[] intArray12 = ds.MaxMin2.maxMin2(intArray10, (int) (byte) -1);
        int[] intArray14 = ds.MaxMin2.maxMin2(intArray12, (int) (short) -1);
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[-1, 1, 32, 10, 1, 1]");
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[-1, -1]");
    }

    @Test
    public void test758() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test758");
        int[] intArray6 = new int[] { (byte) -1, (byte) 1, ' ', (short) 10, (short) 1, (byte) 1 };
        int[] intArray8 = ds.MaxMin2.maxMin2(intArray6, (int) (byte) 0);
        int[] intArray10 = ds.MaxMin2.maxMin2(intArray6, (int) (short) 1);
        int[] intArray12 = ds.MaxMin2.maxMin2(intArray10, (-1));
        int[] intArray14 = ds.MaxMin2.maxMin2(intArray12, (int) (short) -1);
        int[] intArray16 = ds.MaxMin2.maxMin2(intArray14, (-1));
        int[] intArray18 = ds.MaxMin2.maxMin2(intArray16, (int) (short) 1);
        int[] intArray20 = ds.MaxMin2.maxMin2(intArray16, (int) (short) 0);
        int[] intArray22 = ds.MaxMin2.maxMin2(intArray20, (int) (byte) 0);
        int[] intArray24 = ds.MaxMin2.maxMin2(intArray20, 0);
        int[] intArray26 = ds.MaxMin2.maxMin2(intArray20, 1);
        java.lang.Class<?> wildcardClass27 = intArray20.getClass();
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[-1, 1, 32, 10, 1, 1]");
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray16), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray18), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray20), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray22), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray24), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray26), "[-1, -1]");
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test759() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test759");
        int[] intArray6 = new int[] { (byte) -1, (byte) 1, ' ', (short) 10, (short) 1, (byte) 1 };
        int[] intArray8 = ds.MaxMin2.maxMin2(intArray6, (int) (byte) 0);
        int[] intArray10 = ds.MaxMin2.maxMin2(intArray6, (int) (byte) 1);
        int[] intArray12 = ds.MaxMin2.maxMin2(intArray6, (int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray14 = ds.MaxMin2.maxMin2(intArray6, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[-1, 1, 32, 10, 1, 1]");
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[-1, -1]");
    }

    @Test
    public void test760() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test760");
        int[] intArray6 = new int[] { (byte) -1, (byte) 1, ' ', (short) 10, (short) 1, (byte) 1 };
        int[] intArray8 = ds.MaxMin2.maxMin2(intArray6, (int) (byte) 0);
        int[] intArray10 = ds.MaxMin2.maxMin2(intArray6, (int) (byte) 0);
        int[] intArray12 = ds.MaxMin2.maxMin2(intArray10, (int) (short) -1);
        int[] intArray14 = ds.MaxMin2.maxMin2(intArray10, (int) (byte) -1);
        int[] intArray16 = ds.MaxMin2.maxMin2(intArray10, (int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray18 = ds.MaxMin2.maxMin2(intArray16, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[-1, 1, 32, 10, 1, 1]");
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray16), "[-1, -1]");
    }

    @Test
    public void test761() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test761");
        int[] intArray6 = new int[] { (byte) -1, (byte) 1, ' ', (short) 10, (short) 1, (byte) 1 };
        int[] intArray8 = ds.MaxMin2.maxMin2(intArray6, (int) (byte) 0);
        int[] intArray10 = ds.MaxMin2.maxMin2(intArray6, (int) (short) 1);
        int[] intArray12 = ds.MaxMin2.maxMin2(intArray10, (-1));
        int[] intArray14 = ds.MaxMin2.maxMin2(intArray12, (int) (short) -1);
        int[] intArray16 = ds.MaxMin2.maxMin2(intArray14, (-1));
        int[] intArray18 = ds.MaxMin2.maxMin2(intArray16, (int) (short) 1);
        int[] intArray20 = ds.MaxMin2.maxMin2(intArray16, (int) (byte) 1);
        int[] intArray22 = ds.MaxMin2.maxMin2(intArray16, 0);
        int[] intArray24 = ds.MaxMin2.maxMin2(intArray22, 0);
        int[] intArray26 = ds.MaxMin2.maxMin2(intArray24, (int) (short) 0);
        int[] intArray28 = ds.MaxMin2.maxMin2(intArray24, 1);
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[-1, 1, 32, 10, 1, 1]");
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray16), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray18), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray20), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray22), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray24), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray26), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray28);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray28), "[-1, -1]");
    }

    @Test
    public void test762() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test762");
        int[] intArray4 = new int[] { (byte) 0, 10, '#', (short) 0 };
        int[] intArray6 = ds.MaxMin2.maxMin2(intArray4, (int) (short) 1);
        int[] intArray8 = ds.MaxMin2.maxMin2(intArray6, 0);
        int[] intArray10 = ds.MaxMin2.maxMin2(intArray8, (int) (byte) -1);
        int[] intArray12 = ds.MaxMin2.maxMin2(intArray10, 0);
        int[] intArray14 = ds.MaxMin2.maxMin2(intArray12, 0);
        int[] intArray16 = ds.MaxMin2.maxMin2(intArray14, (int) (short) 1);
        int[] intArray18 = ds.MaxMin2.maxMin2(intArray14, 0);
        int[] intArray20 = ds.MaxMin2.maxMin2(intArray14, (int) (short) 0);
        int[] intArray22 = ds.MaxMin2.maxMin2(intArray14, 0);
        int[] intArray24 = ds.MaxMin2.maxMin2(intArray22, (int) (byte) 1);
        int[] intArray26 = ds.MaxMin2.maxMin2(intArray22, (int) (short) -1);
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[0, 10, 35, 0]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray16), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray18), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray20), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray22), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray24), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray26), "[0, 0]");
    }

    @Test
    public void test763() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test763");
        int[] intArray4 = new int[] { (byte) 0, 10, '#', (short) 0 };
        int[] intArray6 = ds.MaxMin2.maxMin2(intArray4, (int) (short) 1);
        int[] intArray8 = ds.MaxMin2.maxMin2(intArray4, (int) (short) 1);
        int[] intArray10 = ds.MaxMin2.maxMin2(intArray8, (int) (byte) -1);
        int[] intArray12 = ds.MaxMin2.maxMin2(intArray10, 1);
        int[] intArray14 = ds.MaxMin2.maxMin2(intArray10, 1);
        int[] intArray16 = ds.MaxMin2.maxMin2(intArray14, 0);
        int[] intArray18 = ds.MaxMin2.maxMin2(intArray16, (int) (short) 0);
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[0, 10, 35, 0]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray16), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray18), "[0, 0]");
    }

    @Test
    public void test764() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test764");
        int[] intArray6 = new int[] { (byte) -1, (byte) 1, ' ', (short) 10, (short) 1, (byte) 1 };
        int[] intArray8 = ds.MaxMin2.maxMin2(intArray6, (int) (byte) 0);
        int[] intArray10 = ds.MaxMin2.maxMin2(intArray8, (-1));
        int[] intArray12 = ds.MaxMin2.maxMin2(intArray10, (int) (byte) -1);
        int[] intArray14 = ds.MaxMin2.maxMin2(intArray10, (int) (byte) -1);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray16 = ds.MaxMin2.maxMin2(intArray14, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[-1, 1, 32, 10, 1, 1]");
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[-1, -1]");
    }

    @Test
    public void test765() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test765");
        int[] intArray4 = new int[] { (byte) 0, 10, '#', (short) 0 };
        int[] intArray6 = ds.MaxMin2.maxMin2(intArray4, (int) (short) 1);
        int[] intArray8 = ds.MaxMin2.maxMin2(intArray6, 0);
        int[] intArray10 = ds.MaxMin2.maxMin2(intArray8, (int) (byte) -1);
        int[] intArray12 = ds.MaxMin2.maxMin2(intArray10, 0);
        int[] intArray14 = ds.MaxMin2.maxMin2(intArray12, 0);
        int[] intArray16 = ds.MaxMin2.maxMin2(intArray14, (int) (short) 1);
        int[] intArray18 = ds.MaxMin2.maxMin2(intArray16, (int) (short) 0);
        int[] intArray20 = ds.MaxMin2.maxMin2(intArray16, (int) (short) 0);
        java.lang.Class<?> wildcardClass21 = intArray20.getClass();
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[0, 10, 35, 0]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray16), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray18), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray20), "[0, 0]");
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test766() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test766");
        int[] intArray4 = new int[] { (byte) 0, 10, '#', (short) 0 };
        int[] intArray6 = ds.MaxMin2.maxMin2(intArray4, (int) (short) 1);
        int[] intArray8 = ds.MaxMin2.maxMin2(intArray4, (int) (short) 0);
        int[] intArray10 = ds.MaxMin2.maxMin2(intArray4, (int) (byte) -1);
        int[] intArray12 = ds.MaxMin2.maxMin2(intArray4, (int) (short) 1);
        int[] intArray14 = ds.MaxMin2.maxMin2(intArray4, (int) (byte) 0);
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[0, 10, 35, 0]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[0, 0]");
    }

    @Test
    public void test767() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test767");
        int[] intArray6 = new int[] { (byte) -1, (byte) 1, ' ', (short) 10, (short) 1, (byte) 1 };
        int[] intArray8 = ds.MaxMin2.maxMin2(intArray6, (int) (byte) 0);
        int[] intArray10 = ds.MaxMin2.maxMin2(intArray8, (-1));
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray12 = ds.MaxMin2.maxMin2(intArray10, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[-1, 1, 32, 10, 1, 1]");
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[-1, -1]");
    }

    @Test
    public void test768() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test768");
        int[] intArray6 = new int[] { (byte) -1, (byte) 1, ' ', (short) 10, (short) 1, (byte) 1 };
        int[] intArray8 = ds.MaxMin2.maxMin2(intArray6, (int) (byte) 0);
        int[] intArray10 = ds.MaxMin2.maxMin2(intArray6, (int) (byte) 0);
        int[] intArray12 = ds.MaxMin2.maxMin2(intArray10, (int) (byte) -1);
        int[] intArray14 = ds.MaxMin2.maxMin2(intArray10, (-1));
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray16 = ds.MaxMin2.maxMin2(intArray10, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[-1, 1, 32, 10, 1, 1]");
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[-1, -1]");
    }

    @Test
    public void test769() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test769");
        int[] intArray4 = new int[] { (byte) 0, 10, '#', (short) 0 };
        int[] intArray6 = ds.MaxMin2.maxMin2(intArray4, (int) (short) 1);
        int[] intArray8 = ds.MaxMin2.maxMin2(intArray6, 0);
        int[] intArray10 = ds.MaxMin2.maxMin2(intArray8, (int) (byte) -1);
        int[] intArray12 = ds.MaxMin2.maxMin2(intArray10, 0);
        int[] intArray14 = ds.MaxMin2.maxMin2(intArray12, (int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray16 = ds.MaxMin2.maxMin2(intArray12, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[0, 10, 35, 0]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[0, 0]");
    }

    @Test
    public void test770() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test770");
        int[] intArray4 = new int[] { (byte) 0, 10, '#', (short) 0 };
        int[] intArray6 = ds.MaxMin2.maxMin2(intArray4, (int) (short) 1);
        int[] intArray8 = ds.MaxMin2.maxMin2(intArray6, 0);
        int[] intArray10 = ds.MaxMin2.maxMin2(intArray8, 0);
        int[] intArray12 = ds.MaxMin2.maxMin2(intArray8, 0);
        int[] intArray14 = ds.MaxMin2.maxMin2(intArray12, (int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray16 = ds.MaxMin2.maxMin2(intArray12, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[0, 10, 35, 0]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[0, 0]");
    }

    @Test
    public void test771() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test771");
        int[] intArray6 = new int[] { (byte) -1, (byte) 1, ' ', (short) 10, (short) 1, (byte) 1 };
        int[] intArray8 = ds.MaxMin2.maxMin2(intArray6, (int) (byte) 0);
        int[] intArray10 = ds.MaxMin2.maxMin2(intArray6, (int) (byte) 1);
        int[] intArray12 = ds.MaxMin2.maxMin2(intArray6, (int) (short) 0);
        int[] intArray14 = ds.MaxMin2.maxMin2(intArray12, (int) (short) 0);
        int[] intArray16 = ds.MaxMin2.maxMin2(intArray14, 0);
        java.lang.Class<?> wildcardClass17 = intArray14.getClass();
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[-1, 1, 32, 10, 1, 1]");
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray16), "[-1, -1]");
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test772() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test772");
        int[] intArray4 = new int[] { (byte) 0, 10, '#', (short) 0 };
        int[] intArray6 = ds.MaxMin2.maxMin2(intArray4, (int) (short) 1);
        int[] intArray8 = ds.MaxMin2.maxMin2(intArray6, 0);
        int[] intArray10 = ds.MaxMin2.maxMin2(intArray8, (int) (byte) -1);
        int[] intArray12 = ds.MaxMin2.maxMin2(intArray10, 0);
        int[] intArray14 = ds.MaxMin2.maxMin2(intArray10, (int) (short) 0);
        java.lang.Class<?> wildcardClass15 = intArray14.getClass();
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[0, 10, 35, 0]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[0, 0]");
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test773() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test773");
        int[] intArray6 = new int[] { (byte) -1, (byte) 1, ' ', (short) 10, (short) 1, (byte) 1 };
        int[] intArray8 = ds.MaxMin2.maxMin2(intArray6, (int) (byte) 0);
        int[] intArray10 = ds.MaxMin2.maxMin2(intArray6, (int) (short) 1);
        int[] intArray12 = ds.MaxMin2.maxMin2(intArray10, (-1));
        int[] intArray14 = ds.MaxMin2.maxMin2(intArray12, (int) (short) -1);
        int[] intArray16 = ds.MaxMin2.maxMin2(intArray14, (-1));
        int[] intArray18 = ds.MaxMin2.maxMin2(intArray16, (int) (short) 1);
        int[] intArray20 = ds.MaxMin2.maxMin2(intArray16, (int) (short) 0);
        int[] intArray22 = ds.MaxMin2.maxMin2(intArray20, (-1));
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray24 = ds.MaxMin2.maxMin2(intArray20, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[-1, 1, 32, 10, 1, 1]");
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray16), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray18), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray20), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray22), "[-1, -1]");
    }

    @Test
    public void test774() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test774");
        int[] intArray4 = new int[] { (byte) 0, 10, '#', (short) 0 };
        int[] intArray6 = ds.MaxMin2.maxMin2(intArray4, (int) (short) 1);
        int[] intArray8 = ds.MaxMin2.maxMin2(intArray4, (int) (short) 1);
        int[] intArray10 = ds.MaxMin2.maxMin2(intArray8, (int) (byte) 1);
        int[] intArray12 = ds.MaxMin2.maxMin2(intArray10, 0);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray14 = ds.MaxMin2.maxMin2(intArray12, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[0, 10, 35, 0]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[0, 0]");
    }

    @Test
    public void test775() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test775");
        int[] intArray4 = new int[] { (byte) 0, 10, '#', (short) 0 };
        int[] intArray6 = ds.MaxMin2.maxMin2(intArray4, (int) (short) 1);
        int[] intArray8 = ds.MaxMin2.maxMin2(intArray4, (int) (short) 1);
        int[] intArray10 = ds.MaxMin2.maxMin2(intArray8, (int) (byte) -1);
        int[] intArray12 = ds.MaxMin2.maxMin2(intArray10, 1);
        int[] intArray14 = ds.MaxMin2.maxMin2(intArray10, 1);
        int[] intArray16 = ds.MaxMin2.maxMin2(intArray10, (int) (short) -1);
        int[] intArray18 = ds.MaxMin2.maxMin2(intArray16, (int) (short) 0);
        int[] intArray20 = ds.MaxMin2.maxMin2(intArray16, (int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray22 = ds.MaxMin2.maxMin2(intArray20, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[0, 10, 35, 0]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray16), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray18), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray20), "[0, 0]");
    }

    @Test
    public void test776() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test776");
        int[] intArray4 = new int[] { (byte) 0, 10, '#', (short) 0 };
        int[] intArray6 = ds.MaxMin2.maxMin2(intArray4, (int) (short) 1);
        int[] intArray8 = ds.MaxMin2.maxMin2(intArray6, 0);
        int[] intArray10 = ds.MaxMin2.maxMin2(intArray8, 0);
        int[] intArray12 = ds.MaxMin2.maxMin2(intArray8, 0);
        int[] intArray14 = ds.MaxMin2.maxMin2(intArray12, 0);
        int[] intArray16 = ds.MaxMin2.maxMin2(intArray14, (-1));
        int[] intArray18 = ds.MaxMin2.maxMin2(intArray16, (int) (byte) 0);
        int[] intArray20 = ds.MaxMin2.maxMin2(intArray18, (int) (byte) 1);
        int[] intArray22 = ds.MaxMin2.maxMin2(intArray18, (int) (short) -1);
        java.lang.Class<?> wildcardClass23 = intArray22.getClass();
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[0, 10, 35, 0]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray16), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray18), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray20), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray22), "[0, 0]");
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test777() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test777");
        int[] intArray6 = new int[] { (byte) -1, (byte) 1, ' ', (short) 10, (short) 1, (byte) 1 };
        int[] intArray8 = ds.MaxMin2.maxMin2(intArray6, (int) (byte) 0);
        int[] intArray10 = ds.MaxMin2.maxMin2(intArray6, (int) (short) 1);
        int[] intArray12 = ds.MaxMin2.maxMin2(intArray10, (-1));
        int[] intArray14 = ds.MaxMin2.maxMin2(intArray10, (int) (byte) 0);
        int[] intArray16 = ds.MaxMin2.maxMin2(intArray10, 1);
        int[] intArray18 = ds.MaxMin2.maxMin2(intArray16, 0);
        int[] intArray20 = ds.MaxMin2.maxMin2(intArray16, (int) (byte) 0);
        java.lang.Class<?> wildcardClass21 = intArray16.getClass();
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[-1, 1, 32, 10, 1, 1]");
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray16), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray18), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray20), "[-1, -1]");
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test778() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test778");
        int[] intArray4 = new int[] { (byte) 0, 10, '#', (short) 0 };
        int[] intArray6 = ds.MaxMin2.maxMin2(intArray4, (int) (short) 1);
        int[] intArray8 = ds.MaxMin2.maxMin2(intArray4, (int) (byte) -1);
        int[] intArray10 = ds.MaxMin2.maxMin2(intArray8, (int) (short) 0);
        int[] intArray12 = ds.MaxMin2.maxMin2(intArray10, (int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray14 = ds.MaxMin2.maxMin2(intArray12, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[0, 10, 35, 0]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[0, 0]");
    }

    @Test
    public void test779() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test779");
        int[] intArray4 = new int[] { (byte) 0, 10, '#', (short) 0 };
        int[] intArray6 = ds.MaxMin2.maxMin2(intArray4, (int) (short) 1);
        int[] intArray8 = ds.MaxMin2.maxMin2(intArray6, 0);
        int[] intArray10 = ds.MaxMin2.maxMin2(intArray8, 0);
        int[] intArray12 = ds.MaxMin2.maxMin2(intArray8, 0);
        int[] intArray14 = ds.MaxMin2.maxMin2(intArray12, (int) (byte) 0);
        int[] intArray16 = ds.MaxMin2.maxMin2(intArray12, (int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray18 = ds.MaxMin2.maxMin2(intArray12, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[0, 10, 35, 0]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray16), "[0, 0]");
    }

    @Test
    public void test780() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test780");
        int[] intArray4 = new int[] { (byte) 0, 10, '#', (short) 0 };
        int[] intArray6 = ds.MaxMin2.maxMin2(intArray4, (int) (short) 1);
        int[] intArray8 = ds.MaxMin2.maxMin2(intArray6, 0);
        int[] intArray10 = ds.MaxMin2.maxMin2(intArray8, 0);
        int[] intArray12 = ds.MaxMin2.maxMin2(intArray8, 0);
        int[] intArray14 = ds.MaxMin2.maxMin2(intArray12, 0);
        int[] intArray16 = ds.MaxMin2.maxMin2(intArray12, (int) (short) -1);
        int[] intArray18 = ds.MaxMin2.maxMin2(intArray16, 0);
        java.lang.Class<?> wildcardClass19 = intArray18.getClass();
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[0, 10, 35, 0]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray16), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray18), "[0, 0]");
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test781() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test781");
        int[] intArray4 = new int[] { (byte) 0, 10, '#', (short) 0 };
        int[] intArray6 = ds.MaxMin2.maxMin2(intArray4, (int) (short) 1);
        int[] intArray8 = ds.MaxMin2.maxMin2(intArray6, 0);
        int[] intArray10 = ds.MaxMin2.maxMin2(intArray8, 0);
        int[] intArray12 = ds.MaxMin2.maxMin2(intArray8, 0);
        int[] intArray14 = ds.MaxMin2.maxMin2(intArray12, 0);
        int[] intArray16 = ds.MaxMin2.maxMin2(intArray14, (-1));
        int[] intArray18 = ds.MaxMin2.maxMin2(intArray16, (int) (byte) 0);
        int[] intArray20 = ds.MaxMin2.maxMin2(intArray18, (int) (byte) 1);
        int[] intArray22 = ds.MaxMin2.maxMin2(intArray18, 0);
        int[] intArray24 = ds.MaxMin2.maxMin2(intArray18, (int) (byte) 1);
        java.lang.Class<?> wildcardClass25 = intArray18.getClass();
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[0, 10, 35, 0]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray16), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray18), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray20), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray22), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray24), "[0, 0]");
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test782() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test782");
        int[] intArray6 = new int[] { (byte) -1, (byte) 1, ' ', (short) 10, (short) 1, (byte) 1 };
        int[] intArray8 = ds.MaxMin2.maxMin2(intArray6, (int) (byte) 0);
        int[] intArray10 = ds.MaxMin2.maxMin2(intArray8, (-1));
        int[] intArray12 = ds.MaxMin2.maxMin2(intArray8, (int) (short) 1);
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[-1, 1, 32, 10, 1, 1]");
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[-1, -1]");
    }

    @Test
    public void test783() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test783");
        int[] intArray6 = new int[] { (byte) -1, (byte) 1, ' ', (short) 10, (short) 1, (byte) 1 };
        int[] intArray8 = ds.MaxMin2.maxMin2(intArray6, (int) (byte) 0);
        int[] intArray10 = ds.MaxMin2.maxMin2(intArray6, (int) (short) 1);
        int[] intArray12 = ds.MaxMin2.maxMin2(intArray10, (-1));
        int[] intArray14 = ds.MaxMin2.maxMin2(intArray12, (int) (short) -1);
        int[] intArray16 = ds.MaxMin2.maxMin2(intArray14, (-1));
        int[] intArray18 = ds.MaxMin2.maxMin2(intArray14, 0);
        int[] intArray20 = ds.MaxMin2.maxMin2(intArray14, 1);
        int[] intArray22 = ds.MaxMin2.maxMin2(intArray20, (int) (byte) 1);
        int[] intArray24 = ds.MaxMin2.maxMin2(intArray20, (int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray26 = ds.MaxMin2.maxMin2(intArray24, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[-1, 1, 32, 10, 1, 1]");
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray16), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray18), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray20), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray22), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray24), "[-1, -1]");
    }

    @Test
    public void test784() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test784");
        int[] intArray4 = new int[] { (byte) 0, 10, '#', (short) 0 };
        int[] intArray6 = ds.MaxMin2.maxMin2(intArray4, (int) (short) 1);
        int[] intArray8 = ds.MaxMin2.maxMin2(intArray6, 0);
        int[] intArray10 = ds.MaxMin2.maxMin2(intArray8, 0);
        int[] intArray12 = ds.MaxMin2.maxMin2(intArray8, 0);
        int[] intArray14 = ds.MaxMin2.maxMin2(intArray12, 0);
        int[] intArray16 = ds.MaxMin2.maxMin2(intArray14, (-1));
        int[] intArray18 = ds.MaxMin2.maxMin2(intArray16, (int) (byte) 0);
        int[] intArray20 = ds.MaxMin2.maxMin2(intArray18, (int) (byte) 1);
        int[] intArray22 = ds.MaxMin2.maxMin2(intArray18, (int) (short) -1);
        int[] intArray24 = ds.MaxMin2.maxMin2(intArray22, 0);
        java.lang.Class<?> wildcardClass25 = intArray24.getClass();
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[0, 10, 35, 0]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray16), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray18), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray20), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray22), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray24), "[0, 0]");
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test785() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test785");
        int[] intArray6 = new int[] { (byte) -1, (byte) 1, ' ', (short) 10, (short) 1, (byte) 1 };
        int[] intArray8 = ds.MaxMin2.maxMin2(intArray6, (int) (byte) 0);
        int[] intArray10 = ds.MaxMin2.maxMin2(intArray6, (int) (short) 1);
        int[] intArray12 = ds.MaxMin2.maxMin2(intArray10, (-1));
        int[] intArray14 = ds.MaxMin2.maxMin2(intArray12, (int) (short) -1);
        int[] intArray16 = ds.MaxMin2.maxMin2(intArray14, (-1));
        int[] intArray18 = ds.MaxMin2.maxMin2(intArray16, (int) (short) 1);
        int[] intArray20 = ds.MaxMin2.maxMin2(intArray18, 0);
        java.lang.Class<?> wildcardClass21 = intArray20.getClass();
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[-1, 1, 32, 10, 1, 1]");
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray16), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray18), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray20), "[-1, -1]");
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test786() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test786");
        int[] intArray6 = new int[] { (byte) -1, (byte) 1, ' ', (short) 10, (short) 1, (byte) 1 };
        int[] intArray8 = ds.MaxMin2.maxMin2(intArray6, (int) (byte) 0);
        int[] intArray10 = ds.MaxMin2.maxMin2(intArray6, (int) (short) 1);
        int[] intArray12 = ds.MaxMin2.maxMin2(intArray10, (-1));
        int[] intArray14 = ds.MaxMin2.maxMin2(intArray12, (int) (short) -1);
        int[] intArray16 = ds.MaxMin2.maxMin2(intArray14, (-1));
        int[] intArray18 = ds.MaxMin2.maxMin2(intArray14, 0);
        int[] intArray20 = ds.MaxMin2.maxMin2(intArray14, 1);
        int[] intArray22 = ds.MaxMin2.maxMin2(intArray20, (int) (byte) 1);
        int[] intArray24 = ds.MaxMin2.maxMin2(intArray22, (int) (short) -1);
        int[] intArray26 = ds.MaxMin2.maxMin2(intArray24, (int) (byte) 1);
        int[] intArray28 = ds.MaxMin2.maxMin2(intArray26, (int) (byte) 1);
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[-1, 1, 32, 10, 1, 1]");
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray16), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray18), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray20), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray22), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray24), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray26), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray28);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray28), "[-1, -1]");
    }

    @Test
    public void test787() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test787");
        int[] intArray4 = new int[] { (byte) 0, 10, '#', (short) 0 };
        int[] intArray6 = ds.MaxMin2.maxMin2(intArray4, (int) (short) 1);
        int[] intArray8 = ds.MaxMin2.maxMin2(intArray6, 0);
        int[] intArray10 = ds.MaxMin2.maxMin2(intArray8, 0);
        int[] intArray12 = ds.MaxMin2.maxMin2(intArray8, 0);
        int[] intArray14 = ds.MaxMin2.maxMin2(intArray12, 0);
        int[] intArray16 = ds.MaxMin2.maxMin2(intArray14, (-1));
        int[] intArray18 = ds.MaxMin2.maxMin2(intArray16, (int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray20 = ds.MaxMin2.maxMin2(intArray16, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[0, 10, 35, 0]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray16), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray18), "[0, 0]");
    }

    @Test
    public void test788() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test788");
        int[] intArray4 = new int[] { (byte) 0, 10, '#', (short) 0 };
        int[] intArray6 = ds.MaxMin2.maxMin2(intArray4, (int) (short) 1);
        int[] intArray8 = ds.MaxMin2.maxMin2(intArray6, 0);
        int[] intArray10 = ds.MaxMin2.maxMin2(intArray8, 0);
        int[] intArray12 = ds.MaxMin2.maxMin2(intArray8, 0);
        int[] intArray14 = ds.MaxMin2.maxMin2(intArray12, (int) (byte) 0);
        int[] intArray16 = ds.MaxMin2.maxMin2(intArray12, (int) (byte) 1);
        java.lang.Class<?> wildcardClass17 = intArray16.getClass();
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[0, 10, 35, 0]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray16), "[0, 0]");
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test789() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test789");
        int[] intArray6 = new int[] { (byte) -1, (byte) 1, ' ', (short) 10, (short) 1, (byte) 1 };
        int[] intArray8 = ds.MaxMin2.maxMin2(intArray6, (int) (byte) 0);
        int[] intArray10 = ds.MaxMin2.maxMin2(intArray6, (int) (short) 1);
        int[] intArray12 = ds.MaxMin2.maxMin2(intArray10, (-1));
        int[] intArray14 = ds.MaxMin2.maxMin2(intArray10, (int) (byte) 0);
        int[] intArray16 = ds.MaxMin2.maxMin2(intArray10, 1);
        int[] intArray18 = ds.MaxMin2.maxMin2(intArray16, 0);
        int[] intArray20 = ds.MaxMin2.maxMin2(intArray18, (int) (byte) -1);
        int[] intArray22 = ds.MaxMin2.maxMin2(intArray18, 0);
        int[] intArray24 = ds.MaxMin2.maxMin2(intArray22, (int) (byte) -1);
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[-1, 1, 32, 10, 1, 1]");
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray16), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray18), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray20), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray22), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray24), "[-1, -1]");
    }

    @Test
    public void test790() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test790");
        int[] intArray6 = new int[] { (byte) -1, (byte) 1, ' ', (short) 10, (short) 1, (byte) 1 };
        int[] intArray8 = ds.MaxMin2.maxMin2(intArray6, (int) (byte) 0);
        int[] intArray10 = ds.MaxMin2.maxMin2(intArray6, (int) (short) 1);
        int[] intArray12 = ds.MaxMin2.maxMin2(intArray10, (-1));
        int[] intArray14 = ds.MaxMin2.maxMin2(intArray10, (int) (byte) 0);
        int[] intArray16 = ds.MaxMin2.maxMin2(intArray10, 1);
        int[] intArray18 = ds.MaxMin2.maxMin2(intArray16, 0);
        int[] intArray20 = ds.MaxMin2.maxMin2(intArray16, 1);
        int[] intArray22 = ds.MaxMin2.maxMin2(intArray16, (int) (short) 0);
        int[] intArray24 = ds.MaxMin2.maxMin2(intArray16, 0);
        int[] intArray26 = ds.MaxMin2.maxMin2(intArray24, (int) (short) 0);
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[-1, 1, 32, 10, 1, 1]");
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray16), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray18), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray20), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray22), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray24), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray26), "[-1, -1]");
    }

    @Test
    public void test791() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test791");
        int[] intArray6 = new int[] { (byte) -1, (byte) 1, ' ', (short) 10, (short) 1, (byte) 1 };
        int[] intArray8 = ds.MaxMin2.maxMin2(intArray6, (int) (byte) 0);
        int[] intArray10 = ds.MaxMin2.maxMin2(intArray6, (int) (short) 1);
        int[] intArray12 = ds.MaxMin2.maxMin2(intArray10, (-1));
        int[] intArray14 = ds.MaxMin2.maxMin2(intArray12, (int) (short) -1);
        int[] intArray16 = ds.MaxMin2.maxMin2(intArray14, (int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray18 = ds.MaxMin2.maxMin2(intArray16, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[-1, 1, 32, 10, 1, 1]");
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray16), "[-1, -1]");
    }

    @Test
    public void test792() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test792");
        int[] intArray4 = new int[] { (byte) 0, 10, '#', (short) 0 };
        int[] intArray6 = ds.MaxMin2.maxMin2(intArray4, (int) (short) 1);
        int[] intArray8 = ds.MaxMin2.maxMin2(intArray6, 0);
        int[] intArray10 = ds.MaxMin2.maxMin2(intArray8, 0);
        int[] intArray12 = ds.MaxMin2.maxMin2(intArray8, 0);
        int[] intArray14 = ds.MaxMin2.maxMin2(intArray12, 0);
        int[] intArray16 = ds.MaxMin2.maxMin2(intArray14, (-1));
        int[] intArray18 = ds.MaxMin2.maxMin2(intArray16, 1);
        int[] intArray20 = ds.MaxMin2.maxMin2(intArray16, (int) (byte) 0);
        java.lang.Class<?> wildcardClass21 = intArray16.getClass();
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[0, 10, 35, 0]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray16), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray18), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray20), "[0, 0]");
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test793() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test793");
        int[] intArray6 = new int[] { (byte) -1, (byte) 1, ' ', (short) 10, (short) 1, (byte) 1 };
        int[] intArray8 = ds.MaxMin2.maxMin2(intArray6, (int) (byte) 0);
        int[] intArray10 = ds.MaxMin2.maxMin2(intArray6, (int) (short) 1);
        int[] intArray12 = ds.MaxMin2.maxMin2(intArray10, (-1));
        int[] intArray14 = ds.MaxMin2.maxMin2(intArray12, (int) (byte) -1);
        int[] intArray16 = ds.MaxMin2.maxMin2(intArray12, (int) (byte) -1);
        java.lang.Class<?> wildcardClass17 = intArray16.getClass();
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[-1, 1, 32, 10, 1, 1]");
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray16), "[-1, -1]");
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test794() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test794");
        int[] intArray6 = new int[] { (byte) -1, (byte) 1, ' ', (short) 10, (short) 1, (byte) 1 };
        int[] intArray8 = ds.MaxMin2.maxMin2(intArray6, (int) (byte) 0);
        int[] intArray10 = ds.MaxMin2.maxMin2(intArray6, (int) (byte) 1);
        int[] intArray12 = ds.MaxMin2.maxMin2(intArray10, (int) (byte) 1);
        int[] intArray14 = ds.MaxMin2.maxMin2(intArray10, (int) (byte) 1);
        int[] intArray16 = ds.MaxMin2.maxMin2(intArray10, (int) (byte) 0);
        int[] intArray18 = ds.MaxMin2.maxMin2(intArray16, 0);
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[-1, 1, 32, 10, 1, 1]");
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray16), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray18), "[-1, -1]");
    }

    @Test
    public void test795() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test795");
        int[] intArray4 = new int[] { (byte) 0, 10, '#', (short) 0 };
        int[] intArray6 = ds.MaxMin2.maxMin2(intArray4, (int) (short) 1);
        int[] intArray8 = ds.MaxMin2.maxMin2(intArray4, (int) (short) 1);
        int[] intArray10 = ds.MaxMin2.maxMin2(intArray8, (int) (byte) -1);
        int[] intArray12 = ds.MaxMin2.maxMin2(intArray10, (int) (short) 0);
        int[] intArray14 = ds.MaxMin2.maxMin2(intArray10, (int) (byte) 0);
        int[] intArray16 = ds.MaxMin2.maxMin2(intArray10, (int) (short) 0);
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[0, 10, 35, 0]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray16), "[0, 0]");
    }

    @Test
    public void test796() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test796");
        int[] intArray4 = new int[] { (byte) 0, 10, '#', (short) 0 };
        int[] intArray6 = ds.MaxMin2.maxMin2(intArray4, (int) (short) 1);
        int[] intArray8 = ds.MaxMin2.maxMin2(intArray6, 0);
        int[] intArray10 = ds.MaxMin2.maxMin2(intArray8, (int) (byte) -1);
        int[] intArray12 = ds.MaxMin2.maxMin2(intArray10, 0);
        int[] intArray14 = ds.MaxMin2.maxMin2(intArray12, 0);
        int[] intArray16 = ds.MaxMin2.maxMin2(intArray14, (int) (short) 1);
        int[] intArray18 = ds.MaxMin2.maxMin2(intArray14, 0);
        int[] intArray20 = ds.MaxMin2.maxMin2(intArray18, 0);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray22 = ds.MaxMin2.maxMin2(intArray20, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[0, 10, 35, 0]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray16), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray18), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray20), "[0, 0]");
    }

    @Test
    public void test797() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test797");
        int[] intArray4 = new int[] { (byte) 0, 10, '#', (short) 0 };
        int[] intArray6 = ds.MaxMin2.maxMin2(intArray4, (int) (short) 1);
        int[] intArray8 = ds.MaxMin2.maxMin2(intArray6, 0);
        int[] intArray10 = ds.MaxMin2.maxMin2(intArray8, 0);
        int[] intArray12 = ds.MaxMin2.maxMin2(intArray8, 0);
        int[] intArray14 = ds.MaxMin2.maxMin2(intArray12, 0);
        int[] intArray16 = ds.MaxMin2.maxMin2(intArray14, (-1));
        int[] intArray18 = ds.MaxMin2.maxMin2(intArray16, (int) (byte) 0);
        int[] intArray20 = ds.MaxMin2.maxMin2(intArray18, (int) (byte) 1);
        int[] intArray22 = ds.MaxMin2.maxMin2(intArray18, (int) (short) -1);
        int[] intArray24 = ds.MaxMin2.maxMin2(intArray22, 0);
        java.lang.Class<?> wildcardClass25 = intArray22.getClass();
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[0, 10, 35, 0]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray16), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray18), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray20), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray22), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray24), "[0, 0]");
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test798() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test798");
        int[] intArray6 = new int[] { (byte) -1, (byte) 1, ' ', (short) 10, (short) 1, (byte) 1 };
        int[] intArray8 = ds.MaxMin2.maxMin2(intArray6, (int) (byte) 0);
        int[] intArray10 = ds.MaxMin2.maxMin2(intArray6, (int) (short) 1);
        int[] intArray12 = ds.MaxMin2.maxMin2(intArray10, (-1));
        int[] intArray14 = ds.MaxMin2.maxMin2(intArray12, (int) (short) -1);
        int[] intArray16 = ds.MaxMin2.maxMin2(intArray14, (-1));
        int[] intArray18 = ds.MaxMin2.maxMin2(intArray16, 0);
        java.lang.Class<?> wildcardClass19 = intArray16.getClass();
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[-1, 1, 32, 10, 1, 1]");
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray16), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray18), "[-1, -1]");
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test799() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test799");
        int[] intArray4 = new int[] { (byte) 0, 10, '#', (short) 0 };
        int[] intArray6 = ds.MaxMin2.maxMin2(intArray4, (int) (short) 1);
        int[] intArray8 = ds.MaxMin2.maxMin2(intArray6, 0);
        int[] intArray10 = ds.MaxMin2.maxMin2(intArray8, (int) (byte) -1);
        int[] intArray12 = ds.MaxMin2.maxMin2(intArray10, 0);
        int[] intArray14 = ds.MaxMin2.maxMin2(intArray12, 0);
        int[] intArray16 = ds.MaxMin2.maxMin2(intArray14, (int) (short) 1);
        int[] intArray18 = ds.MaxMin2.maxMin2(intArray14, 0);
        int[] intArray20 = ds.MaxMin2.maxMin2(intArray18, (int) (short) -1);
        int[] intArray22 = ds.MaxMin2.maxMin2(intArray20, (int) (byte) -1);
        java.lang.Class<?> wildcardClass23 = intArray20.getClass();
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[0, 10, 35, 0]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray16), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray18), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray20), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray22), "[0, 0]");
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test800() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test800");
        int[] intArray6 = new int[] { (byte) -1, (byte) 1, ' ', (short) 10, (short) 1, (byte) 1 };
        int[] intArray8 = ds.MaxMin2.maxMin2(intArray6, (int) (byte) 0);
        int[] intArray10 = ds.MaxMin2.maxMin2(intArray6, (int) (byte) 0);
        int[] intArray12 = ds.MaxMin2.maxMin2(intArray10, (int) (short) 0);
        int[] intArray14 = ds.MaxMin2.maxMin2(intArray12, (int) (short) 1);
        int[] intArray16 = ds.MaxMin2.maxMin2(intArray14, (int) (short) -1);
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[-1, 1, 32, 10, 1, 1]");
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray16), "[-1, -1]");
    }

    @Test
    public void test801() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test801");
        int[] intArray4 = new int[] { (byte) 0, 10, '#', (short) 0 };
        int[] intArray6 = ds.MaxMin2.maxMin2(intArray4, (int) (short) 1);
        int[] intArray8 = ds.MaxMin2.maxMin2(intArray4, 0);
        int[] intArray10 = ds.MaxMin2.maxMin2(intArray8, 0);
        int[] intArray12 = ds.MaxMin2.maxMin2(intArray8, (int) (byte) -1);
        java.lang.Class<?> wildcardClass13 = intArray8.getClass();
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[0, 10, 35, 0]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[0, 0]");
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test802() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test802");
        int[] intArray4 = new int[] { (byte) 0, 10, '#', (short) 0 };
        int[] intArray6 = ds.MaxMin2.maxMin2(intArray4, (int) (short) 1);
        int[] intArray8 = ds.MaxMin2.maxMin2(intArray4, (int) (short) 1);
        int[] intArray10 = ds.MaxMin2.maxMin2(intArray8, (int) (byte) -1);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray12 = ds.MaxMin2.maxMin2(intArray8, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[0, 10, 35, 0]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[0, 0]");
    }

    @Test
    public void test803() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test803");
        int[] intArray4 = new int[] { (byte) 0, 10, '#', (short) 0 };
        int[] intArray6 = ds.MaxMin2.maxMin2(intArray4, (int) (short) 1);
        int[] intArray8 = ds.MaxMin2.maxMin2(intArray6, 0);
        int[] intArray10 = ds.MaxMin2.maxMin2(intArray8, (int) (byte) -1);
        int[] intArray12 = ds.MaxMin2.maxMin2(intArray10, 0);
        int[] intArray14 = ds.MaxMin2.maxMin2(intArray12, 0);
        int[] intArray16 = ds.MaxMin2.maxMin2(intArray14, (int) (short) 1);
        int[] intArray18 = ds.MaxMin2.maxMin2(intArray14, 0);
        int[] intArray20 = ds.MaxMin2.maxMin2(intArray14, (int) (short) 0);
        int[] intArray22 = ds.MaxMin2.maxMin2(intArray14, 0);
        int[] intArray24 = ds.MaxMin2.maxMin2(intArray22, (int) (byte) 1);
        int[] intArray26 = ds.MaxMin2.maxMin2(intArray24, (-1));
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[0, 10, 35, 0]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray16), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray18), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray20), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray22), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray24), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray26), "[0, 0]");
    }

    @Test
    public void test804() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test804");
        int[] intArray4 = new int[] { (byte) 0, 10, '#', (short) 0 };
        int[] intArray6 = ds.MaxMin2.maxMin2(intArray4, (int) (short) 1);
        int[] intArray8 = ds.MaxMin2.maxMin2(intArray4, (int) (short) 1);
        int[] intArray10 = ds.MaxMin2.maxMin2(intArray8, (int) (byte) -1);
        int[] intArray12 = ds.MaxMin2.maxMin2(intArray10, (int) (short) 0);
        int[] intArray14 = ds.MaxMin2.maxMin2(intArray10, (int) (byte) 0);
        int[] intArray16 = ds.MaxMin2.maxMin2(intArray10, 0);
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[0, 10, 35, 0]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray16), "[0, 0]");
    }

    @Test
    public void test805() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test805");
        int[] intArray6 = new int[] { (byte) -1, (byte) 1, ' ', (short) 10, (short) 1, (byte) 1 };
        int[] intArray8 = ds.MaxMin2.maxMin2(intArray6, (int) (byte) 0);
        int[] intArray10 = ds.MaxMin2.maxMin2(intArray6, (int) (byte) 0);
        int[] intArray12 = ds.MaxMin2.maxMin2(intArray10, (int) (byte) -1);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray14 = ds.MaxMin2.maxMin2(intArray12, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[-1, 1, 32, 10, 1, 1]");
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[-1, -1]");
    }

    @Test
    public void test806() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test806");
        int[] intArray6 = new int[] { (byte) -1, (byte) 1, ' ', (short) 10, (short) 1, (byte) 1 };
        int[] intArray8 = ds.MaxMin2.maxMin2(intArray6, (int) (byte) 0);
        int[] intArray10 = ds.MaxMin2.maxMin2(intArray6, (int) (byte) 0);
        int[] intArray12 = ds.MaxMin2.maxMin2(intArray10, (int) (short) -1);
        int[] intArray14 = ds.MaxMin2.maxMin2(intArray10, (int) (byte) -1);
        int[] intArray16 = ds.MaxMin2.maxMin2(intArray10, 0);
        int[] intArray18 = ds.MaxMin2.maxMin2(intArray10, (int) (short) -1);
        java.lang.Class<?> wildcardClass19 = intArray18.getClass();
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[-1, 1, 32, 10, 1, 1]");
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray16), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray18), "[-1, -1]");
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test807() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test807");
        int[] intArray4 = new int[] { (byte) 0, 10, '#', (short) 0 };
        int[] intArray6 = ds.MaxMin2.maxMin2(intArray4, (int) (short) 1);
        int[] intArray8 = ds.MaxMin2.maxMin2(intArray6, 0);
        int[] intArray10 = ds.MaxMin2.maxMin2(intArray8, (int) (byte) -1);
        int[] intArray12 = ds.MaxMin2.maxMin2(intArray10, 0);
        int[] intArray14 = ds.MaxMin2.maxMin2(intArray12, (int) (short) 0);
        int[] intArray16 = ds.MaxMin2.maxMin2(intArray14, (int) (short) 0);
        java.lang.Class<?> wildcardClass17 = intArray16.getClass();
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[0, 10, 35, 0]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray16), "[0, 0]");
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test808() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test808");
        int[] intArray6 = new int[] { (byte) -1, (byte) 1, ' ', (short) 10, (short) 1, (byte) 1 };
        int[] intArray8 = ds.MaxMin2.maxMin2(intArray6, (int) (byte) 0);
        int[] intArray10 = ds.MaxMin2.maxMin2(intArray6, (int) (short) 1);
        int[] intArray12 = ds.MaxMin2.maxMin2(intArray10, (-1));
        int[] intArray14 = ds.MaxMin2.maxMin2(intArray10, (int) (byte) 0);
        int[] intArray16 = ds.MaxMin2.maxMin2(intArray14, 1);
        java.lang.Class<?> wildcardClass17 = intArray16.getClass();
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[-1, 1, 32, 10, 1, 1]");
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray16), "[-1, -1]");
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test809() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test809");
        int[] intArray4 = new int[] { (byte) 0, 10, '#', (short) 0 };
        int[] intArray6 = ds.MaxMin2.maxMin2(intArray4, (int) (short) 1);
        int[] intArray8 = ds.MaxMin2.maxMin2(intArray4, (int) (short) 1);
        int[] intArray10 = ds.MaxMin2.maxMin2(intArray8, (int) (byte) -1);
        int[] intArray12 = ds.MaxMin2.maxMin2(intArray10, 0);
        int[] intArray14 = ds.MaxMin2.maxMin2(intArray10, 1);
        int[] intArray16 = ds.MaxMin2.maxMin2(intArray10, (int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray18 = ds.MaxMin2.maxMin2(intArray16, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[0, 10, 35, 0]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray16), "[0, 0]");
    }

    @Test
    public void test810() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test810");
        int[] intArray6 = new int[] { (byte) -1, (byte) 1, ' ', (short) 10, (short) 1, (byte) 1 };
        int[] intArray8 = ds.MaxMin2.maxMin2(intArray6, (int) (byte) 0);
        int[] intArray10 = ds.MaxMin2.maxMin2(intArray6, (int) (short) 1);
        int[] intArray12 = ds.MaxMin2.maxMin2(intArray10, (-1));
        int[] intArray14 = ds.MaxMin2.maxMin2(intArray12, (int) (short) -1);
        int[] intArray16 = ds.MaxMin2.maxMin2(intArray14, (-1));
        int[] intArray18 = ds.MaxMin2.maxMin2(intArray14, 0);
        int[] intArray20 = ds.MaxMin2.maxMin2(intArray14, 1);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray22 = ds.MaxMin2.maxMin2(intArray14, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[-1, 1, 32, 10, 1, 1]");
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray16), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray18), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray20), "[-1, -1]");
    }

    @Test
    public void test811() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test811");
        int[] intArray6 = new int[] { (byte) -1, (byte) 1, ' ', (short) 10, (short) 1, (byte) 1 };
        int[] intArray8 = ds.MaxMin2.maxMin2(intArray6, (int) (byte) 0);
        int[] intArray10 = ds.MaxMin2.maxMin2(intArray6, (int) (short) 1);
        int[] intArray12 = ds.MaxMin2.maxMin2(intArray10, (-1));
        int[] intArray14 = ds.MaxMin2.maxMin2(intArray12, (int) (short) -1);
        int[] intArray16 = ds.MaxMin2.maxMin2(intArray14, (-1));
        int[] intArray18 = ds.MaxMin2.maxMin2(intArray14, 0);
        int[] intArray20 = ds.MaxMin2.maxMin2(intArray14, 1);
        int[] intArray22 = ds.MaxMin2.maxMin2(intArray20, (-1));
        int[] intArray24 = ds.MaxMin2.maxMin2(intArray22, (int) (short) 0);
        int[] intArray26 = ds.MaxMin2.maxMin2(intArray24, (int) (short) 0);
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[-1, 1, 32, 10, 1, 1]");
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray16), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray18), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray20), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray22), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray24), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray26), "[-1, -1]");
    }

    @Test
    public void test812() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test812");
        int[] intArray4 = new int[] { (byte) 0, 10, '#', (short) 0 };
        int[] intArray6 = ds.MaxMin2.maxMin2(intArray4, (int) (short) 1);
        int[] intArray8 = ds.MaxMin2.maxMin2(intArray6, 0);
        int[] intArray10 = ds.MaxMin2.maxMin2(intArray8, (int) (byte) -1);
        int[] intArray12 = ds.MaxMin2.maxMin2(intArray10, 0);
        int[] intArray14 = ds.MaxMin2.maxMin2(intArray10, (int) (byte) 1);
        int[] intArray16 = ds.MaxMin2.maxMin2(intArray14, 1);
        int[] intArray18 = ds.MaxMin2.maxMin2(intArray16, (int) (byte) 1);
        int[] intArray20 = ds.MaxMin2.maxMin2(intArray18, (int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray22 = ds.MaxMin2.maxMin2(intArray18, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[0, 10, 35, 0]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray16), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray18), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray20), "[0, 0]");
    }

    @Test
    public void test813() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test813");
        int[] intArray6 = new int[] { (byte) -1, (byte) 1, ' ', (short) 10, (short) 1, (byte) 1 };
        int[] intArray8 = ds.MaxMin2.maxMin2(intArray6, (int) (byte) 0);
        int[] intArray10 = ds.MaxMin2.maxMin2(intArray6, (int) (byte) 0);
        int[] intArray12 = ds.MaxMin2.maxMin2(intArray10, (int) (byte) -1);
        int[] intArray14 = ds.MaxMin2.maxMin2(intArray12, (int) (short) 0);
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[-1, 1, 32, 10, 1, 1]");
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[-1, -1]");
    }

    @Test
    public void test814() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test814");
        int[] intArray6 = new int[] { (byte) -1, (byte) 1, ' ', (short) 10, (short) 1, (byte) 1 };
        int[] intArray8 = ds.MaxMin2.maxMin2(intArray6, (int) (byte) 0);
        int[] intArray10 = ds.MaxMin2.maxMin2(intArray6, (int) (short) 1);
        int[] intArray12 = ds.MaxMin2.maxMin2(intArray10, (-1));
        int[] intArray14 = ds.MaxMin2.maxMin2(intArray12, (int) (short) -1);
        int[] intArray16 = ds.MaxMin2.maxMin2(intArray14, (-1));
        int[] intArray18 = ds.MaxMin2.maxMin2(intArray14, 0);
        int[] intArray20 = ds.MaxMin2.maxMin2(intArray14, 1);
        int[] intArray22 = ds.MaxMin2.maxMin2(intArray20, (int) (byte) 1);
        int[] intArray24 = ds.MaxMin2.maxMin2(intArray20, (int) (short) 0);
        java.lang.Class<?> wildcardClass25 = intArray20.getClass();
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[-1, 1, 32, 10, 1, 1]");
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray16), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray18), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray20), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray22), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray24), "[-1, -1]");
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test815() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test815");
        int[] intArray6 = new int[] { (byte) -1, (byte) 1, ' ', (short) 10, (short) 1, (byte) 1 };
        int[] intArray8 = ds.MaxMin2.maxMin2(intArray6, (int) (byte) 0);
        int[] intArray10 = ds.MaxMin2.maxMin2(intArray6, (int) (byte) 1);
        int[] intArray12 = ds.MaxMin2.maxMin2(intArray10, (int) (byte) 1);
        int[] intArray14 = ds.MaxMin2.maxMin2(intArray12, (int) (byte) -1);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray16 = ds.MaxMin2.maxMin2(intArray14, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[-1, 1, 32, 10, 1, 1]");
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[-1, -1]");
    }

    @Test
    public void test816() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test816");
        int[] intArray6 = new int[] { (byte) -1, (byte) 1, ' ', (short) 10, (short) 1, (byte) 1 };
        int[] intArray8 = ds.MaxMin2.maxMin2(intArray6, (int) (byte) 0);
        int[] intArray10 = ds.MaxMin2.maxMin2(intArray6, (int) (short) 1);
        int[] intArray12 = ds.MaxMin2.maxMin2(intArray10, (-1));
        int[] intArray14 = ds.MaxMin2.maxMin2(intArray12, (int) (short) -1);
        int[] intArray16 = ds.MaxMin2.maxMin2(intArray14, (-1));
        int[] intArray18 = ds.MaxMin2.maxMin2(intArray16, (int) (short) 1);
        int[] intArray20 = ds.MaxMin2.maxMin2(intArray16, (int) (short) 0);
        int[] intArray22 = ds.MaxMin2.maxMin2(intArray20, (-1));
        int[] intArray24 = ds.MaxMin2.maxMin2(intArray22, 0);
        java.lang.Class<?> wildcardClass25 = intArray22.getClass();
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[-1, 1, 32, 10, 1, 1]");
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray16), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray18), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray20), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray22), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray24), "[-1, -1]");
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test817() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test817");
        int[] intArray4 = new int[] { (byte) 0, 10, '#', (short) 0 };
        int[] intArray6 = ds.MaxMin2.maxMin2(intArray4, (int) (short) 1);
        int[] intArray8 = ds.MaxMin2.maxMin2(intArray6, 0);
        int[] intArray10 = ds.MaxMin2.maxMin2(intArray8, (int) (byte) -1);
        int[] intArray12 = ds.MaxMin2.maxMin2(intArray10, 0);
        int[] intArray14 = ds.MaxMin2.maxMin2(intArray12, 0);
        int[] intArray16 = ds.MaxMin2.maxMin2(intArray14, (int) (short) 1);
        int[] intArray18 = ds.MaxMin2.maxMin2(intArray14, 0);
        int[] intArray20 = ds.MaxMin2.maxMin2(intArray14, (int) (byte) 0);
        int[] intArray22 = ds.MaxMin2.maxMin2(intArray20, 1);
        int[] intArray24 = ds.MaxMin2.maxMin2(intArray20, (int) (byte) 0);
        int[] intArray26 = ds.MaxMin2.maxMin2(intArray24, 1);
        int[] intArray28 = ds.MaxMin2.maxMin2(intArray26, (-1));
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[0, 10, 35, 0]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray16), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray18), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray20), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray22), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray24), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray26), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray28);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray28), "[0, 0]");
    }

    @Test
    public void test818() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test818");
        int[] intArray6 = new int[] { (byte) -1, (byte) 1, ' ', (short) 10, (short) 1, (byte) 1 };
        int[] intArray8 = ds.MaxMin2.maxMin2(intArray6, (int) (byte) 0);
        int[] intArray10 = ds.MaxMin2.maxMin2(intArray6, (int) (short) 1);
        int[] intArray12 = ds.MaxMin2.maxMin2(intArray10, (-1));
        int[] intArray14 = ds.MaxMin2.maxMin2(intArray12, (int) (short) -1);
        int[] intArray16 = ds.MaxMin2.maxMin2(intArray14, (-1));
        int[] intArray18 = ds.MaxMin2.maxMin2(intArray14, 0);
        int[] intArray20 = ds.MaxMin2.maxMin2(intArray14, (int) (short) 1);
        int[] intArray22 = ds.MaxMin2.maxMin2(intArray20, 1);
        int[] intArray24 = ds.MaxMin2.maxMin2(intArray20, (int) (byte) 1);
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[-1, 1, 32, 10, 1, 1]");
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray16), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray18), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray20), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray22), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray24), "[-1, -1]");
    }

    @Test
    public void test819() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test819");
        int[] intArray6 = new int[] { (byte) -1, (byte) 1, ' ', (short) 10, (short) 1, (byte) 1 };
        int[] intArray8 = ds.MaxMin2.maxMin2(intArray6, (int) (byte) 0);
        int[] intArray10 = ds.MaxMin2.maxMin2(intArray6, (int) (short) 1);
        int[] intArray12 = ds.MaxMin2.maxMin2(intArray10, (-1));
        int[] intArray14 = ds.MaxMin2.maxMin2(intArray12, (int) (short) -1);
        int[] intArray16 = ds.MaxMin2.maxMin2(intArray14, (-1));
        int[] intArray18 = ds.MaxMin2.maxMin2(intArray14, 0);
        int[] intArray20 = ds.MaxMin2.maxMin2(intArray14, 1);
        int[] intArray22 = ds.MaxMin2.maxMin2(intArray20, 0);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray24 = ds.MaxMin2.maxMin2(intArray20, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[-1, 1, 32, 10, 1, 1]");
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray16), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray18), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray20), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray22), "[-1, -1]");
    }

    @Test
    public void test820() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test820");
        int[] intArray4 = new int[] { (byte) 0, 10, '#', (short) 0 };
        int[] intArray6 = ds.MaxMin2.maxMin2(intArray4, (int) (short) 1);
        int[] intArray8 = ds.MaxMin2.maxMin2(intArray4, (int) (short) 1);
        int[] intArray10 = ds.MaxMin2.maxMin2(intArray8, (int) (byte) -1);
        int[] intArray12 = ds.MaxMin2.maxMin2(intArray10, (int) (byte) 1);
        java.lang.Class<?> wildcardClass13 = intArray10.getClass();
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[0, 10, 35, 0]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[0, 0]");
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test821() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test821");
        int[] intArray4 = new int[] { (byte) 0, 10, '#', (short) 0 };
        int[] intArray6 = ds.MaxMin2.maxMin2(intArray4, (int) (short) 1);
        int[] intArray8 = ds.MaxMin2.maxMin2(intArray6, 0);
        int[] intArray10 = ds.MaxMin2.maxMin2(intArray8, 0);
        int[] intArray12 = ds.MaxMin2.maxMin2(intArray10, (int) (byte) -1);
        java.lang.Class<?> wildcardClass13 = intArray10.getClass();
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[0, 10, 35, 0]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[0, 0]");
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test822() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test822");
        int[] intArray6 = new int[] { (byte) -1, (byte) 1, ' ', (short) 10, (short) 1, (byte) 1 };
        int[] intArray8 = ds.MaxMin2.maxMin2(intArray6, (int) (byte) 0);
        int[] intArray10 = ds.MaxMin2.maxMin2(intArray6, (int) (byte) 0);
        int[] intArray12 = ds.MaxMin2.maxMin2(intArray10, (int) (byte) -1);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray14 = ds.MaxMin2.maxMin2(intArray12, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[-1, 1, 32, 10, 1, 1]");
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[-1, -1]");
    }

    @Test
    public void test823() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test823");
        int[] intArray6 = new int[] { (byte) -1, (byte) 1, ' ', (short) 10, (short) 1, (byte) 1 };
        int[] intArray8 = ds.MaxMin2.maxMin2(intArray6, (int) (byte) 0);
        int[] intArray10 = ds.MaxMin2.maxMin2(intArray6, (int) (short) 1);
        int[] intArray12 = ds.MaxMin2.maxMin2(intArray10, (-1));
        int[] intArray14 = ds.MaxMin2.maxMin2(intArray12, (int) (byte) -1);
        int[] intArray16 = ds.MaxMin2.maxMin2(intArray14, (int) (byte) 1);
        int[] intArray18 = ds.MaxMin2.maxMin2(intArray14, (int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray20 = ds.MaxMin2.maxMin2(intArray18, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[-1, 1, 32, 10, 1, 1]");
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray16), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray18), "[-1, -1]");
    }

    @Test
    public void test824() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test824");
        int[] intArray5 = new int[] { (short) 100, 1, 0, 100, ' ' };
        int[] intArray7 = ds.MaxMin2.maxMin2(intArray5, (int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray9 = ds.MaxMin2.maxMin2(intArray5, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[100, 1, 0, 100, 32]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[100, 100]");
    }

    @Test
    public void test825() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test825");
        int[] intArray4 = new int[] { (byte) 0, 10, '#', (short) 0 };
        int[] intArray6 = ds.MaxMin2.maxMin2(intArray4, (int) (short) 1);
        int[] intArray8 = ds.MaxMin2.maxMin2(intArray4, (int) (short) 1);
        int[] intArray10 = ds.MaxMin2.maxMin2(intArray8, (int) (byte) -1);
        int[] intArray12 = ds.MaxMin2.maxMin2(intArray10, 1);
        int[] intArray14 = ds.MaxMin2.maxMin2(intArray12, (int) (short) 1);
        int[] intArray16 = ds.MaxMin2.maxMin2(intArray14, 0);
        java.lang.Class<?> wildcardClass17 = intArray16.getClass();
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[0, 10, 35, 0]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray16), "[0, 0]");
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test826() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test826");
        int[] intArray4 = new int[] { (byte) 0, 10, '#', (short) 0 };
        int[] intArray6 = ds.MaxMin2.maxMin2(intArray4, (int) (short) 1);
        int[] intArray8 = ds.MaxMin2.maxMin2(intArray6, 0);
        int[] intArray10 = ds.MaxMin2.maxMin2(intArray6, (int) (byte) 1);
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[0, 10, 35, 0]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[0, 0]");
    }

    @Test
    public void test827() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test827");
        int[] intArray4 = new int[] { (byte) 0, 10, '#', (short) 0 };
        int[] intArray6 = ds.MaxMin2.maxMin2(intArray4, (int) (short) 1);
        int[] intArray8 = ds.MaxMin2.maxMin2(intArray6, 0);
        int[] intArray10 = ds.MaxMin2.maxMin2(intArray8, 0);
        int[] intArray12 = ds.MaxMin2.maxMin2(intArray8, 0);
        int[] intArray14 = ds.MaxMin2.maxMin2(intArray12, 0);
        int[] intArray16 = ds.MaxMin2.maxMin2(intArray14, (-1));
        int[] intArray18 = ds.MaxMin2.maxMin2(intArray16, (int) (byte) 1);
        int[] intArray20 = ds.MaxMin2.maxMin2(intArray18, (int) (byte) 0);
        int[] intArray22 = ds.MaxMin2.maxMin2(intArray20, (int) (short) 0);
        int[] intArray24 = ds.MaxMin2.maxMin2(intArray20, (-1));
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[0, 10, 35, 0]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray16), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray18), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray20), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray22), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray24), "[0, 0]");
    }

    @Test
    public void test828() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test828");
        int[] intArray6 = new int[] { (byte) -1, (byte) 1, ' ', (short) 10, (short) 1, (byte) 1 };
        int[] intArray8 = ds.MaxMin2.maxMin2(intArray6, (int) (byte) 0);
        int[] intArray10 = ds.MaxMin2.maxMin2(intArray6, (int) (short) 1);
        int[] intArray12 = ds.MaxMin2.maxMin2(intArray10, (-1));
        int[] intArray14 = ds.MaxMin2.maxMin2(intArray12, (int) (short) -1);
        int[] intArray16 = ds.MaxMin2.maxMin2(intArray14, (-1));
        int[] intArray18 = ds.MaxMin2.maxMin2(intArray14, 0);
        int[] intArray20 = ds.MaxMin2.maxMin2(intArray14, (int) (short) 1);
        int[] intArray22 = ds.MaxMin2.maxMin2(intArray20, (int) (short) 0);
        java.lang.Class<?> wildcardClass23 = intArray22.getClass();
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[-1, 1, 32, 10, 1, 1]");
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray16), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray18), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray20), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray22), "[-1, -1]");
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test829() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test829");
        int[] intArray6 = new int[] { (byte) -1, (byte) 1, ' ', (short) 10, (short) 1, (byte) 1 };
        int[] intArray8 = ds.MaxMin2.maxMin2(intArray6, (int) (byte) 0);
        int[] intArray10 = ds.MaxMin2.maxMin2(intArray6, (int) (short) 1);
        int[] intArray12 = ds.MaxMin2.maxMin2(intArray10, (-1));
        int[] intArray14 = ds.MaxMin2.maxMin2(intArray12, (int) (short) -1);
        int[] intArray16 = ds.MaxMin2.maxMin2(intArray14, (-1));
        int[] intArray18 = ds.MaxMin2.maxMin2(intArray16, (int) (short) 1);
        int[] intArray20 = ds.MaxMin2.maxMin2(intArray16, (int) (short) 0);
        int[] intArray22 = ds.MaxMin2.maxMin2(intArray20, (int) (byte) 0);
        int[] intArray24 = ds.MaxMin2.maxMin2(intArray20, 0);
        int[] intArray26 = ds.MaxMin2.maxMin2(intArray20, 1);
        int[] intArray28 = ds.MaxMin2.maxMin2(intArray20, 1);
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[-1, 1, 32, 10, 1, 1]");
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray16), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray18), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray20), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray22), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray24), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray26), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray28);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray28), "[-1, -1]");
    }

    @Test
    public void test830() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test830");
        int[] intArray6 = new int[] { (byte) -1, (byte) 1, ' ', (short) 10, (short) 1, (byte) 1 };
        int[] intArray8 = ds.MaxMin2.maxMin2(intArray6, (int) (byte) 0);
        int[] intArray10 = ds.MaxMin2.maxMin2(intArray6, (int) (byte) 1);
        int[] intArray12 = ds.MaxMin2.maxMin2(intArray10, (int) (byte) 1);
        int[] intArray14 = ds.MaxMin2.maxMin2(intArray12, (int) (byte) -1);
        int[] intArray16 = ds.MaxMin2.maxMin2(intArray12, (int) (short) 1);
        int[] intArray18 = ds.MaxMin2.maxMin2(intArray12, 1);
        int[] intArray20 = ds.MaxMin2.maxMin2(intArray12, (int) (short) -1);
        java.lang.Class<?> wildcardClass21 = intArray20.getClass();
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[-1, 1, 32, 10, 1, 1]");
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray16), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray18), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray20), "[-1, -1]");
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test831() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test831");
        int[] intArray6 = new int[] { (byte) -1, (byte) 1, ' ', (short) 10, (short) 1, (byte) 1 };
        int[] intArray8 = ds.MaxMin2.maxMin2(intArray6, (int) (byte) 0);
        int[] intArray10 = ds.MaxMin2.maxMin2(intArray8, (-1));
        int[] intArray12 = ds.MaxMin2.maxMin2(intArray10, (int) (byte) -1);
        int[] intArray14 = ds.MaxMin2.maxMin2(intArray10, (int) (byte) -1);
        java.lang.Class<?> wildcardClass15 = intArray10.getClass();
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[-1, 1, 32, 10, 1, 1]");
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[-1, -1]");
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test832() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test832");
        int[] intArray4 = new int[] { (byte) 0, 10, '#', (short) 0 };
        int[] intArray6 = ds.MaxMin2.maxMin2(intArray4, (int) (short) 1);
        int[] intArray8 = ds.MaxMin2.maxMin2(intArray4, (int) (short) 1);
        int[] intArray10 = ds.MaxMin2.maxMin2(intArray4, (-1));
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray12 = ds.MaxMin2.maxMin2(intArray4, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[0, 10, 35, 0]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[0, 0]");
    }

    @Test
    public void test833() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test833");
        int[] intArray4 = new int[] { (byte) 0, 10, '#', (short) 0 };
        int[] intArray6 = ds.MaxMin2.maxMin2(intArray4, (int) (short) 1);
        int[] intArray8 = ds.MaxMin2.maxMin2(intArray6, 0);
        int[] intArray10 = ds.MaxMin2.maxMin2(intArray8, (int) (byte) -1);
        int[] intArray12 = ds.MaxMin2.maxMin2(intArray10, 0);
        int[] intArray14 = ds.MaxMin2.maxMin2(intArray10, (int) (short) 0);
        int[] intArray16 = ds.MaxMin2.maxMin2(intArray10, (int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray18 = ds.MaxMin2.maxMin2(intArray10, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[0, 10, 35, 0]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray16), "[0, 0]");
    }

    @Test
    public void test834() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test834");
        int[] intArray4 = new int[] { (byte) 0, 10, '#', (short) 0 };
        int[] intArray6 = ds.MaxMin2.maxMin2(intArray4, (int) (short) 1);
        int[] intArray8 = ds.MaxMin2.maxMin2(intArray6, 0);
        int[] intArray10 = ds.MaxMin2.maxMin2(intArray8, (int) (byte) -1);
        int[] intArray12 = ds.MaxMin2.maxMin2(intArray8, (-1));
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[0, 10, 35, 0]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[0, 0]");
    }

    @Test
    public void test835() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test835");
        int[] intArray4 = new int[] { (byte) 0, 10, '#', (short) 0 };
        int[] intArray6 = ds.MaxMin2.maxMin2(intArray4, (int) (short) 1);
        int[] intArray8 = ds.MaxMin2.maxMin2(intArray6, 0);
        int[] intArray10 = ds.MaxMin2.maxMin2(intArray8, (int) (byte) -1);
        int[] intArray12 = ds.MaxMin2.maxMin2(intArray10, 0);
        int[] intArray14 = ds.MaxMin2.maxMin2(intArray12, (int) (short) 1);
        int[] intArray16 = ds.MaxMin2.maxMin2(intArray14, 0);
        int[] intArray18 = ds.MaxMin2.maxMin2(intArray16, (int) (short) -1);
        java.lang.Class<?> wildcardClass19 = intArray16.getClass();
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[0, 10, 35, 0]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray16), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray18), "[0, 0]");
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test836() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test836");
        int[] intArray4 = new int[] { (byte) 0, 10, '#', (short) 0 };
        int[] intArray6 = ds.MaxMin2.maxMin2(intArray4, (int) (short) 1);
        int[] intArray8 = ds.MaxMin2.maxMin2(intArray4, (int) (short) 0);
        java.lang.Class<?> wildcardClass9 = intArray4.getClass();
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[0, 10, 35, 0]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[0, 0]");
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test837() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test837");
        int[] intArray6 = new int[] { (byte) -1, (byte) 1, ' ', (short) 10, (short) 1, (byte) 1 };
        int[] intArray8 = ds.MaxMin2.maxMin2(intArray6, (int) (byte) 0);
        int[] intArray10 = ds.MaxMin2.maxMin2(intArray6, (int) (byte) 1);
        int[] intArray12 = ds.MaxMin2.maxMin2(intArray6, (int) (byte) -1);
        int[] intArray14 = ds.MaxMin2.maxMin2(intArray6, 0);
        int[] intArray16 = ds.MaxMin2.maxMin2(intArray14, (int) (byte) 0);
        java.lang.Class<?> wildcardClass17 = intArray16.getClass();
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[-1, 1, 32, 10, 1, 1]");
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray16), "[-1, -1]");
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test838() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test838");
        int[] intArray6 = new int[] { (byte) -1, (byte) 1, ' ', (short) 10, (short) 1, (byte) 1 };
        int[] intArray8 = ds.MaxMin2.maxMin2(intArray6, (int) (byte) 0);
        int[] intArray10 = ds.MaxMin2.maxMin2(intArray8, (-1));
        int[] intArray12 = ds.MaxMin2.maxMin2(intArray10, (int) (byte) -1);
        int[] intArray14 = ds.MaxMin2.maxMin2(intArray10, (-1));
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[-1, 1, 32, 10, 1, 1]");
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[-1, -1]");
    }

    @Test
    public void test839() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test839");
        int[] intArray4 = new int[] { (byte) 0, 10, '#', (short) 0 };
        int[] intArray6 = ds.MaxMin2.maxMin2(intArray4, (int) (short) 1);
        int[] intArray8 = ds.MaxMin2.maxMin2(intArray4, (int) (byte) -1);
        int[] intArray10 = ds.MaxMin2.maxMin2(intArray8, (int) (short) 0);
        int[] intArray12 = ds.MaxMin2.maxMin2(intArray8, 0);
        java.lang.Class<?> wildcardClass13 = intArray12.getClass();
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[0, 10, 35, 0]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[0, 0]");
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test840() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test840");
        int[] intArray6 = new int[] { (byte) -1, (byte) 1, ' ', (short) 10, (short) 1, (byte) 1 };
        int[] intArray8 = ds.MaxMin2.maxMin2(intArray6, (int) (byte) 0);
        int[] intArray10 = ds.MaxMin2.maxMin2(intArray6, (int) (byte) 0);
        int[] intArray12 = ds.MaxMin2.maxMin2(intArray10, (int) (short) -1);
        int[] intArray14 = ds.MaxMin2.maxMin2(intArray10, (int) (byte) -1);
        int[] intArray16 = ds.MaxMin2.maxMin2(intArray10, 0);
        int[] intArray18 = ds.MaxMin2.maxMin2(intArray16, (int) (byte) -1);
        int[] intArray20 = ds.MaxMin2.maxMin2(intArray18, (int) (short) -1);
        int[] intArray22 = ds.MaxMin2.maxMin2(intArray20, (int) (byte) -1);
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[-1, 1, 32, 10, 1, 1]");
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray16), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray18), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray20), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray22), "[-1, -1]");
    }

    @Test
    public void test841() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test841");
        int[] intArray6 = new int[] { (byte) -1, (byte) 1, ' ', (short) 10, (short) 1, (byte) 1 };
        int[] intArray8 = ds.MaxMin2.maxMin2(intArray6, (int) (byte) 0);
        int[] intArray10 = ds.MaxMin2.maxMin2(intArray6, (int) (short) 1);
        int[] intArray12 = ds.MaxMin2.maxMin2(intArray10, (-1));
        int[] intArray14 = ds.MaxMin2.maxMin2(intArray12, (int) (short) -1);
        int[] intArray16 = ds.MaxMin2.maxMin2(intArray14, (-1));
        int[] intArray18 = ds.MaxMin2.maxMin2(intArray14, 0);
        int[] intArray20 = ds.MaxMin2.maxMin2(intArray14, 1);
        int[] intArray22 = ds.MaxMin2.maxMin2(intArray20, (int) (byte) 1);
        int[] intArray24 = ds.MaxMin2.maxMin2(intArray20, 0);
        java.lang.Class<?> wildcardClass25 = intArray24.getClass();
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[-1, 1, 32, 10, 1, 1]");
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray16), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray18), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray20), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray22), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray24), "[-1, -1]");
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test842() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test842");
        int[] intArray4 = new int[] { (byte) 0, 10, '#', (short) 0 };
        int[] intArray6 = ds.MaxMin2.maxMin2(intArray4, (int) (short) 1);
        int[] intArray8 = ds.MaxMin2.maxMin2(intArray6, 0);
        int[] intArray10 = ds.MaxMin2.maxMin2(intArray8, 0);
        int[] intArray12 = ds.MaxMin2.maxMin2(intArray8, 0);
        int[] intArray14 = ds.MaxMin2.maxMin2(intArray12, 0);
        int[] intArray16 = ds.MaxMin2.maxMin2(intArray14, (-1));
        int[] intArray18 = ds.MaxMin2.maxMin2(intArray16, (int) (short) 0);
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[0, 10, 35, 0]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray16), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray18), "[0, 0]");
    }

    @Test
    public void test843() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test843");
        int[] intArray6 = new int[] { (byte) -1, (byte) 1, ' ', (short) 10, (short) 1, (byte) 1 };
        int[] intArray8 = ds.MaxMin2.maxMin2(intArray6, (int) (byte) 0);
        int[] intArray10 = ds.MaxMin2.maxMin2(intArray6, (int) (short) 1);
        int[] intArray12 = ds.MaxMin2.maxMin2(intArray10, (-1));
        int[] intArray14 = ds.MaxMin2.maxMin2(intArray12, (int) (byte) -1);
        int[] intArray16 = ds.MaxMin2.maxMin2(intArray14, (int) (short) 1);
        int[] intArray18 = ds.MaxMin2.maxMin2(intArray16, (int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray20 = ds.MaxMin2.maxMin2(intArray18, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[-1, 1, 32, 10, 1, 1]");
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray16), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray18), "[-1, -1]");
    }

    @Test
    public void test844() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test844");
        int[] intArray4 = new int[] { (byte) 0, 10, '#', (short) 0 };
        int[] intArray6 = ds.MaxMin2.maxMin2(intArray4, (int) (short) 1);
        int[] intArray8 = ds.MaxMin2.maxMin2(intArray6, 0);
        int[] intArray10 = ds.MaxMin2.maxMin2(intArray8, 0);
        int[] intArray12 = ds.MaxMin2.maxMin2(intArray8, 0);
        int[] intArray14 = ds.MaxMin2.maxMin2(intArray12, 0);
        int[] intArray16 = ds.MaxMin2.maxMin2(intArray12, (int) (short) -1);
        int[] intArray18 = ds.MaxMin2.maxMin2(intArray12, (int) (byte) 1);
        int[] intArray20 = ds.MaxMin2.maxMin2(intArray12, (int) (byte) 1);
        int[] intArray22 = ds.MaxMin2.maxMin2(intArray20, (int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray24 = ds.MaxMin2.maxMin2(intArray22, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[0, 10, 35, 0]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray16), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray18), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray20), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray22), "[0, 0]");
    }

    @Test
    public void test845() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test845");
        int[] intArray6 = new int[] { (byte) -1, (byte) 1, ' ', (short) 10, (short) 1, (byte) 1 };
        int[] intArray8 = ds.MaxMin2.maxMin2(intArray6, (int) (byte) 0);
        int[] intArray10 = ds.MaxMin2.maxMin2(intArray6, (int) (byte) 0);
        int[] intArray12 = ds.MaxMin2.maxMin2(intArray10, (int) (short) -1);
        int[] intArray14 = ds.MaxMin2.maxMin2(intArray10, (int) (byte) -1);
        int[] intArray16 = ds.MaxMin2.maxMin2(intArray10, (int) (short) 0);
        java.lang.Class<?> wildcardClass17 = intArray10.getClass();
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[-1, 1, 32, 10, 1, 1]");
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray16), "[-1, -1]");
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test846() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test846");
        int[] intArray4 = new int[] { (byte) 0, 10, '#', (short) 0 };
        int[] intArray6 = ds.MaxMin2.maxMin2(intArray4, (int) (short) 1);
        int[] intArray8 = ds.MaxMin2.maxMin2(intArray6, 0);
        int[] intArray10 = ds.MaxMin2.maxMin2(intArray8, 0);
        int[] intArray12 = ds.MaxMin2.maxMin2(intArray8, 0);
        int[] intArray14 = ds.MaxMin2.maxMin2(intArray12, 0);
        int[] intArray16 = ds.MaxMin2.maxMin2(intArray12, 0);
        int[] intArray18 = ds.MaxMin2.maxMin2(intArray16, 1);
        int[] intArray20 = ds.MaxMin2.maxMin2(intArray16, (int) (byte) 0);
        int[] intArray22 = ds.MaxMin2.maxMin2(intArray16, (int) (byte) 0);
        java.lang.Class<?> wildcardClass23 = intArray22.getClass();
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[0, 10, 35, 0]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray16), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray18), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray20), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray22), "[0, 0]");
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test847() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test847");
        int[] intArray6 = new int[] { (byte) -1, (byte) 1, ' ', (short) 10, (short) 1, (byte) 1 };
        int[] intArray8 = ds.MaxMin2.maxMin2(intArray6, (int) (byte) 0);
        int[] intArray10 = ds.MaxMin2.maxMin2(intArray6, (int) (short) 1);
        int[] intArray12 = ds.MaxMin2.maxMin2(intArray10, (-1));
        int[] intArray14 = ds.MaxMin2.maxMin2(intArray12, (int) (short) -1);
        int[] intArray16 = ds.MaxMin2.maxMin2(intArray14, (-1));
        int[] intArray18 = ds.MaxMin2.maxMin2(intArray14, 0);
        int[] intArray20 = ds.MaxMin2.maxMin2(intArray18, 0);
        int[] intArray22 = ds.MaxMin2.maxMin2(intArray18, 0);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray24 = ds.MaxMin2.maxMin2(intArray22, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[-1, 1, 32, 10, 1, 1]");
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray16), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray18), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray20), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray22), "[-1, -1]");
    }

    @Test
    public void test848() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test848");
        int[] intArray4 = new int[] { (byte) 0, 10, '#', (short) 0 };
        int[] intArray6 = ds.MaxMin2.maxMin2(intArray4, (int) (short) 1);
        int[] intArray8 = ds.MaxMin2.maxMin2(intArray6, 0);
        int[] intArray10 = ds.MaxMin2.maxMin2(intArray8, 0);
        int[] intArray12 = ds.MaxMin2.maxMin2(intArray8, 0);
        int[] intArray14 = ds.MaxMin2.maxMin2(intArray12, 0);
        int[] intArray16 = ds.MaxMin2.maxMin2(intArray12, (int) (short) -1);
        int[] intArray18 = ds.MaxMin2.maxMin2(intArray16, 0);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray20 = ds.MaxMin2.maxMin2(intArray18, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[0, 10, 35, 0]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray16), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray18), "[0, 0]");
    }

    @Test
    public void test849() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test849");
        int[] intArray4 = new int[] { (byte) 0, 10, '#', (short) 0 };
        int[] intArray6 = ds.MaxMin2.maxMin2(intArray4, (int) (short) 1);
        int[] intArray8 = ds.MaxMin2.maxMin2(intArray4, (int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray10 = ds.MaxMin2.maxMin2(intArray8, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[0, 10, 35, 0]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[0, 0]");
    }

    @Test
    public void test850() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test850");
        int[] intArray4 = new int[] { (byte) 0, 10, '#', (short) 0 };
        int[] intArray6 = ds.MaxMin2.maxMin2(intArray4, (int) (short) 1);
        int[] intArray8 = ds.MaxMin2.maxMin2(intArray6, 0);
        int[] intArray10 = ds.MaxMin2.maxMin2(intArray8, 0);
        int[] intArray12 = ds.MaxMin2.maxMin2(intArray8, 0);
        int[] intArray14 = ds.MaxMin2.maxMin2(intArray12, 0);
        int[] intArray16 = ds.MaxMin2.maxMin2(intArray12, 0);
        int[] intArray18 = ds.MaxMin2.maxMin2(intArray16, (int) (short) 1);
        java.lang.Class<?> wildcardClass19 = intArray16.getClass();
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[0, 10, 35, 0]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray16), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray18), "[0, 0]");
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test851() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test851");
        int[] intArray6 = new int[] { (byte) -1, (byte) 1, ' ', (short) 10, (short) 1, (byte) 1 };
        int[] intArray8 = ds.MaxMin2.maxMin2(intArray6, (int) (byte) 0);
        int[] intArray10 = ds.MaxMin2.maxMin2(intArray6, (int) (byte) 1);
        int[] intArray12 = ds.MaxMin2.maxMin2(intArray10, (int) (byte) 1);
        int[] intArray14 = ds.MaxMin2.maxMin2(intArray10, 0);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray16 = ds.MaxMin2.maxMin2(intArray14, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[-1, 1, 32, 10, 1, 1]");
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[-1, -1]");
    }

    @Test
    public void test852() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test852");
        int[] intArray6 = new int[] { (byte) -1, (byte) 1, ' ', (short) 10, (short) 1, (byte) 1 };
        int[] intArray8 = ds.MaxMin2.maxMin2(intArray6, (int) (byte) 0);
        int[] intArray10 = ds.MaxMin2.maxMin2(intArray6, (int) (short) 1);
        int[] intArray12 = ds.MaxMin2.maxMin2(intArray10, (-1));
        int[] intArray14 = ds.MaxMin2.maxMin2(intArray12, (int) (short) -1);
        int[] intArray16 = ds.MaxMin2.maxMin2(intArray14, (-1));
        int[] intArray18 = ds.MaxMin2.maxMin2(intArray14, (int) (short) -1);
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[-1, 1, 32, 10, 1, 1]");
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray16), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray18), "[-1, -1]");
    }

    @Test
    public void test853() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test853");
        int[] intArray4 = new int[] { (byte) 0, 10, '#', (short) 0 };
        int[] intArray6 = ds.MaxMin2.maxMin2(intArray4, (int) (short) 1);
        int[] intArray8 = ds.MaxMin2.maxMin2(intArray6, 0);
        int[] intArray10 = ds.MaxMin2.maxMin2(intArray8, (int) (byte) -1);
        int[] intArray12 = ds.MaxMin2.maxMin2(intArray10, 0);
        int[] intArray14 = ds.MaxMin2.maxMin2(intArray12, 0);
        int[] intArray16 = ds.MaxMin2.maxMin2(intArray14, (int) (short) 1);
        int[] intArray18 = ds.MaxMin2.maxMin2(intArray14, 0);
        int[] intArray20 = ds.MaxMin2.maxMin2(intArray14, (int) (short) 0);
        int[] intArray22 = ds.MaxMin2.maxMin2(intArray20, (int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray24 = ds.MaxMin2.maxMin2(intArray22, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[0, 10, 35, 0]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray16), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray18), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray20), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray22), "[0, 0]");
    }

    @Test
    public void test854() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test854");
        int[] intArray4 = new int[] { (byte) 0, 10, '#', (short) 0 };
        int[] intArray6 = ds.MaxMin2.maxMin2(intArray4, (int) (short) 1);
        int[] intArray8 = ds.MaxMin2.maxMin2(intArray4, (int) (short) 1);
        int[] intArray10 = ds.MaxMin2.maxMin2(intArray8, (int) (byte) -1);
        int[] intArray12 = ds.MaxMin2.maxMin2(intArray10, 1);
        int[] intArray14 = ds.MaxMin2.maxMin2(intArray10, 1);
        int[] intArray16 = ds.MaxMin2.maxMin2(intArray10, (int) (short) -1);
        int[] intArray18 = ds.MaxMin2.maxMin2(intArray16, (int) (short) 0);
        int[] intArray20 = ds.MaxMin2.maxMin2(intArray18, 0);
        java.lang.Class<?> wildcardClass21 = intArray20.getClass();
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[0, 10, 35, 0]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray16), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray18), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray20), "[0, 0]");
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test855() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test855");
        int[] intArray6 = new int[] { (byte) -1, (byte) 1, ' ', (short) 10, (short) 1, (byte) 1 };
        int[] intArray8 = ds.MaxMin2.maxMin2(intArray6, (int) (byte) 0);
        int[] intArray10 = ds.MaxMin2.maxMin2(intArray6, (int) (byte) 1);
        int[] intArray12 = ds.MaxMin2.maxMin2(intArray6, (int) (byte) -1);
        int[] intArray14 = ds.MaxMin2.maxMin2(intArray6, (int) (byte) 1);
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[-1, 1, 32, 10, 1, 1]");
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[-1, -1]");
    }

    @Test
    public void test856() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test856");
        int[] intArray4 = new int[] { (byte) 0, 10, '#', (short) 0 };
        int[] intArray6 = ds.MaxMin2.maxMin2(intArray4, (int) (short) 1);
        int[] intArray8 = ds.MaxMin2.maxMin2(intArray4, (int) (short) 1);
        int[] intArray10 = ds.MaxMin2.maxMin2(intArray8, (int) (byte) -1);
        int[] intArray12 = ds.MaxMin2.maxMin2(intArray10, 1);
        int[] intArray14 = ds.MaxMin2.maxMin2(intArray10, 1);
        int[] intArray16 = ds.MaxMin2.maxMin2(intArray10, (int) (short) -1);
        int[] intArray18 = ds.MaxMin2.maxMin2(intArray16, (int) (short) 0);
        int[] intArray20 = ds.MaxMin2.maxMin2(intArray18, 0);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray22 = ds.MaxMin2.maxMin2(intArray20, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[0, 10, 35, 0]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray16), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray18), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray20), "[0, 0]");
    }

    @Test
    public void test857() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test857");
        int[] intArray4 = new int[] { (byte) 0, 10, '#', (short) 0 };
        int[] intArray6 = ds.MaxMin2.maxMin2(intArray4, (int) (short) 1);
        int[] intArray8 = ds.MaxMin2.maxMin2(intArray4, (int) (short) 1);
        int[] intArray10 = ds.MaxMin2.maxMin2(intArray8, (int) (short) 1);
        int[] intArray12 = ds.MaxMin2.maxMin2(intArray8, 0);
        int[] intArray14 = ds.MaxMin2.maxMin2(intArray12, 0);
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[0, 10, 35, 0]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[0, 0]");
    }

    @Test
    public void test858() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test858");
        int[] intArray4 = new int[] { (byte) 0, 10, '#', (short) 0 };
        int[] intArray6 = ds.MaxMin2.maxMin2(intArray4, (int) (short) 1);
        int[] intArray8 = ds.MaxMin2.maxMin2(intArray6, 0);
        int[] intArray10 = ds.MaxMin2.maxMin2(intArray8, 0);
        int[] intArray12 = ds.MaxMin2.maxMin2(intArray8, 0);
        int[] intArray14 = ds.MaxMin2.maxMin2(intArray12, 0);
        int[] intArray16 = ds.MaxMin2.maxMin2(intArray12, 0);
        int[] intArray18 = ds.MaxMin2.maxMin2(intArray16, 1);
        int[] intArray20 = ds.MaxMin2.maxMin2(intArray16, (int) (byte) 0);
        java.lang.Class<?> wildcardClass21 = intArray20.getClass();
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[0, 10, 35, 0]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray16), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray18), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray20), "[0, 0]");
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test859() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test859");
        int[] intArray4 = new int[] { (byte) 0, 10, '#', (short) 0 };
        int[] intArray6 = ds.MaxMin2.maxMin2(intArray4, (int) (short) 1);
        int[] intArray8 = ds.MaxMin2.maxMin2(intArray6, 0);
        int[] intArray10 = ds.MaxMin2.maxMin2(intArray8, (int) (byte) -1);
        int[] intArray12 = ds.MaxMin2.maxMin2(intArray10, 0);
        int[] intArray14 = ds.MaxMin2.maxMin2(intArray12, 0);
        int[] intArray16 = ds.MaxMin2.maxMin2(intArray14, (int) (short) 1);
        int[] intArray18 = ds.MaxMin2.maxMin2(intArray14, 0);
        int[] intArray20 = ds.MaxMin2.maxMin2(intArray14, (int) (short) 0);
        java.lang.Class<?> wildcardClass21 = intArray20.getClass();
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[0, 10, 35, 0]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray16), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray18), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray20), "[0, 0]");
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test860() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test860");
        int[] intArray6 = new int[] { (byte) -1, (byte) 1, ' ', (short) 10, (short) 1, (byte) 1 };
        int[] intArray8 = ds.MaxMin2.maxMin2(intArray6, (int) (byte) 0);
        int[] intArray10 = ds.MaxMin2.maxMin2(intArray6, (int) (short) 1);
        int[] intArray12 = ds.MaxMin2.maxMin2(intArray10, (-1));
        int[] intArray14 = ds.MaxMin2.maxMin2(intArray12, (int) (short) -1);
        int[] intArray16 = ds.MaxMin2.maxMin2(intArray14, (-1));
        int[] intArray18 = ds.MaxMin2.maxMin2(intArray16, (int) (short) 1);
        int[] intArray20 = ds.MaxMin2.maxMin2(intArray16, (int) (byte) 1);
        int[] intArray22 = ds.MaxMin2.maxMin2(intArray16, 0);
        int[] intArray24 = ds.MaxMin2.maxMin2(intArray22, 0);
        int[] intArray26 = ds.MaxMin2.maxMin2(intArray24, (int) (short) 0);
        int[] intArray28 = ds.MaxMin2.maxMin2(intArray26, (-1));
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[-1, 1, 32, 10, 1, 1]");
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray16), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray18), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray20), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray22), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray24), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray26), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray28);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray28), "[-1, -1]");
    }

    @Test
    public void test861() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test861");
        int[] intArray4 = new int[] { (byte) 0, 10, '#', (short) 0 };
        int[] intArray6 = ds.MaxMin2.maxMin2(intArray4, (int) (short) 1);
        int[] intArray8 = ds.MaxMin2.maxMin2(intArray6, 0);
        int[] intArray10 = ds.MaxMin2.maxMin2(intArray6, 0);
        int[] intArray12 = ds.MaxMin2.maxMin2(intArray10, (-1));
        int[] intArray14 = ds.MaxMin2.maxMin2(intArray10, (int) (short) -1);
        java.lang.Class<?> wildcardClass15 = intArray14.getClass();
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[0, 10, 35, 0]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[0, 0]");
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test862() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test862");
        int[] intArray4 = new int[] { (byte) 0, 10, '#', (short) 0 };
        int[] intArray6 = ds.MaxMin2.maxMin2(intArray4, (int) (short) 1);
        int[] intArray8 = ds.MaxMin2.maxMin2(intArray6, 0);
        int[] intArray10 = ds.MaxMin2.maxMin2(intArray8, (int) (byte) -1);
        int[] intArray12 = ds.MaxMin2.maxMin2(intArray10, 0);
        int[] intArray14 = ds.MaxMin2.maxMin2(intArray12, 0);
        int[] intArray16 = ds.MaxMin2.maxMin2(intArray14, (int) (short) 1);
        int[] intArray18 = ds.MaxMin2.maxMin2(intArray14, 0);
        int[] intArray20 = ds.MaxMin2.maxMin2(intArray14, (int) (short) 0);
        int[] intArray22 = ds.MaxMin2.maxMin2(intArray20, (int) (byte) 0);
        int[] intArray24 = ds.MaxMin2.maxMin2(intArray22, (int) (short) -1);
        java.lang.Class<?> wildcardClass25 = intArray22.getClass();
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[0, 10, 35, 0]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray16), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray18), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray20), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray22), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray24), "[0, 0]");
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test863() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test863");
        int[] intArray4 = new int[] { (byte) 0, 10, '#', (short) 0 };
        int[] intArray6 = ds.MaxMin2.maxMin2(intArray4, (int) (short) 1);
        int[] intArray8 = ds.MaxMin2.maxMin2(intArray6, 0);
        int[] intArray10 = ds.MaxMin2.maxMin2(intArray8, (int) (byte) -1);
        int[] intArray12 = ds.MaxMin2.maxMin2(intArray10, 0);
        int[] intArray14 = ds.MaxMin2.maxMin2(intArray10, (int) (byte) 1);
        int[] intArray16 = ds.MaxMin2.maxMin2(intArray14, 1);
        int[] intArray18 = ds.MaxMin2.maxMin2(intArray16, 0);
        int[] intArray20 = ds.MaxMin2.maxMin2(intArray18, (int) (byte) 1);
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[0, 10, 35, 0]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray16), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray18), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray20), "[0, 0]");
    }

    @Test
    public void test864() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test864");
        int[] intArray4 = new int[] { (byte) 0, 10, '#', (short) 0 };
        int[] intArray6 = ds.MaxMin2.maxMin2(intArray4, (int) (short) 1);
        int[] intArray8 = ds.MaxMin2.maxMin2(intArray6, 0);
        int[] intArray10 = ds.MaxMin2.maxMin2(intArray8, (int) (byte) -1);
        int[] intArray12 = ds.MaxMin2.maxMin2(intArray10, 0);
        int[] intArray14 = ds.MaxMin2.maxMin2(intArray10, (int) (short) 0);
        int[] intArray16 = ds.MaxMin2.maxMin2(intArray10, (int) (byte) 0);
        int[] intArray18 = ds.MaxMin2.maxMin2(intArray16, (int) (byte) 1);
        int[] intArray20 = ds.MaxMin2.maxMin2(intArray16, 1);
        int[] intArray22 = ds.MaxMin2.maxMin2(intArray16, (int) (byte) -1);
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[0, 10, 35, 0]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray16), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray18), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray20), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray22), "[0, 0]");
    }

    @Test
    public void test865() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test865");
        int[] intArray6 = new int[] { (byte) -1, (byte) 1, ' ', (short) 10, (short) 1, (byte) 1 };
        int[] intArray8 = ds.MaxMin2.maxMin2(intArray6, (int) (byte) 0);
        int[] intArray10 = ds.MaxMin2.maxMin2(intArray8, 0);
        java.lang.Class<?> wildcardClass11 = intArray8.getClass();
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[-1, 1, 32, 10, 1, 1]");
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[-1, -1]");
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test866() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test866");
        int[] intArray4 = new int[] { (byte) 0, 10, '#', (short) 0 };
        int[] intArray6 = ds.MaxMin2.maxMin2(intArray4, (int) (short) 1);
        int[] intArray8 = ds.MaxMin2.maxMin2(intArray6, 0);
        int[] intArray10 = ds.MaxMin2.maxMin2(intArray8, 0);
        int[] intArray12 = ds.MaxMin2.maxMin2(intArray8, 0);
        int[] intArray14 = ds.MaxMin2.maxMin2(intArray12, 0);
        int[] intArray16 = ds.MaxMin2.maxMin2(intArray12, 0);
        int[] intArray18 = ds.MaxMin2.maxMin2(intArray12, (int) (byte) -1);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray20 = ds.MaxMin2.maxMin2(intArray12, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[0, 10, 35, 0]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray16), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray18), "[0, 0]");
    }

    @Test
    public void test867() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test867");
        int[] intArray4 = new int[] { (byte) 0, 10, '#', (short) 0 };
        int[] intArray6 = ds.MaxMin2.maxMin2(intArray4, (int) (short) 1);
        int[] intArray8 = ds.MaxMin2.maxMin2(intArray4, (int) (short) 1);
        int[] intArray10 = ds.MaxMin2.maxMin2(intArray8, (int) (byte) -1);
        int[] intArray12 = ds.MaxMin2.maxMin2(intArray10, 1);
        int[] intArray14 = ds.MaxMin2.maxMin2(intArray10, 1);
        int[] intArray16 = ds.MaxMin2.maxMin2(intArray10, (int) (short) -1);
        int[] intArray18 = ds.MaxMin2.maxMin2(intArray16, (int) (short) 0);
        int[] intArray20 = ds.MaxMin2.maxMin2(intArray16, (int) (short) 0);
        int[] intArray22 = ds.MaxMin2.maxMin2(intArray20, (int) (short) 1);
        java.lang.Class<?> wildcardClass23 = intArray20.getClass();
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[0, 10, 35, 0]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray16), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray18), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray20), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray22), "[0, 0]");
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test868() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test868");
        int[] intArray6 = new int[] { (byte) -1, (byte) 1, ' ', (short) 10, (short) 1, (byte) 1 };
        int[] intArray8 = ds.MaxMin2.maxMin2(intArray6, (int) (byte) 0);
        int[] intArray10 = ds.MaxMin2.maxMin2(intArray6, (int) (byte) 0);
        int[] intArray12 = ds.MaxMin2.maxMin2(intArray10, (int) (short) 0);
        int[] intArray14 = ds.MaxMin2.maxMin2(intArray10, (int) (short) -1);
        int[] intArray16 = ds.MaxMin2.maxMin2(intArray10, (int) (byte) 0);
        int[] intArray18 = ds.MaxMin2.maxMin2(intArray16, (int) (byte) -1);
        int[] intArray20 = ds.MaxMin2.maxMin2(intArray16, (int) (short) 0);
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[-1, 1, 32, 10, 1, 1]");
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray16), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray18), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray20), "[-1, -1]");
    }

    @Test
    public void test869() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test869");
        int[] intArray4 = new int[] { (byte) 0, 10, '#', (short) 0 };
        int[] intArray6 = ds.MaxMin2.maxMin2(intArray4, (int) (short) 1);
        int[] intArray8 = ds.MaxMin2.maxMin2(intArray6, 0);
        int[] intArray10 = ds.MaxMin2.maxMin2(intArray8, 0);
        int[] intArray12 = ds.MaxMin2.maxMin2(intArray8, 0);
        int[] intArray14 = ds.MaxMin2.maxMin2(intArray12, 0);
        int[] intArray16 = ds.MaxMin2.maxMin2(intArray12, 0);
        int[] intArray18 = ds.MaxMin2.maxMin2(intArray16, 1);
        int[] intArray20 = ds.MaxMin2.maxMin2(intArray16, (int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray22 = ds.MaxMin2.maxMin2(intArray16, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[0, 10, 35, 0]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray16), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray18), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray20), "[0, 0]");
    }

    @Test
    public void test870() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test870");
        int[] intArray6 = new int[] { (byte) -1, (byte) 1, ' ', (short) 10, (short) 1, (byte) 1 };
        int[] intArray8 = ds.MaxMin2.maxMin2(intArray6, (int) (byte) 0);
        int[] intArray10 = ds.MaxMin2.maxMin2(intArray6, (int) (byte) 1);
        int[] intArray12 = ds.MaxMin2.maxMin2(intArray10, (int) (byte) 1);
        int[] intArray14 = ds.MaxMin2.maxMin2(intArray10, 0);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray16 = ds.MaxMin2.maxMin2(intArray14, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[-1, 1, 32, 10, 1, 1]");
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[-1, -1]");
    }

    @Test
    public void test871() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test871");
        int[] intArray6 = new int[] { (byte) -1, (byte) 1, ' ', (short) 10, (short) 1, (byte) 1 };
        int[] intArray8 = ds.MaxMin2.maxMin2(intArray6, (int) (byte) 0);
        int[] intArray10 = ds.MaxMin2.maxMin2(intArray6, (int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray12 = ds.MaxMin2.maxMin2(intArray6, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[-1, 1, 32, 10, 1, 1]");
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[-1, -1]");
    }

    @Test
    public void test872() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test872");
        int[] intArray4 = new int[] { (byte) 0, 10, '#', (short) 0 };
        int[] intArray6 = ds.MaxMin2.maxMin2(intArray4, (int) (short) 1);
        int[] intArray8 = ds.MaxMin2.maxMin2(intArray4, (int) (byte) -1);
        int[] intArray10 = ds.MaxMin2.maxMin2(intArray8, (int) (short) 0);
        int[] intArray12 = ds.MaxMin2.maxMin2(intArray8, 0);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray14 = ds.MaxMin2.maxMin2(intArray8, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[0, 10, 35, 0]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[0, 0]");
    }

    @Test
    public void test873() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test873");
        int[] intArray4 = new int[] { (byte) 0, 10, '#', (short) 0 };
        int[] intArray6 = ds.MaxMin2.maxMin2(intArray4, (int) (short) 1);
        int[] intArray8 = ds.MaxMin2.maxMin2(intArray4, (int) (short) 1);
        int[] intArray10 = ds.MaxMin2.maxMin2(intArray8, (int) (short) 1);
        int[] intArray12 = ds.MaxMin2.maxMin2(intArray8, (-1));
        int[] intArray14 = ds.MaxMin2.maxMin2(intArray8, (int) (short) 0);
        int[] intArray16 = ds.MaxMin2.maxMin2(intArray8, (int) (short) -1);
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[0, 10, 35, 0]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray16), "[0, 0]");
    }

    @Test
    public void test874() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test874");
        int[] intArray6 = new int[] { (byte) -1, (byte) 1, ' ', (short) 10, (short) 1, (byte) 1 };
        int[] intArray8 = ds.MaxMin2.maxMin2(intArray6, (int) (byte) 0);
        int[] intArray10 = ds.MaxMin2.maxMin2(intArray6, (int) (short) 1);
        int[] intArray12 = ds.MaxMin2.maxMin2(intArray10, (-1));
        int[] intArray14 = ds.MaxMin2.maxMin2(intArray12, (int) (short) -1);
        int[] intArray16 = ds.MaxMin2.maxMin2(intArray14, (-1));
        int[] intArray18 = ds.MaxMin2.maxMin2(intArray14, 0);
        int[] intArray20 = ds.MaxMin2.maxMin2(intArray14, 1);
        int[] intArray22 = ds.MaxMin2.maxMin2(intArray20, (int) (byte) 1);
        int[] intArray24 = ds.MaxMin2.maxMin2(intArray20, (int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray26 = ds.MaxMin2.maxMin2(intArray24, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[-1, 1, 32, 10, 1, 1]");
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray16), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray18), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray20), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray22), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray24), "[-1, -1]");
    }

    @Test
    public void test875() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test875");
        int[] intArray6 = new int[] { (byte) -1, (byte) 1, ' ', (short) 10, (short) 1, (byte) 1 };
        int[] intArray8 = ds.MaxMin2.maxMin2(intArray6, (int) (byte) 0);
        int[] intArray10 = ds.MaxMin2.maxMin2(intArray8, (int) (short) -1);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray12 = ds.MaxMin2.maxMin2(intArray10, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[-1, 1, 32, 10, 1, 1]");
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[-1, -1]");
    }

    @Test
    public void test876() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test876");
        int[] intArray4 = new int[] { (byte) 0, 10, '#', (short) 0 };
        int[] intArray6 = ds.MaxMin2.maxMin2(intArray4, (int) (short) 1);
        int[] intArray8 = ds.MaxMin2.maxMin2(intArray4, (int) (short) 1);
        int[] intArray10 = ds.MaxMin2.maxMin2(intArray4, (-1));
        java.lang.Class<?> wildcardClass11 = intArray10.getClass();
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[0, 10, 35, 0]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[0, 0]");
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test877() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test877");
        int[] intArray4 = new int[] { (byte) 0, 10, '#', (short) 0 };
        int[] intArray6 = ds.MaxMin2.maxMin2(intArray4, (int) (short) 1);
        int[] intArray8 = ds.MaxMin2.maxMin2(intArray6, 0);
        int[] intArray10 = ds.MaxMin2.maxMin2(intArray8, (int) (byte) -1);
        int[] intArray12 = ds.MaxMin2.maxMin2(intArray10, 0);
        int[] intArray14 = ds.MaxMin2.maxMin2(intArray12, 0);
        int[] intArray16 = ds.MaxMin2.maxMin2(intArray14, (int) (short) 1);
        int[] intArray18 = ds.MaxMin2.maxMin2(intArray14, 0);
        int[] intArray20 = ds.MaxMin2.maxMin2(intArray14, (int) (byte) 0);
        int[] intArray22 = ds.MaxMin2.maxMin2(intArray20, 1);
        java.lang.Class<?> wildcardClass23 = intArray22.getClass();
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[0, 10, 35, 0]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray16), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray18), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray20), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray22), "[0, 0]");
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test878() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test878");
        int[] intArray4 = new int[] { (byte) 0, 10, '#', (short) 0 };
        int[] intArray6 = ds.MaxMin2.maxMin2(intArray4, (int) (short) 1);
        int[] intArray8 = ds.MaxMin2.maxMin2(intArray4, (int) (byte) -1);
        int[] intArray10 = ds.MaxMin2.maxMin2(intArray8, (int) (short) 0);
        int[] intArray12 = ds.MaxMin2.maxMin2(intArray10, (int) (short) 0);
        int[] intArray14 = ds.MaxMin2.maxMin2(intArray10, 0);
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[0, 10, 35, 0]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[0, 0]");
    }

    @Test
    public void test879() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test879");
        int[] intArray4 = new int[] { (byte) 0, 10, '#', (short) 0 };
        int[] intArray6 = ds.MaxMin2.maxMin2(intArray4, (int) (short) 1);
        int[] intArray8 = ds.MaxMin2.maxMin2(intArray6, 0);
        int[] intArray10 = ds.MaxMin2.maxMin2(intArray8, 0);
        int[] intArray12 = ds.MaxMin2.maxMin2(intArray8, 0);
        int[] intArray14 = ds.MaxMin2.maxMin2(intArray12, 0);
        int[] intArray16 = ds.MaxMin2.maxMin2(intArray14, (-1));
        int[] intArray18 = ds.MaxMin2.maxMin2(intArray16, (int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray20 = ds.MaxMin2.maxMin2(intArray18, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[0, 10, 35, 0]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray16), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray18), "[0, 0]");
    }

    @Test
    public void test880() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test880");
        int[] intArray4 = new int[] { (byte) 0, 10, '#', (short) 0 };
        int[] intArray6 = ds.MaxMin2.maxMin2(intArray4, (int) (short) 1);
        int[] intArray8 = ds.MaxMin2.maxMin2(intArray6, 0);
        int[] intArray10 = ds.MaxMin2.maxMin2(intArray8, 0);
        int[] intArray12 = ds.MaxMin2.maxMin2(intArray8, 0);
        int[] intArray14 = ds.MaxMin2.maxMin2(intArray12, 0);
        int[] intArray16 = ds.MaxMin2.maxMin2(intArray12, 0);
        int[] intArray18 = ds.MaxMin2.maxMin2(intArray16, 1);
        int[] intArray20 = ds.MaxMin2.maxMin2(intArray16, (int) (byte) 0);
        int[] intArray22 = ds.MaxMin2.maxMin2(intArray20, 1);
        int[] intArray24 = ds.MaxMin2.maxMin2(intArray22, 0);
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[0, 10, 35, 0]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray16), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray18), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray20), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray22), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray24), "[0, 0]");
    }

    @Test
    public void test881() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test881");
        int[] intArray6 = new int[] { (byte) -1, (byte) 1, ' ', (short) 10, (short) 1, (byte) 1 };
        int[] intArray8 = ds.MaxMin2.maxMin2(intArray6, (int) (byte) 0);
        int[] intArray10 = ds.MaxMin2.maxMin2(intArray6, (int) (short) 1);
        int[] intArray12 = ds.MaxMin2.maxMin2(intArray10, (-1));
        int[] intArray14 = ds.MaxMin2.maxMin2(intArray12, (int) (short) -1);
        int[] intArray16 = ds.MaxMin2.maxMin2(intArray14, (-1));
        int[] intArray18 = ds.MaxMin2.maxMin2(intArray16, (int) (short) 1);
        int[] intArray20 = ds.MaxMin2.maxMin2(intArray16, (int) (byte) 1);
        int[] intArray22 = ds.MaxMin2.maxMin2(intArray16, 0);
        int[] intArray24 = ds.MaxMin2.maxMin2(intArray22, 0);
        java.lang.Class<?> wildcardClass25 = intArray24.getClass();
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[-1, 1, 32, 10, 1, 1]");
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray16), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray18), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray20), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray22), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray24), "[-1, -1]");
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test882() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test882");
        int[] intArray6 = new int[] { (byte) -1, (byte) 1, ' ', (short) 10, (short) 1, (byte) 1 };
        int[] intArray8 = ds.MaxMin2.maxMin2(intArray6, (int) (byte) 0);
        int[] intArray10 = ds.MaxMin2.maxMin2(intArray6, (int) (short) 1);
        int[] intArray12 = ds.MaxMin2.maxMin2(intArray10, (-1));
        int[] intArray14 = ds.MaxMin2.maxMin2(intArray10, (int) (byte) 0);
        int[] intArray16 = ds.MaxMin2.maxMin2(intArray10, 1);
        int[] intArray18 = ds.MaxMin2.maxMin2(intArray16, 0);
        int[] intArray20 = ds.MaxMin2.maxMin2(intArray18, 0);
        int[] intArray22 = ds.MaxMin2.maxMin2(intArray20, 1);
        int[] intArray24 = ds.MaxMin2.maxMin2(intArray20, (int) (short) -1);
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[-1, 1, 32, 10, 1, 1]");
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray16), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray18), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray20), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray22), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray24), "[-1, -1]");
    }

    @Test
    public void test883() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test883");
        int[] intArray6 = new int[] { (byte) -1, (byte) 1, ' ', (short) 10, (short) 1, (byte) 1 };
        int[] intArray8 = ds.MaxMin2.maxMin2(intArray6, (int) (byte) 0);
        int[] intArray10 = ds.MaxMin2.maxMin2(intArray6, (int) (short) 1);
        int[] intArray12 = ds.MaxMin2.maxMin2(intArray10, (-1));
        int[] intArray14 = ds.MaxMin2.maxMin2(intArray12, (int) (short) -1);
        int[] intArray16 = ds.MaxMin2.maxMin2(intArray14, (-1));
        int[] intArray18 = ds.MaxMin2.maxMin2(intArray16, (int) (short) 1);
        int[] intArray20 = ds.MaxMin2.maxMin2(intArray16, (int) (byte) 1);
        int[] intArray22 = ds.MaxMin2.maxMin2(intArray16, 0);
        int[] intArray24 = ds.MaxMin2.maxMin2(intArray22, 0);
        int[] intArray26 = ds.MaxMin2.maxMin2(intArray22, (int) (short) 0);
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[-1, 1, 32, 10, 1, 1]");
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray16), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray18), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray20), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray22), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray24), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray26), "[-1, -1]");
    }

    @Test
    public void test884() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test884");
        int[] intArray4 = new int[] { (byte) 0, 10, '#', (short) 0 };
        int[] intArray6 = ds.MaxMin2.maxMin2(intArray4, (int) (short) 1);
        int[] intArray8 = ds.MaxMin2.maxMin2(intArray4, (int) (short) 1);
        int[] intArray10 = ds.MaxMin2.maxMin2(intArray8, (int) (short) 1);
        int[] intArray12 = ds.MaxMin2.maxMin2(intArray10, (int) (short) 0);
        int[] intArray14 = ds.MaxMin2.maxMin2(intArray10, (int) (byte) -1);
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[0, 10, 35, 0]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[0, 0]");
    }

    @Test
    public void test885() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test885");
        int[] intArray4 = new int[] { (byte) 0, 10, '#', (short) 0 };
        int[] intArray6 = ds.MaxMin2.maxMin2(intArray4, (int) (short) 1);
        int[] intArray8 = ds.MaxMin2.maxMin2(intArray6, 0);
        int[] intArray10 = ds.MaxMin2.maxMin2(intArray8, (int) (byte) -1);
        int[] intArray12 = ds.MaxMin2.maxMin2(intArray10, 0);
        int[] intArray14 = ds.MaxMin2.maxMin2(intArray10, (int) (byte) 1);
        int[] intArray16 = ds.MaxMin2.maxMin2(intArray14, 1);
        int[] intArray18 = ds.MaxMin2.maxMin2(intArray16, (int) (byte) 1);
        int[] intArray20 = ds.MaxMin2.maxMin2(intArray18, (int) (short) 1);
        java.lang.Class<?> wildcardClass21 = intArray18.getClass();
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[0, 10, 35, 0]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray16), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray18), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray20), "[0, 0]");
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test886() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test886");
        int[] intArray4 = new int[] { (byte) 0, 10, '#', (short) 0 };
        int[] intArray6 = ds.MaxMin2.maxMin2(intArray4, (int) (short) 1);
        int[] intArray8 = ds.MaxMin2.maxMin2(intArray4, (int) (short) 1);
        int[] intArray10 = ds.MaxMin2.maxMin2(intArray8, (int) (byte) -1);
        int[] intArray12 = ds.MaxMin2.maxMin2(intArray10, 1);
        int[] intArray14 = ds.MaxMin2.maxMin2(intArray10, 1);
        int[] intArray16 = ds.MaxMin2.maxMin2(intArray10, (int) (short) -1);
        int[] intArray18 = ds.MaxMin2.maxMin2(intArray16, (int) (short) 0);
        int[] intArray20 = ds.MaxMin2.maxMin2(intArray16, (int) (short) 0);
        int[] intArray22 = ds.MaxMin2.maxMin2(intArray20, (int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray24 = ds.MaxMin2.maxMin2(intArray20, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[0, 10, 35, 0]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray16), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray18), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray20), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray22), "[0, 0]");
    }

    @Test
    public void test887() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test887");
        int[] intArray6 = new int[] { (byte) -1, (byte) 1, ' ', (short) 10, (short) 1, (byte) 1 };
        int[] intArray8 = ds.MaxMin2.maxMin2(intArray6, (int) (byte) 0);
        int[] intArray10 = ds.MaxMin2.maxMin2(intArray6, (int) (short) 1);
        int[] intArray12 = ds.MaxMin2.maxMin2(intArray10, (-1));
        int[] intArray14 = ds.MaxMin2.maxMin2(intArray10, (int) (byte) 0);
        int[] intArray16 = ds.MaxMin2.maxMin2(intArray10, 1);
        int[] intArray18 = ds.MaxMin2.maxMin2(intArray16, (int) (byte) 1);
        int[] intArray20 = ds.MaxMin2.maxMin2(intArray16, (int) (byte) 1);
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[-1, 1, 32, 10, 1, 1]");
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray16), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray18), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray20), "[-1, -1]");
    }

    @Test
    public void test888() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test888");
        int[] intArray4 = new int[] { (byte) 0, 10, '#', (short) 0 };
        int[] intArray6 = ds.MaxMin2.maxMin2(intArray4, (int) (short) 1);
        int[] intArray8 = ds.MaxMin2.maxMin2(intArray6, 0);
        int[] intArray10 = ds.MaxMin2.maxMin2(intArray8, (int) (byte) -1);
        int[] intArray12 = ds.MaxMin2.maxMin2(intArray10, 0);
        int[] intArray14 = ds.MaxMin2.maxMin2(intArray10, (int) (byte) 1);
        int[] intArray16 = ds.MaxMin2.maxMin2(intArray14, 1);
        int[] intArray18 = ds.MaxMin2.maxMin2(intArray14, (int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray20 = ds.MaxMin2.maxMin2(intArray18, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[0, 10, 35, 0]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray16), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray18), "[0, 0]");
    }

    @Test
    public void test889() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test889");
        int[] intArray4 = new int[] { (byte) 0, 10, '#', (short) 0 };
        int[] intArray6 = ds.MaxMin2.maxMin2(intArray4, (int) (short) 1);
        int[] intArray8 = ds.MaxMin2.maxMin2(intArray4, (int) (short) 1);
        int[] intArray10 = ds.MaxMin2.maxMin2(intArray8, (int) (byte) -1);
        int[] intArray12 = ds.MaxMin2.maxMin2(intArray10, 0);
        int[] intArray14 = ds.MaxMin2.maxMin2(intArray10, 1);
        int[] intArray16 = ds.MaxMin2.maxMin2(intArray10, (int) (short) 0);
        java.lang.Class<?> wildcardClass17 = intArray10.getClass();
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[0, 10, 35, 0]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray16), "[0, 0]");
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test890() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test890");
        int[] intArray6 = new int[] { (byte) -1, (byte) 1, ' ', (short) 10, (short) 1, (byte) 1 };
        int[] intArray8 = ds.MaxMin2.maxMin2(intArray6, (int) (byte) 0);
        int[] intArray10 = ds.MaxMin2.maxMin2(intArray6, (int) (short) 1);
        int[] intArray12 = ds.MaxMin2.maxMin2(intArray10, (-1));
        int[] intArray14 = ds.MaxMin2.maxMin2(intArray10, (int) (byte) 0);
        int[] intArray16 = ds.MaxMin2.maxMin2(intArray10, 1);
        int[] intArray18 = ds.MaxMin2.maxMin2(intArray16, (int) (byte) -1);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray20 = ds.MaxMin2.maxMin2(intArray18, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[-1, 1, 32, 10, 1, 1]");
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray16), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray18), "[-1, -1]");
    }

    @Test
    public void test891() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test891");
        int[] intArray4 = new int[] { (byte) 0, 10, '#', (short) 0 };
        int[] intArray6 = ds.MaxMin2.maxMin2(intArray4, (int) (short) 1);
        int[] intArray8 = ds.MaxMin2.maxMin2(intArray6, 0);
        int[] intArray10 = ds.MaxMin2.maxMin2(intArray8, 0);
        int[] intArray12 = ds.MaxMin2.maxMin2(intArray8, 0);
        int[] intArray14 = ds.MaxMin2.maxMin2(intArray12, 0);
        int[] intArray16 = ds.MaxMin2.maxMin2(intArray12, 0);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray18 = ds.MaxMin2.maxMin2(intArray16, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[0, 10, 35, 0]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray16), "[0, 0]");
    }

    @Test
    public void test892() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test892");
        int[] intArray4 = new int[] { (byte) 0, 10, '#', (short) 0 };
        int[] intArray6 = ds.MaxMin2.maxMin2(intArray4, (int) (short) 1);
        int[] intArray8 = ds.MaxMin2.maxMin2(intArray6, 0);
        int[] intArray10 = ds.MaxMin2.maxMin2(intArray8, (int) (byte) -1);
        int[] intArray12 = ds.MaxMin2.maxMin2(intArray10, 0);
        int[] intArray14 = ds.MaxMin2.maxMin2(intArray10, (int) (short) 0);
        int[] intArray16 = ds.MaxMin2.maxMin2(intArray10, (int) (byte) 0);
        int[] intArray18 = ds.MaxMin2.maxMin2(intArray16, (int) (byte) 1);
        java.lang.Class<?> wildcardClass19 = intArray18.getClass();
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[0, 10, 35, 0]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray16), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray18), "[0, 0]");
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test893() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test893");
        int[] intArray4 = new int[] { (byte) 0, 10, '#', (short) 0 };
        int[] intArray6 = ds.MaxMin2.maxMin2(intArray4, (int) (short) 1);
        int[] intArray8 = ds.MaxMin2.maxMin2(intArray4, (int) (short) 0);
        int[] intArray10 = ds.MaxMin2.maxMin2(intArray4, (int) (byte) -1);
        int[] intArray12 = ds.MaxMin2.maxMin2(intArray10, (int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray14 = ds.MaxMin2.maxMin2(intArray12, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[0, 10, 35, 0]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[0, 0]");
    }

    @Test
    public void test894() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test894");
        int[] intArray4 = new int[] { (byte) 0, 10, '#', (short) 0 };
        int[] intArray6 = ds.MaxMin2.maxMin2(intArray4, (int) (short) 1);
        int[] intArray8 = ds.MaxMin2.maxMin2(intArray4, (int) (short) 1);
        int[] intArray10 = ds.MaxMin2.maxMin2(intArray8, (int) (byte) -1);
        int[] intArray12 = ds.MaxMin2.maxMin2(intArray10, 0);
        int[] intArray14 = ds.MaxMin2.maxMin2(intArray10, 1);
        java.lang.Class<?> wildcardClass15 = intArray14.getClass();
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[0, 10, 35, 0]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[0, 0]");
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test895() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test895");
        int[] intArray6 = new int[] { (byte) -1, (byte) 1, ' ', (short) 10, (short) 1, (byte) 1 };
        int[] intArray8 = ds.MaxMin2.maxMin2(intArray6, (int) (byte) 0);
        int[] intArray10 = ds.MaxMin2.maxMin2(intArray6, (int) (short) 1);
        int[] intArray12 = ds.MaxMin2.maxMin2(intArray10, (-1));
        int[] intArray14 = ds.MaxMin2.maxMin2(intArray12, (int) (short) -1);
        int[] intArray16 = ds.MaxMin2.maxMin2(intArray14, (-1));
        int[] intArray18 = ds.MaxMin2.maxMin2(intArray16, (int) (short) 0);
        int[] intArray20 = ds.MaxMin2.maxMin2(intArray18, (int) (short) 1);
        java.lang.Class<?> wildcardClass21 = intArray18.getClass();
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[-1, 1, 32, 10, 1, 1]");
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray16), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray18), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray20), "[-1, -1]");
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test896() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test896");
        int[] intArray6 = new int[] { (byte) -1, (byte) 1, ' ', (short) 10, (short) 1, (byte) 1 };
        int[] intArray8 = ds.MaxMin2.maxMin2(intArray6, (int) (byte) 0);
        int[] intArray10 = ds.MaxMin2.maxMin2(intArray6, (int) (short) 1);
        int[] intArray12 = ds.MaxMin2.maxMin2(intArray10, (-1));
        int[] intArray14 = ds.MaxMin2.maxMin2(intArray12, (int) (short) -1);
        int[] intArray16 = ds.MaxMin2.maxMin2(intArray14, (-1));
        int[] intArray18 = ds.MaxMin2.maxMin2(intArray14, 0);
        int[] intArray20 = ds.MaxMin2.maxMin2(intArray14, 1);
        int[] intArray22 = ds.MaxMin2.maxMin2(intArray20, (int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray24 = ds.MaxMin2.maxMin2(intArray20, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[-1, 1, 32, 10, 1, 1]");
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray16), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray18), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray20), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray22), "[-1, -1]");
    }

    @Test
    public void test897() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test897");
        int[] intArray6 = new int[] { (byte) -1, (byte) 1, ' ', (short) 10, (short) 1, (byte) 1 };
        int[] intArray8 = ds.MaxMin2.maxMin2(intArray6, (int) (byte) 0);
        int[] intArray10 = ds.MaxMin2.maxMin2(intArray6, (int) (short) 1);
        int[] intArray12 = ds.MaxMin2.maxMin2(intArray10, (-1));
        int[] intArray14 = ds.MaxMin2.maxMin2(intArray12, (int) (short) -1);
        int[] intArray16 = ds.MaxMin2.maxMin2(intArray14, (int) (byte) 0);
        int[] intArray18 = ds.MaxMin2.maxMin2(intArray14, (int) (byte) 1);
        int[] intArray20 = ds.MaxMin2.maxMin2(intArray18, (int) (byte) 1);
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[-1, 1, 32, 10, 1, 1]");
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray16), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray18), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray20), "[-1, -1]");
    }

    @Test
    public void test898() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test898");
        int[] intArray6 = new int[] { (byte) -1, (byte) 1, ' ', (short) 10, (short) 1, (byte) 1 };
        int[] intArray8 = ds.MaxMin2.maxMin2(intArray6, (int) (byte) 0);
        int[] intArray10 = ds.MaxMin2.maxMin2(intArray6, (int) (byte) 1);
        int[] intArray12 = ds.MaxMin2.maxMin2(intArray10, (int) (byte) 1);
        int[] intArray14 = ds.MaxMin2.maxMin2(intArray10, 0);
        int[] intArray16 = ds.MaxMin2.maxMin2(intArray14, 0);
        java.lang.Class<?> wildcardClass17 = intArray16.getClass();
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[-1, 1, 32, 10, 1, 1]");
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray16), "[-1, -1]");
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test899() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test899");
        int[] intArray6 = new int[] { (byte) -1, (byte) 1, ' ', (short) 10, (short) 1, (byte) 1 };
        int[] intArray8 = ds.MaxMin2.maxMin2(intArray6, (int) (byte) 0);
        int[] intArray10 = ds.MaxMin2.maxMin2(intArray6, (int) (short) 1);
        int[] intArray12 = ds.MaxMin2.maxMin2(intArray10, (-1));
        int[] intArray14 = ds.MaxMin2.maxMin2(intArray12, (int) (short) -1);
        int[] intArray16 = ds.MaxMin2.maxMin2(intArray14, (int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray18 = ds.MaxMin2.maxMin2(intArray14, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[-1, 1, 32, 10, 1, 1]");
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray16), "[-1, -1]");
    }

    @Test
    public void test900() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test900");
        int[] intArray6 = new int[] { (byte) -1, (byte) 1, ' ', (short) 10, (short) 1, (byte) 1 };
        int[] intArray8 = ds.MaxMin2.maxMin2(intArray6, (int) (byte) 0);
        int[] intArray10 = ds.MaxMin2.maxMin2(intArray6, (int) (short) 1);
        int[] intArray12 = ds.MaxMin2.maxMin2(intArray10, (-1));
        int[] intArray14 = ds.MaxMin2.maxMin2(intArray12, (int) (short) 1);
        int[] intArray16 = ds.MaxMin2.maxMin2(intArray14, (-1));
        int[] intArray18 = ds.MaxMin2.maxMin2(intArray16, (int) (byte) 0);
        java.lang.Class<?> wildcardClass19 = intArray18.getClass();
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[-1, 1, 32, 10, 1, 1]");
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray16), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray18), "[-1, -1]");
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test901() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test901");
        int[] intArray4 = new int[] { (byte) 0, 10, '#', (short) 0 };
        int[] intArray6 = ds.MaxMin2.maxMin2(intArray4, (int) (short) 1);
        int[] intArray8 = ds.MaxMin2.maxMin2(intArray6, 0);
        int[] intArray10 = ds.MaxMin2.maxMin2(intArray8, (int) (byte) -1);
        int[] intArray12 = ds.MaxMin2.maxMin2(intArray10, 0);
        int[] intArray14 = ds.MaxMin2.maxMin2(intArray12, (int) (short) 0);
        int[] intArray16 = ds.MaxMin2.maxMin2(intArray14, (int) (short) -1);
        int[] intArray18 = ds.MaxMin2.maxMin2(intArray14, (int) (short) 0);
        int[] intArray20 = ds.MaxMin2.maxMin2(intArray14, 1);
        int[] intArray22 = ds.MaxMin2.maxMin2(intArray20, (int) (short) -1);
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[0, 10, 35, 0]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray16), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray18), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray20), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray22), "[0, 0]");
    }

    @Test
    public void test902() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test902");
        int[] intArray6 = new int[] { (byte) -1, (byte) 1, ' ', (short) 10, (short) 1, (byte) 1 };
        int[] intArray8 = ds.MaxMin2.maxMin2(intArray6, (int) (byte) 0);
        int[] intArray10 = ds.MaxMin2.maxMin2(intArray6, (int) (short) 1);
        int[] intArray12 = ds.MaxMin2.maxMin2(intArray10, (-1));
        int[] intArray14 = ds.MaxMin2.maxMin2(intArray12, (int) (short) -1);
        int[] intArray16 = ds.MaxMin2.maxMin2(intArray14, (-1));
        int[] intArray18 = ds.MaxMin2.maxMin2(intArray16, (int) (short) 1);
        int[] intArray20 = ds.MaxMin2.maxMin2(intArray16, (int) (short) 0);
        int[] intArray22 = ds.MaxMin2.maxMin2(intArray20, (int) (byte) 0);
        int[] intArray24 = ds.MaxMin2.maxMin2(intArray20, 0);
        int[] intArray26 = ds.MaxMin2.maxMin2(intArray20, (-1));
        int[] intArray28 = ds.MaxMin2.maxMin2(intArray26, 1);
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[-1, 1, 32, 10, 1, 1]");
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray16), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray18), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray20), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray22), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray24), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray26), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray28);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray28), "[-1, -1]");
    }

    @Test
    public void test903() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test903");
        int[] intArray6 = new int[] { (byte) -1, (byte) 1, ' ', (short) 10, (short) 1, (byte) 1 };
        int[] intArray8 = ds.MaxMin2.maxMin2(intArray6, (int) (byte) 0);
        int[] intArray10 = ds.MaxMin2.maxMin2(intArray6, (int) (byte) 0);
        int[] intArray12 = ds.MaxMin2.maxMin2(intArray10, (int) (short) 0);
        int[] intArray14 = ds.MaxMin2.maxMin2(intArray12, (int) (short) 1);
        int[] intArray16 = ds.MaxMin2.maxMin2(intArray12, (int) (short) 1);
        int[] intArray18 = ds.MaxMin2.maxMin2(intArray12, (int) (byte) 1);
        int[] intArray20 = ds.MaxMin2.maxMin2(intArray12, (int) (byte) 0);
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[-1, 1, 32, 10, 1, 1]");
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray16), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray18), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray20), "[-1, -1]");
    }

    @Test
    public void test904() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test904");
        int[] intArray6 = new int[] { (byte) -1, (byte) 1, ' ', (short) 10, (short) 1, (byte) 1 };
        int[] intArray8 = ds.MaxMin2.maxMin2(intArray6, (int) (byte) 0);
        int[] intArray10 = ds.MaxMin2.maxMin2(intArray8, (-1));
        int[] intArray12 = ds.MaxMin2.maxMin2(intArray10, (int) (byte) -1);
        int[] intArray14 = ds.MaxMin2.maxMin2(intArray10, 1);
        int[] intArray16 = ds.MaxMin2.maxMin2(intArray10, (int) (short) 1);
        java.lang.Class<?> wildcardClass17 = intArray16.getClass();
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[-1, 1, 32, 10, 1, 1]");
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray16), "[-1, -1]");
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test905() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test905");
        int[] intArray4 = new int[] { (byte) 0, 10, '#', (short) 0 };
        int[] intArray6 = ds.MaxMin2.maxMin2(intArray4, (int) (short) 1);
        int[] intArray8 = ds.MaxMin2.maxMin2(intArray6, 0);
        int[] intArray10 = ds.MaxMin2.maxMin2(intArray8, (int) (byte) -1);
        int[] intArray12 = ds.MaxMin2.maxMin2(intArray10, 0);
        int[] intArray14 = ds.MaxMin2.maxMin2(intArray10, (int) (short) 0);
        int[] intArray16 = ds.MaxMin2.maxMin2(intArray10, (int) (byte) 0);
        java.lang.Class<?> wildcardClass17 = intArray16.getClass();
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[0, 10, 35, 0]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray16), "[0, 0]");
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test906() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test906");
        int[] intArray6 = new int[] { (byte) -1, (byte) 1, ' ', (short) 10, (short) 1, (byte) 1 };
        int[] intArray8 = ds.MaxMin2.maxMin2(intArray6, (int) (byte) 0);
        int[] intArray10 = ds.MaxMin2.maxMin2(intArray6, (int) (byte) 1);
        int[] intArray12 = ds.MaxMin2.maxMin2(intArray6, (int) (byte) -1);
        int[] intArray14 = ds.MaxMin2.maxMin2(intArray6, 0);
        int[] intArray16 = ds.MaxMin2.maxMin2(intArray14, (int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray18 = ds.MaxMin2.maxMin2(intArray14, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[-1, 1, 32, 10, 1, 1]");
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray16), "[-1, -1]");
    }

    @Test
    public void test907() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test907");
        int[] intArray6 = new int[] { (byte) -1, (byte) 1, ' ', (short) 10, (short) 1, (byte) 1 };
        int[] intArray8 = ds.MaxMin2.maxMin2(intArray6, (int) (byte) 0);
        int[] intArray10 = ds.MaxMin2.maxMin2(intArray6, (int) (short) 1);
        int[] intArray12 = ds.MaxMin2.maxMin2(intArray10, (int) (byte) -1);
        java.lang.Class<?> wildcardClass13 = intArray10.getClass();
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[-1, 1, 32, 10, 1, 1]");
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[-1, -1]");
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test908() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test908");
        int[] intArray4 = new int[] { (byte) 0, 10, '#', (short) 0 };
        int[] intArray6 = ds.MaxMin2.maxMin2(intArray4, (int) (short) 1);
        int[] intArray8 = ds.MaxMin2.maxMin2(intArray6, 0);
        int[] intArray10 = ds.MaxMin2.maxMin2(intArray8, 0);
        int[] intArray12 = ds.MaxMin2.maxMin2(intArray8, 0);
        int[] intArray14 = ds.MaxMin2.maxMin2(intArray12, 0);
        int[] intArray16 = ds.MaxMin2.maxMin2(intArray12, (int) (short) -1);
        int[] intArray18 = ds.MaxMin2.maxMin2(intArray12, (int) (short) -1);
        int[] intArray20 = ds.MaxMin2.maxMin2(intArray18, (int) (short) 0);
        java.lang.Class<?> wildcardClass21 = intArray20.getClass();
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[0, 10, 35, 0]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray16), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray18), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray20), "[0, 0]");
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test909() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test909");
        int[] intArray4 = new int[] { (byte) 0, 10, '#', (short) 0 };
        int[] intArray6 = ds.MaxMin2.maxMin2(intArray4, (int) (short) 1);
        int[] intArray8 = ds.MaxMin2.maxMin2(intArray6, 0);
        int[] intArray10 = ds.MaxMin2.maxMin2(intArray8, 0);
        int[] intArray12 = ds.MaxMin2.maxMin2(intArray8, 0);
        int[] intArray14 = ds.MaxMin2.maxMin2(intArray12, (int) (byte) 0);
        int[] intArray16 = ds.MaxMin2.maxMin2(intArray14, (int) (short) 1);
        int[] intArray18 = ds.MaxMin2.maxMin2(intArray14, (int) (short) -1);
        int[] intArray20 = ds.MaxMin2.maxMin2(intArray14, (int) (byte) 1);
        int[] intArray22 = ds.MaxMin2.maxMin2(intArray14, (int) (short) -1);
        int[] intArray24 = ds.MaxMin2.maxMin2(intArray22, 0);
        java.lang.Class<?> wildcardClass25 = intArray24.getClass();
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[0, 10, 35, 0]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray16), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray18), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray20), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray22), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray24), "[0, 0]");
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test910() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test910");
        int[] intArray4 = new int[] { (byte) 0, 10, '#', (short) 0 };
        int[] intArray6 = ds.MaxMin2.maxMin2(intArray4, (int) (short) 1);
        int[] intArray8 = ds.MaxMin2.maxMin2(intArray6, 0);
        int[] intArray10 = ds.MaxMin2.maxMin2(intArray8, 0);
        int[] intArray12 = ds.MaxMin2.maxMin2(intArray8, 0);
        int[] intArray14 = ds.MaxMin2.maxMin2(intArray12, 0);
        int[] intArray16 = ds.MaxMin2.maxMin2(intArray12, 0);
        int[] intArray18 = ds.MaxMin2.maxMin2(intArray16, 1);
        int[] intArray20 = ds.MaxMin2.maxMin2(intArray16, (int) (byte) 0);
        int[] intArray22 = ds.MaxMin2.maxMin2(intArray20, (-1));
        java.lang.Class<?> wildcardClass23 = intArray20.getClass();
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[0, 10, 35, 0]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray16), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray18), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray20), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray22), "[0, 0]");
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test911() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test911");
        int[] intArray6 = new int[] { (byte) -1, (byte) 1, ' ', (short) 10, (short) 1, (byte) 1 };
        int[] intArray8 = ds.MaxMin2.maxMin2(intArray6, (int) (byte) 0);
        int[] intArray10 = ds.MaxMin2.maxMin2(intArray6, (int) (short) 1);
        int[] intArray12 = ds.MaxMin2.maxMin2(intArray10, (-1));
        int[] intArray14 = ds.MaxMin2.maxMin2(intArray12, (int) (short) -1);
        int[] intArray16 = ds.MaxMin2.maxMin2(intArray14, (-1));
        int[] intArray18 = ds.MaxMin2.maxMin2(intArray16, (int) (short) 1);
        int[] intArray20 = ds.MaxMin2.maxMin2(intArray16, (int) (short) 0);
        int[] intArray22 = ds.MaxMin2.maxMin2(intArray20, (-1));
        int[] intArray24 = ds.MaxMin2.maxMin2(intArray22, 0);
        java.lang.Class<?> wildcardClass25 = intArray24.getClass();
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[-1, 1, 32, 10, 1, 1]");
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray16), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray18), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray20), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray22), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray24), "[-1, -1]");
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test912() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test912");
        int[] intArray4 = new int[] { (byte) 0, 10, '#', (short) 0 };
        int[] intArray6 = ds.MaxMin2.maxMin2(intArray4, (int) (short) 1);
        int[] intArray8 = ds.MaxMin2.maxMin2(intArray6, 0);
        int[] intArray10 = ds.MaxMin2.maxMin2(intArray8, 0);
        int[] intArray12 = ds.MaxMin2.maxMin2(intArray8, 0);
        int[] intArray14 = ds.MaxMin2.maxMin2(intArray12, (int) (byte) 0);
        int[] intArray16 = ds.MaxMin2.maxMin2(intArray12, (int) (short) 1);
        int[] intArray18 = ds.MaxMin2.maxMin2(intArray16, (int) (byte) 0);
        int[] intArray20 = ds.MaxMin2.maxMin2(intArray18, (int) (byte) 1);
        int[] intArray22 = ds.MaxMin2.maxMin2(intArray20, (int) (byte) 0);
        int[] intArray24 = ds.MaxMin2.maxMin2(intArray20, (int) (byte) 0);
        java.lang.Class<?> wildcardClass25 = intArray24.getClass();
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[0, 10, 35, 0]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray16), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray18), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray20), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray22), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray24), "[0, 0]");
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test913() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test913");
        int[] intArray6 = new int[] { (byte) -1, (byte) 1, ' ', (short) 10, (short) 1, (byte) 1 };
        int[] intArray8 = ds.MaxMin2.maxMin2(intArray6, (int) (byte) 0);
        int[] intArray10 = ds.MaxMin2.maxMin2(intArray6, (int) (byte) 0);
        int[] intArray12 = ds.MaxMin2.maxMin2(intArray10, (int) (short) -1);
        int[] intArray14 = ds.MaxMin2.maxMin2(intArray10, (int) (byte) -1);
        int[] intArray16 = ds.MaxMin2.maxMin2(intArray10, 0);
        int[] intArray18 = ds.MaxMin2.maxMin2(intArray16, (int) (byte) -1);
        java.lang.Class<?> wildcardClass19 = intArray18.getClass();
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[-1, 1, 32, 10, 1, 1]");
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray16), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray18), "[-1, -1]");
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test914() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test914");
        int[] intArray6 = new int[] { (byte) -1, (byte) 1, ' ', (short) 10, (short) 1, (byte) 1 };
        int[] intArray8 = ds.MaxMin2.maxMin2(intArray6, (int) (byte) 0);
        int[] intArray10 = ds.MaxMin2.maxMin2(intArray6, (int) (short) 1);
        int[] intArray12 = ds.MaxMin2.maxMin2(intArray10, (-1));
        int[] intArray14 = ds.MaxMin2.maxMin2(intArray12, (int) (short) -1);
        int[] intArray16 = ds.MaxMin2.maxMin2(intArray14, (int) (byte) 0);
        int[] intArray18 = ds.MaxMin2.maxMin2(intArray14, (int) (byte) 1);
        java.lang.Class<?> wildcardClass19 = intArray14.getClass();
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[-1, 1, 32, 10, 1, 1]");
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray16), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray18), "[-1, -1]");
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test915() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test915");
        int[] intArray6 = new int[] { (byte) -1, (byte) 1, ' ', (short) 10, (short) 1, (byte) 1 };
        int[] intArray8 = ds.MaxMin2.maxMin2(intArray6, (int) (byte) 0);
        int[] intArray10 = ds.MaxMin2.maxMin2(intArray6, (int) (byte) 1);
        int[] intArray12 = ds.MaxMin2.maxMin2(intArray6, (int) (byte) -1);
        int[] intArray14 = ds.MaxMin2.maxMin2(intArray6, 0);
        int[] intArray16 = ds.MaxMin2.maxMin2(intArray6, (int) (byte) -1);
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[-1, 1, 32, 10, 1, 1]");
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray16), "[-1, -1]");
    }

    @Test
    public void test916() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test916");
        int[] intArray4 = new int[] { (byte) 0, 10, '#', (short) 0 };
        int[] intArray6 = ds.MaxMin2.maxMin2(intArray4, (int) (short) 1);
        int[] intArray8 = ds.MaxMin2.maxMin2(intArray6, 0);
        int[] intArray10 = ds.MaxMin2.maxMin2(intArray8, 0);
        int[] intArray12 = ds.MaxMin2.maxMin2(intArray8, 0);
        int[] intArray14 = ds.MaxMin2.maxMin2(intArray12, 0);
        int[] intArray16 = ds.MaxMin2.maxMin2(intArray14, (-1));
        int[] intArray18 = ds.MaxMin2.maxMin2(intArray16, (int) (byte) 1);
        int[] intArray20 = ds.MaxMin2.maxMin2(intArray16, (int) (byte) 0);
        int[] intArray22 = ds.MaxMin2.maxMin2(intArray16, (int) (short) -1);
        java.lang.Class<?> wildcardClass23 = intArray22.getClass();
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[0, 10, 35, 0]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray16), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray18), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray20), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray22), "[0, 0]");
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test917() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test917");
        int[] intArray4 = new int[] { (byte) 0, 10, '#', (short) 0 };
        int[] intArray6 = ds.MaxMin2.maxMin2(intArray4, (int) (short) 1);
        int[] intArray8 = ds.MaxMin2.maxMin2(intArray4, (int) (byte) -1);
        int[] intArray10 = ds.MaxMin2.maxMin2(intArray8, (int) (short) 0);
        int[] intArray12 = ds.MaxMin2.maxMin2(intArray10, (int) (short) 0);
        int[] intArray14 = ds.MaxMin2.maxMin2(intArray10, (int) (byte) 1);
        java.lang.Class<?> wildcardClass15 = intArray14.getClass();
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[0, 10, 35, 0]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[0, 0]");
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test918() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test918");
        int[] intArray6 = new int[] { (byte) -1, (byte) 1, ' ', (short) 10, (short) 1, (byte) 1 };
        int[] intArray8 = ds.MaxMin2.maxMin2(intArray6, (int) (byte) 0);
        int[] intArray10 = ds.MaxMin2.maxMin2(intArray6, (int) (byte) 0);
        int[] intArray12 = ds.MaxMin2.maxMin2(intArray10, (int) (short) -1);
        int[] intArray14 = ds.MaxMin2.maxMin2(intArray10, (int) (byte) -1);
        int[] intArray16 = ds.MaxMin2.maxMin2(intArray14, (int) (short) -1);
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[-1, 1, 32, 10, 1, 1]");
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray16), "[-1, -1]");
    }

    @Test
    public void test919() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test919");
        int[] intArray4 = new int[] { (byte) 0, 10, '#', (short) 0 };
        int[] intArray6 = ds.MaxMin2.maxMin2(intArray4, (int) (short) 1);
        int[] intArray8 = ds.MaxMin2.maxMin2(intArray6, 0);
        int[] intArray10 = ds.MaxMin2.maxMin2(intArray8, (int) (byte) -1);
        int[] intArray12 = ds.MaxMin2.maxMin2(intArray10, 0);
        int[] intArray14 = ds.MaxMin2.maxMin2(intArray12, 0);
        int[] intArray16 = ds.MaxMin2.maxMin2(intArray14, (int) (short) 1);
        int[] intArray18 = ds.MaxMin2.maxMin2(intArray16, (int) (short) -1);
        java.lang.Class<?> wildcardClass19 = intArray16.getClass();
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[0, 10, 35, 0]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray16), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray18), "[0, 0]");
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test920() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test920");
        int[] intArray6 = new int[] { (byte) -1, (byte) 1, ' ', (short) 10, (short) 1, (byte) 1 };
        int[] intArray8 = ds.MaxMin2.maxMin2(intArray6, (int) (byte) 0);
        int[] intArray10 = ds.MaxMin2.maxMin2(intArray6, (int) (byte) 1);
        int[] intArray12 = ds.MaxMin2.maxMin2(intArray6, (int) (short) 0);
        int[] intArray14 = ds.MaxMin2.maxMin2(intArray12, (int) (short) 0);
        int[] intArray16 = ds.MaxMin2.maxMin2(intArray14, 0);
        int[] intArray18 = ds.MaxMin2.maxMin2(intArray16, 0);
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[-1, 1, 32, 10, 1, 1]");
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray16), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray18), "[-1, -1]");
    }

    @Test
    public void test921() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test921");
        int[] intArray6 = new int[] { (byte) -1, (byte) 1, ' ', (short) 10, (short) 1, (byte) 1 };
        int[] intArray8 = ds.MaxMin2.maxMin2(intArray6, (int) (byte) 0);
        int[] intArray10 = ds.MaxMin2.maxMin2(intArray6, (int) (short) 1);
        int[] intArray12 = ds.MaxMin2.maxMin2(intArray10, (-1));
        int[] intArray14 = ds.MaxMin2.maxMin2(intArray12, (int) (byte) -1);
        int[] intArray16 = ds.MaxMin2.maxMin2(intArray14, (int) (short) 1);
        int[] intArray18 = ds.MaxMin2.maxMin2(intArray16, 0);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray20 = ds.MaxMin2.maxMin2(intArray16, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[-1, 1, 32, 10, 1, 1]");
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray16), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray18), "[-1, -1]");
    }

    @Test
    public void test922() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test922");
        int[] intArray6 = new int[] { (byte) -1, (byte) 1, ' ', (short) 10, (short) 1, (byte) 1 };
        int[] intArray8 = ds.MaxMin2.maxMin2(intArray6, (int) (byte) 0);
        int[] intArray10 = ds.MaxMin2.maxMin2(intArray6, (int) (short) 1);
        int[] intArray12 = ds.MaxMin2.maxMin2(intArray10, (-1));
        int[] intArray14 = ds.MaxMin2.maxMin2(intArray10, (int) (byte) 0);
        int[] intArray16 = ds.MaxMin2.maxMin2(intArray10, 1);
        int[] intArray18 = ds.MaxMin2.maxMin2(intArray16, 0);
        int[] intArray20 = ds.MaxMin2.maxMin2(intArray18, 0);
        int[] intArray22 = ds.MaxMin2.maxMin2(intArray20, 1);
        java.lang.Class<?> wildcardClass23 = intArray20.getClass();
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[-1, 1, 32, 10, 1, 1]");
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray16), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray18), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray20), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray22), "[-1, -1]");
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test923() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test923");
        int[] intArray4 = new int[] { (byte) 0, 10, '#', (short) 0 };
        int[] intArray6 = ds.MaxMin2.maxMin2(intArray4, (int) (short) 1);
        int[] intArray8 = ds.MaxMin2.maxMin2(intArray6, 0);
        int[] intArray10 = ds.MaxMin2.maxMin2(intArray8, 0);
        int[] intArray12 = ds.MaxMin2.maxMin2(intArray8, 0);
        int[] intArray14 = ds.MaxMin2.maxMin2(intArray12, 0);
        int[] intArray16 = ds.MaxMin2.maxMin2(intArray12, 0);
        int[] intArray18 = ds.MaxMin2.maxMin2(intArray16, 1);
        int[] intArray20 = ds.MaxMin2.maxMin2(intArray16, (int) (byte) 0);
        int[] intArray22 = ds.MaxMin2.maxMin2(intArray20, (-1));
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray24 = ds.MaxMin2.maxMin2(intArray20, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[0, 10, 35, 0]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray16), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray18), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray20), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray22), "[0, 0]");
    }

    @Test
    public void test924() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test924");
        int[] intArray6 = new int[] { (byte) -1, (byte) 1, ' ', (short) 10, (short) 1, (byte) 1 };
        int[] intArray8 = ds.MaxMin2.maxMin2(intArray6, (int) (byte) 0);
        int[] intArray10 = ds.MaxMin2.maxMin2(intArray6, (int) (byte) 0);
        int[] intArray12 = ds.MaxMin2.maxMin2(intArray10, (int) (short) -1);
        int[] intArray14 = ds.MaxMin2.maxMin2(intArray10, (int) (byte) -1);
        int[] intArray16 = ds.MaxMin2.maxMin2(intArray10, (int) (byte) -1);
        int[] intArray18 = ds.MaxMin2.maxMin2(intArray10, (int) (short) -1);
        java.lang.Class<?> wildcardClass19 = intArray18.getClass();
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[-1, 1, 32, 10, 1, 1]");
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray16), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray18), "[-1, -1]");
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test925() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test925");
        int[] intArray4 = new int[] { (byte) 0, 10, '#', (short) 0 };
        int[] intArray6 = ds.MaxMin2.maxMin2(intArray4, (int) (short) 1);
        int[] intArray8 = ds.MaxMin2.maxMin2(intArray6, 0);
        int[] intArray10 = ds.MaxMin2.maxMin2(intArray8, 0);
        int[] intArray12 = ds.MaxMin2.maxMin2(intArray8, 0);
        int[] intArray14 = ds.MaxMin2.maxMin2(intArray12, 0);
        int[] intArray16 = ds.MaxMin2.maxMin2(intArray12, (int) (short) -1);
        int[] intArray18 = ds.MaxMin2.maxMin2(intArray12, (int) (byte) 1);
        int[] intArray20 = ds.MaxMin2.maxMin2(intArray12, (int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray22 = ds.MaxMin2.maxMin2(intArray12, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[0, 10, 35, 0]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray16), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray18), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray20), "[0, 0]");
    }

    @Test
    public void test926() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test926");
        int[] intArray6 = new int[] { (byte) -1, (byte) 1, ' ', (short) 10, (short) 1, (byte) 1 };
        int[] intArray8 = ds.MaxMin2.maxMin2(intArray6, (int) (byte) 0);
        int[] intArray10 = ds.MaxMin2.maxMin2(intArray6, (int) (short) 1);
        int[] intArray12 = ds.MaxMin2.maxMin2(intArray10, (-1));
        int[] intArray14 = ds.MaxMin2.maxMin2(intArray12, (int) (byte) -1);
        int[] intArray16 = ds.MaxMin2.maxMin2(intArray12, (int) (byte) -1);
        java.lang.Class<?> wildcardClass17 = intArray12.getClass();
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[-1, 1, 32, 10, 1, 1]");
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray16), "[-1, -1]");
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test927() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test927");
        int[] intArray4 = new int[] { (byte) 0, 10, '#', (short) 0 };
        int[] intArray6 = ds.MaxMin2.maxMin2(intArray4, (int) (short) 1);
        int[] intArray8 = ds.MaxMin2.maxMin2(intArray4, (int) (short) 0);
        int[] intArray10 = ds.MaxMin2.maxMin2(intArray8, 0);
        int[] intArray12 = ds.MaxMin2.maxMin2(intArray8, 0);
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[0, 10, 35, 0]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[0, 0]");
    }

    @Test
    public void test928() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test928");
        int[] intArray4 = new int[] { (byte) 0, 10, '#', (short) 0 };
        int[] intArray6 = ds.MaxMin2.maxMin2(intArray4, (int) (short) 1);
        int[] intArray8 = ds.MaxMin2.maxMin2(intArray6, 0);
        int[] intArray10 = ds.MaxMin2.maxMin2(intArray8, (int) (byte) -1);
        int[] intArray12 = ds.MaxMin2.maxMin2(intArray10, 0);
        int[] intArray14 = ds.MaxMin2.maxMin2(intArray12, (int) (short) 0);
        int[] intArray16 = ds.MaxMin2.maxMin2(intArray14, (int) (short) 0);
        int[] intArray18 = ds.MaxMin2.maxMin2(intArray16, (int) (byte) -1);
        int[] intArray20 = ds.MaxMin2.maxMin2(intArray16, (-1));
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[0, 10, 35, 0]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray16), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray18), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray20), "[0, 0]");
    }

    @Test
    public void test929() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test929");
        int[] intArray4 = new int[] { (byte) 0, 10, '#', (short) 0 };
        int[] intArray6 = ds.MaxMin2.maxMin2(intArray4, (int) (short) 1);
        int[] intArray8 = ds.MaxMin2.maxMin2(intArray4, (int) (short) 1);
        int[] intArray10 = ds.MaxMin2.maxMin2(intArray8, (int) (byte) -1);
        int[] intArray12 = ds.MaxMin2.maxMin2(intArray10, 1);
        int[] intArray14 = ds.MaxMin2.maxMin2(intArray12, 1);
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[0, 10, 35, 0]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[0, 0]");
    }

    @Test
    public void test930() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test930");
        int[] intArray6 = new int[] { (byte) -1, (byte) 1, ' ', (short) 10, (short) 1, (byte) 1 };
        int[] intArray8 = ds.MaxMin2.maxMin2(intArray6, (int) (byte) 0);
        int[] intArray10 = ds.MaxMin2.maxMin2(intArray6, (int) (short) 1);
        int[] intArray12 = ds.MaxMin2.maxMin2(intArray10, (-1));
        int[] intArray14 = ds.MaxMin2.maxMin2(intArray12, (int) (short) -1);
        int[] intArray16 = ds.MaxMin2.maxMin2(intArray14, (-1));
        int[] intArray18 = ds.MaxMin2.maxMin2(intArray14, 0);
        int[] intArray20 = ds.MaxMin2.maxMin2(intArray14, 0);
        int[] intArray22 = ds.MaxMin2.maxMin2(intArray20, 1);
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[-1, 1, 32, 10, 1, 1]");
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray16), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray18), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray20), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray22), "[-1, -1]");
    }

    @Test
    public void test931() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test931");
        int[] intArray4 = new int[] { (byte) 0, 10, '#', (short) 0 };
        int[] intArray6 = ds.MaxMin2.maxMin2(intArray4, (int) (short) 1);
        int[] intArray8 = ds.MaxMin2.maxMin2(intArray6, 0);
        int[] intArray10 = ds.MaxMin2.maxMin2(intArray8, 0);
        int[] intArray12 = ds.MaxMin2.maxMin2(intArray8, 0);
        int[] intArray14 = ds.MaxMin2.maxMin2(intArray12, 0);
        int[] intArray16 = ds.MaxMin2.maxMin2(intArray12, (int) (short) -1);
        int[] intArray18 = ds.MaxMin2.maxMin2(intArray16, (int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray20 = ds.MaxMin2.maxMin2(intArray18, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[0, 10, 35, 0]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray16), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray18), "[0, 0]");
    }

    @Test
    public void test932() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test932");
        int[] intArray4 = new int[] { (byte) 0, 10, '#', (short) 0 };
        int[] intArray6 = ds.MaxMin2.maxMin2(intArray4, (int) (short) 1);
        int[] intArray8 = ds.MaxMin2.maxMin2(intArray4, (int) (short) 0);
        int[] intArray10 = ds.MaxMin2.maxMin2(intArray8, (int) (byte) 1);
        int[] intArray12 = ds.MaxMin2.maxMin2(intArray10, 0);
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[0, 10, 35, 0]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[0, 0]");
    }

    @Test
    public void test933() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test933");
        int[] intArray4 = new int[] { (byte) 0, 10, '#', (short) 0 };
        int[] intArray6 = ds.MaxMin2.maxMin2(intArray4, (int) (short) 1);
        int[] intArray8 = ds.MaxMin2.maxMin2(intArray4, (int) (short) 0);
        int[] intArray10 = ds.MaxMin2.maxMin2(intArray4, (int) (byte) -1);
        int[] intArray12 = ds.MaxMin2.maxMin2(intArray10, (int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray14 = ds.MaxMin2.maxMin2(intArray12, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[0, 10, 35, 0]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[0, 0]");
    }

    @Test
    public void test934() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test934");
        int[] intArray4 = new int[] { (byte) 0, 10, '#', (short) 0 };
        int[] intArray6 = ds.MaxMin2.maxMin2(intArray4, (int) (short) 1);
        int[] intArray8 = ds.MaxMin2.maxMin2(intArray6, 0);
        int[] intArray10 = ds.MaxMin2.maxMin2(intArray8, (int) (byte) -1);
        int[] intArray12 = ds.MaxMin2.maxMin2(intArray10, 0);
        int[] intArray14 = ds.MaxMin2.maxMin2(intArray10, (int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray16 = ds.MaxMin2.maxMin2(intArray10, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[0, 10, 35, 0]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[0, 0]");
    }
}

