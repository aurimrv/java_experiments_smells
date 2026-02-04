package ds.seed6733;

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
        int[] intArray11 = new int[] { (-1) };
        ds.AvaliaMultMatrizes.multmatrize((-1), intArray11);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) -1, intArray11);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) -1, intArray11);
        ds.AvaliaMultMatrizes.multmatrize(0, intArray11);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) -1, intArray11);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) 1, intArray11);
        ds.AvaliaMultMatrizes.multmatrize((-1), intArray11);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) 1, intArray11);
        ds.AvaliaMultMatrizes.multmatrize(0, intArray11);
        // The following exception was thrown during execution in test generation
        try {
            ds.AvaliaMultMatrizes.multmatrize((int) (short) 10, intArray11);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[-1]");
    }

    @Test
    public void test1502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1502");
        int[] intArray12 = new int[] { (short) 1 };
        ds.AvaliaMultMatrizes.multmatrize((int) (short) -1, intArray12);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) 1, intArray12);
        ds.AvaliaMultMatrizes.multmatrize(0, intArray12);
        ds.AvaliaMultMatrizes.multmatrize((-1), intArray12);
        ds.AvaliaMultMatrizes.multmatrize(0, intArray12);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) -1, intArray12);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) 1, intArray12);
        ds.AvaliaMultMatrizes.multmatrize(0, intArray12);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) -1, intArray12);
        ds.AvaliaMultMatrizes.multmatrize(1, intArray12);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) -1, intArray12);
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[1]");
    }

    @Test
    public void test1503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1503");
        int[] intArray13 = new int[] { (short) 1 };
        ds.AvaliaMultMatrizes.multmatrize((int) (short) -1, intArray13);
        ds.AvaliaMultMatrizes.multmatrize(0, intArray13);
        ds.AvaliaMultMatrizes.multmatrize(0, intArray13);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) -1, intArray13);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) 0, intArray13);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) 1, intArray13);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) -1, intArray13);
        ds.AvaliaMultMatrizes.multmatrize((-1), intArray13);
        ds.AvaliaMultMatrizes.multmatrize(0, intArray13);
        ds.AvaliaMultMatrizes.multmatrize(1, intArray13);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) -1, intArray13);
        // The following exception was thrown during execution in test generation
        try {
            ds.AvaliaMultMatrizes.multmatrize((int) (byte) 100, intArray13);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[1]");
    }

    @Test
    public void test1504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1504");
        int[] intArray2 = new int[] { (short) 1 };
        ds.AvaliaMultMatrizes.multmatrize(1, intArray2);
        java.lang.Class<?> wildcardClass4 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[1]");
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test1505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1505");
        int[] intArray16 = new int[] { (-1), 1, 0, '#', 100, (short) -1 };
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) -1, intArray16);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) 0, intArray16);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) 0, intArray16);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) -1, intArray16);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) 1, intArray16);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) 0, intArray16);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) 1, intArray16);
        ds.AvaliaMultMatrizes.multmatrize((-1), intArray16);
        ds.AvaliaMultMatrizes.multmatrize(0, intArray16);
        // The following exception was thrown during execution in test generation
        try {
            ds.AvaliaMultMatrizes.multmatrize(10, intArray16);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray16), "[-1, 1, 0, 35, 100, -1]");
    }

    @Test
    public void test1506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1506");
        int[] intArray13 = new int[] { (short) 1 };
        ds.AvaliaMultMatrizes.multmatrize((int) (short) -1, intArray13);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) 1, intArray13);
        ds.AvaliaMultMatrizes.multmatrize(0, intArray13);
        ds.AvaliaMultMatrizes.multmatrize((-1), intArray13);
        ds.AvaliaMultMatrizes.multmatrize(0, intArray13);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) -1, intArray13);
        ds.AvaliaMultMatrizes.multmatrize(0, intArray13);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) 1, intArray13);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) 1, intArray13);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) -1, intArray13);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) -1, intArray13);
        ds.AvaliaMultMatrizes.multmatrize(1, intArray13);
        java.lang.Class<?> wildcardClass26 = intArray13.getClass();
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[1]");
        org.junit.Assert.assertNotNull(wildcardClass26);
    }

    @Test
    public void test1507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1507");
        int[] intArray13 = new int[] { (short) 1 };
        ds.AvaliaMultMatrizes.multmatrize((int) (short) -1, intArray13);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) 1, intArray13);
        ds.AvaliaMultMatrizes.multmatrize(0, intArray13);
        ds.AvaliaMultMatrizes.multmatrize((-1), intArray13);
        ds.AvaliaMultMatrizes.multmatrize(0, intArray13);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) -1, intArray13);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) 1, intArray13);
        ds.AvaliaMultMatrizes.multmatrize(0, intArray13);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) -1, intArray13);
        ds.AvaliaMultMatrizes.multmatrize(1, intArray13);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) 0, intArray13);
        // The following exception was thrown during execution in test generation
        try {
            ds.AvaliaMultMatrizes.multmatrize((int) (short) 100, intArray13);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[1]");
    }

    @Test
    public void test1508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1508");
        int[] intArray11 = new int[] { (-1) };
        ds.AvaliaMultMatrizes.multmatrize((-1), intArray11);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) -1, intArray11);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) -1, intArray11);
        ds.AvaliaMultMatrizes.multmatrize(0, intArray11);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) -1, intArray11);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) 1, intArray11);
        ds.AvaliaMultMatrizes.multmatrize((-1), intArray11);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) 1, intArray11);
        ds.AvaliaMultMatrizes.multmatrize(0, intArray11);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) -1, intArray11);
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[-1]");
    }

    @Test
    public void test1509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1509");
        int[] intArray13 = new int[] { (short) 1 };
        ds.AvaliaMultMatrizes.multmatrize((int) (short) -1, intArray13);
        ds.AvaliaMultMatrizes.multmatrize(0, intArray13);
        ds.AvaliaMultMatrizes.multmatrize(0, intArray13);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) -1, intArray13);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) 0, intArray13);
        ds.AvaliaMultMatrizes.multmatrize(0, intArray13);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) 0, intArray13);
        ds.AvaliaMultMatrizes.multmatrize((-1), intArray13);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) 1, intArray13);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) -1, intArray13);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) 0, intArray13);
        // The following exception was thrown during execution in test generation
        try {
            ds.AvaliaMultMatrizes.multmatrize((int) (short) 10, intArray13);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[1]");
    }

    @Test
    public void test1510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1510");
        int[] intArray11 = new int[] { (short) 1 };
        ds.AvaliaMultMatrizes.multmatrize((int) (short) -1, intArray11);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) 1, intArray11);
        ds.AvaliaMultMatrizes.multmatrize(0, intArray11);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) 1, intArray11);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) 0, intArray11);
        ds.AvaliaMultMatrizes.multmatrize(1, intArray11);
        ds.AvaliaMultMatrizes.multmatrize(0, intArray11);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) 0, intArray11);
        ds.AvaliaMultMatrizes.multmatrize((-1), intArray11);
        // The following exception was thrown during execution in test generation
        try {
            ds.AvaliaMultMatrizes.multmatrize((int) (byte) 10, intArray11);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[1]");
    }

    @Test
    public void test1511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1511");
        int[] intArray10 = new int[] { (short) 1 };
        ds.AvaliaMultMatrizes.multmatrize((int) (short) -1, intArray10);
        ds.AvaliaMultMatrizes.multmatrize(0, intArray10);
        ds.AvaliaMultMatrizes.multmatrize(0, intArray10);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) -1, intArray10);
        ds.AvaliaMultMatrizes.multmatrize(0, intArray10);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) -1, intArray10);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) -1, intArray10);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) 1, intArray10);
        ds.AvaliaMultMatrizes.multmatrize(0, intArray10);
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[1]");
    }

    @Test
    public void test1512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1512");
        int[] intArray9 = new int[] { (byte) 10, (short) 1, (short) 1, (short) 10 };
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) -1, intArray9);
        ds.AvaliaMultMatrizes.multmatrize((-1), intArray9);
        ds.AvaliaMultMatrizes.multmatrize(1, intArray9);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) -1, intArray9);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) 0, intArray9);
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[10, 1, 1, 10]");
    }

    @Test
    public void test1513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1513");
        int[] intArray13 = new int[] { (short) 1 };
        ds.AvaliaMultMatrizes.multmatrize((int) (short) -1, intArray13);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) 1, intArray13);
        ds.AvaliaMultMatrizes.multmatrize(0, intArray13);
        ds.AvaliaMultMatrizes.multmatrize((-1), intArray13);
        ds.AvaliaMultMatrizes.multmatrize(0, intArray13);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) -1, intArray13);
        ds.AvaliaMultMatrizes.multmatrize(0, intArray13);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) 1, intArray13);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) 1, intArray13);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) -1, intArray13);
        ds.AvaliaMultMatrizes.multmatrize(0, intArray13);
        // The following exception was thrown during execution in test generation
        try {
            ds.AvaliaMultMatrizes.multmatrize((int) ' ', intArray13);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[1]");
    }

    @Test
    public void test1514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1514");
        int[] intArray8 = new int[] { (short) 1 };
        ds.AvaliaMultMatrizes.multmatrize((int) (short) -1, intArray8);
        ds.AvaliaMultMatrizes.multmatrize(0, intArray8);
        ds.AvaliaMultMatrizes.multmatrize(0, intArray8);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) 1, intArray8);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) 0, intArray8);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) -1, intArray8);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) 1, intArray8);
        java.lang.Class<?> wildcardClass16 = intArray8.getClass();
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[1]");
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test1515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1515");
        int[] intArray10 = new int[] { (short) 1 };
        ds.AvaliaMultMatrizes.multmatrize((int) (short) -1, intArray10);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) 1, intArray10);
        ds.AvaliaMultMatrizes.multmatrize(0, intArray10);
        ds.AvaliaMultMatrizes.multmatrize((-1), intArray10);
        ds.AvaliaMultMatrizes.multmatrize(0, intArray10);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) -1, intArray10);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) 1, intArray10);
        ds.AvaliaMultMatrizes.multmatrize(0, intArray10);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) 1, intArray10);
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[1]");
    }

    @Test
    public void test1516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1516");
        int[] intArray8 = new int[] { (short) 1 };
        ds.AvaliaMultMatrizes.multmatrize((int) (short) -1, intArray8);
        ds.AvaliaMultMatrizes.multmatrize(0, intArray8);
        ds.AvaliaMultMatrizes.multmatrize(0, intArray8);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) -1, intArray8);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) -1, intArray8);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) 0, intArray8);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) -1, intArray8);
        java.lang.Class<?> wildcardClass16 = intArray8.getClass();
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[1]");
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test1517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1517");
        int[] intArray10 = new int[] { (-1) };
        ds.AvaliaMultMatrizes.multmatrize((-1), intArray10);
        ds.AvaliaMultMatrizes.multmatrize(1, intArray10);
        ds.AvaliaMultMatrizes.multmatrize((-1), intArray10);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) 0, intArray10);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) -1, intArray10);
        ds.AvaliaMultMatrizes.multmatrize(0, intArray10);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) 0, intArray10);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) 0, intArray10);
        // The following exception was thrown during execution in test generation
        try {
            ds.AvaliaMultMatrizes.multmatrize((int) ' ', intArray10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[-1]");
    }

    @Test
    public void test1518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1518");
        int[] intArray12 = new int[] { (short) 1 };
        ds.AvaliaMultMatrizes.multmatrize((int) (short) -1, intArray12);
        ds.AvaliaMultMatrizes.multmatrize(0, intArray12);
        ds.AvaliaMultMatrizes.multmatrize(0, intArray12);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) -1, intArray12);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) 0, intArray12);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) -1, intArray12);
        ds.AvaliaMultMatrizes.multmatrize((-1), intArray12);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) 0, intArray12);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) 1, intArray12);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) -1, intArray12);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) 1, intArray12);
        java.lang.Class<?> wildcardClass24 = intArray12.getClass();
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[1]");
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test1519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1519");
        int[] intArray14 = new int[] { (short) 1 };
        ds.AvaliaMultMatrizes.multmatrize((int) (short) -1, intArray14);
        ds.AvaliaMultMatrizes.multmatrize(0, intArray14);
        ds.AvaliaMultMatrizes.multmatrize(0, intArray14);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) -1, intArray14);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) 0, intArray14);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) 1, intArray14);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) 0, intArray14);
        ds.AvaliaMultMatrizes.multmatrize(0, intArray14);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) 0, intArray14);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) 1, intArray14);
        ds.AvaliaMultMatrizes.multmatrize(0, intArray14);
        ds.AvaliaMultMatrizes.multmatrize((-1), intArray14);
        // The following exception was thrown during execution in test generation
        try {
            ds.AvaliaMultMatrizes.multmatrize((int) (byte) 10, intArray14);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[1]");
    }

    @Test
    public void test1520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1520");
        int[] intArray8 = new int[] { (short) 1 };
        ds.AvaliaMultMatrizes.multmatrize((int) (short) -1, intArray8);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) 1, intArray8);
        ds.AvaliaMultMatrizes.multmatrize(0, intArray8);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) 1, intArray8);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) -1, intArray8);
        ds.AvaliaMultMatrizes.multmatrize(0, intArray8);
        // The following exception was thrown during execution in test generation
        try {
            ds.AvaliaMultMatrizes.multmatrize(100, intArray8);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[1]");
    }

    @Test
    public void test1521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1521");
        int[] intArray13 = new int[] { (short) 1 };
        ds.AvaliaMultMatrizes.multmatrize((int) (short) -1, intArray13);
        ds.AvaliaMultMatrizes.multmatrize(0, intArray13);
        ds.AvaliaMultMatrizes.multmatrize(0, intArray13);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) 1, intArray13);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) 0, intArray13);
        ds.AvaliaMultMatrizes.multmatrize((-1), intArray13);
        ds.AvaliaMultMatrizes.multmatrize((-1), intArray13);
        ds.AvaliaMultMatrizes.multmatrize(0, intArray13);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) 1, intArray13);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) 0, intArray13);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) -1, intArray13);
        // The following exception was thrown during execution in test generation
        try {
            ds.AvaliaMultMatrizes.multmatrize((int) ' ', intArray13);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[1]");
    }

    @Test
    public void test1522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1522");
        int[] intArray12 = new int[] { (short) 1 };
        ds.AvaliaMultMatrizes.multmatrize((int) (short) -1, intArray12);
        ds.AvaliaMultMatrizes.multmatrize(0, intArray12);
        ds.AvaliaMultMatrizes.multmatrize(0, intArray12);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) -1, intArray12);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) 0, intArray12);
        ds.AvaliaMultMatrizes.multmatrize(0, intArray12);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) 1, intArray12);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) 1, intArray12);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) -1, intArray12);
        ds.AvaliaMultMatrizes.multmatrize(0, intArray12);
        ds.AvaliaMultMatrizes.multmatrize(0, intArray12);
        java.lang.Class<?> wildcardClass24 = intArray12.getClass();
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[1]");
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test1523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1523");
        int[] intArray11 = new int[] { (-1), 1, 0, '#', 100, (short) -1 };
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) -1, intArray11);
        ds.AvaliaMultMatrizes.multmatrize(1, intArray11);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) -1, intArray11);
        ds.AvaliaMultMatrizes.multmatrize((-1), intArray11);
        // The following exception was thrown during execution in test generation
        try {
            ds.AvaliaMultMatrizes.multmatrize((int) '4', intArray11);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[-1, 1, 0, 35, 100, -1]");
    }

    @Test
    public void test1524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1524");
        int[] intArray10 = new int[] { (short) 1 };
        ds.AvaliaMultMatrizes.multmatrize((int) (short) -1, intArray10);
        ds.AvaliaMultMatrizes.multmatrize(0, intArray10);
        ds.AvaliaMultMatrizes.multmatrize(0, intArray10);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) -1, intArray10);
        ds.AvaliaMultMatrizes.multmatrize(0, intArray10);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) -1, intArray10);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) -1, intArray10);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) -1, intArray10);
        // The following exception was thrown during execution in test generation
        try {
            ds.AvaliaMultMatrizes.multmatrize((int) ' ', intArray10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[1]");
    }

    @Test
    public void test1525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1525");
        int[] intArray14 = new int[] { (-1), 1, 0, '#', 100, (short) -1 };
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) -1, intArray14);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) 0, intArray14);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) 0, intArray14);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) -1, intArray14);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) 1, intArray14);
        ds.AvaliaMultMatrizes.multmatrize(0, intArray14);
        ds.AvaliaMultMatrizes.multmatrize(0, intArray14);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) 1, intArray14);
        java.lang.Class<?> wildcardClass23 = intArray14.getClass();
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[-1, 1, 0, 35, 100, -1]");
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test1526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1526");
        int[] intArray9 = new int[] { (short) 1 };
        ds.AvaliaMultMatrizes.multmatrize((int) (short) -1, intArray9);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) 1, intArray9);
        ds.AvaliaMultMatrizes.multmatrize(0, intArray9);
        ds.AvaliaMultMatrizes.multmatrize((-1), intArray9);
        ds.AvaliaMultMatrizes.multmatrize(0, intArray9);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) -1, intArray9);
        ds.AvaliaMultMatrizes.multmatrize((-1), intArray9);
        // The following exception was thrown during execution in test generation
        try {
            ds.AvaliaMultMatrizes.multmatrize(10, intArray9);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[1]");
    }

    @Test
    public void test1527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1527");
        int[] intArray9 = new int[] { (short) 1 };
        ds.AvaliaMultMatrizes.multmatrize((int) (short) -1, intArray9);
        ds.AvaliaMultMatrizes.multmatrize(0, intArray9);
        ds.AvaliaMultMatrizes.multmatrize(0, intArray9);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) -1, intArray9);
        ds.AvaliaMultMatrizes.multmatrize(1, intArray9);
        ds.AvaliaMultMatrizes.multmatrize(1, intArray9);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) -1, intArray9);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) 0, intArray9);
        java.lang.Class<?> wildcardClass18 = intArray9.getClass();
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[1]");
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test1528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1528");
        int[] intArray10 = new int[] { (short) 1 };
        ds.AvaliaMultMatrizes.multmatrize((int) (short) -1, intArray10);
        ds.AvaliaMultMatrizes.multmatrize(0, intArray10);
        ds.AvaliaMultMatrizes.multmatrize(0, intArray10);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) -1, intArray10);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) 0, intArray10);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) 1, intArray10);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) -1, intArray10);
        ds.AvaliaMultMatrizes.multmatrize((-1), intArray10);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) 0, intArray10);
        java.lang.Class<?> wildcardClass20 = intArray10.getClass();
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[1]");
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test1529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1529");
        int[] intArray9 = new int[] { (short) 1 };
        ds.AvaliaMultMatrizes.multmatrize((int) (short) -1, intArray9);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) 0, intArray9);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) -1, intArray9);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) -1, intArray9);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) 0, intArray9);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) 1, intArray9);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) 1, intArray9);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) -1, intArray9);
        java.lang.Class<?> wildcardClass18 = intArray9.getClass();
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[1]");
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test1530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1530");
        int[] intArray15 = new int[] { (-1), 1, 0, '#', 100, (short) -1 };
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) -1, intArray15);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) 0, intArray15);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) 0, intArray15);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) -1, intArray15);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) 1, intArray15);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) 0, intArray15);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) 0, intArray15);
        ds.AvaliaMultMatrizes.multmatrize(0, intArray15);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) 1, intArray15);
        java.lang.Class<?> wildcardClass25 = intArray15.getClass();
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[-1, 1, 0, 35, 100, -1]");
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test1531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1531");
        int[] intArray10 = new int[] { (byte) 10, (short) 1, (short) 1, (short) 10 };
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) -1, intArray10);
        ds.AvaliaMultMatrizes.multmatrize((-1), intArray10);
        ds.AvaliaMultMatrizes.multmatrize(1, intArray10);
        ds.AvaliaMultMatrizes.multmatrize(0, intArray10);
        ds.AvaliaMultMatrizes.multmatrize(1, intArray10);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) 0, intArray10);
        java.lang.Class<?> wildcardClass17 = intArray10.getClass();
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[10, 1, 1, 10]");
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test1532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1532");
        int[] intArray11 = new int[] { (-1) };
        ds.AvaliaMultMatrizes.multmatrize((-1), intArray11);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) -1, intArray11);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) -1, intArray11);
        ds.AvaliaMultMatrizes.multmatrize(0, intArray11);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) -1, intArray11);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) 1, intArray11);
        ds.AvaliaMultMatrizes.multmatrize((-1), intArray11);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) 1, intArray11);
        ds.AvaliaMultMatrizes.multmatrize(0, intArray11);
        // The following exception was thrown during execution in test generation
        try {
            ds.AvaliaMultMatrizes.multmatrize((int) ' ', intArray11);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[-1]");
    }

    @Test
    public void test1533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1533");
        int[] intArray9 = new int[] { (-1) };
        ds.AvaliaMultMatrizes.multmatrize((-1), intArray9);
        ds.AvaliaMultMatrizes.multmatrize(1, intArray9);
        ds.AvaliaMultMatrizes.multmatrize((-1), intArray9);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) 0, intArray9);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) -1, intArray9);
        ds.AvaliaMultMatrizes.multmatrize(1, intArray9);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) -1, intArray9);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) 1, intArray9);
        java.lang.Class<?> wildcardClass18 = intArray9.getClass();
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[-1]");
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test1534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1534");
        int[] intArray8 = new int[] { (short) 1 };
        ds.AvaliaMultMatrizes.multmatrize((int) (short) -1, intArray8);
        ds.AvaliaMultMatrizes.multmatrize(0, intArray8);
        ds.AvaliaMultMatrizes.multmatrize(0, intArray8);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) 1, intArray8);
        ds.AvaliaMultMatrizes.multmatrize(0, intArray8);
        ds.AvaliaMultMatrizes.multmatrize(0, intArray8);
        // The following exception was thrown during execution in test generation
        try {
            ds.AvaliaMultMatrizes.multmatrize(100, intArray8);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[1]");
    }

    @Test
    public void test1535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1535");
        int[] intArray10 = new int[] { (short) 1 };
        ds.AvaliaMultMatrizes.multmatrize((int) (short) -1, intArray10);
        ds.AvaliaMultMatrizes.multmatrize(0, intArray10);
        ds.AvaliaMultMatrizes.multmatrize(0, intArray10);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) -1, intArray10);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) 1, intArray10);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) 0, intArray10);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) 1, intArray10);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) 1, intArray10);
        ds.AvaliaMultMatrizes.multmatrize((-1), intArray10);
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[1]");
    }

    @Test
    public void test1536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1536");
        int[] intArray11 = new int[] { (short) 1 };
        ds.AvaliaMultMatrizes.multmatrize((int) (short) -1, intArray11);
        ds.AvaliaMultMatrizes.multmatrize(0, intArray11);
        ds.AvaliaMultMatrizes.multmatrize(0, intArray11);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) 1, intArray11);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) 0, intArray11);
        ds.AvaliaMultMatrizes.multmatrize((-1), intArray11);
        ds.AvaliaMultMatrizes.multmatrize((-1), intArray11);
        ds.AvaliaMultMatrizes.multmatrize(0, intArray11);
        ds.AvaliaMultMatrizes.multmatrize(1, intArray11);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) 0, intArray11);
        java.lang.Class<?> wildcardClass22 = intArray11.getClass();
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[1]");
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test1537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1537");
        int[] intArray9 = new int[] { (short) 1 };
        ds.AvaliaMultMatrizes.multmatrize((int) (short) -1, intArray9);
        ds.AvaliaMultMatrizes.multmatrize(0, intArray9);
        ds.AvaliaMultMatrizes.multmatrize(0, intArray9);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) -1, intArray9);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) 0, intArray9);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) 1, intArray9);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) 1, intArray9);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) -1, intArray9);
        java.lang.Class<?> wildcardClass18 = intArray9.getClass();
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[1]");
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test1538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1538");
        int[] intArray11 = new int[] { (short) 1 };
        ds.AvaliaMultMatrizes.multmatrize((int) (short) -1, intArray11);
        ds.AvaliaMultMatrizes.multmatrize(0, intArray11);
        ds.AvaliaMultMatrizes.multmatrize(0, intArray11);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) -1, intArray11);
        ds.AvaliaMultMatrizes.multmatrize(0, intArray11);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) -1, intArray11);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) -1, intArray11);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) -1, intArray11);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) 1, intArray11);
        ds.AvaliaMultMatrizes.multmatrize((-1), intArray11);
        java.lang.Class<?> wildcardClass22 = intArray11.getClass();
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[1]");
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test1539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1539");
        int[] intArray9 = new int[] { (short) 1 };
        ds.AvaliaMultMatrizes.multmatrize((int) (short) -1, intArray9);
        ds.AvaliaMultMatrizes.multmatrize(0, intArray9);
        ds.AvaliaMultMatrizes.multmatrize(0, intArray9);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) 1, intArray9);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) 0, intArray9);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) -1, intArray9);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) 1, intArray9);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) 0, intArray9);
        java.lang.Class<?> wildcardClass18 = intArray9.getClass();
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[1]");
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test1540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1540");
        int[] intArray13 = new int[] { (-1), 1, 0, '#', 100, (short) -1 };
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) -1, intArray13);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) 0, intArray13);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) 0, intArray13);
        ds.AvaliaMultMatrizes.multmatrize((-1), intArray13);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) -1, intArray13);
        ds.AvaliaMultMatrizes.multmatrize(1, intArray13);
        ds.AvaliaMultMatrizes.multmatrize((-1), intArray13);
        java.lang.Class<?> wildcardClass21 = intArray13.getClass();
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[-1, 1, 0, 35, 100, -1]");
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test1541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1541");
        int[] intArray14 = new int[] { (-1), 1, 0, '#', 100, (short) -1 };
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) -1, intArray14);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) 0, intArray14);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) 0, intArray14);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) -1, intArray14);
        ds.AvaliaMultMatrizes.multmatrize(1, intArray14);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) -1, intArray14);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) 0, intArray14);
        // The following exception was thrown during execution in test generation
        try {
            ds.AvaliaMultMatrizes.multmatrize((int) (short) 10, intArray14);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[-1, 1, 0, 35, 100, -1]");
    }

    @Test
    public void test1542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1542");
        int[] intArray15 = new int[] { (-1), 1, 0, '#', 100, (short) -1 };
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) -1, intArray15);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) 0, intArray15);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) 0, intArray15);
        ds.AvaliaMultMatrizes.multmatrize(0, intArray15);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) -1, intArray15);
        ds.AvaliaMultMatrizes.multmatrize(1, intArray15);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) 1, intArray15);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) -1, intArray15);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) 0, intArray15);
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[-1, 1, 0, 35, 100, -1]");
    }

    @Test
    public void test1543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1543");
        int[] intArray5 = new int[] { (-1) };
        ds.AvaliaMultMatrizes.multmatrize((-1), intArray5);
        ds.AvaliaMultMatrizes.multmatrize(1, intArray5);
        ds.AvaliaMultMatrizes.multmatrize((-1), intArray5);
        // The following exception was thrown during execution in test generation
        try {
            ds.AvaliaMultMatrizes.multmatrize((int) ' ', intArray5);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[-1]");
    }

    @Test
    public void test1544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1544");
        int[] intArray8 = new int[] { (short) 1 };
        ds.AvaliaMultMatrizes.multmatrize((int) (short) -1, intArray8);
        ds.AvaliaMultMatrizes.multmatrize(0, intArray8);
        ds.AvaliaMultMatrizes.multmatrize(0, intArray8);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) 1, intArray8);
        ds.AvaliaMultMatrizes.multmatrize(0, intArray8);
        ds.AvaliaMultMatrizes.multmatrize(1, intArray8);
        // The following exception was thrown during execution in test generation
        try {
            ds.AvaliaMultMatrizes.multmatrize((int) (byte) 10, intArray8);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[1]");
    }

    @Test
    public void test1545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1545");
        int[] intArray9 = new int[] { (short) 1 };
        ds.AvaliaMultMatrizes.multmatrize((int) (short) -1, intArray9);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) 1, intArray9);
        ds.AvaliaMultMatrizes.multmatrize(0, intArray9);
        ds.AvaliaMultMatrizes.multmatrize((-1), intArray9);
        ds.AvaliaMultMatrizes.multmatrize(0, intArray9);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) -1, intArray9);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) 0, intArray9);
        ds.AvaliaMultMatrizes.multmatrize(0, intArray9);
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[1]");
    }

    @Test
    public void test1546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1546");
        int[] intArray8 = new int[] { (short) 1 };
        ds.AvaliaMultMatrizes.multmatrize((int) (short) -1, intArray8);
        ds.AvaliaMultMatrizes.multmatrize(0, intArray8);
        ds.AvaliaMultMatrizes.multmatrize(0, intArray8);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) 1, intArray8);
        ds.AvaliaMultMatrizes.multmatrize(0, intArray8);
        ds.AvaliaMultMatrizes.multmatrize(1, intArray8);
        // The following exception was thrown during execution in test generation
        try {
            ds.AvaliaMultMatrizes.multmatrize(10, intArray8);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[1]");
    }

    @Test
    public void test1547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1547");
        int[] intArray11 = new int[] { (short) 1 };
        ds.AvaliaMultMatrizes.multmatrize((int) (short) -1, intArray11);
        ds.AvaliaMultMatrizes.multmatrize(0, intArray11);
        ds.AvaliaMultMatrizes.multmatrize(0, intArray11);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) -1, intArray11);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) 0, intArray11);
        ds.AvaliaMultMatrizes.multmatrize(0, intArray11);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) 0, intArray11);
        ds.AvaliaMultMatrizes.multmatrize((-1), intArray11);
        ds.AvaliaMultMatrizes.multmatrize(0, intArray11);
        // The following exception was thrown during execution in test generation
        try {
            ds.AvaliaMultMatrizes.multmatrize((int) (short) 10, intArray11);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[1]");
    }

    @Test
    public void test1548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1548");
        int[] intArray10 = new int[] { (short) 1 };
        ds.AvaliaMultMatrizes.multmatrize((int) (short) -1, intArray10);
        ds.AvaliaMultMatrizes.multmatrize(0, intArray10);
        ds.AvaliaMultMatrizes.multmatrize(0, intArray10);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) -1, intArray10);
        ds.AvaliaMultMatrizes.multmatrize(0, intArray10);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) -1, intArray10);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) -1, intArray10);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) -1, intArray10);
        // The following exception was thrown during execution in test generation
        try {
            ds.AvaliaMultMatrizes.multmatrize(100, intArray10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[1]");
    }

    @Test
    public void test1549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1549");
        int[] intArray12 = new int[] { (short) 1 };
        ds.AvaliaMultMatrizes.multmatrize((int) (short) -1, intArray12);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) 1, intArray12);
        ds.AvaliaMultMatrizes.multmatrize(0, intArray12);
        ds.AvaliaMultMatrizes.multmatrize((-1), intArray12);
        ds.AvaliaMultMatrizes.multmatrize(0, intArray12);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) -1, intArray12);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) -1, intArray12);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) 0, intArray12);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) 1, intArray12);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) -1, intArray12);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) 0, intArray12);
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[1]");
    }

    @Test
    public void test1550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1550");
        int[] intArray14 = new int[] { (-1), 1, 0, '#', 100, (short) -1 };
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) -1, intArray14);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) 0, intArray14);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) 0, intArray14);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) -1, intArray14);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) 1, intArray14);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) 0, intArray14);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) -1, intArray14);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) 0, intArray14);
        java.lang.Class<?> wildcardClass23 = intArray14.getClass();
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[-1, 1, 0, 35, 100, -1]");
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test1551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1551");
        int[] intArray10 = new int[] { (-1) };
        ds.AvaliaMultMatrizes.multmatrize((-1), intArray10);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) -1, intArray10);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) -1, intArray10);
        ds.AvaliaMultMatrizes.multmatrize(0, intArray10);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) -1, intArray10);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) 1, intArray10);
        ds.AvaliaMultMatrizes.multmatrize((-1), intArray10);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) 1, intArray10);
        ds.AvaliaMultMatrizes.multmatrize(0, intArray10);
        java.lang.Class<?> wildcardClass20 = intArray10.getClass();
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[-1]");
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test1552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1552");
        int[] intArray12 = new int[] { (short) 1 };
        ds.AvaliaMultMatrizes.multmatrize((int) (short) -1, intArray12);
        ds.AvaliaMultMatrizes.multmatrize(0, intArray12);
        ds.AvaliaMultMatrizes.multmatrize(0, intArray12);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) -1, intArray12);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) 0, intArray12);
        ds.AvaliaMultMatrizes.multmatrize(0, intArray12);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) 0, intArray12);
        ds.AvaliaMultMatrizes.multmatrize((-1), intArray12);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) 1, intArray12);
        ds.AvaliaMultMatrizes.multmatrize(0, intArray12);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) 1, intArray12);
        java.lang.Class<?> wildcardClass24 = intArray12.getClass();
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[1]");
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test1553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1553");
        int[] intArray6 = new int[] { (short) 1 };
        ds.AvaliaMultMatrizes.multmatrize((int) (short) -1, intArray6);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) 0, intArray6);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) -1, intArray6);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) -1, intArray6);
        // The following exception was thrown during execution in test generation
        try {
            ds.AvaliaMultMatrizes.multmatrize((int) ' ', intArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[1]");
    }

    @Test
    public void test1554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1554");
        int[] intArray13 = new int[] { (short) 1 };
        ds.AvaliaMultMatrizes.multmatrize((int) (short) -1, intArray13);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) 1, intArray13);
        ds.AvaliaMultMatrizes.multmatrize(0, intArray13);
        ds.AvaliaMultMatrizes.multmatrize((-1), intArray13);
        ds.AvaliaMultMatrizes.multmatrize(0, intArray13);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) -1, intArray13);
        ds.AvaliaMultMatrizes.multmatrize(0, intArray13);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) 1, intArray13);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) 1, intArray13);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) -1, intArray13);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) -1, intArray13);
        // The following exception was thrown during execution in test generation
        try {
            ds.AvaliaMultMatrizes.multmatrize((int) ' ', intArray13);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[1]");
    }

    @Test
    public void test1555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1555");
        int[] intArray12 = new int[] { (short) 1 };
        ds.AvaliaMultMatrizes.multmatrize((int) (short) -1, intArray12);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) 1, intArray12);
        ds.AvaliaMultMatrizes.multmatrize(0, intArray12);
        ds.AvaliaMultMatrizes.multmatrize((-1), intArray12);
        ds.AvaliaMultMatrizes.multmatrize(0, intArray12);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) -1, intArray12);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) 1, intArray12);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) -1, intArray12);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) 1, intArray12);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) -1, intArray12);
        ds.AvaliaMultMatrizes.multmatrize(1, intArray12);
        java.lang.Class<?> wildcardClass24 = intArray12.getClass();
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[1]");
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test1556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1556");
        int[] intArray10 = new int[] { (short) 1 };
        ds.AvaliaMultMatrizes.multmatrize((int) (short) -1, intArray10);
        ds.AvaliaMultMatrizes.multmatrize(0, intArray10);
        ds.AvaliaMultMatrizes.multmatrize(0, intArray10);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) -1, intArray10);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) 0, intArray10);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) -1, intArray10);
        ds.AvaliaMultMatrizes.multmatrize((-1), intArray10);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) 0, intArray10);
        ds.AvaliaMultMatrizes.multmatrize((-1), intArray10);
        java.lang.Class<?> wildcardClass20 = intArray10.getClass();
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[1]");
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test1557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1557");
        int[] intArray7 = new int[] { (short) 1 };
        ds.AvaliaMultMatrizes.multmatrize((int) (short) -1, intArray7);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) 1, intArray7);
        ds.AvaliaMultMatrizes.multmatrize(0, intArray7);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) 0, intArray7);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) 0, intArray7);
        // The following exception was thrown during execution in test generation
        try {
            ds.AvaliaMultMatrizes.multmatrize((int) '4', intArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[1]");
    }

    @Test
    public void test1558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1558");
        int[] intArray8 = new int[] { (-1) };
        ds.AvaliaMultMatrizes.multmatrize((-1), intArray8);
        ds.AvaliaMultMatrizes.multmatrize(1, intArray8);
        ds.AvaliaMultMatrizes.multmatrize((-1), intArray8);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) -1, intArray8);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) -1, intArray8);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) 1, intArray8);
        // The following exception was thrown during execution in test generation
        try {
            ds.AvaliaMultMatrizes.multmatrize((int) (short) 10, intArray8);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[-1]");
    }

    @Test
    public void test1559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1559");
        int[] intArray10 = new int[] { (short) 1 };
        ds.AvaliaMultMatrizes.multmatrize((int) (short) -1, intArray10);
        ds.AvaliaMultMatrizes.multmatrize(0, intArray10);
        ds.AvaliaMultMatrizes.multmatrize(0, intArray10);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) -1, intArray10);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) 0, intArray10);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) -1, intArray10);
        ds.AvaliaMultMatrizes.multmatrize((-1), intArray10);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) 1, intArray10);
        // The following exception was thrown during execution in test generation
        try {
            ds.AvaliaMultMatrizes.multmatrize((int) (short) 10, intArray10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[1]");
    }

    @Test
    public void test1560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1560");
        int[] intArray13 = new int[] { (short) 1 };
        ds.AvaliaMultMatrizes.multmatrize((int) (short) -1, intArray13);
        ds.AvaliaMultMatrizes.multmatrize(0, intArray13);
        ds.AvaliaMultMatrizes.multmatrize(0, intArray13);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) -1, intArray13);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) 0, intArray13);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) 1, intArray13);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) -1, intArray13);
        ds.AvaliaMultMatrizes.multmatrize(0, intArray13);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) -1, intArray13);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) 0, intArray13);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) 1, intArray13);
        // The following exception was thrown during execution in test generation
        try {
            ds.AvaliaMultMatrizes.multmatrize((int) (short) 100, intArray13);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[1]");
    }

    @Test
    public void test1561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1561");
        int[] intArray10 = new int[] { (-1) };
        ds.AvaliaMultMatrizes.multmatrize((-1), intArray10);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) -1, intArray10);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) -1, intArray10);
        ds.AvaliaMultMatrizes.multmatrize(0, intArray10);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) -1, intArray10);
        ds.AvaliaMultMatrizes.multmatrize(0, intArray10);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) 0, intArray10);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) 0, intArray10);
        // The following exception was thrown during execution in test generation
        try {
            ds.AvaliaMultMatrizes.multmatrize((int) '#', intArray10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[-1]");
    }

    @Test
    public void test1562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1562");
        int[] intArray10 = new int[] { (short) 1 };
        ds.AvaliaMultMatrizes.multmatrize((int) (short) -1, intArray10);
        ds.AvaliaMultMatrizes.multmatrize(0, intArray10);
        ds.AvaliaMultMatrizes.multmatrize(0, intArray10);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) -1, intArray10);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) 1, intArray10);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) 0, intArray10);
        ds.AvaliaMultMatrizes.multmatrize(0, intArray10);
        ds.AvaliaMultMatrizes.multmatrize(1, intArray10);
        // The following exception was thrown during execution in test generation
        try {
            ds.AvaliaMultMatrizes.multmatrize(100, intArray10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[1]");
    }

    @Test
    public void test1563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1563");
        int[] intArray9 = new int[] { (short) 1 };
        ds.AvaliaMultMatrizes.multmatrize((int) (short) -1, intArray9);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) 1, intArray9);
        ds.AvaliaMultMatrizes.multmatrize(0, intArray9);
        ds.AvaliaMultMatrizes.multmatrize((-1), intArray9);
        ds.AvaliaMultMatrizes.multmatrize(0, intArray9);
        ds.AvaliaMultMatrizes.multmatrize(0, intArray9);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) 1, intArray9);
        // The following exception was thrown during execution in test generation
        try {
            ds.AvaliaMultMatrizes.multmatrize(100, intArray9);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[1]");
    }

    @Test
    public void test1564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1564");
        int[] intArray9 = new int[] { (short) 1 };
        ds.AvaliaMultMatrizes.multmatrize((int) (short) -1, intArray9);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) 1, intArray9);
        ds.AvaliaMultMatrizes.multmatrize(0, intArray9);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) 0, intArray9);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) 0, intArray9);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) 0, intArray9);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) 0, intArray9);
        // The following exception was thrown during execution in test generation
        try {
            ds.AvaliaMultMatrizes.multmatrize(10, intArray9);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[1]");
    }

    @Test
    public void test1565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1565");
        int[] intArray9 = new int[] { (short) 1 };
        ds.AvaliaMultMatrizes.multmatrize((int) (short) -1, intArray9);
        ds.AvaliaMultMatrizes.multmatrize(0, intArray9);
        ds.AvaliaMultMatrizes.multmatrize(0, intArray9);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) -1, intArray9);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) 1, intArray9);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) 0, intArray9);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) 0, intArray9);
        ds.AvaliaMultMatrizes.multmatrize(1, intArray9);
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[1]");
    }

    @Test
    public void test1566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1566");
        int[] intArray11 = new int[] { (short) 1 };
        ds.AvaliaMultMatrizes.multmatrize((int) (short) -1, intArray11);
        ds.AvaliaMultMatrizes.multmatrize(0, intArray11);
        ds.AvaliaMultMatrizes.multmatrize(0, intArray11);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) -1, intArray11);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) 0, intArray11);
        ds.AvaliaMultMatrizes.multmatrize(0, intArray11);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) -1, intArray11);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) 0, intArray11);
        ds.AvaliaMultMatrizes.multmatrize(0, intArray11);
        // The following exception was thrown during execution in test generation
        try {
            ds.AvaliaMultMatrizes.multmatrize(100, intArray11);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[1]");
    }

    @Test
    public void test1567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1567");
        int[] intArray9 = new int[] { (short) 1 };
        ds.AvaliaMultMatrizes.multmatrize((int) (short) -1, intArray9);
        ds.AvaliaMultMatrizes.multmatrize(0, intArray9);
        ds.AvaliaMultMatrizes.multmatrize(0, intArray9);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) -1, intArray9);
        ds.AvaliaMultMatrizes.multmatrize(0, intArray9);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) -1, intArray9);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) -1, intArray9);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) -1, intArray9);
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[1]");
    }

    @Test
    public void test1568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1568");
        int[] intArray12 = new int[] { (byte) 10, (short) 1, (short) 1, (short) 10 };
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) -1, intArray12);
        ds.AvaliaMultMatrizes.multmatrize((-1), intArray12);
        ds.AvaliaMultMatrizes.multmatrize(1, intArray12);
        ds.AvaliaMultMatrizes.multmatrize(0, intArray12);
        ds.AvaliaMultMatrizes.multmatrize(0, intArray12);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) -1, intArray12);
        ds.AvaliaMultMatrizes.multmatrize(1, intArray12);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) -1, intArray12);
        java.lang.Class<?> wildcardClass21 = intArray12.getClass();
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[10, 1, 1, 10]");
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test1569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1569");
        int[] intArray12 = new int[] { (short) 1 };
        ds.AvaliaMultMatrizes.multmatrize((int) (short) -1, intArray12);
        ds.AvaliaMultMatrizes.multmatrize(0, intArray12);
        ds.AvaliaMultMatrizes.multmatrize(0, intArray12);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) 1, intArray12);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) 0, intArray12);
        ds.AvaliaMultMatrizes.multmatrize((-1), intArray12);
        ds.AvaliaMultMatrizes.multmatrize((-1), intArray12);
        ds.AvaliaMultMatrizes.multmatrize(0, intArray12);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) 1, intArray12);
        ds.AvaliaMultMatrizes.multmatrize(0, intArray12);
        // The following exception was thrown during execution in test generation
        try {
            ds.AvaliaMultMatrizes.multmatrize((int) (byte) 100, intArray12);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[1]");
    }

    @Test
    public void test1570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1570");
        int[] intArray8 = new int[] { (short) 1 };
        ds.AvaliaMultMatrizes.multmatrize((int) (short) -1, intArray8);
        ds.AvaliaMultMatrizes.multmatrize(0, intArray8);
        ds.AvaliaMultMatrizes.multmatrize(0, intArray8);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) -1, intArray8);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) 0, intArray8);
        ds.AvaliaMultMatrizes.multmatrize(1, intArray8);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) -1, intArray8);
        java.lang.Class<?> wildcardClass16 = intArray8.getClass();
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[1]");
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test1571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1571");
        int[] intArray10 = new int[] { (short) 1 };
        ds.AvaliaMultMatrizes.multmatrize((int) (short) -1, intArray10);
        ds.AvaliaMultMatrizes.multmatrize(0, intArray10);
        ds.AvaliaMultMatrizes.multmatrize(0, intArray10);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) -1, intArray10);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) 1, intArray10);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) -1, intArray10);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) 1, intArray10);
        ds.AvaliaMultMatrizes.multmatrize(0, intArray10);
        // The following exception was thrown during execution in test generation
        try {
            ds.AvaliaMultMatrizes.multmatrize(10, intArray10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[1]");
    }

    @Test
    public void test1572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1572");
        int[] intArray11 = new int[] { (short) 1 };
        ds.AvaliaMultMatrizes.multmatrize((int) (short) -1, intArray11);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) 1, intArray11);
        ds.AvaliaMultMatrizes.multmatrize(0, intArray11);
        ds.AvaliaMultMatrizes.multmatrize((-1), intArray11);
        ds.AvaliaMultMatrizes.multmatrize(0, intArray11);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) -1, intArray11);
        ds.AvaliaMultMatrizes.multmatrize(1, intArray11);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) -1, intArray11);
        ds.AvaliaMultMatrizes.multmatrize((-1), intArray11);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) 1, intArray11);
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[1]");
    }

    @Test
    public void test1573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1573");
        int[] intArray13 = new int[] { (-1), 1, 0, '#', 100, (short) -1 };
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) -1, intArray13);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) 0, intArray13);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) 0, intArray13);
        ds.AvaliaMultMatrizes.multmatrize((-1), intArray13);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) -1, intArray13);
        ds.AvaliaMultMatrizes.multmatrize(0, intArray13);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) 0, intArray13);
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[-1, 1, 0, 35, 100, -1]");
    }

    @Test
    public void test1574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1574");
        int[] intArray13 = new int[] { (short) 1 };
        ds.AvaliaMultMatrizes.multmatrize((int) (short) -1, intArray13);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) 1, intArray13);
        ds.AvaliaMultMatrizes.multmatrize(0, intArray13);
        ds.AvaliaMultMatrizes.multmatrize((-1), intArray13);
        ds.AvaliaMultMatrizes.multmatrize(0, intArray13);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) -1, intArray13);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) 1, intArray13);
        ds.AvaliaMultMatrizes.multmatrize(0, intArray13);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) -1, intArray13);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) -1, intArray13);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) 1, intArray13);
        // The following exception was thrown during execution in test generation
        try {
            ds.AvaliaMultMatrizes.multmatrize((int) (byte) 100, intArray13);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[1]");
    }

    @Test
    public void test1575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1575");
        int[] intArray13 = new int[] { (-1), 1, 0, '#', 100, (short) -1 };
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) -1, intArray13);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) 0, intArray13);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) 0, intArray13);
        ds.AvaliaMultMatrizes.multmatrize(0, intArray13);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) -1, intArray13);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) 1, intArray13);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) 0, intArray13);
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[-1, 1, 0, 35, 100, -1]");
    }

    @Test
    public void test1576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1576");
        int[] intArray14 = new int[] { (short) 1 };
        ds.AvaliaMultMatrizes.multmatrize((int) (short) -1, intArray14);
        ds.AvaliaMultMatrizes.multmatrize(0, intArray14);
        ds.AvaliaMultMatrizes.multmatrize(0, intArray14);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) -1, intArray14);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) 0, intArray14);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) 1, intArray14);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) 1, intArray14);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) 0, intArray14);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) 1, intArray14);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) -1, intArray14);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) 0, intArray14);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) 1, intArray14);
        // The following exception was thrown during execution in test generation
        try {
            ds.AvaliaMultMatrizes.multmatrize((int) ' ', intArray14);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[1]");
    }

    @Test
    public void test1577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1577");
        int[] intArray13 = new int[] { (short) 1 };
        ds.AvaliaMultMatrizes.multmatrize((int) (short) -1, intArray13);
        ds.AvaliaMultMatrizes.multmatrize(0, intArray13);
        ds.AvaliaMultMatrizes.multmatrize(0, intArray13);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) -1, intArray13);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) 0, intArray13);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) 1, intArray13);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) -1, intArray13);
        ds.AvaliaMultMatrizes.multmatrize(0, intArray13);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) -1, intArray13);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) 0, intArray13);
        ds.AvaliaMultMatrizes.multmatrize((-1), intArray13);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) -1, intArray13);
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[1]");
    }

    @Test
    public void test1578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1578");
        int[] intArray10 = new int[] { (short) 1 };
        ds.AvaliaMultMatrizes.multmatrize((int) (short) -1, intArray10);
        ds.AvaliaMultMatrizes.multmatrize(0, intArray10);
        ds.AvaliaMultMatrizes.multmatrize(0, intArray10);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) -1, intArray10);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) 0, intArray10);
        ds.AvaliaMultMatrizes.multmatrize(0, intArray10);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) 1, intArray10);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) 1, intArray10);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) -1, intArray10);
        java.lang.Class<?> wildcardClass20 = intArray10.getClass();
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[1]");
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test1579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1579");
        int[] intArray13 = new int[] { (short) 1 };
        ds.AvaliaMultMatrizes.multmatrize((int) (short) -1, intArray13);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) 1, intArray13);
        ds.AvaliaMultMatrizes.multmatrize(0, intArray13);
        ds.AvaliaMultMatrizes.multmatrize((-1), intArray13);
        ds.AvaliaMultMatrizes.multmatrize(0, intArray13);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) -1, intArray13);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) 1, intArray13);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) -1, intArray13);
        ds.AvaliaMultMatrizes.multmatrize(0, intArray13);
        ds.AvaliaMultMatrizes.multmatrize((-1), intArray13);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) 1, intArray13);
        // The following exception was thrown during execution in test generation
        try {
            ds.AvaliaMultMatrizes.multmatrize((int) 'a', intArray13);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[1]");
    }

    @Test
    public void test1580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1580");
        int[] intArray8 = new int[] { (short) 1 };
        ds.AvaliaMultMatrizes.multmatrize((int) (short) -1, intArray8);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) 1, intArray8);
        ds.AvaliaMultMatrizes.multmatrize(0, intArray8);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) 0, intArray8);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) 0, intArray8);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) 0, intArray8);
        ds.AvaliaMultMatrizes.multmatrize((-1), intArray8);
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[1]");
    }

    @Test
    public void test1581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1581");
        int[] intArray10 = new int[] { (short) 1 };
        ds.AvaliaMultMatrizes.multmatrize((int) (short) -1, intArray10);
        ds.AvaliaMultMatrizes.multmatrize(0, intArray10);
        ds.AvaliaMultMatrizes.multmatrize(0, intArray10);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) -1, intArray10);
        ds.AvaliaMultMatrizes.multmatrize(0, intArray10);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) -1, intArray10);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) 0, intArray10);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) 1, intArray10);
        // The following exception was thrown during execution in test generation
        try {
            ds.AvaliaMultMatrizes.multmatrize(100, intArray10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[1]");
    }

    @Test
    public void test1582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1582");
        int[] intArray12 = new int[] { (short) 1 };
        ds.AvaliaMultMatrizes.multmatrize((int) (short) -1, intArray12);
        ds.AvaliaMultMatrizes.multmatrize(0, intArray12);
        ds.AvaliaMultMatrizes.multmatrize(0, intArray12);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) -1, intArray12);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) 0, intArray12);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) -1, intArray12);
        ds.AvaliaMultMatrizes.multmatrize((-1), intArray12);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) 0, intArray12);
        ds.AvaliaMultMatrizes.multmatrize(1, intArray12);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) -1, intArray12);
        // The following exception was thrown during execution in test generation
        try {
            ds.AvaliaMultMatrizes.multmatrize((int) '#', intArray12);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[1]");
    }

    @Test
    public void test1583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1583");
        int[] intArray7 = new int[] { (short) 1 };
        ds.AvaliaMultMatrizes.multmatrize((int) (short) -1, intArray7);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) 1, intArray7);
        ds.AvaliaMultMatrizes.multmatrize(0, intArray7);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) 1, intArray7);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) 0, intArray7);
        ds.AvaliaMultMatrizes.multmatrize(1, intArray7);
        java.lang.Class<?> wildcardClass14 = intArray7.getClass();
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[1]");
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test1584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1584");
        int[] intArray10 = new int[] { (-1) };
        ds.AvaliaMultMatrizes.multmatrize((-1), intArray10);
        ds.AvaliaMultMatrizes.multmatrize(1, intArray10);
        ds.AvaliaMultMatrizes.multmatrize((-1), intArray10);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) 0, intArray10);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) -1, intArray10);
        ds.AvaliaMultMatrizes.multmatrize(0, intArray10);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) 0, intArray10);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) 1, intArray10);
        // The following exception was thrown during execution in test generation
        try {
            ds.AvaliaMultMatrizes.multmatrize((int) (short) 100, intArray10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[-1]");
    }

    @Test
    public void test1585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1585");
        int[] intArray13 = new int[] { (short) 1 };
        ds.AvaliaMultMatrizes.multmatrize((int) (short) -1, intArray13);
        ds.AvaliaMultMatrizes.multmatrize(0, intArray13);
        ds.AvaliaMultMatrizes.multmatrize(0, intArray13);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) -1, intArray13);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) 0, intArray13);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) 1, intArray13);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) -1, intArray13);
        ds.AvaliaMultMatrizes.multmatrize(0, intArray13);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) -1, intArray13);
        ds.AvaliaMultMatrizes.multmatrize(1, intArray13);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) -1, intArray13);
        // The following exception was thrown during execution in test generation
        try {
            ds.AvaliaMultMatrizes.multmatrize((int) (byte) 10, intArray13);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[1]");
    }

    @Test
    public void test1586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1586");
        int[] intArray12 = new int[] { (short) 1 };
        ds.AvaliaMultMatrizes.multmatrize((int) (short) -1, intArray12);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) 1, intArray12);
        ds.AvaliaMultMatrizes.multmatrize(0, intArray12);
        ds.AvaliaMultMatrizes.multmatrize((-1), intArray12);
        ds.AvaliaMultMatrizes.multmatrize(0, intArray12);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) -1, intArray12);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) -1, intArray12);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) 0, intArray12);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) 1, intArray12);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) -1, intArray12);
        // The following exception was thrown during execution in test generation
        try {
            ds.AvaliaMultMatrizes.multmatrize((int) (short) 100, intArray12);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[1]");
    }

    @Test
    public void test1587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1587");
        int[] intArray8 = new int[] { (short) 1 };
        ds.AvaliaMultMatrizes.multmatrize((int) (short) -1, intArray8);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) 1, intArray8);
        ds.AvaliaMultMatrizes.multmatrize(0, intArray8);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) 1, intArray8);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) -1, intArray8);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) 1, intArray8);
        ds.AvaliaMultMatrizes.multmatrize(0, intArray8);
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[1]");
    }

    @Test
    public void test1588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1588");
        int[] intArray8 = new int[] { (byte) 10, (short) 1, (short) 1, (short) 10 };
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) -1, intArray8);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) 0, intArray8);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) -1, intArray8);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) -1, intArray8);
        java.lang.Class<?> wildcardClass13 = intArray8.getClass();
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[10, 1, 1, 10]");
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test1589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1589");
        int[] intArray6 = new int[] { (short) 1 };
        ds.AvaliaMultMatrizes.multmatrize((int) (short) -1, intArray6);
        ds.AvaliaMultMatrizes.multmatrize(0, intArray6);
        ds.AvaliaMultMatrizes.multmatrize(0, intArray6);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) -1, intArray6);
        // The following exception was thrown during execution in test generation
        try {
            ds.AvaliaMultMatrizes.multmatrize((int) (byte) 100, intArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[1]");
    }

    @Test
    public void test1590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1590");
        int[] intArray13 = new int[] { (short) 1 };
        ds.AvaliaMultMatrizes.multmatrize((int) (short) -1, intArray13);
        ds.AvaliaMultMatrizes.multmatrize(0, intArray13);
        ds.AvaliaMultMatrizes.multmatrize(0, intArray13);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) -1, intArray13);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) 0, intArray13);
        ds.AvaliaMultMatrizes.multmatrize(0, intArray13);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) 0, intArray13);
        ds.AvaliaMultMatrizes.multmatrize((-1), intArray13);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) 1, intArray13);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) -1, intArray13);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) 0, intArray13);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) -1, intArray13);
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[1]");
    }

    @Test
    public void test1591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1591");
        int[] intArray13 = new int[] { (-1), 1, 0, '#', 100, (short) -1 };
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) -1, intArray13);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) 0, intArray13);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) 0, intArray13);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) -1, intArray13);
        ds.AvaliaMultMatrizes.multmatrize(1, intArray13);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) -1, intArray13);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) 0, intArray13);
        java.lang.Class<?> wildcardClass21 = intArray13.getClass();
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[-1, 1, 0, 35, 100, -1]");
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test1592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1592");
        int[] intArray7 = new int[] { (short) 1 };
        ds.AvaliaMultMatrizes.multmatrize((int) (short) -1, intArray7);
        ds.AvaliaMultMatrizes.multmatrize(0, intArray7);
        ds.AvaliaMultMatrizes.multmatrize(0, intArray7);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) -1, intArray7);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) 0, intArray7);
        // The following exception was thrown during execution in test generation
        try {
            ds.AvaliaMultMatrizes.multmatrize(10, intArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[1]");
    }

    @Test
    public void test1593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1593");
        int[] intArray12 = new int[] { (-1), 1, 0, '#', 100, (short) -1 };
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) -1, intArray12);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) 0, intArray12);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) 0, intArray12);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) 0, intArray12);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) 1, intArray12);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) 1, intArray12);
        java.lang.Class<?> wildcardClass19 = intArray12.getClass();
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[-1, 1, 0, 35, 100, -1]");
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test1594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1594");
        int[] intArray11 = new int[] { (-1) };
        ds.AvaliaMultMatrizes.multmatrize((-1), intArray11);
        ds.AvaliaMultMatrizes.multmatrize(1, intArray11);
        ds.AvaliaMultMatrizes.multmatrize((-1), intArray11);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) 0, intArray11);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) -1, intArray11);
        ds.AvaliaMultMatrizes.multmatrize(1, intArray11);
        ds.AvaliaMultMatrizes.multmatrize((-1), intArray11);
        ds.AvaliaMultMatrizes.multmatrize(0, intArray11);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) -1, intArray11);
        // The following exception was thrown during execution in test generation
        try {
            ds.AvaliaMultMatrizes.multmatrize((int) (byte) 10, intArray11);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[-1]");
    }

    @Test
    public void test1595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1595");
        int[] intArray14 = new int[] { (-1), 1, 0, '#', 100, (short) -1 };
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) -1, intArray14);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) 0, intArray14);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) 0, intArray14);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) -1, intArray14);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) 1, intArray14);
        ds.AvaliaMultMatrizes.multmatrize(0, intArray14);
        ds.AvaliaMultMatrizes.multmatrize(0, intArray14);
        ds.AvaliaMultMatrizes.multmatrize((-1), intArray14);
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[-1, 1, 0, 35, 100, -1]");
    }

    @Test
    public void test1596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1596");
        int[] intArray13 = new int[] { (short) 1 };
        ds.AvaliaMultMatrizes.multmatrize((int) (short) -1, intArray13);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) 1, intArray13);
        ds.AvaliaMultMatrizes.multmatrize(0, intArray13);
        ds.AvaliaMultMatrizes.multmatrize((-1), intArray13);
        ds.AvaliaMultMatrizes.multmatrize(0, intArray13);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) -1, intArray13);
        ds.AvaliaMultMatrizes.multmatrize(0, intArray13);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) 1, intArray13);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) 1, intArray13);
        ds.AvaliaMultMatrizes.multmatrize((-1), intArray13);
        ds.AvaliaMultMatrizes.multmatrize(0, intArray13);
        ds.AvaliaMultMatrizes.multmatrize(0, intArray13);
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[1]");
    }

    @Test
    public void test1597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1597");
        int[] intArray10 = new int[] { (short) 1 };
        ds.AvaliaMultMatrizes.multmatrize((int) (short) -1, intArray10);
        ds.AvaliaMultMatrizes.multmatrize(0, intArray10);
        ds.AvaliaMultMatrizes.multmatrize(0, intArray10);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) 1, intArray10);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) 0, intArray10);
        ds.AvaliaMultMatrizes.multmatrize((-1), intArray10);
        ds.AvaliaMultMatrizes.multmatrize((-1), intArray10);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) 0, intArray10);
        ds.AvaliaMultMatrizes.multmatrize(1, intArray10);
        java.lang.Class<?> wildcardClass20 = intArray10.getClass();
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[1]");
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test1598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1598");
        int[] intArray13 = new int[] { (short) 1 };
        ds.AvaliaMultMatrizes.multmatrize((int) (short) -1, intArray13);
        ds.AvaliaMultMatrizes.multmatrize(0, intArray13);
        ds.AvaliaMultMatrizes.multmatrize(0, intArray13);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) -1, intArray13);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) 0, intArray13);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) -1, intArray13);
        ds.AvaliaMultMatrizes.multmatrize((-1), intArray13);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) 0, intArray13);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) 1, intArray13);
        ds.AvaliaMultMatrizes.multmatrize(0, intArray13);
        ds.AvaliaMultMatrizes.multmatrize(1, intArray13);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) -1, intArray13);
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[1]");
    }

    @Test
    public void test1599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1599");
        int[] intArray11 = new int[] { (short) 1 };
        ds.AvaliaMultMatrizes.multmatrize((int) (short) -1, intArray11);
        ds.AvaliaMultMatrizes.multmatrize(0, intArray11);
        ds.AvaliaMultMatrizes.multmatrize(0, intArray11);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) -1, intArray11);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) 0, intArray11);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) 1, intArray11);
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
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[1]");
    }

    @Test
    public void test1600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1600");
        int[] intArray12 = new int[] { (short) 1 };
        ds.AvaliaMultMatrizes.multmatrize((int) (short) -1, intArray12);
        ds.AvaliaMultMatrizes.multmatrize(0, intArray12);
        ds.AvaliaMultMatrizes.multmatrize(0, intArray12);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) -1, intArray12);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) 0, intArray12);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) -1, intArray12);
        ds.AvaliaMultMatrizes.multmatrize((-1), intArray12);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) 0, intArray12);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) 1, intArray12);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) -1, intArray12);
        // The following exception was thrown during execution in test generation
        try {
            ds.AvaliaMultMatrizes.multmatrize(10, intArray12);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[1]");
    }

    @Test
    public void test1601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1601");
        int[] intArray15 = new int[] { (short) 1 };
        ds.AvaliaMultMatrizes.multmatrize((int) (short) -1, intArray15);
        ds.AvaliaMultMatrizes.multmatrize(0, intArray15);
        ds.AvaliaMultMatrizes.multmatrize(0, intArray15);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) -1, intArray15);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) 0, intArray15);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) 1, intArray15);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) 1, intArray15);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) 0, intArray15);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) 1, intArray15);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) -1, intArray15);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) 0, intArray15);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) 1, intArray15);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) 1, intArray15);
        // The following exception was thrown during execution in test generation
        try {
            ds.AvaliaMultMatrizes.multmatrize((int) (short) 10, intArray15);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[1]");
    }

    @Test
    public void test1602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1602");
        int[] intArray5 = new int[] { (short) 1 };
        ds.AvaliaMultMatrizes.multmatrize((int) (short) -1, intArray5);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) 0, intArray5);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) -1, intArray5);
        ds.AvaliaMultMatrizes.multmatrize((-1), intArray5);
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[1]");
    }

    @Test
    public void test1603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1603");
        int[] intArray4 = new int[] { (short) 1 };
        ds.AvaliaMultMatrizes.multmatrize((int) (short) -1, intArray4);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) 1, intArray4);
        // The following exception was thrown during execution in test generation
        try {
            ds.AvaliaMultMatrizes.multmatrize(100, intArray4);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[1]");
    }

    @Test
    public void test1604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1604");
        int[] intArray9 = new int[] { (short) 1 };
        ds.AvaliaMultMatrizes.multmatrize((int) (short) -1, intArray9);
        ds.AvaliaMultMatrizes.multmatrize(0, intArray9);
        ds.AvaliaMultMatrizes.multmatrize(0, intArray9);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) -1, intArray9);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) 1, intArray9);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) 0, intArray9);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) 1, intArray9);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) 0, intArray9);
        java.lang.Class<?> wildcardClass18 = intArray9.getClass();
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[1]");
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test1605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1605");
        int[] intArray12 = new int[] { (short) 1 };
        ds.AvaliaMultMatrizes.multmatrize((int) (short) -1, intArray12);
        ds.AvaliaMultMatrizes.multmatrize(0, intArray12);
        ds.AvaliaMultMatrizes.multmatrize(0, intArray12);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) 1, intArray12);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) 0, intArray12);
        ds.AvaliaMultMatrizes.multmatrize((-1), intArray12);
        ds.AvaliaMultMatrizes.multmatrize((-1), intArray12);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) 0, intArray12);
        ds.AvaliaMultMatrizes.multmatrize(0, intArray12);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) -1, intArray12);
        // The following exception was thrown during execution in test generation
        try {
            ds.AvaliaMultMatrizes.multmatrize((int) 'a', intArray12);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[1]");
    }

    @Test
    public void test1606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1606");
        int[] intArray10 = new int[] { (short) 1 };
        ds.AvaliaMultMatrizes.multmatrize((int) (short) -1, intArray10);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) 1, intArray10);
        ds.AvaliaMultMatrizes.multmatrize(0, intArray10);
        ds.AvaliaMultMatrizes.multmatrize((-1), intArray10);
        ds.AvaliaMultMatrizes.multmatrize(0, intArray10);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) -1, intArray10);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) 0, intArray10);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) 1, intArray10);
        // The following exception was thrown during execution in test generation
        try {
            ds.AvaliaMultMatrizes.multmatrize((int) (byte) 100, intArray10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[1]");
    }

    @Test
    public void test1607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1607");
        int[] intArray11 = new int[] { (short) 1 };
        ds.AvaliaMultMatrizes.multmatrize((int) (short) -1, intArray11);
        ds.AvaliaMultMatrizes.multmatrize(0, intArray11);
        ds.AvaliaMultMatrizes.multmatrize(0, intArray11);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) -1, intArray11);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) 0, intArray11);
        ds.AvaliaMultMatrizes.multmatrize(0, intArray11);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) 0, intArray11);
        ds.AvaliaMultMatrizes.multmatrize((-1), intArray11);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) 0, intArray11);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) -1, intArray11);
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[1]");
    }

    @Test
    public void test1608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1608");
        int[] intArray8 = new int[] { (-1) };
        ds.AvaliaMultMatrizes.multmatrize((-1), intArray8);
        ds.AvaliaMultMatrizes.multmatrize(1, intArray8);
        ds.AvaliaMultMatrizes.multmatrize((-1), intArray8);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) 1, intArray8);
        ds.AvaliaMultMatrizes.multmatrize((-1), intArray8);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) 0, intArray8);
        // The following exception was thrown during execution in test generation
        try {
            ds.AvaliaMultMatrizes.multmatrize((int) ' ', intArray8);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[-1]");
    }

    @Test
    public void test1609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1609");
        int[] intArray8 = new int[] { (-1) };
        ds.AvaliaMultMatrizes.multmatrize((-1), intArray8);
        ds.AvaliaMultMatrizes.multmatrize(1, intArray8);
        ds.AvaliaMultMatrizes.multmatrize((-1), intArray8);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) 0, intArray8);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) -1, intArray8);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) 0, intArray8);
        ds.AvaliaMultMatrizes.multmatrize((-1), intArray8);
        java.lang.Class<?> wildcardClass16 = intArray8.getClass();
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[-1]");
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test1610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1610");
        int[] intArray13 = new int[] { (short) 1 };
        ds.AvaliaMultMatrizes.multmatrize((int) (short) -1, intArray13);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) 1, intArray13);
        ds.AvaliaMultMatrizes.multmatrize(0, intArray13);
        ds.AvaliaMultMatrizes.multmatrize((-1), intArray13);
        ds.AvaliaMultMatrizes.multmatrize(0, intArray13);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) -1, intArray13);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) 1, intArray13);
        ds.AvaliaMultMatrizes.multmatrize(0, intArray13);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) -1, intArray13);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) -1, intArray13);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) 0, intArray13);
        // The following exception was thrown during execution in test generation
        try {
            ds.AvaliaMultMatrizes.multmatrize((int) 'a', intArray13);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[1]");
    }

    @Test
    public void test1611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1611");
        int[] intArray12 = new int[] { (short) 1 };
        ds.AvaliaMultMatrizes.multmatrize((int) (short) -1, intArray12);
        ds.AvaliaMultMatrizes.multmatrize(0, intArray12);
        ds.AvaliaMultMatrizes.multmatrize(0, intArray12);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) -1, intArray12);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) 0, intArray12);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) -1, intArray12);
        ds.AvaliaMultMatrizes.multmatrize((-1), intArray12);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) 0, intArray12);
        ds.AvaliaMultMatrizes.multmatrize(1, intArray12);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) -1, intArray12);
        // The following exception was thrown during execution in test generation
        try {
            ds.AvaliaMultMatrizes.multmatrize((int) ' ', intArray12);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[1]");
    }

    @Test
    public void test1612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1612");
        int[] intArray7 = new int[] { (short) 1 };
        ds.AvaliaMultMatrizes.multmatrize((int) (short) -1, intArray7);
        ds.AvaliaMultMatrizes.multmatrize(0, intArray7);
        ds.AvaliaMultMatrizes.multmatrize(0, intArray7);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) -1, intArray7);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) 1, intArray7);
        // The following exception was thrown during execution in test generation
        try {
            ds.AvaliaMultMatrizes.multmatrize(100, intArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[1]");
    }

    @Test
    public void test1613() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1613");
        int[] intArray12 = new int[] { (short) 1 };
        ds.AvaliaMultMatrizes.multmatrize((int) (short) -1, intArray12);
        ds.AvaliaMultMatrizes.multmatrize(0, intArray12);
        ds.AvaliaMultMatrizes.multmatrize(0, intArray12);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) -1, intArray12);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) 1, intArray12);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) -1, intArray12);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) 1, intArray12);
        ds.AvaliaMultMatrizes.multmatrize(0, intArray12);
        ds.AvaliaMultMatrizes.multmatrize(0, intArray12);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) 1, intArray12);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) 0, intArray12);
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[1]");
    }

    @Test
    public void test1614() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1614");
        int[] intArray15 = new int[] { (-1), 1, 0, '#', 100, (short) -1 };
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) -1, intArray15);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) 0, intArray15);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) 0, intArray15);
        ds.AvaliaMultMatrizes.multmatrize(0, intArray15);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) -1, intArray15);
        ds.AvaliaMultMatrizes.multmatrize(1, intArray15);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) 1, intArray15);
        ds.AvaliaMultMatrizes.multmatrize(0, intArray15);
        // The following exception was thrown during execution in test generation
        try {
            ds.AvaliaMultMatrizes.multmatrize((int) ' ', intArray15);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[-1, 1, 0, 35, 100, -1]");
    }

    @Test
    public void test1615() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1615");
        int[] intArray9 = new int[] { (short) 1 };
        ds.AvaliaMultMatrizes.multmatrize((int) (short) -1, intArray9);
        ds.AvaliaMultMatrizes.multmatrize(0, intArray9);
        ds.AvaliaMultMatrizes.multmatrize(0, intArray9);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) -1, intArray9);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) 1, intArray9);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) -1, intArray9);
        ds.AvaliaMultMatrizes.multmatrize(0, intArray9);
        ds.AvaliaMultMatrizes.multmatrize(0, intArray9);
        java.lang.Class<?> wildcardClass18 = intArray9.getClass();
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[1]");
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test1616() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1616");
        int[] intArray11 = new int[] { (short) 1 };
        ds.AvaliaMultMatrizes.multmatrize((int) (short) -1, intArray11);
        ds.AvaliaMultMatrizes.multmatrize(0, intArray11);
        ds.AvaliaMultMatrizes.multmatrize(0, intArray11);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) 1, intArray11);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) 0, intArray11);
        ds.AvaliaMultMatrizes.multmatrize((-1), intArray11);
        ds.AvaliaMultMatrizes.multmatrize((-1), intArray11);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) 0, intArray11);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) -1, intArray11);
        // The following exception was thrown during execution in test generation
        try {
            ds.AvaliaMultMatrizes.multmatrize((int) (short) 100, intArray11);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[1]");
    }

    @Test
    public void test1617() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1617");
        int[] intArray6 = new int[] { (short) 1 };
        ds.AvaliaMultMatrizes.multmatrize((int) (short) -1, intArray6);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) 0, intArray6);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) -1, intArray6);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) 0, intArray6);
        ds.AvaliaMultMatrizes.multmatrize(1, intArray6);
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[1]");
    }

    @Test
    public void test1618() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1618");
        int[] intArray11 = new int[] { (short) 1 };
        ds.AvaliaMultMatrizes.multmatrize((int) (short) -1, intArray11);
        ds.AvaliaMultMatrizes.multmatrize(0, intArray11);
        ds.AvaliaMultMatrizes.multmatrize(0, intArray11);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) -1, intArray11);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) 0, intArray11);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) -1, intArray11);
        ds.AvaliaMultMatrizes.multmatrize((-1), intArray11);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) 0, intArray11);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) 0, intArray11);
        // The following exception was thrown during execution in test generation
        try {
            ds.AvaliaMultMatrizes.multmatrize((int) (short) 100, intArray11);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[1]");
    }

    @Test
    public void test1619() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1619");
        int[] intArray8 = new int[] { (-1) };
        ds.AvaliaMultMatrizes.multmatrize((-1), intArray8);
        ds.AvaliaMultMatrizes.multmatrize(1, intArray8);
        ds.AvaliaMultMatrizes.multmatrize((-1), intArray8);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) 0, intArray8);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) -1, intArray8);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) 0, intArray8);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) -1, intArray8);
        java.lang.Class<?> wildcardClass16 = intArray8.getClass();
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[-1]");
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test1620() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1620");
        int[] intArray16 = new int[] { (-1), 1, 0, '#', 100, (short) -1 };
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) -1, intArray16);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) 0, intArray16);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) 0, intArray16);
        ds.AvaliaMultMatrizes.multmatrize(0, intArray16);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) -1, intArray16);
        ds.AvaliaMultMatrizes.multmatrize(1, intArray16);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) 1, intArray16);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) -1, intArray16);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) 1, intArray16);
        // The following exception was thrown during execution in test generation
        try {
            ds.AvaliaMultMatrizes.multmatrize((int) '4', intArray16);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray16), "[-1, 1, 0, 35, 100, -1]");
    }

    @Test
    public void test1621() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1621");
        int[] intArray11 = new int[] { (-1) };
        ds.AvaliaMultMatrizes.multmatrize((-1), intArray11);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) -1, intArray11);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) -1, intArray11);
        ds.AvaliaMultMatrizes.multmatrize(0, intArray11);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) -1, intArray11);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) 1, intArray11);
        ds.AvaliaMultMatrizes.multmatrize((-1), intArray11);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) 1, intArray11);
        ds.AvaliaMultMatrizes.multmatrize(0, intArray11);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) -1, intArray11);
        java.lang.Class<?> wildcardClass22 = intArray11.getClass();
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[-1]");
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test1622() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1622");
        int[] intArray6 = new int[] { (short) 1 };
        ds.AvaliaMultMatrizes.multmatrize((int) (short) -1, intArray6);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) 1, intArray6);
        ds.AvaliaMultMatrizes.multmatrize(0, intArray6);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) 0, intArray6);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) 0, intArray6);
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[1]");
    }

    @Test
    public void test1623() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1623");
        int[] intArray10 = new int[] { (short) 1 };
        ds.AvaliaMultMatrizes.multmatrize((int) (short) -1, intArray10);
        ds.AvaliaMultMatrizes.multmatrize(0, intArray10);
        ds.AvaliaMultMatrizes.multmatrize(0, intArray10);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) -1, intArray10);
        ds.AvaliaMultMatrizes.multmatrize(0, intArray10);
        ds.AvaliaMultMatrizes.multmatrize(1, intArray10);
        ds.AvaliaMultMatrizes.multmatrize((-1), intArray10);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) -1, intArray10);
        // The following exception was thrown during execution in test generation
        try {
            ds.AvaliaMultMatrizes.multmatrize((int) (short) 10, intArray10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[1]");
    }

    @Test
    public void test1624() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1624");
        int[] intArray12 = new int[] { (short) 1 };
        ds.AvaliaMultMatrizes.multmatrize((int) (short) -1, intArray12);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) 1, intArray12);
        ds.AvaliaMultMatrizes.multmatrize(0, intArray12);
        ds.AvaliaMultMatrizes.multmatrize((-1), intArray12);
        ds.AvaliaMultMatrizes.multmatrize(0, intArray12);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) -1, intArray12);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) 1, intArray12);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) -1, intArray12);
        ds.AvaliaMultMatrizes.multmatrize(1, intArray12);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) -1, intArray12);
        // The following exception was thrown during execution in test generation
        try {
            ds.AvaliaMultMatrizes.multmatrize((int) (byte) 10, intArray12);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[1]");
    }

    @Test
    public void test1625() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1625");
        int[] intArray10 = new int[] { (-1), 1, 0, '#', 100, (short) -1 };
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) -1, intArray10);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) 0, intArray10);
        ds.AvaliaMultMatrizes.multmatrize(0, intArray10);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) -1, intArray10);
        java.lang.Class<?> wildcardClass15 = intArray10.getClass();
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[-1, 1, 0, 35, 100, -1]");
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test1626() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1626");
        int[] intArray14 = new int[] { (short) 1 };
        ds.AvaliaMultMatrizes.multmatrize((int) (short) -1, intArray14);
        ds.AvaliaMultMatrizes.multmatrize(0, intArray14);
        ds.AvaliaMultMatrizes.multmatrize(0, intArray14);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) -1, intArray14);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) 0, intArray14);
        ds.AvaliaMultMatrizes.multmatrize(0, intArray14);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) 0, intArray14);
        ds.AvaliaMultMatrizes.multmatrize((-1), intArray14);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) 1, intArray14);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) -1, intArray14);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) -1, intArray14);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) 1, intArray14);
        ds.AvaliaMultMatrizes.multmatrize(0, intArray14);
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[1]");
    }

    @Test
    public void test1627() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1627");
        int[] intArray9 = new int[] { (short) 1 };
        ds.AvaliaMultMatrizes.multmatrize((int) (short) -1, intArray9);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) 1, intArray9);
        ds.AvaliaMultMatrizes.multmatrize(0, intArray9);
        ds.AvaliaMultMatrizes.multmatrize((-1), intArray9);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) 0, intArray9);
        ds.AvaliaMultMatrizes.multmatrize(1, intArray9);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) 1, intArray9);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) 1, intArray9);
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[1]");
    }

    @Test
    public void test1628() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1628");
        int[] intArray11 = new int[] { (short) 1 };
        ds.AvaliaMultMatrizes.multmatrize((int) (short) -1, intArray11);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) 1, intArray11);
        ds.AvaliaMultMatrizes.multmatrize(0, intArray11);
        ds.AvaliaMultMatrizes.multmatrize((-1), intArray11);
        ds.AvaliaMultMatrizes.multmatrize(0, intArray11);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) -1, intArray11);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) 1, intArray11);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) -1, intArray11);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) 0, intArray11);
        // The following exception was thrown during execution in test generation
        try {
            ds.AvaliaMultMatrizes.multmatrize((int) (short) 100, intArray11);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[1]");
    }

    @Test
    public void test1629() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1629");
        int[] intArray9 = new int[] { (short) 1 };
        ds.AvaliaMultMatrizes.multmatrize((int) (short) -1, intArray9);
        ds.AvaliaMultMatrizes.multmatrize(0, intArray9);
        ds.AvaliaMultMatrizes.multmatrize(0, intArray9);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) -1, intArray9);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) 1, intArray9);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) 0, intArray9);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) 1, intArray9);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) -1, intArray9);
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[1]");
    }

    @Test
    public void test1630() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1630");
        int[] intArray9 = new int[] { (short) 1 };
        ds.AvaliaMultMatrizes.multmatrize((int) (short) -1, intArray9);
        ds.AvaliaMultMatrizes.multmatrize(0, intArray9);
        ds.AvaliaMultMatrizes.multmatrize(0, intArray9);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) -1, intArray9);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) 0, intArray9);
        ds.AvaliaMultMatrizes.multmatrize(0, intArray9);
        ds.AvaliaMultMatrizes.multmatrize(1, intArray9);
        ds.AvaliaMultMatrizes.multmatrize(0, intArray9);
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[1]");
    }

    @Test
    public void test1631() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1631");
        int[] intArray11 = new int[] { (short) 1 };
        ds.AvaliaMultMatrizes.multmatrize((int) (short) -1, intArray11);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) 1, intArray11);
        ds.AvaliaMultMatrizes.multmatrize(0, intArray11);
        ds.AvaliaMultMatrizes.multmatrize((-1), intArray11);
        ds.AvaliaMultMatrizes.multmatrize(0, intArray11);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) -1, intArray11);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) 1, intArray11);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) -1, intArray11);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) 0, intArray11);
        // The following exception was thrown during execution in test generation
        try {
            ds.AvaliaMultMatrizes.multmatrize((int) ' ', intArray11);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[1]");
    }

    @Test
    public void test1632() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1632");
        int[] intArray11 = new int[] { (short) 1 };
        ds.AvaliaMultMatrizes.multmatrize((int) (short) -1, intArray11);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) 1, intArray11);
        ds.AvaliaMultMatrizes.multmatrize(0, intArray11);
        ds.AvaliaMultMatrizes.multmatrize((-1), intArray11);
        ds.AvaliaMultMatrizes.multmatrize(0, intArray11);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) -1, intArray11);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) 1, intArray11);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) -1, intArray11);
        ds.AvaliaMultMatrizes.multmatrize(1, intArray11);
        // The following exception was thrown during execution in test generation
        try {
            ds.AvaliaMultMatrizes.multmatrize((int) 'a', intArray11);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[1]");
    }

    @Test
    public void test1633() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1633");
        int[] intArray7 = new int[] { (short) 1, 1, (byte) 10, 100, (short) -1 };
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) -1, intArray7);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) 0, intArray7);
        java.lang.Class<?> wildcardClass10 = intArray7.getClass();
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[1, 1, 10, 100, -1]");
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test1634() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1634");
        int[] intArray12 = new int[] { (short) 1 };
        ds.AvaliaMultMatrizes.multmatrize((int) (short) -1, intArray12);
        ds.AvaliaMultMatrizes.multmatrize(0, intArray12);
        ds.AvaliaMultMatrizes.multmatrize(0, intArray12);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) -1, intArray12);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) 1, intArray12);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) -1, intArray12);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) 1, intArray12);
        ds.AvaliaMultMatrizes.multmatrize(0, intArray12);
        ds.AvaliaMultMatrizes.multmatrize(0, intArray12);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) 1, intArray12);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) -1, intArray12);
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[1]");
    }

    @Test
    public void test1635() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1635");
        int[] intArray13 = new int[] { (short) 1 };
        ds.AvaliaMultMatrizes.multmatrize((int) (short) -1, intArray13);
        ds.AvaliaMultMatrizes.multmatrize(0, intArray13);
        ds.AvaliaMultMatrizes.multmatrize(0, intArray13);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) -1, intArray13);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) 0, intArray13);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) -1, intArray13);
        ds.AvaliaMultMatrizes.multmatrize((-1), intArray13);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) 0, intArray13);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) 1, intArray13);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) -1, intArray13);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) -1, intArray13);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) 0, intArray13);
        java.lang.Class<?> wildcardClass26 = intArray13.getClass();
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[1]");
        org.junit.Assert.assertNotNull(wildcardClass26);
    }

    @Test
    public void test1636() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1636");
        int[] intArray14 = new int[] { (-1), 1, 0, '#', 100, (short) -1 };
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) -1, intArray14);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) 0, intArray14);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) 0, intArray14);
        ds.AvaliaMultMatrizes.multmatrize(0, intArray14);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) -1, intArray14);
        ds.AvaliaMultMatrizes.multmatrize(1, intArray14);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) -1, intArray14);
        // The following exception was thrown during execution in test generation
        try {
            ds.AvaliaMultMatrizes.multmatrize(100, intArray14);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[-1, 1, 0, 35, 100, -1]");
    }

    @Test
    public void test1637() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1637");
        int[] intArray6 = new int[] { (byte) 10, (short) 1, (short) 1, (short) 10 };
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) -1, intArray6);
        ds.AvaliaMultMatrizes.multmatrize(1, intArray6);
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[10, 1, 1, 10]");
    }

    @Test
    public void test1638() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1638");
        int[] intArray12 = new int[] { (byte) 10, (short) 1, (short) 1, (short) 10 };
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) -1, intArray12);
        ds.AvaliaMultMatrizes.multmatrize((-1), intArray12);
        ds.AvaliaMultMatrizes.multmatrize(1, intArray12);
        ds.AvaliaMultMatrizes.multmatrize(0, intArray12);
        ds.AvaliaMultMatrizes.multmatrize(0, intArray12);
        ds.AvaliaMultMatrizes.multmatrize(0, intArray12);
        ds.AvaliaMultMatrizes.multmatrize(0, intArray12);
        // The following exception was thrown during execution in test generation
        try {
            ds.AvaliaMultMatrizes.multmatrize((int) (byte) 10, intArray12);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[10, 1, 1, 10]");
    }

    @Test
    public void test1639() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1639");
        int[] intArray10 = new int[] { (short) 1 };
        ds.AvaliaMultMatrizes.multmatrize((int) (short) -1, intArray10);
        ds.AvaliaMultMatrizes.multmatrize(0, intArray10);
        ds.AvaliaMultMatrizes.multmatrize(0, intArray10);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) -1, intArray10);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) 1, intArray10);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) 0, intArray10);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) 1, intArray10);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) 0, intArray10);
        // The following exception was thrown during execution in test generation
        try {
            ds.AvaliaMultMatrizes.multmatrize((int) 'a', intArray10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[1]");
    }

    @Test
    public void test1640() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1640");
        int[] intArray10 = new int[] { (short) 1 };
        ds.AvaliaMultMatrizes.multmatrize((int) (short) -1, intArray10);
        ds.AvaliaMultMatrizes.multmatrize(0, intArray10);
        ds.AvaliaMultMatrizes.multmatrize(0, intArray10);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) -1, intArray10);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) 1, intArray10);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) 0, intArray10);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) 0, intArray10);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) 1, intArray10);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) -1, intArray10);
        java.lang.Class<?> wildcardClass20 = intArray10.getClass();
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[1]");
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test1641() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1641");
        int[] intArray15 = new int[] { (short) 1 };
        ds.AvaliaMultMatrizes.multmatrize((int) (short) -1, intArray15);
        ds.AvaliaMultMatrizes.multmatrize(0, intArray15);
        ds.AvaliaMultMatrizes.multmatrize(0, intArray15);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) 1, intArray15);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) 0, intArray15);
        ds.AvaliaMultMatrizes.multmatrize((-1), intArray15);
        ds.AvaliaMultMatrizes.multmatrize((-1), intArray15);
        ds.AvaliaMultMatrizes.multmatrize(0, intArray15);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) 1, intArray15);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) 0, intArray15);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) -1, intArray15);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) 0, intArray15);
        ds.AvaliaMultMatrizes.multmatrize((-1), intArray15);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) -1, intArray15);
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[1]");
    }

    @Test
    public void test1642() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1642");
        int[] intArray10 = new int[] { (-1), 1, 0, '#', 100, (short) -1 };
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) -1, intArray10);
        ds.AvaliaMultMatrizes.multmatrize(1, intArray10);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) -1, intArray10);
        // The following exception was thrown during execution in test generation
        try {
            ds.AvaliaMultMatrizes.multmatrize((int) (short) 10, intArray10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[-1, 1, 0, 35, 100, -1]");
    }

    @Test
    public void test1643() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1643");
        int[] intArray11 = new int[] { (-1), 1, 0, '#', 100, (short) -1 };
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) -1, intArray11);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) 0, intArray11);
        ds.AvaliaMultMatrizes.multmatrize(0, intArray11);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) -1, intArray11);
        // The following exception was thrown during execution in test generation
        try {
            ds.AvaliaMultMatrizes.multmatrize((int) '4', intArray11);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[-1, 1, 0, 35, 100, -1]");
    }

    @Test
    public void test1644() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1644");
        int[] intArray9 = new int[] { (short) 1 };
        ds.AvaliaMultMatrizes.multmatrize((int) (short) -1, intArray9);
        ds.AvaliaMultMatrizes.multmatrize(0, intArray9);
        ds.AvaliaMultMatrizes.multmatrize(0, intArray9);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) -1, intArray9);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) 0, intArray9);
        ds.AvaliaMultMatrizes.multmatrize(0, intArray9);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) -1, intArray9);
        // The following exception was thrown during execution in test generation
        try {
            ds.AvaliaMultMatrizes.multmatrize((int) ' ', intArray9);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[1]");
    }

    @Test
    public void test1645() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1645");
        int[] intArray9 = new int[] { (short) 1 };
        ds.AvaliaMultMatrizes.multmatrize((int) (short) -1, intArray9);
        ds.AvaliaMultMatrizes.multmatrize(0, intArray9);
        ds.AvaliaMultMatrizes.multmatrize(0, intArray9);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) -1, intArray9);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) 1, intArray9);
        ds.AvaliaMultMatrizes.multmatrize(0, intArray9);
        ds.AvaliaMultMatrizes.multmatrize(0, intArray9);
        ds.AvaliaMultMatrizes.multmatrize(0, intArray9);
        java.lang.Class<?> wildcardClass18 = intArray9.getClass();
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[1]");
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test1646() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1646");
        int[] intArray10 = new int[] { (short) 1 };
        ds.AvaliaMultMatrizes.multmatrize((int) (short) -1, intArray10);
        ds.AvaliaMultMatrizes.multmatrize(0, intArray10);
        ds.AvaliaMultMatrizes.multmatrize(0, intArray10);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) -1, intArray10);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) 1, intArray10);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) 0, intArray10);
        ds.AvaliaMultMatrizes.multmatrize(0, intArray10);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) -1, intArray10);
        // The following exception was thrown during execution in test generation
        try {
            ds.AvaliaMultMatrizes.multmatrize((int) (short) 10, intArray10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[1]");
    }

    @Test
    public void test1647() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1647");
        int[] intArray9 = new int[] { (short) 1 };
        ds.AvaliaMultMatrizes.multmatrize((int) (short) -1, intArray9);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) 1, intArray9);
        ds.AvaliaMultMatrizes.multmatrize(0, intArray9);
        ds.AvaliaMultMatrizes.multmatrize((-1), intArray9);
        ds.AvaliaMultMatrizes.multmatrize(0, intArray9);
        ds.AvaliaMultMatrizes.multmatrize(0, intArray9);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) 1, intArray9);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) 0, intArray9);
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[1]");
    }

    @Test
    public void test1648() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1648");
        int[] intArray7 = new int[] { (short) 1 };
        ds.AvaliaMultMatrizes.multmatrize((int) (short) -1, intArray7);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) 1, intArray7);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) 1, intArray7);
        ds.AvaliaMultMatrizes.multmatrize((-1), intArray7);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) 1, intArray7);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) -1, intArray7);
        java.lang.Class<?> wildcardClass14 = intArray7.getClass();
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[1]");
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test1649() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1649");
        int[] intArray10 = new int[] { (short) 1 };
        ds.AvaliaMultMatrizes.multmatrize((int) (short) -1, intArray10);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) 1, intArray10);
        ds.AvaliaMultMatrizes.multmatrize(0, intArray10);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) 0, intArray10);
        ds.AvaliaMultMatrizes.multmatrize(1, intArray10);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) -1, intArray10);
        ds.AvaliaMultMatrizes.multmatrize(1, intArray10);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) 1, intArray10);
        // The following exception was thrown during execution in test generation
        try {
            ds.AvaliaMultMatrizes.multmatrize((int) (short) 100, intArray10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[1]");
    }

    @Test
    public void test1650() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1650");
        int[] intArray13 = new int[] { (short) 1 };
        ds.AvaliaMultMatrizes.multmatrize((int) (short) -1, intArray13);
        ds.AvaliaMultMatrizes.multmatrize(0, intArray13);
        ds.AvaliaMultMatrizes.multmatrize(0, intArray13);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) -1, intArray13);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) 0, intArray13);
        ds.AvaliaMultMatrizes.multmatrize(0, intArray13);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) 1, intArray13);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) 1, intArray13);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) 1, intArray13);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) 0, intArray13);
        ds.AvaliaMultMatrizes.multmatrize(0, intArray13);
        // The following exception was thrown during execution in test generation
        try {
            ds.AvaliaMultMatrizes.multmatrize((int) ' ', intArray13);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[1]");
    }

    @Test
    public void test1651() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1651");
        int[] intArray12 = new int[] { (short) 1 };
        ds.AvaliaMultMatrizes.multmatrize((int) (short) -1, intArray12);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) 1, intArray12);
        ds.AvaliaMultMatrizes.multmatrize(0, intArray12);
        ds.AvaliaMultMatrizes.multmatrize((-1), intArray12);
        ds.AvaliaMultMatrizes.multmatrize(0, intArray12);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) -1, intArray12);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) 1, intArray12);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) -1, intArray12);
        ds.AvaliaMultMatrizes.multmatrize(1, intArray12);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) 0, intArray12);
        ds.AvaliaMultMatrizes.multmatrize(0, intArray12);
        java.lang.Class<?> wildcardClass24 = intArray12.getClass();
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[1]");
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test1652() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1652");
        int[] intArray9 = new int[] { (short) 1 };
        ds.AvaliaMultMatrizes.multmatrize((int) (short) -1, intArray9);
        ds.AvaliaMultMatrizes.multmatrize(0, intArray9);
        ds.AvaliaMultMatrizes.multmatrize(0, intArray9);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) -1, intArray9);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) 1, intArray9);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) -1, intArray9);
        ds.AvaliaMultMatrizes.multmatrize(0, intArray9);
        // The following exception was thrown during execution in test generation
        try {
            ds.AvaliaMultMatrizes.multmatrize(100, intArray9);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[1]");
    }

    @Test
    public void test1653() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1653");
        int[] intArray8 = new int[] { (short) 1 };
        ds.AvaliaMultMatrizes.multmatrize((int) (short) -1, intArray8);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) 1, intArray8);
        ds.AvaliaMultMatrizes.multmatrize(0, intArray8);
        ds.AvaliaMultMatrizes.multmatrize((-1), intArray8);
        ds.AvaliaMultMatrizes.multmatrize(0, intArray8);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) 0, intArray8);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) 0, intArray8);
        java.lang.Class<?> wildcardClass16 = intArray8.getClass();
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[1]");
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test1654() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1654");
        int[] intArray8 = new int[] { (-1) };
        ds.AvaliaMultMatrizes.multmatrize((-1), intArray8);
        ds.AvaliaMultMatrizes.multmatrize(1, intArray8);
        ds.AvaliaMultMatrizes.multmatrize((-1), intArray8);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) -1, intArray8);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) -1, intArray8);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) -1, intArray8);
        // The following exception was thrown during execution in test generation
        try {
            ds.AvaliaMultMatrizes.multmatrize((int) '4', intArray8);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[-1]");
    }

    @Test
    public void test1655() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1655");
        int[] intArray10 = new int[] { (short) 1 };
        ds.AvaliaMultMatrizes.multmatrize((int) (short) -1, intArray10);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) 1, intArray10);
        ds.AvaliaMultMatrizes.multmatrize(0, intArray10);
        ds.AvaliaMultMatrizes.multmatrize((-1), intArray10);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) 0, intArray10);
        ds.AvaliaMultMatrizes.multmatrize(1, intArray10);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) 1, intArray10);
        ds.AvaliaMultMatrizes.multmatrize(0, intArray10);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) -1, intArray10);
        java.lang.Class<?> wildcardClass20 = intArray10.getClass();
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[1]");
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test1656() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1656");
        int[] intArray8 = new int[] { (short) 1 };
        ds.AvaliaMultMatrizes.multmatrize((int) (short) -1, intArray8);
        ds.AvaliaMultMatrizes.multmatrize(0, intArray8);
        ds.AvaliaMultMatrizes.multmatrize(0, intArray8);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) -1, intArray8);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) 0, intArray8);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) 0, intArray8);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) -1, intArray8);
        java.lang.Class<?> wildcardClass16 = intArray8.getClass();
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[1]");
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test1657() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1657");
        int[] intArray9 = new int[] { (short) 1 };
        ds.AvaliaMultMatrizes.multmatrize((int) (short) -1, intArray9);
        ds.AvaliaMultMatrizes.multmatrize(0, intArray9);
        ds.AvaliaMultMatrizes.multmatrize(0, intArray9);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) -1, intArray9);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) 1, intArray9);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) 0, intArray9);
        ds.AvaliaMultMatrizes.multmatrize((-1), intArray9);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) 1, intArray9);
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[1]");
    }

    @Test
    public void test1658() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1658");
        int[] intArray11 = new int[] { (short) 1 };
        ds.AvaliaMultMatrizes.multmatrize((int) (short) -1, intArray11);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) 1, intArray11);
        ds.AvaliaMultMatrizes.multmatrize(0, intArray11);
        ds.AvaliaMultMatrizes.multmatrize((-1), intArray11);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) 0, intArray11);
        ds.AvaliaMultMatrizes.multmatrize(1, intArray11);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) -1, intArray11);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) -1, intArray11);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) 0, intArray11);
        ds.AvaliaMultMatrizes.multmatrize(0, intArray11);
        java.lang.Class<?> wildcardClass22 = intArray11.getClass();
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[1]");
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test1659() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1659");
        int[] intArray11 = new int[] { (short) 1 };
        ds.AvaliaMultMatrizes.multmatrize((int) (short) -1, intArray11);
        ds.AvaliaMultMatrizes.multmatrize(0, intArray11);
        ds.AvaliaMultMatrizes.multmatrize(0, intArray11);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) 1, intArray11);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) 0, intArray11);
        ds.AvaliaMultMatrizes.multmatrize((-1), intArray11);
        ds.AvaliaMultMatrizes.multmatrize((-1), intArray11);
        ds.AvaliaMultMatrizes.multmatrize(0, intArray11);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) 1, intArray11);
        ds.AvaliaMultMatrizes.multmatrize(0, intArray11);
        java.lang.Class<?> wildcardClass22 = intArray11.getClass();
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[1]");
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test1660() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1660");
        int[] intArray15 = new int[] { (-1), 1, 0, '#', 100, (short) -1 };
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) -1, intArray15);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) 0, intArray15);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) 0, intArray15);
        ds.AvaliaMultMatrizes.multmatrize(0, intArray15);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) 0, intArray15);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) 1, intArray15);
        ds.AvaliaMultMatrizes.multmatrize(0, intArray15);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) -1, intArray15);
        ds.AvaliaMultMatrizes.multmatrize(0, intArray15);
        java.lang.Class<?> wildcardClass25 = intArray15.getClass();
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[-1, 1, 0, 35, 100, -1]");
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test1661() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1661");
        int[] intArray12 = new int[] { (short) 1 };
        ds.AvaliaMultMatrizes.multmatrize((int) (short) -1, intArray12);
        ds.AvaliaMultMatrizes.multmatrize(0, intArray12);
        ds.AvaliaMultMatrizes.multmatrize(0, intArray12);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) 1, intArray12);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) 0, intArray12);
        ds.AvaliaMultMatrizes.multmatrize((-1), intArray12);
        ds.AvaliaMultMatrizes.multmatrize((-1), intArray12);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) 0, intArray12);
        ds.AvaliaMultMatrizes.multmatrize(0, intArray12);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) -1, intArray12);
        // The following exception was thrown during execution in test generation
        try {
            ds.AvaliaMultMatrizes.multmatrize(10, intArray12);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[1]");
    }

    @Test
    public void test1662() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1662");
        int[] intArray9 = new int[] { (short) 1 };
        ds.AvaliaMultMatrizes.multmatrize((int) (short) -1, intArray9);
        ds.AvaliaMultMatrizes.multmatrize(0, intArray9);
        ds.AvaliaMultMatrizes.multmatrize(0, intArray9);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) -1, intArray9);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) 1, intArray9);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) -1, intArray9);
        ds.AvaliaMultMatrizes.multmatrize(0, intArray9);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) -1, intArray9);
        java.lang.Class<?> wildcardClass18 = intArray9.getClass();
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[1]");
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test1663() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1663");
        int[] intArray12 = new int[] { (short) 1 };
        ds.AvaliaMultMatrizes.multmatrize((int) (short) -1, intArray12);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) 1, intArray12);
        ds.AvaliaMultMatrizes.multmatrize(0, intArray12);
        ds.AvaliaMultMatrizes.multmatrize((-1), intArray12);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) 0, intArray12);
        ds.AvaliaMultMatrizes.multmatrize(1, intArray12);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) 1, intArray12);
        ds.AvaliaMultMatrizes.multmatrize(0, intArray12);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) -1, intArray12);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) -1, intArray12);
        ds.AvaliaMultMatrizes.multmatrize(1, intArray12);
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[1]");
    }

    @Test
    public void test1664() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1664");
        int[] intArray12 = new int[] { (short) 1 };
        ds.AvaliaMultMatrizes.multmatrize((int) (short) -1, intArray12);
        ds.AvaliaMultMatrizes.multmatrize(0, intArray12);
        ds.AvaliaMultMatrizes.multmatrize(0, intArray12);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) -1, intArray12);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) 0, intArray12);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) -1, intArray12);
        ds.AvaliaMultMatrizes.multmatrize((-1), intArray12);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) 0, intArray12);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) 0, intArray12);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) 1, intArray12);
        // The following exception was thrown during execution in test generation
        try {
            ds.AvaliaMultMatrizes.multmatrize((int) '#', intArray12);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[1]");
    }

    @Test
    public void test1665() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1665");
        int[] intArray9 = new int[] { (short) 1 };
        ds.AvaliaMultMatrizes.multmatrize((int) (short) -1, intArray9);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) 1, intArray9);
        ds.AvaliaMultMatrizes.multmatrize(0, intArray9);
        ds.AvaliaMultMatrizes.multmatrize((-1), intArray9);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) 0, intArray9);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) -1, intArray9);
        ds.AvaliaMultMatrizes.multmatrize(0, intArray9);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) 0, intArray9);
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[1]");
    }

    @Test
    public void test1666() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1666");
        int[] intArray12 = new int[] { (short) 1 };
        ds.AvaliaMultMatrizes.multmatrize((int) (short) -1, intArray12);
        ds.AvaliaMultMatrizes.multmatrize(0, intArray12);
        ds.AvaliaMultMatrizes.multmatrize(0, intArray12);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) -1, intArray12);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) 1, intArray12);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) 0, intArray12);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) -1, intArray12);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) -1, intArray12);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) 1, intArray12);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) -1, intArray12);
        // The following exception was thrown during execution in test generation
        try {
            ds.AvaliaMultMatrizes.multmatrize(10, intArray12);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[1]");
    }

    @Test
    public void test1667() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1667");
        int[] intArray13 = new int[] { (-1), 1, 0, '#', 100, (short) -1 };
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) -1, intArray13);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) 0, intArray13);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) 0, intArray13);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) -1, intArray13);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) 1, intArray13);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) -1, intArray13);
        // The following exception was thrown during execution in test generation
        try {
            ds.AvaliaMultMatrizes.multmatrize(10, intArray13);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[-1, 1, 0, 35, 100, -1]");
    }

    @Test
    public void test1668() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1668");
        int[] intArray10 = new int[] { (short) 1 };
        ds.AvaliaMultMatrizes.multmatrize((int) (short) -1, intArray10);
        ds.AvaliaMultMatrizes.multmatrize(0, intArray10);
        ds.AvaliaMultMatrizes.multmatrize(0, intArray10);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) -1, intArray10);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) 0, intArray10);
        ds.AvaliaMultMatrizes.multmatrize(0, intArray10);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) 1, intArray10);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) 1, intArray10);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) -1, intArray10);
        java.lang.Class<?> wildcardClass20 = intArray10.getClass();
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[1]");
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test1669() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1669");
        int[] intArray10 = new int[] { (short) 1 };
        ds.AvaliaMultMatrizes.multmatrize((int) (short) -1, intArray10);
        ds.AvaliaMultMatrizes.multmatrize(0, intArray10);
        ds.AvaliaMultMatrizes.multmatrize(0, intArray10);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) -1, intArray10);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) 0, intArray10);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) -1, intArray10);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) 0, intArray10);
        ds.AvaliaMultMatrizes.multmatrize(0, intArray10);
        // The following exception was thrown during execution in test generation
        try {
            ds.AvaliaMultMatrizes.multmatrize(10, intArray10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[1]");
    }

    @Test
    public void test1670() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1670");
        int[] intArray13 = new int[] { (short) 1 };
        ds.AvaliaMultMatrizes.multmatrize((int) (short) -1, intArray13);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) 1, intArray13);
        ds.AvaliaMultMatrizes.multmatrize(0, intArray13);
        ds.AvaliaMultMatrizes.multmatrize((-1), intArray13);
        ds.AvaliaMultMatrizes.multmatrize(0, intArray13);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) -1, intArray13);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) 1, intArray13);
        ds.AvaliaMultMatrizes.multmatrize(0, intArray13);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) -1, intArray13);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) -1, intArray13);
        ds.AvaliaMultMatrizes.multmatrize(0, intArray13);
        ds.AvaliaMultMatrizes.multmatrize(0, intArray13);
        java.lang.Class<?> wildcardClass26 = intArray13.getClass();
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[1]");
        org.junit.Assert.assertNotNull(wildcardClass26);
    }

    @Test
    public void test1671() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1671");
        int[] intArray6 = new int[] { (short) 1 };
        ds.AvaliaMultMatrizes.multmatrize((int) (short) -1, intArray6);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) 1, intArray6);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) 1, intArray6);
        ds.AvaliaMultMatrizes.multmatrize((-1), intArray6);
        // The following exception was thrown during execution in test generation
        try {
            ds.AvaliaMultMatrizes.multmatrize((int) '#', intArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[1]");
    }

    @Test
    public void test1672() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1672");
        int[] intArray12 = new int[] { (-1), 1, 0, '#', 100, (short) -1 };
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) -1, intArray12);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) 0, intArray12);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) 0, intArray12);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) -1, intArray12);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) -1, intArray12);
        // The following exception was thrown during execution in test generation
        try {
            ds.AvaliaMultMatrizes.multmatrize((int) (byte) 10, intArray12);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[-1, 1, 0, 35, 100, -1]");
    }

    @Test
    public void test1673() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1673");
        int[] intArray6 = new int[] { (short) 1 };
        ds.AvaliaMultMatrizes.multmatrize((int) (short) -1, intArray6);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) 0, intArray6);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) -1, intArray6);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) -1, intArray6);
        // The following exception was thrown during execution in test generation
        try {
            ds.AvaliaMultMatrizes.multmatrize((int) '#', intArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[1]");
    }

    @Test
    public void test1674() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1674");
        int[] intArray15 = new int[] { (short) 1 };
        ds.AvaliaMultMatrizes.multmatrize((int) (short) -1, intArray15);
        ds.AvaliaMultMatrizes.multmatrize(0, intArray15);
        ds.AvaliaMultMatrizes.multmatrize(0, intArray15);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) -1, intArray15);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) 0, intArray15);
        ds.AvaliaMultMatrizes.multmatrize(0, intArray15);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) 0, intArray15);
        ds.AvaliaMultMatrizes.multmatrize((-1), intArray15);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) 1, intArray15);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) -1, intArray15);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) -1, intArray15);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) 0, intArray15);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) 0, intArray15);
        // The following exception was thrown during execution in test generation
        try {
            ds.AvaliaMultMatrizes.multmatrize(10, intArray15);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[1]");
    }

    @Test
    public void test1675() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1675");
        int[] intArray9 = new int[] { (short) 1 };
        ds.AvaliaMultMatrizes.multmatrize((int) (short) -1, intArray9);
        ds.AvaliaMultMatrizes.multmatrize(0, intArray9);
        ds.AvaliaMultMatrizes.multmatrize(0, intArray9);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) -1, intArray9);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) 0, intArray9);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) 1, intArray9);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) 1, intArray9);
        // The following exception was thrown during execution in test generation
        try {
            ds.AvaliaMultMatrizes.multmatrize((int) (byte) 100, intArray9);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[1]");
    }

    @Test
    public void test1676() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1676");
        int[] intArray7 = new int[] { (short) 1 };
        ds.AvaliaMultMatrizes.multmatrize((int) (short) -1, intArray7);
        ds.AvaliaMultMatrizes.multmatrize(0, intArray7);
        ds.AvaliaMultMatrizes.multmatrize(0, intArray7);
        ds.AvaliaMultMatrizes.multmatrize(1, intArray7);
        ds.AvaliaMultMatrizes.multmatrize(0, intArray7);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) 1, intArray7);
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[1]");
    }

    @Test
    public void test1677() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1677");
        int[] intArray14 = new int[] { (short) 1 };
        ds.AvaliaMultMatrizes.multmatrize((int) (short) -1, intArray14);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) 1, intArray14);
        ds.AvaliaMultMatrizes.multmatrize(0, intArray14);
        ds.AvaliaMultMatrizes.multmatrize((-1), intArray14);
        ds.AvaliaMultMatrizes.multmatrize(0, intArray14);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) -1, intArray14);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) 1, intArray14);
        ds.AvaliaMultMatrizes.multmatrize(0, intArray14);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) -1, intArray14);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) -1, intArray14);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) 1, intArray14);
        ds.AvaliaMultMatrizes.multmatrize(0, intArray14);
        // The following exception was thrown during execution in test generation
        try {
            ds.AvaliaMultMatrizes.multmatrize((int) (short) 10, intArray14);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[1]");
    }

    @Test
    public void test1678() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1678");
        int[] intArray5 = new int[] { (short) 1 };
        ds.AvaliaMultMatrizes.multmatrize((int) (short) -1, intArray5);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) 1, intArray5);
        ds.AvaliaMultMatrizes.multmatrize(0, intArray5);
        ds.AvaliaMultMatrizes.multmatrize(0, intArray5);
        java.lang.Class<?> wildcardClass10 = intArray5.getClass();
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[1]");
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test1679() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1679");
        int[] intArray6 = new int[] { (short) 1 };
        ds.AvaliaMultMatrizes.multmatrize((int) (short) -1, intArray6);
        ds.AvaliaMultMatrizes.multmatrize(0, intArray6);
        ds.AvaliaMultMatrizes.multmatrize(0, intArray6);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) -1, intArray6);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) -1, intArray6);
        java.lang.Class<?> wildcardClass12 = intArray6.getClass();
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[1]");
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test1680() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1680");
        int[] intArray12 = new int[] { (short) 1 };
        ds.AvaliaMultMatrizes.multmatrize((int) (short) -1, intArray12);
        ds.AvaliaMultMatrizes.multmatrize(0, intArray12);
        ds.AvaliaMultMatrizes.multmatrize(0, intArray12);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) -1, intArray12);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) 0, intArray12);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) 1, intArray12);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) -1, intArray12);
        ds.AvaliaMultMatrizes.multmatrize(0, intArray12);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) -1, intArray12);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) 0, intArray12);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) 1, intArray12);
        java.lang.Class<?> wildcardClass24 = intArray12.getClass();
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[1]");
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test1681() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1681");
        int[] intArray10 = new int[] { (short) 1 };
        ds.AvaliaMultMatrizes.multmatrize((int) (short) -1, intArray10);
        ds.AvaliaMultMatrizes.multmatrize(0, intArray10);
        ds.AvaliaMultMatrizes.multmatrize(0, intArray10);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) -1, intArray10);
        ds.AvaliaMultMatrizes.multmatrize(1, intArray10);
        ds.AvaliaMultMatrizes.multmatrize(1, intArray10);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) -1, intArray10);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) 0, intArray10);
        // The following exception was thrown during execution in test generation
        try {
            ds.AvaliaMultMatrizes.multmatrize((int) '#', intArray10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[1]");
    }

    @Test
    public void test1682() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1682");
        int[] intArray8 = new int[] { (short) 1 };
        ds.AvaliaMultMatrizes.multmatrize((int) (short) -1, intArray8);
        ds.AvaliaMultMatrizes.multmatrize(0, intArray8);
        ds.AvaliaMultMatrizes.multmatrize(0, intArray8);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) -1, intArray8);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) 0, intArray8);
        ds.AvaliaMultMatrizes.multmatrize((-1), intArray8);
        // The following exception was thrown during execution in test generation
        try {
            ds.AvaliaMultMatrizes.multmatrize((int) (short) 100, intArray8);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[1]");
    }

    @Test
    public void test1683() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1683");
        int[] intArray13 = new int[] { (-1), 1, 0, '#', 100, (short) -1 };
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) -1, intArray13);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) 0, intArray13);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) 0, intArray13);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) 0, intArray13);
        ds.AvaliaMultMatrizes.multmatrize((-1), intArray13);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) -1, intArray13);
        // The following exception was thrown during execution in test generation
        try {
            ds.AvaliaMultMatrizes.multmatrize((int) (short) 100, intArray13);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[-1, 1, 0, 35, 100, -1]");
    }

    @Test
    public void test1684() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1684");
        int[] intArray13 = new int[] { (short) 1 };
        ds.AvaliaMultMatrizes.multmatrize((int) (short) -1, intArray13);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) 1, intArray13);
        ds.AvaliaMultMatrizes.multmatrize(0, intArray13);
        ds.AvaliaMultMatrizes.multmatrize((-1), intArray13);
        ds.AvaliaMultMatrizes.multmatrize(0, intArray13);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) -1, intArray13);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) 1, intArray13);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) -1, intArray13);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) 1, intArray13);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) -1, intArray13);
        ds.AvaliaMultMatrizes.multmatrize(1, intArray13);
        ds.AvaliaMultMatrizes.multmatrize(0, intArray13);
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[1]");
    }

    @Test
    public void test1685() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1685");
        int[] intArray10 = new int[] { (short) 1 };
        ds.AvaliaMultMatrizes.multmatrize((int) (short) -1, intArray10);
        ds.AvaliaMultMatrizes.multmatrize(0, intArray10);
        ds.AvaliaMultMatrizes.multmatrize(0, intArray10);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) -1, intArray10);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) 0, intArray10);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) 1, intArray10);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) 0, intArray10);
        ds.AvaliaMultMatrizes.multmatrize(0, intArray10);
        // The following exception was thrown during execution in test generation
        try {
            ds.AvaliaMultMatrizes.multmatrize(100, intArray10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[1]");
    }

    @Test
    public void test1686() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1686");
        int[] intArray9 = new int[] { (-1) };
        ds.AvaliaMultMatrizes.multmatrize((-1), intArray9);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) -1, intArray9);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) -1, intArray9);
        ds.AvaliaMultMatrizes.multmatrize(0, intArray9);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) -1, intArray9);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) 1, intArray9);
        ds.AvaliaMultMatrizes.multmatrize((-1), intArray9);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) 0, intArray9);
        java.lang.Class<?> wildcardClass18 = intArray9.getClass();
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[-1]");
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test1687() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1687");
        int[] intArray7 = new int[] { (byte) 10, (short) 1, (short) 1, (short) 10 };
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) -1, intArray7);
        ds.AvaliaMultMatrizes.multmatrize((-1), intArray7);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) -1, intArray7);
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[10, 1, 1, 10]");
    }

    @Test
    public void test1688() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1688");
        int[] intArray9 = new int[] { (short) 1 };
        ds.AvaliaMultMatrizes.multmatrize((int) (short) -1, intArray9);
        ds.AvaliaMultMatrizes.multmatrize(0, intArray9);
        ds.AvaliaMultMatrizes.multmatrize(0, intArray9);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) 1, intArray9);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) 0, intArray9);
        ds.AvaliaMultMatrizes.multmatrize((-1), intArray9);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) -1, intArray9);
        ds.AvaliaMultMatrizes.multmatrize(0, intArray9);
        java.lang.Class<?> wildcardClass18 = intArray9.getClass();
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[1]");
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test1689() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1689");
        int[] intArray7 = new int[] { (short) 1 };
        ds.AvaliaMultMatrizes.multmatrize((int) (short) -1, intArray7);
        ds.AvaliaMultMatrizes.multmatrize(0, intArray7);
        ds.AvaliaMultMatrizes.multmatrize(0, intArray7);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) -1, intArray7);
        ds.AvaliaMultMatrizes.multmatrize(1, intArray7);
        ds.AvaliaMultMatrizes.multmatrize(1, intArray7);
        java.lang.Class<?> wildcardClass14 = intArray7.getClass();
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[1]");
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test1690() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1690");
        int[] intArray9 = new int[] { (short) 1 };
        ds.AvaliaMultMatrizes.multmatrize((int) (short) -1, intArray9);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) 1, intArray9);
        ds.AvaliaMultMatrizes.multmatrize(0, intArray9);
        ds.AvaliaMultMatrizes.multmatrize((-1), intArray9);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) 0, intArray9);
        ds.AvaliaMultMatrizes.multmatrize(1, intArray9);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) -1, intArray9);
        ds.AvaliaMultMatrizes.multmatrize(1, intArray9);
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[1]");
    }

    @Test
    public void test1691() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1691");
        int[] intArray7 = new int[] { (short) 1, 1, (byte) 10, 100, (short) -1 };
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) -1, intArray7);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) -1, intArray7);
        java.lang.Class<?> wildcardClass10 = intArray7.getClass();
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[1, 1, 10, 100, -1]");
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test1692() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1692");
        int[] intArray12 = new int[] { (short) 1 };
        ds.AvaliaMultMatrizes.multmatrize((int) (short) -1, intArray12);
        ds.AvaliaMultMatrizes.multmatrize(0, intArray12);
        ds.AvaliaMultMatrizes.multmatrize(0, intArray12);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) -1, intArray12);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) 0, intArray12);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) 1, intArray12);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) -1, intArray12);
        ds.AvaliaMultMatrizes.multmatrize(0, intArray12);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) -1, intArray12);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) -1, intArray12);
        // The following exception was thrown during execution in test generation
        try {
            ds.AvaliaMultMatrizes.multmatrize((int) '4', intArray12);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[1]");
    }

    @Test
    public void test1693() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1693");
        int[] intArray8 = new int[] { (-1) };
        ds.AvaliaMultMatrizes.multmatrize((-1), intArray8);
        ds.AvaliaMultMatrizes.multmatrize(1, intArray8);
        ds.AvaliaMultMatrizes.multmatrize((-1), intArray8);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) 0, intArray8);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) -1, intArray8);
        ds.AvaliaMultMatrizes.multmatrize(1, intArray8);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) -1, intArray8);
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[-1]");
    }

    @Test
    public void test1694() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1694");
        int[] intArray13 = new int[] { (short) 1 };
        ds.AvaliaMultMatrizes.multmatrize((int) (short) -1, intArray13);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) 1, intArray13);
        ds.AvaliaMultMatrizes.multmatrize(0, intArray13);
        ds.AvaliaMultMatrizes.multmatrize((-1), intArray13);
        ds.AvaliaMultMatrizes.multmatrize(0, intArray13);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) -1, intArray13);
        ds.AvaliaMultMatrizes.multmatrize(0, intArray13);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) 1, intArray13);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) 1, intArray13);
        ds.AvaliaMultMatrizes.multmatrize((-1), intArray13);
        ds.AvaliaMultMatrizes.multmatrize(0, intArray13);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) 0, intArray13);
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[1]");
    }

    @Test
    public void test1695() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1695");
        int[] intArray12 = new int[] { (-1), 1, 0, '#', 100, (short) -1 };
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) -1, intArray12);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) 0, intArray12);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) 0, intArray12);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) 0, intArray12);
        ds.AvaliaMultMatrizes.multmatrize(1, intArray12);
        // The following exception was thrown during execution in test generation
        try {
            ds.AvaliaMultMatrizes.multmatrize((int) (byte) 100, intArray12);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[-1, 1, 0, 35, 100, -1]");
    }

    @Test
    public void test1696() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1696");
        int[] intArray16 = new int[] { (-1), 1, 0, '#', 100, (short) -1 };
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) -1, intArray16);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) 0, intArray16);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) 0, intArray16);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) -1, intArray16);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) 1, intArray16);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) 0, intArray16);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) 1, intArray16);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) 0, intArray16);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) 0, intArray16);
        ds.AvaliaMultMatrizes.multmatrize(0, intArray16);
        java.lang.Class<?> wildcardClass27 = intArray16.getClass();
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray16), "[-1, 1, 0, 35, 100, -1]");
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test1697() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1697");
        int[] intArray10 = new int[] { (-1), 1, 0, '#', 100, (short) -1 };
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) -1, intArray10);
        ds.AvaliaMultMatrizes.multmatrize(1, intArray10);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) -1, intArray10);
        // The following exception was thrown during execution in test generation
        try {
            ds.AvaliaMultMatrizes.multmatrize((int) 'a', intArray10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[-1, 1, 0, 35, 100, -1]");
    }

    @Test
    public void test1698() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1698");
        int[] intArray8 = new int[] { (short) 1 };
        ds.AvaliaMultMatrizes.multmatrize((int) (short) -1, intArray8);
        ds.AvaliaMultMatrizes.multmatrize(0, intArray8);
        ds.AvaliaMultMatrizes.multmatrize(0, intArray8);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) -1, intArray8);
        ds.AvaliaMultMatrizes.multmatrize(1, intArray8);
        ds.AvaliaMultMatrizes.multmatrize(1, intArray8);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) 0, intArray8);
        java.lang.Class<?> wildcardClass16 = intArray8.getClass();
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[1]");
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test1699() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1699");
        int[] intArray7 = new int[] { (byte) 10, (short) 1, (short) 1, (short) 10 };
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) -1, intArray7);
        ds.AvaliaMultMatrizes.multmatrize((-1), intArray7);
        ds.AvaliaMultMatrizes.multmatrize(0, intArray7);
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[10, 1, 1, 10]");
    }

    @Test
    public void test1700() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1700");
        int[] intArray15 = new int[] { (short) 1 };
        ds.AvaliaMultMatrizes.multmatrize((int) (short) -1, intArray15);
        ds.AvaliaMultMatrizes.multmatrize(0, intArray15);
        ds.AvaliaMultMatrizes.multmatrize(0, intArray15);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) -1, intArray15);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) 0, intArray15);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) 1, intArray15);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) -1, intArray15);
        ds.AvaliaMultMatrizes.multmatrize(0, intArray15);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) -1, intArray15);
        ds.AvaliaMultMatrizes.multmatrize(1, intArray15);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) -1, intArray15);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) -1, intArray15);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) 1, intArray15);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) 0, intArray15);
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[1]");
    }

    @Test
    public void test1701() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1701");
        int[] intArray10 = new int[] { (short) 1 };
        ds.AvaliaMultMatrizes.multmatrize((int) (short) -1, intArray10);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) 1, intArray10);
        ds.AvaliaMultMatrizes.multmatrize(0, intArray10);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) 0, intArray10);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) 0, intArray10);
        ds.AvaliaMultMatrizes.multmatrize(0, intArray10);
        ds.AvaliaMultMatrizes.multmatrize(1, intArray10);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) 1, intArray10);
        ds.AvaliaMultMatrizes.multmatrize(1, intArray10);
        java.lang.Class<?> wildcardClass20 = intArray10.getClass();
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[1]");
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test1702() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1702");
        int[] intArray11 = new int[] { (-1), 1, 0, '#', 100, (short) -1 };
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) -1, intArray11);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) 0, intArray11);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) 0, intArray11);
        ds.AvaliaMultMatrizes.multmatrize(0, intArray11);
        // The following exception was thrown during execution in test generation
        try {
            ds.AvaliaMultMatrizes.multmatrize((int) 'a', intArray11);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[-1, 1, 0, 35, 100, -1]");
    }

    @Test
    public void test1703() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1703");
        int[] intArray5 = new int[] { (-1) };
        ds.AvaliaMultMatrizes.multmatrize((-1), intArray5);
        ds.AvaliaMultMatrizes.multmatrize(1, intArray5);
        ds.AvaliaMultMatrizes.multmatrize((-1), intArray5);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) 0, intArray5);
        java.lang.Class<?> wildcardClass10 = intArray5.getClass();
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[-1]");
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test1704() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1704");
        int[] intArray8 = new int[] { (short) 1, 1, (byte) 10, 100, (short) -1 };
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) -1, intArray8);
        ds.AvaliaMultMatrizes.multmatrize(0, intArray8);
        // The following exception was thrown during execution in test generation
        try {
            ds.AvaliaMultMatrizes.multmatrize((int) (byte) 10, intArray8);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[1, 1, 10, 100, -1]");
    }

    @Test
    public void test1705() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1705");
        int[] intArray9 = new int[] { (short) 1 };
        ds.AvaliaMultMatrizes.multmatrize((int) (short) -1, intArray9);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) 1, intArray9);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) 1, intArray9);
        ds.AvaliaMultMatrizes.multmatrize((-1), intArray9);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) 1, intArray9);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) -1, intArray9);
        ds.AvaliaMultMatrizes.multmatrize(0, intArray9);
        // The following exception was thrown during execution in test generation
        try {
            ds.AvaliaMultMatrizes.multmatrize((int) '#', intArray9);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[1]");
    }

    @Test
    public void test1706() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1706");
        int[] intArray6 = new int[] { (byte) 10, (short) 1, (short) 1, (short) 10 };
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) -1, intArray6);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) 0, intArray6);
        java.lang.Class<?> wildcardClass9 = intArray6.getClass();
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[10, 1, 1, 10]");
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test1707() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1707");
        int[] intArray10 = new int[] { (-1) };
        ds.AvaliaMultMatrizes.multmatrize((-1), intArray10);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) -1, intArray10);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) -1, intArray10);
        ds.AvaliaMultMatrizes.multmatrize(0, intArray10);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) -1, intArray10);
        ds.AvaliaMultMatrizes.multmatrize(0, intArray10);
        ds.AvaliaMultMatrizes.multmatrize(0, intArray10);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) 1, intArray10);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) 1, intArray10);
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[-1]");
    }

    @Test
    public void test1708() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1708");
        int[] intArray11 = new int[] { (short) 1 };
        ds.AvaliaMultMatrizes.multmatrize((int) (short) -1, intArray11);
        ds.AvaliaMultMatrizes.multmatrize(0, intArray11);
        ds.AvaliaMultMatrizes.multmatrize(0, intArray11);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) -1, intArray11);
        ds.AvaliaMultMatrizes.multmatrize(0, intArray11);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) -1, intArray11);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) -1, intArray11);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) -1, intArray11);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) 1, intArray11);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) 1, intArray11);
        java.lang.Class<?> wildcardClass22 = intArray11.getClass();
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[1]");
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test1709() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1709");
        int[] intArray13 = new int[] { (short) 1 };
        ds.AvaliaMultMatrizes.multmatrize((int) (short) -1, intArray13);
        ds.AvaliaMultMatrizes.multmatrize(0, intArray13);
        ds.AvaliaMultMatrizes.multmatrize(0, intArray13);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) -1, intArray13);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) 0, intArray13);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) 1, intArray13);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) -1, intArray13);
        ds.AvaliaMultMatrizes.multmatrize(0, intArray13);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) -1, intArray13);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) 0, intArray13);
        ds.AvaliaMultMatrizes.multmatrize((-1), intArray13);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) 1, intArray13);
        java.lang.Class<?> wildcardClass26 = intArray13.getClass();
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[1]");
        org.junit.Assert.assertNotNull(wildcardClass26);
    }

    @Test
    public void test1710() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1710");
        int[] intArray10 = new int[] { (-1) };
        ds.AvaliaMultMatrizes.multmatrize((-1), intArray10);
        ds.AvaliaMultMatrizes.multmatrize(1, intArray10);
        ds.AvaliaMultMatrizes.multmatrize((-1), intArray10);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) 0, intArray10);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) 0, intArray10);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) 0, intArray10);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) 0, intArray10);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) 0, intArray10);
        ds.AvaliaMultMatrizes.multmatrize((-1), intArray10);
        java.lang.Class<?> wildcardClass20 = intArray10.getClass();
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[-1]");
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test1711() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1711");
        int[] intArray10 = new int[] { (short) 1 };
        ds.AvaliaMultMatrizes.multmatrize((int) (short) -1, intArray10);
        ds.AvaliaMultMatrizes.multmatrize(0, intArray10);
        ds.AvaliaMultMatrizes.multmatrize(0, intArray10);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) 1, intArray10);
        ds.AvaliaMultMatrizes.multmatrize(0, intArray10);
        ds.AvaliaMultMatrizes.multmatrize(0, intArray10);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) -1, intArray10);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) -1, intArray10);
        // The following exception was thrown during execution in test generation
        try {
            ds.AvaliaMultMatrizes.multmatrize((int) 'a', intArray10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[1]");
    }

    @Test
    public void test1712() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1712");
        int[] intArray10 = new int[] { (short) 1 };
        ds.AvaliaMultMatrizes.multmatrize((int) (short) -1, intArray10);
        ds.AvaliaMultMatrizes.multmatrize(0, intArray10);
        ds.AvaliaMultMatrizes.multmatrize(0, intArray10);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) -1, intArray10);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) 0, intArray10);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) -1, intArray10);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) 0, intArray10);
        ds.AvaliaMultMatrizes.multmatrize(0, intArray10);
        // The following exception was thrown during execution in test generation
        try {
            ds.AvaliaMultMatrizes.multmatrize(100, intArray10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[1]");
    }

    @Test
    public void test1713() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1713");
        int[] intArray11 = new int[] { (short) 1 };
        ds.AvaliaMultMatrizes.multmatrize((int) (short) -1, intArray11);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) 1, intArray11);
        ds.AvaliaMultMatrizes.multmatrize(0, intArray11);
        ds.AvaliaMultMatrizes.multmatrize((-1), intArray11);
        ds.AvaliaMultMatrizes.multmatrize(0, intArray11);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) -1, intArray11);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) 1, intArray11);
        ds.AvaliaMultMatrizes.multmatrize(0, intArray11);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) 0, intArray11);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) 0, intArray11);
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[1]");
    }

    @Test
    public void test1714() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1714");
        int[] intArray13 = new int[] { (short) 1 };
        ds.AvaliaMultMatrizes.multmatrize((int) (short) -1, intArray13);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) 1, intArray13);
        ds.AvaliaMultMatrizes.multmatrize(0, intArray13);
        ds.AvaliaMultMatrizes.multmatrize((-1), intArray13);
        ds.AvaliaMultMatrizes.multmatrize(0, intArray13);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) -1, intArray13);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) 1, intArray13);
        ds.AvaliaMultMatrizes.multmatrize(0, intArray13);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) -1, intArray13);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) -1, intArray13);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) 0, intArray13);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) -1, intArray13);
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[1]");
    }

    @Test
    public void test1715() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1715");
        int[] intArray12 = new int[] { (-1), 1, 0, '#', 100, (short) -1 };
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) -1, intArray12);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) 0, intArray12);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) 0, intArray12);
        ds.AvaliaMultMatrizes.multmatrize((-1), intArray12);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) -1, intArray12);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) 1, intArray12);
        java.lang.Class<?> wildcardClass19 = intArray12.getClass();
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[-1, 1, 0, 35, 100, -1]");
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test1716() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1716");
        int[] intArray5 = new int[] { (short) 1 };
        ds.AvaliaMultMatrizes.multmatrize((int) (short) -1, intArray5);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) 0, intArray5);
        ds.AvaliaMultMatrizes.multmatrize(1, intArray5);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) -1, intArray5);
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[1]");
    }

    @Test
    public void test1717() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1717");
        int[] intArray13 = new int[] { (short) 1 };
        ds.AvaliaMultMatrizes.multmatrize((int) (short) -1, intArray13);
        ds.AvaliaMultMatrizes.multmatrize(0, intArray13);
        ds.AvaliaMultMatrizes.multmatrize(0, intArray13);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) -1, intArray13);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) 0, intArray13);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) 1, intArray13);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) -1, intArray13);
        ds.AvaliaMultMatrizes.multmatrize(0, intArray13);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) -1, intArray13);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) 0, intArray13);
        ds.AvaliaMultMatrizes.multmatrize((-1), intArray13);
        // The following exception was thrown during execution in test generation
        try {
            ds.AvaliaMultMatrizes.multmatrize((int) '#', intArray13);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[1]");
    }

    @Test
    public void test1718() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1718");
        int[] intArray13 = new int[] { (short) 1 };
        ds.AvaliaMultMatrizes.multmatrize((int) (short) -1, intArray13);
        ds.AvaliaMultMatrizes.multmatrize(0, intArray13);
        ds.AvaliaMultMatrizes.multmatrize(0, intArray13);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) -1, intArray13);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) 0, intArray13);
        ds.AvaliaMultMatrizes.multmatrize(0, intArray13);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) 1, intArray13);
        ds.AvaliaMultMatrizes.multmatrize(0, intArray13);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) -1, intArray13);
        ds.AvaliaMultMatrizes.multmatrize(0, intArray13);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) -1, intArray13);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) -1, intArray13);
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[1]");
    }

    @Test
    public void test1719() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1719");
        int[] intArray12 = new int[] { (short) 1 };
        ds.AvaliaMultMatrizes.multmatrize((int) (short) -1, intArray12);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) 1, intArray12);
        ds.AvaliaMultMatrizes.multmatrize(0, intArray12);
        ds.AvaliaMultMatrizes.multmatrize((-1), intArray12);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) 0, intArray12);
        ds.AvaliaMultMatrizes.multmatrize(1, intArray12);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) 1, intArray12);
        ds.AvaliaMultMatrizes.multmatrize(0, intArray12);
        ds.AvaliaMultMatrizes.multmatrize(0, intArray12);
        ds.AvaliaMultMatrizes.multmatrize(0, intArray12);
        ds.AvaliaMultMatrizes.multmatrize(0, intArray12);
        java.lang.Class<?> wildcardClass24 = intArray12.getClass();
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[1]");
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test1720() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1720");
        int[] intArray5 = new int[] { (-1) };
        ds.AvaliaMultMatrizes.multmatrize((-1), intArray5);
        ds.AvaliaMultMatrizes.multmatrize(1, intArray5);
        ds.AvaliaMultMatrizes.multmatrize((-1), intArray5);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) 1, intArray5);
        java.lang.Class<?> wildcardClass10 = intArray5.getClass();
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[-1]");
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test1721() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1721");
        int[] intArray17 = new int[] { (-1), 1, 0, '#', 100, (short) -1 };
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) -1, intArray17);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) 0, intArray17);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) 0, intArray17);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) -1, intArray17);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) 1, intArray17);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) 0, intArray17);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) 1, intArray17);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) 0, intArray17);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) 0, intArray17);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) -1, intArray17);
        // The following exception was thrown during execution in test generation
        try {
            ds.AvaliaMultMatrizes.multmatrize((int) ' ', intArray17);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[-1, 1, 0, 35, 100, -1]");
    }

    @Test
    public void test1722() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1722");
        int[] intArray6 = new int[] { (short) 1 };
        ds.AvaliaMultMatrizes.multmatrize((int) (short) -1, intArray6);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) 1, intArray6);
        ds.AvaliaMultMatrizes.multmatrize(0, intArray6);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) -1, intArray6);
        ds.AvaliaMultMatrizes.multmatrize(1, intArray6);
        java.lang.Class<?> wildcardClass12 = intArray6.getClass();
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[1]");
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test1723() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1723");
        int[] intArray13 = new int[] { (short) 1 };
        ds.AvaliaMultMatrizes.multmatrize((int) (short) -1, intArray13);
        ds.AvaliaMultMatrizes.multmatrize(0, intArray13);
        ds.AvaliaMultMatrizes.multmatrize(0, intArray13);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) -1, intArray13);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) 0, intArray13);
        ds.AvaliaMultMatrizes.multmatrize(0, intArray13);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) 0, intArray13);
        ds.AvaliaMultMatrizes.multmatrize((-1), intArray13);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) 1, intArray13);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) -1, intArray13);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) 1, intArray13);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) 0, intArray13);
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[1]");
    }

    @Test
    public void test1724() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1724");
        int[] intArray10 = new int[] { (short) 1 };
        ds.AvaliaMultMatrizes.multmatrize((int) (short) -1, intArray10);
        ds.AvaliaMultMatrizes.multmatrize(0, intArray10);
        ds.AvaliaMultMatrizes.multmatrize(0, intArray10);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) -1, intArray10);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) 1, intArray10);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) 0, intArray10);
        ds.AvaliaMultMatrizes.multmatrize(0, intArray10);
        ds.AvaliaMultMatrizes.multmatrize(1, intArray10);
        // The following exception was thrown during execution in test generation
        try {
            ds.AvaliaMultMatrizes.multmatrize((int) (byte) 100, intArray10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[1]");
    }

    @Test
    public void test1725() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1725");
        int[] intArray14 = new int[] { (short) 1 };
        ds.AvaliaMultMatrizes.multmatrize((int) (short) -1, intArray14);
        ds.AvaliaMultMatrizes.multmatrize(0, intArray14);
        ds.AvaliaMultMatrizes.multmatrize(0, intArray14);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) -1, intArray14);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) 0, intArray14);
        ds.AvaliaMultMatrizes.multmatrize(0, intArray14);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) 1, intArray14);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) 1, intArray14);
        ds.AvaliaMultMatrizes.multmatrize((-1), intArray14);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) 1, intArray14);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) -1, intArray14);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) 0, intArray14);
        ds.AvaliaMultMatrizes.multmatrize(1, intArray14);
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[1]");
    }

    @Test
    public void test1726() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1726");
        int[] intArray9 = new int[] { (short) 1 };
        ds.AvaliaMultMatrizes.multmatrize((int) (short) -1, intArray9);
        ds.AvaliaMultMatrizes.multmatrize(0, intArray9);
        ds.AvaliaMultMatrizes.multmatrize(0, intArray9);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) -1, intArray9);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) 0, intArray9);
        ds.AvaliaMultMatrizes.multmatrize(0, intArray9);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) 0, intArray9);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) 0, intArray9);
        java.lang.Class<?> wildcardClass18 = intArray9.getClass();
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[1]");
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test1727() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1727");
        int[] intArray6 = new int[] { (-1) };
        ds.AvaliaMultMatrizes.multmatrize((-1), intArray6);
        ds.AvaliaMultMatrizes.multmatrize(1, intArray6);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) -1, intArray6);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) -1, intArray6);
        // The following exception was thrown during execution in test generation
        try {
            ds.AvaliaMultMatrizes.multmatrize(100, intArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[-1]");
    }

    @Test
    public void test1728() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1728");
        int[] intArray13 = new int[] { (short) 1 };
        ds.AvaliaMultMatrizes.multmatrize((int) (short) -1, intArray13);
        ds.AvaliaMultMatrizes.multmatrize(0, intArray13);
        ds.AvaliaMultMatrizes.multmatrize(0, intArray13);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) -1, intArray13);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) 0, intArray13);
        ds.AvaliaMultMatrizes.multmatrize(0, intArray13);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) 1, intArray13);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) 1, intArray13);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) -1, intArray13);
        ds.AvaliaMultMatrizes.multmatrize(1, intArray13);
        ds.AvaliaMultMatrizes.multmatrize(0, intArray13);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) 0, intArray13);
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[1]");
    }

    @Test
    public void test1729() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1729");
        int[] intArray10 = new int[] { (-1) };
        ds.AvaliaMultMatrizes.multmatrize((-1), intArray10);
        ds.AvaliaMultMatrizes.multmatrize(1, intArray10);
        ds.AvaliaMultMatrizes.multmatrize((-1), intArray10);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) 0, intArray10);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) -1, intArray10);
        ds.AvaliaMultMatrizes.multmatrize(1, intArray10);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) -1, intArray10);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) 1, intArray10);
        // The following exception was thrown during execution in test generation
        try {
            ds.AvaliaMultMatrizes.multmatrize((int) (short) 10, intArray10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[-1]");
    }

    @Test
    public void test1730() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1730");
        int[] intArray10 = new int[] { (-1) };
        ds.AvaliaMultMatrizes.multmatrize((-1), intArray10);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) -1, intArray10);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) -1, intArray10);
        ds.AvaliaMultMatrizes.multmatrize(0, intArray10);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) -1, intArray10);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) 1, intArray10);
        ds.AvaliaMultMatrizes.multmatrize((-1), intArray10);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) 1, intArray10);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) -1, intArray10);
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[-1]");
    }

    @Test
    public void test1731() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1731");
        int[] intArray12 = new int[] { (short) 1 };
        ds.AvaliaMultMatrizes.multmatrize((int) (short) -1, intArray12);
        ds.AvaliaMultMatrizes.multmatrize(0, intArray12);
        ds.AvaliaMultMatrizes.multmatrize(0, intArray12);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) 1, intArray12);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) 0, intArray12);
        ds.AvaliaMultMatrizes.multmatrize((-1), intArray12);
        ds.AvaliaMultMatrizes.multmatrize((-1), intArray12);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) 0, intArray12);
        ds.AvaliaMultMatrizes.multmatrize(0, intArray12);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) -1, intArray12);
        ds.AvaliaMultMatrizes.multmatrize(1, intArray12);
        java.lang.Class<?> wildcardClass24 = intArray12.getClass();
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[1]");
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test1732() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1732");
        int[] intArray11 = new int[] { (short) 1 };
        ds.AvaliaMultMatrizes.multmatrize((int) (short) -1, intArray11);
        ds.AvaliaMultMatrizes.multmatrize(0, intArray11);
        ds.AvaliaMultMatrizes.multmatrize(0, intArray11);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) 1, intArray11);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) 0, intArray11);
        ds.AvaliaMultMatrizes.multmatrize((-1), intArray11);
        ds.AvaliaMultMatrizes.multmatrize(1, intArray11);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) 1, intArray11);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) 1, intArray11);
        // The following exception was thrown during execution in test generation
        try {
            ds.AvaliaMultMatrizes.multmatrize((int) 'a', intArray11);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[1]");
    }

    @Test
    public void test1733() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1733");
        int[] intArray14 = new int[] { (short) 1 };
        ds.AvaliaMultMatrizes.multmatrize((int) (short) -1, intArray14);
        ds.AvaliaMultMatrizes.multmatrize(0, intArray14);
        ds.AvaliaMultMatrizes.multmatrize(0, intArray14);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) -1, intArray14);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) 0, intArray14);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) 1, intArray14);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) 1, intArray14);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) 0, intArray14);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) 1, intArray14);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) -1, intArray14);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) 0, intArray14);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) 1, intArray14);
        ds.AvaliaMultMatrizes.multmatrize(1, intArray14);
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[1]");
    }

    @Test
    public void test1734() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1734");
        int[] intArray11 = new int[] { (short) 1 };
        ds.AvaliaMultMatrizes.multmatrize((int) (short) -1, intArray11);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) 1, intArray11);
        ds.AvaliaMultMatrizes.multmatrize(0, intArray11);
        ds.AvaliaMultMatrizes.multmatrize((-1), intArray11);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) 0, intArray11);
        ds.AvaliaMultMatrizes.multmatrize(1, intArray11);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) 1, intArray11);
        ds.AvaliaMultMatrizes.multmatrize(0, intArray11);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) 0, intArray11);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) 0, intArray11);
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[1]");
    }

    @Test
    public void test1735() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1735");
        int[] intArray14 = new int[] { (-1), 1, 0, '#', 100, (short) -1 };
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) -1, intArray14);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) 0, intArray14);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) 0, intArray14);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) 0, intArray14);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) 1, intArray14);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) 0, intArray14);
        ds.AvaliaMultMatrizes.multmatrize(0, intArray14);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) 1, intArray14);
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[-1, 1, 0, 35, 100, -1]");
    }

    @Test
    public void test1736() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1736");
        int[] intArray10 = new int[] { (byte) 10, (short) 1, (short) 1, (short) 10 };
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) -1, intArray10);
        ds.AvaliaMultMatrizes.multmatrize((-1), intArray10);
        ds.AvaliaMultMatrizes.multmatrize(1, intArray10);
        ds.AvaliaMultMatrizes.multmatrize(0, intArray10);
        ds.AvaliaMultMatrizes.multmatrize(0, intArray10);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) 1, intArray10);
        java.lang.Class<?> wildcardClass17 = intArray10.getClass();
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[10, 1, 1, 10]");
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test1737() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1737");
        int[] intArray11 = new int[] { (short) 1 };
        ds.AvaliaMultMatrizes.multmatrize((int) (short) -1, intArray11);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) 1, intArray11);
        ds.AvaliaMultMatrizes.multmatrize(0, intArray11);
        ds.AvaliaMultMatrizes.multmatrize((-1), intArray11);
        ds.AvaliaMultMatrizes.multmatrize(0, intArray11);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) -1, intArray11);
        ds.AvaliaMultMatrizes.multmatrize(0, intArray11);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) 0, intArray11);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) -1, intArray11);
        // The following exception was thrown during execution in test generation
        try {
            ds.AvaliaMultMatrizes.multmatrize((int) (short) 10, intArray11);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[1]");
    }

    @Test
    public void test1738() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1738");
        int[] intArray8 = new int[] { (-1) };
        ds.AvaliaMultMatrizes.multmatrize((-1), intArray8);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) -1, intArray8);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) -1, intArray8);
        ds.AvaliaMultMatrizes.multmatrize(0, intArray8);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) -1, intArray8);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) -1, intArray8);
        // The following exception was thrown during execution in test generation
        try {
            ds.AvaliaMultMatrizes.multmatrize((int) '#', intArray8);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[-1]");
    }

    @Test
    public void test1739() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1739");
        int[] intArray12 = new int[] { (short) 1 };
        ds.AvaliaMultMatrizes.multmatrize((int) (short) -1, intArray12);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) 1, intArray12);
        ds.AvaliaMultMatrizes.multmatrize(0, intArray12);
        ds.AvaliaMultMatrizes.multmatrize((-1), intArray12);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) 0, intArray12);
        ds.AvaliaMultMatrizes.multmatrize(1, intArray12);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) 1, intArray12);
        ds.AvaliaMultMatrizes.multmatrize(0, intArray12);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) -1, intArray12);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) -1, intArray12);
        ds.AvaliaMultMatrizes.multmatrize((-1), intArray12);
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[1]");
    }

    @Test
    public void test1740() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1740");
        int[] intArray11 = new int[] { (byte) 10, (short) 1, (short) 1, (short) 10 };
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) -1, intArray11);
        ds.AvaliaMultMatrizes.multmatrize((-1), intArray11);
        ds.AvaliaMultMatrizes.multmatrize(1, intArray11);
        ds.AvaliaMultMatrizes.multmatrize(0, intArray11);
        ds.AvaliaMultMatrizes.multmatrize(1, intArray11);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) -1, intArray11);
        ds.AvaliaMultMatrizes.multmatrize(1, intArray11);
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[10, 1, 1, 10]");
    }

    @Test
    public void test1741() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1741");
        int[] intArray12 = new int[] { (-1), 1, 0, '#', 100, (short) -1 };
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) -1, intArray12);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) 0, intArray12);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) 0, intArray12);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) -1, intArray12);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) -1, intArray12);
        // The following exception was thrown during execution in test generation
        try {
            ds.AvaliaMultMatrizes.multmatrize((int) ' ', intArray12);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[-1, 1, 0, 35, 100, -1]");
    }

    @Test
    public void test1742() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1742");
        int[] intArray7 = new int[] { (short) 1 };
        ds.AvaliaMultMatrizes.multmatrize((int) (short) -1, intArray7);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) 1, intArray7);
        ds.AvaliaMultMatrizes.multmatrize(0, intArray7);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) 1, intArray7);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) -1, intArray7);
        // The following exception was thrown during execution in test generation
        try {
            ds.AvaliaMultMatrizes.multmatrize((int) (short) 10, intArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[1]");
    }

    @Test
    public void test1743() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1743");
        int[] intArray8 = new int[] { (short) 1 };
        ds.AvaliaMultMatrizes.multmatrize((int) (short) -1, intArray8);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) 1, intArray8);
        ds.AvaliaMultMatrizes.multmatrize(0, intArray8);
        ds.AvaliaMultMatrizes.multmatrize((-1), intArray8);
        ds.AvaliaMultMatrizes.multmatrize(0, intArray8);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) 0, intArray8);
        ds.AvaliaMultMatrizes.multmatrize(1, intArray8);
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[1]");
    }

    @Test
    public void test1744() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1744");
        int[] intArray12 = new int[] { (short) 1 };
        ds.AvaliaMultMatrizes.multmatrize((int) (short) -1, intArray12);
        ds.AvaliaMultMatrizes.multmatrize(0, intArray12);
        ds.AvaliaMultMatrizes.multmatrize(0, intArray12);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) 1, intArray12);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) 0, intArray12);
        ds.AvaliaMultMatrizes.multmatrize((-1), intArray12);
        ds.AvaliaMultMatrizes.multmatrize((-1), intArray12);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) 0, intArray12);
        ds.AvaliaMultMatrizes.multmatrize(0, intArray12);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) 1, intArray12);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) 0, intArray12);
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[1]");
    }

    @Test
    public void test1745() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1745");
        int[] intArray12 = new int[] { (short) 1 };
        ds.AvaliaMultMatrizes.multmatrize((int) (short) -1, intArray12);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) 1, intArray12);
        ds.AvaliaMultMatrizes.multmatrize(0, intArray12);
        ds.AvaliaMultMatrizes.multmatrize((-1), intArray12);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) 0, intArray12);
        ds.AvaliaMultMatrizes.multmatrize(1, intArray12);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) 1, intArray12);
        ds.AvaliaMultMatrizes.multmatrize(0, intArray12);
        ds.AvaliaMultMatrizes.multmatrize(0, intArray12);
        ds.AvaliaMultMatrizes.multmatrize(0, intArray12);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) 0, intArray12);
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[1]");
    }

    @Test
    public void test1746() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1746");
        int[] intArray10 = new int[] { (short) 1 };
        ds.AvaliaMultMatrizes.multmatrize((int) (short) -1, intArray10);
        ds.AvaliaMultMatrizes.multmatrize(0, intArray10);
        ds.AvaliaMultMatrizes.multmatrize(0, intArray10);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) -1, intArray10);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) 0, intArray10);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) 1, intArray10);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) 0, intArray10);
        ds.AvaliaMultMatrizes.multmatrize(0, intArray10);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) 1, intArray10);
        java.lang.Class<?> wildcardClass20 = intArray10.getClass();
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[1]");
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test1747() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1747");
        int[] intArray11 = new int[] { (short) 1 };
        ds.AvaliaMultMatrizes.multmatrize((int) (short) -1, intArray11);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) 1, intArray11);
        ds.AvaliaMultMatrizes.multmatrize(0, intArray11);
        ds.AvaliaMultMatrizes.multmatrize((-1), intArray11);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) 0, intArray11);
        ds.AvaliaMultMatrizes.multmatrize(1, intArray11);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) 1, intArray11);
        ds.AvaliaMultMatrizes.multmatrize(0, intArray11);
        ds.AvaliaMultMatrizes.multmatrize(0, intArray11);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) -1, intArray11);
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[1]");
    }

    @Test
    public void test1748() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1748");
        int[] intArray11 = new int[] { (short) 1 };
        ds.AvaliaMultMatrizes.multmatrize((int) (short) -1, intArray11);
        ds.AvaliaMultMatrizes.multmatrize(0, intArray11);
        ds.AvaliaMultMatrizes.multmatrize(0, intArray11);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) -1, intArray11);
        ds.AvaliaMultMatrizes.multmatrize(0, intArray11);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) -1, intArray11);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) -1, intArray11);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) -1, intArray11);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) -1, intArray11);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) -1, intArray11);
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[1]");
    }

    @Test
    public void test1749() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1749");
        int[] intArray13 = new int[] { (short) 1 };
        ds.AvaliaMultMatrizes.multmatrize((int) (short) -1, intArray13);
        ds.AvaliaMultMatrizes.multmatrize(0, intArray13);
        ds.AvaliaMultMatrizes.multmatrize(0, intArray13);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) -1, intArray13);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) 0, intArray13);
        ds.AvaliaMultMatrizes.multmatrize(0, intArray13);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) 1, intArray13);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) 1, intArray13);
        ds.AvaliaMultMatrizes.multmatrize((-1), intArray13);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) -1, intArray13);
        ds.AvaliaMultMatrizes.multmatrize(0, intArray13);
        // The following exception was thrown during execution in test generation
        try {
            ds.AvaliaMultMatrizes.multmatrize((int) 'a', intArray13);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[1]");
    }

    @Test
    public void test1750() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1750");
        int[] intArray8 = new int[] { (byte) 10, (short) 1, (short) 1, (short) 10 };
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) -1, intArray8);
        ds.AvaliaMultMatrizes.multmatrize((-1), intArray8);
        ds.AvaliaMultMatrizes.multmatrize(1, intArray8);
        // The following exception was thrown during execution in test generation
        try {
            ds.AvaliaMultMatrizes.multmatrize(100, intArray8);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[10, 1, 1, 10]");
    }

    @Test
    public void test1751() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1751");
        int[] intArray10 = new int[] { (short) 1 };
        ds.AvaliaMultMatrizes.multmatrize((int) (short) -1, intArray10);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) 1, intArray10);
        ds.AvaliaMultMatrizes.multmatrize(0, intArray10);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) 1, intArray10);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) 0, intArray10);
        ds.AvaliaMultMatrizes.multmatrize(1, intArray10);
        ds.AvaliaMultMatrizes.multmatrize(0, intArray10);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) 0, intArray10);
        ds.AvaliaMultMatrizes.multmatrize((-1), intArray10);
        java.lang.Class<?> wildcardClass20 = intArray10.getClass();
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[1]");
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test1752() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1752");
        int[] intArray13 = new int[] { (short) 1 };
        ds.AvaliaMultMatrizes.multmatrize((int) (short) -1, intArray13);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) 1, intArray13);
        ds.AvaliaMultMatrizes.multmatrize(0, intArray13);
        ds.AvaliaMultMatrizes.multmatrize((-1), intArray13);
        ds.AvaliaMultMatrizes.multmatrize(0, intArray13);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) -1, intArray13);
        ds.AvaliaMultMatrizes.multmatrize(0, intArray13);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) 1, intArray13);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) 1, intArray13);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) -1, intArray13);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) -1, intArray13);
        // The following exception was thrown during execution in test generation
        try {
            ds.AvaliaMultMatrizes.multmatrize(100, intArray13);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[1]");
    }

    @Test
    public void test1753() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1753");
        int[] intArray14 = new int[] { (-1), 1, 0, '#', 100, (short) -1 };
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) -1, intArray14);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) 0, intArray14);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) 0, intArray14);
        ds.AvaliaMultMatrizes.multmatrize(0, intArray14);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) -1, intArray14);
        ds.AvaliaMultMatrizes.multmatrize(1, intArray14);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) -1, intArray14);
        // The following exception was thrown during execution in test generation
        try {
            ds.AvaliaMultMatrizes.multmatrize((int) ' ', intArray14);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[-1, 1, 0, 35, 100, -1]");
    }

    @Test
    public void test1754() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1754");
        int[] intArray15 = new int[] { (-1), 1, 0, '#', 100, (short) -1 };
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) -1, intArray15);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) 0, intArray15);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) 0, intArray15);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) -1, intArray15);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) 1, intArray15);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) 0, intArray15);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) 1, intArray15);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) 0, intArray15);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) 1, intArray15);
        java.lang.Class<?> wildcardClass25 = intArray15.getClass();
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[-1, 1, 0, 35, 100, -1]");
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test1755() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1755");
        int[] intArray12 = new int[] { (short) 1 };
        ds.AvaliaMultMatrizes.multmatrize((int) (short) -1, intArray12);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) 1, intArray12);
        ds.AvaliaMultMatrizes.multmatrize(0, intArray12);
        ds.AvaliaMultMatrizes.multmatrize((-1), intArray12);
        ds.AvaliaMultMatrizes.multmatrize(0, intArray12);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) -1, intArray12);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) 1, intArray12);
        ds.AvaliaMultMatrizes.multmatrize(0, intArray12);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) -1, intArray12);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) -1, intArray12);
        // The following exception was thrown during execution in test generation
        try {
            ds.AvaliaMultMatrizes.multmatrize(10, intArray12);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[1]");
    }

    @Test
    public void test1756() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1756");
        int[] intArray11 = new int[] { (short) 1 };
        ds.AvaliaMultMatrizes.multmatrize((int) (short) -1, intArray11);
        ds.AvaliaMultMatrizes.multmatrize(0, intArray11);
        ds.AvaliaMultMatrizes.multmatrize(0, intArray11);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) 1, intArray11);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) 0, intArray11);
        ds.AvaliaMultMatrizes.multmatrize((-1), intArray11);
        ds.AvaliaMultMatrizes.multmatrize(1, intArray11);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) 1, intArray11);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) 1, intArray11);
        ds.AvaliaMultMatrizes.multmatrize(0, intArray11);
        java.lang.Class<?> wildcardClass22 = intArray11.getClass();
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[1]");
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test1757() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1757");
        int[] intArray11 = new int[] { (short) 1 };
        ds.AvaliaMultMatrizes.multmatrize((int) (short) -1, intArray11);
        ds.AvaliaMultMatrizes.multmatrize(0, intArray11);
        ds.AvaliaMultMatrizes.multmatrize(0, intArray11);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) 1, intArray11);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) 0, intArray11);
        ds.AvaliaMultMatrizes.multmatrize((-1), intArray11);
        ds.AvaliaMultMatrizes.multmatrize((-1), intArray11);
        ds.AvaliaMultMatrizes.multmatrize(0, intArray11);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) -1, intArray11);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) 1, intArray11);
        java.lang.Class<?> wildcardClass22 = intArray11.getClass();
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[1]");
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test1758() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1758");
        int[] intArray10 = new int[] { (short) 1 };
        ds.AvaliaMultMatrizes.multmatrize((int) (short) -1, intArray10);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) 1, intArray10);
        ds.AvaliaMultMatrizes.multmatrize(0, intArray10);
        ds.AvaliaMultMatrizes.multmatrize((-1), intArray10);
        ds.AvaliaMultMatrizes.multmatrize(0, intArray10);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) -1, intArray10);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) -1, intArray10);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) 0, intArray10);
        ds.AvaliaMultMatrizes.multmatrize(1, intArray10);
        java.lang.Class<?> wildcardClass20 = intArray10.getClass();
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[1]");
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test1759() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1759");
        int[] intArray11 = new int[] { (byte) 10, (short) 1, (short) 1, (short) 10 };
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) -1, intArray11);
        ds.AvaliaMultMatrizes.multmatrize((-1), intArray11);
        ds.AvaliaMultMatrizes.multmatrize(1, intArray11);
        ds.AvaliaMultMatrizes.multmatrize(0, intArray11);
        ds.AvaliaMultMatrizes.multmatrize(1, intArray11);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) 0, intArray11);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) 1, intArray11);
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[10, 1, 1, 10]");
    }

    @Test
    public void test1760() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1760");
        int[] intArray12 = new int[] { (short) 1 };
        ds.AvaliaMultMatrizes.multmatrize((int) (short) -1, intArray12);
        ds.AvaliaMultMatrizes.multmatrize(0, intArray12);
        ds.AvaliaMultMatrizes.multmatrize(0, intArray12);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) -1, intArray12);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) 0, intArray12);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) -1, intArray12);
        ds.AvaliaMultMatrizes.multmatrize((-1), intArray12);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) 0, intArray12);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) 1, intArray12);
        ds.AvaliaMultMatrizes.multmatrize(0, intArray12);
        ds.AvaliaMultMatrizes.multmatrize(0, intArray12);
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[1]");
    }

    @Test
    public void test1761() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1761");
        int[] intArray9 = new int[] { (short) 1 };
        ds.AvaliaMultMatrizes.multmatrize((int) (short) -1, intArray9);
        ds.AvaliaMultMatrizes.multmatrize(0, intArray9);
        ds.AvaliaMultMatrizes.multmatrize(0, intArray9);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) 1, intArray9);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) 1, intArray9);
        ds.AvaliaMultMatrizes.multmatrize(0, intArray9);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) 0, intArray9);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) 0, intArray9);
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[1]");
    }

    @Test
    public void test1762() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1762");
        int[] intArray10 = new int[] { (short) 1 };
        ds.AvaliaMultMatrizes.multmatrize((int) (short) -1, intArray10);
        ds.AvaliaMultMatrizes.multmatrize(0, intArray10);
        ds.AvaliaMultMatrizes.multmatrize(0, intArray10);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) -1, intArray10);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) 0, intArray10);
        ds.AvaliaMultMatrizes.multmatrize(0, intArray10);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) -1, intArray10);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) 1, intArray10);
        ds.AvaliaMultMatrizes.multmatrize(1, intArray10);
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[1]");
    }

    @Test
    public void test1763() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1763");
        int[] intArray11 = new int[] { (short) 1 };
        ds.AvaliaMultMatrizes.multmatrize((int) (short) -1, intArray11);
        ds.AvaliaMultMatrizes.multmatrize(0, intArray11);
        ds.AvaliaMultMatrizes.multmatrize(0, intArray11);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) -1, intArray11);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) 0, intArray11);
        ds.AvaliaMultMatrizes.multmatrize(0, intArray11);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) 1, intArray11);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) 1, intArray11);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) -1, intArray11);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) -1, intArray11);
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[1]");
    }

    @Test
    public void test1764() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1764");
        int[] intArray11 = new int[] { (short) 1 };
        ds.AvaliaMultMatrizes.multmatrize((int) (short) -1, intArray11);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) 1, intArray11);
        ds.AvaliaMultMatrizes.multmatrize(0, intArray11);
        ds.AvaliaMultMatrizes.multmatrize((-1), intArray11);
        ds.AvaliaMultMatrizes.multmatrize(0, intArray11);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) -1, intArray11);
        ds.AvaliaMultMatrizes.multmatrize(0, intArray11);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) 0, intArray11);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) -1, intArray11);
        // The following exception was thrown during execution in test generation
        try {
            ds.AvaliaMultMatrizes.multmatrize((int) '#', intArray11);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[1]");
    }

    @Test
    public void test1765() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1765");
        int[] intArray12 = new int[] { (short) 1 };
        ds.AvaliaMultMatrizes.multmatrize((int) (short) -1, intArray12);
        ds.AvaliaMultMatrizes.multmatrize(0, intArray12);
        ds.AvaliaMultMatrizes.multmatrize(0, intArray12);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) -1, intArray12);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) 0, intArray12);
        ds.AvaliaMultMatrizes.multmatrize(0, intArray12);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) 1, intArray12);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) 1, intArray12);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) -1, intArray12);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) 0, intArray12);
        // The following exception was thrown during execution in test generation
        try {
            ds.AvaliaMultMatrizes.multmatrize((int) (short) 10, intArray12);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[1]");
    }

    @Test
    public void test1766() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1766");
        int[] intArray9 = new int[] { (short) 1 };
        ds.AvaliaMultMatrizes.multmatrize((int) (short) -1, intArray9);
        ds.AvaliaMultMatrizes.multmatrize(0, intArray9);
        ds.AvaliaMultMatrizes.multmatrize(0, intArray9);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) -1, intArray9);
        ds.AvaliaMultMatrizes.multmatrize(1, intArray9);
        ds.AvaliaMultMatrizes.multmatrize(1, intArray9);
        ds.AvaliaMultMatrizes.multmatrize((-1), intArray9);
        // The following exception was thrown during execution in test generation
        try {
            ds.AvaliaMultMatrizes.multmatrize((int) '#', intArray9);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[1]");
    }
}

