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
        int[] intArray10 = new int[] { '4', 100, 0, (byte) 10, 0 };
        ds.AvaliaMultMatrizes.multmatrize(0, intArray10);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) -1, intArray10);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) -1, intArray10);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) 1, intArray10);
        ds.AvaliaMultMatrizes.multmatrize(0, intArray10);
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[52, 100, 0, 10, 0]");
    }

    @Test
    public void test1502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1502");
        int[] intArray8 = new int[] { (byte) 100, (-1), ' ', 10 };
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) 1, intArray8);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) 0, intArray8);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) 0, intArray8);
        // The following exception was thrown during execution in test generation
        try {
            ds.AvaliaMultMatrizes.multmatrize(100, intArray8);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[100, -1, 32, 10]");
    }

    @Test
    public void test1503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1503");
        int[] intArray9 = new int[] { (short) -1, (-1) };
        ds.AvaliaMultMatrizes.multmatrize((int) (short) 0, intArray9);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) -1, intArray9);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) -1, intArray9);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) 1, intArray9);
        ds.AvaliaMultMatrizes.multmatrize(1, intArray9);
        ds.AvaliaMultMatrizes.multmatrize(0, intArray9);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) -1, intArray9);
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[-1, -1]");
    }

    @Test
    public void test1504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1504");
        int[] intArray12 = new int[] { 0, (byte) 1, 1, (byte) 10 };
        ds.AvaliaMultMatrizes.multmatrize((-1), intArray12);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) 1, intArray12);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) -1, intArray12);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) 1, intArray12);
        ds.AvaliaMultMatrizes.multmatrize(0, intArray12);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) 1, intArray12);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) -1, intArray12);
        // The following exception was thrown during execution in test generation
        try {
            ds.AvaliaMultMatrizes.multmatrize((int) (short) 10, intArray12);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[0, 1, 1, 10]");
    }

    @Test
    public void test1505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1505");
        int[] intArray8 = new int[] { ' ', (byte) 0, (byte) -1 };
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) -1, intArray8);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) 1, intArray8);
        ds.AvaliaMultMatrizes.multmatrize(1, intArray8);
        ds.AvaliaMultMatrizes.multmatrize(0, intArray8);
        ds.AvaliaMultMatrizes.multmatrize((-1), intArray8);
        java.lang.Class<?> wildcardClass14 = intArray8.getClass();
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[32, 0, -1]");
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test1506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1506");
        int[] intArray7 = new int[] { (byte) -1 };
        ds.AvaliaMultMatrizes.multmatrize((int) (short) 1, intArray7);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) 1, intArray7);
        ds.AvaliaMultMatrizes.multmatrize(0, intArray7);
        ds.AvaliaMultMatrizes.multmatrize(0, intArray7);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) 0, intArray7);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) -1, intArray7);
        java.lang.Class<?> wildcardClass14 = intArray7.getClass();
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[-1]");
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test1507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1507");
        int[] intArray9 = new int[] { (short) -1, (-1) };
        ds.AvaliaMultMatrizes.multmatrize((int) (short) 0, intArray9);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) -1, intArray9);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) 1, intArray9);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) -1, intArray9);
        ds.AvaliaMultMatrizes.multmatrize((-1), intArray9);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) 1, intArray9);
        ds.AvaliaMultMatrizes.multmatrize(0, intArray9);
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[-1, -1]");
    }

    @Test
    public void test1508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1508");
        int[] intArray8 = new int[] { '4', 100, 0, (byte) 10, 0 };
        ds.AvaliaMultMatrizes.multmatrize(0, intArray8);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) -1, intArray8);
        // The following exception was thrown during execution in test generation
        try {
            ds.AvaliaMultMatrizes.multmatrize((int) 'a', intArray8);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[52, 100, 0, 10, 0]");
    }

    @Test
    public void test1509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1509");
        int[] intArray9 = new int[] { 0, (byte) 1, 1, (byte) 10 };
        ds.AvaliaMultMatrizes.multmatrize((-1), intArray9);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) 1, intArray9);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) -1, intArray9);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) 1, intArray9);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) -1, intArray9);
        java.lang.Class<?> wildcardClass15 = intArray9.getClass();
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[0, 1, 1, 10]");
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test1510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1510");
        int[] intArray13 = new int[] { ' ', (byte) 0, (byte) -1 };
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) -1, intArray13);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) 1, intArray13);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) 0, intArray13);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) 0, intArray13);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) -1, intArray13);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) 1, intArray13);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) -1, intArray13);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) 0, intArray13);
        ds.AvaliaMultMatrizes.multmatrize(1, intArray13);
        // The following exception was thrown during execution in test generation
        try {
            ds.AvaliaMultMatrizes.multmatrize((int) '#', intArray13);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[32, 0, -1]");
    }

    @Test
    public void test1511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1511");
        int[] intArray11 = new int[] { ' ', (byte) 0, (byte) -1 };
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) -1, intArray11);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) -1, intArray11);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) 0, intArray11);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) -1, intArray11);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) -1, intArray11);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) 0, intArray11);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) -1, intArray11);
        // The following exception was thrown during execution in test generation
        try {
            ds.AvaliaMultMatrizes.multmatrize((int) (byte) 100, intArray11);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[32, 0, -1]");
    }

    @Test
    public void test1512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1512");
        int[] intArray8 = new int[] { ' ', (byte) 0, (byte) -1 };
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) -1, intArray8);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) -1, intArray8);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) -1, intArray8);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) -1, intArray8);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) -1, intArray8);
        java.lang.Class<?> wildcardClass14 = intArray8.getClass();
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[32, 0, -1]");
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test1513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1513");
        int[] intArray10 = new int[] { 0, (byte) 1, 1, (byte) 10 };
        ds.AvaliaMultMatrizes.multmatrize((-1), intArray10);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) 1, intArray10);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) -1, intArray10);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) 1, intArray10);
        ds.AvaliaMultMatrizes.multmatrize(0, intArray10);
        // The following exception was thrown during execution in test generation
        try {
            ds.AvaliaMultMatrizes.multmatrize((int) '#', intArray10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[0, 1, 1, 10]");
    }

    @Test
    public void test1514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1514");
        int[] intArray13 = new int[] { 0, (byte) 1, 1, (byte) 10 };
        ds.AvaliaMultMatrizes.multmatrize((-1), intArray13);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) 1, intArray13);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) -1, intArray13);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) 1, intArray13);
        ds.AvaliaMultMatrizes.multmatrize(0, intArray13);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) 0, intArray13);
        ds.AvaliaMultMatrizes.multmatrize((-1), intArray13);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) 0, intArray13);
        ds.AvaliaMultMatrizes.multmatrize((-1), intArray13);
        java.lang.Class<?> wildcardClass23 = intArray13.getClass();
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[0, 1, 1, 10]");
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test1515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1515");
        int[] intArray10 = new int[] { 0, (byte) 1, 1, (byte) 10 };
        ds.AvaliaMultMatrizes.multmatrize((-1), intArray10);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) 1, intArray10);
        ds.AvaliaMultMatrizes.multmatrize(0, intArray10);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) 0, intArray10);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) -1, intArray10);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) 1, intArray10);
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[0, 1, 1, 10]");
    }

    @Test
    public void test1516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1516");
        int[] intArray11 = new int[] { (short) -1, (-1) };
        ds.AvaliaMultMatrizes.multmatrize((int) (short) 0, intArray11);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) -1, intArray11);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) -1, intArray11);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) 1, intArray11);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) -1, intArray11);
        ds.AvaliaMultMatrizes.multmatrize(0, intArray11);
        ds.AvaliaMultMatrizes.multmatrize(0, intArray11);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) -1, intArray11);
        // The following exception was thrown during execution in test generation
        try {
            ds.AvaliaMultMatrizes.multmatrize((int) (byte) 100, intArray11);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[-1, -1]");
    }

    @Test
    public void test1517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1517");
        int[] intArray10 = new int[] { 0, (byte) 1, 1, (byte) 10 };
        ds.AvaliaMultMatrizes.multmatrize((-1), intArray10);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) 1, intArray10);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) 1, intArray10);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) 0, intArray10);
        ds.AvaliaMultMatrizes.multmatrize(0, intArray10);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) -1, intArray10);
        java.lang.Class<?> wildcardClass17 = intArray10.getClass();
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[0, 1, 1, 10]");
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test1518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1518");
        int[] intArray4 = new int[] { 100 };
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) 1, intArray4);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) -1, intArray4);
        // The following exception was thrown during execution in test generation
        try {
            ds.AvaliaMultMatrizes.multmatrize((int) 'a', intArray4);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[100]");
    }

    @Test
    public void test1519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1519");
        int[] intArray11 = new int[] { (short) -1, (-1) };
        ds.AvaliaMultMatrizes.multmatrize((int) (short) 0, intArray11);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) -1, intArray11);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) -1, intArray11);
        ds.AvaliaMultMatrizes.multmatrize((-1), intArray11);
        ds.AvaliaMultMatrizes.multmatrize(1, intArray11);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) 0, intArray11);
        ds.AvaliaMultMatrizes.multmatrize((-1), intArray11);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) -1, intArray11);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) 0, intArray11);
        java.lang.Class<?> wildcardClass21 = intArray11.getClass();
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[-1, -1]");
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test1520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1520");
        int[] intArray12 = new int[] { 0, (byte) 1, 1, (byte) 10 };
        ds.AvaliaMultMatrizes.multmatrize((-1), intArray12);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) 1, intArray12);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) 0, intArray12);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) -1, intArray12);
        ds.AvaliaMultMatrizes.multmatrize(1, intArray12);
        ds.AvaliaMultMatrizes.multmatrize((-1), intArray12);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) 0, intArray12);
        // The following exception was thrown during execution in test generation
        try {
            ds.AvaliaMultMatrizes.multmatrize(100, intArray12);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[0, 1, 1, 10]");
    }

    @Test
    public void test1521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1521");
        int[] intArray13 = new int[] { (short) -1, (-1) };
        ds.AvaliaMultMatrizes.multmatrize((int) (short) 0, intArray13);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) -1, intArray13);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) -1, intArray13);
        ds.AvaliaMultMatrizes.multmatrize(1, intArray13);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) 0, intArray13);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) 1, intArray13);
        ds.AvaliaMultMatrizes.multmatrize(0, intArray13);
        ds.AvaliaMultMatrizes.multmatrize(0, intArray13);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) -1, intArray13);
        ds.AvaliaMultMatrizes.multmatrize(0, intArray13);
        ds.AvaliaMultMatrizes.multmatrize(1, intArray13);
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[-1, -1]");
    }

    @Test
    public void test1522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1522");
        int[] intArray9 = new int[] { ' ', (byte) 0, (byte) -1 };
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) -1, intArray9);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) 1, intArray9);
        ds.AvaliaMultMatrizes.multmatrize((-1), intArray9);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) 0, intArray9);
        ds.AvaliaMultMatrizes.multmatrize((-1), intArray9);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) -1, intArray9);
        java.lang.Class<?> wildcardClass16 = intArray9.getClass();
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[32, 0, -1]");
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test1523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1523");
        int[] intArray9 = new int[] { (short) -1, (-1) };
        ds.AvaliaMultMatrizes.multmatrize((int) (short) 0, intArray9);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) -1, intArray9);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) -1, intArray9);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) 1, intArray9);
        ds.AvaliaMultMatrizes.multmatrize(0, intArray9);
        ds.AvaliaMultMatrizes.multmatrize(0, intArray9);
        // The following exception was thrown during execution in test generation
        try {
            ds.AvaliaMultMatrizes.multmatrize((int) (short) 100, intArray9);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[-1, -1]");
    }

    @Test
    public void test1524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1524");
        int[] intArray9 = new int[] { ' ', (byte) 0, (byte) -1 };
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) -1, intArray9);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) 1, intArray9);
        ds.AvaliaMultMatrizes.multmatrize(1, intArray9);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) -1, intArray9);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) -1, intArray9);
        ds.AvaliaMultMatrizes.multmatrize(1, intArray9);
        java.lang.Class<?> wildcardClass16 = intArray9.getClass();
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[32, 0, -1]");
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test1525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1525");
        int[] intArray8 = new int[] { (short) -1, (-1) };
        ds.AvaliaMultMatrizes.multmatrize((int) (short) 0, intArray8);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) -1, intArray8);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) -1, intArray8);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) -1, intArray8);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) 1, intArray8);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) -1, intArray8);
        java.lang.Class<?> wildcardClass15 = intArray8.getClass();
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[-1, -1]");
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test1526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1526");
        int[] intArray10 = new int[] { ' ', (byte) 0, (byte) -1 };
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) -1, intArray10);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) 1, intArray10);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) 0, intArray10);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) 0, intArray10);
        ds.AvaliaMultMatrizes.multmatrize((-1), intArray10);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) 0, intArray10);
        // The following exception was thrown during execution in test generation
        try {
            ds.AvaliaMultMatrizes.multmatrize(10, intArray10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[32, 0, -1]");
    }

    @Test
    public void test1527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1527");
        int[] intArray9 = new int[] { ' ', (byte) 0, (byte) -1 };
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) -1, intArray9);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) 1, intArray9);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) 0, intArray9);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) 0, intArray9);
        ds.AvaliaMultMatrizes.multmatrize((-1), intArray9);
        // The following exception was thrown during execution in test generation
        try {
            ds.AvaliaMultMatrizes.multmatrize((int) ' ', intArray9);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[32, 0, -1]");
    }

    @Test
    public void test1528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1528");
        int[] intArray11 = new int[] { ' ', (byte) 0, (byte) -1 };
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) -1, intArray11);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) 1, intArray11);
        ds.AvaliaMultMatrizes.multmatrize((-1), intArray11);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) 0, intArray11);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) 0, intArray11);
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
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[32, 0, -1]");
    }

    @Test
    public void test1529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1529");
        int[] intArray7 = new int[] { (short) -1, (-1) };
        ds.AvaliaMultMatrizes.multmatrize((int) (short) 0, intArray7);
        ds.AvaliaMultMatrizes.multmatrize(0, intArray7);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) -1, intArray7);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) 0, intArray7);
        // The following exception was thrown during execution in test generation
        try {
            ds.AvaliaMultMatrizes.multmatrize((int) (short) 100, intArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[-1, -1]");
    }

    @Test
    public void test1530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1530");
        int[] intArray9 = new int[] { (short) -1, (-1) };
        ds.AvaliaMultMatrizes.multmatrize((int) (short) 0, intArray9);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) -1, intArray9);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) -1, intArray9);
        ds.AvaliaMultMatrizes.multmatrize((-1), intArray9);
        ds.AvaliaMultMatrizes.multmatrize(1, intArray9);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) -1, intArray9);
        // The following exception was thrown during execution in test generation
        try {
            ds.AvaliaMultMatrizes.multmatrize((int) (short) 100, intArray9);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[-1, -1]");
    }

    @Test
    public void test1531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1531");
        int[] intArray13 = new int[] { (short) -1, (-1) };
        ds.AvaliaMultMatrizes.multmatrize((int) (short) 0, intArray13);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) -1, intArray13);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) -1, intArray13);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) 1, intArray13);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) -1, intArray13);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) 0, intArray13);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) 0, intArray13);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) -1, intArray13);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) -1, intArray13);
        ds.AvaliaMultMatrizes.multmatrize(1, intArray13);
        ds.AvaliaMultMatrizes.multmatrize(1, intArray13);
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[-1, -1]");
    }

    @Test
    public void test1532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1532");
        int[] intArray8 = new int[] { (byte) -1 };
        ds.AvaliaMultMatrizes.multmatrize((int) (short) 1, intArray8);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) 1, intArray8);
        ds.AvaliaMultMatrizes.multmatrize(0, intArray8);
        ds.AvaliaMultMatrizes.multmatrize(0, intArray8);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) 0, intArray8);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) -1, intArray8);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) 1, intArray8);
        java.lang.Class<?> wildcardClass16 = intArray8.getClass();
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[-1]");
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test1533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1533");
        int[] intArray8 = new int[] { ' ', (byte) 0, (byte) -1 };
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) -1, intArray8);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) -1, intArray8);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) -1, intArray8);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) -1, intArray8);
        // The following exception was thrown during execution in test generation
        try {
            ds.AvaliaMultMatrizes.multmatrize((int) '4', intArray8);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[32, 0, -1]");
    }

    @Test
    public void test1534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1534");
        int[] intArray7 = new int[] { (byte) -1 };
        ds.AvaliaMultMatrizes.multmatrize((int) (short) 1, intArray7);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) 1, intArray7);
        ds.AvaliaMultMatrizes.multmatrize((-1), intArray7);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) 1, intArray7);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) -1, intArray7);
        // The following exception was thrown during execution in test generation
        try {
            ds.AvaliaMultMatrizes.multmatrize((int) '#', intArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[-1]");
    }

    @Test
    public void test1535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1535");
        int[] intArray9 = new int[] { 0, (byte) 1, 1, (byte) 10 };
        ds.AvaliaMultMatrizes.multmatrize((-1), intArray9);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) 1, intArray9);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) 0, intArray9);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) 1, intArray9);
        // The following exception was thrown during execution in test generation
        try {
            ds.AvaliaMultMatrizes.multmatrize((int) (byte) 10, intArray9);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[0, 1, 1, 10]");
    }

    @Test
    public void test1536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1536");
        int[] intArray14 = new int[] { 0, (byte) 1, 1, (byte) 10 };
        ds.AvaliaMultMatrizes.multmatrize((-1), intArray14);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) 1, intArray14);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) -1, intArray14);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) 1, intArray14);
        ds.AvaliaMultMatrizes.multmatrize(0, intArray14);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) 0, intArray14);
        ds.AvaliaMultMatrizes.multmatrize((-1), intArray14);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) 0, intArray14);
        ds.AvaliaMultMatrizes.multmatrize((-1), intArray14);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) 0, intArray14);
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[0, 1, 1, 10]");
    }

    @Test
    public void test1537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1537");
        int[] intArray10 = new int[] { ' ', (byte) 0, (byte) -1 };
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) -1, intArray10);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) 1, intArray10);
        ds.AvaliaMultMatrizes.multmatrize((-1), intArray10);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) 0, intArray10);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) -1, intArray10);
        ds.AvaliaMultMatrizes.multmatrize((-1), intArray10);
        // The following exception was thrown during execution in test generation
        try {
            ds.AvaliaMultMatrizes.multmatrize(100, intArray10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[32, 0, -1]");
    }

    @Test
    public void test1538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1538");
        int[] intArray5 = new int[] { 0, (byte) 100 };
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) -1, intArray5);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) -1, intArray5);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) 0, intArray5);
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[0, 100]");
    }

    @Test
    public void test1539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1539");
        int[] intArray9 = new int[] { ' ', (byte) 0, (byte) -1 };
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) -1, intArray9);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) -1, intArray9);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) 0, intArray9);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) 0, intArray9);
        ds.AvaliaMultMatrizes.multmatrize((-1), intArray9);
        ds.AvaliaMultMatrizes.multmatrize((-1), intArray9);
        java.lang.Class<?> wildcardClass16 = intArray9.getClass();
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[32, 0, -1]");
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test1540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1540");
        int[] intArray10 = new int[] { '4', 100, 0, (byte) 10, 0 };
        ds.AvaliaMultMatrizes.multmatrize(0, intArray10);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) 1, intArray10);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) 1, intArray10);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) 0, intArray10);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) -1, intArray10);
        java.lang.Class<?> wildcardClass16 = intArray10.getClass();
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[52, 100, 0, 10, 0]");
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test1541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1541");
        int[] intArray15 = new int[] { (short) -1, (-1) };
        ds.AvaliaMultMatrizes.multmatrize((int) (short) 0, intArray15);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) -1, intArray15);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) -1, intArray15);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) 1, intArray15);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) -1, intArray15);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) 0, intArray15);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) 0, intArray15);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) -1, intArray15);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) -1, intArray15);
        ds.AvaliaMultMatrizes.multmatrize(1, intArray15);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) -1, intArray15);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) -1, intArray15);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) -1, intArray15);
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[-1, -1]");
    }

    @Test
    public void test1542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1542");
        int[] intArray5 = new int[] { (byte) -1 };
        ds.AvaliaMultMatrizes.multmatrize((int) (short) 1, intArray5);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) -1, intArray5);
        ds.AvaliaMultMatrizes.multmatrize(0, intArray5);
        ds.AvaliaMultMatrizes.multmatrize(0, intArray5);
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[-1]");
    }

    @Test
    public void test1543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1543");
        int[] intArray7 = new int[] { (short) -1, (-1) };
        ds.AvaliaMultMatrizes.multmatrize((int) (short) 0, intArray7);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) -1, intArray7);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) 0, intArray7);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) 0, intArray7);
        // The following exception was thrown during execution in test generation
        try {
            ds.AvaliaMultMatrizes.multmatrize((int) (byte) 10, intArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[-1, -1]");
    }

    @Test
    public void test1544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1544");
        int[] intArray8 = new int[] { (byte) 100, (-1), ' ', 10 };
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) 1, intArray8);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) 0, intArray8);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) 1, intArray8);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) 1, intArray8);
        java.lang.Class<?> wildcardClass13 = intArray8.getClass();
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[100, -1, 32, 10]");
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test1545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1545");
        int[] intArray10 = new int[] { ' ', (byte) 0, (byte) -1 };
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) -1, intArray10);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) 1, intArray10);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) 0, intArray10);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) 0, intArray10);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) -1, intArray10);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) 0, intArray10);
        // The following exception was thrown during execution in test generation
        try {
            ds.AvaliaMultMatrizes.multmatrize((int) (byte) 10, intArray10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[32, 0, -1]");
    }

    @Test
    public void test1546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1546");
        int[] intArray12 = new int[] { 0, (byte) 1, 1, (byte) 10 };
        ds.AvaliaMultMatrizes.multmatrize((-1), intArray12);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) 1, intArray12);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) -1, intArray12);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) 1, intArray12);
        ds.AvaliaMultMatrizes.multmatrize(1, intArray12);
        ds.AvaliaMultMatrizes.multmatrize((-1), intArray12);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) 0, intArray12);
        ds.AvaliaMultMatrizes.multmatrize(0, intArray12);
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[0, 1, 1, 10]");
    }

    @Test
    public void test1547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1547");
        int[] intArray10 = new int[] { ' ', (byte) 0, (byte) -1 };
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) -1, intArray10);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) 1, intArray10);
        ds.AvaliaMultMatrizes.multmatrize((-1), intArray10);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) 0, intArray10);
        ds.AvaliaMultMatrizes.multmatrize((-1), intArray10);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) -1, intArray10);
        // The following exception was thrown during execution in test generation
        try {
            ds.AvaliaMultMatrizes.multmatrize((int) 'a', intArray10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[32, 0, -1]");
    }

    @Test
    public void test1548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1548");
        int[] intArray11 = new int[] { 0, (byte) 1, 1, (byte) 10 };
        ds.AvaliaMultMatrizes.multmatrize((-1), intArray11);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) 1, intArray11);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) -1, intArray11);
        ds.AvaliaMultMatrizes.multmatrize(0, intArray11);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) -1, intArray11);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) 0, intArray11);
        // The following exception was thrown during execution in test generation
        try {
            ds.AvaliaMultMatrizes.multmatrize((int) (byte) 100, intArray11);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[0, 1, 1, 10]");
    }

    @Test
    public void test1549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1549");
        int[] intArray11 = new int[] { 0, (byte) 1, 1, (byte) 10 };
        ds.AvaliaMultMatrizes.multmatrize((-1), intArray11);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) 1, intArray11);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) 0, intArray11);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) -1, intArray11);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) -1, intArray11);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) 0, intArray11);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) 1, intArray11);
        java.lang.Class<?> wildcardClass19 = intArray11.getClass();
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[0, 1, 1, 10]");
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test1550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1550");
        int[] intArray9 = new int[] { (byte) -1 };
        ds.AvaliaMultMatrizes.multmatrize((int) (short) 1, intArray9);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) 1, intArray9);
        ds.AvaliaMultMatrizes.multmatrize(0, intArray9);
        ds.AvaliaMultMatrizes.multmatrize(0, intArray9);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) 0, intArray9);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) 0, intArray9);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) 0, intArray9);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) -1, intArray9);
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[-1]");
    }

    @Test
    public void test1551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1551");
        int[] intArray12 = new int[] { (short) -1, (-1) };
        ds.AvaliaMultMatrizes.multmatrize((int) (short) 0, intArray12);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) -1, intArray12);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) -1, intArray12);
        ds.AvaliaMultMatrizes.multmatrize((-1), intArray12);
        ds.AvaliaMultMatrizes.multmatrize(1, intArray12);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) 0, intArray12);
        ds.AvaliaMultMatrizes.multmatrize((-1), intArray12);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) 0, intArray12);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) 0, intArray12);
        ds.AvaliaMultMatrizes.multmatrize((-1), intArray12);
        java.lang.Class<?> wildcardClass23 = intArray12.getClass();
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[-1, -1]");
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test1552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1552");
        int[] intArray9 = new int[] { (short) -1, (-1) };
        ds.AvaliaMultMatrizes.multmatrize((int) (short) 0, intArray9);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) -1, intArray9);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) -1, intArray9);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) 1, intArray9);
        ds.AvaliaMultMatrizes.multmatrize((-1), intArray9);
        ds.AvaliaMultMatrizes.multmatrize((-1), intArray9);
        // The following exception was thrown during execution in test generation
        try {
            ds.AvaliaMultMatrizes.multmatrize(10, intArray9);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[-1, -1]");
    }

    @Test
    public void test1553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1553");
        int[] intArray13 = new int[] { 0, (byte) 1, 1, (byte) 10 };
        ds.AvaliaMultMatrizes.multmatrize((-1), intArray13);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) 1, intArray13);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) 1, intArray13);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) 0, intArray13);
        ds.AvaliaMultMatrizes.multmatrize(0, intArray13);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) -1, intArray13);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) 1, intArray13);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) -1, intArray13);
        ds.AvaliaMultMatrizes.multmatrize(0, intArray13);
        java.lang.Class<?> wildcardClass23 = intArray13.getClass();
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[0, 1, 1, 10]");
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test1554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1554");
        int[] intArray6 = new int[] { 0, (byte) 100 };
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) -1, intArray6);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) 0, intArray6);
        ds.AvaliaMultMatrizes.multmatrize(1, intArray6);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) -1, intArray6);
        java.lang.Class<?> wildcardClass11 = intArray6.getClass();
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[0, 100]");
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test1555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1555");
        int[] intArray10 = new int[] { 0, (byte) 1, 1, (byte) 10 };
        ds.AvaliaMultMatrizes.multmatrize((-1), intArray10);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) 1, intArray10);
        ds.AvaliaMultMatrizes.multmatrize(0, intArray10);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) 0, intArray10);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) -1, intArray10);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) -1, intArray10);
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[0, 1, 1, 10]");
    }

    @Test
    public void test1556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1556");
        int[] intArray13 = new int[] { ' ', (byte) 0, (byte) -1 };
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) -1, intArray13);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) 1, intArray13);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) 0, intArray13);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) 0, intArray13);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) -1, intArray13);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) 1, intArray13);
        ds.AvaliaMultMatrizes.multmatrize(0, intArray13);
        ds.AvaliaMultMatrizes.multmatrize(0, intArray13);
        ds.AvaliaMultMatrizes.multmatrize((-1), intArray13);
        // The following exception was thrown during execution in test generation
        try {
            ds.AvaliaMultMatrizes.multmatrize((int) 'a', intArray13);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[32, 0, -1]");
    }

    @Test
    public void test1557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1557");
        int[] intArray10 = new int[] { ' ', (byte) 0, (byte) -1 };
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) -1, intArray10);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) 1, intArray10);
        ds.AvaliaMultMatrizes.multmatrize((-1), intArray10);
        ds.AvaliaMultMatrizes.multmatrize(0, intArray10);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) 0, intArray10);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) 1, intArray10);
        // The following exception was thrown during execution in test generation
        try {
            ds.AvaliaMultMatrizes.multmatrize((int) (byte) 10, intArray10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[32, 0, -1]");
    }

    @Test
    public void test1558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1558");
        int[] intArray7 = new int[] { ' ', (byte) 0, (byte) -1 };
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) -1, intArray7);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) 1, intArray7);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) 1, intArray7);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) -1, intArray7);
        java.lang.Class<?> wildcardClass12 = intArray7.getClass();
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[32, 0, -1]");
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test1559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1559");
        int[] intArray8 = new int[] { '4', 100, 0, (byte) 10, 0 };
        ds.AvaliaMultMatrizes.multmatrize(0, intArray8);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) 1, intArray8);
        // The following exception was thrown during execution in test generation
        try {
            ds.AvaliaMultMatrizes.multmatrize((int) (short) 100, intArray8);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[52, 100, 0, 10, 0]");
    }

    @Test
    public void test1560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1560");
        int[] intArray11 = new int[] { ' ', (byte) 0, (byte) -1 };
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) -1, intArray11);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) 1, intArray11);
        ds.AvaliaMultMatrizes.multmatrize((-1), intArray11);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) 0, intArray11);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) -1, intArray11);
        ds.AvaliaMultMatrizes.multmatrize((-1), intArray11);
        ds.AvaliaMultMatrizes.multmatrize(0, intArray11);
        // The following exception was thrown during execution in test generation
        try {
            ds.AvaliaMultMatrizes.multmatrize((int) (short) 100, intArray11);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[32, 0, -1]");
    }

    @Test
    public void test1561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1561");
        int[] intArray9 = new int[] { (short) -1, (-1) };
        ds.AvaliaMultMatrizes.multmatrize((int) (short) 0, intArray9);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) -1, intArray9);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) -1, intArray9);
        ds.AvaliaMultMatrizes.multmatrize((-1), intArray9);
        ds.AvaliaMultMatrizes.multmatrize((-1), intArray9);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) 0, intArray9);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) 0, intArray9);
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[-1, -1]");
    }

    @Test
    public void test1562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1562");
        int[] intArray8 = new int[] { 0, (byte) 1, 1, (byte) 10 };
        ds.AvaliaMultMatrizes.multmatrize((-1), intArray8);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) 1, intArray8);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) 0, intArray8);
        // The following exception was thrown during execution in test generation
        try {
            ds.AvaliaMultMatrizes.multmatrize(10, intArray8);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[0, 1, 1, 10]");
    }

    @Test
    public void test1563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1563");
        int[] intArray10 = new int[] { ' ', (byte) 0, (byte) -1 };
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) -1, intArray10);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) 1, intArray10);
        ds.AvaliaMultMatrizes.multmatrize(1, intArray10);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) -1, intArray10);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) -1, intArray10);
        ds.AvaliaMultMatrizes.multmatrize(0, intArray10);
        ds.AvaliaMultMatrizes.multmatrize(0, intArray10);
        java.lang.Class<?> wildcardClass18 = intArray10.getClass();
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[32, 0, -1]");
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test1564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1564");
        int[] intArray8 = new int[] { (byte) -1 };
        ds.AvaliaMultMatrizes.multmatrize((int) (short) 1, intArray8);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) 1, intArray8);
        ds.AvaliaMultMatrizes.multmatrize((-1), intArray8);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) 0, intArray8);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) 1, intArray8);
        ds.AvaliaMultMatrizes.multmatrize(0, intArray8);
        ds.AvaliaMultMatrizes.multmatrize((-1), intArray8);
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[-1]");
    }

    @Test
    public void test1565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1565");
        int[] intArray7 = new int[] { (byte) -1, (short) 0, (byte) 100 };
        ds.AvaliaMultMatrizes.multmatrize((int) (short) 0, intArray7);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) 1, intArray7);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) 0, intArray7);
        // The following exception was thrown during execution in test generation
        try {
            ds.AvaliaMultMatrizes.multmatrize(10, intArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[-1, 0, 100]");
    }

    @Test
    public void test1566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1566");
        int[] intArray12 = new int[] { 0, (byte) 1, 1, (byte) 10 };
        ds.AvaliaMultMatrizes.multmatrize((-1), intArray12);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) 1, intArray12);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) -1, intArray12);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) 0, intArray12);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) 1, intArray12);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) 0, intArray12);
        ds.AvaliaMultMatrizes.multmatrize((-1), intArray12);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) -1, intArray12);
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[0, 1, 1, 10]");
    }

    @Test
    public void test1567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1567");
        int[] intArray11 = new int[] { ' ', (byte) 0, (byte) -1 };
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) -1, intArray11);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) -1, intArray11);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) 0, intArray11);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) -1, intArray11);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) -1, intArray11);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) 0, intArray11);
        ds.AvaliaMultMatrizes.multmatrize(1, intArray11);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) 0, intArray11);
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[32, 0, -1]");
    }

    @Test
    public void test1568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1568");
        int[] intArray5 = new int[] { (short) -1, (-1) };
        ds.AvaliaMultMatrizes.multmatrize((int) (short) 0, intArray5);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) -1, intArray5);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) 0, intArray5);
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[-1, -1]");
    }

    @Test
    public void test1569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1569");
        int[] intArray10 = new int[] { (short) -1, (-1) };
        ds.AvaliaMultMatrizes.multmatrize((int) (short) 0, intArray10);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) -1, intArray10);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) -1, intArray10);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) -1, intArray10);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) 1, intArray10);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) -1, intArray10);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) 1, intArray10);
        // The following exception was thrown during execution in test generation
        try {
            ds.AvaliaMultMatrizes.multmatrize((int) '#', intArray10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[-1, -1]");
    }

    @Test
    public void test1570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1570");
        int[] intArray8 = new int[] { ' ', (byte) 0, (byte) -1 };
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) -1, intArray8);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) -1, intArray8);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) 0, intArray8);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) -1, intArray8);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) 1, intArray8);
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[32, 0, -1]");
    }

    @Test
    public void test1571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1571");
        int[] intArray9 = new int[] { ' ', (byte) 0, (byte) -1 };
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) -1, intArray9);
        ds.AvaliaMultMatrizes.multmatrize(1, intArray9);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) 0, intArray9);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) 1, intArray9);
        ds.AvaliaMultMatrizes.multmatrize(0, intArray9);
        ds.AvaliaMultMatrizes.multmatrize((-1), intArray9);
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[32, 0, -1]");
    }

    @Test
    public void test1572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1572");
        int[] intArray6 = new int[] { (byte) -1 };
        ds.AvaliaMultMatrizes.multmatrize((int) (short) 1, intArray6);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) 1, intArray6);
        ds.AvaliaMultMatrizes.multmatrize(0, intArray6);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) -1, intArray6);
        ds.AvaliaMultMatrizes.multmatrize(0, intArray6);
        java.lang.Class<?> wildcardClass12 = intArray6.getClass();
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[-1]");
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test1573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1573");
        int[] intArray7 = new int[] { (byte) -1 };
        ds.AvaliaMultMatrizes.multmatrize((int) (short) 1, intArray7);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) 1, intArray7);
        ds.AvaliaMultMatrizes.multmatrize((-1), intArray7);
        ds.AvaliaMultMatrizes.multmatrize(0, intArray7);
        ds.AvaliaMultMatrizes.multmatrize(0, intArray7);
        // The following exception was thrown during execution in test generation
        try {
            ds.AvaliaMultMatrizes.multmatrize(10, intArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[-1]");
    }

    @Test
    public void test1574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1574");
        int[] intArray11 = new int[] { (byte) 100, (-1), ' ', 10 };
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) 1, intArray11);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) 0, intArray11);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) 0, intArray11);
        ds.AvaliaMultMatrizes.multmatrize(0, intArray11);
        ds.AvaliaMultMatrizes.multmatrize(0, intArray11);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) 0, intArray11);
        // The following exception was thrown during execution in test generation
        try {
            ds.AvaliaMultMatrizes.multmatrize((int) (short) 10, intArray11);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[100, -1, 32, 10]");
    }

    @Test
    public void test1575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1575");
        int[] intArray11 = new int[] { (short) -1, (-1) };
        ds.AvaliaMultMatrizes.multmatrize((int) (short) 0, intArray11);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) -1, intArray11);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) -1, intArray11);
        ds.AvaliaMultMatrizes.multmatrize(1, intArray11);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) 0, intArray11);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) -1, intArray11);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) 1, intArray11);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) -1, intArray11);
        // The following exception was thrown during execution in test generation
        try {
            ds.AvaliaMultMatrizes.multmatrize((int) (byte) 100, intArray11);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[-1, -1]");
    }

    @Test
    public void test1576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1576");
        int[] intArray7 = new int[] { 0, (byte) 100 };
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) -1, intArray7);
        ds.AvaliaMultMatrizes.multmatrize(1, intArray7);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) 0, intArray7);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) -1, intArray7);
        // The following exception was thrown during execution in test generation
        try {
            ds.AvaliaMultMatrizes.multmatrize(10, intArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[0, 100]");
    }

    @Test
    public void test1577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1577");
        int[] intArray9 = new int[] { 0, (byte) 1, 1, (byte) 10 };
        ds.AvaliaMultMatrizes.multmatrize((-1), intArray9);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) 1, intArray9);
        ds.AvaliaMultMatrizes.multmatrize(0, intArray9);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) 1, intArray9);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) 1, intArray9);
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[0, 1, 1, 10]");
    }

    @Test
    public void test1578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1578");
        int[] intArray9 = new int[] { (short) -1, (-1) };
        ds.AvaliaMultMatrizes.multmatrize((int) (short) 0, intArray9);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) -1, intArray9);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) -1, intArray9);
        ds.AvaliaMultMatrizes.multmatrize(1, intArray9);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) 0, intArray9);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) 0, intArray9);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) -1, intArray9);
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[-1, -1]");
    }

    @Test
    public void test1579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1579");
        int[] intArray9 = new int[] { (byte) -1 };
        ds.AvaliaMultMatrizes.multmatrize((int) (short) 1, intArray9);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) 1, intArray9);
        ds.AvaliaMultMatrizes.multmatrize(0, intArray9);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) -1, intArray9);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) 1, intArray9);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) 0, intArray9);
        ds.AvaliaMultMatrizes.multmatrize((-1), intArray9);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) 0, intArray9);
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[-1]");
    }

    @Test
    public void test1580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1580");
        int[] intArray8 = new int[] { '4', 100, 0, (byte) 10, 0 };
        ds.AvaliaMultMatrizes.multmatrize(0, intArray8);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) -1, intArray8);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) -1, intArray8);
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[52, 100, 0, 10, 0]");
    }

    @Test
    public void test1581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1581");
        int[] intArray11 = new int[] { ' ', (byte) 0, (byte) -1 };
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) -1, intArray11);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) -1, intArray11);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) 0, intArray11);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) -1, intArray11);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) -1, intArray11);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) 1, intArray11);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) 0, intArray11);
        // The following exception was thrown during execution in test generation
        try {
            ds.AvaliaMultMatrizes.multmatrize((int) ' ', intArray11);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[32, 0, -1]");
    }

    @Test
    public void test1582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1582");
        int[] intArray8 = new int[] { (short) -1, (-1) };
        ds.AvaliaMultMatrizes.multmatrize((int) (short) 0, intArray8);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) -1, intArray8);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) 1, intArray8);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) -1, intArray8);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) 1, intArray8);
        ds.AvaliaMultMatrizes.multmatrize(0, intArray8);
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[-1, -1]");
    }

    @Test
    public void test1583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1583");
        int[] intArray8 = new int[] { (byte) -1 };
        ds.AvaliaMultMatrizes.multmatrize((int) (short) 1, intArray8);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) 1, intArray8);
        ds.AvaliaMultMatrizes.multmatrize(0, intArray8);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) -1, intArray8);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) 1, intArray8);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) 0, intArray8);
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
    public void test1584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1584");
        int[] intArray10 = new int[] { (short) -1, (-1) };
        ds.AvaliaMultMatrizes.multmatrize((int) (short) 0, intArray10);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) -1, intArray10);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) -1, intArray10);
        ds.AvaliaMultMatrizes.multmatrize((-1), intArray10);
        ds.AvaliaMultMatrizes.multmatrize(1, intArray10);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) 0, intArray10);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) 1, intArray10);
        // The following exception was thrown during execution in test generation
        try {
            ds.AvaliaMultMatrizes.multmatrize((int) (byte) 10, intArray10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[-1, -1]");
    }

    @Test
    public void test1585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1585");
        int[] intArray9 = new int[] { 0, (byte) 1, 1, (byte) 10 };
        ds.AvaliaMultMatrizes.multmatrize((-1), intArray9);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) 1, intArray9);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) -1, intArray9);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) 0, intArray9);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) 0, intArray9);
        java.lang.Class<?> wildcardClass15 = intArray9.getClass();
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[0, 1, 1, 10]");
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test1586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1586");
        int[] intArray11 = new int[] { ' ', (byte) 0, (byte) -1 };
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) -1, intArray11);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) 1, intArray11);
        ds.AvaliaMultMatrizes.multmatrize((-1), intArray11);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) 0, intArray11);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) 0, intArray11);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) 0, intArray11);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) -1, intArray11);
        ds.AvaliaMultMatrizes.multmatrize(0, intArray11);
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[32, 0, -1]");
    }

    @Test
    public void test1587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1587");
        int[] intArray7 = new int[] { (byte) -1 };
        ds.AvaliaMultMatrizes.multmatrize((int) (short) 1, intArray7);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) 1, intArray7);
        ds.AvaliaMultMatrizes.multmatrize(0, intArray7);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) -1, intArray7);
        ds.AvaliaMultMatrizes.multmatrize(0, intArray7);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) 1, intArray7);
        java.lang.Class<?> wildcardClass14 = intArray7.getClass();
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[-1]");
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test1588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1588");
        int[] intArray11 = new int[] { (short) -1, (-1) };
        ds.AvaliaMultMatrizes.multmatrize((int) (short) 0, intArray11);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) -1, intArray11);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) -1, intArray11);
        ds.AvaliaMultMatrizes.multmatrize((-1), intArray11);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) 1, intArray11);
        ds.AvaliaMultMatrizes.multmatrize(0, intArray11);
        ds.AvaliaMultMatrizes.multmatrize(1, intArray11);
        ds.AvaliaMultMatrizes.multmatrize((-1), intArray11);
        // The following exception was thrown during execution in test generation
        try {
            ds.AvaliaMultMatrizes.multmatrize(10, intArray11);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[-1, -1]");
    }

    @Test
    public void test1589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1589");
        int[] intArray8 = new int[] { (short) -1, (-1) };
        ds.AvaliaMultMatrizes.multmatrize((int) (short) 0, intArray8);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) -1, intArray8);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) 1, intArray8);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) 1, intArray8);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) -1, intArray8);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) 0, intArray8);
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[-1, -1]");
    }

    @Test
    public void test1590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1590");
        int[] intArray9 = new int[] { (short) -1, (-1) };
        ds.AvaliaMultMatrizes.multmatrize((int) (short) 0, intArray9);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) -1, intArray9);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) -1, intArray9);
        ds.AvaliaMultMatrizes.multmatrize(1, intArray9);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) 0, intArray9);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) -1, intArray9);
        // The following exception was thrown during execution in test generation
        try {
            ds.AvaliaMultMatrizes.multmatrize((int) 'a', intArray9);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[-1, -1]");
    }

    @Test
    public void test1591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1591");
        int[] intArray11 = new int[] { ' ', (byte) 0, (byte) -1 };
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) -1, intArray11);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) 1, intArray11);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) 0, intArray11);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) 0, intArray11);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) 0, intArray11);
        ds.AvaliaMultMatrizes.multmatrize(0, intArray11);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) 1, intArray11);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) 1, intArray11);
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[32, 0, -1]");
    }

    @Test
    public void test1592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1592");
        int[] intArray11 = new int[] { ' ', (byte) 0, (byte) -1 };
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) -1, intArray11);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) 1, intArray11);
        ds.AvaliaMultMatrizes.multmatrize(1, intArray11);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) -1, intArray11);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) 1, intArray11);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) 1, intArray11);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) 0, intArray11);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) -1, intArray11);
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[32, 0, -1]");
    }

    @Test
    public void test1593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1593");
        int[] intArray10 = new int[] { 0, (byte) 1, 1, (byte) 10 };
        ds.AvaliaMultMatrizes.multmatrize((-1), intArray10);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) 1, intArray10);
        ds.AvaliaMultMatrizes.multmatrize(0, intArray10);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) 1, intArray10);
        ds.AvaliaMultMatrizes.multmatrize(0, intArray10);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) 0, intArray10);
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[0, 1, 1, 10]");
    }

    @Test
    public void test1594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1594");
        int[] intArray15 = new int[] { (short) -1, (-1) };
        ds.AvaliaMultMatrizes.multmatrize((int) (short) 0, intArray15);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) -1, intArray15);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) -1, intArray15);
        ds.AvaliaMultMatrizes.multmatrize(1, intArray15);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) 0, intArray15);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) 1, intArray15);
        ds.AvaliaMultMatrizes.multmatrize(0, intArray15);
        ds.AvaliaMultMatrizes.multmatrize(0, intArray15);
        ds.AvaliaMultMatrizes.multmatrize(0, intArray15);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) -1, intArray15);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) 1, intArray15);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) 1, intArray15);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) -1, intArray15);
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[-1, -1]");
    }

    @Test
    public void test1595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1595");
        int[] intArray9 = new int[] { '4', 100, 0, (byte) 10, 0 };
        ds.AvaliaMultMatrizes.multmatrize(0, intArray9);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) -1, intArray9);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) -1, intArray9);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) 0, intArray9);
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[52, 100, 0, 10, 0]");
    }

    @Test
    public void test1596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1596");
        int[] intArray9 = new int[] { ' ', (byte) 0, (byte) -1 };
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) -1, intArray9);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) 1, intArray9);
        ds.AvaliaMultMatrizes.multmatrize((-1), intArray9);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) 0, intArray9);
        ds.AvaliaMultMatrizes.multmatrize((-1), intArray9);
        ds.AvaliaMultMatrizes.multmatrize(0, intArray9);
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[32, 0, -1]");
    }

    @Test
    public void test1597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1597");
        int[] intArray10 = new int[] { ' ', (byte) 0, (byte) -1 };
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) -1, intArray10);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) 1, intArray10);
        ds.AvaliaMultMatrizes.multmatrize((-1), intArray10);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) 0, intArray10);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) 0, intArray10);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) 0, intArray10);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) 0, intArray10);
        java.lang.Class<?> wildcardClass18 = intArray10.getClass();
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[32, 0, -1]");
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test1598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1598");
        int[] intArray12 = new int[] { (short) -1, (-1) };
        ds.AvaliaMultMatrizes.multmatrize((int) (short) 0, intArray12);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) -1, intArray12);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) -1, intArray12);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) 1, intArray12);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) -1, intArray12);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) 0, intArray12);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) 0, intArray12);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) 0, intArray12);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) 0, intArray12);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) -1, intArray12);
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[-1, -1]");
    }

    @Test
    public void test1599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1599");
        int[] intArray13 = new int[] { (short) -1, (-1) };
        ds.AvaliaMultMatrizes.multmatrize((int) (short) 0, intArray13);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) -1, intArray13);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) -1, intArray13);
        ds.AvaliaMultMatrizes.multmatrize((-1), intArray13);
        ds.AvaliaMultMatrizes.multmatrize(1, intArray13);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) 0, intArray13);
        ds.AvaliaMultMatrizes.multmatrize((-1), intArray13);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) 0, intArray13);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) 0, intArray13);
        ds.AvaliaMultMatrizes.multmatrize((-1), intArray13);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) 1, intArray13);
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[-1, -1]");
    }

    @Test
    public void test1600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1600");
        int[] intArray4 = new int[] { 100 };
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) 1, intArray4);
        ds.AvaliaMultMatrizes.multmatrize(1, intArray4);
        // The following exception was thrown during execution in test generation
        try {
            ds.AvaliaMultMatrizes.multmatrize((int) (byte) 10, intArray4);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[100]");
    }

    @Test
    public void test1601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1601");
        int[] intArray7 = new int[] { (byte) -1 };
        ds.AvaliaMultMatrizes.multmatrize((int) (short) 1, intArray7);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) 1, intArray7);
        ds.AvaliaMultMatrizes.multmatrize(0, intArray7);
        ds.AvaliaMultMatrizes.multmatrize(0, intArray7);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) -1, intArray7);
        // The following exception was thrown during execution in test generation
        try {
            ds.AvaliaMultMatrizes.multmatrize((int) (byte) 10, intArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[-1]");
    }

    @Test
    public void test1602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1602");
        int[] intArray10 = new int[] { ' ', (byte) 0, (byte) -1 };
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) -1, intArray10);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) -1, intArray10);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) 0, intArray10);
        ds.AvaliaMultMatrizes.multmatrize(1, intArray10);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) -1, intArray10);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) 1, intArray10);
        // The following exception was thrown during execution in test generation
        try {
            ds.AvaliaMultMatrizes.multmatrize(10, intArray10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[32, 0, -1]");
    }

    @Test
    public void test1603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1603");
        int[] intArray10 = new int[] { (short) -1, (-1) };
        ds.AvaliaMultMatrizes.multmatrize((int) (short) 0, intArray10);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) -1, intArray10);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) -1, intArray10);
        ds.AvaliaMultMatrizes.multmatrize((-1), intArray10);
        ds.AvaliaMultMatrizes.multmatrize(1, intArray10);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) 0, intArray10);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) -1, intArray10);
        ds.AvaliaMultMatrizes.multmatrize(0, intArray10);
        java.lang.Class<?> wildcardClass19 = intArray10.getClass();
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[-1, -1]");
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test1604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1604");
        int[] intArray13 = new int[] { (short) -1, (-1) };
        ds.AvaliaMultMatrizes.multmatrize((int) (short) 0, intArray13);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) -1, intArray13);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) -1, intArray13);
        ds.AvaliaMultMatrizes.multmatrize((-1), intArray13);
        ds.AvaliaMultMatrizes.multmatrize(1, intArray13);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) 0, intArray13);
        ds.AvaliaMultMatrizes.multmatrize((-1), intArray13);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) 0, intArray13);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) 0, intArray13);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) 0, intArray13);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) -1, intArray13);
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[-1, -1]");
    }

    @Test
    public void test1605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1605");
        int[] intArray13 = new int[] { (short) -1, (-1) };
        ds.AvaliaMultMatrizes.multmatrize((int) (short) 0, intArray13);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) -1, intArray13);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) -1, intArray13);
        ds.AvaliaMultMatrizes.multmatrize((-1), intArray13);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) 1, intArray13);
        ds.AvaliaMultMatrizes.multmatrize(0, intArray13);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) 1, intArray13);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) 0, intArray13);
        ds.AvaliaMultMatrizes.multmatrize(1, intArray13);
        ds.AvaliaMultMatrizes.multmatrize(0, intArray13);
        // The following exception was thrown during execution in test generation
        try {
            ds.AvaliaMultMatrizes.multmatrize(10, intArray13);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[-1, -1]");
    }

    @Test
    public void test1606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1606");
        int[] intArray8 = new int[] { ' ', (byte) 0, (byte) -1 };
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) -1, intArray8);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) -1, intArray8);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) 0, intArray8);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) -1, intArray8);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) 0, intArray8);
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[32, 0, -1]");
    }

    @Test
    public void test1607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1607");
        int[] intArray11 = new int[] { (short) -1, (-1) };
        ds.AvaliaMultMatrizes.multmatrize((int) (short) 0, intArray11);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) -1, intArray11);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) -1, intArray11);
        ds.AvaliaMultMatrizes.multmatrize((-1), intArray11);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) 1, intArray11);
        ds.AvaliaMultMatrizes.multmatrize(0, intArray11);
        ds.AvaliaMultMatrizes.multmatrize(1, intArray11);
        ds.AvaliaMultMatrizes.multmatrize((-1), intArray11);
        // The following exception was thrown during execution in test generation
        try {
            ds.AvaliaMultMatrizes.multmatrize((int) (byte) 10, intArray11);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[-1, -1]");
    }

    @Test
    public void test1608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1608");
        int[] intArray6 = new int[] { (byte) -1 };
        ds.AvaliaMultMatrizes.multmatrize((int) (short) 1, intArray6);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) 1, intArray6);
        ds.AvaliaMultMatrizes.multmatrize((-1), intArray6);
        ds.AvaliaMultMatrizes.multmatrize(0, intArray6);
        ds.AvaliaMultMatrizes.multmatrize(0, intArray6);
        java.lang.Class<?> wildcardClass12 = intArray6.getClass();
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[-1]");
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test1609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1609");
        int[] intArray7 = new int[] { 0, (byte) 100 };
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) -1, intArray7);
        ds.AvaliaMultMatrizes.multmatrize(1, intArray7);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) 0, intArray7);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) 0, intArray7);
        // The following exception was thrown during execution in test generation
        try {
            ds.AvaliaMultMatrizes.multmatrize(100, intArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[0, 100]");
    }

    @Test
    public void test1610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1610");
        int[] intArray12 = new int[] { ' ', (byte) 0, (byte) -1 };
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) -1, intArray12);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) 1, intArray12);
        ds.AvaliaMultMatrizes.multmatrize((-1), intArray12);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) 0, intArray12);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) 0, intArray12);
        ds.AvaliaMultMatrizes.multmatrize((-1), intArray12);
        ds.AvaliaMultMatrizes.multmatrize((-1), intArray12);
        ds.AvaliaMultMatrizes.multmatrize(0, intArray12);
        // The following exception was thrown during execution in test generation
        try {
            ds.AvaliaMultMatrizes.multmatrize((int) (short) 10, intArray12);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[32, 0, -1]");
    }

    @Test
    public void test1611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1611");
        int[] intArray9 = new int[] { 0, (byte) 1, 1, (byte) 10 };
        ds.AvaliaMultMatrizes.multmatrize((-1), intArray9);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) 1, intArray9);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) -1, intArray9);
        ds.AvaliaMultMatrizes.multmatrize(0, intArray9);
        // The following exception was thrown during execution in test generation
        try {
            ds.AvaliaMultMatrizes.multmatrize((int) '4', intArray9);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[0, 1, 1, 10]");
    }

    @Test
    public void test1612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1612");
        int[] intArray9 = new int[] { '4', 100, 0, (byte) 10, 0 };
        ds.AvaliaMultMatrizes.multmatrize(0, intArray9);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) 1, intArray9);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) 0, intArray9);
        // The following exception was thrown during execution in test generation
        try {
            ds.AvaliaMultMatrizes.multmatrize((int) '#', intArray9);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[52, 100, 0, 10, 0]");
    }

    @Test
    public void test1613() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1613");
        int[] intArray16 = new int[] { (short) -1, (-1) };
        ds.AvaliaMultMatrizes.multmatrize((int) (short) 0, intArray16);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) -1, intArray16);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) -1, intArray16);
        ds.AvaliaMultMatrizes.multmatrize(1, intArray16);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) 0, intArray16);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) 1, intArray16);
        ds.AvaliaMultMatrizes.multmatrize(0, intArray16);
        ds.AvaliaMultMatrizes.multmatrize(0, intArray16);
        ds.AvaliaMultMatrizes.multmatrize(0, intArray16);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) -1, intArray16);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) 1, intArray16);
        ds.AvaliaMultMatrizes.multmatrize(0, intArray16);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) -1, intArray16);
        // The following exception was thrown during execution in test generation
        try {
            ds.AvaliaMultMatrizes.multmatrize((int) 'a', intArray16);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray16), "[-1, -1]");
    }

    @Test
    public void test1614() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1614");
        int[] intArray11 = new int[] { (short) -1, (-1) };
        ds.AvaliaMultMatrizes.multmatrize((int) (short) 0, intArray11);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) -1, intArray11);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) -1, intArray11);
        ds.AvaliaMultMatrizes.multmatrize((-1), intArray11);
        ds.AvaliaMultMatrizes.multmatrize(1, intArray11);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) 0, intArray11);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) -1, intArray11);
        ds.AvaliaMultMatrizes.multmatrize((-1), intArray11);
        // The following exception was thrown during execution in test generation
        try {
            ds.AvaliaMultMatrizes.multmatrize((int) (short) 10, intArray11);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[-1, -1]");
    }

    @Test
    public void test1615() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1615");
        int[] intArray11 = new int[] { 0, (byte) 100 };
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) -1, intArray11);
        ds.AvaliaMultMatrizes.multmatrize(1, intArray11);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) 0, intArray11);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) -1, intArray11);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) -1, intArray11);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) 1, intArray11);
        ds.AvaliaMultMatrizes.multmatrize(0, intArray11);
        ds.AvaliaMultMatrizes.multmatrize(0, intArray11);
        ds.AvaliaMultMatrizes.multmatrize(0, intArray11);
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[0, 100]");
    }

    @Test
    public void test1616() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1616");
        int[] intArray14 = new int[] { (short) -1, (-1) };
        ds.AvaliaMultMatrizes.multmatrize((int) (short) 0, intArray14);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) -1, intArray14);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) -1, intArray14);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) 1, intArray14);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) -1, intArray14);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) 0, intArray14);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) 0, intArray14);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) -1, intArray14);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) -1, intArray14);
        ds.AvaliaMultMatrizes.multmatrize(1, intArray14);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) 0, intArray14);
        // The following exception was thrown during execution in test generation
        try {
            ds.AvaliaMultMatrizes.multmatrize((int) (short) 10, intArray14);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[-1, -1]");
    }

    @Test
    public void test1617() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1617");
        int[] intArray11 = new int[] { (short) -1, (-1) };
        ds.AvaliaMultMatrizes.multmatrize((int) (short) 0, intArray11);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) -1, intArray11);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) -1, intArray11);
        ds.AvaliaMultMatrizes.multmatrize((-1), intArray11);
        ds.AvaliaMultMatrizes.multmatrize(1, intArray11);
        ds.AvaliaMultMatrizes.multmatrize((-1), intArray11);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) 1, intArray11);
        ds.AvaliaMultMatrizes.multmatrize(0, intArray11);
        ds.AvaliaMultMatrizes.multmatrize(1, intArray11);
        java.lang.Class<?> wildcardClass21 = intArray11.getClass();
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[-1, -1]");
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test1618() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1618");
        int[] intArray11 = new int[] { 0, (byte) 1, 1, (byte) 10 };
        ds.AvaliaMultMatrizes.multmatrize((-1), intArray11);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) 1, intArray11);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) -1, intArray11);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) 1, intArray11);
        ds.AvaliaMultMatrizes.multmatrize(1, intArray11);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) 1, intArray11);
        ds.AvaliaMultMatrizes.multmatrize(1, intArray11);
        java.lang.Class<?> wildcardClass19 = intArray11.getClass();
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[0, 1, 1, 10]");
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test1619() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1619");
        int[] intArray10 = new int[] { ' ', (byte) 0, (byte) -1 };
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) -1, intArray10);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) -1, intArray10);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) 0, intArray10);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) -1, intArray10);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) -1, intArray10);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) 0, intArray10);
        ds.AvaliaMultMatrizes.multmatrize(1, intArray10);
        java.lang.Class<?> wildcardClass18 = intArray10.getClass();
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[32, 0, -1]");
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test1620() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1620");
        int[] intArray8 = new int[] { (byte) 100, (-1), ' ', 10 };
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) 1, intArray8);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) 0, intArray8);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) 1, intArray8);
        ds.AvaliaMultMatrizes.multmatrize(0, intArray8);
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[100, -1, 32, 10]");
    }

    @Test
    public void test1621() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1621");
        int[] intArray7 = new int[] { (byte) 100, (-1), ' ', 10 };
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) 1, intArray7);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) 0, intArray7);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) -1, intArray7);
        java.lang.Class<?> wildcardClass11 = intArray7.getClass();
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[100, -1, 32, 10]");
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test1622() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1622");
        int[] intArray12 = new int[] { 0, (byte) 1, 1, (byte) 10 };
        ds.AvaliaMultMatrizes.multmatrize((-1), intArray12);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) 1, intArray12);
        ds.AvaliaMultMatrizes.multmatrize(0, intArray12);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) 1, intArray12);
        ds.AvaliaMultMatrizes.multmatrize((-1), intArray12);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) 0, intArray12);
        ds.AvaliaMultMatrizes.multmatrize(0, intArray12);
        // The following exception was thrown during execution in test generation
        try {
            ds.AvaliaMultMatrizes.multmatrize((int) 'a', intArray12);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[0, 1, 1, 10]");
    }

    @Test
    public void test1623() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1623");
        int[] intArray12 = new int[] { (short) -1, (-1) };
        ds.AvaliaMultMatrizes.multmatrize((int) (short) 0, intArray12);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) -1, intArray12);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) -1, intArray12);
        ds.AvaliaMultMatrizes.multmatrize((-1), intArray12);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) 1, intArray12);
        ds.AvaliaMultMatrizes.multmatrize(0, intArray12);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) 1, intArray12);
        ds.AvaliaMultMatrizes.multmatrize(0, intArray12);
        ds.AvaliaMultMatrizes.multmatrize(0, intArray12);
        // The following exception was thrown during execution in test generation
        try {
            ds.AvaliaMultMatrizes.multmatrize((int) (short) 10, intArray12);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[-1, -1]");
    }

    @Test
    public void test1624() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1624");
        int[] intArray9 = new int[] { (short) -1, (-1) };
        ds.AvaliaMultMatrizes.multmatrize((int) (short) 0, intArray9);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) -1, intArray9);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) -1, intArray9);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) 1, intArray9);
        ds.AvaliaMultMatrizes.multmatrize(1, intArray9);
        ds.AvaliaMultMatrizes.multmatrize(0, intArray9);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) 1, intArray9);
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[-1, -1]");
    }

    @Test
    public void test1625() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1625");
        int[] intArray11 = new int[] { (short) -1, (-1) };
        ds.AvaliaMultMatrizes.multmatrize((int) (short) 0, intArray11);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) -1, intArray11);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) -1, intArray11);
        ds.AvaliaMultMatrizes.multmatrize((-1), intArray11);
        ds.AvaliaMultMatrizes.multmatrize(1, intArray11);
        ds.AvaliaMultMatrizes.multmatrize((-1), intArray11);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) 1, intArray11);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) 1, intArray11);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) -1, intArray11);
        java.lang.Class<?> wildcardClass21 = intArray11.getClass();
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[-1, -1]");
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test1626() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1626");
        int[] intArray12 = new int[] { ' ', (byte) 0, (byte) -1 };
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) -1, intArray12);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) 1, intArray12);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) 0, intArray12);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) 0, intArray12);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) -1, intArray12);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) 1, intArray12);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) -1, intArray12);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) 0, intArray12);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) -1, intArray12);
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[32, 0, -1]");
    }

    @Test
    public void test1627() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1627");
        int[] intArray10 = new int[] { ' ', (byte) 0, (byte) -1 };
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) -1, intArray10);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) 1, intArray10);
        ds.AvaliaMultMatrizes.multmatrize((-1), intArray10);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) 0, intArray10);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) -1, intArray10);
        ds.AvaliaMultMatrizes.multmatrize((-1), intArray10);
        ds.AvaliaMultMatrizes.multmatrize(0, intArray10);
        java.lang.Class<?> wildcardClass18 = intArray10.getClass();
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[32, 0, -1]");
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test1628() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1628");
        int[] intArray8 = new int[] { (byte) 100, (-1), ' ', 10 };
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) 1, intArray8);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) 0, intArray8);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) -1, intArray8);
        // The following exception was thrown during execution in test generation
        try {
            ds.AvaliaMultMatrizes.multmatrize(10, intArray8);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[100, -1, 32, 10]");
    }

    @Test
    public void test1629() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1629");
        int[] intArray10 = new int[] { 0, (byte) 1, 1, (byte) 10 };
        ds.AvaliaMultMatrizes.multmatrize((-1), intArray10);
        ds.AvaliaMultMatrizes.multmatrize(0, intArray10);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) -1, intArray10);
        ds.AvaliaMultMatrizes.multmatrize(0, intArray10);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) 1, intArray10);
        // The following exception was thrown during execution in test generation
        try {
            ds.AvaliaMultMatrizes.multmatrize((int) '4', intArray10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[0, 1, 1, 10]");
    }

    @Test
    public void test1630() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1630");
        int[] intArray9 = new int[] { 0, (byte) 100 };
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) -1, intArray9);
        ds.AvaliaMultMatrizes.multmatrize(1, intArray9);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) 0, intArray9);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) -1, intArray9);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) -1, intArray9);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) 1, intArray9);
        // The following exception was thrown during execution in test generation
        try {
            ds.AvaliaMultMatrizes.multmatrize((int) (byte) 10, intArray9);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[0, 100]");
    }

    @Test
    public void test1631() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1631");
        int[] intArray12 = new int[] { (short) -1, (-1) };
        ds.AvaliaMultMatrizes.multmatrize((int) (short) 0, intArray12);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) -1, intArray12);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) -1, intArray12);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) 1, intArray12);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) -1, intArray12);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) 0, intArray12);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) 0, intArray12);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) 0, intArray12);
        ds.AvaliaMultMatrizes.multmatrize(1, intArray12);
        // The following exception was thrown during execution in test generation
        try {
            ds.AvaliaMultMatrizes.multmatrize((int) '#', intArray12);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[-1, -1]");
    }

    @Test
    public void test1632() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1632");
        int[] intArray11 = new int[] { ' ', (byte) 0, (byte) -1 };
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) -1, intArray11);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) 1, intArray11);
        ds.AvaliaMultMatrizes.multmatrize(1, intArray11);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) -1, intArray11);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) -1, intArray11);
        ds.AvaliaMultMatrizes.multmatrize(0, intArray11);
        ds.AvaliaMultMatrizes.multmatrize(0, intArray11);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) 0, intArray11);
        java.lang.Class<?> wildcardClass20 = intArray11.getClass();
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[32, 0, -1]");
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test1633() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1633");
        int[] intArray8 = new int[] { ' ', (byte) 0, (byte) -1 };
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) -1, intArray8);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) 0, intArray8);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) -1, intArray8);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) 0, intArray8);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) 0, intArray8);
        java.lang.Class<?> wildcardClass14 = intArray8.getClass();
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[32, 0, -1]");
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test1634() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1634");
        int[] intArray11 = new int[] { '4', 100, 0, (byte) 10, 0 };
        ds.AvaliaMultMatrizes.multmatrize(0, intArray11);
        ds.AvaliaMultMatrizes.multmatrize((-1), intArray11);
        ds.AvaliaMultMatrizes.multmatrize((-1), intArray11);
        ds.AvaliaMultMatrizes.multmatrize(0, intArray11);
        ds.AvaliaMultMatrizes.multmatrize(0, intArray11);
        // The following exception was thrown during execution in test generation
        try {
            ds.AvaliaMultMatrizes.multmatrize((int) (byte) 100, intArray11);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[52, 100, 0, 10, 0]");
    }

    @Test
    public void test1635() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1635");
        int[] intArray8 = new int[] { ' ', (byte) 0, (byte) -1 };
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) -1, intArray8);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) 1, intArray8);
        ds.AvaliaMultMatrizes.multmatrize(0, intArray8);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) 1, intArray8);
        // The following exception was thrown during execution in test generation
        try {
            ds.AvaliaMultMatrizes.multmatrize((int) '#', intArray8);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[32, 0, -1]");
    }

    @Test
    public void test1636() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1636");
        int[] intArray6 = new int[] { ' ', (byte) 0, (byte) -1 };
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) -1, intArray6);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) 0, intArray6);
        // The following exception was thrown during execution in test generation
        try {
            ds.AvaliaMultMatrizes.multmatrize((int) (byte) 100, intArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[32, 0, -1]");
    }

    @Test
    public void test1637() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1637");
        int[] intArray11 = new int[] { ' ', (byte) 0, (byte) -1 };
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) -1, intArray11);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) 1, intArray11);
        ds.AvaliaMultMatrizes.multmatrize((-1), intArray11);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) 0, intArray11);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) 0, intArray11);
        ds.AvaliaMultMatrizes.multmatrize((-1), intArray11);
        ds.AvaliaMultMatrizes.multmatrize(1, intArray11);
        ds.AvaliaMultMatrizes.multmatrize(0, intArray11);
        java.lang.Class<?> wildcardClass20 = intArray11.getClass();
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[32, 0, -1]");
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test1638() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1638");
        int[] intArray11 = new int[] { (short) -1, (-1) };
        ds.AvaliaMultMatrizes.multmatrize((int) (short) 0, intArray11);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) -1, intArray11);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) -1, intArray11);
        ds.AvaliaMultMatrizes.multmatrize((-1), intArray11);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) 1, intArray11);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) 1, intArray11);
        ds.AvaliaMultMatrizes.multmatrize(0, intArray11);
        ds.AvaliaMultMatrizes.multmatrize((-1), intArray11);
        // The following exception was thrown during execution in test generation
        try {
            ds.AvaliaMultMatrizes.multmatrize((int) (short) 10, intArray11);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[-1, -1]");
    }

    @Test
    public void test1639() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1639");
        int[] intArray11 = new int[] { (short) -1, (-1) };
        ds.AvaliaMultMatrizes.multmatrize((int) (short) 0, intArray11);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) -1, intArray11);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) -1, intArray11);
        ds.AvaliaMultMatrizes.multmatrize((-1), intArray11);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) 1, intArray11);
        ds.AvaliaMultMatrizes.multmatrize(0, intArray11);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) -1, intArray11);
        ds.AvaliaMultMatrizes.multmatrize(0, intArray11);
        // The following exception was thrown during execution in test generation
        try {
            ds.AvaliaMultMatrizes.multmatrize((int) 'a', intArray11);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[-1, -1]");
    }

    @Test
    public void test1640() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1640");
        int[] intArray11 = new int[] { ' ', (byte) 0, (byte) -1 };
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) -1, intArray11);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) 1, intArray11);
        ds.AvaliaMultMatrizes.multmatrize((-1), intArray11);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) 0, intArray11);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) 0, intArray11);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) 1, intArray11);
        ds.AvaliaMultMatrizes.multmatrize(0, intArray11);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) -1, intArray11);
        java.lang.Class<?> wildcardClass20 = intArray11.getClass();
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[32, 0, -1]");
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test1641() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1641");
        int[] intArray9 = new int[] { (byte) 100, (-1), ' ', 10 };
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) 1, intArray9);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) 0, intArray9);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) 0, intArray9);
        ds.AvaliaMultMatrizes.multmatrize(0, intArray9);
        // The following exception was thrown during execution in test generation
        try {
            ds.AvaliaMultMatrizes.multmatrize(10, intArray9);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[100, -1, 32, 10]");
    }

    @Test
    public void test1642() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1642");
        int[] intArray9 = new int[] { (short) -1, (-1) };
        ds.AvaliaMultMatrizes.multmatrize((int) (short) 0, intArray9);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) -1, intArray9);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) -1, intArray9);
        ds.AvaliaMultMatrizes.multmatrize((-1), intArray9);
        ds.AvaliaMultMatrizes.multmatrize(1, intArray9);
        ds.AvaliaMultMatrizes.multmatrize((-1), intArray9);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) -1, intArray9);
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[-1, -1]");
    }

    @Test
    public void test1643() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1643");
        int[] intArray14 = new int[] { (short) -1, (-1) };
        ds.AvaliaMultMatrizes.multmatrize((int) (short) 0, intArray14);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) -1, intArray14);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) -1, intArray14);
        ds.AvaliaMultMatrizes.multmatrize(1, intArray14);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) 0, intArray14);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) 1, intArray14);
        ds.AvaliaMultMatrizes.multmatrize(0, intArray14);
        ds.AvaliaMultMatrizes.multmatrize(0, intArray14);
        ds.AvaliaMultMatrizes.multmatrize(0, intArray14);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) -1, intArray14);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) 1, intArray14);
        ds.AvaliaMultMatrizes.multmatrize((-1), intArray14);
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[-1, -1]");
    }

    @Test
    public void test1644() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1644");
        int[] intArray4 = new int[] { (byte) -1 };
        ds.AvaliaMultMatrizes.multmatrize((int) (short) 1, intArray4);
        ds.AvaliaMultMatrizes.multmatrize(1, intArray4);
        // The following exception was thrown during execution in test generation
        try {
            ds.AvaliaMultMatrizes.multmatrize((int) (byte) 100, intArray4);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[-1]");
    }

    @Test
    public void test1645() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1645");
        int[] intArray12 = new int[] { ' ', (byte) 0, (byte) -1 };
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) -1, intArray12);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) 1, intArray12);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) 0, intArray12);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) 0, intArray12);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) -1, intArray12);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) 1, intArray12);
        ds.AvaliaMultMatrizes.multmatrize(0, intArray12);
        ds.AvaliaMultMatrizes.multmatrize(0, intArray12);
        ds.AvaliaMultMatrizes.multmatrize(1, intArray12);
        java.lang.Class<?> wildcardClass22 = intArray12.getClass();
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[32, 0, -1]");
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test1646() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1646");
        int[] intArray12 = new int[] { (short) -1, (-1) };
        ds.AvaliaMultMatrizes.multmatrize((int) (short) 0, intArray12);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) -1, intArray12);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) -1, intArray12);
        ds.AvaliaMultMatrizes.multmatrize(1, intArray12);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) 0, intArray12);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) 0, intArray12);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) 0, intArray12);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) 0, intArray12);
        ds.AvaliaMultMatrizes.multmatrize(0, intArray12);
        // The following exception was thrown during execution in test generation
        try {
            ds.AvaliaMultMatrizes.multmatrize((int) '#', intArray12);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[-1, -1]");
    }

    @Test
    public void test1647() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1647");
        int[] intArray10 = new int[] { ' ', (byte) 0, (byte) -1 };
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) -1, intArray10);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) 1, intArray10);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) 0, intArray10);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) 0, intArray10);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) -1, intArray10);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) 0, intArray10);
        // The following exception was thrown during execution in test generation
        try {
            ds.AvaliaMultMatrizes.multmatrize((int) 'a', intArray10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[32, 0, -1]");
    }

    @Test
    public void test1648() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1648");
        int[] intArray6 = new int[] { 100 };
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) 1, intArray6);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) -1, intArray6);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) -1, intArray6);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) 0, intArray6);
        // The following exception was thrown during execution in test generation
        try {
            ds.AvaliaMultMatrizes.multmatrize((int) (byte) 10, intArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[100]");
    }

    @Test
    public void test1649() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1649");
        int[] intArray9 = new int[] { ' ', (byte) 0, (byte) -1 };
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) -1, intArray9);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) 1, intArray9);
        ds.AvaliaMultMatrizes.multmatrize((-1), intArray9);
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
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[32, 0, -1]");
    }

    @Test
    public void test1650() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1650");
        int[] intArray11 = new int[] { ' ', (byte) 0, (byte) -1 };
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) -1, intArray11);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) 1, intArray11);
        ds.AvaliaMultMatrizes.multmatrize((-1), intArray11);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) 0, intArray11);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) -1, intArray11);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) 0, intArray11);
        ds.AvaliaMultMatrizes.multmatrize(0, intArray11);
        // The following exception was thrown during execution in test generation
        try {
            ds.AvaliaMultMatrizes.multmatrize((int) (short) 10, intArray11);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[32, 0, -1]");
    }

    @Test
    public void test1651() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1651");
        int[] intArray9 = new int[] { ' ', (byte) 0, (byte) -1 };
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) -1, intArray9);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) 1, intArray9);
        ds.AvaliaMultMatrizes.multmatrize((-1), intArray9);
        ds.AvaliaMultMatrizes.multmatrize(0, intArray9);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) 0, intArray9);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) 1, intArray9);
        java.lang.Class<?> wildcardClass16 = intArray9.getClass();
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[32, 0, -1]");
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test1652() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1652");
        int[] intArray11 = new int[] { ' ', (byte) 0, (byte) -1 };
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) -1, intArray11);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) 1, intArray11);
        ds.AvaliaMultMatrizes.multmatrize((-1), intArray11);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) 0, intArray11);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) 0, intArray11);
        ds.AvaliaMultMatrizes.multmatrize((-1), intArray11);
        ds.AvaliaMultMatrizes.multmatrize((-1), intArray11);
        ds.AvaliaMultMatrizes.multmatrize(0, intArray11);
        java.lang.Class<?> wildcardClass20 = intArray11.getClass();
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[32, 0, -1]");
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test1653() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1653");
        int[] intArray9 = new int[] { 0, (byte) 1, 1, (byte) 10 };
        ds.AvaliaMultMatrizes.multmatrize((-1), intArray9);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) 1, intArray9);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) 0, intArray9);
        ds.AvaliaMultMatrizes.multmatrize(1, intArray9);
        // The following exception was thrown during execution in test generation
        try {
            ds.AvaliaMultMatrizes.multmatrize((int) 'a', intArray9);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[0, 1, 1, 10]");
    }

    @Test
    public void test1654() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1654");
        int[] intArray9 = new int[] { ' ', (byte) 0, (byte) -1 };
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) -1, intArray9);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) 1, intArray9);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) 0, intArray9);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) 0, intArray9);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) -1, intArray9);
        // The following exception was thrown during execution in test generation
        try {
            ds.AvaliaMultMatrizes.multmatrize((int) (byte) 10, intArray9);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[32, 0, -1]");
    }

    @Test
    public void test1655() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1655");
        int[] intArray7 = new int[] { '4' };
        ds.AvaliaMultMatrizes.multmatrize((int) (short) -1, intArray7);
        ds.AvaliaMultMatrizes.multmatrize(1, intArray7);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) 1, intArray7);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) -1, intArray7);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) 0, intArray7);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) 1, intArray7);
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[52]");
    }

    @Test
    public void test1656() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1656");
        int[] intArray9 = new int[] { (short) -1, (-1) };
        ds.AvaliaMultMatrizes.multmatrize((int) (short) 0, intArray9);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) -1, intArray9);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) -1, intArray9);
        ds.AvaliaMultMatrizes.multmatrize((-1), intArray9);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) -1, intArray9);
        ds.AvaliaMultMatrizes.multmatrize(0, intArray9);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) 1, intArray9);
        java.lang.Class<?> wildcardClass17 = intArray9.getClass();
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[-1, -1]");
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test1657() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1657");
        int[] intArray16 = new int[] { (short) -1, (-1) };
        ds.AvaliaMultMatrizes.multmatrize((int) (short) 0, intArray16);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) -1, intArray16);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) -1, intArray16);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) 1, intArray16);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) -1, intArray16);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) 0, intArray16);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) 0, intArray16);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) -1, intArray16);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) -1, intArray16);
        ds.AvaliaMultMatrizes.multmatrize(1, intArray16);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) -1, intArray16);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) -1, intArray16);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) 0, intArray16);
        // The following exception was thrown during execution in test generation
        try {
            ds.AvaliaMultMatrizes.multmatrize((int) 'a', intArray16);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray16), "[-1, -1]");
    }

    @Test
    public void test1658() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1658");
        int[] intArray10 = new int[] { (short) -1, (-1) };
        ds.AvaliaMultMatrizes.multmatrize((int) (short) 0, intArray10);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) -1, intArray10);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) -1, intArray10);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) 1, intArray10);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) -1, intArray10);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) 1, intArray10);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) 1, intArray10);
        // The following exception was thrown during execution in test generation
        try {
            ds.AvaliaMultMatrizes.multmatrize((int) (byte) 10, intArray10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[-1, -1]");
    }

    @Test
    public void test1659() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1659");
        int[] intArray7 = new int[] { (short) -1, (-1) };
        ds.AvaliaMultMatrizes.multmatrize((int) (short) 0, intArray7);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) -1, intArray7);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) 0, intArray7);
        ds.AvaliaMultMatrizes.multmatrize(0, intArray7);
        // The following exception was thrown during execution in test generation
        try {
            ds.AvaliaMultMatrizes.multmatrize((int) '#', intArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[-1, -1]");
    }

    @Test
    public void test1660() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1660");
        int[] intArray11 = new int[] { (short) -1, (-1) };
        ds.AvaliaMultMatrizes.multmatrize((int) (short) 0, intArray11);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) -1, intArray11);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) -1, intArray11);
        ds.AvaliaMultMatrizes.multmatrize((-1), intArray11);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) 1, intArray11);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) 1, intArray11);
        ds.AvaliaMultMatrizes.multmatrize(0, intArray11);
        ds.AvaliaMultMatrizes.multmatrize(0, intArray11);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) -1, intArray11);
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[-1, -1]");
    }

    @Test
    public void test1661() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1661");
        int[] intArray12 = new int[] { 0, (byte) 1, 1, (byte) 10 };
        ds.AvaliaMultMatrizes.multmatrize((-1), intArray12);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) 1, intArray12);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) -1, intArray12);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) 1, intArray12);
        ds.AvaliaMultMatrizes.multmatrize(0, intArray12);
        ds.AvaliaMultMatrizes.multmatrize(1, intArray12);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) 1, intArray12);
        // The following exception was thrown during execution in test generation
        try {
            ds.AvaliaMultMatrizes.multmatrize((int) (short) 10, intArray12);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[0, 1, 1, 10]");
    }

    @Test
    public void test1662() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1662");
        int[] intArray8 = new int[] { (short) -1, (-1) };
        ds.AvaliaMultMatrizes.multmatrize((int) (short) 0, intArray8);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) -1, intArray8);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) 1, intArray8);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) 1, intArray8);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) -1, intArray8);
        ds.AvaliaMultMatrizes.multmatrize(1, intArray8);
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[-1, -1]");
    }

    @Test
    public void test1663() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1663");
        int[] intArray10 = new int[] { (short) -1, (-1) };
        ds.AvaliaMultMatrizes.multmatrize((int) (short) 0, intArray10);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) -1, intArray10);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) -1, intArray10);
        ds.AvaliaMultMatrizes.multmatrize((-1), intArray10);
        ds.AvaliaMultMatrizes.multmatrize(1, intArray10);
        ds.AvaliaMultMatrizes.multmatrize((-1), intArray10);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) 1, intArray10);
        ds.AvaliaMultMatrizes.multmatrize(0, intArray10);
        java.lang.Class<?> wildcardClass19 = intArray10.getClass();
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[-1, -1]");
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test1664() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1664");
        int[] intArray7 = new int[] { (short) -1, (-1) };
        ds.AvaliaMultMatrizes.multmatrize((int) (short) 0, intArray7);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) -1, intArray7);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) -1, intArray7);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) -1, intArray7);
        // The following exception was thrown during execution in test generation
        try {
            ds.AvaliaMultMatrizes.multmatrize((int) ' ', intArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[-1, -1]");
    }

    @Test
    public void test1665() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1665");
        int[] intArray11 = new int[] { (short) -1, (-1) };
        ds.AvaliaMultMatrizes.multmatrize((int) (short) 0, intArray11);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) -1, intArray11);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) -1, intArray11);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) 1, intArray11);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) -1, intArray11);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) 0, intArray11);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) 0, intArray11);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) 0, intArray11);
        ds.AvaliaMultMatrizes.multmatrize((-1), intArray11);
        java.lang.Class<?> wildcardClass21 = intArray11.getClass();
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[-1, -1]");
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test1666() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1666");
        int[] intArray8 = new int[] { '4', 100, 0, (byte) 10, 0 };
        ds.AvaliaMultMatrizes.multmatrize(0, intArray8);
        ds.AvaliaMultMatrizes.multmatrize((-1), intArray8);
        ds.AvaliaMultMatrizes.multmatrize(0, intArray8);
        java.lang.Class<?> wildcardClass12 = intArray8.getClass();
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[52, 100, 0, 10, 0]");
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test1667() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1667");
        int[] intArray11 = new int[] { '4', 100, 0, (byte) 10, 0 };
        ds.AvaliaMultMatrizes.multmatrize(0, intArray11);
        ds.AvaliaMultMatrizes.multmatrize((-1), intArray11);
        ds.AvaliaMultMatrizes.multmatrize((-1), intArray11);
        ds.AvaliaMultMatrizes.multmatrize(0, intArray11);
        ds.AvaliaMultMatrizes.multmatrize(0, intArray11);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) 1, intArray11);
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[52, 100, 0, 10, 0]");
    }

    @Test
    public void test1668() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1668");
        int[] intArray11 = new int[] { ' ', (byte) 0, (byte) -1 };
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) -1, intArray11);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) 1, intArray11);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) 0, intArray11);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) 0, intArray11);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) -1, intArray11);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) 1, intArray11);
        ds.AvaliaMultMatrizes.multmatrize(0, intArray11);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) 0, intArray11);
        java.lang.Class<?> wildcardClass20 = intArray11.getClass();
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[32, 0, -1]");
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test1669() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1669");
        int[] intArray13 = new int[] { (short) -1, (-1) };
        ds.AvaliaMultMatrizes.multmatrize((int) (short) 0, intArray13);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) -1, intArray13);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) -1, intArray13);
        ds.AvaliaMultMatrizes.multmatrize(1, intArray13);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) 0, intArray13);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) 1, intArray13);
        ds.AvaliaMultMatrizes.multmatrize(0, intArray13);
        ds.AvaliaMultMatrizes.multmatrize((-1), intArray13);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) -1, intArray13);
        ds.AvaliaMultMatrizes.multmatrize((-1), intArray13);
        // The following exception was thrown during execution in test generation
        try {
            ds.AvaliaMultMatrizes.multmatrize((int) (byte) 10, intArray13);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[-1, -1]");
    }

    @Test
    public void test1670() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1670");
        int[] intArray8 = new int[] { (short) -1, (-1) };
        ds.AvaliaMultMatrizes.multmatrize((int) (short) 0, intArray8);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) -1, intArray8);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) -1, intArray8);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) 1, intArray8);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) -1, intArray8);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) 1, intArray8);
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[-1, -1]");
    }

    @Test
    public void test1671() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1671");
        int[] intArray6 = new int[] { (short) -1, (-1) };
        ds.AvaliaMultMatrizes.multmatrize((int) (short) 0, intArray6);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) -1, intArray6);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) -1, intArray6);
        // The following exception was thrown during execution in test generation
        try {
            ds.AvaliaMultMatrizes.multmatrize((int) (byte) 10, intArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[-1, -1]");
    }

    @Test
    public void test1672() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1672");
        int[] intArray10 = new int[] { 0, (byte) 1, 1, (byte) 10 };
        ds.AvaliaMultMatrizes.multmatrize((-1), intArray10);
        ds.AvaliaMultMatrizes.multmatrize(0, intArray10);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) 0, intArray10);
        ds.AvaliaMultMatrizes.multmatrize((-1), intArray10);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) 1, intArray10);
        ds.AvaliaMultMatrizes.multmatrize((-1), intArray10);
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[0, 1, 1, 10]");
    }

    @Test
    public void test1673() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1673");
        int[] intArray9 = new int[] { (short) -1, (-1) };
        ds.AvaliaMultMatrizes.multmatrize((int) (short) 0, intArray9);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) -1, intArray9);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) -1, intArray9);
        ds.AvaliaMultMatrizes.multmatrize((-1), intArray9);
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
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[-1, -1]");
    }

    @Test
    public void test1674() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1674");
        int[] intArray12 = new int[] { (short) -1, (-1) };
        ds.AvaliaMultMatrizes.multmatrize((int) (short) 0, intArray12);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) -1, intArray12);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) -1, intArray12);
        ds.AvaliaMultMatrizes.multmatrize((-1), intArray12);
        ds.AvaliaMultMatrizes.multmatrize(1, intArray12);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) 0, intArray12);
        ds.AvaliaMultMatrizes.multmatrize((-1), intArray12);
        ds.AvaliaMultMatrizes.multmatrize(0, intArray12);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) 1, intArray12);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) 1, intArray12);
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[-1, -1]");
    }

    @Test
    public void test1675() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1675");
        int[] intArray8 = new int[] { (short) -1, (-1) };
        ds.AvaliaMultMatrizes.multmatrize((int) (short) 0, intArray8);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) -1, intArray8);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) -1, intArray8);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) -1, intArray8);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) 1, intArray8);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) 1, intArray8);
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[-1, -1]");
    }

    @Test
    public void test1676() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1676");
        int[] intArray11 = new int[] { ' ', (byte) 0, (byte) -1 };
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) -1, intArray11);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) 1, intArray11);
        ds.AvaliaMultMatrizes.multmatrize((-1), intArray11);
        ds.AvaliaMultMatrizes.multmatrize(0, intArray11);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) -1, intArray11);
        ds.AvaliaMultMatrizes.multmatrize((-1), intArray11);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) -1, intArray11);
        // The following exception was thrown during execution in test generation
        try {
            ds.AvaliaMultMatrizes.multmatrize((int) (byte) 10, intArray11);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[32, 0, -1]");
    }

    @Test
    public void test1677() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1677");
        int[] intArray11 = new int[] { ' ', (byte) 0, (byte) -1 };
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) -1, intArray11);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) 1, intArray11);
        ds.AvaliaMultMatrizes.multmatrize(1, intArray11);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) -1, intArray11);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) -1, intArray11);
        ds.AvaliaMultMatrizes.multmatrize(0, intArray11);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) 1, intArray11);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) -1, intArray11);
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[32, 0, -1]");
    }

    @Test
    public void test1678() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1678");
        int[] intArray10 = new int[] { ' ', (byte) 0, (byte) -1 };
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) -1, intArray10);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) 1, intArray10);
        ds.AvaliaMultMatrizes.multmatrize(1, intArray10);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) -1, intArray10);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) 0, intArray10);
        ds.AvaliaMultMatrizes.multmatrize(0, intArray10);
        // The following exception was thrown during execution in test generation
        try {
            ds.AvaliaMultMatrizes.multmatrize((int) ' ', intArray10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[32, 0, -1]");
    }

    @Test
    public void test1679() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1679");
        int[] intArray9 = new int[] { '4', 100, 0, (byte) 10, 0 };
        ds.AvaliaMultMatrizes.multmatrize(0, intArray9);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) -1, intArray9);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) 0, intArray9);
        // The following exception was thrown during execution in test generation
        try {
            ds.AvaliaMultMatrizes.multmatrize(10, intArray9);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[52, 100, 0, 10, 0]");
    }

    @Test
    public void test1680() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1680");
        int[] intArray12 = new int[] { 0, (byte) 1, 1, (byte) 10 };
        ds.AvaliaMultMatrizes.multmatrize((-1), intArray12);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) 1, intArray12);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) 0, intArray12);
        ds.AvaliaMultMatrizes.multmatrize(0, intArray12);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) -1, intArray12);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) 1, intArray12);
        ds.AvaliaMultMatrizes.multmatrize((-1), intArray12);
        // The following exception was thrown during execution in test generation
        try {
            ds.AvaliaMultMatrizes.multmatrize(10, intArray12);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[0, 1, 1, 10]");
    }

    @Test
    public void test1681() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1681");
        int[] intArray9 = new int[] { (short) -1, (-1) };
        ds.AvaliaMultMatrizes.multmatrize((int) (short) 0, intArray9);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) -1, intArray9);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) -1, intArray9);
        ds.AvaliaMultMatrizes.multmatrize((-1), intArray9);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) -1, intArray9);
        ds.AvaliaMultMatrizes.multmatrize(0, intArray9);
        // The following exception was thrown during execution in test generation
        try {
            ds.AvaliaMultMatrizes.multmatrize(10, intArray9);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[-1, -1]");
    }

    @Test
    public void test1682() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1682");
        int[] intArray8 = new int[] { (byte) -1, (short) 0, (byte) 100 };
        ds.AvaliaMultMatrizes.multmatrize((int) (short) 0, intArray8);
        ds.AvaliaMultMatrizes.multmatrize(0, intArray8);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) -1, intArray8);
        ds.AvaliaMultMatrizes.multmatrize(0, intArray8);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) -1, intArray8);
        java.lang.Class<?> wildcardClass14 = intArray8.getClass();
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[-1, 0, 100]");
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test1683() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1683");
        int[] intArray9 = new int[] { (short) -1, (-1) };
        ds.AvaliaMultMatrizes.multmatrize((int) (short) 0, intArray9);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) -1, intArray9);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) -1, intArray9);
        ds.AvaliaMultMatrizes.multmatrize((-1), intArray9);
        ds.AvaliaMultMatrizes.multmatrize((-1), intArray9);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) -1, intArray9);
        // The following exception was thrown during execution in test generation
        try {
            ds.AvaliaMultMatrizes.multmatrize((int) ' ', intArray9);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[-1, -1]");
    }

    @Test
    public void test1684() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1684");
        int[] intArray9 = new int[] { ' ', (byte) 0, (byte) -1 };
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) -1, intArray9);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) 1, intArray9);
        ds.AvaliaMultMatrizes.multmatrize(1, intArray9);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) -1, intArray9);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) -1, intArray9);
        // The following exception was thrown during execution in test generation
        try {
            ds.AvaliaMultMatrizes.multmatrize((int) (short) 100, intArray9);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[32, 0, -1]");
    }

    @Test
    public void test1685() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1685");
        int[] intArray10 = new int[] { 0, (byte) 100 };
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) -1, intArray10);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) 0, intArray10);
        ds.AvaliaMultMatrizes.multmatrize(1, intArray10);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) 0, intArray10);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) -1, intArray10);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) 1, intArray10);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) 0, intArray10);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) 1, intArray10);
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[0, 100]");
    }

    @Test
    public void test1686() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1686");
        int[] intArray13 = new int[] { ' ', (byte) 0, (byte) -1 };
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) -1, intArray13);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) 1, intArray13);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) 0, intArray13);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) 0, intArray13);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) -1, intArray13);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) 1, intArray13);
        ds.AvaliaMultMatrizes.multmatrize(0, intArray13);
        ds.AvaliaMultMatrizes.multmatrize(0, intArray13);
        ds.AvaliaMultMatrizes.multmatrize((-1), intArray13);
        ds.AvaliaMultMatrizes.multmatrize(0, intArray13);
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[32, 0, -1]");
    }

    @Test
    public void test1687() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1687");
        int[] intArray13 = new int[] { (short) -1, (-1) };
        ds.AvaliaMultMatrizes.multmatrize((int) (short) 0, intArray13);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) -1, intArray13);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) -1, intArray13);
        ds.AvaliaMultMatrizes.multmatrize(1, intArray13);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) 0, intArray13);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) 1, intArray13);
        ds.AvaliaMultMatrizes.multmatrize(0, intArray13);
        ds.AvaliaMultMatrizes.multmatrize(0, intArray13);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) 1, intArray13);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) 0, intArray13);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) 1, intArray13);
        java.lang.Class<?> wildcardClass25 = intArray13.getClass();
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[-1, -1]");
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test1688() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1688");
        int[] intArray9 = new int[] { (short) -1, (-1) };
        ds.AvaliaMultMatrizes.multmatrize((int) (short) 0, intArray9);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) -1, intArray9);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) -1, intArray9);
        ds.AvaliaMultMatrizes.multmatrize((-1), intArray9);
        ds.AvaliaMultMatrizes.multmatrize((-1), intArray9);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) -1, intArray9);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) -1, intArray9);
        java.lang.Class<?> wildcardClass17 = intArray9.getClass();
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[-1, -1]");
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test1689() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1689");
        int[] intArray11 = new int[] { (short) -1, (-1) };
        ds.AvaliaMultMatrizes.multmatrize((int) (short) 0, intArray11);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) -1, intArray11);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) -1, intArray11);
        ds.AvaliaMultMatrizes.multmatrize((-1), intArray11);
        ds.AvaliaMultMatrizes.multmatrize(1, intArray11);
        ds.AvaliaMultMatrizes.multmatrize((-1), intArray11);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) 1, intArray11);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) -1, intArray11);
        // The following exception was thrown during execution in test generation
        try {
            ds.AvaliaMultMatrizes.multmatrize((int) '#', intArray11);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[-1, -1]");
    }

    @Test
    public void test1690() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1690");
        int[] intArray10 = new int[] { (byte) -1 };
        ds.AvaliaMultMatrizes.multmatrize((int) (short) 1, intArray10);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) 1, intArray10);
        ds.AvaliaMultMatrizes.multmatrize(0, intArray10);
        ds.AvaliaMultMatrizes.multmatrize(0, intArray10);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) 0, intArray10);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) -1, intArray10);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) 1, intArray10);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) 0, intArray10);
        ds.AvaliaMultMatrizes.multmatrize(1, intArray10);
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[-1]");
    }

    @Test
    public void test1691() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1691");
        int[] intArray9 = new int[] { ' ', (byte) 0, (byte) -1 };
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) -1, intArray9);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) 1, intArray9);
        ds.AvaliaMultMatrizes.multmatrize(1, intArray9);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) -1, intArray9);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) 0, intArray9);
        ds.AvaliaMultMatrizes.multmatrize(0, intArray9);
        java.lang.Class<?> wildcardClass16 = intArray9.getClass();
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[32, 0, -1]");
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test1692() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1692");
        int[] intArray11 = new int[] { 0, (byte) 1, 1, (byte) 10 };
        ds.AvaliaMultMatrizes.multmatrize((-1), intArray11);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) 1, intArray11);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) -1, intArray11);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) 1, intArray11);
        ds.AvaliaMultMatrizes.multmatrize(0, intArray11);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) 0, intArray11);
        ds.AvaliaMultMatrizes.multmatrize(0, intArray11);
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[0, 1, 1, 10]");
    }

    @Test
    public void test1693() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1693");
        int[] intArray9 = new int[] { (byte) -1 };
        ds.AvaliaMultMatrizes.multmatrize((int) (short) 1, intArray9);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) 1, intArray9);
        ds.AvaliaMultMatrizes.multmatrize(0, intArray9);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) -1, intArray9);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) 1, intArray9);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) 0, intArray9);
        ds.AvaliaMultMatrizes.multmatrize((-1), intArray9);
        ds.AvaliaMultMatrizes.multmatrize(1, intArray9);
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[-1]");
    }

    @Test
    public void test1694() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1694");
        int[] intArray13 = new int[] { ' ', (byte) 0, (byte) -1 };
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) -1, intArray13);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) -1, intArray13);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) 0, intArray13);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) -1, intArray13);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) -1, intArray13);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) 0, intArray13);
        ds.AvaliaMultMatrizes.multmatrize(1, intArray13);
        ds.AvaliaMultMatrizes.multmatrize(1, intArray13);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) 1, intArray13);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) 1, intArray13);
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[32, 0, -1]");
    }

    @Test
    public void test1695() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1695");
        int[] intArray9 = new int[] { ' ', (byte) 0, (byte) -1 };
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) -1, intArray9);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) 1, intArray9);
        ds.AvaliaMultMatrizes.multmatrize(1, intArray9);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) -1, intArray9);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) 1, intArray9);
        ds.AvaliaMultMatrizes.multmatrize(0, intArray9);
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[32, 0, -1]");
    }

    @Test
    public void test1696() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1696");
        int[] intArray13 = new int[] { (short) -1, (-1) };
        ds.AvaliaMultMatrizes.multmatrize((int) (short) 0, intArray13);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) -1, intArray13);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) -1, intArray13);
        ds.AvaliaMultMatrizes.multmatrize((-1), intArray13);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) 1, intArray13);
        ds.AvaliaMultMatrizes.multmatrize(0, intArray13);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) 1, intArray13);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) 0, intArray13);
        ds.AvaliaMultMatrizes.multmatrize(1, intArray13);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) -1, intArray13);
        // The following exception was thrown during execution in test generation
        try {
            ds.AvaliaMultMatrizes.multmatrize((int) (short) 100, intArray13);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[-1, -1]");
    }

    @Test
    public void test1697() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1697");
        int[] intArray9 = new int[] { (short) -1, (-1) };
        ds.AvaliaMultMatrizes.multmatrize((int) (short) 0, intArray9);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) -1, intArray9);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) -1, intArray9);
        ds.AvaliaMultMatrizes.multmatrize((-1), intArray9);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) -1, intArray9);
        ds.AvaliaMultMatrizes.multmatrize(0, intArray9);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) -1, intArray9);
        java.lang.Class<?> wildcardClass17 = intArray9.getClass();
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[-1, -1]");
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test1698() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1698");
        int[] intArray6 = new int[] { 0, (byte) 100 };
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) -1, intArray6);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) 0, intArray6);
        ds.AvaliaMultMatrizes.multmatrize(1, intArray6);
        // The following exception was thrown during execution in test generation
        try {
            ds.AvaliaMultMatrizes.multmatrize((int) '4', intArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[0, 100]");
    }

    @Test
    public void test1699() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1699");
        int[] intArray7 = new int[] { (byte) -1 };
        ds.AvaliaMultMatrizes.multmatrize((int) (short) 1, intArray7);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) 1, intArray7);
        ds.AvaliaMultMatrizes.multmatrize((-1), intArray7);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) 0, intArray7);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) 1, intArray7);
        ds.AvaliaMultMatrizes.multmatrize(0, intArray7);
        java.lang.Class<?> wildcardClass14 = intArray7.getClass();
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[-1]");
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test1700() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1700");
        int[] intArray13 = new int[] { (short) -1, (-1) };
        ds.AvaliaMultMatrizes.multmatrize((int) (short) 0, intArray13);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) -1, intArray13);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) -1, intArray13);
        ds.AvaliaMultMatrizes.multmatrize(1, intArray13);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) 0, intArray13);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) 1, intArray13);
        ds.AvaliaMultMatrizes.multmatrize(0, intArray13);
        ds.AvaliaMultMatrizes.multmatrize(0, intArray13);
        ds.AvaliaMultMatrizes.multmatrize(0, intArray13);
        ds.AvaliaMultMatrizes.multmatrize(1, intArray13);
        ds.AvaliaMultMatrizes.multmatrize(1, intArray13);
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[-1, -1]");
    }

    @Test
    public void test1701() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1701");
        int[] intArray8 = new int[] { ' ', (byte) 0, (byte) -1 };
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) -1, intArray8);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) 1, intArray8);
        ds.AvaliaMultMatrizes.multmatrize(0, intArray8);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) 0, intArray8);
        // The following exception was thrown during execution in test generation
        try {
            ds.AvaliaMultMatrizes.multmatrize((int) (byte) 100, intArray8);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[32, 0, -1]");
    }

    @Test
    public void test1702() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1702");
        int[] intArray12 = new int[] { 0, (byte) 1, 1, (byte) 10 };
        ds.AvaliaMultMatrizes.multmatrize((-1), intArray12);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) 1, intArray12);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) 1, intArray12);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) 0, intArray12);
        ds.AvaliaMultMatrizes.multmatrize(0, intArray12);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) -1, intArray12);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) 1, intArray12);
        // The following exception was thrown during execution in test generation
        try {
            ds.AvaliaMultMatrizes.multmatrize((int) (short) 100, intArray12);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[0, 1, 1, 10]");
    }

    @Test
    public void test1703() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1703");
        int[] intArray11 = new int[] { ' ', (byte) 0, (byte) -1 };
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) -1, intArray11);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) 1, intArray11);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) 0, intArray11);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) 0, intArray11);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) 0, intArray11);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) 0, intArray11);
        ds.AvaliaMultMatrizes.multmatrize(0, intArray11);
        ds.AvaliaMultMatrizes.multmatrize(0, intArray11);
        java.lang.Class<?> wildcardClass20 = intArray11.getClass();
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[32, 0, -1]");
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test1704() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1704");
        int[] intArray8 = new int[] { ' ', (byte) 0, (byte) -1 };
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) -1, intArray8);
        ds.AvaliaMultMatrizes.multmatrize(1, intArray8);
        ds.AvaliaMultMatrizes.multmatrize(1, intArray8);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) 0, intArray8);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) -1, intArray8);
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[32, 0, -1]");
    }

    @Test
    public void test1705() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1705");
        int[] intArray12 = new int[] { 0, (byte) 1, 1, (byte) 10 };
        ds.AvaliaMultMatrizes.multmatrize((-1), intArray12);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) 1, intArray12);
        ds.AvaliaMultMatrizes.multmatrize(0, intArray12);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) 0, intArray12);
        ds.AvaliaMultMatrizes.multmatrize((-1), intArray12);
        ds.AvaliaMultMatrizes.multmatrize(1, intArray12);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) 0, intArray12);
        ds.AvaliaMultMatrizes.multmatrize((-1), intArray12);
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[0, 1, 1, 10]");
    }

    @Test
    public void test1706() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1706");
        int[] intArray14 = new int[] { (short) -1, (-1) };
        ds.AvaliaMultMatrizes.multmatrize((int) (short) 0, intArray14);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) -1, intArray14);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) -1, intArray14);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) 1, intArray14);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) -1, intArray14);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) 0, intArray14);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) 0, intArray14);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) -1, intArray14);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) -1, intArray14);
        ds.AvaliaMultMatrizes.multmatrize(1, intArray14);
        ds.AvaliaMultMatrizes.multmatrize(0, intArray14);
        // The following exception was thrown during execution in test generation
        try {
            ds.AvaliaMultMatrizes.multmatrize((int) '#', intArray14);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[-1, -1]");
    }

    @Test
    public void test1707() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1707");
        int[] intArray8 = new int[] { ' ', (byte) 0, (byte) -1 };
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) -1, intArray8);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) 1, intArray8);
        ds.AvaliaMultMatrizes.multmatrize(1, intArray8);
        ds.AvaliaMultMatrizes.multmatrize(0, intArray8);
        ds.AvaliaMultMatrizes.multmatrize(0, intArray8);
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[32, 0, -1]");
    }

    @Test
    public void test1708() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1708");
        int[] intArray13 = new int[] { (short) -1, (-1) };
        ds.AvaliaMultMatrizes.multmatrize((int) (short) 0, intArray13);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) -1, intArray13);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) -1, intArray13);
        ds.AvaliaMultMatrizes.multmatrize((-1), intArray13);
        ds.AvaliaMultMatrizes.multmatrize(1, intArray13);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) 0, intArray13);
        ds.AvaliaMultMatrizes.multmatrize((-1), intArray13);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) 0, intArray13);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) 0, intArray13);
        ds.AvaliaMultMatrizes.multmatrize((-1), intArray13);
        // The following exception was thrown during execution in test generation
        try {
            ds.AvaliaMultMatrizes.multmatrize((int) (byte) 100, intArray13);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[-1, -1]");
    }

    @Test
    public void test1709() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1709");
        int[] intArray10 = new int[] { (byte) -1 };
        ds.AvaliaMultMatrizes.multmatrize((int) (short) 1, intArray10);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) 1, intArray10);
        ds.AvaliaMultMatrizes.multmatrize(0, intArray10);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) -1, intArray10);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) 1, intArray10);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) 0, intArray10);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) 0, intArray10);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) 0, intArray10);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) -1, intArray10);
        java.lang.Class<?> wildcardClass20 = intArray10.getClass();
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[-1]");
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test1710() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1710");
        int[] intArray9 = new int[] { (short) -1, (-1) };
        ds.AvaliaMultMatrizes.multmatrize((int) (short) 0, intArray9);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) -1, intArray9);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) 1, intArray9);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) 1, intArray9);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) -1, intArray9);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) -1, intArray9);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) 0, intArray9);
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[-1, -1]");
    }

    @Test
    public void test1711() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1711");
        int[] intArray11 = new int[] { ' ', (byte) 0, (byte) -1 };
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) -1, intArray11);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) 1, intArray11);
        ds.AvaliaMultMatrizes.multmatrize((-1), intArray11);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) 0, intArray11);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) 0, intArray11);
        ds.AvaliaMultMatrizes.multmatrize((-1), intArray11);
        ds.AvaliaMultMatrizes.multmatrize(1, intArray11);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) -1, intArray11);
        java.lang.Class<?> wildcardClass20 = intArray11.getClass();
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[32, 0, -1]");
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test1712() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1712");
        int[] intArray9 = new int[] { (short) -1, (-1) };
        ds.AvaliaMultMatrizes.multmatrize((int) (short) 0, intArray9);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) -1, intArray9);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) -1, intArray9);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) 1, intArray9);
        ds.AvaliaMultMatrizes.multmatrize((-1), intArray9);
        ds.AvaliaMultMatrizes.multmatrize((-1), intArray9);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) 1, intArray9);
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[-1, -1]");
    }

    @Test
    public void test1713() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1713");
        int[] intArray6 = new int[] { 100 };
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) 1, intArray6);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) -1, intArray6);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) -1, intArray6);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) 0, intArray6);
        // The following exception was thrown during execution in test generation
        try {
            ds.AvaliaMultMatrizes.multmatrize((int) '4', intArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[100]");
    }

    @Test
    public void test1714() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1714");
        int[] intArray10 = new int[] { (byte) -1 };
        ds.AvaliaMultMatrizes.multmatrize((int) (short) 1, intArray10);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) 1, intArray10);
        ds.AvaliaMultMatrizes.multmatrize(0, intArray10);
        ds.AvaliaMultMatrizes.multmatrize(0, intArray10);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) 0, intArray10);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) 0, intArray10);
        ds.AvaliaMultMatrizes.multmatrize(0, intArray10);
        ds.AvaliaMultMatrizes.multmatrize((-1), intArray10);
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
    public void test1715() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1715");
        int[] intArray8 = new int[] { ' ', (byte) 0, (byte) -1 };
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) -1, intArray8);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) -1, intArray8);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) 0, intArray8);
        ds.AvaliaMultMatrizes.multmatrize(1, intArray8);
        ds.AvaliaMultMatrizes.multmatrize((-1), intArray8);
        java.lang.Class<?> wildcardClass14 = intArray8.getClass();
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[32, 0, -1]");
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test1716() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1716");
        int[] intArray12 = new int[] { (short) -1, (-1) };
        ds.AvaliaMultMatrizes.multmatrize((int) (short) 0, intArray12);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) -1, intArray12);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) -1, intArray12);
        ds.AvaliaMultMatrizes.multmatrize((-1), intArray12);
        ds.AvaliaMultMatrizes.multmatrize(1, intArray12);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) 0, intArray12);
        ds.AvaliaMultMatrizes.multmatrize((-1), intArray12);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) 0, intArray12);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) 0, intArray12);
        ds.AvaliaMultMatrizes.multmatrize(0, intArray12);
        java.lang.Class<?> wildcardClass23 = intArray12.getClass();
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[-1, -1]");
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test1717() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1717");
        int[] intArray10 = new int[] { ' ', (byte) 0, (byte) -1 };
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) -1, intArray10);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) -1, intArray10);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) 0, intArray10);
        ds.AvaliaMultMatrizes.multmatrize(1, intArray10);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) -1, intArray10);
        ds.AvaliaMultMatrizes.multmatrize(0, intArray10);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) -1, intArray10);
        java.lang.Class<?> wildcardClass18 = intArray10.getClass();
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[32, 0, -1]");
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test1718() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1718");
        int[] intArray6 = new int[] { 100 };
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) 1, intArray6);
        ds.AvaliaMultMatrizes.multmatrize(1, intArray6);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) 0, intArray6);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) 0, intArray6);
        // The following exception was thrown during execution in test generation
        try {
            ds.AvaliaMultMatrizes.multmatrize((int) 'a', intArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[100]");
    }

    @Test
    public void test1719() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1719");
        int[] intArray2 = new int[] { ' ' };
        ds.AvaliaMultMatrizes.multmatrize((int) (short) 0, intArray2);
        java.lang.Class<?> wildcardClass4 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[32]");
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test1720() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1720");
        int[] intArray10 = new int[] { ' ', (byte) 0, (byte) -1 };
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) -1, intArray10);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) -1, intArray10);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) 0, intArray10);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) -1, intArray10);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) -1, intArray10);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) 1, intArray10);
        // The following exception was thrown during execution in test generation
        try {
            ds.AvaliaMultMatrizes.multmatrize(10, intArray10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[32, 0, -1]");
    }

    @Test
    public void test1721() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1721");
        int[] intArray7 = new int[] { '4' };
        ds.AvaliaMultMatrizes.multmatrize((int) (short) -1, intArray7);
        ds.AvaliaMultMatrizes.multmatrize(1, intArray7);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) 1, intArray7);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) -1, intArray7);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) -1, intArray7);
        ds.AvaliaMultMatrizes.multmatrize(0, intArray7);
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[52]");
    }

    @Test
    public void test1722() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1722");
        int[] intArray12 = new int[] { (short) -1, (-1) };
        ds.AvaliaMultMatrizes.multmatrize((int) (short) 0, intArray12);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) -1, intArray12);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) -1, intArray12);
        ds.AvaliaMultMatrizes.multmatrize((-1), intArray12);
        ds.AvaliaMultMatrizes.multmatrize((-1), intArray12);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) 0, intArray12);
        ds.AvaliaMultMatrizes.multmatrize((-1), intArray12);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) 0, intArray12);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) 0, intArray12);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) 0, intArray12);
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[-1, -1]");
    }

    @Test
    public void test1723() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1723");
        int[] intArray7 = new int[] { (short) -1, (-1) };
        ds.AvaliaMultMatrizes.multmatrize((int) (short) 0, intArray7);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) -1, intArray7);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) -1, intArray7);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) -1, intArray7);
        // The following exception was thrown during execution in test generation
        try {
            ds.AvaliaMultMatrizes.multmatrize((int) '4', intArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[-1, -1]");
    }

    @Test
    public void test1724() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1724");
        int[] intArray9 = new int[] { ' ', (byte) 0, (byte) -1 };
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) -1, intArray9);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) 1, intArray9);
        ds.AvaliaMultMatrizes.multmatrize(0, intArray9);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) 1, intArray9);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) 1, intArray9);
        // The following exception was thrown during execution in test generation
        try {
            ds.AvaliaMultMatrizes.multmatrize(10, intArray9);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[32, 0, -1]");
    }

    @Test
    public void test1725() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1725");
        int[] intArray9 = new int[] { (short) -1, (-1) };
        ds.AvaliaMultMatrizes.multmatrize((int) (short) 0, intArray9);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) -1, intArray9);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) -1, intArray9);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) 1, intArray9);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) -1, intArray9);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) 1, intArray9);
        ds.AvaliaMultMatrizes.multmatrize((-1), intArray9);
        java.lang.Class<?> wildcardClass17 = intArray9.getClass();
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[-1, -1]");
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test1726() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1726");
        int[] intArray7 = new int[] { (short) -1, (-1) };
        ds.AvaliaMultMatrizes.multmatrize((int) (short) 0, intArray7);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) -1, intArray7);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) -1, intArray7);
        ds.AvaliaMultMatrizes.multmatrize(0, intArray7);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) -1, intArray7);
        java.lang.Class<?> wildcardClass13 = intArray7.getClass();
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[-1, -1]");
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test1727() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1727");
        int[] intArray9 = new int[] { ' ', (byte) 0, (byte) -1 };
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) -1, intArray9);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) 1, intArray9);
        ds.AvaliaMultMatrizes.multmatrize((-1), intArray9);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) 1, intArray9);
        ds.AvaliaMultMatrizes.multmatrize((-1), intArray9);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) 1, intArray9);
        java.lang.Class<?> wildcardClass16 = intArray9.getClass();
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[32, 0, -1]");
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test1728() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1728");
        int[] intArray12 = new int[] { 0, (byte) 1, 1, (byte) 10 };
        ds.AvaliaMultMatrizes.multmatrize((-1), intArray12);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) 1, intArray12);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) -1, intArray12);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) 1, intArray12);
        ds.AvaliaMultMatrizes.multmatrize(1, intArray12);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) 1, intArray12);
        ds.AvaliaMultMatrizes.multmatrize(1, intArray12);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) 0, intArray12);
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[0, 1, 1, 10]");
    }

    @Test
    public void test1729() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1729");
        int[] intArray9 = new int[] { (short) -1, (-1) };
        ds.AvaliaMultMatrizes.multmatrize((int) (short) 0, intArray9);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) -1, intArray9);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) 1, intArray9);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) 1, intArray9);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) 0, intArray9);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) -1, intArray9);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) 1, intArray9);
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[-1, -1]");
    }

    @Test
    public void test1730() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1730");
        int[] intArray7 = new int[] { '4' };
        ds.AvaliaMultMatrizes.multmatrize((int) (short) -1, intArray7);
        ds.AvaliaMultMatrizes.multmatrize(1, intArray7);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) 1, intArray7);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) -1, intArray7);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) 0, intArray7);
        // The following exception was thrown during execution in test generation
        try {
            ds.AvaliaMultMatrizes.multmatrize((int) 'a', intArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[52]");
    }

    @Test
    public void test1731() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1731");
        int[] intArray7 = new int[] { 0, (byte) 100 };
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) -1, intArray7);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) 0, intArray7);
        ds.AvaliaMultMatrizes.multmatrize(1, intArray7);
        ds.AvaliaMultMatrizes.multmatrize(0, intArray7);
        // The following exception was thrown during execution in test generation
        try {
            ds.AvaliaMultMatrizes.multmatrize((int) (byte) 10, intArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[0, 100]");
    }

    @Test
    public void test1732() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1732");
        int[] intArray11 = new int[] { (short) -1, (-1) };
        ds.AvaliaMultMatrizes.multmatrize((int) (short) 0, intArray11);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) -1, intArray11);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) -1, intArray11);
        ds.AvaliaMultMatrizes.multmatrize((-1), intArray11);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) -1, intArray11);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) -1, intArray11);
        ds.AvaliaMultMatrizes.multmatrize(1, intArray11);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) 1, intArray11);
        // The following exception was thrown during execution in test generation
        try {
            ds.AvaliaMultMatrizes.multmatrize((int) ' ', intArray11);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[-1, -1]");
    }

    @Test
    public void test1733() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1733");
        int[] intArray7 = new int[] { 0, (byte) 100 };
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) -1, intArray7);
        ds.AvaliaMultMatrizes.multmatrize(1, intArray7);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) 0, intArray7);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) 1, intArray7);
        // The following exception was thrown during execution in test generation
        try {
            ds.AvaliaMultMatrizes.multmatrize((int) (short) 100, intArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[0, 100]");
    }

    @Test
    public void test1734() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1734");
        int[] intArray11 = new int[] { ' ', (byte) 0, (byte) -1 };
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) -1, intArray11);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) 1, intArray11);
        ds.AvaliaMultMatrizes.multmatrize(1, intArray11);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) -1, intArray11);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) 0, intArray11);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) -1, intArray11);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) 0, intArray11);
        // The following exception was thrown during execution in test generation
        try {
            ds.AvaliaMultMatrizes.multmatrize(10, intArray11);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[32, 0, -1]");
    }

    @Test
    public void test1735() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1735");
        int[] intArray9 = new int[] { ' ', (byte) 0, (byte) -1 };
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) -1, intArray9);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) -1, intArray9);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) 0, intArray9);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) -1, intArray9);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) -1, intArray9);
        ds.AvaliaMultMatrizes.multmatrize(0, intArray9);
        java.lang.Class<?> wildcardClass16 = intArray9.getClass();
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[32, 0, -1]");
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test1736() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1736");
        int[] intArray10 = new int[] { (byte) 100, (-1), ' ', 10 };
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) 1, intArray10);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) 0, intArray10);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) 0, intArray10);
        ds.AvaliaMultMatrizes.multmatrize(0, intArray10);
        ds.AvaliaMultMatrizes.multmatrize(0, intArray10);
        ds.AvaliaMultMatrizes.multmatrize(0, intArray10);
        java.lang.Class<?> wildcardClass17 = intArray10.getClass();
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[100, -1, 32, 10]");
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test1737() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1737");
        int[] intArray9 = new int[] { 0, (byte) 1, 1, (byte) 10 };
        ds.AvaliaMultMatrizes.multmatrize((-1), intArray9);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) 1, intArray9);
        ds.AvaliaMultMatrizes.multmatrize(0, intArray9);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) -1, intArray9);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) 1, intArray9);
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[0, 1, 1, 10]");
    }

    @Test
    public void test1738() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1738");
        int[] intArray11 = new int[] { 0, (byte) 1, 1, (byte) 10 };
        ds.AvaliaMultMatrizes.multmatrize((-1), intArray11);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) 1, intArray11);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) 0, intArray11);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) -1, intArray11);
        ds.AvaliaMultMatrizes.multmatrize(0, intArray11);
        ds.AvaliaMultMatrizes.multmatrize(1, intArray11);
        // The following exception was thrown during execution in test generation
        try {
            ds.AvaliaMultMatrizes.multmatrize((int) '#', intArray11);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[0, 1, 1, 10]");
    }

    @Test
    public void test1739() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1739");
        int[] intArray11 = new int[] { (short) -1, (-1) };
        ds.AvaliaMultMatrizes.multmatrize((int) (short) 0, intArray11);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) -1, intArray11);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) -1, intArray11);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) 1, intArray11);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) -1, intArray11);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) 0, intArray11);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) 0, intArray11);
        ds.AvaliaMultMatrizes.multmatrize((-1), intArray11);
        ds.AvaliaMultMatrizes.multmatrize((-1), intArray11);
        java.lang.Class<?> wildcardClass21 = intArray11.getClass();
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[-1, -1]");
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test1740() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1740");
        int[] intArray11 = new int[] { ' ', (byte) 0, (byte) -1 };
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) -1, intArray11);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) 1, intArray11);
        ds.AvaliaMultMatrizes.multmatrize((-1), intArray11);
        ds.AvaliaMultMatrizes.multmatrize(0, intArray11);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) -1, intArray11);
        ds.AvaliaMultMatrizes.multmatrize((-1), intArray11);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) 1, intArray11);
        ds.AvaliaMultMatrizes.multmatrize(0, intArray11);
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[32, 0, -1]");
    }

    @Test
    public void test1741() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1741");
        int[] intArray8 = new int[] { (byte) -1 };
        ds.AvaliaMultMatrizes.multmatrize((int) (short) 1, intArray8);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) 1, intArray8);
        ds.AvaliaMultMatrizes.multmatrize(0, intArray8);
        ds.AvaliaMultMatrizes.multmatrize(0, intArray8);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) 0, intArray8);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) 0, intArray8);
        // The following exception was thrown during execution in test generation
        try {
            ds.AvaliaMultMatrizes.multmatrize((int) 'a', intArray8);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[-1]");
    }

    @Test
    public void test1742() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1742");
        int[] intArray7 = new int[] { (short) -1, (-1) };
        ds.AvaliaMultMatrizes.multmatrize((int) (short) 0, intArray7);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) -1, intArray7);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) 1, intArray7);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) -1, intArray7);
        // The following exception was thrown during execution in test generation
        try {
            ds.AvaliaMultMatrizes.multmatrize((int) '4', intArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[-1, -1]");
    }

    @Test
    public void test1743() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1743");
        int[] intArray6 = new int[] { 100 };
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) 1, intArray6);
        ds.AvaliaMultMatrizes.multmatrize(1, intArray6);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) 0, intArray6);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) 0, intArray6);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) 0, intArray6);
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[100]");
    }

    @Test
    public void test1744() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1744");
        int[] intArray8 = new int[] { ' ', (byte) 0, (byte) -1 };
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) -1, intArray8);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) 1, intArray8);
        ds.AvaliaMultMatrizes.multmatrize((-1), intArray8);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) 0, intArray8);
        ds.AvaliaMultMatrizes.multmatrize(1, intArray8);
        java.lang.Class<?> wildcardClass14 = intArray8.getClass();
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[32, 0, -1]");
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test1745() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1745");
        int[] intArray11 = new int[] { 0, (byte) 1, 1, (byte) 10 };
        ds.AvaliaMultMatrizes.multmatrize((-1), intArray11);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) 1, intArray11);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) 0, intArray11);
        ds.AvaliaMultMatrizes.multmatrize(0, intArray11);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) -1, intArray11);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) 1, intArray11);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) -1, intArray11);
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[0, 1, 1, 10]");
    }

    @Test
    public void test1746() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1746");
        int[] intArray8 = new int[] { ' ', (byte) 0, (byte) -1 };
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) -1, intArray8);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) -1, intArray8);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) 0, intArray8);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) -1, intArray8);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) -1, intArray8);
        java.lang.Class<?> wildcardClass14 = intArray8.getClass();
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[32, 0, -1]");
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test1747() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1747");
        int[] intArray10 = new int[] { 0, (byte) 1, 1, (byte) 10 };
        ds.AvaliaMultMatrizes.multmatrize((-1), intArray10);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) 1, intArray10);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) 0, intArray10);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) -1, intArray10);
        ds.AvaliaMultMatrizes.multmatrize(0, intArray10);
        // The following exception was thrown during execution in test generation
        try {
            ds.AvaliaMultMatrizes.multmatrize(100, intArray10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[0, 1, 1, 10]");
    }

    @Test
    public void test1748() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1748");
        int[] intArray11 = new int[] { (short) -1, (-1) };
        ds.AvaliaMultMatrizes.multmatrize((int) (short) 0, intArray11);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) -1, intArray11);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) -1, intArray11);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) 1, intArray11);
        ds.AvaliaMultMatrizes.multmatrize(0, intArray11);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) -1, intArray11);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) -1, intArray11);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) 0, intArray11);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) 0, intArray11);
        java.lang.Class<?> wildcardClass21 = intArray11.getClass();
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[-1, -1]");
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test1749() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1749");
        int[] intArray12 = new int[] { ' ', (byte) 0, (byte) -1 };
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) -1, intArray12);
        ds.AvaliaMultMatrizes.multmatrize(1, intArray12);
        ds.AvaliaMultMatrizes.multmatrize(1, intArray12);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) 0, intArray12);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) -1, intArray12);
        ds.AvaliaMultMatrizes.multmatrize(0, intArray12);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) -1, intArray12);
        ds.AvaliaMultMatrizes.multmatrize(0, intArray12);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) 1, intArray12);
        java.lang.Class<?> wildcardClass22 = intArray12.getClass();
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[32, 0, -1]");
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test1750() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1750");
        int[] intArray9 = new int[] { 0, (byte) 1, 1, (byte) 10 };
        ds.AvaliaMultMatrizes.multmatrize((-1), intArray9);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) 1, intArray9);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) 1, intArray9);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) 0, intArray9);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) 0, intArray9);
        java.lang.Class<?> wildcardClass15 = intArray9.getClass();
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[0, 1, 1, 10]");
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test1751() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1751");
        int[] intArray10 = new int[] { 0, (byte) 100 };
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) -1, intArray10);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) 0, intArray10);
        ds.AvaliaMultMatrizes.multmatrize(1, intArray10);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) 0, intArray10);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) -1, intArray10);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) 1, intArray10);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) 0, intArray10);
        // The following exception was thrown during execution in test generation
        try {
            ds.AvaliaMultMatrizes.multmatrize((int) '#', intArray10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[0, 100]");
    }

    @Test
    public void test1752() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1752");
        int[] intArray8 = new int[] { 0, (byte) 100 };
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) -1, intArray8);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) 0, intArray8);
        ds.AvaliaMultMatrizes.multmatrize(0, intArray8);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) 1, intArray8);
        ds.AvaliaMultMatrizes.multmatrize(1, intArray8);
        // The following exception was thrown during execution in test generation
        try {
            ds.AvaliaMultMatrizes.multmatrize((int) (short) 10, intArray8);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[0, 100]");
    }

    @Test
    public void test1753() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1753");
        int[] intArray8 = new int[] { ' ', (byte) 0, (byte) -1 };
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) -1, intArray8);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) 1, intArray8);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) 1, intArray8);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) -1, intArray8);
        // The following exception was thrown during execution in test generation
        try {
            ds.AvaliaMultMatrizes.multmatrize((int) 'a', intArray8);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[32, 0, -1]");
    }

    @Test
    public void test1754() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1754");
        int[] intArray7 = new int[] { (byte) -1 };
        ds.AvaliaMultMatrizes.multmatrize((int) (short) 1, intArray7);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) 1, intArray7);
        ds.AvaliaMultMatrizes.multmatrize((-1), intArray7);
        ds.AvaliaMultMatrizes.multmatrize(0, intArray7);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) 0, intArray7);
        // The following exception was thrown during execution in test generation
        try {
            ds.AvaliaMultMatrizes.multmatrize((int) (short) 100, intArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[-1]");
    }

    @Test
    public void test1755() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1755");
        int[] intArray14 = new int[] { 0, (byte) 1, 1, (byte) 10 };
        ds.AvaliaMultMatrizes.multmatrize((-1), intArray14);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) 1, intArray14);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) 1, intArray14);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) 0, intArray14);
        ds.AvaliaMultMatrizes.multmatrize(0, intArray14);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) -1, intArray14);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) 1, intArray14);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) -1, intArray14);
        ds.AvaliaMultMatrizes.multmatrize(0, intArray14);
        // The following exception was thrown during execution in test generation
        try {
            ds.AvaliaMultMatrizes.multmatrize((int) (short) 10, intArray14);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[0, 1, 1, 10]");
    }

    @Test
    public void test1756() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1756");
        int[] intArray11 = new int[] { 0, (byte) 1, 1, (byte) 10 };
        ds.AvaliaMultMatrizes.multmatrize((-1), intArray11);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) 1, intArray11);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) -1, intArray11);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) 1, intArray11);
        ds.AvaliaMultMatrizes.multmatrize(0, intArray11);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) -1, intArray11);
        ds.AvaliaMultMatrizes.multmatrize(0, intArray11);
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[0, 1, 1, 10]");
    }

    @Test
    public void test1757() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1757");
        int[] intArray13 = new int[] { (short) -1, (-1) };
        ds.AvaliaMultMatrizes.multmatrize((int) (short) 0, intArray13);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) -1, intArray13);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) -1, intArray13);
        ds.AvaliaMultMatrizes.multmatrize(1, intArray13);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) 0, intArray13);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) 1, intArray13);
        ds.AvaliaMultMatrizes.multmatrize(0, intArray13);
        ds.AvaliaMultMatrizes.multmatrize(0, intArray13);
        ds.AvaliaMultMatrizes.multmatrize(0, intArray13);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) -1, intArray13);
        ds.AvaliaMultMatrizes.multmatrize(0, intArray13);
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[-1, -1]");
    }

    @Test
    public void test1758() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1758");
        int[] intArray11 = new int[] { 0, (byte) 1, 1, (byte) 10 };
        ds.AvaliaMultMatrizes.multmatrize((-1), intArray11);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) 1, intArray11);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) 0, intArray11);
        ds.AvaliaMultMatrizes.multmatrize(0, intArray11);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) -1, intArray11);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) 1, intArray11);
        ds.AvaliaMultMatrizes.multmatrize((-1), intArray11);
        java.lang.Class<?> wildcardClass19 = intArray11.getClass();
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[0, 1, 1, 10]");
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test1759() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1759");
        int[] intArray12 = new int[] { ' ', (byte) 0, (byte) -1 };
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) -1, intArray12);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) -1, intArray12);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) 0, intArray12);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) -1, intArray12);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) -1, intArray12);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) 0, intArray12);
        ds.AvaliaMultMatrizes.multmatrize(1, intArray12);
        ds.AvaliaMultMatrizes.multmatrize(1, intArray12);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) 0, intArray12);
        java.lang.Class<?> wildcardClass22 = intArray12.getClass();
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[32, 0, -1]");
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test1760() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1760");
        int[] intArray10 = new int[] { 0, (byte) 1, 1, (byte) 10 };
        ds.AvaliaMultMatrizes.multmatrize((-1), intArray10);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) 1, intArray10);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) -1, intArray10);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) 0, intArray10);
        ds.AvaliaMultMatrizes.multmatrize(1, intArray10);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) 1, intArray10);
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[0, 1, 1, 10]");
    }

    @Test
    public void test1761() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1761");
        int[] intArray9 = new int[] { (short) -1, (-1) };
        ds.AvaliaMultMatrizes.multmatrize((int) (short) 0, intArray9);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) -1, intArray9);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) -1, intArray9);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) 1, intArray9);
        ds.AvaliaMultMatrizes.multmatrize((-1), intArray9);
        ds.AvaliaMultMatrizes.multmatrize((-1), intArray9);
        // The following exception was thrown during execution in test generation
        try {
            ds.AvaliaMultMatrizes.multmatrize((int) (short) 10, intArray9);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[-1, -1]");
    }

    @Test
    public void test1762() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1762");
        int[] intArray10 = new int[] { ' ', (byte) 0, (byte) -1 };
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) -1, intArray10);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) 1, intArray10);
        ds.AvaliaMultMatrizes.multmatrize((-1), intArray10);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) 0, intArray10);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) 0, intArray10);
        ds.AvaliaMultMatrizes.multmatrize(0, intArray10);
        // The following exception was thrown during execution in test generation
        try {
            ds.AvaliaMultMatrizes.multmatrize((int) '#', intArray10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[32, 0, -1]");
    }

    @Test
    public void test1763() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1763");
        int[] intArray11 = new int[] { (short) -1, (-1) };
        ds.AvaliaMultMatrizes.multmatrize((int) (short) 0, intArray11);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) -1, intArray11);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) -1, intArray11);
        ds.AvaliaMultMatrizes.multmatrize(1, intArray11);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) 0, intArray11);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) 0, intArray11);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) 0, intArray11);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) -1, intArray11);
        // The following exception was thrown during execution in test generation
        try {
            ds.AvaliaMultMatrizes.multmatrize(10, intArray11);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[-1, -1]");
    }

    @Test
    public void test1764() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1764");
        int[] intArray12 = new int[] { ' ', (byte) 0, (byte) -1 };
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) -1, intArray12);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) 1, intArray12);
        ds.AvaliaMultMatrizes.multmatrize((-1), intArray12);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) 0, intArray12);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) 0, intArray12);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) 0, intArray12);
        ds.AvaliaMultMatrizes.multmatrize(1, intArray12);
        ds.AvaliaMultMatrizes.multmatrize(0, intArray12);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) 0, intArray12);
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[32, 0, -1]");
    }

    @Test
    public void test1765() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1765");
        int[] intArray6 = new int[] { (byte) -1 };
        ds.AvaliaMultMatrizes.multmatrize((int) (short) 1, intArray6);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) 1, intArray6);
        ds.AvaliaMultMatrizes.multmatrize(0, intArray6);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) -1, intArray6);
        // The following exception was thrown during execution in test generation
        try {
            ds.AvaliaMultMatrizes.multmatrize((int) '#', intArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[-1]");
    }

    @Test
    public void test1766() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1766");
        int[] intArray11 = new int[] { ' ', (byte) 0, (byte) -1 };
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) -1, intArray11);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) -1, intArray11);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) 0, intArray11);
        ds.AvaliaMultMatrizes.multmatrize(1, intArray11);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) -1, intArray11);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) 1, intArray11);
        ds.AvaliaMultMatrizes.multmatrize(0, intArray11);
        // The following exception was thrown during execution in test generation
        try {
            ds.AvaliaMultMatrizes.multmatrize((int) '4', intArray11);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[32, 0, -1]");
    }

    @Test
    public void test1767() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1767");
        int[] intArray10 = new int[] { 0, (byte) 1, 1, (byte) 10 };
        ds.AvaliaMultMatrizes.multmatrize((-1), intArray10);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) 1, intArray10);
        ds.AvaliaMultMatrizes.multmatrize(0, intArray10);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) 0, intArray10);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) -1, intArray10);
        ds.AvaliaMultMatrizes.multmatrize(0, intArray10);
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[0, 1, 1, 10]");
    }

    @Test
    public void test1768() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1768");
        int[] intArray8 = new int[] { 0, (byte) 100 };
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) -1, intArray8);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) 0, intArray8);
        ds.AvaliaMultMatrizes.multmatrize(0, intArray8);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) 1, intArray8);
        ds.AvaliaMultMatrizes.multmatrize(1, intArray8);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) 0, intArray8);
        java.lang.Class<?> wildcardClass15 = intArray8.getClass();
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[0, 100]");
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test1769() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1769");
        int[] intArray8 = new int[] { ' ', (byte) 0, (byte) -1 };
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) -1, intArray8);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) 1, intArray8);
        ds.AvaliaMultMatrizes.multmatrize(0, intArray8);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) 1, intArray8);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) 1, intArray8);
        java.lang.Class<?> wildcardClass14 = intArray8.getClass();
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[32, 0, -1]");
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test1770() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1770");
        int[] intArray10 = new int[] { ' ', (byte) 0, (byte) -1 };
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) -1, intArray10);
        ds.AvaliaMultMatrizes.multmatrize(1, intArray10);
        ds.AvaliaMultMatrizes.multmatrize(1, intArray10);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) 0, intArray10);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) -1, intArray10);
        ds.AvaliaMultMatrizes.multmatrize(0, intArray10);
        // The following exception was thrown during execution in test generation
        try {
            ds.AvaliaMultMatrizes.multmatrize((int) '4', intArray10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[32, 0, -1]");
    }

    @Test
    public void test1771() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1771");
        int[] intArray15 = new int[] { (short) -1, (-1) };
        ds.AvaliaMultMatrizes.multmatrize((int) (short) 0, intArray15);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) -1, intArray15);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) -1, intArray15);
        ds.AvaliaMultMatrizes.multmatrize((-1), intArray15);
        ds.AvaliaMultMatrizes.multmatrize(1, intArray15);
        ds.AvaliaMultMatrizes.multmatrize((-1), intArray15);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) 1, intArray15);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) 1, intArray15);
        ds.AvaliaMultMatrizes.multmatrize(0, intArray15);
        ds.AvaliaMultMatrizes.multmatrize((-1), intArray15);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) -1, intArray15);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) 0, intArray15);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) 0, intArray15);
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[-1, -1]");
    }

    @Test
    public void test1772() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1772");
        int[] intArray11 = new int[] { ' ', (byte) 0, (byte) -1 };
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) -1, intArray11);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) 1, intArray11);
        ds.AvaliaMultMatrizes.multmatrize((-1), intArray11);
        ds.AvaliaMultMatrizes.multmatrize(0, intArray11);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) -1, intArray11);
        ds.AvaliaMultMatrizes.multmatrize((-1), intArray11);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) 1, intArray11);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) 1, intArray11);
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[32, 0, -1]");
    }

    @Test
    public void test1773() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1773");
        int[] intArray12 = new int[] { (short) -1, (-1) };
        ds.AvaliaMultMatrizes.multmatrize((int) (short) 0, intArray12);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) -1, intArray12);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) -1, intArray12);
        ds.AvaliaMultMatrizes.multmatrize((-1), intArray12);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) 1, intArray12);
        ds.AvaliaMultMatrizes.multmatrize(0, intArray12);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) 1, intArray12);
        ds.AvaliaMultMatrizes.multmatrize(0, intArray12);
        ds.AvaliaMultMatrizes.multmatrize(0, intArray12);
        ds.AvaliaMultMatrizes.multmatrize(0, intArray12);
        java.lang.Class<?> wildcardClass23 = intArray12.getClass();
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[-1, -1]");
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test1774() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1774");
        int[] intArray12 = new int[] { 0, (byte) 1, 1, (byte) 10 };
        ds.AvaliaMultMatrizes.multmatrize((-1), intArray12);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) 1, intArray12);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) 0, intArray12);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) -1, intArray12);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) -1, intArray12);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) 0, intArray12);
        ds.AvaliaMultMatrizes.multmatrize(1, intArray12);
        // The following exception was thrown during execution in test generation
        try {
            ds.AvaliaMultMatrizes.multmatrize(100, intArray12);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[0, 1, 1, 10]");
    }

    @Test
    public void test1775() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1775");
        int[] intArray13 = new int[] { ' ', (byte) 0, (byte) -1 };
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) -1, intArray13);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) -1, intArray13);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) 0, intArray13);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) -1, intArray13);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) -1, intArray13);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) 0, intArray13);
        ds.AvaliaMultMatrizes.multmatrize(1, intArray13);
        ds.AvaliaMultMatrizes.multmatrize(1, intArray13);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) 0, intArray13);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) 1, intArray13);
        java.lang.Class<?> wildcardClass24 = intArray13.getClass();
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[32, 0, -1]");
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test1776() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1776");
        int[] intArray9 = new int[] { ' ', (byte) 0, (byte) -1 };
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) -1, intArray9);
        ds.AvaliaMultMatrizes.multmatrize(1, intArray9);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) 0, intArray9);
        ds.AvaliaMultMatrizes.multmatrize(0, intArray9);
        ds.AvaliaMultMatrizes.multmatrize(0, intArray9);
        // The following exception was thrown during execution in test generation
        try {
            ds.AvaliaMultMatrizes.multmatrize((int) '#', intArray9);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[32, 0, -1]");
    }

    @Test
    public void test1777() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1777");
        int[] intArray10 = new int[] { 0, (byte) 1, 1, (byte) 10 };
        ds.AvaliaMultMatrizes.multmatrize((-1), intArray10);
        ds.AvaliaMultMatrizes.multmatrize(0, intArray10);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) -1, intArray10);
        ds.AvaliaMultMatrizes.multmatrize(0, intArray10);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) 0, intArray10);
        ds.AvaliaMultMatrizes.multmatrize(0, intArray10);
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[0, 1, 1, 10]");
    }

    @Test
    public void test1778() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1778");
        int[] intArray10 = new int[] { ' ', (byte) 0, (byte) -1 };
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) -1, intArray10);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) 0, intArray10);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) -1, intArray10);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) 0, intArray10);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) 0, intArray10);
        ds.AvaliaMultMatrizes.multmatrize(1, intArray10);
        ds.AvaliaMultMatrizes.multmatrize(1, intArray10);
        java.lang.Class<?> wildcardClass18 = intArray10.getClass();
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[32, 0, -1]");
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test1779() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1779");
        int[] intArray10 = new int[] { 0, (byte) 1, 1, (byte) 10 };
        ds.AvaliaMultMatrizes.multmatrize((-1), intArray10);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) 1, intArray10);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) 0, intArray10);
        ds.AvaliaMultMatrizes.multmatrize(0, intArray10);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) -1, intArray10);
        // The following exception was thrown during execution in test generation
        try {
            ds.AvaliaMultMatrizes.multmatrize((int) (short) 10, intArray10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[0, 1, 1, 10]");
    }

    @Test
    public void test1780() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1780");
        int[] intArray8 = new int[] { (byte) -1 };
        ds.AvaliaMultMatrizes.multmatrize((int) (short) 1, intArray8);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) 1, intArray8);
        ds.AvaliaMultMatrizes.multmatrize(0, intArray8);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) -1, intArray8);
        ds.AvaliaMultMatrizes.multmatrize(0, intArray8);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) -1, intArray8);
        ds.AvaliaMultMatrizes.multmatrize((-1), intArray8);
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[-1]");
    }

    @Test
    public void test1781() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1781");
        int[] intArray12 = new int[] { (short) -1, (-1) };
        ds.AvaliaMultMatrizes.multmatrize((int) (short) 0, intArray12);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) -1, intArray12);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) -1, intArray12);
        ds.AvaliaMultMatrizes.multmatrize((-1), intArray12);
        ds.AvaliaMultMatrizes.multmatrize(1, intArray12);
        ds.AvaliaMultMatrizes.multmatrize((-1), intArray12);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) 1, intArray12);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) 1, intArray12);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) -1, intArray12);
        // The following exception was thrown during execution in test generation
        try {
            ds.AvaliaMultMatrizes.multmatrize((int) 'a', intArray12);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[-1, -1]");
    }

    @Test
    public void test1782() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1782");
        int[] intArray6 = new int[] { (byte) -1 };
        ds.AvaliaMultMatrizes.multmatrize((int) (short) 1, intArray6);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) 1, intArray6);
        ds.AvaliaMultMatrizes.multmatrize(0, intArray6);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) -1, intArray6);
        // The following exception was thrown during execution in test generation
        try {
            ds.AvaliaMultMatrizes.multmatrize((int) ' ', intArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[-1]");
    }

    @Test
    public void test1783() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1783");
        int[] intArray7 = new int[] { 0, (byte) 100 };
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) -1, intArray7);
        ds.AvaliaMultMatrizes.multmatrize(1, intArray7);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) 0, intArray7);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) 0, intArray7);
        // The following exception was thrown during execution in test generation
        try {
            ds.AvaliaMultMatrizes.multmatrize((int) ' ', intArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[0, 100]");
    }

    @Test
    public void test1784() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1784");
        int[] intArray10 = new int[] { ' ', (byte) 0, (byte) -1 };
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) -1, intArray10);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) 1, intArray10);
        ds.AvaliaMultMatrizes.multmatrize((-1), intArray10);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) 0, intArray10);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) 0, intArray10);
        ds.AvaliaMultMatrizes.multmatrize(0, intArray10);
        ds.AvaliaMultMatrizes.multmatrize((-1), intArray10);
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[32, 0, -1]");
    }

    @Test
    public void test1785() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1785");
        int[] intArray12 = new int[] { (short) -1, (-1) };
        ds.AvaliaMultMatrizes.multmatrize((int) (short) 0, intArray12);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) -1, intArray12);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) -1, intArray12);
        ds.AvaliaMultMatrizes.multmatrize((-1), intArray12);
        ds.AvaliaMultMatrizes.multmatrize(1, intArray12);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) 0, intArray12);
        ds.AvaliaMultMatrizes.multmatrize((-1), intArray12);
        ds.AvaliaMultMatrizes.multmatrize(0, intArray12);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) 1, intArray12);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) 1, intArray12);
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[-1, -1]");
    }

    @Test
    public void test1786() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1786");
        int[] intArray12 = new int[] { 0, (byte) 1, 1, (byte) 10 };
        ds.AvaliaMultMatrizes.multmatrize((-1), intArray12);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) 1, intArray12);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) 0, intArray12);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) -1, intArray12);
        ds.AvaliaMultMatrizes.multmatrize(1, intArray12);
        ds.AvaliaMultMatrizes.multmatrize((-1), intArray12);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) 0, intArray12);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) 1, intArray12);
        java.lang.Class<?> wildcardClass21 = intArray12.getClass();
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[0, 1, 1, 10]");
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test1787() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1787");
        int[] intArray10 = new int[] { (short) -1, (-1) };
        ds.AvaliaMultMatrizes.multmatrize((int) (short) 0, intArray10);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) -1, intArray10);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) -1, intArray10);
        ds.AvaliaMultMatrizes.multmatrize((-1), intArray10);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) 1, intArray10);
        ds.AvaliaMultMatrizes.multmatrize((-1), intArray10);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) -1, intArray10);
        // The following exception was thrown during execution in test generation
        try {
            ds.AvaliaMultMatrizes.multmatrize(10, intArray10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[-1, -1]");
    }

    @Test
    public void test1788() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1788");
        int[] intArray13 = new int[] { (short) -1, (-1) };
        ds.AvaliaMultMatrizes.multmatrize((int) (short) 0, intArray13);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) -1, intArray13);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) -1, intArray13);
        ds.AvaliaMultMatrizes.multmatrize((-1), intArray13);
        ds.AvaliaMultMatrizes.multmatrize(1, intArray13);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) 0, intArray13);
        ds.AvaliaMultMatrizes.multmatrize((-1), intArray13);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) 0, intArray13);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) 0, intArray13);
        ds.AvaliaMultMatrizes.multmatrize((-1), intArray13);
        // The following exception was thrown during execution in test generation
        try {
            ds.AvaliaMultMatrizes.multmatrize((int) ' ', intArray13);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[-1, -1]");
    }

    @Test
    public void test1789() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1789");
        int[] intArray8 = new int[] { (byte) -1 };
        ds.AvaliaMultMatrizes.multmatrize((int) (short) 1, intArray8);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) 1, intArray8);
        ds.AvaliaMultMatrizes.multmatrize(0, intArray8);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) -1, intArray8);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) 1, intArray8);
        ds.AvaliaMultMatrizes.multmatrize(0, intArray8);
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
    public void test1790() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1790");
        int[] intArray15 = new int[] { ' ', (byte) 0, (byte) -1 };
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) -1, intArray15);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) -1, intArray15);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) 0, intArray15);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) -1, intArray15);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) -1, intArray15);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) 0, intArray15);
        ds.AvaliaMultMatrizes.multmatrize(1, intArray15);
        ds.AvaliaMultMatrizes.multmatrize(1, intArray15);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) 0, intArray15);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) 1, intArray15);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) -1, intArray15);
        // The following exception was thrown during execution in test generation
        try {
            ds.AvaliaMultMatrizes.multmatrize(100, intArray15);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[32, 0, -1]");
    }

    @Test
    public void test1791() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1791");
        int[] intArray15 = new int[] { 0, (byte) 1, 1, (byte) 10 };
        ds.AvaliaMultMatrizes.multmatrize((-1), intArray15);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) 1, intArray15);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) -1, intArray15);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) 1, intArray15);
        ds.AvaliaMultMatrizes.multmatrize(0, intArray15);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) 0, intArray15);
        ds.AvaliaMultMatrizes.multmatrize((-1), intArray15);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) 0, intArray15);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) 1, intArray15);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) 0, intArray15);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) -1, intArray15);
        java.lang.Class<?> wildcardClass27 = intArray15.getClass();
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[0, 1, 1, 10]");
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test1792() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1792");
        int[] intArray10 = new int[] { (short) -1, (-1) };
        ds.AvaliaMultMatrizes.multmatrize((int) (short) 0, intArray10);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) -1, intArray10);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) -1, intArray10);
        ds.AvaliaMultMatrizes.multmatrize((-1), intArray10);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) 1, intArray10);
        ds.AvaliaMultMatrizes.multmatrize(0, intArray10);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) 0, intArray10);
        // The following exception was thrown during execution in test generation
        try {
            ds.AvaliaMultMatrizes.multmatrize((int) 'a', intArray10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[-1, -1]");
    }

    @Test
    public void test1793() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1793");
        int[] intArray8 = new int[] { (byte) 100, (-1), ' ', 10 };
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) 1, intArray8);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) 0, intArray8);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) 1, intArray8);
        ds.AvaliaMultMatrizes.multmatrize(1, intArray8);
        java.lang.Class<?> wildcardClass13 = intArray8.getClass();
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[100, -1, 32, 10]");
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test1794() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1794");
        int[] intArray10 = new int[] { (short) -1, (-1) };
        ds.AvaliaMultMatrizes.multmatrize((int) (short) 0, intArray10);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) -1, intArray10);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) -1, intArray10);
        ds.AvaliaMultMatrizes.multmatrize((-1), intArray10);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) -1, intArray10);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) 1, intArray10);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) 1, intArray10);
        // The following exception was thrown during execution in test generation
        try {
            ds.AvaliaMultMatrizes.multmatrize((int) (byte) 100, intArray10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[-1, -1]");
    }

    @Test
    public void test1795() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1795");
        int[] intArray7 = new int[] { (byte) -1, (short) 0, (byte) 100 };
        ds.AvaliaMultMatrizes.multmatrize((int) (short) 0, intArray7);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) 1, intArray7);
        ds.AvaliaMultMatrizes.multmatrize(1, intArray7);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) 1, intArray7);
        java.lang.Class<?> wildcardClass12 = intArray7.getClass();
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[-1, 0, 100]");
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test1796() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1796");
        int[] intArray9 = new int[] { (short) -1, (-1) };
        ds.AvaliaMultMatrizes.multmatrize((int) (short) 0, intArray9);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) -1, intArray9);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) 1, intArray9);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) -1, intArray9);
        ds.AvaliaMultMatrizes.multmatrize((-1), intArray9);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) -1, intArray9);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) 1, intArray9);
        java.lang.Class<?> wildcardClass17 = intArray9.getClass();
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[-1, -1]");
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test1797() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1797");
        int[] intArray8 = new int[] { ' ', (byte) 0, (byte) -1 };
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) -1, intArray8);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) 1, intArray8);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) 0, intArray8);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) 0, intArray8);
        // The following exception was thrown during execution in test generation
        try {
            ds.AvaliaMultMatrizes.multmatrize(100, intArray8);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[32, 0, -1]");
    }

    @Test
    public void test1798() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1798");
        int[] intArray9 = new int[] { (short) -1, (-1) };
        ds.AvaliaMultMatrizes.multmatrize((int) (short) 0, intArray9);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) -1, intArray9);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) -1, intArray9);
        ds.AvaliaMultMatrizes.multmatrize((-1), intArray9);
        ds.AvaliaMultMatrizes.multmatrize(1, intArray9);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) -1, intArray9);
        // The following exception was thrown during execution in test generation
        try {
            ds.AvaliaMultMatrizes.multmatrize((int) '4', intArray9);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[-1, -1]");
    }

    @Test
    public void test1799() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1799");
        int[] intArray8 = new int[] { ' ', (byte) 0, (byte) -1 };
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) -1, intArray8);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) 1, intArray8);
        ds.AvaliaMultMatrizes.multmatrize(1, intArray8);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) -1, intArray8);
        ds.AvaliaMultMatrizes.multmatrize(0, intArray8);
        java.lang.Class<?> wildcardClass14 = intArray8.getClass();
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[32, 0, -1]");
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test1800() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1800");
        int[] intArray13 = new int[] { ' ', (byte) 0, (byte) -1 };
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) -1, intArray13);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) 1, intArray13);
        ds.AvaliaMultMatrizes.multmatrize((-1), intArray13);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) 0, intArray13);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) 0, intArray13);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) 0, intArray13);
        ds.AvaliaMultMatrizes.multmatrize(1, intArray13);
        ds.AvaliaMultMatrizes.multmatrize(0, intArray13);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) -1, intArray13);
        ds.AvaliaMultMatrizes.multmatrize(1, intArray13);
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[32, 0, -1]");
    }

    @Test
    public void test1801() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1801");
        int[] intArray15 = new int[] { (short) -1, (-1) };
        ds.AvaliaMultMatrizes.multmatrize((int) (short) 0, intArray15);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) -1, intArray15);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) -1, intArray15);
        ds.AvaliaMultMatrizes.multmatrize(1, intArray15);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) 0, intArray15);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) 1, intArray15);
        ds.AvaliaMultMatrizes.multmatrize(0, intArray15);
        ds.AvaliaMultMatrizes.multmatrize(0, intArray15);
        ds.AvaliaMultMatrizes.multmatrize(0, intArray15);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) -1, intArray15);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) 1, intArray15);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) 0, intArray15);
        ds.AvaliaMultMatrizes.multmatrize(0, intArray15);
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[-1, -1]");
    }

    @Test
    public void test1802() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1802");
        int[] intArray7 = new int[] { (byte) -1 };
        ds.AvaliaMultMatrizes.multmatrize((int) (short) 1, intArray7);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) 1, intArray7);
        ds.AvaliaMultMatrizes.multmatrize(0, intArray7);
        ds.AvaliaMultMatrizes.multmatrize(0, intArray7);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) 1, intArray7);
        // The following exception was thrown during execution in test generation
        try {
            ds.AvaliaMultMatrizes.multmatrize((int) '#', intArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[-1]");
    }

    @Test
    public void test1803() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1803");
        int[] intArray10 = new int[] { 0, (byte) 100 };
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) -1, intArray10);
        ds.AvaliaMultMatrizes.multmatrize(1, intArray10);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) 0, intArray10);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) -1, intArray10);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) -1, intArray10);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) 1, intArray10);
        ds.AvaliaMultMatrizes.multmatrize(0, intArray10);
        ds.AvaliaMultMatrizes.multmatrize(0, intArray10);
        java.lang.Class<?> wildcardClass19 = intArray10.getClass();
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[0, 100]");
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test1804() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1804");
        int[] intArray12 = new int[] { (short) -1, (-1) };
        ds.AvaliaMultMatrizes.multmatrize((int) (short) 0, intArray12);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) -1, intArray12);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) -1, intArray12);
        ds.AvaliaMultMatrizes.multmatrize((-1), intArray12);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) 1, intArray12);
        ds.AvaliaMultMatrizes.multmatrize(0, intArray12);
        ds.AvaliaMultMatrizes.multmatrize(1, intArray12);
        ds.AvaliaMultMatrizes.multmatrize((-1), intArray12);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) 0, intArray12);
        // The following exception was thrown during execution in test generation
        try {
            ds.AvaliaMultMatrizes.multmatrize((int) (byte) 100, intArray12);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[-1, -1]");
    }

    @Test
    public void test1805() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1805");
        int[] intArray12 = new int[] { ' ', (byte) 0, (byte) -1 };
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) -1, intArray12);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) 1, intArray12);
        ds.AvaliaMultMatrizes.multmatrize((-1), intArray12);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) 0, intArray12);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) 0, intArray12);
        ds.AvaliaMultMatrizes.multmatrize((-1), intArray12);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) 1, intArray12);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) -1, intArray12);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) 0, intArray12);
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[32, 0, -1]");
    }

    @Test
    public void test1806() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1806");
        int[] intArray11 = new int[] { ' ', (byte) 0, (byte) -1 };
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) -1, intArray11);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) 1, intArray11);
        ds.AvaliaMultMatrizes.multmatrize((-1), intArray11);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) 0, intArray11);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) 0, intArray11);
        ds.AvaliaMultMatrizes.multmatrize((-1), intArray11);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) 1, intArray11);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) 0, intArray11);
        java.lang.Class<?> wildcardClass20 = intArray11.getClass();
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[32, 0, -1]");
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test1807() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1807");
        int[] intArray8 = new int[] { ' ', (byte) 0, (byte) -1 };
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) -1, intArray8);
        ds.AvaliaMultMatrizes.multmatrize(1, intArray8);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) 0, intArray8);
        ds.AvaliaMultMatrizes.multmatrize(0, intArray8);
        ds.AvaliaMultMatrizes.multmatrize(0, intArray8);
        java.lang.Class<?> wildcardClass14 = intArray8.getClass();
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[32, 0, -1]");
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test1808() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1808");
        int[] intArray12 = new int[] { 0, (byte) 1, 1, (byte) 10 };
        ds.AvaliaMultMatrizes.multmatrize((-1), intArray12);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) 1, intArray12);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) 0, intArray12);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) -1, intArray12);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) -1, intArray12);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) 0, intArray12);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) 1, intArray12);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) 0, intArray12);
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[0, 1, 1, 10]");
    }

    @Test
    public void test1809() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1809");
        int[] intArray7 = new int[] { ' ', (byte) 0, (byte) -1 };
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) -1, intArray7);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) 0, intArray7);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) -1, intArray7);
        ds.AvaliaMultMatrizes.multmatrize(0, intArray7);
        java.lang.Class<?> wildcardClass12 = intArray7.getClass();
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[32, 0, -1]");
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test1810() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1810");
        int[] intArray7 = new int[] { (short) -1, (-1) };
        ds.AvaliaMultMatrizes.multmatrize((int) (short) 0, intArray7);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) -1, intArray7);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) 1, intArray7);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) 1, intArray7);
        ds.AvaliaMultMatrizes.multmatrize(0, intArray7);
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[-1, -1]");
    }

    @Test
    public void test1811() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1811");
        int[] intArray11 = new int[] { 0, (byte) 1, 1, (byte) 10 };
        ds.AvaliaMultMatrizes.multmatrize((-1), intArray11);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) 1, intArray11);
        ds.AvaliaMultMatrizes.multmatrize(0, intArray11);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) 0, intArray11);
        ds.AvaliaMultMatrizes.multmatrize((-1), intArray11);
        ds.AvaliaMultMatrizes.multmatrize(1, intArray11);
        // The following exception was thrown during execution in test generation
        try {
            ds.AvaliaMultMatrizes.multmatrize(10, intArray11);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[0, 1, 1, 10]");
    }

    @Test
    public void test1812() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1812");
        int[] intArray9 = new int[] { ' ', (byte) 0, (byte) -1 };
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) -1, intArray9);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) 1, intArray9);
        ds.AvaliaMultMatrizes.multmatrize((-1), intArray9);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) 0, intArray9);
        ds.AvaliaMultMatrizes.multmatrize((-1), intArray9);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) -1, intArray9);
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[32, 0, -1]");
    }

    @Test
    public void test1813() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1813");
        int[] intArray14 = new int[] { (short) -1, (-1) };
        ds.AvaliaMultMatrizes.multmatrize((int) (short) 0, intArray14);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) -1, intArray14);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) -1, intArray14);
        ds.AvaliaMultMatrizes.multmatrize((-1), intArray14);
        ds.AvaliaMultMatrizes.multmatrize(1, intArray14);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) 0, intArray14);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) 1, intArray14);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) 1, intArray14);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) -1, intArray14);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) -1, intArray14);
        ds.AvaliaMultMatrizes.multmatrize((-1), intArray14);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) -1, intArray14);
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[-1, -1]");
    }

    @Test
    public void test1814() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1814");
        int[] intArray8 = new int[] { (short) -1, (-1) };
        ds.AvaliaMultMatrizes.multmatrize((int) (short) 0, intArray8);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) -1, intArray8);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) -1, intArray8);
        ds.AvaliaMultMatrizes.multmatrize(0, intArray8);
        ds.AvaliaMultMatrizes.multmatrize(0, intArray8);
        // The following exception was thrown during execution in test generation
        try {
            ds.AvaliaMultMatrizes.multmatrize((int) (byte) 10, intArray8);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[-1, -1]");
    }

    @Test
    public void test1815() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1815");
        int[] intArray8 = new int[] { ' ', (byte) 0, (byte) -1 };
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) -1, intArray8);
        ds.AvaliaMultMatrizes.multmatrize(1, intArray8);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) 0, intArray8);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) 1, intArray8);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) -1, intArray8);
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[32, 0, -1]");
    }

    @Test
    public void test1816() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1816");
        int[] intArray6 = new int[] { (byte) -1 };
        ds.AvaliaMultMatrizes.multmatrize((int) (short) 1, intArray6);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) 1, intArray6);
        ds.AvaliaMultMatrizes.multmatrize((-1), intArray6);
        ds.AvaliaMultMatrizes.multmatrize(0, intArray6);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) 0, intArray6);
        java.lang.Class<?> wildcardClass12 = intArray6.getClass();
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[-1]");
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test1817() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1817");
        int[] intArray11 = new int[] { ' ', (byte) 0, (byte) -1 };
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) -1, intArray11);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) 1, intArray11);
        ds.AvaliaMultMatrizes.multmatrize(1, intArray11);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) -1, intArray11);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) 1, intArray11);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) 0, intArray11);
        ds.AvaliaMultMatrizes.multmatrize(0, intArray11);
        ds.AvaliaMultMatrizes.multmatrize(1, intArray11);
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[32, 0, -1]");
    }

    @Test
    public void test1818() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1818");
        int[] intArray13 = new int[] { ' ', (byte) 0, (byte) -1 };
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) -1, intArray13);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) 1, intArray13);
        ds.AvaliaMultMatrizes.multmatrize((-1), intArray13);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) 0, intArray13);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) 0, intArray13);
        ds.AvaliaMultMatrizes.multmatrize((-1), intArray13);
        ds.AvaliaMultMatrizes.multmatrize(1, intArray13);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) -1, intArray13);
        ds.AvaliaMultMatrizes.multmatrize(1, intArray13);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) 1, intArray13);
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[32, 0, -1]");
    }

    @Test
    public void test1819() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1819");
        int[] intArray14 = new int[] { 0, (byte) 1, 1, (byte) 10 };
        ds.AvaliaMultMatrizes.multmatrize((-1), intArray14);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) 1, intArray14);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) -1, intArray14);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) 1, intArray14);
        ds.AvaliaMultMatrizes.multmatrize(0, intArray14);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) 0, intArray14);
        ds.AvaliaMultMatrizes.multmatrize((-1), intArray14);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) 0, intArray14);
        ds.AvaliaMultMatrizes.multmatrize((-1), intArray14);
        ds.AvaliaMultMatrizes.multmatrize(0, intArray14);
        java.lang.Class<?> wildcardClass25 = intArray14.getClass();
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[0, 1, 1, 10]");
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test1820() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1820");
        int[] intArray12 = new int[] { 0, (byte) 1, 1, (byte) 10 };
        ds.AvaliaMultMatrizes.multmatrize((-1), intArray12);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) 1, intArray12);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) -1, intArray12);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) 1, intArray12);
        ds.AvaliaMultMatrizes.multmatrize(0, intArray12);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) 1, intArray12);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) 0, intArray12);
        // The following exception was thrown during execution in test generation
        try {
            ds.AvaliaMultMatrizes.multmatrize((int) 'a', intArray12);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[0, 1, 1, 10]");
    }

    @Test
    public void test1821() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1821");
        int[] intArray9 = new int[] { ' ', (byte) 0, (byte) -1 };
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) -1, intArray9);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) -1, intArray9);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) 0, intArray9);
        ds.AvaliaMultMatrizes.multmatrize(1, intArray9);
        ds.AvaliaMultMatrizes.multmatrize((-1), intArray9);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) 1, intArray9);
        java.lang.Class<?> wildcardClass16 = intArray9.getClass();
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[32, 0, -1]");
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test1822() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1822");
        int[] intArray6 = new int[] { (byte) -1 };
        ds.AvaliaMultMatrizes.multmatrize((int) (short) 1, intArray6);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) 1, intArray6);
        ds.AvaliaMultMatrizes.multmatrize((-1), intArray6);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) -1, intArray6);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) -1, intArray6);
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[-1]");
    }

    @Test
    public void test1823() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1823");
        int[] intArray7 = new int[] { (byte) -1 };
        ds.AvaliaMultMatrizes.multmatrize((int) (short) 1, intArray7);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) 1, intArray7);
        ds.AvaliaMultMatrizes.multmatrize((-1), intArray7);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) 1, intArray7);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) -1, intArray7);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) 1, intArray7);
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[-1]");
    }

    @Test
    public void test1824() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1824");
        int[] intArray6 = new int[] { '4' };
        ds.AvaliaMultMatrizes.multmatrize((int) (short) -1, intArray6);
        ds.AvaliaMultMatrizes.multmatrize(1, intArray6);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) 1, intArray6);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) -1, intArray6);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) -1, intArray6);
        java.lang.Class<?> wildcardClass12 = intArray6.getClass();
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[52]");
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test1825() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1825");
        int[] intArray11 = new int[] { 0, (byte) 1, 1, (byte) 10 };
        ds.AvaliaMultMatrizes.multmatrize((-1), intArray11);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) 1, intArray11);
        ds.AvaliaMultMatrizes.multmatrize(0, intArray11);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) 0, intArray11);
        ds.AvaliaMultMatrizes.multmatrize((-1), intArray11);
        ds.AvaliaMultMatrizes.multmatrize(1, intArray11);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) 0, intArray11);
        java.lang.Class<?> wildcardClass19 = intArray11.getClass();
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[0, 1, 1, 10]");
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test1826() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1826");
        int[] intArray12 = new int[] { (short) -1, (-1) };
        ds.AvaliaMultMatrizes.multmatrize((int) (short) 0, intArray12);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) -1, intArray12);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) -1, intArray12);
        ds.AvaliaMultMatrizes.multmatrize(1, intArray12);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) 0, intArray12);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) 1, intArray12);
        ds.AvaliaMultMatrizes.multmatrize(0, intArray12);
        ds.AvaliaMultMatrizes.multmatrize((-1), intArray12);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) -1, intArray12);
        ds.AvaliaMultMatrizes.multmatrize(0, intArray12);
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[-1, -1]");
    }

    @Test
    public void test1827() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1827");
        int[] intArray12 = new int[] { (byte) 100, (-1), ' ', 10 };
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) 1, intArray12);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) 0, intArray12);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) 0, intArray12);
        ds.AvaliaMultMatrizes.multmatrize(0, intArray12);
        ds.AvaliaMultMatrizes.multmatrize(0, intArray12);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) 0, intArray12);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) -1, intArray12);
        ds.AvaliaMultMatrizes.multmatrize(0, intArray12);
        java.lang.Class<?> wildcardClass21 = intArray12.getClass();
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[100, -1, 32, 10]");
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test1828() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1828");
        int[] intArray14 = new int[] { ' ', (byte) 0, (byte) -1 };
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) -1, intArray14);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) -1, intArray14);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) 0, intArray14);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) -1, intArray14);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) -1, intArray14);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) 0, intArray14);
        ds.AvaliaMultMatrizes.multmatrize(1, intArray14);
        ds.AvaliaMultMatrizes.multmatrize(1, intArray14);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) 0, intArray14);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) 1, intArray14);
        // The following exception was thrown during execution in test generation
        try {
            ds.AvaliaMultMatrizes.multmatrize((int) 'a', intArray14);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[32, 0, -1]");
    }

    @Test
    public void test1829() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1829");
        int[] intArray13 = new int[] { (short) -1, (-1) };
        ds.AvaliaMultMatrizes.multmatrize((int) (short) 0, intArray13);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) -1, intArray13);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) -1, intArray13);
        ds.AvaliaMultMatrizes.multmatrize(1, intArray13);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) 0, intArray13);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) 1, intArray13);
        ds.AvaliaMultMatrizes.multmatrize(0, intArray13);
        ds.AvaliaMultMatrizes.multmatrize(0, intArray13);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) 1, intArray13);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) 0, intArray13);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) 1, intArray13);
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[-1, -1]");
    }

    @Test
    public void test1830() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1830");
        int[] intArray11 = new int[] { ' ', (byte) 0, (byte) -1 };
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) -1, intArray11);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) 1, intArray11);
        ds.AvaliaMultMatrizes.multmatrize((-1), intArray11);
        ds.AvaliaMultMatrizes.multmatrize(0, intArray11);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) -1, intArray11);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) 1, intArray11);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) 0, intArray11);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) 0, intArray11);
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[32, 0, -1]");
    }

    @Test
    public void test1831() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1831");
        int[] intArray8 = new int[] { 0, (byte) 1, 1, (byte) 10 };
        ds.AvaliaMultMatrizes.multmatrize((-1), intArray8);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) 1, intArray8);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) 0, intArray8);
        // The following exception was thrown during execution in test generation
        try {
            ds.AvaliaMultMatrizes.multmatrize((int) (byte) 100, intArray8);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[0, 1, 1, 10]");
    }

    @Test
    public void test1832() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1832");
        int[] intArray12 = new int[] { (short) -1, (-1) };
        ds.AvaliaMultMatrizes.multmatrize((int) (short) 0, intArray12);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) -1, intArray12);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) -1, intArray12);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) 1, intArray12);
        ds.AvaliaMultMatrizes.multmatrize(0, intArray12);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) -1, intArray12);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) -1, intArray12);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) 0, intArray12);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) 1, intArray12);
        // The following exception was thrown during execution in test generation
        try {
            ds.AvaliaMultMatrizes.multmatrize((int) (byte) 10, intArray12);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[-1, -1]");
    }

    @Test
    public void test1833() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1833");
        int[] intArray6 = new int[] { 0, (byte) 100 };
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) -1, intArray6);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) 0, intArray6);
        ds.AvaliaMultMatrizes.multmatrize(0, intArray6);
        // The following exception was thrown during execution in test generation
        try {
            ds.AvaliaMultMatrizes.multmatrize((int) (byte) 10, intArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[0, 100]");
    }

    @Test
    public void test1834() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1834");
        int[] intArray9 = new int[] { (byte) 100, (-1), ' ', 10 };
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) 1, intArray9);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) 0, intArray9);
        ds.AvaliaMultMatrizes.multmatrize(0, intArray9);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) 0, intArray9);
        // The following exception was thrown during execution in test generation
        try {
            ds.AvaliaMultMatrizes.multmatrize((int) 'a', intArray9);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[100, -1, 32, 10]");
    }

    @Test
    public void test1835() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1835");
        int[] intArray8 = new int[] { (short) -1, (-1) };
        ds.AvaliaMultMatrizes.multmatrize((int) (short) 0, intArray8);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) -1, intArray8);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) 1, intArray8);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) 1, intArray8);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) 0, intArray8);
        // The following exception was thrown during execution in test generation
        try {
            ds.AvaliaMultMatrizes.multmatrize(100, intArray8);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[-1, -1]");
    }

    @Test
    public void test1836() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1836");
        int[] intArray11 = new int[] { ' ', (byte) 0, (byte) -1 };
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) -1, intArray11);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) 1, intArray11);
        ds.AvaliaMultMatrizes.multmatrize(1, intArray11);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) -1, intArray11);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) -1, intArray11);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) 1, intArray11);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) 1, intArray11);
        // The following exception was thrown during execution in test generation
        try {
            ds.AvaliaMultMatrizes.multmatrize((int) (short) 10, intArray11);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[32, 0, -1]");
    }

    @Test
    public void test1837() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1837");
        int[] intArray6 = new int[] { (byte) -1 };
        ds.AvaliaMultMatrizes.multmatrize((int) (short) 1, intArray6);
        ds.AvaliaMultMatrizes.multmatrize(1, intArray6);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) -1, intArray6);
        ds.AvaliaMultMatrizes.multmatrize(0, intArray6);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) 0, intArray6);
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[-1]");
    }

    @Test
    public void test1838() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1838");
        int[] intArray6 = new int[] { (byte) -1 };
        ds.AvaliaMultMatrizes.multmatrize((int) (short) 1, intArray6);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) 1, intArray6);
        ds.AvaliaMultMatrizes.multmatrize(0, intArray6);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) -1, intArray6);
        ds.AvaliaMultMatrizes.multmatrize(1, intArray6);
        java.lang.Class<?> wildcardClass12 = intArray6.getClass();
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[-1]");
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test1839() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1839");
        int[] intArray9 = new int[] { (short) -1, (-1) };
        ds.AvaliaMultMatrizes.multmatrize((int) (short) 0, intArray9);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) -1, intArray9);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) -1, intArray9);
        ds.AvaliaMultMatrizes.multmatrize((-1), intArray9);
        ds.AvaliaMultMatrizes.multmatrize((-1), intArray9);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) -1, intArray9);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) 1, intArray9);
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[-1, -1]");
    }

    @Test
    public void test1840() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1840");
        int[] intArray10 = new int[] { ' ', (byte) 0, (byte) -1 };
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) -1, intArray10);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) -1, intArray10);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) 0, intArray10);
        ds.AvaliaMultMatrizes.multmatrize(1, intArray10);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) -1, intArray10);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) 1, intArray10);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) -1, intArray10);
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[32, 0, -1]");
    }

    @Test
    public void test1841() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1841");
        int[] intArray14 = new int[] { (short) -1, (-1) };
        ds.AvaliaMultMatrizes.multmatrize((int) (short) 0, intArray14);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) -1, intArray14);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) -1, intArray14);
        ds.AvaliaMultMatrizes.multmatrize((-1), intArray14);
        ds.AvaliaMultMatrizes.multmatrize(1, intArray14);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) 0, intArray14);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) 1, intArray14);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) 1, intArray14);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) -1, intArray14);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) -1, intArray14);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) -1, intArray14);
        ds.AvaliaMultMatrizes.multmatrize((-1), intArray14);
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[-1, -1]");
    }

    @Test
    public void test1842() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1842");
        int[] intArray12 = new int[] { (short) -1, (-1) };
        ds.AvaliaMultMatrizes.multmatrize((int) (short) 0, intArray12);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) -1, intArray12);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) -1, intArray12);
        ds.AvaliaMultMatrizes.multmatrize(1, intArray12);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) 0, intArray12);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) 0, intArray12);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) 0, intArray12);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) 0, intArray12);
        ds.AvaliaMultMatrizes.multmatrize(1, intArray12);
        ds.AvaliaMultMatrizes.multmatrize(0, intArray12);
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[-1, -1]");
    }

    @Test
    public void test1843() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1843");
        int[] intArray12 = new int[] { (short) -1, (-1) };
        ds.AvaliaMultMatrizes.multmatrize((int) (short) 0, intArray12);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) -1, intArray12);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) -1, intArray12);
        ds.AvaliaMultMatrizes.multmatrize(1, intArray12);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) 0, intArray12);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) 1, intArray12);
        ds.AvaliaMultMatrizes.multmatrize(0, intArray12);
        ds.AvaliaMultMatrizes.multmatrize((-1), intArray12);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) -1, intArray12);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) -1, intArray12);
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[-1, -1]");
    }

    @Test
    public void test1844() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1844");
        int[] intArray11 = new int[] { (short) -1, (-1) };
        ds.AvaliaMultMatrizes.multmatrize((int) (short) 0, intArray11);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) -1, intArray11);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) -1, intArray11);
        ds.AvaliaMultMatrizes.multmatrize((-1), intArray11);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) 1, intArray11);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) 1, intArray11);
        ds.AvaliaMultMatrizes.multmatrize(0, intArray11);
        ds.AvaliaMultMatrizes.multmatrize(0, intArray11);
        // The following exception was thrown during execution in test generation
        try {
            ds.AvaliaMultMatrizes.multmatrize(100, intArray11);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[-1, -1]");
    }

    @Test
    public void test1845() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1845");
        int[] intArray14 = new int[] { (short) -1, (-1) };
        ds.AvaliaMultMatrizes.multmatrize((int) (short) 0, intArray14);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) -1, intArray14);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) -1, intArray14);
        ds.AvaliaMultMatrizes.multmatrize((-1), intArray14);
        ds.AvaliaMultMatrizes.multmatrize(1, intArray14);
        ds.AvaliaMultMatrizes.multmatrize((-1), intArray14);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) 1, intArray14);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) 1, intArray14);
        ds.AvaliaMultMatrizes.multmatrize(0, intArray14);
        ds.AvaliaMultMatrizes.multmatrize((-1), intArray14);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) -1, intArray14);
        // The following exception was thrown during execution in test generation
        try {
            ds.AvaliaMultMatrizes.multmatrize((int) '#', intArray14);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[-1, -1]");
    }

    @Test
    public void test1846() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1846");
        int[] intArray9 = new int[] { (short) -1, (-1) };
        ds.AvaliaMultMatrizes.multmatrize((int) (short) 0, intArray9);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) -1, intArray9);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) -1, intArray9);
        ds.AvaliaMultMatrizes.multmatrize(1, intArray9);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) 0, intArray9);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) -1, intArray9);
        // The following exception was thrown during execution in test generation
        try {
            ds.AvaliaMultMatrizes.multmatrize(10, intArray9);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[-1, -1]");
    }

    @Test
    public void test1847() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1847");
        int[] intArray7 = new int[] { (byte) -1 };
        ds.AvaliaMultMatrizes.multmatrize((int) (short) 1, intArray7);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) 1, intArray7);
        ds.AvaliaMultMatrizes.multmatrize(0, intArray7);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) -1, intArray7);
        ds.AvaliaMultMatrizes.multmatrize(0, intArray7);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) -1, intArray7);
        java.lang.Class<?> wildcardClass14 = intArray7.getClass();
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[-1]");
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test1848() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1848");
        int[] intArray15 = new int[] { (short) -1, (-1) };
        ds.AvaliaMultMatrizes.multmatrize((int) (short) 0, intArray15);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) -1, intArray15);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) -1, intArray15);
        ds.AvaliaMultMatrizes.multmatrize(1, intArray15);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) 0, intArray15);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) 1, intArray15);
        ds.AvaliaMultMatrizes.multmatrize(0, intArray15);
        ds.AvaliaMultMatrizes.multmatrize(0, intArray15);
        ds.AvaliaMultMatrizes.multmatrize(0, intArray15);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) -1, intArray15);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) 1, intArray15);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) 0, intArray15);
        ds.AvaliaMultMatrizes.multmatrize((-1), intArray15);
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[-1, -1]");
    }

    @Test
    public void test1849() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1849");
        int[] intArray11 = new int[] { 0, (byte) 1, 1, (byte) 10 };
        ds.AvaliaMultMatrizes.multmatrize((-1), intArray11);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) 1, intArray11);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) -1, intArray11);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) 1, intArray11);
        ds.AvaliaMultMatrizes.multmatrize(0, intArray11);
        ds.AvaliaMultMatrizes.multmatrize(1, intArray11);
        // The following exception was thrown during execution in test generation
        try {
            ds.AvaliaMultMatrizes.multmatrize((int) (short) 10, intArray11);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[0, 1, 1, 10]");
    }

    @Test
    public void test1850() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1850");
        int[] intArray7 = new int[] { '4', 100, 0, (byte) 10, 0 };
        ds.AvaliaMultMatrizes.multmatrize(0, intArray7);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) 0, intArray7);
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[52, 100, 0, 10, 0]");
    }

    @Test
    public void test1851() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1851");
        int[] intArray14 = new int[] { 0, (byte) 1, 1, (byte) 10 };
        ds.AvaliaMultMatrizes.multmatrize((-1), intArray14);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) 1, intArray14);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) -1, intArray14);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) 1, intArray14);
        ds.AvaliaMultMatrizes.multmatrize(0, intArray14);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) 0, intArray14);
        ds.AvaliaMultMatrizes.multmatrize((-1), intArray14);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) 0, intArray14);
        ds.AvaliaMultMatrizes.multmatrize(0, intArray14);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) -1, intArray14);
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[0, 1, 1, 10]");
    }

    @Test
    public void test1852() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1852");
        int[] intArray9 = new int[] { ' ', (byte) 0, (byte) -1 };
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) -1, intArray9);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) -1, intArray9);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) 0, intArray9);
        ds.AvaliaMultMatrizes.multmatrize(1, intArray9);
        ds.AvaliaMultMatrizes.multmatrize((-1), intArray9);
        // The following exception was thrown during execution in test generation
        try {
            ds.AvaliaMultMatrizes.multmatrize(10, intArray9);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[32, 0, -1]");
    }

    @Test
    public void test1853() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1853");
        int[] intArray14 = new int[] { ' ', (byte) 0, (byte) -1 };
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) -1, intArray14);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) 1, intArray14);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) 0, intArray14);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) 0, intArray14);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) -1, intArray14);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) 1, intArray14);
        ds.AvaliaMultMatrizes.multmatrize(0, intArray14);
        ds.AvaliaMultMatrizes.multmatrize(0, intArray14);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) 1, intArray14);
        ds.AvaliaMultMatrizes.multmatrize(0, intArray14);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) 1, intArray14);
        java.lang.Class<?> wildcardClass26 = intArray14.getClass();
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[32, 0, -1]");
        org.junit.Assert.assertNotNull(wildcardClass26);
    }

    @Test
    public void test1854() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1854");
        int[] intArray10 = new int[] { (byte) -1 };
        ds.AvaliaMultMatrizes.multmatrize((int) (short) 1, intArray10);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) 1, intArray10);
        ds.AvaliaMultMatrizes.multmatrize(0, intArray10);
        ds.AvaliaMultMatrizes.multmatrize(0, intArray10);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) 0, intArray10);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) 0, intArray10);
        ds.AvaliaMultMatrizes.multmatrize(0, intArray10);
        ds.AvaliaMultMatrizes.multmatrize((-1), intArray10);
        ds.AvaliaMultMatrizes.multmatrize((-1), intArray10);
        java.lang.Class<?> wildcardClass20 = intArray10.getClass();
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[-1]");
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test1855() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1855");
        int[] intArray7 = new int[] { (short) -1, (-1) };
        ds.AvaliaMultMatrizes.multmatrize((int) (short) 0, intArray7);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) -1, intArray7);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) 0, intArray7);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) 1, intArray7);
        // The following exception was thrown during execution in test generation
        try {
            ds.AvaliaMultMatrizes.multmatrize((int) '4', intArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[-1, -1]");
    }

    @Test
    public void test1856() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1856");
        int[] intArray5 = new int[] { '4' };
        ds.AvaliaMultMatrizes.multmatrize((int) (short) -1, intArray5);
        ds.AvaliaMultMatrizes.multmatrize(0, intArray5);
        ds.AvaliaMultMatrizes.multmatrize(1, intArray5);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) 0, intArray5);
        java.lang.Class<?> wildcardClass10 = intArray5.getClass();
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[52]");
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test1857() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1857");
        int[] intArray10 = new int[] { ' ', (byte) 0, (byte) -1 };
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) -1, intArray10);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) 1, intArray10);
        ds.AvaliaMultMatrizes.multmatrize((-1), intArray10);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) 0, intArray10);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) -1, intArray10);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) -1, intArray10);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) -1, intArray10);
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[32, 0, -1]");
    }

    @Test
    public void test1858() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1858");
        int[] intArray9 = new int[] { 0, (byte) 1, 1, (byte) 10 };
        ds.AvaliaMultMatrizes.multmatrize((-1), intArray9);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) 1, intArray9);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) -1, intArray9);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) 1, intArray9);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) 0, intArray9);
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[0, 1, 1, 10]");
    }

    @Test
    public void test1859() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1859");
        int[] intArray12 = new int[] { (short) -1, (-1) };
        ds.AvaliaMultMatrizes.multmatrize((int) (short) 0, intArray12);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) -1, intArray12);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) -1, intArray12);
        ds.AvaliaMultMatrizes.multmatrize((-1), intArray12);
        ds.AvaliaMultMatrizes.multmatrize(1, intArray12);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) 0, intArray12);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) 1, intArray12);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) 1, intArray12);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) -1, intArray12);
        // The following exception was thrown during execution in test generation
        try {
            ds.AvaliaMultMatrizes.multmatrize((int) ' ', intArray12);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[-1, -1]");
    }

    @Test
    public void test1860() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1860");
        int[] intArray6 = new int[] { (byte) -1, (short) 0, (byte) 100 };
        ds.AvaliaMultMatrizes.multmatrize((int) (short) 0, intArray6);
        ds.AvaliaMultMatrizes.multmatrize(0, intArray6);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) 0, intArray6);
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[-1, 0, 100]");
    }

    @Test
    public void test1861() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1861");
        int[] intArray12 = new int[] { 0, (byte) 1, 1, (byte) 10 };
        ds.AvaliaMultMatrizes.multmatrize((-1), intArray12);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) 1, intArray12);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) -1, intArray12);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) 1, intArray12);
        ds.AvaliaMultMatrizes.multmatrize(0, intArray12);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) 0, intArray12);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) 0, intArray12);
        // The following exception was thrown during execution in test generation
        try {
            ds.AvaliaMultMatrizes.multmatrize((int) 'a', intArray12);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[0, 1, 1, 10]");
    }

    @Test
    public void test1862() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1862");
        int[] intArray13 = new int[] { (short) -1, (-1) };
        ds.AvaliaMultMatrizes.multmatrize((int) (short) 0, intArray13);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) -1, intArray13);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) -1, intArray13);
        ds.AvaliaMultMatrizes.multmatrize(1, intArray13);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) 0, intArray13);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) 1, intArray13);
        ds.AvaliaMultMatrizes.multmatrize(0, intArray13);
        ds.AvaliaMultMatrizes.multmatrize((-1), intArray13);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) -1, intArray13);
        ds.AvaliaMultMatrizes.multmatrize((-1), intArray13);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) 0, intArray13);
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[-1, -1]");
    }

    @Test
    public void test1863() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1863");
        int[] intArray9 = new int[] { (short) -1, (-1) };
        ds.AvaliaMultMatrizes.multmatrize((int) (short) 0, intArray9);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) -1, intArray9);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) -1, intArray9);
        ds.AvaliaMultMatrizes.multmatrize((-1), intArray9);
        ds.AvaliaMultMatrizes.multmatrize((-1), intArray9);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) -1, intArray9);
        // The following exception was thrown during execution in test generation
        try {
            ds.AvaliaMultMatrizes.multmatrize(100, intArray9);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[-1, -1]");
    }

    @Test
    public void test1864() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1864");
        int[] intArray11 = new int[] { ' ', (byte) 0, (byte) -1 };
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) -1, intArray11);
        ds.AvaliaMultMatrizes.multmatrize(1, intArray11);
        ds.AvaliaMultMatrizes.multmatrize(1, intArray11);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) 0, intArray11);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) -1, intArray11);
        ds.AvaliaMultMatrizes.multmatrize(0, intArray11);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) -1, intArray11);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) 0, intArray11);
        java.lang.Class<?> wildcardClass20 = intArray11.getClass();
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[32, 0, -1]");
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test1865() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1865");
        int[] intArray9 = new int[] { (short) -1, (-1) };
        ds.AvaliaMultMatrizes.multmatrize((int) (short) 0, intArray9);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) -1, intArray9);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) -1, intArray9);
        ds.AvaliaMultMatrizes.multmatrize((-1), intArray9);
        ds.AvaliaMultMatrizes.multmatrize(1, intArray9);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) -1, intArray9);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) 0, intArray9);
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[-1, -1]");
    }

    @Test
    public void test1866() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1866");
        int[] intArray12 = new int[] { ' ', (byte) 0, (byte) -1 };
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) -1, intArray12);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) 1, intArray12);
        ds.AvaliaMultMatrizes.multmatrize((-1), intArray12);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) 0, intArray12);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) 0, intArray12);
        ds.AvaliaMultMatrizes.multmatrize((-1), intArray12);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) 1, intArray12);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) -1, intArray12);
        ds.AvaliaMultMatrizes.multmatrize(0, intArray12);
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[32, 0, -1]");
    }

    @Test
    public void test1867() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1867");
        int[] intArray12 = new int[] { 0, (byte) 1, 1, (byte) 10 };
        ds.AvaliaMultMatrizes.multmatrize((-1), intArray12);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) 1, intArray12);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) 0, intArray12);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) -1, intArray12);
        ds.AvaliaMultMatrizes.multmatrize(1, intArray12);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) -1, intArray12);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) 0, intArray12);
        // The following exception was thrown during execution in test generation
        try {
            ds.AvaliaMultMatrizes.multmatrize((int) (short) 10, intArray12);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[0, 1, 1, 10]");
    }

    @Test
    public void test1868() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1868");
        int[] intArray11 = new int[] { (short) -1, (-1) };
        ds.AvaliaMultMatrizes.multmatrize((int) (short) 0, intArray11);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) -1, intArray11);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) -1, intArray11);
        ds.AvaliaMultMatrizes.multmatrize((-1), intArray11);
        ds.AvaliaMultMatrizes.multmatrize(1, intArray11);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) 0, intArray11);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) -1, intArray11);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) 1, intArray11);
        ds.AvaliaMultMatrizes.multmatrize((-1), intArray11);
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[-1, -1]");
    }

    @Test
    public void test1869() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1869");
        int[] intArray9 = new int[] { (short) -1, (-1) };
        ds.AvaliaMultMatrizes.multmatrize((int) (short) 0, intArray9);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) -1, intArray9);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) -1, intArray9);
        ds.AvaliaMultMatrizes.multmatrize((-1), intArray9);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) -1, intArray9);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) 1, intArray9);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) 1, intArray9);
        java.lang.Class<?> wildcardClass17 = intArray9.getClass();
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[-1, -1]");
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test1870() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1870");
        int[] intArray11 = new int[] { (short) -1, (-1) };
        ds.AvaliaMultMatrizes.multmatrize((int) (short) 0, intArray11);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) -1, intArray11);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) -1, intArray11);
        ds.AvaliaMultMatrizes.multmatrize((-1), intArray11);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) 1, intArray11);
        ds.AvaliaMultMatrizes.multmatrize(0, intArray11);
        ds.AvaliaMultMatrizes.multmatrize(1, intArray11);
        ds.AvaliaMultMatrizes.multmatrize((-1), intArray11);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) 0, intArray11);
        java.lang.Class<?> wildcardClass21 = intArray11.getClass();
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[-1, -1]");
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test1871() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1871");
        int[] intArray10 = new int[] { (byte) -1 };
        ds.AvaliaMultMatrizes.multmatrize((int) (short) 1, intArray10);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) 1, intArray10);
        ds.AvaliaMultMatrizes.multmatrize(0, intArray10);
        ds.AvaliaMultMatrizes.multmatrize(0, intArray10);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) -1, intArray10);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) -1, intArray10);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) 0, intArray10);
        ds.AvaliaMultMatrizes.multmatrize((-1), intArray10);
        ds.AvaliaMultMatrizes.multmatrize(0, intArray10);
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[-1]");
    }

    @Test
    public void test1872() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1872");
        int[] intArray11 = new int[] { 0, (byte) 1, 1, (byte) 10 };
        ds.AvaliaMultMatrizes.multmatrize((-1), intArray11);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) 1, intArray11);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) 0, intArray11);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) -1, intArray11);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) -1, intArray11);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) 0, intArray11);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) -1, intArray11);
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[0, 1, 1, 10]");
    }

    @Test
    public void test1873() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1873");
        int[] intArray11 = new int[] { ' ', (byte) 0, (byte) -1 };
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) -1, intArray11);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) 1, intArray11);
        ds.AvaliaMultMatrizes.multmatrize((-1), intArray11);
        ds.AvaliaMultMatrizes.multmatrize(0, intArray11);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) -1, intArray11);
        ds.AvaliaMultMatrizes.multmatrize((-1), intArray11);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) 1, intArray11);
        // The following exception was thrown during execution in test generation
        try {
            ds.AvaliaMultMatrizes.multmatrize(100, intArray11);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[32, 0, -1]");
    }

    @Test
    public void test1874() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1874");
        int[] intArray10 = new int[] { ' ', (byte) 0, (byte) -1 };
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) -1, intArray10);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) 1, intArray10);
        ds.AvaliaMultMatrizes.multmatrize(1, intArray10);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) -1, intArray10);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) -1, intArray10);
        ds.AvaliaMultMatrizes.multmatrize(1, intArray10);
        ds.AvaliaMultMatrizes.multmatrize(0, intArray10);
        java.lang.Class<?> wildcardClass18 = intArray10.getClass();
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[32, 0, -1]");
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test1875() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1875");
        int[] intArray12 = new int[] { 0, (byte) 1, 1, (byte) 10 };
        ds.AvaliaMultMatrizes.multmatrize((-1), intArray12);
        ds.AvaliaMultMatrizes.multmatrize(0, intArray12);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) -1, intArray12);
        ds.AvaliaMultMatrizes.multmatrize(0, intArray12);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) 0, intArray12);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) 0, intArray12);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) -1, intArray12);
        ds.AvaliaMultMatrizes.multmatrize(0, intArray12);
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[0, 1, 1, 10]");
    }

    @Test
    public void test1876() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1876");
        int[] intArray10 = new int[] { ' ', (byte) 0, (byte) -1 };
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) -1, intArray10);
        ds.AvaliaMultMatrizes.multmatrize(1, intArray10);
        ds.AvaliaMultMatrizes.multmatrize(1, intArray10);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) 0, intArray10);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) -1, intArray10);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) 0, intArray10);
        // The following exception was thrown during execution in test generation
        try {
            ds.AvaliaMultMatrizes.multmatrize((int) '#', intArray10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[32, 0, -1]");
    }

    @Test
    public void test1877() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1877");
        int[] intArray10 = new int[] { 0, (byte) 1, 1, (byte) 10 };
        ds.AvaliaMultMatrizes.multmatrize((-1), intArray10);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) 1, intArray10);
        ds.AvaliaMultMatrizes.multmatrize(0, intArray10);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) 0, intArray10);
        ds.AvaliaMultMatrizes.multmatrize((-1), intArray10);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) 0, intArray10);
        java.lang.Class<?> wildcardClass17 = intArray10.getClass();
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[0, 1, 1, 10]");
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test1878() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1878");
        int[] intArray10 = new int[] { (short) -1, (-1) };
        ds.AvaliaMultMatrizes.multmatrize((int) (short) 0, intArray10);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) -1, intArray10);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) -1, intArray10);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) -1, intArray10);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) 1, intArray10);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) -1, intArray10);
        ds.AvaliaMultMatrizes.multmatrize(0, intArray10);
        ds.AvaliaMultMatrizes.multmatrize(0, intArray10);
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[-1, -1]");
    }

    @Test
    public void test1879() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1879");
        int[] intArray8 = new int[] { 0, (byte) 100 };
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) -1, intArray8);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) 0, intArray8);
        ds.AvaliaMultMatrizes.multmatrize(1, intArray8);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) 0, intArray8);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) -1, intArray8);
        // The following exception was thrown during execution in test generation
        try {
            ds.AvaliaMultMatrizes.multmatrize((int) ' ', intArray8);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[0, 100]");
    }

    @Test
    public void test1880() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1880");
        int[] intArray10 = new int[] { 0, (byte) 1, 1, (byte) 10 };
        ds.AvaliaMultMatrizes.multmatrize((-1), intArray10);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) 1, intArray10);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) 0, intArray10);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) -1, intArray10);
        ds.AvaliaMultMatrizes.multmatrize((-1), intArray10);
        // The following exception was thrown during execution in test generation
        try {
            ds.AvaliaMultMatrizes.multmatrize(10, intArray10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[0, 1, 1, 10]");
    }

    @Test
    public void test1881() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1881");
        int[] intArray11 = new int[] { 0, (byte) 1, 1, (byte) 10 };
        ds.AvaliaMultMatrizes.multmatrize((-1), intArray11);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) 1, intArray11);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) 0, intArray11);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) -1, intArray11);
        ds.AvaliaMultMatrizes.multmatrize(0, intArray11);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) 1, intArray11);
        // The following exception was thrown during execution in test generation
        try {
            ds.AvaliaMultMatrizes.multmatrize((int) (short) 10, intArray11);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[0, 1, 1, 10]");
    }

    @Test
    public void test1882() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1882");
        int[] intArray7 = new int[] { 0, (byte) 1, 1, (byte) 10 };
        ds.AvaliaMultMatrizes.multmatrize((-1), intArray7);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) -1, intArray7);
        // The following exception was thrown during execution in test generation
        try {
            ds.AvaliaMultMatrizes.multmatrize((int) 'a', intArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[0, 1, 1, 10]");
    }

    @Test
    public void test1883() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1883");
        int[] intArray9 = new int[] { (short) -1, (-1) };
        ds.AvaliaMultMatrizes.multmatrize((int) (short) 0, intArray9);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) -1, intArray9);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) 1, intArray9);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) -1, intArray9);
        ds.AvaliaMultMatrizes.multmatrize((-1), intArray9);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) -1, intArray9);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) -1, intArray9);
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[-1, -1]");
    }

    @Test
    public void test1884() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1884");
        int[] intArray8 = new int[] { 0, (byte) 1, 1, (byte) 10 };
        ds.AvaliaMultMatrizes.multmatrize((-1), intArray8);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) 1, intArray8);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) 0, intArray8);
        ds.AvaliaMultMatrizes.multmatrize(1, intArray8);
        java.lang.Class<?> wildcardClass13 = intArray8.getClass();
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[0, 1, 1, 10]");
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test1885() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1885");
        int[] intArray10 = new int[] { ' ', (byte) 0, (byte) -1 };
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) -1, intArray10);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) 1, intArray10);
        ds.AvaliaMultMatrizes.multmatrize((-1), intArray10);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) 0, intArray10);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) 0, intArray10);
        ds.AvaliaMultMatrizes.multmatrize(0, intArray10);
        // The following exception was thrown during execution in test generation
        try {
            ds.AvaliaMultMatrizes.multmatrize(100, intArray10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[32, 0, -1]");
    }

    @Test
    public void test1886() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1886");
        int[] intArray10 = new int[] { (byte) -1 };
        ds.AvaliaMultMatrizes.multmatrize((int) (short) 1, intArray10);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) 1, intArray10);
        ds.AvaliaMultMatrizes.multmatrize(0, intArray10);
        ds.AvaliaMultMatrizes.multmatrize(0, intArray10);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) -1, intArray10);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) -1, intArray10);
        ds.AvaliaMultMatrizes.multmatrize(0, intArray10);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) -1, intArray10);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) 1, intArray10);
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[-1]");
    }

    @Test
    public void test1887() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1887");
        int[] intArray13 = new int[] { (short) -1, (-1) };
        ds.AvaliaMultMatrizes.multmatrize((int) (short) 0, intArray13);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) -1, intArray13);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) -1, intArray13);
        ds.AvaliaMultMatrizes.multmatrize((-1), intArray13);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) 1, intArray13);
        ds.AvaliaMultMatrizes.multmatrize(0, intArray13);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) 1, intArray13);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) 0, intArray13);
        ds.AvaliaMultMatrizes.multmatrize(1, intArray13);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) -1, intArray13);
        ds.AvaliaMultMatrizes.multmatrize(0, intArray13);
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[-1, -1]");
    }

    @Test
    public void test1888() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1888");
        int[] intArray12 = new int[] { ' ', (byte) 0, (byte) -1 };
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) -1, intArray12);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) -1, intArray12);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) 0, intArray12);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) -1, intArray12);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) -1, intArray12);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) 0, intArray12);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) 0, intArray12);
        ds.AvaliaMultMatrizes.multmatrize(0, intArray12);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) 0, intArray12);
        java.lang.Class<?> wildcardClass22 = intArray12.getClass();
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[32, 0, -1]");
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test1889() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1889");
        int[] intArray11 = new int[] { (short) -1, (-1) };
        ds.AvaliaMultMatrizes.multmatrize((int) (short) 0, intArray11);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) -1, intArray11);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) -1, intArray11);
        ds.AvaliaMultMatrizes.multmatrize(1, intArray11);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) 0, intArray11);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) 1, intArray11);
        ds.AvaliaMultMatrizes.multmatrize(0, intArray11);
        ds.AvaliaMultMatrizes.multmatrize((-1), intArray11);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) 0, intArray11);
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[-1, -1]");
    }

    @Test
    public void test1890() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1890");
        int[] intArray5 = new int[] { '4' };
        ds.AvaliaMultMatrizes.multmatrize((int) (short) -1, intArray5);
        ds.AvaliaMultMatrizes.multmatrize(1, intArray5);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) 1, intArray5);
        // The following exception was thrown during execution in test generation
        try {
            ds.AvaliaMultMatrizes.multmatrize(10, intArray5);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[52]");
    }

    @Test
    public void test1891() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1891");
        int[] intArray12 = new int[] { ' ', (byte) 0, (byte) -1 };
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) -1, intArray12);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) 1, intArray12);
        ds.AvaliaMultMatrizes.multmatrize(1, intArray12);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) -1, intArray12);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) -1, intArray12);
        ds.AvaliaMultMatrizes.multmatrize(0, intArray12);
        ds.AvaliaMultMatrizes.multmatrize(0, intArray12);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) 0, intArray12);
        // The following exception was thrown during execution in test generation
        try {
            ds.AvaliaMultMatrizes.multmatrize((int) '4', intArray12);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[32, 0, -1]");
    }

    @Test
    public void test1892() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1892");
        int[] intArray10 = new int[] { 0, (byte) 1, 1, (byte) 10 };
        ds.AvaliaMultMatrizes.multmatrize((-1), intArray10);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) 1, intArray10);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) -1, intArray10);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) 0, intArray10);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) 0, intArray10);
        // The following exception was thrown during execution in test generation
        try {
            ds.AvaliaMultMatrizes.multmatrize((int) (short) 100, intArray10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[0, 1, 1, 10]");
    }

    @Test
    public void test1893() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1893");
        int[] intArray9 = new int[] { (short) -1, (-1) };
        ds.AvaliaMultMatrizes.multmatrize((int) (short) 0, intArray9);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) -1, intArray9);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) -1, intArray9);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) 1, intArray9);
        ds.AvaliaMultMatrizes.multmatrize(0, intArray9);
        ds.AvaliaMultMatrizes.multmatrize(1, intArray9);
        // The following exception was thrown during execution in test generation
        try {
            ds.AvaliaMultMatrizes.multmatrize((int) (short) 10, intArray9);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[-1, -1]");
    }

    @Test
    public void test1894() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1894");
        int[] intArray13 = new int[] { 0, (byte) 1, 1, (byte) 10 };
        ds.AvaliaMultMatrizes.multmatrize((-1), intArray13);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) 1, intArray13);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) 0, intArray13);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) -1, intArray13);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) -1, intArray13);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) 0, intArray13);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) 0, intArray13);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) -1, intArray13);
        // The following exception was thrown during execution in test generation
        try {
            ds.AvaliaMultMatrizes.multmatrize((int) (byte) 100, intArray13);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[0, 1, 1, 10]");
    }

    @Test
    public void test1895() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1895");
        int[] intArray13 = new int[] { (short) -1, (-1) };
        ds.AvaliaMultMatrizes.multmatrize((int) (short) 0, intArray13);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) -1, intArray13);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) -1, intArray13);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) 1, intArray13);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) -1, intArray13);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) 0, intArray13);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) 0, intArray13);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) -1, intArray13);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) -1, intArray13);
        ds.AvaliaMultMatrizes.multmatrize(1, intArray13);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) -1, intArray13);
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[-1, -1]");
    }

    @Test
    public void test1896() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1896");
        int[] intArray14 = new int[] { 0, (byte) 1, 1, (byte) 10 };
        ds.AvaliaMultMatrizes.multmatrize((-1), intArray14);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) 1, intArray14);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) -1, intArray14);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) 1, intArray14);
        ds.AvaliaMultMatrizes.multmatrize(0, intArray14);
        ds.AvaliaMultMatrizes.multmatrize(1, intArray14);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) 1, intArray14);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) 0, intArray14);
        ds.AvaliaMultMatrizes.multmatrize((-1), intArray14);
        // The following exception was thrown during execution in test generation
        try {
            ds.AvaliaMultMatrizes.multmatrize((int) '4', intArray14);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[0, 1, 1, 10]");
    }

    @Test
    public void test1897() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1897");
        int[] intArray14 = new int[] { 0, (byte) 1, 1, (byte) 10 };
        ds.AvaliaMultMatrizes.multmatrize((-1), intArray14);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) 1, intArray14);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) -1, intArray14);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) 1, intArray14);
        ds.AvaliaMultMatrizes.multmatrize(0, intArray14);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) 0, intArray14);
        ds.AvaliaMultMatrizes.multmatrize((-1), intArray14);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) 0, intArray14);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) 1, intArray14);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) 0, intArray14);
        java.lang.Class<?> wildcardClass25 = intArray14.getClass();
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[0, 1, 1, 10]");
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test1898() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1898");
        int[] intArray8 = new int[] { 0, (byte) 100 };
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) -1, intArray8);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) 0, intArray8);
        ds.AvaliaMultMatrizes.multmatrize(1, intArray8);
        ds.AvaliaMultMatrizes.multmatrize(0, intArray8);
        ds.AvaliaMultMatrizes.multmatrize((-1), intArray8);
        // The following exception was thrown during execution in test generation
        try {
            ds.AvaliaMultMatrizes.multmatrize((int) '4', intArray8);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[0, 100]");
    }

    @Test
    public void test1899() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop3.test1899");
        int[] intArray13 = new int[] { (short) -1, (-1) };
        ds.AvaliaMultMatrizes.multmatrize((int) (short) 0, intArray13);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) -1, intArray13);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) -1, intArray13);
        ds.AvaliaMultMatrizes.multmatrize(1, intArray13);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) 0, intArray13);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) 1, intArray13);
        ds.AvaliaMultMatrizes.multmatrize(0, intArray13);
        ds.AvaliaMultMatrizes.multmatrize(0, intArray13);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) -1, intArray13);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) -1, intArray13);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) 0, intArray13);
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[-1, -1]");
    }
}

