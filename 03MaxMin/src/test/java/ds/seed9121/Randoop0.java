package ds.seed9121;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class Randoop0 {

    public static boolean debug = false;

    @Test
    public void test001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test001");
        int[] intArray0 = new int[] {};
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray2 = ds.MaxMin2.maxMin2(intArray0, (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 0");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
    }

    @Test
    public void test002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test002");
        int[] intArray6 = new int[] { (byte) -1, (byte) 1, ' ', (short) 10, (short) 1, (byte) 1 };
        int[] intArray8 = ds.MaxMin2.maxMin2(intArray6, (int) (byte) 0);
        java.lang.Class<?> wildcardClass9 = intArray6.getClass();
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[-1, 1, 32, 10, 1, 1]");
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[-1, -1]");
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test003");
        int[] intArray4 = new int[] { (byte) 0, 10, '#', (short) 0 };
        int[] intArray6 = ds.MaxMin2.maxMin2(intArray4, (int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray8 = ds.MaxMin2.maxMin2(intArray4, (int) (byte) 10);
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
    public void test004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test004");
        ds.MaxMin2 maxMin2_0 = new ds.MaxMin2();
        java.lang.Class<?> wildcardClass1 = maxMin2_0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test005");
        int[] intArray4 = new int[] { (byte) 0, 10, '#', (short) 0 };
        int[] intArray6 = ds.MaxMin2.maxMin2(intArray4, (int) (short) 1);
        int[] intArray8 = ds.MaxMin2.maxMin2(intArray6, 0);
        java.lang.Class<?> wildcardClass9 = intArray6.getClass();
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[0, 10, 35, 0]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[0, 0]");
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test006");
        int[] intArray4 = new int[] { (byte) 0, 10, '#', (short) 0 };
        int[] intArray6 = ds.MaxMin2.maxMin2(intArray4, (int) (short) 1);
        int[] intArray8 = ds.MaxMin2.maxMin2(intArray6, 0);
        int[] intArray10 = ds.MaxMin2.maxMin2(intArray8, (int) (byte) -1);
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
    public void test007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test007");
        int[] intArray6 = new int[] { (byte) -1, (byte) 1, ' ', (short) 10, (short) 1, (byte) 1 };
        int[] intArray8 = ds.MaxMin2.maxMin2(intArray6, (int) (byte) 0);
        int[] intArray10 = ds.MaxMin2.maxMin2(intArray8, (-1));
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray12 = ds.MaxMin2.maxMin2(intArray8, (int) (short) 100);
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
    public void test008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test008");
        int[] intArray6 = new int[] { (byte) -1, (byte) 1, ' ', (short) 10, (short) 1, (byte) 1 };
        int[] intArray8 = ds.MaxMin2.maxMin2(intArray6, (int) (byte) 0);
        int[] intArray10 = ds.MaxMin2.maxMin2(intArray8, (-1));
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray12 = ds.MaxMin2.maxMin2(intArray10, 10);
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
    public void test009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test009");
        int[] intArray6 = new int[] { (byte) -1, (byte) 1, ' ', (short) 10, (short) 1, (byte) 1 };
        int[] intArray8 = ds.MaxMin2.maxMin2(intArray6, (int) (byte) 0);
        int[] intArray10 = ds.MaxMin2.maxMin2(intArray8, (-1));
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
    public void test010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test010");
        int[] intArray6 = new int[] { (byte) -1, (byte) 1, ' ', (short) 10, (short) 1, (byte) 1 };
        int[] intArray8 = ds.MaxMin2.maxMin2(intArray6, (int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray10 = ds.MaxMin2.maxMin2(intArray6, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 6");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[-1, 1, 32, 10, 1, 1]");
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[-1, -1]");
    }

    @Test
    public void test011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test011");
        int[] intArray4 = new int[] { (byte) 0, 10, '#', (short) 0 };
        int[] intArray6 = ds.MaxMin2.maxMin2(intArray4, (int) (short) 1);
        java.lang.Class<?> wildcardClass7 = intArray6.getClass();
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[0, 10, 35, 0]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[0, 0]");
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test012");
        int[] intArray4 = new int[] { (byte) 0, 10, '#', (short) 0 };
        int[] intArray6 = ds.MaxMin2.maxMin2(intArray4, (int) (short) 1);
        int[] intArray8 = ds.MaxMin2.maxMin2(intArray4, (int) (short) 1);
        java.lang.Class<?> wildcardClass9 = intArray8.getClass();
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[0, 10, 35, 0]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[0, 0]");
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test013");
        java.lang.Object obj0 = new java.lang.Object();
        java.lang.Class<?> wildcardClass1 = obj0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test014");
        int[] intArray6 = new int[] { (byte) -1, (byte) 1, ' ', (short) 10, (short) 1, (byte) 1 };
        int[] intArray8 = ds.MaxMin2.maxMin2(intArray6, (int) (byte) 0);
        int[] intArray10 = ds.MaxMin2.maxMin2(intArray6, (int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray12 = ds.MaxMin2.maxMin2(intArray6, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 6");
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
    public void test015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test015");
        int[] intArray4 = new int[] { (byte) 0, 10, '#', (short) 0 };
        int[] intArray6 = ds.MaxMin2.maxMin2(intArray4, (int) (short) 1);
        int[] intArray8 = ds.MaxMin2.maxMin2(intArray6, 0);
        int[] intArray10 = ds.MaxMin2.maxMin2(intArray8, (int) (byte) -1);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray12 = ds.MaxMin2.maxMin2(intArray8, (int) '#');
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
    public void test016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test016");
        int[] intArray6 = new int[] { (byte) -1, (byte) 1, ' ', (short) 10, (short) 1, (byte) 1 };
        int[] intArray8 = ds.MaxMin2.maxMin2(intArray6, (int) (byte) 0);
        int[] intArray10 = ds.MaxMin2.maxMin2(intArray6, (int) (short) 1);
        java.lang.Class<?> wildcardClass11 = intArray6.getClass();
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[-1, 1, 32, 10, 1, 1]");
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[-1, -1]");
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test017");
        int[] intArray4 = new int[] { (byte) 0, 10, '#', (short) 0 };
        int[] intArray6 = ds.MaxMin2.maxMin2(intArray4, (int) (short) 1);
        int[] intArray8 = ds.MaxMin2.maxMin2(intArray6, 0);
        int[] intArray10 = ds.MaxMin2.maxMin2(intArray8, (int) (byte) -1);
        java.lang.Class<?> wildcardClass11 = intArray8.getClass();
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
    public void test018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test018");
        int[] intArray6 = new int[] { (byte) -1, (byte) 1, ' ', (short) 10, (short) 1, (byte) 1 };
        int[] intArray8 = ds.MaxMin2.maxMin2(intArray6, (int) (byte) 0);
        int[] intArray10 = ds.MaxMin2.maxMin2(intArray6, (int) (byte) 1);
        int[] intArray12 = ds.MaxMin2.maxMin2(intArray10, (int) (byte) 1);
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
    public void test019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test019");
        int[] intArray4 = new int[] { (byte) 0, 10, '#', (short) 0 };
        int[] intArray6 = ds.MaxMin2.maxMin2(intArray4, (int) (short) 1);
        int[] intArray8 = ds.MaxMin2.maxMin2(intArray6, 0);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray10 = ds.MaxMin2.maxMin2(intArray6, (int) (short) 10);
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
    }

    @Test
    public void test020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test020");
        int[] intArray4 = new int[] { (byte) 0, 10, '#', (short) 0 };
        int[] intArray6 = ds.MaxMin2.maxMin2(intArray4, (int) (short) 1);
        int[] intArray8 = ds.MaxMin2.maxMin2(intArray6, 0);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray10 = ds.MaxMin2.maxMin2(intArray8, (int) '4');
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
    }

    @Test
    public void test021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test021");
        int[] intArray4 = new int[] { (byte) 0, 10, '#', (short) 0 };
        int[] intArray6 = ds.MaxMin2.maxMin2(intArray4, (int) (short) 1);
        int[] intArray8 = ds.MaxMin2.maxMin2(intArray6, 0);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray10 = ds.MaxMin2.maxMin2(intArray6, 10);
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
    }

    @Test
    public void test022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test022");
        int[] intArray6 = new int[] { (byte) -1, (byte) 1, ' ', (short) 10, (short) 1, (byte) 1 };
        int[] intArray8 = ds.MaxMin2.maxMin2(intArray6, (int) (byte) 0);
        int[] intArray10 = ds.MaxMin2.maxMin2(intArray6, (int) (byte) 1);
        int[] intArray12 = ds.MaxMin2.maxMin2(intArray10, (int) (byte) 1);
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
    public void test023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test023");
        int[] intArray6 = new int[] { (byte) -1, (byte) 1, ' ', (short) 10, (short) 1, (byte) 1 };
        int[] intArray8 = ds.MaxMin2.maxMin2(intArray6, (int) (byte) 0);
        int[] intArray10 = ds.MaxMin2.maxMin2(intArray6, (int) (short) 1);
        int[] intArray12 = ds.MaxMin2.maxMin2(intArray10, (-1));
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
    public void test024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test024");
        int[] intArray4 = new int[] { (byte) 0, 10, '#', (short) 0 };
        int[] intArray6 = ds.MaxMin2.maxMin2(intArray4, (int) (short) 1);
        int[] intArray8 = ds.MaxMin2.maxMin2(intArray6, 0);
        java.lang.Class<?> wildcardClass9 = intArray8.getClass();
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[0, 10, 35, 0]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[0, 0]");
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test025");
        int[] intArray4 = new int[] { (byte) 0, 10, '#', (short) 0 };
        int[] intArray6 = ds.MaxMin2.maxMin2(intArray4, (int) (short) 1);
        int[] intArray8 = ds.MaxMin2.maxMin2(intArray6, 0);
        int[] intArray10 = ds.MaxMin2.maxMin2(intArray8, (int) (byte) -1);
        int[] intArray12 = ds.MaxMin2.maxMin2(intArray10, 0);
        int[] intArray14 = ds.MaxMin2.maxMin2(intArray12, 0);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray16 = ds.MaxMin2.maxMin2(intArray12, (int) (byte) 10);
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
    public void test026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test026");
        int[] intArray4 = new int[] { (byte) 0, 10, '#', (short) 0 };
        int[] intArray6 = ds.MaxMin2.maxMin2(intArray4, (int) (short) 1);
        int[] intArray8 = ds.MaxMin2.maxMin2(intArray6, 0);
        int[] intArray10 = ds.MaxMin2.maxMin2(intArray8, (int) (byte) -1);
        int[] intArray12 = ds.MaxMin2.maxMin2(intArray10, 0);
        int[] intArray14 = ds.MaxMin2.maxMin2(intArray12, 0);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray16 = ds.MaxMin2.maxMin2(intArray12, (int) (short) 100);
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
    public void test027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test027");
        int[] intArray4 = new int[] { (byte) 0, 10, '#', (short) 0 };
        int[] intArray6 = ds.MaxMin2.maxMin2(intArray4, (int) (short) 1);
        int[] intArray8 = ds.MaxMin2.maxMin2(intArray6, 0);
        int[] intArray10 = ds.MaxMin2.maxMin2(intArray8, 0);
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
    public void test028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test028");
        int[] intArray4 = new int[] { (byte) 0, 10, '#', (short) 0 };
        int[] intArray6 = ds.MaxMin2.maxMin2(intArray4, (int) (short) 1);
        int[] intArray8 = ds.MaxMin2.maxMin2(intArray4, (int) (short) 1);
        int[] intArray10 = ds.MaxMin2.maxMin2(intArray8, (int) (byte) -1);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray12 = ds.MaxMin2.maxMin2(intArray10, (int) (byte) 100);
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
    public void test029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test029");
        int[] intArray6 = new int[] { (byte) -1, (byte) 1, ' ', (short) 10, (short) 1, (byte) 1 };
        int[] intArray8 = ds.MaxMin2.maxMin2(intArray6, (int) (byte) 0);
        int[] intArray10 = ds.MaxMin2.maxMin2(intArray6, (int) (short) 1);
        int[] intArray12 = ds.MaxMin2.maxMin2(intArray10, (-1));
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
    public void test030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test030");
        int[] intArray6 = new int[] { (byte) -1, (byte) 1, ' ', (short) 10, (short) 1, (byte) 1 };
        int[] intArray8 = ds.MaxMin2.maxMin2(intArray6, (int) (byte) 0);
        int[] intArray10 = ds.MaxMin2.maxMin2(intArray6, (int) (byte) 1);
        int[] intArray12 = ds.MaxMin2.maxMin2(intArray6, (int) (short) 0);
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
    public void test031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test031");
        int[] intArray6 = new int[] { (byte) -1, (byte) 1, ' ', (short) 10, (short) 1, (byte) 1 };
        int[] intArray8 = ds.MaxMin2.maxMin2(intArray6, (int) (byte) 0);
        int[] intArray10 = ds.MaxMin2.maxMin2(intArray6, (int) (byte) 0);
        java.lang.Class<?> wildcardClass11 = intArray10.getClass();
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[-1, 1, 32, 10, 1, 1]");
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[-1, -1]");
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test032");
        int[] intArray4 = new int[] { (byte) 0, 10, '#', (short) 0 };
        int[] intArray6 = ds.MaxMin2.maxMin2(intArray4, (int) (short) 1);
        int[] intArray8 = ds.MaxMin2.maxMin2(intArray6, 0);
        int[] intArray10 = ds.MaxMin2.maxMin2(intArray8, (int) (byte) -1);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray12 = ds.MaxMin2.maxMin2(intArray10, (int) 'a');
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
    public void test033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test033");
        int[] intArray6 = new int[] { (byte) -1, (byte) 1, ' ', (short) 10, (short) 1, (byte) 1 };
        int[] intArray8 = ds.MaxMin2.maxMin2(intArray6, (int) (byte) 0);
        int[] intArray10 = ds.MaxMin2.maxMin2(intArray6, (int) (short) 1);
        int[] intArray12 = ds.MaxMin2.maxMin2(intArray10, (-1));
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray14 = ds.MaxMin2.maxMin2(intArray12, 100);
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
    public void test034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test034");
        int[] intArray4 = new int[] { (byte) 0, 10, '#', (short) 0 };
        int[] intArray6 = ds.MaxMin2.maxMin2(intArray4, (int) (short) 1);
        int[] intArray8 = ds.MaxMin2.maxMin2(intArray4, (int) (short) 1);
        int[] intArray10 = ds.MaxMin2.maxMin2(intArray8, (int) (byte) -1);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray12 = ds.MaxMin2.maxMin2(intArray10, 10);
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
    public void test035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test035");
        int[] intArray6 = new int[] { (byte) -1, (byte) 1, ' ', (short) 10, (short) 1, (byte) 1 };
        int[] intArray8 = ds.MaxMin2.maxMin2(intArray6, (int) (byte) 0);
        int[] intArray10 = ds.MaxMin2.maxMin2(intArray6, (int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray12 = ds.MaxMin2.maxMin2(intArray6, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 6");
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
    public void test036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test036");
        int[] intArray6 = new int[] { (byte) -1, (byte) 1, ' ', (short) 10, (short) 1, (byte) 1 };
        int[] intArray8 = ds.MaxMin2.maxMin2(intArray6, (int) (byte) 0);
        int[] intArray10 = ds.MaxMin2.maxMin2(intArray6, (int) (short) 1);
        java.lang.Class<?> wildcardClass11 = intArray10.getClass();
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[-1, 1, 32, 10, 1, 1]");
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[-1, -1]");
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test037");
        int[] intArray4 = new int[] { (byte) 0, 10, '#', (short) 0 };
        int[] intArray6 = ds.MaxMin2.maxMin2(intArray4, (int) (short) 1);
        int[] intArray8 = ds.MaxMin2.maxMin2(intArray4, (int) (short) 1);
        int[] intArray10 = ds.MaxMin2.maxMin2(intArray8, (int) (byte) -1);
        java.lang.Class<?> wildcardClass11 = intArray8.getClass();
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
    public void test038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test038");
        int[] intArray6 = new int[] { (byte) -1, (byte) 1, ' ', (short) 10, (short) 1, (byte) 1 };
        int[] intArray8 = ds.MaxMin2.maxMin2(intArray6, (int) (byte) 0);
        int[] intArray10 = ds.MaxMin2.maxMin2(intArray8, (-1));
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray12 = ds.MaxMin2.maxMin2(intArray8, (int) ' ');
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
    public void test039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test039");
        int[] intArray0 = null;
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray2 = ds.MaxMin2.maxMin2(intArray0, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test040");
        int[] intArray4 = new int[] { (byte) 0, 10, '#', (short) 0 };
        int[] intArray6 = ds.MaxMin2.maxMin2(intArray4, (int) (short) 1);
        int[] intArray8 = ds.MaxMin2.maxMin2(intArray6, 0);
        int[] intArray10 = ds.MaxMin2.maxMin2(intArray8, (int) (byte) -1);
        int[] intArray12 = ds.MaxMin2.maxMin2(intArray10, 0);
        int[] intArray14 = ds.MaxMin2.maxMin2(intArray12, 0);
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
    public void test041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test041");
        int[] intArray6 = new int[] { (byte) -1, (byte) 1, ' ', (short) 10, (short) 1, (byte) 1 };
        int[] intArray8 = ds.MaxMin2.maxMin2(intArray6, (int) (byte) 0);
        int[] intArray10 = ds.MaxMin2.maxMin2(intArray6, (int) (short) 1);
        int[] intArray12 = ds.MaxMin2.maxMin2(intArray10, (-1));
        int[] intArray14 = ds.MaxMin2.maxMin2(intArray12, (int) (short) -1);
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
    public void test042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test042");
        int[] intArray6 = new int[] { (byte) -1, (byte) 1, ' ', (short) 10, (short) 1, (byte) 1 };
        int[] intArray8 = ds.MaxMin2.maxMin2(intArray6, (int) (byte) 0);
        int[] intArray10 = ds.MaxMin2.maxMin2(intArray6, (int) (short) 1);
        int[] intArray12 = ds.MaxMin2.maxMin2(intArray10, (-1));
        int[] intArray14 = ds.MaxMin2.maxMin2(intArray12, (int) (short) -1);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray16 = ds.MaxMin2.maxMin2(intArray14, (int) (byte) 100);
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
    public void test043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test043");
        int[] intArray6 = new int[] { (byte) -1, (byte) 1, ' ', (short) 10, (short) 1, (byte) 1 };
        int[] intArray8 = ds.MaxMin2.maxMin2(intArray6, (int) (byte) 0);
        int[] intArray10 = ds.MaxMin2.maxMin2(intArray6, (int) (byte) 1);
        int[] intArray12 = ds.MaxMin2.maxMin2(intArray10, (int) (byte) 1);
        int[] intArray14 = ds.MaxMin2.maxMin2(intArray10, 0);
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
    public void test044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test044");
        int[] intArray4 = new int[] { (byte) 0, 10, '#', (short) 0 };
        int[] intArray6 = ds.MaxMin2.maxMin2(intArray4, (int) (short) 1);
        int[] intArray8 = ds.MaxMin2.maxMin2(intArray6, 0);
        int[] intArray10 = ds.MaxMin2.maxMin2(intArray8, (int) (byte) -1);
        int[] intArray12 = ds.MaxMin2.maxMin2(intArray10, 0);
        int[] intArray14 = ds.MaxMin2.maxMin2(intArray12, 0);
        int[] intArray16 = ds.MaxMin2.maxMin2(intArray14, (int) (short) 1);
        int[] intArray18 = ds.MaxMin2.maxMin2(intArray14, 0);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray20 = ds.MaxMin2.maxMin2(intArray18, (int) (byte) 10);
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
    public void test045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test045");
        int[] intArray6 = new int[] { (byte) -1, (byte) 1, ' ', (short) 10, (short) 1, (byte) 1 };
        int[] intArray8 = ds.MaxMin2.maxMin2(intArray6, (int) (byte) 0);
        int[] intArray10 = ds.MaxMin2.maxMin2(intArray6, (int) (byte) 1);
        int[] intArray12 = ds.MaxMin2.maxMin2(intArray10, (int) (byte) 1);
        int[] intArray14 = ds.MaxMin2.maxMin2(intArray10, 0);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray16 = ds.MaxMin2.maxMin2(intArray14, (int) (short) 100);
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
    public void test046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test046");
        int[] intArray6 = new int[] { (byte) -1, (byte) 1, ' ', (short) 10, (short) 1, (byte) 1 };
        int[] intArray8 = ds.MaxMin2.maxMin2(intArray6, (int) (byte) 0);
        int[] intArray10 = ds.MaxMin2.maxMin2(intArray6, (int) (byte) 1);
        int[] intArray12 = ds.MaxMin2.maxMin2(intArray6, (int) (short) 0);
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
    public void test047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test047");
        int[] intArray4 = new int[] { (byte) 0, 10, '#', (short) 0 };
        int[] intArray6 = ds.MaxMin2.maxMin2(intArray4, (int) (short) 1);
        int[] intArray8 = ds.MaxMin2.maxMin2(intArray6, 0);
        int[] intArray10 = ds.MaxMin2.maxMin2(intArray8, (int) (byte) -1);
        int[] intArray12 = ds.MaxMin2.maxMin2(intArray10, 0);
        int[] intArray14 = ds.MaxMin2.maxMin2(intArray12, 0);
        int[] intArray16 = ds.MaxMin2.maxMin2(intArray14, (int) (short) 1);
        int[] intArray18 = ds.MaxMin2.maxMin2(intArray14, 0);
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
    public void test048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test048");
        int[] intArray6 = new int[] { (byte) -1, (byte) 1, ' ', (short) 10, (short) 1, (byte) 1 };
        int[] intArray8 = ds.MaxMin2.maxMin2(intArray6, (int) (byte) 0);
        java.lang.Class<?> wildcardClass9 = intArray8.getClass();
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[-1, 1, 32, 10, 1, 1]");
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[-1, -1]");
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test049");
        int[] intArray4 = new int[] { (byte) 0, 10, '#', (short) 0 };
        int[] intArray6 = ds.MaxMin2.maxMin2(intArray4, (int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray8 = ds.MaxMin2.maxMin2(intArray6, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 2");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[0, 10, 35, 0]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[0, 0]");
    }

    @Test
    public void test050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test050");
        int[] intArray6 = new int[] { (byte) -1, (byte) 1, ' ', (short) 10, (short) 1, (byte) 1 };
        int[] intArray8 = ds.MaxMin2.maxMin2(intArray6, (int) (byte) 0);
        int[] intArray10 = ds.MaxMin2.maxMin2(intArray6, (int) (byte) 1);
        int[] intArray12 = ds.MaxMin2.maxMin2(intArray10, (int) (byte) 1);
        int[] intArray14 = ds.MaxMin2.maxMin2(intArray10, 0);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray16 = ds.MaxMin2.maxMin2(intArray10, (int) (short) 10);
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
    public void test051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test051");
        int[] intArray4 = new int[] { (byte) 0, 10, '#', (short) 0 };
        int[] intArray6 = ds.MaxMin2.maxMin2(intArray4, (int) (short) 1);
        int[] intArray8 = ds.MaxMin2.maxMin2(intArray6, 0);
        int[] intArray10 = ds.MaxMin2.maxMin2(intArray8, (int) (byte) -1);
        int[] intArray12 = ds.MaxMin2.maxMin2(intArray10, 0);
        int[] intArray14 = ds.MaxMin2.maxMin2(intArray12, (int) (short) 1);
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
    public void test052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test052");
        int[] intArray4 = new int[] { (byte) 0, 10, '#', (short) 0 };
        int[] intArray6 = ds.MaxMin2.maxMin2(intArray4, (int) (short) 1);
        int[] intArray8 = ds.MaxMin2.maxMin2(intArray4, (int) (short) 1);
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
    public void test053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test053");
        int[] intArray4 = new int[] { (byte) 0, 10, '#', (short) 0 };
        int[] intArray6 = ds.MaxMin2.maxMin2(intArray4, (int) (short) 1);
        int[] intArray8 = ds.MaxMin2.maxMin2(intArray4, (int) (short) 1);
        int[] intArray10 = ds.MaxMin2.maxMin2(intArray8, (int) (byte) -1);
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
    public void test054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test054");
        int[] intArray6 = new int[] { (byte) -1, (byte) 1, ' ', (short) 10, (short) 1, (byte) 1 };
        int[] intArray8 = ds.MaxMin2.maxMin2(intArray6, (int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray10 = ds.MaxMin2.maxMin2(intArray6, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 6");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[-1, 1, 32, 10, 1, 1]");
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[-1, -1]");
    }

    @Test
    public void test055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test055");
        int[] intArray4 = new int[] { (byte) 0, 10, '#', (short) 0 };
        int[] intArray6 = ds.MaxMin2.maxMin2(intArray4, (int) (short) 1);
        int[] intArray8 = ds.MaxMin2.maxMin2(intArray6, 0);
        int[] intArray10 = ds.MaxMin2.maxMin2(intArray8, (int) (byte) -1);
        int[] intArray12 = ds.MaxMin2.maxMin2(intArray10, 0);
        int[] intArray14 = ds.MaxMin2.maxMin2(intArray12, 0);
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
    public void test056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test056");
        int[] intArray6 = new int[] { (byte) -1, (byte) 1, ' ', (short) 10, (short) 1, (byte) 1 };
        int[] intArray8 = ds.MaxMin2.maxMin2(intArray6, (int) (byte) 0);
        int[] intArray10 = ds.MaxMin2.maxMin2(intArray6, (int) (short) 1);
        int[] intArray12 = ds.MaxMin2.maxMin2(intArray10, (-1));
        int[] intArray14 = ds.MaxMin2.maxMin2(intArray12, (int) (short) -1);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray16 = ds.MaxMin2.maxMin2(intArray14, (int) '4');
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
    public void test057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test057");
        int[] intArray6 = new int[] { (byte) -1, (byte) 1, ' ', (short) 10, (short) 1, (byte) 1 };
        int[] intArray8 = ds.MaxMin2.maxMin2(intArray6, (int) (byte) 0);
        int[] intArray10 = ds.MaxMin2.maxMin2(intArray6, (int) (short) 1);
        int[] intArray12 = ds.MaxMin2.maxMin2(intArray10, (-1));
        int[] intArray14 = ds.MaxMin2.maxMin2(intArray12, (int) (short) -1);
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
    public void test058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test058");
        int[] intArray6 = new int[] { (byte) -1, (byte) 1, ' ', (short) 10, (short) 1, (byte) 1 };
        int[] intArray8 = ds.MaxMin2.maxMin2(intArray6, (int) (byte) 0);
        int[] intArray10 = ds.MaxMin2.maxMin2(intArray6, (int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray12 = ds.MaxMin2.maxMin2(intArray10, 100);
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
    public void test059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test059");
        int[] intArray4 = new int[] { (byte) 0, 10, '#', (short) 0 };
        int[] intArray6 = ds.MaxMin2.maxMin2(intArray4, (int) (short) 1);
        int[] intArray8 = ds.MaxMin2.maxMin2(intArray6, 0);
        int[] intArray10 = ds.MaxMin2.maxMin2(intArray8, 0);
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
    public void test060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test060");
        int[] intArray4 = new int[] { (byte) 0, 10, '#', (short) 0 };
        int[] intArray6 = ds.MaxMin2.maxMin2(intArray4, (int) (short) 1);
        int[] intArray8 = ds.MaxMin2.maxMin2(intArray6, 0);
        int[] intArray10 = ds.MaxMin2.maxMin2(intArray8, (int) (byte) -1);
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
    public void test061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test061");
        int[] intArray6 = new int[] { (byte) -1, (byte) 1, ' ', (short) 10, (short) 1, (byte) 1 };
        int[] intArray8 = ds.MaxMin2.maxMin2(intArray6, (int) (byte) 0);
        int[] intArray10 = ds.MaxMin2.maxMin2(intArray6, (int) (short) 1);
        int[] intArray12 = ds.MaxMin2.maxMin2(intArray10, (-1));
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray14 = ds.MaxMin2.maxMin2(intArray12, 10);
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
    public void test062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test062");
        int[] intArray6 = new int[] { (byte) -1, (byte) 1, ' ', (short) 10, (short) 1, (byte) 1 };
        int[] intArray8 = ds.MaxMin2.maxMin2(intArray6, (int) (byte) 0);
        int[] intArray10 = ds.MaxMin2.maxMin2(intArray6, (int) (byte) 0);
        java.lang.Class<?> wildcardClass11 = intArray6.getClass();
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[-1, 1, 32, 10, 1, 1]");
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[-1, -1]");
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test063");
        int[] intArray4 = new int[] { (byte) 0, 10, '#', (short) 0 };
        int[] intArray6 = ds.MaxMin2.maxMin2(intArray4, (int) (short) 1);
        int[] intArray8 = ds.MaxMin2.maxMin2(intArray6, 0);
        int[] intArray10 = ds.MaxMin2.maxMin2(intArray8, (int) (byte) -1);
        int[] intArray12 = ds.MaxMin2.maxMin2(intArray10, 0);
        int[] intArray14 = ds.MaxMin2.maxMin2(intArray12, 0);
        int[] intArray16 = ds.MaxMin2.maxMin2(intArray14, (int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray18 = ds.MaxMin2.maxMin2(intArray16, (int) (short) 100);
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
    public void test064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test064");
        int[] intArray4 = new int[] { (byte) 0, 10, '#', (short) 0 };
        int[] intArray6 = ds.MaxMin2.maxMin2(intArray4, (int) (short) 1);
        int[] intArray8 = ds.MaxMin2.maxMin2(intArray6, 0);
        int[] intArray10 = ds.MaxMin2.maxMin2(intArray8, 0);
        int[] intArray12 = ds.MaxMin2.maxMin2(intArray8, 0);
        int[] intArray14 = ds.MaxMin2.maxMin2(intArray12, 0);
        int[] intArray16 = ds.MaxMin2.maxMin2(intArray14, (-1));
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
    public void test065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test065");
        int[] intArray6 = new int[] { (byte) -1, (byte) 1, ' ', (short) 10, (short) 1, (byte) 1 };
        int[] intArray8 = ds.MaxMin2.maxMin2(intArray6, (int) (byte) 0);
        int[] intArray10 = ds.MaxMin2.maxMin2(intArray6, (int) (short) 1);
        int[] intArray12 = ds.MaxMin2.maxMin2(intArray10, (-1));
        int[] intArray14 = ds.MaxMin2.maxMin2(intArray12, (int) (short) -1);
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
    public void test066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test066");
        int[] intArray4 = new int[] { (byte) 0, 10, '#', (short) 0 };
        int[] intArray6 = ds.MaxMin2.maxMin2(intArray4, (int) (short) 1);
        int[] intArray8 = ds.MaxMin2.maxMin2(intArray6, 0);
        int[] intArray10 = ds.MaxMin2.maxMin2(intArray8, (int) (byte) -1);
        int[] intArray12 = ds.MaxMin2.maxMin2(intArray10, 0);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray14 = ds.MaxMin2.maxMin2(intArray12, 10);
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
    public void test067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test067");
        int[] intArray4 = new int[] { (byte) 0, 10, '#', (short) 0 };
        int[] intArray6 = ds.MaxMin2.maxMin2(intArray4, (int) (short) 1);
        int[] intArray8 = ds.MaxMin2.maxMin2(intArray6, 0);
        int[] intArray10 = ds.MaxMin2.maxMin2(intArray8, (int) (byte) -1);
        int[] intArray12 = ds.MaxMin2.maxMin2(intArray10, 0);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray14 = ds.MaxMin2.maxMin2(intArray10, 100);
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
    public void test068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test068");
        int[] intArray4 = new int[] { (byte) 0, 10, '#', (short) 0 };
        int[] intArray6 = ds.MaxMin2.maxMin2(intArray4, (int) (short) 1);
        int[] intArray8 = ds.MaxMin2.maxMin2(intArray6, 0);
        int[] intArray10 = ds.MaxMin2.maxMin2(intArray8, (int) (byte) -1);
        int[] intArray12 = ds.MaxMin2.maxMin2(intArray10, 0);
        int[] intArray14 = ds.MaxMin2.maxMin2(intArray12, (int) (short) 0);
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
    public void test069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test069");
        int[] intArray6 = new int[] { (byte) -1, (byte) 1, ' ', (short) 10, (short) 1, (byte) 1 };
        int[] intArray8 = ds.MaxMin2.maxMin2(intArray6, (int) (byte) 0);
        int[] intArray10 = ds.MaxMin2.maxMin2(intArray8, (-1));
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray12 = ds.MaxMin2.maxMin2(intArray10, (int) '#');
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
    public void test070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test070");
        int[] intArray4 = new int[] { (byte) 0, 10, '#', (short) 0 };
        int[] intArray6 = ds.MaxMin2.maxMin2(intArray4, (int) (short) 1);
        int[] intArray8 = ds.MaxMin2.maxMin2(intArray6, 0);
        int[] intArray10 = ds.MaxMin2.maxMin2(intArray8, (int) (byte) -1);
        int[] intArray12 = ds.MaxMin2.maxMin2(intArray10, 0);
        int[] intArray14 = ds.MaxMin2.maxMin2(intArray12, 0);
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
    public void test071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test071");
        int[] intArray6 = new int[] { (byte) -1, (byte) 1, ' ', (short) 10, (short) 1, (byte) 1 };
        int[] intArray8 = ds.MaxMin2.maxMin2(intArray6, (int) (byte) 0);
        int[] intArray10 = ds.MaxMin2.maxMin2(intArray6, (int) (byte) 1);
        int[] intArray12 = ds.MaxMin2.maxMin2(intArray10, (int) (byte) 1);
        int[] intArray14 = ds.MaxMin2.maxMin2(intArray10, 0);
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
    public void test072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test072");
        int[] intArray6 = new int[] { (byte) 1, '#', (byte) 100, 0, '#', '#' };
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray8 = ds.MaxMin2.maxMin2(intArray6, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 6");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[1, 35, 100, 0, 35, 35]");
    }

    @Test
    public void test073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test073");
        int[] intArray6 = new int[] { (byte) -1, (byte) 1, ' ', (short) 10, (short) 1, (byte) 1 };
        int[] intArray8 = ds.MaxMin2.maxMin2(intArray6, (int) (byte) 0);
        int[] intArray10 = ds.MaxMin2.maxMin2(intArray6, (int) (short) 1);
        int[] intArray12 = ds.MaxMin2.maxMin2(intArray10, (-1));
        int[] intArray14 = ds.MaxMin2.maxMin2(intArray12, (int) (short) -1);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray16 = ds.MaxMin2.maxMin2(intArray12, (int) (byte) 10);
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
    public void test074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test074");
        int[] intArray4 = new int[] { (byte) 0, 10, '#', (short) 0 };
        int[] intArray6 = ds.MaxMin2.maxMin2(intArray4, (int) (short) 1);
        int[] intArray8 = ds.MaxMin2.maxMin2(intArray6, 0);
        int[] intArray10 = ds.MaxMin2.maxMin2(intArray8, (int) (byte) -1);
        int[] intArray12 = ds.MaxMin2.maxMin2(intArray10, 0);
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
    public void test075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test075");
        int[] intArray4 = new int[] { (byte) 0, 10, '#', (short) 0 };
        int[] intArray6 = ds.MaxMin2.maxMin2(intArray4, (int) (short) 1);
        int[] intArray8 = ds.MaxMin2.maxMin2(intArray6, 0);
        int[] intArray10 = ds.MaxMin2.maxMin2(intArray8, (int) (byte) -1);
        int[] intArray12 = ds.MaxMin2.maxMin2(intArray10, 0);
        int[] intArray14 = ds.MaxMin2.maxMin2(intArray12, 0);
        int[] intArray16 = ds.MaxMin2.maxMin2(intArray14, (int) (short) 1);
        int[] intArray18 = ds.MaxMin2.maxMin2(intArray14, 0);
        int[] intArray20 = ds.MaxMin2.maxMin2(intArray18, (int) (short) -1);
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
    public void test076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test076");
        int[] intArray6 = new int[] { (byte) -1, (byte) 1, ' ', (short) 10, (short) 1, (byte) 1 };
        int[] intArray8 = ds.MaxMin2.maxMin2(intArray6, (int) (byte) 0);
        int[] intArray10 = ds.MaxMin2.maxMin2(intArray6, (int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray12 = ds.MaxMin2.maxMin2(intArray6, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 6");
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
    public void test077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test077");
        int[] intArray6 = new int[] { (byte) -1, (byte) 1, ' ', (short) 10, (short) 1, (byte) 1 };
        int[] intArray8 = ds.MaxMin2.maxMin2(intArray6, (int) (byte) 0);
        int[] intArray10 = ds.MaxMin2.maxMin2(intArray6, (int) (short) 1);
        int[] intArray12 = ds.MaxMin2.maxMin2(intArray10, (-1));
        int[] intArray14 = ds.MaxMin2.maxMin2(intArray12, (int) (short) -1);
        int[] intArray16 = ds.MaxMin2.maxMin2(intArray14, (-1));
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
    public void test078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test078");
        int[] intArray6 = new int[] { (byte) -1, (byte) 1, ' ', (short) 10, (short) 1, (byte) 1 };
        int[] intArray8 = ds.MaxMin2.maxMin2(intArray6, (int) (byte) 0);
        int[] intArray10 = ds.MaxMin2.maxMin2(intArray6, (int) (short) 1);
        int[] intArray12 = ds.MaxMin2.maxMin2(intArray10, (-1));
        int[] intArray14 = ds.MaxMin2.maxMin2(intArray12, (int) (short) -1);
        int[] intArray16 = ds.MaxMin2.maxMin2(intArray14, (int) (byte) 1);
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
    public void test079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test079");
        int[] intArray6 = new int[] { (byte) -1, (byte) 1, ' ', (short) 10, (short) 1, (byte) 1 };
        int[] intArray8 = ds.MaxMin2.maxMin2(intArray6, (int) (byte) 0);
        int[] intArray10 = ds.MaxMin2.maxMin2(intArray6, (int) (short) 1);
        int[] intArray12 = ds.MaxMin2.maxMin2(intArray10, (-1));
        int[] intArray14 = ds.MaxMin2.maxMin2(intArray12, (int) (short) -1);
        int[] intArray16 = ds.MaxMin2.maxMin2(intArray14, (-1));
        int[] intArray18 = ds.MaxMin2.maxMin2(intArray14, 0);
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
    public void test080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test080");
        int[] intArray6 = new int[] { (byte) -1, (byte) 1, ' ', (short) 10, (short) 1, (byte) 1 };
        int[] intArray8 = ds.MaxMin2.maxMin2(intArray6, (int) (byte) 0);
        int[] intArray10 = ds.MaxMin2.maxMin2(intArray6, (int) (byte) 1);
        int[] intArray12 = ds.MaxMin2.maxMin2(intArray6, (int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray14 = ds.MaxMin2.maxMin2(intArray6, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 6");
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
    public void test081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test081");
        int[] intArray0 = null;
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray2 = ds.MaxMin2.maxMin2(intArray0, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test082");
        int[] intArray6 = new int[] { (byte) -1, (byte) 1, ' ', (short) 10, (short) 1, (byte) 1 };
        int[] intArray8 = ds.MaxMin2.maxMin2(intArray6, (int) (byte) 0);
        int[] intArray10 = ds.MaxMin2.maxMin2(intArray8, (-1));
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray12 = ds.MaxMin2.maxMin2(intArray8, (int) 'a');
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
    public void test083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test083");
        int[] intArray6 = new int[] { (byte) -1, (byte) 1, ' ', (short) 10, (short) 1, (byte) 1 };
        int[] intArray8 = ds.MaxMin2.maxMin2(intArray6, (int) (byte) 0);
        int[] intArray10 = ds.MaxMin2.maxMin2(intArray6, (int) (byte) 0);
        int[] intArray12 = ds.MaxMin2.maxMin2(intArray10, (int) (short) -1);
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
    public void test084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test084");
        int[] intArray6 = new int[] { (byte) -1, (byte) 1, ' ', (short) 10, (short) 1, (byte) 1 };
        int[] intArray8 = ds.MaxMin2.maxMin2(intArray6, (int) (byte) 0);
        int[] intArray10 = ds.MaxMin2.maxMin2(intArray6, (int) (short) 1);
        int[] intArray12 = ds.MaxMin2.maxMin2(intArray10, (-1));
        int[] intArray14 = ds.MaxMin2.maxMin2(intArray12, (int) (short) -1);
        int[] intArray16 = ds.MaxMin2.maxMin2(intArray14, (-1));
        int[] intArray18 = ds.MaxMin2.maxMin2(intArray14, 0);
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
    public void test085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test085");
        int[] intArray6 = new int[] { (byte) -1, (byte) 1, ' ', (short) 10, (short) 1, (byte) 1 };
        int[] intArray8 = ds.MaxMin2.maxMin2(intArray6, (int) (byte) 0);
        int[] intArray10 = ds.MaxMin2.maxMin2(intArray6, (int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray12 = ds.MaxMin2.maxMin2(intArray6, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 6");
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
    public void test086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test086");
        int[] intArray6 = new int[] { (byte) -1, (byte) 1, ' ', (short) 10, (short) 1, (byte) 1 };
        int[] intArray8 = ds.MaxMin2.maxMin2(intArray6, (int) (byte) 0);
        int[] intArray10 = ds.MaxMin2.maxMin2(intArray6, (int) (byte) 0);
        int[] intArray12 = ds.MaxMin2.maxMin2(intArray10, (int) (short) -1);
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
    public void test087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test087");
        int[] intArray4 = new int[] { (byte) 0, 10, '#', (short) 0 };
        int[] intArray6 = ds.MaxMin2.maxMin2(intArray4, (int) (short) 1);
        int[] intArray8 = ds.MaxMin2.maxMin2(intArray6, 0);
        int[] intArray10 = ds.MaxMin2.maxMin2(intArray8, 0);
        int[] intArray12 = ds.MaxMin2.maxMin2(intArray8, 0);
        int[] intArray14 = ds.MaxMin2.maxMin2(intArray12, 0);
        int[] intArray16 = ds.MaxMin2.maxMin2(intArray12, (int) (short) -1);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray18 = ds.MaxMin2.maxMin2(intArray12, (int) (byte) 10);
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
    public void test088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test088");
        int[] intArray4 = new int[] { (byte) 0, 10, '#', (short) 0 };
        int[] intArray6 = ds.MaxMin2.maxMin2(intArray4, (int) (short) 1);
        int[] intArray8 = ds.MaxMin2.maxMin2(intArray6, 0);
        int[] intArray10 = ds.MaxMin2.maxMin2(intArray8, (int) (byte) -1);
        int[] intArray12 = ds.MaxMin2.maxMin2(intArray10, 0);
        int[] intArray14 = ds.MaxMin2.maxMin2(intArray10, (int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray16 = ds.MaxMin2.maxMin2(intArray14, 10);
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
    public void test089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test089");
        int[] intArray4 = new int[] { (byte) 0, 10, '#', (short) 0 };
        int[] intArray6 = ds.MaxMin2.maxMin2(intArray4, (int) (short) 1);
        int[] intArray8 = ds.MaxMin2.maxMin2(intArray6, 0);
        int[] intArray10 = ds.MaxMin2.maxMin2(intArray8, (int) (byte) -1);
        int[] intArray12 = ds.MaxMin2.maxMin2(intArray10, 0);
        int[] intArray14 = ds.MaxMin2.maxMin2(intArray12, (int) (short) 1);
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
    public void test090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test090");
        int[] intArray4 = new int[] { (byte) 0, 10, '#', (short) 0 };
        int[] intArray6 = ds.MaxMin2.maxMin2(intArray4, (int) (short) 1);
        int[] intArray8 = ds.MaxMin2.maxMin2(intArray6, 0);
        int[] intArray10 = ds.MaxMin2.maxMin2(intArray8, (int) (byte) -1);
        int[] intArray12 = ds.MaxMin2.maxMin2(intArray10, 0);
        int[] intArray14 = ds.MaxMin2.maxMin2(intArray12, 0);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray16 = ds.MaxMin2.maxMin2(intArray12, (int) (short) 10);
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
    public void test091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test091");
        int[] intArray6 = new int[] { (byte) -1, (byte) 1, ' ', (short) 10, (short) 1, (byte) 1 };
        int[] intArray8 = ds.MaxMin2.maxMin2(intArray6, (int) (byte) 0);
        int[] intArray10 = ds.MaxMin2.maxMin2(intArray6, (int) (byte) 1);
        int[] intArray12 = ds.MaxMin2.maxMin2(intArray10, (int) (byte) 1);
        int[] intArray14 = ds.MaxMin2.maxMin2(intArray10, 0);
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
    public void test092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test092");
        int[] intArray4 = new int[] { (byte) 0, 10, '#', (short) 0 };
        int[] intArray6 = ds.MaxMin2.maxMin2(intArray4, (int) (short) 1);
        int[] intArray8 = ds.MaxMin2.maxMin2(intArray6, 0);
        int[] intArray10 = ds.MaxMin2.maxMin2(intArray8, (int) (byte) -1);
        int[] intArray12 = ds.MaxMin2.maxMin2(intArray10, 0);
        int[] intArray14 = ds.MaxMin2.maxMin2(intArray12, 0);
        int[] intArray16 = ds.MaxMin2.maxMin2(intArray14, (int) (short) 1);
        int[] intArray18 = ds.MaxMin2.maxMin2(intArray14, 0);
        int[] intArray20 = ds.MaxMin2.maxMin2(intArray14, (int) (byte) 0);
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
    public void test093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test093");
        int[] intArray4 = new int[] { (byte) 0, 10, '#', (short) 0 };
        int[] intArray6 = ds.MaxMin2.maxMin2(intArray4, (int) (short) 1);
        int[] intArray8 = ds.MaxMin2.maxMin2(intArray4, (int) (short) 1);
        int[] intArray10 = ds.MaxMin2.maxMin2(intArray8, (int) (short) 1);
        java.lang.Class<?> wildcardClass11 = intArray8.getClass();
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
    public void test094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test094");
        int[] intArray4 = new int[] { (byte) 0, 10, '#', (short) 0 };
        int[] intArray6 = ds.MaxMin2.maxMin2(intArray4, (int) (short) 1);
        int[] intArray8 = ds.MaxMin2.maxMin2(intArray6, 0);
        int[] intArray10 = ds.MaxMin2.maxMin2(intArray8, 0);
        int[] intArray12 = ds.MaxMin2.maxMin2(intArray8, 0);
        int[] intArray14 = ds.MaxMin2.maxMin2(intArray12, 0);
        int[] intArray16 = ds.MaxMin2.maxMin2(intArray14, (-1));
        int[] intArray18 = ds.MaxMin2.maxMin2(intArray16, (int) (byte) 1);
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
    public void test095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test095");
        int[] intArray4 = new int[] { (byte) 0, 10, '#', (short) 0 };
        int[] intArray6 = ds.MaxMin2.maxMin2(intArray4, (int) (short) 1);
        int[] intArray8 = ds.MaxMin2.maxMin2(intArray6, 0);
        int[] intArray10 = ds.MaxMin2.maxMin2(intArray8, 0);
        int[] intArray12 = ds.MaxMin2.maxMin2(intArray8, 0);
        int[] intArray14 = ds.MaxMin2.maxMin2(intArray12, 0);
        int[] intArray16 = ds.MaxMin2.maxMin2(intArray14, (-1));
        int[] intArray18 = ds.MaxMin2.maxMin2(intArray16, (int) (byte) 0);
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
    public void test096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test096");
        int[] intArray4 = new int[] { (byte) 0, 10, '#', (short) 0 };
        int[] intArray6 = ds.MaxMin2.maxMin2(intArray4, (int) (short) 1);
        int[] intArray8 = ds.MaxMin2.maxMin2(intArray6, 0);
        int[] intArray10 = ds.MaxMin2.maxMin2(intArray8, 0);
        int[] intArray12 = ds.MaxMin2.maxMin2(intArray8, 0);
        int[] intArray14 = ds.MaxMin2.maxMin2(intArray12, 0);
        int[] intArray16 = ds.MaxMin2.maxMin2(intArray14, (-1));
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
    public void test097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test097");
        int[] intArray6 = new int[] { (byte) -1, (byte) 1, ' ', (short) 10, (short) 1, (byte) 1 };
        int[] intArray8 = ds.MaxMin2.maxMin2(intArray6, (int) (byte) 0);
        int[] intArray10 = ds.MaxMin2.maxMin2(intArray6, (int) (byte) 1);
        int[] intArray12 = ds.MaxMin2.maxMin2(intArray6, (int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray14 = ds.MaxMin2.maxMin2(intArray12, (int) '4');
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
    public void test098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test098");
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
            int[] intArray20 = ds.MaxMin2.maxMin2(intArray12, (int) 'a');
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
    public void test099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test099");
        int[] intArray4 = new int[] { (byte) 0, 10, '#', (short) 0 };
        int[] intArray6 = ds.MaxMin2.maxMin2(intArray4, (int) (short) 1);
        int[] intArray8 = ds.MaxMin2.maxMin2(intArray6, 0);
        int[] intArray10 = ds.MaxMin2.maxMin2(intArray8, 0);
        int[] intArray12 = ds.MaxMin2.maxMin2(intArray8, 0);
        int[] intArray14 = ds.MaxMin2.maxMin2(intArray12, 0);
        int[] intArray16 = ds.MaxMin2.maxMin2(intArray12, (int) (short) -1);
        int[] intArray18 = ds.MaxMin2.maxMin2(intArray12, (int) (short) -1);
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
    public void test100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test100");
        int[] intArray4 = new int[] { (byte) 0, 10, '#', (short) 0 };
        int[] intArray6 = ds.MaxMin2.maxMin2(intArray4, (int) (short) 1);
        int[] intArray8 = ds.MaxMin2.maxMin2(intArray6, 0);
        int[] intArray10 = ds.MaxMin2.maxMin2(intArray8, 0);
        int[] intArray12 = ds.MaxMin2.maxMin2(intArray8, 0);
        int[] intArray14 = ds.MaxMin2.maxMin2(intArray12, 0);
        int[] intArray16 = ds.MaxMin2.maxMin2(intArray12, (int) (short) -1);
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
    public void test101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test101");
        int[] intArray4 = new int[] { (byte) 0, 10, '#', (short) 0 };
        int[] intArray6 = ds.MaxMin2.maxMin2(intArray4, (int) (short) 1);
        int[] intArray8 = ds.MaxMin2.maxMin2(intArray6, 0);
        int[] intArray10 = ds.MaxMin2.maxMin2(intArray8, 0);
        int[] intArray12 = ds.MaxMin2.maxMin2(intArray8, 0);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray14 = ds.MaxMin2.maxMin2(intArray12, (int) (byte) 10);
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
    public void test102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test102");
        int[] intArray4 = new int[] { (byte) 0, 10, '#', (short) 0 };
        int[] intArray6 = ds.MaxMin2.maxMin2(intArray4, (int) (short) 1);
        int[] intArray8 = ds.MaxMin2.maxMin2(intArray6, 0);
        int[] intArray10 = ds.MaxMin2.maxMin2(intArray8, 0);
        int[] intArray12 = ds.MaxMin2.maxMin2(intArray8, 0);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray14 = ds.MaxMin2.maxMin2(intArray12, (int) '#');
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
    public void test103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test103");
        int[] intArray4 = new int[] { (byte) 0, 10, '#', (short) 0 };
        int[] intArray6 = ds.MaxMin2.maxMin2(intArray4, (int) (short) 1);
        int[] intArray8 = ds.MaxMin2.maxMin2(intArray6, 0);
        int[] intArray10 = ds.MaxMin2.maxMin2(intArray8, (int) (byte) -1);
        int[] intArray12 = ds.MaxMin2.maxMin2(intArray10, 0);
        int[] intArray14 = ds.MaxMin2.maxMin2(intArray12, 0);
        int[] intArray16 = ds.MaxMin2.maxMin2(intArray14, (int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray18 = ds.MaxMin2.maxMin2(intArray14, (int) 'a');
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
    public void test104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test104");
        int[] intArray6 = new int[] { (byte) -1, (byte) 1, ' ', (short) 10, (short) 1, (byte) 1 };
        int[] intArray8 = ds.MaxMin2.maxMin2(intArray6, (int) (byte) 0);
        int[] intArray10 = ds.MaxMin2.maxMin2(intArray8, (-1));
        int[] intArray12 = ds.MaxMin2.maxMin2(intArray10, (int) (byte) -1);
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
    public void test105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test105");
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
            int[] intArray22 = ds.MaxMin2.maxMin2(intArray20, (int) (byte) 10);
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
    public void test106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test106");
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
    public void test107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test107");
        int[] intArray4 = new int[] { (byte) 0, 10, '#', (short) 0 };
        int[] intArray6 = ds.MaxMin2.maxMin2(intArray4, (int) (short) 1);
        int[] intArray8 = ds.MaxMin2.maxMin2(intArray4, (int) (short) 1);
        int[] intArray10 = ds.MaxMin2.maxMin2(intArray8, (int) (short) 1);
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
    public void test108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test108");
        int[] intArray0 = null;
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray2 = ds.MaxMin2.maxMin2(intArray0, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test109");
        int[] intArray6 = new int[] { (byte) -1, (byte) 1, ' ', (short) 10, (short) 1, (byte) 1 };
        int[] intArray8 = ds.MaxMin2.maxMin2(intArray6, (int) (byte) 0);
        int[] intArray10 = ds.MaxMin2.maxMin2(intArray6, (int) (short) 1);
        int[] intArray12 = ds.MaxMin2.maxMin2(intArray10, (-1));
        int[] intArray14 = ds.MaxMin2.maxMin2(intArray12, (int) (byte) -1);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray16 = ds.MaxMin2.maxMin2(intArray14, (int) '#');
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
    public void test110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test110");
        int[] intArray4 = new int[] { (byte) 0, 10, '#', (short) 0 };
        int[] intArray6 = ds.MaxMin2.maxMin2(intArray4, (int) (short) 1);
        int[] intArray8 = ds.MaxMin2.maxMin2(intArray6, 0);
        int[] intArray10 = ds.MaxMin2.maxMin2(intArray8, (int) (byte) -1);
        int[] intArray12 = ds.MaxMin2.maxMin2(intArray10, 0);
        int[] intArray14 = ds.MaxMin2.maxMin2(intArray12, (int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray16 = ds.MaxMin2.maxMin2(intArray14, (int) (byte) 100);
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
    public void test111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test111");
        int[] intArray4 = new int[] { (byte) 0, 10, '#', (short) 0 };
        int[] intArray6 = ds.MaxMin2.maxMin2(intArray4, (int) (short) 1);
        int[] intArray8 = ds.MaxMin2.maxMin2(intArray6, 0);
        int[] intArray10 = ds.MaxMin2.maxMin2(intArray8, 0);
        int[] intArray12 = ds.MaxMin2.maxMin2(intArray8, 0);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray14 = ds.MaxMin2.maxMin2(intArray12, (int) '4');
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
    public void test112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test112");
        int[] intArray4 = new int[] { (byte) 0, 10, '#', (short) 0 };
        int[] intArray6 = ds.MaxMin2.maxMin2(intArray4, (int) (short) 1);
        int[] intArray8 = ds.MaxMin2.maxMin2(intArray6, 0);
        int[] intArray10 = ds.MaxMin2.maxMin2(intArray8, (int) (byte) -1);
        int[] intArray12 = ds.MaxMin2.maxMin2(intArray10, 0);
        int[] intArray14 = ds.MaxMin2.maxMin2(intArray12, 0);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray16 = ds.MaxMin2.maxMin2(intArray14, 10);
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
    public void test113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test113");
        int[] intArray6 = new int[] { (byte) -1, (byte) 1, ' ', (short) 10, (short) 1, (byte) 1 };
        int[] intArray8 = ds.MaxMin2.maxMin2(intArray6, (int) (byte) 0);
        int[] intArray10 = ds.MaxMin2.maxMin2(intArray6, (int) (short) 1);
        int[] intArray12 = ds.MaxMin2.maxMin2(intArray10, (-1));
        int[] intArray14 = ds.MaxMin2.maxMin2(intArray10, (int) (byte) 0);
        int[] intArray16 = ds.MaxMin2.maxMin2(intArray10, 1);
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
    public void test114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test114");
        int[] intArray6 = new int[] { (byte) -1, (byte) 1, ' ', (short) 10, (short) 1, (byte) 1 };
        int[] intArray8 = ds.MaxMin2.maxMin2(intArray6, (int) (byte) 0);
        int[] intArray10 = ds.MaxMin2.maxMin2(intArray6, (int) (byte) 0);
        int[] intArray12 = ds.MaxMin2.maxMin2(intArray10, (int) (short) -1);
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
    public void test115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test115");
        int[] intArray4 = new int[] { (byte) 0, 10, '#', (short) 0 };
        int[] intArray6 = ds.MaxMin2.maxMin2(intArray4, (int) (short) 1);
        int[] intArray8 = ds.MaxMin2.maxMin2(intArray6, 0);
        int[] intArray10 = ds.MaxMin2.maxMin2(intArray8, (int) (byte) -1);
        int[] intArray12 = ds.MaxMin2.maxMin2(intArray10, 0);
        int[] intArray14 = ds.MaxMin2.maxMin2(intArray12, 0);
        int[] intArray16 = ds.MaxMin2.maxMin2(intArray14, (int) (short) 1);
        int[] intArray18 = ds.MaxMin2.maxMin2(intArray14, 0);
        int[] intArray20 = ds.MaxMin2.maxMin2(intArray14, (int) (byte) 0);
        java.lang.Class<?> wildcardClass21 = intArray14.getClass();
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
    public void test116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test116");
        int[] intArray4 = new int[] { (byte) 0, 10, '#', (short) 0 };
        int[] intArray6 = ds.MaxMin2.maxMin2(intArray4, (int) (short) 1);
        int[] intArray8 = ds.MaxMin2.maxMin2(intArray6, 0);
        int[] intArray10 = ds.MaxMin2.maxMin2(intArray8, 0);
        int[] intArray12 = ds.MaxMin2.maxMin2(intArray8, 0);
        int[] intArray14 = ds.MaxMin2.maxMin2(intArray12, 0);
        int[] intArray16 = ds.MaxMin2.maxMin2(intArray12, (int) (short) -1);
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
    public void test117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test117");
        int[] intArray6 = new int[] { (byte) -1, (byte) 1, ' ', (short) 10, (short) 1, (byte) 1 };
        int[] intArray8 = ds.MaxMin2.maxMin2(intArray6, (int) (byte) 0);
        int[] intArray10 = ds.MaxMin2.maxMin2(intArray8, (-1));
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
    public void test118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test118");
        int[] intArray4 = new int[] { (byte) 0, 10, '#', (short) 0 };
        int[] intArray6 = ds.MaxMin2.maxMin2(intArray4, (int) (short) 1);
        int[] intArray8 = ds.MaxMin2.maxMin2(intArray6, 0);
        int[] intArray10 = ds.MaxMin2.maxMin2(intArray8, 0);
        int[] intArray12 = ds.MaxMin2.maxMin2(intArray8, 0);
        int[] intArray14 = ds.MaxMin2.maxMin2(intArray12, 0);
        int[] intArray16 = ds.MaxMin2.maxMin2(intArray14, (-1));
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
    public void test119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test119");
        int[] intArray4 = new int[] { (byte) 0, 10, '#', (short) 0 };
        int[] intArray6 = ds.MaxMin2.maxMin2(intArray4, (int) (short) 1);
        int[] intArray8 = ds.MaxMin2.maxMin2(intArray6, 0);
        int[] intArray10 = ds.MaxMin2.maxMin2(intArray8, 0);
        int[] intArray12 = ds.MaxMin2.maxMin2(intArray8, 0);
        int[] intArray14 = ds.MaxMin2.maxMin2(intArray12, 0);
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
    public void test120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test120");
        int[] intArray4 = new int[] { (byte) 0, 10, '#', (short) 0 };
        int[] intArray6 = ds.MaxMin2.maxMin2(intArray4, (int) (short) 1);
        int[] intArray8 = ds.MaxMin2.maxMin2(intArray6, 0);
        int[] intArray10 = ds.MaxMin2.maxMin2(intArray8, (int) (byte) -1);
        int[] intArray12 = ds.MaxMin2.maxMin2(intArray10, 0);
        int[] intArray14 = ds.MaxMin2.maxMin2(intArray12, (int) (short) 0);
        int[] intArray16 = ds.MaxMin2.maxMin2(intArray14, (int) (short) 0);
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
    public void test121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test121");
        int[] intArray4 = new int[] { (byte) 0, 10, '#', (short) 0 };
        int[] intArray6 = ds.MaxMin2.maxMin2(intArray4, (int) (short) 1);
        int[] intArray8 = ds.MaxMin2.maxMin2(intArray6, 0);
        int[] intArray10 = ds.MaxMin2.maxMin2(intArray8, (int) (byte) -1);
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
    public void test122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test122");
        int[] intArray6 = new int[] { (byte) -1, (byte) 1, ' ', (short) 10, (short) 1, (byte) 1 };
        int[] intArray8 = ds.MaxMin2.maxMin2(intArray6, (int) (byte) 0);
        int[] intArray10 = ds.MaxMin2.maxMin2(intArray6, (int) (short) 1);
        int[] intArray12 = ds.MaxMin2.maxMin2(intArray10, (-1));
        int[] intArray14 = ds.MaxMin2.maxMin2(intArray12, (int) (short) -1);
        int[] intArray16 = ds.MaxMin2.maxMin2(intArray14, (-1));
        int[] intArray18 = ds.MaxMin2.maxMin2(intArray16, (int) (short) 1);
        int[] intArray20 = ds.MaxMin2.maxMin2(intArray16, (int) (short) 0);
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
    public void test123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test123");
        int[] intArray6 = new int[] { (byte) -1, (byte) 1, ' ', (short) 10, (short) 1, (byte) 1 };
        int[] intArray8 = ds.MaxMin2.maxMin2(intArray6, (int) (byte) 0);
        int[] intArray10 = ds.MaxMin2.maxMin2(intArray8, (-1));
        java.lang.Class<?> wildcardClass11 = intArray10.getClass();
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[-1, 1, 32, 10, 1, 1]");
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[-1, -1]");
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test124");
        int[] intArray6 = new int[] { (byte) -1, (byte) 1, ' ', (short) 10, (short) 1, (byte) 1 };
        int[] intArray8 = ds.MaxMin2.maxMin2(intArray6, (int) (byte) 0);
        int[] intArray10 = ds.MaxMin2.maxMin2(intArray6, (int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray12 = ds.MaxMin2.maxMin2(intArray10, 10);
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
    public void test125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test125");
        int[] intArray6 = new int[] { (byte) -1, (byte) 1, ' ', (short) 10, (short) 1, (byte) 1 };
        int[] intArray8 = ds.MaxMin2.maxMin2(intArray6, (int) (byte) 0);
        int[] intArray10 = ds.MaxMin2.maxMin2(intArray6, (int) (short) 1);
        int[] intArray12 = ds.MaxMin2.maxMin2(intArray10, (-1));
        int[] intArray14 = ds.MaxMin2.maxMin2(intArray10, (int) (byte) 0);
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
    public void test126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test126");
        int[] intArray6 = new int[] { (byte) -1, (byte) 1, ' ', (short) 10, (short) 1, (byte) 1 };
        int[] intArray8 = ds.MaxMin2.maxMin2(intArray6, (int) (byte) 0);
        int[] intArray10 = ds.MaxMin2.maxMin2(intArray6, (int) (short) 1);
        int[] intArray12 = ds.MaxMin2.maxMin2(intArray10, (-1));
        int[] intArray14 = ds.MaxMin2.maxMin2(intArray10, (int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray16 = ds.MaxMin2.maxMin2(intArray14, (int) (short) 100);
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
    public void test127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test127");
        int[] intArray6 = new int[] { (byte) -1, (byte) 1, ' ', (short) 10, (short) 1, (byte) 1 };
        int[] intArray8 = ds.MaxMin2.maxMin2(intArray6, (int) (byte) 0);
        int[] intArray10 = ds.MaxMin2.maxMin2(intArray6, (int) (short) 1);
        int[] intArray12 = ds.MaxMin2.maxMin2(intArray10, (-1));
        int[] intArray14 = ds.MaxMin2.maxMin2(intArray12, (int) (short) -1);
        int[] intArray16 = ds.MaxMin2.maxMin2(intArray14, (-1));
        int[] intArray18 = ds.MaxMin2.maxMin2(intArray14, 0);
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
    public void test128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test128");
        int[] intArray6 = new int[] { (byte) -1, (byte) 1, ' ', (short) 10, (short) 1, (byte) 1 };
        int[] intArray8 = ds.MaxMin2.maxMin2(intArray6, (int) (byte) 0);
        int[] intArray10 = ds.MaxMin2.maxMin2(intArray6, (int) (byte) 0);
        int[] intArray12 = ds.MaxMin2.maxMin2(intArray10, (int) (short) 0);
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
    public void test129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test129");
        int[] intArray6 = new int[] { (byte) -1, (byte) 1, ' ', (short) 10, (short) 1, (byte) 1 };
        int[] intArray8 = ds.MaxMin2.maxMin2(intArray6, (int) (byte) 0);
        int[] intArray10 = ds.MaxMin2.maxMin2(intArray6, (int) (short) 1);
        int[] intArray12 = ds.MaxMin2.maxMin2(intArray10, (-1));
        int[] intArray14 = ds.MaxMin2.maxMin2(intArray10, (int) (byte) 0);
        int[] intArray16 = ds.MaxMin2.maxMin2(intArray10, 1);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray18 = ds.MaxMin2.maxMin2(intArray16, (int) (byte) 10);
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
    public void test130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test130");
        int[] intArray6 = new int[] { (byte) -1, (byte) 1, ' ', (short) 10, (short) 1, (byte) 1 };
        int[] intArray8 = ds.MaxMin2.maxMin2(intArray6, (int) (byte) 0);
        int[] intArray10 = ds.MaxMin2.maxMin2(intArray6, (int) (short) 1);
        int[] intArray12 = ds.MaxMin2.maxMin2(intArray10, (-1));
        int[] intArray14 = ds.MaxMin2.maxMin2(intArray12, (int) (short) -1);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray16 = ds.MaxMin2.maxMin2(intArray12, (int) ' ');
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
    public void test131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test131");
        int[] intArray4 = new int[] { (byte) 0, 10, '#', (short) 0 };
        int[] intArray6 = ds.MaxMin2.maxMin2(intArray4, (int) (short) 1);
        int[] intArray8 = ds.MaxMin2.maxMin2(intArray6, 0);
        int[] intArray10 = ds.MaxMin2.maxMin2(intArray8, (int) (byte) -1);
        int[] intArray12 = ds.MaxMin2.maxMin2(intArray10, 0);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray14 = ds.MaxMin2.maxMin2(intArray12, (int) ' ');
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
    public void test132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test132");
        int[] intArray6 = new int[] { (byte) -1, (byte) 1, ' ', (short) 10, (short) 1, (byte) 1 };
        int[] intArray8 = ds.MaxMin2.maxMin2(intArray6, (int) (byte) 0);
        int[] intArray10 = ds.MaxMin2.maxMin2(intArray6, (int) (byte) 0);
        int[] intArray12 = ds.MaxMin2.maxMin2(intArray10, (int) (short) 0);
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
    public void test133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test133");
        int[] intArray4 = new int[] { (byte) 0, 10, '#', (short) 0 };
        int[] intArray6 = ds.MaxMin2.maxMin2(intArray4, (int) (short) 1);
        int[] intArray8 = ds.MaxMin2.maxMin2(intArray6, 0);
        int[] intArray10 = ds.MaxMin2.maxMin2(intArray8, 0);
        int[] intArray12 = ds.MaxMin2.maxMin2(intArray8, 0);
        int[] intArray14 = ds.MaxMin2.maxMin2(intArray12, 0);
        int[] intArray16 = ds.MaxMin2.maxMin2(intArray14, (-1));
        int[] intArray18 = ds.MaxMin2.maxMin2(intArray16, (int) (byte) 0);
        int[] intArray20 = ds.MaxMin2.maxMin2(intArray18, (int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray22 = ds.MaxMin2.maxMin2(intArray20, (int) (byte) 10);
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
    public void test134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test134");
        int[] intArray6 = new int[] { (byte) -1, (byte) 1, ' ', (short) 10, (short) 1, (byte) 1 };
        int[] intArray8 = ds.MaxMin2.maxMin2(intArray6, (int) (byte) 0);
        int[] intArray10 = ds.MaxMin2.maxMin2(intArray6, (int) (byte) 0);
        int[] intArray12 = ds.MaxMin2.maxMin2(intArray10, (int) (short) 0);
        int[] intArray14 = ds.MaxMin2.maxMin2(intArray10, (int) (short) -1);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray16 = ds.MaxMin2.maxMin2(intArray14, (int) '4');
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
    public void test135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test135");
        int[] intArray4 = new int[] { (byte) 0, 10, '#', (short) 0 };
        int[] intArray6 = ds.MaxMin2.maxMin2(intArray4, (int) (short) 1);
        int[] intArray8 = ds.MaxMin2.maxMin2(intArray4, (int) (short) 1);
        int[] intArray10 = ds.MaxMin2.maxMin2(intArray8, (int) (short) 1);
        int[] intArray12 = ds.MaxMin2.maxMin2(intArray8, (-1));
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
    public void test136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test136");
        int[] intArray6 = new int[] { (byte) -1, (byte) 1, ' ', (short) 10, (short) 1, (byte) 1 };
        int[] intArray8 = ds.MaxMin2.maxMin2(intArray6, (int) (byte) 0);
        int[] intArray10 = ds.MaxMin2.maxMin2(intArray6, (int) (short) 1);
        int[] intArray12 = ds.MaxMin2.maxMin2(intArray10, (-1));
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray14 = ds.MaxMin2.maxMin2(intArray10, (int) (short) 100);
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
    public void test137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test137");
        int[] intArray6 = new int[] { (byte) -1, (byte) 1, ' ', (short) 10, (short) 1, (byte) 1 };
        int[] intArray8 = ds.MaxMin2.maxMin2(intArray6, (int) (byte) 0);
        int[] intArray10 = ds.MaxMin2.maxMin2(intArray6, (int) (short) 1);
        int[] intArray12 = ds.MaxMin2.maxMin2(intArray10, (-1));
        int[] intArray14 = ds.MaxMin2.maxMin2(intArray12, (int) (short) -1);
        int[] intArray16 = ds.MaxMin2.maxMin2(intArray14, (-1));
        int[] intArray18 = ds.MaxMin2.maxMin2(intArray14, 0);
        int[] intArray20 = ds.MaxMin2.maxMin2(intArray18, 0);
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
    public void test138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test138");
        int[] intArray4 = new int[] { (byte) 0, 10, '#', (short) 0 };
        int[] intArray6 = ds.MaxMin2.maxMin2(intArray4, (int) (short) 1);
        int[] intArray8 = ds.MaxMin2.maxMin2(intArray4, (int) (short) 1);
        int[] intArray10 = ds.MaxMin2.maxMin2(intArray8, (int) (short) 1);
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
    public void test139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test139");
        int[] intArray4 = new int[] { (byte) 0, 10, '#', (short) 0 };
        int[] intArray6 = ds.MaxMin2.maxMin2(intArray4, (int) (short) 1);
        int[] intArray8 = ds.MaxMin2.maxMin2(intArray6, 0);
        int[] intArray10 = ds.MaxMin2.maxMin2(intArray8, (int) (byte) -1);
        int[] intArray12 = ds.MaxMin2.maxMin2(intArray10, 0);
        int[] intArray14 = ds.MaxMin2.maxMin2(intArray12, 0);
        int[] intArray16 = ds.MaxMin2.maxMin2(intArray14, (int) (short) 1);
        int[] intArray18 = ds.MaxMin2.maxMin2(intArray14, 0);
        int[] intArray20 = ds.MaxMin2.maxMin2(intArray18, (int) (short) -1);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray22 = ds.MaxMin2.maxMin2(intArray20, 100);
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
    public void test140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test140");
        int[] intArray4 = new int[] { (byte) 0, 10, '#', (short) 0 };
        int[] intArray6 = ds.MaxMin2.maxMin2(intArray4, (int) (short) 1);
        int[] intArray8 = ds.MaxMin2.maxMin2(intArray6, 0);
        int[] intArray10 = ds.MaxMin2.maxMin2(intArray8, (int) (byte) -1);
        int[] intArray12 = ds.MaxMin2.maxMin2(intArray10, 0);
        int[] intArray14 = ds.MaxMin2.maxMin2(intArray12, (int) (short) 1);
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
    public void test141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test141");
        int[] intArray4 = new int[] { (byte) 0, 10, '#', (short) 0 };
        int[] intArray6 = ds.MaxMin2.maxMin2(intArray4, (int) (short) 1);
        int[] intArray8 = ds.MaxMin2.maxMin2(intArray6, 0);
        int[] intArray10 = ds.MaxMin2.maxMin2(intArray8, (int) (byte) -1);
        int[] intArray12 = ds.MaxMin2.maxMin2(intArray10, 0);
        int[] intArray14 = ds.MaxMin2.maxMin2(intArray12, (int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray16 = ds.MaxMin2.maxMin2(intArray12, (int) (byte) 10);
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
    public void test142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test142");
        int[] intArray6 = new int[] { (byte) -1, (byte) 1, ' ', (short) 10, (short) 1, (byte) 1 };
        int[] intArray8 = ds.MaxMin2.maxMin2(intArray6, (int) (byte) 0);
        int[] intArray10 = ds.MaxMin2.maxMin2(intArray6, (int) (byte) 0);
        int[] intArray12 = ds.MaxMin2.maxMin2(intArray10, (int) (short) 0);
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
    public void test143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test143");
        int[] intArray4 = new int[] { (byte) 0, 10, '#', (short) 0 };
        int[] intArray6 = ds.MaxMin2.maxMin2(intArray4, (int) (short) 1);
        int[] intArray8 = ds.MaxMin2.maxMin2(intArray6, 0);
        int[] intArray10 = ds.MaxMin2.maxMin2(intArray8, (int) (byte) -1);
        int[] intArray12 = ds.MaxMin2.maxMin2(intArray10, 0);
        int[] intArray14 = ds.MaxMin2.maxMin2(intArray10, (int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray16 = ds.MaxMin2.maxMin2(intArray14, (int) '4');
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
    public void test144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test144");
        int[] intArray6 = new int[] { (byte) -1, (byte) 1, ' ', (short) 10, (short) 1, (byte) 1 };
        int[] intArray8 = ds.MaxMin2.maxMin2(intArray6, (int) (byte) 0);
        int[] intArray10 = ds.MaxMin2.maxMin2(intArray6, (int) (short) 1);
        int[] intArray12 = ds.MaxMin2.maxMin2(intArray10, (-1));
        int[] intArray14 = ds.MaxMin2.maxMin2(intArray10, (int) (byte) 0);
        int[] intArray16 = ds.MaxMin2.maxMin2(intArray10, 1);
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
    public void test145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test145");
        int[] intArray4 = new int[] { (byte) 0, 10, '#', (short) 0 };
        int[] intArray6 = ds.MaxMin2.maxMin2(intArray4, (int) (short) 1);
        int[] intArray8 = ds.MaxMin2.maxMin2(intArray6, 0);
        int[] intArray10 = ds.MaxMin2.maxMin2(intArray8, (int) (byte) -1);
        int[] intArray12 = ds.MaxMin2.maxMin2(intArray10, 0);
        int[] intArray14 = ds.MaxMin2.maxMin2(intArray12, 0);
        int[] intArray16 = ds.MaxMin2.maxMin2(intArray14, (int) (short) 1);
        int[] intArray18 = ds.MaxMin2.maxMin2(intArray14, 0);
        int[] intArray20 = ds.MaxMin2.maxMin2(intArray14, (int) (short) 0);
        java.lang.Class<?> wildcardClass21 = intArray14.getClass();
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
    public void test146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test146");
        int[] intArray4 = new int[] { (byte) 0, 10, '#', (short) 0 };
        int[] intArray6 = ds.MaxMin2.maxMin2(intArray4, (int) (short) 1);
        int[] intArray8 = ds.MaxMin2.maxMin2(intArray6, 0);
        int[] intArray10 = ds.MaxMin2.maxMin2(intArray8, 0);
        int[] intArray12 = ds.MaxMin2.maxMin2(intArray8, 0);
        int[] intArray14 = ds.MaxMin2.maxMin2(intArray12, (int) (byte) 0);
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
    public void test147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test147");
        int[] intArray4 = new int[] { (byte) 0, 10, '#', (short) 0 };
        int[] intArray6 = ds.MaxMin2.maxMin2(intArray4, (int) (short) 1);
        int[] intArray8 = ds.MaxMin2.maxMin2(intArray6, 0);
        int[] intArray10 = ds.MaxMin2.maxMin2(intArray8, (int) (byte) -1);
        int[] intArray12 = ds.MaxMin2.maxMin2(intArray10, 0);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray14 = ds.MaxMin2.maxMin2(intArray12, 100);
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
    public void test148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test148");
        int[] intArray4 = new int[] { (byte) 0, 10, '#', (short) 0 };
        int[] intArray6 = ds.MaxMin2.maxMin2(intArray4, (int) (short) 1);
        int[] intArray8 = ds.MaxMin2.maxMin2(intArray6, 0);
        int[] intArray10 = ds.MaxMin2.maxMin2(intArray8, 0);
        int[] intArray12 = ds.MaxMin2.maxMin2(intArray8, 0);
        int[] intArray14 = ds.MaxMin2.maxMin2(intArray12, 0);
        int[] intArray16 = ds.MaxMin2.maxMin2(intArray14, (-1));
        int[] intArray18 = ds.MaxMin2.maxMin2(intArray16, (int) (byte) 0);
        int[] intArray20 = ds.MaxMin2.maxMin2(intArray18, (int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray22 = ds.MaxMin2.maxMin2(intArray18, (int) '4');
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
    public void test149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test149");
        int[] intArray6 = new int[] { (byte) -1, (byte) 1, ' ', (short) 10, (short) 1, (byte) 1 };
        int[] intArray8 = ds.MaxMin2.maxMin2(intArray6, (int) (byte) 0);
        int[] intArray10 = ds.MaxMin2.maxMin2(intArray6, (int) (byte) 1);
        int[] intArray12 = ds.MaxMin2.maxMin2(intArray10, (int) (byte) 1);
        int[] intArray14 = ds.MaxMin2.maxMin2(intArray10, (int) (byte) 1);
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
    public void test150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test150");
        int[] intArray6 = new int[] { (byte) -1, (byte) 1, ' ', (short) 10, (short) 1, (byte) 1 };
        int[] intArray8 = ds.MaxMin2.maxMin2(intArray6, (int) (byte) 0);
        int[] intArray10 = ds.MaxMin2.maxMin2(intArray6, (int) (short) 1);
        int[] intArray12 = ds.MaxMin2.maxMin2(intArray10, (-1));
        int[] intArray14 = ds.MaxMin2.maxMin2(intArray12, (int) (short) -1);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray16 = ds.MaxMin2.maxMin2(intArray14, 100);
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
    public void test151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test151");
        int[] intArray6 = new int[] { (byte) -1, (byte) 1, ' ', (short) 10, (short) 1, (byte) 1 };
        int[] intArray8 = ds.MaxMin2.maxMin2(intArray6, (int) (byte) 0);
        int[] intArray10 = ds.MaxMin2.maxMin2(intArray6, (int) (short) 1);
        int[] intArray12 = ds.MaxMin2.maxMin2(intArray10, (-1));
        int[] intArray14 = ds.MaxMin2.maxMin2(intArray12, (int) (short) -1);
        int[] intArray16 = ds.MaxMin2.maxMin2(intArray14, (int) (byte) 1);
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
    public void test152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test152");
        int[] intArray4 = new int[] { (byte) 0, 10, '#', (short) 0 };
        int[] intArray6 = ds.MaxMin2.maxMin2(intArray4, (int) (short) 1);
        int[] intArray8 = ds.MaxMin2.maxMin2(intArray6, 0);
        int[] intArray10 = ds.MaxMin2.maxMin2(intArray8, (int) (byte) -1);
        int[] intArray12 = ds.MaxMin2.maxMin2(intArray10, 0);
        int[] intArray14 = ds.MaxMin2.maxMin2(intArray12, 0);
        int[] intArray16 = ds.MaxMin2.maxMin2(intArray14, (int) (short) 1);
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
    public void test153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test153");
        int[] intArray6 = new int[] { (byte) -1, (byte) 1, ' ', (short) 10, (short) 1, (byte) 1 };
        int[] intArray8 = ds.MaxMin2.maxMin2(intArray6, (int) (byte) 0);
        int[] intArray10 = ds.MaxMin2.maxMin2(intArray6, (int) (byte) 1);
        int[] intArray12 = ds.MaxMin2.maxMin2(intArray10, (int) (byte) 1);
        int[] intArray14 = ds.MaxMin2.maxMin2(intArray10, (int) (byte) 1);
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
    public void test154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test154");
        int[] intArray4 = new int[] { (byte) 0, 10, '#', (short) 0 };
        int[] intArray6 = ds.MaxMin2.maxMin2(intArray4, (int) (short) 1);
        int[] intArray8 = ds.MaxMin2.maxMin2(intArray4, (int) (short) 1);
        int[] intArray10 = ds.MaxMin2.maxMin2(intArray8, (int) (byte) -1);
        int[] intArray12 = ds.MaxMin2.maxMin2(intArray10, 1);
        int[] intArray14 = ds.MaxMin2.maxMin2(intArray10, 1);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray16 = ds.MaxMin2.maxMin2(intArray14, (int) 'a');
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
    public void test155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test155");
        int[] intArray6 = new int[] { (byte) -1, (byte) 1, ' ', (short) 10, (short) 1, (byte) 1 };
        int[] intArray8 = ds.MaxMin2.maxMin2(intArray6, (int) (byte) 0);
        int[] intArray10 = ds.MaxMin2.maxMin2(intArray6, (int) (short) 1);
        int[] intArray12 = ds.MaxMin2.maxMin2(intArray10, (-1));
        int[] intArray14 = ds.MaxMin2.maxMin2(intArray12, (int) (short) -1);
        int[] intArray16 = ds.MaxMin2.maxMin2(intArray14, (-1));
        int[] intArray18 = ds.MaxMin2.maxMin2(intArray16, (int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray20 = ds.MaxMin2.maxMin2(intArray16, (int) '4');
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
    public void test156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test156");
        int[] intArray4 = new int[] { (byte) 0, 10, '#', (short) 0 };
        int[] intArray6 = ds.MaxMin2.maxMin2(intArray4, (int) (short) 1);
        int[] intArray8 = ds.MaxMin2.maxMin2(intArray6, 0);
        int[] intArray10 = ds.MaxMin2.maxMin2(intArray8, (int) (byte) -1);
        int[] intArray12 = ds.MaxMin2.maxMin2(intArray10, 0);
        int[] intArray14 = ds.MaxMin2.maxMin2(intArray12, 0);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray16 = ds.MaxMin2.maxMin2(intArray12, 10);
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
    public void test157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test157");
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
            int[] intArray20 = ds.MaxMin2.maxMin2(intArray18, 10);
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
    public void test158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test158");
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
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray24 = ds.MaxMin2.maxMin2(intArray22, (int) (byte) 100);
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
    public void test159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test159");
        int[] intArray4 = new int[] { (byte) 0, 10, '#', (short) 0 };
        int[] intArray6 = ds.MaxMin2.maxMin2(intArray4, (int) (short) 1);
        int[] intArray8 = ds.MaxMin2.maxMin2(intArray4, 0);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray10 = ds.MaxMin2.maxMin2(intArray4, (int) (byte) 10);
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
    public void test160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test160");
        int[] intArray6 = new int[] { (byte) -1, (byte) 1, ' ', (short) 10, (short) 1, (byte) 1 };
        int[] intArray8 = ds.MaxMin2.maxMin2(intArray6, (int) (byte) 0);
        int[] intArray10 = ds.MaxMin2.maxMin2(intArray8, (-1));
        int[] intArray12 = ds.MaxMin2.maxMin2(intArray10, (int) (byte) -1);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray14 = ds.MaxMin2.maxMin2(intArray12, (int) '#');
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
    public void test161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test161");
        int[] intArray4 = new int[] { (byte) 0, 10, '#', (short) 0 };
        int[] intArray6 = ds.MaxMin2.maxMin2(intArray4, (int) (short) 1);
        int[] intArray8 = ds.MaxMin2.maxMin2(intArray6, 0);
        int[] intArray10 = ds.MaxMin2.maxMin2(intArray8, 0);
        int[] intArray12 = ds.MaxMin2.maxMin2(intArray8, 0);
        int[] intArray14 = ds.MaxMin2.maxMin2(intArray12, 0);
        int[] intArray16 = ds.MaxMin2.maxMin2(intArray14, (-1));
        int[] intArray18 = ds.MaxMin2.maxMin2(intArray16, (int) (byte) 0);
        int[] intArray20 = ds.MaxMin2.maxMin2(intArray18, (int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray22 = ds.MaxMin2.maxMin2(intArray20, (int) 'a');
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
    public void test162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test162");
        int[] intArray4 = new int[] { (byte) 0, 10, '#', (short) 0 };
        int[] intArray6 = ds.MaxMin2.maxMin2(intArray4, (int) (short) 1);
        int[] intArray8 = ds.MaxMin2.maxMin2(intArray6, 0);
        int[] intArray10 = ds.MaxMin2.maxMin2(intArray8, (int) (byte) -1);
        int[] intArray12 = ds.MaxMin2.maxMin2(intArray10, 0);
        int[] intArray14 = ds.MaxMin2.maxMin2(intArray12, 0);
        int[] intArray16 = ds.MaxMin2.maxMin2(intArray14, (int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray18 = ds.MaxMin2.maxMin2(intArray14, (int) (byte) 100);
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
    public void test163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test163");
        int[] intArray4 = new int[] { (byte) 0, 10, '#', (short) 0 };
        int[] intArray6 = ds.MaxMin2.maxMin2(intArray4, (int) (short) 1);
        int[] intArray8 = ds.MaxMin2.maxMin2(intArray6, 0);
        int[] intArray10 = ds.MaxMin2.maxMin2(intArray8, 0);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray12 = ds.MaxMin2.maxMin2(intArray8, (int) '#');
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
    public void test164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test164");
        int[] intArray6 = new int[] { (byte) -1, (byte) 1, ' ', (short) 10, (short) 1, (byte) 1 };
        int[] intArray8 = ds.MaxMin2.maxMin2(intArray6, (int) (byte) 0);
        int[] intArray10 = ds.MaxMin2.maxMin2(intArray6, (int) (byte) 1);
        int[] intArray12 = ds.MaxMin2.maxMin2(intArray6, (int) (short) 0);
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
    public void test165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test165");
        int[] intArray4 = new int[] { (byte) 0, 10, '#', (short) 0 };
        int[] intArray6 = ds.MaxMin2.maxMin2(intArray4, (int) (short) 1);
        int[] intArray8 = ds.MaxMin2.maxMin2(intArray6, 0);
        int[] intArray10 = ds.MaxMin2.maxMin2(intArray8, (int) (byte) -1);
        int[] intArray12 = ds.MaxMin2.maxMin2(intArray10, 0);
        int[] intArray14 = ds.MaxMin2.maxMin2(intArray12, 0);
        int[] intArray16 = ds.MaxMin2.maxMin2(intArray14, (int) (short) 1);
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
    public void test166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test166");
        int[] intArray6 = new int[] { (byte) -1, (byte) 1, ' ', (short) 10, (short) 1, (byte) 1 };
        int[] intArray8 = ds.MaxMin2.maxMin2(intArray6, (int) (byte) 0);
        int[] intArray10 = ds.MaxMin2.maxMin2(intArray6, (int) (byte) 0);
        int[] intArray12 = ds.MaxMin2.maxMin2(intArray10, (int) (short) -1);
        int[] intArray14 = ds.MaxMin2.maxMin2(intArray10, (int) (byte) -1);
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
    public void test167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test167");
        int[] intArray4 = new int[] { (byte) 0, 10, '#', (short) 0 };
        int[] intArray6 = ds.MaxMin2.maxMin2(intArray4, (int) (short) 1);
        int[] intArray8 = ds.MaxMin2.maxMin2(intArray4, (int) (short) 1);
        int[] intArray10 = ds.MaxMin2.maxMin2(intArray8, (int) (byte) -1);
        int[] intArray12 = ds.MaxMin2.maxMin2(intArray10, 1);
        int[] intArray14 = ds.MaxMin2.maxMin2(intArray10, 1);
        int[] intArray16 = ds.MaxMin2.maxMin2(intArray10, (int) (short) -1);
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
    public void test168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test168");
        int[] intArray4 = new int[] { (byte) 0, 10, '#', (short) 0 };
        int[] intArray6 = ds.MaxMin2.maxMin2(intArray4, (int) (short) 1);
        int[] intArray8 = ds.MaxMin2.maxMin2(intArray6, 0);
        int[] intArray10 = ds.MaxMin2.maxMin2(intArray8, (int) (byte) -1);
        int[] intArray12 = ds.MaxMin2.maxMin2(intArray10, 0);
        int[] intArray14 = ds.MaxMin2.maxMin2(intArray10, (int) (byte) 1);
        int[] intArray16 = ds.MaxMin2.maxMin2(intArray14, 1);
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
    public void test169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test169");
        int[] intArray6 = new int[] { (byte) -1, (byte) 1, ' ', (short) 10, (short) 1, (byte) 1 };
        int[] intArray8 = ds.MaxMin2.maxMin2(intArray6, (int) (byte) 0);
        int[] intArray10 = ds.MaxMin2.maxMin2(intArray8, (-1));
        int[] intArray12 = ds.MaxMin2.maxMin2(intArray10, (int) (byte) -1);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray14 = ds.MaxMin2.maxMin2(intArray12, 10);
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
    public void test170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test170");
        int[] intArray6 = new int[] { (byte) -1, (byte) 1, ' ', (short) 10, (short) 1, (byte) 1 };
        int[] intArray8 = ds.MaxMin2.maxMin2(intArray6, (int) (byte) 0);
        int[] intArray10 = ds.MaxMin2.maxMin2(intArray6, (int) (byte) 0);
        int[] intArray12 = ds.MaxMin2.maxMin2(intArray10, (int) (short) 0);
        int[] intArray14 = ds.MaxMin2.maxMin2(intArray12, (int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray16 = ds.MaxMin2.maxMin2(intArray14, 100);
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
    public void test171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test171");
        int[] intArray4 = new int[] { (byte) 0, 10, '#', (short) 0 };
        int[] intArray6 = ds.MaxMin2.maxMin2(intArray4, (int) (short) 1);
        int[] intArray8 = ds.MaxMin2.maxMin2(intArray6, 0);
        int[] intArray10 = ds.MaxMin2.maxMin2(intArray8, 0);
        int[] intArray12 = ds.MaxMin2.maxMin2(intArray8, 0);
        int[] intArray14 = ds.MaxMin2.maxMin2(intArray12, 0);
        int[] intArray16 = ds.MaxMin2.maxMin2(intArray14, (-1));
        int[] intArray18 = ds.MaxMin2.maxMin2(intArray16, 0);
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
    public void test172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test172");
        int[] intArray6 = new int[] { (byte) -1, (byte) 1, ' ', (short) 10, (short) 1, (byte) 1 };
        int[] intArray8 = ds.MaxMin2.maxMin2(intArray6, (int) (byte) 0);
        int[] intArray10 = ds.MaxMin2.maxMin2(intArray6, (int) (short) 1);
        int[] intArray12 = ds.MaxMin2.maxMin2(intArray10, (-1));
        int[] intArray14 = ds.MaxMin2.maxMin2(intArray12, (int) (byte) -1);
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
    public void test173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test173");
        int[] intArray6 = new int[] { (byte) -1, (byte) 1, ' ', (short) 10, (short) 1, (byte) 1 };
        int[] intArray8 = ds.MaxMin2.maxMin2(intArray6, (int) (byte) 0);
        int[] intArray10 = ds.MaxMin2.maxMin2(intArray6, (int) (byte) 0);
        int[] intArray12 = ds.MaxMin2.maxMin2(intArray10, (int) (short) -1);
        int[] intArray14 = ds.MaxMin2.maxMin2(intArray10, (int) (byte) -1);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray16 = ds.MaxMin2.maxMin2(intArray14, (int) '#');
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
    public void test174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test174");
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
            int[] intArray24 = ds.MaxMin2.maxMin2(intArray18, 100);
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
    public void test175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test175");
        int[] intArray6 = new int[] { (byte) -1, (byte) 1, ' ', (short) 10, (short) 1, (byte) 1 };
        int[] intArray8 = ds.MaxMin2.maxMin2(intArray6, (int) (byte) 0);
        int[] intArray10 = ds.MaxMin2.maxMin2(intArray6, (int) (short) 1);
        int[] intArray12 = ds.MaxMin2.maxMin2(intArray10, (-1));
        int[] intArray14 = ds.MaxMin2.maxMin2(intArray12, (int) (short) -1);
        int[] intArray16 = ds.MaxMin2.maxMin2(intArray14, (-1));
        int[] intArray18 = ds.MaxMin2.maxMin2(intArray16, (int) (byte) 0);
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
    public void test176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test176");
        int[] intArray4 = new int[] { (byte) 0, 10, '#', (short) 0 };
        int[] intArray6 = ds.MaxMin2.maxMin2(intArray4, (int) (short) 1);
        int[] intArray8 = ds.MaxMin2.maxMin2(intArray6, 0);
        int[] intArray10 = ds.MaxMin2.maxMin2(intArray8, (int) (byte) -1);
        int[] intArray12 = ds.MaxMin2.maxMin2(intArray10, 0);
        int[] intArray14 = ds.MaxMin2.maxMin2(intArray12, 0);
        int[] intArray16 = ds.MaxMin2.maxMin2(intArray14, (int) (byte) 1);
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
    public void test177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test177");
        int[] intArray0 = null;
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray2 = ds.MaxMin2.maxMin2(intArray0, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test178");
        int[] intArray4 = new int[] { (byte) 0, 10, '#', (short) 0 };
        int[] intArray6 = ds.MaxMin2.maxMin2(intArray4, (int) (short) 1);
        int[] intArray8 = ds.MaxMin2.maxMin2(intArray6, 0);
        int[] intArray10 = ds.MaxMin2.maxMin2(intArray8, (int) (byte) -1);
        int[] intArray12 = ds.MaxMin2.maxMin2(intArray10, 0);
        int[] intArray14 = ds.MaxMin2.maxMin2(intArray10, (int) (byte) 1);
        int[] intArray16 = ds.MaxMin2.maxMin2(intArray14, 1);
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
    public void test179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test179");
        int[] intArray6 = new int[] { (byte) -1, (byte) 1, ' ', (short) 10, (short) 1, (byte) 1 };
        int[] intArray8 = ds.MaxMin2.maxMin2(intArray6, (int) (byte) 0);
        int[] intArray10 = ds.MaxMin2.maxMin2(intArray6, (int) (short) 1);
        int[] intArray12 = ds.MaxMin2.maxMin2(intArray10, (-1));
        int[] intArray14 = ds.MaxMin2.maxMin2(intArray12, (int) (short) -1);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray16 = ds.MaxMin2.maxMin2(intArray12, (int) (byte) 100);
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
    public void test180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test180");
        int[] intArray0 = new int[] {};
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray2 = ds.MaxMin2.maxMin2(intArray0, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 0");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
    }

    @Test
    public void test181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test181");
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
    public void test182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test182");
        int[] intArray6 = new int[] { (byte) -1, (byte) 1, ' ', (short) 10, (short) 1, (byte) 1 };
        int[] intArray8 = ds.MaxMin2.maxMin2(intArray6, (int) (byte) 0);
        int[] intArray10 = ds.MaxMin2.maxMin2(intArray6, (int) (short) 1);
        int[] intArray12 = ds.MaxMin2.maxMin2(intArray10, (-1));
        int[] intArray14 = ds.MaxMin2.maxMin2(intArray12, (int) (short) -1);
        int[] intArray16 = ds.MaxMin2.maxMin2(intArray14, (-1));
        int[] intArray18 = ds.MaxMin2.maxMin2(intArray16, (int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray20 = ds.MaxMin2.maxMin2(intArray16, 100);
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
    public void test183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test183");
        int[] intArray4 = new int[] { (byte) 0, 10, '#', (short) 0 };
        int[] intArray6 = ds.MaxMin2.maxMin2(intArray4, (int) (short) 1);
        int[] intArray8 = ds.MaxMin2.maxMin2(intArray4, 0);
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
    public void test184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test184");
        int[] intArray0 = null;
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray2 = ds.MaxMin2.maxMin2(intArray0, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test185");
        int[] intArray4 = new int[] { (byte) 0, 10, '#', (short) 0 };
        int[] intArray6 = ds.MaxMin2.maxMin2(intArray4, (int) (short) 1);
        int[] intArray8 = ds.MaxMin2.maxMin2(intArray4, 0);
        java.lang.Class<?> wildcardClass9 = intArray8.getClass();
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[0, 10, 35, 0]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[0, 0]");
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test186");
        int[] intArray4 = new int[] { (byte) 0, 10, '#', (short) 0 };
        int[] intArray6 = ds.MaxMin2.maxMin2(intArray4, (int) (short) 1);
        int[] intArray8 = ds.MaxMin2.maxMin2(intArray6, 0);
        int[] intArray10 = ds.MaxMin2.maxMin2(intArray8, (int) (byte) -1);
        int[] intArray12 = ds.MaxMin2.maxMin2(intArray10, 0);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray14 = ds.MaxMin2.maxMin2(intArray12, (int) (short) 100);
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
    public void test187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test187");
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
            int[] intArray22 = ds.MaxMin2.maxMin2(intArray20, (int) 'a');
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
    public void test188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test188");
        int[] intArray0 = null;
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray2 = ds.MaxMin2.maxMin2(intArray0, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test189");
        int[] intArray4 = new int[] { (byte) 0, 10, '#', (short) 0 };
        int[] intArray6 = ds.MaxMin2.maxMin2(intArray4, (int) (short) 1);
        int[] intArray8 = ds.MaxMin2.maxMin2(intArray6, 0);
        int[] intArray10 = ds.MaxMin2.maxMin2(intArray8, 0);
        int[] intArray12 = ds.MaxMin2.maxMin2(intArray8, 0);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray14 = ds.MaxMin2.maxMin2(intArray12, 10);
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
    public void test190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test190");
        int[] intArray6 = new int[] { (byte) -1, (byte) 1, ' ', (short) 10, (short) 1, (byte) 1 };
        int[] intArray8 = ds.MaxMin2.maxMin2(intArray6, (int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray10 = ds.MaxMin2.maxMin2(intArray8, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 2");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[-1, 1, 32, 10, 1, 1]");
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[-1, -1]");
    }

    @Test
    public void test191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test191");
        int[] intArray6 = new int[] { (byte) -1, (byte) 1, ' ', (short) 10, (short) 1, (byte) 1 };
        int[] intArray8 = ds.MaxMin2.maxMin2(intArray6, (int) (byte) 0);
        int[] intArray10 = ds.MaxMin2.maxMin2(intArray6, (int) (short) 1);
        int[] intArray12 = ds.MaxMin2.maxMin2(intArray10, (-1));
        int[] intArray14 = ds.MaxMin2.maxMin2(intArray12, (int) (byte) -1);
        int[] intArray16 = ds.MaxMin2.maxMin2(intArray14, (int) (byte) 1);
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
    public void test192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test192");
        int[] intArray6 = new int[] { (byte) -1, (byte) 1, ' ', (short) 10, (short) 1, (byte) 1 };
        int[] intArray8 = ds.MaxMin2.maxMin2(intArray6, (int) (byte) 0);
        int[] intArray10 = ds.MaxMin2.maxMin2(intArray6, (int) (byte) 0);
        int[] intArray12 = ds.MaxMin2.maxMin2(intArray10, (int) (short) 0);
        int[] intArray14 = ds.MaxMin2.maxMin2(intArray10, (int) (short) -1);
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
    public void test193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test193");
        int[] intArray6 = new int[] { (byte) -1, (byte) 1, ' ', (short) 10, (short) 1, (byte) 1 };
        int[] intArray8 = ds.MaxMin2.maxMin2(intArray6, (int) (byte) 0);
        int[] intArray10 = ds.MaxMin2.maxMin2(intArray6, (int) (byte) 0);
        int[] intArray12 = ds.MaxMin2.maxMin2(intArray10, (int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray14 = ds.MaxMin2.maxMin2(intArray12, (int) (short) 100);
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
    public void test194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test194");
        int[] intArray4 = new int[] { (byte) 0, 10, '#', (short) 0 };
        int[] intArray6 = ds.MaxMin2.maxMin2(intArray4, (int) (short) 1);
        int[] intArray8 = ds.MaxMin2.maxMin2(intArray4, (int) (short) 0);
        int[] intArray10 = ds.MaxMin2.maxMin2(intArray4, (int) (short) 1);
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
    public void test195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test195");
        int[] intArray4 = new int[] { (byte) 0, 10, '#', (short) 0 };
        int[] intArray6 = ds.MaxMin2.maxMin2(intArray4, (int) (short) 1);
        int[] intArray8 = ds.MaxMin2.maxMin2(intArray6, 0);
        int[] intArray10 = ds.MaxMin2.maxMin2(intArray8, 0);
        int[] intArray12 = ds.MaxMin2.maxMin2(intArray8, 0);
        int[] intArray14 = ds.MaxMin2.maxMin2(intArray12, 0);
        int[] intArray16 = ds.MaxMin2.maxMin2(intArray14, (-1));
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
    public void test196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test196");
        int[] intArray4 = new int[] { (byte) 0, 10, '#', (short) 0 };
        int[] intArray6 = ds.MaxMin2.maxMin2(intArray4, (int) (short) 1);
        int[] intArray8 = ds.MaxMin2.maxMin2(intArray6, 0);
        int[] intArray10 = ds.MaxMin2.maxMin2(intArray8, (int) (byte) -1);
        int[] intArray12 = ds.MaxMin2.maxMin2(intArray10, 0);
        int[] intArray14 = ds.MaxMin2.maxMin2(intArray10, (int) (byte) 1);
        int[] intArray16 = ds.MaxMin2.maxMin2(intArray14, 1);
        int[] intArray18 = ds.MaxMin2.maxMin2(intArray16, 0);
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
    public void test197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test197");
        int[] intArray4 = new int[] { (byte) 0, 10, '#', (short) 0 };
        int[] intArray6 = ds.MaxMin2.maxMin2(intArray4, (int) (short) 1);
        int[] intArray8 = ds.MaxMin2.maxMin2(intArray6, 0);
        int[] intArray10 = ds.MaxMin2.maxMin2(intArray8, (int) (byte) -1);
        int[] intArray12 = ds.MaxMin2.maxMin2(intArray10, 0);
        int[] intArray14 = ds.MaxMin2.maxMin2(intArray10, (int) (byte) 1);
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
    public void test198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test198");
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
            int[] intArray20 = ds.MaxMin2.maxMin2(intArray16, (int) (short) 10);
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
    public void test199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test199");
        int[] intArray4 = new int[] { (byte) 0, 10, '#', (short) 0 };
        int[] intArray6 = ds.MaxMin2.maxMin2(intArray4, (int) (short) 1);
        int[] intArray8 = ds.MaxMin2.maxMin2(intArray4, (int) (short) 0);
        int[] intArray10 = ds.MaxMin2.maxMin2(intArray4, (int) (short) 1);
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
    public void test200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test200");
        int[] intArray4 = new int[] { (byte) 0, 10, '#', (short) 0 };
        int[] intArray6 = ds.MaxMin2.maxMin2(intArray4, (int) (short) 1);
        int[] intArray8 = ds.MaxMin2.maxMin2(intArray6, 0);
        int[] intArray10 = ds.MaxMin2.maxMin2(intArray8, (int) (byte) -1);
        int[] intArray12 = ds.MaxMin2.maxMin2(intArray10, 0);
        int[] intArray14 = ds.MaxMin2.maxMin2(intArray10, (int) (short) 0);
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
    public void test201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test201");
        int[] intArray4 = new int[] { (byte) 0, 10, '#', (short) 0 };
        int[] intArray6 = ds.MaxMin2.maxMin2(intArray4, (int) (short) 1);
        int[] intArray8 = ds.MaxMin2.maxMin2(intArray6, 0);
        int[] intArray10 = ds.MaxMin2.maxMin2(intArray8, (int) (byte) -1);
        int[] intArray12 = ds.MaxMin2.maxMin2(intArray10, 0);
        int[] intArray14 = ds.MaxMin2.maxMin2(intArray12, 0);
        int[] intArray16 = ds.MaxMin2.maxMin2(intArray14, (-1));
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
    public void test202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test202");
        int[] intArray4 = new int[] { (byte) 0, 10, '#', (short) 0 };
        int[] intArray6 = ds.MaxMin2.maxMin2(intArray4, (int) (short) 1);
        int[] intArray8 = ds.MaxMin2.maxMin2(intArray6, 0);
        int[] intArray10 = ds.MaxMin2.maxMin2(intArray8, 0);
        int[] intArray12 = ds.MaxMin2.maxMin2(intArray8, 0);
        int[] intArray14 = ds.MaxMin2.maxMin2(intArray12, 0);
        int[] intArray16 = ds.MaxMin2.maxMin2(intArray12, (int) (short) -1);
        int[] intArray18 = ds.MaxMin2.maxMin2(intArray12, (int) (byte) 1);
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
    public void test203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test203");
        int[] intArray4 = new int[] { (byte) 0, 10, '#', (short) 0 };
        int[] intArray6 = ds.MaxMin2.maxMin2(intArray4, (int) (short) 1);
        int[] intArray8 = ds.MaxMin2.maxMin2(intArray4, (int) (byte) -1);
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
    public void test204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test204");
        int[] intArray6 = new int[] { (byte) -1, (byte) 1, ' ', (short) 10, (short) 1, (byte) 1 };
        int[] intArray8 = ds.MaxMin2.maxMin2(intArray6, (int) (byte) 0);
        int[] intArray10 = ds.MaxMin2.maxMin2(intArray6, (int) (short) 1);
        int[] intArray12 = ds.MaxMin2.maxMin2(intArray10, (-1));
        int[] intArray14 = ds.MaxMin2.maxMin2(intArray12, (int) (short) -1);
        int[] intArray16 = ds.MaxMin2.maxMin2(intArray14, (-1));
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray18 = ds.MaxMin2.maxMin2(intArray14, 100);
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
    public void test205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test205");
        int[] intArray6 = new int[] { (byte) -1, (byte) 1, ' ', (short) 10, (short) 1, (byte) 1 };
        int[] intArray8 = ds.MaxMin2.maxMin2(intArray6, (int) (byte) 0);
        int[] intArray10 = ds.MaxMin2.maxMin2(intArray6, (int) (byte) 1);
        int[] intArray12 = ds.MaxMin2.maxMin2(intArray10, (int) (byte) 1);
        int[] intArray14 = ds.MaxMin2.maxMin2(intArray10, (int) (byte) 1);
        int[] intArray16 = ds.MaxMin2.maxMin2(intArray10, (int) (byte) 0);
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
    public void test206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test206");
        int[] intArray4 = new int[] { (byte) 0, 10, '#', (short) 0 };
        int[] intArray6 = ds.MaxMin2.maxMin2(intArray4, (int) (short) 1);
        int[] intArray8 = ds.MaxMin2.maxMin2(intArray4, (int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray10 = ds.MaxMin2.maxMin2(intArray4, (int) (short) 100);
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
    public void test207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test207");
        int[] intArray4 = new int[] { (byte) 0, 10, '#', (short) 0 };
        int[] intArray6 = ds.MaxMin2.maxMin2(intArray4, (int) (short) 1);
        int[] intArray8 = ds.MaxMin2.maxMin2(intArray4, (int) (short) 0);
        java.lang.Class<?> wildcardClass9 = intArray8.getClass();
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[0, 10, 35, 0]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[0, 0]");
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test208");
        int[] intArray6 = new int[] { (byte) -1, (byte) 1, ' ', (short) 10, (short) 1, (byte) 1 };
        int[] intArray8 = ds.MaxMin2.maxMin2(intArray6, (int) (byte) 0);
        int[] intArray10 = ds.MaxMin2.maxMin2(intArray6, (int) (short) 1);
        int[] intArray12 = ds.MaxMin2.maxMin2(intArray10, (-1));
        int[] intArray14 = ds.MaxMin2.maxMin2(intArray12, (int) (short) -1);
        int[] intArray16 = ds.MaxMin2.maxMin2(intArray14, (-1));
        int[] intArray18 = ds.MaxMin2.maxMin2(intArray14, 0);
        int[] intArray20 = ds.MaxMin2.maxMin2(intArray18, 0);
        int[] intArray22 = ds.MaxMin2.maxMin2(intArray18, 0);
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
    public void test209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test209");
        int[] intArray6 = new int[] { (byte) -1, (byte) 1, ' ', (short) 10, (short) 1, (byte) 1 };
        int[] intArray8 = ds.MaxMin2.maxMin2(intArray6, (int) (byte) 0);
        int[] intArray10 = ds.MaxMin2.maxMin2(intArray8, (-1));
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
    public void test210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test210");
        int[] intArray6 = new int[] { (byte) -1, (byte) 1, ' ', (short) 10, (short) 1, (byte) 1 };
        int[] intArray8 = ds.MaxMin2.maxMin2(intArray6, (int) (byte) 0);
        int[] intArray10 = ds.MaxMin2.maxMin2(intArray6, (int) (short) 1);
        int[] intArray12 = ds.MaxMin2.maxMin2(intArray10, (-1));
        int[] intArray14 = ds.MaxMin2.maxMin2(intArray10, (int) (byte) 0);
        int[] intArray16 = ds.MaxMin2.maxMin2(intArray10, 1);
        int[] intArray18 = ds.MaxMin2.maxMin2(intArray16, 0);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray20 = ds.MaxMin2.maxMin2(intArray16, (int) (byte) 100);
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
    public void test211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test211");
        int[] intArray4 = new int[] { (byte) 0, 10, '#', (short) 0 };
        int[] intArray6 = ds.MaxMin2.maxMin2(intArray4, (int) (short) 1);
        int[] intArray8 = ds.MaxMin2.maxMin2(intArray6, 0);
        int[] intArray10 = ds.MaxMin2.maxMin2(intArray8, (int) (byte) -1);
        int[] intArray12 = ds.MaxMin2.maxMin2(intArray10, 0);
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
    public void test212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test212");
        int[] intArray6 = new int[] { (byte) -1, (byte) 1, ' ', (short) 10, (short) 1, (byte) 1 };
        int[] intArray8 = ds.MaxMin2.maxMin2(intArray6, (int) (byte) 0);
        int[] intArray10 = ds.MaxMin2.maxMin2(intArray6, (int) (short) 1);
        int[] intArray12 = ds.MaxMin2.maxMin2(intArray10, (-1));
        int[] intArray14 = ds.MaxMin2.maxMin2(intArray12, (int) (byte) -1);
        int[] intArray16 = ds.MaxMin2.maxMin2(intArray14, (int) (byte) 1);
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
    public void test213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test213");
        int[] intArray4 = new int[] { (byte) 0, 10, '#', (short) 0 };
        int[] intArray6 = ds.MaxMin2.maxMin2(intArray4, (int) (short) 1);
        int[] intArray8 = ds.MaxMin2.maxMin2(intArray4, (int) (short) 1);
        int[] intArray10 = ds.MaxMin2.maxMin2(intArray8, (int) (byte) -1);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray12 = ds.MaxMin2.maxMin2(intArray8, (int) (byte) 100);
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
    public void test214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test214");
        int[] intArray4 = new int[] { (byte) 0, 10, '#', (short) 0 };
        int[] intArray6 = ds.MaxMin2.maxMin2(intArray4, (int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray8 = ds.MaxMin2.maxMin2(intArray4, (int) ' ');
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
    public void test215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test215");
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
    public void test216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test216");
        int[] intArray4 = new int[] { (byte) 0, 10, '#', (short) 0 };
        int[] intArray6 = ds.MaxMin2.maxMin2(intArray4, (int) (short) 1);
        int[] intArray8 = ds.MaxMin2.maxMin2(intArray6, 0);
        int[] intArray10 = ds.MaxMin2.maxMin2(intArray8, 0);
        int[] intArray12 = ds.MaxMin2.maxMin2(intArray8, 0);
        int[] intArray14 = ds.MaxMin2.maxMin2(intArray12, 0);
        int[] intArray16 = ds.MaxMin2.maxMin2(intArray14, (-1));
        int[] intArray18 = ds.MaxMin2.maxMin2(intArray16, 0);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray20 = ds.MaxMin2.maxMin2(intArray18, (int) '#');
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
    public void test217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test217");
        int[] intArray6 = new int[] { 1, ' ', (-1), (byte) 100, (short) -1, (byte) 10 };
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray8 = ds.MaxMin2.maxMin2(intArray6, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 6");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[1, 32, -1, 100, -1, 10]");
    }

    @Test
    public void test218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test218");
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
    public void test219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test219");
        int[] intArray6 = new int[] { (byte) -1, (byte) 1, ' ', (short) 10, (short) 1, (byte) 1 };
        int[] intArray8 = ds.MaxMin2.maxMin2(intArray6, (int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray10 = ds.MaxMin2.maxMin2(intArray8, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 2");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[-1, 1, 32, 10, 1, 1]");
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[-1, -1]");
    }

    @Test
    public void test220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test220");
        int[] intArray0 = null;
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray2 = ds.MaxMin2.maxMin2(intArray0, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test221");
        int[] intArray6 = new int[] { (byte) -1, (byte) 1, ' ', (short) 10, (short) 1, (byte) 1 };
        int[] intArray8 = ds.MaxMin2.maxMin2(intArray6, (int) (byte) 0);
        int[] intArray10 = ds.MaxMin2.maxMin2(intArray6, (int) (short) 1);
        int[] intArray12 = ds.MaxMin2.maxMin2(intArray10, (-1));
        int[] intArray14 = ds.MaxMin2.maxMin2(intArray12, (int) (byte) -1);
        int[] intArray16 = ds.MaxMin2.maxMin2(intArray14, (int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray18 = ds.MaxMin2.maxMin2(intArray16, (int) '#');
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
    public void test222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test222");
        int[] intArray4 = new int[] { (byte) 0, 10, '#', (short) 0 };
        int[] intArray6 = ds.MaxMin2.maxMin2(intArray4, (int) (short) 1);
        int[] intArray8 = ds.MaxMin2.maxMin2(intArray6, 0);
        int[] intArray10 = ds.MaxMin2.maxMin2(intArray8, (int) (byte) -1);
        int[] intArray12 = ds.MaxMin2.maxMin2(intArray10, 0);
        int[] intArray14 = ds.MaxMin2.maxMin2(intArray10, (int) (byte) 1);
        int[] intArray16 = ds.MaxMin2.maxMin2(intArray14, 1);
        int[] intArray18 = ds.MaxMin2.maxMin2(intArray14, (int) (short) 0);
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
    public void test223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test223");
        int[] intArray6 = new int[] { (byte) -1, (byte) 1, ' ', (short) 10, (short) 1, (byte) 1 };
        int[] intArray8 = ds.MaxMin2.maxMin2(intArray6, (int) (byte) 0);
        int[] intArray10 = ds.MaxMin2.maxMin2(intArray6, (int) (byte) 1);
        int[] intArray12 = ds.MaxMin2.maxMin2(intArray6, (int) (byte) -1);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray14 = ds.MaxMin2.maxMin2(intArray6, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 6");
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
    public void test224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test224");
        int[] intArray4 = new int[] { (byte) 0, 10, '#', (short) 0 };
        int[] intArray6 = ds.MaxMin2.maxMin2(intArray4, (int) (short) 1);
        int[] intArray8 = ds.MaxMin2.maxMin2(intArray4, (int) (byte) -1);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray10 = ds.MaxMin2.maxMin2(intArray8, (int) (short) 10);
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
    }

    @Test
    public void test225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test225");
        int[] intArray0 = null;
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray2 = ds.MaxMin2.maxMin2(intArray0, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test226");
        int[] intArray4 = new int[] { (byte) 0, 10, '#', (short) 0 };
        int[] intArray6 = ds.MaxMin2.maxMin2(intArray4, (int) (short) 1);
        int[] intArray8 = ds.MaxMin2.maxMin2(intArray4, (int) (short) 1);
        int[] intArray10 = ds.MaxMin2.maxMin2(intArray8, (int) (byte) -1);
        int[] intArray12 = ds.MaxMin2.maxMin2(intArray10, 1);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray14 = ds.MaxMin2.maxMin2(intArray12, (int) '4');
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
    public void test227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test227");
        int[] intArray6 = new int[] { (byte) -1, (byte) 1, ' ', (short) 10, (short) 1, (byte) 1 };
        int[] intArray8 = ds.MaxMin2.maxMin2(intArray6, (int) (byte) 0);
        int[] intArray10 = ds.MaxMin2.maxMin2(intArray8, (int) (short) -1);
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
    public void test228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test228");
        int[] intArray6 = new int[] { (byte) -1, (byte) 1, ' ', (short) 10, (short) 1, (byte) 1 };
        int[] intArray8 = ds.MaxMin2.maxMin2(intArray6, (int) (byte) 0);
        int[] intArray10 = ds.MaxMin2.maxMin2(intArray6, (int) (short) 1);
        int[] intArray12 = ds.MaxMin2.maxMin2(intArray10, (-1));
        int[] intArray14 = ds.MaxMin2.maxMin2(intArray12, (int) (short) -1);
        int[] intArray16 = ds.MaxMin2.maxMin2(intArray14, (-1));
        int[] intArray18 = ds.MaxMin2.maxMin2(intArray14, 0);
        int[] intArray20 = ds.MaxMin2.maxMin2(intArray14, 1);
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
    public void test229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test229");
        int[] intArray4 = new int[] { (byte) 0, 10, '#', (short) 0 };
        int[] intArray6 = ds.MaxMin2.maxMin2(intArray4, (int) (short) 1);
        int[] intArray8 = ds.MaxMin2.maxMin2(intArray6, 0);
        int[] intArray10 = ds.MaxMin2.maxMin2(intArray8, 0);
        int[] intArray12 = ds.MaxMin2.maxMin2(intArray8, 0);
        int[] intArray14 = ds.MaxMin2.maxMin2(intArray12, 0);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray16 = ds.MaxMin2.maxMin2(intArray14, (int) (byte) 100);
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
    public void test230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test230");
        int[] intArray4 = new int[] { (byte) 0, 10, '#', (short) 0 };
        int[] intArray6 = ds.MaxMin2.maxMin2(intArray4, (int) (short) 1);
        int[] intArray8 = ds.MaxMin2.maxMin2(intArray6, 0);
        int[] intArray10 = ds.MaxMin2.maxMin2(intArray8, (int) (byte) -1);
        int[] intArray12 = ds.MaxMin2.maxMin2(intArray10, 0);
        int[] intArray14 = ds.MaxMin2.maxMin2(intArray12, 0);
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
    public void test231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test231");
        int[] intArray4 = new int[] { (byte) 0, 10, '#', (short) 0 };
        int[] intArray6 = ds.MaxMin2.maxMin2(intArray4, (int) (short) 1);
        int[] intArray8 = ds.MaxMin2.maxMin2(intArray4, (int) (short) 1);
        int[] intArray10 = ds.MaxMin2.maxMin2(intArray8, (int) (byte) -1);
        int[] intArray12 = ds.MaxMin2.maxMin2(intArray10, 1);
        int[] intArray14 = ds.MaxMin2.maxMin2(intArray12, (int) (short) 1);
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
    public void test232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test232");
        int[] intArray6 = new int[] { (byte) -1, (byte) 1, ' ', (short) 10, (short) 1, (byte) 1 };
        int[] intArray8 = ds.MaxMin2.maxMin2(intArray6, (int) (byte) 0);
        int[] intArray10 = ds.MaxMin2.maxMin2(intArray6, (int) (short) 1);
        int[] intArray12 = ds.MaxMin2.maxMin2(intArray10, (-1));
        int[] intArray14 = ds.MaxMin2.maxMin2(intArray12, (int) (byte) -1);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray16 = ds.MaxMin2.maxMin2(intArray14, (int) (short) 100);
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
    public void test233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test233");
        int[] intArray6 = new int[] { (byte) -1, (byte) 1, ' ', (short) 10, (short) 1, (byte) 1 };
        int[] intArray8 = ds.MaxMin2.maxMin2(intArray6, (int) (byte) 0);
        int[] intArray10 = ds.MaxMin2.maxMin2(intArray8, (int) (short) -1);
        java.lang.Class<?> wildcardClass11 = intArray10.getClass();
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[-1, 1, 32, 10, 1, 1]");
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[-1, -1]");
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test234");
        int[] intArray4 = new int[] { (byte) 0, 10, '#', (short) 0 };
        int[] intArray6 = ds.MaxMin2.maxMin2(intArray4, (int) (short) 1);
        int[] intArray8 = ds.MaxMin2.maxMin2(intArray4, (int) (short) 1);
        int[] intArray10 = ds.MaxMin2.maxMin2(intArray8, (int) (byte) -1);
        int[] intArray12 = ds.MaxMin2.maxMin2(intArray10, 1);
        int[] intArray14 = ds.MaxMin2.maxMin2(intArray10, 1);
        int[] intArray16 = ds.MaxMin2.maxMin2(intArray10, (int) (short) -1);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray18 = ds.MaxMin2.maxMin2(intArray16, (int) (short) 100);
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
    public void test235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test235");
        int[] intArray4 = new int[] { (byte) 0, 10, '#', (short) 0 };
        int[] intArray6 = ds.MaxMin2.maxMin2(intArray4, (int) (short) 1);
        int[] intArray8 = ds.MaxMin2.maxMin2(intArray6, 0);
        int[] intArray10 = ds.MaxMin2.maxMin2(intArray8, 0);
        int[] intArray12 = ds.MaxMin2.maxMin2(intArray8, 0);
        int[] intArray14 = ds.MaxMin2.maxMin2(intArray12, 0);
        int[] intArray16 = ds.MaxMin2.maxMin2(intArray14, (-1));
        int[] intArray18 = ds.MaxMin2.maxMin2(intArray16, 1);
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
    public void test236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test236");
        int[] intArray0 = null;
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray2 = ds.MaxMin2.maxMin2(intArray0, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test237");
        int[] intArray0 = null;
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray2 = ds.MaxMin2.maxMin2(intArray0, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test238");
        int[] intArray6 = new int[] { (byte) -1, (byte) 1, ' ', (short) 10, (short) 1, (byte) 1 };
        int[] intArray8 = ds.MaxMin2.maxMin2(intArray6, (int) (byte) 0);
        int[] intArray10 = ds.MaxMin2.maxMin2(intArray6, (int) (byte) 0);
        int[] intArray12 = ds.MaxMin2.maxMin2(intArray10, (int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray14 = ds.MaxMin2.maxMin2(intArray10, (int) ' ');
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
    public void test239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test239");
        int[] intArray4 = new int[] { (byte) 0, 10, '#', (short) 0 };
        int[] intArray6 = ds.MaxMin2.maxMin2(intArray4, (int) (short) 1);
        int[] intArray8 = ds.MaxMin2.maxMin2(intArray6, 0);
        int[] intArray10 = ds.MaxMin2.maxMin2(intArray8, (int) (byte) -1);
        int[] intArray12 = ds.MaxMin2.maxMin2(intArray10, 0);
        int[] intArray14 = ds.MaxMin2.maxMin2(intArray10, (int) (byte) 1);
        int[] intArray16 = ds.MaxMin2.maxMin2(intArray14, 1);
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
    public void test240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test240");
        int[] intArray4 = new int[] { (byte) 0, 10, '#', (short) 0 };
        int[] intArray6 = ds.MaxMin2.maxMin2(intArray4, (int) (short) 1);
        int[] intArray8 = ds.MaxMin2.maxMin2(intArray6, 0);
        int[] intArray10 = ds.MaxMin2.maxMin2(intArray8, (int) (byte) -1);
        int[] intArray12 = ds.MaxMin2.maxMin2(intArray10, 0);
        int[] intArray14 = ds.MaxMin2.maxMin2(intArray12, 0);
        int[] intArray16 = ds.MaxMin2.maxMin2(intArray14, (-1));
        int[] intArray18 = ds.MaxMin2.maxMin2(intArray16, (int) (byte) -1);
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
    public void test241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test241");
        int[] intArray4 = new int[] { (byte) 0, 10, '#', (short) 0 };
        int[] intArray6 = ds.MaxMin2.maxMin2(intArray4, (int) (short) 1);
        int[] intArray8 = ds.MaxMin2.maxMin2(intArray6, 0);
        int[] intArray10 = ds.MaxMin2.maxMin2(intArray8, (int) (byte) -1);
        int[] intArray12 = ds.MaxMin2.maxMin2(intArray10, 0);
        int[] intArray14 = ds.MaxMin2.maxMin2(intArray10, (int) (short) 0);
        int[] intArray16 = ds.MaxMin2.maxMin2(intArray10, (int) (short) 0);
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
    public void test242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test242");
        int[] intArray4 = new int[] { (byte) 0, 10, '#', (short) 0 };
        int[] intArray6 = ds.MaxMin2.maxMin2(intArray4, (int) (short) 1);
        int[] intArray8 = ds.MaxMin2.maxMin2(intArray4, (int) (short) 1);
        int[] intArray10 = ds.MaxMin2.maxMin2(intArray8, (int) (byte) -1);
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
    public void test243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test243");
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
            int[] intArray22 = ds.MaxMin2.maxMin2(intArray14, (int) (byte) 10);
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
    public void test244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test244");
        int[] intArray4 = new int[] { (byte) 0, 10, '#', (short) 0 };
        int[] intArray6 = ds.MaxMin2.maxMin2(intArray4, (int) (short) 1);
        int[] intArray8 = ds.MaxMin2.maxMin2(intArray6, 0);
        int[] intArray10 = ds.MaxMin2.maxMin2(intArray8, (int) (byte) -1);
        int[] intArray12 = ds.MaxMin2.maxMin2(intArray10, 0);
        int[] intArray14 = ds.MaxMin2.maxMin2(intArray12, 0);
        int[] intArray16 = ds.MaxMin2.maxMin2(intArray14, (int) (byte) 1);
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
    public void test245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test245");
        int[] intArray4 = new int[] { (byte) 0, 10, '#', (short) 0 };
        int[] intArray6 = ds.MaxMin2.maxMin2(intArray4, (int) (short) 1);
        int[] intArray8 = ds.MaxMin2.maxMin2(intArray6, 0);
        int[] intArray10 = ds.MaxMin2.maxMin2(intArray8, (int) (byte) -1);
        int[] intArray12 = ds.MaxMin2.maxMin2(intArray10, 0);
        int[] intArray14 = ds.MaxMin2.maxMin2(intArray12, 0);
        int[] intArray16 = ds.MaxMin2.maxMin2(intArray14, (int) (short) 1);
        int[] intArray18 = ds.MaxMin2.maxMin2(intArray16, (int) (short) 1);
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
    public void test246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test246");
        int[] intArray4 = new int[] { (byte) 0, 10, '#', (short) 0 };
        int[] intArray6 = ds.MaxMin2.maxMin2(intArray4, (int) (short) 1);
        int[] intArray8 = ds.MaxMin2.maxMin2(intArray6, 0);
        int[] intArray10 = ds.MaxMin2.maxMin2(intArray8, (int) (byte) -1);
        int[] intArray12 = ds.MaxMin2.maxMin2(intArray10, 0);
        int[] intArray14 = ds.MaxMin2.maxMin2(intArray12, (int) (short) 1);
        int[] intArray16 = ds.MaxMin2.maxMin2(intArray14, 0);
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
    public void test247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test247");
        int[] intArray6 = new int[] { (byte) -1, (byte) 1, ' ', (short) 10, (short) 1, (byte) 1 };
        int[] intArray8 = ds.MaxMin2.maxMin2(intArray6, (int) (byte) 0);
        int[] intArray10 = ds.MaxMin2.maxMin2(intArray6, (int) (short) 1);
        int[] intArray12 = ds.MaxMin2.maxMin2(intArray10, (-1));
        int[] intArray14 = ds.MaxMin2.maxMin2(intArray12, (int) (short) -1);
        int[] intArray16 = ds.MaxMin2.maxMin2(intArray14, (-1));
        int[] intArray18 = ds.MaxMin2.maxMin2(intArray16, (int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray20 = ds.MaxMin2.maxMin2(intArray18, (int) (byte) 100);
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
    public void test248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test248");
        int[] intArray6 = new int[] { (byte) -1, (byte) 1, ' ', (short) 10, (short) 1, (byte) 1 };
        int[] intArray8 = ds.MaxMin2.maxMin2(intArray6, (int) (byte) 0);
        int[] intArray10 = ds.MaxMin2.maxMin2(intArray6, (int) (short) 1);
        int[] intArray12 = ds.MaxMin2.maxMin2(intArray10, (-1));
        int[] intArray14 = ds.MaxMin2.maxMin2(intArray10, (int) (byte) 0);
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
    public void test249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test249");
        int[] intArray4 = new int[] { (byte) 0, 10, '#', (short) 0 };
        int[] intArray6 = ds.MaxMin2.maxMin2(intArray4, (int) (short) 1);
        int[] intArray8 = ds.MaxMin2.maxMin2(intArray6, 0);
        int[] intArray10 = ds.MaxMin2.maxMin2(intArray8, (int) (byte) -1);
        int[] intArray12 = ds.MaxMin2.maxMin2(intArray10, 0);
        int[] intArray14 = ds.MaxMin2.maxMin2(intArray12, (int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray16 = ds.MaxMin2.maxMin2(intArray14, (int) 'a');
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
    public void test250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test250");
        int[] intArray0 = null;
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray2 = ds.MaxMin2.maxMin2(intArray0, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test251");
        int[] intArray4 = new int[] { (byte) 0, 10, '#', (short) 0 };
        int[] intArray6 = ds.MaxMin2.maxMin2(intArray4, (int) (short) 1);
        int[] intArray8 = ds.MaxMin2.maxMin2(intArray4, (int) (short) 1);
        int[] intArray10 = ds.MaxMin2.maxMin2(intArray8, (int) (short) 1);
        int[] intArray12 = ds.MaxMin2.maxMin2(intArray8, (-1));
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray14 = ds.MaxMin2.maxMin2(intArray12, (int) (short) 100);
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
    public void test252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test252");
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
    public void test253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test253");
        int[] intArray0 = null;
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray2 = ds.MaxMin2.maxMin2(intArray0, (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test254");
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
    public void test255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test255");
        int[] intArray4 = new int[] { (byte) 0, 10, '#', (short) 0 };
        int[] intArray6 = ds.MaxMin2.maxMin2(intArray4, (int) (short) 1);
        int[] intArray8 = ds.MaxMin2.maxMin2(intArray6, 0);
        int[] intArray10 = ds.MaxMin2.maxMin2(intArray8, 0);
        int[] intArray12 = ds.MaxMin2.maxMin2(intArray8, 0);
        int[] intArray14 = ds.MaxMin2.maxMin2(intArray12, 0);
        int[] intArray16 = ds.MaxMin2.maxMin2(intArray14, (-1));
        int[] intArray18 = ds.MaxMin2.maxMin2(intArray16, 0);
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
    public void test256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test256");
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
    public void test257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test257");
        int[] intArray6 = new int[] { (byte) -1, (byte) 1, ' ', (short) 10, (short) 1, (byte) 1 };
        int[] intArray8 = ds.MaxMin2.maxMin2(intArray6, (int) (byte) 0);
        int[] intArray10 = ds.MaxMin2.maxMin2(intArray6, (int) (byte) 1);
        java.lang.Class<?> wildcardClass11 = intArray6.getClass();
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[-1, 1, 32, 10, 1, 1]");
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[-1, -1]");
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test258");
        int[] intArray4 = new int[] { (byte) 0, 10, '#', (short) 0 };
        int[] intArray6 = ds.MaxMin2.maxMin2(intArray4, (int) (short) 1);
        int[] intArray8 = ds.MaxMin2.maxMin2(intArray6, 0);
        int[] intArray10 = ds.MaxMin2.maxMin2(intArray8, (int) (byte) -1);
        int[] intArray12 = ds.MaxMin2.maxMin2(intArray10, 0);
        int[] intArray14 = ds.MaxMin2.maxMin2(intArray12, 1);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray16 = ds.MaxMin2.maxMin2(intArray12, 10);
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
    public void test259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test259");
        int[] intArray4 = new int[] { (byte) 0, 10, '#', (short) 0 };
        int[] intArray6 = ds.MaxMin2.maxMin2(intArray4, (int) (short) 1);
        int[] intArray8 = ds.MaxMin2.maxMin2(intArray6, 0);
        int[] intArray10 = ds.MaxMin2.maxMin2(intArray8, 0);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray12 = ds.MaxMin2.maxMin2(intArray8, 100);
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
    public void test260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test260");
        int[] intArray4 = new int[] { (byte) 0, 10, '#', (short) 0 };
        int[] intArray6 = ds.MaxMin2.maxMin2(intArray4, (int) (short) 1);
        int[] intArray8 = ds.MaxMin2.maxMin2(intArray4, (int) (short) 1);
        int[] intArray10 = ds.MaxMin2.maxMin2(intArray8, (int) (byte) -1);
        int[] intArray12 = ds.MaxMin2.maxMin2(intArray10, (int) (short) 0);
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
    public void test261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test261");
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
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray26 = ds.MaxMin2.maxMin2(intArray22, (int) '#');
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
    public void test262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test262");
        int[] intArray4 = new int[] { (byte) 0, 10, '#', (short) 0 };
        int[] intArray6 = ds.MaxMin2.maxMin2(intArray4, (int) (short) 1);
        int[] intArray8 = ds.MaxMin2.maxMin2(intArray4, (int) (short) 1);
        int[] intArray10 = ds.MaxMin2.maxMin2(intArray8, (int) (byte) -1);
        int[] intArray12 = ds.MaxMin2.maxMin2(intArray10, 1);
        int[] intArray14 = ds.MaxMin2.maxMin2(intArray12, (int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray16 = ds.MaxMin2.maxMin2(intArray14, 10);
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
    public void test263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test263");
        int[] intArray6 = new int[] { (byte) -1, (byte) 1, ' ', (short) 10, (short) 1, (byte) 1 };
        int[] intArray8 = ds.MaxMin2.maxMin2(intArray6, (int) (byte) 0);
        int[] intArray10 = ds.MaxMin2.maxMin2(intArray6, (int) (short) 1);
        int[] intArray12 = ds.MaxMin2.maxMin2(intArray10, (-1));
        int[] intArray14 = ds.MaxMin2.maxMin2(intArray12, (int) (short) -1);
        int[] intArray16 = ds.MaxMin2.maxMin2(intArray14, (-1));
        int[] intArray18 = ds.MaxMin2.maxMin2(intArray14, 0);
        int[] intArray20 = ds.MaxMin2.maxMin2(intArray14, (int) (short) 1);
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
    public void test264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test264");
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
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray26 = ds.MaxMin2.maxMin2(intArray24, (int) (byte) 100);
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
    public void test265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test265");
        int[] intArray6 = new int[] { (byte) -1, (byte) 1, ' ', (short) 10, (short) 1, (byte) 1 };
        int[] intArray8 = ds.MaxMin2.maxMin2(intArray6, (int) (byte) 0);
        int[] intArray10 = ds.MaxMin2.maxMin2(intArray8, (-1));
        int[] intArray12 = ds.MaxMin2.maxMin2(intArray10, (int) (byte) 0);
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
    public void test266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test266");
        int[] intArray0 = null;
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray2 = ds.MaxMin2.maxMin2(intArray0, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test267");
        int[] intArray4 = new int[] { (byte) 0, 10, '#', (short) 0 };
        int[] intArray6 = ds.MaxMin2.maxMin2(intArray4, (int) (short) 1);
        int[] intArray8 = ds.MaxMin2.maxMin2(intArray6, 0);
        int[] intArray10 = ds.MaxMin2.maxMin2(intArray8, 0);
        int[] intArray12 = ds.MaxMin2.maxMin2(intArray8, 0);
        int[] intArray14 = ds.MaxMin2.maxMin2(intArray12, 0);
        int[] intArray16 = ds.MaxMin2.maxMin2(intArray14, (-1));
        int[] intArray18 = ds.MaxMin2.maxMin2(intArray16, 0);
        int[] intArray20 = ds.MaxMin2.maxMin2(intArray16, (-1));
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
    public void test268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test268");
        int[] intArray4 = new int[] { (byte) 0, 10, '#', (short) 0 };
        int[] intArray6 = ds.MaxMin2.maxMin2(intArray4, (int) (short) 1);
        int[] intArray8 = ds.MaxMin2.maxMin2(intArray6, 0);
        int[] intArray10 = ds.MaxMin2.maxMin2(intArray8, (int) (byte) -1);
        int[] intArray12 = ds.MaxMin2.maxMin2(intArray10, 0);
        int[] intArray14 = ds.MaxMin2.maxMin2(intArray10, (int) (byte) 1);
        int[] intArray16 = ds.MaxMin2.maxMin2(intArray14, 1);
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
    public void test269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test269");
        int[] intArray4 = new int[] { (byte) 0, 10, '#', (short) 0 };
        int[] intArray6 = ds.MaxMin2.maxMin2(intArray4, (int) (short) 1);
        int[] intArray8 = ds.MaxMin2.maxMin2(intArray6, 0);
        int[] intArray10 = ds.MaxMin2.maxMin2(intArray6, (int) (byte) 0);
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
    public void test270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test270");
        int[] intArray6 = new int[] { (byte) -1, (byte) 1, ' ', (short) 10, (short) 1, (byte) 1 };
        int[] intArray8 = ds.MaxMin2.maxMin2(intArray6, (int) (byte) 0);
        int[] intArray10 = ds.MaxMin2.maxMin2(intArray6, (int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray12 = ds.MaxMin2.maxMin2(intArray6, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 6");
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
    public void test271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test271");
        int[] intArray4 = new int[] { (byte) 0, 10, '#', (short) 0 };
        int[] intArray6 = ds.MaxMin2.maxMin2(intArray4, (int) (short) 1);
        int[] intArray8 = ds.MaxMin2.maxMin2(intArray6, 0);
        int[] intArray10 = ds.MaxMin2.maxMin2(intArray8, (int) (byte) -1);
        int[] intArray12 = ds.MaxMin2.maxMin2(intArray10, 0);
        int[] intArray14 = ds.MaxMin2.maxMin2(intArray12, 0);
        int[] intArray16 = ds.MaxMin2.maxMin2(intArray14, (int) (short) 1);
        int[] intArray18 = ds.MaxMin2.maxMin2(intArray16, (int) (short) 0);
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
    public void test272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test272");
        int[] intArray4 = new int[] { (byte) 0, 10, '#', (short) 0 };
        int[] intArray6 = ds.MaxMin2.maxMin2(intArray4, (int) (short) 1);
        int[] intArray8 = ds.MaxMin2.maxMin2(intArray6, 0);
        int[] intArray10 = ds.MaxMin2.maxMin2(intArray8, 0);
        int[] intArray12 = ds.MaxMin2.maxMin2(intArray8, 0);
        int[] intArray14 = ds.MaxMin2.maxMin2(intArray12, (int) (byte) 0);
        int[] intArray16 = ds.MaxMin2.maxMin2(intArray14, (int) (byte) -1);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray18 = ds.MaxMin2.maxMin2(intArray14, (int) (short) 100);
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
    public void test273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test273");
        int[] intArray4 = new int[] { (byte) 0, 10, '#', (short) 0 };
        int[] intArray6 = ds.MaxMin2.maxMin2(intArray4, (int) (short) 1);
        int[] intArray8 = ds.MaxMin2.maxMin2(intArray6, 0);
        int[] intArray10 = ds.MaxMin2.maxMin2(intArray8, (int) (byte) -1);
        int[] intArray12 = ds.MaxMin2.maxMin2(intArray10, 0);
        int[] intArray14 = ds.MaxMin2.maxMin2(intArray12, (int) (short) 1);
        int[] intArray16 = ds.MaxMin2.maxMin2(intArray14, (int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray18 = ds.MaxMin2.maxMin2(intArray16, (int) ' ');
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
    public void test274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test274");
        int[] intArray4 = new int[] { (byte) 0, 10, '#', (short) 0 };
        int[] intArray6 = ds.MaxMin2.maxMin2(intArray4, (int) (short) 1);
        int[] intArray8 = ds.MaxMin2.maxMin2(intArray4, (int) (byte) -1);
        int[] intArray10 = ds.MaxMin2.maxMin2(intArray8, (int) (short) 0);
        java.lang.Class<?> wildcardClass11 = intArray8.getClass();
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
    public void test275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test275");
        int[] intArray4 = new int[] { (byte) 0, 10, '#', (short) 0 };
        int[] intArray6 = ds.MaxMin2.maxMin2(intArray4, (int) (short) 1);
        int[] intArray8 = ds.MaxMin2.maxMin2(intArray6, 0);
        int[] intArray10 = ds.MaxMin2.maxMin2(intArray8, (int) (byte) -1);
        int[] intArray12 = ds.MaxMin2.maxMin2(intArray10, 0);
        int[] intArray14 = ds.MaxMin2.maxMin2(intArray12, (int) (short) 1);
        int[] intArray16 = ds.MaxMin2.maxMin2(intArray14, 0);
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
    public void test276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test276");
        int[] intArray4 = new int[] { (byte) 0, 10, '#', (short) 0 };
        int[] intArray6 = ds.MaxMin2.maxMin2(intArray4, (int) (short) 1);
        int[] intArray8 = ds.MaxMin2.maxMin2(intArray6, 0);
        int[] intArray10 = ds.MaxMin2.maxMin2(intArray8, (int) (byte) -1);
        int[] intArray12 = ds.MaxMin2.maxMin2(intArray10, 0);
        int[] intArray14 = ds.MaxMin2.maxMin2(intArray12, 0);
        int[] intArray16 = ds.MaxMin2.maxMin2(intArray14, (int) (short) 1);
        int[] intArray18 = ds.MaxMin2.maxMin2(intArray16, (int) (short) 0);
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
    public void test277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test277");
        int[] intArray4 = new int[] { (byte) 0, 10, '#', (short) 0 };
        int[] intArray6 = ds.MaxMin2.maxMin2(intArray4, (int) (short) 1);
        int[] intArray8 = ds.MaxMin2.maxMin2(intArray4, (int) (short) 1);
        int[] intArray10 = ds.MaxMin2.maxMin2(intArray8, (int) (byte) -1);
        int[] intArray12 = ds.MaxMin2.maxMin2(intArray10, 1);
        int[] intArray14 = ds.MaxMin2.maxMin2(intArray10, 1);
        int[] intArray16 = ds.MaxMin2.maxMin2(intArray10, (-1));
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray18 = ds.MaxMin2.maxMin2(intArray10, (int) (byte) 10);
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
    public void test278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test278");
        int[] intArray4 = new int[] { (byte) 0, 10, '#', (short) 0 };
        int[] intArray6 = ds.MaxMin2.maxMin2(intArray4, (int) (short) 1);
        int[] intArray8 = ds.MaxMin2.maxMin2(intArray6, 0);
        int[] intArray10 = ds.MaxMin2.maxMin2(intArray8, 0);
        int[] intArray12 = ds.MaxMin2.maxMin2(intArray8, 0);
        int[] intArray14 = ds.MaxMin2.maxMin2(intArray12, (int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray16 = ds.MaxMin2.maxMin2(intArray14, (int) '4');
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
    public void test279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test279");
        int[] intArray4 = new int[] { (byte) 0, 10, '#', (short) 0 };
        int[] intArray6 = ds.MaxMin2.maxMin2(intArray4, (int) (short) 1);
        int[] intArray8 = ds.MaxMin2.maxMin2(intArray4, (int) (short) 1);
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
    public void test280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test280");
        int[] intArray4 = new int[] { (byte) 0, 10, '#', (short) 0 };
        int[] intArray6 = ds.MaxMin2.maxMin2(intArray4, (int) (short) 1);
        int[] intArray8 = ds.MaxMin2.maxMin2(intArray6, 0);
        int[] intArray10 = ds.MaxMin2.maxMin2(intArray8, (int) (byte) -1);
        int[] intArray12 = ds.MaxMin2.maxMin2(intArray10, 0);
        int[] intArray14 = ds.MaxMin2.maxMin2(intArray10, (int) (short) 0);
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
    public void test281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test281");
        int[] intArray4 = new int[] { (byte) 0, 10, '#', (short) 0 };
        int[] intArray6 = ds.MaxMin2.maxMin2(intArray4, (int) (short) 1);
        int[] intArray8 = ds.MaxMin2.maxMin2(intArray6, 0);
        int[] intArray10 = ds.MaxMin2.maxMin2(intArray8, (int) (byte) -1);
        int[] intArray12 = ds.MaxMin2.maxMin2(intArray10, 0);
        int[] intArray14 = ds.MaxMin2.maxMin2(intArray12, 0);
        int[] intArray16 = ds.MaxMin2.maxMin2(intArray14, (-1));
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray18 = ds.MaxMin2.maxMin2(intArray14, 10);
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
    public void test282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test282");
        int[] intArray4 = new int[] { (byte) 0, 10, '#', (short) 0 };
        int[] intArray6 = ds.MaxMin2.maxMin2(intArray4, (int) (short) 1);
        int[] intArray8 = ds.MaxMin2.maxMin2(intArray6, 0);
        int[] intArray10 = ds.MaxMin2.maxMin2(intArray8, (int) (byte) -1);
        int[] intArray12 = ds.MaxMin2.maxMin2(intArray10, 0);
        int[] intArray14 = ds.MaxMin2.maxMin2(intArray12, (int) (short) 0);
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
    public void test283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test283");
        int[] intArray4 = new int[] { (byte) 0, 10, '#', (short) 0 };
        int[] intArray6 = ds.MaxMin2.maxMin2(intArray4, (int) (short) 1);
        int[] intArray8 = ds.MaxMin2.maxMin2(intArray4, (int) (short) 1);
        int[] intArray10 = ds.MaxMin2.maxMin2(intArray8, (int) (byte) -1);
        int[] intArray12 = ds.MaxMin2.maxMin2(intArray10, 0);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray14 = ds.MaxMin2.maxMin2(intArray12, (int) (byte) 100);
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
    public void test284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test284");
        int[] intArray6 = new int[] { (byte) -1, (byte) 1, ' ', (short) 10, (short) 1, (byte) 1 };
        int[] intArray8 = ds.MaxMin2.maxMin2(intArray6, (int) (byte) 0);
        int[] intArray10 = ds.MaxMin2.maxMin2(intArray6, (int) (byte) 0);
        int[] intArray12 = ds.MaxMin2.maxMin2(intArray10, (int) (short) 0);
        int[] intArray14 = ds.MaxMin2.maxMin2(intArray10, (int) (short) -1);
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
    public void test285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test285");
        int[] intArray4 = new int[] { (byte) 0, 10, '#', (short) 0 };
        int[] intArray6 = ds.MaxMin2.maxMin2(intArray4, (int) (short) 1);
        int[] intArray8 = ds.MaxMin2.maxMin2(intArray6, 0);
        int[] intArray10 = ds.MaxMin2.maxMin2(intArray8, 0);
        int[] intArray12 = ds.MaxMin2.maxMin2(intArray8, 0);
        int[] intArray14 = ds.MaxMin2.maxMin2(intArray12, 0);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray16 = ds.MaxMin2.maxMin2(intArray12, (int) (byte) 100);
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
    public void test286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test286");
        int[] intArray6 = new int[] { (byte) -1, (byte) 1, ' ', (short) 10, (short) 1, (byte) 1 };
        int[] intArray8 = ds.MaxMin2.maxMin2(intArray6, (int) (byte) 0);
        int[] intArray10 = ds.MaxMin2.maxMin2(intArray6, (int) (byte) 1);
        int[] intArray12 = ds.MaxMin2.maxMin2(intArray10, (int) (byte) 1);
        int[] intArray14 = ds.MaxMin2.maxMin2(intArray10, 0);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray16 = ds.MaxMin2.maxMin2(intArray10, (int) ' ');
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
    public void test287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test287");
        int[] intArray6 = new int[] { (byte) -1, (byte) 1, ' ', (short) 10, (short) 1, (byte) 1 };
        int[] intArray8 = ds.MaxMin2.maxMin2(intArray6, (int) (byte) 0);
        int[] intArray10 = ds.MaxMin2.maxMin2(intArray6, (int) (short) 1);
        int[] intArray12 = ds.MaxMin2.maxMin2(intArray10, (-1));
        int[] intArray14 = ds.MaxMin2.maxMin2(intArray12, (int) (short) -1);
        int[] intArray16 = ds.MaxMin2.maxMin2(intArray14, (-1));
        int[] intArray18 = ds.MaxMin2.maxMin2(intArray14, 0);
        int[] intArray20 = ds.MaxMin2.maxMin2(intArray14, 1);
        java.lang.Class<?> wildcardClass21 = intArray14.getClass();
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
    public void test288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test288");
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
    public void test289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test289");
        int[] intArray4 = new int[] { (byte) 0, 10, '#', (short) 0 };
        int[] intArray6 = ds.MaxMin2.maxMin2(intArray4, (int) (short) 1);
        int[] intArray8 = ds.MaxMin2.maxMin2(intArray6, 0);
        int[] intArray10 = ds.MaxMin2.maxMin2(intArray8, (int) (byte) -1);
        int[] intArray12 = ds.MaxMin2.maxMin2(intArray10, 0);
        int[] intArray14 = ds.MaxMin2.maxMin2(intArray12, (int) (short) 1);
        int[] intArray16 = ds.MaxMin2.maxMin2(intArray14, (int) (byte) 1);
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
    public void test290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test290");
        int[] intArray4 = new int[] { (byte) 0, 10, '#', (short) 0 };
        int[] intArray6 = ds.MaxMin2.maxMin2(intArray4, (int) (short) 1);
        int[] intArray8 = ds.MaxMin2.maxMin2(intArray6, 0);
        int[] intArray10 = ds.MaxMin2.maxMin2(intArray8, 0);
        int[] intArray12 = ds.MaxMin2.maxMin2(intArray8, 0);
        int[] intArray14 = ds.MaxMin2.maxMin2(intArray12, 0);
        int[] intArray16 = ds.MaxMin2.maxMin2(intArray14, (-1));
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
    public void test291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test291");
        int[] intArray4 = new int[] { (byte) 0, 10, '#', (short) 0 };
        int[] intArray6 = ds.MaxMin2.maxMin2(intArray4, (int) (short) 1);
        int[] intArray8 = ds.MaxMin2.maxMin2(intArray4, (int) (short) 0);
        int[] intArray10 = ds.MaxMin2.maxMin2(intArray4, (int) (byte) -1);
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
    public void test292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test292");
        int[] intArray4 = new int[] { (byte) 0, 10, '#', (short) 0 };
        int[] intArray6 = ds.MaxMin2.maxMin2(intArray4, (int) (short) 1);
        int[] intArray8 = ds.MaxMin2.maxMin2(intArray6, 0);
        int[] intArray10 = ds.MaxMin2.maxMin2(intArray6, (int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray12 = ds.MaxMin2.maxMin2(intArray6, (int) '4');
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
    public void test293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test293");
        int[] intArray6 = new int[] { (byte) -1, (byte) 1, ' ', (short) 10, (short) 1, (byte) 1 };
        int[] intArray8 = ds.MaxMin2.maxMin2(intArray6, (int) (byte) 0);
        int[] intArray10 = ds.MaxMin2.maxMin2(intArray6, (int) (byte) 0);
        int[] intArray12 = ds.MaxMin2.maxMin2(intArray10, (int) (short) 0);
        int[] intArray14 = ds.MaxMin2.maxMin2(intArray12, (int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray16 = ds.MaxMin2.maxMin2(intArray12, 100);
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
    public void test294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test294");
        int[] intArray4 = new int[] { (byte) 0, 10, '#', (short) 0 };
        int[] intArray6 = ds.MaxMin2.maxMin2(intArray4, (int) (short) 1);
        int[] intArray8 = ds.MaxMin2.maxMin2(intArray6, 0);
        int[] intArray10 = ds.MaxMin2.maxMin2(intArray8, (int) (byte) -1);
        int[] intArray12 = ds.MaxMin2.maxMin2(intArray10, 0);
        int[] intArray14 = ds.MaxMin2.maxMin2(intArray12, 0);
        int[] intArray16 = ds.MaxMin2.maxMin2(intArray14, (int) (byte) 1);
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
    public void test295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test295");
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
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray26 = ds.MaxMin2.maxMin2(intArray22, (int) 'a');
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
    public void test296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test296");
        int[] intArray6 = new int[] { (byte) -1, (byte) 1, ' ', (short) 10, (short) 1, (byte) 1 };
        int[] intArray8 = ds.MaxMin2.maxMin2(intArray6, (int) (byte) 0);
        int[] intArray10 = ds.MaxMin2.maxMin2(intArray6, (int) (short) 1);
        int[] intArray12 = ds.MaxMin2.maxMin2(intArray10, (-1));
        int[] intArray14 = ds.MaxMin2.maxMin2(intArray10, (int) (byte) 0);
        int[] intArray16 = ds.MaxMin2.maxMin2(intArray10, 1);
        int[] intArray18 = ds.MaxMin2.maxMin2(intArray16, 0);
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
    public void test297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test297");
        int[] intArray6 = new int[] { (byte) -1, (byte) 1, ' ', (short) 10, (short) 1, (byte) 1 };
        int[] intArray8 = ds.MaxMin2.maxMin2(intArray6, (int) (byte) 0);
        int[] intArray10 = ds.MaxMin2.maxMin2(intArray6, (int) (short) 1);
        int[] intArray12 = ds.MaxMin2.maxMin2(intArray10, (-1));
        int[] intArray14 = ds.MaxMin2.maxMin2(intArray12, (int) (short) -1);
        int[] intArray16 = ds.MaxMin2.maxMin2(intArray14, (-1));
        int[] intArray18 = ds.MaxMin2.maxMin2(intArray14, 0);
        int[] intArray20 = ds.MaxMin2.maxMin2(intArray14, (int) (short) 1);
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
    public void test298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test298");
        int[] intArray4 = new int[] { (byte) 0, 10, '#', (short) 0 };
        int[] intArray6 = ds.MaxMin2.maxMin2(intArray4, (int) (short) 1);
        int[] intArray8 = ds.MaxMin2.maxMin2(intArray6, 0);
        int[] intArray10 = ds.MaxMin2.maxMin2(intArray8, (int) (byte) -1);
        int[] intArray12 = ds.MaxMin2.maxMin2(intArray10, 0);
        int[] intArray14 = ds.MaxMin2.maxMin2(intArray12, 0);
        int[] intArray16 = ds.MaxMin2.maxMin2(intArray14, (int) (short) 1);
        int[] intArray18 = ds.MaxMin2.maxMin2(intArray14, 0);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray20 = ds.MaxMin2.maxMin2(intArray18, (int) (short) 10);
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
    public void test299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test299");
        int[] intArray6 = new int[] { (byte) -1, (byte) 1, ' ', (short) 10, (short) 1, (byte) 1 };
        int[] intArray8 = ds.MaxMin2.maxMin2(intArray6, (int) (byte) 0);
        int[] intArray10 = ds.MaxMin2.maxMin2(intArray6, (int) (short) 1);
        int[] intArray12 = ds.MaxMin2.maxMin2(intArray10, (-1));
        int[] intArray14 = ds.MaxMin2.maxMin2(intArray10, (int) (byte) 0);
        int[] intArray16 = ds.MaxMin2.maxMin2(intArray10, 1);
        int[] intArray18 = ds.MaxMin2.maxMin2(intArray16, 0);
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
    public void test300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test300");
        int[] intArray6 = new int[] { (byte) -1, (byte) 1, ' ', (short) 10, (short) 1, (byte) 1 };
        int[] intArray8 = ds.MaxMin2.maxMin2(intArray6, (int) (byte) 0);
        int[] intArray10 = ds.MaxMin2.maxMin2(intArray6, (int) (byte) 1);
        int[] intArray12 = ds.MaxMin2.maxMin2(intArray10, (int) (byte) 1);
        int[] intArray14 = ds.MaxMin2.maxMin2(intArray12, (int) (byte) -1);
        int[] intArray16 = ds.MaxMin2.maxMin2(intArray12, (int) (short) 1);
        int[] intArray18 = ds.MaxMin2.maxMin2(intArray12, (int) (byte) -1);
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
    public void test301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test301");
        int[] intArray4 = new int[] { (byte) 0, 10, '#', (short) 0 };
        int[] intArray6 = ds.MaxMin2.maxMin2(intArray4, (int) (short) 1);
        int[] intArray8 = ds.MaxMin2.maxMin2(intArray4, 0);
        int[] intArray10 = ds.MaxMin2.maxMin2(intArray8, 1);
        java.lang.Class<?> wildcardClass11 = intArray8.getClass();
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
    public void test302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test302");
        int[] intArray4 = new int[] { (byte) 0, 10, '#', (short) 0 };
        int[] intArray6 = ds.MaxMin2.maxMin2(intArray4, (int) (short) 1);
        int[] intArray8 = ds.MaxMin2.maxMin2(intArray4, (int) (short) 1);
        int[] intArray10 = ds.MaxMin2.maxMin2(intArray8, (int) (byte) 1);
        java.lang.Class<?> wildcardClass11 = intArray8.getClass();
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
    public void test303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test303");
        int[] intArray4 = new int[] { (byte) 0, 10, '#', (short) 0 };
        int[] intArray6 = ds.MaxMin2.maxMin2(intArray4, (int) (short) 1);
        int[] intArray8 = ds.MaxMin2.maxMin2(intArray4, (int) (short) 1);
        int[] intArray10 = ds.MaxMin2.maxMin2(intArray8, (int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray12 = ds.MaxMin2.maxMin2(intArray10, (int) (short) 10);
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
    public void test304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test304");
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
            int[] intArray20 = ds.MaxMin2.maxMin2(intArray16, (int) '#');
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
    public void test305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test305");
        int[] intArray6 = new int[] { (byte) -1, (byte) 1, ' ', (short) 10, (short) 1, (byte) 1 };
        int[] intArray8 = ds.MaxMin2.maxMin2(intArray6, (int) (byte) 0);
        int[] intArray10 = ds.MaxMin2.maxMin2(intArray6, (int) (short) 1);
        int[] intArray12 = ds.MaxMin2.maxMin2(intArray10, (-1));
        int[] intArray14 = ds.MaxMin2.maxMin2(intArray10, (int) (byte) 0);
        int[] intArray16 = ds.MaxMin2.maxMin2(intArray10, 1);
        int[] intArray18 = ds.MaxMin2.maxMin2(intArray16, (int) (byte) -1);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray20 = ds.MaxMin2.maxMin2(intArray16, (int) ' ');
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
    public void test306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test306");
        int[] intArray4 = new int[] { (byte) 0, 10, '#', (short) 0 };
        int[] intArray6 = ds.MaxMin2.maxMin2(intArray4, (int) (short) 1);
        int[] intArray8 = ds.MaxMin2.maxMin2(intArray6, 0);
        int[] intArray10 = ds.MaxMin2.maxMin2(intArray8, 0);
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
    public void test307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test307");
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
    public void test308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test308");
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
            int[] intArray24 = ds.MaxMin2.maxMin2(intArray20, (int) '4');
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
    public void test309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test309");
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
    public void test310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test310");
        int[] intArray4 = new int[] { (byte) 0, 10, '#', (short) 0 };
        int[] intArray6 = ds.MaxMin2.maxMin2(intArray4, (int) (short) 1);
        int[] intArray8 = ds.MaxMin2.maxMin2(intArray6, 0);
        int[] intArray10 = ds.MaxMin2.maxMin2(intArray8, (int) (byte) -1);
        int[] intArray12 = ds.MaxMin2.maxMin2(intArray10, 0);
        int[] intArray14 = ds.MaxMin2.maxMin2(intArray10, (int) (byte) 1);
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
    public void test311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test311");
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
            int[] intArray22 = ds.MaxMin2.maxMin2(intArray18, (int) 'a');
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
    public void test312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test312");
        int[] intArray6 = new int[] { (byte) -1, (byte) 1, ' ', (short) 10, (short) 1, (byte) 1 };
        int[] intArray8 = ds.MaxMin2.maxMin2(intArray6, (int) (byte) 0);
        int[] intArray10 = ds.MaxMin2.maxMin2(intArray6, (int) (byte) 0);
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
    public void test313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test313");
        int[] intArray6 = new int[] { (byte) -1, (byte) 1, ' ', (short) 10, (short) 1, (byte) 1 };
        int[] intArray8 = ds.MaxMin2.maxMin2(intArray6, (int) (byte) 0);
        int[] intArray10 = ds.MaxMin2.maxMin2(intArray6, (int) (short) 1);
        int[] intArray12 = ds.MaxMin2.maxMin2(intArray10, (-1));
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray14 = ds.MaxMin2.maxMin2(intArray12, (int) (short) 100);
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
    public void test314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test314");
        int[] intArray6 = new int[] { (byte) -1, (byte) 1, ' ', (short) 10, (short) 1, (byte) 1 };
        int[] intArray8 = ds.MaxMin2.maxMin2(intArray6, (int) (byte) 0);
        int[] intArray10 = ds.MaxMin2.maxMin2(intArray6, (int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray12 = ds.MaxMin2.maxMin2(intArray10, (int) (byte) 100);
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
    public void test315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test315");
        int[] intArray4 = new int[] { (byte) 0, 10, '#', (short) 0 };
        int[] intArray6 = ds.MaxMin2.maxMin2(intArray4, (int) (short) 1);
        int[] intArray8 = ds.MaxMin2.maxMin2(intArray6, 0);
        int[] intArray10 = ds.MaxMin2.maxMin2(intArray8, (int) (byte) -1);
        int[] intArray12 = ds.MaxMin2.maxMin2(intArray10, 0);
        int[] intArray14 = ds.MaxMin2.maxMin2(intArray12, 1);
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
    public void test316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test316");
        int[] intArray6 = new int[] { (byte) -1, (byte) 1, ' ', (short) 10, (short) 1, (byte) 1 };
        int[] intArray8 = ds.MaxMin2.maxMin2(intArray6, (int) (byte) 0);
        int[] intArray10 = ds.MaxMin2.maxMin2(intArray6, (int) (short) 1);
        int[] intArray12 = ds.MaxMin2.maxMin2(intArray10, (-1));
        int[] intArray14 = ds.MaxMin2.maxMin2(intArray12, (int) (short) -1);
        int[] intArray16 = ds.MaxMin2.maxMin2(intArray14, (-1));
        int[] intArray18 = ds.MaxMin2.maxMin2(intArray16, (int) (short) 1);
        int[] intArray20 = ds.MaxMin2.maxMin2(intArray16, (int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray22 = ds.MaxMin2.maxMin2(intArray20, (int) '4');
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
    public void test317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test317");
        int[] intArray4 = new int[] { (byte) 0, 10, '#', (short) 0 };
        int[] intArray6 = ds.MaxMin2.maxMin2(intArray4, (int) (short) 1);
        int[] intArray8 = ds.MaxMin2.maxMin2(intArray4, (int) (short) 1);
        int[] intArray10 = ds.MaxMin2.maxMin2(intArray8, (int) (byte) -1);
        int[] intArray12 = ds.MaxMin2.maxMin2(intArray10, 1);
        int[] intArray14 = ds.MaxMin2.maxMin2(intArray10, 1);
        int[] intArray16 = ds.MaxMin2.maxMin2(intArray10, (int) (short) -1);
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
    public void test318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test318");
        int[] intArray4 = new int[] { (byte) 0, 10, '#', (short) 0 };
        int[] intArray6 = ds.MaxMin2.maxMin2(intArray4, (int) (short) 1);
        int[] intArray8 = ds.MaxMin2.maxMin2(intArray4, (int) (short) 1);
        int[] intArray10 = ds.MaxMin2.maxMin2(intArray8, (int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray12 = ds.MaxMin2.maxMin2(intArray10, 10);
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
    public void test319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test319");
        int[] intArray4 = new int[] { (byte) 0, 10, '#', (short) 0 };
        int[] intArray6 = ds.MaxMin2.maxMin2(intArray4, (int) (short) 1);
        int[] intArray8 = ds.MaxMin2.maxMin2(intArray6, 0);
        int[] intArray10 = ds.MaxMin2.maxMin2(intArray8, (int) (byte) -1);
        int[] intArray12 = ds.MaxMin2.maxMin2(intArray10, 0);
        int[] intArray14 = ds.MaxMin2.maxMin2(intArray12, (int) (short) 1);
        int[] intArray16 = ds.MaxMin2.maxMin2(intArray14, 0);
        int[] intArray18 = ds.MaxMin2.maxMin2(intArray16, (int) (short) -1);
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
    public void test320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test320");
        int[] intArray4 = new int[] { (byte) 0, 10, '#', (short) 0 };
        int[] intArray6 = ds.MaxMin2.maxMin2(intArray4, (int) (short) 1);
        int[] intArray8 = ds.MaxMin2.maxMin2(intArray6, 0);
        int[] intArray10 = ds.MaxMin2.maxMin2(intArray8, (int) (byte) -1);
        int[] intArray12 = ds.MaxMin2.maxMin2(intArray10, 0);
        int[] intArray14 = ds.MaxMin2.maxMin2(intArray12, 1);
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
    public void test321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test321");
        int[] intArray6 = new int[] { (byte) -1, (byte) 1, ' ', (short) 10, (short) 1, (byte) 1 };
        int[] intArray8 = ds.MaxMin2.maxMin2(intArray6, (int) (byte) 0);
        int[] intArray10 = ds.MaxMin2.maxMin2(intArray6, (int) (short) 1);
        int[] intArray12 = ds.MaxMin2.maxMin2(intArray10, (-1));
        int[] intArray14 = ds.MaxMin2.maxMin2(intArray10, (int) (byte) 0);
        int[] intArray16 = ds.MaxMin2.maxMin2(intArray10, 1);
        int[] intArray18 = ds.MaxMin2.maxMin2(intArray16, 0);
        int[] intArray20 = ds.MaxMin2.maxMin2(intArray18, 0);
        int[] intArray22 = ds.MaxMin2.maxMin2(intArray18, 1);
        java.lang.Class<?> wildcardClass23 = intArray18.getClass();
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
    public void test322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test322");
        int[] intArray6 = new int[] { (byte) -1, (byte) 1, ' ', (short) 10, (short) 1, (byte) 1 };
        int[] intArray8 = ds.MaxMin2.maxMin2(intArray6, (int) (byte) 0);
        int[] intArray10 = ds.MaxMin2.maxMin2(intArray6, (int) (short) 1);
        int[] intArray12 = ds.MaxMin2.maxMin2(intArray10, (-1));
        int[] intArray14 = ds.MaxMin2.maxMin2(intArray12, (int) (short) -1);
        int[] intArray16 = ds.MaxMin2.maxMin2(intArray14, (-1));
        int[] intArray18 = ds.MaxMin2.maxMin2(intArray14, 0);
        int[] intArray20 = ds.MaxMin2.maxMin2(intArray14, 1);
        int[] intArray22 = ds.MaxMin2.maxMin2(intArray20, (int) (byte) 1);
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
    public void test323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test323");
        int[] intArray4 = new int[] { (byte) 0, 10, '#', (short) 0 };
        int[] intArray6 = ds.MaxMin2.maxMin2(intArray4, (int) (short) 1);
        int[] intArray8 = ds.MaxMin2.maxMin2(intArray6, 0);
        int[] intArray10 = ds.MaxMin2.maxMin2(intArray8, 0);
        int[] intArray12 = ds.MaxMin2.maxMin2(intArray8, 0);
        int[] intArray14 = ds.MaxMin2.maxMin2(intArray12, (int) (byte) 0);
        int[] intArray16 = ds.MaxMin2.maxMin2(intArray14, (int) (byte) -1);
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
    public void test324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test324");
        int[] intArray4 = new int[] { (byte) 0, 10, '#', (short) 0 };
        int[] intArray6 = ds.MaxMin2.maxMin2(intArray4, (int) (short) 1);
        int[] intArray8 = ds.MaxMin2.maxMin2(intArray6, 0);
        int[] intArray10 = ds.MaxMin2.maxMin2(intArray8, 0);
        int[] intArray12 = ds.MaxMin2.maxMin2(intArray8, 0);
        int[] intArray14 = ds.MaxMin2.maxMin2(intArray12, 0);
        int[] intArray16 = ds.MaxMin2.maxMin2(intArray14, (-1));
        int[] intArray18 = ds.MaxMin2.maxMin2(intArray16, 1);
        int[] intArray20 = ds.MaxMin2.maxMin2(intArray16, (int) (short) 0);
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
    public void test325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test325");
        int[] intArray4 = new int[] { (byte) 0, 10, '#', (short) 0 };
        int[] intArray6 = ds.MaxMin2.maxMin2(intArray4, (int) (short) 1);
        int[] intArray8 = ds.MaxMin2.maxMin2(intArray6, 0);
        int[] intArray10 = ds.MaxMin2.maxMin2(intArray8, (int) (byte) -1);
        int[] intArray12 = ds.MaxMin2.maxMin2(intArray10, 0);
        int[] intArray14 = ds.MaxMin2.maxMin2(intArray10, (int) (byte) 1);
        int[] intArray16 = ds.MaxMin2.maxMin2(intArray14, 1);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray18 = ds.MaxMin2.maxMin2(intArray14, (int) (byte) 10);
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
    public void test326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test326");
        int[] intArray4 = new int[] { (byte) 0, 10, '#', (short) 0 };
        int[] intArray6 = ds.MaxMin2.maxMin2(intArray4, (int) (short) 1);
        int[] intArray8 = ds.MaxMin2.maxMin2(intArray4, (int) (short) 1);
        int[] intArray10 = ds.MaxMin2.maxMin2(intArray8, (int) (byte) -1);
        int[] intArray12 = ds.MaxMin2.maxMin2(intArray10, 0);
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
    public void test327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test327");
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
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray24 = ds.MaxMin2.maxMin2(intArray22, (int) '4');
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
    public void test328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test328");
        int[] intArray6 = new int[] { (byte) -1, (byte) 1, ' ', (short) 10, (short) 1, (byte) 1 };
        int[] intArray8 = ds.MaxMin2.maxMin2(intArray6, (int) (byte) 0);
        int[] intArray10 = ds.MaxMin2.maxMin2(intArray8, (int) (short) -1);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray12 = ds.MaxMin2.maxMin2(intArray8, (int) ' ');
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
    public void test329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test329");
        int[] intArray4 = new int[] { (byte) 0, 10, '#', (short) 0 };
        int[] intArray6 = ds.MaxMin2.maxMin2(intArray4, (int) (short) 1);
        int[] intArray8 = ds.MaxMin2.maxMin2(intArray6, 0);
        int[] intArray10 = ds.MaxMin2.maxMin2(intArray8, (int) (byte) -1);
        int[] intArray12 = ds.MaxMin2.maxMin2(intArray10, 0);
        int[] intArray14 = ds.MaxMin2.maxMin2(intArray12, 1);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray16 = ds.MaxMin2.maxMin2(intArray14, (int) '#');
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
    public void test330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test330");
        int[] intArray4 = new int[] { (byte) 0, 10, '#', (short) 0 };
        int[] intArray6 = ds.MaxMin2.maxMin2(intArray4, (int) (short) 1);
        int[] intArray8 = ds.MaxMin2.maxMin2(intArray6, 0);
        int[] intArray10 = ds.MaxMin2.maxMin2(intArray6, (int) (byte) 0);
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
    public void test331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test331");
        int[] intArray4 = new int[] { (byte) 0, 10, '#', (short) 0 };
        int[] intArray6 = ds.MaxMin2.maxMin2(intArray4, (int) (short) 1);
        int[] intArray8 = ds.MaxMin2.maxMin2(intArray6, 0);
        int[] intArray10 = ds.MaxMin2.maxMin2(intArray8, (int) (byte) -1);
        int[] intArray12 = ds.MaxMin2.maxMin2(intArray10, 0);
        int[] intArray14 = ds.MaxMin2.maxMin2(intArray10, (int) (short) 0);
        int[] intArray16 = ds.MaxMin2.maxMin2(intArray14, 1);
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
    public void test332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test332");
        int[] intArray4 = new int[] { (byte) 0, 10, '#', (short) 0 };
        int[] intArray6 = ds.MaxMin2.maxMin2(intArray4, (int) (short) 1);
        int[] intArray8 = ds.MaxMin2.maxMin2(intArray6, 0);
        int[] intArray10 = ds.MaxMin2.maxMin2(intArray8, 0);
        int[] intArray12 = ds.MaxMin2.maxMin2(intArray8, 0);
        int[] intArray14 = ds.MaxMin2.maxMin2(intArray12, 0);
        int[] intArray16 = ds.MaxMin2.maxMin2(intArray14, (-1));
        int[] intArray18 = ds.MaxMin2.maxMin2(intArray16, 0);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray20 = ds.MaxMin2.maxMin2(intArray16, (int) (byte) 100);
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
    public void test333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test333");
        int[] intArray4 = new int[] { (byte) 0, 10, '#', (short) 0 };
        int[] intArray6 = ds.MaxMin2.maxMin2(intArray4, (int) (short) 1);
        int[] intArray8 = ds.MaxMin2.maxMin2(intArray6, 0);
        int[] intArray10 = ds.MaxMin2.maxMin2(intArray8, (int) (byte) -1);
        int[] intArray12 = ds.MaxMin2.maxMin2(intArray10, 0);
        int[] intArray14 = ds.MaxMin2.maxMin2(intArray12, (int) (short) 1);
        int[] intArray16 = ds.MaxMin2.maxMin2(intArray14, (int) (byte) 1);
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
    public void test334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test334");
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
            int[] intArray20 = ds.MaxMin2.maxMin2(intArray18, 10);
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
    public void test335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test335");
        int[] intArray6 = new int[] { (byte) -1, (byte) 1, ' ', (short) 10, (short) 1, (byte) 1 };
        int[] intArray8 = ds.MaxMin2.maxMin2(intArray6, (int) (byte) 0);
        int[] intArray10 = ds.MaxMin2.maxMin2(intArray6, (int) (byte) 1);
        int[] intArray12 = ds.MaxMin2.maxMin2(intArray10, (int) (byte) 1);
        int[] intArray14 = ds.MaxMin2.maxMin2(intArray12, (int) (byte) -1);
        int[] intArray16 = ds.MaxMin2.maxMin2(intArray12, (int) (short) 1);
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
    public void test336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test336");
        int[] intArray6 = new int[] { (byte) -1, (byte) 1, ' ', (short) 10, (short) 1, (byte) 1 };
        int[] intArray8 = ds.MaxMin2.maxMin2(intArray6, (int) (byte) 0);
        int[] intArray10 = ds.MaxMin2.maxMin2(intArray6, (int) (short) 1);
        int[] intArray12 = ds.MaxMin2.maxMin2(intArray10, (-1));
        int[] intArray14 = ds.MaxMin2.maxMin2(intArray12, (int) (short) -1);
        int[] intArray16 = ds.MaxMin2.maxMin2(intArray14, (-1));
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
    public void test337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test337");
        int[] intArray4 = new int[] { (byte) 0, 10, '#', (short) 0 };
        int[] intArray6 = ds.MaxMin2.maxMin2(intArray4, (int) (short) 1);
        int[] intArray8 = ds.MaxMin2.maxMin2(intArray6, 0);
        int[] intArray10 = ds.MaxMin2.maxMin2(intArray8, (int) (byte) -1);
        int[] intArray12 = ds.MaxMin2.maxMin2(intArray10, 0);
        int[] intArray14 = ds.MaxMin2.maxMin2(intArray12, 0);
        int[] intArray16 = ds.MaxMin2.maxMin2(intArray14, (int) (short) 1);
        int[] intArray18 = ds.MaxMin2.maxMin2(intArray14, 0);
        int[] intArray20 = ds.MaxMin2.maxMin2(intArray18, (int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray22 = ds.MaxMin2.maxMin2(intArray18, (int) ' ');
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
    public void test338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test338");
        int[] intArray6 = new int[] { (byte) -1, (byte) 1, ' ', (short) 10, (short) 1, (byte) 1 };
        int[] intArray8 = ds.MaxMin2.maxMin2(intArray6, (int) (byte) 0);
        int[] intArray10 = ds.MaxMin2.maxMin2(intArray6, (int) (short) 1);
        int[] intArray12 = ds.MaxMin2.maxMin2(intArray10, (-1));
        int[] intArray14 = ds.MaxMin2.maxMin2(intArray10, (int) (byte) 0);
        int[] intArray16 = ds.MaxMin2.maxMin2(intArray10, 1);
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
    public void test339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test339");
        int[] intArray6 = new int[] { (byte) -1, (byte) 1, ' ', (short) 10, (short) 1, (byte) 1 };
        int[] intArray8 = ds.MaxMin2.maxMin2(intArray6, (int) (byte) 0);
        int[] intArray10 = ds.MaxMin2.maxMin2(intArray6, (int) (byte) 0);
        int[] intArray12 = ds.MaxMin2.maxMin2(intArray10, (int) (short) 0);
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
    public void test340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test340");
        int[] intArray6 = new int[] { (byte) -1, (byte) 1, ' ', (short) 10, (short) 1, (byte) 1 };
        int[] intArray8 = ds.MaxMin2.maxMin2(intArray6, (int) (byte) 0);
        int[] intArray10 = ds.MaxMin2.maxMin2(intArray6, (int) (short) 1);
        int[] intArray12 = ds.MaxMin2.maxMin2(intArray10, (-1));
        int[] intArray14 = ds.MaxMin2.maxMin2(intArray12, (int) (byte) -1);
        int[] intArray16 = ds.MaxMin2.maxMin2(intArray14, (int) (byte) 1);
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
    public void test341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test341");
        int[] intArray6 = new int[] { (byte) -1, (byte) 1, ' ', (short) 10, (short) 1, (byte) 1 };
        int[] intArray8 = ds.MaxMin2.maxMin2(intArray6, (int) (byte) 0);
        int[] intArray10 = ds.MaxMin2.maxMin2(intArray8, (-1));
        int[] intArray12 = ds.MaxMin2.maxMin2(intArray10, 1);
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
    public void test342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test342");
        int[] intArray6 = new int[] { (byte) -1, (byte) 1, ' ', (short) 10, (short) 1, (byte) 1 };
        int[] intArray8 = ds.MaxMin2.maxMin2(intArray6, (int) (byte) 0);
        int[] intArray10 = ds.MaxMin2.maxMin2(intArray6, (int) (short) 1);
        int[] intArray12 = ds.MaxMin2.maxMin2(intArray10, (-1));
        int[] intArray14 = ds.MaxMin2.maxMin2(intArray10, (int) (byte) 0);
        int[] intArray16 = ds.MaxMin2.maxMin2(intArray10, 1);
        int[] intArray18 = ds.MaxMin2.maxMin2(intArray16, 0);
        int[] intArray20 = ds.MaxMin2.maxMin2(intArray18, 0);
        int[] intArray22 = ds.MaxMin2.maxMin2(intArray18, 1);
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
    public void test343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test343");
        int[] intArray6 = new int[] { (byte) -1, (byte) 1, ' ', (short) 10, (short) 1, (byte) 1 };
        int[] intArray8 = ds.MaxMin2.maxMin2(intArray6, (int) (byte) 0);
        int[] intArray10 = ds.MaxMin2.maxMin2(intArray6, (int) (short) 1);
        int[] intArray12 = ds.MaxMin2.maxMin2(intArray10, (-1));
        int[] intArray14 = ds.MaxMin2.maxMin2(intArray12, (int) (short) -1);
        int[] intArray16 = ds.MaxMin2.maxMin2(intArray14, (-1));
        int[] intArray18 = ds.MaxMin2.maxMin2(intArray16, (int) (short) 1);
        int[] intArray20 = ds.MaxMin2.maxMin2(intArray16, (int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray22 = ds.MaxMin2.maxMin2(intArray20, (int) 'a');
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
    public void test344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test344");
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
            int[] intArray22 = ds.MaxMin2.maxMin2(intArray14, (int) 'a');
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
    public void test345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test345");
        int[] intArray6 = new int[] { (byte) -1, (byte) 1, ' ', (short) 10, (short) 1, (byte) 1 };
        int[] intArray8 = ds.MaxMin2.maxMin2(intArray6, (int) (byte) 0);
        int[] intArray10 = ds.MaxMin2.maxMin2(intArray6, (int) (byte) 1);
        int[] intArray12 = ds.MaxMin2.maxMin2(intArray10, (int) (byte) 1);
        int[] intArray14 = ds.MaxMin2.maxMin2(intArray10, (int) (byte) 1);
        int[] intArray16 = ds.MaxMin2.maxMin2(intArray10, (int) (byte) 0);
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
    public void test346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test346");
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
    public void test347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test347");
        int[] intArray4 = new int[] { (byte) 0, 10, '#', (short) 0 };
        int[] intArray6 = ds.MaxMin2.maxMin2(intArray4, (int) (short) 1);
        int[] intArray8 = ds.MaxMin2.maxMin2(intArray6, 0);
        int[] intArray10 = ds.MaxMin2.maxMin2(intArray8, 0);
        int[] intArray12 = ds.MaxMin2.maxMin2(intArray8, 0);
        int[] intArray14 = ds.MaxMin2.maxMin2(intArray12, 0);
        int[] intArray16 = ds.MaxMin2.maxMin2(intArray12, 0);
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
    public void test348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test348");
        int[] intArray6 = new int[] { (byte) -1, (byte) 1, ' ', (short) 10, (short) 1, (byte) 1 };
        int[] intArray8 = ds.MaxMin2.maxMin2(intArray6, (int) (byte) 0);
        int[] intArray10 = ds.MaxMin2.maxMin2(intArray6, (int) (byte) 1);
        int[] intArray12 = ds.MaxMin2.maxMin2(intArray10, (int) (byte) 0);
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
    public void test349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test349");
        int[] intArray4 = new int[] { (byte) 0, 10, '#', (short) 0 };
        int[] intArray6 = ds.MaxMin2.maxMin2(intArray4, (int) (short) 1);
        int[] intArray8 = ds.MaxMin2.maxMin2(intArray6, 0);
        int[] intArray10 = ds.MaxMin2.maxMin2(intArray8, 0);
        int[] intArray12 = ds.MaxMin2.maxMin2(intArray8, 0);
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
    public void test350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test350");
        int[] intArray4 = new int[] { (byte) 0, 10, '#', (short) 0 };
        int[] intArray6 = ds.MaxMin2.maxMin2(intArray4, (int) (short) 1);
        int[] intArray8 = ds.MaxMin2.maxMin2(intArray6, 0);
        int[] intArray10 = ds.MaxMin2.maxMin2(intArray8, (int) (byte) -1);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray12 = ds.MaxMin2.maxMin2(intArray10, 100);
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
    public void test351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test351");
        int[] intArray4 = new int[] { (byte) 0, 10, '#', (short) 0 };
        int[] intArray6 = ds.MaxMin2.maxMin2(intArray4, (int) (short) 1);
        int[] intArray8 = ds.MaxMin2.maxMin2(intArray6, 0);
        int[] intArray10 = ds.MaxMin2.maxMin2(intArray8, (int) (byte) -1);
        int[] intArray12 = ds.MaxMin2.maxMin2(intArray10, 0);
        int[] intArray14 = ds.MaxMin2.maxMin2(intArray12, 0);
        int[] intArray16 = ds.MaxMin2.maxMin2(intArray14, (int) (short) 1);
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
    public void test352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test352");
        int[] intArray6 = new int[] { (byte) -1, (byte) 1, ' ', (short) 10, (short) 1, (byte) 1 };
        int[] intArray8 = ds.MaxMin2.maxMin2(intArray6, (int) (byte) 0);
        int[] intArray10 = ds.MaxMin2.maxMin2(intArray6, (int) (short) 1);
        int[] intArray12 = ds.MaxMin2.maxMin2(intArray10, (-1));
        int[] intArray14 = ds.MaxMin2.maxMin2(intArray12, (int) (short) -1);
        int[] intArray16 = ds.MaxMin2.maxMin2(intArray14, (-1));
        int[] intArray18 = ds.MaxMin2.maxMin2(intArray16, (int) (short) 1);
        int[] intArray20 = ds.MaxMin2.maxMin2(intArray16, (int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray22 = ds.MaxMin2.maxMin2(intArray16, 100);
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
    public void test353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test353");
        int[] intArray6 = new int[] { (byte) -1, (byte) 1, ' ', (short) 10, (short) 1, (byte) 1 };
        int[] intArray8 = ds.MaxMin2.maxMin2(intArray6, (int) (byte) 0);
        int[] intArray10 = ds.MaxMin2.maxMin2(intArray6, (int) (short) 1);
        int[] intArray12 = ds.MaxMin2.maxMin2(intArray10, (-1));
        int[] intArray14 = ds.MaxMin2.maxMin2(intArray12, (int) (short) -1);
        int[] intArray16 = ds.MaxMin2.maxMin2(intArray14, (-1));
        int[] intArray18 = ds.MaxMin2.maxMin2(intArray14, 0);
        int[] intArray20 = ds.MaxMin2.maxMin2(intArray14, 1);
        int[] intArray22 = ds.MaxMin2.maxMin2(intArray20, (int) (byte) 1);
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
    public void test354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test354");
        int[] intArray4 = new int[] { (byte) 0, 10, '#', (short) 0 };
        int[] intArray6 = ds.MaxMin2.maxMin2(intArray4, (int) (short) 1);
        int[] intArray8 = ds.MaxMin2.maxMin2(intArray6, 0);
        int[] intArray10 = ds.MaxMin2.maxMin2(intArray8, 0);
        int[] intArray12 = ds.MaxMin2.maxMin2(intArray10, (int) (byte) -1);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray14 = ds.MaxMin2.maxMin2(intArray10, (int) (byte) 10);
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
    public void test355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test355");
        int[] intArray4 = new int[] { (byte) 0, 10, '#', (short) 0 };
        int[] intArray6 = ds.MaxMin2.maxMin2(intArray4, (int) (short) 1);
        int[] intArray8 = ds.MaxMin2.maxMin2(intArray4, (int) (short) 1);
        int[] intArray10 = ds.MaxMin2.maxMin2(intArray8, (int) (byte) -1);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray12 = ds.MaxMin2.maxMin2(intArray8, 100);
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
    public void test356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test356");
        int[] intArray4 = new int[] { (byte) 0, 10, '#', (short) 0 };
        int[] intArray6 = ds.MaxMin2.maxMin2(intArray4, (int) (short) 1);
        int[] intArray8 = ds.MaxMin2.maxMin2(intArray6, 0);
        int[] intArray10 = ds.MaxMin2.maxMin2(intArray8, (int) (byte) -1);
        int[] intArray12 = ds.MaxMin2.maxMin2(intArray10, 0);
        int[] intArray14 = ds.MaxMin2.maxMin2(intArray12, 0);
        int[] intArray16 = ds.MaxMin2.maxMin2(intArray14, (int) (short) 1);
        int[] intArray18 = ds.MaxMin2.maxMin2(intArray14, 0);
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
    public void test357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test357");
        int[] intArray4 = new int[] { (byte) 0, 10, '#', (short) 0 };
        int[] intArray6 = ds.MaxMin2.maxMin2(intArray4, (int) (short) 1);
        int[] intArray8 = ds.MaxMin2.maxMin2(intArray6, 0);
        int[] intArray10 = ds.MaxMin2.maxMin2(intArray8, 0);
        int[] intArray12 = ds.MaxMin2.maxMin2(intArray8, 0);
        int[] intArray14 = ds.MaxMin2.maxMin2(intArray12, 0);
        int[] intArray16 = ds.MaxMin2.maxMin2(intArray14, (-1));
        int[] intArray18 = ds.MaxMin2.maxMin2(intArray16, (int) (byte) 0);
        int[] intArray20 = ds.MaxMin2.maxMin2(intArray18, (int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray22 = ds.MaxMin2.maxMin2(intArray20, 10);
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
    public void test358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test358");
        int[] intArray4 = new int[] { (byte) 0, 10, '#', (short) 0 };
        int[] intArray6 = ds.MaxMin2.maxMin2(intArray4, (int) (short) 1);
        int[] intArray8 = ds.MaxMin2.maxMin2(intArray6, 0);
        int[] intArray10 = ds.MaxMin2.maxMin2(intArray8, 0);
        int[] intArray12 = ds.MaxMin2.maxMin2(intArray8, 0);
        int[] intArray14 = ds.MaxMin2.maxMin2(intArray12, 0);
        int[] intArray16 = ds.MaxMin2.maxMin2(intArray14, (-1));
        int[] intArray18 = ds.MaxMin2.maxMin2(intArray16, 0);
        int[] intArray20 = ds.MaxMin2.maxMin2(intArray16, (-1));
        int[] intArray22 = ds.MaxMin2.maxMin2(intArray16, (int) (short) -1);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray24 = ds.MaxMin2.maxMin2(intArray22, (int) (short) 100);
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
    public void test359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test359");
        int[] intArray6 = new int[] { (byte) -1, (byte) 1, ' ', (short) 10, (short) 1, (byte) 1 };
        int[] intArray8 = ds.MaxMin2.maxMin2(intArray6, (int) (byte) 0);
        int[] intArray10 = ds.MaxMin2.maxMin2(intArray6, (int) (byte) 1);
        int[] intArray12 = ds.MaxMin2.maxMin2(intArray10, (int) (byte) 1);
        int[] intArray14 = ds.MaxMin2.maxMin2(intArray10, (int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray16 = ds.MaxMin2.maxMin2(intArray14, 10);
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
    public void test360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test360");
        int[] intArray4 = new int[] { (byte) 0, 10, '#', (short) 0 };
        int[] intArray6 = ds.MaxMin2.maxMin2(intArray4, (int) (short) 1);
        int[] intArray8 = ds.MaxMin2.maxMin2(intArray6, 0);
        int[] intArray10 = ds.MaxMin2.maxMin2(intArray8, 0);
        int[] intArray12 = ds.MaxMin2.maxMin2(intArray8, 0);
        int[] intArray14 = ds.MaxMin2.maxMin2(intArray12, (int) (byte) 0);
        int[] intArray16 = ds.MaxMin2.maxMin2(intArray12, (int) (short) 1);
        int[] intArray18 = ds.MaxMin2.maxMin2(intArray16, (int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray20 = ds.MaxMin2.maxMin2(intArray18, 10);
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
    public void test361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test361");
        int[] intArray4 = new int[] { (byte) 0, 10, '#', (short) 0 };
        int[] intArray6 = ds.MaxMin2.maxMin2(intArray4, (int) (short) 1);
        int[] intArray8 = ds.MaxMin2.maxMin2(intArray6, 0);
        int[] intArray10 = ds.MaxMin2.maxMin2(intArray8, 0);
        int[] intArray12 = ds.MaxMin2.maxMin2(intArray8, 0);
        int[] intArray14 = ds.MaxMin2.maxMin2(intArray12, 0);
        int[] intArray16 = ds.MaxMin2.maxMin2(intArray12, (int) (short) -1);
        int[] intArray18 = ds.MaxMin2.maxMin2(intArray12, (int) (byte) 1);
        java.lang.Class<?> wildcardClass19 = intArray12.getClass();
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
    public void test362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test362");
        int[] intArray6 = new int[] { (byte) -1, (byte) 1, ' ', (short) 10, (short) 1, (byte) 1 };
        int[] intArray8 = ds.MaxMin2.maxMin2(intArray6, (int) (byte) 0);
        int[] intArray10 = ds.MaxMin2.maxMin2(intArray6, (int) (short) 1);
        int[] intArray12 = ds.MaxMin2.maxMin2(intArray10, (-1));
        int[] intArray14 = ds.MaxMin2.maxMin2(intArray10, (int) (byte) 0);
        int[] intArray16 = ds.MaxMin2.maxMin2(intArray10, 1);
        int[] intArray18 = ds.MaxMin2.maxMin2(intArray16, 0);
        int[] intArray20 = ds.MaxMin2.maxMin2(intArray18, 0);
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
    public void test363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test363");
        int[] intArray6 = new int[] { (byte) -1, (byte) 1, ' ', (short) 10, (short) 1, (byte) 1 };
        int[] intArray8 = ds.MaxMin2.maxMin2(intArray6, (int) (byte) 0);
        int[] intArray10 = ds.MaxMin2.maxMin2(intArray6, (int) (byte) 0);
        int[] intArray12 = ds.MaxMin2.maxMin2(intArray10, (int) (short) 0);
        int[] intArray14 = ds.MaxMin2.maxMin2(intArray10, (int) (short) -1);
        int[] intArray16 = ds.MaxMin2.maxMin2(intArray10, (int) (byte) 0);
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
    public void test364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test364");
        int[] intArray4 = new int[] { (byte) 0, 10, '#', (short) 0 };
        int[] intArray6 = ds.MaxMin2.maxMin2(intArray4, (int) (short) 1);
        int[] intArray8 = ds.MaxMin2.maxMin2(intArray4, (int) (short) 1);
        int[] intArray10 = ds.MaxMin2.maxMin2(intArray8, (int) (byte) -1);
        int[] intArray12 = ds.MaxMin2.maxMin2(intArray10, 1);
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
    public void test365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test365");
        int[] intArray4 = new int[] { (byte) 0, 10, '#', (short) 0 };
        int[] intArray6 = ds.MaxMin2.maxMin2(intArray4, (int) (short) 1);
        int[] intArray8 = ds.MaxMin2.maxMin2(intArray6, 0);
        int[] intArray10 = ds.MaxMin2.maxMin2(intArray8, (int) (byte) -1);
        int[] intArray12 = ds.MaxMin2.maxMin2(intArray10, 0);
        int[] intArray14 = ds.MaxMin2.maxMin2(intArray12, 0);
        int[] intArray16 = ds.MaxMin2.maxMin2(intArray14, (int) (short) 1);
        int[] intArray18 = ds.MaxMin2.maxMin2(intArray14, 0);
        int[] intArray20 = ds.MaxMin2.maxMin2(intArray14, (int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray22 = ds.MaxMin2.maxMin2(intArray20, (int) '4');
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
    public void test366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test366");
        int[] intArray4 = new int[] { (byte) 0, 10, '#', (short) 0 };
        int[] intArray6 = ds.MaxMin2.maxMin2(intArray4, (int) (short) 1);
        int[] intArray8 = ds.MaxMin2.maxMin2(intArray6, 0);
        int[] intArray10 = ds.MaxMin2.maxMin2(intArray8, 0);
        int[] intArray12 = ds.MaxMin2.maxMin2(intArray8, 0);
        int[] intArray14 = ds.MaxMin2.maxMin2(intArray12, (int) (byte) 0);
        int[] intArray16 = ds.MaxMin2.maxMin2(intArray14, (int) (byte) -1);
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
    public void test367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test367");
        int[] intArray4 = new int[] { (byte) 0, 10, '#', (short) 0 };
        int[] intArray6 = ds.MaxMin2.maxMin2(intArray4, (int) (short) 1);
        int[] intArray8 = ds.MaxMin2.maxMin2(intArray6, 0);
        int[] intArray10 = ds.MaxMin2.maxMin2(intArray8, (int) (byte) -1);
        int[] intArray12 = ds.MaxMin2.maxMin2(intArray10, 0);
        int[] intArray14 = ds.MaxMin2.maxMin2(intArray12, 0);
        int[] intArray16 = ds.MaxMin2.maxMin2(intArray14, (int) (short) 1);
        int[] intArray18 = ds.MaxMin2.maxMin2(intArray14, 0);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray20 = ds.MaxMin2.maxMin2(intArray18, (int) '#');
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
    public void test368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test368");
        int[] intArray4 = new int[] { (byte) 0, 10, '#', (short) 0 };
        int[] intArray6 = ds.MaxMin2.maxMin2(intArray4, (int) (short) 1);
        int[] intArray8 = ds.MaxMin2.maxMin2(intArray6, 0);
        int[] intArray10 = ds.MaxMin2.maxMin2(intArray8, 0);
        int[] intArray12 = ds.MaxMin2.maxMin2(intArray8, 0);
        int[] intArray14 = ds.MaxMin2.maxMin2(intArray12, (int) (byte) 0);
        int[] intArray16 = ds.MaxMin2.maxMin2(intArray12, (int) (short) 1);
        int[] intArray18 = ds.MaxMin2.maxMin2(intArray16, (int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray20 = ds.MaxMin2.maxMin2(intArray18, (int) 'a');
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
    public void test369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test369");
        int[] intArray6 = new int[] { (byte) -1, (byte) 1, ' ', (short) 10, (short) 1, (byte) 1 };
        int[] intArray8 = ds.MaxMin2.maxMin2(intArray6, (int) (byte) 0);
        int[] intArray10 = ds.MaxMin2.maxMin2(intArray6, (int) (short) 1);
        int[] intArray12 = ds.MaxMin2.maxMin2(intArray10, (-1));
        int[] intArray14 = ds.MaxMin2.maxMin2(intArray10, (int) (byte) 0);
        int[] intArray16 = ds.MaxMin2.maxMin2(intArray10, 1);
        int[] intArray18 = ds.MaxMin2.maxMin2(intArray16, 0);
        int[] intArray20 = ds.MaxMin2.maxMin2(intArray18, (int) (byte) -1);
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
    public void test370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test370");
        int[] intArray4 = new int[] { (byte) 0, 10, '#', (short) 0 };
        int[] intArray6 = ds.MaxMin2.maxMin2(intArray4, (int) (short) 1);
        int[] intArray8 = ds.MaxMin2.maxMin2(intArray4, (int) (byte) -1);
        java.lang.Class<?> wildcardClass9 = intArray8.getClass();
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[0, 10, 35, 0]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[0, 0]");
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test371");
        int[] intArray6 = new int[] { (byte) -1, (byte) 1, ' ', (short) 10, (short) 1, (byte) 1 };
        int[] intArray8 = ds.MaxMin2.maxMin2(intArray6, (int) (byte) 0);
        int[] intArray10 = ds.MaxMin2.maxMin2(intArray8, (-1));
        int[] intArray12 = ds.MaxMin2.maxMin2(intArray10, 1);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray14 = ds.MaxMin2.maxMin2(intArray10, 100);
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
    public void test372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test372");
        int[] intArray4 = new int[] { (byte) 0, 10, '#', (short) 0 };
        int[] intArray6 = ds.MaxMin2.maxMin2(intArray4, (int) (short) 1);
        int[] intArray8 = ds.MaxMin2.maxMin2(intArray6, 0);
        int[] intArray10 = ds.MaxMin2.maxMin2(intArray8, (int) (byte) -1);
        int[] intArray12 = ds.MaxMin2.maxMin2(intArray10, 0);
        int[] intArray14 = ds.MaxMin2.maxMin2(intArray12, 0);
        int[] intArray16 = ds.MaxMin2.maxMin2(intArray14, (-1));
        int[] intArray18 = ds.MaxMin2.maxMin2(intArray16, (int) (byte) -1);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray20 = ds.MaxMin2.maxMin2(intArray16, (int) ' ');
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
    public void test373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test373");
        int[] intArray6 = new int[] { (byte) -1, (byte) 1, ' ', (short) 10, (short) 1, (byte) 1 };
        int[] intArray8 = ds.MaxMin2.maxMin2(intArray6, (int) (byte) 0);
        int[] intArray10 = ds.MaxMin2.maxMin2(intArray6, (int) (short) 1);
        int[] intArray12 = ds.MaxMin2.maxMin2(intArray10, (-1));
        int[] intArray14 = ds.MaxMin2.maxMin2(intArray10, (int) (byte) 0);
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
    public void test374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test374");
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
            int[] intArray22 = ds.MaxMin2.maxMin2(intArray20, (int) (short) 100);
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
    public void test375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test375");
        int[] intArray4 = new int[] { (byte) 0, 10, '#', (short) 0 };
        int[] intArray6 = ds.MaxMin2.maxMin2(intArray4, (int) (short) 1);
        int[] intArray8 = ds.MaxMin2.maxMin2(intArray6, 0);
        int[] intArray10 = ds.MaxMin2.maxMin2(intArray8, (int) (byte) -1);
        int[] intArray12 = ds.MaxMin2.maxMin2(intArray10, 0);
        int[] intArray14 = ds.MaxMin2.maxMin2(intArray12, 1);
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
    public void test376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test376");
        int[] intArray6 = new int[] { (byte) -1, (byte) 1, ' ', (short) 10, (short) 1, (byte) 1 };
        int[] intArray8 = ds.MaxMin2.maxMin2(intArray6, (int) (byte) 0);
        int[] intArray10 = ds.MaxMin2.maxMin2(intArray6, (int) (short) 1);
        int[] intArray12 = ds.MaxMin2.maxMin2(intArray10, (-1));
        int[] intArray14 = ds.MaxMin2.maxMin2(intArray12, (int) (byte) -1);
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
    public void test377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test377");
        int[] intArray4 = new int[] { (byte) 0, 10, '#', (short) 0 };
        int[] intArray6 = ds.MaxMin2.maxMin2(intArray4, (int) (short) 1);
        int[] intArray8 = ds.MaxMin2.maxMin2(intArray4, (int) (short) 1);
        int[] intArray10 = ds.MaxMin2.maxMin2(intArray8, (int) (byte) -1);
        int[] intArray12 = ds.MaxMin2.maxMin2(intArray10, 1);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray14 = ds.MaxMin2.maxMin2(intArray10, (int) (short) 100);
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
    public void test378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test378");
        int[] intArray6 = new int[] { (byte) -1, (byte) 1, ' ', (short) 10, (short) 1, (byte) 1 };
        int[] intArray8 = ds.MaxMin2.maxMin2(intArray6, (int) (byte) 0);
        int[] intArray10 = ds.MaxMin2.maxMin2(intArray8, (-1));
        int[] intArray12 = ds.MaxMin2.maxMin2(intArray10, (int) (byte) -1);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray14 = ds.MaxMin2.maxMin2(intArray10, (int) '4');
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
    public void test379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test379");
        int[] intArray4 = new int[] { (byte) 0, 10, '#', (short) 0 };
        int[] intArray6 = ds.MaxMin2.maxMin2(intArray4, (int) (short) 1);
        int[] intArray8 = ds.MaxMin2.maxMin2(intArray6, 0);
        int[] intArray10 = ds.MaxMin2.maxMin2(intArray8, (int) (byte) -1);
        int[] intArray12 = ds.MaxMin2.maxMin2(intArray10, 0);
        int[] intArray14 = ds.MaxMin2.maxMin2(intArray12, 1);
        int[] intArray16 = ds.MaxMin2.maxMin2(intArray14, (int) (short) 1);
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
    public void test380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test380");
        int[] intArray6 = new int[] { (byte) -1, (byte) 1, ' ', (short) 10, (short) 1, (byte) 1 };
        int[] intArray8 = ds.MaxMin2.maxMin2(intArray6, (int) (byte) 0);
        int[] intArray10 = ds.MaxMin2.maxMin2(intArray8, (int) (short) -1);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray12 = ds.MaxMin2.maxMin2(intArray8, (int) (byte) 100);
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
    public void test381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test381");
        int[] intArray4 = new int[] { (byte) 0, 10, '#', (short) 0 };
        int[] intArray6 = ds.MaxMin2.maxMin2(intArray4, (int) (short) 1);
        int[] intArray8 = ds.MaxMin2.maxMin2(intArray6, 0);
        int[] intArray10 = ds.MaxMin2.maxMin2(intArray8, (int) (byte) -1);
        int[] intArray12 = ds.MaxMin2.maxMin2(intArray10, 0);
        int[] intArray14 = ds.MaxMin2.maxMin2(intArray12, 0);
        int[] intArray16 = ds.MaxMin2.maxMin2(intArray14, (int) (short) 1);
        int[] intArray18 = ds.MaxMin2.maxMin2(intArray16, (int) (short) -1);
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
    public void test382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test382");
        int[] intArray4 = new int[] { (byte) 0, 10, '#', (short) 0 };
        int[] intArray6 = ds.MaxMin2.maxMin2(intArray4, (int) (short) 1);
        int[] intArray8 = ds.MaxMin2.maxMin2(intArray4, (int) (short) 0);
        int[] intArray10 = ds.MaxMin2.maxMin2(intArray4, (int) (byte) -1);
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
    public void test383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test383");
        int[] intArray4 = new int[] { (byte) 0, 10, '#', (short) 0 };
        int[] intArray6 = ds.MaxMin2.maxMin2(intArray4, (int) (short) 1);
        int[] intArray8 = ds.MaxMin2.maxMin2(intArray6, 0);
        int[] intArray10 = ds.MaxMin2.maxMin2(intArray8, (int) (byte) -1);
        int[] intArray12 = ds.MaxMin2.maxMin2(intArray10, 0);
        int[] intArray14 = ds.MaxMin2.maxMin2(intArray12, (int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray16 = ds.MaxMin2.maxMin2(intArray14, (int) '4');
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
    public void test384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test384");
        int[] intArray6 = new int[] { (byte) -1, (byte) 1, ' ', (short) 10, (short) 1, (byte) 1 };
        int[] intArray8 = ds.MaxMin2.maxMin2(intArray6, (int) (byte) 0);
        int[] intArray10 = ds.MaxMin2.maxMin2(intArray6, (int) (short) 1);
        int[] intArray12 = ds.MaxMin2.maxMin2(intArray10, (-1));
        int[] intArray14 = ds.MaxMin2.maxMin2(intArray12, (int) (byte) -1);
        int[] intArray16 = ds.MaxMin2.maxMin2(intArray14, (int) (byte) 1);
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
    public void test385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test385");
        int[] intArray4 = new int[] { (byte) 0, 10, '#', (short) 0 };
        int[] intArray6 = ds.MaxMin2.maxMin2(intArray4, (int) (short) 1);
        int[] intArray8 = ds.MaxMin2.maxMin2(intArray4, (int) (short) 1);
        int[] intArray10 = ds.MaxMin2.maxMin2(intArray8, (int) (byte) -1);
        int[] intArray12 = ds.MaxMin2.maxMin2(intArray10, (int) (short) 1);
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
    public void test386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test386");
        int[] intArray6 = new int[] { (byte) -1, (byte) 1, ' ', (short) 10, (short) 1, (byte) 1 };
        int[] intArray8 = ds.MaxMin2.maxMin2(intArray6, (int) (byte) 0);
        int[] intArray10 = ds.MaxMin2.maxMin2(intArray6, (int) (short) 1);
        int[] intArray12 = ds.MaxMin2.maxMin2(intArray10, (-1));
        int[] intArray14 = ds.MaxMin2.maxMin2(intArray12, (int) (short) -1);
        int[] intArray16 = ds.MaxMin2.maxMin2(intArray14, (-1));
        int[] intArray18 = ds.MaxMin2.maxMin2(intArray14, 0);
        int[] intArray20 = ds.MaxMin2.maxMin2(intArray14, (int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray22 = ds.MaxMin2.maxMin2(intArray20, (int) '4');
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
    public void test387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test387");
        int[] intArray6 = new int[] { (byte) -1, (byte) 1, ' ', (short) 10, (short) 1, (byte) 1 };
        int[] intArray8 = ds.MaxMin2.maxMin2(intArray6, (int) (byte) 0);
        int[] intArray10 = ds.MaxMin2.maxMin2(intArray6, (int) (byte) 0);
        int[] intArray12 = ds.MaxMin2.maxMin2(intArray10, (int) (short) 0);
        int[] intArray14 = ds.MaxMin2.maxMin2(intArray10, (int) (short) -1);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray16 = ds.MaxMin2.maxMin2(intArray14, (int) (short) 100);
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
    public void test388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test388");
        int[] intArray4 = new int[] { (byte) 0, 10, '#', (short) 0 };
        int[] intArray6 = ds.MaxMin2.maxMin2(intArray4, (int) (short) 1);
        int[] intArray8 = ds.MaxMin2.maxMin2(intArray4, (int) (short) 1);
        int[] intArray10 = ds.MaxMin2.maxMin2(intArray8, (int) (short) 1);
        int[] intArray12 = ds.MaxMin2.maxMin2(intArray8, (-1));
        int[] intArray14 = ds.MaxMin2.maxMin2(intArray8, (int) (short) 0);
        java.lang.Class<?> wildcardClass15 = intArray8.getClass();
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
    public void test389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test389");
        int[] intArray6 = new int[] { (byte) -1, (byte) 1, ' ', (short) 10, (short) 1, (byte) 1 };
        int[] intArray8 = ds.MaxMin2.maxMin2(intArray6, (int) (byte) 0);
        int[] intArray10 = ds.MaxMin2.maxMin2(intArray6, (int) (short) 1);
        int[] intArray12 = ds.MaxMin2.maxMin2(intArray10, (-1));
        int[] intArray14 = ds.MaxMin2.maxMin2(intArray12, (int) (short) -1);
        int[] intArray16 = ds.MaxMin2.maxMin2(intArray14, (-1));
        int[] intArray18 = ds.MaxMin2.maxMin2(intArray14, 0);
        int[] intArray20 = ds.MaxMin2.maxMin2(intArray18, 0);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray22 = ds.MaxMin2.maxMin2(intArray18, 10);
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
    public void test390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test390");
        int[] intArray4 = new int[] { (byte) 0, 10, '#', (short) 0 };
        int[] intArray6 = ds.MaxMin2.maxMin2(intArray4, (int) (short) 1);
        int[] intArray8 = ds.MaxMin2.maxMin2(intArray4, (int) (short) 1);
        int[] intArray10 = ds.MaxMin2.maxMin2(intArray8, (int) (byte) -1);
        int[] intArray12 = ds.MaxMin2.maxMin2(intArray10, 1);
        int[] intArray14 = ds.MaxMin2.maxMin2(intArray10, 1);
        int[] intArray16 = ds.MaxMin2.maxMin2(intArray10, (-1));
        int[] intArray18 = ds.MaxMin2.maxMin2(intArray16, (int) (byte) 0);
        int[] intArray20 = ds.MaxMin2.maxMin2(intArray16, 1);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray22 = ds.MaxMin2.maxMin2(intArray20, 100);
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
    public void test391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test391");
        int[] intArray4 = new int[] { (byte) 0, 10, '#', (short) 0 };
        int[] intArray6 = ds.MaxMin2.maxMin2(intArray4, (int) (short) 1);
        int[] intArray8 = ds.MaxMin2.maxMin2(intArray6, 0);
        int[] intArray10 = ds.MaxMin2.maxMin2(intArray8, (int) (byte) -1);
        int[] intArray12 = ds.MaxMin2.maxMin2(intArray10, 0);
        int[] intArray14 = ds.MaxMin2.maxMin2(intArray12, 0);
        int[] intArray16 = ds.MaxMin2.maxMin2(intArray14, (int) (short) 1);
        int[] intArray18 = ds.MaxMin2.maxMin2(intArray14, 0);
        int[] intArray20 = ds.MaxMin2.maxMin2(intArray18, (int) (short) -1);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray22 = ds.MaxMin2.maxMin2(intArray18, (int) (short) 100);
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
    public void test392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test392");
        int[] intArray6 = new int[] { (byte) -1, (byte) 1, ' ', (short) 10, (short) 1, (byte) 1 };
        int[] intArray8 = ds.MaxMin2.maxMin2(intArray6, (int) (byte) 0);
        int[] intArray10 = ds.MaxMin2.maxMin2(intArray6, (int) (byte) 0);
        int[] intArray12 = ds.MaxMin2.maxMin2(intArray10, (int) (short) -1);
        int[] intArray14 = ds.MaxMin2.maxMin2(intArray10, (int) (byte) -1);
        int[] intArray16 = ds.MaxMin2.maxMin2(intArray14, (int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray18 = ds.MaxMin2.maxMin2(intArray14, (int) ' ');
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
    public void test393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test393");
        int[] intArray6 = new int[] { (byte) -1, (byte) 1, ' ', (short) 10, (short) 1, (byte) 1 };
        int[] intArray8 = ds.MaxMin2.maxMin2(intArray6, (int) (byte) 0);
        int[] intArray10 = ds.MaxMin2.maxMin2(intArray6, (int) (byte) 1);
        int[] intArray12 = ds.MaxMin2.maxMin2(intArray10, (int) (byte) 1);
        int[] intArray14 = ds.MaxMin2.maxMin2(intArray12, (int) (byte) -1);
        int[] intArray16 = ds.MaxMin2.maxMin2(intArray12, (int) (short) 1);
        int[] intArray18 = ds.MaxMin2.maxMin2(intArray12, (int) (byte) -1);
        int[] intArray20 = ds.MaxMin2.maxMin2(intArray12, (int) (byte) 1);
        java.lang.Class<?> wildcardClass21 = intArray12.getClass();
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
    public void test394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test394");
        int[] intArray6 = new int[] { (byte) -1, (byte) 1, ' ', (short) 10, (short) 1, (byte) 1 };
        int[] intArray8 = ds.MaxMin2.maxMin2(intArray6, (int) (byte) 0);
        int[] intArray10 = ds.MaxMin2.maxMin2(intArray6, (int) (short) 1);
        int[] intArray12 = ds.MaxMin2.maxMin2(intArray10, (-1));
        int[] intArray14 = ds.MaxMin2.maxMin2(intArray12, (int) (short) -1);
        int[] intArray16 = ds.MaxMin2.maxMin2(intArray14, (-1));
        int[] intArray18 = ds.MaxMin2.maxMin2(intArray14, 0);
        int[] intArray20 = ds.MaxMin2.maxMin2(intArray14, (int) (short) 1);
        int[] intArray22 = ds.MaxMin2.maxMin2(intArray20, 1);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray24 = ds.MaxMin2.maxMin2(intArray20, (int) (short) 10);
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
    public void test395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test395");
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
            int[] intArray24 = ds.MaxMin2.maxMin2(intArray22, (int) (short) 100);
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
    public void test396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test396");
        int[] intArray5 = new int[] { (short) 100, 1, 0, 100, ' ' };
        int[] intArray7 = ds.MaxMin2.maxMin2(intArray5, (int) (byte) 0);
        java.lang.Class<?> wildcardClass8 = intArray5.getClass();
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[100, 1, 0, 100, 32]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[100, 100]");
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test397");
        int[] intArray4 = new int[] { (byte) 0, 10, '#', (short) 0 };
        int[] intArray6 = ds.MaxMin2.maxMin2(intArray4, (int) (short) 1);
        int[] intArray8 = ds.MaxMin2.maxMin2(intArray4, (int) (short) 1);
        int[] intArray10 = ds.MaxMin2.maxMin2(intArray8, (int) (byte) -1);
        int[] intArray12 = ds.MaxMin2.maxMin2(intArray10, 1);
        int[] intArray14 = ds.MaxMin2.maxMin2(intArray12, (int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray16 = ds.MaxMin2.maxMin2(intArray14, (int) 'a');
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
    public void test398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test398");
        int[] intArray6 = new int[] { (byte) -1, (byte) 1, ' ', (short) 10, (short) 1, (byte) 1 };
        int[] intArray8 = ds.MaxMin2.maxMin2(intArray6, (int) (byte) 0);
        int[] intArray10 = ds.MaxMin2.maxMin2(intArray6, (int) (short) 1);
        int[] intArray12 = ds.MaxMin2.maxMin2(intArray10, (-1));
        int[] intArray14 = ds.MaxMin2.maxMin2(intArray12, (int) (short) -1);
        int[] intArray16 = ds.MaxMin2.maxMin2(intArray14, (-1));
        int[] intArray18 = ds.MaxMin2.maxMin2(intArray14, 0);
        int[] intArray20 = ds.MaxMin2.maxMin2(intArray18, 0);
        int[] intArray22 = ds.MaxMin2.maxMin2(intArray20, (int) (short) -1);
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
    public void test399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test399");
        int[] intArray6 = new int[] { (byte) -1, (byte) 1, ' ', (short) 10, (short) 1, (byte) 1 };
        int[] intArray8 = ds.MaxMin2.maxMin2(intArray6, (int) (byte) 0);
        int[] intArray10 = ds.MaxMin2.maxMin2(intArray6, (int) (byte) 0);
        int[] intArray12 = ds.MaxMin2.maxMin2(intArray10, (int) (short) 0);
        int[] intArray14 = ds.MaxMin2.maxMin2(intArray10, (int) (short) -1);
        int[] intArray16 = ds.MaxMin2.maxMin2(intArray10, (int) (byte) 0);
        int[] intArray18 = ds.MaxMin2.maxMin2(intArray16, (int) (byte) -1);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray20 = ds.MaxMin2.maxMin2(intArray16, 100);
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
    public void test400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test400");
        int[] intArray4 = new int[] { (byte) 0, 10, '#', (short) 0 };
        int[] intArray6 = ds.MaxMin2.maxMin2(intArray4, (int) (short) 1);
        int[] intArray8 = ds.MaxMin2.maxMin2(intArray4, (int) (short) 1);
        int[] intArray10 = ds.MaxMin2.maxMin2(intArray8, (int) (byte) -1);
        int[] intArray12 = ds.MaxMin2.maxMin2(intArray10, 1);
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
    public void test401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test401");
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
    public void test402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test402");
        int[] intArray6 = new int[] { (byte) -1, (byte) 1, ' ', (short) 10, (short) 1, (byte) 1 };
        int[] intArray8 = ds.MaxMin2.maxMin2(intArray6, (int) (byte) 0);
        int[] intArray10 = ds.MaxMin2.maxMin2(intArray6, (int) (byte) 1);
        int[] intArray12 = ds.MaxMin2.maxMin2(intArray10, (int) (byte) 1);
        int[] intArray14 = ds.MaxMin2.maxMin2(intArray10, (int) (byte) 1);
        int[] intArray16 = ds.MaxMin2.maxMin2(intArray10, (int) (byte) 0);
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
    public void test403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test403");
        int[] intArray4 = new int[] { (byte) 0, 10, '#', (short) 0 };
        int[] intArray6 = ds.MaxMin2.maxMin2(intArray4, (int) (short) 1);
        int[] intArray8 = ds.MaxMin2.maxMin2(intArray6, 0);
        int[] intArray10 = ds.MaxMin2.maxMin2(intArray8, (int) (byte) -1);
        int[] intArray12 = ds.MaxMin2.maxMin2(intArray10, 0);
        int[] intArray14 = ds.MaxMin2.maxMin2(intArray12, 0);
        int[] intArray16 = ds.MaxMin2.maxMin2(intArray14, (-1));
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
    public void test404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test404");
        int[] intArray6 = new int[] { (byte) -1, (byte) 1, ' ', (short) 10, (short) 1, (byte) 1 };
        int[] intArray8 = ds.MaxMin2.maxMin2(intArray6, (int) (byte) 0);
        int[] intArray10 = ds.MaxMin2.maxMin2(intArray8, (int) (short) -1);
        int[] intArray12 = ds.MaxMin2.maxMin2(intArray8, (int) (byte) 1);
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
    public void test405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test405");
        int[] intArray4 = new int[] { (byte) 0, 10, '#', (short) 0 };
        int[] intArray6 = ds.MaxMin2.maxMin2(intArray4, (int) (short) 1);
        int[] intArray8 = ds.MaxMin2.maxMin2(intArray6, 0);
        int[] intArray10 = ds.MaxMin2.maxMin2(intArray8, 0);
        int[] intArray12 = ds.MaxMin2.maxMin2(intArray10, (int) (byte) -1);
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
    public void test406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test406");
        int[] intArray6 = new int[] { (byte) -1, (byte) 1, ' ', (short) 10, (short) 1, (byte) 1 };
        int[] intArray8 = ds.MaxMin2.maxMin2(intArray6, (int) (byte) 0);
        int[] intArray10 = ds.MaxMin2.maxMin2(intArray6, (int) (short) 1);
        int[] intArray12 = ds.MaxMin2.maxMin2(intArray10, (-1));
        int[] intArray14 = ds.MaxMin2.maxMin2(intArray10, (int) (byte) 0);
        int[] intArray16 = ds.MaxMin2.maxMin2(intArray10, 1);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray18 = ds.MaxMin2.maxMin2(intArray10, (int) (short) 10);
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
    public void test407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test407");
        int[] intArray6 = new int[] { (byte) -1, (byte) 1, ' ', (short) 10, (short) 1, (byte) 1 };
        int[] intArray8 = ds.MaxMin2.maxMin2(intArray6, (int) (byte) 0);
        int[] intArray10 = ds.MaxMin2.maxMin2(intArray6, (int) (byte) 1);
        int[] intArray12 = ds.MaxMin2.maxMin2(intArray10, (int) (byte) 1);
        int[] intArray14 = ds.MaxMin2.maxMin2(intArray12, (int) (byte) -1);
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
    public void test408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test408");
        int[] intArray6 = new int[] { (byte) -1, (byte) 1, ' ', (short) 10, (short) 1, (byte) 1 };
        int[] intArray8 = ds.MaxMin2.maxMin2(intArray6, (int) (byte) 0);
        int[] intArray10 = ds.MaxMin2.maxMin2(intArray6, (int) (byte) 1);
        int[] intArray12 = ds.MaxMin2.maxMin2(intArray10, (int) (byte) 1);
        int[] intArray14 = ds.MaxMin2.maxMin2(intArray12, (int) (byte) -1);
        int[] intArray16 = ds.MaxMin2.maxMin2(intArray12, (int) (short) 1);
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
    public void test409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test409");
        int[] intArray6 = new int[] { (byte) -1, (byte) 1, ' ', (short) 10, (short) 1, (byte) 1 };
        int[] intArray8 = ds.MaxMin2.maxMin2(intArray6, (int) (byte) 0);
        int[] intArray10 = ds.MaxMin2.maxMin2(intArray6, (int) (short) 1);
        int[] intArray12 = ds.MaxMin2.maxMin2(intArray10, (-1));
        int[] intArray14 = ds.MaxMin2.maxMin2(intArray12, (int) (short) -1);
        int[] intArray16 = ds.MaxMin2.maxMin2(intArray14, (-1));
        int[] intArray18 = ds.MaxMin2.maxMin2(intArray14, 0);
        int[] intArray20 = ds.MaxMin2.maxMin2(intArray18, 0);
        int[] intArray22 = ds.MaxMin2.maxMin2(intArray18, 0);
        java.lang.Class<?> wildcardClass23 = intArray18.getClass();
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
    public void test410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test410");
        int[] intArray4 = new int[] { (byte) 0, 10, '#', (short) 0 };
        int[] intArray6 = ds.MaxMin2.maxMin2(intArray4, (int) (short) 1);
        int[] intArray8 = ds.MaxMin2.maxMin2(intArray4, (int) (short) 1);
        int[] intArray10 = ds.MaxMin2.maxMin2(intArray8, (int) (byte) -1);
        int[] intArray12 = ds.MaxMin2.maxMin2(intArray10, 1);
        int[] intArray14 = ds.MaxMin2.maxMin2(intArray10, 1);
        int[] intArray16 = ds.MaxMin2.maxMin2(intArray10, (-1));
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray18 = ds.MaxMin2.maxMin2(intArray10, (int) (byte) 100);
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
    public void test411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test411");
        int[] intArray6 = new int[] { (byte) -1, (byte) 1, ' ', (short) 10, (short) 1, (byte) 1 };
        int[] intArray8 = ds.MaxMin2.maxMin2(intArray6, (int) (byte) 0);
        int[] intArray10 = ds.MaxMin2.maxMin2(intArray6, (int) (byte) 0);
        int[] intArray12 = ds.MaxMin2.maxMin2(intArray10, (int) (byte) -1);
        int[] intArray14 = ds.MaxMin2.maxMin2(intArray10, (-1));
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
    public void test412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test412");
        int[] intArray4 = new int[] { (byte) 0, 10, '#', (short) 0 };
        int[] intArray6 = ds.MaxMin2.maxMin2(intArray4, (int) (short) 1);
        int[] intArray8 = ds.MaxMin2.maxMin2(intArray6, 0);
        int[] intArray10 = ds.MaxMin2.maxMin2(intArray8, 0);
        int[] intArray12 = ds.MaxMin2.maxMin2(intArray8, 0);
        int[] intArray14 = ds.MaxMin2.maxMin2(intArray12, 0);
        int[] intArray16 = ds.MaxMin2.maxMin2(intArray14, (-1));
        int[] intArray18 = ds.MaxMin2.maxMin2(intArray16, 0);
        int[] intArray20 = ds.MaxMin2.maxMin2(intArray16, (-1));
        int[] intArray22 = ds.MaxMin2.maxMin2(intArray16, (int) (short) -1);
        java.lang.Class<?> wildcardClass23 = intArray16.getClass();
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
    public void test413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test413");
        int[] intArray4 = new int[] { (byte) 0, 10, '#', (short) 0 };
        int[] intArray6 = ds.MaxMin2.maxMin2(intArray4, (int) (short) 1);
        int[] intArray8 = ds.MaxMin2.maxMin2(intArray6, 0);
        int[] intArray10 = ds.MaxMin2.maxMin2(intArray8, (int) (byte) -1);
        int[] intArray12 = ds.MaxMin2.maxMin2(intArray10, 0);
        int[] intArray14 = ds.MaxMin2.maxMin2(intArray12, 0);
        int[] intArray16 = ds.MaxMin2.maxMin2(intArray14, (int) (short) 1);
        int[] intArray18 = ds.MaxMin2.maxMin2(intArray14, 0);
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
    public void test414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test414");
        int[] intArray4 = new int[] { (byte) 0, 10, '#', (short) 0 };
        int[] intArray6 = ds.MaxMin2.maxMin2(intArray4, (int) (short) 1);
        int[] intArray8 = ds.MaxMin2.maxMin2(intArray6, 0);
        int[] intArray10 = ds.MaxMin2.maxMin2(intArray8, (int) (byte) -1);
        int[] intArray12 = ds.MaxMin2.maxMin2(intArray10, 0);
        int[] intArray14 = ds.MaxMin2.maxMin2(intArray12, (int) (short) 1);
        int[] intArray16 = ds.MaxMin2.maxMin2(intArray14, 0);
        int[] intArray18 = ds.MaxMin2.maxMin2(intArray16, (int) (short) -1);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray20 = ds.MaxMin2.maxMin2(intArray16, (int) ' ');
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
    public void test415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test415");
        int[] intArray6 = new int[] { (byte) -1, (byte) 1, ' ', (short) 10, (short) 1, (byte) 1 };
        int[] intArray8 = ds.MaxMin2.maxMin2(intArray6, (int) (byte) 0);
        int[] intArray10 = ds.MaxMin2.maxMin2(intArray6, (int) (byte) 1);
        int[] intArray12 = ds.MaxMin2.maxMin2(intArray10, (int) (byte) 1);
        int[] intArray14 = ds.MaxMin2.maxMin2(intArray12, (int) (byte) -1);
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
    public void test416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test416");
        int[] intArray6 = new int[] { (byte) -1, (byte) 1, ' ', (short) 10, (short) 1, (byte) 1 };
        int[] intArray8 = ds.MaxMin2.maxMin2(intArray6, (int) (byte) 0);
        int[] intArray10 = ds.MaxMin2.maxMin2(intArray6, (int) (short) 1);
        int[] intArray12 = ds.MaxMin2.maxMin2(intArray10, (-1));
        int[] intArray14 = ds.MaxMin2.maxMin2(intArray12, (int) (short) -1);
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
    public void test417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test417");
        int[] intArray5 = new int[] { (short) 100, 1, 0, 100, ' ' };
        int[] intArray7 = ds.MaxMin2.maxMin2(intArray5, (int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray9 = ds.MaxMin2.maxMin2(intArray5, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[100, 1, 0, 100, 32]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[100, 100]");
    }

    @Test
    public void test418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test418");
        int[] intArray4 = new int[] { (byte) 0, 10, '#', (short) 0 };
        int[] intArray6 = ds.MaxMin2.maxMin2(intArray4, (int) (short) 1);
        int[] intArray8 = ds.MaxMin2.maxMin2(intArray6, 0);
        int[] intArray10 = ds.MaxMin2.maxMin2(intArray6, 0);
        int[] intArray12 = ds.MaxMin2.maxMin2(intArray10, (-1));
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray14 = ds.MaxMin2.maxMin2(intArray12, (int) (short) 10);
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
    public void test419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test419");
        int[] intArray4 = new int[] { (byte) 0, 10, '#', (short) 0 };
        int[] intArray6 = ds.MaxMin2.maxMin2(intArray4, (int) (short) 1);
        int[] intArray8 = ds.MaxMin2.maxMin2(intArray4, (int) (short) 1);
        int[] intArray10 = ds.MaxMin2.maxMin2(intArray8, (int) (byte) -1);
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
    public void test420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test420");
        int[] intArray4 = new int[] { (byte) 0, 10, '#', (short) 0 };
        int[] intArray6 = ds.MaxMin2.maxMin2(intArray4, (int) (short) 1);
        int[] intArray8 = ds.MaxMin2.maxMin2(intArray6, 0);
        int[] intArray10 = ds.MaxMin2.maxMin2(intArray8, (int) (byte) -1);
        int[] intArray12 = ds.MaxMin2.maxMin2(intArray10, 0);
        int[] intArray14 = ds.MaxMin2.maxMin2(intArray10, (int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray16 = ds.MaxMin2.maxMin2(intArray14, (int) (byte) 100);
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
    public void test421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test421");
        int[] intArray6 = new int[] { (byte) -1, (byte) 1, ' ', (short) 10, (short) 1, (byte) 1 };
        int[] intArray8 = ds.MaxMin2.maxMin2(intArray6, (int) (byte) 0);
        int[] intArray10 = ds.MaxMin2.maxMin2(intArray6, (int) (short) 1);
        int[] intArray12 = ds.MaxMin2.maxMin2(intArray10, (-1));
        int[] intArray14 = ds.MaxMin2.maxMin2(intArray12, (int) (short) -1);
        int[] intArray16 = ds.MaxMin2.maxMin2(intArray14, (-1));
        int[] intArray18 = ds.MaxMin2.maxMin2(intArray14, 0);
        int[] intArray20 = ds.MaxMin2.maxMin2(intArray18, 0);
        int[] intArray22 = ds.MaxMin2.maxMin2(intArray20, (int) (short) -1);
        int[] intArray24 = ds.MaxMin2.maxMin2(intArray20, 1);
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
    public void test422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test422");
        int[] intArray6 = new int[] { (byte) -1, (byte) 1, ' ', (short) 10, (short) 1, (byte) 1 };
        int[] intArray8 = ds.MaxMin2.maxMin2(intArray6, (int) (byte) 0);
        int[] intArray10 = ds.MaxMin2.maxMin2(intArray6, (int) (short) 1);
        int[] intArray12 = ds.MaxMin2.maxMin2(intArray10, (-1));
        int[] intArray14 = ds.MaxMin2.maxMin2(intArray12, (int) (short) -1);
        int[] intArray16 = ds.MaxMin2.maxMin2(intArray14, (-1));
        int[] intArray18 = ds.MaxMin2.maxMin2(intArray14, 0);
        int[] intArray20 = ds.MaxMin2.maxMin2(intArray14, 0);
        java.lang.Class<?> wildcardClass21 = intArray14.getClass();
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
    public void test423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test423");
        int[] intArray4 = new int[] { (byte) 0, 10, '#', (short) 0 };
        int[] intArray6 = ds.MaxMin2.maxMin2(intArray4, (int) (short) 1);
        int[] intArray8 = ds.MaxMin2.maxMin2(intArray4, (int) (short) 1);
        int[] intArray10 = ds.MaxMin2.maxMin2(intArray8, (int) (byte) -1);
        int[] intArray12 = ds.MaxMin2.maxMin2(intArray10, 1);
        int[] intArray14 = ds.MaxMin2.maxMin2(intArray10, 1);
        int[] intArray16 = ds.MaxMin2.maxMin2(intArray10, (-1));
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
    public void test424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test424");
        int[] intArray6 = new int[] { (byte) -1, (byte) 1, ' ', (short) 10, (short) 1, (byte) 1 };
        int[] intArray8 = ds.MaxMin2.maxMin2(intArray6, (int) (byte) 0);
        int[] intArray10 = ds.MaxMin2.maxMin2(intArray6, (int) (short) 1);
        int[] intArray12 = ds.MaxMin2.maxMin2(intArray10, (int) (byte) -1);
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
    public void test425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test425");
        int[] intArray4 = new int[] { (byte) 0, 10, '#', (short) 0 };
        int[] intArray6 = ds.MaxMin2.maxMin2(intArray4, (int) (short) 1);
        int[] intArray8 = ds.MaxMin2.maxMin2(intArray6, 0);
        int[] intArray10 = ds.MaxMin2.maxMin2(intArray8, 0);
        int[] intArray12 = ds.MaxMin2.maxMin2(intArray8, 0);
        int[] intArray14 = ds.MaxMin2.maxMin2(intArray12, (int) (byte) 0);
        int[] intArray16 = ds.MaxMin2.maxMin2(intArray12, (int) (short) 1);
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
    public void test426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test426");
        int[] intArray6 = new int[] { (byte) -1, (byte) 1, ' ', (short) 10, (short) 1, (byte) 1 };
        int[] intArray8 = ds.MaxMin2.maxMin2(intArray6, (int) (byte) 0);
        int[] intArray10 = ds.MaxMin2.maxMin2(intArray6, (int) (short) 1);
        int[] intArray12 = ds.MaxMin2.maxMin2(intArray10, (-1));
        int[] intArray14 = ds.MaxMin2.maxMin2(intArray12, (int) (short) -1);
        int[] intArray16 = ds.MaxMin2.maxMin2(intArray14, (-1));
        int[] intArray18 = ds.MaxMin2.maxMin2(intArray14, 0);
        int[] intArray20 = ds.MaxMin2.maxMin2(intArray14, (int) (short) 1);
        java.lang.Class<?> wildcardClass21 = intArray14.getClass();
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
    public void test427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test427");
        int[] intArray4 = new int[] { (byte) 0, 10, '#', (short) 0 };
        int[] intArray6 = ds.MaxMin2.maxMin2(intArray4, (int) (short) 1);
        int[] intArray8 = ds.MaxMin2.maxMin2(intArray6, 0);
        int[] intArray10 = ds.MaxMin2.maxMin2(intArray8, (int) (byte) -1);
        int[] intArray12 = ds.MaxMin2.maxMin2(intArray10, 0);
        int[] intArray14 = ds.MaxMin2.maxMin2(intArray12, 1);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray16 = ds.MaxMin2.maxMin2(intArray12, (int) (short) 10);
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
    public void test428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test428");
        int[] intArray4 = new int[] { (byte) 0, 10, '#', (short) 0 };
        int[] intArray6 = ds.MaxMin2.maxMin2(intArray4, (int) (short) 1);
        int[] intArray8 = ds.MaxMin2.maxMin2(intArray6, 0);
        int[] intArray10 = ds.MaxMin2.maxMin2(intArray8, (int) (byte) -1);
        int[] intArray12 = ds.MaxMin2.maxMin2(intArray10, 0);
        int[] intArray14 = ds.MaxMin2.maxMin2(intArray12, (int) (short) 0);
        int[] intArray16 = ds.MaxMin2.maxMin2(intArray14, (int) (short) 0);
        int[] intArray18 = ds.MaxMin2.maxMin2(intArray16, (int) (byte) -1);
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
    public void test429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test429");
        int[] intArray4 = new int[] { (byte) 0, 10, '#', (short) 0 };
        int[] intArray6 = ds.MaxMin2.maxMin2(intArray4, (int) (short) 1);
        int[] intArray8 = ds.MaxMin2.maxMin2(intArray6, 0);
        int[] intArray10 = ds.MaxMin2.maxMin2(intArray8, 0);
        int[] intArray12 = ds.MaxMin2.maxMin2(intArray8, 0);
        int[] intArray14 = ds.MaxMin2.maxMin2(intArray12, 0);
        int[] intArray16 = ds.MaxMin2.maxMin2(intArray12, (int) (short) -1);
        int[] intArray18 = ds.MaxMin2.maxMin2(intArray12, (int) (byte) 1);
        int[] intArray20 = ds.MaxMin2.maxMin2(intArray12, (int) (byte) 1);
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
    public void test430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test430");
        int[] intArray6 = new int[] { (byte) -1, (byte) 1, ' ', (short) 10, (short) 1, (byte) 1 };
        int[] intArray8 = ds.MaxMin2.maxMin2(intArray6, (int) (byte) 0);
        int[] intArray10 = ds.MaxMin2.maxMin2(intArray6, (int) (byte) 1);
        int[] intArray12 = ds.MaxMin2.maxMin2(intArray6, (int) (short) 0);
        int[] intArray14 = ds.MaxMin2.maxMin2(intArray12, (int) (short) 0);
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
    public void test431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test431");
        int[] intArray6 = new int[] { (byte) -1, (byte) 1, ' ', (short) 10, (short) 1, (byte) 1 };
        int[] intArray8 = ds.MaxMin2.maxMin2(intArray6, (int) (byte) 0);
        int[] intArray10 = ds.MaxMin2.maxMin2(intArray6, (int) (short) 1);
        int[] intArray12 = ds.MaxMin2.maxMin2(intArray10, (-1));
        int[] intArray14 = ds.MaxMin2.maxMin2(intArray12, (int) (short) -1);
        int[] intArray16 = ds.MaxMin2.maxMin2(intArray14, (-1));
        int[] intArray18 = ds.MaxMin2.maxMin2(intArray16, (int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray20 = ds.MaxMin2.maxMin2(intArray18, (int) 'a');
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
    public void test432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test432");
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
            int[] intArray22 = ds.MaxMin2.maxMin2(intArray20, 10);
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
    public void test433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test433");
        int[] intArray4 = new int[] { (byte) 0, 10, '#', (short) 0 };
        int[] intArray6 = ds.MaxMin2.maxMin2(intArray4, (int) (short) 1);
        int[] intArray8 = ds.MaxMin2.maxMin2(intArray6, 0);
        int[] intArray10 = ds.MaxMin2.maxMin2(intArray8, 0);
        int[] intArray12 = ds.MaxMin2.maxMin2(intArray8, 0);
        int[] intArray14 = ds.MaxMin2.maxMin2(intArray12, 0);
        int[] intArray16 = ds.MaxMin2.maxMin2(intArray14, (-1));
        int[] intArray18 = ds.MaxMin2.maxMin2(intArray16, (int) (byte) 1);
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
    public void test434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test434");
        int[] intArray4 = new int[] { (byte) 0, 10, '#', (short) 0 };
        int[] intArray6 = ds.MaxMin2.maxMin2(intArray4, (int) (short) 1);
        int[] intArray8 = ds.MaxMin2.maxMin2(intArray6, 0);
        int[] intArray10 = ds.MaxMin2.maxMin2(intArray8, (int) (byte) -1);
        int[] intArray12 = ds.MaxMin2.maxMin2(intArray10, 0);
        int[] intArray14 = ds.MaxMin2.maxMin2(intArray12, 0);
        int[] intArray16 = ds.MaxMin2.maxMin2(intArray14, (int) (short) 1);
        int[] intArray18 = ds.MaxMin2.maxMin2(intArray14, 0);
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
    public void test435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test435");
        int[] intArray4 = new int[] { (byte) 0, 10, '#', (short) 0 };
        int[] intArray6 = ds.MaxMin2.maxMin2(intArray4, (int) (short) 1);
        int[] intArray8 = ds.MaxMin2.maxMin2(intArray4, (int) (short) 1);
        int[] intArray10 = ds.MaxMin2.maxMin2(intArray8, (int) (byte) -1);
        int[] intArray12 = ds.MaxMin2.maxMin2(intArray8, (int) (short) 0);
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
    public void test436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test436");
        int[] intArray6 = new int[] { (byte) -1, (byte) 1, ' ', (short) 10, (short) 1, (byte) 1 };
        int[] intArray8 = ds.MaxMin2.maxMin2(intArray6, (int) (byte) 0);
        int[] intArray10 = ds.MaxMin2.maxMin2(intArray6, (int) (byte) 1);
        int[] intArray12 = ds.MaxMin2.maxMin2(intArray10, (int) (byte) 1);
        int[] intArray14 = ds.MaxMin2.maxMin2(intArray12, (int) (byte) -1);
        int[] intArray16 = ds.MaxMin2.maxMin2(intArray12, (int) (short) 1);
        int[] intArray18 = ds.MaxMin2.maxMin2(intArray12, (int) (byte) -1);
        int[] intArray20 = ds.MaxMin2.maxMin2(intArray12, (int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray22 = ds.MaxMin2.maxMin2(intArray20, (int) '4');
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
    public void test437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test437");
        int[] intArray6 = new int[] { (byte) -1, (byte) 1, ' ', (short) 10, (short) 1, (byte) 1 };
        int[] intArray8 = ds.MaxMin2.maxMin2(intArray6, (int) (byte) 0);
        int[] intArray10 = ds.MaxMin2.maxMin2(intArray6, (int) (short) 1);
        int[] intArray12 = ds.MaxMin2.maxMin2(intArray10, (-1));
        int[] intArray14 = ds.MaxMin2.maxMin2(intArray12, (int) (short) -1);
        int[] intArray16 = ds.MaxMin2.maxMin2(intArray14, (-1));
        int[] intArray18 = ds.MaxMin2.maxMin2(intArray16, (int) (short) 1);
        int[] intArray20 = ds.MaxMin2.maxMin2(intArray16, (int) (byte) 1);
        int[] intArray22 = ds.MaxMin2.maxMin2(intArray16, 0);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray24 = ds.MaxMin2.maxMin2(intArray16, 100);
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
    public void test438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test438");
        int[] intArray4 = new int[] { (byte) 0, 10, '#', (short) 0 };
        int[] intArray6 = ds.MaxMin2.maxMin2(intArray4, (int) (short) 1);
        int[] intArray8 = ds.MaxMin2.maxMin2(intArray4, (int) (short) 1);
        int[] intArray10 = ds.MaxMin2.maxMin2(intArray8, (int) (byte) -1);
        int[] intArray12 = ds.MaxMin2.maxMin2(intArray10, 1);
        int[] intArray14 = ds.MaxMin2.maxMin2(intArray10, 1);
        int[] intArray16 = ds.MaxMin2.maxMin2(intArray10, (-1));
        int[] intArray18 = ds.MaxMin2.maxMin2(intArray16, (int) (byte) 0);
        int[] intArray20 = ds.MaxMin2.maxMin2(intArray16, 1);
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
    public void test439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test439");
        int[] intArray6 = new int[] { (byte) -1, (byte) 1, ' ', (short) 10, (short) 1, (byte) 1 };
        int[] intArray8 = ds.MaxMin2.maxMin2(intArray6, (int) (byte) 0);
        int[] intArray10 = ds.MaxMin2.maxMin2(intArray6, (int) (byte) 0);
        int[] intArray12 = ds.MaxMin2.maxMin2(intArray10, (int) (short) -1);
        int[] intArray14 = ds.MaxMin2.maxMin2(intArray10, (int) (byte) -1);
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
    public void test440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test440");
        int[] intArray4 = new int[] { (byte) 0, 10, '#', (short) 0 };
        int[] intArray6 = ds.MaxMin2.maxMin2(intArray4, (int) (short) 1);
        int[] intArray8 = ds.MaxMin2.maxMin2(intArray6, 0);
        int[] intArray10 = ds.MaxMin2.maxMin2(intArray6, 0);
        int[] intArray12 = ds.MaxMin2.maxMin2(intArray10, (-1));
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray14 = ds.MaxMin2.maxMin2(intArray10, (int) (short) 10);
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
    public void test441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test441");
        int[] intArray4 = new int[] { (byte) 0, 10, '#', (short) 0 };
        int[] intArray6 = ds.MaxMin2.maxMin2(intArray4, (int) (short) 1);
        int[] intArray8 = ds.MaxMin2.maxMin2(intArray6, 0);
        int[] intArray10 = ds.MaxMin2.maxMin2(intArray8, (int) (byte) -1);
        int[] intArray12 = ds.MaxMin2.maxMin2(intArray10, 0);
        int[] intArray14 = ds.MaxMin2.maxMin2(intArray10, (int) (byte) 1);
        int[] intArray16 = ds.MaxMin2.maxMin2(intArray14, 1);
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
    public void test442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test442");
        int[] intArray4 = new int[] { (byte) 0, 10, '#', (short) 0 };
        int[] intArray6 = ds.MaxMin2.maxMin2(intArray4, (int) (short) 1);
        int[] intArray8 = ds.MaxMin2.maxMin2(intArray6, 0);
        int[] intArray10 = ds.MaxMin2.maxMin2(intArray8, 0);
        int[] intArray12 = ds.MaxMin2.maxMin2(intArray8, 0);
        int[] intArray14 = ds.MaxMin2.maxMin2(intArray12, (int) (byte) 0);
        int[] intArray16 = ds.MaxMin2.maxMin2(intArray12, (int) (short) 1);
        int[] intArray18 = ds.MaxMin2.maxMin2(intArray16, (int) (byte) 0);
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
    public void test443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test443");
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
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray26 = ds.MaxMin2.maxMin2(intArray24, (int) (byte) 10);
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
    }

    @Test
    public void test444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test444");
        int[] intArray6 = new int[] { (byte) -1, (byte) 1, ' ', (short) 10, (short) 1, (byte) 1 };
        int[] intArray8 = ds.MaxMin2.maxMin2(intArray6, (int) (byte) 0);
        int[] intArray10 = ds.MaxMin2.maxMin2(intArray6, (int) (short) 1);
        int[] intArray12 = ds.MaxMin2.maxMin2(intArray10, (-1));
        int[] intArray14 = ds.MaxMin2.maxMin2(intArray12, (int) (short) -1);
        int[] intArray16 = ds.MaxMin2.maxMin2(intArray14, (-1));
        int[] intArray18 = ds.MaxMin2.maxMin2(intArray16, (int) (short) 1);
        int[] intArray20 = ds.MaxMin2.maxMin2(intArray18, (-1));
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
    public void test445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test445");
        int[] intArray6 = new int[] { (byte) -1, (byte) 1, ' ', (short) 10, (short) 1, (byte) 1 };
        int[] intArray8 = ds.MaxMin2.maxMin2(intArray6, (int) (byte) 0);
        int[] intArray10 = ds.MaxMin2.maxMin2(intArray6, (int) (short) 1);
        int[] intArray12 = ds.MaxMin2.maxMin2(intArray10, (-1));
        int[] intArray14 = ds.MaxMin2.maxMin2(intArray12, (int) (short) -1);
        int[] intArray16 = ds.MaxMin2.maxMin2(intArray14, (-1));
        int[] intArray18 = ds.MaxMin2.maxMin2(intArray16, (int) (short) 1);
        int[] intArray20 = ds.MaxMin2.maxMin2(intArray16, (int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray22 = ds.MaxMin2.maxMin2(intArray20, (int) (short) 100);
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
    public void test446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test446");
        int[] intArray6 = new int[] { (byte) -1, (byte) 1, ' ', (short) 10, (short) 1, (byte) 1 };
        int[] intArray8 = ds.MaxMin2.maxMin2(intArray6, (int) (byte) 0);
        int[] intArray10 = ds.MaxMin2.maxMin2(intArray8, (int) (short) -1);
        int[] intArray12 = ds.MaxMin2.maxMin2(intArray8, (int) (byte) 1);
        java.lang.Class<?> wildcardClass13 = intArray8.getClass();
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
    public void test447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test447");
        int[] intArray4 = new int[] { (byte) 0, 10, '#', (short) 0 };
        int[] intArray6 = ds.MaxMin2.maxMin2(intArray4, (int) (short) 1);
        int[] intArray8 = ds.MaxMin2.maxMin2(intArray6, 0);
        int[] intArray10 = ds.MaxMin2.maxMin2(intArray8, (int) (byte) -1);
        int[] intArray12 = ds.MaxMin2.maxMin2(intArray10, 0);
        int[] intArray14 = ds.MaxMin2.maxMin2(intArray12, 0);
        int[] intArray16 = ds.MaxMin2.maxMin2(intArray14, (int) (short) 1);
        int[] intArray18 = ds.MaxMin2.maxMin2(intArray14, 0);
        int[] intArray20 = ds.MaxMin2.maxMin2(intArray18, (int) (short) -1);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray22 = ds.MaxMin2.maxMin2(intArray20, (int) 'a');
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
    public void test448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test448");
        int[] intArray6 = new int[] { (byte) -1, (byte) 1, ' ', (short) 10, (short) 1, (byte) 1 };
        int[] intArray8 = ds.MaxMin2.maxMin2(intArray6, (int) (byte) 0);
        int[] intArray10 = ds.MaxMin2.maxMin2(intArray6, (int) (byte) 0);
        int[] intArray12 = ds.MaxMin2.maxMin2(intArray10, (int) (short) -1);
        int[] intArray14 = ds.MaxMin2.maxMin2(intArray10, (int) (byte) -1);
        int[] intArray16 = ds.MaxMin2.maxMin2(intArray14, (int) (byte) 0);
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
    public void test449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test449");
        int[] intArray4 = new int[] { (byte) 0, 10, '#', (short) 0 };
        int[] intArray6 = ds.MaxMin2.maxMin2(intArray4, (int) (short) 1);
        int[] intArray8 = ds.MaxMin2.maxMin2(intArray4, (int) (short) 0);
        int[] intArray10 = ds.MaxMin2.maxMin2(intArray4, (int) (byte) -1);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray12 = ds.MaxMin2.maxMin2(intArray10, (int) '4');
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
    public void test450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test450");
        int[] intArray4 = new int[] { (byte) 0, 10, '#', (short) 0 };
        int[] intArray6 = ds.MaxMin2.maxMin2(intArray4, (int) (short) 1);
        int[] intArray8 = ds.MaxMin2.maxMin2(intArray6, 0);
        int[] intArray10 = ds.MaxMin2.maxMin2(intArray8, 0);
        int[] intArray12 = ds.MaxMin2.maxMin2(intArray8, 0);
        int[] intArray14 = ds.MaxMin2.maxMin2(intArray12, 0);
        int[] intArray16 = ds.MaxMin2.maxMin2(intArray14, (-1));
        int[] intArray18 = ds.MaxMin2.maxMin2(intArray16, 0);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray20 = ds.MaxMin2.maxMin2(intArray16, (int) '4');
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
    public void test451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test451");
        int[] intArray6 = new int[] { (byte) -1, (byte) 1, ' ', (short) 10, (short) 1, (byte) 1 };
        int[] intArray8 = ds.MaxMin2.maxMin2(intArray6, (int) (byte) 0);
        int[] intArray10 = ds.MaxMin2.maxMin2(intArray6, (int) (byte) 1);
        int[] intArray12 = ds.MaxMin2.maxMin2(intArray10, (int) (byte) 1);
        int[] intArray14 = ds.MaxMin2.maxMin2(intArray10, (int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray16 = ds.MaxMin2.maxMin2(intArray14, (int) (byte) 10);
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
    public void test452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test452");
        int[] intArray0 = null;
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray2 = ds.MaxMin2.maxMin2(intArray0, (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test453");
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
            int[] intArray24 = ds.MaxMin2.maxMin2(intArray18, 100);
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
    public void test454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test454");
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
            int[] intArray22 = ds.MaxMin2.maxMin2(intArray14, (int) '#');
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
    public void test455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test455");
        int[] intArray4 = new int[] { (byte) 0, 10, '#', (short) 0 };
        int[] intArray6 = ds.MaxMin2.maxMin2(intArray4, (int) (short) 1);
        int[] intArray8 = ds.MaxMin2.maxMin2(intArray6, 0);
        int[] intArray10 = ds.MaxMin2.maxMin2(intArray8, 0);
        int[] intArray12 = ds.MaxMin2.maxMin2(intArray8, 0);
        int[] intArray14 = ds.MaxMin2.maxMin2(intArray12, 0);
        int[] intArray16 = ds.MaxMin2.maxMin2(intArray14, (-1));
        int[] intArray18 = ds.MaxMin2.maxMin2(intArray16, (int) (byte) 0);
        int[] intArray20 = ds.MaxMin2.maxMin2(intArray18, (int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray22 = ds.MaxMin2.maxMin2(intArray18, (int) (byte) 100);
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
    public void test456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test456");
        int[] intArray4 = new int[] { (byte) 0, 10, '#', (short) 0 };
        int[] intArray6 = ds.MaxMin2.maxMin2(intArray4, (int) (short) 1);
        int[] intArray8 = ds.MaxMin2.maxMin2(intArray4, (int) (short) 1);
        int[] intArray10 = ds.MaxMin2.maxMin2(intArray8, (int) (byte) -1);
        int[] intArray12 = ds.MaxMin2.maxMin2(intArray10, 1);
        int[] intArray14 = ds.MaxMin2.maxMin2(intArray10, 1);
        int[] intArray16 = ds.MaxMin2.maxMin2(intArray14, 0);
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
    public void test457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test457");
        int[] intArray6 = new int[] { (byte) -1, (byte) 1, ' ', (short) 10, (short) 1, (byte) 1 };
        int[] intArray8 = ds.MaxMin2.maxMin2(intArray6, (int) (byte) 0);
        int[] intArray10 = ds.MaxMin2.maxMin2(intArray6, (int) (byte) 1);
        int[] intArray12 = ds.MaxMin2.maxMin2(intArray10, (int) (byte) 1);
        int[] intArray14 = ds.MaxMin2.maxMin2(intArray12, (int) (byte) -1);
        int[] intArray16 = ds.MaxMin2.maxMin2(intArray12, (int) (short) 1);
        int[] intArray18 = ds.MaxMin2.maxMin2(intArray12, (int) (byte) -1);
        int[] intArray20 = ds.MaxMin2.maxMin2(intArray12, (int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray22 = ds.MaxMin2.maxMin2(intArray20, (int) (short) 100);
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
    public void test458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test458");
        int[] intArray4 = new int[] { (byte) 0, 10, '#', (short) 0 };
        int[] intArray6 = ds.MaxMin2.maxMin2(intArray4, (int) (short) 1);
        int[] intArray8 = ds.MaxMin2.maxMin2(intArray4, (int) (short) 1);
        int[] intArray10 = ds.MaxMin2.maxMin2(intArray8, (int) (byte) -1);
        int[] intArray12 = ds.MaxMin2.maxMin2(intArray10, 1);
        int[] intArray14 = ds.MaxMin2.maxMin2(intArray10, 1);
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
    public void test459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test459");
        int[] intArray6 = new int[] { (byte) -1, (byte) 1, ' ', (short) 10, (short) 1, (byte) 1 };
        int[] intArray8 = ds.MaxMin2.maxMin2(intArray6, (int) (byte) 0);
        int[] intArray10 = ds.MaxMin2.maxMin2(intArray6, (int) (short) 1);
        int[] intArray12 = ds.MaxMin2.maxMin2(intArray10, (-1));
        int[] intArray14 = ds.MaxMin2.maxMin2(intArray10, (int) (byte) 0);
        int[] intArray16 = ds.MaxMin2.maxMin2(intArray10, 1);
        int[] intArray18 = ds.MaxMin2.maxMin2(intArray16, (int) (byte) -1);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray20 = ds.MaxMin2.maxMin2(intArray18, 100);
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
    public void test460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test460");
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
    public void test461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test461");
        int[] intArray4 = new int[] { (byte) 0, 10, '#', (short) 0 };
        int[] intArray6 = ds.MaxMin2.maxMin2(intArray4, (int) (short) 1);
        int[] intArray8 = ds.MaxMin2.maxMin2(intArray4, (int) (byte) -1);
        int[] intArray10 = ds.MaxMin2.maxMin2(intArray8, (int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray12 = ds.MaxMin2.maxMin2(intArray10, (int) (byte) 100);
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
    public void test462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test462");
        int[] intArray4 = new int[] { (byte) 0, 10, '#', (short) 0 };
        int[] intArray6 = ds.MaxMin2.maxMin2(intArray4, (int) (short) 1);
        int[] intArray8 = ds.MaxMin2.maxMin2(intArray6, 0);
        int[] intArray10 = ds.MaxMin2.maxMin2(intArray8, 0);
        int[] intArray12 = ds.MaxMin2.maxMin2(intArray8, 0);
        int[] intArray14 = ds.MaxMin2.maxMin2(intArray12, 0);
        int[] intArray16 = ds.MaxMin2.maxMin2(intArray14, (-1));
        int[] intArray18 = ds.MaxMin2.maxMin2(intArray16, (int) (byte) 1);
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
    public void test463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test463");
        int[] intArray4 = new int[] { (byte) 0, 10, '#', (short) 0 };
        int[] intArray6 = ds.MaxMin2.maxMin2(intArray4, (int) (short) 1);
        int[] intArray8 = ds.MaxMin2.maxMin2(intArray6, 0);
        int[] intArray10 = ds.MaxMin2.maxMin2(intArray8, 0);
        int[] intArray12 = ds.MaxMin2.maxMin2(intArray8, 0);
        int[] intArray14 = ds.MaxMin2.maxMin2(intArray12, 0);
        int[] intArray16 = ds.MaxMin2.maxMin2(intArray12, (int) (short) -1);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray18 = ds.MaxMin2.maxMin2(intArray12, (int) '4');
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
    public void test464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test464");
        int[] intArray4 = new int[] { (byte) 0, 10, '#', (short) 0 };
        int[] intArray6 = ds.MaxMin2.maxMin2(intArray4, (int) (short) 1);
        int[] intArray8 = ds.MaxMin2.maxMin2(intArray6, 0);
        int[] intArray10 = ds.MaxMin2.maxMin2(intArray6, 0);
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
    public void test465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test465");
        int[] intArray6 = new int[] { (byte) -1, (byte) 1, ' ', (short) 10, (short) 1, (byte) 1 };
        int[] intArray8 = ds.MaxMin2.maxMin2(intArray6, (int) (byte) 0);
        int[] intArray10 = ds.MaxMin2.maxMin2(intArray6, (int) (short) 1);
        int[] intArray12 = ds.MaxMin2.maxMin2(intArray10, (-1));
        int[] intArray14 = ds.MaxMin2.maxMin2(intArray12, (int) (short) -1);
        int[] intArray16 = ds.MaxMin2.maxMin2(intArray12, (int) (byte) 1);
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
    public void test466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test466");
        int[] intArray4 = new int[] { (byte) 0, 10, '#', (short) 0 };
        int[] intArray6 = ds.MaxMin2.maxMin2(intArray4, (int) (short) 1);
        int[] intArray8 = ds.MaxMin2.maxMin2(intArray4, (int) (short) 1);
        int[] intArray10 = ds.MaxMin2.maxMin2(intArray8, (int) (short) 1);
        int[] intArray12 = ds.MaxMin2.maxMin2(intArray8, (-1));
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray14 = ds.MaxMin2.maxMin2(intArray12, 10);
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
    public void test467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test467");
        int[] intArray6 = new int[] { (byte) -1, (byte) 1, ' ', (short) 10, (short) 1, (byte) 1 };
        int[] intArray8 = ds.MaxMin2.maxMin2(intArray6, (int) (byte) 0);
        int[] intArray10 = ds.MaxMin2.maxMin2(intArray6, (int) (byte) 0);
        int[] intArray12 = ds.MaxMin2.maxMin2(intArray10, (int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray14 = ds.MaxMin2.maxMin2(intArray10, 100);
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
    public void test468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test468");
        int[] intArray4 = new int[] { (byte) 0, 10, '#', (short) 0 };
        int[] intArray6 = ds.MaxMin2.maxMin2(intArray4, (int) (short) 1);
        int[] intArray8 = ds.MaxMin2.maxMin2(intArray6, 0);
        int[] intArray10 = ds.MaxMin2.maxMin2(intArray8, (int) (byte) -1);
        int[] intArray12 = ds.MaxMin2.maxMin2(intArray10, 0);
        int[] intArray14 = ds.MaxMin2.maxMin2(intArray10, (int) (byte) 1);
        int[] intArray16 = ds.MaxMin2.maxMin2(intArray14, (int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray18 = ds.MaxMin2.maxMin2(intArray16, 100);
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
    public void test469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test469");
        int[] intArray6 = new int[] { (byte) -1, (byte) 1, ' ', (short) 10, (short) 1, (byte) 1 };
        int[] intArray8 = ds.MaxMin2.maxMin2(intArray6, (int) (byte) 0);
        int[] intArray10 = ds.MaxMin2.maxMin2(intArray6, (int) (byte) 0);
        int[] intArray12 = ds.MaxMin2.maxMin2(intArray10, (int) (byte) -1);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray14 = ds.MaxMin2.maxMin2(intArray12, (int) (byte) 10);
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
    public void test470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test470");
        int[] intArray6 = new int[] { (byte) -1, (byte) 1, ' ', (short) 10, (short) 1, (byte) 1 };
        int[] intArray8 = ds.MaxMin2.maxMin2(intArray6, (int) (byte) 0);
        int[] intArray10 = ds.MaxMin2.maxMin2(intArray6, (int) (short) 1);
        int[] intArray12 = ds.MaxMin2.maxMin2(intArray10, (-1));
        int[] intArray14 = ds.MaxMin2.maxMin2(intArray12, (int) (byte) -1);
        int[] intArray16 = ds.MaxMin2.maxMin2(intArray14, (int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray18 = ds.MaxMin2.maxMin2(intArray14, (int) 'a');
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
    public void test471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test471");
        int[] intArray6 = new int[] { (byte) -1, (byte) 1, ' ', (short) 10, (short) 1, (byte) 1 };
        int[] intArray8 = ds.MaxMin2.maxMin2(intArray6, (int) (byte) 0);
        int[] intArray10 = ds.MaxMin2.maxMin2(intArray6, (int) (byte) 1);
        java.lang.Class<?> wildcardClass11 = intArray10.getClass();
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[-1, 1, 32, 10, 1, 1]");
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[-1, -1]");
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test472");
        int[] intArray4 = new int[] { (byte) 0, 10, '#', (short) 0 };
        int[] intArray6 = ds.MaxMin2.maxMin2(intArray4, (int) (short) 1);
        int[] intArray8 = ds.MaxMin2.maxMin2(intArray6, 0);
        int[] intArray10 = ds.MaxMin2.maxMin2(intArray8, 0);
        int[] intArray12 = ds.MaxMin2.maxMin2(intArray8, 0);
        int[] intArray14 = ds.MaxMin2.maxMin2(intArray12, 0);
        int[] intArray16 = ds.MaxMin2.maxMin2(intArray14, (-1));
        int[] intArray18 = ds.MaxMin2.maxMin2(intArray16, 0);
        int[] intArray20 = ds.MaxMin2.maxMin2(intArray16, (-1));
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
    public void test473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test473");
        int[] intArray4 = new int[] { (byte) 0, 10, '#', (short) 0 };
        int[] intArray6 = ds.MaxMin2.maxMin2(intArray4, (int) (short) 1);
        int[] intArray8 = ds.MaxMin2.maxMin2(intArray6, 0);
        int[] intArray10 = ds.MaxMin2.maxMin2(intArray8, 0);
        int[] intArray12 = ds.MaxMin2.maxMin2(intArray8, 0);
        int[] intArray14 = ds.MaxMin2.maxMin2(intArray12, 0);
        int[] intArray16 = ds.MaxMin2.maxMin2(intArray12, 0);
        int[] intArray18 = ds.MaxMin2.maxMin2(intArray12, (int) (byte) -1);
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
    public void test474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test474");
        int[] intArray4 = new int[] { (byte) 0, 10, '#', (short) 0 };
        int[] intArray6 = ds.MaxMin2.maxMin2(intArray4, (int) (short) 1);
        int[] intArray8 = ds.MaxMin2.maxMin2(intArray6, 0);
        int[] intArray10 = ds.MaxMin2.maxMin2(intArray8, (int) (byte) -1);
        int[] intArray12 = ds.MaxMin2.maxMin2(intArray10, 0);
        int[] intArray14 = ds.MaxMin2.maxMin2(intArray10, (int) (short) 0);
        int[] intArray16 = ds.MaxMin2.maxMin2(intArray10, (int) (byte) 0);
        int[] intArray18 = ds.MaxMin2.maxMin2(intArray16, (int) (byte) 1);
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
    public void test475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test475");
        int[] intArray6 = new int[] { (byte) -1, (byte) 1, ' ', (short) 10, (short) 1, (byte) 1 };
        int[] intArray8 = ds.MaxMin2.maxMin2(intArray6, (int) (byte) 0);
        int[] intArray10 = ds.MaxMin2.maxMin2(intArray6, (int) (short) 1);
        int[] intArray12 = ds.MaxMin2.maxMin2(intArray10, (-1));
        int[] intArray14 = ds.MaxMin2.maxMin2(intArray12, (int) (short) -1);
        int[] intArray16 = ds.MaxMin2.maxMin2(intArray14, (int) (byte) 1);
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
    public void test476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test476");
        int[] intArray6 = new int[] { (byte) -1, (byte) 1, ' ', (short) 10, (short) 1, (byte) 1 };
        int[] intArray8 = ds.MaxMin2.maxMin2(intArray6, (int) (byte) 0);
        int[] intArray10 = ds.MaxMin2.maxMin2(intArray6, (int) (short) 1);
        int[] intArray12 = ds.MaxMin2.maxMin2(intArray10, (-1));
        int[] intArray14 = ds.MaxMin2.maxMin2(intArray10, (int) (byte) 0);
        int[] intArray16 = ds.MaxMin2.maxMin2(intArray10, 1);
        int[] intArray18 = ds.MaxMin2.maxMin2(intArray16, (int) (byte) -1);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray20 = ds.MaxMin2.maxMin2(intArray18, (int) 'a');
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
    public void test477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test477");
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
            int[] intArray22 = ds.MaxMin2.maxMin2(intArray20, (int) (byte) 100);
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
    public void test478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test478");
        int[] intArray6 = new int[] { (byte) -1, (byte) 1, ' ', (short) 10, (short) 1, (byte) 1 };
        int[] intArray8 = ds.MaxMin2.maxMin2(intArray6, (int) (byte) 0);
        int[] intArray10 = ds.MaxMin2.maxMin2(intArray6, (int) (byte) 0);
        int[] intArray12 = ds.MaxMin2.maxMin2(intArray10, (int) (short) -1);
        int[] intArray14 = ds.MaxMin2.maxMin2(intArray10, (int) (byte) -1);
        int[] intArray16 = ds.MaxMin2.maxMin2(intArray10, 0);
        int[] intArray18 = ds.MaxMin2.maxMin2(intArray10, (int) (short) -1);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray20 = ds.MaxMin2.maxMin2(intArray18, (int) (short) 10);
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
    public void test479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test479");
        int[] intArray6 = new int[] { (byte) -1, (byte) 1, ' ', (short) 10, (short) 1, (byte) 1 };
        int[] intArray8 = ds.MaxMin2.maxMin2(intArray6, (int) (byte) 0);
        int[] intArray10 = ds.MaxMin2.maxMin2(intArray6, (int) (byte) 0);
        int[] intArray12 = ds.MaxMin2.maxMin2(intArray10, (int) (short) 0);
        int[] intArray14 = ds.MaxMin2.maxMin2(intArray12, (int) (short) 1);
        int[] intArray16 = ds.MaxMin2.maxMin2(intArray12, 0);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray18 = ds.MaxMin2.maxMin2(intArray12, (int) (byte) 10);
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
    public void test480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test480");
        int[] intArray4 = new int[] { (byte) 0, 10, '#', (short) 0 };
        int[] intArray6 = ds.MaxMin2.maxMin2(intArray4, (int) (short) 1);
        int[] intArray8 = ds.MaxMin2.maxMin2(intArray6, 0);
        int[] intArray10 = ds.MaxMin2.maxMin2(intArray8, 0);
        int[] intArray12 = ds.MaxMin2.maxMin2(intArray8, 0);
        int[] intArray14 = ds.MaxMin2.maxMin2(intArray12, 0);
        int[] intArray16 = ds.MaxMin2.maxMin2(intArray14, (-1));
        int[] intArray18 = ds.MaxMin2.maxMin2(intArray16, (int) (byte) 1);
        int[] intArray20 = ds.MaxMin2.maxMin2(intArray18, (int) (byte) 0);
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
    public void test481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test481");
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
    public void test482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test482");
        int[] intArray4 = new int[] { (byte) 0, 10, '#', (short) 0 };
        int[] intArray6 = ds.MaxMin2.maxMin2(intArray4, (int) (short) 1);
        int[] intArray8 = ds.MaxMin2.maxMin2(intArray6, 0);
        int[] intArray10 = ds.MaxMin2.maxMin2(intArray8, 0);
        int[] intArray12 = ds.MaxMin2.maxMin2(intArray8, 0);
        int[] intArray14 = ds.MaxMin2.maxMin2(intArray12, 0);
        int[] intArray16 = ds.MaxMin2.maxMin2(intArray12, 0);
        int[] intArray18 = ds.MaxMin2.maxMin2(intArray12, (int) (byte) -1);
        java.lang.Class<?> wildcardClass19 = intArray12.getClass();
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
    public void test483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test483");
        int[] intArray4 = new int[] { (byte) 0, 10, '#', (short) 0 };
        int[] intArray6 = ds.MaxMin2.maxMin2(intArray4, (int) (short) 1);
        int[] intArray8 = ds.MaxMin2.maxMin2(intArray4, (int) (short) 0);
        int[] intArray10 = ds.MaxMin2.maxMin2(intArray4, (int) (byte) -1);
        int[] intArray12 = ds.MaxMin2.maxMin2(intArray4, (int) (short) 1);
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
    public void test484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test484");
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
            int[] intArray24 = ds.MaxMin2.maxMin2(intArray14, 10);
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
    public void test485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test485");
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
        java.lang.Class<?> wildcardClass27 = intArray26.getClass();
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
    public void test486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test486");
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
    public void test487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test487");
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
        int[] intArray24 = ds.MaxMin2.maxMin2(intArray20, 1);
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
    public void test488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test488");
        int[] intArray4 = new int[] { (byte) 0, 10, '#', (short) 0 };
        int[] intArray6 = ds.MaxMin2.maxMin2(intArray4, (int) (short) 1);
        int[] intArray8 = ds.MaxMin2.maxMin2(intArray6, 0);
        int[] intArray10 = ds.MaxMin2.maxMin2(intArray8, (int) (byte) -1);
        int[] intArray12 = ds.MaxMin2.maxMin2(intArray10, 0);
        int[] intArray14 = ds.MaxMin2.maxMin2(intArray10, (int) (byte) 1);
        int[] intArray16 = ds.MaxMin2.maxMin2(intArray14, 1);
        int[] intArray18 = ds.MaxMin2.maxMin2(intArray16, 0);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray20 = ds.MaxMin2.maxMin2(intArray16, (int) (short) 10);
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
    public void test489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test489");
        int[] intArray4 = new int[] { (byte) 0, 10, '#', (short) 0 };
        int[] intArray6 = ds.MaxMin2.maxMin2(intArray4, (int) (short) 1);
        int[] intArray8 = ds.MaxMin2.maxMin2(intArray6, 0);
        int[] intArray10 = ds.MaxMin2.maxMin2(intArray8, (int) (byte) -1);
        int[] intArray12 = ds.MaxMin2.maxMin2(intArray10, 0);
        int[] intArray14 = ds.MaxMin2.maxMin2(intArray12, 1);
        int[] intArray16 = ds.MaxMin2.maxMin2(intArray14, (int) (short) 1);
        int[] intArray18 = ds.MaxMin2.maxMin2(intArray16, 0);
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
    public void test490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test490");
        int[] intArray4 = new int[] { (byte) 0, 10, '#', (short) 0 };
        int[] intArray6 = ds.MaxMin2.maxMin2(intArray4, (int) (short) 1);
        int[] intArray8 = ds.MaxMin2.maxMin2(intArray6, 0);
        int[] intArray10 = ds.MaxMin2.maxMin2(intArray8, 0);
        int[] intArray12 = ds.MaxMin2.maxMin2(intArray8, 0);
        int[] intArray14 = ds.MaxMin2.maxMin2(intArray12, (int) (byte) 1);
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
    public void test491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test491");
        int[] intArray6 = new int[] { (byte) -1, (byte) 1, ' ', (short) 10, (short) 1, (byte) 1 };
        int[] intArray8 = ds.MaxMin2.maxMin2(intArray6, (int) (byte) 0);
        int[] intArray10 = ds.MaxMin2.maxMin2(intArray6, (int) (byte) 1);
        int[] intArray12 = ds.MaxMin2.maxMin2(intArray10, (int) (byte) 1);
        int[] intArray14 = ds.MaxMin2.maxMin2(intArray12, (int) (byte) -1);
        int[] intArray16 = ds.MaxMin2.maxMin2(intArray12, (int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray18 = ds.MaxMin2.maxMin2(intArray12, (int) (short) 10);
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
    public void test492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test492");
        int[] intArray4 = new int[] { (byte) 0, 10, '#', (short) 0 };
        int[] intArray6 = ds.MaxMin2.maxMin2(intArray4, (int) (short) 1);
        int[] intArray8 = ds.MaxMin2.maxMin2(intArray4, (int) (short) 1);
        int[] intArray10 = ds.MaxMin2.maxMin2(intArray8, (int) (byte) -1);
        int[] intArray12 = ds.MaxMin2.maxMin2(intArray10, 1);
        int[] intArray14 = ds.MaxMin2.maxMin2(intArray10, 1);
        int[] intArray16 = ds.MaxMin2.maxMin2(intArray10, (-1));
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
    public void test493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test493");
        int[] intArray4 = new int[] { (byte) 0, 10, '#', (short) 0 };
        int[] intArray6 = ds.MaxMin2.maxMin2(intArray4, (int) (short) 1);
        int[] intArray8 = ds.MaxMin2.maxMin2(intArray4, (int) (short) 1);
        int[] intArray10 = ds.MaxMin2.maxMin2(intArray8, (int) (byte) -1);
        int[] intArray12 = ds.MaxMin2.maxMin2(intArray8, (int) (short) 0);
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
    public void test494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test494");
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
            int[] intArray22 = ds.MaxMin2.maxMin2(intArray20, (int) 'a');
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
    public void test495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test495");
        int[] intArray6 = new int[] { (byte) -1, (byte) 1, ' ', (short) 10, (short) 1, (byte) 1 };
        int[] intArray8 = ds.MaxMin2.maxMin2(intArray6, (int) (byte) 0);
        int[] intArray10 = ds.MaxMin2.maxMin2(intArray6, (int) (short) 1);
        int[] intArray12 = ds.MaxMin2.maxMin2(intArray10, (-1));
        int[] intArray14 = ds.MaxMin2.maxMin2(intArray12, (int) (short) -1);
        int[] intArray16 = ds.MaxMin2.maxMin2(intArray14, (-1));
        int[] intArray18 = ds.MaxMin2.maxMin2(intArray16, (int) (short) 1);
        int[] intArray20 = ds.MaxMin2.maxMin2(intArray16, (int) (short) 0);
        int[] intArray22 = ds.MaxMin2.maxMin2(intArray20, (int) (byte) 0);
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
    public void test496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test496");
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
    public void test497() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test497");
        int[] intArray4 = new int[] { (byte) 0, 10, '#', (short) 0 };
        int[] intArray6 = ds.MaxMin2.maxMin2(intArray4, (int) (short) 1);
        int[] intArray8 = ds.MaxMin2.maxMin2(intArray6, 0);
        int[] intArray10 = ds.MaxMin2.maxMin2(intArray8, 0);
        int[] intArray12 = ds.MaxMin2.maxMin2(intArray8, 0);
        int[] intArray14 = ds.MaxMin2.maxMin2(intArray12, (int) (byte) 0);
        int[] intArray16 = ds.MaxMin2.maxMin2(intArray14, (int) (short) 1);
        int[] intArray18 = ds.MaxMin2.maxMin2(intArray14, (int) (short) -1);
        int[] intArray20 = ds.MaxMin2.maxMin2(intArray14, (int) (byte) 1);
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
    public void test498() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test498");
        int[] intArray6 = new int[] { (byte) -1, (byte) 1, ' ', (short) 10, (short) 1, (byte) 1 };
        int[] intArray8 = ds.MaxMin2.maxMin2(intArray6, (int) (byte) 0);
        int[] intArray10 = ds.MaxMin2.maxMin2(intArray6, (int) (short) 1);
        int[] intArray12 = ds.MaxMin2.maxMin2(intArray10, (-1));
        int[] intArray14 = ds.MaxMin2.maxMin2(intArray12, (int) (short) -1);
        int[] intArray16 = ds.MaxMin2.maxMin2(intArray14, (-1));
        int[] intArray18 = ds.MaxMin2.maxMin2(intArray14, 0);
        int[] intArray20 = ds.MaxMin2.maxMin2(intArray18, 0);
        int[] intArray22 = ds.MaxMin2.maxMin2(intArray20, (int) (short) -1);
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
    public void test499() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test499");
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
    public void test500() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test500");
        int[] intArray4 = new int[] { (byte) 0, 10, '#', (short) 0 };
        int[] intArray6 = ds.MaxMin2.maxMin2(intArray4, (int) (short) 1);
        int[] intArray8 = ds.MaxMin2.maxMin2(intArray6, 0);
        int[] intArray10 = ds.MaxMin2.maxMin2(intArray8, (int) (byte) -1);
        int[] intArray12 = ds.MaxMin2.maxMin2(intArray10, 0);
        int[] intArray14 = ds.MaxMin2.maxMin2(intArray10, (int) (short) 0);
        int[] intArray16 = ds.MaxMin2.maxMin2(intArray10, (int) (byte) 0);
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
}

