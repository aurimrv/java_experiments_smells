package ds.seed5311;

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
        int[] intArray6 = new int[] { ' ', (short) -1, 10, (-1), 10, 1 };
        int[] intArray9 = ds.MaxMin4.maxMin4(intArray6, 0, (int) (short) 0);
        int[] intArray12 = ds.MaxMin4.maxMin4(intArray6, (int) (byte) 1, (int) (short) 1);
        int[] intArray15 = ds.MaxMin4.maxMin4(intArray12, 1, 0);
        int[] intArray18 = ds.MaxMin4.maxMin4(intArray15, 0, 0);
        int[] intArray21 = ds.MaxMin4.maxMin4(intArray15, (int) (short) 0, (int) (byte) 1);
        int[] intArray24 = ds.MaxMin4.maxMin4(intArray21, (int) (short) 0, 1);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray27 = ds.MaxMin4.maxMin4(intArray21, (int) (byte) 1, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[32, -1, 10, -1, 10, 1]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[32, 32]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray18), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray21), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray24), "[-1, -1]");
    }

    @Test
    public void test2002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2002");
        int[] intArray6 = new int[] { ' ', (short) -1, 10, (-1), 10, 1 };
        int[] intArray9 = ds.MaxMin4.maxMin4(intArray6, 0, (int) (short) 0);
        int[] intArray12 = ds.MaxMin4.maxMin4(intArray9, 0, (int) (short) 1);
        int[] intArray15 = ds.MaxMin4.maxMin4(intArray12, (int) (byte) 1, (int) (short) 1);
        int[] intArray18 = ds.MaxMin4.maxMin4(intArray15, 0, (int) (short) 1);
        int[] intArray21 = ds.MaxMin4.maxMin4(intArray18, 1, 0);
        int[] intArray24 = ds.MaxMin4.maxMin4(intArray18, 0, (int) (short) 1);
        int[] intArray27 = ds.MaxMin4.maxMin4(intArray24, 0, (int) (short) 1);
        int[] intArray30 = ds.MaxMin4.maxMin4(intArray27, (int) (short) 0, 1);
        java.lang.Class<?> wildcardClass31 = intArray30.getClass();
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[32, -1, 10, -1, 10, 1]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[32, 32]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[32, 32]");
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[32, 32]");
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray18), "[32, 32]");
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray21), "[32, 32]");
        org.junit.Assert.assertNotNull(intArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray24), "[32, 32]");
        org.junit.Assert.assertNotNull(intArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray27), "[32, 32]");
        org.junit.Assert.assertNotNull(intArray30);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray30), "[32, 32]");
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test2003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2003");
        int[] intArray4 = new int[] { (byte) 1, 10, (byte) -1, ' ' };
        int[] intArray7 = ds.MaxMin4.maxMin4(intArray4, (int) (short) 0, (int) (short) 0);
        int[] intArray10 = ds.MaxMin4.maxMin4(intArray4, 0, 0);
        int[] intArray13 = ds.MaxMin4.maxMin4(intArray4, 0, (int) (byte) 1);
        int[] intArray16 = ds.MaxMin4.maxMin4(intArray4, 0, (int) (byte) 1);
        int[] intArray19 = ds.MaxMin4.maxMin4(intArray4, (int) (short) 0, 0);
        int[] intArray22 = ds.MaxMin4.maxMin4(intArray19, (int) (short) 1, 0);
        int[] intArray25 = ds.MaxMin4.maxMin4(intArray19, (int) (byte) 0, (int) (short) 1);
        java.lang.Class<?> wildcardClass26 = intArray19.getClass();
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[1, 10, -1, 32]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[10, 1]");
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray16), "[10, 1]");
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray19), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray22), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray25), "[1, 1]");
        org.junit.Assert.assertNotNull(wildcardClass26);
    }

    @Test
    public void test2004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2004");
        int[] intArray6 = new int[] { ' ', (short) -1, 10, (-1), 10, 1 };
        int[] intArray9 = ds.MaxMin4.maxMin4(intArray6, 0, (int) (short) 0);
        int[] intArray12 = ds.MaxMin4.maxMin4(intArray9, (int) (byte) 0, 0);
        int[] intArray15 = ds.MaxMin4.maxMin4(intArray9, (int) (short) 0, (int) (short) 0);
        int[] intArray18 = ds.MaxMin4.maxMin4(intArray15, 0, (int) (short) 1);
        int[] intArray21 = ds.MaxMin4.maxMin4(intArray18, 0, 0);
        int[] intArray24 = ds.MaxMin4.maxMin4(intArray18, 0, (int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray27 = ds.MaxMin4.maxMin4(intArray24, (int) (short) -1, (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[32, -1, 10, -1, 10, 1]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[32, 32]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[32, 32]");
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[32, 32]");
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray18), "[32, 32]");
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray21), "[32, 32]");
        org.junit.Assert.assertNotNull(intArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray24), "[32, 32]");
    }

    @Test
    public void test2005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2005");
        int[] intArray4 = new int[] { (byte) 1, 10, (byte) -1, ' ' };
        int[] intArray7 = ds.MaxMin4.maxMin4(intArray4, (int) (short) 0, (int) (short) 0);
        int[] intArray10 = ds.MaxMin4.maxMin4(intArray4, 0, 0);
        int[] intArray13 = ds.MaxMin4.maxMin4(intArray4, 0, (int) (byte) 1);
        int[] intArray16 = ds.MaxMin4.maxMin4(intArray4, 0, (int) (byte) 1);
        int[] intArray19 = ds.MaxMin4.maxMin4(intArray4, (int) (short) 0, 0);
        int[] intArray22 = ds.MaxMin4.maxMin4(intArray19, (int) (short) 1, 0);
        int[] intArray25 = ds.MaxMin4.maxMin4(intArray22, 0, (int) (byte) 1);
        int[] intArray28 = ds.MaxMin4.maxMin4(intArray22, (int) (short) 0, 0);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray31 = ds.MaxMin4.maxMin4(intArray28, (int) (byte) 100, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[1, 10, -1, 32]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[10, 1]");
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray16), "[10, 1]");
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray19), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray22), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray25), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray28);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray28), "[1, 1]");
    }

    @Test
    public void test2006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2006");
        int[] intArray6 = new int[] { ' ', (short) -1, 10, (-1), 10, 1 };
        int[] intArray9 = ds.MaxMin4.maxMin4(intArray6, 0, (int) (short) 0);
        int[] intArray12 = ds.MaxMin4.maxMin4(intArray6, (int) (byte) 1, (int) (short) 1);
        int[] intArray15 = ds.MaxMin4.maxMin4(intArray12, 1, 0);
        int[] intArray18 = ds.MaxMin4.maxMin4(intArray15, 0, 0);
        int[] intArray21 = ds.MaxMin4.maxMin4(intArray18, 1, 0);
        int[] intArray24 = ds.MaxMin4.maxMin4(intArray18, (int) (short) 1, 0);
        int[] intArray27 = ds.MaxMin4.maxMin4(intArray24, 0, (int) (short) 0);
        int[] intArray30 = ds.MaxMin4.maxMin4(intArray27, (int) (byte) 0, (int) (short) 0);
        int[] intArray33 = ds.MaxMin4.maxMin4(intArray27, (int) (short) 0, (int) (short) 1);
        int[] intArray36 = ds.MaxMin4.maxMin4(intArray33, (int) (byte) 0, 1);
        int[] intArray39 = ds.MaxMin4.maxMin4(intArray33, (int) (short) 0, (int) (short) 0);
        java.lang.Class<?> wildcardClass40 = intArray39.getClass();
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[32, -1, 10, -1, 10, 1]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[32, 32]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray18), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray21), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray24), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray27), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray30);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray30), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray33);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray33), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray36);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray36), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray39);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray39), "[-1, -1]");
        org.junit.Assert.assertNotNull(wildcardClass40);
    }

    @Test
    public void test2007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2007");
        int[] intArray4 = new int[] { (byte) 1, 10, (byte) -1, ' ' };
        int[] intArray7 = ds.MaxMin4.maxMin4(intArray4, (int) (short) 0, (int) (short) 0);
        int[] intArray10 = ds.MaxMin4.maxMin4(intArray4, 0, 0);
        int[] intArray13 = ds.MaxMin4.maxMin4(intArray4, 0, (int) (byte) 1);
        int[] intArray16 = ds.MaxMin4.maxMin4(intArray4, 0, (int) (byte) 1);
        int[] intArray19 = ds.MaxMin4.maxMin4(intArray4, (int) (short) 0, 0);
        int[] intArray22 = ds.MaxMin4.maxMin4(intArray19, (int) (short) 1, 0);
        int[] intArray25 = ds.MaxMin4.maxMin4(intArray22, 0, (int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray28 = ds.MaxMin4.maxMin4(intArray22, (int) ' ', (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[1, 10, -1, 32]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[10, 1]");
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray16), "[10, 1]");
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray19), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray22), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray25), "[1, 1]");
    }

    @Test
    public void test2008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2008");
        int[] intArray6 = new int[] { ' ', (short) -1, 10, (-1), 10, 1 };
        int[] intArray9 = ds.MaxMin4.maxMin4(intArray6, 0, (int) (short) 0);
        int[] intArray12 = ds.MaxMin4.maxMin4(intArray9, (int) (byte) 1, (int) (short) 0);
        int[] intArray15 = ds.MaxMin4.maxMin4(intArray9, (int) (byte) 0, (int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray18 = ds.MaxMin4.maxMin4(intArray9, (int) (short) -1, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[32, -1, 10, -1, 10, 1]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[32, 32]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[32, 32]");
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[32, 32]");
    }

    @Test
    public void test2009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2009");
        int[] intArray4 = new int[] { (byte) 1, 10, (byte) -1, ' ' };
        int[] intArray7 = ds.MaxMin4.maxMin4(intArray4, (int) (short) 0, (int) (short) 0);
        int[] intArray10 = ds.MaxMin4.maxMin4(intArray4, 0, 0);
        int[] intArray13 = ds.MaxMin4.maxMin4(intArray4, 0, (int) (byte) 1);
        int[] intArray16 = ds.MaxMin4.maxMin4(intArray4, 0, (int) (byte) 1);
        int[] intArray19 = ds.MaxMin4.maxMin4(intArray16, 1, (int) (short) 0);
        int[] intArray22 = ds.MaxMin4.maxMin4(intArray16, (int) (short) 0, 0);
        java.lang.Class<?> wildcardClass23 = intArray16.getClass();
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[1, 10, -1, 32]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[10, 1]");
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray16), "[10, 1]");
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray19), "[10, 1]");
        org.junit.Assert.assertNotNull(intArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray22), "[10, 10]");
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test2010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2010");
        int[] intArray6 = new int[] { ' ', (short) -1, 10, (-1), 10, 1 };
        int[] intArray9 = ds.MaxMin4.maxMin4(intArray6, 0, (int) (short) 0);
        int[] intArray12 = ds.MaxMin4.maxMin4(intArray9, 0, (int) (short) 1);
        int[] intArray15 = ds.MaxMin4.maxMin4(intArray12, (int) (byte) 1, (int) (short) 1);
        int[] intArray18 = ds.MaxMin4.maxMin4(intArray15, 0, (int) (short) 1);
        int[] intArray21 = ds.MaxMin4.maxMin4(intArray18, 1, 0);
        int[] intArray24 = ds.MaxMin4.maxMin4(intArray18, 0, (int) (short) 1);
        int[] intArray27 = ds.MaxMin4.maxMin4(intArray24, 0, (int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray30 = ds.MaxMin4.maxMin4(intArray27, 1, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[32, -1, 10, -1, 10, 1]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[32, 32]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[32, 32]");
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[32, 32]");
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray18), "[32, 32]");
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray21), "[32, 32]");
        org.junit.Assert.assertNotNull(intArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray24), "[32, 32]");
        org.junit.Assert.assertNotNull(intArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray27), "[32, 32]");
    }

    @Test
    public void test2011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2011");
        int[] intArray6 = new int[] { ' ', (short) -1, 10, (-1), 10, 1 };
        int[] intArray9 = ds.MaxMin4.maxMin4(intArray6, 0, (int) (short) 0);
        int[] intArray12 = ds.MaxMin4.maxMin4(intArray6, (int) (byte) 1, (int) (short) 1);
        int[] intArray15 = ds.MaxMin4.maxMin4(intArray12, 1, 0);
        int[] intArray18 = ds.MaxMin4.maxMin4(intArray15, 0, 0);
        int[] intArray21 = ds.MaxMin4.maxMin4(intArray15, (int) (short) 0, (int) (short) 1);
        int[] intArray24 = ds.MaxMin4.maxMin4(intArray21, (int) (byte) 0, (int) (short) 1);
        int[] intArray27 = ds.MaxMin4.maxMin4(intArray24, (int) (short) 1, (int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray30 = ds.MaxMin4.maxMin4(intArray24, 10, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[32, -1, 10, -1, 10, 1]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[32, 32]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray18), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray21), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray24), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray27), "[-1, -1]");
    }

    @Test
    public void test2012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2012");
        int[] intArray6 = new int[] { ' ', (short) -1, 10, (-1), 10, 1 };
        int[] intArray9 = ds.MaxMin4.maxMin4(intArray6, 0, (int) (short) 0);
        int[] intArray12 = ds.MaxMin4.maxMin4(intArray9, (int) (byte) 0, 0);
        int[] intArray15 = ds.MaxMin4.maxMin4(intArray9, (int) (short) 0, (int) (short) 0);
        int[] intArray18 = ds.MaxMin4.maxMin4(intArray9, (int) (byte) 1, (int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray21 = ds.MaxMin4.maxMin4(intArray9, 1, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[32, -1, 10, -1, 10, 1]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[32, 32]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[32, 32]");
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[32, 32]");
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray18), "[32, 32]");
    }

    @Test
    public void test2013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2013");
        int[] intArray6 = new int[] { ' ', (short) -1, 10, (-1), 10, 1 };
        int[] intArray9 = ds.MaxMin4.maxMin4(intArray6, 0, (int) (short) 0);
        int[] intArray12 = ds.MaxMin4.maxMin4(intArray9, (int) (byte) 0, 0);
        int[] intArray15 = ds.MaxMin4.maxMin4(intArray9, (int) (short) 0, (int) (short) 0);
        int[] intArray18 = ds.MaxMin4.maxMin4(intArray15, 0, 1);
        int[] intArray21 = ds.MaxMin4.maxMin4(intArray15, (int) (byte) 0, 0);
        java.lang.Class<?> wildcardClass22 = intArray21.getClass();
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[32, -1, 10, -1, 10, 1]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[32, 32]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[32, 32]");
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[32, 32]");
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray18), "[32, 32]");
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray21), "[32, 32]");
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test2014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2014");
        int[] intArray6 = new int[] { ' ', (short) -1, 10, (-1), 10, 1 };
        int[] intArray9 = ds.MaxMin4.maxMin4(intArray6, 0, (int) (short) 0);
        int[] intArray12 = ds.MaxMin4.maxMin4(intArray9, 0, (int) (short) 1);
        int[] intArray15 = ds.MaxMin4.maxMin4(intArray12, (int) (byte) 1, (int) (short) 1);
        int[] intArray18 = ds.MaxMin4.maxMin4(intArray15, 0, (int) (short) 1);
        int[] intArray21 = ds.MaxMin4.maxMin4(intArray18, 1, 0);
        int[] intArray24 = ds.MaxMin4.maxMin4(intArray21, 1, (int) (short) 0);
        int[] intArray27 = ds.MaxMin4.maxMin4(intArray21, (int) (byte) 0, (int) (byte) 0);
        int[] intArray30 = ds.MaxMin4.maxMin4(intArray21, (int) (short) 0, 0);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray33 = ds.MaxMin4.maxMin4(intArray21, (int) '4', (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[32, -1, 10, -1, 10, 1]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[32, 32]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[32, 32]");
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[32, 32]");
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray18), "[32, 32]");
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray21), "[32, 32]");
        org.junit.Assert.assertNotNull(intArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray24), "[32, 32]");
        org.junit.Assert.assertNotNull(intArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray27), "[32, 32]");
        org.junit.Assert.assertNotNull(intArray30);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray30), "[32, 32]");
    }

    @Test
    public void test2015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2015");
        int[] intArray4 = new int[] { (byte) 1, 10, (byte) -1, ' ' };
        int[] intArray7 = ds.MaxMin4.maxMin4(intArray4, (int) (short) 0, (int) (short) 0);
        int[] intArray10 = ds.MaxMin4.maxMin4(intArray4, 0, 0);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray13 = ds.MaxMin4.maxMin4(intArray4, (-1), (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[1, 10, -1, 32]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[1, 1]");
    }

    @Test
    public void test2016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2016");
        int[] intArray6 = new int[] { ' ', (short) -1, 10, (-1), 10, 1 };
        int[] intArray9 = ds.MaxMin4.maxMin4(intArray6, 0, (int) (short) 0);
        int[] intArray12 = ds.MaxMin4.maxMin4(intArray9, 0, (int) (short) 1);
        int[] intArray15 = ds.MaxMin4.maxMin4(intArray12, (int) (byte) 1, (int) (short) 1);
        int[] intArray18 = ds.MaxMin4.maxMin4(intArray15, (int) (byte) 0, 0);
        int[] intArray21 = ds.MaxMin4.maxMin4(intArray18, 0, 0);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray24 = ds.MaxMin4.maxMin4(intArray21, (int) (byte) 100, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[32, -1, 10, -1, 10, 1]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[32, 32]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[32, 32]");
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[32, 32]");
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray18), "[32, 32]");
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray21), "[32, 32]");
    }

    @Test
    public void test2017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2017");
        int[] intArray6 = new int[] { ' ', (short) -1, 10, (-1), 10, 1 };
        int[] intArray9 = ds.MaxMin4.maxMin4(intArray6, 0, (int) (short) 0);
        int[] intArray12 = ds.MaxMin4.maxMin4(intArray9, 0, (int) (short) 1);
        int[] intArray15 = ds.MaxMin4.maxMin4(intArray9, 0, (int) (byte) 0);
        int[] intArray18 = ds.MaxMin4.maxMin4(intArray15, 0, (int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray21 = ds.MaxMin4.maxMin4(intArray15, (int) ' ', 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[32, -1, 10, -1, 10, 1]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[32, 32]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[32, 32]");
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[32, 32]");
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray18), "[32, 32]");
    }

    @Test
    public void test2018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2018");
        int[] intArray0 = null;
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray3 = ds.MaxMin4.maxMin4(intArray0, (int) (byte) -1, 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2019");
        int[] intArray6 = new int[] { ' ', (short) -1, 10, (-1), 10, 1 };
        int[] intArray9 = ds.MaxMin4.maxMin4(intArray6, 0, (int) (short) 0);
        int[] intArray12 = ds.MaxMin4.maxMin4(intArray9, (int) (byte) 0, 0);
        int[] intArray15 = ds.MaxMin4.maxMin4(intArray9, (int) (short) 0, (int) (short) 0);
        int[] intArray18 = ds.MaxMin4.maxMin4(intArray9, (int) (byte) 1, (int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray21 = ds.MaxMin4.maxMin4(intArray18, (int) ' ', (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[32, -1, 10, -1, 10, 1]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[32, 32]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[32, 32]");
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[32, 32]");
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray18), "[32, 32]");
    }

    @Test
    public void test2020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2020");
        int[] intArray6 = new int[] { ' ', (short) -1, 10, (-1), 10, 1 };
        int[] intArray9 = ds.MaxMin4.maxMin4(intArray6, 0, (int) (short) 0);
        int[] intArray12 = ds.MaxMin4.maxMin4(intArray6, (int) (byte) 1, (int) (short) 1);
        int[] intArray15 = ds.MaxMin4.maxMin4(intArray12, 1, 0);
        int[] intArray18 = ds.MaxMin4.maxMin4(intArray15, 1, 1);
        int[] intArray21 = ds.MaxMin4.maxMin4(intArray15, (int) (byte) 1, (int) (byte) 1);
        int[] intArray24 = ds.MaxMin4.maxMin4(intArray21, (int) (byte) 1, 0);
        int[] intArray27 = ds.MaxMin4.maxMin4(intArray21, (int) (byte) 1, 0);
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[32, -1, 10, -1, 10, 1]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[32, 32]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray18), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray21), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray24), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray27), "[-1, -1]");
    }

    @Test
    public void test2021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2021");
        int[] intArray6 = new int[] { ' ', (short) -1, 10, (-1), 10, 1 };
        int[] intArray9 = ds.MaxMin4.maxMin4(intArray6, 0, (int) (short) 0);
        int[] intArray12 = ds.MaxMin4.maxMin4(intArray6, (int) (byte) 1, (int) (short) 1);
        int[] intArray15 = ds.MaxMin4.maxMin4(intArray12, 1, 0);
        int[] intArray18 = ds.MaxMin4.maxMin4(intArray15, 0, 0);
        int[] intArray21 = ds.MaxMin4.maxMin4(intArray15, (int) (short) 0, (int) (short) 1);
        int[] intArray24 = ds.MaxMin4.maxMin4(intArray15, 0, (int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray27 = ds.MaxMin4.maxMin4(intArray24, (int) (short) 100, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[32, -1, 10, -1, 10, 1]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[32, 32]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray18), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray21), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray24), "[-1, -1]");
    }

    @Test
    public void test2022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2022");
        int[] intArray6 = new int[] { ' ', (short) -1, 10, (-1), 10, 1 };
        int[] intArray9 = ds.MaxMin4.maxMin4(intArray6, 0, (int) (short) 0);
        int[] intArray12 = ds.MaxMin4.maxMin4(intArray9, 0, (int) (short) 1);
        int[] intArray15 = ds.MaxMin4.maxMin4(intArray12, (int) (byte) 1, (int) (short) 1);
        int[] intArray18 = ds.MaxMin4.maxMin4(intArray15, 0, (int) (short) 1);
        int[] intArray21 = ds.MaxMin4.maxMin4(intArray18, 1, 0);
        int[] intArray24 = ds.MaxMin4.maxMin4(intArray18, 0, (int) (byte) 0);
        int[] intArray27 = ds.MaxMin4.maxMin4(intArray24, 0, 0);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray30 = ds.MaxMin4.maxMin4(intArray27, (int) (byte) 10, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[32, -1, 10, -1, 10, 1]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[32, 32]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[32, 32]");
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[32, 32]");
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray18), "[32, 32]");
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray21), "[32, 32]");
        org.junit.Assert.assertNotNull(intArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray24), "[32, 32]");
        org.junit.Assert.assertNotNull(intArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray27), "[32, 32]");
    }

    @Test
    public void test2023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2023");
        int[] intArray6 = new int[] { ' ', (short) -1, 10, (-1), 10, 1 };
        int[] intArray9 = ds.MaxMin4.maxMin4(intArray6, 0, (int) (short) 0);
        int[] intArray12 = ds.MaxMin4.maxMin4(intArray6, (int) (byte) 1, (int) (short) 1);
        int[] intArray15 = ds.MaxMin4.maxMin4(intArray12, 1, 0);
        int[] intArray18 = ds.MaxMin4.maxMin4(intArray15, 1, 1);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray21 = ds.MaxMin4.maxMin4(intArray18, (int) (short) -1, 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[32, -1, 10, -1, 10, 1]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[32, 32]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray18), "[-1, -1]");
    }

    @Test
    public void test2024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2024");
        int[] intArray6 = new int[] { ' ', (short) -1, 10, (-1), 10, 1 };
        int[] intArray9 = ds.MaxMin4.maxMin4(intArray6, 0, (int) (short) 0);
        int[] intArray12 = ds.MaxMin4.maxMin4(intArray9, (int) (byte) 0, 0);
        int[] intArray15 = ds.MaxMin4.maxMin4(intArray9, (int) (short) 0, (int) (short) 0);
        int[] intArray18 = ds.MaxMin4.maxMin4(intArray15, 0, (int) (short) 1);
        int[] intArray21 = ds.MaxMin4.maxMin4(intArray18, 0, 0);
        int[] intArray24 = ds.MaxMin4.maxMin4(intArray18, 0, (int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray27 = ds.MaxMin4.maxMin4(intArray24, (int) (byte) 10, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[32, -1, 10, -1, 10, 1]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[32, 32]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[32, 32]");
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[32, 32]");
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray18), "[32, 32]");
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray21), "[32, 32]");
        org.junit.Assert.assertNotNull(intArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray24), "[32, 32]");
    }

    @Test
    public void test2025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2025");
        int[] intArray6 = new int[] { ' ', (short) -1, 10, (-1), 10, 1 };
        int[] intArray9 = ds.MaxMin4.maxMin4(intArray6, 0, (int) (short) 0);
        int[] intArray12 = ds.MaxMin4.maxMin4(intArray6, (int) (byte) 1, (int) (short) 1);
        int[] intArray15 = ds.MaxMin4.maxMin4(intArray12, 1, 0);
        int[] intArray18 = ds.MaxMin4.maxMin4(intArray15, 0, 0);
        int[] intArray21 = ds.MaxMin4.maxMin4(intArray18, 1, 0);
        int[] intArray24 = ds.MaxMin4.maxMin4(intArray18, (int) (short) 1, 0);
        int[] intArray27 = ds.MaxMin4.maxMin4(intArray24, 0, (int) (short) 0);
        int[] intArray30 = ds.MaxMin4.maxMin4(intArray27, (int) (byte) 0, (int) (short) 0);
        int[] intArray33 = ds.MaxMin4.maxMin4(intArray30, 0, (int) (short) 1);
        int[] intArray36 = ds.MaxMin4.maxMin4(intArray30, 0, 0);
        int[] intArray39 = ds.MaxMin4.maxMin4(intArray36, (int) (short) 1, (int) (byte) 0);
        int[] intArray42 = ds.MaxMin4.maxMin4(intArray39, 1, (int) (short) 1);
        int[] intArray45 = ds.MaxMin4.maxMin4(intArray42, 1, (int) (byte) 0);
        java.lang.Class<?> wildcardClass46 = intArray42.getClass();
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[32, -1, 10, -1, 10, 1]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[32, 32]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray18), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray21), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray24), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray27), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray30);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray30), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray33);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray33), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray36);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray36), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray39);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray39), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray42);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray42), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray45);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray45), "[-1, -1]");
        org.junit.Assert.assertNotNull(wildcardClass46);
    }

    @Test
    public void test2026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2026");
        int[] intArray6 = new int[] { ' ', (short) -1, 10, (-1), 10, 1 };
        int[] intArray9 = ds.MaxMin4.maxMin4(intArray6, 0, (int) (short) 0);
        int[] intArray12 = ds.MaxMin4.maxMin4(intArray6, (int) (byte) 1, (int) (short) 1);
        int[] intArray15 = ds.MaxMin4.maxMin4(intArray12, 1, 0);
        int[] intArray18 = ds.MaxMin4.maxMin4(intArray15, 1, 1);
        int[] intArray21 = ds.MaxMin4.maxMin4(intArray15, (int) (byte) 1, (int) (byte) 1);
        int[] intArray24 = ds.MaxMin4.maxMin4(intArray21, (int) (byte) 1, 0);
        java.lang.Class<?> wildcardClass25 = intArray21.getClass();
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[32, -1, 10, -1, 10, 1]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[32, 32]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray18), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray21), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray24), "[-1, -1]");
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test2027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2027");
        int[] intArray6 = new int[] { ' ', (short) -1, 10, (-1), 10, 1 };
        int[] intArray9 = ds.MaxMin4.maxMin4(intArray6, 0, (int) (short) 0);
        int[] intArray12 = ds.MaxMin4.maxMin4(intArray6, (int) (byte) 1, (int) (short) 1);
        int[] intArray15 = ds.MaxMin4.maxMin4(intArray12, 1, 0);
        int[] intArray18 = ds.MaxMin4.maxMin4(intArray15, 0, 0);
        int[] intArray21 = ds.MaxMin4.maxMin4(intArray18, 1, 0);
        int[] intArray24 = ds.MaxMin4.maxMin4(intArray18, (int) (short) 1, 0);
        int[] intArray27 = ds.MaxMin4.maxMin4(intArray24, 0, (int) (short) 0);
        int[] intArray30 = ds.MaxMin4.maxMin4(intArray27, (int) (byte) 0, (int) (short) 0);
        int[] intArray33 = ds.MaxMin4.maxMin4(intArray30, 0, (int) (short) 1);
        int[] intArray36 = ds.MaxMin4.maxMin4(intArray33, 1, (int) (byte) 1);
        java.lang.Class<?> wildcardClass37 = intArray36.getClass();
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[32, -1, 10, -1, 10, 1]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[32, 32]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray18), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray21), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray24), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray27), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray30);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray30), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray33);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray33), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray36);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray36), "[-1, -1]");
        org.junit.Assert.assertNotNull(wildcardClass37);
    }

    @Test
    public void test2028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2028");
        int[] intArray6 = new int[] { ' ', (short) -1, 10, (-1), 10, 1 };
        int[] intArray9 = ds.MaxMin4.maxMin4(intArray6, 0, (int) (short) 0);
        int[] intArray12 = ds.MaxMin4.maxMin4(intArray6, (int) (byte) 1, (int) (short) 1);
        int[] intArray15 = ds.MaxMin4.maxMin4(intArray12, 1, 0);
        int[] intArray18 = ds.MaxMin4.maxMin4(intArray15, 0, 0);
        int[] intArray21 = ds.MaxMin4.maxMin4(intArray15, 0, (int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray24 = ds.MaxMin4.maxMin4(intArray15, (int) (short) 0, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[32, -1, 10, -1, 10, 1]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[32, 32]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray18), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray21), "[-1, -1]");
    }

    @Test
    public void test2029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2029");
        int[] intArray0 = null;
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray3 = ds.MaxMin4.maxMin4(intArray0, (int) (byte) 10, 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2030");
        int[] intArray6 = new int[] { ' ', (short) -1, 10, (-1), 10, 1 };
        int[] intArray9 = ds.MaxMin4.maxMin4(intArray6, 0, (int) (short) 0);
        int[] intArray12 = ds.MaxMin4.maxMin4(intArray6, 0, (int) (byte) 1);
        int[] intArray15 = ds.MaxMin4.maxMin4(intArray12, (int) (byte) 0, (int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray18 = ds.MaxMin4.maxMin4(intArray12, (int) ' ', (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[32, -1, 10, -1, 10, 1]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[32, 32]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[32, -1]");
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[32, -1]");
    }

    @Test
    public void test2031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2031");
        int[] intArray6 = new int[] { ' ', (short) -1, 10, (-1), 10, 1 };
        int[] intArray9 = ds.MaxMin4.maxMin4(intArray6, 0, (int) (short) 0);
        int[] intArray12 = ds.MaxMin4.maxMin4(intArray9, (int) (byte) 1, (int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray15 = ds.MaxMin4.maxMin4(intArray12, (int) (short) 100, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[32, -1, 10, -1, 10, 1]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[32, 32]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[32, 32]");
    }

    @Test
    public void test2032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2032");
        int[] intArray0 = null;
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray3 = ds.MaxMin4.maxMin4(intArray0, (int) ' ', (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2033");
        int[] intArray6 = new int[] { ' ', (short) -1, 10, (-1), 10, 1 };
        int[] intArray9 = ds.MaxMin4.maxMin4(intArray6, 0, (int) (short) 0);
        int[] intArray12 = ds.MaxMin4.maxMin4(intArray6, 0, (int) (byte) 1);
        int[] intArray15 = ds.MaxMin4.maxMin4(intArray6, 0, (int) (short) 0);
        int[] intArray18 = ds.MaxMin4.maxMin4(intArray6, (int) (byte) 1, 0);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray21 = ds.MaxMin4.maxMin4(intArray6, (-1), (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[32, -1, 10, -1, 10, 1]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[32, 32]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[32, -1]");
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[32, 32]");
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray18), "[32, -1]");
    }

    @Test
    public void test2034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2034");
        int[] intArray6 = new int[] { ' ', (short) -1, 10, (-1), 10, 1 };
        int[] intArray9 = ds.MaxMin4.maxMin4(intArray6, 0, (int) (short) 0);
        int[] intArray12 = ds.MaxMin4.maxMin4(intArray9, (int) (byte) 0, 0);
        int[] intArray15 = ds.MaxMin4.maxMin4(intArray9, 0, 1);
        int[] intArray18 = ds.MaxMin4.maxMin4(intArray15, (int) (short) 0, (int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray21 = ds.MaxMin4.maxMin4(intArray15, (int) '4', 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[32, -1, 10, -1, 10, 1]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[32, 32]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[32, 32]");
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[32, 32]");
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray18), "[32, 32]");
    }

    @Test
    public void test2035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2035");
        int[] intArray6 = new int[] { ' ', (short) -1, 10, (-1), 10, 1 };
        int[] intArray9 = ds.MaxMin4.maxMin4(intArray6, 0, (int) (short) 0);
        int[] intArray12 = ds.MaxMin4.maxMin4(intArray9, 0, (int) (short) 1);
        int[] intArray15 = ds.MaxMin4.maxMin4(intArray12, (int) (byte) 1, (int) (short) 1);
        int[] intArray18 = ds.MaxMin4.maxMin4(intArray15, 0, (int) (short) 1);
        int[] intArray21 = ds.MaxMin4.maxMin4(intArray15, (int) (byte) 0, 1);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray24 = ds.MaxMin4.maxMin4(intArray15, 0, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[32, -1, 10, -1, 10, 1]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[32, 32]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[32, 32]");
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[32, 32]");
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray18), "[32, 32]");
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray21), "[32, 32]");
    }

    @Test
    public void test2036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2036");
        int[] intArray6 = new int[] { ' ', (short) -1, 10, (-1), 10, 1 };
        int[] intArray9 = ds.MaxMin4.maxMin4(intArray6, 0, (int) (short) 0);
        int[] intArray12 = ds.MaxMin4.maxMin4(intArray9, 0, (int) (short) 1);
        int[] intArray15 = ds.MaxMin4.maxMin4(intArray12, (int) (byte) 1, (int) (short) 1);
        int[] intArray18 = ds.MaxMin4.maxMin4(intArray15, 0, (int) (short) 1);
        int[] intArray21 = ds.MaxMin4.maxMin4(intArray18, 1, 0);
        int[] intArray24 = ds.MaxMin4.maxMin4(intArray21, 1, (int) (short) 0);
        int[] intArray27 = ds.MaxMin4.maxMin4(intArray24, (int) (short) 0, 1);
        int[] intArray30 = ds.MaxMin4.maxMin4(intArray27, (int) (short) 0, 0);
        int[] intArray33 = ds.MaxMin4.maxMin4(intArray27, 0, 0);
        int[] intArray36 = ds.MaxMin4.maxMin4(intArray27, (int) (short) 0, (int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray39 = ds.MaxMin4.maxMin4(intArray27, (int) (byte) 10, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[32, -1, 10, -1, 10, 1]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[32, 32]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[32, 32]");
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[32, 32]");
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray18), "[32, 32]");
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray21), "[32, 32]");
        org.junit.Assert.assertNotNull(intArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray24), "[32, 32]");
        org.junit.Assert.assertNotNull(intArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray27), "[32, 32]");
        org.junit.Assert.assertNotNull(intArray30);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray30), "[32, 32]");
        org.junit.Assert.assertNotNull(intArray33);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray33), "[32, 32]");
        org.junit.Assert.assertNotNull(intArray36);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray36), "[32, 32]");
    }

    @Test
    public void test2037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2037");
        int[] intArray0 = null;
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray3 = ds.MaxMin4.maxMin4(intArray0, (int) (short) 100, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2038");
        int[] intArray6 = new int[] { ' ', (short) -1, 10, (-1), 10, 1 };
        int[] intArray9 = ds.MaxMin4.maxMin4(intArray6, 0, (int) (short) 0);
        int[] intArray12 = ds.MaxMin4.maxMin4(intArray9, 0, (int) (short) 1);
        int[] intArray15 = ds.MaxMin4.maxMin4(intArray12, (int) (byte) 1, (int) (short) 1);
        int[] intArray18 = ds.MaxMin4.maxMin4(intArray15, 0, (int) (short) 1);
        int[] intArray21 = ds.MaxMin4.maxMin4(intArray15, 1, 0);
        int[] intArray24 = ds.MaxMin4.maxMin4(intArray15, 0, 0);
        int[] intArray27 = ds.MaxMin4.maxMin4(intArray15, 0, 0);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray30 = ds.MaxMin4.maxMin4(intArray15, (int) 'a', 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[32, -1, 10, -1, 10, 1]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[32, 32]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[32, 32]");
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[32, 32]");
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray18), "[32, 32]");
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray21), "[32, 32]");
        org.junit.Assert.assertNotNull(intArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray24), "[32, 32]");
        org.junit.Assert.assertNotNull(intArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray27), "[32, 32]");
    }

    @Test
    public void test2039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2039");
        int[] intArray6 = new int[] { ' ', (short) -1, 10, (-1), 10, 1 };
        int[] intArray9 = ds.MaxMin4.maxMin4(intArray6, 0, (int) (short) 0);
        int[] intArray12 = ds.MaxMin4.maxMin4(intArray9, 0, (int) (short) 1);
        int[] intArray15 = ds.MaxMin4.maxMin4(intArray12, (int) (byte) 1, (int) (short) 1);
        int[] intArray18 = ds.MaxMin4.maxMin4(intArray15, 0, (int) (short) 1);
        int[] intArray21 = ds.MaxMin4.maxMin4(intArray18, 1, 0);
        int[] intArray24 = ds.MaxMin4.maxMin4(intArray21, 1, (int) (short) 0);
        int[] intArray27 = ds.MaxMin4.maxMin4(intArray21, (int) (byte) 0, (int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray30 = ds.MaxMin4.maxMin4(intArray21, 100, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[32, -1, 10, -1, 10, 1]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[32, 32]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[32, 32]");
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[32, 32]");
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray18), "[32, 32]");
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray21), "[32, 32]");
        org.junit.Assert.assertNotNull(intArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray24), "[32, 32]");
        org.junit.Assert.assertNotNull(intArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray27), "[32, 32]");
    }

    @Test
    public void test2040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2040");
        int[] intArray6 = new int[] { ' ', (short) -1, 10, (-1), 10, 1 };
        int[] intArray9 = ds.MaxMin4.maxMin4(intArray6, 0, (int) (short) 0);
        int[] intArray12 = ds.MaxMin4.maxMin4(intArray6, (int) (byte) 1, (int) (short) 1);
        int[] intArray15 = ds.MaxMin4.maxMin4(intArray12, 1, 0);
        int[] intArray18 = ds.MaxMin4.maxMin4(intArray15, 0, 0);
        int[] intArray21 = ds.MaxMin4.maxMin4(intArray18, 1, 0);
        int[] intArray24 = ds.MaxMin4.maxMin4(intArray18, (int) (short) 1, 0);
        int[] intArray27 = ds.MaxMin4.maxMin4(intArray24, 0, (int) (short) 0);
        int[] intArray30 = ds.MaxMin4.maxMin4(intArray27, (int) (byte) 0, (int) (short) 0);
        int[] intArray33 = ds.MaxMin4.maxMin4(intArray27, (int) (short) 0, (int) (short) 1);
        int[] intArray36 = ds.MaxMin4.maxMin4(intArray33, (int) (byte) 0, 1);
        int[] intArray39 = ds.MaxMin4.maxMin4(intArray36, 0, 1);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray42 = ds.MaxMin4.maxMin4(intArray39, (int) (short) 0, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[32, -1, 10, -1, 10, 1]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[32, 32]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray18), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray21), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray24), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray27), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray30);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray30), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray33);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray33), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray36);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray36), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray39);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray39), "[-1, -1]");
    }

    @Test
    public void test2041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2041");
        int[] intArray4 = new int[] { (byte) 1, 10, (byte) -1, ' ' };
        int[] intArray7 = ds.MaxMin4.maxMin4(intArray4, (int) (short) 0, (int) (short) 0);
        int[] intArray10 = ds.MaxMin4.maxMin4(intArray4, 0, 0);
        int[] intArray13 = ds.MaxMin4.maxMin4(intArray4, 0, (int) (byte) 1);
        int[] intArray16 = ds.MaxMin4.maxMin4(intArray4, 0, (int) (byte) 1);
        int[] intArray19 = ds.MaxMin4.maxMin4(intArray4, (int) (short) 0, 0);
        int[] intArray22 = ds.MaxMin4.maxMin4(intArray19, (int) (short) 1, 0);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray25 = ds.MaxMin4.maxMin4(intArray19, (int) (short) 1, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[1, 10, -1, 32]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[10, 1]");
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray16), "[10, 1]");
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray19), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray22), "[1, 1]");
    }

    @Test
    public void test2042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2042");
        int[] intArray4 = new int[] { (byte) 1, 10, (byte) -1, ' ' };
        int[] intArray7 = ds.MaxMin4.maxMin4(intArray4, (int) (short) 0, (int) (short) 0);
        int[] intArray10 = ds.MaxMin4.maxMin4(intArray4, 0, 0);
        int[] intArray13 = ds.MaxMin4.maxMin4(intArray4, 0, (int) (byte) 1);
        int[] intArray16 = ds.MaxMin4.maxMin4(intArray4, 0, (int) (byte) 1);
        int[] intArray19 = ds.MaxMin4.maxMin4(intArray4, (int) (short) 0, 0);
        int[] intArray22 = ds.MaxMin4.maxMin4(intArray19, (int) (short) 1, 0);
        int[] intArray25 = ds.MaxMin4.maxMin4(intArray22, 0, (int) (byte) 1);
        int[] intArray28 = ds.MaxMin4.maxMin4(intArray22, (int) (short) 0, 0);
        int[] intArray31 = ds.MaxMin4.maxMin4(intArray28, 1, (int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray34 = ds.MaxMin4.maxMin4(intArray28, (int) (byte) 10, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[1, 10, -1, 32]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[10, 1]");
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray16), "[10, 1]");
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray19), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray22), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray25), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray28);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray28), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray31);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray31), "[1, 1]");
    }

    @Test
    public void test2043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2043");
        int[] intArray6 = new int[] { ' ', (short) -1, 10, (-1), 10, 1 };
        int[] intArray9 = ds.MaxMin4.maxMin4(intArray6, 0, (int) (short) 0);
        int[] intArray12 = ds.MaxMin4.maxMin4(intArray9, 0, (int) (short) 1);
        int[] intArray15 = ds.MaxMin4.maxMin4(intArray12, (int) (byte) 1, (int) (short) 1);
        int[] intArray18 = ds.MaxMin4.maxMin4(intArray15, 0, (int) (short) 1);
        int[] intArray21 = ds.MaxMin4.maxMin4(intArray15, 1, 0);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray24 = ds.MaxMin4.maxMin4(intArray21, 0, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[32, -1, 10, -1, 10, 1]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[32, 32]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[32, 32]");
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[32, 32]");
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray18), "[32, 32]");
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray21), "[32, 32]");
    }

    @Test
    public void test2044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2044");
        int[] intArray6 = new int[] { ' ', (short) -1, 10, (-1), 10, 1 };
        int[] intArray9 = ds.MaxMin4.maxMin4(intArray6, 0, (int) (short) 0);
        int[] intArray12 = ds.MaxMin4.maxMin4(intArray9, 0, (int) (short) 1);
        int[] intArray15 = ds.MaxMin4.maxMin4(intArray12, (int) (byte) 1, (int) (short) 1);
        int[] intArray18 = ds.MaxMin4.maxMin4(intArray15, 0, (int) (short) 1);
        int[] intArray21 = ds.MaxMin4.maxMin4(intArray15, 1, 0);
        int[] intArray24 = ds.MaxMin4.maxMin4(intArray21, (int) (byte) 0, (int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray27 = ds.MaxMin4.maxMin4(intArray24, (int) (short) -1, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[32, -1, 10, -1, 10, 1]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[32, 32]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[32, 32]");
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[32, 32]");
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray18), "[32, 32]");
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray21), "[32, 32]");
        org.junit.Assert.assertNotNull(intArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray24), "[32, 32]");
    }

    @Test
    public void test2045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2045");
        int[] intArray6 = new int[] { ' ', (short) -1, 10, (-1), 10, 1 };
        int[] intArray9 = ds.MaxMin4.maxMin4(intArray6, 0, (int) (short) 0);
        int[] intArray12 = ds.MaxMin4.maxMin4(intArray6, (int) (byte) 1, (int) (short) 1);
        int[] intArray15 = ds.MaxMin4.maxMin4(intArray12, (int) (byte) 0, 1);
        int[] intArray18 = ds.MaxMin4.maxMin4(intArray12, 0, 0);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray21 = ds.MaxMin4.maxMin4(intArray18, (int) 'a', 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[32, -1, 10, -1, 10, 1]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[32, 32]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray18), "[-1, -1]");
    }

    @Test
    public void test2046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2046");
        int[] intArray6 = new int[] { ' ', (short) -1, 10, (-1), 10, 1 };
        int[] intArray9 = ds.MaxMin4.maxMin4(intArray6, 0, (int) (short) 0);
        int[] intArray12 = ds.MaxMin4.maxMin4(intArray6, (int) (byte) 1, (int) (short) 1);
        int[] intArray15 = ds.MaxMin4.maxMin4(intArray12, 1, 0);
        int[] intArray18 = ds.MaxMin4.maxMin4(intArray15, 0, 0);
        int[] intArray21 = ds.MaxMin4.maxMin4(intArray15, (int) (short) 0, (int) (short) 1);
        int[] intArray24 = ds.MaxMin4.maxMin4(intArray21, (int) (byte) 0, (int) (short) 1);
        int[] intArray27 = ds.MaxMin4.maxMin4(intArray21, 0, 1);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray30 = ds.MaxMin4.maxMin4(intArray27, 0, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[32, -1, 10, -1, 10, 1]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[32, 32]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray18), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray21), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray24), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray27), "[-1, -1]");
    }

    @Test
    public void test2047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2047");
        int[] intArray6 = new int[] { ' ', (short) -1, 10, (-1), 10, 1 };
        int[] intArray9 = ds.MaxMin4.maxMin4(intArray6, 0, (int) (short) 0);
        int[] intArray12 = ds.MaxMin4.maxMin4(intArray6, (int) (byte) 1, (int) (short) 1);
        int[] intArray15 = ds.MaxMin4.maxMin4(intArray12, 1, 0);
        int[] intArray18 = ds.MaxMin4.maxMin4(intArray15, 0, 0);
        int[] intArray21 = ds.MaxMin4.maxMin4(intArray15, (int) (short) 0, (int) (short) 1);
        int[] intArray24 = ds.MaxMin4.maxMin4(intArray21, 0, (int) (short) 0);
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[32, -1, 10, -1, 10, 1]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[32, 32]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray18), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray21), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray24), "[-1, -1]");
    }

    @Test
    public void test2048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2048");
        int[] intArray6 = new int[] { ' ', (short) -1, 10, (-1), 10, 1 };
        int[] intArray9 = ds.MaxMin4.maxMin4(intArray6, 0, (int) (short) 0);
        int[] intArray12 = ds.MaxMin4.maxMin4(intArray9, 0, (int) (short) 1);
        int[] intArray15 = ds.MaxMin4.maxMin4(intArray12, (int) (byte) 1, (int) (short) 1);
        int[] intArray18 = ds.MaxMin4.maxMin4(intArray12, (int) (byte) 1, (int) (byte) 0);
        int[] intArray21 = ds.MaxMin4.maxMin4(intArray18, 0, 0);
        int[] intArray24 = ds.MaxMin4.maxMin4(intArray21, (int) (short) 1, (int) (short) 0);
        int[] intArray27 = ds.MaxMin4.maxMin4(intArray24, 0, 0);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray30 = ds.MaxMin4.maxMin4(intArray27, 0, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[32, -1, 10, -1, 10, 1]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[32, 32]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[32, 32]");
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[32, 32]");
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray18), "[32, 32]");
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray21), "[32, 32]");
        org.junit.Assert.assertNotNull(intArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray24), "[32, 32]");
        org.junit.Assert.assertNotNull(intArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray27), "[32, 32]");
    }

    @Test
    public void test2049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2049");
        int[] intArray6 = new int[] { ' ', (short) -1, 10, (-1), 10, 1 };
        int[] intArray9 = ds.MaxMin4.maxMin4(intArray6, 0, (int) (short) 0);
        int[] intArray12 = ds.MaxMin4.maxMin4(intArray9, 0, (int) (short) 1);
        int[] intArray15 = ds.MaxMin4.maxMin4(intArray12, (int) (byte) 1, (int) (short) 1);
        int[] intArray18 = ds.MaxMin4.maxMin4(intArray15, 0, (int) (short) 1);
        int[] intArray21 = ds.MaxMin4.maxMin4(intArray15, 1, 0);
        int[] intArray24 = ds.MaxMin4.maxMin4(intArray15, 0, 0);
        int[] intArray27 = ds.MaxMin4.maxMin4(intArray15, 0, 0);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray30 = ds.MaxMin4.maxMin4(intArray27, (int) (byte) 10, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[32, -1, 10, -1, 10, 1]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[32, 32]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[32, 32]");
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[32, 32]");
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray18), "[32, 32]");
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray21), "[32, 32]");
        org.junit.Assert.assertNotNull(intArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray24), "[32, 32]");
        org.junit.Assert.assertNotNull(intArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray27), "[32, 32]");
    }

    @Test
    public void test2050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2050");
        int[] intArray6 = new int[] { ' ', (short) -1, 10, (-1), 10, 1 };
        int[] intArray9 = ds.MaxMin4.maxMin4(intArray6, 0, (int) (short) 0);
        int[] intArray12 = ds.MaxMin4.maxMin4(intArray9, 0, (int) (short) 1);
        int[] intArray15 = ds.MaxMin4.maxMin4(intArray12, (int) (byte) 1, (int) (short) 1);
        int[] intArray18 = ds.MaxMin4.maxMin4(intArray15, 0, (int) (short) 1);
        int[] intArray21 = ds.MaxMin4.maxMin4(intArray18, 1, 0);
        int[] intArray24 = ds.MaxMin4.maxMin4(intArray18, 0, (int) (byte) 0);
        int[] intArray27 = ds.MaxMin4.maxMin4(intArray24, 0, 0);
        int[] intArray30 = ds.MaxMin4.maxMin4(intArray27, 1, 1);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray33 = ds.MaxMin4.maxMin4(intArray27, (int) '4', (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[32, -1, 10, -1, 10, 1]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[32, 32]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[32, 32]");
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[32, 32]");
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray18), "[32, 32]");
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray21), "[32, 32]");
        org.junit.Assert.assertNotNull(intArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray24), "[32, 32]");
        org.junit.Assert.assertNotNull(intArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray27), "[32, 32]");
        org.junit.Assert.assertNotNull(intArray30);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray30), "[32, 32]");
    }

    @Test
    public void test2051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2051");
        int[] intArray4 = new int[] { (byte) 1, 10, (byte) -1, ' ' };
        int[] intArray7 = ds.MaxMin4.maxMin4(intArray4, (int) (short) 0, (int) (short) 0);
        int[] intArray10 = ds.MaxMin4.maxMin4(intArray4, (int) (short) 0, 0);
        int[] intArray13 = ds.MaxMin4.maxMin4(intArray4, 1, 1);
        java.lang.Class<?> wildcardClass14 = intArray13.getClass();
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[1, 10, -1, 32]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[10, 10]");
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test2052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2052");
        int[] intArray6 = new int[] { ' ', (short) -1, 10, (-1), 10, 1 };
        int[] intArray9 = ds.MaxMin4.maxMin4(intArray6, 0, (int) (short) 0);
        int[] intArray12 = ds.MaxMin4.maxMin4(intArray6, (int) (byte) 1, (int) (short) 1);
        int[] intArray15 = ds.MaxMin4.maxMin4(intArray12, (int) (byte) 0, 1);
        int[] intArray18 = ds.MaxMin4.maxMin4(intArray12, 0, 0);
        int[] intArray21 = ds.MaxMin4.maxMin4(intArray12, (int) (byte) 0, (int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray24 = ds.MaxMin4.maxMin4(intArray21, 100, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[32, -1, 10, -1, 10, 1]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[32, 32]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray18), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray21), "[-1, -1]");
    }

    @Test
    public void test2053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2053");
        int[] intArray6 = new int[] { ' ', (short) -1, 10, (-1), 10, 1 };
        int[] intArray9 = ds.MaxMin4.maxMin4(intArray6, 0, (int) (short) 0);
        int[] intArray12 = ds.MaxMin4.maxMin4(intArray9, 0, (int) (short) 1);
        int[] intArray15 = ds.MaxMin4.maxMin4(intArray12, (int) (byte) 1, (int) (short) 1);
        int[] intArray18 = ds.MaxMin4.maxMin4(intArray12, (int) (byte) 1, (int) (byte) 0);
        int[] intArray21 = ds.MaxMin4.maxMin4(intArray12, 0, 0);
        int[] intArray24 = ds.MaxMin4.maxMin4(intArray12, (int) (byte) 1, (int) (short) 1);
        java.lang.Class<?> wildcardClass25 = intArray12.getClass();
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[32, -1, 10, -1, 10, 1]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[32, 32]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[32, 32]");
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[32, 32]");
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray18), "[32, 32]");
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray21), "[32, 32]");
        org.junit.Assert.assertNotNull(intArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray24), "[32, 32]");
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test2054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2054");
        int[] intArray6 = new int[] { ' ', (short) -1, 10, (-1), 10, 1 };
        int[] intArray9 = ds.MaxMin4.maxMin4(intArray6, 0, (int) (short) 0);
        int[] intArray12 = ds.MaxMin4.maxMin4(intArray9, (int) (byte) 0, 0);
        int[] intArray15 = ds.MaxMin4.maxMin4(intArray9, (int) (short) 0, (int) (short) 0);
        int[] intArray18 = ds.MaxMin4.maxMin4(intArray15, 0, (int) (short) 0);
        int[] intArray21 = ds.MaxMin4.maxMin4(intArray18, (int) (short) 0, 0);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray24 = ds.MaxMin4.maxMin4(intArray18, (int) (short) 100, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[32, -1, 10, -1, 10, 1]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[32, 32]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[32, 32]");
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[32, 32]");
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray18), "[32, 32]");
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray21), "[32, 32]");
    }

    @Test
    public void test2055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2055");
        int[] intArray6 = new int[] { ' ', (short) -1, 10, (-1), 10, 1 };
        int[] intArray9 = ds.MaxMin4.maxMin4(intArray6, 0, (int) (short) 0);
        int[] intArray12 = ds.MaxMin4.maxMin4(intArray6, (int) (byte) 1, (int) (short) 1);
        int[] intArray15 = ds.MaxMin4.maxMin4(intArray12, 1, 0);
        int[] intArray18 = ds.MaxMin4.maxMin4(intArray15, 0, 0);
        int[] intArray21 = ds.MaxMin4.maxMin4(intArray18, 1, 0);
        int[] intArray24 = ds.MaxMin4.maxMin4(intArray18, (int) (short) 1, 0);
        int[] intArray27 = ds.MaxMin4.maxMin4(intArray24, 0, (int) (short) 0);
        int[] intArray30 = ds.MaxMin4.maxMin4(intArray27, (int) (byte) 0, (int) (short) 0);
        int[] intArray33 = ds.MaxMin4.maxMin4(intArray30, 0, (int) (short) 1);
        int[] intArray36 = ds.MaxMin4.maxMin4(intArray30, 0, 0);
        int[] intArray39 = ds.MaxMin4.maxMin4(intArray36, (int) (short) 1, (int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray42 = ds.MaxMin4.maxMin4(intArray39, (int) (short) 1, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[32, -1, 10, -1, 10, 1]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[32, 32]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray18), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray21), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray24), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray27), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray30);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray30), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray33);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray33), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray36);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray36), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray39);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray39), "[-1, -1]");
    }

    @Test
    public void test2056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2056");
        int[] intArray6 = new int[] { ' ', (short) -1, 10, (-1), 10, 1 };
        int[] intArray9 = ds.MaxMin4.maxMin4(intArray6, 0, (int) (short) 0);
        int[] intArray12 = ds.MaxMin4.maxMin4(intArray9, 0, (int) (short) 1);
        int[] intArray15 = ds.MaxMin4.maxMin4(intArray9, 0, (int) (byte) 0);
        int[] intArray18 = ds.MaxMin4.maxMin4(intArray15, 1, 0);
        int[] intArray21 = ds.MaxMin4.maxMin4(intArray15, (int) (byte) 0, (int) (byte) 0);
        int[] intArray24 = ds.MaxMin4.maxMin4(intArray15, (int) (byte) 0, (int) (byte) 1);
        int[] intArray27 = ds.MaxMin4.maxMin4(intArray15, (int) (short) 1, (int) (byte) 1);
        java.lang.Class<?> wildcardClass28 = intArray27.getClass();
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[32, -1, 10, -1, 10, 1]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[32, 32]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[32, 32]");
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[32, 32]");
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray18), "[32, 32]");
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray21), "[32, 32]");
        org.junit.Assert.assertNotNull(intArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray24), "[32, 32]");
        org.junit.Assert.assertNotNull(intArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray27), "[32, 32]");
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test2057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2057");
        int[] intArray6 = new int[] { ' ', (short) -1, 10, (-1), 10, 1 };
        int[] intArray9 = ds.MaxMin4.maxMin4(intArray6, 0, (int) (short) 0);
        int[] intArray12 = ds.MaxMin4.maxMin4(intArray9, 0, (int) (short) 1);
        int[] intArray15 = ds.MaxMin4.maxMin4(intArray12, (int) (byte) 1, (int) (short) 1);
        int[] intArray18 = ds.MaxMin4.maxMin4(intArray15, 0, (int) (short) 1);
        int[] intArray21 = ds.MaxMin4.maxMin4(intArray18, 1, 0);
        int[] intArray24 = ds.MaxMin4.maxMin4(intArray21, 1, (int) (short) 0);
        int[] intArray27 = ds.MaxMin4.maxMin4(intArray21, (int) (byte) 0, (int) (byte) 0);
        int[] intArray30 = ds.MaxMin4.maxMin4(intArray27, (int) (short) 0, (int) (byte) 1);
        int[] intArray33 = ds.MaxMin4.maxMin4(intArray30, (int) (byte) 0, 0);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray36 = ds.MaxMin4.maxMin4(intArray30, (int) '#', 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[32, -1, 10, -1, 10, 1]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[32, 32]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[32, 32]");
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[32, 32]");
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray18), "[32, 32]");
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray21), "[32, 32]");
        org.junit.Assert.assertNotNull(intArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray24), "[32, 32]");
        org.junit.Assert.assertNotNull(intArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray27), "[32, 32]");
        org.junit.Assert.assertNotNull(intArray30);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray30), "[32, 32]");
        org.junit.Assert.assertNotNull(intArray33);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray33), "[32, 32]");
    }

    @Test
    public void test2058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2058");
        int[] intArray6 = new int[] { ' ', (short) -1, 10, (-1), 10, 1 };
        int[] intArray9 = ds.MaxMin4.maxMin4(intArray6, 0, (int) (short) 0);
        int[] intArray12 = ds.MaxMin4.maxMin4(intArray9, 0, (int) (short) 1);
        int[] intArray15 = ds.MaxMin4.maxMin4(intArray9, 0, (int) (byte) 0);
        int[] intArray18 = ds.MaxMin4.maxMin4(intArray15, 1, 0);
        int[] intArray21 = ds.MaxMin4.maxMin4(intArray15, (int) (byte) 0, (int) (byte) 0);
        int[] intArray24 = ds.MaxMin4.maxMin4(intArray15, (int) (byte) 0, (int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray27 = ds.MaxMin4.maxMin4(intArray24, (int) (short) -1, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[32, -1, 10, -1, 10, 1]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[32, 32]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[32, 32]");
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[32, 32]");
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray18), "[32, 32]");
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray21), "[32, 32]");
        org.junit.Assert.assertNotNull(intArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray24), "[32, 32]");
    }

    @Test
    public void test2059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2059");
        int[] intArray6 = new int[] { ' ', (short) -1, 10, (-1), 10, 1 };
        int[] intArray9 = ds.MaxMin4.maxMin4(intArray6, 0, (int) (short) 0);
        int[] intArray12 = ds.MaxMin4.maxMin4(intArray9, 0, (int) (short) 1);
        int[] intArray15 = ds.MaxMin4.maxMin4(intArray9, 0, (int) (byte) 0);
        int[] intArray18 = ds.MaxMin4.maxMin4(intArray9, 0, 0);
        int[] intArray21 = ds.MaxMin4.maxMin4(intArray18, 0, 0);
        int[] intArray24 = ds.MaxMin4.maxMin4(intArray21, 0, (int) (short) 0);
        java.lang.Class<?> wildcardClass25 = intArray21.getClass();
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[32, -1, 10, -1, 10, 1]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[32, 32]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[32, 32]");
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[32, 32]");
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray18), "[32, 32]");
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray21), "[32, 32]");
        org.junit.Assert.assertNotNull(intArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray24), "[32, 32]");
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test2060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2060");
        int[] intArray4 = new int[] { (byte) 1, 10, (byte) -1, ' ' };
        int[] intArray7 = ds.MaxMin4.maxMin4(intArray4, (int) (short) 0, (int) (short) 0);
        int[] intArray10 = ds.MaxMin4.maxMin4(intArray4, (int) (short) 0, 0);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray13 = ds.MaxMin4.maxMin4(intArray4, (int) (short) 1, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[1, 10, -1, 32]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[1, 1]");
    }

    @Test
    public void test2061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2061");
        int[] intArray6 = new int[] { ' ', (short) -1, 10, (-1), 10, 1 };
        int[] intArray9 = ds.MaxMin4.maxMin4(intArray6, 0, (int) (short) 0);
        int[] intArray12 = ds.MaxMin4.maxMin4(intArray6, (int) (byte) 1, (int) (short) 1);
        int[] intArray15 = ds.MaxMin4.maxMin4(intArray12, 1, 0);
        int[] intArray18 = ds.MaxMin4.maxMin4(intArray15, 0, 0);
        int[] intArray21 = ds.MaxMin4.maxMin4(intArray18, 1, 0);
        int[] intArray24 = ds.MaxMin4.maxMin4(intArray18, (int) (short) 1, 0);
        int[] intArray27 = ds.MaxMin4.maxMin4(intArray24, 0, (int) (short) 0);
        int[] intArray30 = ds.MaxMin4.maxMin4(intArray27, (int) (byte) 0, (int) (short) 0);
        int[] intArray33 = ds.MaxMin4.maxMin4(intArray30, 0, (int) (short) 1);
        int[] intArray36 = ds.MaxMin4.maxMin4(intArray30, 0, 0);
        int[] intArray39 = ds.MaxMin4.maxMin4(intArray36, (int) (short) 1, (int) (byte) 0);
        int[] intArray42 = ds.MaxMin4.maxMin4(intArray36, (int) (byte) 0, (int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray45 = ds.MaxMin4.maxMin4(intArray42, 10, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[32, -1, 10, -1, 10, 1]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[32, 32]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray18), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray21), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray24), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray27), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray30);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray30), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray33);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray33), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray36);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray36), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray39);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray39), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray42);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray42), "[-1, -1]");
    }

    @Test
    public void test2062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2062");
        int[] intArray6 = new int[] { ' ', (short) -1, 10, (-1), 10, 1 };
        int[] intArray9 = ds.MaxMin4.maxMin4(intArray6, 0, (int) (short) 0);
        int[] intArray12 = ds.MaxMin4.maxMin4(intArray9, (int) (byte) 0, 0);
        int[] intArray15 = ds.MaxMin4.maxMin4(intArray9, 0, 1);
        java.lang.Class<?> wildcardClass16 = intArray9.getClass();
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[32, -1, 10, -1, 10, 1]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[32, 32]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[32, 32]");
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[32, 32]");
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test2063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2063");
        int[] intArray4 = new int[] { (byte) 1, 10, (byte) -1, ' ' };
        int[] intArray7 = ds.MaxMin4.maxMin4(intArray4, (int) (short) 0, (int) (short) 0);
        int[] intArray10 = ds.MaxMin4.maxMin4(intArray4, 0, 0);
        int[] intArray13 = ds.MaxMin4.maxMin4(intArray4, 0, (int) (byte) 1);
        int[] intArray16 = ds.MaxMin4.maxMin4(intArray4, 0, (int) (byte) 1);
        int[] intArray19 = ds.MaxMin4.maxMin4(intArray4, (int) (short) 0, 0);
        int[] intArray22 = ds.MaxMin4.maxMin4(intArray19, (int) (short) 1, 0);
        int[] intArray25 = ds.MaxMin4.maxMin4(intArray22, 0, (int) (byte) 1);
        int[] intArray28 = ds.MaxMin4.maxMin4(intArray22, 1, (int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray31 = ds.MaxMin4.maxMin4(intArray28, (-1), (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[1, 10, -1, 32]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[10, 1]");
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray16), "[10, 1]");
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray19), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray22), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray25), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray28);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray28), "[1, 1]");
    }

    @Test
    public void test2064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2064");
        int[] intArray6 = new int[] { ' ', (short) -1, 10, (-1), 10, 1 };
        int[] intArray9 = ds.MaxMin4.maxMin4(intArray6, 0, (int) (short) 0);
        int[] intArray12 = ds.MaxMin4.maxMin4(intArray9, 0, (int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray15 = ds.MaxMin4.maxMin4(intArray9, (int) (byte) 10, (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[32, -1, 10, -1, 10, 1]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[32, 32]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[32, 32]");
    }

    @Test
    public void test2065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2065");
        int[] intArray6 = new int[] { ' ', (short) -1, 10, (-1), 10, 1 };
        int[] intArray9 = ds.MaxMin4.maxMin4(intArray6, 0, (int) (short) 0);
        int[] intArray12 = ds.MaxMin4.maxMin4(intArray6, (int) (byte) 1, (int) (short) 1);
        int[] intArray15 = ds.MaxMin4.maxMin4(intArray12, 0, (int) (short) 0);
        int[] intArray18 = ds.MaxMin4.maxMin4(intArray15, 0, 0);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray21 = ds.MaxMin4.maxMin4(intArray18, (int) (short) -1, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[32, -1, 10, -1, 10, 1]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[32, 32]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray18), "[-1, -1]");
    }

    @Test
    public void test2066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2066");
        int[] intArray6 = new int[] { ' ', (short) -1, 10, (-1), 10, 1 };
        int[] intArray9 = ds.MaxMin4.maxMin4(intArray6, 0, (int) (short) 0);
        int[] intArray12 = ds.MaxMin4.maxMin4(intArray9, 0, (int) (short) 1);
        int[] intArray15 = ds.MaxMin4.maxMin4(intArray12, (int) (byte) 1, (int) (short) 1);
        int[] intArray18 = ds.MaxMin4.maxMin4(intArray12, (int) (byte) 1, (int) (byte) 0);
        int[] intArray21 = ds.MaxMin4.maxMin4(intArray12, 0, 0);
        int[] intArray24 = ds.MaxMin4.maxMin4(intArray12, (int) (byte) 1, (int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray27 = ds.MaxMin4.maxMin4(intArray24, (int) (short) -1, (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[32, -1, 10, -1, 10, 1]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[32, 32]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[32, 32]");
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[32, 32]");
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray18), "[32, 32]");
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray21), "[32, 32]");
        org.junit.Assert.assertNotNull(intArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray24), "[32, 32]");
    }

    @Test
    public void test2067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2067");
        int[] intArray6 = new int[] { ' ', (short) -1, 10, (-1), 10, 1 };
        int[] intArray9 = ds.MaxMin4.maxMin4(intArray6, 0, (int) (short) 0);
        int[] intArray12 = ds.MaxMin4.maxMin4(intArray6, 0, (int) (byte) 1);
        int[] intArray15 = ds.MaxMin4.maxMin4(intArray6, 0, (int) (short) 0);
        int[] intArray18 = ds.MaxMin4.maxMin4(intArray6, (int) (byte) 1, 0);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray21 = ds.MaxMin4.maxMin4(intArray6, (int) (short) 1, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[32, -1, 10, -1, 10, 1]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[32, 32]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[32, -1]");
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[32, 32]");
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray18), "[32, -1]");
    }

    @Test
    public void test2068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2068");
        int[] intArray6 = new int[] { ' ', (short) -1, 10, (-1), 10, 1 };
        int[] intArray9 = ds.MaxMin4.maxMin4(intArray6, 0, (int) (short) 0);
        int[] intArray12 = ds.MaxMin4.maxMin4(intArray9, (int) (byte) 0, 0);
        int[] intArray15 = ds.MaxMin4.maxMin4(intArray9, (int) (short) 0, (int) (short) 0);
        int[] intArray18 = ds.MaxMin4.maxMin4(intArray15, 0, 1);
        int[] intArray21 = ds.MaxMin4.maxMin4(intArray15, (int) (byte) 0, 0);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray24 = ds.MaxMin4.maxMin4(intArray15, (int) (byte) 1, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[32, -1, 10, -1, 10, 1]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[32, 32]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[32, 32]");
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[32, 32]");
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray18), "[32, 32]");
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray21), "[32, 32]");
    }

    @Test
    public void test2069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2069");
        int[] intArray4 = new int[] { (byte) 1, 10, (byte) -1, ' ' };
        int[] intArray7 = ds.MaxMin4.maxMin4(intArray4, (int) (short) 0, (int) (short) 0);
        int[] intArray10 = ds.MaxMin4.maxMin4(intArray4, 0, 0);
        int[] intArray13 = ds.MaxMin4.maxMin4(intArray4, 0, (int) (byte) 1);
        int[] intArray16 = ds.MaxMin4.maxMin4(intArray4, 0, (int) (byte) 1);
        int[] intArray19 = ds.MaxMin4.maxMin4(intArray4, (int) (short) 0, 0);
        int[] intArray22 = ds.MaxMin4.maxMin4(intArray19, (int) (short) 1, 0);
        int[] intArray25 = ds.MaxMin4.maxMin4(intArray19, (int) (byte) 1, (int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray28 = ds.MaxMin4.maxMin4(intArray25, (int) (short) 10, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[1, 10, -1, 32]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[10, 1]");
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray16), "[10, 1]");
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray19), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray22), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray25), "[1, 1]");
    }

    @Test
    public void test2070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2070");
        int[] intArray6 = new int[] { ' ', (short) -1, 10, (-1), 10, 1 };
        int[] intArray9 = ds.MaxMin4.maxMin4(intArray6, 0, (int) (short) 0);
        int[] intArray12 = ds.MaxMin4.maxMin4(intArray9, 0, (int) (short) 1);
        int[] intArray15 = ds.MaxMin4.maxMin4(intArray12, (int) (byte) 1, (int) (short) 1);
        int[] intArray18 = ds.MaxMin4.maxMin4(intArray15, 0, (int) (short) 1);
        int[] intArray21 = ds.MaxMin4.maxMin4(intArray18, 1, 0);
        int[] intArray24 = ds.MaxMin4.maxMin4(intArray21, 1, (int) (short) 0);
        int[] intArray27 = ds.MaxMin4.maxMin4(intArray24, (int) (short) 0, 1);
        int[] intArray30 = ds.MaxMin4.maxMin4(intArray27, (int) (short) 0, 0);
        int[] intArray33 = ds.MaxMin4.maxMin4(intArray27, (int) (short) 1, (int) (short) 1);
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[32, -1, 10, -1, 10, 1]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[32, 32]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[32, 32]");
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[32, 32]");
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray18), "[32, 32]");
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray21), "[32, 32]");
        org.junit.Assert.assertNotNull(intArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray24), "[32, 32]");
        org.junit.Assert.assertNotNull(intArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray27), "[32, 32]");
        org.junit.Assert.assertNotNull(intArray30);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray30), "[32, 32]");
        org.junit.Assert.assertNotNull(intArray33);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray33), "[32, 32]");
    }

    @Test
    public void test2071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2071");
        int[] intArray6 = new int[] { ' ', (short) -1, 10, (-1), 10, 1 };
        int[] intArray9 = ds.MaxMin4.maxMin4(intArray6, 0, (int) (short) 0);
        int[] intArray12 = ds.MaxMin4.maxMin4(intArray9, (int) (byte) 0, 0);
        int[] intArray15 = ds.MaxMin4.maxMin4(intArray9, (int) (short) 0, (int) (short) 0);
        int[] intArray18 = ds.MaxMin4.maxMin4(intArray15, 0, (int) (short) 1);
        int[] intArray21 = ds.MaxMin4.maxMin4(intArray18, 0, 0);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray24 = ds.MaxMin4.maxMin4(intArray21, (int) (byte) -1, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[32, -1, 10, -1, 10, 1]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[32, 32]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[32, 32]");
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[32, 32]");
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray18), "[32, 32]");
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray21), "[32, 32]");
    }

    @Test
    public void test2072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2072");
        int[] intArray6 = new int[] { ' ', (short) -1, 10, (-1), 10, 1 };
        int[] intArray9 = ds.MaxMin4.maxMin4(intArray6, 0, (int) (short) 0);
        int[] intArray12 = ds.MaxMin4.maxMin4(intArray9, 0, (int) (short) 1);
        int[] intArray15 = ds.MaxMin4.maxMin4(intArray12, (int) (byte) 1, (int) (short) 1);
        int[] intArray18 = ds.MaxMin4.maxMin4(intArray15, 0, (int) (short) 1);
        int[] intArray21 = ds.MaxMin4.maxMin4(intArray15, 1, 0);
        int[] intArray24 = ds.MaxMin4.maxMin4(intArray15, (int) (short) 0, 1);
        int[] intArray27 = ds.MaxMin4.maxMin4(intArray24, 0, 1);
        int[] intArray30 = ds.MaxMin4.maxMin4(intArray24, 0, (int) (short) 1);
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[32, -1, 10, -1, 10, 1]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[32, 32]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[32, 32]");
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[32, 32]");
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray18), "[32, 32]");
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray21), "[32, 32]");
        org.junit.Assert.assertNotNull(intArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray24), "[32, 32]");
        org.junit.Assert.assertNotNull(intArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray27), "[32, 32]");
        org.junit.Assert.assertNotNull(intArray30);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray30), "[32, 32]");
    }

    @Test
    public void test2073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2073");
        int[] intArray6 = new int[] { ' ', (short) -1, 10, (-1), 10, 1 };
        int[] intArray9 = ds.MaxMin4.maxMin4(intArray6, 0, (int) (short) 0);
        int[] intArray12 = ds.MaxMin4.maxMin4(intArray9, 0, (int) (short) 1);
        int[] intArray15 = ds.MaxMin4.maxMin4(intArray12, (int) (byte) 1, (int) (short) 1);
        int[] intArray18 = ds.MaxMin4.maxMin4(intArray12, (int) (byte) 1, (int) (byte) 0);
        int[] intArray21 = ds.MaxMin4.maxMin4(intArray18, 0, 0);
        int[] intArray24 = ds.MaxMin4.maxMin4(intArray21, (int) (short) 1, (int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray27 = ds.MaxMin4.maxMin4(intArray21, (int) (byte) 100, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[32, -1, 10, -1, 10, 1]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[32, 32]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[32, 32]");
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[32, 32]");
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray18), "[32, 32]");
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray21), "[32, 32]");
        org.junit.Assert.assertNotNull(intArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray24), "[32, 32]");
    }

    @Test
    public void test2074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2074");
        int[] intArray6 = new int[] { ' ', (short) -1, 10, (-1), 10, 1 };
        int[] intArray9 = ds.MaxMin4.maxMin4(intArray6, 0, (int) (short) 0);
        int[] intArray12 = ds.MaxMin4.maxMin4(intArray6, (int) (byte) 1, (int) (short) 1);
        int[] intArray15 = ds.MaxMin4.maxMin4(intArray12, 1, 0);
        int[] intArray18 = ds.MaxMin4.maxMin4(intArray15, 0, 0);
        int[] intArray21 = ds.MaxMin4.maxMin4(intArray18, 1, 0);
        int[] intArray24 = ds.MaxMin4.maxMin4(intArray18, (int) (short) 1, 0);
        int[] intArray27 = ds.MaxMin4.maxMin4(intArray24, 0, (int) (short) 0);
        int[] intArray30 = ds.MaxMin4.maxMin4(intArray27, (int) (byte) 0, (int) (short) 0);
        int[] intArray33 = ds.MaxMin4.maxMin4(intArray27, (int) (short) 0, (int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray36 = ds.MaxMin4.maxMin4(intArray27, (int) ' ', (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[32, -1, 10, -1, 10, 1]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[32, 32]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray18), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray21), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray24), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray27), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray30);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray30), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray33);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray33), "[-1, -1]");
    }

    @Test
    public void test2075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2075");
        int[] intArray0 = null;
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray3 = ds.MaxMin4.maxMin4(intArray0, 0, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2076");
        int[] intArray6 = new int[] { ' ', (short) -1, 10, (-1), 10, 1 };
        int[] intArray9 = ds.MaxMin4.maxMin4(intArray6, 0, (int) (short) 0);
        int[] intArray12 = ds.MaxMin4.maxMin4(intArray9, 0, (int) (short) 1);
        int[] intArray15 = ds.MaxMin4.maxMin4(intArray12, (int) (byte) 1, (int) (short) 1);
        int[] intArray18 = ds.MaxMin4.maxMin4(intArray12, 0, 1);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray21 = ds.MaxMin4.maxMin4(intArray12, 10, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[32, -1, 10, -1, 10, 1]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[32, 32]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[32, 32]");
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[32, 32]");
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray18), "[32, 32]");
    }

    @Test
    public void test2077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2077");
        int[] intArray4 = new int[] { (byte) 1, 10, (byte) -1, ' ' };
        int[] intArray7 = ds.MaxMin4.maxMin4(intArray4, (int) (short) 0, (int) (short) 0);
        int[] intArray10 = ds.MaxMin4.maxMin4(intArray4, 0, 0);
        int[] intArray13 = ds.MaxMin4.maxMin4(intArray10, (int) (short) 0, (int) (byte) 0);
        int[] intArray16 = ds.MaxMin4.maxMin4(intArray13, (int) (short) 1, (int) (byte) 1);
        int[] intArray19 = ds.MaxMin4.maxMin4(intArray13, (int) (byte) 0, (int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray22 = ds.MaxMin4.maxMin4(intArray19, (int) '4', (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[1, 10, -1, 32]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray16), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray19), "[1, 1]");
    }

    @Test
    public void test2078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2078");
        int[] intArray6 = new int[] { ' ', (short) -1, 10, (-1), 10, 1 };
        int[] intArray9 = ds.MaxMin4.maxMin4(intArray6, 0, (int) (short) 0);
        int[] intArray12 = ds.MaxMin4.maxMin4(intArray9, 0, (int) (short) 1);
        int[] intArray15 = ds.MaxMin4.maxMin4(intArray12, (int) (byte) 1, (int) (short) 1);
        int[] intArray18 = ds.MaxMin4.maxMin4(intArray12, (int) (byte) 1, (int) (byte) 0);
        int[] intArray21 = ds.MaxMin4.maxMin4(intArray18, 0, 0);
        int[] intArray24 = ds.MaxMin4.maxMin4(intArray21, (int) (short) 1, (int) (short) 0);
        int[] intArray27 = ds.MaxMin4.maxMin4(intArray24, 0, 0);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray30 = ds.MaxMin4.maxMin4(intArray24, 0, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[32, -1, 10, -1, 10, 1]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[32, 32]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[32, 32]");
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[32, 32]");
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray18), "[32, 32]");
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray21), "[32, 32]");
        org.junit.Assert.assertNotNull(intArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray24), "[32, 32]");
        org.junit.Assert.assertNotNull(intArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray27), "[32, 32]");
    }

    @Test
    public void test2079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2079");
        int[] intArray4 = new int[] { (byte) 1, 10, (byte) -1, ' ' };
        int[] intArray7 = ds.MaxMin4.maxMin4(intArray4, (int) (short) 0, (int) (short) 0);
        int[] intArray10 = ds.MaxMin4.maxMin4(intArray4, 0, 0);
        int[] intArray13 = ds.MaxMin4.maxMin4(intArray4, 0, (int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray16 = ds.MaxMin4.maxMin4(intArray4, (int) (byte) 1, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[1, 10, -1, 32]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[10, 1]");
    }

    @Test
    public void test2080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2080");
        int[] intArray6 = new int[] { ' ', (short) -1, 10, (-1), 10, 1 };
        int[] intArray9 = ds.MaxMin4.maxMin4(intArray6, 0, (int) (short) 0);
        int[] intArray12 = ds.MaxMin4.maxMin4(intArray6, 0, 0);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray15 = ds.MaxMin4.maxMin4(intArray6, (int) (byte) -1, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[32, -1, 10, -1, 10, 1]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[32, 32]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[32, 32]");
    }

    @Test
    public void test2081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2081");
        int[] intArray6 = new int[] { ' ', (short) -1, 10, (-1), 10, 1 };
        int[] intArray9 = ds.MaxMin4.maxMin4(intArray6, 0, (int) (short) 0);
        int[] intArray12 = ds.MaxMin4.maxMin4(intArray9, 0, (int) (short) 1);
        int[] intArray15 = ds.MaxMin4.maxMin4(intArray9, 0, (int) (byte) 0);
        int[] intArray18 = ds.MaxMin4.maxMin4(intArray15, 1, 0);
        int[] intArray21 = ds.MaxMin4.maxMin4(intArray15, (int) (byte) 0, (int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray24 = ds.MaxMin4.maxMin4(intArray21, (int) ' ', (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[32, -1, 10, -1, 10, 1]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[32, 32]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[32, 32]");
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[32, 32]");
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray18), "[32, 32]");
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray21), "[32, 32]");
    }

    @Test
    public void test2082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2082");
        int[] intArray6 = new int[] { ' ', (short) -1, 10, (-1), 10, 1 };
        int[] intArray9 = ds.MaxMin4.maxMin4(intArray6, 0, (int) (short) 0);
        int[] intArray12 = ds.MaxMin4.maxMin4(intArray9, 0, (int) (short) 1);
        int[] intArray15 = ds.MaxMin4.maxMin4(intArray12, (int) (byte) 1, (int) (short) 1);
        int[] intArray18 = ds.MaxMin4.maxMin4(intArray15, (int) (byte) 0, 0);
        int[] intArray21 = ds.MaxMin4.maxMin4(intArray18, 0, 0);
        int[] intArray24 = ds.MaxMin4.maxMin4(intArray18, (int) (short) 0, (int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray27 = ds.MaxMin4.maxMin4(intArray24, (int) (byte) 100, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[32, -1, 10, -1, 10, 1]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[32, 32]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[32, 32]");
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[32, 32]");
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray18), "[32, 32]");
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray21), "[32, 32]");
        org.junit.Assert.assertNotNull(intArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray24), "[32, 32]");
    }

    @Test
    public void test2083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2083");
        int[] intArray4 = new int[] { (byte) 1, 10, (byte) -1, ' ' };
        int[] intArray7 = ds.MaxMin4.maxMin4(intArray4, (int) (short) 0, (int) (short) 0);
        int[] intArray10 = ds.MaxMin4.maxMin4(intArray4, 0, 0);
        int[] intArray13 = ds.MaxMin4.maxMin4(intArray4, 0, (int) (byte) 1);
        int[] intArray16 = ds.MaxMin4.maxMin4(intArray4, 0, (int) (byte) 1);
        int[] intArray19 = ds.MaxMin4.maxMin4(intArray4, (int) (short) 0, 0);
        int[] intArray22 = ds.MaxMin4.maxMin4(intArray19, (int) (short) 1, 0);
        int[] intArray25 = ds.MaxMin4.maxMin4(intArray19, (int) (byte) 0, (int) (short) 1);
        int[] intArray28 = ds.MaxMin4.maxMin4(intArray19, 1, 0);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray31 = ds.MaxMin4.maxMin4(intArray19, (int) (short) 100, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[1, 10, -1, 32]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[10, 1]");
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray16), "[10, 1]");
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray19), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray22), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray25), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray28);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray28), "[1, 1]");
    }

    @Test
    public void test2084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2084");
        int[] intArray6 = new int[] { ' ', (short) -1, 10, (-1), 10, 1 };
        int[] intArray9 = ds.MaxMin4.maxMin4(intArray6, 0, (int) (short) 0);
        int[] intArray12 = ds.MaxMin4.maxMin4(intArray6, (int) (byte) 1, (int) (short) 1);
        int[] intArray15 = ds.MaxMin4.maxMin4(intArray12, 1, 0);
        int[] intArray18 = ds.MaxMin4.maxMin4(intArray15, 1, 1);
        int[] intArray21 = ds.MaxMin4.maxMin4(intArray15, (int) (byte) 1, (int) (byte) 1);
        int[] intArray24 = ds.MaxMin4.maxMin4(intArray15, (int) (byte) 1, (int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray27 = ds.MaxMin4.maxMin4(intArray15, (int) (byte) 10, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[32, -1, 10, -1, 10, 1]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[32, 32]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray18), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray21), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray24), "[-1, -1]");
    }

    @Test
    public void test2085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2085");
        int[] intArray4 = new int[] { (byte) 1, 10, (byte) -1, ' ' };
        int[] intArray7 = ds.MaxMin4.maxMin4(intArray4, (int) (short) 0, (int) (short) 0);
        int[] intArray10 = ds.MaxMin4.maxMin4(intArray4, (int) (short) 0, 0);
        int[] intArray13 = ds.MaxMin4.maxMin4(intArray10, (int) (byte) 0, (int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray16 = ds.MaxMin4.maxMin4(intArray13, (int) 'a', 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[1, 10, -1, 32]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[1, 1]");
    }

    @Test
    public void test2086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2086");
        int[] intArray0 = null;
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray3 = ds.MaxMin4.maxMin4(intArray0, (int) (byte) 1, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2087");
        int[] intArray6 = new int[] { ' ', (short) -1, 10, (-1), 10, 1 };
        int[] intArray9 = ds.MaxMin4.maxMin4(intArray6, 0, (int) (short) 0);
        int[] intArray12 = ds.MaxMin4.maxMin4(intArray9, 0, (int) (short) 1);
        int[] intArray15 = ds.MaxMin4.maxMin4(intArray12, (int) (byte) 1, (int) (short) 1);
        int[] intArray18 = ds.MaxMin4.maxMin4(intArray12, (int) (byte) 1, (int) (byte) 0);
        int[] intArray21 = ds.MaxMin4.maxMin4(intArray12, 0, 0);
        int[] intArray24 = ds.MaxMin4.maxMin4(intArray21, (int) (byte) 0, (int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray27 = ds.MaxMin4.maxMin4(intArray24, (int) (short) -1, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[32, -1, 10, -1, 10, 1]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[32, 32]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[32, 32]");
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[32, 32]");
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray18), "[32, 32]");
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray21), "[32, 32]");
        org.junit.Assert.assertNotNull(intArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray24), "[32, 32]");
    }

    @Test
    public void test2088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2088");
        int[] intArray6 = new int[] { ' ', (short) -1, 10, (-1), 10, 1 };
        int[] intArray9 = ds.MaxMin4.maxMin4(intArray6, 0, (int) (short) 0);
        int[] intArray12 = ds.MaxMin4.maxMin4(intArray6, (int) (byte) 1, (int) (short) 1);
        int[] intArray15 = ds.MaxMin4.maxMin4(intArray12, 1, 0);
        int[] intArray18 = ds.MaxMin4.maxMin4(intArray15, 0, 0);
        int[] intArray21 = ds.MaxMin4.maxMin4(intArray15, (int) (short) 0, (int) (short) 1);
        int[] intArray24 = ds.MaxMin4.maxMin4(intArray21, (int) (byte) 0, (int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray27 = ds.MaxMin4.maxMin4(intArray21, (int) (byte) 100, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[32, -1, 10, -1, 10, 1]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[32, 32]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray18), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray21), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray24), "[-1, -1]");
    }

    @Test
    public void test2089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2089");
        int[] intArray6 = new int[] { ' ', (short) -1, 10, (-1), 10, 1 };
        int[] intArray9 = ds.MaxMin4.maxMin4(intArray6, 0, (int) (short) 0);
        int[] intArray12 = ds.MaxMin4.maxMin4(intArray6, (int) (byte) 1, (int) (short) 1);
        int[] intArray15 = ds.MaxMin4.maxMin4(intArray12, 1, 0);
        int[] intArray18 = ds.MaxMin4.maxMin4(intArray15, 0, 0);
        int[] intArray21 = ds.MaxMin4.maxMin4(intArray18, 1, 0);
        int[] intArray24 = ds.MaxMin4.maxMin4(intArray18, (int) (short) 1, 0);
        int[] intArray27 = ds.MaxMin4.maxMin4(intArray24, 0, (int) (short) 0);
        int[] intArray30 = ds.MaxMin4.maxMin4(intArray27, (int) (byte) 0, (int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray33 = ds.MaxMin4.maxMin4(intArray30, (int) (short) 100, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[32, -1, 10, -1, 10, 1]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[32, 32]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray18), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray21), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray24), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray27), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray30);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray30), "[-1, -1]");
    }

    @Test
    public void test2090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2090");
        int[] intArray6 = new int[] { ' ', (short) -1, 10, (-1), 10, 1 };
        int[] intArray9 = ds.MaxMin4.maxMin4(intArray6, 0, (int) (short) 0);
        int[] intArray12 = ds.MaxMin4.maxMin4(intArray6, (int) (byte) 1, (int) (short) 1);
        int[] intArray15 = ds.MaxMin4.maxMin4(intArray12, 1, 0);
        int[] intArray18 = ds.MaxMin4.maxMin4(intArray15, 0, 0);
        int[] intArray21 = ds.MaxMin4.maxMin4(intArray18, 1, 0);
        int[] intArray24 = ds.MaxMin4.maxMin4(intArray18, (int) (short) 1, 0);
        int[] intArray27 = ds.MaxMin4.maxMin4(intArray24, 0, (int) (short) 0);
        int[] intArray30 = ds.MaxMin4.maxMin4(intArray27, (int) (byte) 0, (int) (short) 0);
        int[] intArray33 = ds.MaxMin4.maxMin4(intArray30, 0, (int) (short) 1);
        int[] intArray36 = ds.MaxMin4.maxMin4(intArray33, 1, (int) (byte) 1);
        int[] intArray39 = ds.MaxMin4.maxMin4(intArray33, (int) (byte) 0, (int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray42 = ds.MaxMin4.maxMin4(intArray33, (int) (byte) 0, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[32, -1, 10, -1, 10, 1]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[32, 32]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray18), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray21), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray24), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray27), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray30);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray30), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray33);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray33), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray36);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray36), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray39);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray39), "[-1, -1]");
    }

    @Test
    public void test2091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2091");
        int[] intArray4 = new int[] { (byte) 1, 10, (byte) -1, ' ' };
        int[] intArray7 = ds.MaxMin4.maxMin4(intArray4, (int) (short) 0, (int) (short) 0);
        int[] intArray10 = ds.MaxMin4.maxMin4(intArray4, 0, 0);
        int[] intArray13 = ds.MaxMin4.maxMin4(intArray4, (int) (byte) 0, (int) (short) 0);
        int[] intArray16 = ds.MaxMin4.maxMin4(intArray13, 1, 0);
        int[] intArray19 = ds.MaxMin4.maxMin4(intArray16, (int) (short) 0, (int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray22 = ds.MaxMin4.maxMin4(intArray16, (int) ' ', 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[1, 10, -1, 32]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray16), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray19), "[1, 1]");
    }

    @Test
    public void test2092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2092");
        int[] intArray0 = null;
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray3 = ds.MaxMin4.maxMin4(intArray0, (int) 'a', (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2093");
        int[] intArray6 = new int[] { ' ', (short) -1, 10, (-1), 10, 1 };
        int[] intArray9 = ds.MaxMin4.maxMin4(intArray6, 0, (int) (short) 0);
        int[] intArray12 = ds.MaxMin4.maxMin4(intArray6, (int) (byte) 1, (int) (short) 1);
        int[] intArray15 = ds.MaxMin4.maxMin4(intArray12, 1, 0);
        int[] intArray18 = ds.MaxMin4.maxMin4(intArray15, 1, 1);
        int[] intArray21 = ds.MaxMin4.maxMin4(intArray18, (int) (short) 0, (int) (short) 1);
        int[] intArray24 = ds.MaxMin4.maxMin4(intArray18, (int) (short) 0, (int) (short) 1);
        int[] intArray27 = ds.MaxMin4.maxMin4(intArray18, 1, (int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray30 = ds.MaxMin4.maxMin4(intArray27, 0, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[32, -1, 10, -1, 10, 1]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[32, 32]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray18), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray21), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray24), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray27), "[-1, -1]");
    }

    @Test
    public void test2094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2094");
        int[] intArray6 = new int[] { ' ', (short) -1, 10, (-1), 10, 1 };
        int[] intArray9 = ds.MaxMin4.maxMin4(intArray6, 0, (int) (short) 0);
        int[] intArray12 = ds.MaxMin4.maxMin4(intArray6, (int) (byte) 1, (int) (short) 1);
        int[] intArray15 = ds.MaxMin4.maxMin4(intArray12, 1, 0);
        int[] intArray18 = ds.MaxMin4.maxMin4(intArray15, 0, 0);
        int[] intArray21 = ds.MaxMin4.maxMin4(intArray18, 1, 0);
        int[] intArray24 = ds.MaxMin4.maxMin4(intArray18, (int) (short) 1, 0);
        int[] intArray27 = ds.MaxMin4.maxMin4(intArray24, 0, (int) (short) 0);
        int[] intArray30 = ds.MaxMin4.maxMin4(intArray27, (int) (byte) 0, (int) (short) 0);
        int[] intArray33 = ds.MaxMin4.maxMin4(intArray27, (int) (short) 0, (int) (short) 1);
        int[] intArray36 = ds.MaxMin4.maxMin4(intArray33, (int) (byte) 0, 1);
        int[] intArray39 = ds.MaxMin4.maxMin4(intArray36, 0, 1);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray42 = ds.MaxMin4.maxMin4(intArray39, (int) (short) -1, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[32, -1, 10, -1, 10, 1]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[32, 32]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray18), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray21), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray24), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray27), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray30);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray30), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray33);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray33), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray36);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray36), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray39);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray39), "[-1, -1]");
    }

    @Test
    public void test2095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2095");
        int[] intArray6 = new int[] { ' ', (short) -1, 10, (-1), 10, 1 };
        int[] intArray9 = ds.MaxMin4.maxMin4(intArray6, 0, (int) (short) 0);
        int[] intArray12 = ds.MaxMin4.maxMin4(intArray6, (int) (byte) 1, (int) (short) 1);
        int[] intArray15 = ds.MaxMin4.maxMin4(intArray12, 1, 0);
        int[] intArray18 = ds.MaxMin4.maxMin4(intArray15, 0, 0);
        int[] intArray21 = ds.MaxMin4.maxMin4(intArray15, (int) (short) 0, (int) (short) 1);
        int[] intArray24 = ds.MaxMin4.maxMin4(intArray21, (int) (byte) 0, (int) (short) 1);
        int[] intArray27 = ds.MaxMin4.maxMin4(intArray21, 0, 1);
        int[] intArray30 = ds.MaxMin4.maxMin4(intArray27, (int) (short) 0, (int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray33 = ds.MaxMin4.maxMin4(intArray27, (-1), (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[32, -1, 10, -1, 10, 1]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[32, 32]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray18), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray21), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray24), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray27), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray30);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray30), "[-1, -1]");
    }

    @Test
    public void test2096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2096");
        int[] intArray0 = null;
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray3 = ds.MaxMin4.maxMin4(intArray0, 0, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2097");
        int[] intArray6 = new int[] { ' ', (short) -1, 10, (-1), 10, 1 };
        int[] intArray9 = ds.MaxMin4.maxMin4(intArray6, 0, (int) (short) 0);
        int[] intArray12 = ds.MaxMin4.maxMin4(intArray9, 0, (int) (short) 1);
        int[] intArray15 = ds.MaxMin4.maxMin4(intArray12, 1, (int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray18 = ds.MaxMin4.maxMin4(intArray15, 100, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[32, -1, 10, -1, 10, 1]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[32, 32]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[32, 32]");
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[32, 32]");
    }

    @Test
    public void test2098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2098");
        int[] intArray6 = new int[] { ' ', (short) -1, 10, (-1), 10, 1 };
        int[] intArray9 = ds.MaxMin4.maxMin4(intArray6, 0, (int) (short) 0);
        int[] intArray12 = ds.MaxMin4.maxMin4(intArray9, 0, (int) (short) 1);
        int[] intArray15 = ds.MaxMin4.maxMin4(intArray12, (int) (byte) 1, (int) (short) 1);
        int[] intArray18 = ds.MaxMin4.maxMin4(intArray15, 0, (int) (short) 1);
        int[] intArray21 = ds.MaxMin4.maxMin4(intArray15, 1, 0);
        int[] intArray24 = ds.MaxMin4.maxMin4(intArray15, (int) (short) 0, 1);
        int[] intArray27 = ds.MaxMin4.maxMin4(intArray24, 0, 1);
        int[] intArray30 = ds.MaxMin4.maxMin4(intArray27, 0, (int) (short) 1);
        int[] intArray33 = ds.MaxMin4.maxMin4(intArray27, 0, 1);
        int[] intArray36 = ds.MaxMin4.maxMin4(intArray27, 0, 1);
        int[] intArray39 = ds.MaxMin4.maxMin4(intArray36, (int) (byte) 0, 0);
        java.lang.Class<?> wildcardClass40 = intArray36.getClass();
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[32, -1, 10, -1, 10, 1]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[32, 32]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[32, 32]");
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[32, 32]");
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray18), "[32, 32]");
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray21), "[32, 32]");
        org.junit.Assert.assertNotNull(intArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray24), "[32, 32]");
        org.junit.Assert.assertNotNull(intArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray27), "[32, 32]");
        org.junit.Assert.assertNotNull(intArray30);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray30), "[32, 32]");
        org.junit.Assert.assertNotNull(intArray33);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray33), "[32, 32]");
        org.junit.Assert.assertNotNull(intArray36);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray36), "[32, 32]");
        org.junit.Assert.assertNotNull(intArray39);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray39), "[32, 32]");
        org.junit.Assert.assertNotNull(wildcardClass40);
    }

    @Test
    public void test2099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2099");
        int[] intArray6 = new int[] { ' ', (short) -1, 10, (-1), 10, 1 };
        int[] intArray9 = ds.MaxMin4.maxMin4(intArray6, 0, (int) (short) 0);
        int[] intArray12 = ds.MaxMin4.maxMin4(intArray9, (int) (byte) 0, 0);
        int[] intArray15 = ds.MaxMin4.maxMin4(intArray9, 0, 1);
        int[] intArray18 = ds.MaxMin4.maxMin4(intArray15, (int) (short) 0, (int) (short) 0);
        int[] intArray21 = ds.MaxMin4.maxMin4(intArray15, (int) (short) 1, 0);
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[32, -1, 10, -1, 10, 1]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[32, 32]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[32, 32]");
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[32, 32]");
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray18), "[32, 32]");
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray21), "[32, 32]");
    }

    @Test
    public void test2100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2100");
        int[] intArray6 = new int[] { ' ', (short) -1, 10, (-1), 10, 1 };
        int[] intArray9 = ds.MaxMin4.maxMin4(intArray6, 0, (int) (short) 0);
        int[] intArray12 = ds.MaxMin4.maxMin4(intArray9, (int) (byte) 0, 0);
        int[] intArray15 = ds.MaxMin4.maxMin4(intArray9, (int) (short) 0, (int) (short) 0);
        int[] intArray18 = ds.MaxMin4.maxMin4(intArray15, 0, 1);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray21 = ds.MaxMin4.maxMin4(intArray15, (int) ' ', (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[32, -1, 10, -1, 10, 1]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[32, 32]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[32, 32]");
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[32, 32]");
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray18), "[32, 32]");
    }

    @Test
    public void test2101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2101");
        int[] intArray6 = new int[] { ' ', (short) -1, 10, (-1), 10, 1 };
        int[] intArray9 = ds.MaxMin4.maxMin4(intArray6, 0, (int) (short) 0);
        int[] intArray12 = ds.MaxMin4.maxMin4(intArray9, (int) (byte) 1, (int) (short) 0);
        int[] intArray15 = ds.MaxMin4.maxMin4(intArray12, (int) (short) 0, (int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray18 = ds.MaxMin4.maxMin4(intArray15, (int) 'a', (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[32, -1, 10, -1, 10, 1]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[32, 32]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[32, 32]");
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[32, 32]");
    }

    @Test
    public void test2102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2102");
        int[] intArray4 = new int[] { (byte) 1, 10, (byte) -1, ' ' };
        int[] intArray7 = ds.MaxMin4.maxMin4(intArray4, (int) (short) 0, (int) (short) 0);
        int[] intArray10 = ds.MaxMin4.maxMin4(intArray4, (int) (short) 0, 0);
        int[] intArray13 = ds.MaxMin4.maxMin4(intArray4, 1, 1);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray16 = ds.MaxMin4.maxMin4(intArray13, 1, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[1, 10, -1, 32]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[10, 10]");
    }

    @Test
    public void test2103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2103");
        int[] intArray6 = new int[] { ' ', (short) -1, 10, (-1), 10, 1 };
        int[] intArray9 = ds.MaxMin4.maxMin4(intArray6, 0, (int) (short) 0);
        int[] intArray12 = ds.MaxMin4.maxMin4(intArray6, (int) (byte) 1, (int) (short) 1);
        int[] intArray15 = ds.MaxMin4.maxMin4(intArray12, 0, (int) (short) 0);
        int[] intArray18 = ds.MaxMin4.maxMin4(intArray15, 0, 0);
        int[] intArray21 = ds.MaxMin4.maxMin4(intArray15, (int) (short) 0, (int) (byte) 0);
        int[] intArray24 = ds.MaxMin4.maxMin4(intArray15, 0, (int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray27 = ds.MaxMin4.maxMin4(intArray15, (-1), (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[32, -1, 10, -1, 10, 1]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[32, 32]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray18), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray21), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray24), "[-1, -1]");
    }

    @Test
    public void test2104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2104");
        int[] intArray6 = new int[] { ' ', (short) -1, 10, (-1), 10, 1 };
        int[] intArray9 = ds.MaxMin4.maxMin4(intArray6, 0, (int) (short) 0);
        int[] intArray12 = ds.MaxMin4.maxMin4(intArray6, (int) (byte) 1, (int) (short) 1);
        int[] intArray15 = ds.MaxMin4.maxMin4(intArray12, 1, 0);
        int[] intArray18 = ds.MaxMin4.maxMin4(intArray15, 0, 0);
        int[] intArray21 = ds.MaxMin4.maxMin4(intArray18, 1, 0);
        int[] intArray24 = ds.MaxMin4.maxMin4(intArray18, (int) (short) 1, 0);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray27 = ds.MaxMin4.maxMin4(intArray18, (int) (byte) 1, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[32, -1, 10, -1, 10, 1]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[32, 32]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray18), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray21), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray24), "[-1, -1]");
    }

    @Test
    public void test2105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2105");
        int[] intArray4 = new int[] { (byte) 1, 10, (byte) -1, ' ' };
        int[] intArray7 = ds.MaxMin4.maxMin4(intArray4, (int) (short) 0, (int) (short) 0);
        int[] intArray10 = ds.MaxMin4.maxMin4(intArray4, 0, 0);
        int[] intArray13 = ds.MaxMin4.maxMin4(intArray4, 0, (int) (byte) 1);
        int[] intArray16 = ds.MaxMin4.maxMin4(intArray4, 0, (int) (byte) 1);
        int[] intArray19 = ds.MaxMin4.maxMin4(intArray16, 1, (int) (short) 0);
        int[] intArray22 = ds.MaxMin4.maxMin4(intArray16, (int) (short) 0, 0);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray25 = ds.MaxMin4.maxMin4(intArray22, (int) '4', (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[1, 10, -1, 32]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[10, 1]");
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray16), "[10, 1]");
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray19), "[10, 1]");
        org.junit.Assert.assertNotNull(intArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray22), "[10, 10]");
    }

    @Test
    public void test2106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2106");
        int[] intArray6 = new int[] { ' ', (short) -1, 10, (-1), 10, 1 };
        int[] intArray9 = ds.MaxMin4.maxMin4(intArray6, 0, (int) (short) 0);
        int[] intArray12 = ds.MaxMin4.maxMin4(intArray9, (int) (byte) 0, 0);
        int[] intArray15 = ds.MaxMin4.maxMin4(intArray9, (int) (short) 0, (int) (short) 0);
        int[] intArray18 = ds.MaxMin4.maxMin4(intArray15, 0, (int) (short) 1);
        int[] intArray21 = ds.MaxMin4.maxMin4(intArray18, 0, 0);
        int[] intArray24 = ds.MaxMin4.maxMin4(intArray18, 1, (int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray27 = ds.MaxMin4.maxMin4(intArray24, (int) (byte) 1, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[32, -1, 10, -1, 10, 1]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[32, 32]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[32, 32]");
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[32, 32]");
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray18), "[32, 32]");
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray21), "[32, 32]");
        org.junit.Assert.assertNotNull(intArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray24), "[32, 32]");
    }

    @Test
    public void test2107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2107");
        int[] intArray6 = new int[] { ' ', (short) -1, 10, (-1), 10, 1 };
        int[] intArray9 = ds.MaxMin4.maxMin4(intArray6, 0, (int) (short) 0);
        int[] intArray12 = ds.MaxMin4.maxMin4(intArray9, 0, (int) (short) 1);
        int[] intArray15 = ds.MaxMin4.maxMin4(intArray12, (int) (byte) 1, (int) (short) 1);
        int[] intArray18 = ds.MaxMin4.maxMin4(intArray12, (int) (byte) 1, (int) (byte) 0);
        int[] intArray21 = ds.MaxMin4.maxMin4(intArray12, 0, 0);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray24 = ds.MaxMin4.maxMin4(intArray21, (int) (byte) 0, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[32, -1, 10, -1, 10, 1]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[32, 32]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[32, 32]");
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[32, 32]");
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray18), "[32, 32]");
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray21), "[32, 32]");
    }

    @Test
    public void test2108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2108");
        int[] intArray6 = new int[] { ' ', (short) -1, 10, (-1), 10, 1 };
        int[] intArray9 = ds.MaxMin4.maxMin4(intArray6, 0, (int) (short) 0);
        int[] intArray12 = ds.MaxMin4.maxMin4(intArray6, (int) (byte) 1, (int) (short) 1);
        int[] intArray15 = ds.MaxMin4.maxMin4(intArray12, (int) (byte) 0, 1);
        int[] intArray18 = ds.MaxMin4.maxMin4(intArray12, 0, 0);
        int[] intArray21 = ds.MaxMin4.maxMin4(intArray12, (int) (byte) 0, (int) (short) 1);
        int[] intArray24 = ds.MaxMin4.maxMin4(intArray21, (int) (byte) 0, 1);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray27 = ds.MaxMin4.maxMin4(intArray21, (int) (byte) 10, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[32, -1, 10, -1, 10, 1]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[32, 32]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray18), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray21), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray24), "[-1, -1]");
    }

    @Test
    public void test2109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2109");
        int[] intArray6 = new int[] { ' ', (short) -1, 10, (-1), 10, 1 };
        int[] intArray9 = ds.MaxMin4.maxMin4(intArray6, 0, (int) (short) 0);
        int[] intArray12 = ds.MaxMin4.maxMin4(intArray9, 0, (int) (short) 1);
        int[] intArray15 = ds.MaxMin4.maxMin4(intArray9, 0, (int) (byte) 0);
        int[] intArray18 = ds.MaxMin4.maxMin4(intArray15, 1, 0);
        int[] intArray21 = ds.MaxMin4.maxMin4(intArray15, (int) (byte) 0, (int) (byte) 0);
        int[] intArray24 = ds.MaxMin4.maxMin4(intArray15, (int) (byte) 0, (int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray27 = ds.MaxMin4.maxMin4(intArray15, (int) 'a', 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[32, -1, 10, -1, 10, 1]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[32, 32]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[32, 32]");
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[32, 32]");
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray18), "[32, 32]");
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray21), "[32, 32]");
        org.junit.Assert.assertNotNull(intArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray24), "[32, 32]");
    }

    @Test
    public void test2110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2110");
        int[] intArray0 = null;
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray3 = ds.MaxMin4.maxMin4(intArray0, (int) 'a', (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2111");
        int[] intArray6 = new int[] { ' ', (short) -1, 10, (-1), 10, 1 };
        int[] intArray9 = ds.MaxMin4.maxMin4(intArray6, 0, (int) (short) 0);
        int[] intArray12 = ds.MaxMin4.maxMin4(intArray6, (int) (byte) 1, (int) (short) 1);
        int[] intArray15 = ds.MaxMin4.maxMin4(intArray12, 1, 0);
        int[] intArray18 = ds.MaxMin4.maxMin4(intArray15, 0, 0);
        int[] intArray21 = ds.MaxMin4.maxMin4(intArray18, 1, 0);
        int[] intArray24 = ds.MaxMin4.maxMin4(intArray18, (int) (short) 1, 0);
        int[] intArray27 = ds.MaxMin4.maxMin4(intArray24, 0, (int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray30 = ds.MaxMin4.maxMin4(intArray24, 100, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[32, -1, 10, -1, 10, 1]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[32, 32]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray18), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray21), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray24), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray27), "[-1, -1]");
    }

    @Test
    public void test2112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2112");
        int[] intArray6 = new int[] { ' ', (short) -1, 10, (-1), 10, 1 };
        int[] intArray9 = ds.MaxMin4.maxMin4(intArray6, 0, (int) (short) 0);
        int[] intArray12 = ds.MaxMin4.maxMin4(intArray9, (int) (byte) 1, (int) (short) 0);
        int[] intArray15 = ds.MaxMin4.maxMin4(intArray12, 0, (int) (short) 0);
        int[] intArray18 = ds.MaxMin4.maxMin4(intArray12, (int) (byte) 0, 0);
        int[] intArray21 = ds.MaxMin4.maxMin4(intArray12, (int) (short) 1, (int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray24 = ds.MaxMin4.maxMin4(intArray21, (int) (short) -1, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[32, -1, 10, -1, 10, 1]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[32, 32]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[32, 32]");
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[32, 32]");
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray18), "[32, 32]");
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray21), "[32, 32]");
    }

    @Test
    public void test2113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2113");
        int[] intArray6 = new int[] { ' ', (short) -1, 10, (-1), 10, 1 };
        int[] intArray9 = ds.MaxMin4.maxMin4(intArray6, 0, (int) (short) 0);
        int[] intArray12 = ds.MaxMin4.maxMin4(intArray6, (int) (byte) 1, (int) (short) 1);
        int[] intArray15 = ds.MaxMin4.maxMin4(intArray12, 0, (int) (short) 0);
        int[] intArray18 = ds.MaxMin4.maxMin4(intArray15, 1, (int) (byte) 1);
        int[] intArray21 = ds.MaxMin4.maxMin4(intArray18, (int) (short) 0, 0);
        java.lang.Class<?> wildcardClass22 = intArray18.getClass();
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[32, -1, 10, -1, 10, 1]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[32, 32]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray18), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray21), "[-1, -1]");
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test2114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2114");
        int[] intArray4 = new int[] { (byte) 1, 10, (byte) -1, ' ' };
        int[] intArray7 = ds.MaxMin4.maxMin4(intArray4, (int) (short) 0, (int) (short) 0);
        int[] intArray10 = ds.MaxMin4.maxMin4(intArray4, 0, 0);
        int[] intArray13 = ds.MaxMin4.maxMin4(intArray4, 0, (int) (byte) 1);
        int[] intArray16 = ds.MaxMin4.maxMin4(intArray4, 0, (int) (byte) 1);
        int[] intArray19 = ds.MaxMin4.maxMin4(intArray4, (int) (short) 0, 0);
        int[] intArray22 = ds.MaxMin4.maxMin4(intArray19, (int) (short) 1, 0);
        int[] intArray25 = ds.MaxMin4.maxMin4(intArray19, (int) (byte) 0, (int) (short) 1);
        int[] intArray28 = ds.MaxMin4.maxMin4(intArray19, 1, 0);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray31 = ds.MaxMin4.maxMin4(intArray28, (int) (byte) -1, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[1, 10, -1, 32]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[10, 1]");
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray16), "[10, 1]");
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray19), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray22), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray25), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray28);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray28), "[1, 1]");
    }

    @Test
    public void test2115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2115");
        int[] intArray4 = new int[] { (byte) 1, 10, (byte) -1, ' ' };
        int[] intArray7 = ds.MaxMin4.maxMin4(intArray4, (int) (short) 0, (int) (short) 0);
        int[] intArray10 = ds.MaxMin4.maxMin4(intArray4, 0, 0);
        int[] intArray13 = ds.MaxMin4.maxMin4(intArray4, 0, (int) (byte) 1);
        int[] intArray16 = ds.MaxMin4.maxMin4(intArray4, 0, (int) (byte) 1);
        int[] intArray19 = ds.MaxMin4.maxMin4(intArray16, 1, (int) (short) 0);
        int[] intArray22 = ds.MaxMin4.maxMin4(intArray16, 0, 0);
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[1, 10, -1, 32]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[10, 1]");
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray16), "[10, 1]");
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray19), "[10, 1]");
        org.junit.Assert.assertNotNull(intArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray22), "[10, 10]");
    }

    @Test
    public void test2116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2116");
        int[] intArray6 = new int[] { ' ', (short) -1, 10, (-1), 10, 1 };
        int[] intArray9 = ds.MaxMin4.maxMin4(intArray6, 0, (int) (short) 0);
        int[] intArray12 = ds.MaxMin4.maxMin4(intArray9, (int) (byte) 0, (int) (byte) 1);
        int[] intArray15 = ds.MaxMin4.maxMin4(intArray12, 0, (int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray18 = ds.MaxMin4.maxMin4(intArray12, (int) '#', (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[32, -1, 10, -1, 10, 1]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[32, 32]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[32, 32]");
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[32, 32]");
    }

    @Test
    public void test2117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2117");
        int[] intArray6 = new int[] { ' ', (short) -1, 10, (-1), 10, 1 };
        int[] intArray9 = ds.MaxMin4.maxMin4(intArray6, 0, (int) (short) 0);
        int[] intArray12 = ds.MaxMin4.maxMin4(intArray9, (int) (byte) 0, 0);
        int[] intArray15 = ds.MaxMin4.maxMin4(intArray9, (int) (short) 0, (int) (short) 0);
        int[] intArray18 = ds.MaxMin4.maxMin4(intArray15, 0, (int) (short) 1);
        int[] intArray21 = ds.MaxMin4.maxMin4(intArray18, 0, 0);
        int[] intArray24 = ds.MaxMin4.maxMin4(intArray18, (int) (short) 0, 0);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray27 = ds.MaxMin4.maxMin4(intArray24, (int) ' ', (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[32, -1, 10, -1, 10, 1]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[32, 32]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[32, 32]");
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[32, 32]");
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray18), "[32, 32]");
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray21), "[32, 32]");
        org.junit.Assert.assertNotNull(intArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray24), "[32, 32]");
    }

    @Test
    public void test2118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2118");
        int[] intArray6 = new int[] { ' ', (short) -1, 10, (-1), 10, 1 };
        int[] intArray9 = ds.MaxMin4.maxMin4(intArray6, 0, (int) (short) 0);
        int[] intArray12 = ds.MaxMin4.maxMin4(intArray9, 0, (int) (short) 1);
        int[] intArray15 = ds.MaxMin4.maxMin4(intArray12, (int) (byte) 1, (int) (short) 1);
        int[] intArray18 = ds.MaxMin4.maxMin4(intArray12, (int) (byte) 1, (int) (byte) 0);
        int[] intArray21 = ds.MaxMin4.maxMin4(intArray12, (int) (short) 0, 0);
        int[] intArray24 = ds.MaxMin4.maxMin4(intArray12, 0, (int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray27 = ds.MaxMin4.maxMin4(intArray12, 100, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[32, -1, 10, -1, 10, 1]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[32, 32]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[32, 32]");
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[32, 32]");
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray18), "[32, 32]");
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray21), "[32, 32]");
        org.junit.Assert.assertNotNull(intArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray24), "[32, 32]");
    }

    @Test
    public void test2119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2119");
        int[] intArray6 = new int[] { ' ', (short) -1, 10, (-1), 10, 1 };
        int[] intArray9 = ds.MaxMin4.maxMin4(intArray6, 0, (int) (short) 0);
        int[] intArray12 = ds.MaxMin4.maxMin4(intArray9, (int) (byte) 1, (int) (short) 0);
        int[] intArray15 = ds.MaxMin4.maxMin4(intArray12, 0, (int) (short) 0);
        int[] intArray18 = ds.MaxMin4.maxMin4(intArray12, (int) (byte) 0, 0);
        int[] intArray21 = ds.MaxMin4.maxMin4(intArray18, (int) (byte) 0, (int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray24 = ds.MaxMin4.maxMin4(intArray18, (int) (byte) -1, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[32, -1, 10, -1, 10, 1]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[32, 32]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[32, 32]");
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[32, 32]");
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray18), "[32, 32]");
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray21), "[32, 32]");
    }

    @Test
    public void test2120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2120");
        int[] intArray6 = new int[] { ' ', (short) -1, 10, (-1), 10, 1 };
        int[] intArray9 = ds.MaxMin4.maxMin4(intArray6, 0, (int) (short) 0);
        int[] intArray12 = ds.MaxMin4.maxMin4(intArray9, 0, (int) (short) 1);
        int[] intArray15 = ds.MaxMin4.maxMin4(intArray12, (int) (byte) 1, (int) (short) 1);
        int[] intArray18 = ds.MaxMin4.maxMin4(intArray15, 0, (int) (short) 1);
        int[] intArray21 = ds.MaxMin4.maxMin4(intArray18, 1, 0);
        int[] intArray24 = ds.MaxMin4.maxMin4(intArray21, 1, (int) (short) 0);
        int[] intArray27 = ds.MaxMin4.maxMin4(intArray24, (int) (short) 0, 1);
        int[] intArray30 = ds.MaxMin4.maxMin4(intArray27, (int) (short) 0, 0);
        int[] intArray33 = ds.MaxMin4.maxMin4(intArray27, 0, 0);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray36 = ds.MaxMin4.maxMin4(intArray27, (int) (byte) 100, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[32, -1, 10, -1, 10, 1]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[32, 32]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[32, 32]");
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[32, 32]");
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray18), "[32, 32]");
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray21), "[32, 32]");
        org.junit.Assert.assertNotNull(intArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray24), "[32, 32]");
        org.junit.Assert.assertNotNull(intArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray27), "[32, 32]");
        org.junit.Assert.assertNotNull(intArray30);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray30), "[32, 32]");
        org.junit.Assert.assertNotNull(intArray33);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray33), "[32, 32]");
    }

    @Test
    public void test2121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2121");
        int[] intArray6 = new int[] { ' ', (short) -1, 10, (-1), 10, 1 };
        int[] intArray9 = ds.MaxMin4.maxMin4(intArray6, 0, (int) (short) 0);
        int[] intArray12 = ds.MaxMin4.maxMin4(intArray9, 0, (int) (short) 1);
        int[] intArray15 = ds.MaxMin4.maxMin4(intArray12, (int) (byte) 1, (int) (short) 1);
        int[] intArray18 = ds.MaxMin4.maxMin4(intArray15, 0, (int) (short) 1);
        int[] intArray21 = ds.MaxMin4.maxMin4(intArray15, 1, 0);
        int[] intArray24 = ds.MaxMin4.maxMin4(intArray15, (int) (short) 0, 1);
        int[] intArray27 = ds.MaxMin4.maxMin4(intArray24, 0, 1);
        int[] intArray30 = ds.MaxMin4.maxMin4(intArray27, 0, (int) (short) 1);
        int[] intArray33 = ds.MaxMin4.maxMin4(intArray27, 0, 1);
        int[] intArray36 = ds.MaxMin4.maxMin4(intArray27, 0, 1);
        int[] intArray39 = ds.MaxMin4.maxMin4(intArray36, (int) (byte) 0, 0);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray42 = ds.MaxMin4.maxMin4(intArray36, (int) '4', (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[32, -1, 10, -1, 10, 1]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[32, 32]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[32, 32]");
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[32, 32]");
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray18), "[32, 32]");
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray21), "[32, 32]");
        org.junit.Assert.assertNotNull(intArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray24), "[32, 32]");
        org.junit.Assert.assertNotNull(intArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray27), "[32, 32]");
        org.junit.Assert.assertNotNull(intArray30);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray30), "[32, 32]");
        org.junit.Assert.assertNotNull(intArray33);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray33), "[32, 32]");
        org.junit.Assert.assertNotNull(intArray36);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray36), "[32, 32]");
        org.junit.Assert.assertNotNull(intArray39);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray39), "[32, 32]");
    }

    @Test
    public void test2122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2122");
        int[] intArray4 = new int[] { (byte) 1, 10, (byte) -1, ' ' };
        int[] intArray7 = ds.MaxMin4.maxMin4(intArray4, (int) (short) 0, (int) (short) 0);
        int[] intArray10 = ds.MaxMin4.maxMin4(intArray4, 0, 0);
        int[] intArray13 = ds.MaxMin4.maxMin4(intArray10, (int) (short) 0, (int) (byte) 0);
        int[] intArray16 = ds.MaxMin4.maxMin4(intArray13, (int) (short) 1, (int) (byte) 1);
        int[] intArray19 = ds.MaxMin4.maxMin4(intArray16, 0, 0);
        int[] intArray22 = ds.MaxMin4.maxMin4(intArray19, (int) (byte) 0, (int) (short) 1);
        int[] intArray25 = ds.MaxMin4.maxMin4(intArray19, 0, (int) (byte) 1);
        int[] intArray28 = ds.MaxMin4.maxMin4(intArray25, (int) (short) 0, (int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray31 = ds.MaxMin4.maxMin4(intArray28, (int) (short) 100, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[1, 10, -1, 32]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray16), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray19), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray22), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray25), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray28);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray28), "[1, 1]");
    }

    @Test
    public void test2123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2123");
        int[] intArray6 = new int[] { ' ', (short) -1, 10, (-1), 10, 1 };
        int[] intArray9 = ds.MaxMin4.maxMin4(intArray6, 0, (int) (short) 0);
        int[] intArray12 = ds.MaxMin4.maxMin4(intArray9, 0, (int) (short) 1);
        int[] intArray15 = ds.MaxMin4.maxMin4(intArray12, (int) (byte) 1, (int) (short) 1);
        int[] intArray18 = ds.MaxMin4.maxMin4(intArray12, (int) (byte) 1, (int) (byte) 0);
        int[] intArray21 = ds.MaxMin4.maxMin4(intArray18, 0, 0);
        int[] intArray24 = ds.MaxMin4.maxMin4(intArray21, 0, 1);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray27 = ds.MaxMin4.maxMin4(intArray21, (int) (byte) 100, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[32, -1, 10, -1, 10, 1]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[32, 32]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[32, 32]");
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[32, 32]");
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray18), "[32, 32]");
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray21), "[32, 32]");
        org.junit.Assert.assertNotNull(intArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray24), "[32, 32]");
    }

    @Test
    public void test2124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2124");
        int[] intArray6 = new int[] { ' ', (short) -1, 10, (-1), 10, 1 };
        int[] intArray9 = ds.MaxMin4.maxMin4(intArray6, 0, (int) (short) 0);
        int[] intArray12 = ds.MaxMin4.maxMin4(intArray9, 0, (int) (short) 1);
        int[] intArray15 = ds.MaxMin4.maxMin4(intArray12, (int) (byte) 1, (int) (short) 1);
        int[] intArray18 = ds.MaxMin4.maxMin4(intArray15, 0, (int) (short) 1);
        int[] intArray21 = ds.MaxMin4.maxMin4(intArray18, 1, 0);
        int[] intArray24 = ds.MaxMin4.maxMin4(intArray21, 1, (int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray27 = ds.MaxMin4.maxMin4(intArray24, (int) (byte) 10, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[32, -1, 10, -1, 10, 1]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[32, 32]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[32, 32]");
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[32, 32]");
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray18), "[32, 32]");
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray21), "[32, 32]");
        org.junit.Assert.assertNotNull(intArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray24), "[32, 32]");
    }

    @Test
    public void test2125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2125");
        int[] intArray0 = null;
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray3 = ds.MaxMin4.maxMin4(intArray0, 0, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2126");
        int[] intArray4 = new int[] { (byte) 1, 10, (byte) -1, ' ' };
        int[] intArray7 = ds.MaxMin4.maxMin4(intArray4, (int) (short) 0, (int) (short) 0);
        int[] intArray10 = ds.MaxMin4.maxMin4(intArray4, 0, 0);
        int[] intArray13 = ds.MaxMin4.maxMin4(intArray4, 0, (int) (byte) 1);
        int[] intArray16 = ds.MaxMin4.maxMin4(intArray4, 0, (int) (byte) 1);
        int[] intArray19 = ds.MaxMin4.maxMin4(intArray4, (int) (short) 0, 0);
        int[] intArray22 = ds.MaxMin4.maxMin4(intArray19, (int) (short) 1, 0);
        int[] intArray25 = ds.MaxMin4.maxMin4(intArray19, (int) (byte) 0, (int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray28 = ds.MaxMin4.maxMin4(intArray25, (int) (short) 0, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[1, 10, -1, 32]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[10, 1]");
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray16), "[10, 1]");
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray19), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray22), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray25), "[1, 1]");
    }

    @Test
    public void test2127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2127");
        int[] intArray6 = new int[] { ' ', (short) -1, 10, (-1), 10, 1 };
        int[] intArray9 = ds.MaxMin4.maxMin4(intArray6, 0, (int) (short) 0);
        int[] intArray12 = ds.MaxMin4.maxMin4(intArray9, (int) (byte) 0, (int) (byte) 1);
        int[] intArray15 = ds.MaxMin4.maxMin4(intArray12, 0, (int) (byte) 0);
        java.lang.Class<?> wildcardClass16 = intArray15.getClass();
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[32, -1, 10, -1, 10, 1]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[32, 32]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[32, 32]");
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[32, 32]");
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test2128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2128");
        int[] intArray4 = new int[] { (byte) 1, 10, (byte) -1, ' ' };
        int[] intArray7 = ds.MaxMin4.maxMin4(intArray4, (int) (short) 0, (int) (short) 0);
        int[] intArray10 = ds.MaxMin4.maxMin4(intArray4, 0, 0);
        int[] intArray13 = ds.MaxMin4.maxMin4(intArray4, 0, (int) (byte) 1);
        int[] intArray16 = ds.MaxMin4.maxMin4(intArray4, 0, (int) (byte) 1);
        int[] intArray19 = ds.MaxMin4.maxMin4(intArray4, (int) (short) 0, 0);
        int[] intArray22 = ds.MaxMin4.maxMin4(intArray19, (int) (short) 1, 0);
        int[] intArray25 = ds.MaxMin4.maxMin4(intArray22, 0, (int) (byte) 1);
        int[] intArray28 = ds.MaxMin4.maxMin4(intArray22, (int) (short) 0, 0);
        int[] intArray31 = ds.MaxMin4.maxMin4(intArray28, 1, (int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray34 = ds.MaxMin4.maxMin4(intArray31, (int) 'a', (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[1, 10, -1, 32]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[10, 1]");
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray16), "[10, 1]");
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray19), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray22), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray25), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray28);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray28), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray31);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray31), "[1, 1]");
    }

    @Test
    public void test2129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2129");
        int[] intArray0 = null;
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray3 = ds.MaxMin4.maxMin4(intArray0, (int) (byte) 1, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2130");
        int[] intArray6 = new int[] { ' ', (short) -1, 10, (-1), 10, 1 };
        int[] intArray9 = ds.MaxMin4.maxMin4(intArray6, 0, (int) (short) 0);
        int[] intArray12 = ds.MaxMin4.maxMin4(intArray6, 0, 0);
        int[] intArray15 = ds.MaxMin4.maxMin4(intArray12, (int) (byte) 0, (int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray18 = ds.MaxMin4.maxMin4(intArray15, (int) (short) 0, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[32, -1, 10, -1, 10, 1]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[32, 32]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[32, 32]");
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[32, 32]");
    }

    @Test
    public void test2131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2131");
        int[] intArray6 = new int[] { ' ', (short) -1, 10, (-1), 10, 1 };
        int[] intArray9 = ds.MaxMin4.maxMin4(intArray6, 0, (int) (short) 0);
        int[] intArray12 = ds.MaxMin4.maxMin4(intArray6, (int) (byte) 1, (int) (short) 1);
        int[] intArray15 = ds.MaxMin4.maxMin4(intArray12, 1, 0);
        int[] intArray18 = ds.MaxMin4.maxMin4(intArray15, 0, 0);
        int[] intArray21 = ds.MaxMin4.maxMin4(intArray18, 1, 0);
        int[] intArray24 = ds.MaxMin4.maxMin4(intArray18, (int) (short) 1, 0);
        int[] intArray27 = ds.MaxMin4.maxMin4(intArray18, 0, (int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray30 = ds.MaxMin4.maxMin4(intArray18, (int) (byte) 10, (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[32, -1, 10, -1, 10, 1]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[32, 32]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray18), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray21), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray24), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray27), "[-1, -1]");
    }

    @Test
    public void test2132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2132");
        int[] intArray6 = new int[] { ' ', (short) -1, 10, (-1), 10, 1 };
        int[] intArray9 = ds.MaxMin4.maxMin4(intArray6, 0, (int) (short) 0);
        int[] intArray12 = ds.MaxMin4.maxMin4(intArray6, (int) (byte) 1, (int) (short) 1);
        int[] intArray15 = ds.MaxMin4.maxMin4(intArray12, 1, 0);
        int[] intArray18 = ds.MaxMin4.maxMin4(intArray15, 1, 1);
        int[] intArray21 = ds.MaxMin4.maxMin4(intArray18, (int) (short) 0, (int) (short) 1);
        int[] intArray24 = ds.MaxMin4.maxMin4(intArray21, (int) (short) 1, (int) (byte) 0);
        java.lang.Class<?> wildcardClass25 = intArray24.getClass();
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[32, -1, 10, -1, 10, 1]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[32, 32]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray18), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray21), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray24), "[-1, -1]");
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test2133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2133");
        int[] intArray4 = new int[] { (byte) 1, 10, (byte) -1, ' ' };
        int[] intArray7 = ds.MaxMin4.maxMin4(intArray4, (int) (short) 0, (int) (short) 0);
        int[] intArray10 = ds.MaxMin4.maxMin4(intArray4, 0, 0);
        int[] intArray13 = ds.MaxMin4.maxMin4(intArray10, (int) (short) 0, (int) (byte) 0);
        int[] intArray16 = ds.MaxMin4.maxMin4(intArray13, (int) (short) 1, (int) (byte) 1);
        int[] intArray19 = ds.MaxMin4.maxMin4(intArray16, 0, 0);
        int[] intArray22 = ds.MaxMin4.maxMin4(intArray19, (int) (byte) 0, (int) (short) 1);
        int[] intArray25 = ds.MaxMin4.maxMin4(intArray22, (int) (short) 0, 0);
        int[] intArray28 = ds.MaxMin4.maxMin4(intArray25, (int) (byte) 1, (int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray31 = ds.MaxMin4.maxMin4(intArray28, (int) '4', (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[1, 10, -1, 32]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray16), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray19), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray22), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray25), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray28);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray28), "[1, 1]");
    }

    @Test
    public void test2134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2134");
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
    public void test2135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2135");
        int[] intArray6 = new int[] { ' ', (short) -1, 10, (-1), 10, 1 };
        int[] intArray9 = ds.MaxMin4.maxMin4(intArray6, 0, (int) (short) 0);
        int[] intArray12 = ds.MaxMin4.maxMin4(intArray9, 0, (int) (short) 1);
        int[] intArray15 = ds.MaxMin4.maxMin4(intArray9, 0, (int) (byte) 0);
        int[] intArray18 = ds.MaxMin4.maxMin4(intArray9, 0, 0);
        int[] intArray21 = ds.MaxMin4.maxMin4(intArray18, (int) (byte) 1, (int) (byte) 0);
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[32, -1, 10, -1, 10, 1]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[32, 32]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[32, 32]");
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[32, 32]");
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray18), "[32, 32]");
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray21), "[32, 32]");
    }

    @Test
    public void test2136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2136");
        int[] intArray4 = new int[] { (byte) 1, 10, (byte) -1, ' ' };
        int[] intArray7 = ds.MaxMin4.maxMin4(intArray4, (int) (short) 0, (int) (short) 0);
        int[] intArray10 = ds.MaxMin4.maxMin4(intArray4, 0, 0);
        int[] intArray13 = ds.MaxMin4.maxMin4(intArray10, (int) (short) 0, (int) (byte) 0);
        int[] intArray16 = ds.MaxMin4.maxMin4(intArray13, (int) (short) 1, (int) (byte) 1);
        int[] intArray19 = ds.MaxMin4.maxMin4(intArray16, 0, 0);
        int[] intArray22 = ds.MaxMin4.maxMin4(intArray19, (int) (byte) 0, (int) (short) 1);
        int[] intArray25 = ds.MaxMin4.maxMin4(intArray22, (int) (short) 0, 0);
        int[] intArray28 = ds.MaxMin4.maxMin4(intArray25, (int) (byte) 1, (int) (short) 0);
        int[] intArray31 = ds.MaxMin4.maxMin4(intArray28, 0, 0);
        java.lang.Class<?> wildcardClass32 = intArray28.getClass();
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[1, 10, -1, 32]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray16), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray19), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray22), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray25), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray28);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray28), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray31);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray31), "[1, 1]");
        org.junit.Assert.assertNotNull(wildcardClass32);
    }

    @Test
    public void test2137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2137");
        int[] intArray6 = new int[] { ' ', (short) -1, 10, (-1), 10, 1 };
        int[] intArray9 = ds.MaxMin4.maxMin4(intArray6, 0, (int) (short) 0);
        int[] intArray12 = ds.MaxMin4.maxMin4(intArray9, (int) (byte) 0, 0);
        int[] intArray15 = ds.MaxMin4.maxMin4(intArray9, (int) (short) 0, (int) (short) 0);
        int[] intArray18 = ds.MaxMin4.maxMin4(intArray9, (int) (byte) 1, (int) (byte) 0);
        int[] intArray21 = ds.MaxMin4.maxMin4(intArray9, (int) (short) 0, 0);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray24 = ds.MaxMin4.maxMin4(intArray21, (int) (short) -1, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[32, -1, 10, -1, 10, 1]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[32, 32]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[32, 32]");
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[32, 32]");
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray18), "[32, 32]");
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray21), "[32, 32]");
    }

    @Test
    public void test2138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2138");
        int[] intArray6 = new int[] { ' ', (short) -1, 10, (-1), 10, 1 };
        int[] intArray9 = ds.MaxMin4.maxMin4(intArray6, 0, (int) (short) 0);
        int[] intArray12 = ds.MaxMin4.maxMin4(intArray9, (int) (byte) 1, (int) (short) 0);
        int[] intArray15 = ds.MaxMin4.maxMin4(intArray12, 0, (int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray18 = ds.MaxMin4.maxMin4(intArray12, (int) (short) -1, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[32, -1, 10, -1, 10, 1]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[32, 32]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[32, 32]");
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[32, 32]");
    }

    @Test
    public void test2139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2139");
        int[] intArray6 = new int[] { ' ', (short) -1, 10, (-1), 10, 1 };
        int[] intArray9 = ds.MaxMin4.maxMin4(intArray6, 0, (int) (short) 0);
        int[] intArray12 = ds.MaxMin4.maxMin4(intArray9, 0, (int) (short) 1);
        int[] intArray15 = ds.MaxMin4.maxMin4(intArray12, (int) (byte) 1, (int) (short) 1);
        int[] intArray18 = ds.MaxMin4.maxMin4(intArray15, 0, (int) (short) 1);
        int[] intArray21 = ds.MaxMin4.maxMin4(intArray18, 1, 0);
        int[] intArray24 = ds.MaxMin4.maxMin4(intArray21, 1, (int) (short) 0);
        int[] intArray27 = ds.MaxMin4.maxMin4(intArray24, (int) (short) 0, 1);
        int[] intArray30 = ds.MaxMin4.maxMin4(intArray27, (int) (short) 0, 0);
        int[] intArray33 = ds.MaxMin4.maxMin4(intArray27, 0, 0);
        int[] intArray36 = ds.MaxMin4.maxMin4(intArray27, (int) (short) 0, (int) (byte) 0);
        int[] intArray39 = ds.MaxMin4.maxMin4(intArray36, (int) (short) 1, (int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray42 = ds.MaxMin4.maxMin4(intArray39, (int) (byte) -1, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[32, -1, 10, -1, 10, 1]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[32, 32]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[32, 32]");
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[32, 32]");
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray18), "[32, 32]");
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray21), "[32, 32]");
        org.junit.Assert.assertNotNull(intArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray24), "[32, 32]");
        org.junit.Assert.assertNotNull(intArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray27), "[32, 32]");
        org.junit.Assert.assertNotNull(intArray30);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray30), "[32, 32]");
        org.junit.Assert.assertNotNull(intArray33);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray33), "[32, 32]");
        org.junit.Assert.assertNotNull(intArray36);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray36), "[32, 32]");
        org.junit.Assert.assertNotNull(intArray39);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray39), "[32, 32]");
    }

    @Test
    public void test2140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2140");
        int[] intArray4 = new int[] { (byte) 1, 10, (byte) -1, ' ' };
        int[] intArray7 = ds.MaxMin4.maxMin4(intArray4, (int) (short) 0, (int) (short) 0);
        int[] intArray10 = ds.MaxMin4.maxMin4(intArray4, 0, 0);
        int[] intArray13 = ds.MaxMin4.maxMin4(intArray4, 0, (int) (byte) 1);
        int[] intArray16 = ds.MaxMin4.maxMin4(intArray4, 0, (int) (byte) 1);
        int[] intArray19 = ds.MaxMin4.maxMin4(intArray4, (int) (short) 0, 0);
        int[] intArray22 = ds.MaxMin4.maxMin4(intArray19, (int) (short) 1, 0);
        int[] intArray25 = ds.MaxMin4.maxMin4(intArray19, (int) (byte) 0, (int) (short) 1);
        int[] intArray28 = ds.MaxMin4.maxMin4(intArray25, (int) (short) 1, (int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray31 = ds.MaxMin4.maxMin4(intArray25, (int) (byte) 10, (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[1, 10, -1, 32]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[10, 1]");
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray16), "[10, 1]");
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray19), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray22), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray25), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray28);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray28), "[1, 1]");
    }

    @Test
    public void test2141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2141");
        int[] intArray4 = new int[] { (byte) 1, 10, (byte) -1, ' ' };
        int[] intArray7 = ds.MaxMin4.maxMin4(intArray4, (int) (short) 0, (int) (short) 0);
        int[] intArray10 = ds.MaxMin4.maxMin4(intArray4, (int) (short) 0, 0);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray13 = ds.MaxMin4.maxMin4(intArray10, (int) (byte) 100, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[1, 10, -1, 32]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[1, 1]");
    }

    @Test
    public void test2142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2142");
        int[] intArray6 = new int[] { ' ', (short) -1, 10, (-1), 10, 1 };
        int[] intArray9 = ds.MaxMin4.maxMin4(intArray6, 0, (int) (short) 0);
        int[] intArray12 = ds.MaxMin4.maxMin4(intArray6, (int) (byte) 1, (int) (short) 1);
        int[] intArray15 = ds.MaxMin4.maxMin4(intArray12, 1, 0);
        int[] intArray18 = ds.MaxMin4.maxMin4(intArray15, 1, 1);
        int[] intArray21 = ds.MaxMin4.maxMin4(intArray15, (int) (byte) 1, (int) (byte) 1);
        int[] intArray24 = ds.MaxMin4.maxMin4(intArray15, (int) (byte) 1, (int) (short) 1);
        java.lang.Class<?> wildcardClass25 = intArray15.getClass();
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[32, -1, 10, -1, 10, 1]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[32, 32]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray18), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray21), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray24), "[-1, -1]");
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test2143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2143");
        int[] intArray6 = new int[] { ' ', (short) -1, 10, (-1), 10, 1 };
        int[] intArray9 = ds.MaxMin4.maxMin4(intArray6, 0, (int) (short) 0);
        int[] intArray12 = ds.MaxMin4.maxMin4(intArray6, (int) (byte) 1, (int) (short) 1);
        int[] intArray15 = ds.MaxMin4.maxMin4(intArray12, 1, 0);
        int[] intArray18 = ds.MaxMin4.maxMin4(intArray15, 0, 0);
        int[] intArray21 = ds.MaxMin4.maxMin4(intArray18, 1, 0);
        int[] intArray24 = ds.MaxMin4.maxMin4(intArray18, (int) (short) 1, 0);
        int[] intArray27 = ds.MaxMin4.maxMin4(intArray24, 0, (int) (short) 0);
        int[] intArray30 = ds.MaxMin4.maxMin4(intArray27, (int) (byte) 0, (int) (short) 0);
        int[] intArray33 = ds.MaxMin4.maxMin4(intArray27, (int) (short) 0, (int) (short) 1);
        int[] intArray36 = ds.MaxMin4.maxMin4(intArray33, (int) (byte) 0, 1);
        int[] intArray39 = ds.MaxMin4.maxMin4(intArray36, 0, 1);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray42 = ds.MaxMin4.maxMin4(intArray36, (int) 'a', (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[32, -1, 10, -1, 10, 1]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[32, 32]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray18), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray21), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray24), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray27), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray30);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray30), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray33);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray33), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray36);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray36), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray39);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray39), "[-1, -1]");
    }

    @Test
    public void test2144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2144");
        int[] intArray4 = new int[] { (byte) 1, 10, (byte) -1, ' ' };
        int[] intArray7 = ds.MaxMin4.maxMin4(intArray4, (int) (short) 0, (int) (short) 0);
        int[] intArray10 = ds.MaxMin4.maxMin4(intArray4, 0, 0);
        int[] intArray13 = ds.MaxMin4.maxMin4(intArray4, 0, (int) (byte) 1);
        int[] intArray16 = ds.MaxMin4.maxMin4(intArray4, 0, (int) (byte) 1);
        int[] intArray19 = ds.MaxMin4.maxMin4(intArray16, 1, (int) (short) 0);
        int[] intArray22 = ds.MaxMin4.maxMin4(intArray16, (int) (short) 0, 0);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray25 = ds.MaxMin4.maxMin4(intArray22, (int) ' ', (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[1, 10, -1, 32]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[10, 1]");
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray16), "[10, 1]");
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray19), "[10, 1]");
        org.junit.Assert.assertNotNull(intArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray22), "[10, 10]");
    }

    @Test
    public void test2145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2145");
        int[] intArray4 = new int[] { (byte) 1, 10, (byte) -1, ' ' };
        int[] intArray7 = ds.MaxMin4.maxMin4(intArray4, (int) (short) 0, (int) (short) 0);
        int[] intArray10 = ds.MaxMin4.maxMin4(intArray4, 0, 0);
        int[] intArray13 = ds.MaxMin4.maxMin4(intArray10, (int) (short) 0, (int) (byte) 0);
        int[] intArray16 = ds.MaxMin4.maxMin4(intArray13, (int) (short) 1, (int) (byte) 1);
        int[] intArray19 = ds.MaxMin4.maxMin4(intArray13, (int) (byte) 0, (int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray22 = ds.MaxMin4.maxMin4(intArray19, (int) '#', (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[1, 10, -1, 32]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray16), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray19), "[1, 1]");
    }

    @Test
    public void test2146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2146");
        int[] intArray6 = new int[] { ' ', (short) -1, 10, (-1), 10, 1 };
        int[] intArray9 = ds.MaxMin4.maxMin4(intArray6, 0, (int) (short) 0);
        int[] intArray12 = ds.MaxMin4.maxMin4(intArray9, (int) (byte) 0, (int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray15 = ds.MaxMin4.maxMin4(intArray9, (int) (byte) -1, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[32, -1, 10, -1, 10, 1]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[32, 32]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[32, 32]");
    }

    @Test
    public void test2147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2147");
        int[] intArray6 = new int[] { ' ', (short) -1, 10, (-1), 10, 1 };
        int[] intArray9 = ds.MaxMin4.maxMin4(intArray6, 0, (int) (short) 0);
        int[] intArray12 = ds.MaxMin4.maxMin4(intArray9, 0, (int) (short) 1);
        int[] intArray15 = ds.MaxMin4.maxMin4(intArray12, (int) (byte) 1, (int) (short) 1);
        int[] intArray18 = ds.MaxMin4.maxMin4(intArray12, (int) (byte) 1, (int) (byte) 0);
        int[] intArray21 = ds.MaxMin4.maxMin4(intArray12, 0, 0);
        int[] intArray24 = ds.MaxMin4.maxMin4(intArray21, (int) (byte) 0, (int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray27 = ds.MaxMin4.maxMin4(intArray24, 0, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[32, -1, 10, -1, 10, 1]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[32, 32]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[32, 32]");
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[32, 32]");
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray18), "[32, 32]");
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray21), "[32, 32]");
        org.junit.Assert.assertNotNull(intArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray24), "[32, 32]");
    }

    @Test
    public void test2148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2148");
        int[] intArray6 = new int[] { ' ', (short) -1, 10, (-1), 10, 1 };
        int[] intArray9 = ds.MaxMin4.maxMin4(intArray6, 0, (int) (short) 0);
        int[] intArray12 = ds.MaxMin4.maxMin4(intArray6, (int) (byte) 1, (int) (short) 1);
        int[] intArray15 = ds.MaxMin4.maxMin4(intArray12, 0, (int) (short) 0);
        int[] intArray18 = ds.MaxMin4.maxMin4(intArray15, 0, 0);
        int[] intArray21 = ds.MaxMin4.maxMin4(intArray15, (int) (short) 0, (int) (byte) 0);
        int[] intArray24 = ds.MaxMin4.maxMin4(intArray15, 0, (int) (byte) 1);
        int[] intArray27 = ds.MaxMin4.maxMin4(intArray24, (int) (byte) 0, (int) (short) 1);
        java.lang.Class<?> wildcardClass28 = intArray27.getClass();
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[32, -1, 10, -1, 10, 1]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[32, 32]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray18), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray21), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray24), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray27), "[-1, -1]");
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test2149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2149");
        int[] intArray4 = new int[] { (byte) 1, 10, (byte) -1, ' ' };
        int[] intArray7 = ds.MaxMin4.maxMin4(intArray4, (int) (short) 0, (int) (short) 0);
        int[] intArray10 = ds.MaxMin4.maxMin4(intArray4, 0, 0);
        int[] intArray13 = ds.MaxMin4.maxMin4(intArray10, (int) (short) 0, (int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray16 = ds.MaxMin4.maxMin4(intArray10, (int) (short) -1, 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[1, 10, -1, 32]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[1, 1]");
    }

    @Test
    public void test2150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2150");
        int[] intArray6 = new int[] { ' ', (short) -1, 10, (-1), 10, 1 };
        int[] intArray9 = ds.MaxMin4.maxMin4(intArray6, 0, (int) (short) 0);
        int[] intArray12 = ds.MaxMin4.maxMin4(intArray6, (int) (byte) 1, (int) (short) 1);
        int[] intArray15 = ds.MaxMin4.maxMin4(intArray12, 0, (int) (short) 0);
        int[] intArray18 = ds.MaxMin4.maxMin4(intArray15, 0, 0);
        int[] intArray21 = ds.MaxMin4.maxMin4(intArray15, (int) (short) 0, (int) (byte) 0);
        int[] intArray24 = ds.MaxMin4.maxMin4(intArray15, 0, (int) (byte) 1);
        int[] intArray27 = ds.MaxMin4.maxMin4(intArray24, (int) (short) 0, (int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray30 = ds.MaxMin4.maxMin4(intArray27, (int) ' ', (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[32, -1, 10, -1, 10, 1]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[32, 32]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray18), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray21), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray24), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray27), "[-1, -1]");
    }

    @Test
    public void test2151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2151");
        int[] intArray6 = new int[] { ' ', (short) -1, 10, (-1), 10, 1 };
        int[] intArray9 = ds.MaxMin4.maxMin4(intArray6, 0, (int) (short) 0);
        int[] intArray12 = ds.MaxMin4.maxMin4(intArray9, (int) (byte) 1, (int) (short) 0);
        int[] intArray15 = ds.MaxMin4.maxMin4(intArray12, 0, (int) (short) 0);
        int[] intArray18 = ds.MaxMin4.maxMin4(intArray12, (int) (byte) 0, 0);
        int[] intArray21 = ds.MaxMin4.maxMin4(intArray18, (int) (byte) 0, (int) (byte) 1);
        int[] intArray24 = ds.MaxMin4.maxMin4(intArray18, (int) (short) 0, 0);
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[32, -1, 10, -1, 10, 1]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[32, 32]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[32, 32]");
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[32, 32]");
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray18), "[32, 32]");
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray21), "[32, 32]");
        org.junit.Assert.assertNotNull(intArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray24), "[32, 32]");
    }

    @Test
    public void test2152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2152");
        int[] intArray6 = new int[] { ' ', (short) -1, 10, (-1), 10, 1 };
        int[] intArray9 = ds.MaxMin4.maxMin4(intArray6, 0, (int) (short) 0);
        int[] intArray12 = ds.MaxMin4.maxMin4(intArray9, (int) (byte) 0, 0);
        int[] intArray15 = ds.MaxMin4.maxMin4(intArray9, (int) (short) 0, (int) (short) 0);
        int[] intArray18 = ds.MaxMin4.maxMin4(intArray15, 0, (int) (short) 1);
        int[] intArray21 = ds.MaxMin4.maxMin4(intArray18, 0, 0);
        int[] intArray24 = ds.MaxMin4.maxMin4(intArray18, 1, (int) (short) 1);
        int[] intArray27 = ds.MaxMin4.maxMin4(intArray24, 0, (int) (byte) 0);
        java.lang.Class<?> wildcardClass28 = intArray27.getClass();
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[32, -1, 10, -1, 10, 1]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[32, 32]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[32, 32]");
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[32, 32]");
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray18), "[32, 32]");
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray21), "[32, 32]");
        org.junit.Assert.assertNotNull(intArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray24), "[32, 32]");
        org.junit.Assert.assertNotNull(intArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray27), "[32, 32]");
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test2153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2153");
        int[] intArray6 = new int[] { ' ', (short) -1, 10, (-1), 10, 1 };
        int[] intArray9 = ds.MaxMin4.maxMin4(intArray6, 0, (int) (short) 0);
        int[] intArray12 = ds.MaxMin4.maxMin4(intArray9, 0, (int) (short) 1);
        int[] intArray15 = ds.MaxMin4.maxMin4(intArray12, (int) (byte) 1, (int) (short) 1);
        int[] intArray18 = ds.MaxMin4.maxMin4(intArray15, 0, (int) (short) 1);
        int[] intArray21 = ds.MaxMin4.maxMin4(intArray15, 1, 0);
        int[] intArray24 = ds.MaxMin4.maxMin4(intArray15, (int) (short) 0, (int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray27 = ds.MaxMin4.maxMin4(intArray24, (-1), 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[32, -1, 10, -1, 10, 1]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[32, 32]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[32, 32]");
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[32, 32]");
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray18), "[32, 32]");
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray21), "[32, 32]");
        org.junit.Assert.assertNotNull(intArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray24), "[32, 32]");
    }

    @Test
    public void test2154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2154");
        int[] intArray6 = new int[] { ' ', (short) -1, 10, (-1), 10, 1 };
        int[] intArray9 = ds.MaxMin4.maxMin4(intArray6, 0, (int) (short) 0);
        int[] intArray12 = ds.MaxMin4.maxMin4(intArray6, (int) (byte) 1, (int) (short) 1);
        int[] intArray15 = ds.MaxMin4.maxMin4(intArray12, (int) (byte) 0, 1);
        int[] intArray18 = ds.MaxMin4.maxMin4(intArray12, 0, 0);
        int[] intArray21 = ds.MaxMin4.maxMin4(intArray12, (int) (byte) 0, (int) (short) 1);
        int[] intArray24 = ds.MaxMin4.maxMin4(intArray12, (int) (short) 1, 0);
        java.lang.Class<?> wildcardClass25 = intArray12.getClass();
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[32, -1, 10, -1, 10, 1]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[32, 32]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray18), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray21), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray24), "[-1, -1]");
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test2155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2155");
        int[] intArray6 = new int[] { ' ', (short) -1, 10, (-1), 10, 1 };
        int[] intArray9 = ds.MaxMin4.maxMin4(intArray6, 0, (int) (short) 0);
        int[] intArray12 = ds.MaxMin4.maxMin4(intArray6, (int) (byte) 1, (int) (short) 1);
        int[] intArray15 = ds.MaxMin4.maxMin4(intArray12, 1, 0);
        int[] intArray18 = ds.MaxMin4.maxMin4(intArray15, 1, 1);
        int[] intArray21 = ds.MaxMin4.maxMin4(intArray18, (int) (short) 0, (int) (short) 1);
        int[] intArray24 = ds.MaxMin4.maxMin4(intArray18, (int) (short) 0, (int) (short) 1);
        int[] intArray27 = ds.MaxMin4.maxMin4(intArray18, 1, (int) (byte) 1);
        int[] intArray30 = ds.MaxMin4.maxMin4(intArray27, (int) (byte) 0, 0);
        int[] intArray33 = ds.MaxMin4.maxMin4(intArray30, 0, 0);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray36 = ds.MaxMin4.maxMin4(intArray30, (int) '#', (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[32, -1, 10, -1, 10, 1]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[32, 32]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray18), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray21), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray24), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray27), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray30);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray30), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray33);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray33), "[-1, -1]");
    }

    @Test
    public void test2156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2156");
        int[] intArray6 = new int[] { ' ', (short) -1, 10, (-1), 10, 1 };
        int[] intArray9 = ds.MaxMin4.maxMin4(intArray6, 0, (int) (short) 0);
        int[] intArray12 = ds.MaxMin4.maxMin4(intArray6, (int) (byte) 1, (int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray15 = ds.MaxMin4.maxMin4(intArray6, (int) 'a', (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[32, -1, 10, -1, 10, 1]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[32, 32]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[-1, -1]");
    }

    @Test
    public void test2157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2157");
        int[] intArray4 = new int[] { (byte) 1, 10, (byte) -1, ' ' };
        int[] intArray7 = ds.MaxMin4.maxMin4(intArray4, (int) (short) 0, (int) (short) 0);
        int[] intArray10 = ds.MaxMin4.maxMin4(intArray4, 0, 0);
        int[] intArray13 = ds.MaxMin4.maxMin4(intArray4, 0, (int) (byte) 1);
        int[] intArray16 = ds.MaxMin4.maxMin4(intArray4, 0, (int) (byte) 1);
        int[] intArray19 = ds.MaxMin4.maxMin4(intArray16, 1, (int) (short) 0);
        int[] intArray22 = ds.MaxMin4.maxMin4(intArray16, (int) (short) 0, 0);
        java.lang.Class<?> wildcardClass23 = intArray22.getClass();
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[1, 10, -1, 32]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[10, 1]");
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray16), "[10, 1]");
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray19), "[10, 1]");
        org.junit.Assert.assertNotNull(intArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray22), "[10, 10]");
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test2158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2158");
        int[] intArray6 = new int[] { ' ', (short) -1, 10, (-1), 10, 1 };
        int[] intArray9 = ds.MaxMin4.maxMin4(intArray6, 0, (int) (short) 0);
        int[] intArray12 = ds.MaxMin4.maxMin4(intArray9, (int) (byte) 0, 0);
        int[] intArray15 = ds.MaxMin4.maxMin4(intArray9, (int) (short) 0, (int) (short) 0);
        int[] intArray18 = ds.MaxMin4.maxMin4(intArray15, 0, 1);
        int[] intArray21 = ds.MaxMin4.maxMin4(intArray15, (int) (byte) 0, 0);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray24 = ds.MaxMin4.maxMin4(intArray15, (int) ' ', (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[32, -1, 10, -1, 10, 1]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[32, 32]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[32, 32]");
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[32, 32]");
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray18), "[32, 32]");
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray21), "[32, 32]");
    }

    @Test
    public void test2159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2159");
        int[] intArray4 = new int[] { (byte) 1, 10, (byte) -1, ' ' };
        int[] intArray7 = ds.MaxMin4.maxMin4(intArray4, (int) (short) 0, (int) (short) 0);
        int[] intArray10 = ds.MaxMin4.maxMin4(intArray4, 0, 0);
        int[] intArray13 = ds.MaxMin4.maxMin4(intArray10, (int) (short) 0, (int) (byte) 0);
        int[] intArray16 = ds.MaxMin4.maxMin4(intArray13, (int) (short) 1, (int) (byte) 1);
        int[] intArray19 = ds.MaxMin4.maxMin4(intArray16, 0, 0);
        int[] intArray22 = ds.MaxMin4.maxMin4(intArray19, (int) (byte) 0, (int) (short) 1);
        int[] intArray25 = ds.MaxMin4.maxMin4(intArray22, (int) (short) 0, 0);
        int[] intArray28 = ds.MaxMin4.maxMin4(intArray25, (int) (byte) 1, (int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray31 = ds.MaxMin4.maxMin4(intArray25, (int) (byte) 100, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[1, 10, -1, 32]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray16), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray19), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray22), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray25), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray28);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray28), "[1, 1]");
    }

    @Test
    public void test2160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop4.test2160");
        int[] intArray6 = new int[] { ' ', (short) -1, 10, (-1), 10, 1 };
        int[] intArray9 = ds.MaxMin4.maxMin4(intArray6, 0, (int) (short) 0);
        int[] intArray12 = ds.MaxMin4.maxMin4(intArray9, 0, (int) (short) 1);
        int[] intArray15 = ds.MaxMin4.maxMin4(intArray12, (int) (byte) 1, (int) (short) 1);
        int[] intArray18 = ds.MaxMin4.maxMin4(intArray15, 0, (int) (short) 1);
        int[] intArray21 = ds.MaxMin4.maxMin4(intArray18, (int) (short) 1, 0);
        java.lang.Class<?> wildcardClass22 = intArray21.getClass();
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[32, -1, 10, -1, 10, 1]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[32, 32]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[32, 32]");
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[32, 32]");
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray18), "[32, 32]");
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray21), "[32, 32]");
        org.junit.Assert.assertNotNull(wildcardClass22);
    }
}

