package ds.seed7992;

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
        int[] intArray5 = new int[] { 0, (short) 100, '#', (byte) 100, ' ' };
        int[] intArray8 = ds.MaxMin4.maxMin4(intArray5, 1, (int) (byte) 0);
        int[] intArray11 = ds.MaxMin4.maxMin4(intArray5, (int) (short) 0, 1);
        int[] intArray14 = ds.MaxMin4.maxMin4(intArray5, 0, 1);
        int[] intArray17 = ds.MaxMin4.maxMin4(intArray14, (int) (short) 0, 1);
        java.lang.Class<?> wildcardClass18 = intArray14.getClass();
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[0, 100, 35, 100, 32]");
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[100, 0]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[100, 0]");
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[100, 0]");
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[100, 0]");
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test2002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2002");
        int[] intArray5 = new int[] { 0, (short) 100, '#', (byte) 100, ' ' };
        int[] intArray8 = ds.MaxMin4.maxMin4(intArray5, 1, (int) (byte) 0);
        int[] intArray11 = ds.MaxMin4.maxMin4(intArray5, (int) (short) 1, 0);
        int[] intArray14 = ds.MaxMin4.maxMin4(intArray5, 0, 0);
        int[] intArray17 = ds.MaxMin4.maxMin4(intArray5, 0, 0);
        int[] intArray20 = ds.MaxMin4.maxMin4(intArray5, (int) (short) 1, 0);
        int[] intArray23 = ds.MaxMin4.maxMin4(intArray20, (int) (byte) 0, (int) (short) 0);
        int[] intArray26 = ds.MaxMin4.maxMin4(intArray23, (int) (byte) 1, 0);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray29 = ds.MaxMin4.maxMin4(intArray26, 10, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[0, 100, 35, 100, 32]");
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[100, 0]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[100, 0]");
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray20), "[100, 0]");
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray23), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray26), "[100, 100]");
    }

    @Test
    public void test2003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2003");
        int[] intArray5 = new int[] { 0, (short) 100, '#', (byte) 100, ' ' };
        int[] intArray8 = ds.MaxMin4.maxMin4(intArray5, 1, (int) (byte) 0);
        int[] intArray11 = ds.MaxMin4.maxMin4(intArray8, 0, (int) (short) 1);
        int[] intArray14 = ds.MaxMin4.maxMin4(intArray8, 0, (int) (short) 1);
        int[] intArray17 = ds.MaxMin4.maxMin4(intArray8, 0, 0);
        int[] intArray20 = ds.MaxMin4.maxMin4(intArray8, (int) (short) 0, (int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray23 = ds.MaxMin4.maxMin4(intArray8, 10, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[0, 100, 35, 100, 32]");
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[100, 0]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[100, 0]");
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[100, 0]");
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray20), "[100, 100]");
    }

    @Test
    public void test2004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2004");
        int[] intArray5 = new int[] { 0, (short) 100, '#', (byte) 100, ' ' };
        int[] intArray8 = ds.MaxMin4.maxMin4(intArray5, 1, (int) (byte) 0);
        int[] intArray11 = ds.MaxMin4.maxMin4(intArray5, (int) (short) 1, 0);
        int[] intArray14 = ds.MaxMin4.maxMin4(intArray11, 1, (int) (byte) 0);
        int[] intArray17 = ds.MaxMin4.maxMin4(intArray14, (int) (short) 1, 1);
        int[] intArray20 = ds.MaxMin4.maxMin4(intArray17, (int) (short) 1, (int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray23 = ds.MaxMin4.maxMin4(intArray20, (int) (byte) 0, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[0, 100, 35, 100, 32]");
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[100, 0]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[100, 0]");
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[100, 0]");
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray20), "[0, 0]");
    }

    @Test
    public void test2005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2005");
        int[] intArray5 = new int[] { 0, (short) 100, '#', (byte) 100, ' ' };
        int[] intArray8 = ds.MaxMin4.maxMin4(intArray5, 1, (int) (byte) 0);
        int[] intArray11 = ds.MaxMin4.maxMin4(intArray5, (int) (short) 1, 0);
        int[] intArray14 = ds.MaxMin4.maxMin4(intArray5, 0, 0);
        int[] intArray17 = ds.MaxMin4.maxMin4(intArray5, 0, 0);
        int[] intArray20 = ds.MaxMin4.maxMin4(intArray5, (int) (short) 1, 0);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray23 = ds.MaxMin4.maxMin4(intArray20, (int) (byte) 100, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[0, 100, 35, 100, 32]");
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[100, 0]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[100, 0]");
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray20), "[100, 0]");
    }

    @Test
    public void test2006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2006");
        int[] intArray5 = new int[] { 0, (short) 100, '#', (byte) 100, ' ' };
        int[] intArray8 = ds.MaxMin4.maxMin4(intArray5, 1, (int) (byte) 0);
        int[] intArray11 = ds.MaxMin4.maxMin4(intArray5, (int) (short) 1, 0);
        int[] intArray14 = ds.MaxMin4.maxMin4(intArray5, 0, 0);
        int[] intArray17 = ds.MaxMin4.maxMin4(intArray5, 0, 0);
        int[] intArray20 = ds.MaxMin4.maxMin4(intArray5, (int) (short) 1, 0);
        int[] intArray23 = ds.MaxMin4.maxMin4(intArray20, (int) (byte) 0, (int) (short) 0);
        int[] intArray26 = ds.MaxMin4.maxMin4(intArray20, 1, 0);
        int[] intArray29 = ds.MaxMin4.maxMin4(intArray26, (int) (short) 1, 0);
        int[] intArray32 = ds.MaxMin4.maxMin4(intArray26, 0, (int) (byte) 0);
        int[] intArray35 = ds.MaxMin4.maxMin4(intArray26, (int) (byte) 1, 1);
        int[] intArray38 = ds.MaxMin4.maxMin4(intArray26, (int) (byte) 0, (int) (short) 0);
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[0, 100, 35, 100, 32]");
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[100, 0]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[100, 0]");
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray20), "[100, 0]");
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray23), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray26), "[100, 0]");
        org.junit.Assert.assertNotNull(intArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray29), "[100, 0]");
        org.junit.Assert.assertNotNull(intArray32);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray32), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray35);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray35), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray38);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray38), "[100, 100]");
    }

    @Test
    public void test2007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2007");
        int[] intArray6 = new int[] { (byte) 1, (short) 1, ' ', (-1), (byte) 1, 'a' };
        int[] intArray9 = ds.MaxMin4.maxMin4(intArray6, 0, (int) (short) 1);
        int[] intArray12 = ds.MaxMin4.maxMin4(intArray9, (int) (short) 1, 0);
        int[] intArray15 = ds.MaxMin4.maxMin4(intArray12, 1, (int) (byte) 1);
        int[] intArray18 = ds.MaxMin4.maxMin4(intArray12, (int) (byte) 0, 1);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray21 = ds.MaxMin4.maxMin4(intArray18, (int) (short) 1, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[1, 1, 32, -1, 1, 97]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray18), "[1, 1]");
    }

    @Test
    public void test2008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2008");
        int[] intArray6 = new int[] { (byte) 1, (short) 1, ' ', (-1), (byte) 1, 'a' };
        int[] intArray9 = ds.MaxMin4.maxMin4(intArray6, 0, (int) (short) 1);
        int[] intArray12 = ds.MaxMin4.maxMin4(intArray9, (int) (short) 1, 0);
        int[] intArray15 = ds.MaxMin4.maxMin4(intArray9, 0, 0);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray18 = ds.MaxMin4.maxMin4(intArray9, (int) 'a', (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[1, 1, 32, -1, 1, 97]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[1, 1]");
    }

    @Test
    public void test2009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2009");
        int[] intArray5 = new int[] { 0, (short) 100, '#', (byte) 100, ' ' };
        int[] intArray8 = ds.MaxMin4.maxMin4(intArray5, 1, (int) (byte) 0);
        int[] intArray11 = ds.MaxMin4.maxMin4(intArray5, (int) (short) 1, 0);
        int[] intArray14 = ds.MaxMin4.maxMin4(intArray5, 0, 0);
        int[] intArray17 = ds.MaxMin4.maxMin4(intArray5, 0, 0);
        int[] intArray20 = ds.MaxMin4.maxMin4(intArray5, (int) (short) 1, 0);
        int[] intArray23 = ds.MaxMin4.maxMin4(intArray20, (int) (byte) 0, (int) (short) 0);
        int[] intArray26 = ds.MaxMin4.maxMin4(intArray20, 1, 0);
        int[] intArray29 = ds.MaxMin4.maxMin4(intArray26, (int) (short) 1, 0);
        int[] intArray32 = ds.MaxMin4.maxMin4(intArray26, (int) (short) 0, 1);
        java.lang.Class<?> wildcardClass33 = intArray32.getClass();
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[0, 100, 35, 100, 32]");
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[100, 0]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[100, 0]");
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray20), "[100, 0]");
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray23), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray26), "[100, 0]");
        org.junit.Assert.assertNotNull(intArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray29), "[100, 0]");
        org.junit.Assert.assertNotNull(intArray32);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray32), "[100, 0]");
        org.junit.Assert.assertNotNull(wildcardClass33);
    }

    @Test
    public void test2010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2010");
        int[] intArray5 = new int[] { 0, (short) 100, '#', (byte) 100, ' ' };
        int[] intArray8 = ds.MaxMin4.maxMin4(intArray5, 1, (int) (byte) 0);
        int[] intArray11 = ds.MaxMin4.maxMin4(intArray5, (int) (short) 1, 0);
        int[] intArray14 = ds.MaxMin4.maxMin4(intArray5, 0, 0);
        int[] intArray17 = ds.MaxMin4.maxMin4(intArray5, 0, 0);
        int[] intArray20 = ds.MaxMin4.maxMin4(intArray5, (int) (short) 1, 0);
        int[] intArray23 = ds.MaxMin4.maxMin4(intArray20, 0, (int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray26 = ds.MaxMin4.maxMin4(intArray23, (int) (short) 10, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[0, 100, 35, 100, 32]");
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[100, 0]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[100, 0]");
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray20), "[100, 0]");
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray23), "[100, 100]");
    }

    @Test
    public void test2011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2011");
        int[] intArray0 = null;
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray3 = ds.MaxMin4.maxMin4(intArray0, (int) (short) 1, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2012");
        int[] intArray5 = new int[] { 0, (short) 100, '#', (byte) 100, ' ' };
        int[] intArray8 = ds.MaxMin4.maxMin4(intArray5, 1, (int) (byte) 0);
        int[] intArray11 = ds.MaxMin4.maxMin4(intArray8, (int) (byte) 0, (int) (byte) 1);
        int[] intArray14 = ds.MaxMin4.maxMin4(intArray8, (int) (byte) 0, 1);
        int[] intArray17 = ds.MaxMin4.maxMin4(intArray14, (int) (byte) 0, 1);
        int[] intArray20 = ds.MaxMin4.maxMin4(intArray17, 0, 1);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray23 = ds.MaxMin4.maxMin4(intArray20, (int) (byte) 10, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[0, 100, 35, 100, 32]");
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[100, 0]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[100, 0]");
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[100, 0]");
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[100, 0]");
        org.junit.Assert.assertNotNull(intArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray20), "[100, 0]");
    }

    @Test
    public void test2013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2013");
        int[] intArray5 = new int[] { 0, (short) 100, '#', (byte) 100, ' ' };
        int[] intArray8 = ds.MaxMin4.maxMin4(intArray5, 1, (int) (byte) 0);
        int[] intArray11 = ds.MaxMin4.maxMin4(intArray8, 0, (int) (short) 1);
        int[] intArray14 = ds.MaxMin4.maxMin4(intArray11, (int) (byte) 1, 0);
        int[] intArray17 = ds.MaxMin4.maxMin4(intArray11, (int) (short) 1, 1);
        int[] intArray20 = ds.MaxMin4.maxMin4(intArray17, (int) (byte) 0, 0);
        int[] intArray23 = ds.MaxMin4.maxMin4(intArray20, (int) (byte) 0, (int) (short) 1);
        int[] intArray26 = ds.MaxMin4.maxMin4(intArray20, 0, (int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray29 = ds.MaxMin4.maxMin4(intArray20, (int) (byte) 100, (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[0, 100, 35, 100, 32]");
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[100, 0]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[100, 0]");
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[100, 0]");
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray20), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray23), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray26), "[0, 0]");
    }

    @Test
    public void test2014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2014");
        int[] intArray5 = new int[] { 0, (short) 100, '#', (byte) 100, ' ' };
        int[] intArray8 = ds.MaxMin4.maxMin4(intArray5, 1, (int) (byte) 0);
        int[] intArray11 = ds.MaxMin4.maxMin4(intArray8, (int) (byte) 0, (int) (byte) 1);
        int[] intArray14 = ds.MaxMin4.maxMin4(intArray8, (int) (byte) 0, 1);
        int[] intArray17 = ds.MaxMin4.maxMin4(intArray8, (int) (byte) 1, (int) (short) 0);
        int[] intArray20 = ds.MaxMin4.maxMin4(intArray17, (int) (byte) 0, (int) (short) 0);
        int[] intArray23 = ds.MaxMin4.maxMin4(intArray20, 1, 0);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray26 = ds.MaxMin4.maxMin4(intArray20, (-1), (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[0, 100, 35, 100, 32]");
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[100, 0]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[100, 0]");
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[100, 0]");
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[100, 0]");
        org.junit.Assert.assertNotNull(intArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray20), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray23), "[100, 100]");
    }

    @Test
    public void test2015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2015");
        int[] intArray5 = new int[] { 0, (short) 100, '#', (byte) 100, ' ' };
        int[] intArray8 = ds.MaxMin4.maxMin4(intArray5, 1, (int) (byte) 0);
        int[] intArray11 = ds.MaxMin4.maxMin4(intArray8, (int) (byte) 0, (int) (byte) 1);
        int[] intArray14 = ds.MaxMin4.maxMin4(intArray11, (int) (short) 0, (int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray17 = ds.MaxMin4.maxMin4(intArray11, (int) (short) -1, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[0, 100, 35, 100, 32]");
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[100, 0]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[100, 0]");
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[100, 0]");
    }

    @Test
    public void test2016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2016");
        int[] intArray6 = new int[] { (byte) 1, (short) 1, ' ', (-1), (byte) 1, 'a' };
        int[] intArray9 = ds.MaxMin4.maxMin4(intArray6, 0, (int) (short) 1);
        int[] intArray12 = ds.MaxMin4.maxMin4(intArray9, (int) (short) 1, 0);
        int[] intArray15 = ds.MaxMin4.maxMin4(intArray12, 1, (int) (byte) 1);
        int[] intArray18 = ds.MaxMin4.maxMin4(intArray15, (int) (byte) 1, 0);
        int[] intArray21 = ds.MaxMin4.maxMin4(intArray15, (int) (byte) 1, 0);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray24 = ds.MaxMin4.maxMin4(intArray15, 0, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[1, 1, 32, -1, 1, 97]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[1, 1]");
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
    public void test2017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2017");
        int[] intArray5 = new int[] { 0, (short) 100, '#', (byte) 100, ' ' };
        int[] intArray8 = ds.MaxMin4.maxMin4(intArray5, 1, (int) (byte) 0);
        int[] intArray11 = ds.MaxMin4.maxMin4(intArray8, 0, (int) (short) 1);
        int[] intArray14 = ds.MaxMin4.maxMin4(intArray8, 0, (int) (short) 1);
        int[] intArray17 = ds.MaxMin4.maxMin4(intArray8, 0, 0);
        int[] intArray20 = ds.MaxMin4.maxMin4(intArray8, (int) (short) 0, (int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray23 = ds.MaxMin4.maxMin4(intArray8, (int) (byte) -1, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[0, 100, 35, 100, 32]");
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[100, 0]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[100, 0]");
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[100, 0]");
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray20), "[100, 0]");
    }

    @Test
    public void test2018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2018");
        int[] intArray5 = new int[] { 0, (short) 100, '#', (byte) 100, ' ' };
        int[] intArray8 = ds.MaxMin4.maxMin4(intArray5, 1, (int) (byte) 0);
        int[] intArray11 = ds.MaxMin4.maxMin4(intArray5, 0, (int) (byte) 1);
        int[] intArray14 = ds.MaxMin4.maxMin4(intArray5, (int) (short) 1, 1);
        int[] intArray17 = ds.MaxMin4.maxMin4(intArray5, 0, (int) (short) 1);
        int[] intArray20 = ds.MaxMin4.maxMin4(intArray17, 0, 1);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray23 = ds.MaxMin4.maxMin4(intArray20, 0, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[0, 100, 35, 100, 32]");
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[100, 0]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[100, 0]");
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[100, 0]");
        org.junit.Assert.assertNotNull(intArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray20), "[100, 0]");
    }

    @Test
    public void test2019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2019");
        int[] intArray5 = new int[] { 0, (short) 100, '#', (byte) 100, ' ' };
        int[] intArray8 = ds.MaxMin4.maxMin4(intArray5, 1, (int) (byte) 0);
        int[] intArray11 = ds.MaxMin4.maxMin4(intArray5, (int) (short) 1, 0);
        int[] intArray14 = ds.MaxMin4.maxMin4(intArray5, 0, 0);
        int[] intArray17 = ds.MaxMin4.maxMin4(intArray5, 0, 0);
        int[] intArray20 = ds.MaxMin4.maxMin4(intArray5, (int) (short) 1, 0);
        int[] intArray23 = ds.MaxMin4.maxMin4(intArray20, (int) (byte) 0, (int) (short) 0);
        int[] intArray26 = ds.MaxMin4.maxMin4(intArray20, 1, 0);
        int[] intArray29 = ds.MaxMin4.maxMin4(intArray26, (int) (short) 1, 0);
        int[] intArray32 = ds.MaxMin4.maxMin4(intArray26, 0, (int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray35 = ds.MaxMin4.maxMin4(intArray32, 100, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[0, 100, 35, 100, 32]");
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[100, 0]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[100, 0]");
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray20), "[100, 0]");
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray23), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray26), "[100, 0]");
        org.junit.Assert.assertNotNull(intArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray29), "[100, 0]");
        org.junit.Assert.assertNotNull(intArray32);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray32), "[100, 100]");
    }

    @Test
    public void test2020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2020");
        int[] intArray5 = new int[] { 0, (short) 100, '#', (byte) 100, ' ' };
        int[] intArray8 = ds.MaxMin4.maxMin4(intArray5, 1, (int) (byte) 0);
        int[] intArray11 = ds.MaxMin4.maxMin4(intArray5, (int) (short) 1, 0);
        int[] intArray14 = ds.MaxMin4.maxMin4(intArray5, 0, 0);
        int[] intArray17 = ds.MaxMin4.maxMin4(intArray14, 1, 0);
        int[] intArray20 = ds.MaxMin4.maxMin4(intArray17, 0, 0);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray23 = ds.MaxMin4.maxMin4(intArray17, (int) (short) 100, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[0, 100, 35, 100, 32]");
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[100, 0]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[100, 0]");
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray20), "[0, 0]");
    }

    @Test
    public void test2021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2021");
        int[] intArray5 = new int[] { 0, (short) 100, '#', (byte) 100, ' ' };
        int[] intArray8 = ds.MaxMin4.maxMin4(intArray5, 1, (int) (byte) 0);
        int[] intArray11 = ds.MaxMin4.maxMin4(intArray8, (int) (byte) 0, (int) (byte) 1);
        int[] intArray14 = ds.MaxMin4.maxMin4(intArray11, (int) (byte) 1, 0);
        int[] intArray17 = ds.MaxMin4.maxMin4(intArray11, 0, 1);
        java.lang.Class<?> wildcardClass18 = intArray11.getClass();
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[0, 100, 35, 100, 32]");
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[100, 0]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[100, 0]");
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[100, 0]");
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[100, 0]");
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test2022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2022");
        int[] intArray5 = new int[] { 0, (short) 100, '#', (byte) 100, ' ' };
        int[] intArray8 = ds.MaxMin4.maxMin4(intArray5, 1, (int) (byte) 0);
        int[] intArray11 = ds.MaxMin4.maxMin4(intArray5, (int) (short) 1, 0);
        int[] intArray14 = ds.MaxMin4.maxMin4(intArray11, 1, (int) (byte) 0);
        int[] intArray17 = ds.MaxMin4.maxMin4(intArray11, (int) (byte) 0, (int) (byte) 1);
        int[] intArray20 = ds.MaxMin4.maxMin4(intArray17, (int) (short) 1, 0);
        int[] intArray23 = ds.MaxMin4.maxMin4(intArray20, (int) (short) 1, (int) (byte) 0);
        java.lang.Class<?> wildcardClass24 = intArray23.getClass();
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[0, 100, 35, 100, 32]");
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[100, 0]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[100, 0]");
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[100, 0]");
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[100, 0]");
        org.junit.Assert.assertNotNull(intArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray20), "[100, 0]");
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray23), "[100, 0]");
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test2023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2023");
        int[] intArray5 = new int[] { 0, (short) 100, '#', (byte) 100, ' ' };
        int[] intArray8 = ds.MaxMin4.maxMin4(intArray5, 1, (int) (byte) 0);
        int[] intArray11 = ds.MaxMin4.maxMin4(intArray5, (int) (short) 1, 0);
        int[] intArray14 = ds.MaxMin4.maxMin4(intArray11, 1, (int) (byte) 0);
        int[] intArray17 = ds.MaxMin4.maxMin4(intArray14, (int) (short) 1, 1);
        int[] intArray20 = ds.MaxMin4.maxMin4(intArray17, (int) (short) 1, (int) (short) 1);
        int[] intArray23 = ds.MaxMin4.maxMin4(intArray17, 0, (int) (byte) 1);
        int[] intArray26 = ds.MaxMin4.maxMin4(intArray17, 0, 0);
        java.lang.Class<?> wildcardClass27 = intArray26.getClass();
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[0, 100, 35, 100, 32]");
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[100, 0]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[100, 0]");
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[100, 0]");
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray20), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray23), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray26), "[0, 0]");
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test2024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2024");
        int[] intArray5 = new int[] { 0, (short) 100, '#', (byte) 100, ' ' };
        int[] intArray8 = ds.MaxMin4.maxMin4(intArray5, 1, (int) (byte) 0);
        int[] intArray11 = ds.MaxMin4.maxMin4(intArray5, (int) (short) 1, 0);
        int[] intArray14 = ds.MaxMin4.maxMin4(intArray5, 0, 0);
        int[] intArray17 = ds.MaxMin4.maxMin4(intArray5, 0, 0);
        int[] intArray20 = ds.MaxMin4.maxMin4(intArray5, (int) (short) 1, 0);
        int[] intArray23 = ds.MaxMin4.maxMin4(intArray20, (int) (byte) 0, (int) (short) 0);
        int[] intArray26 = ds.MaxMin4.maxMin4(intArray20, 1, 0);
        int[] intArray29 = ds.MaxMin4.maxMin4(intArray26, (int) (short) 1, 0);
        int[] intArray32 = ds.MaxMin4.maxMin4(intArray26, (int) (byte) 1, (int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray35 = ds.MaxMin4.maxMin4(intArray26, (int) (short) -1, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[0, 100, 35, 100, 32]");
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[100, 0]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[100, 0]");
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray20), "[100, 0]");
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray23), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray26), "[100, 0]");
        org.junit.Assert.assertNotNull(intArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray29), "[100, 0]");
        org.junit.Assert.assertNotNull(intArray32);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray32), "[100, 0]");
    }

    @Test
    public void test2025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2025");
        int[] intArray5 = new int[] { 0, (short) 100, '#', (byte) 100, ' ' };
        int[] intArray8 = ds.MaxMin4.maxMin4(intArray5, 1, (int) (byte) 0);
        int[] intArray11 = ds.MaxMin4.maxMin4(intArray8, (int) (byte) 0, (int) (byte) 1);
        int[] intArray14 = ds.MaxMin4.maxMin4(intArray11, (int) (byte) 1, 0);
        int[] intArray17 = ds.MaxMin4.maxMin4(intArray11, (int) (short) 0, 0);
        int[] intArray20 = ds.MaxMin4.maxMin4(intArray11, (int) (byte) 1, 1);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray23 = ds.MaxMin4.maxMin4(intArray11, (int) 'a', (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[0, 100, 35, 100, 32]");
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[100, 0]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[100, 0]");
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[100, 0]");
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray20), "[0, 0]");
    }

    @Test
    public void test2026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2026");
        int[] intArray5 = new int[] { 0, (short) 100, '#', (byte) 100, ' ' };
        int[] intArray8 = ds.MaxMin4.maxMin4(intArray5, 1, (int) (byte) 0);
        int[] intArray11 = ds.MaxMin4.maxMin4(intArray8, 0, (int) (short) 1);
        int[] intArray14 = ds.MaxMin4.maxMin4(intArray8, 0, (int) (short) 1);
        int[] intArray17 = ds.MaxMin4.maxMin4(intArray14, 0, 1);
        int[] intArray20 = ds.MaxMin4.maxMin4(intArray14, 0, (int) (short) 0);
        int[] intArray23 = ds.MaxMin4.maxMin4(intArray20, (int) (short) 1, 0);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray26 = ds.MaxMin4.maxMin4(intArray20, 10, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[0, 100, 35, 100, 32]");
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[100, 0]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[100, 0]");
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[100, 0]");
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[100, 0]");
        org.junit.Assert.assertNotNull(intArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray20), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray23), "[100, 100]");
    }

    @Test
    public void test2027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2027");
        int[] intArray5 = new int[] { 0, (short) 100, '#', (byte) 100, ' ' };
        int[] intArray8 = ds.MaxMin4.maxMin4(intArray5, 1, (int) (byte) 0);
        int[] intArray11 = ds.MaxMin4.maxMin4(intArray5, 0, 0);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray14 = ds.MaxMin4.maxMin4(intArray11, (int) (byte) 100, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[0, 100, 35, 100, 32]");
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[100, 0]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[0, 0]");
    }

    @Test
    public void test2028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2028");
        int[] intArray5 = new int[] { 0, (short) 100, '#', (byte) 100, ' ' };
        int[] intArray8 = ds.MaxMin4.maxMin4(intArray5, 1, (int) (byte) 0);
        int[] intArray11 = ds.MaxMin4.maxMin4(intArray8, (int) (byte) 0, (int) (byte) 1);
        int[] intArray14 = ds.MaxMin4.maxMin4(intArray11, (int) (byte) 1, 0);
        int[] intArray17 = ds.MaxMin4.maxMin4(intArray11, (int) (short) 0, 0);
        int[] intArray20 = ds.MaxMin4.maxMin4(intArray17, (int) (short) 1, (int) (byte) 1);
        int[] intArray23 = ds.MaxMin4.maxMin4(intArray17, (int) (byte) 1, 1);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray26 = ds.MaxMin4.maxMin4(intArray17, (int) (byte) 1, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[0, 100, 35, 100, 32]");
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[100, 0]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[100, 0]");
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[100, 0]");
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray20), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray23), "[100, 100]");
    }

    @Test
    public void test2029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2029");
        int[] intArray5 = new int[] { 0, (short) 100, '#', (byte) 100, ' ' };
        int[] intArray8 = ds.MaxMin4.maxMin4(intArray5, 1, (int) (byte) 0);
        int[] intArray11 = ds.MaxMin4.maxMin4(intArray5, (int) (short) 1, 0);
        int[] intArray14 = ds.MaxMin4.maxMin4(intArray5, 0, 0);
        int[] intArray17 = ds.MaxMin4.maxMin4(intArray5, (int) (byte) 1, 0);
        int[] intArray20 = ds.MaxMin4.maxMin4(intArray5, 0, 1);
        int[] intArray23 = ds.MaxMin4.maxMin4(intArray20, (int) (short) 1, 0);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray26 = ds.MaxMin4.maxMin4(intArray23, (int) ' ', (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[0, 100, 35, 100, 32]");
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[100, 0]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[100, 0]");
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[100, 0]");
        org.junit.Assert.assertNotNull(intArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray20), "[100, 0]");
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray23), "[100, 0]");
    }

    @Test
    public void test2030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2030");
        int[] intArray5 = new int[] { 0, (short) 100, '#', (byte) 100, ' ' };
        int[] intArray8 = ds.MaxMin4.maxMin4(intArray5, 1, (int) (byte) 0);
        int[] intArray11 = ds.MaxMin4.maxMin4(intArray5, (int) (short) 1, 0);
        int[] intArray14 = ds.MaxMin4.maxMin4(intArray5, 0, 0);
        int[] intArray17 = ds.MaxMin4.maxMin4(intArray14, 1, 0);
        int[] intArray20 = ds.MaxMin4.maxMin4(intArray17, 0, 0);
        int[] intArray23 = ds.MaxMin4.maxMin4(intArray20, (int) (short) 1, 0);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray26 = ds.MaxMin4.maxMin4(intArray23, (int) ' ', (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[0, 100, 35, 100, 32]");
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[100, 0]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[100, 0]");
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray20), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray23), "[0, 0]");
    }

    @Test
    public void test2031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2031");
        int[] intArray5 = new int[] { 0, (short) 100, '#', (byte) 100, ' ' };
        int[] intArray8 = ds.MaxMin4.maxMin4(intArray5, 1, (int) (byte) 0);
        int[] intArray11 = ds.MaxMin4.maxMin4(intArray5, 0, (int) (byte) 1);
        int[] intArray14 = ds.MaxMin4.maxMin4(intArray5, (int) (short) 1, 1);
        int[] intArray17 = ds.MaxMin4.maxMin4(intArray14, (int) (byte) 0, (int) (byte) 0);
        int[] intArray20 = ds.MaxMin4.maxMin4(intArray17, (int) (short) 0, 1);
        int[] intArray23 = ds.MaxMin4.maxMin4(intArray20, (int) (byte) 1, 0);
        java.lang.Class<?> wildcardClass24 = intArray23.getClass();
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[0, 100, 35, 100, 32]");
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[100, 0]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[100, 0]");
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray20), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray23), "[100, 100]");
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test2032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2032");
        int[] intArray5 = new int[] { 0, (short) 100, '#', (byte) 100, ' ' };
        int[] intArray8 = ds.MaxMin4.maxMin4(intArray5, 1, (int) (byte) 0);
        int[] intArray11 = ds.MaxMin4.maxMin4(intArray8, 0, (int) (short) 1);
        int[] intArray14 = ds.MaxMin4.maxMin4(intArray11, (int) (byte) 1, 0);
        int[] intArray17 = ds.MaxMin4.maxMin4(intArray11, (int) (short) 1, 1);
        int[] intArray20 = ds.MaxMin4.maxMin4(intArray17, (int) (byte) 0, 0);
        int[] intArray23 = ds.MaxMin4.maxMin4(intArray20, 1, 1);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray26 = ds.MaxMin4.maxMin4(intArray23, (int) (short) -1, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[0, 100, 35, 100, 32]");
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[100, 0]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[100, 0]");
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[100, 0]");
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray20), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray23), "[0, 0]");
    }

    @Test
    public void test2033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2033");
        int[] intArray5 = new int[] { 0, (short) 100, '#', (byte) 100, ' ' };
        int[] intArray8 = ds.MaxMin4.maxMin4(intArray5, 1, (int) (byte) 0);
        int[] intArray11 = ds.MaxMin4.maxMin4(intArray8, 0, (int) (short) 1);
        int[] intArray14 = ds.MaxMin4.maxMin4(intArray8, 0, (int) (short) 1);
        int[] intArray17 = ds.MaxMin4.maxMin4(intArray8, 0, 0);
        int[] intArray20 = ds.MaxMin4.maxMin4(intArray8, (int) (short) 0, (int) (byte) 0);
        int[] intArray23 = ds.MaxMin4.maxMin4(intArray20, 0, (int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray26 = ds.MaxMin4.maxMin4(intArray23, 0, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[0, 100, 35, 100, 32]");
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[100, 0]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[100, 0]");
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[100, 0]");
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray20), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray23), "[100, 100]");
    }

    @Test
    public void test2034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2034");
        int[] intArray0 = null;
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray3 = ds.MaxMin4.maxMin4(intArray0, (int) (short) -1, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2035");
        int[] intArray0 = null;
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray3 = ds.MaxMin4.maxMin4(intArray0, 10, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2036");
        int[] intArray5 = new int[] { 0, (short) 100, '#', (byte) 100, ' ' };
        int[] intArray8 = ds.MaxMin4.maxMin4(intArray5, 1, (int) (byte) 0);
        int[] intArray11 = ds.MaxMin4.maxMin4(intArray8, (int) (byte) 0, (int) (byte) 1);
        int[] intArray14 = ds.MaxMin4.maxMin4(intArray11, (int) (byte) 1, 0);
        int[] intArray17 = ds.MaxMin4.maxMin4(intArray11, (int) (short) 0, 0);
        int[] intArray20 = ds.MaxMin4.maxMin4(intArray11, (int) (byte) 1, 1);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray23 = ds.MaxMin4.maxMin4(intArray20, (int) '4', (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[0, 100, 35, 100, 32]");
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[100, 0]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[100, 0]");
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[100, 0]");
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray20), "[0, 0]");
    }

    @Test
    public void test2037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2037");
        int[] intArray6 = new int[] { (byte) 1, (short) 1, ' ', (-1), (byte) 1, 'a' };
        int[] intArray9 = ds.MaxMin4.maxMin4(intArray6, 0, (int) (short) 1);
        int[] intArray12 = ds.MaxMin4.maxMin4(intArray6, 0, 0);
        java.lang.Class<?> wildcardClass13 = intArray6.getClass();
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[1, 1, 32, -1, 1, 97]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[1, 1]");
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test2038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2038");
        int[] intArray5 = new int[] { 0, (short) 100, '#', (byte) 100, ' ' };
        int[] intArray8 = ds.MaxMin4.maxMin4(intArray5, 1, (int) (byte) 0);
        int[] intArray11 = ds.MaxMin4.maxMin4(intArray5, (int) (short) 0, 1);
        int[] intArray14 = ds.MaxMin4.maxMin4(intArray5, 0, 1);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray17 = ds.MaxMin4.maxMin4(intArray14, 10, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[0, 100, 35, 100, 32]");
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[100, 0]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[100, 0]");
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[100, 0]");
    }

    @Test
    public void test2039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2039");
        int[] intArray5 = new int[] { 0, (short) 100, '#', (byte) 100, ' ' };
        int[] intArray8 = ds.MaxMin4.maxMin4(intArray5, 1, (int) (byte) 0);
        int[] intArray11 = ds.MaxMin4.maxMin4(intArray5, (int) (short) 1, 0);
        int[] intArray14 = ds.MaxMin4.maxMin4(intArray11, 1, (int) (byte) 0);
        int[] intArray17 = ds.MaxMin4.maxMin4(intArray14, (int) (short) 1, 1);
        int[] intArray20 = ds.MaxMin4.maxMin4(intArray17, (int) (short) 1, (int) (short) 1);
        int[] intArray23 = ds.MaxMin4.maxMin4(intArray20, 1, (int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray26 = ds.MaxMin4.maxMin4(intArray23, (int) (byte) 100, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[0, 100, 35, 100, 32]");
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[100, 0]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[100, 0]");
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[100, 0]");
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray20), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray23), "[0, 0]");
    }

    @Test
    public void test2040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2040");
        int[] intArray6 = new int[] { (byte) 1, (short) 1, ' ', (-1), (byte) 1, 'a' };
        int[] intArray9 = ds.MaxMin4.maxMin4(intArray6, 0, (int) (short) 1);
        int[] intArray12 = ds.MaxMin4.maxMin4(intArray6, 0, 0);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray15 = ds.MaxMin4.maxMin4(intArray12, (int) (byte) 1, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[1, 1, 32, -1, 1, 97]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[1, 1]");
    }

    @Test
    public void test2041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2041");
        int[] intArray5 = new int[] { 0, (short) 100, '#', (byte) 100, ' ' };
        int[] intArray8 = ds.MaxMin4.maxMin4(intArray5, 1, (int) (byte) 0);
        int[] intArray11 = ds.MaxMin4.maxMin4(intArray5, (int) (short) 1, 0);
        int[] intArray14 = ds.MaxMin4.maxMin4(intArray11, 1, (int) (byte) 0);
        int[] intArray17 = ds.MaxMin4.maxMin4(intArray11, (int) (short) 1, (int) (short) 0);
        int[] intArray20 = ds.MaxMin4.maxMin4(intArray17, (int) (short) 0, (int) (short) 0);
        java.lang.Class<?> wildcardClass21 = intArray20.getClass();
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[0, 100, 35, 100, 32]");
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[100, 0]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[100, 0]");
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[100, 0]");
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[100, 0]");
        org.junit.Assert.assertNotNull(intArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray20), "[100, 100]");
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test2042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2042");
        int[] intArray5 = new int[] { 0, (short) 100, '#', (byte) 100, ' ' };
        int[] intArray8 = ds.MaxMin4.maxMin4(intArray5, 1, (int) (byte) 0);
        int[] intArray11 = ds.MaxMin4.maxMin4(intArray5, 0, (int) (byte) 1);
        int[] intArray14 = ds.MaxMin4.maxMin4(intArray5, (int) (short) 1, 1);
        int[] intArray17 = ds.MaxMin4.maxMin4(intArray14, (int) (byte) 0, (int) (byte) 0);
        int[] intArray20 = ds.MaxMin4.maxMin4(intArray17, (int) (short) 0, 1);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray23 = ds.MaxMin4.maxMin4(intArray20, (int) (short) -1, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[0, 100, 35, 100, 32]");
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[100, 0]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[100, 0]");
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray20), "[100, 100]");
    }

    @Test
    public void test2043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2043");
        int[] intArray5 = new int[] { '4', 10, (byte) 1, 100, (short) 0 };
        int[] intArray8 = ds.MaxMin4.maxMin4(intArray5, (int) (byte) 1, 1);
        java.lang.Class<?> wildcardClass9 = intArray5.getClass();
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[52, 10, 1, 100, 0]");
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[10, 10]");
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test2044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2044");
        int[] intArray5 = new int[] { 0, (short) 100, '#', (byte) 100, ' ' };
        int[] intArray8 = ds.MaxMin4.maxMin4(intArray5, 1, (int) (byte) 0);
        int[] intArray11 = ds.MaxMin4.maxMin4(intArray5, (int) (short) 1, 0);
        int[] intArray14 = ds.MaxMin4.maxMin4(intArray11, 1, (int) (byte) 0);
        int[] intArray17 = ds.MaxMin4.maxMin4(intArray14, (int) (short) 1, 1);
        int[] intArray20 = ds.MaxMin4.maxMin4(intArray17, (int) (short) 1, (int) (short) 1);
        int[] intArray23 = ds.MaxMin4.maxMin4(intArray20, 1, (int) (short) 1);
        int[] intArray26 = ds.MaxMin4.maxMin4(intArray20, (int) (byte) 1, 0);
        java.lang.Class<?> wildcardClass27 = intArray26.getClass();
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[0, 100, 35, 100, 32]");
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[100, 0]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[100, 0]");
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[100, 0]");
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray20), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray23), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray26), "[0, 0]");
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test2045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2045");
        int[] intArray6 = new int[] { (byte) 1, (short) 1, ' ', (-1), (byte) 1, 'a' };
        int[] intArray9 = ds.MaxMin4.maxMin4(intArray6, 0, (int) (short) 1);
        int[] intArray12 = ds.MaxMin4.maxMin4(intArray9, (int) (short) 1, 0);
        int[] intArray15 = ds.MaxMin4.maxMin4(intArray9, 0, 0);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray18 = ds.MaxMin4.maxMin4(intArray15, (int) (short) -1, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[1, 1, 32, -1, 1, 97]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[1, 1]");
    }

    @Test
    public void test2046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2046");
        int[] intArray5 = new int[] { 0, (short) 100, '#', (byte) 100, ' ' };
        int[] intArray8 = ds.MaxMin4.maxMin4(intArray5, 1, (int) (byte) 0);
        int[] intArray11 = ds.MaxMin4.maxMin4(intArray5, (int) (short) 1, 0);
        int[] intArray14 = ds.MaxMin4.maxMin4(intArray11, 1, (int) (byte) 0);
        int[] intArray17 = ds.MaxMin4.maxMin4(intArray11, (int) (byte) 0, (int) (byte) 1);
        int[] intArray20 = ds.MaxMin4.maxMin4(intArray17, (int) (short) 1, 0);
        int[] intArray23 = ds.MaxMin4.maxMin4(intArray20, (int) (short) 1, (int) (byte) 0);
        java.lang.Class<?> wildcardClass24 = intArray20.getClass();
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[0, 100, 35, 100, 32]");
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[100, 0]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[100, 0]");
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[100, 0]");
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[100, 0]");
        org.junit.Assert.assertNotNull(intArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray20), "[100, 0]");
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray23), "[100, 0]");
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test2047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2047");
        int[] intArray5 = new int[] { 0, (short) 100, '#', (byte) 100, ' ' };
        int[] intArray8 = ds.MaxMin4.maxMin4(intArray5, 1, (int) (byte) 0);
        int[] intArray11 = ds.MaxMin4.maxMin4(intArray5, 0, (int) (byte) 1);
        int[] intArray14 = ds.MaxMin4.maxMin4(intArray5, (int) (short) 1, 1);
        int[] intArray17 = ds.MaxMin4.maxMin4(intArray14, (int) (byte) 0, (int) (byte) 0);
        int[] intArray20 = ds.MaxMin4.maxMin4(intArray17, (int) (short) 0, 1);
        int[] intArray23 = ds.MaxMin4.maxMin4(intArray17, 0, (int) (short) 1);
        int[] intArray26 = ds.MaxMin4.maxMin4(intArray17, 0, 0);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray29 = ds.MaxMin4.maxMin4(intArray17, (int) (short) 10, 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[0, 100, 35, 100, 32]");
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[100, 0]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[100, 0]");
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray20), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray23), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray26), "[100, 100]");
    }

    @Test
    public void test2048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2048");
        int[] intArray5 = new int[] { 0, (short) 100, '#', (byte) 100, ' ' };
        int[] intArray8 = ds.MaxMin4.maxMin4(intArray5, 1, (int) (byte) 0);
        int[] intArray11 = ds.MaxMin4.maxMin4(intArray5, (int) (short) 1, 0);
        int[] intArray14 = ds.MaxMin4.maxMin4(intArray11, 1, (int) (byte) 0);
        int[] intArray17 = ds.MaxMin4.maxMin4(intArray14, (int) (short) 1, 1);
        int[] intArray20 = ds.MaxMin4.maxMin4(intArray17, (int) (short) 1, (int) (short) 1);
        int[] intArray23 = ds.MaxMin4.maxMin4(intArray17, (int) (byte) 1, (int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray26 = ds.MaxMin4.maxMin4(intArray23, (int) (byte) -1, (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[0, 100, 35, 100, 32]");
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[100, 0]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[100, 0]");
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[100, 0]");
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray20), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray23), "[0, 0]");
    }

    @Test
    public void test2049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2049");
        int[] intArray5 = new int[] { 0, (short) 100, '#', (byte) 100, ' ' };
        int[] intArray8 = ds.MaxMin4.maxMin4(intArray5, 1, (int) (byte) 0);
        int[] intArray11 = ds.MaxMin4.maxMin4(intArray8, (int) (byte) 0, (int) (byte) 1);
        int[] intArray14 = ds.MaxMin4.maxMin4(intArray8, (int) (byte) 0, 1);
        int[] intArray17 = ds.MaxMin4.maxMin4(intArray14, (int) (byte) 0, 1);
        int[] intArray20 = ds.MaxMin4.maxMin4(intArray17, (int) (byte) 1, 1);
        int[] intArray23 = ds.MaxMin4.maxMin4(intArray17, 0, (int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray26 = ds.MaxMin4.maxMin4(intArray17, 100, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[0, 100, 35, 100, 32]");
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[100, 0]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[100, 0]");
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[100, 0]");
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[100, 0]");
        org.junit.Assert.assertNotNull(intArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray20), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray23), "[100, 100]");
    }

    @Test
    public void test2050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2050");
        int[] intArray5 = new int[] { 0, (short) 100, '#', (byte) 100, ' ' };
        int[] intArray8 = ds.MaxMin4.maxMin4(intArray5, 1, (int) (byte) 0);
        int[] intArray11 = ds.MaxMin4.maxMin4(intArray8, 0, (int) (short) 1);
        int[] intArray14 = ds.MaxMin4.maxMin4(intArray8, 0, (int) (short) 1);
        int[] intArray17 = ds.MaxMin4.maxMin4(intArray14, (int) (byte) 0, (int) (short) 1);
        int[] intArray20 = ds.MaxMin4.maxMin4(intArray17, (int) (byte) 0, 0);
        int[] intArray23 = ds.MaxMin4.maxMin4(intArray20, (int) (byte) 0, 0);
        java.lang.Class<?> wildcardClass24 = intArray23.getClass();
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[0, 100, 35, 100, 32]");
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[100, 0]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[100, 0]");
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[100, 0]");
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[100, 0]");
        org.junit.Assert.assertNotNull(intArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray20), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray23), "[100, 100]");
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test2051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2051");
        int[] intArray5 = new int[] { 0, (short) 100, '#', (byte) 100, ' ' };
        int[] intArray8 = ds.MaxMin4.maxMin4(intArray5, 1, (int) (byte) 0);
        int[] intArray11 = ds.MaxMin4.maxMin4(intArray5, (int) (short) 1, 0);
        int[] intArray14 = ds.MaxMin4.maxMin4(intArray5, 0, 0);
        int[] intArray17 = ds.MaxMin4.maxMin4(intArray14, 1, 0);
        int[] intArray20 = ds.MaxMin4.maxMin4(intArray17, 0, 0);
        java.lang.Class<?> wildcardClass21 = intArray17.getClass();
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[0, 100, 35, 100, 32]");
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[100, 0]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[100, 0]");
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray20), "[0, 0]");
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test2052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2052");
        int[] intArray5 = new int[] { 0, (short) 100, '#', (byte) 100, ' ' };
        int[] intArray8 = ds.MaxMin4.maxMin4(intArray5, 1, (int) (byte) 0);
        int[] intArray11 = ds.MaxMin4.maxMin4(intArray8, (int) (byte) 0, (int) (byte) 1);
        int[] intArray14 = ds.MaxMin4.maxMin4(intArray11, (int) (byte) 1, 0);
        int[] intArray17 = ds.MaxMin4.maxMin4(intArray11, (int) (short) 0, 0);
        int[] intArray20 = ds.MaxMin4.maxMin4(intArray17, (int) (short) 1, (int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray23 = ds.MaxMin4.maxMin4(intArray20, (int) (short) 1, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[0, 100, 35, 100, 32]");
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[100, 0]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[100, 0]");
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[100, 0]");
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray20), "[100, 100]");
    }

    @Test
    public void test2053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2053");
        int[] intArray5 = new int[] { 0, (short) 100, '#', (byte) 100, ' ' };
        int[] intArray8 = ds.MaxMin4.maxMin4(intArray5, 1, (int) (byte) 0);
        int[] intArray11 = ds.MaxMin4.maxMin4(intArray5, 0, (int) (byte) 1);
        int[] intArray14 = ds.MaxMin4.maxMin4(intArray5, (int) (short) 1, 1);
        int[] intArray17 = ds.MaxMin4.maxMin4(intArray14, (int) (byte) 0, (int) (byte) 0);
        int[] intArray20 = ds.MaxMin4.maxMin4(intArray17, (int) (short) 0, 1);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray23 = ds.MaxMin4.maxMin4(intArray17, 10, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[0, 100, 35, 100, 32]");
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[100, 0]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[100, 0]");
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray20), "[100, 100]");
    }

    @Test
    public void test2054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2054");
        int[] intArray0 = null;
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray3 = ds.MaxMin4.maxMin4(intArray0, 1, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2055");
        int[] intArray5 = new int[] { 0, (short) 100, '#', (byte) 100, ' ' };
        int[] intArray8 = ds.MaxMin4.maxMin4(intArray5, 1, (int) (byte) 0);
        int[] intArray11 = ds.MaxMin4.maxMin4(intArray5, 0, (int) (byte) 1);
        int[] intArray14 = ds.MaxMin4.maxMin4(intArray5, (int) (short) 1, 1);
        int[] intArray17 = ds.MaxMin4.maxMin4(intArray14, (int) (byte) 0, (int) (byte) 0);
        int[] intArray20 = ds.MaxMin4.maxMin4(intArray17, (int) (short) 0, 1);
        int[] intArray23 = ds.MaxMin4.maxMin4(intArray20, (int) (short) 0, (int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray26 = ds.MaxMin4.maxMin4(intArray23, (int) (short) 1, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[0, 100, 35, 100, 32]");
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[100, 0]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[100, 0]");
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray20), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray23), "[100, 100]");
    }

    @Test
    public void test2056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2056");
        int[] intArray5 = new int[] { 0, (short) 100, '#', (byte) 100, ' ' };
        int[] intArray8 = ds.MaxMin4.maxMin4(intArray5, 1, (int) (byte) 0);
        int[] intArray11 = ds.MaxMin4.maxMin4(intArray5, (int) (short) 0, 1);
        int[] intArray14 = ds.MaxMin4.maxMin4(intArray5, 0, 1);
        int[] intArray17 = ds.MaxMin4.maxMin4(intArray5, 0, (int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray20 = ds.MaxMin4.maxMin4(intArray5, (int) ' ', (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[0, 100, 35, 100, 32]");
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[100, 0]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[100, 0]");
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[100, 0]");
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[0, 0]");
    }

    @Test
    public void test2057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2057");
        int[] intArray5 = new int[] { 0, (short) 100, '#', (byte) 100, ' ' };
        int[] intArray8 = ds.MaxMin4.maxMin4(intArray5, 1, (int) (byte) 0);
        int[] intArray11 = ds.MaxMin4.maxMin4(intArray5, (int) (short) 0, 1);
        int[] intArray14 = ds.MaxMin4.maxMin4(intArray5, 0, 1);
        int[] intArray17 = ds.MaxMin4.maxMin4(intArray14, (int) (byte) 1, (int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray20 = ds.MaxMin4.maxMin4(intArray17, (int) (byte) 0, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[0, 100, 35, 100, 32]");
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[100, 0]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[100, 0]");
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[100, 0]");
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[0, 0]");
    }

    @Test
    public void test2058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2058");
        int[] intArray5 = new int[] { 0, (short) 100, '#', (byte) 100, ' ' };
        int[] intArray8 = ds.MaxMin4.maxMin4(intArray5, 1, (int) (byte) 0);
        int[] intArray11 = ds.MaxMin4.maxMin4(intArray8, (int) (byte) 0, (int) (byte) 1);
        int[] intArray14 = ds.MaxMin4.maxMin4(intArray8, (int) (byte) 0, 1);
        int[] intArray17 = ds.MaxMin4.maxMin4(intArray8, (int) (byte) 1, (int) (short) 0);
        int[] intArray20 = ds.MaxMin4.maxMin4(intArray8, 0, (int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray23 = ds.MaxMin4.maxMin4(intArray20, (-1), (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[0, 100, 35, 100, 32]");
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[100, 0]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[100, 0]");
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[100, 0]");
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[100, 0]");
        org.junit.Assert.assertNotNull(intArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray20), "[100, 0]");
    }

    @Test
    public void test2059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2059");
        int[] intArray5 = new int[] { 0, (short) 100, '#', (byte) 100, ' ' };
        int[] intArray8 = ds.MaxMin4.maxMin4(intArray5, 1, (int) (byte) 0);
        int[] intArray11 = ds.MaxMin4.maxMin4(intArray8, (int) (byte) 0, (int) (byte) 1);
        int[] intArray14 = ds.MaxMin4.maxMin4(intArray8, (int) (byte) 0, 1);
        int[] intArray17 = ds.MaxMin4.maxMin4(intArray8, (int) (byte) 1, (int) (short) 0);
        int[] intArray20 = ds.MaxMin4.maxMin4(intArray17, (int) (short) 1, (int) (short) 1);
        int[] intArray23 = ds.MaxMin4.maxMin4(intArray20, 0, (int) (short) 1);
        int[] intArray26 = ds.MaxMin4.maxMin4(intArray23, (int) (short) 0, (int) (byte) 1);
        int[] intArray29 = ds.MaxMin4.maxMin4(intArray26, (int) (short) 0, (int) (byte) 0);
        java.lang.Class<?> wildcardClass30 = intArray29.getClass();
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[0, 100, 35, 100, 32]");
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[100, 0]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[100, 0]");
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[100, 0]");
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[100, 0]");
        org.junit.Assert.assertNotNull(intArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray20), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray23), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray26), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray29), "[0, 0]");
        org.junit.Assert.assertNotNull(wildcardClass30);
    }

    @Test
    public void test2060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2060");
        int[] intArray6 = new int[] { (byte) 1, (short) 1, ' ', (-1), (byte) 1, 'a' };
        int[] intArray9 = ds.MaxMin4.maxMin4(intArray6, 0, (int) (short) 1);
        int[] intArray12 = ds.MaxMin4.maxMin4(intArray9, (int) (short) 1, 0);
        int[] intArray15 = ds.MaxMin4.maxMin4(intArray12, 1, (int) (byte) 1);
        int[] intArray18 = ds.MaxMin4.maxMin4(intArray12, (int) (byte) 0, 1);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray21 = ds.MaxMin4.maxMin4(intArray12, (int) (short) 0, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[1, 1, 32, -1, 1, 97]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray18), "[1, 1]");
    }

    @Test
    public void test2061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2061");
        int[] intArray5 = new int[] { 0, (short) 100, '#', (byte) 100, ' ' };
        int[] intArray8 = ds.MaxMin4.maxMin4(intArray5, 1, (int) (byte) 0);
        int[] intArray11 = ds.MaxMin4.maxMin4(intArray5, (int) (short) 1, 0);
        int[] intArray14 = ds.MaxMin4.maxMin4(intArray11, 1, (int) (byte) 0);
        int[] intArray17 = ds.MaxMin4.maxMin4(intArray14, (int) (short) 1, 1);
        int[] intArray20 = ds.MaxMin4.maxMin4(intArray17, (int) (short) 1, (int) (short) 1);
        int[] intArray23 = ds.MaxMin4.maxMin4(intArray17, (int) (byte) 1, (int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray26 = ds.MaxMin4.maxMin4(intArray17, (int) (short) 10, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[0, 100, 35, 100, 32]");
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[100, 0]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[100, 0]");
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[100, 0]");
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray20), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray23), "[0, 0]");
    }

    @Test
    public void test2062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2062");
        int[] intArray0 = null;
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray3 = ds.MaxMin4.maxMin4(intArray0, (int) (short) 10, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2063");
        int[] intArray5 = new int[] { 0, (short) 100, '#', (byte) 100, ' ' };
        int[] intArray8 = ds.MaxMin4.maxMin4(intArray5, 1, (int) (byte) 0);
        int[] intArray11 = ds.MaxMin4.maxMin4(intArray8, (int) (byte) 0, (int) (byte) 1);
        int[] intArray14 = ds.MaxMin4.maxMin4(intArray8, (int) (byte) 0, 1);
        int[] intArray17 = ds.MaxMin4.maxMin4(intArray14, (int) (byte) 0, 1);
        int[] intArray20 = ds.MaxMin4.maxMin4(intArray17, (int) (byte) 1, 1);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray23 = ds.MaxMin4.maxMin4(intArray17, 0, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[0, 100, 35, 100, 32]");
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[100, 0]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[100, 0]");
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[100, 0]");
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[100, 0]");
        org.junit.Assert.assertNotNull(intArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray20), "[0, 0]");
    }

    @Test
    public void test2064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2064");
        int[] intArray5 = new int[] { 0, (short) 100, '#', (byte) 100, ' ' };
        int[] intArray8 = ds.MaxMin4.maxMin4(intArray5, 1, (int) (byte) 0);
        int[] intArray11 = ds.MaxMin4.maxMin4(intArray5, (int) (short) 1, 0);
        int[] intArray14 = ds.MaxMin4.maxMin4(intArray5, 0, 0);
        int[] intArray17 = ds.MaxMin4.maxMin4(intArray5, (int) (short) 0, 0);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray20 = ds.MaxMin4.maxMin4(intArray5, (int) '4', (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[0, 100, 35, 100, 32]");
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[100, 0]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[100, 0]");
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[0, 0]");
    }

    @Test
    public void test2065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2065");
        int[] intArray5 = new int[] { 0, (short) 100, '#', (byte) 100, ' ' };
        int[] intArray8 = ds.MaxMin4.maxMin4(intArray5, 1, (int) (byte) 0);
        int[] intArray11 = ds.MaxMin4.maxMin4(intArray8, (int) (byte) 0, (int) (byte) 1);
        int[] intArray14 = ds.MaxMin4.maxMin4(intArray11, (int) (short) 0, (int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray17 = ds.MaxMin4.maxMin4(intArray14, (int) '4', (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[0, 100, 35, 100, 32]");
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[100, 0]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[100, 0]");
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[100, 0]");
    }

    @Test
    public void test2066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2066");
        int[] intArray5 = new int[] { 0, (short) 100, '#', (byte) 100, ' ' };
        int[] intArray8 = ds.MaxMin4.maxMin4(intArray5, 1, (int) (byte) 0);
        int[] intArray11 = ds.MaxMin4.maxMin4(intArray5, 0, (int) (byte) 1);
        int[] intArray14 = ds.MaxMin4.maxMin4(intArray5, (int) (short) 1, 1);
        int[] intArray17 = ds.MaxMin4.maxMin4(intArray5, (int) (short) 0, (int) (byte) 0);
        int[] intArray20 = ds.MaxMin4.maxMin4(intArray17, (int) (short) 1, (int) (byte) 1);
        int[] intArray23 = ds.MaxMin4.maxMin4(intArray20, 0, (int) (short) 0);
        java.lang.Class<?> wildcardClass24 = intArray20.getClass();
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[0, 100, 35, 100, 32]");
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[100, 0]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[100, 0]");
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray20), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray23), "[0, 0]");
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test2067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2067");
        int[] intArray5 = new int[] { 0, (short) 100, '#', (byte) 100, ' ' };
        int[] intArray8 = ds.MaxMin4.maxMin4(intArray5, 1, (int) (byte) 0);
        int[] intArray11 = ds.MaxMin4.maxMin4(intArray8, (int) (byte) 0, (int) (byte) 1);
        int[] intArray14 = ds.MaxMin4.maxMin4(intArray8, (int) (byte) 0, 1);
        int[] intArray17 = ds.MaxMin4.maxMin4(intArray8, (int) (byte) 1, (int) (short) 0);
        int[] intArray20 = ds.MaxMin4.maxMin4(intArray17, (int) (short) 1, (int) (short) 1);
        int[] intArray23 = ds.MaxMin4.maxMin4(intArray20, 0, (int) (short) 1);
        int[] intArray26 = ds.MaxMin4.maxMin4(intArray23, (int) (short) 0, (int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray29 = ds.MaxMin4.maxMin4(intArray23, (int) '4', (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[0, 100, 35, 100, 32]");
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[100, 0]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[100, 0]");
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[100, 0]");
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[100, 0]");
        org.junit.Assert.assertNotNull(intArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray20), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray23), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray26), "[0, 0]");
    }

    @Test
    public void test2068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2068");
        int[] intArray5 = new int[] { 0, (short) 100, '#', (byte) 100, ' ' };
        int[] intArray8 = ds.MaxMin4.maxMin4(intArray5, 1, (int) (byte) 0);
        int[] intArray11 = ds.MaxMin4.maxMin4(intArray5, 0, (int) (byte) 1);
        int[] intArray14 = ds.MaxMin4.maxMin4(intArray5, (int) (short) 1, 1);
        int[] intArray17 = ds.MaxMin4.maxMin4(intArray14, 0, (int) (short) 1);
        int[] intArray20 = ds.MaxMin4.maxMin4(intArray14, 0, (int) (short) 0);
        int[] intArray23 = ds.MaxMin4.maxMin4(intArray14, 0, (int) (byte) 0);
        java.lang.Class<?> wildcardClass24 = intArray23.getClass();
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[0, 100, 35, 100, 32]");
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[100, 0]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[100, 0]");
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray20), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray23), "[100, 100]");
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test2069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2069");
        int[] intArray5 = new int[] { 0, (short) 100, '#', (byte) 100, ' ' };
        int[] intArray8 = ds.MaxMin4.maxMin4(intArray5, 1, (int) (byte) 0);
        int[] intArray11 = ds.MaxMin4.maxMin4(intArray8, (int) (byte) 0, (int) (byte) 1);
        int[] intArray14 = ds.MaxMin4.maxMin4(intArray8, (int) (byte) 0, 1);
        int[] intArray17 = ds.MaxMin4.maxMin4(intArray14, (int) (byte) 0, 1);
        int[] intArray20 = ds.MaxMin4.maxMin4(intArray17, 0, 1);
        int[] intArray23 = ds.MaxMin4.maxMin4(intArray17, 1, (int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray26 = ds.MaxMin4.maxMin4(intArray23, (int) (short) -1, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[0, 100, 35, 100, 32]");
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[100, 0]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[100, 0]");
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[100, 0]");
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[100, 0]");
        org.junit.Assert.assertNotNull(intArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray20), "[100, 0]");
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray23), "[0, 0]");
    }

    @Test
    public void test2070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2070");
        int[] intArray0 = null;
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray3 = ds.MaxMin4.maxMin4(intArray0, 0, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2071");
        int[] intArray5 = new int[] { 0, (short) 100, '#', (byte) 100, ' ' };
        int[] intArray8 = ds.MaxMin4.maxMin4(intArray5, 1, (int) (byte) 0);
        int[] intArray11 = ds.MaxMin4.maxMin4(intArray5, (int) (short) 0, 1);
        int[] intArray14 = ds.MaxMin4.maxMin4(intArray5, 0, 1);
        int[] intArray17 = ds.MaxMin4.maxMin4(intArray14, (int) (short) 1, (int) (short) 0);
        int[] intArray20 = ds.MaxMin4.maxMin4(intArray17, (int) (short) 1, 1);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray23 = ds.MaxMin4.maxMin4(intArray20, 100, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[0, 100, 35, 100, 32]");
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[100, 0]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[100, 0]");
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[100, 0]");
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[100, 0]");
        org.junit.Assert.assertNotNull(intArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray20), "[0, 0]");
    }

    @Test
    public void test2072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2072");
        int[] intArray2 = new int[] { 100, '4' };
        int[] intArray5 = ds.MaxMin4.maxMin4(intArray2, (int) (short) 1, 1);
        int[] intArray8 = ds.MaxMin4.maxMin4(intArray5, (int) (short) 0, 0);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray11 = ds.MaxMin4.maxMin4(intArray8, (int) '4', (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[100, 52]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[52, 52]");
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[52, 52]");
    }

    @Test
    public void test2073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2073");
        int[] intArray5 = new int[] { 0, (short) 100, '#', (byte) 100, ' ' };
        int[] intArray8 = ds.MaxMin4.maxMin4(intArray5, 1, (int) (byte) 0);
        int[] intArray11 = ds.MaxMin4.maxMin4(intArray5, (int) (short) 1, 0);
        int[] intArray14 = ds.MaxMin4.maxMin4(intArray11, 1, (int) (byte) 0);
        int[] intArray17 = ds.MaxMin4.maxMin4(intArray11, (int) (byte) 0, (int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray20 = ds.MaxMin4.maxMin4(intArray11, 10, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[0, 100, 35, 100, 32]");
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[100, 0]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[100, 0]");
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[100, 0]");
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[100, 0]");
    }

    @Test
    public void test2074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2074");
        int[] intArray5 = new int[] { 0, (short) 100, '#', (byte) 100, ' ' };
        int[] intArray8 = ds.MaxMin4.maxMin4(intArray5, 1, (int) (byte) 0);
        int[] intArray11 = ds.MaxMin4.maxMin4(intArray5, (int) (short) 1, 0);
        int[] intArray14 = ds.MaxMin4.maxMin4(intArray5, 0, 0);
        int[] intArray17 = ds.MaxMin4.maxMin4(intArray5, (int) (short) 0, 0);
        int[] intArray20 = ds.MaxMin4.maxMin4(intArray17, (int) (short) 0, (int) (byte) 1);
        int[] intArray23 = ds.MaxMin4.maxMin4(intArray17, 0, 1);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray26 = ds.MaxMin4.maxMin4(intArray17, 0, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[0, 100, 35, 100, 32]");
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[100, 0]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[100, 0]");
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray20), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray23), "[0, 0]");
    }

    @Test
    public void test2075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2075");
        int[] intArray5 = new int[] { 0, (short) 100, '#', (byte) 100, ' ' };
        int[] intArray8 = ds.MaxMin4.maxMin4(intArray5, 1, (int) (byte) 0);
        int[] intArray11 = ds.MaxMin4.maxMin4(intArray8, 0, (int) (short) 1);
        int[] intArray14 = ds.MaxMin4.maxMin4(intArray8, 0, (int) (short) 1);
        int[] intArray17 = ds.MaxMin4.maxMin4(intArray14, 0, 1);
        int[] intArray20 = ds.MaxMin4.maxMin4(intArray17, (int) (byte) 1, (int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray23 = ds.MaxMin4.maxMin4(intArray17, (int) (short) 100, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[0, 100, 35, 100, 32]");
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[100, 0]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[100, 0]");
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[100, 0]");
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[100, 0]");
        org.junit.Assert.assertNotNull(intArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray20), "[0, 0]");
    }

    @Test
    public void test2076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2076");
        int[] intArray5 = new int[] { 0, (short) 100, '#', (byte) 100, ' ' };
        int[] intArray8 = ds.MaxMin4.maxMin4(intArray5, 1, (int) (byte) 0);
        int[] intArray11 = ds.MaxMin4.maxMin4(intArray5, (int) (short) 1, 0);
        int[] intArray14 = ds.MaxMin4.maxMin4(intArray5, 0, 0);
        int[] intArray17 = ds.MaxMin4.maxMin4(intArray5, (int) (short) 0, 0);
        int[] intArray20 = ds.MaxMin4.maxMin4(intArray17, (int) (short) 0, (int) (byte) 1);
        int[] intArray23 = ds.MaxMin4.maxMin4(intArray17, 0, 1);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray26 = ds.MaxMin4.maxMin4(intArray23, (int) (byte) 0, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[0, 100, 35, 100, 32]");
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[100, 0]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[100, 0]");
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray20), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray23), "[0, 0]");
    }

    @Test
    public void test2077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2077");
        int[] intArray5 = new int[] { 0, (short) 100, '#', (byte) 100, ' ' };
        int[] intArray8 = ds.MaxMin4.maxMin4(intArray5, 1, (int) (byte) 0);
        int[] intArray11 = ds.MaxMin4.maxMin4(intArray5, (int) (short) 0, 1);
        int[] intArray14 = ds.MaxMin4.maxMin4(intArray5, 0, 1);
        int[] intArray17 = ds.MaxMin4.maxMin4(intArray14, (int) (short) 0, 1);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray20 = ds.MaxMin4.maxMin4(intArray17, (int) 'a', (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[0, 100, 35, 100, 32]");
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[100, 0]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[100, 0]");
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[100, 0]");
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[100, 0]");
    }

    @Test
    public void test2078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2078");
        int[] intArray5 = new int[] { 0, (short) 100, '#', (byte) 100, ' ' };
        int[] intArray8 = ds.MaxMin4.maxMin4(intArray5, 1, (int) (byte) 0);
        int[] intArray11 = ds.MaxMin4.maxMin4(intArray8, (int) (byte) 0, (int) (byte) 1);
        int[] intArray14 = ds.MaxMin4.maxMin4(intArray8, (int) (byte) 0, 1);
        int[] intArray17 = ds.MaxMin4.maxMin4(intArray8, 0, (int) (byte) 1);
        int[] intArray20 = ds.MaxMin4.maxMin4(intArray17, 0, (int) (byte) 1);
        java.lang.Class<?> wildcardClass21 = intArray17.getClass();
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[0, 100, 35, 100, 32]");
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[100, 0]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[100, 0]");
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[100, 0]");
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[100, 0]");
        org.junit.Assert.assertNotNull(intArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray20), "[100, 0]");
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test2079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2079");
        int[] intArray5 = new int[] { 0, (short) 100, '#', (byte) 100, ' ' };
        int[] intArray8 = ds.MaxMin4.maxMin4(intArray5, 1, (int) (byte) 0);
        int[] intArray11 = ds.MaxMin4.maxMin4(intArray5, (int) (short) 1, 0);
        int[] intArray14 = ds.MaxMin4.maxMin4(intArray11, 1, (int) (byte) 0);
        int[] intArray17 = ds.MaxMin4.maxMin4(intArray11, (int) (short) 1, (int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray20 = ds.MaxMin4.maxMin4(intArray17, (int) ' ', (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[0, 100, 35, 100, 32]");
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[100, 0]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[100, 0]");
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[100, 0]");
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[100, 0]");
    }

    @Test
    public void test2080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2080");
        int[] intArray5 = new int[] { 0, (short) 100, '#', (byte) 100, ' ' };
        int[] intArray8 = ds.MaxMin4.maxMin4(intArray5, 1, (int) (byte) 0);
        int[] intArray11 = ds.MaxMin4.maxMin4(intArray5, (int) (short) 1, 0);
        int[] intArray14 = ds.MaxMin4.maxMin4(intArray5, 0, 0);
        int[] intArray17 = ds.MaxMin4.maxMin4(intArray14, 1, 0);
        int[] intArray20 = ds.MaxMin4.maxMin4(intArray17, 0, 0);
        int[] intArray23 = ds.MaxMin4.maxMin4(intArray20, (int) (short) 1, 0);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray26 = ds.MaxMin4.maxMin4(intArray20, 0, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[0, 100, 35, 100, 32]");
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[100, 0]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[100, 0]");
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray20), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray23), "[0, 0]");
    }

    @Test
    public void test2081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2081");
        int[] intArray5 = new int[] { 0, (short) 100, '#', (byte) 100, ' ' };
        int[] intArray8 = ds.MaxMin4.maxMin4(intArray5, 1, (int) (byte) 0);
        int[] intArray11 = ds.MaxMin4.maxMin4(intArray5, (int) (short) 1, 0);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray14 = ds.MaxMin4.maxMin4(intArray5, 1, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[0, 100, 35, 100, 32]");
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[100, 0]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[100, 0]");
    }

    @Test
    public void test2082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2082");
        int[] intArray2 = new int[] { 100, '4' };
        int[] intArray5 = ds.MaxMin4.maxMin4(intArray2, (int) (short) 1, 1);
        int[] intArray8 = ds.MaxMin4.maxMin4(intArray5, (int) (short) 0, 0);
        int[] intArray11 = ds.MaxMin4.maxMin4(intArray8, (int) (short) 1, 0);
        java.lang.Class<?> wildcardClass12 = intArray11.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[100, 52]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[52, 52]");
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[52, 52]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[52, 52]");
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test2083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2083");
        int[] intArray5 = new int[] { 0, (short) 100, '#', (byte) 100, ' ' };
        int[] intArray8 = ds.MaxMin4.maxMin4(intArray5, 1, (int) (byte) 0);
        int[] intArray11 = ds.MaxMin4.maxMin4(intArray5, (int) (short) 1, 0);
        int[] intArray14 = ds.MaxMin4.maxMin4(intArray11, 1, (int) (byte) 0);
        int[] intArray17 = ds.MaxMin4.maxMin4(intArray11, (int) (byte) 0, (int) (byte) 1);
        int[] intArray20 = ds.MaxMin4.maxMin4(intArray17, (int) (short) 1, 0);
        int[] intArray23 = ds.MaxMin4.maxMin4(intArray20, (int) (short) 1, (int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray26 = ds.MaxMin4.maxMin4(intArray20, 0, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[0, 100, 35, 100, 32]");
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[100, 0]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[100, 0]");
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[100, 0]");
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[100, 0]");
        org.junit.Assert.assertNotNull(intArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray20), "[100, 0]");
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray23), "[100, 0]");
    }

    @Test
    public void test2084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2084");
        int[] intArray5 = new int[] { 0, (short) 100, '#', (byte) 100, ' ' };
        int[] intArray8 = ds.MaxMin4.maxMin4(intArray5, 1, (int) (byte) 0);
        int[] intArray11 = ds.MaxMin4.maxMin4(intArray8, (int) (byte) 0, (int) (byte) 1);
        int[] intArray14 = ds.MaxMin4.maxMin4(intArray11, (int) (short) 0, (int) (short) 1);
        int[] intArray17 = ds.MaxMin4.maxMin4(intArray14, 0, (int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray20 = ds.MaxMin4.maxMin4(intArray14, (int) (byte) 10, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[0, 100, 35, 100, 32]");
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[100, 0]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[100, 0]");
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[100, 0]");
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[100, 100]");
    }

    @Test
    public void test2085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2085");
        int[] intArray5 = new int[] { 0, (short) 100, '#', (byte) 100, ' ' };
        int[] intArray8 = ds.MaxMin4.maxMin4(intArray5, 1, (int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray11 = ds.MaxMin4.maxMin4(intArray8, (int) (short) 0, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[0, 100, 35, 100, 32]");
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[100, 0]");
    }

    @Test
    public void test2086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2086");
        int[] intArray5 = new int[] { 0, (short) 100, '#', (byte) 100, ' ' };
        int[] intArray8 = ds.MaxMin4.maxMin4(intArray5, 1, (int) (byte) 0);
        int[] intArray11 = ds.MaxMin4.maxMin4(intArray8, 0, (int) (short) 1);
        int[] intArray14 = ds.MaxMin4.maxMin4(intArray11, (int) (byte) 1, 0);
        int[] intArray17 = ds.MaxMin4.maxMin4(intArray11, (int) (short) 1, 1);
        int[] intArray20 = ds.MaxMin4.maxMin4(intArray17, (int) (byte) 0, 0);
        int[] intArray23 = ds.MaxMin4.maxMin4(intArray20, (int) (byte) 0, (int) (short) 1);
        int[] intArray26 = ds.MaxMin4.maxMin4(intArray20, 0, (int) (byte) 1);
        java.lang.Class<?> wildcardClass27 = intArray26.getClass();
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[0, 100, 35, 100, 32]");
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[100, 0]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[100, 0]");
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[100, 0]");
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray20), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray23), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray26), "[0, 0]");
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test2087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2087");
        int[] intArray5 = new int[] { 0, (short) 100, '#', (byte) 100, ' ' };
        int[] intArray8 = ds.MaxMin4.maxMin4(intArray5, 1, (int) (byte) 0);
        int[] intArray11 = ds.MaxMin4.maxMin4(intArray5, 0, (int) (byte) 1);
        int[] intArray14 = ds.MaxMin4.maxMin4(intArray5, (int) (short) 1, 1);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray17 = ds.MaxMin4.maxMin4(intArray5, (int) (short) 100, (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[0, 100, 35, 100, 32]");
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[100, 0]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[100, 0]");
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[100, 100]");
    }

    @Test
    public void test2088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2088");
        int[] intArray5 = new int[] { '4', 10, (byte) 1, 100, (short) 0 };
        int[] intArray8 = ds.MaxMin4.maxMin4(intArray5, (int) (byte) 1, 1);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray11 = ds.MaxMin4.maxMin4(intArray8, 10, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[52, 10, 1, 100, 0]");
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[10, 10]");
    }

    @Test
    public void test2089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2089");
        int[] intArray5 = new int[] { 0, (short) 100, '#', (byte) 100, ' ' };
        int[] intArray8 = ds.MaxMin4.maxMin4(intArray5, 1, (int) (byte) 0);
        int[] intArray11 = ds.MaxMin4.maxMin4(intArray8, (int) (byte) 0, (int) (byte) 1);
        int[] intArray14 = ds.MaxMin4.maxMin4(intArray8, (int) (byte) 0, 1);
        int[] intArray17 = ds.MaxMin4.maxMin4(intArray14, (int) (byte) 0, 1);
        int[] intArray20 = ds.MaxMin4.maxMin4(intArray17, 0, 1);
        int[] intArray23 = ds.MaxMin4.maxMin4(intArray20, (int) (byte) 0, (int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray26 = ds.MaxMin4.maxMin4(intArray20, (int) (byte) 0, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[0, 100, 35, 100, 32]");
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[100, 0]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[100, 0]");
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[100, 0]");
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[100, 0]");
        org.junit.Assert.assertNotNull(intArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray20), "[100, 0]");
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray23), "[100, 100]");
    }

    @Test
    public void test2090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2090");
        int[] intArray5 = new int[] { 0, (short) 100, '#', (byte) 100, ' ' };
        int[] intArray8 = ds.MaxMin4.maxMin4(intArray5, 1, (int) (byte) 0);
        int[] intArray11 = ds.MaxMin4.maxMin4(intArray5, (int) (short) 1, 0);
        int[] intArray14 = ds.MaxMin4.maxMin4(intArray11, 1, (int) (byte) 0);
        int[] intArray17 = ds.MaxMin4.maxMin4(intArray14, (int) (short) 1, 1);
        int[] intArray20 = ds.MaxMin4.maxMin4(intArray14, 0, 0);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray23 = ds.MaxMin4.maxMin4(intArray14, (int) (short) 100, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[0, 100, 35, 100, 32]");
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[100, 0]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[100, 0]");
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[100, 0]");
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray20), "[100, 100]");
    }

    @Test
    public void test2091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2091");
        int[] intArray5 = new int[] { 0, (short) 100, '#', (byte) 100, ' ' };
        int[] intArray8 = ds.MaxMin4.maxMin4(intArray5, 1, (int) (byte) 0);
        int[] intArray11 = ds.MaxMin4.maxMin4(intArray8, (int) (byte) 0, (int) (byte) 1);
        int[] intArray14 = ds.MaxMin4.maxMin4(intArray8, (int) (byte) 0, 1);
        int[] intArray17 = ds.MaxMin4.maxMin4(intArray14, (int) (byte) 0, 1);
        int[] intArray20 = ds.MaxMin4.maxMin4(intArray17, 0, 1);
        int[] intArray23 = ds.MaxMin4.maxMin4(intArray17, 0, (int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray26 = ds.MaxMin4.maxMin4(intArray17, (int) ' ', (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[0, 100, 35, 100, 32]");
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[100, 0]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[100, 0]");
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[100, 0]");
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[100, 0]");
        org.junit.Assert.assertNotNull(intArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray20), "[100, 0]");
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray23), "[100, 0]");
    }

    @Test
    public void test2092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2092");
        int[] intArray6 = new int[] { 0, (byte) -1, (short) 0, (byte) 1, (short) 100, 100 };
        int[] intArray9 = ds.MaxMin4.maxMin4(intArray6, (int) (byte) 0, (int) (short) 0);
        int[] intArray12 = ds.MaxMin4.maxMin4(intArray9, 0, (int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray15 = ds.MaxMin4.maxMin4(intArray12, (int) (byte) 1, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[0, -1, 0, 1, 100, 100]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[0, 0]");
    }

    @Test
    public void test2093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2093");
        int[] intArray5 = new int[] { 0, (short) 100, '#', (byte) 100, ' ' };
        int[] intArray8 = ds.MaxMin4.maxMin4(intArray5, 1, (int) (byte) 0);
        int[] intArray11 = ds.MaxMin4.maxMin4(intArray8, (int) (byte) 0, (int) (byte) 1);
        int[] intArray14 = ds.MaxMin4.maxMin4(intArray11, (int) (byte) 1, 0);
        int[] intArray17 = ds.MaxMin4.maxMin4(intArray11, (int) (short) 0, 0);
        int[] intArray20 = ds.MaxMin4.maxMin4(intArray17, (int) (short) 1, (int) (byte) 1);
        int[] intArray23 = ds.MaxMin4.maxMin4(intArray17, (int) (byte) 1, 1);
        java.lang.Class<?> wildcardClass24 = intArray17.getClass();
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[0, 100, 35, 100, 32]");
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[100, 0]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[100, 0]");
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[100, 0]");
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray20), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray23), "[100, 100]");
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test2094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2094");
        int[] intArray5 = new int[] { 0, (short) 100, '#', (byte) 100, ' ' };
        int[] intArray8 = ds.MaxMin4.maxMin4(intArray5, 1, (int) (byte) 0);
        int[] intArray11 = ds.MaxMin4.maxMin4(intArray5, (int) (short) 0, 1);
        int[] intArray14 = ds.MaxMin4.maxMin4(intArray5, 0, 1);
        int[] intArray17 = ds.MaxMin4.maxMin4(intArray5, 0, (int) (byte) 0);
        int[] intArray20 = ds.MaxMin4.maxMin4(intArray17, (int) (byte) 0, (int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray23 = ds.MaxMin4.maxMin4(intArray20, (int) (short) 10, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[0, 100, 35, 100, 32]");
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[100, 0]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[100, 0]");
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[100, 0]");
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray20), "[0, 0]");
    }

    @Test
    public void test2095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2095");
        int[] intArray5 = new int[] { 0, (short) 100, '#', (byte) 100, ' ' };
        int[] intArray8 = ds.MaxMin4.maxMin4(intArray5, 1, (int) (byte) 0);
        int[] intArray11 = ds.MaxMin4.maxMin4(intArray5, (int) (short) 1, 0);
        int[] intArray14 = ds.MaxMin4.maxMin4(intArray11, 1, (int) (byte) 0);
        int[] intArray17 = ds.MaxMin4.maxMin4(intArray14, (int) (short) 1, 1);
        int[] intArray20 = ds.MaxMin4.maxMin4(intArray17, (int) (short) 1, (int) (short) 1);
        int[] intArray23 = ds.MaxMin4.maxMin4(intArray17, (int) (byte) 1, (int) (byte) 0);
        java.lang.Class<?> wildcardClass24 = intArray17.getClass();
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[0, 100, 35, 100, 32]");
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[100, 0]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[100, 0]");
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[100, 0]");
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray20), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray23), "[0, 0]");
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test2096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2096");
        int[] intArray5 = new int[] { 0, (short) 100, '#', (byte) 100, ' ' };
        int[] intArray8 = ds.MaxMin4.maxMin4(intArray5, 1, (int) (byte) 0);
        int[] intArray11 = ds.MaxMin4.maxMin4(intArray8, 0, (int) (short) 1);
        int[] intArray14 = ds.MaxMin4.maxMin4(intArray8, 0, (int) (short) 1);
        int[] intArray17 = ds.MaxMin4.maxMin4(intArray14, (int) (byte) 0, (int) (short) 1);
        int[] intArray20 = ds.MaxMin4.maxMin4(intArray17, 1, (int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray23 = ds.MaxMin4.maxMin4(intArray20, (int) (short) 10, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[0, 100, 35, 100, 32]");
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[100, 0]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[100, 0]");
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[100, 0]");
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[100, 0]");
        org.junit.Assert.assertNotNull(intArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray20), "[100, 0]");
    }

    @Test
    public void test2097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2097");
        int[] intArray5 = new int[] { '4', 10, (byte) 1, 100, (short) 0 };
        int[] intArray8 = ds.MaxMin4.maxMin4(intArray5, (int) (byte) 1, 1);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray11 = ds.MaxMin4.maxMin4(intArray8, (int) (byte) -1, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[52, 10, 1, 100, 0]");
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[10, 10]");
    }

    @Test
    public void test2098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2098");
        int[] intArray5 = new int[] { 0, (short) 100, '#', (byte) 100, ' ' };
        int[] intArray8 = ds.MaxMin4.maxMin4(intArray5, 1, (int) (byte) 0);
        int[] intArray11 = ds.MaxMin4.maxMin4(intArray5, (int) (short) 1, 0);
        int[] intArray14 = ds.MaxMin4.maxMin4(intArray5, 0, 0);
        int[] intArray17 = ds.MaxMin4.maxMin4(intArray5, 0, 0);
        int[] intArray20 = ds.MaxMin4.maxMin4(intArray5, (int) (short) 1, 0);
        int[] intArray23 = ds.MaxMin4.maxMin4(intArray20, (int) (byte) 0, (int) (short) 0);
        int[] intArray26 = ds.MaxMin4.maxMin4(intArray20, 1, 0);
        int[] intArray29 = ds.MaxMin4.maxMin4(intArray26, (int) (short) 0, 0);
        java.lang.Class<?> wildcardClass30 = intArray29.getClass();
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[0, 100, 35, 100, 32]");
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[100, 0]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[100, 0]");
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray20), "[100, 0]");
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray23), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray26), "[100, 0]");
        org.junit.Assert.assertNotNull(intArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray29), "[100, 100]");
        org.junit.Assert.assertNotNull(wildcardClass30);
    }

    @Test
    public void test2099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2099");
        int[] intArray5 = new int[] { 0, (short) 100, '#', (byte) 100, ' ' };
        int[] intArray8 = ds.MaxMin4.maxMin4(intArray5, 1, (int) (byte) 0);
        int[] intArray11 = ds.MaxMin4.maxMin4(intArray5, (int) (short) 1, 0);
        int[] intArray14 = ds.MaxMin4.maxMin4(intArray5, 0, 0);
        int[] intArray17 = ds.MaxMin4.maxMin4(intArray5, (int) (byte) 1, 0);
        int[] intArray20 = ds.MaxMin4.maxMin4(intArray5, 0, 1);
        int[] intArray23 = ds.MaxMin4.maxMin4(intArray20, (int) (byte) 0, (int) (short) 0);
        int[] intArray26 = ds.MaxMin4.maxMin4(intArray23, (int) (short) 1, 0);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray29 = ds.MaxMin4.maxMin4(intArray23, 10, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[0, 100, 35, 100, 32]");
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[100, 0]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[100, 0]");
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[100, 0]");
        org.junit.Assert.assertNotNull(intArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray20), "[100, 0]");
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray23), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray26), "[100, 100]");
    }

    @Test
    public void test2100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2100");
        int[] intArray5 = new int[] { 0, (short) 100, '#', (byte) 100, ' ' };
        int[] intArray8 = ds.MaxMin4.maxMin4(intArray5, 1, (int) (byte) 0);
        int[] intArray11 = ds.MaxMin4.maxMin4(intArray8, 0, (int) (short) 1);
        int[] intArray14 = ds.MaxMin4.maxMin4(intArray8, 0, (int) (short) 1);
        int[] intArray17 = ds.MaxMin4.maxMin4(intArray8, 0, 0);
        int[] intArray20 = ds.MaxMin4.maxMin4(intArray8, (int) (short) 0, (int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray23 = ds.MaxMin4.maxMin4(intArray20, (int) (short) 10, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[0, 100, 35, 100, 32]");
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[100, 0]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[100, 0]");
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[100, 0]");
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray20), "[100, 100]");
    }

    @Test
    public void test2101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2101");
        int[] intArray5 = new int[] { 0, (short) 100, '#', (byte) 100, ' ' };
        int[] intArray8 = ds.MaxMin4.maxMin4(intArray5, 1, (int) (byte) 0);
        int[] intArray11 = ds.MaxMin4.maxMin4(intArray5, (int) (short) 1, 0);
        int[] intArray14 = ds.MaxMin4.maxMin4(intArray5, 0, 0);
        int[] intArray17 = ds.MaxMin4.maxMin4(intArray5, 0, 0);
        int[] intArray20 = ds.MaxMin4.maxMin4(intArray5, (int) (short) 1, 0);
        int[] intArray23 = ds.MaxMin4.maxMin4(intArray20, (int) (byte) 0, (int) (short) 0);
        int[] intArray26 = ds.MaxMin4.maxMin4(intArray20, 1, 0);
        int[] intArray29 = ds.MaxMin4.maxMin4(intArray26, (int) (short) 1, 0);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray32 = ds.MaxMin4.maxMin4(intArray26, (int) (byte) 100, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[0, 100, 35, 100, 32]");
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[100, 0]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[100, 0]");
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray20), "[100, 0]");
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray23), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray26), "[100, 0]");
        org.junit.Assert.assertNotNull(intArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray29), "[100, 0]");
    }

    @Test
    public void test2102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2102");
        int[] intArray5 = new int[] { 0, (short) 100, '#', (byte) 100, ' ' };
        int[] intArray8 = ds.MaxMin4.maxMin4(intArray5, 1, (int) (byte) 0);
        int[] intArray11 = ds.MaxMin4.maxMin4(intArray5, (int) (short) 0, 1);
        int[] intArray14 = ds.MaxMin4.maxMin4(intArray5, 0, 1);
        int[] intArray17 = ds.MaxMin4.maxMin4(intArray14, (int) (short) 0, 1);
        int[] intArray20 = ds.MaxMin4.maxMin4(intArray14, (int) (short) 0, (int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray23 = ds.MaxMin4.maxMin4(intArray20, (int) (short) -1, (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[0, 100, 35, 100, 32]");
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[100, 0]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[100, 0]");
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[100, 0]");
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[100, 0]");
        org.junit.Assert.assertNotNull(intArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray20), "[100, 0]");
    }

    @Test
    public void test2103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2103");
        int[] intArray5 = new int[] { 0, (short) 100, '#', (byte) 100, ' ' };
        int[] intArray8 = ds.MaxMin4.maxMin4(intArray5, 1, (int) (byte) 0);
        int[] intArray11 = ds.MaxMin4.maxMin4(intArray8, (int) (byte) 0, (int) (byte) 1);
        int[] intArray14 = ds.MaxMin4.maxMin4(intArray11, (int) (byte) 1, 0);
        int[] intArray17 = ds.MaxMin4.maxMin4(intArray11, (int) (short) 0, 0);
        int[] intArray20 = ds.MaxMin4.maxMin4(intArray17, (int) (short) 1, (int) (byte) 1);
        int[] intArray23 = ds.MaxMin4.maxMin4(intArray17, (int) (byte) 1, 1);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray26 = ds.MaxMin4.maxMin4(intArray17, (int) ' ', (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[0, 100, 35, 100, 32]");
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[100, 0]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[100, 0]");
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[100, 0]");
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray20), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray23), "[100, 100]");
    }

    @Test
    public void test2104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2104");
        int[] intArray6 = new int[] { (byte) 1, (short) 1, ' ', (-1), (byte) 1, 'a' };
        int[] intArray9 = ds.MaxMin4.maxMin4(intArray6, 0, (int) (short) 1);
        int[] intArray12 = ds.MaxMin4.maxMin4(intArray9, (int) (short) 1, 0);
        int[] intArray15 = ds.MaxMin4.maxMin4(intArray12, 1, (int) (byte) 1);
        int[] intArray18 = ds.MaxMin4.maxMin4(intArray12, (int) (byte) 0, 1);
        int[] intArray21 = ds.MaxMin4.maxMin4(intArray12, 0, 0);
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[1, 1, 32, -1, 1, 97]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[1, 1]");
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
    public void test2105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2105");
        int[] intArray5 = new int[] { 0, (short) 100, '#', (byte) 100, ' ' };
        int[] intArray8 = ds.MaxMin4.maxMin4(intArray5, 1, (int) (byte) 0);
        int[] intArray11 = ds.MaxMin4.maxMin4(intArray8, 0, (int) (short) 1);
        int[] intArray14 = ds.MaxMin4.maxMin4(intArray8, 0, (int) (short) 1);
        int[] intArray17 = ds.MaxMin4.maxMin4(intArray14, 0, 1);
        int[] intArray20 = ds.MaxMin4.maxMin4(intArray14, 0, (int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray23 = ds.MaxMin4.maxMin4(intArray14, 100, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[0, 100, 35, 100, 32]");
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[100, 0]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[100, 0]");
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[100, 0]");
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[100, 0]");
        org.junit.Assert.assertNotNull(intArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray20), "[100, 100]");
    }

    @Test
    public void test2106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2106");
        int[] intArray5 = new int[] { 0, (short) 100, '#', (byte) 100, ' ' };
        int[] intArray8 = ds.MaxMin4.maxMin4(intArray5, 1, (int) (byte) 0);
        int[] intArray11 = ds.MaxMin4.maxMin4(intArray8, (int) (byte) 0, (int) (byte) 1);
        int[] intArray14 = ds.MaxMin4.maxMin4(intArray8, (int) (byte) 0, 1);
        int[] intArray17 = ds.MaxMin4.maxMin4(intArray8, (int) (byte) 1, (int) (short) 0);
        int[] intArray20 = ds.MaxMin4.maxMin4(intArray17, (int) (byte) 0, (int) (short) 0);
        int[] intArray23 = ds.MaxMin4.maxMin4(intArray20, 1, 0);
        int[] intArray26 = ds.MaxMin4.maxMin4(intArray20, (int) (byte) 1, 0);
        java.lang.Class<?> wildcardClass27 = intArray26.getClass();
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[0, 100, 35, 100, 32]");
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[100, 0]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[100, 0]");
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[100, 0]");
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[100, 0]");
        org.junit.Assert.assertNotNull(intArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray20), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray23), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray26), "[100, 100]");
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test2107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2107");
        int[] intArray6 = new int[] { (byte) 1, (short) 1, ' ', (-1), (byte) 1, 'a' };
        int[] intArray9 = ds.MaxMin4.maxMin4(intArray6, 0, (int) (short) 1);
        int[] intArray12 = ds.MaxMin4.maxMin4(intArray9, (int) (byte) 0, 0);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray15 = ds.MaxMin4.maxMin4(intArray9, (int) 'a', (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[1, 1, 32, -1, 1, 97]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[1, 1]");
    }

    @Test
    public void test2108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2108");
        int[] intArray5 = new int[] { 0, (short) 100, '#', (byte) 100, ' ' };
        int[] intArray8 = ds.MaxMin4.maxMin4(intArray5, 1, (int) (byte) 0);
        int[] intArray11 = ds.MaxMin4.maxMin4(intArray5, 0, (int) (byte) 1);
        int[] intArray14 = ds.MaxMin4.maxMin4(intArray5, (int) (short) 1, 1);
        int[] intArray17 = ds.MaxMin4.maxMin4(intArray5, 0, (int) (short) 1);
        int[] intArray20 = ds.MaxMin4.maxMin4(intArray17, (int) (byte) 1, 1);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray23 = ds.MaxMin4.maxMin4(intArray20, (int) (short) 10, 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[0, 100, 35, 100, 32]");
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[100, 0]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[100, 0]");
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[100, 0]");
        org.junit.Assert.assertNotNull(intArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray20), "[0, 0]");
    }

    @Test
    public void test2109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2109");
        int[] intArray5 = new int[] { 0, (short) 100, '#', (byte) 100, ' ' };
        int[] intArray8 = ds.MaxMin4.maxMin4(intArray5, 1, (int) (byte) 0);
        int[] intArray11 = ds.MaxMin4.maxMin4(intArray5, (int) (short) 1, 0);
        int[] intArray14 = ds.MaxMin4.maxMin4(intArray11, 1, (int) (byte) 0);
        int[] intArray17 = ds.MaxMin4.maxMin4(intArray11, (int) (short) 1, (int) (short) 0);
        int[] intArray20 = ds.MaxMin4.maxMin4(intArray17, (int) (byte) 0, 0);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray23 = ds.MaxMin4.maxMin4(intArray17, (int) '4', 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[0, 100, 35, 100, 32]");
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[100, 0]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[100, 0]");
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[100, 0]");
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[100, 0]");
        org.junit.Assert.assertNotNull(intArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray20), "[100, 100]");
    }

    @Test
    public void test2110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2110");
        int[] intArray5 = new int[] { 0, (short) 100, '#', (byte) 100, ' ' };
        int[] intArray8 = ds.MaxMin4.maxMin4(intArray5, 1, (int) (byte) 0);
        int[] intArray11 = ds.MaxMin4.maxMin4(intArray5, 0, (int) (byte) 1);
        int[] intArray14 = ds.MaxMin4.maxMin4(intArray5, (int) (short) 1, 1);
        int[] intArray17 = ds.MaxMin4.maxMin4(intArray14, (int) (byte) 0, (int) (byte) 0);
        int[] intArray20 = ds.MaxMin4.maxMin4(intArray17, (int) (short) 1, (int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray23 = ds.MaxMin4.maxMin4(intArray20, (int) (short) 0, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[0, 100, 35, 100, 32]");
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[100, 0]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[100, 0]");
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray20), "[100, 100]");
    }

    @Test
    public void test2111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2111");
        int[] intArray5 = new int[] { 0, (short) 100, '#', (byte) 100, ' ' };
        int[] intArray8 = ds.MaxMin4.maxMin4(intArray5, 1, (int) (byte) 0);
        int[] intArray11 = ds.MaxMin4.maxMin4(intArray5, (int) (short) 1, 0);
        int[] intArray14 = ds.MaxMin4.maxMin4(intArray5, 0, 0);
        int[] intArray17 = ds.MaxMin4.maxMin4(intArray5, 0, 0);
        int[] intArray20 = ds.MaxMin4.maxMin4(intArray5, (int) (short) 1, 0);
        int[] intArray23 = ds.MaxMin4.maxMin4(intArray20, (int) (byte) 0, (int) (short) 0);
        int[] intArray26 = ds.MaxMin4.maxMin4(intArray20, 1, 0);
        int[] intArray29 = ds.MaxMin4.maxMin4(intArray26, (int) (short) 1, 0);
        int[] intArray32 = ds.MaxMin4.maxMin4(intArray26, 0, (int) (byte) 0);
        int[] intArray35 = ds.MaxMin4.maxMin4(intArray26, (int) (byte) 1, 1);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray38 = ds.MaxMin4.maxMin4(intArray26, (int) (short) 1, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[0, 100, 35, 100, 32]");
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[100, 0]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[100, 0]");
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray20), "[100, 0]");
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray23), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray26), "[100, 0]");
        org.junit.Assert.assertNotNull(intArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray29), "[100, 0]");
        org.junit.Assert.assertNotNull(intArray32);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray32), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray35);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray35), "[0, 0]");
    }

    @Test
    public void test2112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2112");
        int[] intArray5 = new int[] { 0, (short) 100, '#', (byte) 100, ' ' };
        int[] intArray8 = ds.MaxMin4.maxMin4(intArray5, 1, (int) (byte) 0);
        int[] intArray11 = ds.MaxMin4.maxMin4(intArray5, 0, (int) (byte) 1);
        int[] intArray14 = ds.MaxMin4.maxMin4(intArray5, (int) (short) 1, 1);
        int[] intArray17 = ds.MaxMin4.maxMin4(intArray14, (int) (byte) 0, (int) (byte) 0);
        int[] intArray20 = ds.MaxMin4.maxMin4(intArray17, (int) (short) 0, 1);
        int[] intArray23 = ds.MaxMin4.maxMin4(intArray17, 0, (int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray26 = ds.MaxMin4.maxMin4(intArray17, (int) (short) 100, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[0, 100, 35, 100, 32]");
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[100, 0]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[100, 0]");
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray20), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray23), "[100, 100]");
    }

    @Test
    public void test2113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2113");
        int[] intArray5 = new int[] { 0, (short) 100, '#', (byte) 100, ' ' };
        int[] intArray8 = ds.MaxMin4.maxMin4(intArray5, 1, (int) (byte) 0);
        int[] intArray11 = ds.MaxMin4.maxMin4(intArray5, (int) (short) 1, 0);
        int[] intArray14 = ds.MaxMin4.maxMin4(intArray5, 0, 0);
        int[] intArray17 = ds.MaxMin4.maxMin4(intArray5, 0, 0);
        int[] intArray20 = ds.MaxMin4.maxMin4(intArray5, (int) (short) 1, 0);
        int[] intArray23 = ds.MaxMin4.maxMin4(intArray20, (int) (byte) 0, (int) (short) 0);
        int[] intArray26 = ds.MaxMin4.maxMin4(intArray23, (int) (byte) 1, 0);
        int[] intArray29 = ds.MaxMin4.maxMin4(intArray23, (int) (short) 1, (int) (byte) 1);
        java.lang.Class<?> wildcardClass30 = intArray29.getClass();
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[0, 100, 35, 100, 32]");
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[100, 0]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[100, 0]");
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray20), "[100, 0]");
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray23), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray26), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray29), "[100, 100]");
        org.junit.Assert.assertNotNull(wildcardClass30);
    }

    @Test
    public void test2114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2114");
        int[] intArray5 = new int[] { 0, (short) 100, '#', (byte) 100, ' ' };
        int[] intArray8 = ds.MaxMin4.maxMin4(intArray5, 1, (int) (byte) 0);
        int[] intArray11 = ds.MaxMin4.maxMin4(intArray8, 0, (int) (short) 1);
        int[] intArray14 = ds.MaxMin4.maxMin4(intArray8, 0, (int) (short) 1);
        int[] intArray17 = ds.MaxMin4.maxMin4(intArray14, 0, 1);
        int[] intArray20 = ds.MaxMin4.maxMin4(intArray14, 0, (int) (short) 0);
        int[] intArray23 = ds.MaxMin4.maxMin4(intArray20, (int) (short) 1, 0);
        int[] intArray26 = ds.MaxMin4.maxMin4(intArray23, 0, (int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray29 = ds.MaxMin4.maxMin4(intArray26, (int) (short) 10, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[0, 100, 35, 100, 32]");
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[100, 0]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[100, 0]");
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[100, 0]");
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[100, 0]");
        org.junit.Assert.assertNotNull(intArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray20), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray23), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray26), "[100, 100]");
    }

    @Test
    public void test2115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2115");
        int[] intArray5 = new int[] { 0, (short) 100, '#', (byte) 100, ' ' };
        int[] intArray8 = ds.MaxMin4.maxMin4(intArray5, 1, (int) (byte) 0);
        int[] intArray11 = ds.MaxMin4.maxMin4(intArray8, (int) (byte) 0, (int) (byte) 1);
        int[] intArray14 = ds.MaxMin4.maxMin4(intArray8, (int) (byte) 0, 1);
        int[] intArray17 = ds.MaxMin4.maxMin4(intArray14, (int) (byte) 0, 1);
        int[] intArray20 = ds.MaxMin4.maxMin4(intArray17, (int) (short) 1, 0);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray23 = ds.MaxMin4.maxMin4(intArray17, (int) (short) 100, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[0, 100, 35, 100, 32]");
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[100, 0]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[100, 0]");
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[100, 0]");
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[100, 0]");
        org.junit.Assert.assertNotNull(intArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray20), "[100, 0]");
    }

    @Test
    public void test2116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2116");
        int[] intArray5 = new int[] { 0, (short) 100, '#', (byte) 100, ' ' };
        int[] intArray8 = ds.MaxMin4.maxMin4(intArray5, 1, (int) (byte) 0);
        int[] intArray11 = ds.MaxMin4.maxMin4(intArray8, (int) (byte) 0, (int) (byte) 1);
        int[] intArray14 = ds.MaxMin4.maxMin4(intArray8, (int) (byte) 0, 1);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray17 = ds.MaxMin4.maxMin4(intArray14, (int) (short) 10, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[0, 100, 35, 100, 32]");
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[100, 0]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[100, 0]");
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[100, 0]");
    }

    @Test
    public void test2117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2117");
        int[] intArray5 = new int[] { 0, (short) 100, '#', (byte) 100, ' ' };
        int[] intArray8 = ds.MaxMin4.maxMin4(intArray5, 1, (int) (byte) 0);
        int[] intArray11 = ds.MaxMin4.maxMin4(intArray5, (int) (short) 1, 0);
        int[] intArray14 = ds.MaxMin4.maxMin4(intArray11, 1, (int) (byte) 0);
        int[] intArray17 = ds.MaxMin4.maxMin4(intArray11, (int) (short) 1, (int) (short) 0);
        int[] intArray20 = ds.MaxMin4.maxMin4(intArray11, 0, 1);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray23 = ds.MaxMin4.maxMin4(intArray11, 0, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[0, 100, 35, 100, 32]");
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[100, 0]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[100, 0]");
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[100, 0]");
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[100, 0]");
        org.junit.Assert.assertNotNull(intArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray20), "[100, 0]");
    }

    @Test
    public void test2118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2118");
        int[] intArray5 = new int[] { 0, (short) 100, '#', (byte) 100, ' ' };
        int[] intArray8 = ds.MaxMin4.maxMin4(intArray5, 1, (int) (byte) 0);
        int[] intArray11 = ds.MaxMin4.maxMin4(intArray8, 0, (int) (short) 1);
        int[] intArray14 = ds.MaxMin4.maxMin4(intArray8, 0, (int) (short) 1);
        int[] intArray17 = ds.MaxMin4.maxMin4(intArray8, 0, 0);
        int[] intArray20 = ds.MaxMin4.maxMin4(intArray8, (int) (short) 0, (int) (byte) 0);
        int[] intArray23 = ds.MaxMin4.maxMin4(intArray8, (int) (byte) 1, 1);
        int[] intArray26 = ds.MaxMin4.maxMin4(intArray23, (int) (short) 1, (int) (byte) 0);
        java.lang.Class<?> wildcardClass27 = intArray23.getClass();
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[0, 100, 35, 100, 32]");
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[100, 0]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[100, 0]");
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[100, 0]");
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray20), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray23), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray26), "[0, 0]");
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test2119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2119");
        int[] intArray2 = new int[] { 100, '4' };
        int[] intArray5 = ds.MaxMin4.maxMin4(intArray2, (int) (short) 1, 1);
        int[] intArray8 = ds.MaxMin4.maxMin4(intArray5, 1, 0);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray11 = ds.MaxMin4.maxMin4(intArray5, 100, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[100, 52]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[52, 52]");
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[52, 52]");
    }

    @Test
    public void test2120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2120");
        int[] intArray5 = new int[] { 0, (short) 100, '#', (byte) 100, ' ' };
        int[] intArray8 = ds.MaxMin4.maxMin4(intArray5, 1, (int) (byte) 0);
        int[] intArray11 = ds.MaxMin4.maxMin4(intArray8, 0, (int) (short) 1);
        int[] intArray14 = ds.MaxMin4.maxMin4(intArray11, (int) (byte) 1, 0);
        int[] intArray17 = ds.MaxMin4.maxMin4(intArray14, (int) (byte) 0, (int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray20 = ds.MaxMin4.maxMin4(intArray17, (int) 'a', (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[0, 100, 35, 100, 32]");
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[100, 0]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[100, 0]");
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[100, 0]");
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[100, 0]");
    }

    @Test
    public void test2121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2121");
        int[] intArray5 = new int[] { 0, (short) 100, '#', (byte) 100, ' ' };
        int[] intArray8 = ds.MaxMin4.maxMin4(intArray5, 1, (int) (byte) 0);
        int[] intArray11 = ds.MaxMin4.maxMin4(intArray5, 0, (int) (byte) 1);
        int[] intArray14 = ds.MaxMin4.maxMin4(intArray5, (int) (short) 1, 1);
        int[] intArray17 = ds.MaxMin4.maxMin4(intArray5, (int) (short) 0, (int) (byte) 0);
        int[] intArray20 = ds.MaxMin4.maxMin4(intArray17, (int) (short) 1, (int) (byte) 1);
        int[] intArray23 = ds.MaxMin4.maxMin4(intArray20, 0, (int) (short) 0);
        java.lang.Class<?> wildcardClass24 = intArray23.getClass();
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[0, 100, 35, 100, 32]");
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[100, 0]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[100, 0]");
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray20), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray23), "[0, 0]");
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test2122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2122");
        int[] intArray5 = new int[] { 0, (short) 100, '#', (byte) 100, ' ' };
        int[] intArray8 = ds.MaxMin4.maxMin4(intArray5, 1, (int) (byte) 0);
        int[] intArray11 = ds.MaxMin4.maxMin4(intArray8, (int) (byte) 0, (int) (byte) 1);
        int[] intArray14 = ds.MaxMin4.maxMin4(intArray11, (int) (byte) 1, 0);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray17 = ds.MaxMin4.maxMin4(intArray14, 0, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[0, 100, 35, 100, 32]");
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[100, 0]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[100, 0]");
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[100, 0]");
    }

    @Test
    public void test2123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2123");
        int[] intArray5 = new int[] { 0, (short) 100, '#', (byte) 100, ' ' };
        int[] intArray8 = ds.MaxMin4.maxMin4(intArray5, 1, (int) (byte) 0);
        int[] intArray11 = ds.MaxMin4.maxMin4(intArray5, 0, (int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray14 = ds.MaxMin4.maxMin4(intArray11, (-1), (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[0, 100, 35, 100, 32]");
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[100, 0]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[100, 0]");
    }

    @Test
    public void test2124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2124");
        int[] intArray5 = new int[] { 0, (short) 100, '#', (byte) 100, ' ' };
        int[] intArray8 = ds.MaxMin4.maxMin4(intArray5, 1, (int) (byte) 0);
        int[] intArray11 = ds.MaxMin4.maxMin4(intArray8, (int) (byte) 0, (int) (byte) 1);
        int[] intArray14 = ds.MaxMin4.maxMin4(intArray8, (int) (byte) 0, 1);
        int[] intArray17 = ds.MaxMin4.maxMin4(intArray8, (int) (byte) 1, (int) (short) 0);
        int[] intArray20 = ds.MaxMin4.maxMin4(intArray17, (int) (short) 1, (int) (short) 1);
        int[] intArray23 = ds.MaxMin4.maxMin4(intArray20, 0, (int) (short) 1);
        int[] intArray26 = ds.MaxMin4.maxMin4(intArray23, (int) (short) 0, (int) (short) 0);
        java.lang.Class<?> wildcardClass27 = intArray23.getClass();
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[0, 100, 35, 100, 32]");
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[100, 0]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[100, 0]");
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[100, 0]");
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[100, 0]");
        org.junit.Assert.assertNotNull(intArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray20), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray23), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray26), "[0, 0]");
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test2125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2125");
        int[] intArray5 = new int[] { 0, (short) 100, '#', (byte) 100, ' ' };
        int[] intArray8 = ds.MaxMin4.maxMin4(intArray5, 1, (int) (byte) 0);
        int[] intArray11 = ds.MaxMin4.maxMin4(intArray5, 0, (int) (byte) 1);
        int[] intArray14 = ds.MaxMin4.maxMin4(intArray5, (int) (short) 1, 1);
        int[] intArray17 = ds.MaxMin4.maxMin4(intArray14, (int) (byte) 0, (int) (byte) 0);
        int[] intArray20 = ds.MaxMin4.maxMin4(intArray17, (int) (short) 0, 1);
        int[] intArray23 = ds.MaxMin4.maxMin4(intArray17, 0, (int) (short) 1);
        int[] intArray26 = ds.MaxMin4.maxMin4(intArray17, 0, 0);
        int[] intArray29 = ds.MaxMin4.maxMin4(intArray26, 0, 0);
        int[] intArray32 = ds.MaxMin4.maxMin4(intArray26, 1, (int) (byte) 0);
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[0, 100, 35, 100, 32]");
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[100, 0]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[100, 0]");
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray20), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray23), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray26), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray29), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray32);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray32), "[100, 100]");
    }

    @Test
    public void test2126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2126");
        int[] intArray5 = new int[] { 0, (short) 100, '#', (byte) 100, ' ' };
        int[] intArray8 = ds.MaxMin4.maxMin4(intArray5, 1, (int) (byte) 0);
        int[] intArray11 = ds.MaxMin4.maxMin4(intArray8, (int) (byte) 0, (int) (byte) 1);
        int[] intArray14 = ds.MaxMin4.maxMin4(intArray8, (int) (byte) 0, 1);
        int[] intArray17 = ds.MaxMin4.maxMin4(intArray8, (int) (byte) 1, 0);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray20 = ds.MaxMin4.maxMin4(intArray17, (-1), (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[0, 100, 35, 100, 32]");
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[100, 0]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[100, 0]");
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[100, 0]");
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[100, 0]");
    }

    @Test
    public void test2127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2127");
        int[] intArray5 = new int[] { 0, (short) 100, '#', (byte) 100, ' ' };
        int[] intArray8 = ds.MaxMin4.maxMin4(intArray5, 1, (int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray11 = ds.MaxMin4.maxMin4(intArray8, (int) (byte) 10, (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[0, 100, 35, 100, 32]");
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[100, 0]");
    }

    @Test
    public void test2128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2128");
        int[] intArray5 = new int[] { 0, (short) 100, '#', (byte) 100, ' ' };
        int[] intArray8 = ds.MaxMin4.maxMin4(intArray5, 1, (int) (byte) 0);
        int[] intArray11 = ds.MaxMin4.maxMin4(intArray8, (int) (byte) 0, (int) (byte) 1);
        int[] intArray14 = ds.MaxMin4.maxMin4(intArray8, (int) (byte) 0, 1);
        int[] intArray17 = ds.MaxMin4.maxMin4(intArray8, (int) (byte) 1, (int) (short) 0);
        int[] intArray20 = ds.MaxMin4.maxMin4(intArray17, (int) (short) 1, (int) (short) 1);
        int[] intArray23 = ds.MaxMin4.maxMin4(intArray20, 0, (int) (short) 1);
        int[] intArray26 = ds.MaxMin4.maxMin4(intArray23, (int) (short) 0, (int) (byte) 1);
        int[] intArray29 = ds.MaxMin4.maxMin4(intArray23, 0, (int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray32 = ds.MaxMin4.maxMin4(intArray23, (int) 'a', (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[0, 100, 35, 100, 32]");
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[100, 0]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[100, 0]");
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[100, 0]");
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[100, 0]");
        org.junit.Assert.assertNotNull(intArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray20), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray23), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray26), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray29), "[0, 0]");
    }

    @Test
    public void test2129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2129");
        int[] intArray6 = new int[] { (byte) 1, (short) 1, ' ', (-1), (byte) 1, 'a' };
        int[] intArray9 = ds.MaxMin4.maxMin4(intArray6, 0, (int) (short) 1);
        int[] intArray12 = ds.MaxMin4.maxMin4(intArray9, (int) (byte) 0, (int) (short) 1);
        java.lang.Class<?> wildcardClass13 = intArray9.getClass();
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[1, 1, 32, -1, 1, 97]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[1, 1]");
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test2130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2130");
        int[] intArray6 = new int[] { 0, (byte) -1, (short) 0, (byte) 1, (short) 100, 100 };
        int[] intArray9 = ds.MaxMin4.maxMin4(intArray6, (int) (byte) 0, (int) (short) 0);
        int[] intArray12 = ds.MaxMin4.maxMin4(intArray9, 0, (int) (byte) 1);
        int[] intArray15 = ds.MaxMin4.maxMin4(intArray12, (int) (byte) 0, (int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray18 = ds.MaxMin4.maxMin4(intArray15, 100, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[0, -1, 0, 1, 100, 100]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[0, 0]");
    }

    @Test
    public void test2131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2131");
        int[] intArray5 = new int[] { 0, (short) 100, '#', (byte) 100, ' ' };
        int[] intArray8 = ds.MaxMin4.maxMin4(intArray5, 1, (int) (byte) 0);
        int[] intArray11 = ds.MaxMin4.maxMin4(intArray8, 0, (int) (short) 1);
        int[] intArray14 = ds.MaxMin4.maxMin4(intArray8, 0, (int) (short) 1);
        int[] intArray17 = ds.MaxMin4.maxMin4(intArray14, 0, 1);
        int[] intArray20 = ds.MaxMin4.maxMin4(intArray14, 0, (int) (short) 0);
        int[] intArray23 = ds.MaxMin4.maxMin4(intArray20, (int) (short) 1, 0);
        java.lang.Class<?> wildcardClass24 = intArray20.getClass();
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[0, 100, 35, 100, 32]");
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[100, 0]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[100, 0]");
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[100, 0]");
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[100, 0]");
        org.junit.Assert.assertNotNull(intArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray20), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray23), "[100, 100]");
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test2132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2132");
        int[] intArray5 = new int[] { 0, (short) 100, '#', (byte) 100, ' ' };
        int[] intArray8 = ds.MaxMin4.maxMin4(intArray5, 1, (int) (byte) 0);
        int[] intArray11 = ds.MaxMin4.maxMin4(intArray5, (int) (short) 0, 1);
        int[] intArray14 = ds.MaxMin4.maxMin4(intArray5, 0, 1);
        int[] intArray17 = ds.MaxMin4.maxMin4(intArray5, 0, 0);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray20 = ds.MaxMin4.maxMin4(intArray17, 100, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[0, 100, 35, 100, 32]");
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[100, 0]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[100, 0]");
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[100, 0]");
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[0, 0]");
    }

    @Test
    public void test2133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2133");
        int[] intArray5 = new int[] { 0, (short) 100, '#', (byte) 100, ' ' };
        int[] intArray8 = ds.MaxMin4.maxMin4(intArray5, 1, (int) (byte) 0);
        int[] intArray11 = ds.MaxMin4.maxMin4(intArray8, 0, (int) (short) 1);
        int[] intArray14 = ds.MaxMin4.maxMin4(intArray8, 0, (int) (short) 1);
        int[] intArray17 = ds.MaxMin4.maxMin4(intArray8, 0, 0);
        int[] intArray20 = ds.MaxMin4.maxMin4(intArray8, (int) (short) 0, (int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray23 = ds.MaxMin4.maxMin4(intArray20, (-1), (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[0, 100, 35, 100, 32]");
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[100, 0]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[100, 0]");
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[100, 0]");
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray20), "[100, 0]");
    }

    @Test
    public void test2134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2134");
        int[] intArray5 = new int[] { 0, (short) 100, '#', (byte) 100, ' ' };
        int[] intArray8 = ds.MaxMin4.maxMin4(intArray5, 1, (int) (byte) 0);
        int[] intArray11 = ds.MaxMin4.maxMin4(intArray8, (int) (byte) 0, (int) (byte) 1);
        int[] intArray14 = ds.MaxMin4.maxMin4(intArray11, (int) (byte) 1, 0);
        int[] intArray17 = ds.MaxMin4.maxMin4(intArray14, 0, 0);
        java.lang.Class<?> wildcardClass18 = intArray14.getClass();
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[0, 100, 35, 100, 32]");
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[100, 0]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[100, 0]");
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[100, 0]");
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[100, 100]");
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test2135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2135");
        int[] intArray5 = new int[] { 0, (short) 100, '#', (byte) 100, ' ' };
        int[] intArray8 = ds.MaxMin4.maxMin4(intArray5, 1, (int) (byte) 0);
        int[] intArray11 = ds.MaxMin4.maxMin4(intArray8, (int) (byte) 0, (int) (byte) 1);
        int[] intArray14 = ds.MaxMin4.maxMin4(intArray8, (int) (byte) 0, 1);
        int[] intArray17 = ds.MaxMin4.maxMin4(intArray14, (int) (byte) 0, 1);
        int[] intArray20 = ds.MaxMin4.maxMin4(intArray17, (int) (short) 1, 0);
        int[] intArray23 = ds.MaxMin4.maxMin4(intArray17, 0, 0);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray26 = ds.MaxMin4.maxMin4(intArray23, (int) '4', (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[0, 100, 35, 100, 32]");
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[100, 0]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[100, 0]");
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[100, 0]");
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[100, 0]");
        org.junit.Assert.assertNotNull(intArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray20), "[100, 0]");
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray23), "[100, 100]");
    }

    @Test
    public void test2136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2136");
        int[] intArray0 = null;
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray3 = ds.MaxMin4.maxMin4(intArray0, (int) (short) -1, 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2137");
        int[] intArray5 = new int[] { 0, (short) 100, '#', (byte) 100, ' ' };
        int[] intArray8 = ds.MaxMin4.maxMin4(intArray5, 1, (int) (byte) 0);
        int[] intArray11 = ds.MaxMin4.maxMin4(intArray8, (int) (byte) 0, (int) (byte) 1);
        int[] intArray14 = ds.MaxMin4.maxMin4(intArray11, 1, 0);
        int[] intArray17 = ds.MaxMin4.maxMin4(intArray11, (int) (byte) 0, 0);
        int[] intArray20 = ds.MaxMin4.maxMin4(intArray17, 0, (int) (byte) 0);
        int[] intArray23 = ds.MaxMin4.maxMin4(intArray20, (int) (byte) 0, (int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray26 = ds.MaxMin4.maxMin4(intArray20, 1, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[0, 100, 35, 100, 32]");
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[100, 0]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[100, 0]");
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[100, 0]");
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray20), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray23), "[100, 100]");
    }

    @Test
    public void test2138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2138");
        int[] intArray5 = new int[] { 0, (short) 100, '#', (byte) 100, ' ' };
        int[] intArray8 = ds.MaxMin4.maxMin4(intArray5, 1, (int) (byte) 0);
        int[] intArray11 = ds.MaxMin4.maxMin4(intArray8, (int) (byte) 0, (int) (byte) 1);
        int[] intArray14 = ds.MaxMin4.maxMin4(intArray8, (int) (byte) 0, 1);
        int[] intArray17 = ds.MaxMin4.maxMin4(intArray14, (int) (byte) 0, 1);
        int[] intArray20 = ds.MaxMin4.maxMin4(intArray17, 0, 1);
        int[] intArray23 = ds.MaxMin4.maxMin4(intArray20, (int) (byte) 0, (int) (short) 0);
        java.lang.Class<?> wildcardClass24 = intArray23.getClass();
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[0, 100, 35, 100, 32]");
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[100, 0]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[100, 0]");
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[100, 0]");
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[100, 0]");
        org.junit.Assert.assertNotNull(intArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray20), "[100, 0]");
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray23), "[100, 100]");
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test2139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2139");
        int[] intArray5 = new int[] { 0, (short) 100, '#', (byte) 100, ' ' };
        int[] intArray8 = ds.MaxMin4.maxMin4(intArray5, 1, (int) (byte) 0);
        int[] intArray11 = ds.MaxMin4.maxMin4(intArray8, (int) (byte) 0, (int) (byte) 1);
        int[] intArray14 = ds.MaxMin4.maxMin4(intArray8, (int) (byte) 0, 1);
        int[] intArray17 = ds.MaxMin4.maxMin4(intArray14, (int) (byte) 0, 1);
        int[] intArray20 = ds.MaxMin4.maxMin4(intArray17, (int) (short) 1, 0);
        int[] intArray23 = ds.MaxMin4.maxMin4(intArray20, 1, (int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray26 = ds.MaxMin4.maxMin4(intArray20, (int) '#', (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[0, 100, 35, 100, 32]");
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[100, 0]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[100, 0]");
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[100, 0]");
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[100, 0]");
        org.junit.Assert.assertNotNull(intArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray20), "[100, 0]");
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray23), "[100, 0]");
    }

    @Test
    public void test2140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2140");
        int[] intArray5 = new int[] { 0, (short) 100, '#', (byte) 100, ' ' };
        int[] intArray8 = ds.MaxMin4.maxMin4(intArray5, 1, (int) (byte) 0);
        int[] intArray11 = ds.MaxMin4.maxMin4(intArray8, 0, (int) (short) 1);
        int[] intArray14 = ds.MaxMin4.maxMin4(intArray8, 0, (int) (short) 1);
        int[] intArray17 = ds.MaxMin4.maxMin4(intArray14, 0, 1);
        int[] intArray20 = ds.MaxMin4.maxMin4(intArray14, 0, (int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray23 = ds.MaxMin4.maxMin4(intArray14, (int) (short) -1, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[0, 100, 35, 100, 32]");
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[100, 0]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[100, 0]");
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[100, 0]");
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[100, 0]");
        org.junit.Assert.assertNotNull(intArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray20), "[100, 100]");
    }

    @Test
    public void test2141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2141");
        int[] intArray5 = new int[] { 0, (short) 100, '#', (byte) 100, ' ' };
        int[] intArray8 = ds.MaxMin4.maxMin4(intArray5, 1, (int) (byte) 0);
        int[] intArray11 = ds.MaxMin4.maxMin4(intArray5, (int) (short) 0, 1);
        int[] intArray14 = ds.MaxMin4.maxMin4(intArray5, 0, 1);
        int[] intArray17 = ds.MaxMin4.maxMin4(intArray14, (int) (short) 1, (int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray20 = ds.MaxMin4.maxMin4(intArray14, 10, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[0, 100, 35, 100, 32]");
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[100, 0]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[100, 0]");
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[100, 0]");
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[100, 0]");
    }

    @Test
    public void test2142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2142");
        int[] intArray5 = new int[] { 0, (short) 100, '#', (byte) 100, ' ' };
        int[] intArray8 = ds.MaxMin4.maxMin4(intArray5, 1, (int) (byte) 0);
        int[] intArray11 = ds.MaxMin4.maxMin4(intArray5, (int) (short) 1, 0);
        int[] intArray14 = ds.MaxMin4.maxMin4(intArray5, 0, 0);
        int[] intArray17 = ds.MaxMin4.maxMin4(intArray5, (int) (byte) 1, 0);
        int[] intArray20 = ds.MaxMin4.maxMin4(intArray5, 0, 1);
        int[] intArray23 = ds.MaxMin4.maxMin4(intArray20, 0, (int) (short) 1);
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[0, 100, 35, 100, 32]");
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[100, 0]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[100, 0]");
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[100, 0]");
        org.junit.Assert.assertNotNull(intArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray20), "[100, 0]");
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray23), "[100, 0]");
    }

    @Test
    public void test2143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2143");
        int[] intArray5 = new int[] { 0, (short) 100, '#', (byte) 100, ' ' };
        int[] intArray8 = ds.MaxMin4.maxMin4(intArray5, 1, (int) (byte) 0);
        int[] intArray11 = ds.MaxMin4.maxMin4(intArray5, (int) (short) 1, 0);
        int[] intArray14 = ds.MaxMin4.maxMin4(intArray11, 1, (int) (byte) 0);
        int[] intArray17 = ds.MaxMin4.maxMin4(intArray14, (int) (short) 1, 1);
        int[] intArray20 = ds.MaxMin4.maxMin4(intArray17, 0, 1);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray23 = ds.MaxMin4.maxMin4(intArray17, 0, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[0, 100, 35, 100, 32]");
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[100, 0]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[100, 0]");
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[100, 0]");
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray20), "[0, 0]");
    }

    @Test
    public void test2144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2144");
        int[] intArray5 = new int[] { 0, (short) 100, '#', (byte) 100, ' ' };
        int[] intArray8 = ds.MaxMin4.maxMin4(intArray5, 1, (int) (byte) 0);
        int[] intArray11 = ds.MaxMin4.maxMin4(intArray8, (int) (byte) 0, (int) (byte) 1);
        int[] intArray14 = ds.MaxMin4.maxMin4(intArray11, 1, 0);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray17 = ds.MaxMin4.maxMin4(intArray11, (int) (byte) 1, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[0, 100, 35, 100, 32]");
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[100, 0]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[100, 0]");
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[100, 0]");
    }

    @Test
    public void test2145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2145");
        int[] intArray5 = new int[] { 0, (short) 100, '#', (byte) 100, ' ' };
        int[] intArray8 = ds.MaxMin4.maxMin4(intArray5, 1, (int) (byte) 0);
        int[] intArray11 = ds.MaxMin4.maxMin4(intArray5, (int) (short) 0, 1);
        int[] intArray14 = ds.MaxMin4.maxMin4(intArray5, 0, 1);
        int[] intArray17 = ds.MaxMin4.maxMin4(intArray14, (int) (byte) 1, (int) (byte) 1);
        int[] intArray20 = ds.MaxMin4.maxMin4(intArray14, (int) (short) 0, 0);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray23 = ds.MaxMin4.maxMin4(intArray14, (-1), (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[0, 100, 35, 100, 32]");
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[100, 0]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[100, 0]");
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[100, 0]");
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray20), "[100, 100]");
    }

    @Test
    public void test2146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2146");
        int[] intArray5 = new int[] { 0, (short) 100, '#', (byte) 100, ' ' };
        int[] intArray8 = ds.MaxMin4.maxMin4(intArray5, 1, (int) (byte) 0);
        int[] intArray11 = ds.MaxMin4.maxMin4(intArray5, (int) (short) 1, 0);
        int[] intArray14 = ds.MaxMin4.maxMin4(intArray5, 0, 0);
        int[] intArray17 = ds.MaxMin4.maxMin4(intArray5, 0, 0);
        int[] intArray20 = ds.MaxMin4.maxMin4(intArray5, (int) (short) 1, 0);
        int[] intArray23 = ds.MaxMin4.maxMin4(intArray20, (int) (byte) 0, (int) (short) 0);
        int[] intArray26 = ds.MaxMin4.maxMin4(intArray20, 1, 0);
        int[] intArray29 = ds.MaxMin4.maxMin4(intArray26, (int) (short) 1, 0);
        int[] intArray32 = ds.MaxMin4.maxMin4(intArray26, 0, (int) (byte) 0);
        java.lang.Class<?> wildcardClass33 = intArray32.getClass();
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[0, 100, 35, 100, 32]");
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[100, 0]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[100, 0]");
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray20), "[100, 0]");
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray23), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray26), "[100, 0]");
        org.junit.Assert.assertNotNull(intArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray29), "[100, 0]");
        org.junit.Assert.assertNotNull(intArray32);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray32), "[100, 100]");
        org.junit.Assert.assertNotNull(wildcardClass33);
    }

    @Test
    public void test2147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2147");
        int[] intArray6 = new int[] { (byte) 1, (short) 1, ' ', (-1), (byte) 1, 'a' };
        int[] intArray9 = ds.MaxMin4.maxMin4(intArray6, 0, (int) (short) 1);
        int[] intArray12 = ds.MaxMin4.maxMin4(intArray6, 0, 0);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray15 = ds.MaxMin4.maxMin4(intArray6, (int) '4', (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[1, 1, 32, -1, 1, 97]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[1, 1]");
    }

    @Test
    public void test2148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2148");
        int[] intArray5 = new int[] { 0, (short) 100, '#', (byte) 100, ' ' };
        int[] intArray8 = ds.MaxMin4.maxMin4(intArray5, 1, (int) (byte) 0);
        int[] intArray11 = ds.MaxMin4.maxMin4(intArray5, (int) (short) 1, 0);
        int[] intArray14 = ds.MaxMin4.maxMin4(intArray5, 0, 0);
        int[] intArray17 = ds.MaxMin4.maxMin4(intArray5, 0, 0);
        int[] intArray20 = ds.MaxMin4.maxMin4(intArray5, (int) (short) 1, 0);
        int[] intArray23 = ds.MaxMin4.maxMin4(intArray20, (int) (byte) 0, (int) (short) 0);
        int[] intArray26 = ds.MaxMin4.maxMin4(intArray20, 1, 0);
        int[] intArray29 = ds.MaxMin4.maxMin4(intArray26, (int) (short) 1, 0);
        int[] intArray32 = ds.MaxMin4.maxMin4(intArray26, (int) (short) 0, 1);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray35 = ds.MaxMin4.maxMin4(intArray32, (int) (short) 0, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[0, 100, 35, 100, 32]");
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[100, 0]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[100, 0]");
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray20), "[100, 0]");
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray23), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray26), "[100, 0]");
        org.junit.Assert.assertNotNull(intArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray29), "[100, 0]");
        org.junit.Assert.assertNotNull(intArray32);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray32), "[100, 0]");
    }

    @Test
    public void test2149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2149");
        int[] intArray5 = new int[] { 0, (short) 100, '#', (byte) 100, ' ' };
        int[] intArray8 = ds.MaxMin4.maxMin4(intArray5, 1, (int) (byte) 0);
        int[] intArray11 = ds.MaxMin4.maxMin4(intArray8, 0, (int) (short) 1);
        int[] intArray14 = ds.MaxMin4.maxMin4(intArray8, 0, (int) (short) 1);
        int[] intArray17 = ds.MaxMin4.maxMin4(intArray8, 0, 0);
        int[] intArray20 = ds.MaxMin4.maxMin4(intArray8, (int) (short) 0, (int) (byte) 0);
        int[] intArray23 = ds.MaxMin4.maxMin4(intArray8, (int) (byte) 1, 1);
        int[] intArray26 = ds.MaxMin4.maxMin4(intArray23, (int) (short) 1, (int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray29 = ds.MaxMin4.maxMin4(intArray23, (-1), (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[0, 100, 35, 100, 32]");
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[100, 0]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[100, 0]");
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[100, 0]");
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray20), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray23), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray26), "[0, 0]");
    }

    @Test
    public void test2150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2150");
        int[] intArray5 = new int[] { 0, (short) 100, '#', (byte) 100, ' ' };
        int[] intArray8 = ds.MaxMin4.maxMin4(intArray5, 1, (int) (byte) 0);
        int[] intArray11 = ds.MaxMin4.maxMin4(intArray8, 0, (int) (short) 1);
        int[] intArray14 = ds.MaxMin4.maxMin4(intArray11, 1, (int) (short) 0);
        int[] intArray17 = ds.MaxMin4.maxMin4(intArray14, 1, 1);
        java.lang.Class<?> wildcardClass18 = intArray14.getClass();
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[0, 100, 35, 100, 32]");
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[100, 0]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[100, 0]");
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[100, 0]");
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[0, 0]");
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test2151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2151");
        int[] intArray5 = new int[] { 0, (short) 100, '#', (byte) 100, ' ' };
        int[] intArray8 = ds.MaxMin4.maxMin4(intArray5, 1, (int) (byte) 0);
        int[] intArray11 = ds.MaxMin4.maxMin4(intArray8, (int) (byte) 0, (int) (byte) 1);
        int[] intArray14 = ds.MaxMin4.maxMin4(intArray8, (int) (byte) 0, 1);
        int[] intArray17 = ds.MaxMin4.maxMin4(intArray14, (int) (byte) 0, 1);
        int[] intArray20 = ds.MaxMin4.maxMin4(intArray17, 0, 1);
        int[] intArray23 = ds.MaxMin4.maxMin4(intArray20, 1, 0);
        int[] intArray26 = ds.MaxMin4.maxMin4(intArray20, (int) (short) 1, (int) (byte) 0);
        java.lang.Class<?> wildcardClass27 = intArray20.getClass();
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[0, 100, 35, 100, 32]");
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[100, 0]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[100, 0]");
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[100, 0]");
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[100, 0]");
        org.junit.Assert.assertNotNull(intArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray20), "[100, 0]");
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray23), "[100, 0]");
        org.junit.Assert.assertNotNull(intArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray26), "[100, 0]");
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test2152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2152");
        int[] intArray5 = new int[] { 0, (short) 100, '#', (byte) 100, ' ' };
        int[] intArray8 = ds.MaxMin4.maxMin4(intArray5, 1, (int) (byte) 0);
        int[] intArray11 = ds.MaxMin4.maxMin4(intArray5, (int) (short) 1, 0);
        int[] intArray14 = ds.MaxMin4.maxMin4(intArray5, 0, 0);
        int[] intArray17 = ds.MaxMin4.maxMin4(intArray14, 1, 0);
        int[] intArray20 = ds.MaxMin4.maxMin4(intArray17, 0, 0);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray23 = ds.MaxMin4.maxMin4(intArray20, (int) (byte) 1, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[0, 100, 35, 100, 32]");
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[100, 0]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[100, 0]");
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray20), "[0, 0]");
    }

    @Test
    public void test2153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2153");
        int[] intArray5 = new int[] { 0, (short) 100, '#', (byte) 100, ' ' };
        int[] intArray8 = ds.MaxMin4.maxMin4(intArray5, 1, (int) (byte) 0);
        int[] intArray11 = ds.MaxMin4.maxMin4(intArray5, (int) (short) 1, 0);
        int[] intArray14 = ds.MaxMin4.maxMin4(intArray11, 1, (int) (byte) 0);
        int[] intArray17 = ds.MaxMin4.maxMin4(intArray11, (int) (short) 1, (int) (short) 0);
        int[] intArray20 = ds.MaxMin4.maxMin4(intArray11, 0, 1);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray23 = ds.MaxMin4.maxMin4(intArray11, (-1), (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[0, 100, 35, 100, 32]");
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[100, 0]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[100, 0]");
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[100, 0]");
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[100, 0]");
        org.junit.Assert.assertNotNull(intArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray20), "[100, 0]");
    }

    @Test
    public void test2154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2154");
        int[] intArray5 = new int[] { 0, (short) 100, '#', (byte) 100, ' ' };
        int[] intArray8 = ds.MaxMin4.maxMin4(intArray5, 1, (int) (byte) 0);
        int[] intArray11 = ds.MaxMin4.maxMin4(intArray5, (int) (short) 1, 0);
        int[] intArray14 = ds.MaxMin4.maxMin4(intArray5, 0, 0);
        int[] intArray17 = ds.MaxMin4.maxMin4(intArray5, (int) (byte) 1, 0);
        int[] intArray20 = ds.MaxMin4.maxMin4(intArray5, 0, 1);
        int[] intArray23 = ds.MaxMin4.maxMin4(intArray20, (int) (byte) 0, (int) (short) 0);
        int[] intArray26 = ds.MaxMin4.maxMin4(intArray20, 1, 1);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray29 = ds.MaxMin4.maxMin4(intArray26, (int) (short) 100, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[0, 100, 35, 100, 32]");
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[100, 0]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[100, 0]");
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[100, 0]");
        org.junit.Assert.assertNotNull(intArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray20), "[100, 0]");
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray23), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray26), "[0, 0]");
    }

    @Test
    public void test2155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2155");
        int[] intArray5 = new int[] { 0, (short) 100, '#', (byte) 100, ' ' };
        int[] intArray8 = ds.MaxMin4.maxMin4(intArray5, 1, (int) (byte) 0);
        int[] intArray11 = ds.MaxMin4.maxMin4(intArray8, (int) (byte) 0, (int) (byte) 1);
        int[] intArray14 = ds.MaxMin4.maxMin4(intArray8, (int) (byte) 0, 1);
        int[] intArray17 = ds.MaxMin4.maxMin4(intArray14, (int) (byte) 0, 1);
        int[] intArray20 = ds.MaxMin4.maxMin4(intArray17, 0, 1);
        int[] intArray23 = ds.MaxMin4.maxMin4(intArray20, 1, 0);
        int[] intArray26 = ds.MaxMin4.maxMin4(intArray23, (int) (byte) 1, (int) (short) 0);
        java.lang.Class<?> wildcardClass27 = intArray26.getClass();
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[0, 100, 35, 100, 32]");
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[100, 0]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[100, 0]");
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[100, 0]");
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[100, 0]");
        org.junit.Assert.assertNotNull(intArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray20), "[100, 0]");
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray23), "[100, 0]");
        org.junit.Assert.assertNotNull(intArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray26), "[100, 0]");
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test2156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2156");
        int[] intArray5 = new int[] { 0, (short) 100, '#', (byte) 100, ' ' };
        int[] intArray8 = ds.MaxMin4.maxMin4(intArray5, 1, (int) (byte) 0);
        int[] intArray11 = ds.MaxMin4.maxMin4(intArray8, (int) (byte) 0, (int) (byte) 1);
        int[] intArray14 = ds.MaxMin4.maxMin4(intArray11, (int) (byte) 1, 0);
        int[] intArray17 = ds.MaxMin4.maxMin4(intArray11, 0, 1);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray20 = ds.MaxMin4.maxMin4(intArray17, (int) '#', (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[0, 100, 35, 100, 32]");
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[100, 0]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[100, 0]");
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[100, 0]");
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[100, 0]");
    }

    @Test
    public void test2157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2157");
        int[] intArray5 = new int[] { 0, (short) 100, '#', (byte) 100, ' ' };
        int[] intArray8 = ds.MaxMin4.maxMin4(intArray5, 1, (int) (byte) 0);
        int[] intArray11 = ds.MaxMin4.maxMin4(intArray5, 0, (int) (byte) 1);
        int[] intArray14 = ds.MaxMin4.maxMin4(intArray5, (int) (short) 1, 1);
        int[] intArray17 = ds.MaxMin4.maxMin4(intArray14, (int) (byte) 0, (int) (byte) 0);
        int[] intArray20 = ds.MaxMin4.maxMin4(intArray17, (int) (short) 0, 1);
        int[] intArray23 = ds.MaxMin4.maxMin4(intArray17, 0, (int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray26 = ds.MaxMin4.maxMin4(intArray23, (int) (short) 10, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[0, 100, 35, 100, 32]");
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[100, 0]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[100, 0]");
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray20), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray23), "[100, 100]");
    }

    @Test
    public void test2158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2158");
        int[] intArray5 = new int[] { 0, (short) 100, '#', (byte) 100, ' ' };
        int[] intArray8 = ds.MaxMin4.maxMin4(intArray5, 1, (int) (byte) 0);
        int[] intArray11 = ds.MaxMin4.maxMin4(intArray8, (int) (byte) 0, (int) (byte) 1);
        int[] intArray14 = ds.MaxMin4.maxMin4(intArray8, (int) (byte) 0, 1);
        int[] intArray17 = ds.MaxMin4.maxMin4(intArray8, (int) (byte) 1, 0);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray20 = ds.MaxMin4.maxMin4(intArray17, (int) (byte) 100, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[0, 100, 35, 100, 32]");
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[100, 0]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[100, 0]");
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[100, 0]");
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[100, 0]");
    }

    @Test
    public void test2159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2159");
        int[] intArray6 = new int[] { (byte) 1, (short) 1, ' ', (-1), (byte) 1, 'a' };
        int[] intArray9 = ds.MaxMin4.maxMin4(intArray6, 0, (int) (short) 1);
        int[] intArray12 = ds.MaxMin4.maxMin4(intArray9, (int) (short) 1, 0);
        int[] intArray15 = ds.MaxMin4.maxMin4(intArray9, (int) (short) 1, 1);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray18 = ds.MaxMin4.maxMin4(intArray9, (int) (short) -1, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[1, 1, 32, -1, 1, 97]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[1, 1]");
    }

    @Test
    public void test2160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2160");
        int[] intArray5 = new int[] { 0, (short) 100, '#', (byte) 100, ' ' };
        int[] intArray8 = ds.MaxMin4.maxMin4(intArray5, 1, (int) (byte) 0);
        int[] intArray11 = ds.MaxMin4.maxMin4(intArray5, (int) (short) 1, 0);
        int[] intArray14 = ds.MaxMin4.maxMin4(intArray11, 1, (int) (byte) 0);
        int[] intArray17 = ds.MaxMin4.maxMin4(intArray14, (int) (short) 1, 1);
        int[] intArray20 = ds.MaxMin4.maxMin4(intArray17, (int) (short) 1, (int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray23 = ds.MaxMin4.maxMin4(intArray20, 10, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[0, 100, 35, 100, 32]");
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[100, 0]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[100, 0]");
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[100, 0]");
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray20), "[0, 0]");
    }

    @Test
    public void test2161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2161");
        int[] intArray5 = new int[] { 0, (short) 100, '#', (byte) 100, ' ' };
        int[] intArray8 = ds.MaxMin4.maxMin4(intArray5, 1, (int) (byte) 0);
        int[] intArray11 = ds.MaxMin4.maxMin4(intArray5, (int) (short) 1, 0);
        int[] intArray14 = ds.MaxMin4.maxMin4(intArray5, 0, 0);
        int[] intArray17 = ds.MaxMin4.maxMin4(intArray5, 0, 0);
        int[] intArray20 = ds.MaxMin4.maxMin4(intArray5, (int) (short) 1, 0);
        int[] intArray23 = ds.MaxMin4.maxMin4(intArray20, (int) (byte) 0, (int) (short) 0);
        int[] intArray26 = ds.MaxMin4.maxMin4(intArray20, 1, 0);
        int[] intArray29 = ds.MaxMin4.maxMin4(intArray26, (int) (short) 1, 0);
        int[] intArray32 = ds.MaxMin4.maxMin4(intArray26, (int) (short) 0, (int) (short) 0);
        int[] intArray35 = ds.MaxMin4.maxMin4(intArray32, (int) (byte) 1, (int) (byte) 1);
        java.lang.Class<?> wildcardClass36 = intArray35.getClass();
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[0, 100, 35, 100, 32]");
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[100, 0]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[100, 0]");
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray20), "[100, 0]");
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray23), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray26), "[100, 0]");
        org.junit.Assert.assertNotNull(intArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray29), "[100, 0]");
        org.junit.Assert.assertNotNull(intArray32);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray32), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray35);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray35), "[100, 100]");
        org.junit.Assert.assertNotNull(wildcardClass36);
    }

    @Test
    public void test2162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2162");
        int[] intArray5 = new int[] { 0, (short) 100, '#', (byte) 100, ' ' };
        int[] intArray8 = ds.MaxMin4.maxMin4(intArray5, 1, (int) (byte) 0);
        int[] intArray11 = ds.MaxMin4.maxMin4(intArray8, 0, (int) (short) 1);
        int[] intArray14 = ds.MaxMin4.maxMin4(intArray8, 0, (int) (short) 1);
        int[] intArray17 = ds.MaxMin4.maxMin4(intArray8, 0, 0);
        int[] intArray20 = ds.MaxMin4.maxMin4(intArray8, (int) (short) 0, (int) (byte) 0);
        int[] intArray23 = ds.MaxMin4.maxMin4(intArray8, (int) (byte) 1, 1);
        int[] intArray26 = ds.MaxMin4.maxMin4(intArray23, (int) (short) 1, (int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray29 = ds.MaxMin4.maxMin4(intArray26, (int) '#', (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[0, 100, 35, 100, 32]");
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[100, 0]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[100, 0]");
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[100, 0]");
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray20), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray23), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray26), "[0, 0]");
    }

    @Test
    public void test2163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2163");
        int[] intArray5 = new int[] { 0, (short) 100, '#', (byte) 100, ' ' };
        int[] intArray8 = ds.MaxMin4.maxMin4(intArray5, 1, (int) (byte) 0);
        int[] intArray11 = ds.MaxMin4.maxMin4(intArray8, (int) (byte) 0, (int) (byte) 1);
        int[] intArray14 = ds.MaxMin4.maxMin4(intArray8, (int) (byte) 0, 1);
        int[] intArray17 = ds.MaxMin4.maxMin4(intArray8, (int) (byte) 1, (int) (short) 0);
        int[] intArray20 = ds.MaxMin4.maxMin4(intArray17, (int) (short) 1, (int) (short) 1);
        int[] intArray23 = ds.MaxMin4.maxMin4(intArray20, 1, (int) (byte) 0);
        int[] intArray26 = ds.MaxMin4.maxMin4(intArray23, (int) (short) 0, (int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray29 = ds.MaxMin4.maxMin4(intArray26, (int) (short) 100, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[0, 100, 35, 100, 32]");
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[100, 0]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[100, 0]");
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[100, 0]");
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[100, 0]");
        org.junit.Assert.assertNotNull(intArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray20), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray23), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray26), "[0, 0]");
    }

    @Test
    public void test2164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2164");
        int[] intArray5 = new int[] { 0, (short) 100, '#', (byte) 100, ' ' };
        int[] intArray8 = ds.MaxMin4.maxMin4(intArray5, 1, (int) (byte) 0);
        int[] intArray11 = ds.MaxMin4.maxMin4(intArray5, (int) (short) 0, 1);
        int[] intArray14 = ds.MaxMin4.maxMin4(intArray5, 0, 1);
        int[] intArray17 = ds.MaxMin4.maxMin4(intArray14, (int) (short) 0, 1);
        int[] intArray20 = ds.MaxMin4.maxMin4(intArray14, (int) (short) 0, (int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray23 = ds.MaxMin4.maxMin4(intArray14, 0, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[0, 100, 35, 100, 32]");
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[100, 0]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[100, 0]");
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[100, 0]");
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[100, 0]");
        org.junit.Assert.assertNotNull(intArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray20), "[100, 0]");
    }

    @Test
    public void test2165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2165");
        int[] intArray5 = new int[] { 0, (short) 100, '#', (byte) 100, ' ' };
        int[] intArray8 = ds.MaxMin4.maxMin4(intArray5, 1, (int) (byte) 0);
        int[] intArray11 = ds.MaxMin4.maxMin4(intArray5, 0, (int) (byte) 1);
        int[] intArray14 = ds.MaxMin4.maxMin4(intArray5, (int) (short) 1, 1);
        int[] intArray17 = ds.MaxMin4.maxMin4(intArray5, (int) (short) 0, (int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray20 = ds.MaxMin4.maxMin4(intArray5, (int) (short) 10, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[0, 100, 35, 100, 32]");
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[100, 0]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[100, 0]");
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[0, 0]");
    }

    @Test
    public void test2166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2166");
        int[] intArray5 = new int[] { 0, (short) 100, '#', (byte) 100, ' ' };
        int[] intArray8 = ds.MaxMin4.maxMin4(intArray5, 1, (int) (byte) 0);
        int[] intArray11 = ds.MaxMin4.maxMin4(intArray5, (int) (short) 1, 0);
        int[] intArray14 = ds.MaxMin4.maxMin4(intArray5, 0, 0);
        int[] intArray17 = ds.MaxMin4.maxMin4(intArray5, (int) (byte) 1, 0);
        int[] intArray20 = ds.MaxMin4.maxMin4(intArray5, 0, 1);
        int[] intArray23 = ds.MaxMin4.maxMin4(intArray20, (int) (byte) 0, (int) (short) 0);
        int[] intArray26 = ds.MaxMin4.maxMin4(intArray23, (int) (short) 1, (int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray29 = ds.MaxMin4.maxMin4(intArray26, 0, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[0, 100, 35, 100, 32]");
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[100, 0]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[100, 0]");
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[100, 0]");
        org.junit.Assert.assertNotNull(intArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray20), "[100, 0]");
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray23), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray26), "[100, 100]");
    }

    @Test
    public void test2167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2167");
        int[] intArray5 = new int[] { 0, (short) 100, '#', (byte) 100, ' ' };
        int[] intArray8 = ds.MaxMin4.maxMin4(intArray5, 1, (int) (byte) 0);
        int[] intArray11 = ds.MaxMin4.maxMin4(intArray5, 0, (int) (byte) 1);
        int[] intArray14 = ds.MaxMin4.maxMin4(intArray5, (int) (short) 1, 1);
        int[] intArray17 = ds.MaxMin4.maxMin4(intArray14, 0, (int) (short) 1);
        int[] intArray20 = ds.MaxMin4.maxMin4(intArray14, 0, (int) (short) 0);
        int[] intArray23 = ds.MaxMin4.maxMin4(intArray14, 0, (int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray26 = ds.MaxMin4.maxMin4(intArray14, 1, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[0, 100, 35, 100, 32]");
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[100, 0]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[100, 0]");
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray20), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray23), "[100, 100]");
    }

    @Test
    public void test2168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2168");
        int[] intArray5 = new int[] { 0, (short) 100, '#', (byte) 100, ' ' };
        int[] intArray8 = ds.MaxMin4.maxMin4(intArray5, 1, (int) (byte) 0);
        int[] intArray11 = ds.MaxMin4.maxMin4(intArray8, (int) (byte) 0, (int) (byte) 1);
        int[] intArray14 = ds.MaxMin4.maxMin4(intArray8, (int) (byte) 0, 1);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray17 = ds.MaxMin4.maxMin4(intArray14, (int) (byte) 1, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[0, 100, 35, 100, 32]");
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[100, 0]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[100, 0]");
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[100, 0]");
    }

    @Test
    public void test2169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2169");
        int[] intArray5 = new int[] { 0, (short) 100, '#', (byte) 100, ' ' };
        int[] intArray8 = ds.MaxMin4.maxMin4(intArray5, 1, (int) (byte) 0);
        int[] intArray11 = ds.MaxMin4.maxMin4(intArray8, (int) (byte) 0, (int) (byte) 1);
        int[] intArray14 = ds.MaxMin4.maxMin4(intArray11, (int) (byte) 1, 0);
        int[] intArray17 = ds.MaxMin4.maxMin4(intArray11, (int) (short) 0, 0);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray20 = ds.MaxMin4.maxMin4(intArray11, (int) (byte) 10, 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[0, 100, 35, 100, 32]");
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[100, 0]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[100, 0]");
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[100, 0]");
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[100, 100]");
    }

    @Test
    public void test2170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2170");
        int[] intArray5 = new int[] { 0, (short) 100, '#', (byte) 100, ' ' };
        int[] intArray8 = ds.MaxMin4.maxMin4(intArray5, 1, (int) (byte) 0);
        int[] intArray11 = ds.MaxMin4.maxMin4(intArray5, (int) (short) 1, 0);
        int[] intArray14 = ds.MaxMin4.maxMin4(intArray5, 0, 0);
        int[] intArray17 = ds.MaxMin4.maxMin4(intArray5, 0, 0);
        int[] intArray20 = ds.MaxMin4.maxMin4(intArray5, (int) (short) 1, 0);
        int[] intArray23 = ds.MaxMin4.maxMin4(intArray20, (int) (byte) 0, (int) (short) 0);
        int[] intArray26 = ds.MaxMin4.maxMin4(intArray20, 1, 0);
        int[] intArray29 = ds.MaxMin4.maxMin4(intArray26, (int) (short) 1, 0);
        int[] intArray32 = ds.MaxMin4.maxMin4(intArray26, (int) (short) 0, (int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray35 = ds.MaxMin4.maxMin4(intArray32, 1, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[0, 100, 35, 100, 32]");
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[100, 0]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[100, 0]");
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray20), "[100, 0]");
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray23), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray26), "[100, 0]");
        org.junit.Assert.assertNotNull(intArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray29), "[100, 0]");
        org.junit.Assert.assertNotNull(intArray32);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray32), "[100, 100]");
    }

    @Test
    public void test2171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2171");
        int[] intArray5 = new int[] { 0, (short) 100, '#', (byte) 100, ' ' };
        int[] intArray8 = ds.MaxMin4.maxMin4(intArray5, 1, (int) (byte) 0);
        int[] intArray11 = ds.MaxMin4.maxMin4(intArray8, (int) (byte) 0, (int) (byte) 1);
        int[] intArray14 = ds.MaxMin4.maxMin4(intArray8, (int) (byte) 0, 1);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray17 = ds.MaxMin4.maxMin4(intArray14, (int) (short) 100, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[0, 100, 35, 100, 32]");
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[100, 0]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[100, 0]");
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[100, 0]");
    }

    @Test
    public void test2172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2172");
        int[] intArray5 = new int[] { 0, (short) 100, '#', (byte) 100, ' ' };
        int[] intArray8 = ds.MaxMin4.maxMin4(intArray5, 1, (int) (byte) 0);
        int[] intArray11 = ds.MaxMin4.maxMin4(intArray5, (int) (short) 0, 1);
        int[] intArray14 = ds.MaxMin4.maxMin4(intArray5, 0, 1);
        int[] intArray17 = ds.MaxMin4.maxMin4(intArray14, (int) (short) 0, 1);
        int[] intArray20 = ds.MaxMin4.maxMin4(intArray14, (int) (byte) 1, 0);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray23 = ds.MaxMin4.maxMin4(intArray20, (int) 'a', 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[0, 100, 35, 100, 32]");
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[100, 0]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[100, 0]");
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[100, 0]");
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[100, 0]");
        org.junit.Assert.assertNotNull(intArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray20), "[100, 0]");
    }

    @Test
    public void test2173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2173");
        int[] intArray5 = new int[] { 0, (short) 100, '#', (byte) 100, ' ' };
        int[] intArray8 = ds.MaxMin4.maxMin4(intArray5, 1, (int) (byte) 0);
        int[] intArray11 = ds.MaxMin4.maxMin4(intArray8, (int) (byte) 0, (int) (byte) 1);
        int[] intArray14 = ds.MaxMin4.maxMin4(intArray8, (int) (byte) 0, 1);
        int[] intArray17 = ds.MaxMin4.maxMin4(intArray14, (int) (byte) 0, 1);
        int[] intArray20 = ds.MaxMin4.maxMin4(intArray17, 0, 1);
        int[] intArray23 = ds.MaxMin4.maxMin4(intArray17, 1, (int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray26 = ds.MaxMin4.maxMin4(intArray23, (int) 'a', (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[0, 100, 35, 100, 32]");
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[100, 0]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[100, 0]");
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[100, 0]");
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[100, 0]");
        org.junit.Assert.assertNotNull(intArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray20), "[100, 0]");
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray23), "[0, 0]");
    }

    @Test
    public void test2174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2174");
        int[] intArray5 = new int[] { 0, (short) 100, '#', (byte) 100, ' ' };
        int[] intArray8 = ds.MaxMin4.maxMin4(intArray5, 1, (int) (byte) 0);
        int[] intArray11 = ds.MaxMin4.maxMin4(intArray8, (int) (byte) 0, (int) (byte) 1);
        int[] intArray14 = ds.MaxMin4.maxMin4(intArray11, (int) (byte) 1, 0);
        int[] intArray17 = ds.MaxMin4.maxMin4(intArray14, 0, 0);
        java.lang.Class<?> wildcardClass18 = intArray17.getClass();
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[0, 100, 35, 100, 32]");
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[100, 0]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[100, 0]");
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[100, 0]");
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[100, 100]");
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test2175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2175");
        int[] intArray5 = new int[] { 0, (short) 100, '#', (byte) 100, ' ' };
        int[] intArray8 = ds.MaxMin4.maxMin4(intArray5, 1, (int) (byte) 0);
        int[] intArray11 = ds.MaxMin4.maxMin4(intArray8, (int) (byte) 0, (int) (byte) 1);
        int[] intArray14 = ds.MaxMin4.maxMin4(intArray8, (int) (byte) 0, 1);
        int[] intArray17 = ds.MaxMin4.maxMin4(intArray8, (int) (byte) 1, (int) (short) 0);
        int[] intArray20 = ds.MaxMin4.maxMin4(intArray17, (int) (byte) 0, (int) (short) 0);
        int[] intArray23 = ds.MaxMin4.maxMin4(intArray20, 1, (int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray26 = ds.MaxMin4.maxMin4(intArray20, (int) '#', (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[0, 100, 35, 100, 32]");
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[100, 0]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[100, 0]");
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[100, 0]");
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[100, 0]");
        org.junit.Assert.assertNotNull(intArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray20), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray23), "[100, 100]");
    }

    @Test
    public void test2176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2176");
        int[] intArray5 = new int[] { 0, (short) 100, '#', (byte) 100, ' ' };
        int[] intArray8 = ds.MaxMin4.maxMin4(intArray5, 1, (int) (byte) 0);
        int[] intArray11 = ds.MaxMin4.maxMin4(intArray8, 0, (int) (short) 1);
        int[] intArray14 = ds.MaxMin4.maxMin4(intArray11, (int) (byte) 1, 0);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray17 = ds.MaxMin4.maxMin4(intArray11, (int) (byte) -1, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[0, 100, 35, 100, 32]");
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[100, 0]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[100, 0]");
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[100, 0]");
    }

    @Test
    public void test2177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2177");
        int[] intArray5 = new int[] { 0, (short) 100, '#', (byte) 100, ' ' };
        int[] intArray8 = ds.MaxMin4.maxMin4(intArray5, 1, (int) (byte) 0);
        int[] intArray11 = ds.MaxMin4.maxMin4(intArray8, (int) (byte) 0, (int) (byte) 1);
        int[] intArray14 = ds.MaxMin4.maxMin4(intArray8, (int) (byte) 0, 1);
        int[] intArray17 = ds.MaxMin4.maxMin4(intArray14, (int) (byte) 0, 1);
        int[] intArray20 = ds.MaxMin4.maxMin4(intArray17, 0, 1);
        int[] intArray23 = ds.MaxMin4.maxMin4(intArray17, 1, (int) (byte) 1);
        java.lang.Class<?> wildcardClass24 = intArray23.getClass();
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[0, 100, 35, 100, 32]");
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[100, 0]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[100, 0]");
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[100, 0]");
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[100, 0]");
        org.junit.Assert.assertNotNull(intArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray20), "[100, 0]");
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray23), "[0, 0]");
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test2178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2178");
        int[] intArray6 = new int[] { 0, (byte) -1, (short) 0, (byte) 1, (short) 100, 100 };
        int[] intArray9 = ds.MaxMin4.maxMin4(intArray6, (int) (byte) 0, (int) (short) 0);
        int[] intArray12 = ds.MaxMin4.maxMin4(intArray6, (int) (byte) 1, (int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray15 = ds.MaxMin4.maxMin4(intArray6, (int) (short) 0, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[0, -1, 0, 1, 100, 100]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[0, -1]");
    }

    @Test
    public void test2179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2179");
        int[] intArray5 = new int[] { 0, (short) 100, '#', (byte) 100, ' ' };
        int[] intArray8 = ds.MaxMin4.maxMin4(intArray5, 1, (int) (byte) 0);
        int[] intArray11 = ds.MaxMin4.maxMin4(intArray5, (int) (short) 1, 0);
        int[] intArray14 = ds.MaxMin4.maxMin4(intArray11, 1, (int) (byte) 0);
        int[] intArray17 = ds.MaxMin4.maxMin4(intArray14, (int) (short) 1, 1);
        int[] intArray20 = ds.MaxMin4.maxMin4(intArray17, (int) (short) 1, (int) (short) 1);
        int[] intArray23 = ds.MaxMin4.maxMin4(intArray17, (int) (byte) 1, (int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray26 = ds.MaxMin4.maxMin4(intArray23, (int) ' ', (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[0, 100, 35, 100, 32]");
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[100, 0]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[100, 0]");
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[100, 0]");
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray20), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray23), "[0, 0]");
    }

    @Test
    public void test2180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2180");
        int[] intArray5 = new int[] { 0, (short) 100, '#', (byte) 100, ' ' };
        int[] intArray8 = ds.MaxMin4.maxMin4(intArray5, 1, (int) (byte) 0);
        int[] intArray11 = ds.MaxMin4.maxMin4(intArray5, 0, (int) (byte) 1);
        int[] intArray14 = ds.MaxMin4.maxMin4(intArray5, (int) (short) 1, 1);
        int[] intArray17 = ds.MaxMin4.maxMin4(intArray14, (int) (byte) 0, (int) (byte) 0);
        int[] intArray20 = ds.MaxMin4.maxMin4(intArray17, (int) (short) 0, 1);
        int[] intArray23 = ds.MaxMin4.maxMin4(intArray17, 0, (int) (short) 1);
        int[] intArray26 = ds.MaxMin4.maxMin4(intArray17, 0, 0);
        int[] intArray29 = ds.MaxMin4.maxMin4(intArray26, 0, 0);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray32 = ds.MaxMin4.maxMin4(intArray29, (int) (byte) 10, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[0, 100, 35, 100, 32]");
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[100, 0]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[100, 0]");
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray20), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray23), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray26), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray29), "[100, 100]");
    }

    @Test
    public void test2181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2181");
        int[] intArray5 = new int[] { 0, (short) 100, '#', (byte) 100, ' ' };
        int[] intArray8 = ds.MaxMin4.maxMin4(intArray5, 1, (int) (byte) 0);
        int[] intArray11 = ds.MaxMin4.maxMin4(intArray8, 0, (int) (short) 1);
        int[] intArray14 = ds.MaxMin4.maxMin4(intArray11, (int) (byte) 1, 0);
        int[] intArray17 = ds.MaxMin4.maxMin4(intArray11, (int) (short) 1, 1);
        int[] intArray20 = ds.MaxMin4.maxMin4(intArray17, (int) (byte) 0, 0);
        int[] intArray23 = ds.MaxMin4.maxMin4(intArray20, 1, 1);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray26 = ds.MaxMin4.maxMin4(intArray20, (int) (short) 1, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[0, 100, 35, 100, 32]");
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[100, 0]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[100, 0]");
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[100, 0]");
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray20), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray23), "[0, 0]");
    }

    @Test
    public void test2182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2182");
        int[] intArray6 = new int[] { 0, (byte) -1, (short) 0, (byte) 1, (short) 100, 100 };
        int[] intArray9 = ds.MaxMin4.maxMin4(intArray6, (int) (byte) 0, (int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray12 = ds.MaxMin4.maxMin4(intArray9, (int) (short) 10, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[0, -1, 0, 1, 100, 100]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[0, 0]");
    }

    @Test
    public void test2183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2183");
        int[] intArray5 = new int[] { 0, (short) 100, '#', (byte) 100, ' ' };
        int[] intArray8 = ds.MaxMin4.maxMin4(intArray5, 1, (int) (byte) 0);
        int[] intArray11 = ds.MaxMin4.maxMin4(intArray5, (int) (short) 1, 0);
        int[] intArray14 = ds.MaxMin4.maxMin4(intArray5, 0, 0);
        int[] intArray17 = ds.MaxMin4.maxMin4(intArray5, (int) (short) 0, 0);
        int[] intArray20 = ds.MaxMin4.maxMin4(intArray17, (int) (short) 0, (int) (byte) 1);
        int[] intArray23 = ds.MaxMin4.maxMin4(intArray17, 0, 1);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray26 = ds.MaxMin4.maxMin4(intArray17, (int) (short) 10, (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[0, 100, 35, 100, 32]");
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[100, 0]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[100, 0]");
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray20), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray23), "[0, 0]");
    }

    @Test
    public void test2184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2184");
        int[] intArray5 = new int[] { 0, (short) 100, '#', (byte) 100, ' ' };
        int[] intArray8 = ds.MaxMin4.maxMin4(intArray5, 1, (int) (byte) 0);
        int[] intArray11 = ds.MaxMin4.maxMin4(intArray5, 0, (int) (byte) 1);
        int[] intArray14 = ds.MaxMin4.maxMin4(intArray5, (int) (short) 1, 1);
        int[] intArray17 = ds.MaxMin4.maxMin4(intArray5, (int) (short) 0, (int) (byte) 0);
        int[] intArray20 = ds.MaxMin4.maxMin4(intArray17, (int) (short) 1, (int) (byte) 1);
        int[] intArray23 = ds.MaxMin4.maxMin4(intArray20, 0, (int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray26 = ds.MaxMin4.maxMin4(intArray23, (int) (short) 100, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[0, 100, 35, 100, 32]");
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[100, 0]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[100, 0]");
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray20), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray23), "[0, 0]");
    }

    @Test
    public void test2185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2185");
        int[] intArray5 = new int[] { 0, (short) 100, '#', (byte) 100, ' ' };
        int[] intArray8 = ds.MaxMin4.maxMin4(intArray5, 1, (int) (byte) 0);
        int[] intArray11 = ds.MaxMin4.maxMin4(intArray5, (int) (short) 1, 0);
        int[] intArray14 = ds.MaxMin4.maxMin4(intArray11, 1, (int) (byte) 0);
        int[] intArray17 = ds.MaxMin4.maxMin4(intArray14, (int) (short) 1, 1);
        int[] intArray20 = ds.MaxMin4.maxMin4(intArray17, (int) (short) 1, (int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray23 = ds.MaxMin4.maxMin4(intArray17, (int) (byte) 100, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[0, 100, 35, 100, 32]");
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[100, 0]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[100, 0]");
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[100, 0]");
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray20), "[0, 0]");
    }

    @Test
    public void test2186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2186");
        int[] intArray0 = null;
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray3 = ds.MaxMin4.maxMin4(intArray0, (int) (byte) 1, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2187");
        int[] intArray5 = new int[] { 0, (short) 100, '#', (byte) 100, ' ' };
        int[] intArray8 = ds.MaxMin4.maxMin4(intArray5, 1, (int) (byte) 0);
        int[] intArray11 = ds.MaxMin4.maxMin4(intArray8, (int) (byte) 0, (int) (byte) 1);
        int[] intArray14 = ds.MaxMin4.maxMin4(intArray8, (int) (byte) 0, 1);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray17 = ds.MaxMin4.maxMin4(intArray14, (int) (byte) 100, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[0, 100, 35, 100, 32]");
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[100, 0]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[100, 0]");
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[100, 0]");
    }

    @Test
    public void test2188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2188");
        int[] intArray6 = new int[] { (byte) 1, (short) 1, ' ', (-1), (byte) 1, 'a' };
        int[] intArray9 = ds.MaxMin4.maxMin4(intArray6, 0, (int) (short) 1);
        int[] intArray12 = ds.MaxMin4.maxMin4(intArray9, (int) (short) 1, 0);
        int[] intArray15 = ds.MaxMin4.maxMin4(intArray12, 1, (int) (byte) 1);
        int[] intArray18 = ds.MaxMin4.maxMin4(intArray15, (int) (byte) 1, 0);
        int[] intArray21 = ds.MaxMin4.maxMin4(intArray15, (int) (byte) 1, 0);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray24 = ds.MaxMin4.maxMin4(intArray21, (int) (short) 100, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[1, 1, 32, -1, 1, 97]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[1, 1]");
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
    public void test2189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2189");
        int[] intArray5 = new int[] { 0, (short) 100, '#', (byte) 100, ' ' };
        int[] intArray8 = ds.MaxMin4.maxMin4(intArray5, 1, (int) (byte) 0);
        int[] intArray11 = ds.MaxMin4.maxMin4(intArray5, (int) (short) 1, 0);
        int[] intArray14 = ds.MaxMin4.maxMin4(intArray5, 0, 0);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray17 = ds.MaxMin4.maxMin4(intArray5, (-1), (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[0, 100, 35, 100, 32]");
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[100, 0]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[100, 0]");
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[0, 0]");
    }

    @Test
    public void test2190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2190");
        int[] intArray5 = new int[] { 0, (short) 100, '#', (byte) 100, ' ' };
        int[] intArray8 = ds.MaxMin4.maxMin4(intArray5, 1, (int) (byte) 0);
        int[] intArray11 = ds.MaxMin4.maxMin4(intArray8, (int) (byte) 0, (int) (byte) 1);
        int[] intArray14 = ds.MaxMin4.maxMin4(intArray8, (int) (byte) 0, 1);
        int[] intArray17 = ds.MaxMin4.maxMin4(intArray8, (int) (byte) 1, (int) (short) 0);
        int[] intArray20 = ds.MaxMin4.maxMin4(intArray17, (int) (short) 1, (int) (short) 1);
        int[] intArray23 = ds.MaxMin4.maxMin4(intArray20, 0, (int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray26 = ds.MaxMin4.maxMin4(intArray23, (int) '#', (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[0, 100, 35, 100, 32]");
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[100, 0]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[100, 0]");
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[100, 0]");
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[100, 0]");
        org.junit.Assert.assertNotNull(intArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray20), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray23), "[0, 0]");
    }

    @Test
    public void test2191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2191");
        int[] intArray5 = new int[] { '4', 10, (byte) 1, 100, (short) 0 };
        int[] intArray8 = ds.MaxMin4.maxMin4(intArray5, (int) (byte) 1, 1);
        java.lang.Class<?> wildcardClass9 = intArray8.getClass();
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[52, 10, 1, 100, 0]");
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[10, 10]");
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test2192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2192");
        int[] intArray5 = new int[] { 0, (short) 100, '#', (byte) 100, ' ' };
        int[] intArray8 = ds.MaxMin4.maxMin4(intArray5, 1, (int) (byte) 0);
        int[] intArray11 = ds.MaxMin4.maxMin4(intArray8, (int) (byte) 0, (int) (byte) 1);
        int[] intArray14 = ds.MaxMin4.maxMin4(intArray11, (int) (byte) 1, 0);
        int[] intArray17 = ds.MaxMin4.maxMin4(intArray11, (int) (short) 0, 0);
        int[] intArray20 = ds.MaxMin4.maxMin4(intArray17, (int) (short) 1, (int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray23 = ds.MaxMin4.maxMin4(intArray20, (int) (byte) 10, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[0, 100, 35, 100, 32]");
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[100, 0]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[100, 0]");
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[100, 0]");
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray20), "[100, 100]");
    }

    @Test
    public void test2193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2193");
        int[] intArray5 = new int[] { 0, (short) 100, '#', (byte) 100, ' ' };
        int[] intArray8 = ds.MaxMin4.maxMin4(intArray5, 1, (int) (byte) 0);
        int[] intArray11 = ds.MaxMin4.maxMin4(intArray5, (int) (short) 1, 0);
        int[] intArray14 = ds.MaxMin4.maxMin4(intArray5, 0, 0);
        int[] intArray17 = ds.MaxMin4.maxMin4(intArray14, (int) (short) 0, (int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray20 = ds.MaxMin4.maxMin4(intArray14, 0, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[0, 100, 35, 100, 32]");
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[100, 0]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[100, 0]");
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[0, 0]");
    }

    @Test
    public void test2194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2194");
        int[] intArray5 = new int[] { 0, (short) 100, '#', (byte) 100, ' ' };
        int[] intArray8 = ds.MaxMin4.maxMin4(intArray5, 1, (int) (byte) 0);
        int[] intArray11 = ds.MaxMin4.maxMin4(intArray8, (int) (byte) 0, (int) (byte) 1);
        int[] intArray14 = ds.MaxMin4.maxMin4(intArray11, 1, 0);
        int[] intArray17 = ds.MaxMin4.maxMin4(intArray11, (int) (byte) 0, 0);
        int[] intArray20 = ds.MaxMin4.maxMin4(intArray17, 0, (int) (byte) 0);
        int[] intArray23 = ds.MaxMin4.maxMin4(intArray17, 0, (int) (short) 0);
        java.lang.Class<?> wildcardClass24 = intArray17.getClass();
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[0, 100, 35, 100, 32]");
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[100, 0]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[100, 0]");
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[100, 0]");
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray20), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray23), "[100, 100]");
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test2195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2195");
        int[] intArray5 = new int[] { 0, (short) 100, '#', (byte) 100, ' ' };
        int[] intArray8 = ds.MaxMin4.maxMin4(intArray5, 1, (int) (byte) 0);
        int[] intArray11 = ds.MaxMin4.maxMin4(intArray8, (int) (byte) 0, (int) (byte) 1);
        int[] intArray14 = ds.MaxMin4.maxMin4(intArray8, (int) (byte) 0, 1);
        int[] intArray17 = ds.MaxMin4.maxMin4(intArray8, (int) (byte) 1, (int) (short) 0);
        int[] intArray20 = ds.MaxMin4.maxMin4(intArray8, 0, (int) (byte) 1);
        int[] intArray23 = ds.MaxMin4.maxMin4(intArray20, (int) (byte) 0, (int) (byte) 0);
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[0, 100, 35, 100, 32]");
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[100, 0]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[100, 0]");
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[100, 0]");
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[100, 0]");
        org.junit.Assert.assertNotNull(intArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray20), "[100, 0]");
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray23), "[100, 100]");
    }

    @Test
    public void test2196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2196");
        int[] intArray5 = new int[] { 0, (short) 100, '#', (byte) 100, ' ' };
        int[] intArray8 = ds.MaxMin4.maxMin4(intArray5, 1, (int) (byte) 0);
        int[] intArray11 = ds.MaxMin4.maxMin4(intArray5, (int) (short) 1, 0);
        int[] intArray14 = ds.MaxMin4.maxMin4(intArray5, 0, 0);
        int[] intArray17 = ds.MaxMin4.maxMin4(intArray5, (int) (byte) 1, 0);
        int[] intArray20 = ds.MaxMin4.maxMin4(intArray5, 0, 1);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray23 = ds.MaxMin4.maxMin4(intArray5, (int) '#', (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[0, 100, 35, 100, 32]");
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[100, 0]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[100, 0]");
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[100, 0]");
        org.junit.Assert.assertNotNull(intArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray20), "[100, 0]");
    }

    @Test
    public void test2197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2197");
        int[] intArray5 = new int[] { 0, (short) 100, '#', (byte) 100, ' ' };
        int[] intArray8 = ds.MaxMin4.maxMin4(intArray5, 1, (int) (byte) 0);
        int[] intArray11 = ds.MaxMin4.maxMin4(intArray8, (int) (byte) 0, (int) (byte) 1);
        int[] intArray14 = ds.MaxMin4.maxMin4(intArray8, (int) (byte) 0, 1);
        int[] intArray17 = ds.MaxMin4.maxMin4(intArray14, (int) (byte) 0, 1);
        int[] intArray20 = ds.MaxMin4.maxMin4(intArray17, 0, 1);
        int[] intArray23 = ds.MaxMin4.maxMin4(intArray20, 1, 0);
        int[] intArray26 = ds.MaxMin4.maxMin4(intArray20, (int) (short) 1, (int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray29 = ds.MaxMin4.maxMin4(intArray26, (int) '4', 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[0, 100, 35, 100, 32]");
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[100, 0]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[100, 0]");
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[100, 0]");
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[100, 0]");
        org.junit.Assert.assertNotNull(intArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray20), "[100, 0]");
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray23), "[100, 0]");
        org.junit.Assert.assertNotNull(intArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray26), "[100, 0]");
    }

    @Test
    public void test2198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2198");
        int[] intArray5 = new int[] { 0, (short) 100, '#', (byte) 100, ' ' };
        int[] intArray8 = ds.MaxMin4.maxMin4(intArray5, 1, (int) (byte) 0);
        int[] intArray11 = ds.MaxMin4.maxMin4(intArray8, (int) (byte) 0, (int) (byte) 1);
        int[] intArray14 = ds.MaxMin4.maxMin4(intArray8, (int) (byte) 0, 1);
        int[] intArray17 = ds.MaxMin4.maxMin4(intArray8, (int) (byte) 1, (int) (short) 0);
        int[] intArray20 = ds.MaxMin4.maxMin4(intArray8, 0, (int) (byte) 1);
        int[] intArray23 = ds.MaxMin4.maxMin4(intArray8, (int) (short) 0, (int) (short) 0);
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[0, 100, 35, 100, 32]");
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[100, 0]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[100, 0]");
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[100, 0]");
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[100, 0]");
        org.junit.Assert.assertNotNull(intArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray20), "[100, 0]");
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray23), "[100, 100]");
    }

    @Test
    public void test2199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2199");
        int[] intArray5 = new int[] { 0, (short) 100, '#', (byte) 100, ' ' };
        int[] intArray8 = ds.MaxMin4.maxMin4(intArray5, 1, (int) (byte) 0);
        int[] intArray11 = ds.MaxMin4.maxMin4(intArray8, (int) (byte) 0, (int) (byte) 1);
        int[] intArray14 = ds.MaxMin4.maxMin4(intArray8, (int) (byte) 0, 1);
        int[] intArray17 = ds.MaxMin4.maxMin4(intArray8, 0, (int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray20 = ds.MaxMin4.maxMin4(intArray8, (int) (byte) 10, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[0, 100, 35, 100, 32]");
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[100, 0]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[100, 0]");
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[100, 0]");
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[100, 0]");
    }

    @Test
    public void test2200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2200");
        int[] intArray5 = new int[] { 0, (short) 100, '#', (byte) 100, ' ' };
        int[] intArray8 = ds.MaxMin4.maxMin4(intArray5, 1, (int) (byte) 0);
        int[] intArray11 = ds.MaxMin4.maxMin4(intArray8, (int) (byte) 0, (int) (byte) 1);
        int[] intArray14 = ds.MaxMin4.maxMin4(intArray8, (int) (byte) 0, 1);
        int[] intArray17 = ds.MaxMin4.maxMin4(intArray8, (int) (byte) 1, (int) (short) 0);
        int[] intArray20 = ds.MaxMin4.maxMin4(intArray17, (int) (byte) 0, (int) (short) 0);
        int[] intArray23 = ds.MaxMin4.maxMin4(intArray20, 1, 0);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray26 = ds.MaxMin4.maxMin4(intArray20, (int) 'a', 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[0, 100, 35, 100, 32]");
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[100, 0]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[100, 0]");
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[100, 0]");
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[100, 0]");
        org.junit.Assert.assertNotNull(intArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray20), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray23), "[100, 100]");
    }

    @Test
    public void test2201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2201");
        int[] intArray5 = new int[] { 0, (short) 100, '#', (byte) 100, ' ' };
        int[] intArray8 = ds.MaxMin4.maxMin4(intArray5, 1, (int) (byte) 0);
        int[] intArray11 = ds.MaxMin4.maxMin4(intArray8, (int) (byte) 0, (int) (byte) 1);
        int[] intArray14 = ds.MaxMin4.maxMin4(intArray8, (int) (byte) 0, 1);
        int[] intArray17 = ds.MaxMin4.maxMin4(intArray8, (int) (byte) 1, (int) (short) 0);
        int[] intArray20 = ds.MaxMin4.maxMin4(intArray17, (int) (short) 1, (int) (short) 1);
        int[] intArray23 = ds.MaxMin4.maxMin4(intArray20, 1, (int) (byte) 0);
        int[] intArray26 = ds.MaxMin4.maxMin4(intArray23, (int) (short) 0, (int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray29 = ds.MaxMin4.maxMin4(intArray26, (int) ' ', (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[0, 100, 35, 100, 32]");
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[100, 0]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[100, 0]");
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[100, 0]");
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[100, 0]");
        org.junit.Assert.assertNotNull(intArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray20), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray23), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray26), "[0, 0]");
    }

    @Test
    public void test2202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2202");
        int[] intArray5 = new int[] { 0, (short) 100, '#', (byte) 100, ' ' };
        int[] intArray8 = ds.MaxMin4.maxMin4(intArray5, 1, (int) (byte) 0);
        int[] intArray11 = ds.MaxMin4.maxMin4(intArray5, (int) (short) 1, 0);
        int[] intArray14 = ds.MaxMin4.maxMin4(intArray11, 1, (int) (byte) 0);
        int[] intArray17 = ds.MaxMin4.maxMin4(intArray14, (int) (short) 1, 1);
        int[] intArray20 = ds.MaxMin4.maxMin4(intArray17, (int) (short) 1, (int) (short) 1);
        int[] intArray23 = ds.MaxMin4.maxMin4(intArray17, 0, (int) (byte) 1);
        int[] intArray26 = ds.MaxMin4.maxMin4(intArray23, 0, 1);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray29 = ds.MaxMin4.maxMin4(intArray23, (int) (byte) 10, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[0, 100, 35, 100, 32]");
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[100, 0]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[100, 0]");
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[100, 0]");
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray20), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray23), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray26), "[0, 0]");
    }

    @Test
    public void test2203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2203");
        int[] intArray5 = new int[] { 0, (short) 100, '#', (byte) 100, ' ' };
        int[] intArray8 = ds.MaxMin4.maxMin4(intArray5, 1, (int) (byte) 0);
        int[] intArray11 = ds.MaxMin4.maxMin4(intArray5, (int) (short) 1, 0);
        int[] intArray14 = ds.MaxMin4.maxMin4(intArray5, 0, 0);
        int[] intArray17 = ds.MaxMin4.maxMin4(intArray5, (int) (byte) 1, 0);
        int[] intArray20 = ds.MaxMin4.maxMin4(intArray5, 0, 1);
        int[] intArray23 = ds.MaxMin4.maxMin4(intArray20, (int) (byte) 0, (int) (short) 0);
        int[] intArray26 = ds.MaxMin4.maxMin4(intArray20, 1, 1);
        int[] intArray29 = ds.MaxMin4.maxMin4(intArray26, (int) (short) 1, (int) (byte) 0);
        java.lang.Class<?> wildcardClass30 = intArray26.getClass();
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[0, 100, 35, 100, 32]");
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[100, 0]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[100, 0]");
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[100, 0]");
        org.junit.Assert.assertNotNull(intArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray20), "[100, 0]");
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray23), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray26), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray29), "[0, 0]");
        org.junit.Assert.assertNotNull(wildcardClass30);
    }

    @Test
    public void test2204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2204");
        int[] intArray5 = new int[] { 0, (short) 100, '#', (byte) 100, ' ' };
        int[] intArray8 = ds.MaxMin4.maxMin4(intArray5, 1, (int) (byte) 0);
        int[] intArray11 = ds.MaxMin4.maxMin4(intArray5, (int) (short) 1, 0);
        int[] intArray14 = ds.MaxMin4.maxMin4(intArray5, 0, 0);
        int[] intArray17 = ds.MaxMin4.maxMin4(intArray5, 0, 0);
        int[] intArray20 = ds.MaxMin4.maxMin4(intArray5, (int) (short) 1, 0);
        int[] intArray23 = ds.MaxMin4.maxMin4(intArray20, (int) (byte) 0, (int) (short) 0);
        int[] intArray26 = ds.MaxMin4.maxMin4(intArray20, (int) (byte) 1, (int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray29 = ds.MaxMin4.maxMin4(intArray20, 100, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[0, 100, 35, 100, 32]");
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[100, 0]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[100, 0]");
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray20), "[100, 0]");
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray23), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray26), "[100, 0]");
    }

    @Test
    public void test2205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2205");
        int[] intArray5 = new int[] { 0, (short) 100, '#', (byte) 100, ' ' };
        int[] intArray8 = ds.MaxMin4.maxMin4(intArray5, 1, (int) (byte) 0);
        int[] intArray11 = ds.MaxMin4.maxMin4(intArray5, (int) (short) 1, 0);
        int[] intArray14 = ds.MaxMin4.maxMin4(intArray5, 0, 0);
        int[] intArray17 = ds.MaxMin4.maxMin4(intArray5, (int) (short) 0, 0);
        int[] intArray20 = ds.MaxMin4.maxMin4(intArray17, (int) (short) 0, (int) (byte) 1);
        int[] intArray23 = ds.MaxMin4.maxMin4(intArray20, 1, (int) (byte) 1);
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[0, 100, 35, 100, 32]");
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[100, 0]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[100, 0]");
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray20), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray23), "[0, 0]");
    }

    @Test
    public void test2206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2206");
        int[] intArray5 = new int[] { 0, (short) 100, '#', (byte) 100, ' ' };
        int[] intArray8 = ds.MaxMin4.maxMin4(intArray5, 1, (int) (byte) 0);
        int[] intArray11 = ds.MaxMin4.maxMin4(intArray8, 0, (int) (short) 1);
        int[] intArray14 = ds.MaxMin4.maxMin4(intArray8, 0, (int) (short) 1);
        int[] intArray17 = ds.MaxMin4.maxMin4(intArray14, 0, 1);
        int[] intArray20 = ds.MaxMin4.maxMin4(intArray14, 0, (int) (short) 0);
        int[] intArray23 = ds.MaxMin4.maxMin4(intArray14, 0, (int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray26 = ds.MaxMin4.maxMin4(intArray14, 10, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[0, 100, 35, 100, 32]");
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[100, 0]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[100, 0]");
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[100, 0]");
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[100, 0]");
        org.junit.Assert.assertNotNull(intArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray20), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray23), "[100, 0]");
    }

    @Test
    public void test2207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2207");
        int[] intArray5 = new int[] { 0, (short) 100, '#', (byte) 100, ' ' };
        int[] intArray8 = ds.MaxMin4.maxMin4(intArray5, 1, (int) (byte) 0);
        int[] intArray11 = ds.MaxMin4.maxMin4(intArray8, 0, (int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray14 = ds.MaxMin4.maxMin4(intArray8, (int) (byte) 100, (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[0, 100, 35, 100, 32]");
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[100, 0]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[100, 100]");
    }

    @Test
    public void test2208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2208");
        int[] intArray5 = new int[] { 0, (short) 100, '#', (byte) 100, ' ' };
        int[] intArray8 = ds.MaxMin4.maxMin4(intArray5, 1, (int) (byte) 0);
        int[] intArray11 = ds.MaxMin4.maxMin4(intArray5, (int) (short) 1, 0);
        int[] intArray14 = ds.MaxMin4.maxMin4(intArray5, 0, 0);
        int[] intArray17 = ds.MaxMin4.maxMin4(intArray5, 0, 0);
        int[] intArray20 = ds.MaxMin4.maxMin4(intArray5, (int) (short) 1, 0);
        int[] intArray23 = ds.MaxMin4.maxMin4(intArray20, (int) (byte) 0, (int) (short) 0);
        int[] intArray26 = ds.MaxMin4.maxMin4(intArray20, 1, 0);
        int[] intArray29 = ds.MaxMin4.maxMin4(intArray26, (int) (short) 0, 0);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray32 = ds.MaxMin4.maxMin4(intArray26, (int) (byte) 10, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[0, 100, 35, 100, 32]");
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[100, 0]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[100, 0]");
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray20), "[100, 0]");
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray23), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray26), "[100, 0]");
        org.junit.Assert.assertNotNull(intArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray29), "[100, 100]");
    }

    @Test
    public void test2209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2209");
        int[] intArray5 = new int[] { 0, (short) 100, '#', (byte) 100, ' ' };
        int[] intArray8 = ds.MaxMin4.maxMin4(intArray5, 1, (int) (byte) 0);
        int[] intArray11 = ds.MaxMin4.maxMin4(intArray5, 0, (int) (byte) 1);
        int[] intArray14 = ds.MaxMin4.maxMin4(intArray5, (int) (short) 1, 1);
        int[] intArray17 = ds.MaxMin4.maxMin4(intArray14, (int) (byte) 0, (int) (byte) 0);
        int[] intArray20 = ds.MaxMin4.maxMin4(intArray17, (int) (short) 0, 1);
        int[] intArray23 = ds.MaxMin4.maxMin4(intArray20, (int) (byte) 1, 0);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray26 = ds.MaxMin4.maxMin4(intArray20, 0, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[0, 100, 35, 100, 32]");
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[100, 0]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[100, 0]");
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray20), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray23), "[100, 100]");
    }

    @Test
    public void test2210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2210");
        int[] intArray5 = new int[] { 0, (short) 100, '#', (byte) 100, ' ' };
        int[] intArray8 = ds.MaxMin4.maxMin4(intArray5, 1, (int) (byte) 0);
        int[] intArray11 = ds.MaxMin4.maxMin4(intArray8, (int) (byte) 0, (int) (byte) 1);
        int[] intArray14 = ds.MaxMin4.maxMin4(intArray8, (int) (byte) 0, 1);
        int[] intArray17 = ds.MaxMin4.maxMin4(intArray8, (int) (byte) 1, (int) (short) 0);
        int[] intArray20 = ds.MaxMin4.maxMin4(intArray17, (int) (byte) 0, (int) (short) 0);
        int[] intArray23 = ds.MaxMin4.maxMin4(intArray20, 1, (int) (short) 0);
        java.lang.Class<?> wildcardClass24 = intArray20.getClass();
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[0, 100, 35, 100, 32]");
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[100, 0]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[100, 0]");
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[100, 0]");
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[100, 0]");
        org.junit.Assert.assertNotNull(intArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray20), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray23), "[100, 100]");
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test2211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2211");
        int[] intArray5 = new int[] { 0, (short) 100, '#', (byte) 100, ' ' };
        int[] intArray8 = ds.MaxMin4.maxMin4(intArray5, 1, (int) (byte) 0);
        int[] intArray11 = ds.MaxMin4.maxMin4(intArray5, (int) (short) 1, 0);
        int[] intArray14 = ds.MaxMin4.maxMin4(intArray11, (int) (byte) 1, 0);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray17 = ds.MaxMin4.maxMin4(intArray11, (int) 'a', (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[0, 100, 35, 100, 32]");
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[100, 0]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[100, 0]");
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[100, 0]");
    }

    @Test
    public void test2212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2212");
        int[] intArray5 = new int[] { 0, (short) 100, '#', (byte) 100, ' ' };
        int[] intArray8 = ds.MaxMin4.maxMin4(intArray5, 1, (int) (byte) 0);
        int[] intArray11 = ds.MaxMin4.maxMin4(intArray5, (int) (short) 1, 0);
        int[] intArray14 = ds.MaxMin4.maxMin4(intArray5, 0, 0);
        int[] intArray17 = ds.MaxMin4.maxMin4(intArray5, (int) (byte) 1, 0);
        int[] intArray20 = ds.MaxMin4.maxMin4(intArray5, 0, 1);
        int[] intArray23 = ds.MaxMin4.maxMin4(intArray20, (int) (byte) 0, (int) (short) 0);
        int[] intArray26 = ds.MaxMin4.maxMin4(intArray20, 1, 1);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray29 = ds.MaxMin4.maxMin4(intArray26, (int) '#', (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[0, 100, 35, 100, 32]");
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[100, 0]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[100, 0]");
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[100, 0]");
        org.junit.Assert.assertNotNull(intArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray20), "[100, 0]");
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray23), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray26), "[0, 0]");
    }

    @Test
    public void test2213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2213");
        int[] intArray5 = new int[] { 0, (short) 100, '#', (byte) 100, ' ' };
        int[] intArray8 = ds.MaxMin4.maxMin4(intArray5, 1, (int) (byte) 0);
        int[] intArray11 = ds.MaxMin4.maxMin4(intArray5, (int) (short) 1, 0);
        int[] intArray14 = ds.MaxMin4.maxMin4(intArray5, 0, 0);
        int[] intArray17 = ds.MaxMin4.maxMin4(intArray5, (int) (byte) 1, 0);
        int[] intArray20 = ds.MaxMin4.maxMin4(intArray5, 0, 1);
        int[] intArray23 = ds.MaxMin4.maxMin4(intArray20, (int) (byte) 0, (int) (short) 0);
        int[] intArray26 = ds.MaxMin4.maxMin4(intArray23, (int) (short) 1, (int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray29 = ds.MaxMin4.maxMin4(intArray26, (int) (byte) 1, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[0, 100, 35, 100, 32]");
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[100, 0]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[100, 0]");
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[100, 0]");
        org.junit.Assert.assertNotNull(intArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray20), "[100, 0]");
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray23), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray26), "[100, 100]");
    }

    @Test
    public void test2214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2214");
        int[] intArray5 = new int[] { 0, (short) 100, '#', (byte) 100, ' ' };
        int[] intArray8 = ds.MaxMin4.maxMin4(intArray5, 1, (int) (byte) 0);
        int[] intArray11 = ds.MaxMin4.maxMin4(intArray8, (int) (byte) 0, (int) (byte) 1);
        int[] intArray14 = ds.MaxMin4.maxMin4(intArray8, (int) (byte) 0, 1);
        int[] intArray17 = ds.MaxMin4.maxMin4(intArray8, (int) (byte) 1, (int) (short) 0);
        int[] intArray20 = ds.MaxMin4.maxMin4(intArray17, (int) (short) 1, (int) (short) 1);
        int[] intArray23 = ds.MaxMin4.maxMin4(intArray20, 0, (int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray26 = ds.MaxMin4.maxMin4(intArray20, (int) 'a', (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[0, 100, 35, 100, 32]");
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[100, 0]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[100, 0]");
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[100, 0]");
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[100, 0]");
        org.junit.Assert.assertNotNull(intArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray20), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray23), "[0, 0]");
    }

    @Test
    public void test2215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2215");
        int[] intArray6 = new int[] { 0, (byte) -1, (short) 0, (byte) 1, (short) 100, 100 };
        int[] intArray9 = ds.MaxMin4.maxMin4(intArray6, (int) (byte) 0, (int) (short) 0);
        int[] intArray12 = ds.MaxMin4.maxMin4(intArray9, 0, (int) (byte) 1);
        int[] intArray15 = ds.MaxMin4.maxMin4(intArray9, 0, 0);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray18 = ds.MaxMin4.maxMin4(intArray9, (int) '#', 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[0, -1, 0, 1, 100, 100]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[0, 0]");
    }

    @Test
    public void test2216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2216");
        int[] intArray5 = new int[] { 0, (short) 100, '#', (byte) 100, ' ' };
        int[] intArray8 = ds.MaxMin4.maxMin4(intArray5, 1, (int) (byte) 0);
        int[] intArray11 = ds.MaxMin4.maxMin4(intArray8, (int) (byte) 0, (int) (byte) 1);
        int[] intArray14 = ds.MaxMin4.maxMin4(intArray8, (int) (byte) 0, 1);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray17 = ds.MaxMin4.maxMin4(intArray14, (int) (short) 100, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[0, 100, 35, 100, 32]");
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[100, 0]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[100, 0]");
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[100, 0]");
    }

    @Test
    public void test2217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2217");
        int[] intArray5 = new int[] { 0, (short) 100, '#', (byte) 100, ' ' };
        int[] intArray8 = ds.MaxMin4.maxMin4(intArray5, 1, (int) (byte) 0);
        int[] intArray11 = ds.MaxMin4.maxMin4(intArray5, (int) (short) 1, 0);
        int[] intArray14 = ds.MaxMin4.maxMin4(intArray5, 0, 0);
        int[] intArray17 = ds.MaxMin4.maxMin4(intArray5, 0, 0);
        int[] intArray20 = ds.MaxMin4.maxMin4(intArray5, (int) (short) 1, 0);
        int[] intArray23 = ds.MaxMin4.maxMin4(intArray20, (int) (byte) 0, (int) (short) 0);
        int[] intArray26 = ds.MaxMin4.maxMin4(intArray20, 1, 0);
        int[] intArray29 = ds.MaxMin4.maxMin4(intArray26, (int) (short) 1, 0);
        int[] intArray32 = ds.MaxMin4.maxMin4(intArray26, (int) (short) 1, (int) (short) 0);
        java.lang.Class<?> wildcardClass33 = intArray32.getClass();
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[0, 100, 35, 100, 32]");
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[100, 0]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[100, 0]");
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray20), "[100, 0]");
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray23), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray26), "[100, 0]");
        org.junit.Assert.assertNotNull(intArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray29), "[100, 0]");
        org.junit.Assert.assertNotNull(intArray32);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray32), "[100, 0]");
        org.junit.Assert.assertNotNull(wildcardClass33);
    }

    @Test
    public void test2218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2218");
        int[] intArray5 = new int[] { 0, (short) 100, '#', (byte) 100, ' ' };
        int[] intArray8 = ds.MaxMin4.maxMin4(intArray5, 1, (int) (byte) 0);
        int[] intArray11 = ds.MaxMin4.maxMin4(intArray5, (int) (short) 1, 0);
        int[] intArray14 = ds.MaxMin4.maxMin4(intArray11, 1, (int) (byte) 0);
        int[] intArray17 = ds.MaxMin4.maxMin4(intArray11, (int) (byte) 0, (int) (byte) 1);
        int[] intArray20 = ds.MaxMin4.maxMin4(intArray17, (int) (short) 1, 0);
        int[] intArray23 = ds.MaxMin4.maxMin4(intArray20, (int) (short) 1, (int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray26 = ds.MaxMin4.maxMin4(intArray20, (int) '4', 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[0, 100, 35, 100, 32]");
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[100, 0]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[100, 0]");
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[100, 0]");
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[100, 0]");
        org.junit.Assert.assertNotNull(intArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray20), "[100, 0]");
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray23), "[100, 0]");
    }

    @Test
    public void test2219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2219");
        int[] intArray5 = new int[] { 0, (short) 100, '#', (byte) 100, ' ' };
        int[] intArray8 = ds.MaxMin4.maxMin4(intArray5, 1, (int) (byte) 0);
        int[] intArray11 = ds.MaxMin4.maxMin4(intArray5, (int) (short) 1, 0);
        int[] intArray14 = ds.MaxMin4.maxMin4(intArray11, 1, (int) (byte) 0);
        int[] intArray17 = ds.MaxMin4.maxMin4(intArray14, (int) (short) 1, 1);
        int[] intArray20 = ds.MaxMin4.maxMin4(intArray17, (int) (short) 1, (int) (short) 1);
        int[] intArray23 = ds.MaxMin4.maxMin4(intArray17, (int) (byte) 1, (int) (short) 0);
        java.lang.Class<?> wildcardClass24 = intArray23.getClass();
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[0, 100, 35, 100, 32]");
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[100, 0]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[100, 0]");
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[100, 0]");
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray20), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray23), "[0, 0]");
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test2220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2220");
        int[] intArray2 = new int[] { 100, '4' };
        int[] intArray5 = ds.MaxMin4.maxMin4(intArray2, (int) (short) 1, 1);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray8 = ds.MaxMin4.maxMin4(intArray5, 1, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[100, 52]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[52, 52]");
    }

    @Test
    public void test2221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2221");
        int[] intArray5 = new int[] { 0, (short) 100, '#', (byte) 100, ' ' };
        int[] intArray8 = ds.MaxMin4.maxMin4(intArray5, 1, (int) (byte) 0);
        int[] intArray11 = ds.MaxMin4.maxMin4(intArray8, 0, (int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray14 = ds.MaxMin4.maxMin4(intArray11, (int) (byte) 10, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[0, 100, 35, 100, 32]");
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[100, 0]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[100, 100]");
    }

    @Test
    public void test2222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2222");
        int[] intArray5 = new int[] { 0, (short) 100, '#', (byte) 100, ' ' };
        int[] intArray8 = ds.MaxMin4.maxMin4(intArray5, 1, (int) (byte) 0);
        int[] intArray11 = ds.MaxMin4.maxMin4(intArray8, (int) (byte) 0, (int) (byte) 1);
        int[] intArray14 = ds.MaxMin4.maxMin4(intArray8, (int) (byte) 0, 1);
        int[] intArray17 = ds.MaxMin4.maxMin4(intArray8, (int) (byte) 1, (int) (short) 0);
        int[] intArray20 = ds.MaxMin4.maxMin4(intArray17, (int) (short) 1, (int) (short) 1);
        int[] intArray23 = ds.MaxMin4.maxMin4(intArray17, (int) (short) 0, (int) (short) 1);
        java.lang.Class<?> wildcardClass24 = intArray23.getClass();
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[0, 100, 35, 100, 32]");
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[100, 0]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[100, 0]");
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[100, 0]");
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[100, 0]");
        org.junit.Assert.assertNotNull(intArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray20), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray23), "[100, 0]");
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test2223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2223");
        int[] intArray5 = new int[] { 0, (short) 100, '#', (byte) 100, ' ' };
        int[] intArray8 = ds.MaxMin4.maxMin4(intArray5, 1, (int) (byte) 0);
        int[] intArray11 = ds.MaxMin4.maxMin4(intArray8, (int) (byte) 0, (int) (byte) 1);
        int[] intArray14 = ds.MaxMin4.maxMin4(intArray8, (int) (byte) 0, 1);
        int[] intArray17 = ds.MaxMin4.maxMin4(intArray8, (int) (byte) 1, (int) (short) 0);
        int[] intArray20 = ds.MaxMin4.maxMin4(intArray17, (int) (short) 1, (int) (short) 1);
        int[] intArray23 = ds.MaxMin4.maxMin4(intArray17, (int) (short) 0, (int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray26 = ds.MaxMin4.maxMin4(intArray23, (int) (short) 1, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[0, 100, 35, 100, 32]");
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[100, 0]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[100, 0]");
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[100, 0]");
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[100, 0]");
        org.junit.Assert.assertNotNull(intArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray20), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray23), "[100, 0]");
    }

    @Test
    public void test2224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2224");
        int[] intArray6 = new int[] { (byte) 1, (short) 1, ' ', (-1), (byte) 1, 'a' };
        int[] intArray9 = ds.MaxMin4.maxMin4(intArray6, 0, (int) (short) 1);
        int[] intArray12 = ds.MaxMin4.maxMin4(intArray9, (int) (short) 1, 0);
        int[] intArray15 = ds.MaxMin4.maxMin4(intArray12, 1, (int) (byte) 1);
        int[] intArray18 = ds.MaxMin4.maxMin4(intArray12, (int) (byte) 0, 1);
        int[] intArray21 = ds.MaxMin4.maxMin4(intArray12, (int) (byte) 1, (int) (byte) 0);
        java.lang.Class<?> wildcardClass22 = intArray12.getClass();
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[1, 1, 32, -1, 1, 97]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray18), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray21), "[1, 1]");
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test2225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2225");
        int[] intArray5 = new int[] { 0, (short) 100, '#', (byte) 100, ' ' };
        int[] intArray8 = ds.MaxMin4.maxMin4(intArray5, 1, (int) (byte) 0);
        int[] intArray11 = ds.MaxMin4.maxMin4(intArray5, 0, 0);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray14 = ds.MaxMin4.maxMin4(intArray5, (int) (short) 100, (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[0, 100, 35, 100, 32]");
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[100, 0]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[0, 0]");
    }

    @Test
    public void test2226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2226");
        int[] intArray6 = new int[] { (byte) 1, (short) 1, ' ', (-1), (byte) 1, 'a' };
        int[] intArray9 = ds.MaxMin4.maxMin4(intArray6, 0, (int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray12 = ds.MaxMin4.maxMin4(intArray9, (int) 'a', (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[1, 1, 32, -1, 1, 97]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[1, 1]");
    }

    @Test
    public void test2227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2227");
        int[] intArray5 = new int[] { 0, (short) 100, '#', (byte) 100, ' ' };
        int[] intArray8 = ds.MaxMin4.maxMin4(intArray5, 1, (int) (byte) 0);
        int[] intArray11 = ds.MaxMin4.maxMin4(intArray5, (int) (short) 1, 0);
        int[] intArray14 = ds.MaxMin4.maxMin4(intArray11, 1, (int) (byte) 0);
        int[] intArray17 = ds.MaxMin4.maxMin4(intArray14, (int) (short) 1, 1);
        int[] intArray20 = ds.MaxMin4.maxMin4(intArray17, (int) (short) 1, (int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray23 = ds.MaxMin4.maxMin4(intArray17, (int) 'a', 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[0, 100, 35, 100, 32]");
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[100, 0]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[100, 0]");
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[100, 0]");
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray20), "[0, 0]");
    }

    @Test
    public void test2228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2228");
        int[] intArray5 = new int[] { 0, (short) 100, '#', (byte) 100, ' ' };
        int[] intArray8 = ds.MaxMin4.maxMin4(intArray5, 1, (int) (byte) 0);
        int[] intArray11 = ds.MaxMin4.maxMin4(intArray8, (int) (byte) 0, (int) (byte) 1);
        int[] intArray14 = ds.MaxMin4.maxMin4(intArray8, (int) (byte) 0, 1);
        int[] intArray17 = ds.MaxMin4.maxMin4(intArray8, (int) (byte) 1, (int) (short) 0);
        int[] intArray20 = ds.MaxMin4.maxMin4(intArray17, (int) (short) 1, (int) (short) 1);
        int[] intArray23 = ds.MaxMin4.maxMin4(intArray20, 1, (int) (byte) 0);
        int[] intArray26 = ds.MaxMin4.maxMin4(intArray23, (int) (short) 0, (int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray29 = ds.MaxMin4.maxMin4(intArray26, (int) (byte) 100, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[0, 100, 35, 100, 32]");
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[100, 0]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[100, 0]");
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[100, 0]");
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[100, 0]");
        org.junit.Assert.assertNotNull(intArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray20), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray23), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray26), "[0, 0]");
    }

    @Test
    public void test2229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2229");
        int[] intArray5 = new int[] { 0, (short) 100, '#', (byte) 100, ' ' };
        int[] intArray8 = ds.MaxMin4.maxMin4(intArray5, 1, (int) (byte) 0);
        int[] intArray11 = ds.MaxMin4.maxMin4(intArray5, (int) (short) 1, 0);
        int[] intArray14 = ds.MaxMin4.maxMin4(intArray5, 0, 0);
        int[] intArray17 = ds.MaxMin4.maxMin4(intArray5, (int) (byte) 1, 0);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray20 = ds.MaxMin4.maxMin4(intArray17, (int) (short) 100, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[0, 100, 35, 100, 32]");
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[100, 0]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[100, 0]");
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[100, 0]");
    }

    @Test
    public void test2230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2230");
        int[] intArray5 = new int[] { 0, (short) 100, '#', (byte) 100, ' ' };
        int[] intArray8 = ds.MaxMin4.maxMin4(intArray5, 1, (int) (byte) 0);
        int[] intArray11 = ds.MaxMin4.maxMin4(intArray8, (int) (byte) 0, (int) (byte) 1);
        int[] intArray14 = ds.MaxMin4.maxMin4(intArray8, (int) (byte) 0, 1);
        int[] intArray17 = ds.MaxMin4.maxMin4(intArray14, (int) (byte) 0, 1);
        int[] intArray20 = ds.MaxMin4.maxMin4(intArray17, (int) (short) 1, 0);
        int[] intArray23 = ds.MaxMin4.maxMin4(intArray17, 0, 0);
        java.lang.Class<?> wildcardClass24 = intArray17.getClass();
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[0, 100, 35, 100, 32]");
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[100, 0]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[100, 0]");
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[100, 0]");
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[100, 0]");
        org.junit.Assert.assertNotNull(intArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray20), "[100, 0]");
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray23), "[100, 100]");
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test2231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2231");
        int[] intArray5 = new int[] { 0, (short) 100, '#', (byte) 100, ' ' };
        int[] intArray8 = ds.MaxMin4.maxMin4(intArray5, 1, (int) (byte) 0);
        int[] intArray11 = ds.MaxMin4.maxMin4(intArray8, 0, (int) (short) 1);
        int[] intArray14 = ds.MaxMin4.maxMin4(intArray11, (int) (byte) 1, 0);
        int[] intArray17 = ds.MaxMin4.maxMin4(intArray11, (int) (short) 1, 1);
        int[] intArray20 = ds.MaxMin4.maxMin4(intArray17, (int) (byte) 0, 0);
        int[] intArray23 = ds.MaxMin4.maxMin4(intArray20, 0, 0);
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[0, 100, 35, 100, 32]");
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[100, 0]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[100, 0]");
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[100, 0]");
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray20), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray23), "[0, 0]");
    }

    @Test
    public void test2232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2232");
        int[] intArray5 = new int[] { 0, (short) 100, '#', (byte) 100, ' ' };
        int[] intArray8 = ds.MaxMin4.maxMin4(intArray5, 1, (int) (byte) 0);
        int[] intArray11 = ds.MaxMin4.maxMin4(intArray5, (int) (short) 1, 0);
        int[] intArray14 = ds.MaxMin4.maxMin4(intArray11, 1, (int) (byte) 0);
        int[] intArray17 = ds.MaxMin4.maxMin4(intArray14, (int) (short) 1, 1);
        int[] intArray20 = ds.MaxMin4.maxMin4(intArray17, (int) (short) 1, (int) (short) 1);
        int[] intArray23 = ds.MaxMin4.maxMin4(intArray17, 1, (int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray26 = ds.MaxMin4.maxMin4(intArray23, (int) (byte) 100, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[0, 100, 35, 100, 32]");
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[100, 0]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[100, 0]");
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[100, 0]");
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray20), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray23), "[0, 0]");
    }

    @Test
    public void test2233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2233");
        int[] intArray5 = new int[] { 0, (short) 100, '#', (byte) 100, ' ' };
        int[] intArray8 = ds.MaxMin4.maxMin4(intArray5, 1, (int) (byte) 0);
        int[] intArray11 = ds.MaxMin4.maxMin4(intArray8, (int) (byte) 0, (int) (byte) 1);
        int[] intArray14 = ds.MaxMin4.maxMin4(intArray8, (int) (byte) 0, 1);
        int[] intArray17 = ds.MaxMin4.maxMin4(intArray14, (int) (byte) 0, 1);
        int[] intArray20 = ds.MaxMin4.maxMin4(intArray17, 0, 1);
        int[] intArray23 = ds.MaxMin4.maxMin4(intArray20, 1, 0);
        int[] intArray26 = ds.MaxMin4.maxMin4(intArray20, (int) (short) 1, (int) (byte) 0);
        java.lang.Class<?> wildcardClass27 = intArray26.getClass();
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[0, 100, 35, 100, 32]");
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[100, 0]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[100, 0]");
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[100, 0]");
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[100, 0]");
        org.junit.Assert.assertNotNull(intArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray20), "[100, 0]");
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray23), "[100, 0]");
        org.junit.Assert.assertNotNull(intArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray26), "[100, 0]");
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test2234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2234");
        int[] intArray5 = new int[] { 0, (short) 100, '#', (byte) 100, ' ' };
        int[] intArray8 = ds.MaxMin4.maxMin4(intArray5, 1, (int) (byte) 0);
        int[] intArray11 = ds.MaxMin4.maxMin4(intArray5, (int) (short) 0, 1);
        int[] intArray14 = ds.MaxMin4.maxMin4(intArray5, 0, 1);
        int[] intArray17 = ds.MaxMin4.maxMin4(intArray14, (int) (short) 0, 1);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray20 = ds.MaxMin4.maxMin4(intArray17, (int) (short) 10, 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[0, 100, 35, 100, 32]");
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[100, 0]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[100, 0]");
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[100, 0]");
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[100, 0]");
    }

    @Test
    public void test2235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2235");
        int[] intArray5 = new int[] { 0, (short) 100, '#', (byte) 100, ' ' };
        int[] intArray8 = ds.MaxMin4.maxMin4(intArray5, 1, (int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray11 = ds.MaxMin4.maxMin4(intArray5, (int) (byte) -1, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[0, 100, 35, 100, 32]");
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[100, 0]");
    }

    @Test
    public void test2236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2236");
        int[] intArray6 = new int[] { 0, (byte) -1, (short) 0, (byte) 1, (short) 100, 100 };
        int[] intArray9 = ds.MaxMin4.maxMin4(intArray6, (int) (byte) 0, (int) (short) 0);
        int[] intArray12 = ds.MaxMin4.maxMin4(intArray9, 0, (int) (byte) 1);
        int[] intArray15 = ds.MaxMin4.maxMin4(intArray9, 0, 0);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray18 = ds.MaxMin4.maxMin4(intArray15, (int) (short) 100, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[0, -1, 0, 1, 100, 100]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[0, 0]");
    }

    @Test
    public void test2237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2237");
        int[] intArray6 = new int[] { (byte) 1, (short) 1, ' ', (-1), (byte) 1, 'a' };
        int[] intArray9 = ds.MaxMin4.maxMin4(intArray6, 0, (int) (short) 1);
        int[] intArray12 = ds.MaxMin4.maxMin4(intArray6, 0, 0);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray15 = ds.MaxMin4.maxMin4(intArray6, (int) (short) 10, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[1, 1, 32, -1, 1, 97]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[1, 1]");
    }

    @Test
    public void test2238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2238");
        int[] intArray5 = new int[] { 0, (short) 100, '#', (byte) 100, ' ' };
        int[] intArray8 = ds.MaxMin4.maxMin4(intArray5, 1, (int) (byte) 0);
        int[] intArray11 = ds.MaxMin4.maxMin4(intArray5, (int) (short) 1, 0);
        int[] intArray14 = ds.MaxMin4.maxMin4(intArray11, 1, (int) (byte) 0);
        int[] intArray17 = ds.MaxMin4.maxMin4(intArray14, (int) (short) 1, 1);
        int[] intArray20 = ds.MaxMin4.maxMin4(intArray17, (int) (short) 1, (int) (short) 1);
        int[] intArray23 = ds.MaxMin4.maxMin4(intArray20, 1, (int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray26 = ds.MaxMin4.maxMin4(intArray23, (int) (byte) 100, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[0, 100, 35, 100, 32]");
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[100, 0]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[100, 0]");
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[100, 0]");
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray20), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray23), "[0, 0]");
    }

    @Test
    public void test2239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2239");
        int[] intArray5 = new int[] { 0, (short) 100, '#', (byte) 100, ' ' };
        int[] intArray8 = ds.MaxMin4.maxMin4(intArray5, 1, (int) (byte) 0);
        int[] intArray11 = ds.MaxMin4.maxMin4(intArray8, 0, (int) (short) 1);
        int[] intArray14 = ds.MaxMin4.maxMin4(intArray8, 0, (int) (short) 1);
        int[] intArray17 = ds.MaxMin4.maxMin4(intArray8, 0, 0);
        int[] intArray20 = ds.MaxMin4.maxMin4(intArray8, (int) (short) 0, (int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray23 = ds.MaxMin4.maxMin4(intArray8, (-1), (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[0, 100, 35, 100, 32]");
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[100, 0]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[100, 0]");
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[100, 0]");
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray20), "[100, 0]");
    }

    @Test
    public void test2240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2240");
        int[] intArray0 = null;
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray3 = ds.MaxMin4.maxMin4(intArray0, (int) (byte) -1, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2241");
        int[] intArray5 = new int[] { 0, (short) 100, '#', (byte) 100, ' ' };
        int[] intArray8 = ds.MaxMin4.maxMin4(intArray5, 1, (int) (byte) 0);
        int[] intArray11 = ds.MaxMin4.maxMin4(intArray8, 0, (int) (short) 1);
        int[] intArray14 = ds.MaxMin4.maxMin4(intArray11, (int) (byte) 1, 0);
        int[] intArray17 = ds.MaxMin4.maxMin4(intArray11, (int) (short) 1, 1);
        int[] intArray20 = ds.MaxMin4.maxMin4(intArray17, (int) (byte) 0, 0);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray23 = ds.MaxMin4.maxMin4(intArray17, (int) (short) 100, (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[0, 100, 35, 100, 32]");
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[100, 0]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[100, 0]");
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[100, 0]");
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray20), "[0, 0]");
    }

    @Test
    public void test2242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2242");
        int[] intArray5 = new int[] { 0, (short) 100, '#', (byte) 100, ' ' };
        int[] intArray8 = ds.MaxMin4.maxMin4(intArray5, 1, (int) (byte) 0);
        int[] intArray11 = ds.MaxMin4.maxMin4(intArray5, (int) (short) 1, 0);
        int[] intArray14 = ds.MaxMin4.maxMin4(intArray5, 0, 0);
        int[] intArray17 = ds.MaxMin4.maxMin4(intArray5, 0, 0);
        int[] intArray20 = ds.MaxMin4.maxMin4(intArray5, (int) (short) 1, 0);
        int[] intArray23 = ds.MaxMin4.maxMin4(intArray20, (int) (byte) 0, (int) (short) 0);
        int[] intArray26 = ds.MaxMin4.maxMin4(intArray20, 1, 0);
        int[] intArray29 = ds.MaxMin4.maxMin4(intArray26, (int) (short) 0, 0);
        int[] intArray32 = ds.MaxMin4.maxMin4(intArray29, (int) (short) 0, (int) (byte) 0);
        java.lang.Class<?> wildcardClass33 = intArray32.getClass();
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[0, 100, 35, 100, 32]");
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[100, 0]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[100, 0]");
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray20), "[100, 0]");
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray23), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray26), "[100, 0]");
        org.junit.Assert.assertNotNull(intArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray29), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray32);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray32), "[100, 100]");
        org.junit.Assert.assertNotNull(wildcardClass33);
    }

    @Test
    public void test2243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2243");
        int[] intArray6 = new int[] { (byte) 1, (short) 1, ' ', (-1), (byte) 1, 'a' };
        int[] intArray9 = ds.MaxMin4.maxMin4(intArray6, 0, (int) (short) 1);
        int[] intArray12 = ds.MaxMin4.maxMin4(intArray9, (int) (short) 1, 0);
        int[] intArray15 = ds.MaxMin4.maxMin4(intArray12, 1, (int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray18 = ds.MaxMin4.maxMin4(intArray12, (int) (byte) 0, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[1, 1, 32, -1, 1, 97]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[1, 1]");
    }

    @Test
    public void test2244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2244");
        int[] intArray5 = new int[] { 0, (short) 100, '#', (byte) 100, ' ' };
        int[] intArray8 = ds.MaxMin4.maxMin4(intArray5, 1, (int) (byte) 0);
        int[] intArray11 = ds.MaxMin4.maxMin4(intArray8, (int) (byte) 0, (int) (byte) 1);
        int[] intArray14 = ds.MaxMin4.maxMin4(intArray8, (int) (byte) 0, 1);
        int[] intArray17 = ds.MaxMin4.maxMin4(intArray8, 0, (int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray20 = ds.MaxMin4.maxMin4(intArray17, (-1), 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[0, 100, 35, 100, 32]");
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[100, 0]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[100, 0]");
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[100, 0]");
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[100, 0]");
    }

    @Test
    public void test2245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2245");
        int[] intArray5 = new int[] { 0, (short) 100, '#', (byte) 100, ' ' };
        int[] intArray8 = ds.MaxMin4.maxMin4(intArray5, 1, (int) (byte) 0);
        int[] intArray11 = ds.MaxMin4.maxMin4(intArray8, 0, (int) (short) 1);
        int[] intArray14 = ds.MaxMin4.maxMin4(intArray11, (int) (byte) 1, 0);
        int[] intArray17 = ds.MaxMin4.maxMin4(intArray11, (int) (short) 1, 1);
        int[] intArray20 = ds.MaxMin4.maxMin4(intArray17, (int) (byte) 0, 0);
        int[] intArray23 = ds.MaxMin4.maxMin4(intArray20, (int) (short) 1, 0);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray26 = ds.MaxMin4.maxMin4(intArray23, (int) (byte) 10, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[0, 100, 35, 100, 32]");
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[100, 0]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[100, 0]");
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[100, 0]");
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray20), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray23), "[0, 0]");
    }

    @Test
    public void test2246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2246");
        int[] intArray5 = new int[] { 0, (short) 100, '#', (byte) 100, ' ' };
        int[] intArray8 = ds.MaxMin4.maxMin4(intArray5, 1, (int) (byte) 0);
        int[] intArray11 = ds.MaxMin4.maxMin4(intArray8, (int) (byte) 0, (int) (byte) 1);
        int[] intArray14 = ds.MaxMin4.maxMin4(intArray11, 1, 0);
        int[] intArray17 = ds.MaxMin4.maxMin4(intArray11, (int) (byte) 0, 0);
        int[] intArray20 = ds.MaxMin4.maxMin4(intArray17, 0, (int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray23 = ds.MaxMin4.maxMin4(intArray17, (int) (byte) 100, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[0, 100, 35, 100, 32]");
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[100, 0]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[100, 0]");
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[100, 0]");
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray20), "[100, 100]");
    }

    @Test
    public void test2247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2247");
        int[] intArray5 = new int[] { 0, (short) 100, '#', (byte) 100, ' ' };
        int[] intArray8 = ds.MaxMin4.maxMin4(intArray5, 1, (int) (byte) 0);
        int[] intArray11 = ds.MaxMin4.maxMin4(intArray5, (int) (short) 1, 0);
        int[] intArray14 = ds.MaxMin4.maxMin4(intArray11, 1, (int) (byte) 0);
        int[] intArray17 = ds.MaxMin4.maxMin4(intArray14, (int) (short) 1, 1);
        int[] intArray20 = ds.MaxMin4.maxMin4(intArray17, (int) (short) 1, (int) (short) 1);
        int[] intArray23 = ds.MaxMin4.maxMin4(intArray20, (int) (byte) 0, (int) (short) 1);
        java.lang.Class<?> wildcardClass24 = intArray20.getClass();
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[0, 100, 35, 100, 32]");
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[100, 0]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[100, 0]");
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[100, 0]");
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray20), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray23), "[0, 0]");
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test2248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2248");
        int[] intArray5 = new int[] { 0, (short) 100, '#', (byte) 100, ' ' };
        int[] intArray8 = ds.MaxMin4.maxMin4(intArray5, 1, (int) (byte) 0);
        int[] intArray11 = ds.MaxMin4.maxMin4(intArray5, (int) (short) 1, 0);
        int[] intArray14 = ds.MaxMin4.maxMin4(intArray5, 0, 0);
        int[] intArray17 = ds.MaxMin4.maxMin4(intArray5, (int) (byte) 1, 0);
        int[] intArray20 = ds.MaxMin4.maxMin4(intArray5, 0, 1);
        int[] intArray23 = ds.MaxMin4.maxMin4(intArray20, (int) (byte) 0, (int) (short) 0);
        int[] intArray26 = ds.MaxMin4.maxMin4(intArray23, 0, (int) (byte) 1);
        java.lang.Class<?> wildcardClass27 = intArray23.getClass();
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[0, 100, 35, 100, 32]");
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[100, 0]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[100, 0]");
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[100, 0]");
        org.junit.Assert.assertNotNull(intArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray20), "[100, 0]");
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray23), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray26), "[100, 100]");
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test2249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2249");
        int[] intArray5 = new int[] { 0, (short) 100, '#', (byte) 100, ' ' };
        int[] intArray8 = ds.MaxMin4.maxMin4(intArray5, 1, (int) (byte) 0);
        int[] intArray11 = ds.MaxMin4.maxMin4(intArray8, (int) (byte) 0, (int) (byte) 1);
        int[] intArray14 = ds.MaxMin4.maxMin4(intArray8, (int) (byte) 0, 1);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray17 = ds.MaxMin4.maxMin4(intArray14, 10, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[0, 100, 35, 100, 32]");
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[100, 0]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[100, 0]");
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[100, 0]");
    }

    @Test
    public void test2250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2250");
        int[] intArray5 = new int[] { 0, (short) 100, '#', (byte) 100, ' ' };
        int[] intArray8 = ds.MaxMin4.maxMin4(intArray5, 1, (int) (byte) 0);
        int[] intArray11 = ds.MaxMin4.maxMin4(intArray5, 0, (int) (byte) 1);
        int[] intArray14 = ds.MaxMin4.maxMin4(intArray5, (int) (short) 1, 1);
        int[] intArray17 = ds.MaxMin4.maxMin4(intArray5, 0, (int) (short) 1);
        int[] intArray20 = ds.MaxMin4.maxMin4(intArray17, (int) (byte) 1, 1);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray23 = ds.MaxMin4.maxMin4(intArray17, 10, 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[0, 100, 35, 100, 32]");
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[100, 0]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[100, 0]");
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[100, 0]");
        org.junit.Assert.assertNotNull(intArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray20), "[0, 0]");
    }

    @Test
    public void test2251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2251");
        int[] intArray5 = new int[] { 0, (short) 100, '#', (byte) 100, ' ' };
        int[] intArray8 = ds.MaxMin4.maxMin4(intArray5, 1, (int) (byte) 0);
        int[] intArray11 = ds.MaxMin4.maxMin4(intArray8, 0, (int) (short) 1);
        int[] intArray14 = ds.MaxMin4.maxMin4(intArray8, 0, (int) (short) 1);
        int[] intArray17 = ds.MaxMin4.maxMin4(intArray8, 0, 0);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray20 = ds.MaxMin4.maxMin4(intArray8, 0, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[0, 100, 35, 100, 32]");
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[100, 0]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[100, 0]");
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[100, 0]");
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[100, 100]");
    }

    @Test
    public void test2252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2252");
        int[] intArray5 = new int[] { 0, (short) 100, '#', (byte) 100, ' ' };
        int[] intArray8 = ds.MaxMin4.maxMin4(intArray5, 1, (int) (byte) 0);
        int[] intArray11 = ds.MaxMin4.maxMin4(intArray5, (int) (short) 1, 0);
        int[] intArray14 = ds.MaxMin4.maxMin4(intArray5, 0, 0);
        int[] intArray17 = ds.MaxMin4.maxMin4(intArray5, 0, 0);
        int[] intArray20 = ds.MaxMin4.maxMin4(intArray5, (int) (short) 1, 0);
        int[] intArray23 = ds.MaxMin4.maxMin4(intArray20, (int) (byte) 0, (int) (short) 0);
        int[] intArray26 = ds.MaxMin4.maxMin4(intArray20, 1, 0);
        int[] intArray29 = ds.MaxMin4.maxMin4(intArray26, (int) (short) 1, 0);
        int[] intArray32 = ds.MaxMin4.maxMin4(intArray26, 0, (int) (byte) 0);
        int[] intArray35 = ds.MaxMin4.maxMin4(intArray26, (int) (byte) 1, 1);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray38 = ds.MaxMin4.maxMin4(intArray35, (int) (short) -1, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[0, 100, 35, 100, 32]");
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[100, 0]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[100, 0]");
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray20), "[100, 0]");
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray23), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray26), "[100, 0]");
        org.junit.Assert.assertNotNull(intArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray29), "[100, 0]");
        org.junit.Assert.assertNotNull(intArray32);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray32), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray35);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray35), "[0, 0]");
    }

    @Test
    public void test2253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2253");
        int[] intArray5 = new int[] { 0, (short) 100, '#', (byte) 100, ' ' };
        int[] intArray8 = ds.MaxMin4.maxMin4(intArray5, 1, (int) (byte) 0);
        int[] intArray11 = ds.MaxMin4.maxMin4(intArray5, (int) (short) 1, 0);
        int[] intArray14 = ds.MaxMin4.maxMin4(intArray11, 1, (int) (byte) 0);
        int[] intArray17 = ds.MaxMin4.maxMin4(intArray14, (int) (short) 1, 1);
        int[] intArray20 = ds.MaxMin4.maxMin4(intArray17, (int) (short) 1, (int) (short) 1);
        int[] intArray23 = ds.MaxMin4.maxMin4(intArray17, 0, (int) (byte) 1);
        int[] intArray26 = ds.MaxMin4.maxMin4(intArray17, 0, 0);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray29 = ds.MaxMin4.maxMin4(intArray17, (int) (byte) 100, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[0, 100, 35, 100, 32]");
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[100, 0]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[100, 0]");
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[100, 0]");
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray20), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray23), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray26), "[0, 0]");
    }

    @Test
    public void test2254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2254");
        int[] intArray6 = new int[] { 0, (byte) -1, (short) 0, (byte) 1, (short) 100, 100 };
        int[] intArray9 = ds.MaxMin4.maxMin4(intArray6, (int) (byte) 0, (int) (short) 0);
        int[] intArray12 = ds.MaxMin4.maxMin4(intArray9, 0, (int) (byte) 1);
        int[] intArray15 = ds.MaxMin4.maxMin4(intArray12, 0, 0);
        java.lang.Class<?> wildcardClass16 = intArray12.getClass();
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[0, -1, 0, 1, 100, 100]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[0, 0]");
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test2255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2255");
        int[] intArray5 = new int[] { 0, (short) 100, '#', (byte) 100, ' ' };
        int[] intArray8 = ds.MaxMin4.maxMin4(intArray5, 1, (int) (byte) 0);
        int[] intArray11 = ds.MaxMin4.maxMin4(intArray8, 0, (int) (short) 1);
        int[] intArray14 = ds.MaxMin4.maxMin4(intArray8, 0, (int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray17 = ds.MaxMin4.maxMin4(intArray8, 100, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[0, 100, 35, 100, 32]");
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[100, 0]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[100, 0]");
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[100, 0]");
    }

    @Test
    public void test2256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2256");
        int[] intArray6 = new int[] { 0, (byte) -1, (short) 0, (byte) 1, (short) 100, 100 };
        int[] intArray9 = ds.MaxMin4.maxMin4(intArray6, (int) (byte) 0, (int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray12 = ds.MaxMin4.maxMin4(intArray6, 0, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[0, -1, 0, 1, 100, 100]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[0, 0]");
    }

    @Test
    public void test2257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2257");
        int[] intArray5 = new int[] { 0, (short) 100, '#', (byte) 100, ' ' };
        int[] intArray8 = ds.MaxMin4.maxMin4(intArray5, 1, (int) (byte) 0);
        int[] intArray11 = ds.MaxMin4.maxMin4(intArray5, 0, (int) (byte) 1);
        int[] intArray14 = ds.MaxMin4.maxMin4(intArray5, (int) (short) 1, 1);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray17 = ds.MaxMin4.maxMin4(intArray5, 1, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[0, 100, 35, 100, 32]");
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[100, 0]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[100, 0]");
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[100, 100]");
    }

    @Test
    public void test2258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2258");
        int[] intArray5 = new int[] { 0, (short) 100, '#', (byte) 100, ' ' };
        int[] intArray8 = ds.MaxMin4.maxMin4(intArray5, 1, (int) (byte) 0);
        int[] intArray11 = ds.MaxMin4.maxMin4(intArray5, (int) (short) 1, 0);
        int[] intArray14 = ds.MaxMin4.maxMin4(intArray5, 0, 0);
        int[] intArray17 = ds.MaxMin4.maxMin4(intArray5, 0, 0);
        int[] intArray20 = ds.MaxMin4.maxMin4(intArray5, (int) (short) 1, 0);
        int[] intArray23 = ds.MaxMin4.maxMin4(intArray20, (int) (byte) 0, (int) (short) 0);
        int[] intArray26 = ds.MaxMin4.maxMin4(intArray20, 1, 0);
        int[] intArray29 = ds.MaxMin4.maxMin4(intArray20, (int) (short) 0, 0);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray32 = ds.MaxMin4.maxMin4(intArray20, (int) (short) -1, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[0, 100, 35, 100, 32]");
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[100, 0]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[100, 0]");
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray20), "[100, 0]");
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray23), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray26), "[100, 0]");
        org.junit.Assert.assertNotNull(intArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray29), "[100, 100]");
    }

    @Test
    public void test2259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2259");
        int[] intArray5 = new int[] { 0, (short) 100, '#', (byte) 100, ' ' };
        int[] intArray8 = ds.MaxMin4.maxMin4(intArray5, 1, (int) (byte) 0);
        int[] intArray11 = ds.MaxMin4.maxMin4(intArray8, 0, (int) (short) 1);
        int[] intArray14 = ds.MaxMin4.maxMin4(intArray11, (int) (byte) 1, 0);
        int[] intArray17 = ds.MaxMin4.maxMin4(intArray11, (int) (short) 1, 1);
        int[] intArray20 = ds.MaxMin4.maxMin4(intArray17, (int) (byte) 0, 0);
        int[] intArray23 = ds.MaxMin4.maxMin4(intArray20, 1, 1);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray26 = ds.MaxMin4.maxMin4(intArray23, (int) (short) -1, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[0, 100, 35, 100, 32]");
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[100, 0]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[100, 0]");
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[100, 0]");
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray20), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray23), "[0, 0]");
    }

    @Test
    public void test2260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2260");
        int[] intArray5 = new int[] { 0, (short) 100, '#', (byte) 100, ' ' };
        int[] intArray8 = ds.MaxMin4.maxMin4(intArray5, 1, (int) (byte) 0);
        int[] intArray11 = ds.MaxMin4.maxMin4(intArray5, (int) (short) 1, 0);
        int[] intArray14 = ds.MaxMin4.maxMin4(intArray5, 0, 0);
        int[] intArray17 = ds.MaxMin4.maxMin4(intArray5, (int) (byte) 1, 0);
        int[] intArray20 = ds.MaxMin4.maxMin4(intArray5, 0, 1);
        int[] intArray23 = ds.MaxMin4.maxMin4(intArray20, (int) (byte) 0, (int) (short) 0);
        int[] intArray26 = ds.MaxMin4.maxMin4(intArray23, 0, (int) (byte) 1);
        java.lang.Class<?> wildcardClass27 = intArray26.getClass();
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[0, 100, 35, 100, 32]");
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[100, 0]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[100, 0]");
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[100, 0]");
        org.junit.Assert.assertNotNull(intArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray20), "[100, 0]");
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray23), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray26), "[100, 100]");
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test2261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2261");
        int[] intArray5 = new int[] { 0, (short) 100, '#', (byte) 100, ' ' };
        int[] intArray8 = ds.MaxMin4.maxMin4(intArray5, 1, (int) (byte) 0);
        int[] intArray11 = ds.MaxMin4.maxMin4(intArray8, 0, (int) (short) 1);
        int[] intArray14 = ds.MaxMin4.maxMin4(intArray8, 0, (int) (short) 1);
        int[] intArray17 = ds.MaxMin4.maxMin4(intArray14, 0, 1);
        int[] intArray20 = ds.MaxMin4.maxMin4(intArray14, 0, (int) (short) 0);
        int[] intArray23 = ds.MaxMin4.maxMin4(intArray14, 0, (int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray26 = ds.MaxMin4.maxMin4(intArray14, 1, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[0, 100, 35, 100, 32]");
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[100, 0]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[100, 0]");
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[100, 0]");
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[100, 0]");
        org.junit.Assert.assertNotNull(intArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray20), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray23), "[100, 0]");
    }

    @Test
    public void test2262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2262");
        int[] intArray5 = new int[] { 0, (short) 100, '#', (byte) 100, ' ' };
        int[] intArray8 = ds.MaxMin4.maxMin4(intArray5, 1, (int) (byte) 0);
        int[] intArray11 = ds.MaxMin4.maxMin4(intArray8, 0, (int) (short) 1);
        int[] intArray14 = ds.MaxMin4.maxMin4(intArray11, (int) (byte) 1, 0);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray17 = ds.MaxMin4.maxMin4(intArray14, (int) (byte) 100, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[0, 100, 35, 100, 32]");
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[100, 0]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[100, 0]");
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[100, 0]");
    }

    @Test
    public void test2263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2263");
        int[] intArray5 = new int[] { 0, (short) 100, '#', (byte) 100, ' ' };
        int[] intArray8 = ds.MaxMin4.maxMin4(intArray5, 1, (int) (byte) 0);
        int[] intArray11 = ds.MaxMin4.maxMin4(intArray5, 0, (int) (byte) 1);
        int[] intArray14 = ds.MaxMin4.maxMin4(intArray5, (int) (short) 1, 1);
        int[] intArray17 = ds.MaxMin4.maxMin4(intArray5, 0, (int) (short) 1);
        int[] intArray20 = ds.MaxMin4.maxMin4(intArray17, (int) (byte) 1, 1);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray23 = ds.MaxMin4.maxMin4(intArray17, (int) 'a', (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[0, 100, 35, 100, 32]");
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[100, 0]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[100, 0]");
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[100, 0]");
        org.junit.Assert.assertNotNull(intArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray20), "[0, 0]");
    }

    @Test
    public void test2264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2264");
        int[] intArray5 = new int[] { 0, (short) 100, '#', (byte) 100, ' ' };
        int[] intArray8 = ds.MaxMin4.maxMin4(intArray5, 1, (int) (byte) 0);
        int[] intArray11 = ds.MaxMin4.maxMin4(intArray5, 0, (int) (byte) 1);
        int[] intArray14 = ds.MaxMin4.maxMin4(intArray5, (int) (short) 1, 1);
        int[] intArray17 = ds.MaxMin4.maxMin4(intArray5, (int) (short) 0, (int) (byte) 0);
        int[] intArray20 = ds.MaxMin4.maxMin4(intArray17, (int) (short) 1, (int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray23 = ds.MaxMin4.maxMin4(intArray17, (-1), (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[0, 100, 35, 100, 32]");
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[100, 0]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[100, 0]");
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray20), "[0, 0]");
    }

    @Test
    public void test2265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2265");
        int[] intArray5 = new int[] { 0, (short) 100, '#', (byte) 100, ' ' };
        int[] intArray8 = ds.MaxMin4.maxMin4(intArray5, 1, (int) (byte) 0);
        int[] intArray11 = ds.MaxMin4.maxMin4(intArray5, 0, (int) (byte) 1);
        int[] intArray14 = ds.MaxMin4.maxMin4(intArray5, (int) (short) 1, 1);
        int[] intArray17 = ds.MaxMin4.maxMin4(intArray5, 0, (int) (byte) 1);
        int[] intArray20 = ds.MaxMin4.maxMin4(intArray5, 0, (int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray23 = ds.MaxMin4.maxMin4(intArray20, (int) (short) 1, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[0, 100, 35, 100, 32]");
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[100, 0]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[100, 0]");
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[100, 0]");
        org.junit.Assert.assertNotNull(intArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray20), "[100, 0]");
    }

    @Test
    public void test2266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2266");
        int[] intArray5 = new int[] { 0, (short) 100, '#', (byte) 100, ' ' };
        int[] intArray8 = ds.MaxMin4.maxMin4(intArray5, 1, (int) (byte) 0);
        int[] intArray11 = ds.MaxMin4.maxMin4(intArray5, (int) (short) 1, 0);
        int[] intArray14 = ds.MaxMin4.maxMin4(intArray11, 1, (int) (byte) 0);
        int[] intArray17 = ds.MaxMin4.maxMin4(intArray14, (int) (short) 1, 1);
        int[] intArray20 = ds.MaxMin4.maxMin4(intArray17, (int) (short) 1, (int) (short) 1);
        int[] intArray23 = ds.MaxMin4.maxMin4(intArray20, 1, (int) (short) 1);
        int[] intArray26 = ds.MaxMin4.maxMin4(intArray20, (int) (byte) 1, 0);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray29 = ds.MaxMin4.maxMin4(intArray20, (int) (byte) 10, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[0, 100, 35, 100, 32]");
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[100, 0]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[100, 0]");
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[100, 0]");
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray20), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray23), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray26), "[0, 0]");
    }

    @Test
    public void test2267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2267");
        int[] intArray5 = new int[] { '4', 10, (byte) 1, 100, (short) 0 };
        int[] intArray8 = ds.MaxMin4.maxMin4(intArray5, (int) (byte) 1, 1);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray11 = ds.MaxMin4.maxMin4(intArray5, (int) (byte) -1, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[52, 10, 1, 100, 0]");
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[10, 10]");
    }

    @Test
    public void test2268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2268");
        int[] intArray5 = new int[] { 0, (short) 100, '#', (byte) 100, ' ' };
        int[] intArray8 = ds.MaxMin4.maxMin4(intArray5, 1, (int) (byte) 0);
        int[] intArray11 = ds.MaxMin4.maxMin4(intArray5, (int) (short) 1, 0);
        int[] intArray14 = ds.MaxMin4.maxMin4(intArray11, 1, (int) (byte) 0);
        int[] intArray17 = ds.MaxMin4.maxMin4(intArray14, (int) (short) 1, 1);
        int[] intArray20 = ds.MaxMin4.maxMin4(intArray17, (int) (short) 1, (int) (short) 1);
        int[] intArray23 = ds.MaxMin4.maxMin4(intArray17, (int) (byte) 1, (int) (short) 0);
        java.lang.Class<?> wildcardClass24 = intArray17.getClass();
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[0, 100, 35, 100, 32]");
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[100, 0]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[100, 0]");
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[100, 0]");
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray20), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray23), "[0, 0]");
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test2269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2269");
        int[] intArray5 = new int[] { 0, (short) 100, '#', (byte) 100, ' ' };
        int[] intArray8 = ds.MaxMin4.maxMin4(intArray5, 1, (int) (byte) 0);
        int[] intArray11 = ds.MaxMin4.maxMin4(intArray8, 0, (int) (short) 1);
        int[] intArray14 = ds.MaxMin4.maxMin4(intArray11, (int) (byte) 1, 0);
        int[] intArray17 = ds.MaxMin4.maxMin4(intArray11, (int) (short) 1, 1);
        int[] intArray20 = ds.MaxMin4.maxMin4(intArray17, (int) (byte) 0, 0);
        int[] intArray23 = ds.MaxMin4.maxMin4(intArray20, 1, 1);
        int[] intArray26 = ds.MaxMin4.maxMin4(intArray20, (int) (short) 1, (int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray29 = ds.MaxMin4.maxMin4(intArray26, 0, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[0, 100, 35, 100, 32]");
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[100, 0]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[100, 0]");
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[100, 0]");
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray20), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray23), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray26), "[0, 0]");
    }

    @Test
    public void test2270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2270");
        int[] intArray5 = new int[] { 0, (short) 100, '#', (byte) 100, ' ' };
        int[] intArray8 = ds.MaxMin4.maxMin4(intArray5, 1, (int) (byte) 0);
        int[] intArray11 = ds.MaxMin4.maxMin4(intArray5, (int) (short) 0, 1);
        int[] intArray14 = ds.MaxMin4.maxMin4(intArray5, 0, 1);
        int[] intArray17 = ds.MaxMin4.maxMin4(intArray14, (int) (short) 1, (int) (short) 0);
        int[] intArray20 = ds.MaxMin4.maxMin4(intArray17, (int) (short) 1, 1);
        int[] intArray23 = ds.MaxMin4.maxMin4(intArray20, (int) (byte) 0, (int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray26 = ds.MaxMin4.maxMin4(intArray20, (int) (short) 1, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[0, 100, 35, 100, 32]");
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[100, 0]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[100, 0]");
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[100, 0]");
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[100, 0]");
        org.junit.Assert.assertNotNull(intArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray20), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray23), "[0, 0]");
    }

    @Test
    public void test2271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2271");
        int[] intArray5 = new int[] { 0, (short) 100, '#', (byte) 100, ' ' };
        int[] intArray8 = ds.MaxMin4.maxMin4(intArray5, 1, (int) (byte) 0);
        int[] intArray11 = ds.MaxMin4.maxMin4(intArray5, (int) (short) 1, 0);
        int[] intArray14 = ds.MaxMin4.maxMin4(intArray5, 0, 0);
        int[] intArray17 = ds.MaxMin4.maxMin4(intArray5, 0, 0);
        int[] intArray20 = ds.MaxMin4.maxMin4(intArray5, (int) (short) 1, 0);
        int[] intArray23 = ds.MaxMin4.maxMin4(intArray20, (int) (byte) 0, (int) (short) 0);
        int[] intArray26 = ds.MaxMin4.maxMin4(intArray20, 1, 0);
        int[] intArray29 = ds.MaxMin4.maxMin4(intArray26, (int) (short) 1, 0);
        int[] intArray32 = ds.MaxMin4.maxMin4(intArray26, 0, (int) (byte) 0);
        int[] intArray35 = ds.MaxMin4.maxMin4(intArray32, 0, 1);
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[0, 100, 35, 100, 32]");
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[100, 0]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[100, 0]");
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray20), "[100, 0]");
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray23), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray26), "[100, 0]");
        org.junit.Assert.assertNotNull(intArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray29), "[100, 0]");
        org.junit.Assert.assertNotNull(intArray32);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray32), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray35);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray35), "[100, 100]");
    }

    @Test
    public void test2272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2272");
        int[] intArray5 = new int[] { 0, (short) 100, '#', (byte) 100, ' ' };
        int[] intArray8 = ds.MaxMin4.maxMin4(intArray5, 1, (int) (byte) 0);
        int[] intArray11 = ds.MaxMin4.maxMin4(intArray5, 0, (int) (byte) 1);
        int[] intArray14 = ds.MaxMin4.maxMin4(intArray5, (int) (short) 1, 1);
        int[] intArray17 = ds.MaxMin4.maxMin4(intArray14, (int) (byte) 0, (int) (byte) 0);
        int[] intArray20 = ds.MaxMin4.maxMin4(intArray17, (int) (short) 1, 1);
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[0, 100, 35, 100, 32]");
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[100, 0]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[100, 0]");
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray20), "[100, 100]");
    }

    @Test
    public void test2273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2273");
        int[] intArray5 = new int[] { 0, (short) 100, '#', (byte) 100, ' ' };
        int[] intArray8 = ds.MaxMin4.maxMin4(intArray5, 1, (int) (byte) 0);
        int[] intArray11 = ds.MaxMin4.maxMin4(intArray5, (int) (short) 1, 0);
        int[] intArray14 = ds.MaxMin4.maxMin4(intArray5, 0, 0);
        int[] intArray17 = ds.MaxMin4.maxMin4(intArray5, 0, 0);
        int[] intArray20 = ds.MaxMin4.maxMin4(intArray5, (int) (short) 1, 0);
        int[] intArray23 = ds.MaxMin4.maxMin4(intArray20, (int) (byte) 0, (int) (short) 0);
        int[] intArray26 = ds.MaxMin4.maxMin4(intArray20, 1, 0);
        int[] intArray29 = ds.MaxMin4.maxMin4(intArray26, (int) (short) 1, 0);
        int[] intArray32 = ds.MaxMin4.maxMin4(intArray26, (int) (short) 0, (int) (short) 0);
        int[] intArray35 = ds.MaxMin4.maxMin4(intArray32, (int) (byte) 1, (int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray38 = ds.MaxMin4.maxMin4(intArray35, (int) (byte) -1, (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[0, 100, 35, 100, 32]");
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[100, 0]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[100, 0]");
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray20), "[100, 0]");
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray23), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray26), "[100, 0]");
        org.junit.Assert.assertNotNull(intArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray29), "[100, 0]");
        org.junit.Assert.assertNotNull(intArray32);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray32), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray35);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray35), "[100, 100]");
    }

    @Test
    public void test2274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2274");
        int[] intArray5 = new int[] { 0, (short) 100, '#', (byte) 100, ' ' };
        int[] intArray8 = ds.MaxMin4.maxMin4(intArray5, 1, (int) (byte) 0);
        int[] intArray11 = ds.MaxMin4.maxMin4(intArray8, (int) (byte) 0, (int) (byte) 1);
        int[] intArray14 = ds.MaxMin4.maxMin4(intArray8, (int) (byte) 0, 1);
        int[] intArray17 = ds.MaxMin4.maxMin4(intArray8, (int) (byte) 1, (int) (short) 0);
        int[] intArray20 = ds.MaxMin4.maxMin4(intArray8, 0, (int) (byte) 1);
        int[] intArray23 = ds.MaxMin4.maxMin4(intArray8, (int) (byte) 0, 0);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray26 = ds.MaxMin4.maxMin4(intArray8, 100, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[0, 100, 35, 100, 32]");
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[100, 0]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[100, 0]");
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[100, 0]");
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[100, 0]");
        org.junit.Assert.assertNotNull(intArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray20), "[100, 0]");
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray23), "[100, 100]");
    }

    @Test
    public void test2275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2275");
        int[] intArray0 = null;
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray3 = ds.MaxMin4.maxMin4(intArray0, (int) (short) 0, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2276");
        int[] intArray5 = new int[] { 0, (short) 100, '#', (byte) 100, ' ' };
        int[] intArray8 = ds.MaxMin4.maxMin4(intArray5, 1, (int) (byte) 0);
        int[] intArray11 = ds.MaxMin4.maxMin4(intArray5, (int) (short) 1, 0);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray14 = ds.MaxMin4.maxMin4(intArray11, (int) 'a', 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[0, 100, 35, 100, 32]");
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[100, 0]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[100, 0]");
    }

    @Test
    public void test2277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2277");
        int[] intArray5 = new int[] { 0, (short) 100, '#', (byte) 100, ' ' };
        int[] intArray8 = ds.MaxMin4.maxMin4(intArray5, 1, (int) (byte) 0);
        int[] intArray11 = ds.MaxMin4.maxMin4(intArray5, (int) (short) 1, 0);
        int[] intArray14 = ds.MaxMin4.maxMin4(intArray11, 1, (int) (byte) 0);
        int[] intArray17 = ds.MaxMin4.maxMin4(intArray14, (int) (short) 1, 1);
        int[] intArray20 = ds.MaxMin4.maxMin4(intArray17, (int) (short) 1, (int) (short) 1);
        int[] intArray23 = ds.MaxMin4.maxMin4(intArray17, (int) (short) 1, (int) (byte) 1);
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[0, 100, 35, 100, 32]");
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[100, 0]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[100, 0]");
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[100, 0]");
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray20), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray23), "[0, 0]");
    }
}

