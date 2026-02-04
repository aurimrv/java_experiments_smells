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
        int[] intArray14 = new int[] { 0, 1, (byte) 1, (short) 0, 100, (short) 100 };
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) 0, intArray14);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) 1, intArray14);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) 0, intArray14);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) -1, intArray14);
        ds.AvaliaMultMatrizes.multmatrize(1, intArray14);
        ds.AvaliaMultMatrizes.multmatrize(1, intArray14);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) 0, intArray14);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) 0, intArray14);
        java.lang.Class<?> wildcardClass23 = intArray14.getClass();
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[0, 1, 1, 0, 100, 100]");
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test1502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1502");
        int[] intArray12 = new int[] { 0, 1, (byte) 1, (short) 0, 100, (short) 100 };
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) 0, intArray12);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) -1, intArray12);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) 1, intArray12);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) 0, intArray12);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) 0, intArray12);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) 0, intArray12);
        java.lang.Class<?> wildcardClass19 = intArray12.getClass();
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[0, 1, 1, 0, 100, 100]");
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test1503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1503");
        int[] intArray15 = new int[] { 0, 1, (byte) 1, (short) 0, 100, (short) 100 };
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) 0, intArray15);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) 1, intArray15);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) 0, intArray15);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) -1, intArray15);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) 1, intArray15);
        ds.AvaliaMultMatrizes.multmatrize((-1), intArray15);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) 0, intArray15);
        ds.AvaliaMultMatrizes.multmatrize(0, intArray15);
        // The following exception was thrown during execution in test generation
        try {
            ds.AvaliaMultMatrizes.multmatrize(100, intArray15);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[0, 1, 1, 0, 100, 100]");
    }

    @Test
    public void test1504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1504");
        int[] intArray13 = new int[] { 0, 1, (byte) 1, (short) 0, 100, (short) 100 };
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) 0, intArray13);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) 1, intArray13);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) -1, intArray13);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) 1, intArray13);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) -1, intArray13);
        ds.AvaliaMultMatrizes.multmatrize(0, intArray13);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) -1, intArray13);
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[0, 1, 1, 0, 100, 100]");
    }

    @Test
    public void test1505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1505");
        int[] intArray16 = new int[] { 0, 1, (byte) 1, (short) 0, 100, (short) 100 };
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) 0, intArray16);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) 0, intArray16);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) -1, intArray16);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) -1, intArray16);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) 1, intArray16);
        ds.AvaliaMultMatrizes.multmatrize(1, intArray16);
        ds.AvaliaMultMatrizes.multmatrize((-1), intArray16);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) 1, intArray16);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) -1, intArray16);
        // The following exception was thrown during execution in test generation
        try {
            ds.AvaliaMultMatrizes.multmatrize((int) (short) 100, intArray16);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray16), "[0, 1, 1, 0, 100, 100]");
    }

    @Test
    public void test1506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1506");
        int[] intArray14 = new int[] { 0, 1, (byte) 1, (short) 0, 100, (short) 100 };
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) 0, intArray14);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) 1, intArray14);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) -1, intArray14);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) 1, intArray14);
        ds.AvaliaMultMatrizes.multmatrize((-1), intArray14);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) 0, intArray14);
        ds.AvaliaMultMatrizes.multmatrize(0, intArray14);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) -1, intArray14);
        java.lang.Class<?> wildcardClass23 = intArray14.getClass();
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[0, 1, 1, 0, 100, 100]");
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test1507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1507");
        int[] intArray12 = new int[] { 0, 1, (byte) 1, (short) 0, 100, (short) 100 };
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) 0, intArray12);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) 1, intArray12);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) 1, intArray12);
        ds.AvaliaMultMatrizes.multmatrize(0, intArray12);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) 1, intArray12);
        ds.AvaliaMultMatrizes.multmatrize(0, intArray12);
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[0, 1, 1, 0, 100, 100]");
    }

    @Test
    public void test1508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1508");
        int[] intArray16 = new int[] { 0, 1, (byte) 1, (short) 0, 100, (short) 100 };
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) 0, intArray16);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) 1, intArray16);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) 0, intArray16);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) -1, intArray16);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) 1, intArray16);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) -1, intArray16);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) 0, intArray16);
        ds.AvaliaMultMatrizes.multmatrize((-1), intArray16);
        ds.AvaliaMultMatrizes.multmatrize(0, intArray16);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) 0, intArray16);
        java.lang.Class<?> wildcardClass27 = intArray16.getClass();
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray16), "[0, 1, 1, 0, 100, 100]");
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test1509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1509");
        int[] intArray11 = new int[] { 0, 1, (byte) 1, (short) 0, 100, (short) 100 };
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) 0, intArray11);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) 0, intArray11);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) 0, intArray11);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) -1, intArray11);
        ds.AvaliaMultMatrizes.multmatrize(0, intArray11);
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[0, 1, 1, 0, 100, 100]");
    }

    @Test
    public void test1510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1510");
        int[] intArray9 = new int[] { (byte) 1, (byte) 100, (byte) 100, (-1), (short) 1 };
        ds.AvaliaMultMatrizes.multmatrize(0, intArray9);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) 1, intArray9);
        ds.AvaliaMultMatrizes.multmatrize(0, intArray9);
        // The following exception was thrown during execution in test generation
        try {
            ds.AvaliaMultMatrizes.multmatrize((int) (byte) 10, intArray9);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[1, 100, 100, -1, 1]");
    }

    @Test
    public void test1511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1511");
        int[] intArray15 = new int[] { 0, 1, (byte) 1, (short) 0, 100, (short) 100 };
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) 0, intArray15);
        ds.AvaliaMultMatrizes.multmatrize(1, intArray15);
        ds.AvaliaMultMatrizes.multmatrize(1, intArray15);
        ds.AvaliaMultMatrizes.multmatrize(0, intArray15);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) -1, intArray15);
        ds.AvaliaMultMatrizes.multmatrize(0, intArray15);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) 1, intArray15);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) 1, intArray15);
        // The following exception was thrown during execution in test generation
        try {
            ds.AvaliaMultMatrizes.multmatrize(100, intArray15);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[0, 1, 1, 0, 100, 100]");
    }

    @Test
    public void test1512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1512");
        int[] intArray16 = new int[] { 0, 1, (byte) 1, (short) 0, 100, (short) 100 };
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) 0, intArray16);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) 1, intArray16);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) 0, intArray16);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) -1, intArray16);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) -1, intArray16);
        ds.AvaliaMultMatrizes.multmatrize(0, intArray16);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) 1, intArray16);
        ds.AvaliaMultMatrizes.multmatrize((-1), intArray16);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) -1, intArray16);
        ds.AvaliaMultMatrizes.multmatrize(0, intArray16);
        java.lang.Class<?> wildcardClass27 = intArray16.getClass();
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray16), "[0, 1, 1, 0, 100, 100]");
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test1513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1513");
        int[] intArray15 = new int[] { 0, 1, (byte) 1, (short) 0, 100, (short) 100 };
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) 0, intArray15);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) 1, intArray15);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) 0, intArray15);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) -1, intArray15);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) -1, intArray15);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) 0, intArray15);
        ds.AvaliaMultMatrizes.multmatrize(1, intArray15);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) 1, intArray15);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) 1, intArray15);
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[0, 1, 1, 0, 100, 100]");
    }

    @Test
    public void test1514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1514");
        int[] intArray15 = new int[] { 0, 1, (byte) 1, (short) 0, 100, (short) 100 };
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) 0, intArray15);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) 1, intArray15);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) 0, intArray15);
        ds.AvaliaMultMatrizes.multmatrize(0, intArray15);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) 0, intArray15);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) 0, intArray15);
        ds.AvaliaMultMatrizes.multmatrize(1, intArray15);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) -1, intArray15);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) 0, intArray15);
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[0, 1, 1, 0, 100, 100]");
    }

    @Test
    public void test1515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1515");
        int[] intArray13 = new int[] { (byte) 1, (byte) 100, (byte) 100, (-1), (short) 1 };
        ds.AvaliaMultMatrizes.multmatrize(0, intArray13);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) 1, intArray13);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) -1, intArray13);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) 0, intArray13);
        ds.AvaliaMultMatrizes.multmatrize(0, intArray13);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) 1, intArray13);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) 1, intArray13);
        // The following exception was thrown during execution in test generation
        try {
            ds.AvaliaMultMatrizes.multmatrize((int) (short) 100, intArray13);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[1, 100, 100, -1, 1]");
    }

    @Test
    public void test1516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1516");
        int[] intArray11 = new int[] { 0, 1, (byte) 1, (short) 0, 100, (short) 100 };
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) 0, intArray11);
        ds.AvaliaMultMatrizes.multmatrize(1, intArray11);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) -1, intArray11);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) 0, intArray11);
        ds.AvaliaMultMatrizes.multmatrize(1, intArray11);
        java.lang.Class<?> wildcardClass17 = intArray11.getClass();
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[0, 1, 1, 0, 100, 100]");
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test1517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1517");
        int[] intArray16 = new int[] { 0, 1, (byte) 1, (short) 0, 100, (short) 100 };
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) 0, intArray16);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) 1, intArray16);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) 0, intArray16);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) -1, intArray16);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) -1, intArray16);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) 0, intArray16);
        ds.AvaliaMultMatrizes.multmatrize(1, intArray16);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) 1, intArray16);
        ds.AvaliaMultMatrizes.multmatrize(0, intArray16);
        // The following exception was thrown during execution in test generation
        try {
            ds.AvaliaMultMatrizes.multmatrize((int) (short) 10, intArray16);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray16), "[0, 1, 1, 0, 100, 100]");
    }

    @Test
    public void test1518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1518");
        int[] intArray15 = new int[] { 0, 1, (byte) 1, (short) 0, 100, (short) 100 };
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) 0, intArray15);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) 0, intArray15);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) 1, intArray15);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) 1, intArray15);
        ds.AvaliaMultMatrizes.multmatrize((-1), intArray15);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) -1, intArray15);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) -1, intArray15);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) 1, intArray15);
        // The following exception was thrown during execution in test generation
        try {
            ds.AvaliaMultMatrizes.multmatrize(10, intArray15);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[0, 1, 1, 0, 100, 100]");
    }

    @Test
    public void test1519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1519");
        int[] intArray8 = new int[] { 0, 1, (byte) 1, (short) 0, 100, (short) 100 };
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) 0, intArray8);
        ds.AvaliaMultMatrizes.multmatrize(0, intArray8);
        java.lang.Class<?> wildcardClass11 = intArray8.getClass();
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[0, 1, 1, 0, 100, 100]");
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test1520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1520");
        int[] intArray14 = new int[] { 0, 1, (byte) 1, (short) 0, 100, (short) 100 };
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) 0, intArray14);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) 1, intArray14);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) 0, intArray14);
        ds.AvaliaMultMatrizes.multmatrize((-1), intArray14);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) -1, intArray14);
        ds.AvaliaMultMatrizes.multmatrize(0, intArray14);
        ds.AvaliaMultMatrizes.multmatrize(0, intArray14);
        ds.AvaliaMultMatrizes.multmatrize(0, intArray14);
        java.lang.Class<?> wildcardClass23 = intArray14.getClass();
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[0, 1, 1, 0, 100, 100]");
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test1521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1521");
        int[] intArray13 = new int[] { 0, 1, (byte) 1, (short) 0, 100, (short) 100 };
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) 0, intArray13);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) 1, intArray13);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) 1, intArray13);
        ds.AvaliaMultMatrizes.multmatrize(0, intArray13);
        ds.AvaliaMultMatrizes.multmatrize((-1), intArray13);
        ds.AvaliaMultMatrizes.multmatrize(1, intArray13);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) 0, intArray13);
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[0, 1, 1, 0, 100, 100]");
    }

    @Test
    public void test1522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1522");
        int[] intArray11 = new int[] { 0, 1, (byte) 1, (short) 0, 100, (short) 100 };
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) 0, intArray11);
        ds.AvaliaMultMatrizes.multmatrize(1, intArray11);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) -1, intArray11);
        ds.AvaliaMultMatrizes.multmatrize(0, intArray11);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) 0, intArray11);
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[0, 1, 1, 0, 100, 100]");
    }

    @Test
    public void test1523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1523");
        int[] intArray14 = new int[] { 0, 1, (byte) 1, (short) 0, 100, (short) 100 };
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) 0, intArray14);
        ds.AvaliaMultMatrizes.multmatrize(1, intArray14);
        ds.AvaliaMultMatrizes.multmatrize(1, intArray14);
        ds.AvaliaMultMatrizes.multmatrize(0, intArray14);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) 1, intArray14);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) 1, intArray14);
        ds.AvaliaMultMatrizes.multmatrize(0, intArray14);
        // The following exception was thrown during execution in test generation
        try {
            ds.AvaliaMultMatrizes.multmatrize((int) (short) 10, intArray14);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[0, 1, 1, 0, 100, 100]");
    }

    @Test
    public void test1524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1524");
        int[] intArray13 = new int[] { 0, 1, (byte) 1, (short) 0, 100, (short) 100 };
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) 0, intArray13);
        ds.AvaliaMultMatrizes.multmatrize(1, intArray13);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) 0, intArray13);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) -1, intArray13);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) -1, intArray13);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) 0, intArray13);
        // The following exception was thrown during execution in test generation
        try {
            ds.AvaliaMultMatrizes.multmatrize((int) (byte) 10, intArray13);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[0, 1, 1, 0, 100, 100]");
    }

    @Test
    public void test1525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1525");
        int[] intArray12 = new int[] { 0, 1, (byte) 1, (short) 0, 100, (short) 100 };
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) 0, intArray12);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) -1, intArray12);
        ds.AvaliaMultMatrizes.multmatrize(0, intArray12);
        ds.AvaliaMultMatrizes.multmatrize((-1), intArray12);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) 1, intArray12);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) -1, intArray12);
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[0, 1, 1, 0, 100, 100]");
    }

    @Test
    public void test1526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1526");
        int[] intArray11 = new int[] { 0, 1, (byte) 1, (short) 0, 100, (short) 100 };
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) 0, intArray11);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) 1, intArray11);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) 0, intArray11);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) -1, intArray11);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) 0, intArray11);
        java.lang.Class<?> wildcardClass17 = intArray11.getClass();
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[0, 1, 1, 0, 100, 100]");
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test1527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1527");
        int[] intArray18 = new int[] { 0, 1, (byte) 1, (short) 0, 100, (short) 100 };
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) 0, intArray18);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) 1, intArray18);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) 0, intArray18);
        ds.AvaliaMultMatrizes.multmatrize(0, intArray18);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) 0, intArray18);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) -1, intArray18);
        ds.AvaliaMultMatrizes.multmatrize((-1), intArray18);
        ds.AvaliaMultMatrizes.multmatrize((-1), intArray18);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) -1, intArray18);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) 1, intArray18);
        ds.AvaliaMultMatrizes.multmatrize(0, intArray18);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) -1, intArray18);
        java.lang.Class<?> wildcardClass31 = intArray18.getClass();
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray18), "[0, 1, 1, 0, 100, 100]");
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test1528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1528");
        int[] intArray12 = new int[] { 0, 1, (byte) 1, (short) 0, 100, (short) 100 };
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) 0, intArray12);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) 0, intArray12);
        ds.AvaliaMultMatrizes.multmatrize(1, intArray12);
        ds.AvaliaMultMatrizes.multmatrize(0, intArray12);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) 1, intArray12);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) 0, intArray12);
        java.lang.Class<?> wildcardClass19 = intArray12.getClass();
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[0, 1, 1, 0, 100, 100]");
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test1529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1529");
        int[] intArray13 = new int[] { 0, 1, (byte) 1, (short) 0, 100, (short) 100 };
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) 0, intArray13);
        ds.AvaliaMultMatrizes.multmatrize(1, intArray13);
        ds.AvaliaMultMatrizes.multmatrize(1, intArray13);
        ds.AvaliaMultMatrizes.multmatrize(0, intArray13);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) -1, intArray13);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) -1, intArray13);
        // The following exception was thrown during execution in test generation
        try {
            ds.AvaliaMultMatrizes.multmatrize((int) 'a', intArray13);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[0, 1, 1, 0, 100, 100]");
    }

    @Test
    public void test1530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1530");
        int[] intArray16 = new int[] { 0, 1, (byte) 1, (short) 0, 100, (short) 100 };
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) 0, intArray16);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) 1, intArray16);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) 0, intArray16);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) -1, intArray16);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) -1, intArray16);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) 0, intArray16);
        ds.AvaliaMultMatrizes.multmatrize(0, intArray16);
        ds.AvaliaMultMatrizes.multmatrize(0, intArray16);
        ds.AvaliaMultMatrizes.multmatrize(1, intArray16);
        ds.AvaliaMultMatrizes.multmatrize(0, intArray16);
        java.lang.Class<?> wildcardClass27 = intArray16.getClass();
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray16), "[0, 1, 1, 0, 100, 100]");
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test1531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1531");
        int[] intArray14 = new int[] { 0, 1, (byte) 1, (short) 0, 100, (short) 100 };
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) 0, intArray14);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) 0, intArray14);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) -1, intArray14);
        ds.AvaliaMultMatrizes.multmatrize(0, intArray14);
        ds.AvaliaMultMatrizes.multmatrize(1, intArray14);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) 0, intArray14);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) 1, intArray14);
        ds.AvaliaMultMatrizes.multmatrize(0, intArray14);
        java.lang.Class<?> wildcardClass23 = intArray14.getClass();
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[0, 1, 1, 0, 100, 100]");
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test1532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1532");
        int[] intArray13 = new int[] { 0, 1, (byte) 1, (short) 0, 100, (short) 100 };
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) 0, intArray13);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) -1, intArray13);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) -1, intArray13);
        ds.AvaliaMultMatrizes.multmatrize(0, intArray13);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) 1, intArray13);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) 1, intArray13);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) 0, intArray13);
        java.lang.Class<?> wildcardClass21 = intArray13.getClass();
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[0, 1, 1, 0, 100, 100]");
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test1533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1533");
        int[] intArray13 = new int[] { 0, 1, (byte) 1, (short) 0, 100, (short) 100 };
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) 0, intArray13);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) 1, intArray13);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) 0, intArray13);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) -1, intArray13);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) -1, intArray13);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) 1, intArray13);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) -1, intArray13);
        java.lang.Class<?> wildcardClass21 = intArray13.getClass();
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[0, 1, 1, 0, 100, 100]");
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test1534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1534");
        int[] intArray14 = new int[] { 0, 1, (byte) 1, (short) 0, 100, (short) 100 };
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) 0, intArray14);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) 0, intArray14);
        ds.AvaliaMultMatrizes.multmatrize(1, intArray14);
        ds.AvaliaMultMatrizes.multmatrize(0, intArray14);
        ds.AvaliaMultMatrizes.multmatrize(0, intArray14);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) -1, intArray14);
        ds.AvaliaMultMatrizes.multmatrize(0, intArray14);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) -1, intArray14);
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[0, 1, 1, 0, 100, 100]");
    }

    @Test
    public void test1535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1535");
        int[] intArray14 = new int[] { 0, 1, (byte) 1, (short) 0, 100, (short) 100 };
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) 0, intArray14);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) 1, intArray14);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) 0, intArray14);
        ds.AvaliaMultMatrizes.multmatrize((-1), intArray14);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) -1, intArray14);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) -1, intArray14);
        ds.AvaliaMultMatrizes.multmatrize(0, intArray14);
        // The following exception was thrown during execution in test generation
        try {
            ds.AvaliaMultMatrizes.multmatrize(10, intArray14);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[0, 1, 1, 0, 100, 100]");
    }

    @Test
    public void test1536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1536");
        int[] intArray14 = new int[] { 0, 1, (byte) 1, (short) 0, 100, (short) 100 };
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) 0, intArray14);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) 1, intArray14);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) 0, intArray14);
        ds.AvaliaMultMatrizes.multmatrize(0, intArray14);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) 0, intArray14);
        ds.AvaliaMultMatrizes.multmatrize(0, intArray14);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) 1, intArray14);
        // The following exception was thrown during execution in test generation
        try {
            ds.AvaliaMultMatrizes.multmatrize(100, intArray14);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[0, 1, 1, 0, 100, 100]");
    }

    @Test
    public void test1537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1537");
        int[] intArray15 = new int[] { 0, 1, (byte) 1, (short) 0, 100, (short) 100 };
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) 0, intArray15);
        ds.AvaliaMultMatrizes.multmatrize(1, intArray15);
        ds.AvaliaMultMatrizes.multmatrize(1, intArray15);
        ds.AvaliaMultMatrizes.multmatrize(0, intArray15);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) 1, intArray15);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) 1, intArray15);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) 1, intArray15);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) 0, intArray15);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) -1, intArray15);
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[0, 1, 1, 0, 100, 100]");
    }

    @Test
    public void test1538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1538");
        int[] intArray12 = new int[] { 0, 1, (byte) 1, (short) 0, 100, (short) 100 };
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) 0, intArray12);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) 0, intArray12);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) -1, intArray12);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) 1, intArray12);
        ds.AvaliaMultMatrizes.multmatrize(0, intArray12);
        ds.AvaliaMultMatrizes.multmatrize(0, intArray12);
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[0, 1, 1, 0, 100, 100]");
    }

    @Test
    public void test1539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1539");
        int[] intArray12 = new int[] { (byte) 1, (byte) 100, (byte) 100, (-1), (short) 1 };
        ds.AvaliaMultMatrizes.multmatrize(0, intArray12);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) 1, intArray12);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) -1, intArray12);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) 0, intArray12);
        ds.AvaliaMultMatrizes.multmatrize(0, intArray12);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) 0, intArray12);
        ds.AvaliaMultMatrizes.multmatrize(1, intArray12);
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[1, 100, 100, -1, 1]");
    }

    @Test
    public void test1540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1540");
        int[] intArray14 = new int[] { 0, 1, (byte) 1, (short) 0, 100, (short) 100 };
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) 0, intArray14);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) 0, intArray14);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) 0, intArray14);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) -1, intArray14);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) 1, intArray14);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) -1, intArray14);
        ds.AvaliaMultMatrizes.multmatrize(0, intArray14);
        // The following exception was thrown during execution in test generation
        try {
            ds.AvaliaMultMatrizes.multmatrize(10, intArray14);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[0, 1, 1, 0, 100, 100]");
    }

    @Test
    public void test1541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1541");
        int[] intArray16 = new int[] { 0, 1, (byte) 1, (short) 0, 100, (short) 100 };
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) 0, intArray16);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) -1, intArray16);
        ds.AvaliaMultMatrizes.multmatrize(0, intArray16);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) -1, intArray16);
        ds.AvaliaMultMatrizes.multmatrize(0, intArray16);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) 0, intArray16);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) -1, intArray16);
        ds.AvaliaMultMatrizes.multmatrize(1, intArray16);
        ds.AvaliaMultMatrizes.multmatrize(0, intArray16);
        ds.AvaliaMultMatrizes.multmatrize(1, intArray16);
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray16), "[0, 1, 1, 0, 100, 100]");
    }

    @Test
    public void test1542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1542");
        int[] intArray13 = new int[] { 0, 1, (byte) 1, (short) 0, 100, (short) 100 };
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) 0, intArray13);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) 1, intArray13);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) 0, intArray13);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) -1, intArray13);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) -1, intArray13);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) 0, intArray13);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) 0, intArray13);
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[0, 1, 1, 0, 100, 100]");
    }

    @Test
    public void test1543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1543");
        int[] intArray9 = new int[] { (byte) 1, (byte) 100, (byte) 100, (-1), (short) 1 };
        ds.AvaliaMultMatrizes.multmatrize(0, intArray9);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) -1, intArray9);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) 1, intArray9);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) 0, intArray9);
        java.lang.Class<?> wildcardClass14 = intArray9.getClass();
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[1, 100, 100, -1, 1]");
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test1544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1544");
        int[] intArray16 = new int[] { 0, 1, (byte) 1, (short) 0, 100, (short) 100 };
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) 0, intArray16);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) 1, intArray16);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) 0, intArray16);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) -1, intArray16);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) -1, intArray16);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) 1, intArray16);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) -1, intArray16);
        ds.AvaliaMultMatrizes.multmatrize(0, intArray16);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) 0, intArray16);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) 0, intArray16);
        java.lang.Class<?> wildcardClass27 = intArray16.getClass();
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray16), "[0, 1, 1, 0, 100, 100]");
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test1545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1545");
        int[] intArray14 = new int[] { 0, 1, (byte) 1, (short) 0, 100, (short) 100 };
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) 0, intArray14);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) 1, intArray14);
        ds.AvaliaMultMatrizes.multmatrize(0, intArray14);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) 0, intArray14);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) -1, intArray14);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) -1, intArray14);
        ds.AvaliaMultMatrizes.multmatrize((-1), intArray14);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) 0, intArray14);
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[0, 1, 1, 0, 100, 100]");
    }

    @Test
    public void test1546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1546");
        int[] intArray16 = new int[] { 0, 1, (byte) 1, (short) 0, 100, (short) 100 };
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) 0, intArray16);
        ds.AvaliaMultMatrizes.multmatrize(1, intArray16);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) 0, intArray16);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) -1, intArray16);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) -1, intArray16);
        ds.AvaliaMultMatrizes.multmatrize((-1), intArray16);
        ds.AvaliaMultMatrizes.multmatrize((-1), intArray16);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) -1, intArray16);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) 0, intArray16);
        ds.AvaliaMultMatrizes.multmatrize(1, intArray16);
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray16), "[0, 1, 1, 0, 100, 100]");
    }

    @Test
    public void test1547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1547");
        int[] intArray16 = new int[] { 0, 1, (byte) 1, (short) 0, 100, (short) 100 };
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) 0, intArray16);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) 0, intArray16);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) 0, intArray16);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) -1, intArray16);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) 1, intArray16);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) 0, intArray16);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) -1, intArray16);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) 0, intArray16);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) 0, intArray16);
        ds.AvaliaMultMatrizes.multmatrize(1, intArray16);
        java.lang.Class<?> wildcardClass27 = intArray16.getClass();
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray16), "[0, 1, 1, 0, 100, 100]");
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test1548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1548");
        int[] intArray18 = new int[] { 0, 1, (byte) 1, (short) 0, 100, (short) 100 };
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) 0, intArray18);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) 1, intArray18);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) 0, intArray18);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) -1, intArray18);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) 1, intArray18);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) -1, intArray18);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) 0, intArray18);
        ds.AvaliaMultMatrizes.multmatrize((-1), intArray18);
        ds.AvaliaMultMatrizes.multmatrize(1, intArray18);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) 0, intArray18);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) -1, intArray18);
        // The following exception was thrown during execution in test generation
        try {
            ds.AvaliaMultMatrizes.multmatrize((int) (short) 10, intArray18);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray18), "[0, 1, 1, 0, 100, 100]");
    }

    @Test
    public void test1549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1549");
        int[] intArray14 = new int[] { 0, 1, (byte) 1, (short) 0, 100, (short) 100 };
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) 0, intArray14);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) 0, intArray14);
        ds.AvaliaMultMatrizes.multmatrize(1, intArray14);
        ds.AvaliaMultMatrizes.multmatrize(0, intArray14);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) 0, intArray14);
        ds.AvaliaMultMatrizes.multmatrize(0, intArray14);
        ds.AvaliaMultMatrizes.multmatrize((-1), intArray14);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) 1, intArray14);
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[0, 1, 1, 0, 100, 100]");
    }

    @Test
    public void test1550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1550");
        int[] intArray14 = new int[] { 0, 1, (byte) 1, (short) 0, 100, (short) 100 };
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) 0, intArray14);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) -1, intArray14);
        ds.AvaliaMultMatrizes.multmatrize(0, intArray14);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) -1, intArray14);
        ds.AvaliaMultMatrizes.multmatrize(0, intArray14);
        ds.AvaliaMultMatrizes.multmatrize(1, intArray14);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) -1, intArray14);
        // The following exception was thrown during execution in test generation
        try {
            ds.AvaliaMultMatrizes.multmatrize((int) (short) 10, intArray14);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[0, 1, 1, 0, 100, 100]");
    }

    @Test
    public void test1551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1551");
        int[] intArray11 = new int[] { 0, 1, (byte) 1, (short) 0, 100, (short) 100 };
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) 0, intArray11);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) 1, intArray11);
        ds.AvaliaMultMatrizes.multmatrize(0, intArray11);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) 0, intArray11);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) -1, intArray11);
        java.lang.Class<?> wildcardClass17 = intArray11.getClass();
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[0, 1, 1, 0, 100, 100]");
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test1552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1552");
        int[] intArray15 = new int[] { 0, 1, (byte) 1, (short) 0, 100, (short) 100 };
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) 0, intArray15);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) 0, intArray15);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) 0, intArray15);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) -1, intArray15);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) 1, intArray15);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) -1, intArray15);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) -1, intArray15);
        ds.AvaliaMultMatrizes.multmatrize(0, intArray15);
        // The following exception was thrown during execution in test generation
        try {
            ds.AvaliaMultMatrizes.multmatrize((int) '#', intArray15);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[0, 1, 1, 0, 100, 100]");
    }

    @Test
    public void test1553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1553");
        int[] intArray14 = new int[] { 0, 1, (byte) 1, (short) 0, 100, (short) 100 };
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) 0, intArray14);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) 1, intArray14);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) 0, intArray14);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) -1, intArray14);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) 1, intArray14);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) 1, intArray14);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) -1, intArray14);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) 0, intArray14);
        java.lang.Class<?> wildcardClass23 = intArray14.getClass();
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[0, 1, 1, 0, 100, 100]");
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test1554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1554");
        int[] intArray19 = new int[] { 0, 1, (byte) 1, (short) 0, 100, (short) 100 };
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) 0, intArray19);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) 1, intArray19);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) 0, intArray19);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) -1, intArray19);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) -1, intArray19);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) 0, intArray19);
        ds.AvaliaMultMatrizes.multmatrize(0, intArray19);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) -1, intArray19);
        ds.AvaliaMultMatrizes.multmatrize(1, intArray19);
        ds.AvaliaMultMatrizes.multmatrize(0, intArray19);
        ds.AvaliaMultMatrizes.multmatrize(0, intArray19);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) 0, intArray19);
        ds.AvaliaMultMatrizes.multmatrize((-1), intArray19);
        java.lang.Class<?> wildcardClass33 = intArray19.getClass();
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray19), "[0, 1, 1, 0, 100, 100]");
        org.junit.Assert.assertNotNull(wildcardClass33);
    }

    @Test
    public void test1555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1555");
        int[] intArray16 = new int[] { 0, 1, (byte) 1, (short) 0, 100, (short) 100 };
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) 0, intArray16);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) 1, intArray16);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) 0, intArray16);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) -1, intArray16);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) 1, intArray16);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) -1, intArray16);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) 0, intArray16);
        ds.AvaliaMultMatrizes.multmatrize(0, intArray16);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) -1, intArray16);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) 1, intArray16);
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray16), "[0, 1, 1, 0, 100, 100]");
    }

    @Test
    public void test1556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1556");
        int[] intArray14 = new int[] { 0, 1, (byte) 1, (short) 0, 100, (short) 100 };
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) 0, intArray14);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) 1, intArray14);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) 1, intArray14);
        ds.AvaliaMultMatrizes.multmatrize(0, intArray14);
        ds.AvaliaMultMatrizes.multmatrize((-1), intArray14);
        ds.AvaliaMultMatrizes.multmatrize(1, intArray14);
        ds.AvaliaMultMatrizes.multmatrize(0, intArray14);
        ds.AvaliaMultMatrizes.multmatrize(1, intArray14);
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[0, 1, 1, 0, 100, 100]");
    }

    @Test
    public void test1557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1557");
        int[] intArray13 = new int[] { 0, 1, (byte) 1, (short) 0, 100, (short) 100 };
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) 0, intArray13);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) 1, intArray13);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) 1, intArray13);
        ds.AvaliaMultMatrizes.multmatrize(0, intArray13);
        ds.AvaliaMultMatrizes.multmatrize((-1), intArray13);
        ds.AvaliaMultMatrizes.multmatrize(1, intArray13);
        // The following exception was thrown during execution in test generation
        try {
            ds.AvaliaMultMatrizes.multmatrize((int) (short) 100, intArray13);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[0, 1, 1, 0, 100, 100]");
    }

    @Test
    public void test1558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1558");
        int[] intArray12 = new int[] { 0, 1, (byte) 1, (short) 0, 100, (short) 100 };
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) 0, intArray12);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) 1, intArray12);
        ds.AvaliaMultMatrizes.multmatrize(0, intArray12);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) 0, intArray12);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) -1, intArray12);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) -1, intArray12);
        java.lang.Class<?> wildcardClass19 = intArray12.getClass();
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[0, 1, 1, 0, 100, 100]");
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test1559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1559");
        int[] intArray14 = new int[] { 0, 1, (byte) 1, (short) 0, 100, (short) 100 };
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) 0, intArray14);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) 0, intArray14);
        ds.AvaliaMultMatrizes.multmatrize(1, intArray14);
        ds.AvaliaMultMatrizes.multmatrize(0, intArray14);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) 1, intArray14);
        ds.AvaliaMultMatrizes.multmatrize(0, intArray14);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) 1, intArray14);
        ds.AvaliaMultMatrizes.multmatrize(0, intArray14);
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[0, 1, 1, 0, 100, 100]");
    }

    @Test
    public void test1560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1560");
        int[] intArray14 = new int[] { 0, 1, (byte) 1, (short) 0, 100, (short) 100 };
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) 0, intArray14);
        ds.AvaliaMultMatrizes.multmatrize(1, intArray14);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) -1, intArray14);
        ds.AvaliaMultMatrizes.multmatrize(0, intArray14);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) -1, intArray14);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) 1, intArray14);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) -1, intArray14);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) 1, intArray14);
        java.lang.Class<?> wildcardClass23 = intArray14.getClass();
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[0, 1, 1, 0, 100, 100]");
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test1561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1561");
        int[] intArray15 = new int[] { 0, 1, (byte) 1, (short) 0, 100, (short) 100 };
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) 0, intArray15);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) 1, intArray15);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) 0, intArray15);
        ds.AvaliaMultMatrizes.multmatrize(0, intArray15);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) 0, intArray15);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) -1, intArray15);
        ds.AvaliaMultMatrizes.multmatrize((-1), intArray15);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) -1, intArray15);
        ds.AvaliaMultMatrizes.multmatrize(1, intArray15);
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[0, 1, 1, 0, 100, 100]");
    }

    @Test
    public void test1562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1562");
        int[] intArray11 = new int[] { 0, 1, (byte) 1, (short) 0, 100, (short) 100 };
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) 0, intArray11);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) -1, intArray11);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) -1, intArray11);
        ds.AvaliaMultMatrizes.multmatrize(1, intArray11);
        ds.AvaliaMultMatrizes.multmatrize(0, intArray11);
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[0, 1, 1, 0, 100, 100]");
    }

    @Test
    public void test1563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1563");
        int[] intArray20 = new int[] { 0, 1, (byte) 1, (short) 0, 100, (short) 100 };
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) 0, intArray20);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) 1, intArray20);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) 0, intArray20);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) -1, intArray20);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) -1, intArray20);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) 0, intArray20);
        ds.AvaliaMultMatrizes.multmatrize(0, intArray20);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) -1, intArray20);
        ds.AvaliaMultMatrizes.multmatrize(1, intArray20);
        ds.AvaliaMultMatrizes.multmatrize(0, intArray20);
        ds.AvaliaMultMatrizes.multmatrize(0, intArray20);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) 0, intArray20);
        ds.AvaliaMultMatrizes.multmatrize((-1), intArray20);
        // The following exception was thrown during execution in test generation
        try {
            ds.AvaliaMultMatrizes.multmatrize((int) 'a', intArray20);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray20), "[0, 1, 1, 0, 100, 100]");
    }

    @Test
    public void test1564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1564");
        int[] intArray16 = new int[] { 0, 1, (byte) 1, (short) 0, 100, (short) 100 };
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) 0, intArray16);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) 0, intArray16);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) -1, intArray16);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) -1, intArray16);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) 1, intArray16);
        ds.AvaliaMultMatrizes.multmatrize(1, intArray16);
        ds.AvaliaMultMatrizes.multmatrize((-1), intArray16);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) 0, intArray16);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) 1, intArray16);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) 1, intArray16);
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray16), "[0, 1, 1, 0, 100, 100]");
    }

    @Test
    public void test1565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1565");
        int[] intArray16 = new int[] { 0, 1, (byte) 1, (short) 0, 100, (short) 100 };
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) 0, intArray16);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) 0, intArray16);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) -1, intArray16);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) -1, intArray16);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) 1, intArray16);
        ds.AvaliaMultMatrizes.multmatrize(1, intArray16);
        ds.AvaliaMultMatrizes.multmatrize((-1), intArray16);
        ds.AvaliaMultMatrizes.multmatrize(1, intArray16);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) 1, intArray16);
        // The following exception was thrown during execution in test generation
        try {
            ds.AvaliaMultMatrizes.multmatrize((int) (short) 100, intArray16);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray16), "[0, 1, 1, 0, 100, 100]");
    }

    @Test
    public void test1566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1566");
        int[] intArray14 = new int[] { 0, 1, (byte) 1, (short) 0, 100, (short) 100 };
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) 0, intArray14);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) 1, intArray14);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) 0, intArray14);
        ds.AvaliaMultMatrizes.multmatrize((-1), intArray14);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) -1, intArray14);
        ds.AvaliaMultMatrizes.multmatrize(0, intArray14);
        ds.AvaliaMultMatrizes.multmatrize(0, intArray14);
        // The following exception was thrown during execution in test generation
        try {
            ds.AvaliaMultMatrizes.multmatrize((int) (byte) 10, intArray14);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[0, 1, 1, 0, 100, 100]");
    }

    @Test
    public void test1567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1567");
        int[] intArray14 = new int[] { 0, 1, (byte) 1, (short) 0, 100, (short) 100 };
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) 0, intArray14);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) 1, intArray14);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) 0, intArray14);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) -1, intArray14);
        ds.AvaliaMultMatrizes.multmatrize(1, intArray14);
        ds.AvaliaMultMatrizes.multmatrize(1, intArray14);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) 0, intArray14);
        ds.AvaliaMultMatrizes.multmatrize(1, intArray14);
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[0, 1, 1, 0, 100, 100]");
    }

    @Test
    public void test1568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1568");
        int[] intArray12 = new int[] { 0, 1, (byte) 1, (short) 0, 100, (short) 100 };
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) 0, intArray12);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) 1, intArray12);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) 0, intArray12);
        ds.AvaliaMultMatrizes.multmatrize((-1), intArray12);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) -1, intArray12);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) 1, intArray12);
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[0, 1, 1, 0, 100, 100]");
    }

    @Test
    public void test1569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1569");
        int[] intArray13 = new int[] { 0, 1, (byte) 1, (short) 0, 100, (short) 100 };
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) 0, intArray13);
        ds.AvaliaMultMatrizes.multmatrize(1, intArray13);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) -1, intArray13);
        ds.AvaliaMultMatrizes.multmatrize(0, intArray13);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) -1, intArray13);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) 1, intArray13);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) 0, intArray13);
        java.lang.Class<?> wildcardClass21 = intArray13.getClass();
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[0, 1, 1, 0, 100, 100]");
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test1570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1570");
        int[] intArray14 = new int[] { 0, 1, (byte) 1, (short) 0, 100, (short) 100 };
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) 0, intArray14);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) 1, intArray14);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) 0, intArray14);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) -1, intArray14);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) 1, intArray14);
        ds.AvaliaMultMatrizes.multmatrize((-1), intArray14);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) 0, intArray14);
        // The following exception was thrown during execution in test generation
        try {
            ds.AvaliaMultMatrizes.multmatrize((int) (short) 10, intArray14);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[0, 1, 1, 0, 100, 100]");
    }

    @Test
    public void test1571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1571");
        int[] intArray13 = new int[] { 0, 1, (byte) 1, (short) 0, 100, (short) 100 };
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) 0, intArray13);
        ds.AvaliaMultMatrizes.multmatrize(1, intArray13);
        ds.AvaliaMultMatrizes.multmatrize(1, intArray13);
        ds.AvaliaMultMatrizes.multmatrize(0, intArray13);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) 1, intArray13);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) 1, intArray13);
        ds.AvaliaMultMatrizes.multmatrize(0, intArray13);
        java.lang.Class<?> wildcardClass21 = intArray13.getClass();
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[0, 1, 1, 0, 100, 100]");
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test1572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1572");
        int[] intArray12 = new int[] { 0, 1, (byte) 1, (short) 0, 100, (short) 100 };
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) 0, intArray12);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) 0, intArray12);
        ds.AvaliaMultMatrizes.multmatrize(1, intArray12);
        ds.AvaliaMultMatrizes.multmatrize(0, intArray12);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) 0, intArray12);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) -1, intArray12);
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[0, 1, 1, 0, 100, 100]");
    }

    @Test
    public void test1573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1573");
        int[] intArray13 = new int[] { 0, 1, (byte) 1, (short) 0, 100, (short) 100 };
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) 0, intArray13);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) 0, intArray13);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) -1, intArray13);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) -1, intArray13);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) 1, intArray13);
        ds.AvaliaMultMatrizes.multmatrize(1, intArray13);
        // The following exception was thrown during execution in test generation
        try {
            ds.AvaliaMultMatrizes.multmatrize(10, intArray13);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[0, 1, 1, 0, 100, 100]");
    }

    @Test
    public void test1574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1574");
        int[] intArray12 = new int[] { 0, 1, (byte) 1, (short) 0, 100, (short) 100 };
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) 0, intArray12);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) -1, intArray12);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) -1, intArray12);
        ds.AvaliaMultMatrizes.multmatrize(0, intArray12);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) 0, intArray12);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) -1, intArray12);
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[0, 1, 1, 0, 100, 100]");
    }

    @Test
    public void test1575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1575");
        int[] intArray13 = new int[] { 0, 1, (byte) 1, (short) 0, 100, (short) 100 };
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) 0, intArray13);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) 1, intArray13);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) -1, intArray13);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) 1, intArray13);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) -1, intArray13);
        ds.AvaliaMultMatrizes.multmatrize(0, intArray13);
        ds.AvaliaMultMatrizes.multmatrize((-1), intArray13);
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[0, 1, 1, 0, 100, 100]");
    }

    @Test
    public void test1576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1576");
        int[] intArray18 = new int[] { 0, 1, (byte) 1, (short) 0, 100, (short) 100 };
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) 0, intArray18);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) 0, intArray18);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) -1, intArray18);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) -1, intArray18);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) 1, intArray18);
        ds.AvaliaMultMatrizes.multmatrize(1, intArray18);
        ds.AvaliaMultMatrizes.multmatrize((-1), intArray18);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) 0, intArray18);
        ds.AvaliaMultMatrizes.multmatrize((-1), intArray18);
        ds.AvaliaMultMatrizes.multmatrize((-1), intArray18);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) 0, intArray18);
        // The following exception was thrown during execution in test generation
        try {
            ds.AvaliaMultMatrizes.multmatrize((int) (short) 100, intArray18);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray18), "[0, 1, 1, 0, 100, 100]");
    }

    @Test
    public void test1577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1577");
        int[] intArray15 = new int[] { 0, 1, (byte) 1, (short) 0, 100, (short) 100 };
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) 0, intArray15);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) 0, intArray15);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) -1, intArray15);
        ds.AvaliaMultMatrizes.multmatrize(0, intArray15);
        ds.AvaliaMultMatrizes.multmatrize(0, intArray15);
        ds.AvaliaMultMatrizes.multmatrize(1, intArray15);
        ds.AvaliaMultMatrizes.multmatrize(0, intArray15);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) -1, intArray15);
        ds.AvaliaMultMatrizes.multmatrize(0, intArray15);
        java.lang.Class<?> wildcardClass25 = intArray15.getClass();
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[0, 1, 1, 0, 100, 100]");
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test1578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1578");
        int[] intArray15 = new int[] { 0, 1, (byte) 1, (short) 0, 100, (short) 100 };
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) 0, intArray15);
        ds.AvaliaMultMatrizes.multmatrize(1, intArray15);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) -1, intArray15);
        ds.AvaliaMultMatrizes.multmatrize(0, intArray15);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) -1, intArray15);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) 1, intArray15);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) -1, intArray15);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) 1, intArray15);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) 1, intArray15);
        java.lang.Class<?> wildcardClass25 = intArray15.getClass();
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[0, 1, 1, 0, 100, 100]");
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test1579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1579");
        int[] intArray11 = new int[] { 0, 1, (byte) 1, (short) 0, 100, (short) 100 };
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) 0, intArray11);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) -1, intArray11);
        ds.AvaliaMultMatrizes.multmatrize((-1), intArray11);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) 0, intArray11);
        // The following exception was thrown during execution in test generation
        try {
            ds.AvaliaMultMatrizes.multmatrize((int) ' ', intArray11);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[0, 1, 1, 0, 100, 100]");
    }

    @Test
    public void test1580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1580");
        int[] intArray18 = new int[] { 0, 1, (byte) 1, (short) 0, 100, (short) 100 };
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) 0, intArray18);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) 1, intArray18);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) 0, intArray18);
        ds.AvaliaMultMatrizes.multmatrize(0, intArray18);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) 0, intArray18);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) -1, intArray18);
        ds.AvaliaMultMatrizes.multmatrize((-1), intArray18);
        ds.AvaliaMultMatrizes.multmatrize((-1), intArray18);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) 1, intArray18);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) -1, intArray18);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) -1, intArray18);
        // The following exception was thrown during execution in test generation
        try {
            ds.AvaliaMultMatrizes.multmatrize((int) '4', intArray18);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray18), "[0, 1, 1, 0, 100, 100]");
    }

    @Test
    public void test1581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1581");
        int[] intArray18 = new int[] { 0, 1, (byte) 1, (short) 0, 100, (short) 100 };
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) 0, intArray18);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) 1, intArray18);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) 0, intArray18);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) -1, intArray18);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) -1, intArray18);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) 0, intArray18);
        ds.AvaliaMultMatrizes.multmatrize(0, intArray18);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) -1, intArray18);
        ds.AvaliaMultMatrizes.multmatrize(1, intArray18);
        ds.AvaliaMultMatrizes.multmatrize(0, intArray18);
        ds.AvaliaMultMatrizes.multmatrize(0, intArray18);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) -1, intArray18);
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray18), "[0, 1, 1, 0, 100, 100]");
    }

    @Test
    public void test1582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1582");
        int[] intArray19 = new int[] { 0, 1, (byte) 1, (short) 0, 100, (short) 100 };
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) 0, intArray19);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) 1, intArray19);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) 0, intArray19);
        ds.AvaliaMultMatrizes.multmatrize(0, intArray19);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) 0, intArray19);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) -1, intArray19);
        ds.AvaliaMultMatrizes.multmatrize((-1), intArray19);
        ds.AvaliaMultMatrizes.multmatrize((-1), intArray19);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) 1, intArray19);
        ds.AvaliaMultMatrizes.multmatrize((-1), intArray19);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) -1, intArray19);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) 1, intArray19);
        ds.AvaliaMultMatrizes.multmatrize(1, intArray19);
        java.lang.Class<?> wildcardClass33 = intArray19.getClass();
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray19), "[0, 1, 1, 0, 100, 100]");
        org.junit.Assert.assertNotNull(wildcardClass33);
    }

    @Test
    public void test1583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1583");
        int[] intArray14 = new int[] { 0, 1, (byte) 1, (short) 0, 100, (short) 100 };
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) 0, intArray14);
        ds.AvaliaMultMatrizes.multmatrize(1, intArray14);
        ds.AvaliaMultMatrizes.multmatrize(1, intArray14);
        ds.AvaliaMultMatrizes.multmatrize(0, intArray14);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) -1, intArray14);
        ds.AvaliaMultMatrizes.multmatrize((-1), intArray14);
        ds.AvaliaMultMatrizes.multmatrize(0, intArray14);
        // The following exception was thrown during execution in test generation
        try {
            ds.AvaliaMultMatrizes.multmatrize((int) ' ', intArray14);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[0, 1, 1, 0, 100, 100]");
    }

    @Test
    public void test1584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1584");
        int[] intArray15 = new int[] { 0, 1, (byte) 1, (short) 0, 100, (short) 100 };
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) 0, intArray15);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) -1, intArray15);
        ds.AvaliaMultMatrizes.multmatrize(0, intArray15);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) -1, intArray15);
        ds.AvaliaMultMatrizes.multmatrize(0, intArray15);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) 0, intArray15);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) -1, intArray15);
        ds.AvaliaMultMatrizes.multmatrize(0, intArray15);
        ds.AvaliaMultMatrizes.multmatrize(1, intArray15);
        java.lang.Class<?> wildcardClass25 = intArray15.getClass();
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[0, 1, 1, 0, 100, 100]");
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test1585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1585");
        int[] intArray18 = new int[] { 0, 1, (byte) 1, (short) 0, 100, (short) 100 };
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) 0, intArray18);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) 1, intArray18);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) 0, intArray18);
        ds.AvaliaMultMatrizes.multmatrize(0, intArray18);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) 0, intArray18);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) -1, intArray18);
        ds.AvaliaMultMatrizes.multmatrize((-1), intArray18);
        ds.AvaliaMultMatrizes.multmatrize((-1), intArray18);
        ds.AvaliaMultMatrizes.multmatrize((-1), intArray18);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) 1, intArray18);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) -1, intArray18);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) 0, intArray18);
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray18), "[0, 1, 1, 0, 100, 100]");
    }

    @Test
    public void test1586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1586");
        int[] intArray13 = new int[] { 0, 1, (byte) 1, (short) 0, 100, (short) 100 };
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) 0, intArray13);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) 0, intArray13);
        ds.AvaliaMultMatrizes.multmatrize(1, intArray13);
        ds.AvaliaMultMatrizes.multmatrize(0, intArray13);
        ds.AvaliaMultMatrizes.multmatrize(0, intArray13);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) -1, intArray13);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) -1, intArray13);
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[0, 1, 1, 0, 100, 100]");
    }

    @Test
    public void test1587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1587");
        int[] intArray12 = new int[] { 0, 1, (byte) 1, (short) 0, 100, (short) 100 };
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) 0, intArray12);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) -1, intArray12);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) -1, intArray12);
        ds.AvaliaMultMatrizes.multmatrize(1, intArray12);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) -1, intArray12);
        ds.AvaliaMultMatrizes.multmatrize(0, intArray12);
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[0, 1, 1, 0, 100, 100]");
    }

    @Test
    public void test1588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1588");
        int[] intArray15 = new int[] { 0, 1, (byte) 1, (short) 0, 100, (short) 100 };
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) 0, intArray15);
        ds.AvaliaMultMatrizes.multmatrize(1, intArray15);
        ds.AvaliaMultMatrizes.multmatrize(1, intArray15);
        ds.AvaliaMultMatrizes.multmatrize(0, intArray15);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) -1, intArray15);
        ds.AvaliaMultMatrizes.multmatrize((-1), intArray15);
        ds.AvaliaMultMatrizes.multmatrize(0, intArray15);
        ds.AvaliaMultMatrizes.multmatrize(0, intArray15);
        // The following exception was thrown during execution in test generation
        try {
            ds.AvaliaMultMatrizes.multmatrize((int) '#', intArray15);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[0, 1, 1, 0, 100, 100]");
    }

    @Test
    public void test1589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1589");
        int[] intArray16 = new int[] { 0, 1, (byte) 1, (short) 0, 100, (short) 100 };
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) 0, intArray16);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) 1, intArray16);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) 0, intArray16);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) -1, intArray16);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) -1, intArray16);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) 0, intArray16);
        ds.AvaliaMultMatrizes.multmatrize(0, intArray16);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) -1, intArray16);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) 0, intArray16);
        ds.AvaliaMultMatrizes.multmatrize(0, intArray16);
        java.lang.Class<?> wildcardClass27 = intArray16.getClass();
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray16), "[0, 1, 1, 0, 100, 100]");
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test1590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1590");
        int[] intArray17 = new int[] { 0, 1, (byte) 1, (short) 0, 100, (short) 100 };
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) 0, intArray17);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) 1, intArray17);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) 0, intArray17);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) -1, intArray17);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) -1, intArray17);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) 0, intArray17);
        ds.AvaliaMultMatrizes.multmatrize(0, intArray17);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) -1, intArray17);
        ds.AvaliaMultMatrizes.multmatrize(1, intArray17);
        ds.AvaliaMultMatrizes.multmatrize(0, intArray17);
        // The following exception was thrown during execution in test generation
        try {
            ds.AvaliaMultMatrizes.multmatrize((int) (byte) 10, intArray17);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[0, 1, 1, 0, 100, 100]");
    }

    @Test
    public void test1591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1591");
        int[] intArray13 = new int[] { 0, 1, (byte) 1, (short) 0, 100, (short) 100 };
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) 0, intArray13);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) -1, intArray13);
        ds.AvaliaMultMatrizes.multmatrize(0, intArray13);
        ds.AvaliaMultMatrizes.multmatrize((-1), intArray13);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) 1, intArray13);
        ds.AvaliaMultMatrizes.multmatrize((-1), intArray13);
        ds.AvaliaMultMatrizes.multmatrize(0, intArray13);
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[0, 1, 1, 0, 100, 100]");
    }

    @Test
    public void test1592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1592");
        int[] intArray13 = new int[] { 0, 1, (byte) 1, (short) 0, 100, (short) 100 };
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) 0, intArray13);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) 0, intArray13);
        ds.AvaliaMultMatrizes.multmatrize(1, intArray13);
        ds.AvaliaMultMatrizes.multmatrize(0, intArray13);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) 1, intArray13);
        ds.AvaliaMultMatrizes.multmatrize(0, intArray13);
        // The following exception was thrown during execution in test generation
        try {
            ds.AvaliaMultMatrizes.multmatrize((int) (short) 100, intArray13);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[0, 1, 1, 0, 100, 100]");
    }

    @Test
    public void test1593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1593");
        int[] intArray13 = new int[] { 0, 1, (byte) 1, (short) 0, 100, (short) 100 };
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) 0, intArray13);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) 0, intArray13);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) 0, intArray13);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) -1, intArray13);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) 1, intArray13);
        ds.AvaliaMultMatrizes.multmatrize((-1), intArray13);
        ds.AvaliaMultMatrizes.multmatrize(1, intArray13);
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[0, 1, 1, 0, 100, 100]");
    }

    @Test
    public void test1594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1594");
        int[] intArray14 = new int[] { 0, 1, (byte) 1, (short) 0, 100, (short) 100 };
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) 0, intArray14);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) 1, intArray14);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) 0, intArray14);
        ds.AvaliaMultMatrizes.multmatrize(0, intArray14);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) 0, intArray14);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) -1, intArray14);
        ds.AvaliaMultMatrizes.multmatrize((-1), intArray14);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) -1, intArray14);
        java.lang.Class<?> wildcardClass23 = intArray14.getClass();
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[0, 1, 1, 0, 100, 100]");
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test1595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1595");
        int[] intArray15 = new int[] { 0, 1, (byte) 1, (short) 0, 100, (short) 100 };
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) 0, intArray15);
        ds.AvaliaMultMatrizes.multmatrize(1, intArray15);
        ds.AvaliaMultMatrizes.multmatrize(1, intArray15);
        ds.AvaliaMultMatrizes.multmatrize(0, intArray15);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) -1, intArray15);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) 1, intArray15);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) 1, intArray15);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) -1, intArray15);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) 0, intArray15);
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[0, 1, 1, 0, 100, 100]");
    }

    @Test
    public void test1596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1596");
        int[] intArray12 = new int[] { (byte) 1, (byte) 100, (byte) 100, (-1), (short) 1 };
        ds.AvaliaMultMatrizes.multmatrize(0, intArray12);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) 1, intArray12);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) -1, intArray12);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) 0, intArray12);
        ds.AvaliaMultMatrizes.multmatrize(0, intArray12);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) 0, intArray12);
        // The following exception was thrown during execution in test generation
        try {
            ds.AvaliaMultMatrizes.multmatrize((int) ' ', intArray12);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[1, 100, 100, -1, 1]");
    }

    @Test
    public void test1597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1597");
        int[] intArray14 = new int[] { 0, 1, (byte) 1, (short) 0, 100, (short) 100 };
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) 0, intArray14);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) 0, intArray14);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) 0, intArray14);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) -1, intArray14);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) 1, intArray14);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) 1, intArray14);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) -1, intArray14);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) 0, intArray14);
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[0, 1, 1, 0, 100, 100]");
    }

    @Test
    public void test1598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1598");
        int[] intArray8 = new int[] { (byte) 100, '#', (short) -1, 0, (byte) 100, (short) 10 };
        ds.AvaliaMultMatrizes.multmatrize(0, intArray8);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) -1, intArray8);
        java.lang.Class<?> wildcardClass11 = intArray8.getClass();
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[100, 35, -1, 0, 100, 10]");
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test1599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1599");
        int[] intArray12 = new int[] { 0, 1, (byte) 1, (short) 0, 100, (short) 100 };
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) 0, intArray12);
        ds.AvaliaMultMatrizes.multmatrize(1, intArray12);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) -1, intArray12);
        ds.AvaliaMultMatrizes.multmatrize(0, intArray12);
        ds.AvaliaMultMatrizes.multmatrize(0, intArray12);
        // The following exception was thrown during execution in test generation
        try {
            ds.AvaliaMultMatrizes.multmatrize((int) '#', intArray12);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[0, 1, 1, 0, 100, 100]");
    }

    @Test
    public void test1600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1600");
        int[] intArray19 = new int[] { 0, 1, (byte) 1, (short) 0, 100, (short) 100 };
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) 0, intArray19);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) 1, intArray19);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) 0, intArray19);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) -1, intArray19);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) -1, intArray19);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) 0, intArray19);
        ds.AvaliaMultMatrizes.multmatrize(0, intArray19);
        ds.AvaliaMultMatrizes.multmatrize(0, intArray19);
        ds.AvaliaMultMatrizes.multmatrize((-1), intArray19);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) -1, intArray19);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) 1, intArray19);
        ds.AvaliaMultMatrizes.multmatrize(0, intArray19);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) -1, intArray19);
        java.lang.Class<?> wildcardClass33 = intArray19.getClass();
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray19), "[0, 1, 1, 0, 100, 100]");
        org.junit.Assert.assertNotNull(wildcardClass33);
    }

    @Test
    public void test1601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1601");
        int[] intArray11 = new int[] { 0, 1, (byte) 1, (short) 0, 100, (short) 100 };
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) 0, intArray11);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) -1, intArray11);
        ds.AvaliaMultMatrizes.multmatrize(0, intArray11);
        ds.AvaliaMultMatrizes.multmatrize(0, intArray11);
        // The following exception was thrown during execution in test generation
        try {
            ds.AvaliaMultMatrizes.multmatrize((int) (short) 100, intArray11);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[0, 1, 1, 0, 100, 100]");
    }

    @Test
    public void test1602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1602");
        int[] intArray12 = new int[] { 0, 1, (byte) 1, (short) 0, 100, (short) 100 };
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) 0, intArray12);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) 1, intArray12);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) 1, intArray12);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) -1, intArray12);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) 0, intArray12);
        ds.AvaliaMultMatrizes.multmatrize((-1), intArray12);
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[0, 1, 1, 0, 100, 100]");
    }

    @Test
    public void test1603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1603");
        int[] intArray11 = new int[] { 0, 1, (byte) 1, (short) 0, 100, (short) 100 };
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) 0, intArray11);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) 1, intArray11);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) 1, intArray11);
        ds.AvaliaMultMatrizes.multmatrize(1, intArray11);
        ds.AvaliaMultMatrizes.multmatrize(0, intArray11);
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[0, 1, 1, 0, 100, 100]");
    }

    @Test
    public void test1604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1604");
        int[] intArray12 = new int[] { (byte) 1, (byte) 100, (byte) 100, (-1), (short) 1 };
        ds.AvaliaMultMatrizes.multmatrize(0, intArray12);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) 1, intArray12);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) -1, intArray12);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) 1, intArray12);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) -1, intArray12);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) 0, intArray12);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) 1, intArray12);
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[1, 100, 100, -1, 1]");
    }

    @Test
    public void test1605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1605");
        int[] intArray16 = new int[] { 0, 1, (byte) 1, (short) 0, 100, (short) 100 };
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) 0, intArray16);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) 1, intArray16);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) 0, intArray16);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) -1, intArray16);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) 1, intArray16);
        ds.AvaliaMultMatrizes.multmatrize((-1), intArray16);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) 0, intArray16);
        ds.AvaliaMultMatrizes.multmatrize(0, intArray16);
        ds.AvaliaMultMatrizes.multmatrize(0, intArray16);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) -1, intArray16);
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray16), "[0, 1, 1, 0, 100, 100]");
    }

    @Test
    public void test1606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1606");
        int[] intArray16 = new int[] { 0, 1, (byte) 1, (short) 0, 100, (short) 100 };
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) 0, intArray16);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) 0, intArray16);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) -1, intArray16);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) -1, intArray16);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) 1, intArray16);
        ds.AvaliaMultMatrizes.multmatrize(1, intArray16);
        ds.AvaliaMultMatrizes.multmatrize((-1), intArray16);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) 0, intArray16);
        ds.AvaliaMultMatrizes.multmatrize(0, intArray16);
        // The following exception was thrown during execution in test generation
        try {
            ds.AvaliaMultMatrizes.multmatrize((int) (short) 10, intArray16);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray16), "[0, 1, 1, 0, 100, 100]");
    }

    @Test
    public void test1607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1607");
        int[] intArray16 = new int[] { 0, 1, (byte) 1, (short) 0, 100, (short) 100 };
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) 0, intArray16);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) 1, intArray16);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) 0, intArray16);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) -1, intArray16);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) 1, intArray16);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) -1, intArray16);
        ds.AvaliaMultMatrizes.multmatrize(1, intArray16);
        ds.AvaliaMultMatrizes.multmatrize(0, intArray16);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) 1, intArray16);
        // The following exception was thrown during execution in test generation
        try {
            ds.AvaliaMultMatrizes.multmatrize(100, intArray16);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray16), "[0, 1, 1, 0, 100, 100]");
    }

    @Test
    public void test1608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1608");
        int[] intArray16 = new int[] { 0, 1, (byte) 1, (short) 0, 100, (short) 100 };
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) 0, intArray16);
        ds.AvaliaMultMatrizes.multmatrize(1, intArray16);
        ds.AvaliaMultMatrizes.multmatrize(1, intArray16);
        ds.AvaliaMultMatrizes.multmatrize(0, intArray16);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) -1, intArray16);
        ds.AvaliaMultMatrizes.multmatrize((-1), intArray16);
        ds.AvaliaMultMatrizes.multmatrize(0, intArray16);
        ds.AvaliaMultMatrizes.multmatrize((-1), intArray16);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) 0, intArray16);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) 1, intArray16);
        java.lang.Class<?> wildcardClass27 = intArray16.getClass();
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray16), "[0, 1, 1, 0, 100, 100]");
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test1609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1609");
        int[] intArray7 = new int[] { (short) 1, (byte) 0, 10, ' ', (short) 100 };
        ds.AvaliaMultMatrizes.multmatrize((int) (short) 0, intArray7);
        // The following exception was thrown during execution in test generation
        try {
            ds.AvaliaMultMatrizes.multmatrize((int) '#', intArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[1, 0, 10, 32, 100]");
    }

    @Test
    public void test1610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1610");
        int[] intArray14 = new int[] { 0, 1, (byte) 1, (short) 0, 100, (short) 100 };
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) 0, intArray14);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) 0, intArray14);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) -1, intArray14);
        ds.AvaliaMultMatrizes.multmatrize(0, intArray14);
        ds.AvaliaMultMatrizes.multmatrize(1, intArray14);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) -1, intArray14);
        ds.AvaliaMultMatrizes.multmatrize(1, intArray14);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) 0, intArray14);
        java.lang.Class<?> wildcardClass23 = intArray14.getClass();
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[0, 1, 1, 0, 100, 100]");
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test1611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1611");
        int[] intArray12 = new int[] { 0, 1, (byte) 1, (short) 0, 100, (short) 100 };
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) 0, intArray12);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) 0, intArray12);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) -1, intArray12);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) -1, intArray12);
        ds.AvaliaMultMatrizes.multmatrize(1, intArray12);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) -1, intArray12);
        java.lang.Class<?> wildcardClass19 = intArray12.getClass();
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[0, 1, 1, 0, 100, 100]");
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test1612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1612");
        int[] intArray12 = new int[] { 0, 1, (byte) 1, (short) 0, 100, (short) 100 };
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) 0, intArray12);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) 1, intArray12);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) 0, intArray12);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) 1, intArray12);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) 1, intArray12);
        // The following exception was thrown during execution in test generation
        try {
            ds.AvaliaMultMatrizes.multmatrize((int) (byte) 100, intArray12);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[0, 1, 1, 0, 100, 100]");
    }

    @Test
    public void test1613() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1613");
        int[] intArray10 = new int[] { 0, 1, (byte) 1, (short) 0, 100, (short) 100 };
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) 0, intArray10);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) 0, intArray10);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) 0, intArray10);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) -1, intArray10);
        java.lang.Class<?> wildcardClass15 = intArray10.getClass();
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[0, 1, 1, 0, 100, 100]");
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test1614() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1614");
        int[] intArray13 = new int[] { 0, 1, (byte) 1, (short) 0, 100, (short) 100 };
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) 0, intArray13);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) 0, intArray13);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) 1, intArray13);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) 1, intArray13);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) -1, intArray13);
        ds.AvaliaMultMatrizes.multmatrize(0, intArray13);
        // The following exception was thrown during execution in test generation
        try {
            ds.AvaliaMultMatrizes.multmatrize(10, intArray13);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[0, 1, 1, 0, 100, 100]");
    }

    @Test
    public void test1615() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1615");
        int[] intArray13 = new int[] { 0, 1, (byte) 1, (short) 0, 100, (short) 100 };
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) 0, intArray13);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) 1, intArray13);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) 0, intArray13);
        ds.AvaliaMultMatrizes.multmatrize((-1), intArray13);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) -1, intArray13);
        ds.AvaliaMultMatrizes.multmatrize(1, intArray13);
        // The following exception was thrown during execution in test generation
        try {
            ds.AvaliaMultMatrizes.multmatrize((int) (short) 100, intArray13);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[0, 1, 1, 0, 100, 100]");
    }

    @Test
    public void test1616() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1616");
        int[] intArray12 = new int[] { 0, 1, (byte) 1, (short) 0, 100, (short) 100 };
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) 0, intArray12);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) 1, intArray12);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) -1, intArray12);
        ds.AvaliaMultMatrizes.multmatrize((-1), intArray12);
        ds.AvaliaMultMatrizes.multmatrize((-1), intArray12);
        // The following exception was thrown during execution in test generation
        try {
            ds.AvaliaMultMatrizes.multmatrize((int) (byte) 10, intArray12);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[0, 1, 1, 0, 100, 100]");
    }

    @Test
    public void test1617() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1617");
        int[] intArray12 = new int[] { 0, 1, (byte) 1, (short) 0, 100, (short) 100 };
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) 0, intArray12);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) 1, intArray12);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) -1, intArray12);
        ds.AvaliaMultMatrizes.multmatrize((-1), intArray12);
        ds.AvaliaMultMatrizes.multmatrize((-1), intArray12);
        // The following exception was thrown during execution in test generation
        try {
            ds.AvaliaMultMatrizes.multmatrize(10, intArray12);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[0, 1, 1, 0, 100, 100]");
    }

    @Test
    public void test1618() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1618");
        int[] intArray12 = new int[] { 0, 1, (byte) 1, (short) 0, 100, (short) 100 };
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) 0, intArray12);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) 1, intArray12);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) -1, intArray12);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) 1, intArray12);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) -1, intArray12);
        // The following exception was thrown during execution in test generation
        try {
            ds.AvaliaMultMatrizes.multmatrize((int) ' ', intArray12);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[0, 1, 1, 0, 100, 100]");
    }

    @Test
    public void test1619() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1619");
        int[] intArray14 = new int[] { 0, 1, (byte) 1, (short) 0, 100, (short) 100 };
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) 0, intArray14);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) 1, intArray14);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) 0, intArray14);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) -1, intArray14);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) 1, intArray14);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) -1, intArray14);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) -1, intArray14);
        ds.AvaliaMultMatrizes.multmatrize((-1), intArray14);
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[0, 1, 1, 0, 100, 100]");
    }

    @Test
    public void test1620() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1620");
        int[] intArray13 = new int[] { 0, 1, (byte) 1, (short) 0, 100, (short) 100 };
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) 0, intArray13);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) 1, intArray13);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) 0, intArray13);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) -1, intArray13);
        ds.AvaliaMultMatrizes.multmatrize(0, intArray13);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) -1, intArray13);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) 0, intArray13);
        java.lang.Class<?> wildcardClass21 = intArray13.getClass();
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[0, 1, 1, 0, 100, 100]");
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test1621() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1621");
        int[] intArray15 = new int[] { 0, 1, (byte) 1, (short) 0, 100, (short) 100 };
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) 0, intArray15);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) 1, intArray15);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) 0, intArray15);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) -1, intArray15);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) 1, intArray15);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) -1, intArray15);
        ds.AvaliaMultMatrizes.multmatrize(1, intArray15);
        ds.AvaliaMultMatrizes.multmatrize(0, intArray15);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) 1, intArray15);
        java.lang.Class<?> wildcardClass25 = intArray15.getClass();
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[0, 1, 1, 0, 100, 100]");
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test1622() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1622");
        int[] intArray11 = new int[] { (byte) 1, (byte) 100, (byte) 100, (-1), (short) 1 };
        ds.AvaliaMultMatrizes.multmatrize(0, intArray11);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) 1, intArray11);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) -1, intArray11);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) 1, intArray11);
        ds.AvaliaMultMatrizes.multmatrize(0, intArray11);
        // The following exception was thrown during execution in test generation
        try {
            ds.AvaliaMultMatrizes.multmatrize(100, intArray11);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[1, 100, 100, -1, 1]");
    }

    @Test
    public void test1623() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1623");
        int[] intArray15 = new int[] { 0, 1, (byte) 1, (short) 0, 100, (short) 100 };
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) 0, intArray15);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) 0, intArray15);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) 0, intArray15);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) -1, intArray15);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) 1, intArray15);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) -1, intArray15);
        ds.AvaliaMultMatrizes.multmatrize(1, intArray15);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) -1, intArray15);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) -1, intArray15);
        java.lang.Class<?> wildcardClass25 = intArray15.getClass();
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[0, 1, 1, 0, 100, 100]");
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test1624() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1624");
        int[] intArray11 = new int[] { 0, 1, (byte) 1, (short) 0, 100, (short) 100 };
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) 0, intArray11);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) -1, intArray11);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) -1, intArray11);
        ds.AvaliaMultMatrizes.multmatrize(1, intArray11);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) 0, intArray11);
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[0, 1, 1, 0, 100, 100]");
    }

    @Test
    public void test1625() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1625");
        int[] intArray12 = new int[] { 0, 1, (byte) 1, (short) 0, 100, (short) 100 };
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) 0, intArray12);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) 0, intArray12);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) 1, intArray12);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) 1, intArray12);
        ds.AvaliaMultMatrizes.multmatrize((-1), intArray12);
        // The following exception was thrown during execution in test generation
        try {
            ds.AvaliaMultMatrizes.multmatrize((int) (byte) 100, intArray12);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[0, 1, 1, 0, 100, 100]");
    }

    @Test
    public void test1626() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1626");
        int[] intArray9 = new int[] { 0, 1, (byte) 1, (short) 0, 100, (short) 100 };
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) 0, intArray9);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) 0, intArray9);
        ds.AvaliaMultMatrizes.multmatrize(0, intArray9);
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[0, 1, 1, 0, 100, 100]");
    }

    @Test
    public void test1627() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1627");
        int[] intArray17 = new int[] { 0, 1, (byte) 1, (short) 0, 100, (short) 100 };
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) 0, intArray17);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) 1, intArray17);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) 0, intArray17);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) -1, intArray17);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) -1, intArray17);
        ds.AvaliaMultMatrizes.multmatrize(0, intArray17);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) 1, intArray17);
        ds.AvaliaMultMatrizes.multmatrize((-1), intArray17);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) 1, intArray17);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) 0, intArray17);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) -1, intArray17);
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[0, 1, 1, 0, 100, 100]");
    }

    @Test
    public void test1628() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1628");
        int[] intArray17 = new int[] { 0, 1, (byte) 1, (short) 0, 100, (short) 100 };
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) 0, intArray17);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) 1, intArray17);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) 0, intArray17);
        ds.AvaliaMultMatrizes.multmatrize(0, intArray17);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) 0, intArray17);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) -1, intArray17);
        ds.AvaliaMultMatrizes.multmatrize((-1), intArray17);
        ds.AvaliaMultMatrizes.multmatrize((-1), intArray17);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) 1, intArray17);
        ds.AvaliaMultMatrizes.multmatrize((-1), intArray17);
        // The following exception was thrown during execution in test generation
        try {
            ds.AvaliaMultMatrizes.multmatrize((int) ' ', intArray17);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[0, 1, 1, 0, 100, 100]");
    }

    @Test
    public void test1629() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1629");
        int[] intArray18 = new int[] { 0, 1, (byte) 1, (short) 0, 100, (short) 100 };
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) 0, intArray18);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) 1, intArray18);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) 0, intArray18);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) -1, intArray18);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) 1, intArray18);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) -1, intArray18);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) 0, intArray18);
        ds.AvaliaMultMatrizes.multmatrize((-1), intArray18);
        ds.AvaliaMultMatrizes.multmatrize(1, intArray18);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) 0, intArray18);
        ds.AvaliaMultMatrizes.multmatrize((-1), intArray18);
        // The following exception was thrown during execution in test generation
        try {
            ds.AvaliaMultMatrizes.multmatrize((int) '4', intArray18);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray18), "[0, 1, 1, 0, 100, 100]");
    }

    @Test
    public void test1630() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1630");
        int[] intArray14 = new int[] { 0, 1, (byte) 1, (short) 0, 100, (short) 100 };
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) 0, intArray14);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) 1, intArray14);
        ds.AvaliaMultMatrizes.multmatrize(0, intArray14);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) 0, intArray14);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) -1, intArray14);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) -1, intArray14);
        ds.AvaliaMultMatrizes.multmatrize((-1), intArray14);
        // The following exception was thrown during execution in test generation
        try {
            ds.AvaliaMultMatrizes.multmatrize((int) (byte) 100, intArray14);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[0, 1, 1, 0, 100, 100]");
    }

    @Test
    public void test1631() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1631");
        int[] intArray14 = new int[] { 0, 1, (byte) 1, (short) 0, 100, (short) 100 };
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) 0, intArray14);
        ds.AvaliaMultMatrizes.multmatrize(1, intArray14);
        ds.AvaliaMultMatrizes.multmatrize(1, intArray14);
        ds.AvaliaMultMatrizes.multmatrize(0, intArray14);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) 1, intArray14);
        ds.AvaliaMultMatrizes.multmatrize(1, intArray14);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) 1, intArray14);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) 0, intArray14);
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[0, 1, 1, 0, 100, 100]");
    }

    @Test
    public void test1632() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1632");
        int[] intArray13 = new int[] { 0, 1, (byte) 1, (short) 0, 100, (short) 100 };
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) 0, intArray13);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) 0, intArray13);
        ds.AvaliaMultMatrizes.multmatrize(1, intArray13);
        ds.AvaliaMultMatrizes.multmatrize(0, intArray13);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) 1, intArray13);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) 1, intArray13);
        // The following exception was thrown during execution in test generation
        try {
            ds.AvaliaMultMatrizes.multmatrize((int) 'a', intArray13);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[0, 1, 1, 0, 100, 100]");
    }

    @Test
    public void test1633() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1633");
        int[] intArray14 = new int[] { 0, 1, (byte) 1, (short) 0, 100, (short) 100 };
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) 0, intArray14);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) 1, intArray14);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) 0, intArray14);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) -1, intArray14);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) 0, intArray14);
        ds.AvaliaMultMatrizes.multmatrize(0, intArray14);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) -1, intArray14);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) 1, intArray14);
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[0, 1, 1, 0, 100, 100]");
    }

    @Test
    public void test1634() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1634");
        int[] intArray12 = new int[] { 0, 1, (byte) 1, (short) 0, 100, (short) 100 };
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) 0, intArray12);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) 1, intArray12);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) -1, intArray12);
        ds.AvaliaMultMatrizes.multmatrize((-1), intArray12);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) 0, intArray12);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) 0, intArray12);
        java.lang.Class<?> wildcardClass19 = intArray12.getClass();
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[0, 1, 1, 0, 100, 100]");
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test1635() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1635");
        int[] intArray16 = new int[] { 0, 1, (byte) 1, (short) 0, 100, (short) 100 };
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) 0, intArray16);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) 1, intArray16);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) 0, intArray16);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) -1, intArray16);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) 1, intArray16);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) 0, intArray16);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) 0, intArray16);
        ds.AvaliaMultMatrizes.multmatrize(1, intArray16);
        ds.AvaliaMultMatrizes.multmatrize(0, intArray16);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) 1, intArray16);
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray16), "[0, 1, 1, 0, 100, 100]");
    }

    @Test
    public void test1636() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1636");
        int[] intArray16 = new int[] { 0, 1, (byte) 1, (short) 0, 100, (short) 100 };
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) 0, intArray16);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) 1, intArray16);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) 0, intArray16);
        ds.AvaliaMultMatrizes.multmatrize(0, intArray16);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) 0, intArray16);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) -1, intArray16);
        ds.AvaliaMultMatrizes.multmatrize(0, intArray16);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) -1, intArray16);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) -1, intArray16);
        // The following exception was thrown during execution in test generation
        try {
            ds.AvaliaMultMatrizes.multmatrize((int) (byte) 10, intArray16);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray16), "[0, 1, 1, 0, 100, 100]");
    }

    @Test
    public void test1637() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1637");
        int[] intArray15 = new int[] { 0, 1, (byte) 1, (short) 0, 100, (short) 100 };
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) 0, intArray15);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) 1, intArray15);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) 0, intArray15);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) -1, intArray15);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) -1, intArray15);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) 0, intArray15);
        ds.AvaliaMultMatrizes.multmatrize(0, intArray15);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) 0, intArray15);
        // The following exception was thrown during execution in test generation
        try {
            ds.AvaliaMultMatrizes.multmatrize((int) '4', intArray15);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[0, 1, 1, 0, 100, 100]");
    }

    @Test
    public void test1638() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1638");
        int[] intArray12 = new int[] { 0, 1, (byte) 1, (short) 0, 100, (short) 100 };
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) 0, intArray12);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) 1, intArray12);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) 0, intArray12);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) 1, intArray12);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) 1, intArray12);
        // The following exception was thrown during execution in test generation
        try {
            ds.AvaliaMultMatrizes.multmatrize((int) (byte) 10, intArray12);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[0, 1, 1, 0, 100, 100]");
    }

    @Test
    public void test1639() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1639");
        int[] intArray14 = new int[] { 0, 1, (byte) 1, (short) 0, 100, (short) 100 };
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) 0, intArray14);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) 1, intArray14);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) 0, intArray14);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) -1, intArray14);
        ds.AvaliaMultMatrizes.multmatrize(1, intArray14);
        ds.AvaliaMultMatrizes.multmatrize(1, intArray14);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) 0, intArray14);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) 1, intArray14);
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[0, 1, 1, 0, 100, 100]");
    }

    @Test
    public void test1640() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1640");
        int[] intArray13 = new int[] { 0, 1, (byte) 1, (short) 0, 100, (short) 100 };
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) 0, intArray13);
        ds.AvaliaMultMatrizes.multmatrize(1, intArray13);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) -1, intArray13);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) 1, intArray13);
        ds.AvaliaMultMatrizes.multmatrize((-1), intArray13);
        ds.AvaliaMultMatrizes.multmatrize(1, intArray13);
        // The following exception was thrown during execution in test generation
        try {
            ds.AvaliaMultMatrizes.multmatrize((int) (short) 10, intArray13);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[0, 1, 1, 0, 100, 100]");
    }

    @Test
    public void test1641() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1641");
        int[] intArray10 = new int[] { (byte) 1, (byte) 100, (byte) 100, (-1), (short) 1 };
        ds.AvaliaMultMatrizes.multmatrize(0, intArray10);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) -1, intArray10);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) 1, intArray10);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) 0, intArray10);
        // The following exception was thrown during execution in test generation
        try {
            ds.AvaliaMultMatrizes.multmatrize((int) '#', intArray10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[1, 100, 100, -1, 1]");
    }

    @Test
    public void test1642() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1642");
        int[] intArray14 = new int[] { 0, 1, (byte) 1, (short) 0, 100, (short) 100 };
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) 0, intArray14);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) 1, intArray14);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) 1, intArray14);
        ds.AvaliaMultMatrizes.multmatrize(0, intArray14);
        ds.AvaliaMultMatrizes.multmatrize((-1), intArray14);
        ds.AvaliaMultMatrizes.multmatrize(0, intArray14);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) 1, intArray14);
        ds.AvaliaMultMatrizes.multmatrize((-1), intArray14);
        java.lang.Class<?> wildcardClass23 = intArray14.getClass();
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[0, 1, 1, 0, 100, 100]");
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test1643() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1643");
        int[] intArray15 = new int[] { 0, 1, (byte) 1, (short) 0, 100, (short) 100 };
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) 0, intArray15);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) 1, intArray15);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) 0, intArray15);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) -1, intArray15);
        ds.AvaliaMultMatrizes.multmatrize(0, intArray15);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) 1, intArray15);
        ds.AvaliaMultMatrizes.multmatrize(1, intArray15);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) -1, intArray15);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) 1, intArray15);
        java.lang.Class<?> wildcardClass25 = intArray15.getClass();
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[0, 1, 1, 0, 100, 100]");
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test1644() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1644");
        int[] intArray14 = new int[] { 0, 1, (byte) 1, (short) 0, 100, (short) 100 };
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) 0, intArray14);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) 0, intArray14);
        ds.AvaliaMultMatrizes.multmatrize(1, intArray14);
        ds.AvaliaMultMatrizes.multmatrize(0, intArray14);
        ds.AvaliaMultMatrizes.multmatrize(0, intArray14);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) -1, intArray14);
        ds.AvaliaMultMatrizes.multmatrize((-1), intArray14);
        // The following exception was thrown during execution in test generation
        try {
            ds.AvaliaMultMatrizes.multmatrize((int) (byte) 100, intArray14);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[0, 1, 1, 0, 100, 100]");
    }

    @Test
    public void test1645() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1645");
        int[] intArray12 = new int[] { 0, 1, (byte) 1, (short) 0, 100, (short) 100 };
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) 0, intArray12);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) 0, intArray12);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) -1, intArray12);
        ds.AvaliaMultMatrizes.multmatrize(0, intArray12);
        ds.AvaliaMultMatrizes.multmatrize(1, intArray12);
        ds.AvaliaMultMatrizes.multmatrize(1, intArray12);
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[0, 1, 1, 0, 100, 100]");
    }

    @Test
    public void test1646() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1646");
        int[] intArray15 = new int[] { 0, 1, (byte) 1, (short) 0, 100, (short) 100 };
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) 0, intArray15);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) 1, intArray15);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) 0, intArray15);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) -1, intArray15);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) 0, intArray15);
        ds.AvaliaMultMatrizes.multmatrize((-1), intArray15);
        ds.AvaliaMultMatrizes.multmatrize(0, intArray15);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) -1, intArray15);
        // The following exception was thrown during execution in test generation
        try {
            ds.AvaliaMultMatrizes.multmatrize((int) 'a', intArray15);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[0, 1, 1, 0, 100, 100]");
    }

    @Test
    public void test1647() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1647");
        int[] intArray17 = new int[] { 0, 1, (byte) 1, (short) 0, 100, (short) 100 };
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) 0, intArray17);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) 1, intArray17);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) 0, intArray17);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) -1, intArray17);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) 1, intArray17);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) -1, intArray17);
        ds.AvaliaMultMatrizes.multmatrize(1, intArray17);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) 0, intArray17);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) 0, intArray17);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) -1, intArray17);
        // The following exception was thrown during execution in test generation
        try {
            ds.AvaliaMultMatrizes.multmatrize((int) '#', intArray17);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[0, 1, 1, 0, 100, 100]");
    }

    @Test
    public void test1648() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1648");
        int[] intArray15 = new int[] { 0, 1, (byte) 1, (short) 0, 100, (short) 100 };
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) 0, intArray15);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) 1, intArray15);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) 0, intArray15);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) -1, intArray15);
        ds.AvaliaMultMatrizes.multmatrize(0, intArray15);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) 1, intArray15);
        ds.AvaliaMultMatrizes.multmatrize(1, intArray15);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) -1, intArray15);
        // The following exception was thrown during execution in test generation
        try {
            ds.AvaliaMultMatrizes.multmatrize((int) (short) 10, intArray15);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[0, 1, 1, 0, 100, 100]");
    }

    @Test
    public void test1649() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1649");
        int[] intArray9 = new int[] { (byte) 1, (byte) 100, (byte) 100, (-1), (short) 1 };
        ds.AvaliaMultMatrizes.multmatrize(0, intArray9);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) -1, intArray9);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) 1, intArray9);
        // The following exception was thrown during execution in test generation
        try {
            ds.AvaliaMultMatrizes.multmatrize((int) (byte) 10, intArray9);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[1, 100, 100, -1, 1]");
    }

    @Test
    public void test1650() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1650");
        int[] intArray15 = new int[] { 0, 1, (byte) 1, (short) 0, 100, (short) 100 };
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) 0, intArray15);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) 1, intArray15);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) 0, intArray15);
        ds.AvaliaMultMatrizes.multmatrize(0, intArray15);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) 0, intArray15);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) 0, intArray15);
        ds.AvaliaMultMatrizes.multmatrize(1, intArray15);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) -1, intArray15);
        // The following exception was thrown during execution in test generation
        try {
            ds.AvaliaMultMatrizes.multmatrize((int) ' ', intArray15);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[0, 1, 1, 0, 100, 100]");
    }

    @Test
    public void test1651() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1651");
        int[] intArray14 = new int[] { 0, 1, (byte) 1, (short) 0, 100, (short) 100 };
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) 0, intArray14);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) -1, intArray14);
        ds.AvaliaMultMatrizes.multmatrize(0, intArray14);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) -1, intArray14);
        ds.AvaliaMultMatrizes.multmatrize(0, intArray14);
        ds.AvaliaMultMatrizes.multmatrize(1, intArray14);
        ds.AvaliaMultMatrizes.multmatrize(0, intArray14);
        ds.AvaliaMultMatrizes.multmatrize(1, intArray14);
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[0, 1, 1, 0, 100, 100]");
    }

    @Test
    public void test1652() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1652");
        int[] intArray14 = new int[] { 0, 1, (byte) 1, (short) 0, 100, (short) 100 };
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) 0, intArray14);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) 1, intArray14);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) 0, intArray14);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) -1, intArray14);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) 1, intArray14);
        ds.AvaliaMultMatrizes.multmatrize((-1), intArray14);
        ds.AvaliaMultMatrizes.multmatrize(1, intArray14);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) 0, intArray14);
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[0, 1, 1, 0, 100, 100]");
    }

    @Test
    public void test1653() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1653");
        int[] intArray18 = new int[] { 0, 1, (byte) 1, (short) 0, 100, (short) 100 };
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) 0, intArray18);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) 1, intArray18);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) 0, intArray18);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) -1, intArray18);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) -1, intArray18);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) 0, intArray18);
        ds.AvaliaMultMatrizes.multmatrize(0, intArray18);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) -1, intArray18);
        ds.AvaliaMultMatrizes.multmatrize(1, intArray18);
        ds.AvaliaMultMatrizes.multmatrize(0, intArray18);
        ds.AvaliaMultMatrizes.multmatrize(0, intArray18);
        // The following exception was thrown during execution in test generation
        try {
            ds.AvaliaMultMatrizes.multmatrize((int) '#', intArray18);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray18), "[0, 1, 1, 0, 100, 100]");
    }

    @Test
    public void test1654() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1654");
        int[] intArray15 = new int[] { 0, 1, (byte) 1, (short) 0, 100, (short) 100 };
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) 0, intArray15);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) 1, intArray15);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) 0, intArray15);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) -1, intArray15);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) -1, intArray15);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) 0, intArray15);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) -1, intArray15);
        ds.AvaliaMultMatrizes.multmatrize(1, intArray15);
        ds.AvaliaMultMatrizes.multmatrize(1, intArray15);
        java.lang.Class<?> wildcardClass25 = intArray15.getClass();
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[0, 1, 1, 0, 100, 100]");
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test1655() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1655");
        int[] intArray12 = new int[] { 0, 1, (byte) 1, (short) 0, 100, (short) 100 };
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) 0, intArray12);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) 0, intArray12);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) -1, intArray12);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) 1, intArray12);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) 1, intArray12);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) -1, intArray12);
        java.lang.Class<?> wildcardClass19 = intArray12.getClass();
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[0, 1, 1, 0, 100, 100]");
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test1656() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1656");
        int[] intArray17 = new int[] { 0, 1, (byte) 1, (short) 0, 100, (short) 100 };
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) 0, intArray17);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) 1, intArray17);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) 0, intArray17);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) -1, intArray17);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) -1, intArray17);
        ds.AvaliaMultMatrizes.multmatrize(0, intArray17);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) 1, intArray17);
        ds.AvaliaMultMatrizes.multmatrize((-1), intArray17);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) -1, intArray17);
        ds.AvaliaMultMatrizes.multmatrize(0, intArray17);
        // The following exception was thrown during execution in test generation
        try {
            ds.AvaliaMultMatrizes.multmatrize((int) ' ', intArray17);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[0, 1, 1, 0, 100, 100]");
    }

    @Test
    public void test1657() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1657");
        int[] intArray14 = new int[] { 0, 1, (byte) 1, (short) 0, 100, (short) 100 };
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) 0, intArray14);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) 1, intArray14);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) 0, intArray14);
        ds.AvaliaMultMatrizes.multmatrize(0, intArray14);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) 0, intArray14);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) -1, intArray14);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) -1, intArray14);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) 0, intArray14);
        java.lang.Class<?> wildcardClass23 = intArray14.getClass();
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[0, 1, 1, 0, 100, 100]");
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test1658() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1658");
        int[] intArray11 = new int[] { 0, 1, (byte) 1, (short) 0, 100, (short) 100 };
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) 0, intArray11);
        ds.AvaliaMultMatrizes.multmatrize(1, intArray11);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) 0, intArray11);
        ds.AvaliaMultMatrizes.multmatrize(0, intArray11);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) 1, intArray11);
        java.lang.Class<?> wildcardClass17 = intArray11.getClass();
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[0, 1, 1, 0, 100, 100]");
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test1659() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1659");
        int[] intArray18 = new int[] { 0, 1, (byte) 1, (short) 0, 100, (short) 100 };
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) 0, intArray18);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) 1, intArray18);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) 0, intArray18);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) -1, intArray18);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) 1, intArray18);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) -1, intArray18);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) -1, intArray18);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) -1, intArray18);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) -1, intArray18);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) -1, intArray18);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) 1, intArray18);
        // The following exception was thrown during execution in test generation
        try {
            ds.AvaliaMultMatrizes.multmatrize((int) (short) 100, intArray18);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray18), "[0, 1, 1, 0, 100, 100]");
    }

    @Test
    public void test1660() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1660");
        int[] intArray16 = new int[] { 0, 1, (byte) 1, (short) 0, 100, (short) 100 };
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) 0, intArray16);
        ds.AvaliaMultMatrizes.multmatrize(1, intArray16);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) -1, intArray16);
        ds.AvaliaMultMatrizes.multmatrize(0, intArray16);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) -1, intArray16);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) 1, intArray16);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) -1, intArray16);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) 1, intArray16);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) 1, intArray16);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) 0, intArray16);
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray16), "[0, 1, 1, 0, 100, 100]");
    }

    @Test
    public void test1661() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1661");
        int[] intArray14 = new int[] { 0, 1, (byte) 1, (short) 0, 100, (short) 100 };
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) 0, intArray14);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) 0, intArray14);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) 0, intArray14);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) -1, intArray14);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) 1, intArray14);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) 1, intArray14);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) -1, intArray14);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) -1, intArray14);
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[0, 1, 1, 0, 100, 100]");
    }

    @Test
    public void test1662() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1662");
        int[] intArray15 = new int[] { 0, 1, (byte) 1, (short) 0, 100, (short) 100 };
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) 0, intArray15);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) 1, intArray15);
        ds.AvaliaMultMatrizes.multmatrize(0, intArray15);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) 0, intArray15);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) -1, intArray15);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) -1, intArray15);
        ds.AvaliaMultMatrizes.multmatrize((-1), intArray15);
        ds.AvaliaMultMatrizes.multmatrize(1, intArray15);
        ds.AvaliaMultMatrizes.multmatrize((-1), intArray15);
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[0, 1, 1, 0, 100, 100]");
    }

    @Test
    public void test1663() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1663");
        int[] intArray21 = new int[] { 0, 1, (byte) 1, (short) 0, 100, (short) 100 };
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) 0, intArray21);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) 1, intArray21);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) 0, intArray21);
        ds.AvaliaMultMatrizes.multmatrize(0, intArray21);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) 0, intArray21);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) -1, intArray21);
        ds.AvaliaMultMatrizes.multmatrize((-1), intArray21);
        ds.AvaliaMultMatrizes.multmatrize((-1), intArray21);
        ds.AvaliaMultMatrizes.multmatrize(0, intArray21);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) 1, intArray21);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) 0, intArray21);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) 0, intArray21);
        ds.AvaliaMultMatrizes.multmatrize(0, intArray21);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) 1, intArray21);
        ds.AvaliaMultMatrizes.multmatrize((-1), intArray21);
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray21), "[0, 1, 1, 0, 100, 100]");
    }

    @Test
    public void test1664() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1664");
        int[] intArray17 = new int[] { 0, 1, (byte) 1, (short) 0, 100, (short) 100 };
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) 0, intArray17);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) 0, intArray17);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) 0, intArray17);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) -1, intArray17);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) 1, intArray17);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) -1, intArray17);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) -1, intArray17);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) 0, intArray17);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) 0, intArray17);
        ds.AvaliaMultMatrizes.multmatrize((-1), intArray17);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) 1, intArray17);
        java.lang.Class<?> wildcardClass29 = intArray17.getClass();
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[0, 1, 1, 0, 100, 100]");
        org.junit.Assert.assertNotNull(wildcardClass29);
    }

    @Test
    public void test1665() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1665");
        int[] intArray12 = new int[] { 0, 1, (byte) 1, (short) 0, 100, (short) 100 };
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) 0, intArray12);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) 1, intArray12);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) -1, intArray12);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) 1, intArray12);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) -1, intArray12);
        // The following exception was thrown during execution in test generation
        try {
            ds.AvaliaMultMatrizes.multmatrize((int) '4', intArray12);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[0, 1, 1, 0, 100, 100]");
    }

    @Test
    public void test1666() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1666");
        int[] intArray14 = new int[] { 0, 1, (byte) 1, (short) 0, 100, (short) 100 };
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) 0, intArray14);
        ds.AvaliaMultMatrizes.multmatrize(1, intArray14);
        ds.AvaliaMultMatrizes.multmatrize(1, intArray14);
        ds.AvaliaMultMatrizes.multmatrize(0, intArray14);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) -1, intArray14);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) 1, intArray14);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) 1, intArray14);
        ds.AvaliaMultMatrizes.multmatrize(1, intArray14);
        java.lang.Class<?> wildcardClass23 = intArray14.getClass();
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[0, 1, 1, 0, 100, 100]");
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test1667() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1667");
        int[] intArray11 = new int[] { 0, 1, (byte) 1, (short) 0, 100, (short) 100 };
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) 0, intArray11);
        ds.AvaliaMultMatrizes.multmatrize(1, intArray11);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) 0, intArray11);
        ds.AvaliaMultMatrizes.multmatrize(0, intArray11);
        // The following exception was thrown during execution in test generation
        try {
            ds.AvaliaMultMatrizes.multmatrize((int) (short) 100, intArray11);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[0, 1, 1, 0, 100, 100]");
    }

    @Test
    public void test1668() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1668");
        int[] intArray17 = new int[] { 0, 1, (byte) 1, (short) 0, 100, (short) 100 };
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) 0, intArray17);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) 1, intArray17);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) 0, intArray17);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) -1, intArray17);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) 1, intArray17);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) -1, intArray17);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) -1, intArray17);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) -1, intArray17);
        ds.AvaliaMultMatrizes.multmatrize(0, intArray17);
        ds.AvaliaMultMatrizes.multmatrize((-1), intArray17);
        // The following exception was thrown during execution in test generation
        try {
            ds.AvaliaMultMatrizes.multmatrize((int) 'a', intArray17);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[0, 1, 1, 0, 100, 100]");
    }

    @Test
    public void test1669() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1669");
        int[] intArray13 = new int[] { (byte) 1, (byte) 100, (byte) 100, (-1), (short) 1 };
        ds.AvaliaMultMatrizes.multmatrize(0, intArray13);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) 1, intArray13);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) -1, intArray13);
        ds.AvaliaMultMatrizes.multmatrize(1, intArray13);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) 1, intArray13);
        ds.AvaliaMultMatrizes.multmatrize(0, intArray13);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) 0, intArray13);
        // The following exception was thrown during execution in test generation
        try {
            ds.AvaliaMultMatrizes.multmatrize(10, intArray13);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[1, 100, 100, -1, 1]");
    }

    @Test
    public void test1670() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1670");
        int[] intArray17 = new int[] { 0, 1, (byte) 1, (short) 0, 100, (short) 100 };
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) 0, intArray17);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) 1, intArray17);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) 0, intArray17);
        ds.AvaliaMultMatrizes.multmatrize(0, intArray17);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) 0, intArray17);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) -1, intArray17);
        ds.AvaliaMultMatrizes.multmatrize((-1), intArray17);
        ds.AvaliaMultMatrizes.multmatrize((-1), intArray17);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) -1, intArray17);
        ds.AvaliaMultMatrizes.multmatrize(1, intArray17);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) 1, intArray17);
        java.lang.Class<?> wildcardClass29 = intArray17.getClass();
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[0, 1, 1, 0, 100, 100]");
        org.junit.Assert.assertNotNull(wildcardClass29);
    }

    @Test
    public void test1671() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1671");
        int[] intArray17 = new int[] { 0, 1, (byte) 1, (short) 0, 100, (short) 100 };
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) 0, intArray17);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) 1, intArray17);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) 0, intArray17);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) -1, intArray17);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) 1, intArray17);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) -1, intArray17);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) 0, intArray17);
        ds.AvaliaMultMatrizes.multmatrize((-1), intArray17);
        ds.AvaliaMultMatrizes.multmatrize(1, intArray17);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) 0, intArray17);
        // The following exception was thrown during execution in test generation
        try {
            ds.AvaliaMultMatrizes.multmatrize((int) (short) 10, intArray17);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[0, 1, 1, 0, 100, 100]");
    }

    @Test
    public void test1672() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1672");
        int[] intArray9 = new int[] { (byte) 1, (byte) 100, (byte) 100, (-1), (short) 1 };
        ds.AvaliaMultMatrizes.multmatrize(0, intArray9);
        ds.AvaliaMultMatrizes.multmatrize(0, intArray9);
        ds.AvaliaMultMatrizes.multmatrize((-1), intArray9);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) 1, intArray9);
        java.lang.Class<?> wildcardClass14 = intArray9.getClass();
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[1, 100, 100, -1, 1]");
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test1673() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1673");
        int[] intArray13 = new int[] { (byte) 1, (byte) 100, (byte) 100, (-1), (short) 1 };
        ds.AvaliaMultMatrizes.multmatrize(0, intArray13);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) 1, intArray13);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) -1, intArray13);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) 0, intArray13);
        ds.AvaliaMultMatrizes.multmatrize(0, intArray13);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) 0, intArray13);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) -1, intArray13);
        // The following exception was thrown during execution in test generation
        try {
            ds.AvaliaMultMatrizes.multmatrize((int) (short) 100, intArray13);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[1, 100, 100, -1, 1]");
    }

    @Test
    public void test1674() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1674");
        int[] intArray17 = new int[] { 0, 1, (byte) 1, (short) 0, 100, (short) 100 };
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) 0, intArray17);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) 1, intArray17);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) 0, intArray17);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) -1, intArray17);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) 1, intArray17);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) -1, intArray17);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) 0, intArray17);
        ds.AvaliaMultMatrizes.multmatrize((-1), intArray17);
        ds.AvaliaMultMatrizes.multmatrize(1, intArray17);
        ds.AvaliaMultMatrizes.multmatrize(0, intArray17);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) -1, intArray17);
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[0, 1, 1, 0, 100, 100]");
    }

    @Test
    public void test1675() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1675");
        int[] intArray12 = new int[] { 0, 1, (byte) 1, (short) 0, 100, (short) 100 };
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) 0, intArray12);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) -1, intArray12);
        ds.AvaliaMultMatrizes.multmatrize(0, intArray12);
        ds.AvaliaMultMatrizes.multmatrize(0, intArray12);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) -1, intArray12);
        ds.AvaliaMultMatrizes.multmatrize(1, intArray12);
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[0, 1, 1, 0, 100, 100]");
    }

    @Test
    public void test1676() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1676");
        int[] intArray14 = new int[] { 0, 1, (byte) 1, (short) 0, 100, (short) 100 };
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) 0, intArray14);
        ds.AvaliaMultMatrizes.multmatrize(1, intArray14);
        ds.AvaliaMultMatrizes.multmatrize(1, intArray14);
        ds.AvaliaMultMatrizes.multmatrize(0, intArray14);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) -1, intArray14);
        ds.AvaliaMultMatrizes.multmatrize(0, intArray14);
        ds.AvaliaMultMatrizes.multmatrize(1, intArray14);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) 1, intArray14);
        java.lang.Class<?> wildcardClass23 = intArray14.getClass();
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[0, 1, 1, 0, 100, 100]");
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test1677() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1677");
        int[] intArray12 = new int[] { 0, 1, (byte) 1, (short) 0, 100, (short) 100 };
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) 0, intArray12);
        ds.AvaliaMultMatrizes.multmatrize(1, intArray12);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) -1, intArray12);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) 0, intArray12);
        ds.AvaliaMultMatrizes.multmatrize(1, intArray12);
        // The following exception was thrown during execution in test generation
        try {
            ds.AvaliaMultMatrizes.multmatrize((int) (short) 100, intArray12);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[0, 1, 1, 0, 100, 100]");
    }

    @Test
    public void test1678() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1678");
        int[] intArray18 = new int[] { 0, 1, (byte) 1, (short) 0, 100, (short) 100 };
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) 0, intArray18);
        ds.AvaliaMultMatrizes.multmatrize(1, intArray18);
        ds.AvaliaMultMatrizes.multmatrize(1, intArray18);
        ds.AvaliaMultMatrizes.multmatrize(0, intArray18);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) -1, intArray18);
        ds.AvaliaMultMatrizes.multmatrize(0, intArray18);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) 1, intArray18);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) -1, intArray18);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) 1, intArray18);
        ds.AvaliaMultMatrizes.multmatrize(0, intArray18);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) 1, intArray18);
        // The following exception was thrown during execution in test generation
        try {
            ds.AvaliaMultMatrizes.multmatrize((int) (byte) 100, intArray18);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray18), "[0, 1, 1, 0, 100, 100]");
    }

    @Test
    public void test1679() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1679");
        int[] intArray18 = new int[] { 0, 1, (byte) 1, (short) 0, 100, (short) 100 };
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) 0, intArray18);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) 1, intArray18);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) 0, intArray18);
        ds.AvaliaMultMatrizes.multmatrize(0, intArray18);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) 0, intArray18);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) -1, intArray18);
        ds.AvaliaMultMatrizes.multmatrize((-1), intArray18);
        ds.AvaliaMultMatrizes.multmatrize((-1), intArray18);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) -1, intArray18);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) 1, intArray18);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) 0, intArray18);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) 0, intArray18);
        java.lang.Class<?> wildcardClass31 = intArray18.getClass();
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray18), "[0, 1, 1, 0, 100, 100]");
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test1680() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1680");
        int[] intArray16 = new int[] { 0, 1, (byte) 1, (short) 0, 100, (short) 100 };
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) 0, intArray16);
        ds.AvaliaMultMatrizes.multmatrize(1, intArray16);
        ds.AvaliaMultMatrizes.multmatrize(1, intArray16);
        ds.AvaliaMultMatrizes.multmatrize(0, intArray16);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) -1, intArray16);
        ds.AvaliaMultMatrizes.multmatrize(0, intArray16);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) 1, intArray16);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) -1, intArray16);
        ds.AvaliaMultMatrizes.multmatrize(1, intArray16);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) 0, intArray16);
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray16), "[0, 1, 1, 0, 100, 100]");
    }

    @Test
    public void test1681() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1681");
        int[] intArray15 = new int[] { 0, 1, (byte) 1, (short) 0, 100, (short) 100 };
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) 0, intArray15);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) 1, intArray15);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) 0, intArray15);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) -1, intArray15);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) -1, intArray15);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) 1, intArray15);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) -1, intArray15);
        ds.AvaliaMultMatrizes.multmatrize(0, intArray15);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) 0, intArray15);
        java.lang.Class<?> wildcardClass25 = intArray15.getClass();
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[0, 1, 1, 0, 100, 100]");
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test1682() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1682");
        int[] intArray16 = new int[] { 0, 1, (byte) 1, (short) 0, 100, (short) 100 };
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) 0, intArray16);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) 1, intArray16);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) 0, intArray16);
        ds.AvaliaMultMatrizes.multmatrize(0, intArray16);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) 0, intArray16);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) -1, intArray16);
        ds.AvaliaMultMatrizes.multmatrize(0, intArray16);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) -1, intArray16);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) 1, intArray16);
        // The following exception was thrown during execution in test generation
        try {
            ds.AvaliaMultMatrizes.multmatrize((int) '#', intArray16);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray16), "[0, 1, 1, 0, 100, 100]");
    }

    @Test
    public void test1683() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1683");
        int[] intArray13 = new int[] { 0, 1, (byte) 1, (short) 0, 100, (short) 100 };
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) 0, intArray13);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) -1, intArray13);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) -1, intArray13);
        ds.AvaliaMultMatrizes.multmatrize(0, intArray13);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) 1, intArray13);
        ds.AvaliaMultMatrizes.multmatrize(0, intArray13);
        // The following exception was thrown during execution in test generation
        try {
            ds.AvaliaMultMatrizes.multmatrize((int) (byte) 10, intArray13);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[0, 1, 1, 0, 100, 100]");
    }

    @Test
    public void test1684() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1684");
        int[] intArray15 = new int[] { 0, 1, (byte) 1, (short) 0, 100, (short) 100 };
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) 0, intArray15);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) 1, intArray15);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) 0, intArray15);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) -1, intArray15);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) -1, intArray15);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) 0, intArray15);
        ds.AvaliaMultMatrizes.multmatrize(0, intArray15);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) -1, intArray15);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) -1, intArray15);
        java.lang.Class<?> wildcardClass25 = intArray15.getClass();
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[0, 1, 1, 0, 100, 100]");
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test1685() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1685");
        int[] intArray16 = new int[] { 0, 1, (byte) 1, (short) 0, 100, (short) 100 };
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) 0, intArray16);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) 1, intArray16);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) 0, intArray16);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) -1, intArray16);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) -1, intArray16);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) 1, intArray16);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) -1, intArray16);
        ds.AvaliaMultMatrizes.multmatrize((-1), intArray16);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) 1, intArray16);
        // The following exception was thrown during execution in test generation
        try {
            ds.AvaliaMultMatrizes.multmatrize((int) ' ', intArray16);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray16), "[0, 1, 1, 0, 100, 100]");
    }

    @Test
    public void test1686() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1686");
        int[] intArray16 = new int[] { 0, 1, (byte) 1, (short) 0, 100, (short) 100 };
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) 0, intArray16);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) 1, intArray16);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) 0, intArray16);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) -1, intArray16);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) -1, intArray16);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) 0, intArray16);
        ds.AvaliaMultMatrizes.multmatrize(1, intArray16);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) 1, intArray16);
        ds.AvaliaMultMatrizes.multmatrize(0, intArray16);
        // The following exception was thrown during execution in test generation
        try {
            ds.AvaliaMultMatrizes.multmatrize((int) (byte) 100, intArray16);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray16), "[0, 1, 1, 0, 100, 100]");
    }

    @Test
    public void test1687() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1687");
        int[] intArray14 = new int[] { 0, 1, (byte) 1, (short) 0, 100, (short) 100 };
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) 0, intArray14);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) 0, intArray14);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) -1, intArray14);
        ds.AvaliaMultMatrizes.multmatrize(0, intArray14);
        ds.AvaliaMultMatrizes.multmatrize(0, intArray14);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) -1, intArray14);
        ds.AvaliaMultMatrizes.multmatrize(0, intArray14);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) 1, intArray14);
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[0, 1, 1, 0, 100, 100]");
    }
}

