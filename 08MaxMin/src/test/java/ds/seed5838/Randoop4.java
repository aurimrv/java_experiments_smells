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
        int[] intArray3 = new int[] { (short) 0, (byte) 100, 1 };
        int[] intArray6 = ds.MaxMin4.maxMin4(intArray3, (int) (byte) 0, 0);
        int[] intArray9 = ds.MaxMin4.maxMin4(intArray3, (int) (short) 1, (int) (byte) 0);
        int[] intArray12 = ds.MaxMin4.maxMin4(intArray3, 1, 1);
        int[] intArray15 = ds.MaxMin4.maxMin4(intArray3, (int) (byte) 0, (int) (short) 0);
        java.lang.Class<?> wildcardClass16 = intArray3.getClass();
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[0, 100, 1]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[100, 0]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[0, 0]");
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test2002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2002");
        int[] intArray3 = new int[] { 100, 1, 10 };
        int[] intArray6 = ds.MaxMin4.maxMin4(intArray3, 0, (int) (short) 1);
        int[] intArray9 = ds.MaxMin4.maxMin4(intArray6, (int) (short) 1, (int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray12 = ds.MaxMin4.maxMin4(intArray6, (int) (byte) 1, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[100, 1, 10]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[100, 1]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[100, 1]");
    }

    @Test
    public void test2003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2003");
        int[] intArray3 = new int[] { (short) 0, (byte) 100, 1 };
        int[] intArray6 = ds.MaxMin4.maxMin4(intArray3, (int) (byte) 0, 0);
        int[] intArray9 = ds.MaxMin4.maxMin4(intArray3, 1, 1);
        int[] intArray12 = ds.MaxMin4.maxMin4(intArray9, (int) (short) 0, (int) (byte) 0);
        int[] intArray15 = ds.MaxMin4.maxMin4(intArray9, (int) (byte) 1, 0);
        int[] intArray18 = ds.MaxMin4.maxMin4(intArray15, (int) (byte) 1, 0);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray21 = ds.MaxMin4.maxMin4(intArray15, 0, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[0, 100, 1]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray18), "[100, 100]");
    }

    @Test
    public void test2004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2004");
        int[] intArray3 = new int[] { (short) 0, (byte) 100, 1 };
        int[] intArray6 = ds.MaxMin4.maxMin4(intArray3, (int) (byte) 0, 0);
        int[] intArray9 = ds.MaxMin4.maxMin4(intArray3, 1, 1);
        int[] intArray12 = ds.MaxMin4.maxMin4(intArray3, 0, 0);
        int[] intArray15 = ds.MaxMin4.maxMin4(intArray3, (int) (byte) 0, (int) (byte) 1);
        int[] intArray18 = ds.MaxMin4.maxMin4(intArray3, (int) (short) 1, (int) (short) 0);
        int[] intArray21 = ds.MaxMin4.maxMin4(intArray3, (int) (byte) 1, 0);
        int[] intArray24 = ds.MaxMin4.maxMin4(intArray21, (int) (short) 0, (int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray27 = ds.MaxMin4.maxMin4(intArray24, (int) (byte) -1, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[0, 100, 1]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[100, 0]");
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray18), "[100, 0]");
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray21), "[100, 0]");
        org.junit.Assert.assertNotNull(intArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray24), "[100, 100]");
    }

    @Test
    public void test2005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2005");
        int[] intArray3 = new int[] { 100, 1, 10 };
        int[] intArray6 = ds.MaxMin4.maxMin4(intArray3, 0, (int) (short) 1);
        int[] intArray9 = ds.MaxMin4.maxMin4(intArray6, (int) (byte) 0, (int) (byte) 0);
        int[] intArray12 = ds.MaxMin4.maxMin4(intArray6, 0, (int) (byte) 1);
        int[] intArray15 = ds.MaxMin4.maxMin4(intArray6, (int) (short) 1, (int) (byte) 0);
        int[] intArray18 = ds.MaxMin4.maxMin4(intArray15, 0, (int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray21 = ds.MaxMin4.maxMin4(intArray15, 0, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[100, 1, 10]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[100, 1]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[100, 1]");
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[100, 1]");
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray18), "[100, 1]");
    }

    @Test
    public void test2006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2006");
        int[] intArray3 = new int[] { (short) 0, (byte) 100, 1 };
        int[] intArray6 = ds.MaxMin4.maxMin4(intArray3, (int) (byte) 0, 0);
        int[] intArray9 = ds.MaxMin4.maxMin4(intArray3, 1, 1);
        int[] intArray12 = ds.MaxMin4.maxMin4(intArray3, 0, 0);
        int[] intArray15 = ds.MaxMin4.maxMin4(intArray12, (int) (byte) 0, (int) (byte) 1);
        int[] intArray18 = ds.MaxMin4.maxMin4(intArray15, (int) (byte) 0, (int) (short) 0);
        java.lang.Class<?> wildcardClass19 = intArray15.getClass();
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[0, 100, 1]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray18), "[0, 0]");
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test2007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2007");
        int[] intArray3 = new int[] { (short) 0, (byte) 100, 1 };
        int[] intArray6 = ds.MaxMin4.maxMin4(intArray3, (int) (byte) 0, 0);
        int[] intArray9 = ds.MaxMin4.maxMin4(intArray3, 1, 1);
        int[] intArray12 = ds.MaxMin4.maxMin4(intArray9, (int) (short) 0, (int) (byte) 0);
        int[] intArray15 = ds.MaxMin4.maxMin4(intArray12, 0, 1);
        int[] intArray18 = ds.MaxMin4.maxMin4(intArray15, (int) (byte) 0, (int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray21 = ds.MaxMin4.maxMin4(intArray15, 0, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[0, 100, 1]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray18), "[100, 100]");
    }

    @Test
    public void test2008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2008");
        int[] intArray3 = new int[] { (short) 0, (byte) 100, 1 };
        int[] intArray6 = ds.MaxMin4.maxMin4(intArray3, (int) (byte) 0, 0);
        int[] intArray9 = ds.MaxMin4.maxMin4(intArray3, 0, (int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray12 = ds.MaxMin4.maxMin4(intArray9, 10, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[0, 100, 1]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[0, 0]");
    }

    @Test
    public void test2009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2009");
        int[] intArray3 = new int[] { 100, 1, 10 };
        int[] intArray6 = ds.MaxMin4.maxMin4(intArray3, 0, (int) (short) 1);
        int[] intArray9 = ds.MaxMin4.maxMin4(intArray6, (int) (byte) 0, (int) (byte) 0);
        int[] intArray12 = ds.MaxMin4.maxMin4(intArray9, 0, (int) (short) 0);
        int[] intArray15 = ds.MaxMin4.maxMin4(intArray9, (int) (short) 0, (int) (short) 0);
        int[] intArray18 = ds.MaxMin4.maxMin4(intArray15, (int) (short) 0, 1);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray21 = ds.MaxMin4.maxMin4(intArray18, 0, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[100, 1, 10]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[100, 1]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray18), "[100, 100]");
    }

    @Test
    public void test2010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2010");
        int[] intArray3 = new int[] { (short) 0, (byte) 100, 1 };
        int[] intArray6 = ds.MaxMin4.maxMin4(intArray3, (int) (byte) 0, 0);
        int[] intArray9 = ds.MaxMin4.maxMin4(intArray3, 0, (int) (short) 0);
        int[] intArray12 = ds.MaxMin4.maxMin4(intArray3, 0, 0);
        int[] intArray15 = ds.MaxMin4.maxMin4(intArray3, (int) (short) 0, (int) (short) 0);
        int[] intArray18 = ds.MaxMin4.maxMin4(intArray15, (int) (short) 0, 0);
        java.lang.Class<?> wildcardClass19 = intArray15.getClass();
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[0, 100, 1]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray18), "[0, 0]");
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test2011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2011");
        int[] intArray3 = new int[] { (short) 0, (byte) 100, 1 };
        int[] intArray6 = ds.MaxMin4.maxMin4(intArray3, (int) (byte) 0, 0);
        int[] intArray9 = ds.MaxMin4.maxMin4(intArray3, 1, 1);
        int[] intArray12 = ds.MaxMin4.maxMin4(intArray3, 0, 0);
        int[] intArray15 = ds.MaxMin4.maxMin4(intArray12, (int) (byte) 0, (int) (byte) 1);
        int[] intArray18 = ds.MaxMin4.maxMin4(intArray15, (int) (byte) 0, (int) (short) 0);
        int[] intArray21 = ds.MaxMin4.maxMin4(intArray18, (int) (short) 1, (int) (byte) 0);
        java.lang.Class<?> wildcardClass22 = intArray18.getClass();
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[0, 100, 1]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[100, 100]");
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
    public void test2012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2012");
        int[] intArray3 = new int[] { (short) 0, (byte) 100, 1 };
        int[] intArray6 = ds.MaxMin4.maxMin4(intArray3, (int) (byte) 0, 0);
        int[] intArray9 = ds.MaxMin4.maxMin4(intArray6, (int) (short) 0, 0);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray12 = ds.MaxMin4.maxMin4(intArray6, (int) (byte) 1, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[0, 100, 1]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[0, 0]");
    }

    @Test
    public void test2013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2013");
        int[] intArray3 = new int[] { (short) 0, (byte) 100, 1 };
        int[] intArray6 = ds.MaxMin4.maxMin4(intArray3, (int) (byte) 0, 0);
        int[] intArray9 = ds.MaxMin4.maxMin4(intArray3, 0, (int) (short) 0);
        int[] intArray12 = ds.MaxMin4.maxMin4(intArray3, 0, 0);
        int[] intArray15 = ds.MaxMin4.maxMin4(intArray3, (int) (short) 0, (int) (short) 0);
        int[] intArray18 = ds.MaxMin4.maxMin4(intArray15, (int) (short) 0, 0);
        java.lang.Class<?> wildcardClass19 = intArray18.getClass();
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[0, 100, 1]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray18), "[0, 0]");
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test2014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2014");
        int[] intArray3 = new int[] { (short) 0, (byte) 100, 1 };
        int[] intArray6 = ds.MaxMin4.maxMin4(intArray3, (int) (byte) 0, 0);
        int[] intArray9 = ds.MaxMin4.maxMin4(intArray3, 0, (int) (short) 0);
        int[] intArray12 = ds.MaxMin4.maxMin4(intArray9, 1, (int) (byte) 0);
        int[] intArray15 = ds.MaxMin4.maxMin4(intArray9, (int) (byte) 0, (int) (short) 0);
        int[] intArray18 = ds.MaxMin4.maxMin4(intArray9, (int) (byte) 1, (int) (short) 1);
        int[] intArray21 = ds.MaxMin4.maxMin4(intArray9, (int) (byte) 0, 0);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray24 = ds.MaxMin4.maxMin4(intArray21, (int) 'a', (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[0, 100, 1]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray18), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray21), "[0, 0]");
    }

    @Test
    public void test2015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2015");
        int[] intArray3 = new int[] { (short) 0, (byte) 100, 1 };
        int[] intArray6 = ds.MaxMin4.maxMin4(intArray3, (int) (byte) 0, 0);
        int[] intArray9 = ds.MaxMin4.maxMin4(intArray3, (int) (short) 1, (int) (byte) 0);
        int[] intArray12 = ds.MaxMin4.maxMin4(intArray9, 0, (int) (byte) 0);
        int[] intArray15 = ds.MaxMin4.maxMin4(intArray9, 1, 1);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray18 = ds.MaxMin4.maxMin4(intArray9, (int) (byte) -1, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[0, 100, 1]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[100, 0]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[0, 0]");
    }

    @Test
    public void test2016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2016");
        int[] intArray3 = new int[] { (short) 0, (byte) 100, 1 };
        int[] intArray6 = ds.MaxMin4.maxMin4(intArray3, (int) (byte) 0, 0);
        int[] intArray9 = ds.MaxMin4.maxMin4(intArray3, 0, (int) (short) 0);
        int[] intArray12 = ds.MaxMin4.maxMin4(intArray9, (int) (short) 1, (int) (byte) 0);
        int[] intArray15 = ds.MaxMin4.maxMin4(intArray12, 1, (int) (byte) 0);
        int[] intArray18 = ds.MaxMin4.maxMin4(intArray12, 0, (int) (byte) 0);
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[0, 100, 1]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray18), "[0, 0]");
    }

    @Test
    public void test2017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2017");
        int[] intArray3 = new int[] { (short) 0, (byte) 100, 1 };
        int[] intArray6 = ds.MaxMin4.maxMin4(intArray3, (int) (byte) 0, 0);
        int[] intArray9 = ds.MaxMin4.maxMin4(intArray3, (int) (short) 1, (int) (byte) 0);
        int[] intArray12 = ds.MaxMin4.maxMin4(intArray9, (int) (short) 1, (int) (short) 1);
        int[] intArray15 = ds.MaxMin4.maxMin4(intArray9, 0, 0);
        int[] intArray18 = ds.MaxMin4.maxMin4(intArray15, (int) (byte) 1, 0);
        java.lang.Class<?> wildcardClass19 = intArray15.getClass();
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[0, 100, 1]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[100, 0]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray18), "[100, 100]");
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test2018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2018");
        int[] intArray3 = new int[] { 100, 1, 10 };
        int[] intArray6 = ds.MaxMin4.maxMin4(intArray3, 0, (int) (short) 1);
        int[] intArray9 = ds.MaxMin4.maxMin4(intArray3, (int) (byte) 1, 1);
        int[] intArray12 = ds.MaxMin4.maxMin4(intArray3, 0, 0);
        int[] intArray15 = ds.MaxMin4.maxMin4(intArray12, (int) (byte) 1, 0);
        int[] intArray18 = ds.MaxMin4.maxMin4(intArray15, 0, (int) (short) 1);
        int[] intArray21 = ds.MaxMin4.maxMin4(intArray15, (int) (short) 1, 1);
        int[] intArray24 = ds.MaxMin4.maxMin4(intArray21, (int) (short) 1, (int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray27 = ds.MaxMin4.maxMin4(intArray21, (int) '#', (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[100, 1, 10]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[100, 1]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray18), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray21), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray24), "[100, 100]");
    }

    @Test
    public void test2019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2019");
        int[] intArray3 = new int[] { (short) 0, (byte) 100, 1 };
        int[] intArray6 = ds.MaxMin4.maxMin4(intArray3, (int) (byte) 0, 0);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray9 = ds.MaxMin4.maxMin4(intArray3, 0, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[0, 100, 1]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[0, 0]");
    }

    @Test
    public void test2020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2020");
        int[] intArray3 = new int[] { (short) 0, (byte) 100, 1 };
        int[] intArray6 = ds.MaxMin4.maxMin4(intArray3, (int) (byte) 0, 0);
        int[] intArray9 = ds.MaxMin4.maxMin4(intArray3, 0, (int) (short) 0);
        int[] intArray12 = ds.MaxMin4.maxMin4(intArray9, (int) (short) 1, (int) (byte) 0);
        int[] intArray15 = ds.MaxMin4.maxMin4(intArray9, (int) (byte) 0, (int) (byte) 1);
        int[] intArray18 = ds.MaxMin4.maxMin4(intArray9, 0, 0);
        int[] intArray21 = ds.MaxMin4.maxMin4(intArray9, (int) (short) 1, (int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray24 = ds.MaxMin4.maxMin4(intArray9, 10, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[0, 100, 1]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray18), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray21), "[0, 0]");
    }

    @Test
    public void test2021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2021");
        int[] intArray3 = new int[] { (short) 0, (byte) 100, 1 };
        int[] intArray6 = ds.MaxMin4.maxMin4(intArray3, (int) (byte) 0, 0);
        int[] intArray9 = ds.MaxMin4.maxMin4(intArray3, (int) (byte) 1, (int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray12 = ds.MaxMin4.maxMin4(intArray3, (int) (byte) 0, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[0, 100, 1]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[100, 0]");
    }

    @Test
    public void test2022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2022");
        int[] intArray3 = new int[] { (short) 0, (byte) 100, 1 };
        int[] intArray6 = ds.MaxMin4.maxMin4(intArray3, (int) (byte) 0, 0);
        int[] intArray9 = ds.MaxMin4.maxMin4(intArray3, 1, 1);
        int[] intArray12 = ds.MaxMin4.maxMin4(intArray3, 0, 0);
        int[] intArray15 = ds.MaxMin4.maxMin4(intArray3, (int) (byte) 0, (int) (byte) 1);
        int[] intArray18 = ds.MaxMin4.maxMin4(intArray15, (int) (byte) 1, (int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray21 = ds.MaxMin4.maxMin4(intArray15, (int) (short) -1, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[0, 100, 1]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[100, 0]");
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray18), "[0, 0]");
    }

    @Test
    public void test2023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2023");
        int[] intArray3 = new int[] { (short) 0, (byte) 100, 1 };
        int[] intArray6 = ds.MaxMin4.maxMin4(intArray3, (int) (byte) 0, 0);
        int[] intArray9 = ds.MaxMin4.maxMin4(intArray3, 0, (int) (short) 0);
        int[] intArray12 = ds.MaxMin4.maxMin4(intArray9, (int) (byte) 0, (int) (byte) 0);
        int[] intArray15 = ds.MaxMin4.maxMin4(intArray9, 0, 1);
        int[] intArray18 = ds.MaxMin4.maxMin4(intArray9, (int) (short) 1, (int) (short) 0);
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[0, 100, 1]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray18), "[0, 0]");
    }

    @Test
    public void test2024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2024");
        int[] intArray3 = new int[] { 100, 1, 10 };
        int[] intArray6 = ds.MaxMin4.maxMin4(intArray3, 0, (int) (short) 1);
        int[] intArray9 = ds.MaxMin4.maxMin4(intArray6, (int) (byte) 0, (int) (byte) 0);
        int[] intArray12 = ds.MaxMin4.maxMin4(intArray9, 0, (int) (short) 0);
        int[] intArray15 = ds.MaxMin4.maxMin4(intArray12, (int) (short) 0, (int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray18 = ds.MaxMin4.maxMin4(intArray15, (int) (short) 1, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[100, 1, 10]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[100, 1]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[100, 100]");
    }

    @Test
    public void test2025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2025");
        int[] intArray3 = new int[] { (short) 0, (byte) 100, 1 };
        int[] intArray6 = ds.MaxMin4.maxMin4(intArray3, (int) (byte) 0, 0);
        int[] intArray9 = ds.MaxMin4.maxMin4(intArray3, 0, (int) (short) 0);
        int[] intArray12 = ds.MaxMin4.maxMin4(intArray9, (int) (short) 1, (int) (byte) 0);
        int[] intArray15 = ds.MaxMin4.maxMin4(intArray12, 0, (int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray18 = ds.MaxMin4.maxMin4(intArray15, 0, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[0, 100, 1]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[0, 0]");
    }

    @Test
    public void test2026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2026");
        int[] intArray3 = new int[] { 100, 1, 10 };
        int[] intArray6 = ds.MaxMin4.maxMin4(intArray3, 0, (int) (short) 1);
        int[] intArray9 = ds.MaxMin4.maxMin4(intArray6, (int) (byte) 0, (int) (byte) 0);
        int[] intArray12 = ds.MaxMin4.maxMin4(intArray9, 0, (int) (short) 0);
        int[] intArray15 = ds.MaxMin4.maxMin4(intArray9, (int) (short) 0, (int) (short) 0);
        int[] intArray18 = ds.MaxMin4.maxMin4(intArray15, (int) (short) 0, 1);
        java.lang.Class<?> wildcardClass19 = intArray18.getClass();
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[100, 1, 10]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[100, 1]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray18), "[100, 100]");
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test2027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2027");
        int[] intArray3 = new int[] { (short) 0, (byte) 100, 1 };
        int[] intArray6 = ds.MaxMin4.maxMin4(intArray3, (int) (byte) 0, 0);
        int[] intArray9 = ds.MaxMin4.maxMin4(intArray3, (int) (short) 1, (int) (byte) 0);
        int[] intArray12 = ds.MaxMin4.maxMin4(intArray3, 1, 1);
        int[] intArray15 = ds.MaxMin4.maxMin4(intArray12, (int) (short) 0, 1);
        java.lang.Class<?> wildcardClass16 = intArray15.getClass();
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[0, 100, 1]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[100, 0]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[100, 100]");
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test2028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2028");
        int[] intArray3 = new int[] { (short) 0, (byte) 100, 1 };
        int[] intArray6 = ds.MaxMin4.maxMin4(intArray3, (int) (byte) 0, 0);
        int[] intArray9 = ds.MaxMin4.maxMin4(intArray3, 1, 1);
        int[] intArray12 = ds.MaxMin4.maxMin4(intArray9, (int) (short) 0, (int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray15 = ds.MaxMin4.maxMin4(intArray12, (int) (byte) 10, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[0, 100, 1]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[100, 100]");
    }

    @Test
    public void test2029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2029");
        int[] intArray3 = new int[] { 100, 1, 10 };
        int[] intArray6 = ds.MaxMin4.maxMin4(intArray3, 0, (int) (short) 1);
        int[] intArray9 = ds.MaxMin4.maxMin4(intArray3, (int) (byte) 1, 1);
        int[] intArray12 = ds.MaxMin4.maxMin4(intArray3, (int) (byte) 1, (int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray15 = ds.MaxMin4.maxMin4(intArray3, (int) (byte) -1, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[100, 1, 10]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[100, 1]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[100, 1]");
    }

    @Test
    public void test2030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2030");
        int[] intArray3 = new int[] { 100, 1, 10 };
        int[] intArray6 = ds.MaxMin4.maxMin4(intArray3, 0, (int) (short) 1);
        int[] intArray9 = ds.MaxMin4.maxMin4(intArray3, (int) (byte) 1, 1);
        int[] intArray12 = ds.MaxMin4.maxMin4(intArray3, 0, 0);
        int[] intArray15 = ds.MaxMin4.maxMin4(intArray12, (int) (byte) 1, 0);
        int[] intArray18 = ds.MaxMin4.maxMin4(intArray15, 0, (int) (short) 1);
        int[] intArray21 = ds.MaxMin4.maxMin4(intArray15, (int) (short) 1, 1);
        int[] intArray24 = ds.MaxMin4.maxMin4(intArray15, (int) (short) 1, (int) (short) 1);
        int[] intArray27 = ds.MaxMin4.maxMin4(intArray24, (int) (byte) 0, (int) (byte) 1);
        int[] intArray30 = ds.MaxMin4.maxMin4(intArray27, (int) (short) 0, 0);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray33 = ds.MaxMin4.maxMin4(intArray30, (int) (short) 100, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[100, 1, 10]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[100, 1]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray18), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray21), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray24), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray27), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray30);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray30), "[100, 100]");
    }

    @Test
    public void test2031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2031");
        int[] intArray3 = new int[] { (short) 0, (byte) 100, 1 };
        int[] intArray6 = ds.MaxMin4.maxMin4(intArray3, (int) (byte) 0, 0);
        int[] intArray9 = ds.MaxMin4.maxMin4(intArray6, 1, (int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray12 = ds.MaxMin4.maxMin4(intArray6, (int) (short) 10, (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[0, 100, 1]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[0, 0]");
    }

    @Test
    public void test2032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2032");
        int[] intArray3 = new int[] { 100, 1, 10 };
        int[] intArray6 = ds.MaxMin4.maxMin4(intArray3, 0, (int) (short) 1);
        int[] intArray9 = ds.MaxMin4.maxMin4(intArray3, (int) (byte) 1, 1);
        int[] intArray12 = ds.MaxMin4.maxMin4(intArray3, (int) (byte) 0, 0);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray15 = ds.MaxMin4.maxMin4(intArray12, (int) (byte) -1, (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[100, 1, 10]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[100, 1]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[100, 100]");
    }

    @Test
    public void test2033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2033");
        int[] intArray3 = new int[] { (short) 0, (byte) 100, 1 };
        int[] intArray6 = ds.MaxMin4.maxMin4(intArray3, (int) (byte) 0, 0);
        int[] intArray9 = ds.MaxMin4.maxMin4(intArray3, (int) (short) 1, (int) (byte) 0);
        int[] intArray12 = ds.MaxMin4.maxMin4(intArray3, 1, 1);
        int[] intArray15 = ds.MaxMin4.maxMin4(intArray12, (int) (short) 0, 1);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray18 = ds.MaxMin4.maxMin4(intArray12, (int) (byte) 1, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[0, 100, 1]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[100, 0]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[100, 100]");
    }

    @Test
    public void test2034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2034");
        int[] intArray3 = new int[] { (short) 0, (byte) 100, 1 };
        int[] intArray6 = ds.MaxMin4.maxMin4(intArray3, (int) (byte) 0, 0);
        int[] intArray9 = ds.MaxMin4.maxMin4(intArray3, 0, (int) (short) 0);
        int[] intArray12 = ds.MaxMin4.maxMin4(intArray9, 1, (int) (byte) 0);
        int[] intArray15 = ds.MaxMin4.maxMin4(intArray9, (int) (byte) 0, (int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray18 = ds.MaxMin4.maxMin4(intArray15, (int) '#', (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[0, 100, 1]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[0, 0]");
    }

    @Test
    public void test2035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2035");
        int[] intArray3 = new int[] { 100, 1, 10 };
        int[] intArray6 = ds.MaxMin4.maxMin4(intArray3, 0, (int) (short) 1);
        int[] intArray9 = ds.MaxMin4.maxMin4(intArray3, (int) (byte) 1, 1);
        int[] intArray12 = ds.MaxMin4.maxMin4(intArray3, (int) (byte) 0, 0);
        int[] intArray15 = ds.MaxMin4.maxMin4(intArray12, 0, (int) (short) 1);
        int[] intArray18 = ds.MaxMin4.maxMin4(intArray12, (int) (byte) 0, (int) (short) 1);
        java.lang.Class<?> wildcardClass19 = intArray18.getClass();
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[100, 1, 10]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[100, 1]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray18), "[100, 100]");
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test2036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2036");
        int[] intArray3 = new int[] { (short) 0, (byte) 100, 1 };
        int[] intArray6 = ds.MaxMin4.maxMin4(intArray3, (int) (byte) 0, 0);
        int[] intArray9 = ds.MaxMin4.maxMin4(intArray3, (int) (short) 1, (int) (byte) 0);
        int[] intArray12 = ds.MaxMin4.maxMin4(intArray9, 0, (int) (byte) 0);
        int[] intArray15 = ds.MaxMin4.maxMin4(intArray9, 1, 1);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray18 = ds.MaxMin4.maxMin4(intArray9, (int) (short) -1, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[0, 100, 1]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[100, 0]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[0, 0]");
    }

    @Test
    public void test2037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2037");
        int[] intArray3 = new int[] { 100, 1, 10 };
        int[] intArray6 = ds.MaxMin4.maxMin4(intArray3, 0, (int) (short) 1);
        int[] intArray9 = ds.MaxMin4.maxMin4(intArray6, (int) (byte) 0, (int) (byte) 0);
        int[] intArray12 = ds.MaxMin4.maxMin4(intArray9, 0, (int) (short) 0);
        int[] intArray15 = ds.MaxMin4.maxMin4(intArray12, (int) (short) 0, (int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray18 = ds.MaxMin4.maxMin4(intArray15, (int) (byte) 100, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[100, 1, 10]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[100, 1]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[100, 100]");
    }

    @Test
    public void test2038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2038");
        int[] intArray3 = new int[] { (short) 0, (byte) 100, 1 };
        int[] intArray6 = ds.MaxMin4.maxMin4(intArray3, (int) (byte) 0, 0);
        int[] intArray9 = ds.MaxMin4.maxMin4(intArray3, 1, 1);
        int[] intArray12 = ds.MaxMin4.maxMin4(intArray3, 0, 0);
        int[] intArray15 = ds.MaxMin4.maxMin4(intArray3, (int) (byte) 0, (int) (byte) 1);
        int[] intArray18 = ds.MaxMin4.maxMin4(intArray3, (int) (short) 1, (int) (short) 0);
        int[] intArray21 = ds.MaxMin4.maxMin4(intArray3, (int) (byte) 1, 0);
        int[] intArray24 = ds.MaxMin4.maxMin4(intArray3, (int) (short) 0, 0);
        int[] intArray27 = ds.MaxMin4.maxMin4(intArray24, (int) (byte) 0, (int) (byte) 0);
        int[] intArray30 = ds.MaxMin4.maxMin4(intArray27, 1, (int) (short) 0);
        java.lang.Class<?> wildcardClass31 = intArray27.getClass();
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[0, 100, 1]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[100, 0]");
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray18), "[100, 0]");
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray21), "[100, 0]");
        org.junit.Assert.assertNotNull(intArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray24), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray27), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray30);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray30), "[0, 0]");
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test2039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2039");
        int[] intArray3 = new int[] { (short) 0, (byte) 100, 1 };
        int[] intArray6 = ds.MaxMin4.maxMin4(intArray3, (int) (byte) 0, 0);
        int[] intArray9 = ds.MaxMin4.maxMin4(intArray3, 0, (int) (short) 0);
        int[] intArray12 = ds.MaxMin4.maxMin4(intArray9, (int) (byte) 0, (int) (byte) 0);
        int[] intArray15 = ds.MaxMin4.maxMin4(intArray12, 0, (int) (byte) 0);
        int[] intArray18 = ds.MaxMin4.maxMin4(intArray15, 0, 1);
        int[] intArray21 = ds.MaxMin4.maxMin4(intArray18, 0, 0);
        int[] intArray24 = ds.MaxMin4.maxMin4(intArray21, 0, (int) (byte) 1);
        java.lang.Class<?> wildcardClass25 = intArray24.getClass();
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[0, 100, 1]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray18), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray21), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray24), "[0, 0]");
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test2040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2040");
        int[] intArray3 = new int[] { (short) 0, (byte) 100, 1 };
        int[] intArray6 = ds.MaxMin4.maxMin4(intArray3, (int) (byte) 0, 0);
        int[] intArray9 = ds.MaxMin4.maxMin4(intArray3, 0, (int) (short) 0);
        int[] intArray12 = ds.MaxMin4.maxMin4(intArray9, (int) (short) 1, (int) (byte) 0);
        int[] intArray15 = ds.MaxMin4.maxMin4(intArray9, (int) (byte) 0, (int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray18 = ds.MaxMin4.maxMin4(intArray9, (int) (short) -1, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[0, 100, 1]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[0, 0]");
    }

    @Test
    public void test2041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2041");
        int[] intArray3 = new int[] { (short) 0, (byte) 100, 1 };
        int[] intArray6 = ds.MaxMin4.maxMin4(intArray3, (int) (byte) 0, 0);
        int[] intArray9 = ds.MaxMin4.maxMin4(intArray3, 1, 1);
        int[] intArray12 = ds.MaxMin4.maxMin4(intArray9, 1, (int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray15 = ds.MaxMin4.maxMin4(intArray9, (int) (short) -1, 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[0, 100, 1]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[100, 100]");
    }

    @Test
    public void test2042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2042");
        int[] intArray3 = new int[] { (short) 0, (byte) 100, 1 };
        int[] intArray6 = ds.MaxMin4.maxMin4(intArray3, (int) (byte) 0, 0);
        int[] intArray9 = ds.MaxMin4.maxMin4(intArray3, 0, (int) (short) 0);
        int[] intArray12 = ds.MaxMin4.maxMin4(intArray9, (int) (byte) 0, (int) (byte) 0);
        int[] intArray15 = ds.MaxMin4.maxMin4(intArray12, 0, (int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray18 = ds.MaxMin4.maxMin4(intArray12, (int) (byte) -1, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[0, 100, 1]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[0, 0]");
    }

    @Test
    public void test2043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2043");
        int[] intArray3 = new int[] { 100, 1, 10 };
        int[] intArray6 = ds.MaxMin4.maxMin4(intArray3, 0, (int) (short) 1);
        int[] intArray9 = ds.MaxMin4.maxMin4(intArray3, (int) (byte) 1, 1);
        int[] intArray12 = ds.MaxMin4.maxMin4(intArray3, 0, 0);
        int[] intArray15 = ds.MaxMin4.maxMin4(intArray12, (int) (byte) 1, 0);
        int[] intArray18 = ds.MaxMin4.maxMin4(intArray15, 0, (int) (short) 1);
        int[] intArray21 = ds.MaxMin4.maxMin4(intArray15, (int) (short) 1, 1);
        int[] intArray24 = ds.MaxMin4.maxMin4(intArray15, (int) (short) 1, (int) (short) 1);
        int[] intArray27 = ds.MaxMin4.maxMin4(intArray24, (int) (byte) 0, (int) (byte) 1);
        int[] intArray30 = ds.MaxMin4.maxMin4(intArray27, (int) (short) 0, 0);
        int[] intArray33 = ds.MaxMin4.maxMin4(intArray27, (int) (short) 0, (int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray36 = ds.MaxMin4.maxMin4(intArray33, 0, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[100, 1, 10]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[100, 1]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray18), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray21), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray24), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray27), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray30);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray30), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray33);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray33), "[100, 100]");
    }

    @Test
    public void test2044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2044");
        int[] intArray3 = new int[] { 100, 1, 10 };
        int[] intArray6 = ds.MaxMin4.maxMin4(intArray3, 0, (int) (short) 1);
        int[] intArray9 = ds.MaxMin4.maxMin4(intArray6, (int) (short) 0, 0);
        int[] intArray12 = ds.MaxMin4.maxMin4(intArray9, 1, 0);
        int[] intArray15 = ds.MaxMin4.maxMin4(intArray12, (int) (short) 0, (int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray18 = ds.MaxMin4.maxMin4(intArray15, (int) (short) 1, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[100, 1, 10]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[100, 1]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[100, 100]");
    }

    @Test
    public void test2045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2045");
        int[] intArray3 = new int[] { 100, 1, 10 };
        int[] intArray6 = ds.MaxMin4.maxMin4(intArray3, 0, (int) (short) 1);
        int[] intArray9 = ds.MaxMin4.maxMin4(intArray3, (int) (byte) 1, 1);
        int[] intArray12 = ds.MaxMin4.maxMin4(intArray3, 0, 0);
        int[] intArray15 = ds.MaxMin4.maxMin4(intArray12, (int) (byte) 1, 0);
        int[] intArray18 = ds.MaxMin4.maxMin4(intArray15, 0, (int) (short) 1);
        int[] intArray21 = ds.MaxMin4.maxMin4(intArray15, (int) (short) 1, 1);
        int[] intArray24 = ds.MaxMin4.maxMin4(intArray15, (int) (short) 1, (int) (short) 1);
        int[] intArray27 = ds.MaxMin4.maxMin4(intArray24, (int) (byte) 0, (int) (byte) 1);
        int[] intArray30 = ds.MaxMin4.maxMin4(intArray27, (int) (short) 0, (int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray33 = ds.MaxMin4.maxMin4(intArray27, 0, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[100, 1, 10]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[100, 1]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray18), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray21), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray24), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray27), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray30);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray30), "[100, 100]");
    }

    @Test
    public void test2046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2046");
        int[] intArray3 = new int[] { (short) 0, (byte) 100, 1 };
        int[] intArray6 = ds.MaxMin4.maxMin4(intArray3, (int) (byte) 0, 0);
        int[] intArray9 = ds.MaxMin4.maxMin4(intArray3, 1, 1);
        int[] intArray12 = ds.MaxMin4.maxMin4(intArray9, (int) (short) 0, (int) (byte) 0);
        int[] intArray15 = ds.MaxMin4.maxMin4(intArray12, 0, 1);
        int[] intArray18 = ds.MaxMin4.maxMin4(intArray15, (int) (byte) 0, (int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray21 = ds.MaxMin4.maxMin4(intArray15, (int) (byte) 0, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[0, 100, 1]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray18), "[100, 100]");
    }

    @Test
    public void test2047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2047");
        int[] intArray3 = new int[] { (short) 0, (byte) 100, 1 };
        int[] intArray6 = ds.MaxMin4.maxMin4(intArray3, (int) (byte) 0, 0);
        int[] intArray9 = ds.MaxMin4.maxMin4(intArray3, 0, 1);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray12 = ds.MaxMin4.maxMin4(intArray3, (int) (short) 10, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[0, 100, 1]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[100, 0]");
    }

    @Test
    public void test2048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2048");
        int[] intArray3 = new int[] { (short) 0, (byte) 100, 1 };
        int[] intArray6 = ds.MaxMin4.maxMin4(intArray3, (int) (byte) 0, 0);
        int[] intArray9 = ds.MaxMin4.maxMin4(intArray3, 0, (int) (short) 0);
        int[] intArray12 = ds.MaxMin4.maxMin4(intArray9, 1, (int) (byte) 0);
        int[] intArray15 = ds.MaxMin4.maxMin4(intArray9, (int) (byte) 0, (int) (short) 0);
        int[] intArray18 = ds.MaxMin4.maxMin4(intArray9, (int) (byte) 1, (int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray21 = ds.MaxMin4.maxMin4(intArray18, (int) '#', (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[0, 100, 1]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray18), "[0, 0]");
    }

    @Test
    public void test2049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2049");
        int[] intArray3 = new int[] { 100, 1, 10 };
        int[] intArray6 = ds.MaxMin4.maxMin4(intArray3, 0, (int) (short) 1);
        int[] intArray9 = ds.MaxMin4.maxMin4(intArray3, (int) (byte) 1, 1);
        int[] intArray12 = ds.MaxMin4.maxMin4(intArray3, 0, 0);
        int[] intArray15 = ds.MaxMin4.maxMin4(intArray12, (int) (byte) 1, 0);
        int[] intArray18 = ds.MaxMin4.maxMin4(intArray15, 0, (int) (short) 1);
        int[] intArray21 = ds.MaxMin4.maxMin4(intArray15, (int) (short) 1, 1);
        int[] intArray24 = ds.MaxMin4.maxMin4(intArray15, (int) (short) 1, (int) (short) 1);
        int[] intArray27 = ds.MaxMin4.maxMin4(intArray24, (int) (byte) 0, (int) (byte) 1);
        int[] intArray30 = ds.MaxMin4.maxMin4(intArray27, (int) (short) 0, 0);
        int[] intArray33 = ds.MaxMin4.maxMin4(intArray27, (int) (short) 0, (int) (short) 1);
        int[] intArray36 = ds.MaxMin4.maxMin4(intArray33, 0, (int) (short) 0);
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[100, 1, 10]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[100, 1]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray18), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray21), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray24), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray27), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray30);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray30), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray33);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray33), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray36);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray36), "[100, 100]");
    }

    @Test
    public void test2050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2050");
        int[] intArray3 = new int[] { 100, 1, 10 };
        int[] intArray6 = ds.MaxMin4.maxMin4(intArray3, 0, (int) (short) 1);
        int[] intArray9 = ds.MaxMin4.maxMin4(intArray3, (int) (byte) 1, 1);
        int[] intArray12 = ds.MaxMin4.maxMin4(intArray9, (int) (short) 1, (int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray15 = ds.MaxMin4.maxMin4(intArray9, (int) (byte) -1, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[100, 1, 10]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[100, 1]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[1, 1]");
    }

    @Test
    public void test2051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2051");
        int[] intArray3 = new int[] { (short) 0, (byte) 100, 1 };
        int[] intArray6 = ds.MaxMin4.maxMin4(intArray3, (int) (byte) 0, 0);
        int[] intArray9 = ds.MaxMin4.maxMin4(intArray3, 0, (int) (short) 0);
        int[] intArray12 = ds.MaxMin4.maxMin4(intArray9, (int) (byte) 0, (int) (byte) 0);
        int[] intArray15 = ds.MaxMin4.maxMin4(intArray9, 0, 0);
        int[] intArray18 = ds.MaxMin4.maxMin4(intArray9, 1, (int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray21 = ds.MaxMin4.maxMin4(intArray9, (int) 'a', (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[0, 100, 1]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray18), "[0, 0]");
    }

    @Test
    public void test2052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2052");
        int[] intArray3 = new int[] { (short) 0, (byte) 100, 1 };
        int[] intArray6 = ds.MaxMin4.maxMin4(intArray3, (int) (byte) 0, 0);
        int[] intArray9 = ds.MaxMin4.maxMin4(intArray3, 1, 1);
        int[] intArray12 = ds.MaxMin4.maxMin4(intArray9, (int) (short) 0, (int) (byte) 0);
        int[] intArray15 = ds.MaxMin4.maxMin4(intArray9, (int) (byte) 1, 0);
        int[] intArray18 = ds.MaxMin4.maxMin4(intArray15, 1, (int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray21 = ds.MaxMin4.maxMin4(intArray18, (int) (short) 100, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[0, 100, 1]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray18), "[100, 100]");
    }

    @Test
    public void test2053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2053");
        int[] intArray3 = new int[] { (short) 0, (byte) 100, 1 };
        int[] intArray6 = ds.MaxMin4.maxMin4(intArray3, (int) (byte) 0, 0);
        int[] intArray9 = ds.MaxMin4.maxMin4(intArray3, (int) (short) 1, (int) (byte) 0);
        int[] intArray12 = ds.MaxMin4.maxMin4(intArray3, 0, 1);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray15 = ds.MaxMin4.maxMin4(intArray3, (int) (short) 100, (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[0, 100, 1]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[100, 0]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[100, 0]");
    }

    @Test
    public void test2054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2054");
        int[] intArray3 = new int[] { (short) 0, (byte) 100, 1 };
        int[] intArray6 = ds.MaxMin4.maxMin4(intArray3, (int) (byte) 0, 0);
        int[] intArray9 = ds.MaxMin4.maxMin4(intArray3, 0, (int) (short) 0);
        int[] intArray12 = ds.MaxMin4.maxMin4(intArray9, 1, (int) (byte) 0);
        int[] intArray15 = ds.MaxMin4.maxMin4(intArray9, (int) (short) 1, 1);
        int[] intArray18 = ds.MaxMin4.maxMin4(intArray15, 1, 1);
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[0, 100, 1]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray18), "[0, 0]");
    }

    @Test
    public void test2055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2055");
        int[] intArray3 = new int[] { (short) 0, (byte) 100, 1 };
        int[] intArray6 = ds.MaxMin4.maxMin4(intArray3, (int) (byte) 0, 0);
        int[] intArray9 = ds.MaxMin4.maxMin4(intArray3, (int) (short) 1, (int) (byte) 0);
        int[] intArray12 = ds.MaxMin4.maxMin4(intArray9, (int) (short) 1, (int) (short) 1);
        int[] intArray15 = ds.MaxMin4.maxMin4(intArray12, (int) (short) 0, (int) (short) 0);
        java.lang.Class<?> wildcardClass16 = intArray15.getClass();
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[0, 100, 1]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[100, 0]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[0, 0]");
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test2056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2056");
        int[] intArray3 = new int[] { (short) 0, (byte) 100, 1 };
        int[] intArray6 = ds.MaxMin4.maxMin4(intArray3, (int) (byte) 0, 0);
        int[] intArray9 = ds.MaxMin4.maxMin4(intArray3, 1, 1);
        int[] intArray12 = ds.MaxMin4.maxMin4(intArray3, 0, 0);
        int[] intArray15 = ds.MaxMin4.maxMin4(intArray3, 1, (int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray18 = ds.MaxMin4.maxMin4(intArray3, (int) (short) 100, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[0, 100, 1]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[100, 0]");
    }

    @Test
    public void test2057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2057");
        int[] intArray3 = new int[] { 100, 1, 10 };
        int[] intArray6 = ds.MaxMin4.maxMin4(intArray3, 0, (int) (short) 1);
        int[] intArray9 = ds.MaxMin4.maxMin4(intArray3, (int) (byte) 1, 1);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray12 = ds.MaxMin4.maxMin4(intArray3, (int) (byte) -1, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[100, 1, 10]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[100, 1]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[1, 1]");
    }

    @Test
    public void test2058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2058");
        int[] intArray3 = new int[] { 100, 1, 10 };
        int[] intArray6 = ds.MaxMin4.maxMin4(intArray3, 0, (int) (short) 1);
        int[] intArray9 = ds.MaxMin4.maxMin4(intArray3, (int) (byte) 1, 1);
        int[] intArray12 = ds.MaxMin4.maxMin4(intArray3, 0, 0);
        int[] intArray15 = ds.MaxMin4.maxMin4(intArray12, (int) (byte) 1, 0);
        int[] intArray18 = ds.MaxMin4.maxMin4(intArray15, 0, (int) (short) 1);
        int[] intArray21 = ds.MaxMin4.maxMin4(intArray15, (int) (short) 1, 1);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray24 = ds.MaxMin4.maxMin4(intArray15, (int) ' ', (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[100, 1, 10]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[100, 1]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray18), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray21), "[100, 100]");
    }

    @Test
    public void test2059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2059");
        int[] intArray0 = null;
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray3 = ds.MaxMin4.maxMin4(intArray0, (int) (short) 100, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2060");
        int[] intArray3 = new int[] { 100, 1, 10 };
        int[] intArray6 = ds.MaxMin4.maxMin4(intArray3, 0, (int) (short) 1);
        int[] intArray9 = ds.MaxMin4.maxMin4(intArray6, (int) (byte) 0, (int) (byte) 0);
        int[] intArray12 = ds.MaxMin4.maxMin4(intArray6, 0, (int) (byte) 1);
        int[] intArray15 = ds.MaxMin4.maxMin4(intArray6, (int) (short) 1, (int) (byte) 0);
        int[] intArray18 = ds.MaxMin4.maxMin4(intArray15, 0, (int) (byte) 1);
        int[] intArray21 = ds.MaxMin4.maxMin4(intArray18, (int) (byte) 0, 0);
        java.lang.Class<?> wildcardClass22 = intArray18.getClass();
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[100, 1, 10]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[100, 1]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[100, 1]");
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[100, 1]");
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray18), "[100, 1]");
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray21), "[100, 100]");
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test2061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2061");
        int[] intArray3 = new int[] { (short) 0, (byte) 100, 1 };
        int[] intArray6 = ds.MaxMin4.maxMin4(intArray3, (int) (byte) 0, 0);
        int[] intArray9 = ds.MaxMin4.maxMin4(intArray3, 0, (int) (short) 0);
        int[] intArray12 = ds.MaxMin4.maxMin4(intArray9, (int) (byte) 0, (int) (byte) 0);
        int[] intArray15 = ds.MaxMin4.maxMin4(intArray12, 0, (int) (byte) 0);
        int[] intArray18 = ds.MaxMin4.maxMin4(intArray15, 0, 1);
        int[] intArray21 = ds.MaxMin4.maxMin4(intArray18, 0, 0);
        int[] intArray24 = ds.MaxMin4.maxMin4(intArray21, 0, (int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray27 = ds.MaxMin4.maxMin4(intArray24, 1, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[0, 100, 1]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray18), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray21), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray24), "[0, 0]");
    }

    @Test
    public void test2062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2062");
        int[] intArray3 = new int[] { 100, 1, 10 };
        int[] intArray6 = ds.MaxMin4.maxMin4(intArray3, 0, (int) (short) 1);
        int[] intArray9 = ds.MaxMin4.maxMin4(intArray3, (int) (byte) 1, 1);
        int[] intArray12 = ds.MaxMin4.maxMin4(intArray3, (int) (byte) 1, (int) (byte) 0);
        int[] intArray15 = ds.MaxMin4.maxMin4(intArray12, 0, (int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray18 = ds.MaxMin4.maxMin4(intArray12, (int) (byte) -1, (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[100, 1, 10]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[100, 1]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[100, 1]");
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[100, 1]");
    }

    @Test
    public void test2063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2063");
        int[] intArray3 = new int[] { (short) 0, (byte) 100, 1 };
        int[] intArray6 = ds.MaxMin4.maxMin4(intArray3, (int) (byte) 0, 0);
        int[] intArray9 = ds.MaxMin4.maxMin4(intArray3, (int) (short) 1, (int) (byte) 0);
        int[] intArray12 = ds.MaxMin4.maxMin4(intArray3, 0, 1);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray15 = ds.MaxMin4.maxMin4(intArray3, (int) (short) 1, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[0, 100, 1]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[100, 0]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[100, 0]");
    }

    @Test
    public void test2064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2064");
        int[] intArray3 = new int[] { 100, 1, 10 };
        int[] intArray6 = ds.MaxMin4.maxMin4(intArray3, 0, (int) (short) 1);
        int[] intArray9 = ds.MaxMin4.maxMin4(intArray3, (int) (byte) 1, 1);
        int[] intArray12 = ds.MaxMin4.maxMin4(intArray9, 0, 1);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray15 = ds.MaxMin4.maxMin4(intArray9, 100, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[100, 1, 10]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[100, 1]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[1, 1]");
    }

    @Test
    public void test2065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2065");
        int[] intArray3 = new int[] { 100, 1, 10 };
        int[] intArray6 = ds.MaxMin4.maxMin4(intArray3, 0, (int) (short) 1);
        int[] intArray9 = ds.MaxMin4.maxMin4(intArray6, (int) (short) 1, (int) (byte) 0);
        java.lang.Class<?> wildcardClass10 = intArray9.getClass();
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[100, 1, 10]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[100, 1]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[100, 1]");
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test2066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2066");
        int[] intArray3 = new int[] { 100, 1, 10 };
        int[] intArray6 = ds.MaxMin4.maxMin4(intArray3, 0, (int) (short) 1);
        int[] intArray9 = ds.MaxMin4.maxMin4(intArray3, (int) (byte) 1, 1);
        int[] intArray12 = ds.MaxMin4.maxMin4(intArray3, 0, 0);
        int[] intArray15 = ds.MaxMin4.maxMin4(intArray12, (int) (short) 1, (int) (byte) 1);
        int[] intArray18 = ds.MaxMin4.maxMin4(intArray15, (int) (byte) 0, (int) (byte) 1);
        int[] intArray21 = ds.MaxMin4.maxMin4(intArray18, 0, (int) (byte) 0);
        int[] intArray24 = ds.MaxMin4.maxMin4(intArray18, 1, (int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray27 = ds.MaxMin4.maxMin4(intArray18, (int) '#', 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[100, 1, 10]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[100, 1]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray18), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray21), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray24), "[100, 100]");
    }

    @Test
    public void test2067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2067");
        int[] intArray3 = new int[] { (short) 0, (byte) 100, 1 };
        int[] intArray6 = ds.MaxMin4.maxMin4(intArray3, (int) (byte) 0, 0);
        int[] intArray9 = ds.MaxMin4.maxMin4(intArray3, (int) (short) 1, (int) (byte) 0);
        int[] intArray12 = ds.MaxMin4.maxMin4(intArray9, 0, (int) (byte) 0);
        int[] intArray15 = ds.MaxMin4.maxMin4(intArray9, 1, 1);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray18 = ds.MaxMin4.maxMin4(intArray9, (int) '#', 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[0, 100, 1]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[100, 0]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[0, 0]");
    }

    @Test
    public void test2068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2068");
        int[] intArray3 = new int[] { (short) 0, (byte) 100, 1 };
        int[] intArray6 = ds.MaxMin4.maxMin4(intArray3, (int) (byte) 0, 0);
        int[] intArray9 = ds.MaxMin4.maxMin4(intArray3, 1, 1);
        int[] intArray12 = ds.MaxMin4.maxMin4(intArray9, (int) (short) 0, (int) (byte) 0);
        int[] intArray15 = ds.MaxMin4.maxMin4(intArray9, (int) (byte) 0, (int) (byte) 0);
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[0, 100, 1]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[100, 100]");
    }

    @Test
    public void test2069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2069");
        int[] intArray3 = new int[] { (short) 0, (byte) 100, 1 };
        int[] intArray6 = ds.MaxMin4.maxMin4(intArray3, (int) (byte) 0, 0);
        int[] intArray9 = ds.MaxMin4.maxMin4(intArray3, 0, (int) (short) 0);
        int[] intArray12 = ds.MaxMin4.maxMin4(intArray9, (int) (byte) 0, (int) (byte) 0);
        int[] intArray15 = ds.MaxMin4.maxMin4(intArray9, 0, 0);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray18 = ds.MaxMin4.maxMin4(intArray9, (int) '#', 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[0, 100, 1]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[0, 0]");
    }

    @Test
    public void test2070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2070");
        int[] intArray3 = new int[] { (short) 0, (byte) 100, 1 };
        int[] intArray6 = ds.MaxMin4.maxMin4(intArray3, (int) (byte) 0, 0);
        int[] intArray9 = ds.MaxMin4.maxMin4(intArray3, 1, 1);
        int[] intArray12 = ds.MaxMin4.maxMin4(intArray3, 0, 0);
        int[] intArray15 = ds.MaxMin4.maxMin4(intArray12, (int) (byte) 0, (int) (byte) 1);
        int[] intArray18 = ds.MaxMin4.maxMin4(intArray12, (int) (short) 1, (int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray21 = ds.MaxMin4.maxMin4(intArray12, (int) (short) 100, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[0, 100, 1]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray18), "[0, 0]");
    }

    @Test
    public void test2071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2071");
        int[] intArray3 = new int[] { (short) 0, (byte) 100, 1 };
        int[] intArray6 = ds.MaxMin4.maxMin4(intArray3, (int) (byte) 0, 0);
        int[] intArray9 = ds.MaxMin4.maxMin4(intArray3, 1, 1);
        int[] intArray12 = ds.MaxMin4.maxMin4(intArray3, 0, 0);
        int[] intArray15 = ds.MaxMin4.maxMin4(intArray12, 0, 0);
        int[] intArray18 = ds.MaxMin4.maxMin4(intArray12, 1, 1);
        java.lang.Class<?> wildcardClass19 = intArray12.getClass();
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[0, 100, 1]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray18), "[0, 0]");
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test2072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2072");
        int[] intArray3 = new int[] { (short) 0, (byte) 100, 1 };
        int[] intArray6 = ds.MaxMin4.maxMin4(intArray3, (int) (byte) 0, 0);
        int[] intArray9 = ds.MaxMin4.maxMin4(intArray3, (int) (short) 1, (int) (byte) 0);
        int[] intArray12 = ds.MaxMin4.maxMin4(intArray9, (int) (short) 1, (int) (short) 1);
        int[] intArray15 = ds.MaxMin4.maxMin4(intArray12, (int) (short) 0, (int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray18 = ds.MaxMin4.maxMin4(intArray12, (int) (byte) 10, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[0, 100, 1]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[100, 0]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[0, 0]");
    }

    @Test
    public void test2073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2073");
        int[] intArray3 = new int[] { 100, 1, 10 };
        int[] intArray6 = ds.MaxMin4.maxMin4(intArray3, 0, (int) (short) 1);
        int[] intArray9 = ds.MaxMin4.maxMin4(intArray3, (int) (byte) 1, 1);
        int[] intArray12 = ds.MaxMin4.maxMin4(intArray3, 0, 0);
        int[] intArray15 = ds.MaxMin4.maxMin4(intArray12, (int) (short) 1, (int) (byte) 1);
        int[] intArray18 = ds.MaxMin4.maxMin4(intArray15, (int) (byte) 0, (int) (byte) 1);
        int[] intArray21 = ds.MaxMin4.maxMin4(intArray18, 1, 1);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray24 = ds.MaxMin4.maxMin4(intArray21, 100, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[100, 1, 10]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[100, 1]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray18), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray21), "[100, 100]");
    }

    @Test
    public void test2074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2074");
        int[] intArray3 = new int[] { 100, 1, 10 };
        int[] intArray6 = ds.MaxMin4.maxMin4(intArray3, 0, (int) (short) 1);
        int[] intArray9 = ds.MaxMin4.maxMin4(intArray6, (int) (byte) 0, (int) (byte) 0);
        int[] intArray12 = ds.MaxMin4.maxMin4(intArray6, 0, (int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray15 = ds.MaxMin4.maxMin4(intArray6, (int) (short) 0, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[100, 1, 10]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[100, 1]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[100, 1]");
    }

    @Test
    public void test2075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2075");
        int[] intArray3 = new int[] { (short) 0, (byte) 100, 1 };
        int[] intArray6 = ds.MaxMin4.maxMin4(intArray3, (int) (byte) 0, 0);
        int[] intArray9 = ds.MaxMin4.maxMin4(intArray3, 1, 1);
        int[] intArray12 = ds.MaxMin4.maxMin4(intArray9, (int) (short) 0, (int) (byte) 0);
        int[] intArray15 = ds.MaxMin4.maxMin4(intArray9, (int) (byte) 1, 0);
        int[] intArray18 = ds.MaxMin4.maxMin4(intArray15, 1, (int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray21 = ds.MaxMin4.maxMin4(intArray18, 100, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[0, 100, 1]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray18), "[100, 100]");
    }

    @Test
    public void test2076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2076");
        int[] intArray3 = new int[] { 100, 1, 10 };
        int[] intArray6 = ds.MaxMin4.maxMin4(intArray3, 0, (int) (short) 1);
        int[] intArray9 = ds.MaxMin4.maxMin4(intArray3, (int) (byte) 1, 1);
        int[] intArray12 = ds.MaxMin4.maxMin4(intArray3, 0, 0);
        int[] intArray15 = ds.MaxMin4.maxMin4(intArray12, (int) (byte) 1, 0);
        int[] intArray18 = ds.MaxMin4.maxMin4(intArray12, 0, (int) (short) 1);
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[100, 1, 10]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[100, 1]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray18), "[100, 100]");
    }

    @Test
    public void test2077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2077");
        int[] intArray3 = new int[] { 100, 1, 10 };
        int[] intArray6 = ds.MaxMin4.maxMin4(intArray3, 0, (int) (short) 1);
        int[] intArray9 = ds.MaxMin4.maxMin4(intArray6, (int) (short) 0, 0);
        int[] intArray12 = ds.MaxMin4.maxMin4(intArray9, 1, 0);
        int[] intArray15 = ds.MaxMin4.maxMin4(intArray12, 1, (int) (short) 0);
        int[] intArray18 = ds.MaxMin4.maxMin4(intArray12, (int) (byte) 1, (int) (byte) 1);
        java.lang.Class<?> wildcardClass19 = intArray12.getClass();
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[100, 1, 10]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[100, 1]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray18), "[100, 100]");
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test2078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2078");
        int[] intArray3 = new int[] { (short) 0, (byte) 100, 1 };
        int[] intArray6 = ds.MaxMin4.maxMin4(intArray3, (int) (byte) 0, 0);
        int[] intArray9 = ds.MaxMin4.maxMin4(intArray3, 1, 1);
        int[] intArray12 = ds.MaxMin4.maxMin4(intArray9, (int) (short) 0, (int) (byte) 0);
        int[] intArray15 = ds.MaxMin4.maxMin4(intArray12, 0, 1);
        int[] intArray18 = ds.MaxMin4.maxMin4(intArray15, (int) (byte) 0, (int) (short) 0);
        int[] intArray21 = ds.MaxMin4.maxMin4(intArray18, 0, (int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray24 = ds.MaxMin4.maxMin4(intArray21, (-1), (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[0, 100, 1]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray18), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray21), "[100, 100]");
    }

    @Test
    public void test2079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2079");
        int[] intArray3 = new int[] { 100, 1, 10 };
        int[] intArray6 = ds.MaxMin4.maxMin4(intArray3, 0, (int) (short) 1);
        int[] intArray9 = ds.MaxMin4.maxMin4(intArray6, (int) (byte) 0, (int) (byte) 0);
        int[] intArray12 = ds.MaxMin4.maxMin4(intArray6, 0, (int) (byte) 1);
        int[] intArray15 = ds.MaxMin4.maxMin4(intArray12, (int) (short) 1, 1);
        int[] intArray18 = ds.MaxMin4.maxMin4(intArray12, (int) (short) 1, (int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray21 = ds.MaxMin4.maxMin4(intArray12, (int) (short) 10, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[100, 1, 10]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[100, 1]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[100, 1]");
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray18), "[100, 1]");
    }

    @Test
    public void test2080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2080");
        int[] intArray3 = new int[] { 100, 1, 10 };
        int[] intArray6 = ds.MaxMin4.maxMin4(intArray3, 0, (int) (short) 1);
        int[] intArray9 = ds.MaxMin4.maxMin4(intArray3, (int) (byte) 1, 1);
        int[] intArray12 = ds.MaxMin4.maxMin4(intArray3, 0, 0);
        int[] intArray15 = ds.MaxMin4.maxMin4(intArray3, (int) (short) 1, (int) (byte) 0);
        int[] intArray18 = ds.MaxMin4.maxMin4(intArray3, (int) (short) 1, (int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray21 = ds.MaxMin4.maxMin4(intArray3, (int) (byte) 1, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[100, 1, 10]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[100, 1]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[100, 1]");
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray18), "[1, 1]");
    }

    @Test
    public void test2081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2081");
        int[] intArray3 = new int[] { 100, 1, 10 };
        int[] intArray6 = ds.MaxMin4.maxMin4(intArray3, 0, (int) (short) 1);
        int[] intArray9 = ds.MaxMin4.maxMin4(intArray6, (int) (short) 0, 0);
        int[] intArray12 = ds.MaxMin4.maxMin4(intArray9, 1, 0);
        int[] intArray15 = ds.MaxMin4.maxMin4(intArray12, 1, (int) (short) 0);
        int[] intArray18 = ds.MaxMin4.maxMin4(intArray12, (int) (byte) 1, (int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray21 = ds.MaxMin4.maxMin4(intArray12, (int) (short) 10, 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[100, 1, 10]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[100, 1]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray18), "[100, 100]");
    }

    @Test
    public void test2082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2082");
        int[] intArray0 = null;
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray3 = ds.MaxMin4.maxMin4(intArray0, 10, (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2083");
        int[] intArray3 = new int[] { (short) 0, (byte) 100, 1 };
        int[] intArray6 = ds.MaxMin4.maxMin4(intArray3, (int) (byte) 0, 0);
        int[] intArray9 = ds.MaxMin4.maxMin4(intArray3, 1, 1);
        int[] intArray12 = ds.MaxMin4.maxMin4(intArray3, 0, 0);
        int[] intArray15 = ds.MaxMin4.maxMin4(intArray3, (int) (byte) 0, (int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray18 = ds.MaxMin4.maxMin4(intArray3, (int) '#', (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[0, 100, 1]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[100, 0]");
    }

    @Test
    public void test2084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2084");
        int[] intArray3 = new int[] { (short) 0, (byte) 100, 1 };
        int[] intArray6 = ds.MaxMin4.maxMin4(intArray3, (int) (byte) 0, 0);
        int[] intArray9 = ds.MaxMin4.maxMin4(intArray3, (int) (short) 1, (int) (byte) 0);
        int[] intArray12 = ds.MaxMin4.maxMin4(intArray3, 0, 1);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray15 = ds.MaxMin4.maxMin4(intArray12, (int) (byte) 0, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[0, 100, 1]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[100, 0]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[100, 0]");
    }

    @Test
    public void test2085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2085");
        int[] intArray3 = new int[] { (short) 0, (byte) 100, 1 };
        int[] intArray6 = ds.MaxMin4.maxMin4(intArray3, (int) (byte) 0, 0);
        int[] intArray9 = ds.MaxMin4.maxMin4(intArray3, (int) (short) 1, (int) (byte) 0);
        int[] intArray12 = ds.MaxMin4.maxMin4(intArray3, 1, 1);
        int[] intArray15 = ds.MaxMin4.maxMin4(intArray3, (int) (byte) 0, (int) (short) 0);
        int[] intArray18 = ds.MaxMin4.maxMin4(intArray3, 1, (int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray21 = ds.MaxMin4.maxMin4(intArray3, (int) (byte) -1, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[0, 100, 1]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[100, 0]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray18), "[100, 100]");
    }

    @Test
    public void test2086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2086");
        int[] intArray3 = new int[] { (short) 0, (byte) 100, 1 };
        int[] intArray6 = ds.MaxMin4.maxMin4(intArray3, (int) (byte) 0, 0);
        int[] intArray9 = ds.MaxMin4.maxMin4(intArray3, 1, 1);
        int[] intArray12 = ds.MaxMin4.maxMin4(intArray9, (int) (short) 0, (int) (byte) 0);
        int[] intArray15 = ds.MaxMin4.maxMin4(intArray12, 0, 1);
        int[] intArray18 = ds.MaxMin4.maxMin4(intArray15, (int) (byte) 0, (int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray21 = ds.MaxMin4.maxMin4(intArray15, (int) (byte) -1, (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[0, 100, 1]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray18), "[100, 100]");
    }

    @Test
    public void test2087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2087");
        int[] intArray3 = new int[] { 100, 1, 10 };
        int[] intArray6 = ds.MaxMin4.maxMin4(intArray3, 0, (int) (short) 1);
        int[] intArray9 = ds.MaxMin4.maxMin4(intArray3, (int) (byte) 1, 1);
        int[] intArray12 = ds.MaxMin4.maxMin4(intArray3, 0, 0);
        int[] intArray15 = ds.MaxMin4.maxMin4(intArray3, (int) (byte) 0, (int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray18 = ds.MaxMin4.maxMin4(intArray15, 0, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[100, 1, 10]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[100, 1]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[100, 100]");
    }

    @Test
    public void test2088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2088");
        int[] intArray3 = new int[] { (short) 0, (byte) 100, 1 };
        int[] intArray6 = ds.MaxMin4.maxMin4(intArray3, (int) (byte) 0, 0);
        int[] intArray9 = ds.MaxMin4.maxMin4(intArray3, 0, (int) (short) 0);
        int[] intArray12 = ds.MaxMin4.maxMin4(intArray9, 1, (int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray15 = ds.MaxMin4.maxMin4(intArray12, (int) (short) 100, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[0, 100, 1]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[0, 0]");
    }

    @Test
    public void test2089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2089");
        int[] intArray3 = new int[] { 100, 1, 10 };
        int[] intArray6 = ds.MaxMin4.maxMin4(intArray3, 0, (int) (short) 1);
        int[] intArray9 = ds.MaxMin4.maxMin4(intArray3, (int) (byte) 1, 1);
        int[] intArray12 = ds.MaxMin4.maxMin4(intArray3, 0, 0);
        int[] intArray15 = ds.MaxMin4.maxMin4(intArray3, (int) (short) 1, (int) (byte) 0);
        int[] intArray18 = ds.MaxMin4.maxMin4(intArray15, (int) (byte) 0, 0);
        java.lang.Class<?> wildcardClass19 = intArray18.getClass();
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[100, 1, 10]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[100, 1]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[100, 1]");
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray18), "[100, 100]");
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test2090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2090");
        int[] intArray3 = new int[] { 100, 1, 10 };
        int[] intArray6 = ds.MaxMin4.maxMin4(intArray3, 0, (int) (short) 1);
        int[] intArray9 = ds.MaxMin4.maxMin4(intArray6, (int) (short) 1, (int) (byte) 0);
        int[] intArray12 = ds.MaxMin4.maxMin4(intArray6, (int) (byte) 1, (int) (byte) 0);
        java.lang.Class<?> wildcardClass13 = intArray6.getClass();
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[100, 1, 10]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[100, 1]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[100, 1]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[100, 1]");
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test2091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2091");
        int[] intArray3 = new int[] { (short) 0, (byte) 100, 1 };
        int[] intArray6 = ds.MaxMin4.maxMin4(intArray3, (int) (byte) 0, 0);
        int[] intArray9 = ds.MaxMin4.maxMin4(intArray3, 1, 1);
        int[] intArray12 = ds.MaxMin4.maxMin4(intArray3, 0, 0);
        int[] intArray15 = ds.MaxMin4.maxMin4(intArray3, (int) (byte) 0, (int) (byte) 1);
        int[] intArray18 = ds.MaxMin4.maxMin4(intArray3, (int) (short) 1, (int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray21 = ds.MaxMin4.maxMin4(intArray3, 0, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[0, 100, 1]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[100, 0]");
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray18), "[100, 0]");
    }

    @Test
    public void test2092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2092");
        int[] intArray3 = new int[] { (short) 0, (byte) 100, 1 };
        int[] intArray6 = ds.MaxMin4.maxMin4(intArray3, (int) (byte) 0, 0);
        int[] intArray9 = ds.MaxMin4.maxMin4(intArray3, 0, (int) (short) 0);
        int[] intArray12 = ds.MaxMin4.maxMin4(intArray9, (int) (byte) 0, (int) (byte) 0);
        int[] intArray15 = ds.MaxMin4.maxMin4(intArray12, 0, (int) (byte) 0);
        int[] intArray18 = ds.MaxMin4.maxMin4(intArray15, 0, 1);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray21 = ds.MaxMin4.maxMin4(intArray18, (int) (byte) -1, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[0, 100, 1]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray18), "[0, 0]");
    }

    @Test
    public void test2093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2093");
        int[] intArray3 = new int[] { (short) 0, (byte) 100, 1 };
        int[] intArray6 = ds.MaxMin4.maxMin4(intArray3, (int) (byte) 0, 0);
        int[] intArray9 = ds.MaxMin4.maxMin4(intArray3, 0, (int) (short) 0);
        int[] intArray12 = ds.MaxMin4.maxMin4(intArray9, (int) (short) 1, (int) (byte) 0);
        int[] intArray15 = ds.MaxMin4.maxMin4(intArray12, 1, (int) (byte) 0);
        int[] intArray18 = ds.MaxMin4.maxMin4(intArray15, (int) (short) 1, (int) (short) 1);
        java.lang.Class<?> wildcardClass19 = intArray18.getClass();
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[0, 100, 1]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray18), "[0, 0]");
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test2094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2094");
        int[] intArray3 = new int[] { 100, 1, 10 };
        int[] intArray6 = ds.MaxMin4.maxMin4(intArray3, 0, (int) (short) 1);
        int[] intArray9 = ds.MaxMin4.maxMin4(intArray3, (int) (byte) 1, 1);
        int[] intArray12 = ds.MaxMin4.maxMin4(intArray3, 0, 0);
        int[] intArray15 = ds.MaxMin4.maxMin4(intArray3, (int) (byte) 0, (int) (short) 0);
        java.lang.Class<?> wildcardClass16 = intArray15.getClass();
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[100, 1, 10]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[100, 1]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[100, 100]");
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test2095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2095");
        int[] intArray3 = new int[] { (short) 0, (byte) 100, 1 };
        int[] intArray6 = ds.MaxMin4.maxMin4(intArray3, (int) (byte) 0, 0);
        int[] intArray9 = ds.MaxMin4.maxMin4(intArray3, 0, (int) (short) 0);
        int[] intArray12 = ds.MaxMin4.maxMin4(intArray9, 1, (int) (byte) 0);
        int[] intArray15 = ds.MaxMin4.maxMin4(intArray9, (int) (byte) 0, (int) (short) 0);
        int[] intArray18 = ds.MaxMin4.maxMin4(intArray9, (int) (byte) 1, (int) (short) 1);
        java.lang.Class<?> wildcardClass19 = intArray9.getClass();
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[0, 100, 1]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray18), "[0, 0]");
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test2096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2096");
        int[] intArray3 = new int[] { (short) 0, (byte) 100, 1 };
        int[] intArray6 = ds.MaxMin4.maxMin4(intArray3, (int) (byte) 0, 0);
        int[] intArray9 = ds.MaxMin4.maxMin4(intArray3, 0, (int) (short) 0);
        int[] intArray12 = ds.MaxMin4.maxMin4(intArray9, 1, (int) (byte) 0);
        int[] intArray15 = ds.MaxMin4.maxMin4(intArray9, (int) (byte) 0, (int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray18 = ds.MaxMin4.maxMin4(intArray15, 0, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[0, 100, 1]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[0, 0]");
    }

    @Test
    public void test2097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2097");
        int[] intArray0 = null;
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray3 = ds.MaxMin4.maxMin4(intArray0, 0, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2098");
        int[] intArray3 = new int[] { 100, 1, 10 };
        int[] intArray6 = ds.MaxMin4.maxMin4(intArray3, 0, (int) (short) 1);
        int[] intArray9 = ds.MaxMin4.maxMin4(intArray3, (int) (byte) 1, 1);
        int[] intArray12 = ds.MaxMin4.maxMin4(intArray3, 0, 0);
        int[] intArray15 = ds.MaxMin4.maxMin4(intArray12, (int) (byte) 1, 0);
        int[] intArray18 = ds.MaxMin4.maxMin4(intArray15, (int) (byte) 0, (int) (byte) 0);
        int[] intArray21 = ds.MaxMin4.maxMin4(intArray18, (int) (short) 0, (int) (byte) 0);
        java.lang.Class<?> wildcardClass22 = intArray21.getClass();
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[100, 1, 10]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[100, 1]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray18), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray21), "[100, 100]");
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test2099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2099");
        int[] intArray3 = new int[] { (short) 0, (byte) 100, 1 };
        int[] intArray6 = ds.MaxMin4.maxMin4(intArray3, (int) (byte) 0, 0);
        int[] intArray9 = ds.MaxMin4.maxMin4(intArray3, (int) (short) 1, (int) (byte) 0);
        int[] intArray12 = ds.MaxMin4.maxMin4(intArray3, 0, 1);
        int[] intArray15 = ds.MaxMin4.maxMin4(intArray12, (int) (short) 0, (int) (short) 1);
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[0, 100, 1]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[100, 0]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[100, 0]");
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[100, 0]");
    }

    @Test
    public void test2100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2100");
        int[] intArray3 = new int[] { 100, 1, 10 };
        int[] intArray6 = ds.MaxMin4.maxMin4(intArray3, 0, (int) (short) 1);
        int[] intArray9 = ds.MaxMin4.maxMin4(intArray6, (int) (byte) 0, (int) (byte) 0);
        int[] intArray12 = ds.MaxMin4.maxMin4(intArray9, 0, (int) (short) 0);
        int[] intArray15 = ds.MaxMin4.maxMin4(intArray12, (int) (short) 0, (int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray18 = ds.MaxMin4.maxMin4(intArray15, 10, (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[100, 1, 10]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[100, 1]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[100, 100]");
    }

    @Test
    public void test2101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2101");
        int[] intArray3 = new int[] { (short) 0, (byte) 100, 1 };
        int[] intArray6 = ds.MaxMin4.maxMin4(intArray3, (int) (byte) 0, 0);
        int[] intArray9 = ds.MaxMin4.maxMin4(intArray3, 1, 1);
        int[] intArray12 = ds.MaxMin4.maxMin4(intArray3, 0, 0);
        int[] intArray15 = ds.MaxMin4.maxMin4(intArray12, (int) (byte) 0, (int) (byte) 1);
        int[] intArray18 = ds.MaxMin4.maxMin4(intArray15, (int) (byte) 0, (int) (short) 0);
        int[] intArray21 = ds.MaxMin4.maxMin4(intArray18, 0, (int) (byte) 0);
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[0, 100, 1]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray18), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray21), "[0, 0]");
    }

    @Test
    public void test2102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2102");
        int[] intArray3 = new int[] { (short) 0, (byte) 100, 1 };
        int[] intArray6 = ds.MaxMin4.maxMin4(intArray3, (int) (byte) 0, 0);
        int[] intArray9 = ds.MaxMin4.maxMin4(intArray3, 1, 1);
        int[] intArray12 = ds.MaxMin4.maxMin4(intArray9, (int) (short) 0, (int) (byte) 0);
        int[] intArray15 = ds.MaxMin4.maxMin4(intArray9, (int) (byte) 1, 0);
        int[] intArray18 = ds.MaxMin4.maxMin4(intArray9, (int) (byte) 0, (int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray21 = ds.MaxMin4.maxMin4(intArray18, 10, (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[0, 100, 1]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray18), "[100, 100]");
    }

    @Test
    public void test2103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2103");
        int[] intArray3 = new int[] { (short) 0, (byte) 100, 1 };
        int[] intArray6 = ds.MaxMin4.maxMin4(intArray3, (int) (byte) 0, 0);
        int[] intArray9 = ds.MaxMin4.maxMin4(intArray3, 1, 1);
        int[] intArray12 = ds.MaxMin4.maxMin4(intArray3, 0, 0);
        int[] intArray15 = ds.MaxMin4.maxMin4(intArray12, (int) (byte) 0, (int) (byte) 1);
        int[] intArray18 = ds.MaxMin4.maxMin4(intArray12, (int) (short) 1, (int) (short) 1);
        int[] intArray21 = ds.MaxMin4.maxMin4(intArray18, 1, (int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray24 = ds.MaxMin4.maxMin4(intArray21, (int) '4', (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[0, 100, 1]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray18), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray21), "[0, 0]");
    }

    @Test
    public void test2104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2104");
        int[] intArray3 = new int[] { (short) 0, (byte) 100, 1 };
        int[] intArray6 = ds.MaxMin4.maxMin4(intArray3, (int) (byte) 0, 0);
        int[] intArray9 = ds.MaxMin4.maxMin4(intArray6, (int) (short) 1, (int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray12 = ds.MaxMin4.maxMin4(intArray9, 100, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[0, 100, 1]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[0, 0]");
    }

    @Test
    public void test2105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2105");
        int[] intArray3 = new int[] { (short) 0, (byte) 100, 1 };
        int[] intArray6 = ds.MaxMin4.maxMin4(intArray3, (int) (byte) 0, 0);
        int[] intArray9 = ds.MaxMin4.maxMin4(intArray3, 0, (int) (short) 0);
        int[] intArray12 = ds.MaxMin4.maxMin4(intArray9, (int) (byte) 0, (int) (byte) 0);
        int[] intArray15 = ds.MaxMin4.maxMin4(intArray12, 0, (int) (byte) 0);
        int[] intArray18 = ds.MaxMin4.maxMin4(intArray15, 0, 1);
        int[] intArray21 = ds.MaxMin4.maxMin4(intArray18, 0, 0);
        int[] intArray24 = ds.MaxMin4.maxMin4(intArray21, 0, (int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray27 = ds.MaxMin4.maxMin4(intArray24, (int) '#', 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[0, 100, 1]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray18), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray21), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray24), "[0, 0]");
    }
}

