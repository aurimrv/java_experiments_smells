package ds.seed5838;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class Randoop4 {

    public static boolean debug = false;

    @Test
    public void test2001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2001");
        int[] intArray16 = new int[] { 100, (byte) 100 };
        ds.AvaliaMultMatrizes.multmatrize((-1), intArray16);
        ds.AvaliaMultMatrizes.multmatrize(1, intArray16);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) 1, intArray16);
        ds.AvaliaMultMatrizes.multmatrize(0, intArray16);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) -1, intArray16);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) 0, intArray16);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) -1, intArray16);
        ds.AvaliaMultMatrizes.multmatrize(0, intArray16);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) 0, intArray16);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) 1, intArray16);
        ds.AvaliaMultMatrizes.multmatrize(1, intArray16);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) 0, intArray16);
        ds.AvaliaMultMatrizes.multmatrize(1, intArray16);
        // The following exception was thrown during execution in test generation
        try {
            ds.AvaliaMultMatrizes.multmatrize((int) '4', intArray16);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray16), "[100, 100]");
    }

    @Test
    public void test2002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2002");
        int[] intArray8 = new int[] { 100, (byte) 100 };
        ds.AvaliaMultMatrizes.multmatrize((-1), intArray8);
        ds.AvaliaMultMatrizes.multmatrize(1, intArray8);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) 1, intArray8);
        ds.AvaliaMultMatrizes.multmatrize(0, intArray8);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) 1, intArray8);
        // The following exception was thrown during execution in test generation
        try {
            ds.AvaliaMultMatrizes.multmatrize((int) 'a', intArray8);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[100, 100]");
    }

    @Test
    public void test2003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2003");
        int[] intArray14 = new int[] { 100, (byte) 100 };
        ds.AvaliaMultMatrizes.multmatrize((-1), intArray14);
        ds.AvaliaMultMatrizes.multmatrize(1, intArray14);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) 1, intArray14);
        ds.AvaliaMultMatrizes.multmatrize(0, intArray14);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) -1, intArray14);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) 0, intArray14);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) -1, intArray14);
        ds.AvaliaMultMatrizes.multmatrize(0, intArray14);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) -1, intArray14);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) 1, intArray14);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) 1, intArray14);
        ds.AvaliaMultMatrizes.multmatrize(0, intArray14);
        java.lang.Class<?> wildcardClass27 = intArray14.getClass();
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[100, 100]");
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test2004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2004");
        int[] intArray7 = new int[] { 100, (byte) 100 };
        ds.AvaliaMultMatrizes.multmatrize((-1), intArray7);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) -1, intArray7);
        ds.AvaliaMultMatrizes.multmatrize(0, intArray7);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) 1, intArray7);
        // The following exception was thrown during execution in test generation
        try {
            ds.AvaliaMultMatrizes.multmatrize(100, intArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[100, 100]");
    }

    @Test
    public void test2005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2005");
        int[] intArray11 = new int[] { 100, (byte) 100 };
        ds.AvaliaMultMatrizes.multmatrize((-1), intArray11);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) -1, intArray11);
        ds.AvaliaMultMatrizes.multmatrize((-1), intArray11);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) -1, intArray11);
        ds.AvaliaMultMatrizes.multmatrize(0, intArray11);
        ds.AvaliaMultMatrizes.multmatrize(1, intArray11);
        ds.AvaliaMultMatrizes.multmatrize(1, intArray11);
        ds.AvaliaMultMatrizes.multmatrize(0, intArray11);
        ds.AvaliaMultMatrizes.multmatrize((-1), intArray11);
        java.lang.Class<?> wildcardClass21 = intArray11.getClass();
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[100, 100]");
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test2006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2006");
        int[] intArray19 = new int[] { (short) 0, ' ' };
        ds.AvaliaMultMatrizes.multmatrize(0, intArray19);
        ds.AvaliaMultMatrizes.multmatrize(0, intArray19);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) 0, intArray19);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) -1, intArray19);
        ds.AvaliaMultMatrizes.multmatrize(0, intArray19);
        ds.AvaliaMultMatrizes.multmatrize((-1), intArray19);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) 1, intArray19);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) 1, intArray19);
        ds.AvaliaMultMatrizes.multmatrize(0, intArray19);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) 1, intArray19);
        ds.AvaliaMultMatrizes.multmatrize(0, intArray19);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) 0, intArray19);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) -1, intArray19);
        ds.AvaliaMultMatrizes.multmatrize((-1), intArray19);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) -1, intArray19);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) -1, intArray19);
        // The following exception was thrown during execution in test generation
        try {
            ds.AvaliaMultMatrizes.multmatrize(10, intArray19);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray19), "[0, 32]");
    }

    @Test
    public void test2007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2007");
        int[] intArray11 = new int[] { (short) 0, ' ' };
        ds.AvaliaMultMatrizes.multmatrize(0, intArray11);
        ds.AvaliaMultMatrizes.multmatrize(0, intArray11);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) 0, intArray11);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) 0, intArray11);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) -1, intArray11);
        ds.AvaliaMultMatrizes.multmatrize(0, intArray11);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) -1, intArray11);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) 1, intArray11);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) -1, intArray11);
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[0, 32]");
    }

    @Test
    public void test2008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2008");
        int[] intArray12 = new int[] { 100, (byte) 100 };
        ds.AvaliaMultMatrizes.multmatrize((-1), intArray12);
        ds.AvaliaMultMatrizes.multmatrize(1, intArray12);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) 1, intArray12);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) 0, intArray12);
        ds.AvaliaMultMatrizes.multmatrize(0, intArray12);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) 1, intArray12);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) -1, intArray12);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) 1, intArray12);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) 1, intArray12);
        // The following exception was thrown during execution in test generation
        try {
            ds.AvaliaMultMatrizes.multmatrize(100, intArray12);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[100, 100]");
    }

    @Test
    public void test2009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2009");
        int[] intArray17 = new int[] { (short) 0, ' ' };
        ds.AvaliaMultMatrizes.multmatrize(0, intArray17);
        ds.AvaliaMultMatrizes.multmatrize(0, intArray17);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) 0, intArray17);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) -1, intArray17);
        ds.AvaliaMultMatrizes.multmatrize(0, intArray17);
        ds.AvaliaMultMatrizes.multmatrize((-1), intArray17);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) 1, intArray17);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) 1, intArray17);
        ds.AvaliaMultMatrizes.multmatrize(0, intArray17);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) 1, intArray17);
        ds.AvaliaMultMatrizes.multmatrize((-1), intArray17);
        ds.AvaliaMultMatrizes.multmatrize(0, intArray17);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) 0, intArray17);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) -1, intArray17);
        // The following exception was thrown during execution in test generation
        try {
            ds.AvaliaMultMatrizes.multmatrize((int) (short) 10, intArray17);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[0, 32]");
    }

    @Test
    public void test2010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2010");
        int[] intArray10 = new int[] { 100, (byte) 100 };
        ds.AvaliaMultMatrizes.multmatrize((-1), intArray10);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) -1, intArray10);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) -1, intArray10);
        ds.AvaliaMultMatrizes.multmatrize(0, intArray10);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) -1, intArray10);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) -1, intArray10);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) -1, intArray10);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) 1, intArray10);
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[100, 100]");
    }

    @Test
    public void test2011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2011");
        int[] intArray7 = new int[] { (short) 0, ' ' };
        ds.AvaliaMultMatrizes.multmatrize(0, intArray7);
        ds.AvaliaMultMatrizes.multmatrize(0, intArray7);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) 0, intArray7);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) 0, intArray7);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) -1, intArray7);
        java.lang.Class<?> wildcardClass13 = intArray7.getClass();
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[0, 32]");
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test2012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2012");
        int[] intArray10 = new int[] { 100, (byte) 100 };
        ds.AvaliaMultMatrizes.multmatrize((-1), intArray10);
        ds.AvaliaMultMatrizes.multmatrize(1, intArray10);
        ds.AvaliaMultMatrizes.multmatrize(1, intArray10);
        ds.AvaliaMultMatrizes.multmatrize(0, intArray10);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) 1, intArray10);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) 1, intArray10);
        ds.AvaliaMultMatrizes.multmatrize(0, intArray10);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) 0, intArray10);
        java.lang.Class<?> wildcardClass19 = intArray10.getClass();
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[100, 100]");
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test2013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2013");
        int[] intArray17 = new int[] { (short) 0, ' ' };
        ds.AvaliaMultMatrizes.multmatrize(0, intArray17);
        ds.AvaliaMultMatrizes.multmatrize(0, intArray17);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) 0, intArray17);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) -1, intArray17);
        ds.AvaliaMultMatrizes.multmatrize(0, intArray17);
        ds.AvaliaMultMatrizes.multmatrize((-1), intArray17);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) 1, intArray17);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) 1, intArray17);
        ds.AvaliaMultMatrizes.multmatrize(0, intArray17);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) 1, intArray17);
        ds.AvaliaMultMatrizes.multmatrize(0, intArray17);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) 0, intArray17);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) -1, intArray17);
        ds.AvaliaMultMatrizes.multmatrize((-1), intArray17);
        // The following exception was thrown during execution in test generation
        try {
            ds.AvaliaMultMatrizes.multmatrize((int) (short) 100, intArray17);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[0, 32]");
    }

    @Test
    public void test2014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2014");
        int[] intArray11 = new int[] { 100, (byte) 100 };
        ds.AvaliaMultMatrizes.multmatrize((-1), intArray11);
        ds.AvaliaMultMatrizes.multmatrize(1, intArray11);
        ds.AvaliaMultMatrizes.multmatrize(1, intArray11);
        ds.AvaliaMultMatrizes.multmatrize((-1), intArray11);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) 1, intArray11);
        ds.AvaliaMultMatrizes.multmatrize(0, intArray11);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) 0, intArray11);
        ds.AvaliaMultMatrizes.multmatrize(0, intArray11);
        // The following exception was thrown during execution in test generation
        try {
            ds.AvaliaMultMatrizes.multmatrize((int) (byte) 10, intArray11);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[100, 100]");
    }

    @Test
    public void test2015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2015");
        int[] intArray9 = new int[] { 100, (byte) 100 };
        ds.AvaliaMultMatrizes.multmatrize((-1), intArray9);
        ds.AvaliaMultMatrizes.multmatrize(1, intArray9);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) 1, intArray9);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) -1, intArray9);
        ds.AvaliaMultMatrizes.multmatrize(0, intArray9);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) 0, intArray9);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) 1, intArray9);
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[100, 100]");
    }

    @Test
    public void test2016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2016");
        int[] intArray10 = new int[] { 100, (byte) 100 };
        ds.AvaliaMultMatrizes.multmatrize((-1), intArray10);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) -1, intArray10);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) -1, intArray10);
        ds.AvaliaMultMatrizes.multmatrize(0, intArray10);
        ds.AvaliaMultMatrizes.multmatrize(1, intArray10);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) -1, intArray10);
        ds.AvaliaMultMatrizes.multmatrize(1, intArray10);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) 0, intArray10);
        java.lang.Class<?> wildcardClass19 = intArray10.getClass();
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[100, 100]");
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test2017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2017");
        int[] intArray14 = new int[] { (short) 0, ' ' };
        ds.AvaliaMultMatrizes.multmatrize(0, intArray14);
        ds.AvaliaMultMatrizes.multmatrize(0, intArray14);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) 0, intArray14);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) -1, intArray14);
        ds.AvaliaMultMatrizes.multmatrize(0, intArray14);
        ds.AvaliaMultMatrizes.multmatrize((-1), intArray14);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) 1, intArray14);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) 1, intArray14);
        ds.AvaliaMultMatrizes.multmatrize(0, intArray14);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) -1, intArray14);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) -1, intArray14);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) -1, intArray14);
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[0, 32]");
    }

    @Test
    public void test2018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2018");
        int[] intArray9 = new int[] { (short) 0, ' ' };
        ds.AvaliaMultMatrizes.multmatrize(0, intArray9);
        ds.AvaliaMultMatrizes.multmatrize(0, intArray9);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) 0, intArray9);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) -1, intArray9);
        ds.AvaliaMultMatrizes.multmatrize((-1), intArray9);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) 0, intArray9);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) 0, intArray9);
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[0, 32]");
    }

    @Test
    public void test2019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2019");
        int[] intArray11 = new int[] { (short) 0, ' ' };
        ds.AvaliaMultMatrizes.multmatrize(0, intArray11);
        ds.AvaliaMultMatrizes.multmatrize(0, intArray11);
        ds.AvaliaMultMatrizes.multmatrize((-1), intArray11);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) 0, intArray11);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) 1, intArray11);
        ds.AvaliaMultMatrizes.multmatrize((-1), intArray11);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) 0, intArray11);
        ds.AvaliaMultMatrizes.multmatrize(0, intArray11);
        // The following exception was thrown during execution in test generation
        try {
            ds.AvaliaMultMatrizes.multmatrize((int) '4', intArray11);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[0, 32]");
    }

    @Test
    public void test2020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2020");
        int[] intArray8 = new int[] { 100, (byte) 100 };
        ds.AvaliaMultMatrizes.multmatrize((-1), intArray8);
        ds.AvaliaMultMatrizes.multmatrize((-1), intArray8);
        ds.AvaliaMultMatrizes.multmatrize((-1), intArray8);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) -1, intArray8);
        ds.AvaliaMultMatrizes.multmatrize(0, intArray8);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) 0, intArray8);
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[100, 100]");
    }

    @Test
    public void test2021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2021");
        int[] intArray12 = new int[] { 100, (byte) 100 };
        ds.AvaliaMultMatrizes.multmatrize((-1), intArray12);
        ds.AvaliaMultMatrizes.multmatrize(1, intArray12);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) 1, intArray12);
        ds.AvaliaMultMatrizes.multmatrize(0, intArray12);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) -1, intArray12);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) 0, intArray12);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) -1, intArray12);
        ds.AvaliaMultMatrizes.multmatrize(0, intArray12);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) 0, intArray12);
        ds.AvaliaMultMatrizes.multmatrize(1, intArray12);
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[100, 100]");
    }

    @Test
    public void test2022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2022");
        int[] intArray10 = new int[] { 100, (byte) 100 };
        ds.AvaliaMultMatrizes.multmatrize((-1), intArray10);
        ds.AvaliaMultMatrizes.multmatrize(1, intArray10);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) 1, intArray10);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) 0, intArray10);
        ds.AvaliaMultMatrizes.multmatrize((-1), intArray10);
        ds.AvaliaMultMatrizes.multmatrize(1, intArray10);
        ds.AvaliaMultMatrizes.multmatrize((-1), intArray10);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) 1, intArray10);
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[100, 100]");
    }

    @Test
    public void test2023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2023");
        int[] intArray9 = new int[] { 100, (byte) 100 };
        ds.AvaliaMultMatrizes.multmatrize((-1), intArray9);
        ds.AvaliaMultMatrizes.multmatrize(1, intArray9);
        ds.AvaliaMultMatrizes.multmatrize(1, intArray9);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) -1, intArray9);
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
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[100, 100]");
    }

    @Test
    public void test2024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2024");
        int[] intArray10 = new int[] { 100, (byte) 100 };
        ds.AvaliaMultMatrizes.multmatrize((-1), intArray10);
        ds.AvaliaMultMatrizes.multmatrize((-1), intArray10);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) -1, intArray10);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) 0, intArray10);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) 1, intArray10);
        ds.AvaliaMultMatrizes.multmatrize((-1), intArray10);
        ds.AvaliaMultMatrizes.multmatrize(0, intArray10);
        // The following exception was thrown during execution in test generation
        try {
            ds.AvaliaMultMatrizes.multmatrize((int) (byte) 10, intArray10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[100, 100]");
    }

    @Test
    public void test2025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2025");
        int[] intArray6 = new int[] { 100, (byte) 100 };
        ds.AvaliaMultMatrizes.multmatrize((-1), intArray6);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) 1, intArray6);
        ds.AvaliaMultMatrizes.multmatrize(1, intArray6);
        ds.AvaliaMultMatrizes.multmatrize(0, intArray6);
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[100, 100]");
    }

    @Test
    public void test2026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2026");
        int[] intArray8 = new int[] { (short) 0, ' ' };
        ds.AvaliaMultMatrizes.multmatrize(0, intArray8);
        ds.AvaliaMultMatrizes.multmatrize(0, intArray8);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) 0, intArray8);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) 0, intArray8);
        ds.AvaliaMultMatrizes.multmatrize(0, intArray8);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) 0, intArray8);
        java.lang.Class<?> wildcardClass15 = intArray8.getClass();
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[0, 32]");
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test2027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2027");
        int[] intArray12 = new int[] { (short) 0, ' ' };
        ds.AvaliaMultMatrizes.multmatrize(0, intArray12);
        ds.AvaliaMultMatrizes.multmatrize(0, intArray12);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) 0, intArray12);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) -1, intArray12);
        ds.AvaliaMultMatrizes.multmatrize(0, intArray12);
        ds.AvaliaMultMatrizes.multmatrize((-1), intArray12);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) 1, intArray12);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) 0, intArray12);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) -1, intArray12);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) -1, intArray12);
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[0, 32]");
    }

    @Test
    public void test2028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2028");
        int[] intArray8 = new int[] { 100, (byte) 100 };
        ds.AvaliaMultMatrizes.multmatrize((-1), intArray8);
        ds.AvaliaMultMatrizes.multmatrize(1, intArray8);
        ds.AvaliaMultMatrizes.multmatrize(1, intArray8);
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
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[100, 100]");
    }

    @Test
    public void test2029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2029");
        int[] intArray8 = new int[] { 100, (byte) 100 };
        ds.AvaliaMultMatrizes.multmatrize((-1), intArray8);
        ds.AvaliaMultMatrizes.multmatrize((-1), intArray8);
        ds.AvaliaMultMatrizes.multmatrize(0, intArray8);
        ds.AvaliaMultMatrizes.multmatrize((-1), intArray8);
        ds.AvaliaMultMatrizes.multmatrize(0, intArray8);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) 0, intArray8);
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[100, 100]");
    }

    @Test
    public void test2030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2030");
        int[] intArray12 = new int[] { 100, (byte) 100 };
        ds.AvaliaMultMatrizes.multmatrize((-1), intArray12);
        ds.AvaliaMultMatrizes.multmatrize(1, intArray12);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) 1, intArray12);
        ds.AvaliaMultMatrizes.multmatrize(0, intArray12);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) -1, intArray12);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) 0, intArray12);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) -1, intArray12);
        ds.AvaliaMultMatrizes.multmatrize(0, intArray12);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) -1, intArray12);
        ds.AvaliaMultMatrizes.multmatrize(0, intArray12);
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[100, 100]");
    }

    @Test
    public void test2031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2031");
        int[] intArray15 = new int[] { (short) 0, ' ' };
        ds.AvaliaMultMatrizes.multmatrize(0, intArray15);
        ds.AvaliaMultMatrizes.multmatrize(0, intArray15);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) 0, intArray15);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) -1, intArray15);
        ds.AvaliaMultMatrizes.multmatrize(0, intArray15);
        ds.AvaliaMultMatrizes.multmatrize((-1), intArray15);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) 1, intArray15);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) 1, intArray15);
        ds.AvaliaMultMatrizes.multmatrize(0, intArray15);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) 1, intArray15);
        ds.AvaliaMultMatrizes.multmatrize((-1), intArray15);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) 1, intArray15);
        // The following exception was thrown during execution in test generation
        try {
            ds.AvaliaMultMatrizes.multmatrize((int) ' ', intArray15);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[0, 32]");
    }

    @Test
    public void test2032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2032");
        int[] intArray8 = new int[] { 100, (byte) 100 };
        ds.AvaliaMultMatrizes.multmatrize((-1), intArray8);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) -1, intArray8);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) -1, intArray8);
        ds.AvaliaMultMatrizes.multmatrize(0, intArray8);
        ds.AvaliaMultMatrizes.multmatrize((int) (short) -1, intArray8);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) 0, intArray8);
        java.lang.Class<?> wildcardClass15 = intArray8.getClass();
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[100, 100]");
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test2033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2033");
        int[] intArray8 = new int[] { (short) 0, ' ' };
        ds.AvaliaMultMatrizes.multmatrize(0, intArray8);
        ds.AvaliaMultMatrizes.multmatrize(0, intArray8);
        ds.AvaliaMultMatrizes.multmatrize((-1), intArray8);
        ds.AvaliaMultMatrizes.multmatrize((int) (byte) 0, intArray8);
        ds.AvaliaMultMatrizes.multmatrize(1, intArray8);
        // The following exception was thrown during execution in test generation
        try {
            ds.AvaliaMultMatrizes.multmatrize(100, intArray8);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[0, 32]");
    }
}

