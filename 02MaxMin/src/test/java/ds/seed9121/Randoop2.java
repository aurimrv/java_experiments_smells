package ds.seed9121;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class Randoop2 {

    public static boolean debug = false;

    @Test
    public void test1001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1001");
        int[] intArray6 = new int[] { (byte) -1, (byte) 1, ' ', (short) 10, (short) 1, (byte) 1 };
        int[] intArray8 = ds.MaxMin1.maxMin1(intArray6, (int) (byte) 0);
        int[] intArray10 = ds.MaxMin1.maxMin1(intArray6, (int) (short) 1);
        int[] intArray12 = ds.MaxMin1.maxMin1(intArray10, 0);
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
    public void test1002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1002");
        int[] intArray4 = new int[] { (byte) 0, 10, '#', (short) 0 };
        int[] intArray6 = ds.MaxMin1.maxMin1(intArray4, (int) (short) 1);
        int[] intArray8 = ds.MaxMin1.maxMin1(intArray6, 0);
        int[] intArray10 = ds.MaxMin1.maxMin1(intArray8, (int) (byte) -1);
        int[] intArray12 = ds.MaxMin1.maxMin1(intArray10, 0);
        int[] intArray14 = ds.MaxMin1.maxMin1(intArray12, 0);
        int[] intArray16 = ds.MaxMin1.maxMin1(intArray14, (int) (short) 1);
        int[] intArray18 = ds.MaxMin1.maxMin1(intArray16, (int) (short) -1);
        int[] intArray20 = ds.MaxMin1.maxMin1(intArray18, (int) (short) 1);
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
    public void test1003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1003");
        int[] intArray6 = new int[] { (byte) -1, (byte) 1, ' ', (short) 10, (short) 1, (byte) 1 };
        int[] intArray8 = ds.MaxMin1.maxMin1(intArray6, (int) (byte) 0);
        int[] intArray10 = ds.MaxMin1.maxMin1(intArray6, (int) (short) 1);
        int[] intArray12 = ds.MaxMin1.maxMin1(intArray10, (-1));
        int[] intArray14 = ds.MaxMin1.maxMin1(intArray12, (int) (short) -1);
        int[] intArray16 = ds.MaxMin1.maxMin1(intArray14, (-1));
        int[] intArray18 = ds.MaxMin1.maxMin1(intArray16, 1);
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
    public void test1004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1004");
        int[] intArray4 = new int[] { (byte) 0, 10, '#', (short) 0 };
        int[] intArray6 = ds.MaxMin1.maxMin1(intArray4, (int) (short) 1);
        int[] intArray8 = ds.MaxMin1.maxMin1(intArray6, 0);
        int[] intArray10 = ds.MaxMin1.maxMin1(intArray8, 0);
        int[] intArray12 = ds.MaxMin1.maxMin1(intArray8, 0);
        int[] intArray14 = ds.MaxMin1.maxMin1(intArray12, 0);
        int[] intArray16 = ds.MaxMin1.maxMin1(intArray12, 0);
        int[] intArray18 = ds.MaxMin1.maxMin1(intArray16, (int) (short) 1);
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
    public void test1005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1005");
        int[] intArray6 = new int[] { (byte) -1, (byte) 1, ' ', (short) 10, (short) 1, (byte) 1 };
        int[] intArray8 = ds.MaxMin1.maxMin1(intArray6, (int) (byte) 0);
        int[] intArray10 = ds.MaxMin1.maxMin1(intArray8, (-1));
        int[] intArray12 = ds.MaxMin1.maxMin1(intArray8, (int) (short) 1);
        int[] intArray14 = ds.MaxMin1.maxMin1(intArray12, (-1));
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
    public void test1006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1006");
        int[] intArray6 = new int[] { (byte) -1, (byte) 1, ' ', (short) 10, (short) 1, (byte) 1 };
        int[] intArray8 = ds.MaxMin1.maxMin1(intArray6, (int) (byte) 0);
        int[] intArray10 = ds.MaxMin1.maxMin1(intArray6, (int) (short) 1);
        int[] intArray12 = ds.MaxMin1.maxMin1(intArray10, (-1));
        int[] intArray14 = ds.MaxMin1.maxMin1(intArray12, (int) (short) -1);
        int[] intArray16 = ds.MaxMin1.maxMin1(intArray14, (-1));
        int[] intArray18 = ds.MaxMin1.maxMin1(intArray14, 0);
        int[] intArray20 = ds.MaxMin1.maxMin1(intArray14, 1);
        int[] intArray22 = ds.MaxMin1.maxMin1(intArray20, (-1));
        int[] intArray24 = ds.MaxMin1.maxMin1(intArray22, (int) (short) 0);
        int[] intArray26 = ds.MaxMin1.maxMin1(intArray24, (int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray28 = ds.MaxMin1.maxMin1(intArray26, (int) (byte) 100);
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
        org.junit.Assert.assertNotNull(intArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray26), "[-1, -1]");
    }

    @Test
    public void test1007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1007");
        int[] intArray6 = new int[] { (byte) -1, (byte) 1, ' ', (short) 10, (short) 1, (byte) 1 };
        int[] intArray8 = ds.MaxMin1.maxMin1(intArray6, (int) (byte) 0);
        int[] intArray10 = ds.MaxMin1.maxMin1(intArray6, (int) (short) 1);
        int[] intArray12 = ds.MaxMin1.maxMin1(intArray10, (-1));
        int[] intArray14 = ds.MaxMin1.maxMin1(intArray12, (int) (short) -1);
        int[] intArray16 = ds.MaxMin1.maxMin1(intArray14, (-1));
        int[] intArray18 = ds.MaxMin1.maxMin1(intArray14, 0);
        int[] intArray20 = ds.MaxMin1.maxMin1(intArray14, 1);
        int[] intArray22 = ds.MaxMin1.maxMin1(intArray20, (-1));
        int[] intArray24 = ds.MaxMin1.maxMin1(intArray22, (int) (short) 0);
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
    public void test1008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1008");
        int[] intArray4 = new int[] { (byte) 0, 10, '#', (short) 0 };
        int[] intArray6 = ds.MaxMin1.maxMin1(intArray4, (int) (short) 1);
        int[] intArray8 = ds.MaxMin1.maxMin1(intArray6, 0);
        int[] intArray10 = ds.MaxMin1.maxMin1(intArray8, 0);
        int[] intArray12 = ds.MaxMin1.maxMin1(intArray8, 0);
        int[] intArray14 = ds.MaxMin1.maxMin1(intArray12, 0);
        int[] intArray16 = ds.MaxMin1.maxMin1(intArray12, 0);
        int[] intArray18 = ds.MaxMin1.maxMin1(intArray16, 1);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray20 = ds.MaxMin1.maxMin1(intArray16, (int) 'a');
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
    public void test1009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1009");
        int[] intArray6 = new int[] { (byte) -1, (byte) 1, ' ', (short) 10, (short) 1, (byte) 1 };
        int[] intArray8 = ds.MaxMin1.maxMin1(intArray6, (int) (byte) 0);
        int[] intArray10 = ds.MaxMin1.maxMin1(intArray6, (int) (short) 1);
        int[] intArray12 = ds.MaxMin1.maxMin1(intArray10, (-1));
        int[] intArray14 = ds.MaxMin1.maxMin1(intArray12, (int) (short) -1);
        int[] intArray16 = ds.MaxMin1.maxMin1(intArray14, (int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray18 = ds.MaxMin1.maxMin1(intArray16, (int) '#');
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
    public void test1010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1010");
        int[] intArray4 = new int[] { (byte) 0, 10, '#', (short) 0 };
        int[] intArray6 = ds.MaxMin1.maxMin1(intArray4, (int) (short) 1);
        int[] intArray8 = ds.MaxMin1.maxMin1(intArray6, 0);
        int[] intArray10 = ds.MaxMin1.maxMin1(intArray8, 0);
        int[] intArray12 = ds.MaxMin1.maxMin1(intArray8, 0);
        int[] intArray14 = ds.MaxMin1.maxMin1(intArray12, (int) (byte) 0);
        int[] intArray16 = ds.MaxMin1.maxMin1(intArray14, (int) (short) 1);
        int[] intArray18 = ds.MaxMin1.maxMin1(intArray14, (int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray20 = ds.MaxMin1.maxMin1(intArray14, (int) (byte) 10);
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
    public void test1011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1011");
        int[] intArray4 = new int[] { (byte) 0, 10, '#', (short) 0 };
        int[] intArray6 = ds.MaxMin1.maxMin1(intArray4, (int) (short) 1);
        int[] intArray8 = ds.MaxMin1.maxMin1(intArray4, (int) (short) 1);
        int[] intArray10 = ds.MaxMin1.maxMin1(intArray8, (int) (byte) -1);
        int[] intArray12 = ds.MaxMin1.maxMin1(intArray10, 0);
        int[] intArray14 = ds.MaxMin1.maxMin1(intArray10, 1);
        int[] intArray16 = ds.MaxMin1.maxMin1(intArray10, (int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray18 = ds.MaxMin1.maxMin1(intArray10, (int) (short) 100);
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
    public void test1012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1012");
        int[] intArray4 = new int[] { (byte) 0, 10, '#', (short) 0 };
        int[] intArray6 = ds.MaxMin1.maxMin1(intArray4, (int) (short) 1);
        int[] intArray8 = ds.MaxMin1.maxMin1(intArray6, 0);
        int[] intArray10 = ds.MaxMin1.maxMin1(intArray8, 0);
        int[] intArray12 = ds.MaxMin1.maxMin1(intArray8, 0);
        int[] intArray14 = ds.MaxMin1.maxMin1(intArray12, 0);
        int[] intArray16 = ds.MaxMin1.maxMin1(intArray12, 0);
        int[] intArray18 = ds.MaxMin1.maxMin1(intArray16, 1);
        int[] intArray20 = ds.MaxMin1.maxMin1(intArray16, (int) (byte) 0);
        int[] intArray22 = ds.MaxMin1.maxMin1(intArray20, 1);
        int[] intArray24 = ds.MaxMin1.maxMin1(intArray22, 0);
        int[] intArray26 = ds.MaxMin1.maxMin1(intArray24, 0);
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
    public void test1013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1013");
        int[] intArray4 = new int[] { (byte) 0, 10, '#', (short) 0 };
        int[] intArray6 = ds.MaxMin1.maxMin1(intArray4, (int) (short) 1);
        int[] intArray8 = ds.MaxMin1.maxMin1(intArray6, 0);
        int[] intArray10 = ds.MaxMin1.maxMin1(intArray8, (int) (byte) -1);
        int[] intArray12 = ds.MaxMin1.maxMin1(intArray10, 0);
        int[] intArray14 = ds.MaxMin1.maxMin1(intArray10, (int) (short) 0);
        int[] intArray16 = ds.MaxMin1.maxMin1(intArray14, 1);
        int[] intArray18 = ds.MaxMin1.maxMin1(intArray16, (int) (short) -1);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray20 = ds.MaxMin1.maxMin1(intArray18, (int) 'a');
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
    public void test1014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1014");
        int[] intArray4 = new int[] { (byte) 0, 10, '#', (short) 0 };
        int[] intArray6 = ds.MaxMin1.maxMin1(intArray4, (int) (short) 1);
        int[] intArray8 = ds.MaxMin1.maxMin1(intArray4, (int) (short) 1);
        int[] intArray10 = ds.MaxMin1.maxMin1(intArray8, (int) (byte) -1);
        int[] intArray12 = ds.MaxMin1.maxMin1(intArray10, (int) (short) 0);
        int[] intArray14 = ds.MaxMin1.maxMin1(intArray10, (int) (byte) 0);
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
    public void test1015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1015");
        int[] intArray4 = new int[] { (byte) 0, 10, '#', (short) 0 };
        int[] intArray6 = ds.MaxMin1.maxMin1(intArray4, (int) (short) 1);
        int[] intArray8 = ds.MaxMin1.maxMin1(intArray4, (int) (byte) -1);
        int[] intArray10 = ds.MaxMin1.maxMin1(intArray8, (int) (short) 0);
        int[] intArray12 = ds.MaxMin1.maxMin1(intArray8, (int) (short) -1);
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
    public void test1016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1016");
        int[] intArray4 = new int[] { (byte) 0, 10, '#', (short) 0 };
        int[] intArray6 = ds.MaxMin1.maxMin1(intArray4, (int) (short) 1);
        int[] intArray8 = ds.MaxMin1.maxMin1(intArray4, (int) (short) 1);
        int[] intArray10 = ds.MaxMin1.maxMin1(intArray8, (int) (byte) -1);
        int[] intArray12 = ds.MaxMin1.maxMin1(intArray10, 1);
        int[] intArray14 = ds.MaxMin1.maxMin1(intArray10, 1);
        int[] intArray16 = ds.MaxMin1.maxMin1(intArray10, (-1));
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray18 = ds.MaxMin1.maxMin1(intArray10, 10);
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
    public void test1017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1017");
        int[] intArray6 = new int[] { (byte) -1, (byte) 1, ' ', (short) 10, (short) 1, (byte) 1 };
        int[] intArray8 = ds.MaxMin1.maxMin1(intArray6, (int) (byte) 0);
        int[] intArray10 = ds.MaxMin1.maxMin1(intArray6, (int) (byte) 0);
        int[] intArray12 = ds.MaxMin1.maxMin1(intArray10, (int) (short) 0);
        int[] intArray14 = ds.MaxMin1.maxMin1(intArray12, (int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray16 = ds.MaxMin1.maxMin1(intArray14, (int) (byte) 100);
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
    public void test1018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1018");
        int[] intArray6 = new int[] { (byte) -1, (byte) 1, ' ', (short) 10, (short) 1, (byte) 1 };
        int[] intArray8 = ds.MaxMin1.maxMin1(intArray6, (int) (byte) 0);
        int[] intArray10 = ds.MaxMin1.maxMin1(intArray6, (int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray12 = ds.MaxMin1.maxMin1(intArray10, 100);
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
    public void test1019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1019");
        int[] intArray4 = new int[] { (byte) 0, 10, '#', (short) 0 };
        int[] intArray6 = ds.MaxMin1.maxMin1(intArray4, (int) (short) 1);
        int[] intArray8 = ds.MaxMin1.maxMin1(intArray6, 0);
        int[] intArray10 = ds.MaxMin1.maxMin1(intArray8, 0);
        int[] intArray12 = ds.MaxMin1.maxMin1(intArray8, 0);
        int[] intArray14 = ds.MaxMin1.maxMin1(intArray12, (int) (byte) 0);
        int[] intArray16 = ds.MaxMin1.maxMin1(intArray12, (int) (short) 1);
        int[] intArray18 = ds.MaxMin1.maxMin1(intArray16, (int) (byte) 0);
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
    public void test1020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1020");
        int[] intArray4 = new int[] { (byte) 0, 10, '#', (short) 0 };
        int[] intArray6 = ds.MaxMin1.maxMin1(intArray4, (int) (short) 1);
        int[] intArray8 = ds.MaxMin1.maxMin1(intArray6, 0);
        int[] intArray10 = ds.MaxMin1.maxMin1(intArray8, (int) (byte) -1);
        int[] intArray12 = ds.MaxMin1.maxMin1(intArray10, 0);
        int[] intArray14 = ds.MaxMin1.maxMin1(intArray12, (int) (short) 0);
        int[] intArray16 = ds.MaxMin1.maxMin1(intArray14, (int) (short) 0);
        int[] intArray18 = ds.MaxMin1.maxMin1(intArray16, (int) (byte) -1);
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
    public void test1021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1021");
        int[] intArray6 = new int[] { (byte) -1, (byte) 1, ' ', (short) 10, (short) 1, (byte) 1 };
        int[] intArray8 = ds.MaxMin1.maxMin1(intArray6, (int) (byte) 0);
        int[] intArray10 = ds.MaxMin1.maxMin1(intArray6, (int) (short) 1);
        int[] intArray12 = ds.MaxMin1.maxMin1(intArray10, (-1));
        int[] intArray14 = ds.MaxMin1.maxMin1(intArray12, (int) (short) -1);
        int[] intArray16 = ds.MaxMin1.maxMin1(intArray14, (-1));
        int[] intArray18 = ds.MaxMin1.maxMin1(intArray14, 0);
        int[] intArray20 = ds.MaxMin1.maxMin1(intArray14, 0);
        int[] intArray22 = ds.MaxMin1.maxMin1(intArray20, 1);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray24 = ds.MaxMin1.maxMin1(intArray20, (int) (byte) 10);
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
    public void test1022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1022");
        int[] intArray6 = new int[] { (byte) -1, (byte) 1, ' ', (short) 10, (short) 1, (byte) 1 };
        int[] intArray8 = ds.MaxMin1.maxMin1(intArray6, (int) (byte) 0);
        int[] intArray10 = ds.MaxMin1.maxMin1(intArray6, (int) (short) 1);
        int[] intArray12 = ds.MaxMin1.maxMin1(intArray10, (-1));
        int[] intArray14 = ds.MaxMin1.maxMin1(intArray12, (int) (short) -1);
        int[] intArray16 = ds.MaxMin1.maxMin1(intArray14, (-1));
        int[] intArray18 = ds.MaxMin1.maxMin1(intArray14, 0);
        int[] intArray20 = ds.MaxMin1.maxMin1(intArray14, 1);
        int[] intArray22 = ds.MaxMin1.maxMin1(intArray20, (int) (byte) 1);
        int[] intArray24 = ds.MaxMin1.maxMin1(intArray22, (int) (short) -1);
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
    public void test1023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1023");
        int[] intArray6 = new int[] { (byte) -1, (byte) 1, ' ', (short) 10, (short) 1, (byte) 1 };
        int[] intArray8 = ds.MaxMin1.maxMin1(intArray6, (int) (byte) 0);
        int[] intArray10 = ds.MaxMin1.maxMin1(intArray6, (int) (short) 1);
        int[] intArray12 = ds.MaxMin1.maxMin1(intArray10, (-1));
        int[] intArray14 = ds.MaxMin1.maxMin1(intArray12, (int) (short) -1);
        int[] intArray16 = ds.MaxMin1.maxMin1(intArray14, (-1));
        int[] intArray18 = ds.MaxMin1.maxMin1(intArray14, 0);
        int[] intArray20 = ds.MaxMin1.maxMin1(intArray18, 0);
        int[] intArray22 = ds.MaxMin1.maxMin1(intArray18, 0);
        int[] intArray24 = ds.MaxMin1.maxMin1(intArray18, (int) (byte) 0);
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
    public void test1024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1024");
        int[] intArray6 = new int[] { (byte) -1, (byte) 1, ' ', (short) 10, (short) 1, (byte) 1 };
        int[] intArray8 = ds.MaxMin1.maxMin1(intArray6, (int) (byte) 0);
        int[] intArray10 = ds.MaxMin1.maxMin1(intArray6, (int) (byte) 1);
        int[] intArray12 = ds.MaxMin1.maxMin1(intArray6, (int) (byte) -1);
        int[] intArray14 = ds.MaxMin1.maxMin1(intArray6, 0);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray16 = ds.MaxMin1.maxMin1(intArray6, (int) (short) 100);
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
    public void test1025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1025");
        int[] intArray6 = new int[] { (byte) -1, (byte) 1, ' ', (short) 10, (short) 1, (byte) 1 };
        int[] intArray8 = ds.MaxMin1.maxMin1(intArray6, (int) (byte) 0);
        int[] intArray10 = ds.MaxMin1.maxMin1(intArray6, (int) (byte) 0);
        int[] intArray12 = ds.MaxMin1.maxMin1(intArray10, (int) (byte) -1);
        int[] intArray14 = ds.MaxMin1.maxMin1(intArray12, (int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray16 = ds.MaxMin1.maxMin1(intArray12, (int) (byte) 10);
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
    public void test1026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1026");
        int[] intArray4 = new int[] { (byte) 0, 10, '#', (short) 0 };
        int[] intArray6 = ds.MaxMin1.maxMin1(intArray4, (int) (short) 1);
        int[] intArray8 = ds.MaxMin1.maxMin1(intArray6, 0);
        int[] intArray10 = ds.MaxMin1.maxMin1(intArray8, 0);
        int[] intArray12 = ds.MaxMin1.maxMin1(intArray8, 0);
        int[] intArray14 = ds.MaxMin1.maxMin1(intArray12, (int) (byte) 0);
        int[] intArray16 = ds.MaxMin1.maxMin1(intArray14, (int) (short) 1);
        int[] intArray18 = ds.MaxMin1.maxMin1(intArray14, (int) (short) -1);
        int[] intArray20 = ds.MaxMin1.maxMin1(intArray14, (int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray22 = ds.MaxMin1.maxMin1(intArray20, 10);
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
    public void test1027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1027");
        int[] intArray6 = new int[] { (byte) -1, (byte) 1, ' ', (short) 10, (short) 1, (byte) 1 };
        int[] intArray8 = ds.MaxMin1.maxMin1(intArray6, (int) (byte) 0);
        int[] intArray10 = ds.MaxMin1.maxMin1(intArray6, (int) (byte) 1);
        int[] intArray12 = ds.MaxMin1.maxMin1(intArray6, (int) (short) 0);
        int[] intArray14 = ds.MaxMin1.maxMin1(intArray12, (int) (short) 0);
        int[] intArray16 = ds.MaxMin1.maxMin1(intArray14, 0);
        int[] intArray18 = ds.MaxMin1.maxMin1(intArray16, 0);
        int[] intArray20 = ds.MaxMin1.maxMin1(intArray16, (int) (short) 1);
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
    public void test1028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1028");
        int[] intArray4 = new int[] { (byte) 0, 10, '#', (short) 0 };
        int[] intArray6 = ds.MaxMin1.maxMin1(intArray4, (int) (short) 1);
        int[] intArray8 = ds.MaxMin1.maxMin1(intArray6, 0);
        int[] intArray10 = ds.MaxMin1.maxMin1(intArray8, 0);
        int[] intArray12 = ds.MaxMin1.maxMin1(intArray8, 0);
        int[] intArray14 = ds.MaxMin1.maxMin1(intArray12, 0);
        int[] intArray16 = ds.MaxMin1.maxMin1(intArray14, (-1));
        int[] intArray18 = ds.MaxMin1.maxMin1(intArray16, 0);
        int[] intArray20 = ds.MaxMin1.maxMin1(intArray16, (-1));
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray22 = ds.MaxMin1.maxMin1(intArray20, 10);
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
    public void test1029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1029");
        int[] intArray4 = new int[] { (byte) 0, 10, '#', (short) 0 };
        int[] intArray6 = ds.MaxMin1.maxMin1(intArray4, (int) (short) 1);
        int[] intArray8 = ds.MaxMin1.maxMin1(intArray6, 0);
        int[] intArray10 = ds.MaxMin1.maxMin1(intArray8, 0);
        int[] intArray12 = ds.MaxMin1.maxMin1(intArray8, 0);
        int[] intArray14 = ds.MaxMin1.maxMin1(intArray12, 0);
        int[] intArray16 = ds.MaxMin1.maxMin1(intArray14, (-1));
        int[] intArray18 = ds.MaxMin1.maxMin1(intArray16, (int) (byte) 1);
        int[] intArray20 = ds.MaxMin1.maxMin1(intArray18, (int) (byte) -1);
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
    public void test1030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1030");
        int[] intArray4 = new int[] { (byte) 0, 10, '#', (short) 0 };
        int[] intArray6 = ds.MaxMin1.maxMin1(intArray4, (int) (short) 1);
        int[] intArray8 = ds.MaxMin1.maxMin1(intArray6, 0);
        int[] intArray10 = ds.MaxMin1.maxMin1(intArray8, 0);
        int[] intArray12 = ds.MaxMin1.maxMin1(intArray8, 0);
        int[] intArray14 = ds.MaxMin1.maxMin1(intArray12, 0);
        int[] intArray16 = ds.MaxMin1.maxMin1(intArray14, (-1));
        int[] intArray18 = ds.MaxMin1.maxMin1(intArray16, (int) (byte) 1);
        int[] intArray20 = ds.MaxMin1.maxMin1(intArray16, (int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray22 = ds.MaxMin1.maxMin1(intArray20, (int) '#');
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
    public void test1031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1031");
        int[] intArray6 = new int[] { (byte) -1, (byte) 1, ' ', (short) 10, (short) 1, (byte) 1 };
        int[] intArray8 = ds.MaxMin1.maxMin1(intArray6, (int) (byte) 0);
        int[] intArray10 = ds.MaxMin1.maxMin1(intArray6, (int) (short) 1);
        int[] intArray12 = ds.MaxMin1.maxMin1(intArray10, (-1));
        int[] intArray14 = ds.MaxMin1.maxMin1(intArray10, (int) (byte) 0);
        int[] intArray16 = ds.MaxMin1.maxMin1(intArray10, 1);
        int[] intArray18 = ds.MaxMin1.maxMin1(intArray16, 0);
        int[] intArray20 = ds.MaxMin1.maxMin1(intArray16, 1);
        int[] intArray22 = ds.MaxMin1.maxMin1(intArray16, (int) (short) 0);
        int[] intArray24 = ds.MaxMin1.maxMin1(intArray16, 0);
        int[] intArray26 = ds.MaxMin1.maxMin1(intArray24, (-1));
        java.lang.Class<?> wildcardClass27 = intArray24.getClass();
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
    public void test1032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1032");
        int[] intArray4 = new int[] { (byte) 0, 10, '#', (short) 0 };
        int[] intArray6 = ds.MaxMin1.maxMin1(intArray4, (int) (short) 1);
        int[] intArray8 = ds.MaxMin1.maxMin1(intArray6, 0);
        int[] intArray10 = ds.MaxMin1.maxMin1(intArray8, (int) (byte) -1);
        int[] intArray12 = ds.MaxMin1.maxMin1(intArray10, 0);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray14 = ds.MaxMin1.maxMin1(intArray12, (int) '4');
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
    public void test1033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1033");
        int[] intArray4 = new int[] { (byte) 0, 10, '#', (short) 0 };
        int[] intArray6 = ds.MaxMin1.maxMin1(intArray4, (int) (short) 1);
        int[] intArray8 = ds.MaxMin1.maxMin1(intArray6, 0);
        int[] intArray10 = ds.MaxMin1.maxMin1(intArray8, 0);
        int[] intArray12 = ds.MaxMin1.maxMin1(intArray8, 0);
        int[] intArray14 = ds.MaxMin1.maxMin1(intArray12, 0);
        int[] intArray16 = ds.MaxMin1.maxMin1(intArray14, (-1));
        int[] intArray18 = ds.MaxMin1.maxMin1(intArray16, 1);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray20 = ds.MaxMin1.maxMin1(intArray18, (int) (byte) 100);
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
    public void test1034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1034");
        int[] intArray4 = new int[] { (byte) 0, 10, '#', (short) 0 };
        int[] intArray6 = ds.MaxMin1.maxMin1(intArray4, (int) (short) 1);
        int[] intArray8 = ds.MaxMin1.maxMin1(intArray6, 0);
        int[] intArray10 = ds.MaxMin1.maxMin1(intArray8, 0);
        int[] intArray12 = ds.MaxMin1.maxMin1(intArray8, 0);
        int[] intArray14 = ds.MaxMin1.maxMin1(intArray12, 0);
        int[] intArray16 = ds.MaxMin1.maxMin1(intArray14, (-1));
        int[] intArray18 = ds.MaxMin1.maxMin1(intArray16, (int) (byte) 0);
        int[] intArray20 = ds.MaxMin1.maxMin1(intArray18, (int) (byte) 1);
        int[] intArray22 = ds.MaxMin1.maxMin1(intArray20, (-1));
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
    public void test1035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1035");
        int[] intArray6 = new int[] { (byte) -1, (byte) 1, ' ', (short) 10, (short) 1, (byte) 1 };
        int[] intArray8 = ds.MaxMin1.maxMin1(intArray6, (int) (byte) 0);
        int[] intArray10 = ds.MaxMin1.maxMin1(intArray6, (int) (byte) 1);
        int[] intArray12 = ds.MaxMin1.maxMin1(intArray10, (int) (byte) 1);
        int[] intArray14 = ds.MaxMin1.maxMin1(intArray10, (int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray16 = ds.MaxMin1.maxMin1(intArray10, (int) '#');
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
    public void test1036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1036");
        int[] intArray6 = new int[] { (byte) -1, (byte) 1, ' ', (short) 10, (short) 1, (byte) 1 };
        int[] intArray8 = ds.MaxMin1.maxMin1(intArray6, (int) (byte) 0);
        int[] intArray10 = ds.MaxMin1.maxMin1(intArray6, (int) (short) 1);
        int[] intArray12 = ds.MaxMin1.maxMin1(intArray10, (-1));
        int[] intArray14 = ds.MaxMin1.maxMin1(intArray12, (int) (short) -1);
        int[] intArray16 = ds.MaxMin1.maxMin1(intArray14, (-1));
        int[] intArray18 = ds.MaxMin1.maxMin1(intArray14, 0);
        int[] intArray20 = ds.MaxMin1.maxMin1(intArray14, 1);
        int[] intArray22 = ds.MaxMin1.maxMin1(intArray20, (int) (byte) 1);
        int[] intArray24 = ds.MaxMin1.maxMin1(intArray20, (int) (short) 0);
        int[] intArray26 = ds.MaxMin1.maxMin1(intArray20, (-1));
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
    public void test1037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1037");
        int[] intArray6 = new int[] { (byte) -1, (byte) 1, ' ', (short) 10, (short) 1, (byte) 1 };
        int[] intArray8 = ds.MaxMin1.maxMin1(intArray6, (int) (byte) 0);
        int[] intArray10 = ds.MaxMin1.maxMin1(intArray6, (int) (byte) 0);
        int[] intArray12 = ds.MaxMin1.maxMin1(intArray10, (int) (short) -1);
        int[] intArray14 = ds.MaxMin1.maxMin1(intArray10, (int) (byte) -1);
        int[] intArray16 = ds.MaxMin1.maxMin1(intArray10, (int) (short) 0);
        int[] intArray18 = ds.MaxMin1.maxMin1(intArray16, (int) (byte) 1);
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
    public void test1038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1038");
        int[] intArray6 = new int[] { (byte) -1, (byte) 1, ' ', (short) 10, (short) 1, (byte) 1 };
        int[] intArray8 = ds.MaxMin1.maxMin1(intArray6, (int) (byte) 0);
        int[] intArray10 = ds.MaxMin1.maxMin1(intArray8, (-1));
        int[] intArray12 = ds.MaxMin1.maxMin1(intArray8, (int) (short) 1);
        int[] intArray14 = ds.MaxMin1.maxMin1(intArray12, (-1));
        int[] intArray16 = ds.MaxMin1.maxMin1(intArray14, (int) (short) -1);
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
    public void test1039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1039");
        int[] intArray4 = new int[] { (byte) 0, 10, '#', (short) 0 };
        int[] intArray6 = ds.MaxMin1.maxMin1(intArray4, (int) (short) 1);
        int[] intArray8 = ds.MaxMin1.maxMin1(intArray6, 0);
        int[] intArray10 = ds.MaxMin1.maxMin1(intArray8, 0);
        int[] intArray12 = ds.MaxMin1.maxMin1(intArray8, 0);
        int[] intArray14 = ds.MaxMin1.maxMin1(intArray12, 0);
        int[] intArray16 = ds.MaxMin1.maxMin1(intArray14, (-1));
        int[] intArray18 = ds.MaxMin1.maxMin1(intArray16, (int) (byte) 0);
        int[] intArray20 = ds.MaxMin1.maxMin1(intArray18, (int) (byte) 1);
        int[] intArray22 = ds.MaxMin1.maxMin1(intArray18, (int) (short) -1);
        int[] intArray24 = ds.MaxMin1.maxMin1(intArray22, 0);
        int[] intArray26 = ds.MaxMin1.maxMin1(intArray22, (int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray28 = ds.MaxMin1.maxMin1(intArray22, 10);
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
        org.junit.Assert.assertNotNull(intArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray24), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray26), "[0, 0]");
    }

    @Test
    public void test1040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1040");
        int[] intArray6 = new int[] { (byte) -1, (byte) 1, ' ', (short) 10, (short) 1, (byte) 1 };
        int[] intArray8 = ds.MaxMin1.maxMin1(intArray6, (int) (byte) 0);
        int[] intArray10 = ds.MaxMin1.maxMin1(intArray6, (int) (short) 1);
        int[] intArray12 = ds.MaxMin1.maxMin1(intArray10, (-1));
        int[] intArray14 = ds.MaxMin1.maxMin1(intArray12, (int) (short) -1);
        int[] intArray16 = ds.MaxMin1.maxMin1(intArray14, (-1));
        int[] intArray18 = ds.MaxMin1.maxMin1(intArray16, (int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray20 = ds.MaxMin1.maxMin1(intArray16, (int) 'a');
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
    public void test1041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1041");
        int[] intArray6 = new int[] { (byte) -1, (byte) 1, ' ', (short) 10, (short) 1, (byte) 1 };
        int[] intArray8 = ds.MaxMin1.maxMin1(intArray6, (int) (byte) 0);
        int[] intArray10 = ds.MaxMin1.maxMin1(intArray8, (-1));
        int[] intArray12 = ds.MaxMin1.maxMin1(intArray10, (int) (byte) -1);
        int[] intArray14 = ds.MaxMin1.maxMin1(intArray10, 1);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray16 = ds.MaxMin1.maxMin1(intArray10, (int) (short) 100);
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
    public void test1042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1042");
        int[] intArray4 = new int[] { (byte) 0, 10, '#', (short) 0 };
        int[] intArray6 = ds.MaxMin1.maxMin1(intArray4, (int) (short) 1);
        int[] intArray8 = ds.MaxMin1.maxMin1(intArray6, 0);
        int[] intArray10 = ds.MaxMin1.maxMin1(intArray8, (int) (byte) -1);
        int[] intArray12 = ds.MaxMin1.maxMin1(intArray10, 0);
        int[] intArray14 = ds.MaxMin1.maxMin1(intArray12, 0);
        int[] intArray16 = ds.MaxMin1.maxMin1(intArray14, (int) (short) 1);
        int[] intArray18 = ds.MaxMin1.maxMin1(intArray14, 0);
        int[] intArray20 = ds.MaxMin1.maxMin1(intArray18, (int) (short) -1);
        int[] intArray22 = ds.MaxMin1.maxMin1(intArray18, (int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray24 = ds.MaxMin1.maxMin1(intArray22, (int) 'a');
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
    public void test1043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1043");
        int[] intArray4 = new int[] { (byte) 0, 10, '#', (short) 0 };
        int[] intArray6 = ds.MaxMin1.maxMin1(intArray4, (int) (short) 1);
        int[] intArray8 = ds.MaxMin1.maxMin1(intArray6, 0);
        int[] intArray10 = ds.MaxMin1.maxMin1(intArray8, 0);
        int[] intArray12 = ds.MaxMin1.maxMin1(intArray8, 0);
        int[] intArray14 = ds.MaxMin1.maxMin1(intArray12, 0);
        int[] intArray16 = ds.MaxMin1.maxMin1(intArray14, (-1));
        int[] intArray18 = ds.MaxMin1.maxMin1(intArray16, (int) (byte) 0);
        int[] intArray20 = ds.MaxMin1.maxMin1(intArray18, (int) (byte) 1);
        int[] intArray22 = ds.MaxMin1.maxMin1(intArray18, (int) (short) -1);
        int[] intArray24 = ds.MaxMin1.maxMin1(intArray22, (int) (byte) 0);
        int[] intArray26 = ds.MaxMin1.maxMin1(intArray22, (int) (short) 0);
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
    public void test1044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1044");
        int[] intArray6 = new int[] { (byte) -1, (byte) 1, ' ', (short) 10, (short) 1, (byte) 1 };
        int[] intArray8 = ds.MaxMin1.maxMin1(intArray6, (int) (byte) 0);
        int[] intArray10 = ds.MaxMin1.maxMin1(intArray6, (int) (short) 1);
        int[] intArray12 = ds.MaxMin1.maxMin1(intArray10, (-1));
        int[] intArray14 = ds.MaxMin1.maxMin1(intArray12, (int) (short) -1);
        int[] intArray16 = ds.MaxMin1.maxMin1(intArray14, (-1));
        int[] intArray18 = ds.MaxMin1.maxMin1(intArray16, (int) (short) 1);
        int[] intArray20 = ds.MaxMin1.maxMin1(intArray16, (int) (byte) 1);
        int[] intArray22 = ds.MaxMin1.maxMin1(intArray16, 0);
        int[] intArray24 = ds.MaxMin1.maxMin1(intArray22, 0);
        int[] intArray26 = ds.MaxMin1.maxMin1(intArray24, (int) (short) 0);
        int[] intArray28 = ds.MaxMin1.maxMin1(intArray24, 1);
        int[] intArray30 = ds.MaxMin1.maxMin1(intArray24, 0);
        java.lang.Class<?> wildcardClass31 = intArray30.getClass();
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
        org.junit.Assert.assertNotNull(intArray30);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray30), "[-1, -1]");
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test1045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1045");
        int[] intArray4 = new int[] { (byte) 0, 10, '#', (short) 0 };
        int[] intArray6 = ds.MaxMin1.maxMin1(intArray4, (int) (short) 1);
        int[] intArray8 = ds.MaxMin1.maxMin1(intArray6, 0);
        int[] intArray10 = ds.MaxMin1.maxMin1(intArray8, 0);
        int[] intArray12 = ds.MaxMin1.maxMin1(intArray8, 0);
        int[] intArray14 = ds.MaxMin1.maxMin1(intArray12, 0);
        int[] intArray16 = ds.MaxMin1.maxMin1(intArray14, (-1));
        int[] intArray18 = ds.MaxMin1.maxMin1(intArray16, 0);
        int[] intArray20 = ds.MaxMin1.maxMin1(intArray16, (-1));
        int[] intArray22 = ds.MaxMin1.maxMin1(intArray16, (int) (short) -1);
        int[] intArray24 = ds.MaxMin1.maxMin1(intArray22, (int) (byte) 0);
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
    public void test1046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1046");
        int[] intArray4 = new int[] { (byte) 0, 10, '#', (short) 0 };
        int[] intArray6 = ds.MaxMin1.maxMin1(intArray4, (int) (short) 1);
        int[] intArray8 = ds.MaxMin1.maxMin1(intArray4, (int) (short) 1);
        int[] intArray10 = ds.MaxMin1.maxMin1(intArray8, (int) (byte) -1);
        int[] intArray12 = ds.MaxMin1.maxMin1(intArray10, (int) (short) 0);
        int[] intArray14 = ds.MaxMin1.maxMin1(intArray12, (-1));
        int[] intArray16 = ds.MaxMin1.maxMin1(intArray12, (int) (byte) -1);
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
    public void test1047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1047");
        int[] intArray6 = new int[] { (byte) -1, (byte) 1, ' ', (short) 10, (short) 1, (byte) 1 };
        int[] intArray8 = ds.MaxMin1.maxMin1(intArray6, (int) (byte) 0);
        int[] intArray10 = ds.MaxMin1.maxMin1(intArray6, (int) (short) 1);
        int[] intArray12 = ds.MaxMin1.maxMin1(intArray10, (-1));
        int[] intArray14 = ds.MaxMin1.maxMin1(intArray12, (int) (short) -1);
        int[] intArray16 = ds.MaxMin1.maxMin1(intArray14, (-1));
        int[] intArray18 = ds.MaxMin1.maxMin1(intArray14, 0);
        int[] intArray20 = ds.MaxMin1.maxMin1(intArray14, 1);
        int[] intArray22 = ds.MaxMin1.maxMin1(intArray20, (int) (byte) 1);
        int[] intArray24 = ds.MaxMin1.maxMin1(intArray20, (int) (byte) 0);
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
    public void test1048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1048");
        int[] intArray4 = new int[] { (byte) 0, 10, '#', (short) 0 };
        int[] intArray6 = ds.MaxMin1.maxMin1(intArray4, (int) (short) 1);
        int[] intArray8 = ds.MaxMin1.maxMin1(intArray6, 0);
        int[] intArray10 = ds.MaxMin1.maxMin1(intArray8, (int) (byte) -1);
        int[] intArray12 = ds.MaxMin1.maxMin1(intArray10, 0);
        int[] intArray14 = ds.MaxMin1.maxMin1(intArray12, 0);
        int[] intArray16 = ds.MaxMin1.maxMin1(intArray14, (int) (short) 1);
        int[] intArray18 = ds.MaxMin1.maxMin1(intArray14, 0);
        int[] intArray20 = ds.MaxMin1.maxMin1(intArray14, (int) (byte) 0);
        int[] intArray22 = ds.MaxMin1.maxMin1(intArray20, 0);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray24 = ds.MaxMin1.maxMin1(intArray20, (int) (short) 10);
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
    public void test1049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1049");
        int[] intArray6 = new int[] { (byte) -1, (byte) 1, ' ', (short) 10, (short) 1, (byte) 1 };
        int[] intArray8 = ds.MaxMin1.maxMin1(intArray6, (int) (byte) 0);
        int[] intArray10 = ds.MaxMin1.maxMin1(intArray6, (int) (short) 1);
        int[] intArray12 = ds.MaxMin1.maxMin1(intArray10, (-1));
        int[] intArray14 = ds.MaxMin1.maxMin1(intArray12, (int) (short) -1);
        int[] intArray16 = ds.MaxMin1.maxMin1(intArray14, (-1));
        int[] intArray18 = ds.MaxMin1.maxMin1(intArray14, 0);
        int[] intArray20 = ds.MaxMin1.maxMin1(intArray14, 1);
        int[] intArray22 = ds.MaxMin1.maxMin1(intArray20, (int) (byte) 1);
        int[] intArray24 = ds.MaxMin1.maxMin1(intArray20, 0);
        int[] intArray26 = ds.MaxMin1.maxMin1(intArray20, (int) (byte) 0);
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
    public void test1050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1050");
        int[] intArray4 = new int[] { (byte) 0, 10, '#', (short) 0 };
        int[] intArray6 = ds.MaxMin1.maxMin1(intArray4, (int) (short) 1);
        int[] intArray8 = ds.MaxMin1.maxMin1(intArray6, 0);
        int[] intArray10 = ds.MaxMin1.maxMin1(intArray8, (int) (byte) -1);
        int[] intArray12 = ds.MaxMin1.maxMin1(intArray10, 0);
        int[] intArray14 = ds.MaxMin1.maxMin1(intArray12, (int) (short) 1);
        int[] intArray16 = ds.MaxMin1.maxMin1(intArray14, 0);
        int[] intArray18 = ds.MaxMin1.maxMin1(intArray14, (int) (byte) 1);
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
    public void test1051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1051");
        int[] intArray4 = new int[] { (byte) 0, 10, '#', (short) 0 };
        int[] intArray6 = ds.MaxMin1.maxMin1(intArray4, (int) (short) 1);
        int[] intArray8 = ds.MaxMin1.maxMin1(intArray6, 0);
        int[] intArray10 = ds.MaxMin1.maxMin1(intArray6, (int) (byte) 1);
        java.lang.Class<?> wildcardClass11 = intArray6.getClass();
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
    public void test1052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1052");
        int[] intArray4 = new int[] { (byte) 0, 10, '#', (short) 0 };
        int[] intArray6 = ds.MaxMin1.maxMin1(intArray4, (int) (short) 1);
        int[] intArray8 = ds.MaxMin1.maxMin1(intArray6, 0);
        int[] intArray10 = ds.MaxMin1.maxMin1(intArray8, 0);
        int[] intArray12 = ds.MaxMin1.maxMin1(intArray8, 0);
        int[] intArray14 = ds.MaxMin1.maxMin1(intArray12, 0);
        int[] intArray16 = ds.MaxMin1.maxMin1(intArray12, 0);
        int[] intArray18 = ds.MaxMin1.maxMin1(intArray12, (int) (byte) -1);
        int[] intArray20 = ds.MaxMin1.maxMin1(intArray12, (int) (short) 0);
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
    public void test1053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1053");
        int[] intArray4 = new int[] { (byte) 0, 10, '#', (short) 0 };
        int[] intArray6 = ds.MaxMin1.maxMin1(intArray4, (int) (short) 1);
        int[] intArray8 = ds.MaxMin1.maxMin1(intArray6, 0);
        int[] intArray10 = ds.MaxMin1.maxMin1(intArray8, (int) (byte) -1);
        int[] intArray12 = ds.MaxMin1.maxMin1(intArray10, 0);
        int[] intArray14 = ds.MaxMin1.maxMin1(intArray12, 0);
        int[] intArray16 = ds.MaxMin1.maxMin1(intArray14, (int) (short) 1);
        int[] intArray18 = ds.MaxMin1.maxMin1(intArray14, 0);
        int[] intArray20 = ds.MaxMin1.maxMin1(intArray14, (int) (byte) 0);
        int[] intArray22 = ds.MaxMin1.maxMin1(intArray14, (int) (short) 1);
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
    public void test1054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1054");
        int[] intArray4 = new int[] { (byte) 0, 10, '#', (short) 0 };
        int[] intArray6 = ds.MaxMin1.maxMin1(intArray4, (int) (short) 1);
        int[] intArray8 = ds.MaxMin1.maxMin1(intArray6, 0);
        int[] intArray10 = ds.MaxMin1.maxMin1(intArray8, (int) (byte) -1);
        int[] intArray12 = ds.MaxMin1.maxMin1(intArray10, 0);
        int[] intArray14 = ds.MaxMin1.maxMin1(intArray12, 0);
        int[] intArray16 = ds.MaxMin1.maxMin1(intArray14, (int) (short) 1);
        int[] intArray18 = ds.MaxMin1.maxMin1(intArray14, 0);
        int[] intArray20 = ds.MaxMin1.maxMin1(intArray18, (int) (byte) 0);
        int[] intArray22 = ds.MaxMin1.maxMin1(intArray20, (int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray24 = ds.MaxMin1.maxMin1(intArray22, (int) '#');
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
    public void test1055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1055");
        int[] intArray4 = new int[] { (byte) 0, 10, '#', (short) 0 };
        int[] intArray6 = ds.MaxMin1.maxMin1(intArray4, (int) (short) 1);
        int[] intArray8 = ds.MaxMin1.maxMin1(intArray4, (int) (short) 1);
        int[] intArray10 = ds.MaxMin1.maxMin1(intArray8, (int) (byte) -1);
        int[] intArray12 = ds.MaxMin1.maxMin1(intArray10, (int) (short) 0);
        int[] intArray14 = ds.MaxMin1.maxMin1(intArray12, (-1));
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
    public void test1056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1056");
        int[] intArray6 = new int[] { (byte) -1, (byte) 1, ' ', (short) 10, (short) 1, (byte) 1 };
        int[] intArray8 = ds.MaxMin1.maxMin1(intArray6, (int) (byte) 0);
        int[] intArray10 = ds.MaxMin1.maxMin1(intArray6, (int) (short) 1);
        int[] intArray12 = ds.MaxMin1.maxMin1(intArray10, (-1));
        int[] intArray14 = ds.MaxMin1.maxMin1(intArray10, (int) (byte) 0);
        int[] intArray16 = ds.MaxMin1.maxMin1(intArray10, 1);
        int[] intArray18 = ds.MaxMin1.maxMin1(intArray16, (int) (byte) 1);
        int[] intArray20 = ds.MaxMin1.maxMin1(intArray16, (int) (short) -1);
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
    public void test1057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1057");
        int[] intArray6 = new int[] { (byte) -1, (byte) 1, ' ', (short) 10, (short) 1, (byte) 1 };
        int[] intArray8 = ds.MaxMin1.maxMin1(intArray6, (int) (byte) 0);
        int[] intArray10 = ds.MaxMin1.maxMin1(intArray8, (int) (short) -1);
        int[] intArray12 = ds.MaxMin1.maxMin1(intArray8, (int) (byte) 1);
        int[] intArray14 = ds.MaxMin1.maxMin1(intArray8, (-1));
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
    public void test1058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1058");
        int[] intArray6 = new int[] { (byte) -1, (byte) 1, ' ', (short) 10, (short) 1, (byte) 1 };
        int[] intArray8 = ds.MaxMin1.maxMin1(intArray6, (int) (byte) 0);
        int[] intArray10 = ds.MaxMin1.maxMin1(intArray6, (int) (byte) 0);
        int[] intArray12 = ds.MaxMin1.maxMin1(intArray10, (int) (byte) -1);
        int[] intArray14 = ds.MaxMin1.maxMin1(intArray12, (int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray16 = ds.MaxMin1.maxMin1(intArray14, (int) (short) 100);
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
    public void test1059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1059");
        int[] intArray4 = new int[] { (byte) 0, 10, '#', (short) 0 };
        int[] intArray6 = ds.MaxMin1.maxMin1(intArray4, (int) (short) 1);
        int[] intArray8 = ds.MaxMin1.maxMin1(intArray6, 0);
        int[] intArray10 = ds.MaxMin1.maxMin1(intArray8, (int) (byte) -1);
        int[] intArray12 = ds.MaxMin1.maxMin1(intArray10, 0);
        int[] intArray14 = ds.MaxMin1.maxMin1(intArray12, 0);
        int[] intArray16 = ds.MaxMin1.maxMin1(intArray14, (int) (short) 1);
        int[] intArray18 = ds.MaxMin1.maxMin1(intArray14, 0);
        int[] intArray20 = ds.MaxMin1.maxMin1(intArray14, (int) (byte) 0);
        int[] intArray22 = ds.MaxMin1.maxMin1(intArray14, 0);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray24 = ds.MaxMin1.maxMin1(intArray22, (int) '#');
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
    public void test1060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1060");
        int[] intArray4 = new int[] { (byte) 0, 10, '#', (short) 0 };
        int[] intArray6 = ds.MaxMin1.maxMin1(intArray4, (int) (short) 1);
        int[] intArray8 = ds.MaxMin1.maxMin1(intArray4, (int) (short) 1);
        int[] intArray10 = ds.MaxMin1.maxMin1(intArray8, (int) (byte) -1);
        int[] intArray12 = ds.MaxMin1.maxMin1(intArray10, 1);
        int[] intArray14 = ds.MaxMin1.maxMin1(intArray12, 1);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray16 = ds.MaxMin1.maxMin1(intArray14, 10);
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
    public void test1061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop2.test1061");
        int[] intArray4 = new int[] { (byte) 0, 10, '#', (short) 0 };
        int[] intArray6 = ds.MaxMin1.maxMin1(intArray4, (int) (short) 1);
        int[] intArray8 = ds.MaxMin1.maxMin1(intArray6, 0);
        int[] intArray10 = ds.MaxMin1.maxMin1(intArray8, (int) (byte) -1);
        int[] intArray12 = ds.MaxMin1.maxMin1(intArray10, 0);
        int[] intArray14 = ds.MaxMin1.maxMin1(intArray12, 0);
        int[] intArray16 = ds.MaxMin1.maxMin1(intArray14, (int) (short) 1);
        int[] intArray18 = ds.MaxMin1.maxMin1(intArray14, 0);
        int[] intArray20 = ds.MaxMin1.maxMin1(intArray18, (int) (short) -1);
        int[] intArray22 = ds.MaxMin1.maxMin1(intArray20, (int) (byte) 1);
        int[] intArray24 = ds.MaxMin1.maxMin1(intArray20, (int) (byte) 1);
        java.lang.Class<?> wildcardClass25 = intArray20.getClass();
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
}

