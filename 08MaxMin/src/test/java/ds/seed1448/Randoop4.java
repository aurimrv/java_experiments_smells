package ds.seed1448;

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
        int[] intArray3 = new int[] { (short) 100, (short) 100, 1 };
        int[] intArray6 = ds.MaxMin4.maxMin4(intArray3, (int) (short) 0, (int) (short) 0);
        int[] intArray9 = ds.MaxMin4.maxMin4(intArray6, 1, 1);
        int[] intArray12 = ds.MaxMin4.maxMin4(intArray9, 1, (int) (byte) 1);
        int[] intArray15 = ds.MaxMin4.maxMin4(intArray9, (int) (byte) 0, 0);
        int[] intArray18 = ds.MaxMin4.maxMin4(intArray9, (int) (short) 1, 1);
        int[] intArray21 = ds.MaxMin4.maxMin4(intArray9, (int) (byte) 0, 0);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray24 = ds.MaxMin4.maxMin4(intArray9, (int) (short) -1, (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[100, 100, 1]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[100, 100]");
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
    public void test2002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2002");
        int[] intArray3 = new int[] { (short) 100, (short) 100, 1 };
        int[] intArray6 = ds.MaxMin4.maxMin4(intArray3, (int) (short) 0, (int) (short) 0);
        int[] intArray9 = ds.MaxMin4.maxMin4(intArray6, 1, 1);
        int[] intArray12 = ds.MaxMin4.maxMin4(intArray9, 1, (int) (byte) 1);
        int[] intArray15 = ds.MaxMin4.maxMin4(intArray9, (int) (byte) 0, 0);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray18 = ds.MaxMin4.maxMin4(intArray15, (int) (short) 0, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[100, 100, 1]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[100, 100]");
    }

    @Test
    public void test2003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2003");
        int[] intArray3 = new int[] { (short) 100, (short) 100, 1 };
        int[] intArray6 = ds.MaxMin4.maxMin4(intArray3, (int) (short) 0, (int) (short) 0);
        int[] intArray9 = ds.MaxMin4.maxMin4(intArray6, 1, 1);
        int[] intArray12 = ds.MaxMin4.maxMin4(intArray6, (int) (byte) 0, 1);
        int[] intArray15 = ds.MaxMin4.maxMin4(intArray12, (int) (short) 0, 1);
        int[] intArray18 = ds.MaxMin4.maxMin4(intArray12, (int) (short) 0, (int) (byte) 1);
        int[] intArray21 = ds.MaxMin4.maxMin4(intArray18, 0, 0);
        int[] intArray24 = ds.MaxMin4.maxMin4(intArray18, (int) (short) 0, 1);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray27 = ds.MaxMin4.maxMin4(intArray18, (int) (byte) 1, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[100, 100, 1]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[100, 100]");
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
        org.junit.Assert.assertNotNull(intArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray24), "[100, 100]");
    }

    @Test
    public void test2004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2004");
        int[] intArray3 = new int[] { (short) 100, (short) 100, 1 };
        int[] intArray6 = ds.MaxMin4.maxMin4(intArray3, (int) (short) 0, (int) (short) 0);
        int[] intArray9 = ds.MaxMin4.maxMin4(intArray6, 1, 1);
        int[] intArray12 = ds.MaxMin4.maxMin4(intArray9, 1, (int) (byte) 1);
        int[] intArray15 = ds.MaxMin4.maxMin4(intArray9, 1, 0);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray18 = ds.MaxMin4.maxMin4(intArray15, (-1), (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[100, 100, 1]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[100, 100]");
    }

    @Test
    public void test2005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2005");
        int[] intArray3 = new int[] { (short) 100, (short) 100, 1 };
        int[] intArray6 = ds.MaxMin4.maxMin4(intArray3, (int) (short) 0, (int) (short) 0);
        int[] intArray9 = ds.MaxMin4.maxMin4(intArray6, 1, 1);
        int[] intArray12 = ds.MaxMin4.maxMin4(intArray9, 1, (int) (short) 0);
        int[] intArray15 = ds.MaxMin4.maxMin4(intArray12, (int) (byte) 1, (int) (byte) 0);
        int[] intArray18 = ds.MaxMin4.maxMin4(intArray12, (int) (byte) 1, (int) (byte) 1);
        int[] intArray21 = ds.MaxMin4.maxMin4(intArray18, (int) (byte) 0, 1);
        int[] intArray24 = ds.MaxMin4.maxMin4(intArray21, 0, (int) (short) 1);
        int[] intArray27 = ds.MaxMin4.maxMin4(intArray24, (int) (short) 0, 0);
        int[] intArray30 = ds.MaxMin4.maxMin4(intArray24, (int) (short) 1, (int) (byte) 0);
        int[] intArray33 = ds.MaxMin4.maxMin4(intArray24, 0, 0);
        int[] intArray36 = ds.MaxMin4.maxMin4(intArray24, 0, (int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray39 = ds.MaxMin4.maxMin4(intArray24, 0, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[100, 100, 1]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[100, 100]");
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
    public void test2006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2006");
        int[] intArray3 = new int[] { (short) 100, (short) 100, 1 };
        int[] intArray6 = ds.MaxMin4.maxMin4(intArray3, (int) (short) 0, (int) (short) 0);
        int[] intArray9 = ds.MaxMin4.maxMin4(intArray6, 1, 1);
        int[] intArray12 = ds.MaxMin4.maxMin4(intArray9, 1, (int) (byte) 1);
        int[] intArray15 = ds.MaxMin4.maxMin4(intArray12, 0, (int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray18 = ds.MaxMin4.maxMin4(intArray15, (int) (short) -1, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[100, 100, 1]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[100, 100]");
    }

    @Test
    public void test2007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2007");
        int[] intArray3 = new int[] { (short) 100, (short) 100, 1 };
        int[] intArray6 = ds.MaxMin4.maxMin4(intArray3, (int) (short) 0, (int) (short) 0);
        int[] intArray9 = ds.MaxMin4.maxMin4(intArray6, 1, 1);
        int[] intArray12 = ds.MaxMin4.maxMin4(intArray9, (int) (byte) 1, (int) (short) 0);
        int[] intArray15 = ds.MaxMin4.maxMin4(intArray9, 1, 1);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray18 = ds.MaxMin4.maxMin4(intArray15, 100, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[100, 100, 1]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[100, 100]");
    }

    @Test
    public void test2008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2008");
        int[] intArray3 = new int[] { (short) 100, (short) 100, 1 };
        int[] intArray6 = ds.MaxMin4.maxMin4(intArray3, (int) (short) 0, (int) (short) 0);
        int[] intArray9 = ds.MaxMin4.maxMin4(intArray3, 0, 1);
        int[] intArray12 = ds.MaxMin4.maxMin4(intArray9, 0, (int) (short) 0);
        int[] intArray15 = ds.MaxMin4.maxMin4(intArray12, (int) (byte) 1, (int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray18 = ds.MaxMin4.maxMin4(intArray12, (int) (byte) 100, (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[100, 100, 1]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[100, 100]");
    }

    @Test
    public void test2009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2009");
        int[] intArray3 = new int[] { (short) 100, (short) 100, 1 };
        int[] intArray6 = ds.MaxMin4.maxMin4(intArray3, (int) (short) 0, (int) (short) 0);
        int[] intArray9 = ds.MaxMin4.maxMin4(intArray6, 1, 1);
        int[] intArray12 = ds.MaxMin4.maxMin4(intArray9, 1, (int) (short) 0);
        int[] intArray15 = ds.MaxMin4.maxMin4(intArray9, 0, (int) (short) 1);
        int[] intArray18 = ds.MaxMin4.maxMin4(intArray15, (int) (byte) 1, (int) (byte) 0);
        int[] intArray21 = ds.MaxMin4.maxMin4(intArray15, (int) (byte) 0, (int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray24 = ds.MaxMin4.maxMin4(intArray21, (int) (byte) 100, (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[100, 100, 1]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[100, 100]");
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
    public void test2010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2010");
        int[] intArray3 = new int[] { (short) 100, (short) 100, 1 };
        int[] intArray6 = ds.MaxMin4.maxMin4(intArray3, (int) (short) 0, (int) (short) 0);
        int[] intArray9 = ds.MaxMin4.maxMin4(intArray6, 1, 1);
        int[] intArray12 = ds.MaxMin4.maxMin4(intArray9, 1, (int) (byte) 1);
        int[] intArray15 = ds.MaxMin4.maxMin4(intArray9, (int) (byte) 0, 0);
        int[] intArray18 = ds.MaxMin4.maxMin4(intArray9, (int) (short) 1, 1);
        int[] intArray21 = ds.MaxMin4.maxMin4(intArray18, (int) (short) 0, (int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray24 = ds.MaxMin4.maxMin4(intArray21, (int) (short) 100, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[100, 100, 1]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[100, 100]");
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
    public void test2011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2011");
        int[] intArray3 = new int[] { (short) 100, (short) 100, 1 };
        int[] intArray6 = ds.MaxMin4.maxMin4(intArray3, (int) (short) 0, (int) (short) 0);
        int[] intArray9 = ds.MaxMin4.maxMin4(intArray6, 1, 1);
        int[] intArray12 = ds.MaxMin4.maxMin4(intArray9, 1, (int) (short) 0);
        int[] intArray15 = ds.MaxMin4.maxMin4(intArray9, 0, (int) (short) 1);
        int[] intArray18 = ds.MaxMin4.maxMin4(intArray15, (int) (byte) 1, (int) (byte) 0);
        int[] intArray21 = ds.MaxMin4.maxMin4(intArray15, (int) (byte) 0, (int) (short) 0);
        int[] intArray24 = ds.MaxMin4.maxMin4(intArray21, 1, (int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray27 = ds.MaxMin4.maxMin4(intArray21, (int) (byte) 100, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[100, 100, 1]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[100, 100]");
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
        org.junit.Assert.assertNotNull(intArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray24), "[100, 100]");
    }

    @Test
    public void test2012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2012");
        int[] intArray3 = new int[] { (short) 100, (short) 100, 1 };
        int[] intArray6 = ds.MaxMin4.maxMin4(intArray3, (int) (short) 0, (int) (short) 0);
        int[] intArray9 = ds.MaxMin4.maxMin4(intArray6, 1, 1);
        int[] intArray12 = ds.MaxMin4.maxMin4(intArray6, (int) (short) 1, 1);
        int[] intArray15 = ds.MaxMin4.maxMin4(intArray12, 0, 1);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray18 = ds.MaxMin4.maxMin4(intArray12, 10, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[100, 100, 1]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[100, 100]");
    }

    @Test
    public void test2013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2013");
        int[] intArray3 = new int[] { (short) 100, (short) 100, 1 };
        int[] intArray6 = ds.MaxMin4.maxMin4(intArray3, (int) (short) 0, (int) (short) 0);
        int[] intArray9 = ds.MaxMin4.maxMin4(intArray6, 1, 1);
        int[] intArray12 = ds.MaxMin4.maxMin4(intArray9, 1, (int) (short) 0);
        int[] intArray15 = ds.MaxMin4.maxMin4(intArray12, (int) (byte) 1, (int) (byte) 0);
        int[] intArray18 = ds.MaxMin4.maxMin4(intArray12, (int) (byte) 1, (int) (byte) 1);
        int[] intArray21 = ds.MaxMin4.maxMin4(intArray12, (int) (byte) 1, 1);
        int[] intArray24 = ds.MaxMin4.maxMin4(intArray12, 1, 1);
        int[] intArray27 = ds.MaxMin4.maxMin4(intArray12, (int) (byte) 0, (int) (byte) 0);
        java.lang.Class<?> wildcardClass28 = intArray27.getClass();
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[100, 100, 1]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[100, 100]");
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
        org.junit.Assert.assertNotNull(intArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray24), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray27), "[100, 100]");
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test2014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2014");
        int[] intArray3 = new int[] { (short) 100, (short) 100, 1 };
        int[] intArray6 = ds.MaxMin4.maxMin4(intArray3, (int) (short) 0, (int) (short) 0);
        int[] intArray9 = ds.MaxMin4.maxMin4(intArray6, (int) (short) 0, 0);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray12 = ds.MaxMin4.maxMin4(intArray6, (-1), 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[100, 100, 1]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[100, 100]");
    }

    @Test
    public void test2015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2015");
        int[] intArray3 = new int[] { (short) 100, (short) 100, 1 };
        int[] intArray6 = ds.MaxMin4.maxMin4(intArray3, (int) (short) 0, (int) (short) 0);
        int[] intArray9 = ds.MaxMin4.maxMin4(intArray6, 1, 1);
        int[] intArray12 = ds.MaxMin4.maxMin4(intArray6, (int) (byte) 0, 1);
        int[] intArray15 = ds.MaxMin4.maxMin4(intArray12, (int) (short) 0, 1);
        int[] intArray18 = ds.MaxMin4.maxMin4(intArray15, (int) (short) 1, 0);
        int[] intArray21 = ds.MaxMin4.maxMin4(intArray18, (int) (short) 1, (int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray24 = ds.MaxMin4.maxMin4(intArray21, (int) (byte) 10, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[100, 100, 1]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[100, 100]");
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
    public void test2016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2016");
        int[] intArray3 = new int[] { (short) 100, (short) 100, 1 };
        int[] intArray6 = ds.MaxMin4.maxMin4(intArray3, (int) (short) 0, (int) (short) 0);
        int[] intArray9 = ds.MaxMin4.maxMin4(intArray6, 1, 1);
        int[] intArray12 = ds.MaxMin4.maxMin4(intArray9, 1, (int) (short) 0);
        int[] intArray15 = ds.MaxMin4.maxMin4(intArray9, 0, (int) (short) 1);
        int[] intArray18 = ds.MaxMin4.maxMin4(intArray15, (int) (byte) 1, (int) (byte) 0);
        int[] intArray21 = ds.MaxMin4.maxMin4(intArray18, 0, (int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray24 = ds.MaxMin4.maxMin4(intArray18, (int) '4', 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[100, 100, 1]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[100, 100]");
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
    public void test2017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2017");
        int[] intArray3 = new int[] { (short) 100, (short) 100, 1 };
        int[] intArray6 = ds.MaxMin4.maxMin4(intArray3, (int) (short) 0, (int) (short) 0);
        int[] intArray9 = ds.MaxMin4.maxMin4(intArray6, 1, 1);
        int[] intArray12 = ds.MaxMin4.maxMin4(intArray6, (int) (byte) 0, 1);
        int[] intArray15 = ds.MaxMin4.maxMin4(intArray12, 1, 1);
        int[] intArray18 = ds.MaxMin4.maxMin4(intArray12, 0, (int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray21 = ds.MaxMin4.maxMin4(intArray12, 10, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[100, 100, 1]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[100, 100]");
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
    public void test2018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2018");
        int[] intArray3 = new int[] { (short) 100, (short) 100, 1 };
        int[] intArray6 = ds.MaxMin4.maxMin4(intArray3, (int) (short) 0, (int) (short) 0);
        int[] intArray9 = ds.MaxMin4.maxMin4(intArray6, 1, 1);
        int[] intArray12 = ds.MaxMin4.maxMin4(intArray9, 1, (int) (byte) 1);
        int[] intArray15 = ds.MaxMin4.maxMin4(intArray9, 1, 0);
        int[] intArray18 = ds.MaxMin4.maxMin4(intArray15, 0, 0);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray21 = ds.MaxMin4.maxMin4(intArray15, (int) (byte) 100, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[100, 100, 1]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[100, 100]");
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
    public void test2019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2019");
        int[] intArray3 = new int[] { (short) 100, (short) 100, 1 };
        int[] intArray6 = ds.MaxMin4.maxMin4(intArray3, (int) (short) 0, (int) (short) 0);
        int[] intArray9 = ds.MaxMin4.maxMin4(intArray3, 0, (int) (byte) 0);
        int[] intArray12 = ds.MaxMin4.maxMin4(intArray3, 1, (int) (short) 1);
        int[] intArray15 = ds.MaxMin4.maxMin4(intArray3, (int) (short) 0, 1);
        int[] intArray18 = ds.MaxMin4.maxMin4(intArray3, (int) (short) 0, (int) (short) 1);
        int[] intArray21 = ds.MaxMin4.maxMin4(intArray3, 1, (int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray24 = ds.MaxMin4.maxMin4(intArray3, (int) (byte) 0, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[100, 100, 1]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[100, 100]");
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
    public void test2020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2020");
        int[] intArray3 = new int[] { (short) 100, (short) 100, 1 };
        int[] intArray6 = ds.MaxMin4.maxMin4(intArray3, (int) (short) 0, (int) (short) 0);
        int[] intArray9 = ds.MaxMin4.maxMin4(intArray6, 1, 1);
        int[] intArray12 = ds.MaxMin4.maxMin4(intArray6, (int) (short) 1, 1);
        int[] intArray15 = ds.MaxMin4.maxMin4(intArray12, 0, 1);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray18 = ds.MaxMin4.maxMin4(intArray12, (int) (short) 1, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[100, 100, 1]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[100, 100]");
    }

    @Test
    public void test2021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2021");
        int[] intArray0 = null;
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray3 = ds.MaxMin4.maxMin4(intArray0, (int) ' ', (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2022");
        int[] intArray3 = new int[] { (short) 100, (short) 100, 1 };
        int[] intArray6 = ds.MaxMin4.maxMin4(intArray3, (int) (short) 0, (int) (short) 0);
        int[] intArray9 = ds.MaxMin4.maxMin4(intArray6, 1, 1);
        int[] intArray12 = ds.MaxMin4.maxMin4(intArray9, 1, (int) (short) 0);
        int[] intArray15 = ds.MaxMin4.maxMin4(intArray9, 0, (int) (short) 1);
        int[] intArray18 = ds.MaxMin4.maxMin4(intArray15, (int) (byte) 1, (int) (byte) 0);
        int[] intArray21 = ds.MaxMin4.maxMin4(intArray18, 0, (int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray24 = ds.MaxMin4.maxMin4(intArray18, (int) (short) 0, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[100, 100, 1]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[100, 100]");
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
    public void test2023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2023");
        int[] intArray3 = new int[] { (short) 100, (short) 100, 1 };
        int[] intArray6 = ds.MaxMin4.maxMin4(intArray3, (int) (short) 0, (int) (short) 0);
        int[] intArray9 = ds.MaxMin4.maxMin4(intArray6, 1, 1);
        int[] intArray12 = ds.MaxMin4.maxMin4(intArray9, 1, (int) (byte) 1);
        int[] intArray15 = ds.MaxMin4.maxMin4(intArray9, (int) (byte) 0, 0);
        int[] intArray18 = ds.MaxMin4.maxMin4(intArray9, (int) (short) 1, 1);
        int[] intArray21 = ds.MaxMin4.maxMin4(intArray18, 0, (int) (byte) 0);
        int[] intArray24 = ds.MaxMin4.maxMin4(intArray21, 0, 0);
        int[] intArray27 = ds.MaxMin4.maxMin4(intArray21, (int) (byte) 0, (int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray30 = ds.MaxMin4.maxMin4(intArray21, (int) '#', 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[100, 100, 1]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[100, 100]");
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
        org.junit.Assert.assertNotNull(intArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray24), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray27), "[100, 100]");
    }

    @Test
    public void test2024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2024");
        int[] intArray3 = new int[] { (short) 100, (short) 100, 1 };
        int[] intArray6 = ds.MaxMin4.maxMin4(intArray3, (int) (short) 0, (int) (short) 0);
        int[] intArray9 = ds.MaxMin4.maxMin4(intArray6, 1, 1);
        int[] intArray12 = ds.MaxMin4.maxMin4(intArray6, (int) (byte) 0, 1);
        int[] intArray15 = ds.MaxMin4.maxMin4(intArray12, (int) (short) 0, 1);
        int[] intArray18 = ds.MaxMin4.maxMin4(intArray15, (int) (short) 1, 0);
        int[] intArray21 = ds.MaxMin4.maxMin4(intArray18, (int) (byte) 1, (int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray24 = ds.MaxMin4.maxMin4(intArray18, (int) (byte) 0, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[100, 100, 1]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[100, 100]");
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
    public void test2025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2025");
        int[] intArray3 = new int[] { (short) 100, (short) 100, 1 };
        int[] intArray6 = ds.MaxMin4.maxMin4(intArray3, (int) (short) 0, (int) (short) 0);
        int[] intArray9 = ds.MaxMin4.maxMin4(intArray3, 0, 1);
        int[] intArray12 = ds.MaxMin4.maxMin4(intArray9, 0, (int) (short) 0);
        int[] intArray15 = ds.MaxMin4.maxMin4(intArray9, 0, (int) (byte) 1);
        int[] intArray18 = ds.MaxMin4.maxMin4(intArray9, (int) (byte) 1, (int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray21 = ds.MaxMin4.maxMin4(intArray18, (int) (byte) 100, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[100, 100, 1]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[100, 100]");
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
    public void test2026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2026");
        int[] intArray3 = new int[] { (short) 100, (short) 100, 1 };
        int[] intArray6 = ds.MaxMin4.maxMin4(intArray3, (int) (short) 0, (int) (short) 0);
        int[] intArray9 = ds.MaxMin4.maxMin4(intArray6, 1, 1);
        int[] intArray12 = ds.MaxMin4.maxMin4(intArray9, 1, (int) (byte) 1);
        int[] intArray15 = ds.MaxMin4.maxMin4(intArray9, (int) (byte) 0, 0);
        int[] intArray18 = ds.MaxMin4.maxMin4(intArray9, (int) (short) 1, 1);
        int[] intArray21 = ds.MaxMin4.maxMin4(intArray18, 0, (int) (byte) 0);
        int[] intArray24 = ds.MaxMin4.maxMin4(intArray21, 0, 0);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray27 = ds.MaxMin4.maxMin4(intArray21, (int) (byte) 10, (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[100, 100, 1]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[100, 100]");
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
        org.junit.Assert.assertNotNull(intArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray24), "[100, 100]");
    }

    @Test
    public void test2027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2027");
        int[] intArray3 = new int[] { (short) 100, (short) 100, 1 };
        int[] intArray6 = ds.MaxMin4.maxMin4(intArray3, (int) (short) 0, (int) (short) 0);
        int[] intArray9 = ds.MaxMin4.maxMin4(intArray6, 1, 1);
        int[] intArray12 = ds.MaxMin4.maxMin4(intArray9, 1, (int) (short) 0);
        int[] intArray15 = ds.MaxMin4.maxMin4(intArray9, 0, (int) (short) 1);
        int[] intArray18 = ds.MaxMin4.maxMin4(intArray15, (int) (byte) 1, (int) (byte) 0);
        int[] intArray21 = ds.MaxMin4.maxMin4(intArray15, 0, (int) (byte) 0);
        int[] intArray24 = ds.MaxMin4.maxMin4(intArray15, (int) (byte) 0, 0);
        java.lang.Class<?> wildcardClass25 = intArray24.getClass();
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[100, 100, 1]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[100, 100]");
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
        org.junit.Assert.assertNotNull(intArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray24), "[100, 100]");
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test2028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2028");
        int[] intArray3 = new int[] { (short) 100, (short) 100, 1 };
        int[] intArray6 = ds.MaxMin4.maxMin4(intArray3, (int) (short) 0, (int) (short) 0);
        int[] intArray9 = ds.MaxMin4.maxMin4(intArray3, 0, 1);
        int[] intArray12 = ds.MaxMin4.maxMin4(intArray3, (int) (short) 1, (int) (short) 1);
        int[] intArray15 = ds.MaxMin4.maxMin4(intArray3, 0, (int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray18 = ds.MaxMin4.maxMin4(intArray15, 0, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[100, 100, 1]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[100, 100]");
    }

    @Test
    public void test2029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2029");
        int[] intArray3 = new int[] { (short) 100, (short) 100, 1 };
        int[] intArray6 = ds.MaxMin4.maxMin4(intArray3, (int) (short) 0, (int) (short) 0);
        int[] intArray9 = ds.MaxMin4.maxMin4(intArray3, 0, (int) (byte) 0);
        int[] intArray12 = ds.MaxMin4.maxMin4(intArray3, 0, 1);
        int[] intArray15 = ds.MaxMin4.maxMin4(intArray3, (int) (byte) 1, (int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray18 = ds.MaxMin4.maxMin4(intArray3, (-1), (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[100, 100, 1]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[100, 100]");
    }

    @Test
    public void test2030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2030");
        int[] intArray2 = new int[] { 1, (short) -1 };
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray5 = ds.MaxMin4.maxMin4(intArray2, (int) ' ', (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[1, -1]");
    }

    @Test
    public void test2031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2031");
        int[] intArray3 = new int[] { (short) 100, (short) 100, 1 };
        int[] intArray6 = ds.MaxMin4.maxMin4(intArray3, (int) (short) 0, (int) (short) 0);
        int[] intArray9 = ds.MaxMin4.maxMin4(intArray3, 0, 1);
        int[] intArray12 = ds.MaxMin4.maxMin4(intArray3, (int) (short) 1, (int) (byte) 1);
        int[] intArray15 = ds.MaxMin4.maxMin4(intArray3, 1, 0);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray18 = ds.MaxMin4.maxMin4(intArray3, (int) (short) -1, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[100, 100, 1]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[100, 100]");
    }

    @Test
    public void test2032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2032");
        int[] intArray3 = new int[] { (short) 100, (short) 100, 1 };
        int[] intArray6 = ds.MaxMin4.maxMin4(intArray3, (int) (short) 0, (int) (short) 0);
        int[] intArray9 = ds.MaxMin4.maxMin4(intArray6, 1, 1);
        int[] intArray12 = ds.MaxMin4.maxMin4(intArray9, 1, (int) (short) 0);
        int[] intArray15 = ds.MaxMin4.maxMin4(intArray12, (int) (byte) 1, (int) (byte) 0);
        int[] intArray18 = ds.MaxMin4.maxMin4(intArray12, (int) (byte) 1, (int) (byte) 1);
        int[] intArray21 = ds.MaxMin4.maxMin4(intArray12, (int) (byte) 1, 1);
        int[] intArray24 = ds.MaxMin4.maxMin4(intArray12, 1, 1);
        int[] intArray27 = ds.MaxMin4.maxMin4(intArray24, 1, 0);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray30 = ds.MaxMin4.maxMin4(intArray27, (int) (byte) 100, (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[100, 100, 1]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[100, 100]");
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
        org.junit.Assert.assertNotNull(intArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray24), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray27), "[100, 100]");
    }

    @Test
    public void test2033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2033");
        int[] intArray3 = new int[] { (short) 100, (short) 100, 1 };
        int[] intArray6 = ds.MaxMin4.maxMin4(intArray3, (int) (short) 0, (int) (short) 0);
        int[] intArray9 = ds.MaxMin4.maxMin4(intArray6, 1, 1);
        int[] intArray12 = ds.MaxMin4.maxMin4(intArray9, 1, (int) (short) 0);
        int[] intArray15 = ds.MaxMin4.maxMin4(intArray9, 1, 1);
        java.lang.Class<?> wildcardClass16 = intArray15.getClass();
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[100, 100, 1]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[100, 100]");
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test2034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2034");
        int[] intArray3 = new int[] { (short) 100, (short) 100, 1 };
        int[] intArray6 = ds.MaxMin4.maxMin4(intArray3, (int) (short) 0, (int) (short) 0);
        int[] intArray9 = ds.MaxMin4.maxMin4(intArray6, 1, 1);
        int[] intArray12 = ds.MaxMin4.maxMin4(intArray6, (int) (short) 1, 1);
        int[] intArray15 = ds.MaxMin4.maxMin4(intArray12, 0, 1);
        int[] intArray18 = ds.MaxMin4.maxMin4(intArray15, (int) (short) 1, 1);
        int[] intArray21 = ds.MaxMin4.maxMin4(intArray18, 1, 0);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray24 = ds.MaxMin4.maxMin4(intArray18, (int) (byte) -1, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[100, 100, 1]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[100, 100]");
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
    public void test2035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2035");
        int[] intArray3 = new int[] { (short) 100, (short) 100, 1 };
        int[] intArray6 = ds.MaxMin4.maxMin4(intArray3, (int) (short) 0, (int) (short) 0);
        int[] intArray9 = ds.MaxMin4.maxMin4(intArray6, 1, 1);
        int[] intArray12 = ds.MaxMin4.maxMin4(intArray6, (int) (byte) 0, 1);
        int[] intArray15 = ds.MaxMin4.maxMin4(intArray12, (int) (short) 0, 1);
        int[] intArray18 = ds.MaxMin4.maxMin4(intArray15, (int) (short) 1, 0);
        int[] intArray21 = ds.MaxMin4.maxMin4(intArray18, 1, 1);
        java.lang.Class<?> wildcardClass22 = intArray21.getClass();
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[100, 100, 1]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[100, 100]");
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
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test2036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2036");
        int[] intArray3 = new int[] { (short) 100, (short) 100, 1 };
        int[] intArray6 = ds.MaxMin4.maxMin4(intArray3, (int) (short) 0, (int) (short) 0);
        int[] intArray9 = ds.MaxMin4.maxMin4(intArray6, 1, 1);
        int[] intArray12 = ds.MaxMin4.maxMin4(intArray9, 1, (int) (short) 0);
        int[] intArray15 = ds.MaxMin4.maxMin4(intArray12, (int) (byte) 1, (int) (byte) 0);
        int[] intArray18 = ds.MaxMin4.maxMin4(intArray12, (int) (byte) 1, (int) (byte) 1);
        int[] intArray21 = ds.MaxMin4.maxMin4(intArray18, (int) (byte) 0, 1);
        int[] intArray24 = ds.MaxMin4.maxMin4(intArray21, 0, (int) (short) 1);
        int[] intArray27 = ds.MaxMin4.maxMin4(intArray24, (int) (short) 0, 0);
        int[] intArray30 = ds.MaxMin4.maxMin4(intArray24, (int) (byte) 1, (int) (short) 0);
        int[] intArray33 = ds.MaxMin4.maxMin4(intArray24, (int) (byte) 1, (int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray36 = ds.MaxMin4.maxMin4(intArray24, (int) (short) -1, (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[100, 100, 1]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[100, 100]");
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
    public void test2037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2037");
        int[] intArray3 = new int[] { (short) 100, (short) 100, 1 };
        int[] intArray6 = ds.MaxMin4.maxMin4(intArray3, (int) (short) 0, (int) (short) 0);
        int[] intArray9 = ds.MaxMin4.maxMin4(intArray6, 1, 1);
        int[] intArray12 = ds.MaxMin4.maxMin4(intArray9, 1, (int) (byte) 1);
        int[] intArray15 = ds.MaxMin4.maxMin4(intArray9, (int) (byte) 0, 0);
        int[] intArray18 = ds.MaxMin4.maxMin4(intArray9, (int) (short) 1, 1);
        int[] intArray21 = ds.MaxMin4.maxMin4(intArray9, 1, 1);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray24 = ds.MaxMin4.maxMin4(intArray9, (int) '4', 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[100, 100, 1]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[100, 100]");
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
    public void test2038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2038");
        int[] intArray3 = new int[] { (short) 100, (short) 100, 1 };
        int[] intArray6 = ds.MaxMin4.maxMin4(intArray3, (int) (short) 0, (int) (short) 0);
        int[] intArray9 = ds.MaxMin4.maxMin4(intArray6, 1, 1);
        int[] intArray12 = ds.MaxMin4.maxMin4(intArray9, 1, (int) (byte) 1);
        int[] intArray15 = ds.MaxMin4.maxMin4(intArray9, (int) (byte) 0, 0);
        int[] intArray18 = ds.MaxMin4.maxMin4(intArray9, (int) (short) 1, 1);
        int[] intArray21 = ds.MaxMin4.maxMin4(intArray18, 0, (int) (byte) 0);
        int[] intArray24 = ds.MaxMin4.maxMin4(intArray21, 0, 0);
        int[] intArray27 = ds.MaxMin4.maxMin4(intArray21, (int) (byte) 0, (int) (byte) 1);
        int[] intArray30 = ds.MaxMin4.maxMin4(intArray27, (int) (byte) 0, (int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray33 = ds.MaxMin4.maxMin4(intArray27, (int) (byte) -1, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[100, 100, 1]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[100, 100]");
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
        org.junit.Assert.assertNotNull(intArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray24), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray27), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray30);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray30), "[100, 100]");
    }

    @Test
    public void test2039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2039");
        int[] intArray3 = new int[] { (short) 100, (short) 100, 1 };
        int[] intArray6 = ds.MaxMin4.maxMin4(intArray3, (int) (short) 0, (int) (short) 0);
        int[] intArray9 = ds.MaxMin4.maxMin4(intArray6, 1, 1);
        int[] intArray12 = ds.MaxMin4.maxMin4(intArray6, (int) (short) 1, 1);
        int[] intArray15 = ds.MaxMin4.maxMin4(intArray12, 0, 1);
        int[] intArray18 = ds.MaxMin4.maxMin4(intArray15, (int) (short) 1, 1);
        int[] intArray21 = ds.MaxMin4.maxMin4(intArray18, 1, 0);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray24 = ds.MaxMin4.maxMin4(intArray21, (int) (byte) 100, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[100, 100, 1]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[100, 100]");
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
    public void test2040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2040");
        int[] intArray3 = new int[] { (short) 100, (short) 100, 1 };
        int[] intArray6 = ds.MaxMin4.maxMin4(intArray3, (int) (short) 0, (int) (short) 0);
        int[] intArray9 = ds.MaxMin4.maxMin4(intArray6, 1, 1);
        int[] intArray12 = ds.MaxMin4.maxMin4(intArray9, 1, (int) (short) 0);
        int[] intArray15 = ds.MaxMin4.maxMin4(intArray12, (int) (byte) 1, (int) (byte) 0);
        int[] intArray18 = ds.MaxMin4.maxMin4(intArray12, (int) (byte) 1, (int) (byte) 1);
        int[] intArray21 = ds.MaxMin4.maxMin4(intArray18, (int) (byte) 0, 1);
        int[] intArray24 = ds.MaxMin4.maxMin4(intArray21, 0, (int) (short) 1);
        int[] intArray27 = ds.MaxMin4.maxMin4(intArray21, (int) (short) 0, (int) (short) 1);
        int[] intArray30 = ds.MaxMin4.maxMin4(intArray27, (int) (short) 0, 0);
        int[] intArray33 = ds.MaxMin4.maxMin4(intArray30, (int) (short) 0, (int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray36 = ds.MaxMin4.maxMin4(intArray33, 0, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[100, 100, 1]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[100, 100]");
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
    public void test2041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2041");
        int[] intArray3 = new int[] { (short) 100, (short) 100, 1 };
        int[] intArray6 = ds.MaxMin4.maxMin4(intArray3, (int) (short) 0, (int) (short) 0);
        int[] intArray9 = ds.MaxMin4.maxMin4(intArray6, 1, 1);
        int[] intArray12 = ds.MaxMin4.maxMin4(intArray9, 1, (int) (short) 0);
        int[] intArray15 = ds.MaxMin4.maxMin4(intArray12, (int) (byte) 1, (int) (byte) 0);
        int[] intArray18 = ds.MaxMin4.maxMin4(intArray12, (int) (byte) 1, (int) (byte) 1);
        int[] intArray21 = ds.MaxMin4.maxMin4(intArray18, (int) (byte) 0, 1);
        int[] intArray24 = ds.MaxMin4.maxMin4(intArray21, 0, (int) (short) 1);
        int[] intArray27 = ds.MaxMin4.maxMin4(intArray24, (int) (short) 0, 0);
        int[] intArray30 = ds.MaxMin4.maxMin4(intArray24, (int) (short) 1, (int) (byte) 0);
        int[] intArray33 = ds.MaxMin4.maxMin4(intArray30, (int) (byte) 0, (int) (short) 0);
        int[] intArray36 = ds.MaxMin4.maxMin4(intArray33, 0, 0);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray39 = ds.MaxMin4.maxMin4(intArray33, 10, (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[100, 100, 1]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[100, 100]");
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
    public void test2042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2042");
        int[] intArray3 = new int[] { (short) 100, (short) 100, 1 };
        int[] intArray6 = ds.MaxMin4.maxMin4(intArray3, (int) (short) 0, (int) (short) 0);
        int[] intArray9 = ds.MaxMin4.maxMin4(intArray3, 0, (int) (byte) 0);
        int[] intArray12 = ds.MaxMin4.maxMin4(intArray9, 0, (int) (short) 1);
        int[] intArray15 = ds.MaxMin4.maxMin4(intArray9, (int) (byte) 0, (int) (byte) 1);
        int[] intArray18 = ds.MaxMin4.maxMin4(intArray15, 1, (int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray21 = ds.MaxMin4.maxMin4(intArray18, (int) (short) 100, 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[100, 100, 1]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[100, 100]");
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
    public void test2043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2043");
        int[] intArray0 = null;
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray3 = ds.MaxMin4.maxMin4(intArray0, (int) '4', (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2044");
        int[] intArray3 = new int[] { (short) 100, (short) 100, 1 };
        int[] intArray6 = ds.MaxMin4.maxMin4(intArray3, (int) (short) 0, (int) (short) 0);
        int[] intArray9 = ds.MaxMin4.maxMin4(intArray3, 0, 1);
        int[] intArray12 = ds.MaxMin4.maxMin4(intArray3, (int) (short) 1, (int) (byte) 1);
        int[] intArray15 = ds.MaxMin4.maxMin4(intArray12, (int) (byte) 1, 0);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray18 = ds.MaxMin4.maxMin4(intArray15, (int) (short) -1, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[100, 100, 1]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[100, 100]");
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
        int[] intArray3 = new int[] { (short) 100, (short) 100, 1 };
        int[] intArray6 = ds.MaxMin4.maxMin4(intArray3, (int) (short) 0, (int) (short) 0);
        int[] intArray9 = ds.MaxMin4.maxMin4(intArray6, 1, 1);
        int[] intArray12 = ds.MaxMin4.maxMin4(intArray9, 1, (int) (byte) 1);
        int[] intArray15 = ds.MaxMin4.maxMin4(intArray9, 1, 0);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray18 = ds.MaxMin4.maxMin4(intArray15, 100, (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[100, 100, 1]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[100, 100]");
    }

    @Test
    public void test2046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2046");
        int[] intArray0 = null;
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray3 = ds.MaxMin4.maxMin4(intArray0, (int) (byte) 10, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2047");
        int[] intArray3 = new int[] { (short) 100, (short) 100, 1 };
        int[] intArray6 = ds.MaxMin4.maxMin4(intArray3, (int) (short) 0, (int) (short) 0);
        int[] intArray9 = ds.MaxMin4.maxMin4(intArray3, 0, 1);
        int[] intArray12 = ds.MaxMin4.maxMin4(intArray3, (int) (short) 1, (int) (byte) 1);
        int[] intArray15 = ds.MaxMin4.maxMin4(intArray12, (int) (byte) 1, 0);
        int[] intArray18 = ds.MaxMin4.maxMin4(intArray15, 0, 0);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray21 = ds.MaxMin4.maxMin4(intArray18, (int) (short) 1, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[100, 100, 1]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[100, 100]");
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
    public void test2048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2048");
        int[] intArray3 = new int[] { (short) 100, (short) 100, 1 };
        int[] intArray6 = ds.MaxMin4.maxMin4(intArray3, (int) (short) 0, (int) (short) 0);
        int[] intArray9 = ds.MaxMin4.maxMin4(intArray6, (int) (short) 0, 0);
        int[] intArray12 = ds.MaxMin4.maxMin4(intArray6, (int) (byte) 1, 1);
        int[] intArray15 = ds.MaxMin4.maxMin4(intArray6, (int) (short) 1, (int) (short) 1);
        int[] intArray18 = ds.MaxMin4.maxMin4(intArray6, 0, (int) (short) 0);
        int[] intArray21 = ds.MaxMin4.maxMin4(intArray6, (int) (byte) 0, 1);
        int[] intArray24 = ds.MaxMin4.maxMin4(intArray21, (int) (short) 1, 0);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray27 = ds.MaxMin4.maxMin4(intArray24, (int) 'a', (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[100, 100, 1]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[100, 100]");
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
        org.junit.Assert.assertNotNull(intArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray24), "[100, 100]");
    }

    @Test
    public void test2049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2049");
        int[] intArray3 = new int[] { (short) 100, (short) 100, 1 };
        int[] intArray6 = ds.MaxMin4.maxMin4(intArray3, (int) (short) 0, (int) (short) 0);
        int[] intArray9 = ds.MaxMin4.maxMin4(intArray6, 1, 1);
        int[] intArray12 = ds.MaxMin4.maxMin4(intArray9, 1, (int) (byte) 1);
        int[] intArray15 = ds.MaxMin4.maxMin4(intArray9, 1, 0);
        int[] intArray18 = ds.MaxMin4.maxMin4(intArray15, 0, 0);
        int[] intArray21 = ds.MaxMin4.maxMin4(intArray18, 0, 1);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray24 = ds.MaxMin4.maxMin4(intArray21, (-1), (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[100, 100, 1]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[100, 100]");
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
    public void test2050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2050");
        int[] intArray3 = new int[] { (short) 100, (short) 100, 1 };
        int[] intArray6 = ds.MaxMin4.maxMin4(intArray3, (int) (short) 0, (int) (short) 0);
        int[] intArray9 = ds.MaxMin4.maxMin4(intArray6, 1, 1);
        int[] intArray12 = ds.MaxMin4.maxMin4(intArray9, (int) (byte) 1, (int) (short) 0);
        int[] intArray15 = ds.MaxMin4.maxMin4(intArray9, 1, 1);
        int[] intArray18 = ds.MaxMin4.maxMin4(intArray9, 0, (int) (byte) 0);
        int[] intArray21 = ds.MaxMin4.maxMin4(intArray18, 1, 0);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray24 = ds.MaxMin4.maxMin4(intArray21, (int) (short) 0, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[100, 100, 1]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[100, 100]");
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
    public void test2051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2051");
        int[] intArray0 = null;
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray3 = ds.MaxMin4.maxMin4(intArray0, (int) '#', 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2052");
        int[] intArray3 = new int[] { (short) 100, (short) 100, 1 };
        int[] intArray6 = ds.MaxMin4.maxMin4(intArray3, (int) (short) 0, (int) (short) 0);
        int[] intArray9 = ds.MaxMin4.maxMin4(intArray3, 0, 1);
        int[] intArray12 = ds.MaxMin4.maxMin4(intArray9, 0, (int) (short) 0);
        int[] intArray15 = ds.MaxMin4.maxMin4(intArray12, (int) (byte) 1, (int) (byte) 0);
        int[] intArray18 = ds.MaxMin4.maxMin4(intArray12, (int) (byte) 0, (int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray21 = ds.MaxMin4.maxMin4(intArray18, (int) (short) -1, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[100, 100, 1]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[100, 100]");
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
        int[] intArray3 = new int[] { (short) 100, (short) 100, 1 };
        int[] intArray6 = ds.MaxMin4.maxMin4(intArray3, (int) (short) 0, (int) (short) 0);
        int[] intArray9 = ds.MaxMin4.maxMin4(intArray6, 1, 1);
        int[] intArray12 = ds.MaxMin4.maxMin4(intArray9, 1, (int) (short) 0);
        int[] intArray15 = ds.MaxMin4.maxMin4(intArray12, (int) (byte) 1, (int) (byte) 0);
        int[] intArray18 = ds.MaxMin4.maxMin4(intArray12, (int) (byte) 1, (int) (byte) 1);
        int[] intArray21 = ds.MaxMin4.maxMin4(intArray12, (int) (byte) 1, 1);
        int[] intArray24 = ds.MaxMin4.maxMin4(intArray12, 1, 1);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray27 = ds.MaxMin4.maxMin4(intArray24, (int) (byte) 0, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[100, 100, 1]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[100, 100]");
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
        org.junit.Assert.assertNotNull(intArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray24), "[100, 100]");
    }

    @Test
    public void test2054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2054");
        int[] intArray3 = new int[] { (short) 100, (short) 100, 1 };
        int[] intArray6 = ds.MaxMin4.maxMin4(intArray3, (int) (short) 0, (int) (short) 0);
        int[] intArray9 = ds.MaxMin4.maxMin4(intArray6, 1, 1);
        int[] intArray12 = ds.MaxMin4.maxMin4(intArray9, 1, (int) (byte) 1);
        int[] intArray15 = ds.MaxMin4.maxMin4(intArray9, (int) (byte) 0, 0);
        int[] intArray18 = ds.MaxMin4.maxMin4(intArray9, (int) (short) 1, 1);
        int[] intArray21 = ds.MaxMin4.maxMin4(intArray9, (int) (byte) 0, 0);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray24 = ds.MaxMin4.maxMin4(intArray9, (-1), (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[100, 100, 1]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[100, 100]");
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
    public void test2055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2055");
        int[] intArray3 = new int[] { (short) 100, (short) 100, 1 };
        int[] intArray6 = ds.MaxMin4.maxMin4(intArray3, (int) (short) 0, (int) (short) 0);
        int[] intArray9 = ds.MaxMin4.maxMin4(intArray6, 1, 1);
        int[] intArray12 = ds.MaxMin4.maxMin4(intArray9, (int) (byte) 1, (int) (short) 0);
        int[] intArray15 = ds.MaxMin4.maxMin4(intArray9, 1, 1);
        int[] intArray18 = ds.MaxMin4.maxMin4(intArray9, 0, (int) (byte) 0);
        int[] intArray21 = ds.MaxMin4.maxMin4(intArray18, 1, 0);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray24 = ds.MaxMin4.maxMin4(intArray21, (int) (byte) 10, (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[100, 100, 1]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[100, 100]");
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
    public void test2056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2056");
        int[] intArray3 = new int[] { (short) 100, (short) 100, 1 };
        int[] intArray6 = ds.MaxMin4.maxMin4(intArray3, (int) (short) 0, (int) (short) 0);
        int[] intArray9 = ds.MaxMin4.maxMin4(intArray6, 1, 1);
        int[] intArray12 = ds.MaxMin4.maxMin4(intArray9, 1, (int) (byte) 1);
        int[] intArray15 = ds.MaxMin4.maxMin4(intArray12, 0, (int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray18 = ds.MaxMin4.maxMin4(intArray15, (int) (short) 100, 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[100, 100, 1]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[100, 100]");
    }

    @Test
    public void test2057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2057");
        int[] intArray3 = new int[] { (short) 100, (short) 100, 1 };
        int[] intArray6 = ds.MaxMin4.maxMin4(intArray3, (int) (short) 0, (int) (short) 0);
        int[] intArray9 = ds.MaxMin4.maxMin4(intArray6, 1, 1);
        int[] intArray12 = ds.MaxMin4.maxMin4(intArray9, 1, (int) (short) 0);
        int[] intArray15 = ds.MaxMin4.maxMin4(intArray12, (int) (byte) 1, (int) (byte) 0);
        int[] intArray18 = ds.MaxMin4.maxMin4(intArray12, (int) (byte) 1, (int) (byte) 1);
        int[] intArray21 = ds.MaxMin4.maxMin4(intArray18, (int) (byte) 0, 1);
        int[] intArray24 = ds.MaxMin4.maxMin4(intArray21, 0, (int) (short) 1);
        int[] intArray27 = ds.MaxMin4.maxMin4(intArray21, (int) (short) 0, (int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray30 = ds.MaxMin4.maxMin4(intArray21, (int) (short) -1, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[100, 100, 1]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[100, 100]");
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
        org.junit.Assert.assertNotNull(intArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray24), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray27), "[100, 100]");
    }

    @Test
    public void test2058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2058");
        int[] intArray3 = new int[] { (short) 100, (short) 100, 1 };
        int[] intArray6 = ds.MaxMin4.maxMin4(intArray3, (int) (short) 0, (int) (short) 0);
        int[] intArray9 = ds.MaxMin4.maxMin4(intArray6, 1, 1);
        int[] intArray12 = ds.MaxMin4.maxMin4(intArray6, (int) (short) 1, 1);
        int[] intArray15 = ds.MaxMin4.maxMin4(intArray12, 0, 1);
        int[] intArray18 = ds.MaxMin4.maxMin4(intArray12, (int) (short) 1, 1);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray21 = ds.MaxMin4.maxMin4(intArray18, (int) 'a', (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[100, 100, 1]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[100, 100]");
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
    public void test2059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2059");
        int[] intArray3 = new int[] { (short) 100, (short) 100, 1 };
        int[] intArray6 = ds.MaxMin4.maxMin4(intArray3, (int) (short) 0, (int) (short) 0);
        int[] intArray9 = ds.MaxMin4.maxMin4(intArray6, 1, 1);
        int[] intArray12 = ds.MaxMin4.maxMin4(intArray9, 1, (int) (short) 0);
        int[] intArray15 = ds.MaxMin4.maxMin4(intArray12, (int) (byte) 1, (int) (byte) 0);
        int[] intArray18 = ds.MaxMin4.maxMin4(intArray12, (int) (byte) 1, (int) (byte) 1);
        int[] intArray21 = ds.MaxMin4.maxMin4(intArray18, (int) (byte) 0, 1);
        int[] intArray24 = ds.MaxMin4.maxMin4(intArray21, 0, (int) (short) 1);
        int[] intArray27 = ds.MaxMin4.maxMin4(intArray21, (int) (short) 0, (int) (short) 1);
        int[] intArray30 = ds.MaxMin4.maxMin4(intArray27, (int) (short) 0, 0);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray33 = ds.MaxMin4.maxMin4(intArray27, (int) 'a', (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[100, 100, 1]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[100, 100]");
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
        org.junit.Assert.assertNotNull(intArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray24), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray27), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray30);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray30), "[100, 100]");
    }

    @Test
    public void test2060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2060");
        int[] intArray3 = new int[] { (short) 100, (short) 100, 1 };
        int[] intArray6 = ds.MaxMin4.maxMin4(intArray3, (int) (short) 0, (int) (short) 0);
        int[] intArray9 = ds.MaxMin4.maxMin4(intArray6, 1, 1);
        int[] intArray12 = ds.MaxMin4.maxMin4(intArray9, 1, (int) (short) 0);
        int[] intArray15 = ds.MaxMin4.maxMin4(intArray9, 1, 1);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray18 = ds.MaxMin4.maxMin4(intArray15, 10, (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[100, 100, 1]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[100, 100]");
    }

    @Test
    public void test2061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2061");
        int[] intArray0 = null;
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray3 = ds.MaxMin4.maxMin4(intArray0, (int) '4', (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2062");
        int[] intArray3 = new int[] { (short) 100, (short) 100, 1 };
        int[] intArray6 = ds.MaxMin4.maxMin4(intArray3, (int) (short) 0, (int) (short) 0);
        int[] intArray9 = ds.MaxMin4.maxMin4(intArray6, 1, 1);
        int[] intArray12 = ds.MaxMin4.maxMin4(intArray9, 1, (int) (short) 0);
        int[] intArray15 = ds.MaxMin4.maxMin4(intArray9, 0, (int) (short) 1);
        int[] intArray18 = ds.MaxMin4.maxMin4(intArray15, (int) (byte) 1, (int) (byte) 0);
        int[] intArray21 = ds.MaxMin4.maxMin4(intArray18, 0, (int) (short) 0);
        int[] intArray24 = ds.MaxMin4.maxMin4(intArray21, (int) (byte) 1, (int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray27 = ds.MaxMin4.maxMin4(intArray21, (int) 'a', 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[100, 100, 1]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[100, 100]");
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
        org.junit.Assert.assertNotNull(intArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray24), "[100, 100]");
    }

    @Test
    public void test2063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2063");
        int[] intArray3 = new int[] { (short) 100, (short) 100, 1 };
        int[] intArray6 = ds.MaxMin4.maxMin4(intArray3, (int) (short) 0, (int) (short) 0);
        int[] intArray9 = ds.MaxMin4.maxMin4(intArray3, 0, 1);
        int[] intArray12 = ds.MaxMin4.maxMin4(intArray9, 0, (int) (short) 0);
        int[] intArray15 = ds.MaxMin4.maxMin4(intArray9, (int) (short) 1, 0);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray18 = ds.MaxMin4.maxMin4(intArray9, 1, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[100, 100, 1]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[100, 100]");
    }

    @Test
    public void test2064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2064");
        int[] intArray3 = new int[] { (short) 100, (short) 100, 1 };
        int[] intArray6 = ds.MaxMin4.maxMin4(intArray3, (int) (short) 0, (int) (short) 0);
        int[] intArray9 = ds.MaxMin4.maxMin4(intArray3, 0, 1);
        int[] intArray12 = ds.MaxMin4.maxMin4(intArray3, (int) (short) 1, (int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray15 = ds.MaxMin4.maxMin4(intArray3, (int) ' ', 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[100, 100, 1]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[100, 100]");
    }

    @Test
    public void test2065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2065");
        int[] intArray3 = new int[] { (short) 100, (short) 100, 1 };
        int[] intArray6 = ds.MaxMin4.maxMin4(intArray3, (int) (short) 0, (int) (short) 0);
        int[] intArray9 = ds.MaxMin4.maxMin4(intArray6, 1, 1);
        int[] intArray12 = ds.MaxMin4.maxMin4(intArray9, 1, (int) (short) 0);
        int[] intArray15 = ds.MaxMin4.maxMin4(intArray12, (int) (byte) 1, (int) (byte) 0);
        int[] intArray18 = ds.MaxMin4.maxMin4(intArray12, (int) (byte) 1, (int) (byte) 1);
        int[] intArray21 = ds.MaxMin4.maxMin4(intArray12, (int) (byte) 1, 1);
        int[] intArray24 = ds.MaxMin4.maxMin4(intArray12, 1, 1);
        int[] intArray27 = ds.MaxMin4.maxMin4(intArray24, (int) (byte) 0, (int) (short) 0);
        int[] intArray30 = ds.MaxMin4.maxMin4(intArray24, (int) (short) 0, 1);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray33 = ds.MaxMin4.maxMin4(intArray30, (int) (byte) 1, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[100, 100, 1]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[100, 100]");
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
        org.junit.Assert.assertNotNull(intArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray24), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray27), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray30);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray30), "[100, 100]");
    }

    @Test
    public void test2066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2066");
        int[] intArray3 = new int[] { (short) 100, (short) 100, 1 };
        int[] intArray6 = ds.MaxMin4.maxMin4(intArray3, (int) (short) 0, (int) (short) 0);
        int[] intArray9 = ds.MaxMin4.maxMin4(intArray3, 0, (int) (byte) 0);
        int[] intArray12 = ds.MaxMin4.maxMin4(intArray3, 0, 1);
        int[] intArray15 = ds.MaxMin4.maxMin4(intArray3, (int) (byte) 1, (int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray18 = ds.MaxMin4.maxMin4(intArray15, 100, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[100, 100, 1]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[100, 100]");
    }

    @Test
    public void test2067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2067");
        int[] intArray3 = new int[] { (short) 100, (short) 100, 1 };
        int[] intArray6 = ds.MaxMin4.maxMin4(intArray3, (int) (short) 0, (int) (short) 0);
        int[] intArray9 = ds.MaxMin4.maxMin4(intArray6, 1, 1);
        int[] intArray12 = ds.MaxMin4.maxMin4(intArray9, 1, (int) (short) 0);
        int[] intArray15 = ds.MaxMin4.maxMin4(intArray12, (int) (byte) 1, (int) (byte) 0);
        int[] intArray18 = ds.MaxMin4.maxMin4(intArray12, (int) (byte) 1, (int) (byte) 1);
        int[] intArray21 = ds.MaxMin4.maxMin4(intArray18, (int) (byte) 0, 1);
        int[] intArray24 = ds.MaxMin4.maxMin4(intArray21, 0, (int) (short) 1);
        int[] intArray27 = ds.MaxMin4.maxMin4(intArray24, (int) (short) 0, 0);
        int[] intArray30 = ds.MaxMin4.maxMin4(intArray24, (int) (short) 1, (int) (byte) 0);
        int[] intArray33 = ds.MaxMin4.maxMin4(intArray24, 0, 0);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray36 = ds.MaxMin4.maxMin4(intArray33, (int) (short) 0, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[100, 100, 1]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[100, 100]");
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
    public void test2068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2068");
        int[] intArray3 = new int[] { (short) 100, (short) 100, 1 };
        int[] intArray6 = ds.MaxMin4.maxMin4(intArray3, (int) (short) 0, (int) (short) 0);
        int[] intArray9 = ds.MaxMin4.maxMin4(intArray6, 1, 1);
        int[] intArray12 = ds.MaxMin4.maxMin4(intArray9, (int) (byte) 1, (int) (short) 0);
        int[] intArray15 = ds.MaxMin4.maxMin4(intArray9, 1, 1);
        int[] intArray18 = ds.MaxMin4.maxMin4(intArray9, 0, (int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray21 = ds.MaxMin4.maxMin4(intArray18, 100, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[100, 100, 1]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[100, 100]");
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
    public void test2069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2069");
        int[] intArray3 = new int[] { (short) 100, (short) 100, 1 };
        int[] intArray6 = ds.MaxMin4.maxMin4(intArray3, (int) (short) 0, (int) (short) 0);
        int[] intArray9 = ds.MaxMin4.maxMin4(intArray6, 1, 1);
        int[] intArray12 = ds.MaxMin4.maxMin4(intArray6, (int) (byte) 0, 1);
        int[] intArray15 = ds.MaxMin4.maxMin4(intArray12, (int) (short) 0, 1);
        int[] intArray18 = ds.MaxMin4.maxMin4(intArray15, (int) (byte) 1, (int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray21 = ds.MaxMin4.maxMin4(intArray15, 10, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[100, 100, 1]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[100, 100]");
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
    public void test2070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2070");
        int[] intArray3 = new int[] { (short) 100, (short) 100, 1 };
        int[] intArray6 = ds.MaxMin4.maxMin4(intArray3, (int) (short) 0, (int) (short) 0);
        int[] intArray9 = ds.MaxMin4.maxMin4(intArray6, (int) (short) 0, 0);
        int[] intArray12 = ds.MaxMin4.maxMin4(intArray6, (int) (byte) 1, 1);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray15 = ds.MaxMin4.maxMin4(intArray12, (int) '#', (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[100, 100, 1]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[100, 100]");
    }

    @Test
    public void test2071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2071");
        int[] intArray3 = new int[] { (short) 100, (short) 100, 1 };
        int[] intArray6 = ds.MaxMin4.maxMin4(intArray3, (int) (short) 0, (int) (short) 0);
        int[] intArray9 = ds.MaxMin4.maxMin4(intArray6, 1, 1);
        int[] intArray12 = ds.MaxMin4.maxMin4(intArray6, (int) (short) 1, 1);
        int[] intArray15 = ds.MaxMin4.maxMin4(intArray12, 0, 1);
        int[] intArray18 = ds.MaxMin4.maxMin4(intArray12, (int) (short) 1, 1);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray21 = ds.MaxMin4.maxMin4(intArray18, (int) (byte) 10, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[100, 100, 1]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[100, 100]");
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
    public void test2072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2072");
        int[] intArray3 = new int[] { (short) 100, (short) 100, 1 };
        int[] intArray6 = ds.MaxMin4.maxMin4(intArray3, (int) (short) 0, (int) (short) 0);
        int[] intArray9 = ds.MaxMin4.maxMin4(intArray6, 1, 1);
        int[] intArray12 = ds.MaxMin4.maxMin4(intArray9, 1, (int) (short) 0);
        int[] intArray15 = ds.MaxMin4.maxMin4(intArray9, 0, (int) (short) 1);
        int[] intArray18 = ds.MaxMin4.maxMin4(intArray15, (int) (byte) 1, (int) (byte) 0);
        int[] intArray21 = ds.MaxMin4.maxMin4(intArray18, 0, (int) (short) 0);
        int[] intArray24 = ds.MaxMin4.maxMin4(intArray18, 1, 0);
        int[] intArray27 = ds.MaxMin4.maxMin4(intArray24, 1, (int) (byte) 0);
        java.lang.Class<?> wildcardClass28 = intArray24.getClass();
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[100, 100, 1]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[100, 100]");
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
        org.junit.Assert.assertNotNull(intArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray24), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray27), "[100, 100]");
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test2073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2073");
        int[] intArray3 = new int[] { (short) 100, (short) 100, 1 };
        int[] intArray6 = ds.MaxMin4.maxMin4(intArray3, (int) (short) 0, (int) (short) 0);
        int[] intArray9 = ds.MaxMin4.maxMin4(intArray6, 1, 1);
        int[] intArray12 = ds.MaxMin4.maxMin4(intArray9, 1, (int) (byte) 1);
        int[] intArray15 = ds.MaxMin4.maxMin4(intArray9, (int) (byte) 0, 0);
        int[] intArray18 = ds.MaxMin4.maxMin4(intArray9, (int) (short) 1, 1);
        int[] intArray21 = ds.MaxMin4.maxMin4(intArray18, 0, 0);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray24 = ds.MaxMin4.maxMin4(intArray18, (int) (short) -1, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[100, 100, 1]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[100, 100]");
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
    public void test2074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2074");
        int[] intArray3 = new int[] { (short) 100, (short) 100, 1 };
        int[] intArray6 = ds.MaxMin4.maxMin4(intArray3, (int) (short) 0, (int) (short) 0);
        int[] intArray9 = ds.MaxMin4.maxMin4(intArray6, 1, 1);
        int[] intArray12 = ds.MaxMin4.maxMin4(intArray9, 1, (int) (short) 0);
        int[] intArray15 = ds.MaxMin4.maxMin4(intArray12, (int) (byte) 1, (int) (byte) 0);
        int[] intArray18 = ds.MaxMin4.maxMin4(intArray12, 0, (int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray21 = ds.MaxMin4.maxMin4(intArray12, (int) (byte) 1, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[100, 100, 1]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[100, 100]");
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
    public void test2075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2075");
        int[] intArray3 = new int[] { (short) 100, (short) 100, 1 };
        int[] intArray6 = ds.MaxMin4.maxMin4(intArray3, (int) (short) 0, (int) (short) 0);
        int[] intArray9 = ds.MaxMin4.maxMin4(intArray6, 1, 1);
        int[] intArray12 = ds.MaxMin4.maxMin4(intArray9, 1, (int) (short) 0);
        int[] intArray15 = ds.MaxMin4.maxMin4(intArray9, 0, (int) (short) 1);
        int[] intArray18 = ds.MaxMin4.maxMin4(intArray15, (int) (byte) 1, (int) (byte) 0);
        int[] intArray21 = ds.MaxMin4.maxMin4(intArray18, (int) (byte) 1, (int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray24 = ds.MaxMin4.maxMin4(intArray21, 0, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[100, 100, 1]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[100, 100]");
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
    public void test2076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2076");
        int[] intArray3 = new int[] { (short) 100, (short) 100, 1 };
        int[] intArray6 = ds.MaxMin4.maxMin4(intArray3, (int) (short) 0, (int) (short) 0);
        int[] intArray9 = ds.MaxMin4.maxMin4(intArray6, 1, 1);
        int[] intArray12 = ds.MaxMin4.maxMin4(intArray9, 1, (int) (short) 0);
        int[] intArray15 = ds.MaxMin4.maxMin4(intArray9, 0, (int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray18 = ds.MaxMin4.maxMin4(intArray15, (int) (byte) 1, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[100, 100, 1]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[100, 100]");
    }

    @Test
    public void test2077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2077");
        int[] intArray3 = new int[] { (short) 100, (short) 100, 1 };
        int[] intArray6 = ds.MaxMin4.maxMin4(intArray3, (int) (short) 0, (int) (short) 0);
        int[] intArray9 = ds.MaxMin4.maxMin4(intArray3, 0, 1);
        int[] intArray12 = ds.MaxMin4.maxMin4(intArray9, 0, (int) (short) 0);
        int[] intArray15 = ds.MaxMin4.maxMin4(intArray12, (int) (byte) 1, (int) (byte) 0);
        int[] intArray18 = ds.MaxMin4.maxMin4(intArray12, (int) (byte) 0, (int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray21 = ds.MaxMin4.maxMin4(intArray18, 100, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[100, 100, 1]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[100, 100]");
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
    public void test2078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2078");
        int[] intArray3 = new int[] { (short) 100, (short) 100, 1 };
        int[] intArray6 = ds.MaxMin4.maxMin4(intArray3, (int) (short) 0, (int) (short) 0);
        int[] intArray9 = ds.MaxMin4.maxMin4(intArray6, (int) (short) 0, 0);
        int[] intArray12 = ds.MaxMin4.maxMin4(intArray6, (int) (byte) 1, 1);
        int[] intArray15 = ds.MaxMin4.maxMin4(intArray6, (int) (short) 1, (int) (short) 1);
        int[] intArray18 = ds.MaxMin4.maxMin4(intArray15, 1, 0);
        int[] intArray21 = ds.MaxMin4.maxMin4(intArray15, 1, 1);
        int[] intArray24 = ds.MaxMin4.maxMin4(intArray15, 1, 0);
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[100, 100, 1]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[100, 100]");
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
        org.junit.Assert.assertNotNull(intArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray24), "[100, 100]");
    }

    @Test
    public void test2079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2079");
        int[] intArray3 = new int[] { (short) 100, (short) 100, 1 };
        int[] intArray6 = ds.MaxMin4.maxMin4(intArray3, (int) (short) 0, (int) (short) 0);
        int[] intArray9 = ds.MaxMin4.maxMin4(intArray6, 1, 1);
        int[] intArray12 = ds.MaxMin4.maxMin4(intArray9, 1, (int) (byte) 1);
        int[] intArray15 = ds.MaxMin4.maxMin4(intArray9, 1, 0);
        int[] intArray18 = ds.MaxMin4.maxMin4(intArray9, (int) (short) 0, 0);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray21 = ds.MaxMin4.maxMin4(intArray9, (int) (byte) 100, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[100, 100, 1]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[100, 100]");
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
    public void test2080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2080");
        int[] intArray3 = new int[] { (short) 100, (short) 100, 1 };
        int[] intArray6 = ds.MaxMin4.maxMin4(intArray3, (int) (short) 0, (int) (short) 0);
        int[] intArray9 = ds.MaxMin4.maxMin4(intArray6, 1, 1);
        int[] intArray12 = ds.MaxMin4.maxMin4(intArray9, 1, (int) (byte) 1);
        int[] intArray15 = ds.MaxMin4.maxMin4(intArray9, (int) (byte) 0, 0);
        int[] intArray18 = ds.MaxMin4.maxMin4(intArray9, (int) (short) 1, 1);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray21 = ds.MaxMin4.maxMin4(intArray9, (int) (byte) 100, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[100, 100, 1]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[100, 100]");
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
    public void test2081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2081");
        int[] intArray3 = new int[] { (short) 100, (short) 100, 1 };
        int[] intArray6 = ds.MaxMin4.maxMin4(intArray3, (int) (short) 0, (int) (short) 0);
        int[] intArray9 = ds.MaxMin4.maxMin4(intArray3, 0, (int) (byte) 1);
        int[] intArray12 = ds.MaxMin4.maxMin4(intArray9, 1, 1);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray15 = ds.MaxMin4.maxMin4(intArray12, 0, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[100, 100, 1]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[100, 100]");
    }

    @Test
    public void test2082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2082");
        int[] intArray3 = new int[] { (short) 100, (short) 100, 1 };
        int[] intArray6 = ds.MaxMin4.maxMin4(intArray3, (int) (short) 0, (int) (short) 0);
        int[] intArray9 = ds.MaxMin4.maxMin4(intArray6, 1, 1);
        int[] intArray12 = ds.MaxMin4.maxMin4(intArray9, 1, (int) (short) 0);
        int[] intArray15 = ds.MaxMin4.maxMin4(intArray12, (int) (byte) 1, (int) (byte) 0);
        int[] intArray18 = ds.MaxMin4.maxMin4(intArray12, (int) (byte) 1, (int) (byte) 1);
        int[] intArray21 = ds.MaxMin4.maxMin4(intArray12, 0, (int) (byte) 0);
        java.lang.Class<?> wildcardClass22 = intArray12.getClass();
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[100, 100, 1]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[100, 100]");
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
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test2083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2083");
        int[] intArray0 = null;
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray3 = ds.MaxMin4.maxMin4(intArray0, (int) '#', (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2084");
        int[] intArray3 = new int[] { (short) 100, (short) 100, 1 };
        int[] intArray6 = ds.MaxMin4.maxMin4(intArray3, (int) (short) 0, (int) (short) 0);
        int[] intArray9 = ds.MaxMin4.maxMin4(intArray3, 0, 1);
        int[] intArray12 = ds.MaxMin4.maxMin4(intArray9, 0, (int) (short) 0);
        int[] intArray15 = ds.MaxMin4.maxMin4(intArray12, (int) (byte) 1, (int) (byte) 0);
        int[] intArray18 = ds.MaxMin4.maxMin4(intArray15, (int) (short) 1, 0);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray21 = ds.MaxMin4.maxMin4(intArray18, 10, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[100, 100, 1]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[100, 100]");
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
    public void test2085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2085");
        int[] intArray3 = new int[] { (short) 100, (short) 100, 1 };
        int[] intArray6 = ds.MaxMin4.maxMin4(intArray3, (int) (short) 0, (int) (short) 0);
        int[] intArray9 = ds.MaxMin4.maxMin4(intArray6, 1, 1);
        int[] intArray12 = ds.MaxMin4.maxMin4(intArray9, 1, (int) (byte) 1);
        int[] intArray15 = ds.MaxMin4.maxMin4(intArray9, (int) (byte) 0, 0);
        int[] intArray18 = ds.MaxMin4.maxMin4(intArray9, (int) (short) 1, 1);
        int[] intArray21 = ds.MaxMin4.maxMin4(intArray9, 1, 1);
        java.lang.Class<?> wildcardClass22 = intArray9.getClass();
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[100, 100, 1]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[100, 100]");
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
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test2086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2086");
        int[] intArray3 = new int[] { (short) 100, (short) 100, 1 };
        int[] intArray6 = ds.MaxMin4.maxMin4(intArray3, (int) (short) 0, (int) (short) 0);
        int[] intArray9 = ds.MaxMin4.maxMin4(intArray6, 1, 1);
        int[] intArray12 = ds.MaxMin4.maxMin4(intArray9, 1, (int) (short) 0);
        int[] intArray15 = ds.MaxMin4.maxMin4(intArray12, (int) (byte) 1, (int) (byte) 0);
        int[] intArray18 = ds.MaxMin4.maxMin4(intArray12, (int) (byte) 1, (int) (byte) 1);
        int[] intArray21 = ds.MaxMin4.maxMin4(intArray18, 0, 0);
        java.lang.Class<?> wildcardClass22 = intArray18.getClass();
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[100, 100, 1]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[100, 100]");
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
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test2087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2087");
        int[] intArray3 = new int[] { (short) 100, (short) 100, 1 };
        int[] intArray6 = ds.MaxMin4.maxMin4(intArray3, (int) (short) 0, (int) (short) 0);
        int[] intArray9 = ds.MaxMin4.maxMin4(intArray6, 1, 1);
        int[] intArray12 = ds.MaxMin4.maxMin4(intArray9, 1, (int) (short) 0);
        int[] intArray15 = ds.MaxMin4.maxMin4(intArray12, (int) (byte) 1, (int) (byte) 0);
        int[] intArray18 = ds.MaxMin4.maxMin4(intArray12, (int) (byte) 1, (int) (byte) 1);
        int[] intArray21 = ds.MaxMin4.maxMin4(intArray18, (int) (byte) 0, 1);
        int[] intArray24 = ds.MaxMin4.maxMin4(intArray21, 0, (int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray27 = ds.MaxMin4.maxMin4(intArray21, (int) '#', (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[100, 100, 1]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[100, 100]");
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
        org.junit.Assert.assertNotNull(intArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray24), "[100, 100]");
    }

    @Test
    public void test2088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2088");
        int[] intArray3 = new int[] { (short) 100, (short) 100, 1 };
        int[] intArray6 = ds.MaxMin4.maxMin4(intArray3, (int) (short) 0, (int) (short) 0);
        int[] intArray9 = ds.MaxMin4.maxMin4(intArray6, 1, 1);
        int[] intArray12 = ds.MaxMin4.maxMin4(intArray9, 1, (int) (short) 0);
        int[] intArray15 = ds.MaxMin4.maxMin4(intArray12, (int) (byte) 1, (int) (byte) 0);
        int[] intArray18 = ds.MaxMin4.maxMin4(intArray12, (int) (byte) 1, (int) (byte) 1);
        int[] intArray21 = ds.MaxMin4.maxMin4(intArray18, (int) (byte) 0, 1);
        int[] intArray24 = ds.MaxMin4.maxMin4(intArray21, 0, (int) (short) 1);
        int[] intArray27 = ds.MaxMin4.maxMin4(intArray21, (int) (short) 0, (int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray30 = ds.MaxMin4.maxMin4(intArray27, (int) ' ', 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[100, 100, 1]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[100, 100]");
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
        org.junit.Assert.assertNotNull(intArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray24), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray27), "[100, 100]");
    }

    @Test
    public void test2089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2089");
        int[] intArray3 = new int[] { (short) 100, (short) 100, 1 };
        int[] intArray6 = ds.MaxMin4.maxMin4(intArray3, (int) (short) 0, (int) (short) 0);
        int[] intArray9 = ds.MaxMin4.maxMin4(intArray3, 0, (int) (byte) 1);
        int[] intArray12 = ds.MaxMin4.maxMin4(intArray9, (int) (byte) 1, (int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray15 = ds.MaxMin4.maxMin4(intArray12, (int) '#', (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[100, 100, 1]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[100, 100]");
    }

    @Test
    public void test2090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2090");
        int[] intArray3 = new int[] { (short) 100, (short) 100, 1 };
        int[] intArray6 = ds.MaxMin4.maxMin4(intArray3, (int) (short) 0, (int) (short) 0);
        int[] intArray9 = ds.MaxMin4.maxMin4(intArray6, 1, 1);
        int[] intArray12 = ds.MaxMin4.maxMin4(intArray9, 1, (int) (short) 0);
        int[] intArray15 = ds.MaxMin4.maxMin4(intArray9, 0, (int) (short) 1);
        int[] intArray18 = ds.MaxMin4.maxMin4(intArray15, (int) (byte) 1, (int) (byte) 0);
        int[] intArray21 = ds.MaxMin4.maxMin4(intArray18, 0, (int) (short) 0);
        int[] intArray24 = ds.MaxMin4.maxMin4(intArray21, (int) (byte) 0, 0);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray27 = ds.MaxMin4.maxMin4(intArray24, (int) '4', (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[100, 100, 1]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[100, 100]");
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
        org.junit.Assert.assertNotNull(intArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray24), "[100, 100]");
    }

    @Test
    public void test2091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2091");
        int[] intArray3 = new int[] { (short) 100, (short) 100, 1 };
        int[] intArray6 = ds.MaxMin4.maxMin4(intArray3, (int) (short) 0, (int) (short) 0);
        int[] intArray9 = ds.MaxMin4.maxMin4(intArray6, 1, 1);
        int[] intArray12 = ds.MaxMin4.maxMin4(intArray9, 1, (int) (short) 0);
        int[] intArray15 = ds.MaxMin4.maxMin4(intArray9, 0, (int) (short) 1);
        int[] intArray18 = ds.MaxMin4.maxMin4(intArray9, 0, 0);
        int[] intArray21 = ds.MaxMin4.maxMin4(intArray9, (int) (short) 1, (int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray24 = ds.MaxMin4.maxMin4(intArray9, 10, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[100, 100, 1]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[100, 100]");
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
    public void test2092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2092");
        int[] intArray3 = new int[] { (short) 100, (short) 100, 1 };
        int[] intArray6 = ds.MaxMin4.maxMin4(intArray3, (int) (short) 0, (int) (short) 0);
        int[] intArray9 = ds.MaxMin4.maxMin4(intArray3, 0, (int) (byte) 0);
        int[] intArray12 = ds.MaxMin4.maxMin4(intArray9, (int) (byte) 1, (int) (byte) 1);
        int[] intArray15 = ds.MaxMin4.maxMin4(intArray12, (int) (short) 0, 0);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray18 = ds.MaxMin4.maxMin4(intArray15, (int) '#', (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[100, 100, 1]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[100, 100]");
    }

    @Test
    public void test2093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2093");
        int[] intArray3 = new int[] { (short) 100, (short) 100, 1 };
        int[] intArray6 = ds.MaxMin4.maxMin4(intArray3, (int) (short) 0, (int) (short) 0);
        int[] intArray9 = ds.MaxMin4.maxMin4(intArray6, (int) (short) 0, 0);
        int[] intArray12 = ds.MaxMin4.maxMin4(intArray6, (int) (byte) 1, 1);
        int[] intArray15 = ds.MaxMin4.maxMin4(intArray6, (int) (short) 1, (int) (short) 1);
        int[] intArray18 = ds.MaxMin4.maxMin4(intArray15, 1, 0);
        int[] intArray21 = ds.MaxMin4.maxMin4(intArray15, 1, 1);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray24 = ds.MaxMin4.maxMin4(intArray21, (int) (byte) -1, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[100, 100, 1]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[100, 100]");
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
    public void test2094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2094");
        int[] intArray3 = new int[] { (short) 100, (short) 100, 1 };
        int[] intArray6 = ds.MaxMin4.maxMin4(intArray3, (int) (short) 0, (int) (short) 0);
        int[] intArray9 = ds.MaxMin4.maxMin4(intArray6, 1, 1);
        int[] intArray12 = ds.MaxMin4.maxMin4(intArray9, 1, (int) (byte) 1);
        int[] intArray15 = ds.MaxMin4.maxMin4(intArray9, (int) (byte) 0, 0);
        int[] intArray18 = ds.MaxMin4.maxMin4(intArray9, (int) (short) 1, 1);
        int[] intArray21 = ds.MaxMin4.maxMin4(intArray18, 0, (int) (byte) 0);
        int[] intArray24 = ds.MaxMin4.maxMin4(intArray21, 0, 0);
        int[] intArray27 = ds.MaxMin4.maxMin4(intArray21, (int) (byte) 0, (int) (byte) 1);
        int[] intArray30 = ds.MaxMin4.maxMin4(intArray27, (int) (byte) 0, (int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray33 = ds.MaxMin4.maxMin4(intArray30, (int) (byte) 1, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[100, 100, 1]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[100, 100]");
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
        org.junit.Assert.assertNotNull(intArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray24), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray27), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray30);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray30), "[100, 100]");
    }

    @Test
    public void test2095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2095");
        int[] intArray3 = new int[] { (short) 100, (short) 100, 1 };
        int[] intArray6 = ds.MaxMin4.maxMin4(intArray3, (int) (short) 0, (int) (short) 0);
        int[] intArray9 = ds.MaxMin4.maxMin4(intArray6, 1, 1);
        int[] intArray12 = ds.MaxMin4.maxMin4(intArray9, 1, (int) (short) 0);
        int[] intArray15 = ds.MaxMin4.maxMin4(intArray12, (int) (byte) 1, (int) (byte) 0);
        int[] intArray18 = ds.MaxMin4.maxMin4(intArray12, (int) (byte) 1, (int) (byte) 1);
        int[] intArray21 = ds.MaxMin4.maxMin4(intArray18, (int) (byte) 0, 1);
        int[] intArray24 = ds.MaxMin4.maxMin4(intArray18, (int) (byte) 0, (int) (byte) 0);
        int[] intArray27 = ds.MaxMin4.maxMin4(intArray24, 0, 0);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray30 = ds.MaxMin4.maxMin4(intArray24, (int) (short) 0, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[100, 100, 1]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[100, 100]");
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
        org.junit.Assert.assertNotNull(intArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray24), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray27), "[100, 100]");
    }

    @Test
    public void test2096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2096");
        int[] intArray3 = new int[] { (short) 100, (short) 100, 1 };
        int[] intArray6 = ds.MaxMin4.maxMin4(intArray3, (int) (short) 0, (int) (short) 0);
        int[] intArray9 = ds.MaxMin4.maxMin4(intArray6, 1, 1);
        int[] intArray12 = ds.MaxMin4.maxMin4(intArray9, 1, (int) (short) 0);
        int[] intArray15 = ds.MaxMin4.maxMin4(intArray12, (int) (byte) 1, (int) (byte) 0);
        int[] intArray18 = ds.MaxMin4.maxMin4(intArray12, (int) (byte) 1, (int) (byte) 1);
        int[] intArray21 = ds.MaxMin4.maxMin4(intArray18, (int) (byte) 0, 1);
        int[] intArray24 = ds.MaxMin4.maxMin4(intArray18, (int) (byte) 0, (int) (byte) 0);
        int[] intArray27 = ds.MaxMin4.maxMin4(intArray24, 0, 0);
        int[] intArray30 = ds.MaxMin4.maxMin4(intArray27, 0, (int) (byte) 1);
        int[] intArray33 = ds.MaxMin4.maxMin4(intArray30, (int) (byte) 1, (int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray36 = ds.MaxMin4.maxMin4(intArray33, (int) (byte) 100, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[100, 100, 1]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[100, 100]");
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
    public void test2097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2097");
        int[] intArray3 = new int[] { (short) 100, (short) 100, 1 };
        int[] intArray6 = ds.MaxMin4.maxMin4(intArray3, (int) (short) 0, (int) (short) 0);
        int[] intArray9 = ds.MaxMin4.maxMin4(intArray6, 1, 1);
        int[] intArray12 = ds.MaxMin4.maxMin4(intArray9, 1, (int) (byte) 1);
        int[] intArray15 = ds.MaxMin4.maxMin4(intArray12, 0, 0);
        int[] intArray18 = ds.MaxMin4.maxMin4(intArray15, 1, 0);
        int[] intArray21 = ds.MaxMin4.maxMin4(intArray15, (int) (byte) 1, (int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray24 = ds.MaxMin4.maxMin4(intArray15, (int) (byte) 1, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[100, 100, 1]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[100, 100]");
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
    public void test2098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2098");
        int[] intArray3 = new int[] { (short) 100, (short) 100, 1 };
        int[] intArray6 = ds.MaxMin4.maxMin4(intArray3, (int) (short) 0, (int) (short) 0);
        int[] intArray9 = ds.MaxMin4.maxMin4(intArray6, 1, 1);
        int[] intArray12 = ds.MaxMin4.maxMin4(intArray9, 1, (int) (short) 0);
        int[] intArray15 = ds.MaxMin4.maxMin4(intArray9, 0, (int) (short) 1);
        int[] intArray18 = ds.MaxMin4.maxMin4(intArray15, (int) (byte) 1, (int) (byte) 0);
        int[] intArray21 = ds.MaxMin4.maxMin4(intArray18, (int) (byte) 1, (int) (short) 1);
        java.lang.Class<?> wildcardClass22 = intArray18.getClass();
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[100, 100, 1]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[100, 100]");
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
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test2099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2099");
        int[] intArray3 = new int[] { (short) 100, (short) 100, 1 };
        int[] intArray6 = ds.MaxMin4.maxMin4(intArray3, (int) (short) 0, (int) (short) 0);
        int[] intArray9 = ds.MaxMin4.maxMin4(intArray6, 1, 1);
        int[] intArray12 = ds.MaxMin4.maxMin4(intArray6, (int) (short) 1, 1);
        int[] intArray15 = ds.MaxMin4.maxMin4(intArray12, 0, 1);
        int[] intArray18 = ds.MaxMin4.maxMin4(intArray15, (int) (short) 1, 1);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray21 = ds.MaxMin4.maxMin4(intArray15, (int) (short) 100, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[100, 100, 1]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[100, 100]");
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
    public void test2100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2100");
        int[] intArray3 = new int[] { (short) 100, (short) 100, 1 };
        int[] intArray6 = ds.MaxMin4.maxMin4(intArray3, (int) (short) 0, (int) (short) 0);
        int[] intArray9 = ds.MaxMin4.maxMin4(intArray6, 1, 1);
        int[] intArray12 = ds.MaxMin4.maxMin4(intArray9, 1, (int) (short) 0);
        int[] intArray15 = ds.MaxMin4.maxMin4(intArray9, 0, (int) (short) 1);
        int[] intArray18 = ds.MaxMin4.maxMin4(intArray15, (int) (byte) 1, (int) (byte) 0);
        int[] intArray21 = ds.MaxMin4.maxMin4(intArray18, 0, (int) (short) 0);
        int[] intArray24 = ds.MaxMin4.maxMin4(intArray18, 1, 0);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray27 = ds.MaxMin4.maxMin4(intArray18, 0, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[100, 100, 1]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[100, 100]");
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
        org.junit.Assert.assertNotNull(intArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray24), "[100, 100]");
    }

    @Test
    public void test2101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2101");
        int[] intArray3 = new int[] { (short) 100, (short) 100, 1 };
        int[] intArray6 = ds.MaxMin4.maxMin4(intArray3, (int) (short) 0, (int) (short) 0);
        int[] intArray9 = ds.MaxMin4.maxMin4(intArray6, 1, 1);
        int[] intArray12 = ds.MaxMin4.maxMin4(intArray9, 1, 0);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray15 = ds.MaxMin4.maxMin4(intArray12, 0, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[100, 100, 1]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[100, 100]");
    }

    @Test
    public void test2102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2102");
        int[] intArray3 = new int[] { (short) 100, (short) 100, 1 };
        int[] intArray6 = ds.MaxMin4.maxMin4(intArray3, (int) (short) 0, (int) (short) 0);
        int[] intArray9 = ds.MaxMin4.maxMin4(intArray3, 0, (int) (byte) 0);
        int[] intArray12 = ds.MaxMin4.maxMin4(intArray3, 1, (int) (short) 1);
        int[] intArray15 = ds.MaxMin4.maxMin4(intArray3, (int) (short) 0, 1);
        int[] intArray18 = ds.MaxMin4.maxMin4(intArray3, (int) (byte) 1, (int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray21 = ds.MaxMin4.maxMin4(intArray3, (int) '#', (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[100, 100, 1]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[100, 100]");
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
        int[] intArray3 = new int[] { (short) 100, (short) 100, 1 };
        int[] intArray6 = ds.MaxMin4.maxMin4(intArray3, (int) (short) 0, (int) (short) 0);
        int[] intArray9 = ds.MaxMin4.maxMin4(intArray6, 1, 1);
        int[] intArray12 = ds.MaxMin4.maxMin4(intArray9, 1, (int) (short) 0);
        int[] intArray15 = ds.MaxMin4.maxMin4(intArray12, (int) (byte) 1, (int) (byte) 0);
        int[] intArray18 = ds.MaxMin4.maxMin4(intArray12, (int) (byte) 1, (int) (byte) 1);
        int[] intArray21 = ds.MaxMin4.maxMin4(intArray12, (int) (byte) 1, 1);
        int[] intArray24 = ds.MaxMin4.maxMin4(intArray12, 1, 1);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray27 = ds.MaxMin4.maxMin4(intArray24, (int) (byte) -1, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[100, 100, 1]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[100, 100]");
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
        org.junit.Assert.assertNotNull(intArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray24), "[100, 100]");
    }

    @Test
    public void test2104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2104");
        int[] intArray3 = new int[] { (short) 100, (short) 100, 1 };
        int[] intArray6 = ds.MaxMin4.maxMin4(intArray3, (int) (short) 0, (int) (short) 0);
        int[] intArray9 = ds.MaxMin4.maxMin4(intArray6, 1, 1);
        int[] intArray12 = ds.MaxMin4.maxMin4(intArray9, 1, (int) (short) 0);
        int[] intArray15 = ds.MaxMin4.maxMin4(intArray9, 0, (int) (short) 1);
        int[] intArray18 = ds.MaxMin4.maxMin4(intArray9, 0, 0);
        int[] intArray21 = ds.MaxMin4.maxMin4(intArray9, (int) (short) 0, (int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray24 = ds.MaxMin4.maxMin4(intArray21, 1, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[100, 100, 1]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[100, 100]");
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
    public void test2105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2105");
        int[] intArray3 = new int[] { (short) 100, (short) 100, 1 };
        int[] intArray6 = ds.MaxMin4.maxMin4(intArray3, (int) (short) 0, (int) (short) 0);
        int[] intArray9 = ds.MaxMin4.maxMin4(intArray6, 1, 1);
        int[] intArray12 = ds.MaxMin4.maxMin4(intArray9, 1, (int) (short) 0);
        int[] intArray15 = ds.MaxMin4.maxMin4(intArray12, (int) (byte) 1, (int) (byte) 0);
        int[] intArray18 = ds.MaxMin4.maxMin4(intArray12, (int) (byte) 1, (int) (byte) 1);
        int[] intArray21 = ds.MaxMin4.maxMin4(intArray18, (int) (byte) 0, 1);
        int[] intArray24 = ds.MaxMin4.maxMin4(intArray21, 0, (int) (short) 1);
        int[] intArray27 = ds.MaxMin4.maxMin4(intArray24, (int) (short) 0, 0);
        int[] intArray30 = ds.MaxMin4.maxMin4(intArray24, (int) (short) 1, (int) (byte) 0);
        int[] intArray33 = ds.MaxMin4.maxMin4(intArray24, 0, 0);
        int[] intArray36 = ds.MaxMin4.maxMin4(intArray24, 0, (int) (byte) 1);
        java.lang.Class<?> wildcardClass37 = intArray24.getClass();
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[100, 100, 1]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[100, 100]");
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
        org.junit.Assert.assertNotNull(wildcardClass37);
    }

    @Test
    public void test2106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2106");
        int[] intArray3 = new int[] { (short) 100, (short) 100, 1 };
        int[] intArray6 = ds.MaxMin4.maxMin4(intArray3, (int) (short) 0, (int) (short) 0);
        int[] intArray9 = ds.MaxMin4.maxMin4(intArray6, 1, 1);
        int[] intArray12 = ds.MaxMin4.maxMin4(intArray9, 1, (int) (short) 0);
        int[] intArray15 = ds.MaxMin4.maxMin4(intArray12, (int) (byte) 1, (int) (byte) 0);
        int[] intArray18 = ds.MaxMin4.maxMin4(intArray12, (int) (byte) 1, (int) (byte) 1);
        int[] intArray21 = ds.MaxMin4.maxMin4(intArray18, (int) (byte) 0, 1);
        int[] intArray24 = ds.MaxMin4.maxMin4(intArray21, 0, (int) (short) 1);
        int[] intArray27 = ds.MaxMin4.maxMin4(intArray24, (int) (short) 0, 0);
        int[] intArray30 = ds.MaxMin4.maxMin4(intArray24, (int) (short) 1, (int) (byte) 0);
        int[] intArray33 = ds.MaxMin4.maxMin4(intArray30, (int) (byte) 0, (int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray36 = ds.MaxMin4.maxMin4(intArray30, (int) (short) 100, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[100, 100, 1]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[100, 100]");
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
    public void test2107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2107");
        int[] intArray3 = new int[] { (short) 100, (short) 100, 1 };
        int[] intArray6 = ds.MaxMin4.maxMin4(intArray3, (int) (short) 0, (int) (short) 0);
        int[] intArray9 = ds.MaxMin4.maxMin4(intArray6, 1, 1);
        int[] intArray12 = ds.MaxMin4.maxMin4(intArray6, (int) (byte) 0, 1);
        int[] intArray15 = ds.MaxMin4.maxMin4(intArray6, (int) (short) 1, 1);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray18 = ds.MaxMin4.maxMin4(intArray15, (int) (short) 100, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[100, 100, 1]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[100, 100]");
    }

    @Test
    public void test2108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2108");
        int[] intArray3 = new int[] { (short) 100, (short) 100, 1 };
        int[] intArray6 = ds.MaxMin4.maxMin4(intArray3, (int) (short) 0, (int) (short) 0);
        int[] intArray9 = ds.MaxMin4.maxMin4(intArray6, 1, 1);
        int[] intArray12 = ds.MaxMin4.maxMin4(intArray6, (int) (byte) 0, 1);
        int[] intArray15 = ds.MaxMin4.maxMin4(intArray12, (int) (byte) 1, 0);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray18 = ds.MaxMin4.maxMin4(intArray15, 1, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[100, 100, 1]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[100, 100]");
    }

    @Test
    public void test2109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2109");
        int[] intArray3 = new int[] { (short) 100, (short) 100, 1 };
        int[] intArray6 = ds.MaxMin4.maxMin4(intArray3, (int) (short) 0, (int) (short) 0);
        int[] intArray9 = ds.MaxMin4.maxMin4(intArray6, 1, 1);
        int[] intArray12 = ds.MaxMin4.maxMin4(intArray9, 1, (int) (byte) 1);
        int[] intArray15 = ds.MaxMin4.maxMin4(intArray9, (int) (byte) 0, 0);
        int[] intArray18 = ds.MaxMin4.maxMin4(intArray9, (int) (short) 1, 1);
        int[] intArray21 = ds.MaxMin4.maxMin4(intArray18, 0, 0);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray24 = ds.MaxMin4.maxMin4(intArray18, (int) ' ', 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[100, 100, 1]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[100, 100]");
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
    public void test2110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2110");
        int[] intArray0 = null;
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray3 = ds.MaxMin4.maxMin4(intArray0, 100, (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2111");
        int[] intArray3 = new int[] { (short) 100, (short) 100, 1 };
        int[] intArray6 = ds.MaxMin4.maxMin4(intArray3, (int) (short) 0, (int) (short) 0);
        int[] intArray9 = ds.MaxMin4.maxMin4(intArray6, 1, 1);
        int[] intArray12 = ds.MaxMin4.maxMin4(intArray9, 1, (int) (short) 0);
        int[] intArray15 = ds.MaxMin4.maxMin4(intArray12, (int) (byte) 1, (int) (byte) 0);
        int[] intArray18 = ds.MaxMin4.maxMin4(intArray12, (int) (byte) 1, (int) (byte) 1);
        int[] intArray21 = ds.MaxMin4.maxMin4(intArray18, (int) (byte) 0, 1);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray24 = ds.MaxMin4.maxMin4(intArray21, (int) (byte) 10, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[100, 100, 1]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[100, 100]");
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
    public void test2112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2112");
        int[] intArray3 = new int[] { (short) 100, (short) 100, 1 };
        int[] intArray6 = ds.MaxMin4.maxMin4(intArray3, (int) (short) 0, (int) (short) 0);
        int[] intArray9 = ds.MaxMin4.maxMin4(intArray6, 1, 1);
        int[] intArray12 = ds.MaxMin4.maxMin4(intArray9, 1, (int) (short) 0);
        int[] intArray15 = ds.MaxMin4.maxMin4(intArray12, (int) (byte) 1, (int) (byte) 0);
        int[] intArray18 = ds.MaxMin4.maxMin4(intArray12, (int) (byte) 1, (int) (byte) 1);
        int[] intArray21 = ds.MaxMin4.maxMin4(intArray18, (int) (byte) 0, 1);
        int[] intArray24 = ds.MaxMin4.maxMin4(intArray18, (int) (byte) 0, (int) (byte) 0);
        int[] intArray27 = ds.MaxMin4.maxMin4(intArray24, 0, 0);
        int[] intArray30 = ds.MaxMin4.maxMin4(intArray27, 0, (int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray33 = ds.MaxMin4.maxMin4(intArray27, (int) (byte) 10, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[100, 100, 1]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[100, 100]");
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
        org.junit.Assert.assertNotNull(intArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray24), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray27), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray30);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray30), "[100, 100]");
    }

    @Test
    public void test2113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2113");
        int[] intArray3 = new int[] { (short) 100, (short) 100, 1 };
        int[] intArray6 = ds.MaxMin4.maxMin4(intArray3, (int) (short) 0, (int) (short) 0);
        int[] intArray9 = ds.MaxMin4.maxMin4(intArray3, 0, (int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray12 = ds.MaxMin4.maxMin4(intArray9, (int) '#', (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[100, 100, 1]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[100, 100]");
    }

    @Test
    public void test2114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2114");
        int[] intArray3 = new int[] { (short) 100, (short) 100, 1 };
        int[] intArray6 = ds.MaxMin4.maxMin4(intArray3, (int) (short) 0, (int) (short) 0);
        int[] intArray9 = ds.MaxMin4.maxMin4(intArray6, 1, 1);
        int[] intArray12 = ds.MaxMin4.maxMin4(intArray9, 1, (int) (byte) 1);
        int[] intArray15 = ds.MaxMin4.maxMin4(intArray9, (int) (byte) 0, 0);
        int[] intArray18 = ds.MaxMin4.maxMin4(intArray9, (int) (short) 1, 1);
        int[] intArray21 = ds.MaxMin4.maxMin4(intArray18, 0, (int) (byte) 0);
        int[] intArray24 = ds.MaxMin4.maxMin4(intArray18, (int) (byte) 1, (int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray27 = ds.MaxMin4.maxMin4(intArray18, (int) (short) 0, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[100, 100, 1]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[100, 100]");
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
        org.junit.Assert.assertNotNull(intArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray24), "[100, 100]");
    }

    @Test
    public void test2115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2115");
        int[] intArray3 = new int[] { (short) 100, (short) 100, 1 };
        int[] intArray6 = ds.MaxMin4.maxMin4(intArray3, (int) (short) 0, (int) (short) 0);
        int[] intArray9 = ds.MaxMin4.maxMin4(intArray6, 1, 1);
        int[] intArray12 = ds.MaxMin4.maxMin4(intArray9, 1, (int) (byte) 1);
        int[] intArray15 = ds.MaxMin4.maxMin4(intArray12, 0, 0);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray18 = ds.MaxMin4.maxMin4(intArray12, (int) (short) 100, 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[100, 100, 1]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[100, 100]");
    }

    @Test
    public void test2116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2116");
        int[] intArray3 = new int[] { (short) 100, (short) 100, 1 };
        int[] intArray6 = ds.MaxMin4.maxMin4(intArray3, (int) (short) 0, (int) (short) 0);
        int[] intArray9 = ds.MaxMin4.maxMin4(intArray6, 1, 1);
        int[] intArray12 = ds.MaxMin4.maxMin4(intArray9, 1, (int) (short) 0);
        int[] intArray15 = ds.MaxMin4.maxMin4(intArray9, 0, (int) (short) 1);
        int[] intArray18 = ds.MaxMin4.maxMin4(intArray15, (int) (byte) 1, (int) (byte) 0);
        int[] intArray21 = ds.MaxMin4.maxMin4(intArray15, 0, (int) (byte) 0);
        int[] intArray24 = ds.MaxMin4.maxMin4(intArray15, (int) (byte) 0, 0);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray27 = ds.MaxMin4.maxMin4(intArray15, (int) 'a', (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[100, 100, 1]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[100, 100]");
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
        org.junit.Assert.assertNotNull(intArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray24), "[100, 100]");
    }

    @Test
    public void test2117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2117");
        int[] intArray3 = new int[] { (short) 100, (short) 100, 1 };
        int[] intArray6 = ds.MaxMin4.maxMin4(intArray3, (int) (short) 0, (int) (short) 0);
        int[] intArray9 = ds.MaxMin4.maxMin4(intArray3, 0, (int) (byte) 0);
        int[] intArray12 = ds.MaxMin4.maxMin4(intArray9, (int) (byte) 1, (int) (byte) 1);
        int[] intArray15 = ds.MaxMin4.maxMin4(intArray12, (int) (short) 0, 0);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray18 = ds.MaxMin4.maxMin4(intArray12, (int) (byte) 0, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[100, 100, 1]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[100, 100]");
    }

    @Test
    public void test2118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2118");
        int[] intArray3 = new int[] { (short) 100, (short) 100, 1 };
        int[] intArray6 = ds.MaxMin4.maxMin4(intArray3, (int) (short) 0, (int) (short) 0);
        int[] intArray9 = ds.MaxMin4.maxMin4(intArray6, (int) (short) 0, 0);
        int[] intArray12 = ds.MaxMin4.maxMin4(intArray6, (int) (byte) 1, 1);
        int[] intArray15 = ds.MaxMin4.maxMin4(intArray6, (int) (short) 1, (int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray18 = ds.MaxMin4.maxMin4(intArray6, (int) (short) 1, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[100, 100, 1]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[100, 100]");
    }

    @Test
    public void test2119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2119");
        int[] intArray3 = new int[] { (short) 100, (short) 100, 1 };
        int[] intArray6 = ds.MaxMin4.maxMin4(intArray3, (int) (short) 0, (int) (short) 0);
        int[] intArray9 = ds.MaxMin4.maxMin4(intArray6, 1, 1);
        int[] intArray12 = ds.MaxMin4.maxMin4(intArray6, (int) (byte) 0, 1);
        int[] intArray15 = ds.MaxMin4.maxMin4(intArray12, (int) (short) 0, 1);
        int[] intArray18 = ds.MaxMin4.maxMin4(intArray15, (int) (short) 1, 0);
        int[] intArray21 = ds.MaxMin4.maxMin4(intArray18, (int) (short) 1, (int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray24 = ds.MaxMin4.maxMin4(intArray18, 100, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[100, 100, 1]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[100, 100]");
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
    public void test2120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2120");
        int[] intArray3 = new int[] { (short) 100, (short) 100, 1 };
        int[] intArray6 = ds.MaxMin4.maxMin4(intArray3, (int) (short) 0, (int) (short) 0);
        int[] intArray9 = ds.MaxMin4.maxMin4(intArray6, 1, 1);
        int[] intArray12 = ds.MaxMin4.maxMin4(intArray6, (int) (byte) 0, 1);
        int[] intArray15 = ds.MaxMin4.maxMin4(intArray12, 1, 1);
        int[] intArray18 = ds.MaxMin4.maxMin4(intArray12, 0, (int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray21 = ds.MaxMin4.maxMin4(intArray12, (int) '4', (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[100, 100, 1]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[100, 100]");
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
    public void test2121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2121");
        int[] intArray3 = new int[] { (short) 100, (short) 100, 1 };
        int[] intArray6 = ds.MaxMin4.maxMin4(intArray3, (int) (short) 0, (int) (short) 0);
        int[] intArray9 = ds.MaxMin4.maxMin4(intArray3, 0, (int) (byte) 0);
        int[] intArray12 = ds.MaxMin4.maxMin4(intArray9, (int) (byte) 1, (int) (byte) 1);
        int[] intArray15 = ds.MaxMin4.maxMin4(intArray9, 0, 0);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray18 = ds.MaxMin4.maxMin4(intArray15, (int) (short) 0, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[100, 100, 1]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[100, 100]");
    }

    @Test
    public void test2122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2122");
        int[] intArray3 = new int[] { (short) 100, (short) 100, 1 };
        int[] intArray6 = ds.MaxMin4.maxMin4(intArray3, (int) (short) 0, (int) (short) 0);
        int[] intArray9 = ds.MaxMin4.maxMin4(intArray6, 1, 1);
        int[] intArray12 = ds.MaxMin4.maxMin4(intArray9, 1, (int) (short) 0);
        int[] intArray15 = ds.MaxMin4.maxMin4(intArray9, 0, (int) (short) 1);
        int[] intArray18 = ds.MaxMin4.maxMin4(intArray15, (int) (byte) 1, (int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray21 = ds.MaxMin4.maxMin4(intArray15, 1, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[100, 100, 1]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[100, 100]");
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
    public void test2123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2123");
        int[] intArray3 = new int[] { (short) 100, (short) 100, 1 };
        int[] intArray6 = ds.MaxMin4.maxMin4(intArray3, (int) (short) 0, (int) (short) 0);
        int[] intArray9 = ds.MaxMin4.maxMin4(intArray3, 0, (int) (byte) 0);
        int[] intArray12 = ds.MaxMin4.maxMin4(intArray3, 1, (int) (short) 1);
        int[] intArray15 = ds.MaxMin4.maxMin4(intArray3, (int) (short) 0, 1);
        int[] intArray18 = ds.MaxMin4.maxMin4(intArray3, (int) (short) 0, (int) (short) 1);
        int[] intArray21 = ds.MaxMin4.maxMin4(intArray3, 1, (int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray24 = ds.MaxMin4.maxMin4(intArray21, (int) 'a', (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[100, 100, 1]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[100, 100]");
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
    public void test2124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2124");
        int[] intArray3 = new int[] { (short) 100, (short) 100, 1 };
        int[] intArray6 = ds.MaxMin4.maxMin4(intArray3, (int) (short) 0, (int) (short) 0);
        int[] intArray9 = ds.MaxMin4.maxMin4(intArray6, 1, 1);
        int[] intArray12 = ds.MaxMin4.maxMin4(intArray9, 1, (int) (short) 0);
        int[] intArray15 = ds.MaxMin4.maxMin4(intArray12, (int) (byte) 1, (int) (byte) 0);
        int[] intArray18 = ds.MaxMin4.maxMin4(intArray12, (int) (byte) 1, (int) (byte) 1);
        int[] intArray21 = ds.MaxMin4.maxMin4(intArray12, 0, (int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray24 = ds.MaxMin4.maxMin4(intArray21, 100, (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[100, 100, 1]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[100, 100]");
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
    public void test2125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2125");
        int[] intArray0 = null;
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray3 = ds.MaxMin4.maxMin4(intArray0, (int) ' ', (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2126");
        int[] intArray3 = new int[] { (short) 100, (short) 100, 1 };
        int[] intArray6 = ds.MaxMin4.maxMin4(intArray3, (int) (short) 0, (int) (short) 0);
        int[] intArray9 = ds.MaxMin4.maxMin4(intArray6, 1, 1);
        int[] intArray12 = ds.MaxMin4.maxMin4(intArray9, (int) (byte) 1, (int) (short) 0);
        int[] intArray15 = ds.MaxMin4.maxMin4(intArray9, 1, 1);
        int[] intArray18 = ds.MaxMin4.maxMin4(intArray15, 0, 0);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray21 = ds.MaxMin4.maxMin4(intArray18, 100, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[100, 100, 1]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[100, 100]");
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
    public void test2127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2127");
        int[] intArray3 = new int[] { (short) 100, (short) 100, 1 };
        int[] intArray6 = ds.MaxMin4.maxMin4(intArray3, (int) (short) 0, (int) (short) 0);
        int[] intArray9 = ds.MaxMin4.maxMin4(intArray6, 1, 1);
        int[] intArray12 = ds.MaxMin4.maxMin4(intArray6, (int) (byte) 0, 1);
        int[] intArray15 = ds.MaxMin4.maxMin4(intArray12, (int) (short) 0, 1);
        int[] intArray18 = ds.MaxMin4.maxMin4(intArray15, (int) (byte) 1, (int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray21 = ds.MaxMin4.maxMin4(intArray15, 0, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[100, 100, 1]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[100, 100]");
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
    public void test2128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2128");
        int[] intArray3 = new int[] { (short) 100, (short) 100, 1 };
        int[] intArray6 = ds.MaxMin4.maxMin4(intArray3, (int) (short) 0, (int) (short) 0);
        int[] intArray9 = ds.MaxMin4.maxMin4(intArray3, 0, 1);
        int[] intArray12 = ds.MaxMin4.maxMin4(intArray9, 0, (int) (short) 0);
        int[] intArray15 = ds.MaxMin4.maxMin4(intArray12, (int) (byte) 1, (int) (byte) 0);
        int[] intArray18 = ds.MaxMin4.maxMin4(intArray12, (int) (byte) 0, (int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray21 = ds.MaxMin4.maxMin4(intArray18, 0, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[100, 100, 1]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[100, 100]");
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
    public void test2129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2129");
        int[] intArray3 = new int[] { (short) 100, (short) 100, 1 };
        int[] intArray6 = ds.MaxMin4.maxMin4(intArray3, (int) (short) 0, (int) (short) 0);
        int[] intArray9 = ds.MaxMin4.maxMin4(intArray3, 0, (int) (byte) 0);
        int[] intArray12 = ds.MaxMin4.maxMin4(intArray9, (int) (byte) 1, (int) (byte) 1);
        int[] intArray15 = ds.MaxMin4.maxMin4(intArray9, 0, 0);
        int[] intArray18 = ds.MaxMin4.maxMin4(intArray9, 1, (int) (byte) 1);
        java.lang.Class<?> wildcardClass19 = intArray9.getClass();
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[100, 100, 1]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[100, 100]");
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
    public void test2130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2130");
        int[] intArray3 = new int[] { (short) 100, (short) 100, 1 };
        int[] intArray6 = ds.MaxMin4.maxMin4(intArray3, (int) (short) 0, (int) (short) 0);
        int[] intArray9 = ds.MaxMin4.maxMin4(intArray6, 1, 1);
        int[] intArray12 = ds.MaxMin4.maxMin4(intArray9, (int) (byte) 1, (int) (short) 0);
        int[] intArray15 = ds.MaxMin4.maxMin4(intArray9, 1, 1);
        int[] intArray18 = ds.MaxMin4.maxMin4(intArray9, (int) (byte) 0, (int) (short) 1);
        int[] intArray21 = ds.MaxMin4.maxMin4(intArray18, (int) (short) 1, (int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray24 = ds.MaxMin4.maxMin4(intArray21, (int) (short) 1, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[100, 100, 1]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[100, 100]");
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
    public void test2131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2131");
        int[] intArray3 = new int[] { (short) 100, (short) 100, 1 };
        int[] intArray6 = ds.MaxMin4.maxMin4(intArray3, (int) (short) 0, (int) (short) 0);
        int[] intArray9 = ds.MaxMin4.maxMin4(intArray6, 1, 1);
        int[] intArray12 = ds.MaxMin4.maxMin4(intArray9, 1, (int) (short) 0);
        int[] intArray15 = ds.MaxMin4.maxMin4(intArray12, (int) (byte) 1, (int) (byte) 0);
        int[] intArray18 = ds.MaxMin4.maxMin4(intArray12, (int) (byte) 1, (int) (byte) 1);
        int[] intArray21 = ds.MaxMin4.maxMin4(intArray18, (int) (byte) 0, 1);
        int[] intArray24 = ds.MaxMin4.maxMin4(intArray18, (int) (byte) 0, (int) (byte) 0);
        int[] intArray27 = ds.MaxMin4.maxMin4(intArray24, 0, 0);
        int[] intArray30 = ds.MaxMin4.maxMin4(intArray27, 0, (int) (byte) 1);
        int[] intArray33 = ds.MaxMin4.maxMin4(intArray30, (int) (byte) 1, (int) (short) 1);
        java.lang.Class<?> wildcardClass34 = intArray30.getClass();
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[100, 100, 1]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[100, 100]");
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
        org.junit.Assert.assertNotNull(intArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray24), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray27), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray30);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray30), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray33);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray33), "[100, 100]");
        org.junit.Assert.assertNotNull(wildcardClass34);
    }

    @Test
    public void test2132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2132");
        int[] intArray3 = new int[] { (short) 100, (short) 100, 1 };
        int[] intArray6 = ds.MaxMin4.maxMin4(intArray3, (int) (short) 0, (int) (short) 0);
        int[] intArray9 = ds.MaxMin4.maxMin4(intArray6, 1, 1);
        int[] intArray12 = ds.MaxMin4.maxMin4(intArray9, 1, (int) (short) 0);
        int[] intArray15 = ds.MaxMin4.maxMin4(intArray12, (int) (byte) 1, (int) (byte) 0);
        int[] intArray18 = ds.MaxMin4.maxMin4(intArray12, (int) (byte) 1, (int) (byte) 1);
        int[] intArray21 = ds.MaxMin4.maxMin4(intArray12, (int) (byte) 1, 1);
        int[] intArray24 = ds.MaxMin4.maxMin4(intArray12, 1, 1);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray27 = ds.MaxMin4.maxMin4(intArray24, (int) (short) 1, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[100, 100, 1]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[100, 100]");
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
        org.junit.Assert.assertNotNull(intArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray24), "[100, 100]");
    }

    @Test
    public void test2133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2133");
        int[] intArray3 = new int[] { (short) 100, (short) 100, 1 };
        int[] intArray6 = ds.MaxMin4.maxMin4(intArray3, (int) (short) 0, (int) (short) 0);
        int[] intArray9 = ds.MaxMin4.maxMin4(intArray6, 1, 1);
        int[] intArray12 = ds.MaxMin4.maxMin4(intArray6, (int) (byte) 0, 1);
        int[] intArray15 = ds.MaxMin4.maxMin4(intArray12, (int) (short) 0, 1);
        int[] intArray18 = ds.MaxMin4.maxMin4(intArray12, (int) (short) 0, (int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray21 = ds.MaxMin4.maxMin4(intArray12, (int) 'a', (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[100, 100, 1]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[100, 100]");
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
    public void test2134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2134");
        int[] intArray0 = null;
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray3 = ds.MaxMin4.maxMin4(intArray0, 100, (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2135");
        int[] intArray3 = new int[] { (short) 100, (short) 100, 1 };
        int[] intArray6 = ds.MaxMin4.maxMin4(intArray3, (int) (short) 0, (int) (short) 0);
        int[] intArray9 = ds.MaxMin4.maxMin4(intArray6, 1, 1);
        int[] intArray12 = ds.MaxMin4.maxMin4(intArray9, 1, (int) (byte) 1);
        int[] intArray15 = ds.MaxMin4.maxMin4(intArray9, (int) (byte) 0, 0);
        int[] intArray18 = ds.MaxMin4.maxMin4(intArray9, (int) (short) 1, 1);
        int[] intArray21 = ds.MaxMin4.maxMin4(intArray18, (int) (short) 0, (int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray24 = ds.MaxMin4.maxMin4(intArray18, (int) (short) 10, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[100, 100, 1]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[100, 100]");
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
    public void test2136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2136");
        int[] intArray3 = new int[] { (short) 100, (short) 100, 1 };
        int[] intArray6 = ds.MaxMin4.maxMin4(intArray3, (int) (short) 0, (int) (short) 0);
        int[] intArray9 = ds.MaxMin4.maxMin4(intArray6, 1, 1);
        int[] intArray12 = ds.MaxMin4.maxMin4(intArray9, 1, (int) (short) 0);
        int[] intArray15 = ds.MaxMin4.maxMin4(intArray9, 0, (int) (short) 1);
        int[] intArray18 = ds.MaxMin4.maxMin4(intArray15, (int) (byte) 1, (int) (byte) 0);
        int[] intArray21 = ds.MaxMin4.maxMin4(intArray15, 0, (int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray24 = ds.MaxMin4.maxMin4(intArray21, (int) (byte) -1, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[100, 100, 1]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[100, 100]");
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
    public void test2137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2137");
        int[] intArray3 = new int[] { (short) 100, (short) 100, 1 };
        int[] intArray6 = ds.MaxMin4.maxMin4(intArray3, (int) (short) 0, (int) (short) 0);
        int[] intArray9 = ds.MaxMin4.maxMin4(intArray6, 1, 1);
        int[] intArray12 = ds.MaxMin4.maxMin4(intArray9, 1, (int) (short) 0);
        int[] intArray15 = ds.MaxMin4.maxMin4(intArray9, 0, (int) (short) 1);
        int[] intArray18 = ds.MaxMin4.maxMin4(intArray9, 0, 0);
        int[] intArray21 = ds.MaxMin4.maxMin4(intArray9, (int) (short) 0, (int) (byte) 1);
        int[] intArray24 = ds.MaxMin4.maxMin4(intArray21, 1, (int) (short) 1);
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[100, 100, 1]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[100, 100]");
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
        org.junit.Assert.assertNotNull(intArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray24), "[100, 100]");
    }

    @Test
    public void test2138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2138");
        int[] intArray4 = new int[] { (byte) -1, 'a', 1, 0 };
        int[] intArray7 = ds.MaxMin4.maxMin4(intArray4, (int) (short) 0, 0);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray10 = ds.MaxMin4.maxMin4(intArray7, (int) (short) 100, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[-1, 97, 1, 0]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[-1, -1]");
    }

    @Test
    public void test2139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2139");
        int[] intArray5 = new int[] { 'a', (byte) 1, 'a', (byte) 10, (-1) };
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray8 = ds.MaxMin4.maxMin4(intArray5, (int) (byte) -1, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[97, 1, 97, 10, -1]");
    }

    @Test
    public void test2140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2140");
        int[] intArray3 = new int[] { (short) 100, (short) 100, 1 };
        int[] intArray6 = ds.MaxMin4.maxMin4(intArray3, (int) (short) 0, (int) (short) 0);
        int[] intArray9 = ds.MaxMin4.maxMin4(intArray6, 1, 1);
        int[] intArray12 = ds.MaxMin4.maxMin4(intArray9, 1, (int) (short) 0);
        int[] intArray15 = ds.MaxMin4.maxMin4(intArray9, 0, (int) (short) 1);
        int[] intArray18 = ds.MaxMin4.maxMin4(intArray15, (int) (byte) 1, (int) (byte) 0);
        int[] intArray21 = ds.MaxMin4.maxMin4(intArray18, 0, (int) (short) 0);
        int[] intArray24 = ds.MaxMin4.maxMin4(intArray18, 1, 0);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray27 = ds.MaxMin4.maxMin4(intArray18, (int) (short) 10, 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[100, 100, 1]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[100, 100]");
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
        org.junit.Assert.assertNotNull(intArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray24), "[100, 100]");
    }

    @Test
    public void test2141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2141");
        int[] intArray3 = new int[] { (short) 100, (short) 100, 1 };
        int[] intArray6 = ds.MaxMin4.maxMin4(intArray3, (int) (short) 0, (int) (short) 0);
        int[] intArray9 = ds.MaxMin4.maxMin4(intArray6, 1, 1);
        int[] intArray12 = ds.MaxMin4.maxMin4(intArray9, 1, (int) (byte) 1);
        int[] intArray15 = ds.MaxMin4.maxMin4(intArray9, 1, 0);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray18 = ds.MaxMin4.maxMin4(intArray15, (int) ' ', (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[100, 100, 1]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[100, 100]");
    }

    @Test
    public void test2142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2142");
        int[] intArray3 = new int[] { (short) 100, (short) 100, 1 };
        int[] intArray6 = ds.MaxMin4.maxMin4(intArray3, (int) (short) 0, (int) (short) 0);
        int[] intArray9 = ds.MaxMin4.maxMin4(intArray6, 1, 1);
        int[] intArray12 = ds.MaxMin4.maxMin4(intArray9, 1, (int) (short) 0);
        int[] intArray15 = ds.MaxMin4.maxMin4(intArray12, (int) (byte) 1, (int) (byte) 0);
        int[] intArray18 = ds.MaxMin4.maxMin4(intArray12, (int) (byte) 1, (int) (byte) 1);
        int[] intArray21 = ds.MaxMin4.maxMin4(intArray12, (int) (byte) 1, 1);
        int[] intArray24 = ds.MaxMin4.maxMin4(intArray12, 1, 1);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray27 = ds.MaxMin4.maxMin4(intArray12, (int) (short) 10, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[100, 100, 1]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[100, 100]");
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
        org.junit.Assert.assertNotNull(intArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray24), "[100, 100]");
    }

    @Test
    public void test2143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2143");
        int[] intArray3 = new int[] { (short) 100, (short) 100, 1 };
        int[] intArray6 = ds.MaxMin4.maxMin4(intArray3, (int) (short) 0, (int) (short) 0);
        int[] intArray9 = ds.MaxMin4.maxMin4(intArray6, 1, 1);
        int[] intArray12 = ds.MaxMin4.maxMin4(intArray9, 1, (int) (short) 0);
        int[] intArray15 = ds.MaxMin4.maxMin4(intArray12, (int) (byte) 1, (int) (byte) 0);
        int[] intArray18 = ds.MaxMin4.maxMin4(intArray12, (int) (byte) 1, (int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray21 = ds.MaxMin4.maxMin4(intArray12, (int) (byte) -1, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[100, 100, 1]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[100, 100]");
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
    public void test2144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2144");
        int[] intArray3 = new int[] { (short) 100, (short) 100, 1 };
        int[] intArray6 = ds.MaxMin4.maxMin4(intArray3, (int) (short) 0, (int) (short) 0);
        int[] intArray9 = ds.MaxMin4.maxMin4(intArray6, 1, 1);
        int[] intArray12 = ds.MaxMin4.maxMin4(intArray6, (int) (short) 1, 1);
        int[] intArray15 = ds.MaxMin4.maxMin4(intArray12, 0, 1);
        int[] intArray18 = ds.MaxMin4.maxMin4(intArray15, (int) (short) 1, 1);
        int[] intArray21 = ds.MaxMin4.maxMin4(intArray18, 1, (int) (short) 0);
        int[] intArray24 = ds.MaxMin4.maxMin4(intArray18, (int) (byte) 1, (int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray27 = ds.MaxMin4.maxMin4(intArray24, (int) (short) -1, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[100, 100, 1]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[100, 100]");
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
        org.junit.Assert.assertNotNull(intArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray24), "[100, 100]");
    }

    @Test
    public void test2145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2145");
        int[] intArray3 = new int[] { (short) 100, (short) 100, 1 };
        int[] intArray6 = ds.MaxMin4.maxMin4(intArray3, (int) (short) 0, (int) (short) 0);
        int[] intArray9 = ds.MaxMin4.maxMin4(intArray3, 0, 1);
        int[] intArray12 = ds.MaxMin4.maxMin4(intArray9, 0, (int) (short) 0);
        int[] intArray15 = ds.MaxMin4.maxMin4(intArray9, (int) (short) 1, 0);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray18 = ds.MaxMin4.maxMin4(intArray15, (int) 'a', 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[100, 100, 1]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[100, 100]");
    }

    @Test
    public void test2146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2146");
        int[] intArray3 = new int[] { (short) 100, (short) 100, 1 };
        int[] intArray6 = ds.MaxMin4.maxMin4(intArray3, (int) (short) 0, (int) (short) 0);
        int[] intArray9 = ds.MaxMin4.maxMin4(intArray6, 1, 1);
        int[] intArray12 = ds.MaxMin4.maxMin4(intArray9, 1, (int) (short) 0);
        int[] intArray15 = ds.MaxMin4.maxMin4(intArray12, (int) (byte) 1, (int) (byte) 0);
        int[] intArray18 = ds.MaxMin4.maxMin4(intArray12, (int) (byte) 1, (int) (byte) 1);
        int[] intArray21 = ds.MaxMin4.maxMin4(intArray18, (int) (byte) 0, 1);
        int[] intArray24 = ds.MaxMin4.maxMin4(intArray21, 0, (int) (short) 1);
        int[] intArray27 = ds.MaxMin4.maxMin4(intArray24, (int) (short) 0, 0);
        int[] intArray30 = ds.MaxMin4.maxMin4(intArray24, (int) (short) 1, (int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray33 = ds.MaxMin4.maxMin4(intArray24, (int) '#', 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[100, 100, 1]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[100, 100]");
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
        org.junit.Assert.assertNotNull(intArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray24), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray27), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray30);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray30), "[100, 100]");
    }

    @Test
    public void test2147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2147");
        int[] intArray3 = new int[] { (short) 100, (short) 100, 1 };
        int[] intArray6 = ds.MaxMin4.maxMin4(intArray3, (int) (short) 0, (int) (short) 0);
        int[] intArray9 = ds.MaxMin4.maxMin4(intArray6, 1, 1);
        int[] intArray12 = ds.MaxMin4.maxMin4(intArray6, 1, 1);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray15 = ds.MaxMin4.maxMin4(intArray6, (int) (byte) -1, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[100, 100, 1]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[100, 100]");
    }

    @Test
    public void test2148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2148");
        int[] intArray3 = new int[] { (short) 100, (short) 100, 1 };
        int[] intArray6 = ds.MaxMin4.maxMin4(intArray3, (int) (short) 0, (int) (short) 0);
        int[] intArray9 = ds.MaxMin4.maxMin4(intArray6, 1, 1);
        int[] intArray12 = ds.MaxMin4.maxMin4(intArray6, (int) (byte) 0, 1);
        int[] intArray15 = ds.MaxMin4.maxMin4(intArray12, (int) (short) 0, 1);
        int[] intArray18 = ds.MaxMin4.maxMin4(intArray12, (int) (short) 1, 1);
        int[] intArray21 = ds.MaxMin4.maxMin4(intArray12, (int) (byte) 1, 1);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray24 = ds.MaxMin4.maxMin4(intArray12, 10, (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[100, 100, 1]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[100, 100]");
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
    public void test2149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2149");
        int[] intArray3 = new int[] { (short) 100, (short) 100, 1 };
        int[] intArray6 = ds.MaxMin4.maxMin4(intArray3, (int) (short) 0, (int) (short) 0);
        int[] intArray9 = ds.MaxMin4.maxMin4(intArray6, 1, 1);
        int[] intArray12 = ds.MaxMin4.maxMin4(intArray6, (int) (short) 1, 1);
        int[] intArray15 = ds.MaxMin4.maxMin4(intArray12, 0, 1);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray18 = ds.MaxMin4.maxMin4(intArray12, (int) 'a', (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[100, 100, 1]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[100, 100]");
    }

    @Test
    public void test2150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2150");
        int[] intArray3 = new int[] { (short) 100, (short) 100, 1 };
        int[] intArray6 = ds.MaxMin4.maxMin4(intArray3, (int) (short) 0, (int) (short) 0);
        int[] intArray9 = ds.MaxMin4.maxMin4(intArray6, 1, 1);
        int[] intArray12 = ds.MaxMin4.maxMin4(intArray9, 1, (int) (byte) 1);
        int[] intArray15 = ds.MaxMin4.maxMin4(intArray9, 1, 0);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray18 = ds.MaxMin4.maxMin4(intArray9, (int) (short) -1, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[100, 100, 1]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[100, 100]");
    }

    @Test
    public void test2151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2151");
        int[] intArray3 = new int[] { (short) 100, (short) 100, 1 };
        int[] intArray6 = ds.MaxMin4.maxMin4(intArray3, (int) (short) 0, (int) (short) 0);
        int[] intArray9 = ds.MaxMin4.maxMin4(intArray3, 0, 1);
        int[] intArray12 = ds.MaxMin4.maxMin4(intArray9, 0, (int) (short) 0);
        int[] intArray15 = ds.MaxMin4.maxMin4(intArray9, (int) (short) 1, 0);
        int[] intArray18 = ds.MaxMin4.maxMin4(intArray9, 0, (int) (byte) 0);
        int[] intArray21 = ds.MaxMin4.maxMin4(intArray9, (int) (short) 0, (int) (byte) 1);
        int[] intArray24 = ds.MaxMin4.maxMin4(intArray9, 1, (int) (short) 1);
        java.lang.Class<?> wildcardClass25 = intArray24.getClass();
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[100, 100, 1]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[100, 100]");
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
        org.junit.Assert.assertNotNull(intArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray24), "[100, 100]");
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test2152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2152");
        int[] intArray3 = new int[] { (short) 100, (short) 100, 1 };
        int[] intArray6 = ds.MaxMin4.maxMin4(intArray3, (int) (short) 0, (int) (short) 0);
        int[] intArray9 = ds.MaxMin4.maxMin4(intArray6, 1, 1);
        int[] intArray12 = ds.MaxMin4.maxMin4(intArray6, (int) (byte) 0, 1);
        int[] intArray15 = ds.MaxMin4.maxMin4(intArray12, (int) (short) 0, 1);
        int[] intArray18 = ds.MaxMin4.maxMin4(intArray12, (int) (short) 1, 1);
        int[] intArray21 = ds.MaxMin4.maxMin4(intArray12, (int) (byte) 1, 1);
        int[] intArray24 = ds.MaxMin4.maxMin4(intArray21, 0, (int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray27 = ds.MaxMin4.maxMin4(intArray24, (int) (byte) 1, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[100, 100, 1]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[100, 100]");
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
        org.junit.Assert.assertNotNull(intArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray24), "[100, 100]");
    }

    @Test
    public void test2153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2153");
        int[] intArray3 = new int[] { (short) 100, (short) 100, 1 };
        int[] intArray6 = ds.MaxMin4.maxMin4(intArray3, (int) (short) 0, (int) (short) 0);
        int[] intArray9 = ds.MaxMin4.maxMin4(intArray6, 1, 1);
        int[] intArray12 = ds.MaxMin4.maxMin4(intArray9, 1, (int) (byte) 1);
        int[] intArray15 = ds.MaxMin4.maxMin4(intArray12, 0, 0);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray18 = ds.MaxMin4.maxMin4(intArray12, 10, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[100, 100, 1]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[100, 100]");
    }

    @Test
    public void test2154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2154");
        int[] intArray3 = new int[] { (short) 100, (short) 100, 1 };
        int[] intArray6 = ds.MaxMin4.maxMin4(intArray3, (int) (short) 0, (int) (short) 0);
        int[] intArray9 = ds.MaxMin4.maxMin4(intArray3, 0, (int) (byte) 0);
        int[] intArray12 = ds.MaxMin4.maxMin4(intArray3, 0, 1);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray15 = ds.MaxMin4.maxMin4(intArray3, (int) (short) -1, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[100, 100, 1]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[100, 100]");
    }

    @Test
    public void test2155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2155");
        int[] intArray3 = new int[] { (short) 100, (short) 100, 1 };
        int[] intArray6 = ds.MaxMin4.maxMin4(intArray3, (int) (short) 0, (int) (short) 0);
        int[] intArray9 = ds.MaxMin4.maxMin4(intArray3, 0, 1);
        int[] intArray12 = ds.MaxMin4.maxMin4(intArray9, 0, (int) (short) 0);
        int[] intArray15 = ds.MaxMin4.maxMin4(intArray9, (int) (short) 1, 0);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray18 = ds.MaxMin4.maxMin4(intArray15, (int) (byte) 100, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[100, 100, 1]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[100, 100]");
    }

    @Test
    public void test2156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2156");
        int[] intArray3 = new int[] { (short) 100, (short) 100, 1 };
        int[] intArray6 = ds.MaxMin4.maxMin4(intArray3, (int) (short) 0, (int) (short) 0);
        int[] intArray9 = ds.MaxMin4.maxMin4(intArray6, 1, 1);
        int[] intArray12 = ds.MaxMin4.maxMin4(intArray9, 1, (int) (short) 0);
        int[] intArray15 = ds.MaxMin4.maxMin4(intArray9, 0, (int) (short) 1);
        int[] intArray18 = ds.MaxMin4.maxMin4(intArray15, (int) (byte) 1, (int) (byte) 0);
        int[] intArray21 = ds.MaxMin4.maxMin4(intArray18, 0, (int) (short) 0);
        int[] intArray24 = ds.MaxMin4.maxMin4(intArray21, (int) (byte) 0, 0);
        java.lang.Class<?> wildcardClass25 = intArray24.getClass();
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[100, 100, 1]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[100, 100]");
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
        org.junit.Assert.assertNotNull(intArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray24), "[100, 100]");
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test2157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2157");
        int[] intArray3 = new int[] { (short) 100, (short) 100, 1 };
        int[] intArray6 = ds.MaxMin4.maxMin4(intArray3, (int) (short) 0, (int) (short) 0);
        int[] intArray9 = ds.MaxMin4.maxMin4(intArray6, 1, 1);
        int[] intArray12 = ds.MaxMin4.maxMin4(intArray6, (int) (byte) 0, 1);
        int[] intArray15 = ds.MaxMin4.maxMin4(intArray12, 1, 1);
        int[] intArray18 = ds.MaxMin4.maxMin4(intArray12, 0, (int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray21 = ds.MaxMin4.maxMin4(intArray12, (int) (byte) 0, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[100, 100, 1]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[100, 100]");
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
    public void test2158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2158");
        int[] intArray3 = new int[] { (short) 100, (short) 100, 1 };
        int[] intArray6 = ds.MaxMin4.maxMin4(intArray3, (int) (short) 0, (int) (short) 0);
        int[] intArray9 = ds.MaxMin4.maxMin4(intArray6, 1, 1);
        int[] intArray12 = ds.MaxMin4.maxMin4(intArray9, 1, (int) (short) 0);
        int[] intArray15 = ds.MaxMin4.maxMin4(intArray9, 0, (int) (short) 1);
        int[] intArray18 = ds.MaxMin4.maxMin4(intArray9, 0, 0);
        int[] intArray21 = ds.MaxMin4.maxMin4(intArray9, (int) (short) 0, (int) (byte) 1);
        java.lang.Class<?> wildcardClass22 = intArray9.getClass();
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[100, 100, 1]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[100, 100]");
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
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test2159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2159");
        int[] intArray3 = new int[] { (short) 100, (short) 100, 1 };
        int[] intArray6 = ds.MaxMin4.maxMin4(intArray3, (int) (short) 0, (int) (short) 0);
        int[] intArray9 = ds.MaxMin4.maxMin4(intArray3, 0, 1);
        int[] intArray12 = ds.MaxMin4.maxMin4(intArray3, (int) (short) 1, (int) (byte) 1);
        int[] intArray15 = ds.MaxMin4.maxMin4(intArray12, (int) (byte) 1, 0);
        int[] intArray18 = ds.MaxMin4.maxMin4(intArray15, 0, 0);
        java.lang.Class<?> wildcardClass19 = intArray18.getClass();
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[100, 100, 1]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[100, 100]");
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
    public void test2160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2160");
        int[] intArray3 = new int[] { (short) 100, (short) 100, 1 };
        int[] intArray6 = ds.MaxMin4.maxMin4(intArray3, (int) (short) 0, (int) (short) 0);
        int[] intArray9 = ds.MaxMin4.maxMin4(intArray3, 0, 1);
        int[] intArray12 = ds.MaxMin4.maxMin4(intArray3, (int) (short) 0, 0);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray15 = ds.MaxMin4.maxMin4(intArray3, (int) 'a', (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[100, 100, 1]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[100, 100]");
    }

    @Test
    public void test2161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2161");
        int[] intArray3 = new int[] { (short) 100, (short) 100, 1 };
        int[] intArray6 = ds.MaxMin4.maxMin4(intArray3, (int) (short) 0, (int) (short) 0);
        int[] intArray9 = ds.MaxMin4.maxMin4(intArray3, 0, 1);
        int[] intArray12 = ds.MaxMin4.maxMin4(intArray9, 0, (int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray15 = ds.MaxMin4.maxMin4(intArray12, 100, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[100, 100, 1]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[100, 100]");
    }

    @Test
    public void test2162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2162");
        int[] intArray3 = new int[] { (short) 100, (short) 100, 1 };
        int[] intArray6 = ds.MaxMin4.maxMin4(intArray3, (int) (short) 0, (int) (short) 0);
        int[] intArray9 = ds.MaxMin4.maxMin4(intArray6, 1, 1);
        int[] intArray12 = ds.MaxMin4.maxMin4(intArray9, 1, (int) (byte) 1);
        int[] intArray15 = ds.MaxMin4.maxMin4(intArray12, 0, 0);
        int[] intArray18 = ds.MaxMin4.maxMin4(intArray15, (int) (short) 0, 1);
        int[] intArray21 = ds.MaxMin4.maxMin4(intArray18, 0, (int) (byte) 1);
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[100, 100, 1]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[100, 100]");
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
    public void test2163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2163");
        int[] intArray3 = new int[] { (short) 100, (short) 100, 1 };
        int[] intArray6 = ds.MaxMin4.maxMin4(intArray3, (int) (short) 0, (int) (short) 0);
        int[] intArray9 = ds.MaxMin4.maxMin4(intArray3, 0, (int) (byte) 0);
        int[] intArray12 = ds.MaxMin4.maxMin4(intArray9, (int) (byte) 1, (int) (byte) 1);
        int[] intArray15 = ds.MaxMin4.maxMin4(intArray12, (int) (short) 0, 0);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray18 = ds.MaxMin4.maxMin4(intArray12, (int) (short) 100, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[100, 100, 1]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[100, 100]");
    }

    @Test
    public void test2164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2164");
        int[] intArray3 = new int[] { (short) 100, (short) 100, 1 };
        int[] intArray6 = ds.MaxMin4.maxMin4(intArray3, (int) (short) 0, (int) (short) 0);
        int[] intArray9 = ds.MaxMin4.maxMin4(intArray6, 1, 1);
        int[] intArray12 = ds.MaxMin4.maxMin4(intArray9, 1, (int) (byte) 1);
        int[] intArray15 = ds.MaxMin4.maxMin4(intArray9, (int) (byte) 0, 0);
        int[] intArray18 = ds.MaxMin4.maxMin4(intArray9, (int) (short) 1, 1);
        int[] intArray21 = ds.MaxMin4.maxMin4(intArray18, 0, (int) (byte) 0);
        int[] intArray24 = ds.MaxMin4.maxMin4(intArray21, 0, 0);
        int[] intArray27 = ds.MaxMin4.maxMin4(intArray21, (int) (byte) 0, (int) (byte) 1);
        int[] intArray30 = ds.MaxMin4.maxMin4(intArray27, (int) (byte) 0, (int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray33 = ds.MaxMin4.maxMin4(intArray30, (int) (byte) 10, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[100, 100, 1]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[100, 100]");
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
        org.junit.Assert.assertNotNull(intArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray24), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray27), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray30);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray30), "[100, 100]");
    }

    @Test
    public void test2165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2165");
        int[] intArray3 = new int[] { (short) 100, (short) 100, 1 };
        int[] intArray6 = ds.MaxMin4.maxMin4(intArray3, (int) (short) 0, (int) (short) 0);
        int[] intArray9 = ds.MaxMin4.maxMin4(intArray3, 0, (int) (byte) 0);
        int[] intArray12 = ds.MaxMin4.maxMin4(intArray9, (int) (byte) 1, (int) (byte) 1);
        int[] intArray15 = ds.MaxMin4.maxMin4(intArray9, 0, 0);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray18 = ds.MaxMin4.maxMin4(intArray15, (int) '#', (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[100, 100, 1]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[100, 100]");
    }

    @Test
    public void test2166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2166");
        int[] intArray3 = new int[] { (short) 100, (short) 100, 1 };
        int[] intArray6 = ds.MaxMin4.maxMin4(intArray3, (int) (short) 0, (int) (short) 0);
        int[] intArray9 = ds.MaxMin4.maxMin4(intArray6, 1, 1);
        int[] intArray12 = ds.MaxMin4.maxMin4(intArray9, 1, (int) (short) 0);
        int[] intArray15 = ds.MaxMin4.maxMin4(intArray12, (int) (byte) 1, (int) (byte) 0);
        int[] intArray18 = ds.MaxMin4.maxMin4(intArray12, (int) (byte) 1, (int) (byte) 1);
        int[] intArray21 = ds.MaxMin4.maxMin4(intArray12, (int) (byte) 1, 1);
        int[] intArray24 = ds.MaxMin4.maxMin4(intArray12, 1, 1);
        int[] intArray27 = ds.MaxMin4.maxMin4(intArray24, (int) (byte) 0, (int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray30 = ds.MaxMin4.maxMin4(intArray27, 0, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[100, 100, 1]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[100, 100]");
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
        org.junit.Assert.assertNotNull(intArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray24), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray27), "[100, 100]");
    }

    @Test
    public void test2167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2167");
        int[] intArray3 = new int[] { (short) 100, (short) 100, 1 };
        int[] intArray6 = ds.MaxMin4.maxMin4(intArray3, (int) (short) 0, (int) (short) 0);
        int[] intArray9 = ds.MaxMin4.maxMin4(intArray6, 1, 1);
        int[] intArray12 = ds.MaxMin4.maxMin4(intArray6, (int) (byte) 0, 1);
        int[] intArray15 = ds.MaxMin4.maxMin4(intArray12, (int) (short) 0, 1);
        int[] intArray18 = ds.MaxMin4.maxMin4(intArray12, (int) (short) 1, 1);
        int[] intArray21 = ds.MaxMin4.maxMin4(intArray12, (int) (byte) 1, 1);
        int[] intArray24 = ds.MaxMin4.maxMin4(intArray12, (int) (short) 1, (int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray27 = ds.MaxMin4.maxMin4(intArray12, 100, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[100, 100, 1]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[100, 100]");
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
        org.junit.Assert.assertNotNull(intArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray24), "[100, 100]");
    }

    @Test
    public void test2168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2168");
        int[] intArray3 = new int[] { (short) 100, (short) 100, 1 };
        int[] intArray6 = ds.MaxMin4.maxMin4(intArray3, (int) (short) 0, (int) (short) 0);
        int[] intArray9 = ds.MaxMin4.maxMin4(intArray6, 1, 1);
        int[] intArray12 = ds.MaxMin4.maxMin4(intArray9, 1, (int) (byte) 1);
        int[] intArray15 = ds.MaxMin4.maxMin4(intArray12, 0, 0);
        int[] intArray18 = ds.MaxMin4.maxMin4(intArray15, 1, 0);
        int[] intArray21 = ds.MaxMin4.maxMin4(intArray15, (int) (byte) 1, (int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray24 = ds.MaxMin4.maxMin4(intArray21, (int) ' ', 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[100, 100, 1]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[100, 100]");
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
    public void test2169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2169");
        int[] intArray3 = new int[] { (short) 100, (short) 100, 1 };
        int[] intArray6 = ds.MaxMin4.maxMin4(intArray3, (int) (short) 0, (int) (short) 0);
        int[] intArray9 = ds.MaxMin4.maxMin4(intArray6, 1, 1);
        int[] intArray12 = ds.MaxMin4.maxMin4(intArray9, 1, (int) (short) 0);
        int[] intArray15 = ds.MaxMin4.maxMin4(intArray9, 0, (int) (short) 1);
        int[] intArray18 = ds.MaxMin4.maxMin4(intArray15, (int) (byte) 1, (int) (byte) 0);
        int[] intArray21 = ds.MaxMin4.maxMin4(intArray18, 0, (int) (short) 0);
        int[] intArray24 = ds.MaxMin4.maxMin4(intArray21, (int) (byte) 0, 0);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray27 = ds.MaxMin4.maxMin4(intArray21, (int) 'a', (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[100, 100, 1]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[100, 100]");
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
        org.junit.Assert.assertNotNull(intArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray24), "[100, 100]");
    }

    @Test
    public void test2170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2170");
        int[] intArray3 = new int[] { (short) 100, (short) 100, 1 };
        int[] intArray6 = ds.MaxMin4.maxMin4(intArray3, (int) (short) 0, (int) (short) 0);
        int[] intArray9 = ds.MaxMin4.maxMin4(intArray6, (int) (short) 0, 0);
        int[] intArray12 = ds.MaxMin4.maxMin4(intArray6, (int) (byte) 1, 1);
        int[] intArray15 = ds.MaxMin4.maxMin4(intArray6, (int) (short) 1, (int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray18 = ds.MaxMin4.maxMin4(intArray6, (int) (byte) 100, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[100, 100, 1]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[100, 100]");
    }

    @Test
    public void test2171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2171");
        int[] intArray3 = new int[] { (short) 100, (short) 100, 1 };
        int[] intArray6 = ds.MaxMin4.maxMin4(intArray3, (int) (short) 0, (int) (short) 0);
        int[] intArray9 = ds.MaxMin4.maxMin4(intArray6, 1, 1);
        int[] intArray12 = ds.MaxMin4.maxMin4(intArray9, 1, (int) (short) 0);
        int[] intArray15 = ds.MaxMin4.maxMin4(intArray12, (int) (byte) 1, (int) (byte) 0);
        int[] intArray18 = ds.MaxMin4.maxMin4(intArray12, (int) (byte) 1, (int) (byte) 1);
        int[] intArray21 = ds.MaxMin4.maxMin4(intArray12, (int) (byte) 1, 1);
        int[] intArray24 = ds.MaxMin4.maxMin4(intArray12, 1, 1);
        int[] intArray27 = ds.MaxMin4.maxMin4(intArray24, (int) (byte) 0, (int) (short) 0);
        int[] intArray30 = ds.MaxMin4.maxMin4(intArray24, 0, (int) (byte) 1);
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[100, 100, 1]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[100, 100]");
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
        org.junit.Assert.assertNotNull(intArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray24), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray27), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray30);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray30), "[100, 100]");
    }

    @Test
    public void test2172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2172");
        int[] intArray3 = new int[] { (short) 100, (short) 100, 1 };
        int[] intArray6 = ds.MaxMin4.maxMin4(intArray3, (int) (short) 0, (int) (short) 0);
        int[] intArray9 = ds.MaxMin4.maxMin4(intArray6, 1, 1);
        int[] intArray12 = ds.MaxMin4.maxMin4(intArray9, 1, (int) (short) 0);
        int[] intArray15 = ds.MaxMin4.maxMin4(intArray12, (int) (byte) 1, (int) (byte) 0);
        int[] intArray18 = ds.MaxMin4.maxMin4(intArray12, (int) (byte) 1, (int) (byte) 1);
        int[] intArray21 = ds.MaxMin4.maxMin4(intArray18, (int) (byte) 0, 1);
        int[] intArray24 = ds.MaxMin4.maxMin4(intArray21, 0, (int) (short) 1);
        int[] intArray27 = ds.MaxMin4.maxMin4(intArray24, (int) (short) 1, (int) (short) 0);
        int[] intArray30 = ds.MaxMin4.maxMin4(intArray27, 0, (int) (byte) 0);
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[100, 100, 1]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[100, 100]");
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
        org.junit.Assert.assertNotNull(intArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray24), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray27), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray30);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray30), "[100, 100]");
    }

    @Test
    public void test2173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2173");
        int[] intArray3 = new int[] { (short) 100, (short) 100, 1 };
        int[] intArray6 = ds.MaxMin4.maxMin4(intArray3, (int) (short) 0, (int) (short) 0);
        int[] intArray9 = ds.MaxMin4.maxMin4(intArray6, 1, 1);
        int[] intArray12 = ds.MaxMin4.maxMin4(intArray9, (int) (byte) 1, (int) (short) 0);
        int[] intArray15 = ds.MaxMin4.maxMin4(intArray9, 1, 1);
        int[] intArray18 = ds.MaxMin4.maxMin4(intArray15, 0, 0);
        int[] intArray21 = ds.MaxMin4.maxMin4(intArray18, (int) (short) 0, 1);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray24 = ds.MaxMin4.maxMin4(intArray18, 0, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[100, 100, 1]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[100, 100]");
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
    public void test2174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2174");
        int[] intArray3 = new int[] { (short) 100, (short) 100, 1 };
        int[] intArray6 = ds.MaxMin4.maxMin4(intArray3, (int) (short) 0, (int) (short) 0);
        int[] intArray9 = ds.MaxMin4.maxMin4(intArray6, 1, 1);
        int[] intArray12 = ds.MaxMin4.maxMin4(intArray6, (int) (byte) 0, 1);
        int[] intArray15 = ds.MaxMin4.maxMin4(intArray12, (int) (short) 0, 1);
        int[] intArray18 = ds.MaxMin4.maxMin4(intArray15, (int) (short) 1, 0);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray21 = ds.MaxMin4.maxMin4(intArray18, (int) (short) 100, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[100, 100, 1]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[100, 100]");
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
    public void test2175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2175");
        int[] intArray3 = new int[] { (short) 100, (short) 100, 1 };
        int[] intArray6 = ds.MaxMin4.maxMin4(intArray3, (int) (short) 0, (int) (short) 0);
        int[] intArray9 = ds.MaxMin4.maxMin4(intArray6, 1, 1);
        int[] intArray12 = ds.MaxMin4.maxMin4(intArray9, 1, (int) (short) 0);
        int[] intArray15 = ds.MaxMin4.maxMin4(intArray12, (int) (byte) 1, (int) (byte) 0);
        int[] intArray18 = ds.MaxMin4.maxMin4(intArray12, (int) (byte) 1, (int) (byte) 1);
        int[] intArray21 = ds.MaxMin4.maxMin4(intArray18, (int) (byte) 0, 1);
        int[] intArray24 = ds.MaxMin4.maxMin4(intArray21, 0, (int) (short) 1);
        int[] intArray27 = ds.MaxMin4.maxMin4(intArray24, (int) (short) 0, 0);
        int[] intArray30 = ds.MaxMin4.maxMin4(intArray24, (int) (byte) 1, (int) (short) 0);
        int[] intArray33 = ds.MaxMin4.maxMin4(intArray24, (int) (byte) 1, (int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray36 = ds.MaxMin4.maxMin4(intArray24, (int) '#', (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[100, 100, 1]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[100, 100]");
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
    public void test2176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2176");
        int[] intArray3 = new int[] { (short) 100, (short) 100, 1 };
        int[] intArray6 = ds.MaxMin4.maxMin4(intArray3, (int) (short) 0, (int) (short) 0);
        int[] intArray9 = ds.MaxMin4.maxMin4(intArray6, 1, 1);
        int[] intArray12 = ds.MaxMin4.maxMin4(intArray9, 1, 0);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray15 = ds.MaxMin4.maxMin4(intArray9, (int) (byte) -1, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[100, 100, 1]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[100, 100]");
    }

    @Test
    public void test2177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2177");
        int[] intArray3 = new int[] { (short) 100, (short) 100, 1 };
        int[] intArray6 = ds.MaxMin4.maxMin4(intArray3, (int) (short) 0, (int) (short) 0);
        int[] intArray9 = ds.MaxMin4.maxMin4(intArray6, 1, 1);
        int[] intArray12 = ds.MaxMin4.maxMin4(intArray9, 1, (int) (short) 0);
        int[] intArray15 = ds.MaxMin4.maxMin4(intArray9, 0, (int) (short) 1);
        int[] intArray18 = ds.MaxMin4.maxMin4(intArray9, 0, 0);
        int[] intArray21 = ds.MaxMin4.maxMin4(intArray9, (int) (short) 1, (int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray24 = ds.MaxMin4.maxMin4(intArray9, (-1), (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[100, 100, 1]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[100, 100]");
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
    public void test2178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2178");
        int[] intArray3 = new int[] { (short) 100, (short) 100, 1 };
        int[] intArray6 = ds.MaxMin4.maxMin4(intArray3, (int) (short) 0, (int) (short) 0);
        int[] intArray9 = ds.MaxMin4.maxMin4(intArray6, 1, 1);
        int[] intArray12 = ds.MaxMin4.maxMin4(intArray9, 1, (int) (short) 0);
        int[] intArray15 = ds.MaxMin4.maxMin4(intArray12, (int) (byte) 1, (int) (byte) 0);
        int[] intArray18 = ds.MaxMin4.maxMin4(intArray12, (int) (byte) 1, (int) (byte) 1);
        int[] intArray21 = ds.MaxMin4.maxMin4(intArray18, (int) (byte) 0, 1);
        int[] intArray24 = ds.MaxMin4.maxMin4(intArray18, (int) (byte) 0, (int) (byte) 0);
        int[] intArray27 = ds.MaxMin4.maxMin4(intArray24, 0, 0);
        int[] intArray30 = ds.MaxMin4.maxMin4(intArray27, 0, (int) (byte) 1);
        int[] intArray33 = ds.MaxMin4.maxMin4(intArray30, (int) (short) 1, 0);
        int[] intArray36 = ds.MaxMin4.maxMin4(intArray33, 0, 0);
        int[] intArray39 = ds.MaxMin4.maxMin4(intArray33, 0, (int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray42 = ds.MaxMin4.maxMin4(intArray33, (int) (byte) 100, 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[100, 100, 1]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[100, 100]");
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
        org.junit.Assert.assertNotNull(intArray39);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray39), "[100, 100]");
    }

    @Test
    public void test2179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2179");
        int[] intArray3 = new int[] { (short) 100, (short) 100, 1 };
        int[] intArray6 = ds.MaxMin4.maxMin4(intArray3, (int) (short) 0, (int) (short) 0);
        int[] intArray9 = ds.MaxMin4.maxMin4(intArray6, 1, 1);
        int[] intArray12 = ds.MaxMin4.maxMin4(intArray9, 1, (int) (short) 0);
        int[] intArray15 = ds.MaxMin4.maxMin4(intArray9, 0, (int) (short) 1);
        int[] intArray18 = ds.MaxMin4.maxMin4(intArray15, (int) (byte) 1, (int) (byte) 0);
        int[] intArray21 = ds.MaxMin4.maxMin4(intArray18, 0, (int) (short) 0);
        int[] intArray24 = ds.MaxMin4.maxMin4(intArray18, 1, 0);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray27 = ds.MaxMin4.maxMin4(intArray24, (int) (short) -1, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[100, 100, 1]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[100, 100]");
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
        org.junit.Assert.assertNotNull(intArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray24), "[100, 100]");
    }

    @Test
    public void test2180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2180");
        int[] intArray3 = new int[] { (short) 100, (short) 100, 1 };
        int[] intArray6 = ds.MaxMin4.maxMin4(intArray3, (int) (short) 0, (int) (short) 0);
        int[] intArray9 = ds.MaxMin4.maxMin4(intArray3, 0, (int) (byte) 0);
        int[] intArray12 = ds.MaxMin4.maxMin4(intArray3, 0, 1);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray15 = ds.MaxMin4.maxMin4(intArray12, (int) (byte) 0, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[100, 100, 1]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[100, 100]");
    }

    @Test
    public void test2181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2181");
        int[] intArray3 = new int[] { (short) 100, (short) 100, 1 };
        int[] intArray6 = ds.MaxMin4.maxMin4(intArray3, (int) (short) 0, (int) (short) 0);
        int[] intArray9 = ds.MaxMin4.maxMin4(intArray6, 1, 1);
        int[] intArray12 = ds.MaxMin4.maxMin4(intArray6, (int) (short) 1, 1);
        int[] intArray15 = ds.MaxMin4.maxMin4(intArray12, 0, 1);
        int[] intArray18 = ds.MaxMin4.maxMin4(intArray12, (int) (short) 1, 1);
        int[] intArray21 = ds.MaxMin4.maxMin4(intArray12, (int) (byte) 0, 0);
        int[] intArray24 = ds.MaxMin4.maxMin4(intArray21, (int) (short) 1, (int) (byte) 0);
        java.lang.Class<?> wildcardClass25 = intArray24.getClass();
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[100, 100, 1]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[100, 100]");
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
        org.junit.Assert.assertNotNull(intArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray24), "[100, 100]");
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test2182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2182");
        int[] intArray3 = new int[] { (short) 100, (short) 100, 1 };
        int[] intArray6 = ds.MaxMin4.maxMin4(intArray3, (int) (short) 0, (int) (short) 0);
        int[] intArray9 = ds.MaxMin4.maxMin4(intArray6, 1, 1);
        int[] intArray12 = ds.MaxMin4.maxMin4(intArray9, 1, (int) (short) 0);
        int[] intArray15 = ds.MaxMin4.maxMin4(intArray12, (int) (byte) 1, (int) (byte) 0);
        int[] intArray18 = ds.MaxMin4.maxMin4(intArray12, (int) (byte) 1, (int) (byte) 1);
        int[] intArray21 = ds.MaxMin4.maxMin4(intArray18, (int) (byte) 0, 1);
        int[] intArray24 = ds.MaxMin4.maxMin4(intArray18, 0, (int) (short) 1);
        int[] intArray27 = ds.MaxMin4.maxMin4(intArray18, (int) (short) 1, (int) (byte) 0);
        int[] intArray30 = ds.MaxMin4.maxMin4(intArray18, (int) (byte) 0, 0);
        int[] intArray33 = ds.MaxMin4.maxMin4(intArray30, 1, 0);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray36 = ds.MaxMin4.maxMin4(intArray33, (int) '4', (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[100, 100, 1]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[100, 100]");
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
    public void test2183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2183");
        int[] intArray3 = new int[] { (short) 100, (short) 100, 1 };
        int[] intArray6 = ds.MaxMin4.maxMin4(intArray3, (int) (short) 0, (int) (short) 0);
        int[] intArray9 = ds.MaxMin4.maxMin4(intArray6, 1, 1);
        int[] intArray12 = ds.MaxMin4.maxMin4(intArray9, 1, (int) (byte) 1);
        int[] intArray15 = ds.MaxMin4.maxMin4(intArray9, (int) (byte) 0, 0);
        int[] intArray18 = ds.MaxMin4.maxMin4(intArray15, 1, (int) (short) 0);
        int[] intArray21 = ds.MaxMin4.maxMin4(intArray15, (int) (short) 0, 0);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray24 = ds.MaxMin4.maxMin4(intArray21, (-1), (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[100, 100, 1]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[100, 100]");
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
    public void test2184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2184");
        int[] intArray3 = new int[] { (short) 100, (short) 100, 1 };
        int[] intArray6 = ds.MaxMin4.maxMin4(intArray3, (int) (short) 0, (int) (short) 0);
        int[] intArray9 = ds.MaxMin4.maxMin4(intArray6, 1, 1);
        int[] intArray12 = ds.MaxMin4.maxMin4(intArray9, 1, (int) (short) 0);
        int[] intArray15 = ds.MaxMin4.maxMin4(intArray9, 0, (int) (short) 1);
        int[] intArray18 = ds.MaxMin4.maxMin4(intArray15, (int) (byte) 1, (int) (byte) 0);
        int[] intArray21 = ds.MaxMin4.maxMin4(intArray18, 0, (int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray24 = ds.MaxMin4.maxMin4(intArray21, 10, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[100, 100, 1]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[100, 100]");
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
    public void test2185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2185");
        int[] intArray3 = new int[] { (short) 100, (short) 100, 1 };
        int[] intArray6 = ds.MaxMin4.maxMin4(intArray3, (int) (short) 0, (int) (short) 0);
        int[] intArray9 = ds.MaxMin4.maxMin4(intArray6, 1, 1);
        int[] intArray12 = ds.MaxMin4.maxMin4(intArray9, 1, (int) (byte) 1);
        int[] intArray15 = ds.MaxMin4.maxMin4(intArray9, (int) (byte) 0, 0);
        int[] intArray18 = ds.MaxMin4.maxMin4(intArray9, (int) (short) 1, 1);
        int[] intArray21 = ds.MaxMin4.maxMin4(intArray9, 1, 1);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray24 = ds.MaxMin4.maxMin4(intArray9, 10, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[100, 100, 1]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[100, 100]");
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
    public void test2186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2186");
        int[] intArray3 = new int[] { (short) 100, (short) 100, 1 };
        int[] intArray6 = ds.MaxMin4.maxMin4(intArray3, (int) (short) 0, (int) (short) 0);
        int[] intArray9 = ds.MaxMin4.maxMin4(intArray6, 1, 1);
        int[] intArray12 = ds.MaxMin4.maxMin4(intArray9, 1, (int) (short) 0);
        int[] intArray15 = ds.MaxMin4.maxMin4(intArray9, 0, (int) (short) 1);
        int[] intArray18 = ds.MaxMin4.maxMin4(intArray15, (int) (byte) 1, (int) (byte) 0);
        int[] intArray21 = ds.MaxMin4.maxMin4(intArray15, (int) (byte) 0, (int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray24 = ds.MaxMin4.maxMin4(intArray21, (int) '4', 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[100, 100, 1]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[100, 100]");
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
    public void test2187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2187");
        int[] intArray3 = new int[] { (short) 100, (short) 100, 1 };
        int[] intArray6 = ds.MaxMin4.maxMin4(intArray3, (int) (short) 0, (int) (short) 0);
        int[] intArray9 = ds.MaxMin4.maxMin4(intArray6, (int) (short) 0, 0);
        int[] intArray12 = ds.MaxMin4.maxMin4(intArray6, (int) (byte) 1, 1);
        int[] intArray15 = ds.MaxMin4.maxMin4(intArray6, (int) (short) 1, (int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray18 = ds.MaxMin4.maxMin4(intArray15, (int) (byte) 100, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[100, 100, 1]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[100, 100]");
    }

    @Test
    public void test2188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2188");
        int[] intArray3 = new int[] { (short) 100, (short) 100, 1 };
        int[] intArray6 = ds.MaxMin4.maxMin4(intArray3, (int) (short) 0, (int) (short) 0);
        int[] intArray9 = ds.MaxMin4.maxMin4(intArray6, 1, 1);
        int[] intArray12 = ds.MaxMin4.maxMin4(intArray6, (int) (byte) 0, 1);
        int[] intArray15 = ds.MaxMin4.maxMin4(intArray12, (int) (short) 0, 1);
        int[] intArray18 = ds.MaxMin4.maxMin4(intArray15, (int) (short) 1, 0);
        int[] intArray21 = ds.MaxMin4.maxMin4(intArray18, (int) (short) 0, 0);
        int[] intArray24 = ds.MaxMin4.maxMin4(intArray21, 0, (int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray27 = ds.MaxMin4.maxMin4(intArray24, 100, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[100, 100, 1]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[100, 100]");
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
        org.junit.Assert.assertNotNull(intArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray24), "[100, 100]");
    }

    @Test
    public void test2189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2189");
        int[] intArray3 = new int[] { (short) 100, (short) 100, 1 };
        int[] intArray6 = ds.MaxMin4.maxMin4(intArray3, (int) (short) 0, (int) (short) 0);
        int[] intArray9 = ds.MaxMin4.maxMin4(intArray6, 1, 1);
        int[] intArray12 = ds.MaxMin4.maxMin4(intArray6, (int) (short) 1, 1);
        int[] intArray15 = ds.MaxMin4.maxMin4(intArray12, 0, 1);
        int[] intArray18 = ds.MaxMin4.maxMin4(intArray12, (int) (short) 1, 1);
        int[] intArray21 = ds.MaxMin4.maxMin4(intArray12, (int) (byte) 0, 0);
        int[] intArray24 = ds.MaxMin4.maxMin4(intArray21, (int) (short) 1, (int) (byte) 0);
        java.lang.Class<?> wildcardClass25 = intArray21.getClass();
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[100, 100, 1]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[100, 100]");
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
        org.junit.Assert.assertNotNull(intArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray24), "[100, 100]");
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test2190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2190");
        int[] intArray0 = null;
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray3 = ds.MaxMin4.maxMin4(intArray0, 0, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2191");
        int[] intArray3 = new int[] { (short) 100, (short) 100, 1 };
        int[] intArray6 = ds.MaxMin4.maxMin4(intArray3, (int) (short) 0, (int) (short) 0);
        int[] intArray9 = ds.MaxMin4.maxMin4(intArray6, 1, 1);
        int[] intArray12 = ds.MaxMin4.maxMin4(intArray9, 1, (int) (short) 0);
        int[] intArray15 = ds.MaxMin4.maxMin4(intArray12, (int) (byte) 1, (int) (byte) 0);
        int[] intArray18 = ds.MaxMin4.maxMin4(intArray12, (int) (byte) 1, (int) (byte) 1);
        int[] intArray21 = ds.MaxMin4.maxMin4(intArray12, (int) (byte) 1, 1);
        int[] intArray24 = ds.MaxMin4.maxMin4(intArray12, 1, 1);
        int[] intArray27 = ds.MaxMin4.maxMin4(intArray24, 1, 0);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray30 = ds.MaxMin4.maxMin4(intArray27, (int) (short) 10, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[100, 100, 1]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[100, 100]");
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
        org.junit.Assert.assertNotNull(intArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray24), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray27), "[100, 100]");
    }

    @Test
    public void test2192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2192");
        int[] intArray3 = new int[] { (short) 100, (short) 100, 1 };
        int[] intArray6 = ds.MaxMin4.maxMin4(intArray3, (int) (short) 0, (int) (short) 0);
        int[] intArray9 = ds.MaxMin4.maxMin4(intArray6, 1, 1);
        int[] intArray12 = ds.MaxMin4.maxMin4(intArray6, (int) (byte) 0, 1);
        int[] intArray15 = ds.MaxMin4.maxMin4(intArray12, (int) (byte) 1, 0);
        int[] intArray18 = ds.MaxMin4.maxMin4(intArray15, (int) (byte) 0, (int) (byte) 0);
        java.lang.Class<?> wildcardClass19 = intArray15.getClass();
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[100, 100, 1]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[100, 100]");
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
    public void test2193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2193");
        int[] intArray3 = new int[] { (short) 100, (short) 100, 1 };
        int[] intArray6 = ds.MaxMin4.maxMin4(intArray3, (int) (short) 0, (int) (short) 0);
        int[] intArray9 = ds.MaxMin4.maxMin4(intArray3, 0, (int) (byte) 0);
        int[] intArray12 = ds.MaxMin4.maxMin4(intArray9, (int) (byte) 1, (int) (byte) 1);
        int[] intArray15 = ds.MaxMin4.maxMin4(intArray9, 0, 0);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray18 = ds.MaxMin4.maxMin4(intArray9, (int) (byte) 100, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[100, 100, 1]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[100, 100]");
    }

    @Test
    public void test2194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2194");
        int[] intArray3 = new int[] { (short) 100, (short) 100, 1 };
        int[] intArray6 = ds.MaxMin4.maxMin4(intArray3, (int) (short) 0, (int) (short) 0);
        int[] intArray9 = ds.MaxMin4.maxMin4(intArray6, 1, 1);
        int[] intArray12 = ds.MaxMin4.maxMin4(intArray9, 1, (int) (short) 0);
        int[] intArray15 = ds.MaxMin4.maxMin4(intArray12, (int) (byte) 1, (int) (byte) 0);
        int[] intArray18 = ds.MaxMin4.maxMin4(intArray12, (int) (byte) 1, (int) (byte) 1);
        int[] intArray21 = ds.MaxMin4.maxMin4(intArray18, (int) (byte) 0, 1);
        int[] intArray24 = ds.MaxMin4.maxMin4(intArray18, (int) (byte) 0, (int) (byte) 0);
        int[] intArray27 = ds.MaxMin4.maxMin4(intArray24, 0, 0);
        int[] intArray30 = ds.MaxMin4.maxMin4(intArray27, 0, (int) (byte) 1);
        int[] intArray33 = ds.MaxMin4.maxMin4(intArray30, (int) (short) 1, 0);
        int[] intArray36 = ds.MaxMin4.maxMin4(intArray33, 0, 0);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray39 = ds.MaxMin4.maxMin4(intArray33, (int) (short) 100, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[100, 100, 1]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[100, 100]");
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
    public void test2195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2195");
        int[] intArray3 = new int[] { (short) 100, (short) 100, 1 };
        int[] intArray6 = ds.MaxMin4.maxMin4(intArray3, (int) (short) 0, (int) (short) 0);
        int[] intArray9 = ds.MaxMin4.maxMin4(intArray6, 1, 1);
        int[] intArray12 = ds.MaxMin4.maxMin4(intArray6, (int) (short) 1, 1);
        int[] intArray15 = ds.MaxMin4.maxMin4(intArray12, 0, 1);
        int[] intArray18 = ds.MaxMin4.maxMin4(intArray15, (int) (short) 1, 1);
        int[] intArray21 = ds.MaxMin4.maxMin4(intArray18, 1, (int) (short) 0);
        java.lang.Class<?> wildcardClass22 = intArray18.getClass();
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[100, 100, 1]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[100, 100]");
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
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test2196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2196");
        int[] intArray0 = null;
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray3 = ds.MaxMin4.maxMin4(intArray0, 1, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2197");
        int[] intArray3 = new int[] { (short) 100, (short) 100, 1 };
        int[] intArray6 = ds.MaxMin4.maxMin4(intArray3, (int) (short) 0, (int) (short) 0);
        int[] intArray9 = ds.MaxMin4.maxMin4(intArray6, 1, 1);
        int[] intArray12 = ds.MaxMin4.maxMin4(intArray9, 1, (int) (short) 0);
        int[] intArray15 = ds.MaxMin4.maxMin4(intArray9, 0, (int) (short) 1);
        int[] intArray18 = ds.MaxMin4.maxMin4(intArray15, (int) (byte) 1, (int) (byte) 0);
        int[] intArray21 = ds.MaxMin4.maxMin4(intArray18, 0, (int) (short) 0);
        int[] intArray24 = ds.MaxMin4.maxMin4(intArray21, 1, (int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray27 = ds.MaxMin4.maxMin4(intArray21, (int) (byte) 100, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[100, 100, 1]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[100, 100]");
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
        org.junit.Assert.assertNotNull(intArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray24), "[100, 100]");
    }

    @Test
    public void test2198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2198");
        int[] intArray3 = new int[] { (short) 100, (short) 100, 1 };
        int[] intArray6 = ds.MaxMin4.maxMin4(intArray3, (int) (short) 0, (int) (short) 0);
        int[] intArray9 = ds.MaxMin4.maxMin4(intArray6, 1, 1);
        int[] intArray12 = ds.MaxMin4.maxMin4(intArray9, (int) (byte) 1, (int) (short) 0);
        int[] intArray15 = ds.MaxMin4.maxMin4(intArray9, 1, 1);
        int[] intArray18 = ds.MaxMin4.maxMin4(intArray9, 0, (int) (byte) 0);
        int[] intArray21 = ds.MaxMin4.maxMin4(intArray18, 1, 0);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray24 = ds.MaxMin4.maxMin4(intArray18, 10, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[100, 100, 1]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[100, 100]");
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
    public void test2199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2199");
        int[] intArray3 = new int[] { (short) 100, (short) 100, 1 };
        int[] intArray6 = ds.MaxMin4.maxMin4(intArray3, (int) (short) 0, (int) (short) 0);
        int[] intArray9 = ds.MaxMin4.maxMin4(intArray6, 1, 1);
        int[] intArray12 = ds.MaxMin4.maxMin4(intArray6, (int) (short) 1, 1);
        int[] intArray15 = ds.MaxMin4.maxMin4(intArray12, 0, 1);
        int[] intArray18 = ds.MaxMin4.maxMin4(intArray12, (int) (short) 1, 1);
        int[] intArray21 = ds.MaxMin4.maxMin4(intArray12, (int) (byte) 0, 0);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray24 = ds.MaxMin4.maxMin4(intArray21, (int) 'a', (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[100, 100, 1]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[100, 100]");
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
    public void test2200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2200");
        int[] intArray3 = new int[] { (short) 100, (short) 100, 1 };
        int[] intArray6 = ds.MaxMin4.maxMin4(intArray3, (int) (short) 0, (int) (short) 0);
        int[] intArray9 = ds.MaxMin4.maxMin4(intArray6, 1, 1);
        int[] intArray12 = ds.MaxMin4.maxMin4(intArray9, 1, (int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray15 = ds.MaxMin4.maxMin4(intArray12, (int) (short) -1, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[100, 100, 1]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[100, 100]");
    }

    @Test
    public void test2201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2201");
        int[] intArray3 = new int[] { (short) 100, (short) 100, 1 };
        int[] intArray6 = ds.MaxMin4.maxMin4(intArray3, (int) (short) 0, (int) (short) 0);
        int[] intArray9 = ds.MaxMin4.maxMin4(intArray6, 1, 1);
        int[] intArray12 = ds.MaxMin4.maxMin4(intArray6, (int) (byte) 0, 1);
        int[] intArray15 = ds.MaxMin4.maxMin4(intArray12, (int) (short) 0, 1);
        int[] intArray18 = ds.MaxMin4.maxMin4(intArray15, (int) (short) 1, 0);
        int[] intArray21 = ds.MaxMin4.maxMin4(intArray18, (int) (short) 1, (int) (short) 1);
        java.lang.Class<?> wildcardClass22 = intArray21.getClass();
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[100, 100, 1]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[100, 100]");
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
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test2202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2202");
        int[] intArray3 = new int[] { (short) 100, (short) 100, 1 };
        int[] intArray6 = ds.MaxMin4.maxMin4(intArray3, (int) (short) 0, (int) (short) 0);
        int[] intArray9 = ds.MaxMin4.maxMin4(intArray6, 1, 1);
        int[] intArray12 = ds.MaxMin4.maxMin4(intArray6, (int) (short) 1, 1);
        int[] intArray15 = ds.MaxMin4.maxMin4(intArray12, 0, 1);
        int[] intArray18 = ds.MaxMin4.maxMin4(intArray15, (int) (short) 1, 1);
        int[] intArray21 = ds.MaxMin4.maxMin4(intArray18, 1, (int) (short) 0);
        int[] intArray24 = ds.MaxMin4.maxMin4(intArray18, (int) (byte) 1, (int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray27 = ds.MaxMin4.maxMin4(intArray18, (int) (short) 10, (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[100, 100, 1]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[100, 100]");
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
        org.junit.Assert.assertNotNull(intArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray24), "[100, 100]");
    }

    @Test
    public void test2203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2203");
        int[] intArray3 = new int[] { (short) 100, (short) 100, 1 };
        int[] intArray6 = ds.MaxMin4.maxMin4(intArray3, (int) (short) 0, (int) (short) 0);
        int[] intArray9 = ds.MaxMin4.maxMin4(intArray6, 1, 1);
        int[] intArray12 = ds.MaxMin4.maxMin4(intArray9, 1, (int) (short) 0);
        int[] intArray15 = ds.MaxMin4.maxMin4(intArray9, 0, (int) (short) 1);
        int[] intArray18 = ds.MaxMin4.maxMin4(intArray15, (int) (byte) 1, (int) (byte) 0);
        int[] intArray21 = ds.MaxMin4.maxMin4(intArray18, 0, (int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray24 = ds.MaxMin4.maxMin4(intArray18, 10, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[100, 100, 1]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[100, 100]");
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
    public void test2204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2204");
        int[] intArray3 = new int[] { (short) 100, (short) 100, 1 };
        int[] intArray6 = ds.MaxMin4.maxMin4(intArray3, (int) (short) 0, (int) (short) 0);
        int[] intArray9 = ds.MaxMin4.maxMin4(intArray6, 1, 1);
        int[] intArray12 = ds.MaxMin4.maxMin4(intArray9, 1, (int) (short) 0);
        int[] intArray15 = ds.MaxMin4.maxMin4(intArray12, (int) (byte) 1, (int) (byte) 0);
        int[] intArray18 = ds.MaxMin4.maxMin4(intArray12, (int) (byte) 1, (int) (byte) 1);
        int[] intArray21 = ds.MaxMin4.maxMin4(intArray18, (int) (byte) 0, 1);
        int[] intArray24 = ds.MaxMin4.maxMin4(intArray18, 0, (int) (short) 1);
        int[] intArray27 = ds.MaxMin4.maxMin4(intArray18, (int) (short) 1, (int) (byte) 0);
        int[] intArray30 = ds.MaxMin4.maxMin4(intArray18, (int) (byte) 0, 0);
        int[] intArray33 = ds.MaxMin4.maxMin4(intArray18, (int) (byte) 0, (int) (byte) 0);
        java.lang.Class<?> wildcardClass34 = intArray33.getClass();
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[100, 100, 1]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[100, 100]");
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
        org.junit.Assert.assertNotNull(intArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray24), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray27), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray30);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray30), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray33);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray33), "[100, 100]");
        org.junit.Assert.assertNotNull(wildcardClass34);
    }

    @Test
    public void test2205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2205");
        int[] intArray3 = new int[] { (short) 100, (short) 100, 1 };
        int[] intArray6 = ds.MaxMin4.maxMin4(intArray3, (int) (short) 0, (int) (short) 0);
        int[] intArray9 = ds.MaxMin4.maxMin4(intArray3, 0, 1);
        int[] intArray12 = ds.MaxMin4.maxMin4(intArray9, 0, (int) (short) 0);
        int[] intArray15 = ds.MaxMin4.maxMin4(intArray9, (int) (short) 1, 0);
        int[] intArray18 = ds.MaxMin4.maxMin4(intArray9, 0, (int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray21 = ds.MaxMin4.maxMin4(intArray18, 0, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[100, 100, 1]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[100, 100]");
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
    public void test2206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2206");
        int[] intArray3 = new int[] { (short) 100, (short) 100, 1 };
        int[] intArray6 = ds.MaxMin4.maxMin4(intArray3, (int) (short) 0, (int) (short) 0);
        int[] intArray9 = ds.MaxMin4.maxMin4(intArray6, 1, 1);
        int[] intArray12 = ds.MaxMin4.maxMin4(intArray9, 1, (int) (byte) 1);
        int[] intArray15 = ds.MaxMin4.maxMin4(intArray9, 1, 0);
        int[] intArray18 = ds.MaxMin4.maxMin4(intArray15, 0, 0);
        int[] intArray21 = ds.MaxMin4.maxMin4(intArray18, 0, 1);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray24 = ds.MaxMin4.maxMin4(intArray21, (int) (byte) 10, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[100, 100, 1]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[100, 100]");
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
    public void test2207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2207");
        int[] intArray3 = new int[] { (short) 100, (short) 100, 1 };
        int[] intArray6 = ds.MaxMin4.maxMin4(intArray3, (int) (short) 0, (int) (short) 0);
        int[] intArray9 = ds.MaxMin4.maxMin4(intArray6, 1, 1);
        int[] intArray12 = ds.MaxMin4.maxMin4(intArray6, (int) (byte) 0, 1);
        int[] intArray15 = ds.MaxMin4.maxMin4(intArray12, (int) (short) 0, 1);
        int[] intArray18 = ds.MaxMin4.maxMin4(intArray12, (int) (short) 1, 1);
        int[] intArray21 = ds.MaxMin4.maxMin4(intArray12, (int) (byte) 1, 1);
        int[] intArray24 = ds.MaxMin4.maxMin4(intArray21, 0, (int) (short) 0);
        int[] intArray27 = ds.MaxMin4.maxMin4(intArray24, (int) (short) 0, 0);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray30 = ds.MaxMin4.maxMin4(intArray24, (int) (short) 1, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[100, 100, 1]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[100, 100]");
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
        org.junit.Assert.assertNotNull(intArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray24), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray27), "[100, 100]");
    }

    @Test
    public void test2208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2208");
        int[] intArray3 = new int[] { (short) 100, (short) 100, 1 };
        int[] intArray6 = ds.MaxMin4.maxMin4(intArray3, (int) (short) 0, (int) (short) 0);
        int[] intArray9 = ds.MaxMin4.maxMin4(intArray3, 0, 1);
        int[] intArray12 = ds.MaxMin4.maxMin4(intArray3, (int) (short) 1, (int) (byte) 1);
        int[] intArray15 = ds.MaxMin4.maxMin4(intArray3, (int) (short) 1, (int) (byte) 0);
        int[] intArray18 = ds.MaxMin4.maxMin4(intArray3, 1, 1);
        java.lang.Class<?> wildcardClass19 = intArray3.getClass();
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[100, 100, 1]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[100, 100]");
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
    public void test2209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2209");
        int[] intArray3 = new int[] { (short) 100, (short) 100, 1 };
        int[] intArray6 = ds.MaxMin4.maxMin4(intArray3, (int) (short) 0, (int) (short) 0);
        int[] intArray9 = ds.MaxMin4.maxMin4(intArray6, 1, 1);
        int[] intArray12 = ds.MaxMin4.maxMin4(intArray9, 1, (int) (byte) 1);
        int[] intArray15 = ds.MaxMin4.maxMin4(intArray9, 1, 0);
        int[] intArray18 = ds.MaxMin4.maxMin4(intArray15, 0, 0);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray21 = ds.MaxMin4.maxMin4(intArray15, (-1), (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[100, 100, 1]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[100, 100]");
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
    public void test2210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2210");
        int[] intArray3 = new int[] { (short) 100, (short) 100, 1 };
        int[] intArray6 = ds.MaxMin4.maxMin4(intArray3, (int) (short) 0, (int) (short) 0);
        int[] intArray9 = ds.MaxMin4.maxMin4(intArray6, 1, 1);
        int[] intArray12 = ds.MaxMin4.maxMin4(intArray6, (int) (byte) 0, 1);
        int[] intArray15 = ds.MaxMin4.maxMin4(intArray12, (int) (short) 0, 1);
        int[] intArray18 = ds.MaxMin4.maxMin4(intArray12, (int) (short) 1, 1);
        int[] intArray21 = ds.MaxMin4.maxMin4(intArray12, (int) (byte) 1, 1);
        int[] intArray24 = ds.MaxMin4.maxMin4(intArray21, 0, (int) (short) 0);
        int[] intArray27 = ds.MaxMin4.maxMin4(intArray21, (int) (short) 1, 0);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray30 = ds.MaxMin4.maxMin4(intArray27, (int) (byte) 100, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[100, 100, 1]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[100, 100]");
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
        org.junit.Assert.assertNotNull(intArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray24), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray27), "[100, 100]");
    }

    @Test
    public void test2211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2211");
        int[] intArray3 = new int[] { (short) 100, (short) 100, 1 };
        int[] intArray6 = ds.MaxMin4.maxMin4(intArray3, (int) (short) 0, (int) (short) 0);
        int[] intArray9 = ds.MaxMin4.maxMin4(intArray6, 1, 1);
        int[] intArray12 = ds.MaxMin4.maxMin4(intArray6, 1, 1);
        int[] intArray15 = ds.MaxMin4.maxMin4(intArray12, (int) (short) 1, (int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray18 = ds.MaxMin4.maxMin4(intArray15, 1, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[100, 100, 1]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[100, 100]");
    }

    @Test
    public void test2212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2212");
        int[] intArray3 = new int[] { (short) 100, (short) 100, 1 };
        int[] intArray6 = ds.MaxMin4.maxMin4(intArray3, (int) (short) 0, (int) (short) 0);
        int[] intArray9 = ds.MaxMin4.maxMin4(intArray6, 1, 1);
        int[] intArray12 = ds.MaxMin4.maxMin4(intArray6, (int) (short) 1, 1);
        int[] intArray15 = ds.MaxMin4.maxMin4(intArray12, 0, 1);
        int[] intArray18 = ds.MaxMin4.maxMin4(intArray15, (int) (short) 1, 1);
        int[] intArray21 = ds.MaxMin4.maxMin4(intArray18, (int) (byte) 1, (int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray24 = ds.MaxMin4.maxMin4(intArray18, 100, 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[100, 100, 1]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[100, 100]");
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
    public void test2213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2213");
        int[] intArray3 = new int[] { (short) 100, (short) 100, 1 };
        int[] intArray6 = ds.MaxMin4.maxMin4(intArray3, (int) (short) 0, (int) (short) 0);
        int[] intArray9 = ds.MaxMin4.maxMin4(intArray6, 1, 1);
        int[] intArray12 = ds.MaxMin4.maxMin4(intArray9, 1, (int) (short) 0);
        int[] intArray15 = ds.MaxMin4.maxMin4(intArray12, (int) (byte) 1, (int) (byte) 0);
        int[] intArray18 = ds.MaxMin4.maxMin4(intArray12, (int) (byte) 1, (int) (byte) 1);
        int[] intArray21 = ds.MaxMin4.maxMin4(intArray18, (int) (byte) 0, 1);
        int[] intArray24 = ds.MaxMin4.maxMin4(intArray21, 0, (int) (short) 1);
        int[] intArray27 = ds.MaxMin4.maxMin4(intArray24, (int) (short) 0, 0);
        int[] intArray30 = ds.MaxMin4.maxMin4(intArray24, (int) (short) 1, (int) (byte) 0);
        int[] intArray33 = ds.MaxMin4.maxMin4(intArray24, 0, 0);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray36 = ds.MaxMin4.maxMin4(intArray33, (-1), (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[100, 100, 1]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[100, 100]");
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
    public void test2214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2214");
        int[] intArray3 = new int[] { (short) 100, (short) 100, 1 };
        int[] intArray6 = ds.MaxMin4.maxMin4(intArray3, (int) (short) 0, (int) (short) 0);
        int[] intArray9 = ds.MaxMin4.maxMin4(intArray6, 1, 1);
        int[] intArray12 = ds.MaxMin4.maxMin4(intArray9, 1, (int) (short) 0);
        int[] intArray15 = ds.MaxMin4.maxMin4(intArray12, (int) (byte) 1, (int) (byte) 0);
        int[] intArray18 = ds.MaxMin4.maxMin4(intArray12, (int) (byte) 1, (int) (byte) 1);
        int[] intArray21 = ds.MaxMin4.maxMin4(intArray18, (int) (byte) 0, 1);
        int[] intArray24 = ds.MaxMin4.maxMin4(intArray21, 0, (int) (short) 1);
        int[] intArray27 = ds.MaxMin4.maxMin4(intArray24, (int) (short) 0, 0);
        int[] intArray30 = ds.MaxMin4.maxMin4(intArray24, (int) (short) 1, (int) (byte) 0);
        int[] intArray33 = ds.MaxMin4.maxMin4(intArray24, 0, 0);
        int[] intArray36 = ds.MaxMin4.maxMin4(intArray33, (int) (short) 0, (int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray39 = ds.MaxMin4.maxMin4(intArray33, 0, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[100, 100, 1]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[100, 100]");
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
    public void test2215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2215");
        int[] intArray3 = new int[] { (short) 100, (short) 100, 1 };
        int[] intArray6 = ds.MaxMin4.maxMin4(intArray3, (int) (short) 0, (int) (short) 0);
        int[] intArray9 = ds.MaxMin4.maxMin4(intArray6, 1, 1);
        int[] intArray12 = ds.MaxMin4.maxMin4(intArray9, 1, (int) (short) 0);
        int[] intArray15 = ds.MaxMin4.maxMin4(intArray12, (int) (byte) 1, (int) (byte) 0);
        int[] intArray18 = ds.MaxMin4.maxMin4(intArray12, (int) (byte) 1, (int) (byte) 1);
        int[] intArray21 = ds.MaxMin4.maxMin4(intArray18, (int) (byte) 0, 1);
        int[] intArray24 = ds.MaxMin4.maxMin4(intArray21, 0, (int) (short) 1);
        int[] intArray27 = ds.MaxMin4.maxMin4(intArray24, (int) (short) 0, 0);
        int[] intArray30 = ds.MaxMin4.maxMin4(intArray24, (int) (short) 1, (int) (byte) 0);
        int[] intArray33 = ds.MaxMin4.maxMin4(intArray24, 0, 0);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray36 = ds.MaxMin4.maxMin4(intArray24, (int) (byte) 0, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[100, 100, 1]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[100, 100]");
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
    public void test2216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2216");
        int[] intArray3 = new int[] { (short) 100, (short) 100, 1 };
        int[] intArray6 = ds.MaxMin4.maxMin4(intArray3, (int) (short) 0, (int) (short) 0);
        int[] intArray9 = ds.MaxMin4.maxMin4(intArray6, 1, 1);
        int[] intArray12 = ds.MaxMin4.maxMin4(intArray9, 1, (int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray15 = ds.MaxMin4.maxMin4(intArray9, 10, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[100, 100, 1]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[100, 100]");
    }

    @Test
    public void test2217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2217");
        int[] intArray3 = new int[] { (short) 100, (short) 100, 1 };
        int[] intArray6 = ds.MaxMin4.maxMin4(intArray3, (int) (short) 0, (int) (short) 0);
        int[] intArray9 = ds.MaxMin4.maxMin4(intArray6, 1, 1);
        int[] intArray12 = ds.MaxMin4.maxMin4(intArray9, 1, (int) (short) 0);
        int[] intArray15 = ds.MaxMin4.maxMin4(intArray12, (int) (byte) 1, (int) (byte) 0);
        int[] intArray18 = ds.MaxMin4.maxMin4(intArray12, (int) (byte) 1, (int) (byte) 1);
        int[] intArray21 = ds.MaxMin4.maxMin4(intArray12, (int) (byte) 1, 1);
        int[] intArray24 = ds.MaxMin4.maxMin4(intArray12, 1, 1);
        int[] intArray27 = ds.MaxMin4.maxMin4(intArray24, (int) (byte) 0, (int) (short) 0);
        int[] intArray30 = ds.MaxMin4.maxMin4(intArray24, (int) (short) 0, 1);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray33 = ds.MaxMin4.maxMin4(intArray30, 0, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[100, 100, 1]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[100, 100]");
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
        org.junit.Assert.assertNotNull(intArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray24), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray27), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray30);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray30), "[100, 100]");
    }

    @Test
    public void test2218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2218");
        int[] intArray0 = null;
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray3 = ds.MaxMin4.maxMin4(intArray0, (-1), (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2219");
        int[] intArray3 = new int[] { (short) 100, (short) 100, 1 };
        int[] intArray6 = ds.MaxMin4.maxMin4(intArray3, (int) (short) 0, (int) (short) 0);
        int[] intArray9 = ds.MaxMin4.maxMin4(intArray3, 0, 1);
        int[] intArray12 = ds.MaxMin4.maxMin4(intArray3, (int) (short) 1, (int) (byte) 1);
        int[] intArray15 = ds.MaxMin4.maxMin4(intArray3, 1, 0);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray18 = ds.MaxMin4.maxMin4(intArray3, 10, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[100, 100, 1]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[100, 100]");
    }

    @Test
    public void test2220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2220");
        int[] intArray0 = null;
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray3 = ds.MaxMin4.maxMin4(intArray0, (int) (byte) 1, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2221");
        int[] intArray3 = new int[] { (short) 100, (short) 100, 1 };
        int[] intArray6 = ds.MaxMin4.maxMin4(intArray3, (int) (short) 0, (int) (short) 0);
        int[] intArray9 = ds.MaxMin4.maxMin4(intArray6, 1, 1);
        int[] intArray12 = ds.MaxMin4.maxMin4(intArray9, (int) (byte) 1, (int) (short) 0);
        int[] intArray15 = ds.MaxMin4.maxMin4(intArray9, 1, 1);
        int[] intArray18 = ds.MaxMin4.maxMin4(intArray9, (int) (byte) 0, (int) (short) 1);
        int[] intArray21 = ds.MaxMin4.maxMin4(intArray9, 0, (int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray24 = ds.MaxMin4.maxMin4(intArray9, 100, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[100, 100, 1]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[100, 100]");
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
    public void test2222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2222");
        int[] intArray3 = new int[] { (short) 100, (short) 100, 1 };
        int[] intArray6 = ds.MaxMin4.maxMin4(intArray3, (int) (short) 0, (int) (short) 0);
        int[] intArray9 = ds.MaxMin4.maxMin4(intArray6, 1, 1);
        int[] intArray12 = ds.MaxMin4.maxMin4(intArray9, 1, (int) (byte) 1);
        int[] intArray15 = ds.MaxMin4.maxMin4(intArray9, 1, 0);
        int[] intArray18 = ds.MaxMin4.maxMin4(intArray9, (int) (short) 0, 0);
        int[] intArray21 = ds.MaxMin4.maxMin4(intArray18, (int) (short) 0, (int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray24 = ds.MaxMin4.maxMin4(intArray21, (int) (short) -1, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[100, 100, 1]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[100, 100]");
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
    public void test2223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2223");
        int[] intArray3 = new int[] { (short) 100, (short) 100, 1 };
        int[] intArray6 = ds.MaxMin4.maxMin4(intArray3, (int) (short) 0, (int) (short) 0);
        int[] intArray9 = ds.MaxMin4.maxMin4(intArray3, 0, (int) (byte) 0);
        int[] intArray12 = ds.MaxMin4.maxMin4(intArray9, (int) (byte) 1, (int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray15 = ds.MaxMin4.maxMin4(intArray12, (int) (short) 100, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[100, 100, 1]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[100, 100]");
    }

    @Test
    public void test2224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2224");
        int[] intArray3 = new int[] { (short) 100, (short) 100, 1 };
        int[] intArray6 = ds.MaxMin4.maxMin4(intArray3, (int) (short) 0, (int) (short) 0);
        int[] intArray9 = ds.MaxMin4.maxMin4(intArray6, 1, 1);
        int[] intArray12 = ds.MaxMin4.maxMin4(intArray9, 1, (int) (byte) 1);
        int[] intArray15 = ds.MaxMin4.maxMin4(intArray9, (int) (byte) 0, 0);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray18 = ds.MaxMin4.maxMin4(intArray15, (int) (short) 10, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[100, 100, 1]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[100, 100]");
    }

    @Test
    public void test2225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2225");
        int[] intArray3 = new int[] { (short) 100, (short) 100, 1 };
        int[] intArray6 = ds.MaxMin4.maxMin4(intArray3, (int) (short) 0, (int) (short) 0);
        int[] intArray9 = ds.MaxMin4.maxMin4(intArray6, 1, 1);
        int[] intArray12 = ds.MaxMin4.maxMin4(intArray9, 1, (int) (short) 0);
        int[] intArray15 = ds.MaxMin4.maxMin4(intArray9, 0, (int) (short) 1);
        int[] intArray18 = ds.MaxMin4.maxMin4(intArray9, 0, 0);
        int[] intArray21 = ds.MaxMin4.maxMin4(intArray9, (int) (short) 1, (int) (byte) 0);
        int[] intArray24 = ds.MaxMin4.maxMin4(intArray21, (int) (short) 0, (int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray27 = ds.MaxMin4.maxMin4(intArray24, (int) (byte) 100, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[100, 100, 1]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[100, 100]");
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
        org.junit.Assert.assertNotNull(intArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray24), "[100, 100]");
    }

    @Test
    public void test2226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2226");
        int[] intArray3 = new int[] { (short) 100, (short) 100, 1 };
        int[] intArray6 = ds.MaxMin4.maxMin4(intArray3, (int) (short) 0, (int) (short) 0);
        int[] intArray9 = ds.MaxMin4.maxMin4(intArray3, 0, 1);
        int[] intArray12 = ds.MaxMin4.maxMin4(intArray9, 0, (int) (short) 0);
        int[] intArray15 = ds.MaxMin4.maxMin4(intArray9, (int) (short) 1, 0);
        int[] intArray18 = ds.MaxMin4.maxMin4(intArray9, 0, (int) (byte) 0);
        int[] intArray21 = ds.MaxMin4.maxMin4(intArray9, (int) (short) 0, (int) (byte) 1);
        int[] intArray24 = ds.MaxMin4.maxMin4(intArray9, 1, (int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray27 = ds.MaxMin4.maxMin4(intArray9, 0, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[100, 100, 1]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[100, 100]");
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
        org.junit.Assert.assertNotNull(intArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray24), "[100, 100]");
    }

    @Test
    public void test2227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2227");
        int[] intArray3 = new int[] { (short) 100, (short) 100, 1 };
        int[] intArray6 = ds.MaxMin4.maxMin4(intArray3, (int) (short) 0, (int) (short) 0);
        int[] intArray9 = ds.MaxMin4.maxMin4(intArray6, 1, 1);
        int[] intArray12 = ds.MaxMin4.maxMin4(intArray9, 1, (int) (short) 0);
        int[] intArray15 = ds.MaxMin4.maxMin4(intArray9, 0, (int) (short) 1);
        int[] intArray18 = ds.MaxMin4.maxMin4(intArray9, 0, 0);
        int[] intArray21 = ds.MaxMin4.maxMin4(intArray9, (int) (short) 1, (int) (byte) 0);
        int[] intArray24 = ds.MaxMin4.maxMin4(intArray21, (int) (short) 0, (int) (byte) 0);
        java.lang.Class<?> wildcardClass25 = intArray24.getClass();
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[100, 100, 1]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[100, 100]");
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
        org.junit.Assert.assertNotNull(intArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray24), "[100, 100]");
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test2228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2228");
        int[] intArray3 = new int[] { (short) 100, (short) 100, 1 };
        int[] intArray6 = ds.MaxMin4.maxMin4(intArray3, (int) (short) 0, (int) (short) 0);
        int[] intArray9 = ds.MaxMin4.maxMin4(intArray6, 1, 1);
        int[] intArray12 = ds.MaxMin4.maxMin4(intArray9, 1, (int) (short) 0);
        int[] intArray15 = ds.MaxMin4.maxMin4(intArray12, (int) (byte) 1, (int) (byte) 0);
        int[] intArray18 = ds.MaxMin4.maxMin4(intArray12, (int) (byte) 1, (int) (byte) 1);
        int[] intArray21 = ds.MaxMin4.maxMin4(intArray18, (int) (byte) 0, 1);
        int[] intArray24 = ds.MaxMin4.maxMin4(intArray18, (int) (byte) 0, (int) (byte) 0);
        int[] intArray27 = ds.MaxMin4.maxMin4(intArray24, 0, 0);
        int[] intArray30 = ds.MaxMin4.maxMin4(intArray27, 0, (int) (byte) 1);
        int[] intArray33 = ds.MaxMin4.maxMin4(intArray27, (int) (short) 0, (int) (short) 0);
        java.lang.Class<?> wildcardClass34 = intArray27.getClass();
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[100, 100, 1]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[100, 100]");
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
        org.junit.Assert.assertNotNull(intArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray24), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray27), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray30);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray30), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray33);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray33), "[100, 100]");
        org.junit.Assert.assertNotNull(wildcardClass34);
    }

    @Test
    public void test2229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2229");
        int[] intArray3 = new int[] { (short) 100, (short) 100, 1 };
        int[] intArray6 = ds.MaxMin4.maxMin4(intArray3, (int) (short) 0, (int) (short) 0);
        int[] intArray9 = ds.MaxMin4.maxMin4(intArray6, (int) (short) 0, 0);
        int[] intArray12 = ds.MaxMin4.maxMin4(intArray6, (int) (byte) 1, 1);
        int[] intArray15 = ds.MaxMin4.maxMin4(intArray6, (int) (short) 1, (int) (short) 1);
        int[] intArray18 = ds.MaxMin4.maxMin4(intArray15, 1, 0);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray21 = ds.MaxMin4.maxMin4(intArray18, 0, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[100, 100, 1]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[100, 100]");
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
    public void test2230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2230");
        int[] intArray3 = new int[] { (short) 100, (short) 100, 1 };
        int[] intArray6 = ds.MaxMin4.maxMin4(intArray3, (int) (short) 0, (int) (short) 0);
        int[] intArray9 = ds.MaxMin4.maxMin4(intArray6, 1, 1);
        int[] intArray12 = ds.MaxMin4.maxMin4(intArray9, 1, (int) (byte) 1);
        int[] intArray15 = ds.MaxMin4.maxMin4(intArray9, (int) (byte) 0, 0);
        int[] intArray18 = ds.MaxMin4.maxMin4(intArray9, (int) (short) 1, 1);
        int[] intArray21 = ds.MaxMin4.maxMin4(intArray18, 0, (int) (byte) 0);
        int[] intArray24 = ds.MaxMin4.maxMin4(intArray21, 0, 0);
        int[] intArray27 = ds.MaxMin4.maxMin4(intArray21, (int) (short) 1, (int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray30 = ds.MaxMin4.maxMin4(intArray21, (int) (short) -1, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[100, 100, 1]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[100, 100]");
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
        org.junit.Assert.assertNotNull(intArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray24), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray27), "[100, 100]");
    }

    @Test
    public void test2231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2231");
        int[] intArray3 = new int[] { (short) 100, (short) 100, 1 };
        int[] intArray6 = ds.MaxMin4.maxMin4(intArray3, (int) (short) 0, (int) (short) 0);
        int[] intArray9 = ds.MaxMin4.maxMin4(intArray6, 1, 1);
        int[] intArray12 = ds.MaxMin4.maxMin4(intArray9, 1, (int) (byte) 1);
        int[] intArray15 = ds.MaxMin4.maxMin4(intArray9, (int) (byte) 0, 0);
        int[] intArray18 = ds.MaxMin4.maxMin4(intArray9, (int) (short) 1, 1);
        int[] intArray21 = ds.MaxMin4.maxMin4(intArray18, 0, (int) (byte) 0);
        int[] intArray24 = ds.MaxMin4.maxMin4(intArray21, 0, 0);
        int[] intArray27 = ds.MaxMin4.maxMin4(intArray21, (int) (byte) 0, (int) (byte) 1);
        int[] intArray30 = ds.MaxMin4.maxMin4(intArray27, (int) (byte) 0, (int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray33 = ds.MaxMin4.maxMin4(intArray27, (int) (byte) 10, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[100, 100, 1]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[100, 100]");
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
        org.junit.Assert.assertNotNull(intArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray24), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray27), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray30);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray30), "[100, 100]");
    }

    @Test
    public void test2232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2232");
        int[] intArray3 = new int[] { (short) 100, (short) 100, 1 };
        int[] intArray6 = ds.MaxMin4.maxMin4(intArray3, (int) (short) 0, (int) (short) 0);
        int[] intArray9 = ds.MaxMin4.maxMin4(intArray6, 1, 1);
        int[] intArray12 = ds.MaxMin4.maxMin4(intArray9, 1, (int) (short) 0);
        int[] intArray15 = ds.MaxMin4.maxMin4(intArray12, (int) (byte) 1, (int) (byte) 0);
        int[] intArray18 = ds.MaxMin4.maxMin4(intArray12, (int) (byte) 1, (int) (byte) 1);
        int[] intArray21 = ds.MaxMin4.maxMin4(intArray18, (int) (byte) 0, 1);
        int[] intArray24 = ds.MaxMin4.maxMin4(intArray18, (int) (byte) 0, (int) (byte) 0);
        int[] intArray27 = ds.MaxMin4.maxMin4(intArray24, 0, 0);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray30 = ds.MaxMin4.maxMin4(intArray27, (int) (short) 100, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[100, 100, 1]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[100, 100]");
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
        org.junit.Assert.assertNotNull(intArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray24), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray27), "[100, 100]");
    }

    @Test
    public void test2233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2233");
        int[] intArray3 = new int[] { (short) 100, (short) 100, 1 };
        int[] intArray6 = ds.MaxMin4.maxMin4(intArray3, (int) (short) 0, (int) (short) 0);
        int[] intArray9 = ds.MaxMin4.maxMin4(intArray6, 1, 1);
        int[] intArray12 = ds.MaxMin4.maxMin4(intArray9, 1, (int) (short) 0);
        int[] intArray15 = ds.MaxMin4.maxMin4(intArray12, (int) (byte) 1, (int) (byte) 0);
        int[] intArray18 = ds.MaxMin4.maxMin4(intArray12, (int) (byte) 1, (int) (byte) 1);
        int[] intArray21 = ds.MaxMin4.maxMin4(intArray12, (int) (byte) 1, 1);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray24 = ds.MaxMin4.maxMin4(intArray21, (int) (short) -1, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[100, 100, 1]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[100, 100]");
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
    public void test2234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2234");
        int[] intArray3 = new int[] { (short) 100, (short) 100, 1 };
        int[] intArray6 = ds.MaxMin4.maxMin4(intArray3, (int) (short) 0, (int) (short) 0);
        int[] intArray9 = ds.MaxMin4.maxMin4(intArray6, 1, 1);
        int[] intArray12 = ds.MaxMin4.maxMin4(intArray9, 1, (int) (short) 0);
        int[] intArray15 = ds.MaxMin4.maxMin4(intArray12, (int) (byte) 1, (int) (byte) 0);
        int[] intArray18 = ds.MaxMin4.maxMin4(intArray12, (int) (byte) 1, (int) (byte) 1);
        int[] intArray21 = ds.MaxMin4.maxMin4(intArray18, (int) (byte) 0, 1);
        int[] intArray24 = ds.MaxMin4.maxMin4(intArray18, 0, (int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray27 = ds.MaxMin4.maxMin4(intArray24, 100, (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[100, 100, 1]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[100, 100]");
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
        org.junit.Assert.assertNotNull(intArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray24), "[100, 100]");
    }

    @Test
    public void test2235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2235");
        int[] intArray3 = new int[] { (short) 100, (short) 100, 1 };
        int[] intArray6 = ds.MaxMin4.maxMin4(intArray3, (int) (short) 0, (int) (short) 0);
        int[] intArray9 = ds.MaxMin4.maxMin4(intArray6, 1, 1);
        int[] intArray12 = ds.MaxMin4.maxMin4(intArray9, 1, (int) (short) 0);
        int[] intArray15 = ds.MaxMin4.maxMin4(intArray12, (int) (byte) 1, (int) (byte) 0);
        int[] intArray18 = ds.MaxMin4.maxMin4(intArray12, (int) (byte) 1, (int) (byte) 1);
        int[] intArray21 = ds.MaxMin4.maxMin4(intArray18, (int) (byte) 0, 1);
        int[] intArray24 = ds.MaxMin4.maxMin4(intArray21, 0, (int) (short) 1);
        int[] intArray27 = ds.MaxMin4.maxMin4(intArray24, (int) (short) 0, 0);
        int[] intArray30 = ds.MaxMin4.maxMin4(intArray24, (int) (short) 1, (int) (byte) 0);
        int[] intArray33 = ds.MaxMin4.maxMin4(intArray24, 0, 0);
        int[] intArray36 = ds.MaxMin4.maxMin4(intArray24, (int) (short) 1, 0);
        int[] intArray39 = ds.MaxMin4.maxMin4(intArray36, 0, (int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray42 = ds.MaxMin4.maxMin4(intArray36, (int) (short) -1, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[100, 100, 1]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[100, 100]");
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
        org.junit.Assert.assertNotNull(intArray39);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray39), "[100, 100]");
    }

    @Test
    public void test2236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2236");
        int[] intArray3 = new int[] { (short) 100, (short) 100, 1 };
        int[] intArray6 = ds.MaxMin4.maxMin4(intArray3, (int) (short) 0, (int) (short) 0);
        int[] intArray9 = ds.MaxMin4.maxMin4(intArray6, 1, 1);
        int[] intArray12 = ds.MaxMin4.maxMin4(intArray9, 1, (int) (short) 0);
        int[] intArray15 = ds.MaxMin4.maxMin4(intArray12, (int) (byte) 1, (int) (byte) 0);
        int[] intArray18 = ds.MaxMin4.maxMin4(intArray12, (int) (byte) 1, (int) (byte) 1);
        int[] intArray21 = ds.MaxMin4.maxMin4(intArray18, (int) (byte) 0, 1);
        int[] intArray24 = ds.MaxMin4.maxMin4(intArray21, 0, (int) (short) 1);
        int[] intArray27 = ds.MaxMin4.maxMin4(intArray24, (int) (short) 0, 0);
        int[] intArray30 = ds.MaxMin4.maxMin4(intArray24, (int) (short) 1, (int) (byte) 0);
        int[] intArray33 = ds.MaxMin4.maxMin4(intArray30, (int) (byte) 0, (int) (short) 0);
        int[] intArray36 = ds.MaxMin4.maxMin4(intArray33, 0, 0);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray39 = ds.MaxMin4.maxMin4(intArray36, (-1), (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[100, 100, 1]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[100, 100]");
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
    public void test2237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2237");
        int[] intArray3 = new int[] { (short) 100, (short) 100, 1 };
        int[] intArray6 = ds.MaxMin4.maxMin4(intArray3, (int) (short) 0, (int) (short) 0);
        int[] intArray9 = ds.MaxMin4.maxMin4(intArray6, 1, 1);
        int[] intArray12 = ds.MaxMin4.maxMin4(intArray9, 1, (int) (short) 0);
        int[] intArray15 = ds.MaxMin4.maxMin4(intArray12, (int) (byte) 1, (int) (byte) 0);
        int[] intArray18 = ds.MaxMin4.maxMin4(intArray12, (int) (byte) 1, (int) (byte) 1);
        int[] intArray21 = ds.MaxMin4.maxMin4(intArray12, 0, (int) (byte) 0);
        int[] intArray24 = ds.MaxMin4.maxMin4(intArray12, 0, 0);
        java.lang.Class<?> wildcardClass25 = intArray24.getClass();
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[100, 100, 1]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[100, 100]");
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
        org.junit.Assert.assertNotNull(intArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray24), "[100, 100]");
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test2238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2238");
        int[] intArray3 = new int[] { (short) 100, (short) 100, 1 };
        int[] intArray6 = ds.MaxMin4.maxMin4(intArray3, (int) (short) 0, (int) (short) 0);
        int[] intArray9 = ds.MaxMin4.maxMin4(intArray6, 1, 1);
        int[] intArray12 = ds.MaxMin4.maxMin4(intArray6, (int) (byte) 0, 1);
        int[] intArray15 = ds.MaxMin4.maxMin4(intArray12, (int) (short) 0, 1);
        int[] intArray18 = ds.MaxMin4.maxMin4(intArray15, (int) (short) 1, 0);
        int[] intArray21 = ds.MaxMin4.maxMin4(intArray18, (int) (short) 0, 0);
        int[] intArray24 = ds.MaxMin4.maxMin4(intArray21, 0, (int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray27 = ds.MaxMin4.maxMin4(intArray24, 100, (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[100, 100, 1]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[100, 100]");
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
        org.junit.Assert.assertNotNull(intArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray24), "[100, 100]");
    }

    @Test
    public void test2239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2239");
        int[] intArray3 = new int[] { (short) 100, (short) 100, 1 };
        int[] intArray6 = ds.MaxMin4.maxMin4(intArray3, (int) (short) 0, (int) (short) 0);
        int[] intArray9 = ds.MaxMin4.maxMin4(intArray6, 1, 1);
        int[] intArray12 = ds.MaxMin4.maxMin4(intArray9, 1, (int) (short) 0);
        int[] intArray15 = ds.MaxMin4.maxMin4(intArray12, (int) (byte) 1, (int) (byte) 0);
        int[] intArray18 = ds.MaxMin4.maxMin4(intArray12, (int) (byte) 1, (int) (byte) 1);
        int[] intArray21 = ds.MaxMin4.maxMin4(intArray18, (int) (byte) 0, 1);
        int[] intArray24 = ds.MaxMin4.maxMin4(intArray18, 0, (int) (short) 1);
        int[] intArray27 = ds.MaxMin4.maxMin4(intArray18, (int) (short) 1, (int) (byte) 0);
        int[] intArray30 = ds.MaxMin4.maxMin4(intArray18, (int) (byte) 0, 0);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray33 = ds.MaxMin4.maxMin4(intArray18, (int) (byte) 100, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[100, 100, 1]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[100, 100]");
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
        org.junit.Assert.assertNotNull(intArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray24), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray27), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray30);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray30), "[100, 100]");
    }

    @Test
    public void test2240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2240");
        int[] intArray3 = new int[] { (short) 100, (short) 100, 1 };
        int[] intArray6 = ds.MaxMin4.maxMin4(intArray3, (int) (short) 0, (int) (short) 0);
        int[] intArray9 = ds.MaxMin4.maxMin4(intArray6, 1, 1);
        int[] intArray12 = ds.MaxMin4.maxMin4(intArray9, 1, (int) (short) 0);
        int[] intArray15 = ds.MaxMin4.maxMin4(intArray12, (int) (byte) 1, (int) (byte) 0);
        int[] intArray18 = ds.MaxMin4.maxMin4(intArray12, (int) (byte) 1, (int) (byte) 1);
        int[] intArray21 = ds.MaxMin4.maxMin4(intArray18, (int) (byte) 0, 1);
        int[] intArray24 = ds.MaxMin4.maxMin4(intArray21, 0, (int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray27 = ds.MaxMin4.maxMin4(intArray24, (int) (short) 100, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[100, 100, 1]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[100, 100]");
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
        org.junit.Assert.assertNotNull(intArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray24), "[100, 100]");
    }

    @Test
    public void test2241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2241");
        int[] intArray3 = new int[] { (short) 100, (short) 100, 1 };
        int[] intArray6 = ds.MaxMin4.maxMin4(intArray3, (int) (short) 0, (int) (short) 0);
        int[] intArray9 = ds.MaxMin4.maxMin4(intArray6, 1, 1);
        int[] intArray12 = ds.MaxMin4.maxMin4(intArray6, (int) (byte) 0, 1);
        int[] intArray15 = ds.MaxMin4.maxMin4(intArray12, (int) (short) 0, 1);
        int[] intArray18 = ds.MaxMin4.maxMin4(intArray12, (int) (short) 1, 1);
        int[] intArray21 = ds.MaxMin4.maxMin4(intArray12, (int) (short) 1, (int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray24 = ds.MaxMin4.maxMin4(intArray12, (int) (short) 1, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[100, 100, 1]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[100, 100]");
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
    public void test2242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2242");
        int[] intArray3 = new int[] { (short) 100, (short) 100, 1 };
        int[] intArray6 = ds.MaxMin4.maxMin4(intArray3, (int) (short) 0, (int) (short) 0);
        int[] intArray9 = ds.MaxMin4.maxMin4(intArray6, 1, 1);
        int[] intArray12 = ds.MaxMin4.maxMin4(intArray9, 1, (int) (short) 0);
        int[] intArray15 = ds.MaxMin4.maxMin4(intArray9, 0, (int) (short) 1);
        int[] intArray18 = ds.MaxMin4.maxMin4(intArray15, (int) (byte) 1, (int) (byte) 0);
        int[] intArray21 = ds.MaxMin4.maxMin4(intArray18, 0, (int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray24 = ds.MaxMin4.maxMin4(intArray18, (int) ' ', 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[100, 100, 1]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[100, 100]");
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
    public void test2243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2243");
        int[] intArray3 = new int[] { (short) 100, (short) 100, 1 };
        int[] intArray6 = ds.MaxMin4.maxMin4(intArray3, (int) (short) 0, (int) (short) 0);
        int[] intArray9 = ds.MaxMin4.maxMin4(intArray3, 0, 1);
        int[] intArray12 = ds.MaxMin4.maxMin4(intArray3, (int) (short) 1, (int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray15 = ds.MaxMin4.maxMin4(intArray3, (int) ' ', (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[100, 100, 1]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[100, 100]");
    }

    @Test
    public void test2244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2244");
        int[] intArray3 = new int[] { (short) 100, (short) 100, 1 };
        int[] intArray6 = ds.MaxMin4.maxMin4(intArray3, (int) (short) 0, (int) (short) 0);
        int[] intArray9 = ds.MaxMin4.maxMin4(intArray6, 1, 1);
        int[] intArray12 = ds.MaxMin4.maxMin4(intArray9, 1, (int) (short) 0);
        int[] intArray15 = ds.MaxMin4.maxMin4(intArray12, (int) (byte) 1, (int) (byte) 0);
        int[] intArray18 = ds.MaxMin4.maxMin4(intArray12, (int) (byte) 1, (int) (byte) 1);
        int[] intArray21 = ds.MaxMin4.maxMin4(intArray18, (int) (byte) 0, 1);
        int[] intArray24 = ds.MaxMin4.maxMin4(intArray21, 0, (int) (short) 1);
        int[] intArray27 = ds.MaxMin4.maxMin4(intArray24, (int) (short) 0, 0);
        int[] intArray30 = ds.MaxMin4.maxMin4(intArray24, (int) (byte) 1, (int) (short) 0);
        int[] intArray33 = ds.MaxMin4.maxMin4(intArray24, (int) (byte) 1, (int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray36 = ds.MaxMin4.maxMin4(intArray33, (int) (byte) 10, (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[100, 100, 1]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[100, 100]");
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
    public void test2245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2245");
        int[] intArray3 = new int[] { (short) 100, (short) 100, 1 };
        int[] intArray6 = ds.MaxMin4.maxMin4(intArray3, (int) (short) 0, (int) (short) 0);
        int[] intArray9 = ds.MaxMin4.maxMin4(intArray6, 1, 1);
        int[] intArray12 = ds.MaxMin4.maxMin4(intArray6, (int) (short) 1, 1);
        int[] intArray15 = ds.MaxMin4.maxMin4(intArray12, 0, 1);
        int[] intArray18 = ds.MaxMin4.maxMin4(intArray12, (int) (short) 1, 1);
        int[] intArray21 = ds.MaxMin4.maxMin4(intArray12, (int) (byte) 0, 0);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray24 = ds.MaxMin4.maxMin4(intArray12, (int) (byte) 100, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[100, 100, 1]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[100, 100]");
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
    public void test2246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2246");
        int[] intArray3 = new int[] { (short) 100, (short) 100, 1 };
        int[] intArray6 = ds.MaxMin4.maxMin4(intArray3, (int) (short) 0, (int) (short) 0);
        int[] intArray9 = ds.MaxMin4.maxMin4(intArray6, 1, 1);
        int[] intArray12 = ds.MaxMin4.maxMin4(intArray9, 1, (int) (short) 0);
        int[] intArray15 = ds.MaxMin4.maxMin4(intArray12, (int) (byte) 1, (int) (byte) 0);
        int[] intArray18 = ds.MaxMin4.maxMin4(intArray12, (int) (byte) 1, (int) (byte) 1);
        int[] intArray21 = ds.MaxMin4.maxMin4(intArray18, (int) (byte) 0, 1);
        int[] intArray24 = ds.MaxMin4.maxMin4(intArray18, (int) (byte) 0, (int) (byte) 0);
        int[] intArray27 = ds.MaxMin4.maxMin4(intArray24, 0, 0);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray30 = ds.MaxMin4.maxMin4(intArray24, (int) (byte) -1, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[100, 100, 1]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[100, 100]");
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
        org.junit.Assert.assertNotNull(intArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray24), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray27), "[100, 100]");
    }

    @Test
    public void test2247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2247");
        int[] intArray3 = new int[] { (short) 100, (short) 100, 1 };
        int[] intArray6 = ds.MaxMin4.maxMin4(intArray3, (int) (short) 0, (int) (short) 0);
        int[] intArray9 = ds.MaxMin4.maxMin4(intArray6, 1, 1);
        int[] intArray12 = ds.MaxMin4.maxMin4(intArray9, 1, (int) (short) 0);
        int[] intArray15 = ds.MaxMin4.maxMin4(intArray12, (int) (byte) 1, (int) (byte) 0);
        int[] intArray18 = ds.MaxMin4.maxMin4(intArray12, (int) (byte) 1, (int) (byte) 1);
        int[] intArray21 = ds.MaxMin4.maxMin4(intArray18, (int) (byte) 0, 1);
        int[] intArray24 = ds.MaxMin4.maxMin4(intArray18, (int) (byte) 0, (int) (byte) 0);
        int[] intArray27 = ds.MaxMin4.maxMin4(intArray24, 0, 0);
        int[] intArray30 = ds.MaxMin4.maxMin4(intArray27, 0, (int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray33 = ds.MaxMin4.maxMin4(intArray30, (int) (short) 0, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[100, 100, 1]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[100, 100]");
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
        org.junit.Assert.assertNotNull(intArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray24), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray27), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray30);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray30), "[100, 100]");
    }

    @Test
    public void test2248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2248");
        int[] intArray3 = new int[] { (short) 100, (short) 100, 1 };
        int[] intArray6 = ds.MaxMin4.maxMin4(intArray3, (int) (short) 0, (int) (short) 0);
        int[] intArray9 = ds.MaxMin4.maxMin4(intArray6, 1, 1);
        int[] intArray12 = ds.MaxMin4.maxMin4(intArray9, 1, (int) (byte) 1);
        int[] intArray15 = ds.MaxMin4.maxMin4(intArray9, 1, 0);
        int[] intArray18 = ds.MaxMin4.maxMin4(intArray9, (int) (short) 0, 0);
        int[] intArray21 = ds.MaxMin4.maxMin4(intArray18, (int) (short) 0, (int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray24 = ds.MaxMin4.maxMin4(intArray21, (int) (byte) 0, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[100, 100, 1]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[100, 100]");
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
    public void test2249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2249");
        int[] intArray3 = new int[] { (short) 100, (short) 100, 1 };
        int[] intArray6 = ds.MaxMin4.maxMin4(intArray3, (int) (short) 0, (int) (short) 0);
        int[] intArray9 = ds.MaxMin4.maxMin4(intArray6, 1, 1);
        int[] intArray12 = ds.MaxMin4.maxMin4(intArray9, 1, (int) (short) 0);
        int[] intArray15 = ds.MaxMin4.maxMin4(intArray9, 0, (int) (short) 1);
        int[] intArray18 = ds.MaxMin4.maxMin4(intArray15, (int) (byte) 1, (int) (byte) 0);
        int[] intArray21 = ds.MaxMin4.maxMin4(intArray18, 0, (int) (short) 0);
        int[] intArray24 = ds.MaxMin4.maxMin4(intArray21, (int) (byte) 0, 0);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray27 = ds.MaxMin4.maxMin4(intArray24, 0, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[100, 100, 1]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[100, 100]");
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
        org.junit.Assert.assertNotNull(intArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray24), "[100, 100]");
    }

    @Test
    public void test2250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2250");
        int[] intArray3 = new int[] { (short) 100, (short) 100, 1 };
        int[] intArray6 = ds.MaxMin4.maxMin4(intArray3, (int) (short) 0, (int) (short) 0);
        int[] intArray9 = ds.MaxMin4.maxMin4(intArray6, 1, 1);
        int[] intArray12 = ds.MaxMin4.maxMin4(intArray9, 1, (int) (short) 0);
        int[] intArray15 = ds.MaxMin4.maxMin4(intArray9, 0, (int) (short) 1);
        int[] intArray18 = ds.MaxMin4.maxMin4(intArray15, (int) (byte) 1, (int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray21 = ds.MaxMin4.maxMin4(intArray15, (int) '#', 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[100, 100, 1]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[100, 100]");
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
    public void test2251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2251");
        int[] intArray3 = new int[] { (short) 100, (short) 100, 1 };
        int[] intArray6 = ds.MaxMin4.maxMin4(intArray3, (int) (short) 0, (int) (short) 0);
        int[] intArray9 = ds.MaxMin4.maxMin4(intArray6, 1, 1);
        int[] intArray12 = ds.MaxMin4.maxMin4(intArray9, 1, (int) (byte) 1);
        int[] intArray15 = ds.MaxMin4.maxMin4(intArray9, (int) (byte) 0, 0);
        int[] intArray18 = ds.MaxMin4.maxMin4(intArray9, (int) (short) 1, 1);
        int[] intArray21 = ds.MaxMin4.maxMin4(intArray18, 0, (int) (byte) 0);
        int[] intArray24 = ds.MaxMin4.maxMin4(intArray21, 0, 0);
        int[] intArray27 = ds.MaxMin4.maxMin4(intArray24, 0, (int) (byte) 1);
        java.lang.Class<?> wildcardClass28 = intArray27.getClass();
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[100, 100, 1]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[100, 100]");
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
        org.junit.Assert.assertNotNull(intArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray24), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray27), "[100, 100]");
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test2252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2252");
        int[] intArray3 = new int[] { (short) 100, (short) 100, 1 };
        int[] intArray6 = ds.MaxMin4.maxMin4(intArray3, (int) (short) 0, (int) (short) 0);
        int[] intArray9 = ds.MaxMin4.maxMin4(intArray6, 1, 1);
        int[] intArray12 = ds.MaxMin4.maxMin4(intArray6, (int) (short) 1, 1);
        int[] intArray15 = ds.MaxMin4.maxMin4(intArray12, 0, 1);
        int[] intArray18 = ds.MaxMin4.maxMin4(intArray15, (int) (short) 1, 1);
        int[] intArray21 = ds.MaxMin4.maxMin4(intArray18, (int) (byte) 1, (int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray24 = ds.MaxMin4.maxMin4(intArray21, 10, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[100, 100, 1]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[100, 100]");
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
    public void test2253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2253");
        int[] intArray3 = new int[] { (short) 100, (short) 100, 1 };
        int[] intArray6 = ds.MaxMin4.maxMin4(intArray3, (int) (short) 0, (int) (short) 0);
        int[] intArray9 = ds.MaxMin4.maxMin4(intArray6, 1, 1);
        int[] intArray12 = ds.MaxMin4.maxMin4(intArray9, 1, (int) (short) 0);
        int[] intArray15 = ds.MaxMin4.maxMin4(intArray12, (int) (byte) 1, (int) (byte) 0);
        int[] intArray18 = ds.MaxMin4.maxMin4(intArray12, (int) (byte) 1, (int) (byte) 1);
        int[] intArray21 = ds.MaxMin4.maxMin4(intArray12, (int) (byte) 1, 1);
        int[] intArray24 = ds.MaxMin4.maxMin4(intArray12, 1, 1);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray27 = ds.MaxMin4.maxMin4(intArray12, (int) '4', (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[100, 100, 1]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[100, 100]");
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
        org.junit.Assert.assertNotNull(intArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray24), "[100, 100]");
    }

    @Test
    public void test2254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2254");
        int[] intArray3 = new int[] { (short) 100, (short) 100, 1 };
        int[] intArray6 = ds.MaxMin4.maxMin4(intArray3, (int) (short) 0, (int) (short) 0);
        int[] intArray9 = ds.MaxMin4.maxMin4(intArray6, 1, 1);
        int[] intArray12 = ds.MaxMin4.maxMin4(intArray9, 1, (int) (byte) 1);
        int[] intArray15 = ds.MaxMin4.maxMin4(intArray9, (int) (byte) 0, 0);
        int[] intArray18 = ds.MaxMin4.maxMin4(intArray15, 1, (int) (short) 0);
        int[] intArray21 = ds.MaxMin4.maxMin4(intArray15, (int) (byte) 0, 0);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray24 = ds.MaxMin4.maxMin4(intArray21, 10, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[100, 100, 1]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[100, 100]");
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
    public void test2255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2255");
        int[] intArray3 = new int[] { (short) 100, (short) 100, 1 };
        int[] intArray6 = ds.MaxMin4.maxMin4(intArray3, (int) (short) 0, (int) (short) 0);
        int[] intArray9 = ds.MaxMin4.maxMin4(intArray3, 0, 1);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray12 = ds.MaxMin4.maxMin4(intArray9, (int) (short) 10, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[100, 100, 1]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[100, 100]");
    }

    @Test
    public void test2256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2256");
        int[] intArray3 = new int[] { (short) 100, (short) 100, 1 };
        int[] intArray6 = ds.MaxMin4.maxMin4(intArray3, (int) (short) 0, (int) (short) 0);
        int[] intArray9 = ds.MaxMin4.maxMin4(intArray6, 1, 1);
        int[] intArray12 = ds.MaxMin4.maxMin4(intArray9, 1, (int) (short) 0);
        int[] intArray15 = ds.MaxMin4.maxMin4(intArray9, 0, (int) (short) 1);
        int[] intArray18 = ds.MaxMin4.maxMin4(intArray15, (int) (byte) 1, (int) (byte) 0);
        int[] intArray21 = ds.MaxMin4.maxMin4(intArray18, (int) (byte) 1, (int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray24 = ds.MaxMin4.maxMin4(intArray18, (int) (short) -1, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[100, 100, 1]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[100, 100]");
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
    public void test2257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2257");
        int[] intArray3 = new int[] { (short) 100, (short) 100, 1 };
        int[] intArray6 = ds.MaxMin4.maxMin4(intArray3, (int) (short) 0, (int) (short) 0);
        int[] intArray9 = ds.MaxMin4.maxMin4(intArray3, 0, (int) (byte) 0);
        int[] intArray12 = ds.MaxMin4.maxMin4(intArray9, (int) (byte) 1, (int) (byte) 1);
        int[] intArray15 = ds.MaxMin4.maxMin4(intArray12, (int) (short) 0, 0);
        int[] intArray18 = ds.MaxMin4.maxMin4(intArray15, (int) (byte) 1, 0);
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[100, 100, 1]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[100, 100]");
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
    public void test2258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2258");
        int[] intArray3 = new int[] { (short) 100, (short) 100, 1 };
        int[] intArray6 = ds.MaxMin4.maxMin4(intArray3, (int) (short) 0, (int) (short) 0);
        int[] intArray9 = ds.MaxMin4.maxMin4(intArray6, 1, 1);
        int[] intArray12 = ds.MaxMin4.maxMin4(intArray9, 1, (int) (short) 0);
        int[] intArray15 = ds.MaxMin4.maxMin4(intArray12, (int) (byte) 1, (int) (byte) 0);
        int[] intArray18 = ds.MaxMin4.maxMin4(intArray12, (int) (byte) 1, (int) (byte) 1);
        int[] intArray21 = ds.MaxMin4.maxMin4(intArray18, (int) (byte) 0, 1);
        int[] intArray24 = ds.MaxMin4.maxMin4(intArray18, (int) (byte) 0, (int) (byte) 0);
        int[] intArray27 = ds.MaxMin4.maxMin4(intArray24, 0, 0);
        int[] intArray30 = ds.MaxMin4.maxMin4(intArray27, 0, (int) (byte) 1);
        int[] intArray33 = ds.MaxMin4.maxMin4(intArray30, (int) (short) 1, 0);
        int[] intArray36 = ds.MaxMin4.maxMin4(intArray33, 0, 0);
        java.lang.Class<?> wildcardClass37 = intArray33.getClass();
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[100, 100, 1]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[100, 100]");
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
        org.junit.Assert.assertNotNull(wildcardClass37);
    }

    @Test
    public void test2259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2259");
        int[] intArray3 = new int[] { (short) 100, (short) 100, 1 };
        int[] intArray6 = ds.MaxMin4.maxMin4(intArray3, (int) (short) 0, (int) (short) 0);
        int[] intArray9 = ds.MaxMin4.maxMin4(intArray3, 0, (int) (byte) 0);
        int[] intArray12 = ds.MaxMin4.maxMin4(intArray9, 0, (int) (short) 1);
        int[] intArray15 = ds.MaxMin4.maxMin4(intArray9, (int) (byte) 0, (int) (byte) 1);
        int[] intArray18 = ds.MaxMin4.maxMin4(intArray15, 1, (int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray21 = ds.MaxMin4.maxMin4(intArray15, (int) (short) 10, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[100, 100, 1]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[100, 100]");
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
    public void test2260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2260");
        int[] intArray3 = new int[] { (short) 100, (short) 100, 1 };
        int[] intArray6 = ds.MaxMin4.maxMin4(intArray3, (int) (short) 0, (int) (short) 0);
        int[] intArray9 = ds.MaxMin4.maxMin4(intArray6, 1, 1);
        int[] intArray12 = ds.MaxMin4.maxMin4(intArray6, (int) (short) 1, 1);
        int[] intArray15 = ds.MaxMin4.maxMin4(intArray12, 0, 1);
        int[] intArray18 = ds.MaxMin4.maxMin4(intArray15, (int) (short) 1, 1);
        int[] intArray21 = ds.MaxMin4.maxMin4(intArray18, 1, (int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray24 = ds.MaxMin4.maxMin4(intArray21, (int) (short) 1, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[100, 100, 1]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[100, 100]");
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
    public void test2261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2261");
        int[] intArray3 = new int[] { (short) 100, (short) 100, 1 };
        int[] intArray6 = ds.MaxMin4.maxMin4(intArray3, (int) (short) 0, (int) (short) 0);
        int[] intArray9 = ds.MaxMin4.maxMin4(intArray6, 1, 1);
        int[] intArray12 = ds.MaxMin4.maxMin4(intArray6, (int) (byte) 0, 1);
        int[] intArray15 = ds.MaxMin4.maxMin4(intArray12, (int) (short) 0, 1);
        int[] intArray18 = ds.MaxMin4.maxMin4(intArray15, (int) (short) 1, 0);
        int[] intArray21 = ds.MaxMin4.maxMin4(intArray15, (int) (short) 0, (int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray24 = ds.MaxMin4.maxMin4(intArray21, (int) '4', (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[100, 100, 1]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[100, 100]");
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
    public void test2262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2262");
        int[] intArray3 = new int[] { (short) 100, (short) 100, 1 };
        int[] intArray6 = ds.MaxMin4.maxMin4(intArray3, (int) (short) 0, (int) (short) 0);
        int[] intArray9 = ds.MaxMin4.maxMin4(intArray3, 0, (int) (byte) 1);
        int[] intArray12 = ds.MaxMin4.maxMin4(intArray3, 0, (int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray15 = ds.MaxMin4.maxMin4(intArray12, (int) (byte) -1, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[100, 100, 1]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[100, 100]");
    }

    @Test
    public void test2263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2263");
        int[] intArray3 = new int[] { (short) 100, (short) 100, 1 };
        int[] intArray6 = ds.MaxMin4.maxMin4(intArray3, (int) (short) 0, (int) (short) 0);
        int[] intArray9 = ds.MaxMin4.maxMin4(intArray3, 0, (int) (byte) 0);
        int[] intArray12 = ds.MaxMin4.maxMin4(intArray9, 0, (int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray15 = ds.MaxMin4.maxMin4(intArray9, (int) (short) 10, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[100, 100, 1]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[100, 100]");
    }

    @Test
    public void test2264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2264");
        int[] intArray3 = new int[] { (short) 100, (short) 100, 1 };
        int[] intArray6 = ds.MaxMin4.maxMin4(intArray3, (int) (short) 0, (int) (short) 0);
        int[] intArray9 = ds.MaxMin4.maxMin4(intArray3, 0, 1);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray12 = ds.MaxMin4.maxMin4(intArray3, (int) (byte) -1, (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[100, 100, 1]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[100, 100]");
    }

    @Test
    public void test2265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2265");
        int[] intArray3 = new int[] { (short) 100, (short) 100, 1 };
        int[] intArray6 = ds.MaxMin4.maxMin4(intArray3, (int) (short) 0, (int) (short) 0);
        int[] intArray9 = ds.MaxMin4.maxMin4(intArray6, 1, 1);
        int[] intArray12 = ds.MaxMin4.maxMin4(intArray9, 1, (int) (byte) 1);
        int[] intArray15 = ds.MaxMin4.maxMin4(intArray12, 0, 0);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray18 = ds.MaxMin4.maxMin4(intArray12, (int) (short) 100, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[100, 100, 1]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[100, 100]");
    }

    @Test
    public void test2266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2266");
        int[] intArray3 = new int[] { (short) 100, (short) 100, 1 };
        int[] intArray6 = ds.MaxMin4.maxMin4(intArray3, (int) (short) 0, (int) (short) 0);
        int[] intArray9 = ds.MaxMin4.maxMin4(intArray6, 1, 1);
        int[] intArray12 = ds.MaxMin4.maxMin4(intArray6, (int) (short) 1, 1);
        int[] intArray15 = ds.MaxMin4.maxMin4(intArray12, 0, 1);
        int[] intArray18 = ds.MaxMin4.maxMin4(intArray12, (int) (short) 1, 1);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray21 = ds.MaxMin4.maxMin4(intArray18, (int) (byte) -1, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[100, 100, 1]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[100, 100]");
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
    public void test2267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2267");
        int[] intArray3 = new int[] { (short) 100, (short) 100, 1 };
        int[] intArray6 = ds.MaxMin4.maxMin4(intArray3, (int) (short) 0, (int) (short) 0);
        int[] intArray9 = ds.MaxMin4.maxMin4(intArray6, 1, 1);
        int[] intArray12 = ds.MaxMin4.maxMin4(intArray9, (int) (byte) 1, (int) (short) 0);
        int[] intArray15 = ds.MaxMin4.maxMin4(intArray9, 1, 1);
        int[] intArray18 = ds.MaxMin4.maxMin4(intArray9, (int) (byte) 0, (int) (short) 1);
        int[] intArray21 = ds.MaxMin4.maxMin4(intArray9, 0, (int) (byte) 1);
        java.lang.Class<?> wildcardClass22 = intArray21.getClass();
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[100, 100, 1]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[100, 100]");
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
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test2268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2268");
        int[] intArray3 = new int[] { (short) 100, (short) 100, 1 };
        int[] intArray6 = ds.MaxMin4.maxMin4(intArray3, (int) (short) 0, (int) (short) 0);
        int[] intArray9 = ds.MaxMin4.maxMin4(intArray6, 1, 1);
        int[] intArray12 = ds.MaxMin4.maxMin4(intArray9, 1, (int) (byte) 1);
        int[] intArray15 = ds.MaxMin4.maxMin4(intArray9, 1, 1);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray18 = ds.MaxMin4.maxMin4(intArray15, (int) ' ', 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[100, 100, 1]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[100, 100]");
    }

    @Test
    public void test2269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2269");
        int[] intArray3 = new int[] { (short) 100, (short) 100, 1 };
        int[] intArray6 = ds.MaxMin4.maxMin4(intArray3, (int) (short) 0, (int) (short) 0);
        int[] intArray9 = ds.MaxMin4.maxMin4(intArray6, (int) (short) 0, 0);
        int[] intArray12 = ds.MaxMin4.maxMin4(intArray6, (int) (byte) 1, 1);
        int[] intArray15 = ds.MaxMin4.maxMin4(intArray6, (int) (short) 1, (int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray18 = ds.MaxMin4.maxMin4(intArray15, (int) (short) 10, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[100, 100, 1]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[100, 100]");
    }

    @Test
    public void test2270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2270");
        int[] intArray3 = new int[] { (short) 100, (short) 100, 1 };
        int[] intArray6 = ds.MaxMin4.maxMin4(intArray3, (int) (short) 0, (int) (short) 0);
        int[] intArray9 = ds.MaxMin4.maxMin4(intArray6, 1, 1);
        int[] intArray12 = ds.MaxMin4.maxMin4(intArray9, 1, (int) (short) 0);
        int[] intArray15 = ds.MaxMin4.maxMin4(intArray12, (int) (byte) 1, (int) (byte) 0);
        int[] intArray18 = ds.MaxMin4.maxMin4(intArray12, (int) (byte) 1, (int) (byte) 1);
        int[] intArray21 = ds.MaxMin4.maxMin4(intArray18, (int) (byte) 0, 1);
        int[] intArray24 = ds.MaxMin4.maxMin4(intArray21, 0, (int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray27 = ds.MaxMin4.maxMin4(intArray24, (int) (short) 100, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[100, 100, 1]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[100, 100]");
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
        org.junit.Assert.assertNotNull(intArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray24), "[100, 100]");
    }

    @Test
    public void test2271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2271");
        int[] intArray3 = new int[] { (short) 100, (short) 100, 1 };
        int[] intArray6 = ds.MaxMin4.maxMin4(intArray3, (int) (short) 0, (int) (short) 0);
        int[] intArray9 = ds.MaxMin4.maxMin4(intArray6, 1, 1);
        int[] intArray12 = ds.MaxMin4.maxMin4(intArray6, (int) (byte) 0, 1);
        int[] intArray15 = ds.MaxMin4.maxMin4(intArray12, 1, 1);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray18 = ds.MaxMin4.maxMin4(intArray15, (-1), (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[100, 100, 1]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[100, 100]");
    }

    @Test
    public void test2272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2272");
        int[] intArray3 = new int[] { (short) 100, (short) 100, 1 };
        int[] intArray6 = ds.MaxMin4.maxMin4(intArray3, (int) (short) 0, (int) (short) 0);
        int[] intArray9 = ds.MaxMin4.maxMin4(intArray3, 0, (int) (byte) 0);
        int[] intArray12 = ds.MaxMin4.maxMin4(intArray9, (int) (byte) 1, (int) (byte) 1);
        int[] intArray15 = ds.MaxMin4.maxMin4(intArray9, 0, 0);
        int[] intArray18 = ds.MaxMin4.maxMin4(intArray9, 1, (int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray21 = ds.MaxMin4.maxMin4(intArray9, 0, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[100, 100, 1]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[100, 100]");
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
    public void test2273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2273");
        int[] intArray3 = new int[] { (short) 100, (short) 100, 1 };
        int[] intArray6 = ds.MaxMin4.maxMin4(intArray3, (int) (short) 0, (int) (short) 0);
        int[] intArray9 = ds.MaxMin4.maxMin4(intArray6, 1, 1);
        int[] intArray12 = ds.MaxMin4.maxMin4(intArray6, (int) (short) 1, 1);
        int[] intArray15 = ds.MaxMin4.maxMin4(intArray12, 0, 1);
        int[] intArray18 = ds.MaxMin4.maxMin4(intArray12, (int) (short) 1, 1);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray21 = ds.MaxMin4.maxMin4(intArray18, (int) (short) 1, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[100, 100, 1]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[100, 100]");
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
    public void test2274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2274");
        int[] intArray3 = new int[] { (short) 100, (short) 100, 1 };
        int[] intArray6 = ds.MaxMin4.maxMin4(intArray3, (int) (short) 0, (int) (short) 0);
        int[] intArray9 = ds.MaxMin4.maxMin4(intArray3, 0, 1);
        int[] intArray12 = ds.MaxMin4.maxMin4(intArray3, (int) (short) 1, (int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray15 = ds.MaxMin4.maxMin4(intArray3, 100, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[100, 100, 1]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[100, 100]");
    }

    @Test
    public void test2275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2275");
        int[] intArray3 = new int[] { (short) 100, (short) 100, 1 };
        int[] intArray6 = ds.MaxMin4.maxMin4(intArray3, (int) (short) 0, (int) (short) 0);
        int[] intArray9 = ds.MaxMin4.maxMin4(intArray6, 1, 1);
        int[] intArray12 = ds.MaxMin4.maxMin4(intArray6, (int) (byte) 0, 1);
        int[] intArray15 = ds.MaxMin4.maxMin4(intArray12, 1, 1);
        int[] intArray18 = ds.MaxMin4.maxMin4(intArray12, 0, (int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray21 = ds.MaxMin4.maxMin4(intArray12, (int) 'a', (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[100, 100, 1]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[100, 100]");
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
    public void test2276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2276");
        int[] intArray3 = new int[] { (short) 100, (short) 100, 1 };
        int[] intArray6 = ds.MaxMin4.maxMin4(intArray3, (int) (short) 0, (int) (short) 0);
        int[] intArray9 = ds.MaxMin4.maxMin4(intArray6, 1, 1);
        int[] intArray12 = ds.MaxMin4.maxMin4(intArray9, 1, (int) (short) 0);
        int[] intArray15 = ds.MaxMin4.maxMin4(intArray9, 0, (int) (short) 1);
        int[] intArray18 = ds.MaxMin4.maxMin4(intArray15, (int) (byte) 1, (int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray21 = ds.MaxMin4.maxMin4(intArray15, (int) (short) -1, (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[100, 100, 1]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[100, 100]");
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
    public void test2277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2277");
        int[] intArray3 = new int[] { (short) 100, (short) 100, 1 };
        int[] intArray6 = ds.MaxMin4.maxMin4(intArray3, (int) (short) 0, (int) (short) 0);
        int[] intArray9 = ds.MaxMin4.maxMin4(intArray6, 1, 1);
        int[] intArray12 = ds.MaxMin4.maxMin4(intArray9, 1, (int) (short) 0);
        int[] intArray15 = ds.MaxMin4.maxMin4(intArray9, 1, 1);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray18 = ds.MaxMin4.maxMin4(intArray9, (int) (short) -1, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[100, 100, 1]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[100, 100]");
    }

    @Test
    public void test2278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2278");
        int[] intArray3 = new int[] { (short) 100, (short) 100, 1 };
        int[] intArray6 = ds.MaxMin4.maxMin4(intArray3, (int) (short) 0, (int) (short) 0);
        int[] intArray9 = ds.MaxMin4.maxMin4(intArray3, 0, 1);
        int[] intArray12 = ds.MaxMin4.maxMin4(intArray9, 0, (int) (short) 0);
        int[] intArray15 = ds.MaxMin4.maxMin4(intArray9, (int) (short) 1, 0);
        int[] intArray18 = ds.MaxMin4.maxMin4(intArray9, 0, (int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray21 = ds.MaxMin4.maxMin4(intArray18, (int) '4', 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[100, 100, 1]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[100, 100]");
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
    public void test2279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2279");
        int[] intArray3 = new int[] { (short) 100, (short) 100, 1 };
        int[] intArray6 = ds.MaxMin4.maxMin4(intArray3, (int) (short) 0, (int) (short) 0);
        int[] intArray9 = ds.MaxMin4.maxMin4(intArray6, 1, 1);
        int[] intArray12 = ds.MaxMin4.maxMin4(intArray9, 1, (int) (short) 0);
        int[] intArray15 = ds.MaxMin4.maxMin4(intArray9, 0, (int) (short) 1);
        int[] intArray18 = ds.MaxMin4.maxMin4(intArray15, (int) (byte) 1, (int) (byte) 0);
        int[] intArray21 = ds.MaxMin4.maxMin4(intArray18, 0, (int) (short) 0);
        int[] intArray24 = ds.MaxMin4.maxMin4(intArray18, 1, 0);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray27 = ds.MaxMin4.maxMin4(intArray24, (int) 'a', (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[100, 100, 1]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[100, 100]");
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
        org.junit.Assert.assertNotNull(intArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray24), "[100, 100]");
    }

    @Test
    public void test2280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2280");
        int[] intArray3 = new int[] { (short) 100, (short) 100, 1 };
        int[] intArray6 = ds.MaxMin4.maxMin4(intArray3, (int) (short) 0, (int) (short) 0);
        int[] intArray9 = ds.MaxMin4.maxMin4(intArray3, 0, 1);
        int[] intArray12 = ds.MaxMin4.maxMin4(intArray9, 0, (int) (short) 0);
        int[] intArray15 = ds.MaxMin4.maxMin4(intArray12, (int) (byte) 1, (int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray18 = ds.MaxMin4.maxMin4(intArray12, (int) (byte) 10, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[100, 100, 1]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[100, 100]");
    }

    @Test
    public void test2281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2281");
        int[] intArray3 = new int[] { (short) 100, (short) 100, 1 };
        int[] intArray6 = ds.MaxMin4.maxMin4(intArray3, (int) (short) 0, (int) (short) 0);
        int[] intArray9 = ds.MaxMin4.maxMin4(intArray6, 1, 1);
        int[] intArray12 = ds.MaxMin4.maxMin4(intArray9, 1, (int) (byte) 1);
        int[] intArray15 = ds.MaxMin4.maxMin4(intArray9, (int) (byte) 0, 0);
        int[] intArray18 = ds.MaxMin4.maxMin4(intArray9, (int) (short) 1, 1);
        int[] intArray21 = ds.MaxMin4.maxMin4(intArray18, 0, (int) (byte) 0);
        int[] intArray24 = ds.MaxMin4.maxMin4(intArray21, 0, 0);
        int[] intArray27 = ds.MaxMin4.maxMin4(intArray21, (int) (byte) 0, (int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray30 = ds.MaxMin4.maxMin4(intArray21, (int) (short) -1, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[100, 100, 1]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[100, 100]");
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
        org.junit.Assert.assertNotNull(intArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray24), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray27), "[100, 100]");
    }

    @Test
    public void test2282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2282");
        int[] intArray3 = new int[] { (short) 100, (short) 100, 1 };
        int[] intArray6 = ds.MaxMin4.maxMin4(intArray3, (int) (short) 0, (int) (short) 0);
        int[] intArray9 = ds.MaxMin4.maxMin4(intArray6, 1, 1);
        int[] intArray12 = ds.MaxMin4.maxMin4(intArray9, 1, (int) (short) 0);
        int[] intArray15 = ds.MaxMin4.maxMin4(intArray12, (int) (byte) 1, (int) (byte) 0);
        int[] intArray18 = ds.MaxMin4.maxMin4(intArray12, (int) (byte) 1, (int) (byte) 1);
        int[] intArray21 = ds.MaxMin4.maxMin4(intArray18, (int) (byte) 0, 1);
        int[] intArray24 = ds.MaxMin4.maxMin4(intArray18, (int) (byte) 0, (int) (byte) 0);
        int[] intArray27 = ds.MaxMin4.maxMin4(intArray24, 0, 0);
        int[] intArray30 = ds.MaxMin4.maxMin4(intArray27, 0, (int) (byte) 1);
        int[] intArray33 = ds.MaxMin4.maxMin4(intArray30, (int) (short) 1, 0);
        int[] intArray36 = ds.MaxMin4.maxMin4(intArray33, 0, 0);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray39 = ds.MaxMin4.maxMin4(intArray33, (int) (byte) 100, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[100, 100, 1]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[100, 100]");
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
    public void test2283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2283");
        int[] intArray3 = new int[] { (short) 100, (short) 100, 1 };
        int[] intArray6 = ds.MaxMin4.maxMin4(intArray3, (int) (short) 0, (int) (short) 0);
        int[] intArray9 = ds.MaxMin4.maxMin4(intArray6, 1, 1);
        int[] intArray12 = ds.MaxMin4.maxMin4(intArray9, 1, (int) (short) 0);
        int[] intArray15 = ds.MaxMin4.maxMin4(intArray12, (int) (byte) 1, (int) (byte) 0);
        int[] intArray18 = ds.MaxMin4.maxMin4(intArray12, (int) (byte) 1, (int) (byte) 1);
        int[] intArray21 = ds.MaxMin4.maxMin4(intArray18, (int) (byte) 0, 1);
        int[] intArray24 = ds.MaxMin4.maxMin4(intArray21, 0, (int) (short) 1);
        int[] intArray27 = ds.MaxMin4.maxMin4(intArray24, (int) (short) 0, 0);
        int[] intArray30 = ds.MaxMin4.maxMin4(intArray24, (int) (short) 1, (int) (byte) 0);
        int[] intArray33 = ds.MaxMin4.maxMin4(intArray24, 0, 0);
        int[] intArray36 = ds.MaxMin4.maxMin4(intArray24, (int) (short) 1, 0);
        int[] intArray39 = ds.MaxMin4.maxMin4(intArray24, (int) (short) 0, 1);
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[100, 100, 1]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[100, 100]");
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
        org.junit.Assert.assertNotNull(intArray39);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray39), "[100, 100]");
    }

    @Test
    public void test2284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2284");
        int[] intArray3 = new int[] { (short) 100, (short) 100, 1 };
        int[] intArray6 = ds.MaxMin4.maxMin4(intArray3, (int) (short) 0, (int) (short) 0);
        int[] intArray9 = ds.MaxMin4.maxMin4(intArray6, 1, 1);
        int[] intArray12 = ds.MaxMin4.maxMin4(intArray9, 1, (int) (short) 0);
        int[] intArray15 = ds.MaxMin4.maxMin4(intArray12, (int) (byte) 1, (int) (byte) 0);
        int[] intArray18 = ds.MaxMin4.maxMin4(intArray12, (int) (byte) 1, (int) (byte) 1);
        int[] intArray21 = ds.MaxMin4.maxMin4(intArray18, (int) (byte) 0, 1);
        int[] intArray24 = ds.MaxMin4.maxMin4(intArray21, 0, (int) (short) 1);
        int[] intArray27 = ds.MaxMin4.maxMin4(intArray21, (int) (short) 0, (int) (short) 1);
        int[] intArray30 = ds.MaxMin4.maxMin4(intArray27, (int) (short) 0, 0);
        int[] intArray33 = ds.MaxMin4.maxMin4(intArray30, (int) (short) 0, (int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray36 = ds.MaxMin4.maxMin4(intArray30, (int) (byte) 0, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[100, 100, 1]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[100, 100]");
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
    public void test2285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2285");
        int[] intArray3 = new int[] { (short) 100, (short) 100, 1 };
        int[] intArray6 = ds.MaxMin4.maxMin4(intArray3, (int) (short) 0, (int) (short) 0);
        int[] intArray9 = ds.MaxMin4.maxMin4(intArray6, 1, 1);
        int[] intArray12 = ds.MaxMin4.maxMin4(intArray9, 1, (int) (short) 0);
        int[] intArray15 = ds.MaxMin4.maxMin4(intArray12, (int) (byte) 1, (int) (byte) 0);
        int[] intArray18 = ds.MaxMin4.maxMin4(intArray12, (int) (byte) 1, (int) (byte) 1);
        int[] intArray21 = ds.MaxMin4.maxMin4(intArray18, (int) (byte) 0, 1);
        int[] intArray24 = ds.MaxMin4.maxMin4(intArray18, (int) (byte) 0, (int) (byte) 0);
        int[] intArray27 = ds.MaxMin4.maxMin4(intArray24, 0, 0);
        int[] intArray30 = ds.MaxMin4.maxMin4(intArray27, 0, (int) (byte) 1);
        int[] intArray33 = ds.MaxMin4.maxMin4(intArray30, (int) (short) 1, 0);
        int[] intArray36 = ds.MaxMin4.maxMin4(intArray33, 0, 0);
        int[] intArray39 = ds.MaxMin4.maxMin4(intArray33, 0, (int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray42 = ds.MaxMin4.maxMin4(intArray39, (int) (byte) 0, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[100, 100, 1]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[100, 100]");
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
        org.junit.Assert.assertNotNull(intArray39);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray39), "[100, 100]");
    }

    @Test
    public void test2286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2286");
        int[] intArray3 = new int[] { (short) 100, (short) 100, 1 };
        int[] intArray6 = ds.MaxMin4.maxMin4(intArray3, (int) (short) 0, (int) (short) 0);
        int[] intArray9 = ds.MaxMin4.maxMin4(intArray6, 1, 1);
        int[] intArray12 = ds.MaxMin4.maxMin4(intArray9, 1, (int) (byte) 1);
        int[] intArray15 = ds.MaxMin4.maxMin4(intArray9, (int) (byte) 0, 0);
        int[] intArray18 = ds.MaxMin4.maxMin4(intArray9, (int) (short) 1, 1);
        int[] intArray21 = ds.MaxMin4.maxMin4(intArray18, 0, (int) (byte) 0);
        int[] intArray24 = ds.MaxMin4.maxMin4(intArray21, 0, 0);
        int[] intArray27 = ds.MaxMin4.maxMin4(intArray21, (int) (byte) 0, (int) (byte) 1);
        int[] intArray30 = ds.MaxMin4.maxMin4(intArray27, (int) (byte) 0, (int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray33 = ds.MaxMin4.maxMin4(intArray27, 0, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[100, 100, 1]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[100, 100]");
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
        org.junit.Assert.assertNotNull(intArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray24), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray27), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray30);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray30), "[100, 100]");
    }

    @Test
    public void test2287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2287");
        int[] intArray3 = new int[] { (short) 100, (short) 100, 1 };
        int[] intArray6 = ds.MaxMin4.maxMin4(intArray3, (int) (short) 0, (int) (short) 0);
        int[] intArray9 = ds.MaxMin4.maxMin4(intArray3, 1, (int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray12 = ds.MaxMin4.maxMin4(intArray9, (-1), (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[100, 100, 1]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[100, 100]");
    }

    @Test
    public void test2288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2288");
        int[] intArray3 = new int[] { (short) 100, (short) 100, 1 };
        int[] intArray6 = ds.MaxMin4.maxMin4(intArray3, (int) (short) 0, (int) (short) 0);
        int[] intArray9 = ds.MaxMin4.maxMin4(intArray6, 1, 1);
        int[] intArray12 = ds.MaxMin4.maxMin4(intArray9, 1, (int) (short) 0);
        int[] intArray15 = ds.MaxMin4.maxMin4(intArray12, (int) (byte) 1, (int) (byte) 0);
        int[] intArray18 = ds.MaxMin4.maxMin4(intArray12, (int) (byte) 1, (int) (byte) 1);
        int[] intArray21 = ds.MaxMin4.maxMin4(intArray18, (int) (byte) 0, 1);
        int[] intArray24 = ds.MaxMin4.maxMin4(intArray18, (int) (byte) 0, (int) (byte) 0);
        int[] intArray27 = ds.MaxMin4.maxMin4(intArray24, 0, 0);
        int[] intArray30 = ds.MaxMin4.maxMin4(intArray27, 0, (int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray33 = ds.MaxMin4.maxMin4(intArray27, (int) (short) -1, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[100, 100, 1]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[100, 100]");
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
        org.junit.Assert.assertNotNull(intArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray24), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray27), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray30);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray30), "[100, 100]");
    }

    @Test
    public void test2289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2289");
        int[] intArray3 = new int[] { (short) 100, (short) 100, 1 };
        int[] intArray6 = ds.MaxMin4.maxMin4(intArray3, (int) (short) 0, (int) (short) 0);
        int[] intArray9 = ds.MaxMin4.maxMin4(intArray6, 1, 1);
        int[] intArray12 = ds.MaxMin4.maxMin4(intArray9, 1, (int) (short) 0);
        int[] intArray15 = ds.MaxMin4.maxMin4(intArray12, (int) (byte) 1, (int) (byte) 0);
        int[] intArray18 = ds.MaxMin4.maxMin4(intArray12, (int) (byte) 1, (int) (byte) 1);
        int[] intArray21 = ds.MaxMin4.maxMin4(intArray12, 0, (int) (byte) 0);
        int[] intArray24 = ds.MaxMin4.maxMin4(intArray12, 0, 0);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray27 = ds.MaxMin4.maxMin4(intArray12, 1, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[100, 100, 1]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[100, 100]");
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
        org.junit.Assert.assertNotNull(intArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray24), "[100, 100]");
    }

    @Test
    public void test2290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2290");
        int[] intArray3 = new int[] { (short) 100, (short) 100, 1 };
        int[] intArray6 = ds.MaxMin4.maxMin4(intArray3, (int) (short) 0, (int) (short) 0);
        int[] intArray9 = ds.MaxMin4.maxMin4(intArray6, 1, 1);
        int[] intArray12 = ds.MaxMin4.maxMin4(intArray9, 1, (int) (short) 0);
        int[] intArray15 = ds.MaxMin4.maxMin4(intArray9, 0, (int) (short) 1);
        int[] intArray18 = ds.MaxMin4.maxMin4(intArray15, (int) (byte) 1, (int) (byte) 0);
        int[] intArray21 = ds.MaxMin4.maxMin4(intArray18, 0, (int) (short) 0);
        int[] intArray24 = ds.MaxMin4.maxMin4(intArray18, 1, 0);
        int[] intArray27 = ds.MaxMin4.maxMin4(intArray24, 1, (int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray30 = ds.MaxMin4.maxMin4(intArray27, (int) (byte) 10, (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[100, 100, 1]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[100, 100]");
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
        org.junit.Assert.assertNotNull(intArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray24), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray27), "[100, 100]");
    }

    @Test
    public void test2291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2291");
        int[] intArray3 = new int[] { (short) 100, (short) 100, 1 };
        int[] intArray6 = ds.MaxMin4.maxMin4(intArray3, (int) (short) 0, (int) (short) 0);
        int[] intArray9 = ds.MaxMin4.maxMin4(intArray6, 1, 1);
        int[] intArray12 = ds.MaxMin4.maxMin4(intArray6, (int) (byte) 0, 1);
        int[] intArray15 = ds.MaxMin4.maxMin4(intArray6, (int) (short) 1, 1);
        java.lang.Class<?> wildcardClass16 = intArray6.getClass();
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[100, 100, 1]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[100, 100]");
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test2292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2292");
        int[] intArray0 = null;
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray3 = ds.MaxMin4.maxMin4(intArray0, (int) (byte) 100, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2293");
        int[] intArray3 = new int[] { (short) 100, (short) 100, 1 };
        int[] intArray6 = ds.MaxMin4.maxMin4(intArray3, (int) (short) 0, (int) (short) 0);
        int[] intArray9 = ds.MaxMin4.maxMin4(intArray6, (int) (short) 0, 0);
        int[] intArray12 = ds.MaxMin4.maxMin4(intArray6, (int) (byte) 1, 1);
        int[] intArray15 = ds.MaxMin4.maxMin4(intArray6, (int) (short) 1, (int) (short) 1);
        int[] intArray18 = ds.MaxMin4.maxMin4(intArray6, 0, (int) (short) 0);
        int[] intArray21 = ds.MaxMin4.maxMin4(intArray6, (int) (byte) 0, 1);
        int[] intArray24 = ds.MaxMin4.maxMin4(intArray21, (int) (short) 1, 0);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray27 = ds.MaxMin4.maxMin4(intArray21, 100, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[100, 100, 1]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[100, 100]");
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
        org.junit.Assert.assertNotNull(intArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray24), "[100, 100]");
    }

    @Test
    public void test2294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2294");
        int[] intArray3 = new int[] { (short) 100, (short) 100, 1 };
        int[] intArray6 = ds.MaxMin4.maxMin4(intArray3, (int) (short) 0, (int) (short) 0);
        int[] intArray9 = ds.MaxMin4.maxMin4(intArray6, 1, 1);
        int[] intArray12 = ds.MaxMin4.maxMin4(intArray9, 1, (int) (short) 0);
        int[] intArray15 = ds.MaxMin4.maxMin4(intArray9, 0, (int) (short) 1);
        int[] intArray18 = ds.MaxMin4.maxMin4(intArray15, (int) (byte) 1, (int) (byte) 0);
        int[] intArray21 = ds.MaxMin4.maxMin4(intArray15, 0, (int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray24 = ds.MaxMin4.maxMin4(intArray15, 1, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[100, 100, 1]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[100, 100]");
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
    public void test2295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2295");
        int[] intArray3 = new int[] { (short) 100, (short) 100, 1 };
        int[] intArray6 = ds.MaxMin4.maxMin4(intArray3, (int) (short) 0, (int) (short) 0);
        int[] intArray9 = ds.MaxMin4.maxMin4(intArray6, 1, 1);
        int[] intArray12 = ds.MaxMin4.maxMin4(intArray9, 1, (int) (short) 0);
        int[] intArray15 = ds.MaxMin4.maxMin4(intArray12, (int) (byte) 1, (int) (byte) 0);
        int[] intArray18 = ds.MaxMin4.maxMin4(intArray12, 0, (int) (byte) 1);
        int[] intArray21 = ds.MaxMin4.maxMin4(intArray18, 1, (int) (byte) 0);
        int[] intArray24 = ds.MaxMin4.maxMin4(intArray18, (int) (short) 1, (int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray27 = ds.MaxMin4.maxMin4(intArray18, (int) ' ', (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[100, 100, 1]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[100, 100]");
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
        org.junit.Assert.assertNotNull(intArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray24), "[100, 100]");
    }

    @Test
    public void test2296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2296");
        int[] intArray3 = new int[] { (short) 100, (short) 100, 1 };
        int[] intArray6 = ds.MaxMin4.maxMin4(intArray3, (int) (short) 0, (int) (short) 0);
        int[] intArray9 = ds.MaxMin4.maxMin4(intArray6, 1, 1);
        int[] intArray12 = ds.MaxMin4.maxMin4(intArray9, 1, (int) (byte) 1);
        int[] intArray15 = ds.MaxMin4.maxMin4(intArray9, 1, 0);
        int[] intArray18 = ds.MaxMin4.maxMin4(intArray9, (int) (short) 1, 1);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray21 = ds.MaxMin4.maxMin4(intArray18, (int) (short) 100, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[100, 100, 1]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[100, 100]");
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
    public void test2297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2297");
        int[] intArray3 = new int[] { (short) 100, (short) 100, 1 };
        int[] intArray6 = ds.MaxMin4.maxMin4(intArray3, (int) (short) 0, (int) (short) 0);
        int[] intArray9 = ds.MaxMin4.maxMin4(intArray6, 1, 1);
        int[] intArray12 = ds.MaxMin4.maxMin4(intArray9, 1, (int) (short) 0);
        int[] intArray15 = ds.MaxMin4.maxMin4(intArray9, 1, 0);
        java.lang.Class<?> wildcardClass16 = intArray9.getClass();
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[100, 100, 1]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[100, 100]");
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test2298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2298");
        int[] intArray3 = new int[] { (short) 100, (short) 100, 1 };
        int[] intArray6 = ds.MaxMin4.maxMin4(intArray3, (int) (short) 0, (int) (short) 0);
        int[] intArray9 = ds.MaxMin4.maxMin4(intArray6, 1, 1);
        int[] intArray12 = ds.MaxMin4.maxMin4(intArray6, (int) (byte) 0, 1);
        int[] intArray15 = ds.MaxMin4.maxMin4(intArray12, (int) (short) 0, 1);
        int[] intArray18 = ds.MaxMin4.maxMin4(intArray15, (int) (short) 1, 0);
        int[] intArray21 = ds.MaxMin4.maxMin4(intArray18, (int) (short) 1, (int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray24 = ds.MaxMin4.maxMin4(intArray21, (int) (byte) 0, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[100, 100, 1]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[100, 100]");
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
    public void test2299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2299");
        int[] intArray3 = new int[] { (short) 100, (short) 100, 1 };
        int[] intArray6 = ds.MaxMin4.maxMin4(intArray3, (int) (short) 0, (int) (short) 0);
        int[] intArray9 = ds.MaxMin4.maxMin4(intArray6, 1, 1);
        int[] intArray12 = ds.MaxMin4.maxMin4(intArray9, 1, (int) (short) 0);
        int[] intArray15 = ds.MaxMin4.maxMin4(intArray12, (int) (byte) 1, (int) (byte) 0);
        int[] intArray18 = ds.MaxMin4.maxMin4(intArray12, (int) (byte) 1, (int) (byte) 1);
        int[] intArray21 = ds.MaxMin4.maxMin4(intArray18, (int) (byte) 0, 1);
        int[] intArray24 = ds.MaxMin4.maxMin4(intArray18, 0, (int) (short) 1);
        int[] intArray27 = ds.MaxMin4.maxMin4(intArray18, (int) (short) 1, (int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray30 = ds.MaxMin4.maxMin4(intArray27, (int) '4', (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[100, 100, 1]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[100, 100]");
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
        org.junit.Assert.assertNotNull(intArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray24), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray27), "[100, 100]");
    }

    @Test
    public void test2300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2300");
        int[] intArray3 = new int[] { (short) 100, (short) 100, 1 };
        int[] intArray6 = ds.MaxMin4.maxMin4(intArray3, (int) (short) 0, (int) (short) 0);
        int[] intArray9 = ds.MaxMin4.maxMin4(intArray3, 0, (int) (byte) 0);
        int[] intArray12 = ds.MaxMin4.maxMin4(intArray3, 0, 1);
        int[] intArray15 = ds.MaxMin4.maxMin4(intArray3, (int) (byte) 1, (int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray18 = ds.MaxMin4.maxMin4(intArray3, (int) (byte) 100, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[100, 100, 1]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[100, 100]");
    }

    @Test
    public void test2301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2301");
        int[] intArray3 = new int[] { (short) 100, (short) 100, 1 };
        int[] intArray6 = ds.MaxMin4.maxMin4(intArray3, (int) (short) 0, (int) (short) 0);
        int[] intArray9 = ds.MaxMin4.maxMin4(intArray6, 1, 1);
        int[] intArray12 = ds.MaxMin4.maxMin4(intArray9, 1, (int) (short) 0);
        int[] intArray15 = ds.MaxMin4.maxMin4(intArray12, (int) (byte) 1, (int) (byte) 0);
        int[] intArray18 = ds.MaxMin4.maxMin4(intArray12, (int) (byte) 1, (int) (byte) 1);
        int[] intArray21 = ds.MaxMin4.maxMin4(intArray18, (int) (byte) 0, 1);
        int[] intArray24 = ds.MaxMin4.maxMin4(intArray21, 0, (int) (short) 1);
        int[] intArray27 = ds.MaxMin4.maxMin4(intArray24, (int) (short) 0, 0);
        int[] intArray30 = ds.MaxMin4.maxMin4(intArray24, (int) (short) 1, (int) (byte) 0);
        int[] intArray33 = ds.MaxMin4.maxMin4(intArray24, 0, 0);
        int[] intArray36 = ds.MaxMin4.maxMin4(intArray33, (int) (short) 0, (int) (short) 1);
        java.lang.Class<?> wildcardClass37 = intArray36.getClass();
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[100, 100, 1]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[100, 100]");
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
        org.junit.Assert.assertNotNull(wildcardClass37);
    }

    @Test
    public void test2302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2302");
        int[] intArray3 = new int[] { (short) 100, (short) 100, 1 };
        int[] intArray6 = ds.MaxMin4.maxMin4(intArray3, (int) (short) 0, (int) (short) 0);
        int[] intArray9 = ds.MaxMin4.maxMin4(intArray6, 1, 1);
        int[] intArray12 = ds.MaxMin4.maxMin4(intArray9, 1, (int) (byte) 1);
        int[] intArray15 = ds.MaxMin4.maxMin4(intArray9, (int) (byte) 0, 0);
        int[] intArray18 = ds.MaxMin4.maxMin4(intArray9, (int) (short) 1, 1);
        int[] intArray21 = ds.MaxMin4.maxMin4(intArray18, (int) (short) 0, (int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray24 = ds.MaxMin4.maxMin4(intArray21, 0, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[100, 100, 1]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[100, 100]");
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
    public void test2303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2303");
        int[] intArray3 = new int[] { (short) 100, (short) 100, 1 };
        int[] intArray6 = ds.MaxMin4.maxMin4(intArray3, (int) (short) 0, (int) (short) 0);
        int[] intArray9 = ds.MaxMin4.maxMin4(intArray6, 1, 1);
        int[] intArray12 = ds.MaxMin4.maxMin4(intArray6, (int) (byte) 0, 1);
        int[] intArray15 = ds.MaxMin4.maxMin4(intArray12, (int) (short) 0, 1);
        int[] intArray18 = ds.MaxMin4.maxMin4(intArray15, (int) (short) 1, 0);
        int[] intArray21 = ds.MaxMin4.maxMin4(intArray18, (int) (byte) 0, (int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray24 = ds.MaxMin4.maxMin4(intArray21, (int) (byte) 10, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[100, 100, 1]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[100, 100]");
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
    public void test2304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2304");
        int[] intArray3 = new int[] { (short) 100, (short) 100, 1 };
        int[] intArray6 = ds.MaxMin4.maxMin4(intArray3, (int) (short) 0, (int) (short) 0);
        int[] intArray9 = ds.MaxMin4.maxMin4(intArray6, 1, 1);
        int[] intArray12 = ds.MaxMin4.maxMin4(intArray6, 1, 1);
        int[] intArray15 = ds.MaxMin4.maxMin4(intArray12, (int) (short) 1, (int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray18 = ds.MaxMin4.maxMin4(intArray12, (int) 'a', (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[100, 100, 1]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[100, 100]");
    }

    @Test
    public void test2305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2305");
        int[] intArray3 = new int[] { (short) 100, (short) 100, 1 };
        int[] intArray6 = ds.MaxMin4.maxMin4(intArray3, (int) (short) 0, (int) (short) 0);
        int[] intArray9 = ds.MaxMin4.maxMin4(intArray3, 0, (int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray12 = ds.MaxMin4.maxMin4(intArray3, (int) (short) 100, (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[100, 100, 1]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[100, 100]");
    }

    @Test
    public void test2306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2306");
        int[] intArray3 = new int[] { (short) 100, (short) 100, 1 };
        int[] intArray6 = ds.MaxMin4.maxMin4(intArray3, (int) (short) 0, (int) (short) 0);
        int[] intArray9 = ds.MaxMin4.maxMin4(intArray3, 0, (int) (byte) 0);
        int[] intArray12 = ds.MaxMin4.maxMin4(intArray3, 1, (int) (short) 1);
        int[] intArray15 = ds.MaxMin4.maxMin4(intArray12, 0, (int) (short) 1);
        java.lang.Class<?> wildcardClass16 = intArray15.getClass();
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[100, 100, 1]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[100, 100]");
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test2307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2307");
        int[] intArray3 = new int[] { (short) 100, (short) 100, 1 };
        int[] intArray6 = ds.MaxMin4.maxMin4(intArray3, (int) (short) 0, (int) (short) 0);
        int[] intArray9 = ds.MaxMin4.maxMin4(intArray3, 0, 1);
        int[] intArray12 = ds.MaxMin4.maxMin4(intArray3, (int) (short) 1, (int) (short) 1);
        int[] intArray15 = ds.MaxMin4.maxMin4(intArray12, 0, (int) (byte) 0);
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[100, 100, 1]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[100, 100]");
    }

    @Test
    public void test2308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2308");
        int[] intArray3 = new int[] { (short) 100, (short) 100, 1 };
        int[] intArray6 = ds.MaxMin4.maxMin4(intArray3, (int) (short) 0, (int) (short) 0);
        int[] intArray9 = ds.MaxMin4.maxMin4(intArray3, 0, (int) (byte) 0);
        int[] intArray12 = ds.MaxMin4.maxMin4(intArray3, 1, (int) (short) 1);
        int[] intArray15 = ds.MaxMin4.maxMin4(intArray3, (int) (short) 0, 1);
        int[] intArray18 = ds.MaxMin4.maxMin4(intArray3, (int) (short) 0, (int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray21 = ds.MaxMin4.maxMin4(intArray3, (int) (short) 100, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[100, 100, 1]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[100, 100]");
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
    public void test2309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2309");
        int[] intArray3 = new int[] { (short) 100, (short) 100, 1 };
        int[] intArray6 = ds.MaxMin4.maxMin4(intArray3, (int) (short) 0, (int) (short) 0);
        int[] intArray9 = ds.MaxMin4.maxMin4(intArray6, 1, 1);
        int[] intArray12 = ds.MaxMin4.maxMin4(intArray9, 1, (int) (short) 0);
        int[] intArray15 = ds.MaxMin4.maxMin4(intArray9, 1, 0);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray18 = ds.MaxMin4.maxMin4(intArray15, 10, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[100, 100, 1]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[100, 100]");
    }

    @Test
    public void test2310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2310");
        int[] intArray3 = new int[] { (short) 100, (short) 100, 1 };
        int[] intArray6 = ds.MaxMin4.maxMin4(intArray3, (int) (short) 0, (int) (short) 0);
        int[] intArray9 = ds.MaxMin4.maxMin4(intArray6, 1, 1);
        int[] intArray12 = ds.MaxMin4.maxMin4(intArray9, 1, (int) (byte) 1);
        int[] intArray15 = ds.MaxMin4.maxMin4(intArray9, 1, 0);
        int[] intArray18 = ds.MaxMin4.maxMin4(intArray15, 0, 0);
        int[] intArray21 = ds.MaxMin4.maxMin4(intArray18, 0, 1);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray24 = ds.MaxMin4.maxMin4(intArray21, (-1), 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[100, 100, 1]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[100, 100]");
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
    public void test2311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2311");
        int[] intArray3 = new int[] { (short) 100, (short) 100, 1 };
        int[] intArray6 = ds.MaxMin4.maxMin4(intArray3, (int) (short) 0, (int) (short) 0);
        int[] intArray9 = ds.MaxMin4.maxMin4(intArray6, 1, 1);
        int[] intArray12 = ds.MaxMin4.maxMin4(intArray6, (int) (short) 1, 1);
        int[] intArray15 = ds.MaxMin4.maxMin4(intArray12, 0, 1);
        int[] intArray18 = ds.MaxMin4.maxMin4(intArray15, (int) (short) 1, 1);
        int[] intArray21 = ds.MaxMin4.maxMin4(intArray18, (int) (byte) 1, (int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray24 = ds.MaxMin4.maxMin4(intArray18, (int) 'a', (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[100, 100, 1]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[100, 100]");
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
    public void test2312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2312");
        int[] intArray3 = new int[] { (short) 100, (short) 100, 1 };
        int[] intArray6 = ds.MaxMin4.maxMin4(intArray3, (int) (short) 0, (int) (short) 0);
        int[] intArray9 = ds.MaxMin4.maxMin4(intArray3, 0, (int) (byte) 0);
        int[] intArray12 = ds.MaxMin4.maxMin4(intArray9, 0, (int) (short) 1);
        int[] intArray15 = ds.MaxMin4.maxMin4(intArray9, (int) (byte) 0, (int) (byte) 1);
        int[] intArray18 = ds.MaxMin4.maxMin4(intArray15, 1, (int) (byte) 1);
        int[] intArray21 = ds.MaxMin4.maxMin4(intArray15, (int) (byte) 0, (int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray24 = ds.MaxMin4.maxMin4(intArray21, (int) '4', 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[100, 100, 1]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[100, 100]");
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
    public void test2313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2313");
        int[] intArray3 = new int[] { (short) 100, (short) 100, 1 };
        int[] intArray6 = ds.MaxMin4.maxMin4(intArray3, (int) (short) 0, (int) (short) 0);
        int[] intArray9 = ds.MaxMin4.maxMin4(intArray3, 1, (int) (byte) 1);
        int[] intArray12 = ds.MaxMin4.maxMin4(intArray3, 0, 0);
        java.lang.Class<?> wildcardClass13 = intArray12.getClass();
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[100, 100, 1]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[100, 100]");
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test2314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2314");
        int[] intArray3 = new int[] { (short) 100, (short) 100, 1 };
        int[] intArray6 = ds.MaxMin4.maxMin4(intArray3, (int) (short) 0, (int) (short) 0);
        int[] intArray9 = ds.MaxMin4.maxMin4(intArray3, 0, 1);
        int[] intArray12 = ds.MaxMin4.maxMin4(intArray9, 0, (int) (short) 0);
        int[] intArray15 = ds.MaxMin4.maxMin4(intArray9, 0, (int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray18 = ds.MaxMin4.maxMin4(intArray9, (int) ' ', (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[100, 100, 1]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[100, 100]");
    }

    @Test
    public void test2315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2315");
        int[] intArray3 = new int[] { (short) 100, (short) 100, 1 };
        int[] intArray6 = ds.MaxMin4.maxMin4(intArray3, (int) (short) 0, (int) (short) 0);
        int[] intArray9 = ds.MaxMin4.maxMin4(intArray6, 1, 1);
        int[] intArray12 = ds.MaxMin4.maxMin4(intArray6, (int) (short) 1, 1);
        int[] intArray15 = ds.MaxMin4.maxMin4(intArray12, 0, 1);
        int[] intArray18 = ds.MaxMin4.maxMin4(intArray15, (int) (short) 1, 1);
        int[] intArray21 = ds.MaxMin4.maxMin4(intArray18, 1, (int) (short) 0);
        int[] intArray24 = ds.MaxMin4.maxMin4(intArray18, (int) (byte) 1, (int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray27 = ds.MaxMin4.maxMin4(intArray18, 1, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[100, 100, 1]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[100, 100]");
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
        org.junit.Assert.assertNotNull(intArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray24), "[100, 100]");
    }

    @Test
    public void test2316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2316");
        int[] intArray3 = new int[] { (short) 100, (short) 100, 1 };
        int[] intArray6 = ds.MaxMin4.maxMin4(intArray3, (int) (short) 0, (int) (short) 0);
        int[] intArray9 = ds.MaxMin4.maxMin4(intArray3, 0, 1);
        int[] intArray12 = ds.MaxMin4.maxMin4(intArray9, 0, (int) (short) 0);
        int[] intArray15 = ds.MaxMin4.maxMin4(intArray9, 0, (int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray18 = ds.MaxMin4.maxMin4(intArray15, (int) (short) 0, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[100, 100, 1]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[100, 100]");
    }

    @Test
    public void test2317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2317");
        int[] intArray3 = new int[] { (short) 100, (short) 100, 1 };
        int[] intArray6 = ds.MaxMin4.maxMin4(intArray3, (int) (short) 0, (int) (short) 0);
        int[] intArray9 = ds.MaxMin4.maxMin4(intArray6, 1, 1);
        int[] intArray12 = ds.MaxMin4.maxMin4(intArray9, 1, (int) (byte) 1);
        int[] intArray15 = ds.MaxMin4.maxMin4(intArray9, (int) (byte) 0, 0);
        int[] intArray18 = ds.MaxMin4.maxMin4(intArray9, (int) (short) 1, 1);
        int[] intArray21 = ds.MaxMin4.maxMin4(intArray18, 0, (int) (byte) 0);
        int[] intArray24 = ds.MaxMin4.maxMin4(intArray21, 0, 0);
        int[] intArray27 = ds.MaxMin4.maxMin4(intArray21, (int) (byte) 0, (int) (byte) 1);
        int[] intArray30 = ds.MaxMin4.maxMin4(intArray27, (int) (byte) 0, (int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray33 = ds.MaxMin4.maxMin4(intArray30, (int) (short) 100, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[100, 100, 1]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[100, 100]");
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
        org.junit.Assert.assertNotNull(intArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray24), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray27), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray30);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray30), "[100, 100]");
    }

    @Test
    public void test2318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2318");
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
    public void test2319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2319");
        int[] intArray3 = new int[] { (short) 100, (short) 100, 1 };
        int[] intArray6 = ds.MaxMin4.maxMin4(intArray3, (int) (short) 0, (int) (short) 0);
        int[] intArray9 = ds.MaxMin4.maxMin4(intArray6, 1, 1);
        int[] intArray12 = ds.MaxMin4.maxMin4(intArray9, 1, (int) (byte) 1);
        int[] intArray15 = ds.MaxMin4.maxMin4(intArray9, (int) (byte) 0, 0);
        int[] intArray18 = ds.MaxMin4.maxMin4(intArray9, (int) (short) 1, 1);
        int[] intArray21 = ds.MaxMin4.maxMin4(intArray18, 0, (int) (byte) 0);
        int[] intArray24 = ds.MaxMin4.maxMin4(intArray21, 0, 0);
        int[] intArray27 = ds.MaxMin4.maxMin4(intArray21, (int) (short) 1, (int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray30 = ds.MaxMin4.maxMin4(intArray27, (int) (short) 10, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[100, 100, 1]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[100, 100]");
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
        org.junit.Assert.assertNotNull(intArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray24), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray27), "[100, 100]");
    }

    @Test
    public void test2320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2320");
        int[] intArray3 = new int[] { (short) 100, (short) 100, 1 };
        int[] intArray6 = ds.MaxMin4.maxMin4(intArray3, (int) (short) 0, (int) (short) 0);
        int[] intArray9 = ds.MaxMin4.maxMin4(intArray6, 1, 1);
        int[] intArray12 = ds.MaxMin4.maxMin4(intArray6, (int) (byte) 0, 1);
        int[] intArray15 = ds.MaxMin4.maxMin4(intArray12, (int) (short) 0, 1);
        int[] intArray18 = ds.MaxMin4.maxMin4(intArray12, (int) (short) 1, 1);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray21 = ds.MaxMin4.maxMin4(intArray12, (int) (byte) -1, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[100, 100, 1]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[100, 100]");
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
    public void test2321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2321");
        int[] intArray3 = new int[] { (short) 100, (short) 100, 1 };
        int[] intArray6 = ds.MaxMin4.maxMin4(intArray3, (int) (short) 0, (int) (short) 0);
        int[] intArray9 = ds.MaxMin4.maxMin4(intArray6, 1, 1);
        int[] intArray12 = ds.MaxMin4.maxMin4(intArray6, (int) (byte) 0, 1);
        int[] intArray15 = ds.MaxMin4.maxMin4(intArray12, (int) (short) 0, 1);
        int[] intArray18 = ds.MaxMin4.maxMin4(intArray12, (int) (short) 0, (int) (byte) 1);
        int[] intArray21 = ds.MaxMin4.maxMin4(intArray18, 0, 0);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray24 = ds.MaxMin4.maxMin4(intArray21, (int) (byte) 100, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[100, 100, 1]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[100, 100]");
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
    public void test2322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2322");
        int[] intArray3 = new int[] { (short) 100, (short) 100, 1 };
        int[] intArray6 = ds.MaxMin4.maxMin4(intArray3, (int) (short) 0, (int) (short) 0);
        int[] intArray9 = ds.MaxMin4.maxMin4(intArray6, 1, 1);
        int[] intArray12 = ds.MaxMin4.maxMin4(intArray9, 1, (int) (short) 0);
        int[] intArray15 = ds.MaxMin4.maxMin4(intArray12, (int) (byte) 1, (int) (byte) 0);
        int[] intArray18 = ds.MaxMin4.maxMin4(intArray12, (int) (byte) 1, (int) (byte) 1);
        int[] intArray21 = ds.MaxMin4.maxMin4(intArray18, (int) (byte) 0, 1);
        int[] intArray24 = ds.MaxMin4.maxMin4(intArray21, 0, (int) (short) 1);
        int[] intArray27 = ds.MaxMin4.maxMin4(intArray24, (int) (short) 0, 0);
        int[] intArray30 = ds.MaxMin4.maxMin4(intArray24, (int) (byte) 1, (int) (short) 0);
        int[] intArray33 = ds.MaxMin4.maxMin4(intArray24, (int) (byte) 1, (int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray36 = ds.MaxMin4.maxMin4(intArray24, (int) '#', (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[100, 100, 1]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[100, 100]");
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
    public void test2323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2323");
        int[] intArray3 = new int[] { (short) 100, (short) 100, 1 };
        int[] intArray6 = ds.MaxMin4.maxMin4(intArray3, (int) (short) 0, (int) (short) 0);
        int[] intArray9 = ds.MaxMin4.maxMin4(intArray6, 1, 1);
        int[] intArray12 = ds.MaxMin4.maxMin4(intArray9, 1, (int) (short) 0);
        int[] intArray15 = ds.MaxMin4.maxMin4(intArray9, 0, (int) (short) 1);
        int[] intArray18 = ds.MaxMin4.maxMin4(intArray15, (int) (byte) 1, (int) (byte) 0);
        int[] intArray21 = ds.MaxMin4.maxMin4(intArray18, 0, (int) (short) 0);
        int[] intArray24 = ds.MaxMin4.maxMin4(intArray21, 1, (int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray27 = ds.MaxMin4.maxMin4(intArray24, (int) (short) 0, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[100, 100, 1]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[100, 100]");
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
        org.junit.Assert.assertNotNull(intArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray24), "[100, 100]");
    }

    @Test
    public void test2324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2324");
        int[] intArray3 = new int[] { (short) 100, (short) 100, 1 };
        int[] intArray6 = ds.MaxMin4.maxMin4(intArray3, (int) (short) 0, (int) (short) 0);
        int[] intArray9 = ds.MaxMin4.maxMin4(intArray6, (int) (short) 0, 0);
        int[] intArray12 = ds.MaxMin4.maxMin4(intArray6, (int) (byte) 1, 1);
        int[] intArray15 = ds.MaxMin4.maxMin4(intArray6, (int) (short) 1, (int) (short) 1);
        int[] intArray18 = ds.MaxMin4.maxMin4(intArray15, 1, 0);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray21 = ds.MaxMin4.maxMin4(intArray18, (int) (byte) 100, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[100, 100, 1]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[100, 100]");
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
    public void test2325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2325");
        int[] intArray3 = new int[] { (short) 100, (short) 100, 1 };
        int[] intArray6 = ds.MaxMin4.maxMin4(intArray3, (int) (short) 0, (int) (short) 0);
        int[] intArray9 = ds.MaxMin4.maxMin4(intArray3, 0, 1);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray12 = ds.MaxMin4.maxMin4(intArray3, (int) (byte) 0, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[100, 100, 1]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[100, 100]");
    }

    @Test
    public void test2326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2326");
        int[] intArray3 = new int[] { (short) 100, (short) 100, 1 };
        int[] intArray6 = ds.MaxMin4.maxMin4(intArray3, (int) (short) 0, (int) (short) 0);
        int[] intArray9 = ds.MaxMin4.maxMin4(intArray6, (int) (short) 0, 0);
        int[] intArray12 = ds.MaxMin4.maxMin4(intArray6, (int) (byte) 1, 1);
        int[] intArray15 = ds.MaxMin4.maxMin4(intArray6, (int) (short) 1, (int) (short) 1);
        int[] intArray18 = ds.MaxMin4.maxMin4(intArray6, 0, (int) (short) 0);
        int[] intArray21 = ds.MaxMin4.maxMin4(intArray6, (int) (byte) 0, 1);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray24 = ds.MaxMin4.maxMin4(intArray21, (int) (short) 10, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[100, 100, 1]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[100, 100]");
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
    public void test2327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2327");
        int[] intArray3 = new int[] { (short) 100, (short) 100, 1 };
        int[] intArray6 = ds.MaxMin4.maxMin4(intArray3, (int) (short) 0, (int) (short) 0);
        int[] intArray9 = ds.MaxMin4.maxMin4(intArray6, 1, 1);
        int[] intArray12 = ds.MaxMin4.maxMin4(intArray9, 1, (int) (byte) 1);
        int[] intArray15 = ds.MaxMin4.maxMin4(intArray9, (int) (byte) 0, 0);
        int[] intArray18 = ds.MaxMin4.maxMin4(intArray9, (int) (short) 1, 1);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray21 = ds.MaxMin4.maxMin4(intArray18, (int) ' ', (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[100, 100, 1]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[100, 100]");
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
    public void test2328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2328");
        int[] intArray3 = new int[] { (short) 100, (short) 100, 1 };
        int[] intArray6 = ds.MaxMin4.maxMin4(intArray3, (int) (short) 0, (int) (short) 0);
        int[] intArray9 = ds.MaxMin4.maxMin4(intArray3, 1, (int) (byte) 1);
        int[] intArray12 = ds.MaxMin4.maxMin4(intArray3, 0, 0);
        java.lang.Class<?> wildcardClass13 = intArray3.getClass();
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[100, 100, 1]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[100, 100]");
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test2329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2329");
        int[] intArray3 = new int[] { (short) 100, (short) 100, 1 };
        int[] intArray6 = ds.MaxMin4.maxMin4(intArray3, (int) (short) 0, (int) (short) 0);
        int[] intArray9 = ds.MaxMin4.maxMin4(intArray6, 1, 1);
        int[] intArray12 = ds.MaxMin4.maxMin4(intArray9, 1, (int) (short) 0);
        int[] intArray15 = ds.MaxMin4.maxMin4(intArray12, (int) (byte) 1, (int) (byte) 0);
        int[] intArray18 = ds.MaxMin4.maxMin4(intArray12, (int) (byte) 1, (int) (byte) 1);
        int[] intArray21 = ds.MaxMin4.maxMin4(intArray18, 0, 0);
        java.lang.Class<?> wildcardClass22 = intArray21.getClass();
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[100, 100, 1]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[100, 100]");
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
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test2330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2330");
        int[] intArray0 = null;
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray3 = ds.MaxMin4.maxMin4(intArray0, (int) (byte) 0, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2331");
        int[] intArray3 = new int[] { (short) 100, (short) 100, 1 };
        int[] intArray6 = ds.MaxMin4.maxMin4(intArray3, (int) (short) 0, (int) (short) 0);
        int[] intArray9 = ds.MaxMin4.maxMin4(intArray6, 1, 1);
        int[] intArray12 = ds.MaxMin4.maxMin4(intArray6, (int) (byte) 0, 1);
        int[] intArray15 = ds.MaxMin4.maxMin4(intArray12, (int) (short) 0, 1);
        int[] intArray18 = ds.MaxMin4.maxMin4(intArray15, (int) (short) 1, 0);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray21 = ds.MaxMin4.maxMin4(intArray15, (int) ' ', (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[100, 100, 1]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[100, 100]");
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
    public void test2332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2332");
        int[] intArray3 = new int[] { (short) 100, (short) 100, 1 };
        int[] intArray6 = ds.MaxMin4.maxMin4(intArray3, (int) (short) 0, (int) (short) 0);
        int[] intArray9 = ds.MaxMin4.maxMin4(intArray6, 1, 1);
        int[] intArray12 = ds.MaxMin4.maxMin4(intArray9, 1, (int) (short) 0);
        int[] intArray15 = ds.MaxMin4.maxMin4(intArray12, (int) (byte) 1, (int) (byte) 0);
        int[] intArray18 = ds.MaxMin4.maxMin4(intArray12, (int) (byte) 1, (int) (byte) 1);
        int[] intArray21 = ds.MaxMin4.maxMin4(intArray18, (int) (byte) 0, 1);
        int[] intArray24 = ds.MaxMin4.maxMin4(intArray21, 0, (int) (short) 1);
        int[] intArray27 = ds.MaxMin4.maxMin4(intArray24, (int) (short) 0, 0);
        int[] intArray30 = ds.MaxMin4.maxMin4(intArray24, (int) (short) 1, (int) (byte) 0);
        int[] intArray33 = ds.MaxMin4.maxMin4(intArray24, 0, 0);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray36 = ds.MaxMin4.maxMin4(intArray24, (int) (byte) 1, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[100, 100, 1]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[100, 100]");
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
    public void test2333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2333");
        int[] intArray3 = new int[] { (short) 100, (short) 100, 1 };
        int[] intArray6 = ds.MaxMin4.maxMin4(intArray3, (int) (short) 0, (int) (short) 0);
        int[] intArray9 = ds.MaxMin4.maxMin4(intArray6, 1, 1);
        int[] intArray12 = ds.MaxMin4.maxMin4(intArray9, 1, (int) (byte) 1);
        int[] intArray15 = ds.MaxMin4.maxMin4(intArray9, (int) (byte) 0, 0);
        int[] intArray18 = ds.MaxMin4.maxMin4(intArray9, (int) (short) 1, 1);
        int[] intArray21 = ds.MaxMin4.maxMin4(intArray18, (int) (short) 1, (int) (short) 0);
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[100, 100, 1]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[100, 100]");
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
    public void test2334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2334");
        int[] intArray3 = new int[] { (short) 100, (short) 100, 1 };
        int[] intArray6 = ds.MaxMin4.maxMin4(intArray3, (int) (short) 0, (int) (short) 0);
        int[] intArray9 = ds.MaxMin4.maxMin4(intArray3, 0, 1);
        int[] intArray12 = ds.MaxMin4.maxMin4(intArray9, 0, (int) (short) 0);
        int[] intArray15 = ds.MaxMin4.maxMin4(intArray12, (int) (byte) 1, (int) (byte) 0);
        int[] intArray18 = ds.MaxMin4.maxMin4(intArray15, (int) (short) 1, 0);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray21 = ds.MaxMin4.maxMin4(intArray15, 10, (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[100, 100, 1]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[100, 100]");
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
    public void test2335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2335");
        int[] intArray3 = new int[] { (short) 100, (short) 100, 1 };
        int[] intArray6 = ds.MaxMin4.maxMin4(intArray3, (int) (short) 0, (int) (short) 0);
        int[] intArray9 = ds.MaxMin4.maxMin4(intArray6, 1, 1);
        int[] intArray12 = ds.MaxMin4.maxMin4(intArray9, 1, (int) (short) 0);
        int[] intArray15 = ds.MaxMin4.maxMin4(intArray9, 0, (int) (short) 1);
        int[] intArray18 = ds.MaxMin4.maxMin4(intArray15, (int) (byte) 1, (int) (byte) 0);
        int[] intArray21 = ds.MaxMin4.maxMin4(intArray15, 0, (int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray24 = ds.MaxMin4.maxMin4(intArray21, (int) (short) -1, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[100, 100, 1]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[100, 100]");
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
    public void test2336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2336");
        int[] intArray3 = new int[] { (short) 100, (short) 100, 1 };
        int[] intArray6 = ds.MaxMin4.maxMin4(intArray3, (int) (short) 0, (int) (short) 0);
        int[] intArray9 = ds.MaxMin4.maxMin4(intArray6, 1, 1);
        int[] intArray12 = ds.MaxMin4.maxMin4(intArray6, (int) (byte) 0, 1);
        int[] intArray15 = ds.MaxMin4.maxMin4(intArray12, (int) (short) 0, 1);
        int[] intArray18 = ds.MaxMin4.maxMin4(intArray15, (int) (byte) 1, (int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray21 = ds.MaxMin4.maxMin4(intArray18, 0, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[100, 100, 1]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[100, 100]");
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
    public void test2337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2337");
        int[] intArray3 = new int[] { (short) 100, (short) 100, 1 };
        int[] intArray6 = ds.MaxMin4.maxMin4(intArray3, (int) (short) 0, (int) (short) 0);
        int[] intArray9 = ds.MaxMin4.maxMin4(intArray6, 1, 1);
        int[] intArray12 = ds.MaxMin4.maxMin4(intArray6, (int) (short) 1, 1);
        int[] intArray15 = ds.MaxMin4.maxMin4(intArray12, 0, 1);
        int[] intArray18 = ds.MaxMin4.maxMin4(intArray12, (int) (short) 1, 1);
        int[] intArray21 = ds.MaxMin4.maxMin4(intArray12, (int) (byte) 0, 0);
        int[] intArray24 = ds.MaxMin4.maxMin4(intArray21, (int) (byte) 1, (int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray27 = ds.MaxMin4.maxMin4(intArray24, (-1), (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[100, 100, 1]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[100, 100]");
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
        org.junit.Assert.assertNotNull(intArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray24), "[100, 100]");
    }

    @Test
    public void test2338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2338");
        int[] intArray3 = new int[] { (short) 100, (short) 100, 1 };
        int[] intArray6 = ds.MaxMin4.maxMin4(intArray3, (int) (short) 0, (int) (short) 0);
        int[] intArray9 = ds.MaxMin4.maxMin4(intArray6, 1, 1);
        int[] intArray12 = ds.MaxMin4.maxMin4(intArray9, 1, (int) (byte) 1);
        int[] intArray15 = ds.MaxMin4.maxMin4(intArray9, 1, 1);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray18 = ds.MaxMin4.maxMin4(intArray15, (int) (short) -1, (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[100, 100, 1]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[100, 100]");
    }

    @Test
    public void test2339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2339");
        int[] intArray3 = new int[] { (short) 100, (short) 100, 1 };
        int[] intArray6 = ds.MaxMin4.maxMin4(intArray3, (int) (short) 0, (int) (short) 0);
        int[] intArray9 = ds.MaxMin4.maxMin4(intArray6, 1, 1);
        int[] intArray12 = ds.MaxMin4.maxMin4(intArray9, 1, (int) (short) 0);
        int[] intArray15 = ds.MaxMin4.maxMin4(intArray12, (int) (byte) 1, (int) (byte) 0);
        int[] intArray18 = ds.MaxMin4.maxMin4(intArray12, (int) (byte) 1, (int) (byte) 1);
        int[] intArray21 = ds.MaxMin4.maxMin4(intArray12, (int) (byte) 1, 1);
        int[] intArray24 = ds.MaxMin4.maxMin4(intArray12, 1, 1);
        int[] intArray27 = ds.MaxMin4.maxMin4(intArray12, (int) (byte) 0, (int) (short) 0);
        java.lang.Class<?> wildcardClass28 = intArray12.getClass();
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[100, 100, 1]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[100, 100]");
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
        org.junit.Assert.assertNotNull(intArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray24), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray27), "[100, 100]");
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test2340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2340");
        int[] intArray3 = new int[] { (short) 100, (short) 100, 1 };
        int[] intArray6 = ds.MaxMin4.maxMin4(intArray3, (int) (short) 0, (int) (short) 0);
        int[] intArray9 = ds.MaxMin4.maxMin4(intArray6, 1, 1);
        int[] intArray12 = ds.MaxMin4.maxMin4(intArray9, 1, (int) (short) 0);
        int[] intArray15 = ds.MaxMin4.maxMin4(intArray12, (int) (byte) 1, (int) (byte) 0);
        int[] intArray18 = ds.MaxMin4.maxMin4(intArray12, (int) (byte) 1, (int) (byte) 1);
        int[] intArray21 = ds.MaxMin4.maxMin4(intArray18, (int) (byte) 0, 1);
        int[] intArray24 = ds.MaxMin4.maxMin4(intArray18, (int) (byte) 0, (int) (byte) 0);
        int[] intArray27 = ds.MaxMin4.maxMin4(intArray24, 0, 0);
        int[] intArray30 = ds.MaxMin4.maxMin4(intArray27, 0, (int) (byte) 1);
        int[] intArray33 = ds.MaxMin4.maxMin4(intArray30, (int) (short) 1, 0);
        int[] intArray36 = ds.MaxMin4.maxMin4(intArray33, 0, 0);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray39 = ds.MaxMin4.maxMin4(intArray33, (int) '4', (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[100, 100, 1]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[100, 100]");
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
    public void test2341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2341");
        int[] intArray3 = new int[] { (short) 100, (short) 100, 1 };
        int[] intArray6 = ds.MaxMin4.maxMin4(intArray3, (int) (short) 0, (int) (short) 0);
        int[] intArray9 = ds.MaxMin4.maxMin4(intArray3, 0, (int) (byte) 0);
        int[] intArray12 = ds.MaxMin4.maxMin4(intArray9, 0, (int) (short) 1);
        int[] intArray15 = ds.MaxMin4.maxMin4(intArray9, (int) (byte) 0, (int) (byte) 1);
        int[] intArray18 = ds.MaxMin4.maxMin4(intArray15, 1, (int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray21 = ds.MaxMin4.maxMin4(intArray15, (int) (short) -1, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[100, 100, 1]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[100, 100]");
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
    public void test2342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2342");
        int[] intArray3 = new int[] { (short) 100, (short) 100, 1 };
        int[] intArray6 = ds.MaxMin4.maxMin4(intArray3, (int) (short) 0, (int) (short) 0);
        int[] intArray9 = ds.MaxMin4.maxMin4(intArray6, 1, 1);
        int[] intArray12 = ds.MaxMin4.maxMin4(intArray9, 1, (int) (byte) 1);
        int[] intArray15 = ds.MaxMin4.maxMin4(intArray9, (int) (byte) 0, 0);
        int[] intArray18 = ds.MaxMin4.maxMin4(intArray15, 1, (int) (short) 0);
        int[] intArray21 = ds.MaxMin4.maxMin4(intArray15, (int) (short) 0, 0);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray24 = ds.MaxMin4.maxMin4(intArray21, (int) '4', (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[100, 100, 1]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[100, 100]");
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
    public void test2343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2343");
        int[] intArray3 = new int[] { (short) 100, (short) 100, 1 };
        int[] intArray6 = ds.MaxMin4.maxMin4(intArray3, (int) (short) 0, (int) (short) 0);
        int[] intArray9 = ds.MaxMin4.maxMin4(intArray6, 1, 1);
        int[] intArray12 = ds.MaxMin4.maxMin4(intArray9, 1, (int) (short) 0);
        int[] intArray15 = ds.MaxMin4.maxMin4(intArray9, 1, 0);
        java.lang.Class<?> wildcardClass16 = intArray15.getClass();
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[100, 100, 1]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[100, 100]");
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test2344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2344");
        int[] intArray3 = new int[] { (short) 100, (short) 100, 1 };
        int[] intArray6 = ds.MaxMin4.maxMin4(intArray3, (int) (short) 0, (int) (short) 0);
        int[] intArray9 = ds.MaxMin4.maxMin4(intArray3, 0, 1);
        int[] intArray12 = ds.MaxMin4.maxMin4(intArray9, 0, (int) (short) 0);
        int[] intArray15 = ds.MaxMin4.maxMin4(intArray9, (int) (short) 1, 0);
        int[] intArray18 = ds.MaxMin4.maxMin4(intArray9, 0, (int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray21 = ds.MaxMin4.maxMin4(intArray18, (int) (short) 1, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[100, 100, 1]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[100, 100]");
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
    public void test2345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2345");
        int[] intArray3 = new int[] { (short) 100, (short) 100, 1 };
        int[] intArray6 = ds.MaxMin4.maxMin4(intArray3, (int) (short) 0, (int) (short) 0);
        int[] intArray9 = ds.MaxMin4.maxMin4(intArray6, 1, 1);
        int[] intArray12 = ds.MaxMin4.maxMin4(intArray6, (int) (byte) 0, 1);
        int[] intArray15 = ds.MaxMin4.maxMin4(intArray12, (int) (short) 0, 1);
        int[] intArray18 = ds.MaxMin4.maxMin4(intArray12, (int) (short) 0, (int) (byte) 1);
        int[] intArray21 = ds.MaxMin4.maxMin4(intArray18, 0, 0);
        int[] intArray24 = ds.MaxMin4.maxMin4(intArray18, (int) (short) 0, 1);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray27 = ds.MaxMin4.maxMin4(intArray18, 1, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[100, 100, 1]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[100, 100]");
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
        org.junit.Assert.assertNotNull(intArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray24), "[100, 100]");
    }

    @Test
    public void test2346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2346");
        int[] intArray3 = new int[] { (short) 100, (short) 100, 1 };
        int[] intArray6 = ds.MaxMin4.maxMin4(intArray3, (int) (short) 0, (int) (short) 0);
        int[] intArray9 = ds.MaxMin4.maxMin4(intArray3, 0, 1);
        int[] intArray12 = ds.MaxMin4.maxMin4(intArray9, 0, (int) (short) 0);
        int[] intArray15 = ds.MaxMin4.maxMin4(intArray9, (int) (short) 1, 0);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray18 = ds.MaxMin4.maxMin4(intArray15, (int) (byte) 0, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[100, 100, 1]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[100, 100]");
    }

    @Test
    public void test2347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2347");
        int[] intArray3 = new int[] { (short) 100, (short) 100, 1 };
        int[] intArray6 = ds.MaxMin4.maxMin4(intArray3, (int) (short) 0, (int) (short) 0);
        int[] intArray9 = ds.MaxMin4.maxMin4(intArray6, 1, 1);
        int[] intArray12 = ds.MaxMin4.maxMin4(intArray6, (int) (byte) 0, 1);
        int[] intArray15 = ds.MaxMin4.maxMin4(intArray12, (int) (short) 0, 1);
        int[] intArray18 = ds.MaxMin4.maxMin4(intArray15, (int) (short) 1, 0);
        int[] intArray21 = ds.MaxMin4.maxMin4(intArray15, (int) (short) 1, 0);
        java.lang.Class<?> wildcardClass22 = intArray15.getClass();
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[100, 100, 1]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[100, 100]");
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
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test2348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2348");
        int[] intArray3 = new int[] { (short) 100, (short) 100, 1 };
        int[] intArray6 = ds.MaxMin4.maxMin4(intArray3, (int) (short) 0, (int) (short) 0);
        int[] intArray9 = ds.MaxMin4.maxMin4(intArray6, 1, 1);
        int[] intArray12 = ds.MaxMin4.maxMin4(intArray9, 1, (int) (short) 0);
        int[] intArray15 = ds.MaxMin4.maxMin4(intArray12, (int) (byte) 1, (int) (byte) 0);
        int[] intArray18 = ds.MaxMin4.maxMin4(intArray12, (int) (byte) 1, (int) (byte) 1);
        int[] intArray21 = ds.MaxMin4.maxMin4(intArray18, (int) (byte) 0, 1);
        int[] intArray24 = ds.MaxMin4.maxMin4(intArray21, 0, (int) (short) 1);
        int[] intArray27 = ds.MaxMin4.maxMin4(intArray24, (int) (short) 0, 0);
        int[] intArray30 = ds.MaxMin4.maxMin4(intArray24, (int) (byte) 1, (int) (short) 0);
        int[] intArray33 = ds.MaxMin4.maxMin4(intArray24, (int) (byte) 1, (int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray36 = ds.MaxMin4.maxMin4(intArray24, (-1), (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[100, 100, 1]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[100, 100]");
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
    public void test2349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2349");
        int[] intArray3 = new int[] { (short) 100, (short) 100, 1 };
        int[] intArray6 = ds.MaxMin4.maxMin4(intArray3, (int) (short) 0, (int) (short) 0);
        int[] intArray9 = ds.MaxMin4.maxMin4(intArray6, 1, 1);
        int[] intArray12 = ds.MaxMin4.maxMin4(intArray9, 1, (int) (byte) 1);
        int[] intArray15 = ds.MaxMin4.maxMin4(intArray9, 1, 0);
        int[] intArray18 = ds.MaxMin4.maxMin4(intArray9, (int) (short) 1, 1);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray21 = ds.MaxMin4.maxMin4(intArray9, (int) (short) 10, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[100, 100, 1]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[100, 100]");
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
    public void test2350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2350");
        int[] intArray3 = new int[] { (short) 100, (short) 100, 1 };
        int[] intArray6 = ds.MaxMin4.maxMin4(intArray3, (int) (short) 0, (int) (short) 0);
        int[] intArray9 = ds.MaxMin4.maxMin4(intArray6, 1, 1);
        int[] intArray12 = ds.MaxMin4.maxMin4(intArray6, (int) (byte) 0, 1);
        int[] intArray15 = ds.MaxMin4.maxMin4(intArray6, (int) (short) 1, 1);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray18 = ds.MaxMin4.maxMin4(intArray15, (int) (short) 10, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[100, 100, 1]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[100, 100]");
    }

    @Test
    public void test2351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2351");
        int[] intArray3 = new int[] { (short) 100, (short) 100, 1 };
        int[] intArray6 = ds.MaxMin4.maxMin4(intArray3, (int) (short) 0, (int) (short) 0);
        int[] intArray9 = ds.MaxMin4.maxMin4(intArray6, 1, 1);
        int[] intArray12 = ds.MaxMin4.maxMin4(intArray6, (int) (short) 1, 1);
        int[] intArray15 = ds.MaxMin4.maxMin4(intArray12, 0, 1);
        int[] intArray18 = ds.MaxMin4.maxMin4(intArray12, (int) (short) 1, 1);
        int[] intArray21 = ds.MaxMin4.maxMin4(intArray12, (int) (byte) 0, 0);
        int[] intArray24 = ds.MaxMin4.maxMin4(intArray21, (int) (short) 1, 0);
        java.lang.Class<?> wildcardClass25 = intArray21.getClass();
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[100, 100, 1]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[100, 100]");
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
        org.junit.Assert.assertNotNull(intArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray24), "[100, 100]");
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test2352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2352");
        int[] intArray3 = new int[] { (short) 100, (short) 100, 1 };
        int[] intArray6 = ds.MaxMin4.maxMin4(intArray3, (int) (short) 0, (int) (short) 0);
        int[] intArray9 = ds.MaxMin4.maxMin4(intArray6, 1, 1);
        int[] intArray12 = ds.MaxMin4.maxMin4(intArray9, (int) (byte) 1, (int) (short) 0);
        int[] intArray15 = ds.MaxMin4.maxMin4(intArray9, 1, 1);
        int[] intArray18 = ds.MaxMin4.maxMin4(intArray9, (int) (byte) 0, (int) (short) 1);
        int[] intArray21 = ds.MaxMin4.maxMin4(intArray18, (int) (short) 1, (int) (byte) 0);
        java.lang.Class<?> wildcardClass22 = intArray18.getClass();
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[100, 100, 1]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[100, 100]");
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
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test2353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2353");
        int[] intArray3 = new int[] { (short) 100, (short) 100, 1 };
        int[] intArray6 = ds.MaxMin4.maxMin4(intArray3, (int) (short) 0, (int) (short) 0);
        int[] intArray9 = ds.MaxMin4.maxMin4(intArray6, 1, 1);
        int[] intArray12 = ds.MaxMin4.maxMin4(intArray9, (int) (byte) 1, (int) (short) 0);
        int[] intArray15 = ds.MaxMin4.maxMin4(intArray9, 1, 1);
        int[] intArray18 = ds.MaxMin4.maxMin4(intArray15, 0, 0);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray21 = ds.MaxMin4.maxMin4(intArray18, 0, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[100, 100, 1]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[100, 100]");
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
    public void test2354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2354");
        int[] intArray3 = new int[] { (short) 100, (short) 100, 1 };
        int[] intArray6 = ds.MaxMin4.maxMin4(intArray3, (int) (short) 0, (int) (short) 0);
        int[] intArray9 = ds.MaxMin4.maxMin4(intArray6, (int) (short) 0, 0);
        int[] intArray12 = ds.MaxMin4.maxMin4(intArray6, (int) (byte) 1, 1);
        int[] intArray15 = ds.MaxMin4.maxMin4(intArray12, 1, (int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray18 = ds.MaxMin4.maxMin4(intArray12, (int) (byte) -1, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[100, 100, 1]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[100, 100]");
    }

    @Test
    public void test2355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2355");
        int[] intArray3 = new int[] { (short) 100, (short) 100, 1 };
        int[] intArray6 = ds.MaxMin4.maxMin4(intArray3, (int) (short) 0, (int) (short) 0);
        int[] intArray9 = ds.MaxMin4.maxMin4(intArray3, 0, (int) (byte) 1);
        int[] intArray12 = ds.MaxMin4.maxMin4(intArray3, 0, (int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray15 = ds.MaxMin4.maxMin4(intArray12, 10, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[100, 100, 1]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[100, 100]");
    }

    @Test
    public void test2356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2356");
        int[] intArray3 = new int[] { (short) 100, (short) 100, 1 };
        int[] intArray6 = ds.MaxMin4.maxMin4(intArray3, (int) (short) 0, (int) (short) 0);
        int[] intArray9 = ds.MaxMin4.maxMin4(intArray6, 1, 1);
        int[] intArray12 = ds.MaxMin4.maxMin4(intArray9, 1, (int) (byte) 1);
        int[] intArray15 = ds.MaxMin4.maxMin4(intArray9, (int) (byte) 0, 0);
        int[] intArray18 = ds.MaxMin4.maxMin4(intArray9, (int) (short) 1, 1);
        int[] intArray21 = ds.MaxMin4.maxMin4(intArray18, 0, (int) (byte) 0);
        int[] intArray24 = ds.MaxMin4.maxMin4(intArray18, (int) (byte) 1, (int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray27 = ds.MaxMin4.maxMin4(intArray24, (int) (byte) 100, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[100, 100, 1]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[100, 100]");
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
        org.junit.Assert.assertNotNull(intArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray24), "[100, 100]");
    }

    @Test
    public void test2357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2357");
        int[] intArray4 = new int[] { (byte) -1, 'a', 1, 0 };
        int[] intArray7 = ds.MaxMin4.maxMin4(intArray4, (int) (short) 0, 0);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray10 = ds.MaxMin4.maxMin4(intArray7, 100, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[-1, 97, 1, 0]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[-1, -1]");
    }

    @Test
    public void test2358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2358");
        int[] intArray3 = new int[] { (short) 100, (short) 100, 1 };
        int[] intArray6 = ds.MaxMin4.maxMin4(intArray3, (int) (short) 0, (int) (short) 0);
        int[] intArray9 = ds.MaxMin4.maxMin4(intArray6, 1, 1);
        int[] intArray12 = ds.MaxMin4.maxMin4(intArray9, 1, (int) (byte) 1);
        int[] intArray15 = ds.MaxMin4.maxMin4(intArray9, 1, 0);
        int[] intArray18 = ds.MaxMin4.maxMin4(intArray15, 0, 0);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray21 = ds.MaxMin4.maxMin4(intArray18, (int) (short) 1, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[100, 100, 1]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[100, 100]");
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
    public void test2359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2359");
        int[] intArray3 = new int[] { (short) 100, (short) 100, 1 };
        int[] intArray6 = ds.MaxMin4.maxMin4(intArray3, (int) (short) 0, (int) (short) 0);
        int[] intArray9 = ds.MaxMin4.maxMin4(intArray6, 1, 1);
        int[] intArray12 = ds.MaxMin4.maxMin4(intArray6, (int) (byte) 0, 1);
        int[] intArray15 = ds.MaxMin4.maxMin4(intArray12, (int) (short) 0, 1);
        int[] intArray18 = ds.MaxMin4.maxMin4(intArray15, (int) (short) 1, 0);
        int[] intArray21 = ds.MaxMin4.maxMin4(intArray15, (int) (short) 0, (int) (byte) 0);
        int[] intArray24 = ds.MaxMin4.maxMin4(intArray15, (int) (short) 1, (int) (short) 0);
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[100, 100, 1]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[100, 100]");
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
        org.junit.Assert.assertNotNull(intArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray24), "[100, 100]");
    }

    @Test
    public void test2360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2360");
        int[] intArray3 = new int[] { (short) 100, (short) 100, 1 };
        int[] intArray6 = ds.MaxMin4.maxMin4(intArray3, (int) (short) 0, (int) (short) 0);
        int[] intArray9 = ds.MaxMin4.maxMin4(intArray3, 0, 1);
        int[] intArray12 = ds.MaxMin4.maxMin4(intArray3, (int) (short) 1, (int) (short) 1);
        int[] intArray15 = ds.MaxMin4.maxMin4(intArray3, 0, (int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray18 = ds.MaxMin4.maxMin4(intArray3, (int) 'a', (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[100, 100, 1]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[100, 100]");
    }

    @Test
    public void test2361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2361");
        int[] intArray3 = new int[] { (short) 100, (short) 100, 1 };
        int[] intArray6 = ds.MaxMin4.maxMin4(intArray3, (int) (short) 0, (int) (short) 0);
        int[] intArray9 = ds.MaxMin4.maxMin4(intArray6, 1, 1);
        int[] intArray12 = ds.MaxMin4.maxMin4(intArray9, 1, (int) (byte) 1);
        int[] intArray15 = ds.MaxMin4.maxMin4(intArray9, (int) (byte) 0, 0);
        int[] intArray18 = ds.MaxMin4.maxMin4(intArray9, (int) (short) 0, (int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray21 = ds.MaxMin4.maxMin4(intArray18, (int) (byte) 0, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[100, 100, 1]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray18), "[100, 100]");
    }
}

