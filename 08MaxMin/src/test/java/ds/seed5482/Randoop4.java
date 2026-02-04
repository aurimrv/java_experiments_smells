package ds.seed5482;

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
        int[] intArray5 = new int[] { 'a', (byte) 100, '#', (byte) 0, ' ' };
        int[] intArray8 = ds.MaxMin4.maxMin4(intArray5, 0, 0);
        int[] intArray11 = ds.MaxMin4.maxMin4(intArray5, (int) (short) 0, 0);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray14 = ds.MaxMin4.maxMin4(intArray11, 10, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[97, 100, 35, 0, 32]");
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[97, 97]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[97, 97]");
    }

    @Test
    public void test2002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2002");
        int[] intArray3 = new int[] { 1, 0, (short) -1 };
        int[] intArray6 = ds.MaxMin4.maxMin4(intArray3, 1, (int) (short) 0);
        int[] intArray9 = ds.MaxMin4.maxMin4(intArray6, (int) (byte) 1, 0);
        int[] intArray12 = ds.MaxMin4.maxMin4(intArray9, (int) (byte) 0, 0);
        int[] intArray15 = ds.MaxMin4.maxMin4(intArray12, (int) (short) 0, (int) (byte) 0);
        int[] intArray18 = ds.MaxMin4.maxMin4(intArray15, 0, 1);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray21 = ds.MaxMin4.maxMin4(intArray15, (int) (byte) 10, 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[1, 0, -1]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[1, 0]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[1, 0]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray18), "[1, 1]");
    }

    @Test
    public void test2003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2003");
        int[] intArray3 = new int[] { 1, 0, (short) -1 };
        int[] intArray6 = ds.MaxMin4.maxMin4(intArray3, 1, (int) (short) 0);
        int[] intArray9 = ds.MaxMin4.maxMin4(intArray6, (int) (byte) 1, 0);
        int[] intArray12 = ds.MaxMin4.maxMin4(intArray9, 0, (int) (byte) 1);
        int[] intArray15 = ds.MaxMin4.maxMin4(intArray9, 0, (int) (short) 1);
        int[] intArray18 = ds.MaxMin4.maxMin4(intArray9, (int) (byte) 1, 0);
        int[] intArray21 = ds.MaxMin4.maxMin4(intArray9, (int) (short) 0, (int) (short) 1);
        int[] intArray24 = ds.MaxMin4.maxMin4(intArray21, 1, 1);
        int[] intArray27 = ds.MaxMin4.maxMin4(intArray21, 0, 0);
        int[] intArray30 = ds.MaxMin4.maxMin4(intArray27, 1, 0);
        java.lang.Class<?> wildcardClass31 = intArray27.getClass();
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[1, 0, -1]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[1, 0]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[1, 0]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[1, 0]");
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[1, 0]");
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray18), "[1, 0]");
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray21), "[1, 0]");
        org.junit.Assert.assertNotNull(intArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray24), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray27), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray30);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray30), "[1, 1]");
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test2004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2004");
        int[] intArray2 = new int[] { ' ', 0 };
        int[] intArray5 = ds.MaxMin4.maxMin4(intArray2, (int) (byte) 1, (int) (short) 1);
        int[] intArray8 = ds.MaxMin4.maxMin4(intArray2, 0, (int) (byte) 0);
        int[] intArray11 = ds.MaxMin4.maxMin4(intArray8, (int) (byte) 0, (int) (byte) 0);
        int[] intArray14 = ds.MaxMin4.maxMin4(intArray8, (int) (byte) 1, (int) (short) 0);
        int[] intArray17 = ds.MaxMin4.maxMin4(intArray14, 0, 1);
        int[] intArray20 = ds.MaxMin4.maxMin4(intArray14, (int) (byte) 1, 1);
        int[] intArray23 = ds.MaxMin4.maxMin4(intArray20, (int) (byte) 0, 1);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray26 = ds.MaxMin4.maxMin4(intArray23, 1, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[32, 0]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[32, 32]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[32, 32]");
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[32, 32]");
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[32, 32]");
        org.junit.Assert.assertNotNull(intArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray20), "[32, 32]");
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray23), "[32, 32]");
    }

    @Test
    public void test2005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2005");
        int[] intArray2 = new int[] { ' ', 0 };
        int[] intArray5 = ds.MaxMin4.maxMin4(intArray2, (int) (byte) 1, (int) (short) 1);
        int[] intArray8 = ds.MaxMin4.maxMin4(intArray2, 0, (int) (byte) 0);
        int[] intArray11 = ds.MaxMin4.maxMin4(intArray8, (int) (byte) 0, (int) (byte) 0);
        int[] intArray14 = ds.MaxMin4.maxMin4(intArray11, (int) (short) 0, 0);
        int[] intArray17 = ds.MaxMin4.maxMin4(intArray14, (int) (byte) 1, (int) (byte) 0);
        int[] intArray20 = ds.MaxMin4.maxMin4(intArray17, (int) (short) 1, 0);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray23 = ds.MaxMin4.maxMin4(intArray20, (int) (byte) 10, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[32, 0]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[32, 32]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[32, 32]");
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[32, 32]");
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[32, 32]");
        org.junit.Assert.assertNotNull(intArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray20), "[32, 32]");
    }

    @Test
    public void test2006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2006");
        int[] intArray3 = new int[] { 1, 0, (short) -1 };
        int[] intArray6 = ds.MaxMin4.maxMin4(intArray3, 1, (int) (short) 0);
        int[] intArray9 = ds.MaxMin4.maxMin4(intArray6, (int) (byte) 1, 0);
        int[] intArray12 = ds.MaxMin4.maxMin4(intArray9, 0, (int) (byte) 1);
        int[] intArray15 = ds.MaxMin4.maxMin4(intArray9, 0, (int) (byte) 1);
        int[] intArray18 = ds.MaxMin4.maxMin4(intArray9, (int) (short) 0, (int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray21 = ds.MaxMin4.maxMin4(intArray18, (int) (byte) 10, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[1, 0, -1]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[1, 0]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[1, 0]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[1, 0]");
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[1, 0]");
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray18), "[1, 0]");
    }

    @Test
    public void test2007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2007");
        int[] intArray2 = new int[] { ' ', 0 };
        int[] intArray5 = ds.MaxMin4.maxMin4(intArray2, (int) (byte) 1, (int) (short) 1);
        int[] intArray8 = ds.MaxMin4.maxMin4(intArray2, 0, (int) (byte) 0);
        int[] intArray11 = ds.MaxMin4.maxMin4(intArray8, (int) (byte) 0, (int) (byte) 0);
        int[] intArray14 = ds.MaxMin4.maxMin4(intArray8, (int) (byte) 1, (int) (short) 0);
        int[] intArray17 = ds.MaxMin4.maxMin4(intArray14, 0, 1);
        int[] intArray20 = ds.MaxMin4.maxMin4(intArray14, (int) (byte) 1, 1);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray23 = ds.MaxMin4.maxMin4(intArray20, (int) (short) 0, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[32, 0]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[32, 32]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[32, 32]");
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[32, 32]");
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[32, 32]");
        org.junit.Assert.assertNotNull(intArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray20), "[32, 32]");
    }

    @Test
    public void test2008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2008");
        int[] intArray0 = null;
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray3 = ds.MaxMin4.maxMin4(intArray0, (int) '#', (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2009");
        int[] intArray2 = new int[] { ' ', 0 };
        int[] intArray5 = ds.MaxMin4.maxMin4(intArray2, (int) (byte) 1, (int) (short) 1);
        int[] intArray8 = ds.MaxMin4.maxMin4(intArray2, 0, (int) (byte) 0);
        int[] intArray11 = ds.MaxMin4.maxMin4(intArray8, (int) (byte) 0, (int) (byte) 0);
        int[] intArray14 = ds.MaxMin4.maxMin4(intArray11, (int) (short) 0, 0);
        int[] intArray17 = ds.MaxMin4.maxMin4(intArray11, 0, 1);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray20 = ds.MaxMin4.maxMin4(intArray17, (int) (short) 100, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[32, 0]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[32, 32]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[32, 32]");
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[32, 32]");
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[32, 32]");
    }

    @Test
    public void test2010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2010");
        int[] intArray3 = new int[] { 1, 0, (short) -1 };
        int[] intArray6 = ds.MaxMin4.maxMin4(intArray3, 1, (int) (short) 0);
        int[] intArray9 = ds.MaxMin4.maxMin4(intArray6, (int) (byte) 1, 0);
        int[] intArray12 = ds.MaxMin4.maxMin4(intArray9, 0, (int) (byte) 1);
        int[] intArray15 = ds.MaxMin4.maxMin4(intArray9, 0, (int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray18 = ds.MaxMin4.maxMin4(intArray15, (int) ' ', (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[1, 0, -1]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[1, 0]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[1, 0]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[1, 0]");
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[1, 0]");
    }

    @Test
    public void test2011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2011");
        int[] intArray3 = new int[] { 1, 0, (short) -1 };
        int[] intArray6 = ds.MaxMin4.maxMin4(intArray3, 1, (int) (short) 0);
        int[] intArray9 = ds.MaxMin4.maxMin4(intArray6, (int) (byte) 1, 0);
        int[] intArray12 = ds.MaxMin4.maxMin4(intArray9, 0, 0);
        int[] intArray15 = ds.MaxMin4.maxMin4(intArray9, 0, (int) (byte) 0);
        int[] intArray18 = ds.MaxMin4.maxMin4(intArray15, (int) (short) 0, (int) (short) 1);
        int[] intArray21 = ds.MaxMin4.maxMin4(intArray18, 1, 0);
        int[] intArray24 = ds.MaxMin4.maxMin4(intArray18, (int) (byte) 1, (int) (byte) 1);
        java.lang.Class<?> wildcardClass25 = intArray18.getClass();
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[1, 0, -1]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[1, 0]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[1, 0]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray18), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray21), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray24), "[1, 1]");
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test2012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2012");
        int[] intArray2 = new int[] { ' ', 0 };
        int[] intArray5 = ds.MaxMin4.maxMin4(intArray2, (int) (byte) 1, (int) (short) 1);
        int[] intArray8 = ds.MaxMin4.maxMin4(intArray2, 0, (int) (byte) 0);
        int[] intArray11 = ds.MaxMin4.maxMin4(intArray8, (int) (byte) 0, (int) (byte) 0);
        int[] intArray14 = ds.MaxMin4.maxMin4(intArray8, (int) (byte) 1, (int) (short) 0);
        int[] intArray17 = ds.MaxMin4.maxMin4(intArray14, 0, 1);
        int[] intArray20 = ds.MaxMin4.maxMin4(intArray14, (int) (byte) 1, 1);
        java.lang.Class<?> wildcardClass21 = intArray20.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[32, 0]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[32, 32]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[32, 32]");
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[32, 32]");
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[32, 32]");
        org.junit.Assert.assertNotNull(intArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray20), "[32, 32]");
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test2013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2013");
        int[] intArray3 = new int[] { 1, 0, (short) -1 };
        int[] intArray6 = ds.MaxMin4.maxMin4(intArray3, 1, (int) (short) 0);
        int[] intArray9 = ds.MaxMin4.maxMin4(intArray6, (int) (byte) 1, 0);
        int[] intArray12 = ds.MaxMin4.maxMin4(intArray9, 0, (int) (byte) 1);
        int[] intArray15 = ds.MaxMin4.maxMin4(intArray9, 0, (int) (short) 1);
        int[] intArray18 = ds.MaxMin4.maxMin4(intArray15, (int) (byte) 1, (int) (byte) 0);
        int[] intArray21 = ds.MaxMin4.maxMin4(intArray15, (int) (short) 1, (int) (short) 1);
        int[] intArray24 = ds.MaxMin4.maxMin4(intArray15, (int) (byte) 1, (int) (byte) 1);
        int[] intArray27 = ds.MaxMin4.maxMin4(intArray24, 0, (int) (short) 0);
        int[] intArray30 = ds.MaxMin4.maxMin4(intArray27, (int) (byte) 0, (int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray33 = ds.MaxMin4.maxMin4(intArray30, (int) (byte) 10, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[1, 0, -1]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[1, 0]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[1, 0]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[1, 0]");
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[1, 0]");
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray18), "[1, 0]");
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray21), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray24), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray27), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray30);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray30), "[0, 0]");
    }

    @Test
    public void test2014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2014");
        int[] intArray3 = new int[] { 1, 0, (short) -1 };
        int[] intArray6 = ds.MaxMin4.maxMin4(intArray3, 1, (int) (short) 0);
        int[] intArray9 = ds.MaxMin4.maxMin4(intArray6, (int) (byte) 1, 0);
        int[] intArray12 = ds.MaxMin4.maxMin4(intArray9, 0, 0);
        int[] intArray15 = ds.MaxMin4.maxMin4(intArray9, 0, (int) (byte) 0);
        int[] intArray18 = ds.MaxMin4.maxMin4(intArray15, (int) (short) 0, (int) (short) 1);
        int[] intArray21 = ds.MaxMin4.maxMin4(intArray18, 1, 0);
        int[] intArray24 = ds.MaxMin4.maxMin4(intArray18, (int) (byte) 1, (int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray27 = ds.MaxMin4.maxMin4(intArray18, (int) (byte) 100, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[1, 0, -1]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[1, 0]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[1, 0]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray18), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray21), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray24), "[1, 1]");
    }

    @Test
    public void test2015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2015");
        int[] intArray2 = new int[] { ' ', 0 };
        int[] intArray5 = ds.MaxMin4.maxMin4(intArray2, (int) (byte) 1, (int) (short) 1);
        int[] intArray8 = ds.MaxMin4.maxMin4(intArray2, 0, (int) (byte) 0);
        int[] intArray11 = ds.MaxMin4.maxMin4(intArray8, 0, (int) (short) 0);
        int[] intArray14 = ds.MaxMin4.maxMin4(intArray11, 0, 1);
        int[] intArray17 = ds.MaxMin4.maxMin4(intArray11, 0, (int) (byte) 0);
        int[] intArray20 = ds.MaxMin4.maxMin4(intArray11, 0, (int) (byte) 0);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[32, 0]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[32, 32]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[32, 32]");
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[32, 32]");
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[32, 32]");
        org.junit.Assert.assertNotNull(intArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray20), "[32, 32]");
    }

    @Test
    public void test2016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2016");
        int[] intArray3 = new int[] { 1, 0, (short) -1 };
        int[] intArray6 = ds.MaxMin4.maxMin4(intArray3, 1, (int) (short) 0);
        int[] intArray9 = ds.MaxMin4.maxMin4(intArray6, (int) (short) 0, (int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray12 = ds.MaxMin4.maxMin4(intArray6, (int) ' ', 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[1, 0, -1]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[1, 0]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[1, 1]");
    }

    @Test
    public void test2017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2017");
        int[] intArray2 = new int[] { ' ', 0 };
        int[] intArray5 = ds.MaxMin4.maxMin4(intArray2, (int) (byte) 1, (int) (short) 1);
        int[] intArray8 = ds.MaxMin4.maxMin4(intArray2, 0, (int) (byte) 0);
        int[] intArray11 = ds.MaxMin4.maxMin4(intArray8, 0, (int) (short) 0);
        int[] intArray14 = ds.MaxMin4.maxMin4(intArray8, 0, (int) (byte) 0);
        int[] intArray17 = ds.MaxMin4.maxMin4(intArray14, 0, (int) (byte) 0);
        int[] intArray20 = ds.MaxMin4.maxMin4(intArray14, 0, 0);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray23 = ds.MaxMin4.maxMin4(intArray20, (int) (byte) 0, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[32, 0]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[32, 32]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[32, 32]");
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[32, 32]");
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[32, 32]");
        org.junit.Assert.assertNotNull(intArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray20), "[32, 32]");
    }

    @Test
    public void test2018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2018");
        int[] intArray3 = new int[] { 1, 0, (short) -1 };
        int[] intArray6 = ds.MaxMin4.maxMin4(intArray3, 1, (int) (short) 0);
        int[] intArray9 = ds.MaxMin4.maxMin4(intArray6, (int) (byte) 1, 0);
        int[] intArray12 = ds.MaxMin4.maxMin4(intArray9, (int) (byte) 0, 0);
        int[] intArray15 = ds.MaxMin4.maxMin4(intArray12, (int) (short) 0, (int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray18 = ds.MaxMin4.maxMin4(intArray15, (int) (short) -1, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[1, 0, -1]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[1, 0]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[1, 0]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[1, 1]");
    }

    @Test
    public void test2019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2019");
        int[] intArray5 = new int[] { 'a', (byte) 100, '#', (byte) 0, ' ' };
        int[] intArray8 = ds.MaxMin4.maxMin4(intArray5, 0, 0);
        int[] intArray11 = ds.MaxMin4.maxMin4(intArray5, (int) (short) 0, 0);
        int[] intArray14 = ds.MaxMin4.maxMin4(intArray5, 1, (int) (byte) 0);
        int[] intArray17 = ds.MaxMin4.maxMin4(intArray5, (int) (byte) 1, (int) (short) 0);
        int[] intArray20 = ds.MaxMin4.maxMin4(intArray17, (int) (short) 1, (int) (short) 0);
        java.lang.Class<?> wildcardClass21 = intArray17.getClass();
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[97, 100, 35, 0, 32]");
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[97, 97]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[97, 97]");
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[100, 97]");
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[100, 97]");
        org.junit.Assert.assertNotNull(intArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray20), "[100, 97]");
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test2020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2020");
        int[] intArray3 = new int[] { 1, 0, (short) -1 };
        int[] intArray6 = ds.MaxMin4.maxMin4(intArray3, 1, (int) (short) 0);
        int[] intArray9 = ds.MaxMin4.maxMin4(intArray6, (int) (byte) 1, 0);
        int[] intArray12 = ds.MaxMin4.maxMin4(intArray9, 0, (int) (byte) 1);
        int[] intArray15 = ds.MaxMin4.maxMin4(intArray9, 0, (int) (short) 1);
        int[] intArray18 = ds.MaxMin4.maxMin4(intArray9, (int) (byte) 1, 0);
        int[] intArray21 = ds.MaxMin4.maxMin4(intArray9, (int) (short) 0, (int) (short) 1);
        int[] intArray24 = ds.MaxMin4.maxMin4(intArray21, 1, 0);
        int[] intArray27 = ds.MaxMin4.maxMin4(intArray24, (int) (byte) 0, (int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray30 = ds.MaxMin4.maxMin4(intArray24, (int) (short) -1, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[1, 0, -1]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[1, 0]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[1, 0]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[1, 0]");
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[1, 0]");
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray18), "[1, 0]");
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray21), "[1, 0]");
        org.junit.Assert.assertNotNull(intArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray24), "[1, 0]");
        org.junit.Assert.assertNotNull(intArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray27), "[1, 0]");
    }

    @Test
    public void test2021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2021");
        int[] intArray2 = new int[] { ' ', 0 };
        int[] intArray5 = ds.MaxMin4.maxMin4(intArray2, (int) (byte) 1, (int) (short) 1);
        int[] intArray8 = ds.MaxMin4.maxMin4(intArray5, 0, 1);
        int[] intArray11 = ds.MaxMin4.maxMin4(intArray8, (int) (byte) 0, (int) (byte) 0);
        int[] intArray14 = ds.MaxMin4.maxMin4(intArray8, 0, 0);
        int[] intArray17 = ds.MaxMin4.maxMin4(intArray14, (int) (short) 1, (int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray20 = ds.MaxMin4.maxMin4(intArray14, (int) '4', (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[32, 0]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[0, 0]");
    }

    @Test
    public void test2022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2022");
        int[] intArray2 = new int[] { ' ', 0 };
        int[] intArray5 = ds.MaxMin4.maxMin4(intArray2, (int) (byte) 1, (int) (short) 1);
        int[] intArray8 = ds.MaxMin4.maxMin4(intArray2, (int) (byte) 0, 1);
        int[] intArray11 = ds.MaxMin4.maxMin4(intArray8, 0, 0);
        int[] intArray14 = ds.MaxMin4.maxMin4(intArray8, 0, 1);
        int[] intArray17 = ds.MaxMin4.maxMin4(intArray8, 1, 0);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray20 = ds.MaxMin4.maxMin4(intArray17, 1, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[32, 0]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[32, 0]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[32, 32]");
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[32, 0]");
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[32, 0]");
    }

    @Test
    public void test2023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2023");
        int[] intArray5 = new int[] { 'a', (byte) 100, '#', (byte) 0, ' ' };
        int[] intArray8 = ds.MaxMin4.maxMin4(intArray5, 0, 0);
        int[] intArray11 = ds.MaxMin4.maxMin4(intArray5, (int) (short) 0, 0);
        int[] intArray14 = ds.MaxMin4.maxMin4(intArray11, 1, (int) (byte) 0);
        int[] intArray17 = ds.MaxMin4.maxMin4(intArray14, 1, 1);
        int[] intArray20 = ds.MaxMin4.maxMin4(intArray17, (int) (short) 0, (int) (byte) 1);
        int[] intArray23 = ds.MaxMin4.maxMin4(intArray17, 1, 0);
        int[] intArray26 = ds.MaxMin4.maxMin4(intArray17, (int) (byte) 0, (int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray29 = ds.MaxMin4.maxMin4(intArray26, (int) (short) 100, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[97, 100, 35, 0, 32]");
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[97, 97]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[97, 97]");
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[97, 97]");
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[97, 97]");
        org.junit.Assert.assertNotNull(intArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray20), "[97, 97]");
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray23), "[97, 97]");
        org.junit.Assert.assertNotNull(intArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray26), "[97, 97]");
    }

    @Test
    public void test2024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2024");
        int[] intArray2 = new int[] { ' ', 0 };
        int[] intArray5 = ds.MaxMin4.maxMin4(intArray2, (int) (byte) 1, (int) (short) 1);
        int[] intArray8 = ds.MaxMin4.maxMin4(intArray2, 0, (int) (byte) 0);
        int[] intArray11 = ds.MaxMin4.maxMin4(intArray8, 0, (int) (short) 0);
        int[] intArray14 = ds.MaxMin4.maxMin4(intArray8, 0, (int) (byte) 0);
        int[] intArray17 = ds.MaxMin4.maxMin4(intArray14, 0, (int) (byte) 0);
        int[] intArray20 = ds.MaxMin4.maxMin4(intArray14, 0, (int) (short) 1);
        java.lang.Class<?> wildcardClass21 = intArray14.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[32, 0]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[32, 32]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[32, 32]");
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[32, 32]");
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[32, 32]");
        org.junit.Assert.assertNotNull(intArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray20), "[32, 32]");
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test2025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2025");
        int[] intArray2 = new int[] { ' ', 0 };
        int[] intArray5 = ds.MaxMin4.maxMin4(intArray2, (int) (byte) 1, (int) (short) 1);
        int[] intArray8 = ds.MaxMin4.maxMin4(intArray2, 0, (int) (byte) 0);
        int[] intArray11 = ds.MaxMin4.maxMin4(intArray8, 0, (int) (short) 0);
        int[] intArray14 = ds.MaxMin4.maxMin4(intArray8, 0, (int) (byte) 0);
        int[] intArray17 = ds.MaxMin4.maxMin4(intArray14, 0, (int) (byte) 0);
        int[] intArray20 = ds.MaxMin4.maxMin4(intArray14, 0, 0);
        java.lang.Class<?> wildcardClass21 = intArray14.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[32, 0]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[32, 32]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[32, 32]");
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[32, 32]");
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[32, 32]");
        org.junit.Assert.assertNotNull(intArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray20), "[32, 32]");
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test2026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2026");
        int[] intArray3 = new int[] { 1, 0, (short) -1 };
        int[] intArray6 = ds.MaxMin4.maxMin4(intArray3, 1, (int) (short) 0);
        int[] intArray9 = ds.MaxMin4.maxMin4(intArray3, 1, (int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray12 = ds.MaxMin4.maxMin4(intArray3, (int) (byte) 100, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[1, 0, -1]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[1, 0]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[1, 0]");
    }

    @Test
    public void test2027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2027");
        int[] intArray2 = new int[] { ' ', 0 };
        int[] intArray5 = ds.MaxMin4.maxMin4(intArray2, (int) (byte) 1, (int) (short) 1);
        int[] intArray8 = ds.MaxMin4.maxMin4(intArray2, 0, (int) (byte) 0);
        int[] intArray11 = ds.MaxMin4.maxMin4(intArray8, (int) (byte) 0, (int) (byte) 0);
        int[] intArray14 = ds.MaxMin4.maxMin4(intArray11, (int) (short) 0, 0);
        int[] intArray17 = ds.MaxMin4.maxMin4(intArray14, (int) (byte) 1, (int) (byte) 0);
        int[] intArray20 = ds.MaxMin4.maxMin4(intArray14, 1, (int) (short) 0);
        java.lang.Class<?> wildcardClass21 = intArray14.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[32, 0]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[32, 32]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[32, 32]");
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[32, 32]");
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[32, 32]");
        org.junit.Assert.assertNotNull(intArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray20), "[32, 32]");
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test2028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2028");
        int[] intArray2 = new int[] { ' ', 0 };
        int[] intArray5 = ds.MaxMin4.maxMin4(intArray2, (int) (byte) 1, (int) (short) 1);
        int[] intArray8 = ds.MaxMin4.maxMin4(intArray2, (int) (byte) 0, 0);
        int[] intArray11 = ds.MaxMin4.maxMin4(intArray2, 0, (int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray14 = ds.MaxMin4.maxMin4(intArray2, 100, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[32, 0]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[32, 32]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[32, 32]");
    }

    @Test
    public void test2029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2029");
        int[] intArray2 = new int[] { ' ', 0 };
        int[] intArray5 = ds.MaxMin4.maxMin4(intArray2, (int) (byte) 1, (int) (short) 1);
        int[] intArray8 = ds.MaxMin4.maxMin4(intArray2, 0, (int) (byte) 0);
        int[] intArray11 = ds.MaxMin4.maxMin4(intArray2, 0, 0);
        int[] intArray14 = ds.MaxMin4.maxMin4(intArray11, 1, (int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray17 = ds.MaxMin4.maxMin4(intArray14, 0, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[32, 0]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[32, 32]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[32, 32]");
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[32, 32]");
    }

    @Test
    public void test2030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2030");
        int[] intArray3 = new int[] { 1, 0, (short) -1 };
        int[] intArray6 = ds.MaxMin4.maxMin4(intArray3, 1, (int) (short) 0);
        int[] intArray9 = ds.MaxMin4.maxMin4(intArray6, (int) (byte) 1, 0);
        int[] intArray12 = ds.MaxMin4.maxMin4(intArray9, (int) (byte) 0, 0);
        int[] intArray15 = ds.MaxMin4.maxMin4(intArray12, (int) (short) 0, (int) (byte) 0);
        int[] intArray18 = ds.MaxMin4.maxMin4(intArray15, 0, (int) (short) 0);
        int[] intArray21 = ds.MaxMin4.maxMin4(intArray15, (int) (byte) 0, (int) (byte) 0);
        int[] intArray24 = ds.MaxMin4.maxMin4(intArray21, (int) (short) 0, 1);
        int[] intArray27 = ds.MaxMin4.maxMin4(intArray21, 1, 0);
        int[] intArray30 = ds.MaxMin4.maxMin4(intArray21, 1, 0);
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[1, 0, -1]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[1, 0]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[1, 0]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray18), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray21), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray24), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray27), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray30);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray30), "[1, 1]");
    }

    @Test
    public void test2031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2031");
        int[] intArray2 = new int[] { ' ', 0 };
        int[] intArray5 = ds.MaxMin4.maxMin4(intArray2, (int) (byte) 1, (int) (short) 1);
        int[] intArray8 = ds.MaxMin4.maxMin4(intArray2, 0, (int) (byte) 0);
        int[] intArray11 = ds.MaxMin4.maxMin4(intArray8, (int) (byte) 0, (int) (byte) 0);
        int[] intArray14 = ds.MaxMin4.maxMin4(intArray11, (int) (short) 0, 0);
        int[] intArray17 = ds.MaxMin4.maxMin4(intArray14, (int) (byte) 1, (int) (byte) 0);
        int[] intArray20 = ds.MaxMin4.maxMin4(intArray14, 1, (int) (short) 0);
        java.lang.Class<?> wildcardClass21 = intArray20.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[32, 0]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[32, 32]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[32, 32]");
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[32, 32]");
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[32, 32]");
        org.junit.Assert.assertNotNull(intArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray20), "[32, 32]");
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test2032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2032");
        int[] intArray3 = new int[] { 1, 0, (short) -1 };
        int[] intArray6 = ds.MaxMin4.maxMin4(intArray3, 1, (int) (short) 0);
        int[] intArray9 = ds.MaxMin4.maxMin4(intArray6, (int) (byte) 1, 0);
        int[] intArray12 = ds.MaxMin4.maxMin4(intArray9, (int) (byte) 0, 0);
        int[] intArray15 = ds.MaxMin4.maxMin4(intArray12, (int) (short) 0, (int) (byte) 0);
        int[] intArray18 = ds.MaxMin4.maxMin4(intArray15, (int) (short) 1, 0);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray21 = ds.MaxMin4.maxMin4(intArray15, (int) (short) -1, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[1, 0, -1]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[1, 0]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[1, 0]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray18), "[1, 1]");
    }

    @Test
    public void test2033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2033");
        int[] intArray2 = new int[] { ' ', 0 };
        int[] intArray5 = ds.MaxMin4.maxMin4(intArray2, (int) (byte) 1, (int) (short) 1);
        int[] intArray8 = ds.MaxMin4.maxMin4(intArray5, 0, 1);
        int[] intArray11 = ds.MaxMin4.maxMin4(intArray8, (int) (byte) 0, (int) (byte) 0);
        int[] intArray14 = ds.MaxMin4.maxMin4(intArray8, 0, 0);
        int[] intArray17 = ds.MaxMin4.maxMin4(intArray14, (int) (short) 0, 0);
        java.lang.Class<?> wildcardClass18 = intArray17.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[32, 0]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[0, 0]");
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test2034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2034");
        int[] intArray3 = new int[] { 1, 0, (short) -1 };
        int[] intArray6 = ds.MaxMin4.maxMin4(intArray3, 1, (int) (short) 0);
        int[] intArray9 = ds.MaxMin4.maxMin4(intArray6, (int) (byte) 1, 0);
        int[] intArray12 = ds.MaxMin4.maxMin4(intArray9, 0, 0);
        int[] intArray15 = ds.MaxMin4.maxMin4(intArray9, 0, (int) (byte) 0);
        int[] intArray18 = ds.MaxMin4.maxMin4(intArray15, (int) (short) 0, (int) (short) 1);
        int[] intArray21 = ds.MaxMin4.maxMin4(intArray15, (int) (byte) 0, (int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray24 = ds.MaxMin4.maxMin4(intArray15, (int) (byte) 0, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[1, 0, -1]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[1, 0]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[1, 0]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray18), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray21), "[1, 1]");
    }

    @Test
    public void test2035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2035");
        int[] intArray0 = null;
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray3 = ds.MaxMin4.maxMin4(intArray0, (int) 'a', (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2036");
        int[] intArray2 = new int[] { ' ', 0 };
        int[] intArray5 = ds.MaxMin4.maxMin4(intArray2, (int) (byte) 1, (int) (short) 1);
        int[] intArray8 = ds.MaxMin4.maxMin4(intArray5, 0, 1);
        int[] intArray11 = ds.MaxMin4.maxMin4(intArray5, 0, 0);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray14 = ds.MaxMin4.maxMin4(intArray5, (int) (short) 1, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[32, 0]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[0, 0]");
    }

    @Test
    public void test2037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2037");
        int[] intArray3 = new int[] { 1, 0, (short) -1 };
        int[] intArray6 = ds.MaxMin4.maxMin4(intArray3, 1, (int) (short) 0);
        int[] intArray9 = ds.MaxMin4.maxMin4(intArray6, (int) (byte) 1, 0);
        int[] intArray12 = ds.MaxMin4.maxMin4(intArray9, (int) (byte) 0, 0);
        int[] intArray15 = ds.MaxMin4.maxMin4(intArray12, (int) (short) 0, (int) (byte) 0);
        int[] intArray18 = ds.MaxMin4.maxMin4(intArray12, (int) (short) 1, (int) (short) 1);
        int[] intArray21 = ds.MaxMin4.maxMin4(intArray12, (int) (byte) 1, (int) (short) 0);
        int[] intArray24 = ds.MaxMin4.maxMin4(intArray21, 0, (int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray27 = ds.MaxMin4.maxMin4(intArray24, (-1), 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[1, 0, -1]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[1, 0]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[1, 0]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray18), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray21), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray24), "[1, 1]");
    }

    @Test
    public void test2038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2038");
        int[] intArray2 = new int[] { ' ', 0 };
        int[] intArray5 = ds.MaxMin4.maxMin4(intArray2, (int) (byte) 1, (int) (short) 1);
        int[] intArray8 = ds.MaxMin4.maxMin4(intArray2, 0, (int) (byte) 0);
        int[] intArray11 = ds.MaxMin4.maxMin4(intArray8, 0, (int) (short) 0);
        int[] intArray14 = ds.MaxMin4.maxMin4(intArray11, 0, 1);
        int[] intArray17 = ds.MaxMin4.maxMin4(intArray14, (int) (short) 0, 0);
        int[] intArray20 = ds.MaxMin4.maxMin4(intArray14, 0, 0);
        int[] intArray23 = ds.MaxMin4.maxMin4(intArray20, 0, 1);
        int[] intArray26 = ds.MaxMin4.maxMin4(intArray20, (int) (short) 1, (int) (short) 0);
        int[] intArray29 = ds.MaxMin4.maxMin4(intArray20, 0, 1);
        java.lang.Class<?> wildcardClass30 = intArray29.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[32, 0]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[32, 32]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[32, 32]");
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[32, 32]");
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[32, 32]");
        org.junit.Assert.assertNotNull(intArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray20), "[32, 32]");
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray23), "[32, 32]");
        org.junit.Assert.assertNotNull(intArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray26), "[32, 32]");
        org.junit.Assert.assertNotNull(intArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray29), "[32, 32]");
        org.junit.Assert.assertNotNull(wildcardClass30);
    }

    @Test
    public void test2039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2039");
        int[] intArray3 = new int[] { 1, 0, (short) -1 };
        int[] intArray6 = ds.MaxMin4.maxMin4(intArray3, 1, (int) (short) 0);
        int[] intArray9 = ds.MaxMin4.maxMin4(intArray6, (int) (byte) 1, 0);
        int[] intArray12 = ds.MaxMin4.maxMin4(intArray9, 0, 0);
        int[] intArray15 = ds.MaxMin4.maxMin4(intArray9, 0, (int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray18 = ds.MaxMin4.maxMin4(intArray15, (int) (short) 0, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[1, 0, -1]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[1, 0]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[1, 0]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[1, 1]");
    }

    @Test
    public void test2040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2040");
        int[] intArray3 = new int[] { 1, 0, (short) -1 };
        int[] intArray6 = ds.MaxMin4.maxMin4(intArray3, 1, (int) (short) 0);
        int[] intArray9 = ds.MaxMin4.maxMin4(intArray6, (int) (byte) 1, 0);
        int[] intArray12 = ds.MaxMin4.maxMin4(intArray9, (int) (byte) 0, 0);
        int[] intArray15 = ds.MaxMin4.maxMin4(intArray12, (int) (short) 0, (int) (byte) 0);
        int[] intArray18 = ds.MaxMin4.maxMin4(intArray15, 1, (int) (byte) 0);
        int[] intArray21 = ds.MaxMin4.maxMin4(intArray18, (int) (byte) 0, (int) (byte) 1);
        int[] intArray24 = ds.MaxMin4.maxMin4(intArray18, (int) (byte) 1, (int) (byte) 0);
        int[] intArray27 = ds.MaxMin4.maxMin4(intArray18, (int) (short) 1, (int) (short) 0);
        int[] intArray30 = ds.MaxMin4.maxMin4(intArray27, (int) (byte) 1, 1);
        java.lang.Class<?> wildcardClass31 = intArray27.getClass();
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[1, 0, -1]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[1, 0]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[1, 0]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray18), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray21), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray24), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray27), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray30);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray30), "[1, 1]");
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test2041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2041");
        int[] intArray5 = new int[] { 'a', (byte) 100, '#', (byte) 0, ' ' };
        int[] intArray8 = ds.MaxMin4.maxMin4(intArray5, 0, 0);
        int[] intArray11 = ds.MaxMin4.maxMin4(intArray5, (int) (short) 0, 0);
        int[] intArray14 = ds.MaxMin4.maxMin4(intArray11, 1, (int) (byte) 0);
        int[] intArray17 = ds.MaxMin4.maxMin4(intArray14, 1, 1);
        int[] intArray20 = ds.MaxMin4.maxMin4(intArray17, (int) (short) 0, (int) (byte) 1);
        int[] intArray23 = ds.MaxMin4.maxMin4(intArray17, 1, 0);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray26 = ds.MaxMin4.maxMin4(intArray23, (int) (short) 1, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[97, 100, 35, 0, 32]");
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[97, 97]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[97, 97]");
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[97, 97]");
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[97, 97]");
        org.junit.Assert.assertNotNull(intArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray20), "[97, 97]");
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray23), "[97, 97]");
    }

    @Test
    public void test2042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2042");
        int[] intArray3 = new int[] { 1, 0, (short) -1 };
        int[] intArray6 = ds.MaxMin4.maxMin4(intArray3, 1, (int) (short) 0);
        int[] intArray9 = ds.MaxMin4.maxMin4(intArray6, (int) (byte) 1, 0);
        int[] intArray12 = ds.MaxMin4.maxMin4(intArray9, 0, (int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray15 = ds.MaxMin4.maxMin4(intArray9, (-1), (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[1, 0, -1]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[1, 0]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[1, 0]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[1, 0]");
    }

    @Test
    public void test2043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2043");
        int[] intArray2 = new int[] { ' ', 0 };
        int[] intArray5 = ds.MaxMin4.maxMin4(intArray2, (int) (byte) 1, (int) (short) 1);
        int[] intArray8 = ds.MaxMin4.maxMin4(intArray5, 0, 1);
        int[] intArray11 = ds.MaxMin4.maxMin4(intArray8, (int) (byte) 0, (int) (byte) 0);
        int[] intArray14 = ds.MaxMin4.maxMin4(intArray11, 0, (int) (short) 0);
        int[] intArray17 = ds.MaxMin4.maxMin4(intArray14, (int) (byte) 0, 1);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray20 = ds.MaxMin4.maxMin4(intArray14, (int) (byte) 100, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[32, 0]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[0, 0]");
    }

    @Test
    public void test2044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2044");
        int[] intArray3 = new int[] { 1, 0, (short) -1 };
        int[] intArray6 = ds.MaxMin4.maxMin4(intArray3, 1, (int) (short) 0);
        int[] intArray9 = ds.MaxMin4.maxMin4(intArray6, (int) (byte) 1, 0);
        int[] intArray12 = ds.MaxMin4.maxMin4(intArray9, 0, (int) (byte) 1);
        int[] intArray15 = ds.MaxMin4.maxMin4(intArray9, 0, (int) (short) 1);
        int[] intArray18 = ds.MaxMin4.maxMin4(intArray9, (int) (byte) 1, 0);
        int[] intArray21 = ds.MaxMin4.maxMin4(intArray9, (int) (short) 0, (int) (short) 1);
        int[] intArray24 = ds.MaxMin4.maxMin4(intArray21, 1, 1);
        int[] intArray27 = ds.MaxMin4.maxMin4(intArray21, 0, 0);
        int[] intArray30 = ds.MaxMin4.maxMin4(intArray27, 1, 0);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray33 = ds.MaxMin4.maxMin4(intArray30, (int) (short) -1, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[1, 0, -1]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[1, 0]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[1, 0]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[1, 0]");
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[1, 0]");
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray18), "[1, 0]");
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray21), "[1, 0]");
        org.junit.Assert.assertNotNull(intArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray24), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray27), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray30);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray30), "[1, 1]");
    }

    @Test
    public void test2045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2045");
        int[] intArray5 = new int[] { 'a', (byte) 100, '#', (byte) 0, ' ' };
        int[] intArray8 = ds.MaxMin4.maxMin4(intArray5, 0, 0);
        int[] intArray11 = ds.MaxMin4.maxMin4(intArray5, (int) (short) 0, 0);
        int[] intArray14 = ds.MaxMin4.maxMin4(intArray11, 1, (int) (byte) 0);
        int[] intArray17 = ds.MaxMin4.maxMin4(intArray11, 0, 0);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray20 = ds.MaxMin4.maxMin4(intArray11, (int) (byte) 10, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[97, 100, 35, 0, 32]");
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[97, 97]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[97, 97]");
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[97, 97]");
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[97, 97]");
    }

    @Test
    public void test2046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2046");
        int[] intArray2 = new int[] { ' ', 0 };
        int[] intArray5 = ds.MaxMin4.maxMin4(intArray2, (int) (byte) 1, (int) (short) 1);
        int[] intArray8 = ds.MaxMin4.maxMin4(intArray5, 0, 1);
        int[] intArray11 = ds.MaxMin4.maxMin4(intArray8, (int) (byte) 0, (int) (byte) 0);
        int[] intArray14 = ds.MaxMin4.maxMin4(intArray8, 0, 0);
        int[] intArray17 = ds.MaxMin4.maxMin4(intArray14, (int) (short) 0, 0);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray20 = ds.MaxMin4.maxMin4(intArray17, 0, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[32, 0]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[0, 0]");
    }

    @Test
    public void test2047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2047");
        int[] intArray2 = new int[] { ' ', 0 };
        int[] intArray5 = ds.MaxMin4.maxMin4(intArray2, (int) (byte) 1, (int) (short) 1);
        int[] intArray8 = ds.MaxMin4.maxMin4(intArray2, 0, (int) (byte) 0);
        int[] intArray11 = ds.MaxMin4.maxMin4(intArray8, (int) (byte) 0, (int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray14 = ds.MaxMin4.maxMin4(intArray11, (int) (short) -1, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[32, 0]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[32, 32]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[32, 32]");
    }

    @Test
    public void test2048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2048");
        int[] intArray2 = new int[] { ' ', 0 };
        int[] intArray5 = ds.MaxMin4.maxMin4(intArray2, (int) (byte) 1, (int) (short) 1);
        int[] intArray8 = ds.MaxMin4.maxMin4(intArray2, 0, (int) (byte) 0);
        int[] intArray11 = ds.MaxMin4.maxMin4(intArray8, (int) (byte) 0, (int) (byte) 0);
        int[] intArray14 = ds.MaxMin4.maxMin4(intArray11, (int) (short) 0, 0);
        int[] intArray17 = ds.MaxMin4.maxMin4(intArray14, (int) (byte) 1, (int) (byte) 0);
        int[] intArray20 = ds.MaxMin4.maxMin4(intArray17, (int) (short) 1, 0);
        int[] intArray23 = ds.MaxMin4.maxMin4(intArray17, (int) (short) 1, (int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray26 = ds.MaxMin4.maxMin4(intArray23, (int) (short) -1, (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[32, 0]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[32, 32]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[32, 32]");
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[32, 32]");
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[32, 32]");
        org.junit.Assert.assertNotNull(intArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray20), "[32, 32]");
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray23), "[32, 32]");
    }

    @Test
    public void test2049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2049");
        int[] intArray3 = new int[] { 1, 0, (short) -1 };
        int[] intArray6 = ds.MaxMin4.maxMin4(intArray3, 1, (int) (short) 0);
        int[] intArray9 = ds.MaxMin4.maxMin4(intArray6, (int) (byte) 1, 0);
        int[] intArray12 = ds.MaxMin4.maxMin4(intArray9, (int) (byte) 0, 0);
        int[] intArray15 = ds.MaxMin4.maxMin4(intArray12, (int) (short) 0, (int) (byte) 0);
        int[] intArray18 = ds.MaxMin4.maxMin4(intArray15, 1, (int) (byte) 0);
        int[] intArray21 = ds.MaxMin4.maxMin4(intArray18, (int) (byte) 0, (int) (byte) 1);
        int[] intArray24 = ds.MaxMin4.maxMin4(intArray18, (int) (byte) 1, (int) (byte) 0);
        int[] intArray27 = ds.MaxMin4.maxMin4(intArray18, (int) (short) 1, (int) (short) 0);
        int[] intArray30 = ds.MaxMin4.maxMin4(intArray27, (int) (byte) 1, 1);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray33 = ds.MaxMin4.maxMin4(intArray27, (int) (short) -1, (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[1, 0, -1]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[1, 0]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[1, 0]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray18), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray21), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray24), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray27), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray30);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray30), "[1, 1]");
    }

    @Test
    public void test2050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2050");
        int[] intArray3 = new int[] { 1, 0, (short) -1 };
        int[] intArray6 = ds.MaxMin4.maxMin4(intArray3, 1, (int) (short) 0);
        int[] intArray9 = ds.MaxMin4.maxMin4(intArray6, (int) (byte) 1, 0);
        int[] intArray12 = ds.MaxMin4.maxMin4(intArray9, (int) (byte) 0, 0);
        int[] intArray15 = ds.MaxMin4.maxMin4(intArray12, (int) (short) 1, 0);
        int[] intArray18 = ds.MaxMin4.maxMin4(intArray15, (int) (short) 1, 1);
        java.lang.Class<?> wildcardClass19 = intArray18.getClass();
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[1, 0, -1]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[1, 0]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[1, 0]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray18), "[1, 1]");
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test2051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2051");
        int[] intArray2 = new int[] { ' ', 0 };
        int[] intArray5 = ds.MaxMin4.maxMin4(intArray2, (int) (byte) 1, (int) (short) 1);
        int[] intArray8 = ds.MaxMin4.maxMin4(intArray2, 0, (int) (byte) 0);
        int[] intArray11 = ds.MaxMin4.maxMin4(intArray8, (int) (byte) 0, (int) (byte) 0);
        int[] intArray14 = ds.MaxMin4.maxMin4(intArray11, (int) (short) 0, 0);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray17 = ds.MaxMin4.maxMin4(intArray14, (int) '#', 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[32, 0]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[32, 32]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[32, 32]");
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[32, 32]");
    }

    @Test
    public void test2052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2052");
        int[] intArray3 = new int[] { 1, 0, (short) -1 };
        int[] intArray6 = ds.MaxMin4.maxMin4(intArray3, 1, (int) (short) 0);
        int[] intArray9 = ds.MaxMin4.maxMin4(intArray6, (int) (byte) 1, 0);
        int[] intArray12 = ds.MaxMin4.maxMin4(intArray9, (int) (byte) 0, 0);
        int[] intArray15 = ds.MaxMin4.maxMin4(intArray12, (int) (short) 0, (int) (byte) 0);
        int[] intArray18 = ds.MaxMin4.maxMin4(intArray12, (int) (short) 1, (int) (short) 1);
        int[] intArray21 = ds.MaxMin4.maxMin4(intArray12, (int) (byte) 1, (int) (short) 0);
        int[] intArray24 = ds.MaxMin4.maxMin4(intArray21, 0, 1);
        int[] intArray27 = ds.MaxMin4.maxMin4(intArray21, (int) (short) 1, (int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray30 = ds.MaxMin4.maxMin4(intArray21, (int) (byte) 1, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[1, 0, -1]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[1, 0]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[1, 0]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray18), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray21), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray24), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray27), "[1, 1]");
    }

    @Test
    public void test2053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2053");
        int[] intArray2 = new int[] { ' ', 0 };
        int[] intArray5 = ds.MaxMin4.maxMin4(intArray2, (int) (byte) 1, (int) (short) 1);
        int[] intArray8 = ds.MaxMin4.maxMin4(intArray2, 0, (int) (byte) 0);
        int[] intArray11 = ds.MaxMin4.maxMin4(intArray8, (int) (byte) 0, (int) (byte) 0);
        int[] intArray14 = ds.MaxMin4.maxMin4(intArray8, (int) (byte) 1, (int) (short) 0);
        int[] intArray17 = ds.MaxMin4.maxMin4(intArray14, 0, 1);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray20 = ds.MaxMin4.maxMin4(intArray14, (int) (short) 0, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[32, 0]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[32, 32]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[32, 32]");
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[32, 32]");
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[32, 32]");
    }

    @Test
    public void test2054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2054");
        int[] intArray3 = new int[] { 1, 0, (short) -1 };
        int[] intArray6 = ds.MaxMin4.maxMin4(intArray3, 1, (int) (short) 0);
        int[] intArray9 = ds.MaxMin4.maxMin4(intArray6, (int) (byte) 1, 0);
        int[] intArray12 = ds.MaxMin4.maxMin4(intArray9, 0, (int) (byte) 1);
        int[] intArray15 = ds.MaxMin4.maxMin4(intArray9, 0, (int) (short) 1);
        int[] intArray18 = ds.MaxMin4.maxMin4(intArray9, (int) (byte) 1, 0);
        int[] intArray21 = ds.MaxMin4.maxMin4(intArray9, (int) (short) 0, (int) (short) 1);
        int[] intArray24 = ds.MaxMin4.maxMin4(intArray21, 1, 0);
        int[] intArray27 = ds.MaxMin4.maxMin4(intArray24, (int) (byte) 0, (int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray30 = ds.MaxMin4.maxMin4(intArray24, (int) 'a', (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[1, 0, -1]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[1, 0]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[1, 0]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[1, 0]");
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[1, 0]");
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray18), "[1, 0]");
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray21), "[1, 0]");
        org.junit.Assert.assertNotNull(intArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray24), "[1, 0]");
        org.junit.Assert.assertNotNull(intArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray27), "[1, 0]");
    }

    @Test
    public void test2055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2055");
        int[] intArray6 = new int[] { 1, (short) -1, 100, (short) -1, (byte) 100, 100 };
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray9 = ds.MaxMin4.maxMin4(intArray6, (int) (short) 1, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[1, -1, 100, -1, 100, 100]");
    }

    @Test
    public void test2056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2056");
        int[] intArray2 = new int[] { ' ', 0 };
        int[] intArray5 = ds.MaxMin4.maxMin4(intArray2, (int) (byte) 1, (int) (short) 1);
        int[] intArray8 = ds.MaxMin4.maxMin4(intArray2, (int) (byte) 0, 0);
        int[] intArray11 = ds.MaxMin4.maxMin4(intArray2, 0, (int) (short) 0);
        int[] intArray14 = ds.MaxMin4.maxMin4(intArray2, (int) (byte) 1, (int) (short) 1);
        int[] intArray17 = ds.MaxMin4.maxMin4(intArray14, (int) (short) 1, 0);
        int[] intArray20 = ds.MaxMin4.maxMin4(intArray17, (int) (short) 0, (int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray23 = ds.MaxMin4.maxMin4(intArray20, (int) 'a', 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[32, 0]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[32, 32]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[32, 32]");
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray20), "[0, 0]");
    }

    @Test
    public void test2057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2057");
        int[] intArray3 = new int[] { 1, 0, (short) -1 };
        int[] intArray6 = ds.MaxMin4.maxMin4(intArray3, 1, (int) (short) 0);
        int[] intArray9 = ds.MaxMin4.maxMin4(intArray6, (int) (byte) 1, 0);
        int[] intArray12 = ds.MaxMin4.maxMin4(intArray9, (int) (byte) 0, 0);
        int[] intArray15 = ds.MaxMin4.maxMin4(intArray12, 1, (int) (short) 1);
        int[] intArray18 = ds.MaxMin4.maxMin4(intArray15, (int) (short) 0, 0);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray21 = ds.MaxMin4.maxMin4(intArray18, (int) (byte) 100, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[1, 0, -1]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[1, 0]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[1, 0]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray18), "[1, 1]");
    }

    @Test
    public void test2058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2058");
        int[] intArray5 = new int[] { 'a', (byte) 100, '#', (byte) 0, ' ' };
        int[] intArray8 = ds.MaxMin4.maxMin4(intArray5, 0, 0);
        int[] intArray11 = ds.MaxMin4.maxMin4(intArray5, (int) (short) 0, 0);
        int[] intArray14 = ds.MaxMin4.maxMin4(intArray11, 1, (int) (byte) 0);
        int[] intArray17 = ds.MaxMin4.maxMin4(intArray14, 1, 1);
        int[] intArray20 = ds.MaxMin4.maxMin4(intArray17, (int) (short) 0, (int) (byte) 1);
        int[] intArray23 = ds.MaxMin4.maxMin4(intArray17, 1, 0);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray26 = ds.MaxMin4.maxMin4(intArray17, (int) (byte) -1, (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[97, 100, 35, 0, 32]");
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[97, 97]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[97, 97]");
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[97, 97]");
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[97, 97]");
        org.junit.Assert.assertNotNull(intArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray20), "[97, 97]");
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray23), "[97, 97]");
    }

    @Test
    public void test2059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2059");
        int[] intArray2 = new int[] { ' ', 0 };
        int[] intArray5 = ds.MaxMin4.maxMin4(intArray2, (int) (byte) 1, (int) (short) 1);
        int[] intArray8 = ds.MaxMin4.maxMin4(intArray2, (int) (byte) 0, 1);
        int[] intArray11 = ds.MaxMin4.maxMin4(intArray8, 0, 0);
        int[] intArray14 = ds.MaxMin4.maxMin4(intArray11, (int) (short) 0, 1);
        int[] intArray17 = ds.MaxMin4.maxMin4(intArray11, (int) (byte) 0, 1);
        int[] intArray20 = ds.MaxMin4.maxMin4(intArray17, (int) (short) 1, 0);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[32, 0]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[32, 0]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[32, 32]");
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[32, 32]");
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[32, 32]");
        org.junit.Assert.assertNotNull(intArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray20), "[32, 32]");
    }

    @Test
    public void test2060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2060");
        int[] intArray3 = new int[] { 1, 0, (short) -1 };
        int[] intArray6 = ds.MaxMin4.maxMin4(intArray3, 1, (int) (short) 0);
        int[] intArray9 = ds.MaxMin4.maxMin4(intArray6, (int) (byte) 1, 0);
        int[] intArray12 = ds.MaxMin4.maxMin4(intArray9, 0, (int) (byte) 1);
        int[] intArray15 = ds.MaxMin4.maxMin4(intArray9, 0, (int) (short) 1);
        int[] intArray18 = ds.MaxMin4.maxMin4(intArray9, (int) (byte) 1, 0);
        int[] intArray21 = ds.MaxMin4.maxMin4(intArray9, (int) (short) 0, (int) (short) 1);
        int[] intArray24 = ds.MaxMin4.maxMin4(intArray21, 1, 0);
        int[] intArray27 = ds.MaxMin4.maxMin4(intArray24, (int) (byte) 0, (int) (short) 1);
        int[] intArray30 = ds.MaxMin4.maxMin4(intArray24, (int) (byte) 1, (int) (byte) 0);
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[1, 0, -1]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[1, 0]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[1, 0]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[1, 0]");
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[1, 0]");
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray18), "[1, 0]");
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray21), "[1, 0]");
        org.junit.Assert.assertNotNull(intArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray24), "[1, 0]");
        org.junit.Assert.assertNotNull(intArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray27), "[1, 0]");
        org.junit.Assert.assertNotNull(intArray30);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray30), "[1, 0]");
    }

    @Test
    public void test2061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2061");
        int[] intArray2 = new int[] { ' ', 0 };
        int[] intArray5 = ds.MaxMin4.maxMin4(intArray2, (int) (byte) 1, (int) (short) 1);
        int[] intArray8 = ds.MaxMin4.maxMin4(intArray2, 0, (int) (byte) 0);
        int[] intArray11 = ds.MaxMin4.maxMin4(intArray2, 0, 0);
        int[] intArray14 = ds.MaxMin4.maxMin4(intArray11, 1, (int) (short) 0);
        int[] intArray17 = ds.MaxMin4.maxMin4(intArray14, (int) (short) 1, 0);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray20 = ds.MaxMin4.maxMin4(intArray14, (int) '4', (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[32, 0]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[32, 32]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[32, 32]");
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[32, 32]");
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[32, 32]");
    }

    @Test
    public void test2062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2062");
        int[] intArray3 = new int[] { 1, 0, (short) -1 };
        int[] intArray6 = ds.MaxMin4.maxMin4(intArray3, 1, (int) (short) 0);
        int[] intArray9 = ds.MaxMin4.maxMin4(intArray6, (int) (byte) 1, 0);
        int[] intArray12 = ds.MaxMin4.maxMin4(intArray9, (int) (byte) 0, 0);
        int[] intArray15 = ds.MaxMin4.maxMin4(intArray12, (int) (short) 0, (int) (byte) 0);
        int[] intArray18 = ds.MaxMin4.maxMin4(intArray15, 0, (int) (short) 0);
        int[] intArray21 = ds.MaxMin4.maxMin4(intArray15, (int) (byte) 0, 0);
        int[] intArray24 = ds.MaxMin4.maxMin4(intArray15, (int) (short) 0, (int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray27 = ds.MaxMin4.maxMin4(intArray15, (int) ' ', (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[1, 0, -1]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[1, 0]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[1, 0]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray18), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray21), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray24), "[1, 1]");
    }

    @Test
    public void test2063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2063");
        int[] intArray2 = new int[] { ' ', 0 };
        int[] intArray5 = ds.MaxMin4.maxMin4(intArray2, (int) (byte) 1, (int) (short) 1);
        int[] intArray8 = ds.MaxMin4.maxMin4(intArray2, 0, (int) (byte) 0);
        int[] intArray11 = ds.MaxMin4.maxMin4(intArray8, (int) (byte) 0, (int) (byte) 0);
        int[] intArray14 = ds.MaxMin4.maxMin4(intArray11, (int) (short) 0, 0);
        int[] intArray17 = ds.MaxMin4.maxMin4(intArray14, (int) (byte) 1, (int) (byte) 0);
        int[] intArray20 = ds.MaxMin4.maxMin4(intArray17, (int) (byte) 1, 1);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[32, 0]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[32, 32]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[32, 32]");
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[32, 32]");
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[32, 32]");
        org.junit.Assert.assertNotNull(intArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray20), "[32, 32]");
    }

    @Test
    public void test2064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2064");
        int[] intArray3 = new int[] { 1, 0, (short) -1 };
        int[] intArray6 = ds.MaxMin4.maxMin4(intArray3, 1, (int) (short) 0);
        int[] intArray9 = ds.MaxMin4.maxMin4(intArray6, (int) (short) 0, (int) (short) 0);
        int[] intArray12 = ds.MaxMin4.maxMin4(intArray6, (int) (short) 1, 1);
        int[] intArray15 = ds.MaxMin4.maxMin4(intArray12, (int) (byte) 0, (int) (short) 0);
        int[] intArray18 = ds.MaxMin4.maxMin4(intArray12, (int) (byte) 1, (int) (byte) 1);
        int[] intArray21 = ds.MaxMin4.maxMin4(intArray12, (int) (byte) 1, (int) (byte) 0);
        java.lang.Class<?> wildcardClass22 = intArray12.getClass();
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[1, 0, -1]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[1, 0]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray18), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray21), "[0, 0]");
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test2065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2065");
        int[] intArray3 = new int[] { 1, 0, (short) -1 };
        int[] intArray6 = ds.MaxMin4.maxMin4(intArray3, 1, (int) (short) 0);
        int[] intArray9 = ds.MaxMin4.maxMin4(intArray6, (int) (byte) 1, 0);
        int[] intArray12 = ds.MaxMin4.maxMin4(intArray9, 0, (int) (byte) 1);
        int[] intArray15 = ds.MaxMin4.maxMin4(intArray9, 0, (int) (short) 1);
        int[] intArray18 = ds.MaxMin4.maxMin4(intArray9, (int) (byte) 1, 0);
        int[] intArray21 = ds.MaxMin4.maxMin4(intArray9, (int) (short) 0, (int) (short) 1);
        int[] intArray24 = ds.MaxMin4.maxMin4(intArray21, 1, 0);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray27 = ds.MaxMin4.maxMin4(intArray24, (int) (byte) 100, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[1, 0, -1]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[1, 0]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[1, 0]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[1, 0]");
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[1, 0]");
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray18), "[1, 0]");
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray21), "[1, 0]");
        org.junit.Assert.assertNotNull(intArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray24), "[1, 0]");
    }
}

